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

/*
 * Renamed from uq1
 */
public final class uq1_2
implements wk2_0,
uh1_0 {
    public final Resources a;
    public final wk2_0 b;

    public uq1_2(Resources resources, wk2_0 wk2_02) {
        String string2 = "Argument must not be null";
        dV0.c(resources, string2);
        this.a = resources;
        dV0.c(wk2_02, string2);
        this.b = wk2_02;
    }

    public final void a() {
        this.b.a();
    }

    public final Class c() {
        return BitmapDrawable.class;
    }

    public final Object get() {
        Bitmap bitmap = (Bitmap)this.b.get();
        Resources resources = this.a;
        BitmapDrawable bitmapDrawable = new BitmapDrawable(resources, bitmap);
        return bitmapDrawable;
    }

    public final int getSize() {
        return this.b.getSize();
    }

    public final void initialize() {
        Object object = this.b;
        boolean bl2 = object instanceof uh1_0;
        if (bl2) {
            object = (uh1_0)object;
            object.initialize();
        }
    }
}

