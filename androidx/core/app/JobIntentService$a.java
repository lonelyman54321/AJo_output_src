/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Intent
 *  android.os.AsyncTask
 */
package androidx.core.app;

import android.content.Intent;
import android.os.AsyncTask;
import androidx.core.app.JobIntentService;
import androidx.core.app.JobIntentService$d;
import androidx.core.app.JobIntentService$e;
import java.util.ArrayList;

public final class JobIntentService$a
extends AsyncTask {
    public final /* synthetic */ JobIntentService a;

    public JobIntentService$a(JobIntentService jobIntentService) {
        this.a = jobIntentService;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object doInBackground(Object[] object) {
        Throwable throwable2;
        object = (Void[])object;
        while (true) {
            object = this.a;
            Object object2 = object.a;
            Intent intent = null;
            if (object2 != null) {
                object = ((JobIntentService$e)((Object)object2)).a();
            } else {
                object2 = object.e;
                synchronized (object2) {
                    try {
                        ArrayList arrayList = object.e;
                        int n3 = arrayList.size();
                        if (n3 <= 0) return null;
                        object = object.e;
                        n3 = 0;
                        arrayList = null;
                        object = object.remove(0);
                        object = (JobIntentService$d)object;
                    }
                    catch (Throwable throwable2) {
                        break;
                    }
                }
            }
            if (object == null) {
                return null;
            }
            object2 = this.a;
            intent = object.getIntent();
            ((JobIntentService)((Object)object2)).c(intent);
            object.a();
        }
        {
            throw throwable2;
        }
    }

    public final void onCancelled(Object object) {
        object = (Void)object;
        this.a.e();
    }

    public final void onPostExecute(Object object) {
        object = (Void)object;
        this.a.e();
    }
}

