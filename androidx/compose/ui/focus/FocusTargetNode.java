/*
 * Decompiled with CFR 0.152.
 */
package androidx.compose.ui.focus;

import androidx.compose.ui.focus.FocusTargetNode$a;
import androidx.compose.ui.focus.FocusTargetNode$b;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;

public final class FocusTargetNode
extends LP1$c
implements J30,
G62,
rp1_0 {
    public boolean n;
    public boolean o;
    public uu0_1 p;

    public static final boolean t1(FocusTargetNode object) {
        object = ((LP1$c)object).a;
        Object object2 = ((LP1$c)object).m;
        if (object2 != 0) {
            int n3 = 16;
            Object object3 = new LP1$c[n3];
            Object object4 = new WR1((Object[])object3);
            object3 = ((LP1$c)object).f;
            if (object3 == null) {
                go0.a((WR1)object4, (LP1$c)object);
            } else {
                ((WR1)object4).b(object3);
            }
            while (true) {
                Object object5 = ((WR1)object4).l();
                boolean bl2 = false;
                object3 = null;
                if (object5 == 0) break;
                object5 = ((WR1)object4).c;
                Object object6 = 1;
                object = (LP1$c)((WR1)object4).n((int)(object5 -= object6));
                int n4 = ((LP1$c)object).d & 0x400;
                if (n4 != 0) {
                    LP1$c lP1$c = object;
                    while (lP1$c != null) {
                        int n7 = lP1$c.c & 0x400;
                        if (n7 != 0) {
                            WR1 wR1 = null;
                            Object object7 = lP1$c;
                            while (object7 != null) {
                                Object object8;
                                int n8 = object7 instanceof FocusTargetNode;
                                if (n8 != 0) {
                                    object8 = ((FocusTargetNode)object7).p;
                                    if (object8 != null) {
                                        object = ((FocusTargetNode)object7).s1();
                                        object4 = FocusTargetNode$a.$EnumSwitchMapping$0;
                                        object5 = ((Enum)object).ordinal();
                                        if ((object5 = (Object)object4[object5]) != object6 && object5 != (object2 = 2) && object5 != (object2 = 3)) {
                                            object2 = 4;
                                            if (object5 != object2) {
                                                object = new NoWhenBranchMatchedException();
                                                throw object;
                                            }
                                        } else {
                                            bl2 = true;
                                        }
                                        return bl2;
                                    }
                                } else {
                                    n8 = ((LP1$c)object7).c & 0x400;
                                    if (n8 != 0 && (n8 = object7 instanceof mo0_0) != 0) {
                                        object8 = object7;
                                        object8 = ((mo0_0)object7).o;
                                        Object object9 = 0;
                                        while (object8 != null) {
                                            int n10 = ((LP1$c)object8).c & 0x400;
                                            if (n10 != 0) {
                                                if (++object9 == object6) {
                                                    object7 = object8;
                                                } else {
                                                    if (wR1 == null) {
                                                        Object[] objectArray = new LP1$c[n3];
                                                        wR1 = new WR1(objectArray);
                                                    }
                                                    if (object7 != null) {
                                                        wR1.b(object7);
                                                        n7 = 0;
                                                        object7 = null;
                                                    }
                                                    wR1.b(object8);
                                                }
                                            }
                                            object8 = ((LP1$c)object8).f;
                                        }
                                        if (object9 == object6) continue;
                                    }
                                }
                                object7 = go0.b(wR1);
                            }
                        }
                        lP1$c = lP1$c.f;
                    }
                }
                go0.a((WR1)object4, (LP1$c)object);
            }
            return false;
        }
        bh1_1.c("visitSubtreeIf called on an unattached node");
        throw null;
    }

    public static final boolean u1(FocusTargetNode object) {
        Object object2 = ((LP1$c)object).a;
        boolean bl2 = ((LP1$c)object2).m;
        if (bl2) {
            object2 = ((LP1$c)object2).e;
            object = go0.f((fo0)object);
            while (true) {
                Object object3;
                bl2 = false;
                if (object == null) break;
                Object object4 = ((xp1_0)object).y.e;
                int n3 = ((LP1$c)object4).d & 0x400;
                if (n3 != 0) {
                    while (object2 != null) {
                        n3 = ((LP1$c)object2).c & 0x400;
                        if (n3 != 0) {
                            object4 = object2;
                            WR1 wR1 = null;
                            while (object4 != null) {
                                Object object5;
                                int n4 = object4 instanceof FocusTargetNode;
                                Object object6 = 1;
                                if (n4 != 0) {
                                    object4 = (FocusTargetNode)object4;
                                    object5 = ((FocusTargetNode)object4).p;
                                    if (object5 != null) {
                                        object = ((FocusTargetNode)object4).s1();
                                        object2 = FocusTargetNode$a.$EnumSwitchMapping$0;
                                        Object object7 = ((Enum)object).ordinal();
                                        if ((object7 = (Object)object2[object7]) != object6 && object7 != (object3 = 2)) {
                                            object3 = 3;
                                            if (object7 != object3) {
                                                object3 = 4;
                                                if (object7 != object3) {
                                                    object = new NoWhenBranchMatchedException();
                                                    throw object;
                                                }
                                            } else {
                                                bl2 = true;
                                            }
                                        }
                                        return bl2;
                                    }
                                } else {
                                    n4 = ((LP1$c)object4).c & 0x400;
                                    if (n4 != 0 && (n4 = object4 instanceof mo0_0) != 0) {
                                        object5 = object4;
                                        object5 = ((mo0_0)object4).o;
                                        Object object8 = 0;
                                        while (object5 != null) {
                                            int n7 = ((LP1$c)object5).c & 0x400;
                                            if (n7 != 0) {
                                                if (++object8 == object6) {
                                                    object4 = object5;
                                                } else {
                                                    if (wR1 == null) {
                                                        n7 = 16;
                                                        Object[] objectArray = new LP1$c[n7];
                                                        wR1 = new WR1(objectArray);
                                                    }
                                                    if (object4 != null) {
                                                        wR1.b(object4);
                                                        n3 = 0;
                                                        object4 = null;
                                                    }
                                                    wR1.b(object5);
                                                }
                                            }
                                            object5 = ((LP1$c)object5).f;
                                        }
                                        if (object8 == object6) continue;
                                    }
                                }
                                object4 = go0.b(wR1);
                            }
                        }
                        object2 = ((LP1$c)object2).e;
                    }
                }
                if ((object = ((xp1_0)object).A()) != null && (object2 = ((xp1_0)object).y) != null) {
                    object2 = ((T32)object2).d;
                    continue;
                }
                object3 = 0;
                object2 = null;
            }
            return false;
        }
        object2 = "visitAncestors called on an unattached node".toString();
        object = new IllegalStateException((String)object2);
        throw object;
    }

    public final i0_0 S() {
        return oz0_0.a;
    }

    public final Object U(OP1 object) {
        Object object2 = this.a;
        boolean bl2 = ((LP1$c)object2).m;
        if (bl2) {
            if (bl2) {
                block18: {
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
                                                object2 = object3.S();
                                                object = ((i0_0)object2).J((OP1)object);
                                                break block18;
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
                    object = ((OP1)object).a.invoke();
                }
                return object;
            }
            object2 = "visitAncestors called on an unattached node".toString();
            object = new IllegalStateException((String)object2);
            throw object;
        }
        bh1_1.b("ModifierLocal accessed from an unattached node");
        throw null;
    }

    public final void a0() {
        uu0_1 uu0_12 = this.s1();
        this.v1();
        uu0_1 uu0_13 = this.s1();
        if (uu0_12 != uu0_13) {
            OT0.b(this);
        }
    }

    public final boolean g1() {
        return false;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void k1() {
        block5: {
            boolean bl2;
            boolean bl3;
            Object object;
            block4: {
                Throwable throwable2;
                block3: {
                    Object object2;
                    block2: {
                        object = this.s1();
                        object2 = FocusTargetNode$a.$EnumSwitchMapping$0;
                        boolean bl4 = ((Enum)object).ordinal();
                        bl3 = true;
                        if ((bl4 = object2[bl4]) == bl3 || bl4 == (bl2 = 2 != 0)) break block4;
                        bl2 = 3 != 0;
                        if (bl4 != bl2) break block5;
                        object = go0.g(this).getFocusOwner().c();
                        try {
                            bl2 = ((xu0_0)object).c;
                            if (!bl2) break block2;
                            xu0_0.a((xu0_0)object);
                        }
                        catch (Throwable throwable2) {
                            break block3;
                        }
                    }
                    ((xu0_0)object).c = bl3;
                    object2 = uu0_1.Inactive;
                    this.w1((uu0_1)object2);
                    object2 = Unit.a;
                    xu0_0.b((xu0_0)object);
                    break block5;
                }
                xu0_0.b((xu0_0)object);
                throw throwable2;
            }
            object = go0.g(this).getFocusOwner();
            bl2 = false;
            int n3 = 8;
            object.l(n3, bl3, false);
            object = go0.g(this).getFocusOwner();
            object.g(this);
        }
        this.p = null;
    }

    public final ju0_0 r1() {
        Object object = new Object();
        int n3 = 1;
        ((ju0_0)object).a = n3;
        Object object2 = ou0_0.b;
        ((ju0_0)object).b = object2;
        ((ju0_0)object).c = object2;
        ((ju0_0)object).d = object2;
        ((ju0_0)object).e = object2;
        ((ju0_0)object).f = object2;
        ((ju0_0)object).g = object2;
        ((ju0_0)object).h = object2;
        ((ju0_0)object).i = object2;
        ((ju0_0)object).j = object2 = hu0_2.c;
        ((ju0_0)object).k = object2 = iu0_2.c;
        object2 = this.a;
        boolean bl2 = ((LP1$c)object2).m;
        if (bl2) {
            xp1_0 xp1_02 = go0.f(this);
            Object object3 = object2;
            block0: while (xp1_02 != null) {
                Object object4 = xp1_02.y.e;
                int n4 = ((LP1$c)object4).d & 0xC00;
                if (n4 != 0) {
                    while (object3 != null) {
                        n4 = ((LP1$c)object3).c;
                        int n7 = n4 & 0xC00;
                        if (n7 != 0) {
                            if (object3 != object2 && (n7 = n4 & 0x400) != 0) break block0;
                            if ((n4 &= 0x800) != 0) {
                                object4 = object3;
                                n7 = 0;
                                WR1 wR1 = null;
                                while (object4 != null) {
                                    int n8 = object4 instanceof lu0_0;
                                    if (n8 != 0) {
                                        object4 = (lu0_0)object4;
                                        object4.J((gU0)object);
                                    } else {
                                        n8 = ((LP1$c)object4).c & 0x800;
                                        if (n8 != 0 && (n8 = object4 instanceof mo0_0) != 0) {
                                            Object object5 = object4;
                                            object5 = ((mo0_0)object4).o;
                                            int n10 = 0;
                                            while (object5 != null) {
                                                int n14 = ((LP1$c)object5).c & 0x800;
                                                if (n14 != 0) {
                                                    if (++n10 == n3) {
                                                        object4 = object5;
                                                    } else {
                                                        if (wR1 == null) {
                                                            n14 = 16;
                                                            Object[] objectArray = new LP1$c[n14];
                                                            wR1 = new WR1(objectArray);
                                                        }
                                                        if (object4 != null) {
                                                            wR1.b(object4);
                                                            n4 = 0;
                                                            object4 = null;
                                                        }
                                                        wR1.b(object5);
                                                    }
                                                }
                                                object5 = ((LP1$c)object5).f;
                                            }
                                            if (n10 == n3) continue;
                                        }
                                    }
                                    object4 = go0.b(wR1);
                                }
                            }
                        }
                        object3 = ((LP1$c)object3).e;
                    }
                }
                if ((xp1_02 = xp1_02.A()) != null && (object3 = xp1_02.y) != null) {
                    object3 = ((T32)object3).d;
                    continue;
                }
                object3 = null;
            }
            return object;
        }
        String string2 = "visitAncestors called on an unattached node".toString();
        object = new IllegalStateException(string2);
        throw object;
    }

    public final uu0_1 s1() {
        Object object = this.a.h;
        object = object != null && (object = ((w32_0)object).m) != null && (object = ((xp1_0)object).i) != null && (object = object.getFocusOwner()) != null ? object.c() : null;
        if ((object == null || (object = (uu0_1)((xu0_0)object).a.b(this)) == null) && (object = this.p) == null) {
            object = uu0_1.Inactive;
        }
        return object;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void v1() {
        Object object;
        boolean bl2;
        boolean bl3;
        boolean bl4;
        Object object2;
        block11: {
            object2 = this.p;
            bl4 = true;
            if (object2 == null) {
                Throwable throwable2;
                block10: {
                    block9: {
                        if (object2 != null) {
                            bl3 = true;
                        } else {
                            bl3 = false;
                            object2 = null;
                        }
                        if (!(bl3 ^= bl4)) {
                            String string2 = "Re-initializing focus target node.".toString();
                            object2 = new IllegalStateException(string2);
                            throw object2;
                        }
                        object2 = go0.g(this).getFocusOwner().c();
                        try {
                            bl2 = ((xu0_0)object2).c;
                            if (!bl2) break block9;
                            xu0_0.a((xu0_0)object2);
                        }
                        catch (Throwable throwable2) {
                            break block10;
                        }
                    }
                    ((xu0_0)object2).c = bl4;
                    bl2 = FocusTargetNode.u1(this);
                    object = bl2 && (bl2 = (boolean)FocusTargetNode.t1(this)) ? (Object)uu0_1.ActiveParent : (Object)uu0_1.Inactive;
                    this.w1((uu0_1)object);
                    object = Unit.a;
                    xu0_0.b((xu0_0)object2);
                    break block11;
                }
                xu0_0.b((xu0_0)object2);
                throw throwable2;
            }
        }
        object2 = this.s1();
        object = FocusTargetNode$a.$EnumSwitchMapping$0;
        bl3 = ((Enum)object2).ordinal();
        if ((bl3 = object[bl3]) != bl4 && bl3 != (bl2 = 2 != 0)) {
            return;
        }
        object2 = new Ref$ObjectRef();
        object = new FocusTargetNode$b;
        ((FocusTargetNode$b)object)((Ref$ObjectRef)object2, this);
        H62.a(this, (Function0)object);
        object2 = ((Ref$ObjectRef)object2).element;
        if (object2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("focusProperties");
            bl3 = false;
            object2 = null;
        } else {
            object2 = (gU0)object2;
        }
        bl3 = object2.c();
        if (bl3) return;
        object2 = go0.g(this).getFocusOwner();
        object2.p(bl4);
    }

    public final void w1(uu0_1 uu0_12) {
        xu0_0 xu0_02 = go0.g(this).getFocusOwner().c();
        if (uu0_12 != null) {
            xu0_02.a.i(this, uu0_12);
            return;
        }
        xu0_02.getClass();
        bh1_1.d("requires a non-null focus state");
        throw null;
    }
}

