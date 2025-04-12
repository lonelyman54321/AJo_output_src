/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 */
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.ajio.ril.core.network.model.DataError$ErrorMessage;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.AnalyticsManager$Companion;
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.services.data.Cart.CartEntry;
import com.ril.ajio.services.data.Order.Consignment;
import com.ril.ajio.services.data.Order.ReturnOrderItemDetails;
import com.ril.ajio.services.data.Order.ReturnOrderItemDetails$ErrorMessage;
import com.ril.ajio.services.data.Order.ReturnOrderItemDetails$ReturnedQtyMap;
import com.ril.ajio.services.data.Product.Product;
import com.ril.ajio.services.data.Product.ProductFnlColorVariantData;
import com.ril.ajio.services.data.Product.ProductOptionItem;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.b;

/*
 * Renamed from yY1
 */
public final class yy1_2
implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ yy1_2(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    /*
     * Unable to fully structure code
     */
    public final Object invoke(Object var1_1) {
        var2_2 = this.a;
        switch (var2_2) {
            default: {
                var3_3 = var1_1;
                var3_3 = (DataCallback)var1_1;
                var4_5 = (yn2_2)this.b;
                Intrinsics.checkNotNullParameter(var4_5, "this$0");
                Intrinsics.checkNotNullParameter(var3_3, "returnOrderItemDetailsDataCallback");
                var5_6 = cp_1.Companion;
                var6_8 = nn_2.b((cp$a)var5_6, (DataCallback)var3_3);
                if (var6_8 == 0) ** GOTO lbl354
                var6_8 = var3_3.getStatus();
                var7_9 = 0;
                var8_10 = null;
                var9_11 = 1;
                var10_12 = "requireActivity(...)";
                if (var6_8 != 0) ** GOTO lbl340
                var4_5.k = var3_3 = (ReturnOrderItemDetails)var3_3.getData();
                if (var3_3 == null) ** GOTO lbl354
                Intrinsics.checkNotNull(var3_3);
                var3_3 = var3_3.getMessages();
                if (var3_3 == null) ** GOTO lbl47
                var3_3 = var4_5.k;
                Intrinsics.checkNotNull(var3_3);
                var3_3 = var3_3.getMessages();
                var5_6 = "getMessages(...)";
                Intrinsics.checkNotNullExpressionValue(var3_3, (String)var5_6);
                var2_2 = var3_3.isEmpty() ^ var9_11;
                if (var2_2 == 0) ** GOTO lbl47
                var3_3 = var4_5.k;
                Intrinsics.checkNotNull(var3_3);
                var3_3 = ((ReturnOrderItemDetails$ErrorMessage)var3_3.getMessages().get(0)).getKey();
                var5_6 = "error";
                var2_2 = (int)kotlin.text.b.i((String)var3_3, (String)var5_6, (boolean)var9_11);
                if (var2_2 == 0) ** GOTO lbl47
                var3_3 = var4_5.n;
                Intrinsics.checkNotNull(var3_3);
                var5_6 = var4_5.requireActivity();
                Intrinsics.checkNotNullExpressionValue(var5_6, var10_12);
                var4_5 = var4_5.k;
                Intrinsics.checkNotNull(var4_5);
                var4_5 = ((ReturnOrderItemDetails$ErrorMessage)var4_5.getMessages().get(0)).getValue();
                var8_10 = "getValue(...)";
                Intrinsics.checkNotNullExpressionValue(var4_5, (String)var8_10);
                j3$a.b((j3_0)var3_3, (FragmentActivity)var5_6, (String)var4_5);
                ** GOTO lbl354
lbl47:
                // 3 sources

                var3_3 = var4_5.i;
                var5_6 = "There are no item(s) to return";
                if (var3_3 == null) ** GOTO lbl334
                Intrinsics.checkNotNull(var3_3);
                var11_13 = var4_5.j;
                var3_3.setShipmentName((String)var11_13);
                var3_3 = var4_5.k;
                Intrinsics.checkNotNull(var3_3);
                var11_13 = var4_5.i;
                var3_3.setConsignment((Consignment)var11_13);
                var3_3 = var4_5.k;
                var11_13 = new HashMap();
                var12_14 = new Object();
                if (var3_3 == null) ** GOTO lbl294
                var13_15 = var3_3.getValidReturnableProducts();
                var14_16 = "getEntries(...)";
                var15_17 = "getValidReturnableProducts(...)";
                if (var13_15 != null) {
                    var13_15 = var3_3.getValidReturnableProducts();
                    Intrinsics.checkNotNullExpressionValue(var13_15, (String)var15_17);
                    var16_18 = var13_15.isEmpty() ^ var9_11;
                    if (var16_18 != 0 && (var13_15 = var3_3.getConsignment().getEntries()) != null) {
                        var13_15 = var3_3.getConsignment().getEntries();
                        Intrinsics.checkNotNullExpressionValue(var13_15, (String)var14_16);
                        var13_15 = (Collection)var13_15;
                        var16_18 = var13_15.isEmpty() ^ var9_11;
                        if (var16_18 != 0) {
                            var13_15 = var3_3.getConsignment().getEntries();
                            var16_18 = var13_15.size();
                            var18_20 = null;
                            for (var17_19 = 0; var17_19 < var16_18; ++var17_19) {
                                var19_21 = (CartEntry)bU1.a((ReturnOrderItemDetails)var3_3, var17_19);
                                var20_22 = ((CartEntry)bU1.a((ReturnOrderItemDetails)var3_3, var17_19)).getOrderEntry();
                                var21_23 = var3_3.getValidReturnableProducts();
                                var22_24 = var21_23.size();
                                while (var7_9 < var22_24) {
                                    var23_25 = var20_22.getProduct();
                                    var24_26 = var23_25.getCode();
                                    var25_27 = var16_18;
                                    var13_15 = (String)var3_3.getValidReturnableProducts().get(var7_9);
                                    var26_28 = var22_24;
                                    var22_24 = 1;
                                    var9_11 = (int)kotlin.text.b.i((String)var24_26, (String)var13_15, (boolean)var22_24);
                                    if (var9_11 != 0) {
                                        var20_22.setReturnEligibleAtprodLevel((boolean)var22_24);
                                        var24_26 = var3_3.getValidReturnableProducts().get(var7_9);
                                        var12_14.put(var24_26, var19_21);
                                    }
                                    ++var7_9;
                                    var16_18 = var25_27;
                                    var22_24 = var26_28;
                                    var9_11 = 1;
                                }
                                var25_27 = var16_18;
                                var7_9 = 0;
                                var8_10 = null;
                                var9_11 = 1;
                            }
                        }
                    }
                }
                if ((var8_10 = var3_3.getValidExchangableProducts()) != null) {
                    var8_10 = var3_3.getValidExchangableProducts();
                    var24_26 = "getValidExchangableProducts(...)";
                    Intrinsics.checkNotNullExpressionValue(var8_10, (String)var24_26);
                    var7_9 = (int)var8_10.isEmpty();
                    var9_11 = 1;
                    if ((var7_9 ^= var9_11) != 0 && (var8_10 = var3_3.getConsignment().getEntries()) != null) {
                        var8_10 = var3_3.getConsignment().getEntries();
                        Intrinsics.checkNotNullExpressionValue(var8_10, (String)var14_16);
                        var8_10 = (Collection)var8_10;
                        var7_9 = var8_10.isEmpty() ^ var9_11;
                        if (var7_9 != 0) {
                            var8_10 = var3_3.getConsignment().getEntries();
                            var7_9 = var8_10.size();
                            var24_26 = null;
                            for (var9_11 = 0; var9_11 < var7_9; ++var9_11) {
                                var13_15 = (CartEntry)bU1.a((ReturnOrderItemDetails)var3_3, var9_11);
                                var14_16 = ((CartEntry)bU1.a((ReturnOrderItemDetails)var3_3, var9_11)).getOrderEntry();
                                var18_20 = var3_3.getValidExchangableProducts();
                                var17_19 = var18_20.size();
                                var19_21 = null;
                                for (var27_29 = 0; var27_29 < var17_19; ++var27_29) {
                                    var20_22 = var14_16.getProduct().getCode();
                                    var21_23 = (String)var3_3.getValidExchangableProducts().get(var27_29);
                                    var25_27 = var7_9;
                                    var7_9 = 1;
                                    var28_30 = kotlin.text.b.i((String)var20_22, (String)var21_23, (boolean)var7_9);
                                    if (var28_30) {
                                        var8_10 = var3_3.getValidExchangableProducts().get(var27_29);
                                        var7_9 = (int)var12_14.containsKey(var8_10);
                                        if (var7_9 != 0) {
                                            var8_10 = var3_3.getValidExchangableProducts().get(var27_29);
                                            var8_10 = (CartEntry)var12_14.get(var8_10);
                                            Intrinsics.checkNotNull(var8_10);
                                            var20_22 = var8_10.getOrderEntry();
                                            var22_24 = 1;
                                            var20_22.setExchangeEligibleAtProdLevel((boolean)var22_24);
                                            var20_22 = var3_3.getValidExchangableProducts().get(var27_29);
                                            var12_14.put(var20_22, var8_10);
                                        } else {
                                            var22_24 = 1;
                                            var14_16.setExchangeEligibleAtProdLevel((boolean)var22_24);
                                            var8_10 = var3_3.getValidExchangableProducts().get(var27_29);
                                            var12_14.put(var8_10, var13_15);
                                        }
                                    }
                                    var7_9 = var25_27;
                                }
                                var25_27 = var7_9;
                            }
                        }
                    }
                }
                var8_10 = new ArrayList();
                var24_26 = var12_14.entrySet().iterator();
                while (true) {
                    var29_31 = var24_26.hasNext();
                    var13_15 = "next(...)";
                    if (var29_31 == 0) break;
                    var12_14 = var24_26.next();
                    Intrinsics.checkNotNullExpressionValue(var12_14, (String)var13_15);
                    var12_14 = (Map.Entry)var12_14;
                    if (var12_14 == null) continue;
                    var12_14 = var12_14.getValue();
                    var13_15 = "null cannot be cast to non-null type com.ril.ajio.services.data.Cart.CartEntry";
                    Intrinsics.checkNotNull(var12_14, (String)var13_15);
                    var12_14 = (CartEntry)var12_14;
                    var8_10.add(var12_14);
                }
                var24_26 = var3_3.getConsignment();
                var24_26.setEntries((List)var8_10);
                var8_10 = var3_3.getValidReturnableProducts();
                if (var8_10 == null) ** GOTO lbl-1000
                var8_10 = var3_3.getValidReturnableProducts();
                Intrinsics.checkNotNullExpressionValue(var8_10, (String)var15_17);
                var7_9 = var8_10.isEmpty();
                var9_11 = 1;
                if ((var7_9 ^= var9_11) != 0) {
                    var8_10 = var3_3.getValidReturnableProducts();
                    var7_9 = var8_10.size();
                    var24_26 = null;
                    for (var9_11 = 0; var9_11 < var7_9; ++var9_11) {
                        var12_14 = var3_3.getReturnedQtyMap();
                        var29_31 = var12_14.size();
                        var14_16 = null;
                        for (var30_32 = 0; var30_32 < var29_31; ++var30_32) {
                            var15_17 = (ReturnOrderItemDetails$ReturnedQtyMap)var3_3.getReturnedQtyMap().get(var30_32);
                            var18_20 = var15_17.getKey().getValue();
                            var17_19 = (int)kotlin.text.b.i((String)var18_20, (String)(var19_21 = (String)var3_3.getValidReturnableProducts().get(var9_11)), var28_30 = true);
                            if (var17_19 == 0) continue;
                            var18_20 = var3_3.getValidReturnableProducts().get(var9_11);
                            var15_17 = Integer.valueOf(var15_17.getValue().getValue());
                            var11_13.put(var18_20, var15_17);
                        }
                    }
                    var8_10 = var11_13.entrySet().iterator();
                    while ((var9_11 = (int)var8_10.hasNext()) != 0) {
                        var24_26 = var8_10.next();
                        Intrinsics.checkNotNullExpressionValue(var24_26, (String)var13_15);
                        var24_26 = (Map.Entry)var24_26;
                        if (var24_26 == null) continue;
                        var11_13 = var3_3.getConsignment().getEntries();
                        var31_33 = var11_13.size();
                        var12_14 = null;
                        for (var29_31 = 0; var29_31 < var31_33; ++var29_31) {
                            var14_16 = (CartEntry)bU1.a((ReturnOrderItemDetails)var3_3, var29_31);
                            var15_17 = ((CartEntry)bU1.a((ReturnOrderItemDetails)var3_3, var29_31)).getOrderEntry();
                            var18_20 = var15_17.getProduct().getCode();
                            var17_19 = (int)kotlin.text.b.i((String)var18_20, (String)(var19_21 = (String)var24_26.getKey()), var28_30 = true);
                            if (var17_19 == 0) continue;
                            var18_20 = var15_17.getQuantity();
                            var15_17.setOrderTotalQuantity((Integer)var18_20);
                            var18_20 = var14_16.getQuantity();
                            var17_19 = var18_20.intValue();
                            if (var17_19 > 0) {
                                var14_16 = var14_16.getQuantity();
                                var15_17.setQuantity((Integer)var14_16);
                                continue;
                            }
                            var30_32 = 0;
                            var14_16 = null;
                            var18_20 = 0;
                            var15_17.setQuantity((Integer)var18_20);
                        }
                        var24_26 = new ArrayList<Object>();
                        var11_13 = var3_3.getConsignment().getEntries();
                        var31_33 = var11_13.size();
                        var12_14 = null;
                        for (var29_31 = 0; var29_31 < var31_33; ++var29_31) {
                            var14_16 = ((CartEntry)bU1.a((ReturnOrderItemDetails)var3_3, var29_31)).getOrderEntry().getQuantity();
                            var30_32 = var14_16.intValue();
                            if (var30_32 <= 0) continue;
                            var14_16 = var3_3.getConsignment().getEntries().get(var29_31);
                            var24_26.add(var14_16);
                        }
                        var11_13 = var3_3.getConsignment();
                        var11_13.setEntries(var24_26);
                    }
                } else if ((var8_10 = var3_3.getConsignment().getEntries()) == null || (var7_9 = (var8_10 = var3_3.getConsignment().getEntries()).isEmpty()) != 0) {
                    var8_10 = var3_3.getConsignment();
                    var24_26 = new ArrayList<Object>();
                    var8_10.setEntries(var24_26);
                }
                if ((var8_10 = var3_3.getProducts()) == null) ** GOTO lbl294
                var8_10 = var3_3.getConsignment().getEntries();
                var7_9 = var8_10.size();
                var14_16 = null;
                for (var30_32 = 0; var30_32 < var7_9; ++var30_32) {
                    var24_26 = var3_3.getProducts();
                    var9_11 = var24_26.size();
                    var11_13 = null;
                    for (var31_33 = 0; var31_33 < var9_11; ++var31_33) {
                        var12_14 = ((CartEntry)bU1.a((ReturnOrderItemDetails)var3_3, var30_32)).getOrderEntry().getProduct().getBaseProduct();
                        var29_31 = (int)kotlin.text.b.i((String)var12_14, (String)(var13_15 = ((Product)var3_3.getProducts().get(var31_33)).getCode()), var32_34 = true);
                        if (var29_31 == 0 && (var29_31 = (int)kotlin.text.b.i((String)(var12_14 = ((CartEntry)bU1.a((ReturnOrderItemDetails)var3_3, var30_32)).getOrderEntry().getProduct().getCode()), (String)(var13_15 = ((Product)var3_3.getProducts().get(var31_33)).getCode()), var32_34)) == 0) continue;
                        var12_14 = ((CartEntry)bU1.a((ReturnOrderItemDetails)var3_3, var30_32)).getOrderEntry().getProduct();
                        var13_15 = ((Product)var3_3.getProducts().get(var31_33)).getVariantOptions();
                        var12_14.setVariantOptions((List)var13_15);
                        var12_14 = ((CartEntry)var3_3.getConsignment().getEntries().get(var30_32)).getOrderEntry().getProduct();
                        var13_15 = ((Product)var3_3.getProducts().get(var31_33)).getFnlColorVariantData();
                        var12_14.setFnlColorVariantData((ProductFnlColorVariantData)var13_15);
                        var12_14 = ((CartEntry)var3_3.getConsignment().getEntries().get(var30_32)).getOrderEntry().getProduct().getVariantOptions();
                        var13_15 = "getOrderEntry(...)";
                        if (var12_14 != null) {
                            var15_17 = ((CartEntry)bU1.a((ReturnOrderItemDetails)var3_3, var30_32)).getOrderEntry();
                            Intrinsics.checkNotNullExpressionValue(var15_17, (String)var13_15);
                            var12_14 = var12_14.iterator();
                            while ((var17_19 = (int)var12_14.hasNext()) != 0) {
                                var18_20 = (ProductOptionItem)var12_14.next();
                                var19_21 = var18_20.getStock();
                                if (var19_21 == null) continue;
                                var18_20 = var18_20.getStock();
                                Intrinsics.checkNotNull(var18_20);
                                if ((var18_20 = var18_20.getStockLevel()) != null && (var17_19 = var18_20.intValue()) == 0) continue;
                                ** GOTO lbl282
                            }
                            var17_19 = 0;
                            var18_20 = null;
                            var15_17.setExchangeEligibleAtProdLevel(false);
                        }
lbl282:
                        // 4 sources

                        var12_14 = ((CartEntry)bU1.a((ReturnOrderItemDetails)var3_3, var30_32)).getOrderEntry();
                        Intrinsics.checkNotNullExpressionValue(var12_14, (String)var13_15);
                        var13_15 = var3_3.getOrderCode();
                        Intrinsics.checkNotNullExpressionValue(var13_15, "getOrderCode(...)");
                        var15_17 = "EX";
                        var17_19 = 0;
                        var18_20 = null;
                        var16_18 = (int)kotlin.text.b.s((String)var13_15, (String)var15_17, false);
                        if (var16_18 == 0) continue;
                        var12_14.setExchangeEligibleAtProdLevel(false);
                    }
                }
lbl294:
                // 3 sources

                var3_3 = var4_5.k;
                Intrinsics.checkNotNull(var3_3);
                var3_3 = var3_3.getConsignment().getEntries();
                var2_2 = (int)var3_3.isEmpty();
                if (var2_2 != 0) {
                    var3_3 = var4_5.n;
                    Intrinsics.checkNotNull(var3_3);
                    var4_5 = var4_5.requireActivity();
                    Intrinsics.checkNotNullExpressionValue(var4_5, var10_12);
                    j3$a.b((j3_0)var3_3, (FragmentActivity)var4_5, (String)var5_6);
                } else {
                    var3_3 = var4_5.h;
                    if (var3_3 != null) {
                        var3_3 = var3_3.getDeliveryModeValue();
                    } else {
                        var2_2 = 0;
                        var3_3 = null;
                    }
                    var5_6 = "store-pickup";
                    var2_2 = (int)Intrinsics.areEqual(var5_6, var3_3);
                    if (var2_2 != 0 && (var3_3 = var4_5.k) != null) {
                        var6_8 = 1;
                        var3_3.setStorePickUp((boolean)var6_8);
                    }
                    var3_3 = new Bundle();
                    var5_6 = AnalyticsManager.Companion;
                    var24_26 = "Return order";
                    var10_12 = "returnorderbuttonclick";
                    tj2_0.e((AnalyticsManager$Companion)var5_6, (String)var24_26, var10_12, "order details screen");
                    var5_6 = "RETURN_ITEMS_DATA";
                    var8_10 = var4_5.k;
                    var3_3.putSerializable((String)var5_6, (Serializable)var8_10);
                    var6_8 = (int)h40_0.l1();
                    if (var6_8 != 0) {
                        var5_6 = var4_5.Qa().x;
                        var8_10 = "IS_FROM_JOUNRNEY";
                        var3_3.putString((String)var8_10, (String)var5_6);
                    }
                    if ((var4_5 = var4_5.l) != null) {
                        var5_6 = "OrderListItemDetailFragment";
                        var7_9 = 924;
                        var4_5.onFragmentInteraction((String)var5_6, var7_9, (Bundle)var3_3);
                    }
                }
                ** GOTO lbl354
lbl334:
                // 1 sources

                var3_3 = var4_5.n;
                Intrinsics.checkNotNull(var3_3);
                var4_5 = var4_5.requireActivity();
                Intrinsics.checkNotNullExpressionValue(var4_5, var10_12);
                j3$a.b((j3_0)var3_3, (FragmentActivity)var4_5, (String)var5_6);
                ** GOTO lbl354
lbl340:
                // 1 sources

                var6_8 = var3_3.getStatus();
                if (var6_8 == (var7_9 = 1)) {
                    var5_6 = var4_5.n;
                    Intrinsics.checkNotNull(var5_6);
                    var4_5 = var4_5.requireActivity();
                    Intrinsics.checkNotNullExpressionValue(var4_5, var10_12);
                    var3_3 = var3_3.getError();
                    Intrinsics.checkNotNull(var3_3);
                    var3_3 = var3_3.getErrors();
                    var7_9 = 0;
                    var3_3 = ((DataError$ErrorMessage)var3_3.get(0)).getMessage();
                    var8_10 = "getMessage(...)";
                    Intrinsics.checkNotNullExpressionValue(var3_3, (String)var8_10);
                    j3$a.b((j3_0)var5_6, (FragmentActivity)var4_5, (String)var3_3);
                }
lbl354:
                // 9 sources

                return Unit.a;
            }
            case 0: 
        }
        var3_4 = var1_1;
        var3_4 = (DataCallback)var1_1;
        var5_7 = (ky1_0)this.b;
        Intrinsics.checkNotNullParameter(var5_7, "this$0");
        var5_7.H.k(var3_4);
        return Unit.a;
    }
}

