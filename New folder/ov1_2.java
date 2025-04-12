/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 */
import android.text.TextUtils;
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.services.data.sis.SisStoreList;
import com.ril.ajio.services.data.sis.StoreInfo;
import com.ril.ajio.services.data.sis.StoreMetaData;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from OV1
 */
public final class ov1_2
implements F62 {
    public final /* synthetic */ qv1_2 a;

    public /* synthetic */ ov1_2(qv1_2 qv1_22) {
        this.a = qv1_22;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final void onChanged(Object var1_1) {
        block10: {
            block12: {
                block11: {
                    var1_1 = (DataCallback)var1_1;
                    var2_2 = qv1_2.Companion;
                    var2_2 = this.a;
                    Intrinsics.checkNotNullParameter(var2_2, "this$0");
                    var3_3 = cp_1.Companion;
                    var4_4 = nn_2.b(var3_3, (DataCallback)var1_1);
                    if (var4_4 == 0) break block10;
                    var4_4 = 1;
                    if (var1_1 == null || (var5_5 = var1_1.getStatus()) != 0) break block11;
                    var1_1 = (StoreMetaData)var1_1.getData();
                    var5_5 = 0;
                    if (var1_1 == null || (var1_1 = var1_1.getSisStoreList()) == null) ** GOTO lbl27
                    var6_6 = var1_1.isEmpty() ^ var4_4;
                    if (var6_6 != 0 && (var7_7 = (Object)var1_1.get(0)) != null) {
                        var7_7 = ((SisStoreList)var1_1.get(0)).getHeaderTitle();
                        var2_2.s = var7_7;
                        var7_7 = ((SisStoreList)var1_1.get(0)).getSubText();
                        if (var7_7 != null && (var6_6 = var7_7.length()) != 0) {
                            var7_7 = (SisStoreList)var1_1.get(0);
                            var7_7.getSubText();
                        }
                        var7_7 = ((SisStoreList)var1_1.get(0)).getStoreMetalistdto();
                        var6_6 = qv1_2.ab((ArrayList)var7_7);
                        var1_1 = ((SisStoreList)var1_1.get(0)).getStoreMetalistdto();
                    } else {
                        var2_2.s = null;
lbl27:
                        // 2 sources

                        var1_1 = null;
                        var6_6 = 0;
                        var7_7 = null;
                    }
                    var2_2.r = var1_1;
                    if (var1_1 != null) {
                        var1_1 = var1_1.iterator();
                        var8_9 = "iterator(...)";
                        Intrinsics.checkNotNullExpressionValue(var1_1, (String)var8_9);
                        while (var9_10 = var1_1.hasNext()) {
                            var8_9 = var1_1.next();
                            var10_11 = "next(...)";
                            Intrinsics.checkNotNullExpressionValue(var8_9, (String)var10_11);
                            var11_12 = (var8_9 = (StoreInfo)var8_9).isDisplayInChevron();
                            if (!var11_12) continue;
                            var10_11 = (jo_2)var2_2.p0.getValue();
                            var12_13 = var8_9.storeId;
                            var13_14 = "storeId";
                            Intrinsics.checkNotNullExpressionValue(var12_13, (String)var13_14);
                            Intrinsics.checkNotNullParameter(var8_9, "it");
                            var14_15 = var8_9.getAppPopupLogo();
                            var15_16 = TextUtils.isEmpty((CharSequence)var14_15);
                            if (!var15_16) {
                                var8_9 = var8_9.getAppPopupLogo();
                            } else {
                                var14_15 = var8_9.biggerLogo;
                                var15_16 = TextUtils.isEmpty((CharSequence)var14_15);
                                if (!var15_16) {
                                    var8_9 = var8_9.biggerLogo;
                                } else {
                                    var9_10 = false;
                                    var8_9 = null;
                                }
                            }
                            var10_11.getClass();
                            Intrinsics.checkNotNullParameter(var12_13, (String)var13_14);
                            var14_15 = "store_logo_";
                            var13_14 = new StringBuilder(var14_15);
                            var13_14.append(var12_13);
                            var12_13 = var13_14.toString();
                            var10_11.putPreference(var12_13, var8_9);
                        }
                    }
                    break block12;
                }
                var6_6 = 0;
                var7_8 = null;
            }
            var1_1 = var2_2.U;
            var16_17 = 2;
            if (var6_6 < var16_17) {
                var4_4 = 0;
                var3_3 = null;
            }
            var2_2 = (boolean)var4_4;
            var1_1.i(var2_2);
        }
    }
}

