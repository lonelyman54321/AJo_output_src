/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.job.JobParameters
 *  android.app.job.JobWorkItem
 *  android.webkit.WebView
 *  android.webkit.WebViewClient
 */
import android.app.job.JobParameters;
import android.app.job.JobWorkItem;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public final class pm {
    public static /* bridge */ /* synthetic */ JobWorkItem a(JobParameters jobParameters) {
        return jobParameters.dequeueWork();
    }

    public static /* bridge */ /* synthetic */ WebViewClient b(WebView webView) {
        return webView.getWebViewClient();
    }
}

