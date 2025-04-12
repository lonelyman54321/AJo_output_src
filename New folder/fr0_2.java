/*
 * Decompiled with CFR 0.152.
 */
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.SequencedCollection;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.connection.RealCall;
import okhttp3.internal.connection.RealCall$AsyncCall;

/*
 * Renamed from fr0
 */
public final class fr0_2 {
    public ThreadPoolExecutor a;
    public final ArrayDeque b;
    public final ArrayDeque c;
    public final ArrayDeque d;

    public fr0_2() {
        ArrayDeque arrayDeque;
        this.b = arrayDeque = new ArrayDeque();
        this.c = arrayDeque = new ArrayDeque();
        this.d = arrayDeque = new ArrayDeque();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final ExecutorService a() {
        synchronized (this) {
            Throwable throwable2;
            block5: {
                ThreadPoolExecutor threadPoolExecutor;
                block4: {
                    int n3;
                    Zy3 zy3;
                    String string2;
                    Object object;
                    SynchronousQueue<Runnable> synchronousQueue;
                    TimeUnit timeUnit;
                    try {
                        threadPoolExecutor = this.a;
                        if (threadPoolExecutor != null) break block4;
                        timeUnit = TimeUnit.SECONDS;
                        synchronousQueue = new SynchronousQueue<Runnable>();
                        object = new StringBuilder();
                        string2 = ez3.g;
                        ((StringBuilder)object).append(string2);
                        string2 = " Dispatcher";
                        ((StringBuilder)object).append(string2);
                        object = ((StringBuilder)object).toString();
                        string2 = "name";
                        Intrinsics.checkNotNullParameter(object, string2);
                        string2 = null;
                        zy3 = new Zy3((String)object, false);
                        n3 = -1 >>> 1;
                    }
                    catch (Throwable throwable2) {
                        break block5;
                    }
                    long l2 = 60;
                    string2 = null;
                    object = threadPoolExecutor;
                    this.a = threadPoolExecutor = new ThreadPoolExecutor(0, n3, l2, timeUnit, synchronousQueue, zy3);
                }
                threadPoolExecutor = this.a;
                Intrinsics.checkNotNull(threadPoolExecutor);
                return threadPoolExecutor;
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final void b(ArrayDeque object, Object object2) {
        block4: {
            // MONITORENTER : this
            boolean bl2 = ((ArrayDeque)object).remove(object2);
            if (!bl2) break block4;
            object = Unit.a;
            this.d();
            return;
        }
        object2 = "Call wasn't in-flight!";
        object = new AssertionError(object2);
        throw object;
    }

    public final void c(RealCall$AsyncCall realCall$AsyncCall) {
        Intrinsics.checkNotNullParameter(realCall$AsyncCall, "call");
        realCall$AsyncCall.b.decrementAndGet();
        ArrayDeque arrayDeque = this.c;
        this.b(arrayDeque, realCall$AsyncCall);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void d() {
        Object object;
        int n3;
        Object object2;
        Object object3;
        block13: {
            object3 = ez3.a;
            object3 = new ArrayList;
            ((ArrayList)object3)();
            synchronized (this) {
                Throwable throwable2;
                block12: {
                    Object object4;
                    try {
                        object4 = this.b;
                        object4 = ((ArrayDeque)object4).iterator();
                        object2 = "readyAsyncCalls.iterator()";
                        Intrinsics.checkNotNullExpressionValue(object4, (String)object2);
                        while ((n3 = object4.hasNext()) != 0) {
                            int n4;
                            object2 = object4.next();
                            object2 = (RealCall$AsyncCall)object2;
                            object = this.c;
                            int n7 = ((ArrayDeque)object).size();
                            if (n7 < (n4 = 64)) {
                                object = ((RealCall$AsyncCall)object2).b;
                                n7 = ((AtomicInteger)object).get();
                                if (n7 >= (n4 = 5)) continue;
                                object4.remove();
                                object = ((RealCall$AsyncCall)object2).b;
                                ((AtomicInteger)object).incrementAndGet();
                                object = "asyncCall";
                                Intrinsics.checkNotNullExpressionValue(object2, (String)object);
                                ((ArrayList)object3).add(object2);
                                object = this.c;
                                ((ArrayDeque)object).add(object2);
                                continue;
                            }
                            break;
                        }
                    }
                    catch (Throwable throwable2) {
                        break block12;
                    }
                    this.g();
                    object4 = Unit.a;
                    break block13;
                }
                throw throwable2;
            }
        }
        int n8 = ((ArrayList)object3).size();
        n3 = 0;
        object2 = null;
        while (n3 < n8) {
            object = (RealCall$AsyncCall)((ArrayList)object3).get(n3);
            Object object5 = this.a();
            object.getClass();
            Intrinsics.checkNotNullParameter(object5, "executorService");
            RealCall realCall = ((RealCall$AsyncCall)object).c;
            Object object6 = realCall.a.a;
            object6 = ez3.a;
            try {
                try {
                    object5 = (ThreadPoolExecutor)object5;
                    ((ThreadPoolExecutor)object5).execute((Runnable)object);
                }
                catch (RejectedExecutionException rejectedExecutionException) {
                    String string2 = "executor rejected";
                    object6 = new InterruptedIOException(string2);
                    ((Throwable)object6).initCause(rejectedExecutionException);
                    realCall.j((IOException)object6);
                    object5 = ((RealCall$AsyncCall)object).a;
                    object5.onFailure(realCall, (IOException)object6);
                    object5 = realCall.a.a;
                    ((fr0_2)object5).c((RealCall$AsyncCall)object);
                }
                ++n3;
            }
            catch (Throwable throwable) {
                realCall.a.a.c((RealCall$AsyncCall)object);
                throw throwable;
            }
        }
        return;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final List e() {
        synchronized (this) {
            try {
                List list = this.b;
                int n3 = 10;
                n3 = yx_2.o(list, n3);
                Object object = new ArrayList(n3);
                list = ((ArrayDeque)((Object)list)).iterator();
                while (true) {
                    if ((n3 = (int)(list.hasNext() ? 1 : 0)) == 0) {
                        list = Collections.unmodifiableList(object);
                        object = "unmodifiableList(readyAsyncCalls.map { it.call })";
                        Intrinsics.checkNotNullExpressionValue(list, (String)object);
                        return list;
                    }
                    Object object2 = list.next();
                    object2 = (RealCall$AsyncCall)object2;
                    object2 = ((RealCall$AsyncCall)object2).c;
                    ((ArrayList)object).add(object2);
                }
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final List f() {
        synchronized (this) {
            try {
                SequencedCollection<Object> sequencedCollection = this.d;
                Object object = this.c;
                int n3 = 10;
                n3 = yx_2.o((Iterable)object, n3);
                ArrayList arrayList = new ArrayList(n3);
                object = ((ArrayDeque)object).iterator();
                while (true) {
                    if ((n3 = (int)(object.hasNext() ? 1 : 0)) == 0) {
                        sequencedCollection = CollectionsKt.W(arrayList, sequencedCollection);
                        sequencedCollection = Collections.unmodifiableList(sequencedCollection);
                        object = "unmodifiableList(running\u2026yncCalls.map { it.call })";
                        Intrinsics.checkNotNullExpressionValue(sequencedCollection, (String)object);
                        return sequencedCollection;
                    }
                    Object object2 = object.next();
                    object2 = (RealCall$AsyncCall)object2;
                    object2 = ((RealCall$AsyncCall)object2).c;
                    arrayList.add(object2);
                }
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final int g() {
        synchronized (this) {
            ArrayDeque arrayDeque = this.c;
            int n3 = arrayDeque.size();
            ArrayDeque arrayDeque2 = this.d;
            int n4 = arrayDeque2.size();
            return n3 += n4;
        }
    }
}

