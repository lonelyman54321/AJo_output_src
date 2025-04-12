/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 */
import android.view.View;
import androidx.activity.ComponentActivity;
import androidx.fragment.app.Fragment;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.events.GTMEvents;
import com.ril.ajio.remoteconfig.devsettings.view.a;
import com.ril.ajio.services.data.Cart.CartEntry;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from IO
 */
public final class io_1
implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ io_1(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final void onClick(View object) {
        int n3;
        int n4 = this.a;
        switch (n4) {
            default: {
                object = (a)this.b;
                Intrinsics.checkNotNullParameter(object, "this$0");
                ZR2 zR2 = ((a)object).a;
                if (zR2 != null) {
                    Object object2 = ((a)object).b;
                    if (object2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("edit");
                        object2 = null;
                    }
                    object2 = object2.getText().toString();
                    zR2.a((String)object2);
                }
                if ((object = ((Fragment)object).getActivity()) != null) {
                    ((ComponentActivity)object).onBackPressed();
                }
                return;
            }
            case 0: 
        }
        object = (lo_0)this.b;
        Intrinsics.checkNotNullParameter(object, "this$0");
        GTMEvents gTMEvents = AnalyticsManager.Companion.getInstance().getGtmEvents();
        Object object3 = ((lo_0)object).B;
        if (object3 != null && (object3 = ((CartEntry)object3).getGiftQuantity()) != null) {
            n3 = (Integer)object3;
        } else {
            n3 = 0;
            object3 = null;
        }
        String string2 = String.valueOf(n3);
        gTMEvents.pushCartInteractionsEvent("Freebies click", string2, "bag_interaction", "bag screen", "bag interactions", null);
        object3 = ((lo_0)object).a;
        object = ((lo_0)object).B;
        object3.M((CartEntry)object);
    }
}

