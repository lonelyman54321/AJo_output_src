/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.services.data.fleek.feedModel.Component;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from CP
 */
public final class cp_0
implements Function2 {
    public final /* synthetic */ Component a;
    public final /* synthetic */ Cl2 b;
    public final /* synthetic */ ft1_2 c;
    public final /* synthetic */ p83_0 d;
    public final /* synthetic */ int e;

    public /* synthetic */ cp_0(Component component, hm0_0 hm0_02, ft1_2 ft1_22, p83_0 p83_02, int n3) {
        this.a = component;
        this.b = hm0_02;
        this.c = ft1_22;
        this.d = p83_02;
        this.e = n3;
    }

    public final Object invoke(Object object, Object object2) {
        Object object3 = object;
        object3 = (b30_0)object;
        ((Integer)object2).getClass();
        Component component = this.a;
        Intrinsics.checkNotNullParameter(component, "$component");
        object = this.b;
        Intrinsics.checkNotNullParameter(object, "$pagerState");
        ft1_2 ft1_22 = this.c;
        Intrinsics.checkNotNullParameter(ft1_22, "$listStateColumn");
        int n3 = Me3.b(this.e | 1);
        p83_0 p83_02 = this.d;
        Object object4 = object;
        object4 = (hm0_0)object;
        np_0.g(component, (hm0_0)object4, ft1_22, p83_02, (b30_0)object3, n3);
        return Unit.a;
    }
}

