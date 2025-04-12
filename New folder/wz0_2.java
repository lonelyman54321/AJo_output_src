/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.drawable.Drawable
 */
import android.content.Context;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.RequestManager;
import com.bumptech.glide.a;

/*
 * Renamed from WZ0
 */
public final class wz0_2
extends RequestManager {
    public final rj2_0 b(Class clazz) {
        a a2 = this.a;
        Context context = this.b;
        uz0_1 uz0_12 = new rj2_0(a2, this, clazz, context);
        return uz0_12;
    }

    public final rj2_0 f() {
        return (uz0_1)super.f();
    }

    public final rj2_0 j() {
        return (uz0_1)this.b(Drawable.class);
    }

    public final rj2_0 k() {
        return (uz0_1)super.k();
    }

    public final rj2_0 n(x31_0 x31_02) {
        return (uz0_1)super.n(x31_02);
    }

    public final rj2_0 o(Integer n3) {
        return (uz0_1)super.o(n3);
    }

    public final rj2_0 p(String string2) {
        return (uz0_1)super.p(string2);
    }

    public final void s(fk2_0 fk2_02) {
        boolean bl2 = fk2_02 instanceof tz0_2;
        if (bl2) {
            super.s(fk2_02);
        } else {
            tz0_2 tz0_22 = new tz0_2();
            fk2_02 = tz0_22.L(fk2_02);
            super.s(fk2_02);
        }
    }
}

