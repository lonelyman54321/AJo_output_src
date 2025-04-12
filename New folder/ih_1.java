/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 */
import android.text.TextUtils;

/*
 * Renamed from IH
 */
public final class ih_1
extends Enum {
    private static final /* synthetic */ ih_1[] $VALUES;
    public static final /* enum */ ih_1 CAROUSEL;
    public static final /* enum */ ih_1 CAROUSEL_WITH_IMAGE;
    public static final /* enum */ ih_1 CUSTOM_KEY_VALUE;
    public static final /* enum */ ih_1 MESSAGE_WITH_ICON;
    public static final /* enum */ ih_1 SIMPLE;
    public static final /* enum */ ih_1 SIMPLE_WITH_IMAGE;
    public final String type;

    private static /* synthetic */ ih_1[] $values() {
        ih_1 ih_12 = SIMPLE;
        ih_12 = SIMPLE_WITH_IMAGE;
        ih_12 = CAROUSEL;
        ih_12 = CAROUSEL_WITH_IMAGE;
        ih_12 = MESSAGE_WITH_ICON;
        ih_12 = CUSTOM_KEY_VALUE;
        ih_1[] ih_1Array = new ih_1[]{ih_12, ih_12, ih_12, ih_12, ih_12, ih_12};
        return ih_1Array;
    }

    static {
        ih_1 ih_12;
        SIMPLE = ih_12 = new ih_1("SIMPLE", 0, "simple");
        SIMPLE_WITH_IMAGE = ih_12 = new ih_1("SIMPLE_WITH_IMAGE", 1, "simple-image");
        CAROUSEL = ih_12 = new ih_1("CAROUSEL", 2, "carousel");
        CAROUSEL_WITH_IMAGE = ih_12 = new ih_1("CAROUSEL_WITH_IMAGE", 3, "carousel-image");
        MESSAGE_WITH_ICON = ih_12 = new ih_1("MESSAGE_WITH_ICON", 4, "message-icon");
        CUSTOM_KEY_VALUE = ih_12 = new ih_1("CUSTOM_KEY_VALUE", 5, "custom-key-value");
        $VALUES = ih_1.$values();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private ih_1() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.type = var3_2;
    }

    public static ih_1 type(String string2) {
        int n3 = TextUtils.isEmpty((CharSequence)string2);
        if (n3 == 0) {
            string2.getClass();
            n3 = -1;
            int n4 = string2.hashCode();
            switch (n4) {
                default: {
                    break;
                }
                case 1818845568: {
                    String string3 = "simple-image";
                    boolean bl2 = string2.equals(string3);
                    if (!bl2) break;
                    n3 = 5;
                    break;
                }
                case 2908512: {
                    String string4 = "carousel";
                    boolean bl3 = string2.equals(string4);
                    if (!bl3) break;
                    n3 = 4;
                    break;
                }
                case -876980953: {
                    String string5 = "custom-key-value";
                    boolean bl4 = string2.equals(string5);
                    if (!bl4) break;
                    n3 = 3;
                    break;
                }
                case -902286926: {
                    String string6 = "simple";
                    boolean bl5 = string2.equals(string6);
                    if (!bl5) break;
                    n3 = 2;
                    break;
                }
                case -1332589953: {
                    String string7 = "message-icon";
                    boolean bl6 = string2.equals(string7);
                    if (!bl6) break;
                    n3 = 1;
                    break;
                }
                case -1799711058: {
                    String string8 = "carousel-image";
                    boolean bl7 = string2.equals(string8);
                    if (!bl7) break;
                    n3 = 0;
                }
            }
            switch (n3) {
                default: {
                    break;
                }
                case 5: {
                    return SIMPLE_WITH_IMAGE;
                }
                case 4: {
                    return CAROUSEL;
                }
                case 3: {
                    return CUSTOM_KEY_VALUE;
                }
                case 2: {
                    return SIMPLE;
                }
                case 1: {
                    return MESSAGE_WITH_ICON;
                }
                case 0: {
                    return CAROUSEL_WITH_IMAGE;
                }
            }
        }
        return null;
    }

    public static ih_1 valueOf(String string2) {
        return Enum.valueOf(ih_1.class, string2);
    }

    public static ih_1[] values() {
        return (ih_1[])$VALUES.clone();
    }

    public String toString() {
        return this.type;
    }
}

