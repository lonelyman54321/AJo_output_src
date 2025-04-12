/*
 * Decompiled with CFR 0.152.
 */
import io.reactivex.Scheduler;
import io.reactivex.android.schedulers.HandlerScheduler;
import io.reactivex.internal.operators.observable.ObservableInterval;
import io.reactivex.internal.operators.observable.ObservableObserveOn;
import io.reactivex.internal.operators.observable.ObservableSubscribeOn;
import java.util.concurrent.TimeUnit;

/*
 * Renamed from t62
 */
public abstract class t62_0
implements D62 {
    public static ObservableInterval d(TimeUnit timeUnit) {
        Scheduler scheduler = qt2_2.b;
        x03_0.b((Object)timeUnit, "unit is null");
        x03_0.b(scheduler, "scheduler is null");
        long l2 = 0L;
        long l3 = 1000L;
        long l4 = Math.max(l2, l3);
        long l7 = Math.max(l2, l3);
        ObservableInterval observableInterval = new ObservableInterval(l4, l7, timeUnit, scheduler);
        return observableInterval;
    }

    public final void c(e62_0 e62_02) {
        try {
            this.f(e62_02);
            return;
        }
        catch (Throwable throwable) {
            mm0.h(throwable);
            dr2_2.b(throwable);
            NullPointerException nullPointerException = new NullPointerException("Actually not, but can't throw other exceptions due to RS");
            nullPointerException.initCause(throwable);
            throw nullPointerException;
        }
        catch (NullPointerException nullPointerException) {
            throw nullPointerException;
        }
    }

    public final ObservableObserveOn e(HandlerScheduler handlerScheduler) {
        int n3 = yt0_2.a;
        x03_0.c(n3, "bufferSize");
        ObservableObserveOn observableObserveOn = new ObservableObserveOn(this, handlerScheduler, n3);
        return observableObserveOn;
    }

    public abstract void f(e62_0 var1);

    public final ObservableSubscribeOn g(Scheduler scheduler) {
        x03_0.b(scheduler, "scheduler is null");
        ObservableSubscribeOn observableSubscribeOn = new ObservableSubscribeOn(this, scheduler);
        return observableSubscribeOn;
    }
}

