/*
 * Decompiled with CFR 0.152.
 */
import androidx.media3.common.d;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList$Builder;
import com.google.common.collect.MultimapBuilder;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Arrays;

public final class j4$b
implements DF0$b {
    public final DF0[] a(DF0$a[] dF0$aArray, iv_0 iv_02) {
        int n3;
        d d2;
        int n4;
        int n7;
        double d5;
        long l2;
        Object object;
        Object object2;
        int n8;
        int n10;
        Object object3;
        Object object4;
        Object object5;
        long l3;
        Object object6;
        Object object7;
        double d7;
        long l4;
        int n14;
        int n15;
        DF0$a[] dF0$aArray2 = dF0$aArray;
        AbstractCollection abstractCollection = new ArrayList();
        int n16 = 0;
        Object object8 = null;
        int n17 = 0;
        Integer n18 = null;
        while (true) {
            n15 = dF0$aArray2.length;
            n14 = 1;
            l4 = 0L;
            d7 = 0.0;
            if (n17 >= n15) break;
            object7 = dF0$aArray2[n17];
            if (object7 != null && (n15 = ((Object)(object7 = (Object)((DF0$a)object7).b)).length) > n14) {
                object7 = ImmutableList.builder();
                object6 = new j4$a(l4, l4);
                ((ImmutableList$Builder)object7).add(object6);
                ((ArrayList)abstractCollection).add(object7);
            } else {
                n15 = 0;
                object7 = null;
                ((ArrayList)abstractCollection).add(null);
            }
            ++n17;
        }
        n17 = dF0$aArray2.length;
        object7 = new long[n17][];
        int n19 = 0;
        int[] nArray = null;
        while (true) {
            int n20 = dF0$aArray2.length;
            l3 = -1;
            if (n19 >= n20) break;
            object5 = dF0$aArray2[n19];
            if (object5 == null) {
                object7[n19] = object5 = (Object)new long[0];
            } else {
                object4 = ((DF0$a)object5).b;
                object3 = new long[((int[])object4).length];
                object7[n19] = object3;
                object3 = null;
                for (n10 = 0; n10 < (n8 = ((int[])object4).length); ++n10) {
                    n8 = object4[n10];
                    object2 = ((DF0$a)object5).a.d;
                    object = object2[n8];
                    n8 = ((d)object).j;
                    l2 = n8;
                    Object object9 = object7[n19];
                    Object object10 = l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
                    if (object10 == false) {
                        l2 = l4;
                        d5 = d7;
                    }
                    object9[n10] = l2;
                }
                object5 = object7[n19];
                Arrays.sort((long[])object5);
            }
            ++n19;
        }
        nArray = new int[n17];
        object5 = new long[n17];
        object4 = null;
        for (n7 = 0; n7 < n17; ++n7) {
            object3 = object7[n7];
            n8 = ((long[])object3).length;
            if (n8 == 0) {
                l2 = l4;
                d5 = d7;
            } else {
                l2 = object3[0];
            }
            object5[n7] = l2;
        }
        j4.m(abstractCollection, (long[])object5);
        Object object11 = MultimapBuilder.treeKeys().arrayListValues().build();
        Object object12 = null;
        for (n4 = 0; n4 < n17; ++n4) {
            int n21;
            object4 = object7[n4];
            n10 = ((int[])object4).length;
            if (n10 <= n14) {
                n21 = n17;
            } else {
                long l7;
                Object object13;
                double d9;
                n7 = ((int[])object4).length;
                object3 = new double[n7];
                n8 = 0;
                object = null;
                while (true) {
                    object2 = object7[n4];
                    n14 = ((d[])object2).length;
                    d9 = 0.0;
                    if (n8 >= n14) break;
                    n21 = n17;
                    d2 = object2[n8];
                    d d12 = d2 - l3;
                    object13 = d12 == 0 ? 0 : (d12 < 0 ? -1 : 1);
                    if (object13 != false) {
                        l7 = (long)((double)d2);
                        d9 = Math.log(l7);
                    }
                    object3[n8] = (long)d9;
                    ++n8;
                    n17 = n21;
                    n16 = 0;
                    object8 = null;
                    n14 = 1;
                }
                n21 = n17;
                l7 = object3[n7 += -1];
                n14 = 0;
                object6 = null;
                d5 = object3[0];
                l7 -= d5;
                n8 = 0;
                object = null;
                while (n8 < n7) {
                    long l8 = object3[n8];
                    long l12 = object3[++n8];
                    l8 += l12;
                    l12 = (long)0.5;
                    l8 *= l12;
                    object13 = l7 == d9 ? 0 : (l7 > d9 ? 1 : -1);
                    if (object13 == false) {
                        l8 = (long)1.0;
                        n14 = 0;
                        object6 = null;
                    } else {
                        n14 = 0;
                        object6 = null;
                        l12 = object3[0];
                        l8 = (l8 - l12) / l7;
                    }
                    object2 = (double)l8;
                    object6 = n4;
                    object11.put(object2, object6);
                }
            }
            n17 = n21;
            n16 = 0;
            object8 = null;
            n14 = 1;
        }
        object8 = ImmutableList.copyOf(object11.values());
        object6 = null;
        for (n14 = 0; n14 < (n17 = object8.size()); ++n14) {
            Object object14;
            n18 = (Integer)object8.get(n14);
            n17 = n18;
            n3 = nArray[n17];
            n4 = 1;
            nArray[n17] = n3 += n4;
            Object object15 = object7[n17];
            object5[n17] = object14 = object15[n3];
            j4.m(abstractCollection, (long[])object5);
        }
        object6 = null;
        for (n14 = 0; n14 < (n16 = dF0$aArray2.length); ++n14) {
            object8 = ((ArrayList)abstractCollection).get(n14);
            if (object8 == null) continue;
            d2 = object5[n14];
            l4 = 2;
            d7 = 9.9E-324;
            object5[n14] = d2 *= l4;
        }
        j4.m(abstractCollection, (long[])object5);
        object8 = ImmutableList.builder();
        n18 = null;
        for (n17 = 0; n17 < (n15 = ((ArrayList)abstractCollection).size()); ++n17) {
            object7 = (ImmutableList$Builder)((ArrayList)abstractCollection).get(n17);
            object7 = object7 == null ? ImmutableList.of() : ((ImmutableList$Builder)object7).build();
            object8.add(object7);
        }
        abstractCollection = object8.build();
        n16 = dF0$aArray2.length;
        object8 = new DF0[n16];
        n17 = 0;
        n18 = null;
        object7 = null;
        for (n15 = 0; n15 < (n14 = dF0$aArray2.length); ++n15) {
            object6 = dF0$aArray2[n15];
            if (object6 == null || (n3 = (nArray = ((DF0$a)object6).b).length) == 0) continue;
            n3 = nArray.length;
            n4 = 1;
            if (n3 == n4) {
                n4 = nArray[0];
                object6 = ((DF0$a)object6).a;
                object12 = new int[]{n4};
                object11 = new kw_0((qp3)object6, (int[])object12);
            } else {
                object11 = abstractCollection.get(n15);
                object = object11;
                object = (ImmutableList)object11;
                l3 = 10000;
                n3 = 25000;
                long l14 = n3;
                object12 = ((DF0$a)object6).a;
                object11 = object2;
                object5 = iv_02;
                object2 = new j4((qp3)object12, nArray, iv_02, l3, l14, (ImmutableList)object);
            }
            object8[n15] = object11;
        }
        return object8;
    }
}

