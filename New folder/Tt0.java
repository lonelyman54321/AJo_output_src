/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Bitmap
 *  android.graphics.drawable.BitmapDrawable
 *  android.graphics.drawable.Drawable
 */
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;

public final class Tt0
implements RK2 {
    public final ny_0 a;
    public final RK2 b;
    public final RK2 c;

    public Tt0(ny_0 ny_02, Mx mx, pr0_0 pr0_02) {
        this.a = ny_02;
        this.b = mx;
        this.c = pr0_02;
    }

    public final wk2_0 a(wk2_0 wk2_02, Z92 z92) {
        Drawable drawable2 = (Drawable)wk2_02.get();
        boolean bl2 = drawable2 instanceof BitmapDrawable;
        if (bl2) {
            wk2_02 = ((BitmapDrawable)drawable2).getBitmap();
            wk2_02 = py_2.b(this.a, (Bitmap)wk2_02);
            return this.b.a(wk2_02, z92);
        }
        boolean bl3 = drawable2 instanceof yz0_2;
        if (bl3) {
            return this.c.a(wk2_02, z92);
        }
        return null;
    }
}

