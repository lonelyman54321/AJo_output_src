/*
 * Decompiled with CFR 0.152.
 */
import androidx.lifecycle.LiveData;
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.data.repo.DataCallback$Companion;
import com.ril.ajio.services.data.Product.QuickViewProduct;
import kotlin.Unit;

public final class OX1$b
extends qg3_2
implements gx0_2 {
    public /* synthetic */ Throwable a;
    public final /* synthetic */ wx1_1 b;
    public final /* synthetic */ QuickViewProduct c;

    public OX1$b(wx1_1 wx1_12, QuickViewProduct quickViewProduct, f80_0 f80_02) {
        this.b = wx1_12;
        this.c = quickViewProduct;
        super(3, f80_02);
    }

    public final Object invoke(Object object, Object object2, Object object3) {
        object = (fs0_2)object;
        object2 = (Throwable)object2;
        object3 = (f80_0)object3;
        wx1_1 wx1_12 = this.b;
        QuickViewProduct quickViewProduct = this.c;
        object = new OX1$b(wx1_12, quickViewProduct, (f80_0)object3);
        ((OX1$b)object).a = object2;
        object2 = Unit.a;
        return ((OX1$b)object).invokeSuspend(object2);
    }

    public final Object invokeSuspend(Object object) {
        Object object2 = j90_0.COROUTINE_SUSPENDED;
        vl2_2.b(object);
        object = this.a;
        yn3_0.a.e((Throwable)object);
        object = this.b.z0;
        object2 = DataCallback.Companion;
        QuickViewProduct quickViewProduct = this.c;
        object2 = ((DataCallback$Companion)object2).onSuccess(quickViewProduct);
        ((LiveData)object).k(object2);
        return Unit.a;
    }
}

