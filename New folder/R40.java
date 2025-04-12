/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.Intrinsics;

public final class R40
implements ThreadFactory {
    public final AtomicInteger a;
    public final /* synthetic */ boolean b;

    public R40(boolean bl2) {
        AtomicInteger atomicInteger;
        this.b = bl2;
        this.a = atomicInteger = new AtomicInteger(0);
    }

    public final Thread newThread(Runnable runnable2) {
        CharSequence charSequence = "runnable";
        Intrinsics.checkNotNullParameter(runnable2, (String)charSequence);
        boolean bl2 = this.b;
        charSequence = bl2 ? "WM.task-" : "androidx.work-";
        charSequence = Ex0.a((String)charSequence);
        int n3 = this.a.incrementAndGet();
        ((StringBuilder)charSequence).append(n3);
        charSequence = ((StringBuilder)charSequence).toString();
        Thread thread2 = new Thread(runnable2, (String)charSequence);
        return thread2;
    }
}

