/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Bundle
 *  android.os.Handler
 *  android.os.Looper
 *  android.text.TextUtils
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 */
package com.ril.ajio.ondemand.customercare.view.fragment;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.lifecycle.E$b;
import androidx.lifecycle.LiveData;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$f;
import androidx.recyclerview.widget.RecyclerView$n;
import androidx.recyclerview.widget.RecyclerView$o;
import com.ajio.ril.core.network.model.DataError;
import com.ajio.ril.core.network.model.DataError$ErrorMessage;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.AnalyticsManager$Companion;
import com.ril.ajio.analytics.events.GTMEvents;
import com.ril.ajio.customviews.CustomToolbarViewMerger;
import com.ril.ajio.customviews.OnNavigationClickListener;
import com.ril.ajio.customviews.widgets.OnFragmentInteractionListener;
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.ondemand.customercare.view.adapter.CCComplaintAdapter;
import com.ril.ajio.ondemand.customercare.view.fragment.CCBaseFragment;
import com.ril.ajio.ondemand.customercare.view.fragment.CCComplaintListFragment$Companion;
import com.ril.ajio.ondemand.customercare.view.fragment.CCComplaintListFragment$sam$androidx_lifecycle_Observer$0;
import com.ril.ajio.ondemand.customercare.viewmodel.CCViewModel;
import com.ril.ajio.services.data.CustomerCare.CCComplaintInfoHelper;
import com.ril.ajio.services.data.CustomerCare.CCComplaintInfoHelper$CCComplaintInfo;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

public final class CCComplaintListFragment
extends CCBaseFragment
implements i82_0,
OnNavigationClickListener {
    public static final CCComplaintListFragment$Companion Companion;
    public static final String TAG = "CCComplaintListFragment";
    private xf_1 cCBundleViewModel;
    private CustomToolbarViewMerger customToolbarViewMerger;
    private CCComplaintAdapter mCCComplaintAdapter;
    private List mCCComplaintInfoList;
    private CCViewModel mCCViewModel;
    private RecyclerView mComplaintListView;
    private OnFragmentInteractionListener mListener;

    static {
        CCComplaintListFragment$Companion cCComplaintListFragment$Companion;
        Companion = cCComplaintListFragment$Companion = new CCComplaintListFragment$Companion(null);
    }

    public static /* synthetic */ void Oa(CCComplaintListFragment cCComplaintListFragment) {
        CCComplaintListFragment.setToolbarUI$lambda$0(cCComplaintListFragment);
    }

    public static /* synthetic */ Unit Pa(CCComplaintListFragment cCComplaintListFragment, DataCallback dataCallback) {
        return CCComplaintListFragment.initObservables$lambda$1(cCComplaintListFragment, dataCallback);
    }

    private final void hideProgress() {
        pf_1 pf_12 = this.getCcActivityListener();
        if (pf_12 != null) {
            pf_12.stopLoader();
        }
    }

    private final void initObservables() {
        Object object = this.mCCViewModel;
        if (object != null && (object = ((CCViewModel)object).getCCComplaintListObservable()) != null) {
            mu1_1 mu1_12 = this.getViewLifecycleOwner();
            dg_2 dg_22 = new dg_2(this);
            CCComplaintListFragment$sam$androidx_lifecycle_Observer$0 cCComplaintListFragment$sam$androidx_lifecycle_Observer$0 = new CCComplaintListFragment$sam$androidx_lifecycle_Observer$0(dg_22);
            ((LiveData)object).e(mu1_12, cCComplaintListFragment$sam$androidx_lifecycle_Observer$0);
        }
    }

    private static final Unit initObservables$lambda$1(CCComplaintListFragment object, DataCallback object2) {
        Intrinsics.checkNotNullParameter(object, "this$0");
        cp_1.Companion.getClass();
        Object object3 = cp$a.e();
        object3.getClass();
        int n3 = cp_1.J((DataCallback)object2);
        if (n3 != 0) {
            ((CCComplaintListFragment)object).hideProgress();
            if (object2 != null && (n3 = ((DataCallback)object2).getStatus()) == 0) {
                if ((object2 = (CCComplaintInfoHelper)((DataCallback)object2).getData()) != null && (object3 = ((CCComplaintInfoHelper)object2).getIncidentDetail()) != null) {
                    object3 = ((CCComplaintListFragment)object).mCCComplaintInfoList;
                    if (object3 != null) {
                        object3.clear();
                    }
                    if ((object3 = ((CCComplaintListFragment)object).mCCComplaintInfoList) != null) {
                        object2 = ((CCComplaintInfoHelper)object2).getIncidentDetail();
                        String string2 = "getIncidentDetail(...)";
                        Intrinsics.checkNotNullExpressionValue(object2, string2);
                        object2 = (Collection)object2;
                        object3.addAll(object2);
                    }
                    if ((object = ((CCComplaintListFragment)object).mCCComplaintAdapter) != null) {
                        ((RecyclerView$f)object).notifyDataSetChanged();
                    }
                }
            } else {
                int n4 = ((DataCallback)object2).getStatus();
                if (n4 == (n3 = 1)) {
                    int n7;
                    object = ((DataCallback)object2).getError();
                    if (object != null) {
                        object2 = ((DataError)object).errors;
                    } else {
                        n7 = 0;
                        object2 = null;
                    }
                    if (object2 != null) {
                        object2 = ((DataError)object).errors;
                        String string3 = "errors";
                        Intrinsics.checkNotNullExpressionValue(object2, string3);
                        object2 = (Collection)object2;
                        n7 = object2.isEmpty() ^ n3;
                        if (n7 != 0) {
                            object2 = yn3_0.a;
                            object3 = ((DataError)object).getErrors();
                            string3 = null;
                            object3 = ((DataError$ErrorMessage)object3.get(0)).getMessage();
                            Object[] objectArray = new Object[]{};
                            ((yn3$a)object2).a((String)object3, objectArray);
                            object = ((DataError$ErrorMessage)((DataError)object).getErrors().get(0)).getMessage();
                            object3 = new Throwable((String)object);
                            ((yn3$a)object2).e((Throwable)object3);
                        }
                    }
                }
            }
        }
        return Unit.a;
    }

    private final void setToolbarUI() {
        Object object = this.customToolbarViewMerger;
        int n3 = 0;
        Object object2 = null;
        if ((object = object != null ? ((CustomToolbarViewMerger)object).getToolbar() : null) != null) {
            object = this.customToolbarViewMerger;
            if (object != null && (object = ((CustomToolbarViewMerger)object).getToolbar()) != null) {
                object.invalidate();
            }
            if ((object = this.getMActivity()) != null && (object = this.getMActivity()) != null) {
                CustomToolbarViewMerger customToolbarViewMerger = this.customToolbarViewMerger;
                if (customToolbarViewMerger != null) {
                    object2 = customToolbarViewMerger.getToolbar();
                }
                ((AppCompatActivity)object).setSupportActionBar((Toolbar)object2);
            }
        }
        if ((object = this.customToolbarViewMerger) != null) {
            ((CustomToolbarViewMerger)object).setNavigationClick();
        }
        if ((object = this.customToolbarViewMerger) != null) {
            n3 = 8;
            ((CustomToolbarViewMerger)object).setSubTitleVisibility(n3);
        }
        object2 = Looper.getMainLooper();
        object = new Handler(object2);
        object2 = new eg_2(this);
        long l2 = 300L;
        object.postDelayed((Runnable)object2, l2);
        object = this.customToolbarViewMerger;
        if (object != null) {
            object2 = "All Issues";
            ((CustomToolbarViewMerger)object).setTitleText((String)object2);
        }
    }

    private static final void setToolbarUI$lambda$0(CCComplaintListFragment object) {
        String string2 = "this$0";
        Intrinsics.checkNotNullParameter(object, string2);
        object = ((CCComplaintListFragment)object).customToolbarViewMerger;
        if (object != null && (object = ((CustomToolbarViewMerger)object).getToolbar()) != null) {
            ai0_2.a((View)object);
        }
    }

    private final void showProgress() {
        pf_1 pf_12 = this.getCcActivityListener();
        if (pf_12 != null) {
            pf_12.startLoader();
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

    public void onCreate(Bundle object) {
        super.onCreate((Bundle)object);
        object = new CustomToolbarViewMerger(this);
        this.customToolbarViewMerger = object;
        object = "owner";
        Intrinsics.checkNotNullParameter(this, (String)object);
        Object object2 = this.getViewModelStore();
        Intrinsics.checkNotNullParameter(this, (String)object);
        Object object3 = this.getDefaultViewModelProviderFactory();
        Intrinsics.checkNotNullParameter(this, (String)object);
        Object object4 = this.getDefaultViewModelCreationExtras();
        String string2 = "store";
        Intrinsics.checkNotNullParameter(object2, string2);
        String string3 = "factory";
        Intrinsics.checkNotNullParameter(object3, string3);
        String string4 = "defaultCreationExtras";
        Intrinsics.checkNotNullParameter(object4, string4);
        Object object5 = new pD3((rd3_0)object2, (E$b)object3, (Wd0)object4);
        object2 = CCViewModel.class;
        object3 = "modelClass";
        Intrinsics.checkNotNullParameter(object2, (String)object3);
        object2 = rn1_2.c((Class)object2);
        Intrinsics.checkNotNullParameter(object2, (String)object3);
        Intrinsics.checkNotNullParameter(object2, (String)object3);
        object4 = "<this>";
        Intrinsics.checkNotNullParameter(object2, (String)object4);
        Object object6 = object2.getQualifiedName();
        String string5 = "Local and anonymous classes can not be ViewModels";
        if (object6 != null) {
            String string6 = "androidx.lifecycle.ViewModelProvider.DefaultKey:";
            object6 = string6.concat((String)object6);
            this.mCCViewModel = object2 = (CCViewModel)((pD3)object5).a((yn1_2)object2, (String)object6);
            object2 = this.getMActivity();
            Intrinsics.checkNotNull(object2);
            Intrinsics.checkNotNullParameter(object2, (String)object);
            object5 = object2.getViewModelStore();
            Intrinsics.checkNotNullParameter(object2, (String)object);
            object6 = object2.getDefaultViewModelProviderFactory();
            Intrinsics.checkNotNullParameter(object2, (String)object);
            object = object2.getDefaultViewModelCreationExtras();
            Intrinsics.checkNotNullParameter(object5, string2);
            Intrinsics.checkNotNullParameter(object6, string3);
            Intrinsics.checkNotNullParameter(object, string4);
            object2 = new pD3((rd3_0)object5, (E$b)object6, (Wd0)object);
            object = xf_1.class;
            Intrinsics.checkNotNullParameter(object, (String)object3);
            object = rn1_2.c((Class)object);
            Intrinsics.checkNotNullParameter(object, (String)object3);
            Intrinsics.checkNotNullParameter(object, (String)object3);
            Intrinsics.checkNotNullParameter(object, (String)object4);
            object3 = object.getQualifiedName();
            if (object3 != null) {
                object3 = string6.concat((String)object3);
                this.cCBundleViewModel = object = (xf_1)((pD3)object2).a((yn1_2)object, (String)object3);
                AnalyticsManager.Companion.getInstance().getGtmEvents().setScreenName("complaint list page");
                return;
            }
            object2 = string5.toString();
            object = new IllegalArgumentException((String)object2);
            throw object;
        }
        object2 = string5.toString();
        object = new IllegalArgumentException((String)object2);
        throw object;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup object, Bundle object2) {
        object2 = "inflater";
        Intrinsics.checkNotNullParameter(layoutInflater, (String)object2);
        int n3 = R$layout.fragment_cc_complaint_list_refresh;
        layoutInflater = layoutInflater.inflate(n3, (ViewGroup)object, false);
        Intrinsics.checkNotNullExpressionValue(layoutInflater, "inflate(...)");
        object = this.customToolbarViewMerger;
        if (object != null) {
            ((CustomToolbarViewMerger)object).initViews((View)layoutInflater);
        }
        return layoutInflater;
    }

    public void onNavigationClick() {
        AppCompatActivity appCompatActivity = this.getMActivity();
        if (appCompatActivity != null) {
            appCompatActivity = this.getMActivity();
            Intrinsics.checkNotNull(appCompatActivity);
            boolean bl2 = appCompatActivity.isFinishing();
            if (!bl2 && (appCompatActivity = this.getMActivity()) != null) {
                appCompatActivity.onBackPressed();
            }
        }
    }

    public void onViewCreated(View object, Bundle object2) {
        Object object3 = "view";
        Intrinsics.checkNotNullParameter(object, (String)object3);
        super.onViewCreated((View)object, (Bundle)object2);
        this.initObservables();
        this.setToolbarUI();
        int n3 = R$id.complaint_list_view;
        object = (RecyclerView)object.findViewById(n3);
        this.mComplaintListView = object;
        if (object != null) {
            object3 = this.requireActivity();
            int n4 = 1;
            object2 = new LinearLayoutManager((Context)object3, n4, false);
            ((RecyclerView)object).setLayoutManager((RecyclerView$o)object2);
        }
        if ((object = this.mComplaintListView) != null) {
            int n7 = mz3_0.d(14);
            object2 = new xb3_2(n7);
            ((RecyclerView)object).addItemDecoration((RecyclerView$n)object2);
        }
        this.showProgress();
        object = this.mCCViewModel;
        if (object != null) {
            ((CCViewModel)object).getCCComplaintList();
        }
        this.mCCComplaintInfoList = object = new ArrayList();
        object2 = new CCComplaintAdapter((List)object, this);
        this.mCCComplaintAdapter = object2;
        object = this.mComplaintListView;
        if (object != null) {
            ((RecyclerView)object).setAdapter((RecyclerView$f)object2);
        }
    }

    public void onViewItemClick(Object object, int n3) {
        int n4 = 21;
        boolean bl2 = true;
        if (n3 != n4) {
            n4 = 22;
            if (n3 == n4 && (n3 = object instanceof CCComplaintInfoHelper$CCComplaintInfo) != 0) {
                Object object4 = AnalyticsManager.Companion;
                GTMEvents string6 = ((AnalyticsManager$Companion)object4).getInstance().getGtmEvents();
                object = (CCComplaintInfoHelper$CCComplaintInfo)object;
                Object object2 = ((CCComplaintInfoHelper$CCComplaintInfo)object).getTicketId();
                String string2 = ((CCComplaintInfoHelper$CCComplaintInfo)object).getOrderId();
                String string3 = ((CCComplaintInfoHelper$CCComplaintInfo)object).getIncidentStatus();
                long l2 = ((CCComplaintInfoHelper$CCComplaintInfo)object).getTicketDueDate();
                String string4 = k7.f(l2, "yyyy-MM-dd");
                String string5 = "Complaintcard_Clicked_";
                StringBuilder stringBuilder = new StringBuilder(string5);
                stringBuilder.append((String)object2);
                object2 = "_";
                stringBuilder.append((String)object2);
                stringBuilder.append(string2);
                stringBuilder.append((String)object2);
                stringBuilder.append(string3);
                stringBuilder.append((String)object2);
                stringBuilder.append(string4);
                object2 = stringBuilder.toString();
                object4 = ((AnalyticsManager$Companion)object4).getInstance().getGtmEvents().getScreenName();
                string2 = "Selfcare - Clicked on complaint card for details";
                string6.pushButtonTapEvent(string2, object2, (String)object4);
                object4 = ((CCComplaintInfoHelper$CCComplaintInfo)object).getIncidentID();
                n3 = (int)(TextUtils.isEmpty((CharSequence)object4) ? 1 : 0);
                if (n3 == 0) {
                    string5 = ((CCComplaintInfoHelper$CCComplaintInfo)object).getIncidentID();
                    boolean bl3 = true;
                    string2 = null;
                    string3 = null;
                    string4 = null;
                    stringBuilder = null;
                    object2 = object4;
                    object4 = new zq_1(null, null, null, null, string5, false, bl3);
                    object = this.getCcActivityListener();
                    if (object != null) {
                        object = this.cCBundleViewModel;
                        if (object != null) {
                            ((xf_1)object).c = object4;
                        }
                        if ((object = this.getCcActivityListener()) != null) {
                            n3 = 103;
                            n4 = 0;
                            string6 = null;
                            object.addFragment(n3, null, bl2);
                        }
                    }
                }
            }
        } else {
            n3 = object instanceof String;
            if (n3 != 0) {
                Object object3 = object;
                object3 = (CharSequence)object;
                n3 = (int)(TextUtils.isEmpty((CharSequence)object3) ? 1 : 0);
                if (n3 == 0 && (object3 = this.getMActivity()) != null) {
                    object3 = new Bundle();
                    String string6 = "product_code";
                    object = (String)object;
                    object3.putString(string6, (String)object);
                    object3.putBoolean("CLEAR_STACK", bl2);
                    object3.putBoolean("is_from_customer_care_page", bl2);
                    object = this.mListener;
                    if (object != null) {
                        string6 = "";
                        int n7 = 35;
                        object.onFragmentInteraction(string6, n7, (Bundle)object3);
                    }
                }
            }
        }
    }
}

