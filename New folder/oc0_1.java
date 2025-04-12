/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 */
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import com.ril.ajio.analytics.AnalyticsData;
import com.ril.ajio.analytics.AnalyticsData$Builder;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.FbEventContentData;
import com.ril.ajio.analytics.events.NewEEcommerceEventsRevamp;
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.kmm.shared.model.BaseResponse;
import com.ril.ajio.services.data.Closet.SaveForLaterResponse;
import com.ril.ajio.services.data.Product.CategoryTags;
import com.ril.ajio.services.data.Product.Product;
import com.ril.ajio.services.data.Product.ProductImage;
import com.ril.ajio.services.data.Product.ProductOptionItem;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from oc0
 */
public final class oc0_1
implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Fragment b;

    public /* synthetic */ oc0_1(Fragment fragment, int n3) {
        this.a = n3;
        this.b = fragment;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final Object invoke(Object var1_1) {
        var2_2 /* !! */  = "this$0";
        var3_3 = this.b;
        var4_4 = this.a;
        switch (var4_4) {
            default: {
                var5_5 = var1_1;
                var5_5 = (Boolean)var1_1;
                var5_5.getClass();
                var3_3 = (ed3_2)var3_3;
                Intrinsics.checkNotNullParameter(var3_3, (String)var2_2 /* !! */ );
                var3_3.x = var5_5;
                var2_2 /* !! */  = var3_3.y;
                if (var2_2 /* !! */  != null) {
                    cp_1.Companion.getClass();
                    var5_5 = cp$a.e();
                    var5_5.getClass();
                    var4_4 = (int)cp_1.I((BaseResponse)var2_2 /* !! */ );
                    if (var4_4 != 0) {
                        var3_3.Pa((BaseResponse)var2_2 /* !! */ );
                    }
                }
                return Unit.a;
            }
            case 1: {
                var5_6 /* !! */  = var1_1;
                var5_6 /* !! */  = (DataCallback)var1_1;
                var3_3 = (q22_0)var3_3;
                Intrinsics.checkNotNullParameter(var3_3, (String)var2_2 /* !! */ );
                var2_2 /* !! */  = cp_1.Companion;
                var6_8 = nn_2.b((cp$a)var2_2 /* !! */ , (DataCallback)var5_6 /* !! */ );
                if (var6_8 == 0) ** GOTO lbl251
                var2_2 /* !! */  = var3_3.Ua();
                var2_2 /* !! */ .stopLoader();
                var6_8 = var5_6 /* !! */ .getStatus();
                var7_10 = 1;
                if (var6_8 != 0) ** GOTO lbl248
                var2_2 /* !! */  = z40_0.Companion;
                var2_2 /* !! */  = Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)var2_2 /* !! */ ).a;
                var8_11 = "wishlist_state_enable";
                var6_8 = (int)var2_2 /* !! */ .a((String)var8_11);
                if (var6_8 != 0) {
                    var2_2 /* !! */  = var3_3.cb().e.b;
                    if (var2_2 /* !! */  != null) {
                        var6_8 = var2_2 /* !! */ .getViewHolderPos();
                        var2_2 /* !! */  = var6_8;
                    } else {
                        var6_8 = 0;
                        var2_2 /* !! */  = null;
                    }
                    var3_3.qb((Integer)var2_2 /* !! */ );
                }
                if ((var2_2 /* !! */  = (SaveForLaterResponse)var5_6 /* !! */ .getData()) == null) ** GOTO lbl240
                var5_6 /* !! */  = var2_2 /* !! */ .getStatusCode();
                if (var5_6 /* !! */  == null || (var4_4 = var5_6 /* !! */ .intValue()) != 0) ** GOTO lbl232
                if ((var2_2 /* !! */  = var2_2 /* !! */ .getStatus()) != null) {
                    var2_2 /* !! */  = var2_2 /* !! */ .getMessageDescription();
                } else {
                    var6_8 = 0;
                    var2_2 /* !! */  = null;
                }
                var4_4 = 3;
                rw_1.a(var4_4, (String)var2_2 /* !! */ );
                var2_2 /* !! */  = var3_3.cb().e.b;
                if (var2_2 /* !! */  != null) {
                    var5_6 /* !! */  = new HashMap();
                    var8_11 = var2_2 /* !! */ .getCode();
                    if (var8_11 != null && (var9_12 = var8_11.length()) > 0) {
                        var10_13 = "SKU";
                        var5_6 /* !! */ .put(var10_13, var8_11);
                    }
                    if ((var8_11 = var2_2 /* !! */ .getName()) != null && (var9_12 = var8_11.length()) > 0) {
                        var10_13 = "Name";
                        var5_6 /* !! */ .put(var10_13, var8_11);
                    }
                    if ((var8_11 = var2_2 /* !! */ .getFnlColorVariantData()) != null && (var8_11 = var8_11.getBrandName()) != null && (var9_12 = var8_11.length()) > 0) {
                        var10_13 = "BRAND";
                        var5_6 /* !! */ .put(var10_13, var8_11);
                    }
                    if ((var8_11 = var2_2 /* !! */ .getPrice()) != null && (var8_11 = var8_11.getValue()) != null && (var9_12 = var8_11.length()) > 0) {
                        var10_13 = "Final_price";
                        var5_6 /* !! */ .put(var10_13, var8_11);
                    }
                    var8_11 = var2_2 /* !! */ .getVariantOptions();
                    var10_13 = "MRP";
                    if (var8_11 != null && (var8_11 = (ProductOptionItem)CollectionsKt.firstOrNull((List)var8_11)) != null && (var8_11 = var8_11.getWasPriceData()) != null && (var8_11 = var8_11.getValue()) != null) {
                        var11_14 = var8_11.length();
                        if (var11_14 > 0 && (var11_14 = (int)mz3_0.C((String)var8_11)) != 0) {
                            var12_16 = Double.parseDouble(var8_11);
                            var8_11 = var12_16;
                            var5_6 /* !! */ .put(var10_13, var8_11);
                        }
                    } else {
                        var8_11 = var2_2 /* !! */ .getWasPriceData();
                        if (var8_11 != null && (var8_11 = var8_11.getValue()) != null && (var11_15 = var8_11.length()) > 0 && (var11_15 = (int)mz3_0.C((String)var8_11)) != 0) {
                            var12_17 = Double.parseDouble((String)var8_11);
                            var8_11 = var12_17;
                            var5_6 /* !! */ .put(var10_13, var8_11);
                        }
                    }
                    if ((var8_11 = var2_2 /* !! */ .getTags()) != null && (var8_11 = var8_11.getCategoryTags()) != null && (var8_11 = (CategoryTags)CollectionsKt.firstOrNull((List)var8_11)) != null && (var8_11 = var8_11.getCategory()) != null && (var9_12 = var8_11.length()) > 0) {
                        var10_13 = "Category";
                        var5_6 /* !! */ .put(var10_13, var8_11);
                    }
                    if ((var8_11 = var2_2 /* !! */ .getVerticalNameText()) != null && (var9_12 = var8_11.length()) > 0) {
                        var10_13 = "Vertical";
                        var5_6 /* !! */ .put(var10_13, var8_11);
                    }
                    if ((var8_11 = var2_2 /* !! */ .getBrickNameText()) != null && (var9_12 = var8_11.length()) > 0) {
                        var10_13 = "Brick";
                        var5_6 /* !! */ .put(var10_13, var8_11);
                    }
                    if ((var8_11 = var2_2 /* !! */ .getImages()) != null && (var8_11 = (ProductImage)CollectionsKt.firstOrNull(var8_11)) != null && (var8_11 = var8_11.getUrl()) != null && (var9_12 = var8_11.length()) > 0) {
                        var10_13 = "Image_URL";
                        var5_6 /* !! */ .put(var10_13, var8_11);
                    }
                    if ((var9_12 = (var8_11 = od3_2.a()).length()) > 0) {
                        var10_13 = "Store Type";
                        var5_6 /* !! */ .put(var10_13, var8_11);
                    }
                    var8_11 = AnalyticsManager.Companion.getInstance().getCt();
                    var10_13 = new AnalyticsData$Builder();
                    var5_6 /* !! */  = var10_13.eventMap((HashMap)var5_6 /* !! */ ).build();
                    var8_11.addedToCloset((AnalyticsData)var5_6 /* !! */ );
                    var5_6 /* !! */  = el1_2.a;
                    var5_6 /* !! */  = yt2_2.PLP;
                    el1_2.c((yt2_2)var5_6 /* !! */ , (Product)var2_2 /* !! */ );
                    q22_0.pb((Product)var2_2 /* !! */ );
                }
                if ((var2_2 /* !! */  = var3_3.cb().e.b) != null && (var2_2 /* !! */  = var2_2 /* !! */ .getFnlColorVariantData()) != null) {
                    var2_2 /* !! */  = var2_2 /* !! */ .getColorGroup();
                } else {
                    var6_8 = 0;
                    var2_2 /* !! */  = null;
                }
                if (var2_2 /* !! */  != null && (var6_8 = var2_2 /* !! */ .length()) != 0 && (var2_2 /* !! */  = var3_3.cb().e.b) != null) {
                    var5_6 /* !! */  = var3_3.cb().e.b;
                    if (var5_6 /* !! */  != null) {
                        var5_6 /* !! */  = var5_6 /* !! */ .getFnlColorVariantData();
                    } else {
                        var4_4 = 0;
                        var5_6 /* !! */  = null;
                    }
                    Intrinsics.checkNotNull(var5_6 /* !! */ );
                    var5_6 /* !! */  = var5_6 /* !! */ .getColorGroup();
                    var2_2 /* !! */ .setCode((String)var5_6 /* !! */ );
                }
                if ((var2_2 /* !! */  = var3_3.cb().e.b) == null) ** GOTO lbl241
                var2_2 /* !! */  = g62_0.c;
                var5_6 /* !! */  = var3_3.cb().e.b;
                Intrinsics.checkNotNull(var5_6 /* !! */ );
                var5_6 /* !! */  = DW.c(var5_6 /* !! */ );
                var14_18 = 1000;
                var2_2 /* !! */ .b(var5_6 /* !! */ , var14_18);
                kx3_0.a = var7_10;
                kx3_0.b = null;
                var2_2 /* !! */  = var3_3.cb().e.b;
                var5_6 /* !! */  = "";
                if (var2_2 /* !! */  == null) ** GOTO lbl200
                var8_11 = new ArrayList();
                var15_19 = var2_2 /* !! */ .getCode();
                if (var15_19 == null) {
                    var15_19 = var5_6 /* !! */ ;
                }
                var10_13 = new FbEventContentData((String)var15_19, var7_10);
                var8_11.add(var10_13);
                var16_20 = var2_2 /* !! */ .getPrice();
                if (var16_20 != null) {
                    var16_20 = var2_2 /* !! */ .getPrice();
                    if (var16_20 != null) {
                        var16_20 = var16_20.getValue();
                    } else {
                        var7_10 = 0;
                        var16_20 = null;
                    }
                    var9_12 = (int)TextUtils.isEmpty((CharSequence)var16_20);
                    if (var9_12 != 0) {
                        var16_20 = "0.0";
                    }
                } else {
                    var16_20 = "0.0d";
                }
                if ((var10_13 = var2_2 /* !! */ .getFnlColorVariantData()) == null) ** GOTO lbl183
                var10_13 = var2_2 /* !! */ .getFnlColorVariantData();
                if (var10_13 != null) {
                    var10_13 = var10_13.getBrandName();
                } else {
                    var9_12 = 0;
                    var10_13 = null;
                }
                if (var10_13 == null) ** GOTO lbl183
                var10_13 = var2_2 /* !! */ .getFnlColorVariantData();
                if (var10_13 == null) ** GOTO lbl-1000
                var10_13 = var10_13.getBrandName();
                ** GOTO lbl188
lbl183:
                // 2 sources

                if ((var10_13 = var2_2 /* !! */ .getBrandName()) != null) {
                    var10_13 = var2_2 /* !! */ .getBrandName();
                } else lbl-1000:
                // 2 sources

                {
                    var9_12 = 0;
                    var10_13 = null;
                }
lbl188:
                // 3 sources

                var15_19 = AnalyticsManager.Companion.getInstance().getFb();
                var17_21 = new AnalyticsData$Builder();
                var18_22 /* !! */  = var2_2 /* !! */ .getCode();
                if (var18_22 /* !! */  == null) {
                    var18_22 /* !! */  = var5_6 /* !! */ ;
                }
                var17_21 = var17_21.productCode(var18_22 /* !! */ );
                if (var16_20 == null) {
                    var16_20 = var5_6 /* !! */ ;
                }
                var16_20 = var17_21.price((String)var16_20).setBrand((String)var10_13);
                var2_2 /* !! */  = var2_2 /* !! */ .getCatalog();
                var2_2 /* !! */  = var16_20.setCatalogId((String)var2_2 /* !! */ ).fbContentData((List)var8_11).build();
                var15_19.addToWishlistEvent((AnalyticsData)var2_2 /* !! */ );
lbl200:
                // 2 sources

                var2_2 /* !! */  = var3_3.cb();
                var6_8 = (int)var2_2 /* !! */ .b();
                var16_20 = "plp screen";
                if (var6_8 != 0) {
                    var2_2 /* !! */  = var3_3.cb().d.M;
                    if (var2_2 /* !! */  != null && (var2_2 /* !! */  = var2_2 /* !! */ .getBrandDetails()) != null) {
                        var2_2 /* !! */  = var2_2 /* !! */ .getMetaData();
                    } else {
                        var6_8 = 0;
                        var2_2 /* !! */  = null;
                    }
                    if (var2_2 /* !! */  != null) {
                        var2_2 /* !! */  = AnalyticsManager.Companion.getInstance().getGtmEvents();
                        var8_11 = var3_3.cb().e.b;
                        Intrinsics.checkNotNull(var8_11);
                        var2_2 /* !! */ .pushAddToClosetWidgetEventFleek((Product)var8_11, (String)var16_20, (String)var5_6 /* !! */ );
                    }
                }
                var10_13 = var3_3.cb().e.b;
                Intrinsics.checkNotNull(var10_13);
                var2_2 /* !! */  = var3_3.C0;
                var15_19 = var2_2 /* !! */ .getEE_ADD_TO_WISHLIST();
                var19_23 = 1L;
                var17_21 = var19_23;
                var5_6 /* !! */  = sq0_1.a;
                var21_24 = sq0_1.d((String)var16_20);
                var22_25 = var2_2 /* !! */ .getPrevScreen();
                var23_26 = sq0_1.e();
                var24_27 = var2_2 /* !! */ .getPrevScreenType();
                var25_28 = true;
                var8_11 = var3_3.C0;
                var18_22 /* !! */  = "NA";
                var26_29 = 512;
                NewEEcommerceEventsRevamp.pushEEClosetAddToCart$default((NewEEcommerceEventsRevamp)var8_11, (Product)var10_13, (String)var15_19, (Long)var17_21, var18_22 /* !! */ , var21_24, var25_28, var22_25, var23_26, var24_27, null, var26_29, null);
                ** GOTO lbl241
lbl232:
                // 1 sources

                if ((var2_2 /* !! */  = var2_2 /* !! */ .getStatus()) != null) {
                    var2_2 /* !! */  = var2_2 /* !! */ .getMessageDescription();
                } else {
                    var6_8 = 0;
                    var2_2 /* !! */  = null;
                }
                var4_4 = 2;
                rw_1.a(var4_4, (String)var2_2 /* !! */ );
                ** GOTO lbl241
lbl240:
                // 1 sources

                rw_1.a(var7_10, null);
lbl241:
                // 4 sources

                if ((var2_2 /* !! */  = var3_3.L0) != null) {
                    var5_6 /* !! */  = var3_3.cb().e.b;
                    var4_4 = var5_6 /* !! */  != null ? var5_6 /* !! */ .getViewHolderPos() : -1;
                    var2_2 /* !! */ .Oa(var4_4);
                }
                var2_2 /* !! */  = var3_3.cb().e;
                var2_2 /* !! */ .b = null;
                ** GOTO lbl251
lbl248:
                // 1 sources

                var6_8 = var5_6 /* !! */ .getStatus();
                if (var6_8 == var7_10) {
                    rw_1.a(var7_10, null);
                }
lbl251:
                // 5 sources

                return Unit.a;
            }
            case 0: 
        }
        var5_7 = var1_1;
        var5_7 = (Integer)var1_1;
        var3_3 = (pc0_2)var3_3;
        Intrinsics.checkNotNullParameter(var3_3, (String)var2_2 /* !! */ );
        if (var5_7 != null) {
            var6_9 = var3_3.f;
            var4_4 = var5_7.intValue();
            if (var4_4 == var6_9) {
                var2_2 /* !! */  = var3_3.j;
                if (var2_2 /* !! */  != null) {
                    var4_4 = 8;
                    var2_2 /* !! */ .setVisibility(var4_4);
                }
                var3_3.Oa();
            }
        }
        return Unit.a;
    }
}

