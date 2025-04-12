/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Intent
 *  android.os.Bundle
 *  android.os.Parcelable
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 */
package com.facebook.login;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.AccessToken;
import com.facebook.AccessToken$b;
import com.facebook.FacebookException;
import com.facebook.FacebookSdk;
import com.facebook.common.R$id;
import com.facebook.common.R$layout;
import com.facebook.login.CustomTabLoginMethodHandler;
import com.facebook.login.DeviceAuthMethodHandler;
import com.facebook.login.GetTokenLoginMethodHandler;
import com.facebook.login.InstagramAppLoginMethodHandler;
import com.facebook.login.KatanaProxyLoginMethodHandler;
import com.facebook.login.LoginClient;
import com.facebook.login.LoginClient$Request;
import com.facebook.login.LoginMethodHandler;
import com.facebook.login.WebViewLoginMethodHandler;
import com.facebook.login.h$a;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

public class h
extends Fragment {
    public String a;
    public LoginClient$Request b;
    public LoginClient c;
    public I3 d;
    public View e;

    public final LoginClient Oa() {
        LoginClient loginClient = this.c;
        if (loginClient != null) {
            return loginClient;
        }
        Intrinsics.throwUninitializedPropertyAccessException("loginClient");
        return null;
    }

    public final void onActivityResult(int n3, int n4, Intent intent) {
        super.onActivityResult(n3, n4, intent);
        this.Oa().j(n3, n4, intent);
    }

    public final void onCreate(Bundle object) {
        Object object2;
        block11: {
            Object object3;
            block10: {
                int n3;
                block8: {
                    block9: {
                        super.onCreate((Bundle)object);
                        if (object != null) {
                            object2 = "loginClient";
                            object = (LoginClient)object.getParcelable((String)object2);
                        } else {
                            object = null;
                        }
                        object2 = "Can't set fragment once it is already set.";
                        if (object == null) break block8;
                        object3 = object.c;
                        if (object3 != null) break block9;
                        object.c = this;
                        break block10;
                    }
                    object = new FacebookException((String)object2);
                    throw object;
                }
                Intrinsics.checkNotNullParameter(this, "fragment");
                object = new Object();
                object.b = n3 = -1;
                object3 = object.c;
                if (object3 != null) break block11;
                object.c = this;
            }
            this.c = object;
            object = this.Oa();
            object.d = object2 = new Be1(this);
            object = this.getActivity();
            if (object == null) {
                return;
            }
            object2 = object.getCallingActivity();
            if (object2 != null) {
                this.a = object2 = object2.getPackageName();
            }
            object2 = object.getIntent();
            if (object2 != null && (object2 = object2.getBundleExtra((String)(object3 = "com.facebook.LoginFragment:Request"))) != null) {
                object3 = "request";
                this.b = object2 = (LoginClient$Request)object2.getParcelable((String)object3);
            }
            object2 = new x3();
            object3 = new Gy1(this, (FragmentActivity)object);
            object = new Fy1(object3, 0);
            object = this.registerForActivityResult((x3)object2, (w3)object);
            Intrinsics.checkNotNullExpressionValue(object, "registerForActivityResul\u2026andlerCallback(activity))");
            this.d = object;
            return;
        }
        object = new FacebookException((String)object2);
        throw object;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup object, Bundle object2) {
        Intrinsics.checkNotNullParameter(layoutInflater, "inflater");
        int n3 = R$layout.com_facebook_login_fragment;
        layoutInflater = layoutInflater.inflate(n3, object, false);
        int n4 = R$id.com_facebook_login_fragment_progress_bar;
        object = layoutInflater.findViewById(n4);
        Intrinsics.checkNotNullExpressionValue(object, "view.findViewById<View>(\u2026in_fragment_progress_bar)");
        this.e = object;
        object = this.Oa();
        object2 = new h$a(this);
        object.e = object2;
        return layoutInflater;
    }

    public final void onDestroy() {
        LoginMethodHandler loginMethodHandler = this.Oa().g();
        if (loginMethodHandler != null) {
            loginMethodHandler.b();
        }
        super.onDestroy();
    }

    public final void onPause() {
        int n3;
        super.onPause();
        View view = this.getView();
        if (view != null) {
            n3 = R$id.com_facebook_login_fragment_progress_bar;
            view = view.findViewById(n3);
        } else {
            view = null;
        }
        if (view != null) {
            n3 = 8;
            view.setVisibility(n3);
        }
    }

    public final void onResume() {
        Object object;
        block15: {
            block14: {
                int n3;
                super.onResume();
                object = this.a;
                if (object == null) {
                    object = this.getActivity();
                    if (object != null) {
                        object.finish();
                    }
                    return;
                }
                object = this.Oa();
                Object object2 = this.b;
                Object object3 = ((LoginClient)object).g;
                if (object3 != null && (n3 = ((LoginClient)object).b) >= 0 || object2 == null) break block14;
                if (object3 != null) break block15;
                object3 = AccessToken.l;
                boolean bl2 = AccessToken$b.c();
                if (!bl2 || (bl2 = ((LoginClient)object).b())) {
                    boolean bl3;
                    LoginMethodHandler loginMethodHandler;
                    ((LoginClient)object).g = object2;
                    Intrinsics.checkNotNullParameter(object2, "request");
                    object3 = new Object();
                    n3 = (int)(object2.a() ? 1 : 0);
                    uy1 uy12 = object2.a;
                    if (n3 != 0) {
                        n3 = (int)(FacebookSdk.q ? 1 : 0);
                        if (n3 == 0 && (n3 = (int)(uy12.allowsInstagramAppAuth() ? 1 : 0)) != 0) {
                            loginMethodHandler = new InstagramAppLoginMethodHandler((LoginClient)object);
                            ((ArrayList)object3).add(loginMethodHandler);
                        }
                    } else {
                        n3 = (int)(uy12.allowsGetTokenAuth() ? 1 : 0);
                        if (n3 != 0) {
                            loginMethodHandler = new GetTokenLoginMethodHandler((LoginClient)object);
                            ((ArrayList)object3).add(loginMethodHandler);
                        }
                        if ((n3 = (int)(FacebookSdk.q ? 1 : 0)) == 0 && (n3 = (int)(uy12.allowsKatanaAuth() ? 1 : 0)) != 0) {
                            loginMethodHandler = new KatanaProxyLoginMethodHandler((LoginClient)object);
                            ((ArrayList)object3).add(loginMethodHandler);
                        }
                    }
                    if ((n3 = (int)(uy12.allowsCustomTabAuth() ? 1 : 0)) != 0) {
                        loginMethodHandler = new CustomTabLoginMethodHandler((LoginClient)object);
                        ((ArrayList)object3).add(loginMethodHandler);
                    }
                    if ((n3 = (int)(uy12.allowsWebViewAuth() ? 1 : 0)) != 0) {
                        loginMethodHandler = new WebViewLoginMethodHandler((LoginClient)object);
                        ((ArrayList)object3).add(loginMethodHandler);
                    }
                    if (!(bl3 = object2.a()) && (bl3 = uy12.allowsDeviceAuth())) {
                        object2 = new DeviceAuthMethodHandler((LoginClient)object);
                        ((ArrayList)object3).add(object2);
                    }
                    bl3 = false;
                    object2 = new LoginMethodHandler[]{};
                    object2 = ((ArrayList)object3).toArray((T[])object2);
                    ((LoginClient)object).a = object2;
                    ((LoginClient)object).k();
                }
            }
            return;
        }
        object = new FacebookException("Attempted to authorize while a request is pending.");
        throw object;
    }

    public final void onSaveInstanceState(Bundle bundle) {
        Intrinsics.checkNotNullParameter(bundle, "outState");
        super.onSaveInstanceState(bundle);
        LoginClient loginClient = this.Oa();
        bundle.putParcelable("loginClient", (Parcelable)loginClient);
    }
}

