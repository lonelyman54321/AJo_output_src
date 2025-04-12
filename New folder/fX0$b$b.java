/*
 * Decompiled with CFR 0.152.
 */
public final class fX0$b$b
extends Enum {
    private static final /* synthetic */ fX0$b$b[] $VALUES;
    public static final /* enum */ fX0$b$b ON_CONFIGURE;
    public static final /* enum */ fX0$b$b ON_CREATE;
    public static final /* enum */ fX0$b$b ON_DOWNGRADE;
    public static final /* enum */ fX0$b$b ON_OPEN;
    public static final /* enum */ fX0$b$b ON_UPGRADE;

    private static final /* synthetic */ fX0$b$b[] $values() {
        fX0$b$b fX0$b$b = ON_CONFIGURE;
        fX0$b$b = ON_CREATE;
        fX0$b$b = ON_UPGRADE;
        fX0$b$b = ON_DOWNGRADE;
        fX0$b$b = ON_OPEN;
        fX0$b$b[] fX0$b$bArray = new fX0$b$b[]{fX0$b$b, fX0$b$b, fX0$b$b, fX0$b$b, fX0$b$b};
        return fX0$b$bArray;
    }

    static {
        fX0$b$b fX0$b$b;
        ON_CONFIGURE = fX0$b$b = new fX0$b$b("ON_CONFIGURE", 0);
        ON_CREATE = fX0$b$b = new fX0$b$b("ON_CREATE", 1);
        ON_UPGRADE = fX0$b$b = new fX0$b$b("ON_UPGRADE", 2);
        ON_DOWNGRADE = fX0$b$b = new fX0$b$b("ON_DOWNGRADE", 3);
        ON_OPEN = fX0$b$b = new fX0$b$b("ON_OPEN", 4);
        $VALUES = fX0$b$b.$values();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private fX0$b$b() {
        void var2_-1;
        void var1_-1;
    }

    public static fX0$b$b valueOf(String string2) {
        return Enum.valueOf(fX0$b$b.class, string2);
    }

    public static fX0$b$b[] values() {
        return (fX0$b$b[])$VALUES.clone();
    }
}

