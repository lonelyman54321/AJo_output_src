/*
 * Decompiled with CFR 0.152.
 */
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

public final class aa2$a {
    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public static void a(long l2, ce_2 ce_22, int n3, ArrayList arrayList, int n4, int n7, ArrayList arrayList2) {
        long l3;
        long l4;
        int n8;
        int n10;
        int n14;
        int n15;
        Object object = ce_22;
        int n16 = n3;
        ArrayList arrayList3 = arrayList;
        int n17 = n4;
        int n18 = n7;
        ArrayList arrayList4 = arrayList2;
        Object object2 = "Failed requirement.";
        if (n4 >= n7) {
            String string2 = object2.toString();
            object = new IllegalArgumentException(string2);
            throw object;
        }
        for (n15 = n4; n15 < n18; ++n15) {
            ff_2 ff_22 = (ff_2)arrayList3.get(n15);
            n14 = ff_22.d();
            if (n14 >= n16) continue;
            String string3 = object2.toString();
            object = new IllegalArgumentException(string3);
            throw object;
        }
        object2 = (ff_2)arrayList.get(n4);
        n15 = n18 + -1;
        ff_2 ff_23 = (ff_2)arrayList3.get(n15);
        n14 = ((ff_2)object2).d();
        int n19 = -1;
        if (n16 == n14) {
            n10 = ((Number)arrayList4.get(n17)).intValue();
            ff_2 ff_24 = (ff_2)arrayList3.get(++n17);
            n8 = n17;
            n17 = n10;
            object2 = ff_24;
        } else {
            n8 = n17;
            n17 = -1;
        }
        n14 = ((ff_2)object2).i(n16);
        int n20 = ff_23.i(n16);
        int n21 = 4;
        int n22 = 2;
        if (n14 != n20) {
            n15 = 1;
            for (n10 = n8 + 1; n10 < n18; ++n10) {
                ff_2 ff_25;
                n14 = n10 + -1;
                ff_2 ff_26 = (ff_2)arrayList3.get(n14);
                if ((n14 = (int)ff_26.i(n16)) == (n20 = (int)(ff_25 = (ff_2)arrayList3.get(n10)).i(n16))) continue;
                ++n15;
            }
            l4 = ((ce_2)object).b;
            long l7 = n21;
            l4 = l4 / l7 + l2;
            l3 = l7;
            l7 = n22;
            l4 += l7;
            n10 = n15 * 2;
            l7 = n10;
            l4 += l7;
            ((ce_2)object).v0(n15);
            ((ce_2)object).v0(n17);
            for (n17 = n8; n17 < n18; ++n17) {
                object2 = (ff_2)arrayList3.get(n17);
                n10 = ((ff_2)object2).i(n16);
                if (n17 != n8) {
                    n15 = n17 + -1;
                    ff_23 = (ff_2)arrayList3.get(n15);
                    if (n10 == (n15 = (int)ff_23.i(n16))) continue;
                }
                ((ce_2)object).v0(n10 &= 0xFF);
            }
        } else {
            byte by2;
            byte by4;
            n14 = ((ff_2)object2).d();
            n20 = ff_23.d();
            n14 = Math.min(n14, n20);
            n20 = 0;
            Object var26_35 = null;
            for (n19 = n16; n19 < n14 && (by4 = ((ff_2)object2).i(n19)) == (by2 = ff_23.i(n19)); ++n20, ++n19) {
            }
            long l8 = ((ce_2)object).b;
            long l12 = n21;
            l8 = l8 / l12 + l2;
            long l14 = n22;
            l8 += l14;
            l14 = n20;
            l8 += l14;
            l14 = 1L;
            l8 += l14;
            n21 = -n20;
            ((ce_2)object).v0(n21);
            ((ce_2)object).v0(n17);
            n20 += n16;
            while (n16 < n20) {
                n17 = ((ff_2)object2).i(n16) & 0xFF;
                ((ce_2)object).v0(n17);
                ++n16;
            }
            n16 = n8 + 1;
            if (n16 != n18) {
                ce_2 ce_23 = new ce_2();
                n17 = (int)(ce_23.b / l12 + l8);
                n16 = -1;
                ((ce_2)object).v0(n17 *= -1);
                object2 = ce_23;
                n15 = n20;
                ArrayList arrayList5 = arrayList;
                n20 = n7;
                aa2$a.a(l8, ce_23, n15, arrayList, n8, n7, arrayList2);
                ((ce_2)object).s(ce_23);
                return;
            }
            Object object3 = (ff_2)arrayList3.get(n8);
            n16 = ((ff_2)object3).d();
            if (n20 == n16) {
                object3 = (Number)arrayList4.get(n8);
                n16 = ((Number)object3).intValue();
                ((ce_2)object).v0(n16);
                return;
            }
            object3 = "Check failed.".toString();
            object = new IllegalStateException((String)object3);
            throw object;
        }
        ce_2 ce_24 = new ce_2();
        n20 = n8;
        while (true) {
            int n24;
            Serializable serializable;
            void var36_47;
            void var33_40;
            block18: {
                if (n20 >= n18) {
                    var36_47 = var33_40;
                    ((ce_2)object).s((a93_0)var33_40);
                    return;
                }
                serializable = (ff_2)arrayList3.get(n20);
                n17 = ((ff_2)serializable).i(n16);
                for (n15 = n10 = n20 + 1; n15 < n18; ++n15) {
                    ff_2 ff_27 = (ff_2)arrayList3.get(n15);
                    n14 = ff_27.i(n16);
                    if (n17 == n14) continue;
                    n21 = n15;
                    break block18;
                }
                n21 = n18;
            }
            if (n10 == n21 && (n17 = n16 + 1) == (n10 = ((ff_2)(object2 = (ff_2)arrayList3.get(n20))).d())) {
                serializable = (Number)arrayList4.get(n20);
                n17 = ((Number)serializable).intValue();
                ((ce_2)object).v0(n17);
                n24 = n21;
                var36_47 = var33_40;
            } else {
                n10 = (int)(var33_40.b / l3 + l4) * -1;
                ((ce_2)object).v0(n10);
                n14 = n16 + 1;
                ff_23 = var33_40;
                n24 = n21;
                var36_47 = var33_40;
                ArrayList arrayList6 = arrayList2;
                aa2$a.a(l4, (ce_2)((Object)ff_23), n14, arrayList, n20, n21, arrayList2);
            }
            void var33_43 = var36_47;
            n20 = n24;
            n19 = -1;
        }
    }

    public static aa2_2 b(ff_2 ... object) {
        int n3;
        Object object2;
        int n4;
        Object object3 = "byteStrings";
        Intrinsics.checkNotNullParameter(object, (String)object3);
        int n7 = ((ff_2[])object).length;
        int n8 = -1;
        int n10 = 0;
        if (n7 == 0) {
            object3 = new ff_2[]{};
            int[] nArray = new int[]{0, n8};
            object = new aa2_2((ff_2[])object3, nArray);
            return object;
        }
        ArrayList arrayList = tp_2.N((Object[])object);
        bx_2.p(arrayList);
        int n14 = ((ff_2[])object).length;
        object3 = new ArrayList(n14);
        n14 = ((ff_2[])object).length;
        ff_2 ff_22 = null;
        for (n4 = 0; n4 < n14; ++n4) {
            object2 = object[n4];
            object2 = n8;
            ((ArrayList)object3).add(object2);
        }
        Object object4 = new Integer[]{};
        object3 = ((ArrayList)object3).toArray((T[])object4);
        n8 = ((ff_2[])object3).length;
        object3 = Arrays.copyOf(object3, n8);
        ArrayList arrayList2 = xx_2.j((Object[])object3);
        n7 = ((ff_2[])object).length;
        object4 = null;
        n14 = 0;
        Integer n15 = null;
        for (n8 = 0; n8 < n7; ++n8) {
            ff_22 = object[n8];
            n3 = n14 + 1;
            n4 = xx_2.e(arrayList, ff_22);
            n15 = n14;
            arrayList2.set(n4, n15);
            n14 = n3;
        }
        object3 = (ff_2)arrayList.get(0);
        n7 = ((ff_2)object3).d();
        if (n7 > 0) {
            int n16;
            int n17;
            Object object5;
            n7 = 0;
            object3 = null;
            while (n7 < (n8 = arrayList.size())) {
                object4 = (ff_2)arrayList.get(n7);
                n4 = n14 = n7 + 1;
                while (n4 < (n3 = arrayList.size())) {
                    object2 = (ff_2)arrayList.get(n4);
                    object2.getClass();
                    object5 = "prefix";
                    Intrinsics.checkNotNullParameter(object4, (String)object5);
                    n17 = ((ff_2)object4).d();
                    n17 = (int)(((ff_2)object2).l(0, (ff_2)object4, n17) ? 1 : 0);
                    if (n17 == 0) break;
                    n17 = ((ff_2)object2).d();
                    if (n17 != (n16 = ((ff_2)object4).d())) {
                        object2 = (Number)arrayList2.get(n4);
                        n3 = ((Number)object2).intValue();
                        if (n3 > (n17 = ((Number)(object5 = (Number)arrayList2.get(n7))).intValue())) {
                            arrayList.remove(n4);
                            arrayList2.remove(n4);
                            continue;
                        }
                        ++n4;
                        continue;
                    }
                    object = new StringBuilder("duplicate option: ");
                    ((StringBuilder)object).append(object2);
                    object = ((StringBuilder)object).toString();
                    object = object.toString();
                    object3 = new IllegalArgumentException((String)object);
                    throw object3;
                }
                n7 = n14;
            }
            object3 = new ce_2();
            int n18 = arrayList.size();
            n17 = 0;
            object5 = null;
            n16 = 0;
            object2 = object3;
            aa2$a.a(0L, (ce_2)object3, 0, arrayList, 0, n18, arrayList2);
            long l2 = ((ce_2)object3).b;
            long l3 = 4;
            n8 = (int)(l2 /= l3);
            object4 = new int[n8];
            while ((n14 = (int)(((ce_2)object3).g() ? 1 : 0)) == 0) {
                n14 = n10 + 1;
                n4 = ((ce_2)object3).readInt();
                object4[n10] = n4;
                n10 = n14;
            }
            n10 = ((ff_2[])object).length;
            object = Arrays.copyOf(object, n10);
            Intrinsics.checkNotNullExpressionValue(object, "copyOf(this, size)");
            object = (ff_2[])object;
            object3 = new aa2_2((ff_2[])object, (int[])object4);
            return object3;
        }
        object3 = "the empty byte string is not a supported option".toString();
        object = new IllegalArgumentException((String)object3);
        throw object;
    }
}

