/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.KeyEvent
 */
import android.view.KeyEvent;
import java.io.Serializable;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

public abstract class B0
extends mo0_0
implements gw2_0,
eo1_2,
nt0_0,
dy2_0,
yr3_0 {
    public static final B0$a G;
    public x91 A;
    public final LinkedHashMap B;
    public long C;
    public wr1_1 D;
    public boolean E;
    public final B0$a F;
    public wr1_1 p;
    public Qg1 q;
    public String r;
    public CP2 s;
    public boolean t;
    public Function0 u;
    public final CU0 v;
    public final EU0 w;
    public vg3_2 x;
    public fo0 y;
    public Ey2$b z;

    static {
        B0$a b0$a;
        G = b0$a = new Object();
    }

    public B0(wr1_1 object, Qg1 object2, boolean bl2, String string2, CP2 cP2, Function0 function0) {
        boolean bl3;
        long l2;
        this.p = object;
        this.q = object2;
        this.r = string2;
        this.s = cP2;
        this.t = bl2;
        this.u = function0;
        this.v = object = new CU0();
        object2 = this.p;
        this.w = object = new EU0((wr1_1)object2);
        object = new LinkedHashMap();
        this.B = object;
        this.C = l2 = 0L;
        this.D = object = this.p;
        if (object == null && (object = this.q) != null) {
            bl3 = true;
        } else {
            bl3 = false;
            object = null;
        }
        this.E = bl3;
        this.F = object = G;
    }

    public final void A0() {
        x91 x912;
        Object object = this.p;
        if (object != null && (x912 = this.A) != null) {
            y91 y912 = new y91(x912);
            object.c(y912);
        }
        this.A = null;
        object = this.x;
        if (object != null) {
            object.A0();
        }
    }

    public final void F0() {
        this.A0();
    }

    public final void G(mv2_0 mv2_02, Nv2 nv2, long l2) {
        Object object;
        Object object2;
        int n3 = 33;
        long l3 = l2 >> n3;
        int n4 = 32;
        long l4 = l2 << n4 >> n3;
        long l7 = 0xFFFFFFFFL;
        long l8 = (l3 <<= n4) | (l4 &= l7);
        long l12 = l8 >> n4;
        n4 = (int)l12;
        float f5 = n4;
        float f6 = (int)(l8 & l7);
        this.C = l8 = h72.a(f5, f6);
        this.x1();
        n3 = (int)(this.t ? 1 : 0);
        if (n3 != 0 && nv2 == (object2 = Nv2.Main)) {
            n3 = mv2_02.d;
            f5 = 5.6E-45f;
            int n7 = Pv2.a(n3, 4);
            n4 = 3;
            if (n7 != 0) {
                object2 = this.f1();
                object = new B0$e(this, null);
                Ae3.d((i90_0)object2, null, null, (Function2)object, n4);
            } else {
                n7 = 5;
                f5 = 7.0E-45f;
                if ((n3 = (int)(Pv2.a(n3, n7) ? 1 : 0)) != 0) {
                    object2 = this.f1();
                    object = new B0$f(this, null);
                    Ae3.d((i90_0)object2, null, null, (Function2)object, n4);
                }
            }
        }
        if ((object2 = this.x) == null) {
            object2 = new B0$g(this, null);
            object = tg3_0.a;
            object = new wg3_2(null, null, null, (Function2)object2);
            this.r1((fo0)object);
            this.x = object;
        }
        if ((object2 = this.x) != null) {
            object2.G(mv2_02, nv2, l2);
        }
    }

    public final void L0(tu0_0 tu0_02) {
        boolean bl2 = tu0_02.isFocused();
        if (bl2) {
            this.x1();
        }
        if (bl2 = this.t) {
            EU0 eU0 = this.w;
            eU0.L0(tu0_02);
        }
    }

    public final /* synthetic */ boolean N() {
        return false;
    }

    public final /* synthetic */ void P() {
    }

    public final /* synthetic */ boolean Y0() {
        return false;
    }

    public final void a1() {
        this.A0();
    }

    public final boolean c1() {
        return true;
    }

    public final boolean g1() {
        return false;
    }

    public final void i0(UY2 uY2) {
        int n3;
        Object object = this.s;
        if (object != null) {
            Intrinsics.checkNotNull(object);
            n3 = ((CP2)object).a;
            RY2.f(uY2, n3);
        }
        object = this.r;
        Object object2 = new B0$b(this);
        Object object3 = RY2.a;
        object3 = yY2.b;
        H1 h1 = new H1((String)object, (fx0_2)object2);
        uY2.a((TY2)object3, h1);
        n3 = (int)(this.t ? 1 : 0);
        if (n3 != 0) {
            object = this.w;
            ((EU0)object).i0(uY2);
        } else {
            object = MY2.j;
            object2 = Unit.a;
            uY2.a((TY2)object, object2);
        }
        this.u1(uY2);
    }

    public final void j1() {
        boolean bl2 = this.E;
        if (!bl2) {
            this.x1();
        }
        if (bl2 = this.t) {
            LP1$c lP1$c = this.v;
            this.r1(lP1$c);
            lP1$c = this.w;
            this.r1(lP1$c);
        }
    }

    public final void k1() {
        this.w1();
        Object object = this.D;
        if (object == null) {
            this.p = null;
        }
        if ((object = this.y) != null) {
            this.s1((fo0)object);
        }
        this.y = null;
    }

    public final boolean n0(KeyEvent keyEvent) {
        return false;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final boolean u0(KeyEvent object) {
        Object object2;
        long l2;
        this.x1();
        int n3 = this.t;
        Serializable serializable = this.B;
        int n4 = 3;
        int n7 = 160;
        int n8 = 66;
        int n10 = 23;
        int n14 = 32;
        boolean bl2 = false;
        int n15 = 1;
        if (n3 != 0) {
            n3 = JV.b;
            n3 = bo1_1.d((KeyEvent)object);
            int n16 = 2;
            if ((n3 = (int)(ao1_2.a(n3, n16) ? 1 : 0)) != 0 && ((n3 = (int)(l2 = bo1_1.c((KeyEvent)object) >> n14)) == n10 || n3 == n8 || n3 == n7)) {
                long l3 = to1_0.a(object.getKeyCode());
                Object object3 = new Rn1(l3);
                n3 = (int)(serializable.containsKey(object3) ? 1 : 0);
                if (n3 != 0) return bl2;
                l3 = this.C;
                object3 = new Ey2$b(l3);
                int n17 = object.getKeyCode();
                l3 = to1_0.a(n17);
                object = new Rn1(l3);
                serializable.put(object, object3);
                object = this.p;
                if (object == null) return true;
                object = this.f1();
                serializable = new B0$c(this, (Ey2$b)object3, null);
                Ae3.d((i90_0)object, null, null, (Function2)((Object)serializable), n4);
                return true;
            }
        }
        if ((n3 = (int)(this.t ? 1 : 0)) == 0) return bl2;
        n3 = JV.b;
        n3 = (int)(ao1_2.a(bo1_1.d((KeyEvent)object), n15) ? 1 : 0);
        if (n3 == 0) return bl2;
        l2 = bo1_1.c((KeyEvent)object) >> n14;
        n3 = (int)l2;
        if (n3 != n10 && n3 != n8 && n3 != n7) return bl2;
        int n18 = object.getKeyCode();
        long l4 = to1_0.a(n18);
        object = new Rn1(l4);
        if ((object = (Ey2$b)serializable.remove(object)) != null && (object2 = this.p) != null) {
            object2 = this.f1();
            serializable = new B0$d(this, (Ey2$b)object, null);
            Ae3.d((i90_0)object2, null, null, (Function2)((Object)serializable), n4);
        }
        object = this.u;
        object.invoke();
        return true;
    }

    public void u1(UY2 uY2) {
    }

    public final Object v() {
        return this.F;
    }

    public abstract Object v1(hw2_0 var1, f80_0 var2);

    public final void w1() {
        wr1_1 wr1_12 = this.p;
        LinkedHashMap linkedHashMap = this.B;
        if (wr1_12 != null) {
            boolean bl2;
            kj1 kj12;
            Object object = this.z;
            if (object != null) {
                kj12 = new Ey2$a((Ey2$b)object);
                wr1_12.c(kj12);
            }
            if ((object = this.A) != null) {
                kj12 = new y91((x91)object);
                wr1_12.c(kj12);
            }
            object = ((Iterable)linkedHashMap.values()).iterator();
            while (bl2 = object.hasNext()) {
                kj12 = (Ey2$b)object.next();
                Ey2$a ey2$a = new Ey2$a((Ey2$b)kj12);
                wr1_12.c(ey2$a);
            }
        }
        this.z = null;
        this.A = null;
        linkedHashMap.clear();
    }

    public final void x1() {
        Object object = this.y;
        if (object != null) {
            return;
        }
        object = this.q;
        if (object != null) {
            Object object2 = this.p;
            if (object2 == null) {
                this.p = object2 = new xr1_1();
            }
            object2 = this.w;
            wr1_1 wr1_12 = this.p;
            ((EU0)object2).u1(wr1_12);
            object2 = this.p;
            Intrinsics.checkNotNull(object2);
            object = object.a((wr1_1)object2);
            this.r1((fo0)object);
            this.y = object;
        }
    }

    public final void y1(wr1_1 object, Qg1 object2, boolean bl2, String object3, CP2 cP2, Function0 function0) {
        boolean bl3;
        boolean bl4;
        boolean bl5;
        Object object4;
        block17: {
            block16: {
                boolean bl6;
                object4 = this.D;
                boolean bl7 = Intrinsics.areEqual(object4, object);
                boolean bl8 = false;
                bl5 = true;
                if (!bl7) {
                    this.w1();
                    this.D = object;
                    this.p = object;
                    bl4 = true;
                } else {
                    bl4 = false;
                    object = null;
                }
                object4 = this.q;
                bl7 = Intrinsics.areEqual(object4, object2);
                if (!bl7) {
                    this.q = object2;
                    bl4 = true;
                }
                bl3 = this.t;
                object4 = this.w;
                if (bl3 != bl2) {
                    object2 = this.v;
                    if (bl2) {
                        this.r1((fo0)object2);
                        this.r1((fo0)object4);
                    } else {
                        this.s1((fo0)object2);
                        this.s1((fo0)object4);
                        this.w1();
                    }
                    object2 = go0.f(this);
                    ((xp1_0)object2).J();
                    this.t = bl2;
                }
                if (!(bl3 = Intrinsics.areEqual(object2 = this.r, object3))) {
                    this.r = object3;
                    object2 = go0.f(this);
                    ((xp1_0)object2).J();
                }
                if (!(bl3 = Intrinsics.areEqual(object2 = this.s, cP2))) {
                    this.s = cP2;
                    object2 = go0.f(this);
                    ((xp1_0)object2).J();
                }
                this.u = function0;
                bl3 = this.E;
                wr1_1 wr1_12 = this.D;
                if (wr1_12 == null && (object3 = this.q) != null) {
                    bl6 = true;
                } else {
                    bl6 = false;
                    object3 = null;
                }
                if (bl3 == bl6) break block16;
                if (wr1_12 == null && (object2 = this.q) != null) {
                    bl8 = true;
                }
                this.E = bl8;
                if (!bl8 && (object2 = this.y) == null) break block17;
            }
            bl5 = bl4;
        }
        if (bl5 && ((object = this.y) != null || !(bl3 = this.E))) {
            if (object != null) {
                this.s1((fo0)object);
            }
            bl4 = false;
            object = null;
            this.y = null;
            this.x1();
        }
        object = this.p;
        ((EU0)object4).u1((wr1_1)object);
    }
}

