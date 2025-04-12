/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.services.data.fleek.explore_brands.BrandItemData;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from bd
 */
public final class bd_1
implements Function0 {
    public final /* synthetic */ Function1 a;
    public final /* synthetic */ BrandItemData b;

    public /* synthetic */ bd_1(xd_1 xd_12, BrandItemData brandItemData) {
        this.a = xd_12;
        this.b = brandItemData;
    }

    public final Object invoke() {
        Function1 function1 = this.a;
        Intrinsics.checkNotNullParameter(function1, "$onItemClick");
        BrandItemData brandItemData = this.b;
        Intrinsics.checkNotNullParameter(brandItemData, "$brandsData");
        function1.invoke(brandItemData);
        return Unit.a;
    }
}

