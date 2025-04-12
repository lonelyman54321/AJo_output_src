/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.services.data.fleek.feedModel.Subcomponent;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from qD
 */
public final class qd_2
implements Function0 {
    public final /* synthetic */ Function2 a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Subcomponent c;

    public /* synthetic */ qd_2(Function2 function2, int n3, Subcomponent subcomponent) {
        this.a = function2;
        this.b = n3;
        this.c = subcomponent;
    }

    public final Object invoke() {
        Function2 function2 = this.a;
        Intrinsics.checkNotNullParameter(function2, "$onBannerClick");
        Object object = this.c;
        Intrinsics.checkNotNullParameter(object, "$bannerData");
        Integer n3 = this.b;
        object = ((Subcomponent)object).getId();
        function2.invoke(n3, object);
        return Unit.a;
    }
}

