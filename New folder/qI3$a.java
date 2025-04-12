/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.Executor;

public final class qI3$a
implements Executor {
    public final /* synthetic */ qi3_1 a;

    public qI3$a(qi3_1 qi3_12) {
        this.a = qi3_12;
    }

    public final void execute(Runnable runnable2) {
        this.a.c.post(runnable2);
    }
}

