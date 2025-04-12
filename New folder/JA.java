/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.Pair
 */
import android.util.Pair;
import androidx.media3.common.DrmInitData;
import androidx.media3.common.ParserException;
import androidx.media3.common.d;
import androidx.media3.common.d$a;
import androidx.media3.container.Mp4TimestampData;
import com.google.common.base.Function;
import com.google.common.collect.ImmutableList;
import com.google.common.primitives.Ints;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public final class JA {
    public static final byte[] a;

    static {
        Charset charset = StandardCharsets.UTF_8;
        a = "OpusHead".getBytes(charset);
    }

    public static JA$b a(int n3, Xm2 xm2) {
        xm2.I(n3 += 12);
        n3 = 1;
        xm2.J(n3);
        JA.b(xm2);
        int n4 = 2;
        xm2.J(n4);
        int n7 = xm2.w();
        int n8 = n7 & 0x80;
        if (n8 != 0) {
            xm2.J(n4);
        }
        if ((n8 = n7 & 0x40) != 0) {
            n8 = xm2.w();
            xm2.J(n8);
        }
        if ((n7 &= 0x20) != 0) {
            xm2.J(n4);
        }
        xm2.J(n3);
        JA.b(xm2);
        String string2 = ip1_0.d(xm2.w());
        String string3 = "audio/mpeg";
        n4 = string3.equals(string2) ? 1 : 0;
        if (n4 == 0 && (n4 = (int)((string3 = "audio/vnd.dts").equals(string2) ? 1 : 0)) == 0 && (n4 = (int)((string3 = "audio/vnd.dts.hd").equals(string2) ? 1 : 0)) == 0) {
            n4 = 4;
            xm2.J(n4);
            long l2 = xm2.y();
            long l3 = xm2.y();
            xm2.J(n3);
            n3 = JA.b(xm2);
            byte[] byArray = new byte[n3];
            xm2.g(0, byArray, n3);
            long l4 = -1;
            long l7 = 0L;
            long l8 = l3 == l7 ? 0 : (l3 < l7 ? -1 : 1);
            long l12 = l8 > 0 ? l3 : l4;
            l8 = l2 == l7 ? 0 : (l2 < l7 ? -1 : 1);
            if (l8 > 0) {
                l4 = l2;
            }
            JA$b jA$b = new JA$b(string2, byArray, l12, l4);
            return jA$b;
        }
        JA$b jA$b = new JA$b(string2, null, -1, -1);
        return jA$b;
    }

    public static int b(Xm2 xm2) {
        int n3;
        int n4 = xm2.w();
        int n7 = n4 & 0x7F;
        while ((n4 &= (n3 = 128)) == n3) {
            n4 = xm2.w();
            n7 <<= 7;
            n3 = n4 & 0x7F;
            n7 |= n3;
        }
        return n7;
    }

    public static int c(int n3) {
        return n3 >> 24 & 0xFF;
    }

    public static Mp4TimestampData d(Xm2 object) {
        long l2;
        long l3;
        ((Xm2)object).I(8);
        int n3 = JA.c(((Xm2)object).i());
        if (n3 == 0) {
            l3 = ((Xm2)object).y();
            l2 = ((Xm2)object).y();
        } else {
            l3 = ((Xm2)object).q();
            l2 = ((Xm2)object).q();
        }
        long l4 = ((Xm2)object).y();
        object = new Mp4TimestampData(l3, l2, l4);
        return object;
    }

    public static Pair e(Xm2 xm2, int n3, int n4) {
        int n7;
        Xm2 xm22 = xm2;
        int n8 = xm2.b;
        while ((n7 = n8 - n3) < n4) {
            Object object;
            int n10;
            xm22.I(n8);
            n7 = xm2.i();
            int n14 = 0;
            int n15 = 1;
            if (n7 > 0) {
                n10 = 1;
            } else {
                n10 = 0;
                object = null;
            }
            Object object2 = "childAtomSize must be positive";
            s70_0.a((String)object2, n10 != 0);
            n10 = xm2.i();
            int n16 = 1936289382;
            if (n10 == n16) {
                Object object3;
                int n17;
                int n18;
                int n19;
                int n20;
                n10 = n8 + 8;
                n16 = -1;
                int n21 = -1;
                int n22 = 0;
                String string2 = null;
                Integer n24 = null;
                while (true) {
                    n20 = n10 - n8;
                    n19 = 4;
                    if (n20 >= n7) break;
                    xm22.I(n10);
                    n20 = xm2.i();
                    n18 = xm2.i();
                    n17 = 1718775137;
                    if (n18 == n17) {
                        n17 = xm2.i();
                        n24 = n17;
                    } else {
                        n17 = 1935894637;
                        if (n18 == n17) {
                            xm22.J(n19);
                            object3 = StandardCharsets.UTF_8;
                            string2 = xm22.u(n19, (Charset)object3);
                        } else {
                            n17 = 1935894633;
                            if (n18 == n17) {
                                n21 = n10;
                                n22 = n20;
                            }
                        }
                    }
                    n10 += n20;
                }
                object3 = "cenc";
                n17 = ((String)object3).equals(string2);
                if (n17 == 0 && (n17 = (int)(((String)(object3 = "cbc1")).equals(string2) ? 1 : 0)) == 0 && (n17 = (int)(((String)(object3 = "cens")).equals(string2) ? 1 : 0)) == 0 && (n17 = ((String)(object3 = "cbcs")).equals(string2)) == 0) {
                    n17 = 0;
                    object3 = null;
                } else {
                    block24: {
                        if (n24 != null) {
                            n17 = 1;
                        } else {
                            n17 = 0;
                            object3 = null;
                        }
                        object = "frma atom is mandatory";
                        s70_0.a((String)object, n17 != 0);
                        if (n21 != n16) {
                            n17 = 1;
                        } else {
                            n17 = 0;
                            object3 = null;
                        }
                        object = "schi atom is mandatory";
                        s70_0.a((String)object, n17 != 0);
                        n17 = n21 + 8;
                        while ((n10 = n17 - n21) < n22) {
                            xm22.I(n17);
                            n10 = xm2.i();
                            n16 = xm2.i();
                            n20 = 1952804451;
                            if (n16 == n20) {
                                Object object4;
                                n17 = JA.c(xm2.i());
                                xm22.J(n15);
                                if (n17 == 0) {
                                    xm22.J(n15);
                                    n17 = 0;
                                    object3 = null;
                                    n18 = 0;
                                } else {
                                    n17 = xm2.w();
                                    n10 = (n17 & 0xF0) >> n19;
                                    n17 &= 0xF;
                                    n18 = n10;
                                }
                                n10 = xm2.w();
                                n22 = n10 == n15 ? 1 : 0;
                                n20 = xm2.w();
                                n10 = 16;
                                byte[] byArray = new byte[n10];
                                xm22.g(0, byArray, n10);
                                if (n22 != 0 && n20 == 0) {
                                    n10 = xm2.w();
                                    object2 = new byte[n10];
                                    xm22.g(0, (byte[])object2, n10);
                                    object4 = object2;
                                } else {
                                    object4 = null;
                                }
                                object2 = n24;
                                object3 = object = new op3(n22 != 0, string2, n20, byArray, n18, n17, (byte[])object4);
                                break block24;
                            }
                            object2 = n24;
                            n17 += n10;
                        }
                        object2 = n24;
                        n17 = 0;
                        object3 = null;
                    }
                    if (object3 != null) {
                        n14 = 1;
                    }
                    String string3 = "tenc atom is mandatory";
                    s70_0.a(string3, n14 != 0);
                    n14 = gz3.a;
                    object3 = Pair.create((Object)object2, (Object)object3);
                }
                if (object3 != null) {
                    return object3;
                }
            }
            n8 += n7;
        }
        return null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static JA$f f(Xm2 var0, int var1_1, int var2_2, String var3_3, DrmInitData var4_4, boolean var5_5) {
        var6_6 = var0;
        var7_7 = var3_3;
        var8_8 = var4_4;
        var9_9 = w1_0.d;
        var10_10 = w1_0.b;
        var11_11 /* !! */  = "audio/mhm1";
        var12_12 = "audio/ac4";
        var13_13 = "audio/eac3";
        var14_14 = 0L;
        var0.I(12);
        var16_15 = var0.i();
        var17_16 = new JA$f(var16_15);
        var18_17 /* !! */  = 0;
        var19_18 = null;
        while (var18_17 /* !! */  < var16_15) {
            block206: {
                block218: {
                    block216: {
                        block236: {
                            block235: {
                                block226: {
                                    block227: {
                                        block233: {
                                            block228: {
                                                block234: {
                                                    block231: {
                                                        block232: {
                                                            block229: {
                                                                block230: {
                                                                    block221: {
                                                                        block219: {
                                                                            block225: {
                                                                                block207: {
                                                                                    block224: {
                                                                                        block223: {
                                                                                            block222: {
                                                                                                block220: {
                                                                                                    block217: {
                                                                                                        var20_19 = var6_6.b;
                                                                                                        var21_20 = var0.i();
                                                                                                        if (var21_20 > 0) {
                                                                                                            var22_21 = 1;
                                                                                                        } else {
                                                                                                            var22_21 = 0;
                                                                                                            var23_22 = null;
                                                                                                        }
                                                                                                        var24_23 = "childAtomSize must be positive";
                                                                                                        s70_0.a((String)var24_23, (boolean)var22_21);
                                                                                                        var22_21 = var0.i();
                                                                                                        var25_24 = 1635148593;
                                                                                                        if (var22_21 == var25_24 || var22_21 == (var25_24 = 1635148595) || var22_21 == (var25_24 = 1701733238) || var22_21 == (var25_24 = 1831958048) || var22_21 == (var25_24 = 1836070006) || var22_21 == (var25_24 = 1752589105) || var22_21 == (var25_24 = 1751479857) || var22_21 == (var25_24 = 1932670515) || var22_21 == (var25_24 = 1211250227) || var22_21 == (var25_24 = 1748121139) || var22_21 == (var25_24 = 1987063864) || var22_21 == (var25_24 = 1987063865) || var22_21 == (var25_24 = 1635135537) || var22_21 == (var25_24 = 1685479798) || var22_21 == (var25_24 = 1685479729) || var22_21 == (var25_24 = 1685481573)) break block216;
                                                                                                        var25_24 = 1685481521;
                                                                                                        if (var22_21 != var25_24) break block217;
                                                                                                        var26_25 = var16_15;
                                                                                                        var27_26 = var11_11 /* !! */ ;
                                                                                                        var28_27 = var18_17 /* !! */ ;
                                                                                                        var8_8 = var7_7;
                                                                                                        var29_28 = var20_19;
                                                                                                        var30_29 = var21_20;
                                                                                                        var31_30 = 8;
                                                                                                        var32_31 = 10;
                                                                                                        var33_32 = 2;
                                                                                                        var34_33 = 7;
                                                                                                        var35_34 = var6_6;
                                                                                                        var36_35 = 0;
                                                                                                        var6_6 = null;
                                                                                                        break block218;
                                                                                                    }
                                                                                                    var25_24 = 1836069985;
                                                                                                    var37_36 = 1700998451;
                                                                                                    var38_37 /* !! */  = 1633889587;
                                                                                                    var39_38 = 2.6191674E20f;
                                                                                                    var32_31 = 1701733217;
                                                                                                    var40_39 = 1634492771;
                                                                                                    if (var22_21 == var25_24 || var22_21 == var32_31 || var22_21 == var38_37 /* !! */  || var22_21 == var37_36 || var22_21 == (var25_24 = 1633889588) || var22_21 == (var25_24 = 1835823201) || var22_21 == (var25_24 = 1685353315) || var22_21 == (var25_24 = 1685353317) || var22_21 == (var25_24 = 1685353320) || var22_21 == (var25_24 = 1685353324) || var22_21 == (var25_24 = 1685353336) || var22_21 == (var25_24 = 1935764850) || var22_21 == (var25_24 = 1935767394) || var22_21 == (var25_24 = 1819304813) || var22_21 == (var25_24 = 1936684916) || var22_21 == (var25_24 = 1953984371) || var22_21 == (var25_24 = 778924082) || var22_21 == (var25_24 = 778924083) || var22_21 == (var25_24 = 1835557169) || var22_21 == (var25_24 = 1835560241) || var22_21 == var40_39 || var22_21 == (var25_24 = 1634492791) || var22_21 == (var25_24 = 1970037111) || var22_21 == (var25_24 = 1332770163) || var22_21 == (var25_24 = 1716281667)) break block219;
                                                                                                    var25_24 = 1767992678;
                                                                                                    if (var22_21 != var25_24) break block220;
                                                                                                    var25_24 = 16;
                                                                                                    break block221;
                                                                                                }
                                                                                                var25_24 = 1664495672;
                                                                                                var40_39 = 1937010800;
                                                                                                var41_40 = 0x77767474;
                                                                                                var37_36 = 1954034535;
                                                                                                var38_37 /* !! */  = 1414810956;
                                                                                                var39_38 = 3.6473196E12f;
                                                                                                if (var22_21 == var38_37 /* !! */  || var22_21 == var37_36 || var22_21 == var41_40 || var22_21 == var40_39 || var22_21 == var25_24) break block222;
                                                                                                var32_31 = 1835365492;
                                                                                                if (var22_21 == var32_31) {
                                                                                                    var25_24 = 16;
                                                                                                    var40_39 = var20_19 + 16;
                                                                                                    var6_6.I(var40_39);
                                                                                                    if (var22_21 == var32_31) {
                                                                                                        var0.r();
                                                                                                        var42_41 = var0.r();
                                                                                                        if (var42_41 != null) {
                                                                                                            var43_42 = new d$a();
                                                                                                            var43_42.a = var24_23 = Integer.toString(var1_1);
                                                                                                            var43_42.n = var42_41 = ip1_0.l((String)var42_41);
                                                                                                            var17_16.b = var42_41 = new d((d$a)var43_42);
                                                                                                        }
                                                                                                    }
lbl78:
                                                                                                    // 7 sources

                                                                                                    while (true) {
                                                                                                        var44_43 = var16_15;
                                                                                                        var45_44 = var11_11 /* !! */ ;
                                                                                                        var34_33 = var18_17 /* !! */ ;
                                                                                                        var8_8 = var7_7;
                                                                                                        var29_28 = var20_19;
                                                                                                        var30_29 = var21_20;
                                                                                                        var31_30 = 8;
                                                                                                        var32_31 = 10;
                                                                                                        var21_20 = 16;
                                                                                                        var46_45 = 12;
                                                                                                        var33_32 = 2;
                                                                                                        var47_46 = 1835365492;
                                                                                                        var48_47 = 0;
                                                                                                        var35_34 = var6_6;
                                                                                                        var36_35 = 0;
                                                                                                        var6_6 = null;
                                                                                                        break block206;
                                                                                                        break;
                                                                                                    }
                                                                                                }
                                                                                                var25_24 = 1667329389;
                                                                                                if (var22_21 == var25_24) {
                                                                                                    var42_41 = new d$a();
                                                                                                    var43_42 = Integer.toString(var1_1);
                                                                                                    var42_41.a = var43_42;
                                                                                                    var43_42 = ip1_0.l("application/x-camera-motion");
                                                                                                    var42_41.n = var43_42;
                                                                                                    var43_42 = new d((d$a)var42_41);
                                                                                                    var17_16.b = var43_42;
                                                                                                }
                                                                                                ** GOTO lbl78
                                                                                            }
                                                                                            var32_31 = var20_19 + 16;
                                                                                            var6_6.I(var32_31);
                                                                                            var49_48 = "application/ttml+xml";
                                                                                            var50_49 = 0x7FFFFFFFFFFFFFFFL;
                                                                                            if (var22_21 == var38_37 /* !! */ ) lbl-1000:
                                                                                            // 3 sources

                                                                                            {
                                                                                                while (true) {
                                                                                                    var52_50 = var50_49;
lbl114:
                                                                                                    // 2 sources

                                                                                                    while (true) {
                                                                                                        var25_24 = 0;
                                                                                                        var42_41 = null;
                                                                                                        break block207;
                                                                                                        break;
                                                                                                    }
                                                                                                    break;
                                                                                                }
                                                                                            }
                                                                                            if (var22_21 != var37_36) break block223;
                                                                                            var25_24 = var21_20 + -16;
                                                                                            var43_42 = new byte[var25_24];
                                                                                            var41_40 = 0;
                                                                                            var24_23 = null;
                                                                                            var6_6.g(0, (byte[])var43_42, var25_24);
                                                                                            var42_41 = ImmutableList.of(var43_42);
                                                                                            var49_48 = "application/x-quicktime-tx3g";
                                                                                            var52_50 = var50_49;
                                                                                            break block207;
                                                                                        }
                                                                                        if (var22_21 != var41_40) break block224;
                                                                                        var49_48 = "application/x-mp4-vtt";
                                                                                        ** GOTO lbl-1000
                                                                                    }
                                                                                    if (var22_21 == var40_39) {
                                                                                        var52_50 = var14_14;
                                                                                        ** continue;
                                                                                    }
                                                                                    if (var22_21 == var25_24) {
                                                                                        var17_16.d = var25_24 = 1;
                                                                                        var49_48 = "application/x-mp4-cea-608";
                                                                                        ** continue;
                                                                                    }
                                                                                    break block225;
                                                                                }
                                                                                var54_51 /* !! */  = new d$a();
                                                                                var55_52 = Integer.toString(var1_1);
                                                                                var54_51 /* !! */ .a = var55_52;
                                                                                var55_52 = ip1_0.l(var49_48);
                                                                                var54_51 /* !! */ .n = var55_52;
                                                                                var54_51 /* !! */ .d = var7_7;
                                                                                var54_51 /* !! */ .s = var52_50;
                                                                                var54_51 /* !! */ .q = var42_41;
                                                                                var17_16.b = var42_41 = new d((d$a)var54_51 /* !! */ );
                                                                                ** continue;
                                                                            }
                                                                            var42_41 = new IllegalStateException();
                                                                            throw var42_41;
                                                                        }
                                                                        var25_24 = 16;
                                                                    }
                                                                    var40_39 = var20_19 + 16;
                                                                    var6_6.I(var40_39);
                                                                    var25_24 = 6;
                                                                    if (var5_5) {
                                                                        var40_39 = var0.C();
                                                                        var6_6.J(var25_24);
                                                                    } else {
                                                                        var6_6.J(8);
                                                                        var40_39 = 0;
                                                                        var43_42 = null;
                                                                    }
                                                                    var37_36 = 24;
                                                                    var38_37 /* !! */  = 4;
                                                                    var39_38 = 5.6E-45f;
                                                                    if (var40_39 == 0 || var40_39 == (var32_31 = 1)) break block226;
                                                                    var32_31 = 2;
                                                                    if (var40_39 != var32_31) break block227;
                                                                    var6_6.J(16);
                                                                    var56_53 = var0.q();
                                                                    var58_54 = Double.longBitsToDouble(var56_53);
                                                                    var60_55 = Math.round(var58_54);
                                                                    var40_39 = (int)var60_55;
                                                                    var25_24 = var0.A();
                                                                    var6_6.J(var38_37 /* !! */ );
                                                                    var32_31 = var0.A();
                                                                    var62_56 = var0.A();
                                                                    var48_47 = 1;
                                                                    var63_57 = var62_56 & 1;
                                                                    var63_57 = var63_57 != 0 ? 1 : 0;
                                                                    var62_56 = (var62_56 &= 2) != 0 ? 1 : 0;
                                                                    if (var63_57 != 0) break block228;
                                                                    var38_37 /* !! */  = 8;
                                                                    var39_38 = 1.1E-44f;
                                                                    if (var32_31 == var38_37 /* !! */ ) {
                                                                        var38_37 /* !! */  = 3;
                                                                        var39_38 = 4.2E-45f;
lbl193:
                                                                        // 9 sources

                                                                        while (true) {
                                                                            continue;
                                                                            break;
                                                                        }
                                                                    }
                                                                    var38_37 /* !! */  = 16;
                                                                    var39_38 = 2.2E-44f;
                                                                    if (var32_31 != var38_37 /* !! */ ) break block229;
                                                                    if (var62_56 == 0) break block230;
                                                                    var38_37 /* !! */  = 0x10000000;
                                                                    var39_38 = 2.524355E-29f;
                                                                    ** GOTO lbl193
                                                                }
                                                                var38_37 /* !! */  = 2;
                                                                var39_38 = 2.8E-45f;
                                                                ** GOTO lbl193
                                                            }
                                                            if (var32_31 != var37_36) break block231;
                                                            if (var62_56 == 0) break block232;
                                                            var38_37 /* !! */  = 0x50000000;
                                                            var39_38 = 8.589935E9f;
                                                            ** GOTO lbl193
                                                        }
                                                        var38_37 /* !! */  = 21;
                                                        var39_38 = 2.9E-44f;
                                                        ** GOTO lbl193
                                                    }
                                                    var38_37 /* !! */  = 32;
                                                    var39_38 = 4.5E-44f;
                                                    if (var32_31 != var38_37 /* !! */ ) break block233;
                                                    if (var62_56 == 0) break block234;
                                                    var38_37 /* !! */  = 0x60000000;
                                                    var39_38 = 3.689349E19f;
                                                    ** GOTO lbl193
                                                }
                                                var38_37 /* !! */  = 22;
                                                var39_38 = 3.1E-44f;
                                                ** GOTO lbl193
                                            }
                                            var38_37 /* !! */  = 32;
                                            var39_38 = 4.5E-44f;
                                            if (var32_31 != var38_37 /* !! */ ) break block233;
                                            var38_37 /* !! */  = 4;
                                            var39_38 = 5.6E-45f;
                                            ** GOTO lbl193
                                        }
                                        var38_37 /* !! */  = -1;
                                        var39_38 = 0.0f / 0.0f;
                                        ** continue;
                                        var32_31 = 8;
                                        var6_6.J(var32_31);
                                        var37_36 = var40_39;
                                        var32_31 = 1767992678;
                                        var40_39 = var25_24;
                                        var25_24 = 0;
                                        var42_41 = null;
                                        break block235;
                                    }
                                    var26_25 = var16_15;
                                    var27_26 = var11_11 /* !! */ ;
                                    var28_27 = var18_17 /* !! */ ;
                                    var8_8 = var7_7;
                                    var29_28 = var20_19;
                                    var30_29 = var21_20;
                                    var33_32 = 2;
                                    var34_33 = 7;
                                    var35_34 = var6_6;
                                    var36_35 = 0;
                                    var6_6 = null;
                                    break block236;
                                }
                                var25_24 = var0.C();
                                var39_38 = 8.4E-45f;
                                var6_6.J(6);
                                var38_37 /* !! */  = var0.x();
                                var32_31 = var6_6.b;
                                var62_56 = 4;
                                var6_6.I(var32_31 += -4);
                                var32_31 = var0.i();
                                var37_36 = 1;
                                if (var40_39 == var37_36) {
                                    var40_39 = 16;
                                    var6_6.J(var40_39);
                                }
                                var40_39 = var25_24;
                                var37_36 = var38_37 /* !! */ ;
                                var25_24 = var32_31;
                                var38_37 /* !! */  = -1;
                                var39_38 = 0.0f / 0.0f;
                                var32_31 = 1767992678;
                            }
                            if (var22_21 == var32_31) {
                                var40_39 = -1;
                                var37_36 = -1;
                            }
                            var32_31 = var6_6.b;
                            var63_57 = var40_39;
                            var40_39 = 1701733217;
                            if (var22_21 == var40_39) {
                                var43_42 = JA.e((Xm2)var6_6, var20_19, var21_20);
                                if (var43_42 != null) {
                                    var23_22 = (Integer)var43_42.first;
                                    var22_21 = var23_22.intValue();
                                    if (var8_8 == null) {
                                        var26_25 = var16_15;
                                        var16_15 = 0;
                                        var64_58 = null;
                                    } else {
                                        var26_25 = var16_15;
                                        var64_58 = ((op3)var43_42.second).b;
                                        var64_58 = var8_8.a((String)var64_58);
                                    }
                                    var43_42 = (op3)var43_42.second;
                                    var65_59 = var64_58;
                                    var17_16.a[var18_17 /* !! */ ] = var43_42;
                                    var64_58 = var65_59;
                                } else {
                                    var26_25 = var16_15;
                                    var64_58 = var8_8;
                                }
                                var6_6.I(var32_31);
                            } else {
                                var26_25 = var16_15;
                                var64_58 = var8_8;
                            }
                            var43_42 = "audio/ac3";
                            var66_60 = var37_36;
                            var37_36 = 1633889587;
                            if (var22_21 == var37_36) {
                                var54_51 /* !! */  = var43_42;
                            } else {
                                var37_36 = 1700998451;
                                if (var22_21 == var37_36) {
                                    var54_51 /* !! */  = var13_13;
                                } else {
                                    var37_36 = 1633889588;
                                    if (var22_21 == var37_36) {
                                        var54_51 /* !! */  = var12_12;
                                    } else {
                                        var37_36 = 1685353315;
                                        if (var22_21 == var37_36) {
                                            var54_51 /* !! */  = "audio/vnd.dts";
                                        } else {
                                            var37_36 = 1685353320;
                                            if (var22_21 != var37_36 && var22_21 != (var37_36 = 1685353324)) {
                                                var37_36 = 1685353317;
                                                if (var22_21 == var37_36) {
                                                    var54_51 /* !! */  = "audio/vnd.dts.hd;profile=lbr";
                                                } else {
                                                    var37_36 = 1685353336;
                                                    if (var22_21 == var37_36) {
                                                        var54_51 /* !! */  = "audio/vnd.dts.uhd;profile=p2";
                                                    } else {
                                                        var37_36 = 1935764850;
                                                        if (var22_21 == var37_36) {
                                                            var54_51 /* !! */  = "audio/3gpp";
                                                        } else {
                                                            var37_36 = 1935767394;
                                                            if (var22_21 == var37_36) {
                                                                var54_51 /* !! */  = "audio/amr-wb";
                                                            } else {
                                                                var67_61 /* !! */  = var54_51 /* !! */  = "audio/raw";
                                                                var37_36 = 1936684916;
                                                                if (var22_21 == var37_36) lbl-1000:
                                                                // 2 sources

                                                                {
                                                                    while (true) {
                                                                        var54_51 /* !! */  = var67_61 /* !! */ ;
                                                                        var38_37 /* !! */  = 2;
                                                                        var39_38 = 2.8E-45f;
                                                                        break;
                                                                    }
                                                                } else {
                                                                    var37_36 = 1953984371;
                                                                    if (var22_21 == var37_36) {
                                                                        var38_37 /* !! */  = 0x10000000;
                                                                        var39_38 = 2.524355E-29f;
                                                                    } else {
                                                                        var37_36 = 1819304813;
                                                                        if (var22_21 == var37_36) {
                                                                            var37_36 = -1;
                                                                            if (var38_37 /* !! */  == var37_36) {
                                                                                ** continue;
                                                                            }
                                                                        } else {
                                                                            var37_36 = 778924082;
                                                                            if (var22_21 != var37_36 && var22_21 != (var37_36 = 778924083)) {
                                                                                var37_36 = 1835557169;
                                                                                if (var22_21 == var37_36) {
                                                                                    var54_51 /* !! */  = "audio/mha1";
                                                                                } else {
                                                                                    var37_36 = 1835560241;
                                                                                    if (var22_21 == var37_36) {
                                                                                        var54_51 /* !! */  = var11_11 /* !! */ ;
                                                                                    } else {
                                                                                        var37_36 = 1634492771;
                                                                                        if (var22_21 == var37_36) {
                                                                                            var54_51 /* !! */  = "audio/alac";
                                                                                        } else {
                                                                                            var37_36 = 1634492791;
                                                                                            if (var22_21 == var37_36) {
                                                                                                var54_51 /* !! */  = "audio/g711-alaw";
                                                                                            } else {
                                                                                                var37_36 = 1970037111;
                                                                                                if (var22_21 == var37_36) {
                                                                                                    var54_51 /* !! */  = "audio/g711-mlaw";
                                                                                                } else {
                                                                                                    var37_36 = 1332770163;
                                                                                                    if (var22_21 == var37_36) {
                                                                                                        var54_51 /* !! */  = "audio/opus";
                                                                                                    } else {
                                                                                                        var37_36 = 1716281667;
                                                                                                        if (var22_21 == var37_36) {
                                                                                                            var54_51 /* !! */  = "audio/flac";
                                                                                                        } else {
                                                                                                            var37_36 = 1835823201;
                                                                                                            if (var22_21 == var37_36) {
                                                                                                                var54_51 /* !! */  = "audio/true-hd";
                                                                                                            } else {
                                                                                                                var37_36 = 1767992678;
                                                                                                                if (var22_21 == var37_36) {
                                                                                                                    var54_51 /* !! */  = "audio/iamf";
                                                                                                                } else {
                                                                                                                    var37_36 = 0;
                                                                                                                    var54_51 /* !! */  = null;
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            } else {
                                                                                var54_51 /* !! */  = "audio/mpeg";
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            } else {
                                                var54_51 /* !! */  = "audio/vnd.dts.hd";
                                            }
                                        }
                                    }
                                }
                            }
                            var68_62 = var38_37 /* !! */ ;
                            var69_63 = var39_38;
                            var28_27 = var18_17 /* !! */ ;
                            var18_17 /* !! */  = var63_57;
                            var22_21 = var66_60;
                            var38_37 /* !! */  = 0;
                            var39_38 = 0.0f;
                            var55_52 = null;
                            var70_64 = null;
                            var71_65 /* !! */  = null;
                            while ((var72_66 = var32_31 - var20_19) < var21_20) {
                                block208: {
                                    block237: {
                                        block209: {
                                            block258: {
                                                block259: {
                                                    block256: {
                                                        block257: {
                                                            block239: {
                                                                block240: {
                                                                    block255: {
                                                                        block212: {
                                                                            block254: {
                                                                                block250: {
                                                                                    block253: {
                                                                                        block252: {
                                                                                            block251: {
                                                                                                block211: {
                                                                                                    block238: {
                                                                                                        var6_6.I(var32_31);
                                                                                                        var72_66 = var0.i();
                                                                                                        var30_29 = var21_20;
                                                                                                        if (var72_66 > 0) {
                                                                                                            var21_20 = 1;
                                                                                                        } else {
                                                                                                            var21_20 = 0;
                                                                                                            var73_67 = null;
                                                                                                        }
                                                                                                        s70_0.a((String)var24_23, (boolean)var21_20);
                                                                                                        var21_20 = var0.i();
                                                                                                        var29_28 = var20_19;
                                                                                                        var20_19 = 1835557187;
                                                                                                        if (var21_20 == var20_19) {
                                                                                                            var21_20 = var32_31 + 8;
                                                                                                            var6_6.I(var21_20);
                                                                                                            var20_19 = 1;
                                                                                                            var6_6.J(var20_19);
                                                                                                            var21_20 = var0.w();
                                                                                                            var6_6.J(var20_19);
                                                                                                            var48_47 = Objects.equals(var54_51 /* !! */ , var11_11 /* !! */ );
                                                                                                            if (var48_47 != 0) {
                                                                                                                var73_67 = var21_20;
                                                                                                                var27_26 = var11_11 /* !! */ ;
                                                                                                                var11_11 /* !! */  = new Object[var20_19];
                                                                                                                var20_19 = 0;
                                                                                                                var35_34 = null;
                                                                                                                var11_11 /* !! */ [0] = var73_67;
                                                                                                                var73_67 = "mhm1.%02X";
                                                                                                                var11_11 /* !! */  = String.format((String)var73_67, var11_11 /* !! */ );
                                                                                                                var74_68 /* !! */  = var24_23;
                                                                                                                var24_23 = var11_11 /* !! */ ;
                                                                                                            } else {
                                                                                                                var27_26 = var11_11 /* !! */ ;
                                                                                                                var20_19 = 0;
                                                                                                                var35_34 = null;
                                                                                                                var11_11 /* !! */  = var21_20;
                                                                                                                var74_68 /* !! */  = var24_23;
                                                                                                                var21_20 = 1;
                                                                                                                var24_23 = new Object[var21_20];
                                                                                                                var24_23[0] = var11_11 /* !! */ ;
                                                                                                                var11_11 /* !! */  = "mha1.%02X";
                                                                                                                var24_23 = String.format((String)var11_11 /* !! */ , (Object[])var24_23);
                                                                                                            }
                                                                                                            var75_69 = var0.C();
                                                                                                            var73_67 = new byte[var75_69];
                                                                                                            var6_6.g(0, (byte[])var73_67, var75_69);
                                                                                                            if (var55_52 == null) {
                                                                                                                var55_52 = ImmutableList.of(var73_67);
                                                                                                            } else {
                                                                                                                var55_52 = (byte[])var55_52.get(0);
                                                                                                                var55_52 = ImmutableList.of(var73_67, var55_52);
                                                                                                            }
                                                                                                            var76_70 /* !! */  = var43_42;
                                                                                                            var70_64 = var24_23;
lbl472:
                                                                                                            // 2 sources

                                                                                                            while (true) {
                                                                                                                var77_71 /* !! */  = var54_51 /* !! */ ;
                                                                                                                var35_34 = var6_6;
                                                                                                                var75_69 = var72_66;
                                                                                                                var37_36 = var32_31;
                                                                                                                var78_72 = var74_68 /* !! */ ;
                                                                                                                var36_35 = 0;
                                                                                                                var6_6 = null;
                                                                                                                var33_32 = 2;
                                                                                                                var34_33 = 7;
                                                                                                                var32_31 = var25_24;
                                                                                                                var8_8 = var7_7;
                                                                                                                break block208;
                                                                                                                break;
                                                                                                            }
                                                                                                        }
                                                                                                        var74_68 /* !! */  = var24_23;
                                                                                                        var27_26 = var11_11 /* !! */ ;
                                                                                                        var41_40 = 1835557200;
                                                                                                        if (var21_20 == var41_40) {
                                                                                                            var75_69 = var32_31 + 8;
                                                                                                            var6_6.I(var75_69);
                                                                                                            var41_40 = var0.w();
                                                                                                            if (var41_40 > 0) {
                                                                                                                var11_11 /* !! */  = new byte[var41_40];
                                                                                                                var20_19 = 0;
                                                                                                                var35_34 = null;
                                                                                                                var6_6.g(0, (byte[])var11_11 /* !! */ , var41_40);
                                                                                                                if (var55_52 == null) {
                                                                                                                    var55_52 = ImmutableList.of(var11_11 /* !! */ );
                                                                                                                } else {
                                                                                                                    var24_23 = (byte[])var55_52.get(0);
                                                                                                                    var55_52 = ImmutableList.of(var24_23, var11_11 /* !! */ );
                                                                                                                }
                                                                                                            }
                                                                                                            var76_70 /* !! */  = var43_42;
                                                                                                            ** continue;
                                                                                                        }
                                                                                                        var41_40 = 1702061171;
                                                                                                        if (var21_20 == var41_40 || var5_5 && var21_20 == (var75_69 = 2002876005)) break block237;
                                                                                                        var41_40 = 1684103987;
                                                                                                        if (var21_20 == var41_40) {
                                                                                                            var75_69 = var32_31 + 8;
                                                                                                            var6_6.I(var75_69);
                                                                                                            var11_11 /* !! */  = Integer.toString(var1_1);
                                                                                                            var35_34 = new Vm2();
                                                                                                            var35_34.l((Xm2)var6_6);
                                                                                                            var47_46 = var35_34.g(2);
                                                                                                            var21_20 = var10_10[var47_46];
                                                                                                            var35_34.o(8);
                                                                                                            var82_76 = var35_34.g(3);
                                                                                                            var41_40 = var9_9[var82_76];
                                                                                                            var79_73 = var55_52;
                                                                                                            var38_37 /* !! */  = 1;
                                                                                                            var39_38 = 1.4E-45f;
                                                                                                            var48_47 = var35_34.g(var38_37 /* !! */ );
                                                                                                            if (var48_47 != 0) {
                                                                                                                var41_40 += var38_37 /* !! */ ;
                                                                                                            }
                                                                                                            var39_38 = 7.0E-45f;
                                                                                                            var83_77 = var35_34.g(5);
                                                                                                            var55_52 = w1_0.e;
                                                                                                            var38_37 /* !! */  = (int)(var55_52[var83_77] * 1000);
                                                                                                            var35_34.c();
                                                                                                            var20_19 = var35_34.d();
                                                                                                            var6_6.I(var20_19);
                                                                                                            var35_34 = new d$a();
                                                                                                            var35_34.a = var11_11 /* !! */ ;
                                                                                                            var35_34.n = var11_11 /* !! */  = ip1_0.l((String)var43_42);
                                                                                                            var35_34.C = var41_40;
                                                                                                            var35_34.D = var21_20;
                                                                                                            var35_34.r = var64_58;
                                                                                                            var35_34.d = var7_7;
                                                                                                            var35_34.h = var38_37 /* !! */ ;
                                                                                                            var35_34.i = var38_37 /* !! */ ;
                                                                                                            var17_16.b = var24_23 = new d((d$a)var35_34);
                                                                                                            var76_70 /* !! */  = var43_42;
                                                                                                            var77_71 /* !! */  = var54_51 /* !! */ ;
                                                                                                            var41_40 = var22_21;
                                                                                                            var40_39 = var18_17 /* !! */ ;
                                                                                                            var35_34 = var6_6;
                                                                                                            var80_74 = var72_66;
                                                                                                            var81_75 = var32_31;
lbl548:
                                                                                                            // 2 sources

                                                                                                            while (true) {
                                                                                                                var37_36 = 16;
                                                                                                                var38_37 /* !! */  = 12;
                                                                                                                var39_38 = 1.7E-44f;
                                                                                                                var75_69 = 4;
                                                                                                                var22_21 = 3;
                                                                                                                var18_17 /* !! */  = 5;
                                                                                                                var36_35 = 13;
                                                                                                                var33_32 = 2;
                                                                                                                var34_33 = 7;
                                                                                                                var32_31 = var25_24;
                                                                                                                var8_8 = var7_7;
                                                                                                                var31_30 = 66;
                                                                                                                break block209;
                                                                                                                break;
                                                                                                            }
                                                                                                        }
                                                                                                        var79_73 = var55_52;
                                                                                                        var41_40 = 1684366131;
                                                                                                        if (var21_20 != var41_40) break block238;
                                                                                                        var41_40 = 8;
                                                                                                        var38_37 /* !! */  = var32_31 + 8;
                                                                                                        var6_6.I(var38_37 /* !! */ );
                                                                                                        var24_23 = Integer.toString(var1_1);
                                                                                                        var55_52 = new Vm2();
                                                                                                        var55_52.l((Xm2)var6_6);
                                                                                                        var20_19 = var55_52.g(13) * 1000;
                                                                                                        var75_69 = 3;
                                                                                                        var55_52.o(var75_69);
                                                                                                        var83_77 = var55_52.g(2);
                                                                                                        var21_20 = var10_10[var83_77];
                                                                                                        var76_70 /* !! */  = var43_42;
                                                                                                        var55_52.o(10);
                                                                                                        var40_39 = var55_52.g(var75_69);
                                                                                                        var40_39 = var9_9[var40_39];
                                                                                                        var75_69 = 1;
                                                                                                        var48_47 = var55_52.g(var75_69);
                                                                                                        if (var48_47 != 0) {
                                                                                                            var40_39 += var75_69;
                                                                                                        }
                                                                                                        var55_52.o(3);
                                                                                                        var84_78 = var55_52.g(4);
                                                                                                        var75_69 = 1;
                                                                                                        var55_52.o(var75_69);
                                                                                                        if (var84_78 > 0) {
                                                                                                            var48_47 = var32_31;
                                                                                                            var55_52.o(6);
                                                                                                            var48_47 = var55_52.g(var75_69);
                                                                                                            if (var48_47 != 0) {
                                                                                                                var40_39 += 2;
                                                                                                            }
                                                                                                            var55_52.o(var75_69);
                                                                                                        }
                                                                                                        var75_69 = var55_52.b();
                                                                                                        var84_78 = var22_21;
                                                                                                        var22_21 = 7;
                                                                                                        if (var75_69 <= var22_21) ** GOTO lbl-1000
                                                                                                        var55_52.o(var22_21);
                                                                                                        var75_69 = 1;
                                                                                                        var22_21 = var55_52.g(var75_69);
                                                                                                        if (var22_21 != 0) {
                                                                                                            var11_11 /* !! */  = "audio/eac3-joc";
                                                                                                        } else lbl-1000:
                                                                                                        // 2 sources

                                                                                                        {
                                                                                                            var11_11 /* !! */  = var13_13;
                                                                                                        }
                                                                                                        var55_52.c();
                                                                                                        var38_37 /* !! */  = var55_52.d();
                                                                                                        var6_6.I(var38_37 /* !! */ );
                                                                                                        var55_52 = new d$a();
                                                                                                        var55_52.a = var24_23;
                                                                                                        var55_52.n = var24_23 = ip1_0.l((String)var11_11 /* !! */ );
                                                                                                        var55_52.C = var40_39;
                                                                                                        var55_52.D = var21_20;
                                                                                                        var55_52.r = var64_58;
                                                                                                        var55_52.d = var7_7;
                                                                                                        var55_52.i = var20_19;
                                                                                                        var17_16.b = var43_42 = new d((d$a)var55_52);
                                                                                                        var77_71 /* !! */  = var54_51 /* !! */ ;
                                                                                                        var40_39 = var18_17 /* !! */ ;
                                                                                                        var35_34 = var6_6;
                                                                                                        var80_74 = var72_66;
                                                                                                        var81_75 = var32_31;
                                                                                                        var41_40 = var84_78;
                                                                                                        ** continue;
                                                                                                    }
                                                                                                    var76_70 /* !! */  = var43_42;
                                                                                                    var84_78 = var22_21;
                                                                                                    var40_39 = 1684103988;
                                                                                                    if (var21_20 != var40_39) break block239;
                                                                                                    var40_39 = 8;
                                                                                                    var41_40 = var32_31 + 8;
                                                                                                    var6_6.I(var41_40);
                                                                                                    var43_42 = Integer.toString(var1_1);
                                                                                                    var24_23 = new Vm2();
                                                                                                    var24_23.l((Xm2)var6_6);
                                                                                                    var38_37 /* !! */  = var24_23.b();
                                                                                                    var22_21 = var24_23.g(3);
                                                                                                    var75_69 = 1;
                                                                                                    if (var22_21 > var75_69) break block240;
                                                                                                    var21_20 = var24_23.g(7);
                                                                                                    var20_19 = (int)var24_23.f();
                                                                                                    if (var20_19 != 0) {
                                                                                                        var20_19 = 48000;
lbl644:
                                                                                                        // 2 sources

                                                                                                        while (true) {
                                                                                                            continue;
                                                                                                            break;
                                                                                                        }
                                                                                                    }
                                                                                                    var20_19 = 44100;
                                                                                                    ** continue;
                                                                                                    var75_69 = 4;
                                                                                                    var24_23.o(var75_69);
                                                                                                    var85_79 = var18_17 /* !! */ ;
                                                                                                    var18_17 /* !! */  = var24_23.g(9);
                                                                                                    var75_69 = 1;
                                                                                                    if (var21_20 > var75_69) {
                                                                                                        if (var22_21 != 0) {
                                                                                                            var75_69 = (int)var24_23.f();
                                                                                                            if (var75_69 != 0) {
                                                                                                                var24_23.o(16);
                                                                                                                var75_69 = (int)var24_23.f();
                                                                                                                if (var75_69 != 0) {
                                                                                                                    var75_69 = 128;
                                                                                                                    var24_23.o(var75_69);
                                                                                                                }
                                                                                                            }
                                                                                                            var75_69 = 1;
                                                                                                        } else {
                                                                                                            var42_41 = new StringBuilder("Invalid AC-4 DSI version: ");
                                                                                                            var42_41.append(var22_21);
                                                                                                            throw ParserException.b(var42_41.toString());
                                                                                                        }
                                                                                                    }
                                                                                                    if (var22_21 == var75_69) {
                                                                                                        var75_69 = var24_23.b();
                                                                                                        if (var75_69 >= (var21_20 = 66)) {
                                                                                                            var24_23.o(var21_20);
                                                                                                            var24_23.c();
                                                                                                        } else {
                                                                                                            throw ParserException.b("Invalid AC-4 DSI bitrate.");
                                                                                                        }
                                                                                                    }
                                                                                                    var11_11 /* !! */  = new Object();
                                                                                                    var11_11 /* !! */ .a = true;
                                                                                                    var11_11 /* !! */ .b = var21_20 = -1;
                                                                                                    var11_11 /* !! */ .c = var21_20;
                                                                                                    var11_11 /* !! */ .d = true;
                                                                                                    var11_11 /* !! */ .e = 2;
                                                                                                    var11_11 /* !! */ .f = 0;
                                                                                                    var77_71 /* !! */  = var54_51 /* !! */ ;
                                                                                                    var73_67 = null;
                                                                                                    for (var21_20 = 0; var21_20 < var18_17 /* !! */ ; ++var21_20) {
                                                                                                        block249: {
                                                                                                            block242: {
                                                                                                                block210: {
                                                                                                                    block247: {
                                                                                                                        block248: {
                                                                                                                            block246: {
                                                                                                                                block243: {
                                                                                                                                    block244: {
                                                                                                                                        block245: {
                                                                                                                                            block241: {
                                                                                                                                                if (var22_21 == 0) {
                                                                                                                                                    var18_17 /* !! */  = (int)var24_23.f();
                                                                                                                                                    var37_36 = 5;
                                                                                                                                                    var86_80 = var24_23.g(var37_36);
                                                                                                                                                    var81_75 = var24_23.g(var37_36);
                                                                                                                                                    var87_81 = var25_24;
                                                                                                                                                    var80_74 = var72_66;
                                                                                                                                                    var72_66 = var81_75;
                                                                                                                                                    var37_36 = 0;
                                                                                                                                                    var54_51 /* !! */  = null;
                                                                                                                                                    var36_35 = 0;
                                                                                                                                                    var6_6 = null;
                                                                                                                                                    var81_75 = var32_31;
                                                                                                                                                    var32_31 = var86_80;
                                                                                                                                                    var86_80 = 0;
                                                                                                                                                } else {
                                                                                                                                                    var47_46 = var18_17 /* !! */ ;
                                                                                                                                                    var37_36 = 8;
                                                                                                                                                    var18_17 /* !! */  = var24_23.g(var37_36);
                                                                                                                                                    var36_35 = var24_23.g(var37_36);
                                                                                                                                                    if (var36_35 == (var37_36 = 255)) {
                                                                                                                                                        var37_36 = 16;
                                                                                                                                                        var81_75 = var24_23.g(var37_36) + var36_35;
lbl708:
                                                                                                                                                        // 2 sources

                                                                                                                                                        while (true) {
                                                                                                                                                            continue;
                                                                                                                                                            break;
                                                                                                                                                        }
                                                                                                                                                    }
                                                                                                                                                    var81_75 = var36_35;
                                                                                                                                                    ** continue;
                                                                                                                                                    var37_36 = 2;
                                                                                                                                                    if (var18_17 /* !! */  > var37_36) {
                                                                                                                                                        var37_36 = 8;
                                                                                                                                                        var18_17 /* !! */  = var81_75 * 8;
                                                                                                                                                        var24_23.o(var18_17 /* !! */ );
                                                                                                                                                        var6_6 = var0;
                                                                                                                                                        var18_17 /* !! */  = var47_46;
                                                                                                                                                        continue;
                                                                                                                                                    }
                                                                                                                                                    var36_35 = var24_23.b();
                                                                                                                                                    var36_35 = (var38_37 /* !! */  - var36_35) / 8;
                                                                                                                                                    var86_80 = var18_17 /* !! */ ;
                                                                                                                                                    var18_17 /* !! */  = var24_23.g(5);
                                                                                                                                                    if (var18_17 /* !! */  == (var37_36 = 31)) {
                                                                                                                                                        var37_36 = 1;
                                                                                                                                                    } else {
                                                                                                                                                        var37_36 = 0;
                                                                                                                                                        var54_51 /* !! */  = null;
                                                                                                                                                    }
                                                                                                                                                    var87_81 = var25_24;
                                                                                                                                                    var80_74 = var72_66;
                                                                                                                                                    var72_66 = var86_80;
                                                                                                                                                    var86_80 = var36_35;
                                                                                                                                                    var36_35 = var81_75;
                                                                                                                                                    var81_75 = var32_31;
                                                                                                                                                    var32_31 = var18_17 /* !! */ ;
                                                                                                                                                    var18_17 /* !! */  = 0;
                                                                                                                                                    var19_18 = null;
                                                                                                                                                }
                                                                                                                                                if (var18_17 /* !! */  != 0 || var37_36 != 0 || var32_31 != (var25_24 = 6)) break block241;
                                                                                                                                                var88_82 = var17_16;
                                                                                                                                                var25_24 = 1;
                                                                                                                                                break block242;
                                                                                                                                            }
                                                                                                                                            var88_82 = var17_16;
                                                                                                                                            var11_11 /* !! */ .f = var89_83 = var24_23.g(3);
                                                                                                                                            var25_24 = (int)var24_23.f();
                                                                                                                                            if (var25_24 != 0) {
                                                                                                                                                var25_24 = 5;
                                                                                                                                                var24_23.o(var25_24);
                                                                                                                                            }
                                                                                                                                            var25_24 = 2;
                                                                                                                                            var24_23.o(var25_24);
                                                                                                                                            var89_83 = 1;
                                                                                                                                            if (var22_21 != var89_83 || var72_66 != var89_83 && var72_66 != var25_24) lbl-1000:
                                                                                                                                            // 2 sources

                                                                                                                                            {
                                                                                                                                                while (true) {
                                                                                                                                                    continue;
                                                                                                                                                    break;
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                            var24_23.o(var25_24);
                                                                                                                                            ** continue;
                                                                                                                                            var25_24 = 5;
                                                                                                                                            var24_23.o(var25_24);
                                                                                                                                            var25_24 = 10;
                                                                                                                                            var24_23.o(var25_24);
                                                                                                                                            if (var22_21 != var89_83) break block243;
                                                                                                                                            if (var72_66 > 0) {
                                                                                                                                                var25_24 = (int)var24_23.f();
                                                                                                                                                var11_11 /* !! */ .a = var25_24;
                                                                                                                                            }
                                                                                                                                            if ((var25_24 = (int)var11_11 /* !! */ .a) == 0) break block244;
                                                                                                                                            if (var72_66 != var89_83 && var72_66 != (var25_24 = 2)) lbl-1000:
                                                                                                                                            // 3 sources

                                                                                                                                            {
                                                                                                                                                while (true) {
                                                                                                                                                    continue;
                                                                                                                                                    break;
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                            var25_24 = 5;
                                                                                                                                            var89_83 = var24_23.g(var25_24);
                                                                                                                                            if (var89_83 >= 0 && var89_83 <= (var25_24 = 15)) {
                                                                                                                                                var11_11 /* !! */ .b = var89_83;
                                                                                                                                            }
                                                                                                                                            if (var89_83 < (var25_24 = 11) || var89_83 > (var25_24 = 14)) break block245;
                                                                                                                                            var25_24 = (int)var24_23.f();
                                                                                                                                            var11_11 /* !! */ .d = var25_24;
                                                                                                                                            var25_24 = 2;
                                                                                                                                            var11_11 /* !! */ .e = var89_83 = var24_23.g(var25_24);
                                                                                                                                            ** GOTO lbl-1000
                                                                                                                                        }
                                                                                                                                        var25_24 = 2;
                                                                                                                                        ** continue;
                                                                                                                                        var89_83 = 24;
                                                                                                                                        var24_23.o(var89_83);
lbl784:
                                                                                                                                        // 2 sources

                                                                                                                                        while (true) {
                                                                                                                                            continue;
                                                                                                                                            break;
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                    var25_24 = 2;
                                                                                                                                    ** continue;
                                                                                                                                    var89_83 = 1;
                                                                                                                                    if (var72_66 == var89_83 || var72_66 == var25_24) break block246;
                                                                                                                                }
lbl792:
                                                                                                                                // 3 sources

                                                                                                                                while (true) {
                                                                                                                                    continue;
                                                                                                                                    break;
                                                                                                                                }
                                                                                                                            }
                                                                                                                            var89_83 = (int)var24_23.f();
                                                                                                                            if (var89_83 != 0 && (var89_83 = (int)var24_23.f()) != 0) {
                                                                                                                                var24_23.o(var25_24);
                                                                                                                            }
                                                                                                                            if ((var25_24 = (int)var24_23.f()) == 0) ** GOTO lbl792
                                                                                                                            var24_23.n();
                                                                                                                            var25_24 = 8;
                                                                                                                            var89_83 = var24_23.g(var25_24);
                                                                                                                            var31_30 = 0;
                                                                                                                            var7_7 = null;
                                                                                                                            while (true) {
                                                                                                                                if (var31_30 < var89_83) ** break;
                                                                                                                                ** continue;
                                                                                                                                var24_23.o(var25_24);
                                                                                                                                ++var31_30;
                                                                                                                                var25_24 = 8;
                                                                                                                            }
                                                                                                                            var25_24 = 1;
                                                                                                                            if (var18_17 /* !! */  != 0 || var37_36 != 0) break block247;
                                                                                                                            var24_23.n();
                                                                                                                            if (var32_31 == 0 || var32_31 == var25_24 || var32_31 == (var37_36 = 2)) break block248;
                                                                                                                            var37_36 = 3;
                                                                                                                            if (var32_31 == var37_36 || var32_31 == (var37_36 = 4)) ** GOTO lbl840
                                                                                                                            var37_36 = 5;
                                                                                                                            if (var32_31 != var37_36) {
                                                                                                                                var18_17 /* !! */  = var24_23.g(7);
                                                                                                                                var54_51 /* !! */  = null;
                                                                                                                                for (var37_36 = 0; var37_36 < var18_17 /* !! */ ; var37_36 += var25_24) {
                                                                                                                                    var31_30 = 8;
                                                                                                                                    var24_23.o(var31_30);
                                                                                                                                }
                                                                                                                            } else if (var72_66 == 0) {
                                                                                                                                z1_0.c((Vm2)var24_23, (z1$a)var11_11 /* !! */ );
                                                                                                                            } else {
                                                                                                                                var18_17 /* !! */  = var24_23.g(3);
                                                                                                                                var37_36 = 0;
                                                                                                                                var54_51 /* !! */  = null;
                                                                                                                                while (true) {
                                                                                                                                    var31_30 = 2;
                                                                                                                                    var89_83 = var18_17 /* !! */  + 2;
                                                                                                                                    if (var37_36 < var89_83) {
                                                                                                                                        z1_0.d((Vm2)var24_23, (z1$a)var11_11 /* !! */ );
                                                                                                                                        var37_36 += var25_24;
                                                                                                                                        continue;
                                                                                                                                    }
                                                                                                                                    break block210;
                                                                                                                                    break;
                                                                                                                                }
lbl840:
                                                                                                                                // 1 sources

                                                                                                                                if (var72_66 == 0) {
                                                                                                                                    var54_51 /* !! */  = null;
                                                                                                                                    var18_17 /* !! */  = 3;
                                                                                                                                    for (var37_36 = 0; var37_36 < var18_17 /* !! */ ; var37_36 += var25_24) {
                                                                                                                                        z1_0.c((Vm2)var24_23, (z1$a)var11_11 /* !! */ );
                                                                                                                                    }
                                                                                                                                } else {
                                                                                                                                    var18_17 /* !! */  = 3;
                                                                                                                                    var54_51 /* !! */  = null;
                                                                                                                                    for (var37_36 = 0; var37_36 < var18_17 /* !! */ ; var37_36 += var25_24) {
                                                                                                                                        z1_0.d((Vm2)var24_23, (z1$a)var11_11 /* !! */ );
                                                                                                                                        var18_17 /* !! */  = 3;
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            }
                                                                                                                            break block210;
                                                                                                                        }
                                                                                                                        if (var72_66 == 0) {
                                                                                                                            var54_51 /* !! */  = null;
                                                                                                                            var18_17 /* !! */  = 2;
                                                                                                                            for (var37_36 = 0; var37_36 < var18_17 /* !! */ ; var37_36 += var25_24) {
                                                                                                                                z1_0.c((Vm2)var24_23, (z1$a)var11_11 /* !! */ );
                                                                                                                            }
                                                                                                                        } else {
                                                                                                                            var18_17 /* !! */  = 2;
                                                                                                                            var54_51 /* !! */  = null;
                                                                                                                            for (var37_36 = 0; var37_36 < var18_17 /* !! */ ; var37_36 += var25_24) {
                                                                                                                                z1_0.d((Vm2)var24_23, (z1$a)var11_11 /* !! */ );
                                                                                                                                var18_17 /* !! */  = 2;
                                                                                                                            }
                                                                                                                        }
                                                                                                                        break block210;
                                                                                                                    }
                                                                                                                    if (var72_66 == 0) {
                                                                                                                        z1_0.c((Vm2)var24_23, (z1$a)var11_11 /* !! */ );
                                                                                                                    } else {
                                                                                                                        z1_0.d((Vm2)var24_23, (z1$a)var11_11 /* !! */ );
                                                                                                                    }
                                                                                                                }
                                                                                                                var24_23.n();
                                                                                                                var25_24 = (int)var24_23.f();
                                                                                                            }
                                                                                                            if (var25_24 != 0) {
                                                                                                                var37_36 = var24_23.g(7);
                                                                                                                var42_41 = null;
                                                                                                                for (var25_24 = 0; var25_24 < var37_36; var25_24 += var31_30) {
                                                                                                                    var18_17 /* !! */  = 15;
                                                                                                                    var24_23.o(var18_17 /* !! */ );
                                                                                                                    var31_30 = 1;
                                                                                                                }
                                                                                                            }
                                                                                                            if (var72_66 <= 0) break block249;
                                                                                                            var25_24 = (int)var24_23.f();
                                                                                                            if (var25_24 != 0) {
                                                                                                                var25_24 = var24_23.b();
                                                                                                                if (var25_24 < (var31_30 = 66)) {
                                                                                                                    var25_24 = 0;
                                                                                                                    var42_41 = null;
                                                                                                                } else {
                                                                                                                    var24_23.o(var31_30);
                                                                                                                    var25_24 = 1;
                                                                                                                }
                                                                                                                if (var25_24 == 0) {
                                                                                                                    throw ParserException.b("Can't parse bitrate DSI.");
                                                                                                                }
                                                                                                            } else {
                                                                                                                var31_30 = 66;
                                                                                                            }
                                                                                                            var25_24 = (int)var24_23.f();
                                                                                                            if (var25_24 != 0) {
                                                                                                                var24_23.c();
                                                                                                                var37_36 = 16;
                                                                                                                var25_24 = var24_23.g(var37_36);
                                                                                                                var24_23.p(var25_24);
                                                                                                                var18_17 /* !! */  = 5;
                                                                                                                var25_24 = var24_23.g(var18_17 /* !! */ );
                                                                                                                var8_8 = null;
                                                                                                                for (var72_66 = 0; var72_66 < var25_24; var72_66 += var32_31) {
                                                                                                                    var24_23.o(3);
                                                                                                                    var89_83 = 8;
                                                                                                                    var24_23.o(var89_83);
                                                                                                                    var32_31 = 1;
                                                                                                                }
lbl915:
                                                                                                                // 3 sources

                                                                                                                while (true) {
                                                                                                                    continue;
                                                                                                                    break;
                                                                                                                }
                                                                                                            }
                                                                                                            var37_36 = 16;
                                                                                                            var18_17 /* !! */  = 5;
                                                                                                            ** GOTO lbl915
                                                                                                        }
                                                                                                        var37_36 = 16;
                                                                                                        var18_17 /* !! */  = 5;
                                                                                                        var31_30 = 66;
                                                                                                        ** continue;
                                                                                                        var89_83 = 8;
                                                                                                        var32_31 = 1;
                                                                                                        var24_23.c();
                                                                                                        if (var22_21 == var32_31) {
                                                                                                            var25_24 = var24_23.b();
                                                                                                            if (var36_35 >= (var38_37 /* !! */  = (var38_37 /* !! */  - var25_24) / var89_83 - var86_80)) {
                                                                                                                var24_23.p(var36_35 -= var38_37 /* !! */ );
                                                                                                            } else {
                                                                                                                throw ParserException.b("pres_bytes is smaller than presentation bytes read.");
                                                                                                            }
                                                                                                        }
                                                                                                        if ((var25_24 = (int)var11_11 /* !! */ .a) != 0 && (var25_24 = var11_11 /* !! */ .b) == (var41_40 = -1)) {
                                                                                                            var42_41 = new StringBuilder("Can't determine channel mode of presentation ");
                                                                                                            var42_41.append(var21_20);
                                                                                                            throw ParserException.b(var42_41.toString());
                                                                                                        }
                                                                                                        break block211;
                                                                                                    }
                                                                                                    var87_81 = var25_24;
                                                                                                    var80_74 = var72_66;
                                                                                                    var88_82 = var17_16;
                                                                                                    var81_75 = var32_31;
                                                                                                    var37_36 = 16;
                                                                                                    var18_17 /* !! */  = 5;
                                                                                                    var31_30 = 66;
                                                                                                }
                                                                                                if ((var25_24 = (int)var11_11 /* !! */ .a) == 0) break block250;
                                                                                                var25_24 = var11_11 /* !! */ .b;
                                                                                                var41_40 = (int)var11_11 /* !! */ .d;
                                                                                                var38_37 /* !! */  = var11_11 /* !! */ .e;
                                                                                                switch (var25_24) {
                                                                                                    default: {
                                                                                                        var75_69 = 11;
                                                                                                        var90_84 = -1;
                                                                                                        break;
                                                                                                    }
                                                                                                    case 15: {
                                                                                                        var75_69 = 11;
                                                                                                        var90_84 = 24;
                                                                                                        break;
                                                                                                    }
                                                                                                    case 14: {
                                                                                                        var75_69 = 11;
                                                                                                        var90_84 = 14;
                                                                                                        break;
                                                                                                    }
                                                                                                    case 13: {
                                                                                                        var75_69 = 11;
                                                                                                        var90_84 = 13;
                                                                                                        break;
                                                                                                    }
                                                                                                    case 12: {
                                                                                                        var75_69 = 11;
                                                                                                        var90_84 = 12;
                                                                                                        break;
                                                                                                    }
                                                                                                    case 11: {
                                                                                                        var75_69 = 11;
                                                                                                        var90_84 = 11;
                                                                                                        break;
                                                                                                    }
                                                                                                    case 6: 
                                                                                                    case 8: 
                                                                                                    case 10: {
                                                                                                        var75_69 = 11;
                                                                                                        var90_84 = 8;
                                                                                                        break;
                                                                                                    }
                                                                                                    case 5: 
                                                                                                    case 7: 
                                                                                                    case 9: {
                                                                                                        var75_69 = 11;
                                                                                                        var90_84 = 7;
                                                                                                        break;
                                                                                                    }
                                                                                                    case 4: {
                                                                                                        var75_69 = 11;
                                                                                                        var90_84 = 6;
                                                                                                        break;
                                                                                                    }
                                                                                                    case 3: {
                                                                                                        var75_69 = 11;
                                                                                                        var90_84 = 5;
                                                                                                        break;
                                                                                                    }
                                                                                                    case 2: {
                                                                                                        var75_69 = 11;
                                                                                                        var90_84 = 3;
                                                                                                        break;
                                                                                                    }
                                                                                                    case 1: {
                                                                                                        var75_69 = 11;
                                                                                                        var90_84 = 2;
                                                                                                        break;
                                                                                                    }
                                                                                                    case 0: {
                                                                                                        var75_69 = 11;
                                                                                                        var90_84 = 1;
                                                                                                    }
                                                                                                }
                                                                                                if (var25_24 == var75_69 || var25_24 == (var75_69 = 12)) break block251;
                                                                                                var36_35 = 13;
                                                                                                if (var25_24 == var36_35 || var25_24 == (var75_69 = 14)) break block252;
                                                                                                var25_24 = 1;
                                                                                                break block253;
                                                                                            }
                                                                                            var36_35 = 13;
                                                                                        }
                                                                                        if (var41_40 == 0) {
                                                                                            var90_84 += -2;
                                                                                        }
                                                                                        if (var38_37 /* !! */  != 0) {
                                                                                            var25_24 = 1;
                                                                                            if (var38_37 /* !! */  == var25_24) {
                                                                                                var90_84 += -2;
                                                                                            }
                                                                                        } else {
                                                                                            var25_24 = 1;
                                                                                            var90_84 += -4;
                                                                                        }
                                                                                    }
lbl1022:
                                                                                    // 3 sources

                                                                                    while (true) {
                                                                                        var41_40 = var90_84;
                                                                                        break block212;
                                                                                        break;
                                                                                    }
                                                                                }
                                                                                var36_35 = 13;
                                                                                var41_40 = var11_11 /* !! */ .c + 1;
                                                                                var25_24 = var11_11 /* !! */ .f;
                                                                                var38_37 /* !! */  = 4;
                                                                                var39_38 = 5.6E-45f;
                                                                                if (var25_24 != var38_37 /* !! */ ) break block212;
                                                                                var25_24 = 17;
                                                                                if (var41_40 != var25_24) break block254;
                                                                                var90_84 = 21;
                                                                                ** GOTO lbl1022
                                                                            }
                                                                            var90_84 = var41_40;
                                                                            ** continue;
                                                                        }
                                                                        if (var41_40 <= 0) break block255;
                                                                        var42_41 = new d$a();
                                                                        var42_41.a = var43_42;
                                                                        var42_41.n = var43_42 = ip1_0.l(var12_12);
                                                                        var42_41.C = var41_40;
                                                                        var42_41.D = var20_19;
                                                                        var42_41.r = var64_58;
                                                                        var8_8 = var3_3;
                                                                        var42_41.d = var3_3;
                                                                        var43_42 = new d((d$a)var42_41);
                                                                        var17_16 = var88_82;
                                                                        var88_82.b = var43_42;
                                                                        var41_40 = var84_78;
                                                                        var40_39 = var85_79;
                                                                        var32_31 = var87_81;
                                                                        var38_37 /* !! */  = 12;
                                                                        var39_38 = 1.7E-44f;
                                                                        var75_69 = 4;
                                                                        var22_21 = 3;
                                                                        var33_32 = 2;
                                                                        var34_33 = 7;
                                                                        var35_34 = var0;
                                                                        break block209;
                                                                    }
                                                                    throw ParserException.b("Can't determine channel count of presentation.");
                                                                }
                                                                var42_41 = new StringBuilder("Unsupported AC-4 DSI version: ");
                                                                var42_41.append(var22_21);
                                                                throw ParserException.b(var42_41.toString());
                                                            }
                                                            var87_81 = var25_24;
                                                            var77_71 /* !! */  = var54_51 /* !! */ ;
                                                            var85_79 = var18_17 /* !! */ ;
                                                            var80_74 = var72_66;
                                                            var81_75 = var32_31;
                                                            var37_36 = 16;
                                                            var18_17 /* !! */  = 5;
                                                            var36_35 = 13;
                                                            var8_8 = var7_7;
                                                            var31_30 = 66;
                                                            var25_24 = 1684892784;
                                                            if (var21_20 != var25_24) break block256;
                                                            if (var87_81 <= 0) break block257;
                                                            var78_72 = var74_68 /* !! */ ;
                                                            var37_36 = var32_31;
                                                            var75_69 = var72_66;
                                                            var22_21 = var87_81;
                                                            var32_31 = var87_81;
                                                            var18_17 /* !! */  = 2;
                                                            var36_35 = 0;
                                                            var6_6 = null;
                                                            var33_32 = 2;
                                                            var34_33 = 7;
                                                            var35_34 = var0;
                                                            break block208;
                                                        }
                                                        var42_41 = new StringBuilder("Invalid sample rate for Dolby TrueHD MLP stream: ");
                                                        var32_31 = var87_81;
                                                        var42_41.append(var87_81);
                                                        throw ParserException.a(var42_41.toString(), null);
                                                    }
                                                    var32_31 = var87_81;
                                                    var25_24 = 1684305011;
                                                    if (var21_20 == var25_24 || var21_20 == (var25_24 = 1969517683)) break block258;
                                                    var25_24 = 1682927731;
                                                    if (var21_20 == var25_24) {
                                                        var25_24 = 8;
                                                        var40_39 = var72_66 + -8;
                                                        var24_23 = JA.a;
                                                        var38_37 /* !! */  = ((Object[])var24_23).length + var40_39;
                                                        var55_52 = Arrays.copyOf((byte[])var24_23, var38_37 /* !! */ );
                                                        var75_69 = var81_75 + 8;
                                                        var35_34 = var0;
                                                        var0.I(var75_69);
                                                        var41_40 = ((Object)var24_23).length;
                                                        var0.g(var41_40, (byte[])var55_52, var40_39);
                                                        var55_52 = ea2.a((byte[])var55_52);
                                                        var18_17 /* !! */  = var85_79;
                                                        var37_36 = var81_75;
                                                        var75_69 = var72_66;
                                                        var36_35 = 0;
                                                        var6_6 = null;
                                                        var33_32 = 2;
lbl1125:
                                                        // 2 sources

                                                        while (true) {
                                                            var34_33 = 7;
lbl1127:
                                                            // 2 sources

                                                            while (true) {
                                                                var78_72 = var74_68 /* !! */ ;
                                                                break block208;
                                                                break;
                                                            }
                                                            break;
                                                        }
                                                    }
                                                    var25_24 = 8;
                                                    var35_34 = var0;
                                                    var40_39 = 1684425825;
                                                    if (var21_20 == var40_39) {
                                                        var38_37 /* !! */  = 12;
                                                        var39_38 = 1.7E-44f;
                                                        var40_39 = var72_66 + -12;
                                                        var41_40 = var72_66 + -8;
                                                        var24_23 = new byte[var41_40];
                                                        var23_22 = null;
                                                        var24_23[0] = 102;
                                                        var24_23[1] = 76;
                                                        var33_32 = 2;
                                                        var24_23[var33_32] = 97;
                                                        var24_23[3] = 67;
                                                        var75_69 = var81_75 + 12;
                                                        var0.I(var75_69);
                                                        var0.g(4, (byte[])var24_23, var40_39);
                                                        var55_52 = var43_42 = ImmutableList.of(var24_23);
                                                        var18_17 /* !! */  = var85_79;
                                                        var37_36 = var81_75;
                                                        var75_69 = var72_66;
                                                        var36_35 = 0;
                                                        var6_6 = null;
                                                        ** continue;
                                                    }
                                                    var40_39 = 1634492771;
                                                    var38_37 /* !! */  = 12;
                                                    var39_38 = 1.7E-44f;
                                                    var75_69 = 4;
                                                    var22_21 = 3;
                                                    var33_32 = 2;
                                                    if (var21_20 != var40_39) break block259;
                                                    var41_40 = var72_66 + -12;
                                                    var73_67 = new byte[var41_40];
                                                    var25_24 = var81_75 + 12;
                                                    var0.I(var25_24);
                                                    var0.g(0, (byte[])var73_67, var41_40);
                                                    var42_41 = LW.a;
                                                    var42_41 = new Xm2((byte[])var73_67);
                                                    var42_41.I(9);
                                                    var41_40 = var42_41.w();
                                                    var42_41.I(20);
                                                    var42_41 = var42_41.A();
                                                    var43_42 = var41_40;
                                                    var42_41 = Pair.create((Object)var42_41, (Object)var43_42);
                                                    var43_42 = (Integer)var42_41.first;
                                                    var40_39 = var43_42.intValue();
                                                    var42_41 = (Integer)var42_41.second;
                                                    var25_24 = var42_41.intValue();
                                                    var24_23 = ImmutableList.of(var73_67);
                                                    var18_17 /* !! */  = var25_24;
                                                    var22_21 = var40_39;
                                                    var55_52 = var24_23;
                                                    var78_72 = var74_68 /* !! */ ;
                                                    var37_36 = var81_75;
                                                    var75_69 = var72_66;
                                                    var36_35 = 0;
                                                    var6_6 = null;
                                                    var34_33 = 7;
                                                    break block208;
                                                }
                                                var25_24 = 1767990114;
                                                if (var21_20 == var25_24) {
                                                    block213: {
                                                        var40_39 = 9;
                                                        var25_24 = var81_75 + 9;
                                                        var0.I(var25_24);
                                                        var91_85 = var14_14;
                                                        var42_41 = null;
                                                        for (var25_24 = 0; var25_24 < var40_39; ++var25_24) {
                                                            var41_40 = var35_34.b;
                                                            var21_20 = var35_34.c;
                                                            if (var41_40 != var21_20) {
                                                                var41_40 = var0.w();
                                                                var52_50 = var41_40;
                                                                var93_86 = var52_50 & (long)127;
                                                                var34_33 = 7;
                                                                var21_20 = var25_24 * 7;
                                                                var91_85 |= (var93_86 <<= var21_20);
                                                                var93_86 = 128L;
                                                                cfr_temp_0 = (var52_50 &= var93_86) - var14_14;
                                                                var21_20 = cfr_temp_0 == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1);
                                                                if (var21_20 != 0) {
                                                                    var40_39 = 9;
                                                                    continue;
                                                                }
                                                                break block213;
                                                            }
                                                            var42_41 = new IllegalStateException("Attempting to read a byte over the limit.");
                                                            throw var42_41;
                                                        }
                                                        var34_33 = 7;
                                                    }
                                                    var25_24 = Ints.checkedCast(var91_85);
                                                    var43_42 = new byte[var25_24];
                                                    var41_40 = 0;
                                                    var24_23 = null;
                                                    var35_34.g(0, (byte[])var43_42, var25_24);
                                                    var55_52 = var42_41 = ImmutableList.of(var43_42);
                                                    var22_21 = var84_78;
                                                    var18_17 /* !! */  = var85_79;
                                                    var37_36 = var81_75;
                                                    var75_69 = var80_74;
                                                    var36_35 = 0;
                                                    var6_6 = null;
                                                    ** continue;
                                                }
                                                var34_33 = 7;
                                                var41_40 = var84_78;
                                                var40_39 = var85_79;
                                                break block209;
                                            }
                                            var38_37 /* !! */  = 12;
                                            var39_38 = 1.7E-44f;
                                            var75_69 = 4;
                                            var22_21 = 3;
                                            var33_32 = 2;
                                            var34_33 = 7;
                                            var35_34 = var0;
                                            var42_41 = new d$a();
                                            var43_42 = Integer.toString(var1_1);
                                            var42_41.a = var43_42;
                                            var43_42 = ip1_0.l((String)var77_71 /* !! */ );
                                            var42_41.n = var43_42;
                                            var40_39 = var85_79;
                                            var42_41.C = var85_79;
                                            var41_40 = var84_78;
                                            var42_41.D = var84_78;
                                            var42_41.r = var64_58;
                                            var42_41.d = var8_8;
                                            var17_16.b = var73_67 = new d((d$a)var42_41);
                                        }
                                        var18_17 /* !! */  = var40_39;
                                        var22_21 = var41_40;
                                        var78_72 = var74_68 /* !! */ ;
                                        var55_52 = var79_73;
                                        var37_36 = var81_75;
                                        var75_69 = var80_74;
                                        var36_35 = 0;
                                        var6_6 = null;
                                        break block208;
                                    }
                                    var76_70 /* !! */  = var43_42;
                                    var77_71 /* !! */  = var54_51 /* !! */ ;
                                    var79_73 = var55_52;
                                    var40_39 = var18_17 /* !! */ ;
                                    var35_34 = var6_6;
                                    var80_74 = var72_66;
                                    var81_75 = var32_31;
                                    var37_36 = 16;
                                    var38_37 /* !! */  = 12;
                                    var39_38 = 1.7E-44f;
                                    var75_69 = 4;
                                    var18_17 /* !! */  = 5;
                                    var36_35 = 13;
                                    var33_32 = 2;
                                    var34_33 = 7;
                                    var32_31 = var25_24;
                                    var25_24 = var22_21;
                                    var8_8 = var7_7;
                                    var22_21 = 3;
                                    var31_30 = 66;
                                    if (var21_20 == var41_40) {
                                        var19_18 = var74_68 /* !! */ ;
                                        var37_36 = var81_75;
                                        var21_20 = var81_75;
                                        var75_69 = var72_66;
lbl1292:
                                        // 3 sources

                                        while (true) {
                                            continue;
                                            break;
                                        }
                                    }
                                    var21_20 = var6_6.b;
                                    var37_36 = var81_75;
                                    if (var21_20 >= var81_75) {
                                        var38_37 /* !! */  = 1;
                                        var39_38 = 1.4E-45f;
lbl1299:
                                        // 2 sources

                                        while (true) {
                                            continue;
                                            break;
                                        }
                                    }
                                    var38_37 /* !! */  = 0;
                                    var39_38 = 0.0f;
                                    var55_52 = null;
                                    ** continue;
                                    var75_69 = 0;
                                    var11_11 /* !! */  = null;
                                    s70_0.a(null, (boolean)var38_37 /* !! */ );
                                    while (true) {
                                        var38_37 /* !! */  = var21_20 - var37_36;
                                        var75_69 = var80_74;
                                        if (var38_37 /* !! */  >= var80_74) break;
                                        var35_34.I(var21_20);
                                        var38_37 /* !! */  = var0.i();
                                        var19_18 = var74_68 /* !! */ ;
                                        if (var38_37 /* !! */  > 0) {
                                            var22_21 = 1;
                                        } else {
                                            var22_21 = 0;
                                            var23_22 = null;
                                        }
                                        s70_0.a((String)var19_18, (boolean)var22_21);
                                        var22_21 = var0.i();
                                        if (var22_21 == var41_40) ** GOTO lbl1292
                                        var21_20 += var38_37 /* !! */ ;
                                        var80_74 = var75_69;
                                        var74_68 /* !! */  = var19_18;
                                        var75_69 = 0;
                                        var11_11 /* !! */  = null;
                                        var22_21 = 3;
                                        var18_17 /* !! */  = 5;
                                    }
                                    var19_18 = var74_68 /* !! */ ;
                                    var21_20 = -1;
                                    ** continue;
                                    var41_40 = -1;
                                    if (var21_20 != var41_40) {
                                        var55_52 = JA.a(var21_20, (Xm2)var35_34);
                                        var23_22 = var55_52.a;
                                        var73_67 = var55_52.b;
                                        if (var73_67 != null) {
                                            var24_23 = "audio/vorbis";
                                            var41_40 = (int)var24_23.equals(var23_22);
                                            if (var41_40 != 0) {
                                                block215: {
                                                    block214: {
                                                        var24_23 = new Xm2((byte[])var73_67);
                                                        var36_35 = 1;
                                                        var24_23.J(var36_35);
                                                        var31_30 = 0;
                                                        var7_7 = null;
                                                        while ((var48_47 = var24_23.a()) > 0) {
                                                            var6_6 = var24_23.a;
                                                            var74_68 /* !! */  = var55_52;
                                                            var38_37 /* !! */  = var24_23.b;
                                                            var38_37 /* !! */  = (int)var6_6[var38_37 /* !! */ ];
                                                            var36_35 = 255;
                                                            if ((var38_37 /* !! */  &= var36_35) == var36_35) {
                                                                var31_30 += var36_35;
                                                                var38_37 /* !! */  = 1;
                                                                var39_38 = 1.4E-45f;
                                                                var24_23.J(var38_37 /* !! */ );
                                                                var36_35 = 1;
                                                                continue;
                                                            }
                                                            break block214;
                                                        }
                                                        var74_68 /* !! */  = var55_52;
                                                    }
                                                    var38_37 /* !! */  = var24_23.w() + var31_30;
                                                    var36_35 = 0;
                                                    var6_6 = null;
                                                    while ((var31_30 = var24_23.a()) > 0) {
                                                        var7_7 = var24_23.a;
                                                        var78_72 = var19_18;
                                                        var18_17 /* !! */  = var24_23.b;
                                                        var18_17 /* !! */  = (int)var7_7[var18_17 /* !! */ ];
                                                        var31_30 = 255;
                                                        if ((var18_17 /* !! */  &= var31_30) == var31_30) {
                                                            var36_35 += var31_30;
                                                            var18_17 /* !! */  = 1;
                                                            var24_23.J(var18_17 /* !! */ );
                                                            continue;
                                                        }
                                                        var18_17 /* !! */  = 1;
                                                        break block215;
                                                    }
                                                    var78_72 = var19_18;
                                                    var18_17 /* !! */  = 1;
                                                    var31_30 = 255;
                                                }
                                                var46_45 = var24_23.w() + var36_35;
                                                var6_6 = new byte[var38_37 /* !! */ ];
                                                var41_40 = var24_23.b;
                                                var18_17 /* !! */  = 0;
                                                var19_18 = null;
                                                System.arraycopy(var73_67, var41_40, var6_6, 0, var38_37 /* !! */ );
                                                var41_40 = var41_40 + var38_37 /* !! */  + var46_45;
                                                var38_37 /* !! */  = ((Object)var73_67).length - var41_40;
                                                var7_7 = new byte[var38_37 /* !! */ ];
                                                System.arraycopy(var73_67, var41_40, var7_7, 0, var38_37 /* !! */ );
                                                var55_52 = ImmutableList.of(var6_6, var7_7);
                                                var71_65 /* !! */  = var74_68 /* !! */ ;
                                                var36_35 = 0;
                                                var6_6 = null;
                                            } else {
                                                var74_68 /* !! */  = var55_52;
                                                var78_72 = var19_18;
                                                var24_23 = "audio/mp4a-latm";
                                                var41_40 = (int)var24_23.equals(var23_22);
                                                if (var41_40 != 0) {
                                                    var40_39 = ((Object)var73_67).length;
                                                    var42_41 = new Vm2((byte[])var73_67, var40_39);
                                                    var36_35 = 0;
                                                    var6_6 = null;
                                                    var42_41 = y0.b((Vm2)var42_41, false);
                                                    var40_39 = var42_41.a;
                                                    var18_17 /* !! */  = var42_41.b;
                                                    var70_64 = var42_41 = var42_41.c;
                                                    var25_24 = var40_39;
                                                } else {
                                                    var36_35 = 0;
                                                    var6_6 = null;
                                                    var18_17 /* !! */  = var40_39;
                                                }
                                                var55_52 = ImmutableList.of(var73_67);
                                                var40_39 = var18_17 /* !! */ ;
                                                var71_65 /* !! */  = var74_68 /* !! */ ;
                                            }
                                        } else {
                                            var74_68 /* !! */  = var55_52;
                                            var78_72 = var19_18;
                                            var36_35 = 0;
                                            var6_6 = null;
                                            var71_65 /* !! */  = var55_52;
                                            var55_52 = var79_73;
                                        }
                                    } else {
                                        var78_72 = var19_18;
                                        var36_35 = 0;
                                        var6_6 = null;
                                        var55_52 = var79_73;
                                        var23_22 = var77_71 /* !! */ ;
                                    }
                                    var18_17 /* !! */  = var40_39;
                                    var77_71 /* !! */  = var23_22;
                                    var22_21 = var25_24;
                                }
                                var25_24 = var37_36 + var75_69;
                                var7_7 = var8_8;
                                var6_6 = var35_34;
                                var21_20 = var30_29;
                                var20_19 = var29_28;
                                var11_11 /* !! */  = var27_26;
                                var43_42 = var76_70 /* !! */ ;
                                var24_23 = var78_72;
                                var54_51 /* !! */  = var77_71 /* !! */ ;
                                var95_87 = var32_31;
                                var32_31 = var25_24;
                                var25_24 = var95_87;
                            }
                            var77_71 /* !! */  = var54_51 /* !! */ ;
                            var79_73 = var55_52;
                            var27_26 = var11_11 /* !! */ ;
                            var25_24 = var22_21;
                            var40_39 = var18_17 /* !! */ ;
                            var8_8 = var7_7;
                            var29_28 = var20_19;
                            var30_29 = var21_20;
                            var33_32 = 2;
                            var34_33 = 7;
                            var35_34 = var6_6;
                            var36_35 = 0;
                            var6_6 = null;
                            var24_23 = var17_16.b;
                            if (var24_23 == null && var54_51 /* !! */  != null) {
                                var24_23 = new d$a();
                                var54_51 /* !! */  = Integer.toString(var1_1);
                                var24_23.a = var54_51 /* !! */ ;
                                var54_51 /* !! */  = ip1_0.l((String)var77_71 /* !! */ );
                                var24_23.n = var54_51 /* !! */ ;
                                var54_51 /* !! */  = var70_64;
                                var24_23.j = var70_64;
                                var24_23.C = var18_17 /* !! */ ;
                                var24_23.D = var22_21;
                                var38_37 /* !! */  = var68_62;
                                var39_38 = var69_63;
                                var24_23.E = var68_62;
                                var24_23.q = var55_52;
                                var24_23.r = var64_58;
                                var24_23.d = var7_7;
                                var42_41 = var71_65 /* !! */ ;
                                if (var71_65 /* !! */  != null) {
                                    var96_88 = var71_65 /* !! */ .c;
                                    var24_23.h = var40_39 = Ints.saturatedCast(var96_88);
                                    var60_55 = var71_65 /* !! */ .d;
                                    var24_23.i = var25_24 = Ints.saturatedCast(var60_55);
                                }
                                var17_16.b = var42_41 = new d((d$a)var24_23);
                            }
                        }
                        var34_33 = var28_27;
                        var45_44 = var27_26;
                        var44_43 = var26_25;
                        var31_30 = 8;
                        var32_31 = 10;
                        var21_20 = 16;
                        var46_45 = 12;
                        var47_46 = 1835365492;
                        var48_47 = 0;
                        break block206;
                    }
                    var26_25 = var16_15;
                    var27_26 = var11_11 /* !! */ ;
                    var28_27 = var18_17 /* !! */ ;
                    var8_8 = var7_7;
                    var29_28 = var20_19;
                    var30_29 = var21_20;
                    var33_32 = 2;
                    var34_33 = 7;
                    var35_34 = var6_6;
                    var36_35 = 0;
                    var6_6 = null;
                    var31_30 = 8;
                    var32_31 = 10;
                }
                var42_41 = var0;
                var21_20 = 16;
                var40_39 = var22_21;
                var41_40 = var29_28;
                var44_43 = var26_25;
                var46_45 = 12;
                var16_15 = var30_29;
                var47_46 = 1835365492;
                var37_36 = var1_1;
                var48_47 = 0;
                var38_37 /* !! */  = var2_2;
                var45_44 = var27_26;
                var11_11 /* !! */  = var4_4;
                var23_22 = var17_16;
                var34_33 = var28_27;
                var18_17 /* !! */  = var28_27;
                JA.h(var0, var22_21, var29_28, var30_29, var1_1, var2_2, var4_4, var17_16, var28_27);
            }
            var25_24 = var29_28 + var30_29;
            var35_34.I(var25_24);
            var18_17 /* !! */  = var34_33 + 1;
            var7_7 = var8_8;
            var6_6 = var35_34;
            var16_15 = var44_43;
            var11_11 /* !! */  = var45_44;
            var8_8 = var4_4;
        }
        return var17_16;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static ArrayList g(zQ1$a var0, IY0 var1_1, long var2_2, DrmInitData var4_3, boolean var5_4, boolean var6_5, Function var7_6) {
        var8_7 = var0;
        var9_8 /* !! */  = var1_1;
        var10_9 = -1;
        var11_10 = new ArrayList();
        var12_11 = 0;
        var13_12 = 0.0f;
        var14_13 /* !! */  = null;
        while (var12_11 < (var16_15 /* !! */  = (var15_14 = var8_7.d).size())) {
            block103: {
                block110: {
                    block119: {
                        block120: {
                            block117: {
                                block118: {
                                    block116: {
                                        block112: {
                                            block115: {
                                                block114: {
                                                    block113: {
                                                        block97: {
                                                            block111: {
                                                                block96: {
                                                                    block109: {
                                                                        block108: {
                                                                            block107: {
                                                                                block99: {
                                                                                    block106: {
                                                                                        block105: {
                                                                                            block104: {
                                                                                                block95: {
                                                                                                    block102: {
                                                                                                        block101: {
                                                                                                            block100: {
                                                                                                                block94: {
                                                                                                                    block98: {
                                                                                                                        var15_14 = (zQ1$a)var15_14.get(var12_11);
                                                                                                                        var16_15 /* !! */  = var15_14.a;
                                                                                                                        var17_16 = 1953653099;
                                                                                                                        if (var16_15 /* !! */  != var17_16) {
                                                                                                                            var8_7 = var11_10;
                                                                                                                            var18_17 = var12_11;
lbl15:
                                                                                                                            // 3 sources

                                                                                                                            while (true) {
                                                                                                                                continue;
                                                                                                                                break;
                                                                                                                            }
                                                                                                                        }
                                                                                                                        var16_15 /* !! */  = 1836476516;
                                                                                                                        var20_19 = 4.7662196E27f;
                                                                                                                        var21_20 = var8_7.c(var16_15 /* !! */ );
                                                                                                                        var21_20.getClass();
                                                                                                                        var17_16 = 1835297121;
                                                                                                                        var22_21 = var15_14.b(var17_16);
                                                                                                                        var22_21.getClass();
                                                                                                                        var23_22 = var22_21.c(1751411826);
                                                                                                                        var23_22.getClass();
                                                                                                                        var23_22 = var23_22.b;
                                                                                                                        var24_23 = 16;
                                                                                                                        var23_22.I(var24_23);
                                                                                                                        var25_24 = var23_22.i();
                                                                                                                        var26_25 = 1936684398;
                                                                                                                        var25_24 = var25_24 == var26_25 ? 1 : (var25_24 == (var26_25 = 1986618469) ? 2 : (var25_24 != (var26_25 = 1952807028) && var25_24 != (var26_25 = 1935832172) && var25_24 != (var26_25 = 1937072756) && var25_24 != (var26_25 = 1668047728) ? (var25_24 == (var26_25 = 1835365473) ? 5 : -1) : 3));
                                                                                                                        var27_26 /* !! */  = "";
                                                                                                                        var28_27 = 0L;
                                                                                                                        var30_28 = 4;
                                                                                                                        if (var25_24 != var10_9) break block98;
                                                                                                                        var8_7 = var7_6;
                                                                                                                        var31_29 = var11_10;
                                                                                                                        var18_17 = var12_11;
                                                                                                                        var32_30 /* !! */  = var15_14;
                                                                                                                        var12_11 = 0;
                                                                                                                        var13_12 = 0.0f;
                                                                                                                        var14_13 /* !! */  = null;
                                                                                                                        break block99;
                                                                                                                    }
                                                                                                                    var33_31 /* !! */  = 1953196132;
                                                                                                                    var34_32 /* !! */  = var15_14.c(var33_31 /* !! */ );
                                                                                                                    var34_32 /* !! */ .getClass();
                                                                                                                    var34_32 /* !! */  = var34_32 /* !! */ .b;
                                                                                                                    var35_33 = 8;
                                                                                                                    var36_34 = 1.1E-44f;
                                                                                                                    var34_32 /* !! */ .I(var35_33);
                                                                                                                    var37_35 = JA.c(var34_32 /* !! */ .i());
                                                                                                                    if (var37_35 != 0) {
                                                                                                                        var35_33 = 16;
                                                                                                                        var36_34 = 2.2E-44f;
                                                                                                                    }
                                                                                                                    var34_32 /* !! */ .J(var35_33);
                                                                                                                    var35_33 = var34_32 /* !! */ .i();
                                                                                                                    var34_32 /* !! */ .J(var30_28);
                                                                                                                    var17_16 = var34_32 /* !! */ .b;
                                                                                                                    if (var37_35 != 0) {
                                                                                                                        var30_28 = 8;
                                                                                                                    }
                                                                                                                    var24_23 = 0;
                                                                                                                    var38_36 /* !! */  = null;
                                                                                                                    while (true) {
                                                                                                                        var39_37 /* !! */  = -9223372036854775807L;
                                                                                                                        if (var24_23 >= var30_28) break;
                                                                                                                        var41_38 /* !! */  = var34_32 /* !! */ .a;
                                                                                                                        var42_39 = var17_16 + var24_23;
                                                                                                                        var43_40 = var41_38 /* !! */ [var42_39];
                                                                                                                        if (var43_40 != var10_9) {
                                                                                                                            var44_41 = var37_35 == 0 ? var34_32 /* !! */ .y() : var34_32 /* !! */ .B();
                                                                                                                            cfr_temp_0 = var44_41 - var28_27;
                                                                                                                            var43_40 = cfr_temp_0 == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1);
                                                                                                                            if (var43_40 == 0) lbl-1000:
                                                                                                                            // 2 sources

                                                                                                                            {
                                                                                                                                while (true) {
                                                                                                                                    var44_41 = var39_37 /* !! */ ;
                                                                                                                                    ** GOTO lbl88
                                                                                                                                    break;
                                                                                                                                }
                                                                                                                            }
                                                                                                                            break block94;
                                                                                                                        }
                                                                                                                        var43_40 = 1;
                                                                                                                        var24_23 += var43_40;
                                                                                                                    }
                                                                                                                    var34_32 /* !! */ .J(var30_28);
                                                                                                                    ** continue;
                                                                                                                }
                                                                                                                var43_40 = 16;
                                                                                                                var34_32 /* !! */ .J(var43_40);
                                                                                                                var17_16 = var34_32 /* !! */ .i();
                                                                                                                var24_23 = var34_32 /* !! */ .i();
                                                                                                                var34_32 /* !! */ .J(4);
                                                                                                                var43_40 = var34_32 /* !! */ .i();
                                                                                                                var33_31 /* !! */  = var34_32 /* !! */ .i();
                                                                                                                var10_9 = 65536;
                                                                                                                if (var17_16 != 0 || var24_23 != var10_9) break block100;
                                                                                                                var10_9 = -65536;
                                                                                                                if (var43_40 != var10_9 || var33_31 /* !! */  != 0) break block101;
                                                                                                                var33_31 /* !! */  = 90;
                                                                                                                break block102;
                                                                                                            }
                                                                                                            var10_9 = -65536;
                                                                                                        }
                                                                                                        if (var17_16 != 0 || var24_23 != var10_9) ** GOTO lbl111
                                                                                                        var10_9 = 65536;
                                                                                                        if (var43_40 == var10_9 && var33_31 /* !! */  == 0) {
                                                                                                            var33_31 /* !! */  = 270;
                                                                                                        } else {
                                                                                                            var10_9 = -65536;
lbl111:
                                                                                                            // 2 sources

                                                                                                            if (var17_16 == var10_9 && var24_23 == 0 && var43_40 == 0 && var33_31 /* !! */  == var10_9) {
                                                                                                                var33_31 /* !! */  = 180;
                                                                                                            } else {
                                                                                                                var33_31 /* !! */  = 0;
                                                                                                                var34_32 /* !! */  = null;
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                    var10_9 = var2_2 == var39_37 /* !! */  ? 0 : (var2_2 < var39_37 /* !! */  ? -1 : 1);
                                                                                                    var46_42 = var10_9 == 0 ? var44_41 : var2_2;
                                                                                                    var48_43 = JA.d(var21_20.b);
                                                                                                    var49_44 = var48_43.c;
                                                                                                    var16_15 /* !! */  = var46_42 == var39_37 /* !! */  ? 0 : (var46_42 < var39_37 /* !! */  ? -1 : 1);
                                                                                                    if (var16_15 /* !! */  == 0) {
                                                                                                        var51_45 = var39_37 /* !! */ ;
lbl124:
                                                                                                        // 2 sources

                                                                                                        while (true) {
                                                                                                            continue;
                                                                                                            break;
                                                                                                        }
                                                                                                    }
                                                                                                    var16_15 /* !! */  = gz3.a;
                                                                                                    var53_46 /* !! */  = RoundingMode.DOWN;
                                                                                                    var54_47 = 1000000L;
                                                                                                    var56_48 = var49_44;
                                                                                                    var51_45 = gz3.O(var46_42, var54_47, var49_44, var53_46 /* !! */ );
                                                                                                    ** continue;
                                                                                                    var24_23 = 1835626086;
                                                                                                    var58_49 = var22_21.b(var24_23);
                                                                                                    var58_49.getClass();
                                                                                                    var58_49 = var58_49.b(1937007212);
                                                                                                    var58_49.getClass();
                                                                                                    var22_21 = var22_21.c(1835296868);
                                                                                                    var22_21.getClass();
                                                                                                    var22_21 = var22_21.b;
                                                                                                    var22_21.I(8);
                                                                                                    var24_23 = JA.c(var22_21.i());
                                                                                                    var59_50 /* !! */  = var24_23 == 0 ? 8 : 16;
                                                                                                    var22_21.J(var59_50 /* !! */ );
                                                                                                    var60_51 = var22_21.y();
                                                                                                    var59_50 /* !! */  = var22_21.b;
                                                                                                    var18_17 = var12_11;
                                                                                                    if (var24_23 == 0) {
                                                                                                        var12_11 = 4;
                                                                                                        var13_12 = 5.6E-45f;
                                                                                                    } else {
                                                                                                        var12_11 = 8;
                                                                                                        var13_12 = 1.1E-44f;
                                                                                                    }
                                                                                                    var31_29 = var11_10;
                                                                                                    var11_10 = null;
                                                                                                    for (var62_52 /* !! */  = 0; var62_52 /* !! */  < var12_11; ++var62_52 /* !! */ ) {
                                                                                                        var9_8 /* !! */  = (op3[])var22_21.a;
                                                                                                        var37_35 = var59_50 /* !! */  + var62_52 /* !! */ ;
                                                                                                        var19_18 /* !! */  = (int)var9_8 /* !! */ [var37_35];
                                                                                                        var37_35 = var59_50 /* !! */ ;
                                                                                                        var59_50 /* !! */  = -1;
                                                                                                        if (var19_18 /* !! */  != var59_50 /* !! */ ) {
                                                                                                            if (var24_23 == 0) {
                                                                                                                var63_53 = var22_21.y();
lbl167:
                                                                                                                // 2 sources

                                                                                                                while (true) {
                                                                                                                    continue;
                                                                                                                    break;
                                                                                                                }
                                                                                                            }
                                                                                                            var63_53 = var22_21.B();
                                                                                                            ** continue;
                                                                                                            var46_42 = var63_53;
                                                                                                            var59_50 /* !! */  = var63_53 == var28_27 ? 0 : (var63_53 < var28_27 ? -1 : 1);
                                                                                                            if (var59_50 /* !! */  == 0) lbl-1000:
                                                                                                            // 2 sources

                                                                                                            {
                                                                                                                while (true) {
                                                                                                                    var56_48 = var39_37 /* !! */ ;
                                                                                                                    ** GOTO lbl188
                                                                                                                    break;
                                                                                                                }
                                                                                                            } else {
                                                                                                                var59_50 /* !! */  = gz3.a;
                                                                                                                var53_46 /* !! */  = RoundingMode.DOWN;
                                                                                                                var54_47 = 1000000L;
                                                                                                                var56_48 = var60_51;
                                                                                                                var56_48 = var63_53 = gz3.O(var63_53, var54_47, var60_51, var53_46 /* !! */ );
                                                                                                            }
                                                                                                            break block95;
                                                                                                        }
                                                                                                        var9_8 /* !! */  = var1_1;
                                                                                                        var59_50 /* !! */  = var37_35;
                                                                                                    }
                                                                                                    var22_21.J(var12_11);
                                                                                                    ** continue;
                                                                                                }
                                                                                                var59_50 /* !! */  = var22_21.C();
                                                                                                var9_8 /* !! */  = new StringBuilder(var27_26 /* !! */ );
                                                                                                var62_52 /* !! */  = (char)((var59_50 /* !! */  >> 10 & 31) + 96);
                                                                                                var9_8 /* !! */ .append((char)var62_52 /* !! */ );
                                                                                                var62_52 /* !! */  = 5;
                                                                                                var12_11 = (char)((var59_50 /* !! */  >> 5 & 31) + 96);
                                                                                                var9_8 /* !! */ .append((char)var12_11);
                                                                                                var59_50 /* !! */  = (char)((var59_50 /* !! */  & 31) + 96);
                                                                                                var9_8 /* !! */ .append((char)var59_50 /* !! */ );
                                                                                                var65_54 = var9_8 /* !! */ .toString();
                                                                                                var59_50 /* !! */  = 1937011556;
                                                                                                var8_7 = var58_49.c(var59_50 /* !! */ );
                                                                                                if (var8_7 == null) break block103;
                                                                                                var66_55 = var8_7 = var8_7.b;
                                                                                                var67_56 = var35_33;
                                                                                                var68_57 = var33_31 /* !! */ ;
                                                                                                var69_58 /* !! */  = var4_3;
                                                                                                var8_7 = JA.f((Xm2)var8_7, var35_33, var33_31 /* !! */ , (String)var65_54, var4_3, var6_5);
                                                                                                if (var5_4 || (var9_8 /* !! */  = var15_14.b(var19_18 /* !! */  = 1701082227)) == null) break block104;
                                                                                                var33_31 /* !! */  = 1701606260;
                                                                                                if ((var9_8 /* !! */  = var9_8 /* !! */ .c(var33_31 /* !! */ )) == null) {
                                                                                                    var32_30 /* !! */  = var15_14;
                                                                                                    var19_18 /* !! */  = 0;
                                                                                                    var9_8 /* !! */  = null;
                                                                                                } else {
                                                                                                    var9_8 /* !! */  = var9_8 /* !! */ .b;
                                                                                                    var9_8 /* !! */ .I(8);
                                                                                                    var33_31 /* !! */  = JA.c(var9_8 /* !! */ .i());
                                                                                                    var12_11 = var9_8 /* !! */ .A();
                                                                                                    var22_21 = (op3[])new long[var12_11];
                                                                                                    var38_36 /* !! */  = new long[var12_11];
                                                                                                    var58_49 = null;
                                                                                                    for (var30_28 = 0; var30_28 < var12_11; var30_28 += var12_11) {
                                                                                                        var62_52 /* !! */  = 1;
                                                                                                        var70_59 = var33_31 /* !! */  == var62_52 /* !! */  ? var9_8 /* !! */ .B() : var9_8 /* !! */ .y();
                                                                                                        var22_21[var30_28] = var70_59;
                                                                                                        if (var33_31 /* !! */  == var62_52 /* !! */ ) {
                                                                                                            var70_59 = var9_8 /* !! */ .q();
                                                                                                            var32_30 /* !! */  = var15_14;
                                                                                                            var37_35 = var12_11;
                                                                                                            var72_60 = var70_59;
                                                                                                        } else {
                                                                                                            var62_52 /* !! */  = var9_8 /* !! */ .i();
                                                                                                            var37_35 = var12_11;
                                                                                                            var32_30 /* !! */  = var15_14;
                                                                                                            var72_60 = var62_52 /* !! */ ;
                                                                                                        }
                                                                                                        var38_36 /* !! */ [var30_28] = var72_60;
                                                                                                        var62_52 /* !! */  = var9_8 /* !! */ .t();
                                                                                                        var12_11 = 1;
                                                                                                        var13_12 = 1.4E-45f;
                                                                                                        if (var62_52 /* !! */  == var12_11) {
                                                                                                            var9_8 /* !! */ .J(2);
                                                                                                            var12_11 = var37_35;
                                                                                                            var15_14 = var32_30 /* !! */ ;
                                                                                                            var62_52 /* !! */  = 5;
                                                                                                            continue;
                                                                                                        }
                                                                                                        var8_7 = new IllegalArgumentException("Unsupported media rate.");
                                                                                                        throw var8_7;
                                                                                                    }
                                                                                                    var32_30 /* !! */  = var15_14;
                                                                                                    var9_8 /* !! */  = Pair.create((Object)var22_21, (Object)var38_36 /* !! */ );
                                                                                                }
                                                                                                if (var9_8 /* !! */  == null) break block105;
                                                                                                var34_32 /* !! */  = (op3[])((long[])var9_8 /* !! */ .first);
                                                                                                var9_8 /* !! */  = (op3[])((long[])var9_8 /* !! */ .second);
                                                                                                break block106;
                                                                                            }
                                                                                            var32_30 /* !! */  = var15_14;
                                                                                        }
                                                                                        var19_18 /* !! */  = 0;
                                                                                        var9_8 /* !! */  = null;
                                                                                        var33_31 /* !! */  = 0;
                                                                                        var34_32 /* !! */  = null;
                                                                                    }
                                                                                    var11_10 = var8_7.b;
                                                                                    if (var11_10 == null) {
                                                                                        var12_11 = 0;
                                                                                        var13_12 = 0.0f;
                                                                                        var14_13 /* !! */  = null;
                                                                                    } else {
                                                                                        var74_61 = var8_7.d;
                                                                                        var75_62 = (int)var74_61;
                                                                                        var15_14 = var8_7.a;
                                                                                        var76_63 /* !! */  = var15_14;
                                                                                        var59_50 /* !! */  = var8_7.c;
                                                                                        var77_64 = var14_13 /* !! */ ;
                                                                                        var78_65 = var35_33;
                                                                                        var79_66 /* !! */  = var25_24;
                                                                                        var39_37 /* !! */  = var60_51;
                                                                                        var46_42 = var49_44;
                                                                                        var54_47 = var51_45;
                                                                                        var53_46 /* !! */  = var11_10;
                                                                                        var80_67 /* !! */  = (long[])var34_32 /* !! */ ;
                                                                                        var81_68 = var9_8 /* !! */ ;
                                                                                        var14_13 /* !! */  = new kp3(var35_33, var25_24, var60_51, var49_44, var51_45, var56_48, (d)var11_10, (int)var74_61, var15_14, var59_50 /* !! */ , (long[])var34_32 /* !! */ , (long[])var9_8 /* !! */ );
                                                                                    }
                                                                                    var8_7 = var7_6;
                                                                                }
                                                                                var9_8 /* !! */  = var8_7.apply(var14_13 /* !! */ );
                                                                                var48_43 = var9_8 /* !! */ ;
                                                                                var48_43 = (kp3)var9_8 /* !! */ ;
                                                                                if (var48_43 != null) break block107;
                                                                                var8_7 = var31_29;
                                                                                ** GOTO lbl15
                                                                            }
                                                                            var15_14 = var32_30 /* !! */ ;
                                                                            var19_18 /* !! */  = 1835297121;
                                                                            var9_8 /* !! */  = var32_30 /* !! */ .b(var19_18 /* !! */ );
                                                                            var9_8 /* !! */ .getClass();
                                                                            var9_8 /* !! */  = var9_8 /* !! */ .b(1835626086);
                                                                            var9_8 /* !! */ .getClass();
                                                                            var9_8 /* !! */  = var9_8 /* !! */ .b(1937007212);
                                                                            var9_8 /* !! */ .getClass();
                                                                            var33_31 /* !! */  = 1937011578;
                                                                            var34_32 /* !! */  = var9_8 /* !! */ .c(var33_31 /* !! */ );
                                                                            var41_38 /* !! */  = (byte[])var48_43.g;
                                                                            if (var34_32 /* !! */  == null) break block108;
                                                                            var11_10 = new JA$g((zQ1$b)var34_32 /* !! */ , (d)var41_38 /* !! */ );
                                                                            break block109;
                                                                        }
                                                                        var33_31 /* !! */  = 1937013298;
                                                                        var34_32 /* !! */  = var9_8 /* !! */ .c(var33_31 /* !! */ );
                                                                        if (var34_32 /* !! */  == null) break block110;
                                                                        var11_10 = new JA$h((zQ1$b)var34_32 /* !! */ );
                                                                    }
                                                                    var33_31 /* !! */  = var11_10.c();
                                                                    if (var33_31 /* !! */  == 0) {
                                                                        var33_31 /* !! */  = 0;
                                                                        var41_38 /* !! */  = (byte[])new long[0];
                                                                        var11_10 = (op3[])new int[0];
                                                                        var14_13 /* !! */  = new long[]{};
                                                                        var15_14 = (op3[])new int[0];
                                                                        var51_45 = 0L;
                                                                        var35_33 = 0;
                                                                        var36_34 = 0.0f;
                                                                        var82_69 = null;
                                                                        var34_32 /* !! */  = var9_8 /* !! */ ;
                                                                        var9_8 /* !! */  = new Bp3((kp3)var48_43, var41_38 /* !! */ , (int[])var11_10, 0, var14_13 /* !! */ , (int[])var15_14, var51_45);
lbl330:
                                                                        // 5 sources

                                                                        while (true) {
                                                                            continue;
                                                                            break;
                                                                        }
                                                                    }
                                                                    var35_33 = var48_43.b;
                                                                    var12_11 = 2;
                                                                    var13_12 = 2.8E-45f;
                                                                    if (var35_33 == var12_11 && (var74_61 = (cfr_temp_1 /* !! */  = (var83_70 /* !! */  = var48_43.f) - var28_27) == 0L ? 0 : (cfr_temp_1 /* !! */  < 0L ? -1 : 1)) > 0) {
                                                                        var85_71 = var33_31 /* !! */ ;
                                                                        var36_34 = var83_70 /* !! */ ;
                                                                        var13_12 = 1000000.0f;
                                                                        var41_38 /* !! */  = var41_38 /* !! */ .a();
                                                                        var41_38 /* !! */ .w = var85_71 /= (var36_34 /= var13_12);
                                                                        var82_69 = new d((d$a)var41_38 /* !! */ );
                                                                        var58_49 = var41_38 /* !! */ ;
                                                                        var86_72 /* !! */  = var48_43.i;
                                                                        var80_67 /* !! */  = var48_43.j;
                                                                        var37_35 = var48_43.a;
                                                                        var78_65 = var48_43.b;
                                                                        var87_73 = var48_43.c;
                                                                        var89_74 = var48_43.d;
                                                                        var91_75 = var48_43.e;
                                                                        var93_76 = var72_60 = var48_43.f;
                                                                        var95_77 = var12_11 = var48_43.h;
                                                                        var14_13 /* !! */  = var48_43.l;
                                                                        var96_78 = var14_13 /* !! */ ;
                                                                        var97_79 = var10_9 = var48_43.k;
                                                                        var41_38 /* !! */  = new kp3(var37_35, var78_65, var87_73, var89_74, var91_75, var72_60, (d)var82_69, var12_11, (op3[])var14_13 /* !! */ , var10_9, var86_72 /* !! */ , var80_67 /* !! */ );
                                                                        var48_43 = var41_38 /* !! */ ;
                                                                    }
                                                                    if ((var41_38 /* !! */  = (byte[])var9_8 /* !! */ .c(var43_40 = 1937007471)) == null) {
                                                                        var43_40 = 1668232756;
                                                                        var41_38 /* !! */  = (byte[])var9_8 /* !! */ .c(var43_40);
                                                                        var41_38 /* !! */ .getClass();
                                                                        var35_33 = 1;
                                                                        var36_34 = 1.4E-45f;
                                                                    } else {
                                                                        var35_33 = 0;
                                                                        var36_34 = 0.0f;
                                                                        var82_69 = null;
                                                                    }
                                                                    var12_11 = 1937011555;
                                                                    var13_12 = 1.9367382E31f;
                                                                    var14_13 /* !! */  = (long[])var9_8 /* !! */ .c(var12_11);
                                                                    var14_13 /* !! */ .getClass();
                                                                    var74_61 = 0x73747473;
                                                                    var85_71 = 1.9367711E31f;
                                                                    var15_14 = var9_8 /* !! */ .c((int)var74_61);
                                                                    var15_14.getClass();
                                                                    var16_15 /* !! */  = 0x73747373;
                                                                    var20_19 = 1.9367401E31f;
                                                                    var21_20 = var9_8 /* !! */ .c(var16_15 /* !! */ );
                                                                    if (var21_20 != null) {
                                                                        var21_20 = var21_20.b;
                                                                    } else {
                                                                        var16_15 /* !! */  = 0;
                                                                        var20_19 = 0.0f;
                                                                        var21_20 = null;
                                                                    }
                                                                    var17_16 = 1668576371;
                                                                    var9_8 /* !! */  = var9_8 /* !! */ .c(var17_16);
                                                                    if (var9_8 /* !! */  != null) {
                                                                        var9_8 /* !! */  = var9_8 /* !! */ .b;
                                                                    } else {
                                                                        var19_18 /* !! */  = 0;
                                                                        var9_8 /* !! */  = null;
                                                                    }
                                                                    var14_13 /* !! */  = var14_13 /* !! */ .b;
                                                                    var41_38 /* !! */  = var41_38 /* !! */ .b;
                                                                    var98_80 = new JA$a((Xm2)var14_13 /* !! */ , (Xm2)var41_38 /* !! */ , (boolean)var35_33);
                                                                    var41_38 /* !! */  = var15_14.b;
                                                                    var35_33 = 12;
                                                                    var36_34 = 1.7E-44f;
                                                                    var41_38 /* !! */ .I(var35_33);
                                                                    var12_11 = var41_38 /* !! */ .A();
                                                                    var85_71 = 1.4E-45f;
                                                                    --var12_11;
                                                                    var74_61 = var41_38 /* !! */ .A();
                                                                    var99_81 = var41_38 /* !! */ .A();
                                                                    if (var9_8 /* !! */  != null) {
                                                                        var9_8 /* !! */ .I(var35_33);
                                                                        var25_24 = var9_8 /* !! */ .A();
                                                                    } else {
                                                                        var25_24 = 0;
                                                                        var23_22 = null;
                                                                    }
                                                                    if (var21_20 == null) ** GOTO lbl426
                                                                    var21_20.I(var35_33);
                                                                    var35_33 = var21_20.A();
                                                                    if (var35_33 > 0) {
                                                                        var24_23 = var21_20.A();
                                                                        var30_28 = 1;
                                                                        var24_23 -= var30_28;
                                                                    } else {
                                                                        var16_15 /* !! */  = 0;
                                                                        var20_19 = 0.0f;
                                                                        var21_20 = null;
lbl423:
                                                                        // 2 sources

                                                                        while (true) {
                                                                            var24_23 = -1;
                                                                            break block96;
                                                                            break;
                                                                        }
lbl426:
                                                                        // 1 sources

                                                                        var35_33 = 0;
                                                                        var36_34 = 0.0f;
                                                                        var82_69 = null;
                                                                        ** continue;
                                                                    }
                                                                }
                                                                var30_28 = var11_10.b();
                                                                var8_7 = var48_43.g;
                                                                var37_35 = (int)var74_61;
                                                                var15_14 = var8_7.o;
                                                                var78_65 = var24_23;
                                                                var24_23 = -1;
                                                                if (var30_28 == var24_23 || (var24_23 = (int)(var38_36 /* !! */  = "audio/raw").equals(var15_14)) == 0 && (var24_23 = (int)(var38_36 /* !! */  = "audio/g711-mlaw").equals(var15_14)) == 0 && (var74_61 = (long)(var38_36 /* !! */  = "audio/g711-alaw").equals(var15_14)) == false || var12_11 != 0 || var25_24 != 0 || var35_33 != 0) break block111;
                                                                var19_18 /* !! */  = var98_80.a;
                                                                var41_38 /* !! */  = (byte[])new long[var19_18 /* !! */ ];
                                                                var11_10 = (op3[])new int[var19_18 /* !! */ ];
                                                                while ((var35_33 = (int)var98_80.a()) != 0) {
                                                                    var35_33 = var98_80.b;
                                                                    var72_60 = var98_80.d;
                                                                    var41_38 /* !! */ [var35_33] = (byte)var72_60;
                                                                    var12_11 = var98_80.c;
                                                                    var11_10[var35_33] = var12_11;
                                                                }
                                                                var83_70 /* !! */  = var99_81;
                                                                var85_71 = 1.148E-41f;
                                                                var74_61 = 8192 / var30_28;
                                                                var20_19 = 0.0f;
                                                                var21_20 = null;
                                                                var17_16 = 0;
                                                                var98_80 = null;
                                                                for (var16_15 /* !! */  = 0; var16_15 /* !! */  < var19_18 /* !! */ ; var16_15 /* !! */  += var99_81) {
                                                                    var99_81 = gz3.e((int)var11_10[var16_15 /* !! */ ], (int)var74_61);
                                                                    var17_16 += var99_81;
                                                                    var99_81 = 1;
                                                                }
                                                                var21_20 = new long[var17_16];
                                                                var22_21 = (op3[])new int[var17_16];
                                                                var23_22 = new long[var17_16];
                                                                var98_80 = (op3[])new int[var17_16];
                                                                var38_36 /* !! */  = null;
                                                                var26_25 = 0;
                                                                var27_26 /* !! */  = null;
                                                                var37_35 = 0;
                                                                var77_64 = null;
                                                                var78_65 = 0;
                                                                var100_82 = null;
                                                                for (var24_23 = 0; var24_23 < var19_18 /* !! */ ; ++var24_23) {
                                                                    var79_66 /* !! */  = (int)var11_10[var24_23];
                                                                    var39_37 /* !! */  = var41_38 /* !! */ [var24_23];
                                                                    var101_83 = var78_65;
                                                                    var78_65 = var19_18 /* !! */ ;
                                                                    var19_18 /* !! */  = var37_35;
                                                                    var37_35 = var101_83;
                                                                    var66_55 = var41_38 /* !! */ ;
                                                                    var43_40 = var79_66 /* !! */ ;
                                                                    while (var43_40 > 0) {
                                                                        var42_39 = Math.min((int)var74_61, var43_40);
                                                                        var21_20[var37_35] = var39_37 /* !! */ ;
                                                                        var69_58 /* !! */  = var11_10;
                                                                        var62_52 /* !! */  = var30_28 * var42_39;
                                                                        var22_21[var37_35] = var62_52 /* !! */ ;
                                                                        var19_18 /* !! */  = Math.max(var19_18 /* !! */ , var62_52 /* !! */ );
                                                                        var62_52 /* !! */  = (int)var74_61;
                                                                        var102_84 = var21_20;
                                                                        var103_85 = (long)var26_25 * var83_70 /* !! */ ;
                                                                        var23_22[var37_35] = var103_85;
                                                                        var98_80[var37_35] = (op3)true;
                                                                        var16_15 /* !! */  = (int)var22_21[var37_35];
                                                                        var103_85 = var16_15 /* !! */ ;
                                                                        var39_37 /* !! */  += var103_85;
                                                                        var26_25 += var42_39;
                                                                        var43_40 -= var42_39;
                                                                        var85_71 = 1.4E-45f;
                                                                        ++var37_35;
                                                                    }
                                                                    var69_58 /* !! */  = var11_10;
                                                                    var62_52 /* !! */  = (int)var74_61;
                                                                    var102_84 = var21_20;
                                                                    var85_71 = 1.4E-45f;
                                                                    var41_38 /* !! */  = (byte[])var66_55;
                                                                    var101_83 = var37_35;
                                                                    var37_35 = var19_18 /* !! */ ;
                                                                    var19_18 /* !! */  = var78_65;
                                                                    var78_65 = var101_83;
                                                                }
                                                                var102_84 = var21_20;
                                                                var105_86 = var26_25;
                                                                var66_55 = var8_7;
                                                                var63_53 = var83_70 /* !! */  *= var105_86;
                                                                var38_36 /* !! */  = var98_80;
                                                                var58_49 = var23_22;
                                                                var107_87 = var37_35;
                                                                var98_80 = var21_20;
                                                                var23_22 = var48_43;
                                                                break block112;
                                                            }
                                                            var15_14 = (op3[])new long[var33_31 /* !! */ ];
                                                            var38_36 /* !! */  = new int[var33_31 /* !! */ ];
                                                            var58_49 = new long[var33_31 /* !! */ ];
                                                            var79_66 /* !! */  = var35_33;
                                                            var82_69 = (op3[])new int[var33_31 /* !! */ ];
                                                            var108_88 = var48_43;
                                                            var65_54 = var41_38 /* !! */ ;
                                                            var91_75 = var28_27;
                                                            var93_76 = var28_27;
                                                            var48_43 = null;
                                                            var43_40 = 0;
                                                            var41_38 /* !! */  = null;
                                                            var68_57 = 0;
                                                            var109_89 = null;
                                                            var110_90 = 0;
                                                            var111_91 = 0;
                                                            var101_83 = var35_33;
                                                            var66_55 = var8_7;
                                                            var59_50 /* !! */  = var78_65;
                                                            var78_65 = var25_24;
                                                            var25_24 = var37_35;
                                                            var77_64 = var27_26 /* !! */ ;
                                                            var26_25 = var99_81;
                                                            var99_81 = var12_11;
                                                            var12_11 = var35_33;
                                                            for (var10_9 = 0; var10_9 < var33_31 /* !! */ ; ++var10_9) {
                                                                var112_92 = 1;
                                                                while (var68_57 == 0 && (var112_92 = var98_80.a()) != 0) {
                                                                    var95_77 = var99_81;
                                                                    var75_62 = var25_24;
                                                                    var113_93 = var98_80.d;
                                                                    var97_79 = var33_31 /* !! */ ;
                                                                    var68_57 = var98_80.c;
                                                                    var93_76 = var113_93;
                                                                    var33_31 /* !! */  = var97_79;
                                                                }
                                                                var97_79 = var33_31 /* !! */ ;
                                                                var95_77 = var99_81;
                                                                var75_62 = var25_24;
                                                                if (var112_92 == 0) {
                                                                    var8_7 = "Unexpected end of chunk data";
                                                                    Cx.f((String)var8_7);
                                                                    var15_14 = (op3[])Arrays.copyOf((long[])var15_14, var10_9);
                                                                    var38_36 /* !! */  = Arrays.copyOf((int[])var38_36 /* !! */ , var10_9);
                                                                    var58_49 = Arrays.copyOf((long[])var58_49, var10_9);
                                                                    var82_69 = (op3[])Arrays.copyOf((int[])var82_69, var10_9);
                                                                    var33_31 /* !! */  = var10_9;
lbl568:
                                                                    // 2 sources

                                                                    while (true) {
                                                                        continue;
                                                                        break;
                                                                    }
                                                                }
                                                                if (var9_8 /* !! */  != null) {
                                                                    while (var111_91 == 0 && var78_65 > 0) {
                                                                        var111_91 = var9_8 /* !! */ .A();
                                                                        var110_90 = var9_8 /* !! */ .i();
                                                                        var33_31 /* !! */  = -1;
                                                                        var78_65 += -1;
                                                                    }
                                                                    var33_31 /* !! */  = -1;
                                                                    var111_91 += -1;
                                                                }
                                                                var33_31 /* !! */  = var110_90;
                                                                var15_14[var10_9] = (op3)var93_76;
                                                                var99_81 = var11_10.a();
                                                                var38_36 /* !! */ [var10_9] = var99_81;
                                                                if (var99_81 > var43_40) {
                                                                    var43_40 = var99_81;
                                                                }
                                                                var113_93 = var33_31 /* !! */ ;
                                                                var113_93 = var91_75 + var113_93;
                                                                var58_49[var10_9] = var113_93;
                                                                if (var21_20 == null) {
                                                                    var99_81 = 1;
                                                                } else {
                                                                    var99_81 = 0;
                                                                    var22_21 = null;
                                                                }
                                                                var82_69[var10_9] = var99_81;
                                                                if (var10_9 == var59_50 /* !! */ ) {
                                                                    var99_81 = 1;
                                                                    var82_69[var10_9] = var99_81;
                                                                    var25_24 = -1;
                                                                    if ((var12_11 += var25_24) > 0) {
                                                                        var21_20.getClass();
                                                                        var59_50 /* !! */  = var21_20.A() - var99_81;
                                                                    }
lbl602:
                                                                    // 4 sources

                                                                    while (true) {
                                                                        continue;
                                                                        break;
                                                                    }
                                                                }
                                                                var25_24 = -1;
                                                                ** continue;
                                                                var112_92 = var43_40;
                                                                var22_21 = var11_10;
                                                                var105_86 = var26_25;
                                                                var91_75 += var105_86;
                                                                var43_40 = var75_62 + -1;
                                                                if (var43_40 == 0 && var95_77 > 0) {
                                                                    var43_40 = var65_54.A();
                                                                    var62_52 /* !! */  = var65_54.i();
                                                                    var95_77 += -1;
                                                                    var26_25 = var62_52 /* !! */ ;
                                                                }
                                                                var62_52 /* !! */  = (int)var38_36 /* !! */ [var10_9];
                                                                var75_62 = var43_40;
                                                                var105_86 = var62_52 /* !! */ ;
                                                                var93_76 += var105_86;
                                                                var68_57 += -1;
                                                                var110_90 = var33_31 /* !! */ ;
                                                                var11_10 = var22_21;
                                                                var43_40 = var112_92;
                                                                var99_81 = var95_77;
                                                                var25_24 = var75_62;
                                                                var33_31 /* !! */  = var97_79;
                                                            }
                                                            var97_79 = var33_31 /* !! */ ;
                                                            var95_77 = var99_81;
                                                            var75_62 = var25_24;
                                                            ** continue;
                                                            var59_50 /* !! */  = var68_57;
                                                            var10_9 = var110_90;
                                                            var51_45 = var110_90;
                                                            var51_45 = var91_75 + var51_45;
                                                            if (var9_8 /* !! */  != null) {
                                                                while (var78_65 > 0) {
                                                                    var10_9 = var9_8 /* !! */ .A();
                                                                    if (var10_9 != 0) {
                                                                        var19_18 /* !! */  = 0;
                                                                        var9_8 /* !! */  = null;
                                                                        var10_9 = -1;
                                                                        break block97;
                                                                    }
                                                                    var9_8 /* !! */ .i();
                                                                    var10_9 = -1;
                                                                    var78_65 += -1;
                                                                }
                                                            }
                                                            var10_9 = -1;
                                                            var19_18 /* !! */  = 1;
                                                        }
                                                        if (var12_11 != 0 || var75_62 != 0 || var59_50 /* !! */  != 0 || var95_77 != 0) break block113;
                                                        var62_52 /* !! */  = var111_91;
                                                        if (var111_91 != 0 || var19_18 /* !! */  == 0) break block114;
                                                        var78_65 = var33_31 /* !! */ ;
                                                        var23_22 = var108_88;
                                                        break block115;
                                                    }
                                                    var62_52 /* !! */  = var111_91;
                                                }
                                                var22_21 = new StringBuilder("Inconsistent stbl box for track ");
                                                var23_22 = var108_88;
                                                var26_25 = var108_88.a;
                                                var78_65 = var33_31 /* !! */ ;
                                                m10.a((StringBuilder)var22_21, var26_25, ": remainingSynchronizationSamples ", var12_11, ", remainingSamplesAtTimestampDelta ");
                                                var34_32 /* !! */  = ", remainingSamplesInChunk ";
                                                var48_43 = ", remainingTimestampDeltaChanges ";
                                                var12_11 = var75_62;
                                                m10.a((StringBuilder)var22_21, var75_62, (String)var34_32 /* !! */ , var59_50 /* !! */ , (String)var48_43);
                                                var12_11 = var95_77;
                                                var22_21.append(var95_77);
                                                var8_7 = ", remainingSamplesAtTimestampOffset ";
                                                var22_21.append((String)var8_7);
                                                var22_21.append(var62_52 /* !! */ );
                                                var27_26 /* !! */  = var19_18 /* !! */  == 0 ? ", ctts invalid" : var77_64;
                                                var22_21.append(var27_26 /* !! */ );
                                                var8_7 = var22_21.toString();
                                                Cx.f((String)var8_7);
                                            }
                                            var107_87 = var43_40;
                                            var63_53 = var51_45;
                                            var22_21 = var38_36 /* !! */ ;
                                            var33_31 /* !! */  = var78_65;
                                            var38_36 /* !! */  = var82_69;
                                            var98_80 = var15_14;
                                        }
                                        var27_26 /* !! */  = RoundingMode.DOWN;
                                        var115_94 = 1000000L;
                                        var72_60 = var23_22.c;
                                        var49_44 = var63_53;
                                        var21_20 = var27_26 /* !! */ ;
                                        var117_95 = gz3.O(var63_53, var115_94, var72_60, (RoundingMode)var27_26 /* !! */ );
                                        var72_60 = var23_22.c;
                                        var21_20 = var23_22.i;
                                        if (var21_20 != null) break block116;
                                        gz3.N((long[])var58_49, var72_60);
                                        var32_30 /* !! */  = var9_8 /* !! */ ;
                                        var119_96 = var38_36 /* !! */ ;
                                        var9_8 /* !! */  = new Bp3((kp3)var23_22, (long[])var98_80, (int[])var22_21, var107_87, (long[])var58_49, (int[])var38_36 /* !! */ , var117_95);
                                        ** GOTO lbl330
                                    }
                                    var10_9 = ((Object)var21_20).length;
                                    var62_52 /* !! */  = var23_22.b;
                                    var82_69 = (op3[])var23_22.j;
                                    var43_40 = 1;
                                    if (var10_9 != var43_40 || var62_52 /* !! */  != var43_40 || (var10_9 = ((Object)var58_49).length) < (var43_40 = 2)) break block117;
                                    var82_69.getClass();
                                    var10_9 = 0;
                                    var48_43 = null;
                                    var70_59 = (long)var82_69[0];
                                    var39_37 /* !! */  = (long)var21_20[0];
                                    var49_44 = var23_22.c;
                                    var46_42 = var72_60;
                                    var72_60 = var23_22.d;
                                    var54_47 = var49_44;
                                    var49_44 = var39_37 /* !! */ ;
                                    var67_56 = var33_31 /* !! */ ;
                                    var33_31 /* !! */  = var62_52 /* !! */ ;
                                    var109_89 = var82_69;
                                    var115_94 = var54_47;
                                    var102_84 = var98_80;
                                    var120_97 = var22_21;
                                    var121_98 /* !! */  = var46_42;
                                    var42_39 = var62_52 /* !! */ ;
                                    var34_32 /* !! */  = var21_20;
                                    var21_20 = var27_26 /* !! */ ;
                                    var49_44 = gz3.O(var39_37 /* !! */ , var54_47, var72_60, (RoundingMode)var27_26 /* !! */ );
                                    var49_44 = var70_59 + var49_44;
                                    var62_52 /* !! */  = ((Object)var58_49).length - 1;
                                    var36_34 = 0.0f;
                                    var82_69 = null;
                                    var12_11 = 4;
                                    var13_12 = 5.6E-45f;
                                    var74_61 = gz3.h(var12_11, 0, var62_52 /* !! */ );
                                    var16_15 /* !! */  = ((Object)var58_49).length - var12_11;
                                    var62_52 /* !! */  = gz3.h(var16_15 /* !! */ , 0, var62_52 /* !! */ );
                                    var56_48 = (long)var58_49[0];
                                    var35_33 = var56_48 == var70_59 ? 0 : (var56_48 < var70_59 ? -1 : 1);
                                    if (var35_33 <= 0 && (var74_61 = (cfr_temp_2 = var70_59 - (var83_70 /* !! */  = (long)var58_49[var74_61])) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) < 0 && (var12_11 = (int)((cfr_temp_3 = (var115_94 = (long)var58_49[var62_52 /* !! */ ]) - var49_44) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1))) < 0 && (var62_52 /* !! */  = (int)(var49_44 == var63_53 ? 0 : (var49_44 < var63_53 ? -1 : 1))) <= 0) {
                                        var62_52 /* !! */  = 1;
                                    } else {
                                        var62_52 /* !! */  = 0;
                                        var11_10 = null;
                                    }
                                    if (var62_52 /* !! */  == 0) break block118;
                                    var123_99 = var63_53 - var49_44;
                                    var49_44 = var70_59 - var56_48;
                                    var21_20 = var66_55;
                                    var72_60 = var66_55.E;
                                    var70_59 = var23_22.c;
                                    var115_94 = var72_60;
                                    var56_48 = var72_60;
                                    var72_60 = var70_59;
                                    var77_64 = var66_55;
                                    var21_20 = var27_26 /* !! */ ;
                                    var72_60 = gz3.O(var49_44, var115_94, var70_59, (RoundingMode)var27_26 /* !! */ );
                                    var115_94 = var23_22.c;
                                    var49_44 = var123_99;
                                    var125_100 = var115_94;
                                    var115_94 = var56_48;
                                    var56_48 = var63_53;
                                    var63_53 = var72_60;
                                    var72_60 = var125_100;
                                    var49_44 = gz3.O(var123_99, var115_94, var125_100, (RoundingMode)var27_26 /* !! */ );
                                    var62_52 /* !! */  = var63_53 == var28_27 ? 0 : (var63_53 < var28_27 ? -1 : 1);
                                    if (var62_52 /* !! */  == 0 && (var62_52 /* !! */  = (int)(var49_44 == var28_27 ? 0 : (var49_44 < var28_27 ? -1 : 1))) == 0) lbl-1000:
                                    // 3 sources

                                    {
                                        while (true) {
                                            continue;
                                            break;
                                        }
                                    }
                                    var115_94 = 0x7FFFFFFFL;
                                    cfr_temp_4 = var63_53 - var115_94;
                                    var12_11 = cfr_temp_4 == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1);
                                    if (var12_11 > 0 || (var12_11 = (int)(var49_44 == var115_94 ? 0 : (var49_44 < var115_94 ? -1 : 1))) > 0) ** GOTO lbl-1000
                                    var19_18 /* !! */  = (int)var63_53;
                                    var8_7 = var1_1;
                                    var1_1.a = var19_18 /* !! */ ;
                                    var1_1.b = var19_18 /* !! */  = (int)var49_44;
                                    gz3.N((long[])var58_49, var121_98 /* !! */ );
                                    var19_18 /* !! */  = 0;
                                    var49_44 = (long)var34_32 /* !! */ [0];
                                    var115_94 = 1000000L;
                                    var72_60 = var23_22.d;
                                    var21_20 = var27_26 /* !! */ ;
                                    var117_95 = gz3.O(var49_44, var115_94, var72_60, (RoundingMode)var27_26 /* !! */ );
                                    var32_30 /* !! */  = var9_8 /* !! */ ;
                                    var119_96 = var38_36 /* !! */ ;
                                    var9_8 /* !! */  = new Bp3((kp3)var23_22, (long[])var102_84, (int[])var120_97, var107_87, (long[])var58_49, (int[])var38_36 /* !! */ , var117_95);
                                    ** GOTO lbl330
                                }
                                var56_48 = var63_53;
lbl794:
                                // 2 sources

                                while (true) {
                                    var77_64 = var66_55;
                                    ** continue;
                                    break;
                                }
                            }
                            var56_48 = var63_53;
                            var67_56 = var33_31 /* !! */ ;
                            var42_39 = var62_52 /* !! */ ;
                            var109_89 = var82_69;
                            var34_32 /* !! */  = var21_20;
                            var102_84 = var98_80;
                            var120_97 = var22_21;
                            ** continue;
                            var8_7 = var1_1;
                            var19_18 /* !! */  = var34_32 /* !! */ .length;
                            var10_9 = 1;
                            if (var19_18 /* !! */  != var10_9) break block119;
                            var19_18 /* !! */  = 0;
                            var9_8 /* !! */  = null;
                            var49_44 = (long)var34_32 /* !! */ [0];
                            cfr_temp_5 = var49_44 - var28_27;
                            var62_52 /* !! */  = cfr_temp_5 == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1);
                            if (var62_52 /* !! */  != 0) break block120;
                            var109_89.getClass();
                            var127_101 /* !! */  = var109_89[0];
                            var41_38 /* !! */  = null;
                            for (var43_40 = 0; var43_40 < (var62_52 /* !! */  = ((Object)var58_49).length); var43_40 += var62_52 /* !! */ ) {
                                var70_59 = (long)(var58_49[var43_40] - var127_101 /* !! */ );
                                var69_58 /* !! */  = RoundingMode.DOWN;
                                var87_73 = 1000000L;
                                var89_74 = var115_94 = var23_22.c;
                                var115_94 = gz3.O(var70_59, var87_73, var115_94, (RoundingMode)var69_58 /* !! */ );
                                var58_49[var43_40] = var115_94;
                                var62_52 /* !! */  = 1;
                            }
                            var70_59 = var56_48 - var127_101 /* !! */ ;
                            var69_58 /* !! */  = RoundingMode.DOWN;
                            var87_73 = 1000000L;
                            var127_101 /* !! */  = var23_22.c;
                            var89_74 = (long)var127_101 /* !! */ ;
                            var117_95 = gz3.O(var70_59, var87_73, (long)var127_101 /* !! */ , (RoundingMode)var69_58 /* !! */ );
                            var32_30 /* !! */  = var34_32 /* !! */ ;
                            var119_96 = var38_36 /* !! */ ;
                            var9_8 /* !! */  = var34_32 /* !! */  = new Bp3((kp3)var23_22, (long[])var102_84, (int[])var120_97, var107_87, (long[])var58_49, (int[])var38_36 /* !! */ , var117_95);
                            ** GOTO lbl330
                        }
lbl840:
                        // 2 sources

                        while (true) {
                            continue;
                            break;
                        }
                    }
                    var19_18 /* !! */  = 0;
                    var9_8 /* !! */  = null;
                    ** continue;
                    var10_9 = var42_39;
                    var43_40 = 1;
                    if (var42_39 == var43_40) {
                        var43_40 = 1;
                    } else {
                        var43_40 = 0;
                        var41_38 /* !! */  = null;
                    }
                    var62_52 /* !! */  = var34_32 /* !! */ .length;
                    var11_10 = (op3[])new int[var62_52 /* !! */ ];
                    var35_33 = var34_32 /* !! */ .length;
                    var82_69 = (op3[])new int[var35_33];
                    var109_89.getClass();
                    var13_12 = 0.0f;
                    var14_13 /* !! */  = null;
                    var74_61 = 0;
                    var85_71 = 0.0f;
                    var15_14 = null;
                    var16_15 /* !! */  = 0;
                    var20_19 = 0.0f;
                    var21_20 = null;
                    var17_16 = 0;
                    var98_80 = null;
                    for (var12_11 = 0; var12_11 < (var99_81 = var34_32 /* !! */ .length); var12_11 += var19_18 /* !! */ ) {
                        var22_21 = var34_32 /* !! */ ;
                        var129_102 = var109_89[var12_11];
                        var125_100 = -1;
                        cfr_temp_6 = var129_102 - var125_100;
                        var26_25 = cfr_temp_6 == 0 ? 0 : (cfr_temp_6 < 0 ? -1 : 1);
                        if (var26_25 != 0) {
                            var56_48 = (long)var34_32 /* !! */ [var12_11];
                            var80_67 /* !! */  = (long[])RoundingMode.DOWN;
                            var26_25 = var17_16;
                            var100_82 = var34_32 /* !! */ ;
                            var121_98 /* !! */  = var23_22.c;
                            var79_66 /* !! */  = (int)var74_61;
                            var42_39 = var16_15 /* !! */ ;
                            var103_85 = var23_22.d;
                            var123_99 = var121_98 /* !! */ ;
                            var103_85 = gz3.O(var56_48, var121_98 /* !! */ , var103_85, (RoundingMode)var80_67 /* !! */ );
                            var17_16 = 1;
                            var99_81 = gz3.d((long[])var58_49, (long)var129_102, (boolean)var17_16);
                            var11_10[var12_11] = var99_81;
                            while ((var99_81 = (int)var11_10[var12_11]) >= 0 && (var131_103 = var38_36 /* !! */ [var99_81] & 1) == 0) {
                                var11_10[var12_11] = var99_81 -= var17_16;
                                var17_16 = 1;
                            }
                            var74_61 = gz3.a((long[])var58_49, (long)(var129_102 += var103_85), (boolean)var43_40);
                            var82_69[var12_11] = var74_61;
                            var74_61 = 2;
                            var85_71 = 2.8E-45f;
                            if (var10_9 == var74_61) {
                                while (true) {
                                    var16_15 /* !! */  = (int)var82_69[var12_11];
                                    var17_16 = ((Object)var58_49).length;
                                    var99_81 = 1;
                                    if (var16_15 /* !! */  >= (var17_16 -= var99_81) || (var131_103 = (int)((cfr_temp_7 /* !! */  = (var121_98 /* !! */  = (long)var58_49[var16_15 /* !! */  += var99_81]) - var129_102) == 0L ? 0 : (cfr_temp_7 /* !! */  < 0L ? -1 : 1))) > 0) break;
                                    var82_69[var12_11] = (op3)var16_15 /* !! */ ;
                                }
                            }
                            var19_18 /* !! */  = (int)var82_69[var12_11];
                            var33_31 /* !! */  = (int)var11_10[var12_11];
                            var16_15 /* !! */  = var19_18 /* !! */  - var33_31 /* !! */  + var42_39;
                            var17_16 = var26_25;
                            if (var26_25 != var33_31 /* !! */ ) {
                                var33_31 /* !! */  = 1;
                            } else {
                                var33_31 /* !! */  = 0;
                                var34_32 /* !! */  = null;
                            }
                            var33_31 /* !! */  = var79_66 /* !! */  | var33_31 /* !! */ ;
                            var17_16 = var19_18 /* !! */ ;
lbl916:
                            // 2 sources

                            while (true) {
                                continue;
                                break;
                            }
                        }
                        var79_66 /* !! */  = (int)var74_61;
                        var42_39 = var16_15 /* !! */ ;
                        var100_82 = var34_32 /* !! */ ;
                        var74_61 = 2;
                        var85_71 = 2.8E-45f;
                        var33_31 /* !! */  = var79_66 /* !! */ ;
                        ** continue;
                        var19_18 /* !! */  = 1;
                        var74_61 = var33_31 /* !! */ ;
                        var34_32 /* !! */  = var100_82;
                        var19_18 /* !! */  = 0;
                        var9_8 /* !! */  = null;
                    }
                    var100_82 = var34_32 /* !! */ ;
                    var79_66 /* !! */  = (int)var74_61;
                    var33_31 /* !! */  = var67_56;
                    if (var16_15 /* !! */  != var67_56) {
                        var19_18 /* !! */  = 1;
                    } else {
                        var19_18 /* !! */  = 0;
                        var9_8 /* !! */  = null;
                    }
                    var19_18 /* !! */  = var79_66 /* !! */  | var19_18 /* !! */ ;
                    var34_32 /* !! */  = var19_18 /* !! */  != 0 ? (op3[])new long[var16_15 /* !! */ ] : var102_84;
                    var48_43 = var19_18 /* !! */  != 0 ? (Object)new int[var16_15 /* !! */ ] : var120_97;
                    if (var19_18 /* !! */  != 0) {
                        var107_87 = 0;
                    }
                    var41_38 /* !! */  = var19_18 /* !! */  != 0 ? (byte[])new int[var16_15 /* !! */ ] : (byte[])var38_36 /* !! */ ;
                    var14_13 /* !! */  = new long[var16_15 /* !! */ ];
                    var22_21 = var100_82;
                    var125_100 = var28_27;
                    var110_90 = var107_87;
                    var74_61 = 0;
                    var85_71 = 0.0f;
                    var15_14 = null;
                    var16_15 /* !! */  = 0;
                    var20_19 = 0.0f;
                    var21_20 = null;
                    var17_16 = 0;
                    var98_80 = null;
                    while (var74_61 < (var26_25 = var22_21.length)) {
                        var46_42 = (long)var109_89[var74_61];
                        var26_25 = var11_10[var74_61];
                        var59_50 /* !! */  = (int)var82_69[var74_61];
                        var108_88 = var11_10;
                        if (var19_18 /* !! */  != 0) {
                            var62_52 /* !! */  = var59_50 /* !! */  - var26_25;
                            var81_68 = var82_69;
                            var82_69 = var102_84;
                            System.arraycopy(var102_84, var26_25, var34_32 /* !! */ , var17_16, var62_52 /* !! */ );
                            var82_69 = var120_97;
                            System.arraycopy(var120_97, var26_25, var48_43, var17_16, var62_52 /* !! */ );
                            System.arraycopy(var38_36 /* !! */ , var26_25, var41_38 /* !! */ , var17_16, var62_52 /* !! */ );
                        } else {
                            var81_68 = var82_69;
                            var82_69 = var120_97;
                        }
                        var62_52 /* !! */  = var110_90;
                        while (var26_25 < var59_50 /* !! */ ) {
                            var132_104 = RoundingMode.DOWN;
                            var123_99 = 1000000L;
                            var133_105 = var74_61;
                            var134_106 /* !! */  = var16_15 /* !! */ ;
                            var135_107 = var20_19;
                            var103_85 = var23_22.d;
                            var56_48 = var125_100;
                            var80_67 /* !! */  = (long[])var132_104;
                            var103_85 = gz3.O(var125_100, var123_99, var103_85, var132_104);
                            var93_76 = (long)(var58_49[var26_25] - var46_42);
                            var136_108 = 1000000L;
                            var80_67 /* !! */  = (long[])var38_36 /* !! */ ;
                            var138_109 = var26_25;
                            var139_110 = (reference)var23_22.c;
                            var86_72 /* !! */  = (long[])var132_104;
                            cfr_temp_8 = (var139_110 = (reference)gz3.O(var93_76, var136_108, (long)var139_110, var132_104)) - var28_27;
                            var141_111 /* !! */  = (reference)(cfr_temp_8 == 0 ? 0 : (cfr_temp_8 < 0 ? -1 : 1));
                            if (var141_111 /* !! */  < 0) {
                                var134_106 /* !! */  = 1;
                                var135_107 = 1.4E-45f;
                            }
                            var14_13 /* !! */ [var17_16] = var103_85 += var139_110;
                            if (var19_18 /* !! */  != 0 && (var74_61 = (long)var48_43[var17_16]) > var62_52 /* !! */ ) {
                                var62_52 /* !! */  = (int)var82_69[var138_109];
                            }
                            var85_71 = 1.4E-45f;
                            ++var17_16;
                            var26_25 = var138_109 + 1;
                            var38_36 /* !! */  = var80_67 /* !! */ ;
                            var74_61 = var133_105;
                            var16_15 /* !! */  = var134_106 /* !! */ ;
                            var20_19 = var135_107;
                        }
                        var133_105 = var74_61;
                        var134_106 /* !! */  = var16_15 /* !! */ ;
                        var135_107 = var20_19;
                        var80_67 /* !! */  = (long[])var38_36 /* !! */ ;
                        var85_71 = 1.4E-45f;
                        var139_110 = var22_21[var74_61];
                        var125_100 += var139_110;
                        var59_50 /* !! */  = (int)(var74_61 + true);
                        var74_61 = var59_50 /* !! */ ;
                        var110_90 = var62_52 /* !! */ ;
                        var120_97 = var82_69;
                        var11_10 = var108_88;
                        var82_69 = var81_68;
                        var8_7 = var1_1;
                    }
                    var80_67 /* !! */  = (long[])RoundingMode.DOWN;
                    var123_99 = 1000000L;
                    var63_53 = var23_22.d;
                    var56_48 = var125_100;
                    var142_112 = gz3.O(var125_100, var123_99, var63_53, (RoundingMode)var80_67 /* !! */ );
                    if (var16_15 /* !! */  != 0) {
                        var8_7 = var77_64.a();
                        var19_18 /* !! */  = 1;
                        var8_7.t = var19_18 /* !! */ ;
                        var9_8 /* !! */  = new d((d$a)var8_7);
                        var38_36 /* !! */  = var8_7;
                        var96_78 = var23_22.i;
                        var76_63 /* !! */  = (op3[])var23_22.j;
                        var26_25 = var23_22.a;
                        var30_28 = var23_22.b;
                        var70_59 = var23_22.c;
                        var87_73 = var23_22.d;
                        var89_74 = var23_22.e;
                        var91_75 = var115_94 = var23_22.f;
                        var144_113 = var23_22.h;
                        var11_10 = var23_22.l;
                        var95_77 = var62_52 /* !! */  = var23_22.k;
                        var120_97 = var9_8 /* !! */ ;
                        var119_96 = var8_7 = new kp3(var26_25, var30_28, var70_59, var87_73, var89_74, var115_94, (d)var9_8 /* !! */ , var144_113, var11_10, var62_52 /* !! */ , (long[])var96_78, (long[])var76_63 /* !! */ );
                    } else {
                        var119_96 = var23_22;
                    }
                    var9_8 /* !! */  = new Bp3((kp3)var119_96, (long[])var34_32 /* !! */ , (int[])var48_43, var110_90, var14_13 /* !! */ , var41_38 /* !! */ , var142_112);
                    ** continue;
                    var8_7 = var31_29;
                    var31_29.add(var9_8 /* !! */ );
                    ** continue;
                    var19_18 /* !! */  = 1;
                    var12_11 = var18_17 + 1;
                    var9_8 /* !! */  = var1_1;
                    var11_10 = var8_7;
                    var10_9 = -1;
                    var8_7 = var0;
                    continue;
                }
                throw ParserException.a("Track has no sample table size information", null);
            }
            throw ParserException.a("Malformed sample table (stbl) missing sample description (stsd)", null);
        }
        var8_7 = var11_10;
        return var11_10;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static void h(Xm2 var0, int var1_1, int var2_2, int var3_3, int var4_4, int var5_5, DrmInitData var6_6, JA$f var7_7, int var8_8) {
        var9_9 = var0;
        var10_10 = var2_2;
        var11_11 = var3_3;
        var12_12 = var6_6;
        var13_13 = var7_7;
        var14_14 = 2.2E-44f;
        var15_15 = var2_2 + 16;
        var0.I(var15_15);
        var0.J(16);
        var16_16 = var0.C();
        var15_15 = var0.C();
        var0.J(50);
        var17_17 = var0.b;
        var18_18 = 1701733238;
        var19_19 = var1_1;
        if (var1_1 == var18_18) {
            var20_20 /* !! */  = JA.e((Xm2)var0, var2_2, var3_3);
            if (var20_20 /* !! */  != null) {
                var21_21 = (Integer)var20_20 /* !! */ .first;
                var19_19 = var21_21.intValue();
                if (var6_6 == null) {
                    var22_22 = 0;
                    var12_12 = null;
                } else {
                    var23_23 /* !! */  = ((op3)var20_20 /* !! */ .second).b;
                    var12_12 = var6_6.a((String)var23_23 /* !! */ );
                }
                var20_20 /* !! */  = (op3)var20_20 /* !! */ .second;
                var23_23 /* !! */  = var13_13.a;
                var23_23 /* !! */ [var8_8] = var20_20 /* !! */ ;
            }
            var9_9.I(var17_17);
        }
        var18_18 = 1831958048;
        var23_23 /* !! */  = "video/3gpp";
        if (var19_19 == var18_18) {
            var20_20 /* !! */  = "video/mpeg";
        } else {
            var18_18 = 1211250227;
            if (var19_19 == var18_18) {
                var20_20 /* !! */  = var23_23 /* !! */ ;
            } else {
                var18_18 = 0;
                var20_20 /* !! */  = null;
            }
        }
        var24_24 = 0;
        var25_25 /* !! */  = null;
        var26_26 = null;
        var27_27 = 1.0f;
        var28_28 = 0;
        var29_29 = null;
        var30_30 = 0;
        var31_31 = null;
        var32_32 = null;
        var33_33 = -1;
        var34_34 = -1;
        var35_35 = -1;
        var36_36 = -1;
        var37_37 = -1;
        var38_38 = 8;
        var39_39 = 8;
        var40_40 = null;
        var41_41 = false;
        while (true) {
            block137: {
                block148: {
                    block140: {
                        block164: {
                            block166: {
                                block165: {
                                    block163: {
                                        block162: {
                                            block161: {
                                                block151: {
                                                    block138: {
                                                        block160: {
                                                            block156: {
                                                                block159: {
                                                                    block158: {
                                                                        block157: {
                                                                            block155: {
                                                                                block154: {
                                                                                    block153: {
                                                                                        block152: {
                                                                                            block150: {
                                                                                                block149: {
                                                                                                    block145: {
                                                                                                        block147: {
                                                                                                            block146: {
                                                                                                                block143: {
                                                                                                                    block144: {
                                                                                                                        block142: {
                                                                                                                            block141: {
                                                                                                                                if ((var42_42 = var17_17 - var10_10) >= var11_11) break;
                                                                                                                                var9_9.I(var17_17);
                                                                                                                                var42_42 = var9_9.b;
                                                                                                                                var43_43 = var0.i();
                                                                                                                                if (var43_43 == 0 && (var44_44 = var9_9.b - var10_10) == var11_11) {
                                                                                                                                    break;
                                                                                                                                }
                                                                                                                                if (var43_43 > 0) {
                                                                                                                                    var44_44 = 1;
                                                                                                                                } else {
                                                                                                                                    var44_44 = 0;
                                                                                                                                    var50_50 = null;
                                                                                                                                }
                                                                                                                                var51_51 = "childAtomSize must be positive";
                                                                                                                                s70_0.a((String)var51_51, (boolean)var44_44);
                                                                                                                                var44_44 = var0.i();
                                                                                                                                var10_10 = 1635148611;
                                                                                                                                var52_52 = 2.8406573E20f;
                                                                                                                                if (var44_44 != var10_10) break block141;
                                                                                                                                if (var20_20 /* !! */  == null) {
                                                                                                                                    var10_10 = 1;
                                                                                                                                    var52_52 = 1.4E-45f;
lbl81:
                                                                                                                                    // 2 sources

                                                                                                                                    while (true) {
                                                                                                                                        continue;
                                                                                                                                        break;
                                                                                                                                    }
                                                                                                                                }
                                                                                                                                var10_10 = 0;
                                                                                                                                var52_52 = 0.0f;
                                                                                                                                var55_55 = null;
                                                                                                                                ** continue;
                                                                                                                                var53_53 = 0;
                                                                                                                                var54_54 = 0.0f;
                                                                                                                                var51_51 = null;
                                                                                                                                s70_0.a(null, (boolean)var10_10);
                                                                                                                                var10_10 = 8;
                                                                                                                                var52_52 = 1.1E-44f;
                                                                                                                                var9_9.I(var42_42 += var10_10);
                                                                                                                                var55_55 = iu_0.a((Xm2)var0);
                                                                                                                                var13_13.c = var53_53 = var55_55.b;
                                                                                                                                if (!var41_41) {
                                                                                                                                    var27_27 = var54_54 = var55_55.k;
                                                                                                                                }
                                                                                                                                var51_51 = "video/avc";
                                                                                                                                var20_20 /* !! */  = var55_55.a;
                                                                                                                                var56_56 = var55_55.l;
                                                                                                                                var44_44 = var55_55.j;
                                                                                                                                var28_28 = var55_55.g;
                                                                                                                                var30_30 = var55_55.h;
                                                                                                                                var34_34 = var55_55.i;
                                                                                                                                var11_11 = var55_55.e;
                                                                                                                                var39_39 = var55_55.f;
                                                                                                                                var49_49 /* !! */  = var12_12;
                                                                                                                                var45_45 = var16_16;
                                                                                                                                var38_38 = var15_15;
                                                                                                                                var57_57 = var17_17;
                                                                                                                                var6_6 = var23_23 /* !! */ ;
                                                                                                                                var35_35 = var28_28;
                                                                                                                                var36_36 = var30_30;
                                                                                                                                var22_22 = var33_33;
                                                                                                                                var47_47 = var34_34;
                                                                                                                                var10_10 = 8;
                                                                                                                                var52_52 = 1.1E-44f;
                                                                                                                                var48_48 = 0;
                                                                                                                                var13_13 = null;
                                                                                                                                var16_16 = -1;
                                                                                                                                var14_14 = 0.0f / 0.0f;
                                                                                                                                var15_15 = 3;
                                                                                                                                var58_58 = 4.2E-45f;
                                                                                                                                var17_17 = var11_11;
                                                                                                                                var29_29 = var20_20 /* !! */ ;
                                                                                                                                var33_33 = var19_19;
                                                                                                                                var31_31 = var56_56;
                                                                                                                                var34_34 = var44_44;
                                                                                                                                var19_19 = 2;
                                                                                                                                var20_20 /* !! */  = var51_51;
                                                                                                                                var53_53 = 1;
                                                                                                                                var54_54 = 1.4E-45f;
                                                                                                                                break block137;
                                                                                                                            }
                                                                                                                            var10_10 = 1752589123;
                                                                                                                            var52_52 = 4.6541328E24f;
                                                                                                                            var59_59 = "video/hevc";
                                                                                                                            if (var44_44 != var10_10) break block142;
                                                                                                                            if (var20_20 /* !! */  == null) {
                                                                                                                                var10_10 = 1;
                                                                                                                                var52_52 = 1.4E-45f;
lbl142:
                                                                                                                                // 2 sources

                                                                                                                                while (true) {
                                                                                                                                    continue;
                                                                                                                                    break;
                                                                                                                                }
                                                                                                                            }
                                                                                                                            var10_10 = 0;
                                                                                                                            var52_52 = 0.0f;
                                                                                                                            var55_55 = null;
                                                                                                                            ** continue;
                                                                                                                            var53_53 = 0;
                                                                                                                            var54_54 = 0.0f;
                                                                                                                            var51_51 = null;
                                                                                                                            s70_0.a(null, (boolean)var10_10);
                                                                                                                            var9_9.I(var42_42 += 8);
                                                                                                                            var52_52 = 0.0f;
                                                                                                                            var55_55 = null;
                                                                                                                            var20_20 /* !! */  = T41.a((Xm2)var9_9, false, null);
                                                                                                                            var13_13.c = var10_10 = var20_20 /* !! */ .b;
                                                                                                                            if (!var41_41) {
                                                                                                                                var27_27 = var52_52 = var20_20 /* !! */ .i;
                                                                                                                            }
                                                                                                                            var10_10 = var20_20 /* !! */ .h;
                                                                                                                            var53_53 = -1;
                                                                                                                            var54_54 = 0.0f / 0.0f;
                                                                                                                            if (var10_10 != var53_53) {
                                                                                                                                var33_33 = var10_10;
                                                                                                                            }
                                                                                                                            var55_55 = var20_20 /* !! */ .a;
                                                                                                                            var53_53 = var20_20 /* !! */ .j;
                                                                                                                            var25_25 /* !! */  = var20_20 /* !! */ .k;
                                                                                                                            var42_42 = var20_20 /* !! */ .e;
                                                                                                                            var44_44 = var20_20 /* !! */ .f;
                                                                                                                            var29_29 = var55_55;
                                                                                                                            var30_30 = var20_20 /* !! */ .g;
                                                                                                                            var34_34 = var20_20 /* !! */ .c;
                                                                                                                            var10_10 = var20_20 /* !! */ .d;
                                                                                                                            var20_20 /* !! */  = var20_20 /* !! */ .l;
                                                                                                                            var39_39 = var10_10;
                                                                                                                            var49_49 /* !! */  = var12_12;
                                                                                                                            var45_45 = var16_16;
                                                                                                                            var38_38 = var15_15;
                                                                                                                            var57_57 = var17_17;
                                                                                                                            var6_6 = var23_23 /* !! */ ;
                                                                                                                            var35_35 = var42_42;
                                                                                                                            var36_36 = var44_44;
                                                                                                                            var47_47 = var30_30;
                                                                                                                            var22_22 = var33_33;
                                                                                                                            var17_17 = var34_34;
                                                                                                                            var10_10 = 8;
                                                                                                                            var52_52 = 1.1E-44f;
                                                                                                                            var48_48 = 0;
                                                                                                                            var13_13 = null;
                                                                                                                            var16_16 = -1;
                                                                                                                            var14_14 = 0.0f / 0.0f;
                                                                                                                            var15_15 = 3;
                                                                                                                            var58_58 = 4.2E-45f;
                                                                                                                            var34_34 = var53_53;
                                                                                                                            var33_33 = var19_19;
                                                                                                                            var31_31 = var25_25 /* !! */ ;
                                                                                                                            var53_53 = 1;
                                                                                                                            var54_54 = 1.4E-45f;
                                                                                                                            var19_19 = 2;
                                                                                                                            var25_25 /* !! */  = var20_20 /* !! */ ;
                                                                                                                            var20_20 /* !! */  = var59_59;
                                                                                                                            break block137;
                                                                                                                        }
                                                                                                                        var10_10 = 1818785347;
                                                                                                                        var52_52 = 1.12411706E27f;
                                                                                                                        if (var44_44 != var10_10) break block143;
                                                                                                                        var10_10 = (int)var59_59.equals(var20_20 /* !! */ );
                                                                                                                        var59_59 = "lhvC must follow hvcC atom";
                                                                                                                        s70_0.a((String)var59_59, (boolean)var10_10);
                                                                                                                        if (var25_25 /* !! */  == null) ** GOTO lbl-1000
                                                                                                                        var55_55 = var25_25 /* !! */ .a;
                                                                                                                        var10_10 = var55_55.size();
                                                                                                                        var11_11 = 2;
                                                                                                                        var60_60 = 2.8E-45f;
                                                                                                                        if (var10_10 >= var11_11) {
                                                                                                                            var10_10 = 1;
                                                                                                                            var52_52 = 1.4E-45f;
                                                                                                                        } else lbl-1000:
                                                                                                                        // 2 sources

                                                                                                                        {
                                                                                                                            var10_10 = 0;
                                                                                                                            var52_52 = 0.0f;
                                                                                                                            var55_55 = null;
                                                                                                                        }
                                                                                                                        s70_0.a("must have at least two layers", (boolean)var10_10);
                                                                                                                        var9_9.I(var42_42 += 8);
                                                                                                                        var25_25 /* !! */ .getClass();
                                                                                                                        var52_52 = 1.4E-45f;
                                                                                                                        var59_59 = T41.a((Xm2)var9_9, true, (DS1$k)var25_25 /* !! */ );
                                                                                                                        var10_10 = var13_13.c;
                                                                                                                        var53_53 = var59_59.b;
                                                                                                                        if (var10_10 == var53_53) {
                                                                                                                            var10_10 = 1;
                                                                                                                            var52_52 = 1.4E-45f;
                                                                                                                        } else {
                                                                                                                            var10_10 = 0;
                                                                                                                            var52_52 = 0.0f;
                                                                                                                            var55_55 = null;
                                                                                                                        }
                                                                                                                        var51_51 = "nalUnitLengthFieldLength must be same for both hvcC and lhvC atoms";
                                                                                                                        s70_0.a((String)var51_51, (boolean)var10_10);
                                                                                                                        var10_10 = var59_59.e;
                                                                                                                        var53_53 = -1;
                                                                                                                        var54_54 = 0.0f / 0.0f;
                                                                                                                        var18_18 = var35_35;
                                                                                                                        if (var10_10 != var53_53) {
                                                                                                                            if (var35_35 == var10_10) {
                                                                                                                                var10_10 = 1;
                                                                                                                                var52_52 = 1.4E-45f;
                                                                                                                            } else {
                                                                                                                                var10_10 = 0;
                                                                                                                                var52_52 = 0.0f;
                                                                                                                                var55_55 = null;
                                                                                                                            }
                                                                                                                            var56_56 = "colorSpace must be the same for both views";
                                                                                                                            s70_0.a((String)var56_56, (boolean)var10_10);
                                                                                                                        }
                                                                                                                        var10_10 = var59_59.f;
                                                                                                                        var42_42 = var36_36;
                                                                                                                        if (var10_10 != var53_53) {
                                                                                                                            if (var36_36 == var10_10) {
                                                                                                                                var10_10 = 1;
                                                                                                                                var52_52 = 1.4E-45f;
                                                                                                                            } else {
                                                                                                                                var10_10 = 0;
                                                                                                                                var52_52 = 0.0f;
                                                                                                                                var55_55 = null;
                                                                                                                            }
                                                                                                                            var50_50 = "colorRange must be the same for both views";
                                                                                                                            s70_0.a(var50_50, (boolean)var10_10);
                                                                                                                        }
                                                                                                                        if ((var10_10 = var59_59.g) != var53_53) {
                                                                                                                            var53_53 = var37_37;
                                                                                                                            if (var37_37 == var10_10) {
                                                                                                                                var10_10 = 1;
                                                                                                                                var52_52 = 1.4E-45f;
                                                                                                                            } else {
                                                                                                                                var10_10 = 0;
                                                                                                                                var52_52 = 0.0f;
                                                                                                                                var55_55 = null;
                                                                                                                            }
                                                                                                                            var50_50 = "colorTransfer must be the same for both views";
                                                                                                                            s70_0.a(var50_50, (boolean)var10_10);
                                                                                                                        } else {
                                                                                                                            var53_53 = var37_37;
                                                                                                                        }
                                                                                                                        var10_10 = var59_59.c;
                                                                                                                        var44_44 = var38_38;
                                                                                                                        var30_30 = var53_53;
                                                                                                                        if (var38_38 == var10_10) {
                                                                                                                            var10_10 = 1;
                                                                                                                            var52_52 = 1.4E-45f;
                                                                                                                        } else {
                                                                                                                            var10_10 = 0;
                                                                                                                            var52_52 = 0.0f;
                                                                                                                            var55_55 = null;
                                                                                                                        }
                                                                                                                        var51_51 = "bitdepthLuma must be the same for both views";
                                                                                                                        s70_0.a((String)var51_51, (boolean)var10_10);
                                                                                                                        var10_10 = var59_59.d;
                                                                                                                        var53_53 = var39_39;
                                                                                                                        var35_35 = var39_39;
                                                                                                                        if (var39_39 == var10_10) {
                                                                                                                            var10_10 = 1;
                                                                                                                            var52_52 = 1.4E-45f;
                                                                                                                        } else {
                                                                                                                            var10_10 = 0;
                                                                                                                            var52_52 = 0.0f;
                                                                                                                            var55_55 = null;
                                                                                                                        }
                                                                                                                        var51_51 = "bitdepthChroma must be the same for both views";
                                                                                                                        s70_0.a((String)var51_51, (boolean)var10_10);
                                                                                                                        var55_55 = var29_29;
                                                                                                                        if (var29_29 == null) break block144;
                                                                                                                        var55_55 = ImmutableList.builder().addAll((Iterable)var29_29);
                                                                                                                        var51_51 = var59_59.a;
                                                                                                                        var29_29 = var55_55.addAll((Iterable)var51_51).build();
                                                                                                                        var55_55 = "video/mv-hevc";
                                                                                                                        var59_59 = var59_59.k;
                                                                                                                        var49_49 /* !! */  = var12_12;
                                                                                                                        var45_45 = var16_16;
                                                                                                                        var38_38 = var15_15;
                                                                                                                        var57_57 = var17_17;
                                                                                                                        var6_6 = var23_23 /* !! */ ;
                                                                                                                        var36_36 = var42_42;
                                                                                                                        var17_17 = var44_44;
                                                                                                                        var47_47 = var30_30;
                                                                                                                        var22_22 = var33_33;
                                                                                                                        var39_39 = var35_35;
                                                                                                                        var48_48 = 0;
                                                                                                                        var13_13 = null;
                                                                                                                        var16_16 = -1;
                                                                                                                        var14_14 = 0.0f / 0.0f;
                                                                                                                        var15_15 = 3;
                                                                                                                        var58_58 = 4.2E-45f;
                                                                                                                        var53_53 = 1;
                                                                                                                        var54_54 = 1.4E-45f;
                                                                                                                        var31_31 = var59_59;
                                                                                                                        var35_35 = var18_18;
                                                                                                                        var33_33 = var19_19;
                                                                                                                        var19_19 = 2;
                                                                                                                        var20_20 /* !! */  = var55_55;
                                                                                                                        var10_10 = 8;
                                                                                                                        var52_52 = 1.1E-44f;
                                                                                                                        break block137;
                                                                                                                    }
                                                                                                                    throw ParserException.a("initializationData must be already set from hvcC atom", null);
                                                                                                                }
                                                                                                                var6_6 = var23_23 /* !! */ ;
                                                                                                                var55_55 = var29_29;
                                                                                                                var11_11 = var35_35;
                                                                                                                var28_28 = var36_36;
                                                                                                                var47_47 = var37_37;
                                                                                                                var35_35 = var38_38;
                                                                                                                var36_36 = var39_39;
                                                                                                                var48_48 = 1986361461;
                                                                                                                if (var44_44 != var48_48) break block145;
                                                                                                                var44_44 = var42_42 + 8;
                                                                                                                var9_9.I(var44_44);
                                                                                                                var48_48 = var9_9.b;
                                                                                                                var49_49 /* !! */  = var12_12;
                                                                                                                var44_44 = 0;
                                                                                                                var50_50 = null;
                                                                                                                while ((var22_22 = var48_48 - var42_42) < var43_43) {
                                                                                                                    var9_9.I(var48_48);
                                                                                                                    var22_22 = var0.i();
                                                                                                                    var46_46 = var55_55;
                                                                                                                    if (var22_22 > 0) {
                                                                                                                        var10_10 = 1;
                                                                                                                        var52_52 = 1.4E-45f;
                                                                                                                    } else {
                                                                                                                        var10_10 = 0;
                                                                                                                        var52_52 = 0.0f;
                                                                                                                        var55_55 = null;
                                                                                                                    }
                                                                                                                    s70_0.a((String)var51_51, (boolean)var10_10);
                                                                                                                    var10_10 = var0.i();
                                                                                                                    var38_38 = var15_15;
                                                                                                                    var15_15 = 1702454643;
                                                                                                                    var58_58 = 7.360879E22f;
                                                                                                                    if (var10_10 == var15_15) {
                                                                                                                        block136: {
                                                                                                                            var52_52 = 1.1E-44f;
                                                                                                                            var44_44 = var48_48 + 8;
                                                                                                                            var9_9.I(var44_44);
                                                                                                                            var10_10 = var9_9.b;
                                                                                                                            while ((var15_15 = var10_10 - var48_48) < var22_22) {
                                                                                                                                var9_9.I(var10_10);
                                                                                                                                var15_15 = var0.i();
                                                                                                                                if (var15_15 > 0) {
                                                                                                                                    var44_44 = 1;
                                                                                                                                } else {
                                                                                                                                    var44_44 = 0;
                                                                                                                                    var50_50 = null;
                                                                                                                                }
                                                                                                                                s70_0.a((String)var51_51, (boolean)var44_44);
                                                                                                                                var44_44 = var0.i();
                                                                                                                                var61_61 = var51_51;
                                                                                                                                var53_53 = 1937011305;
                                                                                                                                var54_54 = 1.936708E31f;
                                                                                                                                if (var44_44 == var53_53) {
                                                                                                                                    var53_53 = 4;
                                                                                                                                    var54_54 = 5.6E-45f;
                                                                                                                                    var9_9.J(var53_53);
                                                                                                                                    var10_10 = var0.w();
                                                                                                                                    var45_45 = var16_16;
                                                                                                                                    var44_44 = 1;
                                                                                                                                    var16_16 = var10_10 & 1;
                                                                                                                                    var57_57 = var17_17;
                                                                                                                                    if (var16_16 == var44_44) {
                                                                                                                                        var16_16 = 1;
                                                                                                                                        var14_14 = 1.4E-45f;
lbl398:
                                                                                                                                        // 2 sources

                                                                                                                                        while (true) {
                                                                                                                                            continue;
                                                                                                                                            break;
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                    var16_16 = 0;
                                                                                                                                    var14_14 = 0.0f;
                                                                                                                                    var63_63 = null;
                                                                                                                                    ** continue;
                                                                                                                                    var44_44 = 2;
                                                                                                                                    var17_17 = var10_10 & 2;
                                                                                                                                    if (var17_17 == var44_44) {
                                                                                                                                        var17_17 = 1;
lbl408:
                                                                                                                                        // 2 sources

                                                                                                                                        while (true) {
                                                                                                                                            continue;
                                                                                                                                            break;
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                    var17_17 = 0;
                                                                                                                                    var64_64 = null;
                                                                                                                                    ** continue;
                                                                                                                                    var44_44 = 8;
                                                                                                                                    if ((var10_10 &= var44_44) == var44_44) {
                                                                                                                                        var10_10 = 1;
                                                                                                                                        var52_52 = 1.4E-45f;
                                                                                                                                    } else {
                                                                                                                                        var10_10 = 0;
                                                                                                                                        var52_52 = 0.0f;
                                                                                                                                        var55_55 = null;
                                                                                                                                    }
                                                                                                                                    var51_51 = new JA$e((boolean)var16_16, (boolean)var17_17, (boolean)var10_10);
                                                                                                                                    var62_62 = new JA$c((JA$e)var51_51);
                                                                                                                                    break block136;
                                                                                                                                }
                                                                                                                                var45_45 = var16_16;
                                                                                                                                var57_57 = var17_17;
                                                                                                                                var10_10 += var15_15;
                                                                                                                            }
                                                                                                                            var45_45 = var16_16;
                                                                                                                            var61_61 = var51_51;
                                                                                                                            var57_57 = var17_17;
                                                                                                                            var15_15 = 0;
                                                                                                                            var58_58 = 0.0f;
                                                                                                                            var62_62 = null;
                                                                                                                        }
                                                                                                                        var50_50 = var62_62;
                                                                                                                    } else {
                                                                                                                        var45_45 = var16_16;
                                                                                                                        var61_61 = var51_51;
                                                                                                                        var57_57 = var17_17;
                                                                                                                    }
                                                                                                                    var48_48 += var22_22;
                                                                                                                    var55_55 = var46_46;
                                                                                                                    var15_15 = var38_38;
                                                                                                                    var51_51 = var61_61;
                                                                                                                    var16_16 = var45_45;
                                                                                                                    var17_17 = var57_57;
                                                                                                                }
                                                                                                                var46_46 = var55_55;
                                                                                                                var45_45 = var16_16;
                                                                                                                var38_38 = var15_15;
                                                                                                                var57_57 = var17_17;
                                                                                                                if (var50_50 == null) {
                                                                                                                    var10_10 = 0;
                                                                                                                    var52_52 = 0.0f;
                                                                                                                    var55_55 = null;
                                                                                                                } else {
                                                                                                                    var55_55 = new JA$i((JA$c)var50_50);
                                                                                                                }
                                                                                                                if (var55_55 == null || (var55_55 = var55_55.a) == null) break block146;
                                                                                                                var55_55 = var55_55.a;
                                                                                                                if (var25_25 /* !! */  == null || (var22_22 = (var12_12 = var25_25 /* !! */ .a).size()) < (var48_48 = 2)) break block147;
                                                                                                                var22_22 = var55_55.a;
                                                                                                                if (var22_22 != 0 && (var22_22 = (int)var55_55.b) != 0) {
                                                                                                                    var22_22 = 1;
                                                                                                                } else {
                                                                                                                    var22_22 = 0;
                                                                                                                    var12_12 = null;
                                                                                                                }
                                                                                                                var13_13 = "both eye views must be marked as available";
                                                                                                                s70_0.a((String)var13_13, (boolean)var22_22);
                                                                                                                var10_10 = (int)var55_55.c;
                                                                                                                var22_22 = 1;
                                                                                                                var12_12 = "for MV-HEVC, eye_views_reversed must be set to false";
                                                                                                                s70_0.a((String)var12_12, (boolean)(var10_10 ^= var22_22));
                                                                                                            }
                                                                                                            var22_22 = var33_33;
                                                                                                            ** GOTO lbl-1000
                                                                                                        }
                                                                                                        var22_22 = var33_33;
                                                                                                        var48_48 = -1;
                                                                                                        if (var33_33 == var48_48) {
                                                                                                            var10_10 = (int)var55_55.c;
                                                                                                            if (var10_10 != 0) {
                                                                                                                var10_10 = 5;
                                                                                                                var52_52 = 7.0E-45f;
                                                                                                            } else {
                                                                                                                var10_10 = 4;
                                                                                                                var52_52 = 5.6E-45f;
                                                                                                            }
                                                                                                            var33_33 = var10_10;
                                                                                                        } else lbl-1000:
                                                                                                        // 2 sources

                                                                                                        {
                                                                                                            var33_33 = var22_22;
                                                                                                        }
                                                                                                        var22_22 = var33_33;
                                                                                                        var17_17 = var35_35;
                                                                                                        var39_39 = var36_36;
                                                                                                        var10_10 = 8;
                                                                                                        var52_52 = 1.1E-44f;
                                                                                                        var48_48 = 0;
                                                                                                        var13_13 = null;
                                                                                                        var16_16 = -1;
                                                                                                        var14_14 = 0.0f / 0.0f;
                                                                                                        var15_15 = 3;
                                                                                                        var58_58 = 4.2E-45f;
                                                                                                        var53_53 = 1;
                                                                                                        var54_54 = 1.4E-45f;
                                                                                                        var35_35 = var11_11;
                                                                                                        var33_33 = var19_19;
                                                                                                        var36_36 = var28_28;
                                                                                                        var19_19 = 2;
lbl506:
                                                                                                        // 2 sources

                                                                                                        while (true) {
                                                                                                            var29_29 = var46_46;
                                                                                                            break block137;
                                                                                                            break;
                                                                                                        }
                                                                                                    }
                                                                                                    var46_46 = var29_29;
                                                                                                    var49_49 /* !! */  = var12_12;
                                                                                                    var45_45 = var16_16;
                                                                                                    var38_38 = var15_15;
                                                                                                    var57_57 = var17_17;
                                                                                                    var22_22 = var33_33;
                                                                                                    var10_10 = 1685480259;
                                                                                                    var52_52 = 1.8180206E22f;
                                                                                                    if (var44_44 == var10_10) break block148;
                                                                                                    var10_10 = 1685485123;
                                                                                                    var52_52 = 1.8185683E22f;
                                                                                                    if (var44_44 != var10_10) break block149;
                                                                                                    break block148;
                                                                                                }
                                                                                                var10_10 = 1987076931;
                                                                                                var52_52 = 1.21891066E33f;
                                                                                                if (var44_44 != var10_10) break block150;
                                                                                                if (var20_20 /* !! */  == null) {
                                                                                                    var10_10 = 1;
                                                                                                    var52_52 = 1.4E-45f;
lbl530:
                                                                                                    // 2 sources

                                                                                                    while (true) {
                                                                                                        continue;
                                                                                                        break;
                                                                                                    }
                                                                                                }
                                                                                                var10_10 = 0;
                                                                                                var52_52 = 0.0f;
                                                                                                var55_55 = null;
                                                                                                ** continue;
                                                                                                var11_11 = 0;
                                                                                                var60_60 = 0.0f;
                                                                                                var59_59 = null;
                                                                                                s70_0.a(null, (boolean)var10_10);
                                                                                                var10_10 = 1987063864;
                                                                                                var52_52 = 1.21789965E33f;
                                                                                                var59_59 = "video/x-vnd.on2.vp9";
                                                                                                if (var19_19 == var10_10) {
                                                                                                    var55_55 = "video/x-vnd.on2.vp8";
lbl545:
                                                                                                    // 2 sources

                                                                                                    while (true) {
                                                                                                        continue;
                                                                                                        break;
                                                                                                    }
                                                                                                }
                                                                                                var55_55 = var59_59;
                                                                                                ** continue;
                                                                                                var48_48 = 12;
                                                                                                var9_9.I(var42_42 += var48_48);
                                                                                                var48_48 = (byte)var0.w();
                                                                                                var16_16 = (byte)var0.w();
                                                                                                var15_15 = var0.w();
                                                                                                var17_17 = var15_15 >> 4;
                                                                                                var53_53 = 1;
                                                                                                var54_54 = 1.4E-45f;
                                                                                                var18_18 = var15_15 >> 1;
                                                                                                var47_47 = 7;
                                                                                                var18_18 = (byte)(var18_18 & var47_47);
                                                                                                var11_11 = (int)var55_55.equals(var59_59);
                                                                                                if (var11_11 != 0) {
                                                                                                    var11_11 = (byte)var17_17;
                                                                                                    var23_23 /* !! */  = (op3[])LW.a;
                                                                                                    var56_56 = new byte[12];
                                                                                                    var23_23 /* !! */  = null;
                                                                                                    var56_56[0] = var53_53;
                                                                                                    var56_56[var53_53] = var53_53;
                                                                                                    var47_47 = 2;
                                                                                                    var56_56[var47_47] = var48_48;
                                                                                                    var48_48 = 3;
                                                                                                    var56_56[var48_48] = var47_47;
                                                                                                    var47_47 = 4;
                                                                                                    var56_56[var47_47] = var53_53;
                                                                                                    var44_44 = 5;
                                                                                                    var56_56[var44_44] = var16_16;
                                                                                                    var16_16 = 6;
                                                                                                    var14_14 = 8.4E-45f;
                                                                                                    var56_56[var16_16] = var48_48;
                                                                                                    var56_56[7] = var53_53;
                                                                                                    var56_56[8] = var11_11;
                                                                                                    var56_56[9] = var47_47;
                                                                                                    var48_48 = 10;
                                                                                                    var56_56[var48_48] = var53_53;
                                                                                                    var11_11 = 11;
                                                                                                    var60_60 = 1.5E-44f;
                                                                                                    var56_56[var11_11] = var18_18;
                                                                                                    var29_29 = ImmutableList.of(var56_56);
                                                                                                } else {
                                                                                                    var48_48 = 10;
                                                                                                    var29_29 = var46_46;
                                                                                                }
                                                                                                var11_11 = var15_15 & 1;
                                                                                                if (var11_11 != 0) {
                                                                                                    var11_11 = 1;
                                                                                                    var60_60 = 1.4E-45f;
                                                                                                } else {
                                                                                                    var11_11 = 0;
                                                                                                    var60_60 = 0.0f;
                                                                                                    var59_59 = null;
                                                                                                }
                                                                                                var16_16 = var0.w();
                                                                                                var15_15 = var0.w();
                                                                                                var35_35 = VX.f(var16_16);
                                                                                                if (var11_11 != 0) {
                                                                                                    var11_11 = 1;
                                                                                                    var60_60 = 1.4E-45f;
                                                                                                } else {
                                                                                                    var11_11 = 2;
                                                                                                    var60_60 = 2.8E-45f;
                                                                                                }
                                                                                                var16_16 = VX.g(var15_15);
                                                                                                var20_20 /* !! */  = var55_55;
                                                                                                var36_36 = var11_11;
                                                                                                var47_47 = var16_16;
                                                                                                var39_39 = var17_17;
                                                                                                var33_33 = var19_19;
                                                                                                var10_10 = 8;
                                                                                                var52_52 = 1.1E-44f;
                                                                                                var48_48 = 0;
                                                                                                var13_13 = null;
                                                                                                var16_16 = -1;
                                                                                                var14_14 = 0.0f / 0.0f;
                                                                                                var15_15 = 3;
                                                                                                var58_58 = 4.2E-45f;
                                                                                                var53_53 = 1;
                                                                                                var54_54 = 1.4E-45f;
                                                                                                var19_19 = 2;
                                                                                                break block137;
                                                                                            }
                                                                                            var48_48 = 10;
                                                                                            var10_10 = 1635135811;
                                                                                            var52_52 = 2.8384055E20f;
                                                                                            if (var44_44 != var10_10) break block151;
                                                                                            var10_10 = 8;
                                                                                            var52_52 = 1.1E-44f;
                                                                                            var11_11 = var43_43 + -8;
                                                                                            var63_63 = new byte[var11_11];
                                                                                            var15_15 = 0;
                                                                                            var58_58 = 0.0f;
                                                                                            var62_62 = null;
                                                                                            var9_9.g(0, (byte[])var63_63, var11_11);
                                                                                            var29_29 = ImmutableList.of(var63_63);
                                                                                            var9_9.I(var42_42 += var10_10);
                                                                                            var59_59 = var9_9.a;
                                                                                            var16_16 = ((Object)var59_59).length;
                                                                                            var55_55 = new Vm2((byte[])var59_59, var16_16);
                                                                                            var11_11 = var9_9.b;
                                                                                            var14_14 = 1.1E-44f;
                                                                                            var55_55.m(var11_11 *= 8);
                                                                                            var55_55.p(1);
                                                                                            var60_60 = 4.2E-45f;
                                                                                            var16_16 = var55_55.g(3);
                                                                                            var53_53 = 6;
                                                                                            var54_54 = 8.4E-45f;
                                                                                            var55_55.o(var53_53);
                                                                                            var11_11 = (int)var55_55.f();
                                                                                            var17_17 = (int)var55_55.f();
                                                                                            var65_65 = -1;
                                                                                            var18_18 = 2;
                                                                                            if (var16_16 == var18_18 && var11_11 != 0) {
                                                                                                if (var17_17 != 0) {
                                                                                                    var11_11 = 12;
                                                                                                    var60_60 = 1.7E-44f;
                                                                                                } else {
                                                                                                    var11_11 = 10;
                                                                                                    var60_60 = 1.4E-44f;
                                                                                                }
                                                                                                if (var17_17 != 0) {
                                                                                                    var16_16 = 12;
                                                                                                    var14_14 = 1.7E-44f;
                                                                                                } else {
                                                                                                    var16_16 = 10;
                                                                                                    var14_14 = 1.4E-44f;
                                                                                                }
                                                                                                var66_66 = var11_11;
                                                                                                var67_67 = var16_16;
                                                                                            } else if (var16_16 <= var18_18) {
                                                                                                if (var11_11 != 0) {
                                                                                                    var16_16 = 10;
                                                                                                    var14_14 = 1.4E-44f;
                                                                                                } else {
                                                                                                    var16_16 = 8;
                                                                                                    var14_14 = 1.1E-44f;
                                                                                                }
                                                                                                if (var11_11 != 0) {
                                                                                                    var11_11 = 10;
                                                                                                    var60_60 = 1.4E-44f;
                                                                                                } else {
                                                                                                    var11_11 = 8;
                                                                                                    var60_60 = 1.1E-44f;
                                                                                                }
                                                                                                var67_67 = var11_11;
                                                                                                var66_66 = var16_16;
                                                                                            } else {
                                                                                                var66_66 = -1;
                                                                                                var67_67 = -1;
                                                                                            }
                                                                                            var11_11 = 13;
                                                                                            var60_60 = 1.8E-44f;
                                                                                            var55_55.o(var11_11);
                                                                                            var55_55.n();
                                                                                            var17_17 = var55_55.g(4);
                                                                                            var16_16 = 1;
                                                                                            var14_14 = 1.4E-45f;
                                                                                            if (var17_17 != var16_16) {
                                                                                                var59_59 = "Unsupported obu_type: ";
                                                                                                var55_55 = new StringBuilder((String)var59_59);
                                                                                                var55_55.append(var17_17);
                                                                                                Cx.e(var55_55.toString());
                                                                                                var68_68 = var67_67;
                                                                                                var69_69 = 0;
                                                                                                var55_55 = new VX(var65_65, var65_65, var65_65, var66_66, var67_67, null);
lbl707:
                                                                                                // 6 sources

                                                                                                while (true) {
                                                                                                    var16_16 = 5;
                                                                                                    var14_14 = 7.0E-45f;
                                                                                                    var47_47 = 4;
                                                                                                    var42_42 = 12;
                                                                                                    break block138;
                                                                                                    break;
                                                                                                }
                                                                                            }
                                                                                            var16_16 = (int)var55_55.f();
                                                                                            if (var16_16 == 0) break block152;
                                                                                            Cx.e("Unsupported obu_extension_flag");
                                                                                            var68_68 = var67_67;
                                                                                            var69_69 = 0;
                                                                                            var55_55 = new VX(var65_65, var65_65, var65_65, var66_66, var67_67, null);
                                                                                            ** GOTO lbl707
                                                                                        }
                                                                                        var16_16 = var55_55.f();
                                                                                        var55_55.n();
                                                                                        if (var16_16 == 0) break block153;
                                                                                        var17_17 = var55_55.g(8);
                                                                                        var16_16 = 127;
                                                                                        var14_14 = 1.78E-43f;
                                                                                        if (var17_17 <= var16_16) break block153;
                                                                                        Cx.e("Excessive obu_size");
                                                                                        var68_68 = var67_67;
                                                                                        var69_69 = 0;
                                                                                        var55_55 = new VX(var65_65, var65_65, var65_65, var66_66, var67_67, null);
                                                                                        ** GOTO lbl707
                                                                                    }
                                                                                    var14_14 = 4.2E-45f;
                                                                                    var17_17 = var55_55.g(3);
                                                                                    var55_55.n();
                                                                                    var16_16 = (int)var55_55.f();
                                                                                    if (var16_16 == 0) break block154;
                                                                                    Cx.e("Unsupported reduced_still_picture_header");
                                                                                    var68_68 = var67_67;
                                                                                    var69_69 = 0;
                                                                                    var55_55 = new VX(var65_65, var65_65, var65_65, var66_66, var67_67, null);
                                                                                    ** GOTO lbl707
                                                                                }
                                                                                var16_16 = (int)var55_55.f();
                                                                                if (var16_16 == 0) break block155;
                                                                                Cx.e("Unsupported timing_info_present_flag");
                                                                                var68_68 = var67_67;
                                                                                var69_69 = 0;
                                                                                var55_55 = new VX(var65_65, var65_65, var65_65, var66_66, var67_67, null);
                                                                                ** GOTO lbl707
                                                                            }
                                                                            var16_16 = (int)var55_55.f();
                                                                            if (var16_16 != 0) {
                                                                                Cx.e("Unsupported initial_display_delay_present_flag");
                                                                                var68_68 = var67_67;
                                                                                var69_69 = 0;
                                                                                var55_55 = new VX(var65_65, var65_65, var65_65, var66_66, var67_67, null);
                                                                                ** continue;
                                                                            }
                                                                            var16_16 = 5;
                                                                            var14_14 = 7.0E-45f;
                                                                            var18_18 = var55_55.g(var16_16);
                                                                            var23_23 /* !! */  = null;
                                                                            for (var47_47 = 0; var47_47 <= var18_18; ++var47_47) {
                                                                                var42_42 = 12;
                                                                                var55_55.o(var42_42);
                                                                                var44_44 = var55_55.g(var16_16);
                                                                                var48_48 = 7;
                                                                                if (var44_44 > var48_48) {
                                                                                    var55_55.n();
                                                                                }
                                                                                var48_48 = 10;
                                                                            }
                                                                            var48_48 = 1;
                                                                            var47_47 = 4;
                                                                            var42_42 = 12;
                                                                            var18_18 = var55_55.g(var47_47);
                                                                            var44_44 = var55_55.g(var47_47);
                                                                            var55_55.o(var18_18 += var48_48);
                                                                            var55_55.o(var44_44 += var48_48);
                                                                            var48_48 = (int)var55_55.f();
                                                                            if (var48_48 != 0) {
                                                                                var48_48 = 7;
                                                                                var55_55.o(var48_48);
                                                                            } else {
                                                                                var48_48 = 7;
                                                                            }
                                                                            var55_55.o(var48_48);
                                                                            var18_18 = (int)var55_55.f();
                                                                            if (var18_18 != 0) {
                                                                                var44_44 = 2;
                                                                                var55_55.o(var44_44);
                                                                            }
                                                                            if ((var44_44 = (int)var55_55.f()) != 0) {
                                                                                var44_44 = 1;
                                                                                var70_70 = 2;
                                                                            } else {
                                                                                var44_44 = 1;
                                                                                var70_70 = var55_55.g(var44_44);
                                                                            }
                                                                            if (var70_70 > 0 && (var70_70 = (int)var55_55.f()) == 0) {
                                                                                var55_55.o(var44_44);
                                                                            }
                                                                            if (var18_18 != 0) {
                                                                                var18_18 = 3;
                                                                                var55_55.o(var18_18);
                                                                            } else {
                                                                                var18_18 = 3;
                                                                            }
                                                                            var55_55.o(var18_18);
                                                                            var18_18 = (int)var55_55.f();
                                                                            var44_44 = 2;
                                                                            if (var17_17 == var44_44 && var18_18 != 0) {
                                                                                var55_55.n();
                                                                            }
                                                                            if (var17_17 != (var18_18 = 1) && (var17_17 = (int)var55_55.f()) != 0) {
                                                                                var17_17 = 1;
                                                                            } else {
                                                                                var17_17 = 0;
                                                                                var64_64 = null;
                                                                            }
                                                                            var18_18 = (int)var55_55.f();
                                                                            if (var18_18 == 0) break block156;
                                                                            var18_18 = 8;
                                                                            var44_44 = var55_55.g(var18_18);
                                                                            var48_48 = var55_55.g(var18_18);
                                                                            var70_70 = var55_55.g(var18_18);
                                                                            if (var17_17 != 0) break block157;
                                                                            var17_17 = 1;
                                                                            if (var44_44 != var17_17 || var48_48 != var11_11 || var70_70 != 0) break block158;
                                                                            var10_10 = 1;
                                                                            var52_52 = 1.4E-45f;
                                                                            break block159;
                                                                        }
                                                                        var17_17 = 1;
                                                                    }
                                                                    var10_10 = var71_71 = var55_55.g(var17_17);
                                                                }
                                                                var65_65 = VX.f(var44_44);
                                                                if (var10_10 == var17_17) {
                                                                    var10_10 = 1;
                                                                    var52_52 = 1.4E-45f;
                                                                } else {
                                                                    var10_10 = 2;
                                                                    var52_52 = 2.8E-45f;
                                                                }
                                                                var11_11 = VX.g(var48_48);
                                                                var69_69 = var10_10;
                                                                var72_72 = var11_11;
                                                                var68_68 = var65_65;
                                                                break block160;
                                                            }
                                                            var68_68 = -1;
                                                            var69_69 = -1;
                                                            var72_72 = -1;
                                                        }
                                                        var55_55 = new VX(var68_68, var69_69, var72_72, var66_66, var67_67, null);
                                                    }
                                                    var59_59 = "video/av01";
                                                    var48_48 = var55_55.e;
                                                    var17_17 = var55_55.f;
                                                    var18_18 = var55_55.a;
                                                    var44_44 = var55_55.b;
                                                    var47_47 = var55_55.c;
                                                    var39_39 = var17_17;
                                                    var35_35 = var18_18;
                                                    var33_33 = var19_19;
                                                    var36_36 = var44_44;
                                                    var10_10 = 8;
                                                    var52_52 = 1.1E-44f;
                                                    var16_16 = -1;
                                                    var14_14 = 0.0f / 0.0f;
                                                    var15_15 = 3;
                                                    var58_58 = 4.2E-45f;
                                                    var53_53 = 1;
                                                    var54_54 = 1.4E-45f;
                                                    var19_19 = 2;
                                                    var20_20 /* !! */  = var59_59;
                                                    var17_17 = var48_48;
                                                    var48_48 = 0;
                                                    var13_13 = null;
                                                    break block137;
                                                }
                                                var10_10 = 4;
                                                var52_52 = 5.6E-45f;
                                                var48_48 = 12;
                                                var16_16 = 5;
                                                var14_14 = 7.0E-45f;
                                                var15_15 = 0;
                                                var58_58 = 0.0f;
                                                var62_62 = null;
                                                var53_53 = 6;
                                                var54_54 = 8.4E-45f;
                                                var17_17 = 1668050025;
                                                var70_70 = 25;
                                                if (var44_44 == var17_17) {
                                                    if (var26_26 == null) {
                                                        var64_64 = ByteBuffer.allocate(var70_70);
                                                        var56_56 = ByteOrder.LITTLE_ENDIAN;
                                                        var26_26 = var64_64.order((ByteOrder)var56_56);
                                                    }
                                                    var64_64 = var26_26;
                                                    var26_26.position(21);
                                                    var42_42 = var0.t();
                                                    var26_26.putShort((short)var42_42);
                                                    var42_42 = var0.t();
                                                    var26_26.putShort((short)var42_42);
                                                    var33_33 = var19_19;
                                                    var17_17 = var35_35;
                                                    var39_39 = var36_36;
                                                    var10_10 = 8;
                                                    var52_52 = 1.1E-44f;
                                                    var48_48 = 0;
                                                    var13_13 = null;
                                                    var16_16 = -1;
                                                    var14_14 = 0.0f / 0.0f;
                                                    var15_15 = 3;
                                                    var58_58 = 4.2E-45f;
                                                    var53_53 = 1;
                                                    var54_54 = 1.4E-45f;
                                                    var19_19 = 2;
                                                    var35_35 = var11_11;
lbl916:
                                                    // 2 sources

                                                    while (true) {
                                                        var36_36 = var28_28;
                                                        ** continue;
                                                        break;
                                                    }
                                                }
                                                var17_17 = 1835295606;
                                                if (var44_44 == var17_17) {
                                                    if (var26_26 == null) {
                                                        var64_64 = ByteBuffer.allocate(var70_70);
                                                        var56_56 = ByteOrder.LITTLE_ENDIAN;
                                                        var26_26 = var64_64.order((ByteOrder)var56_56);
                                                    }
                                                    var64_64 = var26_26;
                                                    var42_42 = var0.t();
                                                    var44_44 = var0.t();
                                                    var10_10 = var0.t();
                                                    var48_48 = var0.t();
                                                    var16_16 = var0.t();
                                                    var15_15 = var0.t();
                                                    var53_53 = var0.t();
                                                    var33_33 = var19_19;
                                                    var19_19 = var0.t();
                                                    var73_73 = var0.y();
                                                    var75_74 = var0.y();
                                                    var61_61 = var25_25 /* !! */ ;
                                                    var24_24 = 1;
                                                    var26_26.position(var24_24);
                                                    var26_26.putShort((short)var16_16);
                                                    var26_26.putShort((short)var15_15);
                                                    var26_26.putShort((short)var42_42);
                                                    var26_26.putShort((short)var44_44);
                                                    var26_26.putShort((short)var10_10);
                                                    var26_26.putShort((short)var48_48);
                                                    var26_26.putShort((short)var53_53);
                                                    var26_26.putShort((short)var19_19);
                                                    var77_75 = 10000L;
                                                    var79_76 = var73_73 / var77_75;
                                                    var10_10 = (short)var79_76;
                                                    var26_26.putShort((short)var10_10);
                                                    var77_75 = var75_74 / var77_75;
                                                    var10_10 = (short)var77_75;
                                                    var26_26.putShort((short)var10_10);
                                                    var17_17 = var35_35;
                                                    var10_10 = 8;
                                                    var52_52 = 1.1E-44f;
                                                    var48_48 = 0;
                                                    var13_13 = null;
lbl971:
                                                    // 3 sources

                                                    while (true) {
                                                        var16_16 = -1;
                                                        var14_14 = 0.0f / 0.0f;
                                                        var15_15 = 3;
                                                        var58_58 = 4.2E-45f;
                                                        var53_53 = 1;
                                                        var54_54 = 1.4E-45f;
lbl978:
                                                        // 2 sources

                                                        while (true) {
                                                            var19_19 = 2;
lbl980:
                                                            // 3 sources

                                                            while (true) {
                                                                var35_35 = var11_11;
                                                                var39_39 = var36_36;
                                                                ** continue;
                                                                break;
                                                            }
                                                            break;
                                                        }
                                                        break;
                                                    }
                                                }
                                                var33_33 = var19_19;
                                                var61_61 = var25_25 /* !! */ ;
                                                var10_10 = 1681012275;
                                                var52_52 = 1.3149704E22f;
                                                if (var44_44 != var10_10) break block161;
                                                if (var20_20 /* !! */  == null) {
                                                    var10_10 = 1;
                                                    var52_52 = 1.4E-45f;
lbl992:
                                                    // 2 sources

                                                    while (true) {
                                                        continue;
                                                        break;
                                                    }
                                                }
                                                var10_10 = 0;
                                                var52_52 = 0.0f;
                                                var55_55 = null;
                                                ** continue;
                                                var48_48 = 0;
                                                var13_13 = null;
                                                s70_0.a(null, (boolean)var10_10);
                                                var20_20 /* !! */  = var6_6;
                                                var17_17 = var35_35;
                                                var25_25 /* !! */  = var61_61;
                                                var10_10 = 8;
                                                var52_52 = 1.1E-44f;
                                                ** GOTO lbl971
                                            }
                                            var48_48 = 0;
                                            var13_13 = null;
                                            var10_10 = 1702061171;
                                            var52_52 = 7.183675E22f;
                                            if (var44_44 != var10_10) break block162;
                                            if (var20_20 /* !! */  == null) {
                                                var10_10 = 1;
                                                var52_52 = 1.4E-45f;
                                            } else {
                                                var10_10 = 0;
                                                var52_52 = 0.0f;
                                                var55_55 = null;
                                            }
                                            s70_0.a(null, (boolean)var10_10);
                                            var55_55 = JA.a(var42_42, (Xm2)var9_9);
                                            var63_63 = var55_55.b;
                                            var63_63 = var63_63 != null ? (Object)ImmutableList.of(var63_63) : (Object)var46_46;
                                            var62_62 = var55_55.a;
                                            var40_40 = var55_55;
                                            var20_20 /* !! */  = var62_62;
                                            var17_17 = var35_35;
                                            var25_25 /* !! */  = var61_61;
                                            var10_10 = 8;
                                            var52_52 = 1.1E-44f;
                                            var15_15 = 3;
                                            var58_58 = 4.2E-45f;
                                            var53_53 = 1;
                                            var54_54 = 1.4E-45f;
                                            var19_19 = 2;
                                            var35_35 = var11_11;
                                            var39_39 = var36_36;
                                            var36_36 = var28_28;
                                            var29_29 = var63_63;
                                            var16_16 = -1;
                                            var14_14 = 0.0f / 0.0f;
                                            break block137;
                                        }
                                        var10_10 = 1885434736;
                                        var52_52 = 2.7909473E29f;
                                        if (var44_44 != var10_10) break block163;
                                        var10_10 = 8;
                                        var52_52 = 1.1E-44f;
                                        var9_9.I(var42_42 += var10_10);
                                        var16_16 = var0.A();
                                        var15_15 = var0.A();
                                        var14_14 = var16_16;
                                        var58_58 = var15_15;
                                        var27_27 = var14_14 / var58_58;
                                        var17_17 = var35_35;
                                        var16_16 = -1;
                                        var14_14 = 0.0f / 0.0f;
                                        var15_15 = 3;
                                        var58_58 = 4.2E-45f;
                                        var53_53 = 1;
                                        var54_54 = 1.4E-45f;
                                        var19_19 = 2;
                                        var41_41 = true;
                                        ** GOTO lbl980
                                    }
                                    var10_10 = 8;
                                    var52_52 = 1.1E-44f;
                                    var16_16 = 1937126244;
                                    var14_14 = 1.9506033E31f;
                                    if (var44_44 == var16_16) {
                                        block139: {
                                            var44_44 = var42_42 + 8;
                                            while ((var16_16 = var44_44 - var42_42) < var43_43) {
                                                var9_9.I(var44_44);
                                                var16_16 = var0.i();
                                                var15_15 = var0.i();
                                                var53_53 = 1886547818;
                                                var54_54 = 3.0012025E29f;
                                                if (var15_15 == var53_53) {
                                                    var62_62 = var9_9.a;
                                                    var32_32 = var63_63 = Arrays.copyOfRange((byte[])var62_62, var44_44, var16_16 += var44_44);
                                                    break block139;
                                                }
                                                var44_44 += var16_16;
                                            }
                                            var32_32 = null;
                                        }
                                        var17_17 = var35_35;
                                        var25_25 /* !! */  = var61_61;
                                        ** continue;
                                    }
                                    var16_16 = 1936995172;
                                    var14_14 = 1.9347576E31f;
                                    if (var44_44 == var16_16) {
                                        var16_16 = var0.w();
                                        var15_15 = 3;
                                        var58_58 = 4.2E-45f;
                                        var9_9.J(var15_15);
                                        if (var16_16 == 0) {
                                            var16_16 = var0.w();
                                            if (var16_16 != 0) {
                                                var53_53 = 1;
                                                var54_54 = 1.4E-45f;
                                                if (var16_16 != var53_53) {
                                                    var17_17 = 2;
                                                    if (var16_16 != var17_17) {
                                                        if (var16_16 == var15_15) {
                                                            var22_22 = 3;
                                                        }
                                                    } else {
                                                        var22_22 = 2;
                                                    }
                                                } else {
                                                    var22_22 = 1;
                                                }
                                            } else {
                                                var53_53 = 1;
                                                var54_54 = 1.4E-45f;
                                                var22_22 = 0;
                                                var12_12 = null;
                                            }
                                        } else {
                                            var53_53 = 1;
                                            var54_54 = 1.4E-45f;
                                        }
                                        var17_17 = var35_35;
                                        var25_25 /* !! */  = var61_61;
                                        var16_16 = -1;
                                        var14_14 = 0.0f / 0.0f;
                                        ** continue;
                                    }
                                    var15_15 = 3;
                                    var58_58 = 4.2E-45f;
                                    var53_53 = 1;
                                    var54_54 = 1.4E-45f;
                                    var16_16 = 1668246642;
                                    var14_14 = 4.4165861E21f;
                                    if (var44_44 != var16_16) break block164;
                                    var16_16 = -1;
                                    var14_14 = 0.0f / 0.0f;
                                    if (var11_11 != var16_16 || var37_37 != var16_16) break block165;
                                    var17_17 = var0.i();
                                    if (var17_17 == (var19_19 = 1852009592) || var17_17 == (var19_19 = 1852009571)) break block166;
                                    var25_25 /* !! */  = "Unsupported color type: ";
                                    var21_21 = new Comparable<Integer>((String)var25_25 /* !! */ );
                                    var64_64 = zq1_0.a(var17_17);
                                    var21_21.append((String)var64_64);
                                    var64_64 = var21_21.toString();
                                    Cx.f((String)var64_64);
                                }
lbl1143:
                                // 2 sources

                                while (true) {
                                    var19_19 = 2;
                                    break block140;
                                    break;
                                }
                            }
                            var11_11 = var0.C();
                            var17_17 = var0.C();
                            var19_19 = 2;
                            var9_9.J(var19_19);
                            var47_47 = 19;
                            if (var43_43 == var47_47 && (var47_47 = var0.w() & 128) != 0) {
                                var47_47 = 1;
                            } else {
                                var47_47 = 0;
                                var23_23 /* !! */  = null;
                            }
                            var11_11 = VX.f(var11_11);
                            var47_47 = var47_47 != 0 ? 1 : 2;
                            var17_17 = VX.g(var17_17);
                            var29_29 = var46_46;
                            var25_25 /* !! */  = var61_61;
                            var39_39 = var36_36;
                            var36_36 = var47_47;
                            var47_47 = var17_17;
                            var17_17 = var35_35;
                            var35_35 = var11_11;
                            break block137;
                        }
                        var16_16 = -1;
                        var14_14 = 0.0f / 0.0f;
                        ** continue;
                    }
lbl1173:
                    // 3 sources

                    while (true) {
                        var17_17 = var35_35;
                        var25_25 /* !! */  = var61_61;
                        ** continue;
                        break;
                    }
                }
                var33_33 = var19_19;
                var61_61 = var25_25 /* !! */ ;
                var10_10 = 8;
                var52_52 = 1.1E-44f;
                var48_48 = 0;
                var13_13 = null;
                var16_16 = -1;
                var14_14 = 0.0f / 0.0f;
                var15_15 = 3;
                var58_58 = 4.2E-45f;
                var53_53 = 1;
                var54_54 = 1.4E-45f;
                var19_19 = 2;
                var64_64 = fs0_0.a((Xm2)var0);
                if (var64_64 == null) ** GOTO lbl1173
                var64_64 = var64_64.a;
                var20_20 /* !! */  = "video/dolby-vision";
                var31_31 = var64_64;
                ** continue;
            }
            var11_11 = var57_57 + var43_43;
            var10_10 = var2_2;
            var13_13 = var7_7;
            var19_19 = var33_33;
            var15_15 = var38_38;
            var16_16 = var45_45;
            var33_33 = var22_22;
            var38_38 = var17_17;
            var12_12 = var49_49 /* !! */ ;
            var17_17 = var11_11;
            var37_37 = var47_47;
            var11_11 = var3_3;
            var23_23 /* !! */  = var6_6;
        }
        var45_45 = var16_16;
        var46_46 = var29_29;
        var11_11 = var35_35;
        var28_28 = var36_36;
        var47_47 = var37_37;
        var35_35 = var38_38;
        var36_36 = var39_39;
        var48_48 = 0;
        var13_13 = null;
        var49_49 /* !! */  = var12_12;
        var38_38 = var15_15;
        var22_22 = var33_33;
        if (var20_20 /* !! */  == null) {
            return;
        }
        var9_9 = new d$a();
        var55_55 = Integer.toString(var4_4);
        var9_9.a = var55_55;
        var55_55 = ip1_0.l((String)var20_20 /* !! */ );
        var9_9.n = var55_55;
        var51_51 = var31_31;
        var9_9.j = var31_31;
        var10_10 = var16_16;
        var9_9.u = var16_16;
        var10_10 = var15_15;
        var9_9.v = var15_15;
        var52_52 = var27_27;
        var9_9.y = var27_27;
        var10_10 = var5_5;
        var9_9.x = var5_5;
        var51_51 = var32_32;
        var9_9.z = var32_32;
        var9_9.A = var33_33;
        var51_51 = var29_29;
        var9_9.q = var29_29;
        var42_42 = var34_34;
        var9_9.p = var34_34;
        var9_9.r = var12_12;
        if (var26_26 != null) {
            var51_51 = var26_26.array();
        } else {
            var53_53 = 0;
            var51_51 = null;
            var54_54 = 0.0f;
        }
        var0 = var55_55;
        var1_1 = var11_11;
        var2_2 = var28_28;
        var3_3 = var47_47;
        var4_4 = var35_35;
        var5_5 = var36_36;
        var6_6 = var51_51;
        var9_9.B = var55_55 = new VX(var11_11, var28_28, var47_47, var35_35, var36_36, (byte[])var51_51);
        var51_51 = var40_40;
        if (var40_40 != null) {
            var9_9.h = var10_10 = Ints.saturatedCast(var40_40.c);
            var81_77 = var40_40.d;
            var9_9.i = var10_10 = Ints.saturatedCast(var81_77);
        }
        var55_55 = new d((d$a)var9_9);
        var9_9 = var7_7;
        var7_7.b = var55_55;
    }
}

