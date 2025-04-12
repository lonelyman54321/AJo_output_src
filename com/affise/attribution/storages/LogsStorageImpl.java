/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.affise.attribution.storages;

import android.content.Context;
import com.affise.attribution.logs.SerializedLog;
import com.affise.attribution.storages.LogsStorage;
import com.affise.attribution.storages.LogsStorageImpl$Companion;
import com.affise.attribution.storages.LogsStorageImpl$getLogs$1$1;
import com.affise.attribution.storages.LogsStorageImpl$getLogs$1$2;
import java.io.File;
import java.io.FilenameFilter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.sequences.Sequence;

public final class LogsStorageImpl
implements LogsStorage {
    public static final LogsStorageImpl$Companion Companion;
    private static final String LOGS_DIR_NAME = "affise-logs";
    private static final int LOGS_MAX_COUNT = 5;
    private final Context context;

    static {
        LogsStorageImpl$Companion logsStorageImpl$Companion;
        Companion = logsStorageImpl$Companion = new LogsStorageImpl$Companion(null);
    }

    public LogsStorageImpl(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
    }

    public static /* synthetic */ boolean a(List list, File file, String string2) {
        return LogsStorageImpl.deleteLogs$lambda$9$lambda$6(list, file, string2);
    }

    private static final boolean deleteLogs$lambda$9$lambda$6(List list, File file, String string2) {
        Intrinsics.checkNotNullParameter(list, "$ids");
        return list.contains(string2);
    }

    private final File getLogsDirectory(String object, String string2) {
        boolean bl2;
        int n3;
        boolean bl3;
        int n4;
        Object object2 = this.context;
        Object object3 = LOGS_DIR_NAME;
        boolean bl4 = false;
        boolean n32 = ((File)(object2 = object2.getDir((String)object3, 0))).exists();
        if (!n32) {
            ((File)object2).mkdir();
        }
        if ((n4 = object.length()) > 0) {
            object3 = object;
        } else {
            boolean bl5 = false;
            object3 = null;
        }
        if (object3 != null) {
            object3 = new File((File)object2, (String)object);
            bl3 = ((File)object3).exists();
            if (!bl3) {
                ((File)object3).mkdir();
            }
            object2 = object3;
        }
        bl3 = true;
        if (string2 == null || (n3 = string2.length()) == 0) {
            bl4 = true;
        }
        if (!(bl3 ^= bl4)) {
            bl2 = false;
            string2 = null;
        }
        if (string2 != null) {
            object = new File((File)object2, string2);
            bl2 = ((File)object).exists();
            if (!bl2) {
                ((File)object).mkdir();
            }
            object2 = object;
        } else {
            object = "logNameDir";
            Intrinsics.checkNotNullExpressionValue(object2, (String)object);
        }
        return object2;
    }

    public static /* synthetic */ File getLogsDirectory$default(LogsStorageImpl logsStorageImpl, String string2, String string3, int n3, Object object) {
        if ((n3 &= 2) != 0) {
            string3 = null;
        }
        return logsStorageImpl.getLogsDirectory(string2, string3);
    }

    public void clear() {
        File file = this.context.getDir(LOGS_DIR_NAME, 0);
        Intrinsics.checkNotNullExpressionValue(file, "context.getDir(LOGS_DIR_\u2026ME, Context.MODE_PRIVATE)");
        qm0_1.d(file);
    }

    /*
     * Unable to fully structure code
     */
    public void deleteLogs(String var1_1, List var2_2, List var3_3) {
        Intrinsics.checkNotNullParameter(var1_1, "key");
        Intrinsics.checkNotNullParameter(var2_2, "subKeys");
        Intrinsics.checkNotNullParameter(var3_3, "ids");
        var2_2 = (Iterable)var2_2;
        var5_5 = yx_2.o((Iterable)var2_2, 10);
        var4_4 = new ArrayList(var5_5);
        var2_2 = var2_2.iterator();
        while ((var5_5 = (int)var2_2.hasNext()) != 0) {
            var6_6 = (String)var2_2.next();
            var6_6 = this.getLogsDirectory((String)var1_1, (String)var6_6);
            var4_4.add(var6_6);
        }
        var1_1 = var4_4.iterator();
        while (var7_7 = var1_1.hasNext()) {
            var2_2 = (File)var1_1.next();
            var4_4 = new YA1(var3_3);
            if ((var2_2 = var2_2.listFiles((FilenameFilter)var4_4)) == null) continue;
            var8_8 = ((File[])var2_2).length;
            var6_6 = null;
            for (var5_5 = 0; var5_5 < var8_8; ++var5_5) {
                var9_9 = var2_2[var5_5];
                ** try [egrp 0[TRYBLOCK] [0 : 168->171)] { 
lbl24:
                // 1 sources

                try {
                    var9_9.delete();
                    continue;
                }
lbl29:
                // 2 sources

                catch (Throwable var9_10) {
                    vl2_2.a(var9_10);
                }
            }
        }
    }

    public List getLogs(String string2, List object) {
        boolean bl2;
        Intrinsics.checkNotNullParameter(string2, "key");
        Intrinsics.checkNotNullParameter(object, "subKeys");
        object = (Iterable)object;
        ArrayList arrayList = new ArrayList();
        object = object.iterator();
        while (bl2 = object.hasNext()) {
            Object object2;
            block4: {
                block3: {
                    object2 = (String)object.next();
                    Object object3 = this.getLogsDirectory(string2, (String)object2).listFiles();
                    if (object3 == null || (object3 = tp_2.s(object3)) == null) break block3;
                    Lambda lambda = LogsStorageImpl$getLogs$1$1.INSTANCE;
                    object3 = kz2_1.e((Sequence)object3, lambda);
                    lambda = new LogsStorageImpl$getLogs$1$2((String)object2);
                    if ((object2 = kz2_1.l(kz2_1.j((Sequence)object3, lambda))) != null) break block4;
                }
                object2 = mz0_2.a;
            }
            object2 = (Iterable)object2;
            cx_2.r((Iterable)object2, arrayList);
        }
        return arrayList;
    }

    public boolean hasLogs(String string2, List object) {
        boolean bl2;
        block9: {
            int n3;
            Object object2;
            block8: {
                Intrinsics.checkNotNullParameter(string2, "key");
                object2 = "subKeys";
                Intrinsics.checkNotNullParameter(object, (String)object2);
                object = (Iterable)object;
                n3 = object instanceof Collection;
                bl2 = false;
                if (n3 == 0) break block8;
                object2 = object;
                object2 = (Collection)object;
                n3 = object2.isEmpty();
                if (n3 != 0) break block9;
            }
            object = object.iterator();
            while ((n3 = object.hasNext()) != 0) {
                object2 = (String)object.next();
                object2 = this.getLogsDirectory(string2, (String)object2).listFiles();
                int n4 = 1;
                if (object2 != null) {
                    n3 = ((File[])object2).length;
                    if (n3 == 0) {
                        n3 = 1;
                    } else {
                        n3 = 0;
                        object2 = null;
                    }
                    n3 ^= n4;
                } else {
                    n3 = 0;
                    object2 = null;
                }
                if (n3 == 0) continue;
                bl2 = true;
                break;
            }
        }
        return bl2;
    }

    /*
     * Exception decompiling
     */
    public void saveLog(String var1_1, String var2_2, SerializedLog var3_4) {
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

