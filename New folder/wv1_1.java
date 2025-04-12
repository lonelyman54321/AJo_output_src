/*
 * Decompiled with CFR 0.152.
 */
import com.google.common.util.concurrent.ListeningScheduledExecutorService;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/*
 * Renamed from wv1
 */
public final class wv1_1 {
    public static /* bridge */ /* synthetic */ ScheduledFuture a(ListeningScheduledExecutorService listeningScheduledExecutorService, Runnable runnable2, long l2, TimeUnit timeUnit) {
        return listeningScheduledExecutorService.schedule(runnable2, l2, timeUnit);
    }

    public static /* bridge */ /* synthetic */ ScheduledFuture b(ListeningScheduledExecutorService listeningScheduledExecutorService, Callable callable, long l2, TimeUnit timeUnit) {
        return listeningScheduledExecutorService.schedule(callable, l2, timeUnit);
    }

    public static /* bridge */ /* synthetic */ ScheduledFuture c(ListeningScheduledExecutorService listeningScheduledExecutorService, Runnable runnable2, long l2, long l3, TimeUnit timeUnit) {
        return listeningScheduledExecutorService.scheduleAtFixedRate(runnable2, l2, l3, timeUnit);
    }

    public static /* bridge */ /* synthetic */ ScheduledFuture d(ListeningScheduledExecutorService listeningScheduledExecutorService, Runnable runnable2, long l2, long l3, TimeUnit timeUnit) {
        return listeningScheduledExecutorService.scheduleWithFixedDelay(runnable2, l2, l3, timeUnit);
    }
}

