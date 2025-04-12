/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.job.JobParameters
 *  android.app.job.JobWorkItem
 *  android.content.Intent
 */
package androidx.core.app;

import android.app.job.JobParameters;
import android.app.job.JobWorkItem;
import android.content.Intent;
import androidx.core.app.JobIntentService$d;
import androidx.core.app.JobIntentService$e;

public final class JobIntentService$e$a
implements JobIntentService$d {
    public final JobWorkItem a;
    public final /* synthetic */ JobIntentService$e b;

    public JobIntentService$e$a(JobIntentService$e jobIntentService$e, JobWorkItem jobWorkItem) {
        this.b = jobIntentService$e;
        this.a = jobWorkItem;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void a() {
        Object object = this.b.b;
        synchronized (object) {
            Throwable throwable2;
            block4: {
                block3: {
                    try {
                        JobIntentService$e jobIntentService$e = this.b;
                        jobIntentService$e = jobIntentService$e.c;
                        if (jobIntentService$e == null) break block3;
                        JobWorkItem jobWorkItem = this.a;
                        rm_0.b((JobParameters)jobIntentService$e, jobWorkItem);
                    }
                    catch (Throwable throwable2) {
                        break block4;
                    }
                }
                return;
            }
            throw throwable2;
        }
    }

    public final Intent getIntent() {
        return qm_0.a(this.a);
    }
}

