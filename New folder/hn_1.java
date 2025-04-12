/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.Typeface
 *  android.os.Bundle
 *  android.text.SpannableStringBuilder
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.widget.CheckBox
 *  android.widget.TextView
 */
import android.content.Context;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import com.ril.ajio.R$id;
import com.ril.ajio.R$string;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.events.NewCustomEventsRevamp;
import com.ril.ajio.customviews.widgets.AjioCustomTypefaceSpan;
import com.ril.ajio.customviews.widgets.managers.FontsManager;
import com.ril.ajio.payment.utils.InternalWalletUtil;
import com.ril.ajio.services.data.Payment.InternalWalletDataHolder;
import com.ril.ajio.services.data.Payment.PaymentInstrumentInfo;
import java.util.HashSet;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.text.StringsKt;

/*
 * Renamed from HN
 */
public final class hn_1
extends rw_2 {
    public final en_1 b;
    public final dn_1 c;
    public final View d;
    public final CheckBox e;
    public final TextView f;
    public final TextView g;
    public final TextView h;
    public final TextView i;
    public final View j;
    public final TextView k;
    public final NewCustomEventsRevamp l;

    public hn_1(View object, en_1 en_12, dn_1 object2) {
        Intrinsics.checkNotNullParameter(object, "view");
        Intrinsics.checkNotNullParameter(object2, "cartInfoProvider");
        super((View)object);
        this.b = en_12;
        this.c = object2;
        int n3 = R$id.disableLayer;
        en_12 = object.findViewById(n3);
        object2 = "findViewById(...)";
        Intrinsics.checkNotNullExpressionValue(en_12, (String)object2);
        this.d = en_12;
        n3 = R$id.cbWallet;
        en_12 = object.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(en_12, (String)object2);
        en_12 = (CheckBox)en_12;
        this.e = en_12;
        n3 = R$id.tvDetails;
        en_12 = object.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(en_12, (String)object2);
        en_12 = (TextView)en_12;
        this.f = en_12;
        int n4 = R$id.tvWalletName;
        View view = object.findViewById(n4);
        Intrinsics.checkNotNullExpressionValue(view, (String)object2);
        view = (TextView)view;
        this.g = view;
        n4 = R$id.tvNewTag;
        view = object.findViewById(n4);
        Intrinsics.checkNotNullExpressionValue(view, (String)object2);
        view = (TextView)view;
        this.h = view;
        n4 = R$id.tvWalletAmountInfo;
        view = object.findViewById(n4);
        Intrinsics.checkNotNullExpressionValue(view, (String)object2);
        view = (TextView)view;
        this.i = view;
        n4 = R$id.walletClick;
        view = object.findViewById(n4);
        Intrinsics.checkNotNullExpressionValue(view, (String)object2);
        this.j = view;
        n4 = R$id.tvWalletGiftCardAmount;
        object = object.findViewById(n4);
        Intrinsics.checkNotNullExpressionValue(object, (String)object2);
        object = (TextView)object;
        this.k = object;
        object = AnalyticsManager.Companion.getInstance().getNewCustomEventsRevamp();
        this.l = object;
        int n7 = og1_1.b();
        if (n7 != 0) {
            n7 = en_12.getPaintFlags() | 8;
            en_12.setPaintFlags(n7);
        }
        AnalyticsManager.Companion.getInstance().getGa().trackBannerImpressionEvent("AJIOWallet", "Ajio Cash shown");
    }

    public static SpannableStringBuilder w(String object, String string2, String string3) {
        FontsManager fontsManager = FontsManager.getInstance();
        AJIOApplication.Companion.getClass();
        Object object2 = AJIOApplication$a.a();
        fontsManager = fontsManager.getTypefaceWithFont((Context)object2, 10);
        Intrinsics.checkNotNullExpressionValue(fontsManager, "getTypefaceWithFont(...)");
        object2 = StringCompanionObject.INSTANCE;
        int n3 = 2;
        Object[] objectArray = new Object[n3];
        objectArray[0] = string2;
        objectArray[1] = string3;
        object = xh2_0.a(objectArray, n3, object, "format(...)");
        int n4 = StringsKt.O(object, "of", 0, false, 6);
        string3 = new SpannableStringBuilder((CharSequence)object);
        object = new AjioCustomTypefaceSpan("", (Typeface)fontsManager);
        string3.setSpan(object, 0, n4, 34);
        return string3;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final void x(InternalWalletDataHolder var1_1) {
        block26: {
            block28: {
                block27: {
                    var2_2 = this;
                    var3_3 = 1;
                    var4_4 = 1.4E-45f;
                    var5_5 = 0;
                    var6_6 = null;
                    var7_7 = var1_1;
                    Intrinsics.checkNotNullParameter(var1_1, "internalWalletDataHolder");
                    var8_8 = var1_1.getPaymentInstrumentInfo();
                    if (var8_8 == null) break block26;
                    var9_9 = var8_8.getName();
                    var10_10 = this.g;
                    var10_10.setText((CharSequence)var9_9);
                    var9_9 = this.c;
                    var11_11 /* !! */  = var9_9.H();
                    var12_12 = var11_11 /* !! */ .size();
                    var13_13 = null;
                    var14_14 = 0.0f;
                    if (var12_12 > var3_3) {
                        var11_11 /* !! */  = var8_8.getMultipleWalletEnabledAmount();
                        if (var11_11 /* !! */  != null) {
                            var15_15 = var11_11 /* !! */ .floatValue();
                        } else {
                            var12_12 = 0;
                            var15_15 = 0.0f;
                            var11_11 /* !! */  = null;
                        }
                        var12_12 = (int)((cfr_temp_0 = var15_15 - 0.0f) == 0.0f ? 0 : (cfr_temp_0 < 0.0f ? -1 : 1));
                        if (var12_12 <= 0 && (var12_12 = CollectionsKt.F((Iterable)(var11_11 /* !! */  = var9_9.H()), var16_16 = var8_8.getCode())) != 0) {
                            var11_11 /* !! */  = var9_9.H();
                            var16_16 = var8_8.getCode();
                            TypeIntrinsics.asMutableCollection(var11_11 /* !! */ ).remove(var16_16);
                            var11_11 /* !! */  = var9_9.M6();
                            if (var11_11 /* !! */  != null && (var17_17 = var11_11 /* !! */ .length()) != 0) {
                                ig0_0.Companion.getClass();
                                AJIOApplication.Companion.getClass();
                                var16_16 = AJIOApplication$a.a();
                                var18_18 = 12;
                                ig0_0.b((Context)var16_16, (String)var11_11 /* !! */ , null, var18_18);
                            }
                        }
                    }
                    if ((var12_12 = (int)CollectionsKt.F((Iterable)(var11_11 /* !! */  = var9_9.H()), var16_16 = var8_8.getCode())) == var3_3) {
                        var12_12 = 1;
                        var15_15 = 1.4E-45f;
                    } else {
                        var12_12 = 0;
                        var15_15 = 0.0f;
                        var11_11 /* !! */  = null;
                    }
                    var16_16 = var2_2.e;
                    var16_16.setChecked((boolean)var12_12);
                    var11_11 /* !! */  = var8_8.isNew();
                    var19_19 = Boolean.TRUE;
                    var12_12 = Intrinsics.areEqual(var11_11 /* !! */ , var19_19);
                    var18_18 = 8;
                    if (var12_12 != 0) {
                        var12_12 = 0;
                        var15_15 = 0.0f;
                        var11_11 /* !! */  = null;
                    } else {
                        var12_12 = 8;
                        var15_15 = 1.1E-44f;
                    }
                    var2_2.h.setVisibility(var12_12);
                    var11_11 /* !! */  = InternalWalletUtil.a;
                    var20_20 /* !! */  = var9_9.H();
                    var11_11 /* !! */ .getClass();
                    var15_15 = InternalWalletUtil.b((PaymentInstrumentInfo)var8_8, (HashSet)var20_20 /* !! */ );
                    var21_21 /* !! */  = var1_1.isDisable();
                    var22_22 /* !! */  = var2_2.f;
                    var23_23 /* !! */  = var2_2.d;
                    var24_24 /* !! */  = var2_2.j;
                    var3_3 = 1065353216;
                    var4_4 = 1.0f;
                    if (var21_21 /* !! */  != 0) {
                        var16_16.setAlpha(var4_4);
                        var10_10.setAlpha(var4_4);
                        var25_25 = cp_1.Companion;
                        var3_3 = (int)km_1.b((cp$a)var25_25);
                        if (var3_3 == 0) {
                            var23_23 /* !! */ .setVisibility(0);
                        } else {
                            var23_23 /* !! */ .setVisibility(var18_18);
                        }
                        var22_22 /* !! */ .setOnClickListener(null);
                        var24_24 /* !! */ .setOnClickListener(null);
                    } else {
                        cfr_temp_1 = var15_15 - 0.0f;
                        var21_21 /* !! */  = (int)(cfr_temp_1 == 0.0f ? 0 : (cfr_temp_1 < 0.0f ? -1 : 1));
                        if (var21_21 /* !! */  <= 0 && (var21_21 /* !! */  = (int)km_1.b((cp$a)(var20_20 /* !! */  = cp_1.Companion))) == 0) {
                            var16_16.setChecked(false);
                            var3_3 = 0x3F000000;
                            var4_4 = 0.5f;
                            var16_16.setAlpha(var4_4);
                            var10_10.setAlpha(var4_4);
                            var24_24 /* !! */ .setOnClickListener(null);
                        } else {
                            var16_16.setAlpha(var4_4);
                            var10_10.setAlpha(var4_4);
                            var25_25 = new fn_1(var2_2, (PaymentInstrumentInfo)var8_8);
                            var24_24 /* !! */ .setOnClickListener((View.OnClickListener)var25_25);
                        }
                        var23_23 /* !! */ .setVisibility(var18_18);
                        var25_25 = new gn_1(var2_2, var8_8, 0);
                        var22_22 /* !! */ .setOnClickListener((View.OnClickListener)var25_25);
                    }
                    var3_3 = (int)var16_16.isChecked();
                    var10_10 = "getString(...)";
                    var13_13 = "format(...)";
                    if (var3_3 != 0) {
                        var25_25 = StringCompanionObject.INSTANCE;
                        var25_25 = var16_16.getContext();
                        var17_17 = R$string.acc_plp_radio_button_selected;
                        var25_25 = var25_25.getString(var17_17);
                        Intrinsics.checkNotNullExpressionValue(var25_25, (String)var10_10);
                        var10_10 = var8_8.getName();
                        var18_18 = 1;
                        var16_16 = new Object[var18_18];
                        var16_16[0] = var10_10;
                        var25_25 = xh2_0.a((Object[])var16_16, var18_18, (String)var25_25, var13_13);
                    } else {
                        var18_18 = 1;
                        var25_25 = StringCompanionObject.INSTANCE;
                        var25_25 = var16_16.getContext();
                        var17_17 = R$string.acc_plp_radio_button_unselected;
                        var25_25 = var25_25.getString(var17_17);
                        Intrinsics.checkNotNullExpressionValue(var25_25, (String)var10_10);
                        var10_10 = var8_8.getName();
                        var16_16 = new Object[var18_18];
                        var16_16[0] = var10_10;
                        var25_25 = xh2_0.a((Object[])var16_16, var18_18, (String)var25_25, var13_13);
                    }
                    var24_24 /* !! */ .setContentDescription((CharSequence)var25_25);
                    var25_25 = var2_2.k;
                    ai0_2.i((View)var25_25);
                    var10_10 = "AJIO_CASH_WALLET";
                    var16_16 = var8_8.getCode();
                    var26_26 = Intrinsics.areEqual(var10_10, var16_16);
                    if (var26_26 != 0 && (var26_26 = (cfr_temp_2 = (var27_27 = var8_8.getGiftCardAmount()) - (var29_28 = 0.0)) == 0.0 ? 0 : (cfr_temp_2 > 0.0 ? 1 : -1)) > 0) {
                        var26_26 = R$string.ajio_gift_card_redemption_text;
                        var10_10 = hv3_0.K(var26_26);
                        var27_27 = var8_8.getGiftCardAmount();
                        var17_17 = ok1_1.a(var27_27);
                        var31_29 = var17_17;
                        var16_16 = qz2_0.x(Float.valueOf(var31_29));
                        var18_18 = 1;
                        var20_20 /* !! */  = new Object[var18_18];
                        var20_20 /* !! */ [0] = var16_16;
                        zn0_1.b(var20_20 /* !! */ , var18_18, (String)var10_10, var13_13, (TextView)var25_25);
                        ai0_2.B((View)var25_25);
                    }
                    if ((var25_25 = var8_8.getAvailableAmount()) != null) {
                        var4_4 = var25_25.floatValue();
                    } else {
                        var3_3 = 0;
                        var4_4 = 0.0f;
                        var25_25 = null;
                    }
                    var10_10 = var8_8.getCode();
                    var26_26 = (int)Intrinsics.areEqual("RELIANCE_ONE_WALLET", var10_10);
                    var16_16 = "getRsFormattedString(...)";
                    if (var26_26 == 0) break block27;
                    var32_30 = CollectionsKt.F((Iterable)(var9_9 = var9_9.H()), var10_10 = var8_8.getCode());
                    if (var32_30 != 0) ** GOTO lbl-1000
                    var9_9 = h40_0.a;
                    var32_30 = h40_0.h1();
                    if (var32_30 == 0) {
                        var9_9 = hv3_0.K(R$string.internal_wallet_balance);
                        var25_25 = kq2_1.a(var4_4);
                        Intrinsics.checkNotNullExpressionValue(var25_25, (String)var16_16);
                        var10_10 = FontsManager.getInstance();
                        AJIOApplication.Companion.getClass();
                        var11_11 /* !! */  = AJIOApplication$a.a();
                        var17_17 = 10;
                        var31_29 = 1.4E-44f;
                        var10_10 = var10_10.getTypefaceWithFont((Context)var11_11 /* !! */ , var17_17);
                        Intrinsics.checkNotNullExpressionValue(var10_10, "getTypefaceWithFont(...)");
                        var12_12 = 1;
                        var15_15 = 1.4E-45f;
                        var16_16 = new Object[var12_12];
                        var16_16[0] = var25_25;
                        var25_25 = xh2_0.a((Object[])var16_16, var12_12, (String)var9_9, var13_13);
                        var32_30 = 6;
                        var5_5 = StringsKt.O((CharSequence)var25_25, "is ", 0, false, var32_30);
                        var9_9 = new SpannableStringBuilder((CharSequence)var25_25);
                        var13_13 = "";
                        var11_11 /* !! */  = new AjioCustomTypefaceSpan(var13_13, (Typeface)var10_10);
                        var3_3 = var25_25.length();
                        var26_26 = 34;
                        var9_9.setSpan(var11_11 /* !! */ , var5_5 += 3, var3_3, var26_26);
                    } else lbl-1000:
                    // 2 sources

                    {
                        var5_5 = R$string.internal_wallet_eligible;
                        var6_6 = hv3_0.K(var5_5);
                        var9_9 = kq2_1.a(var15_15);
                        Intrinsics.checkNotNullExpressionValue(var9_9, (String)var16_16);
                        var25_25 = kq2_1.a(var4_4);
                        Intrinsics.checkNotNullExpressionValue(var25_25, (String)var16_16);
                        var9_9 = hn_1.w(var6_6, (String)var9_9, (String)var25_25);
                    }
                    break block28;
                }
                var5_5 = R$string.internal_wallet_eligible;
                var6_6 = hv3_0.K(var5_5);
                var9_9 = kq2_1.a(var15_15);
                Intrinsics.checkNotNullExpressionValue(var9_9, (String)var16_16);
                var25_25 = kq2_1.a(var4_4);
                Intrinsics.checkNotNullExpressionValue(var25_25, (String)var16_16);
                var9_9 = hn_1.w(var6_6, (String)var9_9, (String)var25_25);
            }
            var2_2.i.setText((CharSequence)var9_9);
            var25_25 = var8_8.getCode();
            var5_5 = (int)var1_1.isDisable();
            var8_8 = var8_8.getAvailableAmount();
            if (var25_25 != null && (var33_31 = var25_25.length()) != 0 && (var33_31 = (int)(var7_7 = InternalWalletUtil.e()).contains(var25_25)) == 0) {
                var7_7 = InternalWalletUtil.c((String)var25_25);
                var9_9 = new Bundle();
                var10_10 = InternalWalletUtil.c((String)var25_25);
                var11_11 /* !! */  = "Wallets Loaded event";
                var9_9.putString((String)var10_10, (String)var11_11 /* !! */ );
                if (var5_5 != 0) {
                    var6_6 = "auth";
                    var9_9.putString((String)var7_7, var6_6);
                } else {
                    var6_6 = "viewed";
                    var9_9.putString((String)var7_7, var6_6);
                }
                var6_6 = var7_7.concat("_cm");
                if (var8_8 != null) {
                    var14_14 = var8_8.floatValue();
                }
                var9_9.putFloat(var6_6, var14_14);
                var16_16 = var2_2.l;
                var19_19 = var16_16.getEC_BAG_INTERACTIONS();
                var22_22 /* !! */  = InternalWalletUtil.f((String)var25_25);
                var25_25 = InternalWalletUtil.d((String)var25_25);
                var6_6 = "_load";
                var23_23 /* !! */  = var25_25.concat(var6_6);
                var34_32 = 1536;
                var20_20 /* !! */  = "wallet load";
                var24_24 /* !! */  = "bag screen";
                var35_33 = "bag screen";
                var36_34 = "";
                var37_35 = "";
                NewCustomEventsRevamp.newPushCustomEvent$default((NewCustomEventsRevamp)var16_16, (String)var19_19, (String)var20_20 /* !! */ , (String)var22_22 /* !! */ , (String)var23_23 /* !! */ , (String)var24_24 /* !! */ , var35_33, var36_34, (Bundle)var9_9, var37_35, false, null, var34_32, null);
            }
        }
    }
}

