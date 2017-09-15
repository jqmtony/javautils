package com.wind.common;

/**
 * 字节工具类
 */
public class ByteUtils {

    /**
     * 二进制转16进制字符串
     * @param bytes
     * @return
     */
    public static String byteToHex(byte[] bytes) {

        // 首先初始化一个字符数组，用来存放每个16进制字符
        String hexStr = Const.HEX_STR;

        char[] arr = new char[bytes.length * 2];
        // 遍历字节数组，通过位运算（位运算效率高），转换成字符放到字符数组中去
        int index = 0;
        for (byte b : bytes) {
            arr[index++] = hexStr.charAt(b >>> 4 & 0xf);
            arr[index++] = hexStr.charAt(b & 0xf);
        }
        // 字符数组组合成字符串返回
        return new String(arr);
    }

    public static String byteToStr(byte[] bytes){
        String str = "";
        for(byte b : bytes){

        }
        return str;
    }


    /**
     * 十六进制字符串转换成字节数组
     * @param hex
     * @return
     */
    public static byte[] hexToByte(String hex){
        char[] chars = hex.toCharArray();
        byte[] bytes = new byte[chars.length / 2];
        for(char c : chars){

        }
        return bytes;
    }





    public static void main(String[] args) {

    }

}
