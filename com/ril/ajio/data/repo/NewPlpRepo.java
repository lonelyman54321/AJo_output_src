/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Application
 *  android.content.Context
 *  android.text.TextUtils
 */
package com.ril.ajio.data.repo;

import android.app.Application;
import android.content.Context;
import android.text.TextUtils;
import com.ril.ajio.data.model.PLPRequest;
import com.ril.ajio.data.repo.ApiErrorRepo;
import com.ril.ajio.data.repo.BaseRepo;
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.data.repo.NewPlpRepo$getImageUploadUrl$1;
import com.ril.ajio.data.repo.NewPlpRepo$getMoreProductsFromImageSearch$1;
import com.ril.ajio.data.repo.NewPlpRepo$getProductsFromImageSearch$1;
import com.ril.ajio.data.repo.NewPlpRepo$uploadImage$2;
import com.ril.ajio.login.CustomerStoreType;
import com.ril.ajio.services.data.Home.NavigationParent;
import com.ril.ajio.services.data.ImageSearchResponse;
import com.ril.ajio.services.data.Product.NewUserBanner;
import com.ril.ajio.services.data.Product.ProductsList;
import com.ril.ajio.services.data.sis.StoreMetaData;
import com.ril.ajio.services.data.user.ScreenType;
import com.ril.ajio.services.data.user.UserInformation;
import com.ril.ajio.services.helper.UrlHelper;
import com.ril.ajio.services.network.api.PlpApi;
import com.ril.ajio.services.query.ProductListQuery;
import com.ril.ajio.services.utils.NewQueryUtil;
import com.ril.ajio.services.utils.ServiceUtil;
import io.reactivex.Scheduler;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlin.text.b;
import kotlinx.coroutines.d;

public final class NewPlpRepo
implements BaseRepo {
    public static final int $stable = 8;
    private final String USER_ID;
    private final jo_2 appPreferences;
    private final Application application;
    private final Application context;
    private final PlpApi plpApiRepo;
    private final zr1_1 uploadImageStatusObserver;
    private final UserInformation userInformation;

    public NewPlpRepo(Application object, PlpApi object2) {
        Intrinsics.checkNotNullParameter(object, "application");
        Intrinsics.checkNotNullParameter(object2, "plpApiRepo");
        this.application = object;
        this.plpApiRepo = object2;
        this.USER_ID = "userId";
        this.context = object;
        this.appPreferences = object2 = new jo_2((Context)object);
        object = UserInformation.getInstance((Context)object);
        this.userInformation = object;
        this.uploadImageStatusObserver = object;
    }

    public static /* synthetic */ DataCallback a(Throwable throwable) {
        return NewPlpRepo.getStoreInfo$lambda$19("BackGround_StoreMetaData", throwable);
    }

    public static final /* synthetic */ PlpApi access$getPlpApiRepo$p(NewPlpRepo newPlpRepo) {
        return newPlpRepo.plpApiRepo;
    }

    public static final /* synthetic */ zr1_1 access$getUploadImageStatusObserver$p(NewPlpRepo newPlpRepo) {
        return newPlpRepo.uploadImageStatusObserver;
    }

    public static /* synthetic */ DataCallback b(dl2_2 dl2_22) {
        return NewPlpRepo.getStoreCategories$lambda$20(dl2_22);
    }

    public static /* synthetic */ DataCallback c(Ref$ObjectRef ref$ObjectRef, Ref$ObjectRef ref$ObjectRef2, dl2_2 dl2_22) {
        return NewPlpRepo.getCategoryProduct$lambda$4(ref$ObjectRef, ref$ObjectRef2, dl2_22);
    }

    public static /* synthetic */ DataCallback d(Throwable throwable) {
        return NewPlpRepo.getNewUserBanner$lambda$9("PlpNewUserBanner", throwable);
    }

    public static /* synthetic */ DataCallback e(Ref$ObjectRef ref$ObjectRef, Throwable throwable) {
        return NewPlpRepo.getCategoryProduct$lambda$6(ref$ObjectRef, throwable);
    }

    public static /* synthetic */ DataCallback f(Throwable throwable) {
        return NewPlpRepo.getProducts$lambda$16("PLPSearchProducts", throwable);
    }

    public static /* synthetic */ DataCallback g(t12_0 t12_02, Object object) {
        return NewPlpRepo.getStoreInfo$lambda$18(t12_02, object);
    }

    public static /* synthetic */ g53_0 getCategoryProduct$default(NewPlpRepo newPlpRepo, ProductListQuery productListQuery, boolean bl2, String string2, String string3, boolean bl3, boolean bl4, boolean bl5, PLPRequest pLPRequest, int n3, Object object) {
        String string4;
        int n4 = n3 & 4;
        String string5 = n4 != 0 ? (string4 = "") : string2;
        n4 = n3 & 0x20;
        boolean bl6 = n4 != 0 ? false : bl4;
        n4 = n3 & 0x40;
        boolean bl7 = n4 != 0 ? false : bl5;
        return newPlpRepo.getCategoryProduct(productListQuery, bl2, string5, string3, bl3, bl6, bl7, pLPRequest);
    }

    private static final DataCallback getCategoryProduct$lambda$4(Ref$ObjectRef object, Ref$ObjectRef ref$ObjectRef, dl2_2 dl2_22) {
        boolean bl2;
        Intrinsics.checkNotNullParameter(object, "$clusterId");
        Intrinsics.checkNotNullParameter(ref$ObjectRef, "$requestID");
        Intrinsics.checkNotNullParameter(dl2_22, "response");
        Object object2 = (ProductsList)dl2_22.b;
        Object object3 = dl2_22.a;
        Object object4 = ((cl2_2)object3).f;
        String string2 = "usergroup";
        object4 = ((m41_0)object4).a(string2);
        if (object2 != null) {
            ((ProductsList)object2).setUserGroup((String)object4);
        }
        if (object2 != null) {
            object = (String)((Ref$ObjectRef)object).element;
            ((ProductsList)object2).setLastSavedCohort((String)object);
        }
        if ((bl2 = ((cl2_2)object3).d()) && object2 != null) {
            object = DataCallback.Companion.onSuccess(object2);
        } else {
            object2 = ApiErrorRepo.INSTANCE;
            object4 = object = ref$ObjectRef.element;
            object4 = (String)object;
            int n3 = 24;
            boolean bl3 = true;
            object3 = dl2_22;
            object = ApiErrorRepo.handleApiError$default((ApiErrorRepo)object2, dl2_22, (String)object4, bl3, null, null, n3, null);
        }
        return object;
    }

    private static final DataCallback getCategoryProduct$lambda$5(Function1 function1, Object object) {
        return (DataCallback)oj_0.a(function1, "$tmp0", object, "p0", object);
    }

    private static final DataCallback getCategoryProduct$lambda$6(Ref$ObjectRef object, Throwable throwable) {
        Intrinsics.checkNotNullParameter(object, "$requestID");
        Intrinsics.checkNotNullParameter(throwable, "t");
        ApiErrorRepo apiErrorRepo = ApiErrorRepo.INSTANCE;
        Object object2 = object = ((Ref$ObjectRef)object).element;
        object2 = (String)object;
        return ApiErrorRepo.handleApiException$default(apiErrorRepo, throwable, (String)object2, true, null, null, 24, null);
    }

    private static final DataCallback getNewUserBanner$lambda$7(String object, dl2_2 dl2_22) {
        Intrinsics.checkNotNullParameter(object, "$requestID");
        Intrinsics.checkNotNullParameter(dl2_22, "response");
        Object object2 = (NewUserBanner)dl2_22.b;
        Object object3 = dl2_22.a;
        boolean bl2 = ((cl2_2)object3).d();
        if (bl2 && object2 != null) {
            object = DataCallback.Companion.onSuccess(object2);
        } else {
            object2 = ApiErrorRepo.INSTANCE;
            int n3 = 24;
            object3 = dl2_22;
            object = ApiErrorRepo.handleApiError$default((ApiErrorRepo)object2, dl2_22, (String)object, false, null, null, n3, null);
        }
        return object;
    }

    private static final DataCallback getNewUserBanner$lambda$8(Function1 function1, Object object) {
        return (DataCallback)oj_0.a(function1, "$tmp0", object, "p0", object);
    }

    private static final DataCallback getNewUserBanner$lambda$9(String string2, Throwable throwable) {
        Intrinsics.checkNotNullParameter(string2, "$requestID");
        Intrinsics.checkNotNullParameter(throwable, "t");
        return ApiErrorRepo.handleApiException$default(ApiErrorRepo.INSTANCE, throwable, string2, true, null, null, 24, null);
    }

    public static /* synthetic */ g53_0 getProducts$default(NewPlpRepo newPlpRepo, ProductListQuery productListQuery, boolean bl2, String string2, String string3, String string4, boolean bl3, boolean bl4, boolean bl5, PLPRequest pLPRequest, int n3, Object object) {
        int n4 = n3;
        int n7 = n3 & 4;
        String string5 = "";
        String string6 = n7 != 0 ? string5 : string2;
        n7 = n4 & 8;
        String string7 = n7 != 0 ? string5 : string3;
        n7 = n4 & 0x20;
        string5 = null;
        boolean bl6 = n7 != 0 ? false : bl3;
        n7 = n4 & 0x40;
        boolean bl7 = n7 != 0 ? false : bl4;
        boolean bl8 = (n4 &= 0x80) != 0 ? false : bl5;
        return newPlpRepo.getProducts(productListQuery, bl2, string6, string7, string4, bl6, bl7, bl8, pLPRequest);
    }

    private static final DataCallback getProducts$lambda$14(Ref$ObjectRef object, String string2, dl2_2 dl2_22) {
        Intrinsics.checkNotNullParameter(object, "$clusterId");
        Intrinsics.checkNotNullParameter(string2, "$requestID");
        Intrinsics.checkNotNullParameter(dl2_22, "response");
        Object object2 = (ProductsList)dl2_22.b;
        Object object3 = dl2_22.a;
        boolean bl2 = ((cl2_2)object3).d();
        if (bl2 && object2 != null) {
            object = (String)((Ref$ObjectRef)object).element;
            ((ProductsList)object2).setLastSavedCohort((String)object);
            object = ((cl2_2)object3).f;
            string2 = "usergroup";
            object = ((m41_0)object).a(string2);
            ((ProductsList)object2).setUserGroup((String)object);
            object = DataCallback.Companion.onSuccess(object2);
        } else {
            object2 = ApiErrorRepo.INSTANCE;
            int n3 = 24;
            boolean bl3 = true;
            object3 = dl2_22;
            object = ApiErrorRepo.handleApiError$default((ApiErrorRepo)object2, dl2_22, string2, bl3, null, null, n3, null);
        }
        return object;
    }

    private static final DataCallback getProducts$lambda$15(Function1 function1, Object object) {
        return (DataCallback)oj_0.a(function1, "$tmp0", object, "p0", object);
    }

    private static final DataCallback getProducts$lambda$16(String string2, Throwable throwable) {
        Intrinsics.checkNotNullParameter(string2, "$requestID");
        Intrinsics.checkNotNullParameter(throwable, "t");
        return ApiErrorRepo.handleApiException$default(ApiErrorRepo.INSTANCE, throwable, string2, true, null, null, 24, null);
    }

    private static final DataCallback getStoreCategories$lambda$20(dl2_2 object) {
        Intrinsics.checkNotNullParameter(object, "navigationResp");
        Object object2 = (NavigationParent)((dl2_2)object).b;
        Object object3 = ((dl2_2)object).a;
        boolean bl2 = ((cl2_2)object3).d();
        if (bl2 && object2 != null) {
            object = DataCallback.Companion.onSuccess(object2);
        } else {
            object2 = ApiErrorRepo.INSTANCE;
            int n3 = 24;
            String string2 = "BackGround_AllCategories";
            object3 = object;
            object = ApiErrorRepo.handleApiError$default((ApiErrorRepo)object2, (dl2_2)object, string2, false, null, null, n3, null);
        }
        return object;
    }

    private static final DataCallback getStoreCategories$lambda$21(Function1 function1, Object object) {
        return (DataCallback)oj_0.a(function1, "$tmp0", object, "p0", object);
    }

    private static final DataCallback getStoreCategories$lambda$22(Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        return ApiErrorRepo.handleApiException$default(ApiErrorRepo.INSTANCE, throwable, "BackGround_AllCategories", false, null, null, 24, null);
    }

    private static final DataCallback getStoreInfo$lambda$17(String object, dl2_2 dl2_22) {
        Intrinsics.checkNotNullParameter(object, "$requestID");
        Intrinsics.checkNotNullParameter(dl2_22, "response");
        Object object2 = (StoreMetaData)dl2_22.b;
        Object object3 = dl2_22.a;
        boolean bl2 = ((cl2_2)object3).d();
        if (bl2 && object2 != null) {
            lr2_2.Companion.getClass();
            lR2$a.b((StoreMetaData)object2);
            object = DataCallback.Companion.onSuccess(object2);
        } else {
            object2 = ApiErrorRepo.INSTANCE;
            int n3 = 24;
            object3 = dl2_22;
            object = ApiErrorRepo.handleApiError$default((ApiErrorRepo)object2, dl2_22, (String)object, false, null, null, n3, null);
        }
        return object;
    }

    private static final DataCallback getStoreInfo$lambda$18(Function1 function1, Object object) {
        return (DataCallback)oj_0.a(function1, "$tmp0", object, "p0", object);
    }

    private static final DataCallback getStoreInfo$lambda$19(String string2, Throwable throwable) {
        Intrinsics.checkNotNullParameter(string2, "$requestID");
        Intrinsics.checkNotNullParameter(throwable, "t");
        return ApiErrorRepo.handleApiException$default(ApiErrorRepo.INSTANCE, throwable, string2, false, null, null, 24, null);
    }

    public static /* synthetic */ DataCallback h(Throwable throwable) {
        return NewPlpRepo.getStoreCategories$lambda$22(throwable);
    }

    public static /* synthetic */ DataCallback i(y12_0 y12_02, Object object) {
        return NewPlpRepo.getCategoryProduct$lambda$5(y12_02, object);
    }

    public static /* synthetic */ DataCallback j(D12 d12, Object object) {
        return NewPlpRepo.getNewUserBanner$lambda$8(d12, object);
    }

    public static /* synthetic */ DataCallback k(Ref$ObjectRef ref$ObjectRef, dl2_2 dl2_22) {
        return NewPlpRepo.getProducts$lambda$14(ref$ObjectRef, "PLPSearchProducts", dl2_22);
    }

    public static /* synthetic */ DataCallback l(dl2_2 dl2_22) {
        return NewPlpRepo.getStoreInfo$lambda$17("BackGround_StoreMetaData", dl2_22);
    }

    public static /* synthetic */ DataCallback m(A12 a12, Object object) {
        return NewPlpRepo.getProducts$lambda$15(a12, object);
    }

    public static /* synthetic */ DataCallback n(dl2_2 dl2_22) {
        return NewPlpRepo.getNewUserBanner$lambda$7("PlpNewUserBanner", dl2_22);
    }

    public static /* synthetic */ DataCallback o(b90_0 b90_02, Object object) {
        return NewPlpRepo.getStoreCategories$lambda$21(b90_02, object);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final g53_0 getCategoryProduct(ProductListQuery var1_1, boolean var2_2, String var3_3, String var4_4, boolean var5_5, boolean var6_6, boolean var7_7, PLPRequest var8_8) {
        var9_9 = this;
        var10_10 = var1_1;
        var11_11 = var4_4;
        var12_12 = var8_8;
        var13_13 = 1;
        Intrinsics.checkNotNullParameter(var1_1, "productListQuery");
        Intrinsics.checkNotNullParameter(var8_8, "plpRequest");
        var14_14 = new Ref$ObjectRef();
        var14_14.element = "PLPCategoryProducts";
        var15_15 = 0;
        var16_16 = null;
        var17_17 = ke0_0.b(var1_1, false);
        if (var17_17) {
            var18_18 = "category_product_v5";
        } else {
            var18_18 = h40_0.a;
            var17_17 = h40_0.m2();
            var18_18 = var17_17 != false ? "category_product_v4" : "category_product_v3";
        }
        var19_19 = var1_1.getWidgetRecord();
        if (var19_19 != null && (var19_19 = var1_1.getWidgetRecord().getWidgetID()) != null && (var20_20 = var19_19.length()) != 0) {
            var18_18 = h40_0.a;
            var17_17 = h40_0.m2();
            var18_18 = var17_17 != false ? "widget_product_v2" : "widget_product";
            var19_19 = var1_1.getWidgetRecord().getAdapterPositionOfWidget();
            if (var19_19 != null) {
                var14_14.element = var19_19 = "newDynamicWidgetCallHome";
            }
        }
        var19_19 = UrlHelper.Companion.getInstance();
        var21_21 = var1_1.getCategoryId();
        var22_22 /* !! */  = new Object[var13_13];
        var22_22 /* !! */ [0] = var21_21;
        var18_18 = var19_19.getApiUrl("plp", (String)var18_18, var22_22 /* !! */ );
        var19_19 = new HashMap();
        var21_21 = fh1_2.q(NewQueryUtil.INSTANCE.getCategoryProductParameter((ProductListQuery)var10_10));
        var22_22 /* !! */  = new Ref$ObjectRef();
        var22_22 /* !! */ .element = var23_23 = "";
        TU2.a((HashMap)var21_21);
        var24_24 = cp_1.Companion;
        var24_24.getClass();
        var25_25 = cp$a.r();
        var26_26 = "userClusterId";
        var27_27 = "rilfnl";
        if (var25_25 != 0) {
            var24_24 = var1_1.getStoreId();
            var28_28 /* !! */  = od3_2.a();
            if (var24_24 == null || (var29_29 = var24_24.length()) == 0) {
                var24_24 = var28_28 /* !! */ ;
            }
            if (var30_30 = Intrinsics.areEqual(var24_24, var28_28 /* !! */  = ld3_2.STORE_AJIO.getStoreId())) {
                var24_24 = var27_27;
            }
            var28_28 /* !! */  = CustomerStoreType.a;
            var28_28 /* !! */  = ScreenType.SCREEN_PLP;
            var22_22 /* !! */ .element = var24_24 = CustomerStoreType.a((String)var24_24, (ScreenType)var28_28 /* !! */ );
            var25_25 = TextUtils.isEmpty((CharSequence)var24_24);
            if (var25_25 == 0) {
                var24_24 = var22_22 /* !! */ .element;
                var21_21.put(var26_26, var24_24);
            }
        }
        var24_24 = z40_0.Companion;
        var28_28 /* !! */  = var9_9.application;
        var24_24.getClass();
        var24_24 = z40$a.a((Context)var28_28 /* !! */ ).a;
        var28_28 /* !! */  = "append_platform_info";
        var25_25 = var24_24.a((String)var28_28 /* !! */ );
        if (var25_25 != 0) {
            var24_24 = "platform";
            var28_28 /* !! */  = "android";
            var21_21.put(var24_24, var28_28 /* !! */ );
        }
        var25_25 = TextUtils.isEmpty((CharSequence)var3_3);
        var28_28 /* !! */  = "=";
        if (var25_25 != 0) ** GOTO lbl-1000
        Intrinsics.checkNotNull(var3_3);
        var24_24 = new Regex((String)var28_28 /* !! */ );
        var16_16 = var3_3;
        var16_16 = var24_24.e((CharSequence)var3_3);
        var25_25 = var16_16.isEmpty();
        if (var25_25 == 0) {
            var25_25 = var16_16.size();
            var24_24 = var16_16.listIterator(var25_25);
            while ((var31_31 = var24_24.hasPrevious()) != 0) {
                var32_32 = (String)var24_24.previous();
                var31_31 = var32_32.length();
                if (var31_31 == 0) continue;
                var16_16 = (Iterable)var16_16;
                var25_25 = var24_24.nextIndex() + var13_13;
                var16_16 = CollectionsKt.f0((Iterable)var16_16, var25_25);
                break;
            }
        } else {
            var16_16 = mz0_2.a;
        }
        var16_16 = (Collection)var16_16;
        var24_24 = null;
        var33_33 = new String[]{};
        var33_33 = var16_16.toArray((T[])var33_33);
        var15_15 = ((String[])var33_33).length;
        var25_25 = 1;
        if (var15_15 > var25_25 && (var15_15 = (int)TextUtils.isEmpty((CharSequence)(var16_16 = var33_33[var25_25]))) == 0) {
            var34_34 = var27_27;
            var15_15 = 0;
            var16_16 = null;
            var27_27 = var33_33[0];
            var33_33 = var33_33[var25_25];
            var21_21.put(var27_27, var33_33);
        } else lbl-1000:
        // 2 sources

        {
            var34_34 = var27_27;
        }
        var33_33 = z40_0.Companion;
        var16_16 = var9_9.application;
        var33_33.getClass();
        var33_33 = z40$a.a((Context)var16_16).a;
        var16_16 = "plp_additional_query_parameter";
        var33_33 = var33_33.b((String)var16_16);
        var13_13 = var33_33.length();
        if (var13_13 > 0) {
            var33_33 = z40$a.a((Context)var9_9.application).a.b((String)var16_16);
            var24_24 = "&";
            var16_16 = new Regex((String)var24_24);
            var33_33 = var16_16.e((CharSequence)var33_33).iterator();
            while ((var15_15 = (int)var33_33.hasNext()) != 0) {
                var16_16 = (String)var33_33.next();
                var25_25 = (int)(var16_16 = fT1.a((String)var28_28 /* !! */ , (String)var16_16)).isEmpty();
                if (var25_25 == 0) {
                    var25_25 = var16_16.size();
                    var24_24 = var16_16.listIterator(var25_25);
                    while ((var35_35 = var24_24.hasPrevious()) != 0) {
                        var27_27 = (String)var24_24.previous();
                        var35_35 = var27_27.length();
                        if (var35_35 == 0) continue;
                        var16_16 = (Iterable)var16_16;
                        var25_25 = var24_24.nextIndex();
                        var35_35 = 1;
                        var16_16 = CollectionsKt.f0((Iterable)var16_16, var25_25 += var35_35);
                        break;
                    }
                } else {
                    var16_16 = mz0_2.a;
                }
                var16_16 = (Collection)var16_16;
                var24_24 = null;
                var27_27 = new String[0];
                var35_35 = ((Object)(var16_16 = var16_16.toArray((T[])var27_27))).length;
                if (var35_35 <= (var25_25 = 1) || (var35_35 = (var27_27 = var16_16[var25_25]).length()) <= 0) continue;
                var3_3 = var33_33;
                var35_35 = 0;
                var27_27 = null;
                var33_33 = var16_16[0];
                var16_16 = var16_16[var25_25];
                var21_21.put(var33_33, var16_16);
                var33_33 = var3_3;
            }
        }
        var33_33 = "true";
        var16_16 = "USER";
        if (var2_2 && var11_11 != null) {
            var27_27 = var1_1.getWidgetRecord();
            if (var27_27 != null) {
                var27_27 = var27_27.getWidgetType();
lbl155:
                // 2 sources

                while (true) {
                    continue;
                    break;
                }
            }
            var35_35 = 0;
            var27_27 = null;
            ** continue;
            var30_30 = false;
            var28_28 /* !! */  = null;
            var35_35 = b.i((String)var27_27, (String)var16_16, false);
            if (var35_35 != 0) {
                var27_27 = var9_9.USER_ID;
                var21_21.put(var27_27, var11_11);
            } else {
                var27_27 = "curated";
                var30_30 = var21_21.containsKey(var27_27);
                if (var30_30 && (var35_35 = b.i((String)(var27_27 = (String)var21_21.get(var27_27)), (String)var33_33, var30_30 = true)) != 0) {
                    var27_27 = z40_0.Companion;
                    var28_28 /* !! */  = var9_9.application;
                    var27_27.getClass();
                    var27_27 = z40$a.a((Context)var28_28 /* !! */ ).a;
                    var28_28 /* !! */  = "enable_UUID_Curated";
                    var35_35 = (int)var27_27.a((String)var28_28 /* !! */ );
                    if (var35_35 != 0) {
                        var27_27 = var9_9.USER_ID;
                        var21_21.put(var27_27, var11_11);
                    }
                } else {
                    var27_27 = z40_0.Companion;
                    var28_28 /* !! */  = var9_9.application;
                    var27_27.getClass();
                    var27_27 = z40$a.a((Context)var28_28 /* !! */ ).a;
                    var28_28 /* !! */  = "enable_UUID_Category";
                    var35_35 = var27_27.a((String)var28_28 /* !! */ );
                    if (var35_35 != 0) {
                        var27_27 = var9_9.USER_ID;
                        var21_21.put(var27_27, var11_11);
                    }
                }
            }
        }
        if (var6_6) {
            var11_11 = "includeUnratedProducts";
            var21_21.put(var11_11, var33_33);
        }
        var11_11 = cp_1.Companion;
        var11_11.getClass();
        var36_36 = cp$a.p();
        if (var36_36 != 0 && (var11_11 = var9_9.appPreferences.f()) != null && (var36_36 = var11_11.length()) != 0) {
            var11_11 = String.valueOf(var9_9.appPreferences.f());
            var27_27 = "customertype";
            var21_21.put(var27_27, var11_11);
        }
        if ((var11_11 = var9_9.userInformation.getUserSegementIds()) != null && (var36_36 = var11_11.length()) != 0) {
            var11_11 = var9_9.userInformation.getUserSegementIds();
            var27_27 = "segmentIds";
            var21_21.put(var27_27, var11_11);
        }
        if ((var11_11 = var1_1.getBrandCode()) != null && (var36_36 = var11_11.length()) != 0) {
            var11_11 = "brandCode";
            var27_27 = var1_1.getBrandCode();
            var21_21.put(var11_11, var27_27);
        }
        if ((var36_36 = (int)mz3_0.y((String)(var11_11 = (String)var22_22 /* !! */ .element))) != 0 && (var36_36 = (int)ww0_2.c()) != 0 && (var11_11 = (CharSequence)var22_22 /* !! */ .element) != null && (var36_36 = var11_11.length()) != 0) {
            var11_11 = var22_22 /* !! */ .element;
            var21_21.put(var26_26, var11_11);
        }
        if ((var36_36 = (int)h40_0.Q1()) != 0 && (var11_11 = var9_9.appPreferences.m()) != null && (var36_36 = var11_11.length()) != 0) {
            var11_11 = String.valueOf(var9_9.appPreferences.m());
            var26_26 = "pincode";
            var21_21.put(var26_26, var11_11);
        }
        var11_11 = el1_2.a;
        var36_36 = (int)el1_2.l();
        if (var36_36 != 0 && !var5_5) {
            var36_36 = 1;
        } else {
            var36_36 = 0;
            var11_11 = null;
        }
        var26_26 = cp$a.e();
        var27_27 = var1_1.getStoreId();
        var28_28 /* !! */  = od3_2.a();
        if (var27_27 == null || (var37_37 = var27_27.length()) == 0) {
            var27_27 = var28_28 /* !! */ ;
        }
        if (var30_30 = Intrinsics.areEqual(var27_27, var28_28 /* !! */  = ld3_2.STORE_AJIO.getStoreId())) {
            var27_27 = var34_34;
        }
        var30_30 = cp$a.r();
        var26_26.getClass();
        var26_26 = cp_1.a((String)var27_27, (String)var18_18, var30_30);
        var27_27 = h40_0.a;
        var35_35 = (int)h40_0.T1();
        if (var35_35 != 0) {
            var27_27 = "displayRatings";
            var21_21.put(var27_27, var33_33);
        }
        var33_33 = "false";
        if (var7_7) {
            var28_28 /* !! */  = var1_1.getStoreId();
            var21_21.put("store", var28_28 /* !! */ );
            var27_27 = "facets";
            var21_21.put(var27_27, var33_33);
        }
        var35_35 = 0;
        ke0_0.c((PLPRequest)var12_12, (LinkedHashMap)var21_21, (ProductListQuery)var10_10, false);
        var24_24 = "userInformation";
        var10_10 = "Cookie";
        var34_34 = var23_23;
        var23_23 = "userCohortValues";
        var38_38 = var18_18;
        var18_18 = "RequestId";
        var4_4 = "userId";
        var12_12 = "ai";
        var39_39 = "Authorization";
        var27_27 = "os";
        var40_40 = "Bearer ";
        var28_28 /* !! */  = "vr";
        var41_41 = var16_16;
        var16_16 = "ua";
        if (var36_36 != 0) {
            var42_42 = var24_24;
            var24_24 = el1_2.g();
            var43_43 = var24_24.containsKey(var16_16);
            var44_44 = var43_43 != false ? (String)var24_24.get(var16_16) : var34_34;
            var45_45 = var24_24.containsKey(var28_28 /* !! */ );
            var46_46 = var45_45 != false ? (String)var24_24.get(var28_28 /* !! */ ) : var34_34;
            var47_47 = var24_24.containsKey(var27_27);
            var48_48 = var47_47 != false ? (String)var24_24.get(var27_27) : var34_34;
            var49_49 = var24_24.containsKey(var12_12);
            var24_24 = var49_49 != false ? (String)var24_24.get(var12_12) : var34_34;
            var11_11 = String.valueOf((boolean)var36_36);
            var21_21.put("is_ads_enable_plp", var11_11);
            var9_9 = var1_1.getShowAdsOnNextPage();
            var11_11 = "showAdsOnNextPage";
            if (var9_9 != null) {
                var50_50 = var9_9.booleanValue();
                var9_9 = String.valueOf((boolean)var50_50);
                var21_21.put(var11_11, var9_9);
            } else {
                var21_21.put(var11_11, var33_33);
            }
            var9_9 = var14_14.element;
            var19_19.put(var18_18, var9_9);
            var9_9 = var22_22 /* !! */ .element;
            var19_19.put(var23_23, var9_9);
            var9_9 = var44_44 == null ? var34_34 : var44_44;
            var19_19.put(var16_16, var9_9);
            var9_9 = var46_46 == null ? var34_34 : var46_46;
            var19_19.put(var28_28 /* !! */ , var9_9);
            var9_9 = var48_48 == null ? var34_34 : var48_48;
            var19_19.put(var27_27, var9_9);
            var23_23 = var24_24 == null ? var34_34 : var24_24;
            var19_19.put(var12_12, var23_23);
            var50_50 = var26_26.length();
            if (var50_50 > 0) {
                var19_19.put(var10_10, var26_26);
            }
            var9_9 = this;
            var10_10 = this.userInformation;
            var11_11 = var42_42;
            Intrinsics.checkNotNullExpressionValue(var10_10, (String)var42_42);
            var10_10 = ServiceUtil.getToken((UserInformation)var10_10);
            var11_11 = var1_1.getWidgetRecord();
            if (var11_11 != null) {
                var24_24 = var11_11.getWidgetType();
                var33_33 = var41_41;
                var36_36 = 0;
                var11_11 = null;
            } else {
                var33_33 = var41_41;
                var36_36 = 0;
                var11_11 = null;
                var25_25 = 0;
                var24_24 = null;
            }
            var51_51 = b.i((String)var24_24, (String)var33_33, false);
            if ((var51_51 || (var36_36 = (int)h40_0.M1()) != 0) && var10_10 != null && (var36_36 = var10_10.length()) != 0 && var2_2) {
                var24_24 = var40_40;
                var10_10 = var40_40.concat((String)var10_10);
                var11_11 = var39_39;
                var19_19.put(var39_39, var10_10);
            }
            if ((var52_53 = h40_0.M1()) && (var52_53 = (var10_10 = UserInformation.getInstance((Context)var9_9.context)).isUserOnline())) {
                var10_10 = UserInformation.getInstance((Context)var9_9.context).getCustomerUUID();
                var11_11 = var4_4;
                var21_21.put(var4_4, var10_10);
            }
            var10_10 = var9_9.plpApiRepo;
            var11_11 = var38_38;
            var10_10 = var10_10.getProducts((String)var38_38, (Map)var21_21, (HashMap)var19_19);
        } else {
            var53_55 = var4_4;
            var11_11 = var24_24;
            var54_56 = var38_38;
            var33_33 = var41_41;
            var24_24 = var40_40;
            var38_38 = var21_21;
            var21_21 = var14_14.element;
            var19_19.put(var18_18, var21_21);
            var18_18 = var22_22 /* !! */ .element;
            var19_19.put(var23_23, var18_18);
            var18_18 = var34_34;
            var19_19.put(var16_16, var34_34);
            var19_19.put(var28_28 /* !! */ , var34_34);
            var19_19.put(var27_27, var34_34);
            var19_19.put(var12_12, var34_34);
            var51_52 = var26_26.length();
            if (var51_52 > 0) {
                var19_19.put(var10_10, var26_26);
            }
            var10_10 = var9_9.userInformation;
            Intrinsics.checkNotNullExpressionValue(var10_10, (String)var11_11);
            var10_10 = ServiceUtil.getToken((UserInformation)var10_10);
            var11_11 = var1_1.getWidgetRecord();
            if (var11_11 != null) {
                var11_11 = var11_11.getWidgetType();
lbl384:
                // 2 sources

                while (true) {
                    continue;
                    break;
                }
            }
            var36_36 = 0;
            var11_11 = null;
            ** continue;
            var51_52 = 0;
            var12_12 = null;
            var36_36 = b.i((String)var11_11, (String)var33_33, false);
            if ((var36_36 != 0 || (var36_36 = h40_0.M1()) != 0) && var10_10 != null && (var36_36 = var10_10.length()) != 0 && var2_2) {
                var10_10 = var24_24.concat((String)var10_10);
                var11_11 = var39_39;
                var19_19.put(var39_39, var10_10);
            }
            if ((var52_54 = h40_0.M1()) && (var52_54 = (var10_10 = UserInformation.getInstance((Context)var9_9.context)).isUserOnline())) {
                var10_10 = UserInformation.getInstance((Context)var9_9.context).getCustomerUUID();
                var11_11 = var38_38;
                var12_12 = var53_55;
                var38_38.put(var53_55, var10_10);
            } else {
                var11_11 = var38_38;
            }
            var10_10 = var9_9.plpApiRepo;
            var12_12 = var54_56;
            var10_10 = var10_10.getProducts((String)var54_56, (Map)var11_11, (HashMap)var19_19);
        }
        var11_11 = qt2_2.c;
        var10_10 = var10_10.h((Scheduler)var11_11);
        var11_11 = ti_2.a();
        var10_10 = var10_10.e((Scheduler)var11_11);
        var11_11 = new y12_0(0, var22_22 /* !! */ , var14_14);
        var12_12 = new js_1(var11_11, 1);
        var11_11 = new s53_0((q63_0)var10_10, (bx0_2)var12_12);
        var10_10 = new z12(var14_14);
        var12_12 = new u53_0((q63_0)var11_11, (bx0_2)var10_10);
        Intrinsics.checkNotNullExpressionValue(var12_12, "onErrorReturn(...)");
        return var12_12;
    }

    /*
     * Unable to fully structure code
     */
    public final Object getImageUploadUrl(String var1_1, f80_0 var2_2) {
        var3_3 = var2_2 instanceof NewPlpRepo$getImageUploadUrl$1;
        if (!var3_3) ** GOTO lbl-1000
        var4_4 = var2_2;
        var4_4 = (NewPlpRepo$getImageUploadUrl$1)var2_2;
        var5_5 = var4_4.label;
        var6_6 = -1 << -1;
        var7_7 = var5_5 & var6_6;
        if (var7_7 != 0) {
            var4_4.label = var5_5 -= var6_6;
        } else lbl-1000:
        // 2 sources

        {
            var4_4 = new NewPlpRepo$getImageUploadUrl$1(this, (f80_0)var2_2);
        }
        var2_2 = var4_4.result;
        var8_8 = j90_0.COROUTINE_SUSPENDED;
        var6_6 = var4_4.label;
        var7_7 = 1;
        if (var6_6 == 0) ** GOTO lbl22
        if (var6_6 == var7_7) {
            vl2_2.b(var2_2);
        } else {
            var1_1 = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            throw var1_1;
lbl22:
            // 1 sources

            vl2_2.b(var2_2);
            var2_2 = UrlHelper.Companion.getInstance();
            var6_6 = 0;
            var9_9 = new Object[]{};
            var10_10 = "plp";
            var11_11 = "get_image_upload_url";
            var2_2 = var2_2.getApiUrl(var10_10, var11_11, (Object[])var9_9);
            var9_9 = this.plpApiRepo;
            var4_4.label = var7_7;
            var12_12 = "PlpGetUploadUrl";
            var2_2 = var9_9.getImageUploadUrl((String)var2_2, (String)var1_1, var12_12, var4_4);
            if (var2_2 == var8_8) {
                return var8_8;
            }
        }
        var2_2 = (dl2_2)var2_2;
        var1_1 = var2_2.a;
        var13_13 = var1_1.d();
        if (var13_13) {
            return var2_2.b;
        }
        return null;
    }

    /*
     * Unable to fully structure code
     */
    public final Object getMoreProductsFromImageSearch(ImageSearchResponse var1_1, ProductListQuery var2_2, f80_0 var3_3) {
        var4_4 = var3_3 instanceof NewPlpRepo$getMoreProductsFromImageSearch$1;
        if (!var4_4) ** GOTO lbl-1000
        var5_5 = var3_3;
        var5_5 = (NewPlpRepo$getMoreProductsFromImageSearch$1)var3_3;
        var6_6 = var5_5.label;
        var7_7 = -1 << -1;
        var8_8 = var6_6 & var7_7;
        if (var8_8 != 0) {
            var5_5.label = var6_6 -= var7_7;
        } else lbl-1000:
        // 2 sources

        {
            var5_5 = new NewPlpRepo$getMoreProductsFromImageSearch$1(this, (f80_0)var3_3);
        }
        var3_3 = var5_5.result;
        var9_9 = j90_0.COROUTINE_SUSPENDED;
        var7_7 = var5_5.label;
        var8_8 = 1;
        if (var7_7 == 0) ** GOTO lbl22
        if (var7_7 == var8_8) {
            vl2_2.b(var3_3);
        } else {
            var1_1 = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            throw var1_1;
lbl22:
            // 1 sources

            vl2_2.b(var3_3);
            var3_3 = h40_0.a;
            var10_10 = h40_0.m2();
            var3_3 = var10_10 != false ? "more_image_search_url_v2" : "more_image_search_url";
            var11_11 = UrlHelper.Companion.getInstance();
            var12_12 = 0;
            var13_13 = null;
            var14_14 = new Object[]{};
            var15_15 = "plp";
            var3_3 = var11_11.getApiUrl(var15_15, (String)var3_3, var14_14);
            var1_1 = var1_1.getCurrentQuery();
            if (var1_1 != null) {
                var1_1 = var1_1.getUrl();
            } else {
                var16_16 = false;
                var1_1 = null;
            }
            var1_1 = Ft2.a((String)var3_3, (String)var1_1);
            var3_3 = NewQueryUtil.INSTANCE;
            var7_7 = 2;
            var2_2 = fh1_2.q(NewQueryUtil.getProductsParameter$default((NewQueryUtil)var3_3, (ProductListQuery)var2_2, false, var7_7, null));
            var10_10 = h40_0.M1();
            if (var10_10 && (var10_10 = (var3_3 = UserInformation.getInstance((Context)this.context)).isUserOnline())) {
                var3_3 = UserInformation.getInstance((Context)this.context).getCustomerUUID();
                var11_11 = "userId";
                var2_2.put(var11_11, var3_3);
            }
            TU2.a((HashMap)var2_2);
            var3_3 = this.userInformation;
            Intrinsics.checkNotNullExpressionValue(var3_3, "userInformation");
            var3_3 = ServiceUtil.getToken((UserInformation)var3_3);
            var11_11 = new HashMap();
            var12_12 = h40_0.M1();
            if (var12_12 != 0 && var3_3 != null && (var12_12 = var3_3.length()) != 0 && (var12_12 = (int)(var13_13 = this.userInformation).isUserOnline()) != 0) {
                var3_3 = "Bearer ".concat((String)var3_3);
                var13_13 = "Authorization";
                var11_11.put(var13_13, var3_3);
            }
            var3_3 = this.plpApiRepo;
            var5_5.label = var8_8;
            if ((var3_3 = var3_3.getMoreProductsFromImageSearch((String)var1_1, (Map)var2_2, (HashMap)var11_11, var5_5)) == var9_9) {
                return var9_9;
            }
        }
        var3_3 = (dl2_2)var3_3;
        var1_1 = var3_3.a;
        var16_16 = var1_1.d();
        if (var16_16) {
            return var3_3.b;
        }
        return null;
    }

    public final g53_0 getNewUserBanner() {
        Object object = UrlHelper.Companion.getInstance();
        Object object2 = new Object[]{};
        object = ((UrlHelper)object).getApiUrl("plp", "new_user_banner", object2);
        object = this.plpApiRepo.getNewUserBanner((String)object, "PlpNewUserBanner");
        object2 = qt2_2.c;
        object = ((g53_0)object).h((Scheduler)object2);
        object2 = ti_2.a();
        object = ((g53_0)object).e((Scheduler)object2);
        object2 = new Object();
        Object object3 = new u12_0((D12)object2);
        object2 = new s53_0((q63_0)object, (bx0_2)object3);
        object = new Object();
        object3 = new u53_0((q63_0)object2, (bx0_2)object);
        Intrinsics.checkNotNullExpressionValue(object3, "onErrorReturn(...)");
        return object3;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final g53_0 getProducts(ProductListQuery var1_1, boolean var2_2, String var3_3, String var4_4, String var5_5, boolean var6_6, boolean var7_7, boolean var8_8, PLPRequest var9_9) {
        var10_10 = this;
        var11_11 = var1_1;
        var12_12 = var4_4;
        var13_13 = var5_5;
        var14_14 = var9_9;
        var15_15 = false;
        var16_16 = null;
        Intrinsics.checkNotNullParameter(var1_1, "productListQuery");
        Intrinsics.checkNotNullParameter(var9_9, "plpRequest");
        var17_17 = AM0.a();
        var18_18 = new HashMap<Object, Object>();
        var19_19 = h40_0.a;
        var20_20 = h40_0.z1();
        var21_21 = var17_17.a;
        if (var21_21 != null) {
            var17_17.a = null;
            var11_11 = g53_0.d(DataCallback.Companion.onSuccess(var21_21));
            Intrinsics.checkNotNull(var11_11);
            return var11_11;
        }
        var22_22 = 1;
        var23_23 = ke0_0.b(var1_1, (boolean)var22_22);
        var21_21 = var23_23 != false ? "search_product_v5" : ((var23_23 = h40_0.m2()) != false ? "search_product_v4" : "search_product_v3");
        var24_24 = UrlHelper.Companion.getInstance();
        var25_25 = new Object[]{};
        var21_21 = var24_24.getApiUrl("plp", (String)var21_21, (Object[])var25_25);
        var26_26 = TextUtils.isEmpty((CharSequence)var4_4);
        var27_27 = "&";
        if (!var26_26 && !(var26_26 = TextUtils.isEmpty((CharSequence)var21_21))) {
            var26_26 = StringsKt.F((CharSequence)var21_21, (CharSequence)var27_27, false);
            if (var26_26) {
                var12_12 = n1.a((String)var21_21, (String)var27_27, (String)var12_12);
lbl32:
                // 2 sources

                while (true) {
                    var21_21 = var12_12;
                    break;
                }
            } else {
                var24_24 = "?";
                var12_12 = n1.a((String)var21_21, (String)var24_24, (String)var12_12);
                ** continue;
            }
        }
        var12_12 = new Ref$ObjectRef();
        var12_12.element = var24_24 = "";
        var25_25 = NewQueryUtil.INSTANCE;
        if (var8_8 && var20_20) {
            var20_20 = true;
        } else {
            var20_20 = false;
            var19_19 = null;
        }
        var19_19 = fh1_2.q(var25_25.getProductsParameter((ProductListQuery)var11_11, var20_20));
        TU2.a((HashMap)var19_19);
        var25_25 = cp_1.Companion;
        var25_25.getClass();
        var28_28 = cp$a.r();
        var29_29 = "userClusterId";
        var30_30 = "rilfnl";
        if (var28_28 != 0) {
            var25_25 = var1_1.getStoreId();
            var31_31 /* !! */  = od3_2.a();
            if (var25_25 == null || (var32_32 = var25_25.length()) == 0) {
                var25_25 = var31_31 /* !! */ ;
            }
            if (var33_33 = Intrinsics.areEqual(var25_25, var31_31 /* !! */  = ld3_2.STORE_AJIO.getStoreId())) {
                var25_25 = var30_30;
            }
            var31_31 /* !! */  = CustomerStoreType.a;
            var31_31 /* !! */  = ScreenType.SCREEN_PLP;
            var12_12.element = var25_25 = CustomerStoreType.a((String)var25_25, (ScreenType)var31_31 /* !! */ );
            var28_28 = TextUtils.isEmpty((CharSequence)var25_25);
            if (var28_28 == 0) {
                var25_25 = var12_12.element;
                var19_19.put(var29_29, var25_25);
            }
        }
        var25_25 = z40_0.Companion;
        var31_31 /* !! */  = var10_10.application;
        var25_25.getClass();
        var25_25 = z40$a.a((Context)var31_31 /* !! */ ).a;
        var31_31 /* !! */  = "append_platform_info";
        var28_28 = var25_25.a((String)var31_31 /* !! */ );
        if (var28_28 != 0) {
            var25_25 = "platform";
            var31_31 /* !! */  = "android";
            var19_19.put(var25_25, var31_31 /* !! */ );
        }
        var28_28 = TextUtils.isEmpty((CharSequence)var3_3);
        var31_31 /* !! */  = "=";
        if (var28_28 != 0) ** GOTO lbl-1000
        Intrinsics.checkNotNull(var3_3);
        var25_25 = new Regex((String)var31_31 /* !! */ );
        var16_16 = var3_3;
        var16_16 = var25_25.e(var3_3);
        var28_28 = var16_16.isEmpty();
        if (var28_28 == 0) {
            var28_28 = var16_16.size();
            var25_25 = var16_16.listIterator(var28_28);
            while ((var32_32 = (int)var25_25.hasPrevious()) != 0) {
                var34_34 = (String)var25_25.previous();
                var32_32 = var34_34.length();
                if (var32_32 == 0) continue;
                var16_16 = (Iterable)var16_16;
                var28_28 = var25_25.nextIndex() + var22_22;
                var16_16 = CollectionsKt.f0((Iterable)var16_16, var28_28);
                break;
            }
        } else {
            var16_16 = mz0_2.a;
        }
        var16_16 = (Collection)var16_16;
        var25_25 = null;
        var17_17 = new String[]{};
        var16_16 = var16_16.toArray((T[])var17_17);
        var22_22 = ((String[])var16_16).length;
        var28_28 = 1;
        if (var22_22 > var28_28 && (var22_22 = (int)TextUtils.isEmpty((CharSequence)(var17_17 = var16_16[var28_28]))) == 0) {
            var4_4 = var30_30;
            var22_22 = 0;
            var17_17 = null;
            var30_30 = var16_16[0];
            var16_16 = var16_16[var28_28];
            var19_19.put(var30_30, var16_16);
        } else lbl-1000:
        // 2 sources

        {
            var4_4 = var30_30;
        }
        var15_15 = h40_0.Q1();
        if (var15_15 && (var16_16 = var10_10.appPreferences.m()) != null && (var15_15 = var16_16.length())) {
            var16_16 = String.valueOf(var10_10.appPreferences.m());
            var17_17 = "pincode";
            var19_19.put(var17_17, var16_16);
        }
        var16_16 = z40_0.Companion;
        var17_17 = var10_10.application;
        var16_16.getClass();
        var16_16 = z40$a.a((Context)var17_17).a;
        var17_17 = "plp_additional_query_parameter";
        var16_16 = var16_16.b((String)var17_17);
        var15_15 = var16_16.length();
        if (var15_15 > false) {
            var16_16 = z40$a.a((Context)var10_10.application).a.b((String)var17_17);
            var17_17 = new Regex((String)var27_27);
            var16_16 = var17_17.e((CharSequence)var16_16).iterator();
            while ((var22_22 = (int)var16_16.hasNext()) != 0) {
                var17_17 = (String)var16_16.next();
                var35_35 = (var17_17 = fT1.a((String)var31_31 /* !! */ , (String)var17_17)).isEmpty();
                if (var35_35 == 0) {
                    var35_35 = var17_17.size();
                    var27_27 = var17_17.listIterator(var35_35);
                    while ((var28_28 = (int)var27_27.hasPrevious()) != 0) {
                        var25_25 = (String)var27_27.previous();
                        var28_28 = var25_25.length();
                        if (var28_28 == 0) continue;
                        var17_17 = (Iterable)var17_17;
                        var35_35 = var27_27.nextIndex();
                        var28_28 = 1;
                        var17_17 = CollectionsKt.f0((Iterable)var17_17, var35_35 += var28_28);
                        break;
                    }
                } else {
                    var17_17 = mz0_2.a;
                }
                var17_17 = (Collection)var17_17;
                var35_35 = 0;
                var27_27 = null;
                var25_25 = new String[0];
                var28_28 = ((Object)(var17_17 = (String[])var17_17.toArray((T[])var25_25))).length;
                if (var28_28 <= (var36_36 = 1) || (var28_28 = (var25_25 = var17_17[var36_36]).length()) <= 0) continue;
                var25_25 = var17_17[0];
                var17_17 = var17_17[var36_36];
                var19_19.put(var25_25, var17_17);
            }
        }
        var16_16 = "true";
        if (var7_7) {
            var17_17 = "includeUnratedProducts";
            var19_19.put(var17_17, var16_16);
        }
        if (var2_2 && var13_13 != null) {
            var17_17 = z40_0.Companion;
            var27_27 = var10_10.application;
            var17_17.getClass();
            var17_17 = z40$a.a((Context)var27_27).a;
            var27_27 = "enable_UUID_search";
            var22_22 = (int)var17_17.a((String)var27_27);
            if (var22_22 != 0) {
                var17_17 = var10_10.USER_ID;
                var19_19.put(var17_17, var13_13);
            }
        }
        if ((var13_13 = var10_10.userInformation.getUserSegementIds()) != null && (var37_37 = var13_13.length()) != 0) {
            var13_13 = var10_10.userInformation.getUserSegementIds();
            var17_17 = "segmentIds";
            var19_19.put(var17_17, var13_13);
        }
        if ((var37_37 = (int)mz3_0.y((String)(var13_13 = (String)var12_12.element))) != 0 && (var37_37 = (int)ww0_2.c()) != 0 && (var13_13 = (CharSequence)var12_12.element) != null && (var37_37 = var13_13.length()) != 0) {
            var13_13 = var12_12.element;
            var19_19.put(var29_29, var13_13);
        }
        var13_13 = el1_2.a;
        var37_37 = (int)el1_2.k();
        cp_1.Companion.getClass();
        var17_17 = cp$a.e();
        var27_27 = var1_1.getStoreId();
        var25_25 = od3_2.a();
        if (var27_27 == null || (var38_38 = var27_27.length()) == 0) {
            var27_27 = var25_25;
        }
        var30_30 = (var28_28 = (int)Intrinsics.areEqual(var27_27, var25_25 = ld3_2.STORE_AJIO.getStoreId())) == 0 ? var27_27 : var4_4;
        var35_35 = (int)cp$a.r();
        var17_17.getClass();
        var17_17 = cp_1.a((String)var30_30, (String)var21_21, (boolean)var35_35);
        var27_27 = h40_0.a;
        var35_35 = (int)h40_0.T1();
        if (var35_35 != 0) {
            var27_27 = "displayRatings";
            var19_19.put(var27_27, var16_16);
        }
        var15_15 = true;
        ke0_0.c((PLPRequest)var14_14, (LinkedHashMap)var19_19, (ProductListQuery)var11_11, var15_15);
        var27_27 = "userInformation";
        var25_25 = "userId";
        var29_29 = "Cookie";
        var30_30 = "userCohortValues";
        var31_31 /* !! */  = "RequestId";
        var11_11 = "ai";
        var4_4 = var24_24;
        var24_24 = "os";
        var34_34 = var21_21;
        var21_21 = "vr";
        var39_39 = "Authorization";
        var14_14 = "ua";
        var3_3 = "Bearer ";
        var16_16 = "PLPSearchProducts";
        if (var37_37 != 0) {
            var13_13 = el1_2.g();
            var40_40 = var13_13.containsKey(var14_14);
            var41_41 = var40_40 != false ? (String)var13_13.get(var14_14) : var4_4;
            var42_42 = var13_13.containsKey(var21_21);
            var43_43 = var42_42 != false ? (String)var13_13.get(var21_21) : var4_4;
            var44_44 = var13_13.containsKey(var24_24);
            var45_45 = var44_44 != false ? (String)var13_13.get(var24_24) : var4_4;
            var46_46 = var13_13.containsKey(var11_11);
            var13_13 = var46_46 != false ? (String)var13_13.get(var11_11) : var4_4;
            var46_46 = el1_2.m();
            var5_5 = var27_27;
            var27_27 = String.valueOf(var46_46);
            var47_47 = var25_25;
            var19_19.put("is_ads_enable_slp", var27_27);
            var27_27 = "false";
            var25_25 = "is_ads_enable_plp";
            if (var8_8) {
                var19_19.put(var25_25, var27_27);
            } else {
                var46_46 = el1_2.l();
                var10_10 = String.valueOf(var46_46);
                var19_19.put(var25_25, var10_10);
            }
            var10_10 = var1_1.getShowAdsOnNextPage();
            var25_25 = "showAdsOnNextPage";
            if (var10_10 != null) {
                var48_48 = var10_10.booleanValue();
                var10_10 = String.valueOf((boolean)var48_48);
                var19_19.put(var25_25, var10_10);
            } else {
                var19_19.put(var25_25, var27_27);
            }
            var18_18.put(var31_31 /* !! */ , var16_16);
            var10_10 = var12_12.element;
            var18_18.put(var30_30, var10_10);
            var10_10 = var41_41 == null ? var4_4 : var41_41;
            var18_18.put(var14_14, var10_10);
            var10_10 = var43_43 == null ? var4_4 : var43_43;
            var18_18.put(var21_21, var10_10);
            var10_10 = var45_45 == null ? var4_4 : var45_45;
            var18_18.put(var24_24, var10_10);
            var24_24 = var13_13 == null ? var4_4 : var13_13;
            var18_18.put(var11_11, var24_24);
            if (var17_17 != null && (var48_48 = var17_17.length()) != 0) {
                var18_18.put(var29_29, var17_17);
            }
            if ((var48_48 = h40_0.M1()) != 0) {
                var10_10 = this;
                var11_11 = UserInformation.getInstance((Context)this.context);
                var49_49 = var11_11.isUserOnline();
                if (var49_49) {
                    var11_11 = UserInformation.getInstance((Context)this.context).getCustomerUUID();
                    var13_13 = var47_47;
                    var19_19.put(var47_47, var11_11);
                }
            } else {
                var10_10 = this;
            }
            var11_11 = var10_10.userInformation;
            var27_27 = var5_5;
            Intrinsics.checkNotNullExpressionValue(var11_11, (String)var5_5);
            var11_11 = ServiceUtil.getToken((UserInformation)var11_11);
            var37_37 = (int)h40_0.M1();
            if (var37_37 != 0 && var11_11 != null && (var37_37 = var11_11.length()) != 0 && (var37_37 = (int)(var13_13 = var10_10.userInformation).isUserOnline()) != 0) {
                var25_25 = var3_3;
                var11_11 = var3_3.concat((String)var11_11);
                var13_13 = var39_39;
                var18_18.put(var39_39, var11_11);
            }
            var11_11 = var10_10.plpApiRepo;
            var13_13 = var34_34;
            var11_11 = var11_11.getProducts((String)var34_34, (Map)var19_19, var18_18);
        } else {
            var50_51 = var39_39;
            var13_13 = var25_25;
            var51_52 = var34_34;
            var25_25 = var3_3;
            var18_18.put(var31_31 /* !! */ , var16_16);
            var16_16 = var12_12.element;
            var18_18.put(var30_30, var16_16);
            var16_16 = var4_4;
            var18_18.put(var14_14, var4_4);
            var18_18.put(var21_21, var4_4);
            var18_18.put(var24_24, var4_4);
            var18_18.put(var11_11, var4_4);
            if (var17_17 != null && (var49_50 = var17_17.length()) != 0) {
                var18_18.put(var29_29, var17_17);
            }
            if ((var49_50 = h40_0.M1()) != 0 && (var49_50 = (int)(var11_11 = UserInformation.getInstance((Context)var10_10.context)).isUserOnline()) != 0) {
                var11_11 = UserInformation.getInstance((Context)var10_10.context).getCustomerUUID();
                var19_19.put(var13_13, var11_11);
            }
            var11_11 = var10_10.userInformation;
            Intrinsics.checkNotNullExpressionValue(var11_11, (String)var27_27);
            var11_11 = ServiceUtil.getToken((UserInformation)var11_11);
            var37_37 = (int)h40_0.M1();
            if (var37_37 != 0 && var11_11 != null && (var37_37 = var11_11.length()) != 0 && (var37_37 = (int)(var13_13 = var10_10.userInformation).isUserOnline()) != 0) {
                var11_11 = var25_25.concat((String)var11_11);
                var13_13 = var50_51;
                var18_18.put(var50_51, var11_11);
            }
            var11_11 = var10_10.plpApiRepo;
            var21_21 = var51_52;
            var11_11 = var11_11.getProducts((String)var51_52, (Map)var19_19, var18_18);
        }
        var13_13 = qt2_2.c;
        var11_11 = var11_11.h((Scheduler)var13_13);
        var13_13 = ti_2.a();
        var11_11 = var11_11.e((Scheduler)var13_13);
        var13_13 = new A12(var12_12, 0);
        var12_12 = new B12(0, (Function1)var13_13);
        var13_13 = new s53_0((q63_0)var11_11, (bx0_2)var12_12);
        var11_11 = new C12(0);
        var12_12 = new u53_0((q63_0)var13_13, (bx0_2)var11_11);
        Intrinsics.checkNotNullExpressionValue(var12_12, "onErrorReturn(...)");
        return var12_12;
    }

    /*
     * Unable to fully structure code
     */
    public final Object getProductsFromImageSearch(String var1_1, ProductListQuery var2_2, f80_0 var3_3) {
        var4_4 = var3_3 instanceof NewPlpRepo$getProductsFromImageSearch$1;
        if (!var4_4) ** GOTO lbl-1000
        var5_5 = var3_3;
        var5_5 = (NewPlpRepo$getProductsFromImageSearch$1)var3_3;
        var6_6 = var5_5.label;
        var7_7 = -1 << -1;
        var8_8 = var6_6 & var7_7;
        if (var8_8 != 0) {
            var5_5.label = var6_6 -= var7_7;
        } else lbl-1000:
        // 2 sources

        {
            var5_5 = new NewPlpRepo$getProductsFromImageSearch$1(this, (f80_0)var3_3);
        }
        var3_3 = var5_5.result;
        var9_9 = j90_0.COROUTINE_SUSPENDED;
        var7_7 = var5_5.label;
        var8_8 = 0;
        var10_10 = 1;
        if (var7_7 == 0) ** GOTO lbl23
        if (var7_7 == var10_10) {
            vl2_2.b(var3_3);
        } else {
            var1_1 = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            throw var1_1;
lbl23:
            // 1 sources

            vl2_2.b(var3_3);
            var3_3 = NewQueryUtil.INSTANCE;
            var7_7 = 0;
            var11_11 = null;
            var12_12 = 2;
            var2_2 = fh1_2.q(NewQueryUtil.getProductsParameter$default((NewQueryUtil)var3_3, (ProductListQuery)var2_2, false, var12_12, null));
            var13_13 = h40_0.Q1();
            if (var13_13 != 0 && (var3_3 = this.appPreferences.m()) != null && (var13_13 = var3_3.length()) != 0) {
                var3_3 = String.valueOf(this.appPreferences.m());
                var11_11 = "pincode";
                var2_2.put(var11_11, var3_3);
            }
            TU2.a((HashMap)var2_2);
            var3_3 = this.userInformation;
            Intrinsics.checkNotNullExpressionValue(var3_3, "userInformation");
            var3_3 = ServiceUtil.getToken((UserInformation)var3_3);
            var11_11 = new HashMap();
            var14_14 = h40_0.a;
            var12_12 = (int)h40_0.M1();
            if (var12_12 != 0 && var3_3 != null && (var12_12 = var3_3.length()) != 0 && (var12_12 = (int)(var14_14 = this.userInformation).isUserOnline()) != 0) {
                var3_3 = "Bearer ".concat((String)var3_3);
                var14_14 = "Authorization";
                var11_11.put(var14_14, var3_3);
            }
            var3_3 = this.plpApiRepo;
            var5_5.label = var10_10;
            if ((var3_3 = var3_3.getProductsFromImageSearch((String)var1_1, (Map)var2_2, (HashMap)var11_11, var5_5)) == var9_9) {
                return var9_9;
            }
        }
        var3_3 = (dl2_2)var3_3;
        var1_1 = var3_3.a;
        var15_15 = var1_1.d();
        if (var15_15) {
            return var3_3.b;
        }
        return null;
    }

    public final g53_0 getStoreCategories(String object) {
        Intrinsics.checkNotNullParameter(object, "storeId");
        Object object2 = UrlHelper.Companion.getInstance();
        Object object3 = new Object[]{};
        object2 = ((UrlHelper)object2).getApiUrl("homepage", "nav_menu", object3);
        object3 = Ft2.a((String)object, "appnavbar");
        object = Ft2.a((String)object, "appnavnode");
        object = this.plpApiRepo.getCategoryNavigation((String)object2, (String)object3, (String)object, "BackGround_AllCategories");
        object2 = qt2_2.c;
        object = ((g53_0)object).h((Scheduler)object2);
        object2 = ti_2.a();
        object = ((g53_0)object).e((Scheduler)object2);
        object2 = new b90_0(2);
        object3 = new fs_0(1, (Function1)object2);
        object2 = new s53_0((q63_0)object, (bx0_2)object3);
        object = new Object();
        object3 = new u53_0((q63_0)object2, (bx0_2)object);
        Intrinsics.checkNotNullExpressionValue(object3, "onErrorReturn(...)");
        return object3;
    }

    public final g53_0 getStoreInfo(String object) {
        Intrinsics.checkNotNullParameter(object, "storeId");
        Object object2 = (StoreMetaData)g62_0.c.b.get(object);
        if (object2 != null) {
            object = g53_0.d(DataCallback.Companion.onSuccess(object2));
            Intrinsics.checkNotNull(object);
            return object;
        }
        lr2_2.Companion.getClass();
        object2 = UrlHelper.Companion.getInstance();
        Object object3 = new Object[]{};
        object2 = ((UrlHelper)object2).getApiUrl("homepage", "sis_store_cms_meta_data", object3);
        object = this.plpApiRepo.getStoreMetadata((String)object2, (String)object, "BackGround_StoreMetaData");
        object2 = qt2_2.c;
        object = ((g53_0)object).h((Scheduler)object2);
        object2 = ti_2.a();
        object = ((g53_0)object).e((Scheduler)object2);
        object2 = new Object();
        object3 = new HS(1, (Function1)object2);
        object2 = new s53_0((q63_0)object, (bx0_2)object3);
        object = new x12_0(0);
        object3 = new u53_0((q63_0)object2, (bx0_2)object);
        Intrinsics.checkNotNullExpressionValue(object3, "onErrorReturn(...)");
        return object3;
    }

    public final zr1_1 observeImageUploadStatus() {
        return this.uploadImageStatusObserver;
    }

    public final Object uploadImage(String object, pj2_2 object2, f80_0 f80_02) {
        NewPlpRepo$uploadImage$2 newPlpRepo$uploadImage$2 = new NewPlpRepo$uploadImage$2(this, (String)object, (pj2_2)object2, null);
        if ((object = d.c(newPlpRepo$uploadImage$2, f80_02)) == (object2 = j90_0.COROUTINE_SUSPENDED)) {
            return object;
        }
        return Unit.a;
    }
}

