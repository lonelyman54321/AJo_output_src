/*
 * Decompiled with CFR 0.152.
 */
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import com.jio.retargeting.JioAdsEventService;
import com.jio.retargeting.data.CartProduct;
import com.jio.retargeting.events.PurchaseCompleteEvent;
import com.ril.ajio.services.data.Cart.CartEntry;
import com.ril.ajio.services.data.Order.CartOrder;
import com.ril.ajio.services.data.Price;
import com.ril.ajio.services.data.Product.Product;
import java.util.ArrayList;
import java.util.Currency;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from rl1
 */
public final class rl1_1
extends qg3_2
implements Function2 {
    public final /* synthetic */ CartOrder a;

    public rl1_1(CartOrder cartOrder, f80_0 f80_02) {
        this.a = cartOrder;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        CartOrder cartOrder = this.a;
        object = new rl1_1(cartOrder, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (rl1_1)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((rl1_1)object).invokeSuspend(object2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object invokeSuspend(Object object) {
        Iterator iterator;
        block7: {
            int n3;
            Object object2;
            block8: {
                iterator = this.a;
                Object object3 = j90_0.COROUTINE_SUSPENDED;
                vl2_2.b(object);
                try {
                    el1_2.a();
                    object3 = null;
                    object2 = new CartProduct[]{};
                    object = new PurchaseCompleteEvent((CartProduct[])object2);
                    object2 = ((CartOrder)((Object)iterator)).getCode();
                    ((PurchaseCompleteEvent)object).setTransactionId((String)object2);
                    object2 = "INR";
                    object2 = Currency.getInstance((String)object2);
                    ((PurchaseCompleteEvent)object).setCurrency((Currency)object2);
                    object2 = ((CartOrder)((Object)iterator)).getEntries();
                    if (object2 == null) break block7;
                    iterator = ((CartOrder)((Object)iterator)).getEntries();
                    object2 = new ArrayList(iterator);
                    iterator = ((ArrayList)object2).iterator();
                    object2 = "iterator(...)";
                    Intrinsics.checkNotNullExpressionValue(iterator, (String)object2);
                    break block8;
                }
                catch (Exception exception) {}
                Intrinsics.checkNotNullParameter(exception, "<this>");
                iterator = FirebaseCrashlytics.getInstance();
                String string2 = exception.getMessage();
                String string3 = "JioAds Exception Purchase Complete Event ";
                string2 = kp1_0.c(string3, string2);
                object3 = new Exception(string2);
                ((FirebaseCrashlytics)((Object)iterator)).recordException((Throwable)object3);
                return Unit.a;
            }
            while ((n3 = iterator.hasNext()) != 0) {
                CartProduct cartProduct;
                int n4;
                int n7;
                object2 = iterator.next();
                Product product = (object2 = (CartEntry)object2) != null ? ((CartEntry)object2).getProduct() : null;
                if (product == null) continue;
                String string4 = product.getBaseProduct();
                Object object4 = ((CartEntry)object2).getBasePrice();
                if (object4 != null && (object4 = ((Price)object4).getValue()) != null) {
                    int n8;
                    double d2 = Double.parseDouble((String)object4);
                    n7 = n8 = ok1_1.a(d2);
                } else {
                    n7 = 0;
                }
                object2 = ((CartEntry)object2).getQuantity();
                if (object2 != null) {
                    n4 = n3 = ((Integer)object2).intValue();
                } else {
                    n3 = 1;
                    n4 = 1;
                }
                object2 = product.getBrickCategory();
                object4 = "";
                Object object5 = object2 == null ? object4 : object2;
                object2 = product.getBrickSubCategory();
                Object object6 = object2 == null ? object4 : object2;
                object2 = product.getBrickName();
                Object object7 = object2 == null ? object4 : object2;
                String string5 = product.getCode();
                object4 = cartProduct;
                cartProduct = new CartProduct(string4, n7, n4, (String)object5, (String)object6, (String)object7, string5);
                ((PurchaseCompleteEvent)object).addCartProduct(cartProduct);
            }
        }
        iterator = el1_2.a;
        iterator = el1_2.f();
        ((JioAdsEventService)((Object)iterator)).trackEvent((PurchaseCompleteEvent)object);
        return Unit.a;
    }
}

