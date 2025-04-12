/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.content.res.Configuration
 */
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import androidx.compose.foundation.a;
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.ril.ajio.services.data.fleek.feedModel.Component;
import com.ril.ajio.services.data.fleek.feedModel.Subcomponent;
import java.util.ArrayList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from GD
 */
public final class gd_0 {
    public static final void a(LP1 lP1, Component component, int n3, uj0_2 uj0_22, xj0_0 xj0_02, dr0_0 dr0_02, f23_0 f23_02, b30_0 b30_02, int n4) {
        Object object;
        Object object2;
        Object object3;
        int n7;
        Object object4;
        Object object5;
        Object object6;
        dr0_0 dr0_03 = dr0_02;
        f23_0 f23_03 = f23_02;
        Intrinsics.checkNotNullParameter(uj0_22, "onItemClick");
        Intrinsics.checkNotNullParameter("BRAND_THUMBNAIL", "key");
        Intrinsics.checkNotNullParameter(xj0_02, "sendImpression");
        Intrinsics.checkNotNullParameter(dr0_02, "fleekViewModel");
        Intrinsics.checkNotNullParameter(f23_02, "sharedFleekViewModel");
        Object object7 = b30_02;
        Object object8 = b30_02.g(-503160519);
        Object object9 = LP1$a.b;
        p83_0 p83_02 = component.getSubcomponent();
        float f5 = 0.0f;
        Object object10 = null;
        object7 = null;
        if (p83_02 != null) {
            object6 = new ArrayList();
            object5 = p83_02.listIterator();
            while (true) {
                object4 = object5;
                object4 = (ob3_2)object5;
                n7 = (int)(((ob3_2)object4).hasNext() ? 1 : 0);
                if (n7 == 0) break;
                object3 = object4 = ((ob3_2)object4).next();
                object3 = (Subcomponent)object4;
                if (object3 != null) {
                    object3 = ((Subcomponent)object3).isPinned();
                    object2 = Boolean.FALSE;
                    n7 = Intrinsics.areEqual(object3, object2);
                } else {
                    n7 = 0;
                    object3 = null;
                }
                if (n7 == 0) continue;
                ((ArrayList)object6).add(object4);
            }
            object = object6;
        } else {
            object = null;
        }
        object6 = AndroidCompositionLocals_androidKt.b;
        object6 = zv0_2.b((Context)((j30_0)object8).j((H30)object6));
        Intrinsics.checkNotNull(object6, "null cannot be cast to non-null type android.app.Activity");
        Object object11 = object6;
        object11 = (Activity)object6;
        Object object12 = jt1.a((b30_0)object8);
        object6 = AndroidCompositionLocals_androidKt.a;
        object6 = (Configuration)((j30_0)object8).j((H30)object6);
        int n8 = ((Configuration)object6).screenWidthDp;
        double d2 = n8;
        double d5 = 0.4;
        float f6 = (float)(d2 *= d5);
        double d7 = ov3.v("INTERNAL_SCROLL-STORIES");
        float f7 = (float)(d2 /= d7);
        object5 = (Boolean)f23_03.d.getValue();
        object5.getClass();
        object3 = new yd_2(f23_03, p83_02, null);
        ly0_0.d((b30_0)object8, object5, (Function2)object3);
        int n10 = 1901299776;
        float f8 = 1.04745685E30f;
        ((j30_0)object8).K(n10);
        object5 = ((j30_0)object8).v();
        object3 = b30$a.a;
        if (object5 == object3) {
            object5 = new vd_1((ft1_2)object12);
            object5 = J83.e((Function0)object5);
            ((j30_0)object8).o(object5);
        }
        object5 = (ib3_0)object5;
        ((j30_0)object8).T(false);
        object5 = object5.getValue();
        object3 = new zd_2((ft1_2)object12, dr0_03, null);
        ly0_0.d((b30_0)object8, object5, (Function2)object3);
        f8 = 1.0f;
        object3 = j.c((LP1)object9, f8);
        float f11 = f7;
        long l2 = nz_1.a;
        Object object13 = fg2_1.a;
        object7 = a.b((LP1)object3, l2, (i13)object13);
        object6 = zp.c;
        object3 = Nc$a.m;
        object10 = oZ.a((zp$l)object6, (Gx$a)object3, (b30_0)object8, 0);
        n8 = ((j30_0)object8).P;
        object3 = ((j30_0)object8).P();
        object7 = a30_0.c((b30_0)object8, (LP1)object7);
        N20.W.getClass();
        object13 = N20$a.b;
        object5 = ((j30_0)object8).a;
        n10 = object5 instanceof mp;
        if (n10 != 0) {
            ((j30_0)object8).A();
            n10 = (int)(((j30_0)object8).O ? 1 : 0);
            if (n10 != 0) {
                ((j30_0)object8).C((Function0)object13);
            } else {
                ((j30_0)object8).n();
            }
            object5 = N20$a.e;
            Ow3.a((b30_0)object8, object10, (Function2)object5);
            object10 = N20$a.d;
            Ow3.a((b30_0)object8, object3, (Function2)object10);
            object10 = N20$a.f;
            n10 = (int)(((j30_0)object8).O ? 1 : 0);
            if (n10 != 0 || (n10 = (int)(Intrinsics.areEqual(object5 = ((j30_0)object8).v(), object3 = Integer.valueOf(n8)) ? 1 : 0)) == 0) {
                rk_0.a(n8, (j30_0)object8, n8, (N20$a$a)object10);
            }
            object10 = N20$a.c;
            Ow3.a((b30_0)object8, object7, (Function2)object10);
            object13 = j.c((LP1)object9, 1.0f);
            f5 = uq0_0.o;
            int n14 = 8;
            zp$i zp$i = null;
            Object object14 = h.i((LP1)object13, f5, f5, f5, 0.0f, n14);
            object7 = component.getHeading();
            if (object7 == null) {
                object7 = "Brand Stories";
            }
            object13 = object7;
            long l3 = oj3_2.i;
            Object object15 = y20_0.b;
            tv0_0 tv0_02 = tv0_0.e;
            long l4 = nz_1.b;
            n7 = 1;
            object7 = new nV0(n7);
            int n15 = 1772544;
            long l7 = 0L;
            long l8 = 0L;
            int n16 = 130944;
            j30_0 j30_02 = object8;
            Ll3.b((String)object13, (LP1)object14, l4, l3, (nV0)object7, tv0_02, (RU0)object15, l7, null, null, l8, 0, false, 0, 0, null, null, (b30_0)object8, n15, 0, n16);
            object13 = h.f((LP1)object9, f5, f5);
            f5 = uq0_0.k;
            zp$i = zp.g(f5);
            object10 = object15;
            f7 = f11;
            n10 = n3;
            object4 = uj0_22;
            f11 = Float.MIN_VALUE;
            object3 = xj0_02;
            boolean bl2 = true;
            object2 = dr0_02;
            object14 = object12;
            LP1$a lP1$a = object9;
            object9 = object11;
            object8 = object;
            object15 = new wd_1(f6, f7, n3, uj0_22, xj0_02, dr0_02, (ft1_2)object12, p83_02, (Activity)object11, (ArrayList)object);
            tv0_02 = null;
            n14 = 0;
            int n17 = 24576;
            int n18 = 236;
            xq1_0.b((LP1)object13, (ft1_2)object12, null, false, zp$i, null, null, false, (Function1)object15, j30_02, n17, n18);
            object10 = j30_02;
            j30_02.T(bl2);
            object9 = j30_02.X();
            if (object9 != null) {
                object10 = object8;
                object7 = lP1$a;
                object6 = component;
                object12 = f23_02;
                ((CF2)object9).d = object8 = new xd_0(lP1$a, component, n3, uj0_22, xj0_02, dr0_02, f23_02, n4);
            }
            return;
        }
        s20.a();
        throw null;
    }
}

