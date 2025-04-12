/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Application
 *  android.app.Dialog
 *  android.content.Context
 *  android.content.Intent
 *  android.os.Bundle
 *  android.os.Handler
 *  android.os.Looper
 *  android.text.TextUtils
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 */
package com.ril.ajio.ondemand.customercare.view.fragment;

import android.app.Application;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.E$b;
import androidx.lifecycle.LiveData;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$f;
import androidx.recyclerview.widget.RecyclerView$o;
import com.ajio.ril.core.network.model.DataError;
import com.ajio.ril.core.network.model.DataError$ErrorMessage;
import com.google.android.material.appbar.AppBarLayout;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.R$string;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.AnalyticsManager$Companion;
import com.ril.ajio.analytics.events.GTMEvents;
import com.ril.ajio.analytics.events.NewCustomEventsRevamp;
import com.ril.ajio.analytics.events.NewEEcommerceEventsRevamp;
import com.ril.ajio.customviews.CustomToolbarViewMerger;
import com.ril.ajio.customviews.OnNavigationClickListener;
import com.ril.ajio.customviews.widgets.OnFragmentInteractionListener;
import com.ril.ajio.customviews.widgets.managers.ActivityTransitionManager;
import com.ril.ajio.data.repo.BaseRepo;
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.data.repo.UserRepo;
import com.ril.ajio.login.activity.LoginActivityRevamp;
import com.ril.ajio.login.activity.LoginActivityRevampNew;
import com.ril.ajio.ondemand.customercare.view.adapter.CCAdapter;
import com.ril.ajio.ondemand.customercare.view.common.UiCCComponent;
import com.ril.ajio.ondemand.customercare.view.fragment.CCBaseFragment;
import com.ril.ajio.ondemand.customercare.view.fragment.CustomerCareFragment$Companion;
import com.ril.ajio.ondemand.customercare.view.fragment.CustomerCareFragment$sam$androidx_lifecycle_Observer$0;
import com.ril.ajio.ondemand.customercare.view.fragment.CustomerCareFragment$special$$inlined$activityViewModels$default$1;
import com.ril.ajio.ondemand.customercare.view.fragment.CustomerCareFragment$special$$inlined$activityViewModels$default$2;
import com.ril.ajio.ondemand.customercare.view.fragment.CustomerCareFragment$special$$inlined$activityViewModels$default$3;
import com.ril.ajio.ondemand.customercare.view.fragment.CustomerCareFragment$special$$inlined$activityViewModels$default$6;
import com.ril.ajio.ondemand.customercare.viewmodel.CCViewModel;
import com.ril.ajio.ondemand.customercare.viewmodel.CCViewModelFactory;
import com.ril.ajio.services.data.Cart.CartEntry;
import com.ril.ajio.services.data.CustomerCare.CCComplaintInfoHelper;
import com.ril.ajio.services.data.CustomerCare.CCComplaintInfoHelper$CCComplaintInfo;
import com.ril.ajio.services.data.CustomerCare.CCFaq;
import com.ril.ajio.services.data.CustomerCare.CCHelpInterface;
import com.ril.ajio.services.data.CustomerCare.TopicsList;
import com.ril.ajio.services.data.Order.CartOrder;
import com.ril.ajio.services.data.Order.CartOrders;
import com.ril.ajio.services.data.Order.Consignment;
import com.ril.ajio.services.data.Product.Product;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Stack;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.StringCompanionObject;

public final class CustomerCareFragment
extends CCBaseFragment
implements i82_0,
View.OnClickListener,
OnNavigationClickListener {
    public static final CustomerCareFragment$Companion Companion;
    public static final String TAG = "CustomerCareFragment";
    private xf_1 cCBundleViewModel;
    private CustomToolbarViewMerger customToolbarViewMerger;
    private CCComplaintInfoHelper mCCComplaintInfo;
    private CCFaq mCCFaqData;
    private CCViewModel mCCViewModel;
    private boolean mIsSetResult;
    private OnFragmentInteractionListener mListener;
    private Dialog mLoginDialog;
    private final ArrayList mOrderList;
    private String mPassword;
    private RecyclerView mRecyclerView;
    private int mServiceCallCount;
    private zr1_1 mServiceCallCountLiveData;
    private String mUserName;
    private hy3_0 mUserViewModel;
    private final NewCustomEventsRevamp newCustomEventsRevamp;
    private final NewEEcommerceEventsRevamp newEEcommerceEventsRevamp;
    private final rq1_2 orderDetailViewModel$delegate;
    private final rq1_2 orderListViewModel$delegate;
    private final String previousScreen;
    private final String previousScreenType;
    private boolean refreshOrders;

    static {
        CustomerCareFragment$Companion customerCareFragment$Companion;
        Companion = customerCareFragment$Companion = new CustomerCareFragment$Companion(null);
    }

    public CustomerCareFragment() {
        Object object = new ArrayList();
        this.mOrderList = object;
        object = Reflection.getOrCreateKotlinClass(tf2_2.class);
        Object object2 = new CustomerCareFragment$special$$inlined$activityViewModels$default$1(this);
        Lambda lambda = new CustomerCareFragment$special$$inlined$activityViewModels$default$2(null, this);
        CustomerCareFragment$special$$inlined$activityViewModels$default$3 customerCareFragment$special$$inlined$activityViewModels$default$3 = new CustomerCareFragment$special$$inlined$activityViewModels$default$3(this);
        this.orderListViewModel$delegate = object = LW0.a(this, (yn1_2)object, (Function0)object2, lambda, customerCareFragment$special$$inlined$activityViewModels$default$3);
        object = Reflection.getOrCreateKotlinClass(db2_1.class);
        super(this);
        super(null, this);
        CustomerCareFragment$special$$inlined$activityViewModels$default$6 customerCareFragment$special$$inlined$activityViewModels$default$6 = new CustomerCareFragment$special$$inlined$activityViewModels$default$6(this);
        this.orderDetailViewModel$delegate = object = LW0.a(this, (yn1_2)object, (Function0)object2, lambda, customerCareFragment$special$$inlined$activityViewModels$default$6);
        object = AnalyticsManager.Companion;
        this.newEEcommerceEventsRevamp = object2 = ((AnalyticsManager$Companion)object).getInstance().getNewEEcommerceEventsRevamp();
        this.newCustomEventsRevamp = object = ((AnalyticsManager$Companion)object).getInstance().getNewCustomEventsRevamp();
        this.previousScreen = object = ((NewEEcommerceEventsRevamp)object2).getPrevScreen();
        this.previousScreenType = object = ((NewEEcommerceEventsRevamp)object2).getPrevScreenType();
    }

    public static /* synthetic */ Unit Oa(CustomerCareFragment customerCareFragment, DataCallback dataCallback) {
        return CustomerCareFragment.initObservables$lambda$3(customerCareFragment, dataCallback);
    }

    public static /* synthetic */ void Pa(AppBarLayout appBarLayout) {
        CustomerCareFragment.onViewCreated$lambda$0(appBarLayout);
    }

    public static /* synthetic */ Unit Qa(CustomerCareFragment customerCareFragment, Integer n3) {
        return CustomerCareFragment.initObservables$lambda$5(customerCareFragment, n3);
    }

    public static /* synthetic */ Unit Ra(CustomerCareFragment customerCareFragment, DataCallback dataCallback) {
        return CustomerCareFragment.initObservables$lambda$1(customerCareFragment, dataCallback);
    }

    public static /* synthetic */ Unit Sa(CustomerCareFragment customerCareFragment, DataCallback dataCallback) {
        return CustomerCareFragment.initObservables$lambda$2(customerCareFragment, dataCallback);
    }

    public static /* synthetic */ Unit Ta(CustomerCareFragment customerCareFragment, DataCallback dataCallback) {
        return CustomerCareFragment.initObservables$lambda$4(customerCareFragment, dataCallback);
    }

    private final db2_1 getOrderDetailViewModel() {
        return (db2_1)this.orderDetailViewModel$delegate.getValue();
    }

    private final tf2_2 getOrderListViewModel() {
        return (tf2_2)this.orderListViewModel$delegate.getValue();
    }

    private final void getOrders() {
        tf2_2 tf2_22 = this.getOrderListViewModel();
        if (tf2_22 != null) {
            aW aW2 = md3_0.c(tf2_22);
            pf2_2 pf2_22 = new pf2_2(tf2_22, 0, null);
            int n3 = 3;
            Ae3.d(aW2, null, null, pf2_22, n3);
        }
    }

    private final void hideProgress() {
        pf_1 pf_12 = this.getCcActivityListener();
        if (pf_12 != null) {
            pf_12.stopLoader();
        }
    }

    private final void initObservables() {
        CustomerCareFragment$sam$androidx_lifecycle_Observer$0 customerCareFragment$sam$androidx_lifecycle_Observer$0;
        Function1 function1;
        mu1_1 mu1_12;
        Object object = this.getOrderListViewModel();
        if (object != null && (object = ((tf2_2)object).g) != null) {
            mu1_12 = this.getViewLifecycleOwner();
            function1 = new tg0_2(this);
            customerCareFragment$sam$androidx_lifecycle_Observer$0 = new CustomerCareFragment$sam$androidx_lifecycle_Observer$0(function1);
            ((LiveData)object).e(mu1_12, customerCareFragment$sam$androidx_lifecycle_Observer$0);
        }
        if ((object = this.mCCViewModel) != null && (object = ((CCViewModel)object).getCcFaqsObservable()) != null) {
            mu1_12 = this.getViewLifecycleOwner();
            function1 = new ug0_2(this);
            customerCareFragment$sam$androidx_lifecycle_Observer$0 = new CustomerCareFragment$sam$androidx_lifecycle_Observer$0(function1);
            ((LiveData)object).e(mu1_12, customerCareFragment$sam$androidx_lifecycle_Observer$0);
        }
        if ((object = this.getOrderDetailViewModel()) != null && (object = ((db2_1)object).d) != null) {
            mu1_12 = this.getViewLifecycleOwner();
            function1 = new vg0_2(this);
            customerCareFragment$sam$androidx_lifecycle_Observer$0 = new CustomerCareFragment$sam$androidx_lifecycle_Observer$0(function1);
            ((LiveData)object).e(mu1_12, customerCareFragment$sam$androidx_lifecycle_Observer$0);
        }
        if ((object = this.mCCViewModel) != null && (object = ((CCViewModel)object).getCCComplaintListObservable()) != null) {
            mu1_12 = this.getViewLifecycleOwner();
            function1 = new wg0_2(this);
            customerCareFragment$sam$androidx_lifecycle_Observer$0 = new CustomerCareFragment$sam$androidx_lifecycle_Observer$0(function1);
            ((LiveData)object).e(mu1_12, customerCareFragment$sam$androidx_lifecycle_Observer$0);
        }
        if ((object = this.mServiceCallCountLiveData) != null) {
            mu1_12 = this.getViewLifecycleOwner();
            function1 = new xg0_2(this);
            customerCareFragment$sam$androidx_lifecycle_Observer$0 = new CustomerCareFragment$sam$androidx_lifecycle_Observer$0(function1);
            ((LiveData)object).e(mu1_12, customerCareFragment$sam$androidx_lifecycle_Observer$0);
        }
    }

    private static final Unit initObservables$lambda$1(CustomerCareFragment object, DataCallback object2) {
        Object object3 = null;
        int n3 = 1;
        Intrinsics.checkNotNullParameter(object, "this$0");
        cp_1.Companion.getClass();
        Object object4 = cp$a.e();
        object4.getClass();
        int n4 = cp_1.J((DataCallback)object2);
        if (n4 != 0) {
            if (object2 != null) {
                n4 = ((DataCallback)object2).getStatus();
                if (n4 == 0) {
                    object2 = (CartOrders)((DataCallback)object2).getData();
                    super.parseResponse((CartOrders)object2);
                } else {
                    n4 = ((DataCallback)object2).getStatus();
                    if (n4 == n3 && (object2 = ((DataCallback)object2).getError()) != null && (object4 = ((DataError)object2).getErrors()) != null) {
                        object4 = ((DataError)object2).getErrors();
                        Object[] objectArray = "getErrors(...)";
                        Intrinsics.checkNotNullExpressionValue(object4, (String)objectArray);
                        object4 = (Collection)object4;
                        n4 = object4.isEmpty() ^ n3;
                        if (n4 != 0) {
                            object2 = ((DataError$ErrorMessage)((DataError)object2).getErrors().get(0)).getMessage();
                            object4 = StringCompanionObject.INSTANCE;
                            n4 = R$string.acc_error_message;
                            object4 = hv3_0.K(n4);
                            objectArray = new Object[n3];
                            objectArray[0] = object2;
                            object3 = Arrays.copyOf(objectArray, n3);
                            object3 = String.format((String)object4, object3);
                            object4 = "format(...)";
                            Intrinsics.checkNotNullExpressionValue(object3, (String)object4);
                            Intrinsics.checkNotNull(object2);
                            super.showNotification((String)object2, (String)object3);
                        }
                    }
                }
            }
            if ((object = ((CustomerCareFragment)object).mServiceCallCountLiveData) != null) {
                object2 = (Integer)((LiveData)object).d();
                Intrinsics.checkNotNull(object2);
                int n7 = (Integer)object2 + n3;
                object2 = n7;
                ((LiveData)object).k(object2);
            }
        }
        return Unit.a;
    }

    private static final Unit initObservables$lambda$2(CustomerCareFragment object, DataCallback object2) {
        Object object3 = null;
        int n3 = 1;
        Intrinsics.checkNotNullParameter(object, "this$0");
        Intrinsics.checkNotNullParameter(object2, "ccFaqDataCallback");
        cp_1.Companion.getClass();
        Object object4 = cp$a.e();
        object4.getClass();
        int n4 = cp_1.J((DataCallback)object2);
        if (n4 != 0) {
            n4 = ((DataCallback)object2).getStatus();
            if (n4 == 0) {
                ((CustomerCareFragment)object).mCCFaqData = object2 = (CCFaq)((DataCallback)object2).getData();
            } else {
                n4 = ((DataCallback)object2).getStatus();
                if (n4 == n3) {
                    if ((object2 = ((DataCallback)object2).getError()) != null) {
                        object4 = ((DataError)object2).getErrors();
                    } else {
                        n4 = 0;
                        object4 = null;
                    }
                    if (object4 != null) {
                        object4 = ((DataError)object2).getErrors();
                        Object[] objectArray = "getErrors(...)";
                        Intrinsics.checkNotNullExpressionValue(object4, (String)objectArray);
                        object4 = (Collection)object4;
                        n4 = object4.isEmpty() ^ n3;
                        if (n4 != 0) {
                            object2 = ((DataError$ErrorMessage)((DataError)object2).getErrors().get(0)).getMessage();
                            object4 = StringCompanionObject.INSTANCE;
                            n4 = R$string.acc_error_message;
                            object4 = hv3_0.K(n4);
                            objectArray = new Object[n3];
                            objectArray[0] = object2;
                            object3 = Arrays.copyOf(objectArray, n3);
                            object3 = String.format((String)object4, object3);
                            object4 = "format(...)";
                            Intrinsics.checkNotNullExpressionValue(object3, (String)object4);
                            Intrinsics.checkNotNull(object2);
                            super.showNotification((String)object2, (String)object3);
                        }
                    }
                }
            }
            object = ((CustomerCareFragment)object).mServiceCallCountLiveData;
            if (object != null) {
                Intrinsics.checkNotNull(object);
                object2 = ((LiveData)object).d();
                Intrinsics.checkNotNull(object2);
                int n7 = ((Number)object2).intValue() + n3;
                object2 = n7;
                ((LiveData)object).k(object2);
            }
        }
        return Unit.a;
    }

    private static final Unit initObservables$lambda$3(CustomerCareFragment object, DataCallback object2) {
        Object object3 = null;
        int n3 = 1;
        Intrinsics.checkNotNullParameter(object, "this$0");
        Intrinsics.checkNotNullParameter(object2, "cartOrderDataCallback");
        cp_1.Companion.getClass();
        Object object4 = cp$a.e();
        object4.getClass();
        int n4 = cp_1.J((DataCallback)object2);
        if (n4 != 0) {
            n4 = ((DataCallback)object2).getStatus();
            String string2 = "format(...)";
            String string3 = "Order details for this order cannot be loaded, try again later";
            if (n4 == 0) {
                if ((object2 = (CartOrder)((DataCallback)object2).getData()) != null) {
                    int n7;
                    Object object5;
                    Object object6;
                    object4 = new ArrayList();
                    Object object7 = ((CartOrder)object2).getConsignments();
                    Object object8 = "iterator(...)";
                    if (object7 != null) {
                        boolean bl2;
                        object7 = ((CartOrder)object2).getConsignments();
                        object6 = "getConsignments(...)";
                        Intrinsics.checkNotNullExpressionValue(object7, (String)object6);
                        object7 = ((ArrayList)object7).iterator();
                        Intrinsics.checkNotNullExpressionValue(object7, (String)object8);
                        while (bl2 = object7.hasNext()) {
                            boolean bl3;
                            Object object9;
                            Object object10;
                            boolean bl4;
                            object6 = (Consignment)object7.next();
                            if (object6 != null && (object5 = ((Consignment)object6).getEntries()) == null && !(bl4 = TextUtils.isEmpty((CharSequence)(object5 = ((CartOrder)object2).getCode())))) {
                                object5 = yn3_0.a;
                                object10 = ((CartOrder)object2).getCode();
                                object9 = new Object[n3];
                                object9[0] = object10;
                                object10 = "CustomerCare Consignment entries is null %s";
                                ((yn3$a)object5).d((String)object10, (Object[])object9);
                            }
                            bl4 = false;
                            object5 = null;
                            object10 = object6 != null ? ((Consignment)object6).getEntries() : null;
                            if (object10 == null) continue;
                            object10 = ((Consignment)object6).getEntries().iterator();
                            while (bl3 = object10.hasNext()) {
                                object9 = (CartEntry)object10.next();
                                CartEntry cartEntry = object9 != null ? ((CartEntry)object9).getOrderEntry() : null;
                                if (cartEntry == null) continue;
                                cartEntry = ((CartEntry)object9).getOrderEntry();
                                String string4 = ((Consignment)object6).getCode();
                                cartEntry.setCode(string4);
                                object9 = ((CartEntry)object9).getOrderEntry();
                                ((ArrayList)object4).add(object9);
                            }
                        }
                    }
                    if ((object7 = ((CartOrder)object2).getUnconsignedEntries()) != null) {
                        boolean bl5;
                        object7 = ((ArrayList)object7).iterator();
                        Intrinsics.checkNotNullExpressionValue(object7, (String)object8);
                        while (bl5 = object7.hasNext()) {
                            object8 = (CartEntry)object7.next();
                            if (object8 == null) continue;
                            object6 = ((CartEntry)object8).getOrderEntry();
                            if (object6 != null) {
                                object6 = ((CartEntry)object8).getOrderEntry();
                                object5 = ((CartEntry)object8).getCode();
                                ((CartEntry)object6).setCode((String)object5);
                            }
                            ((ArrayList)object4).add(object8);
                        }
                    }
                    if ((n7 = ((ArrayList)object4).size()) == 0 && (n7 = (int)(TextUtils.isEmpty((CharSequence)(object7 = ((CartOrder)object2).getCode())) ? 1 : 0)) == 0) {
                        object7 = yn3_0.a;
                        object8 = ((CartOrder)object2).getCode();
                        object6 = new Object[n3];
                        object6[0] = object8;
                        object8 = "CustomerCare cartEntries list is empty %s";
                        ((yn3$a)object7).d((String)object8, (Object[])object6);
                    }
                    ((CartOrder)object2).setEntries((ArrayList)object4);
                    ((CustomerCareFragment)object).hideProgress();
                    n4 = ((ArrayList)object4).size();
                    if (n4 > 0 && (object4 = ((CCBaseFragment)object).getMActivity()) != null) {
                        object3 = new ar_2((CartOrder)object2);
                        object2 = ((CustomerCareFragment)object).cCBundleViewModel;
                        if (object2 != null) {
                            ((xf_1)object2).f = object3;
                        }
                        AnalyticsManager.Companion.getInstance().getGtmEvents().pushOpenScreenEvent("customer select items - self care screen");
                        bg_1.Companion.getClass();
                        object2 = new bg_1();
                        object = ((CCBaseFragment)object).getMActivity();
                        Intrinsics.checkNotNull(object);
                        object = ((FragmentActivity)object).getSupportFragmentManager();
                        Intrinsics.checkNotNullExpressionValue(object, "getSupportFragmentManager(...)");
                        object3 = "CCItemListDialogFragment";
                        ((bg_1)object2).show((FragmentManager)object, (String)object3);
                    } else {
                        object2 = StringCompanionObject.INSTANCE;
                        int n8 = R$string.acc_error_message;
                        object2 = hv3_0.K(n8);
                        object4 = new Object[n3];
                        object4[0] = string3;
                        object3 = Arrays.copyOf(object4, n3);
                        object2 = String.format((String)object2, object3);
                        Intrinsics.checkNotNullExpressionValue(object2, string2);
                        ((CustomerCareFragment)object).showNotification(string3, (String)object2);
                    }
                }
            } else {
                int n10 = ((DataCallback)object2).getStatus();
                if (n10 == n3) {
                    ((CustomerCareFragment)object).hideProgress();
                    object2 = StringCompanionObject.INSTANCE;
                    n10 = R$string.acc_error_message;
                    object2 = hv3_0.K(n10);
                    object4 = new Object[n3];
                    object4[0] = string3;
                    object3 = Arrays.copyOf(object4, n3);
                    object2 = String.format((String)object2, object3);
                    Intrinsics.checkNotNullExpressionValue(object2, string2);
                    ((CustomerCareFragment)object).showNotification(string3, (String)object2);
                }
            }
        }
        return Unit.a;
    }

    private static final Unit initObservables$lambda$4(CustomerCareFragment object, DataCallback object2) {
        Intrinsics.checkNotNullParameter(object, "this$0");
        cp_1.Companion.getClass();
        cp_1 cp_12 = cp$a.e();
        cp_12.getClass();
        int n3 = cp_1.J((DataCallback)object2);
        if (n3 != 0) {
            int n4;
            n3 = 1;
            if (object2 != null && (n4 = ((DataCallback)object2).getStatus()) == 0) {
                ((CustomerCareFragment)object).mCCComplaintInfo = object2 = (CCComplaintInfoHelper)((DataCallback)object2).getData();
            } else {
                Object object3;
                n4 = ((DataCallback)object2).getStatus();
                if (n4 == n3 && (object2 = ((DataCallback)object2).getError()) != null && (object3 = (Collection)((DataError)object2).getErrors()) != null && (n4 = (int)(object3.isEmpty() ? 1 : 0)) == 0) {
                    object3 = yn3_0.a;
                    Object object4 = ((DataError$ErrorMessage)((DataError)object2).getErrors().get(0)).getMessage();
                    Object[] objectArray = new Object[]{};
                    ((yn3$a)object3).a((String)object4, objectArray);
                    object2 = ((DataError$ErrorMessage)((DataError)object2).getErrors().get(0)).getMessage();
                    object4 = new Throwable((String)object2);
                    ((yn3$a)object3).e((Throwable)object4);
                }
            }
            object = ((CustomerCareFragment)object).mServiceCallCountLiveData;
            if (object != null) {
                Intrinsics.checkNotNull(object);
                object2 = ((LiveData)object).d();
                Intrinsics.checkNotNull(object2);
                int n7 = ((Number)object2).intValue() + n3;
                object2 = n7;
                ((LiveData)object).k(object2);
            }
        }
        return Unit.a;
    }

    private static final Unit initObservables$lambda$5(CustomerCareFragment customerCareFragment, Integer n3) {
        String string2 = "this$0";
        Intrinsics.checkNotNullParameter(customerCareFragment, string2);
        if (n3 != null) {
            int n4 = customerCareFragment.mServiceCallCount;
            int n7 = n3;
            if (n7 == n4) {
                customerCareFragment.hideProgress();
                customerCareFragment.refreshUi();
            }
        }
        return Unit.a;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private final void onFaqClick(Object object) {
        Object object2;
        boolean bl2;
        int n3 = object instanceof Integer;
        if (n3 == 0) return;
        n3 = ((Number)(object = (Number)object)).intValue();
        if (n3 >= (bl2 = ((ArrayList)(object2 = this.getMUiItemsList())).size())) return;
        Object object3 = this.getMUiItemsList();
        int n4 = ((Number)object).intValue();
        object = ((ArrayList)object3).get(n4);
        object3 = "null cannot be cast to non-null type com.ril.ajio.ondemand.customercare.view.common.UiCCComponent";
        Intrinsics.checkNotNull(object, (String)object3);
        object = (UiCCComponent)object;
        n3 = ((UiCCComponent)object).getPosition();
        object2 = AnalyticsManager.Companion.getInstance().getGtmEvents();
        String string2 = ((UiCCComponent)object).getName();
        String string3 = "FAQ_L1_Clicked_";
        StringBuilder stringBuilder = new StringBuilder(string3);
        stringBuilder.append(string2);
        string2 = stringBuilder.toString();
        String string4 = "self care";
        ((GTMEvents)object2).pushButtonTapEvent(string2, string4);
        object2 = this.mCCFaqData;
        string2 = null;
        if (object2 == null) return;
        if ((object2 = ((CCFaq)object2).getTopicsList()) == null) return;
        object2 = this.mCCFaqData;
        Intrinsics.checkNotNull(object2);
        object2 = ((CCFaq)object2).getTopicsList();
        bl2 = ((ArrayList)object2).size();
        if (n3 >= bl2) return;
        object2 = this.mCCFaqData;
        Intrinsics.checkNotNull(object2);
        object2 = ((CCFaq)object2).getTopicsList().get(n3);
        if (object2 == null) return;
        object2 = this.mCCFaqData;
        Intrinsics.checkNotNull(object2);
        object2 = ((CCFaq)object2).getTopicsList();
        object3 = ((TopicsList)((ArrayList)object2).get(n3)).getQuestionAnswerList();
        if (object3 == null) return;
        object = ((UiCCComponent)object).getName();
        object2 = new xq_0((String)object, (ArrayList)object3, null, null);
        object = this.cCBundleViewModel;
        if (object != null) {
            object = ((xf_1)object).b;
            ((Stack)object).push(object2);
        }
        if ((object = this.getCcActivityListener()) == null) return;
        object = this.getCcActivityListener();
        if (object == null) return;
        n3 = 106;
        bl2 = true;
        object.addFragment(n3, null, bl2);
    }

    private final void onOrderClick(Object iterator) {
        Object object;
        int n3;
        CustomerCareFragment customerCareFragment = this;
        Object object2 = iterator;
        int n4 = iterator instanceof Integer;
        if (n4 != 0 && (n4 = ((Number)(object2 = (Number)((Object)iterator))).intValue()) < (n3 = ((ArrayList)(object = this.mOrderList)).size())) {
            int n7;
            int n8;
            Serializable serializable = this.mOrderList;
            n3 = ((Number)object2).intValue();
            serializable = ((ArrayList)serializable).get(n3);
            Intrinsics.checkNotNullExpressionValue(serializable, "get(...)");
            serializable = (CartOrder)serializable;
            object = ((CartOrder)serializable).getCode();
            Object object3 = AnalyticsManager.Companion.getInstance().getGtmEvents();
            int bl2 = ((Number)object2).intValue();
            int n10 = 1;
            int n14 = bl2 + n10;
            CharSequence charSequence = "Selfcare_Order_Selected_";
            Object object4 = new StringBuilder((String)charSequence);
            ((StringBuilder)object4).append(n14);
            ((StringBuilder)object4).append("_");
            ((StringBuilder)object4).append((String)object);
            object2 = ((StringBuilder)object4).toString();
            object4 = "self care";
            ((GTMEvents)object3).pushButtonTapEvent(object2, (String)object4);
            object2 = ((CartOrder)serializable).getEntries();
            object3 = "";
            if (object2 != null && (n8 = ((ArrayList)(object2 = ((CartOrder)serializable).getEntries())).size()) > 0) {
                boolean bl3;
                object2 = ((CartOrder)serializable).getEntries().iterator();
                object4 = "iterator(...)";
                Intrinsics.checkNotNullExpressionValue(object2, (String)object4);
                while (bl3 = object2.hasNext()) {
                    object4 = (CartEntry)object2.next();
                    boolean bl4 = TextUtils.isEmpty((CharSequence)object3);
                    if (!bl4) {
                        object4 = ((CartEntry)object4).getProduct().getCode();
                        charSequence = new StringBuilder();
                        ((StringBuilder)charSequence).append(object3);
                        ((StringBuilder)charSequence).append(",");
                        ((StringBuilder)charSequence).append((String)object4);
                        object3 = ((StringBuilder)charSequence).toString();
                        continue;
                    }
                    object3 = String.valueOf(((CartEntry)object4).getProduct().getCode());
                }
            }
            Bundle bundle = new Bundle();
            object2 = no_2.c((CartOrder)serializable);
            bundle.putString("order_status", (String)object2);
            object4 = ((CartOrder)serializable).getCode();
            bundle.putString("order_id", (String)object4);
            bundle.putString("product_id", (String)object3);
            object4 = customerCareFragment.newCustomEventsRevamp;
            charSequence = ((NewCustomEventsRevamp)object4).getEC_CC_ORDER_INTERACTION();
            String string2 = no_2.c((CartOrder)serializable);
            String string3 = customerCareFragment.previousScreen;
            String string4 = customerCareFragment.previousScreenType;
            int n15 = 1536;
            String string5 = "customer care order select";
            String string6 = "customer_care_order_select";
            String string7 = "customer care screen";
            String string8 = "know about us screen";
            NewCustomEventsRevamp.newPushCustomEvent$default((NewCustomEventsRevamp)object4, (String)charSequence, string5, string2, string6, string7, string8, string3, bundle, string4, false, null, n15, null);
            object2 = ((CartOrder)serializable).getEntries();
            if (object2 != null && (n7 = ((ArrayList)(object2 = ((CartOrder)serializable).getEntries())).size()) > 0) {
                object2 = ((CartOrder)serializable).getEntries();
                int n16 = ((ArrayList)object2).size();
                if (n16 == n10) {
                    object2 = ((CartOrder)serializable).getEntries();
                    n4 = 0;
                    serializable = null;
                    object2 = ((CartEntry)((ArrayList)object2).get(0)).getEntryNumber();
                    Intrinsics.checkNotNull(object2);
                    int n17 = (Integer)object2;
                    object3 = new yq_0((String)object, n17, false);
                    object2 = customerCareFragment.cCBundleViewModel;
                    if (object2 != null) {
                        ((xf_1)object2).e = object3;
                    }
                    if ((object2 = this.getCcActivityListener()) != null && (object2 = this.getCcActivityListener()) != null) {
                        n4 = 108;
                        n3 = 0;
                        object = null;
                        object2.addFragment(n4, null, n10 != 0);
                    }
                } else {
                    boolean bl5 = TextUtils.isEmpty((CharSequence)object);
                    if (!bl5) {
                        this.showProgress();
                        object2 = this.getOrderDetailViewModel();
                        if (object2 != null) {
                            Intrinsics.checkNotNull(object);
                            ((db2_1)object2).b((String)object);
                        }
                    }
                }
            }
        }
    }

    private static final void onViewCreated$lambda$0(AppBarLayout appBarLayout) {
        if (appBarLayout != null) {
            ai0_2.a((View)appBarLayout);
        }
    }

    private final void parseResponse(CartOrders object) {
        Object object2;
        if (object != null && (object2 = ((CartOrders)object).getOrders()) != null) {
            boolean bl2;
            this.mOrderList.clear();
            object2 = ((CartOrders)object).getOrders().iterator();
            while (bl2 = object2.hasNext()) {
                boolean bl3;
                Object object3;
                Object object4 = (CartOrder)object2.next();
                if (object4 == null || (object3 = ((CartOrder)object4).getEntries()) == null) continue;
                object4 = ((CartOrder)object4).getEntries().iterator();
                object3 = "iterator(...)";
                Intrinsics.checkNotNullExpressionValue(object4, (String)object3);
                while (bl3 = object4.hasNext()) {
                    object3 = object4.next();
                    Intrinsics.checkNotNullExpressionValue(object3, "next(...)");
                    Product product = ((CartEntry)(object3 = (CartEntry)object3)).getProduct();
                    if (product == null) continue;
                    object3 = ((CartEntry)object3).getProduct();
                    ((Product)object3).populate();
                }
            }
            object2 = this.mOrderList;
            object = ((CartOrders)object).getOrders();
            ((ArrayList)object2).addAll(object);
            this.refreshUi();
        }
    }

    private final void refreshUi() {
        int n3;
        Object object;
        Object object2;
        Object object3;
        int n4;
        this.getMUiItemsList().clear();
        Object object4 = this.mUserViewModel;
        Intrinsics.checkNotNull(object4);
        boolean n7 = ((hy3_0)object4).p();
        int n8 = 0;
        Object object5 = null;
        if (!n7) {
            object4 = this.getMUiItemsList();
            n4 = 5;
            object3 = "Loginview";
            object2 = new UiCCComponent(n4, (String)object3, null);
            ((ArrayList)object4).add(object2);
        } else {
            object4 = this.mOrderList;
            int n10 = ((ArrayList)object4).size();
            if (n10 > 0) {
                object4 = this.getMUiItemsList();
                object2 = this.mOrderList;
                ((ArrayList)object4).add(object2);
            }
        }
        object4 = this.mCCComplaintInfo;
        int n14 = 1;
        n4 = 10;
        if (object4 != null && (object4 = ((CCComplaintInfoHelper)object4).getIncidentDetail()) != null) {
            object4 = this.mCCComplaintInfo;
            Intrinsics.checkNotNull(object4);
            object4 = ((CCComplaintInfoHelper)object4).getIncidentDetail();
            int n15 = object4.size();
            if (n15 > 0) {
                object4 = this.getMUiItemsList();
                object3 = new UiCCComponent(n14, n4);
                ((ArrayList)object4).add(object3);
                object4 = this.getMUiItemsList();
                object = this.mCCComplaintInfo;
                n3 = 19;
                String string2 = "";
                object3 = new UiCCComponent(n3, string2, (CCHelpInterface)object);
                ((ArrayList)object4).add(object3);
            }
        }
        if ((object4 = this.mCCFaqData) != null && (object4 = ((CCFaq)object4).getTopicsList()) != null) {
            object4 = this.mCCFaqData;
            Intrinsics.checkNotNull(object4);
            object4 = ((CCFaq)object4).getTopicsList();
            int n16 = ((ArrayList)object4).size();
            if (n16 > 0) {
                object4 = this.getMUiItemsList();
                object3 = new UiCCComponent(n14, n4);
                ((ArrayList)object4).add(object3);
                object4 = this.getMUiItemsList();
                int n17 = R$string.faq_refresh;
                object3 = hv3_0.K(n17);
                int n18 = 4;
                Object object6 = new UiCCComponent(n18, (String)object3, null);
                ((ArrayList)object4).add(object6);
                object4 = z40_0.Companion;
                AJIOApplication.Companion.getClass();
                object6 = AJIOApplication$a.a();
                object4.getClass();
                object4 = z40$a.a((Context)object6).a;
                object6 = "faq_search_ui_new";
                boolean bl2 = ((ao0_0)object4).a((String)object6);
                if (bl2) {
                    object4 = this.getMUiItemsList();
                    n17 = 23;
                    object = "Faq Search";
                    object6 = new UiCCComponent(n17, (String)object, null);
                    ((ArrayList)object4).add(object6);
                }
                object4 = this.mCCFaqData;
                Intrinsics.checkNotNull(object4);
                object4 = ((CCFaq)object4).getTopicsList();
                int n19 = object4.size();
                object5 = null;
                for (n8 = 0; n8 < n19; ++n8) {
                    object6 = this.mCCFaqData;
                    Intrinsics.checkNotNull(object6);
                    object6 = (TopicsList)((CCFaq)object6).getTopicsList().get(n8);
                    if (object6 == null || (n17 = (int)(TextUtils.isEmpty((CharSequence)(object3 = ((TopicsList)object6).getFaqTopic())) ? 1 : 0)) != 0) continue;
                    if (n8 != 0) {
                        object3 = this.getMUiItemsList();
                        n3 = 12;
                        object = new UiCCComponent(n14, n14, n3, n3);
                        ((ArrayList)object3).add(object);
                    }
                    object3 = this.getMUiItemsList();
                    n3 = 2;
                    object6 = ((TopicsList)object6).getFaqTopic();
                    object = new UiCCComponent(n3, (String)object6, n8);
                    ((ArrayList)object3).add(object);
                }
            }
        }
        object5 = this.getMUiItemsList();
        object4 = new CCAdapter((List)object5, this);
        object5 = this.mRecyclerView;
        if (object5 != null) {
            ((RecyclerView)object5).setAdapter((RecyclerView$f)object4);
        }
    }

    private final void setResultAndFinish(Bundle object) {
        AppCompatActivity appCompatActivity = this.getMActivity();
        if (appCompatActivity != null) {
            appCompatActivity = this.getMActivity();
            Intrinsics.checkNotNull(appCompatActivity);
            boolean bl2 = appCompatActivity.isFinishing();
            if (!bl2) {
                appCompatActivity = this.getMActivity();
                if (appCompatActivity != null) {
                    appCompatActivity = appCompatActivity.getIntent();
                } else {
                    bl2 = false;
                    appCompatActivity = null;
                }
                if (appCompatActivity != null) {
                    if (object != null) {
                        appCompatActivity.putExtras((Bundle)object);
                    }
                    if ((object = this.getMActivity()) != null) {
                        int n3 = -1;
                        object.setResult(n3, (Intent)appCompatActivity);
                    }
                    if ((object = this.getMActivity()) != null) {
                        object.finish();
                    }
                }
            }
        }
    }

    private final void setToolbarUI() {
        StringBuilder stringBuilder;
        String string2;
        int n3;
        int n4;
        Object object;
        Object object2 = this.customToolbarViewMerger;
        int n7 = 0;
        Object object3 = null;
        if ((object2 = object2 != null ? ((CustomToolbarViewMerger)object2).getToolbar() : null) != null) {
            object2 = this.customToolbarViewMerger;
            if (object2 != null && (object2 = ((CustomToolbarViewMerger)object2).getToolbar()) != null) {
                object2.invalidate();
            }
            if ((object2 = this.getMActivity()) != null) {
                object = this.customToolbarViewMerger;
                if (object != null) {
                    object3 = ((CustomToolbarViewMerger)object).getToolbar();
                }
                ((AppCompatActivity)object2).setSupportActionBar((Toolbar)object3);
            }
        }
        if ((object2 = this.customToolbarViewMerger) != null) {
            ((CustomToolbarViewMerger)object2).setNavigationClick();
        }
        if ((object2 = this.customToolbarViewMerger) != null) {
            n7 = 8;
            ((CustomToolbarViewMerger)object2).setSubTitleVisibility(n7);
        }
        if ((object2 = this.customToolbarViewMerger) != null) {
            n7 = R$string.customer_care_title;
            object3 = this.getString(n7);
            object = "getString(...)";
            Intrinsics.checkNotNullExpressionValue(object3, (String)object);
            ((CustomToolbarViewMerger)object2).setTitleText((String)object3);
        }
        object2 = this.customToolbarViewMerger;
        object3 = " ";
        if (object2 != null && (object2 = ((CustomToolbarViewMerger)object2).getHeaderTitleTv()) != null) {
            n4 = R$string.header_text;
            object = hv3_0.K(n4);
            n3 = R$string.customer_care_title;
            string2 = hv3_0.K(n3);
            stringBuilder = new StringBuilder();
            stringBuilder.append((String)object);
            stringBuilder.append((String)object3);
            stringBuilder.append(string2);
            object = stringBuilder.toString();
            object2.setContentDescription((CharSequence)object);
        }
        if ((object2 = this.customToolbarViewMerger) != null && (object2 = ((CustomToolbarViewMerger)object2).getFloatTitleTv()) != null) {
            n4 = R$string.title_text;
            object = hv3_0.K(n4);
            n3 = R$string.customer_care_title;
            string2 = hv3_0.K(n3);
            stringBuilder = new StringBuilder();
            stringBuilder.append((String)object);
            stringBuilder.append((String)object3);
            stringBuilder.append(string2);
            object3 = stringBuilder.toString();
            object2.setContentDescription((CharSequence)object3);
        }
    }

    private final void showLoginDialog() {
        AppCompatActivity appCompatActivity = this.getMActivity();
        if (appCompatActivity != null) {
            appCompatActivity = this.getMActivity();
            Intrinsics.checkNotNull(appCompatActivity);
            boolean bl2 = appCompatActivity.isFinishing();
            if (!bl2) {
                bl2 = false;
                appCompatActivity = null;
                this.startLoginActivity(0);
            }
        }
    }

    private final void showNotification(String string2, String string3) {
        Object object = this.getContext();
        if (object != null && (object = this.getCcActivityListener()) != null && (object = this.getCcActivityListener()) != null) {
            Context context = this.getContext();
            int n3 = 1;
            object.showToastNotification(context, string2, n3, string3);
        }
    }

    public static /* synthetic */ void showNotification$default(CustomerCareFragment customerCareFragment, String string2, String string3, int n3, Object object) {
        if ((n3 &= 2) != 0) {
            string3 = null;
        }
        customerCareFragment.showNotification(string2, string3);
    }

    private final void showProgress() {
        pf_1 pf_12 = this.getCcActivityListener();
        if (pf_12 != null) {
            pf_12.startLoader();
        }
    }

    /*
     * Unable to fully structure code
     */
    private final void startLoginActivity(int var1_1) {
        var2_2 = this.getMActivity();
        var3_3 = at2_1.a;
        Intrinsics.checkNotNullParameter(this, "fragment");
        at2_1.a("source - customer care");
        var3_3 = new Bundle();
        var4_4 = "PAGE";
        var3_3.putInt((String)var4_4, var1_1);
        var1_1 = (int)at2_1.c();
        if (var1_1 != 0) ** GOTO lbl-1000
        var5_5 = h40_0.a;
        var1_1 = (int)h40_0.u2();
        if (var1_1 == 0) {
            var4_4 = LoginActivityRevamp.class;
            var5_5 = new Intent((Context)var2_2, var4_4);
        } else lbl-1000:
        // 2 sources

        {
            var4_4 = LoginActivityRevampNew.class;
            var5_5 = new Intent((Context)var2_2, (Class)var4_4);
        }
        var5_5.putExtras((Bundle)var3_3);
        this.startActivityForResult((Intent)var5_5, 30);
        var5_5 = ActivityTransitionManager.getInstance();
        var2_2 = this.getMActivity();
        var5_5.slideUpAndStay(var2_2);
    }

    public final void getMessage(String string2) {
        this.refreshOrders = true;
    }

    public final void handleBackBtnPress() {
        AppCompatActivity appCompatActivity = this.getMActivity();
        if (appCompatActivity != null) {
            appCompatActivity = this.getMActivity();
            Intrinsics.checkNotNull(appCompatActivity);
            boolean bl2 = appCompatActivity.isFinishing();
            if (!bl2) {
                bl2 = this.mIsSetResult;
                if (bl2) {
                    appCompatActivity = new Bundle();
                    String string2 = this.mUserName;
                    appCompatActivity.putString("user_name", string2);
                    String string3 = "user_pwd";
                    string2 = this.mPassword;
                    appCompatActivity.putString(string3, string2);
                    this.setResultAndFinish((Bundle)appCompatActivity);
                } else {
                    appCompatActivity = this.getMActivity();
                    if (appCompatActivity != null) {
                        appCompatActivity.finish();
                    }
                }
            }
        }
    }

    public void onActivityResult(int n3, int n4, Intent intent) {
        super.onActivityResult(n3, n4, intent);
        int n7 = -1;
        if (n4 != n7) {
            return;
        }
        n4 = 30;
        if (n3 == n4) {
            String string2;
            n3 = 1;
            this.mIsSetResult = n3;
            n4 = 0;
            Object object = null;
            if (intent != null) {
                string2 = intent.getStringExtra("user_name");
            } else {
                n7 = 0;
                string2 = null;
            }
            this.mUserName = string2;
            if (intent != null) {
                object = intent.getStringExtra("user_pwd");
            }
            this.mPassword = object;
            this.getOrders();
            this.mServiceCallCount = n4 = this.mServiceCallCount + n3;
            object = this.mCCViewModel;
            if (object != null) {
                ((CCViewModel)object).getCCComplaintList();
            }
            this.mServiceCallCount = n4 = this.mServiceCallCount + n3;
        }
    }

    public void onAttach(Context object) {
        String string2 = "context";
        Intrinsics.checkNotNullParameter(object, string2);
        super.onAttach((Context)object);
        boolean bl2 = object instanceof OnFragmentInteractionListener;
        if (bl2) {
            object = (OnFragmentInteractionListener)object;
            this.mListener = object;
        }
    }

    public void onClick(View view) {
        String string2 = "v";
        Intrinsics.checkNotNullParameter(view, string2);
        int n3 = view.getId();
        int n4 = R$id.close_button;
        if (n3 == n4) {
            view = this.mLoginDialog;
            if (view != null && view != null) {
                view.dismiss();
            }
            this.mLoginDialog = null;
        } else {
            n4 = R$id.signin_ajio_bt;
            if (n3 == n4) {
                view = this.mLoginDialog;
                if (view != null && view != null) {
                    view.dismiss();
                }
                n3 = 0;
                view = null;
                this.startLoginActivity(0);
                this.mLoginDialog = null;
            } else {
                n4 = R$id.join_ajio_bt;
                if (n3 == n4) {
                    view = this.mLoginDialog;
                    if (view != null && view != null) {
                        view.dismiss();
                    }
                    n3 = 1;
                    this.startLoginActivity(n3);
                    this.mLoginDialog = null;
                }
            }
        }
    }

    public void onCreate(Bundle object) {
        super.onCreate((Bundle)object);
        object = "owner";
        Intrinsics.checkNotNullParameter(this, (String)object);
        Object object2 = this.getViewModelStore();
        Intrinsics.checkNotNullParameter(this, (String)object);
        Object object3 = this.getDefaultViewModelProviderFactory();
        Intrinsics.checkNotNullParameter(this, (String)object);
        Object object4 = this.getDefaultViewModelCreationExtras();
        Object object5 = "store";
        Intrinsics.checkNotNullParameter(object2, (String)object5);
        String string2 = "factory";
        Intrinsics.checkNotNullParameter(object3, string2);
        String string3 = "defaultCreationExtras";
        Intrinsics.checkNotNullParameter(object4, string3);
        Object object6 = new pD3((rd3_0)object2, (E$b)object3, (Wd0)object4);
        object2 = CCViewModel.class;
        object3 = "modelClass";
        Intrinsics.checkNotNullParameter(object2, (String)object3);
        object2 = rn1_2.c((Class)object2);
        Intrinsics.checkNotNullParameter(object2, (String)object3);
        Intrinsics.checkNotNullParameter(object2, (String)object3);
        object4 = "<this>";
        Intrinsics.checkNotNullParameter(object2, (String)object4);
        Object object7 = object2.getQualifiedName();
        String string4 = "Local and anonymous classes can not be ViewModels";
        if (object7 != null) {
            String string5 = "androidx.lifecycle.ViewModelProvider.DefaultKey:";
            object7 = string5.concat((String)object7);
            this.mCCViewModel = object2 = (CCViewModel)((pD3)object6).a((yn1_2)object2, (String)object7);
            object2 = this.getMActivity();
            Intrinsics.checkNotNull(object2);
            Intrinsics.checkNotNullParameter(object2, (String)object);
            object6 = object2.getViewModelStore();
            Intrinsics.checkNotNullParameter(object2, (String)object);
            object7 = object2.getDefaultViewModelProviderFactory();
            Intrinsics.checkNotNullParameter(object2, (String)object);
            object2 = object2.getDefaultViewModelCreationExtras();
            Intrinsics.checkNotNullParameter(object6, (String)object5);
            Intrinsics.checkNotNullParameter(object7, string2);
            Intrinsics.checkNotNullParameter(object2, string3);
            Object object8 = new pD3((rd3_0)object6, (E$b)object7, (Wd0)object2);
            object2 = xf_1.class;
            Intrinsics.checkNotNullParameter(object2, (String)object3);
            object2 = rn1_2.c(object2);
            Intrinsics.checkNotNullParameter(object2, (String)object3);
            Intrinsics.checkNotNullParameter(object2, (String)object3);
            Intrinsics.checkNotNullParameter(object2, (String)object4);
            object6 = object2.getQualifiedName();
            if (object6 != null) {
                object6 = string5.concat((String)object6);
                this.cCBundleViewModel = object2 = (xf_1)((pD3)object8).a((yn1_2)object2, (String)object6);
                object2 = CCViewModelFactory.getVMInstance();
                object7 = this.requireActivity().getApplication();
                object8 = "getApplication(...)";
                Intrinsics.checkNotNullExpressionValue(object7, (String)object8);
                object6 = new UserRepo((Application)object7);
                object7 = this.requireActivity().getApplication();
                ((CCViewModelFactory)object2).setRepo((BaseRepo)object6, (Application)object7);
                Intrinsics.checkNotNull(object2);
                Intrinsics.checkNotNullParameter(this, (String)object);
                Intrinsics.checkNotNullParameter(object2, string2);
                object6 = this.getViewModelStore();
                Intrinsics.checkNotNullParameter(this, (String)object);
                object = this.getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullParameter(object6, (String)object5);
                Intrinsics.checkNotNullParameter(object2, string2);
                Intrinsics.checkNotNullParameter(object, string3);
                object5 = new pD3((rd3_0)object6, (E$b)object2, (Wd0)object);
                object = hy3_0.class;
                Intrinsics.checkNotNullParameter(object, (String)object3);
                object = rn1_2.c((Class)object);
                Intrinsics.checkNotNullParameter(object, (String)object3);
                Intrinsics.checkNotNullParameter(object, (String)object3);
                Intrinsics.checkNotNullParameter(object, (String)object4);
                object2 = object.getQualifiedName();
                if (object2 != null) {
                    object2 = string5.concat((String)object2);
                    this.mUserViewModel = object = (hy3_0)((pD3)object5).a((yn1_2)object, (String)object2);
                    this.mServiceCallCountLiveData = object = new zr1_1();
                    AB0.a().register(this);
                    this.customToolbarViewMerger = object = new CustomToolbarViewMerger(this);
                    return;
                }
                object2 = string4.toString();
                object = new IllegalArgumentException((String)object2);
                throw object;
            }
            object2 = string4.toString();
            object = new IllegalArgumentException((String)object2);
            throw object;
        }
        object2 = string4.toString();
        object = new IllegalArgumentException((String)object2);
        throw object;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup object, Bundle object2) {
        object2 = "inflater";
        Intrinsics.checkNotNullParameter(layoutInflater, (String)object2);
        int n3 = R$layout.fragment_customer_care_refresh;
        layoutInflater = layoutInflater.inflate(n3, (ViewGroup)object, false);
        Intrinsics.checkNotNullExpressionValue(layoutInflater, "inflate(...)");
        object = this.customToolbarViewMerger;
        if (object != null) {
            ((CustomToolbarViewMerger)object).initViews((View)layoutInflater);
        }
        return layoutInflater;
    }

    public void onDestroy() {
        super.onDestroy();
        AB0.a().unregister(this);
    }

    public void onDestroyView() {
        super.onDestroyView();
        Dialog dialog = this.mLoginDialog;
        if (dialog != null) {
            dialog.dismiss();
        }
        this.mLoginDialog = null;
    }

    public void onNavigationClick() {
        AppCompatActivity appCompatActivity = this.getMActivity();
        if (appCompatActivity != null) {
            appCompatActivity = this.getMActivity();
            Intrinsics.checkNotNull(appCompatActivity);
            boolean bl2 = appCompatActivity.isFinishing();
            if (!bl2) {
                this.handleBackBtnPress();
            }
        }
    }

    public void onResume() {
        super.onResume();
        GTMEvents gTMEvents = AnalyticsManager.Companion.getInstance().getGtmEvents();
        String string2 = "customer care - self care screen";
        gTMEvents.pushOpenScreenEvent(string2);
        NewCustomEventsRevamp newCustomEventsRevamp = this.newCustomEventsRevamp;
        String string3 = this.previousScreen;
        String string4 = this.previousScreenType;
        String string5 = "customer care - customer care screen";
        String string6 = "customer care screen";
        newCustomEventsRevamp.newPushCustomScreenView(string5, string6, string3, null, string4);
        boolean bl2 = this.refreshOrders;
        if (bl2) {
            this.getOrders();
        }
        this.refreshOrders = false;
    }

    public void onStop() {
        this.newEEcommerceEventsRevamp.setPreviousScreenData("customer care screen", "know about us screen");
        super.onStop();
    }

    public void onViewCreated(View object, Bundle object2) {
        int n3;
        Object object3;
        Intrinsics.checkNotNullParameter(object, "view");
        super.onViewCreated((View)object, (Bundle)object2);
        int n4 = 0;
        object2 = null;
        this.mServiceCallCount = 0;
        zr1_1 zr1_12 = this.mServiceCallCountLiveData;
        if (zr1_12 != null) {
            object2 = 0;
            zr1_12.k(object2);
        }
        this.initObservables();
        this.setToolbarUI();
        n4 = R$id.app_bar_layout;
        object2 = (AppBarLayout)object.findViewById(n4);
        int n7 = 1;
        if (object2 != null) {
            ((AppBarLayout)object2).setExpanded(n7 != 0);
        }
        if (object2 != null) {
            int n8 = R$string.acc_page_header_customer_care;
            object3 = hv3_0.K(n8);
            object2.setContentDescription((CharSequence)object3);
        }
        Object object4 = Looper.getMainLooper();
        object3 = new Handler(object4);
        object4 = new yg0_2((AppBarLayout)object2);
        long l2 = 500L;
        object3.postDelayed((Runnable)object4, l2);
        n4 = R$id.fragment_customer_care_rv;
        object = (RecyclerView)object.findViewById(n4);
        this.mRecyclerView = object;
        if (object != null) {
            object3 = this.requireActivity();
            object2 = new LinearLayoutManager((Context)object3);
            ((RecyclerView)object).setLayoutManager((RecyclerView$o)object2);
        }
        if ((object = this.mRecyclerView) != null) {
            ((RecyclerView)object).setHasFixedSize(n7 != 0);
        }
        this.showProgress();
        object = this.mUserViewModel;
        if (object != null && (n3 = ((hy3_0)object).p()) == n7) {
            this.getOrders();
            this.mServiceCallCount = n3 = this.mServiceCallCount + n7;
            object = this.mCCViewModel;
            if (object != null) {
                ((CCViewModel)object).getCCComplaintList();
            }
            this.mServiceCallCount = n3 = this.mServiceCallCount + n7;
        }
        if ((object = this.mCCViewModel) != null) {
            ((CCViewModel)object).getCCFaqs();
        }
        this.mServiceCallCount = n3 = this.mServiceCallCount + n7;
    }

    public void onViewItemClick(Object object, int n3) {
        block16: {
            block17: {
                block18: {
                    boolean bl2;
                    String string2;
                    block19: {
                        block20: {
                            block21: {
                                block22: {
                                    block23: {
                                        Object object2 = this.getMActivity();
                                        if (object2 == null) break block16;
                                        object2 = this.getMActivity();
                                        Intrinsics.checkNotNull(object2);
                                        int n4 = object2.isFinishing();
                                        if (n4 != 0) break block16;
                                        n4 = 2;
                                        if (n3 == n4) break block17;
                                        n4 = 3;
                                        if (n3 == n4) break block18;
                                        n4 = 4;
                                        string2 = "self care";
                                        bl2 = true;
                                        if (n3 == n4) break block19;
                                        n4 = 5;
                                        if (n3 == n4) break block20;
                                        n4 = 10;
                                        if (n3 == n4) break block21;
                                        n4 = 11;
                                        if (n3 == n4) break block22;
                                        n4 = 26;
                                        if (n3 == n4) break block23;
                                        switch (n3) {
                                            default: {
                                                break;
                                            }
                                            case 22: {
                                                n3 = object instanceof CCComplaintInfoHelper$CCComplaintInfo;
                                                if (n3 == 0) break block16;
                                                Object object3 = AnalyticsManager.Companion.getInstance().getGtmEvents();
                                                object = (CCComplaintInfoHelper$CCComplaintInfo)object;
                                                object2 = ((CCComplaintInfoHelper$CCComplaintInfo)object).getTicketId();
                                                Object object4 = ((CCComplaintInfoHelper$CCComplaintInfo)object).getOrderId();
                                                String string3 = ((CCComplaintInfoHelper$CCComplaintInfo)object).getIncidentStatus();
                                                long l2 = ((CCComplaintInfoHelper$CCComplaintInfo)object).getTicketDueDate();
                                                String string4 = k7.f(l2, "yyyy-MM-dd");
                                                String string5 = "Complaintcard_Clicked_";
                                                StringBuilder stringBuilder = new StringBuilder(string5);
                                                stringBuilder.append((String)object2);
                                                object2 = "_";
                                                stringBuilder.append((String)object2);
                                                stringBuilder.append((String)object4);
                                                stringBuilder.append((String)object2);
                                                stringBuilder.append(string3);
                                                stringBuilder.append((String)object2);
                                                stringBuilder.append(string4);
                                                object2 = stringBuilder.toString();
                                                object4 = "Selfcare - Clicked on complaint card for details";
                                                ((GTMEvents)object3).pushButtonTapEvent((String)object4, object2, string2);
                                                object3 = ((CCComplaintInfoHelper$CCComplaintInfo)object).getIncidentID();
                                                n3 = (int)(TextUtils.isEmpty((CharSequence)object3) ? 1 : 0);
                                                if (n3 == 0) {
                                                    String string6 = ((CCComplaintInfoHelper$CCComplaintInfo)object).getIncidentID();
                                                    stringBuilder = null;
                                                    string5 = null;
                                                    string3 = null;
                                                    string4 = null;
                                                    boolean bl3 = true;
                                                    object4 = object3;
                                                    object3 = new zq_1(null, null, null, null, string6, false, bl3);
                                                    object = this.getCcActivityListener();
                                                    if (object != null) {
                                                        object = this.cCBundleViewModel;
                                                        if (object != null) {
                                                            ((xf_1)object).c = object3;
                                                        }
                                                        if ((object = this.getCcActivityListener()) != null) {
                                                            n3 = 103;
                                                            object.addFragment(n3, null, bl2);
                                                            break;
                                                        }
                                                    }
                                                }
                                                break block16;
                                            }
                                            case 21: {
                                                Intrinsics.checkNotNull(object, "null cannot be cast to non-null type kotlin.String");
                                                object = (String)object;
                                                Bundle bundle = new Bundle();
                                                object2 = "product_code";
                                                bundle.putString((String)object2, (String)object);
                                                bundle.putBoolean("CLEAR_STACK", bl2);
                                                bundle.putBoolean("is_from_customer_care_page", bl2);
                                                object = this.mListener;
                                                if (object != null) {
                                                    n4 = 35;
                                                    string2 = "";
                                                    object.onFragmentInteraction(string2, n4, bundle);
                                                    break;
                                                }
                                                break block16;
                                            }
                                            case 20: {
                                                object = AnalyticsManager.Companion.getInstance().getGtmEvents();
                                                String string7 = "Selfcare - Clicked on view more complaints";
                                                object2 = "Complaintcard_Clicked_Viewmore";
                                                ((GTMEvents)object).pushButtonTapEvent(string7, object2, string2);
                                                object = this.getCcActivityListener();
                                                if (object != null && (object = this.getCcActivityListener()) != null) {
                                                    n3 = 102;
                                                    object.addFragment(n3, null, bl2);
                                                    break;
                                                }
                                                break block16;
                                            }
                                        }
                                        break block16;
                                    }
                                    object = this.getCcActivityListener();
                                    if (object != null && (object = this.getCcActivityListener()) != null) {
                                        n3 = 104;
                                        object.addFragment(n3, null, bl2);
                                    }
                                    break block16;
                                }
                                n3 = object instanceof String;
                                if (n3 != 0) {
                                    AppCompatActivity appCompatActivity = this.getMActivity();
                                    object = (String)object;
                                    mz3_0.c(appCompatActivity, (String)object);
                                }
                                break block16;
                            }
                            n3 = object instanceof String;
                            if (n3 != 0) {
                                AppCompatActivity appCompatActivity = this.getMActivity();
                                object = (String)object;
                                d23_0.e(appCompatActivity, (String)object);
                            }
                            break block16;
                        }
                        this.onOrderClick(object);
                        break block16;
                    }
                    object = AnalyticsManager.Companion.getInstance().getGtmEvents();
                    String string8 = "Show_All_Orders_clicked";
                    ((GTMEvents)object).pushButtonTapEvent(string8, string2);
                    object = this.getCcActivityListener();
                    if (object != null && (object = this.getCcActivityListener()) != null) {
                        n3 = 105;
                        object.addFragment(n3, null, bl2);
                    }
                    break block16;
                }
                object = this.mUserViewModel;
                Intrinsics.checkNotNull(object);
                boolean bl4 = ((hy3_0)object).p();
                if (!bl4) {
                    this.showLoginDialog();
                }
                break block16;
            }
            this.onFaqClick(object);
        }
    }
}

