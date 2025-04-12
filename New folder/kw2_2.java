/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.kmm.shared.model.home.BaseValue;
import com.ril.ajio.services.data.fleek.explore_brands.Component;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from KW2
 */
public final class kw2_2
implements Function2 {
    public final /* synthetic */ Component a;
    public final /* synthetic */ BaseValue b;
    public final /* synthetic */ Function2 c;
    public final /* synthetic */ Function2 d;
    public final /* synthetic */ int e;

    public /* synthetic */ kw2_2(Component component, BaseValue baseValue, fh0_1 fh0_12, gh0_1 gh0_12, int n3) {
        this.a = component;
        this.b = baseValue;
        this.c = fh0_12;
        this.d = gh0_12;
        this.e = n3;
    }

    public final Object invoke(Object object, Object object2) {
        Object object3 = object;
        object3 = (b30_0)object;
        ((Integer)object2).getClass();
        Component component = this.a;
        Intrinsics.checkNotNullParameter(component, "$component");
        object = this.c;
        Intrinsics.checkNotNullParameter(object, "$onExploreClick");
        object2 = this.d;
        Intrinsics.checkNotNullParameter(object2, "$sendImpression");
        int n3 = Me3.b(this.e | 1);
        Object object4 = object;
        object4 = (fh0_1)object;
        Object object5 = object2;
        object5 = (gh0_1)object2;
        BaseValue baseValue = this.b;
        tw2_1.a(component, baseValue, (fh0_1)object4, (gh0_1)object5, (b30_0)object3, n3);
        return Unit.a;
    }
}

