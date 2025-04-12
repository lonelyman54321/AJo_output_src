/*
 * Decompiled with CFR 0.152.
 */
package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import com.appsflyer.internal.AFh1uSDK;
import com.appsflyer.internal.AFh1vSDK;
import com.appsflyer.internal.n;
import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class AFd1ySDK
extends ThreadPoolExecutor {
    private final Queue getCurrencyIso4217Code;

    private AFd1ySDK(int n3, int n4, long l2, TimeUnit timeUnit, BlockingQueue blockingQueue, Queue queue) {
        Object object = "";
        Intrinsics.checkNotNullParameter((Object)timeUnit, (String)object);
        Intrinsics.checkNotNullParameter(blockingQueue, (String)object);
        Intrinsics.checkNotNullParameter(queue, (String)object);
        n n7 = new n(queue);
        super(n3, n4, l2, timeUnit, (BlockingQueue<Runnable>)blockingQueue, n7);
        object = this;
        this.getCurrencyIso4217Code = queue;
    }

    public /* synthetic */ AFd1ySDK(int n3, int n4, long l2, TimeUnit timeUnit, BlockingQueue blockingQueue, Queue linkedList, int n7, DefaultConstructorMarker defaultConstructorMarker) {
        LinkedList linkedList2;
        int n8 = n7 & 0x20;
        LinkedList linkedList3 = n8 != 0 ? (linkedList2 = new LinkedList()) : linkedList;
        this(n3, n4, l2, timeUnit, blockingQueue, linkedList3);
    }

    private static final void AFAdRevenueData(Queue queue, Runnable runnable2, ThreadPoolExecutor threadPoolExecutor) {
        String string2 = "";
        Intrinsics.checkNotNullParameter(queue, string2);
        Intrinsics.checkNotNullParameter(runnable2, string2);
        Intrinsics.checkNotNullParameter(threadPoolExecutor, string2);
        queue.add(runnable2);
    }

    public static /* synthetic */ void a(Queue queue, Runnable runnable2, ThreadPoolExecutor threadPoolExecutor) {
        AFd1ySDK.AFAdRevenueData(queue, runnable2, threadPoolExecutor);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void afterExecute(Runnable object, Throwable throwable) {
        Intrinsics.checkNotNullParameter(object, "");
        super.afterExecute((Runnable)object, throwable);
        Object object2 = "";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        if (throwable != null) {
            object2 = AFLogger.INSTANCE;
            AFh1vSDK aFh1vSDK = AFh1vSDK.afVerboseLog;
            CharSequence charSequence = new StringBuilder("Error while executing task: ");
            charSequence.append(object);
            charSequence = charSequence.toString();
            AFh1uSDK.e$default((AFh1uSDK)object2, aFh1vSDK, (String)charSequence, throwable, true, true, true, false, 64, null);
            return;
        }
        synchronized (this) {
            int n3;
            try {
                object = this.getCurrencyIso4217Code;
                n3 = object.size();
                throwable = null;
            }
            catch (Throwable throwable2) {}
            throw throwable2;
            for (int i3 = 0; i3 < n3; ++i3) {
                object2 = this.getCurrencyIso4217Code;
                object2 = object2.poll();
                if ((object2 = (Runnable)object2) == null) continue;
                this.execute((Runnable)object2);
            }
            object = Unit.a;
            return;
        }
    }
}

