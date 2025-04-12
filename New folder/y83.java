/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;

public final class y83
implements Iterable,
KMappedMarker {
    public static final y83 e;
    public final long a;
    public final long b;
    public final int c;
    public final int[] d;

    static {
        y83 y832;
        e = y832 = new y83(0L, 0L, 0, null);
    }

    public y83(long l2, long l3, int n3, int[] nArray) {
        this.a = l2;
        this.b = l3;
        this.c = n3;
        this.d = nArray;
    }

    public final y83 a(y83 y832) {
        int[] nArray;
        y83 y833 = this;
        y83 y834 = y832;
        y83 y835 = e;
        if (y832 == y835) {
            return this;
        }
        if (this == y835) {
            return y835;
        }
        int n3 = y832.c;
        int[] nArray2 = y832.d;
        long l2 = y832.b;
        long l3 = y832.a;
        int n4 = this.c;
        if (n3 == n4 && nArray2 == (nArray = this.d)) {
            long l4 = this.a;
            long l7 = l4 & (l3 ^= (long)-1);
            l4 = this.b;
            long l8 = l4 & (l2 ^= (long)-1);
            y834 = new y83(l7, l8, n4, nArray);
        } else {
            long l12;
            y83 y836;
            n3 = 0;
            y835 = null;
            if (nArray2 != null) {
                int n7 = nArray2.length;
                y836 = y833;
                for (int i3 = 0; i3 < n7; ++i3) {
                    int n8 = nArray2[i3];
                    y836 = y836.c(n8);
                }
            } else {
                y836 = y833;
            }
            long l14 = 1L;
            int n10 = 64;
            long l15 = 0L;
            int n14 = y834.c;
            n4 = (int)(l2 == l15 ? 0 : (l2 < l15 ? -1 : 1));
            if (n4 != 0) {
                for (n4 = 0; n4 < n10; ++n4) {
                    long l16 = l14 << n4 & l2;
                    long l17 = l16 - l15;
                    Object object = l17 == 0L ? 0 : (l17 < 0L ? -1 : 1);
                    if (object == false) continue;
                    int n15 = n4 + n14;
                    y836 = y836.c(n15);
                }
            }
            if ((l12 = l3 == l15 ? 0 : (l3 < l15 ? -1 : 1)) != false) {
                while (n3 < n10) {
                    l2 = l14 << n3 & l3;
                    long l18 = l2 - l15;
                    n4 = (int)(l18 == 0L ? 0 : (l18 < 0L ? -1 : 1));
                    if (n4 != 0) {
                        y83 y837;
                        l12 = n3 + 64 + n14;
                        y836 = y837 = y836.c((int)l12);
                    }
                    ++n3;
                }
            }
            y834 = y836;
        }
        return y834;
    }

    public final y83 c(int n3) {
        int[] nArray;
        int n4;
        y83 y832 = this;
        int n7 = n3;
        int n8 = this.c;
        int n10 = n3 - n8;
        long l2 = 0L;
        long l3 = 1L;
        int n14 = 64;
        if (n10 >= 0 && n10 < n14) {
            l3 = this.b;
            long l4 = l3 << n10;
            long l7 = l3 & l4;
            long l8 = l7 - l2;
            n14 = (int)(l8 == 0L ? 0 : (l8 < 0L ? -1 : 1));
            if (n14 != 0) {
                y83 y833;
                long l12 = l3 & (l4 ^= (long)-1);
                int[] nArray2 = this.d;
                long l14 = this.a;
                y83 y834 = y833;
                y833 = new y83(l14, l12, n8, nArray2);
                return y833;
            }
        } else if (n10 >= n14 && n10 < (n4 = 128)) {
            l3 = y832.a;
            long l15 = l3 << (n10 -= n14);
            long l16 = l3 & l15;
            long l17 = l16 - l2;
            if ((n14 = (int)(l17 == 0L ? 0 : (l17 < 0L ? -1 : 1))) != 0) {
                y83 y835;
                long l18 = l3 & (l15 ^= (long)-1);
                long l19 = y832.b;
                int[] nArray3 = y832.d;
                y83 y836 = y835;
                y835 = new y83(l18, l19, n8, nArray3);
                return y835;
            }
        } else if (n10 < 0 && (nArray = y832.d) != null && (n7 = iv2_2.a(nArray, n7)) >= 0) {
            int n15 = nArray.length;
            int n16 = n15 + -1;
            if (n16 == 0) {
                y83 y837;
                long l20 = y832.a;
                long l21 = y832.b;
                int n17 = y832.c;
                y83 y838 = y837;
                y837 = new y83(l20, l21, n17, null);
                return y837;
            }
            int[] nArray4 = new int[n16];
            if (n7 > 0) {
                n8 = 0;
                rp_1.f(0, 0, n7, nArray, nArray4);
            }
            if (n7 < n16) {
                n16 = n7 + 1;
                rp_1.f(n7, n16, n15, nArray, nArray4);
            }
            n10 = y832.c;
            long l22 = y832.a;
            l2 = y832.b;
            y83 y839 = new y83(l22, l2, n10, nArray4);
            return y839;
        }
        return y832;
    }

    public final boolean d(int n3) {
        int n4;
        int n7 = this.c;
        n7 = n3 - n7;
        long l2 = 0L;
        long l3 = 1L;
        boolean bl2 = true;
        int n8 = 64;
        boolean bl3 = false;
        if (n7 >= 0 && n7 < n8) {
            l3 <<= n7;
            long l4 = this.b;
            long l7 = (l3 &= l4) - l2;
            n3 = (int)(l7 == 0L ? 0 : (l7 < 0L ? -1 : 1));
            if (n3 == 0) {
                bl2 = false;
            }
            return bl2;
        }
        if (n7 >= n8 && n7 < (n4 = 128)) {
            l3 <<= (n7 -= n8);
            long l8 = this.a;
            long l12 = (l3 &= l8) - l2;
            n3 = (int)(l12 == 0L ? 0 : (l12 < 0L ? -1 : 1));
            if (n3 == 0) {
                bl2 = false;
            }
            return bl2;
        }
        if (n7 > 0) {
            return false;
        }
        int[] nArray = this.d;
        if (nArray != null) {
            if ((n3 = iv2_2.a(nArray, n3)) < 0) {
                bl2 = false;
            }
            bl3 = bl2;
        }
        return bl3;
    }

    public final y83 e(y83 y832) {
        y83 y833 = this;
        y83 y834 = y832;
        Object object = e;
        if (y832 == object) {
            return this;
        }
        if (this == object) {
            return y832;
        }
        int n3 = y832.c;
        long l2 = this.b;
        long l3 = this.a;
        int[] nArray = y832.d;
        long l4 = y832.b;
        long l7 = y832.a;
        int n4 = this.c;
        if (n3 == n4 && nArray == (object = (Object)this.d)) {
            long l8 = l3 | l7;
            long l12 = l2 |= l4;
            y834 = new y83(l8, l2, n4, (int[])object);
        } else {
            long l14 = 1L;
            n3 = 64;
            long l15 = 0L;
            int[] nArray2 = y833.d;
            if (nArray2 == null) {
                long l16;
                if (nArray2 != null) {
                    for (int n7 : nArray2) {
                        y834 = y834.f(n7);
                    }
                }
                int n8 = y833.c;
                Object object2 = l2 == l15 ? 0 : (l2 < l15 ? -1 : 1);
                if (object2 != 0) {
                    for (object2 = 0; object2 < n3; ++object2) {
                        int n7;
                        long l17 = l14 << object2 & l2;
                        long l18 = l17 - l15;
                        Object object3 = l18 == 0L ? 0 : (l18 < 0L ? -1 : 1);
                        if (object3 == false) continue;
                        n7 = object2 + n8;
                        y834 = y834.f(n7);
                    }
                }
                if ((l16 = l3 == l15 ? 0 : (l3 < l15 ? -1 : 1)) != false) {
                    nArray2 = null;
                    for (int i3 = 0; i3 < n3; ++i3) {
                        l2 = l14 << i3 & l3;
                        long l19 = l2 - l15;
                        object2 = l19 == 0L ? 0 : (l19 < 0L ? -1 : 1);
                        if (object2 == 0) continue;
                        l16 = i3 + 64 + n8;
                        y834 = y834.f((int)l16);
                    }
                }
            } else {
                y83 y835;
                int n10;
                int n14;
                y83 y836;
                y83 y837;
                int n15;
                if (nArray != null) {
                    n15 = nArray.length;
                    y837 = y833;
                    y836 = null;
                    for (n14 = 0; n14 < n15; ++n14) {
                        n10 = nArray[n14];
                        y837 = y837.f(n10);
                    }
                } else {
                    y837 = y833;
                }
                int n16 = y834.c;
                n15 = (int)(l4 == l15 ? 0 : (l4 < l15 ? -1 : 1));
                if (n15 != 0) {
                    y835 = null;
                    for (n15 = 0; n15 < n3; ++n15) {
                        long l20 = l14 << n15 & l4;
                        long l21 = l20 - l15;
                        n14 = (int)(l21 == 0L ? 0 : (l21 < 0L ? -1 : 1));
                        if (n14 == 0) continue;
                        n14 = n15 + n16;
                        y837 = y836 = y837.f(n14);
                    }
                }
                if ((n15 = (int)(l7 == l15 ? 0 : (l7 < l15 ? -1 : 1))) != 0) {
                    nArray2 = null;
                    for (int i8 = 0; i8 < n3; ++i8) {
                        l2 = l14 << i8 & l7;
                        long l22 = l2 - l15;
                        n10 = (int)(l22 == 0L ? 0 : (l22 < 0L ? -1 : 1));
                        if (n10 == 0) continue;
                        n15 = i8 + 64 + n16;
                        y837 = y835 = y837.f(n15);
                    }
                }
                y834 = y837;
            }
        }
        return y834;
    }

    public final y83 f(int n3) {
        y83 y832 = this;
        int n4 = n3;
        int n7 = this.c;
        int n8 = n3 - n7;
        long l2 = this.b;
        long l3 = 1L;
        long l4 = 0L;
        int n10 = 64;
        if (n8 >= 0 && n8 < n10) {
            long l7 = l3 << n8;
            long l8 = (l3 = l2 & l7) - l4;
            n10 = (int)(l8 == 0L ? 0 : (l8 < 0L ? -1 : 1));
            if (n10 == 0) {
                y83 y833;
                int[] nArray = this.d;
                long l12 = this.a;
                y83 y834 = y833;
                y833 = new y83(l12, l2 |= l7, n7, nArray);
                return y833;
            }
        } else {
            long l14 = y832.a;
            int n14 = 128;
            if (n8 >= n10 && n8 < n14) {
                long l15 = l3 << (n8 -= n10);
                long l16 = (l3 = l14 & l15) - l4;
                if ((n10 = (int)(l16 == 0L ? 0 : (l16 < 0L ? -1 : 1))) == 0) {
                    y83 y835;
                    long l17 = l14 | l15;
                    int[] nArray = y832.d;
                    y83 y836 = y835;
                    y835 = new y83(l17, l2, n7, nArray);
                    return y835;
                }
            } else {
                int[] nArray = y832.d;
                if (n8 >= n14) {
                    n8 = (int)(this.d(n3) ? 1 : 0);
                    if (n8 == 0) {
                        long l18;
                        int n15;
                        long l19;
                        ArrayList<Integer> arrayList;
                        block19: {
                            n8 = (n4 + 1) / n10 * 64;
                            n14 = 0;
                            arrayList = null;
                            l19 = l14;
                            for (n7 = y832.c; n7 < n8; n7 += 64) {
                                long l20;
                                Object object = l2 == l4 ? 0 : (l2 < l4 ? -1 : 1);
                                if (object != false) {
                                    Object object2;
                                    Integer n16;
                                    if (arrayList == null) {
                                        arrayList = new ArrayList<Integer>();
                                        if (nArray != null) {
                                            object = nArray.length;
                                            n16 = null;
                                            for (object2 = 0; object2 < object; ++object2) {
                                                int n17 = nArray[object2];
                                                Integer n18 = n17;
                                                arrayList.add(n18);
                                            }
                                        }
                                    }
                                    Object var32_30 = null;
                                    for (object = (Object)0; object < n10; ++object) {
                                        long l21 = l3 << object & l2;
                                        long l22 = l21 - l4;
                                        object2 = l22 == 0L ? 0 : (l22 < 0L ? -1 : 1);
                                        if (object2 == 0) continue;
                                        object2 = object + n7;
                                        n16 = object2;
                                        arrayList.add(n16);
                                    }
                                }
                                if ((l20 = l19 == l4 ? 0 : (l19 < l4 ? -1 : 1)) == false) {
                                    n15 = n8;
                                    l18 = l4;
                                    break block19;
                                }
                                l2 = l19;
                                l19 = l4;
                            }
                            l18 = l2;
                            n15 = n7;
                        }
                        if (arrayList != null) {
                            nArray = CollectionsKt.j0(arrayList);
                        }
                        y83 y837 = new y83(l19, l18, n15, nArray);
                        return y837.f(n4);
                    }
                } else {
                    if (nArray == null) {
                        y83 y838;
                        int[] nArray2 = new int[]{n3};
                        y83 y839 = y838;
                        long l23 = l14;
                        y838 = new y83(l14, l2, n7, nArray2);
                        return y838;
                    }
                    n8 = iv2_2.a(nArray, n4);
                    if (n8 < 0) {
                        n8 = -(n8 + 1);
                        n10 = nArray.length;
                        int[] nArray3 = new int[n10 + 1];
                        rp_1.f(0, 0, n8, nArray, nArray3);
                        rp_1.f(n8 + 1, n8, n10, nArray, nArray3);
                        nArray3[n8] = n4;
                        int n19 = y832.c;
                        long l24 = y832.a;
                        long l25 = y832.b;
                        y83 y8310 = new y83(l24, l25, n19, nArray3);
                        return y8310;
                    }
                }
            }
        }
        return y832;
    }

    public final Iterator iterator() {
        y83$a y83$a = new y83$a(this, null);
        Intrinsics.checkNotNullParameter(y83$a, "block");
        return zz2_1.a(y83$a);
    }

    public final String toString() {
        String string2;
        int n3;
        StringBuilder stringBuilder = new StringBuilder();
        Object object = super.toString();
        stringBuilder.append((String)object);
        stringBuilder.append(" [");
        int n4 = yx_2.o(this, 10);
        object = new ArrayList(n4);
        Object object2 = this.iterator();
        while ((n3 = object2.hasNext()) != 0) {
            n3 = ((Number)object2.next()).intValue();
            string2 = String.valueOf(n3);
            object.add(string2);
        }
        object2 = new StringBuilder();
        string2 = "";
        ((StringBuilder)object2).append((CharSequence)string2);
        int n7 = object.size();
        int n8 = 0;
        for (int i3 = 0; i3 < n7; ++i3) {
            Object object3 = object.get(i3);
            int n10 = 1;
            if ((n8 += n10) > n10) {
                String string3 = ", ";
                ((StringBuilder)object2).append((CharSequence)string3);
            }
            if (object3 != null) {
                n10 = object3 instanceof CharSequence;
            }
            if (n10 != 0) {
                object3 = (CharSequence)object3;
                ((StringBuilder)object2).append((CharSequence)object3);
                continue;
            }
            n10 = object3 instanceof Character;
            if (n10 != 0) {
                object3 = (Character)object3;
                char c2 = ((Character)object3).charValue();
                ((StringBuilder)object2).append(c2);
                continue;
            }
            object3 = String.valueOf(object3);
            ((StringBuilder)object2).append((CharSequence)object3);
        }
        ((StringBuilder)object2).append((CharSequence)string2);
        object = ((StringBuilder)object2).toString();
        stringBuilder.append((String)object);
        stringBuilder.append(']');
        return stringBuilder.toString();
    }
}

