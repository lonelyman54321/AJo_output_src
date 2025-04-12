/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.Button
 *  android.widget.LinearLayout
 *  android.widget.ListView
 *  android.widget.RelativeLayout
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RelativeLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioTextView;

public final class DialogDatePickerBinding
implements BC3 {
    public final LinearLayout applybuttonLayout;
    public final Button closeButton;
    public final RelativeLayout dateTitleLayout;
    private final RelativeLayout rootView;
    public final ListView settingList;
    public final Button settingsApply;
    public final AjioTextView title;
    public final View topDevider;

    private DialogDatePickerBinding(RelativeLayout relativeLayout, LinearLayout linearLayout, Button button, RelativeLayout relativeLayout2, ListView listView, Button button2, AjioTextView ajioTextView, View view) {
        this.rootView = relativeLayout;
        this.applybuttonLayout = linearLayout;
        this.closeButton = button;
        this.dateTitleLayout = relativeLayout2;
        this.settingList = listView;
        this.settingsApply = button2;
        this.title = ajioTextView;
        this.topDevider = view;
    }

    public static DialogDatePickerBinding bind(View object) {
        View view;
        int n3 = R$id.applybutton_layout;
        View view2 = view = dd2_2.a(n3, object);
        view2 = (LinearLayout)view;
        if (view2 != null) {
            n3 = R$id.close_button;
            View view3 = view = dd2_2.a(n3, object);
            view3 = (Button)view;
            if (view3 != null) {
                n3 = R$id.date_title_layout;
                View view4 = view = dd2_2.a(n3, object);
                view4 = (RelativeLayout)view;
                if (view4 != null) {
                    n3 = R$id.setting_list;
                    View view5 = view = dd2_2.a(n3, object);
                    view5 = (ListView)view;
                    if (view5 != null) {
                        n3 = R$id.settings_apply;
                        View view6 = view = dd2_2.a(n3, object);
                        view6 = (Button)view;
                        if (view6 != null) {
                            View view7;
                            n3 = R$id.title;
                            Object object2 = view = dd2_2.a(n3, object);
                            object2 = (AjioTextView)view;
                            if (object2 != null && (view7 = dd2_2.a(n3 = R$id.top_devider, object)) != null) {
                                Object object3 = object;
                                object3 = (RelativeLayout)object;
                                DialogDatePickerBinding dialogDatePickerBinding = new DialogDatePickerBinding((RelativeLayout)object3, (LinearLayout)view2, (Button)view3, (RelativeLayout)view4, (ListView)view5, (Button)view6, (AjioTextView)object2, view7);
                                return dialogDatePickerBinding;
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

    public static DialogDatePickerBinding inflate(LayoutInflater layoutInflater) {
        return DialogDatePickerBinding.inflate(layoutInflater, null, false);
    }

    public static DialogDatePickerBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.dialog_date_picker;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return DialogDatePickerBinding.bind((View)layoutInflater);
    }

    public RelativeLayout getRoot() {
        return this.rootView;
    }
}

