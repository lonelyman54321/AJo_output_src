/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.net.Uri
 *  android.text.TextUtils
 */
package com.google.android.gms.analytics;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.analytics.ExceptionReporter;
import com.google.android.gms.analytics.zzu;
import com.google.android.gms.analytics.zzv;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.internal.gtm.zzbh;
import com.google.android.gms.internal.gtm.zzbp;
import com.google.android.gms.internal.gtm.zzbr;
import com.google.android.gms.internal.gtm.zzbu;
import com.google.android.gms.internal.gtm.zzce;
import com.google.android.gms.internal.gtm.zzcw;
import com.google.android.gms.internal.gtm.zzem;
import com.google.android.gms.internal.gtm.zzeo;
import com.google.android.gms.internal.gtm.zzfe;
import com.google.android.gms.internal.gtm.zzff;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Random;

public class Tracker
extends zzbr {
    private boolean zza;
    private final Map zzb;
    private final Map zzc;
    private final zzem zzd;
    private final zzv zze;
    private ExceptionReporter zzf;
    private zzfe zzg;

    public Tracker(zzbu zzbu2, String object, zzem hashMap) {
        super(zzbu2);
        this.zzb = hashMap = new HashMap<Object, String>();
        Object object2 = new HashMap();
        this.zzc = object2;
        if (object != null) {
            object2 = "&tid";
            hashMap.put(object2, (String)object);
        }
        hashMap.put("useSecure", "1");
        object = new Random();
        object = Integer.toString(((Random)object).nextInt(-1 >>> 1) + 1);
        hashMap.put("&a", (String)object);
        Clock clock = this.zzC();
        this.zzd = object = new zzem(60, 2000L, "tracking", clock);
        this.zze = object = new zzv(this, zzbu2);
    }

    private static void zzY(Map object, Map map2) {
        Preconditions.checkNotNull(map2);
        if (object != null) {
            boolean bl2;
            object = object.entrySet().iterator();
            while (bl2 = object.hasNext()) {
                Object object2 = (Map.Entry)object.next();
                String string2 = Tracker.zzn((Map.Entry)object2);
                if (string2 == null) continue;
                object2 = (String)object2.getValue();
                map2.put(string2, object2);
            }
        }
    }

    public static /* bridge */ /* synthetic */ zzv zza(Tracker tracker) {
        return tracker.zze;
    }

    public static /* synthetic */ zzbh zzb(Tracker tracker) {
        return tracker.zzr();
    }

    public static /* synthetic */ zzbp zzc(Tracker tracker) {
        return tracker.zzs();
    }

    public static /* synthetic */ zzbp zze(Tracker tracker) {
        return tracker.zzs();
    }

    public static /* synthetic */ zzce zzf(Tracker tracker) {
        return tracker.zzu();
    }

    public static /* synthetic */ zzcw zzg(Tracker tracker) {
        return tracker.zzx();
    }

    public static /* synthetic */ zzcw zzh(Tracker tracker) {
        return tracker.zzx();
    }

    public static /* bridge */ /* synthetic */ zzem zzi(Tracker tracker) {
        return tracker.zzd;
    }

    public static /* synthetic */ zzeo zzj(Tracker tracker) {
        return tracker.zzz();
    }

    public static /* synthetic */ zzeo zzk(Tracker tracker) {
        return tracker.zzz();
    }

    public static /* bridge */ /* synthetic */ zzfe zzl(Tracker tracker) {
        return tracker.zzg;
    }

    private static String zzn(Map.Entry entry) {
        int n3;
        String string2;
        String string3 = (String)entry.getKey();
        int n4 = string3.startsWith(string2 = "&");
        if (n4 != 0 && (n3 = string3.length()) >= (n4 = 2)) {
            return ((String)entry.getKey()).substring(1);
        }
        return null;
    }

    public void enableAdvertisingIdCollection(boolean bl2) {
        this.zza = bl2;
    }

    public void enableAutoActivityTracking(boolean bl2) {
        this.zze.zzc(bl2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void enableExceptionReporting(boolean bl2) {
        synchronized (this) {
            Throwable throwable2;
            block8: {
                ExceptionReporter exceptionReporter;
                Thread.UncaughtExceptionHandler uncaughtExceptionHandler;
                try {
                    boolean bl3;
                    uncaughtExceptionHandler = this.zzf;
                    if (uncaughtExceptionHandler == null) {
                        bl3 = false;
                        exceptionReporter = null;
                    } else {
                        bl3 = true;
                    }
                    if (bl3 == bl2) {
                        return;
                    }
                }
                catch (Throwable throwable2) {
                    break block8;
                }
                if (bl2) {
                    Object object = this.zzo();
                    uncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
                    this.zzf = exceptionReporter = new ExceptionReporter(this, uncaughtExceptionHandler, (Context)object);
                    Thread.setDefaultUncaughtExceptionHandler(exceptionReporter);
                    object = "Uncaught exceptions will be reported to Google Analytics";
                    this.zzN((String)object);
                } else {
                    Object object = uncaughtExceptionHandler.zza();
                    Thread.setDefaultUncaughtExceptionHandler((Thread.UncaughtExceptionHandler)object);
                    object = "Uncaught exceptions will not be reported to Google Analytics";
                    this.zzN((String)object);
                }
                return;
            }
            throw throwable2;
        }
    }

    public String get(String string2) {
        this.zzV();
        boolean bl2 = TextUtils.isEmpty((CharSequence)string2);
        if (!bl2) {
            Object object = this.zzb;
            bl2 = object.containsKey(string2);
            if (bl2) {
                return (String)this.zzb.get(string2);
            }
            object = "&ul";
            bl2 = string2.equals(object);
            if (bl2) {
                return zzff.zzd(Locale.getDefault());
            }
            object = "&cid";
            bl2 = string2.equals(object);
            if (bl2) {
                return this.zzv().zzb();
            }
            object = "&sr";
            bl2 = string2.equals(object);
            if (bl2) {
                return this.zzx().zzb();
            }
            object = "&aid";
            bl2 = string2.equals(object);
            if (bl2) {
                return this.zzu().zza().zzd();
            }
            object = "&an";
            bl2 = string2.equals(object);
            if (bl2) {
                return this.zzu().zza().zzf();
            }
            object = "&av";
            bl2 = string2.equals(object);
            if (bl2) {
                return this.zzu().zza().zzg();
            }
            object = "&aiid";
            boolean bl3 = string2.equals(object);
            if (bl3) {
                return this.zzu().zza().zze();
            }
        }
        return null;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void send(Map var1_1) {
        block13: {
            var2_3 = this.zzC().currentTimeMillis();
            var4_4 = this.zzp();
            var5_5 = (int)var4_4.getAppOptOut();
            if (var5_5 != 0) {
                this.zzE("AppOptOut is set to true. Not sending Google Analytics hit");
                return;
            }
            var6_6 = this.zzp().isDryRunEnabled();
            var7_7 = new HashMap<String, Object>();
            Tracker.zzY(this.zzb, var7_7);
            Tracker.zzY((Map)var1_1, var7_7);
            var1_1 = this.zzb;
            var4_4 = "useSecure";
            var1_1 = (String)var1_1.get(var4_4);
            var5_5 = 1;
            if (var1_1 == null || (var9_9 = var1_1.equalsIgnoreCase((String)(var8_8 = "true"))) != 0 || (var9_9 = var1_1.equalsIgnoreCase((String)(var8_8 = "yes"))) != 0 || (var9_9 = var1_1.equalsIgnoreCase((String)(var8_8 = "1"))) != 0) {
                while (true) {
                    var10_12 = true;
                    break;
                }
            } else {
                var8_8 = "false";
                var9_9 = var1_1.equalsIgnoreCase((String)var8_8);
                var11_10 = null;
                if (var9_9 == 0 && (var9_9 = var1_1.equalsIgnoreCase((String)(var8_8 = "no"))) == 0 && (var12_11 = var1_1.equalsIgnoreCase((String)(var8_8 = "0"))) == 0) ** continue;
                var10_12 = false;
            }
            var1_1 = this.zzc;
            Preconditions.checkNotNull(var7_7);
            var1_1 = var1_1.entrySet().iterator();
            while ((var9_9 = var1_1.hasNext()) != 0) {
                var8_8 = var1_1.next();
                var11_10 = Tracker.zzn(var8_8);
                if (var11_10 == null || (var13_13 = var7_7.containsKey(var11_10))) continue;
                var8_8 = (String)var8_8.getValue();
                var7_7.put((String)var11_10, var8_8);
            }
            this.zzc.clear();
            var14_14 = var1_1 = var7_7.get("t");
            var14_14 = (String)var1_1;
            var12_11 = TextUtils.isEmpty((CharSequence)var14_14);
            if (var12_11 != 0) {
                this.zzz().zzc(var7_7, "Missing hit type parameter");
                return;
            }
            var15_15 = var1_1 = var7_7.get("tid");
            var15_15 = (String)var1_1;
            var12_11 = TextUtils.isEmpty((CharSequence)var15_15);
            if (var12_11 != 0) {
                this.zzz().zzc(var7_7, "Missing tracking id parameter");
                return;
            }
            var13_13 = this.zza;
            synchronized (this) {
                var1_1 = "screenview";
                try {
                    var12_11 = var1_1.equalsIgnoreCase((String)var14_14);
                    if (var12_11 == 0 && (var12_11 = (var1_1 = "pageview").equalsIgnoreCase((String)var14_14)) == 0 && (var12_11 = (var1_1 = "appview").equalsIgnoreCase((String)var14_14)) == 0 && (var12_11 = TextUtils.isEmpty((CharSequence)var14_14)) == 0) break block13;
                }
                catch (Throwable var1_2) {
                    ** break block14
                }
                var1_1 = this.zzb;
                var8_8 = "&a";
                var1_1 = var1_1.get(var8_8);
                var1_1 = (String)var1_1;
                Preconditions.checkNotNull(var1_1);
                var12_11 = Integer.parseInt((String)var1_1) + var5_5;
                var9_9 = -1 >>> 1;
                if (var12_11 < var9_9) {
                    var5_5 = var12_11;
                }
                var1_1 = this.zzb;
                var8_8 = "&a";
                var4_4 = Integer.toString(var5_5);
                var1_1.put(var8_8, var4_4);
            }
        }
        var1_1 = this.zzq();
        var8_8 = var4_4;
        var11_10 = this;
        var4_4 = new zzu(this, var7_7, var13_13, (String)var14_14, var2_3, var6_6, var10_12, (String)var15_15);
        var1_1.zzi((Runnable)var4_4);
        return;
lbl-1000:
        // 1 sources

        {
            throw var1_2;
        }
    }

    public void set(String string2, String string3) {
        String string4 = "Key should be non-null";
        Preconditions.checkNotNull(string2, string4);
        boolean bl2 = TextUtils.isEmpty((CharSequence)string2);
        if (bl2) {
            return;
        }
        this.zzb.put(string2, string3);
    }

    public void setAnonymizeIp(boolean bl2) {
        String string2 = zzff.zzc(bl2);
        this.set("&aip", string2);
    }

    public void setAppId(String string2) {
        this.set("&aid", string2);
    }

    public void setAppInstallerId(String string2) {
        this.set("&aiid", string2);
    }

    public void setAppName(String string2) {
        this.set("&an", string2);
    }

    public void setAppVersion(String string2) {
        this.set("&av", string2);
    }

    public void setCampaignParamsOnNextHit(Uri object) {
        Object object2;
        boolean bl2;
        if (object != null && !(bl2 = object.isOpaque()) && !(bl2 = TextUtils.isEmpty((CharSequence)(object = object.getQueryParameter((String)(object2 = "referrer")))))) {
            String string2;
            Object object3;
            object = String.valueOf(object);
            object2 = (object = Uri.parse((String)"http://hostname/?".concat((String)object))).getQueryParameter("utm_id");
            if (object2 != null) {
                object3 = this.zzc;
                string2 = "&ci";
                object3.put(string2, object2);
            }
            if ((object2 = object.getQueryParameter("anid")) != null) {
                object3 = this.zzc;
                string2 = "&anid";
                object3.put(string2, object2);
            }
            if ((object2 = object.getQueryParameter("utm_campaign")) != null) {
                object3 = this.zzc;
                string2 = "&cn";
                object3.put(string2, object2);
            }
            if ((object2 = object.getQueryParameter("utm_content")) != null) {
                object3 = this.zzc;
                string2 = "&cc";
                object3.put(string2, object2);
            }
            if ((object2 = object.getQueryParameter("utm_medium")) != null) {
                object3 = this.zzc;
                string2 = "&cm";
                object3.put(string2, object2);
            }
            if ((object2 = object.getQueryParameter("utm_source")) != null) {
                object3 = this.zzc;
                string2 = "&cs";
                object3.put(string2, object2);
            }
            if ((object2 = object.getQueryParameter("utm_term")) != null) {
                object3 = this.zzc;
                string2 = "&ck";
                object3.put(string2, object2);
            }
            if ((object2 = object.getQueryParameter("dclid")) != null) {
                object3 = this.zzc;
                string2 = "&dclid";
                object3.put(string2, object2);
            }
            if ((object2 = object.getQueryParameter("gclid")) != null) {
                object3 = this.zzc;
                string2 = "&gclid";
                object3.put(string2, object2);
            }
            if ((object = object.getQueryParameter((String)(object2 = "aclid"))) != null) {
                object2 = this.zzc;
                object3 = "&aclid";
                object2.put(object3, object);
            }
        }
    }

    public void setClientId(String string2) {
        this.set("&cid", string2);
    }

    public void setEncoding(String string2) {
        this.set("&de", string2);
    }

    public void setHostname(String string2) {
        this.set("&dh", string2);
    }

    public void setLanguage(String string2) {
        this.set("&ul", string2);
    }

    public void setLocation(String string2) {
        this.set("&dl", string2);
    }

    public void setPage(String string2) {
        this.set("&dp", string2);
    }

    public void setReferrer(String string2) {
        this.set("&dr", string2);
    }

    public void setSampleRate(double d2) {
        String string2 = Double.toString(d2);
        this.set("&sf", string2);
    }

    public void setScreenColors(String string2) {
        this.set("&sd", string2);
    }

    public void setScreenName(String string2) {
        this.set("&cd", string2);
    }

    public void setScreenResolution(int n3, int n4) {
        if (n3 < 0 && n4 < 0) {
            this.zzQ("Invalid width or height. The values should be non-negative.");
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(n3);
        stringBuilder.append("x");
        stringBuilder.append(n4);
        String string2 = stringBuilder.toString();
        this.set("&sr", string2);
    }

    public void setSessionTimeout(long l2) {
        zzv zzv2 = this.zze;
        zzv2.zze(l2 *= 1000L);
    }

    public void setTitle(String string2) {
        this.set("&dt", string2);
    }

    public void setUseSecure(boolean bl2) {
        String string2 = zzff.zzc(bl2);
        this.set("useSecure", string2);
    }

    public void setViewportSize(String string2) {
        this.set("&vp", string2);
    }

    public final void zzd() {
        String string2;
        this.zze.zzW();
        String string3 = this.zzB().zza();
        if (string3 != null) {
            string2 = "&an";
            this.set(string2, string3);
        }
        if ((string3 = this.zzB().zzb()) != null) {
            string2 = "&av";
            this.set(string2, string3);
        }
    }

    public final void zzm(zzfe zzfe2) {
        boolean bl2;
        String string2;
        boolean bl3;
        double d2;
        double d5;
        double d7;
        double d9;
        String string3;
        this.zzN("Loading Tracker config values");
        this.zzg = zzfe2;
        Object object = zzfe2.zza;
        if (object != null) {
            this.set("&tid", (String)object);
            string3 = "trackingId loaded";
            this.zzO(string3, object);
        }
        if ((d9 = (d7 = (d5 = zzfe2.zzb) - (d2 = 0.0)) == 0.0 ? 0 : (d7 > 0.0 ? 1 : -1)) >= 0) {
            object = Double.toString(d5);
            this.set("&sf", (String)object);
            string3 = "Sample frequency loaded";
            this.zzO(string3, object);
        }
        if ((bl3 = zzfe2.zzc) >= false) {
            long l2 = (long)bl3;
            this.setSessionTimeout(l2);
            object = (int)(bl3 ? 1 : 0);
            string3 = "Session timeout loaded";
            this.zzO(string3, object);
        }
        bl3 = zzfe2.zzd;
        boolean bl4 = -1 != 0;
        boolean bl5 = false;
        boolean bl6 = true;
        if (bl3 != bl4) {
            if (bl6 != bl3) {
                bl3 = false;
                object = null;
            } else {
                bl3 = true;
            }
            this.enableAutoActivityTracking(bl3);
            object = bl3;
            string2 = "Auto activity tracking loaded";
            this.zzO(string2, object);
        }
        if ((bl3 = zzfe2.zze) != bl4) {
            if (bl3) {
                string3 = "&aip";
                string2 = "1";
                this.set(string3, string2);
            }
            if (bl6 != bl3) {
                bl3 = false;
                object = null;
            } else {
                bl3 = true;
            }
            object = bl3;
            string3 = "Anonymize ip loaded";
            this.zzO(string3, object);
        }
        if ((bl2 = zzfe2.zzf) == bl6) {
            bl5 = true;
        }
        this.enableExceptionReporting(bl5);
    }
}

