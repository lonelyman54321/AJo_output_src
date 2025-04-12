/*
 * Decompiled with CFR 0.152.
 */
public final class tq0
extends Enum {
    private static final /* synthetic */ tq0[] $VALUES;
    public static final /* enum */ tq0 ITEM_TO_PLACEHOLDER;
    public static final /* enum */ tq0 PLACEHOLDER_POSITION_CHANGE;
    public static final /* enum */ tq0 PLACEHOLDER_TO_ITEM;

    private static final /* synthetic */ tq0[] $values() {
        tq0 tq02 = ITEM_TO_PLACEHOLDER;
        tq02 = PLACEHOLDER_TO_ITEM;
        tq02 = PLACEHOLDER_POSITION_CHANGE;
        tq0[] tq0Array = new tq0[]{tq02, tq02, tq02};
        return tq0Array;
    }

    static {
        tq0 tq02;
        ITEM_TO_PLACEHOLDER = tq02 = new tq0("ITEM_TO_PLACEHOLDER", 0);
        PLACEHOLDER_TO_ITEM = tq02 = new tq0("PLACEHOLDER_TO_ITEM", 1);
        PLACEHOLDER_POSITION_CHANGE = tq02 = new tq0("PLACEHOLDER_POSITION_CHANGE", 2);
        $VALUES = tq0.$values();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private tq0() {
        void var2_-1;
        void var1_-1;
    }

    public static tq0 valueOf(String string2) {
        return Enum.valueOf(tq0.class, string2);
    }

    public static tq0[] values() {
        return (tq0[])$VALUES.clone();
    }
}

