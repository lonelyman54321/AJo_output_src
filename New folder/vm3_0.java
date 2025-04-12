/*
 * Decompiled with CFR 0.152.
 */
import java.io.BufferedReader;
import java.io.Reader;
import java.io.StringWriter;
import java.io.Writer;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;

/*
 * Renamed from vm3
 */
public final class vm3_0 {
    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static final void a(BufferedReader bufferedReader, Function1 object) {
        Throwable throwable2;
        block5: {
            Object object2 = "<this>";
            Intrinsics.checkNotNullParameter(bufferedReader, (String)object2);
            String string2 = "action";
            Intrinsics.checkNotNullParameter(object, string2);
            try {
                boolean bl2;
                Intrinsics.checkNotNullParameter(bufferedReader, (String)object2);
                object2 = new fu1_2(bufferedReader);
                object2 = ez2_1.c((Sequence)object2);
                object2 = ((u50_0)object2).iterator();
                while (bl2 = object2.hasNext()) {
                    string2 = object2.next();
                    object.invoke(string2);
                }
            }
            catch (Throwable throwable2) {
                break block5;
            }
            object = Unit.a;
            xj3_1.b(bufferedReader, null);
            return;
        }
        try {
            throw throwable2;
        }
        catch (Throwable throwable3) {
            xj3_1.b(bufferedReader, throwable2);
            throw throwable3;
        }
    }

    public static final String b(Reader object) {
        Object object2 = "<this>";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        StringWriter stringWriter = new StringWriter();
        Intrinsics.checkNotNullParameter(object, (String)object2);
        Intrinsics.checkNotNullParameter(stringWriter, "out");
        int n3 = 8192;
        object2 = new char[n3];
        int n4 = ((Reader)object).read((char[])object2);
        while (n4 >= 0) {
            ((Writer)stringWriter).write((char[])object2, 0, n4);
            n4 = ((Reader)object).read((char[])object2);
        }
        object = stringWriter.toString();
        Intrinsics.checkNotNullExpressionValue(object, "toString(...)");
        return object;
    }
}

