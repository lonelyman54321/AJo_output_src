/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.job.JobParameters
 *  android.net.Network
 */
package androidx.work.impl.background.systemjob;

import android.app.job.JobParameters;
import android.net.Network;

public final class SystemJobService$b {
    public static Network a(JobParameters jobParameters) {
        return jobParameters.getNetwork();
    }
}

