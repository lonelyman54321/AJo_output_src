/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.Intent
 *  android.os.Handler
 *  android.os.Looper
 *  android.view.View
 */
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.google.android.material.snackbar.Snackbar;
import com.google.gson.Gson;
import com.ril.ajio.R$string;
import com.ril.ajio.analytics.events.NewEEcommerceEventsRevamp;
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.data.repo.HomeRepo;
import com.ril.ajio.payment.ConfirmOrder;
import com.ril.ajio.payment.activity.OrderConfirmationActivity;
import com.ril.ajio.payment.fragment.CheckoutFragment;
import com.ril.ajio.pdprefresh.fragments.NewProductDetailsFragment;
import com.ril.ajio.services.data.Cart.CartDeliveryAddress;
import com.ril.ajio.services.data.Home.BottomNavigationData;
import com.ril.ajio.services.data.Order.CartOrder;
import com.ril.ajio.services.data.Order.EarnPoint;
import com.ril.ajio.services.data.Payment.PaymentInstrumentType;
import com.ril.ajio.services.data.Payment.PaymentInstruments;
import com.ril.ajio.services.data.Payment.PriceSplitUp;
import com.ril.ajio.services.data.Payment.PriceValidation;
import com.ril.ajio.services.data.Product.PriceRevealMetaInfo;
import com.ril.ajio.services.data.Product.SimilarProducts;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.b;

/*
 * Renamed from GT
 */
public final class gt_0
implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ gt_0(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final Object invoke(Object object) {
        int n3 = 0;
        Object object2 = null;
        int n4 = 0;
        Object object3 = null;
        Object object4 = "this$0";
        int n7 = 1;
        Object[] objectArray = this.b;
        int n8 = this.a;
        switch (n8) {
            default: {
                object = (DataCallback)object;
                objectArray = (NewProductDetailsFragment)objectArray;
                Intrinsics.checkNotNullParameter(objectArray, (String)object4);
                Intrinsics.checkNotNullParameter(object, "similarProductsDataCallback");
                object2 = cp_1.Companion;
                n3 = nn_2.b((cp$a)object2, (DataCallback)object);
                if (n3 != 0) {
                    n3 = ((DataCallback)object).getStatus();
                    if (n3 == 0) {
                        object = ((DataCallback)object).getData();
                        Intrinsics.checkNotNull(object);
                        object = (SimilarProducts)object;
                        object2 = tr2_2.a;
                        n3 = (int)(tr2_2.u(objectArray.f1) ? 1 : 0);
                        if (n3 != 0 && (object2 = ((SimilarProducts)object).getPriceRevealMetaInfo()) != null && (object3 = ((PriceRevealMetaInfo)object2).getSaleStartTime()) != null && (object3 = ((PriceRevealMetaInfo)object2).getSaleEndTime()) != null) {
                            object3 = ((PriceRevealMetaInfo)object2).getSaleStartTime();
                            object2 = ((PriceRevealMetaInfo)object2).getSaleEndTime();
                            tr2_2.B((Long)object3, (Long)object2);
                        }
                        object = (ArrayList)((SimilarProducts)object).getSimilarProducts();
                        objectArray.Rb((ArrayList)object);
                    } else {
                        int n10 = ((DataCallback)object).getStatus();
                        if (n10 == n7) {
                            objectArray.Rb(null);
                        }
                    }
                }
                return Unit.a;
            }
            case 1: {
                objectArray = (zr1_1)objectArray;
                object = (BottomNavigationData)object;
                return HomeRepo.x((zr1_1)objectArray, (BottomNavigationData)object);
            }
            case 0: 
        }
        object = (DataCallback)object;
        objectArray = (CheckoutFragment)objectArray;
        Intrinsics.checkNotNullParameter(objectArray, (String)object4);
        Intrinsics.checkNotNullParameter(object, "cartBrickCallback");
        object4 = cp_1.Companion;
        int n14 = nn_2.b((cp$a)object4, (DataCallback)object);
        if (n14 != 0) {
            String string2;
            float f5;
            boolean bl2;
            Object object5 = object = ((DataCallback)object).getData();
            object5 = (CartOrder)object;
            objectArray.getClass();
            object = new Gson();
            String string3 = ((Gson)object).toJson(object5);
            object = objectArray.h;
            object4 = "checkOutViewModel";
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object4);
                bl2 = false;
                object = null;
            }
            if ((object = ((ps_0)object).i) != null) {
                object = ((EarnPoint)object).getEligibleEarnAmount();
            } else {
                bl2 = false;
                object = null;
            }
            n8 = 0;
            float f6 = 0.0f;
            Object object6 = null;
            if (object != null) {
                object = objectArray.h;
                if (object == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)object4);
                    bl2 = false;
                    object = null;
                }
                if ((object = ((ps_0)object).i) != null && (object = ((EarnPoint)object).getEligibleEarnAmount()) != null) {
                    double d2 = (Double)object;
                    f6 = (float)d2;
                }
                f5 = f6;
            } else {
                f5 = 0.0f;
                string2 = null;
            }
            if (object5 != null) {
                float f7;
                Class<OrderConfirmationActivity> clazz;
                object = objectArray.h;
                if (object == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)object4);
                    bl2 = false;
                    object = null;
                }
                if ((object = ((ps_0)object).o) != null) {
                    object = ((CartDeliveryAddress)object).getEstimateDeliveryDate();
                    clazz = object;
                } else {
                    clazz = null;
                }
                String string4 = ((CartOrder)object5).getCode();
                object6 = objectArray.h;
                if (object6 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)object4);
                    n8 = 0;
                    object6 = null;
                    f6 = 0.0f;
                }
                Object object7 = ((ps_0)object6).p;
                object6 = objectArray.h;
                if (object6 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)object4);
                    n8 = 0;
                    object6 = null;
                    f6 = 0.0f;
                }
                Object object8 = ((ps_0)object6).q;
                Object object9 = object;
                object = new ConfirmOrder(string4, string3, f5, (HashMap)object7, (HashMap)object8, (String)((Object)clazz));
                string4 = ((CartOrder)object5).getPaymentCode();
                object6 = objectArray.m;
                object9 = ((NewEEcommerceEventsRevamp)object6).getEE_ADD_PAYMENT_INFO();
                string2 = objectArray.F;
                object7 = "single page checkout";
                object8 = objectArray.G;
                string3 = "single page checkout";
                ((NewEEcommerceEventsRevamp)object6).pushEECheckoutStep2((CartOrder)object5, (String)object9, string4, string3, string2, (String)object7, (String)object8);
                object6 = objectArray.y;
                object5 = OrderConfirmationActivity.class;
                object4 = new Intent((Context)object6, object5);
                f00.c = object;
                object = objectArray.Qa().e;
                bl2 = ((m80_0)object).e();
                if (bl2) {
                    object = objectArray.Qa().f;
                    if (object != null && (object = ((PriceValidation)object).getPriceSplitup()) != null) {
                        object = ((PriceSplitUp)object).getConvenienceFee();
                    } else {
                        bl2 = false;
                        object = null;
                    }
                    object6 = "ORDER_COD_FEE_DATA";
                    object4.putExtra((String)object6, (Serializable)object);
                }
                if ((object = objectArray.I) != null) {
                    object = ((KT)object).a.s;
                    if (object != null && (object = ((PaymentInstruments)object).getPaymentInstrumentDetails()) != null) {
                        boolean bl3;
                        object = ((Iterable)object).iterator();
                        n8 = 1;
                        f6 = Float.MIN_VALUE;
                        while (bl3 = object.hasNext()) {
                            object5 = (PaymentInstrumentType)object.next();
                            if (object5 != null) {
                                object5 = ((PaymentInstrumentType)object5).getPaymentInstrumentCode();
                            } else {
                                bl3 = false;
                                object5 = null;
                                f7 = 0.0f;
                            }
                            if (!(bl3 = kotlin.text.b.i((String)object5, (String)(object9 = "COD"), n7 != 0))) continue;
                            n8 = 0;
                            f6 = 0.0f;
                            object6 = null;
                        }
                    } else {
                        n8 = 1;
                        f6 = Float.MIN_VALUE;
                    }
                    if (n8 == n7) {
                        n3 = 1;
                    }
                }
                object = n3 != 0 ? "Yes" : "No";
                object4.putExtra("IS_COD_BLOCKED", (String)object);
                object = objectArray.Qa();
                object3 = ((kj2_1)object).g;
                String string5 = ((kj2_1)object).k;
                n8 = ((kj2_1)object).l;
                f7 = ((kj2_1)object).o;
                object5 = String.valueOf(f7);
                object9 = "netPayable";
                Intrinsics.checkNotNullParameter(object5, (String)object9);
                object2 = new Object();
                ((ji0_2)object2).a = object3;
                ((ji0_2)object2).b = string5;
                ((ji0_2)object2).c = n8;
                ((ji0_2)object2).d = object5;
                object3 = "FB_EVENT_DATA";
                object4.putExtra((String)object3, (Serializable)object2);
                object = ((kj2_1)object).x;
                object2 = "payment_type";
                object4.putExtra((String)object2, (String)object);
                object = objectArray.y;
                if (object != null) {
                    object.startActivity((Intent)object4);
                }
                if ((object = objectArray.y) != null) {
                    object.finish();
                }
            } else {
                object = objectArray.getActivity();
                if (object != null) {
                    object3 = StringCompanionObject.INSTANCE;
                    n4 = R$string.acc_error_message;
                    object3 = hv3_0.K(n4);
                    object4 = hv3_0.K(R$string.server_alert_title);
                    objectArray = new Object[n7];
                    objectArray[0] = object4;
                    object3 = xh2_0.a(objectArray, n7, (String)object3, "format(...)");
                    n14 = R$string.server_alert_title;
                    Intrinsics.checkNotNullParameter(object, "activity");
                    n7 = 0x1020002;
                    object = Snackbar.make(object.findViewById(n7), n14, 0);
                    Intrinsics.checkNotNullExpressionValue(object, "make(...)");
                    object2 = ((BaseTransientBottomBar)object).getView();
                    Intrinsics.checkNotNullExpressionValue(object2, "getView(...)");
                    Object object10 = Looper.getMainLooper();
                    object4 = new Handler(object10);
                    object10 = new lq0_2((View)object2, (String)object3);
                    long l2 = 100;
                    object4.postDelayed((Runnable)object10, l2);
                    ((Snackbar)object).show();
                }
                object = yn3_0.a;
                object3 = "Cart Order is Null";
                object2 = new IllegalStateException((String)object3);
                ((yn3$a)object).e((Throwable)object2);
            }
        }
        return Unit.a;
    }
}

