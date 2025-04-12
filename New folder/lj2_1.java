/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.Base64
 */
import android.util.Base64;
import com.facebook.FacebookException;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.Regex;

/*
 * Renamed from Lj2
 */
public final class lj2_1 {
    public static final String a(String object, jw_1 object2) {
        Intrinsics.checkNotNullParameter(object, "codeVerifier");
        Object object3 = "codeChallengeMethod";
        Intrinsics.checkNotNullParameter(object2, object3);
        int n3 = lj2_1.b((String)object);
        if (n3 != 0) {
            object3 = jw_1.PLAIN;
            if (object2 == object3) {
                return object;
            }
            try {
                object2 = Charsets.b;
            }
            catch (Exception exception) {
                object2 = new RuntimeException(exception);
                throw object2;
            }
            object = ((String)object).getBytes((Charset)object2);
            object2 = "this as java.lang.String).getBytes(charset)";
            Intrinsics.checkNotNullExpressionValue(object, (String)object2);
            object2 = "SHA-256";
            object2 = MessageDigest.getInstance((String)object2);
            n3 = ((Object)object).length;
            ((MessageDigest)object2).update((byte[])object, 0, n3);
            object = ((MessageDigest)object2).digest();
            int n4 = 11;
            object = Base64.encodeToString((byte[])object, (int)n4);
            object2 = "{\n      // try to genera\u2026 or Base64.NO_WRAP)\n    }";
            Intrinsics.checkNotNullExpressionValue(object, (String)object2);
            return object;
        }
        object = new FacebookException("Invalid Code Verifier.");
        throw object;
    }

    public static final boolean b(String string2) {
        int n3;
        int n4;
        if (string2 != null && (n4 = string2.length()) != 0 && (n4 = string2.length()) >= (n3 = 43) && (n4 = string2.length()) <= (n3 = 128)) {
            Regex regex = new Regex("^[-._~A-Za-z0-9]+$");
            return regex.c(string2);
        }
        return false;
    }
}

