/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.services.data.fleek.explore_brands.ResourceOwner;
import com.ril.ajio.services.data.fleek.explore_brands.Subcomponent;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from uG0
 */
public final class ug0_0
implements Function0 {
    public final /* synthetic */ Function2 a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Subcomponent c;

    public /* synthetic */ ug0_0(Function2 function2, boolean bl2, Subcomponent subcomponent) {
        this.a = function2;
        this.b = bl2;
        this.c = subcomponent;
    }

    public final Object invoke() {
        Function2 function2 = this.a;
        Intrinsics.checkNotNullParameter(function2, "$onFollowClick");
        boolean bl2 = this.b;
        Boolean bl3 = bl2;
        Object object = this.c;
        object = object != null && (object = ((Subcomponent)object).getResourceOwner()) != null ? ((ResourceOwner)object).getId() : null;
        function2.invoke(bl3, object);
        return Unit.a;
    }
}

