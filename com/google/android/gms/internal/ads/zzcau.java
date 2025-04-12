/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.os.Bundle
 */
package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzff;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.util.client.zzf;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.common.util.ClientLibraryUtils;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.internal.ads.zzbeg;
import com.google.android.gms.internal.ads.zzben;
import com.google.android.gms.internal.ads.zzbep;
import com.google.android.gms.internal.ads.zzcar;
import com.google.android.gms.internal.ads.zzcas;
import com.google.android.gms.internal.ads.zzcat;
import com.google.android.gms.internal.ads.zzcav;
import com.google.android.gms.internal.ads.zzfuu;
import java.io.Serializable;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

public final class zzcau {
    final AtomicBoolean zza;
    private final AtomicReference zzb;
    private final Object zzc;
    private String zzd;
    private final AtomicInteger zze;
    private final AtomicReference zzf;
    private final AtomicReference zzg;
    private final ConcurrentMap zzh;
    private final AtomicReference zzi;
    private final BlockingQueue zzj;
    private final Object zzk;

    public zzcau() {
        Object object = new AtomicReference(null);
        this.zzb = object;
        this.zzc = object = new Object();
        this.zzd = null;
        this.zza = object = new AtomicBoolean(false);
        this.zze = object = new AtomicInteger(-1);
        object = new AtomicReference(null);
        this.zzf = object;
        object = new AtomicReference(null);
        this.zzg = object;
        super(9);
        this.zzh = object;
        object = new AtomicReference(null);
        this.zzi = object;
        super(20);
        this.zzj = object;
        this.zzk = object = new Object();
    }

    public static final boolean zzq(Context object) {
        Object object2 = zzbep.zzai;
        object2 = (Boolean)zzba.zzc().zza((zzbeg)object2);
        boolean n3 = (Boolean)object2;
        if (n3) {
            object2 = "com.google.android.gms.ads.dynamite";
            int n4 = DynamiteModule.getLocalVersion((Context)object, (String)object2);
            Object object3 = zzbep.zzaj;
            zzben zzben2 = zzba.zzc();
            object3 = (Integer)zzben2.zza((zzbeg)object3);
            int n7 = (Integer)object3;
            if (n4 < n7) {
                return false;
            }
            object2 = zzbep.zzak;
            object3 = zzba.zzc();
            object2 = (Boolean)((zzben)object3).zza((zzbeg)object2);
            boolean bl2 = (Boolean)object2;
            n7 = 1;
            if (bl2) {
                try {
                    object = object.getClassLoader();
                    object2 = "com.google.firebase.analytics.FirebaseAnalytics";
                }
                catch (ClassNotFoundException classNotFoundException) {}
                ((ClassLoader)object).loadClass((String)object2);
                return false;
            }
            return n7 != 0;
        }
        return false;
    }

    private final Object zzr(String string2, Context object) {
        AtomicReference atomicReference = this.zzf;
        boolean bl2 = true;
        boolean bl3 = this.zzw((Context)object, "com.google.android.gms.measurement.AppMeasurement", atomicReference, bl2);
        if (!bl3) {
            return null;
        }
        object = this.zzs((Context)object, string2);
        try {
            atomicReference = this.zzf;
        }
        catch (Exception exception) {
            this.zzv(string2, bl2);
            return null;
        }
        atomicReference = atomicReference.get();
        return ((Method)object).invoke((Object)atomicReference, null);
    }

    private final Method zzs(Context object, String string2) {
        Object object2;
        Method method = (Method)this.zzh.get(string2);
        if (method != null) {
            return method;
        }
        method = null;
        try {
            object = object.getClassLoader();
            object2 = "com.google.android.gms.measurement.AppMeasurement";
        }
        catch (Exception exception) {
            this.zzv(string2, false);
            return null;
        }
        object = ((ClassLoader)object).loadClass((String)object2);
        object = ((Class)object).getDeclaredMethod(string2, null);
        object2 = this.zzh;
        object2.put(string2, object);
        return object;
    }

    private final void zzt(Context object, String string2, String string3) {
        String string4 = "Invoke Firebase method ";
        Object object2 = "com.google.android.gms.measurement.AppMeasurement";
        Object object3 = this.zzf;
        int n3 = 1;
        boolean bl2 = this.zzw((Context)object, (String)object2, (AtomicReference)object3, n3 != 0);
        if (!bl2) {
            return;
        }
        object3 = (Method)this.zzh.get(string3);
        if (object3 == null) {
            object = object.getClassLoader();
            object = ((ClassLoader)object).loadClass((String)object2);
            object3 = new Class[n3];
            object2 = String.class;
            object3[0] = object2;
            object3 = ((Class)object).getDeclaredMethod(string3, (Class<?>)object3);
            object = this.zzh;
            try {
                object.put(string3, object3);
            }
            catch (Exception exception) {
                this.zzv(string3, false);
                bl2 = false;
                object3 = null;
            }
        }
        try {
            object = this.zzf;
        }
        catch (Exception exception) {
            this.zzv(string3, false);
            return;
        }
        object = ((AtomicReference)object).get();
        Object[] objectArray = new Object[n3];
        objectArray[0] = string2;
        object3.invoke(object, objectArray);
        object = new StringBuilder(string4);
        ((StringBuilder)object).append(string3);
        string4 = ", Ad Unit Id: ";
        ((StringBuilder)object).append(string4);
        ((StringBuilder)object).append(string2);
        object = ((StringBuilder)object).toString();
        com.google.android.gms.ads.internal.util.zze.zza((String)object);
    }

    private final void zzu(Context object, String string2, String object2, Bundle objectArray) {
        int n3 = 2;
        int n4 = 3;
        int n7 = 1;
        boolean bl2 = this.zzp((Context)object);
        if (bl2) {
            String string3;
            Bundle bundle;
            block27: {
                bundle = new Bundle();
                string3 = "_aeid";
                long l2 = Long.parseLong((String)object2);
                try {
                    bundle.putLong(string3, l2);
                    break block27;
                }
                catch (NumberFormatException numberFormatException) {
                }
                catch (NullPointerException nullPointerException) {
                    // empty catch block
                }
                object2 = String.valueOf(object2);
                String string4 = "Invalid event ID: ";
                object2 = string4.concat((String)object2);
                zzm.zzh((String)object2, (Throwable)((Object)string3));
            }
            object2 = "_ac";
            boolean bl3 = object2.equals(string2);
            if (bl3) {
                object2 = "_r";
                bundle.putInt((String)object2, n7);
            }
            if (objectArray != null) {
                bundle.putAll((Bundle)objectArray);
            }
            if (bl3 = this.zzw((Context)object, (String)(objectArray = "com.google.android.gms.measurement.AppMeasurement"), (AtomicReference)(object2 = this.zzf), n7 != 0)) {
                object2 = this.zzh;
                string3 = "logEventInternal";
                if ((object2 = (Method)object2.get(string3)) == null) {
                    object = object.getClassLoader();
                    object = ((ClassLoader)object).loadClass((String)objectArray);
                    object2 = new Class[n4];
                    objectArray = String.class;
                    object2[0] = objectArray;
                    object2[n7] = objectArray;
                    objectArray = Bundle.class;
                    object2[n3] = objectArray;
                    object2 = ((Class)object).getDeclaredMethod(string3, (Class<?>)object2);
                    object = this.zzh;
                    try {
                        object.put(string3, object2);
                    }
                    catch (Exception exception) {
                        this.zzv(string3, n7 != 0);
                        bl3 = false;
                        object2 = null;
                    }
                }
                object = this.zzf;
                object = ((AtomicReference)object).get();
                objectArray = new Object[n4];
                String string5 = "am";
                objectArray[0] = string5;
                objectArray[n7] = string2;
                objectArray[n3] = bundle;
                try {
                    object2.invoke(object, objectArray);
                    return;
                }
                catch (Exception exception) {
                    this.zzv(string3, n7 != 0);
                }
            }
        }
    }

    private final void zzv(String object, boolean bl2) {
        Serializable serializable = this.zza;
        boolean bl3 = ((AtomicBoolean)serializable).get();
        if (!bl3) {
            String string2 = "Invoke Firebase method ";
            serializable = new StringBuilder(string2);
            ((StringBuilder)serializable).append((String)object);
            ((StringBuilder)serializable).append(" error.");
            object = ((StringBuilder)serializable).toString();
            zzm.zzj((String)object);
            if (bl2) {
                zzm.zzj("The Google Mobile Ads SDK will not integrate with Firebase. Admob/Firebase integration requires the latest Firebase SDK jar, but Firebase SDK is either missing or out of date");
                object = this.zza;
                bl2 = true;
                ((AtomicBoolean)object).set(bl2);
            }
        }
    }

    private final boolean zzw(Context context, String object, AtomicReference atomicReference, boolean bl2) {
        int n3 = 1;
        String string2 = "getInstance";
        Object object2 = atomicReference.get();
        if (object2 == null) {
            try {
                object2 = context.getClassLoader();
            }
            catch (Exception exception) {
                this.zzv(string2, bl2);
                return false;
            }
            object = ((ClassLoader)object2).loadClass((String)object);
            object2 = new Class[n3];
            Class<Context> clazz = Context.class;
            object2[0] = clazz;
            object = ((Class)object).getDeclaredMethod(string2, (Class<?>)object2);
            object2 = new Object[n3];
            object2[0] = context;
            context = null;
            object = ((Method)object).invoke(null, (Object[])object2);
            zzcar.zza(atomicReference, null, object);
        }
        return n3 != 0;
    }

    public final String zza(Context object) {
        String string2;
        boolean bl2 = this.zzp((Context)object);
        if (bl2 && (object = this.zzr(string2 = "generateEventId", (Context)object)) != null) {
            return object.toString();
        }
        return null;
    }

    public final String zzb(Context object) {
        Object object2;
        long l2;
        Object object3 = this.zzp((Context)object);
        if (object3 == 0) {
            return null;
        }
        Object object4 = zzbep.zzag;
        zzben zzben2 = zzba.zzc();
        object4 = (Long)zzben2.zza((zzbeg)object4);
        long l3 = (Long)object4;
        long l4 = l3 - (l2 = 0L);
        object3 = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        if (object3 < 0) {
            return (String)this.zzr("getAppInstanceId", (Context)object);
        }
        object4 = this.zzb.get();
        if (object4 == null) {
            object3 = ClientLibraryUtils.isPackageSide();
            if (object3 != 0) {
                object4 = zzfuu.zza();
                object2 = zzbep.zzah;
                object2 = (Integer)zzba.zzc().zza((zzbeg)object2);
                int n3 = (Integer)object2;
                zzcat zzcat2 = new zzcat(this);
                int n4 = 2;
                object4 = object4.zzc(n3, zzcat2, n4);
            } else {
                object2 = zzbep.zzah;
                Integer n7 = (Integer)zzba.zzc().zza((zzbeg)object2);
                int n8 = n7;
                zzben zzben3 = zzba.zzc();
                int n10 = (Integer)zzben3.zza((zzbeg)object2);
                TimeUnit timeUnit = TimeUnit.MINUTES;
                LinkedBlockingQueue<Runnable> linkedBlockingQueue = new LinkedBlockingQueue<Runnable>();
                zzcat zzcat3 = new zzcat(this);
                long l7 = 1L;
                object2 = object4;
                object4 = new ThreadPoolExecutor(n8, n10, l7, timeUnit, linkedBlockingQueue, zzcat3);
            }
            object2 = this.zzb;
            zzcar.zza((AtomicReference)object2, null, object4);
        }
        object4 = (ExecutorService)this.zzb.get();
        object2 = new zzcas(this, (Context)object);
        object = object4.submit(object2);
        object4 = TimeUnit.MILLISECONDS;
        object = object.get(l3, (TimeUnit)((Object)object4));
        try {
            return (String)object;
        }
        catch (Exception exception) {
            return null;
        }
        catch (TimeoutException timeoutException) {
            return "TIME_OUT";
        }
    }

    public final String zzc(Context object) {
        boolean bl2;
        Object object2;
        Object object3;
        String string2 = "getCurrentScreenName";
        boolean bl3 = this.zzp((Context)object);
        Object object4 = "";
        if (bl3 && (bl3 = this.zzw((Context)object, (String)(object3 = "com.google.android.gms.measurement.AppMeasurement"), (AtomicReference)(object2 = this.zzf), bl2 = true))) {
            block13: {
                object2 = this.zzs((Context)object, string2);
                object3 = this.zzf;
                object3 = ((AtomicReference)object3).get();
                bl2 = false;
                object2 = ((Method)object2).invoke(object3, null);
                object2 = (String)object2;
                if (object2 != null) break block13;
                object2 = "getCurrentScreenClass";
                object = this.zzs((Context)object, (String)object2);
                object2 = this.zzf;
                object2 = ((AtomicReference)object2).get();
                object2 = object = ((Method)object).invoke(object2, null);
                try {
                    object2 = (String)object;
                }
                catch (Exception exception) {
                    object = null;
                    this.zzv(string2, false);
                }
            }
            if (object2 != null) {
                object4 = object2;
            }
            return object4;
        }
        return object4;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final String zzd(Context object) {
        boolean bl2 = this.zzp((Context)object);
        if (!bl2) {
            return null;
        }
        Object object2 = this.zzc;
        synchronized (object2) {
            Throwable throwable2;
            block5: {
                String string2;
                try {
                    string2 = this.zzd;
                    if (string2 != null) {
                        return string2;
                    }
                }
                catch (Throwable throwable2) {
                    break block5;
                }
                string2 = "getGmpAppId";
                object = this.zzr(string2, (Context)object);
                object = (String)object;
                this.zzd = object;
                return object;
            }
            throw throwable2;
        }
    }

    public final /* synthetic */ String zze(Context context) {
        return (String)this.zzr("getAppInstanceId", context);
    }

    public final void zzf(Context context, String string2) {
        boolean bl2 = this.zzp(context);
        if (!bl2) {
            return;
        }
        this.zzt(context, string2, "beginAdUnitExposure");
    }

    public final void zzg(Context context, String string2) {
        boolean bl2 = this.zzp(context);
        if (!bl2) {
            return;
        }
        this.zzt(context, string2, "endAdUnitExposure");
    }

    public final void zzh(Context context, String string2) {
        this.zzu(context, "_aa", string2, null);
    }

    public final void zzi(Context context, String string2) {
        this.zzu(context, "_aq", string2, null);
    }

    public final void zzj(Context context, String string2, Map map2) {
        Bundle bundle = new Bundle();
        if (map2 != null) {
            boolean bl2;
            Iterator iterator = map2.keySet().iterator();
            while (bl2 = iterator.hasNext()) {
                String string3 = (String)iterator.next();
                String string4 = (String)map2.get(string3);
                bundle.putString(string3, string4);
            }
        }
        this.zzu(context, "_ac", string2, bundle);
    }

    public final void zzk(Context context, String string2, Map map2) {
        Bundle bundle = new Bundle();
        if (map2 != null) {
            boolean bl2;
            Iterator iterator = map2.keySet().iterator();
            while (bl2 = iterator.hasNext()) {
                String string3 = (String)iterator.next();
                String string4 = (String)map2.get(string3);
                bundle.putString(string3, string4);
            }
        }
        this.zzu(context, "_ai", string2, bundle);
    }

    public final void zzl(Context object, String string2, String string3, String string4, int n3) {
        boolean bl2 = this.zzp((Context)object);
        if (!bl2) {
            return;
        }
        string3 = px1_2.b("_ai", string3, "reward_type", string4);
        string3.putInt("reward_value", n3);
        this.zzu((Context)object, "_ar", string2, (Bundle)string3);
        object = new StringBuilder("Log a Firebase reward video event, reward type: ");
        ((StringBuilder)object).append(string4);
        ((StringBuilder)object).append(", reward value: ");
        ((StringBuilder)object).append(n3);
        com.google.android.gms.ads.internal.util.zze.zza(((StringBuilder)object).toString());
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final void zzm(Context object, zzl object2) {
        object2 = zzbep.zzan;
        zzben zzben2 = zzba.zzc();
        object2 = (Boolean)zzben2.zza((zzbeg)object2);
        boolean bl2 = (Boolean)object2;
        if (!bl2) return;
        bl2 = this.zzp((Context)object);
        if (!bl2) return;
        boolean bl3 = zzcau.zzq((Context)object);
        if (!bl3) {
            return;
        }
        object = this.zzk;
        // MONITORENTER : object
        // MONITOREXIT : object
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final void zzn(Context object, zzff object2) {
        zzcav.zzd((Context)object).zzb().zzc((zzff)object2);
        object2 = zzbep.zzan;
        zzben zzben2 = zzba.zzc();
        object2 = (Boolean)zzben2.zza((zzbeg)object2);
        boolean bl2 = (Boolean)object2;
        if (!bl2) return;
        bl2 = this.zzp((Context)object);
        if (!bl2) return;
        boolean bl3 = zzcau.zzq((Context)object);
        if (!bl3) {
            return;
        }
        object = this.zzk;
        // MONITORENTER : object
        // MONITOREXIT : object
    }

    public final void zzo(Context object, String string2) {
        GenericDeclaration genericDeclaration;
        Object object2;
        int n3 = 2;
        int n4 = 1;
        int n7 = 3;
        boolean bl2 = this.zzp((Context)object);
        if (bl2 && (bl2 = object instanceof Activity) && (bl2 = this.zzw((Context)object, (String)(object2 = "com.google.firebase.analytics.FirebaseAnalytics"), (AtomicReference)((Object)(genericDeclaration = this.zzg)), false))) {
            Class<String> clazz;
            genericDeclaration = this.zzh;
            String string3 = "setCurrentScreen";
            if ((genericDeclaration = (Method)genericDeclaration.get(string3)) == null) {
                genericDeclaration = object.getClassLoader();
                genericDeclaration = ((ClassLoader)((Object)genericDeclaration)).loadClass((String)object2);
                object2 = new Class[n7];
                clazz = Activity.class;
                object2[0] = clazz;
                clazz = String.class;
                object2[n4] = clazz;
                object2[n3] = clazz;
                genericDeclaration = ((Class)genericDeclaration).getDeclaredMethod(string3, (Class<?>)object2);
                object2 = this.zzh;
                try {
                    object2.put(string3, genericDeclaration);
                }
                catch (Exception exception) {
                    this.zzv(string3, false);
                    bl2 = false;
                    genericDeclaration = null;
                }
            }
            object2 = object;
            object2 = (Activity)object;
            clazz = this.zzg;
            clazz = ((AtomicReference)((Object)clazz)).get();
            object = object.getPackageName();
            Object[] objectArray = new Object[n7];
            objectArray[0] = object2;
            objectArray[n4] = string2;
            objectArray[n3] = object;
            try {
                ((Method)genericDeclaration).invoke(clazz, objectArray);
                return;
            }
            catch (Exception exception) {
                this.zzv(string3, false);
            }
        }
    }

    /*
     * Unable to fully structure code
     */
    public final boolean zzp(Context var1_1) {
        block4: {
            block5: {
                var2_2 = zzbep.zzaa;
                var2_2 = (Boolean)zzba.zzc().zza((zzbeg)var2_2);
                var3_3 = var2_2.booleanValue();
                if (var3_3 == 0 || (var3_3 = (var2_2 = this.zza).get()) != 0) break block4;
                var2_2 = zzbep.zzal;
                var4_4 = zzba.zzc();
                var2_2 = (Boolean)var4_4.zza((zzbeg)var2_2);
                var3_3 = var2_2.booleanValue();
                var5_5 = 1;
                if (var3_3 != 0) {
                    return (boolean)var5_5;
                }
                var2_2 = this.zze;
                var3_3 = var2_2.get();
                if (var3_3 != (var6_6 = -1)) break block5;
                zzay.zzb();
                var3_3 = (int)com.google.android.gms.ads.internal.util.client.zzf.zzt((Context)var1_1, 12451000);
                if (var3_3 != 0) ** GOTO lbl-1000
                zzay.zzb();
                var7_7 = com.google.android.gms.ads.internal.util.client.zzf.zzu((Context)var1_1);
                if (var7_7 != 0) {
                    zzm.zzj("Google Play Service is out of date, the Google Mobile Ads SDK will not integrate with Firebase. Admob/Firebase integration requires updated Google Play Service.");
                    var1_1 = this.zze;
                    var1_1.set(0);
                } else lbl-1000:
                // 2 sources

                {
                    var1_1 = this.zze;
                    var1_1.set(var5_5);
                }
            }
            if ((var7_7 = (var1_1 = this.zze).get()) == var5_5) {
                return (boolean)var5_5;
            }
        }
        return false;
    }
}

