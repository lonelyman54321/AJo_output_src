/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.foundation.layout.j;
import com.ril.ajio.kmm.shared.model.home.BaseValue;
import com.ril.ajio.kmm.shared.model.home.transform.ScreenInfo;
import com.ril.ajio.services.data.fleek.explore_brands.Style;
import com.ril.ajio.services.data.fleek.explore_brands.Subcomponent;
import java.io.Serializable;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from eG0
 */
public final class eg0_2
implements gx0_2 {
    public final /* synthetic */ Subcomponent a;
    public final /* synthetic */ BaseValue b;

    public eg0_2(Subcomponent subcomponent, BaseValue baseValue) {
        this.a = subcomponent;
        this.b = baseValue;
    }

    public final Object invoke(Object object, Object object2, Object object3) {
        float f5;
        eg0_2 eg0_22 = this;
        Object object4 = object;
        object4 = (PA)object;
        Object object5 = object2;
        object5 = (b30_0)object2;
        Object object6 = object3;
        object6 = (Number)object3;
        int n3 = ((Number)object6).intValue();
        Object object7 = "$this$BoxWithConstraints";
        Intrinsics.checkNotNullParameter(object4, (String)object7);
        int n4 = n3 & 0xE;
        if (n4 == 0) {
            n4 = (int)(object5.J(object4) ? 1 : 0);
            if (n4 != 0) {
                n4 = 4;
                f5 = 5.6E-45f;
            } else {
                n4 = 2;
                f5 = 2.8E-45f;
            }
            n3 |= n4;
        }
        n4 = 18;
        f5 = 2.5E-44f;
        if ((n3 &= 0x5B) == n4 && (n3 = (int)(object5.h() ? 1 : 0)) != 0) {
            object5.D();
        } else {
            Object object8;
            object6 = eg0_22.a;
            if (object6 == null || (object7 = ((Subcomponent)object6).getStyle()) == null || (object7 = ((Style)object7).getUnit()) == null) {
                object7 = "PERCENTAGE";
            }
            int n7 = (int)x20_0.b(object4.c(), (b30_0)object5);
            Object object9 = hv3_0.a;
            object9.getClass();
            int n8 = hv3_0.E();
            Object object10 = new ScreenInfo(n7, n8);
            Serializable serializable = az3_0.a;
            n7 = 0;
            float f6 = 0.0f;
            serializable = null;
            if (object6 != null && (object9 = ((Subcomponent)object6).getStyle()) != null) {
                object9 = ((Style)object9).getWidth();
            } else {
                n8 = 0;
                object9 = null;
            }
            if (object6 != null && (object8 = ((Subcomponent)object6).getStyle()) != null) {
                serializable = ((Style)object8).getHeight();
            }
            object8 = eg0_22.b;
            object7 = az3_0.c((String)object7, (Double)object9, (Double)serializable, (BaseValue)object8, (ScreenInfo)object10);
            float f7 = ((ScreenInfo)object7).getHeight();
            n7 = 0;
            f6 = 0.0f;
            serializable = null;
            float f8 = f7 - 0.0f;
            Object object11 = f8 == 0.0f ? 0 : (f8 > 0.0f ? 1 : -1);
            if (object11 > 0) {
                object11 = ((ScreenInfo)object7).getWidth();
                f7 = object11;
                n4 = ((ScreenInfo)object7).getHeight();
                f5 = n4;
                f7 /= f5;
            } else {
                object11 = 0x3FB33333;
                f7 = 1.4f;
            }
            int n10 = (int)(x20_0.b(object4.c(), (b30_0)object5) / f7);
            object7 = j.c(LP1$a.b, 1.0f);
            f7 = x20_0.e((b30_0)object5, n10);
            f6 = uq0_0.e;
            object7 = j.d((LP1)object7, f7 += f6);
            object10 = new Object();
            object7 = QV.a((LP1)object7, (i13)object10);
            object10 = new Object();
            object7 = x20_0.d((LP1)object7, (Function0)object10);
            object10 = new zf0_2(object6, 0);
            object6 = new bg0_1(n10);
            u10 u102 = v10.c(-585132328, (fx0_2)object6, (b30_0)object5);
            object6 = new dg0_2(n10);
            u10 u103 = v10.c(-73657599, (fx0_2)object6, (b30_0)object5);
            int n14 = 6;
            int n15 = 764;
            n10 = 0;
            object4 = null;
            n7 = 0;
            f6 = 0.0f;
            serializable = null;
            n8 = 0;
            object9 = null;
            object8 = null;
            int n16 = 0x6000000;
            object6 = object10;
            object11 = false;
            object10 = null;
            f7 = 0.0f;
            vw_1.b((Function0)object6, (LP1)object7, null, null, null, null, null, null, u102, null, u103, (b30_0)object5, n16, n14, n15);
        }
        return Unit.a;
    }
}

