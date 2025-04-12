/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.services.data.fleek.feedModel.Resource;
import com.ril.ajio.services.data.fleek.feedModel.ResourceOwner;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from sA2
 */
public final class sa2_0
implements Function0 {
    public final /* synthetic */ Function2 a;
    public final /* synthetic */ Resource b;

    public /* synthetic */ sa2_0(Function2 function2, Resource resource) {
        this.a = function2;
        this.b = resource;
    }

    public final Object invoke() {
        Object object;
        Function2 function2 = this.a;
        Intrinsics.checkNotNullParameter(function2, "$onViewAllClick");
        Object object2 = this.b;
        String string2 = null;
        object = object2 != null && (object = ((Resource)object2).getResourceOwner()) != null ? ((ResourceOwner)object).getCode() : null;
        if (object2 != null && (object2 = ((Resource)object2).getResourceOwner()) != null) {
            string2 = ((ResourceOwner)object2).getName();
        }
        function2.invoke(object, string2);
        return Unit.a;
    }
}

