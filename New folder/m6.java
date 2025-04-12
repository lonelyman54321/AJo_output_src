/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Intent
 *  android.os.Bundle
 *  android.view.View
 *  android.view.View$OnClickListener
 */
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView$f;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.events.GTMEvents;
import com.ril.ajio.myaccount.order.imps.ReturnImpsActivity;
import com.ril.ajio.myaccount.order.imps.a;
import kotlin.jvm.internal.Intrinsics;

public final class m6
implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ m6(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final void onClick(View view) {
        int n3 = 1;
        Object object = "this$0";
        Object object2 = this.b;
        int n4 = this.a;
        switch (n4) {
            default: {
                object2 = (un_2)object2;
                Intrinsics.checkNotNullParameter(object2, (String)object);
                boolean n7 = ((un_2)object2).e;
                Object object4 = ((un_2)object2).d;
                if (n7) {
                    object = ((un_2)object2).h;
                    object4.setText((CharSequence)object);
                    object = ((un_2)object2).f;
                    if (object != null) {
                        n4 = ((un_2)object2).i;
                        object4 = n4;
                        ((xn_2)object).a = object4;
                        ((RecyclerView$f)object).notifyDataSetChanged();
                    }
                    Bundle bundle = new Bundle();
                    object4 = ((un_2)object2).j;
                    bundle.putString("offer_count", (String)object4);
                    object = AnalyticsManager.Companion.getInstance();
                    GTMEvents string7 = ((AnalyticsManager)object).getGtmEvents();
                    String string2 = "bag screen";
                    String string3 = "bag interactions";
                    String string8 = "free gift widget summary click";
                    String string4 = "";
                    String string5 = "bag_interaction";
                    string7.pushCartInteractionsEvent(string8, string4, string5, string2, string3, bundle);
                } else {
                    object = ((un_2)object2).g;
                    object4.setText((CharSequence)object);
                    object = ((un_2)object2).f;
                    if (object != null) {
                        object4 = n3;
                        ((xn_2)object).a = object4;
                        ((RecyclerView$f)object).notifyDataSetChanged();
                    }
                }
                int bl3 = ((un_2)object2).e;
                ((un_2)object2).e = n3 ^= bl3;
                return;
            }
            case 0: 
        }
        Object object3 = com.ril.ajio.myaccount.order.imps.a.Companion;
        object2 = (a)object2;
        Intrinsics.checkNotNullParameter(object2, (String)object);
        object = ye3_0.a;
        object = AnalyticsManager.Companion.getInstance().getGtmEvents();
        object3 = ye3_0.e;
        String string6 = "IMPS transfer requested screen";
        String string7 = ye3_0.c;
        ((GTMEvents)object).pushButtonTapEvent(string7, object3, string6);
        object = ((Fragment)object2).requireActivity();
        boolean bl2 = object instanceof ReturnImpsActivity;
        if (bl2) {
            object = (ReturnImpsActivity)object;
        } else {
            boolean bl3 = false;
            object = null;
        }
        if (object != null) {
            object2 = new Intent();
            object3 = "IS_WALLET_TRANSFER_INITIATED";
            object2.putExtra((String)object3, n3 != 0);
            n3 = -1;
            object.setResult(n3, (Intent)object2);
            object.finish();
        }
    }
}

