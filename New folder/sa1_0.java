/*
 * Decompiled with CFR 0.152.
 */
import io.ktor.http.cio.ParserException;
import java.util.List;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt;
import kotlin.text.StringsKt;

/*
 * Renamed from Sa1
 */
public final class sa1_0 {
    public static final Set a;

    static {
        Object object = Character.valueOf('/');
        Object object2 = Character.valueOf('?');
        Object object3 = Character.valueOf('#');
        Character c2 = Character.valueOf('@');
        Object[] objectArray = new Character[]{object, object2, object3, c2};
        a = p03_0.f(objectArray);
        object = xx_2.i("HTTP/1.0", "HTTP/1.1");
        Intrinsics.checkNotNullParameter(object, "from");
        object2 = new Object();
        object3 = new Object();
        aq$a_0.a((List)object, (Function1)object2, (Function2)object3);
    }

    public static final void a(CharSequence charSequence, char c2) {
        StringBuilder stringBuilder = new StringBuilder("Character with code ");
        c2 = (char)(c2 & 0xFF);
        stringBuilder.append((int)c2);
        stringBuilder.append(" is not allowed in header names, \n");
        stringBuilder.append((Object)charSequence);
        charSequence = stringBuilder.toString();
        ParserException parserException = new ParserException((String)charSequence);
        throw parserException;
    }

    public static final int b(as_2 object, lr1_2 object2) {
        Intrinsics.checkNotNullParameter(object, "text");
        Object object3 = "range";
        Intrinsics.checkNotNullParameter(object2, (String)object3);
        int n3 = ((lr1_2)object2).b;
        for (int i3 = ((lr1_2)object2).a; i3 < n3; ++i3) {
            String string2;
            int n4;
            char c2;
            char c22 = ((as_2)object).charAt(i3);
            if (c22 == (c2 = ':') && i3 != (n4 = ((lr1_2)object2).a)) {
                int n7;
                ((lr1_2)object2).a = n7 = i3 + 1;
                return i3;
            }
            n4 = Intrinsics.compare(c22, 32);
            if (n4 > 0 && (n4 = (int)(StringsKt.G(string2 = "\"(),/:;<=>?@[\\]{}", c22) ? 1 : 0)) == 0) {
                continue;
            }
            int n10 = ((lr1_2)object2).a;
            String stringBuilder = "message";
            if (c22 != c2) {
                if (i3 == n10) {
                    object2 = "Multiline headers via line folding is not supported since it is deprecated as per RFC7230.";
                    Intrinsics.checkNotNullParameter(object2, stringBuilder);
                    object = new IllegalStateException((String)object2);
                    throw object;
                }
                sa1_0.a((CharSequence)object, c22);
                throw null;
            }
            object2 = "Empty header names are not allowed as per RFC7230.";
            Intrinsics.checkNotNullParameter(object2, stringBuilder);
            object = new IllegalStateException((String)object2);
            throw object;
        }
        StringBuilder stringBuilder = new StringBuilder("No colon in HTTP header in ");
        int n8 = ((lr1_2)object2).a;
        int n10 = ((lr1_2)object2).b;
        object2 = ((Object)((as_2)object).subSequence(n8, n10)).toString();
        stringBuilder.append((String)object2);
        stringBuilder.append(" in builder: \n");
        stringBuilder.append(object);
        object = stringBuilder.toString();
        object3 = new ParserException((String)object);
        throw object3;
    }

    public static final void c(as_2 as_22, lr1_2 lr1_22) {
        int n3;
        int n4;
        int n7;
        String string2 = "text";
        Intrinsics.checkNotNullParameter(as_22, string2);
        String string3 = "range";
        Intrinsics.checkNotNullParameter(lr1_22, string3);
        int n8 = lr1_22.a;
        int n10 = lr1_22.b;
        Intrinsics.checkNotNullParameter(as_22, string2);
        while (true) {
            n7 = 9;
            if (n8 >= n10 || (n4 = CharsKt.b((char)(n3 = as_22.charAt(n8)))) == 0 && n3 != n7) break;
            ++n8;
        }
        if (n8 >= n10) {
            lr1_22.a = n10;
            return;
        }
        n4 = n8;
        for (n3 = n8; n3 < n10; ++n3) {
            int n14 = as_22.charAt(n3);
            if (n14 == n7) continue;
            int n15 = 10;
            if (n14 != n15 && n14 != (n15 = 13)) {
                n15 = 32;
                if (n14 == n15) continue;
                n4 = n3;
                continue;
            }
            sa1_0.a(as_22, (char)n14);
            throw null;
        }
        lr1_22.a = n8;
        lr1_22.b = ++n4;
    }

    /*
     * Exception decompiling
     */
    public static final Object d(u90_0 var0, as_2 var1_1, lr1_2 var2_2, f80_0 var3_3) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 10[TRYBLOCK] [10 : 336->341)] java.lang.Throwable
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

    public static final void e(as$a_0 object) {
        Object object2 = ":";
        int n3 = StringsKt.J((CharSequence)object, (String)object2);
        if (n3 == 0) {
            int n4;
            object2 = null;
            for (n3 = 0; n3 < (n4 = ((as$a_0)object).length()); ++n3) {
                Set set = a;
                Character c2 = Character.valueOf(((as$a_0)object).charAt(n3));
                n4 = (int)(set.contains(c2) ? 1 : 0);
                if (n4 == 0) {
                    continue;
                }
                object2 = new StringBuilder("Host cannot contain any of the following symbols: ");
                ((StringBuilder)object2).append(set);
                object2 = ((StringBuilder)object2).toString();
                object = new ParserException((String)object2);
                throw object;
            }
            return;
        }
        StringBuilder stringBuilder = new StringBuilder("Host header with ':' should contains port: ");
        stringBuilder.append(object);
        object = stringBuilder.toString();
        object2 = new ParserException((String)object);
        throw object2;
    }
}

