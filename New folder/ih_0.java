/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Bitmap
 *  android.graphics.Bitmap$Config
 *  android.os.Build$VERSION
 */
import android.graphics.Bitmap;
import android.os.Build;

/*
 * Renamed from Ih
 */
public final class ih_0
implements hd1_0 {
    public final Bitmap a;

    public ih_0(Bitmap bitmap) {
        this.a = bitmap;
    }

    public final void a() {
        this.a.prepareToDraw();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final int b() {
        Bitmap.Config config;
        Bitmap.Config config2;
        Bitmap.Config config3 = this.a.getConfig();
        if (config3 == (config2 = Bitmap.Config.ALPHA_8)) {
            return 1;
        }
        config2 = Bitmap.Config.RGB_565;
        if (config3 == config2) {
            return 2;
        }
        config2 = Bitmap.Config.ARGB_4444;
        if (config3 == config2) {
            return 0;
        }
        int n3 = Build.VERSION.SDK_INT;
        int n4 = 26;
        if (n3 >= n4 && config3 == (config = Jh.a())) {
            return 3;
        }
        if (n3 < n4) return 0;
        config2 = Kh.a();
        if (config3 != config2) return 0;
        return 4;
    }

    public final int getHeight() {
        return this.a.getHeight();
    }

    public final int getWidth() {
        return this.a.getWidth();
    }
}

