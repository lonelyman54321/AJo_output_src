/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.PendingIntent
 *  android.content.Context
 *  android.net.Uri
 *  android.os.Bundle
 *  android.os.Parcelable
 *  android.os.RemoteException
 *  android.text.TextUtils
 *  org.json.JSONArray
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package com.google.android.gms.internal.ads;

import android.app.PendingIntent;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.RemoteException;
import android.support.customtabs.ICustomTabsCallback;
import android.text.TextUtils;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.AbstractAdRequestBuilder;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdRequest$Builder;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.ads.internal.zzu;
import com.google.android.gms.ads.nonagon.signalgeneration.zze;
import com.google.android.gms.ads.query.QueryInfo;
import com.google.android.gms.ads.query.QueryInfoGenerationCallback;
import com.google.android.gms.internal.ads.zzbeg;
import com.google.android.gms.internal.ads.zzben;
import com.google.android.gms.internal.ads.zzbep;
import com.google.android.gms.internal.ads.zzbfn;
import com.google.android.gms.internal.ads.zzbfo;
import com.google.android.gms.internal.ads.zzbfp;
import com.google.android.gms.internal.ads.zzbfv;
import com.google.android.gms.internal.ads.zzbgp;
import java.util.Date;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class zzbfq {
    private final ScheduledExecutorService zza;
    private final zze zzb;
    private Runnable zzc;
    private zzbfn zzd;
    private bg0 zze;
    private String zzf;
    private long zzg = 0L;
    private long zzh;
    private JSONArray zzi;
    private Context zzj;

    public zzbfq(ScheduledExecutorService scheduledExecutorService, zze zze2) {
        this.zza = scheduledExecutorService;
        this.zzb = zze2;
    }

    public static /* bridge */ /* synthetic */ bg0 zza(zzbfq zzbfq2) {
        return zzbfq2.zze;
    }

    public static /* synthetic */ void zze(zzbfq zzbfq2) {
        zzbfq2.zzj();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final void zzj() {
        Object object;
        long l2;
        Object object2;
        block10: {
            block11: {
                block12: {
                    long l3;
                    long l4;
                    object2 = this.zzd;
                    if (object2 == null) {
                        zzm.zzg("PACT callback is not present, please initialize the PawCustomTabsImpl.");
                        return;
                    }
                    boolean bl2 = (Boolean)(object2 = ((zzbfn)object2).zza());
                    if (bl2) {
                        return;
                    }
                    object2 = this.zzf;
                    if (object2 == null || (object2 = this.zze) == null || (object2 = this.zza) == null) break block11;
                    long l7 = this.zzg;
                    l2 = 0L;
                    long l8 = l7 - l2;
                    Object object3 = l8 == 0L ? 0 : (l8 < 0L ? -1 : 1);
                    if (object3 != false && (l4 = (l3 = (l7 = (object2 = zzu.zzB()).elapsedRealtime()) - (l2 = this.zzg)) == 0L ? 0 : (l3 < 0L ? -1 : 1)) <= 0) break block12;
                    object2 = zzbep.zzjN;
                    object = zzba.zzc();
                    object2 = (Boolean)((zzben)object).zza((zzbeg)object2);
                    bl2 = (Boolean)object2;
                    if (!bl2) break block11;
                }
                object2 = this.zze;
                object = Uri.parse((String)this.zzf);
                object2.getClass();
                Bundle bundle = new Bundle();
                try {
                    boolean bl3;
                    Bundle bundle2 = new Bundle();
                    PendingIntent pendingIntent = ((bg0)object2).e;
                    if (pendingIntent != null && pendingIntent != null) {
                        String string2 = "android.support.customtabs.extra.SESSION_ID";
                        bundle2.putParcelable(string2, (Parcelable)pendingIntent);
                    }
                    if (bl3 = bundle2.isEmpty()) {
                        bundle2 = null;
                    }
                    ICustomTabsCallback iCustomTabsCallback = ((bg0)object2).c;
                    object2 = ((bg0)object2).b;
                    if (bundle2 != null) {
                        bundle.putAll(bundle2);
                        object2.requestPostMessageChannelWithExtras(iCustomTabsCallback, (Uri)object, bundle);
                        break block10;
                    } else {
                        object2.requestPostMessageChannel(iCustomTabsCallback, (Uri)object);
                    }
                    break block10;
                }
                catch (RemoteException remoteException) {}
            }
            com.google.android.gms.ads.internal.util.zze.zza("PACT max retry connection duration timed out");
            return;
        }
        object2 = this.zza;
        object = this.zzc;
        zzbeg zzbeg2 = zzbep.zzjO;
        l2 = (Long)zzba.zzc().zza(zzbeg2);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        object2.schedule((Runnable)object, l2, timeUnit);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final void zzk(JSONObject jSONObject) {
        JSONException jSONException2;
        block3: {
            Object object;
            Object object2;
            block2: {
                try {
                    object2 = this.zzi;
                    if (object2 != null) break block2;
                    object = zzbep.zzjQ;
                    zzben zzben2 = zzba.zzc();
                    object = zzben2.zza((zzbeg)object);
                    object = (String)object;
                    this.zzi = object2 = new JSONArray((String)object);
                }
                catch (JSONException jSONException2) {
                    break block3;
                }
            }
            object2 = "eids";
            object = this.zzi;
            jSONObject.put((String)object2, object);
            return;
        }
        zzm.zzh("Error fetching the PACT active eids JSON: ", jSONException2);
    }

    public final bg0 zzb() {
        return this.zze;
    }

    public final JSONObject zzc(String object, String object2) {
        long l2;
        JSONObject jSONObject = new JSONObject();
        String string2 = "paw_id";
        jSONObject.put(string2, object);
        jSONObject.put("error", object2);
        object = (Boolean)zzbgp.zza.zze();
        boolean bl2 = (Boolean)object;
        if (bl2) {
            object = zzbep.zzjR;
            object2 = zzba.zzc();
            object = (Long)((zzben)object2).zza((zzbeg)object);
            l2 = (Long)object;
        } else {
            l2 = 0L;
        }
        jSONObject.put("sdk_ttl_ms", l2);
        this.zzk(jSONObject);
        return jSONObject;
    }

    public final JSONObject zzd(String object, String object2) {
        long l2;
        JSONObject jSONObject = new JSONObject();
        String string2 = "paw_id";
        jSONObject.put(string2, object);
        jSONObject.put("signal", object2);
        object = (Boolean)zzbgp.zza.zze();
        boolean bl2 = (Boolean)object;
        if (bl2) {
            object = zzbep.zzjR;
            object2 = zzba.zzc();
            object = (Long)((zzben)object2).zza((zzbeg)object);
            l2 = (Long)object;
        } else {
            l2 = 0L;
        }
        jSONObject.put("sdk_ttl_ms", l2);
        this.zzk(jSONObject);
        return jSONObject;
    }

    public final void zzf() {
        long l2 = zzu.zzB().elapsedRealtime();
        Object object = zzbep.zzjM;
        zzben zzben2 = zzba.zzc();
        object = (Integer)zzben2.zza((zzbeg)object);
        int n3 = (Integer)object;
        long l3 = n3;
        this.zzg = l2 += l3;
        Runnable runnable2 = this.zzc;
        if (runnable2 == null) {
            this.zzc = runnable2 = new zzbfo(this);
        }
        this.zzj();
    }

    public final void zzg(Context object, Wf0 wf0, String string2, Uf0 uf0) {
        if (object != null) {
            boolean bl2 = TextUtils.isEmpty((CharSequence)string2);
            if (!bl2) {
                if (wf0 != null) {
                    this.zzj = object;
                    this.zzf = string2;
                    object = new zzbfn(this, uf0);
                    this.zzd = object;
                    object = wf0.b((zzbfn)object);
                    this.zze = object;
                    if (object == null) {
                        object = "CustomTabsClient failed to create new session.";
                        zzm.zzg((String)object);
                    }
                    return;
                }
                object = new IllegalArgumentException("CustomTabsClient parameter is null");
                throw object;
            }
            object = new IllegalArgumentException("Origin parameter is empty or null");
            throw object;
        }
        object = new IllegalArgumentException("App Context parameter is null");
        throw object;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzh(String object) {
        JSONException jSONException2;
        block3: {
            Object object2;
            Object object3;
            Object object4;
            Object object5;
            try {
                object5 = this.zze;
                object4 = new JSONObject();
                object3 = "gsppack";
                boolean bl2 = true;
                object4.put(object3, bl2);
                object3 = "fpt";
                long l2 = this.zzh;
                object2 = new Date(l2);
                object2 = ((Date)object2).toString();
                object4.put(object3, object2);
                this.zzk((JSONObject)object4);
                object4 = object4.toString();
                ((bg0)object5).a((String)object4);
                object5 = new zzbfp(this, (String)object);
                object = zzbgp.zza;
                object = ((zzbfv)object).zze();
                object = (Boolean)object;
                boolean bl3 = (Boolean)object;
                if (bl3) {
                    object = this.zzb;
                    object4 = this.zze;
                    ((zze)object).zzg(object4, (QueryInfoGenerationCallback)object5);
                    return;
                }
            }
            catch (JSONException jSONException2) {
                break block3;
            }
            object = new Bundle();
            object4 = "query_info_type";
            object3 = "requester_type_6";
            object.putString((String)object4, object3);
            object4 = this.zzj;
            object3 = AdFormat.BANNER;
            object2 = new AdRequest$Builder();
            Class<AdMobAdapter> clazz = AdMobAdapter.class;
            object = ((AbstractAdRequestBuilder)object2).addNetworkExtrasBundle(clazz, (Bundle)object);
            object = (AdRequest$Builder)object;
            object = ((AdRequest$Builder)object).build();
            QueryInfo.generate((Context)object4, (AdFormat)((Object)object3), (AdRequest)object, (QueryInfoGenerationCallback)object5);
            return;
        }
        zzm.zzh("Error creating JSON: ", jSONException2);
    }

    public final void zzi(long l2) {
        this.zzh = l2;
    }
}

