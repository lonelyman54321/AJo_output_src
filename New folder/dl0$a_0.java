/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from dL0$a
 */
public final class dl0$a_0
extends Enum {
    private static final /* synthetic */ dl0$a_0[] $VALUES;
    public static final /* enum */ dl0$a_0 ERROR;
    public static final /* enum */ dl0$a_0 LOADING;
    public static final /* enum */ dl0$a_0 NOT_LOADED;
    public static final /* enum */ dl0$a_0 SUCCESS;

    private static final /* synthetic */ dl0$a_0[] $values() {
        dl0$a_0 dl0$a_0 = NOT_LOADED;
        dl0$a_0 = LOADING;
        dl0$a_0 = SUCCESS;
        dl0$a_0 = ERROR;
        dl0$a_0[] dl0$a_0Array = new dl0$a_0[]{dl0$a_0, dl0$a_0, dl0$a_0, dl0$a_0};
        return dl0$a_0Array;
    }

    static {
        dl0$a_0 dl0$a_0;
        NOT_LOADED = dl0$a_0 = new dl0$a_0("NOT_LOADED", 0);
        LOADING = dl0$a_0 = new dl0$a_0("LOADING", 1);
        SUCCESS = dl0$a_0 = new dl0$a_0("SUCCESS", 2);
        ERROR = dl0$a_0 = new dl0$a_0("ERROR", 3);
        $VALUES = dl0$a_0.$values();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private dl0$a_0() {
        void var2_-1;
        void var1_-1;
    }

    public static dl0$a_0 valueOf(String string2) {
        return Enum.valueOf(dl0$a_0.class, string2);
    }

    public static dl0$a_0[] values() {
        return (dl0$a_0[])$VALUES.clone();
    }
}

