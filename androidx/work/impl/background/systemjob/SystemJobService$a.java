/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.job.JobParameters
 *  android.net.Uri
 */
package androidx.work.impl.background.systemjob;

import android.app.job.JobParameters;
import android.net.Uri;

public final class SystemJobService$a {
    public static String[] a(JobParameters jobParameters) {
        return jobParameters.getTriggeredContentAuthorities();
    }

    public static Uri[] b(JobParameters jobParameters) {
        return jobParameters.getTriggeredContentUris();
    }
}

