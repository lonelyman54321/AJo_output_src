/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.pm.ApplicationInfo
 *  android.content.pm.PackageManager$NameNotFoundException
 *  android.text.TextUtils
 */
package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.wrappers.InstantApps;
import com.google.android.gms.internal.measurement.zzgf$zzo$zza;
import com.google.android.gms.internal.measurement.zzoy;
import com.google.android.gms.internal.measurement.zzpq;
import com.google.android.gms.measurement.internal.zzai;
import com.google.android.gms.measurement.internal.zzbd;
import com.google.android.gms.measurement.internal.zzbn;
import com.google.android.gms.measurement.internal.zzd;
import com.google.android.gms.measurement.internal.zzf;
import com.google.android.gms.measurement.internal.zzfx;
import com.google.android.gms.measurement.internal.zzgo;
import com.google.android.gms.measurement.internal.zzgq;
import com.google.android.gms.measurement.internal.zzha;
import com.google.android.gms.measurement.internal.zzhf;
import com.google.android.gms.measurement.internal.zzhw;
import com.google.android.gms.measurement.internal.zzic;
import com.google.android.gms.measurement.internal.zzjf;
import com.google.android.gms.measurement.internal.zzjj;
import com.google.android.gms.measurement.internal.zzjj$zza;
import com.google.android.gms.measurement.internal.zzjm;
import com.google.android.gms.measurement.internal.zzp;
import com.google.android.gms.measurement.internal.zzpn;
import java.lang.reflect.Method;
import java.math.BigInteger;
import java.util.List;
import java.util.Locale;

public final class zzgg
extends zzf {
    private String zza;
    private String zzb;
    private int zzc;
    private String zzd;
    private String zze;
    private long zzf;
    private long zzg;
    private List zzh;
    private String zzi;
    private int zzj;
    private String zzk;
    private String zzl;
    private String zzm;
    private long zzn = 0L;
    private String zzo = null;

    public zzgg(zzic zzic2, long l2) {
        super(zzic2);
        this.zzg = l2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final String zzak() {
        Object object3;
        Object object;
        Class<?> clazz;
        Object object2 = null;
        int n3 = 1;
        boolean bl2 = zzpq.zza();
        if (bl2 && (bl2 = ((zzai)((Object)(clazz = this.zze()))).zza((zzfx)(object = zzbn.zzcb)))) {
            this.zzj().zzq().zza("Disabled IID for tests.");
            return null;
        }
        try {
            clazz = this.zza();
            clazz = clazz.getClassLoader();
            object = "com.google.firebase.analytics.FirebaseAnalytics";
            clazz = ((ClassLoader)((Object)clazz)).loadClass((String)object);
            if (clazz == null) {
                return null;
            }
            object = "getInstance";
        }
        catch (ClassNotFoundException classNotFoundException) {
            return null;
        }
        try {
            Class<Context> clazz2;
            Context context = new Class[n3];
            context[0] = clazz2 = Context.class;
            object = clazz.getDeclaredMethod((String)object, (Class<?>)context);
            context = this.zza();
            object3 = new Object[n3];
            object3[0] = context;
            object2 = ((Method)object).invoke(null, (Object[])object3);
            if (object2 == null) {
                return null;
            }
            object3 = "getFirebaseInstanceId";
        }
        catch (Exception exception) {
            object2 = this.zzj().zzx();
            String string2 = "Failed to obtain Firebase Analytics instance";
            ((zzgq)object2).zza(string2);
            return null;
        }
        try {
            object3 = clazz.getDeclaredMethod((String)object3, null);
            object2 = ((Method)object3).invoke(object2, null);
            return (String)object2;
        }
        catch (Exception exception) {
            this.zzj().zzw().zza("Failed to retrieve Firebase Instance Id");
            return null;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public final zzp zza(String string2) {
        zzp zzp2;
        int n3;
        long l2;
        zzfx zzfx2;
        int n4;
        zzfx zzfx3;
        long l3;
        long l4;
        Object object;
        long l7;
        boolean bl2;
        boolean bl3;
        long l8;
        Object object2;
        zzgg zzgg2 = this;
        this.zzv();
        String string3 = this.zzaf();
        String string4 = this.zzah();
        this.zzw();
        String string5 = this.zzb;
        long l12 = this.zzad();
        this.zzw();
        Object object3 = this.zzd;
        Preconditions.checkNotNull(object3);
        String string6 = this.zzd;
        this.zzw();
        this.zzv();
        long l14 = this.zzf;
        long l15 = 0L;
        long l16 = l14 == l15 ? 0 : (l14 < l15 ? -1 : 1);
        if (l16 == false) {
            object3 = this.zzu.zzv();
            object2 = this.zza();
            String string7 = this.zza().getPackageName();
            this.zzf = l14 = ((zzpn)object3).zza((Context)object2, string7);
        }
        long l17 = zzgg2.zzf;
        boolean bl4 = zzgg2.zzu.zzae();
        boolean bl5 = this.zzk().zzm ^ true;
        this.zzv();
        object3 = zzgg2.zzu;
        l16 = (long)((zzic)object3).zzae();
        Object object4 = l16 == false ? null : (object3 = this.zzak());
        object3 = zzgg2.zzu;
        zzhf zzhf2 = ((zzic)object3).zzn().zzc;
        l14 = zzhf2.zza();
        long l18 = l14 == l15 ? 0 : (l14 < l15 ? -1 : 1);
        if (l18 == false) {
            l14 = ((zzic)object3).zza;
        } else {
            l15 = ((zzic)object3).zza;
            l14 = Math.min(l15, l14);
        }
        long l19 = l14;
        int n7 = this.zzac();
        boolean bl6 = this.zze().zzw();
        object3 = this.zzk();
        ((zzjf)object3).zzv();
        object3 = ((zzha)object3).zzg();
        boolean bl7 = false;
        Object var17_16 = null;
        boolean bl8 = object3.getBoolean("deferred_analytics_collection", false);
        String string8 = this.zzae();
        object3 = this.zze();
        object2 = "google_analytics_default_allow_ad_personalization_signals";
        boolean bl9 = true;
        object3 = ((zzai)object3).zzc((String)object2, bl9);
        zzjm zzjm2 = zzjm.zzd;
        if (object3 != zzjm2) {
            bl9 = true;
        } else {
            bl9 = false;
            zzjm2 = null;
        }
        Object object5 = bl9;
        l15 = zzgg2.zzg;
        object3 = zzgg2.zzh;
        zzjj zzjj2 = this.zzk().zzp();
        Object object6 = zzjj2.zzf();
        String string9 = zzgg2.zzi;
        if (string9 == null) {
            String string10;
            zzgg2.zzi = string10 = this.zzs().zzq();
        }
        String string11 = zzgg2.zzi;
        Object object7 = this.zzk();
        Object object8 = object3;
        object3 = ((zzha)object7).zzp();
        object7 = string11;
        zzjj$zza zzjj$zza = zzjj$zza.zzb;
        l16 = (long)((zzjj)object3).zza(zzjj$zza);
        if (l16 == false) {
            l8 = l15;
            bl3 = bl4;
            bl2 = bl5;
            l7 = 0L;
            object = null;
        } else {
            this.zzv();
            l8 = l15;
            l4 = zzgg2.zzn;
            l7 = 0L;
            l16 = l4 == l7 ? 0 : (l4 < l7 ? -1 : 1);
            if (l16 != false) {
                long l20;
                l4 = this.zzb().currentTimeMillis();
                bl3 = bl4;
                bl2 = bl5;
                l3 = zzgg2.zzn;
                l4 -= l3;
                object3 = zzgg2.zzm;
                if (object3 != null && (l16 = (l20 = l4 - (l3 = 86400000L)) == 0L ? 0 : (l20 < 0L ? -1 : 1)) > 0 && (object3 = zzgg2.zzo) == null) {
                    this.zzaj();
                }
            } else {
                bl3 = bl4;
                bl2 = bl5;
            }
            if ((object3 = zzgg2.zzm) == null) {
                this.zzaj();
            }
            object = object3 = zzgg2.zzm;
        }
        boolean bl10 = this.zze().zzab();
        object3 = this.zzs();
        String string12 = this.zzaf();
        long l21 = ((zzpn)object3).zzc(string12);
        int n8 = this.zzk().zzp().zza();
        object3 = this.zzk().zzo();
        String string13 = ((zzbd)object3).zzf();
        l16 = (long)zzoy.zza();
        if (l16 != false && (l16 = (long)((zzai)(object3 = this.zze())).zza(zzfx3 = zzbn.zzcq)) != false) {
            this.zzs();
            l16 = zzpn.zzc();
            n4 = l16;
        } else {
            n4 = 0;
        }
        l16 = (long)zzoy.zza();
        if (l16 != false && (l16 = (long)((zzai)(object3 = this.zze())).zza(zzfx2 = zzbn.zzcq)) != false) {
            object3 = this.zzs();
            l2 = l4 = ((zzpn)object3).zzm();
        } else {
            l2 = l7;
        }
        String string14 = this.zze().zzr();
        object3 = this.zze();
        bl7 = true;
        object3 = ((zzai)object3).zzc((String)object2, bl7);
        object2 = new zzd((zzjm)((Object)object3));
        String string15 = ((zzd)object2).zzb();
        l3 = zzgg2.zzu.zza;
        object3 = this.zze();
        object2 = zzbn.zzcl;
        l16 = (long)((zzai)object3).zza((zzfx)object2);
        if (l16 != false) {
            object3 = this.zzo().zzac();
            l16 = ((zzgf$zzo$zza)object3).zza();
            n3 = l16;
        } else {
            n3 = 0;
        }
        object3 = zzp2;
        l15 = l17;
        bl4 = bl2;
        l18 = (long)bl6;
        String string16 = string8;
        Boolean bl11 = object5;
        string8 = object6;
        object5 = object7;
        object6 = object;
        return new zzp(string3, string4, string5, l12, string6, 114010L, l17, string2, bl3, bl2, (String)object4, l19, n7, bl6, bl8, string16, bl11, l8, (List)object8, null, string8, (String)object7, (String)object, bl10, l21, n8, string13, n4, l2, string14, string15, l3, n3);
    }

    public final boolean zzab() {
        return true;
    }

    public final int zzac() {
        this.zzw();
        return this.zzj;
    }

    public final int zzad() {
        this.zzw();
        return this.zzc;
    }

    public final String zzae() {
        this.zzw();
        return this.zzl;
    }

    public final String zzaf() {
        this.zzw();
        Preconditions.checkNotNull(this.zza);
        return this.zza;
    }

    public final String zzag() {
        this.zzw();
        Preconditions.checkNotNull(this.zze);
        return this.zze;
    }

    public final String zzah() {
        this.zzv();
        this.zzw();
        Preconditions.checkNotNull(this.zzk);
        return this.zzk;
    }

    public final List zzai() {
        return this.zzh;
    }

    public final void zzaj() {
        long l2;
        Object object;
        int n3 = 1;
        this.zzv();
        Object object2 = this.zzk().zzp();
        Object object3 = zzjj$zza.zzb;
        boolean bl2 = ((zzjj)object2).zza((zzjj$zza)((Object)object3));
        if (!bl2) {
            object = this.zzj().zzc();
            object2 = "Analytics Storage consent is not granted";
            object.zza((String)object2);
            n3 = 0;
            object = null;
        } else {
            object2 = new byte[16];
            this.zzs().zzw().nextBytes((byte[])object2);
            object3 = Locale.US;
            BigInteger bigInteger = new BigInteger(n3, (byte[])object2);
            object = new Object[n3];
            bl2 = false;
            object[0] = bigInteger;
            object2 = "%032x";
            object = String.format((Locale)object3, (String)object2, object);
        }
        object2 = this.zzj().zzc();
        object3 = object == null ? "null" : "not null";
        object3 = "Resetting session stitching token to ".concat((String)object3);
        ((zzgq)object2).zza((String)object3);
        this.zzm = object;
        this.zzn = l2 = this.zzb().currentTimeMillis();
    }

    public final boolean zzb(String string2) {
        boolean bl2;
        String string3 = this.zzo;
        if (string3 != null && !(bl2 = string3.equals(string2))) {
            bl2 = true;
        } else {
            bl2 = false;
            string3 = null;
        }
        this.zzo = string2;
        return bl2;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzz() {
        block40: {
            block41: {
                block39: {
                    block38: {
                        block37: {
                            block36: {
                                block35: {
                                    block34: {
                                        var1_1 = this.zza().getPackageName();
                                        var2_2 = this.zza().getPackageManager();
                                        var3_3 = "";
                                        var4_5 = "unknown";
                                        var5_6 = "Unknown";
                                        var6_7 = -1 << -1;
                                        if (var2_2 == null) {
                                            var7_8 = this.zzj().zzg();
                                            var8_9 = "PackageManager is null, app identity information might be inaccurate. appId";
                                            var9_10 = zzgo.zza((String)var1_1);
                                            var7_8.zza((String)var8_9, var9_10);
                                        } else {
                                            try {
                                                var4_5 = var2_2.getInstallerPackageName((String)var1_1);
                                            }
                                            catch (IllegalArgumentException v0) {
                                                var7_8 = this.zzj().zzg();
                                                var8_9 = "Error retrieving app installer package name. appId";
                                                var9_10 = zzgo.zza((String)var1_1);
                                                var7_8.zza((String)var8_9, var9_10);
                                            }
                                            if (var4_5 == null) {
                                                var4_5 = "manual_install";
                                            } else {
                                                var7_8 = "com.android.vending";
                                                var10_11 = var7_8.equals(var4_5);
                                                if (var10_11) {
                                                    var4_5 = var3_3;
                                                }
                                            }
                                            try {
                                                var7_8 = this.zza();
                                                var7_8 = var7_8.getPackageName();
                                                if ((var7_8 = var2_2.getPackageInfo((String)var7_8, 0)) == null) break block34;
                                                var8_9 = var7_8.applicationInfo;
                                                var11_12 = TextUtils.isEmpty((CharSequence)(var8_9 = var2_2.getApplicationLabel((ApplicationInfo)var8_9)));
                                                var8_9 = !var11_12 ? var8_9.toString() : var5_6;
                                                break block35;
                                            }
                                            catch (PackageManager.NameNotFoundException v1) {
                                                var7_8 = var5_6;
                                                break block36;
                                            }
                                        }
                                    }
                                    var8_9 = var5_6;
                                    break block37;
                                }
                                try {
                                    var5_6 = var7_8.versionName;
                                    var6_7 = var7_8.versionCode;
                                    break block37;
                                }
                                catch (PackageManager.NameNotFoundException v2) {
                                    var7_8 = var5_6;
                                    var5_6 = var8_9;
                                }
                            }
                            var8_9 = this.zzj().zzg();
                            var9_10 = "Error retrieving package info. appId, appName";
                            var12_13 = zzgo.zza((String)var1_1);
                            var8_9.zza((String)var9_10, var12_13, var5_6);
                            var8_9 = var5_6;
                            var5_6 = var7_8;
                        }
                        this.zza = var1_1;
                        this.zzd = var4_5;
                        this.zzb = var5_6;
                        this.zzc = var6_7;
                        this.zze = var8_9;
                        this.zzf = var13_14 = 0L;
                        var4_5 = this.zzu.zzw();
                        var15_15 = TextUtils.isEmpty((CharSequence)var4_5);
                        var16_16 = true;
                        if (!var15_15 && (var15_15 = (var17_17 = "am").equals(var4_5 = this.zzu.zzx()))) {
                            var15_15 = true;
                        } else {
                            var15_15 = false;
                            var4_5 = null;
                        }
                        var17_17 = this.zzu;
                        var6_7 = var17_17.zzc();
                        switch (var6_7) {
                            default: {
                                this.zzj().zzp().zza("App measurement disabled");
                                var7_8 = this.zzj().zzo();
                                var8_9 = "Invalid scion state in identity";
                                var7_8.zza((String)var8_9);
                                break;
                            }
                            case 8: {
                                var7_8 = this.zzj().zzp();
                                var8_9 = "App measurement disabled due to denied storage consent";
                                var7_8.zza((String)var8_9);
                                break;
                            }
                            case 7: {
                                var7_8 = this.zzj().zzp();
                                var8_9 = "App measurement disabled via the global data collection setting";
                                var7_8.zza((String)var8_9);
                                break;
                            }
                            case 6: {
                                var7_8 = this.zzj().zzw();
                                var8_9 = "App measurement deactivated via resources. This method is being deprecated. Please refer to https://firebase.google.com/support/guides/disable-analytics";
                                var7_8.zza((String)var8_9);
                                break;
                            }
                            case 5: {
                                var7_8 = this.zzj().zzq();
                                var8_9 = "App measurement disabled via the init parameters";
                                var7_8.zza((String)var8_9);
                                break;
                            }
                            case 4: {
                                var7_8 = this.zzj().zzp();
                                var8_9 = "App measurement disabled via the manifest";
                                var7_8.zza((String)var8_9);
                                break;
                            }
                            case 3: {
                                var7_8 = this.zzj().zzp();
                                var8_9 = "App measurement disabled by setAnalyticsCollectionEnabled(false)";
                                var7_8.zza((String)var8_9);
                                break;
                            }
                            case 2: {
                                var7_8 = this.zzj().zzq();
                                var8_9 = "App measurement deactivated via the init parameters";
                                var7_8.zza((String)var8_9);
                                break;
                            }
                            case 1: {
                                var7_8 = this.zzj().zzp();
                                var8_9 = "App measurement deactivated via the manifest";
                                var7_8.zza((String)var8_9);
                                break;
                            }
                            case 0: {
                                var7_8 = this.zzj().zzq();
                                var8_9 = "App measurement collection enabled";
                                var7_8.zza((String)var8_9);
                            }
                        }
                        if (var6_7 != 0) {
                            var16_16 = false;
                            var5_6 = null;
                        }
                        this.zzk = var3_3;
                        this.zzl = var3_3;
                        if (var15_15) {
                            var4_5 = this.zzu.zzw();
                            this.zzl = var4_5;
                        }
                        try {
                            var4_5 = this.zza();
                            var17_17 = this.zzu;
                            var17_17 = var17_17.zzz();
                            var7_8 = "google_app_id";
                            var8_9 = new zzhw((Context)var4_5, (String)var17_17);
                            var4_5 = var8_9.zza((String)var7_8);
                            var6_7 = (int)TextUtils.isEmpty((CharSequence)var4_5);
                            if (var6_7 == 0) {
                                var3_3 = var4_5;
                            }
                            this.zzk = var3_3;
                            var18_18 = TextUtils.isEmpty((CharSequence)var4_5);
                            if (var18_18) break block38;
                            var4_5 = this.zza();
                            var17_17 = this.zzu;
                            var17_17 = var17_17.zzz();
                            var3_3 = new zzhw((Context)var4_5, (String)var17_17);
                            var4_5 = "admob_app_id";
                            this.zzl = var3_3 = var3_3.zza((String)var4_5);
                        }
                        catch (IllegalStateException var3_4) {
                            break block39;
                        }
                    }
                    if (var16_16) {
                        var3_3 = this.zzj();
                        var3_3 = var3_3.zzq();
                        var4_5 = "App measurement enabled for app package, google app id";
                        var5_6 = this.zza;
                        var17_17 = this.zzk;
                        var6_7 = (int)TextUtils.isEmpty((CharSequence)var17_17);
                        var17_17 = var6_7 != 0 ? this.zzl : this.zzk;
                        var3_3.zza((String)var4_5, var5_6, var17_17);
                    }
                    break block41;
                }
                var4_5 = this.zzj().zzg();
                var5_6 = "Fetching Google App Id failed with exception. appId";
                var1_1 = zzgo.zza((String)var1_1);
                var4_5.zza((String)var5_6, var1_1, var3_4);
            }
            var19_19 = 0;
            this.zzh = null;
            var1_1 = this.zze();
            var3_3 = "analytics.safelisted_events";
            if ((var1_1 = var1_1.zzg((String)var3_3)) == null) ** GOTO lbl190
            var18_18 = var1_1.isEmpty();
            if (var18_18) {
                var1_1 = this.zzj().zzw();
                var3_3 = "Safelisted event list is empty. Ignoring";
                var1_1.zza((String)var3_3);
            } else {
                var3_3 = var1_1.iterator();
                while (var15_15 = var3_3.hasNext()) {
                    var4_5 = (String)var3_3.next();
                    var5_6 = this.zzs();
                    var15_15 = var5_6.zzb((String)(var17_17 = "safelisted event"), (String)var4_5);
                    if (var15_15) continue;
                    break block40;
                }
lbl190:
                // 2 sources

                this.zzh = var1_1;
            }
        }
        if (var2_2 != null) {
            this.zzj = var19_19 = InstantApps.isInstantApp(this.zza());
            return;
        }
        this.zzj = 0;
    }
}

