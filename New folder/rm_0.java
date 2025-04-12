/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.job.JobParameters
 *  android.app.job.JobWorkItem
 *  android.content.pm.PackageInfo
 *  android.webkit.WebView
 */
import android.app.job.JobParameters;
import android.app.job.JobWorkItem;
import android.content.pm.PackageInfo;
import android.webkit.WebView;

/*
 * Renamed from rm
 */
public final class rm_0 {
    public static /* bridge */ /* synthetic */ PackageInfo a() {
        return WebView.getCurrentWebViewPackage();
    }

    public static /* bridge */ /* synthetic */ void b(JobParameters jobParameters, JobWorkItem jobWorkItem) {
        jobParameters.completeWork(jobWorkItem);
    }
}

