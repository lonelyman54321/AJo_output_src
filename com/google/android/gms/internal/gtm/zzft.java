/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.job.JobInfo
 *  android.app.job.JobScheduler
 *  android.content.Context
 *  android.os.Build$VERSION
 *  android.os.UserHandle
 *  android.util.Log
 */
package com.google.android.gms.internal.gtm;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.Context;
import android.os.Build;
import android.os.UserHandle;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public final class zzft {
    private static final Method zza;
    private static final Method zzb;

    static {
        Object object;
        int n3;
        Method method;
        String string2;
        int n4;
        int n7;
        block11: {
            n7 = Build.VERSION.SDK_INT;
            n4 = 6;
            string2 = "JobSchedulerCompat";
            method = null;
            n3 = 24;
            if (n7 >= n3) {
                object = JobScheduler.class;
                String string3 = "scheduleAsPackage";
                int n8 = 4;
                Class[] classArray = new Class[n8];
                Class clazz = JobInfo.class;
                int n10 = 0;
                Class<Integer> clazz2 = null;
                classArray[0] = clazz;
                clazz = String.class;
                n10 = 1;
                classArray[n10] = clazz;
                clazz2 = Integer.TYPE;
                int n14 = 2;
                classArray[n14] = clazz2;
                n10 = 3;
                classArray[n10] = clazz;
                try {
                    object = ((Class)object).getDeclaredMethod(string3, classArray);
                    break block11;
                }
                catch (NoSuchMethodException noSuchMethodException) {
                    Log.isLoggable((String)string2, (int)n4);
                }
            }
            n7 = 0;
            object = null;
        }
        zza = object;
        n7 = Build.VERSION.SDK_INT;
        if (n7 >= n3) {
            object = UserHandle.class;
            String string4 = "myUserId";
            try {
                method = ((Class)object).getDeclaredMethod(string4, null);
            }
            catch (NoSuchMethodException noSuchMethodException) {
                Log.isLoggable((String)string2, (int)n4);
            }
        }
        zzb = method;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static int zza(Context object, JobInfo jobInfo, String string2, String string3) {
        Object[] objectArray;
        int n3;
        int n4;
        Object object2;
        int n7;
        block7: {
            block6: {
                n7 = 0;
                string3 = (JobScheduler)object.getSystemService("jobscheduler");
                string3.getClass();
                object2 = zza;
                if (object2 == null) return string3.schedule(jobInfo);
                n4 = ze_2.a((Context)object);
                if (n4 != 0) {
                    return string3.schedule(jobInfo);
                }
                object = zzb;
                if (object != null) {
                    object2 = UserHandle.class;
                    n3 = 0;
                    objectArray = null;
                    try {
                        object = ((Method)object).invoke(object2, null);
                        object = (Integer)object;
                        if (object == null) break block6;
                        n4 = (Integer)object;
                        break block7;
                    }
                    catch (IllegalAccessException | InvocationTargetException reflectiveOperationException) {
                        object = "JobSchedulerCompat";
                        int n8 = 6;
                        Log.isLoggable((String)object, (int)n8);
                    }
                }
            }
            n4 = 0;
            object = null;
        }
        object2 = zza;
        if (object2 == null) return string3.schedule(jobInfo);
        try {
            object = n4;
            n3 = 4;
            objectArray = new Object[n3];
            objectArray[0] = jobInfo;
            String string4 = "com.google.android.gms";
            int n10 = 1;
            objectArray[n10] = string4;
            int n14 = 2;
            objectArray[n14] = object;
            object = "DispatchAlarm";
            n14 = 3;
            objectArray[n14] = object;
            object = ((Method)object2).invoke((Object)string3, objectArray);
            object = (Integer)object;
            if (object == null) return n7;
            return (Integer)object;
        }
        catch (IllegalAccessException | InvocationTargetException reflectiveOperationException) {}
        return string3.schedule(jobInfo);
    }
}

