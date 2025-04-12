/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Application
 *  android.content.Context
 *  org.json.JSONObject
 */
package com.ril.ajio.data.repo;

import android.app.Application;
import android.content.Context;
import com.ajio.ril.core.network.AnonymousToken;
import com.ajio.ril.core.network.model.DataError;
import com.ajio.ril.core.network.model.DataError$ErrorMessage;
import com.ril.ajio.data.repo.ApiErrorRepo;
import com.ril.ajio.data.repo.BaseRepo;
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.data.repo.LoginRepository$checkAccount$1;
import com.ril.ajio.data.repo.LoginRepository$checkAccount$2;
import com.ril.ajio.data.repo.LoginRepository$getLoginSignupBenefitsBanner$1;
import com.ril.ajio.data.repo.LoginRepository$getLoginSignupBenefitsBanner$2;
import com.ril.ajio.data.repo.LoginRepository$getLoginTokensUcp$1;
import com.ril.ajio.data.repo.LoginRepository$loginAnonymousUser$1;
import com.ril.ajio.data.repo.LoginRepository$loginAnonymousUser$2;
import com.ril.ajio.data.repo.LoginRepository$loginUser$1;
import com.ril.ajio.data.repo.LoginRepository$loginUser$2;
import com.ril.ajio.data.repo.LoginRepository$newRegistrationAndLogin$1;
import com.ril.ajio.data.repo.LoginRepository$newRegistrationAndLogin$2;
import com.ril.ajio.data.repo.LoginRepository$otpRequest$1;
import com.ril.ajio.data.repo.LoginRepository$otpRequest$2;
import com.ril.ajio.data.repo.LoginRepository$registerAndLogin$1;
import com.ril.ajio.data.repo.LoginRepository$registerAndLogin$2;
import com.ril.ajio.data.repo.LoginRepository$resetPasswordWithToken$1;
import com.ril.ajio.data.repo.LoginRepository$resetPasswordWithToken$2;
import com.ril.ajio.data.repo.LoginRepository$sendOtp$1;
import com.ril.ajio.data.repo.LoginRepository$sendOtp$2;
import com.ril.ajio.data.repo.UserRepo;
import com.ril.ajio.services.data.Login.Data;
import com.ril.ajio.services.data.Login.QueryResetPassword;
import com.ril.ajio.services.data.Login.QueryValidateOTP;
import com.ril.ajio.services.data.Login.UcpToken;
import com.ril.ajio.services.data.Login.UcpTokenRequest;
import com.ril.ajio.services.data.user.AccountCheckResponse;
import com.ril.ajio.services.data.user.UserInformation;
import com.ril.ajio.services.data.user.UserInformationModel;
import com.ril.ajio.services.helper.UrlHelper;
import com.ril.ajio.services.network.api.LoginApi;
import com.ril.ajio.services.network.connector.AjioApiConnector;
import com.ril.ajio.services.query.QueryCustomer;
import com.ril.ajio.services.query.QueryProfile;
import com.ril.ajio.services.utils.ServiceUtil;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.text.StringsKt;
import kotlin.text.b;
import org.json.JSONObject;

public class LoginRepository
implements BaseRepo {
    public static final int $stable = 8;
    private final jo_2 appPreferences;
    private String client_id;
    private String client_secret;
    private final LoginApi loginApi;
    private final Context mContext;
    private final UserInformation userInformation;
    private final UserRepo userRepo;

    public LoginRepository(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Object object = AjioApiConnector.INSTANCE.getLoginApi();
        this.loginApi = object;
        this.userInformation = object = UserInformation.getInstance(context);
        this.appPreferences = object = new jo_2(context);
        Context context2 = context;
        context2 = (Application)context;
        this.userRepo = object = new UserRepo((Application)context2);
        this.mContext = context;
        this.client_id = "trusted_client";
        this.client_secret = "secret";
    }

    public static final /* synthetic */ void access$checkForExistingUser(LoginRepository loginRepository, AccountCheckResponse accountCheckResponse) {
        loginRepository.checkForExistingUser(accountCheckResponse);
    }

    public static final /* synthetic */ DataError access$createDataError(LoginRepository loginRepository, String string2) {
        return loginRepository.createDataError(string2);
    }

    public static final /* synthetic */ LoginApi access$getLoginApi$p(LoginRepository loginRepository) {
        return loginRepository.loginApi;
    }

    public static final /* synthetic */ UserInformation access$getUserInformation$p(LoginRepository loginRepository) {
        return loginRepository.userInformation;
    }

    public static final /* synthetic */ DataCallback access$handleApiError(LoginRepository loginRepository, String string2, dl2_2 dl2_22, String string3, boolean bl2, String string4) {
        return loginRepository.handleApiError(string2, dl2_22, string3, bl2, string4);
    }

    public static final /* synthetic */ DataError access$logApiError(LoginRepository loginRepository, String string2, dl2_2 dl2_22, String string3, boolean bl2, String string4) {
        return loginRepository.logApiError(string2, dl2_22, string3, bl2, string4);
    }

    public static final /* synthetic */ void access$saveAnonymousUserInformation(LoginRepository loginRepository, UserInformationModel userInformationModel) {
        loginRepository.saveAnonymousUserInformation(userInformationModel);
    }

    public static final /* synthetic */ void access$saveUcpTokens(LoginRepository loginRepository, UcpToken ucpToken) {
        loginRepository.saveUcpTokens(ucpToken);
    }

    public static final /* synthetic */ void access$saveUserInformation(LoginRepository loginRepository, UserInformationModel userInformationModel, String string2, String string3) {
        loginRepository.saveUserInformation(userInformationModel, string2, string3);
    }

    private final void checkForExistingUser(AccountCheckResponse accountCheckResponse) {
        boolean bl2;
        boolean bl3 = accountCheckResponse.isSuccess();
        if (bl3 == (bl2 = true)) {
            bl3 = false;
            accountCheckResponse = null;
            bv1_0.a = null;
        }
    }

    private final DataError createDataError(String string2) {
        boolean bl2;
        DataError dataError = new DataError();
        Object object = new JSONObject(string2);
        dataError.isException = bl2 = object.getBoolean("isException");
        string2 = object.getJSONArray("errors");
        object = new ArrayList();
        int n3 = string2.length();
        for (int i3 = 0; i3 < n3; ++i3) {
            Object object2 = string2.getJSONObject(i3);
            DataError$ErrorMessage dataError$ErrorMessage = new DataError$ErrorMessage();
            String string3 = object2.getString("message");
            dataError$ErrorMessage.setMessage(string3);
            string3 = object2.getString("type");
            dataError$ErrorMessage.setType(string3);
            string3 = object2.getString("description");
            dataError$ErrorMessage.setDescription(string3);
            string3 = "code";
            object2 = object2.getString(string3);
            dataError$ErrorMessage.setCode((String)object2);
            object.add(dataError$ErrorMessage);
        }
        dataError.setErrors((List)object);
        return dataError;
    }

    private final DataCallback handleApiError(String string2, dl2_2 dl2_22, String string3, boolean bl2, String string4) {
        return ApiErrorRepo.handleApiError$default(ApiErrorRepo.INSTANCE, string2, dl2_22, string3, bl2, string4, null, 32, null);
    }

    private final DataError logApiError(String string2, dl2_2 dl2_22, String string3, boolean bl2, String string4) {
        return ApiErrorRepo.logApiError$default(ApiErrorRepo.INSTANCE, string2, dl2_22, string3, bl2, string4, null, 32, null);
    }

    private final void saveAnonymousUserInformation(UserInformationModel userInformationModel) {
        UserInformation userInformation = this.userInformation;
        userInformation.setUserId("anonymous");
        userInformation.setTokenInvalid(false);
        userInformation.setLoggedInStatus("Guest");
        String string2 = userInformationModel.getAccess_token();
        userInformation.setGuestAccessToken(string2);
        AnonymousToken.setAccessToken(userInformationModel.getAccess_token());
    }

    private final void saveUcpTokens(UcpToken object) {
        int n3;
        object = ((Iterable)((UcpToken)object).getData()).iterator();
        while ((n3 = object.hasNext()) != 0) {
            long l2;
            boolean bl2;
            String string2;
            boolean bl3;
            Object object2 = (Data)object.next();
            long l3 = Calendar.getInstance().getTimeInMillis();
            UserInformation userInformation = this.userInformation;
            userInformation.setIssuedOn(l3);
            Object object3 = ((Data)object2).getTokenProvider();
            if (object3 != null && (bl3 = StringsKt.F((CharSequence)object3, string2 = "ucp", bl2 = true)) == bl2) {
                object3 = this.userInformation;
                string2 = ((Data)object2).getAccessToken();
                ((UserInformation)object3).setUcpAccessToken(string2);
                object3 = this.userInformation;
                string2 = ((Data)object2).getRefreshToken();
                ((UserInformation)object3).setUcpRefreshToken(string2);
                object3 = this.userInformation;
                n3 = ((Data)object2).getExpires();
                l2 = n3;
                object2 = l2;
                ((UserInformation)object3).setUcpTokenExpires((Long)object2);
                continue;
            }
            object3 = this.userInformation;
            string2 = ((Data)object2).getAccessToken();
            ((UserInformation)object3).setAccessToken(string2);
            object3 = this.userInformation;
            string2 = ((Data)object2).getRefreshToken();
            ((UserInformation)object3).setRefreshToken(string2);
            object3 = this.userInformation;
            n3 = ((Data)object2).getExpires();
            l2 = n3;
            ((UserInformation)object3).setExpires_in(l2);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final void saveUserInformation(UserInformationModel object, String object2, String objectArray) {
        block9: {
            IllegalArgumentException illegalArgumentException2;
            block10: {
                int n3;
                UserInformation userInformation;
                block8: {
                    int n4;
                    long l2 = Calendar.getInstance().getTimeInMillis();
                    userInformation = this.userInformation;
                    userInformation.setIssuedOn(l2);
                    l2 = ((UserInformationModel)object).getExpires_in();
                    userInformation.setExpires_in(l2);
                    userInformation.setTokenInvalid(false);
                    if (objectArray != null) {
                        userInformation.setLoggedInStatus((String)objectArray);
                    }
                    if ((objectArray = ((UserInformationModel)object).getRefresh_token()) != null && (n4 = objectArray.length()) != 0) {
                        objectArray = ((UserInformationModel)object).getRefresh_token();
                        userInformation.setRefreshToken((String)objectArray);
                    }
                    if ((objectArray = ((UserInformationModel)object).getAccess_token()) != null && (n4 = objectArray.length()) != 0) {
                        object = ((UserInformationModel)object).getAccess_token();
                        userInformation.setAccessToken((String)object);
                    }
                    if (object2 != null) {
                        try {
                            n3 = ((String)object2).length();
                            if (n3 == 0) break block8;
                            userInformation.setUserId((String)object2);
                            break block9;
                        }
                        catch (IllegalArgumentException illegalArgumentException2) {
                            break block10;
                        }
                    }
                }
                object = h40_0.a;
                n3 = (int)(h40_0.X0() ? 1 : 0);
                if (n3 != 0) {
                    object = "optionalemailiduser";
                    userInformation.setUserId((String)object);
                    break block9;
                } else {
                    object = "";
                    userInformation.setUserId((String)object);
                }
                break block9;
            }
            object2 = yn3_0.a;
            ((yn3$a)object2).l("LoginRepository");
            String string2 = illegalArgumentException2.getMessage();
            string2 = kp1_0.c("IllegalArgumentException: ", string2);
            objectArray = new Object[]{};
            ((yn3$a)object2).d(string2, objectArray);
        }
        ap_0.c = null;
        ap_0.b.removePreference("cart_id");
    }

    public final es0_2 checkAccount(QueryCustomer object, String object2) {
        Intrinsics.checkNotNullParameter(object, "queryCustomer");
        Intrinsics.checkNotNullParameter(object2, "screenName");
        Object object3 = UrlHelper.Companion.getInstance();
        Object[] objectArray = new Object[]{};
        Object object4 = "login";
        String string2 = "account_check_uaas";
        String string3 = ((UrlHelper)object3).getApiUrl((String)object4, string2, objectArray);
        HashMap<Object, Object> hashMap = new HashMap<Object, Object>();
        boolean bl2 = ((QueryCustomer)object).isMobileNumberEnterered();
        objectArray = null;
        if (bl2 && (object3 = ((QueryCustomer)object).getMobileNumber()) != null) {
            object3 = ((QueryCustomer)object).getMobileNumber();
            if (object3 != null) {
                object3 = ((Object)StringsKt.m0((CharSequence)object3)).toString();
            } else {
                bl2 = false;
                object3 = null;
            }
            object3 = String.valueOf(object3);
            object4 = "mobileNumber";
            hashMap.put(object4, object3);
        } else {
            object3 = ((QueryCustomer)object).getEmail();
            if (object3 != null) {
                object3 = "emailId";
                object4 = ((QueryCustomer)object).getEmail();
                hashMap.put(object3, object4);
            }
        }
        object3 = ((QueryCustomer)object).getProfileId();
        if (object3 != null) {
            object3 = "profileId";
            object = ((QueryCustomer)object).getProfileId();
            hashMap.put(object3, object);
        }
        object3 = "account_check";
        object = new LoginRepository$checkAccount$1(this, string3, hashMap, (String)object3, (String)object2, null);
        object4 = new br2_2((Function2)object);
        object = ir0_2.a;
        object = em0_2.b;
        object = ms0_1.m((es0_2)object4, (CoroutineContext)object);
        object4 = new LoginRepository$checkAccount$2(this, (String)object3, (String)object2, null);
        object2 = new at0_1((es0_2)object, (gx0_2)object4);
        return object2;
    }

    public final es0_2 forgotResetUserPassword(QueryValidateOTP object, String object2) {
        Intrinsics.checkNotNullParameter(object, "queryValidateOTP");
        Intrinsics.checkNotNullParameter(object2, "screenName");
        object2 = new QueryProfile();
        ((QueryProfile)object2).setFirstName(null);
        ((QueryProfile)object2).setLastName(null);
        ((QueryProfile)object2).setScreenName(null);
        ((QueryProfile)object2).setGender(null);
        ((QueryProfile)object2).setDateOfBirth(null);
        ((QueryProfile)object2).setMobileNumber(null);
        ((QueryProfile)object2).setOtp(null);
        String string2 = ((QueryValidateOTP)object).getNewPass();
        ((QueryProfile)object2).setNewPassword(string2);
        object = ((QueryValidateOTP)object).getNewPass();
        ((QueryProfile)object2).setConfirmPassword((String)object);
        object = this.userRepo.updateUserProfileUaasFlow((QueryProfile)object2);
        Intrinsics.checkNotNull(object, "null cannot be cast to non-null type kotlinx.coroutines.flow.Flow<com.ril.ajio.data.repo.DataCallback<com.ril.ajio.services.data.Login.ValidateOTPData>>");
        return object;
    }

    public final es0_2 getLoginSignupBenefitsBanner(String object) {
        Intrinsics.checkNotNullParameter(object, "screenName");
        Object object2 = UrlHelper.Companion.getInstance();
        Object object3 = new Object[]{};
        String string2 = ((UrlHelper)object2).getApiUrl("login", "login_signup_banner", object3);
        object3 = "login_signup_banner";
        object2 = new LoginRepository$getLoginSignupBenefitsBanner$1(this, string2, (String)object3, (String)object, null);
        Object object4 = new br2_2((Function2)object2);
        object2 = ir0_2.a;
        object2 = em0_2.b;
        object2 = ms0_1.m((es0_2)object4, (CoroutineContext)object2);
        object4 = new LoginRepository$getLoginSignupBenefitsBanner$2(this, (String)object3, (String)object, null);
        object = new at0_1((es0_2)object2, (gx0_2)object4);
        return object;
    }

    public final es0_2 getLoginTokensUcp(String object) {
        Intrinsics.checkNotNullParameter(object, "authCode");
        Object object2 = new UcpTokenRequest((String)object, "074297cf-f238-4c48-8cbc-7c14fd07a8f9", "607e9075-1a0b-4b64-9b33-2ef0d149f466");
        object = UrlHelper.Companion.getInstance();
        Object object3 = new Object[]{};
        object = ((UrlHelper)object).getApiUrl("login", "token_ucp", object3);
        object3 = new LoginRepository$getLoginTokensUcp$1(this, (String)object, (UcpTokenRequest)object2, null);
        object = new br2_2((Function2)object3);
        object2 = ir0_2.a;
        object2 = em0_2.b;
        return ms0_1.m((es0_2)object, (CoroutineContext)object2);
    }

    public final DataCallback handleApiException(Throwable throwable, String string2, boolean bl2, String string3) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        Intrinsics.checkNotNullParameter(string2, "requestID");
        Intrinsics.checkNotNullParameter(string3, "screenName");
        return ApiErrorRepo.handleApiException$default(ApiErrorRepo.INSTANCE, throwable, string2, bl2, string3, null, 16, null);
    }

    public final es0_2 loginAnonymousUser(String object) {
        Intrinsics.checkNotNullParameter(object, "screenName");
        Object object2 = UrlHelper.Companion.getInstance();
        Object object3 = new Object[]{};
        String string2 = ((UrlHelper)object2).getApiUrl("misc", "oauth_token_uaas_generate_guest", object3);
        HashMap<String, Object> hashMap = new HashMap<String, Object>();
        hashMap.put("grantType", "client_credentials");
        object2 = this.client_id;
        hashMap.put("clientName", object2);
        object2 = this.client_secret;
        hashMap.put("clientSecret", object2);
        object3 = "Anonymouslogin";
        object2 = new LoginRepository$loginAnonymousUser$1(this, string2, hashMap, (String)object3, (String)object, null);
        Object object4 = new br2_2((Function2)object2);
        object2 = ir0_2.a;
        object2 = em0_2.b;
        object2 = ms0_1.m((es0_2)object4, (CoroutineContext)object2);
        object4 = new LoginRepository$loginAnonymousUser$2(this, (String)object3, (String)object, null);
        object = new at0_1((es0_2)object2, (gx0_2)object4);
        return object;
    }

    public final es0_2 loginUser(QueryCustomer objectArray, String objectArray2) {
        int n3;
        int n4;
        LoginRepository loginRepository = this;
        Object[] objectArray3 = objectArray;
        Object object = objectArray2;
        Intrinsics.checkNotNullParameter(objectArray, "queryCustomer");
        Intrinsics.checkNotNullParameter(objectArray2, "screenName");
        Object object2 = new Ref$ObjectRef();
        Object object3 = "";
        ((Ref$ObjectRef)object2).element = object3;
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        ref$ObjectRef.element = "login_manual";
        HashMap<Object, Object> hashMap = new HashMap<Object, Object>();
        Object[] objectArray4 = new HashMap();
        Object object4 = objectArray.getToken();
        Object object5 = "Bearer ";
        Object[] objectArray5 = "userInformation";
        String string2 = "Authorization";
        String string3 = "clientSecret";
        String string4 = "clientName";
        String string5 = null;
        String string6 = "adId";
        if (object4 != null && (n4 = object4.length()) != 0) {
            object3 = UrlHelper.Companion.getInstance();
            object4 = objectArray.getLogin();
            int n7 = 1;
            object = new Object[n7];
            object[0] = object4;
            object4 = "login";
            string5 = "social_login_uaas";
            object3 = object3.getApiUrl((String)object4, string5, object);
            ((Ref$ObjectRef)object2).element = object3;
            object3 = this.client_id;
            hashMap.put(string4, object3);
            object3 = this.client_secret;
            hashMap.put(string3, object3);
            object3 = objectArray.getLogin();
            if (object3 != null) {
                object3 = objectArray.getLogin();
                hashMap.put(object4, object3);
            }
            if ((object3 = objectArray.getLoginvia()) != null && (n3 = object3.length()) != 0) {
                object3 = "loginVia";
                object4 = objectArray.getLoginvia();
                hashMap.put(object3, object4);
            }
            object3 = loginRepository.appPreferences.a();
            objectArray3.setAdId((String)object3);
            object3 = objectArray.getAdId();
            if (object3 != null && (n3 = object3.length()) != 0) {
                object3 = objectArray.getAdId();
                hashMap.put(string6, object3);
            }
            if ((object3 = objectArray.getProfileId()) != null && (n3 = object3.length()) != 0) {
                object3 = "profileId";
                object4 = objectArray.getProfileId();
                hashMap.put(object3, object4);
            }
            object4 = objectArray.getToken();
            hashMap.put("token", object4);
            object3 = loginRepository.userInformation;
            Intrinsics.checkNotNullExpressionValue(object3, (String)objectArray5);
            object3 = ServiceUtil.getToken((UserInformation)object3);
            object4 = new StringBuilder((String)object5);
            ((StringBuilder)object4).append((String)object3);
            object3 = ((StringBuilder)object4).toString();
            objectArray4.put(string2, object3);
        } else {
            Object object6;
            object4 = "grantType";
            hashMap.put(object4, "password");
            n4 = (int)(objectArray.isMobileNumberEnterered() ? 1 : 0);
            object = "username";
            string5 = "true";
            if (n4 != 0 && (object4 = objectArray.getMobileNumber()) != null) {
                object4 = objectArray.getMobileNumber();
                hashMap.put(object, object4);
                object4 = objectArray.getMobileNumber();
                object = "mobileNumber";
                hashMap.put(object, string5);
            } else {
                object4 = objectArray.getEmail();
                if (object4 != null) {
                    object4 = objectArray.getEmail();
                    hashMap.put(object, object4);
                    object4 = objectArray.getEmail();
                } else {
                    object4 = object3;
                }
            }
            objectArray3.setLogin((String)object4);
            object4 = objectArray.getOtp();
            if (object4 == null || (n4 = object4.length()) == 0) {
                object6 = object3;
            } else {
                object = objectArray.getOtp();
                hashMap.put("otp", object);
                object4 = UrlHelper.Companion.getInstance();
                object = "oauth_token_uaas_otp";
                object6 = object3;
                n3 = 0;
                objectArray3 = new Object[]{};
                object3 = ((UrlHelper)object4).getApiUrl("misc", (String)object, objectArray3);
                ((Ref$ObjectRef)object2).element = object3;
            }
            object3 = loginRepository.client_id;
            hashMap.put(string4, object3);
            object3 = loginRepository.client_secret;
            hashMap.put(string3, object3);
            object3 = objectArray.getPassword();
            if (object3 == null || (n3 = object3.length()) == 0) {
                objectArray.isRegistration();
                n3 = (int)(objectArray.isRegistration() ? 1 : 0);
                object3 = n3 != 0 ? "false" : string5;
                object4 = "expireOTP";
                hashMap.put(object4, object3);
            }
            if ((object3 = objectArray.getCaptchaInput()) != null && (n3 = object3.length()) != 0) {
                object3 = "captchaInput";
                object4 = objectArray.getCaptchaInput();
                hashMap.put(object3, object4);
            }
            objectArray.isRefreshCaptcha();
            n3 = (int)(objectArray.isRefreshCaptcha() ? 1 : 0);
            if (n3 != 0) {
                object3 = "refreshCaptcha";
                hashMap.put(object3, string5);
            }
            if ((object3 = objectArray.getAdId()) != null && (n3 = object3.length()) != 0) {
                object3 = objectArray.getAdId();
                hashMap.put(string6, object3);
            }
            object3 = loginRepository.userInformation;
            Intrinsics.checkNotNullExpressionValue(object3, (String)objectArray5);
            object3 = ServiceUtil.getToken((UserInformation)object3);
            object4 = new StringBuilder((String)object5);
            ((StringBuilder)object4).append((String)object3);
            object3 = ((StringBuilder)object4).toString();
            objectArray4.put(string2, object3);
            object3 = loginRepository.appPreferences.a();
            if (object3 == null) {
                object3 = object6;
            }
            hashMap.put(string6, object3);
        }
        object3 = objectArray.getAdId();
        if (object3 != null && (n3 = object3.length()) != 0) {
            object3 = "deviceId";
            object4 = objectArray.getAdId();
            hashMap.put(object3, object4);
        }
        if ((object3 = objectArray.getLoginvia()) != null && (n3 = object3.length()) != 0) {
            object3 = "google";
            object4 = objectArray.getLoginvia();
            object5 = null;
            n3 = (int)(b.i((String)object3, (String)object4, false) ? 1 : 0);
            if (n3 != 0) {
                ref$ObjectRef.element = object3 = "login_google";
            } else {
                object3 = "facebook";
                object4 = objectArray.getLoginvia();
                n3 = (int)(b.i((String)object3, (String)object4, false) ? 1 : 0);
                if (n3 != 0) {
                    ref$ObjectRef.element = object3 = "login_fb";
                }
            }
        }
        object3 = object;
        object4 = this;
        object5 = ref$ObjectRef;
        objectArray3 = objectArray;
        objectArray5 = objectArray2;
        object = new LoginRepository$loginUser$1(this, (Ref$ObjectRef)object2, (Map)objectArray4, hashMap, ref$ObjectRef, (QueryCustomer)objectArray, (String)objectArray2, null);
        object3 = new br2_2((Function2)object);
        object4 = ir0_2.a;
        object4 = em0_2.b;
        object3 = ms0_1.m((es0_2)object3, (CoroutineContext)object4);
        objectArray4 = objectArray2;
        object4 = new LoginRepository$loginUser$2(loginRepository, ref$ObjectRef, (String)objectArray2, null);
        object2 = new at0_1((es0_2)object3, (gx0_2)object4);
        return object2;
    }

    public final es0_2 newRegistrationAndLogin(QueryCustomer object, String object2) {
        boolean bl2;
        int n3;
        Intrinsics.checkNotNullParameter(object, "queryCustomer");
        Intrinsics.checkNotNullParameter(object2, "screenName");
        Object object3 = UrlHelper.Companion.getInstance();
        Object object4 = new Object[]{};
        Object object5 = "login";
        String string2 = "new_registration_uaas";
        String string3 = ((UrlHelper)object3).getApiUrl((String)object5, string2, object4);
        HashMap<Object, Object> hashMap = new HashMap<Object, Object>();
        object3 = ((QueryCustomer)object).getFirstName();
        if (object3 != null) {
            object3 = "firstName";
            object4 = ((QueryCustomer)object).getFirstName();
            hashMap.put(object3, object4);
        }
        if ((object3 = ((QueryCustomer)object).getLogin()) != null) {
            object3 = ((QueryCustomer)object).getLogin();
            hashMap.put(object5, object3);
        }
        object3 = ((QueryCustomer)object).getMobileNumber();
        object4 = null;
        if (object3 != null) {
            object3 = ((QueryCustomer)object).getMobileNumber();
            if (object3 != null) {
                object3 = ((Object)StringsKt.m0((CharSequence)object3)).toString();
            } else {
                n3 = 0;
                object3 = null;
            }
            object3 = String.valueOf(object3);
            object5 = "mobileNumber";
            hashMap.put(object5, object3);
        }
        if ((object3 = ((QueryCustomer)object).getGender()) != null) {
            object3 = "genderType";
            object5 = ((QueryCustomer)object).getGender();
            hashMap.put(object3, object5);
        }
        if ((object3 = ((QueryCustomer)object).getReferralCode()) != null && (n3 = object3.length()) != 0) {
            object3 = "referralCode";
            object5 = ((QueryCustomer)object).getReferralCode();
            hashMap.put(object3, object5);
        }
        if ((object3 = ((QueryCustomer)object).getRequestMode()) != null) {
            object3 = "requestType";
            object5 = ((QueryCustomer)object).getRequestMode();
            hashMap.put(object3, object5);
        }
        if ((object3 = ((QueryCustomer)object).getRequestMode()) != null && (n3 = (int)(b.i((String)(object3 = ((QueryCustomer)object).getRequestMode()), (String)(object5 = "AUTHUSER"), bl2 = true) ? 1 : 0)) != 0 && (object3 = ((QueryCustomer)object).getOtp()) != null) {
            object3 = "otp";
            object5 = ((QueryCustomer)object).getOtp();
            hashMap.put(object3, object5);
        }
        if ((object3 = ((QueryCustomer)object).getRilFnlRegisterReferralCode()) != null && (n3 = object3.length()) != 0) {
            object3 = "rilFnlRegisterReferralCode";
            object5 = ((QueryCustomer)object).getRilFnlRegisterReferralCode();
            hashMap.put(object3, object5);
        }
        object5 = this.client_id;
        hashMap.put("clientName", object5);
        object5 = this.client_secret;
        hashMap.put("clientSecret", object5);
        object3 = this.appPreferences.a();
        object5 = "";
        if (object3 == null) {
            object3 = object5;
        }
        string2 = "adId";
        hashMap.put(string2, object3);
        object3 = this.appPreferences.a();
        if (object3 != null) {
            object5 = object3;
        }
        hashMap.put("deviceID", object5);
        object5 = "request_otp";
        object3 = new LoginRepository$newRegistrationAndLogin$1(this, string3, hashMap, (String)object5, (QueryCustomer)object, (String)object2, null);
        object = new br2_2((Function2)object3);
        object3 = ir0_2.a;
        object3 = em0_2.b;
        object = ms0_1.m((es0_2)object, (CoroutineContext)object3);
        object3 = new LoginRepository$newRegistrationAndLogin$2(this, (String)object5, (String)object2, null);
        object2 = new at0_1((es0_2)object, (gx0_2)object3);
        return object2;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final es0_2 otpRequest(QueryCustomer object, String object2, boolean bl2) {
        boolean bl3;
        String string2;
        Object object3;
        Object object4;
        Intrinsics.checkNotNullParameter(object, "queryCustomer");
        Intrinsics.checkNotNullParameter(object2, "screenName");
        Object var4_4 = null;
        String string3 = "login";
        if (!bl2) {
            object4 = UrlHelper.Companion.getInstance();
            object3 = "new_registration_uaas_newflow";
            Object[] objectArray = new Object[]{};
            object4 = ((UrlHelper)object4).getApiUrl(string3, (String)object3, objectArray);
        } else {
            object4 = UrlHelper.Companion.getInstance();
            object3 = "new_registration_uaas";
            Object[] objectArray = new Object[]{};
            object4 = ((UrlHelper)object4).getApiUrl(string3, (String)object3, objectArray);
        }
        Object object5 = object4;
        object4 = yn3_0.a;
        object3 = "inside otprequest";
        Object[] objectArray = new Object[]{};
        ((yn3$a)object4).a((String)object3, objectArray);
        HashMap<Object, Object> hashMap = new HashMap<Object, Object>();
        object4 = ((QueryCustomer)object).getFirstName();
        if (object4 != null) {
            object4 = "firstName";
            String string4 = ((QueryCustomer)object).getFirstName();
            hashMap.put(object4, string4);
        }
        if ((object4 = ((QueryCustomer)object).getLogin()) != null) {
            object4 = ((QueryCustomer)object).getLogin();
            hashMap.put(string3, object4);
        }
        if ((object4 = ((QueryCustomer)object).getPassword()) != null && (bl2 = object4.length())) {
            object4 = "password";
            String string5 = ((QueryCustomer)object).getPassword();
            hashMap.put(object4, string5);
        }
        if ((object4 = ((QueryCustomer)object).getMobileNumber()) != null) {
            object4 = "mobileNumber";
            String string6 = ((QueryCustomer)object).getMobileNumber();
            hashMap.put(object4, string6);
        }
        if ((object4 = ((QueryCustomer)object).getGender()) != null) {
            object4 = "genderType";
            String string7 = ((QueryCustomer)object).getGender();
            hashMap.put(object4, string7);
        }
        if ((object4 = ((QueryCustomer)object).getReferralCode()) != null && (bl2 = object4.length())) {
            object4 = "referralCode";
            String string8 = ((QueryCustomer)object).getReferralCode();
            hashMap.put(object4, string8);
        }
        if ((object4 = ((QueryCustomer)object).getRequestMode()) != null) {
            object4 = "requestType";
            String string9 = ((QueryCustomer)object).getRequestMode();
            hashMap.put(object4, string9);
        }
        if ((object4 = ((QueryCustomer)object).getRequestMode()) != null && (bl2 = b.i((String)(object4 = ((QueryCustomer)object).getRequestMode()), string2 = "AUTHUSER", bl3 = true)) && (object4 = ((QueryCustomer)object).getOtp()) != null) {
            object4 = "otp";
            String string10 = ((QueryCustomer)object).getOtp();
            hashMap.put(object4, string10);
        }
        if ((object4 = ((QueryCustomer)object).getToken()) != null && (bl2 = object4.length())) {
            object4 = "token";
            String string11 = ((QueryCustomer)object).getToken();
            hashMap.put(object4, string11);
        }
        if ((object4 = ((QueryCustomer)object).getLoginvia()) != null && (bl2 = object4.length())) {
            object4 = "loginVia";
            String string12 = ((QueryCustomer)object).getLoginvia();
            hashMap.put(object4, string12);
        }
        if ((object4 = ((QueryCustomer)object).getRilFnlRegisterReferralCode()) != null && (bl2 = object4.length())) {
            object4 = "rilFnlRegisterReferralCode";
            String string13 = ((QueryCustomer)object).getRilFnlRegisterReferralCode();
            hashMap.put(object4, string13);
        }
        if ((object4 = ((QueryCustomer)object).getProfileId()) != null && (bl2 = object4.length())) {
            object4 = "profileId";
            object = ((QueryCustomer)object).getProfileId();
            hashMap.put(object4, object);
        }
        object = this.appPreferences.a();
        object4 = "";
        if (object == null) {
            object = object4;
        }
        String string14 = "adId";
        hashMap.put(string14, object);
        object = this.appPreferences.a();
        if (object != null) {
            object4 = object;
        }
        hashMap.put("deviceID", object4);
        object4 = "request_otp";
        object3 = object;
        LoginRepository loginRepository = this;
        object = new LoginRepository$otpRequest$1(this, (String)object5, hashMap, (String)object4, (String)object2, null);
        br2_2 br2_22 = new br2_2((Function2)object);
        object = ir0_2.a;
        object = em0_2.b;
        object = ms0_1.m(br2_22, (CoroutineContext)object);
        LoginRepository$otpRequest$2 loginRepository$otpRequest$2 = new LoginRepository$otpRequest$2(this, (String)object4, (String)object2, null);
        return new at0_1((es0_2)object, loginRepository$otpRequest$2);
    }

    public final es0_2 registerAndLogin(QueryCustomer object, String object2) {
        boolean bl2;
        int n3;
        Intrinsics.checkNotNullParameter(object, "queryCustomer");
        Intrinsics.checkNotNullParameter(object2, "screenName");
        Object object3 = UrlHelper.Companion.getInstance();
        Object object4 = new Object[]{};
        String string2 = "login";
        String string3 = "new_registration_uaas_newflow";
        String string4 = object3.getApiUrl(string2, string3, object4);
        object3 = yn3_0.a;
        object4 = "inside registerAndLogin";
        Object object5 = new Object[]{};
        object3.a((String)object4, object5);
        HashMap<Object, Object[]> hashMap = new HashMap<Object, Object[]>();
        object3 = ((QueryCustomer)object).getFirstName();
        if (object3 != null) {
            object3 = "firstName";
            object5 = ((QueryCustomer)object).getFirstName();
            hashMap.put(object3, (Object[])object5);
        }
        if ((object3 = ((QueryCustomer)object).getLogin()) != null) {
            object3 = ((QueryCustomer)object).getLogin();
            hashMap.put(string2, (Object[])object3);
        }
        if ((object3 = ((QueryCustomer)object).getPassword()) != null && (n3 = object3.length()) != 0) {
            object3 = "password";
            object5 = ((QueryCustomer)object).getPassword();
            hashMap.put(object3, (Object[])object5);
        }
        if ((object3 = ((QueryCustomer)object).getMobileNumber()) != null) {
            object3 = "mobileNumber";
            object5 = ((QueryCustomer)object).getMobileNumber();
            hashMap.put(object3, (Object[])object5);
        }
        if ((object3 = ((QueryCustomer)object).getGender()) != null) {
            object3 = "genderType";
            object5 = ((QueryCustomer)object).getGender();
            hashMap.put(object3, (Object[])object5);
        }
        if ((object3 = ((QueryCustomer)object).getReferralCode()) != null && (n3 = object3.length()) != 0) {
            object3 = "referralCode";
            object5 = ((QueryCustomer)object).getReferralCode();
            hashMap.put(object3, (Object[])object5);
        }
        if ((object3 = ((QueryCustomer)object).getRequestMode()) != null) {
            object3 = "requestType";
            object5 = ((QueryCustomer)object).getRequestMode();
            hashMap.put(object3, (Object[])object5);
        }
        if ((object3 = ((QueryCustomer)object).getRequestMode()) != null && (n3 = (int)(b.i((String)(object3 = ((QueryCustomer)object).getRequestMode()), (String)(object5 = "AUTHUSER"), bl2 = true) ? 1 : 0)) != 0 && (object3 = ((QueryCustomer)object).getOtp()) != null) {
            object3 = "otp";
            object5 = ((QueryCustomer)object).getOtp();
            hashMap.put(object3, (Object[])object5);
        }
        if ((object3 = ((QueryCustomer)object).getToken()) != null && (n3 = object3.length()) != 0) {
            object3 = "token";
            object5 = ((QueryCustomer)object).getToken();
            hashMap.put(object3, (Object[])object5);
        }
        if ((object3 = ((QueryCustomer)object).getLoginvia()) != null && (n3 = object3.length()) != 0) {
            object3 = "loginvia";
            object5 = ((QueryCustomer)object).getLoginvia();
            hashMap.put(object3, (Object[])object5);
        }
        if ((object3 = ((QueryCustomer)object).getRilFnlRegisterReferralCode()) != null && (n3 = object3.length()) != 0) {
            object3 = "rilFnlRegisterReferralCode";
            object5 = ((QueryCustomer)object).getRilFnlRegisterReferralCode();
            hashMap.put(object3, (Object[])object5);
        }
        if ((object3 = ((QueryCustomer)object).getProfileId()) != null && (n3 = object3.length()) != 0) {
            object3 = "profileId";
            object5 = ((QueryCustomer)object).getProfileId();
            hashMap.put(object3, (Object[])object5);
        }
        object3 = this.appPreferences.a();
        object5 = "";
        if (object3 == null) {
            object3 = object5;
        }
        object4 = "adId";
        hashMap.put(object4, (Object[])object3);
        object3 = this.appPreferences.a();
        if (object3 != null) {
            object5 = object3;
        }
        hashMap.put("deviceID", (Object[])object5);
        object5 = this.client_id;
        hashMap.put("clientName", (Object[])object5);
        object5 = this.client_secret;
        hashMap.put("clientSecret", (Object[])object5);
        object5 = ((QueryCustomer)object).getLoginvia();
        hashMap.put("loginVia", (Object[])object5);
        object5 = "request_otp";
        object3 = new LoginRepository$registerAndLogin$1(this, string4, hashMap, (String)object5, (QueryCustomer)object, (String)object2, null);
        object = new br2_2((Function2)object3);
        object3 = ir0_2.a;
        object3 = em0_2.b;
        object = ms0_1.m((es0_2)object, (CoroutineContext)object3);
        object3 = new LoginRepository$registerAndLogin$2(this, (String)object5, (String)object2, null);
        object2 = new at0_1((es0_2)object, (gx0_2)object3);
        return object2;
    }

    public final es0_2 resetPasswordWithToken(QueryResetPassword object) {
        int n3;
        Intrinsics.checkNotNullParameter(object, "queryResetPassword");
        Object object2 = UrlHelper.Companion.getInstance();
        Object object3 = new Object[]{};
        String string2 = "my_account";
        String string3 = "reset_password";
        String string4 = ((UrlHelper)object2).getApiUrl(string2, string3, object3);
        HashMap<Object, Object> hashMap = new HashMap<Object, Object>();
        object2 = ((QueryResetPassword)object).getToken();
        if (object2 != null && (n3 = object2.length()) != 0) {
            object2 = "token";
            object3 = ((QueryResetPassword)object).getToken();
            hashMap.put(object2, object3);
        }
        if ((object2 = ((QueryResetPassword)object).getNewpassword()) != null && (n3 = object2.length()) != 0) {
            object2 = "newPassword";
            object = ((QueryResetPassword)object).getNewpassword();
            hashMap.put(object2, object);
        }
        object2 = "ResetPassword";
        object = new LoginRepository$resetPasswordWithToken$1(this, string4, hashMap, (String)object2, null);
        object3 = new br2_2((Function2)object);
        object = ir0_2.a;
        object = em0_2.b;
        object = ms0_1.m((es0_2)object3, (CoroutineContext)object);
        object3 = new LoginRepository$resetPasswordWithToken$2(this, (String)object2, null);
        object2 = new at0_1((es0_2)object, (gx0_2)object3);
        return object2;
    }

    public final es0_2 sendOtp(QueryCustomer object, String object2) {
        Intrinsics.checkNotNullParameter(object, "queryCustomer");
        Intrinsics.checkNotNullParameter(object2, "screenName");
        Object object3 = UrlHelper.Companion.getInstance();
        Object[] objectArray = new Object[]{};
        Object object4 = "login";
        String string2 = "send_otp_uaas";
        String string3 = ((UrlHelper)object3).getApiUrl((String)object4, string2, objectArray);
        HashMap<Object, Object> hashMap = new HashMap<Object, Object>();
        boolean bl2 = ((QueryCustomer)object).isMobileNumberEnterered();
        objectArray = null;
        if (bl2 && (object3 = ((QueryCustomer)object).getMobileNumber()) != null) {
            object = (object = ((QueryCustomer)object).getMobileNumber()) != null ? ((Object)StringsKt.m0((CharSequence)object)).toString() : null;
            object = String.valueOf(object);
            object3 = "mobileNumber";
            hashMap.put(object3, object);
        } else {
            object3 = ((QueryCustomer)object).getEmail();
            if (object3 != null) {
                object3 = "emailId";
                object = ((QueryCustomer)object).getEmail();
                hashMap.put(object3, object);
            }
        }
        object3 = "login_otp";
        object = new LoginRepository$sendOtp$1(this, string3, hashMap, (String)object3, (String)object2, null);
        object4 = new br2_2((Function2)object);
        object = ir0_2.a;
        object = em0_2.b;
        object = ms0_1.m((es0_2)object4, (CoroutineContext)object);
        object4 = new LoginRepository$sendOtp$2(this, (String)object3, (String)object2, null);
        object2 = new at0_1((es0_2)object, (gx0_2)object4);
        return object2;
    }
}

