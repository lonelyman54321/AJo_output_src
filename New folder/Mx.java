/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Bitmap
 *  android.graphics.Bitmap$CompressFormat
 */
import android.graphics.Bitmap;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;

public final class Mx
implements RK2 {
    public final Bitmap.CompressFormat a;
    public final int b;

    public Mx() {
        Bitmap.CompressFormat compressFormat = Bitmap.CompressFormat.JPEG;
        this.a = compressFormat;
        this.b = 100;
    }

    public final wk2_0 a(wk2_0 wk2_02, Z92 object) {
        object = new ByteArrayOutputStream();
        Bitmap bitmap = (Bitmap)wk2_02.get();
        Bitmap.CompressFormat compressFormat = this.a;
        int n3 = this.b;
        bitmap.compress(compressFormat, n3, (OutputStream)object);
        wk2_02.a();
        object = ((ByteArrayOutputStream)object).toByteArray();
        wk2_02 = new nf_1((byte[])object);
        return wk2_02;
    }
}

