/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.services.data.fleek.explore_brands.Component;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from JW2
 */
public final class jw2_2
implements Function1 {
    public final /* synthetic */ Component a;
    public final /* synthetic */ double b;
    public final /* synthetic */ ft1_2 c;
    public final /* synthetic */ Function2 d;
    public final /* synthetic */ Function2 e;

    public /* synthetic */ jw2_2(Component component, double d2, ft1_2 ft1_22, fh0_1 fh0_12, gh0_1 gh0_12) {
        this.a = component;
        this.b = d2;
        this.c = ft1_22;
        this.d = fh0_12;
        this.e = gh0_12;
    }

    public final Object invoke(Object object) {
        sw2_1 sw2_12;
        int n3;
        object = (dt1_0)object;
        Component component = this.a;
        Intrinsics.checkNotNullParameter(component, "$component");
        ft1_2 ft1_22 = this.c;
        Intrinsics.checkNotNullParameter(ft1_22, "$lazyListState");
        fx0_2 fx0_22 = this.d;
        Intrinsics.checkNotNullParameter(fx0_22, "$onExploreClick");
        Function2 function2 = this.e;
        Intrinsics.checkNotNullParameter(function2, "$sendImpression");
        Intrinsics.checkNotNullParameter(object, "$this$LazyRow");
        p83_0 p83_02 = component.getSubcomponents();
        if (p83_02 != null) {
            int n4;
            n3 = n4 = p83_02.size();
        } else {
            boolean bl2 = false;
            p83_02 = null;
            n3 = 0;
        }
        Function2 function22 = fx0_22;
        function22 = (fh0_1)fx0_22;
        Function2 function23 = function2;
        function23 = (gh0_1)function2;
        double d2 = this.b;
        fx0_22 = sw2_12;
        sw2_12 = new sw2_1(component, d2, ft1_22, (fh0_1)function22, (gh0_1)function23);
        fx0_22 = new u10(635079430, sw2_12, true);
        bt1.b((dt1_0)object, n3, null, (u10)fx0_22, 6);
        return Unit.a;
    }
}

