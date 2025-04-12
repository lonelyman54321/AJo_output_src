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
 * Renamed from zP
 */
public final class zp_1
implements Function2 {
    public final /* synthetic */ LP1 a;
    public final /* synthetic */ Component b;
    public final /* synthetic */ ft1_2 c;
    public final /* synthetic */ Function1 d;
    public final /* synthetic */ Function0 e;
    public final /* synthetic */ int f;

    public /* synthetic */ zp_1(int n3, uk0_2 uk0_22, vk0_2 vk0_22, ft1_2 ft1_22, Component component) {
        LP1$a lP1$a = LP1$a.b;
        this.a = lP1$a;
        this.b = component;
        this.c = ft1_22;
        this.d = vk0_22;
        this.e = uk0_22;
        this.f = n3;
    }

    public final Object invoke(Object object, Object object2) {
        Object object3 = object;
        object3 = (b30_0)object;
        ((Integer)object2).getClass();
        Intrinsics.checkNotNullParameter(this.a, "$modifier");
        Component component = this.b;
        Intrinsics.checkNotNullParameter(component, "$component");
        ft1_2 ft1_22 = this.c;
        Intrinsics.checkNotNullParameter(ft1_22, "$listStateColumn");
        object = this.d;
        Intrinsics.checkNotNullParameter(object, "$brandClick");
        object2 = this.e;
        Intrinsics.checkNotNullParameter(object2, "$sendImpression");
        int n3 = Me3.b(this.f | 1);
        Object object4 = object;
        object4 = (vk0_2)object;
        Object object5 = object2;
        object5 = (uk0_2)object2;
        np_0.a(n3, (b30_0)object3, (uk0_2)object5, (vk0_2)object4, ft1_22, component);
        return Unit.a;
    }
}

