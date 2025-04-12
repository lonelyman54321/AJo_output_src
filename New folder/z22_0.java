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
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.a;
import androidx.fragment.app.k;
import com.ril.ajio.R$anim;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.AnalyticsManager$Companion;
import com.ril.ajio.analytics.events.GTMEvents;
import com.ril.ajio.analytics.events.NewCustomEventsRevamp;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from z22
 */
public final class z22_0
implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ z22_0(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final void onClick(View view) {
        int bl2 = this.a;
        switch (bl2) {
            default: {
                or2_0 or2_02 = (or2_0)this.b;
                Intrinsics.checkNotNullParameter(or2_02, "this$0");
                Object object = AnalyticsManager.Companion;
                GTMEvents gTMEvents = ((AnalyticsManager$Companion)object).getInstance().getGtmEvents();
                String string2 = "Card_clicked";
                String string3 = "Add Credit/Debit card selected";
                ak0_0.a((AnalyticsManager$Companion)object, gTMEvents, string2, string3);
                object = or2_02.c;
                if (object != null) {
                    object.o3();
                }
                return;
            }
            case 0: 
        }
        Object object = (q22_0)this.b;
        Object object2 = "this$0";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        boolean bl3 = ((Fragment)object).isAdded();
        if (bl3) {
            boolean bl4;
            object2 = cp_1.Companion;
            boolean bl5 = km_1.b((cp$a)object2);
            if (bl5) {
                object2 = ((q22_0)object).J;
                if (object2 != null) {
                    ai0_2.m((View)object2);
                }
                if ((object2 = ((q22_0)object).J) != null) {
                    object2.clearFocus();
                }
            }
            object2 = AnalyticsManager.Companion.getInstance().getGtmEvents();
            Object object3 = o72_0.a;
            Object object4 = "plp_filter_clicked";
            String string4 = "PLP";
            ((GTMEvents)object2).pushButtonTapEvent((String)object4, string4, (String)object3);
            Bundle bundle = new Bundle();
            object2 = ((q22_0)object).cb().d.h1;
            bundle.putString("plp_source", (String)object2);
            object2 = ((q22_0)object).cb().d.i1;
            object3 = "plp_source_details";
            bundle.putString((String)object3, (String)object2);
            Object object5 = ((q22_0)object).D0;
            String string5 = ((NewCustomEventsRevamp)object5).getEC_PRODUCT_LIST_INTERACTIONS();
            String string6 = o72_0.a;
            String string7 = ((q22_0)object).E0;
            String string8 = ((q22_0)object).F0;
            String string9 = "filter menu open";
            String string10 = "";
            String string11 = "plp_filter_menu_open";
            String string12 = "plp screen";
            int n3 = 1536;
            NewCustomEventsRevamp.newPushCustomEvent$default((NewCustomEventsRevamp)object5, string5, string9, string10, string11, string6, string12, string7, bundle, string8, false, null, n3, null);
            object2 = ((Fragment)object).getArguments();
            if (object2 != null && (bl4 = (object2 = ((Fragment)object).requireArguments()).containsKey((String)(object3 = "PLP_TYPE")))) {
                object2 = ((q22_0)object).S0;
                if (object2 != null) {
                    ai0_2.i((View)object2);
                }
                object2 = cp$a.e();
                object2.getClass();
                boolean bl6 = cp_1.f();
                if (bl6) {
                    int n4 = 8;
                    ((q22_0)object).Ra(n4);
                }
                object2 = s12.Companion;
                int n7 = ((Fragment)object).requireArguments().getInt((String)object3);
                object4 = ((q22_0)object).cb().d.l();
                object2.getClass();
                object2 = s12$a.a(n7, (String)object4);
                object3 = ((Fragment)object).getChildFragmentManager();
                Intrinsics.checkNotNullExpressionValue(object3, "getChildFragmentManager(...)");
                object3.getClass();
                object4 = new a((FragmentManager)object3);
                string4 = "beginTransaction(...)";
                Intrinsics.checkNotNullExpressionValue(object4, string4);
                int n8 = R$anim.slide_in_bottom;
                int n10 = R$anim.slide_out_top;
                string5 = null;
                ((k)object4).k(n8, n10, 0, 0);
                n8 = ((q22_0)object).Ya();
                object5 = ((Fragment)object).getTag();
                ((k)object4).j(n8, (Fragment)object2, (String)object5);
                object2 = ((Fragment)object).getTag();
                ((k)object4).c((String)object2);
                object2 = ((Fragment)object).getActivity();
                if (object2 != null) {
                    boolean bl7;
                    if ((object = ((Fragment)object).getActivity()) != null) {
                        boolean bl8 = object.isDestroyed();
                        object = bl8;
                    } else {
                        boolean bl9 = false;
                        object = null;
                    }
                    Intrinsics.checkNotNull(object);
                    boolean bl10 = (Boolean)object;
                    if (!bl10 && !(bl7 = ((FragmentManager)object3).K)) {
                        boolean bl11 = true;
                        ((a)object4).o(bl11, bl11);
                        try {
                            ((FragmentManager)object3).C();
                        }
                        catch (IllegalStateException illegalStateException) {
                            object = yn3_0.a;
                            ((yn3$a)object).e(illegalStateException);
                        }
                    }
                }
            }
        }
    }
}

