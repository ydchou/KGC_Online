package cn.kgc.wxc.exam.util.face;

import java.io.File;
import java.io.IOException;

import static cn.kgc.wxc.exam.util.face.FaceSpot.FileToByte;

/**
 * @Author: wxc
 * @Date:Created in 0:11 2020/8/18
 */
public class FaceTest {
    public static void main(String[] args) throws IOException {
        String file = "";
        FaceSpot faceSpot = new FaceSpot();

        byte[] img =FileToByte(new File(file));
        System.out.println();
    }
}
