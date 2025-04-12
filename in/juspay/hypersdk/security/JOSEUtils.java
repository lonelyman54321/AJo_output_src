/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Build$VERSION
 *  org.json.JSONObject
 */
package in.juspay.hypersdk.security;

import android.os.Build;
import in.juspay.hypersdk.security.Base64Codec;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.math.BigInteger;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.AlgorithmParameters;
import java.security.Key;
import java.security.KeyFactory;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.Signature;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.KeySpec;
import java.security.spec.RSAPublicKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.HashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.json.JSONObject;

public class JOSEUtils {
    public static RSAPublicKey JWKtoRSAPublicKey(JSONObject object) {
        Object object2 = object.getString("n");
        object = object.getString("e");
        object2 = Base64Codec.decode((String)object2);
        int n3 = 1;
        BigInteger bigInteger = new BigInteger(n3, (byte[])object2);
        object = Base64Codec.decode((String)object);
        object2 = new BigInteger(n3, (byte[])object);
        object = new RSAPublicKeySpec(bigInteger, (BigInteger)object2);
        return (RSAPublicKey)KeyFactory.getInstance("RSA").generatePublic((KeySpec)object);
    }

    public static void assertIfMatches(String string2, String string3) {
        boolean bl2 = string2.equals(string3);
        if (bl2) {
            return;
        }
        string2 = UX.c("Assert failed, org=", string2, ", expected=", string3);
        Exception exception = new Exception(string2);
        throw exception;
    }

    public static void assertIfSupportedEncAlg(String string2) {
        Exception exception;
        string2.getClass();
        int n3 = -1;
        int n4 = string2.hashCode();
        switch (n4) {
            default: {
                break;
            }
            case -565207670: {
                String string3 = "RSA-OAEP";
                n4 = (int)(string2.equals(string3) ? 1 : 0);
                if (n4 == 0) break;
                n3 = 2;
                break;
            }
            case -890830960: {
                String string4 = "RSA-OAEP-256";
                n4 = (int)(string2.equals(string4) ? 1 : 0);
                if (n4 == 0) break;
                n3 = 1;
                break;
            }
            case -1868738169: {
                String string5 = "RSA1_5";
                n4 = (int)(string2.equals(string5) ? 1 : 0);
                if (n4 == 0) break;
                n3 = 0;
                exception = null;
            }
        }
        switch (n3) {
            default: {
                string2 = "Not supported signing alg ".concat(string2);
                exception = new Exception(string2);
                throw exception;
            }
            case 0: 
            case 1: 
            case 2: 
        }
    }

    public static void assertIfSupportedSigningAlg(String string2) {
        string2.getClass();
        Object object = "RS256";
        boolean bl2 = string2.equals(object);
        if (!bl2 && !(bl2 = string2.equals(object = "RS512"))) {
            string2 = "Not supported signing alg ".concat(string2);
            object = new Exception(string2);
            throw object;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static byte[] concat(byte[] ... object) {
        IOException iOException2222;
        Object object2;
        block9: {
            object2 = new ByteArrayOutputStream();
            {
                Throwable throwable2222;
                block10: {
                    catch (IOException iOException2222) {
                        break block9;
                    }
                    try {
                        for (byte[] byArray : object) {
                            if (byArray == null) continue;
                            ((OutputStream)object2).write(byArray);
                        }
                    }
                    catch (Throwable throwable2222) {
                        break block10;
                    }
                    object = ((ByteArrayOutputStream)object2).toByteArray();
                    {
                        ((ByteArrayOutputStream)object2).close();
                        return object;
                    }
                }
                try {
                    ((ByteArrayOutputStream)object2).close();
                    throw throwable2222;
                }
                catch (Throwable throwable3) {}
                {
                    throwable2222.addSuppressed(throwable3);
                    throw throwable2222;
                }
            }
        }
        String string2 = iOException2222.getMessage();
        object2 = new IllegalStateException(string2, iOException2222);
        throw object2;
    }

    public static String constructPayload(HashMap object) {
        CharSequence charSequence;
        boolean bl2;
        Object object2;
        boolean bl3;
        String string2;
        boolean bl4;
        String string3;
        boolean bl5;
        String string4 = "headers";
        boolean bl6 = ((HashMap)object).containsKey(string4);
        if (bl6 && (bl5 = ((HashMap)object).containsKey(string3 = "encryptedKey")) && (bl4 = ((HashMap)object).containsKey(string2 = "iv")) && (bl3 = ((HashMap)object).containsKey(object2 = "cipherText")) && (bl2 = ((HashMap)object).containsKey(charSequence = "authTag"))) {
            string4 = (String)((HashMap)object).get(string4);
            string3 = (String)((HashMap)object).get(string3);
            string2 = (String)((HashMap)object).get(string2);
            object2 = (byte[])((HashMap)object).get(object2);
            object = (String)((HashMap)object).get(charSequence);
            if (string4 != null && string3 != null && string2 != null && object2 != null && object != null) {
                charSequence = new StringBuilder();
                ((StringBuilder)charSequence).append(string4);
                string4 = ".";
                ((StringBuilder)charSequence).append(string4);
                ((StringBuilder)charSequence).append(string3);
                ((StringBuilder)charSequence).append(string4);
                ((StringBuilder)charSequence).append(string2);
                ((StringBuilder)charSequence).append(string4);
                string3 = Base64Codec.encodeToString((byte[])object2, true);
                ((StringBuilder)charSequence).append(string3);
                ((StringBuilder)charSequence).append(string4);
                ((StringBuilder)charSequence).append((String)object);
                return ((StringBuilder)charSequence).toString();
            }
        }
        return null;
    }

    public static String extractKey(String string2, String object) {
        JSONObject jSONObject = new JSONObject((String)object);
        boolean bl2 = jSONObject.has(string2);
        if (bl2) {
            return jSONObject.getString(string2);
        }
        string2 = kp1_0.c("JWS Sign - header missing ", string2);
        object = new Exception(string2);
        throw object;
    }

    public static String getJavaAlg(String string2) {
        Exception exception;
        string2.getClass();
        int n3 = -1;
        int n4 = string2.hashCode();
        switch (n4) {
            default: {
                break;
            }
            case 78253877: {
                String string3 = "RS512";
                n4 = (int)(string2.equals(string3) ? 1 : 0);
                if (n4 == 0) break;
                n3 = 4;
                break;
            }
            case 78251122: {
                String string4 = "RS256";
                n4 = (int)(string2.equals(string4) ? 1 : 0);
                if (n4 == 0) break;
                n3 = 3;
                break;
            }
            case -565207670: {
                String string5 = "RSA-OAEP";
                n4 = (int)(string2.equals(string5) ? 1 : 0);
                if (n4 == 0) break;
                n3 = 2;
                break;
            }
            case -890830960: {
                String string6 = "RSA-OAEP-256";
                n4 = (int)(string2.equals(string6) ? 1 : 0);
                if (n4 == 0) break;
                n3 = 1;
                break;
            }
            case -1868738169: {
                String string7 = "RSA1_5";
                n4 = (int)(string2.equals(string7) ? 1 : 0);
                if (n4 == 0) break;
                n3 = 0;
                exception = null;
            }
        }
        switch (n3) {
            default: {
                string2 = "Not supported signing alg ".concat(string2);
                exception = new Exception(string2);
                throw exception;
            }
            case 4: {
                return "SHA512withRSA";
            }
            case 3: {
                return "SHA256withRSA";
            }
            case 2: {
                return "RSA/ECB/OAEPWithSHA-1AndMGF1Padding";
            }
            case 1: {
                return "RSA/ECB/OAEPWithSHA-256AndMGF1Padding";
            }
            case 0: 
        }
        return "RSA/ECB/PKCS1Padding";
    }

    public static JSONObject jweDecrypt(String objectArray, PrivateKey object) {
        AlgorithmParameterSpec algorithmParameterSpec;
        Object object2;
        int n3;
        Object object3;
        int n4;
        Object object4;
        String string2;
        Object object5;
        block9: {
            objectArray = objectArray.split("\\.");
            object5 = Base64Codec.decode(objectArray[0]);
            string2 = new String((byte[])object5);
            object5 = JOSEUtils.extractKey("alg", string2);
            JOSEUtils.assertIfSupportedEncAlg((String)object5);
            JOSEUtils.assertIfMatches(JOSEUtils.extractKey("enc", string2), "A256GCM");
            byte[] byArray = new byte[2048];
            object4 = new SecureRandom();
            ((SecureRandom)object4).nextBytes(byArray);
            int n7 = 1;
            object4 = objectArray[n7];
            object5 = Cipher.getInstance(JOSEUtils.getJavaAlg((String)object5));
            n4 = 2;
            ((Cipher)object5).init(n4, (Key)object);
            object = Base64Codec.decode((String)object4);
            object = ((Cipher)object5).doFinal((byte[])object);
            object4 = "AES";
            object5 = new SecretKeySpec((byte[])object, (String)object4);
            object = StandardCharsets.UTF_8;
            object = Base64Codec.encodeToString(string2.getBytes((Charset)object), n7 != 0);
            object3 = StandardCharsets.US_ASCII;
            object = ((String)object).getBytes((Charset)object3);
            object5 = ((SecretKeySpec)object5).getEncoded();
            object3 = new SecretKeySpec((byte[])object5, (String)object4);
            object5 = Cipher.getInstance("AES/GCM/NoPadding");
            n3 = 128;
            int n8 = Build.VERSION.SDK_INT;
            int n10 = 23;
            if (n8 > n10) break block9;
            object2 = objectArray[n4];
            object2 = Base64Codec.decode((String)object2);
            algorithmParameterSpec = new IvParameterSpec((byte[])object2);
        }
        object2 = objectArray[n4];
        object2 = Base64Codec.decode((String)object2);
        try {
            algorithmParameterSpec = new GCMParameterSpec(n3, (byte[])object2);
        }
        catch (Exception exception) {
            object2 = Base64Codec.decode(objectArray[n4]);
            algorithmParameterSpec = new GCMParameterSpec(n3, (byte[])object2);
        }
        ((Cipher)object5).init(n4, (Key)object3, algorithmParameterSpec);
        ((Cipher)object5).updateAAD((byte[])object);
        object = Base64Codec.decode(objectArray[3]);
        objectArray = Base64Codec.decode(objectArray[4]);
        object4 = new byte[n4][];
        object4[0] = object;
        object4[n7] = objectArray;
        objectArray = JOSEUtils.concat((byte[][])object4);
        objectArray = ((Cipher)object5).doFinal((byte[])objectArray);
        object = new JSONObject();
        object.put("headers", (Object)string2);
        string2 = new String((byte[])objectArray);
        object.put("payload", (Object)string2);
        return object;
    }

    public static String jweEncrypt(String string2, String string3, byte[] object) {
        Object object2 = KeyFactory.getInstance("RSA");
        X509EncodedKeySpec x509EncodedKeySpec = new X509EncodedKeySpec((byte[])object);
        object = (RSAPublicKey)((KeyFactory)object2).generatePublic(x509EncodedKeySpec);
        object2 = StandardCharsets.UTF_8;
        return JOSEUtils.constructPayload(JOSEUtils.jweEncrypt(string2.getBytes((Charset)object2), string3, (RSAPublicKey)object));
    }

    public static HashMap jweEncrypt(byte[] object, String string2, RSAPublicKey object2) {
        Object object3;
        Object object4;
        boolean bl2;
        Object object5;
        Object object6;
        block16: {
            AlgorithmParameterSpec algorithmParameterSpec;
            int n3;
            int n4;
            int n7;
            Object object7;
            block15: {
                object6 = GCMParameterSpec.class;
                object5 = JOSEUtils.extractKey("alg", string2);
                JOSEUtils.assertIfSupportedEncAlg((String)object5);
                JOSEUtils.assertIfMatches(JOSEUtils.extractKey("enc", string2), "A256GCM");
                byte[] byArray = new byte[32];
                object7 = new SecureRandom();
                ((SecureRandom)object7).nextBytes(byArray);
                object7 = new SecretKeySpec(byArray, "AES");
                object5 = Cipher.getInstance(JOSEUtils.getJavaAlg((String)object5));
                bl2 = true;
                ((Cipher)object5).init((int)(bl2 ? 1 : 0), (Key)object2);
                object2 = ((SecretKeySpec)object7).getEncoded();
                object2 = Base64Codec.encodeToString(((Cipher)object5).doFinal((byte[])object2), bl2);
                object5 = StandardCharsets.UTF_8;
                object5 = Base64Codec.encodeToString(string2.getBytes((Charset)object5), bl2);
                object4 = StandardCharsets.US_ASCII;
                object5 = ((String)object5).getBytes((Charset)object4);
                n7 = 12;
                object4 = new byte[n7];
                object3 = new SecureRandom();
                ((SecureRandom)object3).nextBytes((byte[])object4);
                object3 = Cipher.getInstance("AES/GCM/NoPadding");
                n4 = 128;
                n3 = 23;
                int n8 = Build.VERSION.SDK_INT;
                if (n8 > n3) break block15;
                algorithmParameterSpec = new IvParameterSpec((byte[])object4);
            }
            try {
                algorithmParameterSpec = new GCMParameterSpec(n4, (byte[])object4);
            }
            catch (Exception exception) {
                algorithmParameterSpec = new GCMParameterSpec(n4, (byte[])object4);
            }
            ((Cipher)object3).init((int)(bl2 ? 1 : 0), (Key)object7, algorithmParameterSpec);
            ((Cipher)object3).updateAAD((byte[])object5);
            object = ((Cipher)object3).doFinal((byte[])object);
            int n10 = ((byte[])object).length;
            int n14 = 16;
            n7 = 0;
            object4 = JOSEUtils.subArray(object, 0, n10 -= n14);
            object = JOSEUtils.subArray(object, n10, n14);
            n10 = Build.VERSION.SDK_INT;
            if (n10 > n3) break block16;
            object5 = ((Cipher)object3).getParameters();
            object7 = IvParameterSpec.class;
            object5 = ((AlgorithmParameters)object5).getParameterSpec(object7);
            object5 = (IvParameterSpec)object5;
            object6 = ((IvParameterSpec)object5).getIV();
        }
        object5 = ((Cipher)object3).getParameters();
        object5 = ((AlgorithmParameters)object5).getParameterSpec(object6);
        object5 = (GCMParameterSpec)object5;
        try {
            object6 = ((GCMParameterSpec)object5).getIV();
        }
        catch (Exception exception) {
            object5 = ((Cipher)object3).getParameters();
            object6 = ((AlgorithmParameters)object5).getParameterSpec(object6).getIV();
        }
        object2 = p3.a("encryptedKey", (String)object2);
        object6 = Base64Codec.encodeToString((byte[])object6, bl2);
        ((HashMap)object2).put("iv", object6);
        ((HashMap)object2).put("cipherText", object4);
        object = Base64Codec.encodeToString(object, bl2);
        ((HashMap)object2).put("authTag", object);
        object = StandardCharsets.UTF_8;
        object = Base64Codec.encodeToString(string2.getBytes((Charset)object), bl2);
        ((HashMap)object2).put("headers", object);
        return object2;
    }

    public static String jwsSign(String charSequence, String object, PrivateKey object2) {
        StringBuilder stringBuilder = new StringBuilder();
        Charset charset = StandardCharsets.UTF_8;
        Object object3 = ((String)object).getBytes(charset);
        boolean bl2 = true;
        object3 = Base64Codec.encodeToString(object3, bl2);
        stringBuilder.append((String)object3);
        object3 = ".";
        stringBuilder.append((String)object3);
        charSequence = Base64Codec.encodeToString(((String)charSequence).getBytes(charset), bl2);
        stringBuilder.append((String)charSequence);
        charSequence = stringBuilder.toString();
        object = JOSEUtils.extractKey("alg", (String)object);
        JOSEUtils.assertIfSupportedSigningAlg((String)object);
        object = Signature.getInstance(JOSEUtils.getJavaAlg((String)object));
        ((Signature)object).initSign((PrivateKey)object2);
        object2 = ((String)charSequence).getBytes(charset);
        ((Signature)object).update((byte[])object2);
        object = ((Signature)object).sign();
        charSequence = nn_2.a((String)charSequence, (String)object3);
        object = Base64Codec.encodeToString((byte[])object, bl2);
        ((StringBuilder)charSequence).append((String)object);
        return ((StringBuilder)charSequence).toString();
    }

    public static boolean jwsVerify(String object, byte[] object2) {
        int n3;
        Object object3 = KeyFactory.getInstance("RSA");
        Object object4 = new X509EncodedKeySpec((byte[])object2);
        object2 = (RSAPublicKey)((KeyFactory)object3).generatePublic((KeySpec)object4);
        object3 = "\\.";
        int n4 = ((String[])(object = object.split((String)object3))).length;
        if (n4 == (n3 = 3)) {
            object3 = new StringBuilder();
            String string2 = object[0];
            ((StringBuilder)object3).append(string2);
            ((StringBuilder)object3).append(".");
            string2 = object[1];
            ((StringBuilder)object3).append(string2);
            object3 = ((StringBuilder)object3).toString();
            object4 = Base64Codec.decode(object[0]);
            string2 = new String((byte[])object4);
            object4 = JOSEUtils.extractKey("alg", string2);
            JOSEUtils.assertIfSupportedSigningAlg((String)object4);
            object4 = Signature.getInstance(JOSEUtils.getJavaAlg((String)object4));
            ((Signature)object4).initVerify((PublicKey)object2);
            object2 = StandardCharsets.UTF_8;
            object2 = ((String)object3).getBytes((Charset)object2);
            ((Signature)object4).update((byte[])object2);
            object = Base64Codec.decode(object[2]);
            return ((Signature)object4).verify((byte[])object);
        }
        object2 = new Exception;
        object3 = new StringBuilder("JWS Verify - mandatory params missing ");
        int n7 = ((String[])object).length;
        ((StringBuilder)object3).append(n7);
        object = ((StringBuilder)object3).toString();
        object2((String)object);
        throw object2;
    }

    public static byte[] subArray(byte[] byArray, int n3, int n4) {
        byte[] byArray2 = new byte[n4];
        System.arraycopy(byArray, n3, byArray2, 0, n4);
        return byArray2;
    }
}

