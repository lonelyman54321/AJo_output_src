/*
 * Decompiled with CFR 0.152.
 */
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from xB1
 */
public abstract class xb1_0
extends tb1_0
implements xk1_0 {
    public final w32_0 m;
    public long n;
    public LinkedHashMap o;
    public final yb1_0 p;
    public bl1_0 q;
    public final LinkedHashMap r;

    public xb1_0(w32_0 linkedHashMap) {
        this.m = linkedHashMap;
        this.n = 0L;
        super(this);
        this.p = linkedHashMap;
        this.r = linkedHashMap = new LinkedHashMap();
    }

    public static final void L0(xb1_0 xb1_02, bl1_0 bl1_02) {
        Map map2;
        LinkedHashMap linkedHashMap;
        long l2;
        int n3;
        if (bl1_02 != null) {
            xb1_02.getClass();
            n3 = bl1_02.getWidth();
            int n4 = bl1_02.getHeight();
            l2 = dj1.a(n3, n4);
            xb1_02.m0(l2);
            linkedHashMap = Unit.a;
        } else {
            n3 = 0;
            linkedHashMap = null;
        }
        if (linkedHashMap == null) {
            l2 = 0L;
            xb1_02.m0(l2);
        }
        if ((n3 = (int)(Intrinsics.areEqual(linkedHashMap = xb1_02.q, bl1_02) ? 1 : 0)) == 0 && bl1_02 != null && ((linkedHashMap = xb1_02.o) != null && (n3 = (int)(linkedHashMap.isEmpty() ? 1 : 0)) == 0 || (n3 = (linkedHashMap = bl1_02.p()).isEmpty() ^ 1) != 0) && (n3 = (int)(Intrinsics.areEqual(linkedHashMap = bl1_02.p(), map2 = xb1_02.o) ? 1 : 0)) == 0) {
            linkedHashMap = xb1_02.m.m.z.s;
            Intrinsics.checkNotNull(linkedHashMap);
            ((bq1$a_0)((Object)linkedHashMap)).r.g();
            linkedHashMap = xb1_02.o;
            if (linkedHashMap == null) {
                xb1_02.o = linkedHashMap = new LinkedHashMap();
            }
            linkedHashMap.clear();
            map2 = bl1_02.p();
            linkedHashMap.putAll(map2);
        }
        xb1_02.q = bl1_02;
    }

    public final tb1_0 A0() {
        tb1_0 tb1_02 = this.m.q;
        tb1_02 = tb1_02 != null ? tb1_02.h1() : null;
        return tb1_02;
    }

    public final Object B() {
        return this.m.B();
    }

    public final long B0() {
        return this.n;
    }

    public final void G0() {
        long l2 = this.n;
        this.k0(l2, 0.0f, null);
    }

    public final float H0() {
        return this.m.H0();
    }

    public void P0() {
        this.z0().j();
    }

    public final void R0(long l2) {
        boolean bl2;
        Object object;
        Object object2;
        long l3 = this.n;
        boolean bl3 = Si1.b(l3, l2);
        if (!bl3) {
            this.n = l2;
            object2 = this.m;
            object = ((w32_0)object2).m.z.s;
            if (object != null) {
                ((bq1$a_0)object).r0();
            }
            tb1_0.C0((w32_0)object2);
        }
        if (!(bl2 = this.h)) {
            object2 = this.z0();
            object = new Ps2((bl1_0)object2, this);
            this.q0((Ps2)object);
        }
    }

    public final boolean W() {
        return true;
    }

    public final long W0(xb1_0 xb1_02, boolean bl2) {
        boolean bl3;
        long l2 = 0L;
        tb1_0 tb1_02 = this;
        while (!(bl3 = Intrinsics.areEqual(tb1_02, xb1_02))) {
            bl3 = tb1_02.f;
            if (!bl3 || !bl2) {
                long l3 = ((xb1_0)tb1_02).n;
                l2 = Si1.d(l2, l3);
            }
            tb1_02 = ((xb1_0)tb1_02).m.q;
            Intrinsics.checkNotNull(tb1_02);
            tb1_02 = ((w32_0)tb1_02).h1();
            Intrinsics.checkNotNull(tb1_02);
        }
        return l2;
    }

    public final float getDensity() {
        return this.m.getDensity();
    }

    public final bp1_0 getLayoutDirection() {
        return this.m.m.s;
    }

    public final void k0(long l2, float f5, Function1 function1) {
        this.R0(l2);
        boolean bl2 = this.g;
        if (bl2) {
            return;
        }
        this.P0();
    }

    public final tb1_0 r0() {
        tb1_0 tb1_02 = this.m.p;
        tb1_02 = tb1_02 != null ? tb1_02.h1() : null;
        return tb1_02;
    }

    public final zp1 u0() {
        return this.p;
    }

    public final boolean w0() {
        boolean bl2;
        bl1_0 bl1_02 = this.q;
        if (bl1_02 != null) {
            bl2 = true;
        } else {
            bl2 = false;
            bl1_02 = null;
        }
        return bl2;
    }

    public final xp1_0 y0() {
        return this.m.m;
    }

    public final bl1_0 z0() {
        Object object = this.q;
        if (object != null) {
            return object;
        }
        String string2 = "LookaheadDelegate has not been measured yet when measureResult is requested.".toString();
        object = new IllegalStateException(string2);
        throw object;
    }
}

