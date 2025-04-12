/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Bitmap$Config
 *  android.graphics.drawable.AnimatedImageDrawable
 *  android.graphics.drawable.Drawable
 */
import android.graphics.Bitmap;
import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.Drawable;

/*
 * Renamed from Qk$a
 */
public final class qk$a_0
implements wk2_0 {
    public final AnimatedImageDrawable a;

    public qk$a_0(AnimatedImageDrawable animatedImageDrawable) {
        this.a = animatedImageDrawable;
    }

    public final void a() {
        Ok.a(this.a);
        Pk.a(this.a);
    }

    public final Class c() {
        return Drawable.class;
    }

    public final Object get() {
        return this.a;
    }

    public final int getSize() {
        int n3 = Mk.a(this.a);
        int n4 = Nk.a(this.a) * n3;
        return dz3.d(Bitmap.Config.ARGB_8888) * n4 * 2;
    }
}

