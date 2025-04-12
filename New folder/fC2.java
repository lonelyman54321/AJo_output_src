/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.job.JobScheduler
 *  android.content.Context
 *  android.content.SharedPreferences$Editor
 */
import android.app.job.JobScheduler;
import android.content.Context;
import android.content.SharedPreferences;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import com.clevertap.android.sdk.b;
import java.util.concurrent.Callable;

public final class fC2
implements Callable {
    public final /* synthetic */ hC2 a;

    public fC2(hC2 hC22) {
        this.a = hC22;
    }

    public final Object call() {
        hC2 hC22 = this.a;
        Object object = hC22.g;
        int n3 = -1;
        String string2 = "pfjobid";
        int n4 = gc3_0.b((Context)object, n3, string2);
        if (n4 != n3) {
            JobScheduler jobScheduler = (JobScheduler)object.getSystemService("jobscheduler");
            jobScheduler.cancel(n4);
            object = gc3_0.e((Context)object).edit().remove(string2);
            gc3_0.i((SharedPreferences.Editor)object);
        }
        object = hC22.f;
        boolean bl2 = ((CleverTapInstanceConfig)object).i;
        if (bl2 && !(bl2 = ((CleverTapInstanceConfig)object).h)) {
            object = null;
            hC2.c(hC22, false);
        } else {
            ((CleverTapInstanceConfig)object).b().getClass();
            object = "Pushamp - Cancelling worker as background sync is disabled or config is analytics only";
            b.f((String)object);
            hC22.h();
        }
        return null;
    }
}

