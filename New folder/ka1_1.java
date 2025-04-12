/*
 * Decompiled with CFR 0.152.
 */
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Ka1
 */
public final class ka1_1 {
    public final as_2 a;
    public int b;
    public int[] c;

    public ka1_1(as_2 object) {
        Intrinsics.checkNotNullParameter(object, "builder");
        this.a = object;
        object = (int[])la1_1.b.g0();
        this.c = (int[])object;
    }

    public final as$a_0 a(String string2) {
        String string3 = "name";
        Intrinsics.checkNotNullParameter(string2, string3);
        int n3 = ns_2.a;
        n3 = string2.length();
        int n4 = ns_2.a(0, n3, string2);
        n3 = this.b;
        for (int i3 = 0; i3 < n3; ++i3) {
            int[] nArray = this.c;
            int n7 = i3 * 8;
            int n8 = nArray[n7];
            if (n8 != n4) continue;
            n4 = n7 + 4;
            n4 = nArray[n4];
            n3 = nArray[n7 += 5];
            return (as$a_0)this.a.subSequence(n4, n3);
        }
        return null;
    }

    public final void b(int n3, int n4, int n7, int n8, int n10, int n14) {
        int n15 = this.b;
        int n16 = n15 * 8;
        int[] nArray = this.c;
        int n17 = nArray.length;
        if (n16 < n17) {
            nArray[n16] = n3;
            n3 = n16 + 1;
            nArray[n3] = n4;
            n3 = n16 + 2;
            nArray[n3] = n7;
            n3 = n16 + 3;
            nArray[n3] = n8;
            n3 = n16 + 4;
            nArray[n3] = n10;
            n3 = n16 + 5;
            nArray[n3] = n14;
            n3 = n16 + 6;
            nArray[n3] = n4 = -1;
            nArray[n16 += 7] = n4;
            this.b = ++n15;
            return;
        }
        q42_0 q42_02 = new q42_0("An operation is not implemented: Implement headers overflow");
        throw q42_02;
    }

    public final void c() {
        this.b = 0;
        int[] nArray = this.c;
        Object object = la1_1.a;
        this.c = object;
        if (nArray != object) {
            object = la1_1.b;
            ((mm0_2)object).C0(nArray);
        }
    }

    public final String toString() {
        Serializable serializable = new StringBuilder();
        Object object = la1_1.a;
        Intrinsics.checkNotNullParameter(this, "<this>");
        String string2 = "";
        Intrinsics.checkNotNullParameter(string2, "indent");
        object = "out";
        Intrinsics.checkNotNullParameter(serializable, (String)object);
        int n3 = this.b;
        for (int i3 = 0; i3 < n3; ++i3) {
            serializable.append(string2);
            Object object2 = "Failed requirement.";
            if (i3 >= 0) {
                int n4 = this.b;
                if (i3 < n4) {
                    n4 = i3 * 8;
                    Object object3 = this.c;
                    int n7 = n4 + 2;
                    n7 = object3[n7];
                    int n8 = n4 + 3;
                    Object object4 = object3[n8];
                    as_2 as_22 = this.a;
                    object3 = as_22.subSequence(n7, (int)object4);
                    serializable.append((CharSequence)object3);
                    object3 = " => ";
                    serializable.append((CharSequence)object3);
                    if (i3 >= 0) {
                        object4 = this.b;
                        if (i3 < object4) {
                            object2 = this.c;
                            object4 = n4 + 4;
                            object4 = object2[object4];
                            Object object5 = object2[n4 += 5];
                            object2 = as_22.subSequence((int)object4, (int)object5);
                            serializable.append((CharSequence)object2);
                            object2 = "\n";
                            serializable.append((CharSequence)object2);
                            continue;
                        }
                        object = object2.toString();
                        serializable = new IllegalArgumentException((String)object);
                        throw serializable;
                    }
                    object = object2.toString();
                    serializable = new IllegalArgumentException((String)object);
                    throw serializable;
                }
                object = object2.toString();
                serializable = new IllegalArgumentException((String)object);
                throw serializable;
            }
            object = object2.toString();
            serializable = new IllegalArgumentException((String)object);
            throw serializable;
        }
        return ((StringBuilder)serializable).toString();
    }
}

