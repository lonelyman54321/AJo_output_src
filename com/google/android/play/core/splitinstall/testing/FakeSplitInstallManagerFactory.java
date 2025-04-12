/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.google.android.play.core.splitinstall.testing;

import android.content.Context;
import com.google.android.play.core.common.LocalTestingException;
import com.google.android.play.core.splitcompat.SplitCompat;
import com.google.android.play.core.splitinstall.internal.zzby;
import com.google.android.play.core.splitinstall.testing.FakeSplitInstallManager;
import com.google.android.play.core.splitinstall.testing.zzs;
import com.google.android.play.core.splitinstall.zzu;
import java.io.File;

public final class FakeSplitInstallManagerFactory {
    private static FakeSplitInstallManager zza;

    private FakeSplitInstallManagerFactory() {
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static FakeSplitInstallManager create(Context object) {
        Exception exception2;
        block4: {
            Object object2;
            try {
                object2 = zzu.zza(object);
                object2 = object2.zzb();
                if (object2 == null) {
                    object2 = "Failed to retrieve local testing directory path";
                    object = new LocalTestingException((String)object2);
                    throw object;
                }
                boolean bl2 = ((File)object2).exists();
                if (bl2) {
                    return FakeSplitInstallManagerFactory.create(object, (File)object2);
                }
            }
            catch (Exception exception2) {
                break block4;
            }
            String string2 = "Local testing directory not found: %s";
            int n3 = 1;
            Object[] objectArray = new Object[n3];
            objectArray[0] = object2;
            object2 = String.format(string2, objectArray);
            object = new LocalTestingException((String)object2);
            throw object;
        }
        RuntimeException runtimeException = new RuntimeException(exception2);
        throw runtimeException;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static FakeSplitInstallManager create(Context object, File object2) {
        String string2 = "Different module directories used to initialize FakeSplitInstallManager: '";
        Class<FakeSplitInstallManagerFactory> clazz = FakeSplitInstallManagerFactory.class;
        synchronized (clazz) {
            Throwable throwable2;
            Object object3;
            block5: {
                try {
                    object3 = zza;
                    if (object3 == null) {
                        zza = object = FakeSplitInstallManagerFactory.createNewInstance((Context)object, (File)object2);
                        return zza;
                    }
                    object = ((FakeSplitInstallManager)object3).zzc();
                    boolean bl2 = ((String)(object = ((File)object).getAbsolutePath())).equals(object3 = ((File)object2).getAbsolutePath());
                    if (!bl2) break block5;
                    return zza;
                }
                catch (Throwable throwable2) {}
            }
            object3 = zza;
            object3 = ((FakeSplitInstallManager)object3).zzc();
            object3 = ((File)object3).getAbsolutePath();
            object2 = ((File)object2).getAbsolutePath();
            StringBuilder stringBuilder = new StringBuilder(string2);
            stringBuilder.append((String)object3);
            string2 = "' and '";
            stringBuilder.append(string2);
            stringBuilder.append((String)object2);
            object2 = "'";
            stringBuilder.append((String)object2);
            object2 = stringBuilder.toString();
            object = new RuntimeException((String)object2);
            throw object;
            throw throwable2;
        }
    }

    public static FakeSplitInstallManager createNewInstance(Context context, File file) {
        SplitCompat.install(context);
        Object object = context.getPackageName();
        com.google.android.play.core.splitinstall.zzs zzs2 = new com.google.android.play.core.splitinstall.zzs(context, (String)object);
        object = new zzs(file);
        FakeSplitInstallManager fakeSplitInstallManager = new FakeSplitInstallManager(context, file, zzs2, (zzby)object);
        return fakeSplitInstallManager;
    }
}

