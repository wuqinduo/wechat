package com.wuqinduo.web.util;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

/**
 *  微信服务器发送到 get 请求到 填写的 URL上，GET请求携带四个参数。
 *  
 *  自己的服务器对请求 ，通过校验算法 进行校验。确认本次 GET请求来之 微信服务器
 *  
 * @author yhcloud_user
 *
 */
public class SignUtil {

	private static String token ="wqd"; //在微信服务器上填写的 Token 
	
	public static boolean checkSignature(String signature, String timestamp, String nonce){
		/**
		 * 加密/校验流程如下：
			1. 将token、timestamp、nonce三个参数进行字典序排序
			2. 将三个参数字符串拼接成一个字符串进行sha1加密
			3. 开发者获得加密后的字符串可与signature对比，标识该请求来源于微信
		 */
		String[] arr = new String[] { token, timestamp, nonce };
		Arrays.sort(arr);
		StringBuilder content = new StringBuilder();
		for (int i = 0; i < arr.length; i++) {
			content.append(arr[i]);  
		}
		MessageDigest md =  null;
		String tmpStr = null;
		
		try {
			md = MessageDigest.getInstance("SHA-1");
			// 将三个参数字符串拼接成一个字符串进行sha1加密   
            byte[] digest = md.digest(content.toString().getBytes());  
            tmpStr = byteToStr(digest);  
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}
		content = null;  
        // 将sha1加密后的字符串可与signature对比，标识该请求来源于微信   
        return tmpStr != null ? tmpStr.equals(signature.toUpperCase()) : false;
	}
	
	/** 
     * 将字节数组转换为十六进制字符串 
     * @param byteArray 
     * @return 
     */  
    private static String byteToStr(byte[] byteArray) {  
        String strDigest = "";  
        for (int i = 0; i < byteArray.length; i++) {  
            strDigest += byteToHexStr(byteArray[i]);  
        }  
        return strDigest;  
    }  
    /** 
     * 将字节转换为十六进制字符串 
     * @param mByte 
     * @return 
     */  
    private static String byteToHexStr(byte mByte) {  
        char[] Digit = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F' };  
        char[] tempArr = new char[2];  
        tempArr[0] = Digit[(mByte >>> 4) & 0X0F];  
        tempArr[1] = Digit[mByte & 0X0F];  
        String s = new String(tempArr);  
        return s;  
    }  
	
}
