/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Bitmap
 *  android.graphics.drawable.BitmapDrawable
 */
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import java.io.File;

/*
 * Renamed from Ux
 */
public final class ux_1
implements ek2_0 {
    public final ny_0 a;
    public final ek2_0 b;

    public ux_1(ny_0 ny_02, wx_0 wx_02) {
        this.a = ny_02;
        this.b = wx_02;
    }

    public final cz0_0 a(Z92 z92) {
        return this.b.a(z92);
    }

    public final boolean b(Object object, File file, Z92 z92) {
        object = (wk2_0)object;
        object = ((BitmapDrawable)object.get()).getBitmap();
        ny_0 ny_02 = this.a;
        py_2 py_22 = new py_2(ny_02, (Bitmap)object);
        return this.b.b(py_22, file, z92);
    }
}

