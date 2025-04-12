/*
 * Decompiled with CFR 0.152.
 */
import java.io.Serializable;
import java.util.ArrayList;
import kotlin.ranges.f;

public final class Sl$a
implements Appendable {
    public final StringBuilder a;
    public final ArrayList b;
    public final ArrayList c;
    public final ArrayList d;
    public final ArrayList e;

    public Sl$a() {
        Serializable serializable;
        this.a = serializable = new StringBuilder(16);
        this.b = serializable;
        super();
        this.c = serializable;
        super();
        this.d = serializable;
        super();
        this.e = serializable;
    }

    public Sl$a(Sl sl) {
        this();
        this.b(sl);
    }

    public final void a(S93 s93, int n3, int n4) {
        ArrayList arrayList = this.b;
        Sl$a$a sl$a$a = new Sl$a$a(s93, n3, n4, null, 8);
        arrayList.add(sl$a$a);
    }

    public final Appendable append(char c2) {
        this.a.append(c2);
        return this;
    }

    public final Appendable append(CharSequence charSequence) {
        boolean bl2 = charSequence instanceof Sl;
        if (bl2) {
            charSequence = (Sl)charSequence;
            this.b((Sl)charSequence);
        } else {
            StringBuilder stringBuilder = this.a;
            stringBuilder.append(charSequence);
        }
        return this;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final Appendable append(CharSequence charSequence, int n3, int n4) {
        Sl$a sl$a = this;
        ArrayList<Object> arrayList = charSequence;
        int n7 = n3;
        int n8 = n4;
        int n10 = charSequence instanceof Sl;
        ArrayList<Object> arrayList2 = this.a;
        if (n10 != 0) {
            int n14;
            int n15;
            Object object;
            Object object2;
            Object object3;
            Object object4;
            int n16;
            int n17;
            int n18;
            Object object5;
            Object object6;
            int n19;
            Object object7;
            int n20;
            arrayList = (Sl)charSequence;
            n10 = ((StringBuilder)((Object)arrayList2)).length();
            String string2 = ((Sl)((Object)arrayList)).a;
            ((StringBuilder)((Object)arrayList2)).append(string2, n3, n4);
            arrayList2 = Tl.b((Sl)((Object)arrayList), n3, n4);
            int n21 = 0;
            string2 = null;
            if (arrayList2 != null) {
                n20 = arrayList2.size();
                object7 = null;
                for (n19 = 0; n19 < n20; ++n19) {
                    object6 = (Sl$b)arrayList2.get(n19);
                    object5 = (S93)((Sl$b)object6).a;
                    n18 = ((Sl$b)object6).b + n10;
                    n17 = ((Sl$b)object6).c + n10;
                    sl$a.a((S93)object5, n18, n17);
                }
            }
            int n22 = 0;
            arrayList2 = null;
            Object object8 = ((Sl)((Object)arrayList)).a;
            if (n7 == n8 || (object7 = ((Sl)((Object)arrayList)).c) == null) {
                n19 = 0;
                object7 = null;
            } else if (n7 != 0 || n8 < (n17 = ((String)object8).length())) {
                n16 = object7.size();
                object6 = new ArrayList(n16);
                n16 = object7.size();
                object4 = null;
                for (n18 = 0; n18 < n16; ++n18) {
                    object2 = object3 = object7.get(n18);
                    object2 = (Sl$b)object3;
                    int n24 = ((Sl$b)object2).b;
                    int n25 = ((Sl$b)object2).c;
                    if ((n25 = (int)(Tl.c(n7, n8, n24, n25) ? 1 : 0)) == 0) continue;
                    ((ArrayList)object6).add(object3);
                }
                n16 = ((ArrayList)object6).size();
                object7 = new ArrayList(n16);
                n16 = ((ArrayList)object6).size();
                object4 = null;
                for (n18 = 0; n18 < n16; ++n18) {
                    object3 = (Sl$b)((ArrayList)object6).get(n18);
                    object = ((Sl$b)object3).a;
                    n15 = f.g(((Sl$b)object3).b, n7, n8) - n7;
                    n14 = f.g(((Sl$b)object3).c, n7, n8) - n7;
                    object2 = new Sl$b(n15, n14, object);
                    ((ArrayList)object7).add(object2);
                }
            }
            if (object7 != null) {
                n17 = object7.size();
                object5 = null;
                for (n16 = 0; n16 < n17; ++n16) {
                    object4 = (Sl$b)object7.get(n16);
                    object = object3 = ((Sl$b)object4).a;
                    object = (ym2_0)object3;
                    n14 = ((Sl$b)object4).b;
                    n15 = n10 + n14;
                    n18 = ((Sl$b)object4).c;
                    int n26 = n10 + n18;
                    object4 = sl$a.c;
                    int n27 = 8;
                    object2 = object3;
                    object3 = new Sl$a$a(object, n15, n26, null, n27);
                    ((ArrayList)object4).add(object3);
                }
            }
            if (n7 != n8 && (arrayList = ((Sl)((Object)arrayList)).d) != null) {
                if (n7 != 0 || n8 < (n22 = ((String)object8).length())) {
                    n20 = arrayList.size();
                    arrayList2 = new ArrayList<Object>(n20);
                    n20 = arrayList.size();
                    object7 = null;
                    for (n19 = 0; n19 < n20; ++n19) {
                        object5 = object6 = arrayList.get(n19);
                        object5 = (Sl$b)object6;
                        n18 = ((Sl$b)object5).b;
                        n16 = ((Sl$b)object5).c;
                        if ((n16 = (int)(Tl.c(n7, n8, n18, n16) ? 1 : 0)) == 0) continue;
                        arrayList2.add(object6);
                    }
                    n20 = arrayList2.size();
                    arrayList = new ArrayList<Object>(n20);
                    n20 = arrayList2.size();
                    object7 = null;
                    for (n19 = 0; n19 < n20; ++n19) {
                        object6 = (Sl$b)arrayList2.get(n19);
                        object5 = ((Sl$b)object6).d;
                        n18 = f.g(((Sl$b)object6).b, n7, n8) - n7;
                        n14 = f.g(((Sl$b)object6).c, n7, n8) - n7;
                        object6 = ((Sl$b)object6).a;
                        object2 = new Sl$b(object6, (String)object5, n18, n14);
                        arrayList.add(object2);
                    }
                }
                arrayList2 = arrayList;
            }
            if (arrayList2 == null) return sl$a;
            int n28 = arrayList2.size();
            while (n21 < n28) {
                Object object9 = (Sl$b)arrayList2.get(n21);
                ArrayList arrayList3 = sl$a.d;
                object7 = ((Sl$b)object9).a;
                n17 = ((Sl$b)object9).b + n10;
                n16 = ((Sl$b)object9).c + n10;
                object9 = ((Sl$b)object9).d;
                object8 = new Sl$a$a(object7, (String)object9, n17, n16);
                arrayList3.add(object8);
                ++n21;
            }
            return sl$a;
        }
        ((StringBuilder)((Object)arrayList2)).append(charSequence, n3, n4);
        return sl$a;
    }

    public final void b(Sl object) {
        int n3;
        int n4;
        Object object2;
        Object object3;
        int n7;
        ArrayList arrayList;
        int n8;
        StringBuilder stringBuilder = this.a;
        int n10 = stringBuilder.length();
        Object object4 = ((Sl)object).a;
        stringBuilder.append((String)object4);
        int n14 = 0;
        stringBuilder = null;
        object4 = ((Sl)object).b;
        if (object4 != null) {
            n8 = object4.size();
            arrayList = null;
            for (n7 = 0; n7 < n8; ++n7) {
                object3 = (Sl$b)object4.get(n7);
                object2 = (S93)((Sl$b)object3).a;
                n4 = ((Sl$b)object3).b + n10;
                n3 = ((Sl$b)object3).c + n10;
                this.a((S93)object2, n4, n3);
            }
        }
        if ((object4 = ((Sl)object).c) != null) {
            n8 = object4.size();
            arrayList = null;
            for (n7 = 0; n7 < n8; ++n7) {
                object3 = (Sl$b)object4.get(n7);
                Object object5 = object2 = ((Sl$b)object3).a;
                object5 = (ym2_0)object2;
                int n15 = ((Sl$b)object3).b;
                int n16 = n10 + n15;
                n3 = ((Sl$b)object3).c;
                int n17 = n10 + n3;
                object3 = this.c;
                int n18 = 8;
                object2 = new Sl$a$a(object5, n16, n17, null, n18);
                ((ArrayList)object3).add(object2);
            }
        }
        if ((object = ((Sl)object).d) != null) {
            int n19 = object.size();
            while (n14 < n19) {
                Object object6 = (Sl$b)object.get(n14);
                arrayList = this.d;
                object2 = ((Sl$b)object6).a;
                n4 = ((Sl$b)object6).b + n10;
                int n20 = ((Sl$b)object6).c + n10;
                object6 = ((Sl$b)object6).d;
                object3 = new Sl$a$a(object2, (String)object6, n4, n20);
                arrayList.add(object3);
                ++n14;
            }
        }
    }

    public final void c(String string2) {
        this.a.append(string2);
    }

    public final void d() {
        Object object = this.e;
        int n3 = ((ArrayList)object).isEmpty() ^ 1;
        if (n3 != 0) {
            n3 = ((ArrayList)object).size() + -1;
            object = (Sl$a$a)((ArrayList)object).remove(n3);
            ((Sl$a$a)object).c = n3 = this.a.length();
            return;
        }
        String string2 = "Nothing to pop.".toString();
        object = new IllegalStateException(string2);
        throw object;
    }

    public final void e(int n3) {
        Serializable serializable = this.e;
        int n4 = serializable.size();
        if (n3 < n4) {
            while ((n4 = serializable.size() + -1) >= n3) {
                this.d();
            }
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(n3);
        stringBuilder.append(" should be less than ");
        n3 = serializable.size();
        stringBuilder.append(n3);
        String string2 = stringBuilder.toString();
        string2 = string2.toString();
        serializable = new IllegalStateException(string2);
        throw serializable;
    }

    public final void f(String object, String string2) {
        int n3 = this.a.length();
        Sl$a$a sl$a$a = new Sl$a$a(string2, n3, 0, (String)object, 4);
        object = this.e;
        ((ArrayList)object).add(sl$a$a);
        this.d.add(sl$a$a);
        ((ArrayList)object).size();
    }

    public final int g(S93 object) {
        int n3 = this.a.length();
        Sl$a$a sl$a$a = new Sl$a$a(object, n3, 0, null, 12);
        object = this.e;
        ((ArrayList)object).add(sl$a$a);
        this.b.add(sl$a$a);
        return ((ArrayList)object).size() + -1;
    }

    public final Sl h() {
        int n3;
        Object object;
        int n4;
        ArrayList<Object> arrayList;
        int n7;
        CharSequence charSequence = this.a;
        String string2 = charSequence.toString();
        ArrayList arrayList2 = this.b;
        int n8 = arrayList2.size();
        ArrayList<ArrayList<Object>> arrayList3 = new ArrayList<ArrayList<Object>>(n8);
        n8 = arrayList2.size();
        int n10 = 0;
        ArrayList<Object> arrayList4 = null;
        for (n7 = 0; n7 < n8; ++n7) {
            arrayList = (Sl$a$a)arrayList2.get(n7);
            n4 = charSequence.length();
            arrayList = ((Sl$a$a)((Object)arrayList)).a(n4);
            arrayList3.add(arrayList);
        }
        boolean bl2 = arrayList3.isEmpty();
        n8 = 0;
        ArrayList<Object> arrayList5 = null;
        if (bl2) {
            arrayList3 = null;
        }
        arrayList2 = this.c;
        int n14 = arrayList2.size();
        arrayList4 = new ArrayList<Object>(n14);
        n14 = arrayList2.size();
        for (n4 = 0; n4 < n14; ++n4) {
            object = (Sl$a$a)arrayList2.get(n4);
            n3 = charSequence.length();
            object = ((Sl$a$a)object).a(n3);
            arrayList4.add(object);
        }
        bl2 = arrayList4.isEmpty();
        if (bl2) {
            n7 = 0;
            arrayList4 = null;
        }
        arrayList2 = this.d;
        n4 = arrayList2.size();
        arrayList = new ArrayList<Object>(n4);
        n4 = arrayList2.size();
        while (n10 < n4) {
            object = (Sl$a$a)arrayList2.get(n10);
            n3 = charSequence.length();
            object = ((Sl$a$a)object).a(n3);
            arrayList.add(object);
            ++n10;
        }
        boolean bl3 = arrayList.isEmpty();
        if (!bl3) {
            arrayList5 = arrayList;
        }
        charSequence = new Sl(string2, arrayList3, arrayList4, arrayList5);
        return charSequence;
    }
}

