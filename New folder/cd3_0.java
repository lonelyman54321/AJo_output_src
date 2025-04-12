/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.a;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.b;

/*
 * Renamed from cD3
 */
public final class cd3_0 {
    public static final ArrayList a(List object, Function1 function1) {
        boolean bl2;
        object = (Iterable)object;
        ArrayList arrayList = new ArrayList();
        object = object.iterator();
        while (bl2 = object.hasNext()) {
            L93 l93;
            Vi1 vi1;
            int n3;
            Object object2;
            Object object3;
            Object object4;
            boolean bl3;
            Object object5 = (ad3_0)object.next();
            Object object6 = cd3_0.a(((ad3_0)object5).e, function1);
            ArrayList arrayList2 = new ArrayList();
            object6 = object6.iterator();
            while (bl3 = object6.hasNext()) {
                object4 = (ad3_0)object6.next();
                object3 = ((ad3_0)object4).d;
                object4 = object3 == null ? ((ad3_0)object4).e : a.b(object4);
                object4 = (Iterable)object4;
                cx_2.r((Iterable)object4, arrayList2);
            }
            object6 = (Boolean)function1.invoke(object5);
            boolean bl4 = (Boolean)object6;
            if (bl4) {
                object2 = object4 = ((ad3_0)object5).f;
                object2 = (Fp1)object4;
                object3 = ((ad3_0)object5).a;
                n3 = ((ad3_0)object5).b;
                vi1 = ((ad3_0)object5).c;
                l93 = ((ad3_0)object5).d;
                object4 = object6;
                object6 = new ad3_0((String)object3, n3, vi1, l93, arrayList2, (Fp1)object2);
                object5 = a.b(object6);
            } else {
                vi1 = Vi1.e;
                object3 = "<root>";
                n3 = -1;
                l93 = null;
                object2 = null;
                object4 = object5;
                object5 = new ad3_0((String)object3, n3, vi1, null, arrayList2, null);
                object5 = a.b(object5);
            }
            object5 = (Iterable)object5;
            cx_2.r((Iterable)object5, arrayList);
        }
        return arrayList;
    }

    public static final String b(List object, int n3, Function1 function1) {
        String string2 = b.m(".", n3);
        StringBuilder stringBuilder = new StringBuilder();
        object = cd3_0.a((List)object, function1);
        int n4 = 3;
        Object object2 = new Function1[n4];
        Object object3 = cD3$a.c;
        object2[0] = object3;
        object3 = cD3$b.c;
        int n7 = 1;
        object2[n7] = object3;
        object3 = cD3$c.c;
        int n8 = 2;
        object2[n8] = object3;
        Intrinsics.checkNotNullParameter(object2, "selectors");
        object3 = new p00_0((Function1[])object2);
        object = ((Iterable)CollectionsKt.e0((Iterable)object, (Comparator)object3)).iterator();
        while ((n4 = (int)(object.hasNext() ? 1 : 0)) != 0) {
            String string3;
            object2 = (ad3_0)object.next();
            object3 = ((ad3_0)object2).d;
            String string4 = "append('\\n')";
            char c2 = '\n';
            String string5 = "append(value)";
            if (object3 != null) {
                object3 = new StringBuilder();
                ((StringBuilder)object3).append(string2);
                ((StringBuilder)object3).append('|');
                string3 = ((ad3_0)object2).a;
                ((StringBuilder)object3).append(string3);
                ((StringBuilder)object3).append(':');
                int n10 = ((ad3_0)object2).b;
                ((StringBuilder)object3).append(n10);
                object3 = ((StringBuilder)object3).toString();
                stringBuilder.append((String)object3);
                Intrinsics.checkNotNullExpressionValue(stringBuilder, string5);
                stringBuilder.append(c2);
                Intrinsics.checkNotNullExpressionValue(stringBuilder, string4);
            } else {
                object3 = new StringBuilder();
                ((StringBuilder)object3).append(string2);
                string3 = "|<root>";
                ((StringBuilder)object3).append(string3);
                object3 = ((StringBuilder)object3).toString();
                stringBuilder.append((String)object3);
                Intrinsics.checkNotNullExpressionValue(stringBuilder, string5);
                stringBuilder.append(c2);
                Intrinsics.checkNotNullExpressionValue(stringBuilder, string4);
            }
            int n14 = n3 + 1;
            object2 = ((Object)StringsKt.m0(cd3_0.b(((ad3_0)object2).e, n14, function1))).toString();
            if ((n14 = ((String)object2).length()) <= 0) continue;
            stringBuilder.append((String)object2);
            Intrinsics.checkNotNullExpressionValue(stringBuilder, string5);
            stringBuilder.append(c2);
            Intrinsics.checkNotNullExpressionValue(stringBuilder, string4);
        }
        return stringBuilder.toString();
    }
}

