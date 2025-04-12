/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Service
 *  android.app.job.JobParameters
 *  android.app.job.JobServiceEngine
 *  android.app.job.JobWorkItem
 */
package androidx.core.app;

import android.app.Service;
import android.app.job.JobParameters;
import android.app.job.JobServiceEngine;
import android.app.job.JobWorkItem;
import androidx.core.app.JobIntentService;
import androidx.core.app.JobIntentService$a;
import androidx.core.app.JobIntentService$e$a;

public final class JobIntentService$e
extends JobServiceEngine {
    public final JobIntentService a;
    public final Object b;
    public JobParameters c;

    public JobIntentService$e(JobIntentService jobIntentService) {
        super((Service)jobIntentService);
        Object object;
        this.b = object = new Object();
        this.a = jobIntentService;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final JobIntentService$e$a a() {
        Object object = this.b;
        // MONITORENTER : object
        JobParameters jobParameters = this.c;
        ClassLoader classLoader = null;
        if (jobParameters == null) {
            // MONITOREXIT : object
            return null;
        }
        jobParameters = pm.a(jobParameters);
        // MONITOREXIT : object
        if (jobParameters == null) return null;
        object = qm_0.a((JobWorkItem)jobParameters);
        classLoader = this.a.getClassLoader();
        object.setExtrasClassLoader(classLoader);
        return new JobIntentService$e$a(this, (JobWorkItem)jobParameters);
    }

    public final boolean onStartJob(JobParameters jobParameters) {
        this.c = jobParameters;
        this.a.a(false);
        return true;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean onStopJob(JobParameters object) {
        object = this.a;
        JobIntentService$a jobIntentService$a = ((JobIntentService)((Object)object)).c;
        if (jobIntentService$a != null) {
            jobIntentService$a.cancel(false);
        }
        ((JobIntentService)((Object)object)).d();
        object = this.b;
        synchronized (object) {
            jobIntentService$a = null;
            this.c = null;
            return true;
        }
    }
}

