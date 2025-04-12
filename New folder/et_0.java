/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 */
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentManager$o;
import androidx.fragment.app.FragmentManager$p;
import com.ril.ajio.R$string;
import com.ril.ajio.analytics.events.NewCustomEventsRevamp;
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.payment.fragment.CheckoutFragment;
import com.ril.ajio.payment.view.PaymentActivity;
import com.ril.ajio.pdprefresh.fragments.NewProductDetailsFragment;
import com.ril.ajio.services.data.Cart.Cart;
import com.ril.ajio.services.data.Cart.CartEntry;
import com.ril.ajio.services.data.Order.CartOrder;
import com.ril.ajio.services.data.Payment.PlaceOrder;
import io.reactivex.Scheduler;
import java.util.ArrayList;
import java.util.Locale;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.StringsKt;

/*
 * Renamed from ET
 */
public final class et_0
implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Fragment b;

    public /* synthetic */ et_0(Fragment fragment, int n3) {
        this.a = n3;
        this.b = fragment;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final Object invoke(Object objectArray) {
        int n3 = 0;
        Object object = null;
        Object object2 = "this$0";
        Object object3 = this.b;
        int n4 = 1;
        int n7 = this.a;
        switch (n7) {
            default: {
                object = objectArray;
                object = (DataCallback)objectArray;
                object3 = (NewProductDetailsFragment)object3;
                Intrinsics.checkNotNullParameter(object3, (String)object2);
                Intrinsics.checkNotNullParameter(object, "userDataCallback");
                object2 = cp_1.Companion;
                boolean bl2 = nn_2.b((cp$a)object2, (DataCallback)object);
                if (!bl2 || (n3 = ((DataCallback)object).getStatus()) != 0) return Unit.a;
                ((NewProductDetailsFragment)object3).Qa();
                return Unit.a;
            }
            case 0: 
        }
        Object object4 = objectArray;
        object4 = (DataCallback)objectArray;
        object3 = (CheckoutFragment)object3;
        Intrinsics.checkNotNullParameter(object3, (String)object2);
        Intrinsics.checkNotNullParameter(object4, "responseData");
        ((CheckoutFragment)object3).h();
        object2 = cp_1.Companion;
        int n8 = nn_2.b((cp$a)object2, (DataCallback)object4);
        if (n8 == 0) return Unit.a;
        n8 = ((DataCallback)object4).getStatus();
        if (n8 == 0) {
            Object object5;
            object2 = (PlaceOrder)((DataCallback)object4).getData();
            if (object2 == null) return Unit.a;
            object4 = ((PlaceOrder)object2).getOrderStatus();
            n7 = (int)(Intrinsics.areEqual(object4, object5 = Boolean.TRUE) ? 1 : 0);
            if (n7 != 0 && (n7 = (int)(Intrinsics.areEqual(object4 = ((PlaceOrder)object2).getPaymentStatus(), object5) ? 1 : 0)) != 0) {
                String string2;
                block29: {
                    block28: {
                        String string3;
                        object4 = ss_1.a;
                        object4 = ((PlaceOrder)object2).getOrderData();
                        object5 = (jo_2)((CheckoutFragment)object3).b.getValue();
                        string2 = "";
                        if (object4 != null && (string3 = ((CartOrder)object4).getPaymentCode()) != null) {
                            object4 = Locale.ROOT;
                            object4 = string3.toUpperCase((Locale)object4);
                            Intrinsics.checkNotNullExpressionValue(object4, "toUpperCase(...)");
                            Object object6 = "UPI";
                            Intrinsics.checkNotNullExpressionValue(object6, (String)object6);
                            n7 = (int)(StringsKt.F((CharSequence)object4, (CharSequence)object6, false) ? 1 : 0);
                            Object object7 = "PREFERRED_PAYMENT";
                            if (n7 != 0 && (object4 = uy2_1.a) != null && (n7 = ((String)object4).length()) != 0) {
                                object4 = oT.a;
                                Intrinsics.checkNotNullParameter(string3, "paymentCode");
                                object6 = oT.a;
                                String string4 = ((NewCustomEventsRevamp)object6).getEC_ORDER_CONFIRMATION();
                                String string5 = ((NewCustomEventsRevamp)object6).getEC_PAYMENT_MODE_SAVED_ACTION();
                                String string6 = ((NewCustomEventsRevamp)object6).getEC_ORDER_PAYMENT_MODE_SAVED_EVENT_NAME();
                                object4 = oT.b;
                                String string7 = oT.c;
                                String string8 = "order confirmation screen";
                                String string9 = "order confirmation screen";
                                int n10 = 1536;
                                object = object7;
                                object7 = object4;
                                NewCustomEventsRevamp.newPushCustomEvent$default((NewCustomEventsRevamp)object6, string4, string5, string3, string6, string8, string9, (String)object4, null, string7, false, null, n10, null);
                                if (object5 != null && (object4 = uy2_1.a) != null) {
                                    ((sw_0)object5).putPreference((String)object, (String)object4);
                                }
                            } else {
                                object = object7;
                                if (object5 != null) {
                                    ((sw_0)object5).putPreference((String)object7, string2);
                                }
                            }
                        }
                        object2 = ((PlaceOrder)object2).getOrderData();
                        object = ((Fragment)object3).getActivity();
                        if (object != null) {
                            object = ((FragmentActivity)object).getSupportFragmentManager();
                            object4 = "CartFragment";
                            if ((object = (qn_2)((FragmentManager)object).E((String)object4)) != null) {
                                object4 = "cart_list";
                                object5 = ((Fragment)object).getChildFragmentManager();
                                object5 = ((FragmentManager)object5).E((String)object4);
                                if (object5 == null) break block28;
                                object = ((Fragment)object).getChildFragmentManager();
                                object.getClass();
                                int n14 = -1;
                                object5 = new FragmentManager$p((FragmentManager)object, (String)object4, n14, n4);
                                n7 = 0;
                                object4 = null;
                                try {
                                    ((FragmentManager)object).x((FragmentManager$o)object5, false);
                                }
                                catch (Exception exception) {
                                    object4 = yn3_0.a;
                                    ((yn3$a)object4).e(exception);
                                }
                            }
                        }
                    }
                    object = ss_1.a;
                    if (object2 != null && (n3 = (int)(TextUtils.isEmpty((CharSequence)(object = ((CartOrder)object2).getCode())) ? 1 : 0)) == 0 && (object = ((CartOrder)object2).getDeliveryAddress()) != null && (object = ((CartOrder)object2).getEntries()) != null && (n3 = ((ArrayList)(object = ((CartOrder)object2).getEntries())).size()) != 0) {
                        object = ((CartOrder)object2).getEntries().iterator();
                        object4 = "iterator(...)";
                        Intrinsics.checkNotNullExpressionValue(object, (String)object4);
                        while ((n7 = (int)(object.hasNext() ? 1 : 0)) != 0) {
                            object4 = (CartEntry)object.next();
                            if (object4 != null) continue;
                            break block29;
                        }
                        object = ((CheckoutFragment)object3).h;
                        if (object == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("checkOutViewModel");
                            n3 = 0;
                            object = null;
                        }
                        object.getClass();
                        object3 = new ys_0((ps_0)object, (CartOrder)object2);
                        object4 = new o53_0((Callable)object3);
                        object3 = qt2_2.c;
                        object3 = ((g53_0)object4).h((Scheduler)object3);
                        object4 = ti_2.a();
                        object3 = ((g53_0)object3).e((Scheduler)object4);
                        object4 = new zs_1((ps_0)object, (CartOrder)object2);
                        object5 = new as_0((zs_1)object4);
                        object4 = new oc_1(n4, object, object2);
                        object2 = new bs_0((oc_1)object4);
                        object2 = ((g53_0)object3).f((o60_0)object5, (o60_0)object2);
                        object = ((ps_0)object).r;
                        ((t30_0)object).b((yr0_2)object2);
                        return Unit.a;
                    }
                }
                if ((object = ((CheckoutFragment)object3).y) != null) {
                    ((PaymentActivity)object).t0 = n4;
                }
                if (object != null) {
                    String string10;
                    if (object2 != null && (string10 = ((CartOrder)object2).getCode()) != null && (n4 = string10.length()) != 0) {
                        string2 = ((CartOrder)object2).getCode();
                        Intrinsics.checkNotNull(string2);
                    }
                    object2 = "<set-?>";
                    Intrinsics.checkNotNullParameter(string2, (String)object2);
                    ((PaymentActivity)object).u0 = string2;
                }
                if ((object = ((CheckoutFragment)object3).y) == null) return Unit.a;
                ((PaymentActivity)object).A2();
                return Unit.a;
            }
            object = ((PlaceOrder)object2).getCartData();
            if (object != null) {
                object = ((PlaceOrder)object2).getCartData();
                ((CheckoutFragment)object3).Ta((Cart)object);
            }
            ((CheckoutFragment)object3).Va();
            return Unit.a;
        }
        n3 = ((DataCallback)object4).getStatus();
        if (n3 != n4) return Unit.a;
        object = ((Fragment)object3).getActivity();
        if (object != null && (n3 = (int)(object.isFinishing() ? 1 : 0)) == 0) {
            object = StringCompanionObject.INSTANCE;
            n3 = R$string.acc_error_message_page_load_fail;
            object = hv3_0.K(n3);
            n8 = R$string.something_wrong_msg;
            object2 = hv3_0.K(n8);
            object4 = new Object[n4];
            Object var10_13 = null;
            object4[0] = object2;
            object = xh2_0.a((Object[])object4, n4, (String)object, "format(...)");
            object2 = (PaymentActivity)((Fragment)object3).getActivity();
            if (object2 != null) {
                n4 = R$string.something_wrong_msg;
                String string11 = hv3_0.K(n4);
                ((PaymentActivity)object2).showNotification(string11, (String)object);
            }
        }
        ((CheckoutFragment)object3).Va();
        return Unit.a;
    }
}

