/*
 * Decompiled with CFR 0.152.
 */
package okio;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.Intrinsics;
import okio.a;

public class AsyncTimeout
extends a {
    public static final ReentrantLock h;
    public static final Condition i;
    public static final long j;
    public static final long k;
    public static AsyncTimeout l;
    public boolean e;
    public AsyncTimeout f;
    public long g;

    static {
        long l2;
        Object object = new ReentrantLock();
        h = object;
        object = ((ReentrantLock)object).newCondition();
        Intrinsics.checkNotNullExpressionValue(object, "newCondition(...)");
        i = object;
        j = l2 = TimeUnit.SECONDS.toMillis(60);
        k = TimeUnit.MILLISECONDS.toNanos(l2);
    }

    /*
     * Exception decompiling
     */
    public final void h() {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 5[TRYBLOCK] [9 : 114->117)] java.lang.Throwable
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

    public final boolean i() {
        Throwable throwable2;
        ReentrantLock reentrantLock;
        block11: {
            boolean bl2;
            block9: {
                boolean bl3;
                block8: {
                    reentrantLock = h;
                    reentrantLock.lock();
                    bl3 = this.e;
                    bl2 = false;
                    if (bl3) break block8;
                    reentrantLock.unlock();
                    break block9;
                }
                this.e = false;
                AsyncTimeout asyncTimeout = l;
                while (asyncTimeout != null) {
                    AsyncTimeout asyncTimeout2;
                    block10: {
                        try {
                            asyncTimeout2 = asyncTimeout.f;
                            if (asyncTimeout2 != this) break block10;
                        }
                        catch (Throwable throwable2) {}
                        asyncTimeout2 = this.f;
                        asyncTimeout.f = asyncTimeout2;
                        bl3 = false;
                        asyncTimeout = null;
                        this.f = null;
                        reentrantLock.unlock();
                        break block9;
                        break block11;
                    }
                    asyncTimeout = asyncTimeout2;
                }
                reentrantLock.unlock();
                bl2 = true;
            }
            return bl2;
        }
        reentrantLock.unlock();
        throw throwable2;
    }

    public IOException j(IOException iOException) {
        String string2 = "timeout";
        InterruptedIOException interruptedIOException = new InterruptedIOException(string2);
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }

    public void k() {
    }
}

