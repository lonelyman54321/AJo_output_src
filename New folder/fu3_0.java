/*
 * Decompiled with CFR 0.152.
 */
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.a;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.b;

/*
 * Renamed from fu3
 */
public final class fu3_0 {
    public static final void a(eu3_0 object, StringBuilder stringBuilder) {
        block17: {
            ArrayList arrayList;
            String string2;
            ArrayList<Pair> arrayList2;
            Object object2;
            block18: {
                String string3;
                object2 = ((eu3_0)object).c().a;
                stringBuilder.append((CharSequence)object2);
                object2 = ((eu3_0)object).c().a;
                int c2 = ((String)object2).hashCode();
                arrayList2 = "<this>";
                char c3 = '/';
                ArrayList<Pair> arrayList3 = "://";
                string2 = ":";
                switch (c2) {
                    default: {
                        break;
                    }
                    case 92611469: {
                        arrayList = "about";
                        boolean bl2 = ((String)object2).equals(arrayList);
                        if (!bl2) break;
                        object = ((eu3_0)object).a;
                        stringBuilder.append((CharSequence)string2);
                        stringBuilder.append((CharSequence)object);
                        break block17;
                    }
                    case 3143036: {
                        arrayList = "file";
                        boolean bl3 = ((String)object2).equals(arrayList);
                        if (!bl3) break;
                        object2 = ((eu3_0)object).a;
                        object = fu3_0.c((eu3_0)object);
                        stringBuilder.append((CharSequence)((Object)arrayList3));
                        stringBuilder.append((CharSequence)object2);
                        boolean bl4 = StringsKt.d0((CharSequence)object, c3);
                        if (!bl4) {
                            stringBuilder.append(c3);
                        }
                        stringBuilder.append((CharSequence)object);
                        break block17;
                    }
                    case 114715: {
                        arrayList = "tel";
                        boolean bl5 = ((String)object2).equals(arrayList);
                        if (!bl5) break;
                        object = ((eu3_0)object).a;
                        stringBuilder.append((CharSequence)string2);
                        stringBuilder.append((CharSequence)object);
                        break block17;
                    }
                    case -1081572750: {
                        arrayList = "mailto";
                        boolean bl6 = ((String)object2).equals(arrayList);
                        if (bl6) break block18;
                    }
                }
                stringBuilder.append((CharSequence)((Object)arrayList3));
                object2 = fu3_0.b((eu3_0)object);
                stringBuilder.append((CharSequence)object2);
                object2 = fu3_0.c((eu3_0)object);
                arrayList = ((eu3_0)object).i;
                boolean bl7 = ((eu3_0)object).b;
                Intrinsics.checkNotNullParameter(stringBuilder, (String)((Object)arrayList2));
                Intrinsics.checkNotNullParameter(object2, "encodedPath");
                arrayList2 = "encodedQueryParameters";
                Intrinsics.checkNotNullParameter(arrayList, (String)((Object)arrayList2));
                int n3 = b.k((CharSequence)object2) ^ 1;
                if (n3 != 0) {
                    arrayList2 = null;
                    string2 = "/";
                    n3 = b.s((String)object2, string2, false);
                    if (n3 == 0) {
                        stringBuilder.append(c3);
                    }
                }
                stringBuilder.append((CharSequence)object2);
                boolean bl8 = arrayList.isEmpty();
                if (!bl8 || bl7) {
                    object2 = "?";
                    stringBuilder.append((CharSequence)object2);
                }
                object2 = arrayList.entries();
                arrayList = new ArrayList();
                object2 = object2.iterator();
                while ((n3 = object2.hasNext()) != 0) {
                    arrayList2 = (Map.Entry)object2.next();
                    string3 = (String)arrayList2.getKey();
                    bl7 = (arrayList2 = (List)arrayList2.getValue()).isEmpty();
                    if (bl7) {
                        bl7 = false;
                        arrayList3 = null;
                        arrayList2 = new ArrayList<Pair>((Object)string3, null);
                        arrayList2 = a.b(arrayList2);
                    } else {
                        arrayList2 = arrayList2;
                        int n4 = yx_2.o(arrayList2, 10);
                        arrayList3 = new ArrayList<Pair>(n4);
                        arrayList2 = arrayList2.iterator();
                        while ((n4 = (int)(arrayList2.hasNext() ? 1 : 0)) != 0) {
                            string2 = (String)arrayList2.next();
                            Pair pair = new Pair(string3, string2);
                            arrayList3.add(pair);
                        }
                        arrayList2 = arrayList3;
                    }
                    arrayList2 = arrayList2;
                    cx_2.r(arrayList2, arrayList);
                }
                object2 = new pa0_1(1);
                n3 = 60;
                string3 = "&";
                CollectionsKt.Q(arrayList, stringBuilder, string3, (Function1)object2, n3);
                object2 = ((eu3_0)object).g;
                int n7 = ((String)object2).length();
                if (n7 > 0) {
                    char c5 = '#';
                    stringBuilder.append(c5);
                    object = ((eu3_0)object).g;
                    stringBuilder.append((CharSequence)object);
                }
                break block17;
            }
            Intrinsics.checkNotNullParameter(object, (String)((Object)arrayList2));
            object2 = new StringBuilder();
            arrayList = ((eu3_0)object).e;
            String string4 = ((eu3_0)object).f;
            Intrinsics.checkNotNullParameter(object2, (String)((Object)arrayList2));
            if (arrayList != null) {
                ((StringBuilder)object2).append((String)((Object)arrayList));
                if (string4 != null) {
                    char c6 = ':';
                    ((StringBuilder)object2).append(c6);
                    ((StringBuilder)object2).append(string4);
                }
                arrayList = "@";
                ((StringBuilder)object2).append((String)((Object)arrayList));
            }
            object2 = ((StringBuilder)object2).toString();
            object = ((eu3_0)object).a;
            stringBuilder.append((CharSequence)string2);
            stringBuilder.append((CharSequence)object2);
            stringBuilder.append((CharSequence)object);
        }
    }

    public static final String b(eu3_0 object) {
        int n3;
        String string2 = "<this>";
        Intrinsics.checkNotNullParameter(object, string2);
        StringBuilder stringBuilder = new StringBuilder();
        Intrinsics.checkNotNullParameter(object, string2);
        Serializable serializable = new StringBuilder();
        String string3 = ((eu3_0)object).e;
        String string4 = ((eu3_0)object).f;
        Intrinsics.checkNotNullParameter(serializable, string2);
        if (string3 != null) {
            serializable.append(string3);
            if (string4 != null) {
                n3 = 58;
                serializable.append((char)n3);
                serializable.append(string4);
            }
            string2 = "@";
            serializable.append(string2);
        }
        string2 = serializable.toString();
        stringBuilder.append(string2);
        string2 = ((eu3_0)object).a;
        stringBuilder.append(string2);
        n3 = ((eu3_0)object).c;
        if (n3 != 0) {
            serializable = ((eu3_0)object).c();
            int n4 = ((iu3_0)serializable).b;
            if (n3 != n4) {
                string2 = ":";
                stringBuilder.append(string2);
                int n7 = ((eu3_0)object).c;
                object = String.valueOf(n7);
                stringBuilder.append((String)object);
            }
        }
        return stringBuilder.toString();
    }

    public static final String c(eu3_0 object) {
        Object object2 = "<this>";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        object = ((eu3_0)object).h;
        int n3 = object.isEmpty();
        if (n3 != 0) {
            object = "";
        } else {
            int n4;
            n3 = object.size();
            if (n3 == (n4 = 1)) {
                object2 = (CharSequence)CollectionsKt.L((List)object);
                n3 = object2.length();
                object = n3 == 0 ? "/" : (String)CollectionsKt.L((List)object);
            } else {
                object2 = object;
                object2 = (Iterable)object;
                int n7 = 62;
                String string2 = "/";
                object = CollectionsKt.R((Iterable)object2, string2, null, null, null, n7);
            }
        }
        return object;
    }

    public static final void d(eu3_0 eu3_02, String object) {
        Intrinsics.checkNotNullParameter(eu3_02, "<this>");
        Object object2 = "value";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        boolean n3 = b.k((CharSequence)object);
        if (n3) {
            object = mz0_2.a;
        } else {
            object2 = "/";
            boolean bl2 = Intrinsics.areEqual(object, object2);
            if (bl2) {
                object = hu3_0.a;
            } else {
                int n4 = 1;
                object2 = new char[n4];
                int n7 = 47;
                object2[0] = n7;
                object = CollectionsKt.m0(StringsKt.Z((CharSequence)object, (char[])object2));
            }
        }
        eu3_02.getClass();
        Intrinsics.checkNotNullParameter(object, "<set-?>");
        eu3_02.h = object;
    }
}

