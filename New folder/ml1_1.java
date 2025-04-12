/*
 * Decompiled with CFR 0.152.
 */
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import com.jio.retargeting.JioAdsEventService;
import com.jio.retargeting.data.CartProduct;
import com.jio.retargeting.events.LocationEvent;
import com.ril.ajio.services.data.Cart.CartDeliveryAddress;
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
 * Renamed from ml1
 */
public final class ml1_1
extends qg3_2
implements Function2 {
    public final /* synthetic */ CartOrder a;

    public ml1_1(CartOrder cartOrder, f80_0 f80_02) {
        this.a = cartOrder;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        CartOrder cartOrder = this.a;
        object = new ml1_1(cartOrder, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (ml1_1)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((ml1_1)object).invokeSuspend(object2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object invokeSuspend(Object object) {
        Exception exception2;
        Object object2;
        Iterator iterator;
        block10: {
            int n3;
            Object object3;
            block9: {
                block8: {
                    iterator = this.a;
                    object2 = j90_0.COROUTINE_SUSPENDED;
                    vl2_2.b(object);
                    try {
                        el1_2.a();
                        object2 = null;
                        object3 = new CartProduct[]{};
                        object = new LocationEvent((CartProduct[])object3);
                        object3 = "INR";
                        object3 = Currency.getInstance((String)object3);
                        ((LocationEvent)object).setCurrency((Currency)object3);
                        object3 = ((CartOrder)((Object)iterator)).getDeliveryAddress();
                        if (object3 == null) break block8;
                        object3 = ((CartDeliveryAddress)object3).getPostalCode();
                        break block9;
                    }
                    catch (Exception exception2) {
                        break block10;
                    }
                }
                n3 = 0;
                object3 = null;
            }
            ((LocationEvent)object).setPincode((String)object3);
            object3 = ((CartOrder)((Object)iterator)).getEntries();
            if (object3 != null) {
                iterator = ((CartOrder)((Object)iterator)).getEntries();
                object3 = new ArrayList(iterator);
                iterator = ((ArrayList)object3).iterator();
                object3 = "iterator(...)";
                Intrinsics.checkNotNullExpressionValue(iterator, (String)object3);
                while ((n3 = iterator.hasNext()) != 0) {
                    CartProduct cartProduct;
                    int n4;
                    int n7;
                    object3 = iterator.next();
                    Product product = (object3 = (CartEntry)object3) != null ? ((CartEntry)object3).getProduct() : null;
                    if (product == null) continue;
                    String string2 = product.getBaseProduct();
                    Object object4 = ((CartEntry)object3).getBasePrice();
                    if (object4 != null && (object4 = ((Price)object4).getValue()) != null) {
                        int n8;
                        double d2 = Double.parseDouble((String)object4);
                        n7 = n8 = ok1_1.a(d2);
                    } else {
                        n7 = 0;
                    }
                    object3 = ((CartEntry)object3).getQuantity();
                    if (object3 != null) {
                        n4 = n3 = ((Integer)object3).intValue();
                    } else {
                        n3 = 1;
                        n4 = 1;
                    }
                    object3 = product.getBrickCategory();
                    object4 = "";
                    Object object5 = object3 == null ? object4 : object3;
                    object3 = product.getBrickSubCategory();
                    Object object6 = object3 == null ? object4 : object3;
                    object3 = product.getBrickName();
                    Object object7 = object3 == null ? object4 : object3;
                    String string3 = product.getCode();
                    object4 = cartProduct;
                    cartProduct = new CartProduct(string2, n7, n4, (String)object5, (String)object6, (String)object7, string3);
                    ((LocationEvent)object).addCartProduct(cartProduct);
                }
            }
            iterator = el1_2.a;
            iterator = el1_2.f();
            ((JioAdsEventService)((Object)iterator)).trackEvent((LocationEvent)object);
            return Unit.a;
        }
        Intrinsics.checkNotNullParameter(exception2, "<this>");
        iterator = FirebaseCrashlytics.getInstance();
        String string4 = exception2.getMessage();
        String string5 = "JioAds Exception Purchase Complete Location Event ";
        string4 = kp1_0.c(string5, string4);
        object2 = new Exception(string4);
        ((FirebaseCrashlytics)((Object)iterator)).recordException((Throwable)object2);
        return Unit.a;
    }
}

