/*
 * Decompiled with CFR 0.152.
 */
package androidx.core.view;

public final class f$l {
    /*
     * Enabled aggressive block sorting
     */
    public static int a(int n3) {
        int n4 = 0;
        int n7 = 1;
        int n8 = 1;
        while (true) {
            block2: {
                int n10;
                block10: {
                    block3: {
                        block4: {
                            block5: {
                                block6: {
                                    block7: {
                                        block8: {
                                            block9: {
                                                if (n8 > (n10 = 256)) {
                                                    return n4;
                                                }
                                                n10 = n3 & n8;
                                                if (n10 == 0) break block2;
                                                if (n8 == n7) break block3;
                                                n10 = 2;
                                                if (n8 == n10) break block4;
                                                n10 = 4;
                                                if (n8 == n10) break block5;
                                                n10 = 8;
                                                if (n8 == n10) break block6;
                                                n10 = 16;
                                                if (n8 == n10) break block7;
                                                n10 = 32;
                                                if (n8 == n10) break block8;
                                                n10 = 64;
                                                if (n8 == n10) break block9;
                                                n10 = 128;
                                                if (n8 != n10) break block2;
                                                n10 = TG3.a();
                                                break block10;
                                            }
                                            n10 = SG3.a();
                                            break block10;
                                        }
                                        n10 = RG3.a();
                                        break block10;
                                    }
                                    n10 = QG3.a();
                                    break block10;
                                }
                                n10 = e93.a();
                                break block10;
                            }
                            n10 = PG3.a();
                            break block10;
                        }
                        n10 = OG3.a();
                        break block10;
                    }
                    n10 = NG3.a();
                }
                n4 |= n10;
            }
            n8 <<= 1;
        }
    }
}

