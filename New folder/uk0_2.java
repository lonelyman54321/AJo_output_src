/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.services.data.fleek.feedModel.Component;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.g;

/*
 * Renamed from uK0
 */
public final class uk0_2
implements Function0 {
    public final /* synthetic */ i90_0 a;
    public final /* synthetic */ Component b;

    public /* synthetic */ uk0_2(c80 c802, Component component) {
        this.a = c802;
        this.b = component;
    }

    public final Object invoke() {
        i90_0 i90_02 = this.a;
        Intrinsics.checkNotNullParameter(i90_02, "$scope");
        g g3 = ir0_2.a;
        g3 = em0_2.b;
        Component component = this.b;
        ak0_2 ak0_22 = new ak0_2(component, null);
        Ae3.d(i90_02, g3, null, ak0_22, 2);
        return Unit.a;
    }
}

