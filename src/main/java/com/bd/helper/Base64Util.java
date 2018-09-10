package com.bd.helper;

import org.apache.commons.codec.binary.Base64;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

public class Base64Util {

    private  static  String base64Hmac256(String payload, String secret) {
        try {
            Mac sha256Hmac = Mac.getInstance("HmacSHA256");
            SecretKeySpec secretKey = new SecretKeySpec(secret.getBytes("UTF-8"), "HmacSHA256");
            sha256Hmac.init(secretKey);
            return Base64.encodeBase64String(sha256Hmac.doFinal(payload.getBytes()));
        } catch (Exception ignored) {
            return "";
        }
    }
    public static boolean sign(String payload, String secret,String sign) {
        String payloadSign = base64Hmac256(payload, secret);
        if(sign.equals(payloadSign)) return true;
        return false;

    }
}
