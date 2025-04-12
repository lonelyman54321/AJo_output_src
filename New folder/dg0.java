/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.drawable.Drawable
 */
import android.graphics.drawable.Drawable;

public abstract class dg0
implements ki3_1 {
    public final int a;
    public final int b;
    public LJ2 c;

    public dg0() {
        int n3 = -1 << -1;
        boolean bl2 = dz3.i(n3, n3);
        if (bl2) {
            this.a = n3;
            this.b = n3;
            return;
        }
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Width and height must both be > 0 or Target#SIZE_ORIGINAL, but given width: -2147483648 and height: -2147483648");
        throw illegalArgumentException;
    }

    public final void a(K63 k63) {
        int n3 = this.a;
        int n4 = this.b;
        k63.b(n3, n4);
    }

    public final void c(Drawable drawable2) {
    }

    public final void g(LJ2 lJ2) {
        this.c = lJ2;
    }

    public final LJ2 getRequest() {
        return this.c;
    }

    public final void h(K63 k63) {
    }

    public final void i(Drawable drawable2) {
    }

    public final void onDestroy() {
    }

    public final void onStart() {
    }

    public final void onStop() {
    }
}

