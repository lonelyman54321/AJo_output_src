/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.res.Resources
 *  android.graphics.Bitmap
 *  android.graphics.drawable.BitmapDrawable
 */
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;

public final class Nx$a
implements qr3 {
    public final qr3 a;
    public final /* synthetic */ Nx b;

    public Nx$a(Nx nx, qr3 qr32) {
        this.b = nx;
        this.a = qr32;
    }

    public final boolean a(Object object, qr3$a qr3$a) {
        qr3$a qr3$a2 = qr3$a;
        qr3$a2 = ((md3_1)((Object)qr3$a)).a.getResources();
        ((sy_1)this.b).getClass();
        object = (Bitmap)object;
        BitmapDrawable bitmapDrawable = new BitmapDrawable((Resources)qr3$a2, (Bitmap)object);
        return this.a.a(bitmapDrawable, qr3$a);
    }
}

