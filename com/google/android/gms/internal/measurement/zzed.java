/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.app.Application
 *  android.app.Application$ActivityLifecycleCallbacks
 *  android.content.Context
 *  android.content.Intent
 *  android.os.BadParcelableException
 *  android.os.Bundle
 *  android.os.IBinder
 *  android.os.NetworkOnMainThreadException
 *  android.os.RemoteException
 *  android.util.Pair
 */
package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.IBinder;
import android.os.NetworkOnMainThreadException;
import android.os.RemoteException;
import android.util.Pair;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.DynamiteModule$LoadingException;
import com.google.android.gms.dynamite.DynamiteModule$VersionPolicy;
import com.google.android.gms.internal.measurement.zzde;
import com.google.android.gms.internal.measurement.zzdl;
import com.google.android.gms.internal.measurement.zzdm;
import com.google.android.gms.internal.measurement.zzdo;
import com.google.android.gms.internal.measurement.zzdw;
import com.google.android.gms.internal.measurement.zzeb;
import com.google.android.gms.internal.measurement.zzed$zza;
import com.google.android.gms.internal.measurement.zzed$zzb;
import com.google.android.gms.internal.measurement.zzed$zzc;
import com.google.android.gms.internal.measurement.zzed$zzd;
import com.google.android.gms.internal.measurement.zzef;
import com.google.android.gms.internal.measurement.zzeg;
import com.google.android.gms.internal.measurement.zzeh;
import com.google.android.gms.internal.measurement.zzei;
import com.google.android.gms.internal.measurement.zzej;
import com.google.android.gms.internal.measurement.zzek;
import com.google.android.gms.internal.measurement.zzel;
import com.google.android.gms.internal.measurement.zzem;
import com.google.android.gms.internal.measurement.zzen;
import com.google.android.gms.internal.measurement.zzeo;
import com.google.android.gms.internal.measurement.zzep;
import com.google.android.gms.internal.measurement.zzeq;
import com.google.android.gms.internal.measurement.zzer;
import com.google.android.gms.internal.measurement.zzes;
import com.google.android.gms.internal.measurement.zzet;
import com.google.android.gms.internal.measurement.zzeu;
import com.google.android.gms.internal.measurement.zzev;
import com.google.android.gms.internal.measurement.zzex;
import com.google.android.gms.internal.measurement.zzey;
import com.google.android.gms.internal.measurement.zzez;
import com.google.android.gms.internal.measurement.zzfa;
import com.google.android.gms.internal.measurement.zzfb;
import com.google.android.gms.internal.measurement.zzfc;
import com.google.android.gms.internal.measurement.zzfd;
import com.google.android.gms.internal.measurement.zzfe;
import com.google.android.gms.internal.measurement.zzff;
import com.google.android.gms.internal.measurement.zzfg;
import com.google.android.gms.internal.measurement.zzfh;
import com.google.android.gms.internal.measurement.zzfi;
import com.google.android.gms.internal.measurement.zzfj;
import com.google.android.gms.internal.measurement.zzfk;
import com.google.android.gms.internal.measurement.zzfl;
import com.google.android.gms.internal.measurement.zzfm;
import com.google.android.gms.internal.measurement.zzfn;
import com.google.android.gms.internal.measurement.zzfo;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.android.gms.measurement.internal.zzhw;
import com.google.android.gms.measurement.internal.zzjq;
import com.google.android.gms.measurement.internal.zzjt;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadFactory;

public class zzed {
    private static volatile zzed zzb;
    protected final Clock zza;
    private final String zzc;
    private final ExecutorService zzd;
    private final AppMeasurementSdk zze;
    private final List zzf;
    private int zzg;
    private boolean zzh;
    private String zzi;
    private volatile zzdl zzj;

    private zzed(Context context, String object, String string2, String string3, Bundle bundle) {
        boolean bl2;
        if (object != null && (bl2 = this.zzc(string2, string3))) {
            this.zzc = object;
        } else {
            object = "FA";
            this.zzc = object;
        }
        this.zza = object = DefaultClock.getInstance();
        object = zzde.zza();
        Object object2 = new zzep(this);
        int n3 = 1;
        this.zzd = object = object.zza((ThreadFactory)object2, n3);
        this.zze = object = new AppMeasurementSdk(this);
        object = new ArrayList();
        this.zzf = object;
        boolean bl3 = zzed.zzb(context);
        if (bl3 && !(bl3 = this.zzk())) {
            this.zzi = null;
            this.zzh = n3;
            return;
        }
        bl3 = this.zzc(string2, string3);
        this.zzi = !bl3 ? (object = "fa") : string2;
        object2 = object;
        object = new zzeg(this, string2, string3, context, bundle);
        this.zza((zzed$zzb)object);
        context = (Application)context.getApplicationContext();
        if (context == null) {
            return;
        }
        object = new zzed$zzc(this);
        context.registerActivityLifecycleCallbacks((Application.ActivityLifecycleCallbacks)object);
    }

    public static /* bridge */ /* synthetic */ zzdl zza(zzed zzed2) {
        return zzed2.zzj;
    }

    public static zzed zza(Context context) {
        return zzed.zza(context, null, null, null, null);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static zzed zza(Context context, String string2, String string3, String string4, Bundle bundle) {
        Preconditions.checkNotNull(context);
        Object object = zzb;
        if (object != null) return zzb;
        object = zzed.class;
        synchronized (object) {
            try {
                zzed zzed2 = zzb;
                if (zzed2 != null) return zzb;
                zzb = zzed2 = new zzed(context, string2, string3, string4, bundle);
                return zzb;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    private final void zza(zzed$zzb zzed$zzb) {
        this.zzd.execute(zzed$zzb);
    }

    public static /* bridge */ /* synthetic */ void zza(zzed zzed2, zzdl zzdl2) {
        zzed2.zzj = zzdl2;
    }

    public static /* bridge */ /* synthetic */ void zza(zzed zzed2, zzed$zzb zzed$zzb) {
        zzed2.zza(zzed$zzb);
    }

    public static /* bridge */ /* synthetic */ void zza(zzed zzed2, Exception exception, boolean bl2, boolean bl3) {
        zzed2.zza(exception, bl2, bl3);
    }

    private final void zza(Exception exception, boolean bl2, boolean bl3) {
        boolean bl4;
        this.zzh = bl4 = this.zzh | bl2;
        if (bl2) {
            return;
        }
        if (bl3) {
            int n3 = 5;
            String string2 = "Error with data collection. Data lost.";
            this.zza(n3, string2, exception, null, null);
        }
    }

    private final void zza(String string2, String string3, Bundle bundle, boolean bl2, boolean bl3, Long l2) {
        zzfn zzfn2 = new zzfn(this, l2, string2, string3, bundle, bl2, bl3);
        this.zza(zzfn2);
    }

    public static /* synthetic */ boolean zza(zzed zzed2, String string2, String string3) {
        return zzed2.zzc(string2, string3);
    }

    public static /* bridge */ /* synthetic */ String zzb(zzed zzed2) {
        return zzed2.zzc;
    }

    private static boolean zzb(Context object) {
        String string2;
        String string3;
        try {
            string3 = zzhw.zza(object);
            string2 = "google_app_id";
        }
        catch (IllegalStateException illegalStateException) {}
        zzhw zzhw2 = new zzhw((Context)object, string3);
        object = zzhw2.zza(string2);
        if (object != null) {
            return true;
        }
        return false;
    }

    public static /* bridge */ /* synthetic */ boolean zzc(zzed zzed2) {
        return zzed2.zzh;
    }

    private final boolean zzc(String string2, String string3) {
        boolean bl2;
        return string3 != null && string2 != null && !(bl2 = this.zzk());
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private final boolean zzk() {
        Object object;
        boolean bl2 = false;
        String string2 = "com.google.firebase.analytics.FirebaseAnalytics";
        try {
            object = this.getClass();
        }
        catch (ClassNotFoundException classNotFoundException) {
            return bl2;
        }
        object = ((Class)object).getClassLoader();
        Class.forName(string2, false, (ClassLoader)object);
        return true;
    }

    public final int zza(String object) {
        Object object2 = new zzdm();
        zzfg zzfg2 = new zzfg(this, (String)object, (zzdm)object2);
        this.zza(zzfg2);
        long l2 = 10000L;
        object = ((zzdm)object2).zza(l2);
        object2 = Integer.class;
        object = (Integer)zzdm.zza((Bundle)object, (Class)object2);
        if (object == null) {
            return 25;
        }
        return (Integer)object;
    }

    public final long zza() {
        Object object = new zzdm();
        zzex zzex2 = new zzex(this, (zzdm)object);
        this.zza(zzex2);
        long l2 = 500L;
        object = ((zzdm)object).zzb(l2);
        if (object == null) {
            int n3;
            l2 = System.nanoTime();
            long l3 = this.zza.currentTimeMillis();
            object = new Random(l2 ^= l3);
            long l4 = ((Random)object).nextLong();
            this.zzg = n3 = this.zzg + 1;
            long l7 = n3;
            return l4 + l7;
        }
        return (Long)object;
    }

    public final Bundle zza(Bundle bundle, boolean bl2) {
        zzdm zzdm2 = new zzdm();
        zzfd zzfd2 = new zzfd(this, bundle, zzdm2);
        this.zza(zzfd2);
        if (bl2) {
            return zzdm2.zza(5000L);
        }
        return null;
    }

    public final zzdl zza(Context object, boolean bl2) {
        String string2;
        Object object2;
        try {
            object2 = DynamiteModule.PREFER_HIGHEST_OR_LOCAL_VERSION;
            string2 = "com.google.android.gms.measurement.dynamite";
        }
        catch (DynamiteModule$LoadingException dynamiteModule$LoadingException) {
            this.zza(dynamiteModule$LoadingException, true, false);
            return null;
        }
        object = DynamiteModule.load((Context)object, (DynamiteModule$VersionPolicy)object2, string2);
        object2 = "com.google.android.gms.measurement.internal.AppMeasurementDynamiteService";
        object = ((DynamiteModule)object).instantiate((String)object2);
        return zzdo.asInterface((IBinder)object);
    }

    public final Object zza(int n3) {
        zzdm zzdm2 = new zzdm();
        zzfh zzfh2 = new zzfh(this, zzdm2, n3);
        this.zza(zzfh2);
        return zzdm.zza(zzdm2.zza(15000L), Object.class);
    }

    public final List zza(String list, String object) {
        zzdm zzdm2 = new zzdm();
        zzek zzek2 = new zzek(this, (String)((Object)list), (String)object, zzdm2);
        this.zza(zzek2);
        long l2 = 5000L;
        list = zzdm2.zza(l2);
        object = List.class;
        list = (List)zzdm.zza((Bundle)list, (Class)object);
        if (list == null) {
            list = Collections.emptyList();
        }
        return list;
    }

    public final Map zza(String string2, String hashMap, boolean bl2) {
        int n3;
        zzfc zzfc2;
        zzdm zzdm2 = new zzdm();
        Object object = zzfc2;
        Object object2 = this;
        zzfc2 = new zzfc(this, string2, (String)((Object)hashMap), bl2, zzdm2);
        this.zza(zzfc2);
        long l2 = 5000L;
        string2 = zzdm2.zza(l2);
        if (string2 != null && (n3 = string2.size()) != 0) {
            boolean bl3;
            int n4 = string2.size();
            hashMap = new HashMap<Object, Object>(n4);
            Iterator iterator = string2.keySet().iterator();
            while (bl3 = iterator.hasNext()) {
                object = (String)iterator.next();
                object2 = string2.get((String)object);
                boolean bl4 = object2 instanceof Double;
                if (!bl4 && !(bl4 = object2 instanceof Long) && !(bl4 = object2 instanceof String)) continue;
                hashMap.put(object, object2);
            }
            return hashMap;
        }
        return Collections.emptyMap();
    }

    public final void zza(int n3, String string2, Object object, Object object2, Object object3) {
        zzfe zzfe2 = new zzfe(this, false, 5, string2, object, null, null);
        this.zza(zzfe2);
    }

    public final void zza(long l2) {
        zzes zzes2 = new zzes(this, l2);
        this.zza(zzes2);
    }

    public final void zza(Activity object, String string2, String string3) {
        object = zzeb.zza(object);
        zzem zzem2 = new zzem(this, (zzeb)object, string2, string3);
        this.zza(zzem2);
    }

    public final void zza(Intent intent) {
        zzfm zzfm2 = new zzfm(this, intent);
        this.zza(zzfm2);
    }

    public final void zza(Bundle bundle) {
        zzei zzei2 = new zzei(this, bundle);
        this.zza(zzei2);
    }

    public final void zza(zzjq object) {
        zzed$zza zzed$zza = new zzed$zza((zzjq)object);
        object = this.zzj;
        if (object != null) {
            object = this.zzj;
            try {
                object.setEventInterceptor(zzed$zza);
                return;
            }
            catch (BadParcelableException | NetworkOnMainThreadException | RemoteException | IllegalArgumentException | IllegalStateException | NullPointerException | SecurityException | UnsupportedOperationException throwable) {}
        }
        object = new zzfb(this, zzed$zza);
        this.zza((zzed$zzb)object);
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zza(zzjt object) {
        zzed$zzd zzed$zzd;
        block7: {
            Preconditions.checkNotNull(object);
            List list = this.zzf;
            synchronized (list) {
                Object object2;
                int n3;
                zzed$zzd = null;
                for (int i3 = 0; i3 < (n3 = (object2 = this.zzf).size()); ++i3) {
                    object2 = this.zzf;
                    object2 = object2.get(i3);
                    object2 = (Pair)object2;
                    object2 = ((Pair)object2).first;
                    n3 = (int)(object.equals(object2) ? 1 : 0);
                    if (n3 == 0) continue;
                    return;
                }
                zzed$zzd = new zzed$zzd((zzjt)object);
                object2 = this.zzf;
                Pair pair = new Pair(object, (Object)zzed$zzd);
                object2.add(pair);
                // MONITOREXIT @DISABLED, blocks:[0, 3] lbl21 : MonitorExitStatement: MONITOREXIT : var2_3
                object = this.zzj;
                if (object == null) break block7;
            }
            try {
                object = this.zzj;
                object.registerOnMeasurementEventListener(zzed$zzd);
                return;
            }
            catch (BadParcelableException | NetworkOnMainThreadException | RemoteException | IllegalArgumentException | IllegalStateException | NullPointerException | SecurityException | UnsupportedOperationException throwable) {}
        }
        object = new zzfl(this, zzed$zzd);
        this.zza((zzed$zzb)object);
        return;
        {
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    public final void zza(Boolean bl2) {
        zzel zzel2 = new zzel(this, bl2);
        this.zza(zzel2);
    }

    public final void zza(Runnable runnable2) {
        zzet zzet2 = new zzet(this, runnable2);
        this.zza(zzet2);
    }

    public final void zza(String string2, Bundle bundle) {
        this.zza(null, string2, bundle, false, true, null);
    }

    public final void zza(String string2, String string3, Bundle bundle) {
        zzeh zzeh2 = new zzeh(this, string2, string3, bundle);
        this.zza(zzeh2);
    }

    public final void zza(String string2, String string3, Bundle bundle, long l2) {
        Long l3 = l2;
        this.zza(string2, string3, bundle, true, false, l3);
    }

    public final void zza(String string2, String string3, Object object, boolean bl2) {
        zzef zzef2 = new zzef(this, string2, string3, object, bl2);
        this.zza(zzef2);
    }

    public final void zza(boolean bl2) {
        zzfk zzfk2 = new zzfk(this, bl2);
        this.zza(zzfk2);
    }

    public final AppMeasurementSdk zzb() {
        return this.zze;
    }

    public final void zzb(Bundle bundle) {
        zzeo zzeo2 = new zzeo(this, bundle);
        this.zza(zzeo2);
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzb(zzjt object) {
        Object object2;
        block10: {
            Preconditions.checkNotNull(object);
            object2 = this.zzf;
            synchronized (object2) {
                List list;
                int n3;
                block9: {
                    Object object3;
                    int n4;
                    n3 = 0;
                    list = null;
                    while (n3 < (n4 = (object3 = this.zzf).size())) {
                        object3 = this.zzf;
                        object3 = object3.get(n3);
                        object3 = (Pair)object3;
                        object3 = ((Pair)object3).first;
                        n4 = (int)(object.equals(object3) ? 1 : 0);
                        if (n4 == 0) {
                            ++n3;
                            continue;
                        }
                        break block9;
                    }
                    return;
                }
                object = this.zzf;
                object = object.get(n3);
                object = (Pair)object;
                if (object == null) {
                    return;
                }
                list = this.zzf;
                list.remove(object);
                object = ((Pair)object).second;
                object = (zzed$zzd)object;
                // MONITOREXIT @DISABLED, blocks:[0, 3] lbl30 : MonitorExitStatement: MONITOREXIT : var2_3
                object2 = this.zzj;
                if (object2 == null) break block10;
            }
            try {
                object2 = this.zzj;
                object2.unregisterOnMeasurementEventListener((zzdw)object);
                return;
            }
            catch (BadParcelableException | NetworkOnMainThreadException | RemoteException | IllegalArgumentException | IllegalStateException | NullPointerException | SecurityException | UnsupportedOperationException throwable) {}
        }
        object2 = new zzfo(this, (zzed$zzd)object);
        this.zza((zzed$zzb)object2);
        return;
        {
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    public final void zzb(String string2) {
        zzer zzer2 = new zzer(this, string2);
        this.zza(zzer2);
    }

    public final void zzb(String string2, String string3) {
        this.zza(null, string2, string3, false);
    }

    public final void zzb(String string2, String string3, Bundle bundle) {
        this.zza(string2, string3, bundle, true, true, null);
    }

    public final Long zzc() {
        zzdm zzdm2 = new zzdm();
        zzfi zzfi2 = new zzfi(this, zzdm2);
        this.zza(zzfi2);
        return zzdm2.zzb(120000L);
    }

    public final void zzc(Bundle bundle) {
        zzen zzen2 = new zzen(this, bundle);
        this.zza(zzen2);
    }

    public final void zzc(String string2) {
        zzeu zzeu2 = new zzeu(this, string2);
        this.zza(zzeu2);
    }

    public final String zzd() {
        return this.zzi;
    }

    public final void zzd(Bundle bundle) {
        zzfj zzfj2 = new zzfj(this, bundle);
        this.zza(zzfj2);
    }

    public final void zzd(String string2) {
        zzej zzej2 = new zzej(this, string2);
        this.zza(zzej2);
    }

    public final String zze() {
        zzdm zzdm2 = new zzdm();
        zzff zzff2 = new zzff(this, zzdm2);
        this.zza(zzff2);
        return zzdm2.zzc(120000L);
    }

    public final String zzf() {
        zzdm zzdm2 = new zzdm();
        zzey zzey2 = new zzey(this, zzdm2);
        this.zza(zzey2);
        return zzdm2.zzc(50);
    }

    public final String zzg() {
        zzdm zzdm2 = new zzdm();
        zzez zzez2 = new zzez(this, zzdm2);
        this.zza(zzez2);
        return zzdm2.zzc(500L);
    }

    public final String zzh() {
        zzdm zzdm2 = new zzdm();
        zzfa zzfa2 = new zzfa(this, zzdm2);
        this.zza(zzfa2);
        return zzdm2.zzc(500L);
    }

    public final String zzi() {
        zzdm zzdm2 = new zzdm();
        zzev zzev2 = new zzev(this, zzdm2);
        this.zza(zzev2);
        return zzdm2.zzc(500L);
    }

    public final void zzj() {
        zzeq zzeq2 = new zzeq(this);
        this.zza(zzeq2);
    }
}

