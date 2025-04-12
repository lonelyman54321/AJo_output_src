/*
 * Decompiled with CFR 0.152.
 */
package okhttp3.internal.connection;

import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.connection.RealCall;
import okio.AsyncTimeout;

public final class RealCall$AsyncCall
implements Runnable {
    public final wj_2 a;
    public volatile AtomicInteger b;
    public final /* synthetic */ RealCall c;

    public RealCall$AsyncCall(RealCall object, wj_2 wj_22) {
        Intrinsics.checkNotNullParameter(wj_22, "responseCallback");
        this.c = object;
        this.a = wj_22;
        this.b = object = new AtomicInteger(0);
    }

    /*
     * Loose catch block
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void run() {
        Throwable throwable522;
        Throwable throwable2222;
        String string2;
        Thread thread2;
        Object object;
        Object object2;
        block17: {
            Object object3;
            block18: {
                void var2_10;
                int n3;
                Object object4;
                block16: {
                    block15: {
                        object3 = "Callback failure for ";
                        object2 = "canceled due to ";
                        object4 = new StringBuilder("OkHttp ");
                        object = this.c.b.a.i();
                        ((StringBuilder)object4).append((String)object);
                        object4 = ((StringBuilder)object4).toString();
                        object = this.c;
                        thread2 = Thread.currentThread();
                        string2 = thread2.getName();
                        thread2.setName((String)object4);
                        try {
                            object4 = ((RealCall)object).f;
                            ((AsyncTimeout)object4).h();
                            n3 = 0;
                            object4 = null;
                        }
                        catch (Throwable throwable2222) {}
                        object4 = ((RealCall)object).g();
                        wj_2 wj_22 = this.a;
                        wj_22.onResponse((ij_2)object, (cl2_2)object4);
                        object3 = ((RealCall)object).a;
                        object3 = ((x72_0)object3).a;
                        break block18;
                        catch (Throwable throwable3) {
                            n3 = 1;
                            break block15;
                        }
                        catch (IOException iOException) {
                            n3 = 1;
                            break block16;
                        }
                        catch (Throwable throwable4) {
                            // empty catch block
                        }
                    }
                    try {
                        void var1_5;
                        ((RealCall)object).cancel();
                        if (n3 != 0) throw var1_5;
                        StringBuilder stringBuilder = new StringBuilder((String)object2);
                        stringBuilder.append(var1_5);
                        object2 = stringBuilder.toString();
                        object4 = new IOException((String)object2);
                        yc0_2.a((Throwable)object4, (Throwable)var1_5);
                        object2 = this.a;
                        object2.onFailure((ij_2)object, (IOException)object4);
                        throw var1_5;
                    }
                    catch (Throwable throwable522) {
                        break block17;
                    }
                    catch (IOException iOException) {
                        // empty catch block
                    }
                }
                if (n3 != 0) {
                    object4 = zs2_2.a;
                    object4 = zs2_2.a;
                    StringBuilder stringBuilder = new StringBuilder((String)object3);
                    object3 = RealCall.b((RealCall)object);
                    stringBuilder.append((String)object3);
                    object3 = stringBuilder.toString();
                    object4.getClass();
                    n3 = 4;
                    zs2_2.i(n3, (String)object3, (Throwable)var2_10);
                } else {
                    object3 = this.a;
                    object3.onFailure((ij_2)object, (IOException)var2_10);
                }
                object3 = ((RealCall)object).a;
                object3 = ((x72_0)object3).a;
            }
            ((fr0_2)object3).c(this);
            thread2.setName(string2);
            return;
        }
        object2 = ((RealCall)object).a;
        object2 = ((x72_0)object2).a;
        ((fr0_2)object2).c(this);
        throw throwable522;
        thread2.setName(string2);
        throw throwable2222;
    }
}

