/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.services.data.fleek.explore_brands.Subcomponent;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from vG0
 */
public final class vg0_0
implements Function0 {
    public final /* synthetic */ Function1 a;
    public final /* synthetic */ Subcomponent b;

    public /* synthetic */ vg0_0(Function1 function1, Subcomponent subcomponent) {
        this.a = function1;
        this.b = subcomponent;
    }

    public final Object invoke() {
        Function1 function1 = this.a;
        Intrinsics.checkNotNullParameter(function1, "$onViewAllClick");
        Subcomponent subcomponent = this.b;
        function1.invoke(subcomponent);
        return Unit.a;
    }
}

