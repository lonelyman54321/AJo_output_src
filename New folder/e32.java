/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 */
import android.text.TextUtils;
import com.jio.jioads.adinterfaces.a;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.AnalyticsManager$Companion;
import com.ril.ajio.analytics.events.GTMEvents;
import com.ril.ajio.customviews.widgets.TextViewLinkHandler;
import com.ril.ajio.services.data.Product.ProductPromotion;
import kotlin.jvm.internal.Intrinsics;

public final class e32
extends TextViewLinkHandler {
    public final /* synthetic */ ProductPromotion a;
    public final /* synthetic */ f32 b;

    public e32(f32 f322, ProductPromotion productPromotion) {
        this.a = productPromotion;
        this.b = f322;
    }

    public final void onLinkClick(String string2) {
        Intrinsics.checkNotNullParameter(string2, "url");
        ProductPromotion productPromotion = this.a;
        Object object = productPromotion.getTitle();
        boolean bl2 = TextUtils.isEmpty((CharSequence)object);
        Object object2 = "offerclick (App)";
        String string3 = "PDP: Click";
        String string4 = "Offer_";
        if (!bl2) {
            object = AnalyticsManager.Companion.getInstance().getGtmEvents();
            String string5 = productPromotion.getTitle();
            if (string5 != null) {
                int n3 = string5.length();
                int n4 = 1;
                n3 -= n4;
                int n7 = 0;
                boolean bl3 = false;
                while (n7 <= n3) {
                    int n8 = !bl3 ? n7 : n3;
                    n8 = string5.charAt(n8);
                    int n10 = 32;
                    n8 = Intrinsics.compare(n8, n10);
                    n8 = n8 <= 0 ? 1 : 0;
                    if (!bl3) {
                        if (n8 == 0) {
                            bl3 = true;
                            continue;
                        }
                        ++n7;
                        continue;
                    }
                    if (n8 == 0) break;
                    n3 += -1;
                }
                string5 = com.jio.jioads.adinterfaces.a.a(n3, n4, n7, string5);
            } else {
                string5 = null;
            }
            string5 = hv3_0.f(string5);
            StringBuilder stringBuilder = new StringBuilder(string4);
            stringBuilder.append((Object)string5);
            string4 = stringBuilder.toString();
            string5 = AnalyticsManager.Companion.getInstance().getGtmEvents().getScreenName();
            ((GTMEvents)object).pushEvent(string4, string3, object2, string5);
        } else {
            object = AnalyticsManager.Companion;
            GTMEvents gTMEvents = ((AnalyticsManager$Companion)object).getInstance().getGtmEvents();
            object = ((AnalyticsManager$Companion)object).getInstance().getGtmEvents().getScreenName();
            gTMEvents.pushEvent(string4, string3, object2, (String)object);
        }
        object2 = AnalyticsManager.Companion.getInstance().getGtmEvents();
        string4 = productPromotion.getCode();
        GTMEvents.pushButtonTapEvent$default((GTMEvents)object2, "offers", string4, "pdp screen", null, null, 16, null);
        this.b.a.z(string2);
    }
}

