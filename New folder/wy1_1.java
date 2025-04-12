/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.os.Bundle
 *  android.text.TextUtils
 *  android.view.View
 */
import android.app.Activity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.ajio.ril.core.network.model.DataError;
import com.ajio.ril.core.network.model.DataError$ErrorMessage;
import com.ril.ajio.R$string;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.events.GTMEvents;
import com.ril.ajio.analytics.events.NewCustomEventsRevamp;
import com.ril.ajio.data.repo.ApiErrorRepo;
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.data.repo.DataCallback$Companion;
import com.ril.ajio.payment.activity.OrderConfirmationActivity;
import com.ril.ajio.payment.activity.OrderConfirmationActivity$a;
import com.ril.ajio.services.data.Login.CustomerType;
import com.ril.ajio.services.data.Payment.PlaceOrder;
import com.ril.ajio.services.data.user.AccountCheckResponse;
import com.ril.ajio.services.query.QueryCustomer;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.StringsKt;

/*
 * Renamed from Wy1
 */
public final class wy1_1
implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ wy1_1() {
        this.a = 2;
        this.b = "single page checkout";
    }

    public /* synthetic */ wy1_1(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final Object invoke(Object bundle) {
        int n3;
        int n4 = 0;
        Object object = null;
        Object object2 = "this$0";
        Object object3 = this.b;
        int n7 = 0;
        Bundle bundle2 = null;
        int n8 = 1;
        int n10 = this.a;
        switch (n10) {
            default: {
                Bundle bundle3 = bundle;
                bundle3 = (dl2_2)bundle;
                Object[] objectArray = object3;
                objectArray = (String)object3;
                Intrinsics.checkNotNullParameter(objectArray, "$screenName");
                Intrinsics.checkNotNullParameter(bundle3, "placeOrderResp");
                object = (PlaceOrder)bundle3.b;
                object2 = bundle3.a;
                boolean bl2 = ((cl2_2)object2).d();
                if (bl2 && object != null) {
                    object2 = DataCallback.Companion;
                    object = ((DataCallback$Companion)object2).onSuccess(object);
                } else {
                    ApiErrorRepo apiErrorRepo = ApiErrorRepo.INSTANCE;
                    String string2 = "PlaceOrderRequest";
                    boolean bl3 = true;
                    String string3 = "Forward";
                    object = apiErrorRepo.handleApiError((dl2_2)bundle3, string2, bl3, (String)objectArray, string3);
                }
                return object;
            }
            case 1: {
                bundle2 = bundle;
                bundle2 = (DataCallback)bundle;
                OrderConfirmationActivity$a orderConfirmationActivity$a = OrderConfirmationActivity.Companion;
                object3 = (OrderConfirmationActivity)object3;
                Intrinsics.checkNotNullParameter(object3, (String)object2);
                object2 = cp_1.Companion;
                int n14 = nn_2.b((cp$a)object2, (DataCallback)bundle2);
                if (n14 != 0 && (n14 = bundle2.getStatus()) == 0 && (object2 = bundle2.getData()) != null) {
                    object2 = (CustomerType)bundle2.getData();
                    object3 = object3.w0;
                    if (object3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("appPreferences");
                        object3 = null;
                    }
                    if (object2 != null) {
                        object = ((CustomerType)object2).getCustomerType();
                    }
                    object3.q((String)object);
                }
                return Unit.a;
            }
            case 0: 
        }
        Bundle bundle4 = bundle;
        bundle4 = (DataCallback)bundle;
        Object object4 = fz1_2.Companion;
        object3 = (fz1_2)object3;
        Intrinsics.checkNotNullParameter(object3, (String)object2);
        object2 = object3.g;
        if (object2 != null) {
            object2.stopLoader();
        }
        if ((n3 = nn_2.b((cp$a)(object2 = cp_1.Companion), (DataCallback)bundle4)) != 0) {
            object2 = object3.getActivity();
            hv3_0.S((Activity)object2);
            if (bundle4 != null && (n3 = bundle4.getStatus()) == 0) {
                object3.h = object2 = (AccountCheckResponse)bundle4.getData();
                if (object2 != null) {
                    n3 = (int)(((AccountCheckResponse)object2).isSuccess() ? 1 : 0);
                    bundle4 = "";
                    if (n3 == 0) {
                        object = object3.Qa().mobileEt.getText();
                        if (object != null && (object = object.toString()) != null && (object = ((Object)StringsKt.m0((CharSequence)object)).toString()) != null) {
                            bundle4 = object;
                        }
                        object = hv3_0.a;
                        object.getClass();
                        n4 = hv3_0.s();
                        object2 = "NewUserFragment";
                        if (n4 != 0) {
                            object = object3.g;
                            if (object != null) {
                                object4 = az1_2.Companion;
                                Pair pair = new Pair("USER_INPUT_VALUE", bundle4);
                                bundle4 = object3.h;
                                Pair pair2 = new Pair("param2", bundle4);
                                bundle4 = Boolean.TRUE;
                                String string4 = "is_half_card_flow";
                                Pair pair3 = new Pair(string4, bundle4);
                                n10 = 3;
                                bundle4 = new Pair[n10];
                                bundle4[0] = pair;
                                bundle4[n8] = pair2;
                                n7 = 2;
                                bundle4[n7] = pair3;
                                bundle2 = DE.b((Pair[])bundle4);
                                object4.getClass();
                                Intrinsics.checkNotNullParameter(bundle2, "arguments");
                                az1_2 az1_22 = new az1_2();
                                az1_22.setArguments(bundle2);
                                object.Z0(az1_22, (String)object2);
                            }
                        } else {
                            object = object3.g;
                            if (object != null) {
                                bundle2 = lz1_2.Companion;
                                AccountCheckResponse accountCheckResponse = object3.h;
                                Intrinsics.checkNotNull(accountCheckResponse);
                                bundle2.getClass();
                                bundle2 = Lz1$a.a((String)bundle4, accountCheckResponse);
                                object.Z0((Fragment)bundle2, (String)object2);
                            }
                        }
                        object3.dismiss();
                    } else {
                        object2 = Ey1.a;
                        object2 = object3.Qa().mobileEt.getText();
                        if (object2 != null) {
                            object = object2.toString();
                        }
                        object2 = new QueryCustomer();
                        if (object != null && (object = ((Object)StringsKt.m0((CharSequence)object)).toString()) != null) {
                            bundle4 = object;
                        }
                        ((QueryCustomer)object2).setMobileNumber((String)bundle4);
                        ((QueryCustomer)object2).setMobileNumberEnterered(n8 != 0);
                        object = object3.i;
                        if (object != null) {
                            bundle2 = "<set-?>";
                            Intrinsics.checkNotNullParameter(object2, (String)bundle2);
                            ((oa1_1)object).C = object2;
                        }
                        if ((object = object3.i) != null) {
                            object3 = "login/signup screen";
                            ((oa1_1)object).k((QueryCustomer)object2, (String)object3);
                        }
                    }
                }
            } else {
                n3 = bundle4.getStatus();
                if (n3 == n8) {
                    String string5;
                    boolean bl4;
                    object2 = Ey1.a;
                    object2 = object3.Qa().loginContinueTv;
                    Intrinsics.checkNotNullExpressionValue(object2, "loginContinueTv");
                    float f5 = 1.0f;
                    Ey1.l((View)object2, n8 != 0, 0, f5);
                    object2 = object3.Qa().progressBarMobile;
                    Intrinsics.checkNotNullExpressionValue(object2, "progressBarMobile");
                    int n15 = 8;
                    object2.setVisibility(n15);
                    object3.Qa().mobileEt.setAlpha(f5);
                    object2 = bundle4.getError();
                    bundle4 = object3.m;
                    object4 = "Login Form - ";
                    Object object5 = "getMessage(...)";
                    String string6 = "format(...)";
                    if (object2 != null && !(bl4 = TextUtils.isEmpty((CharSequence)(string5 = ((DataError)object2).getErrorMessage().getMessage())))) {
                        object = StringCompanionObject.INSTANCE;
                        n4 = R$string.acc_error_message;
                        object = hv3_0.K(n4);
                        string5 = ((DataError)object2).getErrorMessage().getMessage();
                        Object object6 = new Object[n8];
                        object6[0] = string5;
                        object = xh2_0.a(object6, n8, (String)object, string6);
                        String string7 = ((DataError)object2).getErrorMessage().getMessage();
                        Intrinsics.checkNotNullExpressionValue(string7, (String)object5);
                        hv3_0.o0(0, string7, (String)object);
                        object5 = AnalyticsManager.Companion.getInstance().getGtmEvents();
                        object6 = ((DataError)object2).getErrorMessage().getMessage();
                        GTMEvents.gtmEventsToGa$default((GTMEvents)object5, "formErrorEvent", "Login Form", (String)object6, "login/signup screen", null, null, null, 112, null);
                        object = bundle4.getEC_FORM();
                        object2 = ((DataError)object2).getErrorMessage().getMessage();
                        string6 = kp1_0.c((String)object4, (String)object2);
                        object5 = "error";
                        string5 = "form_error";
                        object6 = "login/signup screen";
                        String string8 = "user account screen";
                        String string9 = object3.n;
                        String string10 = object3.o;
                        int n16 = 1536;
                        object4 = object;
                        NewCustomEventsRevamp.newPushCustomEvent$default((NewCustomEventsRevamp)bundle4, (String)object, (String)object5, string6, string5, (String)object6, string8, string9, null, string10, false, null, n16, null);
                    } else {
                        if (object2 != null) {
                            object = ((DataError)object2).getErrors();
                        }
                        if (object != null && (n4 = (object = ((DataError)object2).getErrors()).size()) > 0 && (n4 = (int)(TextUtils.isEmpty((CharSequence)(object = ((DataError$ErrorMessage)((DataError)object2).getErrors().get(0)).getMessage())) ? 1 : 0)) == 0) {
                            object = StringCompanionObject.INSTANCE;
                            n4 = R$string.acc_error_message;
                            object = hv3_0.K(n4);
                            string5 = ((DataError$ErrorMessage)((DataError)object2).getErrors().get(0)).getMessage();
                            Object object7 = new Object[n8];
                            object7[0] = string5;
                            object = xh2_0.a(object7, n8, (String)object, string6);
                            String string11 = ((DataError$ErrorMessage)((DataError)object2).getErrors().get(0)).getMessage();
                            Intrinsics.checkNotNullExpressionValue(string11, (String)object5);
                            hv3_0.o0(0, string11, (String)object);
                            object5 = AnalyticsManager.Companion.getInstance().getGtmEvents();
                            object7 = ((DataError$ErrorMessage)((DataError)object2).getErrors().get(0)).getMessage();
                            GTMEvents.gtmEventsToGa$default((GTMEvents)object5, "formErrorEvent", "Login Form", (String)object7, "login/signup screen", null, null, null, 112, null);
                            object = bundle4.getEC_FORM();
                            object2 = ((DataError$ErrorMessage)((DataError)object2).getErrors().get(0)).getMessage();
                            string6 = kp1_0.c((String)object4, (String)object2);
                            object5 = "error";
                            string5 = "form_error";
                            object7 = "login/signup screen";
                            String string12 = "user account screen";
                            String string13 = object3.n;
                            String string14 = object3.o;
                            int n17 = 1536;
                            object4 = object;
                            NewCustomEventsRevamp.newPushCustomEvent$default((NewCustomEventsRevamp)bundle4, (String)object, (String)object5, string6, string5, (String)object7, string12, string13, null, string14, false, null, n17, null);
                        } else {
                            object = StringCompanionObject.INSTANCE;
                            n4 = R$string.acc_error_message;
                            object = hv3_0.K(n4);
                            object2 = hv3_0.K(R$string.something_wrong_msg);
                            object3 = new Object[n8];
                            object3[0] = object2;
                            object = xh2_0.a(object3, n8, (String)object, string6);
                            n3 = R$string.something_wrong_msg;
                            object2 = hv3_0.K(n3);
                            hv3_0.o0(0, (String)object2, (String)object);
                        }
                    }
                }
            }
        }
        return Unit.a;
    }
}

