/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.services.data.fleek.feedModel.Component;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from AP
 */
public final class ap_1
implements Function2 {
    public final /* synthetic */ Component a;
    public final /* synthetic */ p83_0 b;
    public final /* synthetic */ ft1_2 c;
    public final /* synthetic */ Function1 d;
    public final /* synthetic */ int e;

    public /* synthetic */ ap_1(Component component, p83_0 p83_02, ft1_2 ft1_22, vk0_2 vk0_22, int n3) {
        this.a = component;
        this.b = p83_02;
        this.c = ft1_22;
        this.d = vk0_22;
        this.e = n3;
    }

    public final Object invoke(Object object, Object object2) {
        Object object3 = object;
        object3 = (b30_0)object;
        ((Integer)object2).getClass();
        Component component = this.a;
        Intrinsics.checkNotNullParameter(component, "$component");
        ft1_2 ft1_22 = this.c;
        Intrinsics.checkNotNullParameter(ft1_22, "$listStateColumn");
        object = this.d;
        Intrinsics.checkNotNullParameter(object, "$brandClick");
        int n3 = Me3.b(this.e | 1);
        p83_0 p83_02 = this.b;
        Object object4 = object;
        object4 = (vk0_2)object;
        np_0.e(component, p83_02, ft1_22, (vk0_2)object4, (b30_0)object3, n3);
        return Unit.a;
    }
}

