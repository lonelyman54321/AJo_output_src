/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Bitmap
 *  android.graphics.Bitmap$Config
 *  android.graphics.Canvas
 *  android.graphics.Rect
 *  android.graphics.drawable.BitmapDrawable
 *  android.graphics.drawable.Drawable
 */
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;

/*
 * Renamed from bu0
 */
public final class bu0_0 {
    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public static Bitmap a(Drawable object) {
        void var0_7;
        int n3 = object.getIntrinsicWidth();
        int n4 = object.getIntrinsicHeight();
        int n7 = object instanceof BitmapDrawable;
        if (n7 == 0) {
            Rect rect = object.getBounds();
            int n8 = rect.left;
            int n10 = rect.top;
            int n14 = rect.right;
            n7 = rect.bottom;
            Bitmap.Config config = Bitmap.Config.ARGB_8888;
            config = Bitmap.createBitmap((int)n3, (int)n4, (Bitmap.Config)config);
            object.setBounds(0, 0, n3, n4);
            Canvas canvas = new Canvas((Bitmap)config);
            object.draw(canvas);
            object.setBounds(n8, n10, n14, n7);
            Bitmap.Config config2 = config;
            return var0_7;
        }
        BitmapDrawable bitmapDrawable = (BitmapDrawable)object;
        Bitmap bitmap = bitmapDrawable.getBitmap();
        if (bitmap == null) {
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException("bitmap is null");
            throw illegalArgumentException;
        }
        bitmap = bitmapDrawable.getBitmap();
        n7 = bitmap.getWidth();
        if (n3 == n7 && n4 == (n7 = (bitmap = bitmapDrawable.getBitmap()).getHeight())) {
            Bitmap bitmap2 = bitmapDrawable.getBitmap();
            return var0_7;
        }
        Bitmap bitmap3 = bitmapDrawable.getBitmap();
        n7 = 1;
        Bitmap bitmap4 = Bitmap.createScaledBitmap((Bitmap)bitmap3, (int)n3, (int)n4, n7 != 0);
        return var0_7;
    }
}

