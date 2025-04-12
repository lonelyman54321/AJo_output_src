/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.ContextWrapper
 *  android.os.Bundle
 */
package com.ril.ajio.analytics.events;

import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import com.ajio.ril.core.network.model.DataError;
import com.ajio.ril.core.network.model.DataError$ErrorMessage;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import com.ril.ajio.analytics.AnalyticsEventReporterImpl;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.AnalyticsManager$Companion;
import com.ril.ajio.analytics.events.NewCustomEventsRevamp;
import com.ril.ajio.analytics.events.NewEEcommerceEventsRevamp;
import com.ril.ajio.services.NetworkAnalyticsManager.GoogleAnalyticsEvents;
import com.ril.ajio.services.data.user.UserInformation;
import com.ril.ajio.services.network.data.ResponseError;
import com.ril.ajio.services.utils.JsonUtils;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.b;

public final class ServiceErrorEventTracker {
    public static final int $stable;
    public static final ServiceErrorEventTracker INSTANCE;
    private static final com.ril.ajio.services.NetworkAnalyticsManager.AnalyticsManager analyticsManager;
    private static final xe analyticsReporter;
    private static final B40 configProvider;
    private static final NewCustomEventsRevamp newCustomEventsRevamp;
    private static final NewEEcommerceEventsRevamp newEEcommerceEventsRevamp;
    private static final UserInformation userInformation;

    static {
        Object object = new ServiceErrorEventTracker();
        INSTANCE = object;
        object = z40_0.Companion;
        configProvider = Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)object).a;
        object = com.ril.ajio.services.NetworkAnalyticsManager.AnalyticsManager.Companion;
        AJIOApplication aJIOApplication = AJIOApplication$a.a();
        analyticsManager = ((com.ril.ajio.services.NetworkAnalyticsManager.AnalyticsManager$Companion)object).getInstance((Context)aJIOApplication);
        analyticsReporter = AnalyticsEventReporterImpl.Companion.getInstance();
        userInformation = UserInformation.getInstance((Context)AJIOApplication$a.a());
        object = AnalyticsManager.Companion;
        newCustomEventsRevamp = ((AnalyticsManager$Companion)object).getInstance().getNewCustomEventsRevamp();
        newEEcommerceEventsRevamp = ((AnalyticsManager$Companion)object).getInstance().getNewEEcommerceEventsRevamp();
        $stable = 8;
    }

    private ServiceErrorEventTracker() {
    }

    private final boolean checkIfCartError(DataError object) {
        boolean bl2;
        block7: {
            block6: {
                boolean bl3;
                boolean bl4;
                Object object2;
                String string2 = null;
                if (object != null && (object2 = ((DataError)object).getErrorMessage()) != null) {
                    object2 = ((DataError$ErrorMessage)object2).getSubjectType();
                } else {
                    bl4 = false;
                    object2 = null;
                }
                String string3 = "cart";
                bl2 = true;
                bl4 = b.i((String)object2, string3, bl2);
                if (!bl4) break block6;
                if (object != null && (object = ((DataError)object).getErrorMessage()) != null) {
                    string2 = ((DataError$ErrorMessage)object).getReason();
                }
                if (bl3 = b.i(string2, (String)(object = "notFound"), bl2)) break block7;
            }
            bl2 = false;
        }
        return bl2;
    }

    /*
     * Enabled aggressive block sorting
     */
    private final String getErrorType(int n3) {
        if (n3 == 0) {
            return "Timeout or Network Error";
        }
        int n4 = 200;
        if (n4 <= n3 && n3 < (n4 = 300)) {
            return "Successful response";
        }
        n4 = 400;
        if (n3 == n4) {
            return "Validation Error";
        }
        int n7 = 401;
        if (n3 == n7) {
            return "Token expired";
        }
        n7 = 500;
        if (n4 <= n3 && n3 < n7) {
            return "Other 400 Error";
        }
        String string2 = "Service not available";
        if (n3 == n7) return string2;
        int n8 = 503;
        if (n3 == n8) {
            return string2;
        }
        if (n7 > n3) return "NA";
        n4 = 600;
        if (n3 >= n4) return "NA";
        return "Other 500 Error";
    }

    private final void logCartErrorEvents(String object, String object2, String string2) {
        Object[] objectArray = ap_0.a;
        objectArray = ap_0.c;
        Object object3 = ap_0.a;
        String string3 = ((UserInformation)object3).getGuId();
        object3 = ((UserInformation)object3).getCartGuId();
        boolean bl2 = userInformation.isUserOnline();
        object = og_1.a("requestID: ", (String)object, ", errorType: ", (String)object2, ", errorMsg: ");
        X50.a((StringBuilder)object, string2, ", cartId: ", (String)objectArray, ", guID: ");
        X50.a((StringBuilder)object, string3, ", cartGUID: ", (String)object3, ", isUserOnline: ");
        ((StringBuilder)object).append(bl2);
        object = ((StringBuilder)object).toString();
        object2 = yn3_0.a;
        string2 = kp1_0.c("CartError: ", (String)object);
        objectArray = new Object[]{};
        ((yn3$a)object2).d(string2, objectArray);
        FirebaseCrashlytics.getInstance().log((String)object);
        object = FirebaseCrashlytics.getInstance();
        object2 = new Exception("CartError");
        ((FirebaseCrashlytics)object).recordException((Throwable)object2);
    }

    public static /* synthetic */ void trackPaymentServiceErrorEvents$default(ServiceErrorEventTracker serviceErrorEventTracker, String string2, String string3, String string4, int n3, Boolean bl2, String string5, String string6, int n4, Object object) {
        Boolean bl3;
        int n7 = n4 & 0x10;
        if (n7 != 0) {
            n7 = 0;
            bl3 = null;
        } else {
            bl3 = bl2;
        }
        n7 = n4 & 0x20;
        Object object2 = "";
        Object object3 = n7 != 0 ? object2 : string5;
        n7 = n4 & 0x40;
        Object object4 = n7 != 0 ? object2 : string6;
        object2 = serviceErrorEventTracker;
        serviceErrorEventTracker.trackPaymentServiceErrorEvents(string2, string3, string4, n3, bl3, (String)object3, (String)object4);
    }

    public static /* synthetic */ void trackServiceErrorEvent$default(ServiceErrorEventTracker serviceErrorEventTracker, String string2, String string3, int n3, DataError dataError, Boolean bl2, String string4, String string5, int n4, Object object) {
        int n7 = n4 & 8;
        String string6 = null;
        DataError dataError2 = n7 != 0 ? null : dataError;
        n7 = n4 & 0x10;
        Boolean bl3 = n7 != 0 ? null : bl2;
        n7 = n4 & 0x20;
        string6 = "";
        String string7 = n7 != 0 ? string6 : string4;
        n7 = n4 & 0x40;
        String string8 = n7 != 0 ? string6 : string5;
        serviceErrorEventTracker.trackServiceErrorEvent(string2, string3, n3, dataError2, bl3, string7, string8);
    }

    public final void trackPaymentServiceErrorEvents(String string2, String string3, String string4, int n3, Boolean bl2, String string5, String string6) {
        int n4;
        ServiceErrorEventTracker serviceErrorEventTracker = this;
        Object object = string3;
        String string7 = string4;
        int n7 = n3;
        Object object2 = string6;
        String string8 = string2;
        Intrinsics.checkNotNullParameter(string2, "requestID");
        Intrinsics.checkNotNullParameter(string3, "originalErrorMessage");
        Bundle bundle = dm_1.a(string4, "errorMessage", string6, "flowType");
        String string9 = String.valueOf(n3);
        bundle.putString("status_code", string9);
        bundle.putString("error_message", string3);
        AJIOApplication.Companion.getClass();
        object = vV1.c((Context)AJIOApplication$a.a());
        bundle.putString("network_type", (String)object);
        object = "error_type";
        String string10 = this.getErrorType(n3);
        bundle.putString((String)object, string10);
        if (bl2 != null) {
            object = "is_blocking";
            boolean bl3 = bl2;
            bundle.putBoolean((String)object, bl3);
        }
        if ((n4 = string6.length()) > 0) {
            object = "flow_type";
            bundle.putString((String)object, (String)object2);
        }
        object = analyticsManager.getGa();
        String string11 = "";
        string9 = string5 == null ? string11 : string5;
        xe xe2 = analyticsReporter;
        string10 = string2;
        string8 = string4;
        ((GoogleAnalyticsEvents)object).pushServiceErrorEvents("serviceErrorEvent", string2, string4, string9, n3, xe2, bundle);
        object = dk0.a(n7, "error_status_code");
        object2 = newEEcommerceEventsRevamp;
        string10 = ((NewEEcommerceEventsRevamp)object2).getNETWORK_TYPE();
        string8 = vV1.d((ContextWrapper)AJIOApplication$a.a());
        object.putString(string10, string8);
        string10 = serviceErrorEventTracker.getErrorType(n7);
        NewCustomEventsRevamp newCustomEventsRevamp = ServiceErrorEventTracker.newCustomEventsRevamp;
        String string12 = newCustomEventsRevamp.getEC_ERRORS();
        string8 = " - ";
        String string13 = n1.a(string10, string8, string7);
        String string14 = string5 == null ? string11 : string5;
        String string15 = string5 == null ? string11 : string5;
        String string16 = ((NewEEcommerceEventsRevamp)object2).getPrevScreen();
        String string17 = ((NewEEcommerceEventsRevamp)object2).getPrevScreenType();
        NewCustomEventsRevamp.newPushCustomEvent$default(newCustomEventsRevamp, string12, "service error", string13, "service_error", string14, string15, string16, (Bundle)object, string17, false, null, 1536, null);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void trackServiceErrorEvent(String string2, String string3, int n3, DataError dataError, Boolean bl2, String string4, String string5) {
        int n4;
        Object object;
        int n7;
        String string6;
        String string7;
        String string8;
        String string9;
        Object object2;
        String string10;
        int n8;
        Object object3;
        Object object4;
        DataError dataError2;
        int n10;
        Object object5;
        String string11;
        ServiceErrorEventTracker serviceErrorEventTracker;
        block14: {
            block15: {
                block10: {
                    block11: {
                        int n14;
                        block12: {
                            block13: {
                                serviceErrorEventTracker = this;
                                string11 = string2;
                                object5 = string3;
                                n10 = n3;
                                dataError2 = dataError;
                                object4 = string5;
                                Intrinsics.checkNotNullParameter(string2, "requestID");
                                Intrinsics.checkNotNullParameter(string3, "errorMessage");
                                object3 = "flowType";
                                Intrinsics.checkNotNullParameter(string5, (String)object3);
                                n8 = 500;
                                string10 = " ";
                                object2 = " statusCode:";
                                string9 = "NetworkStatus:";
                                string8 = "";
                                string7 = null;
                                if (n8 > n3 || n3 >= (n8 = 600) || dataError == null || (object3 = dataError.getErrorMessage().getLogMessage()) == null || (n8 = ((String)object3).length()) == 0) break block13;
                                AJIOApplication.Companion.getClass();
                                object3 = vV1.c((Context)AJIOApplication$a.a());
                                object5 = dataError.getErrorMessage().getLogMessage();
                                object3 = oe3_0.a(n3, string9, (String)object3, (String)object2, string10);
                                ((StringBuilder)object3).append((String)object5);
                                object3 = ((StringBuilder)object3).toString();
                                object5 = dataError.getErrorMessage().getLogMessage();
                                string6 = object5;
                                n7 = n3;
                                break block14;
                            }
                            n8 = 1000;
                            if (n10 <= n8) break block10;
                            object3 = ResponseError.class;
                            try {
                                object3 = JsonUtils.fromJson((String)object5, (Class)object3);
                                object3 = (ResponseError)object3;
                                if (object3 == null) break block10;
                                n7 = ((ResponseError)object3).getRespCode();
                            }
                            catch (Exception exception) {
                                n7 = n10;
                                break block11;
                            }
                            try {
                                object = ((ResponseError)object3).getExceptionMsg();
                                if (object == null || (n14 = ((String)object).length()) == 0 || (object5 = ((ResponseError)object3).getExceptionMsg()) != null) break block12;
                                object5 = string8;
                            }
                            catch (Exception exception) {
                                break block11;
                            }
                        }
                        if ((object = ((ResponseError)object3).getSupportId()) != null && (n14 = ((String)object).length()) != 0) {
                            object = new StringBuilder();
                            ((StringBuilder)object).append(object5);
                            string6 = " supportID";
                            ((StringBuilder)object).append(string6);
                            object5 = ((StringBuilder)object).toString();
                            string7 = ((ResponseError)object3).getSupportId();
                        }
                        break block15;
                    }
                    object = yn3_0.a;
                    ((yn3$a)object).e((Throwable)object3);
                    break block15;
                }
                n7 = n10;
            }
            AJIOApplication.Companion.getClass();
            object3 = vV1.c((Context)AJIOApplication$a.a());
            object3 = oe3_0.a(n7, string9, (String)object3, (String)object2, string10);
            ((StringBuilder)object3).append(object5);
            object3 = ((StringBuilder)object3).toString();
            string6 = object5;
        }
        object = new Bundle();
        object5 = "status_code";
        string10 = String.valueOf(n7);
        object.putString((String)object5, string10);
        if (string7 != null && (n4 = string7.length()) != 0) {
            object5 = new StringBuilder();
            ((StringBuilder)object5).append((Object)string6);
            string10 = ": ";
            ((StringBuilder)object5).append(string10);
            ((StringBuilder)object5).append((Object)string7);
            object5 = ((StringBuilder)object5).toString();
        } else {
            object5 = string6;
        }
        object.putString("error_message", (String)object5);
        AJIOApplication.Companion.getClass();
        object5 = vV1.c((Context)AJIOApplication$a.a());
        string10 = "network_type";
        object.putString(string10, (String)object5);
        String string12 = serviceErrorEventTracker.getErrorType(n7);
        object5 = "error_type";
        object.putString((String)object5, string12);
        if (bl2 != null) {
            object5 = "is_blocking";
            boolean bl3 = bl2;
            object.putBoolean((String)object5, bl3);
        }
        if ((n4 = string5.length()) > 0) {
            object5 = "flow_type";
            object.putString((String)object5, (String)object4);
        }
        object5 = analyticsManager.getGa();
        string9 = string4 == null ? string8 : string4;
        xe xe2 = analyticsReporter;
        string10 = string2;
        object2 = object3;
        ((GoogleAnalyticsEvents)object5).pushServiceErrorEvents("serviceErrorEvent", string2, (String)object3, string9, n3, xe2, (Bundle)object);
        object5 = dk0.a(n10, "error_status_code");
        object4 = newEEcommerceEventsRevamp;
        string10 = ((NewEEcommerceEventsRevamp)object4).getNETWORK_TYPE();
        object2 = vV1.d((ContextWrapper)AJIOApplication$a.a());
        object5.putString(string10, (String)object2);
        NewCustomEventsRevamp newCustomEventsRevamp = ServiceErrorEventTracker.newCustomEventsRevamp;
        String string13 = newCustomEventsRevamp.getEC_ERRORS();
        string10 = " - ";
        String string14 = n1.a(string12, string10, (String)object3);
        String string15 = string4 == null ? string8 : string4;
        String string16 = string4 == null ? string8 : string4;
        String string17 = ((NewEEcommerceEventsRevamp)object4).getPrevScreen();
        String string18 = ((NewEEcommerceEventsRevamp)object4).getPrevScreenType();
        String string19 = "service error";
        String string20 = "service_error";
        int n15 = 1536;
        NewCustomEventsRevamp.newPushCustomEvent$default(newCustomEventsRevamp, string13, string19, string14, string20, string15, string16, string17, (Bundle)object5, string18, false, null, n15, null);
        n8 = (int)(serviceErrorEventTracker.checkIfCartError(dataError2) ? 1 : 0);
        if (n8 != 0) {
            serviceErrorEventTracker.logCartErrorEvents(string11, string12, string6);
        }
    }

    public final void trackUTMServiceErrorEvent(String string2, int n3, String string3, float f5) {
        String string4 = string3;
        Bundle bundle = dm_1.a(string2, "action", string3, "requestType");
        Object object = String.valueOf(n3);
        bundle.putString("status_code", (String)object);
        bundle.putString("error_message", string2);
        AJIOApplication.Companion.getClass();
        Object object2 = vV1.c((Context)AJIOApplication$a.a());
        bundle.putString("network_type", (String)object2);
        bundle.putFloat("request_time", f5);
        bundle.putString("request_type", string3);
        object2 = configProvider;
        object = "android_service_error_events_screen_name_shown";
        boolean bl2 = object2.a((String)object);
        String string5 = " - ";
        String string6 = "error_status_code";
        if (bl2) {
            object2 = analyticsManager.getGa();
            xe xe2 = analyticsReporter;
            String string7 = string2;
            String string8 = string2;
            ((GoogleAnalyticsEvents)object2).pushServiceErrorEvents("serviceErrorEvent", string2, string3, string2, n3, xe2, bundle);
            object2 = dk0.a(n3, string6);
            object = newEEcommerceEventsRevamp;
            string7 = ((NewEEcommerceEventsRevamp)object).getNETWORK_TYPE();
            string4 = vV1.d((ContextWrapper)AJIOApplication$a.a());
            object2.putString(string7, string4);
            string7 = this.getErrorType(n3);
            NewCustomEventsRevamp newCustomEventsRevamp = ServiceErrorEventTracker.newCustomEventsRevamp;
            String string9 = newCustomEventsRevamp.getEC_ERRORS();
            String string10 = n1.a(string7, string5, string2);
            String string11 = ((NewEEcommerceEventsRevamp)object).getPrevScreen();
            String string12 = ((NewEEcommerceEventsRevamp)object).getPrevScreenType();
            String string13 = "service error";
            String string14 = "service_error";
            String string15 = "splash scree";
            String string16 = "splash screen";
            int n4 = 1536;
            NewCustomEventsRevamp.newPushCustomEvent$default(newCustomEventsRevamp, string9, string13, string10, string14, string15, string16, string11, (Bundle)object2, string12, false, null, n4, null);
        } else {
            object2 = analyticsManager.getGa();
            xe xe3 = analyticsReporter;
            String string17 = "";
            String string18 = string2;
            ((GoogleAnalyticsEvents)object2).pushServiceErrorEvents("serviceErrorEvent", string2, string3, string17, n3, xe3, bundle);
            object2 = dk0.a(n3, string6);
            object = newEEcommerceEventsRevamp;
            string18 = ((NewEEcommerceEventsRevamp)object).getNETWORK_TYPE();
            string4 = vV1.d((ContextWrapper)AJIOApplication$a.a());
            object2.putString(string18, string4);
            string18 = this.getErrorType(n3);
            NewCustomEventsRevamp newCustomEventsRevamp = ServiceErrorEventTracker.newCustomEventsRevamp;
            String string19 = newCustomEventsRevamp.getEC_ERRORS();
            String string20 = n1.a(string18, string5, string2);
            String string21 = ((NewEEcommerceEventsRevamp)object).getPrevScreen();
            String string22 = ((NewEEcommerceEventsRevamp)object).getPrevScreenType();
            String string23 = "service error";
            String string24 = "service_error";
            String string25 = "splash scree";
            String string26 = "splash screen";
            int n7 = 1536;
            NewCustomEventsRevamp.newPushCustomEvent$default(newCustomEventsRevamp, string19, string23, string20, string24, string25, string26, string21, (Bundle)object2, string22, false, null, n7, null);
        }
    }
}

