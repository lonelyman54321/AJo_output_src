/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.text.TextUtils
 */
import android.app.Activity;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import com.ajio.ril.core.network.model.DataError;
import com.ajio.ril.core.network.model.DataError$ErrorMessage;
import com.ril.ajio.R$string;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.events.GTMEvents;
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.login.activity.a;
import com.ril.ajio.services.data.user.AccountCheckResponse;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.StringsKt;

public final class vA1
implements F62 {
    public final /* synthetic */ xA1 a;

    public /* synthetic */ vA1(xA1 xA12) {
        this.a = xA12;
    }

    public final void onChanged(Object object) {
        int n3;
        int n4 = 1;
        Object object2 = null;
        object = (DataCallback)object;
        Object object3 = this.a;
        Intrinsics.checkNotNullParameter(object3, "this$0");
        Object object4 = ((xA1)object3).p;
        if (object4 != null) {
            object4.stopLoader();
        }
        if ((n3 = nn_2.b((cp$a)(object4 = cp_1.Companion), (DataCallback)object)) != 0) {
            object4 = ((Fragment)object3).getActivity();
            hv3_0.S((Activity)object4);
            if (object != null && (n3 = ((DataCallback)object).getStatus()) == 0) {
                if ((object = (AccountCheckResponse)((DataCallback)object).getData()) != null) {
                    n3 = (int)(((AccountCheckResponse)object).isSuccess() ? 1 : 0);
                    Object object5 = "";
                    if (n3 == 0) {
                        a a2 = ((xA1)object3).p;
                        if (a2 != null) {
                            object2 = lz1_2.Companion;
                            object3 = ((xA1)object3).v;
                            if (object3 != null && (object3 = ((Object)StringsKt.m0((CharSequence)object3)).toString()) != null) {
                                object5 = object3;
                            }
                            object2.getClass();
                            object = Lz1$a.a((String)object5, (AccountCheckResponse)object);
                            object2 = "NewUserFragment";
                            a2.Z0((Fragment)object, (String)object2);
                        }
                    } else {
                        object4 = ((xA1)object3).p;
                        if (object4 != null) {
                            pA1$a pA1$a = pA1.Companion;
                            boolean bl2 = ((xA1)object3).u;
                            object3 = ((xA1)object3).v;
                            if (object3 != null && (object3 = ((Object)StringsKt.m0((CharSequence)object3)).toString()) != null) {
                                object5 = object3;
                            }
                            pA1$a.getClass();
                            object = pA1$a.a((AccountCheckResponse)object, bl2, n4 != 0, (String)object5, false);
                            String string2 = "LoginPasswordFragment";
                            object4.Z0((Fragment)object, string2);
                        }
                    }
                }
            } else {
                int n7 = ((DataCallback)object).getStatus();
                if (n7 == n4) {
                    Object object6;
                    int n8;
                    object = ((DataCallback)object).getError();
                    object3 = "getMessage(...)";
                    object4 = "format(...)";
                    if (object != null && (n8 = TextUtils.isEmpty((CharSequence)(object6 = ((DataError)object).getErrorMessage().getMessage()))) == 0) {
                        object6 = StringCompanionObject.INSTANCE;
                        n8 = R$string.acc_error_message;
                        object6 = hv3_0.K(n8);
                        String string3 = ((DataError)object).getErrorMessage().getMessage();
                        Object[] objectArray = new Object[n4];
                        objectArray[0] = string3;
                        Object object7 = xh2_0.a(objectArray, n4, (String)object6, (String)object4);
                        object4 = ((DataError)object).getErrorMessage().getMessage();
                        Intrinsics.checkNotNullExpressionValue(object4, (String)object3);
                        hv3_0.o0(0, (String)object4, (String)object7);
                        object7 = AnalyticsManager.Companion.getInstance();
                        object2 = ((AnalyticsManager)object7).getGtmEvents();
                        object = ((DataError)object).getErrorMessage();
                        object6 = ((DataError$ErrorMessage)object).getMessage();
                        object3 = "formErrorEvent";
                        object4 = "Login Form";
                        string3 = "login - set password screen";
                        boolean bl3 = false;
                        objectArray = null;
                        int n10 = 112;
                        boolean bl4 = false;
                        GTMEvents.gtmEventsToGa$default((GTMEvents)object2, (String)object3, (String)object4, (String)object6, string3, null, null, null, n10, null);
                    } else {
                        if (object != null) {
                            object6 = ((DataError)object).getErrors();
                        } else {
                            n8 = 0;
                            object6 = null;
                        }
                        if (object6 != null && (n8 = (object6 = ((DataError)object).getErrors()).size()) > 0) {
                            object6 = StringCompanionObject.INSTANCE;
                            n8 = R$string.acc_error_message;
                            object6 = hv3_0.K(n8);
                            String string4 = ((DataError$ErrorMessage)((DataError)object).getErrors().get(0)).getMessage();
                            Object object8 = new Object[n4];
                            object8[0] = string4;
                            Object object9 = xh2_0.a(object8, n4, (String)object6, (String)object4);
                            object4 = ((DataError$ErrorMessage)((DataError)object).getErrors().get(0)).getMessage();
                            Intrinsics.checkNotNullExpressionValue(object4, (String)object3);
                            hv3_0.o0(0, (String)object4, (String)object9);
                            object9 = AnalyticsManager.Companion.getInstance();
                            object3 = ((AnalyticsManager)object9).getGtmEvents();
                            object = (DataError$ErrorMessage)((DataError)object).getErrors().get(0);
                            string4 = ((DataError$ErrorMessage)object).getMessage();
                            boolean bl5 = false;
                            object4 = "formErrorEvent";
                            object6 = "Login Form";
                            object8 = "login - set password screen";
                            int n14 = 112;
                            GTMEvents.gtmEventsToGa$default((GTMEvents)object3, (String)object4, (String)object6, string4, (String)object8, null, null, null, n14, null);
                        } else {
                            object = StringCompanionObject.INSTANCE;
                            int n15 = R$string.acc_error_message;
                            object = hv3_0.K(n15);
                            n7 = R$string.something_wrong_msg;
                            object3 = hv3_0.K(n7);
                            object6 = new Object[n4];
                            object6[0] = object3;
                            object = xh2_0.a(object6, n4, (String)object, (String)object4);
                            n4 = R$string.something_wrong_msg;
                            String string5 = hv3_0.K(n4);
                            hv3_0.o0(0, string5, (String)object);
                        }
                    }
                }
            }
        }
    }
}

