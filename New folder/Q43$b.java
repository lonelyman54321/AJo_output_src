/*
 * Decompiled with CFR 0.152.
 */
import androidx.lifecycle.LiveData;
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.services.data.Product.SimilarProducts;
import com.ril.ajio.services.data.Product.WidgetRecord;
import kotlin.Unit;

public final class Q43$b
implements fs0_2 {
    public final /* synthetic */ WidgetRecord a;
    public final /* synthetic */ r43_0 b;
    public final /* synthetic */ zr1_1 c;

    public Q43$b(WidgetRecord widgetRecord, r43_0 r43_02, zr1_1 zr1_12) {
        this.a = widgetRecord;
        this.b = r43_02;
        this.c = zr1_12;
    }

    public final Object emit(Object object, f80_0 object2) {
        object = (DataCallback)object;
        object2 = this.a;
        if (object2 != null) {
            object2 = ((WidgetRecord)object2).getAdapterPositionOfWidget();
            ((DataCallback)object).setExtraErrorData(object2);
        }
        object2 = this.b.c;
        ((LiveData)object2).k(object);
        object = (SimilarProducts)((DataCallback)object).getData();
        object = this.c;
        if (object != null) {
            object2 = Boolean.FALSE;
            ((LiveData)object).i(object2);
        }
        return Unit.a;
    }
}

