/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Color
 *  android.text.TextUtils
 */
package com.google.android.gms.internal.ads;

import android.graphics.Color;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.zzeq;
import com.google.android.gms.internal.ads.zzfxm;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class zzet {
    private static final Pattern zza;
    private static final Pattern zzb;
    private static final Pattern zzc;
    private static final Map zzd;

    static {
        HashMap<String, Integer> hashMap;
        zza = Pattern.compile("^rgb\\((\\d{1,3}),(\\d{1,3}),(\\d{1,3})\\)$");
        zzb = Pattern.compile("^rgba\\((\\d{1,3}),(\\d{1,3}),(\\d{1,3}),(\\d{1,3})\\)$");
        zzc = Pattern.compile("^rgba\\((\\d{1,3}),(\\d{1,3}),(\\d{1,3}),(\\d*\\.?\\d*?)\\)$");
        zzd = hashMap = new HashMap<String, Integer>();
        ro.a(-984833, hashMap, "aliceblue", -332841, "antiquewhite");
        Integer n3 = -16711681;
        hashMap.put("aqua", n3);
        Integer n4 = -8388652;
        hashMap.put("aquamarine", n4);
        ro.a(-983041, hashMap, "azure", -657956, "beige");
        ro.a(-6972, hashMap, "bisque", -16777216, "black");
        ro.a(-5171, hashMap, "blanchedalmond", -16776961, "blue");
        ro.a(-7722014, hashMap, "blueviolet", -5952982, "brown");
        ro.a(-2180985, hashMap, "burlywood", -10510688, "cadetblue");
        ro.a(-8388864, hashMap, "chartreuse", -2987746, "chocolate");
        ro.a(-32944, hashMap, "coral", -10185235, "cornflowerblue");
        ro.a(-1828, hashMap, "cornsilk", -2354116, "crimson");
        hashMap.put("cyan", n3);
        n3 = -16777077;
        hashMap.put("darkblue", n3);
        ro.a(-16741493, hashMap, "darkcyan", -4684277, "darkgoldenrod");
        n3 = -5658199;
        hashMap.put("darkgray", n3);
        n4 = -16751616;
        hashMap.put("darkgreen", n4);
        hashMap.put("darkgrey", n3);
        n3 = -4343957;
        hashMap.put("darkkhaki", n3);
        ro.a(-7667573, hashMap, "darkmagenta", -11179217, "darkolivegreen");
        ro.a(-29696, hashMap, "darkorange", -6737204, "darkorchid");
        ro.a(-7667712, hashMap, "darkred", -1468806, "darksalmon");
        ro.a(-7357297, hashMap, "darkseagreen", -12042869, "darkslateblue");
        n3 = -13676721;
        hashMap.put("darkslategray", n3);
        hashMap.put("darkslategrey", n3);
        n3 = -16724271;
        hashMap.put("darkturquoise", n3);
        n3 = -7077677;
        hashMap.put("darkviolet", n3);
        ro.a(-60269, hashMap, "deeppink", -16728065, "deepskyblue");
        n3 = -9868951;
        hashMap.put("dimgray", n3);
        hashMap.put("dimgrey", n3);
        n3 = -14774017;
        hashMap.put("dodgerblue", n3);
        n3 = -5103070;
        hashMap.put("firebrick", n3);
        ro.a(-1296, hashMap, "floralwhite", -14513374, "forestgreen");
        n3 = -65281;
        hashMap.put("fuchsia", n3);
        n4 = -2302756;
        hashMap.put("gainsboro", n4);
        ro.a(-460545, hashMap, "ghostwhite", -10496, "gold");
        n4 = -2448096;
        hashMap.put("goldenrod", n4);
        n4 = -8355712;
        hashMap.put("gray", n4);
        ro.a(-16744448, hashMap, "green", -5374161, "greenyellow");
        hashMap.put("grey", n4);
        n4 = -983056;
        hashMap.put("honeydew", n4);
        ro.a(-38476, hashMap, "hotpink", -3318692, "indianred");
        ro.a(-11861886, hashMap, "indigo", -16, "ivory");
        ro.a(-989556, hashMap, "khaki", -1644806, "lavender");
        ro.a(-3851, hashMap, "lavenderblush", -8586240, "lawngreen");
        ro.a(-1331, hashMap, "lemonchiffon", -5383962, "lightblue");
        ro.a(-1015680, hashMap, "lightcoral", -2031617, "lightcyan");
        n4 = -329006;
        hashMap.put("lightgoldenrodyellow", n4);
        n4 = -2894893;
        hashMap.put("lightgray", n4);
        Integer n7 = -7278960;
        hashMap.put("lightgreen", n7);
        hashMap.put("lightgrey", n4);
        ro.a(-18751, hashMap, "lightpink", -24454, "lightsalmon");
        ro.a(-14634326, hashMap, "lightseagreen", -7876870, "lightskyblue");
        n4 = -8943463;
        hashMap.put("lightslategray", n4);
        hashMap.put("lightslategrey", n4);
        n4 = -5192482;
        hashMap.put("lightsteelblue", n4);
        n4 = -32;
        hashMap.put("lightyellow", n4);
        ro.a(-16711936, hashMap, "lime", -13447886, "limegreen");
        n4 = -331546;
        hashMap.put("linen", n4);
        hashMap.put("magenta", n3);
        ro.a(-8388608, hashMap, "maroon", -10039894, "mediumaquamarine");
        ro.a(-16777011, hashMap, "mediumblue", -4565549, "mediumorchid");
        ro.a(-7114533, hashMap, "mediumpurple", -12799119, "mediumseagreen");
        ro.a(-8689426, hashMap, "mediumslateblue", -16713062, "mediumspringgreen");
        ro.a(-12004916, hashMap, "mediumturquoise", -3730043, "mediumvioletred");
        ro.a(-15132304, hashMap, "midnightblue", -655366, "mintcream");
        ro.a(-6943, hashMap, "mistyrose", -6987, "moccasin");
        ro.a(-8531, hashMap, "navajowhite", -16777088, "navy");
        ro.a(-133658, hashMap, "oldlace", -8355840, "olive");
        ro.a(-9728477, hashMap, "olivedrab", -23296, "orange");
        ro.a(-47872, hashMap, "orangered", -2461482, "orchid");
        ro.a(-1120086, hashMap, "palegoldenrod", -6751336, "palegreen");
        ro.a(-5247250, hashMap, "paleturquoise", -2396013, "palevioletred");
        ro.a(-4139, hashMap, "papayawhip", -9543, "peachpuff");
        ro.a(-3308225, hashMap, "peru", -16181, "pink");
        ro.a(-2252579, hashMap, "plum", -5185306, "powderblue");
        ro.a(-8388480, hashMap, "purple", -10079335, "rebeccapurple");
        ro.a(-65536, hashMap, "red", -4419697, "rosybrown");
        ro.a(-12490271, hashMap, "royalblue", -7650029, "saddlebrown");
        ro.a(-360334, hashMap, "salmon", -744352, "sandybrown");
        ro.a(-13726889, hashMap, "seagreen", -2578, "seashell");
        ro.a(-6270419, hashMap, "sienna", -4144960, "silver");
        ro.a(-7876885, hashMap, "skyblue", -9807155, "slateblue");
        n3 = -9404272;
        hashMap.put("slategray", n3);
        hashMap.put("slategrey", n3);
        n3 = -1286;
        hashMap.put("snow", n3);
        n3 = -16711809;
        hashMap.put("springgreen", n3);
        ro.a(-12156236, hashMap, "steelblue", -2968436, "tan");
        ro.a(-16744320, hashMap, "teal", -2572328, "thistle");
        ro.a(-40121, hashMap, "tomato", 0, "transparent");
        ro.a(-12525360, hashMap, "turquoise", -1146130, "violet");
        ro.a(-663885, hashMap, "wheat", -1, "white");
        ro.a(-657931, hashMap, "whitesmoke", -256, "yellow");
        n3 = -6632142;
        hashMap.put("yellowgreen", n3);
    }

    public static int zza(String string2) {
        return zzet.zzc(string2, true);
    }

    public static int zzb(String string2) {
        return zzet.zzc(string2, false);
    }

    /*
     * WARNING - void declaration
     */
    private static int zzc(String object, boolean bl2) {
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
                        zzeq.zzd(n7 ^ n4);
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
            object2 = bl2 ? zzc : zzb;
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
                object3 = zza;
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
                object3 = zzd;
                object = zzfxm.zza((String)object);
                if ((object = (Integer)object3.get(object)) != null) {
                    return (Integer)object;
                }
            }
        }
        object = new IllegalArgumentException();
        throw object;
    }
}

