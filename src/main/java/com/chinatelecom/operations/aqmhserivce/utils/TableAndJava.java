package com.chinatelecom.operations.aqmhserivce.utils;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.*;

public class TableAndJava {
    private static String temp = "";

    public static void Table2Java(String packageName, String tableName) {
        temp = "";

        try {
            // 1、数据库连接
            Connection conn = JdbcUtils.getConn();
            PreparedStatement ps = conn.prepareStatement("select * from " + tableName);

            ResultSet rs = ps.executeQuery();/* executeQuery 返回结果集*/
            ResultSetMetaData rsmd = rs.getMetaData();/*metadata元数据*/
            //2.开始拼接数据
            /*拼接实体类开头*/
            createClassFront(packageName, tableName);
            //循环表中的列
            for (int i = 1; i <=rsmd.getColumnCount(); i++) {
                /*拼接实体类属性*/
                createFlied(rsmd.getColumnName(i), rsmd.getColumnClassName(i));
            }
            //3.拼接结束
            temp += "}\t\n";
            /*后台打印*/
            System.out.println(temp);
            // 4、使用io流写入
            writeClass(packageName, tableName);
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
    private static void writeClass(String packageName, String tableName) {/*创建文件*/

        File dir =new File(packageName.replace(".", "/"));
        if(!dir.exists()){/*文件是否存在*/
            dir.mkdirs();/*不存在创建*/
        }
//        File targetFile=new File(dir, firstCharToUpper())
        File targetFile = new File(dir,firstCharToUpper(tableName)+".java");
        try {
            FileWriter fw = new FileWriter(targetFile);
            fw.write(temp);
            fw.flush();
            fw.close();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
    //set方法
    // public void setBook_id(int book_id) {
    //        this.book_id = book_id;}
    private static void createSet(String columnName, String columnClassName) {
        temp += "\tpublic void set" + firstCharToUpper(columnName) + "(" + columnClassName +" "+columnName.toLowerCase()+ "){\t\n";
        temp += "\t\tthis." + columnName.toLowerCase() + " = " + columnName .toLowerCase()+ ";}\t\n";
    }

    //get方法
    // public int getBook_id() {
    //        return book_id;}
    private static void createGet(String columnName, String columnClassName) {
        temp += "\tpublic " + columnClassName + " "+" get" + firstCharToUpper(columnName) + "(){\t\n";
        temp += "\t\treturn " + columnName .toLowerCase()+ ";}\t\n";

    }

    private static void createFlied(String columnName, String columnClassName) {
        StringBuilder sb;
        if(columnName.contains("_")){
            sb=new StringBuilder();
            String[] split = columnName.split("_");
            sb.append(split[0]);
            for (int i=1;i<split.length;i++){
                sb.append(split[i].substring(0, 1).toUpperCase());
                sb.append(split[i].substring(1).toLowerCase());
            }
            columnName= sb.toString();
        }
        temp += "\tprivate " + columnClassName + " " + columnName+ ";\t\n";
    }

    public static void createClassFront(String packageName, String tableName) {
        temp += "package " + packageName + ";\t\n";
        temp += "public class " + firstCharToUpper(tableName) + "{\t\n";
    }

    //将数据库中拿到的列名首字母转化为小写
    private static Object firstCharToUpper(String tableName) {
        String newt = tableName.toLowerCase();/*toLowerCase()全部转为小写*/
        char[] chars = newt.toCharArray();/*toCharArray()将此字符串转换为新的字符数组。*/
        chars[0] = (char) (chars[0] - ('a' - 'A'));
        return new String(chars);

    }
    public static void main(String[] args) {
        Table2Java("entity","intf_soc_jixian");
    }

}
