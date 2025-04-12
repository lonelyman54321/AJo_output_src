/*
 * Decompiled with CFR 0.152.
 */
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import com.jio.retargeting.JioAdsEventService;
import com.jio.retargeting.data.CartProduct;
import com.jio.retargeting.events.ProductSearchViewEvent;
import com.ril.ajio.services.data.Price;
import com.ril.ajio.services.data.Product.Product;
import java.util.Currency;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from ol1
 */
public final class ol1_2
extends qg3_2
implements Function2 {
    public final /* synthetic */ String a;
    public final /* synthetic */ List b;

    public ol1_2(String string2, List list, f80_0 f80_02) {
        this.a = string2;
        this.b = list;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        String string2 = this.a;
        List list = this.b;
        object = new ol1_2(string2, list, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (ol1_2)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((ol1_2)object).invokeSuspend(object2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object invokeSuspend(Object object) {
        Object object2;
        Object object3;
        block8: {
            object3 = j90_0.COROUTINE_SUSPENDED;
            vl2_2.b(object);
            try {
                el1_2.a();
                object3 = null;
                object2 = new CartProduct[]{};
                object = new ProductSearchViewEvent((CartProduct[])object2);
                object2 = this.a;
                ((ProductSearchViewEvent)object).setSearchString((String)object2);
                object2 = "INR";
                object2 = Currency.getInstance((String)object2);
                ((ProductSearchViewEvent)object).setCurrency((Currency)object2);
                object2 = this.b;
                object2 = (Iterable)object2;
                object2 = object2.iterator();
                break block8;
            }
            catch (Exception exception) {}
            Intrinsics.checkNotNullParameter(exception, "<this>");
            object3 = FirebaseCrashlytics.getInstance();
            String string2 = exception.getMessage();
            String string3 = "JioAds Exception Product Search View Event ";
            string2 = kp1_0.c(string3, string2);
            Exception exception = new Exception(string2);
            ((FirebaseCrashlytics)object3).recordException(exception);
            return Unit.a;
        }
        while (true) {
            CartProduct cartProduct;
            int n3;
            int n4;
            int n7;
            boolean bl2;
            if (!(bl2 = object2.hasNext())) {
                object3 = el1_2.a;
                object3 = el1_2.f();
                ((JioAdsEventService)object3).trackEvent((ProductSearchViewEvent)object);
                return Unit.a;
            }
            Object object4 = object2.next();
            object4 = (Product)object4;
            Object object5 = el1_2.a;
            object5 = yt2_2.PLP;
            String string4 = el1_2.e((yt2_2)((Object)object5), object4);
            object5 = ((Product)object4).getPrice();
            if (object5 != null && (object5 = ((Price)object5).getValue()) != null) {
                double d2 = Double.parseDouble((String)object5);
                n4 = n7 = ok1_1.a(d2);
            } else {
                n4 = 0;
            }
            object5 = ((Product)object4).getQuantity();
            if (object5 != null) {
                n3 = n7 = ((Integer)object5).intValue();
            } else {
                n7 = 1;
                n3 = 1;
            }
            object5 = ((Product)object4).getSegmentNameText();
            Object object6 = "";
            Object object7 = object5 == null ? object6 : object5;
            object5 = ((Product)object4).getVerticalNameText();
            Object object8 = object5 == null ? object6 : object5;
            object5 = ((Product)object4).getBrickNameText();
            Object object9 = object5 == null ? object6 : object5;
            object4 = ((Product)object4).getCode();
            object5 = cartProduct;
            object6 = object7;
            object7 = object8;
            object8 = object9;
            object9 = object4;
            cartProduct = new CartProduct(string4, n4, n3, (String)object6, (String)object7, (String)object8, (String)object4);
            ((ProductSearchViewEvent)object).addCartProduct(cartProduct);
        }
    }
}

