/*
 * Decompiled with CFR 0.152.
 */
import com.google.common.util.concurrent.AbstractIdleService;
import java.util.concurrent.Executor;

public final class O0
implements Executor {
    public final /* synthetic */ AbstractIdleService a;

    public /* synthetic */ O0(AbstractIdleService abstractIdleService) {
        this.a = abstractIdleService;
    }

    public final void execute(Runnable runnable2) {
        AbstractIdleService.a(this.a, runnable2);
    }
}

