/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.job.JobInfo
 *  android.app.job.JobInfo$Builder
 *  android.app.job.JobScheduler
 *  android.app.job.JobWorkItem
 *  android.content.ComponentName
 *  android.content.Context
 *  android.content.Intent
 */
package androidx.core.app;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.app.job.JobWorkItem;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import androidx.core.app.JobIntentService$g;

public final class JobIntentService$f
extends JobIntentService$g {
    public final JobInfo d;
    public final JobScheduler e;

    public JobIntentService$f(Context context, ComponentName componentName, int n3) {
        super(componentName);
        this.b(n3);
        JobInfo.Builder builder = new JobInfo.Builder(n3, componentName);
        componentName = builder.setOverrideDeadline(0L).build();
        this.d = componentName;
        context = (JobScheduler)context.getApplicationContext().getSystemService("jobscheduler");
        this.e = context;
    }

    public final void a(Intent intent) {
        intent = al1_0.a(intent);
        JobScheduler jobScheduler = this.e;
        JobInfo jobInfo = this.d;
        zl1_1.a(jobScheduler, jobInfo, (JobWorkItem)intent);
    }
}

