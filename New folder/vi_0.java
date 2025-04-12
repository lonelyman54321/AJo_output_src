/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from VI
 */
public final class vi_0
extends LP1$c
implements ui_0,
G62,
uE {
    public final xi_0 n;
    public boolean o;
    public wt2_1 p;
    public Function1 q;

    public vi_0(xi_0 xi_02, Function1 fx0_22) {
        this.n = xi_02;
        this.q = fx0_22;
        xi_02.a = this;
        super(this);
        xi_02.d = fx0_22;
    }

    public final void C0() {
        this.q0();
    }

    public final void a0() {
        this.q0();
    }

    public final Vo0 getDensity() {
        return go0.f((fo0)this).r;
    }

    public final bp1_0 getLayoutDirection() {
        return go0.f((fo0)this).s;
    }

    public final void k1() {
        wt2_1 wt2_12 = this.p;
        if (wt2_12 != null) {
            wt2_12.c();
        }
    }

    public final long l() {
        return dj1.b(go0.d((fo0)this, (int)128).c);
    }

    public final void n(E60 e60) {
        It0 it0;
        boolean bl2 = this.o;
        xi_0 xi_02 = this.n;
        if (!bl2) {
            bl2 = false;
            it0 = null;
            xi_02.b = null;
            xi_02.c = e60;
            Object object = new wi_0(this, xi_02);
            H62.a(this, (Function0)object);
            object = xi_02.b;
            if (object != null) {
                this.o = bl2 = true;
            } else {
                bh1_1.d("DrawResult not defined, did you forget to call onDraw?");
                throw null;
            }
        }
        it0 = xi_02.b;
        Intrinsics.checkNotNull(it0);
        it0.a.invoke(e60);
    }

    public final void q0() {
        wt2_1 wt2_12 = this.p;
        if (wt2_12 != null) {
            wt2_12.c();
        }
        this.o = false;
        this.n.b = null;
        jt0_0.a(this);
    }
}

