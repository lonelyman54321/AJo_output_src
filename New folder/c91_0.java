/*
 * Decompiled with CFR 0.152.
 */
import java.io.IOException;
import java.util.AbstractMap;
import java.util.Collections;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from C91
 */
public final class c91_0 {
    public static final w31_0[] a;
    public static final Map b;

    static {
        w31_0 w31_02;
        Object object = w31_0.i;
        w31_0[] w31_0Array = "";
        Object object2 = new w31_0((ff_2)object, (String)w31_0Array);
        Object object3 = w31_0.f;
        object = new w31_0((ff_2)object3, "GET");
        w31_0 w31_03 = new w31_0((ff_2)object3, "POST");
        Object object4 = w31_0.g;
        object3 = new w31_0((ff_2)object4, "/");
        w31_0 w31_04 = new w31_0((ff_2)object4, "/index.html");
        Object object5 = w31_0.h;
        object4 = new w31_0((ff_2)object5, "http");
        w31_0 w31_05 = new w31_0((ff_2)object5, "https");
        Object object6 = w31_0.e;
        object5 = new w31_0((ff_2)object6, "200");
        w31_0 w31_06 = new w31_0((ff_2)object6, "204");
        w31_0 w31_07 = new w31_0((ff_2)object6, "206");
        w31_0 w31_08 = new w31_0((ff_2)object6, "304");
        Map<Object, Object> map2 = new Map<Object, Object>((ff_2)object6, "400");
        w31_0 w31_09 = w31_02 = new w31_0((ff_2)object6, "404");
        w31_0 w31_010 = new w31_0((ff_2)object6, "500");
        w31_0 w31_011 = w31_02 = new w31_0("accept-charset", (String)w31_0Array);
        w31_0 w31_012 = w31_010;
        object6 = new w31_0("accept-encoding", "gzip, deflate");
        w31_0 w31_013 = w31_02 = new w31_0("accept-language", (String)w31_0Array);
        w31_0 w31_014 = w31_010 = new w31_0("accept-ranges", (String)w31_0Array);
        w31_0 w31_015 = w31_02 = new w31_0("accept", (String)w31_0Array);
        w31_0 w31_016 = w31_010 = new w31_0("access-control-allow-origin", (String)w31_0Array);
        w31_0 w31_017 = w31_02 = new w31_0("age", (String)w31_0Array);
        w31_0 w31_018 = w31_010 = new w31_0("allow", (String)w31_0Array);
        w31_0 w31_019 = w31_02 = new w31_0("authorization", (String)w31_0Array);
        w31_0 w31_020 = w31_010 = new w31_0("cache-control", (String)w31_0Array);
        w31_0 w31_021 = w31_02 = new w31_0("content-disposition", (String)w31_0Array);
        w31_0 w31_022 = w31_010 = new w31_0("content-encoding", (String)w31_0Array);
        w31_0 w31_023 = w31_02 = new w31_0("content-language", (String)w31_0Array);
        w31_0 w31_024 = w31_010 = new w31_0("content-length", (String)w31_0Array);
        w31_0 w31_025 = w31_02 = new w31_0("content-location", (String)w31_0Array);
        w31_0 w31_026 = w31_010 = new w31_0("content-range", (String)w31_0Array);
        w31_0 w31_027 = w31_02 = new w31_0("content-type", (String)w31_0Array);
        w31_0 w31_028 = w31_010 = new w31_0("cookie", (String)w31_0Array);
        w31_0 w31_029 = w31_02 = new w31_0("date", (String)w31_0Array);
        w31_0 w31_030 = w31_010 = new w31_0("etag", (String)w31_0Array);
        w31_0 w31_031 = w31_02 = new w31_0("expect", (String)w31_0Array);
        w31_0 w31_032 = w31_010 = new w31_0("expires", (String)w31_0Array);
        w31_0 w31_033 = w31_02 = new w31_0("from", (String)w31_0Array);
        w31_0 w31_034 = w31_010 = new w31_0("host", (String)w31_0Array);
        w31_0 w31_035 = w31_02 = new w31_0("if-match", (String)w31_0Array);
        w31_0 w31_036 = w31_010 = new w31_0("if-modified-since", (String)w31_0Array);
        w31_0 w31_037 = w31_02 = new w31_0("if-none-match", (String)w31_0Array);
        w31_0 w31_038 = w31_010 = new w31_0("if-range", (String)w31_0Array);
        w31_0 w31_039 = w31_02 = new w31_0("if-unmodified-since", (String)w31_0Array);
        w31_0 w31_040 = w31_010 = new w31_0("last-modified", (String)w31_0Array);
        w31_0 w31_041 = w31_02 = new w31_0("link", (String)w31_0Array);
        w31_0 w31_042 = w31_010 = new w31_0("location", (String)w31_0Array);
        w31_0 w31_043 = w31_02 = new w31_0("max-forwards", (String)w31_0Array);
        w31_0 w31_044 = w31_010 = new w31_0("proxy-authenticate", (String)w31_0Array);
        w31_0 w31_045 = w31_02 = new w31_0("proxy-authorization", (String)w31_0Array);
        w31_0 w31_046 = w31_010 = new w31_0("range", (String)w31_0Array);
        w31_0 w31_047 = w31_02 = new w31_0("referer", (String)w31_0Array);
        w31_0 w31_048 = w31_010 = new w31_0("refresh", (String)w31_0Array);
        w31_0 w31_049 = w31_02 = new w31_0("retry-after", (String)w31_0Array);
        w31_0 w31_050 = w31_010 = new w31_0("server", (String)w31_0Array);
        w31_0 w31_051 = w31_02 = new w31_0("set-cookie", (String)w31_0Array);
        w31_0 w31_052 = w31_010 = new w31_0("strict-transport-security", (String)w31_0Array);
        w31_0 w31_053 = w31_02 = new w31_0("transfer-encoding", (String)w31_0Array);
        w31_0 w31_054 = w31_010 = new w31_0("user-agent", (String)w31_0Array);
        w31_0 w31_055 = w31_02 = new w31_0("vary", (String)w31_0Array);
        w31_0 w31_056 = w31_010 = new w31_0("via", (String)w31_0Array);
        w31_02 = new w31_0("www-authenticate", (String)w31_0Array);
        w31_0Array = new w31_0[61];
        w31_010 = null;
        w31_0Array[0] = object2;
        w31_0Array[1] = object;
        w31_0Array[2] = w31_03;
        w31_0Array[3] = object3;
        w31_0Array[4] = w31_04;
        w31_0Array[5] = object4;
        w31_0Array[6] = w31_05;
        w31_0Array[7] = object5;
        w31_0Array[8] = w31_06;
        w31_0Array[9] = w31_07;
        w31_0Array[10] = w31_08;
        int n3 = 11;
        w31_0Array[n3] = map2;
        w31_0Array[12] = w31_09;
        w31_0Array[13] = w31_012;
        w31_0Array[14] = w31_011;
        w31_0Array[15] = object6;
        w31_0Array[16] = w31_013;
        w31_0Array[17] = w31_014;
        w31_0Array[18] = w31_015;
        w31_0Array[19] = w31_016;
        w31_0Array[20] = w31_017;
        w31_0Array[21] = w31_018;
        w31_0Array[22] = w31_019;
        w31_0Array[23] = w31_020;
        w31_0Array[24] = w31_021;
        w31_0Array[25] = w31_022;
        w31_0Array[26] = w31_023;
        w31_0Array[27] = w31_024;
        w31_0Array[28] = w31_025;
        w31_0Array[29] = w31_026;
        w31_0Array[30] = w31_027;
        w31_0Array[31] = w31_028;
        w31_0Array[32] = w31_029;
        w31_0Array[33] = w31_030;
        w31_0Array[34] = w31_031;
        w31_0Array[35] = w31_032;
        w31_0Array[36] = w31_033;
        w31_0Array[37] = w31_034;
        w31_0Array[38] = w31_035;
        w31_0Array[39] = w31_036;
        w31_0Array[40] = w31_037;
        w31_0Array[41] = w31_038;
        w31_0Array[42] = w31_039;
        w31_0Array[43] = w31_040;
        w31_0Array[44] = w31_041;
        w31_0Array[45] = w31_042;
        w31_0Array[46] = w31_043;
        w31_0Array[47] = w31_044;
        w31_0Array[48] = w31_045;
        w31_0Array[49] = w31_046;
        w31_0Array[50] = w31_047;
        w31_0Array[51] = w31_048;
        w31_0Array[52] = w31_049;
        w31_0Array[53] = w31_050;
        w31_0Array[54] = w31_051;
        w31_0Array[55] = w31_052;
        w31_0Array[56] = w31_053;
        w31_0Array[57] = w31_054;
        w31_0Array[58] = w31_055;
        w31_0Array[59] = w31_056;
        int n4 = 60;
        w31_0Array[n4] = w31_02;
        a = w31_0Array;
        int n7 = 61;
        map2 = new Map<Object, Object>(n7);
        for (int i3 = 0; i3 < n7; i3 += n3) {
            object2 = w31_0Array[i3].a;
            n3 = (int)(((AbstractMap)map2).containsKey(object2) ? 1 : 0);
            if (n3 == 0) {
                object2 = i3;
                object = w31_0Array[i3].a;
                map2.put(object, object2);
            }
            n3 = 1;
        }
        map2 = Collections.unmodifiableMap(map2);
        Intrinsics.checkNotNullExpressionValue(map2, "unmodifiableMap(result)");
        b = map2;
    }

    public static void a(ff_2 object) {
        Object object2 = "name";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        int n3 = ((ff_2)object).d();
        for (int i3 = 0; i3 < n3; ++i3) {
            int n4 = 65;
            int n7 = ((ff_2)object).i(i3);
            if (n4 > n7 || n7 >= (n4 = 91)) continue;
            object = ((ff_2)object).q();
            object = "PROTOCOL_ERROR response malformed: mixed case name: ".concat((String)object);
            object2 = new IOException((String)object);
            throw object2;
        }
    }
}

