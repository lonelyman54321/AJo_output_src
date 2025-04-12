/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Bitmap
 */
import android.graphics.Bitmap;

/*
 * Renamed from py
 */
public final class py_2
implements wk2_0,
uh1_0 {
    public final Bitmap a;
    public final ny_0 b;

    public py_2(ny_0 ny_02, Bitmap bitmap) {
        dV0.c(bitmap, "Bitmap must not be null");
        this.a = bitmap;
        dV0.c(ny_02, "BitmapPool must not be null");
        this.b = ny_02;
    }

    public static py_2 b(ny_0 ny_02, Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        py_2 py_22 = new py_2(ny_02, bitmap);
        return py_22;
    }

    public final void a() {
        ny_0 ny_02 = this.b;
        Bitmap bitmap = this.a;
        ny_02.d(bitmap);
    }

    public final Class c() {
        return Bitmap.class;
    }

    public final Object get() {
        return this.a;
    }

    public final int getSize() {
        return dz3.c(this.a);
    }

    public final void initialize() {
        this.a.prepareToDraw();
    }
}

