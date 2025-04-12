/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Build$VERSION
 *  android.view.ViewGroup
 */
import android.os.Build;
import android.view.ViewGroup;
import java.lang.reflect.Method;

public final class VC3 {
    public static boolean a = true;
    public static Method b;
    public static boolean c;

    public static void a(ViewGroup viewGroup, boolean bl2) {
        int n3 = Build.VERSION.SDK_INT;
        int n4 = 29;
        if (n3 >= n4) {
            VC3$a.b(viewGroup, bl2);
        } else {
            n3 = (int)(a ? 1 : 0);
            if (n3 != 0) {
                try {
                    VC3$a.b(viewGroup, bl2);
                }
                catch (NoSuchMethodError noSuchMethodError) {
                    viewGroup = null;
                    a = false;
                }
            }
        }
    }
}

