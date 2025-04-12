/*
 * Decompiled with CFR 0.152.
 */
package in.juspay.hypersdk.security;

import in.juspay.hyper.core.JuspayLogger;
import in.juspay.hypersdk.core.SdkTracker;
import in.juspay.hypersdk.security.JOSEUtils;
import in.juspay.hypersdk.utils.Utils;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.DigestInputStream;
import java.security.Key;
import java.security.KeyPair;
import java.security.KeyStore;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.interfaces.RSAPublicKey;
import java.util.HashMap;
import java.util.Map;
import java.util.zip.GZIPInputStream;
import javax.crypto.spec.SecretKeySpec;

public class EncryptionHelper {
    public static final String ENCRYPTED_VERSION = "v1";
    private static final String LOG_TAG = "EncryptionHelper";
    private static final String algorithm = "AES";
    private static final byte[] logsEntryRequirement;

    static {
        byte[] byArray;
        byte[] byArray2 = byArray = new byte[16];
        byte[] byArray3 = byArray;
        byArray2[0] = -52;
        byArray3[1] = 51;
        byArray2[2] = -68;
        byArray3[3] = -121;
        byArray2[4] = -44;
        byArray3[5] = -114;
        byArray2[6] = -59;
        byArray3[7] = -20;
        byArray2[8] = -79;
        byArray3[9] = 22;
        byArray2[10] = 34;
        byArray3[11] = -77;
        byArray2[12] = -48;
        byArray3[13] = -75;
        byArray2[14] = 45;
        byArray3[15] = 93;
        logsEntryRequirement = byArray;
    }

    public static String bytesToHexString(byte[] byArray) {
        StringBuilder stringBuilder = new StringBuilder();
        int n3 = byArray.length;
        for (int i3 = 0; i3 < n3; ++i3) {
            int n4;
            int n7 = byArray[i3] & 0xFF;
            String string2 = Integer.toHexString(n7);
            int n8 = string2.length();
            if (n8 == (n4 = 1)) {
                n8 = 48;
                stringBuilder.append((char)n8);
            }
            stringBuilder.append(string2);
        }
        return stringBuilder.toString();
    }

    public static byte[] decryptThenGunzip(byte[] byArray, String object) {
        try {
            byArray = EncryptionHelper.v1Decrypt(byArray);
        }
        catch (Exception exception) {
            SdkTracker.trackAndLogBootException(LOG_TAG, "action", "system", "helper", "Exception in decrypting", exception);
            object = new RuntimeException(exception);
            throw object;
        }
        return EncryptionHelper.gunzipContent(byArray);
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static Key generateKey() {
        IOException iOException;
        int n3;
        Object object = logsEntryRequirement;
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream((byte[])object);
        int n4 = ((InputStream)byteArrayInputStream).available();
        byte[] byArray = new byte[n4];
        int n7 = 0;
        String string2 = null;
        while ((n7 += (n3 = byteArrayInputStream.read(byArray))) < n4) {
        }
        object = new SecretKeySpec;
        string2 = algorithm;
        object(byArray, string2);
        ((InputStream)byteArrayInputStream).close();
        return object;
        catch (Throwable throwable) {
            try {
                ((InputStream)byteArrayInputStream).close();
                throw throwable;
            }
            catch (Throwable throwable2) {
                try {
                    throwable.addSuppressed(throwable2);
                    throw throwable;
                }
                catch (IOException iOException2) {
                    iOException = iOException2;
                }
            }
        }
        SdkTracker.trackAndLogBootException(LOG_TAG, "sdk", "system", "generate_key", null, iOException);
        return null;
    }

    private static KeyStore getAndroidKeyStore() {
        KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
        keyStore.load(null);
        return keyStore;
    }

    public static KeyPair getKeyPair(String object) {
        Object object2 = EncryptionHelper.getAndroidKeyStore();
        PrivateKey privateKey = (PrivateKey)((KeyStore)object2).getKey((String)object, null);
        object = ((KeyStore)object2).getCertificate((String)object).getPublicKey();
        object2 = new KeyPair((PublicKey)object, privateKey);
        return object2;
    }

    public static String getSHA256Hash(String object) {
        String string2 = "result is ";
        if (object == null) {
            return null;
        }
        Object object2 = "SHA-256";
        try {
            object2 = MessageDigest.getInstance((String)object2);
        }
        catch (NoSuchAlgorithmException noSuchAlgorithmException) {
            SdkTracker.trackAndLogBootException(LOG_TAG, "action", "system", "helper", "Exception caught trying to SHA-256 hash", noSuchAlgorithmException);
            return null;
        }
        object = ((String)object).getBytes();
        ((MessageDigest)object2).update((byte[])object);
        object = ((MessageDigest)object2).digest();
        object = EncryptionHelper.bytesToHexString((byte[])object);
        object2 = LOG_TAG;
        StringBuilder stringBuilder = new StringBuilder(string2);
        stringBuilder.append((String)object);
        string2 = stringBuilder.toString();
        JuspayLogger.d((String)object2, string2);
        return object;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static byte[] gunzipContent(byte[] object) {
        Object object2;
        IOException iOException2222222;
        block21: {
            int n3 = 1024;
            byte[] byArray = new byte[n3];
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream((byte[])object);
            {
                Throwable throwable3222222;
                block22: {
                    catch (IOException iOException2222222) {
                        break block21;
                    }
                    object = new ByteArrayOutputStream;
                    ((ByteArrayOutputStream)object)();
                    {
                        Throwable throwable22222222;
                        block23: {
                            catch (Throwable throwable3222222) {
                                break block22;
                            }
                            GZIPInputStream gZIPInputStream = new GZIPInputStream((InputStream)byteArrayInputStream, n3);
                            {
                                Throwable throwable42222222;
                                block24: {
                                    catch (Throwable throwable22222222) {
                                        break block23;
                                    }
                                    try {
                                        int n4;
                                        while ((n3 = ((InputStream)gZIPInputStream).read(byArray)) != (n4 = -1)) {
                                            n4 = 0;
                                            ((ByteArrayOutputStream)object).write(byArray, 0, n3);
                                        }
                                    }
                                    catch (Throwable throwable42222222) {
                                        break block24;
                                    }
                                    {
                                        gZIPInputStream.close();
                                        object2 = ((ByteArrayOutputStream)object).toByteArray();
                                    }
                                    {
                                        ((ByteArrayOutputStream)object).close();
                                    }
                                    {
                                        byteArrayInputStream.close();
                                        return object2;
                                    }
                                }
                                try {
                                    gZIPInputStream.close();
                                    throw throwable42222222;
                                }
                                catch (Throwable throwable5) {}
                                {
                                    throwable42222222.addSuppressed(throwable5);
                                    throw throwable42222222;
                                }
                            }
                        }
                        try {
                            ((ByteArrayOutputStream)object).close();
                            throw throwable22222222;
                        }
                        catch (Throwable throwable6) {}
                        {
                            throwable22222222.addSuppressed(throwable6);
                            throw throwable22222222;
                        }
                    }
                }
                try {
                    byteArrayInputStream.close();
                    throw throwable3222222;
                }
                catch (Throwable throwable7) {}
                {
                    throwable3222222.addSuppressed(throwable7);
                    throw throwable3222222;
                }
            }
        }
        SdkTracker.trackAndLogBootException(LOG_TAG, "action", "system", "helper", "Error while gunzipping", iOException2222222);
        object2 = new RuntimeException(iOException2222222);
        throw object2;
    }

    public static byte[] gzipThenEncrypt(byte[] object, RSAPublicKey object2) {
        block6: {
            object = Utils.gzipContent((byte[])object);
            String string2 = "{\"alg\":\"RSA-OAEP-256\",\"enc\":\"A256GCM\"}";
            object = JOSEUtils.jweEncrypt((byte[])object, string2, (RSAPublicKey)object2);
            object = JOSEUtils.constructPayload((HashMap)object);
            if (object == null) break block6;
            object2 = StandardCharsets.UTF_8;
            try {
                return ((String)object).getBytes((Charset)object2);
            }
            catch (Exception exception) {
                string2 = LOG_TAG;
                String string3 = "helper";
                String string4 = "Exception while GZipping and encrypting";
                String string5 = "action";
                String string6 = "system";
                SdkTracker.trackAndLogBootException(string2, string5, string6, string3, string4, exception);
            }
        }
        return null;
    }

    /*
     * WARNING - void declaration
     */
    public static byte[] gzipThenEncryptExp(byte[] object, RSAPublicKey object2, Map map2) {
        Exception exception2;
        block23: {
            block22: {
                void var2_8;
                Object object3;
                String string2;
                byte[] byArray;
                Object object4 = "cipherText";
                String string3 = "headers";
                String string4 = "authTag";
                String string5 = "iv";
                String string6 = "encryptedKey";
                try {
                    byArray = Utils.gzipContent(object);
                    string2 = "{\"alg\":\"RSA-OAEP-256\",\"enc\":\"A256GCM\"}";
                }
                catch (Exception exception2) {}
                HashMap hashMap = JOSEUtils.jweEncrypt(byArray, string2, (RSAPublicKey)object3);
                boolean bl2 = hashMap.containsKey(string3);
                if (!bl2) break block22;
                bl2 = hashMap.containsKey(string6);
                if (!bl2) break block22;
                bl2 = hashMap.containsKey(string5);
                if (!bl2) break block22;
                bl2 = hashMap.containsKey(object4);
                if (!bl2) break block22;
                bl2 = hashMap.containsKey(string4);
                if (!bl2) break block22;
                object3 = hashMap.get(string3);
                object3 = (String)object3;
                Object v4 = hashMap.get(string6);
                String string7 = (String)v4;
                Object v5 = hashMap.get(string5);
                String string8 = (String)v5;
                object4 = hashMap.get(object4);
                object4 = (byte[])object4;
                Object v7 = hashMap.get(string4);
                String string9 = (String)v7;
                if (object3 == null || string7 == null || string8 == null || object4 == null || string9 == null) break block22;
                String string10 = "protectedHeaders";
                var2_8.put(string10, object3);
                var2_8.put(string6, string7);
                var2_8.put(string5, string8);
                var2_8.put(string4, string9);
                return object4;
                break block23;
            }
            return null;
        }
        SdkTracker.trackAndLogBootException(LOG_TAG, "action", "system", "helper", "Exception while GZipping and encrypting", exception2);
        return null;
    }

    /*
     * Loose catch block
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static String md5(InputStream object) {
        void var0_4;
        int n3;
        int n4;
        Object object2 = "MD5";
        object2 = MessageDigest.getInstance((String)object2);
        DigestInputStream digestInputStream = new DigestInputStream((InputStream)object, (MessageDigest)object2);
        while ((n4 = digestInputStream.read()) != (n3 = -1)) {
        }
        object = digestInputStream.getMessageDigest();
        object = ((MessageDigest)object).digest();
        ((InputStream)digestInputStream).close();
        object2 = new StringBuilder();
        int n7 = ((Object)object).length;
        int n8 = 0;
        while (n8 < n7) {
            int n10;
            Object object3 = object[n8];
            object3 = object3 & 0xFF;
            String string2 = Integer.toHexString((int)object3);
            StringBuilder stringBuilder = new StringBuilder(string2);
            while ((object3 = (Object)stringBuilder.length()) < (n10 = 2)) {
                string2 = "0";
                stringBuilder.insert(0, string2);
            }
            ((StringBuilder)object2).append((CharSequence)stringBuilder);
            ++n8;
        }
        return ((StringBuilder)object2).toString();
        catch (Throwable throwable) {
            try {
                ((InputStream)digestInputStream).close();
                throw throwable;
            }
            catch (Throwable throwable2) {
                try {
                    throwable.addSuppressed(throwable2);
                    throw throwable;
                }
                catch (IOException iOException) {
                }
                catch (NoSuchAlgorithmException noSuchAlgorithmException) {}
            }
        }
        void var8_14 = var0_4;
        SdkTracker.trackAndLogBootException(LOG_TAG, "action", "system", "helper", "Exception trying to get md5sum from input stream", (Throwable)var0_4);
        return null;
    }

    public static String md5(String string2) {
        return EncryptionHelper.md5(string2.getBytes());
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static String md5(byte[] byArray) {
        int n3;
        int n4;
        Object object;
        block5: {
            object = "MD5";
            try {
                object = MessageDigest.getInstance((String)object);
                ((MessageDigest)object).update(byArray);
                byArray = ((MessageDigest)object).digest();
                object = new StringBuilder();
                n4 = byArray.length;
                n3 = 0;
                break block5;
            }
            catch (NoSuchAlgorithmException noSuchAlgorithmException) {
                NoSuchAlgorithmException noSuchAlgorithmException2 = noSuchAlgorithmException;
            }
            SdkTracker.trackAndLogBootException(LOG_TAG, "action", "system", "helper", "Exception trying to calculate md5sum from given string", noSuchAlgorithmException);
            return null;
        }
        while (n3 < n4) {
            int n7;
            int n8 = byArray[n3];
            String string2 = Integer.toHexString(n8 &= 0xFF);
            StringBuilder stringBuilder = new StringBuilder(string2);
            while ((n8 = stringBuilder.length()) < (n7 = 2)) {
                string2 = "0";
                stringBuilder.insert(0, string2);
            }
            ((StringBuilder)object).append((CharSequence)stringBuilder);
            ++n3;
        }
        return ((StringBuilder)object).toString();
    }

    public static byte[] v1Decrypt(byte[] byArray) {
        int n3 = byArray.length;
        int n4 = 8;
        byte[] byArray2 = new byte[n3 -= n4];
        int n7 = byArray.length;
        int n8 = 9;
        byte by2 = byArray[n8];
        int n10 = byArray[19];
        int n14 = byArray[29];
        int n15 = byArray[39];
        int n16 = byArray[49];
        byte by4 = byArray[59];
        byte by5 = byArray[69];
        byte by6 = byArray[79];
        byte[] byArray3 = new byte[n4];
        byArray3[0] = by2;
        by2 = 1;
        byArray3[by2] = n10;
        byArray3[2] = n14;
        byArray3[3] = n15;
        byArray3[4] = n16;
        byArray3[5] = by4;
        byArray3[6] = by5;
        byArray3[7] = by6;
        n10 = 0;
        n14 = 0;
        for (int i3 = 0; i3 < n7; i3 += by2) {
            n15 = i3 % 10;
            if (n15 == n8 && n10 < n4) {
                n10 += by2;
                continue;
            }
            n15 = byArray[i3];
            n16 = n14 % 8;
            n16 = byArray3[n16];
            byArray2[n14] = n15 = (int)((byte)(n15 ^ n16));
            n14 += by2;
        }
        return byArray2;
    }

    public static byte[] v1Encrypt(byte[] byArray) {
        byArray = Utils.gzipContent(byArray);
        SecureRandom secureRandom = new SecureRandom();
        int n3 = 8;
        byte[] byArray2 = new byte[n3];
        secureRandom.nextBytes(byArray2);
        int n4 = byArray.length;
        int n7 = n4 + 8;
        byte[] byArray3 = new byte[n7];
        int n8 = 0;
        int n10 = 0;
        for (int i3 = 0; n8 < n4 && i3 < n7; ++i3) {
            int n14 = i3 % 10;
            int n15 = 9;
            if (n14 == n15 && n10 < n3) {
                byArray3[i3] = n14 = byArray2[n10];
                ++n10;
                continue;
            }
            n14 = byArray[n8];
            n15 = n8 % 8;
            n15 = byArray2[n15];
            byArray3[i3] = n14 = (int)((byte)(n14 ^ n15));
            ++n8;
        }
        return byArray3;
    }
}

