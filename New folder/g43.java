/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnLongClickListener
 */
import android.view.View;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.events.GTMEvents;
import kotlin.jvm.internal.Intrinsics;

public final class g43
implements View.OnLongClickListener {
    public final /* synthetic */ i43_0 a;
    public final /* synthetic */ View b;

    public /* synthetic */ g43(i43_0 i43_02, View view) {
        this.a = i43_02;
        this.b = view;
    }

    public final boolean onLongClick(View object) {
        object = this.a;
        Intrinsics.checkNotNullParameter(object, "this$0");
        Intrinsics.checkNotNullParameter(this.b, "$view");
        object.getClass();
        Object object2 = AnalyticsManager.Companion.getInstance().getGtmEvents();
        String string2 = "product details interactions";
        String string3 = "copy";
        String string4 = "pdp screen";
        String string5 = "Helpline_number";
        ((GTMEvents)object2).talkToUsTapEvent(string4, string5, string2, string3);
        object2 = ((i43_0)object).c;
        if (object2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("helplineNo1");
            object2 = null;
        }
        object2 = ((Object)object2.getText()).toString();
        ((i43_0)object).Oa((String)object2);
        return true;
    }
}

