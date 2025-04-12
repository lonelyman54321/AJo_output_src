/*
 * Decompiled with CFR 0.152.
 */
import com.clevertap.android.sdk.b;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.KeySpec;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;

public final class O
extends k0_0 {
    public static final String a;
    public static final String b;

    static {
        String string2 = "Lq3fz";
        Intrinsics.checkNotNullExpressionValue(string2, "StringBuilder()\n        \u2026\").append(\"z\").toString()");
        a = string2;
        string2 = "bLti2";
        Intrinsics.checkNotNullExpressionValue(string2, "StringBuilder()\n        \u2026\"i\").append(2).toString()");
        b = string2;
    }

    public static byte[] b0(int n3, String object, byte[] byArray) {
        byte[] byArray2;
        Object object2 = "this as java.lang.String).getBytes(charset)";
        Object object3 = "UTF_8";
        Object object4 = "W1ZRCl3>";
        Object object5 = StandardCharsets.UTF_8;
        Intrinsics.checkNotNullExpressionValue(object5, (String)object3);
        object4 = ((String)object4).getBytes((Charset)object5);
        Intrinsics.checkNotNullExpressionValue(object4, (String)object2);
        String string2 = "__CL3>3Rt#P__1V_";
        Intrinsics.checkNotNullExpressionValue(object5, (String)object3);
        object3 = string2.getBytes((Charset)object5);
        Intrinsics.checkNotNullExpressionValue(object3, (String)object2);
        object = ((String)object).toCharArray();
        object5 = "this as java.lang.String).toCharArray()";
        Intrinsics.checkNotNullExpressionValue(object, (String)object5);
        int n4 = 1000;
        int n7 = 256;
        object2 = new PBEKeySpec((char[])object, (byte[])object4, n4, n7);
        object = "PBEWithMD5And128BitAES-CBC-OpenSSL";
        object = SecretKeyFactory.getInstance((String)object);
        object = ((SecretKeyFactory)object).generateSecret((KeySpec)object2);
        object = object.getEncoded();
        object4 = "AES";
        object2 = new SecretKeySpec((byte[])object, (String)object4);
        object = "AES/CBC/PKCS5Padding";
        object = Cipher.getInstance((String)object);
        object4 = new IvParameterSpec((byte[])object3);
        ((Cipher)object).init(n3, (Key)object2, (AlgorithmParameterSpec)object4);
        try {
            byArray2 = ((Cipher)object).doFinal(byArray);
        }
        catch (Exception exception) {
            com.clevertap.android.sdk.b.l();
            n3 = 0;
            byArray2 = null;
        }
        return byArray2;
    }

    public final String Z(String object, String object2) {
        String string2 = "cipherText";
        Intrinsics.checkNotNullParameter(object, string2);
        Object object3 = "accountID";
        Intrinsics.checkNotNullParameter(object2, (String)object3);
        Intrinsics.checkNotNullParameter(object, string2);
        string2 = null;
        int n3 = ((String)object).length();
        int n4 = 1;
        n3 -= n4;
        object = ((String)object).substring(n4, n3);
        object3 = "this as java.lang.String\u2026ing(startIndex, endIndex)";
        Intrinsics.checkNotNullExpressionValue(object, (String)object3);
        object = StringsKt.m0((CharSequence)object);
        object = object.toString();
        String string3 = "\\s*,\\s*";
        object3 = new Regex(string3);
        object = ((Regex)object3).e((CharSequence)object);
        n3 = object.size();
        object3 = new byte[n3];
        n4 = object.size();
        for (int i3 = 0; i3 < n4; ++i3) {
            Object object4 = object.get(i3);
            object4 = (String)object4;
            byte by2 = Byte.parseByte(object4);
            try {
                object3[i3] = by2;
                continue;
            }
            catch (Exception exception) {
                com.clevertap.android.sdk.b.l();
                n3 = 0;
                object3 = null;
                break;
            }
        }
        if (object3 != null) {
            object = new StringBuilder();
            string3 = a;
            ((StringBuilder)object).append(string3);
            ((StringBuilder)object).append((String)object2);
            object2 = b;
            ((StringBuilder)object).append((String)object2);
            object = ((StringBuilder)object).toString();
            int n7 = 2;
            object = O.b0(n7, (String)object, (byte[])object3);
            if (object != null) {
                object2 = StandardCharsets.UTF_8;
                Intrinsics.checkNotNullExpressionValue(object2, "UTF_8");
                string2 = new String((byte[])object, (Charset)object2);
            }
        }
        return string2;
    }

    public final String a0(String object, String string2) {
        Intrinsics.checkNotNullParameter(object, "plainText");
        Intrinsics.checkNotNullParameter(string2, "accountID");
        Object object2 = new StringBuilder();
        String string3 = a;
        ((StringBuilder)object2).append(string3);
        ((StringBuilder)object2).append(string2);
        string2 = b;
        ((StringBuilder)object2).append(string2);
        string2 = ((StringBuilder)object2).toString();
        object2 = StandardCharsets.UTF_8;
        string3 = "UTF_8";
        Intrinsics.checkNotNullExpressionValue(object2, string3);
        object = ((String)object).getBytes((Charset)object2);
        object2 = "this as java.lang.String).getBytes(charset)";
        Intrinsics.checkNotNullExpressionValue(object, (String)object2);
        int n3 = 1;
        object = O.b0(n3, string2, (byte[])object);
        if (object != null) {
            object = Arrays.toString((byte[])object);
            string2 = "toString(this)";
            Intrinsics.checkNotNullExpressionValue(object, string2);
        } else {
            object = null;
        }
        return object;
    }
}

