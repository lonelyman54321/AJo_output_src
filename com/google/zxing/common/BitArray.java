/*
 * Decompiled with CFR 0.152.
 */
package com.google.zxing.common;

import java.util.Arrays;

public final class BitArray
implements Cloneable {
    private int[] bits;
    private int size;

    public BitArray() {
        this.size = 0;
        int[] nArray = new int[1];
        this.bits = nArray;
    }

    public BitArray(int n3) {
        this.size = n3;
        int[] nArray = BitArray.makeArray(n3);
        this.bits = nArray;
    }

    public BitArray(int[] nArray, int n3) {
        this.bits = nArray;
        this.size = n3;
    }

    private void ensureCapacity(int n3) {
        int[] nArray = this.bits;
        int n4 = nArray.length << 5;
        if (n3 > n4) {
            int[] nArray2 = BitArray.makeArray(n3);
            nArray = this.bits;
            int n7 = nArray.length;
            System.arraycopy(nArray, 0, nArray2, 0, n7);
            this.bits = nArray2;
        }
    }

    private static int[] makeArray(int n3) {
        return new int[(n3 + 31) / 32];
    }

    public void appendBit(boolean bl2) {
        int n3;
        int n4 = this.size;
        int n7 = 1;
        this.ensureCapacity(n4 += n7);
        if (bl2) {
            int[] nArray = this.bits;
            n4 = this.size;
            int n8 = n4 / 32;
            int n10 = nArray[n8];
            n4 &= 0x1F;
            nArray[n8] = n4 = n7 << n4 | n10;
        }
        this.size = n3 = this.size + n7;
    }

    public void appendBitArray(BitArray bitArray) {
        int n3 = bitArray.size;
        int n4 = this.size + n3;
        this.ensureCapacity(n4);
        for (n4 = 0; n4 < n3; ++n4) {
            boolean bl2 = bitArray.get(n4);
            this.appendBit(bl2);
        }
    }

    public void appendBits(int n3, int n4) {
        int n7;
        if (n4 >= 0 && n4 <= (n7 = 32)) {
            n7 = this.size + n4;
            this.ensureCapacity(n7);
            while (n4 > 0) {
                n7 = n4 + -1;
                n7 = n3 >> n7;
                int n8 = 1;
                if ((n7 &= n8) != n8) {
                    n8 = 0;
                }
                this.appendBit(n8 != 0);
                n4 += -1;
            }
            return;
        }
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Num bits must be between 0 and 32");
        throw illegalArgumentException;
    }

    public void clear() {
        int[] nArray = this.bits;
        int n3 = nArray.length;
        for (int i3 = 0; i3 < n3; ++i3) {
            int[] nArray2 = this.bits;
            nArray2[i3] = 0;
        }
    }

    public BitArray clone() {
        int[] nArray = (int[])this.bits.clone();
        int n3 = this.size;
        BitArray bitArray = new BitArray(nArray, n3);
        return bitArray;
    }

    public boolean equals(Object object) {
        int[] nArray;
        boolean bl2;
        int n3 = object instanceof BitArray;
        if (n3 == 0) {
            return false;
        }
        object = (BitArray)object;
        n3 = this.size;
        int n4 = ((BitArray)object).size;
        return n3 == n4 && (bl2 = Arrays.equals(nArray = this.bits, (int[])(object = (Object)((BitArray)object).bits)));
    }

    public void flip(int n3) {
        int[] nArray = this.bits;
        int n4 = n3 / 32;
        int n7 = nArray[n4];
        n3 &= 0x1F;
        nArray[n4] = n3 = 1 << n3 ^ n7;
    }

    public boolean get(int n3) {
        int[] nArray = this.bits;
        int n4 = n3 / 32;
        int n7 = nArray[n4];
        n3 &= 0x1F;
        n4 = 1;
        if ((n3 = n4 << n3 & n7) != 0) {
            return n4 != 0;
        }
        return false;
    }

    public int[] getBitArray() {
        return this.bits;
    }

    public int getNextSet(int n3) {
        int n4 = this.size;
        if (n3 >= n4) {
            return n4;
        }
        n4 = n3 / 32;
        int[] nArray = this.bits;
        int n7 = nArray[n4];
        n3 &= 0x1F;
        int n8 = 1;
        n3 = ~((n8 << n3) - n8) & n7;
        while (n3 == 0) {
            int[] nArray2 = this.bits;
            n7 = nArray2.length;
            if (++n4 == n7) {
                return this.size;
            }
            n3 = nArray2[n4];
        }
        n4 <<= 5;
        if ((n3 = Integer.numberOfTrailingZeros(n3) + n4) > (n4 = this.size)) {
            return n4;
        }
        return n3;
    }

    public int getNextUnset(int n3) {
        int n4 = this.size;
        if (n3 >= n4) {
            return n4;
        }
        n4 = n3 / 32;
        int[] nArray = this.bits;
        int n7 = ~nArray[n4];
        n3 &= 0x1F;
        int n8 = 1;
        n3 = ~((n8 << n3) - n8) & n7;
        while (n3 == 0) {
            int[] nArray2 = this.bits;
            n7 = nArray2.length;
            if (++n4 == n7) {
                return this.size;
            }
            n3 = ~nArray2[n4];
        }
        n4 <<= 5;
        if ((n3 = Integer.numberOfTrailingZeros(n3) + n4) > (n4 = this.size)) {
            return n4;
        }
        return n3;
    }

    public int getSize() {
        return this.size;
    }

    public int getSizeInBytes() {
        return (this.size + 7) / 8;
    }

    public int hashCode() {
        int n3 = this.size * 31;
        return Arrays.hashCode(this.bits) + n3;
    }

    public boolean isRange(int n3, int n4, boolean bl2) {
        int n7;
        if (n4 >= n3 && n3 >= 0 && n4 <= (n7 = this.size)) {
            n7 = 1;
            if (n4 == n3) {
                return n7 != 0;
            }
            int n8 = n3 / 32;
            int n10 = (n4 += -1) / 32;
            for (int i3 = n8; i3 <= n10; ++i3) {
                int[] nArray;
                int n14;
                int n15 = 31;
                if (i3 > n8) {
                    n14 = 0;
                    nArray = null;
                } else {
                    n14 = n3 & 0x1F;
                }
                if (i3 >= n10) {
                    n15 &= n4;
                }
                int n16 = 2;
                n15 = n16 << n15;
                n14 = n7 << n14;
                n15 -= n14;
                nArray = this.bits;
                n14 = nArray[i3] & n15;
                if (!bl2) {
                    n15 = 0;
                }
                if (n14 == n15) continue;
                return false;
            }
            return n7 != 0;
        }
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException();
        throw illegalArgumentException;
    }

    public void reverse() {
        int n3;
        int n4;
        int n7;
        int n8 = this.bits.length;
        int[] nArray = new int[n8];
        int n10 = this.size;
        int n14 = 1;
        n10 = (n10 - n14) / 32;
        int n15 = n10 + 1;
        int n16 = 0;
        for (n7 = 0; n7 < n15; ++n7) {
            int[] nArray2 = this.bits;
            n4 = nArray2[n7];
            long l2 = n4;
            long l3 = l2 >> n14;
            long l4 = 0x55555555L;
            l2 = (l2 & l4) << n14 | (l3 &= l4);
            int n17 = 2;
            long l7 = l2 >> n17;
            long l8 = 0x33333333L;
            l2 = (l2 & l8) << n17 | (l7 &= l8);
            n17 = 4;
            l7 = l2 >> n17;
            l8 = 0xF0F0F0FL;
            l2 = (l2 & l8) << n17 | (l7 &= l8);
            n17 = 8;
            l7 = l2 >> n17;
            l8 = 0xFF00FFL;
            l2 = (l2 & l8) << n17 | (l7 &= l8);
            n17 = 16;
            l7 = l2 >> n17;
            l8 = (char)-1;
            l2 = (l2 & l8) << n17 | (l7 &= l8);
            n17 = n10 - n7;
            nArray[n17] = n3 = (int)l2;
        }
        n7 = this.size;
        n4 = n15 << 5;
        if (n7 != n4) {
            n16 = nArray[0] >>> (n4 -= n7);
            while (n14 < n15) {
                n7 = nArray[n14];
                n3 = 32 - n4;
                n3 = n7 << n3;
                n16 |= n3;
                n3 = n14 + -1;
                nArray[n3] = n16;
                n16 = n7 >>> n4;
                ++n14;
            }
            nArray[n10] = n16;
        }
        this.bits = nArray;
    }

    public void set(int n3) {
        int[] nArray = this.bits;
        int n4 = n3 / 32;
        int n7 = nArray[n4];
        n3 &= 0x1F;
        nArray[n4] = n3 = 1 << n3 | n7;
    }

    public void setBulk(int n3, int n4) {
        int[] nArray = this.bits;
        nArray[n3 /= 32] = n4;
    }

    public void setRange(int n3, int n4) {
        int n7;
        if (n4 >= n3 && n3 >= 0 && n4 <= (n7 = this.size)) {
            if (n4 == n3) {
                return;
            }
            n7 = n3 / 32;
            int n8 = (n4 += -1) / 32;
            for (int i3 = n7; i3 <= n8; ++i3) {
                int[] nArray;
                int n10;
                int n14 = 31;
                if (i3 > n7) {
                    n10 = 0;
                    nArray = null;
                } else {
                    n10 = n3 & 0x1F;
                }
                if (i3 >= n8) {
                    n14 &= n4;
                }
                n14 = 2 << n14;
                n10 = 1 << n10;
                n14 -= n10;
                nArray = this.bits;
                int n15 = nArray[i3];
                nArray[i3] = n14 |= n15;
            }
            return;
        }
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException();
        throw illegalArgumentException;
    }

    public void toBytes(int n3, byte[] byArray, int n4, int n7) {
        for (int i3 = 0; i3 < n7; ++i3) {
            int n8;
            int n10;
            byte by2 = 0;
            for (n10 = 0; n10 < (n8 = 8); ++n10) {
                n8 = (int)(this.get(n3) ? 1 : 0);
                if (n8 != 0) {
                    n8 = 7 - n10;
                    int n14 = 1;
                    n8 = n14 << n8;
                    by2 = (byte)(by2 | n8);
                }
                ++n3;
            }
            n10 = n4 + i3;
            byArray[n10] = by2 = (byte)by2;
        }
    }

    public String toString() {
        int n3 = this.size;
        int n4 = n3 / 8 + n3 + 1;
        StringBuilder stringBuilder = new StringBuilder(n4);
        for (n3 = 0; n3 < (n4 = this.size); ++n3) {
            n4 = n3 & 7;
            if (n4 == 0) {
                n4 = 32;
                stringBuilder.append((char)n4);
            }
            n4 = (n4 = (int)(this.get(n3) ? 1 : 0)) != 0 ? 88 : 46;
            stringBuilder.append((char)n4);
        }
        return stringBuilder.toString();
    }

    public void xor(BitArray object) {
        int n3 = this.size;
        int n4 = ((BitArray)object).size;
        if (n3 == n4) {
            int[] nArray;
            int n7;
            for (n3 = 0; n3 < (n7 = (nArray = this.bits).length); ++n3) {
                n7 = nArray[n3];
                int[] nArray2 = ((BitArray)object).bits;
                int n8 = nArray2[n3];
                nArray[n3] = n7 ^= n8;
            }
            return;
        }
        object = new IllegalArgumentException("Sizes don't match");
        throw object;
    }
}

