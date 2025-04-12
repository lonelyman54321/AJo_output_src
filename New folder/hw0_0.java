/*
 * Decompiled with CFR 0.152.
 */
import androidx.media3.common.ParserException;
import androidx.media3.common.d;
import androidx.media3.common.d$a;
import com.google.common.primitives.Ints;
import com.google.common.primitives.UnsignedBytes;
import java.math.RoundingMode;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

/*
 * Renamed from hw0
 */
public final class hw0_0
implements qy0_0 {
    public final Xm2 a;
    public final AtomicInteger b;
    public final String c;
    public final int d;
    public String e;
    public wp3 f;
    public int g;
    public int h;
    public int i;
    public long j;
    public d k;
    public int l;
    public int m;
    public int n;
    public int o;
    public long p;

    public hw0_0(String string2, int n3, int n4) {
        Xm2 xm2;
        Object object = new byte[n4];
        this.a = xm2 = new Xm2((byte[])object);
        this.g = 0;
        this.p = -9223372036854775807L;
        object = new AtomicInteger;
        this.b = object;
        this.n = n4 = -1;
        this.o = n4;
        this.c = string2;
        this.d = n3;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final void a(Xm2 var1_1) {
        var2_2 = this;
        var3_3 = var1_1;
        var4_4 /* !! */  = -1;
        var5_5 /* !! */  = 8;
        var6_6 = 4;
        var7_7 = 12;
        var8_8 = 1;
        var9_9 = this.f;
        ct3.h(var9_9);
        block9: while ((var10_10 = var1_1.a()) > 0) {
            block62: {
                block63: {
                    var10_10 = var2_2.g;
                    var11_11 = 48000;
                    var12_12 = 1078008818;
                    var13_13 = 32;
                    var14_14 = -9223372036854775807L;
                    var16_15 /* !! */  = 0;
                    var17_16 = null;
                    var18_17 = var2_2.a;
                    switch (var10_10) {
                        default: {
                            var3_3 = new IllegalStateException();
                            throw var3_3;
                        }
                        case 6: {
                            var19_18 /* !! */  = var1_1.a();
                            var20_19 = var2_2.l;
                            var10_10 = var2_2.h;
                            var19_18 /* !! */  = Math.min(var19_18 /* !! */ , var20_19 -= var10_10);
                            var21_20 = var2_2.f;
                            var21_20.f(var19_18 /* !! */ , (Xm2)var3_3);
                            var2_2.h = var20_19 = var2_2.h + var19_18 /* !! */ ;
                            var19_18 /* !! */  = var2_2.l;
                            if (var20_19 != var19_18 /* !! */ ) continue block9;
                            var22_21 = var2_2.p;
                            cfr_temp_0 = var22_21 - var14_14;
                            var19_18 /* !! */  = (int)(cfr_temp_0 == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1));
                            if (var19_18 /* !! */  != 0) {
                                var19_18 /* !! */  = 1;
                            } else {
                                var19_18 /* !! */  = 0;
                                var24_22 /* !! */  = null;
                            }
                            ct3.f((boolean)var19_18 /* !! */ );
                            var25_23 = var2_2.f;
                            var22_21 = var2_2.p;
                            var19_18 /* !! */  = var2_2.m;
                            var11_11 = var19_18 /* !! */  == var6_6 ? 0 : 1;
                            var19_18 /* !! */  = var2_2.l;
                            var26_24 = '\u0000';
                            var25_23.a(var22_21, var11_11, var19_18 /* !! */ , 0, null);
                            var22_21 = var2_2.p;
                            var27_25 = var2_2.j;
                            var2_2.p = var22_21 += var27_25;
                            var2_2.g = 0;
                            continue block9;
                        }
                        case 5: {
                            var9_9 = var18_17.a;
                            var16_15 /* !! */  = var2_2.o;
                            var10_10 = (int)var2_2.b((Xm2)var3_3, (byte[])var9_9, var16_15 /* !! */ );
                            if (var10_10 == 0) continue block9;
                            var9_9 = var18_17.a;
                            var17_16 = var2_2.b;
                            var25_23 = iw0.a((byte[])var9_9);
                            var13_13 = var25_23.g(var13_13);
                            var13_13 = var13_13 == var12_12 ? 1 : 0;
                            var29_26 = iw0.e;
                            var12_12 = iw0.b((Vm2)var25_23, var29_26);
                            var30_27 = var12_12 + 1;
                            if (var13_13 == 0) ** GOTO lbl140
                            var26_24 = (char)var25_23.f();
                            if (var26_24 == false) ** GOTO lbl139
                            var31_28 = var12_12 + -1;
                            var26_24 = var9_9[var31_28] << 8;
                            var32_29 = (char)-1;
                            var26_24 = (char)(var26_24 & var32_29);
                            var12_12 = var9_9[var12_12] & 255;
                            var12_12 = var26_24 | var12_12;
                            var26_24 = (char)gz3.a;
                            var33_30 /* !! */  = null;
                            var5_5 /* !! */  = (char)-1;
                            for (var4_4 /* !! */  = 0; var4_4 /* !! */  < var31_28; var4_4 /* !! */  += var8_8) {
                                var26_24 = (char)UnsignedBytes.toInt((byte)var9_9[var4_4 /* !! */ ]);
                                var34_31 = var26_24 >> 4;
                                var20_19 = (var5_5 /* !! */  >> 12 & 255 ^ var34_31) & 255;
                                var5_5 /* !! */  = var5_5 /* !! */  << var6_6 & var32_29;
                                var35_32 = gz3.n;
                                var20_19 = var35_32[var20_19];
                                var5_5 /* !! */  = (var5_5 /* !! */  ^ var20_19) & var32_29;
                                var20_19 = var26_24 & 15;
                                var19_18 /* !! */  = (var5_5 /* !! */  >> 12 & 255 ^ var20_19) & 255;
                                var5_5 /* !! */  = var5_5 /* !! */  << var6_6 & var32_29;
                                var19_18 /* !! */  = var35_32[var19_18 /* !! */ ] ^ var5_5 /* !! */ ;
                                var5_5 /* !! */  = var19_18 /* !! */  & var32_29;
                            }
                            if (var12_12 != var5_5 /* !! */ ) ** GOTO lbl138
                            var19_18 /* !! */  = 2;
                            var4_4 /* !! */  = var25_23.g(var19_18 /* !! */ );
                            if (var4_4 /* !! */  == 0) ** GOTO lbl109
                            if (var4_4 /* !! */  == var8_8) ** GOTO lbl107
                            if (var4_4 /* !! */  == var19_18 /* !! */ ) {
                                var31_28 = 384;
lbl100:
                                // 2 sources

                                while (true) {
                                    var19_18 /* !! */  = 3;
                                    break;
                                }
                            } else {
                                var3_3 = new StringBuilder("Unsupported base duration index in DTS UHD header: ");
                                var3_3.append(var4_4 /* !! */ );
                                throw ParserException.a(var3_3.toString(), null);
lbl107:
                                // 1 sources

                                var31_28 = 480;
                                ** continue;
lbl109:
                                // 1 sources

                                var19_18 /* !! */  = 3;
                                var31_28 = 512;
                            }
                            var4_4 /* !! */  = (var25_23.g(var19_18 /* !! */ ) + var8_8) * var31_28;
                            var19_18 /* !! */  = 2;
                            var5_5 /* !! */  = var25_23.g(var19_18 /* !! */ );
                            if (var5_5 /* !! */  == 0) ** GOTO lbl125
                            if (var5_5 /* !! */  == var8_8) ** GOTO lbl123
                            if (var5_5 /* !! */  == var19_18 /* !! */ ) {
                                var19_18 /* !! */  = 48000;
                            } else {
                                var3_3 = new StringBuilder("Unsupported clock rate index in DTS UHD header: ");
                                var3_3.append(var5_5 /* !! */ );
                                throw ParserException.a(var3_3.toString(), null);
lbl123:
                                // 1 sources

                                var19_18 /* !! */  = 44100;
                            }
                            ** GOTO lbl126
lbl125:
                            // 1 sources

                            var19_18 /* !! */  = 32000;
lbl126:
                            // 3 sources

                            var5_5 /* !! */  = (int)var25_23.f();
                            if (var5_5 /* !! */  != 0) {
                                var5_5 /* !! */  = 36;
                                var25_23.o(var5_5 /* !! */ );
                            }
                            var5_5 /* !! */  = var25_23.g(2);
                            var5_5 /* !! */  = (var8_8 << var5_5 /* !! */ ) * var19_18 /* !! */ ;
                            var36_33 = var4_4 /* !! */ ;
                            var38_34 = var19_18 /* !! */ ;
                            var40_35 = RoundingMode.DOWN;
                            var41_36 = 1000000L;
                            var38_34 = gz3.O(var36_33, var41_36, var38_34, var40_35);
                            ** GOTO lbl142
lbl138:
                            // 1 sources

                            throw ParserException.a("CRC check failed", null);
lbl139:
                            // 1 sources

                            throw ParserException.b("Only supports full channel mask-based audio presentation");
lbl140:
                            // 1 sources

                            var38_34 = var14_14;
                            var5_5 /* !! */  = -2147483647;
lbl142:
                            // 2 sources

                            var21_20 = null;
                            var10_10 = 0;
                            var9_9 = null;
                            for (var20_19 = 0; var20_19 < var13_13; var20_19 += var8_8) {
                                var43_37 /* !! */  = iw0.f;
                                var31_28 = iw0.b((Vm2)var25_23, var43_37 /* !! */ );
                                var10_10 += var31_28;
                            }
                            var21_20 = null;
                            for (var20_19 = 0; var20_19 < var8_8; var20_19 += var8_8) {
                                if (var13_13 != 0) {
                                    var43_37 /* !! */  = iw0.g;
                                    var31_28 = iw0.b((Vm2)var25_23, var43_37 /* !! */ );
                                    var17_16.set(var31_28);
                                }
                                if ((var31_28 = var17_16.get()) != 0) {
                                    var43_37 /* !! */  = iw0.h;
                                    var31_28 = iw0.b((Vm2)var25_23, var43_37 /* !! */ );
                                } else {
                                    var31_28 = 0;
                                    var43_37 /* !! */  = null;
                                }
                                var10_10 += var31_28;
                            }
                            var20_19 = var30_27 + var10_10;
                            var17_16 = "audio/vnd.dts.uhd;profile=p2";
                            var12_12 = 2;
                            var43_37 /* !! */  = (int[])var9_9;
                            var44_38 = var5_5 /* !! */ ;
                            var9_9 = new iw0$a(var12_12, (String)var17_16, var5_5 /* !! */ , var20_19, var38_34);
                            var5_5 /* !! */  = var2_2.m;
                            var13_13 = 3;
                            if (var5_5 /* !! */  == var13_13) {
                                var2_2.g((iw0$a)var9_9);
                            }
                            var2_2.l = var20_19;
                            var5_5 /* !! */  = (int)(var38_34 == var14_14 ? 0 : (var38_34 < var14_14 ? -1 : 1));
                            var36_33 = var5_5 /* !! */  == 0 ? 0L : var38_34;
                            var2_2.j = var36_33;
                            var18_17.I(0);
                            var24_22 /* !! */  = var2_2.f;
                            var4_4 /* !! */  = var2_2.o;
                            var24_22 /* !! */ .f(var4_4 /* !! */ , var18_17);
                            var2_2.g = var19_18 /* !! */  = 6;
lbl183:
                            // 13 sources

                            while (true) {
                                var4_4 /* !! */  = -1;
                                var5_5 /* !! */  = 8;
                                continue block9;
                                break;
                            }
                        }
                        case 4: {
                            var33_30 /* !! */  = var18_17.a;
                            var19_18 /* !! */  = (int)var2_2.b((Xm2)var3_3, var33_30 /* !! */ , 6);
                            if (var19_18 /* !! */  == 0) ** GOTO lbl183
                            var24_22 /* !! */  = (byte[])iw0.a(var18_17.a);
                            var24_22 /* !! */ .o(var13_13);
                            var33_30 /* !! */  = (byte[])iw0.i;
                            var2_2.o = var19_18 /* !! */  = iw0.b((Vm2)var24_22 /* !! */ , var33_30 /* !! */ ) + var8_8;
                            var4_4 /* !! */  = var2_2.h;
                            if (var4_4 /* !! */  > var19_18 /* !! */ ) {
                                var19_18 /* !! */  = var4_4 /* !! */  - var19_18 /* !! */ ;
                                var2_2.h = var4_4 /* !! */  -= var19_18 /* !! */ ;
                                var4_4 /* !! */  = var3_3.b - var19_18 /* !! */ ;
                                var3_3.I(var4_4 /* !! */ );
                            }
                            var2_2.g = var19_18 /* !! */  = 5;
                            ** GOTO lbl183
                        }
                        case 3: {
                            var24_22 /* !! */  = var18_17.a;
                            var4_4 /* !! */  = var2_2.n;
                            var19_18 /* !! */  = (int)var2_2.b((Xm2)var3_3, var24_22 /* !! */ , var4_4 /* !! */ );
                            if (var19_18 /* !! */  == 0) ** GOTO lbl183
                            var24_22 /* !! */  = (byte[])iw0.a(var18_17.a);
                            var24_22 /* !! */ .o(40);
                            var4_4 /* !! */  = 2;
                            var5_5 /* !! */  = var24_22 /* !! */ .g(var4_4 /* !! */ );
                            var20_19 = (int)var24_22 /* !! */ .f();
                            if (var20_19 == 0) {
                                var20_19 = 16;
                                var10_10 = 8;
                            } else {
                                var20_19 = 20;
                                var10_10 = 12;
                            }
                            var24_22 /* !! */ .o(var10_10);
                            var10_10 = var24_22 /* !! */ .g(var20_19) + var8_8;
                            var13_13 = (int)var24_22 /* !! */ .f();
                            if (var13_13 == 0) ** GOTO lbl253
                            var31_28 = var24_22 /* !! */ .g(var4_4 /* !! */ );
                            var4_4 /* !! */  = 3;
                            var12_12 = (var24_22 /* !! */ .g(var4_4 /* !! */ ) + var8_8) * 512;
                            var16_15 /* !! */  = (int)var24_22 /* !! */ .f();
                            if (var16_15 /* !! */  != 0) {
                                var16_15 /* !! */  = 36;
                                var24_22 /* !! */ .o(var16_15 /* !! */ );
                            }
                            var16_15 /* !! */  = var24_22 /* !! */ .g(var4_4 /* !! */ ) + var8_8;
                            var4_4 /* !! */  = var24_22 /* !! */ .g(var4_4 /* !! */ ) + var8_8;
                            if (var16_15 /* !! */  == var8_8 && var4_4 /* !! */  == var8_8) {
                                var4_4 /* !! */  = var24_22 /* !! */ .g(var5_5 /* !! */  += var8_8);
                                var17_16 = null;
                                for (var16_15 /* !! */  = 0; var16_15 /* !! */  < var5_5 /* !! */ ; var16_15 /* !! */  += var8_8) {
                                    var44_38 = var4_4 /* !! */  >> var16_15 /* !! */  & var8_8;
                                    if (var44_38 != var8_8) continue;
                                    var44_38 = 8;
                                    var24_22 /* !! */ .o(var44_38);
                                }
                                var4_4 /* !! */  = (int)var24_22 /* !! */ .f();
                                if (var4_4 /* !! */  != 0) {
                                    var4_4 /* !! */  = 2;
                                    var24_22 /* !! */ .o(var4_4 /* !! */ );
                                    var5_5 /* !! */  = var24_22 /* !! */ .g(var4_4 /* !! */ ) + var8_8 << var4_4 /* !! */ ;
                                    var16_15 /* !! */  = var24_22 /* !! */ .g(var4_4 /* !! */ ) + var8_8;
                                    var33_30 /* !! */  = null;
                                    for (var4_4 /* !! */  = 0; var4_4 /* !! */  < var16_15 /* !! */ ; var4_4 /* !! */  += var8_8) {
                                        var24_22 /* !! */ .o(var5_5 /* !! */ );
                                    }
                                }
                            } else {
                                throw ParserException.b("Multiple audio presentations or assets not supported");
lbl253:
                                // 1 sources

                                var31_28 = -1;
                                var12_12 = 0;
                                var29_26 = null;
                            }
                            var24_22 /* !! */ .o(var20_19);
                            var24_22 /* !! */ .o(var7_7);
                            if (var13_13 != 0) {
                                var4_4 /* !! */  = (int)var24_22 /* !! */ .f();
                                if (var4_4 /* !! */  != 0) {
                                    var24_22 /* !! */ .o(var6_6);
                                }
                                if ((var4_4 /* !! */  = (int)var24_22 /* !! */ .f()) != 0) {
                                    var4_4 /* !! */  = 24;
                                    var24_22 /* !! */ .o(var4_4 /* !! */ );
                                }
                                if ((var4_4 /* !! */  = (int)var24_22 /* !! */ .f()) != 0) {
                                    var4_4 /* !! */  = var24_22 /* !! */ .g(10) + var8_8;
                                    var24_22 /* !! */ .p(var4_4 /* !! */ );
                                }
                                var24_22 /* !! */ .o(5);
                                var33_30 /* !! */  = (byte[])iw0.d;
                                var5_5 /* !! */  = var24_22 /* !! */ .g(var6_6);
                                var16_15 /* !! */  = var33_30 /* !! */ [var5_5 /* !! */ ];
                                var4_4 /* !! */  = 8;
                                var45_39 = var19_18 /* !! */  = var24_22 /* !! */ .g(var4_4 /* !! */ ) + var8_8;
                                var46_40 = var16_15 /* !! */ ;
                            } else {
                                var45_39 = -1;
                                var46_40 = -2147483647;
                            }
                            if (var13_13 == 0) ** GOTO lbl299
                            if (var31_28 == 0) ** GOTO lbl291
                            if (var31_28 == var8_8) ** GOTO lbl289
                            var19_18 /* !! */  = 2;
                            if (var31_28 == var19_18 /* !! */ ) {
                                var19_18 /* !! */  = 48000;
                            } else {
                                var3_3 = new StringBuilder("Unsupported reference clock code in DTS HD header: ");
                                var3_3.append(var31_28);
                                throw ParserException.a(var3_3.toString(), null);
lbl289:
                                // 1 sources

                                var19_18 /* !! */  = 44100;
                            }
                            ** GOTO lbl292
lbl291:
                            // 1 sources

                            var19_18 /* !! */  = 32000;
lbl292:
                            // 3 sources

                            var47_41 = var12_12;
                            var36_33 = var19_18 /* !! */ ;
                            var19_18 /* !! */  = gz3.a;
                            var49_42 = RoundingMode.DOWN;
                            var50_43 = 1000000L;
                            var38_34 = gz3.O(var47_41, var50_43, var36_33, var49_42);
                            ** GOTO lbl300
lbl299:
                            // 1 sources

                            var38_34 = var14_14;
lbl300:
                            // 2 sources

                            var53_45 = "audio/vnd.dts.hd;profile=lbr";
                            var52_44 = new iw0$a(var45_39, var53_45, var46_40, var10_10, var38_34);
                            var2_2.g((iw0$a)var52_44);
                            var2_2.l = var10_10;
                            var5_5 /* !! */  = (int)(var38_34 == var14_14 ? 0 : (var38_34 < var14_14 ? -1 : 1));
                            var36_33 = var5_5 /* !! */  == 0 ? 0L : var38_34;
                            var2_2.j = var36_33;
                            var18_17.I(0);
                            var24_22 /* !! */  = var2_2.f;
                            var4_4 /* !! */  = var2_2.n;
                            var24_22 /* !! */ .f(var4_4 /* !! */ , var18_17);
                            var2_2.g = var19_18 /* !! */  = 6;
                            ** GOTO lbl183
                        }
                        case 2: {
                            var24_22 /* !! */  = var18_17.a;
                            var4_4 /* !! */  = 7;
                            var19_18 /* !! */  = (int)var2_2.b((Xm2)var3_3, var24_22 /* !! */ , var4_4 /* !! */ );
                            if (var19_18 /* !! */  == 0) ** GOTO lbl183
                            var24_22 /* !! */  = (byte[])iw0.a(var18_17.a);
                            var24_22 /* !! */ .o(42);
                            var4_4 /* !! */  = (int)var24_22 /* !! */ .f();
                            var4_4 /* !! */  = var4_4 /* !! */  != 0 ? 12 : 8;
                            var2_2.n = var19_18 /* !! */  = var24_22 /* !! */ .g(var4_4 /* !! */ ) + var8_8;
                            var2_2.g = var19_18 /* !! */  = 3;
                            ** GOTO lbl183
                        }
                        case 1: {
                            var24_22 /* !! */  = var18_17.a;
                            var4_4 /* !! */  = 18;
                            var19_18 /* !! */  = (int)var2_2.b((Xm2)var3_3, var24_22 /* !! */ , var4_4 /* !! */ );
                            if (var19_18 /* !! */  == 0) ** GOTO lbl183
                            var24_22 /* !! */  = var18_17.a;
                            var52_44 = var2_2.k;
                            var20_19 = 60;
                            if (var52_44 == null) {
                                var52_44 = var2_2.e;
                                var9_9 = iw0.a(var24_22 /* !! */ );
                                var9_9.o(var20_19);
                                var12_12 = var9_9.g(6);
                                var43_37 /* !! */  = iw0.a;
                                var31_28 = var43_37 /* !! */ [var12_12];
                                var12_12 = var9_9.g(var6_6);
                                var17_16 = iw0.b;
                                var12_12 = (int)var17_16[var12_12];
                                var44_38 = var9_9.g(5);
                                var16_15 /* !! */  = 29;
                                if (var44_38 >= var16_15 /* !! */ ) {
                                    var4_4 /* !! */  = 10;
                                    var16_15 /* !! */  = -1;
                                    var44_38 = 2;
                                } else {
                                    var17_16 = iw0.c;
                                    var16_15 /* !! */  = (int)(var17_16[var44_38] * 1000);
                                    var44_38 = 2;
                                    var16_15 /* !! */  /= var44_38;
                                    var4_4 /* !! */  = 10;
                                }
                                var9_9.o(var4_4 /* !! */ );
                                var4_4 /* !! */  = var9_9.g(var44_38);
                                if (var4_4 /* !! */  > 0) {
                                    var4_4 /* !! */  = 1;
                                } else {
                                    var4_4 /* !! */  = 0;
                                    var33_30 /* !! */  = null;
                                }
                                var31_28 += var4_4 /* !! */ ;
                                var33_30 /* !! */  = (byte[])new d$a;
                                var33_30 /* !! */ ();
                                var33_30 /* !! */ .a = var52_44;
                                var33_30 /* !! */ .n = var52_44 = ip1_0.l("audio/vnd.dts");
                                var33_30 /* !! */ .h = var16_15 /* !! */ ;
                                var33_30 /* !! */ .C = var31_28;
                                var33_30 /* !! */ .D = var12_12;
                                var33_30 /* !! */ .r = null;
                                var33_30 /* !! */ .d = var52_44 = var2_2.c;
                                var33_30 /* !! */ .f = var5_5 /* !! */  = var2_2.d;
                                var2_2.k = var52_44 = new d((d$a)var33_30 /* !! */ );
                                var33_30 /* !! */  = (byte[])var2_2.f;
                                var33_30 /* !! */ .d((d)var52_44);
                            }
                            var33_30 /* !! */  = null;
                            var5_5 /* !! */  = (int)var24_22 /* !! */ [0];
                            var4_4 /* !! */  = 31;
                            var10_10 = -2;
                            if (var5_5 /* !! */  == var10_10) ** GOTO lbl415
                            var31_28 = -1;
                            if (var5_5 /* !! */  == var31_28) ** GOTO lbl408
                            if (var5_5 /* !! */  == var4_4 /* !! */ ) ** GOTO lbl397
                            var12_12 = (int)var24_22 /* !! */ [5];
                            var31_28 = (3 & var12_12) << var7_7;
                            var12_12 = 6;
                            var16_15 /* !! */  = (var24_22 /* !! */ [var12_12] & 255) << var6_6;
                            var31_28 |= var16_15 /* !! */ ;
                            var16_15 /* !! */  = 7;
                            var44_38 = (var24_22 /* !! */ [var16_15 /* !! */ ] & 240) >> var6_6;
                            var31_28 |= var44_38;
lbl392:
                            // 2 sources

                            while (true) {
                                var31_28 += var8_8;
                                var12_12 = 0;
                                var29_26 = null;
                                ** GOTO lbl422
                                break;
                            }
lbl397:
                            // 1 sources

                            var16_15 /* !! */  = 7;
                            var31_28 = (var24_22 /* !! */ [6] & 3) << var7_7;
                            var12_12 = (var24_22 /* !! */ [var16_15 /* !! */ ] & 255) << var6_6;
                            var31_28 |= var12_12;
                            var12_12 = var24_22 /* !! */ [8] & 60;
                            var44_38 = 2;
                            var12_12 >>= var44_38;
lbl404:
                            // 2 sources

                            while (true) {
                                var31_28 = (var31_28 | var12_12) + var8_8;
                                var12_12 = 1;
                                ** GOTO lbl422
                                break;
                            }
lbl408:
                            // 1 sources

                            var31_28 = (var24_22 /* !! */ [7] & 3) << var7_7;
                            var12_12 = (var24_22 /* !! */ [6] & 255) << var6_6;
                            var31_28 |= var12_12;
                            var12_12 = var24_22 /* !! */ [9] & var20_19;
                            var16_15 /* !! */  = 2;
                            var12_12 >>= var16_15 /* !! */ ;
                            ** continue;
lbl415:
                            // 1 sources

                            var31_28 = (var24_22 /* !! */ [var6_6] & 3) << var7_7;
                            var12_12 = (var24_22 /* !! */ [7] & 255) << var6_6;
                            var31_28 |= var12_12;
                            var16_15 /* !! */  = (int)var24_22 /* !! */ [6];
                            var12_12 = (var16_15 /* !! */  & 240) >> var6_6;
                            var31_28 |= var12_12;
                            ** continue;
lbl422:
                            // 2 sources

                            if (var12_12 != 0) {
                                var12_12 = 16;
                                var31_28 = var31_28 * 16 / 14;
                            }
                            var2_2.l = var31_28;
                            if (var5_5 /* !! */  == var10_10) ** GOTO lbl452
                            var10_10 = -1;
                            if (var5_5 /* !! */  == var10_10) ** GOTO lbl447
                            if (var5_5 /* !! */  != var4_4 /* !! */ ) {
                                var4_4 /* !! */  = var24_22 /* !! */ [var6_6] & var8_8;
                                var5_5 /* !! */  = 6;
                                var4_4 /* !! */  <<= var5_5 /* !! */ ;
                                var31_28 = 5;
                                var19_18 /* !! */  = var24_22 /* !! */ [var31_28] & 252;
                                var12_12 = 2;
lbl436:
                                // 3 sources

                                while (true) {
                                    continue;
                                    break;
                                }
                            }
                            var5_5 /* !! */  = 6;
                            var12_12 = 2;
                            var4_4 /* !! */  = (int)var24_22 /* !! */ [5];
                            var31_28 = 7;
                            var4_4 /* !! */  = (var4_4 /* !! */  & var31_28) << var6_6;
                            var19_18 /* !! */  = (int)var24_22 /* !! */ [var5_5 /* !! */ ];
lbl444:
                            // 2 sources

                            while (true) {
                                var19_18 /* !! */  &= var20_19;
                                ** GOTO lbl436
                                break;
                            }
lbl447:
                            // 1 sources

                            var31_28 = 7;
                            var12_12 = 2;
                            var4_4 /* !! */  = (var24_22 /* !! */ [var6_6] & var31_28) << var6_6;
                            var19_18 /* !! */  = (int)var24_22 /* !! */ [var31_28];
                            ** continue;
lbl452:
                            // 1 sources

                            var10_10 = -1;
                            var12_12 = 2;
                            var4_4 /* !! */  = var24_22 /* !! */ [5] & var8_8;
                            var5_5 /* !! */  = 6;
                            var4_4 /* !! */  <<= var5_5 /* !! */ ;
                            var19_18 /* !! */  = var24_22 /* !! */ [var6_6] & 252;
                            ** continue;
                            var19_18 /* !! */  = var19_18 /* !! */  >> var12_12 | var4_4 /* !! */ ;
                            var38_34 = (var19_18 /* !! */  + var8_8) * 32;
                            var52_44 = var2_2.k;
                            var5_5 /* !! */  = var52_44.E;
                            var2_2.j = var38_34 = (long)Ints.checkedCast(gz3.M(var5_5 /* !! */ , var38_34));
                            var18_17.I(0);
                            var24_22 /* !! */  = var2_2.f;
                            var4_4 /* !! */  = 18;
                            var24_22 /* !! */ .f(var4_4 /* !! */ , var18_17);
                            var2_2.g = var19_18 /* !! */  = 6;
                            ** GOTO lbl183
                        }
                        case 0: 
                    }
                    var10_10 = -1;
                    do {
                        if ((var19_18 /* !! */  = var1_1.a()) <= 0) ** GOTO lbl183
                        var2_2.i = var19_18 /* !! */  = var2_2.i << 8;
                        var4_4 /* !! */  = var1_1.w();
                        var2_2.i = var19_18 /* !! */  |= var4_4 /* !! */ ;
                        var4_4 /* !! */  = 2147385345;
                        if (var19_18 /* !! */  != var4_4 /* !! */  && var19_18 /* !! */  != (var4_4 /* !! */  = -25230976) && var19_18 /* !! */  != (var4_4 /* !! */  = 536864768) && var19_18 /* !! */  != (var4_4 /* !! */  = -14745368)) {
                            var4_4 /* !! */  = 1683496997;
                            if (var19_18 /* !! */  != var4_4 /* !! */  && var19_18 /* !! */  != (var4_4 /* !! */  = 622876772)) {
                                if (var19_18 /* !! */  != var12_12 && var19_18 /* !! */  != (var4_4 /* !! */  = -233094848)) {
                                    var4_4 /* !! */  = 1908687592;
                                    if (var19_18 /* !! */  != var4_4 /* !! */  && var19_18 /* !! */  != (var4_4 /* !! */  = -398277519)) {
                                        var4_4 /* !! */  = 0;
                                        var33_30 /* !! */  = null;
                                    } else {
                                        var4_4 /* !! */  = 4;
                                    }
                                } else {
                                    var4_4 /* !! */  = 3;
                                }
                            } else {
                                var4_4 /* !! */  = 2;
                            }
                        } else {
                            var4_4 /* !! */  = 1;
                        }
                        var2_2.m = var4_4 /* !! */ ;
                    } while (var4_4 /* !! */  == 0);
                    var52_44 = var18_17.a;
                    var20_19 = 24;
                    var13_13 = (byte)(var19_18 /* !! */  >> 24 & 255);
                    var18_17 = null;
                    var52_44[0] = var13_13;
                    var13_13 = 16;
                    var54_46 = (byte)(var19_18 /* !! */  >> 16 & 255);
                    var52_44[var8_8] = var54_46;
                    var31_28 = 8;
                    var54_46 = (byte)(var19_18 /* !! */  >> 8 & 255);
                    var12_12 = 2;
                    var52_44[var12_12] = var54_46;
                    var19_18 /* !! */  = (byte)(var19_18 /* !! */  & 255);
                    var16_15 /* !! */  = 3;
                    var52_44[var16_15 /* !! */ ] = var19_18 /* !! */ ;
                    var2_2.h = var6_6;
                    var19_18 /* !! */  = 0;
                    var24_22 /* !! */  = null;
                    var2_2.i = 0;
                    if (var4_4 /* !! */  == var16_15 /* !! */  || var4_4 /* !! */  == var6_6) break block62;
                    if (var4_4 /* !! */  != var8_8) break block63;
                    var2_2.g = var8_8;
                    ** GOTO lbl183
                }
                var2_2.g = var4_4 /* !! */  = 2;
                ** GOTO lbl183
            }
            var2_2.g = var6_6;
            ** continue;
        }
    }

    public final boolean b(Xm2 xm2, byte[] byArray, int n3) {
        int n4 = xm2.a();
        int n7 = this.h;
        n7 = n3 - n7;
        n4 = Math.min(n4, n7);
        n7 = this.h;
        xm2.g(n7, byArray, n4);
        int n8 = this.h + n4;
        this.h = n8;
        if (n8 == n3) {
            n8 = 1;
        } else {
            n8 = 0;
            xm2 = null;
        }
        return n8;
    }

    public final void c() {
        this.g = 0;
        this.h = 0;
        this.i = 0;
        this.p = -9223372036854775807L;
        this.b.set(0);
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
        this.p = l2;
    }

    public final void g(iw0$a object) {
        int n3;
        int n4 = ((iw0$a)object).b;
        int n7 = -2147483647;
        if (n4 != n7 && (n3 = ((iw0$a)object).c) != (n7 = -1)) {
            int n8;
            Object object2 = this.k;
            object = ((iw0$a)object).a;
            if (object2 == null || n3 != (n8 = ((d)object2).D) || n4 != (n8 = ((d)object2).E) || (n7 = (int)(Objects.equals(object, object2 = ((d)object2).o) ? 1 : 0)) == 0) {
                int n10;
                String string2;
                object2 = this.k;
                object2 = object2 == null ? new d$a() : ((d)object2).a();
                ((d$a)object2).a = string2 = this.e;
                ((d$a)object2).n = object = ip1_0.l((String)object);
                ((d$a)object2).C = n3;
                ((d$a)object2).D = n4;
                ((d$a)object2).d = object = this.c;
                ((d$a)object2).f = n10 = this.d;
                this.k = object = new d((d$a)object2);
                object2 = this.f;
                object2.d((d)object);
            }
        }
    }
}

