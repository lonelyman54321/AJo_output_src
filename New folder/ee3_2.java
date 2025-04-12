/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt;
import kotlin.text.StringsKt;
import kotlin.text.b;

/*
 * Renamed from Ee3
 */
public class ee3_2
extends ce3_1 {
    public static String b(String string2) {
        int n3;
        int n4;
        int n7;
        int n8;
        Object object;
        Object object2;
        int n10;
        Object object3;
        Object object4 = "<this>";
        Intrinsics.checkNotNullParameter(string2, (String)object4);
        Intrinsics.checkNotNullParameter(string2, (String)object4);
        Intrinsics.checkNotNullParameter("", "newIndent");
        Object object5 = object3 = StringsKt.S(string2);
        object5 = (Iterable)object3;
        Object object6 = new ArrayList();
        object5 = object5.iterator();
        while ((n10 = object5.hasNext()) != 0) {
            object2 = object5.next();
            object = object2;
            object = (String)object2;
            n8 = b.k(object) ^ 1;
            if (n8 == 0) continue;
            ((ArrayList)object6).add(object2);
        }
        n10 = yx_2.o(object6, 10);
        object5 = new ArrayList(n10);
        object6 = ((ArrayList)object6).iterator();
        while (true) {
            block16: {
                n10 = (int)(object6.hasNext() ? 1 : 0);
                n8 = 0;
                object = null;
                if (n10 == 0) break;
                object2 = (String)object6.next();
                n7 = ((String)object2).length();
                while (true) {
                    n4 = -1;
                    if (n8 >= n7) break;
                    boolean bl2 = CharsKt.b(((String)object2).charAt(n8)) ^ true;
                    if (!bl2) {
                        ++n8;
                        continue;
                    }
                    break block16;
                    break;
                }
                n8 = -1;
            }
            if (n8 == n4) {
                n8 = ((String)object2).length();
            }
            object2 = n8;
            ((ArrayList)object5).add(object2);
        }
        Intrinsics.checkNotNullParameter(object5, (String)object4);
        object4 = ((ArrayList)object5).iterator();
        int n14 = object4.hasNext();
        object6 = null;
        if (n14 == 0) {
            n14 = 0;
            object5 = null;
        } else {
            object5 = (Comparable)object4.next();
            while ((n10 = (int)(object4.hasNext() ? 1 : 0)) != 0) {
                object2 = (Comparable)object4.next();
                n7 = object5.compareTo(object2);
                if (n7 <= 0) continue;
                object5 = object2;
            }
        }
        object5 = (Integer)object5;
        if (object5 != null) {
            n3 = (Integer)object5;
        } else {
            n3 = 0;
            object4 = null;
        }
        int n15 = string2.length();
        object3.size();
        n14 = xx_2.h((List)object3);
        object3 = (Iterable)object3;
        object2 = new ArrayList();
        object3 = object3.iterator();
        while ((n7 = (int)(object3.hasNext() ? 1 : 0)) != 0) {
            Object object7 = object3.next();
            n4 = n8 + 1;
            if (n8 >= 0) {
                object7 = (String)object7;
                if ((n8 == 0 || n8 == n14) && (n8 = (int)(b.k(object7) ? 1 : 0)) != 0) {
                    n7 = 0;
                    object7 = null;
                } else {
                    de3_2 de3_22;
                    object = le3_2.B(n3, object7);
                    if (object != null && (object = (String)(de3_22 = de3_2.c).invoke(object)) != null) {
                        object7 = object;
                    }
                }
                if (object7 != null) {
                    ((ArrayList)object2).add(object7);
                }
                n8 = n4;
                continue;
            }
            xx_2.n();
            throw null;
        }
        object4 = new StringBuilder(n15);
        CollectionsKt.Q((Iterable)object2, (StringBuilder)object4, "\n", null, 124);
        string2 = ((StringBuilder)object4).toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        return string2;
    }

    public static String c(String object) {
        Object object2;
        block11: {
            int n3;
            ArrayList<Object> arrayList;
            block9: {
                object2 = "<this>";
                Intrinsics.checkNotNullParameter(object, (String)object2);
                String string2 = "|";
                String string3 = "marginPrefix";
                Intrinsics.checkNotNullParameter(string2, string3);
                Intrinsics.checkNotNullParameter(object, (String)object2);
                object2 = "";
                arrayList = "newIndent";
                Intrinsics.checkNotNullParameter(object2, (String)((Object)arrayList));
                Intrinsics.checkNotNullParameter(string2, string3);
                boolean bl2 = b.k(string2) ^ true;
                if (!bl2) break block11;
                object2 = StringsKt.S((CharSequence)object);
                n3 = ((String)object).length();
                object2.size();
                int n4 = xx_2.h((List)object2);
                object2 = (Iterable)object2;
                arrayList = new ArrayList<Object>();
                object2 = object2.iterator();
                int n7 = 0;
                Object object3 = null;
                while (true) {
                    int n8;
                    Object object4;
                    block12: {
                        Object object5;
                        block13: {
                            int n10;
                            int n14;
                            block10: {
                                boolean bl3 = object2.hasNext();
                                object4 = null;
                                if (!bl3) break block9;
                                object5 = object2.next();
                                n8 = n7 + 1;
                                if (n7 < 0) break;
                                object5 = (String)object5;
                                if ((n7 == 0 || n7 == n4) && (n7 = (int)(b.k(object5) ? 1 : 0)) != 0) break block12;
                                n7 = ((String)object5).length();
                                n14 = 0;
                                while (true) {
                                    n10 = -1;
                                    if (n14 >= n7) break;
                                    boolean bl4 = CharsKt.b(((String)object5).charAt(n14)) ^ true;
                                    if (!bl4) {
                                        ++n14;
                                        continue;
                                    }
                                    break block10;
                                    break;
                                }
                                n14 = -1;
                            }
                            if (n14 != n10 && (n7 = (int)(b.r(n14, (String)object5, string2, false) ? 1 : 0)) != 0) {
                                n7 = string2.length() + n14;
                                Intrinsics.checkNotNull(object5, "null cannot be cast to non-null type java.lang.String");
                                object4 = ((String)object5).substring(n7);
                                object3 = "substring(...)";
                                Intrinsics.checkNotNullExpressionValue(object4, (String)object3);
                            }
                            if (object4 == null) break block13;
                            object4 = object3 = de3_2.c.invoke(object4);
                            object4 = (String)object3;
                            if (object4 != null) break block12;
                        }
                        object4 = object5;
                    }
                    if (object4 != null) {
                        arrayList.add(object4);
                    }
                    n7 = n8;
                }
                xx_2.n();
                throw null;
            }
            object2 = new StringBuilder(n3);
            CollectionsKt.Q(arrayList, (StringBuilder)object2, "\n", null, 124);
            object = ((StringBuilder)object2).toString();
            Intrinsics.checkNotNullExpressionValue(object, "toString(...)");
            return object;
        }
        object2 = "marginPrefix must be non-blank string.".toString();
        object = new IllegalArgumentException((String)object2);
        throw object;
    }
}

