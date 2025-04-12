/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Handler
 *  android.os.Looper
 *  android.text.TextUtils
 *  android.webkit.WebView
 *  org.json.JSONObject
 */
package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.webkit.WebView;
import com.google.android.gms.internal.ads.zzfog;
import com.google.android.gms.internal.ads.zzfpk;
import org.json.JSONObject;

public final class zzfpl {
    private static final zzfpl zza;

    static {
        zzfpl zzfpl2;
        zza = zzfpl2 = new zzfpl();
    }

    private zzfpl() {
    }

    public static final zzfpl zza() {
        return zza;
    }

    public static final boolean zzj(WebView webView, String string2) {
        boolean bl2;
        if (webView != null && !(bl2 = TextUtils.isEmpty((CharSequence)string2))) {
            bl2 = false;
            String string3 = null;
            try {
                webView.evaluateJavascript(string2, null);
            }
            catch (IllegalStateException illegalStateException) {
                string2 = String.valueOf(string2);
                string3 = "javascript: ";
                string2 = string3.concat(string2);
                webView.loadUrl(string2);
            }
            return true;
        }
        return false;
    }

    public final void zzb(WebView webView, String string2, Object ... handler) {
        if (webView != null) {
            Object object = new StringBuilder(128);
            ((StringBuilder)object).append("if(window.omidBridge!==undefined){omidBridge.");
            ((StringBuilder)object).append(string2);
            string2 = "(";
            ((StringBuilder)object).append(string2);
            int n3 = ((Handler)handler).length;
            Looper looper = null;
            for (int i3 = 0; i3 < n3; ++i3) {
                Object object2 = handler[i3];
                if (object2 == null) {
                    object2 = "null";
                    ((StringBuilder)object).append((String)object2);
                } else {
                    char c2 = object2 instanceof String;
                    if (c2 != '\u0000') {
                        String string3;
                        c2 = ((String)(object2 = object2.toString())).startsWith(string3 = "{");
                        if (c2 != '\u0000') {
                            ((StringBuilder)object).append((String)object2);
                        } else {
                            c2 = '\"';
                            ((StringBuilder)object).append(c2);
                            ((StringBuilder)object).append((String)object2);
                            ((StringBuilder)object).append(c2);
                        }
                    } else {
                        ((StringBuilder)object).append(object2);
                    }
                }
                object2 = ",";
                ((StringBuilder)object).append((String)object2);
            }
            n3 = ((StringBuilder)object).length() + -1;
            ((StringBuilder)object).setLength(n3);
            ((StringBuilder)object).append(")}");
            string2 = ((StringBuilder)object).toString();
            handler = webView.getHandler();
            if (handler != null && (object = Looper.myLooper()) != (looper = handler.getLooper())) {
                object = new zzfpk(this, webView, string2);
                handler.post((Runnable)object);
                return;
            }
            zzfpl.zzj(webView, string2);
            return;
        }
        zzfog.zza.getClass();
    }

    public final void zzc(WebView webView, String string2) {
        Object[] objectArray = new Object[]{string2};
        this.zzb(webView, "finishSession", objectArray);
    }

    public final void zzd(WebView webView, String string2, JSONObject jSONObject) {
        Object[] objectArray = new Object[]{jSONObject, string2};
        this.zzb(webView, "init", objectArray);
    }

    public final void zze(WebView webView, String string2, float f5) {
        Float f6 = Float.valueOf(f5);
        Object[] objectArray = new Object[]{f6, string2};
        this.zzb(webView, "setDeviceVolume", objectArray);
    }

    public final void zzf(WebView webView, JSONObject jSONObject) {
        Object[] objectArray = new Object[]{jSONObject};
        this.zzb(webView, "setLastActivity", objectArray);
    }

    public final void zzg(WebView webView, String string2, String string3) {
        Object[] objectArray = new Object[]{string3, string2};
        this.zzb(webView, "setNativeViewHierarchy", objectArray);
    }

    public final void zzh(WebView webView, String string2, String string3) {
        Object[] objectArray = new Object[]{string3, string2};
        this.zzb(webView, "setState", objectArray);
    }

    public final void zzi(WebView webView, String string2, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        Object[] objectArray = new Object[]{string2, jSONObject, jSONObject2, jSONObject3};
        this.zzb(webView, "startSession", objectArray);
    }
}

