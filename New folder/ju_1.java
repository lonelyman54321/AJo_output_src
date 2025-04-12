/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Bitmap
 *  android.graphics.Bitmap$Config
 *  android.graphics.Canvas
 *  android.graphics.Paint
 *  android.graphics.RectF
 *  android.os.Build$VERSION
 */
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.Build;
import java.nio.charset.Charset;
import java.security.MessageDigest;

/*
 * Renamed from JU
 */
public final class ju_1
extends ry_2 {
    public static final byte[] b;

    static {
        Charset charset = qn1_0.a;
        b = "com.bumptech.glide.load.resource.bitmap.CircleCrop.1".getBytes(charset);
    }

    public final void b(MessageDigest messageDigest) {
        byte[] byArray = b;
        messageDigest.update(byArray);
    }

    public final Bitmap c(ny_0 ny_02, Bitmap bitmap, int n3, int n4) {
        Bitmap.Config config;
        Object object;
        Bitmap.Config config2;
        Bitmap.Config config3;
        Paint paint = Zq3.a;
        n3 = Math.min(n3, n4);
        float f5 = n3;
        float f6 = 2.0f;
        float f7 = f5 / f6;
        int n7 = bitmap.getWidth();
        int n8 = bitmap.getHeight();
        float f8 = n7;
        float f11 = f5 / f8;
        float f12 = n8;
        float f14 = f5 / f12;
        f11 = Math.max(f11, f14);
        f8 *= f11;
        f11 *= f12;
        f12 = (f5 - f8) / f6;
        f5 = (f5 - f11) / f6;
        paint = new RectF(f12, f5, f8 += f12, f11 += f5);
        n4 = Build.VERSION.SDK_INT;
        n7 = 26;
        f8 = 3.6E-44f;
        config3 = n4 >= n7 && (n8 = (int)((config3 = Jh.a()).equals(config2 = bitmap.getConfig()) ? 1 : 0)) != 0 ? Jh.a() : Bitmap.Config.ARGB_8888;
        config2 = bitmap.getConfig();
        int n10 = config3.equals(config2);
        f14 = 0.0f;
        if (n10 != 0) {
            config3 = bitmap;
        } else {
            n10 = bitmap.getWidth();
            int n14 = bitmap.getHeight();
            config3 = ny_02.e(n10, n14, config3);
            config2 = new Canvas((Bitmap)config3);
            n14 = 0;
            config2.drawBitmap(bitmap, 0.0f, 0.0f, null);
        }
        object = n4 >= n7 && (n4 = (int)((object = Jh.a()).equals(config = bitmap.getConfig()) ? 1 : 0)) != 0 ? Jh.a() : Bitmap.Config.ARGB_8888;
        Bitmap bitmap2 = ny_02.e(n3, n3, (Bitmap.Config)object);
        n4 = 1;
        f5 = Float.MIN_VALUE;
        bitmap2.setHasAlpha(n4 != 0);
        object = Zq3.d;
        object.lock();
        try {
            config = new Canvas(bitmap2);
            config2 = Zq3.b;
            config.drawCircle(f7, f7, f7, (Paint)config2);
            Paint paint2 = Zq3.c;
            config.drawBitmap((Bitmap)config3, null, (RectF)paint, paint2);
            config.setBitmap(null);
            boolean bl2 = config3.equals(bitmap);
            if (!bl2) {
                ny_02.d((Bitmap)config3);
            }
            return bitmap2;
        }
        finally {
            object.unlock();
        }
    }

    public final boolean equals(Object object) {
        return object instanceof ju_1;
    }

    public final int hashCode() {
        return 1101716364;
    }
}

