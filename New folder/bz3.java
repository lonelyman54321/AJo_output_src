/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.ThreadFactory;

public final class bz3
implements ThreadFactory {
    public final /* synthetic */ String a;

    public /* synthetic */ bz3(String string2) {
        this.a = string2;
    }

    public final Thread newThread(Runnable runnable2) {
        String string2 = this.a;
        Thread thread2 = new Thread(runnable2, string2);
        return thread2;
    }
}

