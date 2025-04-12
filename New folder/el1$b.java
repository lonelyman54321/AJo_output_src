/*
 * Decompiled with CFR 0.152.
 */
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import com.jio.retargeting.JioAdsEventService;
import com.jio.retargeting.data.CartProduct;
import com.jio.retargeting.events.AddToCartEvent;
import com.ril.ajio.services.data.Product.Product;
import java.io.Serializable;
import java.util.Currency;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

public final class el1$b
extends qg3_2
implements Function2 {
    public final /* synthetic */ yt2_2 a;
    public final /* synthetic */ Product b;

    public el1$b(yt2_2 yt2_22, Product product, f80_0 f80_02) {
        this.a = yt2_22;
        this.b = product;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        yt2_2 yt2_22 = this.a;
        Product product = this.b;
        object = new el1$b(yt2_22, product, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (el1$b)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((el1$b)object).invokeSuspend(object2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object invokeSuspend(Object object) {
        Exception exception2;
        Object object2;
        Serializable serializable;
        Object object3;
        block6: {
            int n3;
            int n4;
            Object object4;
            String string2;
            Object object5;
            Object object6;
            int n7;
            block5: {
                block4: {
                    object3 = this.a;
                    serializable = this.b;
                    object2 = j90_0.COROUTINE_SUSPENDED;
                    vl2_2.b(object);
                    try {
                        object = el1_2.a;
                        el1_2.a();
                        object = vl1_2.b((yt2_2)((Object)object3), (Product)serializable);
                        n7 = 0;
                        object6 = null;
                        object5 = new CartProduct[]{};
                        object2 = new AddToCartEvent((CartProduct)object5);
                        object5 = "INR";
                        object5 = Currency.getInstance((String)object5);
                        ((AddToCartEvent)object2).setCurrency((Currency)object5);
                        string2 = el1_2.e((yt2_2)((Object)object3), (Product)serializable);
                        object4 = ((Product)serializable).getPrice();
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
            object6 = ((Product)serializable).getQuantity();
            if (object6 != null) {
                n3 = n7 = ((Integer)object6).intValue();
            } else {
                n7 = 1;
                n3 = 1;
            }
            Object object7 = object6 = ((xs3_0)object).a;
            object7 = (String)object6;
            Object object8 = object6 = ((xs3_0)object).b;
            object8 = (String)object6;
            Object object9 = object = ((xs3_0)object).c;
            object9 = (String)object;
            String string3 = el1_2.h((yt2_2)((Object)object3), (Product)serializable);
            object4 = object5;
            object5 = new CartProduct(string2, n4, n3, (String)object7, (String)object8, (String)object9, string3);
            ((AddToCartEvent)object2).addCartProduct((CartProduct)object5);
            object = el1_2.f();
            ((JioAdsEventService)object).trackEvent((AddToCartEvent)object2);
            return Unit.a;
        }
        Intrinsics.checkNotNullParameter(exception2, "<this>");
        object3 = FirebaseCrashlytics.getInstance();
        String string4 = exception2.getMessage();
        object2 = "JioAds Exception Add To Cart Event ";
        string4 = kp1_0.c((String)object2, string4);
        serializable = new Exception(string4);
        ((FirebaseCrashlytics)object3).recordException((Throwable)serializable);
        return Unit.a;
    }
}

