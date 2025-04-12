/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.runtime.ParcelableSnapshotMutableState;

/*
 * Renamed from Lt1
 */
public final class lt1_0
extends LP1$c
implements vt2_1,
J30,
c01_0,
Qt1$a {
    public qt1_0 n;
    public Vt1 o;
    public Sk3 p;
    public final ParcelableSnapshotMutableState q;

    public lt1_0(qt1_0 object, Vt1 vt1, Sk3 sk3) {
        this.n = object;
        this.o = vt1;
        this.p = sk3;
        this.q = object = J83.g(null);
    }

    public final zp1 B() {
        return (zp1)this.q.getValue();
    }

    public final void X(w32_0 w32_02) {
        this.q.setValue(w32_02);
    }

    public final Vt1 b1() {
        return this.o;
    }

    public final b93 getSoftwareKeyboardController() {
        vc3_1 vc3_12 = O30.n;
        return (b93)K30.a(this, vc3_12);
    }

    public final NC3 getViewConfiguration() {
        vc3_1 vc3_12 = O30.q;
        return (NC3)K30.a(this, vc3_12);
    }

    public final void j1() {
        Object object = this.n;
        Object object2 = ((qt1_0)object).a;
        if (object2 == null) {
            ((qt1_0)object).a = this;
            return;
        }
        object2 = "Expected textInputModifierNode to be null".toString();
        object = new IllegalStateException((String)object2);
        throw object;
    }

    public final void k1() {
        this.n.j(this);
    }

    public final mb3_2 p(th_0 th_02) {
        boolean bl2 = this.m;
        if (!bl2) {
            return null;
        }
        i90_0 i90_02 = this.f1();
        l90_0 l90_02 = l90_0.UNDISPATCHED;
        kt1_2 kt1_22 = new kt1_2(this, th_02, null);
        return Ae3.d(i90_02, null, l90_02, kt1_22, 1);
    }

    public final Sk3 y0() {
        return this.p;
    }
}

