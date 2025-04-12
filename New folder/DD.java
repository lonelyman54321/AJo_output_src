/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 */
import android.app.Activity;
import androidx.compose.foundation.layout.d;
import androidx.compose.foundation.layout.j;
import com.ril.ajio.services.data.fleek.feedModel.ResourceOwner;
import com.ril.ajio.services.data.fleek.feedModel.Subcomponent;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

public final class DD
implements hx0_2 {
    public final /* synthetic */ float a;
    public final /* synthetic */ Function1 b;
    public final /* synthetic */ ft1_2 c;
    public final /* synthetic */ float d;
    public final /* synthetic */ List e;
    public final /* synthetic */ Activity f;
    public final /* synthetic */ int g;
    public final /* synthetic */ dr0_0 h;
    public final /* synthetic */ p83_0 i;
    public final /* synthetic */ Function2 j;

    public DD(float f5, float f6, int n3, uj0_2 uj0_22, xj0_0 xj0_02, dr0_0 dr0_02, ft1_2 ft1_22, p83_0 p83_02, Activity activity, ArrayList arrayList) {
        this.a = f5;
        this.b = uj0_22;
        this.c = ft1_22;
        this.d = f6;
        this.e = arrayList;
        this.f = activity;
        this.g = n3;
        this.h = dr0_02;
        this.i = p83_02;
        this.j = xj0_02;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final Object invoke(Object object, Object object2, Object object3, Object object4) {
        Integer n3;
        Object object5;
        DD dD = this;
        Object object6 = object;
        object6 = (wr1_2)object;
        Object object7 = object2;
        object7 = (Number)object2;
        int n4 = ((Number)object7).intValue();
        Object object8 = object3;
        object8 = (b30_0)object3;
        Object object9 = object4;
        object9 = (Number)object4;
        int n7 = ((Number)object9).intValue();
        Object object10 = "$this$items";
        Intrinsics.checkNotNullParameter(object6, (String)object10);
        int n8 = n7 & 0x70;
        int n10 = 32;
        if (n8 == 0) {
            n8 = (int)(object8.c(n4) ? 1 : 0);
            n8 = n8 != 0 ? 32 : 16;
            n7 |= n8;
        }
        n8 = n7;
        int n14 = 144;
        if ((n7 &= 0x2D1) == n14 && (n7 = (int)(object8.h() ? 1 : 0)) != 0) {
            object8.D();
            return Unit.a;
        }
        rp2_0 rp2_02 = SP2.a(uq0_0.e);
        LP1$a lP1$a = LP1$a.b;
        float f5 = dD.a;
        object9 = QV.a(androidx.compose.foundation.layout.j.k(lP1$a, f5), rp2_02);
        n14 = 1447693259;
        object8.K(n14);
        Object object11 = dD.b;
        int n15 = object8.J(object11);
        int n16 = n8 & 0x70;
        int n17 = 0;
        Object object12 = null;
        if (n16 == n10) {
            n10 = 1;
        } else {
            n10 = 0;
            object10 = null;
        }
        Object object13 = object8.v();
        if ((n10 |= n15) != 0 || object13 == (object10 = b30$a.a)) {
            object11 = (uj0_2)object11;
            object13 = new AD((uj0_2)object11, n4);
            object8.o(object13);
        }
        object13 = (Function0)object13;
        object8.E();
        object9 = x20_0.d((LP1)object9, (Function0)object13);
        object10 = zp.c;
        object11 = Nc$a.m;
        object10 = oZ.a((zp$l)object10, (Gx$a)object11, (b30_0)object8, 0);
        n14 = object8.F();
        object13 = object8.m();
        object9 = a30_0.c((b30_0)object8, (LP1)object9);
        N20.W.getClass();
        Object object14 = N20$a.b;
        Object object15 = object8.i();
        int n18 = object15 instanceof mp;
        if (n18 == 0) {
            s20.a();
            throw null;
        }
        object8.A();
        n18 = object8.e();
        if (n18 != 0) {
            object8.C((Function0)object14);
        } else {
            object8.n();
        }
        object15 = N20$a.e;
        Ow3.a((b30_0)object8, object10, (Function2)object15);
        object10 = N20$a.d;
        Ow3.a((b30_0)object8, object13, (Function2)object10);
        object13 = N20$a.f;
        boolean bl2 = object8.e();
        if (bl2 || !(bl2 = Intrinsics.areEqual(object5 = object8.v(), n3 = Integer.valueOf(n14)))) {
            re0_0.a(n14, (b30_0)object8, n14, (N20$a$a)object13);
        }
        object11 = N20$a.c;
        Ow3.a((b30_0)object8, object9, (Function2)object11);
        n7 = 1065353216;
        f5 = 1.0f;
        object9 = androidx.compose.foundation.layout.j.c(lP1$a, f5);
        float f6 = dD.d;
        object9 = QV.a(androidx.compose.foundation.layout.j.d((LP1)object9, f6), rp2_02);
        object5 = Nc$a.e;
        object12 = HA.e((Nc)object5, false);
        int n19 = object8.F();
        Object object16 = object8.m();
        object9 = a30_0.c((b30_0)object8, (LP1)object9);
        int n20 = n8;
        object6 = object8.i();
        n8 = object6 instanceof mp;
        if (n8 == 0) {
            s20.a();
            throw null;
        }
        object8.A();
        n8 = (int)(object8.e() ? 1 : 0);
        if (n8 != 0) {
            object8.C((Function0)object14);
        } else {
            object8.n();
        }
        Ow3.a((b30_0)object8, object12, (Function2)object15);
        Ow3.a((b30_0)object8, object16, (Function2)object10);
        n8 = (int)(object8.e() ? 1 : 0);
        if (n8 != 0 || (n8 = (int)(Intrinsics.areEqual(object6 = object8.v(), object10 = Integer.valueOf(n19)) ? 1 : 0)) == 0) {
            re0_0.a(n19, (b30_0)object8, n19, (N20$a$a)object13);
        }
        Ow3.a((b30_0)object8, object9, (Function2)object11);
        object6 = androidx.compose.foundation.layout.d.a;
        object16 = dD.e;
        if (object16 == null || (object9 = (Subcomponent)object16.get(n4)) == null || (object9 = ((Subcomponent)object9).getResourceOwner()) == null || (object9 = ((ResourceOwner)object9).getBrandImage()) == null) {
            object9 = "";
        }
        object10 = object9;
        object11 = i70$a.a;
        n17 = 200070;
        object9 = lP1$a;
        object14 = object8;
        AF2.a(lP1$a, object10, (i70_0)object11, rp2_02, true, (b30_0)object8, n17, 0);
        object6 = ((d)object6).a(lP1$a, (Nc)object5);
        object14 = dD.h;
        object11 = object16;
        object11 = (ArrayList)object16;
        object10 = dD.f;
        int n21 = dD.g;
        object12 = dD.i;
        object9 = object15;
        object15 = new BD((Activity)object10, (ArrayList)object11, n4, n21, (dr0_0)object14, (p83_0)object12);
        int n22 = n20 << 3 & 0x380 | 0x6C40;
        boolean bl3 = false;
        object13 = null;
        bl2 = false;
        f6 = 0.0f;
        object5 = null;
        rp2_02 = null;
        object9 = object6;
        object10 = object16;
        n14 = n4;
        object14 = object15;
        object12 = object8;
        n18 = n22;
        n22 = 0;
        lP1$a = null;
        sd3_2.a((LP1)object6, (List)object16, n4, false, false, (Function0)object15, (b30_0)object8, n18, 0);
        object8.p();
        object8.p();
        object9 = (ArrayList)dD.e;
        object10 = (xj0_0)dD.j;
        object6 = new CD((ArrayList)object9, n4, (xj0_0)object10);
        n7 = n20 >> 3 & 0xE;
        object10 = dD.c;
        ov3.m(n4, (ft1_2)object10, (Function0)object6, (b30_0)object8, n7);
        return Unit.a;
    }
}

