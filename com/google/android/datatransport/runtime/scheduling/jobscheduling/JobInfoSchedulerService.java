/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.job.JobParameters
 *  android.app.job.JobService
 *  android.os.PersistableBundle
 *  android.util.Base64
 */
package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.os.PersistableBundle;
import android.util.Base64;
import com.google.android.datatransport.Priority;
import com.google.android.datatransport.runtime.TransportContext;
import com.google.android.datatransport.runtime.TransportContext$Builder;
import com.google.android.datatransport.runtime.TransportRuntime;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.Uploader;
import com.google.android.datatransport.runtime.util.PriorityMapping;

public class JobInfoSchedulerService
extends JobService {
    public static /* synthetic */ void a(JobInfoSchedulerService jobInfoSchedulerService, JobParameters jobParameters) {
        jobInfoSchedulerService.lambda$onStartJob$0(jobParameters);
    }

    private /* synthetic */ void lambda$onStartJob$0(JobParameters jobParameters) {
        this.jobFinished(jobParameters, false);
    }

    public boolean onStartJob(JobParameters jobParameters) {
        Object object = jobParameters.getExtras().getString("backendName");
        Object object2 = jobParameters.getExtras().getString("extras");
        int n3 = jobParameters.getExtras().getInt("priority");
        PersistableBundle persistableBundle = jobParameters.getExtras();
        int n4 = persistableBundle.getInt("attemptNumber");
        TransportRuntime.initialize(this.getApplicationContext());
        TransportContext$Builder transportContext$Builder = TransportContext.builder();
        object = transportContext$Builder.setBackendName((String)object);
        Object object3 = PriorityMapping.valueOf(n3);
        object = ((TransportContext$Builder)object).setPriority((Priority)((Object)object3));
        if (object2 != null) {
            n3 = 0;
            object3 = null;
            object2 = Base64.decode((String)object2, (int)0);
            ((TransportContext$Builder)object).setExtras((byte[])object2);
        }
        object2 = TransportRuntime.getInstance().getUploader();
        object = ((TransportContext$Builder)object).build();
        object3 = new yl1_2(0, (Object)this, jobParameters);
        ((Uploader)object2).upload((TransportContext)object, n4, (Runnable)object3);
        return true;
    }

    public boolean onStopJob(JobParameters jobParameters) {
        return true;
    }
}

