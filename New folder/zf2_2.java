/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.foundation.a;
import androidx.compose.foundation.layout.g;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.ParcelableSnapshotMutableLongState;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import com.ril.ajio.services.data.fleek.feedModel.ResourceOwner;
import com.ril.ajio.services.data.fleek.feedModel.Subcomponent;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from zF2
 */
public final class zf2_2
implements hx0_2 {
    public final /* synthetic */ p83_0 a;
    public final /* synthetic */ float b;
    public final /* synthetic */ Function2 c;
    public final /* synthetic */ float d;
    public final /* synthetic */ float e;

    public zf2_2(p83_0 p83_02, float f5, wk0_2 wk0_22, float f6, float f7) {
        this.a = p83_02;
        this.b = f5;
        this.c = wk0_22;
        this.d = f6;
        this.e = f7;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public final Object invoke(Object object, Object object2, Object object3, Object objectArray) {
        void var12_30;
        void var12_27;
        void var12_24;
        void var25_79;
        void var25_74;
        void var25_65;
        String string2;
        ResourceOwner resourceOwner;
        Object object4;
        Integer n3;
        zf2_2 zf2_22 = this;
        int n4 = 0;
        float f5 = 0.0f;
        Object object5 = null;
        Object object6 = object;
        object6 = (wl2_0)object;
        Object object7 = object2;
        int n7 = ((Number)object2).intValue();
        object7 = object3;
        object7 = (b30_0)object3;
        Object[] objectArray2 = objectArray;
        ((Number)objectArray).intValue();
        String string3 = "$this$HorizontalPager";
        Intrinsics.checkNotNullParameter(object6, string3);
        object6 = this.a;
        Object object8 = object6 != null ? (object6 = (Subcomponent)((p83_0)object6).get(n7)) : null;
        object6 = LP1$a.b;
        int n8 = 1065353216;
        float f6 = 1.0f;
        Object object9 = j.c((LP1)object6, f6);
        float f7 = zf2_22.b;
        object9 = j.d((LP1)object9, f7);
        float f8 = uq0_0.h;
        Object object10 = SP2.a(f8);
        object9 = QV.a((LP1)object9, (i13)object10);
        Object object11 = zf2_22.c;
        object10 = new tf2_0((Function2)object11, (Subcomponent)object8);
        object9 = x20_0.d((LP1)object9, (Function0)object10);
        object10 = Nc$a.e;
        object11 = HA.e((Nc)object10, false);
        int n10 = object7.F();
        Object object12 = object7.m();
        object9 = a30_0.c((b30_0)object7, (LP1)object9);
        N20$a n20$a = N20.W;
        n20$a.getClass();
        Object object13 = N20$a.b;
        mp mp2 = object7.i();
        int n14 = mp2 instanceof mp;
        if (n14 == 0) {
            s20.a();
            throw null;
        }
        object7.A();
        n14 = object7.e();
        if (n14 != 0) {
            object7.C((Function0)object13);
        } else {
            object7.n();
        }
        N20$a$b n20$a$b = N20$a.e;
        Ow3.a((b30_0)object7, object11, n20$a$b);
        object11 = N20$a.d;
        Ow3.a((b30_0)object7, object12, (Function2)object11);
        object12 = N20$a.f;
        boolean bl2 = object7.e();
        if (bl2 || (n4 = Intrinsics.areEqual(object5 = object7.v(), n3 = Integer.valueOf(n10))) == 0) {
            re0_0.a(n10, (b30_0)object7, n10, (N20$a$a)object12);
        }
        object5 = N20$a.c;
        Ow3.a((b30_0)object7, object9, (Function2)object5);
        n8 = 1065353216;
        f6 = 1.0f;
        LP1 lP1 = j.d(j.c((LP1)object6, f6), f7);
        object9 = SP2.a(f8);
        LP1 lP12 = QV.a(lP1, (i13)object9);
        object9 = null;
        Object object14 = HA.e((Nc)object10, false);
        int n15 = object7.F();
        object10 = object7.m();
        LP1 lP13 = a30_0.c((b30_0)object7, lP12);
        Object object15 = object7.i();
        n10 = object15 instanceof mp;
        if (n10 == 0) {
            s20.a();
            throw null;
        }
        object7.A();
        n10 = (int)(object7.e() ? 1 : 0);
        if (n10 != 0) {
            object7.C((Function0)object13);
        } else {
            object7.n();
        }
        Ow3.a((b30_0)object7, object14, n20$a$b);
        Ow3.a((b30_0)object7, object10, (Function2)object11);
        n14 = object7.e();
        if (n14 != 0 || (n14 = Intrinsics.areEqual(object4 = object7.v(), object13 = Integer.valueOf(n15))) == 0) {
            re0_0.a(n15, (b30_0)object7, n15, (N20$a$a)object12);
        }
        Ow3.a((b30_0)object7, lP13, (Function2)object5);
        if (object8 == null || (resourceOwner = ((Subcomponent)object8).getResourceOwner()) == null || (string2 = resourceOwner.getBrandImage()) == null) {
            String string4 = "";
        }
        object11 = var25_65;
        object15 = i70$a.a;
        object12 = SP2.a(f8);
        int n16 = 32;
        bl2 = false;
        n20$a = null;
        object10 = object6;
        AF2.a((LP1)object6, var25_65, (i70_0)object15, (rp2_0)object12, false, (b30_0)object7, 3462, n16);
        float f11 = zf2_22.d;
        LP1 lP14 = j.c(g.d((LP1)object6, 0.0f, f11, 1), 1.0f);
        float f12 = zf2_22.e;
        LP1 lP15 = j.d(lP14, f12);
        object13 = SP2.a(f8);
        LP1 lP16 = QV.a(lP15, (i13)object13);
        long l2 = nz_1.e;
        object13 = new OX(l2);
        l2 = nz_1.a;
        object14 = new OX(l2);
        n8 = 2;
        f6 = 2.8E-45f;
        Object[] objectArray3 = new OX[n8];
        n15 = 0;
        object9 = null;
        objectArray3[0] = object13;
        objectArray3[1] = object14;
        object11 = xx_2.i(objectArray3);
        long l3 = h72.a(0.0f, 0.0f);
        f12 = 1.0f / 0.0f;
        long l4 = h72.a(0.0f, f12);
        object10 = object5;
        object5 = new cu1_0((List)object11, l3, l4, 0);
        HA.a(androidx.compose.foundation.a.a(lP16, (cu1_0)object5), (b30_0)object7, 0);
        object7.p();
        object7.K(1563884678);
        n4 = 4;
        f5 = 5.6E-45f;
        pa_0 pa_02 = new pa_0(object8, n4);
        object5 = new gw0_0(pa_02);
        object7.E();
        object10 = j.c;
        n14 = -1999053668;
        f11 = -1.3051892E-33f;
        object7.K(n14);
        Object object16 = object7.v();
        object13 = b30$a.a;
        if (object16 == object13) {
            n14 = T3.b;
            l2 = 0L;
            ParcelableSnapshotMutableLongState parcelableSnapshotMutableLongState = new ParcelableSnapshotMutableLongState(l2);
            object7.o(parcelableSnapshotMutableLongState);
        }
        dr1_1 dr1_12 = (dr1_1)var25_74;
        Object object17 = object7.v();
        if (object17 == object13) {
            Unit unit = Unit.a;
            J83.h();
            wv1_0 wv1_02 = wv1_0.b;
            ParcelableSnapshotMutableState parcelableSnapshotMutableState = J83.f(unit, wv1_02);
            object7.o(parcelableSnapshotMutableState);
        }
        object9 = var25_79;
        object9 = (tr1_0)var25_79;
        vc3_1 vc3_12 = O30.f;
        Vo0 vo0 = (Vo0)object7.j(vc3_12);
        Object object18 = object7.v();
        if (object18 == object13) {
            nl1_0 nl1_02 = new nl1_0(vo0);
            object7.o(nl1_02);
        }
        object14 = var12_24;
        object14 = (nl1_0)var12_24;
        n14 = (int)(object7.J(object5) ? 1 : 0);
        Object object19 = object7.v();
        if (n14 != 0 || object19 == object13) {
            object14.getClass();
            Boolean bl3 = Boolean.TRUE;
            object7.o(bl3);
        }
        ((Boolean)var12_27).getClass();
        n14 = (int)(object7.x(object14) ? 1 : 0);
        n8 = (int)(object7.J(object5) ? 1 : 0);
        n14 |= n8;
        f6 = 3.6E-43f;
        n8 = (int)(object7.c(257) ? 1 : 0);
        Object object20 = object7.v();
        if ((n14 |= n8) != 0 || object20 == object13) {
            uf2_2 uf2_22 = new uf2_2((tr1_0)object9, (nl1_0)object14, (gw0_0)object5);
            object7.o(uf2_22);
        }
        void var25_82 = var12_30;
        al1_1 al1_12 = (al1_1)var12_30;
        n8 = object5 instanceof Hp1;
        if (n8 != 0) {
            object5 = (Hp1)object5;
        } else {
            n4 = 0;
            f5 = 0.0f;
            object5 = null;
        }
        ((nl1_0)object14).a = object5;
        if (object5 != null) {
            object5.d();
        }
        f5 = ((nl1_0)object14).i;
        n8 = (int)(Float.isNaN(f5) ? 1 : 0);
        object12 = zf2_22.a;
        if (n8 == 0) {
            void var12_40;
            object7.K(-1997939559);
            float f14 = ((nl1_0)object14).i;
            f6 = 1.0f;
            n8 = (int)(f14 == f6 ? 0 : (f14 < f6 ? -1 : 1));
            if (n8 == 0 && n8 == 0) {
                object9 = object12;
            } else {
                n16 = 131068;
                n8 = 0;
                f6 = 0.0f;
                Object var12_31 = null;
                bl2 = false;
                n20$a = null;
                object9 = object12;
                object12 = null;
                object10 = androidx.compose.ui.graphics.a.b((LP1)object10, f14, f14, 0.0f, 0.0f, null, false, n16);
            }
            Gx gx = Nc$a.a;
            object11 = null;
            al1_1 al1_13 = HA.e(gx, false);
            int n17 = object7.F();
            object15 = object7.m();
            object6 = a30_0.c((b30_0)object7, (LP1)object6);
            N20.W.getClass();
            object12 = N20$a.b;
            Object object21 = object7.i();
            int n18 = object21 instanceof mp;
            if (n18 == 0) {
                s20.a();
                throw null;
            }
            object7.A();
            n18 = object7.e();
            if (n18 != 0) {
                object7.C((Function0)object12);
            } else {
                object7.n();
            }
            object21 = N20$a.e;
            Ow3.a((b30_0)object7, al1_13, (Function2)object21);
            N20$a$d n20$a$d = N20$a.d;
            Ow3.a((b30_0)object7, object15, n20$a$d);
            N20$a$a n20$a$a = N20$a.f;
            n18 = object7.e();
            if (n18 != 0 || (n18 = Intrinsics.areEqual(object21 = object7.v(), object15 = Integer.valueOf(n17))) == 0) {
                re0_0.a(n17, (b30_0)object7, n17, n20$a$a);
            }
            N20$a$c n20$a$c = N20$a.c;
            Ow3.a((b30_0)object7, object6, n20$a$c);
            boolean bl4 = object7.x(object14);
            Object object22 = object7.v();
            if (bl4 || object22 == object13) {
                vf2_2 vf2_22 = new vf2_2((nl1_0)object14);
                object7.o(vf2_22);
            }
            Function1 function1 = (Function1)var12_40;
            f12 = 0.0f;
            object13 = CY2.b((LP1)object10, false, function1);
            object6 = new wf2_2((nl1_0)object14, (Subcomponent)object8, (p83_0)object9, n7);
            n8 = 1131308473;
            f6 = 238.39735f;
            object6 = v10.c(n8, (fx0_2)object6, (b30_0)object7);
            n18 = 48;
            f8 = 6.7E-44f;
            Mp1.a((LP1)object13, (u10)object6, al1_12, (b30_0)object7, n18);
            object7.K(-1729486855);
            n14 = 6;
            f11 = 8.4E-45f;
            ((nl1_0)object14).d(f5, (b30_0)object7, n14);
            object7.E();
            object7.p();
            object7.E();
        } else {
            void var12_44;
            object5 = object12;
            int n19 = 48;
            f8 = 6.7E-44f;
            object7.K(-1997387480);
            boolean bl5 = object7.x(object14);
            Object object23 = object7.v();
            if (bl5 || object23 == object13) {
                xf2_2 xf2_22 = new xf2_2((nl1_0)object14);
                object7.o(xf2_22);
            }
            Function1 function1 = (Function1)var12_44;
            f12 = 0.0f;
            object13 = CY2.b((LP1)object10, false, function1);
            Object object24 = object6;
            int n20 = 48;
            Object object25 = object5;
            object6 = new yf2_2((tr1_0)object9, (nl1_0)object14, (Subcomponent)object8, (p83_0)object5, n7);
            n4 = -207512644;
            f5 = -2.5607863E31f;
            object5 = v10.c(n4, (fx0_2)object6, (b30_0)object7);
            Mp1.a((LP1)object13, (u10)object5, al1_12, (b30_0)object7, n20);
            object7.E();
        }
        object7.E();
        object7.p();
        return Unit.a;
    }
}

