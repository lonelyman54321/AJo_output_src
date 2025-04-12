/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.Intent
 *  android.os.IBinder
 *  android.os.RemoteException
 */
package com.google.android.gms.tagmanager;

import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.DynamiteModule$LoadingException;
import com.google.android.gms.dynamite.DynamiteModule$VersionPolicy;
import com.google.android.gms.measurement.AppMeasurement;
import com.google.android.gms.tagmanager.zzbi;
import com.google.android.gms.tagmanager.zzbj;
import com.google.android.gms.tagmanager.zzck;
import com.google.android.gms.tagmanager.zzcm;
import com.google.android.gms.tagmanager.zzcn;
import com.google.android.gms.tagmanager.zzcp;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;

final class zzbk {
    private static volatile DynamiteModule zza;
    private static volatile zzcn zzb;
    private static final Map zzc;
    private static final Map zzd;

    static {
        HashMap hashMap;
        zzc = hashMap = new HashMap();
        zzd = hashMap = new HashMap();
    }

    private zzbk() {
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static IBinder zza(Context object) {
        try {
            Object object2 = zzbk.zzg(object);
            Object object3 = "com.google.android.gms.tagmanager.TagManagerServiceProviderImpl";
            object2 = ((DynamiteModule)object2).instantiate((String)object3);
            object2 = zzcp.asInterface((IBinder)object2);
            try {
                object3 = ObjectWrapper.wrap(object);
                object = zzbk.zzh(object);
                zzbj zzbj2 = new zzbj();
                object = object2.getService((IObjectWrapper)object3, (zzck)object, zzbj2);
                return object.asBinder();
            }
            catch (RemoteException remoteException) {
                object2 = new IllegalStateException(remoteException);
                throw object2;
            }
        }
        catch (DynamiteModule$LoadingException dynamiteModule$LoadingException) {}
        RuntimeException runtimeException = new RuntimeException(dynamiteModule$LoadingException);
        throw runtimeException;
    }

    public static /* bridge */ /* synthetic */ Object zzb(String string2, Class clazz) {
        return zzbk.zzj(string2, clazz);
    }

    public static /* bridge */ /* synthetic */ Map zzc() {
        return zzc;
    }

    public static /* bridge */ /* synthetic */ Map zzd() {
        return zzd;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void zze(Context object) {
        Class<zzbk> clazz = zzbk.class;
        Object object2 = zzbk.zzi(object);
        synchronized (clazz) {
            try {
                try {
                    IObjectWrapper iObjectWrapper = ObjectWrapper.wrap(object);
                    object = zzbk.zzh(object);
                    zzbj zzbj2 = new zzbj();
                    object2.initialize(iObjectWrapper, (zzck)object, zzbj2);
                    return;
                }
                catch (RemoteException remoteException) {
                    object2 = new IllegalStateException(remoteException);
                    throw object2;
                }
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void zzf(Intent intent, Context object) {
        Class<zzbk> clazz = zzbk.class;
        zzcn zzcn2 = zzbk.zzi(object);
        synchronized (clazz) {
            try {
                try {
                    IObjectWrapper iObjectWrapper = ObjectWrapper.wrap(object);
                    DynamiteModule dynamiteModule = zza;
                    dynamiteModule = dynamiteModule.getModuleContext();
                    IObjectWrapper iObjectWrapper2 = ObjectWrapper.wrap(dynamiteModule);
                    zzck zzck2 = zzbk.zzh(object);
                    zzbj zzbj2 = new zzbj();
                    dynamiteModule = intent;
                    zzcn2.previewIntent(intent, iObjectWrapper, iObjectWrapper2, zzck2, zzbj2);
                    return;
                }
                catch (RemoteException remoteException) {
                    object = new IllegalStateException(remoteException);
                    throw object;
                }
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static DynamiteModule zzg(Context object) {
        Object object2 = zza;
        if (object2 != null) return object2;
        Class<zzbk> clazz = zzbk.class;
        synchronized (clazz) {
            try {
                object2 = zza;
                Object object3 = zza;
                if (object3 != null) return object2;
                object2 = DynamiteModule.PREFER_HIGHEST_OR_REMOTE_VERSION;
                object3 = "com.google.android.gms.tagmanager";
                object = DynamiteModule.load(object, (DynamiteModule$VersionPolicy)object2, (String)object3);
                zza = object;
                return object;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    private static zzck zzh(Context object) {
        object = AppMeasurement.getInstance(object);
        zzbi zzbi2 = new zzbi((AppMeasurement)object);
        return zzbi2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static zzcn zzi(Context object) {
        Object object2 = zzb;
        if (object2 != null) return object2;
        Class<zzbk> clazz = zzbk.class;
        synchronized (clazz) {
            try {
                object2 = zzb;
                if (object2 != null) return object2;
                try {
                    object = zzbk.zzg((Context)object);
                    object2 = "com.google.android.gms.tagmanager.TagManagerApiImpl";
                    object = ((DynamiteModule)object).instantiate((String)object2);
                    zzb = object = zzcm.asInterface((IBinder)object);
                    return object;
                }
                catch (DynamiteModule$LoadingException dynamiteModule$LoadingException) {
                    object2 = new RuntimeException(dynamiteModule$LoadingException);
                    throw object2;
                }
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static Object zzj(String string2, Class constructor) {
        Object var2_2 = null;
        try {
            Class<?> clazz = Class.forName(string2);
            Class<?>[] classArray = clazz.getInterfaces();
            int n3 = classArray.length;
            int i3 = 0;
            while (true) {
                if (i3 >= n3) {
                    ((Class)((Object)constructor)).getCanonicalName();
                    return var2_2;
                }
                Class<?> clazz2 = classArray[i3];
                boolean bl2 = clazz2.equals(constructor);
                if (bl2) {
                    try {
                        constructor = clazz.getConstructor(null);
                        return constructor.newInstance(null);
                    }
                    catch (IllegalAccessException | InstantiationException | NoSuchMethodException | SecurityException | InvocationTargetException exception) {
                        return var2_2;
                    }
                }
                ++i3;
            }
        }
        catch (ClassNotFoundException classNotFoundException) {
            string2 = String.valueOf(string2);
            constructor = " can't be found in the application.";
            string2.concat((String)((Object)constructor));
        }
        return var2_2;
    }
}

