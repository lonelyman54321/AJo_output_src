/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.foundation.layout.j;
import com.ril.ajio.services.data.fleek.explore_brands.Resource;
import com.ril.ajio.services.data.fleek.explore_brands.Subcomponent;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from IG0
 */
public final class ig0_1
implements hx0_2 {
    public final /* synthetic */ Subcomponent a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    public final /* synthetic */ gx0_2 d;

    public ig0_1(Subcomponent subcomponent, float f5, float f6, gx0_2 gx0_22) {
        this.a = subcomponent;
        this.b = f5;
        this.c = f6;
        this.d = gx0_22;
    }

    public final Object invoke(Object object, Object object2, Object object3, Object object4) {
        ig0_1 ig0_12 = this;
        Object object5 = object;
        object5 = (wr1_2)object;
        Object object6 = object2;
        object6 = (Number)object2;
        int n3 = ((Number)object6).intValue();
        Object object7 = object3;
        object7 = (b30_0)object3;
        Object object8 = object4;
        object8 = (Number)object4;
        int n4 = ((Number)object8).intValue();
        Object object9 = "$this$items";
        Intrinsics.checkNotNullParameter(object5, (String)object9);
        int n7 = n4 & 0x70;
        if (n7 == 0) {
            n7 = (int)(object7.c(n3) ? 1 : 0);
            n7 = n7 != 0 ? 32 : 16;
            n4 |= n7;
        }
        if ((n7 = n4 & 0x2D1) == (n4 = 144) && (n7 = (int)(object7.h() ? 1 : 0)) != 0) {
            object7.D();
        } else {
            object5 = ig0_12.a;
            object8 = ((Subcomponent)object5).getResources();
            int n8 = 0;
            object9 = null;
            if (object8 != null) {
                object8 = (Resource)CollectionsKt.N(n3, (List)object8);
            } else {
                n4 = 0;
                object8 = null;
            }
            LP1 lP1 = LP1$a.b;
            float f5 = ig0_12.b;
            lP1 = j.k(lP1, f5);
            f5 = ig0_12.c;
            lP1 = j.d(lP1, f5);
            Object object10 = SP2.a(uq0_0.e);
            lP1 = QV.a(lP1, (i13)object10);
            gx0_2 gx0_22 = ig0_12.d;
            object10 = new hg0_0(gx0_22, (Resource)object8, n3, (Subcomponent)object5);
            object5 = x20_0.d(lP1, (Function0)object10);
            object6 = i70$a.a;
            he1_2 he1_22 = new he1_2(null, "", (i70_0)object6, 121);
            n8 = 1;
            object6 = new fd_1(object8, n8);
            u10 u102 = p10_0.c;
            u10 u103 = p10_0.d;
            int n10 = 6;
            int n14 = 732;
            lP1 = null;
            f5 = 0.0f;
            object10 = null;
            gx0_22 = null;
            int n15 = 0x6000000;
            object8 = object6;
            object9 = object5;
            vw_1.b((Function0)object6, (LP1)object5, null, null, null, he1_22, null, null, u102, null, u103, (b30_0)object7, n15, n10, n14);
        }
        return Unit.a;
    }
}

