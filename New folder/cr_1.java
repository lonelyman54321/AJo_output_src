/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * Renamed from cR
 */
public final class cr_1
extends gr_1 {
    public static final int[] A;
    public static final int[] B;
    public static final int[] C;
    public static final int[] D;
    public static final int[] E;
    public static final int[] F;
    public static final boolean[] G;
    public static final int[] z;
    public final Xm2 h;
    public final int i;
    public final int j;
    public final int k;
    public final long l;
    public final ArrayList m;
    public cR$a n;
    public List o;
    public List p;
    public int q;
    public int r;
    public boolean s;
    public boolean t;
    public byte u;
    public byte v;
    public int w;
    public boolean x;
    public long y;

    static {
        Object[] objectArray;
        int[] nArray;
        int[] nArray2;
        int n3 = 8;
        int[] nArray3 = nArray2 = new int[n3];
        int[] nArray4 = nArray2;
        nArray3[0] = 11;
        nArray4[1] = 1;
        nArray3[2] = 3;
        nArray4[3] = 12;
        nArray3[4] = 14;
        nArray4[5] = 5;
        nArray3[6] = 7;
        nArray4[7] = 9;
        z = nArray2;
        int[] nArray5 = nArray = new int[n3];
        int[] nArray6 = nArray;
        nArray5[0] = 0;
        nArray6[1] = 4;
        nArray5[2] = 8;
        nArray6[3] = 12;
        nArray5[4] = 16;
        nArray6[5] = 20;
        nArray5[6] = 24;
        nArray6[7] = 28;
        A = nArray;
        int[] nArray7 = objectArray = new int[7];
        int[] nArray8 = objectArray;
        nArray7[0] = -1;
        nArray8[1] = -16711936;
        nArray7[2] = -16776961;
        nArray8[3] = -16711681;
        nArray7[4] = -65536;
        nArray8[5] = -256;
        nArray8[6] = -65281;
        B = objectArray;
        int n4 = 32;
        int[] nArray9 = nArray = new int[96];
        int[] nArray10 = nArray;
        nArray9[0] = 32;
        nArray10[1] = 33;
        nArray9[2] = 34;
        nArray10[3] = 35;
        nArray9[4] = 36;
        nArray10[5] = 37;
        nArray9[6] = 38;
        nArray10[7] = 39;
        nArray9[8] = 40;
        nArray10[9] = 41;
        nArray9[10] = 225;
        nArray10[11] = 43;
        nArray9[12] = 44;
        nArray10[13] = 45;
        nArray9[14] = 46;
        nArray10[15] = 47;
        nArray9[16] = 48;
        nArray10[17] = 49;
        nArray9[18] = 50;
        nArray10[19] = 51;
        nArray9[20] = 52;
        nArray10[21] = 53;
        nArray9[22] = 54;
        nArray10[23] = 55;
        nArray9[24] = 56;
        nArray10[25] = 57;
        nArray9[26] = 58;
        nArray10[27] = 59;
        nArray9[28] = 60;
        nArray10[29] = 61;
        nArray9[30] = 62;
        nArray10[31] = 63;
        nArray9[32] = 64;
        nArray10[33] = 65;
        nArray9[34] = 66;
        nArray10[35] = 67;
        nArray9[36] = 68;
        nArray10[37] = 69;
        nArray9[38] = 70;
        nArray10[39] = 71;
        nArray9[40] = 72;
        nArray10[41] = 73;
        nArray9[42] = 74;
        nArray10[43] = 75;
        nArray9[44] = 76;
        nArray10[45] = 77;
        nArray9[46] = 78;
        nArray10[47] = 79;
        nArray9[48] = 80;
        nArray10[49] = 81;
        nArray9[50] = 82;
        nArray10[51] = 83;
        nArray9[52] = 84;
        nArray10[53] = 85;
        nArray9[54] = 86;
        nArray10[55] = 87;
        nArray9[56] = 88;
        nArray10[57] = 89;
        nArray9[58] = 90;
        nArray10[59] = 91;
        nArray9[60] = 233;
        nArray10[61] = 93;
        nArray9[62] = 237;
        nArray10[63] = 243;
        nArray9[64] = 250;
        nArray10[65] = 97;
        nArray9[66] = 98;
        nArray10[67] = 99;
        nArray9[68] = 100;
        nArray10[69] = 101;
        nArray9[70] = 102;
        nArray10[71] = 103;
        nArray9[72] = 104;
        nArray10[73] = 105;
        nArray9[74] = 106;
        nArray10[75] = 107;
        nArray9[76] = 108;
        nArray10[77] = 109;
        nArray9[78] = 110;
        nArray10[79] = 111;
        nArray9[80] = 112;
        nArray10[81] = 113;
        nArray9[82] = 114;
        nArray10[83] = 115;
        nArray9[84] = 116;
        nArray10[85] = 117;
        nArray9[86] = 118;
        nArray10[87] = 119;
        nArray9[88] = 120;
        nArray10[89] = 121;
        nArray9[90] = 122;
        nArray10[91] = 231;
        nArray9[92] = 247;
        nArray10[93] = 209;
        nArray9[94] = 241;
        nArray10[95] = 9632;
        C = nArray;
        int[] nArray11 = nArray = new int[16];
        int[] nArray12 = nArray;
        nArray11[0] = 174;
        nArray12[1] = 176;
        nArray11[2] = 189;
        nArray12[3] = 191;
        nArray11[4] = 8482;
        nArray12[5] = 162;
        nArray11[6] = 163;
        nArray12[7] = 9834;
        nArray11[8] = 224;
        nArray12[9] = 32;
        nArray11[10] = 232;
        nArray12[11] = 226;
        nArray11[12] = 234;
        nArray12[13] = 238;
        nArray11[14] = 244;
        nArray12[15] = 251;
        D = nArray;
        int[] nArray13 = nArray = new int[n4];
        int[] nArray14 = nArray;
        nArray13[0] = 193;
        nArray14[1] = 201;
        nArray13[2] = 211;
        nArray14[3] = 218;
        nArray13[4] = 220;
        nArray14[5] = 252;
        nArray13[6] = 8216;
        nArray14[7] = 161;
        nArray13[8] = 42;
        nArray14[9] = 39;
        nArray13[10] = 8212;
        nArray14[11] = 169;
        nArray13[12] = 8480;
        nArray14[13] = 8226;
        nArray13[14] = 8220;
        nArray14[15] = 8221;
        nArray13[16] = 192;
        nArray14[17] = 194;
        nArray13[18] = 199;
        nArray14[19] = 200;
        nArray13[20] = 202;
        nArray14[21] = 203;
        nArray13[22] = 235;
        nArray14[23] = 206;
        nArray13[24] = 207;
        nArray14[25] = 239;
        nArray13[26] = 212;
        nArray14[27] = 217;
        nArray13[28] = 249;
        nArray14[29] = 219;
        nArray13[30] = 171;
        nArray14[31] = 187;
        E = nArray;
        int[] nArray15 = objectArray = new int[n4];
        int[] nArray16 = objectArray;
        nArray15[0] = 195;
        nArray16[1] = 227;
        nArray15[2] = 205;
        nArray16[3] = 204;
        nArray15[4] = 236;
        nArray16[5] = 210;
        nArray15[6] = 242;
        nArray16[7] = 213;
        nArray15[8] = 245;
        nArray16[9] = 123;
        nArray15[10] = 125;
        nArray16[11] = 92;
        nArray15[12] = 94;
        nArray16[13] = 95;
        nArray15[14] = 124;
        nArray16[15] = 126;
        nArray15[16] = 196;
        nArray16[17] = 228;
        nArray15[18] = 214;
        nArray16[19] = 246;
        nArray15[20] = 223;
        nArray16[21] = 165;
        nArray15[22] = 164;
        nArray16[23] = 9474;
        nArray15[24] = 197;
        nArray16[25] = 229;
        nArray15[26] = 216;
        nArray16[27] = 248;
        nArray15[28] = 9484;
        nArray16[29] = 9488;
        nArray15[30] = 9492;
        nArray16[31] = 9496;
        F = objectArray;
        Object[] objectArray2 = objectArray = (Object[])new boolean[256];
        Object[] objectArray3 = objectArray;
        objectArray2[0] = 0;
        objectArray3[1] = 1;
        objectArray2[2] = 1;
        objectArray3[3] = 0;
        objectArray2[4] = 1;
        objectArray3[5] = 0;
        objectArray2[6] = 0;
        objectArray3[7] = 1;
        objectArray2[8] = 1;
        objectArray3[9] = 0;
        objectArray2[10] = 0;
        objectArray3[11] = 1;
        objectArray2[12] = 0;
        objectArray3[13] = 1;
        objectArray2[14] = 1;
        objectArray3[15] = 0;
        objectArray2[16] = 1;
        objectArray3[17] = 0;
        objectArray2[18] = 0;
        objectArray3[19] = 1;
        objectArray2[20] = 0;
        objectArray3[21] = 1;
        objectArray2[22] = 1;
        objectArray3[23] = 0;
        objectArray2[24] = 0;
        objectArray3[25] = 1;
        objectArray2[26] = 1;
        objectArray3[27] = 0;
        objectArray2[28] = 1;
        objectArray3[29] = 0;
        objectArray2[30] = 0;
        objectArray3[31] = 1;
        objectArray2[32] = 1;
        objectArray3[33] = 0;
        objectArray2[34] = 0;
        objectArray3[35] = 1;
        objectArray2[36] = 0;
        objectArray3[37] = 1;
        objectArray2[38] = 1;
        objectArray3[39] = 0;
        objectArray2[40] = 0;
        objectArray3[41] = 1;
        objectArray2[42] = 1;
        objectArray3[43] = 0;
        objectArray2[44] = 1;
        objectArray3[45] = 0;
        objectArray2[46] = 0;
        objectArray3[47] = 1;
        objectArray2[48] = 0;
        objectArray3[49] = 1;
        objectArray2[50] = 1;
        objectArray3[51] = 0;
        objectArray2[52] = 1;
        objectArray3[53] = 0;
        objectArray2[54] = 0;
        objectArray3[55] = 1;
        objectArray2[56] = 1;
        objectArray3[57] = 0;
        objectArray2[58] = 0;
        objectArray3[59] = 1;
        objectArray2[60] = 0;
        objectArray3[61] = 1;
        objectArray2[62] = 1;
        objectArray3[63] = 0;
        objectArray2[64] = 1;
        objectArray3[65] = 0;
        objectArray2[66] = 0;
        objectArray3[67] = 1;
        objectArray2[68] = 0;
        objectArray3[69] = 1;
        objectArray2[70] = 1;
        objectArray3[71] = 0;
        objectArray2[72] = 0;
        objectArray3[73] = 1;
        objectArray2[74] = 1;
        objectArray3[75] = 0;
        objectArray2[76] = 1;
        objectArray3[77] = 0;
        objectArray2[78] = 0;
        objectArray3[79] = 1;
        objectArray2[80] = 0;
        objectArray3[81] = 1;
        objectArray2[82] = 1;
        objectArray3[83] = 0;
        objectArray2[84] = 1;
        objectArray3[85] = 0;
        objectArray2[86] = 0;
        objectArray3[87] = 1;
        objectArray2[88] = 1;
        objectArray3[89] = 0;
        objectArray2[90] = 0;
        objectArray3[91] = 1;
        objectArray2[92] = 0;
        objectArray3[93] = 1;
        objectArray2[94] = 1;
        objectArray3[95] = 0;
        objectArray2[96] = 0;
        objectArray3[97] = 1;
        objectArray2[98] = 1;
        objectArray3[99] = 0;
        objectArray2[100] = 1;
        objectArray3[101] = 0;
        objectArray2[102] = 0;
        objectArray3[103] = 1;
        objectArray2[104] = 1;
        objectArray3[105] = 0;
        objectArray2[106] = 0;
        objectArray3[107] = 1;
        objectArray2[108] = 0;
        objectArray3[109] = 1;
        objectArray2[110] = 1;
        objectArray3[111] = 0;
        objectArray2[112] = 1;
        objectArray3[113] = 0;
        objectArray2[114] = 0;
        objectArray3[115] = 1;
        objectArray2[116] = 0;
        objectArray3[117] = 1;
        objectArray2[118] = 1;
        objectArray3[119] = 0;
        objectArray2[120] = 0;
        objectArray3[121] = 1;
        objectArray2[122] = 1;
        objectArray3[123] = 0;
        objectArray2[124] = 1;
        objectArray3[125] = 0;
        objectArray2[126] = 0;
        objectArray3[127] = 1;
        objectArray2[128] = 1;
        objectArray3[129] = 0;
        objectArray2[130] = 0;
        objectArray3[131] = 1;
        objectArray2[132] = 0;
        objectArray3[133] = 1;
        objectArray2[134] = 1;
        objectArray3[135] = 0;
        objectArray2[136] = 0;
        objectArray3[137] = 1;
        objectArray2[138] = 1;
        objectArray3[139] = 0;
        objectArray2[140] = 1;
        objectArray3[141] = 0;
        objectArray2[142] = 0;
        objectArray3[143] = 1;
        objectArray2[144] = 0;
        objectArray3[145] = 1;
        objectArray2[146] = 1;
        objectArray3[147] = 0;
        objectArray2[148] = 1;
        objectArray3[149] = 0;
        objectArray2[150] = 0;
        objectArray3[151] = 1;
        objectArray2[152] = 1;
        objectArray3[153] = 0;
        objectArray2[154] = 0;
        objectArray3[155] = 1;
        objectArray2[156] = 0;
        objectArray3[157] = 1;
        objectArray2[158] = 1;
        objectArray3[159] = 0;
        objectArray2[160] = 0;
        objectArray3[161] = 1;
        objectArray2[162] = 1;
        objectArray3[163] = 0;
        objectArray2[164] = 1;
        objectArray3[165] = 0;
        objectArray2[166] = 0;
        objectArray3[167] = 1;
        objectArray2[168] = 1;
        objectArray3[169] = 0;
        objectArray2[170] = 0;
        objectArray3[171] = 1;
        objectArray2[172] = 0;
        objectArray3[173] = 1;
        objectArray2[174] = 1;
        objectArray3[175] = 0;
        objectArray2[176] = 1;
        objectArray3[177] = 0;
        objectArray2[178] = 0;
        objectArray3[179] = 1;
        objectArray2[180] = 0;
        objectArray3[181] = 1;
        objectArray2[182] = 1;
        objectArray3[183] = 0;
        objectArray2[184] = 0;
        objectArray3[185] = 1;
        objectArray2[186] = 1;
        objectArray3[187] = 0;
        objectArray2[188] = 1;
        objectArray3[189] = 0;
        objectArray2[190] = 0;
        objectArray3[191] = 1;
        objectArray2[192] = 0;
        objectArray3[193] = 1;
        objectArray2[194] = 1;
        objectArray3[195] = 0;
        objectArray2[196] = 1;
        objectArray3[197] = 0;
        objectArray2[198] = 0;
        objectArray3[199] = 1;
        objectArray2[200] = 1;
        objectArray3[201] = 0;
        objectArray2[202] = 0;
        objectArray3[203] = 1;
        objectArray2[204] = 0;
        objectArray3[205] = 1;
        objectArray2[206] = 1;
        objectArray3[207] = 0;
        objectArray2[208] = 1;
        objectArray3[209] = 0;
        objectArray2[210] = 0;
        objectArray3[211] = 1;
        objectArray2[212] = 0;
        objectArray3[213] = 1;
        objectArray2[214] = 1;
        objectArray3[215] = 0;
        objectArray2[216] = 0;
        objectArray3[217] = 1;
        objectArray2[218] = 1;
        objectArray3[219] = 0;
        objectArray2[220] = 1;
        objectArray3[221] = 0;
        objectArray2[222] = 0;
        objectArray3[223] = 1;
        objectArray2[224] = 1;
        objectArray3[225] = 0;
        objectArray2[226] = 0;
        objectArray3[227] = 1;
        objectArray2[228] = 0;
        objectArray3[229] = 1;
        objectArray2[230] = 1;
        objectArray3[231] = 0;
        objectArray2[232] = 0;
        objectArray3[233] = 1;
        objectArray2[234] = 1;
        objectArray3[235] = 0;
        objectArray2[236] = 1;
        objectArray3[237] = 0;
        objectArray2[238] = 0;
        objectArray3[239] = 1;
        objectArray2[240] = 0;
        objectArray3[241] = 1;
        objectArray2[242] = 1;
        objectArray3[243] = 0;
        objectArray2[244] = 1;
        objectArray3[245] = 0;
        objectArray2[246] = 0;
        objectArray3[247] = 1;
        objectArray2[248] = 1;
        objectArray3[249] = 0;
        objectArray2[250] = 0;
        objectArray3[251] = 1;
        objectArray2[252] = 0;
        objectArray3[253] = 1;
        objectArray2[254] = 1;
        objectArray3[255] = 0;
        G = (boolean[])objectArray;
    }

    /*
     * WARNING - void declaration
     */
    public cr_1(String string2, int n3) {
        void var7_9;
        long l2;
        Object object = new Xm2();
        this.h = object;
        object = new ArrayList();
        this.m = object;
        int n4 = 4;
        this.n = object = new cR$a(0, n4);
        this.w = 0;
        this.l = l2 = 16000000L;
        object = "application/x-mp4-cea-608";
        boolean n7 = ((String)object).equals(string2);
        int n8 = 3;
        int n10 = 2;
        if (n7) {
            int n14 = 2;
        } else {
            int n15 = 3;
        }
        this.i = var7_9;
        int n16 = 1;
        if (n3 != n16) {
            if (n3 != n10) {
                if (n3 != n8) {
                    if (n3 != n4) {
                        String string3 = "Invalid channel. Defaulting to CC1.";
                        Cx.f(string3);
                        this.k = 0;
                        this.j = 0;
                    } else {
                        this.k = n16;
                        this.j = n16;
                    }
                } else {
                    this.k = 0;
                    this.j = n16;
                }
            } else {
                this.k = n16;
                this.j = 0;
            }
        } else {
            this.k = 0;
            this.j = 0;
        }
        this.m(0);
        this.l();
        this.x = n16;
        this.y = -9223372036854775807L;
    }

    public final void flush() {
        int n3;
        super.flush();
        this.o = null;
        this.p = null;
        this.m(0);
        this.r = n3 = 4;
        this.n.h = n3;
        this.l();
        this.s = false;
        this.t = false;
        this.u = 0;
        this.v = 0;
        this.w = 0;
        this.x = true;
        this.y = -9223372036854775807L;
    }

    public final hr_1 g() {
        List list;
        this.p = list = this.o;
        list.getClass();
        hr_1 hr_12 = new hr_1(list);
        return hr_12;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final void h(gR$a var1_1) {
        block41: {
            block44: {
                block50: {
                    block51: {
                        block49: {
                            block48: {
                                block47: {
                                    block46: {
                                        block45: {
                                            var1_1 = var1_1.d;
                                            var1_1.getClass();
                                            var2_2 = var1_1.array();
                                            var3_3 = var1_1.limit();
                                            var4_4 = this.h;
                                            var4_4.G(var3_3, (byte[])var2_2);
                                            var3_3 = 0;
                                            var1_1 = null;
                                            var5_5 = 0;
                                            var2_2 = null;
                                            block18: while (true) {
                                                block43: {
                                                    block42: {
                                                        var6_6 = var4_4.a();
                                                        var7_7 = 3;
                                                        var8_8 = 1;
                                                        var9_9 = this.i;
                                                        if (var6_6 < var9_9) break block41;
                                                        var6_6 = 2;
                                                        var9_9 = var9_9 == var6_6 ? -4 : var4_4.w();
                                                        var10_10 = var4_4.w();
                                                        var11_11 = var4_4.w();
                                                        var12_12 = var9_9 & 2;
                                                        if (var12_12 != 0 || (var12_12 = var9_9 & 1) != (var13_13 = this.j)) continue;
                                                        var12_12 = (byte)(var10_10 & 127);
                                                        var13_13 = (byte)(var11_11 & 127);
                                                        if (var12_12 == 0 && var13_13 == 0) continue;
                                                        var14_14 = this.s;
                                                        var15_15 = 4;
                                                        if ((var9_9 &= 4) == var15_15 && (var10_10 = (var16_16 = cr_1.G)[var10_10]) != 0 && (var9_9 = var16_16[var11_11]) != 0) {
                                                            var9_9 = 1;
                                                        } else {
                                                            var9_9 = 0;
                                                            var16_16 = null;
                                                        }
                                                        this.s = var9_9;
                                                        var10_10 = 16;
                                                        if (var9_9 != 0 && (var11_11 = var12_12 & 240) == var10_10) {
                                                            var11_11 = (int)this.t;
                                                            if (var11_11 != 0 && (var11_11 = (int)this.u) == var12_12 && (var11_11 = (int)this.v) == var13_13) {
                                                                this.t = false;
                                                                continue;
                                                            }
                                                            this.t = var8_8;
                                                            this.u = (byte)var12_12;
                                                            this.v = (byte)var13_13;
                                                        } else {
                                                            this.t = false;
                                                        }
                                                        if (var9_9 == 0) {
                                                            if (var14_14 == 0) continue;
                                                            this.l();
lbl49:
                                                            // 23 sources

                                                            while (true) {
                                                                var5_5 = 1;
                                                                continue block18;
                                                                break;
                                                            }
                                                        }
                                                        var9_9 = 32;
                                                        var11_11 = 20;
                                                        if (var8_8 > var12_12 || var12_12 > (var14_14 = 15)) break block42;
                                                        this.x = false;
                                                        break block43;
                                                    }
                                                    var14_14 = var12_12 & 246;
                                                    if (var14_14 != var11_11) break block43;
                                                    if (var13_13 == var9_9 || var13_13 == (var14_14 = 47)) ** GOTO lbl-1000
                                                    block0 : switch (var13_13) {
                                                        default: {
                                                            switch (var13_13) {
                                                                default: {
                                                                    break block0;
                                                                }
                                                                case 42: 
                                                                case 43: {
                                                                    this.x = false;
                                                                    break block0;
                                                                }
                                                                case 41: 
                                                            }
                                                        }
                                                        case 37: 
                                                        case 38: 
                                                        case 39: lbl-1000:
                                                        // 2 sources

                                                        {
                                                            this.x = var8_8;
                                                        }
                                                    }
                                                }
                                                if ((var14_14 = (int)this.x) == 0) continue;
                                                var14_14 = var12_12 & 224;
                                                if (var14_14 == 0) {
                                                    this.w = var17_17 = var12_12 >> 3 & var8_8;
                                                }
                                                if ((var17_17 = this.w) == (var18_18 = this.k)) break;
                                            }
                                            if (var14_14 != 0) break block44;
                                            var5_5 = var12_12 & 247;
                                            var14_14 = 17;
                                            if (var5_5 != var14_14 || (var17_17 = var13_13 & 240) != (var18_18 = 48)) break block45;
                                            var2_2 = this.n;
                                            var6_6 = var13_13 & 15;
                                            var19_19 = cr_1.D;
                                            var6_6 = (char)var19_19[var6_6];
                                            var2_2.a((char)var6_6);
                                            ** GOTO lbl49
                                        }
                                        var17_17 = var12_12 & 246;
                                        var18_18 = 18;
                                        if (var17_17 != var18_18 || (var18_18 = var13_13 & 224) != var9_9) break block46;
                                        this.n.b();
                                        var2_2 = this.n;
                                        var6_6 = var12_12 & 1;
                                        if (var6_6 == 0) {
                                            var6_6 = var13_13 & 31;
                                            var19_19 = cr_1.E;
                                            var6_6 = var19_19[var6_6];
lbl100:
                                            // 2 sources

                                            while (true) {
                                                continue;
                                                break;
                                            }
                                        }
                                        var6_6 = var13_13 & 31;
                                        var19_19 = cr_1.F;
                                        var6_6 = var19_19[var6_6];
                                        ** while (true)
                                        var6_6 = (char)var6_6;
                                        var2_2.a((char)var6_6);
                                        ** GOTO lbl49
                                    }
                                    if (var5_5 != var14_14 || (var14_14 = var13_13 & 240) != var9_9) break block47;
                                    var2_2 = this.n;
                                    var2_2.a((char)var9_9);
                                    var5_5 = var13_13 & 1;
                                    if (var5_5 == var8_8) {
                                        var5_5 = 1;
                                    } else {
                                        var5_5 = 0;
                                        var2_2 = null;
                                    }
                                    var6_6 = var13_13 >> 1 & 7;
                                    var19_19 = this.n;
                                    var16_16 = var19_19.a;
                                    var19_19 = var19_19.c;
                                    var7_7 = var19_19.length();
                                    var20_20 = new cR$a$a(var6_6, (boolean)var5_5, var7_7);
                                    var16_16.add(var20_20);
                                    ** GOTO lbl49
                                }
                                var14_14 = var12_12 & 240;
                                if (var14_14 != var10_10 || (var14_14 = var13_13 & 192) != (var18_18 = 64)) break block48;
                                var2_2 = cr_1.z;
                                var6_6 = var12_12 & 7;
                                var5_5 = (int)var2_2[var6_6];
                                var6_6 = var13_13 & 32;
                                if (var6_6 != 0) {
                                    var5_5 += 1;
                                }
                                var21_21 = this.n;
                                var7_7 = var21_21.d;
                                if (var5_5 != var7_7) {
                                    var7_7 = this.q;
                                    if (var7_7 != var8_8 && (var6_6 = (int)var21_21.e()) == 0) {
                                        var7_7 = this.q;
                                        var9_9 = this.r;
                                        this.n = var21_21 = new cR$a(var7_7, var9_9);
                                        var19_19 = this.m;
                                        var19_19.add(var21_21);
                                    }
                                    var21_21 = this.n;
                                    var21_21.d = var5_5;
                                }
                                if ((var5_5 = var13_13 & 16) == var10_10) {
                                    var5_5 = true;
                                } else {
                                    var5_5 = false;
                                    var2_2 = null;
                                }
                                var6_6 = var13_13 & 1;
                                if (var6_6 == var8_8) {
                                    var6_6 = 1;
                                } else {
                                    var6_6 = 0;
                                    var21_21 = null;
                                }
                                var7_7 = var13_13 >> 1 & 7;
                                var16_16 = this.n;
                                var10_10 = var5_5 != 0 ? 8 : var7_7;
                                var22_22 = var16_16.a;
                                var16_16 = var16_16.c;
                                var9_9 = var16_16.length();
                                var23_23 = new cR$a$a(var10_10, (boolean)var6_6, var9_9);
                                var22_22.add(var23_23);
                                if (var5_5 != 0) {
                                    var2_2 = this.n;
                                    var21_21 = cr_1.A;
                                    var6_6 = var21_21[var7_7];
                                    var2_2.e = var6_6;
                                }
                                ** GOTO lbl49
                            }
                            var10_10 = 23;
                            var12_12 = 33;
                            if (var5_5 != var10_10 || var13_13 < var12_12 || var13_13 > (var5_5 = 35)) break block49;
                            var2_2 = this.n;
                            var2_2.f = var13_13 += -32;
                            ** GOTO lbl49
                        }
                        if (var17_17 != var11_11 || (var5_5 = var13_13 & 240) != var9_9) ** GOTO lbl49
                        if (var13_13 == var9_9) break block50;
                        var5_5 = 41 != 0;
                        if (var13_13 == var5_5) break block51;
                        switch (var13_13) {
                            default: {
                                var5_5 = (int)this.q;
                                if (var5_5 == false) ** GOTO lbl49
                                if (var13_13 == var12_12) ** GOTO lbl227
                                switch (var13_13) {
                                    default: {
                                        ** GOTO lbl49
                                    }
                                    case 47: {
                                        this.o = var2_2 = this.k();
                                        this.l();
                                        ** GOTO lbl49
                                    }
                                    case 46: {
                                        this.l();
                                        ** GOTO lbl49
                                    }
                                    case 45: {
                                        if (var5_5 != var8_8 || (var5_5 = (var2_2 = this.n).e()) != false) ** GOTO lbl49
                                        var2_2 = this.n;
                                        var21_21 = var2_2.b;
                                        var19_19 = var2_2.d();
                                        var21_21.add(var19_19);
                                        var2_2.c.setLength(0);
                                        var19_19 = var2_2.a;
                                        var19_19.clear();
                                        var7_7 = var2_2.h;
                                        var5_5 = var2_2.d;
                                        var5_5 = Math.min(var7_7, var5_5);
                                        while (true) {
                                            if ((var7_7 = var21_21.size()) < var5_5) ** GOTO lbl49
                                            var21_21.remove(0);
                                        }
                                    }
                                    case 44: 
                                }
                                this.o = var2_2 = Collections.emptyList();
                                var5_5 = this.q;
                                if (var5_5 != var8_8 && var5_5 != var7_7) ** GOTO lbl49
                                this.l();
                                ** GOTO lbl49
lbl227:
                                // 1 sources

                                var2_2 = this.n;
                                var2_2.b();
                                ** GOTO lbl49
                            }
                            case 39: {
                                this.m(var8_8);
                                this.r = var15_15;
                                var2_2 = this.n;
                                var2_2.h = var15_15;
                                ** GOTO lbl49
                            }
                            case 38: {
                                this.m(var8_8);
                                this.r = var7_7;
                                var2_2 = this.n;
                                var2_2.h = var7_7;
                                ** GOTO lbl49
                            }
                            case 37: 
                        }
                        this.m(var8_8);
                        this.r = var6_6;
                        var2_2 = this.n;
                        var2_2.h = var6_6;
                        ** GOTO lbl49
                    }
                    this.m(var7_7);
                    ** GOTO lbl49
                }
                this.m(var6_6);
                ** GOTO lbl49
            }
            var2_2 = this.n;
            var6_6 = (var12_12 & 127) - var9_9;
            var19_19 = cr_1.C;
            var6_6 = (char)var19_19[var6_6];
            var2_2.a((char)var6_6);
            var5_5 = var13_13 & 224;
            if (var5_5 == 0) ** GOTO lbl49
            var2_2 = this.n;
            var6_6 = (var13_13 & 127) - var9_9;
            var6_6 = (char)var19_19[var6_6];
            var2_2.a((char)var6_6);
            ** while (true)
        }
        if (var5_5 != 0 && ((var3_3 = this.q) == var8_8 || var3_3 == var7_7)) {
            this.o = var1_1 = this.k();
            this.y = var24_24 = this.e;
        }
    }

    public final Rf3 i() {
        Rf3 rf3;
        long l2;
        long l3;
        long l4;
        long l7;
        long l8;
        lf3_0 lf3_02 = super.i();
        if (lf3_02 != null) {
            return lf3_02;
        }
        long l12 = this.l;
        long l14 = -9223372036854775807L;
        long l15 = l12 - l14;
        Object object = l15 == 0L ? 0 : (l15 < 0L ? -1 : 1);
        if (object != false && (l8 = (l7 = (l4 = this.y) - l14) == 0L ? 0 : (l7 < 0L ? -1 : 1)) != false && (object = (l3 = (l2 = this.e - l4) - l12) == 0L ? 0 : (l3 < 0L ? -1 : 1)) >= 0 && (rf3 = (Rf3)this.b.pollFirst()) != null) {
            long l16;
            List list;
            this.o = list = Collections.emptyList();
            this.y = l14;
            lf3_02 = this.g();
            rf3.b = l16 = this.e;
            rf3.d = lf3_02;
            rf3.e = l16;
            return rf3;
        }
        return null;
    }

    public final boolean j() {
        boolean bl2;
        List list = this.o;
        List list2 = this.p;
        if (list != list2) {
            bl2 = true;
        } else {
            bl2 = false;
            list = null;
        }
        return bl2;
    }

    public final ArrayList k() {
        int n3;
        Object object;
        ArrayList arrayList = this.m;
        int n4 = arrayList.size();
        ArrayList<Object> arrayList2 = new ArrayList<Object>(n4);
        int n7 = 2;
        int n8 = 0;
        ArrayList<Object> arrayList3 = null;
        for (int i3 = 0; i3 < n4; ++i3) {
            object = (cR$a)arrayList.get(i3);
            n3 = -1 << -1;
            object = ((cR$a)object).c(n3);
            arrayList2.add(object);
            if (object == null) continue;
            int n10 = ((Pe0)object).i;
            n7 = Math.min(n7, n10);
        }
        arrayList3 = new ArrayList<Object>(n4);
        while (n8 < n4) {
            object = (Pe0)arrayList2.get(n8);
            if (object != null) {
                n3 = ((Pe0)object).i;
                if (n3 != n7) {
                    object = ((cR$a)arrayList.get(n8)).c(n7);
                    object.getClass();
                }
                arrayList3.add(object);
            }
            ++n8;
        }
        return arrayList3;
    }

    public final void l() {
        int n3;
        Object object = this.n;
        ((cR$a)object).g = n3 = this.q;
        ((cR$a)object).a.clear();
        ((cR$a)object).b.clear();
        ((cR$a)object).c.setLength(0);
        ((cR$a)object).d = 15;
        ((cR$a)object).e = 0;
        ((cR$a)object).f = 0;
        object = this.m;
        ((ArrayList)object).clear();
        cR$a cR$a = this.n;
        ((ArrayList)object).add(cR$a);
    }

    public final void m(int n3) {
        int n4 = this.q;
        if (n4 == n3) {
            return;
        }
        this.q = n3;
        int n7 = 3;
        if (n3 == n7) {
            Object object;
            int n8;
            for (n4 = 0; n4 < (n8 = ((ArrayList)(object = this.m)).size()); ++n4) {
                object = (cR$a)((ArrayList)object).get(n4);
                ((cR$a)object).g = n3;
            }
            return;
        }
        this.l();
        if (n4 == n7 || n3 == (n4 = 1) || n3 == 0) {
            List list;
            this.o = list = Collections.emptyList();
        }
    }

    public final void release() {
    }
}

