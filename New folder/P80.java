/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.foundation.layout.j;
import androidx.compose.foundation.relocation.a;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class P80
extends Lambda
implements Function2 {
    public final /* synthetic */ Vt1 c;
    public final /* synthetic */ xm3 d;
    public final /* synthetic */ int e;
    public final /* synthetic */ int f;
    public final /* synthetic */ Pk3 g;
    public final /* synthetic */ ql3_0 h;
    public final /* synthetic */ EE3 i;
    public final /* synthetic */ LP1 j;
    public final /* synthetic */ LP1 k;
    public final /* synthetic */ LP1 l;
    public final /* synthetic */ LP1 m;
    public final /* synthetic */ MD n;
    public final /* synthetic */ Sk3 o;
    public final /* synthetic */ boolean p;
    public final /* synthetic */ boolean q;
    public final /* synthetic */ Function1 r;
    public final /* synthetic */ i72 s;
    public final /* synthetic */ Vo0 t;

    public P80(Vt1 vt1, xm3 xm32, int n3, int n4, Pk3 pk3, ql3_0 ql3_02, EE3 eE3, LP1 lP1, LP1 lP12, LP1 lP13, LP1 lP14, MD mD, Sk3 sk3, boolean bl2, boolean bl3, Function1 function1, i72 i722, Vo0 vo0) {
        this.c = vt1;
        this.d = xm32;
        this.e = n3;
        this.f = n4;
        this.g = pk3;
        this.h = ql3_02;
        this.i = eE3;
        this.j = lP1;
        this.k = lP12;
        this.l = lP13;
        this.m = lP14;
        this.n = mD;
        this.o = sk3;
        this.p = bl2;
        this.q = bl3;
        this.r = function1;
        this.s = i722;
        this.t = vo0;
        super(2);
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public final Object invoke(Object object, Object object2) {
        O80 o80;
        void var36_35;
        int n3;
        Object object3;
        int n4;
        P80 p80 = this;
        int n7 = 1;
        Object object4 = object;
        object4 = (b30_0)object;
        Object object5 = object2;
        object5 = (Number)object2;
        int n8 = ((Number)object5).intValue() & 3;
        if (n8 == (n4 = 2) && (n8 = (int)(object4.h() ? 1 : 0)) != 0) {
            object4.D();
            return Unit.a;
        }
        object5 = p80.c;
        float f5 = ((xs0_0)((Vt1)object5).g.getValue()).a;
        int n10 = 2143289344;
        float f6 = 0.0f / 0.0f;
        LP1 lP1 = androidx.compose.foundation.layout.j.e(f5, f6);
        ji1$a ji1$a = ji1.a;
        int n14 = p80.e;
        int n15 = p80.f;
        Object object6 = p80.d;
        Object object7 = new A41(n14, n15, (xm3)object6);
        lP1 = a30_0.a(lP1, ji1$a, (gx0_2)object7);
        boolean bl2 = object4.x(object5);
        Object object8 = object4.v();
        if (bl2 || object8 == (object7 = b30$a.a)) {
            object8 = new le2_2(object5, n7);
            object4.o(object8);
        }
        object8 = (Function0)object8;
        object5 = p80.g;
        object7 = (pg2_0)((Object)((Pk3)object5).e.getValue());
        Object object9 = p80.h;
        long l2 = ((ql3_0)object9).b;
        int n16 = mm3.c;
        n16 = 32;
        long l3 = l2 >> n16;
        int n17 = (int)l3;
        object2 = lP1;
        long l4 = ((Pk3)object5).d;
        long l7 = l4 >> n16;
        int n18 = (int)l7;
        if (n17 != n18) {
            object3 = object4;
            n7 = n17;
        } else {
            l7 = 0xFFFFFFFFL;
            object3 = object4;
            long l8 = l2 & l7;
            n3 = (int)l8;
            n7 = (int)(l4 &= l7);
            n7 = n3 != n7 ? n3 : mm3.e(l2);
        }
        ((Pk3)object5).d = l4 = ((ql3_0)object9).b;
        object4 = ((ql3_0)object9).a;
        object4 = Zz3.a(p80.i, (Sl)object4);
        int[] nArray = Mk3$a.$EnumSwitchMapping$0;
        int n19 = ((Enum)object7).ordinal();
        n4 = nArray[n19];
        n19 = 1;
        f5 = Float.MIN_VALUE;
        if (n4 != n19) {
            n19 = 2;
            f5 = 2.8E-45f;
            if (n4 != n19) {
                NoWhenBranchMatchedException noWhenBranchMatchedException = new NoWhenBranchMatchedException();
                throw noWhenBranchMatchedException;
            }
            r91 r912 = new r91((Pk3)object5, n7, (dr3)object4, (Function0)object8);
        } else {
            vb3_1 vb3_12 = new vb3_1((Pk3)object5, n7, (dr3)object4, (Function0)object8);
        }
        LP1 lP12 = QV.b((LP1)object2).then((LP1)var36_35);
        object4 = p80.j;
        lP12 = lP12.then((LP1)object4);
        object4 = p80.k;
        lP12 = lP12.then((LP1)object4);
        object4 = new il3_0((xm3)object6);
        lP12 = a30_0.a(lP12, ji1$a, (gx0_2)object4);
        object4 = p80.l;
        lP12 = lP12.then((LP1)object4);
        object4 = p80.m;
        lP12 = lP12.then((LP1)object4);
        object4 = p80.n;
        lP12 = a.a(lP12, (MD)object4);
        object6 = p80.t;
        int n20 = p80.f;
        object5 = p80.o;
        Vt1 vt1 = p80.c;
        n19 = (int)(p80.p ? 1 : 0);
        boolean bl3 = p80.q;
        object7 = p80.r;
        object8 = p80.h;
        object9 = p80.s;
        object4 = o80;
        o80 = new O80((Sk3)object5, vt1, n19 != 0, bl3, (Function1)object7, (ql3_0)object8, (i72)object9, (Vo0)object6, n20);
        n3 = -363167407;
        object5 = object3;
        object4 = v10.c(n3, o80, (b30_0)object3);
        n4 = 48;
        w53.a(lP12, (u10)object4, (b30_0)object3, n4);
        return Unit.a;
    }
}

