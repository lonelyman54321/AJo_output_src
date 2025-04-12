/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.media.Rating
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 */
package android.support.v4.media;

import android.media.Rating;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.RatingCompat$1;
import android.support.v4.media.RatingCompat$Api19Impl;

public final class RatingCompat
implements Parcelable {
    public static final Parcelable.Creator CREATOR;
    public static final int RATING_3_STARS = 3;
    public static final int RATING_4_STARS = 4;
    public static final int RATING_5_STARS = 5;
    public static final int RATING_HEART = 1;
    public static final int RATING_NONE = 0;
    private static final float RATING_NOT_RATED = -1.0f;
    public static final int RATING_PERCENTAGE = 6;
    public static final int RATING_THUMB_UP_DOWN = 2;
    private static final String TAG = "Rating";
    private Object mRatingObj;
    private final int mRatingStyle;
    private final float mRatingValue;

    static {
        RatingCompat$1 ratingCompat$1 = new RatingCompat$1();
        CREATOR = ratingCompat$1;
    }

    public RatingCompat(int n3, float f5) {
        this.mRatingStyle = n3;
        this.mRatingValue = f5;
    }

    public static RatingCompat fromRating(Object object) {
        boolean bl2 = false;
        float f5 = 0.0f;
        RatingCompat ratingCompat = null;
        if (object != null) {
            Object object2 = object;
            object2 = (Rating)object;
            int n3 = RatingCompat$Api19Impl.getRatingStyle((Rating)object2);
            boolean bl3 = RatingCompat$Api19Impl.isRated((Rating)object2);
            if (bl3) {
                switch (n3) {
                    default: {
                        return null;
                    }
                    case 6: {
                        f5 = RatingCompat$Api19Impl.getPercentRating((Rating)object2);
                        ratingCompat = RatingCompat.newPercentageRating(f5);
                        break;
                    }
                    case 3: 
                    case 4: 
                    case 5: {
                        f5 = RatingCompat$Api19Impl.getStarRating((Rating)object2);
                        ratingCompat = RatingCompat.newStarRating(n3, f5);
                        break;
                    }
                    case 2: {
                        bl2 = RatingCompat$Api19Impl.isThumbUp((Rating)object2);
                        ratingCompat = RatingCompat.newThumbRating(bl2);
                        break;
                    }
                    case 1: {
                        bl2 = RatingCompat$Api19Impl.hasHeart((Rating)object2);
                        ratingCompat = RatingCompat.newHeartRating(bl2);
                        break;
                    }
                }
            } else {
                ratingCompat = RatingCompat.newUnratedRating(n3);
            }
            ratingCompat.mRatingObj = object;
        }
        return ratingCompat;
    }

    public static RatingCompat newHeartRating(boolean bl2) {
        float f5;
        if (bl2) {
            int n3 = 1065353216;
            f5 = 1.0f;
        } else {
            boolean bl3 = false;
            f5 = 0.0f;
        }
        RatingCompat ratingCompat = new RatingCompat(1, f5);
        return ratingCompat;
    }

    public static RatingCompat newPercentageRating(float f5) {
        float f6;
        float f7 = 0.0f;
        RatingCompat ratingCompat = null;
        float f8 = f5 - 0.0f;
        Object object = f8 == 0.0f ? 0 : (f8 < 0.0f ? -1 : 1);
        if (object >= 0 && (object = (f6 = f5 - (f7 = 100.0f)) == 0.0f ? 0 : (f6 > 0.0f ? 1 : -1)) <= 0) {
            ratingCompat = new RatingCompat(6, f5);
            return ratingCompat;
        }
        return null;
    }

    public static RatingCompat newStarRating(int n3, float f5) {
        float f6;
        int n4 = 3;
        float f7 = 4.2E-45f;
        if (n3 != n4) {
            n4 = 4;
            f7 = 5.6E-45f;
            if (n3 != n4) {
                n4 = 5;
                f7 = 7.0E-45f;
                if (n3 != n4) {
                    return null;
                }
                n4 = 0x40A00000;
                f7 = 5.0f;
            } else {
                n4 = 0x40800000;
                f7 = 4.0f;
            }
        } else {
            n4 = 0x40400000;
            f7 = 3.0f;
        }
        float f8 = (f6 = f5 - 0.0f) == 0.0f ? 0 : (f6 < 0.0f ? -1 : 1);
        if (f8 >= 0 && (n4 = (int)(f5 == f7 ? 0 : (f5 > f7 ? 1 : -1))) <= 0) {
            RatingCompat ratingCompat = new RatingCompat(n3, f5);
            return ratingCompat;
        }
        return null;
    }

    public static RatingCompat newThumbRating(boolean bl2) {
        float f5;
        if (bl2) {
            int n3 = 1065353216;
            f5 = 1.0f;
        } else {
            boolean bl3 = false;
            f5 = 0.0f;
        }
        RatingCompat ratingCompat = new RatingCompat(2, f5);
        return ratingCompat;
    }

    public static RatingCompat newUnratedRating(int n3) {
        switch (n3) {
            default: {
                return null;
            }
            case 1: 
            case 2: 
            case 3: 
            case 4: 
            case 5: 
            case 6: 
        }
        RatingCompat ratingCompat = new RatingCompat(n3, -1.0f);
        return ratingCompat;
    }

    public int describeContents() {
        return this.mRatingStyle;
    }

    public float getPercentRating() {
        int n3 = this.mRatingStyle;
        int n4 = 6;
        if (n3 == n4 && (n3 = (int)(this.isRated() ? 1 : 0)) != 0) {
            return this.mRatingValue;
        }
        return -1.0f;
    }

    public Object getRating() {
        Object object = this.mRatingObj;
        if (object == null) {
            int n3 = this.isRated();
            if (n3 != 0) {
                n3 = this.mRatingStyle;
                switch (n3) {
                    default: {
                        return null;
                    }
                    case 6: {
                        float f5 = this.getPercentRating();
                        this.mRatingObj = object = RatingCompat$Api19Impl.newPercentageRating(f5);
                        break;
                    }
                    case 3: 
                    case 4: 
                    case 5: {
                        float f6 = this.getStarRating();
                        this.mRatingObj = object = RatingCompat$Api19Impl.newStarRating(n3, f6);
                        break;
                    }
                    case 2: {
                        n3 = (int)(this.isThumbUp() ? 1 : 0);
                        this.mRatingObj = object = RatingCompat$Api19Impl.newThumbRating(n3 != 0);
                        break;
                    }
                    case 1: {
                        n3 = (int)(this.hasHeart() ? 1 : 0);
                        this.mRatingObj = object = RatingCompat$Api19Impl.newHeartRating(n3 != 0);
                        break;
                    }
                }
            } else {
                n3 = this.mRatingStyle;
                this.mRatingObj = object = RatingCompat$Api19Impl.newUnratedRating(n3);
            }
        }
        return this.mRatingObj;
    }

    public int getRatingStyle() {
        return this.mRatingStyle;
    }

    public float getStarRating() {
        int n3 = this.mRatingStyle;
        int n4 = 3;
        if ((n3 == n4 || n3 == (n4 = 4) || n3 == (n4 = 5)) && (n3 = (int)(this.isRated() ? 1 : 0)) != 0) {
            return this.mRatingValue;
        }
        return -1.0f;
    }

    public boolean hasHeart() {
        int n3 = this.mRatingStyle;
        boolean bl2 = false;
        int n4 = 1;
        if (n3 != n4) {
            return false;
        }
        float f5 = this.mRatingValue;
        float f6 = 1.0f;
        float f7 = f5 - f6;
        n3 = (int)(f7 == 0.0f ? 0 : (f7 > 0.0f ? 1 : -1));
        if (n3 == 0) {
            bl2 = true;
        }
        return bl2;
    }

    public boolean isRated() {
        float f5 = this.mRatingValue;
        float f6 = f5 - 0.0f;
        Object object = f6 == 0.0f ? 0 : (f6 > 0.0f ? 1 : -1);
        if (object >= 0) {
            object = true;
            f5 = Float.MIN_VALUE;
        } else {
            object = false;
            f5 = 0.0f;
        }
        return (boolean)object;
    }

    public boolean isThumbUp() {
        int n3 = this.mRatingStyle;
        int n4 = 2;
        float f5 = 2.8E-45f;
        boolean bl2 = false;
        if (n3 != n4) {
            return false;
        }
        float f6 = this.mRatingValue;
        n4 = 1065353216;
        f5 = 1.0f;
        float f7 = f6 - f5;
        n3 = (int)(f7 == 0.0f ? 0 : (f7 > 0.0f ? 1 : -1));
        if (n3 == 0) {
            bl2 = true;
        }
        return bl2;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("Rating:style=");
        int n3 = this.mRatingStyle;
        stringBuilder.append(n3);
        String string2 = " rating=";
        stringBuilder.append(string2);
        float f5 = this.mRatingValue;
        float f6 = f5 - 0.0f;
        float f7 = f6 == 0.0f ? 0 : (f6 < 0.0f ? -1 : 1);
        string2 = f7 < 0 ? "unrated" : String.valueOf(f5);
        stringBuilder.append(string2);
        return stringBuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int n3) {
        n3 = this.mRatingStyle;
        parcel.writeInt(n3);
        float f5 = this.mRatingValue;
        parcel.writeFloat(f5);
    }
}

