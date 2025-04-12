/*
 * Decompiled with CFR 0.152.
 */
import com.google.common.util.concurrent.AbstractExecutionThreadService;
import java.util.concurrent.Executor;

public final class L0
implements Executor {
    public final /* synthetic */ AbstractExecutionThreadService a;

    public /* synthetic */ L0(AbstractExecutionThreadService abstractExecutionThreadService) {
        this.a = abstractExecutionThreadService;
    }

    public final void execute(Runnable runnable2) {
        AbstractExecutionThreadService.a(this.a, runnable2);
    }
}

