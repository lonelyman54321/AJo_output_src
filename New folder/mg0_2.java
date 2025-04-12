/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.kmm.shared.model.home.BaseValue;
import com.ril.ajio.services.data.fleek.explore_brands.Component;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from mG0
 */
public final class mg0_2
implements Function2 {
    public final /* synthetic */ p83_0 a;
    public final /* synthetic */ Component b;
    public final /* synthetic */ BaseValue c;
    public final /* synthetic */ Function1 d;
    public final /* synthetic */ Function2 e;
    public final /* synthetic */ gx0_2 f;
    public final /* synthetic */ Function2 g;
    public final /* synthetic */ ft1_2 h;
    public final /* synthetic */ Function2 i;
    public final /* synthetic */ Function2 j;
    public final /* synthetic */ int k;

    public /* synthetic */ mg0_2(p83_0 p83_02, Component component, BaseValue baseValue, Function1 function1, Function2 function2, gx0_2 gx0_22, Function2 function22, ft1_2 ft1_22, Function2 function23, Function2 function24, int n3) {
        this.a = p83_02;
        this.b = component;
        this.c = baseValue;
        this.d = function1;
        this.e = function2;
        this.f = gx0_22;
        this.g = function22;
        this.h = ft1_22;
        this.i = function23;
        this.j = function24;
        this.k = n3;
    }

    public final Object invoke(Object object, Object object2) {
        Object object3 = object;
        object3 = (b30_0)object;
        ((Integer)object2).intValue();
        Component component = this.b;
        Intrinsics.checkNotNullParameter(component, "$component");
        Function1 function1 = this.d;
        Intrinsics.checkNotNullParameter(function1, "$onViewAllClick");
        Function2 function2 = this.e;
        Intrinsics.checkNotNullParameter(function2, "$onFollowClick");
        gx0_2 gx0_22 = this.f;
        Intrinsics.checkNotNullParameter(gx0_22, "$onProductClick");
        Function2 function22 = this.g;
        Intrinsics.checkNotNullParameter(function22, "$onBrandClicked");
        ft1_2 ft1_22 = this.h;
        Intrinsics.checkNotNullParameter(ft1_22, "$listStateColumn");
        Function2 function23 = this.i;
        Intrinsics.checkNotNullParameter(function23, "$sendImpression");
        Function2 function24 = this.j;
        Intrinsics.checkNotNullParameter(function24, "$sendProductImpression");
        int n3 = Me3.b(this.k | 1);
        p83_0 p83_02 = this.a;
        BaseValue baseValue = this.c;
        eg0_0.b(p83_02, component, baseValue, function1, function2, gx0_22, function22, ft1_22, function23, function24, (b30_0)object3, n3);
        return Unit.a;
    }
}

