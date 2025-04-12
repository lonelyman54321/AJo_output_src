/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.PorterDuff$Mode
 *  android.graphics.PorterDuffXfermode
 *  android.graphics.Xfermode
 *  android.os.Build$VERSION
 */
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Xfermode;
import android.os.Build;

/*
 * Renamed from gm2
 */
public final class gm2_0 {
    public static final ThreadLocal a;

    static {
        ThreadLocal threadLocal;
        a = threadLocal = new ThreadLocal();
    }

    public static void a(bp1_1 bp1_12, hy_0 hy_02) {
        int n3 = Build.VERSION.SDK_INT;
        int n4 = 29;
        Object object = null;
        if (n3 >= n4) {
            if (hy_02 != null) {
                object = Iy$b.a(hy_02);
            }
            gm2$b.a(bp1_12, object);
            return;
        }
        if (hy_02 != null) {
            if ((hy_02 = iy_0.a(hy_02)) != null) {
                object = new PorterDuffXfermode((PorterDuff.Mode)hy_02);
            }
            bp1_12.setXfermode((Xfermode)object);
            return;
        }
        bp1_12.setXfermode(null);
    }
}

