/*
 * Decompiled with CFR 0.152.
 */
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import com.jio.retargeting.JioAdsEventService;
import com.jio.retargeting.data.CartProduct;
import com.jio.retargeting.events.ProductListViewEvent;
import com.ril.ajio.services.data.Price;
import com.ril.ajio.services.data.Product.Product;
import java.util.ArrayList;
import java.util.Currency;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from ql1
 */
public final class ql1_1
extends qg3_2
implements Function2 {
    public final /* synthetic */ String a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ List d;

    public ql1_1(String string2, String string3, String string4, List list, f80_0 f80_02) {
        this.a = string2;
        this.b = string3;
        this.c = string4;
        this.d = list;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        String string2 = this.c;
        List list = this.d;
        String string3 = this.a;
        String string4 = this.b;
        object = new ql1_1(string3, string4, string2, list, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (ql1_1)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((ql1_1)object).invokeSuspend(object2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object invokeSuspend(Object object) {
        Exception exception2;
        Object object2;
        block10: {
            block9: {
                Object object3;
                Object object4;
                int n3;
                Object object5;
                Object object6;
                object2 = j90_0.COROUTINE_SUSPENDED;
                vl2_2.b(object);
                try {
                    el1_2.a();
                    object2 = null;
                    object6 = new CartProduct[]{};
                    object = new ProductListViewEvent((CartProduct[])object6);
                    object6 = "INR";
                    object6 = Currency.getInstance((String)object6);
                    ((ProductListViewEvent)object).setCurrency((Currency)object6);
                    object6 = this.a;
                    ((ProductListViewEvent)object).setStartTime((String)object6);
                    object6 = this.b;
                    ((ProductListViewEvent)object).setEndTime((String)object6);
                    object6 = this.c;
                    ((ProductListViewEvent)object).setListName((String)object6);
                    object6 = this.d;
                    if (object6 == null) break block9;
                    object6 = (Iterable)object6;
                    object5 = new ArrayList();
                    object6 = object6.iterator();
                    while ((n3 = object6.hasNext()) != 0) {
                        object3 = object4 = object6.next();
                        object3 = (Product)object4;
                        if ((object3 = ((Product)object3).getAdsData()) != null) continue;
                        ((ArrayList)object5).add(object4);
                    }
                }
                catch (Exception exception2) {
                    break block10;
                }
                int n4 = 10;
                object6 = CollectionsKt.f0(object5, n4);
                if (object6 != null) {
                    boolean bl2;
                    object6 = (Iterable)object6;
                    object6 = object6.iterator();
                    while (bl2 = object6.hasNext()) {
                        CartProduct cartProduct;
                        int n7;
                        int n8;
                        object5 = object6.next();
                        object5 = (Product)object5;
                        object4 = el1_2.a;
                        object4 = yt2_2.PLP;
                        object3 = el1_2.e(object4, object5);
                        object4 = ((Product)object5).getPrice();
                        if (object4 != null && (object4 = ((Price)object4).getValue()) != null) {
                            double d2 = Double.parseDouble((String)object4);
                            n8 = n3 = ok1_1.a(d2);
                        } else {
                            n8 = 0;
                        }
                        object4 = ((Product)object5).getQuantity();
                        if (object4 != null) {
                            n7 = n3 = ((Integer)object4).intValue();
                        } else {
                            n3 = 1;
                            n7 = 1;
                        }
                        object4 = ((Product)object5).getSegmentNameText();
                        Object object7 = "";
                        Object object8 = object4 == null ? object7 : object4;
                        object4 = ((Product)object5).getVerticalNameText();
                        Object object9 = object4 == null ? object7 : object4;
                        object4 = ((Product)object5).getBrickNameText();
                        Object object10 = object4 == null ? object7 : object4;
                        object5 = ((Product)object5).getCode();
                        object4 = cartProduct;
                        object7 = object8;
                        object8 = object9;
                        object9 = object10;
                        object10 = object5;
                        cartProduct = new CartProduct((String)object3, n8, n7, (String)object7, (String)object8, (String)object9, (String)object5);
                        ((ProductListViewEvent)object).addCartProduct(cartProduct);
                    }
                }
            }
            object2 = el1_2.a;
            object2 = el1_2.f();
            ((JioAdsEventService)object2).trackEvent((ProductListViewEvent)object);
            return Unit.a;
        }
        Intrinsics.checkNotNullParameter(exception2, "<this>");
        object2 = FirebaseCrashlytics.getInstance();
        String string2 = exception2.getMessage();
        String string3 = "JioAds Exception Product View Event ";
        string2 = kp1_0.c(string3, string2);
        Exception exception3 = new Exception(string2);
        ((FirebaseCrashlytics)object2).recordException(exception3);
        return Unit.a;
    }
}

