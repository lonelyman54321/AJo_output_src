/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

public final class Vt1 {
    public Mj3 a;
    public final BF2 b;
    public final b93 c;
    public final Gx0 d;
    public Il3 e;
    public final ParcelableSnapshotMutableState f;
    public final ParcelableSnapshotMutableState g;
    public zp1 h;
    public final ParcelableSnapshotMutableState i;
    public Sl j;
    public final ParcelableSnapshotMutableState k;
    public final ParcelableSnapshotMutableState l;
    public final ParcelableSnapshotMutableState m;
    public final ParcelableSnapshotMutableState n;
    public final ParcelableSnapshotMutableState o;
    public boolean p;
    public final ParcelableSnapshotMutableState q;
    public final uo1_1 r;
    public Function1 s;
    public final Vt1$b t;
    public final Vt1$a u;
    public final ei v;
    public long w;
    public final ParcelableSnapshotMutableState x;
    public final ParcelableSnapshotMutableState y;

    public Vt1(Mj3 object, BF2 object2, b93 b932) {
        long l2;
        Xx0 xx0;
        this.a = object;
        this.b = object2;
        this.c = b932;
        object = new Object();
        Object object3 = Tl.a;
        long l3 = mm3.b;
        ((Gx0)object).a = object2 = new ql3_0((Sl)object3, l3, null);
        long l4 = ((ql3_0)object2).b;
        ((Gx0)object).b = xx0 = new Xx0((Sl)object3, l4);
        this.d = object;
        object = Boolean.FALSE;
        this.f = object2 = J83.g(object);
        float f5 = 0.0f;
        object3 = new xs0_0(f5);
        this.g = object2 = J83.g(object3);
        this.i = object2 = J83.g(null);
        this.k = object2 = J83.g((Object)x21_0.None);
        this.l = object2 = J83.g(object);
        this.m = object2 = J83.g(object);
        this.n = object2 = J83.g(object);
        this.o = object = J83.g(object);
        this.p = true;
        this.q = object = J83.g(Boolean.TRUE);
        this.r = object = new uo1_1(b932);
        this.s = object = Vt1$c.c;
        this.t = object = new Vt1$b(this);
        this.u = object = new Vt1$a(this);
        this.v = object = fi.a();
        this.w = l2 = OX.l;
        object = new mm3(l3);
        this.x = object = J83.g(object);
        object = new mm3(l3);
        this.y = object = J83.g(object);
    }

    public final x21_0 a() {
        return (x21_0)((Object)this.k.getValue());
    }

    public final boolean b() {
        return (Boolean)this.f.getValue();
    }

    public final zp1 c() {
        boolean bl2;
        zp1 zp12 = this.h;
        if (zp12 == null || !(bl2 = zp12.e())) {
            zp12 = null;
        }
        return zp12;
    }

    public final Ul3 d() {
        return (Ul3)this.i.getValue();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final boolean e() {
        mm3 mm32 = (mm3)this.x.getValue();
        long l2 = mm32.a;
        boolean bl2 = mm3.b(l2);
        if (!bl2) return true;
        mm32 = (mm3)this.y.getValue();
        l2 = mm32.a;
        bl2 = mm3.b(l2);
        if (bl2) return false;
        return true;
    }

    public final void f(long l2) {
        mm3 mm32 = new mm3(l2);
        this.y.setValue(mm32);
    }

    public final void g(long l2) {
        mm3 mm32 = new mm3(l2);
        this.x.setValue(mm32);
    }

    public final void h(Sl sl, Sl sl2, xm3 xm32, boolean n3, Vo0 vo0, RU0$a rU0$a, Function1 function1, wo1_0 wo1_02, YT0 yT0, long l2) {
        Vt1 vt1 = this;
        Object object = function1;
        this.s = function1;
        this.w = l2;
        object = this.r;
        Object object2 = wo1_02;
        ((uo1_1)object).b = wo1_02;
        object2 = yT0;
        ((uo1_1)object).c = yT0;
        object = sl;
        this.j = sl;
        object = this.a;
        mz0_2 mz0_22 = mz0_2.a;
        object2 = ((Mj3)object).a;
        int n4 = Intrinsics.areEqual(object2, sl2);
        int n7 = 1;
        int n8 = -1 >>> 1;
        int n10 = 1;
        if (n4 == 0 || (n4 = Intrinsics.areEqual(object2 = ((Mj3)object).b, xm32)) == 0 || (n4 = ((Mj3)object).e) != n3 || (n4 = km3.b(((Mj3)object).f, n7)) == 0 || (n4 = ((Mj3)object).c) != n8 || (n4 = ((Mj3)object).d) != n10 || (n4 = (int)(Intrinsics.areEqual(object2 = ((Mj3)object).g, vo0) ? 1 : 0)) == 0 || (n4 = (int)(Intrinsics.areEqual(object2 = ((Mj3)object).i, mz0_22) ? 1 : 0)) == 0 || (object2 = ((Mj3)object).h) != rU0$a) {
            object2 = object;
            object = new Mj3(sl2, xm32, n8, n10, n3 != 0, n7, vo0, rU0$a, mz0_22);
        }
        if ((object2 = vt1.a) != object) {
            n4 = 1;
            vt1.p = n4;
        }
        vt1.a = object;
    }
}

