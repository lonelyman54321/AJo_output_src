/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Handler
 *  android.os.Looper
 */
import android.os.Handler;
import android.os.Looper;
import com.affise.attribution.events.OnSendFailedCallback;
import com.affise.attribution.events.OnSendSuccessCallback;
import com.affise.attribution.events.parameters.PredefinedCustom;
import com.affise.attribution.events.parameters.PredefinedFloat;
import com.affise.attribution.events.parameters.PredefinedLong;
import com.affise.attribution.events.parameters.PredefinedString;
import com.affise.attribution.events.predefined.OrderCancelEvent;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import com.ril.ajio.services.data.Cart.CartAppliedVoucher;
import com.ril.ajio.services.data.Cart.CartEntry;
import com.ril.ajio.services.data.Order.CartOrder;
import com.ril.ajio.services.data.Product.Product;
import com.ril.ajio.services.data.user.AffiliateData;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;

public final class p5$a
extends qg3_2
implements Function2 {
    public final /* synthetic */ CartEntry a;
    public final /* synthetic */ CartOrder b;
    public final /* synthetic */ int c;
    public final /* synthetic */ AffiliateData d;
    public final /* synthetic */ Ref$ObjectRef e;

    public p5$a(CartEntry cartEntry, CartOrder cartOrder, int n3, AffiliateData affiliateData, Ref$ObjectRef ref$ObjectRef, f80_0 f80_02) {
        this.a = cartEntry;
        this.b = cartOrder;
        this.c = n3;
        this.d = affiliateData;
        this.e = ref$ObjectRef;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        AffiliateData affiliateData = this.d;
        Ref$ObjectRef ref$ObjectRef = this.e;
        CartEntry cartEntry = this.a;
        CartOrder cartOrder = this.b;
        int n3 = this.c;
        object = new p5$a(cartEntry, cartOrder, n3, affiliateData, ref$ObjectRef, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (p5$a)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((p5$a)object).invokeSuspend(object2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object invokeSuspend(Object object) {
        Object object2;
        Exception exception2;
        Object object3;
        Object object4;
        block34: {
            int n3;
            OrderCancelEvent orderCancelEvent;
            block28: {
                Object object5;
                Object object6;
                Object object7;
                block30: {
                    block29: {
                        block31: {
                            block33: {
                                block32: {
                                    double d2;
                                    int n4 = this.c;
                                    object4 = j90_0.COROUTINE_SUSPENDED;
                                    vl2_2.b(object);
                                    try {
                                        object = p5_0.a;
                                        p5_0.a((p5_0)object);
                                        object4 = this.a;
                                        if (object4 == null) return Unit.a;
                                        object3 = ((CartEntry)object4).getProduct();
                                        object7 = null;
                                        long l2 = 0L;
                                        d2 = 0.0;
                                        int n7 = 3;
                                        object6 = orderCancelEvent;
                                        orderCancelEvent = new OrderCancelEvent(null, l2, n7, null);
                                        object6 = PredefinedString.ORDER_ID;
                                        object7 = this.b;
                                        if (object7 == null || (object5 = ((CartOrder)object7).getCode()) == null) {
                                            object5 = "default_order_id";
                                        }
                                        orderCancelEvent.addPredefinedParameter((PredefinedString)object6, (String)object5);
                                        object6 = PredefinedLong.QUANTITY;
                                        l2 = n4;
                                        orderCancelEvent.addPredefinedParameter((PredefinedLong)object6, l2);
                                        d2 = p5_0.b((p5_0)object, (CartEntry)object4);
                                    }
                                    catch (Exception exception2) {}
                                    double d5 = (double)n4 * d2;
                                    object2 = PredefinedFloat.PRICE;
                                    float f5 = (float)d2;
                                    orderCancelEvent.addPredefinedParameter((PredefinedFloat)object2, f5);
                                    object2 = PredefinedFloat.REVENUE;
                                    f5 = (float)d5;
                                    orderCancelEvent.addPredefinedParameter((PredefinedFloat)object2, f5);
                                    object2 = this.e;
                                    if (object3 == null) break block28;
                                    object6 = this.d;
                                    object5 = PredefinedString.CONTENT_ID;
                                    String string2 = ((Product)object3).getCode();
                                    if (string2 == null) {
                                        string2 = "default_content_id";
                                    }
                                    orderCancelEvent.addPredefinedParameter((PredefinedString)object5, string2);
                                    object5 = PredefinedString.CHANNEL_TYPE;
                                    string2 = "Android";
                                    orderCancelEvent.addPredefinedParameter((PredefinedString)object5, string2);
                                    object5 = PredefinedString.CATALOGUE_ID;
                                    string2 = ((Product)object3).getCatalogName();
                                    if (string2 == null && (string2 = ((Product)object3).getCatalog()) == null) {
                                        string2 = "default_catalogue_id";
                                    }
                                    orderCancelEvent.addPredefinedParameter((PredefinedString)object5, string2);
                                    object5 = PredefinedString.SEGMENT;
                                    string2 = ((Product)object3).getSegmentName();
                                    if (string2 == null) {
                                        string2 = "default_segment";
                                    }
                                    orderCancelEvent.addPredefinedParameter((PredefinedString)object5, string2);
                                    object5 = PredefinedString.VERTICAL;
                                    string2 = ((Product)object3).getVerticalName();
                                    if (string2 == null) {
                                        string2 = "default_vertical";
                                    }
                                    orderCancelEvent.addPredefinedParameter((PredefinedString)object5, string2);
                                    object5 = PredefinedString.BRICK;
                                    string2 = ((Product)object3).getBrickName();
                                    if (string2 == null) {
                                        string2 = "default_brick";
                                    }
                                    orderCancelEvent.addPredefinedParameter((PredefinedString)object5, string2);
                                    n3 = p5_0.c((p5_0)object, (CartEntry)object4);
                                    if (n3 == 0) break block31;
                                    object = PredefinedString.VOUCHER_CODE;
                                    if (object7 == null || (object4 = ((CartOrder)object7).getAppliedVouchers()) == null) break block32;
                                    object4 = CollectionsKt.firstOrNull((List)object4);
                                    if ((object4 = (CartAppliedVoucher)object4) != null && (object4 = ((CartAppliedVoucher)object4).getVoucherCode()) != null) break block33;
                                }
                                object4 = "default_voucher_code";
                            }
                            orderCancelEvent.addPredefinedParameter((PredefinedString)object, (String)object4);
                        }
                        object = PredefinedString.CUSTOMER_TYPE;
                        object4 = p5_0.c;
                        if ((object4 = ((jo_2)object4).f()) == null) {
                            object4 = "New";
                        }
                        orderCancelEvent.addPredefinedParameter((PredefinedString)object, (String)object4);
                        object = PredefinedString.BRAND;
                        object4 = ((Product)object3).getBrandName();
                        if (object4 == null) {
                            object4 = "default_brand";
                        }
                        orderCancelEvent.addPredefinedParameter((PredefinedString)object, (String)object4);
                        object = PredefinedString.UTM_SOURCE;
                        if (object6 == null || (object4 = ((AffiliateData)object6).getUtmSource()) == null) {
                            object4 = "default_utm_source";
                        }
                        orderCancelEvent.addPredefinedParameter((PredefinedString)object, (String)object4);
                        object = PredefinedString.UTM_CAMPAIGN;
                        if (object6 == null || (object4 = ((AffiliateData)object6).getUtmCampaign()) == null) {
                            object4 = "default_utm_campaign";
                        }
                        orderCancelEvent.addPredefinedParameter((PredefinedString)object, (String)object4);
                        object = PredefinedString.UTM_MEDIUM;
                        if (object6 == null || (object4 = ((AffiliateData)object6).getUtmMedium()) == null) {
                            object4 = "default_utm_medium";
                        }
                        orderCancelEvent.addPredefinedParameter((PredefinedString)object, (String)object4);
                        object = PredefinedString.STATUS;
                        object4 = "3";
                        orderCancelEvent.addPredefinedParameter((PredefinedString)object, (String)object4);
                        if (object7 == null) break block29;
                        object = ((CartOrder)object7).getOriginalOrderId();
                        break block30;
                        break block34;
                    }
                    n3 = 0;
                    object = null;
                }
                ((Ref$ObjectRef)object2).element = object;
                object4 = "";
                if (object == null || (n3 = object.length()) == 0) {
                    if (object7 == null || (object = ((CartOrder)object7).getCode()) == null) {
                        object = object4;
                    }
                    ((Ref$ObjectRef)object2).element = object;
                }
                object = orderCancelEvent.customPredefined();
                object7 = ((Ref$ObjectRef)object2).element;
                if ((object7 = (String)object7) == null) {
                    object7 = object4;
                }
                if ((object5 = ((Product)object3).getCode()) != null) {
                    object4 = object5;
                }
                object = ((PredefinedCustom)object).conversionId((String)object7, (String)object4);
                object4 = PredefinedString.RECEIPT_ID;
                orderCancelEvent.addPredefinedParameter((PredefinedString)object4, (String)object);
                object = PredefinedString.CLICK_ID;
                if (object6 == null || (object4 = ((AffiliateData)object6).getClickId()) == null) {
                    object4 = "default_click_id";
                }
                orderCancelEvent.addPredefinedParameter((PredefinedString)object, (String)object4);
                object = PredefinedString.PID;
                if (object6 == null || (object4 = ((AffiliateData)object6).getAffiliateId()) == null) {
                    object4 = "default_pid";
                }
                orderCancelEvent.addPredefinedParameter((PredefinedString)object, (String)object4);
            }
            object = new p5$a$a(orderCancelEvent, (Ref$ObjectRef)object2, (Product)object3);
            object4 = new p5$a$b(orderCancelEvent, (Ref$ObjectRef)object2, (Product)object3);
            orderCancelEvent.sendNow((OnSendSuccessCallback)object, (OnSendFailedCallback)object4);
            object = h40_0.a;
            n3 = h40_0.M0();
            if (n3 == 0) return Unit.a;
            object4 = Looper.getMainLooper();
            object = new Handler((Looper)object4);
            object4 = new o5(orderCancelEvent, (Ref$ObjectRef)object2, (Product)object3);
            long l3 = 2000L;
            object.postDelayed((Runnable)object4, l3);
            return Unit.a;
        }
        Intrinsics.checkNotNullParameter(exception2, "<this>");
        object2 = FirebaseCrashlytics.getInstance();
        String string3 = exception2.getMessage();
        object3 = "Affise Exception Order Cancel Event ";
        string3 = kp1_0.c((String)object3, string3);
        object4 = new Exception(string3);
        ((FirebaseCrashlytics)object2).recordException((Throwable)object4);
        return Unit.a;
    }
}

