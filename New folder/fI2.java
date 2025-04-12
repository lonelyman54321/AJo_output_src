/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

public final class fI2
implements gi2_0 {
    public final /* synthetic */ Executor a;
    public final /* synthetic */ n60_0 b;

    public fI2(ExecutorService executorService, tv1_0 tv1_02) {
        this.a = executorService;
        this.b = tv1_02;
    }

    public final void execute(Runnable runnable2) {
        this.a.execute(runnable2);
    }

    public final void release() {
        n60_0 n60_02 = this.b;
        Executor executor = this.a;
        n60_02.accept(executor);
    }
}

