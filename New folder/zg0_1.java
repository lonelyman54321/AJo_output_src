/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.services.data.fleek.explore_brands.Subcomponent;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from zG0
 */
public final class zg0_1
implements Function0 {
    public final /* synthetic */ Subcomponent a;
    public final /* synthetic */ Function2 b;
    public final /* synthetic */ int c;

    public /* synthetic */ zg0_1(int n3, Subcomponent subcomponent, Function2 function2) {
        this.a = subcomponent;
        this.b = function2;
        this.c = n3;
    }

    public final Object invoke() {
        int n3;
        Function2 function2 = this.b;
        Intrinsics.checkNotNullParameter(function2, "$sendImpression");
        Subcomponent subcomponent = this.a;
        if (subcomponent != null && (n3 = subcomponent.isGaFiredInCurrentSession()) == 0) {
            subcomponent.setGaFiredInCurrentSession(true);
            n3 = this.c;
            Integer n4 = n3;
            function2.invoke(n4, subcomponent);
        }
        return Unit.a;
    }
}

