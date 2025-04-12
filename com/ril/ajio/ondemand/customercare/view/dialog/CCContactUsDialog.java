/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.app.Dialog
 *  android.content.Context
 *  android.content.DialogInterface
 *  android.content.DialogInterface$OnShowListener
 *  android.os.Bundle
 *  android.os.Handler
 *  android.os.Looper
 *  android.text.TextUtils
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.widget.TextView
 */
package com.ril.ajio.ondemand.customercare.view.dialog;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.E$b;
import androidx.lifecycle.LiveData;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.R$string;
import com.ril.ajio.analytics.AnalyticsData;
import com.ril.ajio.analytics.AnalyticsData$Builder;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.AnalyticsManager$Companion;
import com.ril.ajio.analytics.events.GTMEvents;
import com.ril.ajio.analytics.events.NewCustomEventsRevamp;
import com.ril.ajio.analytics.events.NewEEcommerceEventsRevamp;
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.ondemand.customercare.CCUtils;
import com.ril.ajio.ondemand.customercare.view.dialog.CCContactUsDialog$Companion;
import com.ril.ajio.ondemand.customercare.view.dialog.CCContactUsDialog$sam$androidx_lifecycle_Observer$0;
import com.ril.ajio.ondemand.customercare.viewmodel.CCViewModel;
import com.ril.ajio.services.data.CustomerCare.CCItemDetailsQAModel$CCItemQALists;
import com.ril.ajio.services.data.CustomerCare.ChatStatus;
import com.ril.ajio.services.data.CustomerCare.InitiateChat;
import com.ril.ajio.services.data.user.UserInformation;
import java.util.Arrays;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.StringCompanionObject;

public final class CCContactUsDialog
extends BottomSheetDialogFragment
implements View.OnClickListener {
    public static final CCContactUsDialog$Companion Companion;
    public static final String TAG = "CCContactUsFragment";
    private HashMap bundledatalist;
    private xf_1 cCBundleViewModel;
    private pf_1 ccActivityListener;
    private final wq_0 ccCustomEvent;
    private CCViewModel ccViewModel;
    private InitiateChat initiateChat;
    private boolean isLuxeOrder;
    private TextView mContactNumberOneTv;
    private TextView mContactNumberTwoTv;
    private final NewCustomEventsRevamp newCustomEventsRevamp;
    private final NewEEcommerceEventsRevamp newEEcommerceEventsRevamp;
    private String orderId;
    private String orderStatus;
    private final String previousScreen;
    private final String previousScreenType;
    private String productCode;
    private CCItemDetailsQAModel$CCItemQALists qaItem;
    private String title;

    static {
        CCContactUsDialog$Companion cCContactUsDialog$Companion;
        Companion = cCContactUsDialog$Companion = new CCContactUsDialog$Companion(null);
    }

    public CCContactUsDialog() {
        NewEEcommerceEventsRevamp newEEcommerceEventsRevamp;
        HashMap hashMap = AnalyticsManager.Companion;
        this.newEEcommerceEventsRevamp = newEEcommerceEventsRevamp = ((AnalyticsManager$Companion)((Object)hashMap)).getInstance().getNewEEcommerceEventsRevamp();
        hashMap = ((AnalyticsManager$Companion)((Object)hashMap)).getInstance().getNewCustomEventsRevamp();
        this.newCustomEventsRevamp = hashMap;
        hashMap = newEEcommerceEventsRevamp.getPrevScreen();
        this.previousScreen = hashMap;
        hashMap = newEEcommerceEventsRevamp.getPrevScreenType();
        this.previousScreenType = hashMap;
        hashMap = new HashMap();
        this.ccCustomEvent = hashMap;
        this.bundledatalist = hashMap = new HashMap();
    }

    public static /* synthetic */ Unit Oa(CCContactUsDialog cCContactUsDialog, DataCallback dataCallback) {
        return CCContactUsDialog.initObservables$lambda$3(cCContactUsDialog, dataCallback);
    }

    public static /* synthetic */ void Pa(DialogInterface dialogInterface) {
        CCContactUsDialog.onCreateDialog$lambda$0(dialogInterface);
    }

    public static /* synthetic */ void Qa(CCContactUsDialog cCContactUsDialog, View view) {
        CCContactUsDialog.onViewCreated$lambda$2(cCContactUsDialog, view);
    }

    public static /* synthetic */ void Ra(ConstraintLayout constraintLayout) {
        CCContactUsDialog.onViewCreated$lambda$1(constraintLayout);
    }

    private final Bundle getEventBundle() {
        String string2;
        Bundle bundle = new Bundle();
        Object object = this.orderId;
        boolean bl2 = TextUtils.isEmpty((CharSequence)object);
        if (!bl2) {
            object = "order id";
            string2 = this.orderId;
            bundle.putString((String)object, string2);
        }
        if ((object = this.qaItem) != null) {
            if (object == null || (object = ((CCItemDetailsQAModel$CCItemQALists)object).getQuestion()) == null) {
                object = "";
            }
            string2 = "question";
            bundle.putString(string2, (String)object);
        }
        if (!(bl2 = TextUtils.isEmpty((CharSequence)(object = this.productCode)))) {
            object = "product id";
            string2 = this.productCode;
            bundle.putString((String)object, string2);
        }
        return bundle;
    }

    private final String getSilentmessage() {
        Object object = UserInformation.getInstance(this.requireContext().getApplicationContext());
        CharSequence charSequence = ((UserInformation)object).getUserEmailId();
        String string2 = ((UserInformation)object).getUserName();
        object = ((UserInformation)object).getCustomerUUID();
        cp_1.Companion.getClass();
        String string3 = cp$a.a();
        String string4 = this.orderId;
        String string5 = this.orderStatus;
        Object object2 = this.qaItem;
        String string6 = null;
        object2 = object2 != null ? ((CCItemDetailsQAModel$CCItemQALists)object2).getQuestion() : null;
        Object object3 = this.qaItem;
        if (object3 != null) {
            string6 = ((CCItemDetailsQAModel$CCItemQALists)object3).getProductName();
        }
        object3 = this.productCode;
        boolean bl2 = this.isLuxeOrder;
        String string7 = "Customer ID:";
        StringBuilder stringBuilder = new StringBuilder(string7);
        stringBuilder.append((String)object);
        stringBuilder.append("|Customer Name:");
        stringBuilder.append(string2);
        stringBuilder.append("|Customer Email:");
        stringBuilder.append((String)charSequence);
        stringBuilder.append("|Order Number:");
        stringBuilder.append(string4);
        stringBuilder.append("|Order Status:");
        stringBuilder.append(string5);
        stringBuilder.append("|Issue Category:");
        stringBuilder.append((String)object2);
        stringBuilder.append("|Product Name:");
        stringBuilder.append(string6);
        stringBuilder.append("|Product Code:");
        stringBuilder.append((String)object3);
        stringBuilder.append("|Luxury Order:");
        stringBuilder.append(bl2);
        stringBuilder.append("|Intervention Intent:POST_ORDER");
        object = stringBuilder.toString();
        boolean bl3 = TextUtils.isEmpty((CharSequence)string3);
        if (!bl3) {
            charSequence = new StringBuilder();
            ((StringBuilder)charSequence).append((String)object);
            ((StringBuilder)charSequence).append("|version:");
            ((StringBuilder)charSequence).append(string3);
            object = ((StringBuilder)charSequence).toString();
        }
        charSequence = new StringBuilder();
        ((StringBuilder)charSequence).append((String)object);
        ((StringBuilder)charSequence).append("{task}");
        return ((StringBuilder)charSequence).toString();
    }

    private final void handleCallMeBackUI(View view) {
        int n3 = this.isCallMeBackEnabled();
        if (n3 != 0) {
            n3 = R$id.cc_contactus_layout_callme;
            Object object = view.findViewById(n3);
            boolean bl2 = false;
            object.setVisibility(0);
            n3 = R$id.cc_contactus_divider_callme;
            view.findViewById(n3).setVisibility(0);
            n3 = R$id.cc_contactus_tv_callme;
            object = (TextView)view.findViewById(n3);
            int n4 = R$id.cc_contactus_lbl_callme_info;
            view = (TextView)view.findViewById(n4);
            CCItemDetailsQAModel$CCItemQALists cCItemDetailsQAModel$CCItemQALists = this.qaItem;
            if (cCItemDetailsQAModel$CCItemQALists != null) {
                bl2 = cCItemDetailsQAModel$CCItemQALists.isCallbackEnabled();
            }
            Intrinsics.checkNotNull(object);
            this.setChatBtnState(bl2, (TextView)object);
            object = this.qaItem;
            if (object == null || (object = ((CCItemDetailsQAModel$CCItemQALists)object).getCallbackMessage()) == null) {
                object = "";
            }
            Intrinsics.checkNotNull(view);
            this.setChatInfoMessage((String)object, (TextView)view);
        } else {
            n3 = R$id.cc_contactus_layout_callme;
            View view2 = view.findViewById(n3);
            int n7 = 8;
            view2.setVisibility(n7);
            n3 = R$id.cc_contactus_divider_callme;
            view = view.findViewById(n3);
            view.setVisibility(n7);
        }
    }

    private final void handleChatUI(View view) {
        int n3 = this.isChatEnabled();
        if (n3 != 0) {
            n3 = R$id.cc_contactus_layout_chat;
            Object object = view.findViewById(n3);
            boolean bl2 = false;
            object.setVisibility(0);
            n3 = R$id.cc_contactus_divider_chat;
            view.findViewById(n3).setVisibility(0);
            n3 = R$id.cc_contactus_tv_chat;
            object = (TextView)view.findViewById(n3);
            int n4 = R$id.cc_contactus_lbl_chat_info;
            view = (TextView)view.findViewById(n4);
            CCItemDetailsQAModel$CCItemQALists cCItemDetailsQAModel$CCItemQALists = this.qaItem;
            if (cCItemDetailsQAModel$CCItemQALists != null) {
                bl2 = cCItemDetailsQAModel$CCItemQALists.isChatEnabled();
            }
            Intrinsics.checkNotNull(object);
            this.setChatBtnState(bl2, (TextView)object);
            object = this.qaItem;
            if (object == null || (object = ((CCItemDetailsQAModel$CCItemQALists)object).getChatMessage()) == null) {
                object = "";
            }
            Intrinsics.checkNotNull(view);
            this.setChatInfoMessage((String)object, (TextView)view);
        } else {
            n3 = R$id.cc_contactus_layout_chat;
            View view2 = view.findViewById(n3);
            int n7 = 8;
            view2.setVisibility(n7);
            n3 = R$id.cc_contactus_divider_chat;
            view = view.findViewById(n3);
            view.setVisibility(n7);
        }
    }

    private final void handleContactNumberUI(View view) {
        TextView textView;
        String string2 = CCUtils.getCCContactNumber1();
        String string3 = CCUtils.getCCContactNumber2();
        int n3 = R$id.cc_contactus_lbl_number_one;
        this.mContactNumberOneTv = textView = (TextView)view.findViewById(n3);
        n3 = R$id.cc_contactus_lbl_number_two;
        this.mContactNumberTwoTv = textView = (TextView)view.findViewById(n3);
        n3 = (int)(CCUtils.isLuxHelpLineEnable() ? 1 : 0);
        String string4 = "mContactNumberOneTv";
        String string5 = null;
        int n4 = 8;
        if (n3 != 0 && (n3 = (int)(this.isLuxeOrder ? 1 : 0)) != 0) {
            int n7;
            string2 = CCUtils.getCCLuxContactNumber();
            int n8 = TextUtils.isEmpty((CharSequence)string2);
            if (n8 != 0) {
                n7 = R$id.cc_contactus_divider_help_one;
                view.findViewById(n7).setVisibility(n4);
                n7 = R$id.cc_contactus_layout_help_one;
                string2 = view.findViewById(n7);
                string2.setVisibility(n4);
            } else {
                n8 = R$id.cc_contactus_divider_help_one;
                view.findViewById(n8).setVisibility(0);
                n8 = R$id.cc_contactus_layout_help_one;
                view.findViewById(n8).setVisibility(0);
                string3 = this.mContactNumberOneTv;
                if (string3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(string4);
                    n8 = 0;
                    string3 = null;
                }
                string3.setText((CharSequence)string2);
                string2 = this.mContactNumberOneTv;
                if (string2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(string4);
                } else {
                    string5 = string2;
                }
                string5.setOnClickListener((View.OnClickListener)this);
            }
            n7 = R$id.cc_contactus_layout_help_two;
            string2 = view.findViewById(n7);
            string2.setVisibility(n4);
            n7 = R$id.cc_contactus_divider_help_two;
            view = view.findViewById(n7);
            view.setVisibility(n4);
        } else {
            n3 = (int)(CCUtils.isCCHelplineEnable() ? 1 : 0);
            if (n3 != 0 && (n3 = (int)(this.isLuxeOrder ? 1 : 0)) == 0) {
                int n10;
                n3 = (int)(TextUtils.isEmpty((CharSequence)string2) ? 1 : 0);
                if (n3 != 0) {
                    n10 = R$id.cc_contactus_divider_help_one;
                    view.findViewById(n10).setVisibility(n4);
                    n10 = R$id.cc_contactus_layout_help_one;
                    string2 = view.findViewById(n10);
                    string2.setVisibility(n4);
                } else {
                    n3 = R$id.cc_contactus_divider_help_one;
                    view.findViewById(n3).setVisibility(0);
                    n3 = R$id.cc_contactus_layout_help_one;
                    view.findViewById(n3).setVisibility(0);
                    textView = this.mContactNumberOneTv;
                    if (textView == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(string4);
                        n3 = 0;
                        textView = null;
                    }
                    textView.setText((CharSequence)string2);
                    string2 = this.mContactNumberOneTv;
                    if (string2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(string4);
                        n10 = 0;
                        string2 = null;
                    }
                    string2.setOnClickListener((View.OnClickListener)this);
                }
                n10 = (int)(TextUtils.isEmpty((CharSequence)string3) ? 1 : 0);
                if (n10 != 0) {
                    n10 = R$id.cc_contactus_layout_help_two;
                    string2 = view.findViewById(n10);
                    string2.setVisibility(n4);
                    n10 = R$id.cc_contactus_divider_help_two;
                    view = view.findViewById(n10);
                    view.setVisibility(n4);
                } else {
                    n10 = R$id.cc_contactus_layout_help_two;
                    view.findViewById(n10).setVisibility(0);
                    n10 = R$id.cc_contactus_divider_help_two;
                    view.findViewById(n10).setVisibility(0);
                    view = this.mContactNumberTwoTv;
                    string2 = "mContactNumberTwoTv";
                    if (view == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(string2);
                        view = null;
                    }
                    view.setText((CharSequence)string3);
                    view = this.mContactNumberTwoTv;
                    if (view == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(string2);
                    } else {
                        string5 = view;
                    }
                    string5.setOnClickListener((View.OnClickListener)this);
                }
            } else {
                int n14 = R$id.cc_contactus_divider_help_one;
                view.findViewById(n14).setVisibility(n4);
                n14 = R$id.cc_contactus_layout_help_one;
                view.findViewById(n14).setVisibility(n4);
                n14 = R$id.cc_contactus_layout_help_two;
                string2 = view.findViewById(n14);
                string2.setVisibility(n4);
                n14 = R$id.cc_contactus_divider_help_two;
                view = view.findViewById(n14);
                view.setVisibility(n4);
            }
        }
    }

    private final void initObservables() {
        Object object = this.ccViewModel;
        if (object != null && (object = ((CCViewModel)object).getCcInitiateChatObservable()) != null) {
            mu1_1 mu1_12 = this.getViewLifecycleOwner();
            ig_2 ig_22 = new ig_2(this);
            CCContactUsDialog$sam$androidx_lifecycle_Observer$0 cCContactUsDialog$sam$androidx_lifecycle_Observer$0 = new CCContactUsDialog$sam$androidx_lifecycle_Observer$0(ig_22);
            ((LiveData)object).e(mu1_12, cCContactUsDialog$sam$androidx_lifecycle_Observer$0);
        }
    }

    private static final Unit initObservables$lambda$3(CCContactUsDialog object, DataCallback object2) {
        int n3 = 1;
        Intrinsics.checkNotNullParameter(object, "this$0");
        cp_1.Companion.getClass();
        Object[] objectArray = cp$a.e();
        objectArray.getClass();
        boolean bl2 = cp_1.J((DataCallback)object2);
        if (bl2) {
            int n4;
            objectArray = "requireActivity(...)";
            if (object2 != null && (n4 = ((DataCallback)object2).getStatus()) == 0) {
                ((CCContactUsDialog)object).initiateChat = object2 = (InitiateChat)((DataCallback)object2).getData();
                if (object2 != null) {
                    int n7;
                    if ((object2 = ((InitiateChat)object2).getStatus()) != null && ((object2 = ((CCContactUsDialog)object).initiateChat) == null || (object2 = ((InitiateChat)object2).getStatus()) == null || (n7 = ((ChatStatus)object2).getStatusCode()) != 0)) {
                        object = ((CCContactUsDialog)object).initiateChat;
                        Intrinsics.checkNotNull(object);
                        object = ((InitiateChat)object).getStatus();
                        Intrinsics.checkNotNull(object);
                        object = ((ChatStatus)object).getMessageDescription();
                        Intrinsics.checkNotNull(object);
                        object2 = StringCompanionObject.INSTANCE;
                        n7 = R$string.acc_alert_message;
                        object2 = hv3_0.K(n7);
                        objectArray = new Object[n3];
                        n4 = 0;
                        Object var7_8 = null;
                        objectArray[0] = object;
                        Object object3 = Arrays.copyOf(objectArray, n3);
                        object2 = String.format((String)object2, object3);
                        object3 = "format(...)";
                        Intrinsics.checkNotNullExpressionValue(object2, (String)object3);
                        mq0_2.c((String)object, (String)object2);
                    } else {
                        object2 = ((CCContactUsDialog)object).getSilentmessage();
                        FragmentActivity fragmentActivity = ((Fragment)object).requireActivity();
                        Intrinsics.checkNotNullExpressionValue(fragmentActivity, (String)objectArray);
                        objectArray = ((CCContactUsDialog)object).initiateChat;
                        Intrinsics.checkNotNull(objectArray);
                        v31.c(fragmentActivity, (InitiateChat)objectArray, (String)object2, n3 != 0);
                        ((BottomSheetDialogFragment)object).dismissAllowingStateLoss();
                    }
                }
            } else {
                int n8 = ((DataCallback)object2).getStatus();
                if (n8 == n3) {
                    ((CCContactUsDialog)object).pushChatInitFailEvent();
                    object2 = ((Fragment)object).requireActivity();
                    if (object2 != null) {
                        object2 = ab0_0.Companion;
                        object = ((Fragment)object).requireActivity();
                        Intrinsics.checkNotNullExpressionValue(object, (String)objectArray);
                        object2.getClass();
                        aB0$a.a((Activity)object);
                    }
                }
            }
        }
        return Unit.a;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private final boolean isCallMeBackEnabled() {
        boolean bl2 = this.isLuxeOrder;
        boolean bl3 = false;
        String string2 = null;
        if (bl2) {
            CCItemDetailsQAModel$CCItemQALists cCItemDetailsQAModel$CCItemQALists = this.qaItem;
            if (cCItemDetailsQAModel$CCItemQALists == null) return bl3;
            if (cCItemDetailsQAModel$CCItemQALists != null) {
                string2 = cCItemDetailsQAModel$CCItemQALists.getCallbackMessage();
            }
            if (bl2 = TextUtils.isEmpty(string2)) return bl3;
            bl2 = CCUtils.isLuxCallMeBackEnable();
            if (!bl2) return bl3;
            return true;
        }
        CCItemDetailsQAModel$CCItemQALists cCItemDetailsQAModel$CCItemQALists = this.qaItem;
        if (cCItemDetailsQAModel$CCItemQALists == null) return bl3;
        if (cCItemDetailsQAModel$CCItemQALists != null) {
            string2 = cCItemDetailsQAModel$CCItemQALists.getCallbackMessage();
        }
        if (bl2 = TextUtils.isEmpty(string2)) return bl3;
        bl2 = CCUtils.isCallMeBackEnabled();
        if (!bl2) return bl3;
        return true;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private final boolean isChatEnabled() {
        boolean bl2 = this.isLuxeOrder;
        boolean bl3 = false;
        if (bl2) {
            Object object = this.qaItem;
            if (object == null) return bl3;
            bl2 = TextUtils.isEmpty((CharSequence)(object = ((CCItemDetailsQAModel$CCItemQALists)object).getChatMessage()));
            if (bl2) return bl3;
            bl2 = CCUtils.isLuxChatEnable();
            if (!bl2) return bl3;
            return true;
        }
        Object object = this.qaItem;
        if (object == null) return bl3;
        bl2 = TextUtils.isEmpty((CharSequence)(object = ((CCItemDetailsQAModel$CCItemQALists)object).getChatMessage()));
        if (bl2) return bl3;
        object = v31.a;
        object = z40_0.Companion;
        AJIOApplication.Companion.getClass();
        Object object2 = AJIOApplication$a.a();
        object.getClass();
        object = z40$a.a((Context)object2).a;
        object2 = "CC_CHAT";
        bl2 = ((ao0_0)object).a((String)object2);
        if (!bl2) return bl3;
        return true;
    }

    private static final void onCreateDialog$lambda$0(DialogInterface object) {
        String string2 = "null cannot be cast to non-null type com.google.android.material.bottomsheet.BottomSheetDialog";
        Intrinsics.checkNotNull(object, string2);
        object = (BottomSheetDialog)object;
        int n3 = com.google.android.material.R$id.design_bottom_sheet;
        object = ((on)object).findViewById(n3);
        if (object != null) {
            string2 = null;
            object.setBackgroundColor(0);
            object = BottomSheetBehavior.from((View)object);
            n3 = 3;
            ((BottomSheetBehavior)object).setState(n3);
        }
    }

    private static final void onViewCreated$lambda$1(ConstraintLayout constraintLayout) {
        int n3 = 1;
        if (constraintLayout != null) {
            Object object = StringCompanionObject.INSTANCE;
            int n4 = R$string.acc_action_popup;
            object = hv3_0.K(n4);
            int n7 = R$string.cc_contact_us_title;
            String string2 = hv3_0.K(n7);
            Object[] objectArray = new Object[n3];
            objectArray[0] = string2;
            Object object2 = Arrays.copyOf(objectArray, n3);
            object2 = String.format((String)object, object2);
            object = "format(...)";
            Intrinsics.checkNotNullExpressionValue(object2, (String)object);
            constraintLayout.setContentDescription((CharSequence)object2);
        }
        if (constraintLayout != null) {
            ai0_2.a((View)constraintLayout);
        }
    }

    private static final void onViewCreated$lambda$2(CCContactUsDialog cCContactUsDialog, View object) {
        boolean bl2;
        Intrinsics.checkNotNullParameter(cCContactUsDialog, "this$0");
        object = cCContactUsDialog.getActivity();
        if (object != null && !(bl2 = (object = cCContactUsDialog.requireActivity()).isFinishing())) {
            cCContactUsDialog.dismissAllowingStateLoss();
        }
    }

    private final void processBundleData() {
        Object object = this.cCBundleViewModel;
        object = object != null ? ((xf_1)object).a : null;
        if (object != null) {
            boolean bl2;
            String string2;
            Object object2 = ((vq_0)object).a;
            this.title = object2;
            this.qaItem = object2 = ((vq_0)object).b;
            this.orderStatus = object2 = ((vq_0)object).d;
            this.orderId = string2 = ((vq_0)object).c;
            this.isLuxeOrder = bl2 = ((vq_0)object).f;
            this.productCode = object = ((vq_0)object).e;
            Object object3 = this.bundledatalist;
            object2 = String.valueOf(object2);
            String string3 = "status";
            ((HashMap)object3).put(string3, object2);
            object2 = this.bundledatalist;
            string2 = String.valueOf(string2);
            object3 = "order_id";
            ((HashMap)object2).put(object3, string2);
            object2 = this.bundledatalist;
            object = String.valueOf(object);
            string2 = "product_id";
            ((HashMap)object2).put(string2, object);
        }
    }

    private final void pushCallMeBtnClickEvent() {
        Object object = this.orderStatus;
        boolean bl2 = TextUtils.isEmpty((CharSequence)object);
        if (!bl2 && !(bl2 = TextUtils.isEmpty((CharSequence)(object = this.orderId))) && (object = this.qaItem) != null) {
            Object object2 = this.orderId;
            Object object3 = this.orderStatus;
            if (object != null) {
                object = ((CCItemDetailsQAModel$CCItemQALists)object).getQuestion();
            } else {
                bl2 = false;
                object = null;
            }
            CharSequence charSequence = new StringBuilder("PO_Callback_Clicked_");
            charSequence.append((String)object2);
            object2 = "_";
            charSequence.append((String)object2);
            charSequence.append((String)object3);
            charSequence.append((String)object2);
            charSequence.append((String)object);
            object = charSequence.toString();
            object2 = AnalyticsManager.Companion;
            ((AnalyticsManager$Companion)object2).getInstance().getGtmEvents().pushButtonTapEvent("Selfcare \u2013 Post order callback init", object, "contact us screen");
            object = this.getEventBundle();
            object3 = ((AnalyticsManager$Companion)object2).getInstance().getGtmEvents();
            object2 = new AnalyticsData$Builder();
            object = ((AnalyticsData$Builder)object2).bundle((Bundle)object);
            AnalyticsData analyticsData = ((AnalyticsData$Builder)object).build();
            int n3 = 16;
            charSequence = "customer care interaction";
            String string2 = "call back";
            String string3 = "contact us screen";
            GTMEvents.pushButtonTapEvent$default((GTMEvents)object3, (String)charSequence, string2, string3, analyticsData, null, n3, null);
        }
    }

    private final void pushChatBtnClickEvent() {
        Object object;
        Object object2;
        Object object3 = this.orderStatus;
        boolean bl2 = TextUtils.isEmpty((CharSequence)object3);
        if (!bl2 && !(bl2 = TextUtils.isEmpty((CharSequence)(object3 = this.orderId))) && (object3 = this.qaItem) != null) {
            object2 = this.orderId;
            object = this.orderStatus;
            if (object3 != null) {
                object3 = ((CCItemDetailsQAModel$CCItemQALists)object3).getQuestion();
            } else {
                bl2 = false;
                object3 = null;
            }
            String string2 = "PO_Chat_Clicked_";
            CharSequence charSequence = new StringBuilder(string2);
            charSequence.append((String)object2);
            object2 = "_";
            charSequence.append((String)object2);
            charSequence.append((String)object);
            charSequence.append((String)object2);
            charSequence.append((String)object3);
            object3 = charSequence.toString();
            object2 = AnalyticsManager.Companion.getInstance().getGtmEvents();
            object = "Selfcare \u2013 Post order chat init";
            charSequence = "contact us screen";
            ((GTMEvents)object2).pushButtonTapEvent((String)object, object3, (String)charSequence);
        }
        object3 = this.getEventBundle();
        object = AnalyticsManager.Companion.getInstance().getGtmEvents();
        object2 = new AnalyticsData$Builder();
        AnalyticsData analyticsData = ((AnalyticsData$Builder)object2).bundle((Bundle)object3).build();
        GTMEvents.pushButtonTapEvent$default((GTMEvents)object, "customer care interaction", "chat with us", "contact us screen", analyticsData, null, 16, null);
    }

    private final void pushChatInitFailEvent() {
        Object object = this.orderStatus;
        boolean bl2 = TextUtils.isEmpty((CharSequence)object);
        if (!bl2 && !(bl2 = TextUtils.isEmpty((CharSequence)(object = this.orderId))) && (object = this.qaItem) != null) {
            String string2 = this.orderId;
            String string3 = this.orderStatus;
            if (object != null) {
                object = ((CCItemDetailsQAModel$CCItemQALists)object).getQuestion();
            } else {
                bl2 = false;
                object = null;
            }
            StringBuilder stringBuilder = new StringBuilder("PO_Chat_InitFail_");
            stringBuilder.append(string2);
            string2 = "_";
            stringBuilder.append(string2);
            stringBuilder.append(string3);
            stringBuilder.append(string2);
            stringBuilder.append((String)object);
            String string4 = stringBuilder.toString();
            object = AnalyticsManager.Companion.getInstance();
            GTMEvents gTMEvents = ((AnalyticsManager)object).getGtmEvents();
            int n3 = 8;
            String string5 = "Selfcare \u2013 Post order chat init unsuccessful";
            String string6 = "contact us screen";
            GTMEvents.pushServiceErrorEvent$default(gTMEvents, string5, string4, string6, null, n3, null);
        }
    }

    /*
     * WARNING - void declaration
     */
    private final void setChatBtnState(boolean bl2, TextView textView) {
        void var2_4;
        if (bl2) {
            int n3 = 1065353216;
            float f5 = 1.0f;
            var2_4.setAlpha(f5);
            var2_4.setOnClickListener((View.OnClickListener)this);
        } else {
            int n4 = 0x3F000000;
            float f6 = 0.5f;
            var2_4.setAlpha(f6);
        }
    }

    private final void setChatInfoMessage(String string2, TextView textView) {
        boolean bl2 = TextUtils.isEmpty((CharSequence)string2);
        if (!bl2) {
            textView.setContentDescription((CharSequence)string2);
            textView.setText((CharSequence)string2);
        }
    }

    private final void setTileUI(View view) {
        int n3 = R$id.row_cc_contactus_tv_title;
        view = (TextView)view.findViewById(n3);
        String string2 = this.title;
        n3 = (int)(TextUtils.isEmpty((CharSequence)string2) ? 1 : 0);
        if (n3 == 0) {
            string2 = this.title;
            view.setText((CharSequence)string2);
        }
    }

    public void onActivityCreated(Bundle object) {
        super.onActivityCreated((Bundle)object);
        object = this.getActivity();
        if (object != null) {
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
            object = CCViewModel.class;
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
                this.ccViewModel = object = (CCViewModel)pD32.a((yn1_2)object, (String)object2);
                v31.b();
                this.initObservables();
            } else {
                object2 = "Local and anonymous classes can not be ViewModels".toString();
                object = new IllegalArgumentException((String)object2);
                throw object;
            }
        }
    }

    public void onAttach(Context object) {
        String string2 = "context";
        Intrinsics.checkNotNullParameter(object, string2);
        super.onAttach((Context)object);
        boolean bl2 = object instanceof pf_1;
        if (bl2) {
            object = (pf_1)object;
            this.ccActivityListener = object;
        }
    }

    public void onClick(View view) {
        int n3;
        CCContactUsDialog cCContactUsDialog = this;
        Object object = view;
        Intrinsics.checkNotNullParameter(view, "v");
        Object object2 = this.requireActivity();
        if (object2 != null && (n3 = (object2 = this.requireActivity()).isFinishing()) == 0) {
            int n4;
            n3 = view.getId();
            if (n3 == (n4 = R$id.cc_contactus_tv_chat)) {
                object2 = this.ccViewModel;
                if (object2 != null) {
                    this.pushChatBtnClickEvent();
                    object = this.newCustomEventsRevamp;
                    String string2 = ((NewCustomEventsRevamp)object).getEC_CC_ORDER_INTERACTION();
                    String string3 = this.previousScreen;
                    String string4 = this.previousScreenType;
                    Object var10_18 = null;
                    Object var11_23 = null;
                    String string5 = "chat with us";
                    String string6 = "";
                    String string7 = "chat_with_us";
                    String string8 = "consolidated order details screen";
                    String string9 = "order management screen";
                    boolean bl2 = false;
                    Object var18_57 = null;
                    int n7 = 1536;
                    Object var20_62 = null;
                    NewCustomEventsRevamp.newPushCustomEvent$default((NewCustomEventsRevamp)object, string2, string5, string6, string7, string8, string9, string3, null, string4, false, null, n7, null);
                    object2 = this.ccCustomEvent;
                    String string10 = this.newCustomEventsRevamp.getEC_SELF_CARE_INTERACTION();
                    String string11 = this.newCustomEventsRevamp.getEA_CHAT_WITH_US();
                    object = this.bundledatalist;
                    String string12 = "";
                    String string13 = "customer care - item details - faq screen";
                    Object object3 = object2;
                    Object object4 = object;
                    ((wq_0)object2).a(string10, string11, string12, string13, (HashMap)object);
                    object2 = this.ccViewModel;
                    if (object2 != null) {
                        ((CCViewModel)object2).initiateChat();
                    }
                }
            } else {
                n4 = R$id.cc_contactus_tv_callme;
                Object object5 = null;
                if (n3 == n4) {
                    this.pushCallMeBtnClickEvent();
                    Object object6 = this.newCustomEventsRevamp;
                    String string14 = ((NewCustomEventsRevamp)object6).getEC_CC_ORDER_INTERACTION();
                    String string15 = this.previousScreen;
                    String string16 = this.previousScreenType;
                    boolean bl3 = false;
                    Object var27_96 = null;
                    Object var20_63 = null;
                    String string17 = "";
                    String string18 = "request_call_back";
                    String string19 = "consolidated order details screen";
                    String string20 = "order management screen";
                    Object var10_19 = null;
                    int n8 = 1536;
                    Object var21_68 = null;
                    NewCustomEventsRevamp.newPushCustomEvent$default((NewCustomEventsRevamp)object6, string14, "request call back", string17, string18, string19, string20, string15, null, string16, false, null, n8, null);
                    object2 = this.ccCustomEvent;
                    String string21 = this.newCustomEventsRevamp.getEC_SELF_CARE_INTERACTION();
                    String string22 = this.newCustomEventsRevamp.getEA_CALL_ME_BACK();
                    object = this.bundledatalist;
                    String string23 = "";
                    String string24 = "customer care - item details - faq screen";
                    Object object7 = object2;
                    ((wq_0)object2).a(string21, string22, string23, string24, (HashMap)object);
                    object = this.qaItem;
                    object6 = this.orderId;
                    string14 = this.orderStatus;
                    String string25 = this.productCode;
                    boolean bl4 = this.isLuxeOrder;
                    object2 = new Object();
                    ((rq_1)object2).a = object;
                    ((rq_1)object2).b = object6;
                    ((rq_1)object2).c = string14;
                    ((rq_1)object2).d = string25;
                    ((rq_1)object2).e = bl4;
                    object = this.cCBundleViewModel;
                    if (object != null) {
                        ((xf_1)object).d = object2;
                    }
                    if ((object2 = cCContactUsDialog.ccActivityListener) != null) {
                        n4 = 107;
                        boolean bl5 = true;
                        object2.addFragment(n4, null, bl5);
                    }
                    this.dismissAllowingStateLoss();
                } else {
                    n4 = R$id.cc_contactus_lbl_number_one;
                    if (n3 == n4) {
                        object2 = this.getEventBundle();
                        Object object8 = AnalyticsManager.Companion.getInstance().getGtmEvents();
                        object = new AnalyticsData$Builder();
                        Object object9 = ((AnalyticsData$Builder)object).bundle((Bundle)object2).build();
                        boolean bl6 = false;
                        Object var8_11 = null;
                        int n10 = 16;
                        Object var9_15 = null;
                        GTMEvents.pushButtonTapEvent$default((GTMEvents)object8, "customer care interaction", "Help line number 1", "contact us screen", (AnalyticsData)object9, null, n10, null);
                        NewCustomEventsRevamp newCustomEventsRevamp = this.newCustomEventsRevamp;
                        String string26 = newCustomEventsRevamp.getEC_CC_ORDER_INTERACTION();
                        object2 = this.previousScreen;
                        object = this.previousScreenType;
                        Object var29_102 = null;
                        boolean bl7 = false;
                        String string27 = "contact us phone number";
                        String string28 = "";
                        String string29 = "contact_us_phone_number";
                        String string30 = "consolidated order details screen";
                        String string31 = "order management screen";
                        Object var24_84 = null;
                        int n14 = 1536;
                        Object object10 = object2;
                        Object object11 = object;
                        NewCustomEventsRevamp.newPushCustomEvent$default(newCustomEventsRevamp, string26, string27, string28, string29, string30, string31, (String)object2, null, (String)object, false, null, n14, null);
                        object8 = this.ccCustomEvent;
                        String string32 = this.newCustomEventsRevamp.getEC_SELF_CARE_INTERACTION();
                        String string33 = this.newCustomEventsRevamp.getEA_HELPLINE();
                        String string34 = "";
                        object9 = "customer care - item details - faq screen";
                        ((wq_0)object8).a(string32, string33, string34, (String)object9, null);
                        object2 = this.requireActivity();
                        object = this.mContactNumberOneTv;
                        if (object == null) {
                            object = "mContactNumberOneTv";
                            Intrinsics.throwUninitializedPropertyAccessException((String)object);
                        } else {
                            object5 = object;
                        }
                        object = ((Object)object5.getText()).toString();
                        mz3_0.c((FragmentActivity)object2, (String)object);
                    } else {
                        n4 = R$id.cc_contactus_lbl_number_two;
                        if (n3 == n4) {
                            object2 = this.getEventBundle();
                            Object object12 = AnalyticsManager.Companion.getInstance().getGtmEvents();
                            object = new AnalyticsData$Builder();
                            AnalyticsData analyticsData = ((AnalyticsData$Builder)object).bundle((Bundle)object2).build();
                            String string35 = "contact us screen";
                            boolean bl8 = false;
                            Object var8_12 = null;
                            String string36 = "customer care interaction";
                            String string37 = "Help line number 2";
                            int n15 = 16;
                            Object var9_16 = null;
                            GTMEvents.pushButtonTapEvent$default((GTMEvents)object12, string36, string37, string35, analyticsData, null, n15, null);
                            NewCustomEventsRevamp newCustomEventsRevamp = this.newCustomEventsRevamp;
                            String string38 = newCustomEventsRevamp.getEC_CC_ORDER_INTERACTION();
                            object2 = this.previousScreen;
                            object = this.previousScreenType;
                            Object var29_103 = null;
                            boolean bl9 = false;
                            String string39 = "contact us phone number";
                            String string40 = "";
                            String string41 = "contact_us_phone_number";
                            String string42 = "consolidated order details screen";
                            String string43 = "order management screen";
                            Object var24_85 = null;
                            int n16 = 1536;
                            Object object13 = object2;
                            Object object14 = object;
                            NewCustomEventsRevamp.newPushCustomEvent$default(newCustomEventsRevamp, string38, string39, string40, string41, string42, string43, (String)object2, null, (String)object, false, null, n16, null);
                            object2 = this.requireActivity();
                            object = this.mContactNumberTwoTv;
                            if (object == null) {
                                object = "mContactNumberTwoTv";
                                Intrinsics.throwUninitializedPropertyAccessException((String)object);
                            } else {
                                object5 = object;
                            }
                            object = ((Object)object5.getText()).toString();
                            mz3_0.c((FragmentActivity)object2, (String)object);
                            object5 = cCContactUsDialog.ccCustomEvent;
                            object12 = cCContactUsDialog.newCustomEventsRevamp.getEC_SELF_CARE_INTERACTION();
                            object2 = cCContactUsDialog.newCustomEventsRevamp;
                            string36 = ((NewCustomEventsRevamp)object2).getEA_HELPLINE();
                            analyticsData = null;
                            string37 = "";
                            string35 = "customer care - item details - faq screen";
                            ((wq_0)object5).a((String)object12, string36, string37, string35, null);
                        } else {
                            n4 = R$id.cc_contactus_tv_emailid;
                            if (n3 == n4) {
                                object2 = this.getEventBundle();
                                object5 = AnalyticsManager.Companion.getInstance().getGtmEvents();
                                object = new AnalyticsData$Builder();
                                Object object15 = ((AnalyticsData$Builder)object).bundle((Bundle)object2).build();
                                Object var16_52 = null;
                                int n17 = 16;
                                boolean bl10 = false;
                                Object var18_59 = null;
                                GTMEvents.pushButtonTapEvent$default((GTMEvents)object5, "customer care interaction", "Email", "contact us screen", (AnalyticsData)object15, null, n17, null);
                                NewCustomEventsRevamp newCustomEventsRevamp = this.newCustomEventsRevamp;
                                String string44 = newCustomEventsRevamp.getEC_CC_ORDER_INTERACTION();
                                object2 = this.previousScreen;
                                object = this.previousScreenType;
                                Object var26_95 = null;
                                Object var29_104 = null;
                                String string45 = "contact us email";
                                String string46 = "";
                                String string47 = "contact_us_email";
                                String string48 = "consolidated order details screen";
                                String string49 = "order management screen";
                                Object var23_81 = null;
                                int n18 = 1536;
                                boolean bl11 = false;
                                Object object16 = object2;
                                Object object17 = object;
                                NewCustomEventsRevamp.newPushCustomEvent$default(newCustomEventsRevamp, string44, string45, string46, string47, string48, string49, (String)object2, null, (String)object, false, null, n18, null);
                                object5 = this.ccCustomEvent;
                                String string50 = this.newCustomEventsRevamp.getEC_SELF_CARE_INTERACTION();
                                String string51 = this.newCustomEventsRevamp.getEA_EMAIL();
                                String string52 = "";
                                object15 = "customer care - item details - faq screen";
                                ((wq_0)object5).a(string50, string51, string52, (String)object15, null);
                                object2 = this.requireActivity();
                                object = CCUtils.getCCEmailId();
                                d23_0.e((FragmentActivity)object2, (String)object);
                            }
                        }
                    }
                }
            }
        }
    }

    public void onCreate(Bundle object) {
        super.onCreate((Bundle)object);
        object = this.requireActivity();
        Intrinsics.checkNotNullExpressionValue(object, "requireActivity(...)");
        Object object2 = "owner";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        Object object3 = object.getViewModelStore();
        Intrinsics.checkNotNullParameter(object, (String)object2);
        E$b e$b = object.getDefaultViewModelProviderFactory();
        Intrinsics.checkNotNullParameter(object, (String)object2);
        object = object.getDefaultViewModelCreationExtras();
        Intrinsics.checkNotNullParameter(object3, "store");
        Intrinsics.checkNotNullParameter(e$b, "factory");
        Intrinsics.checkNotNullParameter(object, "defaultCreationExtras");
        object2 = new pD3((rd3_0)object3, e$b, (Wd0)object);
        object = xf_1.class;
        object3 = "modelClass";
        Intrinsics.checkNotNullParameter(object, (String)object3);
        object = rn1_2.c((Class)object);
        Intrinsics.checkNotNullParameter(object, (String)object3);
        Intrinsics.checkNotNullParameter(object, (String)object3);
        Intrinsics.checkNotNullParameter(object, "<this>");
        object3 = object.getQualifiedName();
        if (object3 != null) {
            object3 = "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat((String)object3);
            this.cCBundleViewModel = object = (xf_1)((pD3)object2).a((yn1_2)object, (String)object3);
            this.processBundleData();
            return;
        }
        object2 = "Local and anonymous classes can not be ViewModels".toString();
        object = new IllegalArgumentException((String)object2);
        throw object;
    }

    public Dialog onCreateDialog(Bundle object) {
        object = super.onCreateDialog((Bundle)object);
        Intrinsics.checkNotNull(object, "null cannot be cast to non-null type com.google.android.material.bottomsheet.BottomSheetDialog");
        object = (BottomSheetDialog)object;
        jg_1 jg_12 = new Object();
        object.setOnShowListener((DialogInterface.OnShowListener)jg_12);
        return object;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "inflater");
        int n3 = R$layout.fragment_cccontact_us_refresh;
        return layoutInflater.inflate(n3, viewGroup, false);
    }

    public void onDismiss(DialogInterface dialogInterface) {
        Intrinsics.checkNotNullParameter(dialogInterface, "dialog");
        xf_1 xf_12 = this.cCBundleViewModel;
        if (xf_12 != null) {
            xf_12.a = null;
        }
        super.onDismiss(dialogInterface);
    }

    public void onViewCreated(View view, Bundle object) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, (Bundle)object);
        int n3 = R$id.parent_layout;
        object = (ConstraintLayout)view.findViewById(n3);
        Object object2 = Looper.getMainLooper();
        Object object3 = new Handler(object2);
        object2 = new gg_2((ConstraintLayout)((Object)object));
        long l2 = 100;
        object3.postDelayed((Runnable)object2, l2);
        n3 = R$id.cc_contactus_tv_emailid;
        object = (TextView)view.findViewById(n3);
        int n4 = R$id.cc_contactus_layout_email;
        object3 = view.findViewById(n4);
        int n7 = R$id.cc_contactus_lbl_info;
        object2 = (TextView)view.findViewById(n7);
        boolean bl2 = this.isLuxeOrder;
        int n8 = 8;
        String string2 = "cc_email_response_time";
        if (bl2 && (bl2 = CCUtils.isLuxEmailEnable())) {
            String string3 = CCUtils.getCCLuxEmailId();
            int n10 = string3.length();
            if (n10 == 0) {
                object3.setVisibility(n8);
            } else {
                object3.setVisibility(0);
                object.setOnClickListener((View.OnClickListener)this);
                object.setText((CharSequence)string3);
            }
            object = z40_0.Companion;
            AJIOApplication.Companion.getClass();
            object3 = AJIOApplication$a.a();
            object.getClass();
            object = z40$a.a((Context)object3).a.b(string2);
            n3 = (int)(TextUtils.isEmpty((CharSequence)object) ? 1 : 0);
            if (n3 == 0) {
                object = z40$a.a((Context)AJIOApplication$a.a()).a.b(string2);
                object2.setText((CharSequence)object);
                object = z40$a.a((Context)AJIOApplication$a.a()).a.b(string2);
                object2.setContentDescription((CharSequence)object);
            } else {
                Intrinsics.checkNotNull(object2);
                ai0_2.i((View)object2);
            }
        } else {
            bl2 = CCUtils.isCCEmailIdEnable();
            if (bl2) {
                String string4 = CCUtils.getCCEmailId();
                int n14 = string4.length();
                if (n14 == 0) {
                    object3.setVisibility(n8);
                } else {
                    object3.setVisibility(0);
                    object.setOnClickListener((View.OnClickListener)this);
                    object.setText((CharSequence)string4);
                }
                object = z40_0.Companion;
                AJIOApplication.Companion.getClass();
                object3 = AJIOApplication$a.a();
                object.getClass();
                object = z40$a.a((Context)object3).a.b(string2);
                n3 = (int)(TextUtils.isEmpty((CharSequence)object) ? 1 : 0);
                if (n3 == 0) {
                    object = z40$a.a((Context)AJIOApplication$a.a()).a.b(string2);
                    object2.setText((CharSequence)object);
                    object = z40$a.a((Context)AJIOApplication$a.a()).a.b(string2);
                    object2.setContentDescription((CharSequence)object);
                } else {
                    Intrinsics.checkNotNull(object2);
                    ai0_2.i((View)object2);
                }
            } else {
                object3.setVisibility(n8);
            }
        }
        n3 = R$id.cancelBtn;
        object = view.findViewById(n3);
        object3 = new hg_2(this);
        object.setOnClickListener((View.OnClickListener)object3);
        this.setTileUI(view);
        this.handleContactNumberUI(view);
        this.handleChatUI(view);
        this.handleCallMeBackUI(view);
    }
}

