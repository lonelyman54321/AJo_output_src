/*
 * Decompiled with CFR 0.152.
 */
import java.util.HashMap;
import java.util.Map;

public final class uR2$h
extends Enum {
    private static final /* synthetic */ uR2$h[] $VALUES;
    public static final /* enum */ uR2$h SWITCH;
    public static final /* enum */ uR2$h UNSUPPORTED;
    public static final /* enum */ uR2$h a;
    private static final Map cache;
    public static final /* enum */ uR2$h circle;
    public static final /* enum */ uR2$h clipPath;
    public static final /* enum */ uR2$h defs;
    public static final /* enum */ uR2$h desc;
    public static final /* enum */ uR2$h ellipse;
    public static final /* enum */ uR2$h g;
    public static final /* enum */ uR2$h image;
    public static final /* enum */ uR2$h line;
    public static final /* enum */ uR2$h linearGradient;
    public static final /* enum */ uR2$h marker;
    public static final /* enum */ uR2$h mask;
    public static final /* enum */ uR2$h path;
    public static final /* enum */ uR2$h pattern;
    public static final /* enum */ uR2$h polygon;
    public static final /* enum */ uR2$h polyline;
    public static final /* enum */ uR2$h radialGradient;
    public static final /* enum */ uR2$h rect;
    public static final /* enum */ uR2$h solidColor;
    public static final /* enum */ uR2$h stop;
    public static final /* enum */ uR2$h style;
    public static final /* enum */ uR2$h svg;
    public static final /* enum */ uR2$h symbol;
    public static final /* enum */ uR2$h text;
    public static final /* enum */ uR2$h textPath;
    public static final /* enum */ uR2$h title;
    public static final /* enum */ uR2$h tref;
    public static final /* enum */ uR2$h tspan;
    public static final /* enum */ uR2$h use;
    public static final /* enum */ uR2$h view;

    /*
     * Enabled aggressive block sorting
     */
    static {
        uR2$h uR2$h;
        uR2$h uR2$h2;
        uR2$h uR2$h3;
        uR2$h uR2$h4;
        uR2$h uR2$h5;
        uR2$h uR2$h6;
        uR2$h uR2$h7;
        uR2$h uR2$h8;
        uR2$h uR2$h9;
        uR2$h uR2$h10;
        uR2$h uR2$h11;
        uR2$h uR2$h12;
        uR2$h uR2$h13;
        uR2$h uR2$h14;
        uR2$h uR2$h15;
        uR2$h uR2$h16;
        uR2$h uR2$h17;
        uR2$h uR2$h18;
        uR2$h uR2$h19;
        uR2$h uR2$h20;
        uR2$h[] uR2$hArray = new uR2$h("svg", 0);
        svg = uR2$hArray;
        a = uR2$h20 = new uR2$h("a", 1);
        circle = uR2$h19 = new uR2$h("circle", 2);
        Object object = new uR2$h("clipPath", 3);
        clipPath = object;
        defs = uR2$h18 = new uR2$h("defs", 4);
        desc = uR2$h17 = new uR2$h("desc", 5);
        ellipse = uR2$h16 = new uR2$h("ellipse", 6);
        int n3 = 7;
        g = uR2$h15 = new uR2$h("g", n3);
        int n4 = 8;
        image = uR2$h14 = new uR2$h("image", n4);
        int n7 = 9;
        line = uR2$h13 = new uR2$h("line", n7);
        int n8 = 10;
        linearGradient = uR2$h12 = new uR2$h("linearGradient", n8);
        marker = uR2$h11 = new uR2$h("marker", 11);
        mask = uR2$h10 = new uR2$h("mask", 12);
        path = uR2$h9 = new uR2$h("path", 13);
        uR2$h uR2$h21 = uR2$h9;
        pattern = uR2$h8 = new uR2$h("pattern", 14);
        uR2$h uR2$h22 = uR2$h8;
        polygon = uR2$h7 = new uR2$h("polygon", 15);
        uR2$h uR2$h23 = uR2$h7;
        polyline = uR2$h9 = new uR2$h("polyline", 16);
        uR2$h uR2$h24 = uR2$h9;
        radialGradient = uR2$h6 = new uR2$h("radialGradient", 17);
        uR2$h uR2$h25 = uR2$h6;
        rect = uR2$h7 = new uR2$h("rect", 18);
        uR2$h uR2$h26 = uR2$h7;
        solidColor = uR2$h9 = new uR2$h("solidColor", 19);
        uR2$h uR2$h27 = uR2$h9;
        stop = uR2$h5 = new uR2$h("stop", 20);
        uR2$h uR2$h28 = uR2$h5;
        style = uR2$h7 = new uR2$h("style", 21);
        uR2$h uR2$h29 = uR2$h7;
        SWITCH = uR2$h9 = new uR2$h("SWITCH", 22);
        uR2$h uR2$h30 = uR2$h9;
        symbol = uR2$h7 = new uR2$h("symbol", 23);
        uR2$h uR2$h31 = uR2$h7;
        text = uR2$h4 = new uR2$h("text", 24);
        uR2$h uR2$h32 = uR2$h4;
        textPath = uR2$h7 = new uR2$h("textPath", 25);
        uR2$h uR2$h33 = uR2$h7;
        title = uR2$h3 = new uR2$h("title", 26);
        uR2$h uR2$h34 = uR2$h3;
        tref = uR2$h7 = new uR2$h("tref", 27);
        uR2$h uR2$h35 = uR2$h7;
        tspan = uR2$h2 = new uR2$h("tspan", 28);
        uR2$h uR2$h36 = uR2$h2;
        use = uR2$h7 = new uR2$h("use", 29);
        uR2$h uR2$h37 = uR2$h7;
        view = uR2$h = new uR2$h("view", 30);
        uR2$h uR2$h38 = uR2$h;
        UNSUPPORTED = uR2$h7 = new uR2$h("UNSUPPORTED", 31);
        int n10 = 32;
        uR2$h[] uR2$hArray2 = new uR2$h[n10];
        uR2$h9 = null;
        uR2$hArray2[0] = uR2$hArray;
        uR2$hArray2[1] = uR2$h20;
        uR2$hArray2[2] = uR2$h19;
        uR2$hArray2[3] = object;
        uR2$hArray2[4] = uR2$h18;
        uR2$hArray2[5] = uR2$h17;
        uR2$hArray2[6] = uR2$h16;
        uR2$hArray2[7] = uR2$h15;
        uR2$hArray2[8] = uR2$h14;
        uR2$hArray2[9] = uR2$h13;
        uR2$hArray2[10] = uR2$h12;
        uR2$hArray2[11] = uR2$h11;
        uR2$hArray2[12] = uR2$h10;
        uR2$hArray2[13] = uR2$h21;
        uR2$hArray2[14] = uR2$h22;
        uR2$hArray2[15] = uR2$h23;
        uR2$hArray2[16] = uR2$h24;
        uR2$hArray2[17] = uR2$h25;
        uR2$hArray2[18] = uR2$h26;
        uR2$hArray2[19] = uR2$h27;
        uR2$hArray2[20] = uR2$h28;
        uR2$hArray2[21] = uR2$h29;
        uR2$hArray2[22] = uR2$h30;
        uR2$hArray2[23] = uR2$h31;
        uR2$hArray2[24] = uR2$h32;
        uR2$hArray2[25] = uR2$h33;
        uR2$hArray2[26] = uR2$h34;
        uR2$hArray2[27] = uR2$h35;
        uR2$hArray2[28] = uR2$h36;
        uR2$hArray2[29] = uR2$h37;
        uR2$hArray2[30] = uR2$h38;
        int n14 = 31;
        uR2$hArray2[n14] = uR2$h7;
        $VALUES = uR2$hArray2;
        uR2$hArray = new HashMap();
        cache = uR2$hArray;
        uR2$hArray = uR2$h.values();
        int n15 = uR2$hArray.length;
        int n16 = 0;
        uR2$h7 = null;
        while (n16 < n15) {
            uR2$h19 = uR2$hArray[n16];
            uR2$h uR2$h39 = SWITCH;
            if (uR2$h19 == uR2$h39) {
                Map map2 = cache;
                object = "switch";
                map2.put(object, uR2$h19);
            } else {
                uR2$h uR2$h40 = UNSUPPORTED;
                if (uR2$h19 != uR2$h40) {
                    String string2 = uR2$h19.name();
                    object = cache;
                    object.put(string2, uR2$h19);
                }
            }
            int n17 = 1;
            n16 += n17;
        }
        return;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private uR2$h() {
        void var2_-1;
        void var1_-1;
    }

    public static uR2$h fromString(String object) {
        Map map2 = cache;
        if ((object = (uR2$h)((Object)map2.get(object))) != null) {
            return object;
        }
        return UNSUPPORTED;
    }

    public static uR2$h valueOf(String string2) {
        return Enum.valueOf(uR2$h.class, string2);
    }

    public static uR2$h[] values() {
        return (uR2$h[])$VALUES.clone();
    }
}

