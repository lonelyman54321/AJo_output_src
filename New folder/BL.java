/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Bitmap
 *  android.graphics.Canvas
 */
import android.graphics.Bitmap;
import android.graphics.Canvas;

public final class BL {
    public static final mf_0 a(ih_0 ih_02) {
        Canvas canvas;
        Object object = Nf.a;
        object = new mf_0();
        ih_02 = Lh.a(ih_02);
        object.a = canvas = new Canvas((Bitmap)ih_02);
        return object;
    }
}

