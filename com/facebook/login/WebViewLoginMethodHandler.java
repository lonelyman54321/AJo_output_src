/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Bundle
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package com.facebook.login;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.facebook.FacebookSdk;
import com.facebook.internal.WebDialog;
import com.facebook.internal.a;
import com.facebook.login.LoginClient;
import com.facebook.login.LoginClient$Request;
import com.facebook.login.WebLoginMethodHandler;
import com.facebook.login.WebViewLoginMethodHandler$a;
import com.facebook.login.WebViewLoginMethodHandler$b;
import com.facebook.login.WebViewLoginMethodHandler$c;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

public class WebViewLoginMethodHandler
extends WebLoginMethodHandler {
    public static final Parcelable.Creator CREATOR;
    public WebDialog d;
    public String e;
    public final String f;
    public final F1 g;

    static {
        WebViewLoginMethodHandler$b webViewLoginMethodHandler$b = new Object();
        CREATOR = webViewLoginMethodHandler$b;
    }

    public WebViewLoginMethodHandler(Parcel object) {
        F1 f1;
        Intrinsics.checkNotNullParameter(object, "source");
        super((Parcel)object);
        this.f = "web_view";
        this.g = f1 = F1.WEB_VIEW;
        object = object.readString();
        this.e = object;
    }

    public WebViewLoginMethodHandler(LoginClient object) {
        String string2 = "loginClient";
        Intrinsics.checkNotNullParameter(object, string2);
        Intrinsics.checkNotNullParameter(object, string2);
        super((LoginClient)object);
        this.f = "web_view";
        object = F1.WEB_VIEW;
        this.g = object;
    }

    public final void b() {
        WebDialog webDialog = this.d;
        if (webDialog != null) {
            if (webDialog != null) {
                webDialog.cancel();
            }
            webDialog = null;
            this.d = null;
        }
    }

    public final int describeContents() {
        return 0;
    }

    public final String f() {
        return this.f;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final int l(LoginClient$Request object) {
        boolean bl2;
        boolean bl3;
        void var2_5;
        LA1 lA1;
        uy1 uy12;
        String string2;
        Intrinsics.checkNotNullParameter(object, "request");
        Bundle bundle = this.m((LoginClient$Request)object);
        WebViewLoginMethodHandler$c webViewLoginMethodHandler$c = new WebViewLoginMethodHandler$c(this, (LoginClient$Request)object);
        Object object2 = new JSONObject();
        String string3 = "init";
        try {
            long l2 = System.currentTimeMillis();
            object2.put(string3, l2);
        }
        catch (JSONException jSONException) {}
        object2 = object2.toString();
        Intrinsics.checkNotNullExpressionValue(object2, "e2e.toString()");
        this.e = object2;
        string3 = "e2e";
        this.a(string3, (String)object2);
        object2 = this.e().f();
        if (object2 == null) {
            return 0;
        }
        boolean bl4 = lz3_0.x((Context)object2);
        String string4 = "context";
        Intrinsics.checkNotNullParameter(object2, string4);
        String string5 = ((LoginClient$Request)object).d;
        String string6 = "applicationId";
        Intrinsics.checkNotNullParameter(string5, string6);
        Intrinsics.checkNotNullParameter(bundle, "parameters");
        Intrinsics.checkNotNullParameter(object2, string4);
        String string7 = "action";
        String string8 = "oauth";
        Intrinsics.checkNotNullParameter(string8, string7);
        WebViewLoginMethodHandler$a webViewLoginMethodHandler$a = new Object();
        if (string5 == null) {
            Xz3.f(object2, string4);
            string5 = FacebookSdk.b();
        }
        Xz3.g(string5, string6);
        webViewLoginMethodHandler$a.b = string5;
        webViewLoginMethodHandler$a.a = object2;
        webViewLoginMethodHandler$a.d = bundle;
        webViewLoginMethodHandler$a.e = string2 = "fbconnect://success";
        webViewLoginMethodHandler$a.f = uy12 = uy1.NATIVE_WITH_FALLBACK;
        webViewLoginMethodHandler$a.g = lA1 = LA1.FACEBOOK;
        String string9 = this.e;
        string5 = "null cannot be cast to non-null type kotlin.String";
        Intrinsics.checkNotNull(string9, string5);
        Intrinsics.checkNotNullParameter(string9, string3);
        string3 = "<set-?>";
        Intrinsics.checkNotNullParameter(string9, string3);
        webViewLoginMethodHandler$a.j = string9;
        if (bl4) {
            String string10 = "fbconnect://chrome_os_success";
        }
        webViewLoginMethodHandler$a.e = var2_5;
        String string11 = ((LoginClient$Request)object).h;
        Intrinsics.checkNotNullParameter(string11, "authType");
        Intrinsics.checkNotNullParameter(string11, string3);
        webViewLoginMethodHandler$a.k = string11;
        uy1 uy13 = ((LoginClient$Request)object).a;
        Intrinsics.checkNotNullParameter((Object)uy13, "loginBehavior");
        webViewLoginMethodHandler$a.f = uy13;
        LA1 lA12 = ((LoginClient$Request)object).l;
        Intrinsics.checkNotNullParameter((Object)lA12, "targetApp");
        webViewLoginMethodHandler$a.g = lA12;
        webViewLoginMethodHandler$a.h = bl3 = ((LoginClient$Request)object).m;
        webViewLoginMethodHandler$a.i = bl2 = ((LoginClient$Request)object).n;
        webViewLoginMethodHandler$a.c = webViewLoginMethodHandler$c;
        object = webViewLoginMethodHandler$a.a();
        this.d = object;
        object = new a();
        int n3 = 1;
        ((Fragment)object).setRetainInstance(n3 != 0);
        WebDialog webDialog = this.d;
        ((a)object).a = webDialog;
        FragmentManager fragmentManager = ((FragmentActivity)object2).getSupportFragmentManager();
        ((DialogFragment)object).show(fragmentManager, "FacebookDialogFragment");
        return n3;
    }

    public final F1 n() {
        return this.g;
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        Intrinsics.checkNotNullParameter(parcel, "dest");
        super.writeToParcel(parcel, n3);
        String string2 = this.e;
        parcel.writeString(string2);
    }
}

