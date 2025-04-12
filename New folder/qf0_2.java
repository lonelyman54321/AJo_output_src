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
 * Renamed from QF0
 */
public final class qf0_2
implements Function2 {
    public final /* synthetic */ Component a;
    public final /* synthetic */ BaseValue b;
    public final /* synthetic */ Function2 c;
    public final /* synthetic */ Function2 d;
    public final /* synthetic */ Function1 e;
    public final /* synthetic */ Function2 f;
    public final /* synthetic */ int g;

    public /* synthetic */ qf0_2(Component component, BaseValue baseValue, Function2 function2, ih0_0 ih0_02, ch0_2 ch0_22, nh0_0 nh0_02, int n3) {
        this.a = component;
        this.b = baseValue;
        this.c = function2;
        this.d = ih0_02;
        this.e = ch0_22;
        this.f = nh0_02;
        this.g = n3;
    }

    public final Object invoke(Object object, Object object2) {
        Object object3 = object;
        object3 = (b30_0)object;
        ((Integer)object2).getClass();
        Component component = this.a;
        Intrinsics.checkNotNullParameter(component, "$component");
        Function2 function2 = this.c;
        Intrinsics.checkNotNullParameter(function2, "$onThemeExpandClick");
        object = this.d;
        Intrinsics.checkNotNullParameter(object, "$brandClick");
        object2 = this.e;
        Intrinsics.checkNotNullParameter(object2, "$onViewAllClicked");
        Object object4 = this.f;
        Intrinsics.checkNotNullParameter(object4, "$sendImpression");
        int n3 = Me3.b(this.g | 1);
        Object object5 = object;
        object5 = (ih0_0)object;
        Object object6 = object2;
        object6 = (ch0_2)object2;
        Function2 function22 = object4;
        function22 = (nh0_0)object4;
        object4 = this.b;
        iG0.d(component, (BaseValue)object4, function2, (ih0_0)object5, (ch0_2)object6, (nh0_0)function22, (b30_0)object3, n3);
        return Unit.a;
    }
}

