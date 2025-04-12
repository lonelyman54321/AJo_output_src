/*
 * Decompiled with CFR 0.152.
 */
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$IntRef;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import kotlin.text.b;

public final class p73 {
    public static final Vi1 a;
    public static final Regex b;
    public static final Regex c;

    static {
        Object object = new Vi1(0, 0, 0, 0);
        a = object;
        b = object = new Regex("(\\d+)|([,])|([*])|([:])|L|(P\\([^)]*\\))|(C(\\(([^)]*)\\))?)|@");
        c = object = new Regex("(\\d+)|,|[!P()]|:([^,!)]+)");
    }

    public static final Field a(Class fieldArray, String string2) {
        Field field;
        Field field2;
        block3: {
            fieldArray = fieldArray.getDeclaredFields();
            int n3 = fieldArray.length;
            int n4 = 0;
            while (true) {
                field2 = null;
                if (n4 >= n3) break;
                field = fieldArray[n4];
                String string3 = field.getName();
                boolean bl2 = Intrinsics.areEqual(string3, string2);
                if (!bl2) {
                    ++n4;
                    continue;
                }
                break block3;
                break;
            }
            field = null;
        }
        if (field != null) {
            boolean bl3 = true;
            ((AccessibleObject)field).setAccessible(bl3);
            field2 = field;
        }
        return field2;
    }

    public static final M11 b(C30 object) {
        object = (object = (E30)CollectionsKt.M(object.a())) != null ? p73.c((E30)object, null) : jz0_0.h;
        return object;
    }

    /*
     * Exception decompiling
     */
    public static final M11 c(E30 var0, G93 var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 14[TRYBLOCK] [31, 30 : 778->783)] java.lang.NumberFormatException
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

    public static final void d(Ref$IntRef ref$IntRef, ArrayList arrayList, int n3) {
        int n4 = ref$IntRef.element;
        if ((n3 -= n4) > 0) {
            int n7;
            n4 = 4;
            if (n3 < n4) {
                n3 = 4;
            }
            for (n4 = 0; n4 < n3; ++n4) {
                int n8 = ref$IntRef.element + n4 + 1;
                Integer n10 = n8;
                arrayList.add(n10);
            }
            ref$IntRef.element = n7 = ref$IntRef.element + n3;
        }
    }

    public static final void e(Ref$ObjectRef serializable, String string2) {
        boolean bl2;
        Object object = (MatchResult)serializable.element;
        if (object != null && (bl2 = Intrinsics.areEqual(object = (String)object.a().get(0), string2))) {
            p73.i(serializable);
            return;
        }
        serializable = new Exception();
        throw serializable;
    }

    public static final String f(Ref$ObjectRef object) {
        Object object2 = (MatchResult)((Ref$ObjectRef)object).element;
        if (object2 != null) {
            Object object3 = object2.b();
            int n3 = 2;
            if ((object3 = ((oH1$b)object3).c(n3)) != null) {
                p73.i((Ref$ObjectRef)object);
                object = object2.a();
                object2 = null;
                object = (String)object.get(0);
                int n4 = 1;
                object = ((String)object).substring(n4);
                object3 = "this as java.lang.String).substring(startIndex)";
                Intrinsics.checkNotNullExpressionValue(object, (String)object3);
                String string2 = "c#";
                boolean bl2 = kotlin.text.b.s((String)object, string2, false);
                if (bl2) {
                    string2 = "androidx.compose.";
                    object2 = new StringBuilder(string2);
                    object = ((String)object).substring(n3);
                    Intrinsics.checkNotNullExpressionValue(object, (String)object3);
                    ((StringBuilder)object2).append((String)object);
                    object = ((StringBuilder)object2).toString();
                }
                return object;
            }
        }
        object = new Exception();
        throw object;
    }

    public static final int g(Ref$ObjectRef object) {
        MatchResult matchResult = (MatchResult)((Ref$ObjectRef)object).element;
        if (matchResult != null) {
            Object object2 = matchResult.b();
            int n3 = 1;
            if ((object2 = ((oH1$b)object2).c(n3)) != null) {
                p73.i((Ref$ObjectRef)object);
                object = matchResult.a();
                matchResult = null;
                object = (String)object.get(0);
                try {
                    return Integer.parseInt((String)object);
                }
                catch (NumberFormatException numberFormatException) {
                    object = new Exception();
                    throw object;
                }
            }
        }
        object = new Exception();
        throw object;
    }

    public static final boolean h(Ref$ObjectRef object, String string2) {
        boolean bl2;
        block3: {
            block2: {
                object = (MatchResult)((Ref$ObjectRef)object).element;
                if (object == null) break block2;
                object = object.a();
                bl2 = false;
                boolean bl3 = Intrinsics.areEqual(object = (String)object.get(0), string2);
                if (!bl3) break block3;
            }
            bl2 = true;
        }
        return bl2;
    }

    public static final void i(Ref$ObjectRef object) {
        MatchResult matchResult = (MatchResult)((Ref$ObjectRef)object).element;
        if (matchResult != null) {
            matchResult = matchResult.next();
            ((Ref$ObjectRef)object).element = matchResult;
        }
        object = (MatchResult)((Ref$ObjectRef)object).element;
    }

    public static final MatchResult j(Ref$ObjectRef ref$ObjectRef) {
        MatchResult matchResult = (MatchResult)ref$ObjectRef.element;
        if (matchResult != null) {
            matchResult = matchResult.next();
            ref$ObjectRef.element = matchResult;
        }
        return (MatchResult)ref$ObjectRef.element;
    }
}

