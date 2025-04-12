/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Bundle
 *  android.os.Handler
 *  android.os.IBinder
 *  android.os.Looper
 *  android.view.KeyEvent
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.view.inputmethod.InputMethodManager
 *  android.widget.ImageButton
 *  android.widget.ImageView
 *  android.widget.TextView
 *  android.widget.TextView$OnEditorActionListener
 */
package com.ril.ajio.ondemand.customercare.view.fragment;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.E$b;
import androidx.lifecycle.LiveData;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$f;
import androidx.recyclerview.widget.RecyclerView$o;
import com.ajio.ril.core.network.model.DataError;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.R$string;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.events.GTMEvents;
import com.ril.ajio.customviews.widgets.AjioEditText;
import com.ril.ajio.customviews.widgets.AjioTextView;
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.ondemand.customercare.faq.CCFaqAdapter;
import com.ril.ajio.ondemand.customercare.view.common.UiCCComponent;
import com.ril.ajio.ondemand.customercare.view.fragment.CCBaseFragment;
import com.ril.ajio.ondemand.customercare.view.fragment.SearchFaqFragment$Companion;
import com.ril.ajio.ondemand.customercare.viewmodel.CCViewModel;
import com.ril.ajio.services.data.CustomerCare.CCFaqSearch;
import com.ril.ajio.services.data.CustomerCare.QuestionAnswerList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Stack;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.ranges.c;
import kotlin.text.StringsKt;

public class SearchFaqFragment
extends CCBaseFragment
implements i82_0 {
    public static final SearchFaqFragment$Companion Companion;
    private ImageButton backIcon;
    private xf_1 cCBundleViewModel;
    private ImageView closeIcon;
    private RecyclerView faqSearchList;
    private CCViewModel mCCViewModel;
    private ArrayList mFaqQuestionList;
    private AjioTextView noResultTv;
    private AjioEditText searchBox;
    private ArrayList uiItemsList;

    static {
        SearchFaqFragment$Companion searchFaqFragment$Companion;
        Companion = searchFaqFragment$Companion = new SearchFaqFragment$Companion(null);
    }

    public SearchFaqFragment() {
        ArrayList arrayList;
        this.uiItemsList = arrayList = new ArrayList();
    }

    public static /* synthetic */ void Oa(SearchFaqFragment searchFaqFragment, DataCallback dataCallback) {
        SearchFaqFragment.initObservables$lambda$3(searchFaqFragment, dataCallback);
    }

    public static /* synthetic */ void Pa(SearchFaqFragment searchFaqFragment, View view) {
        SearchFaqFragment.onActivityCreated$lambda$2(searchFaqFragment, view);
    }

    public static /* synthetic */ void Qa(SearchFaqFragment searchFaqFragment, View view) {
        SearchFaqFragment.onActivityCreated$lambda$1(searchFaqFragment, view);
    }

    public static /* synthetic */ void Ra(SearchFaqFragment searchFaqFragment) {
        SearchFaqFragment.setNoResultText$lambda$4(searchFaqFragment);
    }

    public static /* synthetic */ boolean Sa(SearchFaqFragment searchFaqFragment, TextView textView, int n3, KeyEvent keyEvent) {
        return SearchFaqFragment.onActivityCreated$lambda$0(searchFaqFragment, textView, n3, keyEvent);
    }

    private final void clearListData() {
        Object object = this.mFaqQuestionList;
        if (object != null) {
            ((ArrayList)object).clear();
        }
        this.uiItemsList.clear();
        object = this.faqSearchList;
        if (object != null && (object = ((RecyclerView)object).getAdapter()) != null) {
            ((RecyclerView$f)object).notifyDataSetChanged();
        }
    }

    private final void getFaqSearch(String string2) {
        CCViewModel cCViewModel = this.mCCViewModel;
        if (cCViewModel != null) {
            cCViewModel.getCCFaqSearch(string2);
        }
    }

    private final void initObservables() {
        Object object = this.mCCViewModel;
        if (object != null && (object = ((CCViewModel)object).getCcFaqSearchObservable()) != null) {
            mu1_1 mu1_12 = this.getViewLifecycleOwner();
            uu2_2 uu2_22 = new uu2_2(this);
            ((LiveData)object).e(mu1_12, uu2_22);
        }
    }

    private static final void initObservables$lambda$3(SearchFaqFragment searchFaqFragment, DataCallback object) {
        Intrinsics.checkNotNullParameter(searchFaqFragment, "this$0");
        cp_1.Companion.getClass();
        Object object2 = cp$a.e();
        object2.getClass();
        int n3 = cp_1.J((DataCallback)object);
        if (n3 != 0) {
            Intrinsics.checkNotNull(object);
            n3 = ((DataCallback)object).getStatus();
            Object object3 = null;
            if (n3 == 0) {
                if ((object = (CCFaqSearch)((DataCallback)object).getData()) != null) {
                    object3 = ((CCFaqSearch)object).getResults();
                }
                searchFaqFragment.mFaqQuestionList = object3;
                searchFaqFragment.populateUi();
            } else {
                int n4;
                n3 = ((DataCallback)object).getStatus();
                if (n3 == (n4 = 1)) {
                    if ((object = ((DataCallback)object).getError()) != null) {
                        object2 = ((DataError)object).errors;
                    } else {
                        n3 = 0;
                        object2 = null;
                    }
                    if (object2 != null) {
                        object = ((DataError)object).errors;
                        object2 = "errors";
                        Intrinsics.checkNotNullExpressionValue(object, (String)object2);
                        object = (Collection)object;
                        int n7 = object.isEmpty() ^ n4;
                        if (n7 != 0) {
                            GTMEvents gTMEvents = AnalyticsManager.Companion.getInstance().getGtmEvents();
                            object = searchFaqFragment.searchBox;
                            if (object != null && (object = ((AppCompatEditText)object).getText()) != null && (object = object.toString()) != null) {
                                object = StringsKt.m0((CharSequence)object);
                                object3 = object.toString();
                            }
                            object2 = "FAQ_Search_api_failure_";
                            object = new StringBuilder((String)object2);
                            ((StringBuilder)object).append((String)object3);
                            String string2 = ((StringBuilder)object).toString();
                            String string3 = "faq search";
                            String string4 = "FAQ Search \u2013 Search API failure";
                            int n8 = 8;
                            GTMEvents.pushServiceErrorEvent$default(gTMEvents, string4, string2, string3, null, n8, null);
                            n7 = R$string.faq_service_error_msg;
                            object = hv3_0.K(n7);
                            searchFaqFragment.setNoResultText((String)object);
                        }
                    }
                }
            }
        }
    }

    public static final SearchFaqFragment newInstance() {
        return Companion.newInstance();
    }

    private static final boolean onActivityCreated$lambda$0(SearchFaqFragment object, TextView textView, int n3, KeyEvent object2) {
        int n4;
        int n7 = 1;
        object2 = null;
        Object object3 = "this$0";
        Intrinsics.checkNotNullParameter(object, (String)object3);
        int n8 = 3;
        if (n3 != n8 && n3 != (n4 = 6)) {
            n7 = 0;
        } else {
            Object object4 = ((SearchFaqFragment)object).searchBox;
            n4 = 0;
            Object[] objectArray = null;
            if (object4 != null && (object4 = ((AppCompatEditText)object4).getText()) != null) {
                n3 = object4.length();
                object4 = n3;
            } else {
                n3 = 0;
                object4 = null;
            }
            if (object4 != null) {
                int n10 = (Integer)object4;
                String string2 = "faq search";
                String string3 = "FAQ_search_clicked_";
                String string4 = "FAQ Search \u2013 Clicked on FAQ search button";
                if (n10 >= n8) {
                    object4 = AnalyticsManager.Companion.getInstance().getGtmEvents();
                    object2 = ((SearchFaqFragment)object).searchBox;
                    object2 = object2 != null ? ((AppCompatEditText)object2).getText() : null;
                    object2 = ((Object)StringsKt.m0(String.valueOf(object2))).toString();
                    object3 = new StringBuilder(string3);
                    ((StringBuilder)object3).append((String)object2);
                    object2 = ((StringBuilder)object3).toString();
                    ((GTMEvents)object4).pushButtonTapEvent(string4, object2, string2);
                    object4 = ((SearchFaqFragment)object).searchBox;
                    if (object4 != null) {
                        objectArray = ((AppCompatEditText)object4).getText();
                    }
                    object4 = ((Object)StringsKt.m0(String.valueOf(objectArray))).toString();
                    super.getFaqSearch((String)object4);
                } else {
                    n10 = 2;
                    object3 = new c(n7, n10, n7);
                    n3 = (Integer)object4;
                    if ((n3 = (int)(((IntRange)object3).e(n3) ? 1 : 0)) != 0) {
                        object4 = AnalyticsManager.Companion.getInstance().getGtmEvents();
                        object3 = ((SearchFaqFragment)object).searchBox;
                        if (object3 != null) {
                            object3 = ((AppCompatEditText)object3).getText();
                        } else {
                            n8 = 0;
                            object3 = null;
                        }
                        object3 = ((Object)StringsKt.m0(String.valueOf(object3))).toString();
                        CharSequence charSequence = new StringBuilder(string3);
                        charSequence.append((String)object3);
                        object3 = charSequence.toString();
                        ((GTMEvents)object4).pushButtonTapEvent(string4, object3, string2);
                        object4 = ((SearchFaqFragment)object).searchBox;
                        if (object4 != null) {
                            object4 = ((AppCompatEditText)object4).getText();
                        } else {
                            n3 = 0;
                            object4 = null;
                        }
                        object4 = ((Object)StringsKt.m0(String.valueOf(object4))).toString();
                        object3 = new StringBuilder("FAQ_search_no_results_");
                        ((StringBuilder)object3).append((String)object4);
                        object4 = ((StringBuilder)object3).toString();
                        charSequence = "FAQ Search \u2013 No results found";
                        super.sendGAEvents("bannerimpression", (String)charSequence, (String)object4);
                        super.clearListData();
                        n3 = R$string.no_result_msg;
                        object3 = ((SearchFaqFragment)object).searchBox;
                        if (object3 != null) {
                            objectArray = ((AppCompatEditText)object3).getText();
                        }
                        object3 = ((Object)StringsKt.m0(String.valueOf(objectArray))).toString();
                        objectArray = new Object[n7];
                        objectArray[0] = object3;
                        object4 = hv3_0.L(n3, objectArray);
                        super.setNoResultText((String)object4);
                    } else {
                        object = ((SearchFaqFragment)object).noResultTv;
                        if (object != null) {
                            n3 = 8;
                            object.setVisibility(n3);
                        }
                    }
                }
            }
        }
        return n7 != 0;
    }

    private static final void onActivityCreated$lambda$1(SearchFaqFragment object, View object2) {
        object2 = "this$0";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        object = ((CCBaseFragment)object).getMActivity();
        if (object != null && (object = ((FragmentActivity)object).getSupportFragmentManager()) != null) {
            ((FragmentManager)object).W();
        }
    }

    private static final void onActivityCreated$lambda$2(SearchFaqFragment object, View object2) {
        Intrinsics.checkNotNullParameter(object, "this$0");
        ((SearchFaqFragment)object).clearListData();
        object2 = ((SearchFaqFragment)object).searchBox;
        if (object2 != null && (object2 = ((AppCompatEditText)object2).getText()) != null) {
            object2.clear();
        }
        if ((object2 = ((SearchFaqFragment)object).searchBox) != null) {
            object2.requestFocus();
        }
        if ((object = ((SearchFaqFragment)object).noResultTv) != null) {
            int n3 = 8;
            object.setVisibility(n3);
        }
    }

    private final void populateUi() {
        int n3;
        Object object = null;
        int n4 = 1;
        this.uiItemsList.clear();
        Object object2 = this.mFaqQuestionList;
        Object object3 = "bannerimpression";
        int n7 = 8;
        Object object4 = null;
        if (object2 != null && (n3 = object2.isEmpty()) == 0) {
            int n8;
            object2 = new ArrayList();
            Object object5 = this.mFaqQuestionList;
            if (object5 != null) {
                n8 = ((ArrayList)object5).size();
                object5 = n8;
            } else {
                n8 = 0;
                object5 = null;
            }
            Object object6 = "null cannot be cast to non-null type kotlin.Any";
            Intrinsics.checkNotNull(object5, (String)object6);
            ((ArrayList)object2).add(object5);
            object5 = this.searchBox;
            if (object5 != null && (object5 = ((AppCompatEditText)object5).getText()) != null) {
                object5 = object5.toString();
            } else {
                n8 = 0;
                object5 = null;
            }
            Intrinsics.checkNotNull(object5, (String)object6);
            ((ArrayList)object2).add(object5);
            object5 = this.uiItemsList;
            int n10 = 24;
            object6 = new UiCCComponent(n10, object2, 0);
            ((ArrayList)object5).add(object6);
            object2 = this.mFaqQuestionList;
            Intrinsics.checkNotNull(object2);
            n3 = object2.size();
            object5 = null;
            for (n8 = 0; n8 < n3; n8 += n4) {
                UiCCComponent uiCCComponent;
                int n14;
                object6 = this.mFaqQuestionList;
                Intrinsics.checkNotNull(object6);
                object6 = ((ArrayList)object6).get(n8);
                Object object7 = "get(...)";
                Intrinsics.checkNotNullExpressionValue(object6, (String)object7);
                object6 = (QuestionAnswerList)object6;
                if (n8 != 0) {
                    object7 = this.uiItemsList;
                    n14 = 12;
                    uiCCComponent = new UiCCComponent(n4, n4, n14, n14);
                    ((ArrayList)object7).add(uiCCComponent);
                }
                object7 = this.uiItemsList;
                n14 = 2;
                uiCCComponent = new UiCCComponent(n14, (QuestionAnswerList)object6, n8);
                ((ArrayList)object7).add(uiCCComponent);
            }
            object2 = this.uiItemsList;
            Object object8 = new CCFaqAdapter((List)object2, this);
            object2 = this.faqSearchList;
            if (object2 != null) {
                ((RecyclerView)object2).setAdapter((RecyclerView$f)object8);
            }
            if ((object8 = this.faqSearchList) != null) {
                object8.setVisibility(0);
            }
            if ((object = this.noResultTv) != null) {
                object.setVisibility(n7);
            }
            object = (object = this.searchBox) != null && (object = ((AppCompatEditText)object).getText()) != null && (object = object.toString()) != null ? ((Object)StringsKt.m0((CharSequence)object)).toString() : null;
            object8 = this.mFaqQuestionList;
            if (object8 != null) {
                n4 = ((ArrayList)object8).size();
                object4 = n4;
            }
            object2 = "FAQ_search_results_";
            object8 = new StringBuilder((String)object2);
            ((StringBuilder)object8).append((String)object);
            ((StringBuilder)object8).append("_");
            ((StringBuilder)object8).append(object4);
            object = ((StringBuilder)object8).toString();
            object8 = "FAQ Search \u2013 results found";
            this.sendGAEvents((String)object3, (String)object8, (String)object);
        } else {
            object2 = this.searchBox;
            if (object2 != null && (object2 = ((AppCompatEditText)object2).getText()) != null && (object2 = object2.toString()) != null) {
                object2 = ((Object)StringsKt.m0((CharSequence)object2)).toString();
            } else {
                n3 = 0;
                object2 = null;
            }
            String string2 = "FAQ_search_no_results_";
            CharSequence charSequence = new StringBuilder(string2);
            charSequence.append((String)object2);
            object2 = charSequence.toString();
            charSequence = "FAQ Search \u2013 No results found";
            this.sendGAEvents((String)object3, (String)charSequence, (String)object2);
            object2 = this.faqSearchList;
            if (object2 != null) {
                object2.setVisibility(n7);
            }
            n3 = R$string.no_result_msg;
            object3 = this.searchBox;
            if (object3 != null && (object3 = ((AppCompatEditText)object3).getText()) != null && (object3 = object3.toString()) != null) {
                object3 = StringsKt.m0((CharSequence)object3);
                object4 = object3.toString();
            }
            Object[] objectArray = new Object[n4];
            objectArray[0] = object4;
            object = hv3_0.L(n3, objectArray);
            this.setNoResultText((String)object);
        }
    }

    private final void sendGAEvents(String string2, String string3, String string4) {
        AnalyticsManager.Companion.getInstance().getGtmEvents().pushEvent(string2, string3, string4, "faq search");
    }

    private final void setNoResultText(String object) {
        Object object2 = this.noResultTv;
        if (object2 != null) {
            object2.setContentDescription((CharSequence)object);
        }
        if ((object2 = this.noResultTv) != null) {
            object2.setText((CharSequence)object);
        }
        if ((object = this.noResultTv) != null) {
            object2 = null;
            object.setVisibility(0);
        }
        object2 = Looper.getMainLooper();
        object = new Handler((Looper)object2);
        object2 = new yu2_2(this);
        object.postDelayed((Runnable)object2, (long)100);
    }

    private static final void setNoResultText$lambda$4(SearchFaqFragment object) {
        String string2 = "this$0";
        Intrinsics.checkNotNullParameter(object, string2);
        object = ((SearchFaqFragment)object).noResultTv;
        if (object != null) {
            ai0_2.a((View)object);
        }
    }

    public void onActivityCreated(Bundle object) {
        Object object2;
        super.onActivityCreated((Bundle)object);
        object = this.searchBox;
        if (object != null) {
            object2 = new vu2_2(this);
            object.setOnEditorActionListener((TextView.OnEditorActionListener)object2);
        }
        if ((object = this.searchBox) != null) {
            object.requestFocus();
        }
        if ((object = this.backIcon) != null) {
            object2 = new wu2_2(this);
            object.setOnClickListener((View.OnClickListener)object2);
        }
        if ((object = this.closeIcon) != null) {
            object2 = new xu2_2(this);
            object.setOnClickListener((View.OnClickListener)object2);
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
        int bl2 = R$layout.fragment_cc_faq_search;
        layoutInflater = layoutInflater.inflate(bl2, (ViewGroup)object, false);
        Intrinsics.checkNotNullExpressionValue(layoutInflater, "inflate(...)");
        int n3 = R$id.search_box;
        this.searchBox = object = (AjioEditText)layoutInflater.findViewById(n3);
        n3 = R$id.back_arrow;
        object = (ImageButton)layoutInflater.findViewById(n3);
        this.backIcon = object;
        n3 = R$id.cross_img;
        object = (ImageView)layoutInflater.findViewById(n3);
        this.closeIcon = object;
        n3 = R$id.no_result_tv;
        this.noResultTv = object = (AjioTextView)layoutInflater.findViewById(n3);
        n3 = R$id.faqSearchList;
        this.faqSearchList = object = (RecyclerView)layoutInflater.findViewById(n3);
        if (object != null) {
            FragmentActivity fragmentActivity = this.requireActivity();
            object2 = new LinearLayoutManager((Context)fragmentActivity);
            ((RecyclerView)object).setLayoutManager((RecyclerView$o)object2);
        }
        if ((object = this.faqSearchList) != null) {
            boolean bl3 = true;
            ((RecyclerView)object).setHasFixedSize(bl3);
        }
        if ((object = this.faqSearchList) != null) {
            ((RecyclerView)object).setNestedScrollingEnabled(false);
        }
        this.initObservables();
        return layoutInflater;
    }

    public void onStart() {
        int n3;
        super.onStart();
        Object object = this.searchBox;
        if (object != null && (object = object.getContext()) != null) {
            String string2 = "input_method";
            object = object.getSystemService(string2);
        } else {
            object = null;
        }
        object = (InputMethodManager)object;
        if (object != null) {
            n3 = 1;
            object.toggleSoftInput(n3, 0);
        }
        if ((object = this.searchBox) != null) {
            n3 = 3;
            object.setImeOptions(n3);
        }
    }

    public void onStop() {
        Object object;
        super.onStop();
        Object object2 = this.searchBox;
        IBinder iBinder = null;
        if (object2 != null && (object2 = object2.getContext()) != null) {
            object = "input_method";
            object2 = object2.getSystemService((String)object);
        } else {
            object2 = null;
        }
        object2 = (InputMethodManager)object2;
        object = this.searchBox;
        if (object != null) {
            Intrinsics.checkNotNull(object);
            boolean bl2 = object.isFocused();
            if (bl2 && object2 != null) {
                object = this.searchBox;
                if (object != null) {
                    iBinder = object.getWindowToken();
                }
                bl2 = false;
                object = null;
                object2.hideSoftInputFromWindow(iBinder, 0);
            }
        }
    }

    public void onViewItemClick(Object object, int n3) {
        Object object2;
        int n4;
        n3 = object instanceof Integer;
        if (n3 != 0 && (n3 = ((Number)(object = (Number)object)).intValue()) < (n4 = ((ArrayList)(object2 = this.uiItemsList)).size())) {
            Object object3 = this.uiItemsList;
            int n7 = ((Number)object).intValue();
            object = ((ArrayList)object3).get(n7);
            Intrinsics.checkNotNull(object, "null cannot be cast to non-null type com.ril.ajio.ondemand.customercare.view.common.UiCCComponent");
            object = (UiCCComponent)object;
            object3 = ((UiCCComponent)object).getQuestionAnswerList();
            if (object3 == null) {
                return;
            }
            object = ((UiCCComponent)object).getName();
            String string2 = ((QuestionAnswerList)object3).getAnswer();
            String string3 = ((QuestionAnswerList)object3).getQuestion();
            String string4 = null;
            object2 = new xq_0((String)object, null, string2, string3);
            object = this.cCBundleViewModel;
            if (object != null) {
                object = ((xf_1)object).b;
                ((Stack)object).push(object2);
            }
            if ((object = this.getCcActivityListener()) != null) {
                n4 = 106;
                boolean bl2 = true;
                object.addFragment(n4, null, bl2);
            }
            if ((object = this.searchBox) != null && (object = ((AppCompatEditText)object).getText()) != null) {
                string4 = object.toString();
            }
            object = ((QuestionAnswerList)object3).getQuestion();
            object3 = new StringBuilder("FAQ_search_results_question_clicked_");
            ((StringBuilder)object3).append(string4);
            ((StringBuilder)object3).append("_");
            ((StringBuilder)object3).append((String)object);
            object = ((StringBuilder)object3).toString();
            object3 = "bannerimpression";
            object2 = "FAQ Search \u2013 Clicked on Search Result";
            this.sendGAEvents((String)object3, (String)object2, (String)object);
        }
    }
}

