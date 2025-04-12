/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.util.concurrent;

import com.google.common.primitives.Longs;
import com.google.common.util.concurrent.Monitor$Guard;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public final class Monitor {
    private Monitor$Guard activeGuards = null;
    private final boolean fair;
    private final ReentrantLock lock;

    public Monitor() {
        this(false);
    }

    public Monitor(boolean bl2) {
        ReentrantLock reentrantLock;
        this.fair = bl2;
        this.lock = reentrantLock = new ReentrantLock(bl2);
    }

    public static /* synthetic */ ReentrantLock access$000(Monitor monitor) {
        return monitor.lock;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void await(Monitor$Guard monitor$Guard, boolean bl2) {
        if (bl2) {
            this.signalNextWaiter();
        }
        this.beginWaitingFor(monitor$Guard);
        try {
            do {
                Condition condition = monitor$Guard.condition;
                condition.await();
            } while (!(bl2 = monitor$Guard.isSatisfied()));
            this.endWaitingFor(monitor$Guard);
            return;
        }
        catch (Throwable throwable) {
            this.endWaitingFor(monitor$Guard);
            throw throwable;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private boolean awaitNanos(Monitor$Guard monitor$Guard, long l2, boolean bl2) {
        Throwable throwable2;
        boolean bl3;
        block9: {
            boolean bl4;
            boolean bl5 = true;
            bl3 = true;
            do {
                long l3;
                long l4;
                long l7;
                if ((l7 = (l4 = l2 - (l3 = 0L)) == 0L ? 0 : (l4 < 0L ? -1 : 1)) <= 0) {
                    if (!bl3) {
                        this.endWaitingFor(monitor$Guard);
                    }
                    return false;
                }
                if (bl3) {
                    if (bl2) {
                        try {
                            this.signalNextWaiter();
                        }
                        catch (Throwable throwable2) {
                            break block9;
                        }
                    }
                    this.beginWaitingFor(monitor$Guard);
                    bl3 = false;
                }
                Condition condition = monitor$Guard.condition;
                l2 = condition.awaitNanos(l2);
            } while (!(bl4 = monitor$Guard.isSatisfied()));
            if (!bl3) {
                this.endWaitingFor(monitor$Guard);
            }
            return bl5;
        }
        if (!bl3) {
            this.endWaitingFor(monitor$Guard);
        }
        throw throwable2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void awaitUninterruptibly(Monitor$Guard monitor$Guard, boolean bl2) {
        if (bl2) {
            this.signalNextWaiter();
        }
        this.beginWaitingFor(monitor$Guard);
        try {
            do {
                Condition condition = monitor$Guard.condition;
                condition.awaitUninterruptibly();
            } while (!(bl2 = monitor$Guard.isSatisfied()));
            this.endWaitingFor(monitor$Guard);
            return;
        }
        catch (Throwable throwable) {
            this.endWaitingFor(monitor$Guard);
            throw throwable;
        }
    }

    private void beginWaitingFor(Monitor$Guard monitor$Guard) {
        int n3;
        int n4 = monitor$Guard.waiterCount;
        monitor$Guard.waiterCount = n3 = n4 + 1;
        if (n4 == 0) {
            Monitor$Guard monitor$Guard2;
            monitor$Guard.next = monitor$Guard2 = this.activeGuards;
            this.activeGuards = monitor$Guard;
        }
    }

    private void endWaitingFor(Monitor$Guard monitor$Guard) {
        int n3;
        monitor$Guard.waiterCount = n3 = monitor$Guard.waiterCount + -1;
        if (n3 == 0) {
            Monitor$Guard monitor$Guard2 = this.activeGuards;
            Monitor$Guard monitor$Guard3 = null;
            while (true) {
                if (monitor$Guard2 == monitor$Guard) {
                    if (monitor$Guard3 == null) {
                        this.activeGuards = monitor$Guard = monitor$Guard2.next;
                    } else {
                        monitor$Guard3.next = monitor$Guard = monitor$Guard2.next;
                    }
                    monitor$Guard2.next = null;
                    break;
                }
                Monitor$Guard monitor$Guard4 = monitor$Guard2.next;
                monitor$Guard3 = monitor$Guard2;
                monitor$Guard2 = monitor$Guard4;
            }
        }
    }

    private static long initNanoTime(long l2) {
        long l3 = 0L;
        long l4 = l2 - l3;
        Object object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        if (object <= 0) {
            return l3;
        }
        l2 = System.nanoTime();
        long l7 = l2 - l3;
        object = l7 == 0L ? 0 : (l7 < 0L ? -1 : 1);
        if (object == false) {
            l2 = 1L;
        }
        return l2;
    }

    /*
     * WARNING - void declaration
     */
    private boolean isSatisfied(Monitor$Guard monitor$Guard) {
        void var1_4;
        try {
            return monitor$Guard.isSatisfied();
        }
        catch (Error error) {
        }
        catch (RuntimeException runtimeException) {
            // empty catch block
        }
        this.signalAllWaiters();
        throw var1_4;
    }

    private static long remainingNanos(long l2, long l3) {
        long l4 = 0L;
        long l7 = l3 - l4;
        Object object = l7 == 0L ? 0 : (l7 < 0L ? -1 : 1);
        if (object > 0) {
            l4 = System.nanoTime() - l2;
            l4 = l3 - l4;
        }
        return l4;
    }

    private void signalAllWaiters() {
        Monitor$Guard monitor$Guard = this.activeGuards;
        while (monitor$Guard != null) {
            Condition condition = monitor$Guard.condition;
            condition.signalAll();
            monitor$Guard = monitor$Guard.next;
        }
    }

    private void signalNextWaiter() {
        Object object = this.activeGuards;
        while (object != null) {
            boolean bl2 = this.isSatisfied((Monitor$Guard)object);
            if (bl2) {
                object = ((Monitor$Guard)object).condition;
                object.signal();
                break;
            }
            object = ((Monitor$Guard)object).next;
        }
    }

    private static long toSafeNanos(long l2, TimeUnit timeUnit) {
        return Longs.constrainToRange(timeUnit.toNanos(l2), 0L, 0x5FFFFFFFFFFFFFFDL);
    }

    public void enter() {
        this.lock.lock();
    }

    /*
     * Loose catch block
     * WARNING - void declaration
     */
    public boolean enter(long l2, TimeUnit object) {
        void var13_13;
        l2 = Monitor.toSafeNanos(l2, (TimeUnit)((Object)object));
        object = this.lock;
        boolean bl2 = this.fair;
        boolean bl3 = true;
        if (!bl2 && (bl2 = ((ReentrantLock)object).tryLock())) {
            return bl3;
        }
        bl2 = Thread.interrupted();
        long l3 = System.nanoTime();
        long l4 = l2;
        while (true) {
            boolean bl4;
            block10: {
                TimeUnit timeUnit = TimeUnit.NANOSECONDS;
                try {
                    bl4 = ((ReentrantLock)object).tryLock(l4, timeUnit);
                    if (!bl2) break block10;
                }
                catch (Throwable throwable) {
                    bl3 = bl2;
                }
                Thread thread2 = Thread.currentThread();
                thread2.interrupt();
            }
            return bl4;
            break;
            catch (InterruptedException interruptedException) {
                try {
                    l4 = Monitor.remainingNanos(l3, l2);
                    bl2 = true;
                }
                catch (Throwable throwable) {
                    // empty catch block
                    break;
                }
            }
        }
        if (bl3) {
            Thread thread3 = Thread.currentThread();
            thread3.interrupt();
        }
        throw var13_13;
    }

    public boolean enterIf(Monitor$Guard object) {
        Object object2 = ((Monitor$Guard)object).monitor;
        if (object2 == this) {
            object2 = this.lock;
            ((ReentrantLock)object2).lock();
            try {
                boolean bl2 = ((Monitor$Guard)object).isSatisfied();
                if (!bl2) {
                    ((ReentrantLock)object2).unlock();
                }
                return bl2;
            }
            catch (Throwable throwable) {
                ((ReentrantLock)object2).unlock();
                throw throwable;
            }
        }
        object = new IllegalMonitorStateException();
        throw object;
    }

    public boolean enterIf(Monitor$Guard object, long l2, TimeUnit timeUnit) {
        Monitor monitor = ((Monitor$Guard)object).monitor;
        if (monitor == this) {
            boolean bl2 = this.enter(l2, timeUnit);
            if (!bl2) {
                return false;
            }
            try {
                boolean bl3 = ((Monitor$Guard)object).isSatisfied();
                if (!bl3) {
                    ReentrantLock reentrantLock = this.lock;
                    reentrantLock.unlock();
                }
                return bl3;
            }
            catch (Throwable throwable) {
                this.lock.unlock();
                throw throwable;
            }
        }
        object = new IllegalMonitorStateException();
        throw object;
    }

    public boolean enterIfInterruptibly(Monitor$Guard object) {
        Object object2 = ((Monitor$Guard)object).monitor;
        if (object2 == this) {
            object2 = this.lock;
            ((ReentrantLock)object2).lockInterruptibly();
            try {
                boolean bl2 = ((Monitor$Guard)object).isSatisfied();
                if (!bl2) {
                    ((ReentrantLock)object2).unlock();
                }
                return bl2;
            }
            catch (Throwable throwable) {
                ((ReentrantLock)object2).unlock();
                throw throwable;
            }
        }
        object = new IllegalMonitorStateException();
        throw object;
    }

    public boolean enterIfInterruptibly(Monitor$Guard object, long l2, TimeUnit timeUnit) {
        Object object2 = ((Monitor$Guard)object).monitor;
        if (object2 == this) {
            object2 = this.lock;
            boolean bl2 = ((ReentrantLock)object2).tryLock(l2, timeUnit);
            if (!bl2) {
                return false;
            }
            try {
                boolean bl3 = ((Monitor$Guard)object).isSatisfied();
                if (!bl3) {
                    ((ReentrantLock)object2).unlock();
                }
                return bl3;
            }
            catch (Throwable throwable) {
                ((ReentrantLock)object2).unlock();
                throw throwable;
            }
        }
        object = new IllegalMonitorStateException();
        throw object;
    }

    public void enterInterruptibly() {
        this.lock.lockInterruptibly();
    }

    public boolean enterInterruptibly(long l2, TimeUnit timeUnit) {
        return this.lock.tryLock(l2, timeUnit);
    }

    public void enterWhen(Monitor$Guard object) {
        Object object2 = ((Monitor$Guard)object).monitor;
        if (object2 == this) {
            Throwable throwable2;
            block5: {
                block4: {
                    object2 = this.lock;
                    boolean bl2 = ((ReentrantLock)object2).isHeldByCurrentThread();
                    ((ReentrantLock)object2).lockInterruptibly();
                    try {
                        boolean bl3 = ((Monitor$Guard)object).isSatisfied();
                        if (bl3) break block4;
                    }
                    catch (Throwable throwable2) {
                        break block5;
                    }
                    this.await((Monitor$Guard)object, bl2);
                }
                return;
            }
            this.leave();
            throw throwable2;
        }
        object = new IllegalMonitorStateException();
        throw object;
    }

    public boolean enterWhen(Monitor$Guard object, long l2, TimeUnit timeUnit) {
        block15: {
            Throwable throwable2;
            boolean bl2;
            Object object2;
            block13: {
                boolean bl3;
                block12: {
                    block10: {
                        long l3;
                        block11: {
                            Object object3;
                            long l4;
                            long l7;
                            block18: {
                                block16: {
                                    block17: {
                                        l3 = Monitor.toSafeNanos(l2, timeUnit);
                                        object2 = ((Monitor$Guard)object).monitor;
                                        if (object2 != this) break block15;
                                        object2 = this.lock;
                                        bl2 = ((ReentrantLock)object2).isHeldByCurrentThread();
                                        boolean bl4 = this.fair;
                                        bl3 = false;
                                        l7 = 0L;
                                        if (bl4) break block16;
                                        bl4 = Thread.interrupted();
                                        if (bl4) break block17;
                                        bl4 = ((ReentrantLock)object2).tryLock();
                                        if (!bl4) break block16;
                                        l4 = l7;
                                        break block18;
                                    }
                                    object = new InterruptedException();
                                    throw object;
                                }
                                l4 = Monitor.initNanoTime(l3);
                                object3 = ((ReentrantLock)object2).tryLock(l2, timeUnit);
                                if (!object3) {
                                    return false;
                                }
                            }
                            try {
                                object3 = ((Monitor$Guard)object).isSatisfied();
                                if (object3) break block10;
                                object3 = l4 == l7 ? 0 : (l4 < l7 ? -1 : 1);
                                if (!object3) break block11;
                            }
                            catch (Throwable throwable2) {
                                break block13;
                            }
                            l3 = Monitor.remainingNanos(l4, l3);
                        }
                        boolean bl5 = this.awaitNanos((Monitor$Guard)object, l3, bl2);
                        if (!bl5) break block12;
                    }
                    bl3 = true;
                }
                if (!bl3) {
                    ((ReentrantLock)object2).unlock();
                }
                return bl3;
            }
            if (!bl2) {
                try {
                    this.signalNextWaiter();
                }
                finally {
                    ((ReentrantLock)object2).unlock();
                }
            }
            throw throwable2;
        }
        object = new IllegalMonitorStateException();
        throw object;
    }

    public void enterWhenUninterruptibly(Monitor$Guard object) {
        Object object2 = ((Monitor$Guard)object).monitor;
        if (object2 == this) {
            Throwable throwable2;
            block5: {
                block4: {
                    object2 = this.lock;
                    boolean bl2 = ((ReentrantLock)object2).isHeldByCurrentThread();
                    ((ReentrantLock)object2).lock();
                    try {
                        boolean bl3 = ((Monitor$Guard)object).isSatisfied();
                        if (bl3) break block4;
                    }
                    catch (Throwable throwable2) {
                        break block5;
                    }
                    this.awaitUninterruptibly((Monitor$Guard)object, bl2);
                }
                return;
            }
            this.leave();
            throw throwable2;
        }
        object = new IllegalMonitorStateException();
        throw object;
    }

    /*
     * Exception decompiling
     */
    public boolean enterWhenUninterruptibly(Monitor$Guard var1_1, long var2_6, TimeUnit var4_7) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 2[TRYBLOCK] [2 : 80->84)] java.lang.Throwable
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op02WithProcessedDataAndRefs.insertExceptionBlocks(Op02WithProcessedDataAndRefs.java:2283)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:415)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    public int getOccupiedDepth() {
        return this.lock.getHoldCount();
    }

    public int getQueueLength() {
        return this.lock.getQueueLength();
    }

    public int getWaitQueueLength(Monitor$Guard object) {
        Object object2 = ((Monitor$Guard)object).monitor;
        if (object2 == this) {
            object2 = this.lock;
            ((ReentrantLock)object2).lock();
            try {
                int n3 = ((Monitor$Guard)object).waiterCount;
                return n3;
            }
            finally {
                this.lock.unlock();
            }
        }
        object = new IllegalMonitorStateException();
        throw object;
    }

    public boolean hasQueuedThread(Thread thread2) {
        return this.lock.hasQueuedThread(thread2);
    }

    public boolean hasQueuedThreads() {
        return this.lock.hasQueuedThreads();
    }

    public boolean hasWaiters(Monitor$Guard monitor$Guard) {
        int n3 = this.getWaitQueueLength(monitor$Guard);
        if (n3 > 0) {
            n3 = 1;
        } else {
            n3 = 0;
            monitor$Guard = null;
        }
        return n3 != 0;
    }

    public boolean isFair() {
        return this.fair;
    }

    public boolean isOccupied() {
        return this.lock.isLocked();
    }

    public boolean isOccupiedByCurrentThread() {
        return this.lock.isHeldByCurrentThread();
    }

    public void leave() {
        Throwable throwable2;
        ReentrantLock reentrantLock;
        block4: {
            block3: {
                reentrantLock = this.lock;
                try {
                    int n3 = reentrantLock.getHoldCount();
                    int n4 = 1;
                    if (n3 != n4) break block3;
                }
                catch (Throwable throwable2) {
                    break block4;
                }
                this.signalNextWaiter();
            }
            reentrantLock.unlock();
            return;
        }
        reentrantLock.unlock();
        throw throwable2;
    }

    public boolean tryEnter() {
        return this.lock.tryLock();
    }

    public boolean tryEnterIf(Monitor$Guard object) {
        Object object2 = ((Monitor$Guard)object).monitor;
        if (object2 == this) {
            object2 = this.lock;
            boolean bl2 = ((ReentrantLock)object2).tryLock();
            if (!bl2) {
                return false;
            }
            try {
                boolean bl3 = ((Monitor$Guard)object).isSatisfied();
                if (!bl3) {
                    ((ReentrantLock)object2).unlock();
                }
                return bl3;
            }
            catch (Throwable throwable) {
                ((ReentrantLock)object2).unlock();
                throw throwable;
            }
        }
        object = new IllegalMonitorStateException();
        throw object;
    }

    public void waitFor(Monitor$Guard object) {
        boolean bl2;
        Object object2 = ((Monitor$Guard)object).monitor;
        if (object2 == this && (bl2 = ((ReentrantLock)(object2 = this.lock)).isHeldByCurrentThread())) {
            bl2 = ((Monitor$Guard)object).isSatisfied();
            if (!bl2) {
                bl2 = true;
                this.await((Monitor$Guard)object, bl2);
            }
            return;
        }
        object = new IllegalMonitorStateException();
        throw object;
    }

    public boolean waitFor(Monitor$Guard object, long l2, TimeUnit object2) {
        boolean bl2;
        l2 = Monitor.toSafeNanos(l2, (TimeUnit)((Object)object2));
        object2 = ((Monitor$Guard)object).monitor;
        if (object2 == this && (bl2 = ((ReentrantLock)(object2 = this.lock)).isHeldByCurrentThread())) {
            bl2 = ((Monitor$Guard)object).isSatisfied();
            boolean bl3 = true;
            if (bl2) {
                return bl3;
            }
            bl2 = Thread.interrupted();
            if (!bl2) {
                return this.awaitNanos((Monitor$Guard)object, l2, bl3);
            }
            object = new InterruptedException();
            throw object;
        }
        object = new IllegalMonitorStateException();
        throw object;
    }

    public void waitForUninterruptibly(Monitor$Guard object) {
        boolean bl2;
        Object object2 = ((Monitor$Guard)object).monitor;
        if (object2 == this && (bl2 = ((ReentrantLock)(object2 = this.lock)).isHeldByCurrentThread())) {
            bl2 = ((Monitor$Guard)object).isSatisfied();
            if (!bl2) {
                bl2 = true;
                this.awaitUninterruptibly((Monitor$Guard)object, bl2);
            }
            return;
        }
        object = new IllegalMonitorStateException();
        throw object;
    }

    /*
     * WARNING - void declaration
     */
    public boolean waitForUninterruptibly(Monitor$Guard object, long l2, TimeUnit object2) {
        boolean bl2;
        l2 = Monitor.toSafeNanos(l2, (TimeUnit)((Object)object2));
        object2 = ((Monitor$Guard)object).monitor;
        if (object2 == this && (bl2 = ((ReentrantLock)(object2 = this.lock)).isHeldByCurrentThread())) {
            void var1_4;
            bl2 = ((Monitor$Guard)object).isSatisfied();
            boolean bl3 = true;
            if (bl2) {
                return bl3;
            }
            long l3 = Monitor.initNanoTime(l2);
            bl2 = Thread.interrupted();
            long l4 = l2;
            boolean bl4 = true;
            while (true) {
                boolean bl5;
                block10: {
                    try {
                        bl5 = this.awaitNanos((Monitor$Guard)object, l4, bl4);
                        if (!bl2) break block10;
                    }
                    catch (Throwable throwable) {
                        bl3 = bl2;
                        break;
                    }
                    catch (InterruptedException interruptedException) {
                        block11: {
                            bl2 = ((Monitor$Guard)object).isSatisfied();
                            if (!bl2) break block11;
                            Thread.currentThread().interrupt();
                            return bl3;
                        }
                        try {
                            l4 = Monitor.remainingNanos(l3, l2);
                            bl4 = false;
                            bl2 = true;
                            continue;
                        }
                        catch (Throwable throwable) {
                            // empty catch block
                        }
                    }
                    Thread thread2 = Thread.currentThread();
                    thread2.interrupt();
                }
                return bl5;
                break;
            }
            if (bl3) {
                Thread thread3 = Thread.currentThread();
                thread3.interrupt();
            }
            throw var1_4;
        }
        object = new IllegalMonitorStateException();
        throw object;
    }
}

