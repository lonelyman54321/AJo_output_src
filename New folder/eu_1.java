/*
 * Decompiled with CFR 0.152.
 */
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 * Renamed from Eu
 */
public final class eu_1
extends LP1$c
implements rp1_1,
it0_0,
dy2_0,
gw2_0,
rp1_0,
TP1,
sm2_0,
xp1_1,
c01_0,
nt0_0,
lu0_0,
qu0_1,
Tg2,
uE {
    public LP1$b n;
    public boolean o;
    public du_0 p;
    public HashSet q;
    public zp1 r;

    public final void A0() {
        LP1$b lP1$b = this.n;
        Intrinsics.checkNotNull(lP1$b, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier");
        ((fw2)lP1$b).h().e();
    }

    public final void C0() {
        this.o = true;
        jt0_0.a(this);
    }

    public final Object F(Vo0 object, Object object2) {
        object = this.n;
        Intrinsics.checkNotNull(object, "null cannot be cast to non-null type androidx.compose.ui.layout.ParentDataModifier");
        return ((Rm2)object).k();
    }

    public final void F0() {
        this.A0();
    }

    public final void G(mv2_0 mv2_02, Nv2 nv2, long l2) {
        LP1$b lP1$b = this.n;
        Intrinsics.checkNotNull(lP1$b, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier");
        ((fw2)lP1$b).h().f(mv2_02, nv2);
    }

    public final void J(gU0 object) {
        object = this.n;
        boolean bl2 = object instanceof zt0_0;
        if (bl2) {
            ((zt0_0)object).o();
            return;
        }
        bh1_1.c("applyFocusProperties called on wrong node");
        throw null;
    }

    public final void L0(tu0_0 object) {
        object = this.n;
        boolean bl2 = object instanceof mt0_0;
        if (bl2) {
            ((mt0_0)object).i();
            return;
        }
        bh1_1.c("onFocusEvent called on wrong node");
        throw null;
    }

    public final /* synthetic */ boolean N() {
        return false;
    }

    public final void P() {
        LP1$b lP1$b = this.n;
        Intrinsics.checkNotNull(lP1$b, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier");
        ((fw2)lP1$b).h().getClass();
    }

    public final i0_0 S() {
        i0_0 i0_02 = this.p;
        if (i0_02 == null) {
            i0_02 = oz0_0.a;
        }
        return i0_02;
    }

    public final Object U(OP1 object) {
        this.q.add(object);
        Object object2 = this.a;
        boolean bl2 = ((LP1$c)object2).m;
        if (bl2) {
            object2 = ((LP1$c)object2).e;
            xp1_0 xp1_02 = go0.f(this);
            while (xp1_02 != null) {
                Object object3 = xp1_02.y.e;
                int n3 = ((LP1$c)object3).d & 0x20;
                if (n3 != 0) {
                    while (object2 != null) {
                        n3 = ((LP1$c)object2).c & 0x20;
                        if (n3 != 0) {
                            object3 = object2;
                            WR1 wR1 = null;
                            while (object3 != null) {
                                Object object4;
                                int n4 = object3 instanceof rp1_0;
                                if (n4 != 0) {
                                    object4 = (object3 = (rp1_0)object3).S();
                                    n4 = (int)(((i0_0)object4).F((OP1)object) ? 1 : 0);
                                    if (n4 != 0) {
                                        return object3.S().J((OP1)object);
                                    }
                                } else {
                                    n4 = ((LP1$c)object3).c & 0x20;
                                    if (n4 != 0 && (n4 = object3 instanceof mo0_0) != 0) {
                                        int n7;
                                        object4 = object3;
                                        object4 = ((mo0_0)object3).o;
                                        int n8 = 0;
                                        while (true) {
                                            n7 = 1;
                                            if (object4 == null) break;
                                            int n10 = ((LP1$c)object4).c & 0x20;
                                            if (n10 != 0) {
                                                if (++n8 == n7) {
                                                    object3 = object4;
                                                } else {
                                                    if (wR1 == null) {
                                                        n7 = 16;
                                                        Object[] objectArray = new LP1$c[n7];
                                                        wR1 = new WR1(objectArray);
                                                    }
                                                    if (object3 != null) {
                                                        wR1.b(object3);
                                                        n3 = 0;
                                                        object3 = null;
                                                    }
                                                    wR1.b(object4);
                                                }
                                            }
                                            object4 = ((LP1$c)object4).f;
                                        }
                                        if (n8 == n7) continue;
                                    }
                                }
                                object3 = go0.b(wR1);
                            }
                        }
                        object2 = ((LP1$c)object2).e;
                    }
                }
                if ((xp1_02 = xp1_02.A()) != null && (object2 = xp1_02.y) != null) {
                    object2 = ((T32)object2).d;
                    continue;
                }
                object2 = null;
            }
            return ((OP1)object).a.invoke();
        }
        object2 = "visitAncestors called on an unattached node".toString();
        object = new IllegalStateException((String)object2);
        throw object;
    }

    public final void X(w32_0 object) {
        object = this.n;
        Intrinsics.checkNotNull(object, "null cannot be cast to non-null type androidx.compose.ui.layout.OnGloballyPositionedModifier");
        ((B82)object).l();
    }

    public final boolean Y0() {
        LP1$b lP1$b = this.n;
        Intrinsics.checkNotNull(lP1$b, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier");
        ((fw2)lP1$b).h().getClass();
        return true;
    }

    public final void a1() {
        this.A0();
    }

    public final /* synthetic */ boolean c1() {
        return false;
    }

    public final Vo0 getDensity() {
        return go0.f((fo0)this).r;
    }

    public final bp1_0 getLayoutDirection() {
        return go0.f((fo0)this).s;
    }

    public final void i0(UY2 uY2) {
        Iterator iterator = this.n;
        Intrinsics.checkNotNull(iterator, "null cannot be cast to non-null type androidx.compose.ui.semantics.SemanticsModifier");
        iterator = ((by2_1)((Object)iterator)).m();
        Object object = "null cannot be cast to non-null type androidx.compose.ui.semantics.SemanticsConfiguration";
        Intrinsics.checkNotNull(uY2, (String)object);
        uY2 = (zy2_0)uY2;
        uY2.getClass();
        boolean bl2 = ((zy2_0)((Object)iterator)).b;
        boolean bl3 = true;
        if (bl2) {
            ((zy2_0)uY2).b = bl3;
        }
        if (bl2 = ((zy2_0)((Object)iterator)).c) {
            ((zy2_0)uY2).c = bl3;
        }
        iterator = ((zy2_0)((Object)iterator)).a.entrySet().iterator();
        while (bl2 = iterator.hasNext()) {
            object = iterator.next();
            TY2 tY2 = (TY2)object.getKey();
            object = object.getValue();
            LinkedHashMap linkedHashMap = ((zy2_0)uY2).a;
            boolean bl4 = linkedHashMap.containsKey(tY2);
            if (!bl4) {
                linkedHashMap.put(tY2, object);
                continue;
            }
            bl4 = object instanceof H1;
            if (!bl4) continue;
            Object object2 = linkedHashMap.get(tY2);
            Intrinsics.checkNotNull(object2, "null cannot be cast to non-null type androidx.compose.ui.semantics.AccessibilityAction<*>");
            object2 = (H1)object2;
            Object object3 = ((H1)object2).a;
            if (object3 == null) {
                object3 = object;
                object3 = ((H1)object).a;
            }
            if ((object2 = ((H1)object2).b) == null) {
                object = (H1)object;
                object2 = ((H1)object).b;
            }
            H1 h1 = new H1((String)object3, (fx0_2)object2);
            linkedHashMap.put(tY2, h1);
        }
    }

    public final void j1() {
        this.r1(true);
    }

    public final void k1() {
        this.s1();
    }

    public final long l() {
        return dj1.b(go0.d((fo0)this, (int)128).c);
    }

    public final int maxIntrinsicHeight(Rj1 rj1, Qj1 qj1, int n3) {
        LP1$b lP1$b = this.n;
        Intrinsics.checkNotNull(lP1$b, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        return ((op1_1)lP1$b).maxIntrinsicHeight(rj1, qj1, n3);
    }

    public final int maxIntrinsicWidth(Rj1 rj1, Qj1 qj1, int n3) {
        LP1$b lP1$b = this.n;
        Intrinsics.checkNotNull(lP1$b, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        return ((op1_1)lP1$b).maxIntrinsicWidth(rj1, qj1, n3);
    }

    public final bl1_0 measure-3p2s80s(dl1_1 dl1_12, xk1_0 xk1_02, long l2) {
        LP1$b lP1$b = this.n;
        Intrinsics.checkNotNull(lP1$b, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        return ((op1_1)lP1$b).measure-3p2s80s(dl1_12, xk1_02, l2);
    }

    public final int minIntrinsicHeight(Rj1 rj1, Qj1 qj1, int n3) {
        LP1$b lP1$b = this.n;
        Intrinsics.checkNotNull(lP1$b, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        return ((op1_1)lP1$b).minIntrinsicHeight(rj1, qj1, n3);
    }

    public final int minIntrinsicWidth(Rj1 rj1, Qj1 qj1, int n3) {
        LP1$b lP1$b = this.n;
        Intrinsics.checkNotNull(lP1$b, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        return ((op1_1)lP1$b).minIntrinsicWidth(rj1, qj1, n3);
    }

    public final void n(E60 e60) {
        boolean bl2;
        LP1$b lP1$b = this.n;
        Intrinsics.checkNotNull(lP1$b, "null cannot be cast to non-null type androidx.compose.ui.draw.DrawModifier");
        LP1$b lP1$b2 = lP1$b;
        lP1$b2 = (ht0)lP1$b;
        boolean bl3 = this.o;
        if (bl3 && (bl2 = lP1$b instanceof dt0)) {
            lP1$b = this.n;
            bl3 = lP1$b instanceof dt0;
            if (bl3) {
                ch2 ch22 = go0.g(this).getSnapshotObserver();
                Gu$b gu$b = Gu.b;
                fu_0 fu_02 = new fu_0(lP1$b, this);
                ch22.a(this, gu$b, fu_02);
            }
            bl2 = false;
            lP1$b = null;
            this.o = false;
        }
        lP1$b2.n(e60);
    }

    public final void o0(zp1 object) {
        this.r = object;
        object = this.n;
        boolean bl2 = object instanceof P82;
        if (bl2) {
            object = (P82)object;
            object.f();
        }
    }

    public final void r1(boolean bl2) {
        boolean bl3 = this.m;
        Eu$b eu$b = null;
        if (bl3) {
            Object object;
            int n3;
            Object object2;
            Object object3;
            Object object4 = this.n;
            int n4 = this.c & 0x20;
            if (n4 != 0) {
                Object object5;
                n4 = object4 instanceof pp1_0;
                if (n4 != 0) {
                    object3 = new Eu$a(this);
                    object5 = go0.g(this);
                    object5.t((Function0)object3);
                }
                if ((n4 = object4 instanceof sp1_0) != 0) {
                    boolean bl4;
                    object3 = object4;
                    object3 = (sp1_0)object4;
                    object5 = this.p;
                    if (object5 != null && (bl4 = ((du_0)object5).F((OP1)(object2 = object3.getKey())))) {
                        ((du_0)object5).a = object3;
                        object5 = go0.g(this).getModifierLocalManager();
                        object3 = object3.getKey();
                        ((QP1)object5).b.b(this);
                        object2 = ((QP1)object5).c;
                        ((WR1)object2).b(object3);
                        ((QP1)object5).a();
                    } else {
                        object5 = new i0_0();
                        ((du_0)object5).a = object3;
                        this.p = object5;
                        n3 = (int)(Gu.a(this) ? 1 : 0);
                        if (n3 != 0) {
                            object5 = go0.g(this).getModifierLocalManager();
                            object3 = object3.getKey();
                            ((QP1)object5).b.b(this);
                            object2 = ((QP1)object5).c;
                            ((WR1)object2).b(object3);
                            ((QP1)object5).a();
                        }
                    }
                }
            }
            n4 = this.c & 4;
            n3 = 2;
            if (n4 != 0) {
                n4 = object4 instanceof dt0;
                if (n4 != 0) {
                    n4 = 1;
                    this.o = n4;
                }
                if (!bl2) {
                    object3 = go0.d(this, n3);
                    ((w32_0)object3).p1();
                }
            }
            if ((n4 = this.c & n3) != 0) {
                n4 = (int)(Gu.a(this) ? 1 : 0);
                if (n4 != 0) {
                    object3 = this.h;
                    Intrinsics.checkNotNull(object3);
                    object2 = object3;
                    object2 = (sp1_1)object3;
                    ((sp1_1)object2).H1(this);
                    object3 = ((w32_0)object3).G;
                    if (object3 != null) {
                        object3.invalidate();
                    }
                }
                if (!bl2) {
                    go0.d(this, n3).p1();
                    object = go0.f(this);
                    ((xp1_0)object).I();
                }
            }
            if (bl2 = object4 instanceof ii2_0) {
                object = object4;
                object = (ii2_0)object4;
                object3 = go0.f(this);
                object.g((xp1_0)object3);
            }
            if (bl2 = this.c & 0x80) {
                bl2 = object4 instanceof Y82;
                if (bl2 && (bl2 = Gu.a(this))) {
                    object = go0.f(this);
                    ((xp1_0)object).I();
                }
                if (bl2 = object4 instanceof P82) {
                    this.r = null;
                    bl2 = Gu.a(this);
                    if (bl2) {
                        object = go0.g(this);
                        eu$b = new Eu$b(this);
                        object.d(eu$b);
                    }
                }
            }
            if ((bl2 = this.c & 0x100) && (bl2 = object4 instanceof B82) && (bl2 = Gu.a(this))) {
                object = go0.f(this);
                ((xp1_0)object).I();
            }
            if (bl2 = object4 instanceof pu0_0) {
                object = object4;
                object = ((pu0_0)object4).c().a;
                ((WR1)object).b(this);
            }
            if ((bl2 = this.c & 0x10) && (bl2 = object4 instanceof fw2)) {
                object = ((fw2)object4).h();
                ((tv_0)object).b = object4 = this.h;
            }
            if (bl2 = this.c & 8) {
                object = go0.g(this);
                object.x();
            }
            return;
        }
        bh1_1.c("initializeModifier called on unattached node");
        throw null;
    }

    public final boolean s0() {
        return this.m;
    }

    public final void s1() {
        boolean bl2 = this.m;
        if (bl2) {
            Object object;
            Object object2 = this.n;
            int n3 = this.c & 0x20;
            if (n3 != 0) {
                Object object3;
                n3 = object2 instanceof sp1_0;
                if (n3 != 0) {
                    object = go0.g(this).getModifierLocalManager();
                    object3 = object2;
                    object3 = ((sp1_0)object2).getKey();
                    WR1 wR1 = ((QP1)object).d;
                    xp1_0 xp1_02 = go0.f(this);
                    wR1.b(xp1_02);
                    wR1 = ((QP1)object).e;
                    wR1.b(object3);
                    ((QP1)object).a();
                }
                if ((n3 = object2 instanceof pp1_0) != 0) {
                    object = object2;
                    object = (pp1_0)object2;
                    object3 = Gu.a;
                    object.a((TP1)object3);
                }
            }
            if ((n3 = this.c & 8) != 0) {
                object = go0.g(this);
                object.x();
            }
            if ((n3 = object2 instanceof pu0_0) != 0) {
                object2 = ((pu0_0)object2).c().a;
                ((WR1)object2).m(this);
            }
            return;
        }
        bh1_1.c("unInitializeModifier called on unattached node");
        throw null;
    }

    public final void t1() {
        boolean bl2 = this.m;
        if (bl2) {
            this.q.clear();
            ch2 ch22 = go0.g(this).getSnapshotObserver();
            Gu$c gu$c = Gu.c;
            Eu$c eu$c = new Eu$c(this);
            ch22.a(this, gu$c, eu$c);
        }
    }

    public final String toString() {
        return this.n.toString();
    }

    public final void x(long l2) {
        LP1$b lP1$b = this.n;
        boolean bl2 = lP1$b instanceof Y82;
        if (bl2) {
            lP1$b = (Y82)lP1$b;
            lP1$b.e();
        }
    }
}

