/*
 * Decompiled with CFR 0.152.
 */
import java.io.Closeable;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;

/*
 * Renamed from uL0
 */
public abstract class ul0_1
implements Closeable {
    public boolean a;
    public int b;
    public final ReentrantLock c;

    public ul0_1() {
        ReentrantLock reentrantLock;
        this.c = reentrantLock = new ReentrantLock();
    }

    public abstract void a();

    public abstract int b(long var1, byte[] var3, int var4, int var5);

    public abstract long c();

    public final void close() {
        ReentrantLock reentrantLock;
        block6: {
            reentrantLock = this.c;
            reentrantLock.lock();
            int n3 = this.a;
            if (n3 != 0) {
                reentrantLock.unlock();
                return;
            }
            n3 = 1;
            this.a = n3;
            n3 = this.b;
            if (n3 == 0) break block6;
            reentrantLock.unlock();
            return;
        }
        try {
            Unit unit = Unit.a;
            this.a();
            return;
        }
        finally {
            reentrantLock.unlock();
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final long d() {
        Throwable throwable2;
        ReentrantLock reentrantLock;
        block5: {
            block4: {
                reentrantLock = this.c;
                reentrantLock.lock();
                try {
                    boolean bl2 = this.a ^ true;
                    if (!bl2) break block4;
                }
                catch (Throwable throwable2) {
                    break block5;
                }
                {
                    Unit unit = Unit.a;
                    reentrantLock.unlock();
                    return this.c();
                }
            }
            String string2 = "closed";
            {
                string2 = string2.toString();
                IllegalStateException illegalStateException = new IllegalStateException(string2);
                throw illegalStateException;
            }
        }
        reentrantLock.unlock();
        throw throwable2;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final uL0$a h(long l2) {
        Throwable throwable2;
        ReentrantLock reentrantLock;
        block5: {
            block4: {
                int n3;
                reentrantLock = this.c;
                reentrantLock.lock();
                try {
                    n3 = this.a ^ 1;
                    if (n3 == 0) break block4;
                }
                catch (Throwable throwable2) {
                    break block5;
                }
                {
                    this.b = n3 = this.b + 1;
                    reentrantLock.unlock();
                    return new uL0$a(this, l2);
                }
            }
            String string2 = "closed";
            {
                string2 = string2.toString();
                IllegalStateException illegalStateException = new IllegalStateException(string2);
                throw illegalStateException;
            }
        }
        reentrantLock.unlock();
        throw throwable2;
    }
}

