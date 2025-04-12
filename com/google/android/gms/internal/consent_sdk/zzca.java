/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Application
 *  android.content.ActivityNotFoundException
 *  android.content.Intent
 *  android.content.pm.ApplicationInfo
 *  android.graphics.Bitmap
 *  android.graphics.Bitmap$CompressFormat
 *  android.graphics.Bitmap$Config
 *  android.graphics.Canvas
 *  android.net.Uri
 *  android.os.Handler
 *  android.text.TextUtils
 *  android.util.Base64
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package com.google.android.gms.internal.consent_sdk;

import android.app.Application;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.net.Uri;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Base64;
import com.google.android.gms.internal.consent_sdk.zzan;
import com.google.android.gms.internal.consent_sdk.zzap;
import com.google.android.gms.internal.consent_sdk.zzbb;
import com.google.android.gms.internal.consent_sdk.zzbw;
import com.google.android.gms.internal.consent_sdk.zzby;
import com.google.android.gms.internal.consent_sdk.zzbz;
import com.google.android.gms.internal.consent_sdk.zzd;
import com.google.android.gms.internal.consent_sdk.zze;
import com.google.android.gms.internal.consent_sdk.zzg;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.util.Objects;
import java.util.concurrent.Executor;
import org.json.JSONException;
import org.json.JSONObject;

final class zzca
implements zzd {
    private final Application zza;
    private final zzbw zzb;
    private final Handler zzc;
    private final Executor zzd;
    private final zze zze;
    private final zzan zzf;
    private final zzbb zzg;
    private final zzap zzh;

    public zzca(Application application, zzbw zzbw2, Handler handler, Executor executor, zze zze2, zzan zzan2, zzbb zzbb2, zzap zzap2) {
        this.zza = application;
        this.zzb = zzbw2;
        this.zzc = handler;
        this.zzd = executor;
        this.zze = zze2;
        this.zzf = zzan2;
        this.zzg = zzbb2;
        this.zzh = zzap2;
    }

    private final void zzg(JSONObject object) {
        String string2;
        object = object.optString("url");
        TextUtils.isEmpty((CharSequence)object);
        Object object2 = Uri.parse((String)object);
        String string3 = object2.getScheme();
        if (string3 == null) {
            string3 = String.valueOf(object);
            string2 = "Action[browser]: empty scheme: ";
            string2.concat(string3);
        }
        string2 = "android.intent.action.VIEW";
        try {
            string3 = new Intent(string2, (Uri)object2);
            object2 = this.zzb;
        }
        catch (ActivityNotFoundException activityNotFoundException) {
            object = String.valueOf(object);
            "Action[browser]: can not open url: ".concat((String)object);
            return;
        }
        ((zzbw)((Object)object2)).startActivity((Intent)string3);
    }

    public final Executor zza() {
        Handler handler = this.zzc;
        Objects.requireNonNull(handler);
        zzby zzby2 = new zzby(handler);
        return zzby2;
    }

    public final boolean zzb(String object, JSONObject object2) {
        int n3;
        String string2;
        int n4;
        int n7;
        int n8;
        int n10;
        int n14;
        block19: {
            n14 = ((String)object).hashCode();
            n10 = -1;
            n8 = 2;
            n7 = 3;
            n4 = 1;
            switch (n14) {
                default: {
                    break;
                }
                case 1671672458: {
                    string2 = "dismiss";
                    n3 = (int)(((String)object).equals(string2) ? 1 : 0);
                    if (n3 == 0) break;
                    n3 = 1;
                    break block19;
                }
                case 150940456: {
                    string2 = "browser";
                    n3 = (int)(((String)object).equals(string2) ? 1 : 0);
                    if (n3 == 0) break;
                    n3 = 2;
                    break block19;
                }
                case -278739366: {
                    string2 = "configure_app_assets";
                    n3 = (int)(((String)object).equals(string2) ? 1 : 0);
                    if (n3 == 0) break;
                    n3 = 3;
                    break block19;
                }
                case -1370505102: {
                    string2 = "load_complete";
                    n3 = (int)(((String)object).equals(string2) ? 1 : 0);
                    if (n3 == 0) break;
                    n3 = 0;
                    object = null;
                    break block19;
                }
            }
            n3 = -1;
        }
        if (n3 != 0) {
            if (n3 != n4) {
                if (n3 != n8) {
                    if (n3 != n7) {
                        return false;
                    }
                    this.zzc();
                    return n4 != 0;
                }
                this.zzg((JSONObject)object2);
                return n4 != 0;
            }
            object = object2.optString("status");
            int n15 = ((String)object).hashCode();
            n14 = 4;
            switch (n15) {
                default: {
                    break;
                }
                case 1666911234: {
                    object2 = "non_personalized";
                    n3 = (int)(((String)object).equals(object2) ? 1 : 0);
                    if (n3 == 0) break;
                    n10 = 2;
                    break;
                }
                case 467888915: {
                    object2 = "CONSENT_SIGNAL_PERSONALIZED_ADS";
                    n3 = (int)(((String)object).equals(object2) ? 1 : 0);
                    if (n3 == 0) break;
                    n10 = 1;
                    break;
                }
                case 429411856: {
                    object2 = "CONSENT_SIGNAL_SUFFICIENT";
                    n3 = (int)(((String)object).equals(object2) ? 1 : 0);
                    if (n3 == 0) break;
                    n10 = 4;
                    break;
                }
                case -258041904: {
                    object2 = "personalized";
                    n3 = (int)(((String)object).equals(object2) ? 1 : 0);
                    if (n3 == 0) break;
                    n10 = 0;
                    break;
                }
                case -954325659: {
                    object2 = "CONSENT_SIGNAL_NON_PERSONALIZED_ADS";
                    n3 = (int)(((String)object).equals(object2) ? 1 : 0);
                    if (n3 == 0) break;
                    n10 = 3;
                }
            }
            if (n10 != 0 && n10 != n4 && n10 != n8 && n10 != n7 && n10 != n14) {
                object = this.zzg;
                string2 = "We are getting something wrong with the webview.";
                object2 = new zzg(n4, string2);
                ((zzbb)object).zzd((zzg)object2);
            } else {
                object = this.zzg;
                ((zzbb)object).zzc(n7);
            }
            return n4 != 0;
        }
        this.zzg.zze();
        return n4 != 0;
    }

    public final void zzc() {
        zzbz zzbz2 = new zzbz(this);
        this.zzd.execute(zzbz2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final /* synthetic */ void zzd() {
        Object object = new JSONObject();
        Object object2 = this.zza;
        Object object3 = "app_name";
        try {
            Object object4 = object2.getPackageManager();
            ApplicationInfo applicationInfo = object2.getApplicationInfo();
            object4 = object4.getApplicationLabel(applicationInfo);
            object4 = object4.toString();
            object.put((String)object3, object4);
            object3 = "app_icon";
            object4 = object2.getPackageManager();
            object2 = object2.getApplicationInfo();
            object2 = object4.getApplicationIcon((ApplicationInfo)object2);
            if (object2 == null) {
                object2 = null;
            } else {
                int n3 = object2.getIntrinsicWidth();
                int n4 = object2.getIntrinsicHeight();
                Bitmap.Config config = Bitmap.Config.ARGB_8888;
                object4 = Bitmap.createBitmap((int)n3, (int)n4, (Bitmap.Config)config);
                applicationInfo = new Canvas((Bitmap)object4);
                int n7 = applicationInfo.getWidth();
                int n8 = applicationInfo.getHeight();
                object2.setBounds(0, 0, n7, n8);
                object2.draw((Canvas)applicationInfo);
                object2 = new ByteArrayOutputStream();
                applicationInfo = Bitmap.CompressFormat.PNG;
                n7 = 100;
                object4.compress((Bitmap.CompressFormat)applicationInfo, n7, (OutputStream)object2);
                object2 = object2.toByteArray();
                n3 = 2;
                object2 = Base64.encodeToString((byte[])object2, (int)n3);
                object4 = "data:image/png;base64,";
                object2 = String.valueOf(object2);
                object2 = ((String)object4).concat((String)object2);
            }
            object.put((String)object3, object2);
            object2 = "stored_infos_map";
            object3 = this.zzh;
            object3 = ((zzap)object3).zzc();
            object.put((String)object2, object3);
        }
        catch (JSONException jSONException) {}
        object2 = this.zzg.zza();
        object = object.toString();
        object2.zzd("UMP_configureFormWithAppAssets", (String)object);
    }

    public final void zze(String string2) {
        String string3 = String.valueOf(string2);
        "Receive consent action: ".concat(string3);
        string2 = Uri.parse((String)string2);
        string3 = string2.getQueryParameter("action");
        string2 = string2.getQueryParameter("args");
        zzan zzan2 = this.zzf;
        zzd[] zzdArray = new zzd[]{this, zzan2};
        this.zze.zzb(string3, string2, zzdArray);
    }

    public final void zzf(int n3, String string2, String string3) {
        CharSequence charSequence = Fh3.a(n3, "WebResourceError(", ", ", string3, "): ");
        charSequence.append(string2);
        charSequence = charSequence.toString();
        zzg zzg2 = new zzg(2, (String)charSequence);
        this.zzg.zzf(zzg2);
    }
}

