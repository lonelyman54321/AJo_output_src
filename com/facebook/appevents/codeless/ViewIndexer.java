/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.os.Handler
 *  android.os.Looper
 */
package com.facebook.appevents.codeless;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import com.facebook.FacebookSdk;
import com.facebook.GraphRequest;
import com.facebook.appevents.codeless.ViewIndexer$schedule$indexingTask$1;
import java.lang.ref.WeakReference;
import java.util.Timer;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import kotlin.jvm.internal.Intrinsics;

public final class ViewIndexer {
    public static final String e;
    public final Handler a;
    public final WeakReference b;
    public Timer c;
    public String d;

    static {
        String string2 = ViewIndexer.class.getCanonicalName();
        if (string2 == null) {
            string2 = "";
        }
        e = string2;
    }

    public ViewIndexer(Activity activity) {
        Looper looper;
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.b = looper = new WeakReference(activity);
        this.d = null;
        looper = Looper.getMainLooper();
        super(looper);
        this.a = activity;
    }

    public static final /* synthetic */ String a() {
        Class<ViewIndexer> clazz = ViewIndexer.class;
        boolean bl2 = td0.b(clazz);
        if (bl2) {
            return null;
        }
        try {
            return e;
        }
        catch (Throwable throwable) {
            td0.a(clazz, throwable);
            return null;
        }
    }

    /*
     * Exception decompiling
     */
    public final void b(GraphRequest var1_1, String var2_4) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 9[TRYBLOCK] [18, 17 : 104->108)] java.lang.Throwable
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
    public final void c() {
        boolean bl2 = td0.b(this);
        if (bl2) {
            return;
        }
        try {
            ViewIndexer$schedule$indexingTask$1 viewIndexer$schedule$indexingTask$1 = new ViewIndexer$schedule$indexingTask$1(this);
            try {
                Executor executor = FacebookSdk.d();
                int n3 = 2;
                BN1 bN1 = new BN1(n3, this, viewIndexer$schedule$indexingTask$1);
                executor.execute(bN1);
                return;
            }
            catch (RejectedExecutionException rejectedExecutionException) {}
            return;
        }
        catch (Throwable throwable22222) {}
        td0.a(this, throwable22222);
    }
}

