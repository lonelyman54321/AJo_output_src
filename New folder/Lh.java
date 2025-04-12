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

public final class Lh {
    public static final Bitmap a(hd1_0 object) {
        boolean bl2 = object instanceof ih_0;
        if (bl2) {
            return ((ih_0)object).a;
        }
        object = new UnsupportedOperationException("Unable to obtain android.graphics.Bitmap");
        throw object;
    }

    public static final Bitmap.Config b(int n3) {
        boolean bl2;
        int n4;
        int n7 = id1_0.a(n3, 0);
        Bitmap.Config config = n7 != 0 ? Bitmap.Config.ARGB_8888 : ((n7 = id1_0.a(n3, 1)) != 0 ? Bitmap.Config.ALPHA_8 : ((n7 = id1_0.a(n3, 2)) != 0 ? Bitmap.Config.RGB_565 : ((n7 = Build.VERSION.SDK_INT) >= (n4 = 26) && (bl2 = id1_0.a(n3, 3)) ? Jh.a() : (n7 >= n4 && (n3 = (int)(id1_0.a(n3, n7 = 4) ? 1 : 0)) != 0 ? Kh.a() : Bitmap.Config.ARGB_8888))));
        return config;
    }
}

