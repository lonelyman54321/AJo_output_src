/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.common.util;

public class MurmurHash3 {
    private MurmurHash3() {
    }

    public static int murmurhash3_x86_32(byte[] byArray, int n3, int n4, int n7) {
        int n8;
        block5: {
            int n10;
            int n14;
            int n15;
            int n16;
            block3: {
                block4: {
                    int n17;
                    n16 = n3;
                    while (true) {
                        n15 = (n4 & 0xFFFFFFFC) + n3;
                        n14 = 461845907;
                        n10 = -862048943;
                        if (n16 >= n15) break;
                        n15 = byArray[n16] & 0xFF;
                        n17 = n16 + 1;
                        n17 = (byArray[n17] & 0xFF) << 8;
                        int n18 = n16 + 2;
                        n18 = (byArray[n18] & 0xFF) << 16;
                        int n19 = n16 + 3;
                        n19 = byArray[n19] << 24;
                        n15 = (n15 | n17 | n18 | n19) * n10;
                        n10 = n15 << 15;
                        n15 = (n15 >>> 17 | n10) * n14;
                        n7 ^= n15;
                        n15 = n7 << 13;
                        n7 = (n7 >>> 19 | n15) * 5;
                        n15 = -430675100;
                        n7 += n15;
                        n16 += 4;
                    }
                    n3 = n4 & 3;
                    n16 = 0;
                    n17 = 1;
                    if (n3 == n17) break block3;
                    n17 = 2;
                    if (n3 == n17) break block4;
                    n16 = 3;
                    if (n3 != n16) break block5;
                    n3 = n15 + 2;
                    n3 = byArray[n3] & 0xFF;
                    n16 = n3 << 16;
                }
                n3 = n15 + 1;
                n3 = (byArray[n3] & 0xFF) << 8;
                n16 |= n3;
            }
            n8 = (byArray[n15] & 0xFF | n16) * n10;
            n3 = n8 << 15;
            n8 = (n8 >>> 17 | n3) * n14;
            n7 ^= n8;
        }
        n8 = n7 ^ n4;
        n3 = n8 >>> 16;
        n8 = (n8 ^ n3) * -2048144789;
        n3 = n8 >>> 13;
        n8 = (n8 ^ n3) * -1028477387;
        n3 = n8 >>> 16;
        return n8 ^ n3;
    }
}

