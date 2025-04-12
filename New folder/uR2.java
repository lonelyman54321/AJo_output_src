/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Matrix
 */
import android.graphics.Matrix;
import com.caverock.androidsvg.SVGParseException;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.constant.Constable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.zip.GZIPInputStream;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.Attributes;
import org.xml.sax.ContentHandler;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

public final class uR2 {
    public rR2 a = null;
    public rR2$J b = null;
    public boolean c = false;
    public int d;
    public boolean e = false;
    public uR2$h f = null;
    public StringBuilder g = null;
    public boolean h = false;
    public StringBuilder i = null;

    public static Matrix A(String string2) {
        char c2;
        Object object = string2;
        int n3 = 5;
        int n4 = 4;
        int n7 = 3;
        int n8 = 2;
        int n10 = 1;
        Matrix matrix = new Matrix();
        uR2$i uR2$i = new uR2$i(string2);
        uR2$i.q();
        while ((c2 = uR2$i.f()) == '\u0000') {
            block36: {
                Object object2;
                block37: {
                    float f5;
                    int n14;
                    float f6;
                    int n15;
                    int n16;
                    String string3;
                    float f7;
                    int n17;
                    block33: {
                        c2 = uR2$i.f();
                        n17 = 0;
                        f7 = 0.0f;
                        string3 = null;
                        if (c2 != '\u0000') break block33;
                        c2 = uR2$i.b;
                        object2 = uR2$i.a;
                        n16 = ((String)object2).charAt(c2);
                        while (true) {
                            block35: {
                                block34: {
                                    n15 = 97;
                                    f6 = 1.36E-43f;
                                    if (n16 < n15) break block34;
                                    n15 = 122;
                                    f6 = 1.71E-43f;
                                    if (n16 <= n15) break block35;
                                }
                                n15 = 65;
                                f6 = 9.1E-44f;
                                if (n16 < n15) break;
                                n15 = 90;
                                f6 = 1.26E-43f;
                                if (n16 > n15) break;
                            }
                            n16 = uR2$i.a();
                        }
                        n15 = uR2$i.b;
                        while ((n14 = uR2$i.g(n16)) != 0) {
                            n16 = uR2$i.a();
                        }
                        n14 = 40;
                        f5 = 5.6E-44f;
                        if (n16 == n14) {
                            uR2$i.b = n17 = uR2$i.b + n10;
                            string3 = ((String)object2).substring(c2, n15);
                        } else {
                            uR2$i.b = c2;
                        }
                    }
                    if (string3 == null) break block36;
                    c2 = ')';
                    float f8 = 5.7E-44f;
                    object2 = "Invalid transform list: ";
                    n16 = -1;
                    float f11 = 0.0f / 0.0f;
                    n15 = string3.hashCode();
                    switch (n15) {
                        default: {
                            break;
                        }
                        case 1052832078: {
                            String string4 = "translate";
                            n15 = (int)(string3.equals(string4) ? 1 : 0);
                            if (n15 == 0) break;
                            n16 = 5;
                            f11 = 7.0E-45f;
                            break;
                        }
                        case 109493391: {
                            String string4 = "skewY";
                            n15 = (int)(string3.equals(string4) ? 1 : 0);
                            if (n15 == 0) break;
                            n16 = 4;
                            f11 = 5.6E-45f;
                            break;
                        }
                        case 109493390: {
                            String string4 = "skewX";
                            n15 = (int)(string3.equals(string4) ? 1 : 0);
                            if (n15 == 0) break;
                            n16 = 3;
                            f11 = 4.2E-45f;
                            break;
                        }
                        case 109250890: {
                            String string4 = "scale";
                            n15 = (int)(string3.equals(string4) ? 1 : 0);
                            if (n15 == 0) break;
                            n16 = 2;
                            f11 = 2.8E-45f;
                            break;
                        }
                        case -925180581: {
                            String string4 = "rotate";
                            n15 = (int)(string3.equals(string4) ? 1 : 0);
                            if (n15 == 0) break;
                            n16 = 1;
                            f11 = Float.MIN_VALUE;
                            break;
                        }
                        case -1081239615: {
                            String string4 = "matrix";
                            n15 = (int)(string3.equals(string4) ? 1 : 0);
                            if (n15 == 0) break;
                            n16 = 0;
                            f11 = 0.0f;
                        }
                    }
                    switch (n16) {
                        default: {
                            String string5 = cP.a("Invalid transform list fn: ", string3, ")");
                            object = new SAXException(string5);
                            throw object;
                        }
                        case 5: {
                            uR2$i.q();
                            f7 = uR2$i.i();
                            f11 = uR2$i.o();
                            uR2$i.q();
                            n15 = (int)(Float.isNaN(f7) ? 1 : 0);
                            if (n15 == 0 && (c2 = (char)(uR2$i.d(c2) ? 1 : 0)) != '\u0000') {
                                c2 = (char)(Float.isNaN(f11) ? 1 : 0);
                                if (c2 != '\u0000') {
                                    matrix.preTranslate(f7, 0.0f);
                                    break;
                                }
                                matrix.preTranslate(f7, f11);
                                break;
                            }
                            object = ((String)object2).concat((String)object);
                            SVGParseException sVGParseException = new SAXException((String)object);
                            throw sVGParseException;
                        }
                        case 4: {
                            double d2;
                            uR2$i.q();
                            f7 = uR2$i.i();
                            uR2$i.q();
                            n16 = (int)(Float.isNaN(f7) ? 1 : 0);
                            if (n16 == 0 && (c2 = (char)(uR2$i.d(c2) ? 1 : 0)) != '\u0000') {
                                d2 = Math.tan(Math.toRadians(f7));
                                f8 = (float)d2;
                                matrix.preSkew(0.0f, f8);
                                break;
                            }
                            object = ((String)object2).concat((String)object);
                            SVGParseException sVGParseException = new SAXException((String)object);
                            throw sVGParseException;
                        }
                        case 3: {
                            double d2;
                            uR2$i.q();
                            f7 = uR2$i.i();
                            uR2$i.q();
                            n16 = (int)(Float.isNaN(f7) ? 1 : 0);
                            if (n16 == 0 && (c2 = (char)(uR2$i.d(c2) ? 1 : 0)) != '\u0000') {
                                d2 = Math.tan(Math.toRadians(f7));
                                f8 = (float)d2;
                                matrix.preSkew(f8, 0.0f);
                                break;
                            }
                            object = ((String)object2).concat((String)object);
                            SVGParseException sVGParseException = new SAXException((String)object);
                            throw sVGParseException;
                        }
                        case 2: {
                            uR2$i.q();
                            f7 = uR2$i.i();
                            f11 = uR2$i.o();
                            uR2$i.q();
                            n15 = (int)(Float.isNaN(f7) ? 1 : 0);
                            if (n15 == 0 && (c2 = (char)(uR2$i.d(c2) ? 1 : 0)) != '\u0000') {
                                c2 = (char)(Float.isNaN(f11) ? 1 : 0);
                                if (c2 != '\u0000') {
                                    matrix.preScale(f7, f7);
                                    break;
                                }
                                matrix.preScale(f7, f11);
                                break;
                            }
                            object = ((String)object2).concat((String)object);
                            SVGParseException sVGParseException = new SAXException((String)object);
                            throw sVGParseException;
                        }
                        case 1: {
                            uR2$i.q();
                            f7 = uR2$i.i();
                            f11 = uR2$i.o();
                            f6 = uR2$i.o();
                            uR2$i.q();
                            n14 = (int)(Float.isNaN(f7) ? 1 : 0);
                            if (n14 == 0 && (c2 = (char)(uR2$i.d(c2) ? 1 : 0)) != '\u0000') {
                                c2 = (char)(Float.isNaN(f11) ? 1 : 0);
                                if (c2 != '\u0000') {
                                    matrix.preRotate(f7);
                                    break;
                                }
                                c2 = (char)(Float.isNaN(f6) ? 1 : 0);
                                if (c2 == '\u0000') {
                                    matrix.preRotate(f7, f11, f6);
                                    break;
                                }
                                object = ((String)object2).concat((String)object);
                                SVGParseException sVGParseException = new SAXException((String)object);
                                throw sVGParseException;
                            }
                            object = ((String)object2).concat((String)object);
                            SVGParseException sVGParseException = new SAXException((String)object);
                            throw sVGParseException;
                        }
                        case 0: {
                            uR2$i.q();
                            f7 = uR2$i.i();
                            uR2$i.p();
                            f11 = uR2$i.i();
                            uR2$i.p();
                            f6 = uR2$i.i();
                            uR2$i.p();
                            f5 = uR2$i.i();
                            uR2$i.p();
                            float f12 = uR2$i.i();
                            uR2$i.p();
                            float f14 = uR2$i.i();
                            uR2$i.q();
                            boolean bl2 = Float.isNaN(f14);
                            if (bl2 || (c2 = (char)(uR2$i.d(c2) ? 1 : 0)) == '\u0000') break block37;
                            Matrix matrix2 = new Matrix();
                            int n18 = 9;
                            object2 = new float[n18];
                            object2[0] = f7;
                            object2[n10] = f6;
                            object2[n8] = f12;
                            object2[n7] = f11;
                            object2[n4] = f5;
                            object2[n3] = f14;
                            object2[6] = 0.0f;
                            object2[7] = 0.0f;
                            n17 = 1065353216;
                            f7 = 1.0f;
                            n16 = 8;
                            f11 = 1.1E-44f;
                            object2[n16] = f7;
                            matrix2.setValues((float[])object2);
                            matrix.preConcat(matrix2);
                        }
                    }
                    c2 = (char)(uR2$i.f() ? 1 : 0);
                    if (c2 != '\u0000') break;
                    uR2$i.p();
                    continue;
                }
                object = ((String)object2).concat((String)object);
                SVGParseException sVGParseException = new SAXException((String)object);
                throw sVGParseException;
            }
            object = "Bad transform function encountered in transform list: ".concat((String)object);
            SVGParseException sVGParseException = new SAXException((String)object);
            throw sVGParseException;
        }
        return matrix;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static void E(rR2$E var0, String var1_1, String var2_2) {
        var3_3 = var0;
        var4_7 = var2_2;
        var5_8 = "italic";
        var6_9 = "oblique";
        var7_10 = "visible";
        var8_11 = "normal";
        var9_12 /* !! */  = "auto";
        var10_13 = "none";
        var11_14 /* !! */  = var2_2.length();
        if (var11_14 /* !! */  == 0) {
            return;
        }
        var12_15 = "inherit";
        var11_14 /* !! */  = (int)var2_2.equals(var12_15);
        if (var11_14 /* !! */  != 0) {
            return;
        }
        var12_15 = uR2$a.b;
        var13_16 = uR2$g.fromString(var1_1).ordinal();
        var11_14 /* !! */  = (int)var12_15[var13_16];
        var14_17 = rr2$g_0.a;
        var15_18 = "evenodd";
        var16_19 = "nonzero";
        var17_20 = "round";
        var18_21 /* !! */  = "|";
        var19_22 = "currentColor";
        var20_23 = '|';
        block28 : switch (var11_14 /* !! */ ) {
            default: {
                break;
            }
            case 86: {
                var21_24 = var2_2.hashCode();
                switch (var21_24) lbl-1000:
                // 4 sources

                {
                    default: {
                        var22_42 = -1;
                        break;
                    }
                    case 362741610: {
                        var5_8 = "optimizeSpeed";
                        var23_57 = var2_2.equals(var5_8);
                        if (!var23_57) ** GOTO lbl-1000
                        var22_42 = 2;
                        break;
                    }
                    case 3005871: {
                        var23_58 = var2_2.equals(var9_12 /* !! */ );
                        if (!var23_58) ** GOTO lbl-1000
                        var22_42 = 1;
                        break;
                    }
                    case -933002398: {
                        var5_8 = "optimizeQuality";
                        var23_59 = var2_2.equals(var5_8);
                        if (!var23_59) ** GOTO lbl-1000
                        var22_42 = 0;
                        var18_21 /* !! */  = null;
                    }
                }
                switch (var22_42) {
                    default: {
                        var22_42 = 0;
                        var18_21 /* !! */  = null;
                        break;
                    }
                    case 2: {
                        var18_21 /* !! */  = rR2$E$e.optimizeSpeed;
                        break;
                    }
                    case 1: {
                        var18_21 /* !! */  = rR2$E$e.auto;
                        break;
                    }
                    case 0: {
                        var18_21 /* !! */  = rR2$E$e.optimizeQuality;
                    }
                }
                var3_3.M = var18_21 /* !! */ ;
                if (var18_21 /* !! */  == null) break;
                var24_85 = var3_3.a;
                var26_126 = 0x2000000000L;
                var3_3.a = var24_85 |= var26_126;
                break;
            }
            case 85: {
                var21_25 = var2_2.equals(var10_13);
                if (!var21_25) {
                    var5_8 = "non-scaling-stroke";
                    var23_60 = var2_2.equals(var5_8);
                    if (!var23_60) {
                        var22_43 = false;
                        var18_21 /* !! */  = null;
                    } else {
                        var18_21 /* !! */  = rR2$E$i.NonScalingStroke;
                    }
                } else {
                    var18_21 /* !! */  = rR2$E$i.None;
                }
                var3_3.L = var18_21 /* !! */ ;
                if (var18_21 /* !! */  == null) break;
                var24_86 = var3_3.a;
                var26_127 = 0x800000000L;
                var3_3.a = var24_86 |= var26_127;
                break;
            }
            case 84: {
                var0.K = var4_7 = uR2.w(var2_2);
                var24_87 = var0.a;
                var26_128 = 0x400000000L;
                var0.a = var24_87 |= var26_128;
                break;
            }
            case 83: {
                var21_26 = var2_2.equals(var19_22);
                if (var21_26) {
                    var0.J = var14_17;
                } else {
                    var4_7 = uR2.o(var2_2);
                    var0.J = var4_7;
                }
                var24_88 = var3_3.a;
                var26_129 = 0x200000000L;
                var3_3.a = var24_88 |= var26_129;
                break;
                catch (SVGParseException var3_4) {
                    var3_4.getMessage();
                    break;
                }
            }
            case 82: {
                var0.I = var4_7 = uR2.w(var2_2);
                var24_89 = var0.a;
                var26_130 = 0x100000000L;
                var0.a = var24_89 |= var26_130;
                break;
            }
            case 81: {
                var21_27 = var2_2.equals(var19_22);
                if (var21_27) {
                    var0.H = var14_17;
                } else {
                    var4_7 = uR2.o(var2_2);
                    var0.H = var4_7;
                }
                var24_90 = var3_3.a;
                var26_131 = 0x80000000L;
                var3_3.a = var24_90 |= var26_131;
                break;
                catch (SVGParseException var3_5) {
                    var3_5.getMessage();
                    break;
                }
            }
            case 80: {
                var0.G = var4_7 = uR2.s(var2_2);
                var24_91 = var0.a;
                var26_132 = 0x40000000L;
                var0.a = var24_91 |= var26_132;
                break;
            }
            case 79: {
                var21_28 = var16_19.equals(var2_2);
                if (var21_28) {
                    var18_21 /* !! */  = rR2$E$a.NonZero;
                } else {
                    var23_61 = var15_18.equals(var2_2);
                    if (var23_61) {
                        var18_21 /* !! */  = rR2$E$a.EvenOdd;
                    } else {
                        var22_44 = false;
                        var18_21 /* !! */  = null;
                    }
                }
                var3_3.F = var18_21 /* !! */ ;
                var24_92 = var3_3.a;
                var26_133 = 0x20000000L;
                var3_3.a = var24_92 |= var26_133;
                break;
            }
            case 78: {
                var0.E = var4_7 = uR2.s(var2_2);
                var24_93 = var0.a;
                var26_134 = 0x10000000L;
                var0.a = var24_93 |= var26_134;
                break;
            }
            case 77: {
                var21_29 = var9_12 /* !! */ .equals(var2_2);
                if (!var21_29) ** GOTO lbl170
lbl166:
                // 3 sources

                while (true) {
                    var22_45 = false;
                    var18_21 /* !! */  = null;
                    ** GOTO lbl196
                    break;
                }
lbl170:
                // 1 sources

                var5_8 = "rect(";
                var21_29 = var2_2.startsWith((String)var5_8);
                if (!var21_29) ** GOTO lbl166
                var28_166 = 5;
                var4_7 = var2_2.substring(var28_166);
                var5_8 = new uR2$i((String)var4_7);
                var5_8.q();
                var4_7 = uR2.v((uR2$i)var5_8);
                var5_8.p();
                var6_9 = uR2.v((uR2$i)var5_8);
                var5_8.p();
                var16_19 = uR2.v((uR2$i)var5_8);
                var5_8.p();
                var7_10 = uR2.v((uR2$i)var5_8);
                var5_8.q();
                var29_171 = var5_8.d(')');
                if (var29_171 || (var21_29 = var5_8.f())) ** break;
                ** continue;
                var18_21 /* !! */  = new Object();
                var18_21 /* !! */ .a = var4_7;
                var18_21 /* !! */ .b = var6_9;
                var18_21 /* !! */ .c = var16_19;
                var18_21 /* !! */ .d = var7_10;
lbl196:
                // 2 sources

                var3_3.w = var18_21 /* !! */ ;
                if (var18_21 /* !! */  == null) break;
                var24_94 = var3_3.a;
                var26_135 = 0x100000L;
                var3_3.a = var24_94 |= var26_135;
                break;
            }
            case 76: {
                var0.D = var4_7 = uR2.w(var2_2);
                var24_95 = var0.a;
                var26_136 = 0x8000000L;
                var0.a = var24_95 |= var26_136;
                break;
            }
            case 75: {
                var21_30 = var2_2.equals(var19_22);
                if (var21_30) {
                    var0.C = var14_17;
                } else {
                    var4_7 = uR2.o(var2_2);
                    var0.C = var4_7;
                }
                var24_96 = var3_3.a;
                var26_137 = 0x4000000L;
                var3_3.a = var24_96 |= var26_137;
                break;
                catch (SVGParseException var3_6) {
                    var3_6.getMessage();
                    break;
                }
            }
            case 74: {
                var21_31 = var2_2.indexOf(var20_23);
                if (var21_31 >= 0) break;
                var5_8 = new StringBuilder((String)var18_21 /* !! */ );
                var5_8.append(var2_2);
                var5_8.append(var20_23);
                var5_8 = var5_8.toString();
                var6_9 = "|visible|hidden|collapse|";
                var21_31 = (int)var6_9.contains((CharSequence)var5_8);
                if (var21_31 == 0) break;
                var23_62 = var2_2.equals(var7_10);
                var0.B = var4_7 = Boolean.valueOf(var23_62);
                var24_97 = var0.a;
                var26_138 = 0x2000000L;
                var0.a = var24_97 |= var26_138;
                break;
            }
            case 73: {
                var21_32 = var2_2.indexOf(var20_23);
                if (var21_32 >= 0) break;
                var5_8 = new StringBuilder((String)var18_21 /* !! */ );
                var5_8.append(var2_2);
                var5_8.append(var20_23);
                var5_8 = var5_8.toString();
                var6_9 = "|inline|block|list-item|run-in|compact|marker|table|inline-table|table-row-group|table-header-group|table-footer-group|table-row|table-column-group|table-column|table-cell|table-caption|none|";
                var21_32 = (int)var6_9.contains((CharSequence)var5_8);
                if (var21_32 == 0) break;
                var23_63 = var2_2.equals(var10_13);
                var30_173 = true;
                var0.A = var4_7 = Boolean.valueOf(var23_63 ^= var30_173);
                var24_98 = var0.a;
                var26_139 = 0x1000000L;
                var0.a = var24_98 |= var26_139;
                break;
            }
            case 72: {
                var0.z = var4_7 = uR2.s(var2_2);
                var24_99 = var0.a;
                var26_140 = 0x800000L;
                var0.a = var24_99 |= var26_140;
                break;
            }
            case 71: {
                var0.y = var4_7 = uR2.s(var2_2);
                var24_100 = var0.a;
                var26_141 = 0x400000L;
                var0.a = var24_100 |= var26_141;
                break;
            }
            case 70: {
                var0.x = var4_7 = uR2.s(var2_2);
                var24_101 = var0.a;
                var26_142 = 0x200000L;
                var0.a = var24_101 |= var26_142;
                break;
            }
            case 69: {
                var0.x = var4_7 = uR2.s(var2_2);
                var0.y = var4_7;
                var0.z = var4_7;
                var24_102 = var0.a;
                var26_143 = 0xE00000L;
                var0.a = var24_102 |= var26_143;
                break;
            }
            case 68: {
                var30_174 = 1;
                var21_33 = var2_2.hashCode();
                switch (var21_33) lbl-1000:
                // 5 sources

                {
                    default: {
                        var30_174 = -1;
                        break;
                    }
                    case 466743410: {
                        var23_64 = var2_2.equals(var7_10);
                        if (!var23_64) ** GOTO lbl-1000
                        var30_174 = 3;
                        break;
                    }
                    case 3005871: {
                        var23_65 = var2_2.equals(var9_12 /* !! */ );
                        if (!var23_65) ** GOTO lbl-1000
                        var30_174 = 2;
                        break;
                    }
                    case -907680051: {
                        var5_8 = "scroll";
                        var23_66 = var2_2.equals(var5_8);
                        if (var23_66) break;
                        ** GOTO lbl-1000
                    }
                    case -1217487446: {
                        var5_8 = "hidden";
                        var23_67 = var2_2.equals(var5_8);
                        if (!var23_67) ** GOTO lbl-1000
                        var30_174 = 0;
                        var16_19 = null;
                    }
                }
                switch (var30_174) {
                    default: {
                        var22_46 = false;
                        var18_21 /* !! */  = null;
                        break;
                    }
                    case 2: 
                    case 3: {
                        var18_21 /* !! */  = Boolean.TRUE;
                        break;
                    }
                    case 0: 
                    case 1: {
                        var18_21 /* !! */  = Boolean.FALSE;
                    }
                }
                var3_3.v = var18_21 /* !! */ ;
                if (var18_21 /* !! */  == null) break;
                var24_103 = var3_3.a;
                var26_144 = 524288L;
                var3_3.a = var24_103 |= var26_144;
                break;
            }
            case 67: {
                var30_175 = true;
                var21_34 = var2_2.hashCode();
                switch (var21_34) lbl-1000:
                // 4 sources

                {
                    default: {
                        var22_47 = -1;
                        break;
                    }
                    case 109757538: {
                        var5_8 = "start";
                        var23_68 = var2_2.equals(var5_8);
                        if (!var23_68) ** GOTO lbl-1000
                        var22_47 = 2;
                        break;
                    }
                    case 100571: {
                        var5_8 = "end";
                        var23_69 = var2_2.equals(var5_8);
                        if (!var23_69) ** GOTO lbl-1000
                        var22_47 = 1;
                        break;
                    }
                    case -1074341483: {
                        var5_8 = "middle";
                        var23_70 = var2_2.equals(var5_8);
                        if (!var23_70) ** GOTO lbl-1000
                        var22_47 = 0;
                        var18_21 /* !! */  = null;
                    }
                }
                switch (var22_47) {
                    default: {
                        var22_47 = 0;
                        var18_21 /* !! */  = null;
                        break;
                    }
                    case 2: {
                        var18_21 /* !! */  = rR2$E$f.Start;
                        break;
                    }
                    case 1: {
                        var18_21 /* !! */  = rR2$E$f.End;
                        break;
                    }
                    case 0: {
                        var18_21 /* !! */  = rR2$E$f.Middle;
                    }
                }
                var3_3.u = var18_21 /* !! */ ;
                if (var18_21 /* !! */  == null) break;
                var24_104 = var3_3.a;
                var26_145 = 262144L;
                var3_3.a = var24_104 |= var26_145;
                break;
            }
            case 66: {
                var5_8 = "ltr";
                var21_35 = var2_2.equals(var5_8);
                if (!var21_35) {
                    var5_8 = "rtl";
                    var23_71 = var2_2.equals(var5_8);
                    if (!var23_71) {
                        var22_48 = false;
                        var18_21 /* !! */  = null;
                    } else {
                        var18_21 /* !! */  = rR2$E$h.RTL;
                    }
                } else {
                    var18_21 /* !! */  = rR2$E$h.LTR;
                }
                var3_3.t = var18_21 /* !! */ ;
                if (var18_21 /* !! */  == null) break;
                var24_105 = var3_3.a;
                var26_146 = 0x1000000000L;
                var3_3.a = var24_105 |= var26_146;
                break;
            }
            case 65: {
                var30_176 = 1;
                var21_36 = var2_2.hashCode();
                switch (var21_36) lbl-1000:
                // 6 sources

                {
                    default: {
                        var30_176 = -1;
                        break;
                    }
                    case 529818312: {
                        var5_8 = "overline";
                        var23_72 = var2_2.equals(var5_8);
                        if (!var23_72) ** GOTO lbl-1000
                        var30_176 = 4;
                        break;
                    }
                    case 93826908: {
                        var5_8 = "blink";
                        var23_73 = var2_2.equals(var5_8);
                        if (!var23_73) ** GOTO lbl-1000
                        var30_176 = 3;
                        break;
                    }
                    case 3387192: {
                        var23_74 = var2_2.equals(var10_13);
                        if (!var23_74) ** GOTO lbl-1000
                        var30_176 = 2;
                        break;
                    }
                    case -1026963764: {
                        var5_8 = "underline";
                        var23_75 = var2_2.equals(var5_8);
                        if (var23_75) break;
                        ** GOTO lbl-1000
                    }
                    case -1171789332: {
                        var5_8 = "line-through";
                        var23_76 = var2_2.equals(var5_8);
                        if (!var23_76) ** GOTO lbl-1000
                        var30_176 = 0;
                        var16_19 = null;
                    }
                }
                switch (var30_176) {
                    default: {
                        var22_49 = false;
                        var18_21 /* !! */  = null;
                        break;
                    }
                    case 4: {
                        var18_21 /* !! */  = rR2$E$g.Overline;
                        break;
                    }
                    case 3: {
                        var18_21 /* !! */  = rR2$E$g.Blink;
                        break;
                    }
                    case 2: {
                        var18_21 /* !! */  = rR2$E$g.None;
                        break;
                    }
                    case 1: {
                        var18_21 /* !! */  = rR2$E$g.Underline;
                        break;
                    }
                    case 0: {
                        var18_21 /* !! */  = rR2$E$g.LineThrough;
                    }
                }
                var3_3.s = var18_21 /* !! */ ;
                if (var18_21 /* !! */  == null) break;
                var24_106 = var3_3.a;
                var26_147 = 131072L;
                var3_3.a = var24_106 |= var26_147;
                break;
            }
            case 64: {
                var30_177 = true;
                var31_179 = var2_2.hashCode();
                switch (var31_179) lbl-1000:
                // 4 sources

                {
                    default: {
                        var22_50 = -1;
                        break;
                    }
                    case -1039745817: {
                        var23_77 = var2_2.equals(var8_11);
                        if (!var23_77) ** GOTO lbl-1000
                        var22_50 = 2;
                        break;
                    }
                    case -1178781136: {
                        var23_78 = var2_2.equals(var5_8);
                        if (!var23_78) ** GOTO lbl-1000
                        var22_50 = 1;
                        break;
                    }
                    case -1657669071: {
                        var23_79 = var2_2.equals(var6_9);
                        if (!var23_79) ** GOTO lbl-1000
                        var22_50 = 0;
                        var18_21 /* !! */  = null;
                    }
                }
                switch (var22_50) {
                    default: {
                        var22_50 = 0;
                        var18_21 /* !! */  = null;
                        break;
                    }
                    case 2: {
                        var18_21 /* !! */  = rR2$E$b.Normal;
                        break;
                    }
                    case 1: {
                        var18_21 /* !! */  = rR2$E$b.Italic;
                        break;
                    }
                    case 0: {
                        var18_21 /* !! */  = rR2$E$b.Oblique;
                    }
                }
                var3_3.r = var18_21 /* !! */ ;
                if (var18_21 /* !! */  == null) break;
                var24_107 = var3_3.a;
                var26_148 = 65536L;
                var3_3.a = var24_107 |= var26_148;
                break;
            }
            case 63: {
                var5_8 = uR2$e.a;
                var0.q = var4_7 = (Integer)var5_8.get(var2_2);
                if (var4_7 == null) break;
                var24_108 = var0.a;
                var26_149 = 32768L;
                var0.a = var24_108 |= var26_149;
                break;
            }
            case 62: {
                try {
                    var5_8 = uR2$d.a;
                }
                catch (SVGParseException v0) {
                    ** GOTO lbl520
                }
                var5_8 = var5_8.get(var2_2);
                var5_8 = (rR2$p)var5_8;
                if (var5_8 != null) ** GOTO lbl518
                var4_7 = uR2.t(var2_2);
                var18_21 /* !! */  = var4_7;
                ** GOTO lbl522
lbl518:
                // 1 sources

                var18_21 /* !! */  = var5_8;
                ** GOTO lbl522
lbl520:
                // 1 sources

                var22_51 = false;
                var18_21 /* !! */  = null;
lbl522:
                // 3 sources

                var3_3.p = var18_21 /* !! */ ;
                if (var18_21 /* !! */  == null) break;
                var24_109 = var3_3.a;
                var26_150 = 16384L;
                var3_3.a = var24_109 |= var26_150;
                break;
            }
            case 61: {
                var0.o = var4_7 = uR2.r(var2_2);
                if (var4_7 == null) break;
                var24_110 = var0.a;
                var26_151 = 8192L;
                var0.a = var24_110 |= var26_151;
                break;
            }
            case 60: {
                var30_178 = 1;
                var7_10 = new StringBuilder((String)var18_21 /* !! */ );
                var7_10.append(var2_2);
                var7_10.append(var20_23);
                var7_10 = var7_10.toString();
                var9_12 /* !! */  = "|caption|icon|menu|message-box|small-caption|status-bar|";
                var31_180 = var9_12 /* !! */ .contains((CharSequence)var7_10);
                if (!var31_180) break;
                var7_10 = new uR2$i(var2_2);
                var23_80 = 0;
                var32_182 = 0.0f;
                var4_7 = null;
                var33_185 = 0;
                var34_187 = 0.0f;
                var9_12 /* !! */  = null;
                var35_189 = false;
                var10_13 = null;
                while (true) {
                    var22_52 = '/';
                    var17_20 = null;
                    var36_191 = var7_10.m(false, var22_52);
                    var7_10.q();
                    if (var36_191 == null) break block28;
                    if (var4_7 != null && var9_12 /* !! */  != null) break;
                    var37_192 = var36_191.equals(var8_11);
                    if (var37_192 || var4_7 == null && (var4_7 = (Integer)uR2$e.a.get(var36_191)) != null) continue;
                    if (var9_12 /* !! */  != null) ** GOTO lbl604
                    var33_185 = var36_191.hashCode();
                    switch (var33_185) lbl-1000:
                    // 4 sources

                    {
                        default: {
                            var33_185 = -1;
                            var34_187 = 0.0f / 0.0f;
                            break;
                        }
                        case -1039745817: {
                            var33_185 = (int)var36_191.equals(var8_11);
                            if (var33_185 == 0) ** GOTO lbl-1000
                            var33_185 = 2;
                            var34_187 = 2.8E-45f;
                            break;
                        }
                        case -1178781136: {
                            var33_185 = (int)var36_191.equals(var5_8);
                            if (var33_185 == 0) ** GOTO lbl-1000
                            var33_185 = 1;
                            var34_187 = 1.4E-45f;
                            break;
                        }
                        case -1657669071: {
                            var33_185 = (int)var36_191.equals(var6_9);
                            if (var33_185 == 0) ** GOTO lbl-1000
                            var33_185 = 0;
                            var34_187 = 0.0f;
                            var9_12 /* !! */  = null;
                        }
                    }
                    switch (var33_185) {
                        default: {
                            var33_185 = 0;
                            var34_187 = 0.0f;
                            var9_12 /* !! */  = null;
                            break;
                        }
                        case 2: {
                            var9_12 /* !! */  = rR2$E$b.Normal;
                            break;
                        }
                        case 1: {
                            var9_12 /* !! */  = rR2$E$b.Italic;
                            break;
                        }
                        case 0: {
                            var9_12 /* !! */  = rR2$E$b.Oblique;
                        }
                    }
                    if (var9_12 /* !! */  != null) continue;
lbl604:
                    // 2 sources

                    if (var10_13 != null || !(var35_189 = var36_191.equals(var10_13 = "small-caps"))) break;
                    var10_13 = var36_191;
                }
                var5_8 = uR2$d.a;
                var5_8 = var5_8.get(var36_191);
                var5_8 = (rR2$p)var5_8;
                if (var5_8 != null) ** GOTO lbl620
                try {
                    var5_8 = uR2.t(var36_191);
                }
                catch (SVGParseException v1) {
                    var21_37 = false;
                    var5_8 = null;
                }
lbl620:
                // 3 sources

                if ((var28_167 = var7_10.d(var22_52)) != 0) {
                    var7_10.q();
                    var6_9 = var7_10.l();
                    if (var6_9 != null) {
                        uR2.t((String)var6_9);
                    }
                    var7_10.q();
                }
                if ((var28_167 = var7_10.f()) != 0) {
                    var22_52 = '\u0000';
                    var18_21 /* !! */  = null;
                } else {
                    var28_167 = var7_10.b;
                    var7_10.b = var30_178 = var7_10.c;
                    var16_19 = var7_10.a;
                    var18_21 /* !! */  = var16_19.substring(var28_167);
                }
                var3_3.o = var6_9 = uR2.r((String)var18_21 /* !! */ );
                var3_3.p = var5_8;
                if (var4_7 == null) {
                    var23_80 = 400;
                    var32_182 = 5.6E-43f;
                } else {
                    var23_80 = var4_7.intValue();
                }
                var3_3.q = var4_7 = Integer.valueOf(var23_80);
                if (var9_12 /* !! */  == null) {
                    var9_12 /* !! */  = rR2$E$b.Normal;
                }
                var3_3.r = var9_12 /* !! */ ;
                var24_111 = var3_3.a;
                var26_152 = 122880L;
                var3_3.a = var24_111 |= var26_152;
                break;
            }
            case 59: {
                var4_7 = uR2.o(var2_2);
                var0.n = var4_7;
                var24_112 = var0.a;
                var26_153 = 4096L;
                var24_112 |= var26_153;
                var0.a = var24_112;
                break;
            }
            case 58: {
                var0.m = var4_7 = uR2.w(var2_2);
                var24_113 = var0.a;
                var26_154 = 2048L;
                var0.a = var24_113 |= var26_154;
                break;
            }
            case 57: {
                var4_7 = uR2.t(var2_2);
                var0.l = var4_7;
                var24_114 = var0.a;
                var26_155 = 1024L;
                var24_114 |= var26_155;
                var0.a = var24_114;
                break;
            }
            case 56: {
                var21_38 = var10_13.equals(var2_2);
                var26_156 = 512L;
                if (var21_38) {
                    var21_38 = false;
                    var5_8 = null;
                    var0.k = null;
                    var0.a = var24_115 = var0.a | var26_156;
                    break;
                }
                var21_38 = false;
                var5_8 = null;
                var7_10 = new uR2$i(var2_2);
                var7_10.q();
                var23_81 /* !! */  = var7_10.f();
                if (var23_81 /* !! */  == 0) ** GOTO lbl698
lbl694:
                // 4 sources

                while (true) {
                    var22_53 = false;
                    var18_21 /* !! */  = null;
                    ** GOTO lbl725
                    break;
                }
lbl698:
                // 1 sources

                var4_7 = var7_10.j();
                if (var4_7 == null || (var29_172 = var4_7.i())) ** GOTO lbl694
                var8_11 = new ArrayList<rR2$p[]>();
                var8_11.add((rR2$p[])var4_7);
                var32_183 = var4_7.a;
                while (!(var33_186 = var7_10.f())) {
                    var7_10.p();
                    var9_12 /* !! */  = var7_10.j();
                    if (var9_12 /* !! */  == null || (var35_190 = var9_12 /* !! */ .i())) ** GOTO lbl694
                    var8_11.add((rR2$p[])var9_12 /* !! */ );
                    var34_188 = var9_12 /* !! */ .a;
                    var32_183 += var34_188;
                }
                var31_181 = false;
                var7_10 = null;
                cfr_temp_0 = var32_183 - 0.0f;
                var23_81 /* !! */  = (int)(cfr_temp_0 == 0.0f ? 0 : (cfr_temp_0 > 0.0f ? 1 : -1));
                if (var23_81 /* !! */  != 0) ** break;
                ** continue;
                var23_81 /* !! */  = var8_11.size();
                var4_7 = new rR2$p[var23_81 /* !! */ ];
                var4_7 = var8_11.toArray((T[])var4_7);
                var18_21 /* !! */  = var4_7;
                var18_21 /* !! */  = var4_7;
lbl725:
                // 2 sources

                var3_3.k = var18_21 /* !! */ ;
                if (var18_21 /* !! */  == null) break;
                var3_3.a = var24_116 = var3_3.a | var26_156;
                break;
            }
            case 55: {
                var32_184 = uR2.q(var2_2);
                var4_7 = Float.valueOf(var32_184);
                var0.j = var4_7;
                var24_117 = var0.a;
                var26_157 = 256L;
                var24_117 |= var26_157;
                var0.a = var24_117;
                break;
            }
            case 54: {
                var21_39 = false;
                var5_8 = null;
                var6_9 = "miter";
                var28_168 = var6_9.equals(var2_2);
                if (var28_168) {
                    var18_21 /* !! */  = rR2$E$d.Miter;
                } else {
                    var28_168 = var17_20.equals(var2_2);
                    if (var28_168) {
                        var18_21 /* !! */  = rR2$E$d.Round;
                    } else {
                        var6_9 = "bevel";
                        var23_82 = var6_9.equals(var2_2);
                        if (var23_82) {
                            var18_21 /* !! */  = rR2$E$d.Bevel;
                        } else {
                            var22_54 = false;
                            var18_21 /* !! */  = null;
                        }
                    }
                }
                var3_3.i = var18_21 /* !! */ ;
                if (var18_21 /* !! */  == null) break;
                var24_118 = var3_3.a;
                var26_158 = 128L;
                var3_3.a = var24_118 |= var26_158;
                break;
            }
            case 53: {
                var21_40 = false;
                var5_8 = null;
                var6_9 = "butt";
                var28_169 = var6_9.equals(var2_2);
                if (var28_169) {
                    var18_21 /* !! */  = rR2$E$c.Butt;
                } else {
                    var28_169 = var17_20.equals(var2_2);
                    if (var28_169) {
                        var18_21 /* !! */  = rR2$E$c.Round;
                    } else {
                        var6_9 = "square";
                        var23_83 = var6_9.equals(var2_2);
                        if (var23_83) {
                            var18_21 /* !! */  = rR2$E$c.Square;
                        } else {
                            var22_55 = false;
                            var18_21 /* !! */  = null;
                        }
                    }
                }
                var3_3.h = var18_21 /* !! */ ;
                if (var18_21 /* !! */  == null) break;
                var24_119 = var3_3.a;
                var26_159 = 64;
                var3_3.a = var24_119 |= var26_159;
                break;
            }
            case 52: {
                var4_7 = uR2.t(var2_2);
                var0.g = var4_7;
                var24_120 = var0.a;
                var26_160 = 32;
                var24_120 |= var26_160;
                var0.a = var24_120;
                break;
            }
            case 51: {
                var0.f = var4_7 = uR2.w(var2_2);
                if (var4_7 == null) break;
                var24_121 = var0.a;
                var26_161 = 16;
                var0.a = var24_121 |= var26_161;
                break;
            }
            case 50: {
                var0.e = var4_7 = uR2.x(var2_2);
                if (var4_7 == null) break;
                var24_122 = var0.a;
                var26_162 = 8;
                var0.a = var24_122 |= var26_162;
                break;
            }
            case 49: {
                var0.d = var4_7 = uR2.w(var2_2);
                if (var4_7 == null) break;
                var24_123 = var0.a;
                var26_163 = 4;
                var0.a = var24_123 |= var26_163;
                break;
            }
            case 48: {
                var21_41 = false;
                var5_8 = null;
                var28_170 = var16_19.equals(var2_2);
                if (var28_170) {
                    var18_21 /* !! */  = rR2$E$a.NonZero;
                } else {
                    var23_84 = var15_18.equals(var2_2);
                    if (var23_84) {
                        var18_21 /* !! */  = rR2$E$a.EvenOdd;
                    } else {
                        var22_56 = false;
                        var18_21 /* !! */  = null;
                    }
                }
                var3_3.c = var18_21 /* !! */ ;
                if (var18_21 /* !! */  == null) break;
                var24_124 = var3_3.a;
                var26_164 = 2;
                var3_3.a = var24_124 |= var26_164;
                break;
            }
            case 47: {
                var0.b = var4_7 = uR2.x(var2_2);
                if (var4_7 == null) break;
                var24_125 = var0.a;
                var26_165 = 1L;
                var0.a = var24_125 |= var26_165;
            }
        }
lbl849:
        // 71 sources

        return;
        catch (SVGParseException v2) {
            ** continue;
        }
    }

    public static int b(float f5) {
        int n3;
        float f6 = 0.0f;
        float f7 = f5 - 0.0f;
        Object object = f7 == 0.0f ? 0 : (f7 < 0.0f ? -1 : 1);
        if (object < 0) {
            n3 = 0;
            f5 = 0.0f;
        } else {
            f6 = 255.0f;
            float f8 = f5 - f6;
            object = f8 == 0.0f ? 0 : (f8 > 0.0f ? 1 : -1);
            if (object > 0) {
                n3 = 255;
                f5 = 3.57E-43f;
            } else {
                n3 = Math.round(f5);
            }
        }
        return n3;
    }

    public static int d(float f5, float f6, float f7) {
        float f8;
        float f11;
        float f12;
        int n3 = 1135869952;
        float f14 = 360.0f;
        Object object = 0;
        float f15 = 0.0f;
        float f16 = f5 - 0.0f;
        Object object2 = f16 == 0.0f ? 0 : (f16 > 0.0f ? 1 : -1);
        f5 %= f14;
        if (object2 < 0) {
            f5 += f14;
        }
        f5 /= 60.0f;
        f14 = 100.0f;
        f6 /= f14;
        f7 /= f14;
        n3 = 1065353216;
        f14 = 1.0f;
        float f17 = f6 - 0.0f;
        object2 = f17 == 0.0f ? 0 : (f17 < 0.0f ? -1 : 1);
        if (object2 < 0) {
            f6 = 0.0f;
        } else {
            object2 = f6 == f14 ? 0 : (f6 > f14 ? 1 : -1);
            if (object2 > 0) {
                f6 = 1.0f;
            }
        }
        object2 = (f12 = f7 - 0.0f) == 0.0f ? 0 : (f12 < 0.0f ? -1 : 1);
        if (object2 >= 0) {
            object = f7 == f14 ? 0 : (f7 > f14 ? 1 : -1);
            if (object > 0) {
                object = 1065353216;
                f15 = 1.0f;
            } else {
                f15 = f7;
            }
        }
        if ((f11 = (f8 = f15 - (f7 = 0.5f)) == 0.0f ? 0 : (f8 < 0.0f ? -1 : 1)) <= 0) {
            f6 = (f6 + f14) * f15;
        } else {
            f7 = f15 + f6;
            f6 *= f15;
            f6 = f7 - f6;
        }
        f7 = 2.0f;
        f15 = f15 * f7 - f6;
        f14 = f5 + f7;
        f14 = uR2.e(f15, f6, f14);
        float f18 = uR2.e(f15, f6, f5);
        f5 -= f7;
        f5 = uR2.e(f15, f6, f5);
        f6 = 256.0f;
        f11 = uR2.b(f14 * f6) << 16;
        n3 = uR2.b(f18 * f6) << 8;
        f11 = f11 | n3;
        return uR2.b(f5 * f6) | f11;
    }

    public static float e(float f5, float f6, float f7) {
        float f8;
        float f11 = 0.0f;
        int n3 = 0x40C00000;
        float f12 = 6.0f;
        float f14 = f7 - 0.0f;
        Object object = f14 == 0.0f ? 0 : (f14 < 0.0f ? -1 : 1);
        if (object < 0) {
            f7 += f12;
        }
        if ((object = f7 == f12 ? 0 : (f7 > f12 ? 1 : -1)) >= 0) {
            f7 -= f12;
        }
        if ((object = (f8 = f7 - (f11 = 1.0f)) == 0.0f ? 0 : (f8 < 0.0f ? -1 : 1)) < 0) {
            return xu0_1.a(f6, f5, f7, f5);
        }
        f11 = 3.0f;
        float f15 = f7 - f11;
        object = f15 == 0.0f ? 0 : (f15 < 0.0f ? -1 : 1);
        if (object < 0) {
            return f6;
        }
        object = 0x40800000;
        f11 = 4.0f;
        float f16 = f7 - f11;
        n3 = (int)(f16 == 0.0f ? 0 : (f16 < 0.0f ? -1 : 1));
        if (n3 < 0) {
            f6 -= f5;
            f5 = xu0_1.a(f11, f7, f6, f5);
        }
        return f5;
    }

    public static void g(rR2$G rR2$G, Attributes attributes) {
        int n3;
        block7: for (int i3 = 0; i3 < (n3 = attributes.getLength()); ++i3) {
            HashSet<String> hashSet = attributes.getValue(i3).trim();
            Object object = uR2$a.b;
            int n4 = tR2.a(attributes, i3);
            int n7 = object[n4];
            switch (n7) {
                default: {
                    continue block7;
                }
                case 25: {
                    hashSet = uR2.r((String)((Object)hashSet));
                    object = new HashSet;
                    if (hashSet != null) {
                        ((HashSet)object)(hashSet);
                    } else {
                        ((HashSet)object)(0);
                    }
                    rR2$G.h((HashSet)object);
                    continue block7;
                }
                case 24: {
                    String string2;
                    object = new uR2$i;
                    ((uR2$i)object)((String)((Object)hashSet));
                    hashSet = new HashSet<String>();
                    while ((n4 = (int)(((uR2$i)object).f() ? 1 : 0)) == 0) {
                        string2 = ((uR2$i)object).l();
                        hashSet.add(string2);
                        ((uR2$i)object).q();
                    }
                    rR2$G.j(hashSet);
                    continue block7;
                }
                case 23: {
                    Object object2;
                    int n8;
                    String string2;
                    object = new uR2$i;
                    ((uR2$i)object)((String)((Object)hashSet));
                    hashSet = new HashSet<String>();
                    while ((n4 = (int)(((uR2$i)object).f() ? 1 : 0)) == 0) {
                        int n10;
                        string2 = ((uR2$i)object).l();
                        n8 = string2.indexOf(45);
                        if (n8 != (n10 = -1)) {
                            string2 = string2.substring(0, n8);
                        }
                        String string3 = "";
                        object2 = new Locale(string2, string3, string3);
                        string2 = ((Locale)object2).getLanguage();
                        hashSet.add(string2);
                        ((uR2$i)object).q();
                    }
                    rR2$G.f(hashSet);
                    continue block7;
                }
                case 22: {
                    rR2$G.i((String)((Object)hashSet));
                    continue block7;
                }
                case 21: {
                    Object object2;
                    int n8;
                    String string2;
                    object = new uR2$i;
                    ((uR2$i)object)((String)((Object)hashSet));
                    hashSet = new HashSet<String>();
                    while ((n4 = (int)(((uR2$i)object).f() ? 1 : 0)) == 0) {
                        string2 = ((uR2$i)object).l();
                        n8 = (int)(string2.startsWith((String)(object2 = "http://www.w3.org/TR/SVG11/feature#")) ? 1 : 0);
                        if (n8 != 0) {
                            n8 = 35;
                            string2 = string2.substring(n8);
                            hashSet.add(string2);
                        } else {
                            string2 = "UNSUPPORTED";
                            hashSet.add(string2);
                        }
                        ((uR2$i)object).q();
                    }
                    rR2$G.e(hashSet);
                }
            }
        }
    }

    public static void h(rR2$L object, Attributes object2) {
        int n3;
        String string2 = null;
        for (int i3 = 0; i3 < (n3 = object2.getLength()); ++i3) {
            String string3;
            String string4 = object2.getQName(i3);
            boolean bl2 = string4.equals(string3 = "id");
            if (!bl2 && !(bl2 = string4.equals(string3 = "xml:id"))) {
                string3 = "xml:space";
                n3 = (int)(string4.equals(string3) ? 1 : 0);
                if (n3 == 0) continue;
                string2 = "default";
                if ((i3 = (int)(string2.equals(object2 = object2.getValue(i3).trim()) ? 1 : 0)) != 0) {
                    ((rR2$L)object).d = object2 = Boolean.FALSE;
                    break;
                }
                string2 = "preserve";
                i3 = (int)(string2.equals(object2) ? 1 : 0);
                if (i3 != 0) {
                    ((rR2$L)object).d = object2 = Boolean.TRUE;
                    break;
                }
                object2 = kp1_0.c("Invalid value for \"xml:space\" attribute: ", (String)object2);
                object = new SAXException((String)object2);
                throw object;
            }
            ((rR2$L)object).c = object2 = object2.getValue(i3).trim();
            break;
        }
    }

    public static void i(rr2$j_0 object, Attributes object2) {
        int n3;
        block8: for (int i3 = 0; i3 < (n3 = object2.getLength()); ++i3) {
            Object object3 = object2.getValue(i3).trim();
            Object object4 = uR2$a.b;
            int n4 = tR2.a((Attributes)object2, i3);
            int n7 = object4[n4];
            if (n7 != (n4 = 6)) {
                switch (n7) {
                    default: {
                        continue block8;
                    }
                    case 34: {
                        try {
                            object4 = (Object)rR2$k.valueOf((String)object3);
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            object2 = cP.a("Invalid spreadMethod attribute. \"", (String)object3, "\" is not a valid value.");
                            object = new SAXException((String)object2);
                            throw object;
                        }
                        ((rr2$j_0)object).k = object4;
                        continue block8;
                    }
                    case 33: {
                        object3 = uR2.A((String)object3);
                        ((rr2$j_0)object).j = object3;
                        continue block8;
                    }
                    case 32: {
                        object4 = "objectBoundingBox";
                        n7 = (int)(((String)object4).equals(object3) ? 1 : 0);
                        if (n7 != 0) {
                            ((rr2$j_0)object).i = object3 = Boolean.FALSE;
                            continue block8;
                        }
                        object4 = "userSpaceOnUse";
                        n3 = (int)(((String)object4).equals(object3) ? 1 : 0);
                        if (n3 != 0) {
                            ((rr2$j_0)object).i = object3 = Boolean.TRUE;
                            continue block8;
                        }
                        object = new SAXException("Invalid value for attribute gradientUnits");
                        throw object;
                    }
                }
            }
            object4 = "";
            String string2 = object2.getURI(i3);
            n7 = (int)(((String)object4).equals(string2) ? 1 : 0);
            if (n7 == 0 && (n7 = (int)(((String)(object4 = "http://www.w3.org/1999/xlink")).equals(string2 = object2.getURI(i3)) ? 1 : 0)) == 0) continue;
            ((rr2$j_0)object).l = object3;
        }
    }

    public static void j(rr2$z_0 object, Attributes object2, String string2) {
        int n3;
        for (int i3 = 0; i3 < (n3 = object2.getLength()); ++i3) {
            Float f5;
            float f6;
            boolean bl2;
            Object object3;
            Object object4 = uR2$g.fromString(object2.getLocalName(i3));
            if (object4 != (object3 = uR2$g.points)) continue;
            object3 = object2.getValue(i3);
            object4 = new uR2$i((String)object3);
            object3 = new ArrayList();
            ((uR2$i)object4).q();
            while (!(bl2 = ((uR2$i)object4).f())) {
                f6 = ((uR2$i)object4).i();
                boolean bl3 = Float.isNaN(f6);
                String string3 = "Invalid <";
                if (!bl3) {
                    ((uR2$i)object4).p();
                    float f7 = ((uR2$i)object4).i();
                    boolean bl4 = Float.isNaN(f7);
                    if (!bl4) {
                        ((uR2$i)object4).p();
                        f5 = Float.valueOf(f6);
                        ((ArrayList)object3).add(f5);
                        f5 = Float.valueOf(f7);
                        ((ArrayList)object3).add(f5);
                        continue;
                    }
                    object2 = cP.a(string3, string2, "> points attribute. There should be an even number of coordinates.");
                    object = new SAXException((String)object2);
                    throw object;
                }
                object2 = cP.a(string3, string2, "> points attribute. Non-coordinate content found in list.");
                object = new SAXException((String)object2);
                throw object;
            }
            n3 = ((ArrayList)object3).size();
            object4 = new float[n3];
            ((rr2$z_0)object).o = (float[])object4;
            object4 = ((ArrayList)object3).iterator();
            int n4 = 0;
            object3 = null;
            while (bl2 = object4.hasNext()) {
                f5 = (Float)object4.next();
                f6 = f5.floatValue();
                float[] fArray = ((rr2$z_0)object).o;
                int n7 = n4 + 1;
                fArray[n4] = f6;
                n4 = n7;
            }
        }
    }

    public static void k(rR2$L rR2$L, Attributes attributes) {
        char c2;
        block0: for (char c3 = '\u0000'; c3 < (c2 = attributes.getLength()); ++c3) {
            String string2;
            Object object = attributes.getValue(c3).trim();
            int n3 = ((String)object).length();
            if (n3 == 0) continue;
            Object object2 = uR2$a.b;
            int n4 = tR2.a(attributes, c3);
            n3 = object2[n4];
            if (n3 != (n4 = 45)) {
                n4 = 46;
                if (n3 != n4) {
                    object = rR2$L.e;
                    if (object == null) {
                        object = new Object();
                        rR2$L.e = object;
                    }
                    object = rR2$L.e;
                    object2 = attributes.getLocalName(c3);
                    string2 = attributes.getValue(c3).trim();
                    uR2.E((rR2$E)object, (String)object2, string2);
                    continue;
                }
                object2 = new CH$d;
                ((CH$d)object2)((String)object);
                c2 = '\u0000';
                object = null;
                while ((n4 = (int)(((uR2$i)object2).f() ? 1 : 0)) == 0) {
                    string2 = ((uR2$i)object2).l();
                    if (string2 == null) continue;
                    if (object == null) {
                        object = new Object();
                    }
                    object.add(string2);
                    ((uR2$i)object2).q();
                }
                rR2$L.g = object;
                continue;
            }
            object2 = new uR2$i;
            string2 = "/\\*.*?\\*/";
            String string3 = "";
            object = ((String)object).replaceAll(string2, string3);
            ((uR2$i)object2)((String)object);
            while (true) {
                c2 = ':';
                string2 = ((uR2$i)object2).m(false, c2);
                ((uR2$i)object2).q();
                c2 = (char)(((uR2$i)object2).d(c2) ? 1 : 0);
                if (c2 == '\u0000') continue block0;
                ((uR2$i)object2).q();
                c2 = ';';
                boolean bl2 = true;
                string3 = ((uR2$i)object2).m(bl2, c2);
                if (string3 == null) {
                    continue block0;
                }
                ((uR2$i)object2).q();
                boolean bl3 = ((uR2$i)object2).f();
                if (!bl3 && (c2 = (char)(((uR2$i)object2).d(c2) ? 1 : 0)) == '\u0000') continue;
                object = rR2$L.f;
                if (object == null) {
                    object = new Object();
                    rR2$L.f = object;
                }
                object = rR2$L.f;
                uR2.E(object, string2, string3);
                ((uR2$i)object2).q();
            }
        }
    }

    public static void l(rR2$a0 rR2$a0, Attributes attributes) {
        int n3;
        for (int i3 = 0; i3 < (n3 = attributes.getLength()); ++i3) {
            Object object = attributes.getValue(i3).trim();
            int[] nArray = uR2$a.b;
            int n4 = tR2.a(attributes, i3);
            int n7 = nArray[n4];
            if (n7 != (n4 = 1)) {
                n4 = 2;
                if (n7 != n4) {
                    n4 = 19;
                    if (n7 != n4) {
                        n4 = 20;
                        if (n7 != n4) continue;
                        rR2$a0.r = object = uR2.u((String)object);
                        continue;
                    }
                    rR2$a0.q = object = uR2.u((String)object);
                    continue;
                }
                rR2$a0.p = object = uR2.u((String)object);
                continue;
            }
            rR2$a0.o = object = uR2.u((String)object);
        }
    }

    public static void m(rr2$n_0 rr2$n_0, Attributes attributes) {
        int n3;
        for (int i3 = 0; i3 < (n3 = attributes.getLength()); ++i3) {
            uR2$g uR2$g;
            uR2$g uR2$g2 = uR2$g.fromString(attributes.getLocalName(i3));
            if (uR2$g2 != (uR2$g = uR2$g.transform)) continue;
            uR2$g2 = uR2.A(attributes.getValue(i3));
            rr2$n_0.k((Matrix)uR2$g2);
        }
    }

    public static void n(rR2$R object, Attributes attributes) {
        int n3;
        for (int i3 = 0; i3 < (n3 = attributes.getLength()); ++i3) {
            String string2 = attributes.getValue(i3).trim();
            Object object2 = uR2$a.b;
            int n4 = tR2.a(attributes, i3);
            int n7 = object2[n4];
            n4 = 7;
            float f5 = 9.8E-45f;
            if (n7 != n4) {
                n4 = 87;
                f5 = 1.22E-43f;
                if (n7 != n4) continue;
                object2 = new uR2$i;
                ((uR2$i)object2)(string2);
                ((uR2$i)object2).q();
                float f6 = ((uR2$i)object2).i();
                ((uR2$i)object2).p();
                f5 = ((uR2$i)object2).i();
                ((uR2$i)object2).p();
                float f7 = ((uR2$i)object2).i();
                ((uR2$i)object2).p();
                float f8 = ((uR2$i)object2).i();
                Object object3 = Float.isNaN(f6);
                if (object3 == 0 && (object3 = Float.isNaN(f5)) == 0 && (object3 = Float.isNaN(f7)) == 0 && (object3 = Float.isNaN(f8)) == 0) {
                    object3 = 0;
                    rR2$b rR2$b = null;
                    float f11 = f7 - 0.0f;
                    Object object4 = f11 == 0.0f ? 0 : (f11 < 0.0f ? -1 : 1);
                    if (object4 >= 0) {
                        float f12 = f8 - 0.0f;
                        object3 = f12 == 0.0f ? 0 : (f12 < 0.0f ? -1 : 1);
                        if (object3 >= 0) {
                            ((rR2$R)object).p = rR2$b = new rR2$b(f6, f5, f7, f8);
                            continue;
                        }
                        object = new SAXException("Invalid viewBox. height cannot be negative");
                        throw object;
                    }
                    object = new SAXException("Invalid viewBox. width cannot be negative");
                    throw object;
                }
                object = new SAXException("Invalid viewBox definition - should have four numbers");
                throw object;
            }
            uR2.y((rr2$p_0)object, string2);
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public static rR2$f o(String object) {
        long l2;
        ij1 ij12;
        int n3;
        int n4;
        int n7;
        float f5;
        int n8;
        int n10;
        int n14;
        Object object2;
        block28: {
            int n15;
            block30: {
                float f6;
                boolean bl2;
                boolean bl3;
                String string2;
                int n16;
                float f7;
                float f8;
                block29: {
                    object2 = null;
                    n14 = ((String)object).charAt(0);
                    n10 = 35;
                    f8 = 4.9E-44f;
                    n8 = 5;
                    f5 = 7.0E-45f;
                    n7 = -16777216;
                    n4 = 4;
                    f7 = 5.6E-45f;
                    if (n14 != n10) break block29;
                    n14 = ((String)object).length();
                    n10 = 1;
                    f8 = Float.MIN_VALUE;
                    n3 = 0;
                    ij12 = null;
                    if (n10 >= n14) break block28;
                    l2 = 0L;
                    float f11 = Float.MIN_VALUE;
                    break block30;
                }
                object2 = Locale.US;
                object2 = ((String)object).toLowerCase((Locale)object2);
                String string3 = "rgba(";
                n10 = (int)(((String)object2).startsWith(string3) ? 1 : 0);
                char c2 = ')';
                float f12 = 256.0f;
                char c3 = '%';
                if (n10 == 0 && (n16 = ((String)object2).startsWith(string2 = "rgb(")) == 0) {
                    float f14;
                    boolean bl4;
                    string3 = "hsla(";
                    n10 = (int)(((String)object2).startsWith(string3) ? 1 : 0);
                    if (n10 == 0 && (n16 = ((String)object2).startsWith(string2 = "hsl(")) == 0) {
                        object = (Integer)uR2$c.a.get(object2);
                        if (object != null) {
                            int n17 = (Integer)object;
                            return new rR2$f(n17);
                        }
                        object2 = "Invalid colour keyword: ".concat((String)object2);
                        object = new SAXException((String)object2);
                        throw object;
                    }
                    if (n10 == 0) {
                        n8 = 4;
                        f5 = 5.6E-45f;
                    }
                    String string4 = ((String)object).substring(n8);
                    object2 = new uR2$i(string4);
                    ((uR2$i)object2).q();
                    f5 = ((uR2$i)object2).i();
                    f7 = ((uR2$i)object2).c(f5);
                    n16 = (int)(Float.isNaN(f7) ? 1 : 0);
                    if (n16 == 0) {
                        ((uR2$i)object2).d(c3);
                    }
                    if (!(bl4 = Float.isNaN(f14 = ((uR2$i)object2).c(f7)))) {
                        ((uR2$i)object2).d(c3);
                    }
                    if (n10 != 0) {
                        f8 = ((uR2$i)object2).c(f14);
                        ((uR2$i)object2).q();
                        n7 = (int)(Float.isNaN(f8) ? 1 : 0);
                        if (n7 == 0 && (n14 = (int)(((uR2$i)object2).d(c2) ? 1 : 0)) != 0) {
                            n14 = uR2.b(f8 * f12) << 24;
                            n10 = uR2.d(f5, f7, f14);
                            return new rR2$f(n14 |= n10);
                        }
                        object = "Bad hsla() colour value: ".concat((String)object);
                        object2 = new SAXException((String)object);
                        throw object2;
                    }
                    ((uR2$i)object2).q();
                    n10 = (int)(Float.isNaN(f14) ? 1 : 0);
                    if (n10 == 0 && (n14 = (int)(((uR2$i)object2).d(c2) ? 1 : 0)) != 0) {
                        n14 = uR2.d(f5, f7, f14) | n7;
                        return new rR2$f(n14);
                    }
                    object = "Bad hsl() colour value: ".concat((String)object);
                    object2 = new SAXException((String)object);
                    throw object2;
                }
                if (n10 == 0) {
                    n8 = 4;
                    f5 = 5.6E-45f;
                }
                String string5 = ((String)object).substring(n8);
                object2 = new uR2$i(string5);
                ((uR2$i)object2).q();
                f5 = ((uR2$i)object2).i();
                n4 = (int)(Float.isNaN(f5) ? 1 : 0);
                n16 = 1120403456;
                float f15 = 100.0f;
                if (n4 == 0 && (n4 = (int)(((uR2$i)object2).d(c3) ? 1 : 0)) != 0) {
                    f5 = f5 * f12 / f15;
                }
                if (!(bl3 = Float.isNaN(f7 = ((uR2$i)object2).c(f5))) && (bl3 = ((uR2$i)object2).d(c3))) {
                    f7 = f7 * f12 / f15;
                }
                if (!(bl2 = Float.isNaN(f6 = ((uR2$i)object2).c(f7))) && (c3 = (char)(((uR2$i)object2).d(c3) ? 1 : 0)) != '\u0000') {
                    f6 = f6 * f12 / f15;
                }
                if (n10 != 0) {
                    f8 = ((uR2$i)object2).c(f6);
                    ((uR2$i)object2).q();
                    n7 = (int)(Float.isNaN(f8) ? 1 : 0);
                    if (n7 == 0 && (n14 = (int)(((uR2$i)object2).d(c2) ? 1 : 0)) != 0) {
                        n14 = uR2.b(f8 * f12) << 24;
                        n10 = uR2.b(f5) << 16;
                        n14 |= n10;
                        n10 = uR2.b(f7) << 8;
                        n14 |= n10;
                        n10 = uR2.b(f6);
                        return new rR2$f(n14 |= n10);
                    }
                    object = "Bad rgba() colour value: ".concat((String)object);
                    object2 = new SAXException((String)object);
                    throw object2;
                }
                ((uR2$i)object2).q();
                n10 = (int)(Float.isNaN(f6) ? 1 : 0);
                if (n10 == 0 && (n14 = (int)(((uR2$i)object2).d(c2) ? 1 : 0)) != 0) {
                    n14 = uR2.b(f5) << 16 | n7;
                    n10 = uR2.b(f7) << 8;
                    n14 |= n10;
                    n10 = uR2.b(f6);
                    return new rR2$f(n14 |= n10);
                }
                object = "Bad rgb() colour value: ".concat((String)object);
                object2 = new SAXException((String)object);
                throw object2;
            }
            for (n15 = 1; n15 < n14; ++n15) {
                long l3;
                int n18 = ((String)object).charAt(n15);
                int n19 = 48;
                long l4 = 16;
                if (n18 >= n19 && n18 <= (n19 = 57)) {
                    l2 *= l4;
                    l3 = n18 += -48;
                    l2 += l3;
                } else {
                    n19 = 65;
                    long l7 = 10;
                    if (n18 >= n19 && n18 <= (n19 = 70)) {
                        l2 *= l4;
                        n18 += -65;
                    } else {
                        n19 = 97;
                        if (n18 < n19 || n18 > (n19 = 102)) break;
                        l2 *= l4;
                        n18 += -97;
                    }
                    l3 = n18;
                    l2 = l2 + l3 + l7;
                }
                l3 = 0xFFFFFFFFL;
                long l8 = l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
                if (l8 <= 0) {
                    continue;
                }
                break block28;
            }
            if (n15 != n10) {
                ij12 = new ij1(l2, n15);
            }
        }
        object2 = "Bad hex colour value: ";
        if (ij12 == null) {
            object = ((String)object2).concat((String)object);
            SVGParseException sVGParseException = new SAXException((String)object);
            throw sVGParseException;
        }
        l2 = ij12.b;
        n10 = ij12.a;
        if (n10 == n4) {
            int n20 = (int)l2;
            n14 = n20 & 0xF00;
            n10 = n20 & 0xF0;
            n20 &= 0xF;
            n3 = n14 << 12;
            n14 = n14 << 8 | (n7 |= n3);
            n7 = n10 << 8;
            n14 |= n7;
            n14 |= (n10 <<= n4);
            n10 = n20 << 4;
            return new rR2$f(n20 |= (n14 |= n10));
        }
        if (n10 == n8) {
            int n21 = (int)l2;
            n14 = 0xF000 & n21;
            n10 = n21 & 0xF00;
            n8 = n21 & 0xF0;
            n3 = (n21 &= 0xF) << 28;
            n21 = n21 << 24 | n3;
            n3 = n14 << 8;
            n21 |= n3;
            n21 |= (n14 <<= n4);
            n14 = n10 << 4;
            n21 = n21 | n14 | n10 | n8;
            n14 = n8 >> 4;
            return new rR2$f(n21 |= n14);
        }
        n8 = 7;
        f5 = 9.8E-45f;
        if (n10 == n8) {
            n14 = (int)l2 | n7;
            return new rR2$f(n14);
        }
        n8 = 9;
        f5 = 1.3E-44f;
        if (n10 == n8) {
            n14 = (int)l2;
            n10 = n14 << 24;
            n14 = n14 >>> 8 | n10;
            return new rR2$f(n14);
        }
        object = ((String)object2).concat((String)object);
        SVGParseException sVGParseException = new SAXException((String)object);
        throw sVGParseException;
    }

    public static float p(int n3, String string2) {
        X52 x52 = new Object();
        float f5 = x52.a(0, n3, string2);
        boolean bl2 = Float.isNaN(f5);
        if (!bl2) {
            return f5;
        }
        string2 = kp1_0.c("Invalid float value: ", string2);
        SVGParseException sVGParseException = new SAXException(string2);
        throw sVGParseException;
    }

    public static float q(String object) {
        int n3 = ((String)object).length();
        if (n3 != 0) {
            return uR2.p(n3, (String)object);
        }
        object = new SAXException("Invalid float value (empty string)");
        throw object;
    }

    public static ArrayList r(String arrayList) {
        boolean bl2;
        uR2$i uR2$i = new uR2$i((String)((Object)arrayList));
        arrayList = null;
        do {
            String string2;
            if ((string2 = uR2$i.k()) == null) {
                bl2 = true;
                char c2 = ',';
                string2 = uR2$i.m(bl2, c2);
            }
            if (string2 == null) break;
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
            arrayList.add(string2);
            uR2$i.p();
        } while (!(bl2 = uR2$i.f()));
        return arrayList;
    }

    public static String s(String string2) {
        String string3 = "none";
        int n3 = string2.equals(string3);
        int n4 = 0;
        if (n3 != 0) {
            return null;
        }
        string3 = "url(";
        n3 = string2.startsWith(string3);
        if (n3 == 0) {
            return null;
        }
        string3 = ")";
        n3 = string2.endsWith(string3);
        n4 = 4;
        if (n3 != 0) {
            n3 = string2.length() + -1;
            return string2.substring(n4, n3).trim();
        }
        return string2.substring(n4).trim();
    }

    public static rR2$p t(String object) {
        int n3 = ((String)object).length();
        if (n3 != 0) {
            float f5;
            Cloneable cloneable;
            int n4;
            n3 = ((String)object).length();
            Object object2 = rR2$d0.px;
            int n7 = n3 + -1;
            if ((n7 = (int)((String)object).charAt(n7)) == (n4 = 37)) {
                n3 += -1;
                object2 = rR2$d0.percent;
            } else {
                n4 = 2;
                if (n3 > n4 && (n7 = (int)(Character.isLetter((char)n7) ? 1 : 0)) != 0) {
                    n7 = n3 + -2;
                    if ((n7 = (int)(Character.isLetter(((String)object).charAt(n7)) ? 1 : 0)) != 0) {
                        object2 = ((String)object).substring(n3 += -2);
                        try {
                            cloneable = Locale.US;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            object = "Invalid length unit specifier: ".concat((String)object);
                            SVGParseException sVGParseException = new SAXException((String)object);
                            throw sVGParseException;
                        }
                        object2 = ((String)object2).toLowerCase((Locale)cloneable);
                        object2 = rR2$d0.valueOf((String)object2);
                    }
                }
            }
            try {
                f5 = uR2.p(n3, (String)object);
            }
            catch (NumberFormatException numberFormatException) {
                object = "Invalid length value: ".concat((String)object);
                object2 = new SAXException((String)object, numberFormatException);
                throw object2;
            }
            cloneable = new rR2$p(f5, (rR2$d0)((Object)object2));
            return cloneable;
        }
        object = new SAXException("Invalid length value (empty string)");
        throw object;
    }

    public static ArrayList u(String object) {
        int n3 = ((String)object).length();
        if (n3 != 0) {
            boolean bl2;
            int n4 = 1;
            Object object2 = new ArrayList(n4);
            uR2$i uR2$i = new uR2$i((String)object);
            uR2$i.q();
            while (!(bl2 = uR2$i.f())) {
                Object object3;
                float f5 = uR2$i.i();
                int n7 = Float.isNaN(f5);
                if (n7 != 0) {
                    String string2;
                    object3 = "Invalid length list value: ";
                    object2 = new StringBuilder((String)object3);
                    n7 = uR2$i.b;
                    while (true) {
                        int n8 = uR2$i.f();
                        string2 = uR2$i.a;
                        if (n8 != 0) break;
                        n8 = uR2$i.b;
                        if ((n8 = (int)(uR2$i.g(string2.charAt(n8)) ? 1 : 0)) != 0) break;
                        uR2$i.b = n8 = uR2$i.b + n4;
                    }
                    n4 = uR2$i.b;
                    String string3 = string2.substring(n7, n4);
                    uR2$i.b = n7;
                    ((StringBuilder)object2).append(string3);
                    object2 = ((StringBuilder)object2).toString();
                    object = new SAXException((String)object2);
                    throw object;
                }
                object3 = uR2$i.n();
                if (object3 == null) {
                    object3 = rR2$d0.px;
                }
                rR2$p rR2$p = new rR2$p(f5, (rR2$d0)((Object)object3));
                ((ArrayList)object2).add(rR2$p);
                uR2$i.p();
            }
            return object2;
        }
        object = new SAXException("Invalid length list (empty string)");
        throw object;
    }

    public static rR2$p v(uR2$i object) {
        String string2 = "auto";
        boolean bl2 = ((uR2$i)object).e(string2);
        if (bl2) {
            object = new rR2$p(0.0f);
            return object;
        }
        return ((uR2$i)object).j();
    }

    public static Float w(String string2) {
        float f5;
        block4: {
            try {
                f5 = uR2.q(string2);
                float f6 = 0.0f;
                float f7 = f5 - 0.0f;
                Object object = f7 == 0.0f ? 0 : (f7 < 0.0f ? -1 : 1);
                if (object < 0) {
                    f5 = 0.0f;
                    string2 = null;
                    break block4;
                }
                f6 = 1.0f;
                float f8 = f5 - f6;
                object = f8 == 0.0f ? 0 : (f8 > 0.0f ? 1 : -1);
                if (object <= 0) break block4;
                f5 = 1.0f;
            }
            catch (SVGParseException sVGParseException) {
                return null;
            }
        }
        return Float.valueOf(f5);
    }

    public static rR2$O x(String object) {
        Object object2 = "currentColor";
        String string2 = "none";
        String string3 = "url(";
        boolean n3 = ((String)object).startsWith(string3);
        rR2$O rR2$O = rR2$f.c;
        rr2$g_0 rr2$g_0 = rr2$g_0.a;
        rR2$O rR2$O2 = null;
        if (n3) {
            string3 = ")";
            int n4 = ((String)object).indexOf(string3);
            int n7 = -1;
            int n8 = 4;
            if (n4 != n7) {
                String string4 = ((String)object).substring(n8, n4).trim();
                int n14 = n4 + 1;
                n14 = ((String)(object = ((String)object).substring(n14).trim())).length();
                if (n14 > 0) {
                    boolean bl2 = ((String)object).equals(string2);
                    if (!bl2) {
                        boolean bl3 = ((String)object).equals(object2);
                        if (!bl3) {
                            try {
                                rR2$O = uR2.o((String)object);
                            }
                            catch (SVGParseException sVGParseException) {
                                rR2$O = null;
                            }
                        } else {
                            rR2$O = rr2$g_0;
                        }
                    }
                    rR2$O2 = rR2$O;
                }
                object = new rR2$u(string4, rR2$O2);
                return object;
            }
            object = ((String)object).substring(n8).trim();
            object2 = new rR2$u((String)object, null);
            return object2;
        }
        boolean bl4 = ((String)object).equals(string2);
        if (!bl4) {
            boolean bl5 = ((String)object).equals(object2);
            if (!bl5) {
                try {
                    rR2$O = uR2.o((String)object);
                }
                catch (SVGParseException sVGParseException) {
                    rR2$O = null;
                }
            } else {
                rR2$O = rr2$g_0;
            }
        }
        return rR2$O;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public static void y(rr2$p_0 object, String object2) {
        void var1_6;
        void var3_10;
        Object object3 = new uR2$i((String)object2);
        ((uR2$i)object3).q();
        String string2 = ((uR2$i)object3).l();
        Object object4 = "defer";
        boolean bl2 = ((String)object4).equals(string2);
        if (bl2) {
            ((uR2$i)object3).q();
            String string3 = ((uR2$i)object3).l();
        }
        object4 = uR2$b.a;
        By2$a by2$a = (By2$a)((Object)((HashMap)object4).get(var3_10));
        ((uR2$i)object3).q();
        bl2 = ((uR2$i)object3).f();
        if (!bl2) {
            object3 = ((uR2$i)object3).l();
            object3.getClass();
            object4 = "meet";
            bl2 = ((String)object3).equals(object4);
            if (!bl2) {
                object4 = "slice";
                boolean bl3 = ((String)object3).equals(object4);
                if (!bl3) {
                    String string4 = "Invalid preserveAspectRatio definition: ".concat((String)object2);
                    object = new SAXException(string4);
                    throw object;
                }
                By2$b by2$b = By2$b.slice;
            } else {
                By2$b by2$b = By2$b.meet;
            }
        } else {
            Object var1_5 = null;
        }
        ((rr2$p_0)object).o = object3 = new By2(by2$a, (By2$b)var1_6);
    }

    public static HashMap z(uR2$i uR2$i) {
        HashMap<String, String> hashMap = new HashMap<String, String>();
        uR2$i.q();
        char c2 = '=';
        String string2 = uR2$i.m(false, c2);
        while (string2 != null) {
            uR2$i.d(c2);
            String string3 = uR2$i.k();
            hashMap.put(string2, string3);
            uR2$i.q();
            string2 = uR2$i.m(false, c2);
        }
        return hashMap;
    }

    public final void B(InputStream inputStream) {
        ParserConfigurationException parserConfigurationException2;
        Object object;
        block15: {
            SAXException sAXException2;
            block14: {
                object = SAXParserFactory.newInstance();
                Object object2 = "http://xml.org/sax/features/external-general-entities";
                String string2 = null;
                ((SAXParserFactory)object).setFeature((String)object2, false);
                object2 = "http://xml.org/sax/features/external-parameter-entities";
                ((SAXParserFactory)object).setFeature((String)object2, false);
                object = ((SAXParserFactory)object).newSAXParser();
                object = ((SAXParser)object).getXMLReader();
                object2 = new uR2$f(this);
                object.setContentHandler((ContentHandler)object2);
                string2 = "http://xml.org/sax/properties/lexical-handler";
                object.setProperty(string2, object2);
                object2 = new InputSource(inputStream);
                try {
                    object.parse((InputSource)object2);
                    return;
                }
                catch (IOException iOException) {
                }
                catch (SAXException sAXException2) {
                    break block14;
                }
                catch (ParserConfigurationException parserConfigurationException2) {
                    break block15;
                }
                object = new SAXException("Stream error", iOException);
                throw object;
            }
            object = new SAXException("SVG parse error", sAXException2);
            throw object;
        }
        object = new SAXException("XML parser problem", parserConfigurationException2);
        throw object;
    }

    /*
     * Exception decompiling
     */
    public final void C(InputStream var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 9[TRYBLOCK] [21, 20 : 177->181)] java.io.IOException
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op02WithProcessedDataAndRefs.insertExceptionBlocks(Op02WithProcessedDataAndRefs.java:2283)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:415)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void D(Attributes attributes) {
        uR2 uR22 = this;
        Object object = attributes;
        Object object2 = this.b;
        if (object2 == null) {
            object = new SAXException("Invalid document. Root element must be <svg>");
            throw object;
        }
        object2 = new rR2$v();
        Object object3 = this.a;
        ((rR2$N)object2).a = object3;
        ((rR2$N)object2).b = object3 = this.b;
        uR2.h((rR2$L)object2, attributes);
        uR2.k((rR2$L)object2, attributes);
        uR2.m((rr2$n_0)object2, attributes);
        uR2.g((rR2$G)object2, attributes);
        int n3 = 0;
        float f5 = 0.0f;
        object3 = null;
        int n4 = 0;
        while (true) {
            block31: {
                Object object4;
                block32: {
                    int n7;
                    String string2;
                    int n8;
                    Object object5;
                    block30: {
                        float f6;
                        float f7;
                        int n10;
                        if (n4 >= (n10 = attributes.getLength())) {
                            uR22.b.g((rR2$N)object2);
                            return;
                        }
                        object4 = object.getValue(n4).trim();
                        object5 = uR2$a.b;
                        n8 = tR2.a((Attributes)object, n4);
                        int n14 = object5[n8];
                        n8 = 0;
                        string2 = null;
                        n7 = 8;
                        if (n14 == n7) break block30;
                        n7 = 9;
                        if (n14 == n7 && (n10 = (int)((f7 = (f6 = uR2.q((String)object4)) - 0.0f) == 0.0f ? 0 : (f7 < 0.0f ? -1 : 1))) < 0) {
                            object = new SAXException("Invalid <path> element. pathLength cannot be negative");
                            throw object;
                        }
                        break block31;
                    }
                    object5 = new uR2$i;
                    ((uR2$i)object5)((String)object4);
                    object4 = new Object();
                    ((rR2$w)object4).b = 0;
                    ((rR2$w)object4).d = 0;
                    Object object6 = new byte[n7];
                    ((rR2$w)object4).a = object6;
                    object6 = new float[16];
                    ((rR2$w)object4).c = (float[])object6;
                    n7 = (int)(((uR2$i)object5).f() ? 1 : 0);
                    if (n7 != 0) break block32;
                    object6 = ((uR2$i)object5).h();
                    n7 = (Integer)object6;
                    int n15 = 77;
                    float f8 = 1.08E-43f;
                    int n16 = 109;
                    float f11 = 1.53E-43f;
                    if (n7 != n15 && n7 != n16) break block32;
                    n15 = 0;
                    f8 = 0.0f;
                    float f12 = 0.0f;
                    float f14 = 0.0f;
                    float f15 = 0.0f;
                    float f16 = 0.0f;
                    float f17 = 0.0f;
                    block13: while (true) {
                        block33: {
                            ((uR2$i)object5).q();
                            int n17 = 108;
                            float f18 = 1.51E-43f;
                            float f19 = 2.0f;
                            switch (n7) {
                                default: {
                                    break block13;
                                }
                                case 90: 
                                case 122: {
                                    ((rR2$w)object4).close();
                                    f8 = f16;
                                    f12 = f16;
                                    f14 = f17;
                                    break;
                                }
                                case 86: 
                                case 118: {
                                    f15 = ((uR2$i)object5).i();
                                    n17 = (int)(Float.isNaN(f15) ? 1 : 0);
                                    if (n17 != 0) break block13;
                                    n17 = 118;
                                    f18 = 1.65E-43f;
                                    if (n7 == n17) {
                                        f15 += f14;
                                    }
                                    f14 = f15;
                                    ((rR2$w)object4).d(f8, f15);
                                    break;
                                }
                                case 84: 
                                case 116: {
                                    f12 = f8 * f19 - f12;
                                    f15 = f19 * f14 - f15;
                                    f18 = ((uR2$i)object5).i();
                                    f19 = ((uR2$i)object5).c(f18);
                                    boolean bl2 = Float.isNaN(f19);
                                    if (bl2) break block13;
                                    n3 = 116;
                                    f5 = 1.63E-43f;
                                    if (n7 == n3) {
                                        f18 += f8;
                                        f19 += f14;
                                    }
                                    f8 = f18;
                                    f14 = f19;
                                    ((rR2$w)object4).b(f12, f15, f18, f19);
                                    break block33;
                                }
                                case 83: 
                                case 115: {
                                    f12 = f8 * f19 - f12;
                                    f5 = (f19 *= f14) - f15;
                                    f15 = ((uR2$i)object5).i();
                                    f18 = ((uR2$i)object5).c(f15);
                                    float f20 = ((uR2$i)object5).c(f18);
                                    float f22 = ((uR2$i)object5).c(f20);
                                    boolean bl3 = Float.isNaN(f22);
                                    if (bl3) break block13;
                                    n16 = 115;
                                    f11 = 1.61E-43f;
                                    if (n7 == n16) {
                                        f20 += f8;
                                        f22 += f14;
                                        f15 += f8;
                                        f18 += f14;
                                    }
                                    float f23 = f15;
                                    float f24 = f22;
                                    f22 = f20;
                                    f14 = f5;
                                    n3 = 109;
                                    f5 = 1.53E-43f;
                                    f11 = f24;
                                    ((rR2$w)object4).c(f12, f14, f15, f18, f20, f24);
                                    f8 = f20;
                                    f12 = f15;
                                    f14 = f24;
                                    f15 = f18;
                                    break block33;
                                }
                                case 81: 
                                case 113: {
                                    n3 = 109;
                                    f5 = 1.53E-43f;
                                    f12 = ((uR2$i)object5).i();
                                    f15 = ((uR2$i)object5).c(f12);
                                    f18 = ((uR2$i)object5).c(f15);
                                    float f20 = ((uR2$i)object5).c(f18);
                                    n16 = (int)(Float.isNaN(f20) ? 1 : 0);
                                    if (n16 != 0) break block13;
                                    n16 = 113;
                                    f11 = 1.58E-43f;
                                    if (n7 == n16) {
                                        f18 += f8;
                                        f20 += f14;
                                        f12 += f8;
                                        f15 += f14;
                                    }
                                    f8 = f18;
                                    f14 = f20;
                                    ((rR2$w)object4).b(f12, f15, f18, f20);
                                    break block33;
                                }
                                case 77: 
                                case 109: {
                                    n3 = 109;
                                    f5 = 1.53E-43f;
                                    f12 = ((uR2$i)object5).i();
                                    f15 = ((uR2$i)object5).c(f12);
                                    boolean bl4 = Float.isNaN(f15);
                                    if (bl4) break block13;
                                    if (n7 == n3 && (bl4 = ((rR2$w)object4).b)) {
                                        f12 += f8;
                                        f15 += f14;
                                    }
                                    f8 = f12;
                                    f14 = f15;
                                    ((rR2$w)object4).a(f12, f15);
                                    if (n7 != n3) {
                                        n17 = 76;
                                        f18 = 1.06E-43f;
                                    }
                                    f12 = f8;
                                    f16 = f8;
                                    f15 = f14;
                                    f17 = f14;
                                    n7 = n17;
                                    break block33;
                                }
                                case 76: 
                                case 108: {
                                    n3 = 109;
                                    f5 = 1.53E-43f;
                                    f12 = ((uR2$i)object5).i();
                                    f15 = ((uR2$i)object5).c(f12);
                                    boolean bl4 = Float.isNaN(f15);
                                    if (bl4) break block13;
                                    if (n7 == n17) {
                                        f12 += f8;
                                        f15 += f14;
                                    }
                                    f8 = f12;
                                    f14 = f15;
                                    ((rR2$w)object4).d(f12, f15);
                                    break;
                                }
                                case 72: 
                                case 104: {
                                    n3 = 109;
                                    f5 = 1.53E-43f;
                                    f12 = ((uR2$i)object5).i();
                                    n17 = (int)(Float.isNaN(f12) ? 1 : 0);
                                    if (n17 != 0) break block13;
                                    n17 = 104;
                                    f18 = 1.46E-43f;
                                    if (n7 == n17) {
                                        f12 += f8;
                                    }
                                    f8 = f12;
                                    ((rR2$w)object4).d(f12, f14);
                                    break block33;
                                }
                                case 67: 
                                case 99: {
                                    n3 = 109;
                                    f5 = 1.53E-43f;
                                    f12 = ((uR2$i)object5).i();
                                    f15 = ((uR2$i)object5).c(f12);
                                    f18 = ((uR2$i)object5).c(f15);
                                    float f20 = ((uR2$i)object5).c(f18);
                                    f11 = ((uR2$i)object5).c(f20);
                                    f19 = ((uR2$i)object5).c(f11);
                                    int n18 = Float.isNaN(f19);
                                    if (n18 != 0) break block13;
                                    n3 = 99;
                                    f5 = 1.39E-43f;
                                    if (n7 == n3) {
                                        f11 += f8;
                                        f19 += f14;
                                        f12 += f8;
                                        f15 += f14;
                                        f18 += f8;
                                        f20 += f14;
                                    }
                                    f14 = f15;
                                    float f23 = f20;
                                    f5 = f11;
                                    float f22 = f19;
                                    f19 = f18;
                                    f15 = f18;
                                    f18 = f20;
                                    f20 = f11;
                                    f11 = f22;
                                    ((rR2$w)object4).c(f12, f14, f19, f23, f5, f22);
                                    f8 = f5;
                                    f12 = f19;
                                    f14 = f22;
                                    f15 = f23;
                                    break block33;
                                }
                                case 65: 
                                case 97: {
                                    float f25;
                                    float f26;
                                    f12 = ((uR2$i)object5).i();
                                    f5 = ((uR2$i)object5).c(f12);
                                    f15 = ((uR2$i)object5).c(f5);
                                    Constable constable = Float.valueOf(f15);
                                    constable = ((uR2$i)object5).b(constable);
                                    Boolean bl5 = ((uR2$i)object5).b(constable);
                                    if (bl5 == null) {
                                        n16 = 2143289344;
                                        f11 = 0.0f / 0.0f;
                                    } else {
                                        ((uR2$i)object5).p();
                                        f11 = ((uR2$i)object5).i();
                                    }
                                    f19 = ((uR2$i)object5).c(f11);
                                    int n18 = Float.isNaN(f19);
                                    if (n18 != 0 || (n18 = (f26 = f12 - 0.0f) == 0.0f ? 0 : (f26 < 0.0f ? -1 : 1)) < 0 || (n18 = (int)((f25 = f5 - 0.0f) == 0.0f ? 0 : (f25 < 0.0f ? -1 : 1))) < 0) break block13;
                                    n8 = 97;
                                    if (n7 == n8) {
                                        f11 += f8;
                                        f19 += f14;
                                    }
                                    float f23 = f19;
                                    n17 = (int)(((Boolean)constable).booleanValue() ? 1 : 0);
                                    boolean bl4 = bl5;
                                    f14 = f5;
                                    ((rR2$w)object4).e(f12, f5, f15, n17 != 0, bl4, f11, f19);
                                    f8 = f11;
                                    f12 = f11;
                                    f14 = f19;
                                }
                            }
                            f15 = f14;
                        }
                        ((uR2$i)object5).p();
                        n3 = (int)(((uR2$i)object5).f() ? 1 : 0);
                        if (n3 != 0) break;
                        n3 = ((uR2$i)object5).b;
                        n8 = ((uR2$i)object5).c;
                        if (n3 != n8 && ((n3 = (int)(string2 = ((uR2$i)object5).a).charAt(n3)) >= (n8 = 97) && n3 <= (n8 = 122) || n3 >= (n8 = 65) && n3 <= (n8 = 90))) {
                            object3 = ((uR2$i)object5).h();
                            n7 = (Integer)object3;
                        }
                        n3 = 0;
                        f5 = 0.0f;
                        object3 = null;
                        n8 = 0;
                        string2 = null;
                        n16 = 109;
                        f11 = 1.53E-43f;
                    }
                }
                ((rR2$v)object2).o = object4;
            }
            ++n4;
            n3 = 0;
            f5 = 0.0f;
            object3 = null;
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final void F(String var1_1, String var2_2, String var3_3, Attributes var4_4) {
        var5_5 = this;
        var6_6 = var1_1;
        var7_8 = var4_4;
        var8_9 = this.c;
        var9_10 = 1;
        if (var8_9 != 0) {
            this.d = var10_11 = this.d + var9_10;
            return;
        }
        var11_13 /* !! */  = "http://www.w3.org/2000/svg";
        var8_9 = var11_13 /* !! */ .equals(var1_1);
        var12_14 = "";
        if (var8_9 == 0 && (var10_12 = (int)var12_14.equals(var1_1)) == 0) {
            return;
        }
        var10_12 = var2_2.length();
        var6_6 = var10_12 > 0 ? var2_2 : var3_3;
        var6_6 = uR2$h.fromString((String)var6_6);
        var11_13 /* !! */  = uR2$a.a;
        var13_15 /* !! */  = var6_6.ordinal();
        var8_9 = var11_13 /* !! */ [var13_15 /* !! */ ];
        var14_16 = "Invalid <use> element. width cannot be negative";
        var15_17 = "Invalid <use> element. height cannot be negative";
        var16_18 = "objectBoundingBox";
        var17_19 = "userSpaceOnUse";
        var18_20 = "http://www.w3.org/1999/xlink";
        var19_21 = 6;
        var20_22 = 4;
        var21_23 = 3;
        var22_24 = 2;
        var23_25 = "Invalid document. Root element must be <svg>";
        block2 : switch (var8_9 ? 1 : 0) {
            default: {
                var5_5.c = var9_10;
                var5_5.d = var9_10;
                break;
            }
            case 31: {
                var6_6 = var5_5.b;
                if (var6_6 != null) {
                    var6_6 = new rr2$c_0();
                    var6_6.a = var11_13 /* !! */  = var5_5.a;
                    var6_6.b = var11_13 /* !! */  = var5_5.b;
                    uR2.h((rR2$L)var6_6, (Attributes)var7_8);
                    uR2.k((rR2$L)var6_6, (Attributes)var7_8);
                    var7_8 = var5_5.b;
                    var7_8.g((rR2$N)var6_6);
                    var5_5.b = var6_6;
                    break;
                }
                var6_6 = new SAXException(var23_25);
                throw var6_6;
            }
            case 30: {
                var6_6 = var5_5.b;
                if (var6_6 != null) {
                    var6_6 = "all";
                    var8_9 = 1;
                    var23_25 = null;
                    for (var24_26 = 0; var24_26 < (var25_41 = var4_4.getLength()); ++var24_26) {
                        var12_14 = var7_8.getValue(var24_26).trim();
                        var14_16 = uR2$a.b;
                        var26_53 = tR2.a((Attributes)var7_8, var24_26);
                        var13_15 /* !! */  = (int)var14_16[var26_53];
                        if (var13_15 /* !! */  != (var26_53 = 88)) {
                            var26_53 = 89;
                            if (var13_15 /* !! */  != var26_53) continue;
                            var6_6 = var12_14;
                            continue;
                        }
                        var11_13 /* !! */  = "text/css";
                        var8_9 = (int)var12_14.equals(var11_13 /* !! */ );
                    }
                    if (var8_9 != 0) {
                        var7_8 = CH$f.screen;
                        var11_13 /* !! */  = new CH$d((String)var6_6);
                        var11_13 /* !! */ .q();
                        var6_6 = CH.c((CH$d)var11_13 /* !! */ ).iterator();
                        while ((var8_9 = var6_6.hasNext()) != 0) {
                            var11_13 /* !! */  = (CH$f)var6_6.next();
                            if (var11_13 /* !! */  != (var12_14 = CH$f.all) && var11_13 /* !! */  != var7_8) continue;
                            var5_5.h = var9_10;
                            break block2;
                        }
                    }
                    var5_5.c = var9_10;
                    var5_5.d = var9_10;
                    break;
                }
                var6_6 = new SAXException(var23_25);
                throw var6_6;
            }
            case 29: {
                var6_6 = var5_5.b;
                if (var6_6 != null) {
                    var6_6 = new rR2$s();
                    var6_6.a = var11_13 /* !! */  = var5_5.a;
                    var6_6.b = var11_13 /* !! */  = var5_5.b;
                    uR2.h((rR2$L)var6_6, (Attributes)var7_8);
                    uR2.k((rR2$L)var6_6, (Attributes)var7_8);
                    uR2.g((rR2$G)var6_6, (Attributes)var7_8);
                    var23_25 = null;
                    for (var24_27 = 0; var24_27 < (var8_9 = var4_4.getLength()); ++var24_27) {
                        var11_13 /* !! */  = var7_8.getValue(var24_27).trim();
                        var12_14 = uR2$a.b;
                        var13_15 /* !! */  = tR2.a((Attributes)var7_8, var24_27);
                        var25_42 /* !! */  = var12_14[var13_15 /* !! */ ];
                        if (var25_42 /* !! */  != var9_10) {
                            if (var25_42 /* !! */  != var22_24) {
                                if (var25_42 /* !! */  != var21_23) {
                                    if (var25_42 /* !! */  != var20_22) {
                                        var13_15 /* !! */  = 43;
                                        var27_57 = 6.0E-44f;
                                        if (var25_42 /* !! */  != var13_15 /* !! */ ) {
                                            var13_15 /* !! */  = 44;
                                            var27_57 = 6.2E-44f;
                                            if (var25_42 /* !! */  != var13_15 /* !! */ ) continue;
                                            var25_42 /* !! */  = (String)var16_18.equals(var11_13 /* !! */ );
                                            if (var25_42 /* !! */  != false) {
                                                var6_6.p = var11_13 /* !! */  = Boolean.FALSE;
                                                continue;
                                            }
                                            var8_9 = (int)var17_19.equals(var11_13 /* !! */ );
                                            if (var8_9 != 0) {
                                                var6_6.p = var11_13 /* !! */  = Boolean.TRUE;
                                                continue;
                                            }
                                            var6_6 = new SAXException("Invalid value for attribute maskContentUnits");
                                            throw var6_6;
                                        }
                                        var25_42 /* !! */  = (String)var16_18.equals(var11_13 /* !! */ );
                                        if (var25_42 /* !! */  != false) {
                                            var6_6.o = var11_13 /* !! */  = Boolean.FALSE;
                                            continue;
                                        }
                                        var8_9 = (int)var17_19.equals(var11_13 /* !! */ );
                                        if (var8_9 != 0) {
                                            var6_6.o = var11_13 /* !! */  = Boolean.TRUE;
                                            continue;
                                        }
                                        var6_6 = new SAXException("Invalid value for attribute maskUnits");
                                        throw var6_6;
                                    }
                                    var11_13 /* !! */  = uR2.t((String)var11_13 /* !! */ );
                                    var6_6.r = var11_13 /* !! */ ;
                                    var8_9 = (int)var11_13 /* !! */ .i();
                                    if (var8_9 == 0) continue;
                                    var6_6 = new SAXException("Invalid <mask> element. height cannot be negative");
                                    throw var6_6;
                                }
                                var11_13 /* !! */  = uR2.t((String)var11_13 /* !! */ );
                                var6_6.q = var11_13 /* !! */ ;
                                var8_9 = (int)var11_13 /* !! */ .i();
                                if (var8_9 == 0) continue;
                                var6_6 = new SAXException("Invalid <mask> element. width cannot be negative");
                                throw var6_6;
                            }
                            uR2.t((String)var11_13 /* !! */ );
                            continue;
                        }
                        uR2.t((String)var11_13 /* !! */ );
                    }
                    var7_8 = var5_5.b;
                    var7_8.g((rR2$N)var6_6);
                    var5_5.b = var6_6;
                    break;
                }
                var6_6 = new SAXException(var23_25);
                throw var6_6;
            }
            case 28: {
                var6_6 = var5_5.b;
                if (var6_6 != null) {
                    var6_6 = new rR2$f0();
                    var6_6.a = var11_13 /* !! */  = var5_5.a;
                    var6_6.b = var11_13 /* !! */  = var5_5.b;
                    uR2.h((rR2$L)var6_6, (Attributes)var7_8);
                    uR2.g((rR2$G)var6_6, (Attributes)var7_8);
                    uR2.n((rR2$R)var6_6, (Attributes)var7_8);
                    var7_8 = var5_5.b;
                    var7_8.g((rR2$N)var6_6);
                    var5_5.b = var6_6;
                    break;
                }
                var6_6 = new SAXException(var23_25);
                throw var6_6;
            }
            case 27: {
                var6_6 = var5_5.b;
                if (var6_6 != null) {
                    var6_6 = new rr2$o_0();
                    var6_6.a = var11_13 /* !! */  = var5_5.a;
                    var6_6.b = var11_13 /* !! */  = var5_5.b;
                    uR2.h((rR2$L)var6_6, (Attributes)var7_8);
                    uR2.k((rR2$L)var6_6, (Attributes)var7_8);
                    uR2.m((rr2$n_0)var6_6, (Attributes)var7_8);
                    uR2.g((rR2$G)var6_6, (Attributes)var7_8);
                    var23_25 = null;
                    for (var24_28 = 0; var24_28 < (var8_9 = var4_4.getLength()); ++var24_28) {
                        var11_13 /* !! */  = var7_8.getValue(var24_28).trim();
                        var16_18 = uR2$a.b;
                        var28_61 = tR2.a((Attributes)var7_8, var24_28);
                        var29_64 /* !! */  = var16_18[var28_61];
                        if (var29_64 /* !! */  != var9_10) {
                            if (var29_64 /* !! */  != var22_24) {
                                if (var29_64 /* !! */  != var21_23) {
                                    if (var29_64 /* !! */  != var20_22) {
                                        if (var29_64 /* !! */  != var19_21) {
                                            var28_61 = 7;
                                            if (var29_64 /* !! */  != var28_61) continue;
                                            uR2.y((rr2$p_0)var6_6, (String)var11_13 /* !! */ );
                                            continue;
                                        }
                                        var16_18 = var7_8.getURI(var24_28);
                                        var29_64 /* !! */  = var12_14.equals(var16_18);
                                        if (var29_64 /* !! */  == false && (var29_64 /* !! */  = (Object)var18_20.equals(var16_18 = var7_8.getURI(var24_28))) == false) continue;
                                        var6_6.p = var11_13 /* !! */ ;
                                        continue;
                                    }
                                    var6_6.t = var11_13 /* !! */  = uR2.t((String)var11_13 /* !! */ );
                                    var8_9 = (int)var11_13 /* !! */ .i();
                                    if (var8_9 == 0) continue;
                                    var6_6 = new SAXException(var15_17);
                                    throw var6_6;
                                }
                                var6_6.s = var11_13 /* !! */  = uR2.t((String)var11_13 /* !! */ );
                                var8_9 = (int)var11_13 /* !! */ .i();
                                if (var8_9 == 0) continue;
                                var6_6 = new SAXException((String)var14_16);
                                throw var6_6;
                            }
                            var11_13 /* !! */  = uR2.t((String)var11_13 /* !! */ );
                            var6_6.r = var11_13 /* !! */ ;
                            continue;
                        }
                        var11_13 /* !! */  = uR2.t((String)var11_13 /* !! */ );
                        var6_6.q = var11_13 /* !! */ ;
                    }
                    var7_8 = var5_5.b;
                    var7_8.g((rR2$N)var6_6);
                    var5_5.b = var6_6;
                    break;
                }
                var6_6 = new SAXException(var23_25);
                throw var6_6;
            }
            case 26: {
                var6_6 = var5_5.b;
                if (var6_6 != null) {
                    var6_6 = new rr2$y_0();
                    var6_6.a = var11_13 /* !! */  = var5_5.a;
                    var6_6.b = var11_13 /* !! */  = var5_5.b;
                    uR2.h((rR2$L)var6_6, (Attributes)var7_8);
                    uR2.k((rR2$L)var6_6, (Attributes)var7_8);
                    uR2.g((rR2$G)var6_6, (Attributes)var7_8);
                    uR2.n((rR2$R)var6_6, (Attributes)var7_8);
                    var23_25 = null;
                    block79: for (var24_29 = 0; var24_29 < (var8_9 = var4_4.getLength()); ++var24_29) {
                        var11_13 /* !! */  = var7_8.getValue(var24_29).trim();
                        var14_16 = uR2$a.b;
                        var26_54 = tR2.a((Attributes)var7_8, var24_29);
                        var13_15 /* !! */  = (int)var14_16[var26_54];
                        if (var13_15 /* !! */  != var9_10) {
                            if (var13_15 /* !! */  != var22_24) {
                                if (var13_15 /* !! */  != var21_23) {
                                    if (var13_15 /* !! */  != var20_22) {
                                        if (var13_15 /* !! */  != var19_21) {
                                            switch (var13_15 /* !! */ ) {
                                                default: {
                                                    continue block79;
                                                }
                                                case 42: {
                                                    var11_13 /* !! */  = uR2.A((String)var11_13 /* !! */ );
                                                    var6_6.s = var11_13 /* !! */ ;
                                                    continue block79;
                                                }
                                                case 41: {
                                                    var13_15 /* !! */  = (int)var16_18.equals(var11_13 /* !! */ );
                                                    if (var13_15 /* !! */  != 0) {
                                                        var6_6.r = var11_13 /* !! */  = Boolean.FALSE;
                                                        continue block79;
                                                    }
                                                    var8_9 = (int)var17_19.equals(var11_13 /* !! */ );
                                                    if (var8_9 != 0) {
                                                        var6_6.r = var11_13 /* !! */  = Boolean.TRUE;
                                                        continue block79;
                                                    }
                                                    var6_6 = new SAXException("Invalid value for attribute patternContentUnits");
                                                    throw var6_6;
                                                }
                                                case 40: {
                                                    var13_15 /* !! */  = (int)var16_18.equals(var11_13 /* !! */ );
                                                    if (var13_15 /* !! */  != 0) {
                                                        var6_6.q = var11_13 /* !! */  = Boolean.FALSE;
                                                        continue block79;
                                                    }
                                                    var8_9 = (int)var17_19.equals(var11_13 /* !! */ );
                                                    if (var8_9 != 0) {
                                                        var6_6.q = var11_13 /* !! */  = Boolean.TRUE;
                                                        continue block79;
                                                    }
                                                    var6_6 = new SAXException("Invalid value for attribute patternUnits");
                                                    throw var6_6;
                                                }
                                            }
                                        }
                                        var14_16 = var7_8.getURI(var24_29);
                                        var13_15 /* !! */  = (int)var12_14.equals(var14_16);
                                        if (var13_15 /* !! */  == 0 && (var13_15 /* !! */  = (int)var18_20.equals(var14_16 = var7_8.getURI(var24_29))) == 0) continue;
                                        var6_6.x = var11_13 /* !! */ ;
                                        continue;
                                    }
                                    var6_6.w = var11_13 /* !! */  = uR2.t((String)var11_13 /* !! */ );
                                    var8_9 = (int)var11_13 /* !! */ .i();
                                    if (var8_9 == 0) continue;
                                    var6_6 = new SAXException("Invalid <pattern> element. height cannot be negative");
                                    throw var6_6;
                                }
                                var6_6.v = var11_13 /* !! */  = uR2.t((String)var11_13 /* !! */ );
                                var8_9 = (int)var11_13 /* !! */ .i();
                                if (var8_9 == 0) continue;
                                var6_6 = new SAXException("Invalid <pattern> element. width cannot be negative");
                                throw var6_6;
                            }
                            var11_13 /* !! */  = uR2.t((String)var11_13 /* !! */ );
                            var6_6.u = var11_13 /* !! */ ;
                            continue;
                        }
                        var11_13 /* !! */  = uR2.t((String)var11_13 /* !! */ );
                        var6_6.t = var11_13 /* !! */ ;
                    }
                    var7_8 = var5_5.b;
                    var7_8.g((rR2$N)var6_6);
                    var5_5.b = var6_6;
                    break;
                }
                var6_6 = new SAXException(var23_25);
                throw var6_6;
            }
            case 25: {
                var6_6 = var5_5.b;
                if (var6_6 != null) {
                    var6_6 = new rR2$Z();
                    var6_6.a = var11_13 /* !! */  = var5_5.a;
                    var6_6.b = var11_13 /* !! */  = var5_5.b;
                    uR2.h((rR2$L)var6_6, (Attributes)var7_8);
                    uR2.k((rR2$L)var6_6, (Attributes)var7_8);
                    uR2.g((rR2$G)var6_6, (Attributes)var7_8);
                    var23_25 = null;
                    for (var24_30 = 0; var24_30 < (var8_9 = var4_4.getLength()); ++var24_30) {
                        var11_13 /* !! */  = var7_8.getValue(var24_30).trim();
                        var30_74 /* !! */  = uR2$a.b;
                        var13_15 /* !! */  = tR2.a((Attributes)var7_8, var24_30);
                        var9_10 = var30_74 /* !! */ [var13_15 /* !! */ ];
                        if (var9_10 != var19_21) {
                            var13_15 /* !! */  = 39;
                            var27_58 = 5.5E-44f;
                            if (var9_10 != var13_15 /* !! */ ) continue;
                            var11_13 /* !! */  = uR2.t((String)var11_13 /* !! */ );
                            var6_6.p = var11_13 /* !! */ ;
                            continue;
                        }
                        var30_74 /* !! */  = (int[])var7_8.getURI(var24_30);
                        var9_10 = (int)var12_14.equals(var30_74 /* !! */ );
                        if (var9_10 == 0 && (var9_10 = (int)var18_20.equals(var30_74 /* !! */  = (int[])var7_8.getURI(var24_30))) == 0) continue;
                        var6_6.o = var11_13 /* !! */ ;
                    }
                    var5_5.b.g((rR2$N)var6_6);
                    var5_5.b = var6_6;
                    var7_8 = var6_6.b;
                    var8_9 = var7_8 instanceof rR2$b0;
                    if (var8_9 != 0) {
                        var6_6.q = var7_8 = (rR2$b0)var7_8;
                        break;
                    }
                    var6_6.q = var7_8 = ((rR2$X)var7_8).d();
                    break;
                }
                var6_6 = new SAXException(var23_25);
                throw var6_6;
            }
            case 24: {
                var6_6 = var5_5.b;
                if (var6_6 != null) {
                    var6_6 = new rr2$e_0();
                    var6_6.a = var11_13 /* !! */  = var5_5.a;
                    var6_6.b = var11_13 /* !! */  = var5_5.b;
                    uR2.h((rR2$L)var6_6, (Attributes)var7_8);
                    uR2.k((rR2$L)var6_6, (Attributes)var7_8);
                    uR2.m((rr2$n_0)var6_6, (Attributes)var7_8);
                    uR2.g((rR2$G)var6_6, (Attributes)var7_8);
                    var23_25 = null;
                    for (var24_31 = 0; var24_31 < (var8_9 = var4_4.getLength()); ++var24_31) {
                        var11_13 /* !! */  = var7_8.getValue(var24_31).trim();
                        var30_75 = uR2$a.b;
                        var25_43 = tR2.a((Attributes)var7_8, var24_31);
                        var9_10 = var30_75[var25_43];
                        var25_43 = 38;
                        var31_82 = 5.3E-44f;
                        if (var9_10 != var25_43) continue;
                        var9_10 = (int)var16_18.equals(var11_13 /* !! */ );
                        if (var9_10 != 0) {
                            var6_6.p = var11_13 /* !! */  = Boolean.FALSE;
                            continue;
                        }
                        var8_9 = (int)var17_19.equals(var11_13 /* !! */ );
                        if (var8_9 != 0) {
                            var6_6.p = var11_13 /* !! */  = Boolean.TRUE;
                            continue;
                        }
                        var6_6 = new SAXException("Invalid value for attribute clipPathUnits");
                        throw var6_6;
                    }
                    var7_8 = var5_5.b;
                    var7_8.g((rR2$N)var6_6);
                    var5_5.b = var6_6;
                    break;
                }
                var6_6 = new SAXException(var23_25);
                throw var6_6;
            }
            case 22: 
            case 23: {
                var5_5.e = var9_10;
                var5_5.f = var6_6;
                break;
            }
            case 21: {
                var6_6 = var5_5.b;
                if (var6_6 == null) ** GOTO lbl433
                var10_12 = var6_6 instanceof rr2$j_0;
                if (var10_12 == 0) ** GOTO lbl431
                var6_6 = new rR2$D();
                var6_6.a = var11_13 /* !! */  = var5_5.a;
                var6_6.b = var11_13 /* !! */  = var5_5.b;
                uR2.h((rR2$L)var6_6, (Attributes)var7_8);
                uR2.k((rR2$L)var6_6, (Attributes)var7_8);
                var11_13 /* !! */  = null;
                for (var8_9 = 0; var8_9 < (var25_44 = var4_4.getLength()); ++var8_9) {
                    var12_14 = var7_8.getValue(var8_9).trim();
                    var14_16 = uR2$a.b;
                    var26_55 = tR2.a((Attributes)var7_8, var8_9);
                    var13_15 /* !! */  = (int)var14_16[var26_55];
                    if (var13_15 /* !! */  != (var26_55 = 37)) continue;
                    var13_15 /* !! */  = var12_14.length();
                    if (var13_15 /* !! */  == 0) ** GOTO lbl425
                    var13_15 /* !! */  = var12_14.length();
                    var29_65 = var12_14.length() - var9_10;
                    if ((var29_65 = (int)var12_14.charAt(var29_65)) == var26_55) {
                        var13_15 /* !! */  += -1;
                        var26_55 = 1;
                    } else {
                        var26_55 = 0;
                        var15_17 = null;
                    }
                    try {
                        var27_59 = uR2.p(var13_15 /* !! */ , (String)var12_14);
                        var29_65 = 1120403456;
                        var32_85 = 100.0f;
                        if (var26_55 != 0) {
                            var27_59 /= var32_85;
                        }
                        var26_55 = 0;
                        var15_17 = null;
                        cfr_temp_0 = var27_59 - 0.0f;
                        var28_62 /* !! */  = (float)(cfr_temp_0 == 0.0f ? 0 : (cfr_temp_0 < 0.0f ? -1 : 1));
                        if (var28_62 /* !! */  >= 0) ** GOTO lbl419
                        var29_65 = 0;
                        var32_85 = 0.0f;
                        var16_18 = null;
                    }
lbl415:
                    // 2 sources

                    catch (NumberFormatException var6_7) {
                        var11_13 /* !! */  = "Invalid offset value in <stop>: ".concat((String)var12_14);
                        var7_8 = new SAXException((String)var11_13 /* !! */ , var6_7);
                        throw var7_8;
                    }
lbl419:
                    // 1 sources

                    var26_55 = (int)(var27_59 == var32_85 ? 0 : (var27_59 > var32_85 ? 1 : -1));
                    if (var26_55 <= 0) {
                        var32_85 = var27_59;
                    }
                    ** try [egrp 1[TRYBLOCK] [1 : 3221->3226)] { 
lbl423:
                    // 1 sources

                    var6_6.h = var12_14 = Float.valueOf(var32_85);
                    continue;
lbl425:
                    // 1 sources

                    var6_6 = new SAXException("Invalid offset value in <stop> (empty string)");
                    throw var6_6;
                }
                var7_8 = var5_5.b;
                var7_8.g((rR2$N)var6_6);
                var5_5.b = var6_6;
                break;
lbl431:
                // 1 sources

                var6_6 = new SAXException("Invalid document. <stop> elements are only valid inside <linearGradient> or <radialGradient> elements.");
                throw var6_6;
lbl433:
                // 1 sources

                var6_6 = new SAXException(var23_25);
                throw var6_6;
            }
            case 20: {
                var6_6 = var5_5.b;
                if (var6_6 != null) {
                    var6_6 = new rR2$Q();
                    var6_6.a = var11_13 /* !! */  = var5_5.a;
                    var6_6.b = var11_13 /* !! */  = var5_5.b;
                    uR2.h((rR2$L)var6_6, (Attributes)var7_8);
                    uR2.k((rR2$L)var6_6, (Attributes)var7_8);
                    uR2.i((rr2$j_0)var6_6, (Attributes)var7_8);
                    var23_25 = null;
                    for (var24_32 = 0; var24_32 < (var8_9 = var4_4.getLength()); ++var24_32) {
                        var11_13 /* !! */  = var7_8.getValue(var24_32).trim();
                        var30_76 = uR2$a.b;
                        var25_45 = tR2.a((Attributes)var7_8, var24_32);
                        var9_10 = var30_76[var25_45];
                        var25_45 = 35;
                        var31_83 = 4.9E-44f;
                        if (var9_10 != var25_45) {
                            var25_45 = 36;
                            var31_83 = 5.0E-44f;
                            if (var9_10 != var25_45) {
                                switch (var9_10) {
                                    default: {
                                        break;
                                    }
                                    case 14: {
                                        var6_6.o = var11_13 /* !! */  = uR2.t((String)var11_13 /* !! */ );
                                        var8_9 = (int)var11_13 /* !! */ .i();
                                        if (var8_9 == 0) break;
                                        var6_6 = new SAXException("Invalid <radialGradient> element. r cannot be negative");
                                        throw var6_6;
                                    }
                                    case 13: {
                                        var6_6.n = var11_13 /* !! */  = uR2.t((String)var11_13 /* !! */ );
                                        break;
                                    }
                                    case 12: {
                                        var6_6.m = var11_13 /* !! */  = uR2.t((String)var11_13 /* !! */ );
                                        break;
                                    }
                                }
                                continue;
                            }
                            var6_6.q = var11_13 /* !! */  = uR2.t((String)var11_13 /* !! */ );
                            continue;
                        }
                        var11_13 /* !! */  = uR2.t((String)var11_13 /* !! */ );
                        var6_6.p = var11_13 /* !! */ ;
                    }
                    var7_8 = var5_5.b;
                    var7_8.g((rR2$N)var6_6);
                    var5_5.b = var6_6;
                    break;
                }
                var6_6 = new SAXException(var23_25);
                throw var6_6;
            }
            case 19: {
                var6_6 = var5_5.b;
                if (var6_6 != null) {
                    var6_6 = new rR2$M();
                    var6_6.a = var11_13 /* !! */  = var5_5.a;
                    var6_6.b = var11_13 /* !! */  = var5_5.b;
                    uR2.h((rR2$L)var6_6, (Attributes)var7_8);
                    uR2.k((rR2$L)var6_6, (Attributes)var7_8);
                    uR2.i((rr2$j_0)var6_6, (Attributes)var7_8);
                    var23_25 = null;
                    block84: for (var24_33 = 0; var24_33 < (var8_9 = var4_4.getLength()); ++var24_33) {
                        var11_13 /* !! */  = var7_8.getValue(var24_33).trim();
                        var30_77 = uR2$a.b;
                        var25_46 = tR2.a((Attributes)var7_8, var24_33);
                        var9_10 = var30_77[var25_46];
                        switch (var9_10) {
                            default: {
                                continue block84;
                            }
                            case 18: {
                                var11_13 /* !! */  = uR2.t((String)var11_13 /* !! */ );
                                var6_6.p = var11_13 /* !! */ ;
                                continue block84;
                            }
                            case 17: {
                                var11_13 /* !! */  = uR2.t((String)var11_13 /* !! */ );
                                var6_6.o = var11_13 /* !! */ ;
                                continue block84;
                            }
                            case 16: {
                                var11_13 /* !! */  = uR2.t((String)var11_13 /* !! */ );
                                var6_6.n = var11_13 /* !! */ ;
                                continue block84;
                            }
                            case 15: {
                                var11_13 /* !! */  = uR2.t((String)var11_13 /* !! */ );
                                var6_6.m = var11_13 /* !! */ ;
                            }
                        }
                    }
                    var7_8 = var5_5.b;
                    var7_8.g((rR2$N)var6_6);
                    var5_5.b = var6_6;
                    break;
                }
                var6_6 = new SAXException(var23_25);
                throw var6_6;
            }
            case 18: {
                var6_6 = var5_5.b;
                if (var6_6 == null) ** GOTO lbl608
                var6_6 = new rr2$r_0();
                var6_6.a = var11_13 /* !! */  = var5_5.a;
                var6_6.b = var11_13 /* !! */  = var5_5.b;
                uR2.h((rR2$L)var6_6, (Attributes)var7_8);
                uR2.k((rR2$L)var6_6, (Attributes)var7_8);
                uR2.g((rR2$G)var6_6, (Attributes)var7_8);
                uR2.n((rR2$R)var6_6, (Attributes)var7_8);
                var11_13 /* !! */  = null;
                block85: for (var8_9 = 0; var8_9 < (var25_47 = var4_4.getLength()); ++var8_9) {
                    var12_14 = var7_8.getValue(var8_9).trim();
                    var14_16 = uR2$a.b;
                    var26_56 = tR2.a((Attributes)var7_8, var8_9);
                    var13_15 /* !! */  = (int)var14_16[var26_56];
                    switch (var13_15 /* !! */ ) lbl-1000:
                    // 3 sources

                    {
                        default: {
                            var29_66 = false;
                            var32_86 = 0.0f;
                            var16_18 = null;
                            continue block85;
                        }
                        case 31: {
                            var14_16 = "auto";
                            var13_15 /* !! */  = (int)var14_16.equals(var12_14);
                            if (var13_15 /* !! */  == 0) ** GOTO lbl553
                            var25_47 = 2143289344;
                            var31_84 = 0.0f / 0.0f;
                            var6_6.v = var12_14 = Float.valueOf(var31_84);
                            ** GOTO lbl-1000
lbl553:
                            // 1 sources

                            var31_84 = uR2.q((String)var12_14);
                            var6_6.v = var12_14 = Float.valueOf(var31_84);
                            ** GOTO lbl-1000
                        }
                        case 30: {
                            var14_16 = "strokeWidth";
                            var13_15 /* !! */  = (int)var14_16.equals(var12_14);
                            if (var13_15 /* !! */  != 0) {
                                var29_66 = false;
                                var32_86 = 0.0f;
                                var16_18 = null;
                                var6_6.q = false;
                                continue block85;
                            }
                            var29_66 = false;
                            var32_86 = 0.0f;
                            var16_18 = null;
                            var25_47 = (int)var17_19.equals(var12_14);
                            if (var25_47 != 0) {
                                var6_6.q = var9_10;
                                continue block85;
                            }
                            var6_6 = new SAXException("Invalid value for attribute markerUnits");
                            throw var6_6;
                        }
                        case 29: {
                            var29_66 = false;
                            var32_86 = 0.0f;
                            var16_18 = null;
                            var6_6.u = var12_14 = uR2.t((String)var12_14);
                            var25_47 = (int)var12_14.i();
                            if (var25_47 == 0) continue block85;
                            var6_6 = new SAXException("Invalid <marker> element. markerHeight cannot be negative");
                            throw var6_6;
                        }
                        case 28: {
                            var29_66 = false;
                            var32_86 = 0.0f;
                            var16_18 = null;
                            var6_6.t = var12_14 = uR2.t((String)var12_14);
                            var25_47 = (int)var12_14.i();
                            if (var25_47 == 0) continue block85;
                            var6_6 = new SAXException("Invalid <marker> element. markerWidth cannot be negative");
                            throw var6_6;
                        }
                        case 27: {
                            var29_66 = false;
                            var32_86 = 0.0f;
                            var16_18 = null;
                            var6_6.s = var12_14 = uR2.t((String)var12_14);
                            continue block85;
                        }
                        case 26: {
                            var29_66 = false;
                            var32_86 = 0.0f;
                            var16_18 = null;
                            var6_6.r = var12_14 = uR2.t((String)var12_14);
                        }
                    }
                }
                var7_8 = var5_5.b;
                var7_8.g((rR2$N)var6_6);
                var5_5.b = var6_6;
                break;
lbl608:
                // 1 sources

                var6_6 = new SAXException(var23_25);
                throw var6_6;
            }
            case 17: {
                var6_6 = var5_5.b;
                if (var6_6 != null) {
                    var6_6 = new rr2$t_0();
                    var6_6.a = var11_13 /* !! */  = var5_5.a;
                    var6_6.b = var11_13 /* !! */  = var5_5.b;
                    uR2.h((rR2$L)var6_6, (Attributes)var7_8);
                    uR2.k((rR2$L)var6_6, (Attributes)var7_8);
                    uR2.g((rR2$G)var6_6, (Attributes)var7_8);
                    uR2.n((rR2$R)var6_6, (Attributes)var7_8);
                    var7_8 = var5_5.b;
                    var7_8.g((rR2$N)var6_6);
                    var5_5.b = var6_6;
                    break;
                }
                var6_6 = new SAXException(var23_25);
                throw var6_6;
            }
            case 16: {
                var6_6 = var5_5.b;
                if (var6_6 != null) {
                    var6_6 = new rr2$s_0();
                    var6_6.a = var11_13 /* !! */  = var5_5.a;
                    var6_6.b = var11_13 /* !! */  = var5_5.b;
                    uR2.h((rR2$L)var6_6, (Attributes)var7_8);
                    uR2.k((rR2$L)var6_6, (Attributes)var7_8);
                    uR2.m((rr2$n_0)var6_6, (Attributes)var7_8);
                    uR2.g((rR2$G)var6_6, (Attributes)var7_8);
                    var7_8 = var5_5.b;
                    var7_8.g((rR2$N)var6_6);
                    var5_5.b = var6_6;
                    break;
                }
                var6_6 = new SAXException(var23_25);
                throw var6_6;
            }
            case 15: {
                var29_67 = false;
                var32_87 = 0.0f;
                var16_18 = null;
                var6_6 = var5_5.b;
                if (var6_6 != null) {
                    var10_12 = var6_6 instanceof rR2$Y;
                    if (var10_12 != 0) {
                        var6_6 = new rr2$u_0();
                        var6_6.a = var11_13 /* !! */  = var5_5.a;
                        var6_6.b = var11_13 /* !! */  = var5_5.b;
                        uR2.h((rR2$L)var6_6, (Attributes)var7_8);
                        uR2.k((rR2$L)var6_6, (Attributes)var7_8);
                        uR2.g((rR2$G)var6_6, (Attributes)var7_8);
                        var23_25 = null;
                        for (var24_34 = 0; var24_34 < (var8_9 = var4_4.getLength()); ++var24_34) {
                            var11_13 /* !! */  = var7_8.getValue(var24_34).trim();
                            var30_78 /* !! */  = uR2$a.b;
                            var13_15 /* !! */  = tR2.a((Attributes)var7_8, var24_34);
                            var9_10 = var30_78 /* !! */ [var13_15 /* !! */ ];
                            if (var9_10 != var19_21 || (var9_10 = (int)var12_14.equals(var30_78 /* !! */  = (int[])var7_8.getURI(var24_34))) == 0 && (var9_10 = (int)var18_20.equals(var30_78 /* !! */  = (int[])var7_8.getURI(var24_34))) == 0) continue;
                            var6_6.o = var11_13 /* !! */ ;
                        }
                        var5_5.b.g((rR2$N)var6_6);
                        var7_8 = var6_6.b;
                        var8_9 = var7_8 instanceof rR2$b0;
                        if (var8_9 != 0) {
                            var6_6.p = var7_8 = (rR2$b0)var7_8;
                            break;
                        }
                        var6_6.p = var7_8 = ((rR2$X)var7_8).d();
                        break;
                    }
                    var6_6 = new SAXException("Invalid document. <tref> elements are only valid inside <text> or <tspan> elements.");
                    throw var6_6;
                }
                var6_6 = new SAXException(var23_25);
                throw var6_6;
            }
            case 14: {
                var6_6 = var5_5.b;
                if (var6_6 != null) {
                    var10_12 = var6_6 instanceof rR2$Y;
                    if (var10_12 != 0) {
                        var6_6 = new rr2$v_0();
                        var6_6.a = var11_13 /* !! */  = var5_5.a;
                        var6_6.b = var11_13 /* !! */  = var5_5.b;
                        uR2.h((rR2$L)var6_6, (Attributes)var7_8);
                        uR2.k((rR2$L)var6_6, (Attributes)var7_8);
                        uR2.g((rR2$G)var6_6, (Attributes)var7_8);
                        uR2.l((rR2$a0)var6_6, (Attributes)var7_8);
                        var5_5.b.g((rR2$N)var6_6);
                        var5_5.b = var6_6;
                        var7_8 = var6_6.b;
                        var8_9 = var7_8 instanceof rR2$b0;
                        if (var8_9 != 0) {
                            var6_6.s = var7_8 = (rR2$b0)var7_8;
                            break;
                        }
                        var6_6.s = var7_8 = ((rR2$X)var7_8).d();
                        break;
                    }
                    var6_6 = new SAXException("Invalid document. <tspan> elements are only valid inside <text> or other <tspan> elements.");
                    throw var6_6;
                }
                var6_6 = new SAXException(var23_25);
                throw var6_6;
            }
            case 13: {
                var6_6 = var5_5.b;
                if (var6_6 != null) {
                    var6_6 = new rr2$w_0();
                    var6_6.a = var11_13 /* !! */  = var5_5.a;
                    var6_6.b = var11_13 /* !! */  = var5_5.b;
                    uR2.h((rR2$L)var6_6, (Attributes)var7_8);
                    uR2.k((rR2$L)var6_6, (Attributes)var7_8);
                    uR2.m((rr2$n_0)var6_6, (Attributes)var7_8);
                    uR2.g((rR2$G)var6_6, (Attributes)var7_8);
                    uR2.l((rR2$a0)var6_6, (Attributes)var7_8);
                    var7_8 = var5_5.b;
                    var7_8.g((rR2$N)var6_6);
                    var5_5.b = var6_6;
                    break;
                }
                var6_6 = new SAXException(var23_25);
                throw var6_6;
            }
            case 12: {
                var6_6 = var5_5.b;
                if (var6_6 != null) {
                    var6_6 = new rr2$a_0();
                    var6_6.a = var11_13 /* !! */  = var5_5.a;
                    var6_6.b = var11_13 /* !! */  = var5_5.b;
                    uR2.h((rR2$L)var6_6, (Attributes)var7_8);
                    uR2.k((rR2$L)var6_6, (Attributes)var7_8);
                    uR2.m((rr2$n_0)var6_6, (Attributes)var7_8);
                    uR2.g((rR2$G)var6_6, (Attributes)var7_8);
                    var11_13 /* !! */  = "polygon";
                    uR2.j((rr2$z_0)var6_6, (Attributes)var7_8, (String)var11_13 /* !! */ );
                    var7_8 = var5_5.b;
                    var7_8.g((rR2$N)var6_6);
                    break;
                }
                var6_6 = new SAXException(var23_25);
                throw var6_6;
            }
            case 11: {
                var6_6 = var5_5.b;
                if (var6_6 != null) {
                    var6_6 = new rr2$z_0();
                    var6_6.a = var11_13 /* !! */  = var5_5.a;
                    var6_6.b = var11_13 /* !! */  = var5_5.b;
                    uR2.h((rR2$L)var6_6, (Attributes)var7_8);
                    uR2.k((rR2$L)var6_6, (Attributes)var7_8);
                    uR2.m((rr2$n_0)var6_6, (Attributes)var7_8);
                    uR2.g((rR2$G)var6_6, (Attributes)var7_8);
                    var11_13 /* !! */  = "polyline";
                    uR2.j((rr2$z_0)var6_6, (Attributes)var7_8, (String)var11_13 /* !! */ );
                    var7_8 = var5_5.b;
                    var7_8.g((rR2$N)var6_6);
                    break;
                }
                var6_6 = new SAXException(var23_25);
                throw var6_6;
            }
            case 10: {
                var29_68 = false;
                var32_88 = 0.0f;
                var16_18 = null;
                var6_6 = var5_5.b;
                if (var6_6 != null) {
                    var6_6 = new rr2$q_0();
                    var6_6.a = var11_13 /* !! */  = var5_5.a;
                    var6_6.b = var11_13 /* !! */  = var5_5.b;
                    uR2.h((rR2$L)var6_6, (Attributes)var7_8);
                    uR2.k((rR2$L)var6_6, (Attributes)var7_8);
                    uR2.m((rr2$n_0)var6_6, (Attributes)var7_8);
                    uR2.g((rR2$G)var6_6, (Attributes)var7_8);
                    var23_25 = null;
                    block88: for (var24_35 = 0; var24_35 < (var8_9 = var4_4.getLength()); ++var24_35) {
                        var11_13 /* !! */  = var7_8.getValue(var24_35).trim();
                        var30_79 = uR2$a.b;
                        var25_48 = tR2.a((Attributes)var7_8, var24_35);
                        var9_10 = var30_79[var25_48];
                        switch (var9_10) {
                            default: {
                                continue block88;
                            }
                            case 18: {
                                var11_13 /* !! */  = uR2.t((String)var11_13 /* !! */ );
                                var6_6.r = var11_13 /* !! */ ;
                                continue block88;
                            }
                            case 17: {
                                var11_13 /* !! */  = uR2.t((String)var11_13 /* !! */ );
                                var6_6.q = var11_13 /* !! */ ;
                                continue block88;
                            }
                            case 16: {
                                var11_13 /* !! */  = uR2.t((String)var11_13 /* !! */ );
                                var6_6.p = var11_13 /* !! */ ;
                                continue block88;
                            }
                            case 15: {
                                var11_13 /* !! */  = uR2.t((String)var11_13 /* !! */ );
                                var6_6.o = var11_13 /* !! */ ;
                            }
                        }
                    }
                    var7_8 = var5_5.b;
                    var7_8.g((rR2$N)var6_6);
                    break;
                }
                var6_6 = new SAXException(var23_25);
                throw var6_6;
            }
            case 9: {
                var29_69 = false;
                var32_89 = 0.0f;
                var16_18 = null;
                var6_6 = var5_5.b;
                if (var6_6 == null) ** GOTO lbl844
                var6_6 = new rr2$i_0();
                var6_6.a = var11_13 /* !! */  = var5_5.a;
                var6_6.b = var11_13 /* !! */  = var5_5.b;
                uR2.h((rR2$L)var6_6, (Attributes)var7_8);
                uR2.k((rR2$L)var6_6, (Attributes)var7_8);
                uR2.m((rr2$n_0)var6_6, (Attributes)var7_8);
                uR2.g((rR2$G)var6_6, (Attributes)var7_8);
                var23_25 = null;
                block89: for (var24_36 = 0; var24_36 < (var8_9 = var4_4.getLength()); ++var24_36) {
                    var11_13 /* !! */  = var7_8.getValue(var24_36).trim();
                    var30_80 = uR2$a.b;
                    var25_49 = tR2.a((Attributes)var7_8, var24_36);
                    var9_10 = var30_80[var25_49];
                    switch (var9_10) {
                        default: {
                            continue block89;
                        }
                        case 13: {
                            var11_13 /* !! */  = uR2.t((String)var11_13 /* !! */ );
                            var6_6.p = var11_13 /* !! */ ;
                            continue block89;
                        }
                        case 12: {
                            var11_13 /* !! */  = uR2.t((String)var11_13 /* !! */ );
                            var6_6.o = var11_13 /* !! */ ;
                            continue block89;
                        }
                        case 11: {
                            var11_13 /* !! */  = uR2.t((String)var11_13 /* !! */ );
                            var6_6.r = var11_13 /* !! */ ;
                            var8_9 = (int)var11_13 /* !! */ .i();
                            if (var8_9 == 0) continue block89;
                            var6_6 = new SAXException("Invalid <ellipse> element. ry cannot be negative");
                            throw var6_6;
                        }
                        case 10: {
                            var11_13 /* !! */  = uR2.t((String)var11_13 /* !! */ );
                            var6_6.q = var11_13 /* !! */ ;
                            var8_9 = (int)var11_13 /* !! */ .i();
                            if (var8_9 != 0) ** GOTO lbl839
                        }
                    }
                    continue;
lbl839:
                    // 1 sources

                    var6_6 = new SAXException("Invalid <ellipse> element. rx cannot be negative");
                    throw var6_6;
                }
                var7_8 = var5_5.b;
                var7_8.g((rR2$N)var6_6);
                break;
lbl844:
                // 1 sources

                var6_6 = new SAXException(var23_25);
                throw var6_6;
            }
            case 8: {
                var29_70 = false;
                var32_90 = 0.0f;
                var16_18 = null;
                var6_6 = var5_5.b;
                if (var6_6 != null) {
                    var6_6 = new rr2$d_0();
                    var6_6.a = var11_13 /* !! */  = var5_5.a;
                    var6_6.b = var11_13 /* !! */  = var5_5.b;
                    uR2.h((rR2$L)var6_6, (Attributes)var7_8);
                    uR2.k((rR2$L)var6_6, (Attributes)var7_8);
                    uR2.m((rr2$n_0)var6_6, (Attributes)var7_8);
                    uR2.g((rR2$G)var6_6, (Attributes)var7_8);
                    var23_25 = null;
                    block90: for (var24_37 = 0; var24_37 < (var8_9 = var4_4.getLength()); ++var24_37) {
                        var11_13 /* !! */  = var7_8.getValue(var24_37).trim();
                        var30_81 = uR2$a.b;
                        var25_50 = tR2.a((Attributes)var7_8, var24_37);
                        var9_10 = var30_81[var25_50];
                        switch (var9_10) {
                            default: {
                                continue block90;
                            }
                            case 14: {
                                var11_13 /* !! */  = uR2.t((String)var11_13 /* !! */ );
                                var6_6.q = var11_13 /* !! */ ;
                                var8_9 = (int)var11_13 /* !! */ .i();
                                if (var8_9 == 0) continue block90;
                                var6_6 = new SAXException("Invalid <circle> element. r cannot be negative");
                                throw var6_6;
                            }
                            case 13: {
                                var11_13 /* !! */  = uR2.t((String)var11_13 /* !! */ );
                                var6_6.p = var11_13 /* !! */ ;
                                continue block90;
                            }
                            case 12: {
                                var11_13 /* !! */  = uR2.t((String)var11_13 /* !! */ );
                                var6_6.o = var11_13 /* !! */ ;
                            }
                        }
                    }
                    var7_8 = var5_5.b;
                    var7_8.g((rR2$N)var6_6);
                    break;
                }
                var6_6 = new SAXException(var23_25);
                throw var6_6;
            }
            case 7: {
                var29_71 = false;
                var32_91 = 0.0f;
                var16_18 = null;
                var6_6 = var5_5.b;
                if (var6_6 != null) {
                    var6_6 = new rr2$b_0();
                    var6_6.a = var11_13 /* !! */  = var5_5.a;
                    var6_6.b = var11_13 /* !! */  = var5_5.b;
                    uR2.h((rR2$L)var6_6, (Attributes)var7_8);
                    uR2.k((rR2$L)var6_6, (Attributes)var7_8);
                    uR2.m((rr2$n_0)var6_6, (Attributes)var7_8);
                    uR2.g((rR2$G)var6_6, (Attributes)var7_8);
                    var23_25 = null;
                    for (var24_38 = 0; var24_38 < (var8_9 = var4_4.getLength()); ++var24_38) {
                        var11_13 /* !! */  = var7_8.getValue(var24_38).trim();
                        var12_14 = uR2$a.b;
                        var13_15 /* !! */  = tR2.a((Attributes)var7_8, var24_38);
                        var25_51 = var12_14[var13_15 /* !! */ ];
                        if (var25_51 != var9_10) {
                            if (var25_51 != var22_24) {
                                if (var25_51 != var21_23) {
                                    if (var25_51 != var20_22) {
                                        var13_15 /* !! */  = 10;
                                        var27_60 = 1.4E-44f;
                                        if (var25_51 != var13_15 /* !! */ ) {
                                            var13_15 /* !! */  = 11;
                                            var27_60 = 1.5E-44f;
                                            if (var25_51 != var13_15 /* !! */ ) continue;
                                            var6_6.t = var11_13 /* !! */  = uR2.t((String)var11_13 /* !! */ );
                                            var8_9 = (int)var11_13 /* !! */ .i();
                                            if (var8_9 == 0) continue;
                                            var6_6 = new SAXException("Invalid <rect> element. ry cannot be negative");
                                            throw var6_6;
                                        }
                                        var6_6.s = var11_13 /* !! */  = uR2.t((String)var11_13 /* !! */ );
                                        var8_9 = (int)var11_13 /* !! */ .i();
                                        if (var8_9 == 0) continue;
                                        var6_6 = new SAXException("Invalid <rect> element. rx cannot be negative");
                                        throw var6_6;
                                    }
                                    var6_6.r = var11_13 /* !! */  = uR2.t((String)var11_13 /* !! */ );
                                    var8_9 = (int)var11_13 /* !! */ .i();
                                    if (var8_9 == 0) continue;
                                    var6_6 = new SAXException("Invalid <rect> element. height cannot be negative");
                                    throw var6_6;
                                }
                                var6_6.q = var11_13 /* !! */  = uR2.t((String)var11_13 /* !! */ );
                                var8_9 = (int)var11_13 /* !! */ .i();
                                if (var8_9 == 0) continue;
                                var6_6 = new SAXException("Invalid <rect> element. width cannot be negative");
                                throw var6_6;
                            }
                            var6_6.p = var11_13 /* !! */  = uR2.t((String)var11_13 /* !! */ );
                            continue;
                        }
                        var6_6.o = var11_13 /* !! */  = uR2.t((String)var11_13 /* !! */ );
                    }
                    var7_8 = var5_5.b;
                    var7_8.g((rR2$N)var6_6);
                    break;
                }
                var6_6 = new SAXException(var23_25);
                throw var6_6;
            }
            case 6: {
                var5_5.D((Attributes)var7_8);
                break;
            }
            case 5: {
                var29_72 /* !! */  = false;
                var32_92 = 0.0f;
                var16_18 = null;
                var6_6 = var5_5.b;
                if (var6_6 != null) {
                    var6_6 = new rR2$e0();
                    var6_6.a = var11_13 /* !! */  = var5_5.a;
                    var6_6.b = var11_13 /* !! */  = var5_5.b;
                    uR2.h((rR2$L)var6_6, (Attributes)var7_8);
                    uR2.k((rR2$L)var6_6, (Attributes)var7_8);
                    uR2.m((rr2$n_0)var6_6, (Attributes)var7_8);
                    uR2.g((rR2$G)var6_6, (Attributes)var7_8);
                    var23_25 = null;
                    for (var24_39 = 0; var24_39 < (var8_9 = var4_4.getLength()); ++var24_39) {
                        var11_13 /* !! */  = var7_8.getValue(var24_39).trim();
                        var16_18 = uR2$a.b;
                        var28_63 = tR2.a((Attributes)var7_8, var24_39);
                        var29_72 /* !! */  = (int)var16_18[var28_63];
                        if (var29_72 /* !! */  != var9_10) {
                            if (var29_72 /* !! */  != var22_24) {
                                if (var29_72 /* !! */  != var21_23) {
                                    if (var29_72 /* !! */  != var20_22) {
                                        if (var29_72 /* !! */  != var19_21 || (var29_72 /* !! */  = var12_14.equals(var16_18 = var7_8.getURI(var24_39))) == 0 && (var29_72 /* !! */  = var18_20.equals(var16_18 = var7_8.getURI(var24_39))) == false) continue;
                                        var6_6.p = var11_13 /* !! */ ;
                                        continue;
                                    }
                                    var6_6.t = var11_13 /* !! */  = uR2.t((String)var11_13 /* !! */ );
                                    var8_9 = (int)var11_13 /* !! */ .i();
                                    if (var8_9 == 0) continue;
                                    var6_6 = new SAXException(var15_17);
                                    throw var6_6;
                                }
                                var6_6.s = var11_13 /* !! */  = uR2.t((String)var11_13 /* !! */ );
                                var8_9 = (int)var11_13 /* !! */ .i();
                                if (var8_9 == 0) continue;
                                var6_6 = new SAXException((String)var14_16);
                                throw var6_6;
                            }
                            var6_6.r = var11_13 /* !! */  = uR2.t((String)var11_13 /* !! */ );
                            continue;
                        }
                        var6_6.q = var11_13 /* !! */  = uR2.t((String)var11_13 /* !! */ );
                    }
                    var7_8 = var5_5.b;
                    var7_8.g((rR2$N)var6_6);
                    var5_5.b = var6_6;
                    break;
                }
                var6_6 = new SAXException(var23_25);
                throw var6_6;
            }
            case 4: {
                var6_6 = var5_5.b;
                if (var6_6 != null) {
                    var6_6 = new rr2$m_0();
                    var6_6.a = var11_13 /* !! */  = var5_5.a;
                    var6_6.b = var11_13 /* !! */  = var5_5.b;
                    uR2.h((rR2$L)var6_6, (Attributes)var7_8);
                    uR2.k((rR2$L)var6_6, (Attributes)var7_8);
                    uR2.m((rr2$n_0)var6_6, (Attributes)var7_8);
                    var7_8 = var5_5.b;
                    var7_8.g((rR2$N)var6_6);
                    var5_5.b = var6_6;
                    break;
                }
                var6_6 = new SAXException(var23_25);
                throw var6_6;
            }
            case 2: 
            case 3: {
                var6_6 = var5_5.b;
                if (var6_6 != null) {
                    var6_6 = new rr2$m_0();
                    var6_6.a = var11_13 /* !! */  = var5_5.a;
                    var6_6.b = var11_13 /* !! */  = var5_5.b;
                    uR2.h((rR2$L)var6_6, (Attributes)var7_8);
                    uR2.k((rR2$L)var6_6, (Attributes)var7_8);
                    uR2.m((rr2$n_0)var6_6, (Attributes)var7_8);
                    uR2.g((rR2$G)var6_6, (Attributes)var7_8);
                    var7_8 = var5_5.b;
                    var7_8.g((rR2$N)var6_6);
                    var5_5.b = var6_6;
                    break;
                }
                var6_6 = new SAXException(var23_25);
                throw var6_6;
            }
            case 1: {
                var29_73 = false;
                var32_93 = 0.0f;
                var16_18 = null;
                var6_6 = new rr2$f_0();
                var6_6.a = var11_13 /* !! */  = var5_5.a;
                var6_6.b = var11_13 /* !! */  = var5_5.b;
                uR2.h((rR2$L)var6_6, (Attributes)var7_8);
                uR2.k((rR2$L)var6_6, (Attributes)var7_8);
                uR2.g((rR2$G)var6_6, (Attributes)var7_8);
                uR2.n((rR2$R)var6_6, (Attributes)var7_8);
                var23_25 = null;
                for (var24_40 = 0; var24_40 < (var8_9 = var4_4.getLength()); ++var24_40) {
                    var11_13 /* !! */  = var7_8.getValue(var24_40).trim();
                    var12_14 = uR2$a.b;
                    var13_15 /* !! */  = tR2.a((Attributes)var7_8, var24_40);
                    var25_52 = var12_14[var13_15 /* !! */ ];
                    if (var25_52 != var9_10) {
                        if (var25_52 != var22_24) {
                            if (var25_52 != var21_23) {
                                if (var25_52 != var20_22) continue;
                                var6_6.t = var11_13 /* !! */  = uR2.t((String)var11_13 /* !! */ );
                                var8_9 = (int)var11_13 /* !! */ .i();
                                if (var8_9 == 0) continue;
                                var6_6 = new SAXException("Invalid <svg> element. height cannot be negative");
                                throw var6_6;
                            }
                            var6_6.s = var11_13 /* !! */  = uR2.t((String)var11_13 /* !! */ );
                            var8_9 = (int)var11_13 /* !! */ .i();
                            if (var8_9 == 0) continue;
                            var6_6 = new SAXException("Invalid <svg> element. width cannot be negative");
                            throw var6_6;
                        }
                        var11_13 /* !! */  = uR2.t((String)var11_13 /* !! */ );
                        var6_6.r = var11_13 /* !! */ ;
                        continue;
                    }
                    var11_13 /* !! */  = uR2.t((String)var11_13 /* !! */ );
                    var6_6.q = var11_13 /* !! */ ;
                }
                var7_8 = var5_5.b;
                if (var7_8 == null) {
                    var7_8 = var5_5.a;
                    var7_8.a = var6_6;
                } else {
                    var7_8.g((rR2$N)var6_6);
                }
                var5_5.b = var6_6;
            }
        }
    }

    public final void G(String string2) {
        boolean bl2 = this.c;
        if (bl2) {
            return;
        }
        bl2 = this.e;
        if (bl2) {
            StringBuilder stringBuilder = this.g;
            if (stringBuilder == null) {
                int n3 = string2.length();
                this.g = stringBuilder = new StringBuilder(n3);
            }
            stringBuilder = this.g;
            stringBuilder.append(string2);
        } else {
            bl2 = this.h;
            if (bl2) {
                StringBuilder stringBuilder = this.i;
                if (stringBuilder == null) {
                    int n4 = string2.length();
                    this.i = stringBuilder = new StringBuilder(n4);
                }
                stringBuilder = this.i;
                stringBuilder.append(string2);
            } else {
                rR2$J rR2$J = this.b;
                bl2 = rR2$J instanceof rR2$Y;
                if (bl2) {
                    this.a(string2);
                }
            }
        }
    }

    public final void H(char[] cArray, int n3, int n4) {
        boolean bl2 = this.c;
        if (bl2) {
            return;
        }
        bl2 = this.e;
        if (bl2) {
            StringBuilder stringBuilder = this.g;
            if (stringBuilder == null) {
                this.g = stringBuilder = new StringBuilder(n4);
            }
            stringBuilder = this.g;
            stringBuilder.append(cArray, n3, n4);
        } else {
            bl2 = this.h;
            if (bl2) {
                StringBuilder stringBuilder = this.i;
                if (stringBuilder == null) {
                    this.i = stringBuilder = new StringBuilder(n4);
                }
                stringBuilder = this.i;
                stringBuilder.append(cArray, n3, n4);
            } else {
                Object object = this.b;
                bl2 = object instanceof rR2$Y;
                if (bl2) {
                    object = new String(cArray, n3, n4);
                    this.a((String)object);
                }
            }
        }
    }

    public final void a(String string2) {
        Object object = (rR2$H)this.b;
        Object object2 = ((rR2$H)object).i;
        int n3 = object2.size();
        if (n3 == 0) {
            object = null;
        } else {
            object = ((rR2$H)object).i;
            object = (rR2$N)object.get(n3 += -1);
        }
        n3 = object instanceof rR2$c0;
        if (n3 != 0) {
            object2 = new StringBuilder();
            object = (rR2$c0)object;
            String string3 = ((rR2$c0)object).c;
            ((rR2$c0)object).c = string2 = h30_0.a((StringBuilder)object2, string3, string2);
        } else {
            object = this.b;
            object2 = new rR2$N();
            ((rR2$c0)object2).c = string2;
            object.g((rR2$N)object2);
        }
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public final void c(String object, String object2, String object3) {
        rR2$J rR2$J;
        void var2_15;
        void var2_13;
        boolean bl2;
        Object object4;
        int n3 = this.c;
        int n4 = 1;
        if (n3 != 0) {
            this.d = n3 = this.d - n4;
            if (n3 == 0) {
                this.c = false;
                return;
            }
        }
        if ((n3 = (int)(((String)(object4 = "http://www.w3.org/2000/svg")).equals(object) ? 1 : 0)) == 0 && !(bl2 = ((String)(object4 = "")).equals(object))) {
            return;
        }
        int n7 = var2_13.length();
        if (n7 <= 0) {
            void var3_20;
            void var2_14 = var3_20;
        }
        int[] nArray = uR2$a.a;
        uR2$h uR2$h = uR2$h.fromString((String)var2_15);
        int n8 = uR2$h.ordinal();
        int n10 = nArray[n8];
        if (n10 != n4 && n10 != (n8 = 2) && n10 != (n8 = 4) && n10 != (n8 = 5) && n10 != (n8 = 13) && n10 != (n8 = 14)) {
            switch (n10) {
                default: {
                    return;
                }
                case 30: {
                    StringBuilder stringBuilder = this.i;
                    if (stringBuilder == null) return;
                    this.h = false;
                    String string2 = stringBuilder.toString();
                    CH$f cH$f = CH$f.screen;
                    object4 = CH$u.Document;
                    CH cH = new CH(cH$f, (CH$u)((Object)object4));
                    rR2 rR22 = this.a;
                    object4 = new CH$d(string2);
                    ((uR2$i)object4).q();
                    CH$r cH$r = cH.e((CH$d)object4);
                    rR22.c.b(cH$r);
                    this.i.setLength(0);
                    return;
                }
                case 22: 
                case 23: {
                    this.e = false;
                    StringBuilder stringBuilder = this.g;
                    if (stringBuilder == null) return;
                    uR2$h uR2$h2 = this.f;
                    uR2$h uR2$h3 = uR2$h.title;
                    if (uR2$h2 == uR2$h3) {
                        rR2 rR23 = this.a;
                        rR23.getClass();
                    } else {
                        uR2$h uR2$h4 = uR2$h.desc;
                        if (uR2$h2 == uR2$h4) {
                            rR2 rR24 = this.a;
                            rR24.getClass();
                        }
                    }
                    StringBuilder stringBuilder2 = this.g;
                    stringBuilder2.setLength(0);
                    return;
                }
                case 16: 
                case 17: 
                case 18: 
                case 19: 
                case 20: 
                case 21: 
                case 24: 
                case 25: 
                case 26: 
                case 27: 
                case 28: 
                case 29: 
                case 31: 
            }
        }
        this.b = rR2$J = ((rR2$N)((Object)this.b)).b;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final rR2 f(InputStream inputStream) {
        BufferedInputStream bufferedInputStream;
        int n3 = inputStream.markSupported();
        if (n3 == 0) {
            bufferedInputStream = new BufferedInputStream(inputStream);
            inputStream = bufferedInputStream;
        }
        n3 = 3;
        try {
            inputStream.mark(n3);
            n3 = inputStream.read();
            int n4 = inputStream.read() << 8;
            n3 += n4;
            inputStream.reset();
            n4 = 35615;
            if (n3 == n4) {
                GZIPInputStream gZIPInputStream = new GZIPInputStream(inputStream);
                bufferedInputStream = new BufferedInputStream(gZIPInputStream);
                inputStream = bufferedInputStream;
            }
        }
        catch (IOException iOException) {}
        n3 = 4096;
        try {
            inputStream.mark(n3);
            this.C(inputStream);
            return this.a;
        }
        finally {
            inputStream.close();
        }
    }
}

