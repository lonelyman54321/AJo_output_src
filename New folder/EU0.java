/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.ui.focus.FocusTargetNode;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;

public final class EU0
extends mo0_0
implements nt0_0,
dy2_0,
c01_0,
qu0_1 {
    public tu0_0 p;
    public final DU0 q;
    public final gu0_1 r;
    public final hu0_0 s;

    public EU0(wr1_1 object) {
        DU0 dU0;
        dU0.n = object;
        this.r1(dU0);
        this.q = dU0;
        object = new LP1$c();
        this.r1((fo0)object);
        this.r = object;
        object = new LP1$c();
        this.r1((fo0)object);
        this.s = object;
        object = new FocusTargetNode();
        this.r1((fo0)object);
    }

    public final void L0(tu0_0 tu0_02) {
        tu0_0 tu0_03 = this.p;
        boolean bl2 = Intrinsics.areEqual(tu0_03, tu0_02);
        if (!bl2) {
            Object object;
            boolean bl3;
            Object object2;
            Object object3;
            bl2 = tu0_02.isFocused();
            rs1_0 rs1_02 = null;
            if (bl2) {
                object3 = this.f1();
                object2 = new EU0$b(this, null);
                int n3 = 3;
                Ae3.d((i90_0)object3, null, null, (Function2)object2, n3);
            }
            if (bl3 = this.m) {
                object3 = go0.f(this);
                ((xp1_0)object3).J();
            }
            object3 = this.q;
            object2 = ((DU0)object3).n;
            if (object2 != null) {
                if (bl2) {
                    object = ((DU0)object3).o;
                    if (object != null) {
                        ST0 sT0 = new ST0((rt0_0)object);
                        ((DU0)object3).r1((wr1_1)object2, sT0);
                        ((DU0)object3).o = null;
                    }
                    object = new Object();
                    ((DU0)object3).r1((wr1_1)object2, (kj1)object);
                    ((DU0)object3).o = object;
                } else {
                    object = ((DU0)object3).o;
                    if (object != null) {
                        ST0 sT0 = new ST0((rt0_0)object);
                        ((DU0)object3).r1((wr1_1)object2, sT0);
                        ((DU0)object3).o = null;
                    }
                }
            }
            object3 = this.s;
            boolean bl4 = ((hu0_0)object3).n;
            if (bl2 != bl4) {
                if (!bl2) {
                    object2 = ((hu0_0)object3).r1();
                    if (object2 != null) {
                        ((iu0_0)object2).r1(null);
                    }
                } else {
                    object2 = ((hu0_0)object3).o;
                    if (object2 != null) {
                        Intrinsics.checkNotNull(object2);
                        bl4 = object2.e();
                        if (bl4 && (object2 = ((hu0_0)object3).r1()) != null) {
                            object = ((hu0_0)object3).o;
                            ((iu0_0)object2).r1((zp1)object);
                        }
                    }
                }
                ((hu0_0)object3).n = bl2;
            }
            object3 = this.r;
            if (bl2) {
                object3.getClass();
                object2 = new Ref$ObjectRef();
                object = new FU0((Ref$ObjectRef)object2, (gu0_1)object3);
                H62.a((LP1$c)object3, (Function0)object);
                object2 = (cs2_0)((Ref$ObjectRef)object2).element;
                if (object2 != null) {
                    rs1_02 = object2.a();
                }
                ((gu0_1)object3).n = rs1_02;
            } else {
                object2 = ((gu0_1)object3).n;
                if (object2 != null) {
                    object2.release();
                }
                ((gu0_1)object3).n = null;
            }
            ((gu0_1)object3).o = bl2;
            this.p = tu0_02;
        }
    }

    public final /* synthetic */ boolean N() {
        return false;
    }

    public final void X(w32_0 w32_02) {
        this.s.X(w32_02);
    }

    public final /* synthetic */ boolean c1() {
        return false;
    }

    public final boolean g1() {
        return false;
    }

    public final void i0(UY2 uY2) {
        boolean bl2;
        boolean bl3;
        Object object = this.p;
        boolean bl4 = false;
        Object object2 = null;
        if (object != null && (bl3 = object.isFocused()) == (bl2 = true)) {
            bl4 = true;
        }
        object = RY2.a;
        object = MY2.l;
        Object object3 = RY2.a[4];
        object2 = bl4;
        object.getClass();
        uY2.a((TY2)object, object2);
        object = new EU0$a(this);
        object2 = yY2.u;
        object3 = new H1(null, (fx0_2)object);
        uY2.a((TY2)object2, object3);
    }

    public final void u1(wr1_1 wr1_12) {
        DU0 dU0 = this.q;
        wr1_1 wr1_13 = dU0.n;
        boolean bl2 = Intrinsics.areEqual(wr1_13, wr1_12);
        if (!bl2) {
            rt0_0 rt0_02;
            wr1_13 = dU0.n;
            if (wr1_13 != null && (rt0_02 = dU0.o) != null) {
                ST0 sT0 = new ST0(rt0_02);
                wr1_13.c(sT0);
            }
            bl2 = false;
            wr1_13 = null;
            dU0.o = null;
            dU0.n = wr1_12;
        }
    }
}

