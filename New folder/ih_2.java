/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.widget.ImageView
 */
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import com.ril.ajio.R$drawable;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.AnalyticsManager$Companion;
import com.ril.ajio.analytics.events.GTMEvents;
import com.ril.ajio.customviews.widgets.AjioNonScrollableListView;
import com.ril.ajio.services.data.Home.CMSNavigation;
import com.ril.ajio.services.data.Home.NavImpl;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from iH
 */
public final class ih_2
implements View.OnClickListener {
    public final /* synthetic */ NavImpl a;
    public final /* synthetic */ kh_2 b;
    public final /* synthetic */ AjioNonScrollableListView c;
    public final /* synthetic */ ImageView d;

    public /* synthetic */ ih_2(CMSNavigation cMSNavigation, kh_2 kh_22, AjioNonScrollableListView ajioNonScrollableListView, ImageView imageView) {
        this.a = cMSNavigation;
        this.b = kh_22;
        this.c = ajioNonScrollableListView;
        this.d = imageView;
    }

    public final void onClick(View object) {
        AnalyticsManager$Companion analyticsManager$Companion;
        Object object2 = this.b;
        Intrinsics.checkNotNullParameter(object2, "this$0");
        object = ((CMSNavigation)this.a).getName();
        int n3 = TextUtils.isEmpty((CharSequence)object);
        if (n3 == 0) {
            analyticsManager$Companion = AnalyticsManager.Companion;
            GTMEvents gTMEvents = analyticsManager$Companion.getInstance().getGtmEvents();
            String string2 = "Global Nav";
            ak0_0.a(analyticsManager$Companion, gTMEvents, string2, (String)object);
            object2 = ((kh_2)((Object)object2)).e;
            ((jo_2)object2).x((String)object);
        }
        object = this.c;
        object2 = this.d;
        if (object != null && (n3 = object.getVisibility()) == 0) {
            n3 = 8;
            object.setVisibility(n3);
            if (object2 != null) {
                int n4 = R$drawable.ic_plus_grey;
                object2.setImageResource(n4);
            }
        } else {
            if (object != null) {
                n3 = 0;
                analyticsManager$Companion = null;
                object.setVisibility(0);
            }
            if (object2 != null) {
                int n7 = R$drawable.ic_subtract_grey;
                object2.setImageResource(n7);
            }
        }
    }
}

