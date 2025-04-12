/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.pm.PackageInfo
 *  android.content.pm.PackageManager$NameNotFoundException
 *  android.content.pm.Signature
 *  android.util.Base64
 */
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.util.Base64;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from oR
 */
public final class or_1 {
    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static final String a(Context object) {
        CharSequence charSequence = "ctx";
        Intrinsics.checkNotNullParameter(object, (String)charSequence);
        try {
            charSequence = object.getPackageManager();
            String string2 = object.getPackageName();
            int n3 = 64;
            PackageInfo packageInfo = charSequence.getPackageInfo(string2, n3);
            Signature[] signatureArray = packageInfo.signatures;
            charSequence = new StringBuilder();
            Object object2 = "SHA1";
            object2 = MessageDigest.getInstance((String)object2);
            String string3 = "signatures";
            Intrinsics.checkNotNullExpressionValue(signatureArray, string3);
            for (Signature signature : signatureArray) {
                byte[] byArray = signature.toByteArray();
                ((MessageDigest)object2).update(byArray);
                byte[] byArray2 = ((MessageDigest)object2).digest();
                String string4 = Base64.encodeToString((byte[])byArray2, (int)0);
                ((StringBuilder)charSequence).append(string4);
                String string5 = ":";
                ((StringBuilder)charSequence).append(string5);
            }
            int n4 = charSequence.length();
            if (n4 > 0) {
                n4 = ((StringBuilder)charSequence).length() + -1;
                ((StringBuilder)charSequence).setLength(n4);
            }
            String string6 = ((StringBuilder)charSequence).toString();
            charSequence = "sb.toString()";
            Intrinsics.checkNotNullExpressionValue(string6, (String)charSequence);
            return string6;
        }
        catch (PackageManager.NameNotFoundException | NoSuchAlgorithmException throwable) {
            return "";
        }
    }
}

