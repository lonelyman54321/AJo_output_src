/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from qI
 */
public final class qi_1
extends Enum {
    private static final /* synthetic */ qi_1[] $VALUES;
    public static final /* enum */ qi_1 CarouselImageMessage;
    public static final /* enum */ qi_1 CarouselMessage;
    public static final /* enum */ qi_1 IconMessage;
    public static final /* enum */ qi_1 SimpleMessage;
    private final String inboxMessageType;

    private static /* synthetic */ qi_1[] $values() {
        qi_1 qi_12 = SimpleMessage;
        qi_12 = IconMessage;
        qi_12 = CarouselMessage;
        qi_12 = CarouselImageMessage;
        qi_1[] qi_1Array = new qi_1[]{qi_12, qi_12, qi_12, qi_12};
        return qi_1Array;
    }

    static {
        qi_1 qi_12;
        SimpleMessage = qi_12 = new qi_1("SimpleMessage", 0, "simple");
        IconMessage = qi_12 = new qi_1("IconMessage", 1, "message-icon");
        CarouselMessage = qi_12 = new qi_1("CarouselMessage", 2, "carousel");
        CarouselImageMessage = qi_12 = new qi_1("CarouselImageMessage", 3, "carousel-image");
        $VALUES = qi_1.$values();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private qi_1() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.inboxMessageType = var3_2;
    }

    public static qi_1 fromString(String string2) {
        string2.getClass();
        int n3 = -1;
        int n4 = string2.hashCode();
        switch (n4) {
            default: {
                break;
            }
            case 2908512: {
                String string3 = "carousel";
                boolean bl2 = string2.equals(string3);
                if (!bl2) break;
                n3 = 3;
                break;
            }
            case -902286926: {
                String string4 = "simple";
                boolean bl3 = string2.equals(string4);
                if (!bl3) break;
                n3 = 2;
                break;
            }
            case -1332589953: {
                String string5 = "message-icon";
                boolean bl4 = string2.equals(string5);
                if (!bl4) break;
                n3 = 1;
                break;
            }
            case -1799711058: {
                String string6 = "carousel-image";
                boolean bl5 = string2.equals(string6);
                if (!bl5) break;
                n3 = 0;
            }
        }
        switch (n3) {
            default: {
                return null;
            }
            case 3: {
                return CarouselMessage;
            }
            case 2: {
                return SimpleMessage;
            }
            case 1: {
                return IconMessage;
            }
            case 0: 
        }
        return CarouselImageMessage;
    }

    public static qi_1 valueOf(String string2) {
        return Enum.valueOf(qi_1.class, string2);
    }

    public static qi_1[] values() {
        return (qi_1[])$VALUES.clone();
    }

    public String toString() {
        return this.inboxMessageType;
    }
}

