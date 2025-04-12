/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.Button
 *  android.widget.TextView
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;

public final class DialogLocationPermissionBinding
implements BC3 {
    public final ConstraintLayout dialogButtons;
    public final View dialogButtonsSeparator;
    public final Button dialogCancel;
    public final Button dialogSettings;
    public final TextView dialogTitle;
    public final View dialogTitleLine;
    private final ConstraintLayout rootView;

    private DialogLocationPermissionBinding(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, View view, Button button, Button button2, TextView textView, View view2) {
        this.rootView = constraintLayout;
        this.dialogButtons = constraintLayout2;
        this.dialogButtonsSeparator = view;
        this.dialogCancel = button;
        this.dialogSettings = button2;
        this.dialogTitle = textView;
        this.dialogTitleLine = view2;
    }

    public static DialogLocationPermissionBinding bind(View object) {
        View view;
        View view2;
        int n3 = R$id.dialog_buttons;
        Object object2 = view2 = dd2_2.a(n3, object);
        object2 = (ConstraintLayout)view2;
        if (object2 != null && (view = dd2_2.a(n3 = R$id.dialog_buttons_separator, object)) != null) {
            n3 = R$id.dialog_cancel;
            View view3 = view2 = dd2_2.a(n3, object);
            view3 = (Button)view2;
            if (view3 != null) {
                n3 = R$id.dialog_settings;
                View view4 = view2 = dd2_2.a(n3, object);
                view4 = (Button)view2;
                if (view4 != null) {
                    View view5;
                    n3 = R$id.dialog_title;
                    View view6 = view2 = dd2_2.a(n3, object);
                    view6 = (TextView)view2;
                    if (view6 != null && (view5 = dd2_2.a(n3 = R$id.dialog_title_line, object)) != null) {
                        Object object3 = object;
                        object3 = (ConstraintLayout)((Object)object);
                        DialogLocationPermissionBinding dialogLocationPermissionBinding = new DialogLocationPermissionBinding((ConstraintLayout)((Object)object3), (ConstraintLayout)((Object)object2), view, (Button)view3, (Button)view4, (TextView)view6, view5);
                        return dialogLocationPermissionBinding;
                    }
                }
            }
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static DialogLocationPermissionBinding inflate(LayoutInflater layoutInflater) {
        return DialogLocationPermissionBinding.inflate(layoutInflater, null, false);
    }

    public static DialogLocationPermissionBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.dialog_location_permission;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return DialogLocationPermissionBinding.bind((View)layoutInflater);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}

