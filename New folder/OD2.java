/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.services.data.ratings.ImageMap;
import com.ril.ajio.services.data.ratings.ImageModel;
import com.ril.ajio.services.data.ratings.PopUpImageModel;
import com.ril.ajio.services.data.ratings.UserReviewModel;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;

public final class OD2 {
    public static String a(UserReviewModel object) {
        boolean bl2;
        Object object2;
        Intrinsics.checkNotNullParameter(object, "userReviewModel");
        String string2 = ((UserReviewModel)object).getReviewStatus();
        String string3 = "toUpperCase(...)";
        Iterable iterable = null;
        if (string2 != null) {
            object2 = Locale.ROOT;
            string2 = string2.toUpperCase((Locale)object2);
            Intrinsics.checkNotNullExpressionValue(string2, string3);
        } else {
            bl2 = false;
            string2 = null;
        }
        object2 = "UNDER MODERATION";
        bl2 = Intrinsics.areEqual(string2, object2);
        if (bl2) {
            return object2;
        }
        string2 = ((UserReviewModel)object).getReviewStatus();
        if (string2 != null) {
            object2 = Locale.ROOT;
            string2 = string2.toUpperCase((Locale)object2);
            Intrinsics.checkNotNullExpressionValue(string2, string3);
        } else {
            bl2 = false;
            string2 = null;
        }
        object2 = "REJECTED";
        bl2 = Intrinsics.areEqual(string2, object2);
        if (bl2) {
            return object2;
        }
        string2 = ((UserReviewModel)object).getReviewStatus();
        if (string2 != null) {
            Locale locale = Locale.ROOT;
            string2 = string2.toUpperCase(locale);
            Intrinsics.checkNotNullExpressionValue(string2, string3);
        } else {
            bl2 = false;
            string2 = null;
        }
        string3 = "APPROVED";
        bl2 = Intrinsics.areEqual(string2, string3);
        if (bl2) {
            if ((object = ((UserReviewModel)object).getImageMap()) != null) {
                iterable = ((ImageMap)object).getThumbnail();
            }
            if (iterable != null) {
                iterable = iterable;
                object = iterable.iterator();
                while (bl2 = object.hasNext()) {
                    string2 = ((ImageModel)object.next()).getImageStatus();
                    bl2 = Intrinsics.areEqual(string2, object2);
                    if (!bl2) continue;
                    string3 = "PARTIALLY APPROVED";
                    break;
                }
            }
            return string3;
        }
        return null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static ArrayList b(ArrayList var0) {
        var1_1 = var0;
        Intrinsics.checkNotNullParameter(var0, "userReviewModels");
        var2_2 = new ArrayList<Object>();
        var1_1 = var0.iterator();
        while (var3_3 = var1_1.hasNext()) {
            var4_4 = (UserReviewModel)var1_1.next();
            var5_5 = var4_4.getImageMap();
            if (var5_5 != null && (var5_5 = var5_5.getThumbnail()) != null) {
                var6_6 = var5_5;
                var6_6 = ((Iterable)var5_5).iterator();
                var7_7 = 0;
                var8_8 = null;
                while (var9_9 = var6_6.hasNext()) {
                    var10_10 = var6_6.next();
                    var11_11 = var7_7 + 1;
                    var12_12 = 0;
                    var13_13 = null;
                    if (var7_7 >= 0) {
                        var10_10 = (ImageModel)var10_10;
                        var8_8 = var4_4.getImageMap();
                        if (var8_8 != null) {
                            var8_8 = var8_8.getLargeSize();
                        } else {
                            var7_7 = 0;
                            var8_8 = null;
                        }
                        var14_14 = var10_10.getParentImageId();
                        if (var8_8 != null) {
                            block13: {
                                var8_8 = ((Iterable)var8_8).iterator();
                                while (var15_15 = var8_8.hasNext()) {
                                    var16_16 = var8_8.next();
                                    var17_17 /* !! */  = var16_16;
                                    var17_17 /* !! */  = ((ImageModel)var16_16).getImageId();
                                    var18_18 = Intrinsics.areEqual(var17_17 /* !! */ , var14_14);
                                    if (!var18_18) continue;
                                    break block13;
                                }
                                var15_15 = false;
                                var16_16 = null;
                            }
                            var16_16 = (ImageModel)var16_16;
                            if (var16_16 != null) {
                                var13_13 = var16_16.getImageUrl();
                            }
                        }
                        if (var13_13 != null && (var7_7 = var13_13.length()) != 0) lbl-1000:
                        // 2 sources

                        {
                            while (true) {
                                continue;
                                break;
                            }
                        }
                        var13_13 = var10_10.getImageUrl();
                        ** continue;
                        var19_19 = var13_13;
                        Intrinsics.checkNotNullParameter(var4_4, "userReview");
                        var13_13 = var4_4.getCreatedDate();
                        if (var13_13 != null) {
                            var20_20 = Long.parseLong((String)var13_13);
                            var16_16 = new Date(var20_20);
                            var13_13 = new SimpleDateFormat("dd MMMM yy");
                            var13_13 = var13_13.format((Date)var16_16);
                            var14_14 = "| ";
                            var13_13 = kp1_0.c((String)var14_14, (String)var13_13);
                        } else {
                            var13_13 = "";
                        }
                        var14_14 = var4_4.getReviewerName();
                        var16_16 = new StringBuilder();
                        var16_16.append((String)var14_14);
                        var16_16.append(" ");
                        var16_16.append(var13_13);
                        var16_16 = var16_16.toString();
                        var17_17 /* !! */  = var4_4.getReviewText();
                        var22_21 = var4_4.getRating();
                        var23_22 = var10_10.getImageStatus();
                        var24_23 = var4_4.getReviewStatus();
                        var12_12 = var5_5.size();
                        var14_14 = new StringBuilder();
                        var14_14.append(var11_11);
                        var0 = var1_1;
                        var14_14.append(" of ");
                        var14_14.append(var12_12);
                        var25_24 = var14_14.toString();
                        var26_25 = var10_10.getImageStatusReason();
                        var27_26 = var4_4.getTextStatusReason();
                        var14_14 = var8_8;
                        var8_8 = new PopUpImageModel((String)var16_16, (String)var17_17 /* !! */ , var22_21, var19_19, var23_22, var24_23, var25_24, var26_25, var27_26);
                        var2_2.add(var8_8);
                        var7_7 = var11_11;
                        continue;
                    }
                    xx_2.n();
                    throw null;
                }
                continue;
            }
            var0 = var1_1;
        }
        return var2_2;
    }
}

