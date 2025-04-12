/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 */
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.events.GTMEvents;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from SW1
 */
public final class sw1_0
implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ sw1_0(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final void onClick(View object) {
        int n3 = this.a;
        switch (n3) {
            default: {
                xj2_0 xj2_02 = (xj2_0)this.b;
                Intrinsics.checkNotNullParameter(xj2_02, "this$0");
                xj2_02.w(false);
                return;
            }
            case 0: 
        }
        Object object2 = (ex1_0)this.b;
        Intrinsics.checkNotNullParameter(object2, "this$0");
        GTMEvents gTMEvents = AnalyticsManager.Companion.getInstance().getGtmEvents();
        object = ((ex1_0)object2).M;
        Object object3 = null;
        if (object != null) {
            object = object.getText();
        } else {
            n3 = 0;
            object = null;
        }
        String string2 = String.valueOf(object);
        String string3 = "bag interactions";
        String string4 = "floating action click";
        String string5 = "floating_action_click";
        String string6 = "bag screen";
        gTMEvents.pushCartInteractionsEvent(string4, string2, string5, string6, string3, null);
        object = ((ex1_0)object2).S;
        if (object != null) {
            n3 = ((bo_1)object).getItemCount();
            object2 = ((ex1_0)object2).D;
            if (object2 == null) {
                object2 = "cartRv";
                Intrinsics.throwUninitializedPropertyAccessException((String)object2);
            } else {
                object3 = object2;
            }
            ((RecyclerView)object3).smoothScrollToPosition(n3 += -1);
        }
    }
}

