/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.services.data.fleek.explore_brands.ResourceOwner;
import com.ril.ajio.services.data.fleek.explore_brands.Subcomponent;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from OF0
 */
public final class of0_2
implements Function1 {
    public final /* synthetic */ Function2 a;
    public final /* synthetic */ Subcomponent b;

    public /* synthetic */ of0_2(ih0_0 ih0_02, Subcomponent subcomponent) {
        this.a = ih0_02;
        this.b = subcomponent;
    }

    public final Object invoke(Object object) {
        object = (ResourceOwner)object;
        Function2 function2 = this.a;
        Intrinsics.checkNotNullParameter(function2, "$brandClick");
        Object object2 = this.b;
        if (object2 == null || (object2 = ((Subcomponent)object2).getHeading()) == null) {
            object2 = "";
        }
        function2.invoke(object, object2);
        return Unit.a;
    }
}

