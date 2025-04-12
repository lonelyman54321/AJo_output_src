/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.KeyEvent
 */
package androidx.compose.foundation.gestures;

import android.view.KeyEvent;
import androidx.compose.foundation.gestures.b;
import androidx.compose.foundation.gestures.f$a;
import androidx.compose.foundation.gestures.i;
import androidx.compose.foundation.gestures.j;
import androidx.compose.foundation.gestures.k;
import androidx.compose.foundation.gestures.l$a;
import androidx.compose.foundation.gestures.l$b;
import androidx.compose.ui.focus.FocusTargetNode;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionBase;
import kotlin.jvm.internal.Intrinsics;

public final class l
extends b
implements G62,
lu0_0,
eo1_2,
dy2_0 {
    public final ut2_1 A;
    public final nl0_0 B;
    public final ku2_0 C;
    public final xt2_0 D;
    public final G60 E;
    public Ng F;
    public au2_1 G;
    public bu2_1 H;
    public Pg2 x;
    public TR0 y;
    public final pU1 z;

    public l(UD uD, TR0 tR0, wr1_1 wr1_12, pg2_0 pg2_02, Pg2 pg2, dU2 dU22, boolean bl2, boolean bl3) {
        ku2_0 ku2_02;
        pU1 pU12;
        l l2 = this;
        pg2_0 pg2_03 = pg2_02;
        boolean bl4 = bl2;
        Object object = androidx.compose.foundation.gestures.i.a;
        Object object2 = wr1_12;
        super((Function1)object, bl2, wr1_12, pg2_02);
        object = pg2;
        this.x = pg2;
        object = tR0;
        this.y = tR0;
        this.z = pU12 = new pU1();
        object = new ut2_1(bl2);
        this.r1((fo0)object);
        this.A = object;
        object2 = androidx.compose.foundation.gestures.i.d;
        Object object3 = new Sa3((Vo0)object2);
        object2 = new wi0_0((Sa3)object3);
        this.B = object = new nl0_0((vi0_0)object2);
        object3 = this.x;
        object2 = this.y;
        Object object4 = object2 == null ? object : object2;
        object = ku2_02;
        object2 = dU22;
        l2.C = ku2_02 = new ku2_0(dU22, (Pg2)object3, (TR0)object4, pg2_02, bl3, pU12);
        l2.D = object = new xt2_0(ku2_02, bl4);
        object3 = uD;
        object2 = new G60(pg2_03, ku2_02, bl3, uD);
        this.r1((fo0)object2);
        l2.E = object2;
        object3 = new ru1_0((oU1)object, pU12);
        this.r1((fo0)object3);
        object = new FocusTargetNode();
        this.r1((fo0)object);
        object = new LP1$c();
        ((QD)object).n = object2;
        this.r1((fo0)object);
        object2 = new j(this);
        object = new iu0_0((j)object2);
        this.r1((fo0)object);
    }

    public final void A1(long l2) {
        i90_0 i90_02 = this.z.c();
        l$a l$a = new l$a(this, l2, null);
        Ae3.d(i90_02, null, null, l$a, 3);
    }

    public final boolean B1() {
        boolean bl2;
        block6: {
            block5: {
                boolean bl3;
                Object object = this.C;
                dU2 dU22 = ((ku2_0)object).a;
                bl2 = dU22.b();
                if (bl2) break block5;
                object = ((ku2_0)object).b;
                bl2 = false;
                dU22 = null;
                if (object != null) {
                    bl3 = object.a();
                } else {
                    bl3 = false;
                    object = null;
                }
                if (!bl3) break block6;
            }
            bl2 = true;
        }
        return bl2;
    }

    public final void G(mv2_0 object, Nv2 object2, long l2) {
        block7: {
            Object object3;
            Object object4 = ((mv2_0)object).a;
            int n3 = object4.size();
            int n4 = 0;
            for (int i3 = 0; i3 < n3; ++i3) {
                Object object5 = (aw2_0)object4.get(i3);
                Function1 function1 = this.q;
                boolean bl2 = (Boolean)(object5 = (Boolean)function1.invoke(object5));
                if (!bl2) continue;
                super.G((mv2_0)object, (Nv2)((Object)object2), l2);
                break;
            }
            if (object2 == (object3 = Nv2.Main)) {
                int n7 = ((mv2_0)object).d;
                int n8 = 6;
                if ((n7 = (int)(Pv2.a(n7, n8) ? 1 : 0)) != 0) {
                    long l3;
                    int n10;
                    Object object6;
                    object = ((mv2_0)object).a;
                    n7 = object.size();
                    object3 = null;
                    for (n8 = 0; n8 < n7; ++n8) {
                        object6 = (aw2_0)object.get(n8);
                        n10 = ((aw2_0)object6).b() ^ 1;
                        if (n10 != 0) {
                            continue;
                        }
                        break block7;
                    }
                    object2 = this.F;
                    Intrinsics.checkNotNull(object2);
                    object3 = go0.f((fo0)this).r;
                    object2.getClass();
                    long l4 = 0L;
                    object2 = new e72(l4);
                    n10 = object.size();
                    int n14 = 0;
                    object4 = null;
                    while (true) {
                        l3 = ((e72)object2).a;
                        if (n14 >= n10) break;
                        long l7 = ((aw2_0)object.get((int)n14)).j;
                        l3 = e72.i(l3, l7);
                        object2 = new e72(l3);
                        ++n14;
                    }
                    float f5 = 64;
                    f5 = -object3.J0(f5);
                    long l8 = e72.j(l3, f5);
                    object6 = this.f1();
                    n3 = 0;
                    object4 = new yt2_1(this, l8, null);
                    f5 = 4.2E-45f;
                    Ae3.d((i90_0)object6, null, null, (Function2)object4, 3);
                    n7 = object.size();
                    while (n4 < n7) {
                        object3 = (aw2_0)object.get(n4);
                        ((aw2_0)object3).a();
                        ++n4;
                    }
                }
            }
        }
    }

    public final void J(gU0 gU02) {
        gU02.a(false);
    }

    public final /* synthetic */ boolean N() {
        return false;
    }

    public final void a0() {
        cu2_1 cu2_12 = new cu2_1(this);
        H62.a(this, cu2_12);
    }

    public final /* synthetic */ boolean c1() {
        return false;
    }

    public final boolean g1() {
        return false;
    }

    public final void i0(UY2 uY2) {
        FunctionBase functionBase;
        boolean bl2 = this.r;
        Object object = null;
        if (bl2 && ((functionBase = this.G) == null || (functionBase = this.H) == null)) {
            this.G = functionBase = new au2_1(this);
            functionBase = new bu2_1(this, null);
            this.H = functionBase;
        }
        if ((functionBase = this.G) != null) {
            Object object2 = RY2.a;
            object2 = yY2.d;
            H1 h1 = new H1(null, functionBase);
            uY2.a((TY2)object2, h1);
        }
        if ((functionBase = this.H) != null) {
            object = RY2.a;
            object = yY2.e;
            uY2.a((TY2)object, functionBase);
        }
    }

    public final void j1() {
        Object object = new cu2_1(this);
        H62.a(this, (Function0)object);
        this.F = object = Ng.a;
    }

    public final boolean n0(KeyEvent keyEvent) {
        return false;
    }

    public final boolean u0(KeyEvent object) {
        long l2;
        long l3;
        int n3 = this.r;
        boolean bl2 = false;
        if (n3 != 0 && ((n3 = Rn1.a(l3 = bo1_1.c(object), l2 = Rn1.l)) != 0 || (n3 = (int)(Rn1.a(l3 = to1_0.a(object.getKeyCode()), l2 = Rn1.k) ? 1 : 0)) != 0)) {
            n3 = bo1_1.d(object);
            int n4 = 2;
            if ((n3 = (int)(ao1_2.a(n3, n4) ? 1 : 0)) != 0 && (n3 = (int)(object.isCtrlPressed() ? 1 : 0)) == 0) {
                int n7;
                long l4;
                pg2_0 pg2_02 = this.C.d;
                Object object2 = pg2_0.Vertical;
                if (pg2_02 == object2) {
                    bl2 = true;
                }
                n3 = 0;
                pg2_02 = null;
                object2 = this.E;
                if (bl2) {
                    long l7;
                    long l8 = ((G60)object2).v & 0xFFFFFFFFL;
                    n4 = (int)l8;
                    l2 = to1_0.a(object.getKeyCode());
                    boolean bl3 = Rn1.a(l2, l7 = Rn1.k);
                    float f5 = bl3 ? (float)n4 : -((float)n4);
                    l4 = h72.a(0.0f, f5);
                } else {
                    long l12;
                    long l14 = ((G60)object2).v;
                    n7 = 32;
                    n4 = (int)(l14 >>= n7);
                    l2 = to1_0.a(object.getKeyCode());
                    boolean bl4 = Rn1.a(l2, l12 = Rn1.k);
                    float f6 = bl4 ? (float)n4 : -((float)n4);
                    l4 = h72.a(f6, 0.0f);
                }
                object = this.f1();
                n7 = 0;
                object2 = new l$b(this, l4, null);
                n3 = 3;
                Ae3.d((i90_0)object, null, null, (Function2)object2, n3);
                bl2 = true;
            }
        }
        return bl2;
    }

    public final Object y1(f$a object, f80_0 object2) {
        ku2_0 ku2_02 = this.C;
        aS1 aS12 = aS1.UserInput;
        k k2 = new k((f$a)object, ku2_02, null);
        if ((object = ku2_02.e(aS12, k2, (f80_0)object2)) == (object2 = j90_0.COROUTINE_SUSPENDED)) {
            return object;
        }
        return Unit.a;
    }

    public final void z1(long l2) {
    }
}

