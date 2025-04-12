/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Application
 *  android.app.job.JobParameters
 *  android.app.job.JobService
 *  android.os.Build$VERSION
 *  android.os.Looper
 */
package androidx.work.impl.background.systemjob;

import android.app.Application;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.os.Build;
import android.os.Looper;
import androidx.work.WorkerParameters$a;
import androidx.work.impl.background.systemjob.SystemJobService$a;
import androidx.work.impl.background.systemjob.SystemJobService$b;
import androidx.work.impl.background.systemjob.SystemJobService$c;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import kotlin.jvm.internal.Intrinsics;

public class SystemJobService
extends JobService
implements fe0_0 {
    public static final /* synthetic */ int e;
    public ni3_1 a;
    public final HashMap b;
    public final ab3_0 c;
    public ki3_2 d;

    static {
        qx1.b("SystemJobService");
    }

    public SystemJobService() {
        Object object = new HashMap();
        this.b = object;
        this.c = object = new ab3_0();
    }

    public static void b(String string2) {
        Thread thread2;
        Object object = Looper.getMainLooper().getThread();
        if (object == (thread2 = Thread.currentThread())) {
            return;
        }
        string2 = cP.a("Cannot invoke ", string2, " on a background thread");
        object = new IllegalStateException(string2);
        throw object;
    }

    public static gI3 c(JobParameters jobParameters) {
        block7: {
            String string2 = "EXTRA_WORK_SPEC_ID";
            try {
                jobParameters = jobParameters.getExtras();
                if (jobParameters == null) break block7;
            }
            catch (NullPointerException nullPointerException) {}
            boolean bl2 = jobParameters.containsKey(string2);
            if (!bl2) break block7;
            string2 = jobParameters.getString(string2);
            String string3 = "EXTRA_WORK_SPEC_GENERATION";
            int n3 = jobParameters.getInt(string3);
            gI3 gI32 = new gI3(string2, n3);
            return gI32;
        }
        return null;
    }

    public final void a(gI3 gI32, boolean bl2) {
        SystemJobService.b("onExecuted");
        qx1 qx12 = qx1.a();
        Object object = gI32.a;
        qx12.getClass();
        qx12 = (JobParameters)this.b.remove(gI32);
        object = this.c;
        ((ab3_0)object).a(gI32);
        if (qx12 != null) {
            this.jobFinished((JobParameters)qx12, bl2);
        }
    }

    public final void onCreate() {
        IllegalStateException illegalStateException2;
        Object object;
        block9: {
            super.onCreate();
            Object object2 = this.getApplicationContext();
            object2 = ni3_1.i(object2);
            this.a = object2;
            object = object2.f;
            object2 = object2.d;
            Object object3 = new ki3_2((kz2_0)object, (Si3)object2);
            this.d = object3;
            try {
                ((kz2_0)object).a(this);
            }
            catch (IllegalStateException illegalStateException2) {
                object = this.getApplication().getClass();
                object3 = Application.class;
                boolean bl2 = object3.equals(object);
                if (!bl2) break block9;
                qx1 qx12 = qx1.a();
                qx12.getClass();
            }
            return;
        }
        object = new IllegalStateException("WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().", illegalStateException2);
        throw object;
    }

    public final void onDestroy() {
        super.onDestroy();
        Object object = this.a;
        if (object != null) {
            object = ((ni3_1)object).f;
            ((kz2_0)object).g(this);
        }
    }

    public final boolean onStartJob(JobParameters object) {
        SystemJobService.b("onStartJob");
        Object object2 = this.a;
        boolean bl2 = true;
        int n3 = 0;
        Object object3 = null;
        if (object2 == null) {
            qx1.a().getClass();
            this.jobFinished((JobParameters)object, bl2);
            return false;
        }
        object2 = SystemJobService.c((JobParameters)object);
        if (object2 == null) {
            qx1.a().getClass();
            return false;
        }
        Object object4 = this.b;
        boolean n4 = ((HashMap)object4).containsKey(object2);
        if (n4) {
            object = qx1.a();
            ((gI3)object2).toString();
            object.getClass();
            return false;
        }
        object3 = qx1.a();
        ((gI3)object2).toString();
        object3.getClass();
        ((HashMap)object4).put(object2, object);
        n3 = Build.VERSION.SDK_INT;
        int n7 = 24;
        if (n3 >= n7) {
            int n8;
            object4 = new WorkerParameters$a();
            Object object5 = SystemJobService$a.b((JobParameters)object);
            if (object5 != null) {
                ((WorkerParameters$a)object4).b = object5 = Arrays.asList(SystemJobService$a.b((JobParameters)object));
            }
            if ((object5 = SystemJobService$a.a((JobParameters)object)) != null) {
                ((WorkerParameters$a)object4).a = object5 = Arrays.asList(SystemJobService$a.a((JobParameters)object));
            }
            if (n3 >= (n8 = 28)) {
                object = SystemJobService$b.a((JobParameters)object);
                ((WorkerParameters$a)object4).c = object;
            }
        } else {
            n7 = 0;
            object4 = null;
        }
        object = this.d;
        object2 = this.c.c((gI3)object2);
        object.getClass();
        Intrinsics.checkNotNullParameter(object2, "workSpecId");
        object3 = new ji3_1(object, 0, object2, object4);
        ((ki3_2)object).b.d((Runnable)object3);
        return bl2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean onStopJob(JobParameters object) {
        int n3;
        SystemJobService.b("onStopJob");
        Object object2 = this.a;
        int n4 = 1;
        if (object2 == null) {
            qx1.a().getClass();
            return n4 != 0;
        }
        object2 = SystemJobService.c((JobParameters)object);
        if (object2 == null) {
            qx1.a().getClass();
            return false;
        }
        Object object3 = qx1.a();
        ((gI3)object2).toString();
        object3.getClass();
        this.b.remove(object2);
        object3 = this.c.a((gI3)object2);
        if (object3 != null) {
            int n7 = Build.VERSION.SDK_INT;
            int n8 = 31;
            n3 = n7 >= n8 ? SystemJobService$c.a((JobParameters)object) : -512;
            ki3_2 ki3_22 = this.d;
            ki3_22.getClass();
            String string2 = "workSpecId";
            Intrinsics.checkNotNullParameter(object3, string2);
            ki3_22.c((xb3_0)object3, n3);
        }
        object = this.a.f;
        object2 = ((gI3)object2).a;
        object3 = ((kz2_0)object).k;
        synchronized (object3) {
            object = ((kz2_0)object).i;
            n3 = (int)(((HashSet)object).contains(object2) ? 1 : 0);
            return (n3 ^ n4) != 0;
        }
    }
}

