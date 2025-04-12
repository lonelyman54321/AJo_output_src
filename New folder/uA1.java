/*
 * Decompiled with CFR 0.152.
 */
import com.ajio.ril.core.network.model.DataError;
import com.ajio.ril.core.network.model.DataError$ErrorMessage;
import com.google.android.material.textfield.TextInputLayout;
import com.ril.ajio.R$string;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.AnalyticsManager$Companion;
import com.ril.ajio.analytics.events.GTMEvents;
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.services.data.Login.ValidateOTPData;
import com.ril.ajio.services.query.QueryCustomer;
import java.util.Arrays;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.b;

public final class uA1
implements F62 {
    public final /* synthetic */ xA1 a;

    public /* synthetic */ uA1(xA1 xA12) {
        this.a = xA12;
    }

    public final void onChanged(Object object) {
        Object object2 = null;
        int bl2 = 1;
        Object object3 = object;
        object3 = (DataCallback)object;
        xA1 xA12 = this.a;
        Intrinsics.checkNotNullParameter(xA12, "this$0");
        Object object4 = cp_1.Companion;
        int n3 = nn_2.b((cp$a)object4, (DataCallback)object3);
        if (n3 != 0) {
            int bl3;
            object4 = xA12.p;
            if (object4 != null) {
                object4.stopLoader();
            }
            n3 = 0;
            object4 = null;
            Object object5 = "Login";
            Object object6 = "Set password";
            if (object3 != null && (bl3 = ((DataCallback)object3).getStatus()) == 0) {
                boolean bl4;
                Object object7 = AnalyticsManager.Companion.getInstance().getGtmEvents();
                String string2 = "Start shopping - Success";
                ((GTMEvents)object7).pushButtonTapEvent((String)object6, string2, (String)object5);
                object3 = (ValidateOTPData)((DataCallback)object3).getData();
                if (object3 != null && (bl4 = b.i((String)(object5 = ((ValidateOTPData)object3).getStatus()), (String)(object6 = "failure"), bl2 != 0))) {
                    String object8 = ((ValidateOTPData)object3).getDesc();
                    object3 = "getDesc(...)";
                    Intrinsics.checkNotNullExpressionValue(object8, (String)object3);
                    hv3_0.o0(0, object8, null);
                } else {
                    String string3;
                    tj2_2.Companion.getClass();
                    object3 = tj2$a_0.a();
                    object3.getClass();
                    object5 = "";
                    Intrinsics.checkNotNullParameter(object5, "pincode");
                    ((tj2_2)object3).a = object5;
                    object3 = xA12.o;
                    object6 = (jo_2)((hh3_2)object3).getValue();
                    object7 = "LOCATION_DATA";
                    ((sw_0)object6).putPreference((String)object7, (String)object5);
                    object5 = xA12.n;
                    Intrinsics.checkNotNull(object5);
                    ((b52_0)object5).b();
                    object5 = xA12.m;
                    if (object5 != null) {
                        object5 = md3_0.c((jD3)object5);
                        object6 = new qg3_2(2, null);
                        int n4 = 3;
                        Ae3.d((i90_0)object5, null, null, (Function2)object6, n4);
                    }
                    object5 = xA12.m;
                    Intrinsics.checkNotNull(object5);
                    ((hy3_0)object5).h();
                    object5 = xA12.m;
                    Intrinsics.checkNotNull(object5);
                    ((hy3_0)object5).d();
                    ((jo_2)((hh3_2)object3).getValue()).B();
                    int n7 = R$string.password_reset_msg;
                    object3 = hv3_0.K(n7);
                    hv3_0.o0(0, (String)object3, null);
                    object3 = xA12.p;
                    if (object3 != null) {
                        object3.startLoader();
                    }
                    object3 = new QueryCustomer();
                    bl4 = xA12.u;
                    if (bl4) {
                        object2 = xA12.v;
                        ((QueryCustomer)object3).setMobileNumber((String)object2);
                        ((QueryCustomer)object3).setMobileNumberEnterered(bl2 != 0);
                    } else {
                        string3 = xA12.v;
                        if (string3 != null) {
                            object4 = string3.toLowerCase();
                            string3 = "toLowerCase(...)";
                            Intrinsics.checkNotNullExpressionValue(object4, string3);
                        }
                        ((QueryCustomer)object3).setEmail((String)object4);
                        ((QueryCustomer)object3).setMobileNumberEnterered(false);
                    }
                    object2 = xA12.l;
                    Intrinsics.checkNotNull(object2);
                    string3 = "login - set password screen";
                    ((oa1_1)object2).b((QueryCustomer)object3, string3);
                }
            } else {
                int n8 = ((DataCallback)object3).getStatus();
                if (n8 == bl2) {
                    AnalyticsManager$Companion analyticsManager$Companion = AnalyticsManager.Companion;
                    GTMEvents gTMEvents = analyticsManager$Companion.getInstance().getGtmEvents();
                    String string4 = "Start shopping - Failure";
                    gTMEvents.pushButtonTapEvent((String)object6, string4, (String)object5);
                    object3 = ((DataCallback)object3).getError();
                    if (object3 != null) {
                        object4 = ((DataError)object3).getErrors();
                    }
                    if (object4 != null && (n3 = (object4 = ((DataError)object3).getErrors()).size()) > 0) {
                        String string5 = ((DataError$ErrorMessage)((DataError)object3).getErrors().get(0)).getMessage();
                        object3 = analyticsManager$Companion.getInstance().getGtmEvents();
                        cP.b("Error - ", string5, (GTMEvents)object3, (String)object6, (String)object5);
                        object3 = StringCompanionObject.INSTANCE;
                        int n10 = R$string.acc_error_message;
                        object3 = hv3_0.K(n10);
                        object4 = new Object[bl2];
                        object4[0] = string5;
                        Object object8 = Arrays.copyOf(object4, bl2);
                        object8 = String.format((String)object3, object8);
                        object3 = "format(...)";
                        Intrinsics.checkNotNullExpressionValue(object8, (String)object3);
                        Intrinsics.checkNotNull(string5);
                        hv3_0.o0(0, string5, (String)object8);
                        object2 = xA12.j;
                        if (object2 != null) {
                            ((TextInputLayout)((Object)object2)).setError(string5);
                        }
                        object2 = analyticsManager$Companion.getInstance();
                        gTMEvents = ((AnalyticsManager)object2).getGtmEvents();
                        string4 = "formErrorEvent";
                        String string6 = "Login Form";
                        String string7 = "login - set password screen";
                        int n14 = 112;
                        GTMEvents.gtmEventsToGa$default(gTMEvents, string4, string6, string5, string7, null, null, null, n14, null);
                    }
                }
            }
        }
    }
}

