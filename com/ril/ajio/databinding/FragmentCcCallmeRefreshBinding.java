/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.EditText
 *  android.widget.TextView
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioTextView;

public final class FragmentCcCallmeRefreshBinding
implements BC3 {
    public final AjioTextView ccCallmeEstWaitTv;
    public final EditText ccCallmeEtComment;
    public final EditText ccCallmeEtMobile;
    public final AjioTextView ccCallmeLangHeaderTv;
    public final RecyclerView ccCallmeLangRv;
    public final TextView ccCallmeLblMobileError;
    public final AjioTextView ccCallmeTimeSlotHeaderTv;
    public final RecyclerView ccCallmeTimeSlotRv;
    public final TextView ccCallmeTvCharacter;
    private final NestedScrollView rootView;

    private FragmentCcCallmeRefreshBinding(NestedScrollView nestedScrollView, AjioTextView ajioTextView, EditText editText, EditText editText2, AjioTextView ajioTextView2, RecyclerView recyclerView, TextView textView, AjioTextView ajioTextView3, RecyclerView recyclerView2, TextView textView2) {
        this.rootView = nestedScrollView;
        this.ccCallmeEstWaitTv = ajioTextView;
        this.ccCallmeEtComment = editText;
        this.ccCallmeEtMobile = editText2;
        this.ccCallmeLangHeaderTv = ajioTextView2;
        this.ccCallmeLangRv = recyclerView;
        this.ccCallmeLblMobileError = textView;
        this.ccCallmeTimeSlotHeaderTv = ajioTextView3;
        this.ccCallmeTimeSlotRv = recyclerView2;
        this.ccCallmeTvCharacter = textView2;
    }

    public static FragmentCcCallmeRefreshBinding bind(View object) {
        View view;
        int n3 = R$id.cc_callme_est_wait_tv;
        Object object2 = view = dd2_2.a(n3, object);
        object2 = (AjioTextView)view;
        if (object2 != null) {
            n3 = R$id.cc_callme_et_comment;
            View view2 = view = dd2_2.a(n3, object);
            view2 = (EditText)view;
            if (view2 != null) {
                n3 = R$id.cc_callme_et_mobile;
                View view3 = view = dd2_2.a(n3, object);
                view3 = (EditText)view;
                if (view3 != null) {
                    n3 = R$id.cc_callme_lang_header_tv;
                    Object object3 = view = dd2_2.a(n3, object);
                    object3 = (AjioTextView)view;
                    if (object3 != null) {
                        n3 = R$id.cc_callme_lang_rv;
                        Object object4 = view = dd2_2.a(n3, object);
                        object4 = (RecyclerView)view;
                        if (object4 != null) {
                            n3 = R$id.cc_callme_lbl_mobile_error;
                            View view4 = view = dd2_2.a(n3, object);
                            view4 = (TextView)view;
                            if (view4 != null) {
                                n3 = R$id.cc_callme_time_slot_header_tv;
                                Object object5 = view = dd2_2.a(n3, object);
                                object5 = (AjioTextView)view;
                                if (object5 != null) {
                                    n3 = R$id.cc_callme_time_slot_rv;
                                    Object object6 = view = dd2_2.a(n3, object);
                                    object6 = (RecyclerView)view;
                                    if (object6 != null) {
                                        n3 = R$id.cc_callme_tv_character;
                                        View view5 = view = dd2_2.a(n3, object);
                                        view5 = (TextView)view;
                                        if (view5 != null) {
                                            Object object7 = object;
                                            object7 = (NestedScrollView)object;
                                            FragmentCcCallmeRefreshBinding fragmentCcCallmeRefreshBinding = new FragmentCcCallmeRefreshBinding((NestedScrollView)object7, (AjioTextView)object2, (EditText)view2, (EditText)view3, (AjioTextView)object3, (RecyclerView)object4, (TextView)view4, (AjioTextView)object5, (RecyclerView)object6, (TextView)view5);
                                            return fragmentCcCallmeRefreshBinding;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static FragmentCcCallmeRefreshBinding inflate(LayoutInflater layoutInflater) {
        return FragmentCcCallmeRefreshBinding.inflate(layoutInflater, null, false);
    }

    public static FragmentCcCallmeRefreshBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.fragment_cc_callme_refresh;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return FragmentCcCallmeRefreshBinding.bind((View)layoutInflater);
    }

    public NestedScrollView getRoot() {
        return this.rootView;
    }
}

