/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.services.data.fleek.feedModel.ResourceOwner;
import com.ril.ajio.services.data.fleek.feedModel.Subcomponent;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from tF2
 */
public final class tf2_0
implements Function0 {
    public final /* synthetic */ Function2 a;
    public final /* synthetic */ Subcomponent b;

    public /* synthetic */ tf2_0(Function2 function2, Subcomponent subcomponent) {
        this.a = function2;
        this.b = subcomponent;
    }

    public final Object invoke() {
        Object object;
        Function2 function2 = this.a;
        Intrinsics.checkNotNullParameter(function2, "$onItemClick");
        Object object2 = this.b;
        String string2 = null;
        object = object2 != null && (object = ((Subcomponent)object2).getResourceOwner()) != null ? ((ResourceOwner)object).getId() : null;
        if (object2 != null && (object2 = ((Subcomponent)object2).getResourceOwner()) != null) {
            string2 = ((ResourceOwner)object2).getCode();
        }
        function2.invoke(object, string2);
        return Unit.a;
    }
}

