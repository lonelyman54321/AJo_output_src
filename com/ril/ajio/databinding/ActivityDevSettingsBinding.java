/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.Button
 *  android.widget.CheckBox
 *  android.widget.EditText
 *  android.widget.LinearLayout
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.LinearLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioButton;

public final class ActivityDevSettingsBinding
implements BC3 {
    public final Button backendUrlSettings;
    public final Button btnHaptikSettings;
    public final AjioButton buttonTimeout;
    public final EditText edittextTimeout;
    public final LinearLayout layoutTimeout;
    public final Button remoteConfigSettings;
    private final LinearLayout rootView;
    public final CheckBox sslPinning;

    private ActivityDevSettingsBinding(LinearLayout linearLayout, Button button, Button button2, AjioButton ajioButton, EditText editText, LinearLayout linearLayout2, Button button3, CheckBox checkBox) {
        this.rootView = linearLayout;
        this.backendUrlSettings = button;
        this.btnHaptikSettings = button2;
        this.buttonTimeout = ajioButton;
        this.edittextTimeout = editText;
        this.layoutTimeout = linearLayout2;
        this.remoteConfigSettings = button3;
        this.sslPinning = checkBox;
    }

    public static ActivityDevSettingsBinding bind(View object) {
        View view;
        int n3 = R$id.backend_url_settings;
        View view2 = view = dd2_2.a(n3, object);
        view2 = (Button)view;
        if (view2 != null) {
            n3 = R$id.btn_haptik_settings;
            View view3 = view = dd2_2.a(n3, object);
            view3 = (Button)view;
            if (view3 != null) {
                n3 = R$id.button_timeout;
                Object object2 = view = dd2_2.a(n3, object);
                object2 = (AjioButton)view;
                if (object2 != null) {
                    n3 = R$id.edittext_timeout;
                    View view4 = view = dd2_2.a(n3, object);
                    view4 = (EditText)view;
                    if (view4 != null) {
                        n3 = R$id.layout_timeout;
                        View view5 = view = dd2_2.a(n3, object);
                        view5 = (LinearLayout)view;
                        if (view5 != null) {
                            n3 = R$id.remote_config_settings;
                            View view6 = view = dd2_2.a(n3, object);
                            view6 = (Button)view;
                            if (view6 != null) {
                                n3 = R$id.ssl_pinning;
                                View view7 = view = dd2_2.a(n3, object);
                                view7 = (CheckBox)view;
                                if (view7 != null) {
                                    Object object3 = object;
                                    object3 = (LinearLayout)object;
                                    ActivityDevSettingsBinding activityDevSettingsBinding = new ActivityDevSettingsBinding((LinearLayout)object3, (Button)view2, (Button)view3, (AjioButton)object2, (EditText)view4, (LinearLayout)view5, (Button)view6, (CheckBox)view7);
                                    return activityDevSettingsBinding;
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

    public static ActivityDevSettingsBinding inflate(LayoutInflater layoutInflater) {
        return ActivityDevSettingsBinding.inflate(layoutInflater, null, false);
    }

    public static ActivityDevSettingsBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.activity_dev_settings;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return ActivityDevSettingsBinding.bind((View)layoutInflater);
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }
}

