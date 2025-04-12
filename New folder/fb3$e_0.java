/*
 * Decompiled with CFR 0.152.
 */
import java.util.HashMap;
import java.util.Map;

/*
 * Renamed from Fb3$e
 */
public final class fb3$e_0
extends Enum {
    private static final /* synthetic */ fb3$e_0[] $VALUES;
    public static final /* enum */ fb3$e_0 ALIGNED;
    public static final /* enum */ fb3$e_0 CHAIN;
    public static final /* enum */ fb3$e_0 NONE;
    public static Map valueMap;
    public static Map wrapMap;

    private static /* synthetic */ fb3$e_0[] $values() {
        fb3$e_0 fb3$e_0 = NONE;
        fb3$e_0 = CHAIN;
        fb3$e_0 = ALIGNED;
        fb3$e_0[] fb3$e_0Array = new fb3$e_0[]{fb3$e_0, fb3$e_0, fb3$e_0};
        return fb3$e_0Array;
    }

    static {
        fb3$e_0 fb3$e_0;
        Object object;
        Object object2 = new fb3$e_0("NONE", 0);
        NONE = object2;
        CHAIN = object = new fb3$e_0("CHAIN", 1);
        int n3 = 2;
        ALIGNED = fb3$e_0 = new fb3$e_0("ALIGNED", n3);
        $VALUES = fb3$e_0.$values();
        Object object3 = new HashMap();
        wrapMap = object3;
        object3 = new HashMap();
        valueMap = object3;
        object3 = wrapMap;
        String string2 = "none";
        object3.put(string2, object2);
        object2 = wrapMap;
        object3 = "chain";
        object2.put(object3, object);
        object2 = wrapMap;
        object = "aligned";
        object2.put(object, fb3$e_0);
        object2 = valueMap;
        Integer n4 = 0;
        object2.put(string2, n4);
        object2 = valueMap;
        n4 = 3;
        object2.put(object3, n4);
        object2 = valueMap;
        n4 = n3;
        object2.put(object, n4);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private fb3$e_0() {
        void var2_-1;
        void var1_-1;
    }

    public static fb3$e_0 getChainByString(String string2) {
        Map map2 = wrapMap;
        boolean bl2 = map2.containsKey(string2);
        if (bl2) {
            return (fb3$e_0)((Object)wrapMap.get(string2));
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

    public static fb3$e_0 valueOf(String string2) {
        return Enum.valueOf(fb3$e_0.class, string2);
    }

    public static fb3$e_0[] values() {
        return (fb3$e_0[])$VALUES.clone();
    }
}

