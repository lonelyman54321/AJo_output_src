/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.net.Uri
 *  android.os.Bundle
 *  android.text.TextUtils
 *  android.util.Pair
 *  android.view.MotionEvent
 *  android.view.View
 *  android.webkit.WebView
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package com.google.android.gms.ads.nonagon.signalgeneration;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebView;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdRequest$Builder;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.ads.internal.util.zzab;
import com.google.android.gms.ads.internal.zzu;
import com.google.android.gms.ads.nonagon.signalgeneration.zzay;
import com.google.android.gms.ads.nonagon.signalgeneration.zzaz;
import com.google.android.gms.ads.nonagon.signalgeneration.zzba;
import com.google.android.gms.ads.nonagon.signalgeneration.zzbb;
import com.google.android.gms.ads.nonagon.signalgeneration.zzbe;
import com.google.android.gms.ads.nonagon.signalgeneration.zze;
import com.google.android.gms.ads.nonagon.signalgeneration.zzp;
import com.google.android.gms.ads.query.QueryInfo;
import com.google.android.gms.ads.query.QueryInfoGenerationCallback;
import com.google.android.gms.internal.ads.zzaxd;
import com.google.android.gms.internal.ads.zzaxe;
import com.google.android.gms.internal.ads.zzbeg;
import com.google.android.gms.internal.ads.zzben;
import com.google.android.gms.internal.ads.zzbep;
import com.google.android.gms.internal.ads.zzbgp;
import com.google.android.gms.internal.ads.zzcby;
import com.google.android.gms.internal.ads.zzcci;
import com.google.android.gms.internal.ads.zzdvh;
import com.google.android.gms.internal.ads.zzfhs;
import com.google.android.gms.internal.ads.zzfoe;
import com.google.android.gms.internal.ads.zzgge;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONException;
import org.json.JSONObject;

final class TaggingLibraryJsInterface {
    private final Context zza;
    private final WebView zzb;
    private final zzaxd zzc;
    private final zzfhs zzd;
    private final int zze;
    private final zzdvh zzf;
    private final boolean zzg;
    private final zzgge zzh;
    private final zzfoe zzi;
    private final zze zzj;

    public TaggingLibraryJsInterface(WebView object, zzaxd zzaxd2, zzdvh zzdvh2, zzfoe zzfoe2, zzfhs zzfhs2, zze zze2) {
        int n3;
        zzgge zzgge2;
        this.zzh = zzgge2 = zzcci.zze;
        this.zzb = object;
        object = object.getContext();
        this.zza = object;
        this.zzc = zzaxd2;
        this.zzf = zzdvh2;
        zzbep.zza((Context)object);
        object = zzbep.zzjC;
        this.zze = n3 = ((Integer)com.google.android.gms.ads.internal.client.zzba.zzc().zza((zzbeg)object)).intValue();
        object = zzbep.zzjD;
        n3 = (int)(((Boolean)com.google.android.gms.ads.internal.client.zzba.zzc().zza((zzbeg)object)).booleanValue() ? 1 : 0);
        this.zzg = n3;
        this.zzi = zzfoe2;
        this.zzd = zzfhs2;
        this.zzj = zze2;
    }

    public static /* bridge */ /* synthetic */ WebView zza(TaggingLibraryJsInterface taggingLibraryJsInterface) {
        return taggingLibraryJsInterface.zzb;
    }

    public static /* bridge */ /* synthetic */ zzgge zzb(TaggingLibraryJsInterface taggingLibraryJsInterface) {
        return taggingLibraryJsInterface.zzh;
    }

    public String getClickSignals(String string2) {
        RuntimeException runtimeException22;
        block19: {
            block18: {
                Object object;
                try {
                    object = zzu.zzB();
                }
                catch (RuntimeException runtimeException22) {}
                long l2 = object.currentTimeMillis();
                Pair[] pairArray = this.zzc;
                pairArray = pairArray.zzc();
                Context context = this.zza;
                WebView webView = this.zzb;
                string2 = pairArray.zze(context, string2, (View)webView);
                boolean n3 = this.zzg;
                if (!n3) break block18;
                pairArray = zzu.zzB();
                long l3 = pairArray.currentTimeMillis() - l2;
                object = this.zzf;
                String string3 = "csg";
                String string4 = "clat";
                pairArray = String.valueOf(l3);
                webView = new Pair((Object)string4, (Object)pairArray);
                int n4 = 1;
                pairArray = new Pair[n4];
                context = null;
                pairArray[0] = webView;
                context = null;
                zzp.zzd((zzdvh)object, null, string3, pairArray);
                break block19;
            }
            return string2;
        }
        zzm.zzh("Exception getting click signals. ", runtimeException22);
        zzu.zzo().zzw(runtimeException22, "TaggingLibraryJsInterface.getClickSignals");
        return "";
    }

    /*
     * WARNING - void declaration
     */
    public String getClickSignalsWithTimeout(String object, int n3) {
        void var1_5;
        String string2 = "";
        if (n3 <= 0) {
            object = new StringBuilder("Invalid timeout for getting click signals. Timeout=");
            ((StringBuilder)object).append(n3);
            zzm.zzg(((StringBuilder)object).toString());
            return string2;
        }
        int n4 = this.zze;
        n3 = Math.min(n3, n4);
        Object object2 = zzcci.zza;
        zzba zzba2 = new zzba(this, (String)object);
        object = object2.zzb(zzba2);
        long l2 = n3;
        Object object3 = TimeUnit.MILLISECONDS;
        object = object.get(l2, (TimeUnit)((Object)object3));
        try {
            return (String)object;
        }
        catch (ExecutionException executionException) {
        }
        catch (TimeoutException timeoutException) {
        }
        catch (InterruptedException interruptedException) {
            // empty catch block
        }
        zzm.zzh("Exception getting click signals with timeout. ", (Throwable)var1_5);
        object3 = "TaggingLibraryJsInterface.getClickSignalsWithTimeout";
        object2 = zzu.zzo();
        ((zzcby)object2).zzw((Throwable)var1_5, (String)object3);
        boolean bl2 = var1_5 instanceof TimeoutException;
        if (bl2) {
            return "17";
        }
        return string2;
    }

    public String getQueryInfo() {
        zzu.zzp();
        String string2 = UUID.randomUUID().toString();
        Object object = E1.a("query_info_type", "requester_type_6");
        zzbe zzbe2 = new zzbe(this, string2);
        Object object2 = (Boolean)zzbgp.zza.zze();
        boolean bl2 = (Boolean)object2;
        if (bl2) {
            object = this.zzj;
            object2 = this.zzb;
            ((zze)object).zzg(object2, zzbe2);
        } else {
            object2 = zzbep.zzjF;
            Object object3 = com.google.android.gms.ads.internal.client.zzba.zzc();
            object2 = (Boolean)((zzben)object3).zza((zzbeg)object2);
            bl2 = (Boolean)object2;
            if (bl2) {
                object2 = this.zzh;
                object3 = new zzbb(this, (Bundle)object, zzbe2);
                object2.execute((Runnable)object3);
            } else {
                object2 = this.zza;
                object3 = AdFormat.BANNER;
                AdRequest$Builder adRequest$Builder = new AdRequest$Builder();
                Class<AdMobAdapter> clazz = AdMobAdapter.class;
                object = ((AdRequest$Builder)adRequest$Builder.addNetworkExtrasBundle(clazz, (Bundle)object)).build();
                QueryInfo.generate((Context)object2, (AdFormat)((Object)object3), (AdRequest)object, zzbe2);
            }
        }
        return string2;
    }

    public String getViewSignals() {
        RuntimeException runtimeException22;
        block19: {
            Object object;
            block18: {
                Object object2;
                try {
                    object2 = zzu.zzB();
                }
                catch (RuntimeException runtimeException22) {}
                long l2 = object2.currentTimeMillis();
                object = this.zzc;
                object = ((zzaxd)object).zzc();
                Object object3 = this.zza;
                WebView webView = this.zzb;
                object = object.zzh((Context)object3, (View)webView, null);
                boolean n3 = this.zzg;
                if (!n3) break block18;
                object3 = zzu.zzB();
                long l3 = object3.currentTimeMillis() - l2;
                object2 = this.zzf;
                String string2 = "vsg";
                String string3 = "vlat";
                object3 = String.valueOf(l3);
                Pair pair = new Pair((Object)string3, object3);
                int n4 = 1;
                object3 = new Pair[n4];
                webView = null;
                object3[0] = pair;
                zzp.zzd((zzdvh)object2, null, string2, (Pair[])object3);
                break block19;
            }
            return object;
        }
        zzm.zzh("Exception getting view signals. ", runtimeException22);
        zzu.zzo().zzw(runtimeException22, "TaggingLibraryJsInterface.getViewSignals");
        return "";
    }

    /*
     * WARNING - void declaration
     */
    public String getViewSignalsWithTimeout(int n3) {
        void var8_12;
        String string2 = "";
        if (n3 <= 0) {
            StringBuilder stringBuilder = new StringBuilder("Invalid timeout for getting view signals. Timeout=");
            stringBuilder.append(n3);
            zzm.zzg(stringBuilder.toString());
            return string2;
        }
        int n4 = this.zze;
        n3 = Math.min(n3, n4);
        Object object = zzcci.zza;
        Object object2 = new zzay(this);
        object = object.zzb((Callable)object2);
        long l2 = n3;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        timeUnit = object.get(l2, timeUnit);
        try {
            return (String)((Object)timeUnit);
        }
        catch (ExecutionException executionException) {
        }
        catch (TimeoutException timeoutException) {
        }
        catch (InterruptedException interruptedException) {
            // empty catch block
        }
        zzm.zzh("Exception getting view signals with timeout. ", (Throwable)var8_12);
        object = "TaggingLibraryJsInterface.getViewSignalsWithTimeout";
        object2 = zzu.zzo();
        ((zzcby)object2).zzw((Throwable)var8_12, (String)object);
        n3 = var8_12 instanceof TimeoutException;
        if (n3 != 0) {
            return "17";
        }
        return string2;
    }

    public void recordClick(String string2) {
        Object object = zzbep.zzjH;
        Object object2 = com.google.android.gms.ads.internal.client.zzba.zzc();
        object = (Boolean)((zzben)object2).zza((zzbeg)object);
        boolean bl2 = (Boolean)object;
        if (bl2 && !(bl2 = TextUtils.isEmpty((CharSequence)string2))) {
            object = zzcci.zza;
            object2 = new zzaz(this, string2);
            object.execute((Runnable)object2);
        }
    }

    /*
     * Unable to fully structure code
     */
    public void reportTouchEvent(String var1_1) {
        block23: {
            block22: {
                var3_8 = var1_1;
                var2_2 = new JSONObject(var1_1);
                var3_8 = "x";
                var4_9 = var2_2.getInt((String)var3_8);
                var5_10 = "y";
                var6_11 = var2_2.getInt((String)var5_10);
                var7_12 = "duration_ms";
                var8_13 = var2_2.getInt(var7_12);
                var9_14 = "force";
                var10_15 = var2_2.getDouble(var9_14);
                var12_16 = (float)var10_15;
                var9_14 = "type";
                var13_17 = var2_2.getInt(var9_14);
                if (var13_17 != 0) {
                    var14_18 = 1;
                    if (var13_17 != var14_18) {
                        var14_18 = 2;
                        if (var13_17 != var14_18) {
                            var14_18 = 3;
                            if (var13_17 != var14_18) {
                                var13_17 = -1;
                                var15_19 = -1;
                            } else {
                                var15_19 = 3;
                            }
                        } else {
                            var15_19 = 2;
                        }
                    } else {
                        var15_19 = 1;
                    }
                    break block22;
                }
                var13_17 = 0;
                var2_2 = null;
                var15_19 = 0;
            }
            var16_20 = var8_13;
            var18_21 = var4_9;
            var19_22 = var6_11;
            var20_23 = 0L;
            var22_24 = 1.0f;
            var23_25 = 1.0f;
            var24_26 = 1.0f;
            var2_2 = MotionEvent.obtain((long)var20_23, (long)var16_20, (int)var15_19, (float)var18_21, (float)var19_22, (float)var12_16, (float)var22_24, (int)0, (float)var23_25, (float)var24_26, (int)0, (int)0);
            var3_8 = this;
            var5_10 = this.zzc;
            try {
                var5_10.zzd((MotionEvent)var2_2);
                return;
            }
            catch (JSONException var2_3) {
            }
            catch (RuntimeException var2_4) {}
            break block23;
            catch (JSONException var2_5) lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_8 = this;
                    break block23;
                    break;
                }
            }
            catch (RuntimeException var2_7) {
                ** continue;
            }
        }
        zzm.zzh("Failed to parse the touch string. ", (Throwable)var2_6);
        zzu.zzo().zzw((Throwable)var2_6, "TaggingLibraryJsInterface.reportTouchEvent");
    }

    public final /* synthetic */ void zzc(Bundle object, QueryInfoGenerationCallback queryInfoGenerationCallback) {
        boolean bl2;
        zzab zzab2 = zzu.zzq();
        Object object2 = this.zza;
        if ((zzab2 = zzab2.zza((Context)object2)) != null) {
            object2 = this.zzb;
            bl2 = zzab2.acceptThirdPartyCookies((WebView)object2);
        } else {
            bl2 = false;
            zzab2 = null;
        }
        object.putBoolean("accept_3p_cookie", bl2);
        zzab2 = this.zza;
        object2 = AdFormat.BANNER;
        AdRequest$Builder adRequest$Builder = new AdRequest$Builder();
        object = ((AdRequest$Builder)adRequest$Builder.addNetworkExtrasBundle(AdMobAdapter.class, (Bundle)object)).build();
        QueryInfo.generate((Context)zzab2, (AdFormat)((Object)object2), (AdRequest)object, queryInfoGenerationCallback);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final /* synthetic */ void zzd(String string2) {
        Object object;
        block3: {
            zzaxe zzaxe22;
            block4: {
                zzben zzben2;
                block2: {
                    string2 = Uri.parse((String)string2);
                    try {
                        object = zzbep.zzlW;
                        zzben2 = com.google.android.gms.ads.internal.client.zzba.zzc();
                        object = zzben2.zza((zzbeg)object);
                        object = (Boolean)object;
                        boolean bl2 = (Boolean)object;
                        if (!bl2 || (object = this.zzd) == null) break block2;
                        zzben2 = this.zza;
                        WebView webView = this.zzb;
                        string2 = ((zzfhs)object).zza((Uri)string2, (Context)zzben2, (View)webView, null);
                        break block3;
                    }
                    catch (zzaxe zzaxe22) {
                        break block4;
                    }
                }
                object = this.zzc;
                zzben2 = this.zza;
                WebView webView = this.zzb;
                string2 = ((zzaxd)object).zza((Uri)string2, (Context)zzben2, (View)webView, null);
                break block3;
            }
            zzm.zzf("Failed to append the click signal to URL: ", zzaxe22);
            String string3 = "TaggingLibraryJsInterface.recordClick";
            zzcby zzcby2 = zzu.zzo();
            zzcby2.zzw(zzaxe22, string3);
        }
        object = this.zzi;
        string2 = string2.toString();
        ((zzfoe)object).zzc(string2, null);
    }
}

