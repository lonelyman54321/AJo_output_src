/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.app.Application
 *  android.app.Application$ActivityLifecycleCallbacks
 *  android.content.Context
 *  android.os.Bundle
 */
package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.ads.internal.util.zzt;
import com.google.android.gms.ads.internal.zzu;
import com.google.android.gms.internal.ads.zzbbe;
import com.google.android.gms.internal.ads.zzbbg;
import com.google.android.gms.internal.ads.zzbbu;
import com.google.android.gms.internal.ads.zzbeg;
import com.google.android.gms.internal.ads.zzben;
import com.google.android.gms.internal.ads.zzbep;
import com.google.android.gms.internal.ads.zzcby;
import java.util.ArrayList;
import java.util.List;

final class zzbbf
implements Application.ActivityLifecycleCallbacks {
    private Activity zza;
    private Context zzb;
    private final Object zzc;
    private boolean zzd;
    private boolean zze;
    private final List zzf;
    private final List zzg;
    private Runnable zzh;
    private boolean zzi;
    private long zzj;

    public zzbbf() {
        ArrayList arrayList;
        Object object;
        this.zzc = object = new Object();
        this.zzd = true;
        this.zze = false;
        this.zzf = arrayList = new ArrayList();
        this.zzg = arrayList = new ArrayList();
        this.zzi = false;
    }

    public static /* bridge */ /* synthetic */ Object zzc(zzbbf zzbbf2) {
        return zzbbf2.zzc;
    }

    public static /* bridge */ /* synthetic */ List zzd(zzbbf zzbbf2) {
        return zzbbf2.zzf;
    }

    public static /* bridge */ /* synthetic */ void zze(zzbbf zzbbf2, boolean bl2) {
        zzbbf2.zzd = false;
    }

    public static /* bridge */ /* synthetic */ boolean zzi(zzbbf zzbbf2) {
        return zzbbf2.zzd;
    }

    public static /* bridge */ /* synthetic */ boolean zzj(zzbbf zzbbf2) {
        return zzbbf2.zze;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final void zzk(Activity activity) {
        Object object = this.zzc;
        synchronized (object) {
            Throwable throwable2;
            block4: {
                block3: {
                    try {
                        Object object2 = activity.getClass();
                        object2 = ((Class)object2).getName();
                        String string2 = "com.google.android.gms.ads";
                        boolean bl2 = ((String)object2).startsWith(string2);
                        if (bl2) break block3;
                        this.zza = activity;
                    }
                    catch (Throwable throwable2) {
                        break block4;
                    }
                }
                return;
            }
            throw throwable2;
        }
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void onActivityDestroyed(Activity object) {
        Object object2 = this.zzc;
        synchronized (object2) {
            Object object3;
            block10: {
                Throwable throwable2;
                block9: {
                    try {
                        object3 = this.zza;
                        if (object3 == null) {
                            return;
                        }
                    }
                    catch (Throwable throwable2) {
                        break block9;
                    }
                    boolean bl2 = object3.equals(object);
                    if (bl2) {
                        bl2 = false;
                        object = null;
                        this.zza = null;
                    }
                    break block10;
                }
                throw throwable2;
            }
            object = this.zzg;
            object = object.iterator();
            boolean bl3;
            while (bl3 = object.hasNext()) {
                object3 = object.next();
                object3 = (zzbbu)object3;
                try {
                    bl3 = object3.zza();
                    if (!bl3) continue;
                    object.remove();
                }
                catch (Exception exception) {
                    Object object4 = zzu.zzo();
                    String string2 = "AppActivityTracker.ActivityListener.onActivityDestroyed";
                    ((zzcby)object4).zzw(exception, string2);
                    object4 = "";
                    zzm.zzh((String)object4, exception);
                    continue;
                }
                break;
            }
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final void onActivityPaused(Activity object) {
        boolean bl2;
        boolean bl3;
        this.zzk((Activity)object);
        object = this.zzc;
        // MONITORENTER : object
        Object object2 = this.zzg;
        object2 = object2.iterator();
        while (bl3 = object2.hasNext()) {
            Object object3 = object2.next();
            object3 = (zzbbu)object3;
            try {
                object3.zzb();
            }
            catch (Exception exception) {
                Object object4 = zzu.zzo();
                String string2 = "AppActivityTracker.ActivityListener.onActivityPaused";
                ((zzcby)object4).zzw(exception, string2);
                object4 = "";
                zzm.zzh((String)object4, exception);
            }
        }
        // MONITOREXIT : object
        this.zze = bl2 = true;
        object = this.zzh;
        if (object != null) {
            object2 = zzt.zza;
            object2.removeCallbacks((Runnable)object);
        }
        object = zzt.zza;
        object2 = new zzbbe(this);
        this.zzh = object2;
        long l2 = this.zzj;
        object.postDelayed((Runnable)object2, l2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void onActivityResumed(Activity object) {
        Object object2;
        this.zzk((Activity)object);
        object = null;
        this.zze = false;
        boolean bl2 = this.zzd;
        boolean bl3 = true;
        bl2 ^= bl3;
        this.zzd = bl3;
        Object object3 = this.zzh;
        if (object3 != null) {
            object2 = zzt.zza;
            object2.removeCallbacks((Runnable)object3);
        }
        object3 = this.zzc;
        synchronized (object3) {
            Object object4;
            boolean bl4;
            try {
                object2 = this.zzg;
                object2 = object2.iterator();
            }
            catch (Throwable throwable) {}
            throw throwable;
            while (bl4 = object2.hasNext()) {
                object4 = object2.next();
                object4 = (zzbbu)object4;
                try {
                    object4.zzc();
                }
                catch (Exception exception) {
                    Object object5 = zzu.zzo();
                    String string2 = "AppActivityTracker.ActivityListener.onActivityResumed";
                    ((zzcby)object5).zzw(exception, string2);
                    object5 = "";
                    zzm.zzh((String)object5, exception);
                }
            }
            if (!bl2) {
                object = "App is still foreground.";
                zzm.zze((String)object);
            } else {
                boolean bl5;
                object = this.zzf;
                object = object.iterator();
                while (bl5 = object.hasNext()) {
                    object2 = object.next();
                    object2 = (zzbbg)object2;
                    try {
                        object2.zza(bl3);
                    }
                    catch (Exception exception) {
                        object4 = "";
                        zzm.zzh((String)object4, exception);
                    }
                }
            }
            return;
        }
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public final void onActivityStarted(Activity activity) {
        this.zzk(activity);
    }

    public final void onActivityStopped(Activity activity) {
    }

    public final Activity zza() {
        return this.zza;
    }

    public final Context zzb() {
        return this.zzb;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzf(zzbbg zzbbg2) {
        Object object = this.zzc;
        synchronized (object) {
            List list = this.zzf;
            list.add(zzbbg2);
            return;
        }
    }

    public final void zzg(Application object, Context object2) {
        boolean bl2 = this.zzi;
        if (!bl2) {
            boolean bl3;
            long l2;
            object.registerActivityLifecycleCallbacks((Application.ActivityLifecycleCallbacks)this);
            bl2 = object2 instanceof Activity;
            if (bl2) {
                object2 = (Activity)object2;
                this.zzk((Activity)object2);
            }
            this.zzb = object;
            object = zzbep.zzaT;
            object2 = zzba.zzc();
            object = (Long)((zzben)object2).zza((zzbeg)object);
            this.zzj = l2 = ((Long)object).longValue();
            this.zzi = bl3 = true;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzh(zzbbg zzbbg2) {
        Object object = this.zzc;
        synchronized (object) {
            List list = this.zzf;
            list.remove(zzbbg2);
            return;
        }
    }
}

