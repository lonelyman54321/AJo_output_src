/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.res.Configuration
 */
import android.content.res.Configuration;
import androidx.compose.foundation.a;
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.ril.ajio.kmm.shared.model.home.BaseValue;
import com.ril.ajio.services.data.fleek.explore_brands.Component;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from TW2
 */
public final class tw2_1 {
    public static final void a(Component component, BaseValue baseValue, fh0_1 fh0_12, gh0_1 gh0_12, b30_0 b30_02, int n3) {
        Intrinsics.checkNotNullParameter(component, "component");
        Intrinsics.checkNotNullParameter(fh0_12, "onExploreClick");
        Intrinsics.checkNotNullParameter(gh0_12, "sendImpression");
        int n4 = 284915099;
        Object object = b30_02;
        Object object2 = b30_02.g(n4);
        object = LP1$a.b;
        int bl2 = 1065353216;
        float f5 = 1.0f;
        Object object3 = j.c((LP1)object, f5);
        long l2 = nz_1.a;
        Object object4 = fg2_1.a;
        Object object5 = a.b((LP1)object3, l2, (i13)object4);
        float f6 = uq0_0.x;
        LP1 lP1 = null;
        Object object6 = null;
        int n7 = 7;
        object3 = h.i((LP1)object5, 0.0f, 0.0f, 0.0f, f6, n7);
        Object object7 = zp.c;
        Object object8 = Nc$a.m;
        int n8 = 0;
        object7 = oZ.a((zp$l)object7, (Gx$a)object8, (b30_0)object2, 0);
        int n10 = ((j30_0)object2).P;
        object4 = ((j30_0)object2).P();
        object3 = a30_0.c((b30_0)object2, (LP1)object3);
        N20.W.getClass();
        Object object9 = N20$a.b;
        object5 = ((j30_0)object2).a;
        boolean bl3 = object5 instanceof mp;
        if (bl3) {
            ((j30_0)object2).A();
            bl3 = ((j30_0)object2).O;
            if (bl3) {
                ((j30_0)object2).C((Function0)object9);
            } else {
                ((j30_0)object2).n();
            }
            object9 = N20$a.e;
            Ow3.a((b30_0)object2, object7, (Function2)object9);
            object7 = N20$a.d;
            Ow3.a((b30_0)object2, object4, (Function2)object7);
            object7 = N20$a.f;
            n8 = ((j30_0)object2).O;
            if (n8 != 0 || (n8 = Intrinsics.areEqual(object4 = ((j30_0)object2).v(), object9 = Integer.valueOf(n10))) == 0) {
                rk_0.a(n10, (j30_0)object2, n10, (N20$a$a)object7);
            }
            object7 = N20$a.c;
            Ow3.a((b30_0)object2, object3, (Function2)object7);
            object3 = component.getHeading();
            if (object3 == null) {
                object3 = "";
            }
            object5 = object3;
            float f7 = uq0_0.o;
            n10 = 0;
            object6 = h.g((LP1)object, f7, 0.0f, 2);
            int n14 = 400;
            object3 = new tv0_0(n14);
            long l3 = oj3_2.i;
            Object object10 = y20_0.b;
            long l4 = nz_1.b;
            int n15 = 1;
            object7 = new nV0(n15);
            int n16 = 1772592;
            long l7 = 0L;
            long l8 = 0L;
            int n17 = 130944;
            Ll3.b((String)object5, (LP1)object6, l4, l3, (nV0)object7, (tv0_0)object3, (RU0)object10, l7, null, null, l8, 0, false, 0, 0, null, null, (b30_0)object2, n16, 0, n17);
            object3 = AndroidCompositionLocals_androidKt.a;
            object3 = (Configuration)((j30_0)object2).j((H30)object3);
            int n18 = ((Configuration)object3).screenWidthDp;
            double d2 = n18;
            double d5 = 0.35;
            d2 *= d5;
            object6 = jt1.a((b30_0)object2);
            lP1 = j.c((LP1)object, f5);
            f6 = uq0_0.q;
            object5 = h.i(lP1, 0.0f, f6, 0.0f, 0.0f, 13);
            object = object10;
            object8 = object6;
            object4 = fh0_12;
            object9 = gh0_12;
            object10 = new jw2_2(component, d2, (ft1_2)object6, fh0_12, gh0_12);
            lP1 = null;
            object = null;
            n7 = 0;
            int n19 = 6;
            int n20 = 252;
            boolean bl4 = true;
            f5 = Float.MIN_VALUE;
            f6 = 0.0f;
            xq1_0.b((LP1)object5, (ft1_2)object6, null, false, null, null, null, false, (Function1)object10, (b30_0)object2, n19, n20);
            ((j30_0)object2).T(bl4);
            object2 = ((j30_0)object2).X();
            if (object2 != null) {
                object = object9;
                object3 = baseValue;
                object7 = fh0_12;
                object8 = gh0_12;
                n8 = n3;
                ((CF2)object2).d = object9 = new kw2_2(component, baseValue, fh0_12, gh0_12, n3);
            }
            return;
        }
        s20.a();
        throw null;
    }
}

