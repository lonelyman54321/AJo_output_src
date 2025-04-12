/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from d30
 */
public final class d30_0 {
    public final j30_0 a;
    public zr_1 b;
    public boolean c;
    public final fj1 d;
    public boolean e;
    public int f;
    public int g;
    public final gb3_1 h;
    public int i;
    public int j;
    public int k;
    public int l;

    public d30_0(j30_0 object, zr_1 zr_12) {
        int n3;
        this.a = object;
        this.b = zr_12;
        this.d = object = new fj1();
        this.e = true;
        this.h = object = new gb3_1();
        this.i = n3 = -1;
        this.j = n3;
        this.k = n3;
    }

    public final void a(ArrayList object, Xi1 object2) {
        Object object3 = this.b;
        object3.getClass();
        boolean bl2 = object.isEmpty();
        int n3 = 1;
        if (bl2 ^= n3) {
            i92$d_0 i92$d_0 = i92$d_0.c;
            object3 = ((zr_1)object3).a;
            ((R92)object3).X(i92$d_0);
            R92$b.b((R92)object3, n3, object);
            int n4 = 0;
            object = null;
            R92$b.b((R92)object3, 0, object2);
            int n7 = ((R92)object3).g;
            int n8 = i92$d_0.a;
            int n10 = R92.Q((R92)object3, n8);
            int n14 = i92$d_0.b;
            if (n7 != n10 || (n7 = ((R92)object3).h) != (n10 = R92.Q((R92)object3, n14))) {
                int n15;
                int n16;
                String string2;
                object2 = new StringBuilder();
                n10 = 0;
                StringBuilder stringBuilder = null;
                int n17 = 0;
                while (true) {
                    string2 = ", ";
                    if (n10 >= n8) break;
                    n16 = n3 << n10;
                    n15 = ((R92)object3).g;
                    if ((n16 &= n15) != 0) {
                        if (n17 > 0) {
                            ((StringBuilder)object2).append(string2);
                        }
                        string2 = i92$d_0.b(n10);
                        ((StringBuilder)object2).append(string2);
                        ++n17;
                    }
                    ++n10;
                }
                object2 = ((StringBuilder)object2).toString();
                String string3 = "StringBuilder().apply(builderAction).toString()";
                stringBuilder = g30.b((String)object2, string3);
                n16 = 0;
                while (n4 < n14) {
                    n15 = n3 << n4;
                    int n18 = ((R92)object3).h;
                    if ((n15 &= n18) != 0) {
                        if (n17 > 0) {
                            stringBuilder.append(string2);
                        }
                        String string4 = i92$d_0.c(n4);
                        stringBuilder.append(string4);
                        ++n16;
                    }
                    ++n4;
                }
                object = stringBuilder.toString();
                Intrinsics.checkNotNullExpressionValue(object, string3);
                object3 = new StringBuilder("Error while pushing ");
                ((StringBuilder)object3).append(i92$d_0);
                ((StringBuilder)object3).append(". Not all arguments were provided. Missing ");
                h30_0.b((StringBuilder)object3, n17, " int arguments (", (String)object2, ") and ");
                i30_0.a((StringBuilder)object3, n16, " object arguments (", (String)object, ").");
                throw null;
            }
        }
    }

    public final void b(uq1_0 object, A30 object2, vQ1 object3, vQ1 object4) {
        int n3;
        int n4;
        String string2;
        i0_0 i0_02 = this.b;
        i0_02.getClass();
        i92$e_0 i92$e_0 = i92$e_0.c;
        i0_02 = ((zr_1)i0_02).a;
        ((R92)i0_02).X(i92$e_0);
        int n7 = 0;
        R92$b.b((R92)i0_02, 0, object);
        int n8 = 1;
        R92$b.b((R92)i0_02, n8, object2);
        R92$b.b((R92)i0_02, 3, object4);
        R92$b.b((R92)i0_02, 2, object3);
        int n10 = ((R92)i0_02).g;
        int n14 = i92$e_0.a;
        int n15 = R92.Q((R92)i0_02, n14);
        int n16 = i92$e_0.b;
        if (n10 == n15 && (n10 = ((R92)i0_02).h) == (n15 = R92.Q((R92)i0_02, n16))) {
            return;
        }
        object2 = new StringBuilder();
        n15 = 0;
        object4 = null;
        int n17 = 0;
        while (true) {
            string2 = ", ";
            if (n15 >= n14) break;
            n4 = n8 << n15;
            n3 = ((R92)i0_02).g;
            if ((n4 &= n3) != 0) {
                if (n17 > 0) {
                    ((StringBuilder)object2).append(string2);
                }
                string2 = i92$e_0.b(n15);
                ((StringBuilder)object2).append(string2);
                ++n17;
            }
            ++n15;
        }
        object2 = ((StringBuilder)object2).toString();
        object3 = "StringBuilder().apply(builderAction).toString()";
        object4 = g30.b((String)object2, (String)object3);
        n4 = 0;
        while (n7 < n16) {
            n3 = n8 << n7;
            int n18 = ((R92)i0_02).h;
            if ((n3 &= n18) != 0) {
                if (n17 > 0) {
                    ((StringBuilder)object4).append(string2);
                }
                String string3 = i92$e_0.c(n7);
                ((StringBuilder)object4).append(string3);
                ++n4;
            }
            ++n7;
        }
        object = ((StringBuilder)object4).toString();
        Intrinsics.checkNotNullExpressionValue(object, (String)object3);
        object3 = new StringBuilder("Error while pushing ");
        ((StringBuilder)object3).append(i92$e_0);
        ((StringBuilder)object3).append(". Not all arguments were provided. Missing ");
        h30_0.b((StringBuilder)object3, n17, " int arguments (", (String)object2, ") and ");
        i30_0.a((StringBuilder)object3, n4, " object arguments (", (String)object, ").");
        throw null;
    }

    public final void c(Xi1 object, Ae object2) {
        int n3;
        int n4;
        String string2;
        this.f();
        Object object3 = this.b;
        object3.getClass();
        i92$g_0 i92$g_0 = i92$g_0.c;
        object3 = ((zr_1)object3).a;
        ((R92)object3).X(i92$g_0);
        int n7 = 0;
        R92$b.b((R92)object3, 0, object);
        int n8 = 1;
        R92$b.b((R92)object3, n8, object2);
        int n10 = ((R92)object3).g;
        int n14 = i92$g_0.a;
        int n15 = R92.Q((R92)object3, n14);
        int n16 = i92$g_0.b;
        if (n10 == n15 && (n10 = ((R92)object3).h) == (n15 = R92.Q((R92)object3, n16))) {
            return;
        }
        object2 = new StringBuilder();
        n15 = 0;
        StringBuilder stringBuilder = null;
        int n17 = 0;
        while (true) {
            string2 = ", ";
            if (n15 >= n14) break;
            n4 = n8 << n15;
            n3 = ((R92)object3).g;
            if ((n4 &= n3) != 0) {
                if (n17 > 0) {
                    ((StringBuilder)object2).append(string2);
                }
                string2 = i92$g_0.b(n15);
                ((StringBuilder)object2).append(string2);
                ++n17;
            }
            ++n15;
        }
        object2 = ((StringBuilder)object2).toString();
        String string3 = "StringBuilder().apply(builderAction).toString()";
        stringBuilder = g30.b((String)object2, string3);
        n4 = 0;
        while (n7 < n16) {
            n3 = n8 << n7;
            int n18 = ((R92)object3).h;
            if ((n3 &= n18) != 0) {
                if (n17 > 0) {
                    stringBuilder.append(string2);
                }
                String string4 = i92$g_0.c(n7);
                stringBuilder.append(string4);
                ++n4;
            }
            ++n7;
        }
        object = stringBuilder.toString();
        Intrinsics.checkNotNullExpressionValue(object, string3);
        object3 = new StringBuilder("Error while pushing ");
        ((StringBuilder)object3).append(i92$g_0);
        ((StringBuilder)object3).append(". Not all arguments were provided. Missing ");
        h30_0.b((StringBuilder)object3, n17, " int arguments (", (String)object2, ") and ");
        i30_0.a((StringBuilder)object3, n4, " object arguments (", (String)object, ").");
        throw null;
    }

    public final void d(zr_1 object, Xi1 object2) {
        Object object3 = this.b;
        object3.getClass();
        Object object4 = ((zr_1)object).a;
        boolean bl2 = ((R92)object4).U();
        if (bl2) {
            object4 = i92$c_0.c;
            object3 = ((zr_1)object3).a;
            ((R92)object3).X((I92)object4);
            int n3 = 0;
            R92$b.b((R92)object3, 0, object);
            int n4 = 1;
            R92$b.b((R92)object3, n4, object2);
            int n7 = ((R92)object3).g;
            int n8 = ((I92)object4).a;
            int n10 = R92.Q((R92)object3, n8);
            int n14 = ((I92)object4).b;
            if (n7 != n10 || (n7 = ((R92)object3).h) != (n10 = R92.Q((R92)object3, n14))) {
                int n15;
                int n16;
                String string2;
                object2 = new StringBuilder();
                n10 = 0;
                StringBuilder stringBuilder = null;
                int n17 = 0;
                while (true) {
                    string2 = ", ";
                    if (n10 >= n8) break;
                    n16 = n4 << n10;
                    n15 = ((R92)object3).g;
                    if ((n16 &= n15) != 0) {
                        if (n17 > 0) {
                            ((StringBuilder)object2).append(string2);
                        }
                        string2 = ((I92)object4).b(n10);
                        ((StringBuilder)object2).append(string2);
                        ++n17;
                    }
                    ++n10;
                }
                object2 = ((StringBuilder)object2).toString();
                String string3 = "StringBuilder().apply(builderAction).toString()";
                stringBuilder = g30.b((String)object2, string3);
                n16 = 0;
                while (n3 < n14) {
                    n15 = n4 << n3;
                    int n18 = ((R92)object3).h;
                    if ((n15 &= n18) != 0) {
                        if (n17 > 0) {
                            stringBuilder.append(string2);
                        }
                        String string4 = ((i92$c_0)object4).c(n3);
                        stringBuilder.append(string4);
                        ++n16;
                    }
                    ++n3;
                }
                object = stringBuilder.toString();
                Intrinsics.checkNotNullExpressionValue(object, string3);
                object3 = new StringBuilder("Error while pushing ");
                ((StringBuilder)object3).append(object4);
                ((StringBuilder)object3).append(". Not all arguments were provided. Missing ");
                h30_0.b((StringBuilder)object3, n17, " int arguments (", (String)object2, ") and ");
                i30_0.a((StringBuilder)object3, n16, " object arguments (", (String)object, ").");
                throw null;
            }
        }
    }

    public final void e() {
        this.g();
        Object object = this.h;
        ArrayList arrayList = ((gb3_1)object).a;
        int n3 = arrayList.isEmpty() ^ 1;
        if (n3 != 0) {
            object = ((gb3_1)object).a;
            n3 = ((ArrayList)object).size() + -1;
            ((ArrayList)object).remove(n3);
        } else {
            int n4;
            this.g = n4 = this.g + 1;
        }
    }

    /*
     * WARNING - void declaration
     */
    public final void f() {
        int n3;
        int n7;
        I92$H i92$H;
        Object object;
        Object object2 = this;
        int n8 = this.g;
        String string2 = ").";
        String string3 = " object arguments (";
        String string4 = ") and ";
        String string5 = " int arguments (";
        String string6 = ". Not all arguments were provided. Missing ";
        String string7 = "Error while pushing ";
        CharSequence charSequence = "StringBuilder().apply(builderAction).toString()";
        String string8 = ", ";
        int n10 = 0;
        i92$h_0 i92$h_0 = null;
        if (n8 > 0) {
            int n4;
            object = this.b;
            object.getClass();
            i92$H = I92$H.c;
            object = ((zr_1)object).a;
            ((R92)object).X(i92$H);
            R92$b.a((R92)object, 0, n8);
            n8 = ((R92)object).g;
            n7 = i92$H.a;
            int n42 = R92.Q((R92)object, n7);
            n3 = i92$H.b;
            if (n8 == n42 && (n8 = ((R92)object).h) == (n4 = R92.Q((R92)object, n3))) {
                this.g = 0;
            } else {
                String string9;
                int n14;
                int n15;
                void var16_19;
                CharSequence charSequence2 = new StringBuilder();
                boolean bl2 = false;
                CharSequence charSequence3 = null;
                while (var16_19 < n7) {
                    n15 = 1;
                    n14 = n15 << var16_19;
                    int n16 = n7;
                    n7 = ((R92)object).g;
                    if ((n7 = n14 & n7) != 0) {
                        if (n10 > 0) {
                            ((StringBuilder)charSequence2).append(string8);
                        }
                        string9 = i92$H.b((int)var16_19);
                        ((StringBuilder)charSequence2).append(string9);
                        ++n10;
                    }
                    ++var16_19;
                    n7 = n16;
                }
                charSequence2 = ((StringBuilder)charSequence2).toString();
                charSequence3 = g30.b((String)charSequence2, (String)charSequence);
                int n17 = 0;
                object2 = null;
                string9 = null;
                for (n7 = 0; n7 < n3; ++n7) {
                    n15 = 1;
                    int n18 = n15 << n7;
                    n14 = n3;
                    n3 = ((R92)object).h;
                    if ((n3 = n18 & n3) != 0) {
                        if (n10 > 0) {
                            ((StringBuilder)charSequence3).append(string8);
                        }
                        String string10 = i92$H.c(n7);
                        ((StringBuilder)charSequence3).append(string10);
                        ++n17;
                    }
                    n3 = n14;
                }
                charSequence3 = ((StringBuilder)charSequence3).toString();
                Intrinsics.checkNotNullExpressionValue(charSequence3, (String)charSequence);
                charSequence = new StringBuilder(string7);
                ((StringBuilder)charSequence).append(i92$H);
                ((StringBuilder)charSequence).append(string6);
                h30_0.b((StringBuilder)charSequence, n10, string5, (String)charSequence2, string4);
                i30_0.a((StringBuilder)charSequence, n17, string3, (String)charSequence3, string2);
                throw null;
            }
        }
        Object object3 = ((d30_0)object2).h;
        Object object4 = ((gb3_1)object3).a;
        boolean bl4 = ((ArrayList)object4).isEmpty();
        bl4 = bl4 ^ (n10 = 1);
        if (bl4) {
            int n19;
            int n20;
            object4 = ((d30_0)object2).b;
            object3 = ((gb3_1)object3).a;
            n10 = ((ArrayList)object3).size();
            Object[] objectArray = new Object[n10];
            object = null;
            for (n20 = 0; n20 < n10; ++n20) {
                i92$H = ((ArrayList)object3).get(n20);
                objectArray[n20] = i92$H;
            }
            object4.getClass();
            if (n10 == 0) {
                n10 = 1;
                n19 = 1;
            } else {
                n10 = 1;
                n19 = 0;
            }
            n20 = n19 ^ 1;
            if (n20 != 0) {
                i92$h_0 = i92$h_0.c;
                object4 = ((zr_1)object4).a;
                ((R92)object4).X(i92$h_0);
                object = null;
                R92$b.b((R92)object4, 0, objectArray);
                n3 = ((R92)object4).g;
                int n21 = i92$h_0.a;
                n7 = R92.Q((R92)object4, n21);
                n20 = i92$h_0.b;
                if (n3 != n7 || (n3 = ((R92)object4).h) != (n7 = R92.Q((R92)object4, n20))) {
                    int n22;
                    object3 = new StringBuilder();
                    objectArray = null;
                    n7 = 0;
                    Object var23_33 = null;
                    for (n3 = 0; n3 < n21; ++n3) {
                        n19 = 1;
                        n22 = n19 << n3;
                        int n24 = ((R92)object4).g;
                        if ((n24 = n22 & n24) != 0) {
                            if (n7 > 0) {
                                ((StringBuilder)object3).append(string8);
                            }
                            object2 = i92$h_0.b(n3);
                            ((StringBuilder)object3).append((String)object2);
                            ++n7;
                        }
                        object2 = this;
                    }
                    object2 = ((StringBuilder)object3).toString();
                    object3 = g30.b((String)object2, (String)charSequence);
                    objectArray = null;
                    n21 = 0;
                    i92$H = null;
                    for (n3 = 0; n3 < n20; ++n3) {
                        n19 = 1;
                        int n25 = n19 << n3;
                        n22 = n20;
                        n20 = ((R92)object4).h;
                        if ((n20 = n25 & n20) != 0) {
                            if (n7 > 0) {
                                ((StringBuilder)object3).append(string8);
                            }
                            object = i92$h_0.c(n3);
                            ((StringBuilder)object3).append((String)object);
                            ++n21;
                        }
                        n20 = n22;
                    }
                    object3 = ((StringBuilder)object3).toString();
                    Intrinsics.checkNotNullExpressionValue(object3, (String)charSequence);
                    object4 = new StringBuilder(string7);
                    ((StringBuilder)object4).append(i92$h_0);
                    ((StringBuilder)object4).append(string6);
                    h30_0.b((StringBuilder)object4, n7, string5, (String)object2, string4);
                    i30_0.a((StringBuilder)object4, n21, string3, (String)object3, string2);
                    throw null;
                }
            }
            ((ArrayList)object3).clear();
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void g() {
        int n3;
        int n4;
        int n7;
        CharSequence charSequence;
        I92$s i92$s;
        int n8;
        i0_0 i0_02;
        int n10;
        String string2;
        CharSequence charSequence2;
        String string3;
        String string4;
        String string5;
        String string6;
        String string7;
        String string8;
        int n14;
        int n15;
        Object object;
        block22: {
            block21: {
                object = this;
                n15 = this.l;
                if (n15 <= 0) return;
                n14 = this.i;
                string8 = ").";
                string7 = " object arguments (";
                string6 = ") and ";
                string5 = " int arguments (";
                string4 = ". Not all arguments were provided. Missing ";
                string3 = "Error while pushing ";
                charSequence2 = "StringBuilder().apply(builderAction).toString()";
                string2 = ", ";
                n10 = -1;
                int n16 = 0;
                i0_02 = null;
                int n17 = 1;
                if (n14 >= 0) {
                    this.f();
                    i0_0 i0_03 = this.b;
                    i0_03.getClass();
                    I92$y i92$y = I92$y.c;
                    i0_03 = ((zr_1)i0_03).a;
                    ((R92)i0_03).X(i92$y);
                    R92$b.a((R92)i0_03, 0, n14);
                    R92$b.a((R92)i0_03, n17, n15);
                    n15 = ((R92)i0_03).g;
                    n14 = i92$y.a;
                    n16 = R92.Q((R92)i0_03, n14);
                    n17 = i92$y.b;
                    if (n15 == n16 && (n15 = ((R92)i0_03).h) == (n16 = R92.Q((R92)i0_03, n17))) {
                        this.i = n10;
                        break block21;
                    } else {
                        CharSequence charSequence3;
                        int n18;
                        int n19;
                        CharSequence charSequence4 = new StringBuilder();
                        n16 = 0;
                        i0_02 = null;
                        for (n10 = 0; n10 < n14; ++n10) {
                            int n20 = 1;
                            n19 = n20 << n10;
                            n18 = n14;
                            n14 = ((R92)i0_03).g;
                            if ((n14 = n19 & n14) != 0) {
                                if (n16 > 0) {
                                    ((StringBuilder)charSequence4).append(string2);
                                }
                                charSequence3 = i92$y.b(n10);
                                ((StringBuilder)charSequence4).append((String)charSequence3);
                                ++n16;
                            }
                            n14 = n18;
                        }
                        charSequence4 = ((StringBuilder)charSequence4).toString();
                        charSequence3 = g30.b((String)charSequence4, (String)charSequence2);
                        int n21 = 0;
                        object = null;
                        n10 = 0;
                        while (true) {
                            if (n10 >= n17) {
                                charSequence3 = ((StringBuilder)charSequence3).toString();
                                Intrinsics.checkNotNullExpressionValue(charSequence3, (String)charSequence2);
                                charSequence2 = new StringBuilder(string3);
                                ((StringBuilder)charSequence2).append(i92$y);
                                ((StringBuilder)charSequence2).append(string4);
                                h30_0.b((StringBuilder)charSequence2, n16, string5, (String)charSequence4, string6);
                                i30_0.a((StringBuilder)charSequence2, n21, string7, (String)charSequence3, string8);
                                throw null;
                            }
                            int n22 = 1;
                            n19 = n22 << n10;
                            n18 = n17;
                            n17 = ((R92)i0_03).h;
                            if ((n17 = n19 & n17) != 0) {
                                if (n16 > 0) {
                                    ((StringBuilder)charSequence3).append(string2);
                                }
                                String string9 = i92$y.c(n10);
                                ((StringBuilder)charSequence3).append(string9);
                                ++n21;
                            }
                            ++n10;
                            n17 = n18;
                        }
                    }
                }
                n14 = this.k;
                n8 = this.j;
                this.f();
                i0_02 = this.b;
                i0_02.getClass();
                i92$s = I92$s.c;
                i0_02 = ((zr_1)i0_02).a;
                ((R92)i0_02).X(i92$s);
                R92$b.a((R92)i0_02, 1, n14);
                charSequence = null;
                R92$b.a((R92)i0_02, 0, n8);
                R92$b.a((R92)i0_02, 2, n15);
                n15 = ((R92)i0_02).g;
                n14 = i92$s.a;
                n8 = R92.Q((R92)i0_02, n14);
                n7 = i92$s.b;
                if (n15 != n8 || (n15 = ((R92)i0_02).h) != (n8 = R92.Q((R92)i0_02, n7))) break block22;
                this.j = n10;
                this.k = n10;
            }
            n15 = 0;
            Object var18_20 = null;
            ((d30_0)object).l = 0;
            return;
        }
        n15 = 0;
        Object var18_22 = null;
        StringBuilder stringBuilder = new StringBuilder();
        for (n10 = 0; n10 < n14; ++n10) {
            n4 = 1;
            n3 = n4 << n10;
            int n24 = ((R92)i0_02).g;
            if ((n24 = n3 & n24) != 0) {
                if (n15 > 0) {
                    stringBuilder.append(string2);
                }
                object = i92$s.b(n10);
                stringBuilder.append((String)object);
                ++n15;
            }
            object = this;
        }
        object = stringBuilder.toString();
        charSequence = g30.b((String)object, (String)charSequence2);
        n8 = 0;
        stringBuilder = null;
        n10 = 0;
        while (true) {
            if (n8 >= n7) {
                charSequence = ((StringBuilder)charSequence).toString();
                Intrinsics.checkNotNullExpressionValue(charSequence, (String)charSequence2);
                stringBuilder = new StringBuilder(string3);
                stringBuilder.append(i92$s);
                stringBuilder.append(string4);
                h30_0.b(stringBuilder, n15, string5, (String)object, string6);
                i30_0.a(stringBuilder, n10, string7, (String)charSequence, string8);
                throw null;
            }
            int n25 = 1;
            n4 = n25 << n8;
            n3 = n7;
            n7 = ((R92)i0_02).h;
            if ((n7 = n4 & n7) != 0) {
                if (n15 > 0) {
                    ((StringBuilder)charSequence).append(string2);
                }
                String string10 = i92$s.c(n8);
                ((StringBuilder)charSequence).append(string10);
                ++n10;
            }
            ++n8;
            n7 = n3;
        }
    }

    /*
     * WARNING - void declaration
     */
    public final void h(boolean bl2) {
        i0_0 i0_02;
        boolean bl3;
        void var1_4;
        Object object;
        Object object2 = this.a;
        if (bl2) {
            object = ((j30_0)object2).F;
            int n3 = ((k73)object).i;
        } else {
            object = ((j30_0)object2).F;
            int n4 = ((k73)object).g;
        }
        int n7 = this.f;
        n7 = var1_4 - n7;
        int n8 = 0;
        String string2 = null;
        int n10 = 1;
        if (n7 >= 0) {
            bl3 = true;
        } else {
            bl3 = false;
            i0_02 = null;
        }
        if (bl3) {
            if (n7 > 0) {
                i0_02 = this.b;
                i0_02.getClass();
                i92$a_0 i92$a_0 = i92$a_0.c;
                i0_02 = ((zr_1)i0_02).a;
                ((R92)i0_02).X(i92$a_0);
                R92$b.a((R92)i0_02, 0, n7);
                n7 = ((R92)i0_02).g;
                int n14 = i92$a_0.a;
                int n15 = R92.Q((R92)i0_02, n14);
                int n16 = i92$a_0.b;
                if (n7 == n15 && (n7 = ((R92)i0_02).h) == (n15 = R92.Q((R92)i0_02, n16))) {
                    this.f = var1_4;
                } else {
                    int n17;
                    int n18;
                    String string3;
                    object = new StringBuilder();
                    n7 = 0;
                    object2 = null;
                    n15 = 0;
                    while (true) {
                        string3 = ", ";
                        if (n7 >= n14) break;
                        n18 = n10 << n7;
                        n17 = ((R92)i0_02).g;
                        if ((n18 &= n17) != 0) {
                            if (n15 > 0) {
                                ((StringBuilder)object).append(string3);
                            }
                            string3 = i92$a_0.b(n7);
                            ((StringBuilder)object).append(string3);
                            ++n15;
                        }
                        ++n7;
                    }
                    object = ((StringBuilder)object).toString();
                    object2 = "StringBuilder().apply(builderAction).toString()";
                    StringBuilder stringBuilder = g30.b((String)object, (String)object2);
                    n18 = 0;
                    while (n8 < n16) {
                        n17 = n10 << n8;
                        int n19 = ((R92)i0_02).h;
                        if ((n17 &= n19) != 0) {
                            if (n15 > 0) {
                                stringBuilder.append(string3);
                            }
                            String string4 = i92$a_0.c(n8);
                            stringBuilder.append(string4);
                            ++n18;
                        }
                        ++n8;
                    }
                    string2 = stringBuilder.toString();
                    Intrinsics.checkNotNullExpressionValue(string2, (String)object2);
                    object2 = new StringBuilder("Error while pushing ");
                    ((StringBuilder)object2).append(i92$a_0);
                    ((StringBuilder)object2).append(". Not all arguments were provided. Missing ");
                    h30_0.b((StringBuilder)object2, n15, " int arguments (", (String)object, ") and ");
                    i30_0.a((StringBuilder)object2, n18, " object arguments (", string2, ").");
                    throw null;
                }
            }
            return;
        }
        p30_0.c("Tried to seek backward");
        throw null;
    }

    public final void i() {
        Object object = this.a.F;
        int n3 = ((k73)object).c;
        if (n3 > 0) {
            int[] nArray;
            n3 = ((k73)object).i;
            Object object2 = this.d;
            int n4 = ((fj1)object2).b;
            int n7 = 1;
            if (n4 > 0) {
                nArray = ((fj1)object2).a;
                n4 -= n7;
                n4 = nArray[n4];
            } else {
                n4 = -2;
            }
            if (n4 != n3) {
                Object object3;
                Object object4;
                n4 = (int)(this.c ? 1 : 0);
                int n8 = 0;
                nArray = null;
                if (n4 == 0 && (n4 = (int)(this.e ? 1 : 0)) != 0) {
                    this.h(false);
                    object4 = this.b;
                    object4.getClass();
                    object3 = I92$m.c;
                    object4 = ((zr_1)object4).a;
                    ((R92)object4).W((I92)object3);
                    this.c = n7;
                }
                if (n3 > 0) {
                    object = ((k73)object).a(n3);
                    ((fj1)object2).b(n3);
                    this.h(false);
                    Object object5 = this.b;
                    object5.getClass();
                    object2 = I92$l.c;
                    object5 = ((zr_1)object5).a;
                    ((R92)object5).X((I92)object2);
                    R92$b.b((R92)object5, 0, object);
                    int n10 = ((R92)object5).g;
                    n4 = ((I92)object2).a;
                    int n14 = R92.Q((R92)object5, n4);
                    int n15 = ((I92)object2).b;
                    if (n10 == n14 && (n10 = ((R92)object5).h) == (n14 = R92.Q((R92)object5, n15))) {
                        this.c = n7;
                    } else {
                        int n16;
                        int n17;
                        String string2;
                        object = new StringBuilder();
                        n14 = 0;
                        object3 = null;
                        int n18 = 0;
                        while (true) {
                            string2 = ", ";
                            if (n14 >= n4) break;
                            n17 = n7 << n14;
                            n16 = ((R92)object5).g;
                            if ((n17 &= n16) != 0) {
                                if (n18 > 0) {
                                    ((StringBuilder)object).append(string2);
                                }
                                string2 = ((I92)object2).b(n14);
                                ((StringBuilder)object).append(string2);
                                ++n18;
                            }
                            ++n14;
                        }
                        object = ((StringBuilder)object).toString();
                        object4 = "StringBuilder().apply(builderAction).toString()";
                        object3 = g30.b((String)object, (String)object4);
                        n17 = 0;
                        while (n8 < n15) {
                            n16 = n7 << n8;
                            int n19 = ((R92)object5).h;
                            if ((n16 &= n19) != 0) {
                                if (n18 > 0) {
                                    ((StringBuilder)object3).append(string2);
                                }
                                String string3 = ((I92$l)object2).c(n8);
                                ((StringBuilder)object3).append(string3);
                                ++n17;
                            }
                            ++n8;
                        }
                        object5 = ((StringBuilder)object3).toString();
                        Intrinsics.checkNotNullExpressionValue(object5, (String)object4);
                        object4 = new StringBuilder("Error while pushing ");
                        ((StringBuilder)object4).append(object2);
                        ((StringBuilder)object4).append(". Not all arguments were provided. Missing ");
                        h30_0.b((StringBuilder)object4, n18, " int arguments (", (String)object, ") and ");
                        i30_0.a((StringBuilder)object4, n17, " object arguments (", (String)object5, ").");
                        throw null;
                    }
                }
            }
        }
    }

    public final void j(int n3, int n4) {
        if (n4 > 0) {
            int n7 = n3 >= 0 ? 1 : 0;
            if (n7 != 0) {
                n7 = this.i;
                if (n7 == n3) {
                    this.l = n3 = this.l + n4;
                } else {
                    this.g();
                    this.i = n3;
                    this.l = n4;
                }
            } else {
                StringBuilder stringBuilder = new StringBuilder("Invalid remove index ");
                stringBuilder.append(n3);
                p30_0.c(stringBuilder.toString());
                throw null;
            }
        }
    }
}

