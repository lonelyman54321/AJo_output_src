/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Build$VERSION
 *  android.view.View
 */
import android.os.Build;
import android.view.View;

/*
 * Renamed from nE3
 */
public class ne3_0
extends lE3 {
    public static boolean j = true;

    public void d(View view, int n3) {
        int n4 = Build.VERSION.SDK_INT;
        int n7 = 28;
        if (n4 == n7) {
            super.d(view, n3);
        } else {
            n4 = (int)(j ? 1 : 0);
            if (n4 != 0) {
                try {
                    nE3$a.a(view, n3);
                }
                catch (NoSuchMethodError noSuchMethodError) {
                    view = null;
                    j = false;
                }
            }
        }
    }
}

