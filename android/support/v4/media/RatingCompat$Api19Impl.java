/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.media.Rating
 */
package android.support.v4.media;

import android.media.Rating;

class RatingCompat$Api19Impl {
    private RatingCompat$Api19Impl() {
    }

    public static float getPercentRating(Rating rating) {
        return rating.getPercentRating();
    }

    public static int getRatingStyle(Rating rating) {
        return rating.getRatingStyle();
    }

    public static float getStarRating(Rating rating) {
        return rating.getStarRating();
    }

    public static boolean hasHeart(Rating rating) {
        return rating.hasHeart();
    }

    public static boolean isRated(Rating rating) {
        return rating.isRated();
    }

    public static boolean isThumbUp(Rating rating) {
        return rating.isThumbUp();
    }

    public static Rating newHeartRating(boolean bl2) {
        return Rating.newHeartRating((boolean)bl2);
    }

    public static Rating newPercentageRating(float f5) {
        return Rating.newPercentageRating((float)f5);
    }

    public static Rating newStarRating(int n3, float f5) {
        return Rating.newStarRating((int)n3, (float)f5);
    }

    public static Rating newThumbRating(boolean bl2) {
        return Rating.newThumbRating((boolean)bl2);
    }

    public static Rating newUnratedRating(int n3) {
        return Rating.newUnratedRating((int)n3);
    }
}

