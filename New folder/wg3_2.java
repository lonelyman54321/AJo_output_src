/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.ui.input.pointer.PointerInputResetException;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CancellableContinuationImpl;

/*
 * Renamed from Wg3
 */
public final class wg3_2
extends LP1$c
implements vg3_2,
hw2_0,
Vo0 {
    public Object n;
    public Object o;
    public Object[] p;
    public Function2 q;
    public mb3_2 r;
    public mv2_0 s;
    public final WR1 t;
    public final WR1 u;
    public mv2_0 v;
    public long w;

    public wg3_2(Object object, Object objectArray, Object[] objectArray2, Function2 function2) {
        this.n = object;
        this.o = objectArray;
        this.p = objectArray2;
        this.q = function2;
        this.s = object = tg3_0.a;
        int n3 = 16;
        objectArray2 = new Wg3$a[n3];
        this.t = object = new WR1(objectArray2);
        objectArray = new Wg3$a[n3];
        this.u = object = new WR1(objectArray);
        this.w = 0L;
    }

    public final void A0() {
        wg3_2 wg3_22 = this;
        Object object = this.v;
        if (object == null) {
            return;
        }
        object = ((mv2_0)object).a;
        int n3 = object.size();
        int n4 = 0;
        for (int i3 = 0; i3 < n3; ++i3) {
            aw2_0 aw2_02 = (aw2_0)object.get(i3);
            boolean bl2 = aw2_02.d ^ true;
            if (bl2) continue;
            i3 = object.size();
            Object object2 = new ArrayList(i3);
            i3 = object.size();
            while (n4 < i3) {
                aw2_0 aw2_03;
                aw2_02 = (aw2_0)object.get(n4);
                long l2 = aw2_02.a;
                boolean bl3 = aw2_02.d;
                int n7 = 1;
                long l3 = aw2_02.b;
                long l4 = aw2_02.c;
                float f5 = aw2_02.e;
                long l7 = 0L;
                aw2_02 = aw2_03;
                aw2_03 = new aw2_0(l2, l3, l4, false, f5, l3, l4, bl3, bl3, n7, l7);
                ((ArrayList)object2).add(aw2_03);
                ++n4;
            }
            wg3_22.s = object = new mv2_0((List)object2, null);
            object2 = Nv2.Initial;
            wg3_22.r1((mv2_0)object, (Nv2)((Object)object2));
            object2 = Nv2.Main;
            wg3_22.r1((mv2_0)object, (Nv2)((Object)object2));
            object2 = Nv2.Final;
            wg3_22.r1((mv2_0)object, (Nv2)((Object)object2));
            wg3_22.v = null;
            return;
        }
    }

    public final float D0(int n3) {
        float f5 = n3;
        float f6 = this.getDensity();
        return f5 / f6;
    }

    public final float E0(float f5) {
        float f6 = this.getDensity();
        return f5 / f6;
    }

    public final void F0() {
        this.m0();
    }

    public final void G(mv2_0 mv2_02, Nv2 object, long l2) {
        boolean bl2;
        block5: {
            Wg3$d wg3$d;
            l90_0 l90_02;
            this.w = l2;
            Object object2 = Nv2.Initial;
            if (object == object2) {
                this.s = mv2_02;
            }
            object2 = this.r;
            int n3 = 1;
            if (object2 == null) {
                object2 = this.f1();
                l90_02 = l90_0.UNDISPATCHED;
                wg3$d = new Wg3$d(this, null);
                object2 = Ae3.d((i90_0)object2, null, l90_02, wg3$d, n3);
                this.r = object2;
            }
            this.r1(mv2_02, (Nv2)((Object)object));
            object = mv2_02.a;
            int n4 = object.size();
            bl2 = false;
            l90_02 = null;
            wg3$d = null;
            for (int i3 = 0; i3 < n4; ++i3) {
                aw2_0 aw2_02 = (aw2_0)object.get(i3);
                boolean bl3 = si0_2.c(aw2_02);
                if (bl3) {
                    continue;
                }
                break block5;
            }
            bl2 = true;
        }
        boolean bl4 = bl2 ^ true;
        if (!bl4) {
            mv2_02 = null;
        }
        this.v = mv2_02;
    }

    public final /* synthetic */ float H(long l2) {
        return mv0_0.a(l2, this);
    }

    public final float H0() {
        return go0.f((fo0)this).r.H0();
    }

    public final float J0(float f5) {
        return this.getDensity() * f5;
    }

    public final long O(float f5) {
        f5 = this.E0(f5);
        return this.s1(f5);
    }

    public final int O0(long l2) {
        return Math.round(this.h0(l2));
    }

    public final /* synthetic */ void P() {
    }

    public final /* synthetic */ boolean Y0() {
        return false;
    }

    public final /* synthetic */ long Z0(long l2) {
        return Uo0.d(l2, this);
    }

    public final void a1() {
        this.m0();
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object d0(Function2 object, f80_0 f80_02) {
        j90_0 j90_02;
        void var2_2;
        f80_0 f80_03 = zj1_2.b((f80_0)var2_2);
        int n3 = 1;
        Object object2 = new CancellableContinuationImpl(n3, f80_03);
        ((CancellableContinuationImpl)object2).r();
        f80_03 = new Wg3$a(this, (CancellableContinuationImpl)object2);
        WR1 wR1 = this.t;
        synchronized (wR1) {
            Object object3 = this.t;
            ((WR1)object3).b(f80_03);
            object3 = "<this>";
            Intrinsics.checkNotNullParameter(object, (String)object3);
            object3 = "completion";
            Intrinsics.checkNotNullParameter(f80_03, (String)object3);
            object = zj1_2.a((Function2)object, f80_03, f80_03);
            object = zj1_2.b((f80_0)object);
            j90_02 = j90_0.COROUTINE_SUSPENDED;
            object3 = new ar2_2((f80_0)object, (Object)j90_02);
            object = tl2_2.b;
            object = Unit.a;
            ((ar2_2)object3).resumeWith(object);
        }
        object = new Wg3$c((Wg3$a)f80_03);
        ((CancellableContinuationImpl)object2).x((Function1)object);
        object = ((CancellableContinuationImpl)object2).q();
        if (object == j90_02) {
            object2 = "frame";
            Intrinsics.checkNotNullParameter(var2_2, (String)object2);
        }
        return object;
    }

    public final /* synthetic */ int e0(float f5) {
        return Uo0.a(f5, this);
    }

    public final float getDensity() {
        return go0.f((fo0)this).r.getDensity();
    }

    public final NC3 getViewConfiguration() {
        return go0.f((fo0)this).t;
    }

    public final /* synthetic */ float h0(long l2) {
        return Uo0.c(l2, this);
    }

    public final void k1() {
        this.m0();
    }

    public final void m0() {
        mb3_2 mb3_22 = this.r;
        if (mb3_22 != null) {
            PointerInputResetException pointerInputResetException = new PointerInputResetException();
            mb3_22.K(pointerInputResetException);
            mb3_22 = null;
            this.r = null;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void r1(mv2_0 mv2_02, Nv2 nv2) {
        block11: {
            int n3;
            int n4;
            Object object;
            int n7;
            block12: {
                WR1 wR1;
                n7 = 1;
                object = this.t;
                synchronized (object) {
                    wR1 = this.u;
                    WR1 wR12 = this.t;
                    n4 = wR1.c;
                    wR1.c(n4, wR12);
                }
                try {
                    object = Wg3$b.$EnumSwitchMapping$0;
                    int n8 = nv2.ordinal();
                    Object object2 = object[n8];
                    n8 = 0;
                    wR1 = null;
                    if (object2 != n7 && object2 != (n3 = 2)) {
                        n3 = 3;
                        if (object2 != n3) break block11;
                        object = this.u;
                        n3 = object.c;
                        if (n3 <= 0) break block11;
                        n3 -= n7;
                    } else {
                        object = this.u;
                        n3 = object.c;
                        if (n3 <= 0) break block11;
                        object = object.a;
                        n4 = 0;
                        Object var12_14 = null;
                        break block12;
                    }
                    Object[] objectArray = object.a;
                    do {
                        object = objectArray[n3];
                        object = (Wg3$a)object;
                        Object object3 = object.d;
                        if (nv2 != object3 || (object3 = object.c) == null) continue;
                        object.c = null;
                        object = tl2_2.b;
                        object3.resumeWith(mv2_02);
                    } while ((n3 += -1) >= 0);
                    break block11;
                }
                catch (Throwable throwable) {}
                this.u.g();
                throw throwable;
            }
            do {
                Object object4 = object[n4];
                object4 = (Wg3$a)object4;
                {
                    Object object5 = ((Wg3$a)object4).d;
                    if (nv2 != object5 || (object5 = ((Wg3$a)object4).c) == null) continue;
                    ((Wg3$a)object4).c = null;
                    object4 = tl2_2.b;
                    object5.resumeWith(mv2_02);
                }
            } while ((n4 += n7) < n3);
        }
        this.u.g();
    }

    public final /* synthetic */ long s1(float f5) {
        return mv0_0.b(f5, this);
    }

    public final /* synthetic */ long z(long l2) {
        return Uo0.b(l2, this);
    }
}

