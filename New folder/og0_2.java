/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.services.data.fleek.explore_brands.ResourceOwner;
import com.ril.ajio.services.data.fleek.explore_brands.Subcomponent;
import kotlin.jvm.functions.Function0;

/*
 * Renamed from oG0
 */
public final class og0_2
implements Function0 {
    public final /* synthetic */ Subcomponent a;

    public /* synthetic */ og0_2(Subcomponent subcomponent) {
        this.a = subcomponent;
    }

    public final Object invoke() {
        Object object = this.a;
        if (object == null || (object = ((Subcomponent)object).getResourceOwner()) == null || (object = ((ResourceOwner)object).getPageHeader()) == null) {
            object = "";
        }
        return object;
    }
}

