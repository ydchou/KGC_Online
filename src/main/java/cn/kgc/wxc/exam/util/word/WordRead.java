package cn.kgc.wxc.exam.util.word;

import cn.kgc.wxc.exam.entity.Itembank;
import org.apache.poi.hwpf.HWPFDocument;
import org.apache.poi.hwpf.usermodel.*;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFTable;
import org.apache.poi.xwpf.usermodel.XWPFTableCell;
import org.apache.poi.xwpf.usermodel.XWPFTableRow;

import java.io.*;
import java.util.Iterator;
import java.util.List;

public class WordRead {
    public static void main(String[] args) {
        WordRead test = new WordRead();
        //String filePath="E:\\java导入word表格.doc";
        String filePath = "E:\\07.docx";
        test.testWord(filePath);
    }

    public String reSetFliePath(String filePath) {
        String newPath = filePath.split("\\.")[0] + ".doc";
        InputStream in = null;
        OutputStream out = null;
        File file = new File(filePath);
            FileReader fr = null;
            FileWriter fw = null;
            int len = 0;
            try {
                fr = new FileReader("d:/a.txt");
                fw = new FileWriter("d:/d.txt");
                //为了提高效率，创建缓冲用的字符数组
                char[] buffer = new char[1024];
                //边读边写
                while ((len = fr.read(buffer)) != -1) {
                    fw.write(buffer, 0, len);
                }
            } catch (Exception e) {
                System.out.println("文件读写错误");
            } finally {
                try {
                    file.delete();

                    if (fw != null) {
                        fw.close();
                    }

                    if (fr != null) {
                        fr.close();
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        return newPath;
    }

    public void testWord(String filePath){
        String itme = "";

        try{
            //载入文档
            FileInputStream in = new FileInputStream(filePath);
            //如果是office2007  docx格式
            if(filePath.toLowerCase().endsWith("docx")){
                //word 2007 图片不会被读取， 表格中的数据会被放在字符串的最后
                //得到word文档的信息
                XWPFDocument xwpf = new XWPFDocument(in);
//		    	 List<XWPFParagraph> listParagraphs = xwpf.getParagraphs();//得到段落信息
                //得到word中的表格
                Iterator<XWPFTable> it = xwpf.getTablesIterator();
                while(it.hasNext()){
                    XWPFTable table = it.next();
                    List<XWPFTableRow> rows=table.getRows();
                    //读取每一行数据
                    for (int i = 0; i < rows.size(); i++) {
                        XWPFTableRow  row = rows.get(i);
                        //读取每一列数据
                        List<XWPFTableCell> cells = row.getTableCells();
                        for (int j = 0; j < cells.size(); j++) {
                            XWPFTableCell cell=cells.get(j);
                            //输出当前的单元格的数据
                            if( cell.getText()!=null && !cell.getText().equals("") && j%2!=0){
                                itme += cell.getText() + "|----theEnd----|";
                            }
                        }
                    }
                }
            }else{
                //如果是office2003  doc格式
                POIFSFileSystem pfs = new POIFSFileSystem(in);
                HWPFDocument hwpf = new HWPFDocument(pfs);
                Range range = hwpf.getRange();//得到文档的读取范围
                TableIterator it = new TableIterator(range);
                //迭代文档中的表格
                while (it.hasNext()) {
                    Table tb = (Table) it.next();
                    //迭代行，默认从0开始
                    for (int i = 0; i < tb.numRows()-2; i++) {
                        TableRow tr = tb.getRow(i);
                        //迭代列，默认从0开始
                        for (int j = 0; j < tr.numCells(); j++) {
                            TableCell td = tr.getCell(j);//取得单元格
                            //取得单元格的内容
                            for(int k=0;k<td.numParagraphs();k++){
                                Paragraph para =td.getParagraph(k);
                                String s = para.text();
                                //去除后面的特殊符号
                                if(null!=s&&!"".equals(s)){
                                    s=s.substring(0, s.length()-1);
                                }
                                if (!s.equals("") && k%2!=0){
                                    itme += s + "|----theEnd----|";
                                }
                            }
                        }
                    }
                }
            }

            String[] args = itme.split("\\|----theEnd----\\|");
            for (int i =0 ; i < args.length;i+=10){
                Itembank itembank  =new Itembank(new Integer(args[i+0]),args[i+1],new Integer(args[i+2].equals("单选题")?0:1),args[i+3],args[i+4],args[i+5],args[i+6],args[i+7],args[i+8],args[i+9]);

            }



        }catch(Exception e){
            e.printStackTrace();
        }

    }

}
