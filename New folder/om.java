/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.IBinder
 *  android.webkit.WebSettings
 */
import android.os.IBinder;
import android.webkit.WebSettings;
import androidx.core.app.JobIntentService$e;

public final class om {
    public static /* bridge */ /* synthetic */ IBinder a(JobIntentService$e jobIntentService$e) {
        return jobIntentService$e.getBinder();
    }

    public static /* bridge */ /* synthetic */ void b(WebSettings webSettings, boolean bl2) {
        webSettings.setSafeBrowsingEnabled(bl2);
    }
}

