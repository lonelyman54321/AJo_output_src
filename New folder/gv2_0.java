/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 */
import android.os.Bundle;
import com.ril.ajio.analytics.AnalyticsData;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.AnalyticsManager$Companion;
import com.ril.ajio.analytics.events.GTMEvents;
import com.ril.ajio.analytics.events.NewCustomEventsRevamp;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/*
 * Renamed from gv2
 */
public final class gv2_0
extends qg3_2
implements Function2 {
    public final /* synthetic */ bv2_0 a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ String d;

    public gv2_0(bv2_0 bv2_02, int n3, int n4, String string2, f80_0 f80_02) {
        this.a = bv2_02;
        this.b = n3;
        this.c = n4;
        this.d = string2;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        int n3 = this.c;
        String string2 = this.d;
        bv2_0 bv2_02 = this.a;
        int n4 = this.b;
        object = new gv2_0(bv2_02, n4, n3, string2, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (gv2_0)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((gv2_0)object).invokeSuspend(object2);
    }

    public final Object invokeSuspend(Object object) {
        Object object2 = j90_0.COROUTINE_SUSPENDED;
        vl2_2.b(object);
        object2 = this.a;
        Object object3 = ((bv2_0)object2).E1;
        int n3 = this.b;
        Object object4 = new Integer(n3);
        boolean bl2 = object3.contains(object4);
        if (!bl2) {
            Object object5 = object3;
            object3 = new Bundle();
            int n4 = this.c;
            object3.putInt("no_of_filters", n4);
            object3.putInt("position_of_filter", n3);
            Object object6 = object3;
            long l2 = 0L;
            String string2 = null;
            String string3 = null;
            String string4 = null;
            String string5 = null;
            String string6 = null;
            String string7 = null;
            String string8 = null;
            int n7 = 65023;
            object3 = new AnalyticsData(null, null, null, l2, null, null, null, null, null, (Bundle)object5, null, null, null, null, null, null, n7, null);
            object4 = AnalyticsManager.Companion;
            object6 = ((AnalyticsManager$Companion)object4).getInstance().getGtmEvents();
            String string9 = av_0.a((AnalyticsManager$Companion)object4);
            String string10 = "visual filter - widget view";
            String string11 = this.d;
            String string12 = "widget_impression_visual_filter";
            Object object7 = object3;
            ((GTMEvents)object6).gtmEventsToGaWithCategory("widget interaction", string12, string10, string11, string9, (AnalyticsData)object3);
            object3 = new Bundle();
            object6 = ((bv2_0)object2).h1;
            object3.putString("plp_source", (String)object6);
            n4 = (int)(((bv2_0)object2).y ? 1 : 0);
            String string13 = "plp_source_details";
            if (n4 != 0) {
                object6 = "image upload";
                object3.putString(string13, (String)object6);
            } else {
                object6 = ((bv2_0)object2).i1;
                object3.putString(string13, (String)object6);
            }
            object7 = ((bv2_0)object2).g1;
            string2 = ((NewCustomEventsRevamp)object7).getEC_PRODUCT_LIST_INTERACTIONS();
            object5 = o72_0.a;
            string7 = bv_0.a((AnalyticsManager$Companion)object4);
            string8 = cv_0.a((AnalyticsManager$Companion)object4);
            string3 = "visual filter view";
            string4 = "";
            string5 = "plp_visual_filter_view";
            string6 = "plp screen";
            n7 = 1536;
            NewCustomEventsRevamp.newPushCustomEvent$default((NewCustomEventsRevamp)object7, string2, string3, string4, string5, (String)object5, string6, string7, (Bundle)object3, string8, false, null, n7, null);
            object2 = ((bv2_0)object2).E1;
            object3 = new Integer(n3);
            object2.add(object3);
        }
        return Unit.a;
    }
}

