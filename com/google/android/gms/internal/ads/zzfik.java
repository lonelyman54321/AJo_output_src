/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.IBinder
 *  android.os.RemoteException
 */
package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzck;
import com.google.android.gms.ads.internal.client.zzcl;
import com.google.android.gms.ads.internal.client.zzen;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.ads.internal.util.zzt;
import com.google.android.gms.ads.internal.zzu;
import com.google.android.gms.internal.ads.zzbfv;
import com.google.android.gms.internal.ads.zzbgl;
import com.google.android.gms.internal.ads.zzbrf;
import com.google.android.gms.internal.ads.zzfij;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.atomic.AtomicReference;

public final class zzfik {
    private static zzfik zza;
    private final Context zzb;
    private final zzcl zzc;
    private final AtomicReference zzd;

    public zzfik(Context context, zzcl zzcl2) {
        AtomicReference atomicReference;
        this.zzd = atomicReference = new AtomicReference();
        this.zzb = context;
        this.zzc = zzcl2;
    }

    /*
     * WARNING - void declaration
     */
    public static zzcl zza(Context object) {
        void var0_7;
        int n3 = 1;
        Constructor constructor = object.getClassLoader();
        Class[] classArray = "com.google.android.gms.ads.internal.client.LiteSdkInfo";
        constructor = ((ClassLoader)((Object)constructor)).loadClass((String)classArray);
        classArray = new Class[n3];
        Class<Context> clazz = Context.class;
        classArray[0] = clazz;
        constructor = ((Class)((Object)constructor)).getConstructor(classArray);
        Object[] objectArray = new Object[n3];
        objectArray[0] = object;
        object = constructor.newInstance(objectArray);
        object = (IBinder)object;
        try {
            return zzck.asInterface((IBinder)object);
        }
        catch (InvocationTargetException invocationTargetException) {
        }
        catch (InstantiationException instantiationException) {
        }
        catch (IllegalAccessException illegalAccessException) {
        }
        catch (NoSuchMethodException noSuchMethodException) {
        }
        catch (ClassNotFoundException classNotFoundException) {
        }
        catch (ClassCastException classCastException) {
            // empty catch block
        }
        zzm.zzh("Failed to retrieve lite SDK info.", (Throwable)var0_7);
        return null;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static zzfik zzd(Context context) {
        Class<zzfik> clazz = zzfik.class;
        synchronized (clazz) {
            Throwable throwable2;
            block5: {
                long l2;
                Object object;
                try {
                    object = zza;
                    if (object != null) {
                        return object;
                    }
                }
                catch (Throwable throwable2) {
                    break block5;
                }
                context = context.getApplicationContext();
                object = zzbgl.zzb;
                object = ((zzbfv)object).zze();
                object = (Long)object;
                long l3 = (Long)object;
                long l4 = 0L;
                zzcl zzcl2 = null;
                Object object2 = l3 == l4 ? 0 : (l3 < l4 ? -1 : 1);
                if (object2 > 0 && (object2 = (l2 = l3 - (l4 = 241806202L)) == 0L ? 0 : (l2 < 0L ? -1 : 1)) <= 0) {
                    zzcl2 = zzfik.zza(context);
                }
                zza = object = new zzfik(context, zzcl2);
                return object;
            }
            throw throwable2;
        }
    }

    private final zzen zzg() {
        zzcl zzcl2 = this.zzc;
        if (zzcl2 != null) {
            try {
                return zzcl2.getLiteSdkVersion();
            }
            catch (RemoteException remoteException) {}
        }
        return null;
    }

    public final zzbrf zzb() {
        return (zzbrf)this.zzd.get();
    }

    public final VersionInfoParcel zzc(int n3, boolean bl2, int n4) {
        zzu.zzp();
        Context context = this.zzb;
        n3 = (int)(zzt.zzE(context) ? 1 : 0);
        int n7 = 241806000;
        boolean bl3 = true;
        VersionInfoParcel versionInfoParcel = new VersionInfoParcel(n7, n4, bl3, n3 != 0);
        Object object = (Boolean)zzbgl.zzc.zze();
        n4 = (int)(((Boolean)object).booleanValue() ? 1 : 0);
        if (n4 != 0 && (object = this.zzg()) != null) {
            n4 = ((zzen)object).zza();
            versionInfoParcel = new VersionInfoParcel(n7, n4, bl3, n3 != 0);
        }
        return versionInfoParcel;
    }

    public final String zze() {
        zzen zzen2 = this.zzg();
        if (zzen2 != null) {
            return zzen2.zzb();
        }
        return null;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzf(zzbrf object) {
        Object object2;
        block5: {
            object2 = (Boolean)zzbgl.zza.zze();
            boolean bl2 = (Boolean)object2;
            if (!bl2) {
                zzfij.zza(this.zzd, null, object);
                return;
            }
            object2 = this.zzc;
            if (object2 != null) {
                try {
                    object2 = object2.getAdapterCreator();
                    break block5;
                }
                catch (RemoteException remoteException) {}
            }
            bl2 = false;
            object2 = null;
        }
        AtomicReference atomicReference = this.zzd;
        if (object2 != null) {
            object = object2;
        }
        zzfij.zza(atomicReference, null, object);
    }
}

