/*
 * Decompiled with CFR 0.152.
 */
import java.util.AbstractSet;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from ki3
 */
public final class ki3_0 {
    public final String a;
    public final Map b;
    public final Set c;
    public final Set d;

    public ki3_0(String string2, Map map2, AbstractSet abstractSet, AbstractSet abstractSet2) {
        Intrinsics.checkNotNullParameter(string2, "name");
        Intrinsics.checkNotNullParameter(map2, "columns");
        Intrinsics.checkNotNullParameter(abstractSet, "foreignKeys");
        this.a = string2;
        this.b = map2;
        this.c = abstractSet;
        this.d = abstractSet2;
    }

    /*
     * Exception decompiling
     */
    public static final ki3_0 a(xg3_1 var0, String var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 2[TRYBLOCK] [2 : 142->149)] java.lang.Throwable
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

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof ki3_0;
        if (!bl3) {
            return false;
        }
        object = (ki3_0)object;
        Object object2 = this.a;
        Object object3 = ((ki3_0)object).a;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object3 = this.b;
        object2 = ((ki3_0)object).b;
        bl3 = Intrinsics.areEqual(object3, object2);
        if (!bl3) {
            return false;
        }
        object3 = this.c;
        object2 = ((ki3_0)object).c;
        bl3 = Intrinsics.areEqual(object3, object2);
        if (!bl3) {
            return false;
        }
        object3 = this.d;
        if (object3 != null && (object = ((ki3_0)object).d) != null) {
            bl2 = Intrinsics.areEqual(object3, object);
        }
        return bl2;
    }

    public final int hashCode() {
        int n3 = this.a.hashCode() * 31;
        int n4 = (((Object)this.b).hashCode() + n3) * 31;
        return ((Object)this.c).hashCode() + n4;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("TableInfo{name='");
        Object object = this.a;
        stringBuilder.append((String)object);
        stringBuilder.append("', columns=");
        object = this.b;
        stringBuilder.append(object);
        stringBuilder.append(", foreignKeys=");
        object = this.c;
        stringBuilder.append(object);
        stringBuilder.append(", indices=");
        object = this.d;
        stringBuilder.append(object);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}

