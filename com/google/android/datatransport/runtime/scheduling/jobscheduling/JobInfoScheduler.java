/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.job.JobInfo
 *  android.app.job.JobInfo$Builder
 *  android.app.job.JobScheduler
 *  android.content.ComponentName
 *  android.content.Context
 *  android.os.PersistableBundle
 *  android.util.Base64
 */
package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.PersistableBundle;
import android.util.Base64;
import com.google.android.datatransport.Priority;
import com.google.android.datatransport.runtime.TransportContext;
import com.google.android.datatransport.runtime.logging.Logging;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkScheduler;
import com.google.android.datatransport.runtime.scheduling.persistence.EventStore;
import com.google.android.datatransport.runtime.util.PriorityMapping;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.zip.Adler32;

public class JobInfoScheduler
implements WorkScheduler {
    static final String ATTEMPT_NUMBER = "attemptNumber";
    static final String BACKEND_NAME = "backendName";
    static final String EVENT_PRIORITY = "priority";
    static final String EXTRAS = "extras";
    private static final String LOG_TAG = "JobInfoScheduler";
    private final SchedulerConfig config;
    private final Context context;
    private final EventStore eventStore;

    public JobInfoScheduler(Context context, EventStore eventStore, SchedulerConfig schedulerConfig) {
        this.context = context;
        this.eventStore = eventStore;
        this.config = schedulerConfig;
    }

    private boolean isJobServiceOn(JobScheduler object, int n3, int n4) {
        boolean bl2;
        block2: {
            int n7;
            JobInfo jobInfo;
            int n8;
            object = object.getAllPendingJobs().iterator();
            do {
                n8 = object.hasNext();
                bl2 = false;
                if (n8 == 0) break block2;
                jobInfo = (JobInfo)object.next();
                PersistableBundle persistableBundle = jobInfo.getExtras();
                String string2 = ATTEMPT_NUMBER;
                n7 = persistableBundle.getInt(string2);
            } while ((n8 = jobInfo.getId()) != n3);
            if (n7 >= n4) {
                bl2 = true;
            }
        }
        return bl2;
    }

    public int getJobId(TransportContext object) {
        Adler32 adler32 = new Adler32();
        Object object2 = this.context.getPackageName();
        Object object3 = "UTF-8";
        Charset charset = Charset.forName((String)object3);
        object2 = ((String)object2).getBytes(charset);
        adler32.update((byte[])object2);
        object2 = ((TransportContext)object).getBackendName();
        object3 = Charset.forName((String)object3);
        object2 = ((String)object2).getBytes((Charset)object3);
        adler32.update((byte[])object2);
        int n3 = 4;
        object2 = ByteBuffer.allocate(n3);
        object3 = ((TransportContext)object).getPriority();
        int n4 = PriorityMapping.toInt((Priority)((Object)object3));
        object2 = ((ByteBuffer)object2).putInt(n4).array();
        adler32.update((byte[])object2);
        object2 = ((TransportContext)object).getExtras();
        if (object2 != null) {
            object = ((TransportContext)object).getExtras();
            adler32.update((byte[])object);
        }
        return (int)adler32.getValue();
    }

    public void schedule(TransportContext transportContext, int n3) {
        this.schedule(transportContext, n3, false);
    }

    public void schedule(TransportContext transportContext, int n3, boolean bl2) {
        boolean bl3;
        JobInfoScheduler jobInfoScheduler = this;
        TransportContext transportContext2 = transportContext;
        int n4 = n3;
        Object object = this.context;
        ComponentName componentName = new ComponentName(object, JobInfoSchedulerService.class);
        object = this.context;
        Object object2 = "jobscheduler";
        Object object3 = object = object.getSystemService((String)object2);
        object3 = (JobScheduler)object;
        int n7 = this.getJobId(transportContext);
        String string2 = LOG_TAG;
        if (!bl2 && (bl3 = this.isJobServiceOn((JobScheduler)object3, n7, n3))) {
            Logging.d(string2, "Upload for context %s is already scheduled. Returning...", (Object)transportContext);
            return;
        }
        long l2 = jobInfoScheduler.eventStore.getNextCallTime(transportContext2);
        object = jobInfoScheduler.config;
        object2 = new JobInfo.Builder(n7, componentName);
        Object object4 = transportContext.getPriority();
        componentName = object;
        object = object2;
        object2 = object4;
        componentName = componentName.configureJob((JobInfo.Builder)object, (Priority)((Object)object4), l2, n3);
        object = new PersistableBundle();
        object.putInt(ATTEMPT_NUMBER, n4);
        object4 = transportContext.getBackendName();
        object.putString(BACKEND_NAME, (String)object4);
        int n8 = PriorityMapping.toInt(transportContext.getPriority());
        object4 = EVENT_PRIORITY;
        object.putInt((String)object4, n8);
        object2 = transportContext.getExtras();
        if (object2 != null) {
            object2 = Base64.encodeToString((byte[])transportContext.getExtras(), (int)0);
            object4 = EXTRAS;
            object.putString((String)object4, (String)object2);
        }
        componentName.setExtras((PersistableBundle)object);
        object = n7;
        object2 = jobInfoScheduler.config;
        object4 = transportContext.getPriority();
        object2 = ((SchedulerConfig)object2).getScheduleDelay((Priority)((Object)object4), l2, n4);
        object4 = l2;
        Integer n10 = n3;
        Object[] objectArray = new Object[]{transportContext2, object, object2, object4, n10};
        Logging.d(string2, "Scheduling upload for context %s with jobId=%d in %dms(Backend next call timestamp %d). Attempt %d", objectArray);
        transportContext2 = componentName.build();
        object3.schedule((JobInfo)transportContext2);
    }
}

