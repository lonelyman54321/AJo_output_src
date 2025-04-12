/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from pr1
 */
public final class pr1_0 {
    public final eq1_1 a;
    public final ArrayList b;
    public int c;
    public int d;
    public int e;
    public int f;
    public final ArrayList g;
    public List h;
    public int i;

    public pr1_0(eq1_1 list) {
        this.a = list;
        list = new List<pr1$a>();
        pr1$a pr1$a = new pr1$a(0, 0);
        list.add(pr1$a);
        this.b = list;
        this.f = -1;
        this.g = list = new List<pr1$a>();
        this.h = list = mz0_2.a;
    }

    public final int a() {
        double d2 = (double)this.d() * 1.0;
        double d5 = this.i;
        return (int)Math.sqrt(d2 / d5) + 1;
    }

    public final pr1$c b(int n3) {
        Object object;
        int n4;
        ArrayList arrayList;
        int n7;
        int n8;
        int n10;
        int n14;
        ArrayList arrayList2;
        int n15;
        int n16;
        Object object2;
        block24: {
            block23: {
                object2 = this.a;
                n16 = ((eq1_1)object2).c;
                n15 = 1;
                int n17 = 0;
                if (n16 == 0) {
                    ArrayList<J11> arrayList3;
                    n16 = this.i;
                    int n18 = this.d() - (n3 *= n16);
                    if (n16 > n18) {
                        n16 = n18;
                    }
                    if (n16 < 0) {
                        n16 = 0;
                        object2 = null;
                    }
                    if (n16 == (n18 = (arrayList3 = this.h).size())) {
                        object2 = this.h;
                    } else {
                        arrayList3 = new ArrayList<J11>(n16);
                        while (n17 < n16) {
                            long l2 = or1_1.a(n15);
                            J11 j11 = new J11(l2);
                            arrayList3.add(j11);
                            ++n17;
                        }
                        this.h = arrayList3;
                        object2 = arrayList3;
                    }
                    pr1$c pr1$c = new pr1$c(n3, (List)object2);
                    return pr1$c;
                }
                n16 = this.a();
                n16 = n3 / n16;
                arrayList2 = this.b;
                n14 = arrayList2.size() - n15;
                n16 = Math.min(n16, n14);
                n14 = this.a() * n16;
                pr1$a pr1$a = (pr1$a)arrayList2.get(n16);
                n10 = pr1$a.a;
                pr1$a pr1$a2 = (pr1$a)arrayList2.get(n16);
                n8 = pr1$a2.b;
                n7 = this.c;
                arrayList = this.g;
                if (n14 <= n7 && n7 <= n3) {
                    n10 = this.d;
                    n8 = this.e;
                    n14 = n7;
                } else {
                    n7 = this.f;
                    if (n16 == n7 && (n7 = n3 - n14) < (n4 = arrayList.size())) {
                        object = (Number)arrayList.get(n7);
                        n10 = ((Number)object).intValue();
                        n14 = n3;
                        n8 = 0;
                        pr1$a2 = null;
                    }
                }
                n7 = this.a();
                n7 = n14 % n7;
                if (n7 != 0) break block23;
                n7 = this.a();
                int n19 = 2;
                n4 = n3 - n14;
                if (n19 <= n4 && n4 < n7) break block24;
            }
            n15 = 0;
        }
        if (n15 != 0) {
            this.f = n16;
            arrayList.clear();
        }
        if (n14 <= n3) {
            int n20;
            int n21;
            while (n14 < n3 && n10 < (n16 = this.d())) {
                if (n15 != 0) {
                    object2 = n10;
                    arrayList.add(object2);
                }
                n16 = 0;
                object2 = null;
                while (n16 < (n7 = this.i) && n10 < (n7 = this.d())) {
                    if (n8 == 0) {
                        n21 = this.e(n10);
                        n7 = n8;
                        n8 = n21;
                    } else {
                        n7 = 0;
                        Object var11_14 = null;
                    }
                    n4 = this.i;
                    if ((n16 += n8) > n4) break;
                    ++n10;
                    n8 = n7;
                }
                n16 = this.a();
                if ((n16 = ++n14 % n16) != 0 || n10 >= (n16 = this.d())) continue;
                n16 = this.a();
                n16 = n14 / n16;
                n7 = arrayList2.size();
                if (n7 == n16) {
                    object2 = new pr1$a(n10, n8);
                    arrayList2.add(object2);
                    continue;
                }
                object2 = "invalid starting point".toString();
                IllegalStateException illegalStateException = new IllegalStateException((String)object2);
                throw illegalStateException;
            }
            this.c = n3;
            this.d = n10;
            this.e = n8;
            ArrayList<Object> arrayList4 = new ArrayList<Object>();
            n16 = 0;
            object2 = null;
            for (n15 = n10; n16 < (n20 = this.i) && n15 < (n20 = this.d()); ++n15) {
                if (n8 == 0) {
                    n20 = this.e(n15);
                    n21 = n8;
                    n8 = n20;
                    n20 = n21;
                } else {
                    n20 = 0;
                    arrayList2 = null;
                }
                n14 = this.i;
                if ((n16 += n8) > n14) break;
                long l3 = or1_1.a(n8);
                object = new J11(l3);
                arrayList4.add(object);
                n8 = n20;
            }
            object2 = new pr1$c(n10, arrayList4);
            return object2;
        }
        object2 = "currentLine > lineIndex".toString();
        IllegalStateException illegalStateException = new IllegalStateException((String)object2);
        throw illegalStateException;
    }

    public final int c(int n3) {
        int n4 = this.d();
        if (n4 <= 0) {
            return 0;
        }
        n4 = this.d();
        if (n3 < n4) {
            int n7;
            int n8;
            Object object;
            int n10;
            int n14;
            int n15;
            Object object2;
            block17: {
                object2 = this.a;
                n4 = (int)(((eq1_1)object2).c ? 1 : 0);
                if (n4 == 0) {
                    n4 = this.i;
                    return n3 / n4;
                }
                object2 = this.b;
                pr1$d pr1$d = new pr1$d(n3);
                n15 = ((ArrayList)object2).size();
                Intrinsics.checkNotNullParameter(object2, "<this>");
                String string2 = "comparison";
                Intrinsics.checkNotNullParameter(pr1$d, string2);
                xx_2.l(((ArrayList)object2).size(), 0, n15);
                int n16 = 1;
                n15 -= n16;
                n14 = 0;
                while (n14 <= n15) {
                    n10 = n14 + n15 >>> n16;
                    object = ((ArrayList)object2).get(n10);
                    n8 = ((Number)(object = (Number)pr1$d.invoke(object))).intValue();
                    if (n8 < 0) {
                        n14 = n10 + 1;
                        continue;
                    }
                    if (n8 > 0) {
                        n15 = n10 + -1;
                        continue;
                    }
                    break block17;
                }
                n10 = -(n14 += n16);
            }
            if (n10 < 0) {
                n7 = -n10;
                n10 = n7 + -2;
            }
            n7 = this.a() * n10;
            pr1$a pr1$a = (pr1$a)((ArrayList)object2).get(n10);
            n15 = pr1$a.a;
            if (n15 <= n3) {
                n14 = 0;
                while (n15 < n3) {
                    n10 = n15 + 1;
                    if ((n14 += (n15 = this.e(n15))) >= (n8 = this.i)) {
                        if (n14 == n8) {
                            ++n7;
                            n14 = 0;
                        } else {
                            ++n7;
                            n14 = n15;
                        }
                    }
                    n15 = this.a();
                    if ((n15 = n7 % n15) == 0) {
                        n15 = this.a();
                        n8 = ((ArrayList)object2).size();
                        if ((n15 = n7 / n15) >= n8) {
                            if (n14 > 0) {
                                n8 = 1;
                            } else {
                                n8 = 0;
                                object = null;
                            }
                            n8 = n10 - n8;
                            pr1$a = new pr1$a(n8, 0);
                            ((ArrayList)object2).add(pr1$a);
                        }
                    }
                    n15 = n10;
                }
                if ((n3 = this.e(n3) + n14) > (n4 = this.i)) {
                    ++n7;
                }
                return n7;
            }
            object2 = "currentItemIndex > itemIndex".toString();
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException((String)object2);
            throw illegalArgumentException;
        }
        String string3 = "ItemIndex > total count".toString();
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException(string3);
        throw illegalArgumentException;
    }

    public final int d() {
        return this.a.b.b;
    }

    public final int e(int n3) {
        pr1$b pr1$b = pr1$b.a;
        pr1$b.b = this.i;
        Object object = this.a.b.d(n3);
        int n4 = ((Nj1)object).a;
        object = ((dq1_1)((Nj1)object).c).b;
        Integer n7 = n3 -= n4;
        return (int)((J11)object.invoke((Object)pr1$b, (Object)n7)).a;
    }
}

