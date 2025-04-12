/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.services.data.fleek.explore_brands.Subcomponent;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from GG0
 */
public final class gg0_0
implements Function1 {
    public final /* synthetic */ Subcomponent a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    public final /* synthetic */ gx0_2 d;

    public /* synthetic */ gg0_0(Subcomponent subcomponent, float f5, float f6, gx0_2 gx0_22) {
        this.a = subcomponent;
        this.b = f5;
        this.c = f6;
        this.d = gx0_22;
    }

    public final Object invoke(Object object) {
        int n3;
        p83_0 p83_02;
        object = (dt1_0)object;
        gx0_2 gx0_22 = this.d;
        Intrinsics.checkNotNullParameter(gx0_22, "$onProductClick");
        Intrinsics.checkNotNullParameter(object, "$this$LazyRow");
        Subcomponent subcomponent = this.a;
        if (subcomponent != null && (p83_02 = subcomponent.getResources()) != null) {
            n3 = p83_02.size();
        } else {
            n3 = 0;
            p83_02 = null;
        }
        float f5 = this.b;
        float f6 = this.c;
        ig0_1 ig0_12 = new ig0_1(subcomponent, f5, f6, gx0_22);
        gx0_22 = new u10(740959226, ig0_12, true);
        bt1.b((dt1_0)object, n3, null, (u10)gx0_22, 6);
        return Unit.a;
    }
}

