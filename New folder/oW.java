/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 */
import android.view.View;
import androidx.recyclerview.widget.RecyclerView$B;
import com.ril.ajio.R$id;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.events.GTMEvents;
import com.ril.ajio.kmm.shared.model.home.CTASettings;
import com.ril.ajio.kmm.shared.model.home.transform.BannerData;
import com.ril.ajio.kmm.shared.model.home.transform.HomeRowData;
import com.ril.ajio.services.data.Product.WidgetRecord;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.b;

public final class oW
implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ RecyclerView$B b;

    public /* synthetic */ oW(RecyclerView$B recyclerView$B, int n3) {
        this.a = n3;
        this.b = recyclerView$B;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void onClick(View view) {
        int n3 = this.a;
        switch (n3) {
            default: {
                Object object;
                boolean bl2;
                Object object2 = (mf0_1)this.b;
                Intrinsics.checkNotNullParameter(object2, "this$0");
                Object object3 = ((mf0_1)object2).b;
                boolean bl3 = false;
                Boolean bl4 = null;
                Boolean bl5 = null;
                if (object3 != null && (object3 = ((HomeRowData)object3).getBanners()) != null && (object3 = (BannerData)CollectionsKt.N(0, (List)object3)) != null) {
                    object3 = ((BannerData)object3).getBannerType();
                } else {
                    bl2 = false;
                    object3 = null;
                }
                bl2 = kotlin.text.b.i((String)object3, "RECOMMENDED_PRODUCTS", false);
                x82_0 x82_02 = ((mf0_1)object2).c;
                HomeRowData homeRowData = ((mf0_1)object2).b;
                if (bl2) {
                    if (homeRowData == null) return;
                    object3 = homeRowData.getBanners();
                    if (object3 == null) return;
                    if ((object3 = (BannerData)CollectionsKt.N(0, (List)object3)) == null) return;
                    if ((object3 = ((BannerData)object3).getCtaSettings()) == null) return;
                    if ((object3 = ((CTASettings)object3).getCtaLink()) == null) return;
                    if (x82_02 != null) {
                        x82_02.h((String)object3);
                    }
                    ((mf0_1)object2).w(false, false);
                    return;
                }
                if (homeRowData != null && (object3 = homeRowData.getBanners()) != null && (object3 = (BannerData)CollectionsKt.N(0, (List)object3)) != null) {
                    object3 = ((BannerData)object3).getWidgetLevel();
                } else {
                    bl2 = false;
                    object3 = null;
                }
                Object object4 = "USER";
                bl2 = Intrinsics.areEqual(object3, object4);
                boolean bl6 = bl2 ^ true;
                ((mf0_1)object2).w(bl2, bl6);
                Object object5 = homeRowData != null && (object2 = homeRowData.getBanners()) != null && (object2 = (BannerData)CollectionsKt.N(0, (List)object2)) != null ? (object2 = ((BannerData)object2).getFeedLogic()) : null;
                if (homeRowData != null && (object2 = homeRowData.getBanners()) != null && (object2 = (BannerData)CollectionsKt.N(0, (List)object2)) != null) {
                    object = object2 = ((BannerData)object2).getWidgetLevel();
                } else {
                    boolean bl7 = false;
                    object = null;
                }
                if (homeRowData != null && (object2 = homeRowData.getBanners()) != null && (object2 = (BannerData)CollectionsKt.N(0, (List)object2)) != null) {
                    object2 = ((BannerData)object2).getNoOfproducts();
                } else {
                    n3 = 0;
                    object2 = null;
                }
                String string2 = String.valueOf(object2);
                Object object6 = homeRowData != null ? (object2 = homeRowData.getHeading()) : null;
                object2 = od3_2.a();
                object3 = ld3_2.STORE_AJIO.getStoreId();
                bl2 = Intrinsics.areEqual(object2, object3);
                if (bl2) {
                    object2 = "rilfnl";
                }
                Object object7 = object2;
                if (homeRowData != null && (object2 = homeRowData.getBanners()) != null && (object2 = (BannerData)CollectionsKt.N(0, (List)object2)) != null) {
                    bl5 = ((BannerData)object2).getShowDefault();
                }
                int n4 = 848;
                object4 = object2;
                object2 = new WidgetRecord((String)object5, (String)object, string2, (String)object6, null, bl5, null, (String)object7, null, null, n4, null);
                if (x82_02 == null) return;
                if (homeRowData != null && (object3 = homeRowData.getBanners()) != null && (object3 = (BannerData)CollectionsKt.N(0, (List)object3)) != null) {
                    object3 = ((BannerData)object3).getEnableAdsOnPlp();
                    bl4 = Boolean.TRUE;
                    bl3 = Intrinsics.areEqual(object3, bl4);
                }
                x82_02.o((WidgetRecord)object2, bl3);
                return;
            }
            case 0: 
        }
        Object object = (pw_0)this.b;
        Object object8 = "this$0";
        Intrinsics.checkNotNullParameter(object, (String)object8);
        int n7 = view.getId();
        int n8 = R$id.lhcciMainLayout;
        if (n7 != n8) return;
        object8 = ((pw_0)object).b;
        if (object8 != null) {
            object = g71_0.Companion;
            object.getClass();
            object8.e0();
            return;
        }
        String string3 = "CLOSET";
        int n10 = -1;
        String string4 = "closet";
        String string5 = null;
        int n14 = -1;
        int n15 = 0;
        Object var11_20 = null;
        Object var16_29 = null;
        String string6 = "closet";
        Object object9 = object8;
        object8 = new hp1_2(string4, null, n14, null, string3, n10, null, string6);
        object = ((pw_0)object).a;
        if (object != null) {
            object.La((hp1_2)object8);
        }
        object = AnalyticsManager.Companion.getInstance();
        object8 = ((AnalyticsManager)object).getGtmEvents();
        string5 = "landing screen";
        n14 = 0;
        Object var10_18 = null;
        object9 = "closet widget";
        string4 = "view wishlist click";
        n15 = 8;
        string3 = null;
        GTMEvents.pushWidgetInteractionEvent$default((GTMEvents)object8, (String)object9, string4, string5, null, n15, null);
    }
}

