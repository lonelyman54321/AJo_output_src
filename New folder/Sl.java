/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

public final class Sl
implements CharSequence {
    public final String a;
    public final List b;
    public final List c;
    public final List d;

    public Sl() {
        throw null;
    }

    public Sl(int n3, String string2, ArrayList collection) {
        if ((n3 &= 2) != 0) {
            collection = mz0_2.a;
        }
        mz0_2 mz0_22 = mz0_2.a;
        boolean bl2 = (collection = (Collection)collection).isEmpty();
        if (bl2) {
            collection = null;
        }
        collection = (List)collection;
        mz0_22.isEmpty();
        this(string2, (List)collection, null, null);
    }

    public Sl(String object, List object2, List object3, List list) {
        this.a = object;
        this.b = object2;
        this.c = object3;
        this.d = list;
        if (object3 != null) {
            object3 = (Iterable)object3;
            object = new Object();
            if ((object = CollectionsKt.e0((Iterable)object3, (Comparator)object)) != null) {
                int n3 = object.size();
                int n4 = -1;
                list = null;
                for (int i3 = 0; i3 < n3; ++i3) {
                    Sl$b sl$b = (Sl$b)object.get(i3);
                    int n7 = sl$b.b;
                    if (n7 >= n4) {
                        n7 = sl$b.c;
                        object3 = this.a;
                        n4 = ((String)object3).length();
                        if (n7 <= n4) {
                            n4 = n7;
                            continue;
                        }
                        object = new StringBuilder("ParagraphStyle range [");
                        n3 = sl$b.b;
                        ((StringBuilder)object).append(n3);
                        ((StringBuilder)object).append(", ");
                        ((StringBuilder)object).append(n7);
                        ((StringBuilder)object).append(") is out of boundary");
                        object = ((StringBuilder)object).toString();
                        object = object.toString();
                        object2 = new IllegalArgumentException((String)object);
                        throw object2;
                    }
                    object2 = "ParagraphStyle should not overlap".toString();
                    object = new IllegalArgumentException((String)object2);
                    throw object;
                }
            }
        }
    }

    public final List a(int n3) {
        List list;
        List list2 = this.d;
        if (list2 != null) {
            int n4 = list2.size();
            list = new List(n4);
            n4 = list2.size();
            for (int i3 = 0; i3 < n4; ++i3) {
                Object e2;
                Object object = e2 = list2.get(i3);
                object = (Sl$b)e2;
                Object object2 = ((Sl$b)object).a;
                int n7 = object2 instanceof Gu1;
                if (n7 == 0) continue;
                n7 = ((Sl$b)object).b;
                int n8 = ((Sl$b)object).c;
                if ((n8 = (int)(Tl.c(0, n3, n7, n8) ? 1 : 0)) == 0) continue;
                ((ArrayList)list).add(e2);
            }
        } else {
            list = mz0_2.a;
        }
        Intrinsics.checkNotNull(list, "null cannot be cast to non-null type kotlin.collections.List<androidx.compose.ui.text.AnnotatedString.Range<androidx.compose.ui.text.LinkAnnotation>>");
        return list;
    }

    public final List b() {
        List list = this.b;
        if (list == null) {
            list = mz0_2.a;
        }
        return list;
    }

    public final List c(int n3, int n4, String string2) {
        List list;
        List list2 = this.d;
        if (list2 != null) {
            int n7 = list2.size();
            list = new List(n7);
            n7 = list2.size();
            for (int i3 = 0; i3 < n7; ++i3) {
                Object e2;
                Object object = e2 = list2.get(i3);
                object = (Sl$b)e2;
                Object object2 = ((Sl$b)object).a;
                int n8 = object2 instanceof String;
                if (n8 == 0 || (n8 = Intrinsics.areEqual(string2, object2 = ((Sl$b)object).d)) == 0) continue;
                n8 = ((Sl$b)object).b;
                int n10 = ((Sl$b)object).c;
                if ((n10 = (int)(Tl.c(n3, n4, n8, n10) ? 1 : 0)) == 0) continue;
                list.add(e2);
            }
        } else {
            list = mz0_2.a;
        }
        Intrinsics.checkNotNull(list, "null cannot be cast to non-null type kotlin.collections.List<androidx.compose.ui.text.AnnotatedString.Range<kotlin.String>>");
        return list;
    }

    public final char charAt(int n3) {
        return this.a.charAt(n3);
    }

    public final Sl d(int n3, int n4) {
        if (n3 <= n4) {
            int n7;
            String string2 = this.a;
            if (n3 == 0 && n4 == (n7 = string2.length())) {
                return this;
            }
            string2 = string2.substring(n3, n4);
            Intrinsics.checkNotNullExpressionValue(string2, "this as java.lang.String\u2026ing(startIndex, endIndex)");
            List list = this.b;
            list = Tl.a(n3, n4, list);
            List list2 = this.c;
            list2 = Tl.a(n3, n4, list2);
            List list3 = this.d;
            ArrayList arrayList = Tl.a(n3, n4, list3);
            Sl sl = new Sl(string2, list, list2, arrayList);
            return sl;
        }
        StringBuilder stringBuilder = new StringBuilder("start (");
        stringBuilder.append(n3);
        stringBuilder.append(") should be less or equal to end (");
        stringBuilder.append(n4);
        stringBuilder.append(')');
        String string3 = stringBuilder.toString();
        string3 = string3.toString();
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException(string3);
        throw illegalArgumentException;
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof Sl;
        if (!bl3) {
            return false;
        }
        object = (Sl)object;
        Object object2 = this.a;
        Object object3 = ((Sl)object).a;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object3 = this.b;
        object2 = ((Sl)object).b;
        bl3 = Intrinsics.areEqual(object3, object2);
        if (!bl3) {
            return false;
        }
        object3 = this.c;
        object2 = ((Sl)object).c;
        bl3 = Intrinsics.areEqual(object3, object2);
        if (!bl3) {
            return false;
        }
        object3 = this.d;
        object = ((Sl)object).d;
        boolean bl4 = Intrinsics.areEqual(object3, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final int hashCode() {
        int n3;
        String string2 = this.a;
        int n4 = string2.hashCode() * 31;
        int n7 = 0;
        List list = this.b;
        if (list != null) {
            n3 = ((Object)list).hashCode();
        } else {
            n3 = 0;
            list = null;
        }
        n4 = (n4 + n3) * 31;
        list = this.c;
        if (list != null) {
            n3 = ((Object)list).hashCode();
        } else {
            n3 = 0;
            list = null;
        }
        n4 = (n4 + n3) * 31;
        list = this.d;
        if (list != null) {
            n7 = ((Object)list).hashCode();
        }
        return n4 + n7;
    }

    public final int length() {
        return this.a.length();
    }

    public final String toString() {
        return this.a;
    }
}

