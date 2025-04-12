/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.material.color.utilities;

import com.google.android.material.color.utilities.ColorUtils;
import com.google.android.material.color.utilities.Quantizer;
import com.google.android.material.color.utilities.QuantizerMap;
import com.google.android.material.color.utilities.QuantizerResult;
import com.google.android.material.color.utilities.QuantizerWu$1;
import com.google.android.material.color.utilities.QuantizerWu$Box;
import com.google.android.material.color.utilities.QuantizerWu$CreateBoxesResult;
import com.google.android.material.color.utilities.QuantizerWu$Direction;
import com.google.android.material.color.utilities.QuantizerWu$MaximizeResult;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public final class QuantizerWu
implements Quantizer {
    private static final int INDEX_BITS = 5;
    private static final int INDEX_COUNT = 33;
    private static final int TOTAL_SIZE = 35937;
    QuantizerWu$Box[] cubes;
    double[] moments;
    int[] momentsB;
    int[] momentsG;
    int[] momentsR;
    int[] weights;

    /*
     * WARNING - void declaration
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static int bottom(QuantizerWu$Box object, QuantizerWu$Direction object2, int[] object3) {
        void var8_53;
        void var6_36;
        StringBuilder stringBuilder;
        int[] nArray = QuantizerWu$1.$SwitchMap$com$google$android$material$color$utilities$QuantizerWu$Direction;
        int n3 = ((Enum)object2).ordinal();
        int n4 = nArray[n3];
        if (n4 != (n3 = 1)) {
            n3 = 2;
            if (n4 != n3) {
                n3 = 3;
                if (n4 == n3) {
                    int n7 = ((QuantizerWu$Box)object).r1;
                    int n8 = ((QuantizerWu$Box)object).g1;
                    n3 = ((QuantizerWu$Box)object).b0;
                    int n10 = QuantizerWu.getIndex(n7, n8, n3);
                    StringBuilder stringBuilder2 = -stringBuilder[n10];
                    int n14 = ((QuantizerWu$Box)object).r1;
                    n3 = ((QuantizerWu$Box)object).g0;
                    int n15 = ((QuantizerWu$Box)object).b0;
                    int n16 = QuantizerWu.getIndex(n14, n3, n15);
                    StringBuilder stringBuilder3 = stringBuilder[n16];
                    reference var6_34 = stringBuilder2 + stringBuilder3;
                    int n17 = ((QuantizerWu$Box)object).r0;
                    n3 = ((QuantizerWu$Box)object).g1;
                    n15 = ((QuantizerWu$Box)object).b0;
                    int n18 = QuantizerWu.getIndex(n17, n3, n15);
                    StringBuilder stringBuilder4 = stringBuilder[n18];
                    reference var6_35 = var6_34 + stringBuilder4;
                    int n19 = ((QuantizerWu$Box)object).r0;
                    n3 = ((QuantizerWu$Box)object).g0;
                    int n21 = ((QuantizerWu$Box)object).b0;
                    n21 = QuantizerWu.getIndex(n19, n3, n21);
                    StringBuilder stringBuilder5 = stringBuilder[n21];
                    return (int)(var6_36 - var8_53);
                }
                stringBuilder = new StringBuilder("unexpected direction ");
                stringBuilder.append(object2);
                String string2 = stringBuilder.toString();
                object = new IllegalArgumentException(string2);
                throw object;
            }
            int n22 = ((QuantizerWu$Box)object).r1;
            int n24 = ((QuantizerWu$Box)object).g0;
            n3 = ((QuantizerWu$Box)object).b1;
            int n25 = QuantizerWu.getIndex(n22, n24, n3);
            StringBuilder stringBuilder6 = -stringBuilder[n25];
            int n26 = ((QuantizerWu$Box)object).r1;
            n3 = ((QuantizerWu$Box)object).g0;
            int n27 = ((QuantizerWu$Box)object).b0;
            int n28 = QuantizerWu.getIndex(n26, n3, n27);
            StringBuilder stringBuilder7 = stringBuilder[n28];
            reference var6_40 = stringBuilder6 + stringBuilder7;
            int n29 = ((QuantizerWu$Box)object).r0;
            n3 = ((QuantizerWu$Box)object).g0;
            n27 = ((QuantizerWu$Box)object).b1;
            int n30 = QuantizerWu.getIndex(n29, n3, n27);
            StringBuilder stringBuilder8 = stringBuilder[n30];
            reference var6_41 = var6_40 + stringBuilder8;
            int n32 = ((QuantizerWu$Box)object).r0;
            n3 = ((QuantizerWu$Box)object).g0;
            int n35 = ((QuantizerWu$Box)object).b0;
            n35 = QuantizerWu.getIndex(n32, n3, n35);
            StringBuilder stringBuilder9 = stringBuilder[n35];
            return (int)(var6_36 - var8_53);
        }
        int n36 = ((QuantizerWu$Box)object).r0;
        int n37 = ((QuantizerWu$Box)object).g1;
        n3 = ((QuantizerWu$Box)object).b1;
        int n38 = QuantizerWu.getIndex(n36, n37, n3);
        StringBuilder stringBuilder10 = -stringBuilder[n38];
        int n39 = ((QuantizerWu$Box)object).r0;
        n3 = ((QuantizerWu$Box)object).g1;
        int n41 = ((QuantizerWu$Box)object).b0;
        int n42 = QuantizerWu.getIndex(n39, n3, n41);
        StringBuilder stringBuilder11 = stringBuilder[n42];
        reference var6_45 = stringBuilder10 + stringBuilder11;
        int n43 = ((QuantizerWu$Box)object).r0;
        n3 = ((QuantizerWu$Box)object).g0;
        n41 = ((QuantizerWu$Box)object).b1;
        int n44 = QuantizerWu.getIndex(n43, n3, n41);
        StringBuilder stringBuilder12 = stringBuilder[n44];
        reference var6_46 = var6_45 + stringBuilder12;
        int n45 = ((QuantizerWu$Box)object).r0;
        n3 = ((QuantizerWu$Box)object).g0;
        int n47 = ((QuantizerWu$Box)object).b0;
        n47 = QuantizerWu.getIndex(n45, n3, n47);
        StringBuilder stringBuilder13 = stringBuilder[n47];
        return (int)(var6_36 - var8_53);
    }

    public static int getIndex(int n3, int n4, int n7) {
        int n8 = n3 << 10;
        int n10 = n3 << 6;
        n8 = n8 + n10 + n3;
        n3 = n4 << 5;
        return n8 + n3 + n4 + n7;
    }

    /*
     * WARNING - void declaration
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static int top(QuantizerWu$Box object, QuantizerWu$Direction object2, int n3, int[] nArray) {
        int n4;
        void var3_4;
        void var2_3;
        int n7;
        int[] nArray2 = QuantizerWu$1.$SwitchMap$com$google$android$material$color$utilities$QuantizerWu$Direction;
        int n8 = ((Enum)object2).ordinal();
        int n10 = nArray2[n8];
        if (n10 != (n8 = 1)) {
            n8 = 2;
            if (n10 != n8) {
                n8 = 3;
                if (n10 == n8) {
                    n7 = ((QuantizerWu$Box)object).r1;
                    n10 = ((QuantizerWu$Box)object).g1;
                    n7 = QuantizerWu.getIndex(n7, n10, (int)var2_3);
                    n7 = var3_4[n7];
                    n10 = ((QuantizerWu$Box)object).r1;
                    n8 = ((QuantizerWu$Box)object).g0;
                    n10 = QuantizerWu.getIndex(n10, n8, (int)var2_3);
                    n10 = var3_4[n10];
                    n7 -= n10;
                    n10 = ((QuantizerWu$Box)object).r0;
                    n8 = ((QuantizerWu$Box)object).g1;
                    n10 = QuantizerWu.getIndex(n10, n8, (int)var2_3);
                    n10 = var3_4[n10];
                    n7 -= n10;
                    n10 = ((QuantizerWu$Box)object).r0;
                    n4 = ((QuantizerWu$Box)object).g0;
                    n4 = QuantizerWu.getIndex(n10, n4, (int)var2_3);
                    n4 = var3_4[n4];
                    return n7 + n4;
                }
                StringBuilder stringBuilder = new StringBuilder("unexpected direction ");
                stringBuilder.append(object2);
                String string2 = stringBuilder.toString();
                object = new IllegalArgumentException(string2);
                throw object;
            }
            n7 = ((QuantizerWu$Box)object).r1;
            n10 = ((QuantizerWu$Box)object).b1;
            n7 = QuantizerWu.getIndex(n7, (int)var2_3, n10);
            n7 = var3_4[n7];
            n10 = ((QuantizerWu$Box)object).r1;
            n8 = ((QuantizerWu$Box)object).b0;
            n10 = QuantizerWu.getIndex(n10, (int)var2_3, n8);
            n10 = var3_4[n10];
            n7 -= n10;
            n10 = ((QuantizerWu$Box)object).r0;
            n8 = ((QuantizerWu$Box)object).b1;
            n10 = QuantizerWu.getIndex(n10, (int)var2_3, n8);
            n10 = var3_4[n10];
            n7 -= n10;
            n10 = ((QuantizerWu$Box)object).r0;
            n4 = ((QuantizerWu$Box)object).b0;
            n4 = QuantizerWu.getIndex(n10, (int)var2_3, n4);
            n4 = var3_4[n4];
            return n7 + n4;
        }
        n7 = ((QuantizerWu$Box)object).g1;
        n10 = ((QuantizerWu$Box)object).b1;
        n7 = QuantizerWu.getIndex((int)var2_3, n7, n10);
        n7 = var3_4[n7];
        n10 = ((QuantizerWu$Box)object).g1;
        n8 = ((QuantizerWu$Box)object).b0;
        n10 = QuantizerWu.getIndex((int)var2_3, n10, n8);
        n10 = var3_4[n10];
        n7 -= n10;
        n10 = ((QuantizerWu$Box)object).g0;
        n8 = ((QuantizerWu$Box)object).b1;
        n10 = QuantizerWu.getIndex((int)var2_3, n10, n8);
        n10 = var3_4[n10];
        n7 -= n10;
        n10 = ((QuantizerWu$Box)object).g0;
        n4 = ((QuantizerWu$Box)object).b0;
        n4 = QuantizerWu.getIndex((int)var2_3, n10, n4);
        n4 = var3_4[n4];
        return n7 + n4;
    }

    public static int volume(QuantizerWu$Box quantizerWu$Box, int[] nArray) {
        int n3 = quantizerWu$Box.r1;
        int n4 = quantizerWu$Box.g1;
        int n7 = quantizerWu$Box.b1;
        n3 = QuantizerWu.getIndex(n3, n4, n7);
        n3 = nArray[n3];
        n4 = quantizerWu$Box.r1;
        n7 = quantizerWu$Box.g1;
        int n8 = quantizerWu$Box.b0;
        n4 = QuantizerWu.getIndex(n4, n7, n8);
        n4 = nArray[n4];
        n3 -= n4;
        n4 = quantizerWu$Box.r1;
        n7 = quantizerWu$Box.g0;
        n8 = quantizerWu$Box.b1;
        n4 = QuantizerWu.getIndex(n4, n7, n8);
        n4 = nArray[n4];
        n3 -= n4;
        n4 = quantizerWu$Box.r1;
        n7 = quantizerWu$Box.g0;
        n8 = quantizerWu$Box.b0;
        n4 = QuantizerWu.getIndex(n4, n7, n8);
        n4 = nArray[n4];
        n3 += n4;
        n4 = quantizerWu$Box.r0;
        n7 = quantizerWu$Box.g1;
        n8 = quantizerWu$Box.b1;
        n4 = QuantizerWu.getIndex(n4, n7, n8);
        n4 = nArray[n4];
        n3 -= n4;
        n4 = quantizerWu$Box.r0;
        n7 = quantizerWu$Box.g1;
        n8 = quantizerWu$Box.b0;
        n4 = QuantizerWu.getIndex(n4, n7, n8);
        n4 = nArray[n4];
        n3 += n4;
        n4 = quantizerWu$Box.r0;
        n7 = quantizerWu$Box.g0;
        n8 = quantizerWu$Box.b1;
        n4 = QuantizerWu.getIndex(n4, n7, n8);
        n4 = nArray[n4];
        n3 += n4;
        n4 = quantizerWu$Box.r0;
        n7 = quantizerWu$Box.g0;
        int n10 = quantizerWu$Box.b0;
        n10 = QuantizerWu.getIndex(n4, n7, n10);
        n10 = nArray[n10];
        return n3 - n10;
    }

    public void constructHistogram(Map object) {
        int n3 = 35937;
        Object object2 = new int[n3];
        this.weights = object2;
        object2 = new int[n3];
        this.momentsR = object2;
        object2 = new int[n3];
        this.momentsG = object2;
        object2 = new int[n3];
        this.momentsB = object2;
        Object object3 = new double[n3];
        this.moments = object3;
        object = object.entrySet().iterator();
        while ((n3 = (int)(object.hasNext() ? 1 : 0)) != 0) {
            int n4;
            object3 = (Map.Entry)object.next();
            object2 = (Integer)object3.getKey();
            int n7 = (Integer)object2;
            object3 = (Integer)object3.getValue();
            n3 = (Integer)object3;
            int n8 = ColorUtils.redFromArgb(n7);
            int n10 = ColorUtils.greenFromArgb(n7);
            n7 = ColorUtils.blueFromArgb(n7);
            int n14 = (n8 >> 3) + 1;
            int n15 = (n10 >> 3) + 1;
            int n16 = (n7 >> 3) + 1;
            n14 = QuantizerWu.getIndex(n14, n15, n16);
            Object[] objectArray = this.weights;
            objectArray[n14] = n16 = objectArray[n14] + n3;
            objectArray = this.momentsR;
            n16 = objectArray[n14];
            objectArray[n14] = n4 = n8 * n3 + n16;
            objectArray = this.momentsG;
            n16 = objectArray[n14];
            objectArray[n14] = n4 = n10 * n3 + n16;
            objectArray = this.momentsB;
            n16 = objectArray[n14];
            objectArray[n14] = n4 = n7 * n3 + n16;
            objectArray = this.moments;
            int n17 = objectArray[n14];
            n8 *= n8;
            n10 = n10 * n10 + n8;
            n7 = (n7 * n7 + n10) * n3;
            double d2 = n7;
            objectArray[n14] = n17 += d2;
        }
    }

    public QuantizerWu$CreateBoxesResult createBoxes(int n3) {
        int n4;
        Object object;
        block6: {
            QuantizerWu$Box quantizerWu$Box;
            int n7;
            Object object2;
            object = new QuantizerWu$Box[n3];
            this.cubes = object;
            object = null;
            double[] dArray = null;
            for (int i3 = 0; i3 < n3; ++i3) {
                QuantizerWu$Box quantizerWu$Box2;
                object2 = this.cubes;
                n7 = 0;
                quantizerWu$Box = null;
                object2[i3] = quantizerWu$Box2 = new QuantizerWu$Box(null);
            }
            dArray = new double[n3];
            object2 = this.cubes[0];
            object2.r1 = n4 = 32;
            object2.g1 = n4;
            object2.b1 = n4;
            int n8 = 1;
            n7 = 0;
            quantizerWu$Box = null;
            for (n4 = 1; n4 < n3; ++n4) {
                int n10;
                double d2;
                int n14;
                Object object3 = this.cubes;
                QuantizerWu$Box quantizerWu$Box3 = object3[n7];
                object3 = object3[n4];
                object3 = this.cut(quantizerWu$Box3, (QuantizerWu$Box)object3);
                int n15 = ((Boolean)object3).booleanValue();
                double d5 = 0.0;
                if (n15 != 0) {
                    object3 = this.cubes[n7];
                    n14 = ((QuantizerWu$Box)object3).vol;
                    double d7 = n14 > n8 ? this.variance((QuantizerWu$Box)object3) : d5;
                    dArray[n7] = d7;
                    quantizerWu$Box = this.cubes[n4];
                    n15 = quantizerWu$Box.vol;
                    d2 = n15 > n8 ? this.variance(quantizerWu$Box) : d5;
                    dArray[n4] = d2;
                } else {
                    dArray[n7] = d5;
                    n4 += -1;
                }
                d2 = dArray[0];
                n14 = 0;
                for (n10 = 1; n10 <= n4; ++n10) {
                    double d9 = dArray[n10];
                    double d7 = d9 - d2;
                    Object object4 = d7 == 0.0 ? 0 : (d7 > 0.0 ? 1 : -1);
                    if (object4 <= 0) continue;
                    n14 = n10;
                    d2 = d9;
                }
                n10 = (int)(d2 == d5 ? 0 : (d2 < d5 ? -1 : 1));
                if (n10 <= 0) {
                    n4 += n8;
                    break block6;
                }
                n7 = n14;
            }
            n4 = n3;
        }
        object = new QuantizerWu$CreateBoxesResult(n3, n4);
        return object;
    }

    public void createMoments() {
        int n3;
        QuantizerWu quantizerWu = this;
        for (int i3 = 1; i3 < (n3 = 33); ++i3) {
            int[] nArray = new int[n3];
            int[] nArray2 = new int[n3];
            int[] nArray3 = new int[n3];
            int[] nArray4 = new int[n3];
            double[] dArray = new double[n3];
            for (int i8 = 1; i8 < n3; ++i8) {
                double d2;
                int n4 = 0;
                Object[] objectArray = null;
                double d5 = d2 = 0.0;
                int n7 = 0;
                int n8 = 0;
                int n10 = 0;
                for (int i10 = 1; i10 < n3; ++i10) {
                    int n14 = QuantizerWu.getIndex(i3, i8, i10);
                    n3 = quantizerWu.weights[n14];
                    n4 += n3;
                    n3 = quantizerWu.momentsR[n14];
                    n7 += n3;
                    n3 = quantizerWu.momentsG[n14];
                    n8 += n3;
                    n3 = quantizerWu.momentsB[n14];
                    n10 += n3;
                    double[] dArray2 = quantizerWu.moments;
                    double d7 = dArray2[n14];
                    d5 += d7;
                    nArray[i10] = n3 = nArray[i10] + n4;
                    nArray2[i10] = n3 = nArray2[i10] + n7;
                    nArray3[i10] = n3 = nArray3[i10] + n8;
                    nArray4[i10] = n3 = nArray4[i10] + n10;
                    dArray[i10] = d7 = dArray[i10] + d5;
                    n3 = QuantizerWu.getIndex(i3 + -1, i8, i10);
                    objectArray = quantizerWu.weights;
                    int n15 = objectArray[n3];
                    int n16 = nArray[i10];
                    objectArray[n14] = n15 += n16;
                    objectArray = quantizerWu.momentsR;
                    n15 = objectArray[n3];
                    n16 = nArray2[i10];
                    objectArray[n14] = n15 += n16;
                    objectArray = quantizerWu.momentsG;
                    n15 = objectArray[n3];
                    n16 = nArray3[i10];
                    objectArray[n14] = n15 += n16;
                    objectArray = quantizerWu.momentsB;
                    n15 = objectArray[n3];
                    n16 = nArray4[i10];
                    objectArray[n14] = n15 += n16;
                    objectArray = quantizerWu.moments;
                    int n17 = objectArray[n3];
                    double d9 = dArray[i10];
                    objectArray[n14] = n17 += d9;
                    n3 = 33;
                }
                n3 = 33;
            }
        }
    }

    public List createResult(int n3) {
        ArrayList<Object> arrayList = new ArrayList<Object>();
        for (int i3 = 0; i3 < n3; ++i3) {
            Object object = this.cubes[i3];
            int[] nArray = this.weights;
            int n4 = QuantizerWu.volume((QuantizerWu$Box)object, nArray);
            if (n4 <= 0) continue;
            int[] nArray2 = this.momentsR;
            int n7 = QuantizerWu.volume((QuantizerWu$Box)object, nArray2) / n4;
            int[] nArray3 = this.momentsG;
            int n8 = QuantizerWu.volume((QuantizerWu$Box)object, nArray3) / n4;
            int[] nArray4 = this.momentsB;
            int n10 = QuantizerWu.volume((QuantizerWu$Box)object, nArray4) / n4;
            n4 = (n7 & 0xFF) << 16 | 0xFF000000;
            n7 = (n8 & 0xFF) << 8;
            n10 = n10 & 0xFF | (n4 |= n7);
            object = n10;
            arrayList.add(object);
        }
        return arrayList;
    }

    public Boolean cut(QuantizerWu$Box quantizerWu$Box, QuantizerWu$Box quantizerWu$Box2) {
        Object object;
        Object object2;
        QuantizerWu$Box quantizerWu$Box3 = quantizerWu$Box;
        QuantizerWu$Box quantizerWu$Box4 = quantizerWu$Box2;
        Object object3 = this.momentsR;
        int n3 = QuantizerWu.volume(quantizerWu$Box, object3);
        object3 = this.momentsG;
        int n4 = QuantizerWu.volume(quantizerWu$Box, object3);
        object3 = this.momentsB;
        int n7 = QuantizerWu.volume(quantizerWu$Box, object3);
        object3 = this.weights;
        int n8 = QuantizerWu.volume(quantizerWu$Box, object3);
        QuantizerWu$Direction quantizerWu$Direction = QuantizerWu$Direction.RED;
        int n10 = quantizerWu$Box.r0 + 1;
        int n14 = quantizerWu$Box.r1;
        object3 = this;
        Object object4 = quantizerWu$Box;
        Object object5 = quantizerWu$Direction;
        Object object6 = 1;
        int n15 = n8;
        QuantizerWu$MaximizeResult quantizerWu$MaximizeResult = this.maximize(quantizerWu$Box, quantizerWu$Direction, n10, n14, n3, n4, n7, n8);
        QuantizerWu$Direction quantizerWu$Direction2 = QuantizerWu$Direction.GREEN;
        n10 = quantizerWu$Box.g0 + 1;
        n14 = quantizerWu$Box.g1;
        object5 = quantizerWu$Direction2;
        QuantizerWu$MaximizeResult quantizerWu$MaximizeResult2 = quantizerWu$MaximizeResult;
        quantizerWu$MaximizeResult = this.maximize(quantizerWu$Box, quantizerWu$Direction2, n10, n14, n3, n4, n7, n8);
        QuantizerWu$Direction quantizerWu$Direction3 = QuantizerWu$Direction.BLUE;
        int n16 = quantizerWu$Box.b0;
        n10 = n16 + 1;
        n14 = quantizerWu$Box.b1;
        object5 = quantizerWu$Direction3;
        QuantizerWu$MaximizeResult quantizerWu$MaximizeResult3 = quantizerWu$MaximizeResult;
        object3 = this.maximize(quantizerWu$Box, quantizerWu$Direction3, n10, n14, n3, n4, n7, n8);
        object4 = quantizerWu$MaximizeResult2;
        double d2 = quantizerWu$MaximizeResult2.maximum;
        double d5 = quantizerWu$MaximizeResult.maximum;
        double d7 = object3.maximum;
        n15 = (int)(d2 == d5 ? 0 : (d2 > d5 ? 1 : -1));
        if (n15 >= 0 && (n15 = (int)(d2 == d7 ? 0 : (d2 > d7 ? 1 : -1))) >= 0) {
            object2 = quantizerWu$MaximizeResult2.cutLocation;
            if (object2 < 0) {
                return Boolean.FALSE;
            }
        } else {
            n15 = (int)(d5 == d2 ? 0 : (d5 > d2 ? 1 : -1));
            quantizerWu$Direction = n15 >= 0 && (object2 = (Object)(d5 == d7 ? 0 : (d5 > d7 ? 1 : -1))) >= 0 ? quantizerWu$Direction2 : quantizerWu$Direction3;
        }
        quantizerWu$Box4.r1 = object2 = quantizerWu$Box3.r1;
        quantizerWu$Box4.g1 = object2 = quantizerWu$Box3.g1;
        quantizerWu$Box4.b1 = object2 = quantizerWu$Box3.b1;
        object5 = QuantizerWu$1.$SwitchMap$com$google$android$material$color$utilities$QuantizerWu$Direction;
        n10 = quantizerWu$Direction.ordinal();
        object2 = (Object)object5[n10];
        if (object2 != object6) {
            object = 2;
            if (object2 != object) {
                object = 3;
                if (object2 == object) {
                    quantizerWu$Box3.b1 = n16 = object3.cutLocation;
                    quantizerWu$Box4.r0 = object = quantizerWu$Box3.r0;
                    quantizerWu$Box4.g0 = object = quantizerWu$Box3.g0;
                    quantizerWu$Box4.b0 = n16;
                }
            } else {
                quantizerWu$Box3.g1 = n16 = quantizerWu$MaximizeResult3.cutLocation;
                quantizerWu$Box4.r0 = object = quantizerWu$Box3.r0;
                quantizerWu$Box4.g0 = n16;
                quantizerWu$Box4.b0 = n16 = quantizerWu$Box3.b0;
            }
        } else {
            quantizerWu$Box3.r1 = n16 = ((QuantizerWu$MaximizeResult)object4).cutLocation;
            quantizerWu$Box4.r0 = n16;
            quantizerWu$Box4.g0 = n16 = quantizerWu$Box3.g0;
            quantizerWu$Box4.b0 = n16 = quantizerWu$Box3.b0;
        }
        n16 = quantizerWu$Box3.r1;
        object = quantizerWu$Box3.r0;
        n16 -= object;
        object = quantizerWu$Box3.g1;
        object2 = quantizerWu$Box3.g0;
        object = (object - object2) * n16;
        n16 = quantizerWu$Box3.b1;
        object2 = quantizerWu$Box3.b0;
        quantizerWu$Box3.vol = n16 = (n16 - object2) * object;
        n16 = quantizerWu$Box4.r1;
        object = quantizerWu$Box4.r0;
        n16 -= object;
        object = quantizerWu$Box4.g1;
        object2 = quantizerWu$Box4.g0;
        object = (object - object2) * n16;
        n16 = quantizerWu$Box4.b1;
        object2 = quantizerWu$Box4.b0;
        quantizerWu$Box4.vol = n16 = (n16 - object2) * object;
        return Boolean.TRUE;
    }

    public QuantizerWu$MaximizeResult maximize(QuantizerWu$Box quantizerWu$Box, QuantizerWu$Direction quantizerWu$Direction, int n3, int n4, int n7, int n8, int n10, int n14) {
        Object object = this;
        QuantizerWu$Box quantizerWu$Box2 = quantizerWu$Box;
        QuantizerWu$Direction quantizerWu$Direction2 = quantizerWu$Direction;
        int[] nArray = this.momentsR;
        int n15 = QuantizerWu.bottom(quantizerWu$Box, quantizerWu$Direction, nArray);
        int[] nArray2 = this.momentsG;
        int n16 = QuantizerWu.bottom(quantizerWu$Box, quantizerWu$Direction, nArray2);
        int[] nArray3 = this.momentsB;
        int n17 = QuantizerWu.bottom(quantizerWu$Box, quantizerWu$Direction, nArray3);
        int[] nArray4 = this.weights;
        int n18 = QuantizerWu.bottom(quantizerWu$Box, quantizerWu$Direction, nArray4);
        double d2 = 0.0;
        int n19 = n4;
        double d5 = d2;
        int n20 = -1;
        for (int i3 = n3; i3 < n19; ++i3) {
            int n21;
            int[] nArray5 = ((QuantizerWu)object).momentsR;
            int n22 = QuantizerWu.top(quantizerWu$Box2, quantizerWu$Direction2, i3, nArray5) + n15;
            int[] nArray6 = ((QuantizerWu)object).momentsG;
            int n24 = QuantizerWu.top(quantizerWu$Box2, quantizerWu$Direction2, i3, nArray6) + n16;
            int[] nArray7 = ((QuantizerWu)object).momentsB;
            int n25 = QuantizerWu.top(quantizerWu$Box2, quantizerWu$Direction2, i3, nArray7) + n17;
            int[] nArray8 = ((QuantizerWu)object).weights;
            int n26 = QuantizerWu.top(quantizerWu$Box2, quantizerWu$Direction2, i3, nArray8) + n18;
            if (n26 == 0) {
                n21 = n15;
            } else {
                n21 = n22 * n22;
                int n27 = n24 * n24 + n21;
                int n28 = n25 * n25 + n27;
                double d7 = n28;
                n21 = n15;
                double d9 = n26;
                d7 /= d9;
                int n29 = n7 - n22;
                n15 = n8 - n24;
                n22 = n10 - n25;
                n24 = n14 - n26;
                if (n24 != 0) {
                    n29 *= n29;
                    n15 = n15 * n15 + n29;
                    n22 = n22 * n22 + n15;
                    d9 = n22;
                    double d12 = n24;
                    double d13 = (d9 = d9 / d12 + d7) - d5;
                    n28 = (int)(d13 == 0.0 ? 0 : (d13 > 0.0 ? 1 : -1));
                    if (n28 > 0) {
                        d5 = d9;
                        n20 = i3;
                    }
                }
            }
            object = this;
            quantizerWu$Box2 = quantizerWu$Box;
            quantizerWu$Direction2 = quantizerWu$Direction;
            n15 = n21;
        }
        object = new QuantizerWu$MaximizeResult(n20, d5);
        return object;
    }

    public QuantizerResult quantize(int[] object, int n3) {
        boolean bl2;
        Object object2 = new QuantizerMap();
        object = ((QuantizerMap)object2).quantize((int[])object, (int)n3).colorToCount;
        this.constructHistogram((Map)object);
        this.createMoments();
        int n4 = this.createBoxes((int)n3).resultCount;
        object = this.createResult(n4);
        LinkedHashMap<Object, Integer> linkedHashMap = new LinkedHashMap<Object, Integer>();
        object = object.iterator();
        while (bl2 = object.hasNext()) {
            object2 = (Integer)object.next();
            ((Integer)object2).intValue();
            Integer n7 = 0;
            linkedHashMap.put(object2, n7);
        }
        object = new QuantizerResult(linkedHashMap);
        return object;
    }

    public double variance(QuantizerWu$Box quantizerWu$Box) {
        int[] nArray = this.momentsR;
        int n3 = QuantizerWu.volume(quantizerWu$Box, nArray);
        int[] nArray2 = this.momentsG;
        int n4 = QuantizerWu.volume(quantizerWu$Box, nArray2);
        int[] nArray3 = this.momentsB;
        int n7 = QuantizerWu.volume(quantizerWu$Box, nArray3);
        double[] dArray = this.moments;
        int n8 = quantizerWu$Box.r1;
        int n10 = quantizerWu$Box.g1;
        int n14 = quantizerWu$Box.b1;
        n8 = QuantizerWu.getIndex(n8, n10, n14);
        double d2 = dArray[n8];
        dArray = this.moments;
        n14 = quantizerWu$Box.r1;
        int n15 = quantizerWu$Box.g1;
        int n16 = quantizerWu$Box.b0;
        n14 = QuantizerWu.getIndex(n14, n15, n16);
        double d5 = dArray[n14];
        d2 -= d5;
        dArray = this.moments;
        n14 = quantizerWu$Box.r1;
        n15 = quantizerWu$Box.g0;
        n16 = quantizerWu$Box.b1;
        n14 = QuantizerWu.getIndex(n14, n15, n16);
        d5 = dArray[n14];
        d2 -= d5;
        dArray = this.moments;
        n14 = quantizerWu$Box.r1;
        n15 = quantizerWu$Box.g0;
        n16 = quantizerWu$Box.b0;
        n14 = QuantizerWu.getIndex(n14, n15, n16);
        d5 = dArray[n14];
        d2 += d5;
        dArray = this.moments;
        n14 = quantizerWu$Box.r0;
        n15 = quantizerWu$Box.g1;
        n16 = quantizerWu$Box.b1;
        n14 = QuantizerWu.getIndex(n14, n15, n16);
        d5 = dArray[n14];
        d2 -= d5;
        dArray = this.moments;
        n14 = quantizerWu$Box.r0;
        n15 = quantizerWu$Box.g1;
        n16 = quantizerWu$Box.b0;
        n14 = QuantizerWu.getIndex(n14, n15, n16);
        d5 = dArray[n14];
        d2 += d5;
        dArray = this.moments;
        n14 = quantizerWu$Box.r0;
        n15 = quantizerWu$Box.g0;
        n16 = quantizerWu$Box.b1;
        n14 = QuantizerWu.getIndex(n14, n15, n16);
        d5 = dArray[n14];
        d2 += d5;
        dArray = this.moments;
        n14 = quantizerWu$Box.r0;
        n15 = quantizerWu$Box.g0;
        n16 = quantizerWu$Box.b0;
        n14 = QuantizerWu.getIndex(n14, n15, n16);
        d5 = dArray[n14];
        d2 -= d5;
        n3 *= n3;
        n4 = n4 * n4 + n3;
        n7 = n7 * n7 + n4;
        nArray = this.weights;
        int n17 = QuantizerWu.volume(quantizerWu$Box, nArray);
        double d7 = n7;
        double d9 = n17;
        return d2 - (d7 /= d9);
    }
}

