/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.LinearLayout
 *  android.widget.ListView
 *  android.widget.RelativeLayout
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RelativeLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioButton;
import com.ril.ajio.customviews.widgets.AjioImageView;
import com.ril.ajio.customviews.widgets.AjioTextView;

public final class DialogAppSettingsBinding
implements BC3 {
    public final LinearLayout applybuttonLayout;
    public final AjioImageView closeButton;
    public final LinearLayout middleLayout;
    private final RelativeLayout rootView;
    public final ListView settingList;
    public final AjioButton settingsApply;
    public final LinearLayout settingsTitleLayout;
    public final AjioTextView title;
    public final View topDevider;

    private DialogAppSettingsBinding(RelativeLayout relativeLayout, LinearLayout linearLayout, AjioImageView ajioImageView, LinearLayout linearLayout2, ListView listView, AjioButton ajioButton, LinearLayout linearLayout3, AjioTextView ajioTextView, View view) {
        this.rootView = relativeLayout;
        this.applybuttonLayout = linearLayout;
        this.closeButton = ajioImageView;
        this.middleLayout = linearLayout2;
        this.settingList = listView;
        this.settingsApply = ajioButton;
        this.settingsTitleLayout = linearLayout3;
        this.title = ajioTextView;
        this.topDevider = view;
    }

    public static DialogAppSettingsBinding bind(View object) {
        View view;
        int n3 = R$id.applybutton_layout;
        View view2 = view = dd2_2.a(n3, object);
        view2 = (LinearLayout)view;
        if (view2 != null) {
            n3 = R$id.close_button;
            Object object2 = view = dd2_2.a(n3, object);
            object2 = (AjioImageView)view;
            if (object2 != null) {
                n3 = R$id.middle_layout;
                View view3 = view = dd2_2.a(n3, object);
                view3 = (LinearLayout)view;
                if (view3 != null) {
                    n3 = R$id.setting_list;
                    View view4 = view = dd2_2.a(n3, object);
                    view4 = (ListView)view;
                    if (view4 != null) {
                        n3 = R$id.settings_apply;
                        Object object3 = view = dd2_2.a(n3, object);
                        object3 = (AjioButton)view;
                        if (object3 != null) {
                            n3 = R$id.settings_title_layout;
                            View view5 = view = dd2_2.a(n3, object);
                            view5 = (LinearLayout)view;
                            if (view5 != null) {
                                View view6;
                                n3 = R$id.title;
                                Object object4 = view = dd2_2.a(n3, object);
                                object4 = (AjioTextView)view;
                                if (object4 != null && (view6 = dd2_2.a(n3 = R$id.top_devider, object)) != null) {
                                    Object object5 = object;
                                    object5 = (RelativeLayout)object;
                                    DialogAppSettingsBinding dialogAppSettingsBinding = new DialogAppSettingsBinding((RelativeLayout)object5, (LinearLayout)view2, (AjioImageView)((Object)object2), (LinearLayout)view3, (ListView)view4, (AjioButton)object3, (LinearLayout)view5, (AjioTextView)object4, view6);
                                    return dialogAppSettingsBinding;
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

    public static DialogAppSettingsBinding inflate(LayoutInflater layoutInflater) {
        return DialogAppSettingsBinding.inflate(layoutInflater, null, false);
    }

    public static DialogAppSettingsBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.dialog_app_settings;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return DialogAppSettingsBinding.bind((View)layoutInflater);
    }

    public RelativeLayout getRoot() {
        return this.rootView;
    }
}

