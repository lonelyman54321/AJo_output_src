/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.ril.ajio.data.repo;

import android.content.Context;
import com.google.gson.JsonObject;
import com.ril.ajio.data.model.CMSConfigInitializer;
import com.ril.ajio.data.repo.ApiErrorRepo;
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.login.CustomerStoreType;
import com.ril.ajio.services.data.Home.BrandCategoryData;
import com.ril.ajio.services.data.Home.NavigationParent;
import com.ril.ajio.services.data.sis.StoreMetaData;
import com.ril.ajio.services.data.user.ScreenType;
import com.ril.ajio.services.helper.UrlHelper;
import com.ril.ajio.services.helper.UrlHelper$Companion;
import com.ril.ajio.services.network.api.CategoryNavigationApi;
import com.ril.ajio.services.network.connector.AjioApiConnector;
import com.ril.ajio.services.utils.JsonUtils;
import io.reactivex.Scheduler;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.b;

public final class CategoryNavigationRepo {
    public static final int $stable = 8;
    private final jo_2 appPreferences;
    private final CategoryNavigationApi categoryNavigationApi;
    private final String channel;
    private final String navigationType;
    private final String navigationTypeCategory;
    private final String platform;
    private final String tenantId;

    public CategoryNavigationRepo(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Object object = AjioApiConnector.INSTANCE.getCategoryNavigation();
        this.categoryNavigationApi = object;
        this.appPreferences = object = new jo_2(context);
        this.channel = "Android";
        this.navigationType = "SIDE_BAR";
        this.navigationTypeCategory = "CATEGORIES";
        this.platform = "MOBILE";
        this.tenantId = "AJIO";
    }

    public static /* synthetic */ DataCallback a(uq_1 uq_12, Object object) {
        return CategoryNavigationRepo.getCMSCategoryNavigation$lambda$10(uq_12, object);
    }

    public static /* synthetic */ DataCallback b(CategoryNavigationRepo categoryNavigationRepo, Throwable throwable) {
        return CategoryNavigationRepo.getStoreInfo$lambda$8(categoryNavigationRepo, throwable);
    }

    public static /* synthetic */ DataCallback c(boolean bl2, String string2, CategoryNavigationRepo categoryNavigationRepo, boolean bl3, zr1_1 zr1_12, dl2_2 dl2_22) {
        return CategoryNavigationRepo.getCMSCategoryNavigation$lambda$9(bl2, string2, categoryNavigationRepo, bl3, zr1_12, dl2_22);
    }

    public static /* synthetic */ DataCallback d(CategoryNavigationRepo categoryNavigationRepo, dl2_2 dl2_22) {
        return CategoryNavigationRepo.getLuxBrandCategory$lambda$3(categoryNavigationRepo, dl2_22);
    }

    public static /* synthetic */ DataCallback e(mq_2 mq_22, Object object) {
        return CategoryNavigationRepo.getLuxCategoryNavigation$lambda$1(mq_22, object);
    }

    public static /* synthetic */ DataCallback f(xq_1 xq_12, Object object) {
        return CategoryNavigationRepo.getStoreInfo$lambda$7(xq_12, object);
    }

    public static /* synthetic */ DataCallback g(CategoryNavigationRepo categoryNavigationRepo, boolean bl2, zr1_1 zr1_12, Throwable throwable) {
        return CategoryNavigationRepo.getLuxCategoryNavigation$lambda$2(categoryNavigationRepo, bl2, zr1_12, throwable);
    }

    /*
     * WARNING - void declaration
     */
    public static /* synthetic */ g53_0 getCMSCategoryNavigation$default(CategoryNavigationRepo categoryNavigationRepo, zr1_1 zr1_12, boolean bl2, String string2, boolean bl3, boolean bl4, int n3, Object object) {
        void var5_6;
        void var6_7;
        int n4 = var6_7 & 8;
        boolean bl5 = n4 != 0 ? false : bl3;
        int n7 = var6_7 & 0x10;
        boolean bl6 = n7 != 0 ? false : var5_6;
        return categoryNavigationRepo.getCMSCategoryNavigation(zr1_12, bl2, string2, bl5, bl6);
    }

    private static final DataCallback getCMSCategoryNavigation$lambda$10(Function1 function1, Object object) {
        return (DataCallback)oj_0.a(function1, "$tmp0", object, "p0", object);
    }

    private static final DataCallback getCMSCategoryNavigation$lambda$11(CategoryNavigationRepo object, boolean bl2, zr1_1 zr1_12, Throwable throwable) {
        Intrinsics.checkNotNullParameter(object, "this$0");
        Intrinsics.checkNotNullParameter(zr1_12, "$cmsCategoryNavigationObservable");
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        String string2 = "BackGround_AllCMSCategories";
        object = ((CategoryNavigationRepo)object).handleApiException(throwable, string2);
        if (!bl2) {
            zr1_12.i(object);
        }
        return object;
    }

    private static final DataCallback getCMSCategoryNavigation$lambda$9(boolean bl2, String object, CategoryNavigationRepo object2, boolean bl3, zr1_1 zr1_12, dl2_2 object3) {
        Object object4;
        Intrinsics.checkNotNullParameter(object, "$store");
        Intrinsics.checkNotNullParameter(object2, "this$0");
        Intrinsics.checkNotNullParameter(zr1_12, "$cmsCategoryNavigationObservable");
        Intrinsics.checkNotNullParameter(object3, "response");
        NavigationParent navigationParent = (NavigationParent)((dl2_2)object3).b;
        cl2_2 cl2_22 = ((dl2_2)object3).a;
        boolean bl4 = cl2_22.d();
        if (bl4 && navigationParent != null) {
            if (!bl2) {
                object4 = JsonUtils.toJson(navigationParent);
                object3 = ld3_2.STORE_LUXE.getStoreId();
                boolean bl5 = b.i((String)object, (String)object3, bl4 = true);
                if (bl5) {
                    object = ((CategoryNavigationRepo)object2).appPreferences;
                    if (object4 != null) {
                        object2 = "luxe_cms_navigation_nodes";
                        ((sw_0)object).putPreference((String)object2, (String)object4);
                    } else {
                        object.getClass();
                    }
                } else {
                    object = ((CategoryNavigationRepo)object2).appPreferences;
                    if (object4 != null) {
                        object2 = "cms_navigation_nodes";
                        ((sw_0)object).putPreference((String)object2, (String)object4);
                    } else {
                        object.getClass();
                    }
                }
            }
            object4 = DataCallback.Companion.onSuccess(navigationParent);
            if (!bl3) {
                zr1_12.i(object4);
            }
        } else {
            object4 = ((CategoryNavigationRepo)object2).handleApiError((dl2_2)object3, "BackGround_AllCMSCategories");
            if (!bl3) {
                zr1_12.i(object4);
            }
        }
        return object4;
    }

    private static final DataCallback getLuxBrandCategory$lambda$3(CategoryNavigationRepo object, dl2_2 dl2_22) {
        Intrinsics.checkNotNullParameter(object, "this$0");
        Intrinsics.checkNotNullParameter(dl2_22, "navigationResp");
        Object object2 = (BrandCategoryData)dl2_22.b;
        cl2_2 cl2_22 = dl2_22.a;
        boolean bl2 = cl2_22.d();
        if (bl2 && object2 != null) {
            object = DataCallback.Companion.onSuccess(object2);
        } else {
            object2 = "LuxBrandCategory";
            object = ((CategoryNavigationRepo)object).handleApiError(dl2_22, (String)object2);
        }
        return object;
    }

    private static final DataCallback getLuxBrandCategory$lambda$4(Function1 function1, Object object) {
        return (DataCallback)oj_0.a(function1, "$tmp0", object, "p0", object);
    }

    private static final DataCallback getLuxBrandCategory$lambda$5(CategoryNavigationRepo categoryNavigationRepo, Throwable throwable) {
        Intrinsics.checkNotNullParameter(categoryNavigationRepo, "this$0");
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        return categoryNavigationRepo.handleApiException(throwable, "LuxBrandCategory");
    }

    private static final DataCallback getLuxCategoryNavigation$lambda$0(CategoryNavigationRepo object, boolean bl2, zr1_1 zr1_12, dl2_2 object2) {
        Intrinsics.checkNotNullParameter(object, "this$0");
        Intrinsics.checkNotNullParameter(zr1_12, "$luxCategoryObservable");
        Intrinsics.checkNotNullParameter(object2, "navigationResp");
        Object object3 = (NavigationParent)((dl2_2)object2).b;
        Object object4 = ((dl2_2)object2).a;
        boolean bl3 = ((cl2_2)object4).d();
        if (bl3 && object3 != null) {
            object2 = JsonUtils.toJson(object3);
            object = ((CategoryNavigationRepo)object).appPreferences;
            if (object2 != null) {
                object4 = "luxe_navigation_nodes";
                ((sw_0)object).putPreference((String)object4, (String)object2);
            } else {
                object.getClass();
            }
            object = DataCallback.Companion.onSuccess(object3);
            if (!bl2) {
                zr1_12.i(object);
            }
        } else {
            object3 = "BackGround_LuxAllCategories";
            object = ((CategoryNavigationRepo)object).handleApiError((dl2_2)object2, (String)object3);
            if (!bl2) {
                zr1_12.i(object);
            }
        }
        return object;
    }

    private static final DataCallback getLuxCategoryNavigation$lambda$1(Function1 function1, Object object) {
        return (DataCallback)oj_0.a(function1, "$tmp0", object, "p0", object);
    }

    private static final DataCallback getLuxCategoryNavigation$lambda$2(CategoryNavigationRepo object, boolean bl2, zr1_1 zr1_12, Throwable throwable) {
        Intrinsics.checkNotNullParameter(object, "this$0");
        Intrinsics.checkNotNullParameter(zr1_12, "$luxCategoryObservable");
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        String string2 = "BackGround_LuxAllCategories";
        object = ((CategoryNavigationRepo)object).handleApiException(throwable, string2);
        if (!bl2) {
            zr1_12.i(object);
        }
        return object;
    }

    public static /* synthetic */ g53_0 getStoreInfo$default(CategoryNavigationRepo categoryNavigationRepo, boolean bl2, int n3, Object object) {
        if ((n3 &= 1) != 0) {
            bl2 = false;
        }
        return categoryNavigationRepo.getStoreInfo(bl2);
    }

    private static final DataCallback getStoreInfo$lambda$6(CategoryNavigationRepo object, dl2_2 dl2_22) {
        Intrinsics.checkNotNullParameter(object, "this$0");
        Intrinsics.checkNotNullParameter(dl2_22, "storeInfoResp");
        Object object2 = (StoreMetaData)dl2_22.b;
        cl2_2 cl2_22 = dl2_22.a;
        boolean bl2 = cl2_22.d();
        if (bl2 && object2 != null) {
            lr2_2.Companion.getClass();
            lR2$a.b((StoreMetaData)object2);
            object = ((StoreMetaData)object2).getData();
            if (object != null) {
                hu1_2.a = object = ((StoreMetaData)object2).getData();
            }
            object = DataCallback.Companion.onSuccess(object2);
        } else {
            object2 = "BackGround_StoreMetaData";
            object = ((CategoryNavigationRepo)object).handleApiError(dl2_22, (String)object2);
        }
        return object;
    }

    private static final DataCallback getStoreInfo$lambda$7(Function1 function1, Object object) {
        return (DataCallback)oj_0.a(function1, "$tmp0", object, "p0", object);
    }

    private static final DataCallback getStoreInfo$lambda$8(CategoryNavigationRepo categoryNavigationRepo, Throwable throwable) {
        Intrinsics.checkNotNullParameter(categoryNavigationRepo, "this$0");
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        return categoryNavigationRepo.handleApiException(throwable, "BackGround_StoreMetaData");
    }

    public static /* synthetic */ DataCallback h(CategoryNavigationRepo categoryNavigationRepo, Throwable throwable) {
        return CategoryNavigationRepo.getLuxBrandCategory$lambda$5(categoryNavigationRepo, throwable);
    }

    private final DataCallback handleApiError(dl2_2 dl2_22, String string2) {
        return ApiErrorRepo.handleApiError$default(ApiErrorRepo.INSTANCE, dl2_22, string2, false, null, null, 28, null);
    }

    public static /* synthetic */ DataCallback i(CategoryNavigationRepo categoryNavigationRepo, boolean bl2, zr1_1 zr1_12, dl2_2 dl2_22) {
        return CategoryNavigationRepo.getLuxCategoryNavigation$lambda$0(categoryNavigationRepo, bl2, zr1_12, dl2_22);
    }

    public static /* synthetic */ DataCallback j(CategoryNavigationRepo categoryNavigationRepo, dl2_2 dl2_22) {
        return CategoryNavigationRepo.getStoreInfo$lambda$6(categoryNavigationRepo, dl2_22);
    }

    public static /* synthetic */ DataCallback k(rq_2 rq_22, Object object) {
        return CategoryNavigationRepo.getLuxBrandCategory$lambda$4(rq_22, object);
    }

    public static /* synthetic */ DataCallback l(CategoryNavigationRepo categoryNavigationRepo, boolean bl2, zr1_1 zr1_12, Throwable throwable) {
        return CategoryNavigationRepo.getCMSCategoryNavigation$lambda$11(categoryNavigationRepo, bl2, zr1_12, throwable);
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public final g53_0 getCMSCategoryNavigation(zr1_1 object, boolean bl2, String object2, boolean bl3, boolean bl4) {
        void var8_11;
        Object object3;
        String string2;
        Intrinsics.checkNotNullParameter(object, "cmsCategoryNavigationObservable");
        Object object4 = "store";
        Intrinsics.checkNotNullParameter(object2, (String)object4);
        Object object5 = new JsonObject();
        UrlHelper$Companion urlHelper$Companion = UrlHelper.Companion;
        int n3 = urlHelper$Companion.getISPREVIEW();
        if (n3 != 0) {
            String string3 = ch_2.a();
            if (string3 != null && (n3 = string3.length()) != 0) {
                String string4 = "timeStamp";
                ((JsonObject)object5).addProperty(string4, string3);
            }
            String string5 = CMSConfigInitializer.getPreviewUrlForNav();
        } else {
            UrlHelper urlHelper = urlHelper$Companion.getInstance();
            n3 = 0;
            Object[] objectArray = new Object[]{};
            string2 = "homepage";
            object3 = "cms_nav_menu";
            String string6 = urlHelper.getApiUrl(string2, (String)object3, objectArray);
        }
        void var10_18 = var8_11;
        Object object6 = bl4 ? this.navigationTypeCategory : this.navigationType;
        string2 = this.channel;
        ((JsonObject)object5).addProperty("channel", string2);
        ((JsonObject)object5).addProperty("navigationType", (String)object6);
        String string7 = this.platform;
        ((JsonObject)object5).addProperty("platform", string7);
        ((JsonObject)object5).addProperty((String)object4, (String)object2);
        object4 = this.tenantId;
        ((JsonObject)object5).addProperty("tenantId", (String)object4);
        object6 = CustomerStoreType.a;
        object6 = ScreenType.SCREEN_HOME;
        Object object7 = CustomerStoreType.a((String)object2, (ScreenType)((Object)object6));
        object6 = this.categoryNavigationApi.getCMSCategoryNavigation((String)var10_18, (JsonObject)object5, "application/json", "BackGround_AllCMSCategories", (String)object7);
        object4 = qt2_2.c;
        object6 = ((g53_0)object6).h((Scheduler)object4);
        object4 = ti_2.a();
        object6 = ((g53_0)object6).e((Scheduler)object4);
        object4 = object7;
        Object object8 = object2;
        object5 = this;
        object3 = object;
        object7 = new uq_1(bl3, (String)object2, this, bl2, (zr1_1)object);
        object2 = new vq_1(object7);
        s53_0 s53_02 = new s53_0((q63_0)object6, (bx0_2)object2);
        object2 = new wq_2(this, bl2, (zr1_1)object);
        object = new u53_0(s53_02, (bx0_2)object2);
        Intrinsics.checkNotNullExpressionValue(object, "onErrorReturn(...)");
        return object;
    }

    public final g53_0 getLuxBrandCategory(String object, String object2) {
        Intrinsics.checkNotNullParameter(object, "catalogType");
        Intrinsics.checkNotNullParameter(object2, "brand");
        Object object3 = UrlHelper.Companion.getInstance();
        Object object4 = new Object[]{};
        object3 = ((UrlHelper)object3).getApiUrl("homepage", "brands_cat", object4);
        object4 = StringCompanionObject.INSTANCE;
        int n3 = 2;
        Object[] objectArray = new Object[n3];
        objectArray[0] = object;
        objectArray[1] = object2;
        object = xh2_0.a(objectArray, n3, (String)object3, "format(...)");
        object = this.categoryNavigationApi.getLuxBrandCategory((String)object, "LuxBrandCategory");
        object2 = qt2_2.c;
        object = ((g53_0)object).h((Scheduler)object2);
        object2 = ti_2.a();
        object = ((g53_0)object).e((Scheduler)object2);
        object2 = new rq_2(this, 0);
        object3 = new sq_1(0, (Function1)object2);
        object2 = new s53_0((q63_0)object, (bx0_2)object3);
        object = new tq_1(this);
        object3 = new u53_0((q63_0)object2, (bx0_2)object);
        Intrinsics.checkNotNullExpressionValue(object3, "onErrorReturn(...)");
        return object3;
    }

    public final g53_0 getLuxCategoryNavigation(zr1_1 object, boolean bl2) {
        Intrinsics.checkNotNullParameter(object, "luxCategoryObservable");
        Object object2 = UrlHelper.Companion.getInstance();
        Object object3 = new Object[]{};
        object2 = ((UrlHelper)object2).getApiUrl("homepage", "nav_menu", object3);
        object2 = this.categoryNavigationApi.getCategoryNavigation((String)object2, "BackGround_LuxAllCategories", "luxeappnavbar", "luxeappnavnode");
        object3 = new mq_2(this, bl2, (zr1_1)object);
        pq_1 pq_12 = new pq_1(object3, 0);
        object2.getClass();
        object3 = new s53_0((q63_0)object2, pq_12);
        object2 = new qq_2(this, bl2, (zr1_1)object);
        object = new u53_0((q63_0)object3, (bx0_2)object2);
        Intrinsics.checkNotNullExpressionValue(object, "onErrorReturn(...)");
        return object;
    }

    public final g53_0 getStoreInfo(boolean bl2) {
        lr2_2.Companion.getClass();
        Object object = lR2$a.a(bl2);
        object = this.categoryNavigationApi.getStoreInfo((String)object, "BackGround_StoreMetaData");
        Object object2 = qt2_2.c;
        object = ((g53_0)object).h((Scheduler)object2);
        object2 = ti_2.a();
        object = ((g53_0)object).e((Scheduler)object2);
        object2 = new xq_1(this, 0);
        Object object3 = new nq_1((xq_1)object2);
        object2 = new s53_0((q63_0)object, (bx0_2)object3);
        object = new oq_2(this);
        object3 = new u53_0((q63_0)object2, (bx0_2)object);
        Intrinsics.checkNotNullExpressionValue(object3, "onErrorReturn(...)");
        return object3;
    }

    public final DataCallback handleApiException(Throwable throwable, String string2) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        Intrinsics.checkNotNullParameter(string2, "requestID");
        return ApiErrorRepo.handleApiException$default(ApiErrorRepo.INSTANCE, throwable, string2, false, null, null, 28, null);
    }
}

