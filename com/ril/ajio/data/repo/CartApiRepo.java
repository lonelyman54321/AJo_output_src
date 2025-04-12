/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.text.TextUtils
 */
package com.ril.ajio.data.repo;

import android.content.Context;
import android.text.TextUtils;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import com.ril.ajio.analytics.events.GAEcommerceEvents;
import com.ril.ajio.data.repo.ApiErrorRepo;
import com.ril.ajio.data.repo.BaseRepo;
import com.ril.ajio.data.repo.CartApiRepo$Companion;
import com.ril.ajio.data.repo.CartApiRepo$addToCart$$inlined$map$1;
import com.ril.ajio.data.repo.CartApiRepo$addToCart$1;
import com.ril.ajio.data.repo.CartApiRepo$applyPriorityDeliveryToCart$$inlined$map$1;
import com.ril.ajio.data.repo.CartApiRepo$applyPriorityDeliveryToCart$1;
import com.ril.ajio.data.repo.CartApiRepo$checkForPanVerification$$inlined$map$1;
import com.ril.ajio.data.repo.CartApiRepo$checkForPanVerification$1;
import com.ril.ajio.data.repo.CartApiRepo$deleteProductFromCart$$inlined$map$1;
import com.ril.ajio.data.repo.CartApiRepo$deleteProductFromCart$1;
import com.ril.ajio.data.repo.CartApiRepo$getAddresses$$inlined$map$1;
import com.ril.ajio.data.repo.CartApiRepo$getAddresses$1;
import com.ril.ajio.data.repo.CartApiRepo$getAssuredGift$$inlined$map$1;
import com.ril.ajio.data.repo.CartApiRepo$getAssuredGift$1;
import com.ril.ajio.data.repo.CartApiRepo$getBulkDelete$$inlined$map$1;
import com.ril.ajio.data.repo.CartApiRepo$getBulkDelete$1;
import com.ril.ajio.data.repo.CartApiRepo$getBulkMoveToWishList$$inlined$map$1;
import com.ril.ajio.data.repo.CartApiRepo$getBulkMoveToWishList$1;
import com.ril.ajio.data.repo.CartApiRepo$getBulkMoveToWishListV2$$inlined$map$1;
import com.ril.ajio.data.repo.CartApiRepo$getBulkMoveToWishListV2$1;
import com.ril.ajio.data.repo.CartApiRepo$getCartAndCheckStockData$$inlined$map$1;
import com.ril.ajio.data.repo.CartApiRepo$getCartData$2;
import com.ril.ajio.data.repo.CartApiRepo$getCartIdDetails$1;
import com.ril.ajio.data.repo.CartApiRepo$getInternalWalletOnCart$$inlined$map$1;
import com.ril.ajio.data.repo.CartApiRepo$getInternalWalletOnCart$1;
import com.ril.ajio.data.repo.CartApiRepo$getInventoryData$1;
import com.ril.ajio.data.repo.CartApiRepo$getInventoryData$2;
import com.ril.ajio.data.repo.CartApiRepo$getNewCartId$$inlined$map$1;
import com.ril.ajio.data.repo.CartApiRepo$getNewGuId$$inlined$map$1;
import com.ril.ajio.data.repo.CartApiRepo$getProductSize$$inlined$map$1;
import com.ril.ajio.data.repo.CartApiRepo$getProductSize$1;
import com.ril.ajio.data.repo.CartApiRepo$getQuickView$$inlined$map$1;
import com.ril.ajio.data.repo.CartApiRepo$getQuickView$1;
import com.ril.ajio.data.repo.CartApiRepo$loadEddOOSSimilarCart$$inlined$map$1;
import com.ril.ajio.data.repo.CartApiRepo$loadEddOOSSimilarCart$$inlined$map$2;
import com.ril.ajio.data.repo.CartApiRepo$loadEddOOSSimilarCart$1;
import com.ril.ajio.data.repo.CartApiRepo$loadOOSSimilarCart$$inlined$map$1;
import com.ril.ajio.data.repo.CartApiRepo$loadOOSSimilarCart$$inlined$map$2;
import com.ril.ajio.data.repo.CartApiRepo$loadOOSSimilarCart$1;
import com.ril.ajio.data.repo.CartApiRepo$mergeCarts$$inlined$map$1;
import com.ril.ajio.data.repo.CartApiRepo$mergeCarts$1;
import com.ril.ajio.data.repo.CartApiRepo$moveToCloset$$inlined$map$1;
import com.ril.ajio.data.repo.CartApiRepo$moveToCloset$1;
import com.ril.ajio.data.repo.CartApiRepo$updateAddressToCart$$inlined$map$1;
import com.ril.ajio.data.repo.CartApiRepo$updateAddressToCart$1;
import com.ril.ajio.data.repo.CartApiRepo$updateItemCountForProduct$$inlined$map$1;
import com.ril.ajio.data.repo.CartApiRepo$updateItemCountForProduct$1;
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.data.repo.DataCallback$Companion;
import com.ril.ajio.login.CustomerStoreType;
import com.ril.ajio.services.data.Cart.BulkMoveToWishlist;
import com.ril.ajio.services.data.Cart.Cart;
import com.ril.ajio.services.data.Cart.CartEntry;
import com.ril.ajio.services.data.Cart.CartInventory;
import com.ril.ajio.services.data.Cart.PanCardVerificationRequest;
import com.ril.ajio.services.data.Cart.ProductSimilar;
import com.ril.ajio.services.data.Cart.SPCartProductInfo;
import com.ril.ajio.services.data.Cart.pickfromstore.ProductDetail;
import com.ril.ajio.services.data.Cart.pickfromstore.Status;
import com.ril.ajio.services.data.Closet.SaveForLaterResponse;
import com.ril.ajio.services.data.Product.Product;
import com.ril.ajio.services.data.Product.ProductFnlColorVariantData;
import com.ril.ajio.services.data.Product.ProductOptionVariant;
import com.ril.ajio.services.data.Product.SimilarProductOOS;
import com.ril.ajio.services.data.Product.SimilarProductOOSInfo;
import com.ril.ajio.services.data.user.ScreenType;
import com.ril.ajio.services.data.user.UserInformation;
import com.ril.ajio.services.helper.UrlHelper;
import com.ril.ajio.services.helper.UrlHelper$Companion;
import com.ril.ajio.services.network.api.CartApi;
import com.ril.ajio.services.network.api.CartApi$DefaultImpls;
import com.ril.ajio.services.network.connector.AjioApiConnector;
import com.ril.ajio.services.query.QueryCart;
import com.ril.ajio.services.query.QueryProductDetails;
import com.ril.ajio.services.query.QuerySingleData;
import com.ril.ajio.services.utils.ServiceUtil;
import io.reactivex.Scheduler;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.text.StringsKt;

public final class CartApiRepo
implements BaseRepo {
    public static final int $stable = 0;
    public static final CartApiRepo$Companion Companion;
    private static final String FIELD_BASIC = "BASIC";
    private static final String FIELD_FULL = "FULL";
    private static final String PANCARD_DOB = "dateOfBirth";
    private static final String PANCARD_NAME = "name";
    private static final String PANCARD_TAXPAYER_ID = "taxPayerId";
    private static final String PANCARD_TERMS = "acceptedTnC";
    private static final String authorizedQueryParams;
    private static final String clientType;
    private static final String clientVersion;
    private final jo_2 appPreferences;
    private final CartApi cartDataApi;
    private final UserInformation userInformation;

    static {
        Object object = new CartApiRepo$Companion(null);
        Companion = object;
        $stable = 8;
        clientType = "Android";
        clientVersion = object = em_1.a(AJIOApplication.Companion);
        authorizedQueryParams = "client_type=Android&client_version=".concat((String)object);
    }

    public CartApiRepo(Context object) {
        Intrinsics.checkNotNullParameter(object, "context");
        Object object2 = UserInformation.getInstance(object);
        this.userInformation = object2;
        this.appPreferences = object2 = new jo_2((Context)object);
        object = AjioApiConnector.INSTANCE.getCartDataApi();
        this.cartDataApi = object;
    }

    public static /* synthetic */ DataCallback a(Ref$ObjectRef ref$ObjectRef, String string2, Ref$ObjectRef ref$ObjectRef2, Throwable throwable) {
        return CartApiRepo.moveToClosetAndDelete$lambda$19(ref$ObjectRef, string2, ref$ObjectRef2, throwable);
    }

    public static final /* synthetic */ Object access$callInventoryApi(CartApiRepo cartApiRepo, f80_0 f80_02) {
        return cartApiRepo.callInventoryApi(f80_02);
    }

    public static final /* synthetic */ jo_2 access$getAppPreferences$p(CartApiRepo cartApiRepo) {
        return cartApiRepo.appPreferences;
    }

    public static final /* synthetic */ CartApi access$getCartDataApi$p(CartApiRepo cartApiRepo) {
        return cartApiRepo.cartDataApi;
    }

    public static final /* synthetic */ String access$getClientType$cp() {
        return clientType;
    }

    public static final /* synthetic */ String access$getClientVersion$cp() {
        return clientVersion;
    }

    public static final /* synthetic */ Object access$getMergeCartInventory(CartApiRepo cartApiRepo, Cart cart, String string2, f80_0 f80_02) {
        return cartApiRepo.getMergeCartInventory(cart, string2, f80_02);
    }

    public static final /* synthetic */ ArrayList access$getSimilarCartReqInfo(CartApiRepo cartApiRepo, ArrayList arrayList) {
        return cartApiRepo.getSimilarCartReqInfo(arrayList);
    }

    public static final /* synthetic */ ArrayList access$getSimilarEddCartReqInfo(CartApiRepo cartApiRepo, ArrayList arrayList, String string2) {
        return cartApiRepo.getSimilarEddCartReqInfo(arrayList, string2);
    }

    public static final /* synthetic */ Object access$getSimilarProducts(CartApiRepo cartApiRepo, ArrayList arrayList, f80_0 f80_02) {
        return cartApiRepo.getSimilarProducts(arrayList, f80_02);
    }

    public static final /* synthetic */ UserInformation access$getUserInformation$p(CartApiRepo cartApiRepo) {
        return cartApiRepo.userInformation;
    }

    public static final /* synthetic */ boolean access$populateOOSWithSimilar(CartApiRepo cartApiRepo, SimilarProductOOSInfo similarProductOOSInfo, ArrayList arrayList) {
        return cartApiRepo.populateOOSWithSimilar(similarProductOOSInfo, arrayList);
    }

    public static /* synthetic */ es0_2 addToCart$default(CartApiRepo cartApiRepo, QueryCart queryCart, String string2, String string3, int n3, Object object) {
        if ((n3 &= 2) != 0) {
            string2 = "ajio";
        }
        return cartApiRepo.addToCart(queryCart, string2, string3);
    }

    public static /* synthetic */ DataCallback b(Ref$ObjectRef ref$ObjectRef, String string2, Ref$ObjectRef ref$ObjectRef2, dl2_2 dl2_22, dl2_2 dl2_23) {
        return CartApiRepo.moveToClosetAndDelete$lambda$17(ref$ObjectRef, string2, ref$ObjectRef2, dl2_22, dl2_23);
    }

    public static /* synthetic */ DataCallback c(am_2 am_22, Object object, Object object2) {
        return CartApiRepo.moveToClosetAndDelete$lambda$18(am_22, object, object2);
    }

    private final Object callInventoryApi(f80_0 f80_02) {
        String string2 = this.userInformation.getUserId();
        Object object = ap_0.a;
        object = ap_0.a(this.userInformation.isUserOnline());
        Object object2 = UrlHelper.Companion.getInstance();
        Object[] objectArray = new Object[]{string2, object};
        string2 = ((UrlHelper)object2).getApiUrl("cart", "cart_inventory_check", objectArray);
        object = authorizedQueryParams;
        string2 = n1.a(string2, "?", (String)object);
        object = this.cartDataApi;
        object2 = this.userInformation;
        Intrinsics.checkNotNullExpressionValue(object2, "userInformation");
        object2 = ServiceUtil.getToken((UserInformation)object2);
        object2 = kp1_0.c("Bearer ", (String)object2);
        return object.checkCartInventory(string2, (String)object2, "cartInventoryCheck", f80_02);
    }

    private final es0_2 getCartData(boolean bl2, boolean bl3, boolean bl4, boolean bl5, boolean bl6, boolean bl7) {
        Object object;
        String string2 = this.userInformation.getUserId();
        Object object2 = ap_0.a;
        boolean bl8 = this.userInformation.isUserOnline();
        object2 = ap_0.a(bl8);
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        Object object3 = UrlHelper.Companion.getInstance();
        Comparable<Boolean> comparable = bl2;
        Boolean bl9 = bl3;
        Boolean bl10 = bl4;
        int n3 = 5;
        Object[] objectArray = new Object[n3];
        objectArray[0] = string2;
        objectArray[1] = object2;
        objectArray[2] = comparable;
        objectArray[3] = bl9;
        int n4 = 4;
        objectArray[n4] = bl10;
        string2 = ((UrlHelper)object3).getApiUrl("cart", "cart_list", objectArray);
        ref$ObjectRef.element = string2;
        object2 = authorizedQueryParams;
        object3 = h40_0.a;
        boolean bl11 = h40_0.O1();
        comparable = new Comparable<Boolean>();
        ((StringBuilder)comparable).append((Object)string2);
        ((StringBuilder)comparable).append("?fields=FULL&");
        ((StringBuilder)comparable).append((String)object2);
        ((StringBuilder)comparable).append("&enableNewVersion=");
        ((StringBuilder)comparable).append(bl2);
        string2 = "&codFeeApplicable=";
        dm_1.b("&rvpFeeApplicable=", string2, comparable, bl3, bl4);
        dm_1.b("&internalwallet=", "&employeeOfferRestriction=", comparable, bl5, bl6);
        ((StringBuilder)comparable).append("&priorityDeliveryEnable=");
        ((StringBuilder)comparable).append(bl11);
        ref$ObjectRef.element = object = ((StringBuilder)comparable).toString();
        hv3_0.a.getClass();
        object = z40_0.Companion;
        object = Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)object).a;
        Object object4 = "new_user_journey_cart";
        bl2 = ((ao0_0)object).a((String)object4);
        if (bl2 && (object = this.appPreferences.f()) != null && (bl2 = ((String)object).length())) {
            object = ref$ObjectRef.element;
            object4 = this.appPreferences.f();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(object);
            stringBuilder.append("&userType=");
            stringBuilder.append((String)object4);
            ref$ObjectRef.element = object = stringBuilder.toString();
        }
        if (bl7) {
            object = ref$ObjectRef.element;
            object4 = new StringBuilder();
            ((StringBuilder)object4).append(object);
            ((StringBuilder)object4).append("&enableReturnProcessingFee=");
            ((StringBuilder)object4).append(bl7);
            ref$ObjectRef.element = object = ((StringBuilder)object4).toString();
        }
        object = ww0_2.a;
        ref$ObjectRef.element = object = ww0_2.d((String)ref$ObjectRef.element);
        object = new Ref$ObjectRef();
        ((Ref$ObjectRef)object).element = "";
        object4 = this.appPreferences.a();
        if (object4 != null) {
            ((Ref$ObjectRef)object).element = object4;
        }
        object4 = new CartApiRepo$getCartData$2(this, ref$ObjectRef, (Ref$ObjectRef)object, null);
        object = new br2_2((Function2)object4);
        return object;
    }

    private final es0_2 getCartIdDetails() {
        Object object = new Ref$ObjectRef();
        Object object2 = UrlHelper.Companion.getInstance();
        String string2 = this.userInformation.getUserId();
        Object[] objectArray = new Object[]{string2};
        ((Ref$ObjectRef)object).element = object2 = ((UrlHelper)object2).getApiUrl("cart", "new_cart_id", objectArray);
        string2 = authorizedQueryParams;
        ((Ref$ObjectRef)object).element = object2 = nb0_0.a((String)object2, "?", string2);
        ((Ref$ObjectRef)object).element = object2 = ww0_2.d((String)object2);
        object2 = new CartApiRepo$getCartIdDetails$1(this, (Ref$ObjectRef)object, null);
        object = new br2_2((Function2)object2);
        object2 = ir0_2.a;
        object2 = em0_2.b;
        return ms0_1.m((es0_2)object, (CoroutineContext)object2);
    }

    private final Object getMergeCartInventory(Cart cart, String object, f80_0 object2) {
        int n3;
        object = cart.getEntries();
        if (object != null && (n3 = ((ArrayList)(object = cart.getEntries())).size()) > 0) {
            boolean bl2;
            object = cart.getEntries().iterator();
            object2 = "iterator(...)";
            Intrinsics.checkNotNullExpressionValue(object, (String)object2);
            while (bl2 = object.hasNext()) {
                object2 = ((CartEntry)object.next()).getProduct();
                Y63.g((Product)object2);
            }
        }
        return DataCallback.Companion.onSuccess(cart);
    }

    private final ArrayList getSimilarCartReqInfo(ArrayList object) {
        boolean bl2;
        ArrayList<Object> arrayList = new ArrayList<Object>();
        object = object.iterator();
        while (bl2 = object.hasNext()) {
            int n3;
            Object object2 = (CartEntry)object.next();
            Object object3 = ka2_2.a((CartEntry)object2);
            int n4 = ((ja2_2)object3).b;
            if (n4 != 0) continue;
            n4 = hv3_0.Y();
            object3 = n4 != 0 ? ((object3 = ((CartEntry)object2).getProduct().getSelectedSizeVariant()) != null ? Y63.c((ProductOptionVariant)object3) : null) : ((ja2_2)object3).c;
            Object object4 = ((CartEntry)object2).getProduct().getCatalogName();
            if (object4 == null) {
                object4 = ((CartEntry)object2).getProduct().getCatalog();
            }
            String string2 = od3_2.a();
            if (object4 != null && (n3 = object4.length()) != 0) {
                string2 = GAEcommerceEvents.INSTANCE.getStoreTypeFromCatalog((String)object4);
            }
            if ((n4 = Intrinsics.areEqual(string2, object4 = ld3_2.STORE_AJIO.getStoreId())) != 0) {
                string2 = "rilfnl";
            }
            if (object3 == null || (n4 = object3.length()) == 0) continue;
            object2 = ((CartEntry)object2).getProduct().getBaseProduct();
            object4 = new SPCartProductInfo((String)object2, (String)object3, string2);
            arrayList.add(object4);
        }
        return arrayList;
    }

    private final ArrayList getSimilarEddCartReqInfo(ArrayList object, String string2) {
        boolean bl2;
        ArrayList<Object> arrayList = new ArrayList<Object>();
        object = object.iterator();
        while (bl2 = object.hasNext()) {
            int n3;
            Object object2 = (CartEntry)object.next();
            Object object3 = ((CartEntry)object2).getProduct().getBaseProduct();
            boolean bl3 = Intrinsics.areEqual(string2, object3);
            if (!bl3) continue;
            object3 = ka2_2.a((CartEntry)object2);
            int n4 = ((ja2_2)object3).b;
            if (n4 != 0) continue;
            n4 = hv3_0.Y();
            if (n4 != 0) {
                object3 = ((CartEntry)object2).getProduct().getSelectedSizeVariant();
                if (object3 != null) {
                    object3 = Y63.c((ProductOptionVariant)object3);
                } else {
                    bl3 = false;
                    object3 = null;
                }
            } else {
                object3 = ((ja2_2)object3).c;
            }
            Object object4 = ((CartEntry)object2).getProduct().getCatalogName();
            if (object4 == null) {
                object4 = ((CartEntry)object2).getProduct().getCatalog();
            }
            String string3 = od3_2.a();
            if (object4 != null && (n3 = object4.length()) != 0) {
                string3 = GAEcommerceEvents.INSTANCE.getStoreTypeFromCatalog((String)object4);
            }
            if ((n4 = Intrinsics.areEqual(string3, object4 = ld3_2.STORE_AJIO.getStoreId())) != 0) {
                string3 = "rilfnl";
            }
            if (object3 == null || (n4 = object3.length()) == 0) continue;
            object2 = ((CartEntry)object2).getProduct().getBaseProduct();
            object4 = new SPCartProductInfo((String)object2, (String)object3, string3);
            arrayList.add(object4);
        }
        return arrayList;
    }

    private final Object getSimilarProducts(ArrayList arrayList, f80_0 f80_02) {
        int n3;
        Object object = UrlHelper.Companion.getInstance();
        Object object2 = null;
        Object object3 = new Object[]{};
        String string2 = "pdp";
        String string3 = "similar_list_2";
        String string4 = ((UrlHelper)object).getApiUrl(string2, string3, object3);
        HashMap<Object, Object> hashMap = new HashMap<Object, Object>();
        object = z40_0.Companion;
        object = Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)object).a;
        object3 = "similar_product_variant";
        int n4 = TextUtils.isEmpty((CharSequence)(object = ((ao0_0)object).b((String)object3)));
        if (n4 == 0) {
            int n7;
            object3 = new String[]{"="};
            object = StringsKt.a0((CharSequence)object, (String[])object3, false, 0, 6);
            object3 = new String[0];
            n4 = ((String[])(object = (String[])object.toArray((T[])object3))).length;
            if (n4 > (n7 = 1)) {
                object2 = object[0];
                object = object[n7];
                hashMap.put(object2, object);
            }
        }
        if ((object = this.userInformation.getUserSegementIds()) != null && (n3 = ((String)object).length()) != 0) {
            object = this.userInformation.getUserSegementIds();
            object2 = "segmentIds";
            hashMap.put(object2, object);
        }
        object = CustomerStoreType.a;
        object = "rilfnl_v1";
        object2 = ScreenType.SCREEN_PDP;
        String string5 = CustomerStoreType.a((String)object, object2);
        n3 = (int)(mz3_0.y(string5) ? 1 : 0);
        if (n3 != 0 && (n3 = (int)(ww0_2.c() ? 1 : 0)) != 0 && (n3 = string5.length()) != 0) {
            object = "userClusterId";
            hashMap.put(object, string5);
        }
        if ((n3 = (int)(h40_0.Q1() ? 1 : 0)) != 0 && (object = this.appPreferences.m()) != null && (n3 = ((String)object).length()) != 0) {
            object = String.valueOf(this.appPreferences.m());
            object2 = "pincode";
            hashMap.put(object2, object);
        }
        TU2.a(hashMap);
        HashMap<String, ArrayList> hashMap2 = new HashMap<String, ArrayList>();
        hashMap2.put("products", arrayList);
        return this.cartDataApi.getSimilarProductsCart(string4, hashMap, hashMap2, "SimilarProductList_2", string5, f80_02);
    }

    public static /* synthetic */ es0_2 moveToCloset$default(CartApiRepo cartApiRepo, QueryCart queryCart, String string2, String string3, int n3, Object object) {
        if ((n3 &= 2) != 0) {
            string2 = "ajio";
        }
        return cartApiRepo.moveToCloset(queryCart, string2, string3);
    }

    public static /* synthetic */ g53_0 moveToClosetAndDelete$default(CartApiRepo cartApiRepo, QueryCart queryCart, QuerySingleData querySingleData, String string2, String string3, int n3, Object object) {
        if ((n3 &= 4) != 0) {
            string2 = "ajio";
        }
        return cartApiRepo.moveToClosetAndDelete(queryCart, querySingleData, string2, string3);
    }

    private static final DataCallback moveToClosetAndDelete$lambda$17(Ref$ObjectRef object, String object2, Ref$ObjectRef object3, dl2_2 object4, dl2_2 dl2_22) {
        String string2;
        String string3;
        boolean bl2;
        Intrinsics.checkNotNullParameter(object, "$saveForLaterResponse");
        Intrinsics.checkNotNullParameter(object2, "$screenName");
        Intrinsics.checkNotNullParameter(object3, "$deleteFromCartResponse");
        Intrinsics.checkNotNullParameter(object4, "addToClosetResponse");
        Intrinsics.checkNotNullParameter(dl2_22, "deleteResponse");
        Object object5 = (SaveForLaterResponse)((dl2_2)object4).b;
        Object object6 = ((dl2_2)object4).a;
        boolean bl3 = ((cl2_2)object6).d();
        if (bl3 && object5 != null) {
            object4 = DataCallback.Companion.onSuccess(object5);
        } else {
            object5 = ApiErrorRepo.INSTANCE;
            bl2 = true;
            string3 = "Forward";
            string2 = "AddtoCloset";
            object6 = object4;
            object4 = ((ApiErrorRepo)object5).handleApiError((dl2_2)object4, string2, bl2, (String)object2, string3);
        }
        ((Ref$ObjectRef)object).element = object4;
        object4 = (il2_2)dl2_22.b;
        object5 = dl2_22.a;
        boolean bl4 = ((cl2_2)object5).d();
        if (bl4 && object4 != null) {
            object2 = DataCallback.Companion.onSuccess(object4);
        } else {
            object5 = ApiErrorRepo.INSTANCE;
            bl2 = true;
            string3 = "Forward";
            string2 = "AddtoCloset";
            object6 = dl2_22;
            object2 = ((ApiErrorRepo)object5).handleApiError(dl2_22, string2, bl2, (String)object2, string3);
        }
        ((Ref$ObjectRef)object3).element = object2;
        object3 = DataCallback.Companion;
        object = (DataCallback)((Ref$ObjectRef)object).element;
        object4 = new wq1_1((DataCallback)object, (DataCallback)object2);
        return ((DataCallback$Companion)object3).onSuccess(object4);
    }

    private static final DataCallback moveToClosetAndDelete$lambda$18(Function2 function2, Object object, Object object2) {
        Intrinsics.checkNotNullParameter(function2, "$tmp0");
        Intrinsics.checkNotNullParameter(object, "p0");
        Intrinsics.checkNotNullParameter(object2, "p1");
        return (DataCallback)function2.invoke(object, object2);
    }

    private static final DataCallback moveToClosetAndDelete$lambda$19(Ref$ObjectRef object, String object2, Ref$ObjectRef object3, Throwable object4) {
        Intrinsics.checkNotNullParameter(object, "$saveForLaterResponse");
        Intrinsics.checkNotNullParameter(object2, "$screenName");
        Intrinsics.checkNotNullParameter(object3, "$deleteFromCartResponse");
        Intrinsics.checkNotNullParameter(object4, "throwable");
        ApiErrorRepo apiErrorRepo = ApiErrorRepo.INSTANCE;
        boolean bl2 = true;
        Object object5 = apiErrorRepo;
        ((Ref$ObjectRef)object).element = object5 = apiErrorRepo.handleApiException((Throwable)object4, "AddtoCloset", bl2, (String)object2, "Forward");
        object5 = apiErrorRepo;
        ((Ref$ObjectRef)object3).element = object2 = apiErrorRepo.handleApiException((Throwable)object4, "AddtoCloset", bl2, (String)object2, "Forward");
        object3 = DataCallback.Companion;
        object = (DataCallback)((Ref$ObjectRef)object).element;
        object4 = new wq1_1((DataCallback)object, (DataCallback)object2);
        return ((DataCallback$Companion)object3).onSuccess(object4);
    }

    private final boolean populateOOSWithSimilar(SimilarProductOOSInfo iterator, ArrayList arrayList) {
        Object object;
        Object object2;
        int n3;
        HashMap hashMap = new HashMap();
        if ((iterator = ((SimilarProductOOSInfo)((Object)iterator)).getSimilarProducts()) != null) {
            iterator = ((Iterable)((Object)iterator)).iterator();
            while ((n3 = iterator.hasNext()) != 0) {
                boolean bl2;
                Object object3;
                object2 = (SimilarProductOOS)iterator.next();
                if (object2 == null || (object = ((SimilarProductOOS)object2).getColorGroup()) == null) continue;
                boolean bl3 = hashMap.containsKey(object);
                if (!bl3) {
                    object3 = new ArrayList();
                    hashMap.put(object, object3);
                }
                object = (ArrayList)hashMap.get(object);
                object3 = ((SimilarProductOOS)object2).getProducts();
                if (object3 == null) continue;
                object3 = ((Iterable)object3).iterator();
                while (bl2 = object3.hasNext()) {
                    Object object4 = (Product)object3.next();
                    if (object4 == null || object == null) continue;
                    hv3_0.a.getClass();
                    String string2 = hv3_0.k((Product)object4);
                    object4 = ((Product)object4).getFnlColorVariantData();
                    if (object4 != null) {
                        object4 = ((ProductFnlColorVariantData)object4).getColorGroup();
                    } else {
                        bl2 = false;
                        object4 = null;
                    }
                    String string3 = ((SimilarProductOOS)object2).getSize();
                    ProductSimilar productSimilar = new ProductSimilar(string2, (String)object4, string3);
                    ((ArrayList)object).add(productSimilar);
                }
            }
        }
        iterator = arrayList.iterator();
        boolean bl4 = false;
        arrayList = null;
        while ((n3 = iterator.hasNext()) != 0) {
            object2 = (CartEntry)iterator.next();
            object = ((CartEntry)object2).getProduct().getBaseProduct();
            boolean bl5 = hashMap.containsKey(object);
            if (!bl5) continue;
            object = ((CartEntry)object2).getProduct().getBaseProduct();
            object = (List)hashMap.get(object);
            ((CartEntry)object2).setProductSimilarList((List)object);
            n3 = (object2 = ((CartEntry)object2).getProductSimilarList()).size();
            if (n3 <= 0) continue;
            bl4 = true;
        }
        return bl4;
    }

    public static /* synthetic */ Object suspendAddToCart$default(CartApiRepo cartApiRepo, QueryCart queryCart, String string2, f80_0 f80_02, int n3, Object object) {
        if ((n3 &= 2) != 0) {
            string2 = "ajio";
        }
        return cartApiRepo.suspendAddToCart(queryCart, string2, f80_02);
    }

    public final es0_2 addToCart(QueryCart object, String object2, String string2) {
        Intrinsics.checkNotNullParameter(object, "queryCart");
        Intrinsics.checkNotNullParameter(object2, "sourceStoreId");
        Intrinsics.checkNotNullParameter(string2, "screenName");
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        Object object3 = UrlHelper.Companion.getInstance();
        Object object4 = this.userInformation.getUserId();
        Object object5 = ap_0.a;
        object5 = ap_0.a(this.userInformation.isUserOnline());
        Object object6 = new Object[2];
        object6[0] = object4;
        int n3 = 1;
        object6[n3] = object5;
        ref$ObjectRef.element = object3 = ((UrlHelper)object3).getApiUrl("cart", "add_to_cart", object6);
        object5 = authorizedQueryParams;
        ref$ObjectRef.element = object3 = nb0_0.a((String)object3, "?", (String)object5);
        ref$ObjectRef.element = object3 = ww0_2.d((String)object3);
        kx3_0.a = n3;
        kx3_0.b = null;
        object4 = object3;
        object5 = object;
        object6 = this;
        object3 = new CartApiRepo$addToCart$1((QueryCart)object, this, ref$ObjectRef, (String)object2, null);
        object = new br2_2((Function2)object3);
        object2 = ir0_2.a;
        object2 = em0_2.b;
        object = ms0_1.m((es0_2)object, (CoroutineContext)object2);
        object2 = new CartApiRepo$addToCart$$inlined$map$1((es0_2)object, string2);
        object = ir0_2.a;
        return ms0_1.m((es0_2)object2, (CoroutineContext)object);
    }

    public final es0_2 applyPriorityDeliveryToCart(JsonObject object, String object2) {
        Intrinsics.checkNotNullParameter(object, "jsonObject");
        Object object3 = this.userInformation;
        boolean n3 = ((UserInformation)object3).isUserOnline();
        if (!n3) {
            object2 = String.valueOf(ap_0.a.getGuId());
        }
        object3 = this.userInformation;
        boolean bl2 = ((UserInformation)object3).isUserOnline();
        object3 = bl2 ? this.userInformation.getCustomerUUID() : this.userInformation.getUserId();
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        Object object4 = UrlHelper.Companion.getInstance();
        int n4 = 2;
        Object[] objectArray = new Object[n4];
        objectArray[0] = object3;
        int n7 = 1;
        objectArray[n7] = object2;
        ref$ObjectRef.element = object2 = ((UrlHelper)object4).getApiUrl("cart", "apply_priority_delivery", objectArray);
        object3 = authorizedQueryParams;
        object4 = "?";
        ref$ObjectRef.element = object2 = nb0_0.a((String)object2, (String)object4, (String)object3);
        object2 = this.userInformation;
        boolean bl3 = ((UserInformation)object2).isUserOnline();
        if (!bl3) {
            object2 = ref$ObjectRef.element;
            object3 = ap_0.a.getGuId();
            object4 = new StringBuilder();
            ((StringBuilder)object4).append(object2);
            ((StringBuilder)object4).append("&guid=");
            ((StringBuilder)object4).append((String)object3);
            ref$ObjectRef.element = object2 = ((StringBuilder)object4).toString();
        }
        object2 = new CartApiRepo$applyPriorityDeliveryToCart$1(this, ref$ObjectRef, (JsonObject)object, null);
        object = new br2_2((Function2)object2);
        object2 = ir0_2.a;
        object2 = em0_2.b;
        object = ms0_1.m((es0_2)object, (CoroutineContext)object2);
        object2 = new CartApiRepo$applyPriorityDeliveryToCart$$inlined$map$1((es0_2)object);
        object = ir0_2.a;
        return ms0_1.m((es0_2)object2, (CoroutineContext)object);
    }

    public final CartInventory bindCartInventoryData(Cart serializable) {
        boolean bl2;
        Intrinsics.checkNotNullParameter(serializable, "cart");
        ArrayList<ProductDetail> arrayList = new ArrayList<ProductDetail>();
        Object object = serializable.getEntries().iterator();
        Object object2 = "iterator(...)";
        Intrinsics.checkNotNullExpressionValue(object, (String)object2);
        while (bl2 = object.hasNext()) {
            object2 = (CartEntry)object.next();
            ProductDetail productDetail = new ProductDetail();
            Product product = ((CartEntry)object2).getProduct();
            if (product != null) {
                int n3 = product.getAvailableQuantity();
                productDetail.setAvailableQuantity(n3);
            }
            if ((object2 = ((CartEntry)object2).getProduct()) != null) {
                object2 = ((Product)object2).getCode();
            } else {
                bl2 = false;
                object2 = null;
            }
            productDetail.setProductCode((String)object2);
            arrayList.add(productDetail);
        }
        serializable = serializable.getStockStatus();
        object = new CartInventory(arrayList, (Status)serializable);
        return object;
    }

    public final es0_2 checkForPanVerification(PanCardVerificationRequest object) {
        Intrinsics.checkNotNullParameter(object, "panCardVerificationRequest");
        Object object2 = UrlHelper.Companion.getInstance();
        Object object3 = new Object[]{};
        object2 = ((UrlHelper)object2).getApiUrl("my_account", "pancard_verification", (Object[])object3);
        object3 = new HashMap();
        String string2 = ((PanCardVerificationRequest)object).getName();
        ((HashMap)object3).put(PANCARD_NAME, string2);
        String string3 = ((PanCardVerificationRequest)object).getDateOfBirth();
        ((HashMap)object3).put(PANCARD_DOB, string3);
        string3 = ((PanCardVerificationRequest)object).getTaxPayerId();
        ((HashMap)object3).put(PANCARD_TAXPAYER_ID, string3);
        object = ((PanCardVerificationRequest)object).getAcceptedTnC();
        ((HashMap)object3).put(PANCARD_TERMS, object);
        object = new CartApiRepo$checkForPanVerification$1(this, (String)object2, (HashMap)object3, null);
        object2 = new br2_2((Function2)object);
        object = ir0_2.a;
        object = em0_2.b;
        object = ms0_1.m((es0_2)object2, (CoroutineContext)object);
        object2 = new CartApiRepo$checkForPanVerification$$inlined$map$1((es0_2)object);
        object = ir0_2.a;
        return ms0_1.m((es0_2)object2, (CoroutineContext)object);
    }

    public final es0_2 deleteProductFromCart(QuerySingleData object, String string2) {
        int n3;
        int n4;
        boolean bl2;
        boolean bl3;
        Intrinsics.checkNotNullParameter(object, "querySingleData");
        Intrinsics.checkNotNullParameter(string2, "screenName");
        Object object2 = this.userInformation.getUserId();
        Object object3 = ap_0.a;
        boolean bl4 = this.userInformation.isUserOnline();
        object3 = ap_0.a(bl4);
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        Object object4 = UrlHelper.Companion.getInstance();
        object = ((QuerySingleData)object).getData();
        int n7 = 3;
        Object object5 = new Object[n7];
        object5[0] = object2;
        object5[1] = object3;
        int n8 = 2;
        object5[n8] = object;
        String string3 = "delete_entries";
        ref$ObjectRef.element = object = ((UrlHelper)object4).getApiUrl("cart", string3, (Object[])object5);
        object4 = authorizedQueryParams;
        object5 = "?";
        ref$ObjectRef.element = object = nb0_0.a((String)object, (String)object5, (String)object4);
        ref$ObjectRef.element = object = ww0_2.d((String)object);
        object = "ApplicationError: okHttp user id null:isUserOnline";
        if (object2 == null || !(bl3 = ((String)object2).length())) {
            object4 = ApiErrorRepo.INSTANCE;
            object2 = this.userInformation;
            bl3 = ((UserInformation)object2).isUserOnline();
            object5 = new StringBuilder((String)object);
            ((StringBuilder)object5).append(bl3);
            string3 = ((StringBuilder)object5).toString();
            bl2 = true;
            object5 = "RemoveCartEntry";
            n4 = 200;
            n3 = 72;
            ApiErrorRepo.logServiceErrorEvent$default((ApiErrorRepo)object4, (String)object5, string3, n4, null, bl2, string2, null, n3, null);
        }
        if (object3 == null || !(bl3 = ((String)object3).length())) {
            object4 = ApiErrorRepo.INSTANCE;
            object2 = this.userInformation;
            bl3 = ((UserInformation)object2).isUserOnline();
            object3 = new StringBuilder((String)object);
            ((StringBuilder)object3).append(bl3);
            string3 = ((StringBuilder)object3).toString();
            bl2 = true;
            object5 = "RemoveCartEntry";
            n4 = 200;
            n3 = 72;
            ApiErrorRepo.logServiceErrorEvent$default((ApiErrorRepo)object4, (String)object5, string3, n4, null, bl2, string2, null, n3, null);
        }
        object = new CartApiRepo$deleteProductFromCart$1(this, ref$ObjectRef, null);
        object2 = new br2_2((Function2)object);
        object = ir0_2.a;
        object = em0_2.b;
        object = ms0_1.m((es0_2)object2, (CoroutineContext)object);
        object2 = new CartApiRepo$deleteProductFromCart$$inlined$map$1((es0_2)object, string2);
        object = ir0_2.a;
        return ms0_1.m((es0_2)object2, (CoroutineContext)object);
    }

    public final es0_2 getAddresses(String object) {
        Intrinsics.checkNotNullParameter(object, "screenName");
        Object object2 = new Ref$ObjectRef();
        Object object3 = UrlHelper.Companion.getInstance();
        String string2 = this.userInformation.getUserId();
        Object[] objectArray = new Object[]{string2};
        ((Ref$ObjectRef)object2).element = object3 = ((UrlHelper)object3).getApiUrl("address", "address_list", objectArray);
        string2 = authorizedQueryParams;
        ((Ref$ObjectRef)object2).element = object3 = nb0_0.a((String)object3, "&", string2);
        object3 = new CartApiRepo$getAddresses$1(this, (Ref$ObjectRef)object2, null);
        object2 = new br2_2((Function2)object3);
        object3 = ir0_2.a;
        object3 = em0_2.b;
        object2 = ms0_1.m((es0_2)object2, (CoroutineContext)object3);
        object3 = new CartApiRepo$getAddresses$$inlined$map$1((es0_2)object2, (String)object);
        object = ir0_2.a;
        return ms0_1.m((es0_2)object3, (CoroutineContext)object);
    }

    public final es0_2 getAssuredGift(String object, String object2) {
        Intrinsics.checkNotNullParameter(object, "screenName");
        Object object3 = new Ref$ObjectRef();
        UrlHelper urlHelper = UrlHelper.Companion.getInstance();
        Object[] objectArray = new Object[]{object2};
        ((Ref$ObjectRef)object3).element = object2 = urlHelper.getApiUrl("cart", "assured_gift_gamification", objectArray);
        object2 = new CartApiRepo$getAssuredGift$1(this, (Ref$ObjectRef)object3, null);
        object3 = new br2_2((Function2)object2);
        object2 = ir0_2.a;
        object2 = em0_2.b;
        object2 = ms0_1.m((es0_2)object3, (CoroutineContext)object2);
        object3 = new CartApiRepo$getAssuredGift$$inlined$map$1((es0_2)object2, (String)object);
        object = ir0_2.a;
        return ms0_1.m((es0_2)object3, (CoroutineContext)object);
    }

    public final es0_2 getBulkDelete(String object, String object2, String object3) {
        Intrinsics.checkNotNullParameter(object, "screenName");
        Intrinsics.checkNotNullParameter(object2, "guid");
        Intrinsics.checkNotNullParameter(object3, "skusId");
        Object object4 = this.userInformation.getCustomerUUID();
        Object object5 = this.userInformation;
        boolean bl2 = ((UserInformation)object5).isUserOnline();
        if (!bl2) {
            object4 = this.userInformation.getUserId();
        }
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        object5 = UrlHelper.Companion.getInstance();
        Object object6 = new Object[]{object4};
        ref$ObjectRef.element = object4 = ((UrlHelper)object5).getApiUrl("cart", "bulk_delete", object6);
        ref$ObjectRef.element = object4 = ww0_2.d((String)object4);
        object5 = object4;
        object6 = this;
        object4 = new CartApiRepo$getBulkDelete$1(this, ref$ObjectRef, (String)object3, (String)object2, null);
        object2 = new br2_2((Function2)object4);
        object3 = ir0_2.a;
        object3 = em0_2.b;
        object2 = ms0_1.m((es0_2)object2, (CoroutineContext)object3);
        object3 = new CartApiRepo$getBulkDelete$$inlined$map$1((es0_2)object2, (String)object);
        object = ir0_2.a;
        return ms0_1.m((es0_2)object3, (CoroutineContext)object);
    }

    public final es0_2 getBulkMoveToWishList(String object, JsonArray object2) {
        Intrinsics.checkNotNullParameter(object, "screenName");
        Intrinsics.checkNotNullParameter(object2, "optionCode");
        Object object3 = new Ref$ObjectRef();
        Object object4 = UrlHelper.Companion.getInstance();
        String string2 = this.userInformation.getCustomerUUID();
        Object[] objectArray = new Object[]{string2};
        ((Ref$ObjectRef)object3).element = object4 = ((UrlHelper)object4).getApiUrl("cart", "bulk_move_wishlist", objectArray);
        object4 = new JsonObject();
        ((JsonObject)object4).add("optionsCodes", (JsonElement)object2);
        string2 = "AJIO";
        ((JsonObject)object4).addProperty("sourceStoreId", string2);
        ((JsonObject)object4).addProperty("tenantId", string2);
        object2 = new CartApiRepo$getBulkMoveToWishList$1(this, (Ref$ObjectRef)object3, (JsonObject)object4, null);
        object3 = new br2_2((Function2)object2);
        object2 = ir0_2.a;
        object2 = em0_2.b;
        object2 = ms0_1.m((es0_2)object3, (CoroutineContext)object2);
        object3 = new CartApiRepo$getBulkMoveToWishList$$inlined$map$1((es0_2)object2, (String)object);
        object = ir0_2.a;
        return ms0_1.m((es0_2)object3, (CoroutineContext)object);
    }

    public final es0_2 getBulkMoveToWishListV2(String object, BulkMoveToWishlist object2) {
        Intrinsics.checkNotNullParameter(object, "screenName");
        Intrinsics.checkNotNullParameter(object2, "bulkMoveToWishlist");
        Object object3 = UrlHelper.Companion.getInstance();
        Object object4 = this.userInformation.getCustomerUUID();
        Object[] objectArray = new Object[]{object4};
        object3 = ((UrlHelper)object3).getApiUrl("cart", "bulk_move_wishlist_new", objectArray);
        object4 = new CartApiRepo$getBulkMoveToWishListV2$1(this, (String)object3, (BulkMoveToWishlist)object2, null);
        object2 = new br2_2((Function2)object4);
        object3 = ir0_2.a;
        object3 = em0_2.b;
        object2 = ms0_1.m((es0_2)object2, (CoroutineContext)object3);
        object3 = new CartApiRepo$getBulkMoveToWishListV2$$inlined$map$1((es0_2)object2, (String)object);
        object = ir0_2.a;
        return ms0_1.m((es0_2)object3, (CoroutineContext)object);
    }

    public final es0_2 getCartAndCheckStockData(String object, boolean bl2, boolean bl3, boolean bl4, boolean bl5, boolean bl6, boolean bl7) {
        Intrinsics.checkNotNullParameter(object, "screenName");
        es0_2 es0_22 = this.getCartData(bl2, bl3, bl4, bl5, bl6, bl7);
        Object object2 = ir0_2.a;
        object2 = em0_2.b;
        es0_22 = ms0_1.m(es0_22, (CoroutineContext)object2);
        object2 = new CartApiRepo$getCartAndCheckStockData$$inlined$map$1(es0_22, (String)object);
        object = ir0_2.a;
        return ms0_1.m((es0_2)object2, (CoroutineContext)object);
    }

    public final es0_2 getInternalWalletOnCart(HashSet object, Cart cart) {
        Object object2 = new CartApiRepo$getInternalWalletOnCart$1(this, cart, (HashSet)object, null);
        es0_2 es0_22 = new br2_2((Function2)object2);
        object2 = ir0_2.a;
        object2 = em0_2.b;
        object2 = ms0_1.m(es0_22, (CoroutineContext)object2);
        es0_22 = new CartApiRepo$getInternalWalletOnCart$$inlined$map$1((es0_2)object2, cart, (HashSet)object);
        object = ir0_2.a;
        return ms0_1.m(es0_22, (CoroutineContext)object);
    }

    public final es0_2 getInventoryData() {
        qg3_2 qg3_22 = new CartApiRepo$getInventoryData$1(this, null);
        br2_2 br2_22 = new br2_2((Function2)((Object)qg3_22));
        qg3_22 = new CartApiRepo$getInventoryData$2(null);
        at0_1 at0_12 = new at0_1(br2_22, (gx0_2)((Object)qg3_22));
        return at0_12;
    }

    public final es0_2 getNewCartId(String object) {
        Intrinsics.checkNotNullParameter(object, "screenName");
        es0_2 es0_22 = this.getCartIdDetails();
        CartApiRepo$getNewCartId$$inlined$map$1 cartApiRepo$getNewCartId$$inlined$map$1 = new CartApiRepo$getNewCartId$$inlined$map$1(es0_22, this, (String)object);
        object = ir0_2.a;
        return ms0_1.m(cartApiRepo$getNewCartId$$inlined$map$1, (CoroutineContext)object);
    }

    public final es0_2 getNewGuId(String object) {
        Intrinsics.checkNotNullParameter(object, "screenName");
        es0_2 es0_22 = this.getCartIdDetails();
        CartApiRepo$getNewGuId$$inlined$map$1 cartApiRepo$getNewGuId$$inlined$map$1 = new CartApiRepo$getNewGuId$$inlined$map$1(es0_22, (String)object);
        object = ir0_2.a;
        return ms0_1.m(cartApiRepo$getNewGuId$$inlined$map$1, (CoroutineContext)object);
    }

    public final es0_2 getProductSize(QueryProductDetails object, String string2) {
        Intrinsics.checkNotNullParameter(object, "queryProductDetails");
        Intrinsics.checkNotNullParameter(string2, "screenName");
        Object object2 = new Ref$ObjectRef();
        Object object3 = UrlHelper.Companion.getInstance();
        object = ((QueryProductDetails)object).getProductCode();
        Object[] objectArray = new Object[]{object};
        ((Ref$ObjectRef)object2).element = object = ((UrlHelper)object3).getApiUrl("cart", "product_size_auth", objectArray);
        object3 = authorizedQueryParams;
        ((Ref$ObjectRef)object2).element = object = nb0_0.a((String)object, "?fields=FULL&", (String)object3);
        object = new CartApiRepo$getProductSize$1(this, (Ref$ObjectRef)object2, null);
        object2 = new br2_2((Function2)object);
        object = ir0_2.a;
        object = em0_2.b;
        object = ms0_1.m((es0_2)object2, (CoroutineContext)object);
        object2 = new CartApiRepo$getProductSize$$inlined$map$1((es0_2)object, string2);
        object = ir0_2.a;
        return ms0_1.m((es0_2)object2, (CoroutineContext)object);
    }

    public final es0_2 getQuickView(String object) {
        Intrinsics.checkNotNullParameter(object, "screenName");
        Object object2 = new Ref$ObjectRef();
        Object object3 = UrlHelper.Companion.getInstance();
        String string2 = this.userInformation.getUserId();
        Object object4 = ap_0.a;
        object4 = ap_0.a(this.userInformation.isUserOnline());
        Object[] objectArray = new Object[]{string2, object4};
        ((Ref$ObjectRef)object2).element = object3 = ((UrlHelper)object3).getApiUrl("cart", "quickview_list", objectArray);
        string2 = authorizedQueryParams;
        ((Ref$ObjectRef)object2).element = object3 = nb0_0.a((String)object3, "?fields=BASIC&", string2);
        object3 = new CartApiRepo$getQuickView$1(this, (Ref$ObjectRef)object2, null);
        object2 = new br2_2((Function2)object3);
        object3 = ir0_2.a;
        object3 = em0_2.b;
        object2 = ms0_1.m((es0_2)object2, (CoroutineContext)object3);
        object3 = new CartApiRepo$getQuickView$$inlined$map$1((es0_2)object2, (String)object);
        object = ir0_2.a;
        return ms0_1.m((es0_2)object3, (CoroutineContext)object);
    }

    public final es0_2 loadEddOOSSimilarCart(String string2, ArrayList object, String object2) {
        Intrinsics.checkNotNullParameter(string2, "screenName");
        Intrinsics.checkNotNullParameter(object, "oosInventoryProduct");
        Object object3 = new CartApiRepo$loadEddOOSSimilarCart$1(this, (ArrayList)object, (String)object2, null);
        object = new br2_2((Function2)object3);
        object2 = ir0_2.a;
        object = ms0_1.m((es0_2)object, (CoroutineContext)object2);
        object3 = new CartApiRepo$loadEddOOSSimilarCart$$inlined$map$1((es0_2)object, this);
        object = em0_2.b;
        object = ms0_1.m((es0_2)object3, (CoroutineContext)object);
        object3 = new CartApiRepo$loadEddOOSSimilarCart$$inlined$map$2((es0_2)object, string2);
        return ms0_1.m((es0_2)object3, (CoroutineContext)object2);
    }

    public final es0_2 loadOOSSimilarCart(String string2, ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(string2, "screenName");
        Intrinsics.checkNotNullParameter(arrayList, "oosInventoryProduct");
        Object object = new CartApiRepo$loadOOSSimilarCart$1(this, arrayList, null);
        Object object2 = new br2_2((Function2)object);
        object = ir0_2.a;
        object2 = ms0_1.m((es0_2)object2, (CoroutineContext)object);
        es0_2 es0_22 = new CartApiRepo$loadOOSSimilarCart$$inlined$map$1((es0_2)object2, this);
        object2 = em0_2.b;
        object2 = ms0_1.m(es0_22, (CoroutineContext)object2);
        es0_22 = new CartApiRepo$loadOOSSimilarCart$$inlined$map$2((es0_2)object2, this, arrayList, string2);
        return ms0_1.m(es0_22, (CoroutineContext)object);
    }

    public final void mergeCartAndInventory(Cart cart, CartInventory cartInventory) {
        if (cart != null && cartInventory != null) {
            cart.setCartInventory(cartInventory);
        }
    }

    public final es0_2 mergeCarts(String object) {
        Intrinsics.checkNotNullParameter(object, "screenName");
        Object object2 = this.userInformation.getUserId();
        Object object3 = new Ref$ObjectRef();
        Object object4 = UrlHelper.Companion.getInstance();
        Object object5 = new Object[]{object2};
        ((Ref$ObjectRef)object3).element = object2 = ((UrlHelper)object4).getApiUrl("cart", "merge_cart_id", object5);
        object4 = authorizedQueryParams;
        object5 = h40_0.a;
        boolean bl2 = h40_0.O1();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(object2);
        stringBuilder.append("?");
        stringBuilder.append((String)object4);
        stringBuilder.append("&priorityDeliveryEnable=");
        stringBuilder.append(bl2);
        ((Ref$ObjectRef)object3).element = object2 = stringBuilder.toString();
        ((Ref$ObjectRef)object3).element = object2 = ww0_2.d((String)object2);
        object2 = new CartApiRepo$mergeCarts$1(this, (Ref$ObjectRef)object3, null);
        object3 = new br2_2((Function2)object2);
        object2 = new CartApiRepo$mergeCarts$$inlined$map$1((es0_2)object3, this, (String)object);
        object = ir0_2.a;
        object = em0_2.b;
        return ms0_1.m((es0_2)object2, (CoroutineContext)object);
    }

    public final es0_2 moveToCloset(QueryCart object, String object2, String string2) {
        Intrinsics.checkNotNullParameter(object, "queryCart");
        Intrinsics.checkNotNullParameter(object2, "sourceStoreId");
        Intrinsics.checkNotNullParameter(string2, "screenName");
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        Object object3 = UrlHelper.Companion.getInstance();
        Object object4 = this.userInformation.getCustomerUUID();
        int n3 = 1;
        Object object5 = new Object[n3];
        object5[0] = object4;
        ref$ObjectRef.element = object3 = ((UrlHelper)object3).getApiUrl("closet", "wishlist_add", object5);
        object4 = authorizedQueryParams;
        ref$ObjectRef.element = object3 = nb0_0.a((String)object3, "?", (String)object4);
        kx3_0.c = n3;
        kx3_0.a = n3;
        kx3_0.b = null;
        object4 = object3;
        object5 = object;
        object3 = new CartApiRepo$moveToCloset$1(this, ref$ObjectRef, (QueryCart)object, (String)object2, null);
        object = new br2_2((Function2)object3);
        object2 = ir0_2.a;
        object2 = em0_2.b;
        object = ms0_1.m((es0_2)object, (CoroutineContext)object2);
        object2 = new CartApiRepo$moveToCloset$$inlined$map$1((es0_2)object, string2);
        object = ir0_2.a;
        return ms0_1.m((es0_2)object2, (CoroutineContext)object);
    }

    public final g53_0 moveToClosetAndDelete(QueryCart queryCart, QuerySingleData querySingleData, String string2, String string3) {
        int n3;
        String string4;
        int n4;
        Ref$ObjectRef ref$ObjectRef;
        String string5;
        CartApiRepo cartApiRepo = this;
        String string6 = string3;
        boolean bl2 = true;
        Object object = queryCart;
        Intrinsics.checkNotNullParameter(queryCart, "queryCart");
        Object object2 = querySingleData;
        Intrinsics.checkNotNullParameter(querySingleData, "querySingleData");
        Intrinsics.checkNotNullParameter(string2, "sourceStoreId");
        Intrinsics.checkNotNullParameter(string3, "screenName");
        Object object3 = this.userInformation.getUserId();
        Object object4 = ap_0.a;
        String string7 = ap_0.a(this.userInformation.isUserOnline());
        Object object5 = new Ref$ObjectRef();
        Object object6 = new Ref$ObjectRef();
        kx3_0.c = bl2;
        kx3_0.a = bl2;
        kx3_0.b = null;
        object4 = UrlHelper.Companion;
        Object object7 = ((UrlHelper$Companion)object4).getInstance();
        String string8 = this.userInformation.getCustomerUUID();
        Object object8 = new Object[bl2];
        object8[0] = string8;
        object7 = object7.getApiUrl("closet", "wishlist_add", object8);
        string8 = authorizedQueryParams;
        object8 = "?";
        Object object9 = n1.a((String)object7, (String)object8, string8);
        object4 = ((UrlHelper$Companion)object4).getInstance();
        object2 = querySingleData.getData();
        int bl3 = 3;
        object7 = new Object[bl3];
        object7[0] = object3;
        object7[bl2] = string7;
        int n7 = 2;
        object7[n7] = object2;
        Object object10 = ((UrlHelper)object4).getApiUrl("cart", "delete_entries", object7);
        Object object11 = new StringBuilder();
        ((StringBuilder)object11).append((String)object10);
        ((StringBuilder)object11).append((String)object8);
        ((StringBuilder)object11).append(string8);
        object10 = ((StringBuilder)object11).toString();
        String string9 = ww0_2.d((String)object10);
        String string10 = "ApplicationError: okHttp user id null:isUserOnline";
        if (object3 != null && (n7 = ((String)object3).length()) != 0) {
            string5 = string10;
            ref$ObjectRef = object6;
        } else {
            object10 = ApiErrorRepo.INSTANCE;
            bl2 = cartApiRepo.userInformation.isUserOnline();
            object3 = new StringBuilder(string10);
            ((StringBuilder)object3).append(bl2);
            object3 = ((StringBuilder)object3).toString();
            boolean bl4 = true;
            object8 = null;
            object11 = "RemoveCartEntry";
            n4 = 200;
            object4 = null;
            int n8 = 72;
            string4 = null;
            string8 = string3;
            string5 = string10;
            n3 = n8;
            ref$ObjectRef = object6;
            object6 = null;
            ApiErrorRepo.logServiceErrorEvent$default((ApiErrorRepo)object10, (String)object11, (String)object3, n4, null, bl4, string3, null, n8, null);
        }
        if (string7 == null || (n7 = string7.length()) == 0) {
            object10 = ApiErrorRepo.INSTANCE;
            bl2 = cartApiRepo.userInformation.isUserOnline();
            object2 = string5;
            object3 = new StringBuilder(string5);
            ((StringBuilder)object3).append(bl2);
            object3 = ((StringBuilder)object3).toString();
            boolean bl5 = true;
            object8 = null;
            object11 = "RemoveCartEntry";
            n4 = 200;
            object4 = null;
            n3 = 72;
            object6 = null;
            string8 = string3;
            ApiErrorRepo.logServiceErrorEvent$default((ApiErrorRepo)object10, (String)object11, (String)object3, n4, null, bl5, string3, null, n3, null);
        }
        object10 = cartApiRepo.cartDataApi;
        object11 = queryCart.getProductCode();
        object3 = String.valueOf(queryCart.getQuantity());
        object2 = cartApiRepo.userInformation;
        object4 = "userInformation";
        Intrinsics.checkNotNullExpressionValue(object2, (String)object4);
        object2 = ServiceUtil.getToken((UserInformation)object2);
        object7 = "Bearer ";
        object2 = kp1_0.c((String)object7, (String)object2);
        string8 = clientType;
        object8 = "clientType";
        Intrinsics.checkNotNullExpressionValue(string8, (String)object8);
        string10 = clientVersion;
        object = object10;
        string7 = object9;
        object10 = object5;
        object5 = object11;
        object9 = object2;
        string4 = string10;
        object11 = CartApi$DefaultImpls.addToCloset$default((CartApi)object, string7, (String)object11, (String)object3, (String)object2, string8, string10, "AddtoCloset", string2, false, 256, null);
        object3 = qt2_2.c;
        object11 = ((g53_0)object11).h((Scheduler)object3);
        object2 = cartApiRepo.cartDataApi;
        object6 = cartApiRepo.userInformation;
        Intrinsics.checkNotNullExpressionValue(object6, (String)object4);
        object4 = ServiceUtil.getToken((UserInformation)object6);
        object6 = new StringBuilder((String)object7);
        ((StringBuilder)object6).append((String)object4);
        object7 = ((StringBuilder)object6).toString();
        Intrinsics.checkNotNullExpressionValue(string8, (String)object8);
        object4 = string9;
        object8 = string10;
        string10 = "AddtoCloset";
        object3 = object2.deleteProductFromCart(string9, (String)object7, string8, string4, string10).h((Scheduler)object3);
        object4 = ref$ObjectRef;
        object2 = new am_2((Ref$ObjectRef)object10, string6, ref$ObjectRef);
        object7 = new bm_2(object2);
        object11 = g53_0.i((g53_0)object11, (g53_0)object3, (dx_0)object7);
        object3 = ti_2.a();
        object11 = ((g53_0)object11).e((Scheduler)object3);
        object3 = new cm_2((Ref$ObjectRef)object10, string6, ref$ObjectRef);
        object10 = new u53_0((q63_0)object11, (bx0_2)object3);
        Intrinsics.checkNotNullExpressionValue(object10, "onErrorReturn(...)");
        return object10;
    }

    public final Object suspendAddToCart(QueryCart queryCart, String string2, f80_0 f80_02) {
        CartApiRepo cartApiRepo = this;
        Object object = UrlHelper.Companion.getInstance();
        Object object2 = this.userInformation.getUserId();
        Object object3 = ap_0.a;
        boolean bl2 = this.userInformation.isUserOnline();
        object3 = ap_0.a(bl2);
        int n3 = 2;
        Object object4 = new Object[n3];
        object4[0] = object2;
        int n4 = 1;
        object4[n4] = object3;
        object = ((UrlHelper)object).getApiUrl("cart", "add_to_cart", (Object[])object4);
        object3 = authorizedQueryParams;
        object4 = new StringBuilder();
        ((StringBuilder)object4).append((String)object);
        ((StringBuilder)object4).append("?");
        ((StringBuilder)object4).append((String)object3);
        object4 = ww0_2.d(((StringBuilder)object4).toString());
        kx3_0.a = n4;
        kx3_0.b = null;
        object = queryCart.getImsBatchId();
        boolean bl3 = TextUtils.isEmpty((CharSequence)object);
        object2 = "getCommercialType(...)";
        object3 = "Bearer ";
        Object object5 = "userInformation";
        if (!bl3 && !(bl3 = TextUtils.isEmpty((CharSequence)(object = queryCart.getCommercialType())))) {
            object = this.cartDataApi;
            String string3 = queryCart.getProductCode();
            String string4 = String.valueOf(queryCart.getQuantity());
            String string5 = queryCart.getImsBatchId();
            String string6 = queryCart.getCommercialType();
            Intrinsics.checkNotNullExpressionValue(string6, (String)object2);
            object2 = this.userInformation;
            Intrinsics.checkNotNullExpressionValue(object2, (String)object5);
            object2 = ServiceUtil.getToken((UserInformation)object2);
            String string7 = kp1_0.c((String)object3, (String)object2);
            object3 = object;
            object5 = string3;
            string3 = string4;
            string4 = string2;
            return object.addToCart((String)object4, (String)object5, string3, string2, string5, FIELD_FULL, string6, string7, "AddtoCart", f80_02);
        }
        object = queryCart.getImsBatchId();
        bl3 = TextUtils.isEmpty((CharSequence)object);
        if (!bl3) {
            object = cartApiRepo.cartDataApi;
            object2 = queryCart.getProductCode();
            String string8 = String.valueOf(queryCart.getQuantity());
            String string9 = queryCart.getImsBatchId();
            Object object6 = cartApiRepo.userInformation;
            Intrinsics.checkNotNullExpressionValue(object6, (String)object5);
            object5 = ServiceUtil.getToken((UserInformation)object6);
            String string10 = kp1_0.c((String)object3, (String)object5);
            object3 = object;
            object5 = object2;
            object6 = string2;
            return object.addToCartWithImsBatchId((String)object4, (String)object2, string8, string2, string9, FIELD_FULL, string10, "AddtoCart", f80_02);
        }
        object = queryCart.getCommercialType();
        bl3 = TextUtils.isEmpty((CharSequence)object);
        if (!bl3) {
            object = cartApiRepo.cartDataApi;
            String string11 = queryCart.getProductCode();
            String string12 = String.valueOf(queryCart.getQuantity());
            String string13 = queryCart.getCommercialType();
            Intrinsics.checkNotNullExpressionValue(string13, (String)object2);
            object2 = cartApiRepo.userInformation;
            Intrinsics.checkNotNullExpressionValue(object2, (String)object5);
            object2 = ServiceUtil.getToken((UserInformation)object2);
            String string14 = kp1_0.c((String)object3, (String)object2);
            object3 = object;
            object5 = string11;
            string11 = string12;
            string12 = string2;
            return object.addToCartWithCommercialType((String)object4, (String)object5, string11, string2, FIELD_FULL, string13, string14, "AddtoCart", f80_02);
        }
        object = cartApiRepo.cartDataApi;
        object2 = queryCart.getProductCode();
        String string15 = String.valueOf(queryCart.getQuantity());
        Object object7 = cartApiRepo.userInformation;
        Intrinsics.checkNotNullExpressionValue(object7, (String)object5);
        object5 = ServiceUtil.getToken((UserInformation)object7);
        String string16 = kp1_0.c((String)object3, (String)object5);
        object3 = object;
        object5 = object2;
        object7 = string2;
        f80_0 f80_03 = f80_02;
        return object.addToCartWithOutImsBatchIdCommercialType((String)object4, (String)object2, string15, string2, FIELD_FULL, string16, "AddtoCart", f80_02);
    }

    public final es0_2 updateAddressToCart(String object, String object2) {
        int n3;
        Intrinsics.checkNotNullParameter(object, "postalPinCode");
        String string2 = "addressId";
        Intrinsics.checkNotNullParameter(object2, string2);
        Object object3 = this.userInformation;
        boolean bl2 = ((UserInformation)object3).isUserOnline();
        object3 = bl2 ? this.userInformation.getCustomerUUID() : this.userInformation.getUserId();
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        Object object4 = UrlHelper.Companion.getInstance();
        int n4 = 1;
        Object object5 = new Object[n4];
        object5[0] = object3;
        String string3 = "update_address_to_cart";
        object3 = ((UrlHelper)object4).getApiUrl("address", string3, object5);
        ref$ObjectRef.element = object3;
        object4 = authorizedQueryParams;
        object5 = "?";
        object3 = nb0_0.a((String)object3, (String)object5, (String)object4);
        ref$ObjectRef.element = object3;
        object3 = new Object();
        int n7 = ((String)object).length();
        if (n7 > 0) {
            object4 = "pinCode";
            ((HashMap)object3).put(object4, object);
        }
        if ((n3 = ((String)object2).length()) > 0) {
            ((HashMap)object3).put(string2, object2);
        }
        if ((n3 = (int)(((UserInformation)(object = this.userInformation)).isUserOnline() ? 1 : 0)) == 0) {
            object = String.valueOf(ap_0.a.getGuId());
            object2 = "guid";
            ((HashMap)object3).put(object2, object);
        }
        object = new CartApiRepo$updateAddressToCart$1(this, ref$ObjectRef, (HashMap)object3, null);
        object2 = new br2_2((Function2)object);
        object = ir0_2.a;
        object = em0_2.b;
        object = ms0_1.m((es0_2)object2, (CoroutineContext)object);
        object2 = new CartApiRepo$updateAddressToCart$$inlined$map$1((es0_2)object);
        object = ir0_2.a;
        return ms0_1.m((es0_2)object2, (CoroutineContext)object);
    }

    public final es0_2 updateItemCountForProduct(QueryCart object, String string2) {
        Intrinsics.checkNotNullParameter(object, "queryCart");
        Intrinsics.checkNotNullParameter(string2, "screenName");
        Object object2 = this.userInformation.getUserId();
        Object object3 = ap_0.a;
        boolean bl2 = this.userInformation.isUserOnline();
        object3 = ap_0.a(bl2);
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        Object object4 = UrlHelper.Companion.getInstance();
        int n3 = ((QueryCart)object).getCartEntryNumber();
        Object object5 = n3;
        int n4 = 3;
        Object object6 = new Object[n4];
        object6[0] = object2;
        object6[1] = object3;
        int n7 = 2;
        object6[n7] = object5;
        String string3 = "update_entries";
        ref$ObjectRef.element = object4 = ((UrlHelper)object4).getApiUrl("cart", string3, object6);
        object5 = authorizedQueryParams;
        object6 = "?";
        ref$ObjectRef.element = object4 = nb0_0.a((String)object4, (String)object6, (String)object5);
        ref$ObjectRef.element = object4 = ww0_2.d((String)object4);
        int n8 = TextUtils.isEmpty((CharSequence)object2);
        if (n8 != 0 || (n8 = TextUtils.isEmpty((CharSequence)object3)) != 0 || (n8 = ((QueryCart)object).getCartEntryNumber()) < 0) {
            object4 = yn3_0.a;
            n4 = ((QueryCart)object).getCartEntryNumber();
            string3 = "updateItemCountForProduct userId ";
            String string4 = " cartId ";
            String string5 = " Cart Entry Number ";
            object2 = og_1.a(string3, (String)object2, string4, (String)object3, string5);
            ((StringBuilder)object2).append(n4);
            object2 = ((StringBuilder)object2).toString();
            object5 = new Exception((String)object2);
            ((yn3$a)object4).e((Throwable)object5);
        }
        object2 = new CartApiRepo$updateItemCountForProduct$1(this, ref$ObjectRef, (QueryCart)object, null);
        object = new br2_2((Function2)object2);
        object2 = ir0_2.a;
        object2 = em0_2.b;
        object = ms0_1.m((es0_2)object, (CoroutineContext)object2);
        object2 = new CartApiRepo$updateItemCountForProduct$$inlined$map$1((es0_2)object, string2);
        object = bg1_1.a;
        return ms0_1.m((es0_2)object2, (CoroutineContext)object);
    }
}

