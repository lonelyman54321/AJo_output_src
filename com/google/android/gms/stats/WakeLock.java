/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.PowerManager
 *  android.os.PowerManager$WakeLock
 *  android.os.WorkSource
 *  android.text.TextUtils
 *  android.util.Log
 */
package com.google.android.gms.stats;

import android.content.Context;
import android.os.PowerManager;
import android.os.WorkSource;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.common.util.Strings;
import com.google.android.gms.common.util.WorkSourceUtil;
import com.google.android.gms.internal.stats.zzh;
import com.google.android.gms.stats.zza;
import com.google.android.gms.stats.zzb;
import com.google.android.gms.stats.zzc;
import com.google.android.gms.stats.zzd;
import com.google.android.gms.stats.zze;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public class WakeLock {
    private static final long zzb;
    private static volatile ScheduledExecutorService zzc;
    private static final Object zzd;
    private static volatile zzd zze;
    com.google.android.gms.internal.stats.zzb zza;
    private final Object zzf;
    private final PowerManager.WakeLock zzg;
    private int zzh;
    private Future zzi;
    private long zzj;
    private final Set zzk;
    private boolean zzl;
    private int zzm;
    private Clock zzn;
    private WorkSource zzo;
    private final String zzp;
    private final String zzq;
    private final Context zzr;
    private final Map zzs;
    private AtomicInteger zzt;
    private final ScheduledExecutorService zzu;

    static {
        Object object;
        zzb = TimeUnit.DAYS.toMillis(366L);
        zzc = null;
        zzd = object = new Object();
        zze = object = new zzb();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public WakeLock(Context object, int n3, String string2) {
        block12: {
            Object object2;
            HashSet hashSet;
            Object object3;
            String string3 = object.getPackageName();
            this.zzf = object3 = new Object();
            object3 = null;
            this.zzh = 0;
            this.zzk = hashSet = new HashSet();
            int n4 = 1;
            this.zzl = n4;
            Object object4 = DefaultClock.getInstance();
            this.zzn = object4;
            object4 = new HashMap();
            this.zzs = object4;
            super(0);
            this.zzt = object4;
            Preconditions.checkNotNull(object, "WakeLock: context must not be null");
            Preconditions.checkNotEmpty(string2, "WakeLock: wakeLockName must not be empty");
            object4 = object.getApplicationContext();
            this.zzr = object4;
            this.zzq = string2;
            this.zza = null;
            object4 = "com.google.android.gms";
            String string4 = object.getPackageName();
            boolean bl2 = ((String)object4).equals(string4);
            if (!bl2) {
                object4 = String.valueOf(string2);
                string4 = "*gcore*:";
                int n7 = ((String)object4).length();
                object4 = n7 != 0 ? string4.concat((String)object4) : new String(string4);
                this.zzp = object4;
            } else {
                this.zzp = string2;
            }
            object4 = (PowerManager)object.getSystemService("power");
            if (object4 == null) {
                int n8 = 29;
                CharSequence charSequence = new StringBuilder(n8);
                charSequence.append("expected a non-null reference", 0, n8);
                charSequence = charSequence.toString();
                super((String)charSequence);
                throw object;
            }
            this.zzg = object2 = object4.newWakeLock(n3, string2);
            boolean bl3 = WorkSourceUtil.hasWorkSourcePermission(object);
            if (bl3) {
                bl3 = Strings.isEmptyOrWhitespace(string3);
                if (bl3) {
                    string3 = object.getPackageName();
                }
                object = WorkSourceUtil.fromPackage(object, string3);
                this.zzo = object;
                if (object != null) {
                    WakeLock.zze(object2, (WorkSource)object);
                }
            }
            if ((object = zzc) == null) {
                object2 = zzd;
                synchronized (object2) {
                    Throwable throwable2;
                    block11: {
                        block10: {
                            try {
                                object = zzc;
                                if (object != null) break block10;
                                com.google.android.gms.internal.stats.zzh.zza();
                                object = Executors.newScheduledThreadPool(n4);
                                object = Executors.unconfigurableScheduledExecutorService((ScheduledExecutorService)object);
                                zzc = object;
                            }
                            catch (Throwable throwable2) {
                                break block11;
                            }
                        }
                        break block12;
                    }
                    throw throwable2;
                }
            }
        }
        this.zzu = object;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static /* synthetic */ void zza(WakeLock wakeLock) {
        Object object = wakeLock.zzf;
        synchronized (object) {
            Throwable throwable2;
            block5: {
                boolean bl2;
                try {
                    bl2 = wakeLock.isHeld();
                    if (!bl2) {
                        return;
                    }
                }
                catch (Throwable throwable2) {
                    break block5;
                }
                String string2 = wakeLock.zzp;
                string2 = String.valueOf(string2);
                String string3 = " ** IS FORCE-RELEASED ON TIMEOUT **";
                string2.concat(string3);
                wakeLock.zzc();
                bl2 = wakeLock.isHeld();
                if (!bl2) {
                    return;
                }
                bl2 = true;
                wakeLock.zzh = (int)(bl2 ? 1 : 0);
                bl2 = false;
                string2 = null;
                wakeLock.zzd(0);
                return;
            }
            throw throwable2;
        }
    }

    private final String zzb(String string2) {
        boolean bl2 = this.zzl;
        if (bl2) {
            TextUtils.isEmpty(null);
        }
        return null;
    }

    private final void zzc() {
        Object object = this.zzk;
        boolean bl2 = object.isEmpty();
        if (bl2) {
            return;
        }
        Set set = this.zzk;
        object = new ArrayList(set);
        set = this.zzk;
        set.clear();
        int n3 = ((ArrayList)object).size();
        if (n3 <= 0) {
            return;
        }
        object = (zze)((ArrayList)object).get(0);
        throw null;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final void zzd(int var1_1) {
        var2_2 = this.zzf;
        synchronized (var2_2) {
            block20: {
                var3_3 = this.isHeld();
                if (var3_3 == 0) {
                    return;
                }
                {
                    catch (Throwable var4_4) {
                        break block20;
                    }
                    var3_3 = this.zzl;
                    var5_8 = false;
                    var6_9 = null;
                    if (var3_3 != 0) {
                        this.zzh = var3_3 = this.zzh + -1;
                        if (var3_3 > 0) {
                            return;
                        }
                    } else {
                        this.zzh = 0;
                    }
                    this.zzc();
                    var4_5 = this.zzs;
                    var4_5 = var4_5.values();
                    var4_5 = var4_5.iterator();
                    while (var7_10 = var4_5.hasNext()) {
                        var8_11 /* !! */  = var4_5.next();
                        var8_11 /* !! */  = (zzc)var8_11 /* !! */ ;
                        var8_11 /* !! */ .zza = 0;
                    }
                    var4_5 = this.zzs;
                    var4_5.clear();
                    var4_5 = this.zzi;
                    var7_10 = false;
                    var8_11 /* !! */  = null;
                    if (var4_5 != null) {
                        var4_5.cancel(false);
                        this.zzi = null;
                        this.zzj = var9_12 = 0L;
                    }
                    this.zzm = 0;
                    var4_5 = this.zzg;
                    var3_3 = (int)var4_5.isHeld();
                    if (var3_3 == 0) ** GOTO lbl71
                    try {
                        var4_5 = this.zzg;
                        var4_5.release();
                    }
                    catch (Throwable var4_6) {
                        ** GOTO lbl-1000
                    }
                    catch (RuntimeException var4_7) {}
                    {
                        var6_9 = var4_7.getClass();
                        var11_13 = RuntimeException.class;
                        var5_8 = var6_9.equals(var11_13);
                        if (!var5_8) ** GOTO lbl-1000
                        var4_5 = this.zzp;
                        var4_5 = String.valueOf(var4_5);
                        var6_9 = " failed to release!";
                        var4_5.concat((String)var6_9);
                    }
                    {
                        var4_5 = this.zza;
                        if (var4_5 != null) {
                            this.zza = null;
                        }
                        ** GOTO lbl76
                    }
lbl-1000:
                    // 1 sources

                    {
                        throw var4_7;
                    }
                }
                {
                    var4_5 = this.zza;
                    if (var4_5 != null) {
                        this.zza = null;
                    }
                    ** GOTO lbl76
                }
lbl-1000:
                // 1 sources

                {
                    var6_9 = this.zza;
                    if (var6_9 != null) {
                        this.zza = null;
                    }
                    throw var4_6;
lbl71:
                    // 1 sources

                    var4_5 = this.zzp;
                    var4_5 = String.valueOf(var4_5);
                    var6_9 = " should be held!";
                    var4_5.concat((String)var6_9);
lbl76:
                    // 3 sources

                    return;
                }
            }
            throw var4_4;
        }
    }

    private static void zze(PowerManager.WakeLock wakeLock, WorkSource workSource) {
        String string2;
        try {
            wakeLock.setWorkSource(workSource);
            return;
        }
        catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
        }
        catch (IllegalArgumentException illegalArgumentException) {
            // empty catch block
        }
        string2 = string2.toString();
        Log.wtf((String)"WakeLock", (String)string2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void acquire(long l2) {
        AtomicInteger atomicInteger = this.zzt;
        atomicInteger.incrementAndGet();
        long l3 = zzb;
        long l4 = Long.MAX_VALUE;
        l3 = Math.max(Math.min(l4, l3), 1L);
        long l7 = 0L;
        long l8 = l2 == l7 ? 0 : (l2 < l7 ? -1 : 1);
        if (l8 > 0) {
            l3 = Math.min(l2, l3);
        }
        Object object = this.zzf;
        synchronized (object) {
            Object object2;
            int n3;
            try {
                n3 = this.isHeld();
                int n4 = 0;
                if (n3 == 0) {
                    object2 = com.google.android.gms.internal.stats.zzb.zza(false, null);
                    this.zza = object2;
                    object2 = this.zzg;
                    object2.acquire();
                    object2 = this.zzn;
                    object2.elapsedRealtime();
                }
                this.zzh = n3 = this.zzh + 1;
                this.zzm = n3 = this.zzm + 1;
                this.zzb(null);
                object2 = this.zzs;
                object2 = object2.get(null);
                object2 = (zzc)object2;
                if (object2 == null) {
                    object2 = new Object(null);
                    Map map2 = this.zzs;
                    map2.put(null, object2);
                }
                ((zzc)object2).zza = n4 = ((zzc)object2).zza + 1;
            }
            catch (Throwable throwable) {}
            object2 = this.zzn;
            long l12 = object2.elapsedRealtime();
            long l14 = l4 - l12;
            long l15 = l14 - l3;
            n3 = (int)(l15 == 0L ? 0 : (l15 < 0L ? -1 : 1));
            if (n3 > 0) {
                l4 = l12 + l3;
            }
            l12 = this.zzj;
            n3 = (int)(l4 == l12 ? 0 : (l4 < l12 ? -1 : 1));
            if (n3 > 0) {
                this.zzj = l4;
                object2 = this.zzi;
                if (object2 != null) {
                    object2.cancel(false);
                }
                object2 = this.zzu;
                zza zza2 = new zza(this);
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                this.zzi = object2 = object2.schedule(zza2, l3, timeUnit);
            }
            return;
            throw throwable;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public boolean isHeld() {
        Object object = this.zzf;
        synchronized (object) {
            boolean bl2 = this.zzh;
            if (bl2 <= false) return false;
            return true;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void release() {
        String string2;
        Object object = this.zzt;
        int n3 = ((AtomicInteger)object).decrementAndGet();
        if (n3 < 0) {
            object = String.valueOf(this.zzp);
            string2 = " release without a matched acquire!";
            ((String)object).concat(string2);
        }
        object = this.zzf;
        synchronized (object) {
            Throwable throwable2;
            block7: {
                block6: {
                    Object object2;
                    block5: {
                        string2 = null;
                        try {
                            int n4;
                            this.zzb(null);
                            object2 = this.zzs;
                            boolean bl2 = object2.containsKey(null);
                            if (!bl2) break block5;
                            object2 = this.zzs;
                            object2 = object2.get(null);
                            if ((object2 = (zzc)object2) == null) break block6;
                            ((zzc)object2).zza = n4 = ((zzc)object2).zza + -1;
                            if (n4 == 0) {
                                object2 = this.zzs;
                                object2.remove(null);
                            }
                            break block6;
                        }
                        catch (Throwable throwable2) {
                            break block7;
                        }
                    }
                    string2 = this.zzp;
                    string2 = String.valueOf(string2);
                    object2 = " counter does not exist";
                    string2.concat((String)object2);
                }
                string2 = null;
                this.zzd(0);
                return;
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void setReferenceCounted(boolean bl2) {
        Object object = this.zzf;
        synchronized (object) {
            this.zzl = bl2;
            return;
        }
    }
}

