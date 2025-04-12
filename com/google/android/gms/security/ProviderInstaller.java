/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.SystemClock
 *  android.util.Log
 */
package com.google.android.gms.security;

import android.content.Context;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.DynamiteModule$LoadingException;
import com.google.android.gms.dynamite.DynamiteModule$VersionPolicy;
import com.google.android.gms.internal.common.zzi;
import com.google.android.gms.internal.common.zzj;
import com.google.android.gms.internal.common.zzl;
import com.google.android.gms.security.ProviderInstaller$ProviderInstallListener;
import com.google.android.gms.security.zza;
import java.lang.reflect.Method;

public class ProviderInstaller {
    public static final String PROVIDER_NAME = "GmsCore_OpenSSL";
    private static final GoogleApiAvailabilityLight zza;
    private static final Object zzb;
    private static Method zzc;
    private static boolean zzd;

    static {
        Object object;
        zza = GoogleApiAvailabilityLight.getInstance();
        zzb = object = new Object();
        zzc = null;
        zzd = false;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void installIfNeeded(Context object) {
        int n3 = 1;
        Preconditions.checkNotNull(object, "Context must not be null");
        Object object2 = zza;
        int n4 = 11925000;
        ((GoogleApiAvailabilityLight)object2).verifyGooglePlayServicesIsAvailable((Context)object, n4);
        long l2 = SystemClock.uptimeMillis();
        Object object3 = zzb;
        synchronized (object3) {
            Throwable throwable22;
            block14: {
                String string2;
                String string4;
                block13: {
                    String string3;
                    zzj[] zzjArray;
                    int n7;
                    block12: {
                        try {
                            n7 = zzd;
                            string4 = null;
                            if (n7 == 0) {
                                try {
                                    zzjArray = DynamiteModule.PREFER_HIGHEST_OR_LOCAL_VERSION_NO_FORCE_STAGING;
                                    string3 = "com.google.android.gms.providerinstaller.dynamite";
                                    zzjArray = DynamiteModule.load((Context)object, (DynamiteModule$VersionPolicy)zzjArray, string3);
                                    zzjArray = zzjArray.getModuleContext();
                                }
                                catch (DynamiteModule$LoadingException dynamiteModule$LoadingException) {
                                    zzjArray = dynamiteModule$LoadingException.getMessage();
                                    string3 = "Failed to load providerinstaller module: ";
                                    zzjArray = String.valueOf(zzjArray);
                                    string3.concat((String)zzjArray);
                                    n7 = 0;
                                    zzjArray = null;
                                }
                                if (zzjArray != null) {
                                    String string5 = "com.google.android.gms.providerinstaller.ProviderInstallerImpl";
                                    ProviderInstaller.zzb((Context)zzjArray, (Context)object, string5);
                                    return;
                                }
                            }
                            n7 = zzd ^ n3;
                            string3 = GooglePlayServicesUtilLight.getRemoteContext((Context)object);
                            if (string3 != null) break block12;
                            break block13;
                        }
                        catch (Throwable throwable22) {
                            break block14;
                        }
                    }
                    zzd = n3;
                    if (n7 != 0) {
                        try {
                            long l3 = SystemClock.uptimeMillis();
                            String string6 = "com.google.android.gms.common.security.ProviderInstallerImpl";
                            String string7 = "reportRequestStats2";
                            ClassLoader classLoader = string3.getClassLoader();
                            Object object4 = Context.class;
                            object4 = zzj.zzb(object4, object);
                            object2 = zzi.zza(l2);
                            zzi zzi2 = zzi.zza(l3);
                            n7 = 3;
                            zzjArray = new zzj[n7];
                            string4 = null;
                            zzjArray[0] = object4;
                            zzjArray[n3] = object2;
                            n3 = 2;
                            zzjArray[n3] = zzi2;
                            zzl.zzb(string6, string7, classLoader, zzjArray);
                        }
                        catch (Exception exception) {
                            string2 = ((Object)exception).toString();
                            object2 = "Failed to report request stats: ";
                            ((String)object2).concat(string2);
                        }
                    }
                    string4 = string3;
                }
                if (string4 != null) {
                    string2 = "com.google.android.gms.common.security.ProviderInstallerImpl";
                    ProviderInstaller.zzb((Context)string4, (Context)object, string2);
                    return;
                }
                n3 = 8;
                object = new GooglePlayServicesNotAvailableException(n3);
                throw object;
            }
            throw throwable22;
        }
    }

    public static void installIfNeededAsync(Context objectArray, ProviderInstaller$ProviderInstallListener providerInstaller$ProviderInstallListener) {
        Preconditions.checkNotNull(objectArray, "Context must not be null");
        Preconditions.checkNotNull(providerInstaller$ProviderInstallListener, "Listener must not be null");
        Preconditions.checkMainThread("Must be called on the UI thread");
        zza zza2 = new zza((Context)objectArray, providerInstaller$ProviderInstallListener);
        objectArray = new Void[]{};
        zza2.execute(objectArray);
    }

    public static /* bridge */ /* synthetic */ GoogleApiAvailabilityLight zza() {
        return zza;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static void zzb(Context context, Context object, String genericDeclaration) {
        Object object2;
        Exception exception2;
        block4: {
            int n3;
            block3: {
                object = null;
                n3 = 1;
                try {
                    Class[] classArray = zzc;
                    if (classArray != null) break block3;
                    classArray = new Class[n3];
                    Object object3 = Context.class;
                    classArray[0] = object3;
                    object3 = "insertProvider";
                    ClassLoader classLoader = context.getClassLoader();
                    genericDeclaration = classLoader.loadClass((String)((Object)genericDeclaration));
                    genericDeclaration = genericDeclaration.getMethod((String)object3, classArray);
                    zzc = genericDeclaration;
                }
                catch (Exception exception2) {
                    break block4;
                }
            }
            genericDeclaration = zzc;
            Object[] objectArray = new Object[n3];
            objectArray[0] = context;
            context = null;
            ((Method)genericDeclaration).invoke(null, objectArray);
            return;
        }
        object = exception2.getCause();
        String string2 = "ProviderInstaller";
        boolean bl2 = Log.isLoggable((String)string2, (int)6);
        if (bl2) {
            object2 = object == null ? ((Object)exception2).toString() : ((Throwable)object).toString();
            object2 = String.valueOf(object2);
            object = "Failed to install provider: ";
            ((String)object).concat((String)object2);
        }
        object2 = new GooglePlayServicesNotAvailableException(8);
        throw object2;
    }
}

