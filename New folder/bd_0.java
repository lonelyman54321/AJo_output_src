/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 */
import android.app.Activity;
import androidx.compose.foundation.a;
import androidx.compose.foundation.layout.j;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Bd
 */
public final class bd_0
implements Function2 {
    public final /* synthetic */ ib3_0 a;
    public final /* synthetic */ dr0_0 b;
    public final /* synthetic */ p83_0 c;
    public final /* synthetic */ ft1_2 d;
    public final /* synthetic */ yT1 e;
    public final /* synthetic */ Activity f;

    public bd_0(tr1_0 tr1_02, dr0_0 dr0_02, p83_0 p83_02, ft1_2 ft1_22, yT1 yT12, Activity activity) {
        this.a = tr1_02;
        this.b = dr0_02;
        this.c = p83_02;
        this.d = ft1_22;
        this.e = yT12;
        this.f = activity;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final Object invoke(Object object, Object object2) {
        boolean bl2;
        boolean bl3;
        int n3;
        bd_0 bd_02 = this;
        Object object3 = object;
        object3 = (b30_0)object;
        Object object4 = object2;
        object4 = (Number)object2;
        int n4 = ((Number)object4).intValue() & 0xB;
        if (n4 == (n3 = 2) && (bl3 = object3.h())) {
            object3.D();
            return Unit.a;
        }
        Object object5 = LP1$a.b;
        object4 = zp.c;
        Object object6 = Nc$a.m;
        int n7 = 0;
        p83_0 p83_02 = null;
        object4 = oZ.a((zp$l)object4, (Gx$a)object6, (b30_0)object3, 0);
        int n8 = object3.F();
        Object object7 = object3.m();
        Object object8 = a30_0.c((b30_0)object3, (LP1)object5);
        N20.W.getClass();
        Xp1$a xp1$a = N20$a.b;
        Object object9 = object3.i();
        boolean bl4 = object9 instanceof mp;
        if (!bl4) {
            s20.a();
            throw null;
        }
        object3.A();
        bl4 = object3.e();
        if (bl4) {
            object3.C(xp1$a);
        } else {
            object3.n();
        }
        Object object10 = N20$a.e;
        Ow3.a((b30_0)object3, object4, (Function2)object10);
        Object object11 = N20$a.d;
        Ow3.a((b30_0)object3, object7, (Function2)object11);
        N20$a$a n20$a$a = N20$a.f;
        boolean bl5 = object3.e();
        if (bl5 || !(bl2 = Intrinsics.areEqual(object4 = object3.v(), object7 = Integer.valueOf(n8)))) {
            re0_0.a(n8, (b30_0)object3, n8, n20$a$a);
        }
        Object object12 = N20$a.c;
        Ow3.a((b30_0)object3, object8, (Function2)object12);
        float f5 = 1.0f;
        object4 = j.c((LP1)object5, f5);
        long l2 = nz_1.a;
        object6 = fg2_1.a;
        object4 = androidx.compose.foundation.a.b((LP1)object4, l2, (i13)object6);
        Object object13 = (tr1_0)bd_02.a;
        dr0_0 dr0_02 = bd_02.b;
        p83_02 = bd_02.c;
        object6 = new wd_2((tr1_0)object13, dr0_02, p83_02);
        int n10 = -1575640488;
        Object object14 = v10.c(n10, (fx0_2)object6, (b30_0)object3);
        int n14 = 1573254;
        int n15 = 58;
        object6 = null;
        long l3 = 0L;
        Object object15 = null;
        int n16 = 0;
        long l4 = l3;
        Object object16 = object12;
        boolean bl6 = false;
        object12 = null;
        Object object17 = n20$a$a;
        int n17 = 0;
        n20$a$a = null;
        N20$a$d n20$a$d = object11;
        object11 = object14;
        N20$a$b n20$a$b = object10;
        object10 = object3;
        int n18 = n14;
        p83_0 p83_03 = p83_02;
        object14 = dr0_02;
        n3 = 0;
        dr0_02 = null;
        n7 = n15;
        jg3_0.a((LP1)object4, null, l2, l3, null, 0.0f, (u10)object11, (b30_0)object3, n14, n15);
        object4 = HA.e(Nc$a.a, false);
        n8 = object3.F();
        object7 = object3.m();
        object8 = a30_0.c((b30_0)object3, (LP1)object5);
        object9 = object3.i();
        bl4 = object9 instanceof mp;
        if (!bl4) {
            s20.a();
            throw null;
        }
        object3.A();
        bl4 = object3.e();
        if (bl4) {
            object9 = xp1$a;
            object3.C(xp1$a);
        } else {
            object9 = xp1$a;
            object3.n();
        }
        object13 = n20$a$b;
        Ow3.a((b30_0)object3, object4, n20$a$b);
        object4 = n20$a$d;
        Ow3.a((b30_0)object3, object7, n20$a$d);
        boolean bl7 = object3.e();
        if (bl7 || !(bl7 = Intrinsics.areEqual(object7 = object3.v(), object12 = Integer.valueOf(n8)))) {
            object7 = object17;
            re0_0.a(n8, (b30_0)object3, n8, (N20$a$a)object17);
            object6 = object16;
        } else {
            object6 = object16;
            object7 = object17;
        }
        Ow3.a((b30_0)object3, object8, (Function2)object6);
        int n19 = -39529235;
        object3.K(n19);
        object8 = p83_03;
        if (p83_03 != null) {
            bl6 = p83_03.isEmpty();
            if (bl6) {
                boolean bl8;
                n19 = -1225440383;
                object3.K(n19);
                object8 = j.c;
                object12 = HA.e(Nc$a.e, false);
                n17 = object3.F();
                object11 = object3.m();
                object8 = a30_0.c((b30_0)object3, (LP1)object8);
                object10 = object3.i();
                boolean bl9 = object10 instanceof mp;
                if (!bl9) {
                    s20.a();
                    throw null;
                }
                object3.A();
                bl9 = object3.e();
                if (bl9) {
                    object3.C((Function0)object9);
                } else {
                    object3.n();
                }
                Ow3.a((b30_0)object3, object12, (Function2)object13);
                Ow3.a((b30_0)object3, object11, (Function2)object4);
                boolean bl10 = object3.e();
                if (bl10 || !(bl8 = Intrinsics.areEqual(object4 = object3.v(), object9 = Integer.valueOf(n17)))) {
                    re0_0.a(n17, (b30_0)object3, n17, (N20$a$a)object7);
                }
                Ow3.a((b30_0)object3, object8, (Function2)object6);
                long l7 = oj3_2.d;
                object17 = y20_0.a;
                object4 = new tv0_0(700);
                long l8 = nz_1.h;
                xm3 xm32 = object15;
                long l12 = 0L;
                int n20 = 0xFFFFD8;
                long l14 = 0L;
                p83_03 = null;
                object16 = object4;
                object15 = new xm3(l8, l7, (tv0_0)object4, (av0_0)object17, l14, null, 0, l12, n20);
                char c2 = (char)-2;
                object4 = "No results found";
                n8 = 0;
                object6 = null;
                l2 = 0L;
                l4 = 0L;
                bl6 = false;
                object12 = null;
                n17 = 0;
                n20$a$a = null;
                object11 = null;
                long l15 = 0L;
                n7 = 0;
                p83_02 = null;
                long l16 = 0L;
                object2 = object3;
                Object object18 = object14;
                object14 = null;
                n14 = 0;
                n15 = 0;
                n16 = 6;
                object15 = object3;
                Ll3.b((String)object4, null, l2, l4, null, null, null, l15, null, null, l16, 0, false, 0, 0, null, xm32, (b30_0)object3, n16, 0, c2);
                object3.p();
                object3.E();
                object5 = object18;
            } else {
                object2 = object3;
                Object object19 = object14;
                object3.K(-1224453746);
                int n21 = 1065353216;
                float f6 = 1.0f;
                object4 = j.c((LP1)object5, f6);
                object6 = bd_02.e;
                object7 = bd_02.f;
                object5 = object14;
                object11 = new td_1(p83_03, (dr0_0)object14, (yT1)object6, (Activity)object7);
                n18 = 6;
                n7 = 252;
                object6 = bd_02.d;
                bl7 = false;
                object7 = null;
                n19 = 0;
                object8 = null;
                bl4 = false;
                f5 = 0.0f;
                object9 = null;
                n10 = 0;
                object13 = null;
                bl6 = false;
                object12 = null;
                n17 = 0;
                n20$a$a = null;
                object10 = object3;
                xq1_0.a((LP1)object4, (ft1_2)object6, null, false, null, null, null, false, (Function1)object11, (b30_0)object3, n18, n7);
                object3.E();
            }
        } else {
            object5 = object14;
        }
        object3.E();
        object4 = (hv1_1)((Object)((dr0_0)object5).k.getValue());
        object6 = Bd$a.$EnumSwitchMapping$0;
        int n22 = ((Enum)object4).ordinal();
        Object object20 = object6[n22];
        n8 = 1;
        if (object20 != n8) {
            n8 = 2;
        }
        object4 = Unit.a;
        object3.p();
        object3.p();
        return Unit.a;
    }
}

