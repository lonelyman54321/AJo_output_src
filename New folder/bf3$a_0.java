/*
 * Decompiled with CFR 0.152.
 */
import androidx.media3.common.ParserException;
import androidx.media3.common.d;
import androidx.media3.common.d$a;
import java.math.RoundingMode;

/*
 * Renamed from bF3$a
 */
public final class bf3$a_0
implements bF3$b {
    public static final int[] m;
    public static final int[] n;
    public final gi0_0 a;
    public final wp3 b;
    public final cf3_0 c;
    public final int d;
    public final byte[] e;
    public final Xm2 f;
    public final int g;
    public final d h;
    public int i;
    public long j;
    public int k;
    public long l;

    static {
        int[] nArray;
        int[] nArray2 = nArray = new int[16];
        int[] nArray3 = nArray;
        nArray2[0] = -1;
        nArray3[1] = -1;
        nArray2[2] = -1;
        nArray3[3] = -1;
        nArray2[4] = 2;
        nArray3[5] = 4;
        nArray2[6] = 6;
        nArray3[7] = 8;
        nArray2[8] = -1;
        nArray3[9] = -1;
        nArray2[10] = -1;
        nArray3[11] = -1;
        nArray2[12] = 2;
        nArray3[13] = 4;
        nArray2[14] = 6;
        nArray3[15] = 8;
        m = nArray;
        int[] nArray4 = nArray = new int[89];
        int[] nArray5 = nArray;
        nArray4[0] = 7;
        nArray5[1] = 8;
        nArray4[2] = 9;
        nArray5[3] = 10;
        nArray4[4] = 11;
        nArray5[5] = 12;
        nArray4[6] = 13;
        nArray5[7] = 14;
        nArray4[8] = 16;
        nArray5[9] = 17;
        nArray4[10] = 19;
        nArray5[11] = 21;
        nArray4[12] = 23;
        nArray5[13] = 25;
        nArray4[14] = 28;
        nArray5[15] = 31;
        nArray4[16] = 34;
        nArray5[17] = 37;
        nArray4[18] = 41;
        nArray5[19] = 45;
        nArray4[20] = 50;
        nArray5[21] = 55;
        nArray4[22] = 60;
        nArray5[23] = 66;
        nArray4[24] = 73;
        nArray5[25] = 80;
        nArray4[26] = 88;
        nArray5[27] = 97;
        nArray4[28] = 107;
        nArray5[29] = 118;
        nArray4[30] = 130;
        nArray5[31] = 143;
        nArray4[32] = 157;
        nArray5[33] = 173;
        nArray4[34] = 190;
        nArray5[35] = 209;
        nArray4[36] = 230;
        nArray5[37] = 253;
        nArray4[38] = 279;
        nArray5[39] = 307;
        nArray4[40] = 337;
        nArray5[41] = 371;
        nArray4[42] = 408;
        nArray5[43] = 449;
        nArray4[44] = 494;
        nArray5[45] = 544;
        nArray4[46] = 598;
        nArray5[47] = 658;
        nArray4[48] = 724;
        nArray5[49] = 796;
        nArray4[50] = 876;
        nArray5[51] = 963;
        nArray4[52] = 1060;
        nArray5[53] = 1166;
        nArray4[54] = 1282;
        nArray5[55] = 1411;
        nArray4[56] = 1552;
        nArray5[57] = 1707;
        nArray4[58] = 1878;
        nArray5[59] = 2066;
        nArray4[60] = 2272;
        nArray5[61] = 2499;
        nArray4[62] = 2749;
        nArray5[63] = 3024;
        nArray4[64] = 3327;
        nArray5[65] = 3660;
        nArray4[66] = 4026;
        nArray5[67] = 4428;
        nArray4[68] = 4871;
        nArray5[69] = 5358;
        nArray4[70] = 5894;
        nArray5[71] = 6484;
        nArray4[72] = 7132;
        nArray5[73] = 7845;
        nArray4[74] = 8630;
        nArray5[75] = 9493;
        nArray4[76] = 10442;
        nArray5[77] = 11487;
        nArray4[78] = 12635;
        nArray5[79] = 13899;
        nArray4[80] = 15289;
        nArray5[81] = 16818;
        nArray4[82] = 18500;
        nArray5[83] = 20350;
        nArray4[84] = 22385;
        nArray5[85] = 24623;
        nArray4[86] = 27086;
        nArray5[87] = 29794;
        nArray5[88] = Short.MAX_VALUE;
        n = nArray;
    }

    public bf3$a_0(gi0_0 object, wp3 wp32, cf3_0 object2) {
        int n3;
        this.a = object;
        this.b = wp32;
        this.c = object2;
        int n4 = ((cf3_0)object2).b;
        int n7 = n4 / 10;
        int n8 = 1;
        this.g = n7 = Math.max(n8, n7);
        byte[] byArray = ((cf3_0)object2).e;
        Xm2 xm2 = new Xm2(byArray);
        xm2.p();
        this.d = n3 = xm2.p();
        int n10 = ((cf3_0)object2).a;
        int n14 = n10 * 4;
        int n15 = ((cf3_0)object2).c;
        n14 = (n15 - n14) * 8;
        int n16 = ((cf3_0)object2).d * n10;
        n14 = n14 / n16 + n8;
        if (n3 == n14) {
            n16 = gz3.e(n7, n3);
            Object object3 = new byte[n16 * n15];
            this.e = object3;
            object3 = new Xm2;
            n14 = n3 * 2 * n10 * n16;
            super(n14);
            this.f = object3;
            n15 = n15 * n4 * 8 / n3;
            object2 = new d$a();
            object3 = ip1_0.l("audio/raw");
            ((d$a)object2).n = object3;
            ((d$a)object2).h = n15;
            ((d$a)object2).i = n15;
            ((d$a)object2).o = n7 = n7 * 2 * n10;
            ((d$a)object2).C = n10;
            ((d$a)object2).D = n4;
            ((d$a)object2).E = 2;
            this.h = object = new d((d$a)object2);
            return;
        }
        object = new StringBuilder("Expected frames per block: ");
        ((StringBuilder)object).append(n14);
        ((StringBuilder)object).append("; got: ");
        ((StringBuilder)object).append(n3);
        throw ParserException.a(((StringBuilder)object).toString(), null);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final boolean a(il0_0 var1_1, long var2_2) {
        var4_3 = this;
        var5_4 = var2_2;
        var7_5 = this.k;
        var8_6 = this.c;
        var9_7 = var8_6.a * 2;
        var7_5 /= var9_7;
        var9_7 = this.g;
        var7_5 = var9_7 - var7_5;
        var10_8 = this.d;
        var7_5 = gz3.e(var7_5, var10_8);
        var11_9 = var8_6.c;
        var7_5 *= var11_9;
        var12_10 = 0L;
        cfr_temp_0 = var2_2 - var12_10;
        var14_11 /* !! */  = (long)(cfr_temp_0 == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1));
        if (var14_11 /* !! */  == false) {
            while (true) {
                var15_12 = 1;
                var16_13 = 1.4E-45f;
                break;
            }
        } else {
            var15_12 = 0;
            var16_13 = 0.0f;
        }
        while (true) {
            var17_14 = var4_3.e;
            if (var15_12 != 0 || (var14_11 /* !! */  = (long)var4_3.i) >= var7_5) break;
            var18_15 = Math.min((long)(var7_5 - var14_11 /* !! */ ), var5_4);
            var20_16 = (int)var18_15;
            var14_11 /* !! */  = var4_3.i;
            if ((var21_17 = var1_1.read(var17_14, (int)var14_11 /* !! */ , var20_16)) == (var14_11 /* !! */  = (long)-1)) ** continue;
            var14_11 /* !! */  = var4_3.i + var21_17;
            var4_3.i = (int)var14_11 /* !! */ ;
        }
        var22_18 = var4_3.i;
        var23_19 = var8_6.c;
        if ((var22_18 /= var23_19) > 0) {
            var7_5 = 0;
            while (true) {
                var24_20 = var4_3.f;
                if (var7_5 >= var22_18) break;
                for (var20_16 = 0; var20_16 < (var25_21 = var8_6.a); ++var20_16) {
                    var26_22 = var24_20.a;
                    var27_23 = var7_5 * var23_19;
                    var28_24 = var20_16 * 4 + var27_23;
                    var27_23 = var25_21 * 4 + var28_24;
                    var29_25 = var23_19 / var25_21 + -4;
                    var30_26 = var28_24 + 1;
                    var31_27 = (var17_14[var30_26] & 255) << 8;
                    var11_9 = (short)(var17_14[var28_24] & 255 | var31_27);
                    var31_27 = var17_14[var28_24 += 2] & 255;
                    var28_24 = var15_12;
                    var32_28 = var16_13;
                    var31_27 = Math.min(var31_27, 88);
                    var33_30 = bf3$a_0.n;
                    var34_31 = var33_30[var31_27];
                    var35_32 = (var7_5 * var10_8 * var25_21 + var20_16) * 2;
                    var26_22[var35_32] = var15_12 = (int)((byte)(var11_9 & 255));
                    var15_12 = var35_32 + 1;
                    var36_33 = var31_27;
                    var26_22[var15_12] = var31_27 = (int)((byte)(var11_9 >> 8));
                    var31_27 = var36_33;
                    var37_34 = var9_7;
                    var16_13 = 0.0f;
                    for (var15_12 = 0; var15_12 < (var9_7 = var29_25 * 2); ++var15_12) {
                        var9_7 = var15_12 / 8;
                        var38_35 = var15_12 / 2 % 4;
                        var9_7 = var9_7 * var25_21 * 4 + var27_23 + var38_35;
                        var9_7 = var17_14[var9_7];
                        var39_36 = var17_14;
                        var21_17 = var9_7 & 255;
                        var40_37 = var15_12 % 2;
                        var9_7 = var40_37 == 0 ? (var9_7 &= 15) : var21_17 >> 4;
                        var21_17 = (var9_7 & 7) * 2;
                        var30_26 = 1;
                        var21_17 = (var21_17 + 1) * var34_31 >> 3;
                        var34_31 = var9_7 & 8;
                        if (var34_31 != 0) {
                            var21_17 = -var21_17;
                        }
                        var11_9 += var21_17;
                        var36_33 = var27_23;
                        var11_9 = gz3.h(var11_9, -32768, 32767);
                        var35_32 = var25_21 * 2 + var35_32;
                        var26_22[var35_32] = var21_17 = (int)((byte)(var11_9 & 255));
                        var21_17 = var35_32 + 1;
                        var26_22[var21_17] = var27_23 = (int)((byte)(var11_9 >> 8));
                        var9_7 = bf3$a_0.m[var9_7];
                        var31_27 += var9_7;
                        var9_7 = 0;
                        var21_17 = 88;
                        var31_27 = gz3.h(var31_27, 0, var21_17);
                        var34_31 = var33_30[var31_27];
                        var27_23 = var36_33;
                        var17_14 = var39_36;
                    }
                    var39_36 = var17_14;
                    var30_26 = 1;
                    var15_12 = var28_24;
                    var16_13 = var32_28;
                    var9_7 = var37_34;
                }
                var37_34 = var9_7;
                var28_24 = var15_12;
                var32_28 = var16_13;
                var39_36 = var17_14;
                var30_26 = 1;
                ++var7_5;
            }
            var37_34 = var9_7;
            var28_24 = var15_12;
            var32_28 = var16_13;
            var10_8 *= var22_18;
            var7_5 = var8_6.a;
            var10_8 = var10_8 * 2 * var7_5;
            var24_20.I(0);
            var24_20.H(var10_8);
            var7_5 = var4_3.i;
            var4_3.i = var7_5 -= (var22_18 *= var23_19);
            var22_18 = var24_20.c;
            var41_38 = var4_3.b;
            var41_38.f(var22_18, var24_20);
            var4_3.k = var23_19 = var4_3.k + var22_18;
            var22_18 = var8_6.a * 2;
            var23_19 /= var22_18;
            var22_18 = var9_7;
            if (var23_19 >= var9_7) {
                var4_3.d(var9_7);
            }
        } else {
            var28_24 = var15_12;
            var32_29 = var16_13;
        }
        if (var28_24 != 0) {
            var22_18 = var4_3.k;
            var23_19 = var8_6.a * 2;
            if ((var22_18 /= var23_19) > 0) {
                var4_3.d(var22_18);
            }
        }
        return (boolean)var28_24;
    }

    public final void b(int n3, long l2) {
        int n4 = this.d;
        long l3 = n3;
        cf3_0 cf3_02 = this.c;
        ef3_1 ef3_12 = new ef3_1(cf3_02, n4, l3, l2);
        this.a.h(ef3_12);
        wp3 wp32 = this.b;
        d d2 = this.h;
        wp32.d(d2);
    }

    public final void c(long l2) {
        this.i = 0;
        this.j = l2;
        this.k = 0;
        this.l = 0L;
    }

    public final void d(int n3) {
        int n4 = n3;
        long l2 = this.j;
        long l3 = this.l;
        cf3_0 cf3_02 = this.c;
        long l4 = cf3_02.b;
        RoundingMode roundingMode = RoundingMode.DOWN;
        l3 = gz3.O(l3, 1000000L, l4, roundingMode);
        long l7 = l2 + l3;
        int n7 = cf3_02.a;
        int n8 = n3 * 2 * n7;
        int n10 = this.k - n8;
        this.b.a(l7, 1, n8, n10, null);
        l3 = this.l;
        long l8 = n3;
        this.l = l3 += l8;
        this.k = n4 = this.k - n8;
    }
}

