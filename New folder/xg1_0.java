/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
import android.view.View;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/*
 * Renamed from xG1
 */
public final class xg1_0
extends LP1$c
implements c01_0,
it0_0,
dy2_0,
G62 {
    public final ParcelableSnapshotMutableState A;
    public mp0 B;
    public long C;
    public bj1 D;
    public le_2 E;
    public Function1 n;
    public Function1 o;
    public Function1 p;
    public float q;
    public boolean r;
    public long s;
    public float t;
    public float u;
    public boolean v;
    public lt2 w;
    public View x;
    public Vo0 y;
    public kt2_0 z;

    public xg1_0() {
        throw null;
    }

    public xg1_0(al3_0 object, Function1 function1, Function1 function12, float f5, boolean bl2, long l2, float f6, float f7, boolean bl3, lt2 lt22) {
        this.n = object;
        this.o = function1;
        this.p = function12;
        this.q = f5;
        this.r = bl2;
        this.s = l2;
        this.t = f6;
        this.u = f7;
        this.v = bl3;
        this.w = lt22;
        J83.h();
        object = wv1_0.b;
        this.A = object = J83.f(null, (I83)object);
        this.C = 9205357640488583168L;
    }

    public final /* synthetic */ void C0() {
    }

    public final /* synthetic */ boolean N() {
        return false;
    }

    public final void X(w32_0 w32_02) {
        this.A.setValue(w32_02);
    }

    public final void a0() {
        xG1$d xG1$d = new xG1$d(this);
        H62.a(this, xG1$d);
    }

    public final /* synthetic */ boolean c1() {
        return false;
    }

    public final void i0(UY2 uY2) {
        TY2 tY2 = yG1.a;
        xG1$b xG1$b = new xG1$b(this);
        uY2.a(tY2, xG1$b);
    }

    public final void j1() {
        this.a0();
        Object object = sr_2.a(0, 7, null);
        this.E = object;
        object = this.f1();
        xG1$c xG1$c = new xG1$c(this, null);
        Ae3.d((i90_0)object, null, null, xG1$c, 3);
    }

    public final void k1() {
        kt2_0 kt2_02 = this.z;
        if (kt2_02 != null) {
            kt2_02.dismiss();
        }
        this.z = null;
    }

    public final void n(E60 object) {
        object.e1();
        object = this.E;
        if (object != null) {
            Unit unit = Unit.a;
            object.j(unit);
        }
    }

    public final long r1() {
        long l2;
        Object object = this.B;
        if (object == null) {
            object = new xg1$a_0(this);
            this.B = object = J83.e((Function0)object);
        }
        if ((object = this.B) != null) {
            object = (e72)((mp0)object).getValue();
            l2 = ((e72)object).a;
        } else {
            l2 = 9205357640488583168L;
        }
        return l2;
    }

    public final void s1() {
        Object object = this.z;
        if (object != null) {
            object.dismiss();
        }
        if ((object = this.x) == null) {
            object = ho0_0.a(this);
        }
        kt2_0 kt2_02 = object;
        this.x = object;
        object = this.y;
        if (object == null) {
            object = go0.f((fo0)this).r;
        }
        this.y = object;
        lt2 lt22 = this.w;
        boolean bl2 = this.r;
        long l2 = this.s;
        float f5 = this.t;
        float f6 = this.u;
        boolean bl3 = this.v;
        float f7 = this.q;
        this.z = object = lt22.b((View)kt2_02, bl2, l2, f5, f6, bl3, (Vo0)object, f7);
        this.u1();
    }

    public final void t1() {
        long l2;
        Object object = this.y;
        if (object == null) {
            object = go0.f((fo0)this).r;
            this.y = object;
        }
        Object object2 = (e72)this.n.invoke(object);
        long l3 = ((e72)object2).a;
        boolean bl2 = h72.c(l3);
        long l4 = 9205357640488583168L;
        if (bl2 && (bl2 = h72.c(l2 = this.r1()))) {
            kt2_0 kt2_02;
            l2 = this.r1();
            this.C = l3 = e72.i(l2, l3);
            object2 = this.o;
            if (object2 != null) {
                object = (e72)object2.invoke(object);
                long l7 = ((e72)object).a;
                e72 e722 = new e72(l7);
                boolean bl3 = h72.c(l7);
                if (!bl3) {
                    e722 = null;
                }
                if (e722 != null) {
                    l7 = this.r1();
                    long l8 = e722.a;
                    l4 = e72.i(l7, l8);
                }
            }
            long l12 = l4;
            object = this.z;
            if (object == null) {
                this.s1();
            }
            if ((kt2_02 = this.z) != null) {
                long l14 = this.C;
                float f5 = this.q;
                kt2_02.b(l14, l12, f5);
            }
            this.u1();
            return;
        }
        this.C = l4;
        object = this.z;
        if (object != null) {
            object.dismiss();
        }
    }

    public final void u1() {
        bj1 bj12;
        kt2_0 kt2_02 = this.z;
        if (kt2_02 == null) {
            return;
        }
        Object object = this.y;
        if (object == null) {
            return;
        }
        long l2 = kt2_02.a();
        boolean bl2 = bj1.a(l2, bj12 = this.D);
        if (!bl2) {
            Object object2 = this.p;
            if (object2 != null) {
                long l3 = dj1.b(kt2_02.a());
                l3 = object.z(l3);
                object = new bs0_0(l3);
                object2.invoke(object);
            }
            long l4 = kt2_02.a();
            this.D = object2 = new bj1(l4);
        }
    }
}

