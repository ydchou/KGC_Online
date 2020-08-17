package cn.kgc.wxc.exam.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

/**
 * @Author: wxc
 * @Date:Created in 22:45 2020/8/10
 */

@Controller
@RequestMapping("Item")
public class ItemBankController {

    @ResponseBody
    public int add(String filePath){
        return 0;
    }

    @RequestMapping("t")
    public String toupload(){
        return "upload.jsp";
    }


    @RequestMapping("/upload")
    @ResponseBody
    public String upload(@RequestParam("file") MultipartFile file) {
        if (file.isEmpty()) {
            return "上传失败，请选择文件";
        }

        String fileName = file.getOriginalFilename();
        String filePath = "/Users/itinypocket/workspace/temp/";
        File dest = new File(filePath + fileName);
        try {
            file.transferTo(dest);
            System.out.println("上传成功");
            return "上传成功";
        } catch (IOException e) {
            System.out.println(e.getStackTrace());
        }
        return "上传失败！";
    }


}
