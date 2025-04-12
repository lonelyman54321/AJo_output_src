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
package com.google.android.gms.internal.measurement;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.Context;
import android.os.Build;
import android.os.UserHandle;
import android.util.Log;
import com.google.common.base.Preconditions;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public final class zzcx {
    private static final Method zza = zzcx.zzc();
    private static final Method zzb = zzcx.zzb();
    private final JobScheduler zzc;

    private zzcx(JobScheduler jobScheduler) {
        this.zzc = jobScheduler;
    }

    private static int zza() {
        Object object = zzb;
        if (object != null) {
            block5: {
                Class<UserHandle> clazz = UserHandle.class;
                object = ((Method)object).invoke(clazz, null);
                object = (Integer)object;
                if (object == null) break block5;
                try {
                    return (Integer)object;
                }
                catch (IllegalAccessException | InvocationTargetException reflectiveOperationException) {
                    object = "JobSchedulerCompat";
                    int n3 = 6;
                    Log.isLoggable((String)object, (int)n3);
                }
            }
            return 0;
        }
        return 0;
    }

    private final int zza(JobInfo jobInfo, String object, int n3, String string2) {
        Method method = zza;
        if (method != null) {
            block12: {
                JobScheduler jobScheduler = this.zzc;
                Integer n4 = n3;
                int n7 = 4;
                Object[] objectArray = new Object[n7];
                objectArray[0] = jobInfo;
                int n8 = 1;
                objectArray[n8] = object;
                int n10 = 2;
                objectArray[n10] = n4;
                n10 = 3;
                objectArray[n10] = string2;
                object = method.invoke((Object)jobScheduler, objectArray);
                object = (Integer)object;
                if (object == null) break block12;
                try {
                    return (Integer)object;
                }
                catch (IllegalAccessException | InvocationTargetException reflectiveOperationException) {}
            }
            return 0;
        }
        return this.zzc.schedule(jobInfo);
    }

    public static int zza(Context object, JobInfo jobInfo, String string2, String string3) {
        int n3;
        JobScheduler jobScheduler = (JobScheduler)Preconditions.checkNotNull((JobScheduler)object.getSystemService("jobscheduler"));
        Method method = zza;
        if (method != null && (n3 = ze_2.a((Context)object)) == 0) {
            object = new zzcx(jobScheduler);
            int n4 = zzcx.zza();
            return super.zza(jobInfo, string2, n4, string3);
        }
        return jobScheduler.schedule(jobInfo);
    }

    private static Method zzb() {
        int n3 = Build.VERSION.SDK_INT;
        int n4 = 24;
        if (n3 >= n4) {
            Object object = UserHandle.class;
            String string2 = "myUserId";
            try {
                return ((Class)object).getDeclaredMethod(string2, null);
            }
            catch (NoSuchMethodException noSuchMethodException) {
                object = "JobSchedulerCompat";
                n4 = 6;
                Log.isLoggable((String)object, (int)n4);
            }
        }
        return null;
    }

    private static Method zzc() {
        int n3 = Build.VERSION.SDK_INT;
        int n4 = 24;
        if (n3 >= n4) {
            Object object = JobScheduler.class;
            String string2 = "scheduleAsPackage";
            int n7 = 4;
            Class[] classArray = new Class[n7];
            Class clazz = JobInfo.class;
            int n8 = 0;
            Class<Integer> clazz2 = null;
            classArray[0] = clazz;
            clazz = String.class;
            n8 = 1;
            classArray[n8] = clazz;
            clazz2 = Integer.TYPE;
            int n10 = 2;
            classArray[n10] = clazz2;
            n8 = 3;
            classArray[n8] = clazz;
            try {
                return ((Class)object).getDeclaredMethod(string2, classArray);
            }
            catch (NoSuchMethodException noSuchMethodException) {
                object = "JobSchedulerCompat";
                n4 = 6;
                Log.isLoggable((String)object, (int)n4);
            }
        }
        return null;
    }
}

