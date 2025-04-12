/*
 * Decompiled with CFR 0.152.
 */
import java.util.HashMap;

public final class uR2$e {
    public static final HashMap a;

    static {
        HashMap<String, Integer> hashMap;
        a = hashMap = new HashMap<String, Integer>(13);
        Integer n3 = 400;
        hashMap.put("normal", n3);
        Integer n4 = 700;
        hashMap.put("bold", n4);
        cy_1.a(1, hashMap, "bolder", -1, "lighter");
        cy_1.a(100, hashMap, "100", 200, "200");
        Integer n7 = 300;
        hashMap.put("300", n7);
        hashMap.put("400", n3);
        cy_1.a(500, hashMap, "500", 600, "600");
        dy_1.a(800, n4, "700", "800", hashMap);
        n3 = 900;
        hashMap.put("900", n3);
    }
}

