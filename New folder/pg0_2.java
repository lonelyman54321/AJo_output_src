/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.kmm.shared.model.home.BaseValue;
import com.ril.ajio.services.data.fleek.explore_brands.Component;
import com.ril.ajio.services.data.fleek.explore_brands.Subcomponent;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from pG0
 */
public final class pg0_2
implements Function2 {
    public final /* synthetic */ double a;
    public final /* synthetic */ BaseValue b;
    public final /* synthetic */ Subcomponent c;
    public final /* synthetic */ ft1_2 d;
    public final /* synthetic */ p83_0 e;
    public final /* synthetic */ ft1_2 f;
    public final /* synthetic */ p83_0 g;
    public final /* synthetic */ Component h;
    public final /* synthetic */ int i;

    public /* synthetic */ pg0_2(double d2, BaseValue baseValue, Subcomponent subcomponent, ft1_2 ft1_22, p83_0 p83_02, ft1_2 ft1_23, p83_0 p83_03, Component component, int n3) {
        this.a = d2;
        this.b = baseValue;
        this.c = subcomponent;
        this.d = ft1_22;
        this.e = p83_02;
        this.f = ft1_23;
        this.g = p83_03;
        this.h = component;
        this.i = n3;
    }

    public final Object invoke(Object object, Object object2) {
        Object object3 = object;
        object3 = (b30_0)object;
        ((Integer)object2).getClass();
        ft1_2 ft1_22 = this.d;
        Intrinsics.checkNotNullParameter(ft1_22, "$listState");
        ft1_2 ft1_23 = this.f;
        Intrinsics.checkNotNullParameter(ft1_23, "$listStateColumn");
        int n3 = Me3.b(this.i | 1);
        p83_0 p83_02 = this.g;
        Component component = this.h;
        double d2 = this.a;
        BaseValue baseValue = this.b;
        Subcomponent subcomponent = this.c;
        p83_0 p83_03 = this.e;
        eg0_0.c(d2, baseValue, subcomponent, ft1_22, p83_03, ft1_23, p83_02, component, (b30_0)object3, n3);
        return Unit.a;
    }
}

