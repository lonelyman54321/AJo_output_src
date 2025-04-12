/*
 * Decompiled with CFR 0.152.
 */
import androidx.work.RxWorker;
import androidx.work.c;
import io.reactivex.Scheduler;
import io.reactivex.internal.schedulers.ExecutorScheduler;
import java.util.concurrent.Executor;

public final class fR2
implements eK$c {
    public final /* synthetic */ RxWorker a;
    public final /* synthetic */ g53_0 b;

    public /* synthetic */ fR2(RxWorker rxWorker, g53_0 g53_02) {
        this.a = rxWorker;
        this.b = g53_02;
    }

    public final Object a(eK$a eK$a) {
        Object object = this.a;
        Object object2 = ((c)object).getBackgroundExecutor();
        Scheduler scheduler = qt2_2.a;
        scheduler = new ExecutorScheduler((Executor)object2);
        object2 = this.b.h(scheduler);
        object = ((c)object).getTaskExecutor().c();
        scheduler = new ExecutorScheduler((Executor)object);
        object = ((g53_0)object2).e(scheduler);
        object2 = new hR2(eK$a);
        ((g53_0)object).a((t53_0)object2);
        return "converted single to future";
    }
}

