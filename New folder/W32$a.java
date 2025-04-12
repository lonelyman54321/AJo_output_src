/*
 * Decompiled with CFR 0.152.
 */
public final class W32$a
implements W32$e {
    public final boolean a(LP1$c fo02) {
        WR1 wR1 = null;
        while (true) {
            int n3 = 0;
            if (fo02 == null) break;
            int n4 = fo02 instanceof gw2_0;
            if (n4 != 0) {
                fo02 = (gw2_0)fo02;
                fo02.P();
            } else {
                n4 = ((LP1$c)fo02).c;
                int n7 = 16;
                if ((n4 &= n7) != 0 && (n4 = fo02 instanceof mo0_0) != 0) {
                    int n8;
                    fo0 fo03 = fo02;
                    fo03 = ((mo0_0)fo02).o;
                    while (true) {
                        n8 = 1;
                        if (fo03 == null) break;
                        int n10 = ((LP1$c)fo03).c & n7;
                        if (n10 != 0) {
                            if (++n3 == n8) {
                                fo02 = fo03;
                            } else {
                                if (wR1 == null) {
                                    Object[] objectArray = new LP1$c[n7];
                                    wR1 = new WR1(objectArray);
                                }
                                if (fo02 != null) {
                                    wR1.b(fo02);
                                    fo02 = null;
                                }
                                wR1.b(fo03);
                            }
                        }
                        fo03 = ((LP1$c)fo03).f;
                    }
                    if (n3 == n8) continue;
                }
            }
            fo02 = go0.b(wR1);
        }
        return false;
    }

    public final int b() {
        return 16;
    }

    public final void c(xp1_0 xp1_02, long l2, C61 c61, boolean bl2, boolean bl3) {
        xp1_02.E(l2, c61, bl2, bl3);
    }

    public final boolean d(xp1_0 xp1_02) {
        return true;
    }
}

