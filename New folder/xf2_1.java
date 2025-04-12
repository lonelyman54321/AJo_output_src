/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Bundle
 *  android.os.Handler
 *  android.os.Looper
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.widget.TextView
 */
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$f;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.google.android.material.R$id;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.google.android.material.snackbar.Snackbar;
import com.ril.ajio.R$color;
import com.ril.ajio.R$string;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.AnalyticsManager$Companion;
import com.ril.ajio.analytics.events.GTMEvents;
import com.ril.ajio.analytics.events.NewCustomEventsRevamp;
import com.ril.ajio.customviews.AjioLoaderView;
import com.ril.ajio.customviews.widgets.OnFragmentInteractionListener;
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.data.repo.OrderListFunctionalRepo;
import com.ril.ajio.data.repo.StoreLPRepo;
import com.ril.ajio.jiobannerads.BannerAdViewModel;
import com.ril.ajio.myaccount.order.fragment.b;
import com.ril.ajio.services.data.Order.orderhistory.OrderHistory;
import com.ril.ajio.services.data.user.UserInformation;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

/*
 * Renamed from xf2
 */
public final class xf2_1
implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ xf2_1(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final Object invoke(Object object) {
        Object object2;
        block53: {
            block50: {
                Object object3;
                int n3;
                String string2;
                Object object4;
                Object object5;
                Object object6;
                Object object7;
                int n4;
                Object object8;
                int n7;
                int n8;
                block51: {
                    int n10;
                    int n14;
                    block52: {
                        boolean bl2;
                        object2 = this.b;
                        n8 = 1;
                        n7 = 0;
                        object8 = null;
                        n4 = this.a;
                        switch (n4) {
                            default: {
                                Object object9 = object;
                                object9 = (dl2_2)object;
                                return StoreLPRepo.b((StoreLPRepo)object2, (dl2_2)object9);
                            }
                            case 0: 
                        }
                        object7 = object;
                        object7 = (DataCallback)object;
                        object6 = com.ril.ajio.myaccount.order.fragment.b.Companion;
                        object2 = (b)object2;
                        Intrinsics.checkNotNullParameter(object2, "this$0");
                        Intrinsics.checkNotNullParameter(object7, "orderHistoryDataCallback");
                        object6 = h40_0.a;
                        object6 = xv$a_0.OrderList;
                        int n16 = h40_0.S0((xv$a_0)((Object)object6));
                        if (n16 != 0 && (object5 = ((b)object2).f) == null) {
                            object5 = (BannerAdViewModel)((b)object2).F.getValue();
                            object4 = ((b)object2).G.getValue();
                            Intrinsics.checkNotNullExpressionValue(object4, "getValue(...)");
                            object4 = (UserInformation)object4;
                            boolean n15 = ((UserInformation)object4).isUserOnline();
                            string2 = ((jo_2)((b)object2).H.getValue()).f();
                            if (string2 == null) {
                                string2 = "";
                            }
                            ((BannerAdViewModel)object5).getAdsBannerDataMiscPages((xv$a_0)((Object)object6), n15, string2);
                        }
                        if ((n3 = nn_2.b((cp$a)(object6 = cp_1.Companion), (DataCallback)object7)) == 0) break block50;
                        object6 = ((b)object2).s;
                        n16 = 0;
                        object5 = null;
                        object4 = "progressView";
                        if (object6 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException((String)object4);
                            n3 = 0;
                            object6 = null;
                        }
                        ((AjioLoaderView)((Object)object6)).stopLoader();
                        object6 = ((b)object2).D;
                        if (object6 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("shimmerLayout");
                            n3 = 0;
                            object6 = null;
                        }
                        hv3_0.s0((ShimmerFrameLayout)((Object)object6));
                        object6 = ((b)object2).q;
                        if (object6 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("shimmerView");
                            n3 = 0;
                            object6 = null;
                        }
                        n14 = 8;
                        object6.setVisibility(n14);
                        n3 = ((DataCallback)object7).getStatus();
                        object3 = "format(...)";
                        if (n3 != 0) break block51;
                        object7 = (OrderHistory)((DataCallback)object7).getData();
                        n3 = -1;
                        if (object7 == null || (n10 = ((OrderHistory)object7).getPageSize()) != n3) break block52;
                        object7 = ((Fragment)object2).getActivity();
                        object2 = ((b)object2).o;
                        if (object2 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("mListener");
                            boolean bl3 = false;
                            object2 = null;
                        }
                        object6 = com.ril.ajio.myaccount.order.fragment.b.Z;
                        Intrinsics.checkNotNullParameter(object6, "tag");
                        object4 = AnalyticsManager.Companion.getInstance();
                        Object object9 = ((AnalyticsManager)object4).getGtmEvents();
                        int n15 = 8;
                        Object[] objectArray = "Post order - OSM down";
                        String string3 = "Post order - OSM down";
                        String string4 = "faq search";
                        GTMEvents.pushServiceErrorEvent$default((GTMEvents)object9, (String)objectArray, string3, string4, null, n15, null);
                        if (object7 != null && !(bl2 = object7.isFinishing())) {
                            int n17 = 0x1020002;
                            object4 = object7.findViewById(n17);
                            n14 = R$string.api_alert_title;
                            string2 = hv3_0.K(n14);
                            if ((object4 = Snackbar.make((View)object4, string2, n10 = -2)) != null) {
                                string2 = ((BaseTransientBottomBar)object4).getView();
                            } else {
                                n14 = 0;
                                string2 = null;
                            }
                            if (string2 != null) {
                                n16 = R$id.snackbar_text;
                                object5 = (TextView)string2.findViewById(n16);
                            }
                            if (string2 != null) {
                                n10 = t70.getColor((Context)object7, 17170443);
                                string2.setBackgroundColor(n10);
                            }
                            if (object5 != null) {
                                n10 = t70.getColor((Context)object7, 17170444);
                                object5.setTextColor(n10);
                            }
                            object5 = StringCompanionObject.INSTANCE;
                            n16 = R$string.acc_error_message;
                            object5 = hv3_0.K(n16);
                            n10 = R$string.api_alert_title;
                            object9 = hv3_0.K(n10);
                            objectArray = new Object[n8];
                            objectArray[0] = object9;
                            String string5 = xh2_0.a(objectArray, n8, (String)object5, (String)object3);
                            object3 = Looper.getMainLooper();
                            object5 = new Handler((Looper)object3);
                            object3 = new xa0_0(0, string2, string5);
                            long l2 = 100;
                            object5.postDelayed((Runnable)object3, l2);
                            if (object4 != null) {
                                n8 = R$color.color_176d93;
                                n8 = t70.getColor((Context)object7, n8);
                                ((Snackbar)object4).setActionTextColor(n8);
                            }
                            if (object4 != null) {
                                n8 = R$string.try_again;
                                string5 = hv3_0.K(n8);
                                object8 = new ya0_0((OnFragmentInteractionListener)object2, (String)object6);
                                ((Snackbar)object4).setAction(string5, (View.OnClickListener)object8);
                            }
                            if (object4 != null) {
                                ((Snackbar)object4).show();
                            }
                        }
                        object2 = Unit.a;
                        break block53;
                    }
                    object3 = OrderListFunctionalRepo.INSTANCE;
                    ((OrderListFunctionalRepo)object3).parseResponse((OrderHistory)object7);
                    Object object10 = ((b)object2).i;
                    String string5 = "mRecyclerView";
                    if (object10 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(string5);
                        n10 = 0;
                        object10 = null;
                    }
                    if ((object10 = ((RecyclerView)object10).getAdapter()) != null) {
                        ((RecyclerView$f)object10).notifyDataSetChanged();
                    }
                    if ((n10 = ((OrderListFunctionalRepo)object3).getCurrentPage()) == 0 && object7 != null && ((n10 = ((OrderHistory)object7).getTwoMonthsOrderCount()) == 0 || (object10 = ((OrderHistory)object7).getOrders()) != null && (n4 = ((ArrayList)(object7 = ((OrderHistory)object7).getOrders())).size()) == 0)) {
                        object7 = ((b)object2).i;
                        if (object7 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException(string5);
                            n4 = 0;
                            object7 = null;
                        }
                        if ((n4 = object7.getVisibility()) != n14) {
                            object7 = ((b)object2).i;
                            if (object7 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException(string5);
                                n4 = 0;
                                object7 = null;
                            }
                            object7.setVisibility(n14);
                        }
                        if ((object7 = ((b)object2).B) == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("tvOrderDateRange");
                            n4 = 0;
                            object7 = null;
                        }
                        string2 = ((OrderListFunctionalRepo)object3).getDataRangeResultValueForKey();
                        object7.setText((CharSequence)string2);
                        object7 = ((b)object2).z;
                        if (object7 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("mNoOrderLayout");
                            n4 = 0;
                            object7 = null;
                        }
                        object7.setVisibility(0);
                        object7 = ((OrderListFunctionalRepo)object3).getOrderHistory();
                        if (object7 != null) {
                            object6 = ((OrderHistory)object7).getOrders();
                            if (object6 != null) {
                                n3 = ((ArrayList)object6).size();
                            } else {
                                n3 = 0;
                                object6 = null;
                            }
                            n4 = ((OrderHistory)object7).getTwoMonthsOrderCount();
                        } else {
                            n4 = -1;
                        }
                        string2 = "mShoppingBtn";
                        object10 = "mNoOrderTitleTv";
                        string5 = "mOlderOrderBtn";
                        if (n3 == 0) {
                            object7 = ((b)object2).C;
                            if (object7 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException((String)object10);
                                n4 = 0;
                                object7 = null;
                            }
                            n3 = R$string.no_order_placed;
                            object6 = hv3_0.K(n3);
                            object7.setText((CharSequence)object6);
                            object7 = ((b)object2).j;
                            if (object7 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException(string2);
                                n4 = 0;
                                object7 = null;
                            }
                            n3 = R$string.continue_shopping;
                            object6 = hv3_0.K(n3);
                            object7.setText((CharSequence)object6);
                            object7 = ((b)object2).k;
                            if (object7 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException(string5);
                                n4 = 0;
                                object7 = null;
                            }
                            n3 = R$string.add_from_wishlist;
                            object6 = hv3_0.K(n3);
                            object7.setText((CharSequence)object6);
                            object7 = ((b)object2).k;
                            if (object7 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException(string5);
                                n4 = 0;
                                object7 = null;
                            }
                            object6 = "CLICK_ADD_FROM_CLOSET";
                            object7.setTag(object6);
                            object7 = ((b)object2).s;
                            if (object7 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException((String)object4);
                                n4 = 0;
                                object7 = null;
                            }
                            ((AjioLoaderView)((Object)object7)).startLoader();
                            object2 = ((b)object2).t;
                            if (object2 == null) {
                                object2 = "mClosetViewModel";
                                Intrinsics.throwUninitializedPropertyAccessException((String)object2);
                            } else {
                                object5 = object2;
                            }
                            ((ky1_0)object5).o(0);
                        } else if (n3 > 0 && n4 == 0) {
                            object8 = ((b)object2).C;
                            if (object8 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException((String)object10);
                                n7 = 0;
                                object8 = null;
                            }
                            n4 = R$string.no_orders_placed_in_two_month;
                            object7 = hv3_0.K(n4);
                            object8.setText((CharSequence)object7);
                            object8 = ((b)object2).j;
                            if (object8 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException(string2);
                                n7 = 0;
                                object8 = null;
                            }
                            n4 = R$string.continue_shopping;
                            object7 = hv3_0.K(n4);
                            object8.setText((CharSequence)object7);
                            object8 = ((b)object2).k;
                            if (object8 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException(string5);
                                n7 = 0;
                                object8 = null;
                            }
                            object7 = "CLICK_START_SHOPPING";
                            object8.setTag(object7);
                            object2 = ((b)object2).k;
                            if (object2 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException(string5);
                            } else {
                                object5 = object2;
                            }
                            int n18 = R$string.view_older_orders;
                            object2 = hv3_0.K(n18);
                            object5.setText((CharSequence)object2);
                        }
                        object2 = new Bundle();
                        n4 = ((OrderListFunctionalRepo)object3).getTotalOrdersCount();
                        object2.putInt("total_number_of_orders", n4);
                        n7 = ((OrderListFunctionalRepo)object3).getCurrentPage() + n8;
                        object2.putInt("page_number", n7);
                        object8 = ((OrderListFunctionalRepo)object3).getDataRangeResultValueForKey();
                        object2.putString("date_range", (String)object8);
                        AnalyticsManager$Companion analyticsManager$Companion = AnalyticsManager.Companion;
                        analyticsManager$Companion.getInstance().getGtmEvents().pushOpenScreenEvent("zero orders listing screen", (Bundle)object2);
                        object2 = analyticsManager$Companion.getInstance();
                        object8 = ((AnalyticsManager)object2).getNewCustomEventsRevamp();
                        object5 = bv_0.a(analyticsManager$Companion);
                        string2 = cv_0.a(analyticsManager$Companion);
                        object7 = "zero orders listing screen";
                        object6 = "order management screen";
                        boolean bl4 = false;
                        object4 = null;
                        ((NewCustomEventsRevamp)object8).newPushCustomScreenView((String)object7, (String)object6, (String)object5, null, string2);
                    } else {
                        ((b)object2).Ua();
                    }
                    break block50;
                }
                n4 = ((DataCallback)object7).getStatus();
                if (n4 == n8) {
                    object7 = ((b)object2).r;
                    if (object7 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("orderListViewModel");
                        n4 = 0;
                        object7 = null;
                    }
                    ((tf2_2)object7).j = null;
                    object7 = StringCompanionObject.INSTANCE;
                    n4 = R$string.acc_error_message_page_load_fail;
                    object7 = hv3_0.K(n4);
                    n3 = R$string.server_alert_title;
                    object6 = hv3_0.K(n3);
                    object4 = new Object[n8];
                    object4[0] = object6;
                    Object object12 = xh2_0.a((Object[])object4, n8, (String)object7, (String)object3);
                    object8 = ((b)object2).p;
                    if (object8 == null) {
                        object8 = "myAcountFragmentsListener";
                        Intrinsics.throwUninitializedPropertyAccessException((String)object8);
                    } else {
                        object5 = object8;
                    }
                    object8 = hv3_0.K(R$string.server_alert_title);
                    object5.showNotificationMyAccountFragment((String)object8, (String)object12);
                    object12 = AnalyticsManager.Companion;
                    object8 = ((AnalyticsManager$Companion)object12).getInstance().getGtmEvents();
                    object7 = "order listing screen";
                    ((GTMEvents)object8).pushOpenScreenEvent((String)object7);
                    object3 = new Bundle();
                    object2 = ((b)object2).M.getNUMBER_OF_ORDER();
                    object8 = OrderListFunctionalRepo.INSTANCE;
                    n7 = ((OrderListFunctionalRepo)object8).getTotalOrdersCount();
                    object3.putInt((String)object2, n7);
                    object2 = ((AnalyticsManager$Companion)object12).getInstance();
                    object6 = ((AnalyticsManager)object2).getNewCustomEventsRevamp();
                    string2 = bv_0.a((AnalyticsManager$Companion)object12);
                    String string6 = cv_0.a((AnalyticsManager$Companion)object12);
                    object5 = "order listing screen";
                    object4 = "order management screen";
                    ((NewCustomEventsRevamp)object6).newPushCustomScreenView((String)object5, (String)object4, string2, (Bundle)object3, string6);
                }
            }
            object2 = Unit.a;
        }
        return object2;
    }
}

