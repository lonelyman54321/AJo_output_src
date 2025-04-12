/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.services.data.fleek.feedModel.Component;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from DP
 */
public final class dp_0
implements Function2 {
    public final /* synthetic */ Component a;
    public final /* synthetic */ p83_0 b;
    public final /* synthetic */ Cl2 c;
    public final /* synthetic */ Function1 d;
    public final /* synthetic */ int e;

    public /* synthetic */ dp_0(Component component, p83_0 p83_02, hm0_0 hm0_02, vk0_2 vk0_22, int n3) {
        this.a = component;
        this.b = p83_02;
        this.c = hm0_02;
        this.d = vk0_22;
        this.e = n3;
    }

    public final Object invoke(Object object, Object object2) {
        Object object3 = object;
        object3 = (b30_0)object;
        ((Integer)object2).getClass();
        Component component = this.a;
        Intrinsics.checkNotNullParameter(component, "$component");
        object = this.c;
        Intrinsics.checkNotNullParameter(object, "$pagerState");
        object2 = this.d;
        Intrinsics.checkNotNullParameter(object2, "$brandClick");
        int n3 = Me3.b(this.e | 1);
        Object object4 = object;
        object4 = (hm0_0)object;
        Object object5 = object2;
        object5 = (vk0_2)object2;
        p83_0 p83_02 = this.b;
        np_0.d(component, p83_02, (hm0_0)object4, (vk0_2)object5, (b30_0)object3, n3);
        return Unit.a;
    }
}

