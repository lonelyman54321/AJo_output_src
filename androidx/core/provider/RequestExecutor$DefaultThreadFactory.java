/*
 * Decompiled with CFR 0.152.
 */
package androidx.core.provider;

import androidx.core.provider.RequestExecutor$DefaultThreadFactory$ProcessPriorityThread;
import java.util.concurrent.ThreadFactory;

public final class RequestExecutor$DefaultThreadFactory
implements ThreadFactory {
    public String a;
    public int b;

    public final Thread newThread(Runnable runnable2) {
        String string2 = this.a;
        int n3 = this.b;
        RequestExecutor$DefaultThreadFactory$ProcessPriorityThread requestExecutor$DefaultThreadFactory$ProcessPriorityThread = new RequestExecutor$DefaultThreadFactory$ProcessPriorityThread(runnable2, string2, n3);
        return requestExecutor$DefaultThreadFactory$ProcessPriorityThread;
    }
}

