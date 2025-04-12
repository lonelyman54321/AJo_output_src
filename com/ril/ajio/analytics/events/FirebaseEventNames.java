/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.analytics.events;

public final class FirebaseEventNames {
    public static final int $stable = 0;
    public static final String CAPTCHA_VS_POPUP = "captchavsPopupExperiment";
    public static final String IMAGE_QUALITY_AB = "image_quality_ab";
    public static final FirebaseEventNames INSTANCE;
    public static final String PROCEED_TO_SHIPPING_AB = "proceed_to_shipping_ab";

    static {
        FirebaseEventNames firebaseEventNames;
        INSTANCE = firebaseEventNames = new FirebaseEventNames();
    }

    private FirebaseEventNames() {
    }
}

