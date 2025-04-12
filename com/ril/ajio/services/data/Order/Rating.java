/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.Order;

import com.ril.ajio.services.data.Order.QuestionResponse;
import com.ril.ajio.services.data.ratings.UserReviewModel;
import java.io.Serializable;
import java.util.ArrayList;

public class Rating
implements Serializable {
    public String baseProductId;
    public String brandName;
    public String dateTime;
    public boolean isVerified;
    public String optionCode;
    public QuestionResponse questionResponse;
    public float rating;
    public UserReviewModel review;
    public String skuId;
    public ArrayList userSubRatings;
    public String uuid;
}

