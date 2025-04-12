/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.affise.attribution.storages;

import android.content.Context;
import com.affise.attribution.events.SerializedEvent;
import com.affise.attribution.logs.LogsManager;
import com.affise.attribution.storages.InternalEventsStorage;
import com.affise.attribution.storages.InternalEventsStorageImpl$getEvents$1;
import com.affise.attribution.storages.InternalEventsStorageImpl$getEvents$2;
import com.affise.attribution.storages.InternalEventsStorageImpl$getEvents$3;
import java.io.File;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.sequences.Sequence;

public final class InternalEventsStorageImpl
implements InternalEventsStorage {
    private final Context context;
    private final LogsManager logsManager;

    public InternalEventsStorageImpl(Context context, LogsManager logsManager2) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(logsManager2, "logsManager");
        this.context = context;
        this.logsManager = logsManager2;
    }

    public static /* synthetic */ boolean a(List list, File file, String string2) {
        return InternalEventsStorageImpl.deleteEvent$lambda$1(list, file, string2);
    }

    public static final /* synthetic */ LogsManager access$getLogsManager$p(InternalEventsStorageImpl internalEventsStorageImpl) {
        return internalEventsStorageImpl.logsManager;
    }

    private static final boolean deleteEvent$lambda$1(List list, File file, String string2) {
        Intrinsics.checkNotNullParameter(list, "$ids");
        return list.contains(string2);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private final File getEventsDirectory(String string2) {
        Object object = this.context;
        Object object2 = "affise-internal-events";
        int n3 = ((File)(object = object.getDir((String)object2, 0))).exists();
        if (n3 == 0) {
            ((File)object).mkdir();
        }
        if (string2 != null) {
            boolean bl2;
            n3 = string2.length();
            if (n3 <= 0) {
                bl2 = false;
                string2 = null;
            }
            if (string2 != null) {
                object2 = new File((File)object, string2);
                bl2 = ((File)object2).exists();
                if (bl2) return object2;
                ((File)object2).mkdir();
                return object2;
            }
        }
        string2 = "eventDir";
        Intrinsics.checkNotNullExpressionValue(object, string2);
        return object;
    }

    public static /* synthetic */ File getEventsDirectory$default(InternalEventsStorageImpl internalEventsStorageImpl, String string2, int n3, Object object) {
        if ((n3 &= 1) != 0) {
            string2 = null;
        }
        return internalEventsStorageImpl.getEventsDirectory(string2);
    }

    public void clear() {
        File file = this.context.getDir("affise-internal-events", 0);
        Intrinsics.checkNotNullExpressionValue(file, "context.getDir(InternalE\u2026ME, Context.MODE_PRIVATE)");
        qm0_1.d(file);
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void deleteEvent(String object, List list) {
        Intrinsics.checkNotNullParameter(list, "ids");
        object = this.getEventsDirectory((String)object);
        vj1_0 vj1_02 = new vj1_0(list);
        object = ((File)object).listFiles(vj1_02);
        if (object != null) {
            int n3 = ((Object)object).length;
            vj1_02 = null;
            for (int i3 = 0; i3 < n3; ++i3) {
                Object object2 = object[i3];
                try {
                    // empty try
                }
                catch (Throwable throwable) {
                    vl2_2.a(throwable);
                    continue;
                }
                {
                    ((File)object2).delete();
                }
            }
        }
    }

    public List getEvents(String object) {
        block3: {
            block2: {
                if ((object = this.getEventsDirectory((String)object).listFiles()) == null || (object = tp_2.s(object)) == null) break block2;
                Lambda lambda = InternalEventsStorageImpl$getEvents$1.INSTANCE;
                object = kz2_1.e((Sequence)object, lambda);
                lambda = InternalEventsStorageImpl$getEvents$2.INSTANCE;
                if ((object = kz2_1.k(kz2_1.e((Sequence)object, lambda))) != null && (object = kz2_1.l(kz2_1.j((Sequence)object, lambda = new InternalEventsStorageImpl$getEvents$3(this)))) != null) break block3;
            }
            object = mz0_2.a;
        }
        return object;
    }

    public boolean hasEvents(String fileArray) {
        Intrinsics.checkNotNullParameter(fileArray, "key");
        fileArray = this.getEventsDirectory((String)fileArray).listFiles();
        boolean bl2 = false;
        if (fileArray != null) {
            int n3 = fileArray.length;
            boolean bl3 = true;
            if (n3 == 0) {
                bl2 = true;
            }
            bl2 ^= bl3;
        }
        return bl2;
    }

    /*
     * Exception decompiling
     */
    public void saveEvent(String var1_1, SerializedEvent var2_2) {
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

