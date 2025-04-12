/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.material.color.utilities;

import com.google.android.material.color.utilities.ColorUtils;
import com.google.android.material.color.utilities.Hct;
import com.google.android.material.color.utilities.MathUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class TemperatureCache {
    private final Hct input;
    private Hct precomputedComplement;
    private List precomputedHctsByHue;
    private List precomputedHctsByTemp;
    private Map precomputedTempsByHct;

    private TemperatureCache() {
        UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException();
        throw unsupportedOperationException;
    }

    public TemperatureCache(Hct hct) {
        this.input = hct;
    }

    public static /* synthetic */ Double a(TemperatureCache temperatureCache, Hct hct) {
        return temperatureCache.lambda$getHctsByTemp$0(hct);
    }

    private Hct getColdest() {
        return (Hct)this.getHctsByTemp().get(0);
    }

    private List getHctsByHue() {
        double d2;
        double d5;
        double d7;
        List<Hct> list = this.precomputedHctsByHue;
        if (list != null) {
            return list;
        }
        list = new List<Hct>();
        double d9 = 0.0;
        while ((d7 = (d5 = d9 - (d2 = 360.0)) == 0.0 ? 0 : (d5 < 0.0 ? -1 : 1)) <= 0) {
            double d12 = this.input.getChroma();
            double d13 = this.input.getTone();
            d2 = d9;
            Hct hct = Hct.from(d9, d12, d13);
            ((ArrayList)list).add(hct);
            d2 = 1.0;
            d9 += d2;
        }
        this.precomputedHctsByHue = list = Collections.unmodifiableList(list);
        return list;
    }

    private List getHctsByTemp() {
        ArrayList<Object> arrayList = this.precomputedHctsByTemp;
        if (arrayList != null) {
            return arrayList;
        }
        Object object = this.getHctsByHue();
        arrayList = new ArrayList<Object>((Collection<Object>)object);
        object = this.input;
        arrayList.add(object);
        object = new pj3_0(this);
        qj3_0 qj3_02 = new Object();
        object = tm2_0.b((pj3_0)object, qj3_02);
        Collections.sort(arrayList, object);
        this.precomputedHctsByTemp = arrayList;
        return arrayList;
    }

    private Map getTempsByHct() {
        boolean bl2;
        Object object = this.precomputedTempsByHct;
        if (object != null) {
            return object;
        }
        HashMap<Hct, Double> hashMap = this.getHctsByHue();
        object = new ArrayList(hashMap);
        hashMap = this.input;
        ((ArrayList)object).add(hashMap);
        hashMap = new HashMap<Hct, Double>();
        object = ((ArrayList)object).iterator();
        while (bl2 = object.hasNext()) {
            Hct hct = (Hct)object.next();
            double d2 = TemperatureCache.rawTemperature(hct);
            Double d5 = d2;
            hashMap.put(hct, d5);
        }
        this.precomputedTempsByHct = hashMap;
        return hashMap;
    }

    private Hct getWarmest() {
        List list = this.getHctsByTemp();
        int n3 = this.getHctsByTemp().size() + -1;
        return (Hct)list.get(n3);
    }

    private static boolean isBetween(double d2, double d5, double d7) {
        double d9;
        boolean bl2 = false;
        Object object = d5 == d7 ? 0 : (d5 < d7 ? -1 : 1);
        if (object < 0) {
            double d12;
            object = d5 == d2 ? 0 : (d5 < d2 ? -1 : 1);
            if (object <= 0 && (d12 = d2 == d7 ? 0 : (d2 < d7 ? -1 : 1)) <= 0) {
                bl2 = true;
            }
            return bl2;
        }
        object = d5 == d2 ? 0 : (d5 < d2 ? -1 : 1);
        if (object <= 0 || (d9 = d2 == d7 ? 0 : (d2 < d7 ? -1 : 1)) <= 0) {
            bl2 = true;
        }
        return bl2;
    }

    private /* synthetic */ Double lambda$getHctsByTemp$0(Hct hct) {
        return (Double)this.getTempsByHct().get(hct);
    }

    public static double rawTemperature(Hct object) {
        object = ColorUtils.labFromArgb(((Hct)object).toInt());
        int n3 = 2;
        Object object2 = object[n3];
        int n4 = 1;
        Object object3 = object[n4];
        object2 = MathUtils.sanitizeDegreesDouble(Math.toDegrees(Math.atan2((double)object2, (double)object3)));
        Object object4 = object[n4];
        Object object5 = object[n3];
        object4 = Math.pow(Math.hypot((double)object4, (double)object5), 1.07) * 0.02;
        return Math.cos(Math.toRadians(MathUtils.sanitizeDegreesDouble((double)(object2 - 50.0)))) * object4 + -0.5;
    }

    public List getAnalogousColors() {
        return this.getAnalogousColors(5, 12);
    }

    public List getAnalogousColors(int n3, int n4) {
        int n7;
        Hct hct;
        int n8;
        int n10;
        double d2;
        int n14;
        int n15;
        double d5;
        TemperatureCache temperatureCache = this;
        int n16 = n3;
        int n17 = n4;
        double d7 = this.input.getHue();
        long l2 = Math.round(d7);
        int n18 = (int)l2;
        Hct hct2 = (Hct)this.getHctsByHue().get(n18);
        double d9 = this.getRelativeTemperature(hct2);
        ArrayList<Hct> arrayList = new ArrayList<Hct>();
        arrayList.add(hct2);
        double d12 = d5 = 0.0;
        for (n15 = 0; n15 < (n14 = 360); ++n15) {
            n14 = MathUtils.sanitizeDegreesInt(n18 + n15);
            List list = this.getHctsByHue();
            Hct hct3 = (Hct)list.get(n14);
            d2 = temperatureCache.getRelativeTemperature(hct3);
            d9 = Math.abs(d2 - d9);
            d12 += d9;
            d9 = d2;
        }
        d9 = n17;
        d12 /= d9;
        d9 = temperatureCache.getRelativeTemperature(hct2);
        n15 = 1;
        while ((n10 = arrayList.size()) < n17) {
            n10 = MathUtils.sanitizeDegreesInt(n18 + n15);
            hct2 = (Hct)this.getHctsByHue().get(n10);
            double d13 = temperatureCache.getRelativeTemperature(hct2);
            d9 = Math.abs(d13 - d9);
            n8 = arrayList.size();
            double d14 = (d5 += d9) - (d9 = (double)n8 * d12);
            n10 = (int)(d14 == 0.0 ? 0 : (d14 > 0.0 ? 1 : -1));
            if (n10 >= 0) {
                n8 = 1;
            } else {
                n8 = 0;
                hct = null;
            }
            n7 = 1;
            while (n8 != 0 && (n8 = arrayList.size()) < n17) {
                arrayList.add(hct2);
                d2 = (double)(arrayList.size() + n7) * d12;
                n8 = (int)(d5 == d2 ? 0 : (d5 > d2 ? 1 : -1));
                if (n8 >= 0) {
                    n8 = 1;
                } else {
                    n8 = 0;
                    hct = null;
                }
                ++n7;
                n14 = 360;
            }
            n8 = 360;
            if (++n15 > n8) {
                while ((n18 = arrayList.size()) < n17) {
                    arrayList.add(hct2);
                }
                break;
            }
            d9 = d13;
            n14 = 360;
        }
        ArrayList<Hct> arrayList2 = new ArrayList<Hct>();
        hct2 = temperatureCache.input;
        arrayList2.add(hct2);
        d7 = (double)n16 - 1.0;
        d9 = 2.0;
        d7 = Math.floor(d7 / d9);
        int n19 = (int)d7;
        for (n18 = 1; n18 < (n8 = n19 + 1); ++n18) {
            for (n8 = 0 - n18; n8 < 0; n8 += n7) {
                n7 = arrayList.size();
            }
            n7 = arrayList.size();
            if (n8 >= n7) {
                n7 = arrayList.size();
                n8 %= n7;
            }
            hct = (Hct)arrayList.get(n8);
            arrayList2.add(0, hct);
        }
        n16 -= n19;
        for (n19 = 1; n19 < n16; ++n19) {
            for (n18 = n19; n18 < 0; n18 += n8) {
                n8 = arrayList.size();
            }
            n8 = arrayList.size();
            if (n18 >= n8) {
                n8 = arrayList.size();
                n18 %= n8;
            }
            Hct hct4 = (Hct)arrayList.get(n18);
            arrayList2.add(hct4);
        }
        return arrayList2;
    }

    public Hct getComplement() {
        double d2;
        double d5;
        TemperatureCache temperatureCache = this;
        Object object = this.precomputedComplement;
        if (object != null) {
            return object;
        }
        double d7 = this.getColdest().getHue();
        object = this.getTempsByHct();
        Object object2 = this.getColdest();
        double d9 = (Double)object.get(object2);
        double d12 = this.getWarmest().getHue();
        object = this.getTempsByHct();
        object2 = this.getWarmest();
        double d13 = (Double)object.get(object2);
        double d14 = d13 - d9;
        object = this.input;
        double d15 = ((Hct)object).getHue();
        double d16 = d7;
        boolean bl2 = TemperatureCache.isBetween(d15, d7, d12);
        double d17 = bl2 ? d12 : d7;
        if (!bl2) {
            d7 = d12;
        }
        object = this.getHctsByHue();
        int n3 = (int)Math.round(temperatureCache.input.getHue());
        object = (Hct)object.get(n3);
        object2 = temperatureCache.input;
        d15 = temperatureCache.getRelativeTemperature((Hct)object2);
        d12 = 1.0;
        double d18 = d12 - d15;
        d15 = 1000.0;
        d16 = 0.0;
        double d19 = d15;
        double d20 = d16;
        while ((d5 = (d2 = d20 - (d15 = 360.0)) == 0.0 ? 0 : (d2 < 0.0 ? -1 : 1)) <= 0) {
            double d22;
            d15 = d22 = MathUtils.sanitizeDegreesDouble(d12 * d20 + d17);
            d16 = d17;
            boolean bl3 = TemperatureCache.isBetween(d22, d17, d7);
            if (bl3) {
                object2 = this.getHctsByHue();
                long l2 = Math.round(d22);
                d5 = (int)l2;
                object2 = (Hct)object2.get((int)d5);
                Double d23 = (Double)this.getTempsByHct().get(object2);
                double d24 = (d23 - d9) / d14;
                double d25 = (d24 = Math.abs(d18 - d24)) - d19;
                Object object3 = d25 == 0.0 ? 0 : (d25 < 0.0 ? -1 : 1);
                if (object3 < 0) {
                    object = object2;
                    d19 = d24;
                }
            }
            d20 += d12;
        }
        temperatureCache.precomputedComplement = object;
        return object;
    }

    public double getRelativeTemperature(Hct object) {
        Object object2 = this.getTempsByHct();
        Hct hct = this.getWarmest();
        object2 = (Double)object2.get(hct);
        double d2 = (Double)object2;
        Map map2 = this.getTempsByHct();
        Hct hct2 = this.getColdest();
        double d5 = (Double)map2.get(hct2);
        d2 -= d5;
        map2 = this.getTempsByHct();
        d5 = (Double)map2.get(object);
        object = this.getTempsByHct();
        Hct hct3 = this.getColdest();
        object = (Double)object.get(hct3);
        double d7 = (Double)object;
        d5 -= d7;
        d7 = 0.0;
        double d9 = d2 - d7;
        Object object3 = d9 == 0.0 ? 0 : (d9 > 0.0 ? 1 : -1);
        if (object3 == false) {
            return 0.5;
        }
        return d5 / d2;
    }
}

