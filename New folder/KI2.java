/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  org.json.JSONArray
 */
import android.os.Bundle;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;

public final class KI2 {
    public static final KI2 a;

    static {
        KI2 kI2;
        a = kI2 = new KI2();
    }

    public static final Bundle a(LI2$a object, String string2, List list) {
        Throwable throwable2;
        Class<KI2> clazz;
        block16: {
            String string3;
            block15: {
                clazz = KI2.class;
                boolean bl2 = td0.b(clazz);
                if (bl2) {
                    return null;
                }
                string3 = "eventType";
                try {
                    Intrinsics.checkNotNullParameter(object, string3);
                    string3 = "applicationId";
                }
                catch (Throwable throwable2) {}
                Intrinsics.checkNotNullParameter(string2, string3);
                string3 = "appEvents";
                Intrinsics.checkNotNullParameter(list, string3);
                string3 = new Bundle();
                Object object2 = "event";
                String string4 = ((LI2$a)((Object)object)).toString();
                string3.putString(object2, string4);
                object2 = "app_id";
                string3.putString(object2, string2);
                object2 = LI2$a.CUSTOM_APP_EVENTS;
                if (object2 != object) break block15;
                object = a;
                object = ((KI2)object).b(string2, list);
                int n3 = object.length();
                if (n3 == 0) {
                    return null;
                }
                string2 = "custom_events";
                object = object.toString();
                string3.putString(string2, (String)object);
                break block16;
            }
            return string3;
        }
        td0.a(clazz, throwable2);
        return null;
    }

    /*
     * Exception decompiling
     */
    public final JSONArray b(String var1_1, List var2_4) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 27[TRYBLOCK] [53 : 344->353)] java.lang.Throwable
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
}

