/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Color
 *  android.text.TextUtils
 */
import android.graphics.Color;
import android.text.TextUtils;
import com.google.common.base.Ascii;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * Renamed from fY
 */
public final class fy_1 {
    public static final Pattern a;
    public static final Pattern b;
    public static final Pattern c;
    public static final HashMap d;

    static {
        HashMap<String, Integer> hashMap;
        a = Pattern.compile("^rgb\\((\\d{1,3}),(\\d{1,3}),(\\d{1,3})\\)$");
        b = Pattern.compile("^rgba\\((\\d{1,3}),(\\d{1,3}),(\\d{1,3}),(\\d{1,3})\\)$");
        c = Pattern.compile("^rgba\\((\\d{1,3}),(\\d{1,3}),(\\d{1,3}),(\\d*\\.?\\d*?)\\)$");
        d = hashMap = new HashMap<String, Integer>();
        cy_1.a(-984833, hashMap, "aliceblue", -332841, "antiquewhite");
        Integer n3 = -16711681;
        dy_1.a(-8388652, n3, "aqua", "aquamarine", hashMap);
        cy_1.a(-983041, hashMap, "azure", -657956, "beige");
        cy_1.a(-6972, hashMap, "bisque", -16777216, "black");
        cy_1.a(-5171, hashMap, "blanchedalmond", -16776961, "blue");
        cy_1.a(-7722014, hashMap, "blueviolet", -5952982, "brown");
        cy_1.a(-2180985, hashMap, "burlywood", -10510688, "cadetblue");
        cy_1.a(-8388864, hashMap, "chartreuse", -2987746, "chocolate");
        cy_1.a(-32944, hashMap, "coral", -10185235, "cornflowerblue");
        cy_1.a(-1828, hashMap, "cornsilk", -2354116, "crimson");
        dy_1.a(-16777077, n3, "cyan", "darkblue", hashMap);
        cy_1.a(-16741493, hashMap, "darkcyan", -4684277, "darkgoldenrod");
        n3 = -5658199;
        dy_1.a(-16751616, n3, "darkgray", "darkgreen", hashMap);
        dy_1.a(-4343957, n3, "darkgrey", "darkkhaki", hashMap);
        cy_1.a(-7667573, hashMap, "darkmagenta", -11179217, "darkolivegreen");
        cy_1.a(-29696, hashMap, "darkorange", -6737204, "darkorchid");
        cy_1.a(-7667712, hashMap, "darkred", -1468806, "darksalmon");
        cy_1.a(-7357297, hashMap, "darkseagreen", -12042869, "darkslateblue");
        n3 = -13676721;
        hashMap.put("darkslategray", n3);
        hashMap.put("darkslategrey", n3);
        n3 = -16724271;
        dy_1.a(-7077677, n3, "darkturquoise", "darkviolet", hashMap);
        cy_1.a(-60269, hashMap, "deeppink", -16728065, "deepskyblue");
        n3 = -9868951;
        hashMap.put("dimgray", n3);
        hashMap.put("dimgrey", n3);
        n3 = -14774017;
        dy_1.a(-5103070, n3, "dodgerblue", "firebrick", hashMap);
        cy_1.a(-1296, hashMap, "floralwhite", -14513374, "forestgreen");
        n3 = -65281;
        dy_1.a(-2302756, n3, "fuchsia", "gainsboro", hashMap);
        cy_1.a(-460545, hashMap, "ghostwhite", -10496, "gold");
        Integer n4 = -2448096;
        hashMap.put("goldenrod", n4);
        n4 = -8355712;
        hashMap.put("gray", n4);
        cy_1.a(-16744448, hashMap, "green", -5374161, "greenyellow");
        dy_1.a(-983056, n4, "grey", "honeydew", hashMap);
        cy_1.a(-38476, hashMap, "hotpink", -3318692, "indianred");
        cy_1.a(-11861886, hashMap, "indigo", -16, "ivory");
        cy_1.a(-989556, hashMap, "khaki", -1644806, "lavender");
        cy_1.a(-3851, hashMap, "lavenderblush", -8586240, "lawngreen");
        cy_1.a(-1331, hashMap, "lemonchiffon", -5383962, "lightblue");
        cy_1.a(-1015680, hashMap, "lightcoral", -2031617, "lightcyan");
        n4 = -329006;
        hashMap.put("lightgoldenrodyellow", n4);
        n4 = -2894893;
        hashMap.put("lightgray", n4);
        Integer n7 = -7278960;
        hashMap.put("lightgreen", n7);
        hashMap.put("lightgrey", n4);
        cy_1.a(-18751, hashMap, "lightpink", -24454, "lightsalmon");
        cy_1.a(-14634326, hashMap, "lightseagreen", -7876870, "lightskyblue");
        n4 = -8943463;
        hashMap.put("lightslategray", n4);
        hashMap.put("lightslategrey", n4);
        n4 = -5192482;
        dy_1.a(-32, n4, "lightsteelblue", "lightyellow", hashMap);
        cy_1.a(-16711936, hashMap, "lime", -13447886, "limegreen");
        n4 = -331546;
        hashMap.put("linen", n4);
        hashMap.put("magenta", n3);
        cy_1.a(-8388608, hashMap, "maroon", -10039894, "mediumaquamarine");
        cy_1.a(-16777011, hashMap, "mediumblue", -4565549, "mediumorchid");
        cy_1.a(-7114533, hashMap, "mediumpurple", -12799119, "mediumseagreen");
        cy_1.a(-8689426, hashMap, "mediumslateblue", -16713062, "mediumspringgreen");
        cy_1.a(-12004916, hashMap, "mediumturquoise", -3730043, "mediumvioletred");
        cy_1.a(-15132304, hashMap, "midnightblue", -655366, "mintcream");
        cy_1.a(-6943, hashMap, "mistyrose", -6987, "moccasin");
        cy_1.a(-8531, hashMap, "navajowhite", -16777088, "navy");
        cy_1.a(-133658, hashMap, "oldlace", -8355840, "olive");
        cy_1.a(-9728477, hashMap, "olivedrab", -23296, "orange");
        cy_1.a(-47872, hashMap, "orangered", -2461482, "orchid");
        cy_1.a(-1120086, hashMap, "palegoldenrod", -6751336, "palegreen");
        cy_1.a(-5247250, hashMap, "paleturquoise", -2396013, "palevioletred");
        cy_1.a(-4139, hashMap, "papayawhip", -9543, "peachpuff");
        cy_1.a(-3308225, hashMap, "peru", -16181, "pink");
        cy_1.a(-2252579, hashMap, "plum", -5185306, "powderblue");
        cy_1.a(-8388480, hashMap, "purple", -10079335, "rebeccapurple");
        cy_1.a(-65536, hashMap, "red", -4419697, "rosybrown");
        cy_1.a(-12490271, hashMap, "royalblue", -7650029, "saddlebrown");
        cy_1.a(-360334, hashMap, "salmon", -744352, "sandybrown");
        cy_1.a(-13726889, hashMap, "seagreen", -2578, "seashell");
        cy_1.a(-6270419, hashMap, "sienna", -4144960, "silver");
        cy_1.a(-7876885, hashMap, "skyblue", -9807155, "slateblue");
        n3 = -9404272;
        hashMap.put("slategray", n3);
        hashMap.put("slategrey", n3);
        n3 = -1286;
        dy_1.a(-16711809, n3, "snow", "springgreen", hashMap);
        cy_1.a(-12156236, hashMap, "steelblue", -2968436, "tan");
        cy_1.a(-16744320, hashMap, "teal", -2572328, "thistle");
        cy_1.a(-40121, hashMap, "tomato", 0, "transparent");
        cy_1.a(-12525360, hashMap, "turquoise", -1146130, "violet");
        cy_1.a(-663885, hashMap, "wheat", -1, "white");
        cy_1.a(-657931, hashMap, "whitesmoke", -256, "yellow");
        n3 = -6632142;
        hashMap.put("yellowgreen", n3);
    }

    /*
     * WARNING - void declaration
     */
    public static int a(String object, boolean bl2) {
        int n3;
        Object object2;
        float f5;
        int n4;
        int n7;
        block13: {
            block16: {
                int n8;
                block15: {
                    int n10;
                    block14: {
                        n7 = TextUtils.isEmpty((CharSequence)object);
                        n4 = 1;
                        ct3.a(n7 ^ n4);
                        String string2 = "";
                        object = ((String)object).replace(" ", string2);
                        f5 = 0.0f;
                        object2 = null;
                        n7 = ((String)object).charAt(0);
                        n3 = 35;
                        if (n7 != n3) break block13;
                        String string3 = ((String)object).substring(n4);
                        f5 = 2.2E-44f;
                        long l2 = Long.parseLong(string3, 16);
                        n10 = (int)l2;
                        n7 = ((String)object).length();
                        if (n7 != (n4 = 7)) break block14;
                        n8 = 0xFF000000 | n10;
                        break block15;
                    }
                    n8 = ((String)object).length();
                    n7 = 9;
                    f5 = 1.3E-44f;
                    if (n8 != n7) break block16;
                    n8 = (n10 & 0xFF) << 24;
                    int n14 = n10 >>> 8;
                    n8 |= n14;
                }
                return n8;
            }
            object = new IllegalArgumentException();
            throw object;
        }
        object2 = "rgba";
        n7 = (int)(((String)object).startsWith((String)object2) ? 1 : 0);
        n3 = 3;
        int n15 = 2;
        int n16 = 10;
        if (n7 != 0) {
            object2 = bl2 ? c : b;
            object = ((Pattern)object2).matcher((CharSequence)object);
            n7 = (int)(((Matcher)object).matches() ? 1 : 0);
            if (n7 != 0) {
                void var1_6;
                n7 = 4;
                f5 = 5.6E-45f;
                if (bl2) {
                    String string4 = ((Matcher)object).group(n7);
                    string4.getClass();
                    float f6 = Float.parseFloat(string4);
                    n7 = 1132396544;
                    f5 = 255.0f;
                    int n17 = (int)(f6 *= f5);
                } else {
                    String string5 = ((Matcher)object).group(n7);
                    string5.getClass();
                    int n18 = Integer.parseInt(string5, n16);
                }
                object2 = ((Matcher)object).group(n4);
                object2.getClass();
                n7 = Integer.parseInt((String)object2, n16);
                String string6 = ((Matcher)object).group(n15);
                string6.getClass();
                n4 = Integer.parseInt(string6, n16);
                object = ((Matcher)object).group(n3);
                object.getClass();
                int n19 = Integer.parseInt((String)object, n16);
                return Color.argb((int)var1_6, (int)n7, (int)n4, (int)n19);
            }
        } else {
            Object object3 = "rgb";
            boolean bl3 = ((String)object).startsWith((String)object3);
            if (bl3) {
                object3 = a;
                boolean bl4 = ((Matcher)(object = ((Pattern)object3).matcher((CharSequence)object))).matches();
                if (bl4) {
                    object3 = ((Matcher)object).group(n4);
                    object3.getClass();
                    int n20 = Integer.parseInt((String)object3, n16);
                    object2 = ((Matcher)object).group(n15);
                    object2.getClass();
                    n7 = Integer.parseInt((String)object2, n16);
                    object = ((Matcher)object).group(n3);
                    object.getClass();
                    int n21 = Integer.parseInt((String)object, n16);
                    return Color.rgb((int)n20, (int)n7, (int)n21);
                }
            } else {
                object3 = d;
                object = Ascii.toLowerCase((String)object);
                if ((object = (Integer)((HashMap)object3).get(object)) != null) {
                    return (Integer)object;
                }
            }
        }
        object = new IllegalArgumentException();
        throw object;
    }
}

