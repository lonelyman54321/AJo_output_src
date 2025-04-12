/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.ThreadFactory;

public final class X30
implements ThreadFactory {
    public final /* synthetic */ String a;

    public /* synthetic */ X30(String string2) {
        this.a = string2;
    }

    public final Thread newThread(Runnable runnable2) {
        String string2 = this.a;
        Thread thread2 = new Thread(runnable2, string2);
        thread2.setPriority(10);
        return thread2;
    }
}

