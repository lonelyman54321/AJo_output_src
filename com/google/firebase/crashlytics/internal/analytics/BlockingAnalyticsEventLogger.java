/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 */
package com.google.firebase.crashlytics.internal.analytics;

import android.os.Bundle;
import com.google.firebase.crashlytics.internal.analytics.AnalyticsEventLogger;
import com.google.firebase.crashlytics.internal.analytics.AnalyticsEventReceiver;
import com.google.firebase.crashlytics.internal.analytics.CrashlyticsOriginAnalyticsEventLogger;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public class BlockingAnalyticsEventLogger
implements AnalyticsEventReceiver,
AnalyticsEventLogger {
    static final String APP_EXCEPTION_EVENT_NAME = "_ae";
    private final CrashlyticsOriginAnalyticsEventLogger baseAnalyticsEventLogger;
    private boolean callbackReceived;
    private CountDownLatch eventLatch;
    private final Object latchLock;
    private final TimeUnit timeUnit;
    private final int timeout;

    public BlockingAnalyticsEventLogger(CrashlyticsOriginAnalyticsEventLogger crashlyticsOriginAnalyticsEventLogger, int n3, TimeUnit timeUnit) {
        Object object;
        this.latchLock = object = new Object();
        this.callbackReceived = false;
        this.baseAnalyticsEventLogger = crashlyticsOriginAnalyticsEventLogger;
        this.timeout = n3;
        this.timeUnit = timeUnit;
    }

    public boolean isCallbackReceived() {
        return this.callbackReceived;
    }

    /*
     * Exception decompiling
     */
    public void logEvent(String var1_1, Bundle var2_3) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 18[TRYBLOCK] [31, 30 : 172->175)] java.lang.Throwable
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

    public void onEvent(String string2, Bundle object) {
        object = this.eventLatch;
        if (object == null) {
            return;
        }
        String string3 = APP_EXCEPTION_EVENT_NAME;
        boolean bl2 = string3.equals(string2);
        if (bl2) {
            ((CountDownLatch)object).countDown();
        }
    }
}

