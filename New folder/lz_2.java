/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.services.data.Product.RecentlyViewedProducts;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from LZ
 */
public final class lz_2
implements Function1 {
    public final /* synthetic */ oz_2 a;

    public /* synthetic */ lz_2(oz_2 oz_22) {
        this.a = oz_22;
    }

    public final Object invoke(Object object) {
        RecentlyViewedProducts recentlyViewedProducts;
        object = (DataCallback)object;
        oz_2 oz_22 = this.a;
        Intrinsics.checkNotNullParameter(oz_22, "this$0");
        oz_22.f = recentlyViewedProducts = (RecentlyViewedProducts)((DataCallback)object).getData();
        oz_22.d.k(object);
        return Unit.a;
    }
}

