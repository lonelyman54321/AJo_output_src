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
import com.ril.ajio.services.data.Home.NavImpl;
import com.ril.ajio.services.data.Home.Navigation;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from DD1
 */
public final class dd1_1
implements View.OnClickListener {
    public final /* synthetic */ NavImpl a;
    public final /* synthetic */ fd1_1 b;

    public /* synthetic */ dd1_1(Navigation navigation, fd1_1 fd1_12) {
        this.a = navigation;
        this.b = fd1_12;
    }

    public final void onClick(View object) {
        Object object2 = this.b;
        Intrinsics.checkNotNullParameter(object2, "this$0");
        object = ((Navigation)this.a).getName();
        boolean bl2 = TextUtils.isEmpty((CharSequence)object);
        if (!bl2) {
            AnalyticsManager$Companion analyticsManager$Companion = AnalyticsManager.Companion;
            GTMEvents gTMEvents = analyticsManager$Companion.getInstance().getGtmEvents();
            String string2 = "Global Nav";
            ak0_0.a(analyticsManager$Companion, gTMEvents, string2, (String)object);
            object2 = ((fd1_1)((Object)object2)).e;
            ((jo_2)object2).x((String)object);
        }
    }
}

