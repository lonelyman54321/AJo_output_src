/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Application
 *  android.content.ClipData
 *  android.content.ClipboardManager
 *  android.content.Context
 *  android.content.Intent
 *  android.os.Build$VERSION
 *  android.os.Bundle
 *  android.os.Parcelable
 *  android.text.TextUtils
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.widget.ImageView
 */
package com.ril.ajio.gamezone;

import android.app.Application;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.R$string;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.AnalyticsManager$Companion;
import com.ril.ajio.analytics.events.GTMEvents;
import com.ril.ajio.analytics.events.NewCustomEventsRevamp;
import com.ril.ajio.analytics.events.NewEEcommerceEventsRevamp;
import com.ril.ajio.customviews.AjioLoaderView;
import com.ril.ajio.customviews.widgets.AjioTextView;
import com.ril.ajio.gamezone.GameZoneRewardsActivity$a;
import com.ril.ajio.services.data.gamezop.Body;
import com.ril.ajio.services.data.gamezop.GameZoneRewards;
import com.ril.ajio.services.helper.UrlHelper;
import com.ril.ajio.services.helper.UrlHelper$Companion;
import com.ril.ajio.view.BaseSplitActivity;
import com.ril.ajio.web.CustomWebViewActivity;
import com.ril.ajio.web.CustomWebViewActivity$a;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.b;

public final class GameZoneRewardsActivity
extends BaseSplitActivity
implements View.OnClickListener,
t13_0 {
    public static final GameZoneRewardsActivity$a Companion;
    public final NewCustomEventsRevamp A0;
    public final String B0;
    public final String C0;
    public AjioTextView X;
    public AjioTextView Y;
    public AjioTextView Z;
    public AjioTextView k0;
    public AjioTextView p0;
    public AjioTextView q0;
    public AjioTextView r0;
    public AjioTextView s0;
    public ImageView t0;
    public ImageView u0;
    public String v0 = "";
    public GameZoneRewards w0;
    public String x0;
    public AjioLoaderView y0;
    public final NewEEcommerceEventsRevamp z0;

    static {
        GameZoneRewardsActivity$a gameZoneRewardsActivity$a;
        Companion = gameZoneRewardsActivity$a = new Object();
    }

    public GameZoneRewardsActivity() {
        NewEEcommerceEventsRevamp newEEcommerceEventsRevamp;
        Object object = AnalyticsManager.Companion;
        this.z0 = newEEcommerceEventsRevamp = ((AnalyticsManager$Companion)object).getInstance().getNewEEcommerceEventsRevamp();
        this.A0 = object = ((AnalyticsManager$Companion)object).getInstance().getNewCustomEventsRevamp();
        this.B0 = object = newEEcommerceEventsRevamp.getPrevScreen();
        this.C0 = object = newEEcommerceEventsRevamp.getPrevScreenType();
    }

    public final void V1(String string2, String string3) {
        Intrinsics.checkNotNullParameter(string2, "shareLink");
        this.x0 = string2;
        this.y2(string2, string3);
    }

    /*
     * Enabled aggressive block sorting
     */
    public void onClick(View object) {
        String string2;
        String string3;
        String string4;
        Object object2;
        int n3;
        int n4;
        Object object3;
        int n7;
        block20: {
            block21: {
                block23: {
                    UrlHelper$Companion urlHelper$Companion;
                    block22: {
                        int n8;
                        int n10;
                        n7 = 0;
                        object3 = null;
                        if (object != null) {
                            n4 = object.getId();
                            object = n4;
                        } else {
                            n4 = 0;
                            object = null;
                        }
                        n3 = R$id.reward_tv_copy_coupon;
                        Object var6_6 = null;
                        object2 = "game reward screen";
                        string4 = "game reward screen clicks";
                        string3 = "gamezone";
                        if (object != null && (n10 = ((Integer)object).intValue()) == n3) {
                            object = AnalyticsManager.Companion.getInstance().getGtmEvents();
                            String string5 = "copy coupon";
                            ((GTMEvents)object).pushEvent(string3, string4, string5, (String)object2);
                            object = this.w0;
                            Intrinsics.checkNotNull(object);
                            object = ((GameZoneRewards)object).getBody();
                            Intrinsics.checkNotNull(object);
                            object = ((Body)object).getSerialNumberId();
                            if (object == null) return;
                            n4 = ((String)object).length();
                            if (n4 == 0) {
                                return;
                            }
                            object = this.w0;
                            Intrinsics.checkNotNull(object);
                            object = ((GameZoneRewards)object).getBody();
                            Intrinsics.checkNotNull(object);
                            object = ((Body)object).getSerialNumberId();
                            Intrinsics.checkNotNull(object);
                            Object object4 = this.getSystemService("clipboard");
                            Intrinsics.checkNotNull(object4, "null cannot be cast to non-null type android.content.ClipboardManager");
                            ClipboardManager clipboardManager = (ClipboardManager)object4;
                            object2 = "Ajio - Coupon Code";
                            object = ClipData.newPlainText((CharSequence)object2, (CharSequence)object);
                            if (object == null) return;
                            clipboardManager.setPrimaryClip((ClipData)object);
                            n4 = R$string.coupon_code_copied;
                            object = hv3_0.K(n4);
                            hv3_0.o0(0, (String)object, null);
                            return;
                        }
                        n3 = R$id.reward_imv_banner;
                        string2 = "getApplication(...)";
                        if (object == null || (n8 = ((Integer)object).intValue()) != n3) break block20;
                        object = AnalyticsManager.Companion.getInstance().getGtmEvents();
                        String string6 = "share";
                        ((GTMEvents)object).pushEvent(string3, string4, string6, (String)object2);
                        object = this.v0;
                        n4 = (int)(TextUtils.isEmpty((CharSequence)object) ? 1 : 0);
                        if (n4 != 0) {
                            return;
                        }
                        object = this.v0;
                        urlHelper$Companion = UrlHelper.Companion;
                        object2 = urlHelper$Companion.getInstance();
                        boolean bl2 = ((UrlHelper)object2).isUATDomain();
                        if (!bl2) break block21;
                        object2 = urlHelper$Companion.getInstance();
                        bl2 = ((UrlHelper)object2).isUAT1Domain();
                        string4 = "www.ajio.com";
                        if (!bl2) break block22;
                        if (object != null) {
                            object3 = b.n((String)object, "qa.services.ajio.com", string4, false);
                        }
                        break block23;
                    }
                    UrlHelper urlHelper = urlHelper$Companion.getInstance();
                    n3 = (int)(urlHelper.isUAT2Domain() ? 1 : 0);
                    if (n3 == 0) break block21;
                    if (object != null) {
                        object3 = b.n((String)object, "uat2.ajio.ril.com", string4, false);
                    }
                }
                object = object3;
            }
            n7 = R$string.game_zone_reward_share;
            object3 = hv3_0.K(n7);
            z40$a z40$a = z40_0.Companion;
            Application application = this.getApplication();
            Intrinsics.checkNotNullExpressionValue(application, string2);
            z40$a.getClass();
            String string7 = z40$a.a((Context)application).a.b("gamezone_utm_source");
            Application application2 = this.getApplication();
            Intrinsics.checkNotNullExpressionValue(application2, string2);
            String string8 = z40$a.a((Context)application2).a.b("gamezone_reward_utm_medium");
            Application application3 = this.getApplication();
            Intrinsics.checkNotNullExpressionValue(application3, string2);
            ao0_0 ao0_02 = z40$a.a((Context)application3).a;
            String string9 = "gamezone_utm_campaign";
            String string10 = ao0_02.b(string9);
            String string11 = this.x0;
            if (string11 != null && (n3 = string11.length()) != 0) {
                object = this.x0;
                if (object == null) {
                    object = "";
                }
                this.y2((String)object, (String)object3);
                return;
            }
            AjioLoaderView ajioLoaderView = this.y0;
            if (ajioLoaderView != null) {
                ajioLoaderView.startLoader();
            }
            cp_1.Companion.getClass();
            cp_1 cp_12 = cp$a.e();
            Intrinsics.checkNotNull(object);
            cp_12.getClass();
            String string12 = cp_1.c((String)object, string7, string8, string10, null, null);
            if (string12 != null) {
                object = string12;
            }
            d23_0.d((String)object3, (String)object, this);
            return;
        }
        n7 = R$id.reward_imv_close;
        if (object != null && (n3 = ((Integer)object).intValue()) == n7) {
            object = AnalyticsManager.Companion.getInstance().getGtmEvents();
            object3 = "close";
            ((GTMEvents)object).pushEvent(string3, string4, object3, (String)object2);
            this.finish();
            return;
        }
        n7 = R$id.reward_lbl_terms;
        if (object != null && (n3 = ((Integer)object).intValue()) == n7) {
            object = z40_0.Companion;
            object3 = this.getApplication();
            Intrinsics.checkNotNullExpressionValue(object3, string2);
            object.getClass();
            object = z40$a.a((Context)object3).a;
            object3 = "gamezone_terms_url";
            object = ((ao0_0)object).b((String)object3);
            n7 = ((String)object).length();
            if (n7 == 0) {
                return;
            }
            object3 = AnalyticsManager.Companion.getInstance().getGtmEvents();
            String string13 = "terms and condition";
            ((GTMEvents)object3).pushEvent(string3, string4, string13, (String)object2);
            object3 = CustomWebViewActivity.Companion;
            n3 = 16;
            CustomWebViewActivity$a.b((CustomWebViewActivity$a)object3, (Context)this, (String)object, n3);
            return;
        }
        n7 = R$id.reward_lbl_view_products;
        if (object == null) {
            return;
        }
        n4 = (Integer)object;
        if (n4 != n7) return;
        object = this.w0;
        if (object == null) return;
        if ((object = ((GameZoneRewards)object).getBody()) == null) return;
        object = this.w0;
        Intrinsics.checkNotNull(object);
        object = ((GameZoneRewards)object).getBody();
        Intrinsics.checkNotNull(object);
        object = ((Body)object).getPlpLink();
        n7 = (int)(TextUtils.isEmpty((CharSequence)object) ? 1 : 0);
        if (n7 != 0) return;
        AnalyticsManager.Companion.getInstance().getGtmEvents().pushEvent(string3, string4, "view applicable products", (String)object2);
        object3 = new Intent();
        Intrinsics.checkNotNull(object);
        String string14 = "http";
        n3 = (int)(b.s((String)object, string14, false) ? 1 : 0);
        if (n3 == 0) {
            String string15 = UrlHelper.Companion.getInstance().getBaseUrl();
            object = Ft2.a(string15, (String)object);
        }
        String string16 = "plp_url";
        object3.putExtra(string16, (String)object);
        n4 = -1;
        this.setResult(n4, (Intent)object3);
        this.finish();
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final void onCreate(Bundle var1_1) {
        block38: {
            var2_2 = null;
            var3_3 = 1;
            super.onCreate((Bundle)var1_1);
            var4_4 = R$layout.activity_gamezone_rewards;
            this.setContentView(var4_4);
            var1_1 = this.getIntent();
            var5_5 = null;
            if (var1_1 != null) {
                var6_6 = Build.VERSION.SDK_INT;
                var7_7 = 33;
                if (var6_6 > var7_7) {
                    var8_8 /* !! */  = (Parcelable)qy0_2.a((Intent)var1_1);
                } else {
                    var8_8 /* !! */  = var1_1.getParcelableExtra("GAME_ZONE_REWARDS");
                    var7_7 = var8_8 /* !! */  instanceof GameZoneRewards;
                    if (var7_7 == 0) {
                        var6_6 = 0;
                        var8_8 /* !! */  = null;
                    }
                    var8_8 /* !! */  = (GameZoneRewards)var8_8 /* !! */ ;
                }
                var8_8 /* !! */  = (GameZoneRewards)var8_8 /* !! */ ;
                this.w0 = var8_8 /* !! */ ;
                var8_8 /* !! */  = "ARG_GAME_ZONE_SHAREURL";
                var1_1 = var1_1.getStringExtra((String)var8_8 /* !! */ );
                this.v0 = var1_1;
            }
            var4_4 = R$id.ajio_loader_view;
            var1_1 = (AjioLoaderView)this.findViewById(var4_4);
            this.y0 = var1_1;
            var4_4 = R$id.reward_imv_rewardType;
            var1_1 = (ImageView)this.findViewById(var4_4);
            this.u0 = var1_1;
            var4_4 = R$id.reward_tv_sub_label;
            var1_1 = (AjioTextView)this.findViewById(var4_4);
            this.Y = var1_1;
            var4_4 = R$id.reward_tv_label;
            var1_1 = (AjioTextView)this.findViewById(var4_4);
            this.X = var1_1;
            var4_4 = R$id.reward_tv_coupon_code;
            var1_1 = (AjioTextView)this.findViewById(var4_4);
            this.Z = var1_1;
            var4_4 = R$id.reward_tv_copy_coupon;
            var1_1 = (AjioTextView)this.findViewById(var4_4);
            this.k0 = var1_1;
            var4_4 = R$id.reward_tv_info;
            var1_1 = (AjioTextView)this.findViewById(var4_4);
            var4_4 = R$id.reward_lbl_view_products;
            var1_1 = (AjioTextView)this.findViewById(var4_4);
            this.p0 = var1_1;
            var4_4 = R$id.reward_tv_expiry;
            var1_1 = (AjioTextView)this.findViewById(var4_4);
            this.q0 = var1_1;
            var4_4 = R$id.reward_tv_received;
            var1_1 = (AjioTextView)this.findViewById(var4_4);
            this.r0 = var1_1;
            var4_4 = R$id.reward_lbl_terms;
            var1_1 = (AjioTextView)this.findViewById(var4_4);
            this.s0 = var1_1;
            var4_4 = R$id.reward_imv_banner;
            var1_1 = (ImageView)this.findViewById(var4_4);
            this.t0 = var1_1;
            var4_4 = R$id.reward_imv_close;
            ((ImageView)this.findViewById(var4_4)).setOnClickListener((View.OnClickListener)this);
            var1_1 = this.s0;
            if (var1_1 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("termsTv");
                var4_4 = 0;
                var1_1 = null;
            }
            var1_1.setOnClickListener((View.OnClickListener)this);
            var1_1 = this.p0;
            var8_8 /* !! */  = "viewProductTv";
            if (var1_1 == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)var8_8 /* !! */ );
                var4_4 = 0;
                var1_1 = null;
            }
            var1_1.setOnClickListener((View.OnClickListener)this);
            var1_1 = this.k0;
            if (var1_1 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("copyTv");
                var4_4 = 0;
                var1_1 = null;
            }
            var1_1.setOnClickListener((View.OnClickListener)this);
            var1_1 = this.t0;
            var9_9 = "bannerImv";
            if (var1_1 == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)var9_9);
                var4_4 = 0;
                var1_1 = null;
            }
            var1_1.setOnClickListener((View.OnClickListener)this);
            var1_1 = this.w0;
            if (var1_1 == null || (var1_1 = var1_1.getBody()) == null) break block38;
            var1_1 = this.w0;
            Intrinsics.checkNotNull(var1_1);
            var1_1 = var1_1.getBody();
            Intrinsics.checkNotNull(var1_1);
            var1_1 = var1_1.getBannerImageURL();
            if (var1_1 != null && (var4_4 = var1_1.length()) != 0) {
                var1_1 = new da$a();
                var1_1.k = var3_3;
                var1_1.r = var3_3;
                var10_10 = R$string.acc_banner;
                var11_11 = hv3_0.K(var10_10);
                var1_1.b((String)var11_11);
                var11_11 = UrlHelper.Companion.getInstance();
                var12_12 = this.w0;
                Intrinsics.checkNotNull(var12_12);
                var12_12 = var12_12.getBody();
                Intrinsics.checkNotNull(var12_12);
                var12_12 = var12_12.getBannerImageURL();
                var11_11 = var11_11.getImageUrl((String)var12_12);
                var12_12 = this.u0;
                if (var12_12 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("rewardTypeImv");
                    var12_12 = null;
                }
                var1_1.n = var11_11;
                var1_1.u = var12_12;
                var1_1.a();
            }
            var1_1 = this.w0;
            Intrinsics.checkNotNull(var1_1);
            var1_1 = var1_1.getBody();
            Intrinsics.checkNotNull(var1_1);
            var1_1 = var1_1.getGameBannerImageURL();
            if (var1_1 != null && (var4_4 = var1_1.length()) != 0) {
                var1_1 = new da$a();
                var1_1.k = var3_3;
                var1_1.r = var3_3;
                var10_10 = R$string.acc_banner;
                var11_11 = hv3_0.K(var10_10);
                var1_1.b((String)var11_11);
                var11_11 = UrlHelper.Companion.getInstance();
                var12_12 = this.w0;
                Intrinsics.checkNotNull(var12_12);
                var12_12 = var12_12.getBody();
                Intrinsics.checkNotNull(var12_12);
                var12_12 = var12_12.getGameBannerImageURL();
                var11_11 = var11_11.getImageUrl((String)var12_12);
                var12_12 = this.t0;
                if (var12_12 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)var9_9);
                    var12_12 = null;
                }
                var1_1.n = var11_11;
                var1_1.u = var12_12;
                var1_1.a();
            }
            var1_1 = this.w0;
            Intrinsics.checkNotNull(var1_1);
            var1_1 = var1_1.getBody();
            Intrinsics.checkNotNull(var1_1);
            var1_1 = var1_1.getExpiryDate();
            var9_9 = "dd MMM yyyy";
            var13_13 = 0L;
            var15_14 = 8;
            if (var1_1 == null) ** GOTO lbl-1000
            var1_1 = this.w0;
            Intrinsics.checkNotNull(var1_1);
            var1_1 = var1_1.getBody();
            Intrinsics.checkNotNull(var1_1);
            var1_1 = var1_1.getExpiryDate();
            Intrinsics.checkNotNull(var1_1);
            var16_15 = var1_1.longValue();
            var4_4 = (int)(var16_15 == var13_13 ? 0 : (var16_15 < var13_13 ? -1 : 1));
            if (var4_4 > 0) {
                var1_1 = this.p0;
                if (var1_1 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)var8_8 /* !! */ );
                    var4_4 = 0;
                    var1_1 = null;
                }
                var1_1.setVisibility(0);
                var1_1 = this.w0;
                Intrinsics.checkNotNull(var1_1);
                var1_1 = var1_1.getBody();
                Intrinsics.checkNotNull(var1_1);
                var1_1 = var1_1.getExpiryDate();
                Intrinsics.checkNotNull(var1_1);
                var16_15 = var1_1.longValue();
                var1_1 = k7.f(var16_15, (String)var9_9);
                var18_16 = this.q0;
                if (var18_16 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("expiryTv");
                    var18_16 = null;
                }
                var19_17 = R$string.reward_expires_on;
                var20_18 = new Object[var3_3];
                var20_18[0] = var1_1;
                var1_1 = hv3_0.L(var19_17, var20_18);
                var18_16.setText((CharSequence)var1_1);
            } else lbl-1000:
            // 2 sources

            {
                if ((var1_1 = this.p0) == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)var8_8 /* !! */ );
                    var4_4 = 0;
                    var1_1 = null;
                }
                var1_1.setVisibility(var15_14);
            }
            var1_1 = this.w0;
            Intrinsics.checkNotNull(var1_1);
            var1_1 = var1_1.getBody();
            Intrinsics.checkNotNull(var1_1);
            var1_1 = var1_1.getActiveDate();
            var18_16 = "receivedTv";
            if (var1_1 == null) ** GOTO lbl-1000
            var1_1 = this.w0;
            Intrinsics.checkNotNull(var1_1);
            var1_1 = var1_1.getBody();
            Intrinsics.checkNotNull(var1_1);
            var1_1 = var1_1.getActiveDate();
            Intrinsics.checkNotNull(var1_1);
            var21_19 = var1_1.longValue();
            var4_4 = (int)(var21_19 == var13_13 ? 0 : (var21_19 < var13_13 ? -1 : 1));
            if (var4_4 > 0) {
                var1_1 = this.r0;
                if (var1_1 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)var18_16);
                    var4_4 = 0;
                    var1_1 = null;
                }
                var1_1.setVisibility(0);
                var1_1 = this.w0;
                Intrinsics.checkNotNull(var1_1);
                var1_1 = var1_1.getBody();
                Intrinsics.checkNotNull(var1_1);
                var1_1 = var1_1.getActiveDate();
                Intrinsics.checkNotNull(var1_1);
                var13_13 = var1_1.longValue();
                var1_1 = k7.f(var13_13, (String)var9_9);
                var9_9 = this.r0;
                if (var9_9 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)var18_16);
                    var7_7 = 0;
                    var9_9 = null;
                }
                var10_10 = R$string.received_on;
                var23_20 = new Object[var3_3];
                var23_20[0] = var1_1;
                var1_1 = hv3_0.L(var10_10, (Object[])var23_20);
                var9_9.setText((CharSequence)var1_1);
            } else lbl-1000:
            // 2 sources

            {
                if ((var1_1 = this.r0) == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)var18_16);
                    var4_4 = 0;
                    var1_1 = null;
                }
                var1_1.setVisibility(var15_14);
            }
            var1_1 = this.w0;
            Intrinsics.checkNotNull(var1_1);
            var1_1 = var1_1.getBody();
            Intrinsics.checkNotNull(var1_1);
            var1_1 = var1_1.getExtraLabel();
            var23_20 = "subLabelTv";
            if (var1_1 != null && (var4_4 = var1_1.length()) != 0) {
                var1_1 = this.Y;
                if (var1_1 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)var23_20);
                    var4_4 = 0;
                    var1_1 = null;
                }
                var23_20 = this.w0;
                Intrinsics.checkNotNull(var23_20);
                var23_20 = var23_20.getBody();
                Intrinsics.checkNotNull(var23_20);
                var23_20 = var23_20.getExtraLabel();
                var1_1.setText((CharSequence)var23_20);
            } else {
                var1_1 = this.Y;
                if (var1_1 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)var23_20);
                    var4_4 = 0;
                    var1_1 = null;
                }
                var1_1.setVisibility(var15_14);
            }
            var1_1 = this.w0;
            Intrinsics.checkNotNull(var1_1);
            var1_1 = var1_1.getBody();
            Intrinsics.checkNotNull(var1_1);
            var1_1 = var1_1.getLabel();
            var23_20 = "labelTv";
            if (var1_1 != null && (var4_4 = var1_1.length()) != 0) {
                var1_1 = this.X;
                if (var1_1 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)var23_20);
                    var4_4 = 0;
                    var1_1 = null;
                }
                var1_1.setVisibility(0);
                var1_1 = this.X;
                if (var1_1 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)var23_20);
                    var4_4 = 0;
                    var1_1 = null;
                }
                var23_20 = this.w0;
                Intrinsics.checkNotNull(var23_20);
                var23_20 = var23_20.getBody();
                Intrinsics.checkNotNull(var23_20);
                var23_20 = var23_20.getLabel();
                var1_1.setText((CharSequence)var23_20);
            } else {
                var1_1 = this.X;
                if (var1_1 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)var23_20);
                    var4_4 = 0;
                    var1_1 = null;
                }
                var1_1.setVisibility(var15_14);
            }
            var1_1 = this.w0;
            Intrinsics.checkNotNull(var1_1);
            var1_1 = var1_1.getBody();
            Intrinsics.checkNotNull(var1_1);
            var1_1 = var1_1.getPlpLink();
            if (var1_1 != null && (var4_4 = var1_1.length()) != 0) {
                var1_1 = this.p0;
                if (var1_1 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)var8_8 /* !! */ );
                    var4_4 = 0;
                    var1_1 = null;
                }
                var1_1.setVisibility(0);
            } else {
                var1_1 = this.p0;
                if (var1_1 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)var8_8 /* !! */ );
                    var4_4 = 0;
                    var1_1 = null;
                }
                var1_1.setVisibility(var15_14);
            }
            var1_1 = this.w0;
            Intrinsics.checkNotNull(var1_1);
            var1_1 = var1_1.getBody();
            Intrinsics.checkNotNull(var1_1);
            var1_1 = var1_1.getSerialNumberId();
            if (var1_1 != null && (var4_4 = var1_1.length()) != 0) {
                var1_1 = this.Z;
                if (var1_1 == null) {
                    var1_1 = "couponTv";
                    Intrinsics.throwUninitializedPropertyAccessException((String)var1_1);
                } else {
                    var5_5 = var1_1;
                }
                var1_1 = this.w0;
                Intrinsics.checkNotNull(var1_1);
                var1_1 = var1_1.getBody();
                Intrinsics.checkNotNull(var1_1);
                var1_1 = var1_1.getSerialNumberId();
                var5_5.setText((CharSequence)var1_1);
            }
        }
        AnalyticsManager.Companion.getInstance().getGtmEvents().pushOpenScreenEvent("game reward screen");
        var11_11 = new Bundle();
        var1_1 = this.A0;
        var2_2 = var1_1.getTOTAL_SCORE();
        var23_20 = "";
        var11_11.putString(var2_2, (String)var23_20);
        var1_1 = var1_1.getREWARD_TYPE();
        var11_11.putString((String)var1_1, (String)var23_20);
        var23_20 = this.A0;
        var9_9 = this.B0;
        var12_12 = this.C0;
        var23_20.newPushCustomScreenView("game reward screen", "game screen", (String)var9_9, (Bundle)var11_11, (String)var12_12);
    }

    public final void onStop() {
        super.onStop();
        this.z0.setPreviousScreenData("game reward screen", "game screen");
    }

    public final void y2(String string2, String string3) {
        int n3 = 1;
        Object object = this.y0;
        if (object != null) {
            object.stopLoader();
        }
        object = StringCompanionObject.INSTANCE;
        if (string3 == null) {
            string3 = "";
        }
        string2 = String.valueOf(string2);
        object = new Object[n3];
        object[0] = string2;
        string2 = xh2_0.a(object, n3, string3, "format(...)");
        string3 = hv3_0.K(R$string.share_with_friends);
        d23_0.f((Context)this, string2, "GameZone", null, string3);
    }
}

