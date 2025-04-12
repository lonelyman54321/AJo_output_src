/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.job.JobInfo
 *  android.app.job.JobScheduler
 *  android.app.job.JobWorkItem
 */
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.app.job.JobWorkItem;

/*
 * Renamed from zl1
 */
public final class zl1_1 {
    public static /* bridge */ /* synthetic */ void a(JobScheduler jobScheduler, JobInfo jobInfo, JobWorkItem jobWorkItem) {
        jobScheduler.enqueue(jobInfo, jobWorkItem);
    }
}

