/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import com.ril.ajio.kmm.shared.model.home.BaseValue;
import com.ril.ajio.services.data.fleek.explore_brands.Component;
import com.ril.ajio.services.data.fleek.explore_brands.Subcomponent;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from EG0$a
 */
public final class eg0$a_0
implements hx0_2 {
    public final /* synthetic */ Component a;
    public final /* synthetic */ double b;
    public final /* synthetic */ gx0_2 c;
    public final /* synthetic */ ft1_2 d;
    public final /* synthetic */ BaseValue e;
    public final /* synthetic */ ft1_2 f;
    public final /* synthetic */ p83_0 g;
    public final /* synthetic */ Function2 h;
    public final /* synthetic */ Function2 i;
    public final /* synthetic */ Function1 j;
    public final /* synthetic */ Function2 k;
    public final /* synthetic */ Function2 l;

    public eg0$a_0(Component component, double d2, gx0_2 gx0_22, ft1_2 ft1_22, BaseValue baseValue, ft1_2 ft1_23, p83_0 p83_02, Function2 function2, Function2 function22, Function1 function1, Function2 function23, Function2 function24) {
        this.a = component;
        this.b = d2;
        this.c = gx0_22;
        this.d = ft1_22;
        this.e = baseValue;
        this.f = ft1_23;
        this.g = p83_02;
        this.h = function2;
        this.i = function22;
        this.j = function1;
        this.k = function23;
        this.l = function24;
    }

    public final Object invoke(Object object, Object object2, Object object3, Object object4) {
        float f5;
        eg0$a_0 eg0$a_0 = this;
        int n3 = 0;
        Object object5 = null;
        Object object6 = object;
        object6 = (wr1_2)object;
        Object object7 = object2;
        int n4 = ((Number)object2).intValue();
        object7 = object3;
        object7 = (b30_0)object3;
        Object object8 = object4;
        object8 = (Number)object4;
        int n7 = ((Number)object8).intValue();
        Object object9 = "$this$items";
        Intrinsics.checkNotNullParameter(object6, (String)object9);
        int n8 = n7 & 0x70;
        if (n8 == 0) {
            n8 = (int)(object7.c(n4) ? 1 : 0);
            if (n8 != 0) {
                n8 = 32;
                f5 = 4.5E-44f;
            } else {
                n8 = 16;
                f5 = 2.2E-44f;
            }
            n7 |= n8;
        }
        if ((n8 = n7 & 0x2D1) == (n7 = 144) && (n8 = (int)(object7.h() ? 1 : 0)) != 0) {
            object7.D();
        } else {
            object6 = eg0$a_0.a;
            object8 = ((Component)object6).getSubcomponents();
            object9 = null;
            Object object10 = object8 != null ? (object8 = (Subcomponent)CollectionsKt.N(n4, (List)object8)) : null;
            object6 = ((Component)object6).getSubcomponents();
            if (object6 != null && n4 == (n8 = xx_2.h((List)object6))) {
                n8 = 1;
                f5 = Float.MIN_VALUE;
            } else {
                n8 = 0;
                f5 = 0.0f;
                object6 = null;
            }
            Object object11 = LP1$a.b;
            float f6 = uq0_0.o;
            int n10 = 14;
            object8 = androidx.compose.foundation.layout.h.i((LP1)object11, f6, 0.0f, 0.0f, 0.0f, n10);
            Object object12 = new sg0_0(0);
            object5 = x20_0.a((LP1)object8, n8 != 0, (Function1)object12, null);
            double d2 = eg0$a_0.b;
            f5 = (float)d2;
            object5 = androidx.compose.foundation.layout.j.m(androidx.compose.foundation.layout.j.k((LP1)object5, f5));
            Function2 function2 = eg0$a_0.k;
            Object object13 = eg0$a_0.l;
            object12 = eg0$a_0.a;
            double d5 = eg0$a_0.b;
            object11 = eg0$a_0.c;
            Object object14 = eg0$a_0.d;
            Object object15 = eg0$a_0.e;
            object9 = eg0$a_0.f;
            object8 = eg0$a_0.g;
            Object object16 = function2;
            function2 = eg0$a_0.h;
            object = object5;
            object5 = eg0$a_0.i;
            object2 = object7;
            object7 = eg0$a_0.j;
            Object object17 = object8;
            object8 = object6;
            Object object18 = object9;
            object9 = object10;
            object10 = object12;
            Object object19 = object11;
            object11 = object14;
            object14 = object15;
            object15 = object18;
            Function2 function22 = object13;
            object13 = object17;
            object18 = object16;
            object16 = object5;
            object17 = object7;
            object6 = new dg0_0((Subcomponent)object9, (Component)object12, d5, (gx0_2)object19, n4, (ft1_2)object11, (BaseValue)object14, (ft1_2)object15, (p83_0)object13, function2, (Function2)object5, (Function1)object7, (Function2)object18, function22);
            n3 = -1302745089;
            object7 = object2;
            object5 = v10.c(n3, (fx0_2)object6, (b30_0)object2);
            n8 = 432;
            f5 = 6.05E-43f;
            object8 = object;
            ov3.p((LP1)object, (u10)object5, (b30_0)object2, n8);
        }
        return Unit.a;
    }
}

