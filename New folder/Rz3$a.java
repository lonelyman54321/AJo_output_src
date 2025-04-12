/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.Color
 *  android.graphics.Typeface
 *  android.graphics.drawable.LayerDrawable
 *  android.view.View
 *  android.view.View$OnClickListener
 */
import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.LayerDrawable;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView$f;
import androidx.recyclerview.widget.RecyclerView$o;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import com.ril.ajio.R$color;
import com.ril.ajio.R$drawable;
import com.ril.ajio.R$string;
import com.ril.ajio.customviews.widgets.AjioTextView;
import com.ril.ajio.databinding.PdpRatingReviewParentBinding;
import com.ril.ajio.services.data.Product.Product;
import com.ril.ajio.services.data.Product.ProductFnlColorVariantData;
import com.ril.ajio.services.data.ratings.AggregateRating;
import com.ril.ajio.services.data.ratings.ImageMap;
import com.ril.ajio.services.data.ratings.ImageModel;
import com.ril.ajio.services.data.ratings.ImageReviewResponse;
import com.ril.ajio.services.data.ratings.RatingsResponse;
import com.ril.ajio.services.data.ratings.UserReviewModel;
import com.ril.ajio.services.data.reviewRatings.LargeSize;
import com.ril.ajio.services.data.reviewRatings.ProductReview;
import com.ril.ajio.services.data.reviewRatings.Thumbnail;
import com.ril.ajio.services.data.user.UserInformation;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

public final class Rz3$a {
    public static void a(View view, AjioTextView ajioTextView, View view2, View view3, boolean bl2) {
        if (bl2) {
            ai0_2.i((View)ajioTextView);
            ai0_2.B(view);
            ai0_2.B(view2);
            ai0_2.i(view3);
        } else {
            int n3 = view.getVisibility();
            int n4 = 8;
            if (n3 == 0) {
                Object object = ajioTextView.getContext();
                int n7 = R$string.view_more;
                object = object.getText(n7);
                ajioTextView.setText((CharSequence)object);
                view.setVisibility(n4);
                view3.setVisibility(0);
                view2.setVisibility(n4);
            } else {
                Object object = ajioTextView.getContext();
                int n7 = R$string.view_less;
                object = object.getText(n7);
                ajioTextView.setText((CharSequence)object);
                view.setVisibility(0);
                view3.setVisibility(n4);
                view2.setVisibility(0);
            }
        }
    }

    public static void b(PdpRatingReviewParentBinding object, double d2, RatingsResponse ratingsResponse) {
        if (object != null) {
            int n3;
            Object object2;
            Object object3 = ((PdpRatingReviewParentBinding)object).reviewRatingOldView;
            Intrinsics.checkNotNullExpressionValue(object3, "reviewRatingOldView");
            ai0_2.B((View)object3);
            object3 = ((PdpRatingReviewParentBinding)object).reviewRatingNewView;
            String string2 = "reviewRatingNewView";
            Intrinsics.checkNotNullExpressionValue(object3, string2);
            ai0_2.i((View)object3);
            double d5 = 3.0;
            double d7 = d2 == d5 ? 0 : (d2 > d5 ? 1 : -1);
            if (d7 >= 0) {
                object2 = ((PdpRatingReviewParentBinding)object).ratingStar;
                n3 = R$drawable.ic_ratings_star;
                ((AppCompatImageView)((Object)object2)).setImageResource(n3);
            } else {
                object2 = ((PdpRatingReviewParentBinding)object).ratingStar;
                n3 = R$drawable.ic_negative_rating;
                ((AppCompatImageView)((Object)object2)).setImageResource(n3);
            }
            object2 = ratingsResponse.getAggregateRating();
            n3 = 0;
            String string3 = null;
            object2 = object2 != null ? ((AggregateRating)object2).getAverageRating() : null;
            object3 = ((PdpRatingReviewParentBinding)object).ratingValue;
            object2 = String.valueOf(object2);
            object3.setText((CharSequence)object2);
            object2 = ratingsResponse.getAggregateRating();
            if (object2 != null) {
                string3 = ((AggregateRating)object2).getNumUserRatings();
            }
            object = ((PdpRatingReviewParentBinding)object).ratingCount;
            object2 = new StringBuilder();
            ((StringBuilder)object2).append(string3);
            string3 = " Ratings";
            ((StringBuilder)object2).append(string3);
            object2 = ((StringBuilder)object2).toString();
            object.setText((CharSequence)object2);
        }
    }

    public static ArrayList c(ArrayList arrayList, Integer n3) {
        boolean bl2;
        Object object = arrayList;
        Intrinsics.checkNotNullParameter(arrayList, "customerReview");
        ArrayList<Object> arrayList2 = new ArrayList<Object>();
        object = arrayList.iterator();
        while (bl2 = object.hasNext()) {
            int n4;
            ProductReview productReview = (ProductReview)object.next();
            Object object2 = productReview.getImageMap();
            if (object2 == null || (object2 = ((com.ril.ajio.services.data.reviewRatings.ImageMap)object2).getThumbnail()) == null) continue;
            object2 = object2.iterator();
            int n7 = 0;
            Object object3 = null;
            while ((n4 = object2.hasNext()) != 0) {
                Object object4 = object2.next();
                int n8 = n7 + 1;
                if (n7 >= 0) {
                    object4 = (Thumbnail)object4;
                    ArrayList arrayList3 = new ArrayList();
                    arrayList3.add(object4);
                    ArrayList<Object> arrayList4 = new ArrayList<Object>();
                    object4 = productReview.getImageMap();
                    n4 = object4 != null && (object4 = ((com.ril.ajio.services.data.reviewRatings.ImageMap)object4).getLargeSize()) != null ? ((ArrayList)object4).size() : -1;
                    if (n4 > n7 && (object4 = productReview.getImageMap()) != null && (object4 = ((com.ril.ajio.services.data.reviewRatings.ImageMap)object4).getLargeSize()) != null && (object3 = (LargeSize)CollectionsKt.N(n7, (List)object4)) != null) {
                        arrayList4.add(object3);
                    }
                    int n10 = 1;
                    com.ril.ajio.services.data.reviewRatings.ImageMap imageMap = new com.ril.ajio.services.data.reviewRatings.ImageMap(null, arrayList4, arrayList3, n10, null);
                    String string2 = productReview.getCreatedDate();
                    String string3 = productReview.getHelpfulContent();
                    Double d2 = productReview.getRating();
                    Integer n14 = productReview.getReviewId();
                    String string4 = productReview.getReviewText();
                    String string5 = productReview.getReviewerName();
                    Boolean bl3 = productReview.isVerified();
                    int n15 = 2816;
                    object3 = new ProductReview(string2, string3, imageMap, d2, n14, string4, string5, bl3, null, null, n3, null, n15, null);
                    arrayList2.add(object3);
                    n7 = n8;
                    continue;
                }
                xx_2.n();
                throw null;
            }
        }
        return arrayList2;
    }

    public static String d(yi2_1 object) {
        Object object2;
        if (!(object != null && (object2 = (object2 = object.x5()) != null && (object2 = ((Product)object2).getFnlColorVariantData()) != null ? ((ProductFnlColorVariantData)object2).getColorGroup() : null) != null || object != null && (object = object.x5()) != null && (object2 = ((Product)object).getCode()) != null)) {
            object2 = "";
        }
        return object2;
    }

    public static ArrayList e(yi2_1 iterator) {
        ArrayList<String> arrayList = new ArrayList<String>();
        if (iterator != null && (iterator = iterator.R6()) != null && (iterator = ((RatingsResponse)((Object)iterator)).getImageReview()) != null && (iterator = ((ImageReviewResponse)((Object)iterator)).getProductReviewImages()) != null) {
            boolean bl2;
            iterator = iterator.iterator();
            while (bl2 = iterator.hasNext()) {
                Object object = ((ProductReview)iterator.next()).getImageMap();
                if (object == null || (object = ((com.ril.ajio.services.data.reviewRatings.ImageMap)object).getThumbnail()) == null) continue;
                int n3 = yx_2.o((Iterable)object, 10);
                ArrayList<String> arrayList2 = new ArrayList<String>(n3);
                object = object.iterator();
                while ((n3 = (int)(object.hasNext() ? 1 : 0)) != 0) {
                    String string2 = ((Thumbnail)object.next()).getImageUrl();
                    if (string2 != null) {
                        arrayList.add(string2);
                    } else {
                        n3 = 0;
                        string2 = null;
                    }
                    arrayList2.add(string2);
                }
            }
        }
        return arrayList;
    }

    public static UserReviewModel f(ProductReview productReview) {
        Object object;
        ImageMap imageMap;
        int n3;
        Object object2;
        Object object3;
        long l2;
        String string2;
        int n4;
        int n7;
        Object object4;
        int n8;
        Intrinsics.checkNotNullParameter(productReview, "productReviewVal");
        ArrayList<Object> arrayList = new ArrayList<Object>();
        ArrayList<Serializable> arrayList2 = new ArrayList<Serializable>();
        Object object5 = productReview.getImageMap();
        int n10 = 0;
        Serializable serializable = null;
        Float f5 = null;
        if (object5 != null && (object5 = ((com.ril.ajio.services.data.reviewRatings.ImageMap)object5).getThumbnail()) != null) {
            object5 = object5.iterator();
            n8 = 0;
            object4 = null;
            while ((n7 = object5.hasNext()) != 0) {
                Object object6 = object5.next();
                n4 = n8 + 1;
                if (n8 >= 0) {
                    object6 = (Thumbnail)object6;
                    string2 = ((Thumbnail)object6).getImageUrl();
                    object4 = ((Thumbnail)object6).getImageId();
                    if (object4 != null) {
                        n8 = (Integer)object4;
                        l2 = n8;
                        object3 = object4 = Long.valueOf(l2);
                    } else {
                        object3 = null;
                    }
                    object4 = ((Thumbnail)object6).getParentImageId();
                    if (object4 != null) {
                        long l3 = Long.parseLong((String)object4);
                        object2 = object4 = Long.valueOf(l3);
                    } else {
                        object2 = null;
                    }
                    n3 = 20;
                    object4 = new ImageModel((Long)object3, (Long)object2, null, string2, null, n3, null);
                    arrayList.add(object4);
                    n8 = n4;
                    continue;
                }
                xx_2.n();
                throw null;
            }
        }
        if ((object5 = productReview.getImageMap()) != null && (object5 = ((com.ril.ajio.services.data.reviewRatings.ImageMap)object5).getLargeSize()) != null) {
            object5 = object5.iterator();
            while ((n8 = object5.hasNext()) != 0) {
                object4 = object5.next();
                n7 = n10 + 1;
                if (n10 >= 0) {
                    object4 = (LargeSize)object4;
                    string2 = ((LargeSize)object4).getImageUrl();
                    serializable = ((LargeSize)object4).getImageId();
                    if (serializable != null) {
                        n10 = (Integer)serializable;
                        l2 = n10;
                        serializable = Long.valueOf(l2);
                        object3 = serializable;
                    } else {
                        object3 = null;
                    }
                    object2 = null;
                    n3 = 22;
                    serializable = new ImageModel((Long)object3, null, null, string2, null, n3, null);
                    arrayList2.add(serializable);
                    n10 = n7;
                    continue;
                }
                xx_2.n();
                throw null;
            }
        }
        n4 = 0;
        n8 = 0;
        object4 = null;
        n7 = 2;
        serializable = imageMap;
        imageMap = new ImageMap(arrayList, null, arrayList2, n7, null);
        object5 = productReview.getReviewId();
        if (object5 != null) {
            int n14 = (Integer)object5;
            long l4 = n14;
            object = object5 = Long.valueOf(l4);
        } else {
            object = null;
        }
        String string3 = productReview.getReviewText();
        String string4 = productReview.getReviewText();
        object5 = productReview.getRating();
        if (object5 != null) {
            double d2 = (Double)object5;
            float f6 = (float)d2;
            f5 = Float.valueOf(f6);
        }
        String string5 = productReview.getReviewerName();
        String string6 = productReview.getReviewStatus();
        String string7 = productReview.getCreatedDate();
        object5 = new UserReviewModel((Long)object, string3, string4, f5, string6, string5, null, string7, imageMap, 64, null);
        return object5;
    }

    public static void g(AjioTextView ajioTextView) {
        int n3;
        ld3_2 ld3_22;
        String string2;
        String string3;
        Object object = od3_2.a;
        int n4 = ((String)object).length();
        if (n4 == 0) {
            object = od3_2.a();
        }
        n4 = (int)(s20.a ? 1 : 0);
        int n7 = 1;
        if (n4 == 0 && (n4 = (int)(Intrinsics.areEqual(string3 = od3_2.a(), string2 = (ld3_22 = ld3_2.STORE_AJIOGRAM).getStoreId()) ? 1 : 0)) == 0 && (n3 = (int)(Intrinsics.areEqual(object, string3 = ld3_22.getStoreId()) ? 1 : 0)) == 0) {
            if (ajioTextView != null) {
                AJIOApplication.Companion.getClass();
                object = AJIOApplication$a.a();
                n4 = R$color.color_202020;
                n3 = t70.getColor((Context)object, n4);
                ajioTextView.setTextColor(n3);
            }
            if (ajioTextView != null) {
                object = ajioTextView.getTypeface();
                ajioTextView.setTypeface((Typeface)object, n7);
            }
        } else {
            if (ajioTextView != null) {
                AJIOApplication.Companion.getClass();
                object = AJIOApplication$a.a();
                n4 = R$color.white;
                n3 = t70.getColor((Context)object, n4);
                ajioTextView.setTextColor(n3);
            }
            if (ajioTextView != null) {
                object = ajioTextView.getTypeface();
                ajioTextView.setTypeface((Typeface)object, n7);
            }
        }
    }

    /*
     * Unable to fully structure code
     */
    public static void h(yi2_1 var0, PdpRatingReviewParentBinding var1_1, hd2_0 var2_2) {
        block112: {
            block114: {
                block113: {
                    block111: {
                        var3_3 = var0;
                        var4_4 = var1_1;
                        var5_5 = var2_2;
                        var6_6 = 5;
                        var7_7 = 3;
                        var8_8 = 2;
                        var9_9 = null;
                        var10_10 = 1;
                        var11_11 = "rateReviewsClick";
                        Intrinsics.checkNotNullParameter(var2_2, (String)var11_11);
                        var12_12 = var0 != null ? var0.R6() : null;
                        if (var4_4 == null) break block112;
                        var13_13 = var4_4.secHeader;
                        var14_14 = "secHeader";
                        Intrinsics.checkNotNullExpressionValue(var13_13, (String)var14_14);
                        ai0_2.t((View)var13_13);
                        var13_13 = var12_12 != null && (var13_13 = var12_12.getAggregateRating()) != null ? var13_13.getAverageRating() : null;
                        var15_15 = 0.0;
                        if (var13_13 != null) {
                            var13_13 = var12_12.getAggregateRating();
                            var13_13 = var13_13 != null ? var13_13.getAverageRating() : null;
                            Intrinsics.checkNotNull(var13_13);
                            var17_16 = var13_13.doubleValue();
                        } else {
                            var17_16 = var15_15;
                        }
                        var13_13 = "subRatings";
                        var19_17 = 8;
                        var20_18 = 1.1E-44f;
                        if (var12_12 == null || (var21_19 = var17_16 == var15_15 ? 0 : (var17_16 < var15_15 ? -1 : 1)) <= 0) break block113;
                        rz3_0.Companion.getClass();
                        var4_4.ratingContainer.setVisibility(0);
                        var4_4.noReviewMsg.setVisibility(var19_17);
                        var14_14 = h40_0.a;
                        var22_20 = h40_0.W1();
                        var23_21 = h40_0.V1();
                        if (var23_21 != 0) {
                            block110: {
                                block109: {
                                    block108: {
                                        block107: {
                                            var24_22 = var4_4.reviewRatingNewView;
                                            Intrinsics.checkNotNullExpressionValue(var24_22, "reviewRatingNewView");
                                            ai0_2.B((View)var24_22);
                                            var11_11 = var4_4.reviewRatingOldView;
                                            Intrinsics.checkNotNullExpressionValue(var11_11, "reviewRatingOldView");
                                            ai0_2.i((View)var11_11);
                                            var11_11 = var4_4.newRatingStar;
                                            var24_22 = oa_0.Companion;
                                            var20_18 = (float)var17_16;
                                            var24_22.getClass();
                                            var25_23 = Oa$a.a(var20_18);
                                            var11_11.setRating(var25_23);
                                            var11_11 = var12_12.getAggregateRating();
                                            if (var11_11 != null) {
                                                var11_11 = var11_11.getNumUserRatings();
                                            } else {
                                                var26_24 = 0;
                                                var11_11 = null;
                                            }
                                            var24_22 = var4_4.newRatingCount;
                                            Intrinsics.checkNotNullExpressionValue(var24_22, "newRatingCount");
                                            var27_25 = new StringBuilder();
                                            var27_25.append((String)var11_11);
                                            var27_25.append(" Ratings");
                                            var11_11 = var27_25.toString();
                                            var24_22.setText((CharSequence)var11_11);
                                            if (var22_20 != 0) {
                                                if (var22_20 != var10_10 && var22_20 != var8_8 && var22_20 != var7_7) {
                                                    Rz3$a.b((PdpRatingReviewParentBinding)var4_4, var17_16, var12_12);
                                                } else {
                                                    var11_11 = var4_4.newRatingValue;
                                                    Intrinsics.checkNotNullExpressionValue(var11_11, "newRatingValue");
                                                    ai0_2.B((View)var11_11);
                                                    var14_14 = String.valueOf(var17_16);
                                                    var11_11.setText((CharSequence)var14_14);
                                                }
                                            }
                                            var11_11 = var4_4.newRatingStar;
                                            if (var11_11 == null) break block107;
                                            var11_11 = var11_11.getProgressDrawable();
                                            break block108;
                                        }
                                        var26_24 = 0;
                                        var11_11 = null;
                                    }
                                    var14_14 = "null cannot be cast to non-null type android.graphics.drawable.LayerDrawable";
                                    Intrinsics.checkNotNull(var11_11, (String)var14_14);
                                    var11_11 = (LayerDrawable)var11_11;
                                    var14_14 = var11_11.getDrawable(var8_8);
                                    if (var14_14 == null) break block109;
                                    var24_22 = h40_0.U1();
                                    var23_21 = Color.parseColor((String)var24_22);
                                    var14_14.setTint(var23_21);
                                }
                                var14_14 = var11_11.getDrawable(var10_10);
                                if (var14_14 == null) break block110;
                                var24_22 = AJIOApplication.Companion;
                                var24_22.getClass();
                                var24_22 = AJIOApplication$a.a();
                                var28_26 = R$color.transparent;
                                var23_21 = t70.getColor((Context)var24_22, var28_26);
                                var14_14.setTint(var23_21);
                            }
                            var11_11 = var11_11.getDrawable(0);
                            if (var11_11 == null) break block111;
                            var14_14 = AJIOApplication.Companion;
                            var14_14.getClass();
                            var14_14 = AJIOApplication$a.a();
                            var23_21 = R$color.accent_color_16;
                            var22_20 = t70.getColor((Context)var14_14, var23_21);
                            try {
                                var11_11.setTint(var22_20);
                                var11_11 = Unit.a;
                            }
                            catch (Exception v0) {
                                var11_11 = Unit.a;
                            }
                        } else {
                            Rz3$a.b((PdpRatingReviewParentBinding)var4_4, var17_16, var12_12);
                        }
                    }
                    rz3_0.Companion.getClass();
                    cp_1.Companion.getClass();
                    var11_11 = cp$a.e();
                    var14_14 = var12_12.getAggregateRating();
                    if (var14_14 != null) {
                        var14_14 = var14_14.getPercentage1StarRatings();
                    } else {
                        var22_20 = 0;
                        var14_14 = null;
                    }
                    var11_11.getClass();
                    var26_24 = cp_1.v((String)var14_14);
                    var11_11 = var26_24;
                    var14_14 = cp$a.e();
                    var24_22 = var12_12.getAggregateRating();
                    if (var24_22 != null) {
                        var24_22 = var24_22.getPercentage2StarRatings();
                    } else {
                        var23_21 = 0;
                        var25_23 = 0.0f;
                        var24_22 = null;
                    }
                    var14_14.getClass();
                    var22_20 = cp_1.v((String)var24_22);
                    var14_14 = var22_20;
                    var24_22 = cp$a.e();
                    var29_27 = var12_12.getAggregateRating();
                    if (var29_27 != null) {
                        var29_27 = var29_27.getPercentage3StarRatings();
                    } else {
                        var28_26 = 0;
                        var29_27 = null;
                    }
                    var24_22.getClass();
                    var23_21 = cp_1.v((String)var29_27);
                    var24_22 = var23_21;
                    var29_27 = cp$a.e();
                    var30_28 = var12_12.getAggregateRating();
                    if (var30_28 != null) {
                        var30_28 = var30_28.getPercentage4StarRatings();
                    } else {
                        var31_29 = 0;
                        var30_28 = null;
                    }
                    var29_27.getClass();
                    var28_26 = cp_1.v((String)var30_28);
                    var29_27 = var28_26;
                    var30_28 = cp$a.e();
                    var27_25 = var12_12.getAggregateRating();
                    if (var27_25 != null) {
                        var27_25 = var27_25.getPercentage5StarRatings();
                    } else {
                        var19_17 = 0;
                        var20_18 = 0.0f;
                        var27_25 = null;
                    }
                    var30_28.getClass();
                    var31_29 = cp_1.v((String)var27_25);
                    var30_28 = var31_29;
                    var27_25 = new Integer[var6_6];
                    var27_25[0] = var11_11;
                    var27_25[var10_10] = var14_14;
                    var27_25[var8_8] = var24_22;
                    var27_25[var7_7] = var29_27;
                    var27_25[4] = var30_28;
                    var32_30 = var27_25[0];
                    var7_7 = var32_30.intValue();
                    var33_31 = null;
                    for (var8_8 = 0; var8_8 < var6_6; var8_8 += var10_10) {
                        var11_11 = var27_25[var8_8];
                        var26_24 = var11_11.intValue();
                        if (var26_24 <= var7_7) continue;
                        var7_7 = var26_24;
                    }
                    cp_1.Companion.getClass();
                    var34_32 = cp$a.e();
                    var33_31 = var12_12.getAggregateRating();
                    if (var33_31 != null) {
                        var33_31 = var33_31.getPercentage1StarRatings();
                    } else {
                        var8_8 = 0;
                        var33_31 = null;
                    }
                    var34_32.getClass();
                    var6_6 = cp_1.v((String)var33_31);
                    if (var7_7 == var6_6) {
                        var34_32 = var4_4.ratingPerc1;
                        var33_31 = var12_12.getAggregateRating();
                        if (var33_31 != null) {
                            var33_31 = var33_31.getPercentage1StarRatings();
                        } else {
                            var8_8 = 0;
                            var33_31 = null;
                        }
                        var34_32.setText((CharSequence)var33_31);
                        var34_32 = rz3_0.Companion;
                        var33_31 = var4_4.ratingPerc1;
                        var34_32.getClass();
                        Rz3$a.g((AjioTextView)var33_31);
                    } else {
                        var34_32 = var4_4.ratingPerc1;
                        var33_31 = var12_12.getAggregateRating();
                        if (var33_31 != null) {
                            var33_31 = var33_31.getPercentage1StarRatings();
                        } else {
                            var8_8 = 0;
                            var33_31 = null;
                        }
                        var34_32.setText((CharSequence)var33_31);
                    }
                    var34_32 = cp$a.e();
                    var33_31 = var12_12.getAggregateRating();
                    if (var33_31 != null) {
                        var33_31 = var33_31.getPercentage2StarRatings();
                    } else {
                        var8_8 = 0;
                        var33_31 = null;
                    }
                    var34_32.getClass();
                    var6_6 = cp_1.v((String)var33_31);
                    if (var7_7 == var6_6) {
                        var34_32 = var4_4.ratingPerc2;
                        var33_31 = var12_12.getAggregateRating();
                        if (var33_31 != null) {
                            var33_31 = var33_31.getPercentage2StarRatings();
                        } else {
                            var8_8 = 0;
                            var33_31 = null;
                        }
                        var34_32.setText((CharSequence)var33_31);
                        var34_32 = rz3_0.Companion;
                        var33_31 = var4_4.ratingPerc2;
                        var34_32.getClass();
                        Rz3$a.g((AjioTextView)var33_31);
                    } else {
                        var34_32 = var4_4.ratingPerc2;
                        var33_31 = var12_12.getAggregateRating();
                        if (var33_31 != null) {
                            var33_31 = var33_31.getPercentage2StarRatings();
                        } else {
                            var8_8 = 0;
                            var33_31 = null;
                        }
                        var34_32.setText((CharSequence)var33_31);
                    }
                    var34_32 = cp$a.e();
                    var33_31 = var12_12.getAggregateRating();
                    if (var33_31 != null) {
                        var33_31 = var33_31.getPercentage3StarRatings();
                    } else {
                        var8_8 = 0;
                        var33_31 = null;
                    }
                    var34_32.getClass();
                    var6_6 = cp_1.v((String)var33_31);
                    if (var7_7 == var6_6) {
                        var34_32 = var4_4.ratingPerc3;
                        var33_31 = var12_12.getAggregateRating();
                        if (var33_31 != null) {
                            var33_31 = var33_31.getPercentage3StarRatings();
                        } else {
                            var8_8 = 0;
                            var33_31 = null;
                        }
                        var34_32.setText((CharSequence)var33_31);
                        var34_32 = rz3_0.Companion;
                        var33_31 = var4_4.ratingPerc3;
                        var34_32.getClass();
                        Rz3$a.g((AjioTextView)var33_31);
                    } else {
                        var34_32 = var4_4.ratingPerc3;
                        var33_31 = var12_12.getAggregateRating();
                        if (var33_31 != null) {
                            var33_31 = var33_31.getPercentage3StarRatings();
                        } else {
                            var8_8 = 0;
                            var33_31 = null;
                        }
                        var34_32.setText((CharSequence)var33_31);
                    }
                    var34_32 = cp$a.e();
                    var33_31 = var12_12.getAggregateRating();
                    if (var33_31 != null) {
                        var33_31 = var33_31.getPercentage4StarRatings();
                    } else {
                        var8_8 = 0;
                        var33_31 = null;
                    }
                    var34_32.getClass();
                    var6_6 = cp_1.v((String)var33_31);
                    if (var7_7 == var6_6) {
                        var34_32 = var4_4.ratingPerc4;
                        var33_31 = var12_12.getAggregateRating();
                        if (var33_31 != null) {
                            var33_31 = var33_31.getPercentage4StarRatings();
                        } else {
                            var8_8 = 0;
                            var33_31 = null;
                        }
                        var34_32.setText((CharSequence)var33_31);
                        var34_32 = rz3_0.Companion;
                        var33_31 = var4_4.ratingPerc4;
                        var34_32.getClass();
                        Rz3$a.g((AjioTextView)var33_31);
                    } else {
                        var34_32 = var4_4.ratingPerc4;
                        var33_31 = var12_12.getAggregateRating();
                        if (var33_31 != null) {
                            var33_31 = var33_31.getPercentage4StarRatings();
                        } else {
                            var8_8 = 0;
                            var33_31 = null;
                        }
                        var34_32.setText((CharSequence)var33_31);
                    }
                    var34_32 = cp$a.e();
                    var33_31 = var12_12.getAggregateRating();
                    if (var33_31 != null) {
                        var33_31 = var33_31.getPercentage5StarRatings();
                    } else {
                        var8_8 = 0;
                        var33_31 = null;
                    }
                    var34_32.getClass();
                    var6_6 = cp_1.v((String)var33_31);
                    if (var7_7 == var6_6) {
                        var34_32 = var4_4.ratingPerc5;
                        var32_30 = var12_12.getAggregateRating();
                        if (var32_30 != null) {
                            var32_30 = var32_30.getPercentage5StarRatings();
                        } else {
                            var7_7 = 0;
                            var32_30 = null;
                        }
                        var34_32.setText((CharSequence)var32_30);
                        var34_32 = rz3_0.Companion;
                        var32_30 = var4_4.ratingPerc5;
                        var34_32.getClass();
                        Rz3$a.g((AjioTextView)var32_30);
                    } else {
                        var34_32 = var4_4.ratingPerc5;
                        var32_30 = var12_12.getAggregateRating();
                        if (var32_30 != null) {
                            var32_30 = var32_30.getPercentage5StarRatings();
                        } else {
                            var7_7 = 0;
                            var32_30 = null;
                        }
                        var34_32.setText((CharSequence)var32_30);
                    }
                    var34_32 = var12_12.getAggregateRating();
                    if (var34_32 != null) {
                        var34_32 = var34_32.getPercentage1StarRatings();
                    } else {
                        var6_6 = 0;
                        var34_32 = null;
                    }
                    var32_30 = var4_4.ratingProgress1;
                    var33_31 = cp$a.e();
                    var33_31.getClass();
                    var6_6 = cp_1.v((String)var34_32);
                    var32_30.setProgress(var6_6);
                    var34_32 = var12_12.getAggregateRating();
                    if (var34_32 != null) {
                        var34_32 = var34_32.getPercentage2StarRatings();
                    } else {
                        var6_6 = 0;
                        var34_32 = null;
                    }
                    var32_30 = var4_4.ratingProgress2;
                    var33_31 = cp$a.e();
                    var33_31.getClass();
                    var6_6 = cp_1.v((String)var34_32);
                    var32_30.setProgress(var6_6);
                    var34_32 = var12_12.getAggregateRating();
                    if (var34_32 != null) {
                        var34_32 = var34_32.getPercentage3StarRatings();
                    } else {
                        var6_6 = 0;
                        var34_32 = null;
                    }
                    var32_30 = var4_4.ratingProgress3;
                    var33_31 = cp$a.e();
                    var33_31.getClass();
                    var6_6 = cp_1.v((String)var34_32);
                    var32_30.setProgress(var6_6);
                    var34_32 = var12_12.getAggregateRating();
                    if (var34_32 != null) {
                        var34_32 = var34_32.getPercentage4StarRatings();
                    } else {
                        var6_6 = 0;
                        var34_32 = null;
                    }
                    var32_30 = var4_4.ratingProgress4;
                    var33_31 = cp$a.e();
                    var33_31.getClass();
                    var6_6 = cp_1.v((String)var34_32);
                    var32_30.setProgress(var6_6);
                    var34_32 = var12_12.getAggregateRating();
                    if (var34_32 != null) {
                        var34_32 = var34_32.getPercentage5StarRatings();
                    } else {
                        var6_6 = 0;
                        var34_32 = null;
                    }
                    var32_30 = var4_4.ratingProgress5;
                    var33_31 = cp$a.e();
                    var33_31.getClass();
                    var6_6 = cp_1.v((String)var34_32);
                    var32_30.setProgress(var6_6);
                    var34_32 = var12_12.getSubRatings();
                    if (var34_32 != null && (var6_6 = var34_32.isEmpty() ^ var10_10) == var10_10) {
                        var4_4.viewHandle.setVisibility(0);
                        var4_4.subRatingSummary.setVisibility(0);
                        var34_32 = var4_4.allRatingContainer;
                        var7_7 = 8;
                        var34_32.setVisibility(var7_7);
                        var34_32 = var4_4.customerWordsRv;
                        var33_31 = var1_1.getRoot().getContext();
                        var32_30 = new LinearLayoutManager((Context)var33_31, var10_10, false);
                        var34_32.setLayoutManager((RecyclerView$o)var32_30);
                        var34_32 = var12_12.getSubRatings();
                        if (var34_32 != null) {
                            Intrinsics.checkNotNullParameter(var34_32, (String)var13_13);
                            var32_30 = new RecyclerView$f();
                            var32_30.a = var34_32;
                        } else {
                            var7_7 = 0;
                            var32_30 = null;
                        }
                        var34_32 = var4_4.customerWordsRv;
                        var34_32.setAdapter((RecyclerView$f)var32_30);
                    } else {
                        var34_32 = var4_4.subRatingSummary;
                        var7_7 = 8;
                        var34_32.setVisibility(var7_7);
                        var4_4.allRatingContainer.setVisibility(0);
                        var4_4.viewHandle.setVisibility(var7_7);
                        var34_32 = var4_4.moreContainer;
                        var34_32.setVisibility(var7_7);
                    }
                    break block114;
                }
                var4_4.noReviewMsg.setVisibility(0);
                AJIOApplication.Companion.getClass();
                var34_32 = UserInformation.getInstance((Context)AJIOApplication$a.a());
                var6_6 = (int)var34_32.isUserOnline();
                if (var6_6 == 0) ** GOTO lbl-1000
                var34_32 = h40_0.a;
                var6_6 = (int)h40_0.E1();
                if (var6_6 != 0) {
                    var34_32 = var4_4.noReviewMsg;
                    var32_30 = AJIOApplication$a.a();
                    var8_8 = R$string.no_rating_message;
                    var32_30 = var32_30.getString(var8_8);
                    var34_32.setText((CharSequence)var32_30);
                } else lbl-1000:
                // 2 sources

                {
                    var34_32 = var4_4.noReviewMsg;
                    var32_30 = AJIOApplication$a.a();
                    var8_8 = R$string.no_rating_message_not_logged_in;
                    var32_30 = var32_30.getString(var8_8);
                    var34_32.setText((CharSequence)var32_30);
                }
                var34_32 = var4_4.ratingContainer;
                var7_7 = 8;
                var34_32.setVisibility(var7_7);
                var34_32 = var4_4.viewHandle;
                var34_32.setVisibility(var7_7);
            }
            AJIOApplication.Companion.getClass();
            var34_32 = UserInformation.getInstance((Context)AJIOApplication$a.a());
            var6_6 = (int)var34_32.isUserOnline();
            if (var6_6 != 0) {
                var34_32 = h40_0.a;
                var6_6 = (int)h40_0.F1();
                if (var6_6 != 0) {
                    var4_4.btnRateProduct.setVisibility(0);
                    var34_32 = var4_4.btnRateProduct;
                    var32_30 = "Write a Review";
                    var34_32.setText((CharSequence)var32_30);
                }
            }
            if ((var6_6 = (int)(var34_32 = UserInformation.getInstance((Context)AJIOApplication$a.a())).isUserOnline()) == 0) ** GOTO lbl-1000
            var34_32 = h40_0.a;
            var6_6 = (int)h40_0.E1();
            if (var6_6 != 0) {
                var34_32 = var4_4.btnRateProduct;
                var34_32.setVisibility(0);
            } else lbl-1000:
            // 2 sources

            {
                var34_32 = var4_4.btnRateProduct;
                var7_7 = 8;
                var34_32.setVisibility(var7_7);
            }
            var34_32 = var4_4.customerOpinionRv;
            var33_31 = var1_1.getRoot().getContext();
            var32_30 = new LinearLayoutManager((Context)var33_31, var10_10, false);
            var34_32.setLayoutManager((RecyclerView$o)var32_30);
            var34_32 = var4_4.customerOpinionRv;
            if (var12_12 != null && (var32_30 = var12_12.getSubRatings()) != null) {
                Intrinsics.checkNotNullParameter(var32_30, (String)var13_13);
                var33_31 = new RecyclerView$f();
                var33_31.a = var32_30;
            } else {
                var8_8 = 0;
                var33_31 = null;
            }
            var34_32.setAdapter((RecyclerView$f)var33_31);
            var34_32 = h40_0.a;
            var34_32 = z40_0.Companion;
            var32_30 = AJIOApplication$a.a();
            var34_32.getClass();
            var34_32 = z40$a.a((Context)var32_30).a;
            var6_6 = (int)var34_32.a("show_ratings_expanded_view");
            var32_30 = "moreContainer";
            if (var6_6 != 0) {
                var34_32 = rz3_0.Companion;
                var33_31 = var4_4.moreContainer;
                Intrinsics.checkNotNullExpressionValue(var33_31, (String)var32_30);
                var9_9 = var4_4.viewHandle;
                Intrinsics.checkNotNullExpressionValue(var9_9, "viewHandle");
                var11_11 = var4_4.allRatingContainer;
                Intrinsics.checkNotNullExpressionValue(var11_11, "allRatingContainer");
                var13_13 = var4_4.subRatingSummary;
                var14_14 = "subRatingSummary";
                Intrinsics.checkNotNullExpressionValue(var13_13, (String)var14_14);
                var34_32.getClass();
                Rz3$a.a((View)var33_31, var9_9, (View)var11_11, (View)var13_13, (boolean)var10_10);
            } else {
                var34_32 = var4_4.viewHandle;
                var33_31 = new oz1_0((PdpRatingReviewParentBinding)var4_4);
                var34_32.setOnClickListener((View.OnClickListener)var33_31);
            }
            if (var12_12 != null) {
                var11_11 = var12_12.getSubRatings();
            } else {
                var26_24 = 0;
                var11_11 = null;
            }
            if (var11_11 == null || (var6_6 = (int)var11_11.isEmpty()) != 0) {
                var34_32 = var4_4.moreContainer;
                Intrinsics.checkNotNullExpressionValue(var34_32, (String)var32_30);
                ai0_2.i((View)var34_32);
            }
            var34_32 = var4_4.btnRateProduct;
            var32_30 = new pz3_0((yi2_1)var3_3, var5_5);
            var34_32.setOnClickListener((View.OnClickListener)var32_30);
            var3_3 = var4_4.btnCalculationInfo;
            var4_4 = new qz3_0(var5_5);
            var3_3.setOnClickListener((View.OnClickListener)var4_4);
        }
    }
}

