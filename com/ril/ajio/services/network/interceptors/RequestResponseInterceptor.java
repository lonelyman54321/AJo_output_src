/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.ContentResolver
 *  android.content.Context
 *  android.content.Intent
 *  android.os.Build
 *  android.os.Bundle
 *  android.provider.Settings$Secure
 *  android.util.Base64
 */
package com.ril.ajio.services.network.interceptors;

import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.provider.Settings;
import android.util.Base64;
import com.ajio.ril.core.network.AnonymousToken;
import com.ajio.ril.core.network.model.DataError;
import com.ajio.ril.core.network.model.DataError$ErrorMessage;
import com.ajio.ril.core.network.model.Error;
import com.ajio.ril.core.network.model.ValiDateSessionUcp;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.ril.ajio.services.NetworkAnalyticsManager.AnalyticsManager;
import com.ril.ajio.services.NetworkAnalyticsManager.GoogleAnalyticsEvents;
import com.ril.ajio.services.data.Login.Data;
import com.ril.ajio.services.data.Login.UcpToken;
import com.ril.ajio.services.data.RefreshTokenRequest;
import com.ril.ajio.services.data.user.UserInformation;
import com.ril.ajio.services.data.user.UserInformationModel;
import com.ril.ajio.services.helper.UrlHelper;
import com.ril.ajio.services.network.data.ResponseError;
import com.ril.ajio.services.network.interceptors.RequestResponseInterceptor$Companion;
import com.ril.ajio.services.utils.ServiceUtil;
import java.nio.charset.Charset;
import java.util.Calendar;
import java.util.List;
import javax.crypto.Cipher;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import kotlin.text.b;

public final class RequestResponseInterceptor
implements nj1_2 {
    private static final String AD_ID = "ad_id";
    private static final String ANDROID = "Android";
    private static final String CLIENT_TYPE = "client_type";
    private static final String CLIENT_TYPE_PARAM = "Android";
    private static final String CLIENT_VERSION = "client_version";
    private static final String CONTENT_TYPE = "Content-Type";
    private static final String CONTENT_TYPE_VALUE = "application/json";
    public static final RequestResponseInterceptor$Companion Companion;
    private static final String HEADER_ACCEPT = "Accept";
    private static final String HEADER_ACCEPT_VALUE = "application/json";
    private static final String INVALID_REFRESH_TOKEN = "Invalid refresh token";
    public static final String PUBLIC_KEY_PROD = "30819F300D06092A864886F70D010101050003818D00308189028181008563B9CE51F897838569C7D46D1906F1EC5F0386D4DAB80424DF8834C20533CFF7655AB322E31E879F7AAA0D44175D07EBD7687E6A5540E375614296EFBFD521A0864E3586FF8452D9EBA76520A51E0928AC8B11F2A86F2197EED27A723A99AE8D47E1675047304299640DE4E6DAE61B78B8E08173D1F7F0E0F76122C106F8730203010001";
    public static final String PUBLIC_KEY_UAT = "-----BEGIN PUBLIC KEY-----\\nMIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEA2s+oT4MlMOViDPqMNs1m\\nzMbn7l1qaP1GyqWQiRR8iiaTX05DHvJKiMD3n9W7hhMsQOergSeC9vASVGCbyoON\\njyC9UsVZw+QlMrsLseOcbQhNJC7h4mOUNspZl6CVMnQvzL2vw3RmzrlfCML3uMy1\\npGdXNAAPrIh5T+zRlh0z5cRjqFew4sJ+RTtwrgrzDL+/8HthOnnzWZ9smkr/H8Uw\\n4GrUjLWPylaoduWP2fMU54WNcBOZ3hvgDWa/ub+SlbQPC4xrP7A/OkycTkeg99M+\\nwUS+SJtHr3cS1CSGMgLZBCbyhvc0gjDhU2/q0OZUqCThkDFQObBhFrj5+o7VP/oR\\nKwIDAQAB\\n-----END PUBLIC KEY-----";
    private static final int TOKEN_REFRESH_LIMIT = 2;
    private static final String USER_AGENT = "User-Agent";
    public static final String VERSION_NUMBER = "VERSION_1";
    private final AnalyticsManager analyticsManager;
    private final xe analyticsReporter;
    private Ko appPreferences;
    private final Context context;
    private UserInformation userInformation;

    static {
        RequestResponseInterceptor$Companion requestResponseInterceptor$Companion;
        Companion = requestResponseInterceptor$Companion = new RequestResponseInterceptor$Companion(null);
    }

    public RequestResponseInterceptor(Context object, xe object2) {
        Intrinsics.checkNotNullParameter(object, "context");
        Intrinsics.checkNotNullParameter(object2, "analyticsReporter");
        this.context = object;
        this.analyticsReporter = object2;
        this.appPreferences = object2 = new Ko((Context)object);
        object2 = UserInformation.getInstance(object);
        Intrinsics.checkNotNullExpressionValue(object2, "getInstance(...)");
        this.userInformation = object2;
        object = AnalyticsManager.Companion.getInstance((Context)object);
        this.analyticsManager = object;
    }

    private final kj2_2 addURLParams(kj2_2 object) {
        KJ2$a kJ2$a = ((kj2_2)object).c();
        object = ((kj2_2)object).a.f();
        ((Ob1$a)object).f(CLIENT_TYPE, "Android");
        String string2 = p90.a(this.context);
        ((Ob1$a)object).f(CLIENT_VERSION, string2);
        object = ((Ob1$a)object).b();
        Intrinsics.checkNotNullParameter(object, "url");
        kJ2$a.a = object;
        return kJ2$a.b();
    }

    /*
     * Unable to fully structure code
     */
    private final cl2_2 afterGetToken(kj2_2 var1_1, nj1$a var2_2) {
        var3_3 = var1_1.b("RequestId");
        var4_4 = this.userInformation;
        var5_5 = var4_4.isUserOnline();
        if (!var5_5) ** GOTO lbl-1000
        var4_4 = cw.Companion;
        var4_4.getClass();
        var5_5 = cw$a.a();
        if (var5_5 && (var6_6 = Intrinsics.areEqual(var3_3, var4_4 = "validateSession"))) {
            var3_3 = this.userInformation.getUcpAccessToken();
        } else lbl-1000:
        // 2 sources

        {
            var3_3 = ServiceUtil.getToken(this.userInformation);
        }
        var1_1 = var1_1.c();
        var4_4 = new StringBuilder("Bearer ");
        var4_4.append(var3_3);
        var3_3 = var4_4.toString();
        var1_1.d("Authorization", var3_3);
        var1_1 = var1_1.b();
        return var2_2.a((kj2_2)var1_1);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final String checkTokenExpiry(nj1$a nj1$a, String string2, kj2_2 object) {
        String string3;
        int n3;
        int n4;
        Object object2 = "Bearer ";
        Object object3 = ((kj2_2)object).b("RequestId");
        String string4 = null;
        if (object3 != null && (n4 = ((String)object3).length()) != 0 && (n3 = ((String)object3).equals(string3 = "validateSession")) != 0) {
            object3 = (ValiDateSessionUcp)Z90.a(ValiDateSessionUcp.class, string2);
            if (object3 != null && (object3 = ((ValiDateSessionUcp)object3).getError()) != null && (object3 = (Error)CollectionsKt.N(0, (List)object3)) != null) {
                object3 = ((Error)object3).getType();
            } else {
                n3 = 0;
                object3 = null;
            }
            string3 = this.userInformation.getUcpAccessToken();
            string3 = string3 != null && (n4 = string3.length()) != 0 ? this.userInformation.getUcpAccessToken() : AnonymousToken.getAccessToken();
        } else {
            object3 = (DataError)Z90.a(DataError.class, string2);
            if (object3 != null && (object3 = ((DataError)object3).getErrorMessage()) != null) {
                object3 = ((DataError$ErrorMessage)object3).getType();
            } else {
                n3 = 0;
                object3 = null;
            }
            string3 = ServiceUtil.getToken(this.userInformation);
        }
        String string5 = "InvalidTokenError";
        boolean bl2 = Intrinsics.areEqual(string5, object3);
        if (!(bl2 || (bl2 = Intrinsics.areEqual(string5 = "UnauthorizedError", object3)) || (bl2 = Intrinsics.areEqual(string5 = "ForbiddenError", object3)) || (n3 = (int)(Intrinsics.areEqual(string5 = "AuthorizationError", object3) ? 1 : 0)) != 0)) {
            return string2;
        }
        synchronized (this) {
            Throwable throwable2;
            block11: {
                block10: {
                    if (string3 == null) return "";
                    try {
                        n3 = string3.length();
                        if (n3 == 0) return "";
                        object3 = new StringBuilder((String)object2);
                        ((StringBuilder)object3).append((Object)string3);
                        object2 = ((StringBuilder)object3).toString();
                        object3 = ((kj2_2)object).c;
                        string3 = "Authorization";
                        object3 = ((m41_0)object3).a(string3);
                        if (object3 == null) return string4;
                        n3 = ((String)object3).length();
                        if (n3 == 0) return string4;
                        object3 = ((kj2_2)object).c;
                        string3 = "Authorization";
                        boolean bl3 = Intrinsics.areEqual(object2, object3 = ((m41_0)object3).a(string3));
                        if (!bl3) return string4;
                        object2 = this.userInformation;
                        bl3 = ((UserInformation)object2).isUserOnline();
                        if (!bl3) break block10;
                        object2 = cw.Companion;
                        object2.getClass();
                        bl3 = cw$a.a();
                        if (!bl3) break block10;
                        object = this.ucpRefreshToken((kj2_2)object);
                        object = nj1$a.a((kj2_2)object);
                        return this.checkTokenResponse((cl2_2)object, nj1$a, 0, string2);
                    }
                    catch (Throwable throwable2) {
                        break block11;
                    }
                }
                object = this.refreshToken();
                object = nj1$a.a((kj2_2)object);
                return this.checkTokenResponse((cl2_2)object, nj1$a, 0, string2);
            }
            throw throwable2;
        }
    }

    private final String checkTokenResponse(cl2_2 object, nj1$a object2, int n3, String string2) {
        Object object3 = ((cl2_2)object).g;
        if (object3 != null) {
            int n4;
            Object object4;
            object3 = ((il2_2)object3).k();
            boolean n42 = ((cl2_2)object).d();
            if (n42) {
                object = (UserInformationModel)Z90.a(UserInformationModel.class, (String)object3);
                object2 = this.userInformation;
                boolean bl2 = ((UserInformation)object2).isUserOnline();
                if (bl2) {
                    object2 = cw.Companion;
                    object2.getClass();
                    bl2 = cw$a.a();
                    if (bl2) {
                        object = (UcpToken)Z90.a(UcpToken.class, (String)object3);
                        Intrinsics.checkNotNull(object);
                        this.saveUcpTokens((UcpToken)object);
                    } else {
                        Intrinsics.checkNotNull(object);
                        this.saveUserInformation((UserInformationModel)object);
                    }
                } else {
                    Intrinsics.checkNotNull(object);
                    this.saveAnonymousUserInformation((UserInformationModel)object);
                }
                return null;
            }
            Object object5 = cw.Companion;
            object5.getClass();
            boolean bl3 = cw$a.a();
            String string3 = "invalid_refresh_token";
            if (bl3) {
                this.userInformation.reset();
                object5 = new Intent(string3);
                object4 = Xv1.a(this.context);
                ((Xv1)object4).c((Intent)object5);
            }
            object5 = DataError.class;
            object3 = (DataError)Z90.a((Class)object5, (String)object3);
            int n7 = 500;
            object4 = "";
            int n8 = ((cl2_2)object).d;
            if (!(n7 <= n8 && n8 < (n4 = 600) ? object3 == null || (object3 = ((DataError)object3).getErrorMessage()) == null || (object3 = ((DataError$ErrorMessage)object3).getLogMessage()) == null : object3 == null || (object3 = ((DataError)object3).getErrorMessage()) == null || (object3 = ((DataError$ErrorMessage)object3).getMessage()) == null)) {
                object4 = object3;
            }
            this.logTokenErrorEvent((String)object4, n8);
            int n10 = 2;
            int n14 = 401;
            if (n3 < n10 && n8 != n14) {
                object3 = this.userInformation;
                n10 = (int)(((UserInformation)object3).isUserOnline() ? 1 : 0);
                if (n10 != 0 && (n10 = (int)(cw$a.a() ? 1 : 0)) != 0) {
                    object = ((cl2_2)object).a;
                    object = this.ucpRefreshToken((kj2_2)object);
                    object = object2.a((kj2_2)object);
                } else {
                    object = this.refreshToken();
                    object = object2.a((kj2_2)object);
                }
                return this.checkTokenResponse((cl2_2)object, (nj1$a)object2, ++n3, string2);
            }
            object = this.userInformation;
            ((UserInformation)object).reset();
            if (n8 == n14) {
                object = new Intent(string3);
                object2 = Xv1.a(this.context);
                ((Xv1)object2).c((Intent)object);
            }
        }
        return string2;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final cl2_2 getToken(nj1$a object, kj2_2 object2) {
        synchronized (this) {
            Throwable throwable2;
            block7: {
                Object object3;
                block6: {
                    block5: {
                        try {
                            object3 = this.userInformation;
                            boolean bl2 = ((UserInformation)object3).isTokenInValidNew();
                            if (!bl2) return this.afterGetToken((kj2_2)object2, (nj1$a)object);
                            object3 = this.userInformation;
                            bl2 = ((UserInformation)object3).isUserOnline();
                            if (!bl2) break block5;
                            object3 = cw.Companion;
                            object3.getClass();
                            bl2 = cw$a.a();
                            if (!bl2) break block5;
                            object3 = this.ucpRefreshToken((kj2_2)object2);
                            object3 = object.a((kj2_2)object3);
                            break block6;
                        }
                        catch (Throwable throwable2) {
                            break block7;
                        }
                    }
                    object3 = this.refreshToken();
                    object3 = object.a((kj2_2)object3);
                }
                Object object4 = ((cl2_2)object3).g;
                object4 = object4 != null ? ((il2_2)object4).d() : null;
                String string2 = "";
                string2 = this.checkTokenResponse((cl2_2)object3, (nj1$a)object, 0, string2);
                if (string2 == null) return this.afterGetToken((kj2_2)object2, (nj1$a)object);
                object = iL2$b.a(string2, (jn1_0)object4);
                object2 = ((cl2_2)object3).h();
                ((cl2$a_0)object2).g = object;
                return ((cl2$a_0)object2).a();
            }
            throw throwable2;
        }
    }

    private final cl2_2 handleLogoutUser(nj1$a nj1$a, kj2_2 kj2_22) {
        return nj1$a.a(kj2_22);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private final cl2_2 handleResponse(nj1$a object, kj2_2 object2) {
        cl2_2 cl2_22 = object.a((kj2_2)object2);
        boolean bl2 = cl2_22.d();
        if (bl2) return cl2_22;
        bl2 = false;
        String string2 = null;
        Object object3 = cl2_22.g;
        jn1_0 jn1_02 = object3 != null ? ((il2_2)object3).d() : null;
        if (object3 != null) {
            string2 = ((il2_2)object3).k();
        }
        if (string2 == null) return cl2_22;
        object3 = this.checkTokenExpiry((nj1$a)object, string2, (kj2_2)object2);
        if (object3 == null) {
            object = this.afterGetToken((kj2_2)object2, (nj1$a)object);
            return object;
        }
        object = iL2$b.a(string2, jn1_02);
        object2 = cl2_22.h();
        ((cl2$a_0)object2).g = object;
        return ((cl2$a_0)object2).a();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final void logTokenErrorEvent(String object, int n3) {
        String string2;
        Object object2;
        Object object3;
        Object object4;
        Object object5;
        block5: {
            Exception exception2;
            block6: {
                int n4;
                object5 = this.userInformation;
                boolean bl2 = ((UserInformation)object5).isUserOnline();
                object5 = bl2 ? "refresh_token_request" : "AnonymousloginRefresh";
                object4 = object5;
                bl2 = false;
                object5 = null;
                try {
                    object3 = new Gson();
                    object2 = ResponseError.class;
                    object3 = ((Gson)object3).fromJson((String)object, (Class)object2);
                    object3 = (ResponseError)object3;
                    if (object3 == null) break block5;
                    n3 = ((ResponseError)object3).getRespCode();
                    object2 = ((ResponseError)object3).getExceptionMsg();
                    if (object2 != null && (n4 = ((String)object2).length()) != 0) {
                        object2 = ((ResponseError)object3).getExceptionMsg();
                        object = object2 == null ? "" : object2;
                    }
                }
                catch (Exception exception2) {
                    break block6;
                }
                if ((object2 = ((ResponseError)object3).getSupportId()) != null && (n4 = ((String)object2).length()) != 0) {
                    object2 = new StringBuilder();
                    ((StringBuilder)object2).append(object);
                    string2 = " supportID";
                    ((StringBuilder)object2).append(string2);
                    object = ((StringBuilder)object2).toString();
                    object5 = ((ResponseError)object3).getSupportId();
                }
                break block5;
            }
            object2 = yn3_0.a;
            ((yn3$a)object2).e(exception2);
        }
        int n7 = n3;
        CharSequence charSequence = vV1.c(this.context);
        object2 = " statusCode:";
        charSequence = oe3_0.a(n3, "NetworkStatus:", (String)charSequence, (String)object2, " ");
        ((StringBuilder)charSequence).append(object);
        string2 = ((StringBuilder)charSequence).toString();
        Bundle bundle = new Bundle();
        charSequence = "status_code";
        object3 = String.valueOf(n3);
        bundle.putString((String)charSequence, (String)object3);
        if (object5 != null && (n3 = ((String)object5).length()) != 0) {
            charSequence = new StringBuilder();
            ((StringBuilder)charSequence).append(object);
            ((StringBuilder)charSequence).append(": ");
            ((StringBuilder)charSequence).append(object5);
            object = ((StringBuilder)charSequence).toString();
        }
        bundle.putString("error_message", (String)object);
        object = vV1.c(this.context);
        bundle.putString("network_type", (String)object);
        object3 = this.analyticsManager.getGa();
        xe xe2 = this.analyticsReporter;
        ((GoogleAnalyticsEvents)object3).pushServiceErrorEvents("serviceErrorEvent", (String)object4, string2, "", n7, xe2, bundle);
    }

    private final kj2_2 refreshToken() {
        Object object;
        String string2;
        KJ2$a kJ2$a = new KJ2$a();
        Object object2 = this.appPreferences;
        Object object3 = AD_ID;
        object2 = ((sw_0)object2).getPreference((String)object3, "");
        Object object4 = p90.a(this.context);
        Object[] objectArray = this.userInformation;
        boolean bl2 = objectArray.isUserOnline();
        String string3 = null;
        String string4 = "misc";
        if (bl2) {
            objectArray = UrlHelper.Companion.getInstance();
            string2 = "oauth_token_uaas_generate_refresh_token";
            object = new Object[]{};
            objectArray = objectArray.getApiUrl(string4, string2, object);
        } else {
            objectArray = UrlHelper.Companion.getInstance();
            string2 = "oauth_token_uaas_generate_guest";
            object = new Object[]{};
            objectArray = objectArray.getApiUrl(string4, string2, object);
        }
        kJ2$a.h((String)objectArray);
        string2 = "Android";
        kJ2$a.a(CLIENT_TYPE, string2);
        object = "application/json";
        kJ2$a.a(HEADER_ACCEPT, (String)object);
        objectArray = CLIENT_VERSION;
        kJ2$a.a((String)objectArray, (String)object4);
        object4 = USER_AGENT;
        kJ2$a.a((String)object4, string2);
        if (object2 != null) {
            kJ2$a.a((String)object3, (String)object2);
        }
        kJ2$a.a("X-Tenant", "B2C");
        object2 = this.userInformation;
        boolean bl3 = ((UserInformation)object2).isUserOnline();
        object4 = "secret";
        object3 = "trusted_client";
        objectArray = "clientName";
        string2 = "grantType";
        object = "clientSecret";
        if (bl3) {
            object2 = this.userInformation.getSecureRefreshToken();
            String string5 = "Bearer ";
            CharSequence charSequence = new StringBuilder(string5);
            charSequence.append((String)object2);
            object2 = charSequence.toString();
            kJ2$a.a("Authorization", (String)object2);
            object2 = new DV0$a(0);
            charSequence = "refresh_token";
            ((DV0$a)object2).a(string2, (String)charSequence);
            ((DV0$a)object2).a((String)objectArray, (String)object3);
            ((DV0$a)object2).a((String)object, (String)object4);
            object4 = UrlHelper.Companion.getInstance();
            objectArray = new Object[]{};
            object4 = ((UrlHelper)object4).getApiUrl(string4, "backend", objectArray);
            object3 = new StringBuilder();
            ((StringBuilder)object3).append((String)object4);
            ((StringBuilder)object3).append("/oauth2_callback");
            object4 = ((StringBuilder)object3).toString();
            ((DV0$a)object2).a("redirect_uri", (String)object4);
            object3 = ((DV0$a)object2).b;
            object2 = ((DV0$a)object2).c;
            object4 = new dv0_2((List)object3, (List)object2);
        } else {
            object2 = new DV0$a(0);
            string3 = "client_credentials";
            ((DV0$a)object2).a(string2, string3);
            ((DV0$a)object2).a((String)objectArray, (String)object3);
            ((DV0$a)object2).a((String)object, (String)object4);
            object3 = ((DV0$a)object2).b;
            object2 = ((DV0$a)object2).c;
            object4 = new dv0_2((List)object3, (List)object2);
        }
        Intrinsics.checkNotNullParameter(object4, "body");
        kJ2$a.e("POST", (pj2_2)object4);
        return kJ2$a.b();
    }

    private final void saveAnonymousUserInformation(UserInformationModel userInformationModel) {
        this.userInformation.setUserId("anonymous");
        this.userInformation.setTokenInvalid(false);
        this.userInformation.setLoggedInStatus("Guest");
        UserInformation userInformation = this.userInformation;
        String string2 = userInformationModel.getAccess_token();
        userInformation.setGuestAccessToken(string2);
        AnonymousToken.setAccessToken(userInformationModel.getAccess_token());
    }

    private final void saveUcpTokens(UcpToken object) {
        Object object2 = ((UcpToken)object).getData();
        int n3 = object2.isEmpty();
        if (n3 != 0) {
            return;
        }
        object = ((Iterable)((UcpToken)object).getData()).iterator();
        while ((n3 = object.hasNext()) != 0) {
            long l2;
            boolean bl2;
            String string2;
            boolean bl3;
            object2 = (Data)object.next();
            long l3 = Calendar.getInstance().getTimeInMillis();
            UserInformation userInformation = this.userInformation;
            userInformation.setIssuedOn(l3);
            Object object3 = ((Data)object2).getTokenProvider();
            if (object3 != null && (bl3 = StringsKt.F((CharSequence)object3, string2 = "UCP", bl2 = true)) == bl2) {
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

    private final void saveUserInformation(UserInformationModel object) {
        UserInformation userInformation = this.userInformation;
        long l2 = Calendar.getInstance().getTimeInMillis();
        userInformation.setIssuedOn(l2);
        l2 = ((UserInformationModel)object).getExpires_in();
        userInformation.setExpires_in(l2);
        int n3 = 0;
        userInformation.setTokenInvalid(false);
        String string2 = ((UserInformationModel)object).getRefresh_token();
        if (string2 != null && (n3 = string2.length()) != 0) {
            string2 = ((UserInformationModel)object).getRefresh_token();
            userInformation.setRefreshToken(string2);
        }
        if ((string2 = ((UserInformationModel)object).getAccess_token()) != null && (n3 = string2.length()) != 0) {
            object = ((UserInformationModel)object).getAccess_token();
            userInformation.setAccessToken((String)object);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final kj2_2 ucpRefreshToken(kj2_2 kj2_22) {
        boolean bl2;
        int n3;
        Object[] objectArray;
        Object object;
        String string2;
        Object object2;
        String string3;
        Object object3;
        String string4;
        Object object4;
        Object object5;
        Object object6;
        Object object7;
        KJ2$a kJ2$a;
        RequestResponseInterceptor requestResponseInterceptor;
        block11: {
            block12: {
                Exception exception2;
                block10: {
                    block9: {
                        int n4;
                        requestResponseInterceptor = this;
                        kJ2$a = new KJ2$a();
                        object7 = UrlHelper.Companion.getInstance();
                        object6 = null;
                        object5 = new Object[]{};
                        object5 = ((UrlHelper)object7).getApiUrl("login", "refresh_token_ucp", object5);
                        object4 = kj2_22;
                        object4 = kj2_22.b("RequestId");
                        string4 = p90.a(this.context);
                        object7 = new JsonObject();
                        object3 = "name";
                        string3 = "Android";
                        ((JsonObject)object7).addProperty((String)object3, string3);
                        object2 = new JsonObject();
                        ((JsonObject)object2).addProperty("type", string3);
                        string2 = this.userInformation.getCustomerUUID();
                        object = "unique_identifier";
                        ((JsonObject)object2).addProperty((String)object, string2);
                        ((JsonObject)object2).add("platform", (JsonElement)object7);
                        object7 = this.context;
                        string2 = null;
                        object7 = object7 != null ? object7.getContentResolver() : null;
                        object7 = Settings.Secure.getString((ContentResolver)object7, (String)"android_id");
                        ((JsonObject)object2).addProperty("advertising_identifier", (String)object7);
                        object7 = Build.MANUFACTURER;
                        object = Build.MODEL;
                        objectArray = new StringBuilder();
                        objectArray.append((String)object7);
                        objectArray.append(" ");
                        objectArray.append((String)object);
                        object7 = objectArray.toString();
                        ((JsonObject)object2).addProperty((String)object3, (String)object7);
                        object3 = Companion.getPublicKey();
                        object = VERSION_NUMBER;
                        object7 = new Np0((String)object3);
                        object3 = ((JsonElement)object2).toString();
                        object2 = "Encrypted data: ";
                        if (object3 == null || (n4 = ((String)object3).length()) == 0) break block12;
                        try {
                            objectArray = ((Np0)object7).b;
                            if (objectArray != null) break block9;
                            ((Np0)object7).a();
                        }
                        catch (Exception exception2) {
                            break block10;
                        }
                    }
                    if ((object7 = ((Np0)object7).b) == null) {
                        object7 = yn3_0.a;
                        object3 = "Cipher is not initialized.";
                        object2 = new Object[]{};
                        ((yn3$a)object7).d((String)object3, (Object[])object2);
                        break block11;
                    } else {
                        objectArray = Charsets.UTF_8;
                        object3 = ((String)object3).getBytes((Charset)objectArray);
                        objectArray = "getBytes(...)";
                        Intrinsics.checkNotNullExpressionValue(object3, (String)objectArray);
                        object7 = ((Cipher)object7).doFinal((byte[])object3);
                        if (object7 == null) {
                            object7 = yn3_0.a;
                            object3 = "Encryption failed, encryptedBytes is null.";
                            object2 = new Object[]{};
                            ((yn3$a)object7).d((String)object3, (Object[])object2);
                            break block11;
                        } else {
                            int n7 = 2;
                            object7 = Base64.encodeToString((byte[])object7, (int)n7);
                            object3 = yn3_0.a;
                            objectArray = new StringBuilder((String)object2);
                            objectArray.append((String)object7);
                            object2 = objectArray.toString();
                            objectArray = new Object[]{};
                            ((yn3$a)object3).a((String)object2, objectArray);
                            object3 = new StringBuilder();
                            ((StringBuilder)object3).append((String)object7);
                            ((StringBuilder)object3).append((String)object);
                            string2 = ((StringBuilder)object3).toString();
                        }
                    }
                    break block11;
                }
                object3 = yn3_0.a;
                object2 = "Encryption error";
                object6 = new Object[]{};
                ((yn3$a)object3).c(exception2, (String)object2, (Object[])object6);
                break block11;
            }
            object7 = yn3_0.a;
            object3 = "Info is null or empty, returning null.";
            object6 = new Object[]{};
            ((yn3$a)object7).a((String)object3, (Object[])object6);
        }
        if (string2 == null) {
            string2 = "unknown";
        }
        String string5 = string2;
        object7 = new Gson();
        object6 = "getUcpRefreshToken(...)";
        object3 = "application/json";
        if (object4 != null && (n3 = ((String)object4).length()) != 0 && (bl2 = Intrinsics.areEqual(object4, object2 = "validateSession"))) {
            object2 = requestResponseInterceptor.userInformation;
            String string6 = ((UserInformation)object2).getUcpRefreshToken();
            Intrinsics.checkNotNullExpressionValue(string6, (String)object6);
            String string7 = "074297cf-f238-4c48-8cbc-7c14fd07a8f9";
            objectArray = "refresh_token";
            String string8 = "607e9075-1a0b-4b64-9b33-2ef0d149f466";
            object = object4;
            object4 = new RefreshTokenRequest((String)objectArray, string6, string8, string7, string2);
            object7 = ((Gson)object7).toJson(object4);
            object6 = pj2_2.Companion;
            Intrinsics.checkNotNull(object7);
            object4 = jn1_0.d;
            object4 = JN1$a.a((String)object3);
            object6.getClass();
            object7 = PJ2$a.c((String)object7, (jn1_0)object4);
        } else {
            object2 = requestResponseInterceptor.userInformation;
            String string9 = ((UserInformation)object2).getUcpRefreshToken();
            Intrinsics.checkNotNullExpressionValue(string9, (String)object6);
            String string10 = "";
            objectArray = "refresh_token";
            String string11 = "";
            object = object4;
            object4 = new RefreshTokenRequest((String)objectArray, string9, string11, string10, string5);
            object7 = ((Gson)object7).toJson(object4);
            object6 = pj2_2.Companion;
            Intrinsics.checkNotNull(object7);
            object4 = jn1_0.d;
            object4 = JN1$a.a((String)object3);
            object6.getClass();
            object7 = PJ2$a.c((String)object7, (jn1_0)object4);
        }
        kJ2$a.h((String)object5);
        kJ2$a.a(CONTENT_TYPE, (String)object3);
        kJ2$a.a(CLIENT_TYPE, string3);
        kJ2$a.a(CLIENT_VERSION, string4);
        kJ2$a.a(USER_AGENT, string3);
        Intrinsics.checkNotNullParameter(object7, "body");
        kJ2$a.e("POST", (pj2_2)object7);
        return kJ2$a.b();
    }

    public final Context getContext() {
        return this.context;
    }

    public cl2_2 intercept(nj1$a object) {
        int n3;
        CharSequence charSequence;
        int n4;
        int n7;
        Intrinsics.checkNotNullParameter(object, "chain");
        Object object2 = object.request().c();
        ((KJ2$a)object2).d(HEADER_ACCEPT, "application/json");
        String string2 = "Android";
        ((KJ2$a)object2).d(USER_AGENT, string2);
        ((KJ2$a)object2).d(CLIENT_TYPE, string2);
        Object object3 = p90.a(this.context);
        ((KJ2$a)object2).d(CLIENT_VERSION, (String)object3);
        object3 = this.appPreferences;
        string2 = "";
        Object object4 = AD_ID;
        object3 = ((sw_0)object3).getPreference((String)object4, string2);
        if (object3 != null && (n7 = ((String)object3).length()) != 0) {
            ((KJ2$a)object2).a((String)object4, (String)object3);
        }
        object2 = ((KJ2$a)object2).b();
        object3 = ((kj2_2)object2).c;
        string2 = "RequestId";
        object4 = ((m41_0)object3).a(string2);
        if (object4 != null && (n4 = ((String)object4).length()) != 0) {
            string2 = ((m41_0)object3).a(string2);
            n4 = 0;
            object4 = null;
            charSequence = "Logout_user";
            n7 = (int)(b.i(string2, (String)charSequence, false) ? 1 : 0);
            if (n7 != 0) {
                return this.handleLogoutUser((nj1$a)object, (kj2_2)object2);
            }
        }
        if ((object3 = ((m41_0)object3).a(string2 = "Authorization")) != null && (n3 = ((String)object3).length()) != 0) {
            object2 = this.addURLParams((kj2_2)object2);
            object3 = this.userInformation;
            n3 = (int)(((UserInformation)object3).isTokenInValidNew() ? 1 : 0);
            if (n3 != 0) {
                object = this.getToken((nj1$a)object, (kj2_2)object2);
            } else {
                object3 = ServiceUtil.getToken(this.userInformation);
                object4 = ((kj2_2)object2).c();
                String string3 = "Bearer ";
                charSequence = new StringBuilder(string3);
                ((StringBuilder)charSequence).append((String)object3);
                object3 = ((StringBuilder)charSequence).toString();
                ((KJ2$a)object4).d(string2, (String)object3);
                ((KJ2$a)object4).b();
                object = this.handleResponse((nj1$a)object, (kj2_2)object2);
            }
        } else {
            object = this.handleResponse((nj1$a)object, (kj2_2)object2);
        }
        return object;
    }
}

