/*
 * Decompiled with CFR 0.152.
 */
package okhttp3.internal.connection;

import java.lang.ref.Reference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.concurrent.b;
import okhttp3.internal.concurrent.c;
import okhttp3.internal.connection.RealCall;
import okhttp3.internal.connection.RealCall$a;

public final class a {
    public final int a;
    public final long b;
    public final b c;
    public final me2_2 d;
    public final ConcurrentLinkedQueue e;

    public a(c concurrentLinkedQueue, TimeUnit object) {
        long l2;
        Intrinsics.checkNotNullParameter(concurrentLinkedQueue, "taskRunner");
        Intrinsics.checkNotNullParameter(object, "timeUnit");
        this.a = 5;
        this.b = l2 = object.toNanos(5);
        concurrentLinkedQueue = ((c)((Object)concurrentLinkedQueue)).f();
        this.c = concurrentLinkedQueue;
        concurrentLinkedQueue = new ConcurrentLinkedQueue();
        object = ez3.g;
        concurrentLinkedQueue = h30_0.a((StringBuilder)((Object)concurrentLinkedQueue), (String)object, " ConnectionPool");
        super(this, (String)((Object)concurrentLinkedQueue));
        this.d = object;
        this.e = concurrentLinkedQueue = new ConcurrentLinkedQueue();
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean a(h4_0 var1_1, RealCall var2_3, List var3_4, boolean var4_5) {
        Intrinsics.checkNotNullParameter(var1_1, "address");
        Intrinsics.checkNotNullParameter(var2_3, "call");
        var5_6 = this.e.iterator();
        while (true) {
            block6: {
                var6_7 = var5_6.hasNext();
                var7_8 = false;
                if (var6_7 == false) return false;
                var8_9 = (je2_2)var5_6.next();
                var9_10 = "connection";
                Intrinsics.checkNotNullExpressionValue(var8_9, var9_10);
                synchronized (var8_9) {
                    var10_11 = true;
                    if (!var4_5) ** GOTO lbl19
                    try {
                        var11_12 = var8_9.g;
                        if (var11_12 != null) {
                            var7_8 = true;
                        }
                        if (!var7_8) break block6;
lbl19:
                        // 2 sources

                        if (var7_8 = var8_9.i(var1_1, var3_4)) {
                            var2_3.d(var8_9);
                            return var10_11;
                        }
                    }
                    catch (Throwable var1_2) {
                        break;
                    }
                }
            }
        }
        {
            throw var1_2;
        }
    }

    public final int b(je2_2 je2_22, long l2) {
        int n3;
        int n4 = 1;
        Object object = ez3.a;
        object = je2_22.p;
        int n7 = 0;
        while (n7 < (n3 = ((ArrayList)object).size())) {
            Object object2 = (Reference)((ArrayList)object).get(n7);
            Object object3 = ((Reference)object2).get();
            if (object3 != null) {
                n7 += n4;
                continue;
            }
            Intrinsics.checkNotNull(object2, "null cannot be cast to non-null type okhttp3.internal.connection.RealCall.CallReference");
            object2 = (RealCall$a)object2;
            object3 = new StringBuilder("A connection to ");
            Object object4 = je2_22.b.a.i;
            ((StringBuilder)object3).append(object4);
            ((StringBuilder)object3).append(" was leaked. Did you forget to close a response body?");
            object3 = ((StringBuilder)object3).toString();
            object4 = zs2_2.a;
            object4 = zs2_2.a;
            object2 = ((RealCall$a)object2).a;
            ((zs2_2)object4).j(object2, (String)object3);
            ((ArrayList)object).remove(n7);
            je2_22.j = n4;
            n3 = (int)(((ArrayList)object).isEmpty() ? 1 : 0);
            if (n3 == 0) continue;
            long l3 = this.b;
            je2_22.q = l2 -= l3;
            return 0;
        }
        return ((ArrayList)object).size();
    }

    public final void c(je2_2 object) {
        Intrinsics.checkNotNullParameter(object, "connection");
        Object object2 = ez3.a;
        this.e.add(object);
        object = this.c;
        object2 = this.d;
        okhttp3.internal.concurrent.b.d((b)object, (ri3_1)object2);
    }
}

