/*
 * Decompiled with CFR 0.152.
 */
public final class Xx0 {
    public final dn2 a;
    public int b;
    public int c;
    public int d;
    public int e;

    public Xx0(Sl object, long l2) {
        int n3;
        int n4;
        Object object2;
        String string2 = ((Sl)object).a;
        ((dn2)object2).a = string2;
        ((dn2)object2).c = n4 = -1;
        ((dn2)object2).d = n4;
        this.a = object2;
        this.b = n3 = mm3.e(l2);
        this.c = n3 = mm3.d(l2);
        this.d = n4;
        this.e = n4;
        n3 = mm3.e(l2);
        int n7 = mm3.d(l2);
        CharSequence charSequence = ") offset is outside of text region ";
        object = ((Sl)object).a;
        if (n3 >= 0 && n3 <= (n4 = ((String)object).length())) {
            if (n7 >= 0 && n7 <= (n4 = ((String)object).length())) {
                if (n3 <= n7) {
                    return;
                }
                String string3 = D70.b(n3, n7, "Do not set reversed range: ", " > ");
                object = new IllegalArgumentException(string3);
                throw object;
            }
            StringBuilder stringBuilder = wk0_0.a(n7, "end (", (String)charSequence);
            int n8 = ((String)object).length();
            stringBuilder.append(n8);
            object = stringBuilder.toString();
            object2 = new IndexOutOfBoundsException((String)object);
            throw object2;
        }
        charSequence = wk0_0.a(n3, "start (", (String)charSequence);
        int n10 = ((String)object).length();
        ((StringBuilder)charSequence).append(n10);
        object = ((StringBuilder)charSequence).toString();
        IndexOutOfBoundsException indexOutOfBoundsException = new IndexOutOfBoundsException((String)object);
        throw indexOutOfBoundsException;
    }

    public final void a(int n3, int n4) {
        long l2 = nm3.a(n3, n4);
        dn2 dn22 = this.a;
        String string2 = "";
        dn22.b(n3, n4, string2);
        n3 = this.b;
        n4 = this.c;
        long l3 = tp1_0.f(nm3.a(n3, n4), l2);
        int n7 = mm3.e(l3);
        this.h(n7);
        n3 = mm3.d(l3);
        this.g(n3);
        n3 = this.d;
        n4 = -1;
        if (n3 != n4) {
            n7 = this.e;
            long l4 = nm3.a(n3, n7);
            l2 = tp1_0.f(l4, l2);
            if ((n3 = (int)(mm3.b(l2) ? 1 : 0)) != 0) {
                this.d = n4;
                this.e = n4;
            } else {
                this.d = n3 = mm3.e(l2);
                this.e = n3 = mm3.d(l2);
            }
        }
    }

    public final char b(int object) {
        Object object2 = this.a;
        Object object3 = ((dn2)object2).b;
        if (object3 == null) {
            object2 = ((dn2)object2).a;
            object = ((String)object2).charAt((int)object);
        } else {
            int n3 = ((dn2)object2).c;
            if (object < n3) {
                object2 = ((dn2)object2).a;
                object = ((String)object2).charAt((int)object);
            } else {
                n3 = ((HY0)object3).a;
                int n4 = ((HY0)object3).a();
                int n7 = (n3 -= n4) + (n4 = ((dn2)object2).c);
                if (object < n7) {
                    int n8 = ((HY0)object3).c;
                    if ((object -= n4) < n8) {
                        object2 = ((HY0)object3).b;
                        object = object2[object];
                    } else {
                        char[] cArray = ((HY0)object3).b;
                        object -= n8;
                        n8 = ((HY0)object3).d;
                        object += n8;
                        object = cArray[object];
                    }
                } else {
                    object3 = ((dn2)object2).a;
                    int n10 = ((dn2)object2).d;
                    n3 = n3 - n10 + n4;
                    object -= n3;
                    object = ((String)object3).charAt((int)object);
                }
            }
        }
        return (char)object;
    }

    public final mm3 c() {
        mm3 mm32;
        int n3 = this.d;
        int n4 = -1;
        if (n3 != n4) {
            n4 = this.e;
            long l2 = nm3.a(n3, n4);
            mm32 = new mm3(l2);
        } else {
            mm32 = null;
        }
        return mm32;
    }

    public final void d(int n3, int n4, String object) {
        int n7;
        String string2 = ") offset is outside of text region ";
        dn2 dn22 = this.a;
        if (n3 >= 0 && n3 <= (n7 = dn22.a())) {
            if (n4 >= 0 && n4 <= (n7 = dn22.a())) {
                if (n3 <= n4) {
                    dn22.b(n3, n4, (String)object);
                    n4 = ((String)object).length() + n3;
                    this.h(n4);
                    n4 = ((String)object).length() + n3;
                    this.g(n4);
                    this.d = n3 = -1;
                    this.e = n3;
                    return;
                }
                String string3 = D70.b(n3, n4, "Do not set reversed range: ", " > ");
                object = new IllegalArgumentException(string3);
                throw object;
            }
            CharSequence charSequence = wk0_0.a(n4, "end (", string2);
            int n8 = dn22.a();
            charSequence.append(n8);
            charSequence = charSequence.toString();
            IndexOutOfBoundsException indexOutOfBoundsException = new IndexOutOfBoundsException((String)charSequence);
            throw indexOutOfBoundsException;
        }
        CharSequence charSequence = wk0_0.a(n3, "start (", string2);
        int n10 = dn22.a();
        charSequence.append(n10);
        charSequence = charSequence.toString();
        IndexOutOfBoundsException indexOutOfBoundsException = new IndexOutOfBoundsException((String)charSequence);
        throw indexOutOfBoundsException;
    }

    public final void e(int n3, int n4) {
        int n7;
        Object object = ") offset is outside of text region ";
        dn2 dn22 = this.a;
        if (n3 >= 0 && n3 <= (n7 = dn22.a())) {
            if (n4 >= 0 && n4 <= (n7 = dn22.a())) {
                if (n3 < n4) {
                    this.d = n3;
                    this.e = n4;
                    return;
                }
                String string2 = D70.b(n3, n4, "Do not set reversed or empty range: ", " > ");
                object = new IllegalArgumentException(string2);
                throw object;
            }
            CharSequence charSequence = wk0_0.a(n4, "end (", (String)object);
            int n8 = dn22.a();
            charSequence.append(n8);
            charSequence = charSequence.toString();
            IndexOutOfBoundsException indexOutOfBoundsException = new IndexOutOfBoundsException((String)charSequence);
            throw indexOutOfBoundsException;
        }
        CharSequence charSequence = wk0_0.a(n3, "start (", (String)object);
        int n10 = dn22.a();
        charSequence.append(n10);
        charSequence = charSequence.toString();
        IndexOutOfBoundsException indexOutOfBoundsException = new IndexOutOfBoundsException((String)charSequence);
        throw indexOutOfBoundsException;
    }

    public final void f(int n3, int n4) {
        int n7;
        Object object = ") offset is outside of text region ";
        dn2 dn22 = this.a;
        if (n3 >= 0 && n3 <= (n7 = dn22.a())) {
            if (n4 >= 0 && n4 <= (n7 = dn22.a())) {
                if (n3 <= n4) {
                    this.h(n3);
                    this.g(n4);
                    return;
                }
                String string2 = D70.b(n3, n4, "Do not set reversed range: ", " > ");
                object = new IllegalArgumentException(string2);
                throw object;
            }
            CharSequence charSequence = wk0_0.a(n4, "end (", (String)object);
            int n8 = dn22.a();
            charSequence.append(n8);
            charSequence = charSequence.toString();
            IndexOutOfBoundsException indexOutOfBoundsException = new IndexOutOfBoundsException((String)charSequence);
            throw indexOutOfBoundsException;
        }
        CharSequence charSequence = wk0_0.a(n3, "start (", (String)object);
        int n10 = dn22.a();
        charSequence.append(n10);
        charSequence = charSequence.toString();
        IndexOutOfBoundsException indexOutOfBoundsException = new IndexOutOfBoundsException((String)charSequence);
        throw indexOutOfBoundsException;
    }

    public final void g(int n3) {
        if (n3 >= 0) {
            this.c = n3;
            return;
        }
        String string2 = hj0_0.a(n3, "Cannot set selectionEnd to a negative value: ");
        string2 = string2.toString();
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException(string2);
        throw illegalArgumentException;
    }

    public final void h(int n3) {
        if (n3 >= 0) {
            this.b = n3;
            return;
        }
        String string2 = hj0_0.a(n3, "Cannot set selectionStart to a negative value: ");
        string2 = string2.toString();
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException(string2);
        throw illegalArgumentException;
    }

    public final String toString() {
        return this.a.toString();
    }
}

