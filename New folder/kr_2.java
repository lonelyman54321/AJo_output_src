/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Bitmap
 *  android.util.Log
 */
import android.graphics.Bitmap;
import android.util.Log;
import java.nio.charset.Charset;
import java.security.MessageDigest;

/*
 * Renamed from kR
 */
public final class kr_2
extends ry_2 {
    public static final byte[] b;

    static {
        Charset charset = qn1_0.a;
        b = "com.bumptech.glide.load.resource.bitmap.CenterInside".getBytes(charset);
    }

    public final void b(MessageDigest messageDigest) {
        byte[] byArray = b;
        messageDigest.update(byArray);
    }

    public final Bitmap c(ny_0 ny_02, Bitmap bitmap, int n3, int n4) {
        int n7 = bitmap.getWidth();
        int n8 = 2;
        String string2 = "TransformationUtils";
        if (n7 <= n3 && (n7 = bitmap.getHeight()) <= n4) {
            Log.isLoggable((String)string2, (int)n8);
        } else {
            Log.isLoggable((String)string2, (int)n8);
            bitmap = Zq3.b(ny_02, bitmap, n3, n4);
        }
        return bitmap;
    }

    public final boolean equals(Object object) {
        return object instanceof kr_2;
    }

    public final int hashCode() {
        return -670243078;
    }
}

