/*
 * Decompiled with CFR 0.152.
 */
import androidx.lifecycle.LiveData;
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.services.data.Product.QuickViewProduct;
import kotlin.Unit;

public final class OX1$c
implements fs0_2 {
    public final /* synthetic */ wx1_1 a;

    public OX1$c(wx1_1 wx1_12) {
        this.a = wx1_12;
    }

    public final Object emit(Object object, f80_0 object2) {
        object = (QuickViewProduct)object;
        object2 = this.a.z0;
        object = DataCallback.Companion.onSuccess(object);
        ((LiveData)object2).k(object);
        return Unit.a;
    }
}

