/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Bitmap
 *  android.graphics.ImageDecoder$Source
 *  android.util.Log
 */
import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.util.Log;

/*
 * Renamed from jy
 */
public final class jy_0
implements BK2 {
    public final oy_1 a;

    public jy_0() {
        oy_1 oy_12;
        this.a = oy_12;
    }

    public final py_2 c(ImageDecoder.Source source, int n3, int n4, Z92 z92) {
        Fm0 fm0 = new Fm0(n3, n4, z92);
        source = iy_2.a(source, fm0);
        Object object = "BitmapImageDecoder";
        n4 = 2;
        n3 = (int)(Log.isLoggable((String)object, (int)n4) ? 1 : 0);
        if (n3 != 0) {
            source.getWidth();
            source.getHeight();
        }
        oy_1 oy_12 = this.a;
        object = new py_2(oy_12, (Bitmap)source);
        return object;
    }
}

