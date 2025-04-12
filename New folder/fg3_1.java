/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.view.View
 *  android.view.View$OnClickListener
 */
import android.os.Bundle;
import android.view.View;
import com.ril.ajio.analytics.AnalyticsData;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.AnalyticsManager$Companion;
import com.ril.ajio.analytics.events.GTMEvents;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from fg3
 */
public final class fg3_1
implements View.OnClickListener {
    public final /* synthetic */ String a;
    public final /* synthetic */ Bundle b;
    public final /* synthetic */ hg3_0 c;
    public final /* synthetic */ String d;
    public final /* synthetic */ String e;
    public final /* synthetic */ Function0 f;
    public final /* synthetic */ Function2 g;
    public final /* synthetic */ Function1 h;

    public /* synthetic */ fg3_1(String string2, Bundle bundle, hg3_0 hg3_02, String string3, String string4, mv2_2 mv2_22, nv2_1 nv2_12, bb_1 bb_12) {
        this.a = string2;
        this.b = bundle;
        this.c = hg3_02;
        this.d = string3;
        this.e = string4;
        this.f = mv2_22;
        this.g = nv2_12;
        this.h = bb_12;
    }

    public final void onClick(View view) {
        AnalyticsData analyticsData;
        int n3;
        fg3_1 fg3_12 = this;
        Object object = this.b;
        Intrinsics.checkNotNullParameter(object, "$cd");
        hg3_0 hg3_02 = this.c;
        Intrinsics.checkNotNullParameter(hg3_02, "this$0");
        String string2 = this.e;
        Intrinsics.checkNotNullParameter(string2, "$searchText");
        Function0 function0 = this.f;
        Intrinsics.checkNotNullParameter(function0, "$callCategoryApi");
        Object object2 = this.g;
        Intrinsics.checkNotNullParameter(object2, "$trackZSREvents");
        Object object3 = this.h;
        Object object4 = "$setPlpTheme";
        Intrinsics.checkNotNullParameter(object3, (String)object4);
        String string3 = this.a;
        if (string3 != null) {
            object4 = "zsr_click";
            object2.invoke(object4, string3);
            object2 = ld3_2.STORE_LUXE.getStoreId();
            n3 = Intrinsics.areEqual(string3, object2);
            object3.invoke(string3);
            og1_1.g(n3 != 0, false);
            object2 = "storeName";
            Intrinsics.checkNotNullParameter(string3, (String)object2);
            od3_2.a = string3;
        }
        Object object5 = AnalyticsManager.Companion;
        Object object6 = ((AnalyticsManager$Companion)object5).getInstance().getGtmEvents();
        object2 = analyticsData;
        String string4 = string3;
        Function0 function02 = function0;
        String string5 = string2;
        hg3_0 hg3_03 = hg3_02;
        int n4 = 65023;
        view = object;
        analyticsData = new AnalyticsData(null, null, null, 0L, null, null, null, null, null, (Bundle)object, null, null, null, null, null, null, n4, null);
        object3 = object6;
        GTMEvents.pushButtonTapEvent$default((GTMEvents)object6, "store switcher", "Search Banner", "search screen", analyticsData, null, 16, null);
        object = hg3_02;
        object2 = hg3_02.p;
        hg3_02 = view;
        view.putString("searchTerm", (String)object2);
        object5 = ((AnalyticsManager$Companion)object5).getInstance().getGtmEvents();
        object2 = object6;
        int n7 = 0;
        long l2 = 0L;
        string3 = null;
        function0 = null;
        string2 = null;
        analyticsData = view;
        hg3_02 = null;
        hg3_0 hg3_04 = hg3_03;
        object = view;
        object6 = new AnalyticsData(null, null, null, l2, null, null, null, null, null, (Bundle)view, null, null, null, null, null, null, n4, null);
        String string6 = "search screen";
        object4 = "banner click";
        String string7 = "zerosearch results";
        int n8 = 16;
        object3 = object5;
        GTMEvents.pushButtonTapEvent$default((GTMEvents)object5, (String)object4, string7, string6, (AnalyticsData)object6, null, n8, null);
        object2 = fg3_12.d;
        if (object2 != null && (n3 = ((String)object2).length()) != 0) {
            function02.invoke();
        } else {
            object2 = string4;
            if (string4 != null) {
                object3 = hg3_04;
                object4 = hg3_04.d;
                object4.getClass();
                n7 = string4.length();
                string3 = n7 == 0 || (n7 = (int)(string4.equalsIgnoreCase(string7 = ld3_2.STORE_AJIO.getStoreId()) ? 1 : 0)) != 0 ? "rilfnl" : string4;
                ((hg3_0)object3).b.showProgress();
                object3 = string5;
                Intrinsics.checkNotNullParameter(string5, "queryString");
                object2 = ((yw2_0)object4).i;
                n7 = 0;
                string7 = null;
                ((yw2_0)object4).c(string5, false, (zr1_1)object2, string3);
            }
        }
    }
}

