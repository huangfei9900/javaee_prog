package com.dao;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Calendar;

public class Log_Exception {
    public void writeEror_to_txt(String path, String content) throws IOException {
        File F = new File(path);
        //如果文件不存在,就动态创建文件
        if (!F.exists()) {
            F.createNewFile();
        }
        FileWriter fw = null;
        String writeDate = "时间:" + this.get_nowDate() + "---" + "error:" + content;
        try {
            //设置为:True,表示写入的时候追加数据
            fw = new FileWriter(F, true);
            //回车并换行
            fw.write(writeDate + "\r\n");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fw != null) {
                fw.close();
            }
        }
    }

    private String get_nowDate() {
        Calendar D=Calendar.getInstance();
        int year=0;
        int moth=0;
        int day=0;
        year=D.get(Calendar.YEAR);
        moth=D.get(Calendar.MONTH)+1;
        day=D.get(Calendar.DAY_OF_MONTH);
        String now_date=String.valueOf(year)+"-"+String.valueOf(moth)+"-"+String.valueOf(day);
        return now_date;


    }
}

