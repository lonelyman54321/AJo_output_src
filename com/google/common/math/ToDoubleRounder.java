/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.math;

import com.google.common.base.Preconditions;
import com.google.common.math.DoubleUtils;
import com.google.common.math.MathPreconditions;
import com.google.common.math.ToDoubleRounder$1;
import java.math.RoundingMode;

abstract class ToDoubleRounder {
    public abstract Number minus(Number var1, Number var2);

    public final double roundToDouble(Number object, RoundingMode object2) {
        int n3;
        Object object3;
        Preconditions.checkNotNull(object, "x");
        CharSequence charSequence = "mode";
        Preconditions.checkNotNull(object2, charSequence);
        double d2 = this.roundToDoubleArbitrarily((Number)object);
        int n4 = Double.isInfinite(d2);
        double d5 = -1.0 / 0.0;
        long l2 = 0x7FF0000000000000L;
        double d7 = 1.0 / 0.0;
        if (n4 != 0) {
            object3 = ToDoubleRounder$1.$SwitchMap$java$math$RoundingMode;
            n3 = ((Enum)object2).ordinal();
            n4 = object3[n3];
            double d9 = Double.MAX_VALUE;
            switch (n4) {
                default: {
                    break;
                }
                case 8: {
                    charSequence = new StringBuilder();
                    ((StringBuilder)charSequence).append(object);
                    ((StringBuilder)charSequence).append(" cannot be represented precisely as a double");
                    object = ((StringBuilder)charSequence).toString();
                    object2 = new ArithmeticException((String)object);
                    throw object2;
                }
                case 7: {
                    return d2;
                }
                case 6: {
                    double d12 = d2 == d7 ? 0 : (d2 > d7 ? 1 : -1);
                    if (d12 != false) {
                        l2 = -4503599627370497L;
                        d7 = -1.7976931348623157E308;
                    }
                    return d7;
                }
                case 5: {
                    double d13 = d2 == d7 ? 0 : (d2 > d7 ? 1 : -1);
                    if (d13 == false) {
                        d5 = d9;
                    }
                    return d5;
                }
                case 1: 
                case 2: 
                case 3: 
                case 4: {
                    return (double)this.sign((Number)object) * d9;
                }
            }
        }
        object3 = (Object)RoundingMode.UNNECESSARY;
        object3 = this.toX(d2, (RoundingMode)((Object)object3));
        Object object4 = object;
        object4 = (Comparable)object;
        n3 = object4.compareTo(object3);
        int[] nArray = ToDoubleRounder$1.$SwitchMap$java$math$RoundingMode;
        int n7 = ((Enum)object2).ordinal();
        n7 = nArray[n7];
        String string2 = "impossible";
        switch (n7) {
            default: {
                object = new AssertionError((Object)string2);
                throw object;
            }
            case 8: {
                boolean bl2;
                if (n3 == 0) {
                    bl2 = true;
                } else {
                    bl2 = false;
                    object = null;
                }
                MathPreconditions.checkRoundingUnnecessary(bl2);
                return d2;
            }
            case 7: {
                int n8 = this.sign((Number)object);
                if (n8 >= 0) {
                    if (n3 > 0) {
                        d2 = Math.nextUp(d2);
                    }
                    return d2;
                }
                if (n3 < 0) {
                    d2 = DoubleUtils.nextDown(d2);
                }
                return d2;
            }
            case 6: {
                if (n3 > 0) {
                    d2 = Math.nextUp(d2);
                }
                return d2;
            }
            case 5: {
                if (n3 < 0) {
                    d2 = DoubleUtils.nextDown(d2);
                }
                return d2;
            }
            case 2: 
            case 3: 
            case 4: {
                Object object5;
                if (n3 >= 0) {
                    d5 = Math.nextUp(d2);
                    double d14 = d5 - d7;
                    n3 = (int)(d14 == 0.0 ? 0 : (d14 > 0.0 ? 1 : -1));
                    if (n3 == 0) {
                        return d2;
                    }
                    object5 = RoundingMode.CEILING;
                    object5 = this.toX(d5, (RoundingMode)((Object)object5));
                } else {
                    d7 = DoubleUtils.nextDown(d2);
                    double d15 = d7 - d5;
                    n3 = (int)(d15 == 0.0 ? 0 : (d15 > 0.0 ? 1 : -1));
                    if (n3 == 0) {
                        return d2;
                    }
                    Object object6 = RoundingMode.FLOOR;
                    object6 = this.toX(d7, (RoundingMode)((Object)object6));
                    object5 = object3;
                    object3 = object6;
                    d5 = d2;
                    d2 = d7;
                }
                object3 = this.minus((Number)object, (Number)object3);
                object5 = this.minus((Number)object5, (Number)object);
                object3 = (Comparable)object3;
                n4 = object3.compareTo(object5);
                if (n4 < 0) {
                    return d2;
                }
                if (n4 > 0) {
                    return d5;
                }
                int n10 = ((Enum)object2).ordinal();
                n4 = 2;
                if ((n10 = nArray[n10]) != n4) {
                    n4 = 3;
                    if (n10 != n4) {
                        n4 = 4;
                        if (n10 == n4) {
                            int n14 = this.sign((Number)object);
                            if (n14 >= 0) {
                                d2 = d5;
                            }
                            return d2;
                        }
                        object = new AssertionError((Object)string2);
                        throw object;
                    }
                    int n15 = this.sign((Number)object);
                    if (n15 < 0) {
                        d2 = d5;
                    }
                    return d2;
                }
                long l3 = Double.doubleToRawLongBits(d2) & 1L;
                l2 = 0L;
                d7 = 0.0;
                n4 = (int)(l3 == l2 ? 0 : (l3 < l2 ? -1 : 1));
                if (n4 != 0) {
                    d2 = d5;
                }
                return d2;
            }
            case 1: 
        }
        int n16 = this.sign((Number)object);
        if (n16 >= 0) {
            if (n3 < 0) {
                d2 = DoubleUtils.nextDown(d2);
            }
            return d2;
        }
        if (n3 > 0) {
            d2 = Math.nextUp(d2);
        }
        return d2;
    }

    public abstract double roundToDoubleArbitrarily(Number var1);

    public abstract int sign(Number var1);

    public abstract Number toX(double var1, RoundingMode var3);
}

