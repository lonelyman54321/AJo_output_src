/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.job.JobScheduler
 *  android.content.Context
 *  android.os.Build$VERSION
 */
import android.app.job.JobScheduler;
import android.content.Context;
import android.os.Build;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from El1
 */
public final class el1_0 {
    public static final /* synthetic */ int a;

    static {
        Intrinsics.checkNotNullExpressionValue(qx1.b("SystemJobScheduler"), "tagWithPrefix(\"SystemJobScheduler\")");
    }

    public static final List a(JobScheduler object) {
        Intrinsics.checkNotNullParameter(object, "<this>");
        String string2 = "jobScheduler";
        Intrinsics.checkNotNullParameter(object, string2);
        object = object.getAllPendingJobs();
        string2 = "jobScheduler.allPendingJobs";
        try {
            Intrinsics.checkNotNullExpressionValue(object, string2);
        }
        catch (Throwable throwable) {
            qx1.a().getClass();
            object = null;
        }
        return object;
    }

    public static final JobScheduler b(Context object) {
        Intrinsics.checkNotNullParameter(object, "<this>");
        object = object.getSystemService("jobscheduler");
        String string2 = "null cannot be cast to non-null type android.app.job.JobScheduler";
        Intrinsics.checkNotNull(object, string2);
        object = (JobScheduler)object;
        int n3 = Build.VERSION.SDK_INT;
        int n4 = 34;
        if (n3 >= n4) {
            Intrinsics.checkNotNullParameter(object, "jobScheduler");
            object = dl1_0.a((JobScheduler)object);
            string2 = "jobScheduler.forNamespace(WORKMANAGER_NAMESPACE)";
            Intrinsics.checkNotNullExpressionValue(object, string2);
        }
        return object;
    }
}

