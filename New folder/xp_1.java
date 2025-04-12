/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.services.data.fleek.feedModel.Component;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from xP
 */
public final class xp_1
implements Function2 {
    public final /* synthetic */ Component a;
    public final /* synthetic */ ft1_2 b;
    public final /* synthetic */ Function0 c;
    public final /* synthetic */ Function1 d;
    public final /* synthetic */ int e;

    public /* synthetic */ xp_1(int n3, uk0_2 uk0_22, vk0_2 vk0_22, ft1_2 ft1_22, Component component) {
        this.a = component;
        this.b = ft1_22;
        this.c = uk0_22;
        this.d = vk0_22;
        this.e = n3;
    }

    public final Object invoke(Object object, Object object2) {
        Object object3 = object;
        object3 = (b30_0)object;
        ((Integer)object2).getClass();
        Component component = this.a;
        Intrinsics.checkNotNullParameter(component, "$component");
        ft1_2 ft1_22 = this.b;
        Intrinsics.checkNotNullParameter(ft1_22, "$listStateColumn");
        object = this.c;
        Intrinsics.checkNotNullParameter(object, "$sendImpression");
        object2 = this.d;
        Intrinsics.checkNotNullParameter(object2, "$brandClick");
        int n3 = Me3.b(this.e | 1);
        Object object4 = object;
        object4 = (uk0_2)object;
        Object object5 = object2;
        object5 = (vk0_2)object2;
        np_0.b(n3, (b30_0)object3, (uk0_2)object4, (vk0_2)object5, ft1_22, component);
        return Unit.a;
    }
}

