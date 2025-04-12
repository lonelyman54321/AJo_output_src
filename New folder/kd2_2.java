/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 */
import android.text.TextUtils;
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.services.data.Cart.CartDeliveryAddress;
import com.ril.ajio.services.data.Cart.CartEntry;
import com.ril.ajio.services.data.Order.CartOrder;
import com.ril.ajio.services.data.Order.IncentiviseHighReturnData;
import com.ril.ajio.services.data.Order.SelectedOrderItem;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;

/*
 * Renamed from kd2
 */
public final class kd2_2
implements Function1 {
    public final /* synthetic */ List a;
    public final /* synthetic */ Ref$ObjectRef b;
    public final /* synthetic */ Ref$ObjectRef c;
    public final /* synthetic */ qz1_2 d;
    public final /* synthetic */ Ref$ObjectRef e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ DataCallback i;
    public final /* synthetic */ CartOrder j;
    public final /* synthetic */ p83_0 k;
    public final /* synthetic */ yT1 l;
    public final /* synthetic */ CartDeliveryAddress m;
    public final /* synthetic */ ft1_2 n;

    public /* synthetic */ kd2_2(List list, Ref$ObjectRef ref$ObjectRef, Ref$ObjectRef ref$ObjectRef2, qz1_2 qz1_22, Ref$ObjectRef ref$ObjectRef3, boolean bl2, boolean bl3, boolean bl4, DataCallback dataCallback, CartOrder cartOrder, p83_0 p83_02, yT1 yT12, CartDeliveryAddress cartDeliveryAddress, ft1_2 ft1_22) {
        this.a = list;
        this.b = ref$ObjectRef;
        this.c = ref$ObjectRef2;
        this.d = qz1_22;
        this.e = ref$ObjectRef3;
        this.f = bl2;
        this.g = bl3;
        this.h = bl4;
        this.i = dataCallback;
        this.j = cartOrder;
        this.k = p83_02;
        this.l = yT12;
        this.m = cartDeliveryAddress;
        this.n = ft1_22;
    }

    /*
     * Unable to fully structure code
     */
    public final Object invoke(Object var1_1) {
        block45: {
            block44: {
                var2_2 = this;
                var3_3 = var1_1;
                var3_3 = (dt1_0)var1_1;
                var4_4 = this.a;
                Intrinsics.checkNotNullParameter(var4_4, "$selectedOrdersList");
                var5_5 = this.b;
                Intrinsics.checkNotNullParameter(var5_5, "$selectedOrderItemSingle");
                var6_6 = this.c;
                Intrinsics.checkNotNullParameter(var6_6, "$cartEntry");
                var7_7 = this.d;
                Intrinsics.checkNotNullParameter(var7_7, "$viewModel");
                var8_8 = this.e;
                Intrinsics.checkNotNullParameter(var8_8, "$product");
                var9_9 = this.k;
                Intrinsics.checkNotNullParameter(var9_9, "$otherProductEntries");
                var10_10 = this.l;
                Intrinsics.checkNotNullParameter(var10_10, "$navController");
                var11_11 = this.n;
                Intrinsics.checkNotNullParameter(var11_11, "$lazyListState");
                Intrinsics.checkNotNullParameter(var3_3, "$this$LazyColumn");
                var13_13 = var12_12 = CollectionsKt.firstOrNull(var4_4);
                var5_5.element = var13_13 = (SelectedOrderItem)var12_12;
                var7_7.getClass();
                var6_6.element = var5_5 = qz1_2.l((SelectedOrderItem)var13_13);
                var14_14 = 0;
                var15_15 = null;
                if (var5_5 != null) {
                    var5_5 = var5_5.getProduct();
                } else {
                    var16_16 = 0;
                    var5_5 = null;
                }
                var8_8.element = var5_5;
                var17_17 = var2_2.f;
                var18_18 = 1;
                if (var17_17 == 0) {
                    var12_12 = new De2$o(var7_7, (SelectedOrderItem)var13_13);
                    var19_19 = new u10(-354135134, var12_12, (boolean)var18_18);
                    var16_16 = 3;
                    bt1.a((dt1_0)var3_3, null, (gx0_2)var19_19, var16_16);
                }
                var19_19 = var2_2.j;
                var12_12 = var5_5;
                var20_20 = var19_19;
                var19_19 = var8_8;
                var21_21 = var9_9;
                var22_22 = true;
                var23_23 = var7_7;
                var24_24 = var13_13;
                var15_15 = var20_20;
                var25_25 = var13_13;
                var26_26 = var17_17;
                var5_5 = new De2$p(var8_8, var7_7, (SelectedOrderItem)var13_13, (Ref$ObjectRef)var6_6, (CartOrder)var20_20, (boolean)var17_17);
                var27_27 = 1764484957;
                var12_12 = new u10(var27_27, var5_5, var22_22);
                var16_16 = 3;
                var26_26 = 0;
                var13_13 = null;
                bt1.a((dt1_0)var3_3, null, (gx0_2)var12_12, var16_16);
                var28_28 = false;
                var14_14 = var17_17;
                if (var17_17 != 0) {
                    Intrinsics.checkNotNullParameter(var4_4, "selectedOrdersList");
                    var5_5 = var4_4;
                    var5_5 = ((Iterable)var4_4).iterator();
                    var29_29 = 0;
                    var30_30 = 0.0f;
                    var12_12 = null;
                    while ((var27_27 = (int)var5_5.hasNext()) != 0) {
                        var19_19 = ((SelectedOrderItem)var5_5.next()).getQuantity();
                        if (var19_19 != null) {
                            var27_27 = var19_19.intValue();
                        } else {
                            var27_27 = 0;
                            var19_19 = null;
                        }
                        var29_29 += var27_27;
                    }
                    var5_5 = new De2$q(var29_29);
                    var27_27 = 1647162699;
                    var12_12 = new u10(var27_27, var5_5, var22_22);
                    var16_16 = 3;
                    bt1.a((dt1_0)var3_3, null, (gx0_2)var12_12, var16_16);
                }
                var6_6 = var25_25;
                if (var25_25 != null) {
                    var5_5 = var25_25.getForwardPacketNumber();
                } else {
                    var16_16 = 0;
                    var5_5 = null;
                }
                if (var5_5 != null && (var16_16 = (int)TextUtils.isEmpty((CharSequence)(var5_5 = var6_6.getForwardPacketNumber()))) == 0 && (var5_5 = qz1_2.o()) != null) {
                    var12_12 = new De2$r((la2_0)var5_5, (SelectedOrderItem)var6_6, var7_7);
                    var27_27 = 1740622409;
                    var5_5 = new u10(var27_27, var12_12, var22_22);
                    var29_29 = 3;
                    var30_30 = 4.2E-45f;
                    bt1.a((dt1_0)var3_3, null, (gx0_2)var5_5, var29_29);
                }
                if ((var16_16 = (int)var7_7.e) == 0) ** GOTO lbl-1000
                if (var6_6 != null) {
                    var5_5 = var6_6.getReturnId();
                } else {
                    var16_16 = 0;
                    var5_5 = null;
                }
                if (var5_5 != null) {
                    var5_5 = new De2$s(var7_7, (SelectedOrderItem)var6_6);
                    var27_27 = 1590297353;
                    var12_12 = new u10(var27_27, var5_5, var22_22);
                    var16_16 = 3;
                    bt1.a((dt1_0)var3_3, null, (gx0_2)var12_12, var16_16);
                } else lbl-1000:
                // 2 sources

                {
                    var16_16 = 3;
                }
                var17_17 = var2_2.g;
                var18_18 = var2_2.h;
                var19_19 = var2_2.m;
                if (var14_14 != 0) {
                    var29_29 = var4_4.size();
                    var5_5 = De2$C.c;
                    var9_9 = new De2$D(var4_4, (Function1)var5_5);
                    var1_1 = var5_5;
                    var25_25 = var8_8;
                    var31_31 = var11_11;
                    var11_11 = var4_4;
                    var32_32 = var29_29;
                    var12_12 = var7_7;
                    var33_33 = var19_19;
                    var19_19 = var6_6;
                    var34_34 = var18_18;
                    var23_23 = var10_10;
                    var35_35 = var17_17;
                    var17_17 = var14_14;
                    var10_10 = var6_6;
                    var36_36 = var35_35;
                    var37_37 = var4_4;
                    var38_38 = var14_14;
                    var14_14 = var18_18;
                    var2_2 = null;
                    var13_13 = var33_33;
                    var5_5 = new de2$e_0(var4_4, var7_7, (SelectedOrderItem)var6_6, (yT1)var23_23, (boolean)var17_17, (boolean)var35_35, (boolean)var18_18, (CartDeliveryAddress)var33_33);
                    var39_39 = -632812321;
                    var40_40 = -1.4077287E16f;
                    var19_19 = var1_1;
                    var29_29 = 1;
                    var30_30 = 1.4E-45f;
                    var5_5 = new u10(var39_39, var1_1, (boolean)var29_29);
                    var3_3.a(var32_32, null, (Function1)var9_9, (u10)var5_5);
                    var5_5 = var6_6;
                } else {
                    var31_31 = var11_11;
                    var33_33 = var19_19;
                    var34_34 = var18_18;
                    var35_35 = var17_17;
                    var5_5 = var6_6;
                    var2_2 = null;
                    var37_37 = var4_4;
                    var25_25 = var8_8;
                    var29_29 = 1;
                    var30_30 = 1.4E-45f;
                    var38_38 = var14_14;
                    var11_11 = new De2$z(var7_7, (yT1)var10_10, (SelectedOrderItem)var6_6, (boolean)var14_14);
                    var18_18 = -156265281;
                    var19_19 = new u10(var18_18, var11_11, (boolean)var29_29);
                    var39_39 = 3;
                    var40_40 = 4.2E-45f;
                    bt1.a((dt1_0)var3_3, null, (gx0_2)var19_19, var39_39);
                }
                var39_39 = (int)qz1_2.g((SelectedOrderItem)var5_5);
                if (var5_5 != null && (var12_12 = var5_5.getConsignment()) != null) {
                    var15_15 = var12_12.getShipmentStatus();
                } else {
                    var14_14 = 0;
                    var15_15 = null;
                }
                var12_12 = "delivered";
                var29_29 = var12_12.equalsIgnoreCase((String)var15_15);
                var19_19 = h40_0.a;
                var18_18 = h40_0.f2();
                if (var18_18 != 0 && var29_29 != 0 && var39_39 != 0 && (var35_35 != 0 || var34_34 != 0)) {
                    var18_18 = 1;
                } else {
                    var18_18 = 0;
                    var23_23 = null;
                }
                var39_39 = (int)h40_0.f2();
                if (var39_39 == 0) ** GOTO lbl196
                var39_39 = var7_7.A0;
                var15_15 = var39_39;
                if (var39_39 <= 0) {
                    var14_14 = 0;
                    var15_15 = null;
                }
                if (var15_15 != null) {
                    while (true) {
                        var39_39 = var15_15.intValue();
                        break;
                    }
                } else {
                    if (var5_5 != null && (var11_11 = var5_5.getConsignment()) != null && (var11_11 = var11_11.getEntries()) != null && (var11_11 = (CartEntry)CollectionsKt.firstOrNull((List)var11_11)) != null && (var11_11 = var11_11.getReturnFee()) != null && (var11_11 = je3_2.e((String)var11_11)) != null) {
                        var40_40 = var11_11.floatValue();
                        var39_39 = (int)var40_40;
                        var15_15 = var39_39;
                    } else {
                        var14_14 = 0;
                        var15_15 = null;
                    }
                    if (var15_15 != null) ** continue;
lbl196:
                    // 2 sources

                    var39_39 = 0;
                    var40_40 = 0.0f;
                    var11_11 = null;
                }
                if (var38_38 == 0 && var29_29 != 0 && (var29_29 = (int)var19_19.j2()) != 0 && (var35_35 != 0 || var34_34 != 0)) {
                    var12_12 = new De2$A(var7_7, (SelectedOrderItem)var5_5);
                    var17_17 = -1725071988;
                    var36_36 = 1;
                    var19_19 = new u10(var17_17, var12_12, (boolean)var36_36);
                    var29_29 = 3;
                    var30_30 = 4.2E-45f;
                    bt1.a((dt1_0)var3_3, null, (gx0_2)var19_19, var29_29);
                }
                if (var18_18 == 0) break block44;
                var30_30 = var39_39;
                var27_27 = 0;
                var19_19 = null;
                cfr_temp_0 = var30_30 - 0.0f;
                var29_29 = (int)(cfr_temp_0 == 0.0f ? 0 : (cfr_temp_0 > 0.0f ? 1 : -1));
                if (var29_29 <= 0) break block44;
                var29_29 = 0;
                var12_12 = null;
                var30_30 = 0.0f;
                var2_2 = this;
                var19_19 = this.i;
                if (var19_19 == null || (var18_18 = var19_19.getStatus()) != 0) ** GOTO lbl-1000
                var23_23 = (IncentiviseHighReturnData)var19_19.getData();
                if (var23_23 != null && (var23_23 = var23_23.getResult()) != null && (var23_23 = var23_23.getPOST_ORDER_RETURN_FEE()) != null) {
                    var15_15 = var23_23.getActionContent();
                } else {
                    var14_14 = 0;
                    var15_15 = null;
                }
                if (var15_15 != null) {
                    var24_24 = var20_20;
                    var23_23 = new De2$B((DataCallback)var19_19, var39_39, var7_7, (CartOrder)var20_20);
                    var36_36 = 1;
                    var11_11 = new u10(-642484314, var23_23, (boolean)var36_36);
                    var27_27 = 3;
                    bt1.a((dt1_0)var3_3, null, (gx0_2)var11_11, var27_27);
                } else lbl-1000:
                // 2 sources

                {
                    var24_24 = var20_20;
                }
                break block45;
            }
            var29_29 = 0;
            var12_12 = null;
            var30_30 = 0.0f;
            var24_24 = var20_20;
            var2_2 = this;
        }
        if (var38_38 == 0) {
            var19_19 = var25_25;
            var11_11 = new De2$e(var7_7, (SelectedOrderItem)var5_5, (Ref$ObjectRef)var25_25);
            var36_36 = 1476566661;
            var14_14 = 1;
            var23_23 = new u10(var36_36, var11_11, (boolean)var14_14);
            var39_39 = 3;
            var40_40 = 4.2E-45f;
            bt1.a((dt1_0)var3_3, null, (gx0_2)var23_23, var39_39);
        } else {
            var19_19 = var25_25;
        }
        if (var38_38 == 0) ** GOTO lbl276
        var11_11 = h40_0.X();
        if (var11_11 != null) {
            var11_11 = var11_11.getEnable();
            var23_23 = Boolean.TRUE;
            var28_28 = Intrinsics.areEqual(var11_11, var23_23);
        }
        if (var28_28 && var24_24 != null) {
            var23_23 = var37_37;
            var11_11 = new de2$f_0(var37_37, var7_7, (CartOrder)var24_24);
            var36_36 = 1808910176;
            var14_14 = 1;
            var23_23 = new u10(var36_36, var11_11, (boolean)var14_14);
            var39_39 = 3;
            var40_40 = 4.2E-45f;
            bt1.a((dt1_0)var3_3, null, (gx0_2)var23_23, var39_39);
lbl269:
            // 2 sources

            while (true) {
                var14_14 = 1;
                break;
            }
        } else {
            while (true) {
                var39_39 = 3;
                var40_40 = 4.2E-45f;
                ** continue;
                break;
            }
lbl276:
            // 1 sources

            var11_11 = h40_0.X();
            if (var11_11 != null) {
                var11_11 = var11_11.getEnable();
                var23_23 = Boolean.TRUE;
                var28_28 = Intrinsics.areEqual(var11_11, var23_23);
            }
            if (!var28_28 || var24_24 == null) ** continue;
            var11_11 = new de2$g_0(var7_7, (CartOrder)var24_24, (SelectedOrderItem)var5_5);
            var36_36 = 1685684535;
            var14_14 = 1;
            var23_23 = new u10(var36_36, var11_11, (boolean)var14_14);
            var39_39 = 3;
            var40_40 = 4.2E-45f;
            bt1.a((dt1_0)var3_3, null, (gx0_2)var23_23, var39_39);
        }
        var23_23 = new de2$h_0((SelectedOrderItem)var5_5);
        var26_26 = 1826571846;
        var6_6 = new u10(var26_26, var23_23, (boolean)var14_14);
        bt1.a((dt1_0)var3_3, null, (gx0_2)var6_6, var39_39);
        if (var38_38 != 0) {
            var6_6 = var33_33;
            var23_23 = new de2$i_0((CartDeliveryAddress)var33_33, var7_7);
            var26_26 = 1419701315;
            var6_6 = new u10(var26_26, var23_23, (boolean)var14_14);
            bt1.a((dt1_0)var3_3, null, (gx0_2)var6_6, var39_39);
        } else {
            var6_6 = var33_33;
            var23_23 = new De2$j((CartDeliveryAddress)var33_33, var7_7, (SelectedOrderItem)var5_5);
            var26_26 = 1849055002;
            var6_6 = new u10(var26_26, var23_23, (boolean)var14_14);
            bt1.a((dt1_0)var3_3, null, (gx0_2)var6_6, var39_39);
        }
        if (var38_38 == 0) {
            var23_23 = new De2$k(var7_7, (SelectedOrderItem)var5_5);
            var26_26 = -587601825;
            var6_6 = new u10(var26_26, var23_23, (boolean)var14_14);
            bt1.a((dt1_0)var3_3, null, (gx0_2)var6_6, var39_39);
        }
        if ((var39_39 = var21_21.isEmpty() ^ var14_14) != 0) {
            var23_23 = var21_21;
            var6_6 = var31_31;
            var11_11 = new De2$l((CartOrder)var24_24, var21_21, var7_7, var31_31);
            var36_36 = 1531449150;
            var23_23 = new u10(var36_36, var11_11, (boolean)var14_14);
            var39_39 = 3;
            var40_40 = 4.2E-45f;
            bt1.a((dt1_0)var3_3, null, (gx0_2)var23_23, var39_39);
        } else {
            var39_39 = 3;
            var40_40 = 4.2E-45f;
        }
        var23_23 = new De2$m((CartOrder)var24_24, var7_7, (Ref$ObjectRef)var19_19);
        var19_19 = new u10(-349344475, var23_23, (boolean)var14_14);
        bt1.a((dt1_0)var3_3, null, (gx0_2)var19_19, var39_39);
        var19_19 = new De2$n(var7_7, (CartOrder)var24_24, (SelectedOrderItem)var5_5);
        var5_5 = new u10(1769706500, var19_19, (boolean)var14_14);
        bt1.a((dt1_0)var3_3, null, (gx0_2)var5_5, var39_39);
        return Unit.a;
    }
}

