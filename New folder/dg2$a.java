/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 */
import android.os.Bundle;
import com.google.gson.Gson;
import com.ril.ajio.analytics.AnalyticsData;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.AnalyticsManager$Companion;
import com.ril.ajio.analytics.events.GTMEvents;
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.services.data.Cart.ActionContent;
import com.ril.ajio.services.data.Cart.CartEntry;
import com.ril.ajio.services.data.Order.CartOrder;
import com.ril.ajio.services.data.Order.Consignment;
import com.ril.ajio.services.data.Order.IncentiviseHighReturnData;
import com.ril.ajio.services.data.Order.ReturnOrderItemDetails;
import com.ril.ajio.services.data.Order.ReturnOrderItemDetails$ErrorMessage;
import com.ril.ajio.services.data.Order.ReturnOrderItemDetails$ReturnedQtyMap;
import com.ril.ajio.services.data.Product.Product;
import com.ril.ajio.services.data.Product.ProductFnlColorVariantData;
import com.ril.ajio.services.data.Product.ProductOptionItem;
import com.ril.ajio.services.data.user.AffiliateData;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.b;

public final class dg2$a
implements fs0_2 {
    public final /* synthetic */ bg2_1 a;

    public dg2$a(bg2_1 bg2_12) {
        this.a = bg2_12;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final Object emit(Object var1_1, f80_0 var2_2) {
        block61: {
            var3_3 = 1;
            var4_4 = var1_1;
            var4_4 = (ReturnOrderItemDetails)((DataCallback)var1_1).getData();
            var5_5 = this.a;
            var5_5.g = var4_4;
            var6_6 = 0;
            var7_7 = null;
            if (var4_4 != null) {
                var4_4 = var4_4.getAffiliateData();
            } else {
                var8_8 = 0;
                var4_4 = null;
                var9_9 = 0.0f;
            }
            if (var4_4 == null && (var4_4 = var5_5.g) != null) {
                var10_10 = var5_5.p;
                var4_4.setAffiliateData((AffiliateData)var10_10);
            }
            if ((var4_4 = var5_5.g) != null) {
                var4_4 = var4_4.getOriginalOrderId();
            } else {
                var8_8 = 0;
                var4_4 = null;
                var9_9 = 0.0f;
            }
            if (var4_4 == null && (var4_4 = var5_5.g) != null) {
                var10_10 = var5_5.q;
                var4_4.setOriginalOrderId((String)var10_10);
            }
            if ((var4_4 = var5_5.g) == null) break block61;
            var4_4 = var5_5.Pa().F;
            if (var4_4 != null) {
                var4_4 = var4_4.getConsignment();
            } else {
                var8_8 = 0;
                var4_4 = null;
                var9_9 = 0.0f;
            }
            var10_10 = new Gson();
            var11_11 = var10_10.toJson(var4_4);
            var10_10 = (Consignment)var10_10.fromJson((String)var11_11, Consignment.class);
            var11_11 = var5_5.g;
            Intrinsics.checkNotNull(var11_11);
            var11_11 = var11_11.getMessages();
            var12_12 = null;
            if (var11_11 == null) ** GOTO lbl-1000
            var11_11 = var5_5.g;
            Intrinsics.checkNotNull(var11_11);
            var11_11 = var11_11.getMessages();
            var13_13 = var11_11.size();
            if (var13_13 <= 0) ** GOTO lbl-1000
            var11_11 = var5_5.g;
            Intrinsics.checkNotNull(var11_11);
            var11_11 = ((ReturnOrderItemDetails$ErrorMessage)var11_11.getMessages().get(0)).getKey();
            var14_14 = "error";
            var13_13 = (int)b.i((String)var11_11, (String)var14_14, (boolean)var3_3);
            if (var13_13 != 0) {
                var4_4 = var5_5.g;
                Intrinsics.checkNotNull(var4_4);
                var4_4 = ((ReturnOrderItemDetails$ErrorMessage)var4_4.getMessages().get(0)).getValue();
                var5_5 = "getValue(...)";
                Intrinsics.checkNotNullExpressionValue(var4_4, (String)var5_5);
                hv3_0.o0(var3_3, (String)var4_4, null);
            } else lbl-1000:
            // 3 sources

            {
                var11_11 = "There are no item(s) to return";
                if (var4_4 != null) {
                    var4_4 = var5_5.g;
                    Intrinsics.checkNotNull(var4_4);
                    var4_4.setConsignment((Consignment)var10_10);
                    var4_4 = var5_5.g;
                    Intrinsics.checkNotNull(var4_4);
                    var10_10 = new HashMap();
                    var14_14 = new HashMap();
                    var15_15 = var4_4.getValidReturnableProducts();
                    if (var15_15 != null && (var16_16 = (var15_15 = var4_4.getValidReturnableProducts()).size()) > 0 && (var15_15 = (Collection)var4_4.getConsignment().getEntries()) != null && (var16_16 = (int)var15_15.isEmpty()) == 0) {
                        var15_15 = var4_4.getConsignment().getEntries();
                        var16_16 = var15_15.size();
                        var18_18 = null;
                        for (var17_17 = 0; var17_17 < var16_16; var17_17 += var3_3) {
                            var19_19 = (CartEntry)bU1.a((ReturnOrderItemDetails)var4_4, var17_17);
                            var20_20 = ((CartEntry)bU1.a((ReturnOrderItemDetails)var4_4, var17_17)).getOrderEntry();
                            var21_21 = var4_4.getValidReturnableProducts();
                            var22_22 = var21_21.size();
                            var24_24 = null;
                            for (var23_23 = 0; var23_23 < var22_22; var23_23 += var3_3) {
                                var25_25 /* !! */  = var20_20.getProduct().getCode();
                                var6_6 = (int)b.i(var25_25 /* !! */ , (String)(var7_7 = (String)var4_4.getValidReturnableProducts().get(var23_23)), (boolean)var3_3);
                                if (var6_6 != 0) {
                                    var20_20.setReturnEligibleAtprodLevel((boolean)var3_3);
                                    var7_7 = var4_4.getValidReturnableProducts().get(var23_23);
                                    var14_14.put(var7_7, var19_19);
                                }
                                var6_6 = 0;
                                var7_7 = null;
                            }
                            var6_6 = 0;
                            var7_7 = null;
                        }
                    }
                    if ((var7_7 = var4_4.getValidExchangableProducts()) != null && (var6_6 = (var7_7 = var4_4.getValidExchangableProducts()).size()) > 0 && (var7_7 = var4_4.getConsignment().getEntries()) != null && (var6_6 = (var7_7 = var4_4.getConsignment().getEntries()).size()) > 0) {
                        var7_7 = var4_4.getConsignment().getEntries();
                        var6_6 = var7_7.size();
                        var15_15 = null;
                        for (var16_16 = 0; var16_16 < var6_6; var16_16 += var3_3) {
                            var18_18 = (CartEntry)bU1.a((ReturnOrderItemDetails)var4_4, var16_16);
                            var19_19 = ((CartEntry)bU1.a((ReturnOrderItemDetails)var4_4, var16_16)).getOrderEntry();
                            var20_20 = var4_4.getValidExchangableProducts();
                            var26_26 = var20_20.size();
                            var21_21 = null;
                            for (var22_22 = 0; var22_22 < var26_26; var22_22 += var3_3) {
                                var24_24 = var19_19.getProduct().getCode();
                                var23_23 = (int)b.i((String)var24_24, var25_25 /* !! */  = (String)var4_4.getValidExchangableProducts().get(var22_22), (boolean)var3_3);
                                if (var23_23 == 0) continue;
                                var24_24 = var4_4.getValidExchangableProducts().get(var22_22);
                                var23_23 = (int)var14_14.containsKey(var24_24);
                                if (var23_23 != 0) {
                                    var24_24 = var4_4.getValidExchangableProducts().get(var22_22);
                                    var24_24 = (CartEntry)var14_14.get(var24_24);
                                    Intrinsics.checkNotNull(var24_24);
                                    var24_24.getOrderEntry().setExchangeEligibleAtProdLevel((boolean)var3_3);
                                    var25_25 /* !! */  = var4_4.getValidExchangableProducts().get(var22_22);
                                    var14_14.put(var25_25 /* !! */ , var24_24);
                                    continue;
                                }
                                var19_19.setExchangeEligibleAtProdLevel((boolean)var3_3);
                                var24_24 = var4_4.getValidExchangableProducts().get(var22_22);
                                var14_14.put(var24_24, var18_18);
                            }
                        }
                    }
                    var7_7 = new ArrayList();
                    var15_15 = var14_14.entrySet();
                    var18_18 = "next(...)";
                    if (var15_15 != null && (var16_16 = (var15_15 = var14_14.entrySet()).size()) > 0) {
                        var14_14 = var14_14.entrySet().iterator();
                        while ((var16_16 = (int)var14_14.hasNext()) != 0) {
                            var15_15 = var14_14.next();
                            Intrinsics.checkNotNullExpressionValue(var15_15, (String)var18_18);
                            var15_15 = ((Map.Entry)var15_15).getValue();
                            var19_19 = "null cannot be cast to non-null type com.ril.ajio.services.data.Cart.CartEntry";
                            Intrinsics.checkNotNull(var15_15, (String)var19_19);
                            var15_15 = (CartEntry)var15_15;
                            var7_7.add((Object)var15_15);
                        }
                    }
                    var14_14 = var4_4.getConsignment();
                    var14_14.setEntries((List)var7_7);
                    var7_7 = var4_4.getValidReturnableProducts();
                    if (var7_7 != null && (var6_6 = (var7_7 = var4_4.getValidReturnableProducts()).size()) > 0) {
                        var7_7 = var4_4.getValidReturnableProducts();
                        var6_6 = var7_7.size();
                        var14_14 = null;
                        for (var27_27 = 0; var27_27 < var6_6; var27_27 += var3_3) {
                            var15_15 = var4_4.getReturnedQtyMap();
                            var16_16 = var15_15.size();
                            var19_19 = null;
                            for (var28_28 = 0; var28_28 < var16_16; var28_28 += var3_3) {
                                var20_20 = (ReturnOrderItemDetails$ReturnedQtyMap)var4_4.getReturnedQtyMap().get(var28_28);
                                var21_21 = var20_20.getKey().getValue();
                                var22_22 = (int)b.i((String)var21_21, (String)(var24_24 = (String)var4_4.getValidReturnableProducts().get(var27_27)), (boolean)var3_3);
                                if (var22_22 == 0) continue;
                                var21_21 = var4_4.getValidReturnableProducts().get(var27_27);
                                var20_20 = Integer.valueOf(var20_20.getValue().getValue());
                                var10_10.put(var21_21, var20_20);
                            }
                        }
                        var7_7 = var10_10.entrySet().iterator();
                        while ((var29_29 = var7_7.hasNext()) != 0) {
                            var10_10 = var7_7.next();
                            Intrinsics.checkNotNullExpressionValue(var10_10, (String)var18_18);
                            var10_10 = (Map.Entry)var10_10;
                            var14_14 = var4_4.getConsignment().getEntries();
                            if (var14_14 != null && (var27_27 = (var14_14 = var4_4.getConsignment().getEntries()).size()) > 0) {
                                var14_14 = var4_4.getConsignment().getEntries();
                                var27_27 = var14_14.size();
                                var15_15 = null;
                                for (var16_16 = 0; var16_16 < var27_27; var16_16 += var3_3) {
                                    var19_19 = (CartEntry)bU1.a((ReturnOrderItemDetails)var4_4, var16_16);
                                    var20_20 = ((CartEntry)bU1.a((ReturnOrderItemDetails)var4_4, var16_16)).getOrderEntry();
                                    var21_21 = var20_20.getProduct().getCode();
                                    var22_22 = (int)b.i((String)var21_21, (String)(var24_24 = (String)var10_10.getKey()), (boolean)var3_3);
                                    if (var22_22 == 0) continue;
                                    var21_21 = var20_20.getQuantity();
                                    var20_20.setOrderTotalQuantity((Integer)var21_21);
                                    var21_21 = var19_19.getQuantity();
                                    var22_22 = var21_21.intValue();
                                    if (var22_22 > 0) {
                                        var19_19 = var19_19.getQuantity();
                                        var20_20.setQuantity((Integer)var19_19);
                                        continue;
                                    }
                                    var19_19 = 0;
                                    var20_20.setQuantity((Integer)var19_19);
                                }
                            }
                            var10_10 = new ArrayList();
                            var14_14 = var4_4.getConsignment().getEntries();
                            if (var14_14 != null && (var27_27 = (var14_14 = var4_4.getConsignment().getEntries()).size()) > 0) {
                                var14_14 = var4_4.getConsignment().getEntries();
                                var27_27 = var14_14.size();
                                var15_15 = null;
                                for (var16_16 = 0; var16_16 < var27_27; var16_16 += var3_3) {
                                    var19_19 = ((CartEntry)bU1.a((ReturnOrderItemDetails)var4_4, var16_16)).getOrderEntry().getQuantity();
                                    var28_28 = var19_19.intValue();
                                    if (var28_28 <= 0) continue;
                                    var19_19 = var4_4.getConsignment().getEntries().get(var16_16);
                                    var10_10.add(var19_19);
                                }
                            }
                            var14_14 = var4_4.getConsignment();
                            var14_14.setEntries((List)var10_10);
                        }
                    } else {
                        var7_7 = var4_4.getConsignment().getEntries();
                        if (var7_7 == null || (var6_6 = (var7_7 = var4_4.getConsignment().getEntries()).size()) == 0) {
                            var7_7 = var4_4.getConsignment();
                            var10_10 = new ArrayList();
                            var7_7.setEntries((List)var10_10);
                        }
                    }
                    if ((var7_7 = var4_4.getProducts()) != null && (var7_7 = var4_4.getConsignment().getEntries()) != null && (var6_6 = (var7_7 = var4_4.getConsignment().getEntries()).size()) > 0) {
                        var7_7 = var4_4.getConsignment().getEntries();
                        var6_6 = var7_7.size();
                        var10_10 = null;
                        for (var29_29 = 0; var29_29 < var6_6; var29_29 += var3_3) {
                            var14_14 = var4_4.getProducts();
                            var27_27 = var14_14.size();
                            var15_15 = null;
                            for (var16_16 = 0; var16_16 < var27_27; var16_16 += var3_3) {
                                var18_18 = ((CartEntry)bU1.a((ReturnOrderItemDetails)var4_4, var29_29)).getOrderEntry().getProduct().getBaseProduct();
                                var17_17 = (int)b.i((String)var18_18, (String)(var19_19 = ((Product)var4_4.getProducts().get(var16_16)).getCode()), (boolean)var3_3);
                                if (var17_17 == 0 && (var17_17 = (int)b.i((String)(var18_18 = ((CartEntry)bU1.a((ReturnOrderItemDetails)var4_4, var29_29)).getOrderEntry().getProduct().getCode()), (String)(var19_19 = ((Product)var4_4.getProducts().get(var16_16)).getCode()), (boolean)var3_3)) == 0) continue;
                                var18_18 = ((CartEntry)bU1.a((ReturnOrderItemDetails)var4_4, var29_29)).getOrderEntry().getProduct();
                                var19_19 = ((Product)var4_4.getProducts().get(var16_16)).getVariantOptions();
                                var18_18.setVariantOptions((List)var19_19);
                                var18_18 = ((CartEntry)var4_4.getConsignment().getEntries().get(var29_29)).getOrderEntry().getProduct();
                                var19_19 = ((Product)var4_4.getProducts().get(var16_16)).getFnlColorVariantData();
                                var18_18.setFnlColorVariantData((ProductFnlColorVariantData)var19_19);
                                var18_18 = ((CartEntry)var4_4.getConsignment().getEntries().get(var29_29)).getOrderEntry();
                                var19_19 = "getOrderEntry(...)";
                                Intrinsics.checkNotNullExpressionValue(var18_18, (String)var19_19);
                                var20_20 = ((CartEntry)var4_4.getConsignment().getEntries().get(var29_29)).getOrderEntry().getProduct().getVariantOptions();
                                if (var20_20 != null) {
                                    var20_20 = var20_20.iterator();
                                    while ((var22_22 = (int)var20_20.hasNext()) != 0) {
                                        var21_21 = (ProductOptionItem)var20_20.next();
                                        if (var21_21 == null || (var24_24 = var21_21.getStock()) == null) continue;
                                        var21_21 = var21_21.getStock();
                                        Intrinsics.checkNotNull(var21_21);
                                        if ((var21_21 = var21_21.getStockLevel()) != null && (var22_22 = var21_21.intValue()) == 0) continue;
                                        break;
                                    }
                                } else {
                                    var18_18.setExchangeEligibleAtProdLevel(false);
                                }
                                var18_18 = ((CartEntry)bU1.a((ReturnOrderItemDetails)var4_4, var29_29)).getOrderEntry();
                                Intrinsics.checkNotNullExpressionValue(var18_18, (String)var19_19);
                                var19_19 = var4_4.getOrderCode();
                                Intrinsics.checkNotNullExpressionValue(var19_19, "getOrderCode(...)");
                                var20_20 = "EX";
                                var28_28 = (int)b.s((String)var19_19, (String)var20_20, false);
                                if (var28_28 == 0) continue;
                                var18_18.setExchangeEligibleAtProdLevel(false);
                            }
                        }
                    }
                    var4_4 = var5_5.g;
                    Intrinsics.checkNotNull(var4_4);
                    var4_4 = var4_4.getConsignment().getEntries();
                    var8_8 = var4_4.size();
                    if (var8_8 == 0) {
                        var8_8 = 0;
                        var9_9 = 0.0f;
                        var4_4 = null;
                        hv3_0.o0(var3_3, (String)var11_11, null);
                    } else {
                        var4_4 = (CartOrder)var5_5.Pa().l.getValue();
                        if (var4_4 != null) {
                            var4_4 = var4_4.getDeliveryModeValue();
                        } else {
                            var8_8 = 0;
                            var9_9 = 0.0f;
                            var4_4 = null;
                        }
                        var7_7 = "store-pickup";
                        var8_8 = (int)Intrinsics.areEqual(var7_7, var4_4);
                        if (var8_8 != 0 && (var4_4 = var5_5.g) != null) {
                            var4_4.setStorePickUp((boolean)var3_3);
                        }
                        var4_4 = new Bundle();
                        var7_7 = var5_5.g;
                        Intrinsics.checkNotNull(var7_7);
                        var7_7 = var7_7.getValidReturnableProducts();
                        var10_10 = "product_id";
                        if (var7_7 != null) {
                            var7_7 = var5_5.g;
                            Intrinsics.checkNotNull(var7_7);
                            var7_7 = var7_7.getValidReturnableProducts();
                            var6_6 = var7_7.size();
                            if (var6_6 > 0) {
                                var7_7 = var5_5.g;
                                Intrinsics.checkNotNull(var7_7);
                                var7_7 = var7_7.getValidReturnableProducts().get(0);
                                if (var7_7 != null) {
                                    var7_7 = var5_5.g;
                                    Intrinsics.checkNotNull(var7_7);
                                    var7_7 = ((String)var7_7.getValidReturnableProducts().get(0)).toString();
                                    var4_4.putString((String)var10_10, (String)var7_7);
                                }
                            }
                        }
                        var7_7 = var5_5.g;
                        Intrinsics.checkNotNull(var7_7);
                        var7_7 = var7_7.getOrderCode();
                        var11_11 = "order_id";
                        var4_4.putString((String)var11_11, (String)var7_7);
                        var6_6 = (int)h40_0.l1();
                        if (var6_6 == 0) {
                            var19_19 = ne_0.b((Bundle)var4_4);
                            var4_4 = AnalyticsManager.Companion.getInstance();
                            var12_12 = var4_4.getGtmEvents();
                            var22_22 = 16;
                            var23_23 = 0;
                            var24_24 = null;
                            var14_14 = "Return order";
                            var15_15 = "returnorderbuttonclick";
                            var18_18 = "order details screen";
                            var26_26 = 0;
                            var20_20 = null;
                            GTMEvents.pushButtonTapEvent$default((GTMEvents)var12_12, (String)var14_14, var15_15, (String)var18_18, (AnalyticsData)var19_19, null, var22_22, null);
                        }
                        var4_4 = var5_5.g;
                        Intrinsics.checkNotNull(var4_4);
                        var4_4 = var4_4.getDeliveryAddress();
                        if (var4_4 != null) {
                            var4_4 = var5_5.g;
                            Intrinsics.checkNotNull(var4_4);
                            var4_4.getDeliveryAddress().setDefaultAddress((boolean)var3_3);
                            var30_30 = var5_5.g;
                            Intrinsics.checkNotNull(var30_30);
                            var4_4 = var5_5.g;
                            Intrinsics.checkNotNull(var4_4);
                            var4_4 = var4_4.getDeliveryAddress().getId();
                            var30_30.setDefaultAddressId((String)var4_4);
                        }
                        var30_30 = var5_5.g;
                        var4_4 = (DataCallback)var5_5.Pa().k0.d();
                        var12_12 = var4_4 != null && (var4_4 = (IncentiviseHighReturnData)var4_4.getData()) != null && (var4_4 = var4_4.getResult()) != null && (var4_4 = var4_4.getPOST_ORDER_RETURN_FEE()) != null ? (var4_4 = var4_4.getActionContent()) : null;
                        var4_4 = h40_0.a;
                        var8_8 = (int)h40_0.f2();
                        if (var8_8 != 0) {
                            var4_4 = var5_5.Pa();
                            var8_8 = var4_4.A0;
                            if (var8_8 > 0 && var30_30 != null) {
                                if (var12_12 != null) {
                                    var8_8 = var5_5.Pa().A0;
                                    var9_9 = var8_8;
                                    var31_31 = Float.valueOf(var9_9);
                                    var32_32 = var30_30.getOrderCode();
                                    var4_4 = var5_5.Pa().g;
                                    var33_33 = var4_4 != null || (var4_4 = var30_30.getValidReturnableProducts()) != null && (var4_4 = (String)CollectionsKt.firstOrNull((List)var4_4)) != null ? var4_4 : null;
                                    var27_27 = 0;
                                    var14_14 = null;
                                    var16_16 = 0;
                                    var15_15 = null;
                                    var17_17 = 0;
                                    var18_18 = null;
                                    var28_28 = 0;
                                    var19_19 = null;
                                    var26_26 = 0;
                                    var20_20 = null;
                                    var22_22 = 0;
                                    var21_21 = null;
                                    var23_23 = 0;
                                    var24_24 = null;
                                    var25_25 /* !! */  = null;
                                    var34_34 = 0x1FBFFFF;
                                    var4_4 = ActionContent.copy$default((ActionContent)var12_12, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, var31_31, null, null, null, null, null, null, var32_32, (String)var33_33, var34_34, null);
                                } else {
                                    var8_8 = 0;
                                    var9_9 = 0.0f;
                                    var4_4 = null;
                                }
                                var30_30.setActionContent((ActionContent)var4_4);
                            }
                        }
                        var30_30 = new Bundle();
                        var8_8 = (int)h40_0.l1();
                        if (var8_8 == 0) {
                            var4_4 = AnalyticsManager.Companion;
                            var7_7 = "consolidated order details screen";
                            var12_12 = "Return order";
                            var14_14 = "returnorderbuttonclick";
                            tj2_0.e((AnalyticsManager$Companion)var4_4, (String)var12_12, (String)var14_14, (String)var7_7);
                        }
                        var7_7 = var5_5.g;
                        var30_30.putSerializable("RETURN_ITEMS_DATA", (Serializable)var7_7);
                        var4_4 = (Serializable)var5_5.Pa().A.getValue();
                        var30_30.putSerializable("GIFTS_ITEMS_DATA", (Serializable)var4_4);
                        var4_4 = var5_5.Pa().x0;
                        var7_7 = "IS_FROM_JOUNRNEY";
                        var30_30.putString((String)var7_7, (String)var4_4);
                        var4_4 = var5_5.Pa().g;
                        var30_30.putString((String)var10_10, (String)var4_4);
                        var4_4 = var5_5.Pa().F;
                        if (var4_4 != null) {
                            var4_4 = var4_4.getOrderStatus();
                        } else {
                            var8_8 = 0;
                            var9_9 = 0.0f;
                            var4_4 = null;
                        }
                        var12_12 = "order_status";
                        var30_30.putString((String)var12_12, (String)var4_4);
                        var4_4 = var5_5.Pa().F;
                        if (var4_4 != null && (var4_4 = var4_4.getCartEntry()) != null) {
                            var4_4 = var4_4.getOrderId();
                        } else {
                            var8_8 = 0;
                            var9_9 = 0.0f;
                            var4_4 = null;
                        }
                        var30_30.putString((String)var11_11, (String)var4_4);
                        var8_8 = (int)h40_0.l1();
                        if (var8_8 != 0) {
                            var4_4 = var5_5.Pa().x0;
                            var30_30.putString((String)var7_7, (String)var4_4);
                            var4_4 = var5_5.Pa().g;
                            var30_30.putString((String)var10_10, (String)var4_4);
                            var4_4 = var5_5.Pa().z0;
                            var30_30.putString((String)var12_12, (String)var4_4);
                            var4_4 = var5_5.Pa().y0;
                            var30_30.putString((String)var11_11, (String)var4_4);
                            var4_4 = (Pair)var5_5.Pa().X.d();
                            var7_7 = "";
                            if (var4_4 == null || (var4_4 = (String)var4_4.a) == null) {
                                var4_4 = var7_7;
                            }
                            var10_10 = "non_refundable_fee";
                            var30_30.putString((String)var10_10, (String)var4_4);
                            var4_4 = (Pair)var5_5.Pa().Y.d();
                            if (var4_4 != null && (var4_4 = (String)var4_4.a) != null) {
                                var7_7 = var4_4;
                            }
                            var30_30.putString("discounts", (String)var7_7);
                            var4_4 = "return_percentage";
                            var7_7 = "10";
                            var30_30.putString((String)var4_4, (String)var7_7);
                        }
                        var4_4 = var5_5.j;
                        Intrinsics.checkNotNull(var4_4);
                        var5_5 = "OrderSummaryFragment";
                        var6_6 = 924;
                        var4_4.onFragmentInteraction((String)var5_5, var6_6, (Bundle)var30_30);
                    }
                } else {
                    var8_8 = 0;
                    var4_4 = null;
                    var9_9 = 0.0f;
                    hv3_0.o0(var3_3, (String)var11_11, null);
                }
            }
        }
        return Unit.a;
    }
}

