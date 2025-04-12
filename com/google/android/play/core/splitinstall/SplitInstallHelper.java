/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Build$VERSION
 */
package com.google.android.play.core.splitinstall;

import android.content.Context;
import android.os.Build;
import com.google.android.play.core.splitinstall.internal.zzu;
import com.google.android.play.core.splitinstall.zzn;
import java.io.File;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class SplitInstallHelper {
    private static final zzu zza;

    static {
        zzu zzu2;
        zza = zzu2 = new zzu("SplitInstallHelper");
    }

    private SplitInstallHelper() {
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void loadLibrary(Context object, String object2) {
        Class<zzn> clazz = zzn.class;
        synchronized (clazz) {
            Throwable throwable2;
            block6: {
                UnsatisfiedLinkError unsatisfiedLinkError2;
                block5: {
                    try {
                        try {
                            System.loadLibrary((String)object2);
                        }
                        catch (UnsatisfiedLinkError unsatisfiedLinkError2) {
                            object = object.getApplicationInfo();
                            object = object.nativeLibraryDir;
                            object2 = System.mapLibraryName((String)object2);
                            StringBuilder stringBuilder = new StringBuilder();
                            stringBuilder.append((String)object);
                            object = "/";
                            stringBuilder.append((String)object);
                            stringBuilder.append((String)object2);
                            object = stringBuilder.toString();
                            object2 = new File((String)object);
                            boolean bl2 = ((File)object2).exists();
                            if (!bl2) break block5;
                            System.load((String)object);
                        }
                    }
                    catch (Throwable throwable2) {
                        break block6;
                    }
                    return;
                }
                throw unsatisfiedLinkError2;
            }
            throw throwable2;
        }
    }

    public static void updateAppInfo(Context object) {
        int n3 = 2;
        int n4 = 1;
        String string2 = null;
        int n7 = Build.VERSION.SDK_INT;
        int n8 = 25;
        if (n7 > n8 && n7 < (n8 = 28)) {
            zzu zzu2 = zza;
            Object object2 = new Object[]{};
            zzu2.zzd("Calling dispatchPackageBroadcast", (Object[])object2);
            Object object3 = "android.app.ActivityThread";
            object3 = Class.forName((String)object3);
            object2 = "currentActivityThread";
            int n10 = 0;
            Object object4 = null;
            object2 = ((Class)object3).getMethod((String)object2, null);
            ((AccessibleObject)object2).setAccessible(n4 != 0);
            object2 = ((Method)object2).invoke(null, null);
            object4 = "mAppThread";
            object3 = ((Class)object3).getDeclaredField((String)object4);
            ((AccessibleObject)object3).setAccessible(n4 != 0);
            object3 = ((Field)object3).get(object2);
            object2 = object3.getClass();
            object4 = "dispatchPackageBroadcast";
            Class[] classArray = new Class[n3];
            Class<Integer> clazz = Integer.TYPE;
            classArray[0] = clazz;
            clazz = String[].class;
            classArray[n4] = clazz;
            object2 = ((Class)object2).getMethod((String)object4, classArray);
            n10 = 3;
            object4 = n10;
            object = object.getPackageName();
            object = new String[]{object};
            Object[] objectArray = new Object[n3];
            objectArray[0] = object4;
            objectArray[n4] = object;
            ((Method)object2).invoke(object3, objectArray);
            object = "Called dispatchPackageBroadcast";
            objectArray = new Object[]{};
            try {
                zzu2.zzd((String)object, objectArray);
                return;
            }
            catch (Exception exception) {
                objectArray = zza;
                Object[] objectArray2 = new Object[]{};
                string2 = "Update app info with dispatchPackageBroadcast failed!";
                objectArray.zzc(exception, string2, objectArray2);
            }
        }
    }
}

