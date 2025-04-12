/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.services.data.fleek.explore_brands.Subcomponent;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from PW2
 */
public final class pw2_1
implements Function0 {
    public final /* synthetic */ Function2 a;
    public final /* synthetic */ Subcomponent b;
    public final /* synthetic */ int c;

    public /* synthetic */ pw2_1(int n3, Subcomponent subcomponent, Function2 function2) {
        this.a = function2;
        this.b = subcomponent;
        this.c = n3;
    }

    public final Object invoke() {
        Function2 function2 = this.a;
        Intrinsics.checkNotNullParameter(function2, "$onExploreClick");
        Integer n3 = this.c;
        Subcomponent subcomponent = this.b;
        function2.invoke(subcomponent, n3);
        return Unit.a;
    }
}

