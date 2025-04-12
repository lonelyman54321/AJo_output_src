/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 */
import android.text.TextUtils;
import com.ril.ajio.services.data.Cart.Cart;
import com.ril.ajio.services.data.Cart.CartEntry;
import com.ril.ajio.services.data.Cart.ServicabilityInfo;
import com.ril.ajio.services.data.Cart.ServicabilityInfo$PriorityDelivery;
import com.ril.ajio.services.data.Product.ProductDetail;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from tS
 */
public final class ts_1
implements Callable {
    public final /* synthetic */ Cart a;
    public final /* synthetic */ ps_0 b;

    public /* synthetic */ ts_1(Cart cart, ps_0 ps_02) {
        this.a = cart;
        this.b = ps_02;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object call() {
        block52: {
            block64: {
                block70: {
                    block67: {
                        block65: {
                            block68: {
                                block69: {
                                    block66: {
                                        block54: {
                                            block53: {
                                                var1_1 = this;
                                                var2_2 /* !! */  = 1;
                                                var3_3 = this.b;
                                                Intrinsics.checkNotNullParameter(var3_3, "this$0");
                                                var4_6 = go2_0.a;
                                                var4_6 = var3_3.m;
                                                var5_7 = var3_3.n;
                                                var6_8 = var3_3.l;
                                                var7_9 = var3_3.o;
                                                var8_10 = var3_3.p;
                                                var9_11 = var3_3.q;
                                                Intrinsics.checkNotNullParameter(var4_6, "shippingDataList");
                                                Intrinsics.checkNotNullParameter(var5_7, "nonServiceableList");
                                                Intrinsics.checkNotNullParameter(var8_10, "eddHashMap");
                                                var3_3 = "deliverydateHashMap";
                                                Intrinsics.checkNotNullParameter(var9_11, (String)var3_3);
                                                var10_12 = this.a;
                                                if (var10_12 != null && (var3_3 = var10_12.getEntries()) != null) {
                                                    var11_13 = var3_3.size();
                                                } else {
                                                    var11_13 = 0;
                                                    var12_14 = 0.0f;
                                                    var3_3 = null;
                                                }
                                                if (var11_13 <= 0) break block52;
                                                if (var6_8 != null) {
                                                    var3_3 = var6_8.getProductDetails();
                                                } else {
                                                    var11_13 = 0;
                                                    var12_14 = 0.0f;
                                                    var3_3 = null;
                                                }
                                                if (var3_3 == null) break block52;
                                                var13_15 = new HashMap();
                                                var14_16 = new TreeMap<Object, Object>();
                                                if (var10_12 != null && (var3_3 = var10_12.getEntries()) != null) {
                                                    var3_3 = var3_3.iterator();
                                                    while ((var15_17 = var3_3.hasNext()) != 0) {
                                                        var16_18 = (CartEntry)var3_3.next();
                                                        var17_19 = var16_18.getProduct();
                                                        if (var17_19 == null) continue;
                                                        var17_19 = var16_18.getProduct().getCode();
                                                        var13_15.put(var17_19, var16_18);
                                                    }
                                                }
                                                var3_3 = var6_8.getProductDetails();
                                                var6_8 = "";
                                                var18_20 = -1;
                                                var20_21 = 0x7FFFFFFFFFFFFFFFL;
                                                var22_22 = -9223372036854775808L;
                                                if (var3_3 != null) break block53;
                                                var32_31 = var6_8;
                                                var47_42 = 0;
                                                var52_47 = null;
                                                var38_37 = 0L;
                                                var55_50 = var20_21;
                                                var57_51 = var22_22;
                                                var11_13 = 1;
                                                var12_14 = 1.4E-45f;
                                                var53_48 = 0;
                                                var6_8 = null;
                                                var48_43 = 0;
                                                var51_46 = null;
                                                break block54;
                                            }
                                            var24_23 = var3_3.iterator();
                                            var11_13 = 1;
                                            var12_14 = 1.4E-45f;
                                            var25_24 = 0;
                                            var26_25 = 0;
                                            while (var27_26 = var24_23.hasNext()) {
                                                block51: {
                                                    block63: {
                                                        block58: {
                                                            block57: {
                                                                block60: {
                                                                    block62: {
                                                                        block49: {
                                                                            block61: {
                                                                                block59: {
                                                                                    block50: {
                                                                                        block48: {
                                                                                            block56: {
                                                                                                block55: {
                                                                                                    var28_27 = (ProductDetail)var24_23.next();
                                                                                                    var29_28 = var28_27.isCodEligible();
                                                                                                    if (var29_28 == 0) {
                                                                                                        var29_28 = 0;
                                                                                                        var30_29 = 0.0f;
                                                                                                    } else {
                                                                                                        var29_28 = var11_13;
                                                                                                        var30_29 = var12_14;
                                                                                                    }
                                                                                                    var3_3 = var28_27.getProductCode();
                                                                                                    var3_3 = (CartEntry)var13_15.get(var3_3);
                                                                                                    if (var3_3 != null) {
                                                                                                        var31_30 = 262143;
                                                                                                        var32_31 = null;
                                                                                                        var33_32 = 0;
                                                                                                        var34_33 = 0;
                                                                                                        var35_34 = 0;
                                                                                                        var36_35 = 0;
                                                                                                        var37_36 = null;
                                                                                                        var16_18 = new ServicabilityInfo(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, var31_30, null);
                                                                                                        var3_3.setServicabilityInfo((ServicabilityInfo)var16_18);
                                                                                                    }
                                                                                                    if (var3_3 != null && (var16_18 = var3_3.getServicabilityInfo()) != null) {
                                                                                                        var17_19 = var28_27.getDeliverySLA();
                                                                                                        var16_18.setDeliverySLA((String)var17_19);
                                                                                                    }
                                                                                                    if (var3_3 != null && (var16_18 = var3_3.getServicabilityInfo()) != null) {
                                                                                                        var17_19 = var28_27.getDeliverySLAName();
                                                                                                        var16_18.setDeliverySLAName((String)var17_19);
                                                                                                    }
                                                                                                    if (var3_3 != null && (var16_18 = var3_3.getServicabilityInfo()) != null) {
                                                                                                        var17_19 = var28_27.getPriorityDelivery();
                                                                                                        var16_18.setPriorityDelivery((ServicabilityInfo$PriorityDelivery)var17_19);
                                                                                                    }
                                                                                                    if (var3_3 != null && (var16_18 = var3_3.getServicabilityInfo()) != null && (var16_18 = var16_18.getPriorityDelivery()) != null) {
                                                                                                        var17_19 = var28_27.getPriorityDelivery();
                                                                                                        if (var17_19 == null || (var17_19 = var17_19.getBucketChangeMsg()) == null) {
                                                                                                            var17_19 = var6_8;
                                                                                                        }
                                                                                                        var16_18.setBucketChangeMsg((String)var17_19);
                                                                                                    }
                                                                                                    if ((var15_17 = var28_27.isServicability()) == 0) break block55;
                                                                                                    var16_18 = var28_27.getPriorityDelivery();
                                                                                                    if (var16_18 == null || (var16_18 = var16_18.getBucketChangeMsg()) == null) ** GOTO lbl-1000
                                                                                                    var15_17 = var16_18.length();
                                                                                                    if (var15_17 > 0) {
                                                                                                        var15_17 = 1;
                                                                                                    } else {
                                                                                                        var15_17 = 0;
                                                                                                        var16_18 = null;
                                                                                                    }
                                                                                                    if (var15_17 == var2_2 /* !! */ ) {
                                                                                                        var15_17 = 1;
                                                                                                    } else lbl-1000:
                                                                                                    // 2 sources

                                                                                                    {
                                                                                                        var15_17 = 0;
                                                                                                        var16_18 = null;
                                                                                                    }
                                                                                                    if (var15_17 == 0) break block56;
                                                                                                }
                                                                                                var32_31 = var6_8;
                                                                                                var37_36 = var9_11;
                                                                                                var38_37 = 0L;
                                                                                                if (var3_3 == null) break block57;
                                                                                                break block58;
                                                                                            }
                                                                                            var3_3 = var28_27.getEddLower();
                                                                                            var11_13 = TextUtils.isEmpty((CharSequence)var3_3);
                                                                                            var16_18 = "yyyy-MM-dd'T'HH:mm:ssZZZZ";
                                                                                            if (var11_13 == 0) {
                                                                                                var3_3 = var28_27.getEddLower();
                                                                                                var40_38 = k7.w((String)var3_3, (String)var16_18);
                                                                                            } else {
                                                                                                var40_38 = var18_20;
                                                                                            }
                                                                                            var3_3 = var28_27.getEddUpper();
                                                                                            var42_39 = k7.w((String)var3_3, (String)var16_18);
                                                                                            var11_13 = (int)(var40_38 == var18_20 ? 0 : (var40_38 < var18_20 ? -1 : 1));
                                                                                            var18_20 = var11_13 == 0 ? var42_39 : var40_38;
                                                                                            var11_13 = (int)(var18_20 == var20_21 ? 0 : (var18_20 < var20_21 ? -1 : 1));
                                                                                            if (var11_13 < 0) {
                                                                                                var20_21 = var18_20;
                                                                                            }
                                                                                            if ((var11_13 = (int)(var42_39 == var22_22 ? 0 : (var42_39 < var22_22 ? -1 : 1))) > 0) {
                                                                                                var22_22 = var42_39;
                                                                                            }
                                                                                            if ((var3_3 = (ArrayList)var14_16.get(var44_40 = k7.d(var18_20, var42_39))) == null) {
                                                                                                var3_3 = new ArrayList();
                                                                                            }
                                                                                            var1_1 = var3_3;
                                                                                            var3_3 = var28_27.getPriorityDelivery();
                                                                                            if (var3_3 != null && (var3_3 = var3_3.getDeliveryDate()) != null) {
                                                                                                var32_31 = var6_8;
                                                                                                var6_8 = var28_27.getProductCode();
                                                                                                var9_11.put(var6_8, var3_3);
                                                                                            } else {
                                                                                                var32_31 = var6_8;
                                                                                            }
                                                                                            var6_8 = var28_27.getProductCode();
                                                                                            var33_32 = -1;
                                                                                            var45_41 = 0L;
                                                                                            var35_34 = var18_20 == var45_41 ? 0 : (var18_20 < var45_41 ? -1 : 1);
                                                                                            if (var35_34 >= 0) {
                                                                                                try {
                                                                                                    var3_3 = Calendar.getInstance();
                                                                                                    Intrinsics.checkNotNull(var3_3);
                                                                                                    var3_3.setTimeInMillis(var18_20);
                                                                                                    var47_42 = 5;
                                                                                                    var48_43 = var3_3.get(var47_42);
                                                                                                    var47_42 = 2;
                                                                                                    var47_42 = var34_33 = var3_3.get(var47_42) + 1;
                                                                                                    break block48;
                                                                                                }
                                                                                                catch (Exception var3_4) {
                                                                                                    var37_36 = var9_11;
                                                                                                    var38_37 = 0L;
                                                                                                    break block49;
                                                                                                }
                                                                                            }
                                                                                            var11_13 = 0;
                                                                                            var12_14 = 0.0f;
                                                                                            var3_3 = null;
                                                                                            var47_42 = -1;
                                                                                            var48_43 = -1;
                                                                                        }
                                                                                        var38_37 = 0L;
                                                                                        var36_35 = var42_39 == var38_37 ? 0 : (var42_39 < var38_37 ? -1 : 1);
                                                                                        if (var36_35 >= 0) {
                                                                                            var37_36 = var9_11;
                                                                                            try {
                                                                                                var9_11 = Calendar.getInstance();
                                                                                                Intrinsics.checkNotNull(var9_11);
                                                                                                var9_11.setTimeInMillis(var42_39);
                                                                                                var15_17 = 5;
                                                                                                var33_32 = var9_11.get(var15_17);
                                                                                                var15_17 = 2;
                                                                                                var15_17 = var9_11.get(var15_17) + 1;
                                                                                                var49_44 = var33_32;
                                                                                                break block50;
                                                                                            }
                                                                                            catch (Exception var3_5) {
                                                                                                break block49;
                                                                                            }
                                                                                        }
                                                                                        var37_36 = var9_11;
                                                                                        var50_45 /* !! */  = 0;
                                                                                        var9_11 = null;
                                                                                        var15_17 = -1;
                                                                                        var49_44 = -1;
                                                                                    }
                                                                                    if (var47_42 == var15_17 && var49_44 == var48_43) {
                                                                                        var15_17 = 0;
                                                                                        var16_18 = null;
                                                                                    }
                                                                                    var51_46 = "dd' 'MMM";
                                                                                    if (var47_42 <= 0 || var15_17 <= 0) break block59;
                                                                                    var52_47 = var15_17 == var47_42 ? "dd" : var51_46;
                                                                                    var17_19 = Locale.ENGLISH;
                                                                                    var16_18 = new SimpleDateFormat((String)var52_47, (Locale)var17_19);
                                                                                    var52_47 = new SimpleDateFormat(var51_46, (Locale)var17_19);
                                                                                    Intrinsics.checkNotNull(var3_3);
                                                                                    var3_3 = var3_3.getTime();
                                                                                    var3_3 = var16_18.format((Date)var3_3);
                                                                                    Intrinsics.checkNotNull(var9_11);
                                                                                    var9_11 = var9_11.getTime();
                                                                                    var9_11 = var52_47.format((Date)var9_11);
                                                                                    var52_47 = new StringBuilder();
                                                                                    var52_47.append((String)var3_3);
                                                                                    var3_3 = " - ";
                                                                                    var52_47.append((String)var3_3);
                                                                                    var52_47.append((String)var9_11);
                                                                                    var3_3 = var52_47.toString();
                                                                                    break block60;
                                                                                }
                                                                                var17_19 = "format(...)";
                                                                                if (var47_42 <= 0) break block61;
                                                                                var52_47 = Locale.ENGLISH;
                                                                                var9_11 = new SimpleDateFormat(var51_46, (Locale)var52_47);
                                                                                Intrinsics.checkNotNull(var3_3);
                                                                                var3_3 = var3_3.getTime();
                                                                                var3_3 = var9_11.format((Date)var3_3);
                                                                                Intrinsics.checkNotNullExpressionValue(var3_3, (String)var17_19);
                                                                                break block60;
                                                                            }
                                                                            if (var15_17 <= 0) break block62;
                                                                            var52_47 = Locale.ENGLISH;
                                                                            var3_3 = new SimpleDateFormat(var51_46, (Locale)var52_47);
                                                                            Intrinsics.checkNotNull(var9_11);
                                                                            var9_11 = var9_11.getTime();
                                                                            var3_3 = var3_3.format((Date)var9_11);
                                                                            Intrinsics.checkNotNullExpressionValue(var3_3, (String)var17_19);
                                                                            break block60;
                                                                        }
                                                                        var9_11 = yn3_0.a;
                                                                        var9_11.e((Throwable)var3_3);
                                                                    }
                                                                    var3_3 = var32_31;
                                                                }
                                                                var8_10.put(var6_8, var3_3);
                                                                var3_3 = var28_27.getProductCode();
                                                                var3_3 = (CartEntry)var13_15.get(var3_3);
                                                                if (var3_3 != null) {
                                                                    var3_3.setEddDate((String)var44_40);
                                                                    var53_48 = (int)var28_27.isServicability();
                                                                    var3_3.setServicability((boolean)var53_48);
                                                                    var1_1.add(var3_3);
                                                                    var14_16.put(var44_40, var1_1);
                                                                }
                                                            }
                                                            var47_42 = 0;
                                                            var52_47 = null;
                                                            break block51;
                                                        }
                                                        var1_1 = var3_3.getServicabilityInfo();
                                                        if (var1_1 != null) {
                                                            var44_40 = var28_27.getPriorityDelivery();
                                                            var1_1.setPriorityDelivery((ServicabilityInfo$PriorityDelivery)var44_40);
                                                        }
                                                        var54_49 = var28_27.isServicability();
                                                        var3_3.setServicability(var54_49);
                                                        var1_1 = var28_27.getReasonForNotServiceability();
                                                        var3_3.setReasonForNotServiceability((String)var1_1);
                                                        var1_1 = var28_27.getReasonForNotServiceability();
                                                        if (var1_1 == null) break block63;
                                                        var1_1 = var28_27.getReasonForNotServiceability();
                                                        Intrinsics.checkNotNullExpressionValue(var1_1, "getReasonForNotServiceability(...)");
                                                        var1_1 = var1_1.toLowerCase();
                                                        Intrinsics.checkNotNullExpressionValue(var1_1, "toLowerCase(...)");
                                                        var44_40 = "ns";
                                                        var2_2 /* !! */  = (int)Intrinsics.areEqual(var1_1, var44_40);
                                                        if (var2_2 /* !! */  != 0) {
                                                            var2_2 /* !! */  = 1;
                                                            ++var25_24;
                                                            var47_42 = 0;
                                                            var52_47 = null;
                                                            var5_7.add(0, (ArrayList<Object>)var3_3);
                                                            break block51;
                                                        } else {
                                                            var2_2 /* !! */  = 1;
                                                            var47_42 = 0;
                                                            var52_47 = null;
                                                            var6_8 = "oos";
                                                            var54_49 = Intrinsics.areEqual(var1_1, var6_8);
                                                            if (var54_49) {
                                                                ++var26_25;
                                                                var5_7.add((ArrayList<Object>)var3_3);
                                                                break block51;
                                                            } else {
                                                                var5_7.add((ArrayList<Object>)var3_3);
                                                            }
                                                        }
                                                        break block51;
                                                    }
                                                    var47_42 = 0;
                                                    var52_47 = null;
                                                    var5_7.add((ArrayList<Object>)var3_3);
                                                }
                                                var1_1 = this;
                                                var11_13 = var29_28;
                                                var12_14 = var30_29;
                                                var6_8 = var32_31;
                                                var9_11 = var37_36;
                                                var2_2 /* !! */  = 1;
                                                var18_20 = -1;
                                            }
                                            var32_31 = var6_8;
                                            var47_42 = 0;
                                            var52_47 = null;
                                            var38_37 = 0L;
                                            var55_50 = var20_21;
                                            var57_51 = var22_22;
                                            var53_48 = var25_24;
                                            var48_43 = var26_25;
                                        }
                                        if (var7_9 == null) break block64;
                                        var59_52 = var5_7.size();
                                        if (var59_52 != 0) break block65;
                                        var59_52 = (int)(var55_50 == var57_51 ? 0 : (var55_50 < var57_51 ? -1 : 1));
                                        if (var59_52 == 0) break block66;
                                        var13_15 = k7.d(var55_50, var57_51);
                                        var1_1 = k7.e(var55_50, var57_51);
                                        var44_40 = Calendar.getInstance();
                                        var42_39 = var44_40.getTimeInMillis();
                                        cfr_temp_0 = var57_51 - var42_39;
                                        var2_2 /* !! */  = (int)(cfr_temp_0 == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1));
                                        if (var2_2 /* !! */  <= 0) break block67;
                                        break block68;
                                    }
                                    var42_39 = -1;
                                    cfr_temp_1 = var55_50 - var42_39;
                                    var59_52 = (int)(cfr_temp_1 == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1));
                                    if (var59_52 == 0) break block69;
                                    var13_15 = k7.d(var55_50, var42_39);
                                    var8_10 = k7.e(var55_50, var57_51);
                                    var9_11 = Calendar.getInstance();
                                    var42_39 = var9_11.getTimeInMillis();
                                    cfr_temp_2 = var55_50 - var42_39;
                                    var50_45 /* !! */  = (long)(cfr_temp_2 == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1));
                                    var42_39 = var50_45 /* !! */  > 0 ? var55_50 - var42_39 : var38_37;
                                    var1_1 = var8_10;
                                    break block70;
                                }
                                var59_52 = (int)(var57_51 == var42_39 ? 0 : (var57_51 < var42_39 ? -1 : 1));
                                if (var59_52 == 0) break block65;
                                var13_15 = k7.d(var42_39, var57_51);
                                var1_1 = k7.e(var55_50, var57_51);
                                var44_40 = Calendar.getInstance();
                                var42_39 = var44_40.getTimeInMillis();
                                cfr_temp_3 = var57_51 - var42_39;
                                var2_2 /* !! */  = (int)(cfr_temp_3 == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1));
                                if (var2_2 /* !! */  <= 0) break block67;
                            }
                            var42_39 = var57_51 - var42_39;
                            break block70;
                        }
                        var1_1 = var32_31;
                        var13_15 = var32_31;
                    }
                    var42_39 = var38_37;
                }
                var7_9.setEstimateDeliveryDate((String)var13_15);
                var7_9.setEstimateDeliveryDateYYYYMMDD((String)var1_1);
                var7_9.setEddTimeDiff(var42_39);
                var54_49 = var14_16.size();
                if (var54_49 > false) {
                    var54_49 = true;
                } else {
                    var54_49 = false;
                    var1_1 = null;
                }
                var7_9.setServiceAble(var54_49);
                var7_9.setCodAvailable((boolean)var11_13);
                var7_9.setNsCount(var53_48);
                var7_9.setOosCount(var48_43);
                if (var10_12 != null && (var3_3 = var10_12.getEntries()) != null) {
                    var11_13 = var3_3.size();
                } else {
                    var11_13 = 0;
                    var12_14 = 0.0f;
                    var3_3 = null;
                }
                var7_9.setTotalCount(var11_13);
                if (var10_12 != null && (var3_3 = var10_12.getEntries()) != null) {
                    var11_13 = var3_3.size();
                } else {
                    var11_13 = 0;
                    var12_14 = 0.0f;
                    var3_3 = null;
                }
                var7_9.setServiceableCount(var11_13 -= (var53_48 += var48_43));
            }
            if ((var11_13 = var5_7.size()) > 0) {
                var4_6.addAll(var5_7);
            }
            var3_3 = var14_16.entrySet().iterator();
            while (var54_49 = var3_3.hasNext()) {
                var1_1 = (ArrayList)((Map.Entry)var3_3.next()).getValue();
                var44_40 = null;
                for (var2_2 /* !! */  = 0; var1_1 != null && var2_2 /* !! */  < (var60_53 = var1_1.size()); var2_2 /* !! */  += var60_53) {
                    var5_7 = var1_1.get(var2_2 /* !! */ );
                    Intrinsics.checkNotNull(var5_7);
                    var4_6.add(var5_7);
                    var60_53 = 1;
                }
            }
        }
        return Unit.a;
    }
}

