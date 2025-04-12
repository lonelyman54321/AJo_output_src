/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import com.appsflyer.internal.AFb1iSDK;
import com.appsflyer.internal.AFd1nSDK;
import com.appsflyer.internal.AFd1qSDK;
import com.appsflyer.internal.AFd1rSDK;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Locale;
import java.util.Map;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import org.json.JSONObject;

public final class AFb1jSDK {
    private static String AFAdRevenueData(byte[] byArray) {
        StringBuilder stringBuilder = new StringBuilder();
        int n3 = byArray.length;
        for (int i3 = 0; i3 < n3; ++i3) {
            int n4 = (byArray[i3] & 0xFF) + 256;
            String string2 = Integer.toString(n4, 16);
            int n7 = 1;
            string2 = string2.substring(n7);
            stringBuilder.append(string2);
        }
        return ((Object)stringBuilder).toString();
    }

    public static boolean getMediationNetwork(Map object, String[] object2, AFd1qSDK object3) {
        int n3;
        Object object4 = null;
        if (object != null && (n3 = object.isEmpty()) == 0) {
            n3 = ((String[])object2).length;
            JSONObject jSONObject = null;
            for (int i3 = 0; i3 < n3; ++i3) {
                String string2 = object2[i3];
                boolean bl2 = object.containsKey(string2);
                if (bl2) continue;
                return false;
            }
            object2 = (String)object.remove("sig");
            if (object2 == null) {
                return false;
            }
            object4 = AFd1qSDK.areAllFieldsValid();
            StringBuilder stringBuilder = new StringBuilder();
            jSONObject = new JSONObject((Map)object);
            stringBuilder.append(jSONObject);
            stringBuilder.append((String)object4);
            object = ((Object)stringBuilder).toString();
            object4 = ((AFd1qSDK)object3).getMonetizationNetwork;
            object3 = ((AFd1qSDK)object3).getRevenue;
            object3 = AFb1iSDK.getCurrencyIso4217Code((AFd1nSDK)object4, (AFd1rSDK)object3);
            return AFb1jSDK.getMonetizationNetwork((String)object, (String)object3).equals(object2);
        }
        return false;
    }

    private static byte[] getMediationNetwork(String object) {
        Object object2 = "SHA-256";
        try {
            object2 = MessageDigest.getInstance((String)object2);
        }
        catch (Exception exception) {
            AFLogger.afErrorLog("Error turning string to SHA-256 byte array", exception);
            return null;
        }
        Charset charset = Charset.defaultCharset();
        object = ((String)object).getBytes(charset);
        ((MessageDigest)object2).update((byte[])object);
        return ((MessageDigest)object2).digest();
    }

    public static String getMonetizationNetwork(String object) {
        Object object2 = "SHA-256";
        object2 = MessageDigest.getInstance((String)object2);
        Charset charset = Charset.defaultCharset();
        object = ((String)object).getBytes(charset);
        ((MessageDigest)object2).update((byte[])object);
        object = ((MessageDigest)object2).digest();
        try {
            object = AFb1jSDK.AFAdRevenueData((byte[])object);
        }
        catch (Exception exception) {
            object2 = "Error turning data to SHA-256 string";
            AFLogger.afErrorLog((String)object2, exception);
            object = null;
        }
        return object;
    }

    /*
     * WARNING - void declaration
     */
    public static String getMonetizationNetwork(String object, String object2) {
        void var0_3;
        String string2 = "HmacSHA256";
        Mac mac = Mac.getInstance(string2);
        Charset charset = Charset.defaultCharset();
        object2 = ((String)object2).getBytes(charset);
        SecretKeySpec secretKeySpec = new SecretKeySpec((byte[])object2, string2);
        mac.init(secretKeySpec);
        object2 = Charset.defaultCharset();
        object = ((String)object).getBytes((Charset)object2);
        object = mac.doFinal((byte[])object);
        object = AFb1jSDK.AFAdRevenueData((byte[])object);
        object2 = Locale.getDefault();
        try {
            return ((String)object).toLowerCase((Locale)object2);
        }
        catch (InvalidKeyException invalidKeyException) {
        }
        catch (NoSuchAlgorithmException noSuchAlgorithmException) {
            // empty catch block
        }
        AFLogger.afErrorLog(var0_3.getMessage(), (Throwable)var0_3, true);
        return var0_3.getMessage();
    }

    public static long getRevenue(String object) {
        long l2;
        int n3;
        if ((object = (Object)AFb1jSDK.getMediationNetwork((String)object)) != null && (n3 = ((Object)object).length) > 0) {
            ByteBuffer byteBuffer;
            n3 = ((Object)object).length;
            int n4 = 8;
            if (n3 > n4) {
                n3 = 0;
                byteBuffer = null;
                object = Arrays.copyOfRange((byte[])object, 0, n4);
            }
            byteBuffer = ByteBuffer.allocate(n4);
            byteBuffer.put((byte[])object);
            byteBuffer.flip();
            l2 = byteBuffer.getLong();
        } else {
            l2 = -1;
        }
        return l2;
    }
}

