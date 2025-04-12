/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Intent
 *  android.os.Bundle
 */
package com.ril.ajio.earlyaccess;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.AnalyticsManager$Companion;
import com.ril.ajio.analytics.events.NewCustomEventsRevamp;
import com.ril.ajio.kmm.shared.model.home.transform.BannerData;
import com.ril.ajio.kmm.shared.model.home.transform.HotSpotT;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

public final class OnBoardingInfoActivity
extends AppCompatActivity
implements g71_0 {
    public final NewCustomEventsRevamp X;
    public ConstraintLayout Y;

    public OnBoardingInfoActivity() {
        NewCustomEventsRevamp newCustomEventsRevamp;
        this.X = newCustomEventsRevamp = AnalyticsManager.Companion.getInstance().getNewCustomEventsRevamp();
    }

    public final gw_2 D6() {
        return null;
    }

    public final void Y9(String string2, String string3, String string4, String string5, String string6) {
        Intrinsics.checkNotNullParameter(string2, "orderStatus");
        Intrinsics.checkNotNullParameter(string4, "returnId");
        Intrinsics.checkNotNullParameter(string5, "orderId");
        Intrinsics.checkNotNullParameter(string6, "position");
    }

    public final void Z6(BannerData bannerData, List list) {
        Intrinsics.checkNotNullParameter(bannerData, "bannerData");
        Intrinsics.checkNotNullParameter(list, "bannerList");
    }

    public final void c4(String string2, HotSpotT object, String string3, BannerData object2, String string4, String string5) {
        Intrinsics.checkNotNullParameter(object, "hotspot");
        Intrinsics.checkNotNullParameter(object2, "bannerData");
        string2 = "creativeSlot";
        Intrinsics.checkNotNullParameter(string5, string2);
        if (string3 != null) {
            string2 = null;
            object = "/dismiss";
            boolean bl2 = StringsKt.F(string3, (CharSequence)object, false);
            int n3 = -1;
            if (bl2) {
                this.p2("skip");
                string2 = new Intent();
                this.setResult(n3, (Intent)string2);
                this.finish();
            } else {
                string2 = new Intent();
                object2 = "onboarding_link_url";
                string2.putExtra((String)object2, string3);
                this.setResult(n3, (Intent)string2);
                string2 = "view early access schedule";
                this.p2(string2);
                this.finish();
            }
        }
    }

    public final void e0() {
    }

    public final void m(String string2) {
    }

    public final void onBackPressed() {
        Intent intent = new Intent();
        this.setResult(-1, intent);
        this.finish();
    }

    public final void onCreate(Bundle object) {
        super.onCreate((Bundle)object);
        int n3 = R$layout.cms_banner_view;
        this.setContentView(n3);
        n3 = R$id.containerOnboarding;
        object = (ConstraintLayout)this.findViewById(n3);
        this.Y = object;
        object = ww0_2.a;
        if (object != null) {
            Object object2 = object = object.get(0);
            object2 = (BannerData)object;
            if (object2 != null) {
                object = this.Y;
                if (object == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("container");
                    n3 = 0;
                    object = null;
                }
                int n4 = 56;
                V81.c((ConstraintLayout)((Object)object), (BannerData)object2, this, null, null, n4);
            }
        }
        object = E1.a("source_screen", "home landing screen");
        vb0_0.a(AnalyticsManager.Companion, "Early access education screen", object);
    }

    public final void p2(String string2) {
        NewCustomEventsRevamp newCustomEventsRevamp = this.X;
        String string3 = newCustomEventsRevamp.getEARLY_ACCESS_INTERACTION();
        Object object = AnalyticsManager.Companion;
        String string4 = bv_0.a((AnalyticsManager$Companion)object);
        String string5 = cv_0.a((AnalyticsManager$Companion)object);
        object = string2;
        NewCustomEventsRevamp.newPushCustomEvent$default(newCustomEventsRevamp, string3, string2, "", "event_early_access_interactions", "Early access education screen", "Early access education screen", string4, null, string5, false, null, 1536, null);
    }
}

