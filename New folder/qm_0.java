/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.job.JobWorkItem
 *  android.content.Intent
 *  android.webkit.WebSettings
 */
import android.app.job.JobWorkItem;
import android.content.Intent;
import android.webkit.WebSettings;

/*
 * Renamed from qm
 */
public final class qm_0 {
    public static /* bridge */ /* synthetic */ Intent a(JobWorkItem jobWorkItem) {
        return jobWorkItem.getIntent();
    }

    public static /* bridge */ /* synthetic */ boolean b(WebSettings webSettings) {
        return webSettings.getSafeBrowsingEnabled();
    }
}

