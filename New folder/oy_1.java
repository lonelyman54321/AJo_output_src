/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Bitmap
 *  android.graphics.Bitmap$Config
 */
import android.graphics.Bitmap;

/*
 * Renamed from oy
 */
public class oy_1
implements ny_0 {
    public final void a(int n3) {
    }

    public final void b() {
    }

    public final Bitmap c(int n3, int n4, Bitmap.Config config) {
        return Bitmap.createBitmap((int)n3, (int)n4, (Bitmap.Config)config);
    }

    public void d(Bitmap bitmap) {
        bitmap.recycle();
    }

    public final Bitmap e(int n3, int n4, Bitmap.Config config) {
        return Bitmap.createBitmap((int)n3, (int)n4, (Bitmap.Config)config);
    }
}

