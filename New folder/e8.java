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
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import com.ril.ajio.R$id;
import com.ril.ajio.analytics.AnalyticsData;
import com.ril.ajio.analytics.AnalyticsData$Builder;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.AnalyticsManager$Companion;
import com.ril.ajio.analytics.events.CleverTapEvents;
import com.ril.ajio.analytics.events.GTMEvents;
import com.ril.ajio.analytics.events.NewCustomEventsRevamp;
import com.ril.ajio.view.BaseActivity;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;

public final class e8
implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Fragment b;

    public /* synthetic */ e8(Fragment fragment, int n3) {
        this.a = n3;
        this.b = fragment;
    }

    public final void onClick(View view) {
        int n3 = 0;
        Object object = null;
        Object object2 = "this$0";
        Object object3 = this.b;
        int n4 = this.a;
        switch (n4) {
            default: {
                int n7;
                object3 = (uq2_0)object3;
                Intrinsics.checkNotNullParameter(object3, (String)object2);
                object2 = ((uq2_0)object3).Qa().b;
                if (object2 != null && (n7 = ((String)object2).length()) != 0) {
                    Object object4;
                    object2 = ((uq2_0)object3).g;
                    if (object2 != null) {
                        object4 = "RTO_DIALOG_VISIBILITY_COUNT";
                        n7 = ((sw_0)object2).getPreference((String)object4, 0);
                    } else {
                        n7 = 0;
                        object2 = null;
                    }
                    ((uq2_0)object3).q = n7;
                    object2 = WX0.SUBMIT;
                    object4 = ((uq2_0)object3).v;
                    if (object4 != null) {
                        n4 = ((ArrayList)object4).size();
                    } else {
                        n4 = 0;
                        object4 = null;
                    }
                    ((uq2_0)object3).Sa((WX0)((Object)object2), n4);
                    object2 = ((uq2_0)object3).g;
                    if (object2 != null) {
                        ((jo_2)object2).C(0);
                    }
                    if ((object2 = ((uq2_0)object3).o) != null) {
                        ai0_2.B((View)object2);
                    }
                    object2 = ((uq2_0)object3).Qa();
                    ((lq2_0)object2).e(false);
                } else {
                    object2 = ((uq2_0)object3).k;
                    if (object2 != null) {
                        ai0_2.B((View)object2);
                    }
                }
                return;
            }
            case 0: 
        }
        Object object5 = q9_0.Companion;
        object3 = (q9_0)object3;
        Intrinsics.checkNotNullParameter(object3, (String)object2);
        int n8 = view.getId();
        n4 = R$id.llpsTvSearch;
        boolean bl2 = true;
        Object object6 = null;
        Object object7 = "activityFragmentListener";
        if (n8 != n4 && n8 != (n4 = R$id.llpsIvSearch) && n8 != (n4 = R$id.lltIvLuxeSearch) && n8 != (n4 = R$id.llpsSearchLayout) && n8 != (n4 = R$id.top_toolbar_static_layout_revamp_ajio) && n8 != (n4 = R$id.toolbar_search_img_revamp_ajio) && n8 != (n4 = R$id.top_toolbar_static_layout_revamp_luxe) && n8 != (n4 = R$id.toolbar_search_img_revamp_luxe)) {
            n4 = R$id.fahNotiIcon;
            if (n8 != n4 && n8 != (n4 = R$id.menu_notification_layout_ajio_revamp)) {
                n4 = R$id.lltIvLuxeHamburger;
                if (n8 != n4 && n8 != (n4 = R$id.fahIvMenu)) {
                    n4 = R$id.fahIvAjioLogo;
                    Object object8 = "homeListener";
                    if (n8 != n4 && n8 != (n4 = R$id.fahIvDropdown) && n8 != (n4 = R$id.fahTvStoreName) && n8 != (n4 = R$id.lltIvLuxeLogo) && n8 != (n4 = R$id.lltIvLuxeDropdown)) {
                        n3 = R$id.lltIvLuxeBack;
                        if (n8 == n3) {
                            object2 = ((q9_0)object3).h;
                            if (object2 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException((String)object7);
                            } else {
                                object6 = object2;
                            }
                            object6.N();
                        } else {
                            n3 = R$id.llpsIvCamera;
                            if (n8 != n3 && n8 != (n3 = R$id.camera_iv_ajio_revamp)) {
                                n3 = R$id.wishlist_iv_ajio_revamp;
                                if (n8 != n3 && n8 != (n3 = R$id.wishlist_iv_luxe_revamp)) {
                                    n3 = R$id.menu_cart_layout_luxe_revamp;
                                    if (n8 == n3 || n8 == (n3 = R$id.menu_cart_layout_ajio_revamp)) {
                                        object2 = ((q9_0)object3).k;
                                        if (object2 == null) {
                                            Intrinsics.throwUninitializedPropertyAccessException((String)object8);
                                        } else {
                                            object6 = object2;
                                        }
                                        object6.T0();
                                    }
                                } else {
                                    object2 = ((q9_0)object3).l;
                                    if (object2 != null) {
                                        object2.B0();
                                    }
                                }
                            } else {
                                ue1_2.Companion.getClass();
                                Intrinsics.checkNotNullParameter(object3, "searchBarCameraListener");
                                object = "HOME_PAGE";
                                Intrinsics.checkNotNullParameter(object, "sourcePage");
                                object2 = new ue1_2();
                                ((ue1_2)object2).h = object3;
                                ((ue1_2)object2).i = object;
                                ((ue1_2)object2).j = null;
                                object = ((Fragment)object3).getChildFragmentManager();
                                ((DialogFragment)object2).show((FragmentManager)object, "ImageSearch");
                                object8 = ((q9_0)object3).G0;
                                object6 = ((NewCustomEventsRevamp)object8).getEC_IMAGE_SEARCH();
                                object2 = AnalyticsManager.Companion;
                                object = av_0.a((AnalyticsManager$Companion)object2);
                                object5 = "-icon";
                                String string2 = Ft2.a((String)object, (String)object5);
                                String string3 = av_0.a((AnalyticsManager$Companion)object2);
                                Object var15_24 = null;
                                Object var16_28 = null;
                                object7 = "image search click";
                                String string4 = "event_image_search_click";
                                String string5 = "home landing screen";
                                String string6 = ((q9_0)object3).H0;
                                Object var20_44 = null;
                                String string7 = ((q9_0)object3).I0;
                                int n10 = 1536;
                                NewCustomEventsRevamp.newPushCustomEvent$default((NewCustomEventsRevamp)object8, (String)object6, (String)object7, string2, string4, string3, string5, string6, null, string7, false, null, n10, null);
                            }
                        }
                    } else {
                        object3.getClass();
                        object2 = AnalyticsManager.Companion;
                        object7 = "store switcher";
                        String string8 = "menu open";
                        tj2_0.e((AnalyticsManager$Companion)object2, (String)object7, string8, "landing screen");
                        NewCustomEventsRevamp newCustomEventsRevamp = ((q9_0)object3).G0;
                        String string9 = newCustomEventsRevamp.getEC_USER_INTERACTION();
                        object5 = ((q9_0)object3).k;
                        if (object5 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException((String)object8);
                        } else {
                            object6 = object5;
                        }
                        String string10 = String.valueOf(object6.D());
                        String string11 = av_0.a((AnalyticsManager$Companion)object2);
                        int n14 = 1536;
                        boolean bl3 = false;
                        String string12 = "logo click";
                        String string13 = "logo_click";
                        String string14 = "home landing screen";
                        object2 = ((q9_0)object3).H0;
                        boolean bl4 = false;
                        object5 = ((q9_0)object3).I0;
                        Object object9 = object2;
                        NewCustomEventsRevamp.newPushCustomEvent$default(newCustomEventsRevamp, string9, string12, string10, string13, string11, string14, (String)object2, null, (String)object5, false, null, n14, null);
                        ((q9_0)object3).sb(false, false);
                    }
                } else {
                    object2 = ((Fragment)object3).getActivity();
                    n8 = object2 instanceof BaseActivity;
                    if (n8 != 0) {
                        object2 = ((Fragment)object3).getActivity();
                        object = "null cannot be cast to non-null type com.ril.ajio.view.BaseActivity";
                        Intrinsics.checkNotNull(object2, (String)object);
                        object2 = (BaseActivity)object2;
                        ((BaseActivity)object2).G2();
                    }
                }
            } else {
                object2 = ((q9_0)object3).i;
                if (object2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("tabListener");
                    n8 = 0;
                    object2 = null;
                }
                object2.showTabLayout(false);
                object2 = AnalyticsManager.Companion;
                object5 = ((AnalyticsManager$Companion)object2).getInstance().getGtmEvents();
                Object object10 = ((AnalyticsManager$Companion)object2).getInstance().getGtmEvents().getScreenName();
                String string15 = "Noti_Centre_click";
                ((GTMEvents)object5).pushButtonTapEvent(string15, (String)object10);
                NewCustomEventsRevamp newCustomEventsRevamp = ((q9_0)object3).G0;
                String string16 = newCustomEventsRevamp.getEC_NOTI_INTERACTION();
                String string17 = av_0.a((AnalyticsManager$Companion)object2);
                boolean bl5 = false;
                String string18 = "notification menu open";
                String string19 = "";
                String string20 = "notification_bell_icon_click";
                String string21 = "home landing screen";
                object2 = ((q9_0)object3).H0;
                object5 = ((q9_0)object3).I0;
                int n15 = 1536;
                NewCustomEventsRevamp.newPushCustomEvent$default(newCustomEventsRevamp, string16, string18, string19, string20, string17, string21, (String)object2, null, (String)object5, false, null, n15, null);
                jz1_2.Companion.getClass();
                object2 = new jz1_2();
                object5 = ((q9_0)object3).h;
                if (object5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)object7);
                    n4 = 0;
                    object5 = null;
                }
                if ((object10 = ((q9_0)object3).h) == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)object7);
                    object10 = null;
                }
                object7 = object10.y();
                object10 = "NewNotificationCenterActivityFragment";
                j3$a.a((j3_0)object5, (Fragment)object7, (Fragment)object2, bl2, (String)object10);
                object2 = AJIOApplication.Companion;
                object2.getClass();
                object2 = AJIOApplication$a.a();
                try {
                    o43_0.a((AJIOApplication)object2, 0);
                }
                catch (Exception exception) {
                    object5 = yn3_0.a;
                    ((yn3$a)object5).e(exception);
                }
                object2 = ((q9_0)object3).S0;
                if (object2 == null) {
                    object2 = "appPreferences";
                    Intrinsics.throwUninitializedPropertyAccessException((String)object2);
                } else {
                    object6 = object2;
                }
                object2 = "NotiBaddge_Count";
                ((sw_0)object6).putPreference((String)object2, 0);
            }
        } else {
            object2 = AnalyticsManager.Companion;
            ((AnalyticsManager$Companion)object2).getInstance().getFirebaseEvents().sendEvent("search_bar_click", null);
            object = ((AnalyticsManager$Companion)object2).getInstance().getGtmEvents();
            String string22 = "Search Button";
            ak0_0.a((AnalyticsManager$Companion)object2, (GTMEvents)object, "Show Search", string22);
            NewCustomEventsRevamp newCustomEventsRevamp = ((q9_0)object3).G0;
            String string23 = newCustomEventsRevamp.getEC_USER_INTERACTION();
            String string24 = ((q9_0)object3).G0.getEA_NAV_CLICK_HEADER();
            String string25 = av_0.a((AnalyticsManager$Companion)object2);
            String string26 = "search bar";
            String string27 = "navigation_click";
            String string28 = "home landing screen";
            object = ((q9_0)object3).H0;
            boolean bl6 = false;
            object5 = ((q9_0)object3).I0;
            int n16 = 1536;
            boolean bl7 = false;
            Object object11 = object;
            NewCustomEventsRevamp.newPushCustomEvent$default(newCustomEventsRevamp, string23, string24, string26, string27, string25, string28, (String)object, null, (String)object5, false, null, n16, null);
            object = p3.a("State", "Initiated");
            object2 = ((AnalyticsManager$Companion)object2).getInstance().getCt();
            object5 = new AnalyticsData$Builder();
            object = ((AnalyticsData$Builder)object5).eventMap((HashMap)object).build();
            ((CleverTapEvents)object2).search((AnalyticsData)object);
            object2 = ((q9_0)object3).j;
            if (object2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("toolbarListener");
                n8 = 0;
                object2 = null;
            }
            object2.M0();
            vv2_2.Companion.getClass();
            object2 = new vv2_2();
            object = new Bundle();
            n4 = (int)(((q9_0)object3).X0 ? 1 : 0);
            if (n4 != 0) {
                object5 = "STORE_ID";
                string22 = "luxe";
                object.putString((String)object5, string22);
            }
            object5 = "STORE_THEME";
            string22 = od3_2.a();
            object.putString((String)object5, string22);
            ((Fragment)object2).setArguments((Bundle)object);
            object = ((q9_0)object3).h;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object7);
                n3 = 0;
                object = null;
            }
            if ((object3 = ((q9_0)object3).h) == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object7);
            } else {
                object6 = object3;
            }
            object3 = object6.y();
            object5 = "search_tag";
            j3$a.a((j3_0)object, (Fragment)object3, (Fragment)object2, bl2, (String)object5);
        }
    }
}

