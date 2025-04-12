/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.services.data.fleek.explore_brands.Subcomponent;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from rG0
 */
public final class rg0_1
implements Function2 {
    public final /* synthetic */ Subcomponent a;
    public final /* synthetic */ double b;
    public final /* synthetic */ gx0_2 c;
    public final /* synthetic */ Function0 d;
    public final /* synthetic */ int e;

    public /* synthetic */ rg0_1(Subcomponent subcomponent, double d2, gx0_2 gx0_22, Function0 function0, int n3) {
        this.a = subcomponent;
        this.b = d2;
        this.c = gx0_22;
        this.d = function0;
        this.e = n3;
    }

    public final Object invoke(Object object, Object object2) {
        Object object3 = object;
        object3 = (b30_0)object;
        ((Integer)object2).intValue();
        gx0_2 gx0_22 = this.c;
        Intrinsics.checkNotNullParameter(gx0_22, "$onProductClick");
        Function0 function0 = this.d;
        Intrinsics.checkNotNullParameter(function0, "$onViewAllClick");
        int n3 = Me3.b(this.e | 1);
        Subcomponent subcomponent = this.a;
        double d2 = this.b;
        eg0_0.d(subcomponent, d2, gx0_22, function0, (b30_0)object3, n3);
        return Unit.a;
    }
}

