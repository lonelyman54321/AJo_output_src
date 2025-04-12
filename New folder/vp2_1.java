/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 */
import android.text.TextUtils;
import com.ril.ajio.R$string;
import com.ril.ajio.analytics.AnalyticsData;
import com.ril.ajio.analytics.AnalyticsData$Builder;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.FbEventContentData;
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.services.data.Closet.SaveForLaterResponse;
import com.ril.ajio.services.data.Product.Product;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Vp2
 */
public final class vp2_1
implements F62 {
    public final /* synthetic */ xp2_2 a;

    public /* synthetic */ vp2_1(xp2_2 xp2_22) {
        this.a = xp2_22;
    }

    /*
     * Unable to fully structure code
     */
    public final void onChanged(Object var1_1) {
        block28: {
            block31: {
                block29: {
                    block30: {
                        block33: {
                            block32: {
                                var1_1 = (DataCallback)var1_1;
                                var2_2 = this.a;
                                Intrinsics.checkNotNullParameter(var2_2, "this$0");
                                var3_3 = var2_2.g;
                                if (var3_3 == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException("activityFragmentListener");
                                    var4_4 = 0;
                                    var3_3 = null;
                                }
                                var3_3.stopLoader();
                                var3_3 = cp_1.Companion;
                                var4_4 = nn_2.b((cp$a)var3_3, (DataCallback)var1_1);
                                if (var4_4 == 0) break block28;
                                var4_4 = var1_1.getStatus();
                                var5_5 = 1;
                                if (var4_4 != 0) break block29;
                                if ((var1_1 = (SaveForLaterResponse)var1_1.getData()) == null || (var3_3 = var1_1.getStatusCode()) == null || (var4_4 = var3_3.intValue()) != 0) break block30;
                                var3_3 = var1_1.getStatus();
                                if (var3_3 != null) {
                                    var3_3 = var3_3.getMessageDescription();
                                } else {
                                    var4_4 = 0;
                                    var3_3 = null;
                                }
                                var6_6 = "";
                                if (var3_3 != null && (var4_4 = var3_3.length()) != 0) {
                                    if ((var1_1 = var1_1.getStatus()) == null || (var1_1 = var1_1.getMessageDescription()) == null) {
                                        var1_1 = var6_6;
                                    }
                                } else {
                                    var7_7 = R$string.revamp_moved_to_closet_successfully;
                                    var1_1 = hv3_0.K(var7_7);
                                }
                                var4_4 = 3;
                                rw_1.a(var4_4, (String)var1_1);
                                var1_1 = var2_2.Ra().p.b;
                                if (var1_1 != null) {
                                    var3_3 = var2_2.E;
                                    if (var3_3 != null) {
                                        var8_10 = var2_2.K;
                                        var3_3.s(var8_10, (Product)var1_1);
                                    }
                                    var3_3 = el1_2.a;
                                    var3_3 = yt2_2.PDP;
                                    el1_2.c((yt2_2)var3_3, (Product)var1_1);
                                }
                                if ((var1_1 = var2_2.Ra().p.b) != null && (var1_1 = var1_1.getFnlColorVariantData()) != null) {
                                    var1_1 = var1_1.getColorGroup();
                                } else {
                                    var7_7 = 0;
                                    var1_1 = null;
                                }
                                if (var1_1 != null && (var7_7 = var1_1.length()) != 0 && (var1_1 = var2_2.Ra().p.b) != null) {
                                    var3_3 = var2_2.Ra().p.b;
                                    if (var3_3 != null && (var3_3 = var3_3.getFnlColorVariantData()) != null) {
                                        var3_3 = var3_3.getColorGroup();
                                    } else {
                                        var4_4 = 0;
                                        var3_3 = null;
                                    }
                                    var1_1.setCode((String)var3_3);
                                }
                                if ((var1_1 = var2_2.Ra().p.b) == null) break block31;
                                var3_3 = g62_0.c;
                                var9_11 = DW.c((Product)var1_1);
                                var10_12 = 1000;
                                var3_3.b(var9_11, var10_12);
                                kx3_0.a = var5_5;
                                kx3_0.b = null;
                                var3_3 = new ArrayList();
                                var11_13 = var1_1.getCode();
                                if (var11_13 == null) {
                                    var11_13 = var6_6;
                                }
                                var9_11 = new FbEventContentData((String)var11_13, var5_5);
                                var3_3.add(var9_11);
                                var12_14 = var1_1.getPrice();
                                if (var12_14 != null) {
                                    var12_14 = var1_1.getPrice();
                                    if (var12_14 != null) {
                                        var12_14 = var12_14.getValue();
                                    } else {
                                        var5_5 = 0;
                                        var12_14 = null;
                                    }
                                    var8_10 = (int)TextUtils.isEmpty((CharSequence)var12_14);
                                    if (var8_10 != 0) {
                                        var12_14 = "0.0";
                                    }
                                } else {
                                    var12_14 = "0.0d";
                                }
                                if ((var9_11 = var1_1.getFnlColorVariantData()) == null) break block32;
                                var9_11 = var1_1.getFnlColorVariantData();
                                if (var9_11 != null) {
                                    var9_11 = var9_11.getBrandName();
                                } else {
                                    var8_10 = 0;
                                    var9_11 = null;
                                }
                                if (var9_11 == null) break block32;
                                var9_11 = var1_1.getFnlColorVariantData();
                                if (var9_11 == null) ** GOTO lbl-1000
                                var9_11 = var9_11.getBrandName();
                                break block33;
                            }
                            if ((var9_11 = var1_1.getBrandName()) != null) {
                                var9_11 = var1_1.getBrandName();
                            } else lbl-1000:
                            // 2 sources

                            {
                                var8_10 = 0;
                                var9_11 = null;
                            }
                        }
                        var11_13 = AnalyticsManager.Companion.getInstance().getFb();
                        var13_15 = new AnalyticsData$Builder();
                        var14_16 = var1_1.getCode();
                        if (var14_16 == null) {
                            var14_16 = var6_6;
                        }
                        var13_15 = var13_15.productCode(var14_16);
                        if (var12_14 != null) {
                            var6_6 = var12_14;
                        }
                        var12_14 = var13_15.price((String)var6_6).setBrand((String)var9_11);
                        var1_1 = var1_1.getCatalog();
                        var1_1 = var12_14.setCatalogId((String)var1_1).fbContentData((List)var3_3).build();
                        var11_13.addToWishlistEvent((AnalyticsData)var1_1);
                        break block31;
                    }
                    if (var1_1 != null && (var1_1 = var1_1.getStatus()) != null) {
                        var1_1 = var1_1.getMessageDescription();
                    } else {
                        var7_8 = false;
                        var1_1 = null;
                    }
                    var4_4 = 2;
                    rw_1.a(var4_4, (String)var1_1);
                    break block31;
                }
                var7_9 = var1_1.getStatus();
                if (var7_9 == var5_5) {
                    rw_1.a(var5_5, null);
                }
            }
            var1_1 = var2_2.Ra().p;
            var1_1.b = null;
        }
    }
}

