package cn.kgc.wxc.exam.util;

import org.apache.poi.hwpf.HWPFDocument;
import org.apache.poi.hwpf.usermodel.*;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;

import java.io.FileInputStream;

/**
 * @Author: wxc
 * @Date:Created in 23:24 2020/8/5
 */
public class Word {
    public static void main(String[] args) {
//        //doc文档路径
//        String filePath = "C:\\Users\\autu\\Desktop\\test.doc";
//        //test.print(filePath,"第一个表");
//
//        System.out.println(App.read(filePath,"第一个表"));;
    }

    /**
     * 读取文档中表格
     * @param filePath doc路径
     *
     */
    public static String read(String filePath,String tableName) {

        StringBuilder sb=new StringBuilder();


        try (FileInputStream in = new FileInputStream(filePath); // 载入文档
             POIFSFileSystem pfs = new POIFSFileSystem(in);
             HWPFDocument hwpf = new HWPFDocument(pfs);) {

            Range range = hwpf.getRange();// 得到文档的读取范围
            TableIterator it = new TableIterator(range);
            // 迭代文档中的表格

            while (it.hasNext()) {
                Table tb = (Table) it.next();

                // 迭代行，默认从0开始,可以依据需要设置i的值,改变起始行数，也可设置读取到那行，只需修改循环的判断条件即可
                outer:for (int i = 0; i < tb.numRows(); i++) {
                    TableRow tr = tb.getRow(i);
                    // 迭代列，默认从0开始
                    for (int j = 0; j < tr.numCells(); j++) {
                        TableCell td = tr.getCell(j);// 取得单元格
                        // 取得单元格的内容
                        for (int k = 0; k < td.numParagraphs(); k++) {
                            Paragraph para = td.getParagraph(k);
                            String s = para.text();
                            // 去除后面的特殊符号
                            if (null != s && !"".equals(s)) {
                                s = s.substring(0, s.length() - 1);
                            }
                            s=s.trim();
                            if(tableName.trim().equals(s)||i!=0) {
                                sb.append(s + "\t");
                            } else {
                                break outer;
                            }
                        }
                    }
                    sb.append( "\n");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return sb.toString();
    }
}
