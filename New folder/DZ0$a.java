/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Bitmap
 *  android.graphics.drawable.Drawable
 *  android.os.Handler
 *  android.os.Message
 */
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Message;

public final class DZ0$a
extends dg0 {
    public final Handler d;
    public final int e;
    public final long f;
    public Bitmap g;

    public DZ0$a(Handler handler, int n3, long l2) {
        this.d = handler;
        this.e = n3;
        this.f = l2;
    }

    public final void d(Object object, qr3 qr32) {
        object = (Bitmap)object;
        this.g = object;
        qr32 = this.d;
        object = qr32.obtainMessage(1, this);
        long l2 = this.f;
        qr32.sendMessageAtTime((Message)object, l2);
    }

    public final void e(Drawable drawable2) {
        this.g = null;
    }
}

