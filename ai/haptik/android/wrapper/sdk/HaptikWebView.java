/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.Animator$AnimatorListener
 *  android.content.Context
 *  android.content.Intent
 *  android.content.SharedPreferences
 *  android.net.Uri
 *  android.os.Bundle
 *  android.webkit.PermissionRequest
 *  android.webkit.ValueCallback
 *  android.webkit.WebChromeClient
 *  android.webkit.WebView
 *  android.webkit.WebViewClient
 *  android.widget.RelativeLayout
 *  org.json.JSONObject
 */
package ai.haptik.android.wrapper.sdk;

import ai.haptik.android.wrapper.sdk.HaptikSDK;
import ai.haptik.android.wrapper.sdk.HaptikWebView$a;
import ai.haptik.android.wrapper.sdk.HaptikWebView$b;
import ai.haptik.android.wrapper.sdk.R$bool;
import ai.haptik.android.wrapper.sdk.R$id;
import ai.haptik.android.wrapper.sdk.R$layout;
import ai.haptik.android.wrapper.sdk.SignupDataCallback;
import ai.haptik.android.wrapper.sdk.model.Response;
import ai.haptik.android.wrapper.sdk.model.SignupData;
import android.animation.Animator;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.webkit.PermissionRequest;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.RelativeLayout;
import androidx.appcompat.app.AppCompatActivity;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.b;
import org.json.JSONObject;

public final class HaptikWebView
extends AppCompatActivity
implements hk3_2 {
    public static final /* synthetic */ int t0;
    public WebView X;
    public RelativeLayout Y;
    public boolean Z;
    public ValueCallback k0;
    public I3 p0;
    public I3 q0;
    public PermissionRequest r0;
    public boolean s0;

    /*
     * Enabled aggressive block sorting
     */
    public final void d() {
        SharedPreferences sharedPreferences2 = yl0.a;
        boolean bl2 = false;
        String string2 = null;
        Object object = "helper";
        if (sharedPreferences2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object);
            throw null;
        }
        String string3 = "language_sync_pending";
        boolean bl3 = sharedPreferences2.getBoolean(string3, false);
        if (!bl3) return;
        SharedPreferences sharedPreferences3 = yl0.a;
        if (sharedPreferences3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object);
            throw null;
        }
        String string4 = "en";
        String string5 = sharedPreferences3.getString("language_code", string4);
        string3 = yl0.a;
        if (string3 != null) {
            string2 = "language_sync_hidden";
            bl2 = string3.getBoolean(string2, false);
            object = new C31(this, string5, bl2);
            this.runOnUiThread((Runnable)object);
            return;
        }
        Intrinsics.throwUninitializedPropertyAccessException((String)object);
        throw null;
    }

    public final void f() {
        Object object = yl0.a;
        if (object != null) {
            String string2 = "";
            object = object.getString("fcm_token", string2);
            Intrinsics.checkNotNull(object);
            Object object2 = "helper.getString(FCM_TOKEN, \"\")!!";
            Intrinsics.checkNotNullExpressionValue(object, (String)object2);
            boolean bl2 = b.k((CharSequence)object) ^ true;
            if (bl2) {
                object2 = new F31(this, (String)object);
                this.runOnUiThread((Runnable)object2);
            }
            return;
        }
        Intrinsics.throwUninitializedPropertyAccessException("helper");
        throw null;
    }

    public final String getInitSettings() {
        String string2 = HaptikSDK.INSTANCE.getInitSettings$sdk_release().toString();
        Intrinsics.checkNotNullExpressionValue(string2, "HaptikSDK.getInitSettings().toString()");
        return string2;
    }

    public final String getSignupData() {
        String string2 = HaptikSDK.INSTANCE.getSignupData$sdk_release().toString();
        Intrinsics.checkNotNullExpressionValue(string2, "HaptikSDK.getSignupData().toString()");
        return string2;
    }

    public final boolean isLogoutPending() {
        SharedPreferences sharedPreferences2 = yl0.a;
        String string2 = "helper";
        if (sharedPreferences2 != null) {
            String string3 = "logout_pending";
            boolean bl2 = sharedPreferences2.getBoolean(string3, false);
            if (bl2) {
                sharedPreferences2 = yl0.a;
                if (sharedPreferences2 != null) {
                    sharedPreferences2 = sharedPreferences2.edit();
                    sharedPreferences2.putBoolean(string3, false);
                    sharedPreferences2.apply();
                    return true;
                }
                Intrinsics.throwUninitializedPropertyAccessException(string2);
                throw null;
            }
            return false;
        }
        Intrinsics.throwUninitializedPropertyAccessException(string2);
        throw null;
    }

    public final boolean isSdkEventCallbackAvailable() {
        return HaptikSDK.INSTANCE.isSdkEventAvailable$sdk_release();
    }

    public final void onCreate(Bundle object) {
        int n3;
        JSONObject jSONObject;
        Object object2;
        int n4;
        super.onCreate((Bundle)object);
        object = this.getResources();
        int n7 = R$bool.portrait_only;
        int n8 = object.getBoolean(n7);
        n7 = 1;
        if (n8 != 0) {
            this.setRequestedOrientation(n7);
        }
        if ((n8 = (object = this.getApplication()) instanceof SignupDataCallback) != 0 && (n4 = (object2 = ((HaptikSDK)(object = HaptikSDK.INSTANCE)).getSignupData$sdk_release()).length()) == 0) {
            object2 = this.getApplication();
            if (object2 != null) {
                jSONObject = (object2 = ((SignupDataCallback)object2).signupData()).getJsonObject$sdk_release();
                n3 = jSONObject.length();
                if (n3 > 0) {
                    ((HaptikSDK)object).setSignupData$sdk_release((SignupData)object2);
                }
            } else {
                object = new NullPointerException("null cannot be cast to non-null type ai.haptik.android.wrapper.sdk.SignupDataCallback");
                throw object;
            }
        }
        n8 = R$layout.activity_haptik_web_view;
        this.setContentView(n8);
        n8 = R$id.webView;
        object = this.findViewById(n8);
        Intrinsics.checkNotNullExpressionValue(object, "findViewById(R.id.webView)");
        object = (WebView)object;
        this.X = object;
        n8 = R$id.loader;
        object = this.findViewById(n8);
        Intrinsics.checkNotNullExpressionValue(object, "findViewById(R.id.loader)");
        object = (RelativeLayout)object;
        this.Y = object;
        object = HaptikSDK.INSTANCE;
        object2 = ((HaptikSDK)object).getInitSettings$sdk_release();
        n4 = (int)(object2.optBoolean("no-loader") ? 1 : 0);
        n3 = 0;
        jSONObject = null;
        if (n4 != 0) {
            object2 = this.Y;
            if (object2 != null) {
                int n10 = 8;
                object2.setVisibility(n10);
            } else {
                Intrinsics.throwUninitializedPropertyAccessException("loader");
                throw null;
            }
        }
        object2 = this.X;
        String string2 = "webView";
        if (object2 != null) {
            object2 = object2.getSettings();
            String string3 = "webView.settings";
            Intrinsics.checkNotNullExpressionValue(object2, string3);
            object2.setJavaScriptEnabled(n7 != 0);
            object2.setDatabaseEnabled(n7 != 0);
            object2.setAllowFileAccess(n7 != 0);
            object2.setAllowContentAccess(n7 != 0);
            object2.setDomStorageEnabled(n7 != 0);
            object2.setLoadsImagesAutomatically(n7 != 0);
            n7 = -1;
            object2.setCacheMode(n7);
            Object object3 = this.X;
            if (object3 != null) {
                n4 = 2;
                object3.setLayerType(n4, null);
                object3 = this.X;
                if (object3 != null) {
                    object2 = new HaptikWebView$a(this);
                    object3.setWebChromeClient((WebChromeClient)object2);
                    object3 = this.X;
                    if (object3 != null) {
                        object2 = "haptikEvent";
                        object3.addJavascriptInterface((Object)this, (String)object2);
                        object3 = this.X;
                        if (object3 != null) {
                            object2 = new HaptikWebView$b(this);
                            object3.setWebViewClient((WebViewClient)object2);
                            ((HaptikSDK)object).setWebView$sdk_release(this);
                            object3 = this.X;
                            if (object3 != null) {
                                object3.loadUrl("https://toolassets.haptikapi.com/platform/javascript-xdk/production/wrapper.html");
                                n8 = (int)(((HaptikSDK)object).getInitSettings$sdk_release().has("signup-type") ? 1 : 0);
                                this.Z = n8;
                                object = new x3();
                                object3 = new d31_0(this);
                                object = this.registerForActivityResult((x3)object, (w3)object3);
                                Intrinsics.checkNotNullExpressionValue(object, "registerForActivityResult(ActivityResultContracts.OpenDocument()) { uri: Uri? ->\n            if (uri != null)\n                filePathCallback?.onReceiveValue(arrayOf(uri))\n            else\n                filePathCallback?.onReceiveValue(null)\n        }");
                                object3 = "<set-?>";
                                Intrinsics.checkNotNullParameter(object, (String)object3);
                                this.p0 = object;
                                object = new x3();
                                object2 = new za_2(this, 4);
                                object = this.registerForActivityResult((x3)object, (w3)object2);
                                Intrinsics.checkNotNullExpressionValue(object, "registerForActivityResult(ActivityResultContracts.RequestPermission()) { isGranted: Boolean ->\n            if (isGranted) {\n                acceptWebViewMicPermission()\n            } else {\n                 if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M\n                    && shouldShowRequestPermissionRationale(Manifest.permission.RECORD_AUDIO)) {\n                    // Todo show dialog\n                    Toast.makeText(this@HaptikWebView, \"Please grant Mic permission from the App Settings.\", Toast.LENGTH_LONG).show()\n                } else {\n                     permissionRequest.deny()\n                 }\n            }\n        }");
                                Intrinsics.checkNotNullParameter(object, (String)object3);
                                this.q0 = object;
                                return;
                            }
                            Intrinsics.throwUninitializedPropertyAccessException(string2);
                            throw null;
                        }
                        Intrinsics.throwUninitializedPropertyAccessException(string2);
                        throw null;
                    }
                    Intrinsics.throwUninitializedPropertyAccessException(string2);
                    throw null;
                }
                Intrinsics.throwUninitializedPropertyAccessException(string2);
                throw null;
            }
            Intrinsics.throwUninitializedPropertyAccessException(string2);
            throw null;
        }
        Intrinsics.throwUninitializedPropertyAccessException(string2);
        throw null;
    }

    public final void onDestroy() {
        super.onDestroy();
        HaptikSDK.INSTANCE.setWebView$sdk_release(null);
        WebView webView = this.X;
        String string2 = "webView";
        if (webView != null) {
            String string3 = "about:blank";
            webView.loadUrl(string3);
            webView = this.X;
            if (webView != null) {
                webView.removeAllViews();
                webView = this.X;
                if (webView != null) {
                    webView.destroy();
                    return;
                }
                Intrinsics.throwUninitializedPropertyAccessException(string2);
                throw null;
            }
            Intrinsics.throwUninitializedPropertyAccessException(string2);
            throw null;
        }
        Intrinsics.throwUninitializedPropertyAccessException(string2);
        throw null;
    }

    public final void onPause() {
        WebView webView = this.X;
        if (webView != null) {
            webView.loadUrl("javascript:window.HaptikSDK.pause()");
            super.onPause();
            return;
        }
        Intrinsics.throwUninitializedPropertyAccessException("webView");
        throw null;
    }

    public final void onStart() {
        super.onStart();
        Intrinsics.checkNotNullParameter(this, "context");
        s52 s522 = new s52((Context)this);
        s522.b.cancel(null, 101010);
        this.s0 = true;
    }

    public final void onStop() {
        super.onStop();
        this.s0 = false;
    }

    public final void onXdkEvent(String object) {
        Intrinsics.checkNotNullParameter(object, "event");
        Object object2 = new JSONObject((String)object);
        object = object2.getString("event_name");
        Object object3 = "status";
        boolean bl2 = object2.getBoolean((String)object3);
        if (object != null) {
            int n3 = ((String)object).hashCode();
            String string2 = "fcm_token_sync_required";
            String string3 = "helper";
            switch (n3) {
                default: {
                    break;
                }
                case 1822501037: {
                    Object object4 = "user_registration";
                    boolean bl3 = ((String)object).equals(object4);
                    if (!bl3) break;
                    if (bl2) {
                        this.f();
                        bl3 = this.Z;
                        if (bl3) {
                            int n4;
                            this.d();
                            object = HaptikSDK.INSTANCE.getLaunchMessageData$sdk_release();
                            if (object != null && (n4 = object.length()) > 0) {
                                object2 = new E31(this, (JSONObject)object);
                                this.runOnUiThread((Runnable)object2);
                            }
                        }
                        object = HaptikSDK.INSTANCE;
                        bl2 = true;
                        n3 = 2;
                        object2 = new Response(bl2, null, n3, null);
                        ((HaptikSDK)object).fireSignupCallback$sdk_release((Response)object2);
                        break;
                    }
                    object = "message";
                    object2 = object2.optString((String)object);
                    object3 = HaptikSDK.INSTANCE;
                    Intrinsics.checkNotNullExpressionValue(object2, (String)object);
                    object4 = new Response(false, (String)object2);
                    ((HaptikSDK)object3).fireSignupCallback$sdk_release((Response)object4);
                    break;
                }
                case 1738301741: {
                    object2 = "sdk_load_complete";
                    boolean bl4 = ((String)object).equals(object2);
                    if (!bl4) break;
                    object = this.Y;
                    if (object != null) {
                        object = object.animate();
                        int n7 = 0;
                        object = object.alpha(0.0f);
                        long l2 = 350L;
                        object = object.setDuration(l2);
                        object2 = new ck3_2(this);
                        object.setListener((Animator.AnimatorListener)object2);
                        bl4 = this.Z;
                        if (!bl4) {
                            this.d();
                            object = HaptikSDK.INSTANCE.getLaunchMessageData$sdk_release();
                            if (object != null && (n7 = object.length()) > 0) {
                                object2 = new E31(this, (JSONObject)object);
                                this.runOnUiThread((Runnable)object2);
                            }
                        }
                        if ((object = yl0.a) != null) {
                            bl4 = object.getBoolean(string2, false);
                            if (!bl4) break;
                            this.f();
                            break;
                        }
                        Intrinsics.throwUninitializedPropertyAccessException(string3);
                        throw null;
                    }
                    Intrinsics.throwUninitializedPropertyAccessException("loader");
                    throw null;
                }
                case 474958002: {
                    object2 = "close_webview";
                    boolean bl5 = ((String)object).equals(object2);
                    if (!bl5) break;
                    boolean bl6 = false;
                    object2 = null;
                    object = new B31(this, 0);
                    this.runOnUiThread((Runnable)object);
                    break;
                }
                case -4084754: {
                    object3 = "external_link";
                    boolean bl7 = ((String)object).equals(object3);
                    if (!bl7 || (bl7 = ((HaptikSDK)(object = HaptikSDK.INSTANCE)).isHandleLink$sdk_release())) break;
                    object = object2.getString("link");
                    object = Uri.parse((String)object);
                    object3 = "android.intent.action.VIEW";
                    object2 = new Intent((String)object3, (Uri)object);
                    this.startActivity((Intent)object2);
                    break;
                }
                case -1047941232: {
                    object2 = "language_update";
                    boolean bl8 = ((String)object).equals(object2);
                    if (!bl8 || !bl2) break;
                    object = yl0.a;
                    if (object != null) {
                        object = object.edit();
                        object2 = "language_sync_pending";
                        object.putBoolean((String)object2, false);
                        object.apply();
                        break;
                    }
                    Intrinsics.throwUninitializedPropertyAccessException(string3);
                    throw null;
                }
                case -1143892268: {
                    object2 = "push_token_update";
                    boolean bl9 = ((String)object).equals(object2);
                    if (!bl9 || !bl2) break;
                    object = yl0.a;
                    if (object != null) {
                        object = object.edit();
                        object.putBoolean(string2, false);
                        object.apply();
                        break;
                    }
                    Intrinsics.throwUninitializedPropertyAccessException(string3);
                    throw null;
                }
            }
        }
    }

    public final PermissionRequest p2() {
        PermissionRequest permissionRequest = this.r0;
        if (permissionRequest != null) {
            return permissionRequest;
        }
        Intrinsics.throwUninitializedPropertyAccessException("permissionRequest");
        throw null;
    }

    public final void sendSdkEvent(String string2) {
        Intrinsics.checkNotNullParameter(string2, "data");
        HaptikSDK.INSTANCE.sendSdkEvent$sdk_release(string2);
    }
}

