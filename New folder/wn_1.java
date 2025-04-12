/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.text.TextUtils
 */
import android.os.Bundle;
import android.text.TextUtils;
import com.ril.ajio.analytics.AnalyticsData;
import com.ril.ajio.analytics.AnalyticsData$Builder;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.AnalyticsManager$Companion;
import com.ril.ajio.analytics.FbEventContentData;
import com.ril.ajio.analytics.events.NewCustomEventsRevamp;
import com.ril.ajio.analytics.events.NewEEcommerceEventsRevamp;
import com.ril.ajio.services.data.Cart.AmountData;
import com.ril.ajio.services.data.Cart.Cart;
import com.ril.ajio.services.data.Cart.CartDeliveryAddress;
import com.ril.ajio.services.data.Cart.CartEntry;
import com.ril.ajio.services.data.Cart.ConvenienceFee;
import com.ril.ajio.services.data.Price;
import com.ril.ajio.services.data.Product.Product;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from wN
 */
public final class wn_1 {
    public final wx1_1 a;
    public final NewCustomEventsRevamp b;
    public final NewEEcommerceEventsRevamp c;
    public final String d;
    public final String e;

    public wn_1(wx1_1 object) {
        Intrinsics.checkNotNullParameter(object, "cartViewModel");
        this.a = object;
        object = AnalyticsManager.Companion;
        Object object2 = ((AnalyticsManager$Companion)object).getInstance().getNewCustomEventsRevamp();
        this.b = object2;
        this.c = object = ((AnalyticsManager$Companion)object).getInstance().getNewEEcommerceEventsRevamp();
        this.d = object2 = ((NewEEcommerceEventsRevamp)object).getPrevScreen();
        this.e = object = ((NewEEcommerceEventsRevamp)object).getPrevScreenType();
    }

    /*
     * Unable to fully structure code
     */
    public static void d(Product var0) {
        if (var0 == null) {
            return;
        }
        var1_1 = new ArrayList<FbEventContentData>();
        var3_3 = var0.getCode();
        var4_4 = "";
        if (var3_3 == null) {
            var3_3 = var4_4;
        }
        var5_5 = 1;
        var2_2 = new FbEventContentData(var3_3, var5_5);
        var1_1.add((FbEventContentData)var2_2);
        var2_2 = var0.getPrice();
        var3_3 = null;
        if (var2_2 != null) {
            var2_2 = var0.getPrice();
            var2_2 = var2_2 != null ? var2_2.getValue() : null;
            var5_5 = (int)TextUtils.isEmpty((CharSequence)var2_2);
            if (var5_5 != 0) {
                var2_2 = "0.0";
            }
        } else {
            var2_2 = "0.0d";
        }
        if ((var6_6 = var0.getFnlColorVariantData()) == null) ** GOTO lbl-1000
        var6_6 = var0.getFnlColorVariantData();
        if (var6_6 != null) {
            var6_6 = var6_6.getBrandName();
        } else {
            var5_5 = 0;
            var6_6 = null;
        }
        if (var6_6 != null) {
            var6_6 = var0.getFnlColorVariantData();
            if (var6_6 != null) {
                var3_3 = var6_6.getBrandName();
            }
        } else if ((var6_6 = var0.getBrandName()) != null) {
            var3_3 = var0.getBrandName();
        }
        var6_6 = AnalyticsManager.Companion.getInstance().getFb();
        var7_7 = new AnalyticsData$Builder();
        var8_8 = var0.getBaseProduct();
        if (var8_8 == null) {
            var8_8 = var4_4;
        }
        var7_7 = var7_7.productCode(var8_8);
        if (var2_2 != null) {
            var4_4 = var2_2;
        }
        var2_2 = var7_7.price((String)var4_4).setBrand(var3_3);
        var0 = var0.getCatalog();
        var0 = var2_2.setCatalogId((String)var0).fbContentData(var1_1).build();
        var6_6.addToWishlistEvent((AnalyticsData)var0);
    }

    public final void a() {
        boolean bl2 = og1_1.b();
        if (!bl2) {
            Iterator iterator = h40_0.a;
            bl2 = h40_0.Y1();
            if (bl2 && (bl2 = h40_0.T0()) && (iterator = this.a.S0) != null) {
                boolean bl3;
                iterator = ((Cart)((Object)iterator)).getEntries().iterator();
                Object object = "iterator(...)";
                Intrinsics.checkNotNullExpressionValue(iterator, (String)object);
                while (bl3 = iterator.hasNext()) {
                    object = (CartEntry)iterator.next();
                    Float f5 = ((CartEntry)object).getAverageRating();
                    String string2 = ((CartEntry)object).getNumUserRatings();
                    vn_2 vn_22 = new vn_2((CartEntry)object);
                    ai0_2.r(vn_22, f5, string2);
                }
            }
        }
    }

    public final void b(Bundle bundle) {
        Object object = this.a.S0;
        object = object != null ? ((Cart)object).getConvenienceFee() : null;
        if (object != null) {
            int n3;
            double d2;
            Object object2;
            Object object3 = ((ConvenienceFee)object).getDelivery();
            NewCustomEventsRevamp newCustomEventsRevamp = this.b;
            double d5 = 0.0;
            if (object3 != null) {
                object2 = ((AmountData)object3).getNetAmount();
                if (object2 != null) {
                    int n4;
                    String string2;
                    object2 = ((AmountData)object3).getNetAmount();
                    if (object2 != null && (string2 = ((Price)object2).getValue()) != null && (n4 = string2.length()) != 0) {
                        object2 = ((Price)object2).getValue();
                        Intrinsics.checkNotNull(object2);
                        d2 = Double.parseDouble((String)object2);
                    } else {
                        d2 = d5;
                    }
                    String string3 = newCustomEventsRevamp.getSV_EP_DELIVERY_FEE();
                    bundle.putDouble(string3, d2);
                }
                if ((object2 = ((AmountData)object3).getAmount()) != null) {
                    if ((object3 = ((AmountData)object3).getAmount()) != null && (object2 = ((Price)object3).getValue()) != null && (n3 = ((String)object2).length()) != 0) {
                        object3 = ((Price)object3).getValue();
                        Intrinsics.checkNotNull(object3);
                        d2 = Double.parseDouble((String)object3);
                    } else {
                        d2 = d5;
                    }
                    object3 = newCustomEventsRevamp.getSV_EP_DELIVERY_SLASHED_FEE();
                    bundle.putDouble((String)object3, d2);
                }
            }
            if ((object3 = ((ConvenienceFee)object).getRVP()) != null && (object2 = ((AmountData)object3).getNetAmount()) != null) {
                if ((object3 = ((AmountData)object3).getNetAmount()) != null && (object2 = ((Price)object3).getValue()) != null && (n3 = ((String)object2).length()) != 0) {
                    object3 = ((Price)object3).getValue();
                    Intrinsics.checkNotNull(object3);
                    d2 = Double.parseDouble((String)object3);
                } else {
                    d2 = d5;
                }
                object3 = newCustomEventsRevamp.getSV_EP_RVP_FEE();
                bundle.putDouble((String)object3, d2);
            }
            if ((object = ((ConvenienceFee)object).getCOD()) != null) {
                object3 = ((AmountData)object).getNetAmount();
                if (object3 != null) {
                    object3 = ((AmountData)object).getNetAmount();
                    if (object3 != null && (object2 = ((Price)object3).getValue()) != null && (n3 = ((String)object2).length()) != 0) {
                        object3 = ((Price)object3).getValue();
                        Intrinsics.checkNotNull(object3);
                        d2 = Double.parseDouble((String)object3);
                    } else {
                        d2 = d5;
                    }
                    object3 = newCustomEventsRevamp.getSV_EP_COD_FEE_ACTUAL();
                    bundle.putDouble((String)object3, d2);
                }
                if ((object3 = ((AmountData)object).getAmount()) != null) {
                    int n7;
                    if ((object = ((AmountData)object).getAmount()) != null && (object3 = ((Price)object).getValue()) != null && (n7 = ((String)object3).length()) != 0) {
                        object = ((Price)object).getValue();
                        Intrinsics.checkNotNull(object);
                        d5 = Double.parseDouble((String)object);
                    }
                    object = newCustomEventsRevamp.getSV_EP_COD_FEE_SLASHED();
                    bundle.putDouble((String)object, d5);
                }
            }
        }
    }

    public final String c() {
        Object object = this.a;
        Object object2 = ((wx1_1)object).S0;
        if (object2 == null || (object2 = ((Cart)object2).getPinCode()) == null) {
            object2 = "";
        }
        object = ((wx1_1)object).S0;
        if (object != null && (object = ((Cart)object).getDeliveryAddress()) != null && (object = ((CartDeliveryAddress)object).getPostalCode()) != null) {
            object2 = object;
        }
        return object2;
    }

    public final void e(String string2, Cart cart, String string3) {
        wn_1 wn_12 = this;
        Object object = string3;
        String string4 = "cartSkusId";
        Bundle bundle = dm_1.a(string2, "action", string3, string4);
        String string5 = this.b.getSV_EP_OOS_SKU();
        bundle.putString(string5, string3);
        object = "reason_to_remove";
        string5 = "oos";
        bundle.putString((String)object, string5);
        if (cart == null || (object = cart.getAge()) == null) {
            object = "";
        }
        bundle.putString("cart_age", (String)object);
        string5 = od3_2.a();
        bundle.putString("contains_store", string5);
        object = AnalyticsManager.Companion;
        String string6 = bv_0.a((AnalyticsManager$Companion)object);
        String string7 = cv_0.a((AnalyticsManager$Companion)object);
        NewCustomEventsRevamp.newPushCustomEvent$default(wn_12.b, "clear oos items interactions", string2, "", "bag_interaction", "clear oos items screen", "clear oos items screen", string6, bundle, string7, false, null, 1536, null);
    }
}

