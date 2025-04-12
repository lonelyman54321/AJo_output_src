/*
 * Decompiled with CFR 0.152.
 */
package androidx.media3.common.util;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.TimeUnit;

public abstract class RunnableFutureTask
implements RunnableFuture {
    public final f40 a;
    public final f40 b;
    public final Object c;
    public Exception d;
    public Thread e;
    public boolean f;

    public RunnableFutureTask() {
        Object object = new f40();
        this.a = object;
        object = new f40();
        this.b = object;
        this.c = object = new Object();
    }

    public void a() {
    }

    public abstract Object b();

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean cancel(boolean bl2) {
        Object object = this.c;
        synchronized (object) {
            Throwable throwable2;
            block7: {
                block4: {
                    boolean bl3;
                    block6: {
                        block5: {
                            try {
                                f40 f402;
                                bl3 = this.f;
                                if (bl3 || (bl3 = (f402 = this.b).d())) break block4;
                                this.f = bl3 = true;
                                this.a();
                                Thread thread2 = this.e;
                                if (thread2 == null) break block5;
                                if (bl2) {
                                    thread2.interrupt();
                                }
                                break block6;
                            }
                            catch (Throwable throwable2) {
                                break block7;
                            }
                        }
                        f40 f403 = this.a;
                        f403.e();
                        f403 = this.b;
                        f403.e();
                    }
                    return bl3;
                }
                return false;
            }
            throw throwable2;
        }
    }

    public final Object get() {
        Object object = this.b;
        ((f40)object).a();
        boolean bl2 = this.f;
        if (!bl2) {
            object = this.d;
            if (object == null) {
                return null;
            }
            Exception exception = this.d;
            object = new ExecutionException(exception);
            throw object;
        }
        object = new CancellationException();
        throw object;
    }

    /*
     * Exception decompiling
     */
    public final Object get(long var1_1, TimeUnit var3_2) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 1[TRYBLOCK] [1 : 50->53)] java.lang.Throwable
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

    public final boolean isCancelled() {
        return this.f;
    }

    public final boolean isDone() {
        return this.b.d();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final void run() {
        Thread thread2;
        Object object = this.c;
        // MONITORENTER : object
        boolean bl2 = this.f;
        if (bl2) {
            // MONITOREXIT : object
            return;
        }
        this.e = thread2 = Thread.currentThread();
        // MONITOREXIT : object
        this.a.e();
        object = null;
        try {
            try {
                this.b();
                throw null;
            }
            catch (Exception exception) {
                this.d = exception;
                Object object2 = this.c;
                // MONITORENTER : object2
                f40 f402 = this.b;
                f402.e();
                this.e = null;
                Thread.interrupted();
                // MONITOREXIT : object2
                return;
            }
        }
        catch (Throwable throwable) {
            Object object2 = this.c;
            // MONITORENTER : object2
            f40 f402 = this.b;
            f402.e();
            this.e = null;
            Thread.interrupted();
            // MONITOREXIT : object2
            throw throwable;
        }
    }
}

