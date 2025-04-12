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
 * Renamed from lG0
 */
public final class lg0_1
implements Function1 {
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

    public /* synthetic */ lg0_1(Component component, double d2, gx0_2 gx0_22, ft1_2 ft1_22, BaseValue baseValue, ft1_2 ft1_23, p83_0 p83_02, Function2 function2, Function2 function22, Function1 function1, Function2 function23, Function2 function24) {
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

    public final Object invoke(Object object) {
        fx0_2 fx0_22;
        int n3;
        fx0_2 fx0_23 = this;
        Object object2 = object;
        object2 = (dt1_0)object;
        Component component = this.a;
        Intrinsics.checkNotNullParameter(component, "$component");
        gx0_2 gx0_22 = this.c;
        Intrinsics.checkNotNullParameter(gx0_22, "$onProductClick");
        ft1_2 ft1_22 = this.d;
        Intrinsics.checkNotNullParameter(ft1_22, "$listState");
        ft1_2 ft1_23 = this.f;
        Intrinsics.checkNotNullParameter(ft1_23, "$listStateColumn");
        Function2 function2 = this.h;
        Intrinsics.checkNotNullParameter(function2, "$onBrandClicked");
        Function2 function22 = this.i;
        Intrinsics.checkNotNullParameter(function22, "$onFollowClick");
        Function1 function1 = this.j;
        Intrinsics.checkNotNullParameter(function1, "$onViewAllClick");
        Function2 function23 = this.k;
        Intrinsics.checkNotNullParameter(function23, "$sendImpression");
        fx0_2 fx0_24 = this.l;
        Intrinsics.checkNotNullParameter(fx0_24, "$sendProductImpression");
        Intrinsics.checkNotNullParameter(object2, "$this$LazyRow");
        Object object3 = component.getSubcomponents();
        if (object3 != null) {
            int n4;
            n3 = n4 = ((p83_0)object3).size();
        } else {
            boolean bl2 = false;
            object3 = null;
            n3 = 0;
        }
        Object object4 = new ng0_2(component, 0);
        BaseValue baseValue = fx0_23.e;
        object3 = fx0_23.g;
        object = function23;
        Function2 function24 = fx0_24;
        double d2 = fx0_23.b;
        p83_0 p83_02 = object3;
        object3 = fx0_22;
        fx0_23 = fx0_22;
        fx0_24 = object4;
        object4 = baseValue;
        fx0_2 fx0_25 = fx0_24;
        fx0_24 = function24;
        fx0_22 = new eg0$a_0(component, d2, gx0_22, ft1_22, baseValue, ft1_23, p83_02, function2, function22, function1, function23, function24);
        object3 = new u10(1608786417, fx0_22, true);
        fx0_22 = fx0_25;
        bt1.b((dt1_0)object2, n3, (Function1)fx0_25, (u10)object3, 4);
        return Unit.a;
    }
}

