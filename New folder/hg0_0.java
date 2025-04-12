/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.services.data.fleek.explore_brands.Resource;
import com.ril.ajio.services.data.fleek.explore_brands.ResourceOwner;
import com.ril.ajio.services.data.fleek.explore_brands.Subcomponent;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from HG0
 */
public final class hg0_0
implements Function0 {
    public final /* synthetic */ gx0_2 a;
    public final /* synthetic */ Resource b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Subcomponent d;

    public /* synthetic */ hg0_0(gx0_2 gx0_22, Resource resource, int n3, Subcomponent subcomponent) {
        this.a = gx0_22;
        this.b = resource;
        this.c = n3;
        this.d = subcomponent;
    }

    public final Object invoke() {
        gx0_2 gx0_22 = this.a;
        Intrinsics.checkNotNullParameter(gx0_22, "$onProductClick");
        int n3 = this.c;
        Integer n4 = n3;
        Object object = this.d.getResourceOwner();
        object = object != null ? ((ResourceOwner)object).getName() : null;
        Resource resource = this.b;
        gx0_22.invoke(resource, n4, object);
        return Unit.a;
    }
}

