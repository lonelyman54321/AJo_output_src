/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.os.Bundle
 *  android.text.TextUtils
 *  android.view.View
 */
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import androidx.lifecycle.LiveData;
import com.ajio.ril.core.network.model.DataError;
import com.ajio.ril.core.network.model.DataError$ErrorMessage;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import com.ril.ajio.R$string;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.AnalyticsManager$Companion;
import com.ril.ajio.analytics.events.FirebaseEvents;
import com.ril.ajio.analytics.events.GTMEvents;
import com.ril.ajio.analytics.events.NewCustomEventsRevamp;
import com.ril.ajio.customviews.AjioLoaderView;
import com.ril.ajio.data.repo.DataCallback;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.b;

/*
 * Renamed from EV1
 */
public final class ev1_1
implements Function1 {
    public final /* synthetic */ iv1_2 a;

    public /* synthetic */ ev1_1(iv1_2 iv1_22) {
        this.a = iv1_22;
    }

    public final Object invoke(Object iterator) {
        Object object = null;
        int n3 = 1;
        Object object2 = iterator;
        object2 = (DataCallback)((Object)iterator);
        iv1_2 iv1_22 = this.a;
        Intrinsics.checkNotNullParameter(iv1_22, "this$0");
        Object object3 = cp_1.Companion;
        int n4 = nn_2.b((cp$a)object3, (DataCallback)object2);
        if (n4 != 0) {
            object3 = iv1_22.e;
            Object object4 = null;
            if (object3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("progressBar");
                n4 = 0;
                object3 = null;
            }
            ((AjioLoaderView)((Object)object3)).stopLoader();
            n4 = ((DataCallback)object2).getStatus();
            Object[] objectArray = "apply coupon";
            CharSequence charSequence = "couponBox";
            Object object5 = iv1_22.k;
            if (n4 == 0) {
                object2 = iv1_22.o;
                boolean n7 = TextUtils.isEmpty((CharSequence)object2);
                if (n7) {
                    object2 = iv1_22.c;
                    if (object2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException((String)charSequence);
                        boolean bl2 = false;
                        object2 = null;
                    }
                    iv1_22.o = object2 = object2.getText().toString();
                }
                object2 = AnalyticsManager.Companion.getInstance().getGtmEvents();
                object3 = iv1_22.o;
                charSequence = new StringBuilder();
                ((StringBuilder)charSequence).append((String)object3);
                ((StringBuilder)charSequence).append("/Coupon Applied/Applicable");
                object3 = ((StringBuilder)charSequence).toString();
                charSequence = "coupon screen";
                ((GTMEvents)object2).pushButtonTapEvent((String)objectArray, object3, (String)charSequence);
                object2 = iv1_22.s;
                if (object2 != null) {
                    object2.P6();
                }
                object2 = new Bundle();
                object3 = ((NewCustomEventsRevamp)object5).getCOUPON_CODE();
                objectArray = iv1_22.o;
                object2.putString((String)object3, (String)objectArray);
                object3 = ((NewCustomEventsRevamp)object5).getCOUPON_TYPE();
                objectArray = iv1_22.n;
                object2.putString((String)object3, (String)objectArray);
                String string2 = ((NewCustomEventsRevamp)object5).getEC_COUPON_INTERACTIONS();
                String string3 = iv1_22.o;
                Intrinsics.checkNotNull(string3);
                object3 = iv1_22.l;
                objectArray = iv1_22.m;
                int n8 = 1536;
                String string4 = "apply success";
                String string5 = "apply_coupon_success";
                String string6 = "coupon screen";
                charSequence = "coupon screen";
                NewCustomEventsRevamp newCustomEventsRevamp = object5;
                object5 = charSequence;
                NewCustomEventsRevamp.newPushCustomEvent$default(newCustomEventsRevamp, string2, string4, string3, string5, string6, (String)charSequence, (String)object3, (Bundle)object2, (String)objectArray, false, null, n8, null);
                hv3_0.S(iv1_22.getActivity());
                object2 = iv1_22.r;
                if (object2 != null) {
                    ((qm_1)object2).b = object3 = iv1_22.o;
                }
                object2 = z40_0.Companion;
                object2 = Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)object2).a;
                object3 = "isShowHighlightedCouponSavingPopUp";
                boolean bl3 = ((ao0_0)object2).a((String)object3);
                if (!bl3) {
                    object2 = StringCompanionObject.INSTANCE;
                    int n10 = R$string.acc_alert_message;
                    object2 = hv3_0.K(n10);
                    n4 = R$string.coupon_applied_success_refresh;
                    object3 = hv3_0.K(n4);
                    objectArray = new Object[n3];
                    objectArray[0] = object3;
                    object = xh2_0.a(objectArray, n3, (String)object2, "format(...)");
                    object2 = iv1_22.i;
                    if (object2 == null) {
                        object2 = "activityFragmentListener";
                        Intrinsics.throwUninitializedPropertyAccessException((String)object2);
                    } else {
                        object4 = object2;
                    }
                    object2 = AJIOApplication$a.a();
                    n4 = R$string.coupon_applied_success_refresh;
                    object3 = hv3_0.K(n4);
                    object4.showToastNotification((Context)object2, (String)object3, n3, (String)object);
                } else {
                    object = (fc0_2)iv1_22.w.getValue();
                    if (object != null) {
                        object = ((fc0_2)object).a;
                        Boolean bl4 = Boolean.TRUE;
                        ((LiveData)object).k(bl4);
                    }
                }
                iv1_22.onNavigationClick();
            } else {
                n4 = ((DataCallback)object2).getStatus();
                if (n4 == n3) {
                    object3 = iv1_22.r;
                    if (object3 != null) {
                        ((qm_1)object3).c = false;
                    }
                    iv1_22.o = null;
                    if ((object2 = ((DataCallback)object2).getError()) != null && (object2 = ((DataError)object2).getErrors()) != null) {
                        object2 = object2.iterator();
                        while ((n4 = (int)(object2.hasNext() ? 1 : 0)) != 0) {
                            String string7;
                            object3 = (DataError$ErrorMessage)object2.next();
                            Object object6 = ((DataError$ErrorMessage)object3).getType();
                            boolean bl5 = b.i((String)object6, string7 = "VoucherOperationError", n3 != 0);
                            if (!bl5) continue;
                            object6 = iv1_22.d;
                            string7 = "couponValidationAlert";
                            if (object6 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException(string7);
                                bl5 = false;
                                object6 = null;
                            }
                            object6.setVisibility(0);
                            object6 = iv1_22.d;
                            if (object6 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException(string7);
                                bl5 = false;
                                object6 = null;
                            }
                            ai0_2.a((View)object6);
                            object6 = iv1_22.d;
                            if (object6 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException(string7);
                                bl5 = false;
                                object6 = null;
                            }
                            string7 = ((DataError$ErrorMessage)object3).getMessage();
                            object6.setText((CharSequence)string7);
                            object6 = cp_1.Companion;
                            object6.getClass();
                            bl5 = cp$a.t();
                            if (bl5 && (object6 = iv1_22.v) != null) {
                                ai0_2.B((View)object6);
                            }
                            AnalyticsManager$Companion analyticsManager$Companion = AnalyticsManager.Companion;
                            object6 = analyticsManager$Companion.getInstance().getGtmEvents();
                            string7 = iv1_22.c;
                            if (string7 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException((String)charSequence);
                                string7 = null;
                            }
                            string7 = string7.getText();
                            String string8 = ((DataError$ErrorMessage)object3).getMessage();
                            CharSequence charSequence2 = new StringBuilder();
                            charSequence2.append(string7);
                            charSequence2.append("/");
                            charSequence2.append(string8);
                            charSequence2.append("/NA");
                            string7 = charSequence2.toString();
                            string8 = "bag screen";
                            ((GTMEvents)object6).pushButtonTapEvent((String)objectArray, string7, string8);
                            Object object7 = new Bundle();
                            object6 = ((NewCustomEventsRevamp)object5).getCOUPON_CODE();
                            string7 = iv1_22.c;
                            if (string7 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException((String)charSequence);
                                string7 = null;
                            }
                            string7 = string7.getText().toString();
                            object7.putString((String)object6, string7);
                            object6 = ((NewCustomEventsRevamp)object5).getCOUPON_TYPE();
                            string7 = iv1_22.n;
                            object7.putString((String)object6, string7);
                            string7 = ((NewCustomEventsRevamp)object5).getEC_COUPON_INTERACTIONS();
                            charSequence2 = ((DataError$ErrorMessage)object3).getMessage();
                            Intrinsics.checkNotNullExpressionValue(charSequence2, "getMessage(...)");
                            object3 = iv1_22.l;
                            String string9 = iv1_22.m;
                            int n14 = 1536;
                            string8 = "apply error";
                            object6 = object5;
                            String string10 = string9;
                            string9 = "coupon_apply_error";
                            Bundle bundle = object7;
                            object7 = "coupon screen";
                            Object object8 = object5;
                            object5 = "coupon screen";
                            NewCustomEventsRevamp.newPushCustomEvent$default((NewCustomEventsRevamp)object6, string7, string8, (String)charSequence2, string9, (String)object7, (String)object5, (String)object3, bundle, string10, false, null, n14, null);
                            object3 = new Bundle();
                            object6 = iv1_22.c;
                            if (object6 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException((String)charSequence);
                                bl5 = false;
                                object6 = null;
                            }
                            object6 = object6.getText().toString();
                            object3.putString("coupon_code", (String)object6);
                            object3.putString("coupon_successful", "N");
                            object6 = analyticsManager$Companion.getInstance().getGtmEvents().getScreenName();
                            object3.putString("screenname", (String)object6);
                            object6 = analyticsManager$Companion.getInstance().getGtmEvents().getScreenName();
                            object3.putString("screen_name", (String)object6);
                            object6 = FirebaseEvents.Companion.getInstance();
                            string7 = "coupon_applied";
                            ((FirebaseEvents)object6).sendEvent(string7, (Bundle)object3);
                            object3 = iv1_22.getActivity();
                            hv3_0.S((Activity)object3);
                            object5 = object8;
                        }
                    }
                }
            }
        }
        return Unit.a;
    }
}

