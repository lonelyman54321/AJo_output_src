/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.Layout$Alignment
 *  android.text.TextUtils
 *  org.xmlpull.v1.XmlPullParser
 *  org.xmlpull.v1.XmlPullParserException
 *  org.xmlpull.v1.XmlPullParserFactory
 */
import android.text.Layout;
import android.text.TextUtils;
import androidx.media3.extractor.text.SubtitleDecoderException;
import com.google.common.base.Ascii;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Iterables;
import com.google.common.collect.Sets;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

public final class Js3
implements vf3_0 {
    public static final Pattern b;
    public static final Pattern c;
    public static final Pattern d;
    public static final Pattern e;
    public static final Pattern f;
    public static final Pattern g;
    public static final Pattern h;
    public static final Js3$a i;
    public final XmlPullParserFactory a;

    static {
        Js3$a js3$a;
        b = Pattern.compile("^([0-9][0-9]+):([0-9][0-9]):([0-9][0-9])(?:(\\.[0-9]+)|:([0-9][0-9])(?:\\.([0-9]+))?)?$");
        c = Pattern.compile("^([0-9]+(?:\\.[0-9]+)?)(h|m|s|ms|f|t)$");
        d = Pattern.compile("^(([0-9]*.)?[0-9]+)(px|em|%)$");
        e = Pattern.compile("^([-+]?\\d+\\.?\\d*?)%$");
        f = Pattern.compile("^([-+]?\\d+\\.?\\d*?)% ([-+]?\\d+\\.?\\d*?)%$");
        g = Pattern.compile("^([-+]?\\d+\\.?\\d*?)px ([-+]?\\d+\\.?\\d*?)px$");
        h = Pattern.compile("^(\\d+) (\\d+)$");
        int n3 = 1;
        i = js3$a = new Js3$a(30.0f, n3, n3);
    }

    public Js3() {
        XmlPullParserFactory xmlPullParserFactory;
        try {
            xmlPullParserFactory = XmlPullParserFactory.newInstance();
        }
        catch (XmlPullParserException xmlPullParserException) {
            RuntimeException runtimeException = new RuntimeException("Couldn't create XmlPullParserFactory instance", xmlPullParserException);
            throw runtimeException;
        }
        this.a = xmlPullParserFactory;
        boolean bl2 = true;
        xmlPullParserFactory.setNamespaceAware(bl2);
    }

    public static Ms3 d(Ms3 ms3) {
        if (ms3 == null) {
            ms3 = new Ms3();
        }
        return ms3;
    }

    public static boolean e(String string2) {
        boolean bl2;
        String string3 = "tt";
        boolean bl3 = string2.equals(string3);
        if (!(bl3 || (bl3 = string2.equals(string3 = "head")) || (bl3 = string2.equals(string3 = "body")) || (bl3 = string2.equals(string3 = "div")) || (bl3 = string2.equals(string3 = "p")) || (bl3 = string2.equals(string3 = "span")) || (bl3 = string2.equals(string3 = "br")) || (bl3 = string2.equals(string3 = "style")) || (bl3 = string2.equals(string3 = "styling")) || (bl3 = string2.equals(string3 = "layout")) || (bl3 = string2.equals(string3 = "region")) || (bl3 = string2.equals(string3 = "metadata")) || (bl3 = string2.equals(string3 = "image")) || (bl3 = string2.equals(string3 = "data")) || (bl2 = string2.equals(string3 = "information")))) {
            bl2 = false;
            string2 = null;
        } else {
            bl2 = true;
        }
        return bl2;
    }

    public static int f(XmlPullParser object) {
        int n3;
        int n4;
        boolean bl2;
        String string2;
        block13: {
            String string3;
            string2 = "Invalid cell resolution ";
            String string4 = "http://www.w3.org/ns/ttml#parameter";
            Object object2 = "cellResolution";
            object = object.getAttributeValue(string4, (String)object2);
            int n7 = 15;
            if (object == null) {
                return n7;
            }
            object2 = h.matcher((CharSequence)object);
            bl2 = ((Matcher)object2).matches();
            String string5 = "Ignoring malformed cell resolution: ";
            if (!bl2) {
                Cx.f(string5.concat((String)object));
                return n7;
            }
            bl2 = true;
            try {
                string3 = ((Matcher)object2).group((int)(bl2 ? 1 : 0));
            }
            catch (NumberFormatException numberFormatException) {
                Cx.f(string5.concat((String)object));
                return n7;
            }
            string3.getClass();
            n4 = Integer.parseInt(string3);
            int n8 = 2;
            object2 = ((Matcher)object2).group(n8);
            object2.getClass();
            n3 = Integer.parseInt((String)object2);
            if (n4 != 0 && n3 != 0) break block13;
            bl2 = false;
        }
        StringBuilder stringBuilder = new StringBuilder(string2);
        stringBuilder.append(n4);
        string2 = " ";
        stringBuilder.append(string2);
        stringBuilder.append(n3);
        string2 = stringBuilder.toString();
        ct3.b(bl2, string2);
        return n3;
    }

    public static void g(String object, Ms3 object2) {
        Object object3;
        block16: {
            String string2;
            Object object4;
            int n3;
            int n4;
            int n7;
            int n8;
            block15: {
                block14: {
                    n8 = 1;
                    n7 = 2;
                    n4 = -1;
                    object3 = ((String)object).split("\\s+", n4);
                    n3 = ((String[])object3).length;
                    object4 = d;
                    if (n3 != n8) break block14;
                    object3 = ((Pattern)object4).matcher((CharSequence)object);
                    break block15;
                }
                n3 = ((String[])object3).length;
                if (n3 != n7) break block16;
                object3 = object3[n8];
                object3 = ((Pattern)object4).matcher((CharSequence)object3);
                string2 = "Multiple values in fontSize attribute. Picking the second value for vertical font size and ignoring the first.";
                Cx.f(string2);
            }
            n3 = (int)(((Matcher)object3).matches() ? 1 : 0);
            object4 = "'.";
            if (n3 != 0) {
                int n10 = 3;
                float f5 = 4.2E-45f;
                string2 = ((Matcher)object3).group(n10);
                string2.getClass();
                int n14 = string2.hashCode();
                switch (n14) {
                    default: {
                        break;
                    }
                    case 3592: {
                        String string3 = "px";
                        n14 = (int)(string2.equals(string3) ? 1 : 0);
                        if (n14 == 0) break;
                        n4 = 2;
                        break;
                    }
                    case 3240: {
                        String string4 = "em";
                        n14 = (int)(string2.equals(string4) ? 1 : 0);
                        if (n14 == 0) break;
                        n4 = 1;
                        break;
                    }
                    case 37: {
                        String string5 = "%";
                        n14 = (int)(string2.equals(string5) ? 1 : 0);
                        if (n14 == 0) break;
                        n4 = 0;
                    }
                }
                switch (n4) {
                    default: {
                        object2 = cP.a("Invalid unit for fontSize: '", string2, (String)object4);
                        object = new Exception((String)object2);
                        throw object;
                    }
                    case 2: {
                        ((Ms3)object2).j = n8;
                        break;
                    }
                    case 1: {
                        ((Ms3)object2).j = n7;
                        break;
                    }
                    case 0: {
                        ((Ms3)object2).j = n10;
                    }
                }
                object = ((Matcher)object3).group(n8);
                object.getClass();
                ((Ms3)object2).k = f5 = Float.parseFloat((String)object);
                return;
            }
            object = cP.a("Invalid expression for fontSize: '", (String)object, (String)object4);
            object2 = new Exception((String)object);
            throw object2;
        }
        object2 = new StringBuilder("Invalid number of entries for fontSize: ");
        object2 = g30.a(((Object)object3).length, ".", (StringBuilder)object2);
        object = new Exception((String)object2);
        throw object;
    }

    public static Js3$a h(XmlPullParser object) {
        String string2;
        int n3;
        float f5;
        float f6;
        int n4;
        Object object2 = "http://www.w3.org/ns/ttml#parameter";
        String string3 = object.getAttributeValue((String)object2, "frameRate");
        if (string3 != null) {
            n4 = Integer.parseInt(string3);
        } else {
            n4 = 30;
            f6 = 4.2E-44f;
        }
        Object object3 = object.getAttributeValue((String)object2, "frameRateMultiplier");
        if (object3 != null) {
            String string4;
            int n7 = gz3.a;
            f5 = 0.0f / 0.0f;
            String string5 = " ";
            object3 = object3.split(string5, -1);
            n7 = ((String[])object3).length;
            n3 = 2;
            string2 = null;
            int n8 = 1;
            if (n7 == n3) {
                n7 = 1;
                f5 = Float.MIN_VALUE;
            } else {
                n7 = 0;
                f5 = 0.0f;
                string4 = null;
            }
            string5 = "frameRateMultiplier doesn't have 2 parts";
            ct3.b(n7 != 0, string5);
            string4 = object3[0];
            n7 = Integer.parseInt(string4);
            f5 = n7;
            object3 = object3[n8];
            int n10 = Integer.parseInt((String)object3);
            float f7 = n10;
            f5 /= f7;
        } else {
            int n14 = 1065353216;
            f5 = 1.0f;
        }
        object3 = i;
        n3 = object3.b;
        string2 = object.getAttributeValue((String)object2, "subFrameRate");
        if (string2 != null) {
            n3 = Integer.parseInt(string2);
        }
        int n15 = (object = object.getAttributeValue((String)object2, string2 = "tickRate")) != null ? Integer.parseInt((String)object) : object3.c;
        f6 = (float)n4 * f5;
        object2 = new Js3$a(f6, n3, n15);
        return object2;
    }

    /*
     * Unable to fully structure code
     */
    public static void i(XmlPullParser var0, HashMap var1_1, int var2_2, Js3$b var3_3, HashMap var4_4, HashMap var5_5) {
        var6_6 = var0;
        var7_7 = var1_1;
        var8_8 = var3_3;
        var9_9 = 2;
        var10_10 = -1;
        var11_11 = 0.0f / 0.0f;
        var12_12 = 1;
        while (true) {
            block46: {
                block49: {
                    block50: {
                        block51: {
                            block53: {
                                block55: {
                                    block57: {
                                        block63: {
                                            block62: {
                                                block61: {
                                                    block59: {
                                                        block60: {
                                                            block48: {
                                                                block58: {
                                                                    block56: {
                                                                        block47: {
                                                                            block54: {
                                                                                block52: {
                                                                                    var0.next();
                                                                                    var13_13 = "style";
                                                                                    var14_14 = nk_0.d(var6_6, (String)var13_13);
                                                                                    if (var14_14 != 0) {
                                                                                        var13_13 = nk_0.b(var6_6, (String)var13_13);
                                                                                        var15_15 = new Ms3();
                                                                                        var15_15 = Js3.k(var6_6, (Ms3)var15_15);
                                                                                        if (var13_13 != null) {
                                                                                            var16_16 = (var13_13 = var13_13.trim()).isEmpty();
                                                                                            if (var16_16 != 0) {
                                                                                                var13_13 = new String[]{};
                                                                                            } else {
                                                                                                var16_16 = gz3.a;
                                                                                                var17_17 = "\\s+";
                                                                                                var13_13 = var13_13.split((String)var17_17, var10_10);
                                                                                            }
                                                                                            var16_16 = ((String[])var13_13).length;
                                                                                            var19_19 = null;
                                                                                            for (var18_18 = 0; var18_18 < var16_16; var18_18 += var12_12) {
                                                                                                var20_20 = var13_13[var18_18];
                                                                                                var20_20 = (Ms3)var7_7.get(var20_20);
                                                                                                var15_15.a((Ms3)var20_20);
                                                                                            }
                                                                                        }
                                                                                        if ((var13_13 = var15_15.l) != null) {
                                                                                            var7_7.put(var13_13, var15_15);
                                                                                        }
                                                                                        while (true) {
                                                                                            var17_17 = var4_4;
lbl37:
                                                                                            // 3 sources

                                                                                            while (true) {
                                                                                                var20_20 = var5_5;
                                                                                                break block46;
                                                                                                break;
                                                                                            }
                                                                                            break;
                                                                                        }
                                                                                    }
                                                                                    var13_13 = "region";
                                                                                    var21_21 = nk_0.d(var6_6, (String)var13_13);
                                                                                    var15_15 = "id";
                                                                                    if (var21_21 == 0) break block49;
                                                                                    var19_19 = nk_0.b(var6_6, (String)var15_15);
                                                                                    var21_21 = 0;
                                                                                    var22_22 = 0.0f;
                                                                                    var13_13 = null;
                                                                                    if (var19_19 == null) break block50;
                                                                                    var15_15 = nk_0.b(var6_6, "origin");
                                                                                    if (var15_15 == null) break block51;
                                                                                    var17_17 = Js3.f;
                                                                                    var20_20 = var17_17.matcher((CharSequence)var15_15);
                                                                                    var23_23 = Js3.g;
                                                                                    var24_24 = var23_23.matcher((CharSequence)var15_15);
                                                                                    var25_25 = var20_20.matches();
                                                                                    var26_26 = "Ignoring region with missing tts:extent: ";
                                                                                    var27_27 = "Ignoring region with malformed origin: ";
                                                                                    var28_28 = 100.0f;
                                                                                    if (var25_25 == 0) break block52;
                                                                                    var24_24 = var20_20.group(var12_12);
                                                                                    var24_24.getClass();
                                                                                    var29_29 = Float.parseFloat((String)var24_24) / var28_28;
                                                                                    var20_20 = var20_20.group(var9_9);
                                                                                    try {
                                                                                        var20_20.getClass();
                                                                                        var11_11 = Float.parseFloat((String)var20_20) / var28_28;
                                                                                        var30_30 = var29_29;
                                                                                        break block47;
                                                                                    }
                                                                                    catch (NumberFormatException v0) {
                                                                                        var27_27 = var27_27.concat((String)var15_15);
                                                                                        Cx.f((String)var27_27);
                                                                                    }
                                                                                    break block50;
                                                                                }
                                                                                var31_31 = var24_24.matches();
                                                                                if (var31_31 == 0) break block53;
                                                                                if (var8_8 != null) break block54;
                                                                                var27_27 = var26_26.concat((String)var15_15);
                                                                                Cx.f((String)var27_27);
                                                                                break block50;
                                                                            }
                                                                            var20_20 = var24_24.group(var12_12);
                                                                            var20_20.getClass();
                                                                            var31_31 = Integer.parseInt((String)var20_20);
                                                                            var24_24 = var24_24.group(var9_9);
                                                                            var24_24.getClass();
                                                                            var32_32 = Integer.parseInt((String)var24_24);
                                                                            var30_30 = var31_31;
                                                                            var25_25 = var8_8.a;
                                                                            var33_33 = var25_25;
                                                                            var30_30 /= var33_33;
                                                                            var29_29 = var32_32;
                                                                            var10_10 = var8_8.b;
                                                                            var11_11 = var10_10;
                                                                            var11_11 = var29_29 / var11_11;
                                                                        }
                                                                        var24_24 = nk_0.b(var6_6, "extent");
                                                                        if (var24_24 == null) break block55;
                                                                        var17_17 = var17_17.matcher((CharSequence)var24_24);
                                                                        var23_23 = var23_23.matcher((CharSequence)var24_24);
                                                                        var32_32 = (int)var17_17.matches();
                                                                        var34_34 = "Ignoring region with malformed extent: ";
                                                                        if (var32_32 == 0) break block56;
                                                                        var23_23 = var17_17.group(var12_12);
                                                                        var23_23.getClass();
                                                                        var35_35 = Float.parseFloat((String)var23_23) / var28_28;
                                                                        var17_17 = var17_17.group(var9_9);
                                                                        try {
                                                                            var17_17.getClass();
                                                                            var28_28 = var22_22 = Float.parseFloat((String)var17_17) / var28_28;
                                                                            var36_36 = var35_35;
                                                                            break block48;
                                                                        }
                                                                        catch (NumberFormatException v1) {
                                                                            var27_27 = var34_34.concat((String)var15_15);
                                                                            Cx.f((String)var27_27);
                                                                        }
                                                                        break block50;
                                                                    }
                                                                    var16_16 = (int)var23_23.matches();
                                                                    if (var16_16 == 0) break block57;
                                                                    if (var8_8 != null) break block58;
                                                                    var27_27 = var26_26.concat((String)var15_15);
                                                                    Cx.f((String)var27_27);
                                                                    break block50;
                                                                }
                                                                var17_17 = var23_23.group(var12_12);
                                                                var17_17.getClass();
                                                                var16_16 = Integer.parseInt((String)var17_17);
                                                                var23_23 = var23_23.group(var9_9);
                                                                var23_23.getClass();
                                                                var37_37 = Integer.parseInt((String)var23_23);
                                                                var38_38 = var16_16;
                                                                var32_32 = var8_8.a;
                                                                var29_29 = var32_32;
                                                                var38_38 /= var29_29;
                                                                var35_35 = var37_37;
                                                                try {
                                                                    var21_21 = var8_8.b;
                                                                }
                                                                catch (NumberFormatException v2) {
                                                                    var27_27 = var34_34.concat((String)var15_15);
                                                                    Cx.f((String)var27_27);
                                                                }
                                                                var22_22 = var21_21;
                                                                var36_36 = var38_38;
                                                                var28_28 = var35_35 /= var22_22;
                                                            }
                                                            var13_13 = nk_0.b(var6_6, "displayAlign");
                                                            if (var13_13 == null) break block59;
                                                            var13_13 = Ascii.toLowerCase((String)var13_13);
                                                            var13_13.getClass();
                                                            var15_15 = "center";
                                                            var14_14 = var13_13.equals(var15_15);
                                                            if (var14_14 != 0) break block60;
                                                            var15_15 = "after";
                                                            var21_21 = (int)var13_13.equals(var15_15);
                                                            if (var21_21 == 0) break block59;
                                                            var35_35 = var11_11 += var28_28;
                                                            var25_25 = 2;
                                                            var33_33 = 2.8E-45f;
                                                            break block61;
                                                        }
                                                        var21_21 = 0x40000000;
                                                        var35_35 = var22_22 = var28_28 / 2.0f + var11_11;
                                                        var25_25 = 1;
                                                        var33_33 = 1.4E-45f;
                                                        break block61;
                                                    }
                                                    var35_35 = var11_11;
                                                    var25_25 = 0;
                                                    var33_33 = 0.0f;
                                                    var34_34 = null;
                                                }
                                                var10_10 = 1065353216;
                                                var11_11 = 1.0f;
                                                var21_21 = var2_2;
                                                var39_39 = var2_2;
                                                var40_40 = var11_11 / var39_39;
                                                var27_27 = nk_0.b(var6_6, "writingMode");
                                                if (var27_27 == null) break block62;
                                                var27_27 = Ascii.toLowerCase((String)var27_27);
                                                var27_27.getClass();
                                                var14_14 = var27_27.hashCode();
                                                switch (var14_14) lbl-1000:
                                                // 4 sources

                                                {
                                                    default: {
                                                        var10_10 = -1;
                                                        var11_11 = 0.0f / 0.0f;
                                                        break;
                                                    }
                                                    case 3553576: {
                                                        var15_15 = "tbrl";
                                                        var10_10 = (int)var27_27.equals(var15_15);
                                                        if (var10_10 == 0) ** GOTO lbl-1000
                                                        var10_10 = 2;
                                                        var11_11 = 2.8E-45f;
                                                        break;
                                                    }
                                                    case 3553396: {
                                                        var15_15 = "tblr";
                                                        var10_10 = (int)var27_27.equals(var15_15);
                                                        if (var10_10 == 0) ** GOTO lbl-1000
                                                        var10_10 = 1;
                                                        var11_11 = 1.4E-45f;
                                                        break;
                                                    }
                                                    case 3694: {
                                                        var15_15 = "tb";
                                                        var10_10 = (int)var27_27.equals(var15_15);
                                                        if (var10_10 == 0) ** GOTO lbl-1000
                                                        var10_10 = 0;
                                                        var11_11 = 0.0f;
                                                        var27_27 = null;
                                                    }
                                                }
                                                switch (var10_10) {
                                                    default: {
                                                        break;
                                                    }
                                                    case 2: {
                                                        var41_41 = 1;
                                                        break block63;
                                                    }
                                                    case 0: 
                                                    case 1: {
                                                        var41_41 = 2;
                                                        break block63;
                                                    }
                                                }
                                            }
                                            var10_10 = -1 << -1;
                                            var11_11 = -0.0f;
                                            var41_41 = -1 << -1;
                                        }
                                        var32_32 = 0;
                                        var29_29 = 0.0f;
                                        var24_24 = null;
                                        var42_42 = 1;
                                        var17_17 = var27_27;
                                        var13_13 = var27_27 = new Ks3(var19_19, var30_30, var35_35, 0, var25_25, var36_36, var28_28, var42_42, var40_40, var41_41);
                                        break block50;
                                        break block50;
                                    }
                                    var27_27 = "Ignoring region with unsupported extent: ".concat((String)var15_15);
                                    Cx.f((String)var27_27);
                                    break block50;
                                }
                                var27_27 = "Ignoring region without an extent";
                                Cx.f((String)var27_27);
                                break block50;
                                catch (NumberFormatException v3) {
                                    var27_27 = var27_27.concat((String)var15_15);
                                    Cx.f((String)var27_27);
                                }
                                break block50;
                            }
                            var27_27 = "Ignoring region with unsupported origin: ".concat((String)var15_15);
                            Cx.f((String)var27_27);
                            break block50;
                        }
                        var27_27 = "Ignoring region without an origin";
                        Cx.f((String)var27_27);
                    }
                    if (var13_13 == null) ** continue;
                    var27_27 = var13_13.a;
                    var17_17 = var4_4;
                    var4_4.put(var27_27, var13_13);
                    ** GOTO lbl37
                }
                var17_17 = var4_4;
                var27_27 = "metadata";
                var21_21 = nk_0.d(var6_6, (String)var27_27);
                if (var21_21 != 0) ** break;
                ** continue;
                do {
                    var0.next();
                    var13_13 = "image";
                    var21_21 = nk_0.d(var6_6, (String)var13_13);
                    if (var21_21 != 0 && (var13_13 = nk_0.b(var6_6, (String)var15_15)) != null) {
                        var19_19 = var0.nextText();
                        var20_20 = var5_5;
                        var5_5.put(var13_13, var19_19);
                        continue;
                    }
                    var20_20 = var5_5;
                } while ((var21_21 = nk_0.c(var6_6, (String)var27_27)) == 0);
            }
            var27_27 = "head";
            var10_10 = (int)nk_0.c(var6_6, (String)var27_27);
            if (var10_10 != 0) {
                return;
            }
            var10_10 = -1;
            var11_11 = 0.0f / 0.0f;
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static Is3 j(XmlPullParser var0, Is3 var1_1, HashMap var2_2, Js3$a var3_3) {
        var4_4 /* !! */  = var0;
        var5_5 = var1_1;
        var6_6 = var3_3;
        var7_7 = -1;
        var8_8 = 1;
        var9_9 = var0.getAttributeCount();
        var10_10 = Js3.k(var0, null);
        var11_11 = "";
        var12_12 = null;
        var13_13 = null;
        var14_14 = var11_11;
        var16_16 = -9223372036854775807L;
        var18_17 = -9223372036854775807L;
        var20_18 = -9223372036854775807L;
        block16: for (var15_15 = 0; var15_15 < var9_9; var15_15 += var8_8) {
            var11_11 = var4_4 /* !! */ .getAttributeName(var15_15);
            var22_19 = var4_4 /* !! */ .getAttributeValue(var15_15);
            var11_11.getClass();
            var23_20 = var11_11.hashCode();
            switch (var23_20) lbl-1000:
            // 7 sources

            {
                default: {
                    var24_21 = -1;
                    break;
                }
                case 1292595405: {
                    var25_22 = "backgroundImage";
                    var24_21 = (int)var11_11.equals(var25_22);
                    if (var24_21 == 0) ** GOTO lbl-1000
                    var24_21 = 5;
                    break;
                }
                case 109780401: {
                    var25_22 = "style";
                    var24_21 = (int)var11_11.equals(var25_22);
                    if (var24_21 == 0) ** GOTO lbl-1000
                    var24_21 = 4;
                    break;
                }
                case 93616297: {
                    var25_22 = "begin";
                    var24_21 = (int)var11_11.equals(var25_22);
                    if (var24_21 == 0) ** GOTO lbl-1000
                    var24_21 = 3;
                    break;
                }
                case 100571: {
                    var25_22 = "end";
                    var24_21 = (int)var11_11.equals(var25_22);
                    if (var24_21 == 0) ** GOTO lbl-1000
                    var24_21 = 2;
                    break;
                }
                case 99841: {
                    var25_22 = "dur";
                    var24_21 = (int)var11_11.equals(var25_22);
                    if (var24_21 == 0) ** GOTO lbl-1000
                    var24_21 = 1;
                    break;
                }
                case -934795532: {
                    var25_22 = "region";
                    var24_21 = (int)var11_11.equals(var25_22);
                    if (var24_21 == 0) ** GOTO lbl-1000
                    var24_21 = 0;
                    var11_11 = null;
                }
            }
            switch (var24_21) {
                default: {
                    ** GOTO lbl69
                }
                case 5: {
                    var11_11 = "#";
                    var24_21 = (int)var22_19.startsWith((String)var11_11);
                    if (var24_21 != 0) {
                        var13_13 = var22_19.substring(var8_8);
                    }
lbl69:
                    // 9 sources

                    while (true) {
                        var11_11 = var2_2;
                        continue block16;
                        break;
                    }
                }
                case 4: {
                    var11_11 = var22_19.trim();
                    var26_23 = var11_11.isEmpty();
                    if (var26_23 != 0) {
                        var11_11 = new String[]{};
                    } else {
                        var26_23 = gz3.a;
                        var22_19 = "\\s+";
                        var11_11 = var11_11.split(var22_19, var7_7);
                    }
                    if ((var26_23 = var11_11.length) <= 0) ** GOTO lbl69
                    var12_12 = var11_11;
                    ** GOTO lbl69
                }
                case 3: {
                    var16_16 = Js3.l(var22_19, (Js3$a)var6_6);
                    ** GOTO lbl69
                }
                case 2: {
                    var18_17 = Js3.l(var22_19, (Js3$a)var6_6);
                    ** GOTO lbl69
                }
                case 1: {
                    var20_18 = Js3.l(var22_19, (Js3$a)var6_6);
                    ** continue;
                }
                case 0: 
            }
            var11_11 = var2_2;
            var23_20 = (int)var2_2.containsKey(var22_19);
            if (var23_20 == 0) continue;
            var14_14 = var22_19;
        }
        if (var5_5 != null) {
            var27_24 = var5_5.d;
            var29_25 = -9223372036854775807L;
            cfr_temp_0 = var27_24 - var29_25;
            var15_15 = (int)(cfr_temp_0 == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1));
            if (var15_15 != 0) {
                var15_15 = (int)(var16_16 == var29_25 ? 0 : (var16_16 < var29_25 ? -1 : 1));
                if (var15_15 != 0) {
                    var16_16 += var27_24;
                }
                if ((var15_15 = (int)(var18_17 == var29_25 ? 0 : (var18_17 < var29_25 ? -1 : 1))) != 0) {
                    var18_17 += var27_24;
                }
            }
        } else {
            var29_25 = -9223372036854775807L;
        }
        if ((var31_26 /* !! */  = var18_17 == var29_25 ? 0 : (var18_17 < var29_25 ? -1 : 1)) != false) ** GOTO lbl-1000
        var31_26 /* !! */  = (long)(var20_18 == var29_25 ? 0 : (var20_18 < var29_25 ? -1 : 1));
        if (var31_26 /* !! */  != false) {
            var32_27 = var20_18 = var16_16 + var20_18;
        } else if (var5_5 != null && (var15_15 = (int)((cfr_temp_1 = (var27_24 = var5_5.e) - var29_25) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1))) != 0) {
            var32_27 = var27_24;
        } else lbl-1000:
        // 2 sources

        {
            var32_27 = var18_17;
        }
        var6_6 = var0.getName();
        var4_4 /* !! */  = var34_28;
        var29_25 = var16_16;
        var22_19 = var12_12;
        var25_22 = var14_14;
        var5_5 = var1_1;
        var34_28 = new Is3((String)var6_6, null, var16_16, var32_27, var10_10, var12_12, var14_14, var13_13, var1_1);
        return var34_28;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static Ms3 k(XmlPullParser var0, Ms3 var1_1) {
        var2_2 = var0;
        var3_3 = "none";
        var4_4 = "after";
        var5_5 = "before";
        var6_6 = "start";
        var7_7 = "right";
        var8_8 = "left";
        var9_9 = "end";
        var10_10 = "center";
        var11_11 = var0.getAttributeCount();
        var12_12 = 0;
        var13_13 = 0.0f;
        var14_14 = null;
        var15_15 = var1_1;
        for (var16_17 = 0; var16_17 < var11_11; var16_17 += var12_12) {
            block134: {
                var17_18 = var2_2.getAttributeValue(var16_17);
                var18_19 = var2_2.getAttributeName(var16_17);
                var18_19.getClass();
                var19_20 /* !! */  = null;
                var20_21 = var18_19.hashCode();
                switch (var20_21) lbl-1000:
                // 16 sources

                {
                    default: {
                        var21_22 = -1;
                        break;
                    }
                    case 1754920356: {
                        var22_23 = "multiRowAlign";
                        var21_22 = (int)var18_19.equals(var22_23);
                        if (var21_22 == 0) ** GOTO lbl-1000
                        var21_22 = 14;
                        break;
                    }
                    case 1287124693: {
                        var22_23 = "backgroundColor";
                        var21_22 = (int)var18_19.equals(var22_23);
                        if (var21_22 == 0) ** GOTO lbl-1000
                        var21_22 = 13;
                        break;
                    }
                    case 1115953443: {
                        var22_23 = "rubyPosition";
                        var21_22 = (int)var18_19.equals(var22_23);
                        if (var21_22 == 0) ** GOTO lbl-1000
                        var21_22 = 12;
                        break;
                    }
                    case 921125321: {
                        var22_23 = "textEmphasis";
                        var21_22 = (int)var18_19.equals(var22_23);
                        if (var21_22 == 0) ** GOTO lbl-1000
                        var21_22 = 11;
                        break;
                    }
                    case 365601008: {
                        var22_23 = "fontSize";
                        var21_22 = (int)var18_19.equals(var22_23);
                        if (var21_22 == 0) ** GOTO lbl-1000
                        var21_22 = 10;
                        break;
                    }
                    case 110138194: {
                        var22_23 = "textCombine";
                        var21_22 = (int)var18_19.equals(var22_23);
                        if (var21_22 == 0) ** GOTO lbl-1000
                        var21_22 = 9;
                        break;
                    }
                    case 109403361: {
                        var22_23 = "shear";
                        var21_22 = (int)var18_19.equals(var22_23);
                        if (var21_22 == 0) ** GOTO lbl-1000
                        var21_22 = 8;
                        break;
                    }
                    case 94842723: {
                        var22_23 = "color";
                        var21_22 = (int)var18_19.equals(var22_23);
                        if (var21_22 == 0) ** GOTO lbl-1000
                        var21_22 = 7;
                        break;
                    }
                    case 3511770: {
                        var22_23 = "ruby";
                        var21_22 = (int)var18_19.equals(var22_23);
                        if (var21_22 == 0) ** GOTO lbl-1000
                        var21_22 = 6;
                        break;
                    }
                    case 3355: {
                        var22_23 = "id";
                        var21_22 = (int)var18_19.equals(var22_23);
                        if (var21_22 == 0) ** GOTO lbl-1000
                        var21_22 = 5;
                        break;
                    }
                    case -734428249: {
                        var22_23 = "fontWeight";
                        var21_22 = (int)var18_19.equals(var22_23);
                        if (var21_22 == 0) ** GOTO lbl-1000
                        var21_22 = 4;
                        break;
                    }
                    case -879295043: {
                        var22_23 = "textDecoration";
                        var21_22 = (int)var18_19.equals(var22_23);
                        if (var21_22 == 0) ** GOTO lbl-1000
                        var21_22 = 3;
                        break;
                    }
                    case -1065511464: {
                        var22_23 = "textAlign";
                        var21_22 = (int)var18_19.equals(var22_23);
                        if (var21_22 == 0) ** GOTO lbl-1000
                        var21_22 = 2;
                        break;
                    }
                    case -1224696685: {
                        var22_23 = "fontFamily";
                        var21_22 = (int)var18_19.equals(var22_23);
                        if (var21_22 == 0) ** GOTO lbl-1000
                        var21_22 = 1;
                        break;
                    }
                    case -1550943582: {
                        var22_23 = "fontStyle";
                        var21_22 = (int)var18_19.equals(var22_23);
                        if (var21_22 == 0) ** GOTO lbl-1000
                        var21_22 = 0;
                        var18_19 = null;
                    }
                }
                switch (var21_22) {
                    default: {
                        var23_24 /* !! */  = var4_4;
                        ** GOTO lbl-1000
                    }
                    case 14: {
                        var15_15 = Js3.d((Ms3)var15_15);
                        var17_18 = Ascii.toLowerCase((String)var17_18);
                        var17_18.getClass();
                        var21_22 = var17_18.hashCode();
                        switch (var21_22) lbl-1000:
                        // 6 sources

                        {
                            default: {
                                var24_25 = -1;
                                break;
                            }
                            case 109757538: {
                                var24_25 = (int)var17_18.equals(var6_6);
                                if (var24_25 == 0) ** GOTO lbl-1000
                                var24_25 = 4;
                                break;
                            }
                            case 108511772: {
                                var24_25 = (int)var17_18.equals(var7_7);
                                if (var24_25 == 0) ** GOTO lbl-1000
                                var24_25 = 3;
                                break;
                            }
                            case 3317767: {
                                var24_25 = (int)var17_18.equals(var8_8);
                                if (var24_25 == 0) ** GOTO lbl-1000
                                var24_25 = 2;
                                break;
                            }
                            case 100571: {
                                var24_25 = (int)var17_18.equals(var9_9);
                                if (var24_25 == 0) ** GOTO lbl-1000
                                var24_25 = 1;
                                break;
                            }
                            case -1364013995: {
                                var24_25 = (int)var17_18.equals(var10_10);
                                if (var24_25 == 0) ** GOTO lbl-1000
                                var24_25 = 0;
                                var17_18 = null;
                            }
                        }
                        switch (var24_25) lbl-1000:
                        // 4 sources

                        {
                            default: {
                                var17_18 = var19_20 /* !! */ ;
                                break;
                            }
                            case 2: 
                            case 4: {
                                var19_20 /* !! */  = Layout.Alignment.ALIGN_NORMAL;
                                ** GOTO lbl-1000
                            }
                            case 1: 
                            case 3: {
                                var19_20 /* !! */  = Layout.Alignment.ALIGN_OPPOSITE;
                                ** GOTO lbl-1000
                            }
                            case 0: {
                                var19_20 /* !! */  = Layout.Alignment.ALIGN_CENTER;
                                ** GOTO lbl-1000
                            }
                        }
                        var15_15.p = var19_20 /* !! */ ;
lbl169:
                        // 5 sources

                        while (true) {
                            var23_24 /* !! */  = var4_4;
lbl171:
                            // 8 sources

                            while (true) {
                                var25_26 = 4;
                                var26_27 = 2;
                                var27_28 = 2.8E-45f;
                                var12_12 = 1;
                                var13_13 = 1.4E-45f;
                                var21_22 = 3;
lbl178:
                                // 2 sources

                                while (true) {
                                    var28_29 = 0;
                                    var22_23 = null;
                                    break block134;
                                    break;
                                }
                                break;
                            }
                            break;
                        }
                    }
                    case 13: {
                        var15_15 = Js3.d((Ms3)var15_15);
                        var21_22 = fy_1.a((String)var17_18, false);
                        var15_15.d = var21_22;
                        var21_22 = 1;
                        try {
                            var15_15.e = var21_22;
                        }
                        catch (IllegalArgumentException v0) {
                            var18_19 = "Failed parsing background value: ";
                            KW.b((String)var18_19, (String)var17_18);
                        }
                        ** GOTO lbl169
                    }
                    case 12: {
                        var17_18 = Ascii.toLowerCase((String)var17_18);
                        var17_18.getClass();
                        var21_22 = (int)var17_18.equals(var5_5);
                        if (var21_22 != 0) ** GOTO lbl207
                        var24_25 = (int)var17_18.equals(var4_4);
                        if (var24_25 != 0) {
                            var15_15 = Js3.d((Ms3)var15_15);
                            var15_15.n = var24_25 = 2;
                        }
                        ** GOTO lbl169
lbl207:
                        // 1 sources

                        var15_15 = Js3.d((Ms3)var15_15);
                        var15_15.n = var24_25 = 1;
                        ** continue;
                    }
                    case 11: {
                        var15_15 = Js3.d((Ms3)var15_15);
                        var18_19 = Uj3.d;
                        if (var17_18 == null) {
                            while (true) {
                                var23_24 /* !! */  = var4_4;
lbl216:
                                // 3 sources

                                while (true) {
                                    continue;
                                    break;
                                }
                                break;
                            }
                        }
                        if ((var21_22 = (int)(var17_18 = Ascii.toLowerCase(var17_18.trim())).isEmpty()) != 0) ** continue;
                        var18_19 = Uj3.d;
                        var17_18 = ImmutableSet.copyOf(TextUtils.split((String)var17_18, (Pattern)var18_19));
                        var18_19 = Sets.intersection(Uj3.h, (Set)var17_18);
                        var22_23 = "outside";
                        var12_12 = (var18_19 = (String)Iterables.getFirst((Iterable)var18_19, var22_23)).hashCode();
                        if (var12_12 == (var25_26 = -1392885889)) ** GOTO lbl236
                        var25_26 = -1106037339;
                        if (var12_12 == var25_26) ** GOTO lbl232
                        var25_26 = 92734940;
                        if (var12_12 != var25_26 || (var25_26 = (int)var18_19.equals(var4_4)) == 0) ** GOTO lbl-1000
                        var25_26 = 0;
                        var2_2 = null;
                        ** GOTO lbl241
lbl232:
                        // 1 sources

                        var25_26 = (int)var18_19.equals(var22_23);
                        if (var25_26 == 0) ** GOTO lbl-1000
                        var25_26 = 1;
                        ** GOTO lbl241
lbl236:
                        // 1 sources

                        var25_26 = (int)var18_19.equals(var5_5);
                        if (var25_26 != 0) {
                            var25_26 = 2;
                        } else lbl-1000:
                        // 3 sources

                        {
                            var25_26 = -1;
                        }
lbl241:
                        // 4 sources

                        if (var25_26 != 0) {
                            var12_12 = 1;
                            var13_13 = 1.4E-45f;
                            var25_26 = var25_26 != var12_12 ? 1 : -2;
                        } else {
                            var25_26 = 2;
                        }
                        var14_14 = Sets.intersection(Uj3.e, (Set)var17_18);
                        var21_22 = (int)var14_14.isEmpty();
                        if (var21_22 != 0) ** GOTO lbl269
                        var24_25 = (var14_14 = (String)var14_14.iterator().next()).hashCode();
                        if (var24_25 == (var21_22 = 3005871)) ** GOTO lbl258
                        var21_22 = 3387192;
                        if (var24_25 != var21_22 || (var12_12 = (int)var14_14.equals(var3_3)) == 0) ** GOTO lbl260
                        var12_12 = 0;
                        var13_13 = 0.0f;
                        var14_14 = null;
                        ** GOTO lbl262
lbl258:
                        // 1 sources

                        var17_18 = "auto";
                        var12_12 = (int)var14_14.equals(var17_18);
lbl260:
                        // 2 sources

                        var12_12 = -1;
                        var13_13 = 0.0f / 0.0f;
lbl262:
                        // 2 sources

                        var21_22 = 0;
                        var18_19 = null;
                        var17_18 = new Uj3(var12_12, 0, var25_26);
                        var23_24 /* !! */  = var4_4;
lbl266:
                        // 2 sources

                        while (true) {
                            var19_20 /* !! */  = var17_18;
                            ** GOTO lbl216
                            break;
                        }
lbl269:
                        // 1 sources

                        var21_22 = 0;
                        var18_19 = null;
                        var14_14 = Sets.intersection(Uj3.g, (Set)var17_18);
                        var22_23 = Uj3.f;
                        var17_18 = Sets.intersection((Set)var22_23, (Set)var17_18);
                        var28_29 = var14_14.isEmpty();
                        if (var28_29 != 0 && (var28_29 = var17_18.isEmpty()) != 0) {
                            var28_29 = -1;
                            var14_14 = new Uj3(var28_29, 0, var25_26);
                            var23_24 /* !! */  = var4_4;
                            var19_20 /* !! */  = var14_14;
                            ** continue;
                        }
                        var18_19 = "filled";
                        var14_14 = (String)Iterables.getFirst((Iterable)var14_14, var18_19);
                        var28_29 = var14_14.hashCode();
                        var23_24 /* !! */  = var4_4;
                        var26_27 = -1274499742;
                        var27_28 = -1.2729063E-7f;
                        if (var28_29 == var26_27) ** GOTO lbl294
                        var26_27 = 3417674;
                        var27_28 = 4.789181E-39f;
                        if (var28_29 != var26_27 || (var26_27 = (int)var14_14.equals(var4_4 = "open")) == 0) ** GOTO lbl295
                        var26_27 = 2;
                        var27_28 = 2.8E-45f;
                        ** GOTO lbl297
lbl294:
                        // 1 sources

                        var26_27 = (int)var14_14.equals(var18_19);
lbl295:
                        // 2 sources

                        var26_27 = 1;
                        var27_28 = 1.4E-45f;
lbl297:
                        // 2 sources

                        var14_14 = "circle";
                        var17_18 = (String)Iterables.getFirst((Iterable)var17_18, var14_14);
                        var21_22 = var17_18.hashCode();
                        var28_29 = -1360216880;
                        if (var21_22 == var28_29) ** GOTO lbl318
                        var12_12 = -905816648;
                        var13_13 = -2135406.0f;
                        if (var21_22 == var12_12) ** GOTO lbl312
                        var12_12 = 99657;
                        var13_13 = 1.39649E-40f;
                        if (var21_22 != var12_12 || (var12_12 = (int)var17_18.equals(var14_14 = "dot")) == 0) ** GOTO lbl-1000
                        var12_12 = 0;
                        var13_13 = 0.0f;
                        var14_14 = null;
                        ** GOTO lbl325
lbl312:
                        // 1 sources

                        var14_14 = "sesame";
                        var12_12 = (int)var17_18.equals(var14_14);
                        if (var12_12 == 0) ** GOTO lbl-1000
                        var12_12 = 1;
                        var13_13 = 1.4E-45f;
                        ** GOTO lbl325
lbl318:
                        // 1 sources

                        var12_12 = (int)var17_18.equals(var14_14);
                        if (var12_12 != 0) {
                            var12_12 = 2;
                            var13_13 = 2.8E-45f;
                        } else lbl-1000:
                        // 3 sources

                        {
                            var12_12 = -1;
                            var13_13 = 0.0f / 0.0f;
                        }
lbl325:
                        // 4 sources

                        if (var12_12 != 0) {
                            var24_25 = 1;
                            if (var12_12 != var24_25) {
                                var12_12 = 1;
                                var13_13 = 1.4E-45f;
                            } else {
                                var12_12 = 3;
                                var13_13 = 4.2E-45f;
                            }
                        } else {
                            var12_12 = 2;
                            var13_13 = 2.8E-45f;
                        }
                        var17_18 = new Uj3(var12_12, var26_27, var25_26);
                        ** continue;
                        var2_2 = var19_20 /* !! */ ;
                        var15_15.r = var19_20 /* !! */ ;
                        ** GOTO lbl171
                    }
                    case 10: {
                        var23_24 /* !! */  = var4_4;
                        var15_15 = Js3.d((Ms3)var15_15);
                        try {
                            Js3.g((String)var17_18, (Ms3)var15_15);
                        }
                        catch (SubtitleDecoderException v1) {
                            var2_2 = "Failed parsing fontSize value: ";
                            KW.b((String)var2_2, (String)var17_18);
                        }
                        ** GOTO lbl171
                    }
                    case 9: {
                        var23_24 /* !! */  = var4_4;
                        var2_2 = Ascii.toLowerCase((String)var17_18);
                        var2_2.getClass();
                        var4_4 = "all";
                        var26_27 = (int)var2_2.equals(var4_4);
                        if (var26_27 != 0) ** GOTO lbl367
                        var25_26 = (int)var2_2.equals(var3_3);
                        if (var25_26 != 0) {
                            var15_15 = Js3.d((Ms3)var15_15);
                            var25_26 = 0;
                            var2_2 = null;
                            var15_15.q = 0;
                        }
                        ** GOTO lbl171
lbl367:
                        // 1 sources

                        var15_15 = Js3.d((Ms3)var15_15);
                        var15_15.q = var25_26 = 1;
                        ** GOTO lbl171
                    }
                    case 8: {
                        var23_24 /* !! */  = var4_4;
                        var2_2 = Js3.d((Ms3)var15_15);
                        var15_15 = Js3.e.matcher((CharSequence)var17_18);
                        var26_27 = (int)var15_15.matches();
                        var12_12 = 0x7F7FFFFF;
                        var13_13 = 3.4028235E38f;
                        if (var26_27 == 0) {
                            var15_15 = "Invalid value for shear: ";
                            KW.b((String)var15_15, (String)var17_18);
                        } else {
                            var26_27 = 1;
                            var27_28 = 1.4E-45f;
                            var15_15 = var15_15.group(var26_27);
                            var15_15.getClass();
                            var29_30 = Float.parseFloat((String)var15_15);
                            var26_27 = -1027080192;
                            var27_28 = -100.0f;
                            var29_30 = Math.max(var27_28, var29_30);
                            var26_27 = 1120403456;
                            var27_28 = 100.0f;
                            try {
                                var13_13 = Math.min(var27_28, var29_30);
                            }
                            catch (NumberFormatException var15_16) {
                                var18_19 = "Failed to parse shear: ";
                                var4_4 = new StringBuilder((String)var18_19);
                                var4_4.append((String)var17_18);
                                var4_4 = var4_4.toString();
                                Cx.g((String)var4_4, var15_16);
                            }
                        }
                        var2_2.s = var13_13;
                        var15_15 = var2_2;
                        ** GOTO lbl171
                    }
                    case 7: {
                        var23_24 /* !! */  = var4_4;
                        var15_15 = Js3.d((Ms3)var15_15);
                        var25_26 = 0;
                        var2_2 = null;
                        var26_27 = fy_1.a((String)var17_18, false);
                        var15_15.b = var26_27;
                        var25_26 = 1;
                        try {
                            var15_15.c = var25_26;
                        }
                        catch (IllegalArgumentException v2) {
                            var2_2 = "Failed parsing color value: ";
                            KW.b((String)var2_2, (String)var17_18);
                        }
                        ** continue;
                    }
                    case 6: {
                        var23_24 /* !! */  = var4_4;
                        var2_2 = Ascii.toLowerCase((String)var17_18);
                        var2_2.getClass();
                        var26_27 = var2_2.hashCode();
                        switch (var26_27) lbl-1000:
                        // 7 sources

                        {
                            default: {
                                var25_26 = -1;
                                break;
                            }
                            case 3556653: {
                                var4_4 = "text";
                                var25_26 = (int)var2_2.equals(var4_4);
                                if (var25_26 == 0) ** GOTO lbl-1000
                                var25_26 = 5;
                                break;
                            }
                            case 3016401: {
                                var4_4 = "base";
                                var25_26 = (int)var2_2.equals(var4_4);
                                if (var25_26 == 0) ** GOTO lbl-1000
                                var25_26 = 4;
                                break;
                            }
                            case -136074796: {
                                var4_4 = "textContainer";
                                var25_26 = (int)var2_2.equals(var4_4);
                                if (var25_26 == 0) ** GOTO lbl-1000
                                var25_26 = 3;
                                break;
                            }
                            case -250518009: {
                                var4_4 = "delimiter";
                                var25_26 = (int)var2_2.equals(var4_4);
                                if (var25_26 == 0) ** GOTO lbl-1000
                                var25_26 = 2;
                                break;
                            }
                            case -410956671: {
                                var4_4 = "container";
                                var25_26 = (int)var2_2.equals(var4_4);
                                if (var25_26 == 0) ** GOTO lbl-1000
                                var25_26 = 1;
                                break;
                            }
                            case -618561360: {
                                var4_4 = "baseContainer";
                                var25_26 = (int)var2_2.equals(var4_4);
                                if (var25_26 == 0) ** GOTO lbl-1000
                                var25_26 = 0;
                                var2_2 = null;
                            }
                        }
                        block66 : switch (var25_26) {
                            default: lbl-1000:
                            // 2 sources

                            {
                                var25_26 = 4;
                                var26_27 = 2;
                                var27_28 = 2.8E-45f;
                                var21_22 = 3;
                                break;
                            }
                            case 3: 
                            case 5: {
                                var15_15 = Js3.d((Ms3)var15_15);
                                var15_15.m = var21_22 = 3;
                                var25_26 = 4;
lbl482:
                                // 3 sources

                                while (true) {
                                    var26_27 = 2;
                                    var27_28 = 2.8E-45f;
                                    break block66;
                                    break;
                                }
                            }
                            case 2: {
                                var21_22 = 3;
                                var15_15 = Js3.d((Ms3)var15_15);
                                var15_15.m = var25_26 = 4;
                                ** GOTO lbl482
                            }
                            case 1: {
                                var25_26 = 4;
                                var21_22 = 3;
                                var15_15 = Js3.d((Ms3)var15_15);
                                var26_27 = 1;
                                var27_28 = 1.4E-45f;
                                var15_15.m = var26_27;
                                ** continue;
                            }
                            case 0: 
                            case 4: {
                                var25_26 = 4;
                                var21_22 = 3;
                                var15_15 = Js3.d((Ms3)var15_15);
                                var26_27 = 2;
                                var27_28 = 2.8E-45f;
                                var15_15.m = var26_27;
                            }
                        }
lbl506:
                        // 6 sources

                        while (true) {
                            var12_12 = 1;
                            var13_13 = 1.4E-45f;
                            ** continue;
                            break;
                        }
                    }
                    case 5: {
                        var23_24 /* !! */  = var4_4;
                        var25_26 = 4;
                        var26_27 = 2;
                        var27_28 = 2.8E-45f;
                        var21_22 = 3;
                        var14_14 = "style";
                        var22_23 = var0.getName();
                        var12_12 = (int)var14_14.equals(var22_23);
                        if (var12_12 == 0) ** GOTO lbl506
                        var15_15 = Js3.d((Ms3)var15_15);
                        var15_15.l = var17_18;
                        ** GOTO lbl506
                    }
                    case 4: {
                        var23_24 /* !! */  = var4_4;
                        var25_26 = 4;
                        var26_27 = 2;
                        var27_28 = 2.8E-45f;
                        var21_22 = 3;
                        var15_15 = Js3.d((Ms3)var15_15);
                        var14_14 = "bold";
                        var15_15.h = var12_12 = (int)var14_14.equalsIgnoreCase((String)var17_18);
                        ** continue;
                    }
                    case 3: {
                        var23_24 /* !! */  = var4_4;
                        var25_26 = 4;
                        var26_27 = 2;
                        var27_28 = 2.8E-45f;
                        var21_22 = 3;
                        var14_14 = Ascii.toLowerCase((String)var17_18);
                        var14_14.getClass();
                        var24_25 = var14_14.hashCode();
                        switch (var24_25) lbl-1000:
                        // 5 sources

                        {
                            default: {
                                var12_12 = -1;
                                var13_13 = 0.0f / 0.0f;
                                break;
                            }
                            case 1679736913: {
                                var17_18 = "linethrough";
                                var12_12 = (int)var14_14.equals(var17_18);
                                if (var12_12 == 0) ** GOTO lbl-1000
                                var12_12 = 3;
                                var13_13 = 4.2E-45f;
                                break;
                            }
                            case 913457136: {
                                var17_18 = "nolinethrough";
                                var12_12 = (int)var14_14.equals(var17_18);
                                if (var12_12 == 0) ** GOTO lbl-1000
                                var12_12 = 2;
                                var13_13 = 2.8E-45f;
                                break;
                            }
                            case -1026963764: {
                                var17_18 = "underline";
                                var12_12 = (int)var14_14.equals(var17_18);
                                if (var12_12 == 0) ** GOTO lbl-1000
                                var12_12 = 1;
                                var13_13 = 1.4E-45f;
                                break;
                            }
                            case -1461280213: {
                                var17_18 = "nounderline";
                                var12_12 = (int)var14_14.equals(var17_18);
                                if (var12_12 == 0) ** GOTO lbl-1000
                                var12_12 = 0;
                                var13_13 = 0.0f;
                                var14_14 = null;
                            }
                        }
                        switch (var12_12) lbl-1000:
                        // 2 sources

                        {
                            default: {
                                var28_29 = 0;
                                var22_23 = null;
                                break;
                            }
                            case 3: {
                                var15_15 = Js3.d((Ms3)var15_15);
                                var12_12 = 1;
                                var13_13 = 1.4E-45f;
                                var15_15.f = var12_12;
                                ** GOTO lbl-1000
                            }
                            case 2: {
                                var12_12 = 1;
                                var13_13 = 1.4E-45f;
                                var15_15 = Js3.d((Ms3)var15_15);
                                var28_29 = 0;
                                var22_23 = null;
                                var15_15.f = 0;
                                break;
                            }
                            case 1: {
                                var12_12 = 1;
                                var13_13 = 1.4E-45f;
                                var28_29 = 0;
                                var22_23 = null;
                                var15_15 = Js3.d((Ms3)var15_15);
                                var15_15.g = var12_12;
                                break;
                            }
                            case 0: {
                                var28_29 = 0;
                                var22_23 = null;
                                var15_15 = Js3.d((Ms3)var15_15);
                                var15_15.g = 0;
                            }
                        }
lbl608:
                        // 7 sources

                        while (true) {
                            var12_12 = 1;
                            var13_13 = 1.4E-45f;
                            break block134;
                            break;
                        }
                    }
                    case 2: {
                        var23_24 /* !! */  = var4_4;
                        var25_26 = 4;
                        var26_27 = 2;
                        var27_28 = 2.8E-45f;
                        var21_22 = 3;
                        var28_29 = 0;
                        var22_23 = null;
                        var15_15 = Js3.d((Ms3)var15_15);
                        var14_14 = Ascii.toLowerCase((String)var17_18);
                        var14_14.getClass();
                        var24_25 = var14_14.hashCode();
                        switch (var24_25) lbl-1000:
                        // 6 sources

                        {
                            default: {
                                var12_12 = -1;
                                var13_13 = 0.0f / 0.0f;
                                break;
                            }
                            case 109757538: {
                                var12_12 = (int)var14_14.equals(var6_6);
                                if (var12_12 == 0) ** GOTO lbl-1000
                                var12_12 = 4;
                                var13_13 = 5.6E-45f;
                                break;
                            }
                            case 108511772: {
                                var12_12 = (int)var14_14.equals(var7_7);
                                if (var12_12 == 0) ** GOTO lbl-1000
                                var12_12 = 3;
                                var13_13 = 4.2E-45f;
                                break;
                            }
                            case 3317767: {
                                var12_12 = (int)var14_14.equals(var8_8);
                                if (var12_12 == 0) ** GOTO lbl-1000
                                var12_12 = 2;
                                var13_13 = 2.8E-45f;
                                break;
                            }
                            case 100571: {
                                var12_12 = (int)var14_14.equals(var9_9);
                                if (var12_12 == 0) ** GOTO lbl-1000
                                var12_12 = 1;
                                var13_13 = 1.4E-45f;
                                break;
                            }
                            case -1364013995: {
                                var12_12 = (int)var14_14.equals(var10_10);
                                if (var12_12 == 0) ** GOTO lbl-1000
                                var12_12 = 0;
                                var13_13 = 0.0f;
                                var14_14 = null;
                            }
                        }
                        switch (var12_12) lbl-1000:
                        // 4 sources

                        {
                            default: {
                                var14_14 = var19_20 /* !! */ ;
                                break;
                            }
                            case 2: 
                            case 4: {
                                var19_20 /* !! */  = Layout.Alignment.ALIGN_NORMAL;
                                ** GOTO lbl-1000
                            }
                            case 1: 
                            case 3: {
                                var19_20 /* !! */  = Layout.Alignment.ALIGN_OPPOSITE;
                                ** GOTO lbl-1000
                            }
                            case 0: {
                                var19_20 /* !! */  = Layout.Alignment.ALIGN_CENTER;
                                ** GOTO lbl-1000
                            }
                        }
                        var15_15.o = var19_20 /* !! */ ;
                        ** GOTO lbl608
                    }
                    case 1: {
                        var23_24 /* !! */  = var4_4;
                        var25_26 = 4;
                        var26_27 = 2;
                        var27_28 = 2.8E-45f;
                        var21_22 = 3;
                        var28_29 = 0;
                        var22_23 = null;
                        var15_15 = Js3.d((Ms3)var15_15);
                        var15_15.a = var17_18;
                        ** GOTO lbl608
                    }
                    case 0: 
                }
                var23_24 /* !! */  = var4_4;
                var25_26 = 4;
                var26_27 = 2;
                var27_28 = 2.8E-45f;
                var21_22 = 3;
                var28_29 = 0;
                var22_23 = null;
                var15_15 = Js3.d((Ms3)var15_15);
                var14_14 = "italic";
                var15_15.i = var12_12 = (int)var14_14.equalsIgnoreCase((String)var17_18);
                ** continue;
            }
            var2_2 = var0;
            var4_4 = var23_24 /* !! */ ;
            var12_12 = 0;
            var13_13 = 0.0f;
            var14_14 = null;
        }
        return var15_15;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static long l(String string2, Js3$a object) {
        double d2;
        int n3;
        double d5;
        double d7;
        int n4;
        block21: {
            String string3;
            block22: {
                n4 = 4;
                int n7 = 3;
                Matcher matcher = b.matcher(string2);
                int n8 = matcher.matches();
                d7 = 1000000.0;
                int n10 = 2;
                int n14 = 1;
                if (n8 != 0) {
                    string2 = matcher.group(n14);
                    string2.getClass();
                    long l2 = Long.parseLong(string2) * 3600L;
                    double d9 = l2;
                    string2 = matcher.group(n10);
                    string2.getClass();
                    long l3 = Long.parseLong(string2);
                    long l4 = 60;
                    double d12 = l3 * l4;
                    d9 += d12;
                    string2 = matcher.group(n7);
                    string2.getClass();
                    l3 = Long.parseLong(string2);
                    d12 = l3;
                    d9 += d12;
                    string2 = matcher.group(n4);
                    long l7 = 0L;
                    double d13 = 0.0;
                    if (string2 != null) {
                        d12 = Double.parseDouble(string2);
                    } else {
                        l3 = l7;
                        d12 = d13;
                    }
                    d9 += d12;
                    int n15 = 5;
                    float f5 = 7.0E-45f;
                    string2 = matcher.group(n15);
                    if (string2 != null) {
                        l3 = Long.parseLong(string2);
                        f5 = l3;
                        float f6 = ((Js3$a)object).a;
                        d12 = f5 /= f6;
                    } else {
                        l3 = l7;
                        d12 = d13;
                    }
                    d9 += d12;
                    n15 = 6;
                    f5 = 8.4E-45f;
                    string2 = matcher.group(n15);
                    if (string2 == null) return (long)((d9 + d13) * d7);
                    l7 = Long.parseLong(string2);
                    d13 = l7;
                    n15 = ((Js3$a)object).b;
                    double d14 = n15;
                    d13 /= d14;
                    f5 = ((Js3$a)object).a;
                    double d15 = f5;
                    d13 /= d15;
                    return (long)((d9 + d13) * d7);
                }
                matcher = c.matcher(string2);
                n8 = matcher.matches();
                if (n8 == 0) {
                    string2 = kp1_0.c("Malformed time expression: ", string2);
                    object = new Exception(string2);
                    throw object;
                }
                string2 = matcher.group(n14);
                string2.getClass();
                d5 = Double.parseDouble(string2);
                string2 = matcher.group(n10);
                string2.getClass();
                n8 = string2.hashCode();
                switch (n8) {
                    case 3494: {
                        String string4 = "ms";
                        n3 = string2.equals(string4);
                        if (n3 == 0) {
                            break;
                        }
                        break block21;
                    }
                    case 116: {
                        String string5 = "t";
                        n3 = string2.equals(string5);
                        if (n3 == 0) break;
                        n4 = 3;
                        break block21;
                    }
                    case 109: {
                        String string6 = "m";
                        n3 = string2.equals(string6);
                        if (n3 == 0) break;
                        n4 = 2;
                        break block21;
                    }
                    case 104: {
                        String string7 = "h";
                        n3 = string2.equals(string7);
                        if (n3 == 0) break;
                        n4 = 1;
                        break block21;
                    }
                    case 102: {
                        string3 = "f";
                        n3 = string2.equals(string3);
                        if (n3 != 0) break block22;
                    }
                }
                n4 = -1;
                break block21;
            }
            n4 = 0;
            string3 = null;
        }
        switch (n4) {
            default: {
                return (long)(d5 * d7);
            }
            case 4: {
                d2 = 1000.0;
                return (long)((d5 /= d2) * d7);
            }
            case 3: {
                n3 = ((Js3$a)object).c;
                d2 = n3;
                return (long)((d5 /= d2) * d7);
            }
            case 2: {
                double d16 = 60.0;
                return (long)((d5 *= d16) * d7);
            }
            case 1: {
                double d16 = 3600.0;
                return (long)((d5 *= d16) * d7);
            }
            case 0: 
        }
        float f7 = ((Js3$a)object).a;
        d2 = f7;
        return (long)((d5 /= d2) * d7);
    }

    public static Js3$b m(XmlPullParser object) {
        String string2;
        if ((object = nk_0.b(object, "extent")) == null) {
            return null;
        }
        Object object2 = g.matcher((CharSequence)object);
        int n3 = (int)(((Matcher)object2).matches() ? 1 : 0);
        if (n3 == 0) {
            Cx.f("Ignoring non-pixel tts extent: ".concat((String)object));
            return null;
        }
        n3 = 1;
        try {
            string2 = ((Matcher)object2).group(n3);
        }
        catch (NumberFormatException numberFormatException) {
            Cx.f("Ignoring malformed tts extent: ".concat((String)object));
            return null;
        }
        string2.getClass();
        n3 = Integer.parseInt(string2);
        int n4 = 2;
        object2 = ((Matcher)object2).group(n4);
        object2.getClass();
        int n7 = Integer.parseInt((String)object2);
        Js3$b js3$b = new Js3$b(n3, n7);
        return js3$b;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final lf3_0 a(int n3, byte[] byArray, int n4) {
        Object object;
        int n7;
        int n8;
        int n10;
        Object object2;
        ArrayDeque<Object> arrayDeque;
        ArrayList arrayList;
        int n14;
        int n15;
        Object object3;
        HashMap hashMap;
        HashMap<XmlPullParserFactory, Ks3> hashMap2;
        HashMap hashMap3;
        XmlPullParser xmlPullParser;
        Object object4;
        block22: {
            XmlPullParserException xmlPullParserException2;
            block23: {
                try {
                    object4 = this.a;
                    xmlPullParser = object4.newPullParser();
                    hashMap3 = new HashMap();
                    hashMap2 = new HashMap<XmlPullParserFactory, Ks3>();
                    hashMap = new HashMap();
                    object4 = "";
                    object3 = "";
                    n15 = -1 << -1;
                    float f5 = -3.4028235E38f;
                    float f6 = -3.4028235E38f;
                    int n16 = -1 << -1;
                    float f7 = -3.4028235E38f;
                    int n17 = -1 << -1;
                    n14 = -8388609;
                    float f8 = -3.4028235E38f;
                    float f11 = -3.4028235E38f;
                    int n18 = -1 << -1;
                    arrayDeque = arrayList;
                    arrayList = new ArrayList((String)object3, f8, f11, n18, n15, f5, f6, n16, f7, n17);
                    hashMap2.put((XmlPullParserFactory)object4, (Ks3)((Object)arrayList));
                    object2 = byArray;
                    n10 = n4;
                    object4 = new ByteArrayInputStream(byArray, n3, n4);
                    arrayList = null;
                    xmlPullParser.setInput((InputStream)object4, null);
                    arrayDeque = new ArrayDeque<Object>();
                    n8 = xmlPullParser.getEventType();
                    object2 = i;
                    n10 = 15;
                    n7 = 0;
                    object = null;
                    object3 = null;
                    n14 = 0;
                    f8 = 0.0f;
                    break block22;
                }
                catch (IOException iOException) {
                }
                catch (XmlPullParserException xmlPullParserException2) {
                    break block23;
                }
                IllegalStateException illegalStateException = new IllegalStateException("Unexpected error when reading input.", iOException);
                throw illegalStateException;
            }
            IllegalStateException illegalStateException = new IllegalStateException("Unable to decode source", xmlPullParserException2);
            throw illegalStateException;
        }
        while (true) {
            block26: {
                int n19;
                block24: {
                    Cloneable cloneable;
                    block25: {
                        if (n8 == (n7 = 1)) {
                            object3.getClass();
                            return object3;
                        }
                        object = arrayDeque.peek();
                        object = (Is3)object;
                        n19 = 2;
                        if (n14 != 0) break block24;
                        Object object5 = xmlPullParser.getName();
                        cloneable = "tt";
                        if (n8 != n19) break block25;
                        n8 = (int)(((String)((Object)cloneable)).equals(object5) ? 1 : 0);
                        if (n8 != 0) {
                            object2 = Js3.h(xmlPullParser);
                            n10 = Js3.f(xmlPullParser);
                            arrayList = Js3.m(xmlPullParser);
                        }
                        Ks3 ks3 = arrayList;
                        Object object6 = object2;
                        n15 = n10;
                        n8 = (int)(Js3.e((String)object5) ? 1 : 0);
                        if (n8 == 0) {
                            object4 = new StringBuilder();
                            arrayList = "Ignoring unsupported tag: ";
                            ((StringBuilder)object4).append((String)((Object)arrayList));
                            arrayList = xmlPullParser.getName();
                            ((StringBuilder)object4).append((String)((Object)arrayList));
                            object4 = ((StringBuilder)object4).toString();
                            Cx.e((String)object4);
                            ++n14;
                        } else {
                            object4 = "head";
                            n8 = (int)(((String)object4).equals(object5) ? 1 : 0);
                            if (n8 != 0) {
                                arrayList = xmlPullParser;
                                object2 = hashMap3;
                                object = ks3;
                                cloneable = hashMap2;
                                object5 = object6;
                                object6 = hashMap;
                                Js3.i(xmlPullParser, hashMap3, n10, (Js3$b)((Object)ks3), hashMap2, hashMap);
                            } else {
                                object5 = object2;
                                try {
                                    object4 = Js3.j(xmlPullParser, (Is3)object, hashMap2, (Js3$a)object2);
                                    arrayDeque.push(object4);
                                    if (object != null) {
                                        arrayList = ((Is3)object).m;
                                        if (arrayList == null) {
                                            ((Is3)object).m = arrayList = new ArrayList();
                                        }
                                        arrayList = ((Is3)object).m;
                                        arrayList.add(object4);
                                    }
                                }
                                catch (SubtitleDecoderException subtitleDecoderException) {
                                    arrayList = "Suppressing parser error";
                                    Cx.g((String)((Object)arrayList), subtitleDecoderException);
                                    ++n14;
                                }
                            }
                            object2 = object5;
                        }
                        arrayList = ks3;
                        n10 = n15;
                        break block26;
                    }
                    n19 = 4;
                    if (n8 == n19) {
                        object.getClass();
                        object4 = xmlPullParser.getText();
                        object4 = Is3.a((String)object4);
                        cloneable = ((Is3)object).m;
                        if (cloneable == null) {
                            ((Is3)object).m = cloneable = new Cloneable();
                        }
                        object = ((Is3)object).m;
                        ((ArrayList)object).add(object4);
                        break block26;
                    } else {
                        n7 = 3;
                        if (n8 == n7) {
                            object4 = xmlPullParser.getName();
                            n8 = (int)(((String)object4).equals(cloneable) ? 1 : 0);
                            if (n8 != 0) {
                                object4 = arrayDeque.peek();
                                object4 = (Is3)object4;
                                object4.getClass();
                                object3 = new Ns3((Is3)object4, hashMap3, hashMap2, hashMap);
                            }
                            arrayDeque.pop();
                        }
                    }
                    break block26;
                }
                if (n8 == n19) {
                    ++n14;
                } else {
                    n7 = 3;
                    if (n8 == n7) {
                        n14 += -1;
                    }
                }
            }
            xmlPullParser.next();
            n8 = xmlPullParser.getEventType();
        }
    }

    public final void b(byte[] byArray, int n3, int n4, Vf3$b vf3$b, n60_0 n60_02) {
        Ut1.b(this.a(n3, byArray, n4), vf3$b, n60_02);
    }

    public final int c() {
        return 1;
    }

    public final /* synthetic */ void reset() {
    }
}

