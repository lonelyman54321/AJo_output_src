/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from aD3
 */
public final class ad3_0 {
    public final String a;
    public final int b;
    public final Vi1 c;
    public final L93 d;
    public final List e;
    public final Object f;

    public ad3_0(String string2, int n3, Vi1 vi1, L93 l93, ArrayList arrayList, Fp1 fp1) {
        this.a = string2;
        this.b = n3;
        this.c = vi1;
        this.d = l93;
        this.e = arrayList;
        this.f = fp1;
    }

    public final ArrayList a() {
        boolean bl2;
        Object object = this.e;
        Collection collection = object;
        collection = (Collection)object;
        object = (Iterable)object;
        ArrayList arrayList = new ArrayList();
        object = object.iterator();
        while (bl2 = object.hasNext()) {
            ArrayList arrayList2 = ((ad3_0)object.next()).a();
            cx_2.r(arrayList2, arrayList);
        }
        return CollectionsKt.W(arrayList, collection);
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        int n3 = object instanceof ad3_0;
        if (n3 == 0) {
            return false;
        }
        object = (ad3_0)object;
        Object object2 = this.a;
        Object object3 = ((ad3_0)object).a;
        n3 = Intrinsics.areEqual(object2, object3);
        if (n3 == 0) {
            return false;
        }
        n3 = this.b;
        int n4 = ((ad3_0)object).b;
        if (n3 != n4) {
            return false;
        }
        object3 = this.c;
        object2 = ((ad3_0)object).c;
        n3 = (int)(Intrinsics.areEqual(object3, object2) ? 1 : 0);
        if (n3 == 0) {
            return false;
        }
        object3 = this.d;
        object2 = ((ad3_0)object).d;
        n3 = (int)(Intrinsics.areEqual(object3, object2) ? 1 : 0);
        if (n3 == 0) {
            return false;
        }
        object3 = this.e;
        object2 = ((ad3_0)object).e;
        n3 = (int)(Intrinsics.areEqual(object3, object2) ? 1 : 0);
        if (n3 == 0) {
            return false;
        }
        object3 = this.f;
        object = ((ad3_0)object).f;
        boolean bl3 = Intrinsics.areEqual(object3, object);
        if (!bl3) {
            return false;
        }
        return bl2;
    }

    public final int hashCode() {
        int n3;
        int n4 = this.a.hashCode();
        int n7 = 31;
        n4 *= 31;
        int n8 = this.b;
        n4 = (n4 + n8) * 31;
        Object object = this.c;
        n8 = (((Vi1)object).hashCode() + n4) * 31;
        n4 = 0;
        Object object2 = this.d;
        if (object2 == null) {
            n3 = 0;
            object2 = null;
        } else {
            n3 = ((L93)object2).hashCode();
        }
        n8 = (n8 + n3) * 31;
        object2 = this.e;
        n7 = ne_0.a(n8, n7, (List)object2);
        object = this.f;
        if (object != null) {
            n4 = object.hashCode();
        }
        return n7 + n4;
    }

    public final String toString() {
        int n3;
        Object object;
        StringBuilder stringBuilder;
        String string2;
        block3: {
            block2: {
                string2 = "(";
                stringBuilder = new StringBuilder(string2);
                object = this.a;
                stringBuilder.append((String)object);
                stringBuilder.append(':');
                int n4 = this.b;
                stringBuilder.append(n4);
                stringBuilder.append(",\n            |bounds=(top=");
                object = this.c;
                int n7 = ((Vi1)object).b;
                stringBuilder.append(n7);
                stringBuilder.append(", left=");
                n7 = ((Vi1)object).a;
                stringBuilder.append(n7);
                stringBuilder.append(",\n            |location=");
                L93 l93 = this.d;
                if (l93 == null) break block2;
                StringBuilder stringBuilder2 = new StringBuilder(string2);
                n3 = l93.b;
                stringBuilder2.append(n3);
                stringBuilder2.append('L');
                n3 = l93.c;
                stringBuilder2.append(n3);
                string2 = stringBuilder2.toString();
                if (string2 != null) break block3;
            }
            string2 = "<none>";
        }
        stringBuilder.append(string2);
        stringBuilder.append("\n            |bottom=");
        n3 = ((Vi1)object).d;
        stringBuilder.append(n3);
        stringBuilder.append(", right=");
        n3 = ((Vi1)object).c;
        stringBuilder.append(n3);
        stringBuilder.append("),\n            |childrenCount=");
        n3 = this.e.size();
        stringBuilder.append(n3);
        stringBuilder.append(')');
        return ee3_2.c(stringBuilder.toString());
    }
}

