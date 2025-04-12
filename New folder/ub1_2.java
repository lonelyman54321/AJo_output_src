/*
 * Decompiled with CFR 0.152.
 */
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from ub1
 */
public final class ub1_2
implements Comparable {
    public static final ub1_2 c;
    public static final ub1_2 d;
    public static final ub1_2 e;
    public static final ub1_2 f;
    public static final ub1_2 g;
    public static final List h;
    public final int a;
    public final String b;

    static {
        int n3;
        ub1_2 ub1_22;
        ub1_2 ub1_23;
        int n4 = 100;
        LinkedHashMap<ub1_2, ub1_2> linkedHashMap = new LinkedHashMap<ub1_2, ub1_2>(n4, "Continue");
        int n7 = 101;
        Comparable comparable = new ub1_2(n7, "Switching Protocols");
        int n8 = 102;
        ub1_2 ub1_24 = new ub1_2(n8, "Processing");
        int n10 = 200;
        ub1_2 ub1_25 = new ub1_2(n10, "OK");
        int n14 = 201;
        ub1_2 ub1_26 = new ub1_2(n14, "Created");
        int n15 = 202;
        ub1_2 ub1_27 = new ub1_2(n15, "Accepted");
        int n16 = 203;
        ub1_2 ub1_28 = new ub1_2(n16, "Non-Authoritative Information");
        int n17 = 204;
        ub1_2 ub1_29 = new ub1_2(n17, "No Content");
        int n18 = 205;
        ub1_2 ub1_210 = new ub1_2(n18, "Reset Content");
        int n19 = 206;
        ub1_2 ub1_211 = new ub1_2(n19, "Partial Content");
        int n20 = 207;
        ub1_2 ub1_212 = new ub1_2(n20, "Multi-Status");
        int n21 = 300;
        ub1_2 ub1_213 = new ub1_2(n21, "Multiple Choices");
        c = ub1_23 = new ub1_2(301, "Moved Permanently");
        Object object = new ub1_2(302, "Found");
        d = object;
        Object[] objectArray = object;
        e = ub1_22 = new ub1_2(303, "See Other");
        ub1_2 ub1_214 = ub1_22;
        object = new ub1_2(304, "Not Modified");
        Object[] objectArray2 = object;
        ub1_2 ub1_215 = ub1_22 = new ub1_2(305, "Use Proxy");
        object = new ub1_2(306, "Switch Proxy");
        Object[] objectArray3 = object;
        f = ub1_22 = new ub1_2(307, "Temporary Redirect");
        ub1_2 ub1_216 = ub1_22;
        object = new ub1_2(308, "Permanent Redirect");
        g = object;
        Object[] objectArray4 = object;
        ub1_2 ub1_217 = ub1_22 = new ub1_2(400, "Bad Request");
        object = new ub1_2(401, "Unauthorized");
        Object[] objectArray5 = object;
        ub1_2 ub1_218 = ub1_22 = new ub1_2(402, "Payment Required");
        object = new ub1_2(403, "Forbidden");
        Object[] objectArray6 = object;
        ub1_2 ub1_219 = ub1_22 = new ub1_2(404, "Not Found");
        object = new ub1_2(405, "Method Not Allowed");
        Object[] objectArray7 = object;
        ub1_2 ub1_220 = ub1_22 = new ub1_2(406, "Not Acceptable");
        object = new ub1_2(407, "Proxy Authentication Required");
        Object[] objectArray8 = object;
        ub1_2 ub1_221 = ub1_22 = new ub1_2(408, "Request Timeout");
        object = new ub1_2(409, "Conflict");
        Object[] objectArray9 = object;
        ub1_2 ub1_222 = ub1_22 = new ub1_2(410, "Gone");
        object = new ub1_2(411, "Length Required");
        Object[] objectArray10 = object;
        ub1_2 ub1_223 = ub1_22 = new ub1_2(412, "Precondition Failed");
        object = new ub1_2(413, "Payload Too Large");
        Object[] objectArray11 = object;
        ub1_2 ub1_224 = ub1_22 = new ub1_2(414, "Request-URI Too Long");
        object = new ub1_2(415, "Unsupported Media Type");
        Object[] objectArray12 = object;
        ub1_2 ub1_225 = ub1_22 = new ub1_2(416, "Requested Range Not Satisfiable");
        object = new ub1_2(417, "Expectation Failed");
        Object[] objectArray13 = object;
        ub1_2 ub1_226 = ub1_22 = new ub1_2(422, "Unprocessable Entity");
        object = new ub1_2(423, "Locked");
        Object[] objectArray14 = object;
        ub1_2 ub1_227 = ub1_22 = new ub1_2(424, "Failed Dependency");
        object = new ub1_2(425, "Too Early");
        Object[] objectArray15 = object;
        ub1_2 ub1_228 = ub1_22 = new ub1_2(426, "Upgrade Required");
        object = new ub1_2(429, "Too Many Requests");
        Object[] objectArray16 = object;
        ub1_2 ub1_229 = ub1_22 = new ub1_2(431, "Request Header Fields Too Large");
        object = new ub1_2(500, "Internal Server Error");
        Object[] objectArray17 = object;
        ub1_2 ub1_230 = ub1_22 = new ub1_2(501, "Not Implemented");
        object = new ub1_2(502, "Bad Gateway");
        Object[] objectArray18 = object;
        ub1_2 ub1_231 = ub1_22 = new ub1_2(503, "Service Unavailable");
        object = new ub1_2(504, "Gateway Timeout");
        Object[] objectArray19 = object;
        ub1_2 ub1_232 = ub1_22 = new ub1_2(505, "HTTP Version Not Supported");
        object = new ub1_2(506, "Variant Also Negotiates");
        Object[] objectArray20 = object;
        ub1_22 = new ub1_2(507, "Insufficient Storage");
        int n22 = 53;
        object = new ub1_2[n22];
        object[0] = linkedHashMap;
        object[1] = comparable;
        object[2] = ub1_24;
        object[3] = ub1_25;
        object[4] = ub1_26;
        object[5] = ub1_27;
        object[6] = ub1_28;
        object[7] = ub1_29;
        object[8] = ub1_210;
        object[9] = ub1_211;
        object[10] = ub1_212;
        object[11] = ub1_213;
        object[12] = ub1_23;
        object[13] = objectArray;
        object[14] = ub1_214;
        object[15] = objectArray2;
        object[16] = ub1_215;
        object[17] = objectArray3;
        object[18] = ub1_216;
        object[19] = objectArray4;
        object[20] = ub1_217;
        object[21] = objectArray5;
        object[22] = ub1_218;
        object[23] = objectArray6;
        object[24] = ub1_219;
        object[25] = objectArray7;
        object[26] = ub1_220;
        object[27] = objectArray8;
        object[28] = ub1_221;
        object[29] = objectArray9;
        object[30] = ub1_222;
        object[31] = objectArray10;
        object[32] = ub1_223;
        object[33] = objectArray11;
        object[34] = ub1_224;
        object[35] = objectArray12;
        object[36] = ub1_225;
        object[37] = objectArray13;
        object[38] = ub1_226;
        object[39] = objectArray14;
        object[40] = ub1_227;
        object[41] = objectArray15;
        object[42] = ub1_228;
        object[43] = objectArray16;
        object[44] = ub1_229;
        object[45] = objectArray17;
        object[46] = ub1_230;
        object[47] = objectArray18;
        object[48] = ub1_231;
        object[49] = objectArray19;
        object[50] = ub1_232;
        object[51] = objectArray20;
        object[52] = ub1_22;
        object = xx_2.i((Object[])object);
        h = object;
        int n24 = eh1_2.c(yx_2.o((Iterable)(object = (Iterable)object), 10));
        if (n24 < (n3 = 16)) {
            n24 = 16;
        }
        linkedHashMap = new LinkedHashMap<ub1_2, ub1_2>(n24);
        object = object.iterator();
        while ((n24 = (int)(object.hasNext() ? 1 : 0)) != 0) {
            comparable = ub1_22 = object.next();
            n4 = ub1_22.a;
            comparable = Integer.valueOf(n4);
            linkedHashMap.put((ub1_2)comparable, ub1_22);
        }
    }

    public ub1_2(int n3, String string2) {
        Intrinsics.checkNotNullParameter(string2, "description");
        this.a = n3;
        this.b = string2;
    }

    public final int compareTo(Object object) {
        object = (ub1_2)object;
        Intrinsics.checkNotNullParameter(object, "other");
        int n3 = this.a;
        int n4 = ((ub1_2)object).a;
        return n3 - n4;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final boolean equals(Object object) {
        int n3 = object instanceof ub1_2;
        if (n3 == 0) return 0 != 0;
        object = (ub1_2)object;
        int n4 = ((ub1_2)object).a;
        n3 = this.a;
        if (n4 != n3) return 0 != 0;
        return 1 != 0;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        int n3 = this.a;
        stringBuilder.append(n3);
        stringBuilder.append(' ');
        String string2 = this.b;
        stringBuilder.append(string2);
        return stringBuilder.toString();
    }
}

