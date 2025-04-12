/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.concurrent;

import com.google.firebase.concurrent.SequentialExecutor;
import com.google.firebase.concurrent.SequentialExecutor$1;
import com.google.firebase.concurrent.SequentialExecutor$WorkerRunningState;
import java.util.Deque;

final class SequentialExecutor$QueueWorker
implements Runnable {
    Runnable task;
    final /* synthetic */ SequentialExecutor this$0;

    private SequentialExecutor$QueueWorker(SequentialExecutor sequentialExecutor) {
        this.this$0 = sequentialExecutor;
    }

    public /* synthetic */ SequentialExecutor$QueueWorker(SequentialExecutor sequentialExecutor, SequentialExecutor$1 sequentialExecutor$1) {
        this(sequentialExecutor);
    }

    /*
     * Exception decompiling
     */
    private void workOnQueue() {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 7[TRYBLOCK] [7 : 70->74)] java.lang.Throwable
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

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void run() {
        try {
            this.workOnQueue();
            return;
        }
        catch (Error error) {
            Deque deque = SequentialExecutor.access$100(this.this$0);
            synchronized (deque) {
                SequentialExecutor sequentialExecutor = this.this$0;
                SequentialExecutor$WorkerRunningState sequentialExecutor$WorkerRunningState = SequentialExecutor$WorkerRunningState.IDLE;
                SequentialExecutor.access$202(sequentialExecutor, sequentialExecutor$WorkerRunningState);
                throw error;
            }
        }
    }

    public String toString() {
        Object object = this.task;
        String string2 = "}";
        if (object != null) {
            StringBuilder stringBuilder = new StringBuilder("SequentialExecutorWorker{running=");
            stringBuilder.append(object);
            stringBuilder.append(string2);
            return stringBuilder.toString();
        }
        object = new StringBuilder("SequentialExecutorWorker{state=");
        SequentialExecutor$WorkerRunningState sequentialExecutor$WorkerRunningState = SequentialExecutor.access$200(this.this$0);
        ((StringBuilder)object).append((Object)sequentialExecutor$WorkerRunningState);
        ((StringBuilder)object).append(string2);
        return ((StringBuilder)object).toString();
    }
}

