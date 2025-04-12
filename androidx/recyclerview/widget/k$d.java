/*
 * Decompiled with CFR 0.152.
 */
package androidx.recyclerview.widget;

import androidx.recyclerview.widget.k$b;
import androidx.recyclerview.widget.k$c;
import androidx.recyclerview.widget.k$f;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class k$d {
    public final List a;
    public final int[] b;
    public final int[] c;
    public final k$b d;
    public final int e;
    public final int f;
    public final boolean g;

    public k$d(k$b iterator, ArrayList arrayList, int[] object, int[] object2) {
        Object object3;
        int n3;
        int n4;
        int n7;
        k$b k$b;
        int[] nArray;
        int n8;
        Object object4;
        boolean bl2;
        int n10;
        int n14;
        this.a = arrayList;
        this.b = object;
        this.c = object2;
        Arrays.fill(object, 0);
        Arrays.fill(object2, 0);
        this.d = iterator;
        this.e = n14 = ((k$b)((Object)iterator)).e();
        this.f = n10 = ((k$b)((Object)iterator)).d();
        this.g = bl2 = true;
        int n15 = arrayList.isEmpty();
        if (n15 != 0) {
            n15 = 0;
            object4 = null;
        } else {
            object4 = (k$c)arrayList.get(0);
        }
        if (object4 == null || (n8 = ((k$c)object4).a) != 0 || (n15 = ((k$c)object4).b) != 0) {
            object4 = new k$c(0, 0, 0);
            arrayList.add(0, object4);
        }
        object4 = new k$c(n14, n10, 0);
        arrayList.add(object4);
        iterator = arrayList.iterator();
        block0: while (true) {
            n14 = (int)(iterator.hasNext() ? 1 : 0);
            object4 = this.c;
            nArray = this.b;
            k$b = this.d;
            if (n14 == 0) break;
            object = (k$c)iterator.next();
            n7 = 0;
            while (true) {
                if (n7 >= (n4 = object.c)) continue block0;
                n4 = object.a + n7;
                n3 = object.b + n7;
                int n16 = k$b.a(n4, n3);
                n16 = n16 != 0 ? 1 : 2;
                nArray[n4] = object3 = n3 << 4 | n16;
                n4 = n4 << 4 | n16;
                object4[n3] = n4;
                ++n7;
            }
            break;
        }
        n10 = (int)(this.g ? 1 : 0);
        if (n10 != 0) {
            iterator = arrayList.iterator();
            n14 = 0;
            object = null;
            while (bl2 = iterator.hasNext()) {
                object2 = (k$c)iterator.next();
                while (n14 < (n7 = object2.a)) {
                    n7 = nArray[n14];
                    if (n7 == 0) {
                        n7 = arrayList.size();
                        n3 = 0;
                        block4: for (n4 = 0; n4 < n7; ++n4) {
                            k$c k$c = (k$c)arrayList.get(n4);
                            while (n3 < (object3 = k$c.b)) {
                                object3 = object4[n3];
                                if (object3 == 0 && (object3 = (Object)k$b.b(n14, n3)) != 0) {
                                    n7 = (int)(k$b.a(n14, n3) ? 1 : 0);
                                    n7 = n7 != 0 ? 8 : 4;
                                    nArray[n14] = n4 = n3 << 4 | n7;
                                    n4 = n14 << 4;
                                    object4[n3] = n7 |= n4;
                                    break block4;
                                }
                                ++n3;
                            }
                            n3 = k$c.c + object3;
                        }
                    }
                    ++n14;
                }
                n14 = object2.c + n7;
            }
        }
    }

    public static k$f c(ArrayDeque object, int n3, boolean n4) {
        int n7;
        k$f k$f;
        block3: {
            boolean bl2;
            object = ((ArrayDeque)object).iterator();
            while (bl2 = object.hasNext()) {
                k$f = (k$f)object.next();
                n7 = k$f.a;
                if (n7 != n3 || (n7 = (int)(k$f.c ? 1 : 0)) != n4) continue;
                object.remove();
                break block3;
            }
            bl2 = false;
            k$f = null;
        }
        while ((n3 = (int)(object.hasNext() ? 1 : 0)) != 0) {
            k$f k$f2 = (k$f)object.next();
            if (n4 != 0) {
                k$f2.b = n7 = k$f2.b + -1;
                continue;
            }
            k$f2.b = n7 = k$f2.b + 1;
        }
        return k$f;
    }

    public final int a(int n3) {
        int n4 = this.e;
        if (n3 >= 0 && n3 < n4) {
            int[] nArray = this.b;
            n4 = (n3 = nArray[n3]) & 0xF;
            if (n4 == 0) {
                return -1;
            }
            return n3 >> 4;
        }
        String string2 = D70.b(n3, n4, "Index out of bounds - passed position = ", ", old list size = ");
        IndexOutOfBoundsException indexOutOfBoundsException = new IndexOutOfBoundsException(string2);
        throw indexOutOfBoundsException;
    }

    public final void b(iv1_0 iv1_02) {
        ArrayDeque<Object> arrayDeque;
        Object object = this;
        Object object2 = iv1_02;
        boolean bl2 = iv1_02 instanceof rx_0;
        if (bl2) {
            object2 = (rx_0)iv1_02;
        } else {
            arrayDeque = new ArrayDeque<Object>(iv1_02);
            object2 = arrayDeque;
        }
        arrayDeque = new ArrayDeque<Object>();
        Object object3 = ((k$d)object).a;
        int n3 = object3.size();
        int n4 = 1;
        n3 -= n4;
        int n7 = ((k$d)object).e;
        int n8 = ((k$d)object).f;
        int n10 = n7;
        while (n3 >= 0) {
            int n14;
            int n15;
            int n16;
            int n17;
            Object object4;
            k$f k$f;
            k$b k$b;
            int[] nArray;
            k$c k$c = (k$c)object3.get(n3);
            int n18 = k$c.a;
            int n19 = k$c.c;
            n18 += n19;
            int n20 = k$c.b;
            int n21 = n20 + n19;
            while (true) {
                nArray = ((k$d)object).b;
                k$b = ((k$d)object).d;
                n4 = 0;
                k$f = null;
                if (n10 <= n18) break;
                int n22 = nArray[n10 += -1];
                int n24 = n22 & 0xC;
                if (n24 != 0) {
                    object4 = object3;
                    n17 = n22 >> 4;
                    k$f = k$d.c(arrayDeque, n17, false);
                    if (k$f != null) {
                        n4 = k$f.b;
                        n4 = n7 - n4;
                        n16 = n8;
                        n8 = 1;
                        ((rx_0)object2).d(n10, n4 -= n8);
                        if ((n22 &= 4) != 0) {
                            object3 = k$b.c(n10, n17);
                            ((rx_0)object2).c(n4, n8, object3);
                        }
                    } else {
                        n16 = n8;
                        n8 = 1;
                        n4 = n7 - n10 - n8;
                        object3 = new k$f(n10, n4, n8 != 0);
                        arrayDeque.add(object3);
                    }
                } else {
                    object4 = object3;
                    n16 = n8;
                    n8 = 1;
                    ((rx_0)object2).b(n10, n8);
                    n7 += -1;
                }
                object3 = object4;
                n8 = n16;
                n4 = 1;
            }
            object4 = object3;
            n16 = n8;
            while (n8 > n21) {
                object3 = ((k$d)object).c;
                n17 = (int)object3[n8 += -1];
                n18 = n17 & 0xC;
                if (n18 != 0) {
                    n18 = n17 >> 4;
                    n4 = 1;
                    object = k$d.c(arrayDeque, n18, n4 != 0);
                    if (object == null) {
                        n17 = n7 - n10;
                        n18 = 0;
                        object = new k$f(n8, n17, false);
                        arrayDeque.add(object);
                        n16 = 0;
                    } else {
                        n16 = 0;
                        n15 = ((k$f)object).b;
                        n15 = n7 - n15 - n4;
                        ((rx_0)object2).d(n15, n10);
                        n15 = n17 & 4;
                        if (n15 != 0) {
                            object = k$b.c(n18, n8);
                            ((rx_0)object2).c(n10, n4, object);
                        }
                    }
                } else {
                    n4 = 1;
                    n16 = 0;
                    ((rx_0)object2).a(n10, n4);
                    ++n7;
                }
                n4 = 0;
                k$f = null;
                object = this;
            }
            n16 = 0;
            n15 = n10 = k$c.a;
            n17 = n20;
            k$f = null;
            for (n4 = 0; n4 < n19; ++n4) {
                n8 = nArray[n15] & 0xF;
                n14 = 2;
                if (n8 == n14) {
                    Object object5 = k$b.c(n15, n17);
                    n14 = 1;
                    ((rx_0)object2).c(n15, n14, object5);
                } else {
                    n14 = 1;
                }
                ++n15;
                ++n17;
            }
            n14 = 1;
            n3 += -1;
            object = this;
            n8 = n20;
            object3 = object4;
            n4 = 1;
        }
        ((rx_0)object2).e();
    }
}

