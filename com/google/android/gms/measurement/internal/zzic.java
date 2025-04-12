/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Application
 *  android.content.BroadcastReceiver
 *  android.content.Context
 *  android.content.Intent
 *  android.content.IntentFilter
 *  android.net.Uri
 *  android.os.Bundle
 *  android.text.TextUtils
 *  android.util.Pair
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package com.google.android.gms.measurement.internal;

import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.common.wrappers.PackageManagerWrapper;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.internal.measurement.zzdz;
import com.google.android.gms.internal.measurement.zzgf$zzo$zza;
import com.google.android.gms.internal.measurement.zzhx;
import com.google.android.gms.internal.measurement.zzoy;
import com.google.android.gms.measurement.internal.zza;
import com.google.android.gms.measurement.internal.zzaf;
import com.google.android.gms.measurement.internal.zzai;
import com.google.android.gms.measurement.internal.zzap;
import com.google.android.gms.measurement.internal.zzbd;
import com.google.android.gms.measurement.internal.zzbf;
import com.google.android.gms.measurement.internal.zzbn;
import com.google.android.gms.measurement.internal.zzf;
import com.google.android.gms.measurement.internal.zzfu;
import com.google.android.gms.measurement.internal.zzfx;
import com.google.android.gms.measurement.internal.zzg;
import com.google.android.gms.measurement.internal.zzgg;
import com.google.android.gms.measurement.internal.zzgj;
import com.google.android.gms.measurement.internal.zzgk;
import com.google.android.gms.measurement.internal.zzgl;
import com.google.android.gms.measurement.internal.zzgo;
import com.google.android.gms.measurement.internal.zzgq;
import com.google.android.gms.measurement.internal.zzha;
import com.google.android.gms.measurement.internal.zzhd;
import com.google.android.gms.measurement.internal.zzhf;
import com.google.android.gms.measurement.internal.zzhh;
import com.google.android.gms.measurement.internal.zzhv;
import com.google.android.gms.measurement.internal.zzib;
import com.google.android.gms.measurement.internal.zzid;
import com.google.android.gms.measurement.internal.zzie;
import com.google.android.gms.measurement.internal.zzjf;
import com.google.android.gms.measurement.internal.zzjh;
import com.google.android.gms.measurement.internal.zzji;
import com.google.android.gms.measurement.internal.zzjj;
import com.google.android.gms.measurement.internal.zzjj$zza;
import com.google.android.gms.measurement.internal.zzjm;
import com.google.android.gms.measurement.internal.zzjs;
import com.google.android.gms.measurement.internal.zzju;
import com.google.android.gms.measurement.internal.zzjv;
import com.google.android.gms.measurement.internal.zzlo;
import com.google.android.gms.measurement.internal.zzlp;
import com.google.android.gms.measurement.internal.zzlr;
import com.google.android.gms.measurement.internal.zzls;
import com.google.android.gms.measurement.internal.zzlz;
import com.google.android.gms.measurement.internal.zzme;
import com.google.android.gms.measurement.internal.zznx;
import com.google.android.gms.measurement.internal.zzpn;
import com.google.android.gms.measurement.internal.zzq;
import com.google.android.gms.measurement.internal.zzu;
import java.net.URL;
import java.util.Map;
import java.util.Objects;
import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONException;
import org.json.JSONObject;

public class zzic
implements zzjh {
    private static volatile zzic zzb;
    final long zza;
    private boolean zzaa;
    private Boolean zzab;
    private long zzac;
    private volatile Boolean zzad;
    private Boolean zzae;
    private Boolean zzaf;
    private volatile boolean zzag;
    private int zzah;
    private int zzai;
    private AtomicInteger zzaj;
    private final Context zzc;
    private final String zzd;
    private final String zze;
    private final String zzf;
    private final boolean zzg;
    private final zzaf zzh;
    private final zzai zzi;
    private final zzha zzj;
    private final zzgo zzk;
    private final zzhv zzl;
    private final zznx zzm;
    private final zzpn zzn;
    private final zzgl zzo;
    private final Clock zzp;
    private final zzlz zzq;
    private final zzju zzr;
    private final zza zzs;
    private final zzlp zzt;
    private final String zzu;
    private zzgj zzv;
    private zzme zzw;
    private zzbf zzx;
    private zzgg zzy;
    private zzls zzz;

    private zzic(zzjs zzjs2) {
        long l2;
        long l3;
        long l4;
        long l7;
        Object object;
        boolean bl2;
        boolean bl3 = false;
        Object object2 = null;
        this.zzaa = false;
        Object object3 = new AtomicInteger(0);
        this.zzaj = object3;
        Preconditions.checkNotNull(zzjs2);
        object3 = zzjs2.zza;
        Object object4 = new zzaf((Context)object3);
        this.zzh = object4;
        zzfu.zza = object4;
        object3 = zzjs2.zza;
        this.zzc = object3;
        this.zzd = object4 = zzjs2.zzb;
        this.zze = object4 = zzjs2.zzc;
        this.zzf = object4 = zzjs2.zzd;
        this.zzg = bl2 = zzjs2.zzh;
        this.zzad = object4 = zzjs2.zze;
        this.zzu = object4 = zzjs2.zzj;
        this.zzag = bl2 = true;
        Object object5 = zzjs2.zzg;
        if (object5 != null && (object = ((zzdz)object5).zzg) != null) {
            String string2 = "measurementEnabled";
            boolean bl4 = (object = object.get(string2)) instanceof Boolean;
            if (bl4) {
                this.zzae = object = (Boolean)object;
            }
            object5 = ((zzdz)object5).zzg;
            object = "measurementDeactivated";
            boolean bl5 = (object5 = object5.get((String)object)) instanceof Boolean;
            if (bl5) {
                this.zzaf = object5 = (Boolean)object5;
            }
        }
        zzhx.zzb((Context)object3);
        this.zzp = object5 = DefaultClock.getInstance();
        object = zzjs2.zzi;
        long l8 = object != null ? ((Long)object).longValue() : object5.currentTimeMillis();
        this.zza = l8;
        this.zzi = object5 = new zzai(this);
        object5 = new zzha(this);
        ((zzji)object5).zzae();
        this.zzj = object5;
        object5 = new zzgo(this);
        ((zzji)object5).zzae();
        this.zzk = object5;
        object5 = new zzpn(this);
        ((zzji)object5).zzae();
        this.zzn = object5;
        object5 = new zzjv(zzjs2, this);
        this.zzo = object = new zzgl((zzgk)object5);
        this.zzs = object5 = new zza(this);
        object5 = new zzlz(this);
        ((zzf)object5).zzx();
        this.zzq = object5;
        object5 = new zzju(this);
        ((zzf)object5).zzx();
        this.zzr = object5;
        object5 = new zznx(this);
        ((zzf)object5).zzx();
        this.zzm = object5;
        object5 = new zzlp(this);
        ((zzji)object5).zzae();
        this.zzt = object5;
        object5 = new zzhv(this);
        ((zzji)object5).zzae();
        this.zzl = object5;
        object = zzjs2.zzg;
        if (object != null && (l7 = (l4 = (l3 = ((zzdz)object).zzb) - (l2 = 0L)) == 0L ? 0 : (l4 < 0L ? -1 : 1)) != false) {
            bl3 = true;
        }
        bl3 ^= bl2;
        boolean bl6 = (object3 = object3.getApplicationContext()) instanceof Application;
        if (bl6) {
            object3 = this.zzp();
            ((zzju)object3).zzb(bl3);
        } else {
            object2 = this.zzj().zzr();
            object3 = "Application context is not an Application";
            ((zzgq)object2).zza((String)object3);
        }
        object2 = new zzid(this, zzjs2);
        ((zzhv)object5).zzb((Runnable)object2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static zzic zza(Context object, zzdz object2, Long object3) {
        block8: {
            boolean bl2;
            block7: {
                Class<zzic> clazz;
                Class<zzic> clazz2;
                if (object2 != null && ((clazz2 = ((zzdz)object2).zze) == null || (clazz2 = ((zzdz)object2).zzf) == null)) {
                    long l2 = ((zzdz)object2).zza;
                    long l3 = ((zzdz)object2).zzb;
                    boolean bl3 = ((zzdz)object2).zzc;
                    String string2 = ((zzdz)object2).zzd;
                    Bundle bundle = ((zzdz)object2).zzg;
                    clazz = clazz2;
                    clazz2 = new Class<zzic>(l2, l3, bl3, string2, null, null, bundle, null);
                    object2 = clazz2;
                }
                Preconditions.checkNotNull(object);
                Preconditions.checkNotNull(object.getApplicationContext());
                clazz2 = zzb;
                if (clazz2 != null) break block7;
                clazz2 = zzic.class;
                synchronized (clazz2) {
                    Throwable throwable2;
                    block6: {
                        block5: {
                            try {
                                clazz = zzb;
                                if (clazz != null) break block5;
                                clazz = new Class<zzic>((Context)object, (zzdz)object2, (Long)object3);
                                object = new zzic((zzjs)((Object)clazz));
                                zzb = object;
                            }
                            catch (Throwable throwable2) {
                                break block6;
                            }
                        }
                        break block8;
                    }
                    throw throwable2;
                }
            }
            if (object2 != null && (object = ((zzdz)object2).zzg) != null && (bl2 = object.containsKey((String)(object3 = "dataCollectionDefaultEnabled")))) {
                Preconditions.checkNotNull(zzb);
                object = zzb;
                object2 = ((zzdz)object2).zzg;
                object3 = "dataCollectionDefaultEnabled";
                boolean bl4 = object2.getBoolean((String)object3);
                ((zzic)object).zza(bl4);
            }
        }
        Preconditions.checkNotNull(zzb);
        return zzb;
    }

    private static void zza(zzf object) {
        if (object != null) {
            boolean bl2 = ((zzf)object).zzaa();
            if (bl2) {
                return;
            }
            object = String.valueOf(object.getClass());
            object = "Component not initialized: ".concat((String)object);
            IllegalStateException illegalStateException = new IllegalStateException((String)object);
            throw illegalStateException;
        }
        object = new IllegalStateException("Component not created");
        throw object;
    }

    private static void zza(zzg object) {
        if (object != null) {
            return;
        }
        object = new IllegalStateException("Component not created");
        throw object;
    }

    public static /* synthetic */ void zza(zzic zzic2, zzjs object) {
        zzic2.zzl().zzv();
        Object object2 = new zzbf(zzic2);
        ((zzji)object2).zzae();
        zzic2.zzx = object2;
        long l2 = ((zzjs)object).zzf;
        object2 = new zzgg(zzic2, l2);
        ((zzf)object2).zzx();
        zzic2.zzy = object2;
        object = new zzgj(zzic2);
        ((zzf)object).zzx();
        zzic2.zzv = object;
        object = new zzme(zzic2);
        ((zzf)object).zzx();
        zzic2.zzw = object;
        zzic2.zzn.zzaf();
        zzic2.zzj.zzaf();
        zzic2.zzy.zzy();
        object = new zzls(zzic2);
        ((zzf)object).zzx();
        zzic2.zzz = object;
        ((zzf)object).zzy();
        object = zzic2.zzj().zzp();
        l2 = 114010L;
        Object object3 = l2;
        String string2 = "App measurement initialized, version";
        ((zzgq)object).zza(string2, object3);
        object = zzic2.zzj().zzp();
        object3 = "To enable debug logging run: adb shell setprop log.tag.FA VERBOSE";
        ((zzgq)object).zza((String)object3);
        object = ((zzgg)object2).zzaf();
        object2 = zzic2.zzd;
        boolean n3 = TextUtils.isEmpty((CharSequence)object2);
        if (n3) {
            object2 = zzic2.zzv();
            boolean bl2 = ((zzpn)object2).zzd((String)object, (String)(object3 = zzic2.zzi.zzr()));
            if (bl2) {
                object = zzic2.zzj().zzp();
                object2 = "Faster debug mode event logging enabled. To disable, run:\n  adb shell setprop debug.firebase.analytics.app .none.";
                ((zzgq)object).zza((String)object2);
            } else {
                object2 = zzic2.zzj().zzp();
                string2 = "To enable faster debug mode event logging run:\n  adb shell setprop debug.firebase.analytics.app ";
                object3 = new StringBuilder(string2);
                ((StringBuilder)object3).append((String)object);
                object = ((StringBuilder)object3).toString();
                ((zzgq)object2).zza((String)object);
            }
        }
        object = zzic2.zzj().zzc();
        ((zzgq)object).zza("Debug-level message logging enabled");
        int n4 = zzic2.zzah;
        object2 = zzic2.zzaj;
        int n7 = ((AtomicInteger)object2).get();
        if (n4 != n7) {
            object = zzic2.zzj().zzg();
            int n8 = zzic2.zzah;
            object2 = n8;
            int n10 = zzic2.zzaj.get();
            object3 = n10;
            string2 = "Not all components initialized";
            ((zzgq)object).zza(string2, object2, object3);
        }
        zzic2.zzaa = true;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static /* synthetic */ void zza(zzic object, String object2, int n3, Throwable object3, byte[] object4, Map object5) {
        object2 = "gad_source";
        object5 = "gbraid";
        String string2 = "gclid";
        String string3 = "";
        int n4 = 200;
        if ((n3 == n4 || n3 == (n4 = 204) || n3 == (n4 = 304)) && object3 == null) {
            Object object6 = ((zzic)object).zzn().zzo;
            boolean bl2 = true;
            ((zzhd)object6).zza(bl2);
            if (object4 != null && (n3 = ((byte[])object4).length) != 0) {
                JSONException jSONException2;
                block10: {
                    object6 = new String((byte[])object4);
                    try {
                        object3 = new JSONObject((String)object6);
                        object6 = "deeplink";
                        object6 = object3.optString((String)object6, string3);
                        boolean bl3 = TextUtils.isEmpty((CharSequence)object6);
                        if (bl3) {
                            object2 = ((zzic)object).zzj();
                            object2 = ((zzgo)object2).zzc();
                            object6 = "Deferred Deep Link is empty.";
                            ((zzgq)object2).zza((String)object6);
                            return;
                        }
                    }
                    catch (JSONException jSONException2) {
                        break block10;
                    }
                    object4 = object3.optString(string2, string3);
                    String string4 = object3.optString((String)object5, string3);
                    string3 = object3.optString((String)object2, string3);
                    String string5 = "timestamp";
                    double d2 = 0.0;
                    double d5 = object3.optDouble(string5, d2);
                    object3 = new Bundle();
                    Object object7 = ((zzic)object).zzv();
                    boolean bl4 = TextUtils.isEmpty((CharSequence)object6);
                    if (!bl4) {
                        boolean bl5;
                        object7 = ((zzpn)object7).zza();
                        object7 = object7.getPackageManager();
                        String string6 = "android.intent.action.VIEW";
                        Uri uri = Uri.parse((String)object6);
                        Intent intent = new Intent(string6, uri);
                        string6 = null;
                        if ((object7 = object7.queryIntentActivities(intent, 0)) != null && !(bl5 = object7.isEmpty())) {
                            boolean bl6;
                            bl5 = TextUtils.isEmpty((CharSequence)string4);
                            if (!bl5) {
                                object3.putString((String)object5, string4);
                            }
                            if (!(bl6 = TextUtils.isEmpty((CharSequence)string3))) {
                                object3.putString((String)object2, string3);
                            }
                            object3.putString(string2, (String)object4);
                            object2 = "_cis";
                            object4 = "ddp";
                            object3.putString((String)object2, (String)object4);
                            object2 = ((zzic)object).zzr;
                            object4 = "auto";
                            object5 = "_cmp";
                            ((zzju)object2).zzc((String)object4, (String)object5, (Bundle)object3);
                            object2 = ((zzic)object).zzv();
                            bl2 = TextUtils.isEmpty((CharSequence)object6);
                            if (!bl2 && (n3 = (int)(((zzpn)object2).zza((String)object6, d5) ? 1 : 0)) != 0) {
                                object3 = "android.google.analytics.action.DEEPLINK_ACTION";
                                object6 = new Intent((String)object3);
                                object2 = ((zzpn)object2).zza();
                                object2.sendBroadcast((Intent)object6);
                            }
                            return;
                        }
                    }
                    object2 = ((zzic)object).zzj();
                    object2 = ((zzgo)object2).zzr();
                    object3 = "Deferred Deep Link validation failed. gclid, gbraid, deep link";
                    ((zzgq)object2).zza((String)object3, object4, string4, object6);
                    return;
                }
                ((zzic)object).zzj().zzg().zza("Failed to parse the Deferred Deep Link response. exception", (Object)jSONException2);
                return;
            }
            ((zzic)object).zzj().zzc().zza("Deferred Deep Link response empty.");
            return;
        }
        object = ((zzic)object).zzj().zzr();
        object2 = n3;
        ((zzgq)object).zza("Network Request for Deferred Deep Link failed. response, exception", object2, object3);
    }

    private static void zza(zzjf object) {
        if (object != null) {
            return;
        }
        object = new IllegalStateException("Component not created");
        throw object;
    }

    private static void zza(zzji object) {
        if (object != null) {
            boolean bl2 = ((zzji)object).zzag();
            if (bl2) {
                return;
            }
            object = String.valueOf(object.getClass());
            object = "Component not initialized: ".concat((String)object);
            IllegalStateException illegalStateException = new IllegalStateException((String)object);
            throw illegalStateException;
        }
        object = new IllegalStateException("Component not created");
        throw object;
    }

    public final Context zza() {
        return this.zzc;
    }

    /*
     * WARNING - void declaration
     */
    public final void zza(zzdz object) {
        long l2;
        long l3;
        int n3;
        int n4;
        int n7;
        zzjm zzjm2;
        long l4;
        Object object2;
        Object object3;
        int n8;
        Object object4;
        boolean bl2;
        Object object5;
        Object object6;
        Object object7;
        block39: {
            block41: {
                block40: {
                    block38: {
                        zzha zzha2;
                        boolean bl3;
                        boolean bl4;
                        void var4_7;
                        this.zzl().zzv();
                        object7 = this.zzi;
                        object6 = zzbn.zzcl;
                        boolean n10 = ((zzai)object7).zza((zzfx)object6);
                        boolean bl5 = false;
                        object5 = null;
                        bl2 = true;
                        if (n10 && (object7 = this.zzr().zzac()) == (object4 = zzgf$zzo$zza.zzb)) {
                            boolean bl6 = true;
                        } else {
                            boolean bl7 = false;
                            object7 = null;
                        }
                        n8 = zzoy.zza();
                        if (n8 != 0 && (n8 = ((zzai)(object4 = this.zzi)).zza((zzfx)(object3 = zzbn.zzcq))) != 0 && (n8 = (int)(((zzpn)(object4 = this.zzv())).zzx() ? 1 : 0)) != 0 || var4_7 != false) {
                            object4 = this.zzv();
                            ((zzpn)object4).zzv();
                            object3 = new IntentFilter();
                            object3.addAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
                            object2 = ((zzpn)object4).zze();
                            bl4 = object2.zza((zzfx)object6);
                            if (bl4) {
                                object6 = "com.google.android.gms.measurement.BATCHES_AVAILABLE";
                                object3.addAction((String)object6);
                            }
                            object2 = ((zzjf)object4).zzu;
                            object6 = new zzq((zzic)object2);
                            object2 = ((zzpn)object4).zza();
                            int n14 = 2;
                            t70.registerReceiver((Context)object2, (BroadcastReceiver)object6, (IntentFilter)object3, n14);
                            object6 = ((zzpn)object4).zzj().zzc();
                            object4 = "Registered app receiver";
                            ((zzgq)object6).zza((String)object4);
                        }
                        bl4 = false;
                        object6 = null;
                        if (var4_7 != false) {
                            object7 = this.zzr();
                            object4 = (Long)zzbn.zzx.zza(null);
                            l4 = (Long)object4;
                            ((zzls)object7).zza(l4);
                        }
                        object7 = this.zzn().zzp();
                        n8 = ((zzjj)object7).zza();
                        object3 = this.zzi.zzc("google_analytics_default_allow_ad_storage", false);
                        object2 = this.zzi.zzc("google_analytics_default_allow_analytics_storage", false);
                        zzjm2 = zzjm.zza;
                        n7 = -10;
                        n4 = 30;
                        if (object3 == zzjm2 && object2 == zzjm2 || !(bl3 = (zzha2 = this.zzn()).zza(n7))) break block38;
                        object4 = zzjj.zza((zzjm)((Object)object3), (zzjm)((Object)object2), n7);
                        break block39;
                    }
                    object3 = this.zzh().zzah();
                    n3 = TextUtils.isEmpty((CharSequence)object3);
                    if (n3 != 0 || n8 != 0 && n8 != n4 && n8 != (n3 = 10) && n8 != n4 && n8 != n4 && n8 != (n3 = 40)) break block40;
                    object4 = this.zzp();
                    object3 = new zzjj(null, null, n7);
                    ((zzju)object4).zza((zzjj)object3, false);
                    break block41;
                }
                object4 = this.zzh().zzah();
                n8 = (int)(TextUtils.isEmpty((CharSequence)object4) ? 1 : 0);
                if (n8 != 0 && object != null && (object4 = ((zzdz)object).zzg) != null && (n8 = (int)(((zzha)(object4 = this.zzn())).zza(n4) ? 1 : 0)) != 0 && (n3 = (int)(((zzjj)(object4 = zzjj.zza(((zzdz)object).zzg, n4))).zzi() ? 1 : 0)) != 0) break block39;
            }
            n8 = 0;
            object4 = null;
        }
        if (object4 != null) {
            this.zzp().zza((zzjj)object4, bl2);
            object7 = object4;
        }
        this.zzp().zza((zzjj)object7);
        object7 = this.zzn().zzo();
        int n15 = ((zzbd)object7).zza();
        object4 = this.zzi;
        object3 = "google_analytics_default_allow_ad_personalization_signals";
        object4 = ((zzai)object4).zzc((String)object3, bl2);
        if (object4 != zzjm2) {
            object3 = this.zzj().zzq();
            object2 = "Default ad personalization consent from Manifest";
            ((zzgq)object3).zza((String)object2, object4);
        }
        object4 = this.zzi;
        object3 = "google_analytics_default_allow_ad_user_data";
        if ((object4 = ((zzai)object4).zzc((String)object3, bl2)) != zzjm2 && (n3 = (int)(zzjj.zza(n7, n15) ? 1 : 0)) != 0) {
            object = this.zzp();
            object7 = zzbd.zza((zzjm)((Object)object4), n7);
            ((zzju)object).zza((zzbd)object7, bl2);
        } else {
            object4 = this.zzh().zzah();
            n8 = (int)(TextUtils.isEmpty((CharSequence)object4) ? 1 : 0);
            if (n8 == 0 && (n15 == 0 || n15 == n4)) {
                object = this.zzp();
                object7 = new zzbd(null, n7);
                ((zzju)object).zza((zzbd)object7, bl2);
            } else {
                boolean bl8;
                boolean bl9;
                object4 = this.zzh().zzah();
                n8 = (int)(TextUtils.isEmpty((CharSequence)object4) ? 1 : 0);
                if (n8 != 0 && object != null && (object4 = ((zzdz)object).zzg) != null && (bl9 = zzjj.zza(n4, n15)) && (n8 = (int)(((zzbd)(object7 = zzbd.zza(((zzdz)object).zzg, n4))).zzg() ? 1 : 0)) != 0) {
                    object4 = this.zzp();
                    ((zzju)object4).zza((zzbd)object7, bl2);
                }
                if ((bl8 = TextUtils.isEmpty((CharSequence)(object7 = this.zzh().zzah()))) && object != null && (object7 = ((zzdz)object).zzg) != null && (object7 = this.zzn().zzh.zza()) == null && (object7 = zzbd.zza(((zzdz)object).zzg)) != null) {
                    object4 = this.zzp();
                    object = ((zzdz)object).zze;
                    object3 = "allow_personalized_ads";
                    object7 = ((Boolean)object7).toString();
                    ((zzju)object4).zza((String)object, (String)object3, object7, false);
                }
            }
        }
        object = this.zzi;
        object7 = "google_analytics_tcf_data_enabled";
        object = ((zzai)object).zze((String)object7);
        Object object8 = object == null ? 1 : (Boolean)object;
        if (object8 != 0) {
            object = this.zzj().zzc();
            object7 = "TCF client enabled.";
            ((zzgq)object).zza((String)object7);
            this.zzp().zzaw();
            object = this.zzp();
            ((zzju)object).zzau();
        }
        if ((object8 = (l3 = (l4 = ((zzhf)(object = this.zzn().zzc)).zza()) - (l2 = 0L)) == 0L ? 0 : (l3 < 0L ? -1 : 1)) == 0) {
            object = this.zzj().zzq();
            object7 = this.zza;
            object4 = "Persisting first open";
            ((zzgq)object).zza((String)object4, object7);
            object = this.zzn().zzc;
            l4 = this.zza;
            ((zzhf)object).zza(l4);
        }
        object = this.zzp().zza;
        ((zzu)object).zzb();
        object8 = this.zzah();
        if (object8 == 0) {
            object8 = this.zzae();
            if (object8 != 0) {
                object = this.zzv();
                object8 = ((zzpn)object).zze((String)(object7 = "android.permission.INTERNET"));
                if (object8 == 0) {
                    object = this.zzj().zzg();
                    object7 = "App is missing INTERNET permission";
                    ((zzgq)object).zza((String)object7);
                }
                if ((object8 = ((zzpn)(object = this.zzv())).zze((String)(object7 = "android.permission.ACCESS_NETWORK_STATE"))) == 0) {
                    object = this.zzj().zzg();
                    object7 = "App is missing ACCESS_NETWORK_STATE permission";
                    ((zzgq)object).zza((String)object7);
                }
                if ((object8 = ((PackageManagerWrapper)(object = Wrappers.packageManager(this.zzc))).isCallerInstantApp()) == 0 && (object8 = ((zzai)(object = this.zzi)).zzz()) == 0) {
                    object = this.zzc;
                    object8 = zzpn.zza((Context)object);
                    if (object8 == 0) {
                        object = this.zzj().zzg();
                        object7 = "AppMeasurementReceiver not registered/enabled";
                        ((zzgq)object).zza((String)object7);
                    }
                    if ((object8 = zzpn.zza((Context)(object = this.zzc), false)) == 0) {
                        object = this.zzj().zzg();
                        object7 = "AppMeasurementService not registered/enabled";
                        ((zzgq)object).zza((String)object7);
                    }
                }
                object = this.zzj().zzg();
                object7 = "Uploading is not possible. App measurement disabled";
                ((zzgq)object).zza((String)object7);
            }
        } else {
            object = this.zzh().zzah();
            object8 = TextUtils.isEmpty((CharSequence)object);
            if (object8 == 0 || (object8 = TextUtils.isEmpty((CharSequence)(object = this.zzh().zzae()))) == 0) {
                this.zzv();
                object = this.zzh().zzah();
                object7 = this.zzn().zzz();
                object5 = this.zzh().zzae();
                object4 = this.zzn().zzy();
                object8 = zzpn.zza((String)object, (String)object7, (String)object5, (String)object4);
                if (object8 != 0) {
                    object = this.zzj().zzp();
                    object7 = "Rechecking which service to use due to a GMP App Id change";
                    ((zzgq)object).zza((String)object7);
                    this.zzn().zzaa();
                    this.zzi().zzac();
                    this.zzw.zzah();
                    this.zzw.zzag();
                    object = this.zzn().zzc;
                    l4 = this.zza;
                    ((zzhf)object).zza(l4);
                    object = this.zzn().zze;
                    ((zzhh)object).zza(null);
                }
                object = this.zzn();
                object7 = this.zzh().zzah();
                ((zzha)object).zzc((String)object7);
                object = this.zzn();
                object7 = this.zzh().zzae();
                ((zzha)object).zzb((String)object7);
            }
            if ((object8 = ((zzjj)(object = this.zzn().zzp())).zza((zzjj$zza)((Object)(object7 = zzjj$zza.zzb)))) == 0) {
                object = this.zzn().zze;
                ((zzhh)object).zza(null);
            }
            object = this.zzp();
            object7 = this.zzn().zze.zza();
            ((zzju)object).zzb((String)object7);
            object = this.zzv();
            object8 = ((zzpn)object).zzy();
            if (object8 == 0 && (object8 = TextUtils.isEmpty((CharSequence)(object = this.zzn().zzq.zza()))) == 0) {
                object = this.zzj().zzr();
                object7 = "Remote config removed with active feature rollouts";
                ((zzgq)object).zza((String)object7);
                object = this.zzn().zzq;
                ((zzhh)object).zza(null);
            }
            if ((object8 = TextUtils.isEmpty((CharSequence)(object = this.zzh().zzah()))) == 0 || (object8 = TextUtils.isEmpty((CharSequence)(object = this.zzh().zzae()))) == 0) {
                boolean bl10;
                object8 = this.zzae();
                object7 = this.zzn();
                boolean bl11 = ((zzha)object7).zzac();
                if (!bl11 && !(bl10 = ((zzai)(object7 = this.zzi)).zzy())) {
                    object7 = this.zzn();
                    boolean bl12 = object8 ^ true;
                    ((zzha)object7).zzb(bl12);
                }
                if (object8 != 0) {
                    object = this.zzp();
                    ((zzju)object).zzap();
                }
                this.zzu().zza.zza();
                object = this.zzt();
                object7 = new AtomicReference();
                ((zzme)object).zza((AtomicReference)object7);
                object = this.zzt();
                object7 = this.zzn().zzt.zza();
                ((zzme)object).zza((Bundle)object7);
            }
        }
        if ((object8 = zzoy.zza()) != 0 && (object8 = ((zzai)(object = this.zzi)).zza((zzfx)(object7 = zzbn.zzcq))) != 0 && (object8 = ((zzpn)(object = this.zzv())).zzx()) != 0) {
            object = zzbn.zzbr;
            object7 = (Integer)((zzfx)object).zza(null);
            int n16 = (Integer)object7;
            if (n16 > 0) {
                long l7 = (long)((Integer)((zzfx)object).zza(null)).intValue() * 1000L;
                object = new Random();
                int n17 = 5000;
                l4 = ((Random)object).nextInt(n17);
                l7 += l4;
                object = this.zzp;
                l4 = object.elapsedRealtime();
                l7 -= l4;
                l4 = 500L;
                long l8 = (l7 = Math.max(l4, l7)) - l4;
                object8 = l8 == 0L ? 0 : (l8 < 0L ? -1 : 1);
                if (object8 > 0) {
                    object = this.zzj().zzq();
                    object5 = l7;
                    object4 = "Waiting to fetch trigger URIs until some time after boot. Delay in millis";
                    ((zzgq)object).zza((String)object4, object5);
                }
                object = this.zzp();
                ((zzju)object).zzc(l7);
            } else {
                object7 = this.zzp();
                Objects.requireNonNull(object7);
                object6 = new zzib((zzju)object7);
                object = new Thread((Runnable)object6);
                ((Thread)object).start();
            }
        }
        this.zzn().zzj.zza(bl2);
    }

    public final void zza(boolean bl2) {
        Boolean bl3;
        this.zzad = bl3 = Boolean.valueOf(bl2);
    }

    public final void zzaa() {
        IllegalStateException illegalStateException = new IllegalStateException("Unexpected call on client side");
        throw illegalStateException;
    }

    public final void zzab() {
        this.zzaj.incrementAndGet();
    }

    public final void zzac() {
        int n3;
        this.zzah = n3 = this.zzah + 1;
    }

    public final boolean zzad() {
        boolean bl2;
        Boolean bl3 = this.zzad;
        return bl3 != null && (bl2 = (bl3 = this.zzad).booleanValue());
    }

    public final boolean zzae() {
        int n3 = this.zzc();
        return n3 == 0;
    }

    public final boolean zzaf() {
        this.zzl().zzv();
        return this.zzag;
    }

    public final boolean zzag() {
        return TextUtils.isEmpty((CharSequence)this.zzd);
    }

    public final boolean zzah() {
        block7: {
            block9: {
                String string2;
                long l2;
                Object object;
                boolean bl2;
                block8: {
                    long l3;
                    long l4;
                    long l7;
                    long l8;
                    bl2 = this.zzaa;
                    if (!bl2) break block7;
                    this.zzl().zzv();
                    object = this.zzab;
                    if (object == null || (l8 = (l7 = (l4 = this.zzac) - (l3 = 0L)) == 0L ? 0 : (l7 < 0L ? -1 : 1)) == false) break block8;
                    if (object == null || (bl2 = ((Boolean)object).booleanValue())) break block9;
                    object = this.zzp;
                    l2 = object.elapsedRealtime();
                    long l12 = this.zzac;
                    long l14 = (l2 = Math.abs(l2 - l12)) - (l12 = 1000L);
                    Object object2 = l14 == 0L ? 0 : (l14 < 0L ? -1 : 1);
                    if (object2 <= 0) break block9;
                }
                this.zzac = l2 = this.zzp.elapsedRealtime();
                object = this.zzv();
                String string3 = "android.permission.INTERNET";
                bl2 = ((zzpn)object).zze(string3);
                boolean bl3 = true;
                if (bl2 && (bl2 = ((zzpn)(object = this.zzv())).zze(string2 = "android.permission.ACCESS_NETWORK_STATE")) && ((bl2 = ((PackageManagerWrapper)(object = Wrappers.packageManager(this.zzc))).isCallerInstantApp()) || (bl2 = ((zzai)(object = this.zzi)).zzz()) || (bl2 = zzpn.zza((Context)(object = this.zzc))) && (bl2 = zzpn.zza((Context)(object = this.zzc), false)))) {
                    bl2 = true;
                } else {
                    bl2 = false;
                    object = null;
                }
                this.zzab = object = Boolean.valueOf(bl2);
                bl2 = (Boolean)object;
                if (bl2) {
                    String string4;
                    object = this.zzv();
                    bl2 = ((zzpn)object).zza(string2 = this.zzh().zzah(), string4 = this.zzh().zzae());
                    if (!bl2 && (bl2 = TextUtils.isEmpty((CharSequence)(object = this.zzh().zzae())))) {
                        bl3 = false;
                        string3 = null;
                    }
                    this.zzab = object = Boolean.valueOf(bl3);
                }
            }
            return this.zzab;
        }
        IllegalStateException illegalStateException = new IllegalStateException("AppMeasurement is not initialized");
        throw illegalStateException;
    }

    public final boolean zzai() {
        return this.zzg;
    }

    public final boolean zzaj() {
        this.zzl().zzv();
        zzic.zza(this.zzq());
        Object object = this.zzh().zzaf();
        Object object2 = this.zzi;
        boolean n3 = ((zzai)object2).zzw();
        boolean bl2 = false;
        if (!n3) {
            this.zzj().zzq().zza("ADID collection is disabled from Manifest. Skipping");
            return false;
        }
        object2 = this.zzn().zza((String)object);
        Object object3 = (Boolean)((Pair)object2).second;
        boolean bl3 = (Boolean)object3;
        if (!bl3 && !(bl3 = TextUtils.isEmpty((CharSequence)(object3 = (CharSequence)((Pair)object2).first)))) {
            Object object4;
            int n4;
            Object object5;
            Object object6;
            Object object7;
            int n7;
            int n8;
            int n10;
            object3 = this.zzq();
            bl3 = ((zzlp)object3).zzc();
            if (!bl3) {
                this.zzj().zzr().zza("Network is not available for Deferred Deep Link request. Skipping");
                return false;
            }
            object3 = new StringBuilder();
            Object object8 = this.zzt();
            ((zzme)object8).zzv();
            ((zzf)object8).zzw();
            boolean bl4 = ((zzme)object8).zzap();
            if (!bl4 || (n10 = ((zzpn)(object8 = ((zzme)object8).zzs())).zzg()) >= (n8 = 234200)) {
                int n14;
                object8 = this.zzp().zzac();
                if (object8 != null) {
                    object8 = ((zzap)object8).zza;
                } else {
                    n10 = 0;
                    object8 = null;
                }
                boolean bl5 = true;
                if (object8 == null) {
                    int n15;
                    int n16 = this.zzai;
                    this.zzai = n15 = n16 + 1;
                    int n17 = 10;
                    if (n16 < n17) {
                        bl2 = true;
                    }
                    object = this.zzj().zzc();
                    object2 = bl2 ? "Retrying." : "Skipping.";
                    object2 = cP.a("Failed to retrieve DMA consent from the service, ", (String)object2, " retryCount");
                    object3 = this.zzai;
                    ((zzgq)object).zza((String)object2, object3);
                    return bl2;
                }
                n7 = 100;
                object7 = zzjj.zza((Bundle)object8, n7);
                ((StringBuilder)object3).append("&gcs=");
                object7 = ((zzjj)object7).zze();
                ((StringBuilder)object3).append((String)object7);
                object6 = zzbd.zza((Bundle)object8, n7);
                ((StringBuilder)object3).append("&dma=");
                object7 = ((zzbd)object6).zzd();
                object5 = Boolean.FALSE;
                if (object7 == object5) {
                    n4 = 0;
                    object7 = null;
                } else {
                    n4 = 1;
                }
                ((StringBuilder)object3).append(n4);
                object7 = ((zzbd)object6).zze();
                n4 = (int)(TextUtils.isEmpty((CharSequence)object7) ? 1 : 0);
                if (n4 == 0) {
                    object7 = "&dma_cps=";
                    ((StringBuilder)object3).append((String)object7);
                    object6 = ((zzbd)object6).zze();
                    ((StringBuilder)object3).append((String)object6);
                }
                if ((object8 = zzbd.zza((Bundle)object8)) == (object6 = Boolean.TRUE)) {
                    n14 = 0;
                    object4 = null;
                }
                ((StringBuilder)object3).append("&npa=");
                ((StringBuilder)object3).append(n14);
                object8 = this.zzj().zzq();
                object4 = "Consent query parameters to Bow";
                ((zzgq)object8).zza((String)object4, object3);
            }
            object8 = this.zzv();
            this.zzh();
            object6 = object2 = ((Pair)object2).first;
            object6 = (String)object2;
            long l2 = this.zzn().zzp.zza() - 1L;
            Object object9 = ((StringBuilder)object3).toString();
            long l3 = 114010L;
            object2 = object8;
            object4 = object;
            object4 = ((zzpn)object8).zza(l3, (String)object, (String)object6, l2, (String)object9);
            if (object4 != null) {
                zzlr zzlr2;
                object3 = this.zzq();
                object5 = new zzie(this);
                ((zzji)object3).zzad();
                Preconditions.checkNotNull(object4);
                Preconditions.checkNotNull(object5);
                object9 = ((zzlp)object3).zzl();
                n7 = 0;
                object6 = null;
                n4 = 0;
                object7 = null;
                object2 = zzlr2;
                object8 = object;
                zzlr2 = new zzlr((zzlp)object3, (String)object, (URL)object4, null, null, (zzlo)object5);
                ((zzhv)object9).zza(zzlr2);
            }
            return false;
        }
        this.zzj().zzq().zza("ADID unavailable to retrieve Deferred Deep Link. Skipping");
        return false;
    }

    public final Clock zzb() {
        return this.zzp;
    }

    public final void zzb(boolean bl2) {
        this.zzl().zzv();
        this.zzag = bl2;
    }

    public final int zzc() {
        this.zzl().zzv();
        Object object = this.zzi;
        boolean bl2 = ((zzai)object).zzy();
        if (bl2) {
            return 1;
        }
        object = this.zzaf;
        if (object != null && (bl2 = ((Boolean)object).booleanValue())) {
            return 2;
        }
        bl2 = this.zzaf();
        if (!bl2) {
            return 8;
        }
        object = this.zzn().zzw();
        if (object != null) {
            bl2 = (Boolean)object;
            if (bl2) {
                return 0;
            }
            return 3;
        }
        object = this.zzi;
        String string2 = "firebase_analytics_collection_enabled";
        if ((object = ((zzai)object).zze(string2)) != null) {
            bl2 = (Boolean)object;
            if (bl2) {
                return 0;
            }
            return 4;
        }
        object = this.zzae;
        if (object != null) {
            bl2 = (Boolean)object;
            if (bl2) {
                return 0;
            }
            return 5;
        }
        object = this.zzad;
        if (object != null) {
            object = this.zzad;
            bl2 = (Boolean)object;
            if (bl2) {
                return 0;
            }
            return 7;
        }
        return 0;
    }

    public final zzaf zzd() {
        return this.zzh;
    }

    public final zza zze() {
        zzic.zza(this.zzs);
        return this.zzs;
    }

    public final zzai zzf() {
        return this.zzi;
    }

    public final zzbf zzg() {
        zzic.zza(this.zzx);
        return this.zzx;
    }

    public final zzgg zzh() {
        zzic.zza(this.zzy);
        return this.zzy;
    }

    public final zzgj zzi() {
        zzic.zza(this.zzv);
        return this.zzv;
    }

    public final zzgo zzj() {
        zzic.zza(this.zzk);
        return this.zzk;
    }

    public final zzgl zzk() {
        return this.zzo;
    }

    public final zzhv zzl() {
        zzic.zza(this.zzl);
        return this.zzl;
    }

    public final zzgo zzm() {
        boolean bl2;
        zzgo zzgo2 = this.zzk;
        if (zzgo2 != null && (bl2 = zzgo2.zzag())) {
            return this.zzk;
        }
        return null;
    }

    public final zzha zzn() {
        zzic.zza((zzjf)this.zzj);
        return this.zzj;
    }

    public final zzhv zzo() {
        return this.zzl;
    }

    public final zzju zzp() {
        zzic.zza(this.zzr);
        return this.zzr;
    }

    public final zzlp zzq() {
        zzic.zza(this.zzt);
        return this.zzt;
    }

    public final zzls zzr() {
        zzic.zza((zzg)this.zzz);
        return this.zzz;
    }

    public final zzlz zzs() {
        zzic.zza(this.zzq);
        return this.zzq;
    }

    public final zzme zzt() {
        zzic.zza(this.zzw);
        return this.zzw;
    }

    public final zznx zzu() {
        zzic.zza(this.zzm);
        return this.zzm;
    }

    public final zzpn zzv() {
        zzic.zza((zzjf)this.zzn);
        return this.zzn;
    }

    public final String zzw() {
        return this.zzd;
    }

    public final String zzx() {
        return this.zze;
    }

    public final String zzy() {
        return this.zzf;
    }

    public final String zzz() {
        return this.zzu;
    }
}

