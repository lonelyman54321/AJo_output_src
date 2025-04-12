/*
 * Decompiled with CFR 0.152.
 */
import com.google.common.util.concurrent.AsyncCallable;
import com.google.common.util.concurrent.Callables;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.ListeningExecutorService;
import java.util.concurrent.Callable;

/*
 * Renamed from SJ
 */
public final class sj_2
implements AsyncCallable {
    public final /* synthetic */ ListeningExecutorService a;
    public final /* synthetic */ Callable b;

    public /* synthetic */ sj_2(ListeningExecutorService listeningExecutorService, Callable callable) {
        this.a = listeningExecutorService;
        this.b = callable;
    }

    public final ListenableFuture call() {
        ListeningExecutorService listeningExecutorService = this.a;
        Callable callable = this.b;
        return Callables.b(listeningExecutorService, callable);
    }
}

