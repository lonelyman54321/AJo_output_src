/*
 * Decompiled with CFR 0.152.
 */
package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.CodedOutputStream;
import androidx.datastore.preferences.protobuf.CodedOutputStream$b;
import androidx.datastore.preferences.protobuf.D;
import androidx.datastore.preferences.protobuf.E;
import androidx.datastore.preferences.protobuf.G;
import androidx.datastore.preferences.protobuf.G$b;
import androidx.datastore.preferences.protobuf.H;
import androidx.datastore.preferences.protobuf.I;
import androidx.datastore.preferences.protobuf.InvalidProtocolBufferException$InvalidWireTypeException;
import androidx.datastore.preferences.protobuf.L;
import androidx.datastore.preferences.protobuf.L$a;
import androidx.datastore.preferences.protobuf.g_0;
import androidx.datastore.preferences.protobuf.i_0;
import androidx.datastore.preferences.protobuf.j;
import androidx.datastore.preferences.protobuf.l_0;
import androidx.datastore.preferences.protobuf.n;
import androidx.datastore.preferences.protobuf.p;
import androidx.datastore.preferences.protobuf.p$b;
import androidx.datastore.preferences.protobuf.q$b;
import androidx.datastore.preferences.protobuf.s;
import androidx.datastore.preferences.protobuf.u;
import androidx.datastore.preferences.protobuf.u$a;
import androidx.datastore.preferences.protobuf.v;
import androidx.datastore.preferences.protobuf.w;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

public final class z
implements st2_0 {
    public static final int[] r = new int[0];
    public static final Unsafe s = nw3.l();
    public final int[] a;
    public final Object[] b;
    public final int c;
    public final int d;
    public final wo1_1 e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final int[] j;
    public final int k;
    public final int l;
    public final kZ1 m;
    public final s n;
    public final H o;
    public final j p;
    public final w q;

    public z(int[] nArray, Object[] objectArray, int n3, int n4, wo1_1 wo1_12, boolean bl2, int[] nArray2, int n7, int n8, kZ1 kZ12, s s7, H h3, j j3, w w4) {
        boolean bl3;
        boolean bl4;
        this.a = nArray;
        this.b = objectArray;
        this.c = n3;
        this.d = n4;
        this.g = bl4 = wo1_12 instanceof n;
        this.h = bl2;
        bl4 = false;
        nArray = null;
        if (j3 != null && (bl3 = j3.e(wo1_12))) {
            bl3 = true;
        } else {
            bl3 = false;
            objectArray = null;
        }
        this.f = bl3;
        this.i = false;
        this.j = nArray2;
        this.k = n7;
        this.l = n8;
        this.m = kZ12;
        this.n = s7;
        this.o = h3;
        this.p = j3;
        this.e = wo1_12;
        this.q = w4;
    }

    public static Field A(Class object, String charSequence) {
        try {
            return ((Class)object).getDeclaredField((String)charSequence);
        }
        catch (NoSuchFieldException noSuchFieldException) {
            Object[] objectArray = ((Class)object).getDeclaredFields();
            int n3 = objectArray.length;
            for (int i3 = 0; i3 < n3; ++i3) {
                Field field = objectArray[i3];
                String string2 = field.getName();
                boolean bl2 = ((String)charSequence).equals(string2);
                if (!bl2) continue;
                return field;
            }
            charSequence = Gn.a("Field ", (String)charSequence, " for ");
            object = ((Class)object).getName();
            ((StringBuilder)charSequence).append((String)object);
            ((StringBuilder)charSequence).append(" not found. Known fields are ");
            object = Arrays.toString(objectArray);
            ((StringBuilder)charSequence).append((String)object);
            object = ((StringBuilder)charSequence).toString();
            RuntimeException runtimeException = new RuntimeException((String)object);
            throw runtimeException;
        }
    }

    public static int D(int n3) {
        return (n3 & 0xFF00000) >>> 20;
    }

    public static void H(int n3, Object object, L object2) {
        boolean bl2 = object instanceof String;
        if (bl2) {
            object = (String)object;
            object2 = ((g_0)object2).a;
            ((CodedOutputStream)object2).S(n3, (String)object);
        } else {
            object = (DF)object;
            object2 = (g_0)object2;
            ((g_0)object2).b(n3, (DF)object);
        }
    }

    public static List l(long l2, Object object) {
        return (List)nw3.d.i(object, l2);
    }

    public static z q(tO1 object, kZ1 kZ12, s s7, H h3, j j3, w w4) {
        boolean bl2 = object instanceof vE2;
        if (bl2) {
            return z.r((vE2)object, kZ12, s7, h3, j3, w4);
        }
        object = (xe3_0)object;
        object = FB2.PROTO2;
        throw null;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public static z r(vE2 vE22, kZ1 kZ12, s s7, H h3, j j3, w w4) {
        int n3;
        int n4;
        int n7;
        Object object;
        int n8;
        int n10;
        Object object2;
        int[] nArray;
        int n14;
        int n15;
        int n16;
        int n17;
        Object object3;
        float f5;
        int n18;
        Object object4 = vE22.getSyntax();
        FB2 fB2 = FB2.PROTO3;
        int n19 = 0;
        Object var9_12 = null;
        if (object4 == fB2) {
            n18 = 1;
            f5 = Float.MIN_VALUE;
        } else {
            n18 = 0;
            f5 = 0.0f;
            object3 = null;
        }
        object4 = vE22.b();
        int n20 = ((String)object4).length();
        int n21 = ((String)object4).charAt(0);
        int n22 = 55296;
        if (n21 >= n22) {
            n21 &= 0x1FFF;
            n17 = 1;
            n16 = 13;
            while (true) {
                n15 = n17 + 1;
                if ((n17 = (int)((String)object4).charAt(n17)) < n22) break;
                n17 = (n17 & 0x1FFF) << n16;
                n21 |= n17;
                n16 += 13;
                n17 = n15;
            }
            n21 |= (n17 <<= n16);
        } else {
            n15 = 1;
        }
        n17 = n15 + 1;
        n16 = ((String)object4).charAt(n15);
        if (n16 >= n22) {
            n16 &= 0x1FFF;
            n15 = 13;
            while (true) {
                n14 = n17 + 1;
                if ((n17 = (int)((String)object4).charAt(n17)) < n22) break;
                n17 = (n17 & 0x1FFF) << n15;
                n16 |= n17;
                n15 += 13;
                n17 = n14;
            }
            n16 |= (n17 <<= n15);
            n17 = n14;
        }
        if (n16 == 0) {
            nArray = r;
            n16 = 0;
            n15 = 0;
            Object var21_32 = null;
            n14 = 0;
            object2 = null;
            n10 = 0;
            n8 = 0;
            object = null;
            n7 = 0;
        } else {
            int n24;
            n16 = n17 + 1;
            if ((n17 = (int)((String)object4).charAt(n17)) >= n22) {
                n17 &= 0x1FFF;
                n15 = 13;
                while (true) {
                    n14 = n16 + 1;
                    if ((n16 = (int)((String)object4).charAt(n16)) < n22) break;
                    n16 = (n16 & 0x1FFF) << n15;
                    n17 |= n16;
                    n15 += 13;
                    n16 = n14;
                }
                n17 |= (n16 <<= n15);
                n16 = n14;
            }
            n15 = n16 + 1;
            if ((n16 = (int)((String)object4).charAt(n16)) >= n22) {
                n16 &= 0x1FFF;
                n14 = 13;
                while (true) {
                    n4 = n15 + 1;
                    if ((n15 = (int)((String)object4).charAt(n15)) < n22) break;
                    n15 = (n15 & 0x1FFF) << n14;
                    n16 |= n15;
                    n14 += 13;
                    n15 = n4;
                }
                n16 |= (n15 <<= n14);
                n15 = n4;
            }
            n14 = n15 + 1;
            if ((n15 = (int)((String)object4).charAt(n15)) >= n22) {
                n15 &= 0x1FFF;
                n4 = 13;
                while (true) {
                    n10 = n14 + 1;
                    if ((n14 = (int)((String)object4).charAt(n14)) < n22) break;
                    n14 = (n14 & 0x1FFF) << n4;
                    n15 |= n14;
                    n4 += 13;
                    n14 = n10;
                }
                n15 |= (n14 <<= n4);
                n14 = n10;
            }
            n4 = n14 + 1;
            if ((n14 = (int)((String)object4).charAt(n14)) >= n22) {
                n14 &= 0x1FFF;
                n10 = 13;
                while (true) {
                    n8 = n4 + 1;
                    if ((n4 = (int)((String)object4).charAt(n4)) < n22) break;
                    n4 = (n4 & 0x1FFF) << n10;
                    n14 |= n4;
                    n10 += 13;
                    n4 = n8;
                }
                n14 |= (n4 <<= n10);
                n4 = n8;
            }
            n10 = n4 + 1;
            if ((n4 = (int)((String)object4).charAt(n4)) >= n22) {
                n4 &= 0x1FFF;
                n8 = 13;
                while (true) {
                    n7 = n10 + 1;
                    if ((n10 = (int)((String)object4).charAt(n10)) < n22) break;
                    n10 = (n10 & 0x1FFF) << n8;
                    n4 |= n10;
                    n8 += 13;
                    n10 = n7;
                }
                n4 |= (n10 <<= n8);
                n10 = n7;
            }
            n8 = n10 + 1;
            if ((n10 = (int)((String)object4).charAt(n10)) >= n22) {
                n10 &= 0x1FFF;
                n7 = 13;
                while (true) {
                    n24 = n8 + 1;
                    if ((n8 = (int)((String)object4).charAt(n8)) < n22) break;
                    n8 = (n8 & 0x1FFF) << n7;
                    n10 |= n8;
                    n7 += 13;
                    n8 = n24;
                }
                n10 |= (n8 <<= n7);
                n8 = n24;
            }
            n7 = n8 + 1;
            if ((n8 = (int)((String)object4).charAt(n8)) >= n22) {
                int n25;
                n8 &= 0x1FFF;
                n24 = 13;
                while (true) {
                    n25 = n7 + 1;
                    if ((n7 = (int)((String)object4).charAt(n7)) < n22) break;
                    n7 = (n7 & 0x1FFF) << n24;
                    n8 |= n7;
                    n24 += 13;
                    n7 = n25;
                }
                n8 |= (n7 <<= n24);
                n7 = n25;
            }
            n24 = n7 + 1;
            if ((n7 = (int)((String)object4).charAt(n7)) >= n22) {
                int n26;
                n7 &= 0x1FFF;
                n19 = n24;
                n24 = 13;
                while (true) {
                    n26 = n19 + 1;
                    if ((n19 = (int)((String)object4).charAt(n19)) < n22) break;
                    n19 = (n19 & 0x1FFF) << n24;
                    n7 |= n19;
                    n24 += 13;
                    n19 = n26;
                }
                n7 |= (n19 <<= n24);
                n24 = n26;
            }
            int[] nArray2 = new int[n7 + n10 + n8];
            n8 = n17 * 2 + n16;
            n16 = n17;
            n17 = n24;
            n3 = n4;
            nArray = nArray2;
            n19 = n15;
            n15 = n4;
        }
        Object object5 = s;
        Object[] objectArray = vE22.a();
        wo1_1 wo1_12 = vE22.getDefaultInstance();
        Class<?> clazz = wo1_12.getClass();
        n22 = n15 * 3;
        int[] nArray3 = new int[n22];
        Object[] objectArray2 = new Object[n15 *= 2];
        int n27 = n10 += n7;
        int n28 = n7;
        int n29 = 0;
        int n30 = 0;
        while (true) {
            int n32;
            int n34;
            int n35;
            int n36;
            int n37;
            int n38;
            int n39;
            float f6;
            int n41;
            int n42;
            block63: {
                block58: {
                    block66: {
                        block67: {
                            block65: {
                                block64: {
                                    block59: {
                                        block61: {
                                            block62: {
                                                block60: {
                                                    if (n17 >= n20) {
                                                        n42 = n19;
                                                        n41 = n18;
                                                        f6 = f5;
                                                        n39 = n14;
                                                        n38 = n10;
                                                        n37 = n7;
                                                        wo1_1 wo1_13 = vE22.getDefaultInstance();
                                                        object5 = nArray3;
                                                        Object[] objectArray3 = objectArray2;
                                                        n17 = n19;
                                                        n16 = n14;
                                                        wo1_1 wo1_14 = wo1_13;
                                                        object2 = nArray;
                                                        n4 = n7;
                                                        object = kZ12;
                                                        w w5 = w4;
                                                        return new z((int[])object5, objectArray3, n19, n14, wo1_13, n18 != 0, nArray, n7, n10, kZ12, s7, h3, j3, w4);
                                                    }
                                                    n41 = n17 + 1;
                                                    n17 = ((String)object4).charAt(n17);
                                                    n36 = n20;
                                                    n20 = 55296;
                                                    if (n17 >= n20) {
                                                        n17 &= 0x1FFF;
                                                        n20 = n41;
                                                        n41 = 13;
                                                        f6 = 1.8E-44f;
                                                        while (true) {
                                                            n42 = n20 + 1;
                                                            n20 = ((String)object4).charAt(n20);
                                                            n38 = n10;
                                                            n10 = 55296;
                                                            if (n20 < n10) break;
                                                            n20 = (n20 & 0x1FFF) << n41;
                                                            n17 |= n20;
                                                            n41 += 13;
                                                            n20 = n42;
                                                            n10 = n38;
                                                        }
                                                        n17 |= (n20 <<= n41);
                                                        n20 = n42;
                                                    } else {
                                                        n38 = n10;
                                                        n20 = n41;
                                                    }
                                                    n10 = n20 + 1;
                                                    n20 = ((String)object4).charAt(n20);
                                                    n41 = n10;
                                                    n10 = 55296;
                                                    if (n20 >= n10) {
                                                        n20 &= 0x1FFF;
                                                        n10 = n41;
                                                        n41 = 13;
                                                        f6 = 1.8E-44f;
                                                        while (true) {
                                                            n42 = n10 + 1;
                                                            n10 = ((String)object4).charAt(n10);
                                                            n37 = n7;
                                                            n7 = 55296;
                                                            if (n10 < n7) break;
                                                            n10 = (n10 & 0x1FFF) << n41;
                                                            n20 |= n10;
                                                            n41 += 13;
                                                            n10 = n42;
                                                            n7 = n37;
                                                        }
                                                        n20 |= (n10 <<= n41);
                                                        n10 = n42;
                                                    } else {
                                                        n37 = n7;
                                                        n10 = n41;
                                                    }
                                                    n7 = n20 & 0xFF;
                                                    n41 = n18;
                                                    f6 = f5;
                                                    n18 = n20 & 0x400;
                                                    if (n18 != 0) {
                                                        n18 = n29 + 1;
                                                        nArray[n29] = n30;
                                                        n29 = n18;
                                                    }
                                                    n18 = 51;
                                                    f5 = 7.1E-44f;
                                                    if (n7 < n18) break block59;
                                                    n18 = n10 + 1;
                                                    n10 = ((String)object4).charAt(n10);
                                                    n42 = n18;
                                                    n18 = 55296;
                                                    f5 = 7.7486E-41f;
                                                    if (n10 >= n18) {
                                                        int n43;
                                                        n39 = 13;
                                                        n3 = n42;
                                                        n42 = n10 &= 0x1FFF;
                                                        n10 = n3;
                                                        while (true) {
                                                            n43 = n10 + 1;
                                                            if ((n10 = (int)((String)object4).charAt(n10)) < n18) break;
                                                            n18 = (n10 & 0x1FFF) << n39;
                                                            n42 |= n18;
                                                            n39 += 13;
                                                            n10 = n43;
                                                            n18 = 55296;
                                                            f5 = 7.7486E-41f;
                                                        }
                                                        n18 = n10 << n39;
                                                        n10 = n42 | n18;
                                                        n18 = n43;
                                                    } else {
                                                        n18 = n42;
                                                    }
                                                    n42 = n18;
                                                    n18 = n7 + -51;
                                                    n39 = n14;
                                                    n14 = 9;
                                                    if (n18 == n14 || n18 == (n14 = 17)) break block60;
                                                    n14 = 12;
                                                    if (n18 != n14 || (n18 = n21 & 1) != (n14 = 1)) break block61;
                                                    n18 = n30 / 3 * 2 + n14;
                                                    n14 = n8 + 1;
                                                    objectArray2[n18] = object = objectArray[n8];
                                                    break block62;
                                                }
                                                n18 = n30 / 3 * 2 + 1;
                                                n14 = n8 + 1;
                                                objectArray2[n18] = object = objectArray[n8];
                                            }
                                            n8 = n14;
                                        }
                                        if ((n14 = (object3 = objectArray[n10 *= 2]) instanceof Field) != 0) {
                                            object3 = (Field)object3;
                                        } else {
                                            object3 = (String)object3;
                                            objectArray[n10] = object3 = z.A(clazz, (String)object3);
                                        }
                                        long l2 = ((Unsafe)object5).objectFieldOffset((Field)object3);
                                        n14 = (int)l2;
                                        object3 = objectArray[++n10];
                                        n35 = n14;
                                        n14 = object3 instanceof Field;
                                        if (n14 != 0) {
                                            object3 = (Field)object3;
                                        } else {
                                            object3 = (String)object3;
                                            objectArray[n10] = object3 = z.A(clazz, (String)object3);
                                        }
                                        l2 = ((Unsafe)object5).objectFieldOffset((Field)object3);
                                        n14 = (int)l2;
                                        n18 = n8;
                                        n34 = n42;
                                        n10 = 0;
                                        object = object4;
                                        n42 = n19;
                                        n3 = n35;
                                        n35 = n20;
                                        n20 = n14;
                                        n14 = n3;
                                        break block63;
                                    }
                                    n39 = n14;
                                    n18 = n8 + 1;
                                    object2 = (String)objectArray[n8];
                                    object2 = z.A(clazz, (String)object2);
                                    n42 = n19;
                                    n19 = 9;
                                    if (n7 != n19 && n7 != (n19 = 17)) break block64;
                                    n35 = n20;
                                    n20 = 1;
                                    n19 = n30 / 3 * 2 + n20;
                                    objectArray2[n19] = object = ((Field)object2).getType();
                                    break block58;
                                }
                                n19 = 27;
                                if (n7 != n19 && n7 != (n19 = 49)) break block65;
                                n35 = n20;
                                n20 = 1;
                                n19 = n30 / 3 * 2 + n20;
                                n8 += 2;
                                objectArray2[n19] = object3 = objectArray[n18];
                                break block66;
                            }
                            n19 = 12;
                            if (n7 == n19 || n7 == (n19 = 30) || n7 == (n19 = 44)) break block67;
                            n19 = 50;
                            if (n7 == n19) {
                                n19 = n28 + 1;
                                nArray[n28] = n30;
                                n28 = n30 / 3 * 2;
                                n35 = n8 + 2;
                                objectArray2[n28] = object3 = objectArray[n18];
                                n18 = n20 & 0x800;
                                if (n18 != 0) {
                                    n18 = n8 + 3;
                                    objectArray2[++n28] = object = objectArray[n35];
                                    n35 = n20;
                                    n28 = n19;
                                    break block58;
                                } else {
                                    n28 = n19;
                                    n18 = n35;
                                    n35 = n20;
                                }
                                break block58;
                            } else {
                                n35 = n20;
                                n20 = 1;
                            }
                            break block58;
                        }
                        n19 = n21 & 1;
                        n35 = n20;
                        n20 = 1;
                        if (n19 != n20) break block58;
                        n19 = n30 / 3 * 2 + n20;
                        n8 += 2;
                        objectArray2[n19] = object3 = objectArray[n18];
                    }
                    n18 = n8;
                }
                long l3 = ((Unsafe)object5).objectFieldOffset((Field)object2);
                n14 = (int)l3;
                n20 = n21 & 1;
                n19 = 1;
                if (n20 == n19 && n7 <= (n20 = 17)) {
                    void var9_18;
                    Object object6;
                    int n44;
                    n20 = n10 + 1;
                    if ((n10 = (int)((String)object4).charAt(n10)) >= (n8 = 55296)) {
                        n10 &= 0x1FFF;
                        n44 = 13;
                        while (true) {
                            n34 = n20 + 1;
                            if ((n20 = (int)((String)object4).charAt(n20)) < n8) break;
                            n20 = (n20 & 0x1FFF) << n44;
                            n10 |= n20;
                            n44 += 13;
                            n20 = n34;
                        }
                        n10 |= (n20 <<= n44);
                        n20 = n34;
                    }
                    if ((n8 = (object6 = objectArray[n34 = n10 / 32 + (n44 = n16 * 2)]) instanceof Field) != 0) {
                        Field field = (Field)object6;
                    } else {
                        String string2 = (String)object6;
                        Field field = z.A(clazz, string2);
                        objectArray[n34] = field;
                    }
                    object = object4;
                    n34 = n20;
                    long l4 = ((Unsafe)object5).objectFieldOffset((Field)var9_18);
                    n20 = (int)l4;
                    n10 %= 32;
                } else {
                    object = object4;
                    n34 = n10;
                    n20 = 0;
                    Object var7_9 = null;
                    n10 = 0;
                }
                n32 = 18;
                if (n7 >= n32 && n7 <= (n32 = 49)) {
                    n32 = n27 + 1;
                    nArray[n27] = n14;
                    n27 = n32;
                }
            }
            n32 = n30 + 1;
            nArray3[n30] = n17;
            n19 = n30 + 2;
            n17 = n35;
            Class<?> clazz2 = clazz;
            int n45 = n35 & 0x200;
            if (n45 != 0) {
                n45 = 0x20000000;
            } else {
                n45 = 0;
                clazz = null;
            }
            n17 = (n17 &= 0x100) != 0 ? 0x10000000 : 0;
            n45 |= n17;
            n17 = n7 << 20;
            nArray3[n32] = n45 = n45 | n17 | n14;
            n30 += 3;
            nArray3[n19] = n32 = n10 << 20 | n20;
            object4 = object;
            n17 = n34;
            n20 = n36;
            n19 = n42;
            n10 = n38;
            n7 = n37;
            clazz = clazz2;
            n14 = n39;
            n8 = n18;
            n18 = n41;
            f5 = f6;
        }
    }

    public static long s(int n3) {
        return n3 & 0xFFFFF;
    }

    public static int t(Object object, long l2) {
        return (Integer)nw3.d.i(object, l2);
    }

    public static long u(Object object, long l2) {
        return (Long)nw3.d.i(object, l2);
    }

    public final void B(Object object, int n3) {
        int n4 = this.h;
        if (n4 != 0) {
            return;
        }
        n3 += 2;
        n3 = this.a[n3];
        n4 = n3 >>> 20;
        n4 = 1 << n4;
        long l2 = n3 & 0xFFFFF;
        n3 = nw3.d.g(object, l2) | n4;
        nw3.p(object, l2, n3);
    }

    public final void C(Object object, int n3, int n4) {
        long l2 = this.a[n4 += 2] & 0xFFFFF;
        nw3.p(object, l2, n3);
    }

    public final int E(int n3) {
        return this.a[++n3];
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final void F(Object var1_1, L var2_2) {
        var3_3 = this;
        var4_4 = var1_1;
        var5_5 = var2_2;
        var6_6 = this.f;
        var7_7 = this.p;
        if (var6_6 && (var9_9 = (var8_8 = var7_7.c(var1_1)).f()) == 0) {
            var8_8 = (Map.Entry)var8_8.i().next();
        } else {
            var6_6 = false;
            var8_8 = null;
        }
        var10_10 = var3_3.a;
        var11_11 = ((int[])var10_10).length;
        var12_12 = z.s;
        var13_13 = -1 != 0;
        var15_15 = 0;
        for (var14_14 = 0; var14_14 < var11_11; var14_14 += 3) {
            var16_16 = var3_3.E(var14_14);
            var17_17 = var10_10[var14_14];
            var18_18 = z.D(var16_16);
            var19_19 = var3_3.h;
            var20_20 = 1048575;
            if (var19_19 == 0 && var18_18 <= (var19_19 = 17)) {
                var19_19 = var14_14 + 2;
                var19_19 = var10_10[var19_19];
                var21_21 = var19_19 & var20_20;
                var22_22 = var10_10;
                var23_23 = var11_11;
                if (var21_21 != var13_13) {
                    var24_24 = (long)var21_21;
                    var15_15 = var12_12.getInt(var4_4, var24_24);
                    var13_13 = var21_21;
                }
                var21_21 = var19_19 >>> 20;
                var9_9 = 1;
                var21_21 = var9_9 << var21_21;
            } else {
                var22_22 = var10_10;
                var23_23 = var11_11;
                var21_21 = false;
                var26_25 = 0.0f;
                var27_26 = null;
            }
            if (var8_8 != null) {
                var7_7.a((Map.Entry)var8_8);
                if (var17_17 >= 0) {
                    var7_7.j((Map.Entry)var8_8);
                    throw null;
                }
            }
            var9_9 = var16_16 & var20_20;
            var24_24 = var9_9;
            switch (var18_18) lbl-1000:
            // 56 sources

            {
                default: {
                    var19_19 = 0;
                    break;
                }
                case 68: {
                    var21_21 = var3_3.k(var4_4, var17_17, var14_14);
                    if (!var21_21) ** GOTO lbl-1000
                    var27_26 = var12_12.getObject(var4_4, var24_24);
                    var10_10 = var3_3.g(var14_14);
                    var28_27 = var5_5;
                    var28_27 = (g_0)var5_5;
                    var28_27.i(var17_17, var27_26, (st2_0)var10_10);
                    ** GOTO lbl-1000
                }
                case 67: {
                    var21_21 = var3_3.k(var4_4, var17_17, var14_14);
                    if (!var21_21) ** GOTO lbl-1000
                    var29_28 = z.u(var4_4, var24_24);
                    var28_27 = var5_5;
                    var28_27 = (g_0)var5_5;
                    var28_27.q(var17_17, var29_28);
                    ** GOTO lbl-1000
                }
                case 66: {
                    var21_21 = var3_3.k(var4_4, var17_17, var14_14);
                    if (!var21_21) ** GOTO lbl-1000
                    var21_21 = z.t(var4_4, var24_24);
                    var10_10 = var5_5;
                    var10_10 = (g_0)var5_5;
                    var10_10.p(var17_17, (int)var21_21);
                    ** GOTO lbl-1000
                }
                case 65: {
                    var21_21 = var3_3.k(var4_4, var17_17, var14_14);
                    if (!var21_21) ** GOTO lbl-1000
                    var29_28 = z.u(var4_4, var24_24);
                    var28_27 = var5_5;
                    var28_27 = (g_0)var5_5;
                    var28_27.o(var17_17, var29_28);
                    ** GOTO lbl-1000
                }
                case 64: {
                    var21_21 = var3_3.k(var4_4, var17_17, var14_14);
                    if (!var21_21) ** GOTO lbl-1000
                    var21_21 = z.t(var4_4, var24_24);
                    var10_10 = var5_5;
                    var10_10 = (g_0)var5_5;
                    var10_10.n(var17_17, (int)var21_21);
                    ** GOTO lbl-1000
                }
                case 63: {
                    var21_21 = var3_3.k(var4_4, var17_17, var14_14);
                    if (!var21_21) ** GOTO lbl-1000
                    var21_21 = z.t(var4_4, var24_24);
                    var10_10 = var5_5;
                    var10_10 = (g_0)var5_5;
                    var10_10.e(var17_17, (int)var21_21);
                    ** GOTO lbl-1000
                }
                case 62: {
                    var21_21 = var3_3.k(var4_4, var17_17, var14_14);
                    if (!var21_21) ** GOTO lbl-1000
                    var21_21 = z.t(var4_4, var24_24);
                    var10_10 = var5_5;
                    var10_10 = (g_0)var5_5;
                    var10_10.s(var17_17, (int)var21_21);
                    ** GOTO lbl-1000
                }
                case 61: {
                    var21_21 = var3_3.k(var4_4, var17_17, var14_14);
                    if (!var21_21) ** GOTO lbl-1000
                    var27_26 = (DF)var12_12.getObject(var4_4, var24_24);
                    var10_10 = var5_5;
                    var10_10 = (g_0)var5_5;
                    var10_10.b(var17_17, (DF)var27_26);
                    ** GOTO lbl-1000
                }
                case 60: {
                    var21_21 = var3_3.k(var4_4, var17_17, var14_14);
                    if (!var21_21) ** GOTO lbl-1000
                    var27_26 = var12_12.getObject(var4_4, var24_24);
                    var10_10 = var3_3.g(var14_14);
                    var28_27 = var5_5;
                    var28_27 = (g_0)var5_5;
                    var28_27.l(var17_17, var27_26, (st2_0)var10_10);
                    ** GOTO lbl-1000
                }
                case 59: {
                    var21_21 = var3_3.k(var4_4, var17_17, var14_14);
                    if (!var21_21) ** GOTO lbl-1000
                    var27_26 = var12_12.getObject(var4_4, var24_24);
                    z.H(var17_17, var27_26, var5_5);
                    ** GOTO lbl-1000
                }
                case 58: {
                    var21_21 = var3_3.k(var4_4, var17_17, var14_14);
                    if (!var21_21) ** GOTO lbl-1000
                    var27_26 = (Boolean)nw3.d.i(var4_4, var24_24);
                    var21_21 = var27_26.booleanValue();
                    var10_10 = var5_5;
                    var10_10 = (g_0)var5_5;
                    var10_10.a(var17_17, var21_21);
                    ** GOTO lbl-1000
                }
                case 57: {
                    var21_21 = var3_3.k(var4_4, var17_17, var14_14);
                    if (!var21_21) ** GOTO lbl-1000
                    var21_21 = z.t(var4_4, var24_24);
                    var10_10 = var5_5;
                    var10_10 = (g_0)var5_5;
                    var10_10.f(var17_17, (int)var21_21);
                    ** GOTO lbl-1000
                }
                case 56: {
                    var21_21 = var3_3.k(var4_4, var17_17, var14_14);
                    if (!var21_21) ** GOTO lbl-1000
                    var29_28 = z.u(var4_4, var24_24);
                    var28_27 = var5_5;
                    var28_27 = (g_0)var5_5;
                    var28_27.g(var17_17, var29_28);
                    ** GOTO lbl-1000
                }
                case 55: {
                    var21_21 = var3_3.k(var4_4, var17_17, var14_14);
                    if (!var21_21) ** GOTO lbl-1000
                    var21_21 = z.t(var4_4, var24_24);
                    var10_10 = var5_5;
                    var10_10 = (g_0)var5_5;
                    var10_10.j(var17_17, (int)var21_21);
                    ** GOTO lbl-1000
                }
                case 54: {
                    var21_21 = var3_3.k(var4_4, var17_17, var14_14);
                    if (!var21_21) ** GOTO lbl-1000
                    var29_28 = z.u(var4_4, var24_24);
                    var28_27 = var5_5;
                    var28_27 = (g_0)var5_5;
                    var28_27.t(var17_17, var29_28);
                    ** GOTO lbl-1000
                }
                case 53: {
                    var21_21 = var3_3.k(var4_4, var17_17, var14_14);
                    if (!var21_21) ** GOTO lbl-1000
                    var29_28 = z.u(var4_4, var24_24);
                    var28_27 = var5_5;
                    var28_27 = (g_0)var5_5;
                    var28_27.k(var17_17, var29_28);
                    ** GOTO lbl-1000
                }
                case 52: {
                    var21_21 = var3_3.k(var4_4, var17_17, var14_14);
                    if (!var21_21) ** GOTO lbl-1000
                    var27_26 = (Float)nw3.d.i(var4_4, var24_24);
                    var26_25 = var27_26.floatValue();
                    var10_10 = var5_5;
                    var10_10 = (g_0)var5_5;
                    var10_10.h(var17_17, var26_25);
                    ** GOTO lbl-1000
                }
                case 51: {
                    var21_21 = var3_3.k(var4_4, var17_17, var14_14);
                    if (!var21_21) ** GOTO lbl-1000
                    var27_26 = (Double)nw3.d.i(var4_4, var24_24);
                    var31_29 = var27_26.doubleValue();
                    var28_27 = var5_5;
                    var28_27 = (g_0)var5_5;
                    var28_27.c(var17_17, var31_29);
                    ** GOTO lbl-1000
                }
                case 50: {
                    var27_26 = var12_12.getObject(var4_4, var24_24);
                    var3_3.G(var5_5, var17_17, var27_26, var14_14);
                    ** GOTO lbl-1000
                }
                case 49: {
                    var21_21 = var22_22[var14_14];
                    var10_10 = (List)var12_12.getObject(var4_4, var24_24);
                    var28_27 = var3_3.g(var14_14);
                    E.L((int)var21_21, (List)var10_10, var5_5, (st2_0)var28_27);
                    ** GOTO lbl-1000
                }
                case 48: {
                    var21_21 = var22_22[var14_14];
                    var10_10 = (List)var12_12.getObject(var4_4, var24_24);
                    var19_19 = 1;
                    E.S((int)var21_21, (List)var10_10, var5_5, (boolean)var19_19);
                    ** GOTO lbl-1000
                }
                case 47: {
                    var19_19 = 1;
                    var21_21 = var22_22[var14_14];
                    var10_10 = (List)var12_12.getObject(var4_4, var24_24);
                    E.R((int)var21_21, (List)var10_10, var5_5, (boolean)var19_19);
                    ** GOTO lbl-1000
                }
                case 46: {
                    var19_19 = 1;
                    var21_21 = var22_22[var14_14];
                    var10_10 = (List)var12_12.getObject(var4_4, var24_24);
                    E.Q((int)var21_21, (List)var10_10, var5_5, (boolean)var19_19);
                    ** GOTO lbl-1000
                }
                case 45: {
                    var19_19 = 1;
                    var21_21 = var22_22[var14_14];
                    var10_10 = (List)var12_12.getObject(var4_4, var24_24);
                    E.P((int)var21_21, (List)var10_10, var5_5, (boolean)var19_19);
                    ** GOTO lbl-1000
                }
                case 44: {
                    var19_19 = 1;
                    var21_21 = var22_22[var14_14];
                    var10_10 = (List)var12_12.getObject(var4_4, var24_24);
                    E.H((int)var21_21, (List)var10_10, var5_5, (boolean)var19_19);
                    ** GOTO lbl-1000
                }
                case 43: {
                    var19_19 = 1;
                    var21_21 = var22_22[var14_14];
                    var10_10 = (List)var12_12.getObject(var4_4, var24_24);
                    E.U((int)var21_21, (List)var10_10, var5_5, (boolean)var19_19);
                    ** GOTO lbl-1000
                }
                case 42: {
                    var19_19 = 1;
                    var21_21 = var22_22[var14_14];
                    var10_10 = (List)var12_12.getObject(var4_4, var24_24);
                    E.E((int)var21_21, (List)var10_10, var5_5, (boolean)var19_19);
                    ** GOTO lbl-1000
                }
                case 41: {
                    var19_19 = 1;
                    var21_21 = var22_22[var14_14];
                    var10_10 = (List)var12_12.getObject(var4_4, var24_24);
                    E.I((int)var21_21, (List)var10_10, var5_5, (boolean)var19_19);
                    ** GOTO lbl-1000
                }
                case 40: {
                    var19_19 = 1;
                    var21_21 = var22_22[var14_14];
                    var10_10 = (List)var12_12.getObject(var4_4, var24_24);
                    E.J((int)var21_21, (List)var10_10, var5_5, (boolean)var19_19);
                    ** GOTO lbl-1000
                }
                case 39: {
                    var19_19 = 1;
                    var21_21 = var22_22[var14_14];
                    var10_10 = (List)var12_12.getObject(var4_4, var24_24);
                    E.M((int)var21_21, (List)var10_10, var5_5, (boolean)var19_19);
                    ** GOTO lbl-1000
                }
                case 38: {
                    var19_19 = 1;
                    var21_21 = var22_22[var14_14];
                    var10_10 = (List)var12_12.getObject(var4_4, var24_24);
                    E.V((int)var21_21, (List)var10_10, var5_5, (boolean)var19_19);
                    ** GOTO lbl-1000
                }
                case 37: {
                    var19_19 = 1;
                    var21_21 = var22_22[var14_14];
                    var10_10 = (List)var12_12.getObject(var4_4, var24_24);
                    E.N((int)var21_21, (List)var10_10, var5_5, (boolean)var19_19);
                    ** GOTO lbl-1000
                }
                case 36: {
                    var19_19 = 1;
                    var21_21 = var22_22[var14_14];
                    var10_10 = (List)var12_12.getObject(var4_4, var24_24);
                    E.K((int)var21_21, (List)var10_10, var5_5, (boolean)var19_19);
                    ** GOTO lbl-1000
                }
                case 35: {
                    var19_19 = 1;
                    var21_21 = var22_22[var14_14];
                    var10_10 = (List)var12_12.getObject(var4_4, var24_24);
                    E.G((int)var21_21, (List)var10_10, var5_5, (boolean)var19_19);
                    ** GOTO lbl-1000
                }
                case 34: {
                    var21_21 = var22_22[var14_14];
                    var10_10 = (List)var12_12.getObject(var4_4, var24_24);
                    var19_19 = 0;
                    E.S((int)var21_21, (List)var10_10, var5_5, false);
                    break;
                }
                case 33: {
                    var19_19 = 0;
                    var21_21 = var22_22[var14_14];
                    var10_10 = (List)var12_12.getObject(var4_4, var24_24);
                    E.R((int)var21_21, (List)var10_10, var5_5, false);
                    break;
                }
                case 32: {
                    var19_19 = 0;
                    var21_21 = var22_22[var14_14];
                    var10_10 = (List)var12_12.getObject(var4_4, var24_24);
                    E.Q((int)var21_21, (List)var10_10, var5_5, false);
                    break;
                }
                case 31: {
                    var19_19 = 0;
                    var21_21 = var22_22[var14_14];
                    var10_10 = (List)var12_12.getObject(var4_4, var24_24);
                    E.P((int)var21_21, (List)var10_10, var5_5, false);
                    break;
                }
                case 30: {
                    var19_19 = 0;
                    var21_21 = var22_22[var14_14];
                    var10_10 = (List)var12_12.getObject(var4_4, var24_24);
                    E.H((int)var21_21, (List)var10_10, var5_5, false);
                    break;
                }
                case 29: {
                    var19_19 = 0;
                    var21_21 = var22_22[var14_14];
                    var10_10 = (List)var12_12.getObject(var4_4, var24_24);
                    E.U((int)var21_21, (List)var10_10, var5_5, false);
                    break;
                }
                case 28: {
                    var21_21 = var22_22[var14_14];
                    var10_10 = (List)var12_12.getObject(var4_4, var24_24);
                    E.F((int)var21_21, (List)var10_10, var5_5);
                    ** GOTO lbl-1000
                }
                case 27: {
                    var21_21 = var22_22[var14_14];
                    var10_10 = (List)var12_12.getObject(var4_4, var24_24);
                    var28_27 = var3_3.g(var14_14);
                    E.O((int)var21_21, (List)var10_10, var5_5, (st2_0)var28_27);
                    ** GOTO lbl-1000
                }
                case 26: {
                    var21_21 = var22_22[var14_14];
                    var10_10 = (List)var12_12.getObject(var4_4, var24_24);
                    E.T((int)var21_21, (List)var10_10, var5_5);
                    ** GOTO lbl-1000
                }
                case 25: {
                    var21_21 = var22_22[var14_14];
                    var10_10 = (List)var12_12.getObject(var4_4, var24_24);
                    var19_19 = 0;
                    E.E((int)var21_21, (List)var10_10, var5_5, false);
                    break;
                }
                case 24: {
                    var19_19 = 0;
                    var21_21 = var22_22[var14_14];
                    var10_10 = (List)var12_12.getObject(var4_4, var24_24);
                    E.I((int)var21_21, (List)var10_10, var5_5, false);
                    break;
                }
                case 23: {
                    var19_19 = 0;
                    var21_21 = var22_22[var14_14];
                    var10_10 = (List)var12_12.getObject(var4_4, var24_24);
                    E.J((int)var21_21, (List)var10_10, var5_5, false);
                    break;
                }
                case 22: {
                    var19_19 = 0;
                    var21_21 = var22_22[var14_14];
                    var10_10 = (List)var12_12.getObject(var4_4, var24_24);
                    E.M((int)var21_21, (List)var10_10, var5_5, false);
                    break;
                }
                case 21: {
                    var19_19 = 0;
                    var21_21 = var22_22[var14_14];
                    var10_10 = (List)var12_12.getObject(var4_4, var24_24);
                    E.V((int)var21_21, (List)var10_10, var5_5, false);
                    break;
                }
                case 20: {
                    var19_19 = 0;
                    var21_21 = var22_22[var14_14];
                    var10_10 = (List)var12_12.getObject(var4_4, var24_24);
                    E.N((int)var21_21, (List)var10_10, var5_5, false);
                    break;
                }
                case 19: {
                    var19_19 = 0;
                    var21_21 = var22_22[var14_14];
                    var10_10 = (List)var12_12.getObject(var4_4, var24_24);
                    E.K((int)var21_21, (List)var10_10, var5_5, false);
                    break;
                }
                case 18: {
                    var19_19 = 0;
                    var21_21 = var22_22[var14_14];
                    var10_10 = (List)var12_12.getObject(var4_4, var24_24);
                    E.G((int)var21_21, (List)var10_10, var5_5, false);
                    break;
                }
                case 17: {
                    var19_19 = 0;
                    if (!(var21_21 &= var15_15)) break;
                    var27_26 = var12_12.getObject(var4_4, var24_24);
                    var10_10 = var3_3.g(var14_14);
                    var28_27 = var5_5;
                    var28_27 = (g_0)var5_5;
                    var28_27.i(var17_17, var27_26, (st2_0)var10_10);
                    break;
                }
                case 16: {
                    var19_19 = 0;
                    if (!(var21_21 &= var15_15)) break;
                    var29_28 = var12_12.getLong(var4_4, var24_24);
                    var28_27 = var5_5;
                    var28_27 = (g_0)var5_5;
                    var28_27.q(var17_17, var29_28);
                    break;
                }
                case 15: {
                    var19_19 = 0;
                    if (!(var21_21 &= var15_15)) break;
                    var21_21 = var12_12.getInt(var4_4, var24_24);
                    var10_10 = var5_5;
                    var10_10 = (g_0)var5_5;
                    var10_10.p(var17_17, (int)var21_21);
                    break;
                }
                case 14: {
                    var19_19 = 0;
                    if (!(var21_21 &= var15_15)) break;
                    var29_28 = var12_12.getLong(var4_4, var24_24);
                    var28_27 = var5_5;
                    var28_27 = (g_0)var5_5;
                    var28_27.o(var17_17, var29_28);
                    break;
                }
                case 13: {
                    var19_19 = 0;
                    if (!(var21_21 &= var15_15)) break;
                    var21_21 = var12_12.getInt(var4_4, var24_24);
                    var10_10 = var5_5;
                    var10_10 = (g_0)var5_5;
                    var10_10.n(var17_17, (int)var21_21);
                    break;
                }
                case 12: {
                    var19_19 = 0;
                    if (!(var21_21 &= var15_15)) break;
                    var21_21 = var12_12.getInt(var4_4, var24_24);
                    var10_10 = var5_5;
                    var10_10 = (g_0)var5_5;
                    var10_10.e(var17_17, (int)var21_21);
                    break;
                }
                case 11: {
                    var19_19 = 0;
                    if (!(var21_21 &= var15_15)) break;
                    var21_21 = var12_12.getInt(var4_4, var24_24);
                    var10_10 = var5_5;
                    var10_10 = (g_0)var5_5;
                    var10_10.s(var17_17, (int)var21_21);
                    break;
                }
                case 10: {
                    var19_19 = 0;
                    if (!(var21_21 &= var15_15)) break;
                    var27_26 = (DF)var12_12.getObject(var4_4, var24_24);
                    var10_10 = var5_5;
                    var10_10 = (g_0)var5_5;
                    var10_10.b(var17_17, (DF)var27_26);
                    break;
                }
                case 9: {
                    var19_19 = 0;
                    if (!(var21_21 &= var15_15)) break;
                    var27_26 = var12_12.getObject(var4_4, var24_24);
                    var10_10 = var3_3.g(var14_14);
                    var28_27 = var5_5;
                    var28_27 = (g_0)var5_5;
                    var28_27.l(var17_17, var27_26, (st2_0)var10_10);
                    break;
                }
                case 8: {
                    var19_19 = 0;
                    if (!(var21_21 &= var15_15)) break;
                    var27_26 = var12_12.getObject(var4_4, var24_24);
                    z.H(var17_17, var27_26, var5_5);
                    break;
                }
                case 7: {
                    var19_19 = 0;
                    if (!(var21_21 &= var15_15)) break;
                    var27_26 = nw3.d;
                    var21_21 = var27_26.c(var4_4, var24_24);
                    var10_10 = var5_5;
                    var10_10 = (g_0)var5_5;
                    var10_10.a(var17_17, var21_21);
                    break;
                }
                case 6: {
                    var19_19 = 0;
                    if (!(var21_21 &= var15_15)) break;
                    var21_21 = var12_12.getInt(var4_4, var24_24);
                    var10_10 = var5_5;
                    var10_10 = (g_0)var5_5;
                    var10_10.f(var17_17, (int)var21_21);
                    break;
                }
                case 5: {
                    var19_19 = 0;
                    if (!(var21_21 &= var15_15)) break;
                    var29_28 = var12_12.getLong(var4_4, var24_24);
                    var28_27 = var5_5;
                    var28_27 = (g_0)var5_5;
                    var28_27.g(var17_17, var29_28);
                    break;
                }
                case 4: {
                    var19_19 = 0;
                    if (!(var21_21 &= var15_15)) break;
                    var21_21 = var12_12.getInt(var4_4, var24_24);
                    var10_10 = var5_5;
                    var10_10 = (g_0)var5_5;
                    var10_10.j(var17_17, (int)var21_21);
                    break;
                }
                case 3: {
                    var19_19 = 0;
                    if (!(var21_21 &= var15_15)) break;
                    var29_28 = var12_12.getLong(var4_4, var24_24);
                    var28_27 = var5_5;
                    var28_27 = (g_0)var5_5;
                    var28_27.t(var17_17, var29_28);
                    break;
                }
                case 2: {
                    var19_19 = 0;
                    if (!(var21_21 &= var15_15)) break;
                    var29_28 = var12_12.getLong(var4_4, var24_24);
                    var28_27 = var5_5;
                    var28_27 = (g_0)var5_5;
                    var28_27.k(var17_17, var29_28);
                    break;
                }
                case 1: {
                    var19_19 = 0;
                    if (!(var21_21 &= var15_15)) break;
                    var27_26 = nw3.d;
                    var26_25 = var27_26.f(var4_4, var24_24);
                    var10_10 = var5_5;
                    var10_10 = (g_0)var5_5;
                    var10_10.h(var17_17, var26_25);
                    break;
                }
                case 0: {
                    var19_19 = 0;
                    if (!(var21_21 &= var15_15)) break;
                    var27_26 = nw3.d;
                    var31_29 = var27_26.e(var4_4, var24_24);
                    var28_27 = var5_5;
                    var28_27 = (g_0)var5_5;
                    var28_27.c(var17_17, var31_29);
                }
            }
            var10_10 = var22_22;
            var11_11 = var23_23;
        }
        if (var8_8 == null) {
            var8_8 = var3_3.o;
            var4_4 = var8_8.g(var4_4);
            var8_8.r(var4_4, var5_5);
            return;
        }
        var7_7.j((Map.Entry)var8_8);
        throw null;
    }

    public final void G(L object, int n3, Object iterator, int n4) {
        if (iterator != null) {
            boolean bl2;
            Object object2 = this.f(n4);
            Object object3 = this.q;
            object2 = object3.forMapMetadata(object2);
            iterator = object3.forMapData(iterator);
            object = ((g_0)object).a;
            object.getClass();
            iterator = ((v)((Object)iterator)).entrySet().iterator();
            while (bl2 = iterator.hasNext()) {
                object3 = (Map.Entry)iterator.next();
                ((CodedOutputStream)object).U(n3, 2);
                Object k2 = object3.getKey();
                Object v4 = object3.getValue();
                int n7 = u.a((u$a)object2, k2, v4);
                ((CodedOutputStream)object).W(n7);
                k2 = object3.getKey();
                object3 = object3.getValue();
                u.b((CodedOutputStream)object, (u$a)object2, k2, object3);
            }
        }
    }

    public final void a(Object object, D d2, i_0 i_02) {
        i_02.getClass();
        H h3 = this.o;
        j j3 = this.p;
        this.m(h3, j3, object, d2, i_02);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final void b(Object var1_1, L var2_2) {
        block160: {
            block159: {
                var3_3 = this;
                var4_4 = var1_1;
                var5_5 = var2_2;
                var6_6 = var2_2;
                var6_6 = (g_0)var2_2;
                var6_6.getClass();
                var7_7 = L$a.ASCENDING;
                var8_8 = L$a.DESCENDING;
                var9_9 = this.a;
                var10_10 = this.p;
                var11_11 = this.f;
                var12_12 = this.o;
                var13_13 = 0;
                var14_14 = 0.0f;
                var15_15 = null;
                var16_16 = 1048575;
                var17_17 = true;
                var18_18 = 0;
                var19_19 = null;
                if (var7_7 != var8_8) break block159;
                var7_7 = var12_12.g(var1_1);
                var12_12.r(var7_7, var2_2);
                if (var11_11 == 0) ** GOTO lbl-1000
                var7_7 = var10_10.c(var1_1);
                var8_8 = var7_7.a;
                var20_20 = (int)var8_8.isEmpty();
                if (var20_20 == 0) {
                    var20_20 = (int)var7_7.c;
                    var7_7 = var7_7.a;
                    if (var20_20 != 0) {
                        var21_22 = var7_7.g;
                        if (var21_22 == null) {
                            var21_22 = new G$b((G)var7_7);
                            var7_7.g = var21_22;
                        }
                        var7_7 = var7_7.g.iterator();
                        var8_8 = new q$b((Iterator)var7_7);
                    } else {
                        var8_8 = var7_7.g;
                        if (var8_8 == null) {
                            var7_7.g = var8_8 = new G$b((G)var7_7);
                        }
                        var7_7 = var7_7.g;
                        var8_8 = var7_7.iterator();
                    }
                    var7_7 = (Map.Entry)var8_8.next();
                } else lbl-1000:
                // 2 sources

                {
                    var22_24 = false;
                    var7_7 = null;
                }
                block142: for (var20_20 = var9_9.length + -3; var20_20 >= 0; var20_20 += -3) {
                    var11_11 = var3_3.E(var20_20);
                    var23_26 = var9_9[var20_20];
                    if (var7_7 != null) {
                        var10_10.a((Map.Entry)var7_7);
                        if (var23_26 < 0) {
                            var10_10.j((Map.Entry)var7_7);
                            throw null;
                        }
                    }
                    var24_27 = z.D(var11_11);
                    switch (var24_27) {
                        default: {
                            continue block142;
                        }
                        case 68: {
                            var24_27 = (int)var3_3.k(var4_4, var23_26, var20_20);
                            if (var24_27 == 0) continue block142;
                            var25_29 = var11_11 &= var16_16;
                            var21_22 = nw3.d.i(var4_4, var25_29);
                            var27_31 = var3_3.g(var20_20);
                            var6_6.i(var23_26, var21_22, var27_31);
                            continue block142;
                        }
                        case 67: {
                            var24_27 = (int)var3_3.k(var4_4, var23_26, var20_20);
                            if (var24_27 == 0) continue block142;
                            var25_29 = var11_11 &= var16_16;
                            var25_29 = z.u(var4_4, var25_29);
                            var6_6.q(var23_26, var25_29);
                            continue block142;
                        }
                        case 66: {
                            var24_27 = (int)var3_3.k(var4_4, var23_26, var20_20);
                            if (var24_27 == 0) continue block142;
                            var25_29 = var11_11 & var16_16;
                            var11_11 = z.t(var4_4, var25_29);
                            var6_6.p(var23_26, var11_11);
                            continue block142;
                        }
                        case 65: {
                            var24_27 = (int)var3_3.k(var4_4, var23_26, var20_20);
                            if (var24_27 == 0) continue block142;
                            var25_29 = var11_11 &= var16_16;
                            var25_29 = z.u(var4_4, var25_29);
                            var6_6.o(var23_26, var25_29);
                            continue block142;
                        }
                        case 64: {
                            var24_27 = (int)var3_3.k(var4_4, var23_26, var20_20);
                            if (var24_27 == 0) continue block142;
                            var25_29 = var11_11 & var16_16;
                            var11_11 = z.t(var4_4, var25_29);
                            var6_6.n(var23_26, var11_11);
                            continue block142;
                        }
                        case 63: {
                            var24_27 = (int)var3_3.k(var4_4, var23_26, var20_20);
                            if (var24_27 == 0) continue block142;
                            var25_29 = var11_11 & var16_16;
                            var11_11 = z.t(var4_4, var25_29);
                            var6_6.e(var23_26, var11_11);
                            continue block142;
                        }
                        case 62: {
                            var24_27 = (int)var3_3.k(var4_4, var23_26, var20_20);
                            if (var24_27 == 0) continue block142;
                            var25_29 = var11_11 & var16_16;
                            var11_11 = z.t(var4_4, var25_29);
                            var6_6.s(var23_26, var11_11);
                            continue block142;
                        }
                        case 61: {
                            var24_27 = (int)var3_3.k(var4_4, var23_26, var20_20);
                            if (var24_27 == 0) continue block142;
                            var25_29 = var11_11 &= var16_16;
                            var21_22 = (DF)nw3.d.i(var4_4, var25_29);
                            var6_6.b(var23_26, (DF)var21_22);
                            continue block142;
                        }
                        case 60: {
                            var24_27 = (int)var3_3.k(var4_4, var23_26, var20_20);
                            if (var24_27 == 0) continue block142;
                            var25_29 = var11_11 &= var16_16;
                            var21_22 = nw3.d.i(var4_4, var25_29);
                            var27_31 = var3_3.g(var20_20);
                            var6_6.l(var23_26, var21_22, var27_31);
                            continue block142;
                        }
                        case 59: {
                            var24_27 = (int)var3_3.k(var4_4, var23_26, var20_20);
                            if (var24_27 == 0) continue block142;
                            var25_29 = var11_11 &= var16_16;
                            var21_22 = nw3.d.i(var4_4, var25_29);
                            z.H(var23_26, var21_22, var5_5);
                            continue block142;
                        }
                        case 58: {
                            var24_27 = (int)var3_3.k(var4_4, var23_26, var20_20);
                            if (var24_27 == 0) continue block142;
                            var25_29 = var11_11 & var16_16;
                            var21_22 = (Boolean)nw3.d.i(var4_4, var25_29);
                            var11_11 = (int)var21_22.booleanValue();
                            var6_6.a(var23_26, (boolean)var11_11);
                            continue block142;
                        }
                        case 57: {
                            var24_27 = (int)var3_3.k(var4_4, var23_26, var20_20);
                            if (var24_27 == 0) continue block142;
                            var25_29 = var11_11 & var16_16;
                            var11_11 = z.t(var4_4, var25_29);
                            var6_6.f(var23_26, var11_11);
                            continue block142;
                        }
                        case 56: {
                            var24_27 = (int)var3_3.k(var4_4, var23_26, var20_20);
                            if (var24_27 == 0) continue block142;
                            var25_29 = var11_11 &= var16_16;
                            var25_29 = z.u(var4_4, var25_29);
                            var6_6.g(var23_26, var25_29);
                            continue block142;
                        }
                        case 55: {
                            var24_27 = (int)var3_3.k(var4_4, var23_26, var20_20);
                            if (var24_27 == 0) continue block142;
                            var25_29 = var11_11 & var16_16;
                            var11_11 = z.t(var4_4, var25_29);
                            var6_6.j(var23_26, var11_11);
                            continue block142;
                        }
                        case 54: {
                            var24_27 = (int)var3_3.k(var4_4, var23_26, var20_20);
                            if (var24_27 == 0) continue block142;
                            var25_29 = var11_11 &= var16_16;
                            var25_29 = z.u(var4_4, var25_29);
                            var6_6.t(var23_26, var25_29);
                            continue block142;
                        }
                        case 53: {
                            var24_27 = (int)var3_3.k(var4_4, var23_26, var20_20);
                            if (var24_27 == 0) continue block142;
                            var25_29 = var11_11 &= var16_16;
                            var25_29 = z.u(var4_4, var25_29);
                            var6_6.k(var23_26, var25_29);
                            continue block142;
                        }
                        case 52: {
                            var24_27 = (int)var3_3.k(var4_4, var23_26, var20_20);
                            if (var24_27 == 0) continue block142;
                            var25_29 = var11_11 &= var16_16;
                            var21_22 = (Float)nw3.d.i(var4_4, var25_29);
                            var28_33 = var21_22.floatValue();
                            var6_6.h(var23_26, var28_33);
                            continue block142;
                        }
                        case 51: {
                            var24_27 = (int)var3_3.k(var4_4, var23_26, var20_20);
                            if (var24_27 == 0) continue block142;
                            var25_29 = var11_11 &= var16_16;
                            var21_22 = (Double)nw3.d.i(var4_4, var25_29);
                            var29_35 = var21_22.doubleValue();
                            var6_6.c(var23_26, var29_35);
                            continue block142;
                        }
                        case 50: {
                            var25_29 = var11_11 &= var16_16;
                            var21_22 = nw3.d.i(var4_4, var25_29);
                            var3_3.G(var5_5, var23_26, var21_22, var20_20);
                            continue block142;
                        }
                        case 49: {
                            var23_26 = var9_9[var20_20];
                            var25_29 = var11_11 &= var16_16;
                            var21_22 = (List)nw3.d.i(var4_4, var25_29);
                            var27_31 = var3_3.g(var20_20);
                            E.L(var23_26, (List)var21_22, var5_5, var27_31);
                            continue block142;
                        }
                        case 48: {
                            var23_26 = var9_9[var20_20];
                            var25_29 = var11_11 &= var16_16;
                            var21_22 = (List)nw3.d.i(var4_4, var25_29);
                            E.S(var23_26, (List)var21_22, var5_5, var17_17);
                            continue block142;
                        }
                        case 47: {
                            var23_26 = var9_9[var20_20];
                            var25_29 = var11_11 &= var16_16;
                            var21_22 = (List)nw3.d.i(var4_4, var25_29);
                            E.R(var23_26, (List)var21_22, var5_5, var17_17);
                            continue block142;
                        }
                        case 46: {
                            var23_26 = var9_9[var20_20];
                            var25_29 = var11_11 &= var16_16;
                            var21_22 = (List)nw3.d.i(var4_4, var25_29);
                            E.Q(var23_26, (List)var21_22, var5_5, var17_17);
                            continue block142;
                        }
                        case 45: {
                            var23_26 = var9_9[var20_20];
                            var25_29 = var11_11 &= var16_16;
                            var21_22 = (List)nw3.d.i(var4_4, var25_29);
                            E.P(var23_26, (List)var21_22, var5_5, var17_17);
                            continue block142;
                        }
                        case 44: {
                            var23_26 = var9_9[var20_20];
                            var25_29 = var11_11 &= var16_16;
                            var21_22 = (List)nw3.d.i(var4_4, var25_29);
                            E.H(var23_26, (List)var21_22, var5_5, var17_17);
                            continue block142;
                        }
                        case 43: {
                            var23_26 = var9_9[var20_20];
                            var25_29 = var11_11 &= var16_16;
                            var21_22 = (List)nw3.d.i(var4_4, var25_29);
                            E.U(var23_26, (List)var21_22, var5_5, var17_17);
                            continue block142;
                        }
                        case 42: {
                            var23_26 = var9_9[var20_20];
                            var25_29 = var11_11 &= var16_16;
                            var21_22 = (List)nw3.d.i(var4_4, var25_29);
                            E.E(var23_26, (List)var21_22, var5_5, var17_17);
                            continue block142;
                        }
                        case 41: {
                            var23_26 = var9_9[var20_20];
                            var25_29 = var11_11 &= var16_16;
                            var21_22 = (List)nw3.d.i(var4_4, var25_29);
                            E.I(var23_26, (List)var21_22, var5_5, var17_17);
                            continue block142;
                        }
                        case 40: {
                            var23_26 = var9_9[var20_20];
                            var25_29 = var11_11 &= var16_16;
                            var21_22 = (List)nw3.d.i(var4_4, var25_29);
                            E.J(var23_26, (List)var21_22, var5_5, var17_17);
                            continue block142;
                        }
                        case 39: {
                            var23_26 = var9_9[var20_20];
                            var25_29 = var11_11 &= var16_16;
                            var21_22 = (List)nw3.d.i(var4_4, var25_29);
                            E.M(var23_26, (List)var21_22, var5_5, var17_17);
                            continue block142;
                        }
                        case 38: {
                            var23_26 = var9_9[var20_20];
                            var25_29 = var11_11 &= var16_16;
                            var21_22 = (List)nw3.d.i(var4_4, var25_29);
                            E.V(var23_26, (List)var21_22, var5_5, var17_17);
                            continue block142;
                        }
                        case 37: {
                            var23_26 = var9_9[var20_20];
                            var25_29 = var11_11 &= var16_16;
                            var21_22 = (List)nw3.d.i(var4_4, var25_29);
                            E.N(var23_26, (List)var21_22, var5_5, var17_17);
                            continue block142;
                        }
                        case 36: {
                            var23_26 = var9_9[var20_20];
                            var25_29 = var11_11 &= var16_16;
                            var21_22 = (List)nw3.d.i(var4_4, var25_29);
                            E.K(var23_26, (List)var21_22, var5_5, var17_17);
                            continue block142;
                        }
                        case 35: {
                            var23_26 = var9_9[var20_20];
                            var25_29 = var11_11 &= var16_16;
                            var21_22 = (List)nw3.d.i(var4_4, var25_29);
                            E.G(var23_26, (List)var21_22, var5_5, var17_17);
                            continue block142;
                        }
                        case 34: {
                            var23_26 = var9_9[var20_20];
                            var25_29 = var11_11 &= var16_16;
                            var21_22 = (List)nw3.d.i(var4_4, var25_29);
                            E.S(var23_26, (List)var21_22, var5_5, false);
                            continue block142;
                        }
                        case 33: {
                            var23_26 = var9_9[var20_20];
                            var25_29 = var11_11 &= var16_16;
                            var21_22 = (List)nw3.d.i(var4_4, var25_29);
                            E.R(var23_26, (List)var21_22, var5_5, false);
                            continue block142;
                        }
                        case 32: {
                            var23_26 = var9_9[var20_20];
                            var25_29 = var11_11 &= var16_16;
                            var21_22 = (List)nw3.d.i(var4_4, var25_29);
                            E.Q(var23_26, (List)var21_22, var5_5, false);
                            continue block142;
                        }
                        case 31: {
                            var23_26 = var9_9[var20_20];
                            var25_29 = var11_11 &= var16_16;
                            var21_22 = (List)nw3.d.i(var4_4, var25_29);
                            E.P(var23_26, (List)var21_22, var5_5, false);
                            continue block142;
                        }
                        case 30: {
                            var23_26 = var9_9[var20_20];
                            var25_29 = var11_11 &= var16_16;
                            var21_22 = (List)nw3.d.i(var4_4, var25_29);
                            E.H(var23_26, (List)var21_22, var5_5, false);
                            continue block142;
                        }
                        case 29: {
                            var23_26 = var9_9[var20_20];
                            var25_29 = var11_11 &= var16_16;
                            var21_22 = (List)nw3.d.i(var4_4, var25_29);
                            E.U(var23_26, (List)var21_22, var5_5, false);
                            continue block142;
                        }
                        case 28: {
                            var23_26 = var9_9[var20_20];
                            var25_29 = var11_11 &= var16_16;
                            var21_22 = (List)nw3.d.i(var4_4, var25_29);
                            E.F(var23_26, (List)var21_22, var5_5);
                            continue block142;
                        }
                        case 27: {
                            var23_26 = var9_9[var20_20];
                            var25_29 = var11_11 &= var16_16;
                            var21_22 = (List)nw3.d.i(var4_4, var25_29);
                            var27_31 = var3_3.g(var20_20);
                            E.O(var23_26, (List)var21_22, var5_5, var27_31);
                            continue block142;
                        }
                        case 26: {
                            var23_26 = var9_9[var20_20];
                            var25_29 = var11_11 &= var16_16;
                            var21_22 = (List)nw3.d.i(var4_4, var25_29);
                            E.T(var23_26, (List)var21_22, var5_5);
                            continue block142;
                        }
                        case 25: {
                            var23_26 = var9_9[var20_20];
                            var25_29 = var11_11 &= var16_16;
                            var21_22 = (List)nw3.d.i(var4_4, var25_29);
                            E.E(var23_26, (List)var21_22, var5_5, false);
                            continue block142;
                        }
                        case 24: {
                            var23_26 = var9_9[var20_20];
                            var25_29 = var11_11 &= var16_16;
                            var21_22 = (List)nw3.d.i(var4_4, var25_29);
                            E.I(var23_26, (List)var21_22, var5_5, false);
                            continue block142;
                        }
                        case 23: {
                            var23_26 = var9_9[var20_20];
                            var25_29 = var11_11 &= var16_16;
                            var21_22 = (List)nw3.d.i(var4_4, var25_29);
                            E.J(var23_26, (List)var21_22, var5_5, false);
                            continue block142;
                        }
                        case 22: {
                            var23_26 = var9_9[var20_20];
                            var25_29 = var11_11 &= var16_16;
                            var21_22 = (List)nw3.d.i(var4_4, var25_29);
                            E.M(var23_26, (List)var21_22, var5_5, false);
                            continue block142;
                        }
                        case 21: {
                            var23_26 = var9_9[var20_20];
                            var25_29 = var11_11 &= var16_16;
                            var21_22 = (List)nw3.d.i(var4_4, var25_29);
                            E.V(var23_26, (List)var21_22, var5_5, false);
                            continue block142;
                        }
                        case 20: {
                            var23_26 = var9_9[var20_20];
                            var25_29 = var11_11 &= var16_16;
                            var21_22 = (List)nw3.d.i(var4_4, var25_29);
                            E.N(var23_26, (List)var21_22, var5_5, false);
                            continue block142;
                        }
                        case 19: {
                            var23_26 = var9_9[var20_20];
                            var25_29 = var11_11 &= var16_16;
                            var21_22 = (List)nw3.d.i(var4_4, var25_29);
                            E.K(var23_26, (List)var21_22, var5_5, false);
                            continue block142;
                        }
                        case 18: {
                            var23_26 = var9_9[var20_20];
                            var25_29 = var11_11 &= var16_16;
                            var21_22 = (List)nw3.d.i(var4_4, var25_29);
                            E.G(var23_26, (List)var21_22, var5_5, false);
                            continue block142;
                        }
                        case 17: {
                            var24_27 = (int)var3_3.j(var4_4, var20_20);
                            if (var24_27 == 0) continue block142;
                            var25_29 = var11_11 &= var16_16;
                            var21_22 = nw3.d.i(var4_4, var25_29);
                            var27_31 = var3_3.g(var20_20);
                            var6_6.i(var23_26, var21_22, var27_31);
                            continue block142;
                        }
                        case 16: {
                            var24_27 = (int)var3_3.j(var4_4, var20_20);
                            if (var24_27 == 0) continue block142;
                            var25_29 = var11_11 &= var16_16;
                            var21_22 = nw3.d;
                            var25_29 = var21_22.h(var4_4, var25_29);
                            var6_6.q(var23_26, var25_29);
                            continue block142;
                        }
                        case 15: {
                            var24_27 = (int)var3_3.j(var4_4, var20_20);
                            if (var24_27 == 0) continue block142;
                            var25_29 = var11_11 & var16_16;
                            var21_22 = nw3.d;
                            var11_11 = var21_22.g(var4_4, var25_29);
                            var6_6.p(var23_26, var11_11);
                            continue block142;
                        }
                        case 14: {
                            var24_27 = (int)var3_3.j(var4_4, var20_20);
                            if (var24_27 == 0) continue block142;
                            var25_29 = var11_11 &= var16_16;
                            var21_22 = nw3.d;
                            var25_29 = var21_22.h(var4_4, var25_29);
                            var6_6.o(var23_26, var25_29);
                            continue block142;
                        }
                        case 13: {
                            var24_27 = (int)var3_3.j(var4_4, var20_20);
                            if (var24_27 == 0) continue block142;
                            var25_29 = var11_11 & var16_16;
                            var21_22 = nw3.d;
                            var11_11 = var21_22.g(var4_4, var25_29);
                            var6_6.n(var23_26, var11_11);
                            continue block142;
                        }
                        case 12: {
                            var24_27 = (int)var3_3.j(var4_4, var20_20);
                            if (var24_27 == 0) continue block142;
                            var25_29 = var11_11 & var16_16;
                            var21_22 = nw3.d;
                            var11_11 = var21_22.g(var4_4, var25_29);
                            var6_6.e(var23_26, var11_11);
                            continue block142;
                        }
                        case 11: {
                            var24_27 = (int)var3_3.j(var4_4, var20_20);
                            if (var24_27 == 0) continue block142;
                            var25_29 = var11_11 & var16_16;
                            var21_22 = nw3.d;
                            var11_11 = var21_22.g(var4_4, var25_29);
                            var6_6.s(var23_26, var11_11);
                            continue block142;
                        }
                        case 10: {
                            var24_27 = (int)var3_3.j(var4_4, var20_20);
                            if (var24_27 == 0) continue block142;
                            var25_29 = var11_11 &= var16_16;
                            var21_22 = (DF)nw3.d.i(var4_4, var25_29);
                            var6_6.b(var23_26, (DF)var21_22);
                            continue block142;
                        }
                        case 9: {
                            var24_27 = (int)var3_3.j(var4_4, var20_20);
                            if (var24_27 == 0) continue block142;
                            var25_29 = var11_11 &= var16_16;
                            var21_22 = nw3.d.i(var4_4, var25_29);
                            var27_31 = var3_3.g(var20_20);
                            var6_6.l(var23_26, var21_22, var27_31);
                            continue block142;
                        }
                        case 8: {
                            var24_27 = (int)var3_3.j(var4_4, var20_20);
                            if (var24_27 == 0) continue block142;
                            var25_29 = var11_11 &= var16_16;
                            var21_22 = nw3.d.i(var4_4, var25_29);
                            z.H(var23_26, var21_22, var5_5);
                            continue block142;
                        }
                        case 7: {
                            var24_27 = (int)var3_3.j(var4_4, var20_20);
                            if (var24_27 == 0) continue block142;
                            var25_29 = var11_11 & var16_16;
                            var21_22 = nw3.d;
                            var11_11 = (int)var21_22.c(var4_4, var25_29);
                            var6_6.a(var23_26, (boolean)var11_11);
                            continue block142;
                        }
                        case 6: {
                            var24_27 = (int)var3_3.j(var4_4, var20_20);
                            if (var24_27 == 0) continue block142;
                            var25_29 = var11_11 & var16_16;
                            var21_22 = nw3.d;
                            var11_11 = var21_22.g(var4_4, var25_29);
                            var6_6.f(var23_26, var11_11);
                            continue block142;
                        }
                        case 5: {
                            var24_27 = (int)var3_3.j(var4_4, var20_20);
                            if (var24_27 == 0) continue block142;
                            var25_29 = var11_11 &= var16_16;
                            var21_22 = nw3.d;
                            var25_29 = var21_22.h(var4_4, var25_29);
                            var6_6.g(var23_26, var25_29);
                            continue block142;
                        }
                        case 4: {
                            var24_27 = (int)var3_3.j(var4_4, var20_20);
                            if (var24_27 == 0) continue block142;
                            var25_29 = var11_11 & var16_16;
                            var21_22 = nw3.d;
                            var11_11 = var21_22.g(var4_4, var25_29);
                            var6_6.j(var23_26, var11_11);
                            continue block142;
                        }
                        case 3: {
                            var24_27 = (int)var3_3.j(var4_4, var20_20);
                            if (var24_27 == 0) continue block142;
                            var25_29 = var11_11 &= var16_16;
                            var21_22 = nw3.d;
                            var25_29 = var21_22.h(var4_4, var25_29);
                            var6_6.t(var23_26, var25_29);
                            continue block142;
                        }
                        case 2: {
                            var24_27 = (int)var3_3.j(var4_4, var20_20);
                            if (var24_27 == 0) continue block142;
                            var25_29 = var11_11 &= var16_16;
                            var21_22 = nw3.d;
                            var25_29 = var21_22.h(var4_4, var25_29);
                            var6_6.k(var23_26, var25_29);
                            continue block142;
                        }
                        case 1: {
                            var24_27 = (int)var3_3.j(var4_4, var20_20);
                            if (var24_27 == 0) continue block142;
                            var25_29 = var11_11 &= var16_16;
                            var21_22 = nw3.d;
                            var28_33 = var21_22.f(var4_4, var25_29);
                            var6_6.h(var23_26, var28_33);
                            continue block142;
                        }
                        case 0: {
                            var24_27 = (int)var3_3.j(var4_4, var20_20);
                            if (var24_27 == 0) continue block142;
                            var25_29 = var11_11 &= var16_16;
                            var21_22 = nw3.d;
                            var29_35 = var21_22.e(var4_4, var25_29);
                            var6_6.c(var23_26, var29_35);
                        }
                    }
                }
                if (var7_7 != null) {
                    var10_10.j((Map.Entry)var7_7);
                    throw null;
                }
                break block160;
            }
            var22_25 = this.h;
            if (!var22_25) ** GOTO lbl1138
            if (var11_11 == 0) ** GOTO lbl-1000
            var7_7 = var10_10.c(var1_1);
            var8_8 = var7_7.a;
            var20_21 = (int)var8_8.isEmpty();
            if (var20_21 == 0) {
                var7_7 = (Map.Entry)var7_7.i().next();
            } else lbl-1000:
            // 2 sources

            {
                var22_25 = false;
                var7_7 = null;
            }
            var20_21 = var9_9.length;
            var28_34 = 0.0f;
            var21_23 = null;
            for (var11_11 = 0; var11_11 < var20_21; var11_11 += 3) {
                var24_28 = var3_3.E(var11_11);
                var31_36 = var9_9[var11_11];
                if (var7_7 != null) {
                    var10_10.a((Map.Entry)var7_7);
                    if (var31_36 >= 0) {
                        var10_10.j((Map.Entry)var7_7);
                        throw null;
                    }
                }
                var32_37 = z.D(var24_28);
                switch (var32_37) {
                    default: {
                        break;
                    }
                    case 68: {
                        var32_37 = (int)var3_3.k(var4_4, var31_36, var11_11);
                        if (var32_37 == 0) break;
                        var33_38 = var24_28 &= var16_16;
                        var15_15 = nw3.d.i(var4_4, var33_38);
                        var19_19 = var3_3.g(var11_11);
                        var6_6.i(var31_36, var15_15, (st2_0)var19_19);
                        break;
                    }
                    case 67: {
                        var13_13 = (int)var3_3.k(var4_4, var31_36, var11_11);
                        if (var13_13 == 0) break;
                        var13_13 = var24_28 & var16_16;
                        var33_38 = var13_13;
                        var33_38 = z.u(var4_4, var33_38);
                        var6_6.q(var31_36, var33_38);
                        break;
                    }
                    case 66: {
                        var13_13 = (int)var3_3.k(var4_4, var31_36, var11_11);
                        if (var13_13 == 0) break;
                        var33_38 = var24_28 & var16_16;
                        var13_13 = z.t(var4_4, var33_38);
                        var6_6.p(var31_36, var13_13);
                        break;
                    }
                    case 65: {
                        var13_13 = (int)var3_3.k(var4_4, var31_36, var11_11);
                        if (var13_13 == 0) break;
                        var13_13 = var24_28 & var16_16;
                        var33_38 = var13_13;
                        var33_38 = z.u(var4_4, var33_38);
                        var6_6.o(var31_36, var33_38);
                        break;
                    }
                    case 64: {
                        var13_13 = (int)var3_3.k(var4_4, var31_36, var11_11);
                        if (var13_13 == 0) break;
                        var33_38 = var24_28 & var16_16;
                        var13_13 = z.t(var4_4, var33_38);
                        var6_6.n(var31_36, var13_13);
                        break;
                    }
                    case 63: {
                        var13_13 = (int)var3_3.k(var4_4, var31_36, var11_11);
                        if (var13_13 == 0) break;
                        var33_38 = var24_28 & var16_16;
                        var13_13 = z.t(var4_4, var33_38);
                        var6_6.e(var31_36, var13_13);
                        break;
                    }
                    case 62: {
                        var13_13 = (int)var3_3.k(var4_4, var31_36, var11_11);
                        if (var13_13 == 0) break;
                        var33_38 = var24_28 & var16_16;
                        var13_13 = z.t(var4_4, var33_38);
                        var6_6.s(var31_36, var13_13);
                        break;
                    }
                    case 61: {
                        var13_13 = (int)var3_3.k(var4_4, var31_36, var11_11);
                        if (var13_13 == 0) break;
                        var13_13 = var24_28 & var16_16;
                        var33_38 = var13_13;
                        var15_15 = (DF)nw3.d.i(var4_4, var33_38);
                        var6_6.b(var31_36, (DF)var15_15);
                        break;
                    }
                    case 60: {
                        var13_13 = (int)var3_3.k(var4_4, var31_36, var11_11);
                        if (var13_13 == 0) break;
                        var13_13 = var24_28 & var16_16;
                        var33_38 = var13_13;
                        var15_15 = nw3.d.i(var4_4, var33_38);
                        var19_19 = var3_3.g(var11_11);
                        var6_6.l(var31_36, var15_15, (st2_0)var19_19);
                        break;
                    }
                    case 59: {
                        var13_13 = (int)var3_3.k(var4_4, var31_36, var11_11);
                        if (var13_13 == 0) break;
                        var13_13 = var24_28 & var16_16;
                        var33_38 = var13_13;
                        var15_15 = nw3.d.i(var4_4, var33_38);
                        z.H(var31_36, var15_15, var5_5);
                        break;
                    }
                    case 58: {
                        var13_13 = (int)var3_3.k(var4_4, var31_36, var11_11);
                        if (var13_13 == 0) break;
                        var33_38 = var24_28 & var16_16;
                        var15_15 = (Boolean)nw3.d.i(var4_4, var33_38);
                        var13_13 = (int)var15_15.booleanValue();
                        var6_6.a(var31_36, (boolean)var13_13);
                        break;
                    }
                    case 57: {
                        var13_13 = (int)var3_3.k(var4_4, var31_36, var11_11);
                        if (var13_13 == 0) break;
                        var33_38 = var24_28 & var16_16;
                        var13_13 = z.t(var4_4, var33_38);
                        var6_6.f(var31_36, var13_13);
                        break;
                    }
                    case 56: {
                        var13_13 = (int)var3_3.k(var4_4, var31_36, var11_11);
                        if (var13_13 == 0) break;
                        var13_13 = var24_28 & var16_16;
                        var33_38 = var13_13;
                        var33_38 = z.u(var4_4, var33_38);
                        var6_6.g(var31_36, var33_38);
                        break;
                    }
                    case 55: {
                        var13_13 = (int)var3_3.k(var4_4, var31_36, var11_11);
                        if (var13_13 == 0) break;
                        var33_38 = var24_28 & var16_16;
                        var13_13 = z.t(var4_4, var33_38);
                        var6_6.j(var31_36, var13_13);
                        break;
                    }
                    case 54: {
                        var13_13 = (int)var3_3.k(var4_4, var31_36, var11_11);
                        if (var13_13 == 0) break;
                        var13_13 = var24_28 & var16_16;
                        var33_38 = var13_13;
                        var33_38 = z.u(var4_4, var33_38);
                        var6_6.t(var31_36, var33_38);
                        break;
                    }
                    case 53: {
                        var13_13 = (int)var3_3.k(var4_4, var31_36, var11_11);
                        if (var13_13 == 0) break;
                        var13_13 = var24_28 & var16_16;
                        var33_38 = var13_13;
                        var33_38 = z.u(var4_4, var33_38);
                        var6_6.k(var31_36, var33_38);
                        break;
                    }
                    case 52: {
                        var13_13 = (int)var3_3.k(var4_4, var31_36, var11_11);
                        if (var13_13 == 0) break;
                        var13_13 = var24_28 & var16_16;
                        var33_38 = var13_13;
                        var15_15 = (Float)nw3.d.i(var4_4, var33_38);
                        var14_14 = var15_15.floatValue();
                        var6_6.h(var31_36, var14_14);
                        break;
                    }
                    case 51: {
                        var13_13 = (int)var3_3.k(var4_4, var31_36, var11_11);
                        if (var13_13 == 0) break;
                        var13_13 = var24_28 & var16_16;
                        var33_38 = var13_13;
                        var15_15 = (Double)nw3.d.i(var4_4, var33_38);
                        var35_39 = var15_15.doubleValue();
                        var6_6.c(var31_36, var35_39);
                        break;
                    }
                    case 50: {
                        var13_13 = var24_28 & var16_16;
                        var33_38 = var13_13;
                        var15_15 = nw3.d.i(var4_4, var33_38);
                        var3_3.G(var5_5, var31_36, var15_15, var11_11);
                        break;
                    }
                    case 49: {
                        var13_13 = var9_9[var11_11];
                        var18_18 = var24_28 & var16_16;
                        var33_38 = var18_18;
                        var37_40 = nw3.d;
                        var19_19 = (List)var37_40.i(var4_4, var33_38);
                        var27_32 = var3_3.g(var11_11);
                        E.L(var13_13, (List)var19_19, var5_5, (st2_0)var27_32);
                        break;
                    }
                    case 48: {
                        var13_13 = var9_9[var11_11];
                        var18_18 = var24_28 & var16_16;
                        var33_38 = var18_18;
                        var37_40 = nw3.d;
                        var19_19 = (List)var37_40.i(var4_4, var33_38);
                        E.S(var13_13, (List)var19_19, var5_5, var17_17);
                        break;
                    }
                    case 47: {
                        var13_13 = var9_9[var11_11];
                        var18_18 = var24_28 & var16_16;
                        var33_38 = var18_18;
                        var37_40 = nw3.d;
                        var19_19 = (List)var37_40.i(var4_4, var33_38);
                        E.R(var13_13, (List)var19_19, var5_5, var17_17);
                        break;
                    }
                    case 46: {
                        var13_13 = var9_9[var11_11];
                        var18_18 = var24_28 & var16_16;
                        var33_38 = var18_18;
                        var37_40 = nw3.d;
                        var19_19 = (List)var37_40.i(var4_4, var33_38);
                        E.Q(var13_13, (List)var19_19, var5_5, var17_17);
                        break;
                    }
                    case 45: {
                        var13_13 = var9_9[var11_11];
                        var18_18 = var24_28 & var16_16;
                        var33_38 = var18_18;
                        var37_40 = nw3.d;
                        var19_19 = (List)var37_40.i(var4_4, var33_38);
                        E.P(var13_13, (List)var19_19, var5_5, var17_17);
                        break;
                    }
                    case 44: {
                        var13_13 = var9_9[var11_11];
                        var18_18 = var24_28 & var16_16;
                        var33_38 = var18_18;
                        var37_40 = nw3.d;
                        var19_19 = (List)var37_40.i(var4_4, var33_38);
                        E.H(var13_13, (List)var19_19, var5_5, var17_17);
                        break;
                    }
                    case 43: {
                        var13_13 = var9_9[var11_11];
                        var18_18 = var24_28 & var16_16;
                        var33_38 = var18_18;
                        var37_40 = nw3.d;
                        var19_19 = (List)var37_40.i(var4_4, var33_38);
                        E.U(var13_13, (List)var19_19, var5_5, var17_17);
                        break;
                    }
                    case 42: {
                        var13_13 = var9_9[var11_11];
                        var18_18 = var24_28 & var16_16;
                        var33_38 = var18_18;
                        var37_40 = nw3.d;
                        var19_19 = (List)var37_40.i(var4_4, var33_38);
                        E.E(var13_13, (List)var19_19, var5_5, var17_17);
                        break;
                    }
                    case 41: {
                        var13_13 = var9_9[var11_11];
                        var18_18 = var24_28 & var16_16;
                        var33_38 = var18_18;
                        var37_40 = nw3.d;
                        var19_19 = (List)var37_40.i(var4_4, var33_38);
                        E.I(var13_13, (List)var19_19, var5_5, var17_17);
                        break;
                    }
                    case 40: {
                        var13_13 = var9_9[var11_11];
                        var18_18 = var24_28 & var16_16;
                        var33_38 = var18_18;
                        var37_40 = nw3.d;
                        var19_19 = (List)var37_40.i(var4_4, var33_38);
                        E.J(var13_13, (List)var19_19, var5_5, var17_17);
                        break;
                    }
                    case 39: {
                        var13_13 = var9_9[var11_11];
                        var18_18 = var24_28 & var16_16;
                        var33_38 = var18_18;
                        var37_40 = nw3.d;
                        var19_19 = (List)var37_40.i(var4_4, var33_38);
                        E.M(var13_13, (List)var19_19, var5_5, var17_17);
                        break;
                    }
                    case 38: {
                        var13_13 = var9_9[var11_11];
                        var18_18 = var24_28 & var16_16;
                        var33_38 = var18_18;
                        var37_40 = nw3.d;
                        var19_19 = (List)var37_40.i(var4_4, var33_38);
                        E.V(var13_13, (List)var19_19, var5_5, var17_17);
                        break;
                    }
                    case 37: {
                        var13_13 = var9_9[var11_11];
                        var18_18 = var24_28 & var16_16;
                        var33_38 = var18_18;
                        var37_40 = nw3.d;
                        var19_19 = (List)var37_40.i(var4_4, var33_38);
                        E.N(var13_13, (List)var19_19, var5_5, var17_17);
                        break;
                    }
                    case 36: {
                        var13_13 = var9_9[var11_11];
                        var18_18 = var24_28 & var16_16;
                        var33_38 = var18_18;
                        var37_40 = nw3.d;
                        var19_19 = (List)var37_40.i(var4_4, var33_38);
                        E.K(var13_13, (List)var19_19, var5_5, var17_17);
                        break;
                    }
                    case 35: {
                        var13_13 = var9_9[var11_11];
                        var18_18 = var24_28 & var16_16;
                        var33_38 = var18_18;
                        var37_40 = nw3.d;
                        var19_19 = (List)var37_40.i(var4_4, var33_38);
                        E.G(var13_13, (List)var19_19, var5_5, var17_17);
                        break;
                    }
                    case 34: {
                        var13_13 = var9_9[var11_11];
                        var18_18 = var24_28 & var16_16;
                        var33_38 = var18_18;
                        var19_19 = (List)nw3.d.i(var4_4, var33_38);
                        var31_36 = 0;
                        var37_40 = null;
                        E.S(var13_13, (List)var19_19, var5_5, false);
                        break;
                    }
                    case 33: {
                        var31_36 = 0;
                        var37_40 = null;
                        var13_13 = var9_9[var11_11];
                        var18_18 = var24_28 & var16_16;
                        var33_38 = var18_18;
                        var38_41 = (List)nw3.d.i(var4_4, var33_38);
                        E.R(var13_13, (List)var38_41, var5_5, false);
                        break;
                    }
                    case 32: {
                        var31_36 = 0;
                        var37_40 = null;
                        var13_13 = var9_9[var11_11];
                        var17_17 = var24_28 & var16_16;
                        var39_42 = (long)var17_17;
                        var27_32 = nw3.d;
                        var38_41 = (List)var27_32.i(var4_4, var39_42);
                        E.Q(var13_13, (List)var38_41, var5_5, false);
                        break;
                    }
                    case 31: {
                        var31_36 = 0;
                        var37_40 = null;
                        var13_13 = var9_9[var11_11];
                        var17_17 = var24_28 & var16_16;
                        var39_42 = (long)var17_17;
                        var27_32 = nw3.d;
                        var38_41 = (List)var27_32.i(var4_4, var39_42);
                        E.P(var13_13, (List)var38_41, var5_5, false);
                        break;
                    }
                    case 30: {
                        var31_36 = 0;
                        var37_40 = null;
                        var13_13 = var9_9[var11_11];
                        var17_17 = var24_28 & var16_16;
                        var39_42 = (long)var17_17;
                        var27_32 = nw3.d;
                        var38_41 = (List)var27_32.i(var4_4, var39_42);
                        E.H(var13_13, (List)var38_41, var5_5, false);
                        break;
                    }
                    case 29: {
                        var31_36 = 0;
                        var37_40 = null;
                        var13_13 = var9_9[var11_11];
                        var17_17 = var24_28 & var16_16;
                        var39_42 = (long)var17_17;
                        var27_32 = nw3.d;
                        var38_41 = (List)var27_32.i(var4_4, var39_42);
                        E.U(var13_13, (List)var38_41, var5_5, false);
                        break;
                    }
                    case 28: {
                        var13_13 = var9_9[var11_11];
                        var17_17 = var24_28 & var16_16;
                        var39_42 = (long)var17_17;
                        var27_32 = nw3.d;
                        var38_41 = (List)var27_32.i(var4_4, var39_42);
                        E.F(var13_13, (List)var38_41, var5_5);
                        break;
                    }
                    case 27: {
                        var13_13 = var9_9[var11_11];
                        var17_17 = var24_28 & var16_16;
                        var39_42 = (long)var17_17;
                        var27_32 = nw3.d;
                        var38_41 = (List)var27_32.i(var4_4, var39_42);
                        var19_19 = var3_3.g(var11_11);
                        E.O(var13_13, (List)var38_41, var5_5, (st2_0)var19_19);
                        break;
                    }
                    case 26: {
                        var13_13 = var9_9[var11_11];
                        var17_17 = var24_28 & var16_16;
                        var39_42 = (long)var17_17;
                        var27_32 = nw3.d;
                        var38_41 = (List)var27_32.i(var4_4, var39_42);
                        E.T(var13_13, (List)var38_41, var5_5);
                        break;
                    }
                    case 25: {
                        var13_13 = var9_9[var11_11];
                        var17_17 = var24_28 & var16_16;
                        var39_42 = (long)var17_17;
                        var27_32 = nw3.d;
                        var38_41 = (List)var27_32.i(var4_4, var39_42);
                        var18_18 = 0;
                        var19_19 = null;
                        E.E(var13_13, (List)var38_41, var5_5, false);
                        break;
                    }
                    case 24: {
                        var13_13 = var9_9[var11_11];
                        var17_17 = var24_28 & var16_16;
                        var25_30 = (long)var17_17;
                        var38_41 = (List)nw3.d.i(var4_4, var25_30);
                        E.I(var13_13, (List)var38_41, var5_5, false);
                        break;
                    }
                    case 23: {
                        var13_13 = var9_9[var11_11];
                        var17_17 = var24_28 & var16_16;
                        var25_30 = (long)var17_17;
                        var38_41 = (List)nw3.d.i(var4_4, var25_30);
                        E.J(var13_13, (List)var38_41, var5_5, false);
                        break;
                    }
                    case 22: {
                        var13_13 = var9_9[var11_11];
                        var17_17 = var24_28 & var16_16;
                        var25_30 = (long)var17_17;
                        var38_41 = (List)nw3.d.i(var4_4, var25_30);
                        E.M(var13_13, (List)var38_41, var5_5, false);
                        break;
                    }
                    case 21: {
                        var13_13 = var9_9[var11_11];
                        var17_17 = var24_28 & var16_16;
                        var25_30 = (long)var17_17;
                        var38_41 = (List)nw3.d.i(var4_4, var25_30);
                        E.V(var13_13, (List)var38_41, var5_5, false);
                        break;
                    }
                    case 20: {
                        var13_13 = var9_9[var11_11];
                        var17_17 = var24_28 & var16_16;
                        var25_30 = (long)var17_17;
                        var38_41 = (List)nw3.d.i(var4_4, var25_30);
                        E.N(var13_13, (List)var38_41, var5_5, false);
                        break;
                    }
                    case 19: {
                        var13_13 = var9_9[var11_11];
                        var17_17 = var24_28 & var16_16;
                        var25_30 = (long)var17_17;
                        var38_41 = (List)nw3.d.i(var4_4, var25_30);
                        E.K(var13_13, (List)var38_41, var5_5, false);
                        break;
                    }
                    case 18: {
                        var13_13 = var9_9[var11_11];
                        var17_17 = var24_28 & var16_16;
                        var25_30 = (long)var17_17;
                        var38_41 = (List)nw3.d.i(var4_4, var25_30);
                        E.G(var13_13, (List)var38_41, var5_5, false);
                        break;
                    }
                    case 17: {
                        var13_13 = (int)var3_3.j(var4_4, var11_11);
                        if (var13_13 == 0) break;
                        var13_13 = var24_28 & var16_16;
                        var33_38 = var13_13;
                        var15_15 = nw3.d.i(var4_4, var33_38);
                        var38_41 = var3_3.g(var11_11);
                        var6_6.i(var31_36, var15_15, (st2_0)var38_41);
                        break;
                    }
                    case 16: {
                        var13_13 = (int)var3_3.j(var4_4, var11_11);
                        if (var13_13 == 0) break;
                        var13_13 = var24_28 & var16_16;
                        var39_42 = var13_13;
                        var15_15 = nw3.d;
                        var39_42 = var15_15.h(var4_4, var39_42);
                        var6_6.q(var31_36, var39_42);
                        break;
                    }
                    case 15: {
                        var13_13 = (int)var3_3.j(var4_4, var11_11);
                        if (var13_13 == 0) break;
                        var39_42 = var24_28 & var16_16;
                        var15_15 = nw3.d;
                        var13_13 = var15_15.g(var4_4, var39_42);
                        var6_6.p(var31_36, var13_13);
                        break;
                    }
                    case 14: {
                        var13_13 = (int)var3_3.j(var4_4, var11_11);
                        if (var13_13 == 0) break;
                        var13_13 = var24_28 & var16_16;
                        var39_42 = var13_13;
                        var15_15 = nw3.d;
                        var39_42 = var15_15.h(var4_4, var39_42);
                        var6_6.o(var31_36, var39_42);
                        break;
                    }
                    case 13: {
                        var13_13 = (int)var3_3.j(var4_4, var11_11);
                        if (var13_13 == 0) break;
                        var39_42 = var24_28 & var16_16;
                        var15_15 = nw3.d;
                        var13_13 = var15_15.g(var4_4, var39_42);
                        var6_6.n(var31_36, var13_13);
                        break;
                    }
                    case 12: {
                        var13_13 = (int)var3_3.j(var4_4, var11_11);
                        if (var13_13 == 0) break;
                        var39_42 = var24_28 & var16_16;
                        var15_15 = nw3.d;
                        var13_13 = var15_15.g(var4_4, var39_42);
                        var6_6.e(var31_36, var13_13);
                        break;
                    }
                    case 11: {
                        var13_13 = (int)var3_3.j(var4_4, var11_11);
                        if (var13_13 == 0) break;
                        var39_42 = var24_28 & var16_16;
                        var15_15 = nw3.d;
                        var13_13 = var15_15.g(var4_4, var39_42);
                        var6_6.s(var31_36, var13_13);
                        break;
                    }
                    case 10: {
                        var13_13 = (int)var3_3.j(var4_4, var11_11);
                        if (var13_13 == 0) break;
                        var13_13 = var24_28 & var16_16;
                        var39_42 = var13_13;
                        var15_15 = (DF)nw3.d.i(var4_4, var39_42);
                        var6_6.b(var31_36, (DF)var15_15);
                        break;
                    }
                    case 9: {
                        var13_13 = (int)var3_3.j(var4_4, var11_11);
                        if (var13_13 == 0) break;
                        var13_13 = var24_28 & var16_16;
                        var39_42 = var13_13;
                        var15_15 = nw3.d.i(var4_4, var39_42);
                        var38_41 = var3_3.g(var11_11);
                        var6_6.l(var31_36, var15_15, (st2_0)var38_41);
                        break;
                    }
                    case 8: {
                        var13_13 = (int)var3_3.j(var4_4, var11_11);
                        if (var13_13 == 0) break;
                        var13_13 = var24_28 & var16_16;
                        var39_42 = var13_13;
                        var15_15 = nw3.d.i(var4_4, var39_42);
                        z.H(var31_36, var15_15, var5_5);
                        break;
                    }
                    case 7: {
                        var13_13 = (int)var3_3.j(var4_4, var11_11);
                        if (var13_13 == 0) break;
                        var39_42 = var24_28 & var16_16;
                        var15_15 = nw3.d;
                        var13_13 = (int)var15_15.c(var4_4, var39_42);
                        var6_6.a(var31_36, (boolean)var13_13);
                        break;
                    }
                    case 6: {
                        var13_13 = (int)var3_3.j(var4_4, var11_11);
                        if (var13_13 == 0) break;
                        var39_42 = var24_28 & var16_16;
                        var15_15 = nw3.d;
                        var13_13 = var15_15.g(var4_4, var39_42);
                        var6_6.f(var31_36, var13_13);
                        break;
                    }
                    case 5: {
                        var13_13 = (int)var3_3.j(var4_4, var11_11);
                        if (var13_13 == 0) break;
                        var13_13 = var24_28 & var16_16;
                        var39_42 = var13_13;
                        var15_15 = nw3.d;
                        var39_42 = var15_15.h(var4_4, var39_42);
                        var6_6.g(var31_36, var39_42);
                        break;
                    }
                    case 4: {
                        var13_13 = (int)var3_3.j(var4_4, var11_11);
                        if (var13_13 == 0) break;
                        var39_42 = var24_28 & var16_16;
                        var15_15 = nw3.d;
                        var13_13 = var15_15.g(var4_4, var39_42);
                        var6_6.j(var31_36, var13_13);
                        break;
                    }
                    case 3: {
                        var13_13 = (int)var3_3.j(var4_4, var11_11);
                        if (var13_13 == 0) break;
                        var13_13 = var24_28 & var16_16;
                        var39_42 = var13_13;
                        var15_15 = nw3.d;
                        var39_42 = var15_15.h(var4_4, var39_42);
                        var6_6.t(var31_36, var39_42);
                        break;
                    }
                    case 2: {
                        var13_13 = (int)var3_3.j(var4_4, var11_11);
                        if (var13_13 == 0) break;
                        var13_13 = var24_28 & var16_16;
                        var39_42 = var13_13;
                        var15_15 = nw3.d;
                        var39_42 = var15_15.h(var4_4, var39_42);
                        var6_6.k(var31_36, var39_42);
                        break;
                    }
                    case 1: {
                        var13_13 = (int)var3_3.j(var4_4, var11_11);
                        if (var13_13 == 0) break;
                        var13_13 = var24_28 & var16_16;
                        var39_42 = var13_13;
                        var15_15 = nw3.d;
                        var14_14 = var15_15.f(var4_4, var39_42);
                        var6_6.h(var31_36, var14_14);
                        break;
                    }
                    case 0: {
                        var13_13 = (int)var3_3.j(var4_4, var11_11);
                        if (var13_13 == 0) break;
                        var13_13 = var24_28 & var16_16;
                        var39_42 = var13_13;
                        var15_15 = nw3.d;
                        var41_43 = var15_15.e(var4_4, var39_42);
                        var6_6.c(var31_36, var41_43);
                    }
                }
                var13_13 = 0;
                var14_14 = 0.0f;
                var15_15 = null;
                var17_17 = true;
                var18_18 = 0;
                var19_19 = null;
            }
            if (var7_7 == null) {
                var4_4 = var12_12.g(var4_4);
                var12_12.r(var4_4, var5_5);
            } else {
                var10_10.j((Map.Entry)var7_7);
                throw null;
lbl1138:
                // 1 sources

                this.F(var1_1, var2_2);
            }
        }
    }

    public final boolean c(Object object, Object object2, int n3) {
        boolean bl2;
        boolean bl3 = this.j(object, n3);
        if (bl3 == (bl2 = this.j(object2, n3))) {
            bl3 = true;
        } else {
            bl3 = false;
            object = null;
        }
        return bl3;
    }

    public final Object d(Object object, int n3, Object object2, H h3) {
        int[] nArray = this.a;
        int n4 = nArray[n3];
        int n7 = this.E(n3);
        Object object3 = nw3.d;
        int n8 = 1048575;
        long l2 = n7 &= n8;
        if ((object = ((nw3$e)object3).i(object, l2)) == null) {
            return object2;
        }
        p$b p$b = this.e(n3);
        if (p$b == null) {
            return object2;
        }
        Object object4 = this.q;
        object = object4.forMutableMapData(object);
        Object object5 = this.f(n3);
        object5 = object4.forMapMetadata(object5);
        object = ((v)object).entrySet().iterator();
        while ((n8 = (int)(object.hasNext() ? 1 : 0)) != 0) {
            object4 = (Map.Entry)object.next();
            object3 = (Integer)object4.getValue();
            object3.getClass();
            int n10 = p$b.a();
            if (n10 != 0) continue;
            if (object2 == null) {
                object2 = h3.m();
            }
            object3 = object4.getKey();
            Object object6 = object4.getValue();
            n10 = u.a((u$a)object5, object3, object6);
            object6 = new byte[n10];
            Object object7 = CodedOutputStream.b;
            object7 = new CodedOutputStream$b((byte[])object6, n10);
            try {
                object3 = object4.getKey();
            }
            catch (IOException iOException) {
                object5 = new RuntimeException(iOException);
                throw object5;
            }
            object4 = object4.getValue();
            u.b((CodedOutputStream)object7, (u$a)object5, object3, object4);
            n8 = ((CodedOutputStream$b)object7).e;
            n10 = ((CodedOutputStream$b)object7).f;
            if ((n8 -= n10) == 0) {
                object4 = new DF$e((byte[])object6);
                h3.d(object2, n4, (DF)object4);
                object.remove();
                continue;
            }
            object = new IllegalStateException("Did not write as much data as expected.");
            throw object;
        }
        return object2;
    }

    public final p$b e(int n3) {
        n3 = n3 / 3 * 2 + 1;
        return (p$b)this.b[n3];
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final boolean equals(Object object, Object object2) {
        boolean bl2;
        Object object3 = this.a;
        int n3 = ((int[])object3).length;
        int n4 = 0;
        while (true) {
            bl2 = true;
            if (n4 >= n3) break;
            int n7 = this.E(n4);
            int n8 = 1048575;
            float f5 = 1.469367E-39f;
            int n10 = n7 & n8;
            long l2 = n10;
            n7 = z.D(n7);
            switch (n7) {
                default: {
                    break;
                }
                case 51: 
                case 52: 
                case 53: 
                case 54: 
                case 55: 
                case 56: 
                case 57: 
                case 58: 
                case 59: 
                case 60: 
                case 61: 
                case 62: 
                case 63: 
                case 64: 
                case 65: 
                case 66: 
                case 67: 
                case 68: {
                    Object object4;
                    n7 = n4 + 2;
                    long l3 = object3[n7] & n8;
                    nw3$e nw3$e = nw3.d;
                    int n14 = nw3$e.g(object, l3);
                    n7 = nw3$e.g(object2, l3);
                    if (n14 != n7) return false;
                    Object object5 = nw3$e.i(object, l2);
                    n7 = (int)(E.C(object5, object4 = nw3$e.i(object2, l2)) ? 1 : 0);
                    if (n7 == 0) return false;
                    break;
                }
                case 50: {
                    Object object6 = nw3.d;
                    Object object5 = ((nw3$e)object6).i(object, l2);
                    object6 = ((nw3$e)object6).i(object2, l2);
                    bl2 = E.C(object5, object6);
                    break;
                }
                case 18: 
                case 19: 
                case 20: 
                case 21: 
                case 22: 
                case 23: 
                case 24: 
                case 25: 
                case 26: 
                case 27: 
                case 28: 
                case 29: 
                case 30: 
                case 31: 
                case 32: 
                case 33: 
                case 34: 
                case 35: 
                case 36: 
                case 37: 
                case 38: 
                case 39: 
                case 40: 
                case 41: 
                case 42: 
                case 43: 
                case 44: 
                case 45: 
                case 46: 
                case 47: 
                case 48: 
                case 49: {
                    Object object6 = nw3.d;
                    Object object5 = ((nw3$e)object6).i(object, l2);
                    object6 = ((nw3$e)object6).i(object2, l2);
                    bl2 = E.C(object5, object6);
                    break;
                }
                case 17: {
                    n7 = (int)(this.c(object, object2, n4) ? 1 : 0);
                    if (n7 == 0) return false;
                    Object object5 = nw3.d;
                    Object object4 = ((nw3$e)object5).i(object, l2);
                    n7 = (int)(E.C(object4, object5 = ((nw3$e)object5).i(object2, l2)) ? 1 : 0);
                    if (n7 == 0) return false;
                    break;
                }
                case 16: {
                    long l3;
                    n7 = (int)(this.c(object, object2, n4) ? 1 : 0);
                    if (n7 == 0) return false;
                    Object object5 = nw3.d;
                    long l4 = ((nw3$e)object5).h(object, l2);
                    long l7 = l4 - (l3 = ((nw3$e)object5).h(object2, l2));
                    n10 = (int)(l7 == 0L ? 0 : (l7 < 0L ? -1 : 1));
                    if (n10 != 0) return false;
                    break;
                }
                case 15: {
                    n7 = (int)(this.c(object, object2, n4) ? 1 : 0);
                    if (n7 == 0) return false;
                    Object object5 = nw3.d;
                    n8 = ((nw3$e)object5).g(object, l2);
                    if (n8 != (n7 = ((nw3$e)object5).g(object2, l2))) return false;
                    break;
                }
                case 14: {
                    long l3;
                    n7 = (int)(this.c(object, object2, n4) ? 1 : 0);
                    if (n7 == 0) return false;
                    Object object5 = nw3.d;
                    long l4 = ((nw3$e)object5).h(object, l2);
                    long l8 = l4 - (l3 = ((nw3$e)object5).h(object2, l2));
                    n10 = (int)(l8 == 0L ? 0 : (l8 < 0L ? -1 : 1));
                    if (n10 != 0) return false;
                    break;
                }
                case 13: {
                    n7 = (int)(this.c(object, object2, n4) ? 1 : 0);
                    if (n7 == 0) return false;
                    Object object5 = nw3.d;
                    n8 = ((nw3$e)object5).g(object, l2);
                    if (n8 != (n7 = ((nw3$e)object5).g(object2, l2))) return false;
                    break;
                }
                case 12: {
                    n7 = (int)(this.c(object, object2, n4) ? 1 : 0);
                    if (n7 == 0) return false;
                    Object object5 = nw3.d;
                    n8 = ((nw3$e)object5).g(object, l2);
                    if (n8 != (n7 = ((nw3$e)object5).g(object2, l2))) return false;
                    break;
                }
                case 11: {
                    n7 = (int)(this.c(object, object2, n4) ? 1 : 0);
                    if (n7 == 0) return false;
                    Object object5 = nw3.d;
                    n8 = ((nw3$e)object5).g(object, l2);
                    if (n8 != (n7 = ((nw3$e)object5).g(object2, l2))) return false;
                    break;
                }
                case 10: {
                    n7 = (int)(this.c(object, object2, n4) ? 1 : 0);
                    if (n7 == 0) return false;
                    Object object5 = nw3.d;
                    Object object4 = ((nw3$e)object5).i(object, l2);
                    n7 = (int)(E.C(object4, object5 = ((nw3$e)object5).i(object2, l2)) ? 1 : 0);
                    if (n7 == 0) return false;
                    break;
                }
                case 9: {
                    n7 = (int)(this.c(object, object2, n4) ? 1 : 0);
                    if (n7 == 0) return false;
                    Object object5 = nw3.d;
                    Object object4 = ((nw3$e)object5).i(object, l2);
                    n7 = (int)(E.C(object4, object5 = ((nw3$e)object5).i(object2, l2)) ? 1 : 0);
                    if (n7 == 0) return false;
                    break;
                }
                case 8: {
                    n7 = (int)(this.c(object, object2, n4) ? 1 : 0);
                    if (n7 == 0) return false;
                    Object object5 = nw3.d;
                    Object object4 = ((nw3$e)object5).i(object, l2);
                    n7 = (int)(E.C(object4, object5 = ((nw3$e)object5).i(object2, l2)) ? 1 : 0);
                    if (n7 == 0) return false;
                    break;
                }
                case 7: {
                    n7 = (int)(this.c(object, object2, n4) ? 1 : 0);
                    if (n7 == 0) return false;
                    Object object5 = nw3.d;
                    n8 = (int)(((nw3$e)object5).c(object, l2) ? 1 : 0);
                    if (n8 != (n7 = (int)(((nw3$e)object5).c(object2, l2) ? 1 : 0))) return false;
                    break;
                }
                case 6: {
                    n7 = (int)(this.c(object, object2, n4) ? 1 : 0);
                    if (n7 == 0) return false;
                    Object object5 = nw3.d;
                    n8 = ((nw3$e)object5).g(object, l2);
                    if (n8 != (n7 = ((nw3$e)object5).g(object2, l2))) return false;
                    break;
                }
                case 5: {
                    long l3;
                    n7 = (int)(this.c(object, object2, n4) ? 1 : 0);
                    if (n7 == 0) return false;
                    Object object5 = nw3.d;
                    long l4 = ((nw3$e)object5).h(object, l2);
                    long l12 = l4 - (l3 = ((nw3$e)object5).h(object2, l2));
                    n10 = (int)(l12 == 0L ? 0 : (l12 < 0L ? -1 : 1));
                    if (n10 != 0) return false;
                    break;
                }
                case 4: {
                    n7 = (int)(this.c(object, object2, n4) ? 1 : 0);
                    if (n7 == 0) return false;
                    Object object5 = nw3.d;
                    n8 = ((nw3$e)object5).g(object, l2);
                    if (n8 != (n7 = ((nw3$e)object5).g(object2, l2))) return false;
                    break;
                }
                case 3: {
                    long l3;
                    n7 = (int)(this.c(object, object2, n4) ? 1 : 0);
                    if (n7 == 0) return false;
                    Object object5 = nw3.d;
                    long l4 = ((nw3$e)object5).h(object, l2);
                    long l14 = l4 - (l3 = ((nw3$e)object5).h(object2, l2));
                    n10 = (int)(l14 == 0L ? 0 : (l14 < 0L ? -1 : 1));
                    if (n10 != 0) return false;
                    break;
                }
                case 2: {
                    long l3;
                    n7 = (int)(this.c(object, object2, n4) ? 1 : 0);
                    if (n7 == 0) return false;
                    Object object5 = nw3.d;
                    long l4 = ((nw3$e)object5).h(object, l2);
                    long l15 = l4 - (l3 = ((nw3$e)object5).h(object2, l2));
                    n10 = (int)(l15 == 0L ? 0 : (l15 < 0L ? -1 : 1));
                    if (n10 != 0) return false;
                    break;
                }
                case 1: {
                    float f6;
                    n7 = (int)(this.c(object, object2, n4) ? 1 : 0);
                    if (n7 == 0) return false;
                    Object object5 = nw3.d;
                    f5 = ((nw3$e)object5).f(object, l2);
                    n8 = Float.floatToIntBits(f5);
                    if (n8 != (n7 = Float.floatToIntBits(f6 = ((nw3$e)object5).f(object2, l2)))) return false;
                    break;
                }
                case 0: {
                    double d2;
                    long l3;
                    n7 = (int)(this.c(object, object2, n4) ? 1 : 0);
                    if (n7 == 0) return false;
                    Object object5 = nw3.d;
                    double d5 = ((nw3$e)object5).e(object, l2);
                    long l4 = Double.doubleToLongBits(d5);
                    long l16 = l4 - (l3 = Double.doubleToLongBits(d2 = ((nw3$e)object5).e(object2, l2)));
                    n10 = (int)(l16 == 0L ? 0 : (l16 < 0L ? -1 : 1));
                    if (n10 != 0) return false;
                }
            }
            if (!bl2) {
                return false;
            }
            n4 += 3;
        }
        object3 = this.o;
        I i3 = ((H)object3).g(object);
        boolean bl3 = i3.equals(object3 = ((H)object3).g(object2));
        if (!bl3) {
            return false;
        }
        bl3 = this.f;
        if (!bl3) return bl2;
        object3 = this.p;
        object = ((j)object3).c(object);
        object2 = ((j)object3).c(object2);
        return ((l_0)object).equals(object2);
    }

    public final Object f(int n3) {
        n3 = n3 / 3 * 2;
        return this.b[n3];
    }

    public final st2_0 g(int n3) {
        Object[] objectArray = this.b;
        Object object = (st2_0)objectArray[n3 = n3 / 3 * 2];
        if (object != null) {
            return object;
        }
        object = GB2.c;
        int n4 = n3 + 1;
        Class clazz = (Class)objectArray[n4];
        objectArray[n3] = object = ((GB2)object).a(clazz);
        return object;
    }

    public final int getSerializedSize(Object object) {
        boolean bl2 = this.h;
        int n3 = bl2 ? this.i(object) : this.h(object);
        return n3;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final int h(Object var1_1) {
        var2_2 = this;
        var3_3 = var1_1;
        var4_4 = z.s;
        var5_5 = -1;
        var7_7 = 0;
        var8_8 = 0;
        block71: for (var6_6 = 0; var6_6 < (var10_10 = (var9_9 /* !! */  = var2_2.a).length); var6_6 += 3) {
            var10_10 = var2_2.E(var6_6);
            var11_11 = var9_9 /* !! */ [var6_6];
            var12_12 = z.D(var10_10);
            var13_13 = 17;
            var14_14 = 1048575;
            var15_15 = var2_2.i;
            if (var12_12 <= var13_13) {
                var13_13 = var6_6 + 2;
                var16_16 = var9_9 /* !! */ [var13_13];
                var13_13 = var16_16 & var14_14;
                var17_17 = var16_16 >>> 20;
                var18_18 = 1;
                var17_17 = var18_18 << var17_17;
                if (var13_13 != var5_5) {
                    var19_19 = var13_13;
                    var8_8 = var4_4.getInt(var3_3, var19_19);
                    var5_5 = var13_13;
                }
            } else if (var15_15 && var12_12 >= (var22_21 = (var21_20 = hL0.DOUBLE_LIST_PACKED).id()) && var12_12 <= (var22_21 = (var21_20 = hL0.SINT64_LIST_PACKED).id())) {
                var22_21 = var6_6 + 2;
                var22_21 = var9_9 /* !! */ [var22_21];
                var16_16 = var22_21 & var14_14;
lbl30:
                // 2 sources

                while (true) {
                    var17_17 = 0;
                    break;
                }
            } else {
                var16_16 = 0;
                var9_9 /* !! */  = null;
                ** continue;
            }
            var22_21 = var10_10 & var14_14;
            var23_22 = var22_21;
            switch (var12_12) {
                default: {
                    continue block71;
                }
                case 68: {
                    var22_21 = (int)var2_2.k(var3_3, var11_11, var6_6);
                    if (var22_21 == 0) continue block71;
                    var21_20 = (wo1_1)var4_4.getObject(var3_3, var23_22);
                    var9_9 /* !! */  = (int[])var2_2.g(var6_6);
                    var22_21 = CodedOutputStream.m(var11_11, (wo1_1)var21_20, (st2_0)var9_9 /* !! */ );
lbl47:
                    // 53 sources

                    while (true) {
                        var7_7 += var22_21;
                        continue block71;
                        break;
                    }
                }
                case 67: {
                    var22_21 = (int)var2_2.k(var3_3, var11_11, var6_6);
                    if (var22_21 == 0) continue block71;
                    var25_23 = z.u(var3_3, var23_22);
                    var22_21 = CodedOutputStream.u(var11_11, var25_23);
                    ** GOTO lbl47
                }
                case 66: {
                    var22_21 = (int)var2_2.k(var3_3, var11_11, var6_6);
                    if (var22_21 == 0) continue block71;
                    var22_21 = z.t(var3_3, var23_22);
                    var22_21 = CodedOutputStream.t(var11_11, var22_21);
                    ** GOTO lbl47
                }
                case 65: {
                    var22_21 = (int)var2_2.k(var3_3, var11_11, var6_6);
                    if (var22_21 == 0) continue block71;
                    var22_21 = CodedOutputStream.s(var11_11);
                    ** GOTO lbl47
                }
                case 64: {
                    var22_21 = (int)var2_2.k(var3_3, var11_11, var6_6);
                    if (var22_21 == 0) continue block71;
                    var22_21 = CodedOutputStream.r(var11_11);
                    ** GOTO lbl47
                }
                case 63: {
                    var22_21 = (int)var2_2.k(var3_3, var11_11, var6_6);
                    if (var22_21 == 0) continue block71;
                    var22_21 = z.t(var3_3, var23_22);
                    var22_21 = CodedOutputStream.i(var11_11, var22_21);
                    ** GOTO lbl47
                }
                case 62: {
                    var22_21 = (int)var2_2.k(var3_3, var11_11, var6_6);
                    if (var22_21 == 0) continue block71;
                    var22_21 = z.t(var3_3, var23_22);
                    var22_21 = CodedOutputStream.y(var11_11, var22_21);
                    ** GOTO lbl47
                }
                case 61: {
                    var22_21 = (int)var2_2.k(var3_3, var11_11, var6_6);
                    if (var22_21 == 0) continue block71;
                    var21_20 = (DF)var4_4.getObject(var3_3, var23_22);
                    var22_21 = CodedOutputStream.f(var11_11, (DF)var21_20);
                    ** GOTO lbl47
                }
                case 60: {
                    var22_21 = (int)var2_2.k(var3_3, var11_11, var6_6);
                    if (var22_21 == 0) continue block71;
                    var21_20 = var4_4.getObject(var3_3, var23_22);
                    var9_9 /* !! */  = (int[])var2_2.g(var6_6);
                    var22_21 = E.o(var11_11, var21_20, (st2_0)var9_9 /* !! */ );
                    ** GOTO lbl47
                }
                case 59: {
                    var22_21 = (int)var2_2.k(var3_3, var11_11, var6_6);
                    if (var22_21 == 0) continue block71;
                    var21_20 = var4_4.getObject(var3_3, var23_22);
                    var16_16 = var21_20 instanceof DF;
                    if (var16_16 != 0) {
                        var21_20 = (DF)var21_20;
                        var22_21 = CodedOutputStream.f(var11_11, (DF)var21_20);
lbl105:
                        // 4 sources

                        while (true) {
                            var7_7 = var22_21 += var7_7;
                            continue block71;
                            break;
                        }
                    }
                    var21_20 = (String)var21_20;
                    var22_21 = CodedOutputStream.v(var11_11, (String)var21_20);
                    ** GOTO lbl105
                }
                case 58: {
                    var22_21 = (int)var2_2.k(var3_3, var11_11, var6_6);
                    if (var22_21 == 0) continue block71;
                    var22_21 = CodedOutputStream.e(var11_11);
                    ** GOTO lbl47
                }
                case 57: {
                    var22_21 = (int)var2_2.k(var3_3, var11_11, var6_6);
                    if (var22_21 == 0) continue block71;
                    var22_21 = CodedOutputStream.j(var11_11);
                    ** GOTO lbl47
                }
                case 56: {
                    var22_21 = (int)var2_2.k(var3_3, var11_11, var6_6);
                    if (var22_21 == 0) continue block71;
                    var22_21 = CodedOutputStream.k(var11_11);
                    ** GOTO lbl47
                }
                case 55: {
                    var22_21 = (int)var2_2.k(var3_3, var11_11, var6_6);
                    if (var22_21 == 0) continue block71;
                    var22_21 = z.t(var3_3, var23_22);
                    var22_21 = CodedOutputStream.n(var11_11, var22_21);
                    ** GOTO lbl47
                }
                case 54: {
                    var22_21 = (int)var2_2.k(var3_3, var11_11, var6_6);
                    if (var22_21 == 0) continue block71;
                    var25_23 = z.u(var3_3, var23_22);
                    var22_21 = CodedOutputStream.A(var11_11, var25_23);
                    ** GOTO lbl47
                }
                case 53: {
                    var22_21 = (int)var2_2.k(var3_3, var11_11, var6_6);
                    if (var22_21 == 0) continue block71;
                    var25_23 = z.u(var3_3, var23_22);
                    var22_21 = CodedOutputStream.p(var11_11, var25_23);
                    ** GOTO lbl47
                }
                case 52: {
                    var22_21 = (int)var2_2.k(var3_3, var11_11, var6_6);
                    if (var22_21 == 0) continue block71;
                    var22_21 = CodedOutputStream.l(var11_11);
                    ** GOTO lbl47
                }
                case 51: {
                    var22_21 = (int)var2_2.k(var3_3, var11_11, var6_6);
                    if (var22_21 == 0) continue block71;
                    var22_21 = CodedOutputStream.h(var11_11);
                    ** GOTO lbl47
                }
                case 50: {
                    var21_20 = var4_4.getObject(var3_3, var23_22);
                    var9_9 /* !! */  = (int[])var2_2.f(var6_6);
                    var27_24 = var2_2.q;
                    var22_21 = var27_24.getSerializedSize(var11_11, var21_20, var9_9 /* !! */ );
                    ** GOTO lbl47
                }
                case 49: {
                    var21_20 = (List)var4_4.getObject(var3_3, var23_22);
                    var9_9 /* !! */  = (int[])var2_2.g(var6_6);
                    var22_21 = E.j(var11_11, (List)var21_20, (st2_0)var9_9 /* !! */ );
                    ** GOTO lbl47
                }
                case 48: {
                    var21_20 = (List)var4_4.getObject(var3_3, var23_22);
                    var22_21 = E.t((List)var21_20);
                    if (var22_21 <= 0) continue block71;
                    if (var15_15) {
                        var25_23 = var16_16;
                        var4_4.putInt(var3_3, var25_23, var22_21);
                    }
                    var16_16 = CodedOutputStream.x(var11_11);
                    var7_7 = VG1.a(var22_21, var16_16, var22_21, var7_7);
                    continue block71;
                }
                case 47: {
                    var21_20 = (List)var4_4.getObject(var3_3, var23_22);
                    var22_21 = E.r((List)var21_20);
                    if (var22_21 <= 0) continue block71;
                    if (var15_15) {
                        var25_23 = var16_16;
                        var4_4.putInt(var3_3, var25_23, var22_21);
                    }
                    var16_16 = CodedOutputStream.x(var11_11);
                    var7_7 = VG1.a(var22_21, var16_16, var22_21, var7_7);
                    continue block71;
                }
                case 46: {
                    var21_20 = (List)var4_4.getObject(var3_3, var23_22);
                    var22_21 = E.i((List)var21_20);
                    if (var22_21 <= 0) continue block71;
                    if (var15_15) {
                        var25_23 = var16_16;
                        var4_4.putInt(var3_3, var25_23, var22_21);
                    }
                    var16_16 = CodedOutputStream.x(var11_11);
                    var7_7 = VG1.a(var22_21, var16_16, var22_21, var7_7);
                    continue block71;
                }
                case 45: {
                    var21_20 = (List)var4_4.getObject(var3_3, var23_22);
                    var22_21 = E.g((List)var21_20);
                    if (var22_21 <= 0) continue block71;
                    if (var15_15) {
                        var25_23 = var16_16;
                        var4_4.putInt(var3_3, var25_23, var22_21);
                    }
                    var16_16 = CodedOutputStream.x(var11_11);
                    var7_7 = VG1.a(var22_21, var16_16, var22_21, var7_7);
                    continue block71;
                }
                case 44: {
                    var21_20 = (List)var4_4.getObject(var3_3, var23_22);
                    var22_21 = E.e((List)var21_20);
                    if (var22_21 <= 0) continue block71;
                    if (var15_15) {
                        var25_23 = var16_16;
                        var4_4.putInt(var3_3, var25_23, var22_21);
                    }
                    var16_16 = CodedOutputStream.x(var11_11);
                    var7_7 = VG1.a(var22_21, var16_16, var22_21, var7_7);
                    continue block71;
                }
                case 43: {
                    var21_20 = (List)var4_4.getObject(var3_3, var23_22);
                    var22_21 = E.w((List)var21_20);
                    if (var22_21 <= 0) continue block71;
                    if (var15_15) {
                        var25_23 = var16_16;
                        var4_4.putInt(var3_3, var25_23, var22_21);
                    }
                    var16_16 = CodedOutputStream.x(var11_11);
                    var7_7 = VG1.a(var22_21, var16_16, var22_21, var7_7);
                    continue block71;
                }
                case 42: {
                    var21_20 = (List)var4_4.getObject(var3_3, var23_22);
                    var22_21 = E.b((List)var21_20);
                    if (var22_21 <= 0) continue block71;
                    if (var15_15) {
                        var25_23 = var16_16;
                        var4_4.putInt(var3_3, var25_23, var22_21);
                    }
                    var16_16 = CodedOutputStream.x(var11_11);
                    var7_7 = VG1.a(var22_21, var16_16, var22_21, var7_7);
                    continue block71;
                }
                case 41: {
                    var21_20 = (List)var4_4.getObject(var3_3, var23_22);
                    var22_21 = E.g((List)var21_20);
                    if (var22_21 <= 0) continue block71;
                    if (var15_15) {
                        var25_23 = var16_16;
                        var4_4.putInt(var3_3, var25_23, var22_21);
                    }
                    var16_16 = CodedOutputStream.x(var11_11);
                    var7_7 = VG1.a(var22_21, var16_16, var22_21, var7_7);
                    continue block71;
                }
                case 40: {
                    var21_20 = (List)var4_4.getObject(var3_3, var23_22);
                    var22_21 = E.i((List)var21_20);
                    if (var22_21 <= 0) continue block71;
                    if (var15_15) {
                        var25_23 = var16_16;
                        var4_4.putInt(var3_3, var25_23, var22_21);
                    }
                    var16_16 = CodedOutputStream.x(var11_11);
                    var7_7 = VG1.a(var22_21, var16_16, var22_21, var7_7);
                    continue block71;
                }
                case 39: {
                    var21_20 = (List)var4_4.getObject(var3_3, var23_22);
                    var22_21 = E.l((List)var21_20);
                    if (var22_21 <= 0) continue block71;
                    if (var15_15) {
                        var25_23 = var16_16;
                        var4_4.putInt(var3_3, var25_23, var22_21);
                    }
                    var16_16 = CodedOutputStream.x(var11_11);
                    var7_7 = VG1.a(var22_21, var16_16, var22_21, var7_7);
                    continue block71;
                }
                case 38: {
                    var21_20 = (List)var4_4.getObject(var3_3, var23_22);
                    var22_21 = E.y((List)var21_20);
                    if (var22_21 <= 0) continue block71;
                    if (var15_15) {
                        var25_23 = var16_16;
                        var4_4.putInt(var3_3, var25_23, var22_21);
                    }
                    var16_16 = CodedOutputStream.x(var11_11);
                    var7_7 = VG1.a(var22_21, var16_16, var22_21, var7_7);
                    continue block71;
                }
                case 37: {
                    var21_20 = (List)var4_4.getObject(var3_3, var23_22);
                    var22_21 = E.n((List)var21_20);
                    if (var22_21 <= 0) continue block71;
                    if (var15_15) {
                        var25_23 = var16_16;
                        var4_4.putInt(var3_3, var25_23, var22_21);
                    }
                    var16_16 = CodedOutputStream.x(var11_11);
                    var7_7 = VG1.a(var22_21, var16_16, var22_21, var7_7);
                    continue block71;
                }
                case 36: {
                    var21_20 = (List)var4_4.getObject(var3_3, var23_22);
                    var22_21 = E.g((List)var21_20);
                    if (var22_21 <= 0) continue block71;
                    if (var15_15) {
                        var25_23 = var16_16;
                        var4_4.putInt(var3_3, var25_23, var22_21);
                    }
                    var16_16 = CodedOutputStream.x(var11_11);
                    var7_7 = VG1.a(var22_21, var16_16, var22_21, var7_7);
                    continue block71;
                }
                case 35: {
                    var21_20 = (List)var4_4.getObject(var3_3, var23_22);
                    var22_21 = E.i((List)var21_20);
                    if (var22_21 <= 0) continue block71;
                    if (var15_15) {
                        var25_23 = var16_16;
                        var4_4.putInt(var3_3, var25_23, var22_21);
                    }
                    var16_16 = CodedOutputStream.x(var11_11);
                    var7_7 = VG1.a(var22_21, var16_16, var22_21, var7_7);
                    continue block71;
                }
                case 34: {
                    var21_20 = (List)var4_4.getObject(var3_3, var23_22);
                    var22_21 = E.s(var11_11, (List)var21_20);
                    ** GOTO lbl47
                }
                case 33: {
                    var21_20 = (List)var4_4.getObject(var3_3, var23_22);
                    var22_21 = E.q(var11_11, (List)var21_20);
                    ** GOTO lbl47
                }
                case 32: {
                    var21_20 = (List)var4_4.getObject(var3_3, var23_22);
                    var22_21 = E.h(var11_11, (List)var21_20);
                    ** GOTO lbl47
                }
                case 31: {
                    var21_20 = (List)var4_4.getObject(var3_3, var23_22);
                    var22_21 = E.f(var11_11, (List)var21_20);
                    ** GOTO lbl47
                }
                case 30: {
                    var21_20 = (List)var4_4.getObject(var3_3, var23_22);
                    var22_21 = E.d(var11_11, (List)var21_20);
                    ** GOTO lbl47
                }
                case 29: {
                    var21_20 = (List)var4_4.getObject(var3_3, var23_22);
                    var22_21 = E.v(var11_11, (List)var21_20);
                    ** GOTO lbl47
                }
                case 28: {
                    var21_20 = (List)var4_4.getObject(var3_3, var23_22);
                    var22_21 = E.c(var11_11, (List)var21_20);
                    ** GOTO lbl47
                }
                case 27: {
                    var21_20 = (List)var4_4.getObject(var3_3, var23_22);
                    var9_9 /* !! */  = (int[])var2_2.g(var6_6);
                    var22_21 = E.p(var11_11, (List)var21_20, (st2_0)var9_9 /* !! */ );
                    ** GOTO lbl47
                }
                case 26: {
                    var21_20 = (List)var4_4.getObject(var3_3, var23_22);
                    var22_21 = E.u(var11_11, (List)var21_20);
                    ** GOTO lbl47
                }
                case 25: {
                    var21_20 = (List)var4_4.getObject(var3_3, var23_22);
                    var22_21 = E.a(var11_11, (List)var21_20);
                    ** GOTO lbl47
                }
                case 24: {
                    var21_20 = (List)var4_4.getObject(var3_3, var23_22);
                    var22_21 = E.f(var11_11, (List)var21_20);
                    ** GOTO lbl47
                }
                case 23: {
                    var21_20 = (List)var4_4.getObject(var3_3, var23_22);
                    var22_21 = E.h(var11_11, (List)var21_20);
                    ** GOTO lbl47
                }
                case 22: {
                    var21_20 = (List)var4_4.getObject(var3_3, var23_22);
                    var22_21 = E.k(var11_11, (List)var21_20);
                    ** GOTO lbl47
                }
                case 21: {
                    var21_20 = (List)var4_4.getObject(var3_3, var23_22);
                    var22_21 = E.x(var11_11, (List)var21_20);
                    ** GOTO lbl47
                }
                case 20: {
                    var21_20 = (List)var4_4.getObject(var3_3, var23_22);
                    var22_21 = E.m(var11_11, (List)var21_20);
                    ** GOTO lbl47
                }
                case 19: {
                    var21_20 = (List)var4_4.getObject(var3_3, var23_22);
                    var22_21 = E.f(var11_11, (List)var21_20);
                    ** GOTO lbl47
                }
                case 18: {
                    var21_20 = (List)var4_4.getObject(var3_3, var23_22);
                    var22_21 = E.h(var11_11, (List)var21_20);
                    ** GOTO lbl47
                }
                case 17: {
                    var22_21 = var8_8 & var17_17;
                    if (var22_21 == 0) continue block71;
                    var21_20 = (wo1_1)var4_4.getObject(var3_3, var23_22);
                    var9_9 /* !! */  = (int[])var2_2.g(var6_6);
                    var22_21 = CodedOutputStream.m(var11_11, (wo1_1)var21_20, (st2_0)var9_9 /* !! */ );
                    ** GOTO lbl47
                }
                case 16: {
                    var22_21 = var8_8 & var17_17;
                    if (var22_21 == 0) continue block71;
                    var25_23 = var4_4.getLong(var3_3, var23_22);
                    var22_21 = CodedOutputStream.u(var11_11, var25_23);
                    ** GOTO lbl47
                }
                case 15: {
                    var22_21 = var8_8 & var17_17;
                    if (var22_21 == 0) continue block71;
                    var22_21 = var4_4.getInt(var3_3, var23_22);
                    var22_21 = CodedOutputStream.t(var11_11, var22_21);
                    ** GOTO lbl47
                }
                case 14: {
                    var22_21 = var8_8 & var17_17;
                    if (var22_21 == 0) continue block71;
                    var22_21 = CodedOutputStream.s(var11_11);
                    ** GOTO lbl47
                }
                case 13: {
                    var22_21 = var8_8 & var17_17;
                    if (var22_21 == 0) continue block71;
                    var22_21 = CodedOutputStream.r(var11_11);
                    ** GOTO lbl47
                }
                case 12: {
                    var22_21 = var8_8 & var17_17;
                    if (var22_21 == 0) continue block71;
                    var22_21 = var4_4.getInt(var3_3, var23_22);
                    var22_21 = CodedOutputStream.i(var11_11, var22_21);
                    ** GOTO lbl47
                }
                case 11: {
                    var22_21 = var8_8 & var17_17;
                    if (var22_21 == 0) continue block71;
                    var22_21 = var4_4.getInt(var3_3, var23_22);
                    var22_21 = CodedOutputStream.y(var11_11, var22_21);
                    ** GOTO lbl47
                }
                case 10: {
                    var22_21 = var8_8 & var17_17;
                    if (var22_21 == 0) continue block71;
                    var21_20 = (DF)var4_4.getObject(var3_3, var23_22);
                    var22_21 = CodedOutputStream.f(var11_11, (DF)var21_20);
                    ** GOTO lbl47
                }
                case 9: {
                    var22_21 = var8_8 & var17_17;
                    if (var22_21 == 0) continue block71;
                    var21_20 = var4_4.getObject(var3_3, var23_22);
                    var9_9 /* !! */  = (int[])var2_2.g(var6_6);
                    var22_21 = E.o(var11_11, var21_20, (st2_0)var9_9 /* !! */ );
                    ** GOTO lbl47
                }
                case 8: {
                    var22_21 = var8_8 & var17_17;
                    if (var22_21 == 0) continue block71;
                    var21_20 = var4_4.getObject(var3_3, var23_22);
                    var16_16 = var21_20 instanceof DF;
                    if (var16_16 == 0) ** GOTO lbl437
                    var21_20 = (DF)var21_20;
                    var22_21 = CodedOutputStream.f(var11_11, (DF)var21_20);
                    ** GOTO lbl105
lbl437:
                    // 1 sources

                    var21_20 = (String)var21_20;
                    var22_21 = CodedOutputStream.v(var11_11, (String)var21_20);
                    ** continue;
                }
                case 7: {
                    var22_21 = var8_8 & var17_17;
                    if (var22_21 == 0) continue block71;
                    var22_21 = CodedOutputStream.e(var11_11);
                    ** GOTO lbl47
                }
                case 6: {
                    var22_21 = var8_8 & var17_17;
                    if (var22_21 == 0) continue block71;
                    var22_21 = CodedOutputStream.j(var11_11);
                    ** GOTO lbl47
                }
                case 5: {
                    var22_21 = var8_8 & var17_17;
                    if (var22_21 == 0) continue block71;
                    var22_21 = CodedOutputStream.k(var11_11);
                    ** GOTO lbl47
                }
                case 4: {
                    var22_21 = var8_8 & var17_17;
                    if (var22_21 == 0) continue block71;
                    var22_21 = var4_4.getInt(var3_3, var23_22);
                    var22_21 = CodedOutputStream.n(var11_11, var22_21);
                    ** GOTO lbl47
                }
                case 3: {
                    var22_21 = var8_8 & var17_17;
                    if (var22_21 == 0) continue block71;
                    var25_23 = var4_4.getLong(var3_3, var23_22);
                    var22_21 = CodedOutputStream.A(var11_11, var25_23);
                    ** GOTO lbl47
                }
                case 2: {
                    var22_21 = var8_8 & var17_17;
                    if (var22_21 == 0) continue block71;
                    var25_23 = var4_4.getLong(var3_3, var23_22);
                    var22_21 = CodedOutputStream.p(var11_11, var25_23);
                    ** GOTO lbl47
                }
                case 1: {
                    var22_21 = var8_8 & var17_17;
                    if (var22_21 == 0) continue block71;
                    var22_21 = CodedOutputStream.l(var11_11);
                    ** GOTO lbl47
                }
                case 0: {
                    var22_21 = var8_8 & var17_17;
                    if (var22_21 == 0) continue block71;
                    var22_21 = CodedOutputStream.h(var11_11);
                    ** continue;
                }
            }
        }
        var4_4 = var2_2.o;
        var21_20 = var4_4.g(var3_3);
        var28_25 = var4_4.h(var21_20) + var7_7;
        var22_21 = var2_2.f;
        if (var22_21 != 0) {
            var21_20 = var2_2.p;
            var3_3 = var21_20.c(var3_3);
            var29_26 = var3_3.e();
            var28_25 += var29_26;
        }
        return var28_25;
    }

    /*
     * Unable to fully structure code
     */
    public final int hashCode(Object var1_1) {
        var2_2 = this.a;
        var3_3 = ((int[])var2_2).length;
        var5_5 = 0;
        block40: for (var4_4 = 0; var4_4 < var3_3; var4_4 += 3) {
            var6_6 = this.E(var4_4);
            var7_7 = var2_2[var4_4];
            var8_8 = 1048575 & var6_6;
            var9_9 = var8_8;
            var6_6 = z.D(var6_6);
            var11_10 = 1237;
            var12_11 = 37;
            switch (var6_6) {
                default: {
                    continue block40;
                }
                case 68: {
                    var6_6 = (int)this.k(var1_1, var7_7, var4_4);
                    if (var6_6 == 0) continue block40;
                    var13_12 = nw3.d.i(var1_1, var9_9);
                    var5_5 *= 53;
                    var6_6 = var13_12.hashCode();
lbl21:
                    // 34 sources

                    while (true) {
                        var6_6 += var5_5;
                        var5_5 = var6_6;
                        continue block40;
                        break;
                    }
                }
                case 67: {
                    var6_6 = (int)this.k(var1_1, var7_7, var4_4);
                    if (var6_6 == 0) continue block40;
                    var5_5 *= 53;
                    var14_13 = z.u(var1_1, var9_9);
                    var6_6 = androidx.datastore.preferences.protobuf.p.b(var14_13);
                    ** GOTO lbl21
                }
                case 66: {
                    var6_6 = (int)this.k(var1_1, var7_7, var4_4);
                    if (var6_6 == 0) continue block40;
                    var5_5 *= 53;
                    var6_6 = z.t(var1_1, var9_9);
                    ** GOTO lbl21
                }
                case 65: {
                    var6_6 = (int)this.k(var1_1, var7_7, var4_4);
                    if (var6_6 == 0) continue block40;
                    var5_5 *= 53;
                    var14_13 = z.u(var1_1, var9_9);
                    var6_6 = androidx.datastore.preferences.protobuf.p.b(var14_13);
                    ** GOTO lbl21
                }
                case 64: {
                    var6_6 = (int)this.k(var1_1, var7_7, var4_4);
                    if (var6_6 == 0) continue block40;
                    var5_5 *= 53;
                    var6_6 = z.t(var1_1, var9_9);
                    ** GOTO lbl21
                }
                case 63: {
                    var6_6 = (int)this.k(var1_1, var7_7, var4_4);
                    if (var6_6 == 0) continue block40;
                    var5_5 *= 53;
                    var6_6 = z.t(var1_1, var9_9);
                    ** GOTO lbl21
                }
                case 62: {
                    var6_6 = (int)this.k(var1_1, var7_7, var4_4);
                    if (var6_6 == 0) continue block40;
                    var5_5 *= 53;
                    var6_6 = z.t(var1_1, var9_9);
                    ** GOTO lbl21
                }
                case 61: {
                    var6_6 = (int)this.k(var1_1, var7_7, var4_4);
                    if (var6_6 == 0) continue block40;
                    var5_5 *= 53;
                    var13_12 = nw3.d.i(var1_1, var9_9);
                    var6_6 = var13_12.hashCode();
                    ** GOTO lbl21
                }
                case 60: {
                    var6_6 = (int)this.k(var1_1, var7_7, var4_4);
                    if (var6_6 == 0) continue block40;
                    var13_12 = nw3.d.i(var1_1, var9_9);
                    var5_5 *= 53;
                    var6_6 = var13_12.hashCode();
                    ** GOTO lbl21
                }
                case 59: {
                    var6_6 = (int)this.k(var1_1, var7_7, var4_4);
                    if (var6_6 == 0) continue block40;
                    var5_5 *= 53;
                    var13_12 = (String)nw3.d.i(var1_1, var9_9);
                    var6_6 = var13_12.hashCode();
                    ** GOTO lbl21
                }
                case 58: {
                    var6_6 = (int)this.k(var1_1, var7_7, var4_4);
                    if (var6_6 == 0) continue block40;
                    var5_5 *= 53;
                    var13_12 = (Boolean)nw3.d.i(var1_1, var9_9);
                    var6_6 = (int)var13_12.booleanValue();
                    if (var6_6 == 0) ** GOTO lbl94
lbl92:
                    // 2 sources

                    while (true) {
                        var11_10 = 1231;
lbl94:
                        // 3 sources

                        while (true) {
                            var11_10 += var5_5;
                            var5_5 = var11_10;
                            continue block40;
                            break;
                        }
                        break;
                    }
                }
                case 57: {
                    var6_6 = (int)this.k(var1_1, var7_7, var4_4);
                    if (var6_6 == 0) continue block40;
                    var5_5 *= 53;
                    var6_6 = z.t(var1_1, var9_9);
                    ** GOTO lbl21
                }
                case 56: {
                    var6_6 = (int)this.k(var1_1, var7_7, var4_4);
                    if (var6_6 == 0) continue block40;
                    var5_5 *= 53;
                    var14_13 = z.u(var1_1, var9_9);
                    var6_6 = androidx.datastore.preferences.protobuf.p.b(var14_13);
                    ** GOTO lbl21
                }
                case 55: {
                    var6_6 = (int)this.k(var1_1, var7_7, var4_4);
                    if (var6_6 == 0) continue block40;
                    var5_5 *= 53;
                    var6_6 = z.t(var1_1, var9_9);
                    ** GOTO lbl21
                }
                case 54: {
                    var6_6 = (int)this.k(var1_1, var7_7, var4_4);
                    if (var6_6 == 0) continue block40;
                    var5_5 *= 53;
                    var14_13 = z.u(var1_1, var9_9);
                    var6_6 = androidx.datastore.preferences.protobuf.p.b(var14_13);
                    ** GOTO lbl21
                }
                case 53: {
                    var6_6 = (int)this.k(var1_1, var7_7, var4_4);
                    if (var6_6 == 0) continue block40;
                    var5_5 *= 53;
                    var14_13 = z.u(var1_1, var9_9);
                    var6_6 = androidx.datastore.preferences.protobuf.p.b(var14_13);
                    ** GOTO lbl21
                }
                case 52: {
                    var6_6 = (int)this.k(var1_1, var7_7, var4_4);
                    if (var6_6 == 0) continue block40;
                    var5_5 *= 53;
                    var13_12 = (Float)nw3.d.i(var1_1, var9_9);
                    var16_14 = var13_12.floatValue();
                    var6_6 = Float.floatToIntBits(var16_14);
                    ** GOTO lbl21
                }
                case 51: {
                    var6_6 = (int)this.k(var1_1, var7_7, var4_4);
                    if (var6_6 == 0) continue block40;
                    var5_5 *= 53;
                    var13_12 = (Double)nw3.d.i(var1_1, var9_9);
                    var17_15 = var13_12.doubleValue();
                    var14_13 = Double.doubleToLongBits(var17_15);
                    var6_6 = androidx.datastore.preferences.protobuf.p.b(var14_13);
                    ** GOTO lbl21
                }
                case 50: {
                    var5_5 *= 53;
                    var13_12 = nw3.d.i(var1_1, var9_9);
                    var6_6 = var13_12.hashCode();
                    ** GOTO lbl21
                }
                case 18: 
                case 19: 
                case 20: 
                case 21: 
                case 22: 
                case 23: 
                case 24: 
                case 25: 
                case 26: 
                case 27: 
                case 28: 
                case 29: 
                case 30: 
                case 31: 
                case 32: 
                case 33: 
                case 34: 
                case 35: 
                case 36: 
                case 37: 
                case 38: 
                case 39: 
                case 40: 
                case 41: 
                case 42: 
                case 43: 
                case 44: 
                case 45: 
                case 46: 
                case 47: 
                case 48: 
                case 49: {
                    var5_5 *= 53;
                    var13_12 = nw3.d.i(var1_1, var9_9);
                    var6_6 = var13_12.hashCode();
                    ** GOTO lbl21
                }
                case 17: {
                    var13_12 = nw3.d.i(var1_1, var9_9);
                    if (var13_12 != null) {
                        var12_11 = var13_12.hashCode();
                    }
lbl162:
                    // 5 sources

                    while (true) {
                        var5_5 = var5_5 * 53 + var12_11;
                        continue block40;
                        break;
                    }
                }
                case 16: {
                    var5_5 *= 53;
                    var13_12 = nw3.d;
                    var14_13 = var13_12.h(var1_1, var9_9);
                    var6_6 = androidx.datastore.preferences.protobuf.p.b(var14_13);
                    ** GOTO lbl21
                }
                case 15: {
                    var5_5 *= 53;
                    var13_12 = nw3.d;
                    var6_6 = var13_12.g(var1_1, var9_9);
                    ** GOTO lbl21
                }
                case 14: {
                    var5_5 *= 53;
                    var13_12 = nw3.d;
                    var14_13 = var13_12.h(var1_1, var9_9);
                    var6_6 = androidx.datastore.preferences.protobuf.p.b(var14_13);
                    ** GOTO lbl21
                }
                case 13: {
                    var5_5 *= 53;
                    var13_12 = nw3.d;
                    var6_6 = var13_12.g(var1_1, var9_9);
                    ** GOTO lbl21
                }
                case 12: {
                    var5_5 *= 53;
                    var13_12 = nw3.d;
                    var6_6 = var13_12.g(var1_1, var9_9);
                    ** GOTO lbl21
                }
                case 11: {
                    var5_5 *= 53;
                    var13_12 = nw3.d;
                    var6_6 = var13_12.g(var1_1, var9_9);
                    ** GOTO lbl21
                }
                case 10: {
                    var5_5 *= 53;
                    var13_12 = nw3.d.i(var1_1, var9_9);
                    var6_6 = var13_12.hashCode();
                    ** GOTO lbl21
                }
                case 9: {
                    var13_12 = nw3.d.i(var1_1, var9_9);
                    if (var13_12 == null) ** GOTO lbl162
                    var12_11 = var13_12.hashCode();
                    ** continue;
                }
                case 8: {
                    var5_5 *= 53;
                    var13_12 = (String)nw3.d.i(var1_1, var9_9);
                    var6_6 = var13_12.hashCode();
                    ** GOTO lbl21
                }
                case 7: {
                    var5_5 *= 53;
                    var13_12 = nw3.d;
                    var6_6 = (int)var13_12.c(var1_1, var9_9);
                    if (var6_6 == 0) ** continue;
                    ** continue;
                }
                case 6: {
                    var5_5 *= 53;
                    var13_12 = nw3.d;
                    var6_6 = var13_12.g(var1_1, var9_9);
                    ** GOTO lbl21
                }
                case 5: {
                    var5_5 *= 53;
                    var13_12 = nw3.d;
                    var14_13 = var13_12.h(var1_1, var9_9);
                    var6_6 = androidx.datastore.preferences.protobuf.p.b(var14_13);
                    ** GOTO lbl21
                }
                case 4: {
                    var5_5 *= 53;
                    var13_12 = nw3.d;
                    var6_6 = var13_12.g(var1_1, var9_9);
                    ** GOTO lbl21
                }
                case 3: {
                    var5_5 *= 53;
                    var13_12 = nw3.d;
                    var14_13 = var13_12.h(var1_1, var9_9);
                    var6_6 = androidx.datastore.preferences.protobuf.p.b(var14_13);
                    ** GOTO lbl21
                }
                case 2: {
                    var5_5 *= 53;
                    var13_12 = nw3.d;
                    var14_13 = var13_12.h(var1_1, var9_9);
                    var6_6 = androidx.datastore.preferences.protobuf.p.b(var14_13);
                    ** GOTO lbl21
                }
                case 1: {
                    var5_5 *= 53;
                    var13_12 = nw3.d;
                    var16_14 = var13_12.f(var1_1, var9_9);
                    var6_6 = Float.floatToIntBits(var16_14);
                    ** GOTO lbl21
                }
                case 0: {
                    var5_5 *= 53;
                    var13_12 = nw3.d;
                    var17_15 = var13_12.e(var1_1, var9_9);
                    var14_13 = Double.doubleToLongBits(var17_15);
                    var6_6 = androidx.datastore.preferences.protobuf.p.b(var14_13);
                    ** continue;
                }
            }
        }
        var2_2 = this.o.g(var1_1);
        var19_16 = var2_2.hashCode() + (var5_5 *= 53);
        var3_3 = (int)this.f;
        if (var3_3 != 0) {
            var19_16 *= 53;
            var20_17 = this.p;
            var1_1 = var20_17.c((Object)var1_1).a;
            var21_18 = var1_1.hashCode();
            var19_16 += var21_18;
        }
        return var19_16;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final int i(Object var1_1) {
        var2_2 = z.s;
        var4_4 = 0;
        block71: for (var3_3 = 0; var3_3 < (var6_6 = (var5_5 /* !! */  = this.a).length); var3_3 += 3) {
            var6_6 = this.E(var3_3);
            var7_7 = z.D(var6_6);
            var8_8 = var5_5 /* !! */ [var3_3];
            var9_9 = 1048575;
            var10_10 = var6_6 & var9_9;
            var12_11 /* !! */  = hL0.DOUBLE_LIST_PACKED;
            var6_6 = var12_11 /* !! */ .id();
            if (var7_7 >= var6_6 && var7_7 <= (var6_6 = (var12_11 /* !! */  = hL0.SINT64_LIST_PACKED).id())) {
                var6_6 = var3_3 + 2;
                var13_12 = var5_5 /* !! */ [var6_6] & var9_9;
            } else {
                var13_12 = 0;
                var5_5 /* !! */  = null;
            }
            var6_6 = (int)this.i;
            switch (var7_7) {
                default: {
                    continue block71;
                }
                case 68: {
                    var13_12 = this.k(var1_1, var8_8, var3_3);
                    if (var13_12 == 0) continue block71;
                    var5_5 /* !! */  = (int[])((wo1_1)nw3.k(var1_1, var10_10));
                    var12_11 /* !! */  = this.g(var3_3);
                    var13_12 = CodedOutputStream.m(var8_8, (wo1_1)var5_5 /* !! */ , (st2_0)var12_11 /* !! */ );
lbl27:
                    // 53 sources

                    while (true) {
                        var4_4 += var13_12;
                        continue block71;
                        break;
                    }
                }
                case 67: {
                    var13_12 = this.k(var1_1, var8_8, var3_3);
                    if (var13_12 == 0) continue block71;
                    var14_13 = z.u(var1_1, var10_10);
                    var13_12 = CodedOutputStream.u(var8_8, var14_13);
                    ** GOTO lbl27
                }
                case 66: {
                    var13_12 = this.k(var1_1, var8_8, var3_3);
                    if (var13_12 == 0) continue block71;
                    var13_12 = z.t(var1_1, var10_10);
                    var13_12 = CodedOutputStream.t(var8_8, var13_12);
                    ** GOTO lbl27
                }
                case 65: {
                    var13_12 = this.k(var1_1, var8_8, var3_3);
                    if (var13_12 == 0) continue block71;
                    var13_12 = CodedOutputStream.s(var8_8);
                    ** GOTO lbl27
                }
                case 64: {
                    var13_12 = this.k(var1_1, var8_8, var3_3);
                    if (var13_12 == 0) continue block71;
                    var13_12 = CodedOutputStream.r(var8_8);
                    ** GOTO lbl27
                }
                case 63: {
                    var13_12 = this.k(var1_1, var8_8, var3_3);
                    if (var13_12 == 0) continue block71;
                    var13_12 = z.t(var1_1, var10_10);
                    var13_12 = CodedOutputStream.i(var8_8, var13_12);
                    ** GOTO lbl27
                }
                case 62: {
                    var13_12 = this.k(var1_1, var8_8, var3_3);
                    if (var13_12 == 0) continue block71;
                    var13_12 = z.t(var1_1, var10_10);
                    var13_12 = CodedOutputStream.y(var8_8, var13_12);
                    ** GOTO lbl27
                }
                case 61: {
                    var13_12 = this.k(var1_1, var8_8, var3_3);
                    if (var13_12 == 0) continue block71;
                    var5_5 /* !! */  = (int[])((DF)nw3.k(var1_1, var10_10));
                    var13_12 = CodedOutputStream.f(var8_8, (DF)var5_5 /* !! */ );
                    ** GOTO lbl27
                }
                case 60: {
                    var13_12 = this.k(var1_1, var8_8, var3_3);
                    if (var13_12 == 0) continue block71;
                    var5_5 /* !! */  = (int[])nw3.k(var1_1, var10_10);
                    var12_11 /* !! */  = this.g(var3_3);
                    var13_12 = E.o(var8_8, var5_5 /* !! */ , (st2_0)var12_11 /* !! */ );
                    ** GOTO lbl27
                }
                case 59: {
                    var13_12 = this.k(var1_1, var8_8, var3_3);
                    if (var13_12 == 0) continue block71;
                    var5_5 /* !! */  = (int[])nw3.k(var1_1, var10_10);
                    var6_6 = var5_5 /* !! */  instanceof DF;
                    if (var6_6 != 0) {
                        var5_5 /* !! */  = (int[])((DF)var5_5 /* !! */ );
                        var13_12 = CodedOutputStream.f(var8_8, (DF)var5_5 /* !! */ );
lbl85:
                        // 4 sources

                        while (true) {
                            var4_4 = var13_12 += var4_4;
                            continue block71;
                            break;
                        }
                    }
                    var5_5 /* !! */  = (int[])((String)var5_5 /* !! */ );
                    var13_12 = CodedOutputStream.v(var8_8, (String)var5_5 /* !! */ );
                    ** GOTO lbl85
                }
                case 58: {
                    var13_12 = this.k(var1_1, var8_8, var3_3);
                    if (var13_12 == 0) continue block71;
                    var13_12 = CodedOutputStream.e(var8_8);
                    ** GOTO lbl27
                }
                case 57: {
                    var13_12 = this.k(var1_1, var8_8, var3_3);
                    if (var13_12 == 0) continue block71;
                    var13_12 = CodedOutputStream.j(var8_8);
                    ** GOTO lbl27
                }
                case 56: {
                    var13_12 = this.k(var1_1, var8_8, var3_3);
                    if (var13_12 == 0) continue block71;
                    var13_12 = CodedOutputStream.k(var8_8);
                    ** GOTO lbl27
                }
                case 55: {
                    var13_12 = this.k(var1_1, var8_8, var3_3);
                    if (var13_12 == 0) continue block71;
                    var13_12 = z.t(var1_1, var10_10);
                    var13_12 = CodedOutputStream.n(var8_8, var13_12);
                    ** GOTO lbl27
                }
                case 54: {
                    var13_12 = this.k(var1_1, var8_8, var3_3);
                    if (var13_12 == 0) continue block71;
                    var14_13 = z.u(var1_1, var10_10);
                    var13_12 = CodedOutputStream.A(var8_8, var14_13);
                    ** GOTO lbl27
                }
                case 53: {
                    var13_12 = this.k(var1_1, var8_8, var3_3);
                    if (var13_12 == 0) continue block71;
                    var14_13 = z.u(var1_1, var10_10);
                    var13_12 = CodedOutputStream.p(var8_8, var14_13);
                    ** GOTO lbl27
                }
                case 52: {
                    var13_12 = this.k(var1_1, var8_8, var3_3);
                    if (var13_12 == 0) continue block71;
                    var13_12 = CodedOutputStream.l(var8_8);
                    ** GOTO lbl27
                }
                case 51: {
                    var13_12 = this.k(var1_1, var8_8, var3_3);
                    if (var13_12 == 0) continue block71;
                    var13_12 = CodedOutputStream.h(var8_8);
                    ** GOTO lbl27
                }
                case 50: {
                    var5_5 /* !! */  = (int[])nw3.k(var1_1, var10_10);
                    var12_11 /* !! */  = this.f(var3_3);
                    var16_14 = this.q;
                    var13_12 = var16_14.getSerializedSize(var8_8, var5_5 /* !! */ , (Object)var12_11 /* !! */ );
                    ** GOTO lbl27
                }
                case 49: {
                    var5_5 /* !! */  = (int[])z.l(var10_10, var1_1);
                    var12_11 /* !! */  = this.g(var3_3);
                    var13_12 = E.j(var8_8, (List)var5_5 /* !! */ , (st2_0)var12_11 /* !! */ );
                    ** GOTO lbl27
                }
                case 48: {
                    var16_14 = (List)var2_2.getObject(var1_1, var10_10);
                    var7_7 = E.t((List)var16_14);
                    if (var7_7 <= 0) continue block71;
                    if (var6_6 != 0) {
                        var14_13 = var13_12;
                        var2_2.putInt(var1_1, var14_13, var7_7);
                    }
                    var13_12 = CodedOutputStream.x(var8_8);
                    var4_4 = VG1.a(var7_7, var13_12, var7_7, var4_4);
                    continue block71;
                }
                case 47: {
                    var16_14 = (List)var2_2.getObject(var1_1, var10_10);
                    var7_7 = E.r((List)var16_14);
                    if (var7_7 <= 0) continue block71;
                    if (var6_6 != 0) {
                        var14_13 = var13_12;
                        var2_2.putInt(var1_1, var14_13, var7_7);
                    }
                    var13_12 = CodedOutputStream.x(var8_8);
                    var4_4 = VG1.a(var7_7, var13_12, var7_7, var4_4);
                    continue block71;
                }
                case 46: {
                    var16_14 = (List)var2_2.getObject(var1_1, var10_10);
                    var7_7 = E.i((List)var16_14);
                    if (var7_7 <= 0) continue block71;
                    if (var6_6 != 0) {
                        var14_13 = var13_12;
                        var2_2.putInt(var1_1, var14_13, var7_7);
                    }
                    var13_12 = CodedOutputStream.x(var8_8);
                    var4_4 = VG1.a(var7_7, var13_12, var7_7, var4_4);
                    continue block71;
                }
                case 45: {
                    var16_14 = (List)var2_2.getObject(var1_1, var10_10);
                    var7_7 = E.g((List)var16_14);
                    if (var7_7 <= 0) continue block71;
                    if (var6_6 != 0) {
                        var14_13 = var13_12;
                        var2_2.putInt(var1_1, var14_13, var7_7);
                    }
                    var13_12 = CodedOutputStream.x(var8_8);
                    var4_4 = VG1.a(var7_7, var13_12, var7_7, var4_4);
                    continue block71;
                }
                case 44: {
                    var16_14 = (List)var2_2.getObject(var1_1, var10_10);
                    var7_7 = E.e((List)var16_14);
                    if (var7_7 <= 0) continue block71;
                    if (var6_6 != 0) {
                        var14_13 = var13_12;
                        var2_2.putInt(var1_1, var14_13, var7_7);
                    }
                    var13_12 = CodedOutputStream.x(var8_8);
                    var4_4 = VG1.a(var7_7, var13_12, var7_7, var4_4);
                    continue block71;
                }
                case 43: {
                    var16_14 = (List)var2_2.getObject(var1_1, var10_10);
                    var7_7 = E.w((List)var16_14);
                    if (var7_7 <= 0) continue block71;
                    if (var6_6 != 0) {
                        var14_13 = var13_12;
                        var2_2.putInt(var1_1, var14_13, var7_7);
                    }
                    var13_12 = CodedOutputStream.x(var8_8);
                    var4_4 = VG1.a(var7_7, var13_12, var7_7, var4_4);
                    continue block71;
                }
                case 42: {
                    var16_14 = (List)var2_2.getObject(var1_1, var10_10);
                    var7_7 = E.b((List)var16_14);
                    if (var7_7 <= 0) continue block71;
                    if (var6_6 != 0) {
                        var14_13 = var13_12;
                        var2_2.putInt(var1_1, var14_13, var7_7);
                    }
                    var13_12 = CodedOutputStream.x(var8_8);
                    var4_4 = VG1.a(var7_7, var13_12, var7_7, var4_4);
                    continue block71;
                }
                case 41: {
                    var16_14 = (List)var2_2.getObject(var1_1, var10_10);
                    var7_7 = E.g((List)var16_14);
                    if (var7_7 <= 0) continue block71;
                    if (var6_6 != 0) {
                        var14_13 = var13_12;
                        var2_2.putInt(var1_1, var14_13, var7_7);
                    }
                    var13_12 = CodedOutputStream.x(var8_8);
                    var4_4 = VG1.a(var7_7, var13_12, var7_7, var4_4);
                    continue block71;
                }
                case 40: {
                    var16_14 = (List)var2_2.getObject(var1_1, var10_10);
                    var7_7 = E.i((List)var16_14);
                    if (var7_7 <= 0) continue block71;
                    if (var6_6 != 0) {
                        var14_13 = var13_12;
                        var2_2.putInt(var1_1, var14_13, var7_7);
                    }
                    var13_12 = CodedOutputStream.x(var8_8);
                    var4_4 = VG1.a(var7_7, var13_12, var7_7, var4_4);
                    continue block71;
                }
                case 39: {
                    var16_14 = (List)var2_2.getObject(var1_1, var10_10);
                    var7_7 = E.l((List)var16_14);
                    if (var7_7 <= 0) continue block71;
                    if (var6_6 != 0) {
                        var14_13 = var13_12;
                        var2_2.putInt(var1_1, var14_13, var7_7);
                    }
                    var13_12 = CodedOutputStream.x(var8_8);
                    var4_4 = VG1.a(var7_7, var13_12, var7_7, var4_4);
                    continue block71;
                }
                case 38: {
                    var16_14 = (List)var2_2.getObject(var1_1, var10_10);
                    var7_7 = E.y((List)var16_14);
                    if (var7_7 <= 0) continue block71;
                    if (var6_6 != 0) {
                        var14_13 = var13_12;
                        var2_2.putInt(var1_1, var14_13, var7_7);
                    }
                    var13_12 = CodedOutputStream.x(var8_8);
                    var4_4 = VG1.a(var7_7, var13_12, var7_7, var4_4);
                    continue block71;
                }
                case 37: {
                    var16_14 = (List)var2_2.getObject(var1_1, var10_10);
                    var7_7 = E.n((List)var16_14);
                    if (var7_7 <= 0) continue block71;
                    if (var6_6 != 0) {
                        var14_13 = var13_12;
                        var2_2.putInt(var1_1, var14_13, var7_7);
                    }
                    var13_12 = CodedOutputStream.x(var8_8);
                    var4_4 = VG1.a(var7_7, var13_12, var7_7, var4_4);
                    continue block71;
                }
                case 36: {
                    var16_14 = (List)var2_2.getObject(var1_1, var10_10);
                    var7_7 = E.g((List)var16_14);
                    if (var7_7 <= 0) continue block71;
                    if (var6_6 != 0) {
                        var14_13 = var13_12;
                        var2_2.putInt(var1_1, var14_13, var7_7);
                    }
                    var13_12 = CodedOutputStream.x(var8_8);
                    var4_4 = VG1.a(var7_7, var13_12, var7_7, var4_4);
                    continue block71;
                }
                case 35: {
                    var16_14 = (List)var2_2.getObject(var1_1, var10_10);
                    var7_7 = E.i((List)var16_14);
                    if (var7_7 <= 0) continue block71;
                    if (var6_6 != 0) {
                        var14_13 = var13_12;
                        var2_2.putInt(var1_1, var14_13, var7_7);
                    }
                    var13_12 = CodedOutputStream.x(var8_8);
                    var4_4 = VG1.a(var7_7, var13_12, var7_7, var4_4);
                    continue block71;
                }
                case 34: {
                    var5_5 /* !! */  = (int[])z.l(var10_10, var1_1);
                    var13_12 = E.s(var8_8, (List)var5_5 /* !! */ );
                    ** GOTO lbl27
                }
                case 33: {
                    var5_5 /* !! */  = (int[])z.l(var10_10, var1_1);
                    var13_12 = E.q(var8_8, (List)var5_5 /* !! */ );
                    ** GOTO lbl27
                }
                case 32: {
                    var5_5 /* !! */  = (int[])z.l(var10_10, var1_1);
                    var13_12 = E.h(var8_8, (List)var5_5 /* !! */ );
                    ** GOTO lbl27
                }
                case 31: {
                    var5_5 /* !! */  = (int[])z.l(var10_10, var1_1);
                    var13_12 = E.f(var8_8, (List)var5_5 /* !! */ );
                    ** GOTO lbl27
                }
                case 30: {
                    var5_5 /* !! */  = (int[])z.l(var10_10, var1_1);
                    var13_12 = E.d(var8_8, (List)var5_5 /* !! */ );
                    ** GOTO lbl27
                }
                case 29: {
                    var5_5 /* !! */  = (int[])z.l(var10_10, var1_1);
                    var13_12 = E.v(var8_8, (List)var5_5 /* !! */ );
                    ** GOTO lbl27
                }
                case 28: {
                    var5_5 /* !! */  = (int[])z.l(var10_10, var1_1);
                    var13_12 = E.c(var8_8, (List)var5_5 /* !! */ );
                    ** GOTO lbl27
                }
                case 27: {
                    var5_5 /* !! */  = (int[])z.l(var10_10, var1_1);
                    var12_11 /* !! */  = this.g(var3_3);
                    var13_12 = E.p(var8_8, (List)var5_5 /* !! */ , (st2_0)var12_11 /* !! */ );
                    ** GOTO lbl27
                }
                case 26: {
                    var5_5 /* !! */  = (int[])z.l(var10_10, var1_1);
                    var13_12 = E.u(var8_8, (List)var5_5 /* !! */ );
                    ** GOTO lbl27
                }
                case 25: {
                    var5_5 /* !! */  = (int[])z.l(var10_10, var1_1);
                    var13_12 = E.a(var8_8, (List)var5_5 /* !! */ );
                    ** GOTO lbl27
                }
                case 24: {
                    var5_5 /* !! */  = (int[])z.l(var10_10, var1_1);
                    var13_12 = E.f(var8_8, (List)var5_5 /* !! */ );
                    ** GOTO lbl27
                }
                case 23: {
                    var5_5 /* !! */  = (int[])z.l(var10_10, var1_1);
                    var13_12 = E.h(var8_8, (List)var5_5 /* !! */ );
                    ** GOTO lbl27
                }
                case 22: {
                    var5_5 /* !! */  = (int[])z.l(var10_10, var1_1);
                    var13_12 = E.k(var8_8, (List)var5_5 /* !! */ );
                    ** GOTO lbl27
                }
                case 21: {
                    var5_5 /* !! */  = (int[])z.l(var10_10, var1_1);
                    var13_12 = E.x(var8_8, (List)var5_5 /* !! */ );
                    ** GOTO lbl27
                }
                case 20: {
                    var5_5 /* !! */  = (int[])z.l(var10_10, var1_1);
                    var13_12 = E.m(var8_8, (List)var5_5 /* !! */ );
                    ** GOTO lbl27
                }
                case 19: {
                    var5_5 /* !! */  = (int[])z.l(var10_10, var1_1);
                    var13_12 = E.f(var8_8, (List)var5_5 /* !! */ );
                    ** GOTO lbl27
                }
                case 18: {
                    var5_5 /* !! */  = (int[])z.l(var10_10, var1_1);
                    var13_12 = E.h(var8_8, (List)var5_5 /* !! */ );
                    ** GOTO lbl27
                }
                case 17: {
                    var13_12 = this.j(var1_1, var3_3);
                    if (var13_12 == 0) continue block71;
                    var5_5 /* !! */  = (int[])((wo1_1)nw3.k(var1_1, var10_10));
                    var12_11 /* !! */  = this.g(var3_3);
                    var13_12 = CodedOutputStream.m(var8_8, (wo1_1)var5_5 /* !! */ , (st2_0)var12_11 /* !! */ );
                    ** GOTO lbl27
                }
                case 16: {
                    var13_12 = this.j(var1_1, var3_3);
                    if (var13_12 == 0) continue block71;
                    var14_13 = nw3.j(var1_1, var10_10);
                    var13_12 = CodedOutputStream.u(var8_8, var14_13);
                    ** GOTO lbl27
                }
                case 15: {
                    var13_12 = this.j(var1_1, var3_3);
                    if (var13_12 == 0) continue block71;
                    var13_12 = nw3.i(var1_1, var10_10);
                    var13_12 = CodedOutputStream.t(var8_8, var13_12);
                    ** GOTO lbl27
                }
                case 14: {
                    var13_12 = this.j(var1_1, var3_3);
                    if (var13_12 == 0) continue block71;
                    var13_12 = CodedOutputStream.s(var8_8);
                    ** GOTO lbl27
                }
                case 13: {
                    var13_12 = this.j(var1_1, var3_3);
                    if (var13_12 == 0) continue block71;
                    var13_12 = CodedOutputStream.r(var8_8);
                    ** GOTO lbl27
                }
                case 12: {
                    var13_12 = this.j(var1_1, var3_3);
                    if (var13_12 == 0) continue block71;
                    var13_12 = nw3.i(var1_1, var10_10);
                    var13_12 = CodedOutputStream.i(var8_8, var13_12);
                    ** GOTO lbl27
                }
                case 11: {
                    var13_12 = this.j(var1_1, var3_3);
                    if (var13_12 == 0) continue block71;
                    var13_12 = nw3.i(var1_1, var10_10);
                    var13_12 = CodedOutputStream.y(var8_8, var13_12);
                    ** GOTO lbl27
                }
                case 10: {
                    var13_12 = this.j(var1_1, var3_3);
                    if (var13_12 == 0) continue block71;
                    var5_5 /* !! */  = (int[])((DF)nw3.k(var1_1, var10_10));
                    var13_12 = CodedOutputStream.f(var8_8, (DF)var5_5 /* !! */ );
                    ** GOTO lbl27
                }
                case 9: {
                    var13_12 = this.j(var1_1, var3_3);
                    if (var13_12 == 0) continue block71;
                    var5_5 /* !! */  = (int[])nw3.k(var1_1, var10_10);
                    var12_11 /* !! */  = this.g(var3_3);
                    var13_12 = E.o(var8_8, var5_5 /* !! */ , (st2_0)var12_11 /* !! */ );
                    ** GOTO lbl27
                }
                case 8: {
                    var13_12 = this.j(var1_1, var3_3);
                    if (var13_12 == 0) continue block71;
                    var5_5 /* !! */  = (int[])nw3.k(var1_1, var10_10);
                    var6_6 = var5_5 /* !! */  instanceof DF;
                    if (var6_6 == 0) ** GOTO lbl417
                    var5_5 /* !! */  = (int[])((DF)var5_5 /* !! */ );
                    var13_12 = CodedOutputStream.f(var8_8, (DF)var5_5 /* !! */ );
                    ** GOTO lbl85
lbl417:
                    // 1 sources

                    var5_5 /* !! */  = (int[])((String)var5_5 /* !! */ );
                    var13_12 = CodedOutputStream.v(var8_8, (String)var5_5 /* !! */ );
                    ** continue;
                }
                case 7: {
                    var13_12 = this.j(var1_1, var3_3);
                    if (var13_12 == 0) continue block71;
                    var13_12 = CodedOutputStream.e(var8_8);
                    ** GOTO lbl27
                }
                case 6: {
                    var13_12 = this.j(var1_1, var3_3);
                    if (var13_12 == 0) continue block71;
                    var13_12 = CodedOutputStream.j(var8_8);
                    ** GOTO lbl27
                }
                case 5: {
                    var13_12 = this.j(var1_1, var3_3);
                    if (var13_12 == 0) continue block71;
                    var13_12 = CodedOutputStream.k(var8_8);
                    ** GOTO lbl27
                }
                case 4: {
                    var13_12 = this.j(var1_1, var3_3);
                    if (var13_12 == 0) continue block71;
                    var13_12 = nw3.i(var1_1, var10_10);
                    var13_12 = CodedOutputStream.n(var8_8, var13_12);
                    ** GOTO lbl27
                }
                case 3: {
                    var13_12 = this.j(var1_1, var3_3);
                    if (var13_12 == 0) continue block71;
                    var14_13 = nw3.j(var1_1, var10_10);
                    var13_12 = CodedOutputStream.A(var8_8, var14_13);
                    ** GOTO lbl27
                }
                case 2: {
                    var13_12 = this.j(var1_1, var3_3);
                    if (var13_12 == 0) continue block71;
                    var14_13 = nw3.j(var1_1, var10_10);
                    var13_12 = CodedOutputStream.p(var8_8, var14_13);
                    ** GOTO lbl27
                }
                case 1: {
                    var13_12 = this.j(var1_1, var3_3);
                    if (var13_12 == 0) continue block71;
                    var13_12 = CodedOutputStream.l(var8_8);
                    ** GOTO lbl27
                }
                case 0: {
                    var13_12 = this.j(var1_1, var3_3);
                    if (var13_12 == 0) continue block71;
                    var13_12 = CodedOutputStream.h(var8_8);
                    ** continue;
                }
            }
        }
        var2_2 = this.o;
        var1_1 = var2_2.g(var1_1);
        return var2_2.h(var1_1) + var4_4;
    }

    public final boolean isInitialized(Object object) {
        boolean bl2;
        Object object2;
        int n3;
        int n4 = -1;
        int n7 = 0;
        int n8 = 0;
        while (true) {
            block21: {
                Object object3;
                Object object4;
                long l2;
                boolean bl3;
                int n10;
                int n14;
                Object object5;
                int n15;
                block18: {
                    int n16;
                    int n17;
                    Object object6;
                    block19: {
                        block20: {
                            int n18;
                            int n19;
                            n15 = this.k;
                            n3 = 1;
                            if (n7 >= n15) break;
                            object5 = this.j;
                            n15 = object5[n7];
                            object6 = this.a;
                            n17 = object6[n15];
                            n14 = this.E(n15);
                            n10 = 1048575;
                            bl3 = this.h;
                            if (!bl3) {
                                n19 = n15 + 2;
                                n16 = object6[n19];
                                n19 = n16 & n10;
                                n16 >>>= 20;
                                n16 = n3 << n16;
                                if (n19 != n4) {
                                    object2 = s;
                                    long l3 = n19;
                                    n8 = ((Unsafe)object2).getInt(object, l3);
                                    n4 = n19;
                                }
                            } else {
                                n16 = 0;
                                object6 = null;
                            }
                            if ((n19 = 0x10000000 & n14) != 0 && (n19 = bl3 ? (int)(this.j(object, n15) ? 1 : 0) : ((n19 = n8 & n16) != 0 ? 1 : 0)) == 0) {
                                return false;
                            }
                            n19 = z.D(n14);
                            if (n19 == (n18 = 9) || n19 == (n18 = 17)) break block18;
                            n3 = 27;
                            if (n19 == n3) break block19;
                            n3 = 60;
                            if (n19 == n3 || n19 == (n3 = 68)) break block20;
                            n3 = 49;
                            if (n19 == n3) break block19;
                            n3 = 50;
                            if (n19 == n3) {
                                n3 = n14 & n10;
                                l2 = n3;
                                object4 = nw3.d;
                                object3 = ((nw3$e)object4).i(object, l2);
                                object6 = this.q;
                                n17 = (int)(((HashMap)(object3 = object6.forMapData(object3))).isEmpty() ? 1 : 0);
                                if (n17 == 0) {
                                    object5 = this.f(n15);
                                    object5 = object6.forMapMetadata((Object)object5).c.getJavaType();
                                    if (object5 == (object6 = xH3.MESSAGE)) {
                                        object5 = ((LinkedHashMap)object3).values().iterator();
                                        n3 = 0;
                                        object3 = null;
                                        while ((n16 = (int)(object5.hasNext() ? 1 : 0)) != 0) {
                                            object6 = object5.next();
                                            if (object3 == null) {
                                                object3 = GB2.c;
                                                object4 = object6.getClass();
                                                object3 = ((GB2)object3).a((Class)object4);
                                            }
                                            if ((n16 = (int)(object3.isInitialized(object6) ? 1 : 0)) != 0) continue;
                                            return false;
                                        }
                                    }
                                }
                            }
                            break block21;
                        }
                        n3 = (int)(this.k(object, n17, n15) ? 1 : 0);
                        if (n3 != 0 && (n15 = (int)((object5 = (Object)this.g(n15)).isInitialized(object3 = ((nw3$e)(object4 = nw3.d)).i(object, l2 = (long)(n3 = n14 & n10))) ? 1 : 0)) == 0) {
                            return false;
                        }
                        break block21;
                    }
                    if ((n16 = (int)((object3 = (List)((nw3$e)(object4 = nw3.d)).i(object, l2 = (long)(n3 = n14 & n10))).isEmpty() ? 1 : 0)) == 0) {
                        object5 = this.g(n15);
                        object6 = null;
                        for (n16 = 0; n16 < (n17 = object3.size()); ++n16) {
                            object4 = object3.get(n16);
                            n17 = (int)(object5.isInitialized(object4) ? 1 : 0);
                            if (n17 != 0) continue;
                            return false;
                        }
                    }
                    break block21;
                }
                if (bl3) {
                    n3 = (int)(this.j(object, n15) ? 1 : 0);
                } else if ((n16 &= n8) == 0) {
                    n3 = 0;
                    object3 = null;
                }
                if (n3 != 0 && (n15 = (int)((object5 = (Object)this.g(n15)).isInitialized(object3 = ((nw3$e)(object4 = nw3.d)).i(object, l2 = (long)(n3 = n14 & n10))) ? 1 : 0)) == 0) {
                    return false;
                }
            }
            ++n7;
        }
        n4 = (int)(this.f ? 1 : 0);
        if (n4 != 0 && !(bl2 = ((l_0)(object = ((j)(object2 = this.p)).c(object))).g())) {
            return false;
        }
        return n3 != 0;
    }

    public final boolean j(Object object, int n3) {
        int n4 = this.h;
        int n7 = 1048575;
        boolean bl2 = false;
        int n8 = 1;
        if (n4 != 0) {
            n3 = this.E(n3);
            n4 = n3 & n7;
            long l2 = n4;
            n3 = z.D(n3);
            long l3 = 0L;
            switch (n3) {
                default: {
                    object = new IllegalArgumentException();
                    throw object;
                }
                case 17: {
                    nw3$e nw3$e = nw3.d;
                    object = nw3$e.i(object, l2);
                    if (object != null) {
                        bl2 = true;
                    }
                    return bl2;
                }
                case 16: {
                    nw3$e nw3$e = nw3.d;
                    long l4 = nw3$e.h(object, l2);
                    n4 = (int)(l4 == l3 ? 0 : (l4 < l3 ? -1 : 1));
                    if (n4 != 0) {
                        bl2 = true;
                    }
                    return bl2;
                }
                case 15: {
                    nw3$e nw3$e = nw3.d;
                    int n10 = nw3$e.g(object, l2);
                    if (n10 != 0) {
                        bl2 = true;
                    }
                    return bl2;
                }
                case 14: {
                    nw3$e nw3$e = nw3.d;
                    long l7 = nw3$e.h(object, l2);
                    n4 = (int)(l7 == l3 ? 0 : (l7 < l3 ? -1 : 1));
                    if (n4 != 0) {
                        bl2 = true;
                    }
                    return bl2;
                }
                case 13: {
                    nw3$e nw3$e = nw3.d;
                    int n14 = nw3$e.g(object, l2);
                    if (n14 != 0) {
                        bl2 = true;
                    }
                    return bl2;
                }
                case 12: {
                    nw3$e nw3$e = nw3.d;
                    int n15 = nw3$e.g(object, l2);
                    if (n15 != 0) {
                        bl2 = true;
                    }
                    return bl2;
                }
                case 11: {
                    nw3$e nw3$e = nw3.d;
                    int n16 = nw3$e.g(object, l2);
                    if (n16 != 0) {
                        bl2 = true;
                    }
                    return bl2;
                }
                case 10: {
                    DF$e dF$e = DF.b;
                    object = nw3.d.i(object, l2);
                    return (dF$e.equals(object) ^ n8) != 0;
                }
                case 9: {
                    nw3$e nw3$e = nw3.d;
                    object = nw3$e.i(object, l2);
                    if (object != null) {
                        bl2 = true;
                    }
                    return bl2;
                }
                case 8: {
                    nw3$e nw3$e = nw3.d;
                    object = nw3$e.i(object, l2);
                    n3 = object instanceof String;
                    if (n3 != 0) {
                        return (((String)object).isEmpty() ^ n8) != 0;
                    }
                    n3 = object instanceof DF;
                    if (n3 != 0) {
                        return (DF.b.equals(object) ^ n8) != 0;
                    }
                    object = new IllegalArgumentException();
                    throw object;
                }
                case 7: {
                    return nw3.d.c(object, l2);
                }
                case 6: {
                    nw3$e nw3$e = nw3.d;
                    int n17 = nw3$e.g(object, l2);
                    if (n17 != 0) {
                        bl2 = true;
                    }
                    return bl2;
                }
                case 5: {
                    nw3$e nw3$e = nw3.d;
                    long l8 = nw3$e.h(object, l2);
                    n4 = (int)(l8 == l3 ? 0 : (l8 < l3 ? -1 : 1));
                    if (n4 != 0) {
                        bl2 = true;
                    }
                    return bl2;
                }
                case 4: {
                    nw3$e nw3$e = nw3.d;
                    int n18 = nw3$e.g(object, l2);
                    if (n18 != 0) {
                        bl2 = true;
                    }
                    return bl2;
                }
                case 3: {
                    nw3$e nw3$e = nw3.d;
                    long l12 = nw3$e.h(object, l2);
                    n4 = (int)(l12 == l3 ? 0 : (l12 < l3 ? -1 : 1));
                    if (n4 != 0) {
                        bl2 = true;
                    }
                    return bl2;
                }
                case 2: {
                    nw3$e nw3$e = nw3.d;
                    long l14 = nw3$e.h(object, l2);
                    n4 = (int)(l14 == l3 ? 0 : (l14 < l3 ? -1 : 1));
                    if (n4 != 0) {
                        bl2 = true;
                    }
                    return bl2;
                }
                case 1: {
                    float f5 = nw3.d.f(object, l2);
                    n3 = 0;
                    Object var11_25 = null;
                    float f6 = f5 - 0.0f;
                    float f7 = f6 == 0.0f ? 0 : (f6 > 0.0f ? 1 : -1);
                    if (f7 != false) {
                        bl2 = true;
                    }
                    return bl2;
                }
                case 0: 
            }
            nw3$e nw3$e = nw3.d;
            double d2 = nw3$e.e(object, l2);
            l2 = 0L;
            double d5 = 0.0;
            double d7 = d2 == d5 ? 0 : (d2 > d5 ? 1 : -1);
            if (d7 != false) {
                bl2 = true;
            }
            return bl2;
        }
        n3 += 2;
        int[] nArray = this.a;
        n3 = nArray[n3];
        n4 = n3 >>> 20;
        n4 = n8 << n4;
        nw3$e nw3$e = nw3.d;
        long l15 = n3 &= n7;
        int n19 = nw3$e.g(object, l15) & n4;
        if (n19 != 0) {
            bl2 = true;
        }
        return bl2;
    }

    public final boolean k(Object object, int n3, int n4) {
        n4 += 2;
        int[] nArray = this.a;
        n4 = nArray[n4];
        nw3$e nw3$e = nw3.d;
        int n7 = 1048575;
        long l2 = n4 &= n7;
        int n8 = nw3$e.g(object, l2);
        if (n8 == n3) {
            n8 = 1;
        } else {
            n8 = 0;
            object = null;
        }
        return n8 != 0;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void m(H var1_1, j var2_2, Object var3_3, D var4_4, i_0 var5_5) {
        var6_6 = this;
        var7_7 = var1_1;
        var8_8 = var2_2;
        var9_17 = var3_3;
        var10_18 = var4_4;
        var11_19 = var5_5;
        var12_20 = this.j;
        var13_21 = this.l;
        var14_22 = this.k;
        var15_23 = null;
        block101: while (true) {
            block125: {
                block126: {
                    block124: {
                        block121: {
                            block123: {
                                block122: {
                                    var16_24 = var4_4.getFieldNumber();
                                    var17_25 = var6_6.v(var16_24);
                                    if (var17_25 >= 0) break block121;
                                    var18_26 = -1 >>> 1;
                                    if (var16_24 != var18_26) break block122;
                                    while (var14_22 < var13_21) {
                                        var19_27 = var12_20[var14_22];
                                        var15_23 = var6_6.d(var9_17, var19_27, var15_23, var7_7);
                                        ++var14_22;
                                    }
                                    if (var15_23 != null) {
                                        var7_7.n(var9_17, var15_23);
                                    }
                                    return;
                                }
                                var18_26 = (int)var6_6.f;
                                if (var18_26 == 0) {
                                    var16_24 = 0;
                                    var20_28 = null;
                                } else {
                                    var21_29 = var6_6.e;
                                    var20_28 = var8_8.b(var11_19, (wo1_1)var21_29, var16_24);
                                }
                                if (var20_28 != null) break block123;
                                var1_1.getClass();
                                if (var15_23 == null) {
                                    var15_23 = var7_7.f(var9_17);
                                }
                                if ((var16_24 = (int)var7_7.l(var15_23, var10_18)) != 0) continue;
                                while (var14_22 < var13_21) {
                                    var19_27 = var12_20[var14_22];
                                    var15_23 = var6_6.d(var9_17, var19_27, var15_23, var7_7);
                                    ++var14_22;
                                }
                                if (var15_23 != null) {
                                    var7_7.n(var9_17, var15_23);
                                }
                                return;
                            }
                            var2_2.d(var3_3);
                            var8_8.g(var20_28);
                            throw null;
                        }
                        try {
                            var23_31 = var6_6.E(var17_25);
                            var18_26 = z.D(var23_31);
                            var24_32 = var6_6.n;
                        }
                        catch (Throwable var8_15) {
                            var22_30 = var14_22;
                            var27_34 = var15_23;
                            break;
                        }
                        switch (var18_26) {
                            default: {
                                if (var15_23 != null) ** GOTO lbl67
                                var15_23 = var1_1.m();
lbl67:
                                // 2 sources

                                ** if ((var16_24 = (int)var7_7.l((Object)var15_23, (D)var10_18)) != 0) goto lbl76
lbl-1000:
                                // 2 sources

                                {
                                    while (var14_22 < var13_21) {
                                        var19_27 = var12_20[var14_22];
                                        var15_23 = var6_6.d(var9_17, var19_27, var15_23, var7_7);
                                        ++var14_22;
                                    }
                                    if (var15_23 != null) {
                                        var7_7.n(var9_17, var15_23);
                                    }
                                    return;
                                }
lbl76:
                                // 1 sources

                                ** GOTO lbl122
                            }
                            case 68: {
                                try {
                                    var25_33 = z.s(var23_31);
                                    var24_32 = var6_6.g(var17_25);
                                    var24_32 = var10_18.c((st2_0)var24_32, var11_19);
                                    nw3.r(var9_17, var25_33, var24_32);
                                    var6_6.C(var9_17, var16_24, var17_25);
                                    ** GOTO lbl141
                                }
                                catch (Throwable var8_9) {}
                                ** GOTO lbl-1000
                                catch (InvalidProtocolBufferException$InvalidWireTypeException v0) {}
                                ** GOTO lbl-1000
                            }
                            case 67: {
                                var25_33 = z.s(var23_31);
                                var28_35 = var4_4.readSInt64();
                                var24_32 = var28_35;
                                nw3.r(var9_17, var25_33, var24_32);
                                var6_6.C(var9_17, var16_24, var17_25);
                                ** GOTO lbl141
                            }
                            case 66: {
                                var25_33 = z.s(var23_31);
                                var30_36 = var4_4.readSInt32();
                                var24_32 = var30_36;
                                nw3.r(var9_17, var25_33, var24_32);
                                var6_6.C(var9_17, var16_24, var17_25);
                                ** GOTO lbl141
                            }
                            case 65: {
                                var25_33 = z.s(var23_31);
                                var28_35 = var4_4.readSFixed64();
                                var24_32 = var28_35;
                                nw3.r(var9_17, var25_33, var24_32);
                                var6_6.C(var9_17, var16_24, var17_25);
                                ** GOTO lbl141
                            }
                            case 64: {
                                var25_33 = z.s(var23_31);
                                var30_36 = var4_4.readSFixed32();
                                var24_32 = var30_36;
                                nw3.r(var9_17, var25_33, var24_32);
                                var6_6.C(var9_17, var16_24, var17_25);
                                ** GOTO lbl141
                            }
                            case 63: {
                                var18_26 = var4_4.readEnum();
                                var24_32 = var6_6.e(var17_25);
                                if (var24_32 == null || (var30_36 = (int)var24_32.a()) != 0) ** GOTO lbl124
                                var15_23 = E.D(var16_24, var18_26, var15_23, var7_7);
lbl122:
                                // 2 sources

                                var22_30 = var14_22;
                                break block125;
lbl124:
                                // 1 sources

                                var31_37 = z.s(var23_31);
                                var21_29 = var18_26;
                                nw3.r(var9_17, var31_37, var21_29);
                                var6_6.C(var9_17, var16_24, var17_25);
                                ** GOTO lbl141
                            }
                            case 62: {
                                var25_33 = z.s(var23_31);
                                var30_36 = var4_4.readUInt32();
                                var24_32 = var30_36;
                                nw3.r(var9_17, var25_33, var24_32);
                                var6_6.C(var9_17, var16_24, var17_25);
                                ** GOTO lbl141
                            }
                            case 61: {
                                var25_33 = z.s(var23_31);
                                var24_32 = var4_4.readBytes();
                                nw3.r(var9_17, var25_33, var24_32);
                                var6_6.C(var9_17, var16_24, var17_25);
lbl141:
                                // 8 sources

                                var22_30 = var14_22;
                                var27_34 = var15_23;
                            }
                            case 60: {
                                var18_26 = (int)var6_6.k(var9_17, var16_24, var17_25);
                                if (var18_26 == 0) ** GOTO lbl158
                                var33_38 = var15_23;
                                var34_39 = z.s(var23_31);
                                var21_29 = nw3.k(var9_17, var34_39);
                                var24_32 = var6_6.g(var17_25);
                                var24_32 = var10_18.e((st2_0)var24_32, var11_19);
                                var21_29 = androidx.datastore.preferences.protobuf.p.c(var21_29, var24_32);
                                var31_37 = z.s(var23_31);
                                nw3.r(var9_17, var31_37, var21_29);
                                ** GOTO lbl165
lbl158:
                                // 1 sources

                                var33_38 = var15_23;
                                var25_33 = z.s(var23_31);
                                var24_32 = var6_6.g(var17_25);
                                var24_32 = var10_18.e((st2_0)var24_32, var11_19);
                                nw3.r(var9_17, var25_33, var24_32);
                                var6_6.B(var9_17, var17_25);
lbl165:
                                // 2 sources

                                var6_6.C(var9_17, var16_24, var17_25);
                                ** GOTO lbl262
                                catch (Throwable var8_12) {
                                    var33_38 = var15_23;
                                }
lbl-1000:
                                // 2 sources

                                {
                                    var22_30 = var14_22;
                                    break block101;
                                }
                                catch (InvalidProtocolBufferException$InvalidWireTypeException v1) {
                                    var33_38 = var15_23;
                                }
lbl-1000:
                                // 2 sources

                                {
                                    var22_30 = var14_22;
                                    break block124;
                                }
                            }
                            case 59: {
                                var33_38 = var15_23;
                                try {
                                    var6_6.y(var9_17, var23_31, var10_18);
                                    var6_6.C(var9_17, var16_24, var17_25);
                                    ** GOTO lbl262
                                }
                                catch (Throwable var8_11) {
                                    var22_30 = var14_22;
                                    var15_23 = var33_38;
                                    break block101;
                                }
                                catch (InvalidProtocolBufferException$InvalidWireTypeException v2) {
                                    var22_30 = var14_22;
                                    var15_23 = var33_38;
                                    break block124;
                                }
                            }
                            case 58: {
                                var33_38 = var15_23;
                                var25_33 = z.s(var23_31);
                                var30_36 = (int)var4_4.readBool();
                                var24_32 = (boolean)var30_36;
                                nw3.r(var9_17, var25_33, var24_32);
                                var6_6.C(var9_17, var16_24, var17_25);
                                ** GOTO lbl262
                            }
                            case 57: {
                                var33_38 = var15_23;
                                var25_33 = z.s(var23_31);
                                var30_36 = var4_4.readFixed32();
                                var24_32 = var30_36;
                                nw3.r(var9_17, var25_33, var24_32);
                                var6_6.C(var9_17, var16_24, var17_25);
                                ** GOTO lbl262
                            }
                            case 56: {
                                var33_38 = var15_23;
                                var25_33 = z.s(var23_31);
                                var34_39 = var4_4.readFixed64();
                                var24_32 = var34_39;
                                nw3.r(var9_17, var25_33, var24_32);
                                var6_6.C(var9_17, var16_24, var17_25);
                                ** GOTO lbl262
                            }
                            case 55: {
                                var33_38 = var15_23;
                                var25_33 = z.s(var23_31);
                                var30_36 = var4_4.readInt32();
                                var24_32 = var30_36;
                                nw3.r(var9_17, var25_33, var24_32);
                                var6_6.C(var9_17, var16_24, var17_25);
                                ** GOTO lbl262
                            }
                            case 54: {
                                var33_38 = var15_23;
                                var25_33 = z.s(var23_31);
                                var34_39 = var4_4.readUInt64();
                                var24_32 = var34_39;
                                nw3.r(var9_17, var25_33, var24_32);
                                var6_6.C(var9_17, var16_24, var17_25);
                                ** GOTO lbl262
                            }
                            case 53: {
                                var33_38 = var15_23;
                                var25_33 = z.s(var23_31);
                                var34_39 = var4_4.readInt64();
                                var24_32 = var34_39;
                                nw3.r(var9_17, var25_33, var24_32);
                                var6_6.C(var9_17, var16_24, var17_25);
                                ** GOTO lbl262
                            }
                            case 52: {
                                var33_38 = var15_23;
                                var25_33 = z.s(var23_31);
                                var36_40 = var4_4.readFloat();
                                var24_32 = Float.valueOf(var36_40);
                                nw3.r(var9_17, var25_33, var24_32);
                                var6_6.C(var9_17, var16_24, var17_25);
                                ** GOTO lbl262
                            }
                            case 51: {
                                var33_38 = var15_23;
                                var25_33 = z.s(var23_31);
                                var37_41 = var4_4.readDouble();
                                var24_32 = var37_41;
                                nw3.r(var9_17, var25_33, var24_32);
                                var6_6.C(var9_17, var16_24, var17_25);
                                ** GOTO lbl262
                            }
                            case 50: {
                                var33_38 = var15_23;
                                var24_32 = var6_6.f(var17_25);
                                var20_28 = this;
                                var21_29 = var3_3;
                                var23_31 = var17_25;
                                var39_42 = var5_5;
                                var40_43 = var4_4;
                                this.n(var3_3, var17_25, var24_32, var5_5, var4_4);
lbl262:
                                // 11 sources

                                var22_30 = var14_22;
                                var27_34 = var33_38;
                            }
                            case 49: {
                                var33_38 = var15_23;
                                var31_37 = z.s(var23_31);
                                var40_43 = var6_6.g(var17_25);
                                var20_28 = this;
                                var21_29 = var3_3;
                                var39_42 = var4_4;
                                var22_30 = var14_22;
                                var27_34 = var15_23;
                                var15_23 = var5_5;
                                this.w(var3_3, var31_37, var4_4, (st2_0)var40_43, var5_5);
                                catch (Throwable var8_14) {
                                    var22_30 = var14_22;
                                    var27_34 = var33_38;
                                }
                                catch (InvalidProtocolBufferException$InvalidWireTypeException v3) {
                                    var22_30 = var14_22;
                                    var27_34 = var33_38;
                                }
                            }
                            case 48: {
                                var22_30 = var14_22;
                                var27_34 = var15_23;
                                try {
                                    var41_44 = z.s(var23_31);
                                    var20_28 = var24_32.c(var9_17, var41_44);
                                    var10_18.readSInt64List((List)var20_28);
                                }
                                catch (Throwable var8_13) {}
                                catch (InvalidProtocolBufferException$InvalidWireTypeException v4) {}
                            }
                            finally {
                                var15_23 = var27_34;
                                break block125;
                            }
                            case 47: {
                                var22_30 = var14_22;
                                var27_34 = var15_23;
                                var41_44 = z.s(var23_31);
                                var20_28 = var24_32.c(var9_17, var41_44);
                                var10_18.readSInt32List((List)var20_28);
                            }
                            case 46: {
                                var22_30 = var14_22;
                                var27_34 = var15_23;
                                var41_44 = z.s(var23_31);
                                var20_28 = var24_32.c(var9_17, var41_44);
                                var10_18.readSFixed64List((List)var20_28);
                            }
                            case 45: {
                                var22_30 = var14_22;
                                var27_34 = var15_23;
                                var41_44 = z.s(var23_31);
                                var20_28 = var24_32.c(var9_17, var41_44);
                                var10_18.readSFixed32List((List)var20_28);
                            }
                            case 44: {
                                var22_30 = var14_22;
                                var27_34 = var15_23;
                                var25_33 = z.s(var23_31);
                                var21_29 = var24_32.c(var9_17, var25_33);
                                var10_18.readEnumList((List)var21_29);
                                var43_45 = var6_6.e(var17_25);
                                var15_23 = E.z(var16_24, (List)var21_29, (p$b)var43_45, var15_23, var7_7);
                                break block125;
                            }
                            case 43: {
                                var22_30 = var14_22;
                                var27_34 = var15_23;
                                var41_44 = z.s(var23_31);
                                var20_28 = var24_32.c(var9_17, var41_44);
                                var10_18.readUInt32List((List)var20_28);
                            }
                            case 42: {
                                var22_30 = var14_22;
                                var27_34 = var15_23;
                                var41_44 = z.s(var23_31);
                                var20_28 = var24_32.c(var9_17, var41_44);
                                var10_18.readBoolList((List)var20_28);
                            }
                            case 41: {
                                var22_30 = var14_22;
                                var27_34 = var15_23;
                                var41_44 = z.s(var23_31);
                                var20_28 = var24_32.c(var9_17, var41_44);
                                var10_18.readFixed32List((List)var20_28);
                            }
                            case 40: {
                                var22_30 = var14_22;
                                var27_34 = var15_23;
                                var41_44 = z.s(var23_31);
                                var20_28 = var24_32.c(var9_17, var41_44);
                                var10_18.readFixed64List((List)var20_28);
                            }
                            case 39: {
                                var22_30 = var14_22;
                                var27_34 = var15_23;
                                var41_44 = z.s(var23_31);
                                var20_28 = var24_32.c(var9_17, var41_44);
                                var10_18.readInt32List((List)var20_28);
                            }
                            case 38: {
                                var22_30 = var14_22;
                                var27_34 = var15_23;
                                var41_44 = z.s(var23_31);
                                var20_28 = var24_32.c(var9_17, var41_44);
                                var10_18.readUInt64List((List)var20_28);
                            }
                            case 37: {
                                var22_30 = var14_22;
                                var27_34 = var15_23;
                                var41_44 = z.s(var23_31);
                                var20_28 = var24_32.c(var9_17, var41_44);
                                var10_18.readInt64List((List)var20_28);
                            }
                            case 36: {
                                var22_30 = var14_22;
                                var27_34 = var15_23;
                                var41_44 = z.s(var23_31);
                                var20_28 = var24_32.c(var9_17, var41_44);
                                var10_18.readFloatList((List)var20_28);
                            }
                            case 35: {
                                var22_30 = var14_22;
                                var27_34 = var15_23;
                                var41_44 = z.s(var23_31);
                                var20_28 = var24_32.c(var9_17, var41_44);
                                var10_18.readDoubleList((List)var20_28);
                            }
                            case 34: {
                                var22_30 = var14_22;
                                var27_34 = var15_23;
                                var41_44 = z.s(var23_31);
                                var20_28 = var24_32.c(var9_17, var41_44);
                                var10_18.readSInt64List((List)var20_28);
                            }
                            case 33: {
                                var22_30 = var14_22;
                                var27_34 = var15_23;
                                var41_44 = z.s(var23_31);
                                var20_28 = var24_32.c(var9_17, var41_44);
                                var10_18.readSInt32List((List)var20_28);
                            }
                            case 32: {
                                var22_30 = var14_22;
                                var27_34 = var15_23;
                                var41_44 = z.s(var23_31);
                                var20_28 = var24_32.c(var9_17, var41_44);
                                var10_18.readSFixed64List((List)var20_28);
                            }
                            case 31: {
                                var22_30 = var14_22;
                                var27_34 = var15_23;
                                var41_44 = z.s(var23_31);
                                var20_28 = var24_32.c(var9_17, var41_44);
                                var10_18.readSFixed32List((List)var20_28);
                            }
                            case 30: {
                                var22_30 = var14_22;
                                var27_34 = var15_23;
                                var25_33 = z.s(var23_31);
                                var21_29 = var24_32.c(var9_17, var25_33);
                                var10_18.readEnumList((List)var21_29);
                                var43_45 = var6_6.e(var17_25);
                                var15_23 = E.z(var16_24, (List)var21_29, (p$b)var43_45, var15_23, var7_7);
                                break block125;
                            }
                            case 29: {
                                var22_30 = var14_22;
                                var27_34 = var15_23;
                                var41_44 = z.s(var23_31);
                                var20_28 = var24_32.c(var9_17, var41_44);
                                var10_18.readUInt32List((List)var20_28);
                            }
                            case 28: {
                                var22_30 = var14_22;
                                var27_34 = var15_23;
                                var41_44 = z.s(var23_31);
                                var20_28 = var24_32.c(var9_17, var41_44);
                                var10_18.readBytesList((List)var20_28);
                            }
                            case 27: {
                                var22_30 = var14_22;
                                var27_34 = var15_23;
                                var39_42 = var6_6.g(var17_25);
                                var20_28 = this;
                                var21_29 = var3_3;
                                var24_32 = var4_4;
                                var40_43 = var5_5;
                                this.x(var3_3, var23_31, var4_4, (st2_0)var39_42, var5_5);
                            }
                            case 26: {
                                var22_30 = var14_22;
                                var27_34 = var15_23;
                                var6_6.z(var9_17, var23_31, var10_18);
                            }
                            case 25: {
                                var22_30 = var14_22;
                                var27_34 = var15_23;
                                var41_44 = z.s(var23_31);
                                var20_28 = var24_32.c(var9_17, var41_44);
                                var10_18.readBoolList((List)var20_28);
                            }
                            case 24: {
                                var22_30 = var14_22;
                                var27_34 = var15_23;
                                var41_44 = z.s(var23_31);
                                var20_28 = var24_32.c(var9_17, var41_44);
                                var10_18.readFixed32List((List)var20_28);
                            }
                            case 23: {
                                var22_30 = var14_22;
                                var27_34 = var15_23;
                                var41_44 = z.s(var23_31);
                                var20_28 = var24_32.c(var9_17, var41_44);
                                var10_18.readFixed64List((List)var20_28);
                            }
                            case 22: {
                                var22_30 = var14_22;
                                var27_34 = var15_23;
                                var41_44 = z.s(var23_31);
                                var20_28 = var24_32.c(var9_17, var41_44);
                                var10_18.readInt32List((List)var20_28);
                            }
                            case 21: {
                                var22_30 = var14_22;
                                var27_34 = var15_23;
                                var41_44 = z.s(var23_31);
                                var20_28 = var24_32.c(var9_17, var41_44);
                                var10_18.readUInt64List((List)var20_28);
                            }
                            case 20: {
                                var22_30 = var14_22;
                                var27_34 = var15_23;
                                var41_44 = z.s(var23_31);
                                var20_28 = var24_32.c(var9_17, var41_44);
                                var10_18.readInt64List((List)var20_28);
                            }
                            case 19: {
                                var22_30 = var14_22;
                                var27_34 = var15_23;
                                var41_44 = z.s(var23_31);
                                var20_28 = var24_32.c(var9_17, var41_44);
                                var10_18.readFloatList((List)var20_28);
                            }
                            case 18: {
                                var22_30 = var14_22;
                                var27_34 = var15_23;
                                var41_44 = z.s(var23_31);
                                var20_28 = var24_32.c(var9_17, var41_44);
                                var10_18.readDoubleList((List)var20_28);
                            }
                            case 17: {
                                var22_30 = var14_22;
                                var27_34 = var15_23;
                                var16_24 = (int)var6_6.j(var9_17, var17_25);
                                if (var16_24 != 0) {
                                    var41_44 = z.s(var23_31);
                                    var20_28 = nw3.k(var9_17, var41_44);
                                    var21_29 = var6_6.g(var17_25);
                                    var21_29 = var10_18.c((st2_0)var21_29, var11_19);
                                    var20_28 = androidx.datastore.preferences.protobuf.p.c(var20_28, var21_29);
                                    var25_33 = z.s(var23_31);
                                    nw3.r(var9_17, var25_33, var20_28);
                                }
                                var41_44 = z.s(var23_31);
                                var43_45 = var6_6.g(var17_25);
                                var43_45 = var10_18.c((st2_0)var43_45, var11_19);
                                nw3.r(var9_17, var41_44, var43_45);
                                var6_6.B(var9_17, var17_25);
                            }
                            case 16: {
                                var22_30 = var14_22;
                                var27_34 = var15_23;
                                var41_44 = z.s(var23_31);
                                var31_37 = var4_4.readSInt64();
                                nw3.q(var9_17, var41_44, var31_37);
                                var6_6.B(var9_17, var17_25);
                            }
                            case 15: {
                                var22_30 = var14_22;
                                var27_34 = var15_23;
                                var41_44 = z.s(var23_31);
                                var23_31 = var4_4.readSInt32();
                                nw3.p(var9_17, var41_44, var23_31);
                                var6_6.B(var9_17, var17_25);
                            }
                            case 14: {
                                var22_30 = var14_22;
                                var27_34 = var15_23;
                                var41_44 = z.s(var23_31);
                                var31_37 = var4_4.readSFixed64();
                                nw3.q(var9_17, var41_44, var31_37);
                                var6_6.B(var9_17, var17_25);
                            }
                            case 13: {
                                var22_30 = var14_22;
                                var27_34 = var15_23;
                                var41_44 = z.s(var23_31);
                                var23_31 = var4_4.readSFixed32();
                                nw3.p(var9_17, var41_44, var23_31);
                                var6_6.B(var9_17, var17_25);
                            }
                            case 12: {
                                var22_30 = var14_22;
                                var27_34 = var15_23;
                                var18_26 = var4_4.readEnum();
                                var24_32 = var6_6.e(var17_25);
                                if (var24_32 != null && (var30_36 = (int)var24_32.a()) == 0) {
                                    var15_23 = E.D(var16_24, var18_26, var15_23, var7_7);
                                    break block125;
                                } else {
                                    var31_37 = z.s(var23_31);
                                    nw3.p(var9_17, var31_37, var18_26);
                                    var6_6.B(var9_17, var17_25);
                                }
                            }
                            case 11: {
                                var22_30 = var14_22;
                                var27_34 = var15_23;
                                var41_44 = z.s(var23_31);
                                var23_31 = var4_4.readUInt32();
                                nw3.p(var9_17, var41_44, var23_31);
                                var6_6.B(var9_17, var17_25);
                            }
                            case 10: {
                                var22_30 = var14_22;
                                var27_34 = var15_23;
                                var41_44 = z.s(var23_31);
                                var43_45 = var4_4.readBytes();
                                nw3.r(var9_17, var41_44, var43_45);
                                var6_6.B(var9_17, var17_25);
                            }
                            case 9: {
                                var22_30 = var14_22;
                                var27_34 = var15_23;
                                var16_24 = (int)var6_6.j(var9_17, var17_25);
                                if (var16_24 != 0) {
                                    var41_44 = z.s(var23_31);
                                    var20_28 = nw3.k(var9_17, var41_44);
                                    var21_29 = var6_6.g(var17_25);
                                    var21_29 = var10_18.e((st2_0)var21_29, var11_19);
                                    var20_28 = androidx.datastore.preferences.protobuf.p.c(var20_28, var21_29);
                                    var25_33 = z.s(var23_31);
                                    nw3.r(var9_17, var25_33, var20_28);
                                }
                                var41_44 = z.s(var23_31);
                                var43_45 = var6_6.g(var17_25);
                                var43_45 = var10_18.e((st2_0)var43_45, var11_19);
                                nw3.r(var9_17, var41_44, var43_45);
                                var6_6.B(var9_17, var17_25);
                            }
                            case 8: {
                                var22_30 = var14_22;
                                var27_34 = var15_23;
                                var6_6.y(var9_17, var23_31, var10_18);
                                var6_6.B(var9_17, var17_25);
                            }
                            case 7: {
                                var22_30 = var14_22;
                                var27_34 = var15_23;
                                var41_44 = z.s(var23_31);
                                var23_31 = (int)var4_4.readBool();
                                var24_32 = nw3.d;
                                var24_32.k(var9_17, var41_44, (boolean)var23_31);
                                var6_6.B(var9_17, var17_25);
                            }
                            case 6: {
                                var22_30 = var14_22;
                                var27_34 = var15_23;
                                var41_44 = z.s(var23_31);
                                var23_31 = var4_4.readFixed32();
                                nw3.p(var9_17, var41_44, var23_31);
                                var6_6.B(var9_17, var17_25);
                            }
                            case 5: {
                                var22_30 = var14_22;
                                var27_34 = var15_23;
                                var41_44 = z.s(var23_31);
                                var31_37 = var4_4.readFixed64();
                                nw3.q(var9_17, var41_44, var31_37);
                                var6_6.B(var9_17, var17_25);
                            }
                            case 4: {
                                var22_30 = var14_22;
                                var27_34 = var15_23;
                                var41_44 = z.s(var23_31);
                                var23_31 = var4_4.readInt32();
                                nw3.p(var9_17, var41_44, var23_31);
                                var6_6.B(var9_17, var17_25);
                            }
                            case 3: {
                                var22_30 = var14_22;
                                var27_34 = var15_23;
                                var41_44 = z.s(var23_31);
                                var31_37 = var4_4.readUInt64();
                                nw3.q(var9_17, var41_44, var31_37);
                                var6_6.B(var9_17, var17_25);
                            }
                            case 2: {
                                var22_30 = var14_22;
                                var27_34 = var15_23;
                                var41_44 = z.s(var23_31);
                                var31_37 = var4_4.readInt64();
                                nw3.q(var9_17, var41_44, var31_37);
                                var6_6.B(var9_17, var17_25);
                            }
                            case 1: {
                                var22_30 = var14_22;
                                var27_34 = var15_23;
                                var41_44 = z.s(var23_31);
                                var44_46 = var4_4.readFloat();
                                var24_32 = nw3.d;
                                var24_32.n(var9_17, var41_44, var44_46);
                                var6_6.B(var9_17, var17_25);
                            }
                            case 0: 
                        }
                        var22_30 = var14_22;
                        var27_34 = var15_23;
                        var31_37 = z.s(var23_31);
                        var37_41 = var4_4.readDouble();
                        var20_28 = nw3.d;
                        var21_29 = var3_3;
                        var19_27 = var17_25;
                        var20_28.m(var3_3, var31_37, var37_41);
                        var6_6.B(var9_17, var17_25);
                        catch (InvalidProtocolBufferException$InvalidWireTypeException v5) {
                            var22_30 = var14_22;
                            var27_34 = var15_23;
                        }
                    }
                    try {
                        var1_1.getClass();
                        if (var15_23 != null) break block126;
                        var15_23 = var8_8 = var7_7.f(var9_17);
                    }
                    catch (Throwable var8_16) {
                        break;
                    }
                }
                if ((var19_27 = (int)var7_7.l(var15_23, var10_18)) == 0) {
                    for (var14_22 = var22_30; var14_22 < var13_21; ++var14_22) {
                        var19_27 = var12_20[var14_22];
                        var15_23 = var6_6.d(var9_17, var19_27, var15_23, var7_7);
                    }
                    if (var15_23 != null) {
                        var7_7.n(var9_17, var15_23);
                    }
                    return;
                }
            }
            var8_8 = var2_2;
            var14_22 = var22_30;
        }
        for (var14_22 = var22_30; var14_22 < var13_21; ++var14_22) {
            var16_24 = var12_20[var14_22];
            var15_23 = var6_6.d(var9_17, var16_24, var15_23, var7_7);
        }
        if (var15_23 != null) {
            var7_7.n(var9_17, var15_23);
        }
        throw var8_10;
    }

    public final void makeImmutable(Object object) {
        int n3;
        int[] nArray;
        int n4 = this.k;
        while (true) {
            nArray = this.j;
            n3 = this.l;
            if (n4 >= n3) break;
            int n7 = nArray[n4];
            n7 = this.E(n7);
            n3 = 1048575;
            long l2 = n7 &= n3;
            Object object2 = nw3.d.i(object, l2);
            if (object2 != null) {
                w w4 = this.q;
                object2 = w4.toImmutable(object2);
                nw3.r(object, l2, object2);
            }
            ++n4;
        }
        n4 = nArray.length;
        while (n3 < n4) {
            int n8 = nArray[n3];
            long l3 = n8;
            s s7 = this.n;
            s7.a(object, l3);
            ++n3;
        }
        Object object3 = this.o;
        ((H)object3).j(object);
        n4 = (int)(this.f ? 1 : 0);
        if (n4 != 0) {
            object3 = this.p;
            ((j)object3).f(object);
        }
    }

    public final void mergeFrom(Object object, Object object2) {
        Object object3;
        Object object4;
        int n3;
        int n4;
        object2.getClass();
        Object object5 = null;
        block26: for (n4 = 0; n4 < (n3 = ((int[])(object4 = this.a)).length); n4 += 3) {
            n3 = this.E(n4);
            int n7 = 0xFFFFF & n3;
            long l2 = n7;
            int n8 = object4[n4];
            n3 = z.D(n3);
            switch (n3) {
                default: {
                    continue block26;
                }
                case 68: {
                    this.p(object, object2, n4);
                    continue block26;
                }
                case 61: 
                case 62: 
                case 63: 
                case 64: 
                case 65: 
                case 66: 
                case 67: {
                    n3 = (int)(this.k(object2, n8, n4) ? 1 : 0);
                    if (n3 == 0) continue block26;
                    object3 = nw3.d.i(object2, l2);
                    nw3.r(object, l2, object3);
                    this.C(object, n8, n4);
                    continue block26;
                }
                case 60: {
                    this.p(object, object2, n4);
                    continue block26;
                }
                case 51: 
                case 52: 
                case 53: 
                case 54: 
                case 55: 
                case 56: 
                case 57: 
                case 58: 
                case 59: {
                    n3 = (int)(this.k(object2, n8, n4) ? 1 : 0);
                    if (n3 == 0) continue block26;
                    object3 = nw3.d.i(object2, l2);
                    nw3.r(object, l2, object3);
                    this.C(object, n8, n4);
                    continue block26;
                }
                case 50: {
                    object4 = E.a;
                    object4 = nw3.d;
                    object3 = ((nw3$e)object4).i(object, l2);
                    object4 = ((nw3$e)object4).i(object2, l2);
                    w w4 = this.q;
                    object4 = w4.mergeFrom(object3, object4);
                    nw3.r(object, l2, object4);
                    continue block26;
                }
                case 18: 
                case 19: 
                case 20: 
                case 21: 
                case 22: 
                case 23: 
                case 24: 
                case 25: 
                case 26: 
                case 27: 
                case 28: 
                case 29: 
                case 30: 
                case 31: 
                case 32: 
                case 33: 
                case 34: 
                case 35: 
                case 36: 
                case 37: 
                case 38: 
                case 39: 
                case 40: 
                case 41: 
                case 42: 
                case 43: 
                case 44: 
                case 45: 
                case 46: 
                case 47: 
                case 48: 
                case 49: {
                    object4 = this.n;
                    ((s)object4).b(object, object2, l2);
                    continue block26;
                }
                case 17: {
                    this.o(object, object2, n4);
                    continue block26;
                }
                case 16: {
                    n8 = (int)(this.j(object2, n4) ? 1 : 0);
                    if (n8 == 0) continue block26;
                    object4 = nw3.d;
                    long l3 = ((nw3$e)object4).h(object2, l2);
                    nw3.q(object, l2, l3);
                    this.B(object, n4);
                    continue block26;
                }
                case 15: {
                    n8 = (int)(this.j(object2, n4) ? 1 : 0);
                    if (n8 == 0) continue block26;
                    object4 = nw3.d;
                    n8 = ((nw3$e)object4).g(object2, l2);
                    nw3.p(object, l2, n8);
                    this.B(object, n4);
                    continue block26;
                }
                case 14: {
                    n8 = (int)(this.j(object2, n4) ? 1 : 0);
                    if (n8 == 0) continue block26;
                    object4 = nw3.d;
                    long l3 = ((nw3$e)object4).h(object2, l2);
                    nw3.q(object, l2, l3);
                    this.B(object, n4);
                    continue block26;
                }
                case 13: {
                    n8 = (int)(this.j(object2, n4) ? 1 : 0);
                    if (n8 == 0) continue block26;
                    object4 = nw3.d;
                    n8 = ((nw3$e)object4).g(object2, l2);
                    nw3.p(object, l2, n8);
                    this.B(object, n4);
                    continue block26;
                }
                case 12: {
                    n8 = (int)(this.j(object2, n4) ? 1 : 0);
                    if (n8 == 0) continue block26;
                    object4 = nw3.d;
                    n8 = ((nw3$e)object4).g(object2, l2);
                    nw3.p(object, l2, n8);
                    this.B(object, n4);
                    continue block26;
                }
                case 11: {
                    n8 = (int)(this.j(object2, n4) ? 1 : 0);
                    if (n8 == 0) continue block26;
                    object4 = nw3.d;
                    n8 = ((nw3$e)object4).g(object2, l2);
                    nw3.p(object, l2, n8);
                    this.B(object, n4);
                    continue block26;
                }
                case 10: {
                    n8 = (int)(this.j(object2, n4) ? 1 : 0);
                    if (n8 == 0) continue block26;
                    object4 = nw3.d.i(object2, l2);
                    nw3.r(object, l2, object4);
                    this.B(object, n4);
                    continue block26;
                }
                case 9: {
                    this.o(object, object2, n4);
                    continue block26;
                }
                case 8: {
                    n8 = (int)(this.j(object2, n4) ? 1 : 0);
                    if (n8 == 0) continue block26;
                    object4 = nw3.d.i(object2, l2);
                    nw3.r(object, l2, object4);
                    this.B(object, n4);
                    continue block26;
                }
                case 7: {
                    n8 = (int)(this.j(object2, n4) ? 1 : 0);
                    if (n8 == 0) continue block26;
                    object4 = nw3.d;
                    n3 = (int)(((nw3$e)object4).c(object2, l2) ? 1 : 0);
                    ((nw3$e)object4).k(object, l2, n3 != 0);
                    this.B(object, n4);
                    continue block26;
                }
                case 6: {
                    n8 = (int)(this.j(object2, n4) ? 1 : 0);
                    if (n8 == 0) continue block26;
                    object4 = nw3.d;
                    n8 = ((nw3$e)object4).g(object2, l2);
                    nw3.p(object, l2, n8);
                    this.B(object, n4);
                    continue block26;
                }
                case 5: {
                    n8 = (int)(this.j(object2, n4) ? 1 : 0);
                    if (n8 == 0) continue block26;
                    object4 = nw3.d;
                    long l3 = ((nw3$e)object4).h(object2, l2);
                    nw3.q(object, l2, l3);
                    this.B(object, n4);
                    continue block26;
                }
                case 4: {
                    n8 = (int)(this.j(object2, n4) ? 1 : 0);
                    if (n8 == 0) continue block26;
                    object4 = nw3.d;
                    n8 = ((nw3$e)object4).g(object2, l2);
                    nw3.p(object, l2, n8);
                    this.B(object, n4);
                    continue block26;
                }
                case 3: {
                    n8 = (int)(this.j(object2, n4) ? 1 : 0);
                    if (n8 == 0) continue block26;
                    object4 = nw3.d;
                    long l3 = ((nw3$e)object4).h(object2, l2);
                    nw3.q(object, l2, l3);
                    this.B(object, n4);
                    continue block26;
                }
                case 2: {
                    n8 = (int)(this.j(object2, n4) ? 1 : 0);
                    if (n8 == 0) continue block26;
                    object4 = nw3.d;
                    long l3 = ((nw3$e)object4).h(object2, l2);
                    nw3.q(object, l2, l3);
                    this.B(object, n4);
                    continue block26;
                }
                case 1: {
                    n8 = (int)(this.j(object2, n4) ? 1 : 0);
                    if (n8 == 0) continue block26;
                    object4 = nw3.d;
                    float f5 = ((nw3$e)object4).f(object2, l2);
                    ((nw3$e)object4).n(object, l2, f5);
                    this.B(object, n4);
                    continue block26;
                }
                case 0: {
                    n8 = (int)(this.j(object2, n4) ? 1 : 0);
                    if (n8 == 0) continue block26;
                    nw3$e nw3$e = nw3.d;
                    double d2 = nw3$e.e(object2, l2);
                    nw3$e.m(object, l2, d2);
                    this.B(object, n4);
                }
            }
        }
        n4 = (int)(this.h ? 1 : 0);
        if (n4 == 0) {
            object5 = E.a;
            object5 = this.o;
            object4 = ((H)object5).g(object);
            object3 = ((H)object5).g(object2);
            object4 = ((H)object5).k(object4, object3);
            ((H)object5).o(object, object4);
            n4 = (int)(this.f ? 1 : 0);
            if (n4 != 0) {
                object5 = this.p;
                E.B((j)object5, object, object2);
            }
        }
    }

    public final void n(Object object, int n3, Object object2, i_0 i_02, D d2) {
        n3 = this.E(n3);
        int n4 = 1048575;
        long l2 = n3 &= n4;
        Object object3 = nw3.d.i(object, l2);
        w w4 = this.q;
        if (object3 == null) {
            object3 = w4.a();
            nw3.r(object, l2, object3);
        } else {
            boolean bl2 = w4.isImmutable(object3);
            if (bl2) {
                v v4 = w4.a();
                w4.mergeFrom(v4, object3);
                nw3.r(object, l2, v4);
                object3 = v4;
            }
        }
        object = w4.forMutableMapData(object3);
        object3 = w4.forMapMetadata(object2);
        d2.d((Map)object, (u$a)object3, i_02);
    }

    public final Object newInstance() {
        kZ1 kZ12 = this.m;
        wo1_1 wo1_12 = this.e;
        return kZ12.newInstance(wo1_12);
    }

    public final void o(Object object, Object object2, int n3) {
        int n4 = this.E(n3);
        int n7 = 1048575;
        long l2 = n4 &= n7;
        boolean bl2 = this.j(object2, n3);
        if (!bl2) {
            return;
        }
        nw3$e nw3$e = nw3.d;
        Object object3 = nw3$e.i(object, l2);
        object2 = nw3$e.i(object2, l2);
        if (object3 != null && object2 != null) {
            object2 = androidx.datastore.preferences.protobuf.p.c(object3, object2);
            nw3.r(object, l2, object2);
            this.B(object, n3);
        } else if (object2 != null) {
            nw3.r(object, l2, object2);
            this.B(object, n3);
        }
    }

    public final void p(Object object, Object object2, int n3) {
        int n4 = this.E(n3);
        int[] nArray = this.a;
        int n7 = nArray[n3];
        int n8 = 1048575;
        long l2 = n4 & n8;
        n4 = (int)(this.k(object2, n7, n3) ? 1 : 0);
        if (n4 == 0) {
            return;
        }
        nw3$e nw3$e = nw3.d;
        Object object3 = nw3$e.i(object, l2);
        object2 = nw3$e.i(object2, l2);
        if (object3 != null && object2 != null) {
            object2 = androidx.datastore.preferences.protobuf.p.c(object3, object2);
            nw3.r(object, l2, object2);
            this.C(object, n7, n3);
        } else if (object2 != null) {
            nw3.r(object, l2, object2);
            this.C(object, n7, n3);
        }
    }

    public final int v(int n3) {
        int n4 = this.c;
        int n7 = -1;
        if (n3 >= n4 && n3 <= (n4 = this.d)) {
            int[] nArray = this.a;
            int n8 = nArray.length / 3 + -1;
            int n10 = 0;
            while (n10 <= n8) {
                int n14 = n8 + n10 >>> 1;
                int n15 = n14 * 3;
                int n16 = nArray[n15];
                if (n3 == n16) {
                    n7 = n15;
                    break;
                }
                if (n3 < n16) {
                    n8 = n14 += -1;
                    continue;
                }
                n10 = ++n14;
            }
        }
        return n7;
    }

    public final void w(Object object, long l2, D d2, st2_0 st2_02, i_0 i_02) {
        object = this.n.c(object, l2);
        d2.a((List)object, st2_02, i_02);
    }

    public final void x(Object object, int n3, D d2, st2_0 st2_02, i_0 i_02) {
        long l2 = n3 & 0xFFFFF;
        object = this.n.c(object, l2);
        d2.b((List)object, st2_02, i_02);
    }

    public final void y(Object object, int n3, D d2) {
        int n4 = 0x20000000 & n3;
        n4 = n4 != 0 ? 1 : 0;
        int n7 = 1048575;
        if (n4 != 0) {
            long l2 = n3 &= n7;
            String string2 = d2.readStringRequireUtf8();
            nw3.r(object, l2, string2);
        } else {
            n4 = (int)(this.g ? 1 : 0);
            if (n4 != 0) {
                long l3 = n3 &= n7;
                String string3 = d2.readString();
                nw3.r(object, l3, string3);
            } else {
                long l4 = n3 &= n7;
                DF dF = d2.readBytes();
                nw3.r(object, l4, dF);
            }
        }
    }

    public final void z(Object object, int n3, D d2) {
        int n4 = 0x20000000 & n3;
        n4 = n4 != 0 ? 1 : 0;
        int n7 = 1048575;
        s s7 = this.n;
        if (n4 != 0) {
            long l2 = n3 &= n7;
            object = s7.c(object, l2);
            d2.readStringListRequireUtf8((List)object);
        } else {
            long l3 = n3 &= n7;
            object = s7.c(object, l3);
            d2.readStringList((List)object);
        }
    }
}

