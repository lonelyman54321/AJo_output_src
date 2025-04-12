/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.Intent
 *  android.os.Bundle
 *  android.os.Parcel
 *  android.os.Parcelable
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package com.facebook.login;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.FacebookException;
import com.facebook.FacebookRequestError;
import com.facebook.FacebookSdk;
import com.facebook.FacebookServiceException;
import com.facebook.GraphRequest;
import com.facebook.GraphRequest$c;
import com.facebook.appevents.g;
import com.facebook.f;
import com.facebook.j;
import com.facebook.login.LoginClient;
import com.facebook.login.LoginClient$Request;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

public abstract class LoginMethodHandler
implements Parcelable {
    public HashMap a;
    public LoginClient b;

    public LoginMethodHandler(Parcel parcel) {
        HashMap<String, String> hashMap;
        Intrinsics.checkNotNullParameter(parcel, "source");
        Object object = lz3_0.a;
        object = "parcel";
        Intrinsics.checkNotNullParameter(parcel, (String)object);
        int n3 = parcel.readInt();
        LinkedHashMap linkedHashMap = null;
        if (n3 < 0) {
            hashMap = null;
        } else {
            hashMap = new HashMap<String, String>();
            for (int i3 = 0; i3 < n3; ++i3) {
                String string2 = parcel.readString();
                String string3 = parcel.readString();
                hashMap.put(string2, string3);
            }
        }
        if (hashMap != null) {
            linkedHashMap = fh1_2.q(hashMap);
        }
        this.a = linkedHashMap;
    }

    public LoginMethodHandler(LoginClient loginClient) {
        Intrinsics.checkNotNullParameter(loginClient, "loginClient");
        Intrinsics.checkNotNullParameter(loginClient, "<set-?>");
        this.b = loginClient;
    }

    public final void a(String string2, String string3) {
        HashMap<String, String> hashMap = this.a;
        if (hashMap == null) {
            this.a = hashMap = new HashMap<String, String>();
        }
        if ((hashMap = this.a) != null) {
            string3 = string3 != null ? string3.toString() : null;
            string2 = hashMap.put(string2, string3);
        }
    }

    public void b() {
    }

    public final String c(String string2) {
        Intrinsics.checkNotNullParameter(string2, "authId");
        JSONObject jSONObject = new JSONObject();
        String string3 = "0_auth_logger_id";
        jSONObject.put(string3, (Object)string2);
        string2 = "3_method";
        string3 = this.f();
        jSONObject.put(string2, (Object)string3);
        try {
            this.k(jSONObject);
        }
        catch (JSONException jSONException) {
            jSONException.getMessage();
        }
        string2 = jSONObject.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "param.toString()");
        return string2;
    }

    public final LoginClient e() {
        LoginClient loginClient = this.b;
        if (loginClient != null) {
            return loginClient;
        }
        Intrinsics.throwUninitializedPropertyAccessException("loginClient");
        return null;
    }

    public abstract String f();

    public String g() {
        StringBuilder stringBuilder = new StringBuilder("fb");
        String string2 = FacebookSdk.b();
        stringBuilder.append(string2);
        stringBuilder.append("://authorize/");
        return stringBuilder.toString();
    }

    public final void h(String string2) {
        Object object = this.e().g;
        if (object == null || (object = ((LoginClient$Request)object).d) == null) {
            object = FacebookSdk.b();
        }
        Object object2 = this.e().f();
        g g3 = new g((Context)object2, (String)object);
        Intrinsics.checkNotNullParameter(g3, "loggerImpl");
        string2 = E1.a("fb_web_login_e2e", string2);
        long l2 = System.currentTimeMillis();
        string2.putLong("fb_web_login_switchback_time", l2);
        object2 = "app_id";
        string2.putString((String)object2, (String)object);
        object = FacebookSdk.a;
        boolean bl2 = j.c();
        if (bl2) {
            object = "fb_dialogs_web_login_dialog_complete";
            g3.h((Bundle)string2, (String)object);
        }
    }

    public boolean i(int n3, int n4, Intent intent) {
        return false;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void j(LoginClient$Request object, Bundle object2) {
        JSONException jSONException2;
        CharSequence charSequence;
        block9: {
            boolean bl2;
            boolean bl3;
            Object object3;
            Object object4;
            block8: {
                charSequence = "id_token";
                Intrinsics.checkNotNullParameter(object, "request");
                Intrinsics.checkNotNullParameter(object2, "values");
                object4 = "code";
                object3 = object2.getString((String)object4);
                bl3 = lz3_0.A((String)object3);
                if (bl3) {
                    object = new FacebookException("No code param found from the request");
                    throw object;
                }
                if (object3 == null) {
                    object = new FacebookException("Failed to create code exchange request");
                    throw object;
                }
                String string2 = this.g();
                object = ((LoginClient$Request)object).p;
                if (object == null) {
                    object = "";
                }
                Intrinsics.checkNotNullParameter(object3, "authorizationCode");
                String string3 = "codeVerifier";
                Bundle bundle = dm_1.a(string2, "redirectUri", (String)object, string3);
                bundle.putString((String)object4, (String)object3);
                object4 = FacebookSdk.b();
                bundle.putString("client_id", (String)object4);
                bundle.putString("redirect_uri", string2);
                bundle.putString("code_verifier", (String)object);
                object = GraphRequest.j;
                bl2 = false;
                object = null;
                object4 = GraphRequest$c.g(null, "oauth/access_token", null);
                object3 = Qa1.GET;
                ((GraphRequest)object4).k((Qa1)((Object)object3));
                Intrinsics.checkNotNullParameter(bundle, "<set-?>");
                ((GraphRequest)object4).d = bundle;
                object4 = ((GraphRequest)object4).c();
                object3 = ((f)object4).c;
                if (object3 != null) {
                    object2 = ((FacebookRequestError)object3).a();
                    object = new FacebookServiceException((FacebookRequestError)object3, (String)object2);
                    throw object;
                }
                try {
                    object4 = ((f)object4).b;
                    object3 = "access_token";
                    if (object4 == null) break block8;
                    object = object4.getString((String)object3);
                }
                catch (JSONException jSONException2) {
                    break block9;
                }
            }
            if (object4 != null && !(bl3 = lz3_0.A((String)object))) {
                object2.putString((String)object3, (String)object);
                bl2 = object4.has((String)charSequence);
                if (bl2) {
                    object = object4.getString((String)charSequence);
                    object2.putString((String)charSequence, (String)object);
                }
                return;
            }
            object2 = "No access token found from result";
            object = new FacebookException((String)object2);
            throw object;
        }
        charSequence = new StringBuilder("Fail to process code exchange response: ");
        String string4 = jSONException2.getMessage();
        ((StringBuilder)charSequence).append(string4);
        string4 = ((StringBuilder)charSequence).toString();
        object2 = new FacebookException(string4);
        throw object2;
    }

    public void k(JSONObject jSONObject) {
        Intrinsics.checkNotNullParameter(jSONObject, "param");
    }

    public abstract int l(LoginClient$Request var1);

    public void writeToParcel(Parcel parcel, int n3) {
        Intrinsics.checkNotNullParameter(parcel, "dest");
        Object object = this.a;
        Object object2 = lz3_0.a;
        object2 = "parcel";
        Intrinsics.checkNotNullParameter(parcel, (String)object2);
        if (object == null) {
            n3 = -1;
            parcel.writeInt(n3);
        } else {
            int n4 = object.size();
            parcel.writeInt(n4);
            object = object.entrySet().iterator();
            while ((n4 = (int)(object.hasNext() ? 1 : 0)) != 0) {
                object2 = (Map.Entry)object.next();
                String string2 = (String)object2.getKey();
                object2 = (String)object2.getValue();
                parcel.writeString(string2);
                parcel.writeString((String)object2);
            }
        }
    }
}

