/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from u80
 */
public final class u80_0
extends Enum {
    private static final /* synthetic */ u80_0[] $VALUES;
    public static final /* enum */ u80_0 ACHIEVED_LEVEL;
    public static final /* enum */ u80_0 ACTIVATED_APP;
    public static final /* enum */ u80_0 ADDED_PAYMENT_INFO;
    public static final /* enum */ u80_0 ADDED_TO_CART;
    public static final /* enum */ u80_0 ADDED_TO_WISHLIST;
    public static final /* enum */ u80_0 COMPLETED_REGISTRATION;
    public static final /* enum */ u80_0 COMPLETED_TUTORIAL;
    public static final /* enum */ u80_0 INITIATED_CHECKOUT;
    public static final /* enum */ u80_0 PURCHASED;
    public static final /* enum */ u80_0 RATED;
    public static final /* enum */ u80_0 SEARCHED;
    public static final /* enum */ u80_0 SPENT_CREDITS;
    public static final /* enum */ u80_0 UNLOCKED_ACHIEVEMENT;
    public static final /* enum */ u80_0 VIEWED_CONTENT;
    private final String rawValue;

    private static final /* synthetic */ u80_0[] $values() {
        u80_0 u80_02 = UNLOCKED_ACHIEVEMENT;
        u80_02 = ACTIVATED_APP;
        u80_02 = ADDED_PAYMENT_INFO;
        u80_02 = ADDED_TO_CART;
        u80_02 = ADDED_TO_WISHLIST;
        u80_02 = COMPLETED_REGISTRATION;
        u80_02 = VIEWED_CONTENT;
        u80_02 = INITIATED_CHECKOUT;
        u80_02 = ACHIEVED_LEVEL;
        u80_02 = PURCHASED;
        u80_02 = RATED;
        u80_02 = SEARCHED;
        u80_02 = SPENT_CREDITS;
        u80_02 = COMPLETED_TUTORIAL;
        u80_0[] u80_0Array = new u80_0[]{u80_02, u80_02, u80_02, u80_02, u80_02, u80_02, u80_02, u80_02, u80_02, u80_02, u80_02, u80_02, u80_02, u80_02};
        return u80_0Array;
    }

    static {
        u80_0 u80_02;
        UNLOCKED_ACHIEVEMENT = u80_02 = new u80_0("UNLOCKED_ACHIEVEMENT", 0, "AchievementUnlocked");
        ACTIVATED_APP = u80_02 = new u80_0("ACTIVATED_APP", 1, "ActivateApp");
        ADDED_PAYMENT_INFO = u80_02 = new u80_0("ADDED_PAYMENT_INFO", 2, "AddPaymentInfo");
        ADDED_TO_CART = u80_02 = new u80_0("ADDED_TO_CART", 3, "AddToCart");
        ADDED_TO_WISHLIST = u80_02 = new u80_0("ADDED_TO_WISHLIST", 4, "AddToWishlist");
        COMPLETED_REGISTRATION = u80_02 = new u80_0("COMPLETED_REGISTRATION", 5, "CompleteRegistration");
        VIEWED_CONTENT = u80_02 = new u80_0("VIEWED_CONTENT", 6, "ViewContent");
        INITIATED_CHECKOUT = u80_02 = new u80_0("INITIATED_CHECKOUT", 7, "InitiateCheckout");
        ACHIEVED_LEVEL = u80_02 = new u80_0("ACHIEVED_LEVEL", 8, "LevelAchieved");
        PURCHASED = u80_02 = new u80_0("PURCHASED", 9, "Purchase");
        RATED = u80_02 = new u80_0("RATED", 10, "Rate");
        SEARCHED = u80_02 = new u80_0("SEARCHED", 11, "Search");
        SPENT_CREDITS = u80_02 = new u80_0("SPENT_CREDITS", 12, "SpentCredits");
        COMPLETED_TUTORIAL = u80_02 = new u80_0("COMPLETED_TUTORIAL", 13, "TutorialCompletion");
        $VALUES = u80_0.$values();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private u80_0() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.rawValue = var3_2;
    }

    public static u80_0 valueOf(String string2) {
        return Enum.valueOf(u80_0.class, string2);
    }

    public static u80_0[] values() {
        return (u80_0[])$VALUES.clone();
    }

    public final String getRawValue() {
        return this.rawValue;
    }
}

