/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Application
 *  android.content.ContentResolver
 *  android.content.Context
 *  android.provider.Settings$Secure
 *  android.text.TextUtils
 *  android.webkit.CookieManager
 */
package com.ril.ajio.data.repo;

import android.app.Application;
import android.content.ContentResolver;
import android.content.Context;
import android.provider.Settings;
import android.text.TextUtils;
import android.webkit.CookieManager;
import com.ajio.ril.core.network.model.DataError;
import com.ajio.ril.core.network.model.DataError$ErrorMessage;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.events.FirebaseEvents;
import com.ril.ajio.analytics.events.NewCustomEventsRevamp;
import com.ril.ajio.data.repo.ApiErrorRepo;
import com.ril.ajio.data.repo.BaseRepo;
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.data.repo.DataCallback$Companion;
import com.ril.ajio.data.repo.UserRepo$checkIfUserIsEarlyAccessMember$userCohortValueType$1;
import com.ril.ajio.data.repo.UserRepo$deleteAccount$$inlined$map$1;
import com.ril.ajio.data.repo.UserRepo$deleteAccount$1;
import com.ril.ajio.data.repo.UserRepo$updateUserProfileUaasFlow$1;
import com.ril.ajio.data.repo.UserRepo$updateUserProfileUaasFlow$2;
import com.ril.ajio.services.data.AccessProfileOtpResponse;
import com.ril.ajio.services.data.Cart.PanEncryptionItem;
import com.ril.ajio.services.data.DeleteAccountRequest;
import com.ril.ajio.services.data.Home.NavigationParent;
import com.ril.ajio.services.data.Login.CustomerType;
import com.ril.ajio.services.data.Login.CustomerType$UserCohortValue;
import com.ril.ajio.services.data.Login.MyAccountCancelRequest;
import com.ril.ajio.services.data.Login.OTPData;
import com.ril.ajio.services.data.SimpleStringData;
import com.ril.ajio.services.data.Status;
import com.ril.ajio.services.data.user.ChangeEmail;
import com.ril.ajio.services.data.user.GPSLocationData;
import com.ril.ajio.services.data.user.GPSResponse;
import com.ril.ajio.services.data.user.LocationResponse;
import com.ril.ajio.services.data.user.UserInformation;
import com.ril.ajio.services.data.user.UserProfileData;
import com.ril.ajio.services.helper.UrlHelper;
import com.ril.ajio.services.network.api.UserApi;
import com.ril.ajio.services.network.api.UserApi$DefaultImpls;
import com.ril.ajio.services.network.connector.AjioApiConnector;
import com.ril.ajio.services.query.QueryCustomer;
import com.ril.ajio.services.query.QueryProfile;
import com.ril.ajio.services.utils.ServiceUtil;
import io.reactivex.Scheduler;
import io.reactivex.android.schedulers.HandlerScheduler;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.b;

public final class UserRepo
implements BaseRepo {
    public static final int $stable = 8;
    private final jo_2 appPreferences;
    private final Application mContext;
    private final rq1_2 newCustomEventsRevamp$delegate;
    private final UserApi userApi;
    private final UserInformation userInformation;

    public UserRepo(Application application) {
        Intrinsics.checkNotNullParameter(application, "context");
        Object object = AjioApiConnector.INSTANCE.getUserApi();
        this.userApi = object;
        this.userInformation = object = UserInformation.getInstance((Context)application);
        this.appPreferences = object = new jo_2((Context)application);
        object = new fe1_0(1);
        this.newCustomEventsRevamp$delegate = object = yr1_2.b((Function0)object);
        this.mContext = application;
    }

    public static /* synthetic */ DataCallback A(dl2_2 dl2_22) {
        return UserRepo.verifyOtpAccessProfile$lambda$45("verify_otp_access_profile", dl2_22);
    }

    public static /* synthetic */ DataCallback B(UserRepo userRepo, String string2, Throwable throwable) {
        return UserRepo.getUserProfile$lambda$15(userRepo, string2, throwable);
    }

    public static /* synthetic */ DataCallback C(UserRepo userRepo, String string2, dl2_2 dl2_22) {
        return UserRepo.getCohortBasedOnDeviceId$lambda$16(userRepo, string2, dl2_22);
    }

    public static /* synthetic */ DataCallback D(Throwable throwable) {
        return UserRepo.getGpsData$lambda$53("BackGround_GET_GPS_DATA", throwable);
    }

    public static /* synthetic */ DataCallback E(px3_0 px3_02, Object object) {
        return UserRepo.verifyOtpAccessProfile$lambda$46(px3_02, object);
    }

    public static /* synthetic */ DataCallback F(UserRepo userRepo, String string2, Throwable throwable) {
        return UserRepo.getUserType$lambda$21(userRepo, string2, throwable);
    }

    public static /* synthetic */ DataCallback G(Throwable throwable) {
        return UserRepo.getGpsDataPd$lambda$56("BackGround_GET_GPS_DATA", throwable);
    }

    public static /* synthetic */ DataCallback H(dy3 dy32, Object object) {
        return UserRepo.updateUserProfileHybris$lambda$2(dy32, object);
    }

    public static /* synthetic */ DataCallback I(dl2_2 dl2_22) {
        return UserRepo.getGpsData$lambda$51("BackGround_GET_GPS_DATA", dl2_22);
    }

    public static /* synthetic */ DataCallback J(ux3_0 ux3_02, Object object) {
        return UserRepo.requestOtpMobileNumberUpdateUaas$lambda$31(ux3_02, object);
    }

    public static /* synthetic */ DataCallback K(Throwable throwable) {
        return UserRepo.validateSession$lambda$41("validateSession", throwable);
    }

    public static /* synthetic */ DataCallback L(UserRepo userRepo, String string2, Throwable throwable) {
        return UserRepo.getCohortBasedOnDeviceId$lambda$18(userRepo, string2, throwable);
    }

    public static /* synthetic */ DataCallback M(Throwable throwable) {
        return UserRepo.requestOtpVerifyRILEmplProfile$lambda$44("request_otp_ril_profile", throwable);
    }

    public static /* synthetic */ DataCallback N(ah0_0 ah0_02, Object object) {
        return UserRepo.getUserProfile$lambda$14(ah0_02, object);
    }

    public static /* synthetic */ DataCallback O(String string2, Throwable throwable) {
        return UserRepo.updateUserProfileHybris$lambda$3(string2, throwable);
    }

    public static /* synthetic */ DataCallback P(dl2_2 dl2_22) {
        return UserRepo.verifyRILEmployeeProfile$lambda$48("verify_otp_ril_profile", dl2_22);
    }

    public static /* synthetic */ DataCallback Q(Throwable throwable) {
        return UserRepo.requestOtpAccessProfile$lambda$38("request_otp_access_profile", throwable);
    }

    public static /* synthetic */ DataCallback R(dl2_2 dl2_22) {
        return UserRepo.getStaticLinks$lambda$23("MyAccountsStaticLink", dl2_22);
    }

    public static /* synthetic */ DataCallback S(UserRepo userRepo, String string2, dl2_2 dl2_22) {
        return UserRepo.getUserType$lambda$19(userRepo, string2, dl2_22);
    }

    public static /* synthetic */ DataCallback T(UserRepo userRepo, String string2, dl2_2 dl2_22) {
        return UserRepo.getUserProfile$lambda$13(userRepo, string2, dl2_22);
    }

    public static /* synthetic */ DataCallback U(UserRepo userRepo, dl2_2 dl2_22) {
        return UserRepo.logoutUser$lambda$10(userRepo, "Logout_user", dl2_22);
    }

    public static /* synthetic */ DataCallback V(ay3 ay32, Object object) {
        return UserRepo.getGpsData$lambda$52(ay32, object);
    }

    public static /* synthetic */ DataCallback W(zx3_0 zx3_02, Object object) {
        return UserRepo.getCohortBasedOnDeviceId$lambda$17(zx3_02, object);
    }

    public static /* synthetic */ DataCallback X(a72_0 a72_02, Object object) {
        return UserRepo.verifyRILEmployeeProfile$lambda$49(a72_02, object);
    }

    public static /* synthetic */ DataCallback Y(String string2, Throwable throwable) {
        return UserRepo.updateUserProfileUaasRequest$lambda$6(string2, throwable);
    }

    public static /* synthetic */ DataCallback Z(jy1_2 jy1_22, Object object) {
        return UserRepo.logoutUser$lambda$11(jy1_22, object);
    }

    public static /* synthetic */ DataCallback a(rx3_0 rx3_02, Object object) {
        return UserRepo.getUserType$lambda$20(rx3_02, object);
    }

    public static /* synthetic */ DataCallback a0(String string2, dl2_2 dl2_22) {
        return UserRepo.updateUserProfileUaas$lambda$7(string2, dl2_22);
    }

    public static final /* synthetic */ UserApi access$getUserApi$p(UserRepo userRepo) {
        return userRepo.userApi;
    }

    public static final /* synthetic */ UserInformation access$getUserInformation$p(UserRepo userRepo) {
        return userRepo.userInformation;
    }

    public static /* synthetic */ DataCallback b(Fx3 fx3, Object object) {
        return UserRepo.validateSession$lambda$40(fx3, object);
    }

    public static /* synthetic */ DataCallback b0(gg0_1 gg0_12, Object object) {
        return UserRepo.updateUserProfileUaas$lambda$8(gg0_12, object);
    }

    public static /* synthetic */ DataCallback c(dl2_2 dl2_22) {
        return UserRepo.getCancelRequest$lambda$27("MyAccountsCancelRequest", dl2_22);
    }

    public static /* synthetic */ DataCallback c0(dl2_2 dl2_22) {
        return UserRepo.getGpsDataPd$lambda$54("BackGround_GET_GPS_DATA", dl2_22);
    }

    private final void checkIfUserIsEarlyAccessMember(String object) {
        Object object2 = new UserRepo$checkIfUserIsEarlyAccessMember$userCohortValueType$1();
        Object object3 = new Gson();
        if ((object = (List)((Gson)object3).fromJson((String)object, (Type)(object2 = ((TypeToken)object2).getType()))) != null) {
            boolean bl2;
            object = object.iterator();
            while (bl2 = object.hasNext()) {
                boolean bl3;
                String string2;
                boolean bl4;
                object2 = (CustomerType$UserCohortValue)object.next();
                object3 = ((CustomerType$UserCohortValue)object2).getKey();
                if (object3 == null || (bl4 = ((String)object3).equalsIgnoreCase(string2 = "rilfnl_v1")) != (bl3 = true)) continue;
                object = ((CustomerType$UserCohortValue)object2).getValue();
                if (object == null) break;
                bl2 = false;
                object2 = null;
                object3 = "earlyaccess";
                boolean bl5 = StringsKt.F((CharSequence)object, (CharSequence)object3, false);
                if (bl5 != bl3) break;
                AJIOApplication.Companion.getClass();
                object = UserInformation.getInstance((Context)AJIOApplication$a.a());
                ((UserInformation)object).setEarlyAccessMember(bl3);
                break;
            }
        }
    }

    public static /* synthetic */ DataCallback d(dl2_2 dl2_22) {
        return UserRepo.validateSession$lambda$39("validateSession", dl2_22);
    }

    public static /* synthetic */ DataCallback e(lx3_0 lx3_02, Object object) {
        return UserRepo.getStaticLinks$lambda$24(lx3_02, object);
    }

    public static /* synthetic */ DataCallback f(String string2, dl2_2 dl2_22) {
        return UserRepo.updateUserProfileUaasRequest$lambda$4(string2, dl2_22);
    }

    public static /* synthetic */ DataCallback g(Gx3 gx3, Object object) {
        return UserRepo.requestOtpAccessProfile$lambda$37(gx3, object);
    }

    private static final DataCallback getCancelRequest$lambda$27(String object, dl2_2 dl2_22) {
        Intrinsics.checkNotNullParameter(object, "$requestID");
        Intrinsics.checkNotNullParameter(dl2_22, "response");
        Object object2 = (MyAccountCancelRequest)dl2_22.b;
        Object object3 = dl2_22.a;
        boolean bl2 = ((cl2_2)object3).d();
        if (bl2 && object2 != null) {
            object = DataCallback.Companion.onSuccess(object2);
        } else {
            object2 = ApiErrorRepo.INSTANCE;
            int n3 = 28;
            object3 = dl2_22;
            object = ApiErrorRepo.handleApiError$default((ApiErrorRepo)object2, dl2_22, (String)object, false, null, null, n3, null);
        }
        return object;
    }

    private static final DataCallback getCancelRequest$lambda$28(Function1 function1, Object object) {
        return (DataCallback)oj_0.a(function1, "$tmp0", object, "p0", object);
    }

    private static final DataCallback getCancelRequest$lambda$29(String string2, Throwable throwable) {
        Intrinsics.checkNotNullParameter(string2, "$requestID");
        Intrinsics.checkNotNullParameter(throwable, "t");
        return ApiErrorRepo.handleApiException$default(ApiErrorRepo.INSTANCE, throwable, string2, false, null, null, 28, null);
    }

    private static final DataCallback getCohortBasedOnDeviceId$lambda$16(UserRepo object, String object2, dl2_2 object3) {
        Intrinsics.checkNotNullParameter(object, "this$0");
        Intrinsics.checkNotNullParameter(object2, "$requestID");
        Intrinsics.checkNotNullParameter(object3, "response");
        Object object4 = (CustomerType)((dl2_2)object3).b;
        Object object5 = ((dl2_2)object3).a;
        boolean bl2 = ((cl2_2)object5).d();
        if (bl2 && object4 != null) {
            object2 = h40_0.a;
            boolean bl3 = h40_0.Y0();
            if (bl3) {
                object2 = ((CustomerType)object4).getUserCohortValueV3();
                if (object2 != null) {
                    object2 = new Object();
                    object3 = ((CustomerType)object4).getUserCohortValueV3();
                    object2 = ((Gson)object2).toJson(object3);
                    object3 = ((UserRepo)object).userInformation;
                    ((UserInformation)object3).setUserDeviceIdCohortValueV3((String)object2);
                }
            } else {
                object2 = ((CustomerType)object4).getUserCohortValue();
                if (object2 != null) {
                    object2 = new Object();
                    object3 = ((CustomerType)object4).getUserCohortValue();
                    object2 = ((Gson)object2).toJson(object3);
                    object3 = ((UserRepo)object).userInformation;
                    ((UserInformation)object3).setUserDeviceIdCohortValue((String)object2);
                }
            }
            if ((object2 = (Collection)((CustomerType)object4).getUserSegmentIdSet()) != null && !(bl3 = object2.isEmpty())) {
                object2 = ((CustomerType)object4).getUserSegmentIdSet();
                Intrinsics.checkNotNull(object2);
                object2 = object2.iterator();
                object3 = "";
                while (bl2 = object2.hasNext()) {
                    object5 = (String)object2.next();
                    int n3 = ((String)object3).length();
                    if (n3 == 0) {
                        object3 = object5;
                        continue;
                    }
                    String string2 = ",";
                    object3 = n1.a((String)object3, string2, (String)object5);
                }
                object = ((UserRepo)object).userInformation;
                ((UserInformation)object).setUserSegementIds((String)object3);
            }
            object = DataCallback.Companion.onSuccess(object4);
        } else {
            object4 = ApiErrorRepo.INSTANCE;
            int n4 = 28;
            object5 = object3;
            Iterator iterator = object2;
            object = ApiErrorRepo.handleApiError$default((ApiErrorRepo)object4, (dl2_2)object3, (String)object2, false, null, null, n4, null);
        }
        return object;
    }

    private static final DataCallback getCohortBasedOnDeviceId$lambda$17(Function1 function1, Object object) {
        return (DataCallback)oj_0.a(function1, "$tmp0", object, "p0", object);
    }

    private static final DataCallback getCohortBasedOnDeviceId$lambda$18(UserRepo userRepo, String string2, Throwable throwable) {
        Intrinsics.checkNotNullParameter(userRepo, "this$0");
        Intrinsics.checkNotNullParameter(string2, "$requestID");
        Intrinsics.checkNotNullParameter(throwable, "t");
        userRepo.stopCustomerTypeApiTrace();
        return ApiErrorRepo.handleApiException$default(ApiErrorRepo.INSTANCE, throwable, string2, false, null, null, 28, null);
    }

    private static final DataCallback getGpsData$lambda$51(String object, dl2_2 dl2_22) {
        Intrinsics.checkNotNullParameter(object, "$requestID");
        Intrinsics.checkNotNullParameter(dl2_22, "response");
        Object object2 = (GPSResponse)dl2_22.b;
        Object object3 = dl2_22.a;
        boolean bl2 = ((cl2_2)object3).d();
        if (bl2 && object2 != null) {
            object = DataCallback.Companion.onSuccess(object2);
        } else {
            object2 = ApiErrorRepo.INSTANCE;
            int n3 = 28;
            object3 = dl2_22;
            object = ApiErrorRepo.handleApiError$default((ApiErrorRepo)object2, dl2_22, (String)object, false, null, null, n3, null);
        }
        return object;
    }

    private static final DataCallback getGpsData$lambda$52(Function1 function1, Object object) {
        return (DataCallback)oj_0.a(function1, "$tmp0", object, "p0", object);
    }

    private static final DataCallback getGpsData$lambda$53(String string2, Throwable throwable) {
        Intrinsics.checkNotNullParameter(string2, "$requestID");
        Intrinsics.checkNotNullParameter(throwable, "t");
        return ApiErrorRepo.handleApiException$default(ApiErrorRepo.INSTANCE, throwable, string2, false, null, null, 28, null);
    }

    private static final DataCallback getGpsDataPd$lambda$54(String object, dl2_2 dl2_22) {
        Intrinsics.checkNotNullParameter(object, "$requestID");
        Intrinsics.checkNotNullParameter(dl2_22, "response");
        Object object2 = (LocationResponse)dl2_22.b;
        Object object3 = dl2_22.a;
        boolean bl2 = ((cl2_2)object3).d();
        if (bl2 && object2 != null) {
            object = DataCallback.Companion.onSuccess(object2);
        } else {
            object2 = ApiErrorRepo.INSTANCE;
            int n3 = 28;
            object3 = dl2_22;
            object = ApiErrorRepo.handleApiError$default((ApiErrorRepo)object2, dl2_22, (String)object, false, null, null, n3, null);
        }
        return object;
    }

    private static final DataCallback getGpsDataPd$lambda$55(Function1 function1, Object object) {
        return (DataCallback)oj_0.a(function1, "$tmp0", object, "p0", object);
    }

    private static final DataCallback getGpsDataPd$lambda$56(String string2, Throwable throwable) {
        Intrinsics.checkNotNullParameter(string2, "$requestID");
        Intrinsics.checkNotNullParameter(throwable, "t");
        return ApiErrorRepo.handleApiException$default(ApiErrorRepo.INSTANCE, throwable, string2, false, null, null, 28, null);
    }

    private final NewCustomEventsRevamp getNewCustomEventsRevamp() {
        return (NewCustomEventsRevamp)this.newCustomEventsRevamp$delegate.getValue();
    }

    private static final DataCallback getStaticLinks$lambda$23(String object, dl2_2 dl2_22) {
        Intrinsics.checkNotNullParameter(object, "$requestID");
        Intrinsics.checkNotNullParameter(dl2_22, "response");
        Object object2 = (NavigationParent)dl2_22.b;
        Object object3 = dl2_22.a;
        boolean bl2 = ((cl2_2)object3).d();
        if (bl2 && object2 != null) {
            object = DataCallback.Companion.onSuccess(object2);
        } else {
            object2 = ApiErrorRepo.INSTANCE;
            int n3 = 28;
            object3 = dl2_22;
            object = ApiErrorRepo.handleApiError$default((ApiErrorRepo)object2, dl2_22, (String)object, false, null, null, n3, null);
        }
        return object;
    }

    private static final DataCallback getStaticLinks$lambda$24(Function1 function1, Object object) {
        return (DataCallback)oj_0.a(function1, "$tmp0", object, "p0", object);
    }

    private static final DataCallback getStaticLinks$lambda$25(String string2, Throwable throwable) {
        Intrinsics.checkNotNullParameter(string2, "$requestID");
        Intrinsics.checkNotNullParameter(throwable, "t");
        return ApiErrorRepo.handleApiException$default(ApiErrorRepo.INSTANCE, throwable, string2, false, null, null, 28, null);
    }

    private final String getTimeStampUniqueId() {
        return Wm2.a(System.currentTimeMillis(), "AJIO");
    }

    private final String getUserDeviceId() {
        int n3;
        Object object = this.userInformation;
        object = object != null ? ((UserInformation)object).getUserDeviceId() : null;
        if (object == null || (n3 = ((String)object).length()) == 0) {
            cp_1.Companion.getClass();
            AJIOApplication.Companion.getClass();
            object = Settings.Secure.getString((ContentResolver)AJIOApplication$a.a().getContentResolver(), (String)"android_id");
            String string2 = "getString(...)";
            Intrinsics.checkNotNullExpressionValue(object, string2);
            n3 = ((String)object).length();
            if (n3 == 0) {
                object = this.getTimeStampUniqueId();
            }
        }
        return object;
    }

    private static final DataCallback getUserProfile$lambda$13(UserRepo userRepo, String string2, dl2_2 dl2_22) {
        Object object;
        Intrinsics.checkNotNullParameter(userRepo, "this$0");
        Intrinsics.checkNotNullParameter(string2, "$requestID");
        Intrinsics.checkNotNullParameter(dl2_22, "response");
        Object object2 = (UserProfileData)dl2_22.b;
        Object object3 = dl2_22.a;
        boolean bl2 = ((cl2_2)object3).d();
        int n3 = 1;
        if (bl2 && object2 != null) {
            String string3 = userRepo.saveUserProfileInformation((UserProfileData)object2);
            int n4 = string3.length();
            if (n4 > 0) {
                object = new DataError();
                Object object4 = new DataError$ErrorMessage();
                object2 = new ArrayList();
                ((ArrayList)object2).add(object4);
                ((DataError)object).setErrors((List)object2);
                object4 = ApiErrorRepo.INSTANCE;
                n3 = ((cl2_2)object3).d;
                boolean bl3 = true;
                int n7 = 104;
                object3 = object4;
                ApiErrorRepo.logServiceErrorEvent$default((ApiErrorRepo)object4, string2, string3, n3, null, bl3, null, null, n7, null);
                object4 = DataCallback.Companion;
                object = ((DataCallback$Companion)object4).onFailed((DataError)object);
            } else {
                ih3_1.a(n3 != 0);
                object = DataCallback.Companion.onSuccess(object2);
            }
        } else {
            object2 = userRepo.userInformation.getUserId();
            boolean bl4 = b.i((String)object2, (String)(object3 = "optionalemailiduser"), n3 != 0);
            if (bl4) {
                object = userRepo.userInformation;
                object2 = "";
                ((UserInformation)object).setUserId((String)object2);
            }
            object = ApiErrorRepo.INSTANCE;
            boolean bl5 = true;
            boolean bl6 = false;
            dl2_2 dl2_23 = dl2_22;
            object2 = string2;
            bl2 = false;
            Object var7_8 = null;
            n3 = 24;
            object = ApiErrorRepo.handleApiError$default((ApiErrorRepo)object, dl2_22, string2, bl5, null, null, n3, null);
        }
        return object;
    }

    private static final DataCallback getUserProfile$lambda$14(Function1 function1, Object object) {
        return (DataCallback)oj_0.a(function1, "$tmp0", object, "p0", object);
    }

    private static final DataCallback getUserProfile$lambda$15(UserRepo object, String string2, Throwable throwable) {
        Intrinsics.checkNotNullParameter(object, "this$0");
        Intrinsics.checkNotNullParameter(string2, "$requestID");
        Intrinsics.checkNotNullParameter(throwable, "t");
        String string3 = ((UserRepo)object).userInformation.getUserId();
        String string4 = "optionalemailiduser";
        boolean bl2 = true;
        boolean bl3 = b.i(string3, string4, bl2);
        if (bl3) {
            object = ((UserRepo)object).userInformation;
            string3 = "";
            ((UserInformation)object).setUserId(string3);
        }
        return ApiErrorRepo.handleApiException$default(ApiErrorRepo.INSTANCE, throwable, string2, false, null, null, 28, null);
    }

    public static /* synthetic */ g53_0 getUserType$default(UserRepo userRepo, String string2, String string3, int n3, Object object) {
        if ((n3 &= 2) != 0) {
            string3 = "User_Type";
        }
        return userRepo.getUserType(string2, string3);
    }

    private static final DataCallback getUserType$lambda$19(UserRepo object, String object2, dl2_2 object3) {
        Intrinsics.checkNotNullParameter(object, "this$0");
        Intrinsics.checkNotNullParameter(object2, "$requestID");
        Intrinsics.checkNotNullParameter(object3, "response");
        ((UserRepo)object).stopCustomerTypeApiTrace();
        Object object4 = (CustomerType)((dl2_2)object3).b;
        Object object5 = ((dl2_2)object3).a;
        boolean bl2 = ((cl2_2)object5).d();
        if (bl2 && object4 != null) {
            object2 = ((UserRepo)object).appPreferences;
            object3 = ((CustomerType)object4).getCustomerType();
            ((jo_2)object2).q((String)object3);
            object2 = h40_0.a;
            boolean bl3 = h40_0.Y0();
            if (bl3) {
                object2 = ((CustomerType)object4).getUserCohortValueV3();
                if (object2 != null) {
                    object2 = new Object();
                    object3 = ((CustomerType)object4).getUserCohortValueV3();
                    object2 = ((Gson)object2).toJson(object3);
                    object3 = ((UserRepo)object).userInformation;
                    ((UserInformation)object3).setUserCohortValueV3((String)object2);
                }
            } else {
                object2 = ((CustomerType)object4).getUserCohortValue();
                if (object2 != null) {
                    object2 = new Object();
                    object3 = ((CustomerType)object4).getUserCohortValue();
                    object2 = ((Gson)object2).toJson(object3);
                    object3 = ((UserRepo)object).userInformation;
                    ((UserInformation)object3).setUserCohortValue((String)object2);
                    Intrinsics.checkNotNull(object2);
                    super.checkIfUserIsEarlyAccessMember((String)object2);
                }
            }
            if ((object2 = (Collection)((CustomerType)object4).getUserSegmentIdSet()) != null && !(bl3 = object2.isEmpty())) {
                object2 = ((CustomerType)object4).getUserSegmentIdSet();
                Intrinsics.checkNotNull(object2);
                object2 = object2.iterator();
                object3 = "";
                while (bl2 = object2.hasNext()) {
                    object5 = (String)object2.next();
                    int n3 = ((String)object3).length();
                    if (n3 == 0) {
                        object3 = object5;
                        continue;
                    }
                    String string2 = ",";
                    object3 = n1.a((String)object3, string2, (String)object5);
                }
                object = ((UserRepo)object).userInformation;
                ((UserInformation)object).setUserSegementIds((String)object3);
            }
            object = DataCallback.Companion.onSuccess(object4);
        } else {
            object4 = ApiErrorRepo.INSTANCE;
            int n4 = 28;
            object5 = object3;
            Iterator iterator = object2;
            object = ApiErrorRepo.handleApiError$default((ApiErrorRepo)object4, (dl2_2)object3, (String)object2, false, null, null, n4, null);
        }
        return object;
    }

    private static final DataCallback getUserType$lambda$20(Function1 function1, Object object) {
        return (DataCallback)oj_0.a(function1, "$tmp0", object, "p0", object);
    }

    private static final DataCallback getUserType$lambda$21(UserRepo userRepo, String string2, Throwable throwable) {
        Intrinsics.checkNotNullParameter(userRepo, "this$0");
        Intrinsics.checkNotNullParameter(string2, "$requestID");
        Intrinsics.checkNotNullParameter(throwable, "t");
        userRepo.stopCustomerTypeApiTrace();
        return ApiErrorRepo.handleApiException$default(ApiErrorRepo.INSTANCE, throwable, string2, false, null, null, 28, null);
    }

    public static /* synthetic */ DataCallback h(gy3 gy32, Object object) {
        return UserRepo.getCancelRequest$lambda$28(gy32, object);
    }

    public static /* synthetic */ DataCallback i(String string2, dl2_2 dl2_22) {
        return UserRepo.updateUserProfileHybris$lambda$1(string2, dl2_22);
    }

    public static /* synthetic */ DataCallback j(dl2_2 dl2_22) {
        return UserRepo.requestOtpMobileNumberUpdateUaas$lambda$33("request_otp_mobile_update", dl2_22);
    }

    public static /* synthetic */ DataCallback k(Throwable throwable) {
        return UserRepo.requestOtpMobileNumberUpdateUaas$lambda$32("request_otp_mobile_update", throwable);
    }

    public static /* synthetic */ DataCallback l(Throwable throwable) {
        return UserRepo.verifyOtpAccessProfile$lambda$47("verify_otp_access_profile", throwable);
    }

    /*
     * Enabled aggressive block sorting
     */
    private final void logUserProfileEvent(String object, String object2) {
        String string2;
        boolean bl2;
        block8: {
            boolean bl3;
            block7: {
                int n3;
                String string3;
                block6: {
                    block5: {
                        block4: {
                            int n4;
                            bl2 = true;
                            string3 = "@";
                            if (object == null || (n4 = ((String)object).length()) == 0) break block4;
                            string2 = "userId:- ".concat((String)object);
                            bl3 = StringsKt.F((CharSequence)object, string3, false);
                            if (bl3) break block5;
                            bl3 = true;
                            break block6;
                        }
                        string2 = "";
                    }
                    bl3 = false;
                    object = null;
                }
                if (object2 == null || (n3 = ((String)object2).length()) == 0) break block7;
                String string4 = " displayUserId:- ";
                string2 = n1.a(string2, string4, (String)object2);
                boolean bl4 = StringsKt.F((CharSequence)object2, string3, false);
                if (!bl4) break block8;
            }
            bl2 = bl3;
        }
        if (bl2) {
            object = yn3_0.a;
            object2 = new Exception(string2);
            ((yn3$a)object).e((Throwable)object2);
        }
    }

    private final void logoutFailureEvent(String string2) {
        NewCustomEventsRevamp.newPushCustomEvent$default(this.getNewCustomEventsRevamp(), "user account interactions", "logout Failure", string2, "user_account_interactions", "My account screen", null, null, null, "", false, null, 1760, null);
    }

    private final void logoutSuccessfulEvent() {
        NewCustomEventsRevamp.newPushCustomEvent$default(this.getNewCustomEventsRevamp(), "user account interactions", "logout successful", "", "user_account_interactions", "My account screen", null, null, null, "", false, null, 1760, null);
    }

    private static final DataCallback logoutUser$lambda$10(UserRepo object, String object2, dl2_2 objectArray) {
        Intrinsics.checkNotNullParameter(object, "this$0");
        Intrinsics.checkNotNullParameter(object2, "$requestID");
        Intrinsics.checkNotNullParameter(objectArray, "response");
        Object object3 = (il2_2)objectArray.b;
        Object object4 = objectArray.a;
        boolean bl2 = ((cl2_2)object4).d();
        if (bl2 && object3 != null) {
            ((UserRepo)object).logoutSuccessfulEvent();
            object = DataCallback.Companion.onSuccess(object3);
        } else {
            boolean bl3 = ((cl2_2)object4).d();
            if (bl3) {
                object2 = yn3_0.a;
                ((yn3$a)object2).l("UserRepo");
                objectArray = new Object[]{};
                object3 = "Data not present";
                ((yn3$a)object2).a((String)object3, objectArray);
                super.logoutFailureEvent((String)object3);
                object = DataCallback.Companion;
                object2 = new DataError();
                object = ((DataCallback$Companion)object).onFailed((DataError)object2);
            } else {
                object3 = objectArray.c;
                object3 = object3 != null ? ((il2_2)object3).k() : "Error not present";
                super.logoutFailureEvent((String)object3);
                object4 = ApiErrorRepo.INSTANCE;
                int n3 = 28;
                object = ApiErrorRepo.handleApiError$default((ApiErrorRepo)object4, (dl2_2)objectArray, (String)object2, false, null, null, n3, null);
            }
        }
        return object;
    }

    private static final DataCallback logoutUser$lambda$11(Function1 function1, Object object) {
        return (DataCallback)oj_0.a(function1, "$tmp0", object, "p0", object);
    }

    private static final DataCallback logoutUser$lambda$12(UserRepo userRepo, String string2, Throwable throwable) {
        Intrinsics.checkNotNullParameter(userRepo, "this$0");
        Intrinsics.checkNotNullParameter(string2, "$requestID");
        Intrinsics.checkNotNullParameter(throwable, "t");
        String string3 = throwable.getLocalizedMessage();
        Intrinsics.checkNotNullExpressionValue(string3, "getLocalizedMessage(...)");
        userRepo.logoutFailureEvent(string3);
        return ApiErrorRepo.handleApiException$default(ApiErrorRepo.INSTANCE, throwable, string2, false, null, null, 28, null);
    }

    public static /* synthetic */ DataCallback m(dl2_2 dl2_22) {
        return UserRepo.requestOtpVerifyRILEmplProfile$lambda$42("request_otp_ril_profile", dl2_22);
    }

    public static /* synthetic */ DataCallback n(hy3 hy32, Object object) {
        return UserRepo.getGpsDataPd$lambda$55(hy32, object);
    }

    private static final NewCustomEventsRevamp newCustomEventsRevamp_delegate$lambda$0() {
        return AnalyticsManager.Companion.getInstance().getNewCustomEventsRevamp();
    }

    public static /* synthetic */ DataCallback o(Jx3 jx3, Object object) {
        return UserRepo.requestOtpVerifyRILEmplProfile$lambda$43(jx3, object);
    }

    public static /* synthetic */ DataCallback p(UserRepo userRepo, Throwable throwable) {
        return UserRepo.logoutUser$lambda$12(userRepo, "Logout_user", throwable);
    }

    public static /* synthetic */ DataCallback q(wx3_0 wx3_02, Object object) {
        return UserRepo.requestOtpMobileNumberUpdateUaas$lambda$34(wx3_02, object);
    }

    public static /* synthetic */ DataCallback r(String string2, Throwable throwable) {
        return UserRepo.updateUserProfileUaas$lambda$9(string2, throwable);
    }

    private static final DataCallback requestOtpAccessProfile$lambda$36(String object, dl2_2 dl2_22) {
        Intrinsics.checkNotNullParameter(object, "$requestID");
        Intrinsics.checkNotNullParameter(dl2_22, "response");
        Object object2 = (Status)dl2_22.b;
        Object object3 = dl2_22.a;
        boolean bl2 = ((cl2_2)object3).d();
        if (bl2 && object2 != null) {
            object = DataCallback.Companion.onSuccess(object2);
        } else {
            object2 = ApiErrorRepo.INSTANCE;
            int n3 = 28;
            object3 = dl2_22;
            object = ApiErrorRepo.handleApiError$default((ApiErrorRepo)object2, dl2_22, (String)object, false, null, null, n3, null);
        }
        return object;
    }

    private static final DataCallback requestOtpAccessProfile$lambda$37(Function1 function1, Object object) {
        return (DataCallback)oj_0.a(function1, "$tmp0", object, "p0", object);
    }

    private static final DataCallback requestOtpAccessProfile$lambda$38(String string2, Throwable throwable) {
        Intrinsics.checkNotNullParameter(string2, "$requestID");
        Intrinsics.checkNotNullParameter(throwable, "t");
        return ApiErrorRepo.handleApiException$default(ApiErrorRepo.INSTANCE, throwable, string2, false, null, null, 28, null);
    }

    private static final DataCallback requestOtpMobileNumberUpdateUaas$lambda$30(String object, dl2_2 dl2_22) {
        Intrinsics.checkNotNullParameter(object, "$requestID");
        Intrinsics.checkNotNullParameter(dl2_22, "response");
        Object object2 = (OTPData)dl2_22.b;
        Object object3 = dl2_22.a;
        boolean bl2 = ((cl2_2)object3).d();
        if (bl2 && object2 != null) {
            object = DataCallback.Companion.onSuccess(object2);
        } else {
            object2 = ApiErrorRepo.INSTANCE;
            int n3 = 28;
            object3 = dl2_22;
            object = ApiErrorRepo.handleApiError$default((ApiErrorRepo)object2, dl2_22, (String)object, false, null, null, n3, null);
        }
        return object;
    }

    private static final DataCallback requestOtpMobileNumberUpdateUaas$lambda$31(Function1 function1, Object object) {
        return (DataCallback)oj_0.a(function1, "$tmp0", object, "p0", object);
    }

    private static final DataCallback requestOtpMobileNumberUpdateUaas$lambda$32(String string2, Throwable throwable) {
        Intrinsics.checkNotNullParameter(string2, "$requestID");
        Intrinsics.checkNotNullParameter(throwable, "t");
        return ApiErrorRepo.handleApiException$default(ApiErrorRepo.INSTANCE, throwable, string2, false, null, null, 28, null);
    }

    private static final DataCallback requestOtpMobileNumberUpdateUaas$lambda$33(String object, dl2_2 dl2_22) {
        Intrinsics.checkNotNullParameter(object, "$requestID");
        Intrinsics.checkNotNullParameter(dl2_22, "response");
        Object object2 = (OTPData)dl2_22.b;
        Object object3 = dl2_22.a;
        boolean bl2 = ((cl2_2)object3).d();
        if (bl2 && object2 != null) {
            object = DataCallback.Companion.onSuccess(object2);
        } else {
            object2 = ApiErrorRepo.INSTANCE;
            int n3 = 28;
            object3 = dl2_22;
            object = ApiErrorRepo.handleApiError$default((ApiErrorRepo)object2, dl2_22, (String)object, false, null, null, n3, null);
        }
        return object;
    }

    private static final DataCallback requestOtpMobileNumberUpdateUaas$lambda$34(Function1 function1, Object object) {
        return (DataCallback)oj_0.a(function1, "$tmp0", object, "p0", object);
    }

    private static final DataCallback requestOtpMobileNumberUpdateUaas$lambda$35(String string2, Throwable throwable) {
        Intrinsics.checkNotNullParameter(string2, "$requestID");
        Intrinsics.checkNotNullParameter(throwable, "t");
        return ApiErrorRepo.handleApiException$default(ApiErrorRepo.INSTANCE, throwable, string2, false, null, null, 28, null);
    }

    private static final DataCallback requestOtpVerifyRILEmplProfile$lambda$42(String object, dl2_2 dl2_22) {
        Intrinsics.checkNotNullParameter(object, "$requestID");
        Intrinsics.checkNotNullParameter(dl2_22, "response");
        Object object2 = (Status)dl2_22.b;
        Object object3 = dl2_22.a;
        boolean bl2 = ((cl2_2)object3).d();
        if (bl2 && object2 != null) {
            object = DataCallback.Companion.onSuccess(object2);
        } else {
            object2 = ApiErrorRepo.INSTANCE;
            int n3 = 28;
            object3 = dl2_22;
            object = ApiErrorRepo.handleApiError$default((ApiErrorRepo)object2, dl2_22, (String)object, false, null, null, n3, null);
        }
        return object;
    }

    private static final DataCallback requestOtpVerifyRILEmplProfile$lambda$43(Function1 function1, Object object) {
        return (DataCallback)oj_0.a(function1, "$tmp0", object, "p0", object);
    }

    private static final DataCallback requestOtpVerifyRILEmplProfile$lambda$44(String string2, Throwable throwable) {
        Intrinsics.checkNotNullParameter(string2, "$requestID");
        Intrinsics.checkNotNullParameter(throwable, "t");
        return ApiErrorRepo.handleApiException$default(ApiErrorRepo.INSTANCE, throwable, string2, false, null, null, 28, null);
    }

    public static /* synthetic */ DataCallback s(tz_0 tz_02, Object object) {
        return UserRepo.updateUserProfileUaasRequest$lambda$5(tz_02, object);
    }

    private final String saveUserProfileInformation(UserProfileData object) {
        int n3;
        int n4;
        Object object2;
        int n7;
        Object object3;
        int n8;
        String string2 = ((UserProfileData)object).getDisplayUid();
        if (string2 != null && (n8 = string2.length()) != 0) {
            string2 = ((UserProfileData)object).getDisplayUid();
            object3 = this.userInformation;
            ((UserInformation)object3).setDisplayUid(string2);
            string2 = "";
        } else {
            string2 = "displayUid, ";
        }
        object3 = ((UserProfileData)object).getUid();
        Object object4 = "uid, ";
        if (object3 != null && (n7 = ((String)object3).length()) != 0) {
            object3 = ((UserProfileData)object).getUid();
            object2 = this.userInformation;
            ((UserInformation)object2).setUserId((String)object3);
        } else {
            string2 = string2.concat((String)object4);
        }
        object3 = ((UserProfileData)object).getEncryptedId();
        if (object3 != null && (n4 = ((String)object3).length()) != 0) {
            object2 = this.userInformation;
            ((UserInformation)object2).setEncryptedId((String)object3);
        }
        if ((object3 = ((UserProfileData)object).getCustomerUuid()) != null && (n4 = ((String)object3).length()) != 0) {
            object2 = this.userInformation;
            ((UserInformation)object2).setCustomerUUID((String)object3);
        } else {
            object3 = "customerUuid, ";
            string2 = Ft2.a(string2, (String)object3);
        }
        object3 = ((UserProfileData)object).getIdentity();
        if (object3 != null && (n4 = ((String)object3).length()) != 0) {
            object2 = this.userInformation;
            ((UserInformation)object2).setCustomerIdentity((String)object3);
        }
        if ((object3 = ((UserProfileData)object).getName()) != null && (n4 = ((String)object3).length()) != 0) {
            object2 = this.userInformation;
            ((UserInformation)object2).setName((String)object3);
        } else {
            object3 = "name, ";
            string2 = Ft2.a(string2, (String)object3);
        }
        object3 = ((UserProfileData)object).getFirstName();
        if (object3 != null && (n4 = ((String)object3).length()) != 0) {
            object2 = this.userInformation;
            ((UserInformation)object2).setUserName((String)object3);
        } else {
            object3 = "firstName, ";
            string2 = Ft2.a(string2, (String)object3);
        }
        object3 = ((UserProfileData)object).getUid();
        if (object3 != null && (n4 = ((String)object3).length()) != 0) {
            object4 = this.userInformation;
            ((UserInformation)object4).setUserEmailId((String)object3);
        } else {
            string2 = Ft2.a(string2, (String)object4);
        }
        object3 = ((UserProfileData)object).getMobileNumber();
        if (object3 != null && (n3 = ((String)object3).length()) != 0) {
            object4 = this.userInformation;
            ((UserInformation)object4).setUserPhoneNumber((String)object3);
        } else {
            object3 = "mobileNumber, ";
            string2 = Ft2.a(string2, (String)object3);
        }
        object3 = ((UserProfileData)object).getUserReferralCode();
        if (object3 != null && (n3 = ((String)object3).length()) != 0) {
            object4 = this.userInformation;
            ((UserInformation)object4).setUserReferralCode((String)object3);
        }
        object3 = ((UserProfileData)object).encryptionKey;
        n3 = 0;
        object4 = null;
        if (object3 != null && (n4 = ((String)object3).length()) != 0) {
            object2 = this.userInformation;
            ((UserInformation)object2).setEncryptionKey((String)object3);
        } else {
            object3 = this.userInformation;
            object2 = h40_0.a;
            object2 = h40_0.b0();
            if (object2 != null) {
                object2 = ((PanEncryptionItem)object2).getEncryptionKey();
            } else {
                n4 = 0;
                object2 = null;
            }
            ((UserInformation)object3).setEncryptionKey((String)object2);
        }
        object3 = ((UserProfileData)object).keyVersion;
        if (object3 != null && (n4 = ((String)object3).length()) != 0) {
            object4 = this.userInformation;
            ((UserInformation)object4).setEncryptionKeyVersion((String)object3);
        } else {
            object3 = this.userInformation;
            object2 = h40_0.a;
            object2 = h40_0.b0();
            if (object2 != null) {
                object4 = ((PanEncryptionItem)object2).getKeyVersion();
            }
            ((UserInformation)object3).setEncryptionKeyVersion((String)object4);
        }
        object3 = ((UserProfileData)object).taxPayerId;
        if (object3 != null && (n3 = ((String)object3).length()) != 0) {
            object4 = this.userInformation;
            ((UserInformation)object4).setTaxPayerId((String)object3);
        }
        object3 = ((UserProfileData)object).getUid();
        object = ((UserProfileData)object).getDisplayUid();
        this.logUserProfileEvent((String)object3, (String)object);
        int n10 = string2.length();
        if (n10 > 0) {
            object = "are either null or empty";
            string2 = string2.concat((String)object);
        }
        return string2;
    }

    private final void startCustomerTypeApiTrace() {
        fq2_1.g.start();
    }

    private final void stopCustomerTypeApiTrace() {
        fq2_1.g.stop();
    }

    public static /* synthetic */ DataCallback t(Throwable throwable) {
        return UserRepo.verifyRILEmployeeProfile$lambda$50("verify_otp_ril_profile", throwable);
    }

    public static /* synthetic */ DataCallback u(Throwable throwable) {
        return UserRepo.requestOtpMobileNumberUpdateUaas$lambda$35("request_otp_mobile_update", throwable);
    }

    private final g53_0 updateUserProfileHybris(String object, String object2, QueryProfile object3) {
        int n3;
        String string2;
        HashMap<Object, Object> hashMap = new HashMap<Object, Object>();
        Object object4 = ((QueryProfile)object3).getFirstName();
        if (object4 != null) {
            object4 = "firstName";
            string2 = ((QueryProfile)object3).getFirstName();
            hashMap.put(object4, string2);
        }
        if ((object4 = ((QueryProfile)object3).getLastName()) != null) {
            object4 = "lastName";
            string2 = ((QueryProfile)object3).getLastName();
            hashMap.put(object4, string2);
        }
        if ((object4 = ((QueryProfile)object3).getScreenName()) != null) {
            object4 = "screenName";
            string2 = ((QueryProfile)object3).getScreenName();
            hashMap.put(object4, string2);
        }
        object4 = ((QueryProfile)object3).getNewPassword();
        string2 = "";
        String string3 = "newPassword";
        if (object4 != null && (n3 = ((String)object4).length()) != 0) {
            object4 = ((QueryProfile)object3).getNewPassword();
            hashMap.put(string3, object4);
        } else {
            hashMap.put(string3, string2);
        }
        object4 = ((QueryProfile)object3).getConfirmPassword();
        string3 = "confirmPassword";
        if (object4 != null && (n3 = ((String)object4).length()) != 0) {
            object4 = ((QueryProfile)object3).getConfirmPassword();
            hashMap.put(string3, object4);
        } else {
            hashMap.put(string3, string2);
        }
        object4 = ((QueryProfile)object3).getGender();
        if (object4 != null) {
            object4 = "gender";
            string2 = ((QueryProfile)object3).getGender();
            hashMap.put(object4, string2);
        }
        if ((object4 = ((QueryProfile)object3).getDateOfBirth()) != null) {
            object4 = "dateOfBirth";
            string2 = ((QueryProfile)object3).getDateOfBirth();
            hashMap.put(object4, string2);
        }
        if ((object4 = ((QueryProfile)object3).getMobileNumber()) != null) {
            object4 = ((QueryProfile)object3).getMobileNumber();
            if (object4 != null) {
                object4 = ((Object)StringsKt.m0((CharSequence)object4)).toString();
            } else {
                n3 = 0;
                object4 = null;
            }
            object4 = String.valueOf(object4);
            string2 = "mobileNumber";
            hashMap.put(string2, object4);
        }
        if ((object4 = ((QueryProfile)object3).getOtp()) != null) {
            object4 = "otp";
            object3 = ((QueryProfile)object3).getOtp();
            hashMap.put(object4, object3);
        }
        object4 = this.userApi;
        object3 = this.userInformation;
        Intrinsics.checkNotNullExpressionValue(object3, "userInformation");
        object3 = ServiceUtil.getToken((UserInformation)object3);
        string3 = kp1_0.c("Bearer ", (String)object3);
        String string4 = em_1.a(AJIOApplication.Companion);
        string2 = object;
        object = UserApi$DefaultImpls.updateUserProfile$default((UserApi)object4, (String)object, string3, "Android", string4, hashMap, (String)object2, null, 64, null);
        object3 = qt2_2.c;
        object = ((g53_0)object).h((Scheduler)object3);
        object3 = ti_2.a();
        object = ((g53_0)object).e((Scheduler)object3);
        object3 = new dy3((String)object2);
        object4 = new ey3((dy3)object3);
        object3 = new s53_0((q63_0)object, (bx0_2)object4);
        object = new ez_2(object2);
        object2 = new u53_0((q63_0)object3, (bx0_2)object);
        Intrinsics.checkNotNullExpressionValue(object2, "onErrorReturn(...)");
        return object2;
    }

    private static final DataCallback updateUserProfileHybris$lambda$1(String object, dl2_2 dl2_22) {
        Object object2;
        boolean bl2;
        Intrinsics.checkNotNullParameter(object, "$requestId");
        Intrinsics.checkNotNullParameter(dl2_22, "response");
        Object object3 = (SimpleStringData)dl2_22.b;
        if (object3 != null && (bl2 = ((cl2_2)(object2 = dl2_22.a)).d())) {
            object = DataCallback.Companion.onSuccess(object3);
        } else {
            object3 = ApiErrorRepo.INSTANCE;
            int n3 = 28;
            object2 = dl2_22;
            object = ApiErrorRepo.handleApiError$default((ApiErrorRepo)object3, dl2_22, (String)object, false, null, null, n3, null);
        }
        return object;
    }

    private static final DataCallback updateUserProfileHybris$lambda$2(Function1 function1, Object object) {
        return (DataCallback)oj_0.a(function1, "$tmp0", object, "p0", object);
    }

    private static final DataCallback updateUserProfileHybris$lambda$3(String string2, Throwable throwable) {
        Intrinsics.checkNotNullParameter(string2, "$requestId");
        Intrinsics.checkNotNullParameter(throwable, "t");
        return ApiErrorRepo.handleApiException$default(ApiErrorRepo.INSTANCE, throwable, string2, false, null, null, 28, null);
    }

    private final g53_0 updateUserProfileUaas(String object, String object2, QueryProfile object3) {
        int n3;
        String string2;
        HashMap<String, Object> hashMap = new HashMap<String, Object>();
        Object object4 = ((QueryProfile)object3).getFirstName();
        if (object4 != null) {
            object4 = "firstName";
            string2 = ((QueryProfile)object3).getFirstName();
            hashMap.put((String)object4, string2);
        }
        if ((object4 = ((QueryProfile)object3).getLastName()) != null) {
            object4 = "lastName";
            string2 = ((QueryProfile)object3).getLastName();
            hashMap.put((String)object4, string2);
        }
        if ((object4 = ((QueryProfile)object3).getScreenName()) != null) {
            object4 = "screenName";
            string2 = ((QueryProfile)object3).getScreenName();
            hashMap.put((String)object4, string2);
        }
        if ((object4 = ((QueryProfile)object3).getNewPassword()) != null && (n3 = ((String)object4).length()) != 0) {
            object4 = "newPassword";
            string2 = ((QueryProfile)object3).getNewPassword();
            hashMap.put((String)object4, string2);
        }
        if ((object4 = ((QueryProfile)object3).getConfirmPassword()) != null && (n3 = ((String)object4).length()) != 0) {
            object4 = "confirmPassword";
            string2 = ((QueryProfile)object3).getConfirmPassword();
            hashMap.put((String)object4, string2);
        }
        if ((object4 = ((QueryProfile)object3).getGender()) != null) {
            object4 = "genderType";
            string2 = ((QueryProfile)object3).getGender();
            hashMap.put((String)object4, string2);
        }
        if ((object4 = ((QueryProfile)object3).getDateOfBirth()) != null) {
            object4 = "dateOfBirth";
            string2 = ((QueryProfile)object3).getDateOfBirth();
            hashMap.put((String)object4, string2);
        }
        if ((object4 = ((QueryProfile)object3).getMobileNumber()) != null) {
            object4 = ((QueryProfile)object3).getMobileNumber();
            if (object4 != null) {
                object4 = ((Object)StringsKt.m0((CharSequence)object4)).toString();
            } else {
                n3 = 0;
                object4 = null;
            }
            object4 = String.valueOf(object4);
            string2 = "mobileNumber";
            hashMap.put(string2, object4);
        }
        if ((object4 = ((QueryProfile)object3).getOtp()) != null) {
            object4 = "otp";
            string2 = ((QueryProfile)object3).getOtp();
            hashMap.put((String)object4, string2);
        }
        if ((object4 = ((QueryProfile)object3).getEmailId()) != null) {
            object4 = "emailId";
            string2 = ((QueryProfile)object3).getEmailId();
            hashMap.put((String)object4, string2);
        }
        if ((object4 = ((QueryProfile)object3).getCurrentPassword()) != null) {
            object4 = "password";
            string2 = ((QueryProfile)object3).getCurrentPassword();
            hashMap.put((String)object4, string2);
        }
        if ((object4 = ((QueryProfile)object3).getOldMobileNumber()) != null) {
            object4 = "oldMobileNumber";
            string2 = ((QueryProfile)object3).getOldMobileNumber();
            hashMap.put((String)object4, string2);
        }
        if ((object4 = ((QueryProfile)object3).getNewMobileNumber()) != null) {
            object4 = "newMobileNumber";
            object3 = ((QueryProfile)object3).getNewMobileNumber();
            hashMap.put((String)object4, object3);
        }
        object3 = this.userInformation.getUserEmailId();
        hashMap.put("login", object3);
        object4 = this.userApi;
        object3 = this.userInformation;
        Intrinsics.checkNotNullExpressionValue(object3, "userInformation");
        object3 = ServiceUtil.getToken((UserInformation)object3);
        String string3 = kp1_0.c("Bearer ", (String)object3);
        String string4 = em_1.a(AJIOApplication.Companion);
        string2 = object;
        object = UserApi$DefaultImpls.updateUserProfileUaas$default((UserApi)object4, (String)object, string3, "Android", string4, hashMap, (String)object2, null, 64, null);
        object3 = qt2_2.c;
        object = ((g53_0)object).h((Scheduler)object3);
        object3 = ti_2.a();
        object = ((g53_0)object).e((Scheduler)object3);
        object3 = new gg0_1(object2, 2);
        object4 = new jz_2((Function1)object3);
        object3 = new s53_0((q63_0)object, (bx0_2)object4);
        object = new w3_0(object2, 2);
        object2 = new u53_0((q63_0)object3, (bx0_2)object);
        Intrinsics.checkNotNullExpressionValue(object2, "onErrorReturn(...)");
        return object2;
    }

    private static final DataCallback updateUserProfileUaas$lambda$7(String object, dl2_2 dl2_22) {
        Object object2;
        boolean bl2;
        Intrinsics.checkNotNullParameter(object, "$requestId");
        Intrinsics.checkNotNullParameter(dl2_22, "response");
        Object object3 = (SimpleStringData)dl2_22.b;
        if (object3 != null && (bl2 = ((cl2_2)(object2 = dl2_22.a)).d())) {
            object = DataCallback.Companion.onSuccess(object3);
        } else {
            object3 = ApiErrorRepo.INSTANCE;
            int n3 = 28;
            object2 = dl2_22;
            object = ApiErrorRepo.handleApiError$default((ApiErrorRepo)object3, dl2_22, (String)object, false, null, null, n3, null);
        }
        return object;
    }

    private static final DataCallback updateUserProfileUaas$lambda$8(Function1 function1, Object object) {
        return (DataCallback)oj_0.a(function1, "$tmp0", object, "p0", object);
    }

    private static final DataCallback updateUserProfileUaas$lambda$9(String string2, Throwable throwable) {
        Intrinsics.checkNotNullParameter(string2, "$requestId");
        Intrinsics.checkNotNullParameter(throwable, "t");
        return ApiErrorRepo.handleApiException$default(ApiErrorRepo.INSTANCE, throwable, string2, false, null, null, 28, null);
    }

    private final g53_0 updateUserProfileUaasRequest(String object, String object2, QueryProfile object3) {
        String string2;
        HashMap<Object, Object> hashMap = new HashMap<Object, Object>();
        Object object4 = ((QueryProfile)object3).getOtp();
        if (object4 != null) {
            object4 = "otp";
            string2 = ((QueryProfile)object3).getOtp();
            hashMap.put(object4, string2);
        }
        if ((object4 = ((QueryProfile)object3).getOldMobileNumber()) != null) {
            object4 = "oldMobileNumber";
            string2 = ((QueryProfile)object3).getOldMobileNumber();
            hashMap.put(object4, string2);
        }
        if ((object4 = ((QueryProfile)object3).getNewMobileNumber()) != null) {
            object4 = "newMobileNumber";
            object3 = ((QueryProfile)object3).getNewMobileNumber();
            hashMap.put(object4, object3);
        }
        object4 = this.userApi;
        object3 = this.userInformation;
        Intrinsics.checkNotNullExpressionValue(object3, "userInformation");
        object3 = ServiceUtil.getToken((UserInformation)object3);
        String string3 = kp1_0.c("Bearer ", (String)object3);
        String string4 = em_1.a(AJIOApplication.Companion);
        string2 = object;
        object = UserApi$DefaultImpls.updateUserProfileUaasRequest$default((UserApi)object4, (String)object, string3, "Android", string4, hashMap, (String)object2, null, 64, null);
        object3 = qt2_2.c;
        object = ((g53_0)object).h((Scheduler)object3);
        object3 = ti_2.a();
        object = ((g53_0)object).e((Scheduler)object3);
        object3 = new tz_0(object2, 2);
        object4 = new J03(object3);
        object3 = new s53_0((q63_0)object, (bx0_2)object4);
        object = new ou2_1(object2);
        object2 = new u53_0((q63_0)object3, (bx0_2)object);
        Intrinsics.checkNotNullExpressionValue(object2, "onErrorReturn(...)");
        return object2;
    }

    private static final DataCallback updateUserProfileUaasRequest$lambda$4(String object, dl2_2 dl2_22) {
        Object object2;
        boolean bl2;
        Intrinsics.checkNotNullParameter(object, "$requestId");
        Intrinsics.checkNotNullParameter(dl2_22, "response");
        Object object3 = (SimpleStringData)dl2_22.b;
        if (object3 != null && (bl2 = ((cl2_2)(object2 = dl2_22.a)).d())) {
            object = DataCallback.Companion.onSuccess(object3);
        } else {
            object3 = ApiErrorRepo.INSTANCE;
            int n3 = 28;
            object2 = dl2_22;
            object = ApiErrorRepo.handleApiError$default((ApiErrorRepo)object3, dl2_22, (String)object, false, null, null, n3, null);
        }
        return object;
    }

    private static final DataCallback updateUserProfileUaasRequest$lambda$5(Function1 function1, Object object) {
        return (DataCallback)oj_0.a(function1, "$tmp0", object, "p0", object);
    }

    private static final DataCallback updateUserProfileUaasRequest$lambda$6(String string2, Throwable throwable) {
        Intrinsics.checkNotNullParameter(string2, "$requestId");
        Intrinsics.checkNotNullParameter(throwable, "t");
        return ApiErrorRepo.handleApiException$default(ApiErrorRepo.INSTANCE, throwable, string2, false, null, null, 28, null);
    }

    public static /* synthetic */ DataCallback v(Throwable throwable) {
        return UserRepo.getStaticLinks$lambda$25("MyAccountsStaticLink", throwable);
    }

    private static final DataCallback validateSession$lambda$39(String object, dl2_2 dl2_22) {
        Intrinsics.checkNotNullParameter(object, "$requestID");
        Intrinsics.checkNotNullParameter(dl2_22, "response");
        Object object2 = (Status)dl2_22.b;
        Object object3 = dl2_22.a;
        boolean bl2 = ((cl2_2)object3).d();
        if (bl2 && object2 != null) {
            object = DataCallback.Companion.onSuccess(object2);
        } else {
            object2 = ApiErrorRepo.INSTANCE;
            int n3 = 28;
            object3 = dl2_22;
            object = ApiErrorRepo.handleApiError$default((ApiErrorRepo)object2, dl2_22, (String)object, false, null, null, n3, null);
        }
        return object;
    }

    private static final DataCallback validateSession$lambda$40(Function1 function1, Object object) {
        return (DataCallback)oj_0.a(function1, "$tmp0", object, "p0", object);
    }

    private static final DataCallback validateSession$lambda$41(String string2, Throwable throwable) {
        Intrinsics.checkNotNullParameter(string2, "$requestID");
        Intrinsics.checkNotNullParameter(throwable, "t");
        return ApiErrorRepo.handleApiException$default(ApiErrorRepo.INSTANCE, throwable, string2, false, null, null, 28, null);
    }

    private static final DataCallback verifyOtpAccessProfile$lambda$45(String object, dl2_2 dl2_22) {
        Intrinsics.checkNotNullParameter(object, "$requestID");
        Intrinsics.checkNotNullParameter(dl2_22, "response");
        Object object2 = (AccessProfileOtpResponse)dl2_22.b;
        Object object3 = dl2_22.a;
        boolean bl2 = ((cl2_2)object3).d();
        if (bl2 && object2 != null) {
            object = DataCallback.Companion.onSuccess(object2);
        } else {
            object2 = ApiErrorRepo.INSTANCE;
            int n3 = 28;
            object3 = dl2_22;
            object = ApiErrorRepo.handleApiError$default((ApiErrorRepo)object2, dl2_22, (String)object, false, null, null, n3, null);
        }
        return object;
    }

    private static final DataCallback verifyOtpAccessProfile$lambda$46(Function1 function1, Object object) {
        return (DataCallback)oj_0.a(function1, "$tmp0", object, "p0", object);
    }

    private static final DataCallback verifyOtpAccessProfile$lambda$47(String string2, Throwable throwable) {
        Intrinsics.checkNotNullParameter(string2, "$requestID");
        Intrinsics.checkNotNullParameter(throwable, "t");
        return ApiErrorRepo.handleApiException$default(ApiErrorRepo.INSTANCE, throwable, string2, false, null, null, 28, null);
    }

    private static final DataCallback verifyRILEmployeeProfile$lambda$48(String object, dl2_2 dl2_22) {
        Intrinsics.checkNotNullParameter(object, "$requestID");
        Intrinsics.checkNotNullParameter(dl2_22, "response");
        Object object2 = (AccessProfileOtpResponse)dl2_22.b;
        Object object3 = dl2_22.a;
        boolean bl2 = ((cl2_2)object3).d();
        if (bl2 && object2 != null) {
            object = DataCallback.Companion.onSuccess(object2);
        } else {
            object2 = ApiErrorRepo.INSTANCE;
            int n3 = 28;
            object3 = dl2_22;
            object = ApiErrorRepo.handleApiError$default((ApiErrorRepo)object2, dl2_22, (String)object, false, null, null, n3, null);
        }
        return object;
    }

    private static final DataCallback verifyRILEmployeeProfile$lambda$49(Function1 function1, Object object) {
        return (DataCallback)oj_0.a(function1, "$tmp0", object, "p0", object);
    }

    private static final DataCallback verifyRILEmployeeProfile$lambda$50(String string2, Throwable throwable) {
        Intrinsics.checkNotNullParameter(string2, "$requestID");
        Intrinsics.checkNotNullParameter(throwable, "t");
        return ApiErrorRepo.handleApiException$default(ApiErrorRepo.INSTANCE, throwable, string2, false, null, null, 28, null);
    }

    public static /* synthetic */ NewCustomEventsRevamp w() {
        return UserRepo.newCustomEventsRevamp_delegate$lambda$0();
    }

    public static /* synthetic */ DataCallback x(dl2_2 dl2_22) {
        return UserRepo.requestOtpMobileNumberUpdateUaas$lambda$30("request_otp_mobile_update", dl2_22);
    }

    public static /* synthetic */ DataCallback y(Throwable throwable) {
        return UserRepo.getCancelRequest$lambda$29("MyAccountsCancelRequest", throwable);
    }

    public static /* synthetic */ DataCallback z(dl2_2 dl2_22) {
        return UserRepo.requestOtpAccessProfile$lambda$36("request_otp_access_profile", dl2_22);
    }

    public final es0_2 deleteAccount(String object) {
        Object object2 = this.userInformation;
        boolean bl2 = ((UserInformation)object2).isUserOnline();
        if (bl2) {
            object2 = this.userInformation.getDisplayUid();
            Intrinsics.checkNotNull(object2);
        } else {
            object2 = "anonymous_uuid";
        }
        Object object3 = UrlHelper.Companion.getInstance();
        Object[] objectArray = new Object[]{object2};
        object2 = ((UrlHelper)object3).getApiUrl("login", "delete_account_api", objectArray);
        object3 = new DeleteAccountRequest((String)object);
        object = new UserRepo$deleteAccount$1(this, (String)object2, (DeleteAccountRequest)object3, null);
        object2 = new br2_2((Function2)object);
        object = new UserRepo$deleteAccount$$inlined$map$1((es0_2)object2);
        object2 = ir0_2.a;
        return ms0_1.m((es0_2)object, (CoroutineContext)object2);
    }

    public final void deleteUserInformation() {
        this.userInformation.reset();
        CookieManager.getInstance().removeAllCookies(null);
        CookieManager.getInstance().flush();
        this.appPreferences.removePreference("SALE_BTN_CLICKED");
    }

    public final g53_0 getCancelRequest() {
        Object object = UrlHelper.Companion.getInstance();
        Object object2 = new Object[]{};
        String string2 = ((UrlHelper)object).getApiUrl("my_account", "cancel_request", object2);
        HashMap<String, Object> hashMap = new HashMap<String, Object>();
        object = String.valueOf(this.userInformation.getUserPhoneNumber());
        hashMap.put("oldMobileNumber", object);
        object = this.userInformation.getUserEmailId().toString();
        hashMap.put("login", object);
        UserApi userApi = this.userApi;
        object = this.userInformation;
        Intrinsics.checkNotNullExpressionValue(object, "userInformation");
        object = ServiceUtil.getToken((UserInformation)object);
        String string3 = kp1_0.c("Bearer ", (String)object);
        String string4 = em_1.a(AJIOApplication.Companion);
        object = UserApi$DefaultImpls.getCancelRequest$default(userApi, string2, string3, "Android", string4, hashMap, "MyAccountsCancelRequest", null, 64, null);
        object2 = qt2_2.c;
        object = ((g53_0)object).h((Scheduler)object2);
        object2 = ti_2.a();
        object = ((g53_0)object).e((Scheduler)object2);
        object2 = new Object();
        Object object3 = new mz_2(object2);
        object2 = new s53_0((q63_0)object, (bx0_2)object3);
        object = new Object();
        object3 = new u53_0((q63_0)object2, (bx0_2)object);
        Intrinsics.checkNotNullExpressionValue(object3, "onErrorReturn(...)");
        return object3;
    }

    public final g53_0 getCohortBasedOnDeviceId(String object) {
        Object object2;
        Object object3 = null;
        int n3 = 1;
        Intrinsics.checkNotNullParameter(object, "requestID");
        Object object4 = this.getUserDeviceId();
        this.userInformation.setUserDeviceId((String)object4);
        FirebaseEvents.Companion.getInstance().updateDeviceIdTempDate((String)object4);
        Object object5 = h40_0.a;
        boolean bl2 = h40_0.Y0();
        String string2 = "login";
        if (bl2) {
            object5 = UrlHelper.Companion.getInstance();
            String string3 = "fetch_user_device_id_v2";
            object2 = new Object[n3];
            object2[0] = object4;
            object3 = ((UrlHelper)object5).getApiUrl(string2, string3, object2);
        } else {
            object5 = UrlHelper.Companion.getInstance();
            String string4 = "fetch_user_device_id";
            object2 = new Object[n3];
            object2[0] = object4;
            object3 = ((UrlHelper)object5).getApiUrl(string2, string4, object2);
        }
        object2 = this.userInformation;
        object4 = "userInformation";
        Intrinsics.checkNotNullExpressionValue(object2, (String)object4);
        object2 = ServiceUtil.getToken((UserInformation)object2);
        n3 = (int)(TextUtils.isEmpty((CharSequence)object2) ? 1 : 0);
        if (n3 == 0) {
            object2 = this.userInformation;
            Intrinsics.checkNotNullExpressionValue(object2, (String)object4);
            object2 = ServiceUtil.getToken((UserInformation)object2);
        } else {
            object2 = this.userInformation.getGuestAccessToken();
        }
        object4 = this.userApi;
        object5 = new StringBuilder("Bearer ");
        ((StringBuilder)object5).append((String)object2);
        object2 = ((StringBuilder)object5).toString();
        object3 = object4.getCohortBasedOnDeviceId((String)object3, (String)object2, (String)object);
        object2 = qt2_2.c;
        object3 = ((g53_0)object3).h((Scheduler)object2);
        object2 = ti_2.a();
        object3 = ((g53_0)object3).e((Scheduler)object2);
        object2 = new zx3_0(this, (String)object);
        object4 = new by3((zx3_0)object2);
        object2 = new s53_0((q63_0)object3, (bx0_2)object4);
        object3 = new cy3(this, (String)object);
        object = new u53_0((q63_0)object2, (bx0_2)object3);
        Intrinsics.checkNotNullExpressionValue(object, "onErrorReturn(...)");
        return object;
    }

    public final g53_0 getGpsData(GPSLocationData object) {
        Intrinsics.checkNotNullParameter(object, "gpsLocationData");
        Object object2 = UrlHelper.Companion.getInstance();
        Object object3 = new Object[]{};
        object2 = ((UrlHelper)object2).getApiUrl("homepage", "fetch_pincode", object3);
        object = this.userApi.getGpsData((String)object2, "BackGround_GET_GPS_DATA", (GPSLocationData)object);
        object2 = qt2_2.c;
        object = ((g53_0)object).h((Scheduler)object2);
        object2 = ti_2.a();
        object = ((g53_0)object).e((Scheduler)object2);
        object2 = new Object();
        object3 = new v3_0((Function1)object2);
        object2 = new s53_0((q63_0)object, (bx0_2)object3);
        object = new d4(1);
        object3 = new u53_0((q63_0)object2, (bx0_2)object);
        Intrinsics.checkNotNullExpressionValue(object3, "onErrorReturn(...)");
        return object3;
    }

    public final g53_0 getGpsDataPd(GPSLocationData object) {
        Intrinsics.checkNotNullParameter(object, "gpsLocationData");
        Object object2 = UrlHelper.Companion.getInstance();
        Object object3 = new Object[]{};
        object2 = ((UrlHelper)object2).getApiUrl("homepage", "fetch_pincode", object3);
        object = this.userApi.getGpsDataPD((String)object2, "BackGround_GET_GPS_DATA", (GPSLocationData)object);
        object2 = qt2_2.c;
        object = ((g53_0)object).h((Scheduler)object2);
        object2 = ti_2.a();
        object = ((g53_0)object).e((Scheduler)object2);
        object2 = new Object();
        object3 = new iy3((hy3)object2);
        object2 = new s53_0((q63_0)object, (bx0_2)object3);
        object = new Object();
        object3 = new u53_0((q63_0)object2, (bx0_2)object);
        Intrinsics.checkNotNullExpressionValue(object3, "onErrorReturn(...)");
        return object3;
    }

    public final g53_0 getStaticLinks() {
        Object object = UrlHelper.Companion.getInstance();
        Object object2 = new Object[]{};
        String string2 = ((UrlHelper)object).getApiUrl("my_account", "account_nav_bar", object2);
        object = UserApi$DefaultImpls.getStaticLinks$default(this.userApi, string2, "MyAccountsStaticLink", null, 4, null);
        object2 = qt2_2.c;
        object = ((g53_0)object).h((Scheduler)object2);
        object2 = ti_2.a();
        object = ((g53_0)object).e((Scheduler)object2);
        object2 = new Object();
        Object object3 = new Mx3((lx3_0)object2);
        object2 = new s53_0((q63_0)object, (bx0_2)object3);
        object = new Object();
        object3 = new u53_0((q63_0)object2, (bx0_2)object);
        Intrinsics.checkNotNullExpressionValue(object3, "onErrorReturn(...)");
        return object3;
    }

    public final UserInformation getUserInformation() {
        UserInformation userInformation = this.userInformation;
        Intrinsics.checkNotNullExpressionValue(userInformation, "userInformation");
        return userInformation;
    }

    public final g53_0 getUserProfile(boolean bl2) {
        Object object = UrlHelper.Companion.getInstance();
        Object object2 = new Object[]{};
        Object object3 = "my_account";
        String string2 = "get_profile_uaas";
        String string3 = ((UrlHelper)object).getApiUrl((String)object3, string2, object2);
        Object object4 = !bl2 ? "UserProfile" : "BackGround_UserProfile";
        UserApi userApi = this.userApi;
        object = this.userInformation;
        Intrinsics.checkNotNullExpressionValue(object, "userInformation");
        object = ServiceUtil.getToken((UserInformation)object);
        String string4 = kp1_0.c("Bearer ", (String)object);
        String string5 = em_1.a(AJIOApplication.Companion);
        object = UserApi$DefaultImpls.getUserProfile$default(userApi, string3, string4, "Android", string5, (String)object4, null, 32, null);
        object2 = qt2_2.c;
        object = ((g53_0)object).h((Scheduler)object2);
        object2 = ti_2.a();
        object = ((g53_0)object).e((Scheduler)object2);
        object2 = new ah0_0(1, this, object4);
        object3 = new py0_1(1, (Function1)object2);
        object2 = new s53_0((q63_0)object, (bx0_2)object3);
        object = new ox3_0(this, (String)object4);
        object4 = new u53_0((q63_0)object2, (bx0_2)object);
        Intrinsics.checkNotNullExpressionValue(object4, "onErrorReturn(...)");
        return object4;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final g53_0 getUserType(String object, String object2) {
        Object var3_3 = null;
        Intrinsics.checkNotNullParameter(object, "userId");
        Intrinsics.checkNotNullParameter(object2, "requestId");
        object2 = mz3_0.u((String)object2);
        this.startCustomerTypeApiTrace();
        Object object3 = FirebaseEvents.Companion.getInstance();
        Object object4 = this.userInformation.getEncryptedId();
        Object object5 = "getEncryptedId(...)";
        Intrinsics.checkNotNullExpressionValue(object4, (String)object5);
        ((FirebaseEvents)object3).updateUserHybrisId((String)object4);
        LinkedHashMap<String, Object> linkedHashMap = new LinkedHashMap<String, Object>();
        object3 = h40_0.a;
        boolean bl2 = h40_0.Y0();
        object4 = "login";
        if (bl2) {
            object = UrlHelper.Companion.getInstance();
            Object[] objectArray = new Object[]{};
            object = ((UrlHelper)object).getApiUrl((String)object4, "customertype_v2", objectArray);
            object3 = "";
            linkedHashMap.put("service", object3);
            String string2 = "store";
            linkedHashMap.put(string2, object3);
        } else {
            object3 = UrlHelper.Companion.getInstance();
            object5 = "customertype";
            int n3 = 1;
            Object[] objectArray = new Object[n3];
            objectArray[0] = object;
            object = ((UrlHelper)object3).getApiUrl((String)object4, (String)object5, objectArray);
        }
        object5 = object;
        linkedHashMap.put("client_type", "Android");
        AJIOApplication.Companion.getClass();
        object = p90.a((Context)AJIOApplication$a.a());
        linkedHashMap.put("client_version", object);
        object4 = this.userApi;
        object = this.userInformation;
        Intrinsics.checkNotNullExpressionValue(object, "userInformation");
        object = ServiceUtil.getToken((UserInformation)object);
        String string3 = kp1_0.c("Bearer ", (String)object);
        object = UserApi$DefaultImpls.getUserType$default((UserApi)object4, (String)object5, string3, (String)object2, linkedHashMap, null, 16, null);
        Scheduler scheduler = qt2_2.c;
        object = ((g53_0)object).h(scheduler);
        HandlerScheduler handlerScheduler = ti_2.a();
        object = ((g53_0)object).e(handlerScheduler);
        rx3_0 rx3_02 = new rx3_0(this, (String)object2);
        object3 = new uy0_2(rx3_02);
        s53_0 s53_02 = new s53_0((q63_0)object, (bx0_2)object3);
        object = new Sx3(this, (String)object2);
        object2 = new u53_0(s53_02, (bx0_2)object);
        Intrinsics.checkNotNullExpressionValue(object2, "onErrorReturn(...)");
        return object2;
    }

    public final boolean isDeveloperUser(String string2) {
        Intrinsics.checkNotNullParameter(string2, "userId");
        return b.i(this.userInformation.getUserId(), string2, true);
    }

    public final g53_0 logoutUser() {
        Object object = UrlHelper.Companion.getInstance();
        Object object2 = this.userInformation.getUserId();
        int n3 = 1;
        Object object3 = new Object[n3];
        object3[0] = object2;
        String string2 = ((UrlHelper)object).getApiUrl("login", "logout_uaas", object3);
        object = FirebaseEvents.Companion.getInstance();
        object2 = this.userInformation;
        object3 = "userInformation";
        Intrinsics.checkNotNullExpressionValue(object2, (String)object3);
        ((FirebaseEvents)object).logLogoutEvent((UserInformation)object2);
        object = this.userInformation;
        Intrinsics.checkNotNullExpressionValue(object, (String)object3);
        object = ServiceUtil.getToken((UserInformation)object);
        object2 = new StringBuilder("Bearer ");
        ((StringBuilder)object2).append((String)object);
        String string3 = ((StringBuilder)object2).toString();
        this.deleteUserInformation();
        AJIOApplication.Companion.getClass();
        object = AJIOApplication$a.a();
        Intrinsics.checkNotNullParameter(object, "context");
        object2 = new jo_2((Context)object);
        ((sw_0)object2).removePreference("HAS_SHOWS_COUPON_BONANZA_BENEFITS_DURING_SALE");
        ((sw_0)object2).removePreference("COUPON_BONANZA_SALE_END_TIME");
        this.appPreferences.removePreference("jwt_token");
        UserApi userApi = this.userApi;
        String string4 = p90.a((Context)AJIOApplication$a.a());
        object = UserApi$DefaultImpls.logoutUser$default(userApi, string2, string3, "Logout_user", "Android", string4, null, 32, null);
        object2 = qt2_2.c;
        object = ((g53_0)object).h((Scheduler)object2);
        object2 = ti_2.a();
        object = ((g53_0)object).e((Scheduler)object2);
        object2 = new jy1_2(this, n3);
        Object object4 = new fy3((jy1_2)object2);
        object2 = new s53_0((q63_0)object, (bx0_2)object4);
        object = new hz_2(this);
        object4 = new u53_0((q63_0)object2, (bx0_2)object);
        Intrinsics.checkNotNullExpressionValue(object4, "onErrorReturn(...)");
        return object4;
    }

    public final g53_0 requestEmailUpdate(ChangeEmail object) {
        Intrinsics.checkNotNullParameter(object, "changeEmail");
        QueryProfile queryProfile = new QueryProfile();
        String string2 = ((ChangeEmail)object).getEmail();
        queryProfile.setEmailId(string2);
        object = ((ChangeEmail)object).getPassword();
        queryProfile.setCurrentPassword((String)object);
        return this.updateUserProfile(queryProfile);
    }

    public final g53_0 requestOtpAccessProfile(QueryCustomer object) {
        Intrinsics.checkNotNullParameter(object, "queryCustomer");
        Object object2 = UrlHelper.Companion.getInstance();
        Object object3 = new Object[]{};
        String string2 = "my_account";
        String string3 = "access_profile_otp_request_uaas";
        String string4 = ((UrlHelper)object2).getApiUrl(string2, string3, object3);
        HashMap<Object, Object> hashMap = new HashMap<Object, Object>();
        object2 = ((QueryCustomer)object).getMobileNumber();
        if (object2 != null) {
            object2 = ((QueryCustomer)object).getMobileNumber();
            object2 = object2 != null ? ((Object)StringsKt.m0((CharSequence)object2)).toString() : null;
            object2 = String.valueOf(object2);
            object3 = "mobileNumber";
            hashMap.put(object3, object2);
        }
        if ((object2 = ((QueryCustomer)object).getEmail()) != null) {
            object2 = "emailId";
            object = ((QueryCustomer)object).getEmail();
            hashMap.put(object2, object);
        }
        UserApi userApi = this.userApi;
        object = this.userInformation;
        Intrinsics.checkNotNullExpressionValue(object, "userInformation");
        object = ServiceUtil.getToken((UserInformation)object);
        String string5 = kp1_0.c("Bearer ", (String)object);
        String string6 = em_1.a(AJIOApplication.Companion);
        object = UserApi$DefaultImpls.requestOtpForAccessProfile$default(userApi, string4, string5, "Android", string6, hashMap, "request_otp_access_profile", null, 64, null);
        object2 = qt2_2.c;
        object = ((g53_0)object).h((Scheduler)object2);
        object2 = ti_2.a();
        object = ((g53_0)object).e((Scheduler)object2);
        object2 = new Object();
        object3 = new hx3_0((Gx3)object2);
        object2 = new s53_0((q63_0)object, (bx0_2)object3);
        object = new Object();
        object3 = new u53_0((q63_0)object2, (bx0_2)object);
        Intrinsics.checkNotNullExpressionValue(object3, "onErrorReturn(...)");
        return object3;
    }

    public final g53_0 requestOtpMobileNumberUpdateUaas(QueryCustomer queryCustomer) {
        UserRepo userRepo = this;
        Object object = queryCustomer;
        Intrinsics.checkNotNullParameter(queryCustomer, "queryCustomer");
        Object object2 = UrlHelper.Companion.getInstance();
        Object object3 = new Object[]{};
        Object object4 = "my_account";
        String string2 = "access_profile_otp_request_uaas";
        String string3 = ((UrlHelper)object2).getApiUrl((String)object4, string2, object3);
        object2 = new HashMap();
        object3 = queryCustomer.getMobileNumber();
        if (object3 != null) {
            object3 = queryCustomer.getMobileNumber();
            Intrinsics.checkNotNullExpressionValue(object3, "getMobileNumber(...)");
            object3 = ((Object)StringsKt.m0((CharSequence)object3)).toString();
            object4 = "mobileNumber";
            ((HashMap)object2).put(object4, object3);
        }
        if ((object3 = queryCustomer.getEmail()) != null) {
            object3 = "emailId";
            object4 = queryCustomer.getEmail();
            ((HashMap)object2).put(object3, object4);
        }
        boolean bl2 = queryCustomer.isEmailUpdateWithoutPassword();
        object3 = "onErrorReturn(...)";
        object4 = "Bearer ";
        string2 = "userInformation";
        String string4 = "request_otp_mobile_update";
        if (bl2) {
            UserApi userApi = userRepo.userApi;
            object = userRepo.userInformation;
            Intrinsics.checkNotNullExpressionValue(object, string2);
            object = ServiceUtil.getToken((UserInformation)object);
            String string5 = kp1_0.c((String)object4, (String)object);
            String string6 = em_1.a(AJIOApplication.Companion);
            Boolean bl3 = Boolean.TRUE;
            object2 = UserApi$DefaultImpls.requestOtpForProfileEmail$default(userApi, string3, string5, "Android", string6, bl3, object2, string4, null, 128, null);
            object = qt2_2.c;
            object2 = ((g53_0)object2).h((Scheduler)object);
            object = ti_2.a();
            object2 = ((g53_0)object2).e((Scheduler)object);
            object = new Object();
            object4 = new q13_0((Function1)object);
            object = new s53_0((q63_0)object2, (bx0_2)object4);
            object2 = new Object();
            object4 = new u53_0((q63_0)object, (bx0_2)object2);
            Intrinsics.checkNotNullExpressionValue(object4, (String)object3);
            return object4;
        }
        UserApi userApi = userRepo.userApi;
        object = userRepo.userInformation;
        Intrinsics.checkNotNullExpressionValue(object, string2);
        object = ServiceUtil.getToken((UserInformation)object);
        String string7 = kp1_0.c((String)object4, (String)object);
        String string8 = em_1.a(AJIOApplication.Companion);
        HashMap<String, Object[]> hashMap = object2;
        object2 = UserApi$DefaultImpls.requestOtpForProfileMobile$default(userApi, string3, string7, "Android", string8, object2, string4, null, 64, null);
        object = qt2_2.c;
        object2 = ((g53_0)object2).h((Scheduler)object);
        object = ti_2.a();
        object2 = ((g53_0)object2).e((Scheduler)object);
        object = new Object();
        object4 = new xx3_0((wx3_0)object);
        object = new s53_0((q63_0)object2, (bx0_2)object4);
        object2 = new Object();
        object4 = new u53_0((q63_0)object, (bx0_2)object2);
        Intrinsics.checkNotNullExpressionValue(object4, (String)object3);
        return object4;
    }

    public final g53_0 requestOtpTokenForMobileUpdate(QueryCustomer queryCustomer) {
        Intrinsics.checkNotNullParameter(queryCustomer, "queryCustomer");
        return this.requestOtpMobileNumberUpdateUaas(queryCustomer);
    }

    public final g53_0 requestOtpVerifyRILEmplProfile(QueryCustomer object) {
        Intrinsics.checkNotNullParameter(object, "queryCustomer");
        Object object2 = UrlHelper.Companion.getInstance();
        Object object3 = new Object[]{};
        String string2 = "my_account";
        String string3 = "verify_ril_email_otp_request_uaas";
        String string4 = ((UrlHelper)object2).getApiUrl(string2, string3, object3);
        HashMap<Object, Object> hashMap = new HashMap<Object, Object>();
        object2 = ((QueryCustomer)object).getMobileNumber();
        if (object2 != null) {
            object2 = ((QueryCustomer)object).getMobileNumber();
            object2 = object2 != null ? ((Object)StringsKt.m0((CharSequence)object2)).toString() : null;
            object2 = String.valueOf(object2);
            object3 = "mobileNumber";
            hashMap.put(object3, object2);
        }
        if ((object2 = ((QueryCustomer)object).getEmail()) != null) {
            object2 = "emailId";
            object = ((QueryCustomer)object).getEmail();
            hashMap.put(object2, object);
        }
        UserApi userApi = this.userApi;
        object = this.userInformation;
        Intrinsics.checkNotNullExpressionValue(object, "userInformation");
        object = ServiceUtil.getToken((UserInformation)object);
        String string5 = kp1_0.c("Bearer ", (String)object);
        String string6 = em_1.a(AJIOApplication.Companion);
        object = UserApi$DefaultImpls.requestOtpForAccessProfile$default(userApi, string4, string5, "Android", string6, hashMap, "request_otp_ril_profile", null, 64, null);
        object2 = qt2_2.c;
        object = ((g53_0)object).h((Scheduler)object2);
        object2 = ti_2.a();
        object = ((g53_0)object).e((Scheduler)object2);
        object2 = new Object();
        object3 = new ke_1(object2);
        object2 = new s53_0((q63_0)object, (bx0_2)object3);
        object = new Object();
        object3 = new u53_0((q63_0)object2, (bx0_2)object);
        Intrinsics.checkNotNullExpressionValue(object3, "onErrorReturn(...)");
        return object3;
    }

    public final g53_0 updateUserMobileNumberProfile(QueryProfile queryProfile) {
        Intrinsics.checkNotNullParameter(queryProfile, "queryProfile");
        Object object = UrlHelper.Companion.getInstance();
        String string2 = this.userInformation.getUserId();
        Object[] objectArray = new Object[]{string2};
        object = ((UrlHelper)object).getApiUrl("my_account", "change_mobile_number_request", objectArray);
        return this.updateUserProfileUaasRequest((String)object, "UpdateUserProfileRequest", queryProfile);
    }

    public final g53_0 updateUserProfile(QueryProfile queryProfile) {
        Intrinsics.checkNotNullParameter(queryProfile, "queryProfile");
        Object object = UrlHelper.Companion.getInstance();
        String string2 = this.userInformation.getUserId();
        Object[] objectArray = new Object[]{string2};
        object = ((UrlHelper)object).getApiUrl("my_account", "profile_update_uaas", objectArray);
        return this.updateUserProfileUaas((String)object, "UpdateUserProfile", queryProfile);
    }

    public final es0_2 updateUserProfileUaasFlow(QueryProfile object) {
        int n3;
        Intrinsics.checkNotNullParameter(object, "queryProfile");
        Object object2 = UrlHelper.Companion.getInstance();
        String string2 = this.userInformation.getUserId();
        int n4 = 1;
        Object object3 = new Object[n4];
        object3[0] = string2;
        string2 = "my_account";
        String string3 = "profile_update_uaas";
        String string4 = ((UrlHelper)object2).getApiUrl(string2, string3, object3);
        HashMap<Object, Object> hashMap = new HashMap<Object, Object>();
        object2 = ((QueryProfile)object).getFirstName();
        if (object2 != null) {
            object2 = "firstName";
            string2 = ((QueryProfile)object).getFirstName();
            hashMap.put(object2, string2);
        }
        if ((object2 = ((QueryProfile)object).getLastName()) != null) {
            object2 = "lastName";
            string2 = ((QueryProfile)object).getLastName();
            hashMap.put(object2, string2);
        }
        if ((object2 = ((QueryProfile)object).getScreenName()) != null) {
            object2 = "screenName";
            string2 = ((QueryProfile)object).getScreenName();
            hashMap.put(object2, string2);
        }
        if ((object2 = ((QueryProfile)object).getNewPassword()) != null && (n3 = object2.length()) != 0) {
            object2 = "newPassword";
            string2 = ((QueryProfile)object).getNewPassword();
            hashMap.put(object2, string2);
        }
        if ((object2 = ((QueryProfile)object).getConfirmPassword()) != null && (n3 = object2.length()) != 0) {
            object2 = "confirmPassword";
            string2 = ((QueryProfile)object).getConfirmPassword();
            hashMap.put(object2, string2);
        }
        if ((object2 = ((QueryProfile)object).getGender()) != null) {
            object2 = "genderType";
            string2 = ((QueryProfile)object).getGender();
            hashMap.put(object2, string2);
        }
        if ((object2 = ((QueryProfile)object).getDateOfBirth()) != null) {
            object2 = "dateOfBirth";
            string2 = ((QueryProfile)object).getDateOfBirth();
            hashMap.put(object2, string2);
        }
        object2 = ((QueryProfile)object).getMobileNumber();
        string2 = null;
        if (object2 != null) {
            object2 = ((QueryProfile)object).getMobileNumber();
            if (object2 != null) {
                object2 = ((Object)StringsKt.m0((CharSequence)object2)).toString();
            } else {
                n3 = 0;
                object2 = null;
            }
            object2 = String.valueOf(object2);
            object3 = "mobileNumber";
            hashMap.put(object3, object2);
        }
        if ((object2 = ((QueryProfile)object).getOtp()) != null) {
            object2 = "otp";
            object3 = ((QueryProfile)object).getOtp();
            hashMap.put(object2, object3);
        }
        if ((object2 = ((QueryProfile)object).getEmailId()) != null) {
            object2 = "emailId";
            object3 = ((QueryProfile)object).getEmailId();
            hashMap.put(object2, object3);
        }
        if ((object2 = ((QueryProfile)object).getCurrentPassword()) != null) {
            object2 = "currentPassword";
            object = ((QueryProfile)object).getCurrentPassword();
            hashMap.put(object2, object);
        }
        object = this.userInformation.getUserEmailId();
        hashMap.put("login", object);
        object2 = "UpdateUserProfile";
        object = new UserRepo$updateUserProfileUaasFlow$1(this, string4, hashMap, (String)object2, null);
        object3 = new br2_2((Function2)object);
        object = ir0_2.a;
        object = em0_2.b;
        object = ms0_1.m((es0_2)object3, (CoroutineContext)object);
        object3 = new UserRepo$updateUserProfileUaasFlow$2((String)object2, null);
        object2 = new at0_1((es0_2)object, (gx0_2)object3);
        return object2;
    }

    public final g53_0 validateSession() {
        Object object = UrlHelper.Companion.getInstance();
        Object object2 = new Object[]{};
        object = ((UrlHelper)object).getApiUrl("login", "ucpValidSession", (Object[])object2);
        object2 = new HashMap();
        Object object3 = this.userInformation.getUcpAccessToken();
        StringBuilder stringBuilder = new StringBuilder("Bearer ");
        stringBuilder.append((String)object3);
        object3 = stringBuilder.toString();
        ((HashMap)object2).put("Authorization", object3);
        ((HashMap)object2).put("client_id", "074297cf-f238-4c48-8cbc-7c14fd07a8f9");
        ((HashMap)object2).put("RequestId", "validateSession");
        object = this.userApi.validateSession((String)object, (HashMap)object2);
        object2 = qt2_2.c;
        object = ((g53_0)object).h((Scheduler)object2);
        object2 = ti_2.a();
        object = ((g53_0)object).e((Scheduler)object2);
        object2 = new Object();
        object3 = new vu2_0((Function1)object2);
        object2 = new s53_0((q63_0)object, (bx0_2)object3);
        object = new Object();
        object3 = new u53_0((q63_0)object2, (bx0_2)object);
        Intrinsics.checkNotNullExpressionValue(object3, "onErrorReturn(...)");
        return object3;
    }

    public final g53_0 verifyOtpAccessProfile(QueryCustomer object) {
        int n3;
        Intrinsics.checkNotNullParameter(object, "queryCustomer");
        Object object2 = UrlHelper.Companion.getInstance();
        Object object3 = new Object[]{};
        String string2 = "my_account";
        String string3 = "access_profile_otp_verify_uaas";
        String string4 = ((UrlHelper)object2).getApiUrl(string2, string3, object3);
        HashMap<Object, Object> hashMap = new HashMap<Object, Object>();
        object2 = ((QueryCustomer)object).getMobileNumber();
        if (object2 != null) {
            object2 = ((QueryCustomer)object).getMobileNumber();
            if (object2 != null) {
                object2 = ((Object)StringsKt.m0((CharSequence)object2)).toString();
            } else {
                n3 = 0;
                object2 = null;
            }
            object2 = String.valueOf(object2);
            object3 = "mobileNumber";
            hashMap.put(object3, object2);
        }
        if ((object2 = ((QueryCustomer)object).getOtp()) != null) {
            object2 = "otp";
            object3 = ((QueryCustomer)object).getOtp();
            hashMap.put(object2, object3);
        }
        object2 = ((QueryCustomer)object).getAdId();
        object3 = "adId";
        if (object2 != null && (n3 = ((String)object2).length()) != 0) {
            object = ((QueryCustomer)object).getAdId();
            hashMap.put(object3, object);
        }
        if ((object = this.appPreferences.a()) == null) {
            object = "";
        }
        hashMap.put(object3, object);
        UserApi userApi = this.userApi;
        object = this.userInformation;
        Intrinsics.checkNotNullExpressionValue(object, "userInformation");
        object = ServiceUtil.getToken((UserInformation)object);
        String string5 = kp1_0.c("Bearer ", (String)object);
        String string6 = em_1.a(AJIOApplication.Companion);
        object = UserApi$DefaultImpls.verifyOtpForAccessProfile$default(userApi, string4, string5, "Android", string6, hashMap, "verify_otp_access_profile", null, 64, null);
        object2 = qt2_2.c;
        object = ((g53_0)object).h((Scheduler)object2);
        object2 = ti_2.a();
        object = ((g53_0)object).e((Scheduler)object2);
        object2 = new Object();
        object3 = new k13_0((Function1)object2);
        object2 = new s53_0((q63_0)object, (bx0_2)object3);
        object = new Object();
        object3 = new u53_0((q63_0)object2, (bx0_2)object);
        Intrinsics.checkNotNullExpressionValue(object3, "onErrorReturn(...)");
        return object3;
    }

    public final g53_0 verifyRILEmployeeProfile(QueryCustomer object) {
        int n3;
        Intrinsics.checkNotNullParameter(object, "queryCustomer");
        Object object2 = UrlHelper.Companion.getInstance();
        Object object3 = new Object[]{};
        String string2 = "my_account";
        String string3 = "verify_ril_profile_otp_uaas";
        String string4 = ((UrlHelper)object2).getApiUrl(string2, string3, object3);
        HashMap<Object, Object> hashMap = new HashMap<Object, Object>();
        object2 = ((QueryCustomer)object).getMobileNumber();
        object3 = null;
        if (object2 != null) {
            object2 = ((QueryCustomer)object).getMobileNumber();
            if (object2 != null) {
                object2 = ((Object)StringsKt.m0((CharSequence)object2)).toString();
            } else {
                n3 = 0;
                object2 = null;
            }
            object2 = String.valueOf(object2);
            string2 = "mobileNumber";
            hashMap.put(string2, object2);
        }
        if ((object2 = ((QueryCustomer)object).getEmail()) != null) {
            object2 = ((QueryCustomer)object).getEmail();
            if (object2 != null) {
                object2 = StringsKt.m0((CharSequence)object2);
                object3 = object2.toString();
            }
            object2 = String.valueOf(object3);
            object3 = "emailId";
            hashMap.put(object3, object2);
        }
        if ((object2 = ((QueryCustomer)object).getOtp()) != null) {
            object2 = "otp";
            object3 = ((QueryCustomer)object).getOtp();
            hashMap.put(object2, object3);
        }
        object2 = ((QueryCustomer)object).getAdId();
        object3 = "adId";
        if (object2 != null && (n3 = ((String)object2).length()) != 0) {
            object = ((QueryCustomer)object).getAdId();
            hashMap.put(object3, object);
        }
        if ((object = this.appPreferences.a()) == null) {
            object = "";
        }
        hashMap.put(object3, object);
        UserApi userApi = this.userApi;
        object = this.userInformation;
        Intrinsics.checkNotNullExpressionValue(object, "userInformation");
        object = ServiceUtil.getToken((UserInformation)object);
        String string5 = kp1_0.c("Bearer ", (String)object);
        String string6 = em_1.a(AJIOApplication.Companion);
        object = UserApi$DefaultImpls.verifyOtpForAccessProfile$default(userApi, string4, string5, "Android", string6, hashMap, "verify_otp_ril_profile", null, 64, null);
        object2 = qt2_2.c;
        object = ((g53_0)object).h((Scheduler)object2);
        object2 = ti_2.a();
        object = ((g53_0)object).e((Scheduler)object2);
        object2 = new a72_0(1);
        object3 = new ri0_2(object2);
        object2 = new s53_0((q63_0)object, (bx0_2)object3);
        object = new Object();
        object3 = new u53_0((q63_0)object2, (bx0_2)object);
        Intrinsics.checkNotNullExpressionValue(object3, "onErrorReturn(...)");
        return object3;
    }
}

