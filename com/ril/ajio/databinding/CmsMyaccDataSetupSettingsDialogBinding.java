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
 *  android.widget.Spinner
 *  android.widget.TextView
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;

public final class CmsMyaccDataSetupSettingsDialogBinding
implements BC3 {
    public final EditText appVersionEt;
    public final Button btnDatePick;
    public final Button btnTimePick;
    public final TextView dateTV;
    public final Button done;
    public final EditText pageIdValueEt;
    public final EditText pageUrlValueEt;
    public final TextView previewTV;
    private final ConstraintLayout rootView;
    public final Spinner storeSelection;
    public final TextView subGroupSelection;
    public final TextView timeTV;
    public final CheckBox uatCheckbox;
    public final Spinner userGroupDd;
    public final Spinner userStatusDd;
    public final Spinner userTypeDd;

    private CmsMyaccDataSetupSettingsDialogBinding(ConstraintLayout constraintLayout, EditText editText, Button button, Button button2, TextView textView, Button button3, EditText editText2, EditText editText3, TextView textView2, Spinner spinner, TextView textView3, TextView textView4, CheckBox checkBox, Spinner spinner2, Spinner spinner3, Spinner spinner4) {
        this.rootView = constraintLayout;
        this.appVersionEt = editText;
        this.btnDatePick = button;
        this.btnTimePick = button2;
        this.dateTV = textView;
        this.done = button3;
        this.pageIdValueEt = editText2;
        this.pageUrlValueEt = editText3;
        this.previewTV = textView2;
        this.storeSelection = spinner;
        this.subGroupSelection = textView3;
        this.timeTV = textView4;
        this.uatCheckbox = checkBox;
        this.userGroupDd = spinner2;
        this.userStatusDd = spinner3;
        this.userTypeDd = spinner4;
    }

    public static CmsMyaccDataSetupSettingsDialogBinding bind(View view) {
        View view2;
        Object object = view;
        int n3 = R$id.app_version_et;
        View view3 = view2 = dd2_2.a(n3, view);
        view3 = (EditText)view2;
        if (view3 != null) {
            n3 = R$id.btn_date_pick;
            View view4 = view2 = dd2_2.a(n3, view);
            view4 = (Button)view2;
            if (view4 != null) {
                n3 = R$id.btn_time_pick;
                View view5 = view2 = dd2_2.a(n3, view);
                view5 = (Button)view2;
                if (view5 != null) {
                    n3 = R$id.dateTV;
                    View view6 = view2 = dd2_2.a(n3, view);
                    view6 = (TextView)view2;
                    if (view6 != null) {
                        n3 = R$id.done;
                        View view7 = view2 = dd2_2.a(n3, view);
                        view7 = (Button)view2;
                        if (view7 != null) {
                            n3 = R$id.page_id_value_et;
                            View view8 = view2 = dd2_2.a(n3, view);
                            view8 = (EditText)view2;
                            if (view8 != null) {
                                n3 = R$id.page_url_value_et;
                                View view9 = view2 = dd2_2.a(n3, view);
                                view9 = (EditText)view2;
                                if (view9 != null) {
                                    n3 = R$id.previewTV;
                                    View view10 = view2 = dd2_2.a(n3, view);
                                    view10 = (TextView)view2;
                                    if (view10 != null) {
                                        n3 = R$id.store_selection;
                                        View view11 = view2 = dd2_2.a(n3, view);
                                        view11 = (Spinner)view2;
                                        if (view11 != null) {
                                            n3 = R$id.sub_group_selection;
                                            View view12 = view2 = dd2_2.a(n3, view);
                                            view12 = (TextView)view2;
                                            if (view12 != null) {
                                                n3 = R$id.timeTV;
                                                View view13 = view2 = dd2_2.a(n3, view);
                                                view13 = (TextView)view2;
                                                if (view13 != null) {
                                                    n3 = R$id.uat_checkbox;
                                                    View view14 = view2 = dd2_2.a(n3, view);
                                                    view14 = (CheckBox)view2;
                                                    if (view14 != null) {
                                                        n3 = R$id.user_group_dd;
                                                        View view15 = view2 = dd2_2.a(n3, view);
                                                        view15 = (Spinner)view2;
                                                        if (view15 != null) {
                                                            n3 = R$id.user_status_dd;
                                                            View view16 = view2 = dd2_2.a(n3, view);
                                                            view16 = (Spinner)view2;
                                                            if (view16 != null) {
                                                                n3 = R$id.user_type_dd;
                                                                View view17 = view2 = dd2_2.a(n3, view);
                                                                view17 = (Spinner)view2;
                                                                if (view17 != null) {
                                                                    Object object2 = view;
                                                                    object2 = (ConstraintLayout)view;
                                                                    CmsMyaccDataSetupSettingsDialogBinding cmsMyaccDataSetupSettingsDialogBinding = new CmsMyaccDataSetupSettingsDialogBinding((ConstraintLayout)((Object)object2), (EditText)view3, (Button)view4, (Button)view5, (TextView)view6, (Button)view7, (EditText)view8, (EditText)view9, (TextView)view10, (Spinner)view11, (TextView)view12, (TextView)view13, (CheckBox)view14, (Spinner)view15, (Spinner)view16, (Spinner)view17);
                                                                    return cmsMyaccDataSetupSettingsDialogBinding;
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        object = view.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static CmsMyaccDataSetupSettingsDialogBinding inflate(LayoutInflater layoutInflater) {
        return CmsMyaccDataSetupSettingsDialogBinding.inflate(layoutInflater, null, false);
    }

    public static CmsMyaccDataSetupSettingsDialogBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.cms_myacc_data_setup_settings_dialog;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return CmsMyaccDataSetupSettingsDialogBinding.bind((View)layoutInflater);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}

