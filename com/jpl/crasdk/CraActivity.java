/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.Configuration
 *  android.os.Bundle
 *  android.webkit.CookieManager
 *  android.webkit.WebChromeClient
 *  android.webkit.WebSettings$PluginState
 *  android.webkit.WebView
 *  android.webkit.WebViewClient
 */
package com.jpl.crasdk;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.webkit.CookieManager;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.appcompat.app.AppCompatActivity;
import com.jpl.crasdk.CraActivity$a;
import com.jpl.crasdk.R$id;
import com.jpl.crasdk.R$layout;
import com.jpl.crasdk.a;
import com.jpl.crasdk.a$a;
import kotlin.jvm.internal.Intrinsics;

public final class CraActivity
extends AppCompatActivity
implements wh_2 {
    public static final /* synthetic */ int k0;
    public ah_1 X;
    public WebView Y;
    public boolean Z;

    public CraActivity() {
        G3 g3;
        CraActivity$a craActivity$a = new CraActivity$a(this);
        Intrinsics.checkNotNullExpressionValue(this.registerForActivityResult(g3, craActivity$a), "registerForActivityResul\u2026        }\n        }\n    }");
    }

    public final void attachBaseContext(Context context) {
        Intrinsics.checkNotNullParameter(context, "newBase");
        Object object = context.getResources();
        object = object != null ? object.getConfiguration() : null;
        Configuration configuration = new Configuration((Configuration)object);
        configuration.fontScale = 1.0f;
        this.applyOverrideConfiguration(configuration);
        super.attachBaseContext(context);
    }

    public final void init() {
        int n3 = R$id.webview;
        Object object = this.findViewById(n3);
        Intrinsics.checkNotNull(object, "null cannot be cast to non-null type android.webkit.WebView");
        object = (WebView)object;
        this.Y = object;
        object = new Object();
        this.X = object;
        Intrinsics.checkNotNull(object);
        Object object2 = this.Y;
        Intrinsics.checkNotNull(object2);
        Object object3 = "mActivity";
        Intrinsics.checkNotNullParameter(this, (String)object3);
        ((ah_1)object).a = this;
        ((ah_1)object).b = object2;
        n3 = 0;
        object = null;
        WebView.setWebContentsDebuggingEnabled((boolean)false);
        object2 = this.Y;
        if (object2 != null) {
            int n4;
            object3 = this.X;
            Intrinsics.checkNotNull(object3);
            Object object4 = "android";
            object2.addJavascriptInterface(object3, (String)object4);
            object2 = this.Y;
            if (object2 != null) {
                object2.clearCache(false);
            }
            object2 = CookieManager.getInstance();
            object3 = this.Y;
            boolean bl2 = true;
            object2.setAcceptThirdPartyCookies((WebView)object3, bl2);
            object2 = this.Y;
            object3 = null;
            if (object2 != null) {
                object2 = object2.getSettings();
            } else {
                n4 = 0;
                object2 = null;
            }
            Object object5 = CookieManager.getInstance();
            object5.setAcceptCookie(bl2);
            WebView webView = this.Y;
            object5.setAcceptThirdPartyCookies(webView, bl2);
            if (object2 != null) {
                object2.setMixedContentMode(0);
            }
            if (object2 != null) {
                object2.setJavaScriptEnabled(bl2);
            }
            if (object2 != null) {
                object2.setUseWideViewPort(bl2);
            }
            if (object2 != null) {
                object2.setLoadWithOverviewMode(bl2);
            }
            if (object2 != null) {
                object2.setBuiltInZoomControls(false);
            }
            if (object2 != null) {
                object2.setDomStorageEnabled(bl2);
            }
            if (object2 != null) {
                object2.setAllowFileAccess(bl2);
            }
            if (object2 != null) {
                object = WebSettings.PluginState.ON;
                object2.setPluginState((WebSettings.PluginState)object);
            }
            if (object2 != null) {
                object = WebSettings.PluginState.ON_DEMAND;
                object2.setPluginState((WebSettings.PluginState)object);
            }
            if (object2 != null) {
                object2.setJavaScriptCanOpenWindowsAutomatically(bl2);
            }
            if (object2 != null) {
                object2.setGeolocationEnabled(bl2);
            }
            n3 = -1;
            if (object2 != null) {
                object2.setCacheMode(n3);
            }
            object2 = this.Y;
            if (object2 != null) {
                object2 = object2.getSettings();
            } else {
                n4 = 0;
                object2 = null;
            }
            if (object2 != null) {
                object2.setCacheMode(n3);
            }
            object = this.Y;
            if (object != null) {
                object2 = new WebChromeClient();
                object.setWebChromeClient((WebChromeClient)object2);
            }
            object = this.Y;
            if (object != null) {
                object2 = new od0_2(this);
                object.setWebViewClient((WebViewClient)object2);
            }
            object = a$a.a().a;
            if (object != null) {
                object = ((yh_2)object).f;
            } else {
                n3 = 0;
                object = null;
            }
            object2 = "prod";
            n4 = Intrinsics.areEqual(object, object2);
            object4 = "";
            if (n4 != 0) {
                object = new StringBuilder();
                object2 = a$a.a().a;
                if (object2 != null) {
                    object2 = ((yh_2)object2).e;
                } else {
                    n4 = 0;
                    object2 = null;
                }
                object5 = vh_2.LOGIN;
                object2 = object2 == object5 ? "https://account.relianceretail.com/sign-up/?client_id=" : "https://account.relianceretail.com/profile/?client_id=";
                ((StringBuilder)object).append((String)object2);
                object2 = a$a.a().a;
                if (object2 != null) {
                    object2 = ((yh_2)object2).a;
                } else {
                    n4 = 0;
                    object2 = null;
                }
                ((StringBuilder)object).append((String)object2);
                object = ((StringBuilder)object).toString();
            } else {
                object2 = "uat";
                n4 = Intrinsics.areEqual(object, object2);
                if (n4 != 0) {
                    object = new StringBuilder();
                    object2 = a$a.a().a;
                    if (object2 != null) {
                        object2 = ((yh_2)object2).e;
                    } else {
                        n4 = 0;
                        object2 = null;
                    }
                    object5 = vh_2.LOGIN;
                    object2 = object2 == object5 ? "https://sit.account.relianceretail.com/sign-up/?client_id=" : "https://sit.account.relianceretail.com/profile/?client_id=";
                    ((StringBuilder)object).append((String)object2);
                    object2 = a$a.a().a;
                    if (object2 != null) {
                        object2 = ((yh_2)object2).a;
                    } else {
                        n4 = 0;
                        object2 = null;
                    }
                    ((StringBuilder)object).append((String)object2);
                    object = ((StringBuilder)object).toString();
                } else {
                    object2 = "sit";
                    n3 = (int)(Intrinsics.areEqual(object, object2) ? 1 : 0);
                    if (n3 != 0) {
                        object = new StringBuilder();
                        object2 = a$a.a().a;
                        if (object2 != null) {
                            object2 = ((yh_2)object2).e;
                        } else {
                            n4 = 0;
                            object2 = null;
                        }
                        object5 = vh_2.LOGIN;
                        object2 = object2 == object5 ? "https://account.cctz0.de/sign-up/?client_id=" : "https://account.cctz0.de/profile/?client_id=";
                        ((StringBuilder)object).append((String)object2);
                        object2 = a$a.a().a;
                        if (object2 != null) {
                            object2 = ((yh_2)object2).a;
                        } else {
                            n4 = 0;
                            object2 = null;
                        }
                        ((StringBuilder)object).append((String)object2);
                        object = ((StringBuilder)object).toString();
                    } else {
                        object = object4;
                    }
                }
            }
            object = nn_2.a((String)object, "&source=");
            object2 = a$a.a().a;
            if (object2 != null) {
                object2 = ((yh_2)object2).c;
            } else {
                n4 = 0;
                object2 = null;
            }
            ((StringBuilder)object).append((String)object2);
            object2 = a$a.a().a;
            if (object2 != null) {
                object2 = ((yh_2)object2).b;
            } else {
                n4 = 0;
                object2 = null;
            }
            if (object2 != null && (n4 = ((String)object2).length()) != 0) {
                object2 = new StringBuilder("&microAppID=");
                object5 = a$a.a().a;
                object5 = object5 != null ? object5.b : null;
                ((StringBuilder)object2).append((String)object5);
                object2 = ((StringBuilder)object2).toString();
            } else {
                object2 = object4;
            }
            ((StringBuilder)object).append((String)object2);
            object2 = a$a.a().a;
            if (object2 != null) {
                object2 = ((yh_2)object2).d;
            } else {
                n4 = 0;
                object2 = null;
            }
            if (object2 != null && (n4 = ((String)object2).length()) != 0) {
                object2 = new StringBuilder("&return_ui_url=");
                object5 = a$a.a().a;
                object5 = object5 != null ? object5.d : null;
                ((StringBuilder)object2).append((String)object5);
                object2 = ((StringBuilder)object2).toString();
            } else {
                object2 = object4;
            }
            ((StringBuilder)object).append((String)object2);
            object2 = a$a.a().a;
            if (object2 != null) {
                object2 = ((yh_2)object2).g;
            } else {
                n4 = 0;
                object2 = null;
            }
            if (object2 != null && (n4 = ((String)object2).length()) != 0) {
                object2 = new StringBuilder("&");
                object4 = a$a.a().a;
                if (object4 != null) {
                    object3 = ((yh_2)object4).g;
                }
                ((StringBuilder)object2).append((String)object3);
                object4 = ((StringBuilder)object2).toString();
            }
            ((StringBuilder)object).append((String)object4);
            object = ((StringBuilder)object).toString();
            object2 = new StringBuilder("onpage before start=");
            ((StringBuilder)object2).append((String)object);
            object2 = ((StringBuilder)object2).toString();
            object4 = "TAG";
            Intrinsics.checkNotNullParameter(object4, "tag");
            object3 = "msg";
            Intrinsics.checkNotNullParameter(object2, (String)object3);
            object2 = this.Y;
            if (object2 != null) {
                object2.loadUrl((String)object);
            }
        }
    }

    public final void j1() {
        Object object = xh_1.a;
        if (object != null) {
            xh_1.a = null;
        }
        if ((object = JI3.a) != null) {
            JI3.a = null;
        }
        if ((object = a.c) != null) {
            ((a)object).a = null;
        }
        a.c = null;
        this.finish();
    }

    public final void onBackPressed() {
        boolean bl2 = this.isFinishing();
        if (!bl2) {
            bl2 = this.Z;
            if (!bl2) {
                zh_2 zh_22 = JI3.a;
                if (zh_22 != null) {
                    Object object = a.c;
                    if (object == null) {
                        String string2;
                        object = new Object();
                        ((a)object).b = string2 = "";
                        a.c = object;
                    }
                    object = a.c;
                    Intrinsics.checkNotNull(object);
                    object = ((a)object).a;
                    boolean bl3 = true;
                    zh_22.A1(bl3);
                }
            } else {
                WebView webView = this.Y;
                if (webView != null) {
                    int n3 = 1;
                    fw_0 fw_02 = new fw_0(this, n3);
                    webView.post((Runnable)fw_02);
                }
            }
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        int n3 = R$layout.layout_cra_activity;
        this.setContentView(n3);
        if (bundle != null) {
            return;
        }
        xh_1.a = this;
        this.init();
    }

    public final void onResume() {
        super.onResume();
        Object object = a.c;
        if (object == null) {
            String string2;
            object = new Object();
            ((a)object).b = string2 = "";
            a.c = object;
        }
        object = a.c;
        Intrinsics.checkNotNull(object);
        object = ((a)object).a;
    }

    public final void x0(String string2) {
        WebView webView;
        boolean bl2 = this.isFinishing();
        if (!bl2 && (webView = this.Y) != null) {
            kd0_2 kd0_22 = new kd0_2(this, string2);
            webView.post((Runnable)kd0_22);
        }
    }
}

