/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.services.data.Cart.CartAssuredGiftModel;
import kotlin.Unit;

public final class BX1$b
implements fs0_2 {
    public final /* synthetic */ wx1_1 a;

    public BX1$b(wx1_1 wx1_12) {
        this.a = wx1_12;
    }

    public final Object emit(Object object, f80_0 object2) {
        object2 = (object = (DataCallback)object) != null ? (CartAssuredGiftModel)((DataCallback)object).getData() : null;
        wx1_1 wx1_12 = this.a;
        wx1_12.m1 = object2;
        wx1_12.F0.k(object);
        return Unit.a;
    }
}

