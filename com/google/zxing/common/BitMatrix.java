/*
 * Decompiled with CFR 0.152.
 */
package com.google.zxing.common;

import com.google.zxing.common.BitArray;
import java.util.Arrays;

public final class BitMatrix
implements Cloneable {
    private final int[] bits;
    private final int height;
    private final int rowSize;
    private final int width;

    public BitMatrix(int n3) {
        this(n3, n3);
    }

    public BitMatrix(int n3, int n4) {
        if (n3 > 0 && n4 > 0) {
            this.width = n3;
            this.height = n4;
            this.rowSize = n3 = (n3 + 31) / 32;
            int[] nArray = new int[n3 * n4];
            this.bits = nArray;
            return;
        }
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Both dimensions must be greater than 0");
        throw illegalArgumentException;
    }

    private BitMatrix(int n3, int n4, int n7, int[] nArray) {
        this.width = n3;
        this.height = n4;
        this.rowSize = n7;
        this.bits = nArray;
    }

    private String buildToString(String string2, String string3, String string4) {
        int n3;
        int n4 = this.height;
        int n7 = (this.width + 1) * n4;
        StringBuilder stringBuilder = new StringBuilder(n7);
        n4 = 0;
        for (n7 = 0; n7 < (n3 = this.height); ++n7) {
            int n8;
            for (n3 = 0; n3 < (n8 = this.width); ++n3) {
                n8 = (int)(this.get(n3, n7) ? 1 : 0);
                String string5 = n8 != 0 ? string2 : string3;
                stringBuilder.append(string5);
            }
            stringBuilder.append(string4);
        }
        return stringBuilder.toString();
    }

    /*
     * Enabled aggressive block sorting
     */
    public static BitMatrix parse(String object, String object2, String charSequence) {
        String string2;
        if (object == null) {
            object = new IllegalArgumentException();
            throw object;
        }
        int n3 = ((String)object).length();
        boolean[] blArray = new boolean[n3];
        int n4 = -1;
        int n7 = 0;
        int n8 = 0;
        int n10 = 0;
        int n14 = 0;
        int n15 = -1;
        int n16 = 0;
        while (true) {
            int n17;
            int n18 = ((String)object).length();
            string2 = "row lengths do not match";
            if (n8 >= n18) break;
            n18 = ((String)object).charAt(n8);
            if (n18 != (n17 = 10) && (n18 = (int)((String)object).charAt(n8)) != (n17 = 13)) {
                n18 = ((String)object2).length() + n8;
                String string3 = ((String)object).substring(n8, n18);
                if ((n18 = (int)(string3.equals(object2) ? 1 : 0)) != 0) {
                    n18 = ((String)object2).length();
                    n8 += n18;
                    blArray[n10] = n18 = 1;
                } else {
                    n18 = ((String)charSequence).length() + n8;
                    string3 = ((String)object).substring(n8, n18);
                    if ((n18 = (int)(string3.equals(charSequence) ? 1 : 0)) == 0) {
                        charSequence = new StringBuilder("illegal character encountered: ");
                        object = ((String)object).substring(n8);
                        ((StringBuilder)charSequence).append((String)object);
                        object = ((StringBuilder)charSequence).toString();
                        object2 = new IllegalArgumentException((String)object);
                        throw object2;
                    }
                    n18 = ((String)charSequence).length();
                    n8 += n18;
                    blArray[n10] = false;
                }
                ++n10;
                continue;
            }
            if (n10 > n14) {
                if (n15 == n4) {
                    n15 = n10 - n14;
                } else if ((n14 = n10 - n14) != n15) {
                    object = new IllegalArgumentException(string2);
                    throw object;
                }
                ++n16;
                n14 = n10;
            }
            ++n8;
        }
        if (n10 > n14) {
            if (n15 == n4) {
                n15 = n10 - n14;
            } else {
                int n19 = n10 - n14;
                if (n19 != n15) {
                    object = new IllegalArgumentException(string2);
                    throw object;
                }
            }
            ++n16;
        }
        object = new BitMatrix(n15, n16);
        while (n7 < n10) {
            int n20 = blArray[n7];
            if (n20 != 0) {
                n20 = n7 % n15;
                int n21 = n7 / n15;
                ((BitMatrix)object).set(n20, n21);
            }
            ++n7;
        }
        return object;
    }

    public static BitMatrix parse(boolean[][] blArray) {
        int n3 = blArray.length;
        boolean[] blArray2 = blArray[0];
        int n4 = blArray2.length;
        BitMatrix bitMatrix = new BitMatrix(n4, n3);
        for (int i3 = 0; i3 < n3; ++i3) {
            boolean[] blArray3 = blArray[i3];
            for (int i8 = 0; i8 < n4; ++i8) {
                boolean bl2 = blArray3[i8];
                if (!bl2) continue;
                bitMatrix.set(i8, i3);
            }
        }
        return bitMatrix;
    }

    public void clear() {
        int[] nArray = this.bits;
        int n3 = nArray.length;
        for (int i3 = 0; i3 < n3; ++i3) {
            int[] nArray2 = this.bits;
            nArray2[i3] = 0;
        }
    }

    public BitMatrix clone() {
        int n3 = this.width;
        int n4 = this.height;
        int n7 = this.rowSize;
        int[] nArray = (int[])this.bits.clone();
        BitMatrix bitMatrix = new BitMatrix(n3, n4, n7, nArray);
        return bitMatrix;
    }

    public boolean equals(Object object) {
        int[] nArray;
        boolean bl2;
        int n3 = object instanceof BitMatrix;
        if (n3 == 0) {
            return false;
        }
        object = (BitMatrix)object;
        n3 = this.width;
        int n4 = ((BitMatrix)object).width;
        return n3 == n4 && (n3 = this.height) == (n4 = ((BitMatrix)object).height) && (n3 = this.rowSize) == (n4 = ((BitMatrix)object).rowSize) && (bl2 = Arrays.equals(nArray = this.bits, (int[])(object = (Object)((BitMatrix)object).bits)));
    }

    public void flip(int n3, int n4) {
        int n7 = this.rowSize;
        n4 *= n7;
        n7 = n3 / 32 + n4;
        int[] nArray = this.bits;
        int n8 = nArray[n7];
        n3 &= 0x1F;
        nArray[n7] = n3 = 1 << n3 ^ n8;
    }

    public boolean get(int n3, int n4) {
        int n7 = this.rowSize;
        n4 *= n7;
        n7 = n3 / 32 + n4;
        int[] nArray = this.bits;
        n4 = nArray[n7];
        n3 &= 0x1F;
        n3 = n4 >>> n3;
        n4 = 1;
        if ((n3 &= n4) != 0) {
            return n4 != 0;
        }
        return false;
    }

    public int[] getBottomRightOnBit() {
        int n3;
        int[] nArray;
        int n4;
        int n7;
        int[] nArray2 = this.bits;
        for (n7 = nArray2.length + -1; n7 >= 0 && (n4 = (nArray = this.bits)[n7]) == 0; n7 += -1) {
        }
        if (n7 < 0) {
            return null;
        }
        n4 = this.rowSize;
        int n8 = n7 / n4;
        n4 = n7 % n4 << 5;
        int[] nArray3 = this.bits;
        n7 = nArray3[n7];
        int n10 = 31;
        while ((n3 = n7 >>> n10) == 0) {
            n10 += -1;
        }
        return new int[]{n4 += n10, n8};
    }

    public int[] getEnclosingRectangle() {
        int n3;
        int n4 = this.width;
        int n7 = this.height;
        int n8 = -1;
        int n10 = -1;
        for (int i3 = 0; i3 < (n3 = this.height); ++i3) {
            int n14;
            for (n3 = 0; n3 < (n14 = this.rowSize); ++n3) {
                int n15;
                int n16;
                int n17;
                int[] nArray = this.bits;
                n14 = n14 * i3 + n3;
                if ((n14 = nArray[n14]) == 0) continue;
                if (i3 < n7) {
                    n7 = i3;
                }
                if (i3 > n10) {
                    n10 = i3;
                }
                if ((n17 = n3 << 5) < n4) {
                    n16 = 0;
                    while (true) {
                        n15 = 31 - n16;
                        if ((n15 = n14 << n15) != 0) break;
                        ++n16;
                    }
                    if ((n16 += n17) < n4) {
                        n4 = n16;
                    }
                }
                if ((n16 = n17 + 31) <= n8) continue;
                n16 = 31;
                while ((n15 = n14 >>> n16) == 0) {
                    n16 += -1;
                }
                if ((n17 += n16) <= n8) continue;
                n8 = n17;
            }
        }
        if (n8 >= n4 && n10 >= n7) {
            n8 = n8 - n4 + 1;
            n10 = n10 - n7 + 1;
            return new int[]{n4, n7, n8, n10};
        }
        return null;
    }

    public int getHeight() {
        return this.height;
    }

    public BitArray getRow(int n3, BitArray bitArray) {
        int n4;
        int n7;
        if (bitArray != null && (n7 = bitArray.getSize()) >= (n4 = this.width)) {
            bitArray.clear();
        } else {
            n7 = this.width;
            bitArray = new BitArray(n7);
        }
        n7 = this.rowSize;
        n3 *= n7;
        for (n7 = 0; n7 < (n4 = this.rowSize); ++n7) {
            n4 = n7 << 5;
            int[] nArray = this.bits;
            int n8 = n3 + n7;
            int n10 = nArray[n8];
            bitArray.setBulk(n4, n10);
        }
        return bitArray;
    }

    public int getRowSize() {
        return this.rowSize;
    }

    public int[] getTopLeftOnBit() {
        int[] nArray;
        int n3;
        int n4;
        int n7 = 0;
        for (n4 = 0; n4 < (n3 = (nArray = this.bits).length) && (n3 = nArray[n4]) == 0; ++n4) {
        }
        n3 = nArray.length;
        if (n4 == n3) {
            return null;
        }
        n3 = this.rowSize;
        int n8 = n4 / n3;
        n3 = n4 % n3 << 5;
        n4 = nArray[n4];
        while (true) {
            int n10 = 31 - n7;
            if ((n10 = n4 << n10) != 0) break;
            ++n7;
        }
        return new int[]{n3 += n7, n8};
    }

    public int getWidth() {
        return this.width;
    }

    public int hashCode() {
        int n3 = this.width;
        int n4 = (n3 * 31 + n3) * 31;
        n3 = this.height;
        n4 = (n4 + n3) * 31;
        n3 = this.rowSize;
        n4 = (n4 + n3) * 31;
        return Arrays.hashCode(this.bits) + n4;
    }

    public void rotate180() {
        int n3;
        int n4 = this.getWidth();
        int n7 = this.getHeight();
        BitArray bitArray = new BitArray(n4);
        BitArray bitArray2 = new BitArray(n4);
        for (n4 = 0; n4 < (n3 = (n7 + 1) / 2); ++n4) {
            bitArray = this.getRow(n4, bitArray);
            n3 = n7 + -1 - n4;
            bitArray2 = this.getRow(n3, bitArray2);
            bitArray.reverse();
            bitArray2.reverse();
            this.setRow(n4, bitArray2);
            this.setRow(n3, bitArray);
        }
    }

    public void set(int n3, int n4) {
        int n7 = this.rowSize;
        n4 *= n7;
        n7 = n3 / 32 + n4;
        int[] nArray = this.bits;
        int n8 = nArray[n7];
        n3 &= 0x1F;
        nArray[n7] = n3 = 1 << n3 | n8;
    }

    public void setRegion(int n3, int n4, int n7, int n8) {
        if (n4 >= 0 && n3 >= 0) {
            if (n8 > 0 && n7 > 0) {
                int n10 = this.height;
                if ((n8 += n4) <= n10 && (n7 += n3) <= (n10 = this.width)) {
                    while (n4 < n8) {
                        n10 = this.rowSize * n4;
                        for (int i3 = n3; i3 < n7; ++i3) {
                            int[] nArray = this.bits;
                            int n14 = i3 / 32 + n10;
                            int n15 = nArray[n14];
                            int n16 = i3 & 0x1F;
                            int n17 = 1;
                            n16 = n17 << n16;
                            nArray[n14] = n15 |= n16;
                        }
                        ++n4;
                    }
                    return;
                }
                IllegalArgumentException illegalArgumentException = new IllegalArgumentException("The region must fit inside the matrix");
                throw illegalArgumentException;
            }
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Height and width must be at least 1");
            throw illegalArgumentException;
        }
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Left and top must be nonnegative");
        throw illegalArgumentException;
    }

    public void setRow(int n3, BitArray object) {
        object = ((BitArray)object).getBitArray();
        int[] nArray = this.bits;
        int n4 = this.rowSize;
        System.arraycopy(object, 0, nArray, n3 *= n4, n4);
    }

    public String toString() {
        return this.toString("X ", "  ");
    }

    public String toString(String string2, String string3) {
        return this.buildToString(string2, string3, "\n");
    }

    public String toString(String string2, String string3, String string4) {
        return this.buildToString(string2, string3, string4);
    }

    public void unset(int n3, int n4) {
        int n7 = this.rowSize;
        n4 *= n7;
        n7 = n3 / 32 + n4;
        int[] nArray = this.bits;
        int n8 = nArray[n7];
        n3 &= 0x1F;
        nArray[n7] = n3 = ~(1 << n3) & n8;
    }

    public void xor(BitMatrix object) {
        int n3 = this.width;
        int n4 = ((BitMatrix)object).getWidth();
        if (n3 == n4 && (n3 = this.height) == (n4 = ((BitMatrix)object).getHeight()) && (n3 = this.rowSize) == (n4 = ((BitMatrix)object).getRowSize())) {
            int n7;
            n4 = this.width;
            BitArray bitArray = new BitArray(n4);
            n4 = 0;
            for (int i3 = 0; i3 < (n7 = this.height); ++i3) {
                int n8;
                n7 = this.rowSize * i3;
                int[] nArray = ((BitMatrix)object).getRow(i3, bitArray).getBitArray();
                for (int i8 = 0; i8 < (n8 = this.rowSize); ++i8) {
                    int[] nArray2 = this.bits;
                    int n10 = n7 + i8;
                    int n14 = nArray2[n10];
                    int n15 = nArray[i8];
                    nArray2[n10] = n14 ^= n15;
                }
            }
            return;
        }
        object = new IllegalArgumentException("input matrix dimensions do not match");
        throw object;
    }
}

