/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.job.JobParameters
 */
import android.app.job.JobParameters;
import androidx.media3.exoplayer.video.f$a;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;

/*
 * Renamed from yl1
 */
public final class yl1_2
implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ yl1_2(int n3, Object object, Object object2) {
        this.a = n3;
        this.b = object;
        this.c = object2;
    }

    public final void run() {
        Object object = this.c;
        Object object2 = this.b;
        int n3 = this.a;
        switch (n3) {
            default: {
                object2 = (f$a)object2;
                object2.getClass();
                n3 = gz3.a;
                object2 = ((f$a)object2).b;
                object = (fj0)object;
                object2.r((fj0)object);
                return;
            }
            case 0: 
        }
        object2 = (JobInfoSchedulerService)((Object)object2);
        object = (JobParameters)object;
        JobInfoSchedulerService.a((JobInfoSchedulerService)((Object)object2), (JobParameters)object);
    }
}

