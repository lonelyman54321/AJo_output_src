/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Bundle
 *  android.os.Parcel
 *  android.text.TextUtils
 *  android.webkit.CookieSyncManager
 */
package com.facebook.login;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.text.TextUtils;
import android.webkit.CookieSyncManager;
import com.facebook.AccessToken;
import com.facebook.AccessToken$b;
import com.facebook.AuthenticationToken;
import com.facebook.FacebookException;
import com.facebook.FacebookOperationCanceledException;
import com.facebook.FacebookRequestError;
import com.facebook.FacebookSdk;
import com.facebook.FacebookServiceException;
import com.facebook.j;
import com.facebook.login.LoginClient;
import com.facebook.login.LoginClient$Request;
import com.facebook.login.LoginClient$Result;
import com.facebook.login.LoginClient$Result$a;
import com.facebook.login.LoginMethodHandler;
import com.facebook.login.LoginMethodHandler$a;
import java.util.ArrayList;
import java.util.Collection;
import kotlin.jvm.internal.Intrinsics;

public abstract class WebLoginMethodHandler
extends LoginMethodHandler {
    public String c;

    public WebLoginMethodHandler(Parcel parcel) {
        Intrinsics.checkNotNullParameter(parcel, "source");
        super(parcel);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final Bundle m(LoginClient$Request var1_1) {
        Intrinsics.checkNotNullParameter(var1_1, "request");
        var2_2 = new Bundle();
        var3_3 /* !! */  = var1_1.b;
        var4_4 = lz3_0.a;
        if (var3_3 /* !! */  != null && !(var5_5 = var3_3 /* !! */ .isEmpty())) {
            var3_3 /* !! */  = var1_1.b;
            var3_3 /* !! */  = TextUtils.join((CharSequence)",", (Iterable)var3_3 /* !! */ );
            var4_4 = "scope";
            var2_2.putString((String)var4_4, (String)var3_3 /* !! */ );
            this.a((String)var4_4, (String)var3_3 /* !! */ );
        }
        if ((var3_3 /* !! */  = var1_1.c) == null) {
            var3_3 /* !! */  = dk0_0.NONE;
        }
        var4_4 = "default_audience";
        var3_3 /* !! */  = var3_3 /* !! */ .getNativeProtocolAudience();
        var2_2.putString((String)var4_4, (String)var3_3 /* !! */ );
        var1_1 = var1_1.e;
        var1_1 = this.c((String)var1_1);
        var3_3 /* !! */  = "state";
        var2_2.putString((String)var3_3 /* !! */ , (String)var1_1);
        var1_1 = AccessToken.l;
        var1_1 = AccessToken$b.b();
        if (var1_1 != null) {
            var1_1 = var1_1.e;
        } else {
            var6_6 = false;
            var1_1 = null;
        }
        var3_3 /* !! */  = "0";
        var4_4 = "1";
        var7_7 = "access_token";
        if (var1_1 == null) ** GOTO lbl-1000
        var8_8 = this.e().f();
        if (var8_8 == null) {
            var8_8 = FacebookSdk.a();
        }
        var8_8 = var8_8.getSharedPreferences("com.facebook.login.AuthorizationClient.WebViewAuthHandler.TOKEN_STORE_KEY", 0);
        var9_9 = "TOKEN";
        var10_10 = "";
        var8_8 = var8_8.getString(var9_9, var10_10);
        var11_11 = Intrinsics.areEqual(var1_1, var8_8);
        if (var11_11) {
            var2_2.putString(var7_7, (String)var1_1);
            this.a(var7_7, (String)var4_4);
        } else lbl-1000:
        // 2 sources

        {
            if ((var1_1 = this.e().f()) != null) {
                lz3_0.d((Context)var1_1);
            }
            this.a(var7_7, (String)var3_3 /* !! */ );
        }
        var12_12 = System.currentTimeMillis();
        var1_1 = String.valueOf(var12_12);
        var7_7 = "cbt";
        var2_2.putString(var7_7, (String)var1_1);
        var1_1 = FacebookSdk.a;
        var6_6 = j.c();
        if (var6_6) {
            var3_3 /* !! */  = var4_4;
        }
        var2_2.putString("ies", (String)var3_3 /* !! */ );
        return var2_2;
    }

    public abstract F1 n();

    public final void o(LoginClient$Request object, Bundle object2, FacebookException object3) {
        int n3;
        LoginClient loginClient;
        block33: {
            String string2;
            Object object4;
            block35: {
                Object object5;
                Object object6;
                LoginClient$Result$a loginClient$Result$a;
                Object object7;
                AuthenticationToken authenticationToken;
                Object object8;
                block34: {
                    Intrinsics.checkNotNullParameter(object, "request");
                    loginClient = this.e();
                    boolean bl2 = false;
                    object4 = null;
                    this.c = null;
                    string2 = ": ";
                    if (object2 == null) break block35;
                    object3 = "e2e";
                    bl2 = object2.containsKey((String)object3);
                    if (bl2) {
                        this.c = object3 = object2.getString((String)object3);
                    }
                    object3 = ((LoginClient$Request)object).b;
                    object3 = (Collection)object3;
                    object4 = this.n();
                    object8 = ((LoginClient$Request)object).d;
                    object3 = LoginMethodHandler$a.b((Collection)object3, (Bundle)object2, object4, (String)object8);
                    object = ((LoginClient$Request)object).o;
                    authenticationToken = LoginMethodHandler$a.c((Bundle)object2, (String)object);
                    object7 = loginClient.g;
                    loginClient$Result$a = LoginClient$Result$a.SUCCESS;
                    object6 = object;
                    object5 = object3;
                    object = new LoginClient$Result((LoginClient$Request)object7, loginClient$Result$a, (AccessToken)object3, authenticationToken, null, null);
                    object2 = loginClient.f();
                    if (object2 == null) break block33;
                    try {
                        object2 = loginClient.f();
                    }
                    catch (Exception exception) {}
                    object2 = CookieSyncManager.createInstance((Context)object2);
                    object2.sync();
                    if (object3 == null) break block33;
                    object2 = ((AccessToken)object3).e;
                    object3 = this.e();
                    object3 = ((LoginClient)object3).f();
                    if (object3 != null) break block34;
                    object3 = FacebookSdk.a();
                }
                object4 = "com.facebook.login.AuthorizationClient.WebViewAuthHandler.TOKEN_STORE_KEY";
                object8 = null;
                object3 = object3.getSharedPreferences((String)object4, 0);
                object3 = object3.edit();
                object4 = "TOKEN";
                object2 = object3.putString((String)object4, (String)object2);
                try {
                    object2.apply();
                }
                catch (FacebookException facebookException) {
                    object6 = loginClient.g;
                    object = facebookException.getMessage();
                    object2 = new ArrayList();
                    if (object != null) {
                        ((ArrayList)object2).add(object);
                    }
                    object5 = TextUtils.join((CharSequence)string2, (Iterable)object2);
                    object7 = LoginClient$Result$a.ERROR;
                    loginClient$Result$a = null;
                    authenticationToken = null;
                    object8 = object;
                    object = new LoginClient$Result((LoginClient$Request)object6, (LoginClient$Result$a)((Object)object7), null, (String)object5, null);
                }
                break block33;
            }
            boolean bl3 = object3 instanceof FacebookOperationCanceledException;
            if (bl3) {
                LoginClient$Request loginClient$Request = loginClient.g;
                LoginClient$Result$a loginClient$Result$a = LoginClient$Result$a.CANCEL;
                Object var9_13 = null;
                String string3 = "User canceled log in.";
                Object var11_19 = null;
                Object object9 = object;
                object = new LoginClient$Result(loginClient$Request, loginClient$Result$a, null, string3, null);
            } else {
                this.c = null;
                if (object3 != null) {
                    object = ((Throwable)object3).getMessage();
                } else {
                    bl3 = false;
                    object = null;
                }
                n3 = object3 instanceof FacebookServiceException;
                if (n3 != 0) {
                    object3 = (FacebookServiceException)object3;
                    object = ((FacebookServiceException)object3).b;
                    n3 = ((FacebookRequestError)object).b;
                    object4 = String.valueOf(n3);
                    object = ((FacebookRequestError)object).toString();
                }
                F1 f1 = object4;
                LoginClient$Request loginClient$Request = loginClient.g;
                object2 = new ArrayList();
                if (object != null) {
                    ((ArrayList)object2).add(object);
                }
                String string4 = TextUtils.join((CharSequence)string2, (Iterable)object2);
                LoginClient$Result$a loginClient$Result$a = LoginClient$Result$a.ERROR;
                Object var11_20 = null;
                Object object10 = object;
                object = new LoginClient$Result(loginClient$Request, loginClient$Result$a, null, string4, (String)((Object)f1));
            }
        }
        if ((n3 = (int)(lz3_0.A((String)(object2 = this.c)) ? 1 : 0)) == 0) {
            object2 = this.c;
            this.h((String)object2);
        }
        loginClient.e((LoginClient$Result)object);
    }
}

