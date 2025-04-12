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
import com.ril.ajio.R$color;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.events.GTMEvents;
import com.ril.ajio.analytics.events.NewCustomEventsRevamp;
import com.ril.ajio.videoPlayer.ui.AjioVideoPlayerFullScreenFragment;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from zb
 */
public final class zb_2
implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Fragment b;

    public /* synthetic */ zb_2(Fragment fragment, int n3) {
        this.a = n3;
        this.b = fragment;
    }

    public final void onClick(View view) {
        int n3 = this.a;
        switch (n3) {
            default: {
                Object object = this.b;
                Fragment fragment = object;
                fragment = (q22_0)object;
                object = "this$0";
                Intrinsics.checkNotNullParameter(fragment, (String)object);
                boolean bl2 = fragment.isAdded();
                if (bl2) {
                    boolean bl3;
                    object = AnalyticsManager.Companion.getInstance().getGtmEvents();
                    Object object2 = o72_0.a;
                    Object object3 = "plp_category_clicked";
                    String string2 = "PLP";
                    ((GTMEvents)object).pushButtonTapEvent((String)object3, string2, (String)object2);
                    Bundle bundle = new Bundle();
                    object = ((q22_0)fragment).cb().d.h1;
                    bundle.putString("plp_source", (String)object);
                    object = ((q22_0)fragment).cb().d.i1;
                    object2 = "plp_source_details";
                    bundle.putString((String)object2, (String)object);
                    Object object4 = ((q22_0)fragment).D0;
                    String string3 = ((NewCustomEventsRevamp)object4).getEC_PRODUCT_LIST_INTERACTIONS();
                    String string4 = ((q22_0)fragment).E0;
                    String string5 = ((q22_0)fragment).F0;
                    String string6 = "category menu open";
                    String string7 = "";
                    String string8 = "plp_category_menu_open";
                    String string9 = "pdp screen";
                    String string10 = "pdp screen";
                    int n4 = 1536;
                    NewCustomEventsRevamp.newPushCustomEvent$default((NewCustomEventsRevamp)object4, string3, string6, string7, string8, string9, string10, string4, bundle, string5, false, null, n4, null);
                    object = fragment.getArguments();
                    if (object != null && (bl3 = (object = fragment.requireArguments()).containsKey((String)(object2 = "PLP_TYPE")))) {
                        int n7;
                        object = cp_1.Companion;
                        boolean bl4 = km_1.b((cp$a)object);
                        if (bl4) {
                            int n8 = 8;
                            ((q22_0)fragment).Ra(n8);
                        }
                        object = iq_0.Companion;
                        object3 = fragment.requireArguments();
                        int n10 = object3.getInt((String)object2);
                        object.getClass();
                        int n14 = 100;
                        object = n10 != n14 ? (n10 != (n7 = 101) ? new iq_0() : new xd1_0()) : new iq_0();
                        string2 = new Bundle();
                        string2.putInt((String)object2, n10);
                        ((Fragment)object).setArguments((Bundle)string2);
                        object2 = fragment.getChildFragmentManager();
                        Intrinsics.checkNotNullExpressionValue(object2, "getChildFragmentManager(...)");
                        object2.getClass();
                        object3 = new a((FragmentManager)object2);
                        string2 = "beginTransaction(...)";
                        Intrinsics.checkNotNullExpressionValue(object3, string2);
                        int n15 = R$anim.slide_in_bottom;
                        int n16 = R$anim.slide_out_top;
                        string3 = null;
                        ((k)object3).k(n15, n16, 0, 0);
                        n15 = ((q22_0)fragment).Ya();
                        object4 = fragment.getTag();
                        ((k)object3).j(n15, (Fragment)object, (String)object4);
                        object = fragment.getTag();
                        ((k)object3).c((String)object);
                        object = fragment.getActivity();
                        if (object != null) {
                            boolean bl5;
                            object = fragment.getActivity();
                            if (object != null) {
                                boolean bl6 = object.isDestroyed();
                                object = bl6;
                            } else {
                                boolean bl7 = false;
                                object = null;
                            }
                            Intrinsics.checkNotNull(object);
                            boolean bl8 = (Boolean)object;
                            if (!bl8 && !(bl5 = ((FragmentManager)object2).K)) {
                                boolean bl9 = true;
                                ((a)object3).o(bl9, bl9);
                                try {
                                    ((FragmentManager)object2).C();
                                }
                                catch (IllegalStateException illegalStateException) {
                                    object = yn3_0.a;
                                    ((yn3$a)object).e(illegalStateException);
                                }
                            }
                        }
                        if ((object = ((q22_0)fragment).T) != null) {
                            int n17 = R$color.filter_bg_color;
                            object.setBackgroundResource(n17);
                        }
                        if ((object = ((q22_0)fragment).T) != null) {
                            float f5 = 0.5f;
                            object.setAlpha(f5);
                        }
                    }
                }
                return;
            }
            case 0: 
        }
        AjioVideoPlayerFullScreenFragment ajioVideoPlayerFullScreenFragment = (AjioVideoPlayerFullScreenFragment)this.b;
        Intrinsics.checkNotNullParameter(ajioVideoPlayerFullScreenFragment, "this$0");
        ajioVideoPlayerFullScreenFragment.Sa();
    }
}

