/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.services.data.Price;
import com.ril.ajio.services.data.Product.Product;
import kotlin.Unit;

public final class BH3$c
implements fs0_2 {
    public final /* synthetic */ BH3 a;
    public final /* synthetic */ String b;

    public BH3$c(BH3 bH3, String string2) {
        this.a = bH3;
        this.b = string2;
    }

    public final Object emit(Object object, f80_0 object2) {
        object = (DataCallback)object;
        BH3 bH3 = this.a;
        bH3.getClass();
        Object object3 = iw_1.a;
        Object object4 = bH3.b;
        at0_1 at0_12 = null;
        object4 = object4 != null && (object4 = ((Product)object4).getPrice()) != null ? ((Price)object4).getValue() : null;
        object3.getClass();
        object3 = this.b;
        object4 = iw_1.c((String)object3, (String)object4);
        ch3_2 ch3_22 = new ch3_2(bH3, (DataCallback)object, null);
        at0_12 = new at0_1((es0_2)object4, ch3_22);
        object4 = new dh3_1((String)object3, bH3, (DataCallback)object);
        object = at0_12.collect((fs0_2)object4, (f80_0)object2);
        object2 = j90_0.COROUTINE_SUSPENDED;
        if (object != object2) {
            object = Unit.a;
        }
        if (object != object2) {
            object = Unit.a;
        }
        return object;
    }
}

