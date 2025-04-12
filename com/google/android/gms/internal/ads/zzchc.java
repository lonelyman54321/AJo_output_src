/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.content.DialogInterface$OnCancelListener
 *  android.content.DialogInterface$OnClickListener
 *  android.os.Message
 *  android.view.View
 *  android.view.WindowManager$BadTokenException
 *  android.webkit.ConsoleMessage
 *  android.webkit.ConsoleMessage$MessageLevel
 *  android.webkit.GeolocationPermissions$Callback
 *  android.webkit.JsPromptResult
 *  android.webkit.JsResult
 *  android.webkit.WebChromeClient
 *  android.webkit.WebChromeClient$CustomViewCallback
 *  android.webkit.WebStorage$QuotaUpdater
 *  android.webkit.WebView
 *  android.webkit.WebView$WebViewTransport
 *  android.webkit.WebViewClient
 *  android.widget.EditText
 *  android.widget.LinearLayout
 *  android.widget.TextView
 */
package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Message;
import android.view.View;
import android.view.WindowManager;
import android.webkit.ConsoleMessage;
import android.webkit.GeolocationPermissions;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.WebChromeClient;
import android.webkit.WebStorage;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.gms.ads.internal.overlay.zzm;
import com.google.android.gms.ads.internal.util.zzt;
import com.google.android.gms.ads.internal.zzb;
import com.google.android.gms.ads.internal.zzu;
import com.google.android.gms.internal.ads.zzcgv;
import com.google.android.gms.internal.ads.zzcgw;
import com.google.android.gms.internal.ads.zzcgx;
import com.google.android.gms.internal.ads.zzcgy;
import com.google.android.gms.internal.ads.zzcgz;
import com.google.android.gms.internal.ads.zzcha;
import com.google.android.gms.internal.ads.zzchb;
import com.google.android.gms.internal.ads.zzchd;

public final class zzchc
extends WebChromeClient {
    private final zzchd zza;

    public zzchc(zzchd zzchd2) {
        this.zza = zzchd2;
    }

    private static final Context zzb(WebView object) {
        boolean bl2 = object instanceof zzchd;
        if (!bl2) {
            return object.getContext();
        }
        Activity activity = (object = (zzchd)object).zzi();
        if (activity != null) {
            return activity;
        }
        return object.getContext();
    }

    public final void onCloseWindow(WebView object) {
        boolean bl2 = object instanceof zzchd;
        if (!bl2) {
            com.google.android.gms.ads.internal.util.client.zzm.zzj("Tried to close a WebView that wasn't an AdWebView.");
            return;
        }
        if ((object = ((zzchd)object).zzL()) == null) {
            com.google.android.gms.ads.internal.util.client.zzm.zzj("Tried to close an AdWebView not associated with an overlay.");
            return;
        }
        ((zzm)object).zzb();
    }

    public final boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        CharSequence charSequence = consoleMessage.message();
        Object object = consoleMessage.sourceId();
        int n3 = consoleMessage.lineNumber();
        String string2 = "JS: ";
        String string3 = " (";
        String string4 = ":";
        charSequence = og_1.a(string2, (String)charSequence, string3, (String)object, string4);
        boolean n4 = ((String)(charSequence = g30.a(n3, ")", (StringBuilder)charSequence))).contains((CharSequence)(object = "Application Cache"));
        if (n4) {
            return super.onConsoleMessage(consoleMessage);
        }
        object = zzchb.zza;
        ConsoleMessage.MessageLevel messageLevel = consoleMessage.messageLevel();
        n3 = messageLevel.ordinal();
        Object object2 = object[n3];
        if (object2 != (n3 = 1)) {
            n3 = 2;
            if (object2 != n3) {
                n3 = 3;
                if (object2 != n3 && object2 != (n3 = 4)) {
                    n3 = 5;
                    if (object2 != n3) {
                        com.google.android.gms.ads.internal.util.client.zzm.zzi((String)charSequence);
                    } else {
                        com.google.android.gms.ads.internal.util.client.zzm.zze((String)charSequence);
                    }
                } else {
                    com.google.android.gms.ads.internal.util.client.zzm.zzi((String)charSequence);
                }
            } else {
                com.google.android.gms.ads.internal.util.client.zzm.zzj((String)charSequence);
            }
        } else {
            com.google.android.gms.ads.internal.util.client.zzm.zzg((String)charSequence);
        }
        return super.onConsoleMessage(consoleMessage);
    }

    public final boolean onCreateWindow(WebView webView, boolean bl2, boolean bl3, Message message) {
        WebView.WebViewTransport webViewTransport = (WebView.WebViewTransport)message.obj;
        webView = webView.getContext();
        WebView webView2 = new WebView((Context)webView);
        webView = this.zza.zzH();
        if (webView != null) {
            webView = this.zza.zzH();
            webView2.setWebViewClient((WebViewClient)webView);
        }
        webViewTransport.setWebView(webView2);
        message.sendToTarget();
        return true;
    }

    public final void onExceededDatabaseQuota(String string2, String string3, long l2, long l3, long l4, WebStorage.QuotaUpdater quotaUpdater) {
        long l7 = 0x500000L - l4;
        long l8 = l7 - (l4 = 0L);
        Object object = l8 == 0L ? 0 : (l8 < 0L ? -1 : 1);
        if (object <= 0) {
            quotaUpdater.updateQuota(l2);
            return;
        }
        long l12 = 0x100000L;
        Object object2 = l2 == l4 ? 0 : (l2 < l4 ? -1 : 1);
        if (object2 == false) {
            long l14;
            Object object3 = l3 == l7 ? 0 : (l3 < l7 ? -1 : 1);
            if (object3 > 0 || (l14 = l3 == l12 ? 0 : (l3 < l12 ? -1 : 1)) > 0) {
                l3 = l4;
            }
        } else {
            object2 = l3 == l4 ? 0 : (l3 < l4 ? -1 : 1);
            if (object2 == false) {
                l7 = Math.min(131072L, l7) + l2;
                l3 = Math.min(l7, l12);
            } else {
                long l15 = l3 - (l7 = Math.min(l12 -= l2, l7));
                Object object4 = l15 == 0L ? 0 : (l15 < 0L ? -1 : 1);
                if (object4 <= 0) {
                    l2 += l3;
                }
                l3 = l2;
            }
        }
        quotaUpdater.updateQuota(l3);
    }

    /*
     * Unable to fully structure code
     */
    public final void onGeolocationPermissionsShowPrompt(String var1_1, GeolocationPermissions.Callback var2_2) {
        block2: {
            if (var2_2 == null) break block2;
            var3_3 = this.zza;
            zzu.zzp();
            var3_3 = var3_3.getContext();
            var4_4 = "android.permission.ACCESS_FINE_LOCATION";
            var5_5 = zzt.zzA((Context)var3_3, var4_4);
            var6_6 = true;
            if (var5_5) ** GOTO lbl-1000
            var3_3 = this.zza;
            zzu.zzp();
            var3_3 = var3_3.getContext();
            var7_7 = "android.permission.ACCESS_COARSE_LOCATION";
            var5_5 = zzt.zzA((Context)var3_3, var7_7);
            if (var5_5) lbl-1000:
            // 2 sources

            {
                var5_5 = true;
            } else {
                var5_5 = false;
                var3_3 = null;
            }
            var2_2.invoke(var1_1, var5_5, var6_6);
        }
    }

    public final void onHideCustomView() {
        zzm zzm2 = this.zza.zzL();
        if (zzm2 == null) {
            com.google.android.gms.ads.internal.util.client.zzm.zzj("Could not get ad overlay when hiding custom view.");
            return;
        }
        zzm2.zzg();
    }

    public final boolean onJsAlert(WebView webView, String string2, String string3, JsResult jsResult) {
        Context context = zzchc.zzb(webView);
        return this.zza(context, "alert", string2, string3, null, jsResult, null, false);
    }

    public final boolean onJsBeforeUnload(WebView webView, String string2, String string3, JsResult jsResult) {
        Context context = zzchc.zzb(webView);
        return this.zza(context, "onBeforeUnload", string2, string3, null, jsResult, null, false);
    }

    public final boolean onJsConfirm(WebView webView, String string2, String string3, JsResult jsResult) {
        Context context = zzchc.zzb(webView);
        return this.zza(context, "confirm", string2, string3, null, jsResult, null, false);
    }

    public final boolean onJsPrompt(WebView webView, String string2, String string3, String string4, JsPromptResult jsPromptResult) {
        Context context = zzchc.zzb(webView);
        return this.zza(context, "prompt", string2, string3, string4, null, jsPromptResult, true);
    }

    public final void onShowCustomView(View view, int n3, WebChromeClient.CustomViewCallback customViewCallback) {
        zzm zzm2 = this.zza.zzL();
        if (zzm2 == null) {
            com.google.android.gms.ads.internal.util.client.zzm.zzj("Could not get ad overlay when showing custom view.");
            customViewCallback.onCustomViewHidden();
            return;
        }
        zzm2.zzC(view, customViewCallback);
        zzm2.zzA(n3);
    }

    public final void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        this.onShowCustomView(view, -1, customViewCallback);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean zza(Context object, String object2, String string2, String string3, String string4, JsResult jsResult, JsPromptResult jsPromptResult, boolean bl2) {
        WindowManager.BadTokenException badTokenException2;
        int n3;
        block5: {
            block4: {
                String string5 = "window.";
                n3 = 1;
                try {
                    boolean bl3;
                    Object object3 = this.zza;
                    if (object3 == null || (object3 = object3.zzN()) == null) break block4;
                    object3 = this.zza;
                    object3 = object3.zzN();
                    if ((object3 = object3.zzd()) == null) break block4;
                    object3 = this.zza;
                    object3 = object3.zzN();
                    if ((object3 = object3.zzd()) != null && !(bl3 = ((zzb)object3).zzc())) {
                        object = new StringBuilder(string5);
                        ((StringBuilder)object).append((String)object2);
                        object2 = "('";
                        ((StringBuilder)object).append((String)object2);
                        ((StringBuilder)object).append(string3);
                        object2 = "')";
                        ((StringBuilder)object).append((String)object2);
                        object = ((StringBuilder)object).toString();
                        ((zzb)object3).zzb((String)object);
                        return false;
                    }
                }
                catch (WindowManager.BadTokenException badTokenException2) {
                    break block5;
                }
            }
            zzu.zzp();
            object2 = zzt.zzK((Context)object);
            object2.setTitle((CharSequence)string2);
            int n4 = 0x1040000;
            int n7 = 17039370;
            if (bl2) {
                jsResult = new LinearLayout((Context)object);
                jsResult.setOrientation(n3);
                TextView textView = new TextView((Context)object);
                textView.setText((CharSequence)string3);
                string3 = new EditText((Context)object);
                string3.setText((CharSequence)string4);
                jsResult.addView((View)textView);
                jsResult.addView((View)string3);
                object = object2.setView((View)jsResult);
                object2 = new zzcha(jsPromptResult, (EditText)string3);
                object = object.setPositiveButton(n7, (DialogInterface.OnClickListener)object2);
                object2 = new zzcgz(jsPromptResult);
                object = object.setNegativeButton(n4, (DialogInterface.OnClickListener)object2);
                object2 = new zzcgy(jsPromptResult);
                object = object.setOnCancelListener((DialogInterface.OnCancelListener)object2);
                object = object.create();
                object.show();
                return n3 != 0;
            }
            object = object2.setMessage((CharSequence)string3);
            object2 = new zzcgx(jsResult);
            object = object.setPositiveButton(n7, (DialogInterface.OnClickListener)object2);
            object2 = new zzcgw(jsResult);
            object = object.setNegativeButton(n4, (DialogInterface.OnClickListener)object2);
            object2 = new zzcgv(jsResult);
            object = object.setOnCancelListener((DialogInterface.OnCancelListener)object2);
            object = object.create();
            object.show();
            return n3 != 0;
        }
        object2 = "Fail to display Dialog.";
        com.google.android.gms.ads.internal.util.client.zzm.zzk((String)object2, badTokenException2);
        return n3 != 0;
    }
}

