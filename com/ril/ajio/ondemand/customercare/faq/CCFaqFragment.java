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
package com.ril.ajio.ondemand.customercare.faq;

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
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.E$b;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$f;
import androidx.recyclerview.widget.RecyclerView$o;
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
import com.ril.ajio.ondemand.customercare.faq.CCFaqAdapter;
import com.ril.ajio.ondemand.customercare.faq.CCFaqFragment$Companion;
import com.ril.ajio.ondemand.customercare.view.common.UiCCComponent;
import com.ril.ajio.ondemand.customercare.view.dialog.CCContactUsDialog;
import com.ril.ajio.ondemand.customercare.view.fragment.CCBaseFragment;
import com.ril.ajio.services.data.CustomerCare.QuestionAnswerList;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.b;

public final class CCFaqFragment
extends CCBaseFragment
implements i82_0,
OnNavigationClickListener {
    public static final CCFaqFragment$Companion Companion;
    public static final String TAG = "CCFaqFragment";
    private xf_1 cCBundleViewModel;
    private CustomToolbarViewMerger customToolbarViewMerger;
    private String mFaqAnswer;
    private String mFaqQuestion;
    private ArrayList mFaqQuestionList;
    private RecyclerView mRecyclerView;
    private final NewCustomEventsRevamp newCustomEventsRevamp;
    private final NewEEcommerceEventsRevamp newEEcommerceEventsRevamp;
    private final String previousScreen;
    private final String previousScreenType;

    static {
        CCFaqFragment$Companion cCFaqFragment$Companion;
        Companion = cCFaqFragment$Companion = new CCFaqFragment$Companion(null);
    }

    public CCFaqFragment() {
        NewEEcommerceEventsRevamp newEEcommerceEventsRevamp;
        Object object = AnalyticsManager.Companion;
        this.newEEcommerceEventsRevamp = newEEcommerceEventsRevamp = ((AnalyticsManager$Companion)object).getInstance().getNewEEcommerceEventsRevamp();
        this.newCustomEventsRevamp = object = ((AnalyticsManager$Companion)object).getInstance().getNewCustomEventsRevamp();
        this.previousScreen = object = newEEcommerceEventsRevamp.getPrevScreen();
        this.previousScreenType = object = newEEcommerceEventsRevamp.getPrevScreenType();
    }

    public static /* synthetic */ void Oa(CCFaqFragment cCFaqFragment) {
        CCFaqFragment.setToolBarUI$lambda$1(cCFaqFragment);
    }

    private final void handleBackPress() {
        boolean bl2;
        Object object = this.cCBundleViewModel;
        if (object != null && !(bl2 = ((AbstractCollection)(object = ((xf_1)object).b)).isEmpty())) {
            ((Stack)object).pop();
        }
        if ((object = this.getCcActivityListener()) != null) {
            object.popBackStack();
        }
    }

    private final void refreshUi() {
        Object object;
        Object object2;
        int n3;
        Object object3;
        int n4;
        this.getMUiItemsList().clear();
        Object object4 = this.mFaqQuestionList;
        Object object5 = null;
        int n7 = 1;
        if (object4 != null) {
            Intrinsics.checkNotNull(object4);
            n4 = object4.size();
            object3 = null;
            for (n3 = 0; n3 < n4; ++n3) {
                UiCCComponent uiCCComponent;
                int n8;
                object2 = this.mFaqQuestionList;
                Intrinsics.checkNotNull(object2);
                object2 = ((ArrayList)object2).get(n3);
                object = "get(...)";
                Intrinsics.checkNotNullExpressionValue(object2, (String)object);
                object2 = (QuestionAnswerList)object2;
                if (n3 != 0) {
                    object = this.getMUiItemsList();
                    n8 = 12;
                    uiCCComponent = new UiCCComponent(n7, n7, n8, n8);
                    ((ArrayList)object).add(uiCCComponent);
                }
                object = this.getMUiItemsList();
                n8 = 2;
                uiCCComponent = new UiCCComponent(n8, (QuestionAnswerList)object2, n3);
                ((ArrayList)object).add(uiCCComponent);
            }
        }
        if ((n4 = (int)(TextUtils.isEmpty((CharSequence)(object4 = this.mFaqAnswer)) ? 1 : 0)) == 0) {
            object4 = new QuestionAnswerList();
            object3 = this.mFaqQuestion;
            ((QuestionAnswerList)object4).setQuestion((String)object3);
            object3 = this.mFaqAnswer;
            ((QuestionAnswerList)object4).setAnswer((String)object3);
            object3 = this.getMUiItemsList();
            int n10 = 18;
            object2 = new UiCCComponent(n10, (QuestionAnswerList)object4, 0);
            ((ArrayList)object3).add(object2);
            object4 = this.getMUiItemsList();
            n3 = 10;
            object5 = new UiCCComponent(n7, n3);
            ((ArrayList)object4).add(object5);
            object4 = this.getMUiItemsList();
            object2 = null;
            object = "";
            object5 = new UiCCComponent(n3, (String)object, null);
            ((ArrayList)object4).add(object5);
            object4 = this.getMUiItemsList();
            object5 = new UiCCComponent(n7, n3);
            ((ArrayList)object4).add(object5);
            object4 = this.getMUiItemsList();
            n7 = 15;
            object5 = new UiCCComponent(n7, (String)object);
            ((ArrayList)object4).add(object5);
        }
        object5 = this.getMUiItemsList();
        object4 = new CCFaqAdapter((List)object5, this);
        object5 = this.mRecyclerView;
        if (object5 != null) {
            ((RecyclerView)object5).setAdapter((RecyclerView$f)object4);
        }
    }

    private final void setToolBarUI(String string2) {
        Object object = this.customToolbarViewMerger;
        int n3 = 0;
        Object object2 = null;
        if ((object = object != null ? ((CustomToolbarViewMerger)object).getToolbar() : null) != null) {
            object = this.customToolbarViewMerger;
            if (object != null && (object = ((CustomToolbarViewMerger)object).getToolbar()) != null) {
                object.invalidate();
            }
            if ((object = this.getMActivity()) != null) {
                CustomToolbarViewMerger customToolbarViewMerger = this.customToolbarViewMerger;
                if (customToolbarViewMerger != null) {
                    object2 = customToolbarViewMerger.getToolbar();
                }
                ((AppCompatActivity)object).setSupportActionBar((Toolbar)object2);
            }
        }
        object2 = Looper.getMainLooper();
        object = new Handler(object2);
        object2 = new kg_1(this);
        long l2 = 300L;
        object.postDelayed((Runnable)object2, l2);
        object = this.customToolbarViewMerger;
        if (object != null) {
            ((CustomToolbarViewMerger)object).setNavigationClick();
        }
        if ((object = this.customToolbarViewMerger) != null) {
            n3 = 8;
            ((CustomToolbarViewMerger)object).setSubTitleVisibility(n3);
        }
        if ((object = this.customToolbarViewMerger) != null) {
            Intrinsics.checkNotNull(string2);
            ((CustomToolbarViewMerger)object).setTitleText(string2);
        }
    }

    private static final void setToolBarUI$lambda$1(CCFaqFragment object) {
        String string2 = "this$0";
        Intrinsics.checkNotNullParameter(object, string2);
        object = ((CCFaqFragment)object).customToolbarViewMerger;
        if (object != null && (object = ((CustomToolbarViewMerger)object).getToolbar()) != null) {
            ai0_2.a((View)object);
        }
    }

    public final void onBackPressed() {
        this.handleBackPress();
    }

    public void onCreate(Bundle object) {
        super.onCreate((Bundle)object);
        object = new CustomToolbarViewMerger(this);
        this.customToolbarViewMerger = object;
        object = this.getMActivity();
        Intrinsics.checkNotNull(object);
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
            return;
        }
        object2 = "Local and anonymous classes can not be ViewModels".toString();
        object = new IllegalArgumentException((String)object2);
        throw object;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup object, Bundle object2) {
        object2 = "inflater";
        Intrinsics.checkNotNullParameter(layoutInflater, (String)object2);
        int n3 = R$layout.fragment_ccfaq_refresh;
        layoutInflater = layoutInflater.inflate(n3, (ViewGroup)object, false);
        Intrinsics.checkNotNullExpressionValue(layoutInflater, "inflate(...)");
        object = this.customToolbarViewMerger;
        if (object != null) {
            ((CustomToolbarViewMerger)object).initViews((View)layoutInflater);
        }
        return layoutInflater;
    }

    public void onNavigationClick() {
        this.handleBackPress();
    }

    public void onStop() {
        super.onStop();
        this.newEEcommerceEventsRevamp.setPreviousScreenData("faq screen", "know about us screen");
    }

    public void onViewCreated(View object, Bundle object2) {
        Object object3;
        int n3;
        boolean bl2;
        Intrinsics.checkNotNullParameter(object, "view");
        super.onViewCreated((View)object, (Bundle)object2);
        object2 = this.cCBundleViewModel;
        Object object4 = null;
        if (object2 != null && !(bl2 = ((AbstractCollection)(object2 = ((xf_1)object2).b)).isEmpty())) {
            object2 = (xq_0)((Stack)object2).peek();
        } else {
            n3 = 0;
            object2 = null;
        }
        if (object2 != null) {
            object3 = ((xq_0)object2).b;
        } else {
            bl2 = false;
            object3 = null;
        }
        this.mFaqQuestionList = object3;
        if (object2 != null) {
            object3 = ((xq_0)object2).a;
        } else {
            bl2 = false;
            object3 = null;
        }
        Object object5 = object2 != null ? ((xq_0)object2).c : null;
        this.mFaqAnswer = object5;
        if (object2 != null) {
            object4 = ((xq_0)object2).d;
        }
        this.mFaqQuestion = object4;
        if (object3 == null || (n3 = b.k((CharSequence)object3)) != 0) {
            object3 = "Ajio";
        }
        this.setToolBarUI((String)object3);
        n3 = R$id.fragment_ccfaq_rv;
        object = (RecyclerView)object.findViewById(n3);
        this.mRecyclerView = object;
        if (object != null) {
            object4 = this.requireActivity();
            object2 = new LinearLayoutManager((Context)object4);
            ((RecyclerView)object).setLayoutManager((RecyclerView$o)object2);
        }
        this.refreshUi();
        object = this.mFaqAnswer;
        boolean bl3 = TextUtils.isEmpty((CharSequence)object);
        if (bl3) {
            Bundle bundle = new Bundle();
            object = this.newCustomEventsRevamp.getFAQ_QUESTION();
            bundle.putString((String)object, (String)object3);
            object5 = this.newCustomEventsRevamp;
            String string2 = this.newEEcommerceEventsRevamp.getPrevScreen();
            object = this.newEEcommerceEventsRevamp;
            String string3 = ((NewEEcommerceEventsRevamp)object).getPrevScreenType();
            String string4 = "customer care - faq screen";
            String string5 = "customer care screen";
            ((NewCustomEventsRevamp)object5).newPushCustomScreenView(string4, string5, string2, bundle, string3);
        }
    }

    public void onViewItemClick(Object object, int n3) {
        CCFaqFragment cCFaqFragment = this;
        Object object2 = object;
        int n4 = n3;
        Object object3 = this.getMActivity();
        if (object3 != null) {
            object3 = this.getMActivity();
            Intrinsics.checkNotNull(object3);
            int n7 = object3.isFinishing();
            if (!n7) {
                n7 = 2;
                Object object4 = "self care";
                if (n3 != n7) {
                    int n8 = 9;
                    if (n3 != n8) {
                        n8 = 14;
                        if (n3 != n8) {
                            n8 = 15;
                            if (n3 == n8 && (n8 = (int)(TextUtils.isEmpty((CharSequence)(object2 = this.mFaqQuestion)) ? 1 : 0)) == 0) {
                                object2 = AnalyticsManager.Companion.getInstance().getGtmEvents();
                                CharSequence charSequence = this.mFaqQuestion;
                                object3 = new StringBuilder("Was_Not_Helpful_Clicked_");
                                ((StringBuilder)object3).append((String)charSequence);
                                charSequence = ((StringBuilder)object3).toString();
                                ((GTMEvents)object2).pushButtonTapEvent(charSequence, (String)object4);
                                NewCustomEventsRevamp newCustomEventsRevamp = this.newCustomEventsRevamp;
                                String string2 = newCustomEventsRevamp.getEC_FAQ_INTERACTION();
                                object2 = this.mFaqAnswer;
                                object3 = "thumbs down - ";
                                charSequence = new StringBuilder((String)object3);
                                ((StringBuilder)charSequence).append((String)object2);
                                String string3 = ((StringBuilder)charSequence).toString();
                                String string4 = this.previousScreen;
                                String string5 = this.previousScreenType;
                                Object var16_35 = null;
                                boolean bl2 = false;
                                String string6 = "faq feedback";
                                String string7 = "faq_feedback";
                                String string8 = "faq screen";
                                String string9 = "know about us screen";
                                Object var22_59 = null;
                                int n10 = 1536;
                                boolean bl3 = false;
                                NewCustomEventsRevamp.newPushCustomEvent$default(newCustomEventsRevamp, string2, string6, string3, string7, string8, string9, string4, null, string5, false, null, n10, null);
                            }
                        } else {
                            object2 = this.mFaqQuestion;
                            n8 = (int)(TextUtils.isEmpty((CharSequence)object2) ? 1 : 0);
                            if (n8 == 0) {
                                object2 = AnalyticsManager.Companion.getInstance().getGtmEvents();
                                CharSequence charSequence = this.mFaqQuestion;
                                object3 = new StringBuilder("Was_Helpful_Clicked_");
                                ((StringBuilder)object3).append((String)charSequence);
                                charSequence = ((StringBuilder)object3).toString();
                                ((GTMEvents)object2).pushButtonTapEvent(charSequence, (String)object4);
                                NewCustomEventsRevamp newCustomEventsRevamp = this.newCustomEventsRevamp;
                                String string10 = newCustomEventsRevamp.getEC_FAQ_INTERACTION();
                                object2 = this.mFaqAnswer;
                                object3 = "thumbs up - ";
                                charSequence = new StringBuilder((String)object3);
                                ((StringBuilder)charSequence).append((String)object2);
                                String string11 = ((StringBuilder)charSequence).toString();
                                String string12 = this.previousScreen;
                                String string13 = this.previousScreenType;
                                Object var16_36 = null;
                                boolean bl4 = false;
                                String string14 = "faq feedback";
                                String string15 = "faq_feedback";
                                String string16 = "faq screen";
                                String string17 = "know about us screen";
                                Object var22_60 = null;
                                int n14 = 1536;
                                boolean bl5 = false;
                                NewCustomEventsRevamp.newPushCustomEvent$default(newCustomEventsRevamp, string10, string14, string11, string15, string16, string17, string12, null, string13, false, null, n14, null);
                            }
                        }
                    } else {
                        Object object5;
                        object2 = this.mFaqQuestion;
                        n8 = (int)(TextUtils.isEmpty((CharSequence)object2) ? 1 : 0);
                        if (n8 == 0) {
                            object2 = AnalyticsManager.Companion.getInstance().getGtmEvents();
                            object5 = this.mFaqQuestion;
                            object3 = "selfCare item page";
                            ((GTMEvents)object2).pushButtonTapEvent(object5, (String)object3);
                        }
                        object4 = cCFaqFragment.newCustomEventsRevamp;
                        String string18 = ((NewCustomEventsRevamp)object4).getEC_CC_ORDER_INTERACTION();
                        String string19 = cCFaqFragment.previousScreen;
                        String string20 = cCFaqFragment.previousScreenType;
                        Object var15_33 = null;
                        Object var16_37 = null;
                        String string21 = "contact us";
                        String string22 = "";
                        String string23 = "contact_us";
                        String string24 = "faq screen";
                        String string25 = "know about us screen";
                        Object var14_29 = null;
                        int n15 = 1536;
                        boolean bl6 = false;
                        NewCustomEventsRevamp.newPushCustomEvent$default((NewCustomEventsRevamp)object4, string18, string21, string22, string23, string24, string25, string19, null, string20, false, null, n15, null);
                        object2 = CCContactUsDialog.Companion.newInstance();
                        object5 = this.getMActivity();
                        Intrinsics.checkNotNull(object5);
                        object5 = ((FragmentActivity)object5).getSupportFragmentManager();
                        object3 = "CCContactUsFragment";
                        ((DialogFragment)object2).show((FragmentManager)object5, (String)object3);
                    }
                } else {
                    n4 = object instanceof Integer;
                    if (n4 != 0 && (n4 = ((Number)(object2 = (Number)object)).intValue()) < (n7 = ((ArrayList)(object3 = this.getMUiItemsList())).size())) {
                        Object object6;
                        Object object7 = this.getMUiItemsList();
                        int n16 = ((Number)object2).intValue();
                        object2 = ((ArrayList)object7).get(n16);
                        Intrinsics.checkNotNull(object2, "null cannot be cast to non-null type com.ril.ajio.ondemand.customercare.view.common.UiCCComponent");
                        object2 = (UiCCComponent)object2;
                        object7 = ((UiCCComponent)object2).getQuestionAnswerList();
                        if (object7 != null) {
                            object7 = AnalyticsManager.Companion;
                            object3 = ((AnalyticsManager$Companion)object7).getInstance().getGtmEvents();
                            object6 = ((UiCCComponent)object2).getQuestionAnswerList().getQuestion();
                            Object object8 = new StringBuilder("FAQ_L2_Clicked_");
                            ((StringBuilder)object8).append((String)object6);
                            object6 = ((StringBuilder)object8).toString();
                            ((GTMEvents)object3).pushButtonTapEvent(object6, (String)object4);
                            Object object9 = new Bundle();
                            object3 = this.newCustomEventsRevamp.getSTEP();
                            object9.putString((String)object3, "FAQ_L2_Clicked");
                            object8 = this.newCustomEventsRevamp;
                            String string26 = ((NewCustomEventsRevamp)object8).getEC_FAQ_INTERACTION();
                            String string27 = ((UiCCComponent)object2).getQuestionAnswerList().getQuestion();
                            object3 = "getQuestion(...)";
                            Intrinsics.checkNotNullExpressionValue(string27, (String)object3);
                            String string28 = this.previousScreen;
                            String string29 = this.previousScreenType;
                            boolean bl7 = false;
                            int n17 = 0;
                            String string30 = "faq click";
                            String string31 = "faq_click";
                            String string32 = "faq screen";
                            String string33 = "know about us screen";
                            int n18 = 1536;
                            NewCustomEventsRevamp.newPushCustomEvent$default((NewCustomEventsRevamp)object8, string26, string30, string27, string31, string32, string33, string28, object9, string29, false, null, n18, null);
                            object4 = new Bundle();
                            object6 = this.newCustomEventsRevamp.getFAQ_QUESTION();
                            object8 = ((UiCCComponent)object2).getQuestionAnswerList().getQuestion();
                            object4.putString((String)object6, (String)object8);
                            object6 = this.newCustomEventsRevamp;
                            String string34 = this.newEEcommerceEventsRevamp.getPrevScreen();
                            object8 = this.newEEcommerceEventsRevamp;
                            String string35 = ((NewEEcommerceEventsRevamp)object8).getPrevScreenType();
                            String string36 = "customer care - faq - answer screen";
                            String string37 = "customer care screen";
                            ((NewCustomEventsRevamp)object6).newPushCustomScreenView(string36, string37, string34, (Bundle)object4, string35);
                            object4 = ((UiCCComponent)object2).getQuestionAnswerList();
                            if (object4 != null) {
                                object6 = this.newCustomEventsRevamp;
                                object8 = ((NewCustomEventsRevamp)object6).getEC_SELF_CARE_ISSUE_INTERACTION();
                                object4 = ((UiCCComponent)object2).getQuestionAnswerList();
                                string26 = ((QuestionAnswerList)object4).getQuestion();
                                Intrinsics.checkNotNullExpressionValue(string26, (String)object3);
                                string27 = this.newCustomEventsRevamp.getEN_SELF_CARE_INTERACTION();
                                object3 = ((AnalyticsManager$Companion)object7).getInstance().getGtmEvents();
                                string31 = ((GTMEvents)object3).getScreenName();
                                object7 = ((AnalyticsManager$Companion)object7).getInstance().getGtmEvents();
                                string32 = ((GTMEvents)object7).getScreenName();
                                string33 = this.previousScreen;
                                object9 = this.previousScreenType;
                                string29 = null;
                                bl7 = false;
                                string30 = "";
                                string28 = null;
                                n17 = 1536;
                                n18 = 0;
                                NewCustomEventsRevamp.newPushCustomEvent$default((NewCustomEventsRevamp)object6, (String)object8, string26, string30, string27, string31, string32, string33, null, (String)object9, false, null, n17, null);
                            }
                        }
                        if ((object2 = ((UiCCComponent)object2).getQuestionAnswerList()) == null) {
                            return;
                        }
                        n7 = R$string.cc_detail_screen_title;
                        object3 = hv3_0.K(n7);
                        object4 = ((QuestionAnswerList)object2).getAnswer();
                        object2 = ((QuestionAnswerList)object2).getQuestion();
                        object6 = null;
                        object7 = new xq_0((String)object3, null, (String)object4, (String)object2);
                        object2 = cCFaqFragment.cCBundleViewModel;
                        if (object2 != null) {
                            object2 = ((xf_1)object2).b;
                            ((Stack)object2).push(object7);
                        }
                        if ((object2 = this.getCcActivityListener()) != null) {
                            n4 = 106;
                            n7 = 1;
                            object2.addFragment(n4, null, n7 != 0);
                        }
                    }
                }
            }
        }
    }
}

