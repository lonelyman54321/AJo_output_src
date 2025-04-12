/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.res.Resources
 *  android.graphics.Bitmap
 *  android.graphics.Bitmap$Config
 *  android.graphics.drawable.BitmapDrawable
 *  android.graphics.drawable.Drawable
 *  android.graphics.drawable.VectorDrawable
 */
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;

public final class Zt0
implements el0_0 {
    public final Drawable a;
    public final ba2 b;

    public Zt0(Drawable drawable2, ba2 ba22) {
        this.a = drawable2;
        this.b = ba22;
    }

    public final Object a(f80_0 drawable2) {
        Object object;
        drawable2 = m.a;
        drawable2 = this.a;
        boolean bl2 = drawable2 instanceof VectorDrawable;
        bl2 = bl2 || (bl2 = drawable2 instanceof aa3_1);
        if (bl2) {
            object = this.b;
            Bitmap.Config config = ((ba2)object).b;
            B63 b63 = ((ba2)object).d;
            WS2 wS2 = ((ba2)object).e;
            boolean bl3 = ((ba2)object).f;
            drawable2 = vu0_0.a(drawable2, config, b63, wS2, bl3);
            object = ((ba2)object).a.getResources();
            config = new BitmapDrawable((Resources)object, (Bitmap)drawable2);
            drawable2 = config;
        }
        object = ri0.MEMORY;
        hu0 hu02 = new hu0(drawable2, bl2, (ri0)((Object)object));
        return hu02;
    }
}

