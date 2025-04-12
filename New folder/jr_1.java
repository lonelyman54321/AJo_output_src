/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Bitmap
 *  android.graphics.Bitmap$Config
 *  android.graphics.Matrix
 *  android.graphics.Paint
 */
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Paint;
import java.nio.charset.Charset;
import java.security.MessageDigest;

/*
 * Renamed from jR
 */
public final class jr_1
extends ry_2 {
    public static final byte[] b;

    static {
        Charset charset = qn1_0.a;
        b = "com.bumptech.glide.load.resource.bitmap.CenterCrop".getBytes(charset);
    }

    public final void b(MessageDigest messageDigest) {
        byte[] byArray = b;
        messageDigest.update(byArray);
    }

    public final Bitmap c(ny_0 ny_02, Bitmap object, int n3, int n4) {
        Paint paint = Zq3.a;
        int n7 = object.getWidth();
        if (n7 != n3 || (n7 = object.getHeight()) != n4) {
            float f5;
            float f6;
            paint = new Matrix();
            int n8 = object.getWidth() * n4;
            int n10 = object.getHeight() * n3;
            float f7 = 0.0f;
            float f8 = 0.5f;
            if (n8 > n10) {
                f6 = n4;
                f5 = object.getHeight();
                f6 /= f5;
                f5 = n3;
                int n14 = object.getWidth();
                float f11 = (float)n14 * f6;
                f7 = (f5 - f11) * f8;
                n10 = 0;
                f5 = 0.0f;
            } else {
                f6 = n3;
                n10 = object.getWidth();
                f5 = n10;
                f6 /= f5;
                f5 = n4;
                int n15 = object.getHeight();
                float f12 = (float)n15 * f6;
                f5 = (f5 - f12) * f8;
            }
            paint.setScale(f6, f6);
            n8 = (int)(f7 += f8);
            f6 = n8;
            n10 = (int)(f5 + f8);
            f5 = n10;
            paint.postTranslate(f6, f5);
            Bitmap.Config config = object.getConfig();
            config = config != null ? object.getConfig() : Bitmap.Config.ARGB_8888;
            ny_02 = ny_02.e(n3, n4, config);
            n3 = (int)(object.hasAlpha() ? 1 : 0);
            ny_02.setHasAlpha(n3 != 0);
            Zq3.a(object, (Bitmap)ny_02, (Matrix)paint);
            object = ny_02;
        }
        return object;
    }

    public final boolean equals(Object object) {
        return object instanceof jr_1;
    }

    public final int hashCode() {
        return -599754482;
    }
}

