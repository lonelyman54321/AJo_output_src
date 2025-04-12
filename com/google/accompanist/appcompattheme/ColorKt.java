/*
 * Decompiled with CFR 0.152.
 */
package com.google.accompanist.appcompattheme;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class ColorKt {
    private static final double MINIMUM_CONTRAST = 4.5;

    public static final double calculateContrastForForeground--OWjLjI(long l2, long l3) {
        int n3 = zx_0.i(l3);
        int n4 = zx_0.i(l2);
        return hZ.d(n3, n4);
    }

    public static final long calculateOnColor-8_81llA(long l2) {
        long l3;
        double d2;
        long l4 = OX.b;
        double d5 = ColorKt.calculateContrastForForeground--OWjLjI(l2, l4);
        double d7 = d5 - (d2 = ColorKt.calculateContrastForForeground--OWjLjI(l2, l3 = OX.f));
        Object object = d7 == 0.0 ? 0 : (d7 > 0.0 ? 1 : -1);
        if (object <= 0) {
            l4 = l3;
        }
        return l4;
    }

    public static final long calculateOnColorWithTextColorPrimary--OWjLjI(long l2, long l3) {
        double d2;
        double d5;
        double d7;
        double d9;
        int n3 = OX.m;
        long l4 = OX.l;
        n3 = (int)(OX.c(l3, l4) ? 1 : 0);
        if (n3 == 0 && (d9 = (d7 = (d5 = ColorKt.calculateContrastForForeground--OWjLjI(l2, l3)) - (d2 = 4.5)) == 0.0 ? 0 : (d7 > 0.0 ? 1 : -1)) >= 0) {
            return l3;
        }
        return ColorKt.calculateOnColor-8_81llA(l2);
    }
}

