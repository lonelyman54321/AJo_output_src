/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.services.data.Product.ProductsList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from oV2
 */
public final class ov2_2
implements Function0 {
    public final /* synthetic */ ProductsList a;
    public final /* synthetic */ vv2_2 b;

    public /* synthetic */ ov2_2(ProductsList productsList, vv2_2 vv2_22) {
        this.a = productsList;
        this.b = vv2_22;
    }

    public final Object invoke() {
        String string2;
        vv2_2 vv2_22 = this.b;
        Intrinsics.checkNotNullParameter(vv2_22, "this$0");
        Object object = this.a;
        if (object != null && (string2 = ((ProductsList)object).getStoreRedirectUri()) != null) {
            object = ((ProductsList)object).getStoreInfo();
            vv2_22.ab(string2, (String)object);
        }
        return Unit.a;
    }
}

