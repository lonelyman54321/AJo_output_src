/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.Intent
 *  android.os.Bundle
 */
package com.ril.ajio.ondemand.customercare.view.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.a;
import androidx.lifecycle.E$b;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.AjioLoaderView;
import com.ril.ajio.customviews.widgets.OnFragmentInteractionListener;
import com.ril.ajio.home.AjioHomeActivity;
import com.ril.ajio.ondemand.customercare.callmeback.CcCallMeFragment;
import com.ril.ajio.ondemand.customercare.faq.CCFaqFragment;
import com.ril.ajio.ondemand.customercare.help.CCItemHelpFragment;
import com.ril.ajio.ondemand.customercare.itemdetail.CCItemDetailFragment;
import com.ril.ajio.ondemand.customercare.selectorder.CCSelectOrderFragment;
import com.ril.ajio.ondemand.customercare.view.fragment.CCBaseFragment;
import com.ril.ajio.ondemand.customercare.view.fragment.CCComplaintListFragment;
import com.ril.ajio.ondemand.customercare.view.fragment.CustomerCareFragment;
import com.ril.ajio.ondemand.customercare.view.fragment.OrderTrackingFragment;
import com.ril.ajio.ondemand.customercare.view.fragment.SearchFaqFragment;
import com.ril.ajio.view.BaseSplitActivity;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Stack;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

public final class CustomerCareActivity
extends BaseSplitActivity
implements pf_1,
OnFragmentInteractionListener {
    private xf_1 cCBundleViewModel;
    private AjioLoaderView loaderView;
    private Fragment mFragment;
    private FragmentManager mFragmentManager;

    private static final void onCreate$lambda$0(CustomerCareActivity customerCareActivity) {
        Intrinsics.checkNotNullParameter(customerCareActivity, "this$0");
        Object object = customerCareActivity.mFragmentManager;
        if (object != null) {
            int n3 = R$id.customercare_contentframe;
            object = ((FragmentManager)object).D(n3);
        } else {
            object = null;
        }
        customerCareActivity.mFragment = object;
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final void replaceFragment(boolean bl2, String object, CCBaseFragment cCBaseFragment) {
        Exception exception222222;
        Object object2 = this.mFragmentManager;
        if (object2 == null) return;
        if (cCBaseFragment == null) return;
        Intrinsics.checkNotNull(object2);
        a a2 = new a((FragmentManager)object2);
        object2 = "beginTransaction(...)";
        Intrinsics.checkNotNullExpressionValue(a2, (String)object2);
        int n3 = R$id.customercare_contentframe;
        a2.j(n3, cCBaseFragment, (String)object);
        if (bl2) {
            a2.c((String)object);
        }
        if (bl2 = this.isDestroyed()) return;
        FragmentManager fragmentManager = this.mFragmentManager;
        if (fragmentManager == null) return;
        bl2 = fragmentManager.K;
        if (bl2) return;
        bl2 = true;
        a2.o(bl2, bl2);
        {
            catch (Exception exception222222) {}
        }
        try {
            fragmentManager = this.mFragmentManager;
            if (fragmentManager == null) return;
            fragmentManager.C();
            return;
        }
        catch (Exception exception3) {
            object = yn3_0.a;
            ((yn3$a)object).e(exception3);
            return;
        }
        object = yn3_0.a;
        ((yn3$a)object).e(exception222222);
        Object object3 = this.mFragmentManager;
        if (object3 == null) return;
        object3 = ((FragmentManager)object3).c.f();
        if (object3 == null) return;
        bl2 = object3.size();
        if (bl2) return;
        this.finish();
    }

    public static /* synthetic */ void y2(CustomerCareActivity customerCareActivity) {
        CustomerCareActivity.onCreate$lambda$0(customerCareActivity);
    }

    public void addFragment(int n3, Bundle object, boolean bl2) {
        CCBaseFragment cCBaseFragment;
        switch (n3) {
            default: {
                n3 = 0;
                cCBaseFragment = null;
                object = null;
                break;
            }
            case 109: {
                cCBaseFragment = new OrderTrackingFragment();
                object = "OrderTrackingFragment";
                break;
            }
            case 108: {
                cCBaseFragment = new CCItemDetailFragment();
                if (object != null) {
                    cCBaseFragment.setArguments((Bundle)object);
                }
                object = "CCItemDetailFragment";
                break;
            }
            case 107: {
                cCBaseFragment = new CcCallMeFragment();
                object = "CcCallMeFragment";
                break;
            }
            case 106: {
                cCBaseFragment = new CCFaqFragment();
                object = "CCFaqFragment";
                break;
            }
            case 105: {
                cCBaseFragment = new CCSelectOrderFragment();
                object = "CCSelectOrderFragment";
                break;
            }
            case 104: {
                cCBaseFragment = SearchFaqFragment.Companion.newInstance();
                object = "SearchFaqFragment";
                break;
            }
            case 103: {
                cCBaseFragment = new CCItemHelpFragment();
                object = "CCItemHelpFragment";
                break;
            }
            case 102: {
                cCBaseFragment = new CCComplaintListFragment();
                object = "CCComplaintListFragment";
                break;
            }
            case 101: {
                cCBaseFragment = new CustomerCareFragment();
                object = "CustomerCareFragment";
            }
        }
        if (cCBaseFragment != null) {
            Intrinsics.checkNotNull(object);
            this.replaceFragment(bl2, (String)object, cCBaseFragment);
        }
    }

    public void onBackPressed() {
        Fragment fragment = this.mFragment;
        boolean bl2 = fragment instanceof CCItemDetailFragment;
        if (bl2) {
            String string2 = "null cannot be cast to non-null type com.ril.ajio.ondemand.customercare.itemdetail.CCItemDetailFragment";
            Intrinsics.checkNotNull(fragment, string2);
            fragment = (CCItemDetailFragment)fragment;
            ((CCItemDetailFragment)fragment).onBackPressed();
        } else {
            bl2 = fragment instanceof CCFaqFragment;
            if (bl2) {
                String string3 = "null cannot be cast to non-null type com.ril.ajio.ondemand.customercare.faq.CCFaqFragment";
                Intrinsics.checkNotNull(fragment, string3);
                fragment = (CCFaqFragment)fragment;
                ((CCFaqFragment)fragment).onBackPressed();
            } else {
                bl2 = fragment instanceof CustomerCareFragment;
                if (bl2) {
                    String string4 = "null cannot be cast to non-null type com.ril.ajio.ondemand.customercare.view.fragment.CustomerCareFragment";
                    Intrinsics.checkNotNull(fragment, string4);
                    fragment = (CustomerCareFragment)fragment;
                    ((CustomerCareFragment)fragment).handleBackBtnPress();
                } else {
                    this.popBackStack();
                }
            }
        }
    }

    public void onCreate(Bundle object) {
        super.onCreate((Bundle)object);
        int n3 = R$layout.activity_customer_care_refresh;
        this.setContentView(n3);
        object = "owner";
        Intrinsics.checkNotNullParameter(this, (String)object);
        Object object2 = this.getViewModelStore();
        Intrinsics.checkNotNullParameter(this, (String)object);
        Object object3 = this.getDefaultViewModelProviderFactory();
        Intrinsics.checkNotNullParameter(this, (String)object);
        object = this.getDefaultViewModelCreationExtras();
        Intrinsics.checkNotNullParameter(object2, "store");
        Intrinsics.checkNotNullParameter(object3, "factory");
        Intrinsics.checkNotNullParameter(object, "defaultCreationExtras");
        pD3 pD32 = new pD3((rd3_0)object2, (E$b)object3, (Wd0)object);
        object = xf_1.class;
        object2 = "modelClass";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        object3 = "<this>";
        Intrinsics.checkNotNullParameter(object, (String)object3);
        object = Reflection.getOrCreateKotlinClass((Class)object);
        Intrinsics.checkNotNullParameter(object, (String)object2);
        Intrinsics.checkNotNullParameter(object, (String)object2);
        Intrinsics.checkNotNullParameter(object, (String)object3);
        object2 = object.getQualifiedName();
        if (object2 != null) {
            object3 = "androidx.lifecycle.ViewModelProvider.DefaultKey:";
            object2 = ((String)object3).concat((String)object2);
            this.cCBundleViewModel = object = (xf_1)pD32.a((yn1_2)object, (String)object2);
            n3 = R$id.ajio_loader_view;
            object = (AjioLoaderView)this.findViewById(n3);
            this.loaderView = object;
            object = this.getSupportFragmentManager();
            this.mFragmentManager = object;
            if (object != null) {
                object2 = new sg0_2(this);
                object = ((FragmentManager)object).o;
                ((ArrayList)object).add(object2);
            }
            object = this.getIntent();
            int n4 = 101;
            n3 = object.getIntExtra("CC_FRAGMENT_TYPE", n4);
            object2 = null;
            boolean bl2 = true;
            if (n3 != n4) {
                n4 = 108;
                if (n3 == n4) {
                    object = this.getIntent().getStringExtra("CART_ORDER_ID");
                    Intent intent = this.getIntent();
                    boolean bl3 = intent.getBooleanExtra("FROM_ORDER_DETAIL", false);
                    Intent intent2 = this.getIntent();
                    String string2 = "SELECTED_ENTRY_NO";
                    int n7 = intent2.getIntExtra(string2, 0);
                    yq_0 yq_02 = new yq_0((String)object, n7, bl3);
                    object = this.cCBundleViewModel;
                    if (object != null) {
                        ((xf_1)object).e = yq_02;
                    }
                    this.addFragment(n4, null, bl2);
                }
            } else {
                this.addFragment(n4, null, bl2);
            }
            return;
        }
        object2 = "Local and anonymous classes can not be ViewModels".toString();
        object = new IllegalArgumentException((String)object2);
        throw object;
    }

    public void onFragmentInteraction(String string2, int n3, Bundle object) {
        int n4 = 35;
        if (n3 == n4 && object != null) {
            Intent intent = new Intent((Context)this, AjioHomeActivity.class);
            Bundle bundle = new Bundle();
            String string3 = "product_code";
            String string4 = object.getString(string3);
            bundle.putString(string3, string4);
            string3 = "clicked_item_code";
            string4 = object.getString(string3);
            bundle.putString(string3, string4);
            string3 = "is_from_customer_care_page";
            boolean bl2 = object.containsKey(string3);
            if (bl2) {
                boolean bl3 = object.getBoolean(string3);
                bundle.putBoolean(string3, bl3);
            }
            object = "OPTYPE";
            intent.putExtra((String)object, n4);
            intent.putExtras(bundle);
            this.startActivity(intent);
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public void popBackStack() {
        FragmentManager fragmentManager = this.mFragmentManager;
        if (fragmentManager != null) {
            Intrinsics.checkNotNull(fragmentManager);
            int n3 = fragmentManager.J();
            int n4 = 1;
            if (n3 > n4) {
                fragmentManager = this.getSupportFragmentManager();
                fragmentManager.W();
                return;
            }
        }
        this.finish();
    }

    public void resetView() {
        Object object = this.cCBundleViewModel;
        if (object != null) {
            ((xf_1)object).a = null;
            Stack stack = ((xf_1)object).b;
            ((AbstractCollection)stack).clear();
            ((xf_1)object).c = null;
            ((xf_1)object).d = null;
            ((xf_1)object).e = null;
            ((xf_1)object).f = null;
            ((xf_1)object).g = null;
        }
        object = this.mFragmentManager;
        int n3 = 1;
        if (object != null) {
            int n4 = -1;
            ((FragmentManager)object).X(n4, n3, null);
        }
        this.addFragment(101, null, n3 != 0);
    }

    public void showToastNotification(Context context, String string2, int n3, String string3) {
        ig0_0.Companion.getClass();
        Intrinsics.checkNotNull(context);
        Intrinsics.checkNotNull(string2);
        Integer n4 = n3;
        ig0_0.a(context, string2, n4, string3);
    }

    public void startLoader() {
        AjioLoaderView ajioLoaderView = this.loaderView;
        if (ajioLoaderView != null) {
            Intrinsics.checkNotNull((Object)ajioLoaderView);
            ajioLoaderView.startLoader();
        }
    }

    public void stopLoader() {
        AjioLoaderView ajioLoaderView = this.loaderView;
        if (ajioLoaderView != null) {
            Intrinsics.checkNotNull((Object)ajioLoaderView);
            ajioLoaderView.stopLoader();
        }
    }
}

