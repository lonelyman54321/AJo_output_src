/*
 * Decompiled with CFR 0.152.
 */
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import com.jio.retargeting.JioAdsEventService;
import com.jio.retargeting.data.CartProduct;
import com.jio.retargeting.events.AddToCartEvent;
import com.ril.ajio.services.data.Product.Product;
import java.util.Currency;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from fl1
 */
public final class fl1_2
extends qg3_2
implements Function2 {
    public final /* synthetic */ Product a;
    public final /* synthetic */ int b;

    public fl1_2(Product product, int n3, f80_0 f80_02) {
        this.a = product;
        this.b = n3;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        Product product = this.a;
        int n3 = this.b;
        object = new fl1_2(product, n3, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (fl1_2)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((fl1_2)object).invokeSuspend(object2);
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
        block4: {
            int n3;
            Object object4;
            String string2;
            Object object5;
            block3: {
                block2: {
                    object3 = this.a;
                    object2 = j90_0.COROUTINE_SUSPENDED;
                    vl2_2.b(object);
                    try {
                        object = el1_2.a;
                        el1_2.a();
                        int n4 = 0;
                        object2 = null;
                        object5 = new CartProduct[]{};
                        object = new AddToCartEvent((CartProduct)object5);
                        object5 = "INR";
                        object5 = Currency.getInstance((String)object5);
                        ((AddToCartEvent)object).setCurrency((Currency)object5);
                        string2 = ((Product)object3).getBaseProduct();
                        object4 = ((Product)object3).getPrice();
                        if (object4 == null || (object4 = object4.getValue()) == null) break block2;
                        double d2 = Double.parseDouble((String)object4);
                        n3 = n4 = ok1_1.a(d2);
                        break block3;
                    }
                    catch (Exception exception2) {
                        break block4;
                    }
                }
                n3 = 0;
            }
            int n7 = this.b;
            object2 = ((Product)object3).getBrickCategory();
            object4 = "";
            Object object6 = object2 == null ? object4 : object2;
            object2 = ((Product)object3).getBrickSubCategory();
            Object object7 = object2 == null ? object4 : object2;
            object2 = ((Product)object3).getBrickName();
            Object object8 = object2 == null ? object4 : object2;
            String string3 = ((Product)object3).getCode();
            object4 = object5;
            object5 = new CartProduct(string2, n3, n7, (String)object6, (String)object7, (String)object8, string3);
            ((AddToCartEvent)object).addCartProduct((CartProduct)object5);
            object3 = el1_2.f();
            ((JioAdsEventService)object3).trackEvent((AddToCartEvent)object);
            return Unit.a;
        }
        Intrinsics.checkNotNullParameter(exception2, "<this>");
        object3 = FirebaseCrashlytics.getInstance();
        String string4 = exception2.getMessage();
        String string5 = "JioAds Exception Add To Cart Event ";
        string4 = kp1_0.c(string5, string4);
        object2 = new Exception(string4);
        ((FirebaseCrashlytics)object3).recordException((Throwable)object2);
        return Unit.a;
    }
}

