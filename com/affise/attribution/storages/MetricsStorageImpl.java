/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.affise.attribution.storages;

import android.content.Context;
import com.affise.attribution.converter.JsonObjectToMetricsEventConverter;
import com.affise.attribution.metrics.MetricsEvent;
import com.affise.attribution.storages.MetricsStorage;
import com.affise.attribution.storages.MetricsStorageImpl$Companion;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

public final class MetricsStorageImpl
implements MetricsStorage {
    public static final MetricsStorageImpl$Companion Companion;
    private static final String METRICS_DIR_NAME = "affise-metrics";
    private static final int METRICS_MAX_COUNT = 30;
    private final Context context;
    private final JsonObjectToMetricsEventConverter converter;

    static {
        MetricsStorageImpl$Companion metricsStorageImpl$Companion;
        Companion = metricsStorageImpl$Companion = new MetricsStorageImpl$Companion(null);
    }

    public MetricsStorageImpl(Context context, JsonObjectToMetricsEventConverter jsonObjectToMetricsEventConverter) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(jsonObjectToMetricsEventConverter, "converter");
        this.context = context;
        this.converter = jsonObjectToMetricsEventConverter;
    }

    private final File getMetricsDirectory(String object, String string2) {
        int n3;
        Object object2 = this.context;
        Object object3 = METRICS_DIR_NAME;
        boolean bl2 = ((File)(object2 = object2.getDir((String)object3, 0))).exists();
        if (!bl2) {
            ((File)object2).mkdir();
        }
        if ((n3 = ((File)(object3 = new File((File)object2, (String)object))).exists()) == 0) {
            ((File)object3).mkdir();
        }
        if (string2 != null) {
            boolean bl3;
            n3 = string2.length();
            if (n3 <= 0) {
                bl3 = false;
                string2 = null;
            }
            if (string2 != null) {
                object = new File((File)object3, string2);
                bl3 = ((File)object).exists();
                if (!bl3) {
                    ((File)object).mkdir();
                }
                object3 = object;
            }
        }
        return object3;
    }

    public static /* synthetic */ File getMetricsDirectory$default(MetricsStorageImpl metricsStorageImpl, String string2, String string3, int n3, Object object) {
        if ((n3 &= 2) != 0) {
            string3 = null;
        }
        return metricsStorageImpl.getMetricsDirectory(string2, string3);
    }

    public void clear() {
        File file = this.context.getDir(METRICS_DIR_NAME, 0);
        Intrinsics.checkNotNullExpressionValue(file, "context.getDir(METRICS_D\u2026ME, Context.MODE_PRIVATE)");
        qm0_1.d(file);
    }

    public void deleteMetrics(String object, String object2) {
        Intrinsics.checkNotNullParameter(object, "key");
        Intrinsics.checkNotNullParameter(object2, "ignoreSubKey");
        Object object3 = null;
        int n3 = 2;
        object = MetricsStorageImpl.getMetricsDirectory$default(this, (String)object, null, n3, null).listFiles();
        if (object != null) {
            boolean bl2;
            object3 = new ArrayList();
            for (File file : object) {
                String string2 = file.getName();
                boolean bl3 = Intrinsics.areEqual(string2, object2) ^ true;
                if (!bl3) continue;
                ((ArrayList)object3).add(file);
            }
            object = ((ArrayList)object3).iterator();
            while (bl2 = object.hasNext()) {
                object2 = (File)object.next();
                object3 = tl2_2.b;
                object3 = "deleteMetrics$lambda$17$lambda$16";
                try {
                    Intrinsics.checkNotNullExpressionValue(object2, (String)object3);
                    qm0_1.d((File)object2);
                }
                catch (Throwable throwable) {
                    object3 = tl2_2.b;
                    vl2_2.a(throwable);
                }
            }
        }
    }

    /*
     * Exception decompiling
     */
    public MetricsEvent getMetricsEvent(String var1_1, String var2_3) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 12[TRYBLOCK] [13 : 124->132)] java.lang.Exception
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
     * Exception decompiling
     */
    public List getMetricsEvents(String var1_1, String var2_2) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Started 2 blocks at once
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.getStartingBlocks(Op04StructuredStatement.java:412)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:487)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:736)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:850)
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

    public boolean hasMetrics(String object, String fileArray) {
        Intrinsics.checkNotNullParameter(object, "key");
        Intrinsics.checkNotNullParameter(fileArray, "ignoreSubKey");
        int n3 = 2;
        object = MetricsStorageImpl.getMetricsDirectory$default(this, (String)object, null, n3, null).listFiles();
        boolean bl2 = false;
        if (object != null) {
            int n4;
            Object object2 = new ArrayList();
            int n7 = ((File[])object).length;
            int n8 = 0;
            while (true) {
                n4 = 1;
                if (n8 >= n7) break;
                File file = object[n8];
                String string2 = file.getName();
                int n10 = (int)(Intrinsics.areEqual(string2, fileArray) ? 1 : 0);
                if ((n4 ^= n10) != 0) {
                    object2.add(file);
                }
                ++n8;
            }
            boolean bl3 = object2.isEmpty();
            if (!bl3) {
                int n14;
                object = object2.iterator();
                while ((n14 = object.hasNext()) != 0) {
                    fileArray = ((File)object.next()).listFiles();
                    if (fileArray != null) {
                        object2 = "listFiles()";
                        Intrinsics.checkNotNullExpressionValue(fileArray, (String)object2);
                        n14 = fileArray.length;
                        if (n14 == 0) {
                            n14 = 1;
                        } else {
                            n14 = 0;
                            fileArray = null;
                        }
                        n14 ^= n4;
                    } else {
                        n14 = 0;
                        fileArray = null;
                    }
                    if (n14 == 0) continue;
                    bl2 = true;
                    break;
                }
            }
        }
        return bl2;
    }

    /*
     * Exception decompiling
     */
    public void saveMetricsEvent(String var1_1, String var2_2, MetricsEvent var3_4) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Started 2 blocks at once
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.getStartingBlocks(Op04StructuredStatement.java:412)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:487)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:736)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:850)
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
}

