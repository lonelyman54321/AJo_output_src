/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;

public final class LA1
extends Enum {
    private static final /* synthetic */ LA1[] $VALUES;
    public static final LA1$a Companion;
    public static final /* enum */ LA1 FACEBOOK;
    public static final /* enum */ LA1 INSTAGRAM;
    private final String targetApp;

    private static final /* synthetic */ LA1[] $values() {
        LA1 lA1 = FACEBOOK;
        lA1 = INSTAGRAM;
        LA1[] lA1Array = new LA1[]{lA1, lA1};
        return lA1Array;
    }

    static {
        Object object;
        FACEBOOK = object = new LA1("FACEBOOK", 0, "facebook");
        INSTAGRAM = object = new LA1("INSTAGRAM", 1, "instagram");
        $VALUES = LA1.$values();
        object = new Object();
        Companion = object;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private LA1() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.targetApp = var3_2;
    }

    public static final LA1 fromString(String string2) {
        LA1 lA12;
        block2: {
            Companion.getClass();
            for (LA1 lA12 : LA1.values()) {
                String string3 = lA12.toString();
                boolean bl2 = Intrinsics.areEqual(string3, string2);
                if (!bl2) {
                    continue;
                }
                break block2;
            }
            lA12 = FACEBOOK;
        }
        return lA12;
    }

    public static LA1 valueOf(String string2) {
        return Enum.valueOf(LA1.class, string2);
    }

    public static LA1[] values() {
        return (LA1[])$VALUES.clone();
    }

    public String toString() {
        return this.targetApp;
    }
}

