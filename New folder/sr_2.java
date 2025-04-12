/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from SR
 */
public final class sr_2 {
    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public static le_2 a(int n3, int n4, he_2 he_22) {
        void var4_6;
        void var6_24;
        block11: {
            int n7;
            block12: {
                block13: {
                    int n8 = n4 & 1;
                    if (n8 != 0) {
                        n3 = 0;
                        Object var4_4 = null;
                    }
                    if ((n4 &= 2) != 0) {
                        he_22 = he_2.SUSPEND;
                    }
                    n4 = -2;
                    n8 = 0;
                    n7 = 1;
                    if (n3 == n4) break block12;
                    n4 = -1;
                    if (n3 == n4) break block13;
                    if (n3 != 0) {
                        n4 = -1 >>> 1;
                        if (n3 != n4) {
                            he_2 he_23 = he_2.SUSPEND;
                            if (he_22 == he_23) {
                                le_2 le_22 = new le_2(n3, null);
                                return var6_24;
                            }
                            x40_0 x40_02 = new x40_0(n3, he_22, null);
                            return var6_24;
                        }
                        le_2 le_23 = new le_2(n4, null);
                        break block11;
                    } else {
                        he_2 he_24 = he_2.SUSPEND;
                        if (he_22 == he_24) {
                            le_2 le_24 = new le_2(0, null);
                            break block11;
                        } else {
                            x40_0 x40_03 = new x40_0(n7, he_22, null);
                        }
                    }
                    break block11;
                }
                he_2 he_25 = he_2.SUSPEND;
                if (he_22 == he_25) {
                    he_2 he_26 = he_2.DROP_OLDEST;
                    x40_0 x40_04 = new x40_0(n7, he_26, null);
                    return var6_24;
                }
                String string2 = "CONFLATED capacity cannot be used with non-default onBufferOverflow".toString();
                IllegalArgumentException illegalArgumentException = new IllegalArgumentException(string2);
                throw illegalArgumentException;
            }
            he_2 he_27 = he_2.SUSPEND;
            if (he_22 == he_27) {
                dr$a_1 dr$a_1 = dr_2.V;
                dr$a_1.getClass();
                n4 = dr$a_1.b;
                le_2 le_25 = new le_2(n4, null);
            } else {
                x40_0 x40_05 = new x40_0(n7, he_22, null);
            }
        }
        void var6_21 = var4_6;
        return var6_24;
    }
}

