/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.data.repo;

import com.ajio.ril.core.network.model.DataError;
import com.ajio.ril.core.network.model.DataError$ErrorMessage;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import com.ril.ajio.R$string;
import com.ril.ajio.analytics.events.ServiceErrorEventTracker;
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.data.repo.DataCallback$Companion;
import com.ril.ajio.kmm.shared.model.BaseResponse;
import com.ril.ajio.kmm.shared.model.Status;
import com.ril.ajio.kmm.shared.model.StatusInfo;
import com.ril.ajio.services.utils.JsonUtils;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

public final class ApiErrorRepo {
    public static final int $stable;
    public static final ApiErrorRepo INSTANCE;
    private static final ServiceErrorEventTracker serviceErrorEventTracker;

    static {
        ApiErrorRepo apiErrorRepo;
        INSTANCE = apiErrorRepo = new ApiErrorRepo();
        serviceErrorEventTracker = ServiceErrorEventTracker.INSTANCE;
        $stable = 8;
    }

    private ApiErrorRepo() {
    }

    private final String checkAndGetMessageFromStackTrace(Throwable object) {
        if ((object = object.getStackTrace()) != null) {
            Object object2;
            int n3 = ((StackTraceElement[])object).length;
            int n4 = 1;
            if (n3 == 0) {
                n3 = 1;
            } else {
                n3 = 0;
                object2 = null;
            }
            if ((n3 ^= n4) != 0 && (object2 = tp_2.z(object)) != null) {
                object = ((StackTraceElement)tp_2.z(object)).toString();
                Intrinsics.checkNotNullExpressionValue(object, "toString(...)");
                return object;
            }
        }
        return "Throwable message and stack trace is empty";
    }

    /*
     * WARNING - void declaration
     */
    public static /* synthetic */ DataError getApiError$default(ApiErrorRepo apiErrorRepo, dl2_2 dl2_22, String string2, boolean bl2, String string3, String string4, int n3, Object object) {
        void var5_8;
        void var4_7;
        boolean bl3;
        void var6_9;
        int n4 = var6_9 & 4;
        if (n4 != 0) {
            boolean bl4 = false;
            bl3 = false;
        } else {
            bl3 = bl2;
        }
        int n7 = var6_9 & 8;
        String string5 = "";
        Object object2 = n7 != 0 ? string5 : var4_7;
        int n8 = var6_9 & 0x10;
        Object object3 = n8 != 0 ? string5 : var5_8;
        return apiErrorRepo.getApiError(dl2_22, string2, bl3, (String)object2, (String)object3);
    }

    private final String getThrowableStackTraceMessage(Throwable throwable, String string2) {
        this.logNonFatalExceptionInFirebase(throwable, string2);
        string2 = throwable.getMessage();
        if (string2 != null) {
            int n3 = string2.length();
            if (n3 <= 0) {
                string2 = INSTANCE.checkAndGetMessageFromStackTrace(throwable);
            }
            return string2;
        }
        return this.checkAndGetMessageFromStackTrace(throwable);
    }

    /*
     * WARNING - void declaration
     */
    public static /* synthetic */ DataCallback handleApiError$default(ApiErrorRepo apiErrorRepo, dl2_2 dl2_22, String string2, boolean bl2, String string3, String string4, int n3, Object object) {
        void var5_8;
        void var4_7;
        boolean bl3;
        void var6_9;
        int n4 = var6_9 & 4;
        if (n4 != 0) {
            boolean bl4 = false;
            bl3 = false;
        } else {
            bl3 = bl2;
        }
        int n7 = var6_9 & 8;
        String string5 = "";
        Object object2 = n7 != 0 ? string5 : var4_7;
        int n8 = var6_9 & 0x10;
        Object object3 = n8 != 0 ? string5 : var5_8;
        return apiErrorRepo.handleApiError(dl2_22, string2, bl3, (String)object2, (String)object3);
    }

    /*
     * WARNING - void declaration
     */
    public static /* synthetic */ DataCallback handleApiError$default(ApiErrorRepo apiErrorRepo, String string2, dl2_2 dl2_22, String string3, boolean bl2, String string4, String string5, int n3, Object object) {
        void var6_9;
        void var5_8;
        boolean bl3;
        void var7_10;
        int n4 = var7_10 & 8;
        if (n4 != 0) {
            boolean bl4 = false;
            bl3 = false;
        } else {
            bl3 = bl2;
        }
        int n7 = var7_10 & 0x10;
        String string6 = "";
        Object object2 = n7 != 0 ? string6 : var5_8;
        int n8 = var7_10 & 0x20;
        Object object3 = n8 != 0 ? string6 : var6_9;
        return apiErrorRepo.handleApiError(string2, dl2_22, string3, bl3, (String)object2, (String)object3);
    }

    /*
     * WARNING - void declaration
     */
    public static /* synthetic */ DataCallback handleApiException$default(ApiErrorRepo apiErrorRepo, Throwable throwable, String string2, boolean bl2, String string3, String string4, int n3, Object object) {
        void var5_8;
        void var4_7;
        boolean bl3;
        void var6_9;
        int n4 = var6_9 & 4;
        if (n4 != 0) {
            boolean bl4 = false;
            bl3 = false;
        } else {
            bl3 = bl2;
        }
        int n7 = var6_9 & 8;
        String string5 = "";
        Object object2 = n7 != 0 ? string5 : var4_7;
        int n8 = var6_9 & 0x10;
        Object object3 = n8 != 0 ? string5 : var5_8;
        return apiErrorRepo.handleApiException(throwable, string2, bl3, (String)object2, (String)object3);
    }

    public static /* synthetic */ DataError logApiError$default(ApiErrorRepo apiErrorRepo, String string2, dl2_2 dl2_22, String string3, boolean bl2, String string4, String string5, int n3, Object object) {
        int n4 = n3 & 0x10;
        String string6 = "";
        String string7 = n4 != 0 ? string6 : string4;
        n4 = n3 & 0x20;
        String string8 = n4 != 0 ? string6 : string5;
        return apiErrorRepo.logApiError(string2, dl2_22, string3, bl2, string7, string8);
    }

    public static /* synthetic */ void logApiErrorKMM$default(ApiErrorRepo apiErrorRepo, BaseResponse baseResponse, String string2, boolean bl2, String string3, String string4, int n3, Object object) {
        int n4 = n3 & 8;
        String string5 = "";
        String string6 = n4 != 0 ? string5 : string3;
        int n7 = n3 & 0x10;
        String string7 = n7 != 0 ? string5 : string4;
        apiErrorRepo.logApiErrorKMM(baseResponse, string2, bl2, string6, string7);
    }

    public static /* synthetic */ DataError logApiException$default(ApiErrorRepo apiErrorRepo, Throwable throwable, String string2, boolean bl2, String string3, String string4, int n3, Object object) {
        int n4 = n3 & 8;
        String string5 = "";
        String string6 = n4 != 0 ? string5 : string3;
        int n7 = n3 & 0x10;
        String string7 = n7 != 0 ? string5 : string4;
        return apiErrorRepo.logApiException(throwable, string2, bl2, string6, string7);
    }

    private final void logNonFatalExceptionInFirebase(String string2, String string3) {
        FirebaseCrashlytics firebaseCrashlytics = FirebaseCrashlytics.getInstance();
        string2 = UX.c("HANDLED_API_EXCEPTION - ", string3, " - ", string2);
        Exception exception = new Exception(string2);
        firebaseCrashlytics.recordException(exception);
    }

    private final void logNonFatalExceptionInFirebase(Throwable throwable, String string2) {
        FirebaseCrashlytics firebaseCrashlytics = FirebaseCrashlytics.getInstance();
        string2 = kp1_0.c("HANDLED_API_EXCEPTION - ", string2);
        Exception exception = new Exception(string2, throwable);
        firebaseCrashlytics.recordException(exception);
    }

    public static /* synthetic */ void logServiceErrorEvent$default(ApiErrorRepo apiErrorRepo, String string2, String string3, int n3, DataError dataError, boolean bl2, String string4, String string5, int n4, Object object) {
        DataError dataError2;
        int n7 = n4 & 8;
        if (n7 != 0) {
            n7 = 0;
            dataError2 = null;
        } else {
            dataError2 = dataError;
        }
        n7 = n4 & 0x20;
        Object object2 = "";
        Object object3 = n7 != 0 ? object2 : string4;
        n7 = n4 & 0x40;
        Object object4 = n7 != 0 ? object2 : string5;
        object2 = apiErrorRepo;
        apiErrorRepo.logServiceErrorEvent(string2, string3, n3, dataError2, bl2, (String)object3, (String)object4);
    }

    private final String parseApiError(dl2_2 object) {
        Object object2 = ((dl2_2)object).a;
        boolean bl2 = ((cl2_2)object2).d();
        Object[] objectArray = null;
        if (bl2) {
            int n3 = R$string.something_wrong_msg;
            object = hv3_0.K(n3);
            object2 = yn3_0.a;
            String string2 = "Data not present";
            objectArray = new Object[]{};
            ((yn3$a)object2).a(string2, objectArray);
        } else {
            object = ((dl2_2)object).c;
            if (object != null) {
                object = ((il2_2)object).k();
            } else {
                boolean bl3 = false;
                object = null;
            }
            object2 = yn3_0.a;
            String string3 = kp1_0.c("ErrorBody: ", (String)object);
            objectArray = new Object[]{};
            ((yn3$a)object2).d(string3, objectArray);
        }
        return object;
    }

    public final DataError getApiError(dl2_2 dl2_22, String string2, boolean bl2, String string3, String string4) {
        Intrinsics.checkNotNullParameter(dl2_22, "resp");
        Intrinsics.checkNotNullParameter(string2, "requestId");
        Intrinsics.checkNotNullParameter(string4, "flowType");
        String string5 = this.parseApiError(dl2_22);
        return this.logApiError(string5, dl2_22, string2, bl2, string3, string4);
    }

    public final DataCallback handleApiError(dl2_2 dl2_22, String string2, boolean bl2, String string3, String string4) {
        Intrinsics.checkNotNullParameter(dl2_22, "resp");
        Intrinsics.checkNotNullParameter(string2, "requestId");
        Intrinsics.checkNotNullParameter(string4, "flowType");
        String string5 = this.parseApiError(dl2_22);
        return this.handleApiError(string5, dl2_22, string2, bl2, string3, string4);
    }

    public final DataCallback handleApiError(String object, dl2_2 dl2_22, String string2, boolean bl2, String string3, String string4) {
        Intrinsics.checkNotNullParameter(dl2_22, "resp");
        Intrinsics.checkNotNullParameter(string2, "requestId");
        Intrinsics.checkNotNullParameter(string4, "flowType");
        DataCallback$Companion dataCallback$Companion = DataCallback.Companion;
        object = this.logApiError((String)object, dl2_22, string2, bl2, string3, string4);
        return dataCallback$Companion.onFailed((DataError)object);
    }

    public final DataCallback handleApiException(Throwable serializable, String string2, boolean bl2, String string3, String string4) {
        Intrinsics.checkNotNullParameter(serializable, "throwable");
        Intrinsics.checkNotNullParameter(string2, "requestID");
        Intrinsics.checkNotNullParameter(string4, "flowType");
        DataCallback$Companion dataCallback$Companion = DataCallback.Companion;
        serializable = this.logApiException((Throwable)serializable, string2, bl2, string3, string4);
        return dataCallback$Companion.onFailed((DataError)serializable);
    }

    /*
     * Enabled aggressive block sorting
     */
    public final DataError logApiError(String string2, dl2_2 dl2_22, String string3, boolean bl2, String string4, String string5) {
        boolean bl3;
        Object object;
        int n3;
        Object[] objectArray;
        Object object2;
        Object object3;
        Object object4;
        Object object5;
        block8: {
            block7: {
                object5 = string2;
                object4 = dl2_22;
                Intrinsics.checkNotNullParameter(dl2_22, "resp");
                Intrinsics.checkNotNullParameter(string3, "requestId");
                Intrinsics.checkNotNullParameter(string5, "flowType");
                object3 = (DataError)JsonUtils.fromJson(string2, DataError.class);
                object2 = "getMessage(...)";
                if (object3 == null) break block7;
                objectArray = ((DataError)object3).getErrorMessage().getMessage();
                Intrinsics.checkNotNullExpressionValue(objectArray, (String)object2);
                n3 = objectArray.length();
                if (n3 != 0) break block8;
            }
            object3 = new DataError();
            objectArray = new DataError$ErrorMessage();
            if (object5 != null) {
                int n4;
                int n7 = string2.length();
                if (n7 > (n4 = 250)) {
                    n7 = 250;
                }
                object5 = string2.substring(0, n7);
                object = "substring(...)";
                Intrinsics.checkNotNullExpressionValue(object5, (String)object);
            } else {
                bl3 = false;
                object5 = null;
            }
            object = new StringBuilder("error body is null | ");
            ((StringBuilder)object).append((String)object5);
            object5 = ((StringBuilder)object).toString();
            objectArray.setMessage((String)object5);
            object = new ArrayList();
            ((DataError)object3).errors = object;
            ((ArrayList)object).add(objectArray);
            this.logNonFatalExceptionInFirebase((String)object5, string3);
        }
        DataError dataError = object3;
        object5 = yn3_0.a;
        object3 = ((DataError)object3).getErrorMessage().getMessage();
        objectArray = new Object[]{};
        ((yn3$a)object5).d((String)object3, objectArray);
        object3 = dataError.getErrorMessage().getMessage();
        Intrinsics.checkNotNullExpressionValue(object3, (String)object2);
        int n8 = ((dl2_2)object4).a.d;
        object5 = this;
        object4 = string3;
        object2 = dataError;
        n3 = (int)(bl2 ? 1 : 0);
        object = string4;
        this.logServiceErrorEvent(string3, (String)object3, n8, dataError, bl2, string4, string5);
        object5 = dataError.getErrorMessage();
        if (object5 != null && (object5 = ((DataError$ErrorMessage)object5).getMessage()) != null && (bl3 = StringsKt.F((CharSequence)object5, (CharSequence)(object4 = "error body is null"), false)) && (object5 = dataError.getErrorMessage()) != null) {
            int n10 = R$string.something_went_wrong_text;
            object4 = hv3_0.K(n10);
            ((DataError$ErrorMessage)object5).setMessage((String)object4);
        }
        return dataError;
    }

    public final void logApiErrorKMM(BaseResponse object, String string2, boolean bl2, String string3, String string4) {
        int n3;
        int n4;
        Intrinsics.checkNotNullParameter(object, "baseResponse");
        Intrinsics.checkNotNullParameter(string2, "requestId");
        Intrinsics.checkNotNullParameter(string4, "flowType");
        Object object2 = ((BaseResponse)object).getStatusInfo();
        Object object3 = "error body is null";
        if (object2 != null && (object2 = ((StatusInfo)object2).getStatus()) != null && (object2 = ((Status)object2).getMessageDescription()) != null && (n4 = object2.length()) != 0) {
            object3 = object2;
        }
        String string5 = object3;
        if ((object = ((BaseResponse)object).getStatusInfo()) != null) {
            int n7;
            n3 = n7 = ((StatusInfo)object).getHttpStatusCode();
        } else {
            boolean bl3 = false;
            object = null;
            n3 = 0;
        }
        this.logServiceErrorEvent(string2, string5, n3, null, bl2, string3, string4);
    }

    public final DataError logApiException(Throwable throwable, String string2, boolean bl2, String string3, String string4) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        Intrinsics.checkNotNullParameter(string2, "requestID");
        Intrinsics.checkNotNullParameter(string4, "flowType");
        yn3_0.a.e(throwable);
        DataError dataError = new DataError();
        Object object = new DataError$ErrorMessage();
        Object object2 = new ArrayList();
        dataError.errors = object2;
        object2.add(object);
        object2 = this.getThrowableStackTraceMessage(throwable, string2);
        object = this;
        ApiErrorRepo.logServiceErrorEvent$default(this, string2, (String)object2, 0, null, bl2, string3, string4, 8, null);
        return dataError;
    }

    public final void logServiceErrorEvent(String string2, String string3, int n3, DataError dataError, boolean bl2, String string4, String string5) {
        Intrinsics.checkNotNullParameter(string2, "requestID");
        Intrinsics.checkNotNullParameter(string3, "errorMessage");
        Object object = "flowType";
        Intrinsics.checkNotNullParameter(string5, (String)object);
        if (n3 == 0) {
            this.logNonFatalExceptionInFirebase(string3, string2);
        }
        object = serviceErrorEventTracker;
        Boolean bl3 = bl2;
        ((ServiceErrorEventTracker)object).trackServiceErrorEvent(string2, string3, n3, dataError, bl3, string4, string5);
    }
}

