/*
 * Decompiled with CFR 0.152.
 */
package com.airbnb.lottie;

public final class LottieAnimationView$a
extends Enum {
    private static final /* synthetic */ LottieAnimationView$a[] $VALUES;
    public static final /* enum */ LottieAnimationView$a PLAY_OPTION;
    public static final /* enum */ LottieAnimationView$a SET_ANIMATION;
    public static final /* enum */ LottieAnimationView$a SET_IMAGE_ASSETS;
    public static final /* enum */ LottieAnimationView$a SET_PROGRESS;
    public static final /* enum */ LottieAnimationView$a SET_REPEAT_COUNT;
    public static final /* enum */ LottieAnimationView$a SET_REPEAT_MODE;

    private static /* synthetic */ LottieAnimationView$a[] $values() {
        LottieAnimationView$a lottieAnimationView$a = SET_ANIMATION;
        lottieAnimationView$a = SET_PROGRESS;
        lottieAnimationView$a = SET_REPEAT_MODE;
        lottieAnimationView$a = SET_REPEAT_COUNT;
        lottieAnimationView$a = SET_IMAGE_ASSETS;
        lottieAnimationView$a = PLAY_OPTION;
        LottieAnimationView$a[] lottieAnimationView$aArray = new LottieAnimationView$a[]{lottieAnimationView$a, lottieAnimationView$a, lottieAnimationView$a, lottieAnimationView$a, lottieAnimationView$a, lottieAnimationView$a};
        return lottieAnimationView$aArray;
    }

    static {
        LottieAnimationView$a lottieAnimationView$a;
        SET_ANIMATION = lottieAnimationView$a = new LottieAnimationView$a("SET_ANIMATION", 0);
        SET_PROGRESS = lottieAnimationView$a = new LottieAnimationView$a("SET_PROGRESS", 1);
        SET_REPEAT_MODE = lottieAnimationView$a = new LottieAnimationView$a("SET_REPEAT_MODE", 2);
        SET_REPEAT_COUNT = lottieAnimationView$a = new LottieAnimationView$a("SET_REPEAT_COUNT", 3);
        SET_IMAGE_ASSETS = lottieAnimationView$a = new LottieAnimationView$a("SET_IMAGE_ASSETS", 4);
        PLAY_OPTION = lottieAnimationView$a = new LottieAnimationView$a("PLAY_OPTION", 5);
        $VALUES = LottieAnimationView$a.$values();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private LottieAnimationView$a() {
        void var2_-1;
        void var1_-1;
    }

    public static LottieAnimationView$a valueOf(String string2) {
        return Enum.valueOf(LottieAnimationView$a.class, string2);
    }

    public static LottieAnimationView$a[] values() {
        return (LottieAnimationView$a[])$VALUES.clone();
    }
}

