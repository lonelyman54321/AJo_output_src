/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Intent
 */
package androidx.core.app;

import android.content.Intent;
import androidx.core.app.JobIntentService;
import androidx.core.app.JobIntentService$d;

public final class JobIntentService$c
implements JobIntentService$d {
    public final Intent a;
    public final int b;
    public final /* synthetic */ JobIntentService c;

    public JobIntentService$c(JobIntentService jobIntentService, Intent intent, int n3) {
        this.c = jobIntentService;
        this.a = intent;
        this.b = n3;
    }

    public final void a() {
        JobIntentService jobIntentService = this.c;
        int n3 = this.b;
        jobIntentService.stopSelf(n3);
    }

    public final Intent getIntent() {
        return this.a;
    }
}

