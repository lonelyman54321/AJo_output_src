/*
 * Decompiled with CFR 0.152.
 */
package com.google.zxing.datamatrix.encoder;

import java.util.Arrays;

public class DefaultPlacement {
    private final byte[] bits;
    private final CharSequence codewords;
    private final int numcols;
    private final int numrows;

    public DefaultPlacement(CharSequence object, int n3, int n4) {
        this.codewords = object;
        this.numcols = n3;
        this.numrows = n4;
        object = new byte[n3 * n4];
        this.bits = (byte[])object;
        Arrays.fill((byte[])object, (byte)-1);
    }

    private void corner1(int n3) {
        int n4 = this.numrows;
        int n7 = 1;
        this.module(n4 -= n7, 0, n3, n7);
        n4 = this.numrows - n7;
        int n8 = 2;
        this.module(n4, n7, n3, n8);
        n4 = this.numrows - n7;
        int n10 = 3;
        this.module(n4, n8, n3, n10);
        n4 = this.numcols - n8;
        this.module(0, n4, n3, 4);
        n4 = this.numcols - n7;
        this.module(0, n4, n3, 5);
        n4 = this.numcols - n7;
        this.module(n7, n4, n3, 6);
        n4 = this.numcols - n7;
        this.module(n8, n4, n3, 7);
        n4 = this.numcols - n7;
        this.module(n10, n4, n3, 8);
    }

    private void corner2(int n3) {
        int n4 = this.numrows;
        int n7 = 3;
        int n8 = 1;
        this.module(n4 -= n7, 0, n3, n8);
        n4 = this.numrows;
        int n10 = 2;
        this.module(n4 -= n10, 0, n3, n10);
        n4 = this.numrows - n8;
        this.module(n4, 0, n3, n7);
        n4 = this.numcols;
        int n14 = 4;
        this.module(0, n4 -= n14, n3, n14);
        n4 = this.numcols - n7;
        this.module(0, n4, n3, 5);
        n4 = this.numcols - n10;
        this.module(0, n4, n3, 6);
        n4 = this.numcols - n8;
        this.module(0, n4, n3, 7);
        n4 = this.numcols - n8;
        this.module(n8, n4, n3, 8);
    }

    private void corner3(int n3) {
        int n4 = this.numrows;
        int n7 = 3;
        int n8 = 1;
        this.module(n4 -= n7, 0, n3, n8);
        n4 = this.numrows;
        int n10 = 2;
        this.module(n4 -= n10, 0, n3, n10);
        n4 = this.numrows - n8;
        this.module(n4, 0, n3, n7);
        n4 = this.numcols - n10;
        this.module(0, n4, n3, 4);
        n4 = this.numcols - n8;
        this.module(0, n4, n3, 5);
        n4 = this.numcols - n8;
        this.module(n8, n4, n3, 6);
        n4 = this.numcols - n8;
        this.module(n10, n4, n3, 7);
        n4 = this.numcols - n8;
        this.module(n7, n4, n3, 8);
    }

    private void corner4(int n3) {
        int n4 = this.numrows;
        int n7 = 1;
        this.module(n4 -= n7, 0, n3, n7);
        n4 = this.numrows - n7;
        int n8 = this.numcols - n7;
        int n10 = 2;
        this.module(n4, n8, n3, n10);
        n4 = this.numcols;
        n8 = 3;
        this.module(0, n4 -= n8, n3, n8);
        n4 = this.numcols - n10;
        this.module(0, n4, n3, 4);
        n4 = this.numcols - n7;
        this.module(0, n4, n3, 5);
        n4 = this.numcols - n8;
        this.module(n7, n4, n3, 6);
        n4 = this.numcols - n10;
        this.module(n7, n4, n3, 7);
        n4 = this.numcols - n7;
        this.module(n7, n4, n3, 8);
    }

    private boolean hasBit(int n3, int n4) {
        byte[] byArray = this.bits;
        int n7 = this.numcols;
        return (n3 = byArray[n4 = n4 * n7 + n3]) >= 0;
    }

    private void module(int n3, int n4, int n7, int n8) {
        int n10;
        if (n3 < 0) {
            n10 = this.numrows;
            n3 += n10;
            n10 = (n10 + 4) % 8;
            n10 = 4 - n10;
            n4 += n10;
        }
        if (n4 < 0) {
            n10 = this.numcols;
            n4 += n10;
            n10 = (n10 + 4) % 8;
            n10 = 4 - n10;
            n3 += n10;
        }
        CharSequence charSequence = this.codewords;
        n7 = charSequence.charAt(n7);
        n8 = 8 - n8;
        n10 = 1;
        if ((n7 &= (n8 = n10 << n8)) == 0) {
            n10 = 0;
            charSequence = null;
        }
        this.setBit(n4, n3, n10 != 0);
    }

    private void setBit(int n3, int n4, boolean bl2) {
        byte[] byArray = this.bits;
        int n7 = this.numcols;
        n4 = n4 * n7 + n3;
        byArray[n4] = n3 = (int)((byte)(bl2 ? 1 : 0));
    }

    private void utah(int n3, int n4, int n7) {
        int n8 = n3 + -2;
        int n10 = n4 + -2;
        this.module(n8, n10, n7, 1);
        int n14 = n4 + -1;
        this.module(n8, n14, n7, 2);
        n8 = n3 + -1;
        this.module(n8, n10, n7, 3);
        this.module(n8, n14, n7, 4);
        this.module(n8, n4, n7, 5);
        this.module(n3, n10, n7, 6);
        this.module(n3, n14, n7, 7);
        this.module(n3, n4, n7, 8);
    }

    public final boolean getBit(int n3, int n4) {
        byte[] byArray = this.bits;
        int n7 = this.numcols;
        n4 = n4 * n7 + n3;
        n3 = byArray[n4];
        if (n3 == (n4 = 1)) {
            return n4 != 0;
        }
        return false;
    }

    public final byte[] getBits() {
        return this.bits;
    }

    public final int getNumcols() {
        return this.numcols;
    }

    public final int getNumrows() {
        return this.numrows;
    }

    public final void place() {
        int n3;
        int n4;
        int n7;
        int n8 = 0;
        int n10 = 4;
        int n14 = 0;
        int n15 = 4;
        block0: do {
            int n16;
            if (n15 == (n4 = this.numrows) && n8 == 0) {
                n4 = n14 + 1;
                this.corner1(n14);
                n14 = n4;
            }
            n4 = this.numrows;
            n3 = 2;
            if (n15 == (n4 -= n3) && n8 == 0 && (n4 = this.numcols % n10) != 0) {
                n4 = n14 + 1;
                this.corner2(n14);
                n14 = n4;
            }
            if (n15 == (n4 = this.numrows - n3) && n8 == 0 && (n4 = this.numcols % 8) == n10) {
                n4 = n14 + 1;
                this.corner3(n14);
                n14 = n4;
            }
            if (n15 == (n4 = this.numrows + n10) && n8 == n3 && (n4 = this.numcols % 8) == 0) {
                n4 = n14 + 1;
                this.corner4(n14);
                n14 = n4;
            }
            while (true) {
                if (n15 < (n4 = this.numrows) && n8 >= 0 && (n4 = (int)(this.hasBit(n8, n15) ? 1 : 0)) == 0) {
                    n4 = n14 + 1;
                    this.utah(n15, n8, n14);
                    n14 = n4;
                }
                n4 = n15 + -2;
                n16 = n8 + 2;
                if (n4 < 0 || n16 >= (n7 = this.numcols)) break;
                n15 = n4;
                n8 = n16;
            }
            n15 += -1;
            n8 += 5;
            while (true) {
                if (n15 >= 0 && n8 < (n4 = this.numcols) && (n4 = (int)(this.hasBit(n8, n15) ? 1 : 0)) == 0) {
                    n4 = n14 + 1;
                    this.utah(n15, n8, n14);
                    n14 = n4;
                }
                n4 = n15 + 2;
                n16 = n8 + -2;
                n7 = this.numrows;
                if (n4 >= n7 || n16 < 0) continue block0;
                n15 = n4;
                n8 = n16;
            }
        } while ((n15 += 5) < n7 || (n8 += -1) < (n4 = this.numcols));
        n8 = 1;
        n10 = (int)(this.hasBit(n4 -= n8, n7 -= n8) ? 1 : 0);
        if (n10 == 0) {
            n10 = this.numcols - n8;
            n14 = this.numrows - n8;
            this.setBit(n10, n14, n8 != 0);
            n10 = this.numcols - n3;
            n14 = this.numrows - n3;
            this.setBit(n10, n14, n8 != 0);
        }
    }
}

