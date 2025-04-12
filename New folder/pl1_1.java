/*
 * Decompiled with CFR 0.152.
 */
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import com.jio.retargeting.JioAdsEventService;
import com.jio.retargeting.data.CartProduct;
import com.jio.retargeting.events.ProductViewEvent;
import com.ril.ajio.services.data.Product.Product;
import java.util.Currency;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from pl1
 */
public final class pl1_1
extends qg3_2
implements Function2 {
    public final /* synthetic */ Product a;

    public pl1_1(Product product, f80_0 f80_02) {
        this.a = product;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        Product product = this.a;
        object = new pl1_1(product, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (pl1_1)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((pl1_1)object).invokeSuspend(object2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object invokeSuspend(Object object) {
        Exception exception2;
        Object object2;
        Object object3;
        block6: {
            int n3;
            int n4;
            Object object4;
            String string2;
            Object object5;
            int n7;
            block5: {
                block4: {
                    object3 = this.a;
                    object2 = j90_0.COROUTINE_SUSPENDED;
                    vl2_2.b(object);
                    try {
                        object = el1_2.a;
                        el1_2.a();
                        n7 = 0;
                        object2 = null;
                        object5 = new CartProduct[]{};
                        object = new ProductViewEvent((CartProduct)object5);
                        object5 = "INR";
                        object5 = Currency.getInstance((String)object5);
                        ((ProductViewEvent)object).setCurrency((Currency)object5);
                        string2 = ((Product)object3).getCode();
                        object4 = ((Product)object3).getPrice();
                        if (object4 == null || (object4 = object4.getValue()) == null) break block4;
                        double d2 = Double.parseDouble((String)object4);
                        n4 = n7 = ok1_1.a(d2);
                        break block5;
                    }
                    catch (Exception exception2) {
                        break block6;
                    }
                }
                n4 = 0;
            }
            object2 = ((Product)object3).getQuantity();
            if (object2 != null) {
                n3 = n7 = ((Integer)object2).intValue();
            } else {
                n7 = 1;
                n3 = 1;
            }
            object2 = ((Product)object3).getBrickCategory();
            object4 = "";
            Object object6 = object2 == null ? object4 : object2;
            object2 = ((Product)object3).getBrickSubCategory();
            Object object7 = object2 == null ? object4 : object2;
            object3 = ((Product)object3).getBrickName();
            Object object8 = object3 == null ? object4 : object3;
            String string3 = "";
            object4 = object5;
            object5 = new CartProduct(string2, n4, n3, (String)object6, (String)object7, (String)object8, string3);
            ((ProductViewEvent)object).addCartProduct((CartProduct)object5);
            object3 = el1_2.f();
            ((JioAdsEventService)object3).trackEvent((ProductViewEvent)object);
            return Unit.a;
        }
        Intrinsics.checkNotNullParameter(exception2, "<this>");
        object3 = FirebaseCrashlytics.getInstance();
        String string4 = exception2.getMessage();
        String string5 = "JioAds Exception Product View Event ";
        string4 = kp1_0.c(string5, string4);
        object2 = new Exception(string4);
        ((FirebaseCrashlytics)object3).recordException((Throwable)object2);
        return Unit.a;
    }
}

