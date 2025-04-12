/*
 * Decompiled with CFR 0.152.
 */
import java.util.HashMap;
import java.util.Map;

public final class Fb3$a
extends Enum {
    private static final /* synthetic */ Fb3$a[] $VALUES;
    public static final /* enum */ Fb3$a PACKED;
    public static final /* enum */ Fb3$a SPREAD;
    public static final /* enum */ Fb3$a SPREAD_INSIDE;
    public static Map chainMap;
    public static Map valueMap;

    private static /* synthetic */ Fb3$a[] $values() {
        Fb3$a fb3$a = SPREAD;
        fb3$a = SPREAD_INSIDE;
        fb3$a = PACKED;
        Fb3$a[] fb3$aArray = new Fb3$a[]{fb3$a, fb3$a, fb3$a};
        return fb3$aArray;
    }

    static {
        Object object = new Fb3$a("SPREAD", 0);
        SPREAD = object;
        int n3 = 1;
        Object object2 = new Fb3$a("SPREAD_INSIDE", n3);
        SPREAD_INSIDE = object2;
        int n4 = 2;
        Object object3 = new Fb3$a("PACKED", n4);
        PACKED = object3;
        $VALUES = Fb3$a.$values();
        Object object4 = new HashMap();
        chainMap = object4;
        object4 = new HashMap();
        valueMap = object4;
        object4 = chainMap;
        String string2 = "packed";
        object4.put(string2, object3);
        object3 = chainMap;
        object4 = "spread_inside";
        object3.put(object4, object2);
        object2 = chainMap;
        object3 = "spread";
        object2.put(object3, object);
        object = valueMap;
        object2 = n4;
        object.put(string2, object2);
        object = valueMap;
        object2 = n3;
        object.put(object4, object2);
        object = valueMap;
        object2 = 0;
        object.put(object3, object2);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private Fb3$a() {
        void var2_-1;
        void var1_-1;
    }

    public static Fb3$a getChainByString(String string2) {
        Map map2 = chainMap;
        boolean bl2 = map2.containsKey(string2);
        if (bl2) {
            return (Fb3$a)((Object)chainMap.get(string2));
        }
        return null;
    }

    public static int getValueByString(String string2) {
        Map map2 = valueMap;
        boolean bl2 = map2.containsKey(string2);
        if (bl2) {
            return (Integer)valueMap.get(string2);
        }
        return -1;
    }

    public static Fb3$a valueOf(String string2) {
        return Enum.valueOf(Fb3$a.class, string2);
    }

    public static Fb3$a[] values() {
        return (Fb3$a[])$VALUES.clone();
    }
}

