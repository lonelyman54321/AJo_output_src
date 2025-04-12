/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.material.color.utilities;

import com.google.android.material.color.utilities.Hct;
import com.google.android.material.color.utilities.MathUtils;
import com.google.android.material.color.utilities.Score$ScoredComparator;
import com.google.android.material.color.utilities.Score$ScoredHCT;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class Score {
    private static final int BLUE_500 = -12417548;
    private static final double CUTOFF_CHROMA = 5.0;
    private static final double CUTOFF_EXCITED_PROPORTION = 0.01;
    private static final int MAX_COLOR_COUNT = 4;
    private static final double TARGET_CHROMA = 48.0;
    private static final double WEIGHT_CHROMA_ABOVE = 0.3;
    private static final double WEIGHT_CHROMA_BELOW = 0.1;
    private static final double WEIGHT_PROPORTION = 0.7;

    private Score() {
    }

    public static List score(Map map2) {
        return Score.score(map2, 4, -12417548, true);
    }

    public static List score(Map map2, int n3) {
        return Score.score(map2, n3, -12417548, true);
    }

    public static List score(Map map2, int n3, int n4) {
        return Score.score(map2, n3, n4, true);
    }

    public static List score(Map object, int n3, int n4, boolean n7) {
        int n8;
        Object object2;
        double d2;
        int n10;
        int n14;
        int n15;
        int n16;
        double d5;
        Object object3;
        int n17;
        double d7;
        Object object4;
        int n18;
        Iterator iterator = new Iterator();
        int n19 = 360;
        Object object5 = new int[n19];
        object = object.entrySet().iterator();
        long l2 = 0L;
        double d9 = 0.0;
        while ((n18 = object.hasNext()) != 0) {
            object4 = object.next();
            Hct hct = Hct.fromInt((Integer)object4.getKey());
            ((ArrayList)((Object)iterator)).add(hct);
            d7 = Math.floor(hct.getHue());
            n17 = (int)d7;
            object4 = (Integer)object4.getValue();
            n18 = (Integer)object4;
            object5[n17] = object3 = object5[n17] + n18;
            d5 = n18;
            d9 += d5;
        }
        object = new double[n19];
        object4 = null;
        for (n18 = 0; n18 < n19; ++n18) {
            n17 = object5[n18];
            d7 = (double)n17 / d9;
            for (n16 = n18 + -14; n16 < (n15 = n18 + 16); ++n16) {
                reference var22_18;
                n15 = MathUtils.sanitizeDegreesInt(n16);
                object[n15] = var22_18 = object[n15] + d7;
            }
        }
        ArrayList<Object> arrayList = new ArrayList<Object>();
        iterator = ((ArrayList)((Object)iterator)).iterator();
        while ((n14 = iterator.hasNext()) != 0) {
            double d12;
            double d13;
            object5 = (Hct)iterator.next();
            l2 = Math.round(((Hct)object5).getHue());
            n10 = (int)l2;
            int n20 = MathUtils.sanitizeDegreesInt(n10);
            d9 = (double)object[n20];
            if (n7 != 0 && ((n15 = (int)((d13 = (d5 = ((Hct)object5).getChroma()) - (d2 = 5.0)) == 0.0 ? 0 : (d13 < 0.0 ? -1 : 1))) < 0 || (object3 = (Object)((d12 = d9 - (d5 = 0.01)) == 0.0 ? 0 : (d12 < 0.0 ? -1 : 1))) <= 0)) continue;
            d9 = d9 * 100.0 * 0.7;
            d5 = ((Hct)object5).getChroma();
            double d14 = d5 - (d2 = 48.0);
            n15 = (int)(d14 == 0.0 ? 0 : (d14 < 0.0 ? -1 : 1));
            d5 = n15 < 0 ? 0.1 : 0.3;
            double d15 = (((Hct)object5).getChroma() - d2) * d5 + d9;
            object2 = new Score$ScoredHCT((Hct)object5, d15);
            arrayList.add(object2);
        }
        object = new Score$ScoredComparator();
        Collections.sort(arrayList, object);
        object = new ArrayList();
        for (n7 = 90; n7 >= (n8 = 15); n7 += -1) {
            ((ArrayList)object).clear();
            iterator = arrayList.iterator();
            while ((n14 = iterator.hasNext()) != 0) {
                block9: {
                    object5 = ((Score$ScoredHCT)iterator.next()).hct;
                    object2 = ((ArrayList)object).iterator();
                    while ((n10 = (int)(object2.hasNext() ? 1 : 0)) != 0) {
                        Hct hct = (Hct)object2.next();
                        d5 = ((Hct)object5).getHue();
                        double d16 = MathUtils.differenceDegrees(d5, d2 = hct.getHue());
                        double d15 = d16 - (d7 = (double)n7);
                        n16 = (int)(d15 == 0.0 ? 0 : (d15 < 0.0 ? -1 : 1));
                        if (n16 >= 0) continue;
                        break block9;
                    }
                    ((ArrayList)object).add(object5);
                }
                if ((n14 = ((ArrayList)object).size()) < n3) continue;
            }
            if ((n8 = ((ArrayList)object).size()) >= n3) break;
        }
        ArrayList<Object> arrayList2 = new ArrayList<Object>();
        n7 = (int)(((ArrayList)object).isEmpty() ? 1 : 0);
        if (n7 != 0) {
            object = n4;
            arrayList2.add(object);
            return arrayList2;
        }
        object = ((ArrayList)object).iterator();
        while ((n4 = (int)(object.hasNext() ? 1 : 0)) != 0) {
            n4 = ((Hct)object.next()).toInt();
            Integer n21 = n4;
            arrayList2.add(n21);
        }
        return arrayList2;
    }
}

