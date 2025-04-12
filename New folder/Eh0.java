/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.data.repo.ApiErrorRepo;
import com.ril.ajio.services.data.reviewRatings.CustomerReviewsModel;
import com.ril.ajio.services.data.reviewRatings.ProductReview;
import com.ril.ajio.services.helper.UrlHelper;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

public final class Eh0
extends am2_0 {
    public static final Eh0$a Companion;
    public final Ch0 b;
    public final HashMap c;
    public final Boolean d;
    public dl2_2 e;

    static {
        Eh0$a eh0$a;
        Companion = eh0$a = new Object();
    }

    public Eh0(Ch0 ch0, HashMap hashMap, Boolean bl2) {
        Intrinsics.checkNotNullParameter(ch0, "repoPDP");
        Intrinsics.checkNotNullParameter(hashMap, "query");
        this.b = ch0;
        this.c = hashMap;
        this.d = bl2;
    }

    public final Integer a(cm2 object) {
        Intrinsics.checkNotNullParameter(object, "state");
        Integer n3 = ((cm2)object).b;
        Integer n4 = null;
        if (n3 != null) {
            int n7 = n3;
            Object object2 = ((cm2)object).a(n7);
            if (object2 != null && (object2 = (Integer)((am2$b$b)object2).b) != null) {
                int n8 = (Integer)object2 + 1;
                n4 = n8;
            } else if ((object = ((cm2)object).a(n7)) != null && (object = (Integer)((am2$b$b)object).c) != null) {
                int n10 = (Integer)object + -1;
                n4 = n10;
            }
        }
        return n4;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object c(am2$a var1_1, f80_0 var2_2) {
        block29: {
            block30: {
                var3_3 = this;
                var4_4 = var2_2;
                var5_6 = null;
                var6_7 = 1;
                var7_8 = this.c;
                var8_9 = var2_2 instanceof Eh0$b;
                if (!var8_9) ** GOTO lbl-1000
                var9_10 /* !! */  = var2_2;
                var9_10 /* !! */  = (Eh0$b)var2_2;
                var10_11 = var9_10 /* !! */ .f;
                var11_12 = -1 << -1;
                var12_13 = var10_11 & var11_12;
                if (var12_13 != 0) {
                    var9_10 /* !! */ .f = var10_11 -= var11_12;
                } else lbl-1000:
                // 2 sources

                {
                    var9_10 /* !! */  = new ArrayList<E>(var3_3, (f80_0)var4_4);
                }
                var4_4 = var9_10 /* !! */ .d;
                var13_14 = j90_0.COROUTINE_SUSPENDED;
                var11_12 = var9_10 /* !! */ .f;
                var14_15 = "reviews";
                var15_16 = null;
                if (var11_12 == 0) break block30;
                if (var11_12 != var6_7) {
                    var4_4 = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    throw var4_4;
                }
                var16_17 = var9_10 /* !! */ .c;
                var13_14 = var9_10 /* !! */ .b;
                var9_10 /* !! */  = var9_10 /* !! */ .a;
                try {
                    vl2_2.b(var4_4);
                    ** GOTO lbl-1000
                }
                catch (Exception var4_5) {
                    break block29;
                }
            }
            vl2_2.b(var4_4);
            {
                var4_4 = var1_1.a();
                var4_4 = (Integer)var4_4;
                var17_19 = var4_4 != null ? var4_4.intValue() : 1;
                var18_18 = new Integer(var17_19);
                var19_20 = "pageNumber";
                var7_8.put(var19_20, var18_18);
                var18_18 = var3_3.b;
                var19_20 = "<this>";
                var20_21 = "text_review_list";
                Intrinsics.checkNotNullParameter(var20_21, (String)var19_20);
                var19_20 = UrlHelper.Companion;
                var19_20 = var19_20.getInstance();
                var21_22 /* !! */  = new Object[var6_7];
                var21_22 /* !! */ [0] = null;
                var19_20 = var19_20.getApiUrl(var14_15, (String)var20_21, var21_22 /* !! */ );
                var9_10 /* !! */ .a = var3_3;
                var9_10 /* !! */ .b = var3_3;
                var9_10 /* !! */ .c = var17_19;
                var9_10 /* !! */ .f = var6_7;
                var7_8 = var18_18.a((String)var19_20, (HashMap)var7_8, (f80_0)var9_10 /* !! */ );
                if (var7_8 == var13_14) {
                    return var13_14;
                }
                var9_10 /* !! */  = var3_3;
                var13_14 = var3_3;
                var16_17 = var17_19;
                var4_4 = var7_8;
            }
lbl-1000:
            // 2 sources

            {
                var13_14.e = var4_4 = (dl2_2)var4_4;
                var4_4 = var9_10 /* !! */ .e;
                if (var4_4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(var14_15);
                    var17_19 = 0;
                    var4_4 = null;
                }
                var4_4 = var4_4.b;
                var4_4 = (CustomerReviewsModel)var4_4;
                var13_14 = var9_10 /* !! */ .e;
                if (var13_14 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(var14_15);
                    var10_11 = 0;
                    var13_14 = null;
                }
                if ((var10_11 = (int)(var13_14 = var13_14.a).d()) != 0 && var4_4 != null) {
                    var9_10 /* !! */  = var9_10 /* !! */ .d;
                    var13_14 = Boolean.TRUE;
                    var8_9 = Intrinsics.areEqual(var9_10 /* !! */ , var13_14);
                    if (var8_9) {
                        var9_10 /* !! */  = var4_4.getProductReviews();
                        if (var9_10 /* !! */  != null) {
                            var13_14 = rz3_0.Companion;
                            var18_18 = var4_4.getPageNumber();
                            var13_14.getClass();
                            var9_10 /* !! */  = Rz3$a.c(var9_10 /* !! */ , (Integer)var18_18);
                        } else {
                            var8_9 = false;
                            var9_10 /* !! */  = null;
                        }
                        if (var9_10 /* !! */  != null) {
                            var13_14 = CollectionsKt.N(0, var9_10 /* !! */ );
                            if ((var13_14 = (ProductReview)var13_14) != null) {
                                var18_18 = var4_4.getTotalPages();
                                var13_14.setTotalPages((Integer)var18_18);
                            }
                        }
                        if (var9_10 /* !! */  != null) {
                            var5_6 = CollectionsKt.N(0, var9_10 /* !! */ );
                            if ((var5_6 = (ProductReview)var5_6) != null) {
                                var13_14 = var4_4.getPageNumber();
                                var5_6.setPageNumber((Integer)var13_14);
                            }
                        }
                        if (var9_10 /* !! */  == null) {
                            var9_10 /* !! */  = new ArrayList<E>();
                        }
                        if (var16_17 == var6_7) {
                            var11_12 = 0;
                            var18_18 = null;
                        } else {
                            var10_11 = var16_17 + -1;
                            var18_18 = new Integer(var10_11);
                        }
                        var4_4 = var4_4.getProductReviews();
                        if (var4_4 == null || (var17_19 = (int)var4_4.isEmpty()) != var6_7) {
                            var15_16 = new Integer(var16_17 += var6_7);
                        }
                        return new am2$b$b(var9_10 /* !! */ , (Integer)var18_18, (Integer)var15_16);
                    }
                    var9_10 /* !! */  = var4_4.getProductReviews();
                    if (var9_10 /* !! */  == null) {
                        var9_10 /* !! */  = new ArrayList<E>();
                    }
                    if (var16_17 == var6_7) {
                        var11_12 = 0;
                        var18_18 = null;
                    } else {
                        var10_11 = var16_17 + -1;
                        var18_18 = new Integer(var10_11);
                    }
                    var4_4 = var4_4.getProductReviews();
                    if (var4_4 == null || (var17_19 = (int)var4_4.isEmpty()) != var6_7) {
                        var15_16 = new Integer(var16_17 += var6_7);
                    }
                    return new am2$b$b(var9_10 /* !! */ , (Integer)var18_18, (Integer)var15_16);
                }
                var19_20 = ApiErrorRepo.INSTANCE;
                var4_4 = var9_10 /* !! */ .e;
                if (var4_4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(var14_15);
                    var20_21 = null;
                } else {
                    var20_21 = var4_4;
                }
                var21_22 /* !! */  = "getreviews";
                var22_23 = 24;
                var23_24 = true;
                var4_4 = ApiErrorRepo.getApiError$default((ApiErrorRepo)var19_20, (dl2_2)var20_21, (String)var21_22 /* !! */ , var23_24, null, null, var22_23, null);
                var4_4 = var4_4.getErrorMessage();
                if (var4_4 != null) {
                    var15_16 = var4_4.getMessage();
                }
                var24_25 = new Exception((String)var15_16);
                return new am2$b$a(var24_25);
            }
        }
        var5_6 = ApiErrorRepo.INSTANCE;
        var10_11 = 0;
        var13_14 = null;
        var11_12 = 0;
        var18_18 = null;
        var7_8 = "getreviews";
        var8_9 = true;
        var12_13 = 24;
        var15_16 = null;
        var24_26 = var4_5;
        ApiErrorRepo.logApiException$default((ApiErrorRepo)var5_6, var4_5, (String)var7_8, var8_9, null, null, var12_13, null);
        return new am2$b$a(var4_5);
    }
}

