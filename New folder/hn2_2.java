/*
 * Decompiled with CFR 0.152.
 */
import java.io.File;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from hn2
 */
public final class hn2_2
implements Comparable {
    public static final String b;
    public final ff_2 a;

    static {
        String string2 = File.separator;
        Intrinsics.checkNotNullExpressionValue(string2, "separator");
        b = string2;
    }

    public hn2_2(ff_2 ff_22) {
        Intrinsics.checkNotNullParameter(ff_22, "bytes");
        this.a = ff_22;
    }

    public final ArrayList a() {
        ff_2 ff_22;
        ArrayList<ff_2> arrayList = new ArrayList<ff_2>();
        int n3 = i_0.a(this);
        int n4 = -1;
        int n7 = 92;
        ff_2 ff_23 = this.a;
        if (n3 == n4) {
            n3 = 0;
            ff_22 = null;
        } else {
            n4 = ff_23.d();
            if (n3 < n4 && (n4 = (int)ff_23.i(n3)) == n7) {
                ++n3;
            }
        }
        n4 = ff_23.d();
        int n8 = n3;
        while (n3 < n4) {
            byte by2;
            byte by4 = ff_23.i(n3);
            if (by4 == (by2 = 47) || (by4 = ff_23.i(n3)) == n7) {
                ff_2 ff_24 = ff_23.n(n8, n3);
                arrayList.add(ff_24);
                n8 = n3 + 1;
            }
            ++n3;
        }
        n3 = ff_23.d();
        if (n8 < n3) {
            n3 = ff_23.d();
            ff_22 = ff_23.n(n8, n3);
            arrayList.add(ff_22);
        }
        return arrayList;
    }

    public final hn2_2 b() {
        hn2_2 hn2_22;
        block12: {
            int n3;
            int n4;
            Comparable comparable;
            int n7;
            int n8;
            ff_2 ff_22;
            ff_2 ff_23;
            block15: {
                int n10;
                String string2;
                boolean bl2;
                block14: {
                    Character c2;
                    ff_2 ff_24;
                    block13: {
                        ff_23 = i_0.d;
                        ff_22 = this.a;
                        n8 = Intrinsics.areEqual(ff_22, ff_23);
                        hn2_22 = null;
                        if (n8 != 0 || (bl2 = Intrinsics.areEqual(ff_22, ff_24 = i_0.a)) || (n7 = Intrinsics.areEqual(ff_22, comparable = i_0.b)) != 0) break block12;
                        ff_2 ff_25 = i_0.e;
                        ff_22.getClass();
                        string2 = "suffix";
                        Intrinsics.checkNotNullParameter(ff_25, string2);
                        n10 = ff_22.d();
                        byte[] byArray = ff_25.a;
                        n4 = byArray.length;
                        n3 = byArray.length;
                        n7 = ff_22.l(n10 -= n4, ff_25, n3);
                        n10 = 3;
                        n3 = 2;
                        n4 = 1;
                        if (n7 == 0) break block13;
                        n7 = ff_22.d();
                        if (n7 == n3) break block12;
                        n7 = ff_22.d() - n10;
                        if ((n7 = (int)(ff_22.l(n7, ff_24, n4) ? 1 : 0)) != 0) break block12;
                        n7 = ff_22.d() - n10;
                        if ((n7 = (int)(ff_22.l(n7, (ff_2)comparable, n4) ? 1 : 0)) != 0) break block12;
                    }
                    if ((n8 = ff_2.k(ff_22, ff_24)) == (n7 = -1)) {
                        n8 = ff_2.k(ff_22, comparable);
                    }
                    if (n8 != n3 || (c2 = this.g()) == null) break block14;
                    int n14 = ff_22.d();
                    if (n14 != n10) {
                        ff_23 = ff_2.o(ff_22, 0, n10, n4);
                        hn2_22 = new hn2_2(ff_23);
                    }
                    break block12;
                }
                if (n8 != n4) break block15;
                string2 = "prefix";
                Intrinsics.checkNotNullParameter(comparable, string2);
                n10 = comparable.d();
                bl2 = ff_22.l(0, (ff_2)comparable, n10);
                if (bl2) break block12;
            }
            if (n8 == n7 && (comparable = this.g()) != null) {
                int n15 = ff_22.d();
                if (n15 != n3) {
                    ff_23 = ff_2.o(ff_22, 0, n3, n4);
                    hn2_22 = new hn2_2(ff_23);
                }
            } else if (n8 == n7) {
                hn2_22 = new hn2_2(ff_23);
            } else if (n8 == 0) {
                ff_23 = ff_2.o(ff_22, 0, n4, n4);
                hn2_22 = new hn2_2(ff_23);
            } else {
                ff_23 = ff_2.o(ff_22, 0, n8, n4);
                hn2_22 = new hn2_2(ff_23);
            }
        }
        return hn2_22;
    }

    public final hn2_2 c(hn2_2 object) {
        Object object2;
        Object object3;
        block10: {
            block13: {
                block12: {
                    int n3;
                    int n4;
                    ff_2 ff_22;
                    Object object4;
                    int n7;
                    int n8;
                    List list;
                    block11: {
                        int n10;
                        Object e2;
                        Object e5;
                        boolean bl2;
                        object3 = "other";
                        Intrinsics.checkNotNullParameter(object, (String)object3);
                        int n14 = i_0.a(this);
                        list = this.a;
                        n8 = 0;
                        object2 = null;
                        n7 = -1;
                        if (n14 == n7) {
                            object4 = null;
                        } else {
                            object3 = ((ff_2)((Object)list)).n(0, n14);
                            object4 = new hn2_2((ff_2)object3);
                        }
                        object.getClass();
                        n14 = i_0.a((hn2_2)object);
                        ff_22 = ((hn2_2)object).a;
                        if (n14 != n7) {
                            object3 = ff_22.n(0, n14);
                            object2 = new hn2_2((ff_2)object3);
                        }
                        n14 = (int)(Intrinsics.areEqual(object4, object2) ? 1 : 0);
                        object2 = " and ";
                        if (n14 == 0) break block10;
                        object3 = this.a();
                        object4 = ((hn2_2)object).a();
                        int n15 = ((ArrayList)object3).size();
                        n4 = ((ArrayList)object4).size();
                        n15 = Math.min(n15, n4);
                        for (n4 = 0; n4 < n15 && (bl2 = Intrinsics.areEqual(e5 = ((ArrayList)object3).get(n4), e2 = ((ArrayList)object4).get(n4))); ++n4) {
                        }
                        if (n4 != n15 || (n3 = ((ff_2)((Object)list)).d()) != (n10 = ff_22.d())) break block11;
                        object = hn2$a.a(".", false);
                        break block12;
                    }
                    n3 = ((ArrayList)object4).size();
                    list = ((ArrayList)object4).subList(n4, n3);
                    if ((n3 = list.indexOf(ff_22 = i_0.e)) != n7) break block13;
                    list = new ce_2();
                    if ((object = i_0.c((hn2_2)object)) == null && (object = i_0.c(this)) == null) {
                        object = i_0.e();
                    }
                    n8 = ((ArrayList)object4).size();
                    for (n7 = n4; n7 < n8; ++n7) {
                        object4 = i_0.e;
                        ((ce_2)((Object)list)).P((ff_2)object4);
                        ((ce_2)((Object)list)).P((ff_2)object);
                    }
                    n8 = ((ArrayList)object3).size();
                    while (n4 < n8) {
                        ff_2 ff_23 = (ff_2)((ArrayList)object3).get(n4);
                        ((ce_2)((Object)list)).P(ff_23);
                        ((ce_2)((Object)list)).P((ff_2)object);
                        ++n4;
                    }
                    object = i_0.d((ce_2)((Object)list), false);
                }
                return object;
            }
            object3 = new StringBuilder("Impossible relative path to resolve: ");
            ((StringBuilder)object3).append(this);
            ((StringBuilder)object3).append((String)object2);
            ((StringBuilder)object3).append(object);
            object = ((StringBuilder)object3).toString();
            object = object.toString();
            object3 = new IllegalArgumentException((String)object);
            throw object3;
        }
        object3 = new StringBuilder("Paths of different roots cannot be relative to each other: ");
        ((StringBuilder)object3).append(this);
        ((StringBuilder)object3).append((String)object2);
        ((StringBuilder)object3).append(object);
        object = ((StringBuilder)object3).toString();
        object = object.toString();
        object3 = new IllegalArgumentException((String)object);
        throw object3;
    }

    public final int compareTo(Object object) {
        object = (hn2_2)object;
        Intrinsics.checkNotNullParameter(object, "other");
        object = ((hn2_2)object).a;
        return this.a.b((ff_2)object);
    }

    public final hn2_2 d(String string2) {
        Intrinsics.checkNotNullParameter(string2, "child");
        Object object = new ce_2();
        ((ce_2)object).I0(string2);
        object = i_0.d((ce_2)object, false);
        return i_0.b(this, (hn2_2)object, false);
    }

    public final File e() {
        String string2 = this.a.q();
        File file = new File(string2);
        return file;
    }

    public final boolean equals(Object object) {
        ff_2 ff_22;
        boolean bl2;
        boolean bl3 = object instanceof hn2_2;
        if (bl3 && (bl2 = Intrinsics.areEqual(object = ((hn2_2)object).a, ff_22 = this.a))) {
            bl2 = true;
        } else {
            bl2 = false;
            object = null;
        }
        return bl2;
    }

    public final Path f() {
        Object object = this.a.q();
        String[] stringArray = new String[]{};
        object = aj3_2.a((String)object, stringArray);
        Intrinsics.checkNotNullExpressionValue(object, "get(...)");
        return object;
    }

    public final Character g() {
        byte by2;
        byte by4;
        int n3;
        int n4;
        ff_2 ff_22 = i_0.a;
        ff_2 ff_23 = this.a;
        int c2 = ff_2.g(ff_23, ff_22);
        int n7 = -1;
        Character c3 = null;
        if (c2 == n7 && (n4 = ff_23.d()) >= (n3 = 2) && (by4 = ff_23.i(1)) == (by2 = 58)) {
            ff_22 = null;
            char c5 = 'a';
            char c6 = (char)ff_23.i(0);
            if (c5 <= c6 && c6 < (c5 = '{') || (c5 = 'A') <= c6 && c6 < (c5 = '[')) {
                c3 = Character.valueOf(c6);
            }
        }
        return c3;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a.q();
    }
}

