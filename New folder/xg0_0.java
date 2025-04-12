/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.services.data.fleek.explore_brands.ResourceOwner;
import com.ril.ajio.services.data.fleek.explore_brands.Subcomponent;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from xG0
 */
public final class xg0_0
implements Function0 {
    public final /* synthetic */ Subcomponent a;
    public final /* synthetic */ Function2 b;

    public /* synthetic */ xg0_0(Subcomponent subcomponent, Function2 function2) {
        this.a = subcomponent;
        this.b = function2;
    }

    public final Object invoke() {
        boolean bl2;
        Function2 function2 = this.b;
        Intrinsics.checkNotNullParameter(function2, "$sendProductImpression");
        Object object = this.a;
        if (object != null && !(bl2 = ((Subcomponent)object).isProductGaFiredInCurrentSession())) {
            bl2 = true;
            ((Subcomponent)object).setProductGaFiredInCurrentSession(bl2);
            List list = ((Subcomponent)object).getResources();
            if (list != null) {
                list = CollectionsKt.m0(list);
            } else {
                bl2 = false;
                list = null;
            }
            object = ((Subcomponent)object).getResourceOwner();
            if (object == null || (object = ((ResourceOwner)object).getName()) == null) {
                object = "";
            }
            function2.invoke(list, object);
        }
        return Unit.a;
    }
}

