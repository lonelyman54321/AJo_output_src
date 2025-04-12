/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.services.data.fleek.feedModel.Component;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from oF2
 */
public final class of2_1
implements Function2 {
    public final /* synthetic */ LP1 a;
    public final /* synthetic */ Function2 b;
    public final /* synthetic */ Component c;
    public final /* synthetic */ int d;

    public /* synthetic */ of2_1(LP1 lP1, wk0_2 wk0_22, Component component, int n3) {
        this.a = lP1;
        this.b = wk0_22;
        this.c = component;
        this.d = n3;
    }

    public final Object invoke(Object object, Object object2) {
        object = (b30_0)object;
        ((Integer)object2).getClass();
        object2 = this.b;
        Intrinsics.checkNotNullParameter(object2, "$onItemClick");
        Component component = this.c;
        Intrinsics.checkNotNullParameter(component, "$component");
        int n3 = Me3.b(this.d | 1);
        LP1 lP1 = this.a;
        object2 = (wk0_2)object2;
        AF2.b(lP1, (wk0_2)object2, component, (b30_0)object, n3);
        return Unit.a;
    }
}

