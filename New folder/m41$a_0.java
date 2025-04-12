/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.b;

/*
 * Renamed from m41$a
 */
public final class m41$a_0 {
    public final ArrayList a;

    public m41$a_0() {
        ArrayList arrayList;
        this.a = arrayList = new ArrayList(20);
    }

    public final void a(String string2, String string3) {
        Intrinsics.checkNotNullParameter(string2, "name");
        Intrinsics.checkNotNullParameter(string3, "value");
        m41$b.a(string2);
        m41$b.b(string3, string2);
        this.c(string2, string3);
    }

    public final void b(String string2) {
        String string3 = "line";
        Intrinsics.checkNotNullParameter(string2, string3);
        char c2 = ':';
        int n3 = 1;
        char c3 = '\u0000';
        String string4 = null;
        int n4 = StringsKt.N(string2, c2, n3, false, 4);
        int n7 = -1;
        String string5 = "this as java.lang.String).substring(startIndex)";
        if (n4 != n7) {
            string3 = string2.substring(0, n4);
            string4 = "this as java.lang.String\u2026ing(startIndex, endIndex)";
            Intrinsics.checkNotNullExpressionValue(string3, string4);
            string2 = string2.substring(n4 += n3);
            Intrinsics.checkNotNullExpressionValue(string2, string5);
            this.c(string3, string2);
        } else {
            c3 = string2.charAt(0);
            String string6 = "";
            if (c3 == c2) {
                string2 = string2.substring(n3);
                Intrinsics.checkNotNullExpressionValue(string2, string5);
                this.c(string6, string2);
            } else {
                this.c(string6, string2);
            }
        }
    }

    public final void c(String string2, String string3) {
        Intrinsics.checkNotNullParameter(string2, "name");
        Intrinsics.checkNotNullParameter(string3, "value");
        ArrayList arrayList = this.a;
        arrayList.add(string2);
        string2 = ((Object)StringsKt.m0(string3)).toString();
        arrayList.add(string2);
    }

    public final void d(String object, String object2) {
        int n3 = 1;
        Intrinsics.checkNotNullParameter(object, "name");
        Object object3 = "value";
        Intrinsics.checkNotNullParameter(object2, (String)object3);
        int n4 = ((String)object).length();
        if (n4 > 0) {
            n4 = ((String)object).length();
            Object[] objectArray = null;
            for (int i3 = 0; i3 < n4; i3 += n3) {
                int n7 = 33;
                int n8 = ((String)object).charAt(i3);
                if (n7 <= n8 && n8 < (n7 = 127)) {
                    continue;
                }
                object2 = n8;
                object3 = i3;
                objectArray = new Object[3];
                objectArray[0] = object2;
                objectArray[n3] = object3;
                objectArray[2] = object;
                object = ez3.i("Unexpected char %#04x at %d in header name: %s", objectArray);
                object = object.toString();
                object2 = new IllegalArgumentException((String)object);
                throw object2;
            }
            this.c((String)object, (String)object2);
            return;
        }
        object2 = "name is empty".toString();
        object = new IllegalArgumentException((String)object2);
        throw object;
    }

    public final m41_0 e() {
        String[] stringArray = this.a;
        String[] stringArray2 = new String[]{};
        stringArray = stringArray.toArray(stringArray2);
        m41_0 m41_02 = new m41_0(stringArray);
        return m41_02;
    }

    public final String f(String string2) {
        Intrinsics.checkNotNullParameter(string2, "name");
        ArrayList arrayList = this.a;
        int n3 = arrayList.size() + -2;
        int n4 = -2;
        int n7 = vb2_1.a(n3, 0, n4);
        if (n7 <= n3) {
            while (true) {
                int n8;
                String string3;
                if ((n4 = (int)(b.i(string2, string3 = (String)arrayList.get(n3), (n8 = 1) != 0) ? 1 : 0)) != 0) {
                    return (String)arrayList.get(n3 += n8);
                }
                if (n3 == n7) break;
                n3 += -2;
            }
        }
        return null;
    }

    public final void g(String string2) {
        ArrayList arrayList;
        int n3;
        Intrinsics.checkNotNullParameter(string2, "name");
        for (int i3 = 0; i3 < (n3 = (arrayList = this.a).size()); i3 += 2) {
            boolean bl2;
            String string3 = (String)arrayList.get(i3);
            n3 = (int)(b.i(string2, string3, bl2 = true) ? 1 : 0);
            if (n3 == 0) continue;
            arrayList.remove(i3);
            arrayList.remove(i3);
            i3 += -2;
        }
    }

    public final void h(String string2, String string3) {
        Intrinsics.checkNotNullParameter(string2, "name");
        Intrinsics.checkNotNullParameter(string3, "value");
        m41$b.a(string2);
        m41$b.b(string3, string2);
        this.g(string2);
        this.c(string2, string3);
    }
}

