/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import com.ril.ajio.services.data.fleek.explore_brands.Component;
import com.ril.ajio.services.data.fleek.explore_brands.Subcomponent;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from SW2
 */
public final class sw2_1
implements hx0_2 {
    public final /* synthetic */ Component a;
    public final /* synthetic */ double b;
    public final /* synthetic */ ft1_2 c;
    public final /* synthetic */ Function2 d;
    public final /* synthetic */ Function2 e;

    public sw2_1(Component component, double d2, ft1_2 ft1_22, fh0_1 fh0_12, gh0_1 gh0_12) {
        this.a = component;
        this.b = d2;
        this.c = ft1_22;
        this.d = fh0_12;
        this.e = gh0_12;
    }

    public final Object invoke(Object object, Object object2, Object object3, Object object4) {
        int n3;
        sw2_1 sw2_12 = this;
        int n4 = 1;
        Object object5 = object;
        object5 = (wr1_2)object;
        Object object6 = object2;
        object6 = (Number)object2;
        int n7 = ((Number)object6).intValue();
        Object object7 = object3;
        object7 = (b30_0)object3;
        Object object8 = object4;
        object8 = (Number)object4;
        int n8 = ((Number)object8).intValue();
        Object object9 = "$this$items";
        Intrinsics.checkNotNullParameter(object5, (String)object9);
        int n10 = n8 & 0x70;
        if (n10 == 0) {
            n10 = (int)(object7.c(n7) ? 1 : 0);
            n10 = n10 != 0 ? 32 : 16;
            n8 |= n10;
        }
        if ((n10 = n8 & 0x2D1) == (n3 = 144) && (n10 = (int)(object7.h() ? 1 : 0)) != 0) {
            object7.D();
        } else {
            object5 = sw2_12.a;
            object9 = ((Component)object5).getSubcomponents();
            int n14 = 0;
            Function2 function2 = null;
            if (object9 != null) {
                object9 = (Subcomponent)CollectionsKt.N(n7, (List)object9);
            } else {
                n3 = 0;
                object9 = null;
            }
            object5 = ((Component)object5).getSubcomponents();
            boolean bl2 = false;
            LP1 lP1 = null;
            if (object5 != null && n7 == (n10 = xx_2.h((List)object5))) {
                n10 = 1;
            } else {
                n10 = 0;
                object5 = null;
            }
            if (n7 == 0) {
                bl2 = true;
            }
            double d2 = sw2_12.b;
            float f5 = (float)d2;
            float f6 = x20_0.b(f5, (b30_0)object7) / 0.8f;
            int n15 = (int)f6;
            LP1$a lP1$a = LP1$a.b;
            Function1 function1 = new Object();
            Intrinsics.checkNotNullParameter(lP1$a, "<this>");
            String string2 = "ifTrue";
            Intrinsics.checkNotNullParameter(function1, string2);
            if (bl2) {
                lP1 = (LP1)function1.invoke(lP1$a);
            } else {
                Intrinsics.checkNotNullParameter(lP1$a, "$this$conditional");
                float f7 = uq0_0.l;
                int n16 = 14;
                lP1 = h.i(lP1$a, f7, 0.0f, 0.0f, 0.0f, n16);
            }
            function1 = new jc_2(n4);
            Object object10 = j.m(j.k(x20_0.a(lP1, n10 != 0, function1, null), f5));
            function2 = sw2_12.d;
            object5 = new rw2_2((Subcomponent)object9, n15, function2, n7);
            object5 = v10.c(-546401480, (fx0_2)object5, (b30_0)object7);
            n14 = 432;
            ov3.p((LP1)object10, (u10)object5, (b30_0)object7, n14);
            object5 = sw2_12.e;
            object10 = new mw2_1(n7, (Subcomponent)object9, (Function2)object5);
            n10 = n8 >> 3 & 0xE;
            object8 = sw2_12.c;
            ov3.m(n7, (ft1_2)object8, (Function0)object10, (b30_0)object7, n10);
        }
        return Unit.a;
    }
}

