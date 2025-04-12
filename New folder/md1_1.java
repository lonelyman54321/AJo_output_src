/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 *  android.view.View
 *  android.view.View$OnClickListener
 */
import android.text.TextUtils;
import android.view.View;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.AnalyticsManager$Companion;
import com.ril.ajio.analytics.events.GTMEvents;
import com.ril.ajio.services.data.Home.CMSNavigation;
import com.ril.ajio.services.data.Home.NavImpl;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from mD1
 */
public final class md1_1
implements View.OnClickListener {
    public final /* synthetic */ NavImpl a;
    public final /* synthetic */ od1_2 b;

    public /* synthetic */ md1_1(CMSNavigation cMSNavigation, od1_2 od1_22) {
        this.a = cMSNavigation;
        this.b = od1_22;
    }

    public final void onClick(View object) {
        Object object2 = this.b;
        Intrinsics.checkNotNullParameter(object2, "this$0");
        object = ((CMSNavigation)this.a).getName();
        boolean bl2 = TextUtils.isEmpty((CharSequence)object);
        if (!bl2) {
            AnalyticsManager$Companion analyticsManager$Companion = AnalyticsManager.Companion;
            GTMEvents gTMEvents = analyticsManager$Companion.getInstance().getGtmEvents();
            String string2 = "Global Nav";
            ak0_0.a(analyticsManager$Companion, gTMEvents, string2, (String)object);
            object2 = ((od1_2)((Object)object2)).e;
            ((jo_2)object2).x((String)object);
        }
    }
}

