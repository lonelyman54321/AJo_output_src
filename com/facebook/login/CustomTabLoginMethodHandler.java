/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.Intent
 *  android.net.Uri
 *  android.os.Bundle
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package com.facebook.login;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import com.facebook.CustomTabMainActivity;
import com.facebook.FacebookException;
import com.facebook.FacebookOperationCanceledException;
import com.facebook.FacebookRequestError;
import com.facebook.FacebookSdk;
import com.facebook.FacebookServiceException;
import com.facebook.login.CustomTabLoginMethodHandler$a;
import com.facebook.login.LoginClient;
import com.facebook.login.LoginClient$Request;
import com.facebook.login.WebLoginMethodHandler;
import com.facebook.login.a;
import com.facebook.login.a$a;
import java.math.BigInteger;
import java.util.Random;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.b;
import org.json.JSONException;
import org.json.JSONObject;

public final class CustomTabLoginMethodHandler
extends WebLoginMethodHandler {
    public static final Parcelable.Creator CREATOR;
    public static boolean i;
    public String d;
    public final String e;
    public final String f;
    public final String g;
    public final F1 h;

    static {
        CustomTabLoginMethodHandler$a customTabLoginMethodHandler$a = new Object();
        CREATOR = customTabLoginMethodHandler$a;
    }

    public CustomTabLoginMethodHandler(Parcel object) {
        F1 f1;
        Intrinsics.checkNotNullParameter(object, "source");
        super((Parcel)object);
        this.g = "custom_tab";
        this.h = f1 = F1.CHROME_CUSTOM_TAB;
        object = object.readString();
        this.e = object;
        object = tf0_1.c(super.g());
        this.f = object;
    }

    public CustomTabLoginMethodHandler(LoginClient object) {
        Object object2 = "loginClient";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        Intrinsics.checkNotNullParameter(object, (String)object2);
        super((LoginClient)object);
        this.g = "custom_tab";
        object = F1.CHROME_CUSTOM_TAB;
        this.h = object;
        object = lz3_0.a;
        super();
        object2 = new BigInteger(100, (Random)object);
        object = ((BigInteger)object2).toString(32);
        Intrinsics.checkNotNullExpressionValue(object, "BigInteger(length * 5, r).toString(32)");
        this.e = object;
        i = false;
        object = tf0_1.c(super.g());
        this.f = object;
    }

    public final int describeContents() {
        return 0;
    }

    public final String f() {
        return this.g;
    }

    public final String g() {
        return this.f;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean i(int n3, int n4, Intent object) {
        String string2;
        String string3;
        void var10_26;
        int n7;
        String string4;
        void var10_24;
        String string5;
        Bundle bundle;
        int n8;
        Object object2;
        int n10;
        LoginClient$Request loginClient$Request;
        int n14;
        block22: {
            block21: {
                if (object != null) {
                    n14 = CustomTabMainActivity.c;
                    String string6 = "CustomTabMainActivity.no_activity_exception";
                    n14 = (int)(object.getBooleanExtra(string6, false) ? 1 : 0);
                    if (n14) {
                        return false;
                    }
                }
                if (n3 != (n14 = 1)) {
                    return false;
                }
                loginClient$Request = this.e().g;
                if (loginClient$Request == null) {
                    return false;
                }
                n10 = -1;
                if (n4 != n10) {
                    FacebookOperationCanceledException facebookOperationCanceledException = new FacebookOperationCanceledException();
                    this.o(loginClient$Request, null, facebookOperationCanceledException);
                    return false;
                }
                if (object != null) {
                    n4 = CustomTabMainActivity.c;
                    object2 = object.getStringExtra("CustomTabMainActivity.extra_url");
                } else {
                    n4 = 0;
                    object2 = null;
                }
                if (object2 == null) return n14;
                String string7 = "fbconnect://cct.";
                n8 = kotlin.text.b.s((String)object2, string7, false);
                if (n8 == 0) {
                    String string8 = super.g();
                    n8 = kotlin.text.b.s((String)object2, string8, false);
                    if (n8 == 0) return n14;
                }
                object2 = Uri.parse((String)object2);
                bundle = lz3_0.F(object2.getQuery());
                object2 = lz3_0.F(object2.getFragment());
                bundle.putAll((Bundle)object2);
                object2 = "state";
                try {
                    object2 = bundle.getString((String)object2);
                    if (object2 == null) break block21;
                    JSONObject jSONObject = new JSONObject((String)object2);
                    object2 = "7_challenge";
                    object2 = jSONObject.getString((String)object2);
                    String string9 = this.e;
                    n4 = (int)(Intrinsics.areEqual(object2, string9) ? 1 : 0);
                    break block22;
                }
                catch (JSONException jSONException) {}
            }
            n4 = 0;
            object2 = null;
        }
        if (n4 == 0) {
            String string10 = "Invalid state parameter";
            object2 = new FacebookException(string10);
            this.o(loginClient$Request, null, (FacebookException)object2);
            return n14;
        }
        object2 = bundle.getString("error");
        if (object2 == null) {
            object2 = bundle.getString("error_type");
        }
        if ((string5 = bundle.getString("error_msg")) == null) {
            String string11 = bundle.getString("error_message");
        }
        if (var10_24 == null) {
            String string12 = bundle.getString("error_description");
        }
        if ((string4 = bundle.getString("error_code")) != null) {
            try {
                n7 = Integer.parseInt(string4);
            }
            catch (NumberFormatException numberFormatException) {}
        }
        n7 = -1;
        boolean bl2 = lz3_0.A((String)object2);
        if (bl2 && (bl2 = lz3_0.A((String)var10_26)) && n7 == n10) {
            object2 = "access_token";
            n4 = (int)(bundle.containsKey((String)object2) ? 1 : 0);
            if (n4 != 0) {
                this.o(loginClient$Request, bundle, null);
                return n14;
            }
            object2 = FacebookSdk.d();
            sf0_1 sf0_12 = new sf0_1(this, 0, loginClient$Request, bundle);
            object2.execute(sf0_12);
            return n14;
        }
        if (object2 != null && ((n8 = (int)(Intrinsics.areEqual(object2, string3 = "access_denied") ? 1 : 0)) != 0 || (n8 = (int)(Intrinsics.areEqual(object2, string2 = "OAuthAccessDeniedException") ? 1 : 0)) != 0)) {
            object2 = new FacebookOperationCanceledException();
            this.o(loginClient$Request, null, (FacebookException)object2);
            return n14;
        }
        n8 = 4201;
        if (n7 == n8) {
            object2 = new FacebookOperationCanceledException();
            this.o(loginClient$Request, null, (FacebookException)object2);
            return n14;
        }
        FacebookRequestError facebookRequestError = new FacebookRequestError(n7, (String)object2, (String)var10_26);
        object2 = new FacebookServiceException(facebookRequestError, (String)var10_26);
        this.o(loginClient$Request, null, (FacebookException)object2);
        return n14;
    }

    public final void k(JSONObject jSONObject) {
        Intrinsics.checkNotNullParameter(jSONObject, "param");
        String string2 = this.e;
        jSONObject.put("7_challenge", (Object)string2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final int l(LoginClient$Request object) {
        int n3;
        Object object2 = this.f;
        String string2 = "request";
        Intrinsics.checkNotNullParameter(object, string2);
        LoginClient loginClient = this.e();
        int n4 = ((String)object2).length();
        Class<CustomTabMainActivity> clazz = null;
        if (n4 == 0) {
            return 0;
        }
        Bundle bundle = this.m((LoginClient$Request)object);
        CharSequence charSequence = "parameters";
        Intrinsics.checkNotNullParameter(bundle, (String)charSequence);
        Intrinsics.checkNotNullParameter(object, string2);
        bundle.putString("redirect_uri", (String)object2);
        boolean bl2 = ((LoginClient$Request)object).a();
        string2 = ((LoginClient$Request)object).d;
        if (bl2) {
            object2 = "app_id";
            bundle.putString((String)object2, string2);
        } else {
            object2 = "client_id";
            bundle.putString((String)object2, string2);
        }
        object2 = new JSONObject();
        string2 = "init";
        try {
            long l2 = System.currentTimeMillis();
            object2.put(string2, l2);
        }
        catch (JSONException jSONException) {}
        object2 = object2.toString();
        Intrinsics.checkNotNullExpressionValue(object2, "e2e.toString()");
        bundle.putString("e2e", (String)object2);
        bl2 = ((LoginClient$Request)object).a();
        string2 = "response_type";
        if (bl2) {
            object2 = "token,signed_request,graph_domain,granted_scopes";
            bundle.putString(string2, (String)object2);
        } else {
            object2 = ((LoginClient$Request)object).b;
            charSequence = "openid";
            bl2 = object2.contains(charSequence);
            if (bl2) {
                object2 = "nonce";
                charSequence = ((LoginClient$Request)object).o;
                bundle.putString((String)object2, (String)charSequence);
            }
            object2 = "id_token,token,signed_request,graph_domain";
            bundle.putString(string2, (String)object2);
        }
        string2 = ((LoginClient$Request)object).q;
        bundle.putString("code_challenge", string2);
        object2 = ((LoginClient$Request)object).r;
        if (object2 != null) {
            object2 = ((Enum)object2).name();
        } else {
            bl2 = false;
            object2 = null;
        }
        bundle.putString("code_challenge_method", (String)object2);
        string2 = "true";
        bundle.putString("return_scopes", string2);
        charSequence = ((LoginClient$Request)object).h;
        bundle.putString("auth_type", (String)charSequence);
        object2 = ((LoginClient$Request)object).a.name();
        bundle.putString("login_behavior", (String)object2);
        object2 = FacebookSdk.a;
        bundle.putString("sdk", "android-18.0.2");
        object2 = "sso";
        bundle.putString((String)object2, "chrome_custom_tab");
        bl2 = FacebookSdk.o;
        charSequence = "1";
        String string3 = "0";
        object2 = bl2 ? charSequence : string3;
        bundle.putString("cct_prefetching", (String)object2);
        bl2 = ((LoginClient$Request)object).m;
        LA1 lA1 = ((LoginClient$Request)object).l;
        if (bl2) {
            object2 = lA1.toString();
            String string4 = "fx_app";
            bundle.putString(string4, (String)object2);
        }
        if (bl2 = ((LoginClient$Request)object).n) {
            object2 = "skip_dedupe";
            bundle.putString((String)object2, string2);
        }
        if ((object2 = ((LoginClient$Request)object).j) != null) {
            string2 = "messenger_page_id";
            bundle.putString(string2, (String)object2);
            bl2 = ((LoginClient$Request)object).k;
            if (bl2) {
                string3 = charSequence;
            }
            object2 = "reset_messenger_state";
            bundle.putString((String)object2, string3);
        }
        if (bl2 = i) {
            object2 = "cct_over_app_switch";
            bundle.putString((String)object2, (String)charSequence);
        }
        bl2 = FacebookSdk.o;
        string2 = "oauth";
        if (bl2) {
            n3 = ((LoginClient$Request)object).a();
            object2 = "/dialog/oauth";
            charSequence = "action";
            if (n3 != 0) {
                object = com.facebook.login.a.a;
                Intrinsics.checkNotNullParameter(string2, (String)charSequence);
                n3 = (int)(Intrinsics.areEqual(string2, string2) ? 1 : 0);
                if (n3 != 0) {
                    object = q03.c();
                    object2 = "oauth/authorize";
                    object = lz3_0.b(bundle, (String)object, (String)object2);
                } else {
                    object = q03.c();
                    charSequence = new StringBuilder();
                    string3 = FacebookSdk.e();
                    ((StringBuilder)charSequence).append(string3);
                    ((StringBuilder)charSequence).append((String)object2);
                    object2 = ((StringBuilder)charSequence).toString();
                    object = lz3_0.b(bundle, (String)object, (String)object2);
                }
                a$a.a((Uri)object);
            } else {
                object = com.facebook.login.a.a;
                Intrinsics.checkNotNullParameter(string2, (String)charSequence);
                object = q03.a();
                charSequence = new StringBuilder();
                string3 = FacebookSdk.e();
                ((StringBuilder)charSequence).append(string3);
                ((StringBuilder)charSequence).append((String)object2);
                object2 = ((StringBuilder)charSequence).toString();
                object = lz3_0.b(bundle, (String)object, (String)object2);
                a$a.a((Uri)object);
            }
        }
        if ((object = loginClient.f()) == null) {
            return 0;
        }
        clazz = CustomTabMainActivity.class;
        object2 = new Intent((Context)object, clazz);
        n3 = CustomTabMainActivity.c;
        object2.putExtra("CustomTabMainActivity.extra_action", string2);
        object2.putExtra("CustomTabMainActivity.extra_params", bundle);
        object = this.d;
        if (object == null) {
            this.d = object = tf0_1.a();
        }
        object2.putExtra("CustomTabMainActivity.extra_chromePackage", (String)object);
        object = lA1.toString();
        string2 = "CustomTabMainActivity.extra_targetApp";
        object2.putExtra(string2, (String)object);
        object = loginClient.c;
        int n7 = 1;
        if (object != null) {
            ((Fragment)object).startActivityForResult((Intent)object2, n7);
        }
        return n7;
    }

    public final F1 n() {
        return this.h;
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        Intrinsics.checkNotNullParameter(parcel, "dest");
        super.writeToParcel(parcel, n3);
        String string2 = this.e;
        parcel.writeString(string2);
    }
}

