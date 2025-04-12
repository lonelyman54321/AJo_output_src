/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

public final class v61$b {
    public final v61$a a;
    public final v61$a b;
    public rE3$a c;
    public final ReentrantLock d;

    public v61$b(v61 object) {
        this.a = object = new v61$a();
        this.b = object = new v61$a();
        this.d = object = new ReentrantLock();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void a(rE3$a object, Function2 function2) {
        Throwable throwable2;
        ReentrantLock reentrantLock;
        block3: {
            block2: {
                Intrinsics.checkNotNullParameter(function2, "block");
                reentrantLock = this.d;
                try {
                    reentrantLock.lock();
                    if (object == null) break block2;
                    this.c = object;
                }
                catch (Throwable throwable2) {
                    break block3;
                }
            }
            object = this.a;
            v61$a v61$a = this.b;
            function2.invoke(object, v61$a);
            object = Unit.a;
            reentrantLock.unlock();
            return;
        }
        reentrantLock.unlock();
        throw throwable2;
    }
}

