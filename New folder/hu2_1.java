/*
 * Decompiled with CFR 0.152.
 */
import androidx.lifecycle.LiveData;
import com.ril.ajio.data.repo.ApiErrorRepo;
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.services.query.ProductListQuery;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Hu2
 */
public final class hu2_1
implements Function1 {
    public final /* synthetic */ Boolean a;
    public final /* synthetic */ bv2_0 b;
    public final /* synthetic */ ProductListQuery c;

    public /* synthetic */ hu2_1(bv2_0 bv2_02, ProductListQuery productListQuery, Boolean bl2) {
        this.a = bl2;
        this.b = bv2_02;
        this.c = productListQuery;
    }

    public final Object invoke(Object object) {
        Object object2 = object;
        object2 = (Throwable)object;
        Object object3 = this.b;
        Intrinsics.checkNotNullParameter(object3, "this$0");
        ProductListQuery productListQuery = this.c;
        Intrinsics.checkNotNullParameter(productListQuery, "$productListQuery");
        object = Boolean.FALSE;
        Object object4 = this.a;
        boolean bl2 = Intrinsics.areEqual(object4, object);
        if (bl2) {
            object = ((bv2_0)object3).f;
            object3 = ApiErrorRepo.INSTANCE;
            Intrinsics.checkNotNull(object2);
            int n3 = 24;
            object4 = "PLPCategoryProducts";
            boolean bl3 = true;
            object3 = ApiErrorRepo.handleApiException$default((ApiErrorRepo)object3, (Throwable)object2, (String)object4, bl3, null, null, n3, null);
            object2 = productListQuery.getWidgetRecord();
            if (object2 != null) {
                object2 = productListQuery.getWidgetRecord().getAdapterPositionOfWidget();
                ((DataCallback)object3).setExtraErrorData(object2);
            }
            ((LiveData)object).k(object3);
        } else {
            object = ((bv2_0)object3).g;
            object3 = ApiErrorRepo.INSTANCE;
            Intrinsics.checkNotNull(object2);
            int n4 = 24;
            object4 = "PLPCategoryProducts";
            boolean bl4 = true;
            object3 = ApiErrorRepo.handleApiException$default((ApiErrorRepo)object3, (Throwable)object2, (String)object4, bl4, null, null, n4, null);
            object2 = productListQuery.getWidgetRecord();
            if (object2 != null) {
                object2 = productListQuery.getWidgetRecord().getAdapterPositionOfWidget();
                ((DataCallback)object3).setExtraErrorData(object2);
            }
            ((LiveData)object).k(object3);
        }
        return Unit.a;
    }
}

