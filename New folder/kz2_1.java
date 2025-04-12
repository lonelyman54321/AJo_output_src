/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.a;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;

/*
 * Renamed from KZ2
 */
public class kz2_1
extends fz2_2 {
    public static um0_2 e(Sequence sequence, Function1 function1) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(function1, "predicate");
        um0_2 um0_22 = new um0_2(sequence, true, function1);
        return um0_22;
    }

    public static um0_2 f(Sequence sequence) {
        Object object = "<this>";
        Intrinsics.checkNotNullParameter(sequence, (String)object);
        Intrinsics.checkNotNullParameter(sequence, (String)object);
        object = iz2_2.c;
        Intrinsics.checkNotNullParameter(object, "predicate");
        um0_2 um0_22 = new um0_2(sequence, false, (Function1)object);
        Intrinsics.checkNotNull(um0_22, "null cannot be cast to non-null type kotlin.sequences.Sequence<T of kotlin.sequences.SequencesKt___SequencesKt.filterNotNull>");
        return um0_22;
    }

    public static Object g(Sequence object) {
        String string2 = "<this>";
        Intrinsics.checkNotNullParameter(object, string2);
        object = object.iterator();
        boolean bl2 = object.hasNext();
        if (!bl2) {
            return null;
        }
        return object.next();
    }

    public static String h(Sequence object, String string2) {
        boolean bl2;
        String string3 = "<this>";
        Intrinsics.checkNotNullParameter(object, string3);
        String string4 = "separator";
        Intrinsics.checkNotNullParameter(string2, string4);
        String string5 = "";
        String string6 = "prefix";
        Intrinsics.checkNotNullParameter(string5, string6);
        String string7 = "postfix";
        Intrinsics.checkNotNullParameter(string5, string7);
        String string8 = "...";
        String string9 = "truncated";
        Intrinsics.checkNotNullParameter(string8, string9);
        StringBuilder stringBuilder = new StringBuilder();
        Intrinsics.checkNotNullParameter(object, string3);
        Intrinsics.checkNotNullParameter(stringBuilder, "buffer");
        Intrinsics.checkNotNullParameter(string2, string4);
        Intrinsics.checkNotNullParameter(string5, string6);
        Intrinsics.checkNotNullParameter(string5, string7);
        Intrinsics.checkNotNullParameter(string8, string9);
        stringBuilder.append((CharSequence)string5);
        object = object.iterator();
        int n3 = 0;
        string3 = null;
        while (bl2 = object.hasNext()) {
            string4 = object.next();
            int n4 = 1;
            if ((n3 += n4) > n4) {
                stringBuilder.append((CharSequence)string2);
            }
            n4 = 0;
            string6 = null;
            ce3_1.a(stringBuilder, string4, null);
        }
        stringBuilder.append((CharSequence)string5);
        object = stringBuilder.toString();
        Intrinsics.checkNotNullExpressionValue(object, "toString(...)");
        return object;
    }

    public static fr3_0 i(Sequence sequence, Function1 function1) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(function1, "transform");
        fr3_0 fr3_02 = new fr3_0(sequence, function1);
        return fr3_02;
    }

    public static um0_2 j(Sequence sequence, Function1 function1) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(function1, "transform");
        fr3_0 fr3_02 = new fr3_0(sequence, function1);
        return kz2_1.f(fr3_02);
    }

    public static Sequence k(um0_2 object) {
        Object object2 = "<this>";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        boolean bl2 = object instanceof fw0_2;
        object = bl2 ? ((fw0_2)object).take() : (object2 = new bi3_2((Sequence)object));
        return object;
    }

    public static List l(Sequence object) {
        String string2 = "<this>";
        Intrinsics.checkNotNullParameter(object, string2);
        object = object.iterator();
        boolean bl2 = object.hasNext();
        if (!bl2) {
            return mz0_2.a;
        }
        string2 = object.next();
        boolean bl3 = object.hasNext();
        if (!bl3) {
            return a.b(string2);
        }
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add(string2);
        while (bl2 = object.hasNext()) {
            string2 = object.next();
            arrayList.add(string2);
        }
        return arrayList;
    }
}

