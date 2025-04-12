/*
 * Decompiled with CFR 0.152.
 */
import java.util.HashMap;

public final class BW0 {
    public static Integer a(int n3, Integer n4, String string2, String string3, HashMap hashMap) {
        hashMap.put(n4, string2);
        Integer n7 = n3;
        hashMap.put(n7, string3);
        return n7;
    }

    public static String b(StringBuilder stringBuilder, String string2, String string3, String string4) {
        stringBuilder.append(string2);
        stringBuilder.append(string3);
        stringBuilder.append(string4);
        return stringBuilder.toString();
    }
}

