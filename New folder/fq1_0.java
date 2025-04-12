/*
 * Decompiled with CFR 0.152.
 */
import androidx.media3.common.ParserException;
import androidx.media3.common.d;
import androidx.media3.common.d$a;
import com.google.common.collect.ImmutableList;
import com.google.common.math.LongMath;

/*
 * Renamed from FQ1
 */
public final class fq1_0
implements qy0_0 {
    public final Xm2 a;
    public final Vm2 b;
    public final Xm2 c;
    public int d = 0;
    public String e;
    public wp3 f;
    public double g;
    public double h;
    public boolean i;
    public boolean j;
    public int k;
    public int l;
    public boolean m;
    public int n;
    public int o;
    public final GQ1$a p;
    public int q;
    public int r;
    public int s;
    public long t;
    public boolean u;

    public fq1_0() {
        double d2;
        boolean bl2;
        byte[] byArray = new byte[15];
        Object object = new Xm2(byArray, 2);
        this.a = object;
        this.b = object = new Vm2();
        this.c = object = new Xm2();
        this.p = object = new Object();
        this.q = -2147483647;
        this.r = -1;
        this.t = -1;
        this.j = bl2 = true;
        this.m = bl2;
        this.g = d2 = -9.223372036854776E18;
        this.h = d2;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final void a(Xm2 var1_1) {
        var2_2 = this;
        var3_3 = var1_1;
        var4_4 = 4;
        var5_5 = 2;
        var6_6 = 8;
        var7_7 = 1;
        var8_8 = this.f;
        ct3.h(var8_8);
        block34: while ((var9_9 = var1_1.a()) > 0) {
            block115: {
                block97: {
                    block110: {
                        block112: {
                            block114: {
                                block95: {
                                    block113: {
                                        block96: {
                                            block111: {
                                                block98: {
                                                    block99: {
                                                        block109: {
                                                            block100: {
                                                                block106: {
                                                                    block104: {
                                                                        block105: {
                                                                            block103: {
                                                                                block101: {
                                                                                    block102: {
                                                                                        var9_9 = var2_2.d;
                                                                                        var10_10 = 3;
                                                                                        if (var9_9 == 0) break block97;
                                                                                        var11_11 = var2_2.p;
                                                                                        var12_12 = 24;
                                                                                        var13_13 = 17;
                                                                                        var14_14 = var2_2.c;
                                                                                        if (var9_9 == var7_7) break block98;
                                                                                        if (var9_9 != var5_5) break block99;
                                                                                        var9_9 = var11_11.a;
                                                                                        if (var9_9 == var7_7 || var9_9 == var13_13) {
                                                                                            var9_9 = var3_3.b;
                                                                                            var15_15 = var1_1.a();
                                                                                            var16_16 = var14_14.a();
                                                                                            var16_16 = Math.min(var15_15, var16_16);
                                                                                            var17_17 /* !! */  = var14_14.a;
                                                                                            var13_13 = var14_14.b;
                                                                                            var3_3.g(var13_13, var17_17 /* !! */ , var16_16);
                                                                                            var14_14.J(var16_16);
                                                                                            var3_3.I(var9_9);
                                                                                        }
                                                                                        var9_9 = var1_1.a();
                                                                                        var16_16 = var11_11.c;
                                                                                        var13_13 = var2_2.n;
                                                                                        var9_9 = Math.min(var9_9, var16_16 -= var13_13);
                                                                                        var18_18 = var2_2.f;
                                                                                        var18_18.f(var9_9, (Xm2)var3_3);
                                                                                        var2_2.n = var16_16 = var2_2.n + var9_9;
                                                                                        var9_9 = var11_11.c;
                                                                                        if (var16_16 != var9_9) continue;
                                                                                        var9_9 = var11_11.a;
                                                                                        if (var9_9 != var7_7) break block100;
                                                                                        var19_19 = var14_14.a;
                                                                                        var20_20 = var19_19.length;
                                                                                        var8_8 = new Vm2(var19_19, var20_20);
                                                                                        var13_13 = var8_8.g(var6_6);
                                                                                        var20_20 = 5;
                                                                                        var15_15 = var8_8.g(var20_20);
                                                                                        if (var15_15 == (var21_21 = 31)) {
                                                                                            var21_21 = var8_8.g(var12_12);
                                                                                        } else {
                                                                                            switch (var15_15) {
                                                                                                default: {
                                                                                                    var3_3 = new StringBuilder("Unsupported sampling rate index ");
                                                                                                    var3_3.append(var15_15);
                                                                                                    throw ParserException.b(var3_3.toString());
                                                                                                }
                                                                                                case 27: {
                                                                                                    var21_21 = 9600;
                                                                                                    break;
                                                                                                }
                                                                                                case 26: {
                                                                                                    var21_21 = 12800;
                                                                                                    break;
                                                                                                }
                                                                                                case 25: {
                                                                                                    var21_21 = 14400;
                                                                                                    break;
                                                                                                }
                                                                                                case 24: {
                                                                                                    var21_21 = 17075;
                                                                                                    break;
                                                                                                }
                                                                                                case 23: {
                                                                                                    var21_21 = 19200;
                                                                                                    break;
                                                                                                }
                                                                                                case 22: {
                                                                                                    var21_21 = 20000;
                                                                                                    break;
                                                                                                }
                                                                                                case 21: {
                                                                                                    var21_21 = 25600;
                                                                                                    break;
                                                                                                }
                                                                                                case 20: {
                                                                                                    var21_21 = 28800;
                                                                                                    break;
                                                                                                }
                                                                                                case 19: {
                                                                                                    var21_21 = 34150;
                                                                                                    break;
                                                                                                }
                                                                                                case 18: {
                                                                                                    var21_21 = 38400;
                                                                                                    break;
                                                                                                }
                                                                                                case 17: {
                                                                                                    var21_21 = 40000;
                                                                                                    break;
                                                                                                }
                                                                                                case 16: {
                                                                                                    var21_21 = 51200;
                                                                                                    break;
                                                                                                }
                                                                                                case 15: {
                                                                                                    var21_21 = 57600;
                                                                                                    break;
                                                                                                }
                                                                                                case 12: {
                                                                                                    var21_21 = 7350;
                                                                                                    break;
                                                                                                }
                                                                                                case 11: {
                                                                                                    var21_21 = 8000;
                                                                                                    break;
                                                                                                }
                                                                                                case 10: {
                                                                                                    var21_21 = 11025;
                                                                                                    break;
                                                                                                }
                                                                                                case 9: {
                                                                                                    var21_21 = 12000;
                                                                                                    break;
                                                                                                }
                                                                                                case 8: {
                                                                                                    var21_21 = 16000;
                                                                                                    break;
                                                                                                }
                                                                                                case 7: {
                                                                                                    var21_21 = 22050;
                                                                                                    break;
                                                                                                }
                                                                                                case 6: {
                                                                                                    var21_21 = 24000;
                                                                                                    break;
                                                                                                }
                                                                                                case 5: {
                                                                                                    var21_21 = 32000;
                                                                                                    break;
                                                                                                }
                                                                                                case 4: {
                                                                                                    var21_21 = 44100;
                                                                                                    break;
                                                                                                }
                                                                                                case 3: {
                                                                                                    var21_21 = 48000;
                                                                                                    break;
                                                                                                }
                                                                                                case 2: {
                                                                                                    var21_21 = 64000;
                                                                                                    break;
                                                                                                }
                                                                                                case 1: {
                                                                                                    var21_21 = 88200;
                                                                                                    break;
                                                                                                }
                                                                                                case 0: {
                                                                                                    var21_21 = 96000;
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        var12_12 = var8_8.g(var10_10);
                                                                                        var17_17 /* !! */  = (byte[])"Unsupported coreSbrFrameLengthIndex ";
                                                                                        if (var12_12 == 0) break block101;
                                                                                        if (var12_12 == var7_7) break block102;
                                                                                        if (var12_12 == var5_5 || var12_12 == var10_10) ** GOTO lbl145
                                                                                        if (var12_12 == var4_4) {
                                                                                            var22_22 = 4096;
                                                                                        } else {
                                                                                            var3_3 = new StringBuilder((String)var17_17 /* !! */ );
                                                                                            var3_3.append(var12_12);
                                                                                            throw ParserException.b(var3_3.toString());
lbl145:
                                                                                            // 1 sources

                                                                                            var22_22 = 2048;
                                                                                        }
                                                                                        break block103;
                                                                                    }
                                                                                    var22_22 = 1024;
                                                                                    break block103;
                                                                                }
                                                                                var22_22 = 768;
                                                                            }
                                                                            if (var12_12 == 0 || var12_12 == var7_7) break block104;
                                                                            if (var12_12 == var5_5) break block105;
                                                                            if (var12_12 == var10_10) ** GOTO lbl163
                                                                            if (var12_12 == var4_4) {
                                                                                var12_12 = 1;
                                                                            } else {
                                                                                var3_3 = new StringBuilder((String)var17_17 /* !! */ );
                                                                                var3_3.append(var12_12);
                                                                                throw ParserException.b(var3_3.toString());
lbl163:
                                                                                // 1 sources

                                                                                var12_12 = 3;
                                                                            }
                                                                            break block106;
                                                                        }
                                                                        var12_12 = 2;
                                                                        break block106;
                                                                    }
                                                                    var12_12 = 0;
                                                                }
                                                                var8_8.o(var5_5);
                                                                GQ1.c((Vm2)var8_8);
                                                                var15_15 = var8_8.g(var20_20);
                                                                var16_16 = 0;
                                                                var18_18 = null;
                                                                var23_23 = 0;
                                                                while (true) {
                                                                    var24_24 = var15_15 + 1;
                                                                    var4_4 = 16;
                                                                    if (var16_16 >= var24_24) break;
                                                                    var24_24 = var8_8.g(var10_10);
                                                                    var4_4 = GQ1.a((Vm2)var8_8, var20_20, var6_6, var4_4) + var7_7;
                                                                    var23_23 = var4_4 + var23_23;
                                                                    if ((var24_24 == 0 || var24_24 == var5_5) && (var4_4 = (int)var8_8.f()) != 0) {
                                                                        GQ1.c((Vm2)var8_8);
                                                                    }
                                                                    var16_16 += var7_7;
                                                                    var4_4 = 4;
                                                                }
                                                                var16_16 = GQ1.a((Vm2)var8_8, 4, var6_6, var4_4) + var7_7;
                                                                var8_8.n();
                                                                var24_24 = 0;
                                                                var25_25 = null;
                                                                while (true) {
                                                                    block107: {
                                                                        block108: {
                                                                            var26_26 = 0x4000000000000000L;
                                                                            var28_27 = 2.0;
                                                                            if (var24_24 >= var16_16) break;
                                                                            var15_15 = var8_8.g(var5_5);
                                                                            if (var15_15 == 0) break block107;
                                                                            if (var15_15 == var7_7) break block108;
                                                                            if (var15_15 != var10_10) lbl-1000:
                                                                            // 6 sources

                                                                            {
                                                                                while (true) {
                                                                                    continue;
                                                                                    break;
                                                                                }
                                                                            }
                                                                            var15_15 = 4;
                                                                            GQ1.a((Vm2)var8_8, var15_15, var6_6, var4_4);
                                                                            var30_28 = GQ1.a((Vm2)var8_8, var15_15, var6_6, var4_4);
                                                                            var15_15 = (int)var8_8.f();
                                                                            if (var15_15 != 0) {
                                                                                var15_15 = 0;
                                                                                var17_17 /* !! */  = null;
                                                                                GQ1.a((Vm2)var8_8, var6_6, var4_4, 0);
                                                                            }
                                                                            var8_8.n();
                                                                            if (var30_28 > 0) {
                                                                                var15_15 = var30_28 * 8;
                                                                                var8_8.o(var15_15);
                                                                            }
                                                                            ** GOTO lbl-1000
                                                                        }
                                                                        var8_8.o(var10_10);
                                                                        var15_15 = (int)var8_8.f();
                                                                        if (var15_15 != 0) {
                                                                            var4_4 = 13;
                                                                            var8_8.o(var4_4);
                                                                        }
                                                                        if (var15_15 != 0) {
                                                                            var8_8.n();
                                                                        }
                                                                        if (var12_12 > 0) {
                                                                            GQ1.b((Vm2)var8_8);
                                                                            var4_4 = var8_8.g(var5_5);
                                                                        } else {
                                                                            var4_4 = 0;
                                                                            var31_29 = null;
                                                                        }
                                                                        if (var4_4 > 0) {
                                                                            var15_15 = 6;
                                                                            var8_8.o(var15_15);
                                                                            var6_6 = var8_8.g(var5_5);
                                                                            var8_8.o(4);
                                                                            var7_7 = (int)var8_8.f();
                                                                            if (var7_7 != 0) {
                                                                                var8_8.o(var20_20);
                                                                            }
                                                                            if (var4_4 == var5_5 || var4_4 == var10_10) {
                                                                                var8_8.o(var15_15);
                                                                            }
                                                                            if (var6_6 == var5_5) {
                                                                                var8_8.n();
                                                                            }
                                                                        }
                                                                        var32_30 = Math.log(var23_23 + -1);
                                                                        var28_27 = Math.log(var28_27);
                                                                        var32_30 = Math.floor(var32_30 / var28_27);
                                                                        var6_6 = (int)var32_30 + 1;
                                                                        var4_4 = var8_8.g(var5_5);
                                                                        if (var4_4 > 0 && (var7_7 = (int)var8_8.f()) != 0) {
                                                                            var8_8.o(var6_6);
                                                                        }
                                                                        if ((var7_7 = (int)var8_8.f()) != 0) {
                                                                            var8_8.o(var6_6);
                                                                        }
                                                                        if (var12_12 != 0 || var4_4 != 0) ** GOTO lbl-1000
                                                                        var8_8.n();
                                                                        ** GOTO lbl-1000
                                                                    }
                                                                    var8_8.o(var10_10);
                                                                    var4_4 = (int)var8_8.f();
                                                                    if (var4_4 != 0) {
                                                                        var4_4 = 13;
                                                                        var8_8.o(var4_4);
                                                                    }
                                                                    if (var12_12 <= 0) ** GOTO lbl-1000
                                                                    GQ1.b((Vm2)var8_8);
                                                                    ** continue;
                                                                    var4_4 = 1;
                                                                    var24_24 += var4_4;
                                                                    var4_4 = 16;
                                                                    var6_6 = 8;
                                                                    var7_7 = 1;
                                                                }
                                                                var4_4 = 1;
                                                                var24_24 = (int)var8_8.f();
                                                                if (var24_24 != 0) {
                                                                    var24_24 = 8;
                                                                    var6_6 = 4;
                                                                    var7_7 = GQ1.a((Vm2)var8_8, var5_5, var6_6, var24_24) + var4_4;
                                                                    var16_16 = 0;
                                                                    var18_18 = null;
                                                                    for (var10_10 = 0; var10_10 < var7_7; var10_10 += var4_4) {
                                                                        var12_12 = 16;
                                                                        var20_20 = GQ1.a((Vm2)var8_8, var6_6, var24_24, var12_12);
                                                                        var15_15 = GQ1.a((Vm2)var8_8, var6_6, var24_24, var12_12);
                                                                        var12_12 = 7;
                                                                        if (var20_20 == var12_12) {
                                                                            var16_16 = var8_8.g(var6_6) + var4_4;
                                                                            var8_8.o(var6_6);
                                                                            var34_31 /* !! */  = new byte[var16_16];
                                                                            for (var12_12 = 0; var12_12 < var16_16; var12_12 += var4_4) {
                                                                                var34_31 /* !! */ [var12_12] = var20_20 = (int)((byte)var8_8.g(var24_24));
                                                                            }
                                                                            var18_18 = var34_31 /* !! */ ;
                                                                        } else {
                                                                            var8_8.o(var15_15 *= 8);
                                                                        }
                                                                        var24_24 = 8;
                                                                        var6_6 = 4;
                                                                    }
                                                                } else {
                                                                    var16_16 = 0;
                                                                    var18_18 = null;
                                                                }
                                                                switch (var21_21) {
                                                                    default: {
                                                                        var3_3 = new StringBuilder("Unsupported sampling rate ");
                                                                        var3_3.append(var21_21);
                                                                        throw ParserException.b(var3_3.toString());
                                                                    }
                                                                    case 44100: 
                                                                    case 48000: 
                                                                    case 88200: 
                                                                    case 96000: {
                                                                        var26_26 = 0x3FF0000000000000L;
                                                                        var28_27 = 1.0;
                                                                        break;
                                                                    }
                                                                    case 29400: 
                                                                    case 32000: 
                                                                    case 58800: 
                                                                    case 64000: {
                                                                        var26_26 = 4609434218613702656L;
                                                                        var28_27 = 1.5;
                                                                        break;
                                                                    }
                                                                    case 14700: 
                                                                    case 16000: {
                                                                        var26_26 = 0x4008000000000000L;
                                                                        var28_27 = 3.0;
                                                                    }
                                                                    case 22050: 
                                                                    case 24000: 
                                                                }
                                                                var4_4 = (int)((double)var21_21 * var28_27);
                                                                var24_24 = var22_22;
                                                                var35_32 = (double)var22_22 * var28_27;
                                                                var24_24 = (int)var35_32;
                                                                var2_2.q = var4_4;
                                                                var2_2.r = var24_24;
                                                                var37_33 = var2_2.t;
                                                                var39_34 = var11_11.b;
                                                                var4_4 = (int)(var37_33 == var39_34 ? 0 : (var37_33 < var39_34 ? -1 : 1));
                                                                if (var4_4 != 0) {
                                                                    var2_2.t = var39_34;
                                                                    var31_29 = "mhm1";
                                                                    var24_24 = -1;
                                                                    if (var13_13 != var24_24) {
                                                                        var25_25 = var13_13;
                                                                        var41_35 = new Object[1];
                                                                        var6_6 = 0;
                                                                        var34_31 /* !! */  = null;
                                                                        var41_35[0] = var25_25;
                                                                        var25_25 = String.format(".%02X", var41_35);
                                                                        var31_29 = var31_29.concat((String)var25_25);
                                                                    }
                                                                    if (var18_18 != null && (var24_24 = ((wp3)var18_18).length) > 0) {
                                                                        var25_25 = gz3.f;
                                                                        var18_18 = ImmutableList.of(var25_25, var18_18);
                                                                    } else {
                                                                        var16_16 = 0;
                                                                        var18_18 = null;
                                                                    }
                                                                    var25_25 = new d$a();
                                                                    var34_31 /* !! */  = (byte[])var2_2.e;
                                                                    var25_25.a = var34_31 /* !! */ ;
                                                                    var34_31 /* !! */  = (byte[])ip1_0.l("audio/mhm1");
                                                                    var25_25.n = var34_31 /* !! */ ;
                                                                    var25_25.D = var6_6 = var2_2.q;
                                                                    var25_25.j = var31_29;
                                                                    var25_25.q = var18_18;
                                                                    var31_29 = new d((d$a)var25_25);
                                                                    var25_25 = var2_2.f;
                                                                    var25_25.d((d)var31_29);
                                                                }
                                                                var4_4 = 1;
                                                                var2_2.u = var4_4;
lbl358:
                                                                // 4 sources

                                                                while (true) {
                                                                    continue;
                                                                    break;
                                                                }
                                                            }
                                                            var4_4 = 17;
                                                            if (var9_9 != var4_4) break block109;
                                                            var25_25 = var14_14.a;
                                                            var6_6 = ((Object)var25_25).length;
                                                            var31_29 = new Vm2((byte[])var25_25, var6_6);
                                                            var24_24 = (int)var31_29.f();
                                                            if (var24_24 != 0) {
                                                                var31_29.o(var5_5);
                                                                var24_24 = 13;
                                                                var4_4 = var31_29.g(var24_24);
                                                            } else {
                                                                var4_4 = 0;
                                                                var31_29 = null;
                                                            }
                                                            var2_2.s = var4_4;
                                                            ** GOTO lbl358
                                                        }
                                                        if (var9_9 != var5_5) ** GOTO lbl358
                                                        var4_4 = (int)var2_2.u;
                                                        if (var4_4 != 0) {
                                                            var4_4 = 0;
                                                            var31_29 = null;
                                                            var2_2.j = false;
                                                            var9_9 = 1;
                                                        } else {
                                                            var9_9 = 0;
                                                            var8_8 = null;
                                                        }
                                                        var4_4 = var2_2.r;
                                                        var24_24 = var2_2.s;
                                                        var35_32 = (double)(var4_4 - var24_24) * 1000000.0;
                                                        var42_36 = var2_2.q;
                                                        var35_32 /= var42_36;
                                                        var42_36 = var2_2.g;
                                                        var44_37 = Math.round(var42_36);
                                                        var4_4 = (int)var2_2.i;
                                                        if (var4_4 != 0) {
                                                            var4_4 = 0;
                                                            var31_29 = null;
                                                            var2_2.i = false;
                                                            var2_2.g = var35_32 = var2_2.h;
                                                        } else {
                                                            var2_2.g = var46_38 = var2_2.g + var35_32;
                                                        }
                                                        var25_25 = var2_2.f;
                                                        var4_4 = var2_2.o;
                                                        var16_16 = 0;
                                                        var18_18 = null;
                                                        var10_10 = var4_4;
                                                        var11_11 = null;
                                                        var21_21 = 0;
                                                        var25_25.a(var44_37, var9_9, var4_4, 0, null);
                                                        var4_4 = 0;
                                                        var31_29 = null;
                                                        var2_2.u = false;
                                                        var2_2.s = 0;
                                                        var2_2.o = 0;
                                                        ** continue;
                                                        var4_4 = 1;
                                                        var2_2.d = var4_4;
lbl418:
                                                        // 5 sources

                                                        while (true) {
                                                            var4_4 = 4;
                                                            var6_6 = 8;
lbl421:
                                                            // 2 sources

                                                            while (true) {
                                                                var7_7 = 1;
                                                                continue block34;
                                                                break;
                                                            }
                                                            break;
                                                        }
                                                    }
                                                    var3_3 = new IllegalStateException();
                                                    throw var3_3;
                                                }
                                                var4_4 = var1_1.a();
                                                var25_25 = var2_2.a;
                                                var6_6 = var25_25.a();
                                                var4_4 = Math.min(var4_4, var6_6);
                                                var34_31 /* !! */  = var25_25.a;
                                                var7_7 = var25_25.b;
                                                var3_3.g(var7_7, var34_31 /* !! */ , var4_4);
                                                var25_25.J(var4_4);
                                                var4_4 = var25_25.a();
                                                if (var4_4 != 0) break block110;
                                                var4_4 = var25_25.c;
                                                var34_31 /* !! */  = var25_25.a;
                                                var41_35 = var2_2.b;
                                                var41_35.k(var4_4, var34_31 /* !! */ );
                                                var41_35.d();
                                                var6_6 = 8;
                                                var11_11.a = var9_9 = GQ1.a((Vm2)var41_35, var10_10, var6_6, var6_6);
                                                var10_10 = -1;
                                                if (var9_9 == var10_10) lbl-1000:
                                                // 3 sources

                                                {
                                                    while (true) {
                                                        var6_6 = 0;
                                                        var34_31 /* !! */  = null;
                                                        break block95;
                                                        break;
                                                    }
                                                }
                                                var9_9 = Math.max(var5_5, var6_6);
                                                var6_6 = 32;
                                                if ((var9_9 = Math.max(var9_9, var6_6)) <= (var10_10 = 63)) {
                                                    var9_9 = 1;
                                                } else {
                                                    var9_9 = 0;
                                                    var8_8 = null;
                                                }
                                                ct3.a((boolean)var9_9);
                                                var48_39 = 3;
                                                var50_40 = LongMath.checkedAdd(var48_39, 255L);
                                                var52_41 = 0x100000000L;
                                                var46_38 = 2.121995791E-314;
                                                LongMath.checkedAdd(var50_40, var52_41);
                                                var21_21 = var41_35.b();
                                                var54_42 = -1;
                                                if (var21_21 < var5_5) lbl-1000:
                                                // 3 sources

                                                {
                                                    while (true) {
                                                        var48_39 = var54_42;
                                                        break block96;
                                                        break;
                                                    }
                                                }
                                                var26_26 = var41_35.i(var5_5);
                                                cfr_temp_0 = var26_26 - var48_39;
                                                var21_21 = (int)(cfr_temp_0 == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1));
                                                if (var21_21 != 0) break block111;
                                                var9_9 = var41_35.b();
                                                if (var9_9 < (var10_10 = 8)) ** GOTO lbl-1000
                                                var56_43 = var41_35.i(var10_10);
                                                var26_26 += var56_43;
                                                var48_39 = 255L;
                                                cfr_temp_1 = var56_43 - var48_39;
                                                var21_21 = (int)(cfr_temp_1 == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1));
                                                if (var21_21 == 0) {
                                                    var9_9 = var41_35.b();
                                                    if (var9_9 >= var6_6) ** break;
                                                    ** continue;
                                                    var48_39 = var41_35.i(var6_6);
                                                    var26_26 = var48_39 + var26_26;
                                                }
                                            }
                                            var48_39 = var26_26;
                                        }
                                        var11_11.b = var48_39;
                                        var6_6 = (int)(var48_39 == var54_42 ? 0 : (var48_39 < var54_42 ? -1 : 1));
                                        if (var6_6 == 0) ** GOTO lbl-1000
                                        var52_41 = 16;
                                        var46_38 = 7.9E-323;
                                        var6_6 = (int)(var48_39 == var52_41 ? 0 : (var48_39 < var52_41 ? -1 : 1));
                                        if (var6_6 > 0) break block112;
                                        var52_41 = 0L;
                                        var46_38 = 0.0;
                                        var6_6 = (int)(var48_39 == var52_41 ? 0 : (var48_39 < var52_41 ? -1 : 1));
                                        if (var6_6 != 0) break block113;
                                        var6_6 = var11_11.a;
                                        var9_9 = 1;
                                        if (var6_6 == var9_9) ** GOTO lbl512
                                        if (var6_6 != var5_5) {
                                            var9_9 = 17;
                                            if (var6_6 == var9_9) {
                                                throw ParserException.a("AudioTruncation packet with invalid packet label 0", null);
                                            }
                                        } else {
                                            throw ParserException.a("Mpegh3daFrame packet with invalid packet label 0", null);
lbl512:
                                            // 1 sources

                                            throw ParserException.a("Mpegh3daConfig packet with invalid packet label 0", null);
                                        }
                                    }
                                    var9_9 = 24;
                                    var11_11.c = var6_6 = GQ1.a((Vm2)var41_35, 11, var9_9, var9_9);
                                    var7_7 = -1;
                                    if (var6_6 != var7_7) ** break;
                                    ** continue;
                                    var6_6 = 1;
                                }
                                var7_7 = 0;
                                var41_35 = null;
                                if (var6_6 != 0) {
                                    var2_2.n = 0;
                                    var9_9 = var2_2.o;
                                    var2_2.o = var10_10 = var11_11.c + var4_4 + var9_9;
                                }
                                if (var6_6 == 0) break block114;
                                var25_25.I(0);
                                var31_29 = var2_2.f;
                                var6_6 = var25_25.c;
                                var31_29.f(var6_6, (Xm2)var25_25);
                                var25_25.F(var5_5);
                                var4_4 = var11_11.c;
                                var14_14.F(var4_4);
                                var4_4 = 1;
                                var2_2.m = var4_4;
                                var2_2.d = var5_5;
                                ** GOTO lbl418
                            }
                            var4_4 = 1;
                            var6_6 = var25_25.c;
                            var7_7 = 15;
                            if (var6_6 >= var7_7) ** GOTO lbl418
                            var25_25.H(var6_6 += var4_4);
                            var4_4 = 0;
                            var31_29 = null;
                            var2_2.m = false;
                            ** GOTO lbl418
                        }
                        var3_3 = new StringBuilder("Contains sub-stream with an invalid packet label ");
                        var58_44 = var11_11.b;
                        var3_3.append(var58_44);
                        throw ParserException.b(var3_3.toString());
                    }
                    var4_4 = 0;
                    var31_29 = null;
                    var2_2.m = false;
                    ** continue;
                }
                var4_4 = var2_2.k;
                var24_24 = var4_4 & 2;
                if (var24_24 == 0) {
                    var4_4 = var3_3.c;
                    var3_3.I(var4_4);
                    var4_4 = 0;
                    var31_29 = null;
                    var24_24 = 4;
lbl569:
                    // 2 sources

                    while (true) {
                        continue;
                        break;
                    }
                }
                var24_24 = 4;
                if ((var4_4 &= var24_24) == 0) {
                    while ((var4_4 = var1_1.a()) > 0) {
                        var4_4 = var2_2.l;
                        var6_6 = 8;
                        var2_2.l = var4_4 <<= var6_6;
                        var7_7 = var1_1.w();
                        var2_2.l = var4_4 |= var7_7;
                        var7_7 = 12583333;
                        if ((var4_4 &= 0xFFFFFF) != var7_7) continue;
                        var4_4 = var3_3.b - var10_10;
                        var3_3.I(var4_4);
                        var4_4 = 0;
                        var31_29 = null;
                        var2_2.l = 0;
lbl586:
                        // 2 sources

                        while (true) {
                            continue;
                            break;
                        }
                    }
                    var4_4 = 0;
                    var31_29 = null;
                    ** continue;
                }
                break block115;
                var6_6 = 8;
                var4_4 = 4;
                ** continue;
            }
            var4_4 = 0;
            var31_29 = null;
            var6_6 = 8;
            ** continue;
            var7_7 = 1;
            var2_2.d = var7_7;
            var4_4 = 4;
        }
    }

    public final void c() {
        double d2;
        boolean bl2;
        this.d = 0;
        this.l = 0;
        this.a.F(2);
        this.n = 0;
        this.o = 0;
        this.q = -2147483647;
        this.r = -1;
        this.s = 0;
        this.t = -1;
        this.u = false;
        this.i = false;
        this.m = bl2 = true;
        this.j = bl2;
        this.g = d2 = -9.223372036854776E18;
        this.h = d2;
    }

    public final void d(boolean bl2) {
    }

    public final void e(gi0_0 object, Gs3$d gs3$d) {
        String string2;
        gs3$d.a();
        gs3$d.b();
        this.e = string2 = gs3$d.e;
        gs3$d.b();
        int n3 = gs3$d.d;
        this.f = object = object.n(n3, 1);
    }

    public final void f(int n3, long l2) {
        long l3;
        long l4;
        this.k = n3;
        n3 = (int)(this.j ? 1 : 0);
        if (n3 == 0 && ((n3 = this.o) != 0 || (n3 = (int)(this.m ? 1 : 0)) == 0)) {
            n3 = 1;
            this.i = n3;
        }
        if ((n3 = (int)((l4 = l2 - (l3 = -9223372036854775807L)) == 0L ? 0 : (l4 < 0L ? -1 : 1))) != 0) {
            n3 = (int)(this.i ? 1 : 0);
            if (n3 != 0) {
                double d2;
                this.h = d2 = (double)l2;
            } else {
                double d5;
                this.g = d5 = (double)l2;
            }
        }
    }
}

