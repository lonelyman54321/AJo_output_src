/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.events.NewEEcommerceEventsRevamp;
import com.ril.ajio.analytics.handler.OnGAEventHandlerListener;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

public final class Q22$c
implements OnGAEventHandlerListener {
    public final /* synthetic */ q22_0 a;

    public Q22$c(q22_0 q22_02) {
        this.a = q22_02;
    }

    public final void pushEEBannerImpression(String string2, HashMap hashMap, String string3, String string4, String string5, String string6, String string7, boolean bl2, boolean bl3, String string8) {
        Intrinsics.checkNotNullParameter(string2, "eventName");
        Intrinsics.checkNotNullParameter(hashMap, "urlList");
        Intrinsics.checkNotNullParameter(string3, "screenName");
        Intrinsics.checkNotNullParameter(string4, "previousScreen");
        Intrinsics.checkNotNullParameter(string5, "screenType");
        Intrinsics.checkNotNullParameter(string6, "previousScreenType");
        Intrinsics.checkNotNullParameter(string7, "pageType");
        AnalyticsManager.Companion.getInstance().getNewEEcommerceEventsRevamp().pushEEBannerImpression(string2, hashMap, string3, string4, string5, string6, string7, bl2, bl3, string8);
    }

    public final void pushEEFleekImpressions(List list, String string2, String string3, String string4, String string5) {
        Intrinsics.checkNotNullParameter(list, "impressionList");
        Intrinsics.checkNotNullParameter(string2, "screenName");
        Intrinsics.checkNotNullParameter(string3, "previousScreen");
        Intrinsics.checkNotNullParameter(string4, "screenType");
        Intrinsics.checkNotNullParameter(string5, "previousScreenType");
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final void pushEEProductImpression(List var1_1, String var2_2, String var3_3, String var4_4, String var5_5, boolean var6_6, String var7_7, String var8_8, String var9_9, String var10_10, String var11_11, String var12_12, String var13_13, String var14_14, String var15_15) {
        var16_16 = var13_13;
        Intrinsics.checkNotNullParameter(var1_1, "productList");
        var17_17 = var2_2;
        Intrinsics.checkNotNullParameter(var2_2, "eventName");
        var17_17 = var3_3;
        Intrinsics.checkNotNullParameter(var3_3, "listName");
        var18_18 = var5_5;
        Intrinsics.checkNotNullParameter(var5_5, "screenName");
        Intrinsics.checkNotNullParameter(var7_7, "previousScreen");
        var19_19 = var8_8;
        Intrinsics.checkNotNullParameter(var8_8, "screenType");
        Intrinsics.checkNotNullParameter(var9_9, "previousScreenType");
        var20_20 = this.a;
        var19_19 = var20_20.cb();
        var21_21 = var19_19.b();
        if (var21_21) {
            var17_17 = var20_20.cb().d;
            var22_22 = var17_17.s;
            var17_17 = var22_22 != false ? "b" : "m";
            var19_19 = "fleek_";
            var23_23 = "_";
            var17_17 = UX.c((String)var19_19, (String)var17_17, (String)var23_23, var16_16);
        }
        if (var21_21 = Intrinsics.areEqual(var19_19 = var20_20.cb().d.M0, var23_23 = Boolean.TRUE)) {
            var17_17 = "fleek_visit_ajiogram_store";
        }
        var19_19 = var17_17;
        var17_17 = AnalyticsManager.Companion;
        var23_23 = var17_17.getInstance().getNewEEcommerceEventsRevamp();
        var17_17 = var17_17.getInstance().getNewEEcommerceEventsRevamp().getEE_VIEW_ITEM_LIST();
        var24_24 = sq0_1.a;
        var24_24 = sq0_1.d(var5_5);
        var25_25 = sq0_1.e();
        var26_26 = var20_20.y0;
        var27_27 = var20_20.z0;
        var28_28 /* !! */  = var20_20.G0;
        var18_18 = var20_20.cb().d.S0;
        var29_29 = var20_20.cb().d.p(var16_16);
        var20_20 = var20_20.cb().d.l();
        var31_31 = Intrinsics.areEqual(var20_20, var30_30 = ld3_2.STORE_AJIO.getStoreId());
        if (!var31_31) ** GOTO lbl-1000
        var20_20 = h40_0.a;
        var31_31 = h40_0.o1();
        if (var31_31) {
            var31_31 = true;
            var32_32 = true;
        } else lbl-1000:
        // 2 sources

        {
            var31_31 = false;
            var20_20 = null;
            var32_32 = false;
        }
        var20_20 = var23_23;
        var33_33 = var18_18;
        var18_18 = var19_19;
        var19_19 = var4_4;
        var23_23 = var24_24;
        var34_34 = var28_28 /* !! */ ;
        var28_28 /* !! */  = var10_10;
        var35_35 = var27_27;
        var27_27 = var11_11;
        var16_16 = var35_35;
        var35_35 = var13_13;
        NewEEcommerceEventsRevamp.pushEEProductImpression$default((NewEEcommerceEventsRevamp)var20_20, var1_1, (String)var17_17, (String)var18_18, var4_4, (String)var24_24, var6_6, var7_7, var25_25, var9_9, var10_10, var11_11, var12_12, var26_26, var16_16, null, 0L, var34_34, var13_13, null, null, var29_29, var33_33, var32_32, 835584, null);
    }
}

