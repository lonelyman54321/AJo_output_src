/*
 * Decompiled with CFR 0.152.
 */
import androidx.lifecycle.LiveData;
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.services.data.Product.ProductsList;
import com.ril.ajio.services.query.ProductListQuery;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Fu2
 */
public final class fu2_0
implements Function1 {
    public final /* synthetic */ ProductListQuery a;
    public final /* synthetic */ Boolean b;
    public final /* synthetic */ bv2_0 c;

    public /* synthetic */ fu2_0(bv2_0 bv2_02, ProductListQuery productListQuery, Boolean bl2) {
        this.a = productListQuery;
        this.b = bl2;
        this.c = bv2_02;
    }

    public final Object invoke(Object object) {
        boolean bl2;
        object = (DataCallback)object;
        Object object2 = this.a;
        Intrinsics.checkNotNullParameter(object2, "$productListQuery");
        bv2_0 bv2_02 = this.c;
        Intrinsics.checkNotNullParameter(bv2_02, "this$0");
        Object object3 = ((ProductListQuery)object2).getWidgetRecord();
        if (object3 != null) {
            object3 = ((ProductListQuery)object2).getWidgetRecord().getAdapterPositionOfWidget();
            ((DataCallback)object).setExtraErrorData(object3);
        }
        if (bl2 = Intrinsics.areEqual(object2 = this.b, object3 = Boolean.FALSE)) {
            object3 = bv2_02.f;
            ((LiveData)object3).k(object);
        } else {
            object3 = bv2_02.g;
            ((LiveData)object3).k(object);
        }
        object3 = (ProductsList)((DataCallback)object).getData();
        object2 = null;
        if (object3 != null) {
            object3 = ((ProductsList)object3).getUserGroup();
        } else {
            bl2 = false;
            object3 = null;
        }
        bv2_02.I0 = object3;
        object = (ProductsList)((DataCallback)object).getData();
        if (object != null) {
            object2 = ((ProductsList)object).getProductListsOffset();
        }
        ke0_0.a = object2;
        return Unit.a;
    }
}

