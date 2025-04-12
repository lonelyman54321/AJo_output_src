/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Bitmap
 *  android.graphics.Bitmap$Config
 *  android.graphics.ColorSpace
 */
import android.graphics.Bitmap;
import android.graphics.ColorSpace;

public final class Yl {
    public static final py_1 a(Bitmap object) {
        if ((object = Wl.a(object)) == null || (object = bZ.b((ColorSpace)object)) == null) {
            object = eZ.a;
            object = eZ.c;
        }
        return object;
    }

    public static final Bitmap b(int n3, int n4, int n7, boolean bl2, py_1 py_12) {
        Bitmap.Config config = Lh.b(n7);
        py_12 = bZ.a(py_12);
        return Xl.a(n3, n4, config, bl2, (ColorSpace)py_12);
    }
}

