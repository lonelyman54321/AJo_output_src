/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

public final class Zq3$a
implements Lock {
    public final void lock() {
    }

    public final void lockInterruptibly() {
    }

    public final Condition newCondition() {
        UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException("Should not be called");
        throw unsupportedOperationException;
    }

    public final boolean tryLock() {
        return true;
    }

    public final boolean tryLock(long l2, TimeUnit timeUnit) {
        return true;
    }

    public final void unlock() {
    }
}

