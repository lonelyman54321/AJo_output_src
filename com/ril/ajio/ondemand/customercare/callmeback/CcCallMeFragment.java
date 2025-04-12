/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.graphics.Typeface
 *  android.os.Bundle
 *  android.os.Handler
 *  android.os.Looper
 *  android.text.SpannableString
 *  android.text.TextUtils
 *  android.text.TextWatcher
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.widget.EditText
 *  android.widget.TextView
 */
package com.ril.ajio.ondemand.customercare.callmeback;

import android.app.Activity;
import android.content.Context;
import android.graphics.Typeface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.E$b;
import androidx.lifecycle.LiveData;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$f;
import androidx.recyclerview.widget.RecyclerView$o;
import com.google.android.flexbox.FlexboxLayoutManager;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.google.android.material.snackbar.Snackbar;
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
import com.ril.ajio.customviews.widgets.AjioButton;
import com.ril.ajio.customviews.widgets.AjioCustomTypefaceSpan;
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.ondemand.customercare.callmeback.CallMeAdapterListener;
import com.ril.ajio.ondemand.customercare.callmeback.CallMeLangAdapter;
import com.ril.ajio.ondemand.customercare.callmeback.CallMeTimeSlotAdapter;
import com.ril.ajio.ondemand.customercare.callmeback.CcCallMeFragment$Companion;
import com.ril.ajio.ondemand.customercare.callmeback.CcCallMeFragment$onViewCreated$1;
import com.ril.ajio.ondemand.customercare.callmeback.CcCallMeFragment$onViewCreated$2;
import com.ril.ajio.ondemand.customercare.view.fragment.CCBaseFragment;
import com.ril.ajio.ondemand.customercare.viewmodel.CCViewModel;
import com.ril.ajio.services.data.CustomerCare.CCItemDetailsQAModel$CCItemQALists;
import com.ril.ajio.services.data.CustomerCare.CallMeBackInfo;
import com.ril.ajio.services.data.CustomerCare.CallMeBackStatus;
import com.ril.ajio.services.data.CustomerCare.TimeSlots;
import com.ril.ajio.services.data.user.UserInformation;
import com.ril.ajio.services.query.QuerySubmitCallMeBack;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.StringsKt;
import kotlin.text.b;

public final class CcCallMeFragment
extends CCBaseFragment
implements View.OnClickListener,
CallMeAdapterListener,
OnNavigationClickListener {
    public static final CcCallMeFragment$Companion Companion;
    public static final String TAG = "CcCallMeFragment";
    private AjioButton btnDone;
    private HashMap bundledatalist;
    private xf_1 cCBundleViewModel;
    private final wq_0 ccCustomEvent;
    private CCViewModel ccViewModel;
    private CustomToolbarViewMerger customToolbarViewMerger;
    private TextView estWaitTimeTv;
    private EditText etComment;
    private EditText etMobile;
    private boolean isLuxeOrder;
    private TextView langHeaderTv;
    private RecyclerView langRV;
    private TextView lblMobileError;
    private final NewCustomEventsRevamp newCustomEventsRevamp;
    private final NewEEcommerceEventsRevamp newEEcommerceEventsRevamp;
    private String orderId;
    private String orderStatus;
    private String previousScreen;
    private String previousScreenType;
    private String productId;
    private CCItemDetailsQAModel$CCItemQALists qaItem;
    private TextView timeSlotHeaderTv;
    private RecyclerView timeSlotRv;
    private TextView tvCharacter;
    private final rq1_2 userInformation$delegate;

    static {
        CcCallMeFragment$Companion ccCallMeFragment$Companion;
        Companion = ccCallMeFragment$Companion = new CcCallMeFragment$Companion(null);
    }

    public CcCallMeFragment() {
        Object object = "";
        this.orderStatus = object;
        this.orderId = object;
        this.productId = object;
        object = AnalyticsManager.Companion;
        Object object2 = ((AnalyticsManager$Companion)object).getInstance().getNewCustomEventsRevamp();
        this.newCustomEventsRevamp = object2;
        this.newEEcommerceEventsRevamp = object = ((AnalyticsManager$Companion)object).getInstance().getNewEEcommerceEventsRevamp();
        this.previousScreenType = object2 = ((NewEEcommerceEventsRevamp)object).getPrevScreenType();
        this.previousScreen = object = ((NewEEcommerceEventsRevamp)object).getPrevScreen();
        object = new sq_2(this);
        this.userInformation$delegate = object = yr1_2.b((Function0)object);
        object = new HashMap();
        this.bundledatalist = object;
        this.ccCustomEvent = object = new wq_0();
    }

    public static /* synthetic */ void Oa(CcCallMeFragment ccCallMeFragment, DataCallback dataCallback) {
        CcCallMeFragment.initObservables$lambda$4(ccCallMeFragment, dataCallback);
    }

    public static /* synthetic */ void Pa(CcCallMeFragment ccCallMeFragment, DataCallback dataCallback) {
        CcCallMeFragment.initObservables$lambda$5(ccCallMeFragment, dataCallback);
    }

    public static /* synthetic */ UserInformation Qa(CcCallMeFragment ccCallMeFragment) {
        return CcCallMeFragment.userInformation_delegate$lambda$0(ccCallMeFragment);
    }

    public static final /* synthetic */ TextView access$getLblMobileError$p(CcCallMeFragment ccCallMeFragment) {
        return ccCallMeFragment.lblMobileError;
    }

    public static final /* synthetic */ TextView access$getTvCharacter$p(CcCallMeFragment ccCallMeFragment) {
        return ccCallMeFragment.tvCharacter;
    }

    private final UserInformation getUserInformation() {
        return (UserInformation)this.userInformation$delegate.getValue();
    }

    private final void hideProgressView() {
        pf_1 pf_12 = this.getCcActivityListener();
        if (pf_12 != null) {
            pf_12.stopLoader();
        }
    }

    private final void initObservables() {
        F62 f62;
        mu1_1 mu1_12;
        Object object = this.ccViewModel;
        if (object != null && (object = ((CCViewModel)object).getCcCallMeBackInfoObservable()) != null) {
            mu1_12 = this.getViewLifecycleOwner();
            f62 = new tq_2(this);
            ((LiveData)object).e(mu1_12, f62);
        }
        if ((object = this.ccViewModel) != null && (object = ((CCViewModel)object).getCcSubmitCallMeBackObservable()) != null) {
            mu1_12 = this.getViewLifecycleOwner();
            f62 = new uq_2(this);
            ((LiveData)object).e(mu1_12, f62);
        }
    }

    private static final void initObservables$lambda$4(CcCallMeFragment sD32, DataCallback object) {
        Intrinsics.checkNotNullParameter(sD32, "this$0");
        cp_1.Companion.getClass();
        Object object2 = cp$a.e();
        object2.getClass();
        int n3 = cp_1.J((DataCallback)object);
        if (n3 != 0) {
            sD32.hideProgressView();
            if (object != null && (n3 = ((DataCallback)object).getStatus()) == 0) {
                object2 = sD32.ccViewModel;
                if (object2 != null) {
                    object = (CallMeBackInfo)((DataCallback)object).getData();
                    boolean bl2 = sD32.isLuxeOrder;
                    ((CCViewModel)object2).processResponse((CallMeBackInfo)object, bl2);
                }
                sD32.initView();
            } else {
                int n4 = ((DataCallback)object).getStatus();
                if (n4 == (n3 = 1) && (object = sD32.getActivity()) != null) {
                    object = ab0_0.Companion;
                    sD32 = sD32.requireActivity();
                    object2 = "requireActivity(...)";
                    Intrinsics.checkNotNullExpressionValue(sD32, (String)object2);
                    object.getClass();
                    aB0$a.a((Activity)sD32);
                }
            }
        }
    }

    private static final void initObservables$lambda$5(CcCallMeFragment object, DataCallback object2) {
        int n3 = 1;
        Intrinsics.checkNotNullParameter(object, "this$0");
        cp_1.Companion.getClass();
        Object object3 = cp$a.e();
        object3.getClass();
        int n4 = cp_1.J((DataCallback)object2);
        if (n4 != 0) {
            ((CcCallMeFragment)object).hideProgressView();
            if (object2 != null && (n4 = ((DataCallback)object2).getStatus()) == 0) {
                Object object4;
                String string2;
                Object object5;
                object2 = (CallMeBackStatus)((DataCallback)object2).getData();
                ((CcCallMeFragment)object).pushCallMeSuccessEvent();
                if (object2 != null && (n4 = (int)(TextUtils.isEmpty((CharSequence)(object3 = ((CallMeBackStatus)object2).getStatusMessage())) ? 1 : 0)) == 0) {
                    object2 = ((CallMeBackStatus)object2).getStatusMessage();
                    Intrinsics.checkNotNull(object2, "null cannot be cast to non-null type kotlin.String");
                    object3 = StringCompanionObject.INSTANCE;
                    n4 = R$string.acc_alert_message;
                    object3 = hv3_0.K(n4);
                    object5 = new Object[n3];
                    string2 = null;
                    object5[0] = object2;
                    object4 = Arrays.copyOf(object5, n3);
                    object4 = String.format((String)object3, object4);
                    object3 = "format(...)";
                    Intrinsics.checkNotNullExpressionValue(object4, (String)object3);
                    mq0_2.c((String)object2, (String)object4);
                }
                object2 = ((CcCallMeFragment)object).bundledatalist;
                object4 = ((CcCallMeFragment)object).cCBundleViewModel;
                Intrinsics.checkNotNull(object4);
                object4 = object4.d;
                Intrinsics.checkNotNull(object4);
                object4 = String.valueOf(object4.c);
                ((HashMap)object2).put("status", object4);
                object2 = ((CcCallMeFragment)object).bundledatalist;
                object4 = ((CcCallMeFragment)object).cCBundleViewModel;
                Intrinsics.checkNotNull(object4);
                object4 = object4.d;
                Intrinsics.checkNotNull(object4);
                object4 = String.valueOf(object4.b);
                ((HashMap)object2).put("order_id", object4);
                object2 = ((CcCallMeFragment)object).bundledatalist;
                object4 = ((CcCallMeFragment)object).cCBundleViewModel;
                Intrinsics.checkNotNull(object4);
                object4 = object4.d;
                Intrinsics.checkNotNull(object4);
                object4 = String.valueOf(object4.d);
                object3 = "product_id";
                ((HashMap)object2).put(object3, object4);
                object5 = ((CcCallMeFragment)object).ccCustomEvent;
                string2 = ((CcCallMeFragment)object).newCustomEventsRevamp.getEC_SELF_CARE_INTERACTION();
                object2 = ((CcCallMeFragment)object).newCustomEventsRevamp;
                String string3 = ((NewCustomEventsRevamp)object2).getEA_CALL_ME_BACK_SUCCESS();
                HashMap hashMap = ((CcCallMeFragment)object).bundledatalist;
                String string4 = "EA_CALL_ME_BACK_SUCCESS";
                String string5 = "Call Me Back Screen";
                ((wq_0)object5).a(string2, string3, string4, string5, hashMap);
                object = ((CCBaseFragment)object).getCcActivityListener();
                if (object != null) {
                    object.popBackStack();
                }
            } else {
                int n7 = ((DataCallback)object2).getStatus();
                if (n7 == n3) {
                    ((CcCallMeFragment)object).pushCallMeErrorEvent();
                    object2 = ((Fragment)object).getActivity();
                    if (object2 != null) {
                        object2 = ab0_0.Companion;
                        object = ((Fragment)object).requireActivity();
                        String string6 = "requireActivity(...)";
                        Intrinsics.checkNotNullExpressionValue(object, string6);
                        object2.getClass();
                        aB0$a.a((Activity)object);
                    }
                }
            }
        }
    }

    private final void initView() {
        boolean bl2;
        String string2;
        Object object;
        Object object2 = this.ccViewModel;
        Object object3 = null;
        if (object2 != null && (object2 = ((CCViewModel)object2).getCallMeBackInfo()) != null && (object2 = ((CallMeBackInfo)object2).getLanguages()) != null) {
            object = new CallMeLangAdapter((ArrayList)object2, this);
            object2 = this.langRV;
            string2 = "langRV";
            if (object2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string2);
                bl2 = false;
                object2 = null;
            }
            object2.setVisibility(0);
            object2 = this.langRV;
            if (object2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string2);
                bl2 = false;
                object2 = null;
            }
            ((RecyclerView)object2).setAdapter((RecyclerView$f)object);
            object2 = this.langHeaderTv;
            if (object2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("langHeaderTv");
                bl2 = false;
                object2 = null;
            }
            object2.setVisibility(0);
        }
        if ((object2 = this.ccViewModel) != null) {
            object2 = ((CCViewModel)object2).getCallMeSelectedLang();
        } else {
            bl2 = false;
            object2 = null;
        }
        this.setEstimatedWaitTime((String)object2);
        object2 = z40_0.Companion;
        AJIOApplication.Companion.getClass();
        object = AJIOApplication$a.a();
        object2.getClass();
        object2 = z40$a.a((Context)object).a;
        object = "call_me_time_slot_enable";
        bl2 = ((ao0_0)object2).a((String)object);
        if (bl2 && (object2 = this.ccViewModel) != null && (object2 = ((CCViewModel)object2).getCallMeBackInfo()) != null && (object2 = ((CallMeBackInfo)object2).getTimeSlots()) != null) {
            object = new CallMeTimeSlotAdapter((ArrayList)object2, this);
            object2 = this.timeSlotRv;
            string2 = "timeSlotRv";
            if (object2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string2);
                bl2 = false;
                object2 = null;
            }
            ((RecyclerView)object2).setAdapter((RecyclerView$f)object);
            object2 = this.timeSlotRv;
            if (object2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string2);
                bl2 = false;
                object2 = null;
            }
            object2.setVisibility(0);
            object2 = this.timeSlotHeaderTv;
            if (object2 == null) {
                object2 = "timeSlotHeaderTv";
                Intrinsics.throwUninitializedPropertyAccessException((String)object2);
            } else {
                object3 = object2;
            }
            object3.setVisibility(0);
        }
    }

    private final void pushCallMeErrorEvent() {
        Object object = this.orderStatus;
        boolean bl2 = TextUtils.isEmpty((CharSequence)object);
        if (!bl2 && !(bl2 = TextUtils.isEmpty((CharSequence)(object = this.orderId))) && (object = this.qaItem) != null) {
            object = this.getUserInformation().getUserEmailId();
            Object object2 = this.ccViewModel;
            String string2 = null;
            object2 = object2 != null ? ((CCViewModel)object2).getCallMeSelectedLang() : null;
            String string3 = this.orderId;
            String string4 = this.orderStatus;
            Serializable serializable = this.qaItem;
            if (serializable != null) {
                string2 = ((CCItemDetailsQAModel$CCItemQALists)serializable).getQuestion();
            }
            serializable = new StringBuilder("PO_Callback_InitFail_");
            ((StringBuilder)serializable).append(string3);
            string3 = "_";
            ((StringBuilder)serializable).append(string3);
            ((StringBuilder)serializable).append(string4);
            ((StringBuilder)serializable).append(string3);
            ((StringBuilder)serializable).append(string2);
            ((StringBuilder)serializable).append(string3);
            ((StringBuilder)serializable).append((String)object2);
            ((StringBuilder)serializable).append(string3);
            ((StringBuilder)serializable).append((String)object);
            String string5 = ((StringBuilder)serializable).toString();
            object = AnalyticsManager.Companion.getInstance();
            GTMEvents gTMEvents = ((AnalyticsManager)object).getGtmEvents();
            int n3 = 8;
            String string6 = "Selfcare \u2013 Post order callback request form submit error";
            String string7 = "call me screen";
            GTMEvents.pushServiceErrorEvent$default(gTMEvents, string6, string5, string7, null, n3, null);
        }
    }

    private final void pushCallMeSuccessEvent() {
        Object object = this.orderStatus;
        boolean bl2 = TextUtils.isEmpty((CharSequence)object);
        if (!bl2 && !(bl2 = TextUtils.isEmpty((CharSequence)(object = this.orderId))) && (object = this.qaItem) != null) {
            object = this.getUserInformation().getUserEmailId();
            Object object2 = this.ccViewModel;
            String string2 = null;
            object2 = object2 != null ? ((CCViewModel)object2).getCallMeSelectedLang() : null;
            String string3 = this.orderId;
            String string4 = this.orderStatus;
            Serializable serializable = this.qaItem;
            if (serializable != null) {
                string2 = ((CCItemDetailsQAModel$CCItemQALists)serializable).getQuestion();
            }
            String string5 = "PO_Callback_InitSuccess_";
            serializable = new StringBuilder(string5);
            ((StringBuilder)serializable).append(string3);
            string3 = "_";
            ((StringBuilder)serializable).append(string3);
            ((StringBuilder)serializable).append(string4);
            ((StringBuilder)serializable).append(string3);
            ((StringBuilder)serializable).append(string2);
            ((StringBuilder)serializable).append(string3);
            ((StringBuilder)serializable).append((String)object2);
            ((StringBuilder)serializable).append(string3);
            ((StringBuilder)serializable).append((String)object);
            object = ((StringBuilder)serializable).toString();
            object2 = AnalyticsManager.Companion.getInstance().getGtmEvents();
            string2 = "Selfcare \u2013 Post order callback request form submit";
            string3 = "call me screen";
            string4 = "serviceSuccessEvent";
            ((GTMEvents)object2).pushEvent(string4, string2, object, string3);
        }
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    private final void setEstimatedWaitTime(String object) {
        TextView textView;
        int n3;
        int n4 = 1;
        int n7 = 4;
        String string2 = "estWaitTimeTv";
        TextView textView2 = null;
        if (object != null && (n3 = ((String)object).length()) != 0) {
            z40$a z40$a = z40_0.Companion;
            AJIOApplication.Companion.getClass();
            Object object2 = AJIOApplication$a.a();
            z40$a.getClass();
            ao0_0 ao0_02 = z40$a.a((Context)object2).a;
            object2 = "call_me_est_wait_time_enable";
            n3 = (int)(ao0_02.a((String)object2) ? 1 : 0);
            if (n3 != 0) {
                void var1_5;
                String string3;
                HashMap hashMap;
                CCViewModel cCViewModel = this.ccViewModel;
                if (cCViewModel != null && (hashMap = cCViewModel.getCallMeLangEstWaitTimeMap()) != null) {
                    object2 = Locale.ROOT;
                    string3 = "ROOT";
                    Intrinsics.checkNotNullExpressionValue(object2, string3);
                    String string4 = ((String)object).toLowerCase((Locale)object2);
                    object2 = "toLowerCase(...)";
                    Intrinsics.checkNotNullExpressionValue(string4, (String)object2);
                    String string5 = (String)hashMap.get(string4);
                } else {
                    Object var1_4 = null;
                }
                if (var1_5 != null && (n3 = var1_5.length()) != 0) {
                    void var1_10;
                    n7 = R$string.est_wait_time;
                    Object[] objectArray = new Object[n4];
                    objectArray[0] = var1_5;
                    String string6 = hv3_0.L(n7, objectArray);
                    n7 = StringsKt.O(string6, ":", 0, false, 6) + n4;
                    n4 = string6.length();
                    SpannableString spannableString = new SpannableString((CharSequence)string6);
                    object2 = this.getContext();
                    int n8 = 10;
                    object2 = hv3_0.o(n8, (Context)object2);
                    string3 = "";
                    AjioCustomTypefaceSpan ajioCustomTypefaceSpan = new AjioCustomTypefaceSpan(string3, (Typeface)object2);
                    int n10 = 33;
                    spannableString.setSpan((Object)ajioCustomTypefaceSpan, n7, n4, n10);
                    TextView textView3 = this.estWaitTimeTv;
                    if (textView3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(string2);
                        Object var1_9 = null;
                    }
                    var1_10.setText((CharSequence)spannableString);
                    TextView textView4 = this.estWaitTimeTv;
                    if (textView4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(string2);
                    } else {
                        textView2 = textView4;
                    }
                    textView2.setVisibility(0);
                    return;
                }
                TextView textView5 = this.estWaitTimeTv;
                if (textView5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(string2);
                } else {
                    textView2 = textView5;
                }
                textView2.setVisibility(n7);
                return;
            }
        }
        if ((textView = this.estWaitTimeTv) == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string2);
        } else {
            textView2 = textView;
        }
        textView2.setVisibility(n7);
    }

    private final void setupToolbar() {
        boolean bl2;
        Object object = this.customToolbarViewMerger;
        int n3 = 0;
        Object object2 = null;
        if (object != null) {
            object = ((CustomToolbarViewMerger)object).getToolbar();
        } else {
            bl2 = false;
            object = null;
        }
        if (object != null) {
            object = this.customToolbarViewMerger;
            if (object != null) {
                object2 = ((CustomToolbarViewMerger)object).getToolbar();
            }
            Intrinsics.checkNotNull(object2);
            object2.invalidate();
            object = this.getActivity();
            bl2 = object instanceof AppCompatActivity;
            if (bl2) {
                object = this.getActivity();
                Intrinsics.checkNotNull(object, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
                object = (AppCompatActivity)object;
                object2 = this.customToolbarViewMerger;
                Intrinsics.checkNotNull(object2);
                object2 = ((CustomToolbarViewMerger)object2).getToolbar();
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
        if ((object = this.customToolbarViewMerger) != null) {
            n3 = R$string.request_a_call;
            object2 = this.getString(n3);
            String string2 = "getString(...)";
            Intrinsics.checkNotNullExpressionValue(object2, string2);
            ((CustomToolbarViewMerger)object).setTitleText((String)object2);
        }
    }

    private final void showProgressView() {
        pf_1 pf_12 = this.getCcActivityListener();
        if (pf_12 != null) {
            pf_12.startLoader();
        }
    }

    private final void submitCallMeBackDetail() {
        int n3;
        Object object = null;
        int n4 = 1;
        Object object2 = this.ccViewModel;
        Object object3 = null;
        if (object2 != null) {
            object2 = ((CCViewModel)object2).getCallMeSelectedLang();
        } else {
            boolean n32 = false;
            object2 = null;
        }
        if (object2 != null && (n3 = object2.length()) != 0) {
            this.showProgressView();
            object = new QuerySubmitCallMeBack();
            Object object4 = this.etComment;
            if (object4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("etComment");
                n4 = 0;
                object4 = null;
            }
            object4 = object4.getText().toString();
            ((QuerySubmitCallMeBack)object).setComments((String)object4);
            object4 = this.ccViewModel;
            if (object4 != null) {
                object4 = ((CCViewModel)object4).getCallMeSelectedLang();
            } else {
                n4 = 0;
                object4 = null;
            }
            ((QuerySubmitCallMeBack)object).setLanguage((String)object4);
            object4 = this.qaItem;
            if (object4 != null) {
                object4 = ((CCItemDetailsQAModel$CCItemQALists)object4).getQuestion();
            } else {
                n4 = 0;
                object4 = null;
            }
            ((QuerySubmitCallMeBack)object).setIssueTopic((String)object4);
            object4 = this.qaItem;
            if (object4 != null) {
                object4 = ((CCItemDetailsQAModel$CCItemQALists)object4).getCategory();
            } else {
                n4 = 0;
                object4 = null;
            }
            ((QuerySubmitCallMeBack)object).setIssueCategory((String)object4);
            object4 = this.qaItem;
            if (object4 != null) {
                object4 = ((CCItemDetailsQAModel$CCItemQALists)object4).getSubcategory();
            } else {
                n4 = 0;
                object4 = null;
            }
            ((QuerySubmitCallMeBack)object).setIssueSubcategory((String)object4);
            object4 = this.orderId;
            ((QuerySubmitCallMeBack)object).setOrderNumber((String)object4);
            object4 = this.orderStatus;
            ((QuerySubmitCallMeBack)object).setOrderStatus((String)object4);
            ((QuerySubmitCallMeBack)object).setInterventionIntent("POST_ORDER");
            object4 = this.productId;
            ((QuerySubmitCallMeBack)object).setProductId((String)object4);
            object4 = this.etMobile;
            if (object4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("etMobile");
                n4 = 0;
                object4 = null;
            }
            object4 = object4.getText().toString();
            ((QuerySubmitCallMeBack)object).setPhoneNumber((String)object4);
            object4 = this.ccViewModel;
            if (object4 != null) {
                object4 = ((CCViewModel)object4).getCallMeSelectedTimeSlot();
            } else {
                n4 = 0;
                object4 = null;
            }
            if (object4 != null) {
                object4 = this.ccViewModel;
                if (object4 != null && (object4 = ((CCViewModel)object4).getCallMeSelectedTimeSlot()) != null) {
                    object4 = ((TimeSlots)object4).getSlotDay();
                } else {
                    n4 = 0;
                    object4 = null;
                }
                ((QuerySubmitCallMeBack)object).setSlotDay((String)object4);
                object4 = this.ccViewModel;
                if (object4 != null && (object4 = ((CCViewModel)object4).getCallMeSelectedTimeSlot()) != null) {
                    object3 = ((TimeSlots)object4).getSlotTime();
                }
                ((QuerySubmitCallMeBack)object).setSlotTime((String)object3);
            } else {
                ((QuerySubmitCallMeBack)object).setSlotDay("TODAY");
                object4 = "NOW";
                ((QuerySubmitCallMeBack)object).setSlotTime((String)object4);
            }
            object4 = this.ccViewModel;
            if (object4 != null) {
                ((CCViewModel)object4).submitCallMeBackDetail((QuerySubmitCallMeBack)object);
            }
        } else {
            object2 = this.getActivity();
            if (object2 != null) {
                object2 = this.getActivity();
                if (object2 != null) {
                    boolean bl2 = object2.isFinishing();
                    object3 = bl2;
                }
                Intrinsics.checkNotNull(object3);
                boolean bl3 = (Boolean)object3;
                if (bl3) {
                    object2 = StringCompanionObject.INSTANCE;
                    int n7 = R$string.acc_error_message;
                    object2 = hv3_0.K(n7);
                    object3 = "Select Language";
                    Object object5 = new Object[n4];
                    object5[0] = object3;
                    Object object6 = Arrays.copyOf(object5, n4);
                    object6 = String.format((String)object2, object6);
                    Intrinsics.checkNotNullExpressionValue(object6, "format(...)");
                    object2 = this.requireActivity();
                    Intrinsics.checkNotNullExpressionValue(object2, "requireActivity(...)");
                    Intrinsics.checkNotNullParameter(object2, "activity");
                    Intrinsics.checkNotNullParameter(object3, "msg");
                    int n8 = 0x1020002;
                    object = Snackbar.make(object2.findViewById(n8), (CharSequence)object3, 0);
                    Intrinsics.checkNotNullExpressionValue(object, "make(...)");
                    object2 = ((BaseTransientBottomBar)object).getView();
                    Intrinsics.checkNotNullExpressionValue(object2, "getView(...)");
                    object5 = Looper.getMainLooper();
                    object3 = new Handler(object5);
                    object5 = new kq0_2((View)object2, (String)object6);
                    long l2 = 100;
                    object3.postDelayed((Runnable)object5, l2);
                    ((Snackbar)object).show();
                }
            }
        }
    }

    private static final UserInformation userInformation_delegate$lambda$0(CcCallMeFragment ccCallMeFragment) {
        Intrinsics.checkNotNullParameter(ccCallMeFragment, "this$0");
        return UserInformation.getInstance(ccCallMeFragment.requireContext().getApplicationContext());
    }

    private final void validateData() {
        Object object;
        int n3;
        int n4;
        Object object2 = this.etMobile;
        Object object3 = null;
        if (object2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("etMobile");
            n4 = 0;
            object2 = null;
        }
        if ((n3 = b.s((String)(object2 = ((Object)StringsKt.m0(object2.getText().toString())).toString()), (String)(object = "0"), false)) == 0 && (n3 = b.s((String)object2, (String)(object = "+91"), false)) == 0 && (n4 = ((String)object2).length()) == (n3 = 10)) {
            object2 = z40_0.Companion;
            AJIOApplication.Companion.getClass();
            object = AJIOApplication$a.a();
            object2.getClass();
            object2 = z40$a.a((Context)object).a;
            object = "call_me_time_slot_enable";
            n4 = (int)(((ao0_0)object2).a((String)object) ? 1 : 0);
            if (n4 != 0) {
                object2 = this.ccViewModel;
                if (object2 != null && (object2 = ((CCViewModel)object2).getCallMeBackInfo()) != null) {
                    object2 = ((CallMeBackInfo)object2).getTimeSlots();
                } else {
                    n4 = 0;
                    object2 = null;
                }
                if (object2 != null && (n4 = (int)(object2.isEmpty() ? 1 : 0)) == 0) {
                    object2 = this.ccViewModel;
                    if (object2 != null) {
                        object2 = ((CCViewModel)object2).getCallMeSelectedTimeSlot();
                    } else {
                        n4 = 0;
                        object2 = null;
                    }
                    if (object2 == null) {
                        hv3_0.o0(0, "Select Time slot", null);
                        return;
                    }
                }
            }
            hv3_0.S(this.getActivity());
            this.submitCallMeBackDetail();
            return;
        }
        object2 = this.lblMobileError;
        if (object2 == null) {
            object2 = "lblMobileError";
            Intrinsics.throwUninitializedPropertyAccessException((String)object2);
        } else {
            object3 = object2;
        }
        object3.setVisibility(0);
    }

    public String getEstimatedWaitTime() {
        Object object = this.ccViewModel;
        Object object2 = null;
        object = object != null ? ((CCViewModel)object).getCallMeSelectedLang() : null;
        if (object != null && (object = this.ccViewModel) != null && (object = ((CCViewModel)object).getCallMeLangEstWaitTimeMap()) != null) {
            Object object3 = this.ccViewModel;
            if (object3 != null && (object3 = ((CCViewModel)object3).getCallMeSelectedLang()) != null) {
                object2 = Locale.ROOT;
                String string2 = "ROOT";
                Intrinsics.checkNotNullExpressionValue(object2, string2);
                object2 = ((String)object3).toLowerCase((Locale)object2);
                object3 = "toLowerCase(...)";
                Intrinsics.checkNotNullExpressionValue(object2, (String)object3);
            }
            object2 = object = object.get(object2);
            object2 = (String)object;
        }
        return object2;
    }

    public String getSelectedLang() {
        Object object = this.ccViewModel;
        if (object == null || (object = ((CCViewModel)object).getCallMeSelectedLang()) == null) {
            object = "";
        }
        return object;
    }

    public boolean isTimeSlotSelected(TimeSlots object) {
        Intrinsics.checkNotNullParameter(object, "timeSlot");
        Object object2 = this.ccViewModel;
        object2 = object2 != null && (object2 = ((CCViewModel)object2).getCallMeSelectedTimeSlot()) != null ? ((TimeSlots)object2).getSlotDisplayText() : null;
        object = ((TimeSlots)object).getSlotDisplayText();
        return Intrinsics.areEqual(object2, object);
    }

    public void onActivityCreated(Bundle object) {
        super.onActivityCreated((Bundle)object);
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
            this.ccViewModel = object2 = (CCViewModel)((pD3)object5).a((yn1_2)object2, (String)object6);
            object2 = this.requireActivity();
            Intrinsics.checkNotNullExpressionValue(object2, "requireActivity(...)");
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
                if (object != null && (object = ((xf_1)object).d) != null) {
                    boolean bl2;
                    this.orderStatus = object2 = ((rq_1)object).c;
                    this.orderId = object2 = ((rq_1)object).b;
                    this.productId = object2 = ((rq_1)object).d;
                    this.qaItem = object2 = ((rq_1)object).a;
                    this.isLuxeOrder = bl2 = ((rq_1)object).e;
                }
                this.initObservables();
                this.showProgressView();
                object = this.ccViewModel;
                if (object != null) {
                    ((CCViewModel)object).getCallMeBackInfo();
                }
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

    public void onClick(View object) {
        int n3;
        if (object != null) {
            n3 = object.getId();
            object = n3;
        } else {
            n3 = 0;
            object = null;
        }
        int n4 = R$id.cc_callme_btn_done;
        if (object != null && (n3 = ((Integer)object).intValue()) == n4) {
            this.validateData();
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        CustomToolbarViewMerger customToolbarViewMerger;
        Intrinsics.checkNotNullParameter(layoutInflater, "inflater");
        this.customToolbarViewMerger = customToolbarViewMerger = new CustomToolbarViewMerger(this);
        Intrinsics.checkNotNull(customToolbarViewMerger);
        Context context = this.requireContext();
        Intrinsics.checkNotNullExpressionValue(context, "requireContext(...)");
        int n3 = R$layout.cc_callme_layout;
        int n4 = R$layout.fragment_cc_callme_refresh;
        Intrinsics.checkNotNull(viewGroup);
        return customToolbarViewMerger.inflateView(context, n3, n4, layoutInflater, viewGroup);
    }

    public void onLanguageClick(String object) {
        Intrinsics.checkNotNullParameter(object, "lang");
        Object object2 = this.ccViewModel;
        if (object2 != null) {
            ((CCViewModel)object2).setCallMeSelectedLang((String)object);
        }
        this.setEstimatedWaitTime((String)object);
        object = this.langRV;
        int n4 = 0;
        object2 = null;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException("langRV");
            boolean n3 = false;
            object = null;
        }
        if ((object = ((RecyclerView)object).getAdapter()) != null) {
            ((RecyclerView$f)object).notifyDataSetChanged();
        }
        object = z40_0.Companion;
        AJIOApplication.Companion.getClass();
        Object object3 = AJIOApplication$a.a();
        object.getClass();
        object = z40$a.a((Context)object3).a;
        object3 = "call_me_time_slot_enable";
        boolean bl2 = ((ao0_0)object).a((String)object3);
        if (bl2) {
            int n3;
            int n7;
            boolean bl3;
            object = this.ccViewModel;
            if (object != null && (object = ((CCViewModel)object).getCallMeBackInfo()) != null) {
                object = ((CallMeBackInfo)object).getTimeSlots();
            } else {
                boolean bl4 = false;
                object = null;
            }
            if (!(object == null || (bl3 = object.isEmpty()) || (object = this.ccViewModel) != null && (n7 = ((CCViewModel)object).getCallMeNowPos()) == (n3 = -1))) {
                object = this.timeSlotRv;
                if (object == null) {
                    object = "timeSlotRv";
                    Intrinsics.throwUninitializedPropertyAccessException((String)object);
                } else {
                    object2 = object;
                }
                object = ((RecyclerView)object2).getAdapter();
                if (object != null) {
                    object2 = this.ccViewModel;
                    Intrinsics.checkNotNull(object2);
                    n4 = ((CCViewModel)object2).getCallMeNowPos();
                    ((RecyclerView$f)object).notifyItemChanged(n4);
                }
            }
        }
    }

    public void onNavigationClick() {
        FragmentActivity fragmentActivity = this.getActivity();
        if (fragmentActivity != null) {
            fragmentActivity.onBackPressed();
        }
    }

    public void onTimeSlotClick(TimeSlots object) {
        Intrinsics.checkNotNullParameter(object, "timeSlot");
        CCViewModel cCViewModel = this.ccViewModel;
        if (cCViewModel != null) {
            cCViewModel.setCallMeSelectedTimeSlot((TimeSlots)object);
        }
        if ((object = this.timeSlotRv) == null) {
            Intrinsics.throwUninitializedPropertyAccessException("timeSlotRv");
            object = null;
        }
        if ((object = ((RecyclerView)object).getAdapter()) != null) {
            ((RecyclerView$f)object).notifyDataSetChanged();
        }
    }

    public void onViewCreated(View object, Bundle object2) {
        Intrinsics.checkNotNullParameter(object, "view");
        super.onViewCreated((View)object, (Bundle)object2);
        this.setupToolbar();
        int n3 = R$id.cc_callme_et_mobile;
        object2 = (EditText)object.findViewById(n3);
        this.etMobile = object2;
        n3 = R$id.cc_callme_et_comment;
        object2 = (EditText)object.findViewById(n3);
        this.etComment = object2;
        n3 = R$id.cc_callme_tv_character;
        object2 = (TextView)object.findViewById(n3);
        this.tvCharacter = object2;
        n3 = R$id.cc_callme_lbl_mobile_error;
        object2 = (TextView)object.findViewById(n3);
        this.lblMobileError = object2;
        n3 = R$id.cc_callme_btn_done;
        object2 = (AjioButton)object.findViewById(n3);
        this.btnDone = object2;
        n3 = R$id.cc_callme_lang_header_tv;
        object2 = (TextView)object.findViewById(n3);
        this.langHeaderTv = object2;
        n3 = R$id.cc_callme_lang_rv;
        object2 = (RecyclerView)object.findViewById(n3);
        this.langRV = object2;
        Object object3 = this.getContext();
        object2 = new FlexboxLayoutManager((Context)object3);
        int n4 = 1;
        ((FlexboxLayoutManager)object2).setFlexWrap(n4);
        ((FlexboxLayoutManager)object2).setFlexDirection(0);
        ((FlexboxLayoutManager)object2).setJustifyContent(0);
        RecyclerView recyclerView = this.langRV;
        Object object4 = null;
        if (recyclerView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("langRV");
            recyclerView = null;
        }
        recyclerView.setLayoutManager((RecyclerView$o)object2);
        n3 = R$id.cc_callme_time_slot_header_tv;
        object2 = (TextView)object.findViewById(n3);
        this.timeSlotHeaderTv = object2;
        n3 = R$id.cc_callme_time_slot_rv;
        this.timeSlotRv = object2 = (RecyclerView)object.findViewById(n3);
        recyclerView = this.getContext();
        object2 = new FlexboxLayoutManager((Context)recyclerView);
        ((FlexboxLayoutManager)object2).setFlexWrap(n4);
        ((FlexboxLayoutManager)object2).setFlexDirection(0);
        ((FlexboxLayoutManager)object2).setJustifyContent(0);
        object3 = this.timeSlotRv;
        if (object3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("timeSlotRv");
            n4 = 0;
            object3 = null;
        }
        ((RecyclerView)object3).setLayoutManager((RecyclerView$o)object2);
        n3 = R$id.cc_callme_est_wait_tv;
        object = (TextView)object.findViewById(n3);
        this.estWaitTimeTv = object;
        object = this.btnDone;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException("btnDone");
            object = null;
        }
        object.setOnClickListener((View.OnClickListener)this);
        AnalyticsManager.Companion.getInstance().getGtmEvents().pushOpenScreenEvent("Call Me Back Screen");
        object = this.getUserInformation().getUserPhoneNumber();
        object2 = "etMobile";
        if (object != null && (n4 = object.length()) != 0) {
            object3 = this.etMobile;
            if (object3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object2);
                n4 = 0;
                object3 = null;
            }
            object3.setText((CharSequence)object);
        }
        if ((object = this.etComment) == null) {
            Intrinsics.throwUninitializedPropertyAccessException("etComment");
            object = null;
        }
        object3 = new CcCallMeFragment$onViewCreated$1(this);
        object.addTextChangedListener((TextWatcher)object3);
        object = this.etMobile;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object2);
        } else {
            object4 = object;
        }
        object = new CcCallMeFragment$onViewCreated$2(this);
        object4.addTextChangedListener((TextWatcher)object);
    }
}

