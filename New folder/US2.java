/*
 * Decompiled with CFR 0.152.
 */
public final class US2
extends Enum {
    private static final /* synthetic */ US2[] $VALUES;
    public static final /* enum */ US2 BottomBar;
    public static final /* enum */ US2 Fab;
    public static final /* enum */ US2 MainContent;
    public static final /* enum */ US2 Snackbar;
    public static final /* enum */ US2 TopBar;

    private static final /* synthetic */ US2[] $values() {
        US2 uS2 = TopBar;
        uS2 = MainContent;
        uS2 = Snackbar;
        uS2 = Fab;
        uS2 = BottomBar;
        US2[] uS2Array = new US2[]{uS2, uS2, uS2, uS2, uS2};
        return uS2Array;
    }

    static {
        US2 uS2;
        TopBar = uS2 = new US2("TopBar", 0);
        MainContent = uS2 = new US2("MainContent", 1);
        Snackbar = uS2 = new US2("Snackbar", 2);
        Fab = uS2 = new US2("Fab", 3);
        BottomBar = uS2 = new US2("BottomBar", 4);
        $VALUES = US2.$values();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private US2() {
        void var2_-1;
        void var1_-1;
    }

    public static US2 valueOf(String string2) {
        return Enum.valueOf(US2.class, string2);
    }

    public static US2[] values() {
        return (US2[])$VALUES.clone();
    }
}

