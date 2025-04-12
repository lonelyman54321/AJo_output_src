/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.content.Intent
 *  android.content.res.Configuration
 *  android.content.res.Resources
 *  android.net.Uri
 *  android.os.Bundle
 *  android.text.TextUtils
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.View$OnFocusChangeListener
 *  android.webkit.WebChromeClient
 *  android.webkit.WebSettings$PluginState
 *  android.webkit.WebView
 *  android.webkit.WebViewClient
 *  android.widget.ImageView
 *  android.widget.ProgressBar
 *  org.json.JSONObject
 */
package com.jio.jioads.webviewhandler;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageView;
import android.widget.ProgressBar;
import com.jio.jioads.R$layout;
import com.jio.jioads.adinterfaces.JioAdView$AD_TYPE;
import com.jio.jioads.adinterfaces.JioAdView$ORIENTATION_TYPE;
import com.jio.jioads.adinterfaces.JioAds;
import com.jio.jioads.adinterfaces.JioAds$LogLevel;
import com.jio.jioads.adinterfaces.l_0;
import com.jio.jioads.util.Utility;
import com.jio.jioads.util.j;
import com.jio.jioads.webviewhandler.a;
import com.jio.jioads.webviewhandler.c;
import com.jio.jioads.webviewhandler.d;
import com.jio.jioads.webviewhandler.e;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONObject;

public final class InAppWebView
extends Activity
implements View.OnClickListener {
    public static final /* synthetic */ int k;
    public ImageView a;
    public ImageView b;
    public ProgressBar c;
    public WebView d;
    public InAppWebView e;
    public String f;
    public String g;
    public String h;
    public boolean i;
    public final JSONObject j;

    public InAppWebView() {
        JSONObject jSONObject;
        this.j = jSONObject = new JSONObject();
    }

    public final void a() {
        int n3;
        Object object = Utility.INSTANCE;
        InAppWebView inAppWebView = this.e;
        InAppWebView inAppWebView2 = null;
        String string2 = "mContext";
        if (inAppWebView == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string2);
            n3 = 0;
            inAppWebView = null;
        }
        n3 = ((Utility)object).getCurrentUIModeType((Context)inAppWebView);
        int n4 = 1;
        String string3 = "dt";
        JSONObject jSONObject = this.j;
        if (n3 != n4) {
            int n7 = 4;
            if (n3 != n7) {
                object = String.valueOf(n3);
                jSONObject.put(string3, object);
            } else {
                object = "4";
                jSONObject.put(string3, object);
            }
        } else {
            inAppWebView = this.e;
            if (inAppWebView == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string2);
            } else {
                inAppWebView2 = inAppWebView;
            }
            boolean bl2 = ((Utility)object).isDeviceTypeTablet((Context)inAppWebView2);
            if (bl2) {
                object = "2";
                jSONObject.put(string3, object);
            } else {
                object = "1";
                jSONObject.put(string3, object);
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void b(String object) {
        Exception exception2;
        Object object2;
        Object object3;
        block14: {
            CharSequence charSequence;
            Object object4;
            String string2;
            int n3;
            int n4;
            boolean bl2;
            Object object5;
            CharSequence charSequence2;
            String string3;
            block12: {
                block13: {
                    object3 = "this as java.lang.String\u2026ing(startIndex, endIndex)";
                    object2 = "Inside isIntentAvailable true and uri is: ";
                    string3 = "Is brand page contains deeplink Url: ";
                    if (object == null) return;
                    try {
                        boolean bl3 = TextUtils.isEmpty((CharSequence)object);
                        if (bl3) return;
                        object = StringsKt.m0(object);
                        object = object.toString();
                        charSequence2 = new StringBuilder();
                        object5 = this.g;
                        charSequence2.append((String)object5);
                        object5 = ": Brand page click URL: ";
                        charSequence2.append((String)object5);
                        charSequence2.append((String)object);
                        charSequence2 = charSequence2.toString();
                        com.jio.jioads.util.j.a((String)charSequence2);
                        charSequence2 = Uri.parse((String)object);
                        object5 = charSequence2.getScheme();
                        String string4 = "intent";
                        bl2 = Intrinsics.areEqual(string4, object5);
                        n4 = 0x10000000;
                        n3 = 1;
                        string2 = "mContext";
                        object4 = null;
                        if (!bl2) break block12;
                        object = charSequence2.toString();
                        object = Intent.parseUri((String)object, (int)n3);
                        object3 = "parseUri(...)";
                        Intrinsics.checkNotNullExpressionValue(object, (String)object3);
                        object.setFlags(n4);
                        object3 = Utility.INSTANCE;
                        object2 = this.e;
                        if (object2 != null) break block13;
                        Intrinsics.throwUninitializedPropertyAccessException(string2);
                        object2 = null;
                    }
                    catch (Exception exception2) {
                        break block14;
                    }
                }
                boolean bl4 = ((Utility)object3).canHandleIntent((Context)object2, (Intent)object);
                object2 = new StringBuilder(string3);
                ((StringBuilder)object2).append(bl4);
                object2 = ((StringBuilder)object2).toString();
                com.jio.jioads.util.j.c((String)object2);
                if (!bl4) {
                    object3 = "Attempting InAppWebview fallback url";
                    com.jio.jioads.util.j.a((String)object3);
                    object3 = "browser_fallback_url";
                    object = object.getStringExtra((String)object3);
                    this.b((String)object);
                    return;
                }
                object3 = this.e;
                if (object3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(string2);
                } else {
                    object4 = object3;
                }
                object4.startActivity((Intent)object);
                return;
            }
            string3 = "S.browser_fallback_url";
            bl2 = false;
            object5 = null;
            int n7 = StringsKt.F(object, string3, false);
            String string5 = "";
            if (n7 != 0) {
                string3 = "S.browser_fallback_url=";
                int n8 = 6;
                n7 = StringsKt.O(object, string3, 0, false, n8) + 23;
                String string6 = ";end";
                int n10 = StringsKt.R(object, string6, 0, n8);
                string3 = object.substring(n7, n10);
                Intrinsics.checkNotNullExpressionValue(string3, (String)object3);
                string6 = ";S.browser_fallback_url";
                n8 = StringsKt.O(object, string6, 0, false, n8);
                object5 = object.substring(0, n8);
                Intrinsics.checkNotNullExpressionValue(object5, (String)object3);
                object3 = new StringBuilder();
                charSequence = this.g;
                ((StringBuilder)object3).append((String)charSequence);
                charSequence = ": fallbackUrl";
                ((StringBuilder)object3).append((String)charSequence);
                charSequence = StringsKt.m0(string3);
                charSequence = charSequence.toString();
                ((StringBuilder)object3).append((String)charSequence);
                charSequence = " deepLinkUrl:";
                ((StringBuilder)object3).append((String)charSequence);
                charSequence = StringsKt.m0(object5);
                charSequence = charSequence.toString();
                ((StringBuilder)object3).append((String)charSequence);
                object3 = ((StringBuilder)object3).toString();
                com.jio.jioads.util.j.a((String)object3);
            } else {
                string3 = string5;
                object5 = string5;
            }
            boolean bl5 = Intrinsics.areEqual(object5, string5);
            if (!bl5) {
                object = object5;
            }
            object3 = Utility.INSTANCE;
            object5 = this.e;
            if (object5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string2);
                bl2 = false;
                object5 = null;
            }
            string5 = charSequence2.toString();
            charSequence = "toString(...)";
            Intrinsics.checkNotNullExpressionValue(string5, (String)charSequence);
            bl5 = ((Utility)object3).isIntentActivityPresent((Context)object5, string5);
            if (!bl5) {
                boolean bl6 = this.i;
                if (bl6) return;
                object = "inside isFallbackUrlAttempted case";
                com.jio.jioads.util.j.a(object);
                this.b(string3);
                this.i = n3;
                return;
            }
            object3 = new StringBuilder((String)object2);
            ((StringBuilder)object3).append((Object)charSequence2);
            object3 = ((StringBuilder)object3).toString();
            com.jio.jioads.util.j.a((String)object3);
            object2 = "android.intent.action.VIEW";
            object3 = new Intent((String)object2);
            this.setIntent((Intent)object3);
            object3 = this.getIntent();
            object = Uri.parse((String)object);
            object3.setData((Uri)object);
            object = this.getIntent();
            object.setFlags(n4);
            object = this.e;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string2);
            } else {
                object4 = object;
            }
            object = this.getIntent();
            object4.startActivity((Intent)object);
            return;
        }
        object2 = "Exception while brand page click so trying fallback Url.Ex: ";
        object3 = new StringBuilder((String)object2);
        ((StringBuilder)object3).append(exception2);
        Object object6 = ((StringBuilder)object3).toString();
        object3 = "message";
        Intrinsics.checkNotNullParameter(object6, (String)object3);
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        object6 = JioAds$LogLevel.NONE;
    }

    public final void c() {
        int n3;
        Object object = Resources.getSystem().getDisplayMetrics();
        int n4 = object.widthPixels;
        int n7 = object.heightPixels;
        InAppWebView inAppWebView = this.e;
        if (inAppWebView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mContext");
            n3 = 0;
            inAppWebView = null;
        }
        inAppWebView = inAppWebView.getResources().getConfiguration();
        n3 = ((Configuration)inAppWebView).orientation;
        int n8 = 1;
        String string2 = "sh";
        String string3 = "sw";
        JSONObject jSONObject = this.j;
        if (n3 != n8) {
            n8 = 2;
            if (n3 != n8) {
                String string4 = String.valueOf(n4);
                jSONObject.put(string3, (Object)string4);
                object = String.valueOf(n7);
                jSONObject.put(string2, object);
            } else {
                object = String.valueOf(n7);
                jSONObject.put(string3, object);
                object = String.valueOf(n4);
                jSONObject.put(string2, object);
            }
        } else {
            String string5 = String.valueOf(n4);
            jSONObject.put(string3, (Object)string5);
            object = String.valueOf(n7);
            jSONObject.put(string2, object);
        }
    }

    public void onClick(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        int n3 = view.getId();
        Resources resources = this.getResources();
        String string2 = this.getPackageName();
        String string3 = "close_button";
        String string4 = "id";
        int n4 = resources.getIdentifier(string3, string4, string2);
        if (n3 == n4) {
            this.finish();
        }
    }

    public final void onConfigurationChanged(Configuration configuration) {
        Intrinsics.checkNotNullParameter(configuration, "newConfig");
        super.onConfigurationChanged(configuration);
    }

    public final void onCreate(Bundle object) {
        int n3;
        int n4 = 1;
        this.requestWindowFeature(n4);
        super.onCreate((Bundle)object);
        this.e = this;
        object = this.getWindow();
        int n7 = 1024;
        object.setFlags(n7, n7);
        object = Utility.INSTANCE;
        Object object2 = this.e;
        int n8 = 0;
        Object object3 = null;
        String string2 = "mContext";
        if (object2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string2);
            n7 = 0;
            object2 = null;
        }
        if ((n7 = ((Utility)object).getCurrentUIModeType((Context)object2)) == (n3 = 4)) {
            n7 = R$layout.jio_inapp_stb_webview;
            this.setContentView(n7);
        } else {
            n7 = R$layout.jio_inapp_webview;
            this.setContentView(n7);
        }
        object2 = this.getResources();
        String string3 = this.getPackageName();
        String string4 = "webview";
        String string5 = "id";
        n7 = object2.getIdentifier(string4, string5, string3);
        object2 = this.findViewById(n7);
        string3 = "null cannot be cast to non-null type android.webkit.WebView";
        Intrinsics.checkNotNull(object2, string3);
        object2 = (WebView)object2;
        this.d = object2;
        if (object2 != null) {
            Intrinsics.checkNotNull(object2);
            object2.getSettings().setJavaScriptEnabled(n4 != 0);
            object2 = this.d;
            Intrinsics.checkNotNull(object2);
            object2.getSettings().setUseWideViewPort(n4 != 0);
            object2 = this.d;
            Intrinsics.checkNotNull(object2);
            object2.getSettings().setLoadWithOverviewMode(n4 != 0);
            object2 = this.d;
            Intrinsics.checkNotNull(object2);
            object2 = object2.getSettings();
            string3 = null;
            object2.setBuiltInZoomControls(false);
            object2 = this.d;
            Intrinsics.checkNotNull(object2);
            object2.getSettings().setGeolocationEnabled(n4 != 0);
            object2 = this.d;
            Intrinsics.checkNotNull(object2);
            object2.getSettings().setDomStorageEnabled(n4 != 0);
            object2 = this.d;
            Intrinsics.checkNotNull(object2);
            object2.getSettings().setAllowFileAccess(n4 != 0);
            object2 = this.d;
            Intrinsics.checkNotNull(object2);
            object2.getSettings().setAllowContentAccess(n4 != 0);
            object2 = this.d;
            Intrinsics.checkNotNull(object2);
            object2 = object2.getSettings();
            string4 = WebSettings.PluginState.ON;
            object2.setPluginState((WebSettings.PluginState)string4);
            object2 = this.d;
            Intrinsics.checkNotNull(object2);
            object2 = object2.getSettings();
            string4 = WebSettings.PluginState.ON_DEMAND;
            object2.setPluginState((WebSettings.PluginState)string4);
            object2 = this.d;
            Intrinsics.checkNotNull(object2);
            object2 = object2.getSettings();
            int n10 = 2;
            object2.setCacheMode(n10);
            object2 = this.d;
            Intrinsics.checkNotNull(object2);
            object2.getSettings().setJavaScriptCanOpenWindowsAutomatically(n4 != 0);
            object2 = new c(this);
            string4 = this.d;
            Intrinsics.checkNotNull(string4);
            string4.addJavascriptInterface(object2, "JSInterface");
            object2 = this.getResources();
            string4 = this.getPackageName();
            String string6 = "close_button";
            n7 = object2.getIdentifier(string6, string5, string4);
            object2 = this.findViewById(n7);
            string4 = "null cannot be cast to non-null type android.widget.ImageView";
            Intrinsics.checkNotNull(object2, string4);
            object2 = (ImageView)object2;
            this.a = object2;
            object2 = this.e;
            if (object2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string2);
            } else {
                object3 = object2;
            }
            int n14 = ((Utility)object).getCurrentUIModeType((Context)object3);
            if (n14 == n3) {
                object = this.getResources();
                object2 = this.getPackageName();
                object3 = "close_button_focused";
                n14 = object.getIdentifier((String)object3, string5, (String)object2);
                object = this.findViewById(n14);
                Intrinsics.checkNotNull(object, string4);
                object = (ImageView)object;
                this.b = object;
            }
            object = this.getResources();
            object2 = this.getPackageName();
            object3 = "progressbar";
            n14 = object.getIdentifier((String)object3, string5, (String)object2);
            object = this.findViewById(n14);
            Intrinsics.checkNotNull(object, "null cannot be cast to non-null type android.widget.ProgressBar");
            object = (ProgressBar)object;
            this.c = object;
            object = this.d;
            Intrinsics.checkNotNull(object);
            object2 = new d(this);
            object.setWebChromeClient((WebChromeClient)object2);
            object = this.d;
            Intrinsics.checkNotNull(object);
            object2 = new e(this);
            object.setWebViewClient((WebViewClient)object2);
            object = this.getIntent().getExtras();
            if (object != null) {
                object2 = object.getString("screen_orientation");
                l_0.h("InAppWebView orientation: ", (String)object2);
                JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                object3 = JioAds$LogLevel.NONE;
                n7 = object2 != null && (n8 = ((String)object2).equals(object3 = JioAdView$ORIENTATION_TYPE.LANDSCAPE)) == n4 ? 6 : (object2 != null && (n7 = (int)(((String)object2).equals(object3 = JioAdView$ORIENTATION_TYPE.PORTRAIT) ? 1 : 0)) == n4 ? 7 : -1);
                this.setRequestedOrientation(n7);
                object2 = object.getString("asi");
                this.g = object2;
                object.getString("Package_Name");
                object2 = object.getString("ccb");
                this.h = object2;
                object2 = object.getString("ifa");
                this.f = object2;
                object.getString("uid");
                object.getString("cid");
                object2 = "adType";
                object3 = object.get((String)object2);
                if (object3 != null) {
                    object2 = object.get((String)object2);
                    object3 = "null cannot be cast to non-null type com.jio.jioads.adinterfaces.JioAdView.AD_TYPE";
                    Intrinsics.checkNotNull(object2, (String)object3);
                    object2 = (JioAdView$AD_TYPE)((Object)object2);
                }
                object.getBoolean("isInterstitialVideo");
                object2 = "url";
                object = object.getString((String)object2);
                if (object != null && (object2 = this.d) != null) {
                    object2.loadUrl((String)object);
                }
            }
            if ((object = this.a) != null) {
                object.setVisibility(0);
            }
            object = this.a;
            if (object != null) {
                object.setFocusable(n4 != 0);
            }
            object = this.a;
            if (object != null) {
                a a2 = new a(this);
                object.setOnFocusChangeListener((View.OnFocusChangeListener)a2);
            }
            object = this.a;
            if (object != null) {
                object.setOnClickListener((View.OnClickListener)this);
            }
            if ((object = this.a) != null) {
                object.bringToFront();
            }
        }
    }

    public final void onDestroy() {
        WebView webView = this.d;
        if (webView != null) {
            String string2 = "JSInterface";
            webView.removeJavascriptInterface(string2);
        }
        super.onDestroy();
    }
}

