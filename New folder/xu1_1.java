/*
 * Decompiled with CFR 0.152.
 */
import androidx.media3.common.d;
import androidx.media3.common.d$a;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList$Builder;
import com.google.common.collect.UnmodifiableIterator;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/*
 * Renamed from Xu1
 */
public final class xu1_1
implements ju {
    public final ImmutableList a;
    public final int b;

    public xu1_1(ImmutableList immutableList, int n3) {
        this.b = n3;
        this.a = immutableList;
    }

    /*
     * Unable to fully structure code
     */
    public static xu1_1 b(int var0, Xm2 var1_1) {
        var2_2 = var1_1;
        var3_3 = new ImmutableList$Builder();
        var4_4 = var1_1.c;
        var5_5 = -2;
        while ((var6_6 = var1_1.a()) > (var7_7 = 8)) {
            block36: {
                block35: {
                    var6_6 = var1_1.k();
                    var8_8 = var1_1.k();
                    var9_9 = var2_2.b + var8_8;
                    var2_2.H(var9_9);
                    var8_8 = 1414744396;
                    var10_10 = 1;
                    var11_11 = 2;
                    if (var6_6 != var8_8) break block35;
                    var6_6 = var1_1.k();
                    var12_12 = xu1_1.b(var6_6, (Xm2)var2_2);
                    break block36;
                }
                var8_8 = 12;
                var13_13 = 0;
                var14_14 = null;
                var15_15 = 4;
                switch (var6_6) lbl-1000:
                // 6 sources

                {
                    default: {
                        var12_12 = var14_14;
                        break;
                    }
                    case 1852994675: {
                        var7_7 = var1_1.a();
                        var16_16 = StandardCharsets.UTF_8;
                        var17_17 = var2_2.u(var7_7, (Charset)var16_16);
                        var12_12 = new yd3_1((String)var17_17);
                        break;
                    }
                    case 1752331379: {
                        var6_6 = var1_1.k();
                        var2_2.J(var8_8);
                        var1_1.k();
                        var18_18 = var1_1.k();
                        var19_19 = var1_1.k();
                        var2_2.J(var15_15);
                        var20_20 = var1_1.k();
                        var21_21 = var1_1.k();
                        var2_2.J(var7_7);
                        var14_14 = var17_17;
                        var15_15 = var6_6;
                        var12_12 = var17_17 = new mu_0(var6_6, var18_18, var19_19, var20_20, var21_21);
                        break;
                    }
                    case 1751742049: {
                        var6_6 = var1_1.k();
                        var2_2.J(var7_7);
                        var7_7 = var1_1.k();
                        var13_13 = var1_1.k();
                        var2_2.J(var15_15);
                        var1_1.k();
                        var2_2.J(var8_8);
                        var12_12 = var16_16 = new lu_1(var6_6, var7_7, var13_13);
                        break;
                    }
                    case 1718776947: {
                        if (var5_5 != var11_11) ** GOTO lbl95
                        var2_2.J(var15_15);
                        var6_6 = var1_1.k();
                        var7_7 = var1_1.k();
                        var2_2.J(var15_15);
                        var8_8 = var1_1.k();
                        switch (var8_8) {
                            default: {
                                var15_15 = 0;
                                var22_22 = null;
                                break;
                            }
                            case 1196444237: 
                            case 1735420525: {
                                var22_22 = "video/mjpeg";
                                break;
                            }
                            case 859066445: {
                                var22_22 = "video/mp43";
                                break;
                            }
                            case 842289229: {
                                var22_22 = "video/mp42";
                                break;
                            }
                            case 826496577: 
                            case 828601953: 
                            case 875967048: {
                                var22_22 = "video/avc";
                                break;
                            }
                            case 808802372: 
                            case 877677894: 
                            case 1145656883: 
                            case 1145656920: 
                            case 1482049860: 
                            case 1684633208: 
                            case 2021026148: {
                                var22_22 = "video/mp4v-es";
                            }
                        }
                        if (var22_22 != null) ** GOTO lbl88
                        var12_12 = "Ignoring track with unsupported compression ";
                        CS1.a(var8_8, (String)var12_12);
                        ** GOTO lbl-1000
lbl88:
                        // 1 sources

                        var16_16 = new d$a();
                        var16_16.u = var6_6;
                        var16_16.v = var7_7;
                        var16_16.n = var12_12 = ip1_0.l((String)var22_22);
                        var12_12 = new d((d$a)var16_16);
                        var14_14 = new vd3_0((d)var12_12);
                        ** GOTO lbl-1000
lbl95:
                        // 1 sources

                        if (var5_5 != var10_10) ** GOTO lbl146
                        var6_6 = var1_1.p();
                        var17_17 = "audio/raw";
                        var16_16 = "audio/mp4a-latm";
                        if (var6_6 != var10_10) {
                            var15_15 = 85;
                            if (var6_6 != var15_15) {
                                var15_15 = 255;
                                if (var6_6 != var15_15) {
                                    var15_15 = 8192;
                                    if (var6_6 != var15_15) {
                                        var15_15 = 8193;
                                        if (var6_6 != var15_15) {
                                            var15_15 = 0;
                                            var22_22 = null;
                                        } else {
                                            var22_22 = "audio/vnd.dts";
                                        }
                                    } else {
                                        var22_22 = "audio/ac3";
                                    }
                                } else {
                                    var22_22 = var16_16;
                                }
                            } else {
                                var22_22 = "audio/mpeg";
                            }
                        } else {
                            var22_22 = var17_17;
                        }
                        if (var22_22 != null) ** GOTO lbl124
                        var17_17 = "Ignoring track with unsupported format tag ";
                        CS1.a(var6_6, (String)var17_17);
                        ** GOTO lbl-1000
lbl124:
                        // 1 sources

                        var6_6 = var1_1.p();
                        var13_13 = var1_1.k();
                        var2_2.J(6);
                        var18_18 = gz3.s(var1_1.p());
                        var19_19 = var1_1.a();
                        var20_20 = 0;
                        var23_23 = null;
                        var19_19 = var19_19 > 0 ? var1_1.p() : 0;
                        var24_24 = new byte[var19_19];
                        var2_2.g(0, var24_24, var19_19);
                        var23_23 = new d$a();
                        var23_23.n = var25_25 = ip1_0.l((String)var22_22);
                        var23_23.C = var6_6;
                        var23_23.D = var13_13;
                        var6_6 = (int)var17_17.equals(var22_22);
                        if (var6_6 != 0 && var18_18 != 0) {
                            var23_23.E = var18_18;
                        }
                        if ((var6_6 = (int)var16_16.equals(var22_22)) != 0 && var19_19 > 0) {
                            var23_23.q = var12_12 = ImmutableList.of((Object)var24_24);
                        }
                        var12_12 = new d(var23_23);
                        var14_14 = new vd3_0((d)var12_12);
                        ** GOTO lbl-1000
lbl146:
                        // 1 sources

                        var12_12 = new StringBuilder("Ignoring strf box for unsupported track type: ");
                        var17_17 = gz3.x(var5_5);
                        var12_12.append((String)var17_17);
                        var12_12 = var12_12.toString();
                        Cx.f((String)var12_12);
                        ** GOTO lbl-1000
                    }
                }
            }
            if (var12_12 != null) {
                var7_7 = var12_12.getType();
                if (var7_7 == (var8_8 = 1752331379)) {
                    var26_26 = var12_12;
                    var26_26 = (mu_0)var12_12;
                    var5_5 = var26_26.a;
                    var7_7 = 1935960438;
                    if (var5_5 != var7_7) {
                        var7_7 = 1935963489;
                        if (var5_5 != var7_7) {
                            var7_7 = 1937012852;
                            if (var5_5 != var7_7) {
                                var16_16 = "Found unsupported streamType fourCC: ";
                                var17_17 = new StringBuilder((String)var16_16);
                                var26_26 = Integer.toHexString(var5_5);
                                var17_17.append((String)var26_26);
                                var26_26 = var17_17.toString();
                                Cx.f((String)var26_26);
                                var5_5 = -1;
                            } else {
                                var5_5 = 3;
                            }
                        } else {
                            var5_5 = 1;
                        }
                    } else {
                        var5_5 = 2;
                    }
                }
                var3_3.add(var12_12);
            }
            var2_2.I(var9_9);
            var2_2.H(var4_4);
        }
        var3_3 = var3_3.build();
        var4_4 = var0;
        var2_2 = new xu1_1((ImmutableList)var3_3, var0);
        return var2_2;
    }

    public final ju a(Class clazz) {
        boolean bl2;
        UnmodifiableIterator unmodifiableIterator = this.a.iterator();
        while (bl2 = unmodifiableIterator.hasNext()) {
            ju ju2 = (ju)unmodifiableIterator.next();
            Class<?> clazz2 = ju2.getClass();
            if (clazz2 != clazz) continue;
            return ju2;
        }
        return null;
    }

    public final int getType() {
        return this.b;
    }
}

