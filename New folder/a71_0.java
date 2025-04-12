/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 */
import android.view.View;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.events.GTMEvents;
import com.ril.ajio.home.landingpage.viewholder.cms.HomeCmsAppUpdateVH;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from a71
 */
public final class a71_0
implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ a71_0(int n3, Object object, Object object2) {
        this.a = n3;
        this.b = object;
        this.c = object2;
    }

    public final void onClick(View object) {
        int n3 = this.a;
        switch (n3) {
            default: {
                object = (wd1_0)this.b;
                Intrinsics.checkNotNullParameter(object, "this$0");
                String string2 = (String)this.c;
                Intrinsics.checkNotNullParameter(string2, "$title");
                ((wd1_0)object).c.J9(string2);
                return;
            }
            case 0: 
        }
        Object object2 = (HomeCmsAppUpdateVH)this.c;
        Intrinsics.checkNotNullParameter(object2, "this$0");
        object = (po_0)this.b;
        if (object != null) {
            object.z4();
        }
        object = AnalyticsManager.Companion.getInstance().getGtmEvents();
        object2 = ((HomeCmsAppUpdateVH)object2).d.getText();
        object2 = object2 != null ? object2.toString() : null;
        ((GTMEvents)object).pushUpdateAppEvent("link click", object2, "landing screen");
    }
}

