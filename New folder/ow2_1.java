/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.services.data.fleek.feedModel.Subcomponent;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from OW2
 */
public final class ow2_1
implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Function2 c;
    public final /* synthetic */ Object d;

    public /* synthetic */ ow2_1(int n3, com.ril.ajio.services.data.fleek.explore_brands.Subcomponent subcomponent, Function2 function2) {
        this.a = 0;
        this.c = function2;
        this.d = subcomponent;
        this.b = n3;
    }

    public /* synthetic */ ow2_1(p83_0 p83_02, int n3, Function2 function2) {
        this.a = 1;
        this.d = p83_02;
        this.b = n3;
        this.c = function2;
    }

    public final Object invoke() {
        int n3 = this.a;
        switch (n3) {
            default: {
                boolean bl2;
                Function2 function2 = this.c;
                Intrinsics.checkNotNullParameter(function2, "$sendImpression");
                Object object = (p83_0)this.d;
                int n4 = this.b;
                Object object2 = (Subcomponent)CollectionsKt.N(n4, (List)object);
                if (object2 != null && !(bl2 = ((Subcomponent)object2).isGaFiredInCurrentSession())) {
                    object2 = (Subcomponent)CollectionsKt.N(n4, (List)object);
                    if (object2 != null) {
                        boolean bl3 = true;
                        ((Subcomponent)object2).setGaFiredInCurrentSession(bl3);
                    }
                    object2 = n4;
                    object = CollectionsKt.N(n4, (List)object);
                    function2.invoke(object2, object);
                }
                return Unit.a;
            }
            case 0: 
        }
        Function2 function2 = this.c;
        Intrinsics.checkNotNullParameter(function2, "$onExploreClick");
        Integer n7 = this.b;
        com.ril.ajio.services.data.fleek.explore_brands.Subcomponent subcomponent = (com.ril.ajio.services.data.fleek.explore_brands.Subcomponent)this.d;
        function2.invoke(subcomponent, n7);
        return Unit.a;
    }
}

