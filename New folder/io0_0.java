/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Bitmap
 */
import android.graphics.Bitmap;
import java.nio.charset.Charset;
import java.security.MessageDigest;

/*
 * Renamed from iO0
 */
public final class io0_0
extends ry_2 {
    public static final byte[] b;

    static {
        Charset charset = qn1_0.a;
        b = "com.bumptech.glide.load.resource.bitmap.FitCenter".getBytes(charset);
    }

    public final void b(MessageDigest messageDigest) {
        byte[] byArray = b;
        messageDigest.update(byArray);
    }

    public final Bitmap c(ny_0 ny_02, Bitmap bitmap, int n3, int n4) {
        return Zq3.b(ny_02, bitmap, n3, n4);
    }

    public final boolean equals(Object object) {
        return object instanceof io0_0;
    }

    public final int hashCode() {
        return 1572326941;
    }
}

