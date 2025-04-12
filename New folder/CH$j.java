/*
 * Decompiled with CFR 0.152.
 */
import java.util.HashMap;
import java.util.Map;

public final class CH$j
extends Enum {
    private static final /* synthetic */ CH$j[] $VALUES;
    public static final /* enum */ CH$j UNSUPPORTED;
    public static final /* enum */ CH$j active;
    private static final Map cache;
    public static final /* enum */ CH$j checked;
    public static final /* enum */ CH$j disabled;
    public static final /* enum */ CH$j empty;
    public static final /* enum */ CH$j enabled;
    public static final /* enum */ CH$j first_child;
    public static final /* enum */ CH$j first_of_type;
    public static final /* enum */ CH$j focus;
    public static final /* enum */ CH$j hover;
    public static final /* enum */ CH$j indeterminate;
    public static final /* enum */ CH$j lang;
    public static final /* enum */ CH$j last_child;
    public static final /* enum */ CH$j last_of_type;
    public static final /* enum */ CH$j link;
    public static final /* enum */ CH$j not;
    public static final /* enum */ CH$j nth_child;
    public static final /* enum */ CH$j nth_last_child;
    public static final /* enum */ CH$j nth_last_of_type;
    public static final /* enum */ CH$j nth_of_type;
    public static final /* enum */ CH$j only_child;
    public static final /* enum */ CH$j only_of_type;
    public static final /* enum */ CH$j root;
    public static final /* enum */ CH$j target;
    public static final /* enum */ CH$j visited;

    static {
        int n3;
        CH$j cH$j;
        CH$j cH$j2;
        CH$j cH$j3;
        CH$j cH$j4;
        CH$j cH$j5;
        CH$j cH$j6;
        CH$j cH$j7;
        CH$j cH$j8;
        CH$j cH$j9;
        CH$j cH$j10;
        CH$j cH$j11;
        CH$j cH$j12;
        CH$j[] cH$jArray = new CH$j("target", 0);
        target = cH$jArray;
        root = cH$j12 = new CH$j("root", 1);
        nth_child = cH$j11 = new CH$j("nth_child", 2);
        Object object = new CH$j("nth_last_child", 3);
        nth_last_child = object;
        nth_of_type = cH$j10 = new CH$j("nth_of_type", 4);
        nth_last_of_type = cH$j9 = new CH$j("nth_last_of_type", 5);
        first_child = cH$j8 = new CH$j("first_child", 6);
        int n4 = 7;
        last_child = cH$j7 = new CH$j("last_child", n4);
        int n7 = 8;
        first_of_type = cH$j6 = new CH$j("first_of_type", n7);
        int n8 = 9;
        last_of_type = cH$j5 = new CH$j("last_of_type", n8);
        int n10 = 10;
        only_child = cH$j4 = new CH$j("only_child", n10);
        only_of_type = cH$j3 = new CH$j("only_of_type", 11);
        empty = cH$j2 = new CH$j("empty", 12);
        not = cH$j = new CH$j("not", 13);
        CH$j cH$j13 = cH$j;
        Object object2 = new CH$j("lang", 14);
        lang = object2;
        CH$j cH$j14 = object2;
        CH$j[] cH$jArray2 = new CH$j("link", 15);
        link = cH$jArray2;
        CH$j[] cH$jArray3 = cH$jArray2;
        visited = cH$j = new CH$j("visited", 16);
        CH$j cH$j15 = cH$j;
        object2 = new CH$j("hover", 17);
        hover = object2;
        CH$j cH$j16 = object2;
        cH$jArray2 = new CH$j("active", 18);
        active = cH$jArray2;
        CH$j[] cH$jArray4 = cH$jArray2;
        focus = cH$j = new CH$j("focus", 19);
        CH$j cH$j17 = cH$j;
        object2 = new CH$j("enabled", 20);
        enabled = object2;
        CH$j cH$j18 = object2;
        int n14 = 21;
        cH$jArray2 = new CH$j("disabled", n14);
        disabled = cH$jArray2;
        CH$j[] cH$jArray5 = cH$jArray2;
        checked = cH$j = new CH$j("checked", 22);
        CH$j cH$j19 = cH$j;
        cH$jArray2 = new CH$j("indeterminate", 23);
        indeterminate = cH$jArray2;
        CH$j[] cH$jArray6 = cH$jArray2;
        object2 = new CH$j("UNSUPPORTED", 24);
        UNSUPPORTED = object2;
        cH$jArray2 = new CH$j[25];
        char c2 = '\u0000';
        cH$j = null;
        cH$jArray2[0] = cH$jArray;
        cH$jArray2[1] = cH$j12;
        cH$jArray2[2] = cH$j11;
        cH$jArray2[3] = object;
        cH$jArray2[4] = cH$j10;
        cH$jArray2[5] = cH$j9;
        cH$jArray2[6] = cH$j8;
        cH$jArray2[7] = cH$j7;
        cH$jArray2[8] = cH$j6;
        cH$jArray2[9] = cH$j5;
        cH$jArray2[10] = cH$j4;
        cH$jArray2[11] = cH$j3;
        cH$jArray2[12] = cH$j2;
        cH$jArray2[13] = cH$j13;
        cH$jArray2[14] = cH$j14;
        cH$jArray2[15] = cH$jArray3;
        cH$jArray2[16] = cH$j15;
        cH$jArray2[17] = cH$j16;
        cH$jArray2[18] = cH$jArray4;
        cH$jArray2[19] = cH$j17;
        cH$jArray2[20] = cH$j18;
        cH$jArray2[21] = cH$jArray5;
        cH$jArray2[22] = cH$j19;
        cH$jArray2[23] = cH$jArray6;
        int n15 = 24;
        cH$jArray2[n15] = object2;
        $VALUES = cH$jArray2;
        cH$jArray = new HashMap();
        cache = cH$jArray;
        cH$jArray = CH$j.values();
        int n16 = cH$jArray.length;
        cH$jArray2 = null;
        for (int i3 = 0; i3 < n16; i3 += n3) {
            cH$j11 = cH$jArray[i3];
            object2 = UNSUPPORTED;
            if (cH$j11 != object2) {
                object2 = cH$j11.name();
                char c3 = '_';
                c2 = '-';
                object2 = ((String)object2).replace(c3, c2);
                object = cache;
                object.put(object2, cH$j11);
            }
            n3 = 1;
        }
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private CH$j() {
        void var2_-1;
        void var1_-1;
    }

    public static CH$j fromString(String object) {
        Map map2 = cache;
        if ((object = (CH$j)((Object)map2.get(object))) != null) {
            return object;
        }
        return UNSUPPORTED;
    }

    public static CH$j valueOf(String string2) {
        return Enum.valueOf(CH$j.class, string2);
    }

    public static CH$j[] values() {
        return (CH$j[])$VALUES.clone();
    }
}

