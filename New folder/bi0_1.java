/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.pm.ApplicationInfo
 *  android.content.pm.PackageManager$NameNotFoundException
 *  android.os.Build
 */
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import java.util.HashSet;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.b;

/*
 * Renamed from BI0
 */
public final class bi0_1 {
    public static final HashSet a = p03_0.d("8a3c4b262d721acd49a4bf97d5213199c86fa2b9", "cc2751449a350f668590264ed76692694a80308a", "a4b7452e2ed8f5f191058ca7bbfd26b0d3214bfc", "df6b721c8b4d3b6eb44c861d4415007e5a35fc95", "9b8f518b086098de3d77736f9458a3d2f6f95a37", "2438bce1ddb7bd026d5ff89f598b3b5e5bb824b3", "c56fb7d591ba6704df047fd98f535372fea00211");

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static final boolean a(Context signatureArray, String signatureArray2) {
        int n4 = 1;
        String string2 = "packageInfo.signatures";
        Intrinsics.checkNotNullParameter(signatureArray, "context");
        Intrinsics.checkNotNullParameter(signatureArray2, "packageName");
        Object object = Build.BRAND;
        ApplicationInfo applicationInfo = signatureArray.getApplicationInfo();
        int n7 = applicationInfo.flags;
        Intrinsics.checkNotNullExpressionValue(object, "brand");
        Object object2 = "generic";
        int n8 = b.s((String)object, (String)object2, false);
        if (n8 != 0 && (n8 = n7 & 2) != 0) {
            return n4 != 0;
        }
        try {
            signatureArray = signatureArray.getPackageManager();
            n8 = 64;
            signatureArray = signatureArray.getPackageInfo((String)signatureArray2, n8);
            signatureArray2 = signatureArray.signatures;
            if (signatureArray2 == null) return false;
            Intrinsics.checkNotNullExpressionValue(signatureArray2, string2);
            int n10 = signatureArray2.length;
            if (n10 == 0) {
                return false;
            }
            signatureArray = signatureArray.signatures;
            Intrinsics.checkNotNullExpressionValue(signatureArray, string2);
            n10 = signatureArray.length;
            int n3 = 0;
            string2 = null;
            while (n3 < n10) {
                object = signatureArray[n3];
                HashSet hashSet = a;
                object = object.toByteArray();
                object2 = "it.toByteArray()";
                Intrinsics.checkNotNullExpressionValue(object, (String)object2);
                object2 = lz3_0.a;
                object2 = "bytes";
                Intrinsics.checkNotNullParameter(object, (String)object2);
                object2 = lz3_0.a;
                String string3 = "SHA-1";
                object2.getClass();
                object = lz3_0.u(string3, (byte[])object);
                n8 = (int)(CollectionsKt.F(hashSet, object) ? 1 : 0);
                if (n8 == 0) {
                    return 0 != 0;
                }
                n3 += n4;
            }
            return n4 != 0;
        }
        catch (PackageManager.NameNotFoundException nameNotFoundException) {}
        return false;
    }
}

