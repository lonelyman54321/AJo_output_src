/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Build$VERSION
 */
import android.os.Build;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;

public final class tE {
    public static final /* synthetic */ int a;

    static {
        int n3;
        int n4 = Build.VERSION.SDK_INT;
        int n7 = 30;
        if (n4 >= n7) {
            tE$a.a(n7);
        }
        if (n4 >= n7) {
            n3 = 31;
            tE$a.a(n3);
        }
        if (n4 >= n7) {
            n3 = 33;
            tE$a.a(n3);
        }
        if (n4 >= n7) {
            n4 = 1000000;
            tE$a.a(n4);
        }
    }

    public static final boolean a(String string2, String string3) {
        Intrinsics.checkNotNullParameter(string2, "codename");
        Intrinsics.checkNotNullParameter(string3, "buildCodename");
        Object object = "REL";
        boolean bl2 = Intrinsics.areEqual(object, string3);
        boolean bl3 = false;
        if (bl2) {
            return false;
        }
        object = Locale.ROOT;
        string3 = string3.toUpperCase((Locale)object);
        String string4 = "this as java.lang.String).toUpperCase(Locale.ROOT)";
        Intrinsics.checkNotNullExpressionValue(string3, string4);
        string2 = string2.toUpperCase((Locale)object);
        Intrinsics.checkNotNullExpressionValue(string2, string4);
        int n3 = string3.compareTo(string2);
        if (n3 >= 0) {
            bl3 = true;
        }
        return bl3;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static final boolean b() {
        int n3 = Build.VERSION.SDK_INT;
        int n4 = 35;
        if (n3 >= n4) return 1 != 0;
        n4 = 34;
        if (n3 < n4) return 0 != 0;
        String string2 = Build.VERSION.CODENAME;
        Intrinsics.checkNotNullExpressionValue(string2, "CODENAME");
        String string3 = "VanillaIceCream";
        n3 = tE.a(string3, string2);
        if (n3 == 0) return 0 != 0;
        return 1 != 0;
    }
}

