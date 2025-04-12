/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.ActivityManager$MemoryInfo
 *  android.content.Context
 *  android.content.pm.ApplicationInfo
 *  android.content.pm.PackageInfo
 *  android.content.pm.PackageManager$NameNotFoundException
 *  android.net.Uri$Builder
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.os.Looper
 *  android.text.TextUtils
 */
package com.google.android.gms.internal.ads;

import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Looper;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zzf;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.ads.internal.util.client.zzr;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.wrappers.PackageManagerWrapper;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.internal.ads.zzbdz;
import com.google.android.gms.internal.ads.zzbeg;
import com.google.android.gms.internal.ads.zzben;
import com.google.android.gms.internal.ads.zzbep;
import com.google.android.gms.internal.ads.zzbfv;
import com.google.android.gms.internal.ads.zzbgc;
import com.google.android.gms.internal.ads.zzbgt;
import com.google.android.gms.internal.ads.zzbwg;
import com.google.android.gms.internal.ads.zzbwh;
import com.google.android.gms.internal.ads.zzbwi;
import com.google.android.gms.internal.ads.zzbwk;
import com.google.android.gms.internal.ads.zzbwl;
import com.google.android.gms.internal.ads.zzfuu;
import com.google.android.gms.internal.ads.zzfyv;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Locale;
import java.util.Random;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;

public final class zzbwj
implements zzbwl {
    public static zzbwl zza;
    static zzbwl zzb;
    static zzbwl zzc;
    static Boolean zzd;
    private static final Object zze;
    private final Object zzf;
    private final Context zzg;
    private final WeakHashMap zzh;
    private final ExecutorService zzi;
    private final VersionInfoParcel zzj;
    private final PackageInfo zzk;
    private final String zzl;
    private final String zzm;
    private final AtomicBoolean zzn;
    private boolean zzo;

    static {
        Object object;
        zze = object = new Object();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public zzbwj(Context object, VersionInfoParcel object2) {
        Object object3;
        block9: {
            String string2;
            block10: {
                int n3;
                int n4;
                boolean bl2;
                block8: {
                    this.zzf = object3 = new Object();
                    object3 = new WeakHashMap();
                    this.zzh = object3;
                    zzfuu.zza();
                    this.zzi = object3 = Executors.unconfigurableExecutorService(Executors.newCachedThreadPool());
                    this.zzn = object3 = new AtomicBoolean();
                    object3 = object.getApplicationContext();
                    if (object3 != null) {
                        object = object.getApplicationContext();
                    }
                    this.zzg = object;
                    this.zzj = object2;
                    object2 = zzbep.zzhS;
                    object2 = (Boolean)zzba.zzc().zza((zzbeg)object2);
                    bl2 = (Boolean)object2;
                    object3 = null;
                    if (bl2) {
                        object2 = com.google.android.gms.ads.internal.util.client.zzf.zza;
                        if (object != null && (object2 = object.getApplicationInfo()) != null) {
                            try {
                                object2 = Wrappers.packageManager((Context)object);
                                object = object.getApplicationInfo();
                                object = ((ApplicationInfo)object).packageName;
                                n4 = 0;
                                string2 = null;
                                object = ((PackageManagerWrapper)object2).getPackageInfo((String)object, 0);
                                break block8;
                            }
                            catch (PackageManager.NameNotFoundException nameNotFoundException) {}
                        }
                    }
                    n3 = 0;
                    object = null;
                }
                this.zzk = object;
                object = zzbep.zzhQ;
                object2 = (Boolean)zzba.zzc().zza((zzbeg)object);
                bl2 = (Boolean)object2;
                string2 = "unknown";
                object2 = bl2 ? Locale.getDefault().getCountry() : string2;
                this.zzl = object2;
                object2 = zzba.zzc();
                object = (Boolean)((zzben)object2).zza((zzbeg)object);
                n3 = ((Boolean)object).booleanValue();
                if (n3 == 0) break block10;
                object = this.zzg;
                object2 = com.google.android.gms.ads.internal.util.client.zzf.zza;
                if (object == null) break block9;
                try {
                    object = Wrappers.packageManager((Context)object);
                    object2 = "com.android.vending";
                    n4 = 128;
                    object = ((PackageManagerWrapper)object).getPackageInfo((String)object2, n4);
                    if (object != null) {
                        n3 = ((PackageInfo)object).versionCode;
                        object3 = Integer.toString(n3);
                    }
                    break block9;
                }
                catch (PackageManager.NameNotFoundException nameNotFoundException) {}
            }
            object3 = string2;
        }
        this.zzm = object3;
    }

    public zzbwj(Context context, VersionInfoParcel versionInfoParcel, boolean bl2) {
        this(context, versionInfoParcel);
        this.zzo = true;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static zzbwl zza(Context object) {
        Object object2 = zze;
        synchronized (object2) {
            Throwable throwable2;
            block5: {
                block3: {
                    block4: {
                        try {
                            zzbwl zzbwl2 = zza;
                            if (zzbwl2 != null) break block3;
                            boolean bl2 = zzbwj.zzl();
                            if (!bl2) break block4;
                            VersionInfoParcel versionInfoParcel = VersionInfoParcel.forPackage();
                            zza = zzbwl2 = new zzbwj((Context)object, versionInfoParcel);
                            break block3;
                        }
                        catch (Throwable throwable2) {
                            break block5;
                        }
                    }
                    object = new zzbwk();
                    zza = object;
                }
                return zza;
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static zzbwl zzb(Context object, VersionInfoParcel versionInfoParcel) {
        Object object2 = zze;
        synchronized (object2) {
            Throwable throwable2;
            block10: {
                block8: {
                    boolean bl2;
                    boolean bl3;
                    boolean bl4;
                    Object object3;
                    block9: {
                        try {
                            object3 = zzc;
                            if (object3 != null) break block8;
                            object3 = zzbgc.zzc;
                            object3 = ((zzbfv)object3).zze();
                            object3 = (Boolean)object3;
                            bl4 = (Boolean)object3;
                            bl3 = false;
                            bl2 = true;
                            if (!bl4) break block9;
                            object3 = zzbep.zzhM;
                            zzben zzben2 = zzba.zzc();
                            object3 = zzben2.zza((zzbeg)object3);
                            bl4 = (Boolean)(object3 = (Boolean)object3);
                            if (bl4) {
                                object3 = zzbgc.zza;
                                object3 = ((zzbfv)object3).zze();
                                bl4 = (Boolean)(object3 = (Boolean)object3);
                                if (!bl4) break block9;
                            }
                            bl3 = true;
                        }
                        catch (Throwable throwable2) {
                            break block10;
                        }
                    }
                    if (bl4 = zzbwj.zzl()) {
                        object3 = new zzbwj((Context)object, versionInfoParcel);
                        super.zzk();
                        super.zzj();
                        zzc = object3;
                    } else if (bl3) {
                        object3 = new zzbwj((Context)object, versionInfoParcel, bl2);
                        super.zzk();
                        super.zzj();
                        zzc = object3;
                    } else {
                        object = new zzbwk();
                        zzc = object;
                    }
                }
                return zzc;
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static zzbwl zzc(Context object) {
        Object object2 = zze;
        synchronized (object2) {
            Throwable throwable2;
            block5: {
                block3: {
                    block4: {
                        try {
                            Object object3 = zzb;
                            if (object3 != null) break block3;
                            object3 = zzbep.zzhN;
                            Object object4 = zzba.zzc();
                            object3 = ((zzben)object4).zza((zzbeg)object3);
                            boolean bl2 = (Boolean)(object3 = (Boolean)object3);
                            if (!bl2) break block4;
                            object3 = zzbep.zzhM;
                            object4 = zzba.zzc();
                            object3 = ((zzben)object4).zza((zzbeg)object3);
                            bl2 = (Boolean)(object3 = (Boolean)object3);
                            if (bl2) break block4;
                            object4 = VersionInfoParcel.forPackage();
                            zzb = object3 = new zzbwj((Context)object, (VersionInfoParcel)object4);
                            break block3;
                        }
                        catch (Throwable throwable2) {
                            break block5;
                        }
                    }
                    object = new zzbwk();
                    zzb = object;
                }
                return zzb;
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static zzbwl zzd(Context object, VersionInfoParcel versionInfoParcel) {
        Object object2 = zze;
        synchronized (object2) {
            Throwable throwable2;
            block5: {
                block3: {
                    block4: {
                        try {
                            Object object3 = zzb;
                            if (object3 != null) break block3;
                            object3 = zzbep.zzhN;
                            zzben zzben2 = zzba.zzc();
                            object3 = zzben2.zza((zzbeg)object3);
                            boolean bl2 = (Boolean)(object3 = (Boolean)object3);
                            if (!bl2) break block4;
                            object3 = zzbep.zzhM;
                            zzben2 = zzba.zzc();
                            object3 = zzben2.zza((zzbeg)object3);
                            bl2 = (Boolean)(object3 = (Boolean)object3);
                            if (bl2) break block4;
                            zzb = object3 = new zzbwj((Context)object, versionInfoParcel);
                            break block3;
                        }
                        catch (Throwable throwable2) {
                            break block5;
                        }
                    }
                    object = new zzbwk();
                    zzb = object;
                }
                return zzb;
            }
            throw throwable2;
        }
    }

    public static String zze(Throwable throwable) {
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        throwable.printStackTrace(printWriter);
        return stringWriter.toString();
    }

    public static String zzf(Throwable throwable) {
        return zzfyv.zzc(com.google.android.gms.ads.internal.util.client.zzf.zzg(zzbwj.zze(throwable)));
    }

    private final void zzj() {
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
        zzbwh zzbwh2 = new zzbwh(this, uncaughtExceptionHandler);
        Thread.setDefaultUncaughtExceptionHandler(zzbwh2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final void zzk() {
        Object object;
        Thread thread2 = Looper.getMainLooper().getThread();
        if (thread2 == null) {
            return;
        }
        Object object2 = this.zzf;
        synchronized (object2) {
            object = this.zzh;
            Boolean bl2 = Boolean.TRUE;
            ((WeakHashMap)object).put(thread2, bl2);
        }
        object2 = thread2.getUncaughtExceptionHandler();
        object = new zzbwi(this, (Thread.UncaughtExceptionHandler)object2);
        thread2.setUncaughtExceptionHandler((Thread.UncaughtExceptionHandler)object);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    private static boolean zzl() {
        Object object2 = zzbep.zzmJ;
        object2 = (Boolean)zzba.zzc().zza((zzbeg)object2);
        boolean bl2 = (Boolean)object2;
        Object var2_2 = null;
        boolean bl3 = true;
        if (!bl2) {
            object2 = (Boolean)zzbgt.zze.zze();
            bl2 = (Boolean)object2;
            if (!bl2) return false;
            object2 = zzbep.zzhM;
            zzben zzben2 = zzba.zzc();
            object2 = (Boolean)zzben2.zza((zzbeg)object2);
            bl2 = (Boolean)object2;
            if (bl2) return false;
            return bl3;
        }
        object2 = zze;
        // MONITORENTER : object2
        Object object = zzd;
        if (object == null) {
            object = zzay.zze();
            boolean bl4 = 100 != 0;
            boolean bl5 = ((Random)object).nextInt((int)(bl4 ? 1 : 0));
            Object object3 = zzbep.zzmG;
            zzben zzben3 = zzba.zzc();
            object3 = zzben3.zza((zzbeg)object3);
            bl4 = ((Integer)(object3 = (Integer)object3)).intValue();
            if (bl5 < bl4) {
                bl5 = true;
            } else {
                bl5 = false;
                object = null;
            }
            zzd = object = Boolean.valueOf(bl5);
        }
        object2 = zzd;
        bl2 = (Boolean)object2;
        if (!bl2) return false;
        object2 = zzbep.zzhM;
        object = zzba.zzc();
        object2 = (Boolean)((zzben)object).zza((zzbeg)object2);
        bl2 = (Boolean)object2;
        if (bl2) return false;
        return bl3;
    }

    public final void zzg(Thread object, Throwable throwable) {
        if (throwable != null) {
            boolean bl2 = false;
            object = null;
            boolean bl3 = false;
            boolean bl4 = false;
            for (Throwable throwable2 = throwable; throwable2 != null; throwable2 = throwable2.getCause()) {
                for (StackTraceElement stackTraceElement : throwable2.getStackTrace()) {
                    boolean bl5 = com.google.android.gms.ads.internal.util.client.zzf.zzp(stackTraceElement.getClassName());
                    bl3 |= bl5;
                    String string2 = zzbwj.class.getName();
                    String object2 = stackTraceElement.getClassName();
                    boolean bl6 = string2.equals(object2);
                    bl4 |= bl6;
                }
            }
            if (bl3 && !bl4) {
                boolean bl7;
                bl2 = this.zzo;
                if (!bl2) {
                    object = "";
                    this.zzh(throwable, (String)object);
                }
                if (!(bl2 = ((AtomicBoolean)(object = this.zzn)).getAndSet(bl7 = true)) && (bl2 = ((Boolean)(object = (Boolean)zzbgc.zzc.zze())).booleanValue())) {
                    object = this.zzg;
                    zzbdz.zzc((Context)object);
                }
            }
        }
    }

    public final void zzh(Throwable throwable, String string2) {
        boolean bl2 = this.zzo;
        if (bl2) {
            return;
        }
        this.zzi(throwable, string2, 1.0f);
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzi(Throwable throwable, String string2, float f5) {
        Object object;
        Object object2;
        int n3;
        int n4;
        int n7;
        Object object3;
        String string3;
        float f6;
        int n8;
        Object object4;
        Object object5;
        Object object6;
        boolean bl2;
        Object object7;
        zzbwj zzbwj2 = this;
        float f7 = f5;
        int n10 = 1;
        int n14 = this.zzo;
        if (n14 != 0) {
            return;
        }
        Object object8 = com.google.android.gms.ads.internal.util.client.zzf.zza;
        object8 = (Boolean)zzbgt.zzf.zze();
        n14 = ((Boolean)object8).booleanValue();
        boolean bl3 = false;
        Object object9 = null;
        if (n14 != 0) {
            object7 = throwable;
        } else {
            boolean bl4;
            object8 = new LinkedList();
            for (object7 = throwable; object7 != null; object7 = ((Throwable)object7).getCause()) {
                ((LinkedList)object8).push(object7);
            }
            bl2 = false;
            object7 = null;
            while (!(bl4 = ((AbstractCollection)object8).isEmpty())) {
                void var29_40;
                object6 = (Throwable)((LinkedList)object8).pop();
                StackTraceElement[] stackTraceElementArray = ((Throwable)object6).getStackTrace();
                object5 = zzbep.zzcj;
                object4 = zzba.zzc();
                object5 = (Boolean)((zzben)object4).zza((zzbeg)object5);
                n8 = ((Boolean)object5).booleanValue();
                if (n8 != 0 && stackTraceElementArray != null && (n8 = stackTraceElementArray.length) == 0 && (n8 = (int)(com.google.android.gms.ads.internal.util.client.zzf.zzp((String)(object5 = object6.getClass().getName())) ? 1 : 0)) != 0) {
                    n8 = 1;
                    f6 = Float.MIN_VALUE;
                } else {
                    n8 = 0;
                    f6 = 0.0f;
                    object5 = null;
                }
                object4 = new ArrayList();
                string3 = object6.getClass().getName();
                String string4 = "<filtered>";
                object3 = new StackTraceElement(string3, string4, string4, n10);
                ((ArrayList)object4).add(object3);
                int n15 = stackTraceElementArray.length;
                string3 = null;
                for (n7 = 0; n7 < n15; n7 += n10) {
                    String string5;
                    String string6;
                    StackTraceElement stackTraceElement = stackTraceElementArray[n7];
                    String string7 = stackTraceElement.getClassName();
                    boolean bl5 = com.google.android.gms.ads.internal.util.client.zzf.zzp(string7);
                    if (bl5) {
                        ((ArrayList)object4).add(stackTraceElement);
                        n8 = 1;
                        f6 = Float.MIN_VALUE;
                        continue;
                    }
                    string7 = stackTraceElement.getClassName();
                    boolean bl6 = TextUtils.isEmpty((CharSequence)string7);
                    if (bl6 || (n4 = string7.startsWith(string6 = "android.")) == 0 && (n4 = string7.startsWith(string5 = "java.")) == 0) {
                        StackTraceElement stackTraceElement2 = new StackTraceElement(string4, string4, string4, n10);
                        ((ArrayList)object4).add(stackTraceElement2);
                        continue;
                    }
                    ((ArrayList)object4).add(stackTraceElement);
                }
                if (n8 == 0) continue;
                if (object7 == null) {
                    object7 = ((Throwable)object6).getMessage();
                    Throwable throwable2 = new Throwable((String)object7);
                } else {
                    object6 = ((Throwable)object6).getMessage();
                    Throwable throwable3 = new Throwable((String)object6, (Throwable)object7);
                }
                object7 = var29_40;
                StackTraceElement[] stackTraceElementArray3 = new StackTraceElement[]{};
                stackTraceElementArray3 = ((ArrayList)object4).toArray(stackTraceElementArray3);
                ((Throwable)object7).setStackTrace(stackTraceElementArray3);
            }
        }
        if (object7 == null) return;
        object8 = throwable.getClass().getName();
        String string8 = zzbwj.zze(throwable);
        object7 = zzbep.zziP;
        object6 = zzba.zzc();
        object7 = (Boolean)((zzben)object6).zza((zzbeg)object7);
        bl2 = (Boolean)object7;
        object7 = bl2 ? zzbwj.zzf(throwable) : "";
        double d2 = f7;
        f6 = 0.0f;
        object5 = null;
        float f8 = f7 - 0.0f;
        n8 = f8 == 0.0f ? 0 : (f8 > 0.0f ? 1 : -1);
        double d5 = Math.random();
        if (n8 > 0) {
            f6 = 1.0f / f7;
            n8 = n3 = (int)f6;
        } else {
            n8 = 1;
            f6 = Float.MIN_VALUE;
        }
        n3 = (int)(d5 == d2 ? 0 : (d5 < d2 ? -1 : 1));
        if (n3 >= 0) return;
        object6 = new ArrayList();
        try {
            object2 = zzbwj2.zzg;
            object2 = Wrappers.packageManager((Context)object2);
            bl3 = ((PackageManagerWrapper)object2).isCallerInstantApp();
        }
        catch (Throwable throwable4) {
            String string9 = "Error fetching instant app info";
            com.google.android.gms.ads.internal.util.client.zzm.zzh(string9, throwable4);
        }
        try {
            object2 = zzbwj2.zzg;
            object2 = object2.getPackageName();
        }
        catch (Throwable throwable5) {
            com.google.android.gms.ads.internal.util.client.zzm.zzj("Cannot obtain package name, proceeding.");
            object2 = "unknown";
        }
        Uri.Builder builder2 = new Uri.Builder();
        builder2 = builder2.scheme("https").path("//pagead2.googlesyndication.com/pagead/gen_204");
        object9 = Boolean.toString(bl3);
        object9 = builder2.appendQueryParameter("is_aia", (String)object9).appendQueryParameter("id", "gmob-apps-report-exception");
        String string10 = "os";
        object4 = Build.VERSION.RELEASE;
        object9 = object9.appendQueryParameter(string10, (String)object4);
        int n16 = Build.VERSION.SDK_INT;
        object4 = String.valueOf(n16);
        object9 = object9.appendQueryParameter("api", (String)object4);
        object4 = Build.MANUFACTURER;
        object3 = Build.MODEL;
        n7 = (int)(((String)object3).startsWith((String)object4) ? 1 : 0);
        if (n7 == 0) {
            string3 = " ";
            object3 = n1.a((String)object4, string3, (String)object3);
        }
        object9 = object9.appendQueryParameter("device", (String)object3);
        object4 = zzbwj2.zzj;
        object3 = "js";
        object4 = ((VersionInfoParcel)object4).afmaVersion;
        object9 = object9.appendQueryParameter((String)object3, (String)object4);
        object4 = "appid";
        object2 = object9.appendQueryParameter((String)object4, (String)object2).appendQueryParameter("exceptiontype", (String)object8).appendQueryParameter("stacktrace", string8);
        object8 = zzba.zza().zza();
        object8 = TextUtils.join((CharSequence)",", (Iterable)object8);
        object2 = object2.appendQueryParameter("eids", (String)object8);
        String string11 = string2;
        object2 = object2.appendQueryParameter("exceptionkey", string2).appendQueryParameter("cl", "636244245").appendQueryParameter("rc", "dev");
        object8 = Integer.toString(n8);
        object2 = object2.appendQueryParameter("sampling_rate", (String)object8);
        object8 = String.valueOf(zzbgt.zzc.zze());
        object2 = object2.appendQueryParameter("pb_tm", (String)object8);
        object8 = zzbwj2.zzg;
        object8 = String.valueOf(GoogleApiAvailabilityLight.getInstance().getApkVersion((Context)object8));
        object2 = object2.appendQueryParameter("gmscv", (String)object8);
        object8 = zzbwj2.zzj;
        n14 = ((VersionInfoParcel)object8).isLiteSdk;
        String string12 = "1";
        object9 = "0";
        object8 = n10 != n14 ? object9 : string12;
        object5 = "lite";
        object2 = object2.appendQueryParameter((String)object5, (String)object8);
        n14 = (int)(TextUtils.isEmpty((CharSequence)object7) ? 1 : 0);
        if (n14 == 0) {
            object8 = "hash";
            object2.appendQueryParameter((String)object8, (String)object7);
        }
        object8 = zzbep.zzhR;
        object7 = zzba.zzc();
        object8 = (Boolean)((zzben)object7).zza((zzbeg)object8);
        n14 = (int)(((Boolean)object8).booleanValue() ? 1 : 0);
        if (n14 != 0 && (object8 = com.google.android.gms.ads.internal.util.client.zzf.zzc(zzbwj2.zzg)) != null) {
            void var29_48;
            object7 = Long.toString(((ActivityManager.MemoryInfo)object8).availMem);
            object2.appendQueryParameter("available_memory", (String)object7);
            long l2 = ((ActivityManager.MemoryInfo)object8).totalMem;
            object7 = Long.toString(l2);
            object5 = "total_memory";
            object2.appendQueryParameter((String)object5, (String)object7);
            n14 = (int)(((ActivityManager.MemoryInfo)object8).lowMemory ? 1 : 0);
            if (n10 != n14) {
                String string13 = object9;
            }
            object = "is_low_memory";
            object2.appendQueryParameter((String)object, (String)var29_48);
        }
        object = zzbep.zzhQ;
        object8 = zzba.zzc();
        object = (Boolean)((zzben)object8).zza((zzbeg)object);
        n10 = (int)(((Boolean)object).booleanValue() ? 1 : 0);
        if (n10 != 0) {
            block33: {
                object = zzbwj2.zzl;
                n10 = (int)(TextUtils.isEmpty((CharSequence)object) ? 1 : 0);
                if (n10 == 0) {
                    object = zzbwj2.zzl;
                    object8 = "countrycode";
                    object2.appendQueryParameter((String)object8, (String)object);
                }
                if ((n10 = (int)(TextUtils.isEmpty((CharSequence)(object = zzbwj2.zzm)) ? 1 : 0)) == 0) {
                    object = zzbwj2.zzm;
                    object8 = "psv";
                    object2.appendQueryParameter((String)object8, (String)object);
                }
                object = zzbwj2.zzg;
                n14 = 26;
                if (n16 >= n14) {
                    object = rm_0.a();
                } else {
                    if (object != null) {
                        try {
                            object = Wrappers.packageManager((Context)object);
                            object8 = "com.android.webview";
                            n4 = 128;
                            object = ((PackageManagerWrapper)object).getPackageInfo((String)object8, n4);
                            break block33;
                        }
                        catch (PackageManager.NameNotFoundException nameNotFoundException) {}
                    }
                    n10 = 0;
                    object = null;
                }
            }
            if (object != null) {
                n14 = ((PackageInfo)object).versionCode;
                object8 = Integer.toString(n14);
                object2.appendQueryParameter("wvvc", (String)object8);
                String string14 = ((PackageInfo)object).versionName;
                object2.appendQueryParameter("wvvn", string14);
                object8 = "wvpn";
                object = ((PackageInfo)object).packageName;
                object2.appendQueryParameter((String)object8, (String)object);
            }
        }
        if ((object = zzbwj2.zzk) != null) {
            n10 = ((PackageInfo)object).versionCode;
            object = String.valueOf(n10);
            object2.appendQueryParameter("appvc", (String)object);
            object = zzbwj2.zzk;
            object8 = "appvn";
            object = ((PackageInfo)object).versionName;
            object2.appendQueryParameter((String)object8, (String)object);
        }
        object2 = object2.toString();
        ((ArrayList)object6).add(object2);
        object2 = ((ArrayList)object6).iterator();
        while ((n10 = (int)(object2.hasNext() ? 1 : 0)) != 0) {
            object = (String)object2.next();
            n4 = 0;
            Object var29_52 = null;
            object8 = new zzr(null);
            object9 = zzbwj2.zzi;
            object7 = new zzbwg((zzr)object8, (String)object);
            object9.execute((Runnable)object7);
        }
    }
}

