/*
 * Decompiled with CFR 0.152.
 */
import com.google.common.base.Supplier;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/*
 * Renamed from Qe3
 */
public final class qe3_2
implements Supplier {
    public final Object get() {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        return reentrantReadWriteLock;
    }
}

