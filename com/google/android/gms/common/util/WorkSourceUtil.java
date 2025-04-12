/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.pm.ApplicationInfo
 *  android.content.pm.PackageManager
 *  android.content.pm.PackageManager$NameNotFoundException
 *  android.os.Process
 *  android.os.WorkSource
 *  android.util.Log
 */
package com.google.android.gms.common.util;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Process;
import android.os.WorkSource;
import android.util.Log;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.common.util.Strings;
import com.google.android.gms.common.wrappers.PackageManagerWrapper;
import com.google.android.gms.common.wrappers.Wrappers;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class WorkSourceUtil {
    private static final int zza;
    private static final Method zzb;
    private static final Method zzc;
    private static final Method zzd;
    private static final Method zze;
    private static final Method zzf;
    private static final Method zzg;
    private static final Method zzh;
    private static final Method zzi;
    private static Boolean zzj;

    /*
     * Loose catch block
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static {
        Object object;
        block23: {
            Class<WorkSource> clazz;
            boolean bl2;
            int n3;
            block22: {
                boolean bl3;
                Class<Integer> clazz2;
                Class<?> clazz3;
                Class<String> clazz4;
                block21: {
                    void var5_8;
                    n3 = 2;
                    bl2 = true;
                    clazz4 = String.class;
                    clazz3 = "add";
                    clazz = WorkSource.class;
                    zza = Process.myUid();
                    try {
                        Class[] classArray = new Class[bl2];
                        classArray[0] = clazz2 = Integer.TYPE;
                        Method method = clazz.getMethod((String)((Object)clazz3), classArray);
                    }
                    catch (Exception exception) {
                        Object var5_7 = null;
                    }
                    zzb = var5_8;
                    try {
                        Class[] classArray = new Class[n3];
                        classArray[0] = clazz2 = Integer.TYPE;
                        classArray[bl2] = clazz4;
                        clazz3 = clazz.getMethod((String)((Object)clazz3), classArray);
                    }
                    catch (Exception exception) {
                        bl3 = false;
                        clazz3 = null;
                    }
                    zzc = clazz3;
                    clazz3 = "size";
                    try {
                        clazz3 = clazz.getMethod((String)((Object)clazz3), null);
                    }
                    catch (Exception exception) {
                        bl3 = false;
                        clazz3 = null;
                    }
                    zzd = clazz3;
                    clazz3 = "get";
                    try {
                        Class[] classArray = new Class[bl2];
                        classArray[0] = clazz2 = Integer.TYPE;
                        clazz3 = clazz.getMethod((String)((Object)clazz3), classArray);
                    }
                    catch (Exception exception) {
                        bl3 = false;
                        clazz3 = null;
                    }
                    zze = clazz3;
                    clazz3 = "getName";
                    try {
                        Class[] classArray = new Class[bl2];
                        classArray[0] = clazz2 = Integer.TYPE;
                        clazz3 = clazz.getMethod((String)((Object)clazz3), classArray);
                    }
                    catch (Exception exception) {
                        bl3 = false;
                        clazz3 = null;
                    }
                    zzf = clazz3;
                    bl3 = PlatformVersion.isAtLeastP();
                    if (bl3) {
                        clazz3 = "createWorkChain";
                        try {
                            clazz3 = clazz.getMethod((String)((Object)clazz3), null);
                            break block21;
                        }
                        catch (Exception exception) {}
                    }
                    bl3 = false;
                    clazz3 = null;
                }
                zzg = clazz3;
                bl3 = PlatformVersion.isAtLeastP();
                if (bl3) {
                    clazz3 = "android.os.WorkSource$WorkChain";
                    try {
                        clazz3 = Class.forName((String)((Object)clazz3));
                        String string2 = "addNode";
                        object = new Class[n3];
                        object[0] = clazz2 = Integer.TYPE;
                        object[bl2] = clazz4;
                        object = clazz3.getMethod(string2, (Class<?>)object);
                        break block22;
                    }
                    catch (Exception exception) {}
                }
                n3 = 0;
                object = null;
            }
            zzh = object;
            n3 = (int)(PlatformVersion.isAtLeastP() ? 1 : 0);
            if (n3 != 0) {
                object = "isEmpty";
                try {
                    object = clazz.getMethod((String)object, null);
                }
                catch (Exception exception) {}
                ((AccessibleObject)object).setAccessible(bl2);
                break block23;
            }
            n3 = 0;
            object = null;
            break block23;
            catch (Exception exception) {}
        }
        zzi = object;
        zzj = null;
    }

    private WorkSourceUtil() {
    }

    public static void add(WorkSource workSource, int n3, String object) {
        int n4 = 1;
        Method method = zzc;
        String string2 = "Unable to assign blame through WorkSource";
        String string3 = "WorkSourceUtil";
        if (method != null) {
            int n7;
            Integer n8;
            if (object == null) {
                object = "";
            }
            try {
                n8 = n3;
                n7 = 2;
            }
            catch (Exception exception) {
                Log.wtf((String)string3, (String)string2, (Throwable)exception);
                return;
            }
            Object[] objectArray = new Object[n7];
            objectArray[0] = n8;
            objectArray[n4] = object;
            method.invoke((Object)workSource, objectArray);
            return;
        }
        object = zzb;
        if (object != null) {
            Integer n10 = n3;
            Object[] objectArray = new Object[n4];
            objectArray[0] = n10;
            try {
                ((Method)object).invoke((Object)workSource, objectArray);
                return;
            }
            catch (Exception exception) {
                Log.wtf((String)string3, (String)string2, (Throwable)exception);
            }
        }
    }

    public static WorkSource fromPackage(Context object, String string2) {
        PackageManager packageManager;
        WorkSource workSource = null;
        if (object != null && (packageManager = object.getPackageManager()) != null && string2 != null) {
            block4: {
                object = Wrappers.packageManager((Context)object);
                packageManager = null;
                try {
                    object = ((PackageManagerWrapper)object).getApplicationInfo(string2, 0);
                    if (object != null) break block4;
                    "Could not get applicationInfo from package: ".concat(string2);
                }
                catch (PackageManager.NameNotFoundException nameNotFoundException) {
                    object = "Could not find package: ";
                    ((String)object).concat(string2);
                }
                return null;
            }
            int n3 = ((ApplicationInfo)object).uid;
            workSource = new WorkSource();
            WorkSourceUtil.add(workSource, n3, string2);
            return workSource;
        }
        return null;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static WorkSource fromPackageAndModuleExperimentalPi(Context object, String object2, String string2) {
        Method method;
        int n3;
        Object object3;
        int n4;
        block10: {
            block9: {
                int n7 = 1;
                n4 = 2;
                object3 = null;
                if (object == null) return null;
                PackageManager packageManager = object.getPackageManager();
                if (packageManager == null) return null;
                if (string2 == null) return null;
                if (object2 == null) {
                    return null;
                }
                n3 = -1;
                try {
                    object = Wrappers.packageManager((Context)object);
                    object = ((PackageManagerWrapper)object).getApplicationInfo((String)object2, 0);
                    if (object == null) {
                        object = "Could not get applicationInfo from package: ";
                        ((String)object).concat((String)object2);
                    }
                    break block9;
                }
                catch (PackageManager.NameNotFoundException nameNotFoundException) {
                    object = "Could not find package: ";
                    ((String)object).concat((String)object2);
                }
                break block10;
            }
            n3 = ((ApplicationInfo)object).uid;
        }
        if (n3 < 0) {
            return null;
        }
        object = new WorkSource();
        Method method2 = zzg;
        if (method2 != null && (method = zzh) != null) {
            try {
                object3 = method2.invoke(object, null);
                int n8 = zza;
                if (n3 != n8) {
                    Integer n10 = n3;
                    Object[] objectArray = new Object[n4];
                    objectArray[0] = n10;
                    objectArray[n7] = object2;
                    method.invoke(object3, objectArray);
                }
                object2 = n8;
                Object[] objectArray = new Object[n4];
                objectArray[0] = object2;
                objectArray[n7] = string2;
                method.invoke(object3, objectArray);
                return object;
            }
            catch (Exception exception) {
                return object;
            }
        }
        WorkSourceUtil.add((WorkSource)object, n3, (String)object2);
        return object;
    }

    public static int get(WorkSource object, int n3) {
        Object object2 = zze;
        if (object2 != null) {
            Object object3 = n3;
            int n4 = 1;
            Object[] objectArray = new Object[n4];
            objectArray[0] = object3;
            object = ((Method)object2).invoke(object, objectArray);
            Preconditions.checkNotNull(object);
            object = (Integer)object;
            try {
                return (Integer)object;
            }
            catch (Exception exception) {
                object3 = "WorkSourceUtil";
                object2 = "Unable to assign blame through WorkSource";
                Log.wtf((String)object3, (String)object2, (Throwable)exception);
            }
        }
        return 0;
    }

    public static String getName(WorkSource object, int n3) {
        Object object2 = zzf;
        if (object2 != null) {
            Object object3 = n3;
            int n4 = 1;
            Object[] objectArray = new Object[n4];
            objectArray[0] = object3;
            object = ((Method)object2).invoke(object, objectArray);
            try {
                return (String)object;
            }
            catch (Exception exception) {
                object3 = "WorkSourceUtil";
                object2 = "Unable to assign blame through WorkSource";
                Log.wtf((String)object3, (String)object2, (Throwable)exception);
            }
        }
        return null;
    }

    public static List getNames(WorkSource workSource) {
        ArrayList<String> arrayList = new ArrayList<String>();
        int n3 = workSource == null ? 0 : WorkSourceUtil.size(workSource);
        if (n3 != 0) {
            for (int i3 = 0; i3 < n3; ++i3) {
                String string2 = WorkSourceUtil.getName(workSource, i3);
                boolean bl2 = Strings.isEmptyOrWhitespace(string2);
                if (bl2) continue;
                Preconditions.checkNotNull(string2);
                arrayList.add(string2);
            }
        }
        return arrayList;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static boolean hasWorkSourcePermission(Context object) {
        Class<WorkSourceUtil> clazz = WorkSourceUtil.class;
        synchronized (clazz) {
            Throwable throwable2;
            Boolean bl2;
            block6: {
                try {
                    bl2 = zzj;
                    if (bl2 == null) break block6;
                    return bl2;
                }
                catch (Throwable throwable2) {}
            }
            boolean bl3 = false;
            bl2 = null;
            if (object == null) {
                return false;
            }
            String string2 = "android.permission.UPDATE_DEVICE_STATS";
            int n3 = t70.checkSelfPermission(object, string2);
            if (n3 == 0) {
                bl3 = true;
            }
            object = bl3;
            zzj = object;
            return bl3;
            throw throwable2;
        }
    }

    public static boolean isEmpty(WorkSource workSource) {
        int n3;
        Object object = zzi;
        if (object != null) {
            try {
                object = ((Method)object).invoke((Object)workSource, null);
            }
            catch (Exception exception) {}
            Preconditions.checkNotNull(object);
            object = (Boolean)object;
            return (Boolean)object;
        }
        return (n3 = WorkSourceUtil.size(workSource)) == 0;
    }

    public static int size(WorkSource object) {
        Object object2 = zzd;
        if (object2 != null) {
            String string2 = null;
            object = ((Method)object2).invoke(object, null);
            Preconditions.checkNotNull(object);
            object = (Integer)object;
            try {
                return (Integer)object;
            }
            catch (Exception exception) {
                object2 = "WorkSourceUtil";
                string2 = "Unable to assign blame through WorkSource";
                Log.wtf((String)object2, (String)string2, (Throwable)exception);
            }
        }
        return 0;
    }
}

