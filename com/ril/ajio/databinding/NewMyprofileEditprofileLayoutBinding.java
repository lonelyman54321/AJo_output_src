/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.LinearLayout
 *  android.widget.RadioGroup
 *  android.widget.RelativeLayout
 *  android.widget.ScrollView
 *  android.widget.TextView
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import com.google.android.material.textfield.TextInputLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioButton;
import com.ril.ajio.customviews.widgets.AjioEditText;
import com.ril.ajio.customviews.widgets.AjioRadioButton;
import com.ril.ajio.customviews.widgets.AjioTextView;
import com.ril.ajio.databinding.DialogEditMobileBinding;

public final class NewMyprofileEditprofileLayoutBinding
implements BC3 {
    public final LinearLayout btnContainer;
    public final AjioTextView dateOfBirthField;
    public final AjioTextView dateOfBirthFieldLabelTv;
    public final AjioTextView editProfileGenderTitle;
    public final LinearLayout editProfileGenderView;
    public final RelativeLayout editProfileRootView;
    public final DialogEditMobileBinding editView;
    public final LinearLayout editViewLayout;
    public final AjioEditText emailAddress;
    public final TextInputLayout emailAddressTextInput;
    public final TextView emailChange;
    public final AjioEditText firstName;
    public final TextInputLayout firstNameTextInput;
    public final RadioGroup genderRadioGroup;
    public final AjioEditText lastName;
    public final TextInputLayout lastNameTextInput;
    public final TextView passwordChange;
    public final AjioEditText passwordField;
    public final TextInputLayout passwordFieldTextInput;
    public final TextView phoneChange;
    public final AjioRadioButton radioFemale;
    public final AjioRadioButton radioMale;
    public final AjioButton reset;
    private final RelativeLayout rootView;
    public final AjioEditText screenName;
    public final TextInputLayout screenNameTextInput;
    public final ScrollView scrollView;
    public final AjioEditText telephoneField;
    public final TextInputLayout telephoneFieldTextInput;
    public final AjioButton update;

    private NewMyprofileEditprofileLayoutBinding(RelativeLayout relativeLayout, LinearLayout linearLayout, AjioTextView ajioTextView, AjioTextView ajioTextView2, AjioTextView ajioTextView3, LinearLayout linearLayout2, RelativeLayout relativeLayout2, DialogEditMobileBinding dialogEditMobileBinding, LinearLayout linearLayout3, AjioEditText ajioEditText, TextInputLayout textInputLayout, TextView textView, AjioEditText ajioEditText2, TextInputLayout textInputLayout2, RadioGroup radioGroup, AjioEditText ajioEditText3, TextInputLayout textInputLayout3, TextView textView2, AjioEditText ajioEditText4, TextInputLayout textInputLayout4, TextView textView3, AjioRadioButton ajioRadioButton, AjioRadioButton ajioRadioButton2, AjioButton ajioButton, AjioEditText ajioEditText5, TextInputLayout textInputLayout5, ScrollView scrollView, AjioEditText ajioEditText6, TextInputLayout textInputLayout6, AjioButton ajioButton2) {
        this.rootView = relativeLayout;
        this.btnContainer = linearLayout;
        this.dateOfBirthField = ajioTextView;
        this.dateOfBirthFieldLabelTv = ajioTextView2;
        this.editProfileGenderTitle = ajioTextView3;
        this.editProfileGenderView = linearLayout2;
        this.editProfileRootView = relativeLayout2;
        this.editView = dialogEditMobileBinding;
        this.editViewLayout = linearLayout3;
        this.emailAddress = ajioEditText;
        this.emailAddressTextInput = textInputLayout;
        this.emailChange = textView;
        this.firstName = ajioEditText2;
        this.firstNameTextInput = textInputLayout2;
        this.genderRadioGroup = radioGroup;
        this.lastName = ajioEditText3;
        this.lastNameTextInput = textInputLayout3;
        this.passwordChange = textView2;
        this.passwordField = ajioEditText4;
        this.passwordFieldTextInput = textInputLayout4;
        this.phoneChange = textView3;
        this.radioFemale = ajioRadioButton;
        this.radioMale = ajioRadioButton2;
        this.reset = ajioButton;
        this.screenName = ajioEditText5;
        this.screenNameTextInput = textInputLayout5;
        this.scrollView = scrollView;
        this.telephoneField = ajioEditText6;
        this.telephoneFieldTextInput = textInputLayout6;
        this.update = ajioButton2;
    }

    public static NewMyprofileEditprofileLayoutBinding bind(View view) {
        View view2;
        Object object = view;
        int n3 = R$id.btn_container;
        View view3 = view2 = dd2_2.a(n3, view);
        view3 = (LinearLayout)view2;
        if (view3 != null) {
            n3 = R$id.date_of_birth_field;
            Object object2 = view2 = dd2_2.a(n3, view);
            object2 = (AjioTextView)view2;
            if (object2 != null) {
                n3 = R$id.date_of_birth_field_label_tv;
                Object object3 = view2 = dd2_2.a(n3, view);
                object3 = (AjioTextView)view2;
                if (object3 != null) {
                    n3 = R$id.edit_profile_gender_title;
                    Object object4 = view2 = dd2_2.a(n3, view);
                    object4 = (AjioTextView)view2;
                    if (object4 != null) {
                        n3 = R$id.edit_profile_gender_view;
                        View view4 = view2 = dd2_2.a(n3, view);
                        view4 = (LinearLayout)view2;
                        if (view4 != null) {
                            n3 = R$id.edit_profile_root_view;
                            View view5 = view2 = dd2_2.a(n3, view);
                            view5 = (RelativeLayout)view2;
                            if (view5 != null && (view2 = dd2_2.a(n3 = R$id.edit_view, view)) != null) {
                                DialogEditMobileBinding dialogEditMobileBinding = DialogEditMobileBinding.bind(view2);
                                n3 = R$id.edit_view_layout;
                                View view6 = view2 = dd2_2.a(n3, view);
                                view6 = (LinearLayout)view2;
                                if (view6 != null) {
                                    n3 = R$id.email_address;
                                    Object object5 = view2 = dd2_2.a(n3, view);
                                    object5 = (AjioEditText)view2;
                                    if (object5 != null) {
                                        n3 = R$id.email_address_text_input;
                                        Object object6 = view2 = dd2_2.a(n3, view);
                                        object6 = (TextInputLayout)view2;
                                        if (object6 != null) {
                                            n3 = R$id.email_change;
                                            View view7 = view2 = dd2_2.a(n3, view);
                                            view7 = (TextView)view2;
                                            if (view7 != null) {
                                                n3 = R$id.first_name;
                                                Object object7 = view2 = dd2_2.a(n3, view);
                                                object7 = (AjioEditText)view2;
                                                if (object7 != null) {
                                                    n3 = R$id.first_name_text_input;
                                                    Object object8 = view2 = dd2_2.a(n3, view);
                                                    object8 = (TextInputLayout)view2;
                                                    if (object8 != null) {
                                                        n3 = R$id.gender_radio_group;
                                                        View view8 = view2 = dd2_2.a(n3, view);
                                                        view8 = (RadioGroup)view2;
                                                        if (view8 != null) {
                                                            n3 = R$id.last_name;
                                                            Object object9 = view2 = dd2_2.a(n3, view);
                                                            object9 = (AjioEditText)view2;
                                                            if (object9 != null) {
                                                                n3 = R$id.last_name_text_input;
                                                                Object object10 = view2 = dd2_2.a(n3, view);
                                                                object10 = (TextInputLayout)view2;
                                                                if (object10 != null) {
                                                                    n3 = R$id.password_change;
                                                                    View view9 = view2 = dd2_2.a(n3, view);
                                                                    view9 = (TextView)view2;
                                                                    if (view9 != null) {
                                                                        n3 = R$id.password_field;
                                                                        Object object11 = view2 = dd2_2.a(n3, view);
                                                                        object11 = (AjioEditText)view2;
                                                                        if (object11 != null) {
                                                                            n3 = R$id.password_field_text_input;
                                                                            Object object12 = view2 = dd2_2.a(n3, view);
                                                                            object12 = (TextInputLayout)view2;
                                                                            if (object12 != null) {
                                                                                n3 = R$id.phone_change;
                                                                                View view10 = view2 = dd2_2.a(n3, view);
                                                                                view10 = (TextView)view2;
                                                                                if (view10 != null) {
                                                                                    n3 = R$id.radio_female;
                                                                                    Object object13 = view2 = dd2_2.a(n3, view);
                                                                                    object13 = (AjioRadioButton)view2;
                                                                                    if (object13 != null) {
                                                                                        n3 = R$id.radio_male;
                                                                                        Object object14 = view2 = dd2_2.a(n3, view);
                                                                                        object14 = (AjioRadioButton)view2;
                                                                                        if (object14 != null) {
                                                                                            n3 = R$id.reset;
                                                                                            Object object15 = view2 = dd2_2.a(n3, view);
                                                                                            object15 = (AjioButton)view2;
                                                                                            if (object15 != null) {
                                                                                                n3 = R$id.screen_name;
                                                                                                Object object16 = view2 = dd2_2.a(n3, view);
                                                                                                object16 = (AjioEditText)view2;
                                                                                                if (object16 != null) {
                                                                                                    n3 = R$id.screen_name_text_input;
                                                                                                    Object object17 = view2 = dd2_2.a(n3, view);
                                                                                                    object17 = (TextInputLayout)view2;
                                                                                                    if (object17 != null) {
                                                                                                        n3 = R$id.scroll_view;
                                                                                                        View view11 = view2 = dd2_2.a(n3, view);
                                                                                                        view11 = (ScrollView)view2;
                                                                                                        if (view11 != null) {
                                                                                                            n3 = R$id.telephone_field;
                                                                                                            Object object18 = view2 = dd2_2.a(n3, view);
                                                                                                            object18 = (AjioEditText)view2;
                                                                                                            if (object18 != null) {
                                                                                                                n3 = R$id.telephone_field_text_input;
                                                                                                                Object object19 = view2 = dd2_2.a(n3, view);
                                                                                                                object19 = (TextInputLayout)view2;
                                                                                                                if (object19 != null) {
                                                                                                                    n3 = R$id.update;
                                                                                                                    Object object20 = view2 = dd2_2.a(n3, view);
                                                                                                                    object20 = (AjioButton)view2;
                                                                                                                    if (object20 != null) {
                                                                                                                        View view12 = view;
                                                                                                                        view12 = (RelativeLayout)view;
                                                                                                                        NewMyprofileEditprofileLayoutBinding newMyprofileEditprofileLayoutBinding = new NewMyprofileEditprofileLayoutBinding((RelativeLayout)view12, (LinearLayout)view3, (AjioTextView)object2, (AjioTextView)object3, (AjioTextView)object4, (LinearLayout)view4, (RelativeLayout)view5, dialogEditMobileBinding, (LinearLayout)view6, (AjioEditText)object5, (TextInputLayout)((Object)object6), (TextView)view7, (AjioEditText)object7, (TextInputLayout)((Object)object8), (RadioGroup)view8, (AjioEditText)object9, (TextInputLayout)((Object)object10), (TextView)view9, (AjioEditText)object11, (TextInputLayout)((Object)object12), (TextView)view10, (AjioRadioButton)object13, (AjioRadioButton)object14, (AjioButton)object15, (AjioEditText)object16, (TextInputLayout)((Object)object17), (ScrollView)view11, (AjioEditText)object18, (TextInputLayout)((Object)object19), (AjioButton)object20);
                                                                                                                        return newMyprofileEditprofileLayoutBinding;
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

    public static NewMyprofileEditprofileLayoutBinding inflate(LayoutInflater layoutInflater) {
        return NewMyprofileEditprofileLayoutBinding.inflate(layoutInflater, null, false);
    }

    public static NewMyprofileEditprofileLayoutBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.new_myprofile_editprofile_layout;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return NewMyprofileEditprofileLayoutBinding.bind((View)layoutInflater);
    }

    public RelativeLayout getRoot() {
        return this.rootView;
    }
}

