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
 * Renamed from ig3
 */
public final class ig3_0
implements View.OnClickListener {
    public final /* synthetic */ Function1 a;
    public final /* synthetic */ String b;
    public final /* synthetic */ Function2 c;
    public final /* synthetic */ String d;
    public final /* synthetic */ String e;
    public final /* synthetic */ kg3_1 f;
    public final /* synthetic */ Function0 g;

    public /* synthetic */ ig3_0(GR0 gR0, String string2, pv2_1 pv2_12, String string3, String string4, kg3_1 kg3_12, ov2_2 ov2_22) {
        this.a = gR0;
        this.b = string2;
        this.c = pv2_12;
        this.d = string3;
        this.e = string4;
        this.f = kg3_12;
        this.g = ov2_22;
    }

    public final void onClick(View view) {
        int n3;
        AnalyticsData analyticsData;
        AnalyticsData analyticsData2;
        Function1 function1 = this.a;
        Intrinsics.checkNotNullParameter(function1, "$setPlpTheme");
        Object object = this.c;
        Intrinsics.checkNotNullParameter(object, "$trackZSREvents");
        Object object2 = this.f;
        Intrinsics.checkNotNullParameter(object2, "this$0");
        Function0 function0 = this.g;
        Intrinsics.checkNotNullParameter(function0, "$callCategoryApi");
        String string2 = this.b;
        function1.invoke(string2);
        function1 = null;
        og1_1.g(false, false);
        Intrinsics.checkNotNullParameter(string2, "storeName");
        od3_2.a = string2;
        object.invoke("zsr_click", string2);
        Function2 function2 = object;
        object = new Bundle();
        AnalyticsManager$Companion analyticsManager$Companion = AnalyticsManager.Companion;
        Object object3 = analyticsManager$Companion.getInstance().getGtmEvents();
        Object object4 = analyticsData2;
        long l2 = 0L;
        int n4 = 65023;
        analyticsData2 = new AnalyticsData(null, null, null, l2, null, null, null, null, null, (Bundle)object, null, null, null, null, null, null, n4, null);
        Object object5 = object3;
        Object object6 = analyticsData2;
        GTMEvents.pushButtonTapEvent$default((GTMEvents)object3, "store switcher", "Search Banner", "search screen", analyticsData2, null, 16, null);
        object4 = "searchTerm";
        object5 = this.d;
        object.putString((String)object4, (String)object5);
        GTMEvents gTMEvents = analyticsManager$Companion.getInstance().getGtmEvents();
        object3 = analyticsData;
        analyticsData2 = null;
        long l3 = 0L;
        int n7 = 65023;
        analyticsData = new AnalyticsData(null, null, null, l3, null, null, null, null, null, (Bundle)function2, null, null, null, null, null, null, n7, null);
        object6 = "search screen";
        String string3 = "banner click";
        String string4 = "zerosearch results";
        int n8 = 16;
        GTMEvents.pushButtonTapEvent$default(gTMEvents, string3, string4, (String)object6, analyticsData, null, n8, null);
        object = this.e;
        if (object != null && (n3 = ((String)object).length()) != 0) {
            function0.invoke();
        } else {
            object = ((kg3_1)object2).d;
            object.getClass();
            n3 = string2.length();
            if (n3 == 0 || (n3 = (int)(string2.equalsIgnoreCase((String)(object = ld3_2.STORE_AJIO.getStoreId())) ? 1 : 0)) != 0) {
                string2 = "rilfnl";
            }
            ((kg3_1)object2).b.showProgress();
            object = ((kg3_1)object2).d;
            object.getClass();
            Intrinsics.checkNotNullParameter(object5, "queryString");
            object2 = ((yw2_0)object).i;
            ((yw2_0)object).c((String)object5, false, (zr1_1)object2, string2);
        }
    }
}

