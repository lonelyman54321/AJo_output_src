/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Build$VERSION
 *  android.view.Window
 */
import android.os.Build;
import android.view.Window;

/*
 * Renamed from aG3
 */
public final class ag3_1 {
    /*
     * WARNING - void declaration
     */
    public static void a(Window window, boolean bl2) {
        int n3 = Build.VERSION.SDK_INT;
        int n4 = 35;
        if (n3 >= n4) {
            aG3$b.a(window, bl2);
        } else {
            n4 = 30;
            if (n3 >= n4) {
                aG3$a.a(window, bl2);
            } else {
                void var1_4;
                window = window.getDecorView();
                n3 = window.getSystemUiVisibility();
                if (bl2) {
                    int n7 = n3 & 0xFFFFF8FF;
                } else {
                    int n8 = n3 | 0x700;
                }
                window.setSystemUiVisibility((int)var1_4);
            }
        }
    }
}

