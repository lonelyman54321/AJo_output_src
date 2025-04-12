/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.network.api;

import com.ril.ajio.services.data.ratings.RatingsRequestBody;
import com.ril.ajio.services.data.ratings.SubRatingRequestBody;
import java.util.ArrayList;
import java.util.Map;

public interface RatingsApi {
    public g53_0 deleteReviewImage(String var1, String var2, String var3, String var4, String var5, String var6, String var7, ArrayList var8, String var9);

    public g53_0 getSubRatingQuestions(String var1, String var2, String var3, String var4, String var5, String var6, Map var7);

    public g53_0 getUnratedProductsHomepage(String var1, String var2, String var3, String var4, String var5, String var6, Map var7, String var8);

    public g53_0 setOrEditRating(String var1, String var2, String var3, String var4, String var5, String var6, RatingsRequestBody var7, Map var8, String var9);

    public g53_0 submitUserSubRatings(String var1, String var2, String var3, String var4, String var5, String var6, SubRatingRequestBody var7, String var8);

    public Object uploadReviewImages(String var1, String var2, String var3, String var4, String var5, String var6, Map var7, cr1$c_0 var8, String var9, f80_0 var10);

    public g53_0 uploadReviewImagesAndSubmitReviews(String var1, String var2, String var3, String var4, String var5, String var6, Map var7, cr1$c_0 var8, String var9);
}

