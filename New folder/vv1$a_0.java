/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 */
import android.os.Bundle;
import androidx.loader.content.a;
import androidx.loader.content.a$b;

/*
 * Renamed from Vv1$a
 */
public final class vv1$a_0
extends zr1_1
implements a$b {
    public final int l;
    public final Bundle m = null;
    public final a n;
    public mu1_1 o;
    public vv1$b_0 p;
    public a q;

    public vv1$a_0(a a2) {
        this.l = 0;
        this.n = a2;
        this.q = null;
        a2.registerListener(0, this);
    }

    public final void g() {
        this.n.startLoading();
    }

    public final void h() {
        this.n.stopLoading();
    }

    public final void j(F62 f62) {
        super.j(f62);
        this.o = null;
        this.p = null;
    }

    public final void k(Object object) {
        super.k(object);
        object = this.q;
        if (object != null) {
            ((a)object).reset();
            object = null;
            this.q = null;
        }
    }

    public final void l() {
        mu1_1 mu1_12 = this.o;
        vv1$b_0 vv1$b_0 = this.p;
        if (mu1_12 != null && vv1$b_0 != null) {
            super.j(vv1$b_0);
            this.e(mu1_12, vv1$b_0);
        }
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder(64);
        stringBuilder.append("LoaderInfo{");
        Object object = Integer.toHexString(System.identityHashCode(this));
        stringBuilder.append((String)object);
        stringBuilder.append(" #");
        int n3 = this.l;
        stringBuilder.append(n3);
        stringBuilder.append(" : ");
        object = this.n;
        ii1.b(stringBuilder, object);
        stringBuilder.append("}}");
        return stringBuilder.toString();
    }
}

