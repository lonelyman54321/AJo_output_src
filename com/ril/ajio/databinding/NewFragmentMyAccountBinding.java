/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.FrameLayout
 *  android.widget.ImageView
 *  android.widget.LinearLayout
 *  android.widget.RelativeLayout
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.core.widget.NestedScrollView;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioButton;
import com.ril.ajio.customviews.widgets.AjioNonScrollableListView;
import com.ril.ajio.customviews.widgets.AjioTextView;
import com.ril.ajio.databinding.ItemCmsBannerLayoutBinding;
import com.ril.ajio.databinding.LayoutRowWalletAccountBinding;
import com.ril.ajio.databinding.LayoutVerifyEmailBinding;
import com.ril.ajio.databinding.MyAccountTitleViewJcpBinding;
import com.ril.ajio.databinding.RefereeWidgetLayoutBinding;
import com.ril.ajio.databinding.RowMyAccountCenterBinding;
import com.ril.ajio.utility.customview.InAppBottomUpdatesView;

public final class NewFragmentMyAccountBinding
implements BC3 {
    public final RowMyAccountCenterBinding accountCenterLayout;
    public final ImageView ajioProgressImv;
    public final ItemCmsBannerLayoutBinding bannerMyAccount;
    public final FrameLayout bannerRootView;
    public final AjioButton buttonSetting;
    public final AjioTextView buttonSignOut;
    public final LayoutVerifyEmailBinding cancelChangeNumberRequest;
    public final LinearLayout containerEmail;
    public final LinearLayout contentContainer;
    public final AjioTextView editButton;
    public final LinearLayout editButtonLayout;
    public final NestedScrollView fmaScrollviewAccount;
    public final InAppBottomUpdatesView inappUpdateWidget;
    public final LinearLayout layoutSignOut;
    public final FrameLayout myaccountProgressviewContainer;
    public final AjioTextView nameLetters;
    public final AjioNonScrollableListView nonscrollList1;
    public final AjioNonScrollableListView nonscrollList2;
    public final AjioNonScrollableListView nonscrollList3;
    public final RelativeLayout profileInfoLayout;
    public final LinearLayout profileLayout;
    public final RefereeWidgetLayoutBinding refereeWidget;
    public final ImageView rilEmplNotVerifiedErrorIcon;
    private final FrameLayout rootView;
    public final RelativeLayout siginLayout;
    public final AjioButton signinBtMyact;
    public final AjioTextView textAjioAppVersionNumber;
    public final AjioTextView textAjioBuildVersionNumber;
    public final AjioTextView userEmail;
    public final MyAccountTitleViewJcpBinding userInfoJcp;
    public final AjioTextView userName;
    public final AjioTextView userPhoneNo;
    public final ImageView userimage;
    public final LayoutVerifyEmailBinding verifyEmailLayout;
    public final LayoutVerifyEmailBinding verifyEmailLayoutUcp;
    public final LinearLayout versionLayout;
    public final LayoutRowWalletAccountBinding walletInfo;

    private NewFragmentMyAccountBinding(FrameLayout frameLayout, RowMyAccountCenterBinding rowMyAccountCenterBinding, ImageView imageView, ItemCmsBannerLayoutBinding itemCmsBannerLayoutBinding, FrameLayout frameLayout2, AjioButton ajioButton, AjioTextView ajioTextView, LayoutVerifyEmailBinding layoutVerifyEmailBinding, LinearLayout linearLayout, LinearLayout linearLayout2, AjioTextView ajioTextView2, LinearLayout linearLayout3, NestedScrollView nestedScrollView, InAppBottomUpdatesView inAppBottomUpdatesView, LinearLayout linearLayout4, FrameLayout frameLayout3, AjioTextView ajioTextView3, AjioNonScrollableListView ajioNonScrollableListView, AjioNonScrollableListView ajioNonScrollableListView2, AjioNonScrollableListView ajioNonScrollableListView3, RelativeLayout relativeLayout, LinearLayout linearLayout5, RefereeWidgetLayoutBinding refereeWidgetLayoutBinding, ImageView imageView2, RelativeLayout relativeLayout2, AjioButton ajioButton2, AjioTextView ajioTextView4, AjioTextView ajioTextView5, AjioTextView ajioTextView6, MyAccountTitleViewJcpBinding myAccountTitleViewJcpBinding, AjioTextView ajioTextView7, AjioTextView ajioTextView8, ImageView imageView3, LayoutVerifyEmailBinding layoutVerifyEmailBinding2, LayoutVerifyEmailBinding layoutVerifyEmailBinding3, LinearLayout linearLayout6, LayoutRowWalletAccountBinding layoutRowWalletAccountBinding) {
        this.rootView = frameLayout;
        this.accountCenterLayout = rowMyAccountCenterBinding;
        this.ajioProgressImv = imageView;
        this.bannerMyAccount = itemCmsBannerLayoutBinding;
        this.bannerRootView = frameLayout2;
        this.buttonSetting = ajioButton;
        this.buttonSignOut = ajioTextView;
        this.cancelChangeNumberRequest = layoutVerifyEmailBinding;
        this.containerEmail = linearLayout;
        this.contentContainer = linearLayout2;
        this.editButton = ajioTextView2;
        this.editButtonLayout = linearLayout3;
        this.fmaScrollviewAccount = nestedScrollView;
        this.inappUpdateWidget = inAppBottomUpdatesView;
        this.layoutSignOut = linearLayout4;
        this.myaccountProgressviewContainer = frameLayout3;
        this.nameLetters = ajioTextView3;
        this.nonscrollList1 = ajioNonScrollableListView;
        this.nonscrollList2 = ajioNonScrollableListView2;
        this.nonscrollList3 = ajioNonScrollableListView3;
        this.profileInfoLayout = relativeLayout;
        this.profileLayout = linearLayout5;
        this.refereeWidget = refereeWidgetLayoutBinding;
        this.rilEmplNotVerifiedErrorIcon = imageView2;
        this.siginLayout = relativeLayout2;
        this.signinBtMyact = ajioButton2;
        this.textAjioAppVersionNumber = ajioTextView4;
        this.textAjioBuildVersionNumber = ajioTextView5;
        this.userEmail = ajioTextView6;
        this.userInfoJcp = myAccountTitleViewJcpBinding;
        this.userName = ajioTextView7;
        this.userPhoneNo = ajioTextView8;
        this.userimage = imageView3;
        this.verifyEmailLayout = layoutVerifyEmailBinding2;
        this.verifyEmailLayoutUcp = layoutVerifyEmailBinding3;
        this.versionLayout = linearLayout6;
        this.walletInfo = layoutRowWalletAccountBinding;
    }

    public static NewFragmentMyAccountBinding bind(View view) {
        Object object = view;
        int n3 = R$id.account_center_layout;
        View view2 = dd2_2.a(n3, view);
        if (view2 != null) {
            RowMyAccountCenterBinding rowMyAccountCenterBinding = RowMyAccountCenterBinding.bind(view2);
            n3 = R$id.ajio_progress_imv;
            View view3 = view2 = dd2_2.a(n3, view);
            view3 = (ImageView)view2;
            if (view3 != null && (view2 = dd2_2.a(n3 = R$id.banner_my_account, view)) != null) {
                ItemCmsBannerLayoutBinding itemCmsBannerLayoutBinding = ItemCmsBannerLayoutBinding.bind(view2);
                n3 = R$id.banner_root_view;
                View view4 = view2 = dd2_2.a(n3, view);
                view4 = (FrameLayout)view2;
                if (view4 != null) {
                    n3 = R$id.button_setting;
                    Object object2 = view2 = dd2_2.a(n3, view);
                    object2 = (AjioButton)view2;
                    if (object2 != null) {
                        n3 = R$id.button_sign_out;
                        Object object3 = view2 = dd2_2.a(n3, view);
                        object3 = (AjioTextView)view2;
                        if (object3 != null && (view2 = dd2_2.a(n3 = R$id.cancel_change_number_request, view)) != null) {
                            LayoutVerifyEmailBinding layoutVerifyEmailBinding = LayoutVerifyEmailBinding.bind(view2);
                            n3 = R$id.container_email;
                            View view5 = view2 = dd2_2.a(n3, view);
                            view5 = (LinearLayout)view2;
                            if (view5 != null) {
                                n3 = R$id.content_container;
                                View view6 = view2 = dd2_2.a(n3, view);
                                view6 = (LinearLayout)view2;
                                if (view6 != null) {
                                    n3 = R$id.edit_button;
                                    Object object4 = view2 = dd2_2.a(n3, view);
                                    object4 = (AjioTextView)view2;
                                    if (object4 != null) {
                                        n3 = R$id.edit_button_layout;
                                        View view7 = view2 = dd2_2.a(n3, view);
                                        view7 = (LinearLayout)view2;
                                        if (view7 != null) {
                                            n3 = R$id.fma_scrollview_account;
                                            Object object5 = view2 = dd2_2.a(n3, view);
                                            object5 = (NestedScrollView)view2;
                                            if (object5 != null) {
                                                n3 = R$id.inapp_update_widget;
                                                Object object6 = view2 = dd2_2.a(n3, view);
                                                object6 = (InAppBottomUpdatesView)view2;
                                                if (object6 != null) {
                                                    n3 = R$id.layout_sign_out;
                                                    View view8 = view2 = dd2_2.a(n3, view);
                                                    view8 = (LinearLayout)view2;
                                                    if (view8 != null) {
                                                        n3 = R$id.myaccount_progressview_container;
                                                        View view9 = view2 = dd2_2.a(n3, view);
                                                        view9 = (FrameLayout)view2;
                                                        if (view9 != null) {
                                                            n3 = R$id.name_letters;
                                                            Object object7 = view2 = dd2_2.a(n3, view);
                                                            object7 = (AjioTextView)view2;
                                                            if (object7 != null) {
                                                                n3 = R$id.nonscroll_list_1;
                                                                Object object8 = view2 = dd2_2.a(n3, view);
                                                                object8 = (AjioNonScrollableListView)view2;
                                                                if (object8 != null) {
                                                                    n3 = R$id.nonscroll_list_2;
                                                                    Object object9 = view2 = dd2_2.a(n3, view);
                                                                    object9 = (AjioNonScrollableListView)view2;
                                                                    if (object9 != null) {
                                                                        n3 = R$id.nonscroll_list_3;
                                                                        Object object10 = view2 = dd2_2.a(n3, view);
                                                                        object10 = (AjioNonScrollableListView)view2;
                                                                        if (object10 != null) {
                                                                            n3 = R$id.profile_info_layout;
                                                                            View view10 = view2 = dd2_2.a(n3, view);
                                                                            view10 = (RelativeLayout)view2;
                                                                            if (view10 != null) {
                                                                                n3 = R$id.profile_layout;
                                                                                View view11 = view2 = dd2_2.a(n3, view);
                                                                                view11 = (LinearLayout)view2;
                                                                                if (view11 != null && (view2 = dd2_2.a(n3 = R$id.refereeWidget, view)) != null) {
                                                                                    RefereeWidgetLayoutBinding refereeWidgetLayoutBinding = RefereeWidgetLayoutBinding.bind(view2);
                                                                                    n3 = R$id.ril_empl_not_verified_error_icon;
                                                                                    View view12 = view2 = dd2_2.a(n3, view);
                                                                                    view12 = (ImageView)view2;
                                                                                    if (view12 != null) {
                                                                                        n3 = R$id.sigin_layout;
                                                                                        View view13 = view2 = dd2_2.a(n3, view);
                                                                                        view13 = (RelativeLayout)view2;
                                                                                        if (view13 != null) {
                                                                                            n3 = R$id.signin_bt_myact;
                                                                                            Object object11 = view2 = dd2_2.a(n3, view);
                                                                                            object11 = (AjioButton)view2;
                                                                                            if (object11 != null) {
                                                                                                n3 = R$id.text_ajio_app_version_number;
                                                                                                Object object12 = view2 = dd2_2.a(n3, view);
                                                                                                object12 = (AjioTextView)view2;
                                                                                                if (object12 != null) {
                                                                                                    n3 = R$id.text_ajio_build_version_number;
                                                                                                    Object object13 = view2 = dd2_2.a(n3, view);
                                                                                                    object13 = (AjioTextView)view2;
                                                                                                    if (object13 != null) {
                                                                                                        n3 = R$id.user_email;
                                                                                                        Object object14 = view2 = dd2_2.a(n3, view);
                                                                                                        object14 = (AjioTextView)view2;
                                                                                                        if (object14 != null && (view2 = dd2_2.a(n3 = R$id.user_info_jcp, view)) != null) {
                                                                                                            MyAccountTitleViewJcpBinding myAccountTitleViewJcpBinding = MyAccountTitleViewJcpBinding.bind(view2);
                                                                                                            n3 = R$id.user_name;
                                                                                                            Object object15 = view2 = dd2_2.a(n3, view);
                                                                                                            object15 = (AjioTextView)view2;
                                                                                                            if (object15 != null) {
                                                                                                                n3 = R$id.user_phone_no;
                                                                                                                Object object16 = view2 = dd2_2.a(n3, view);
                                                                                                                object16 = (AjioTextView)view2;
                                                                                                                if (object16 != null) {
                                                                                                                    n3 = R$id.userimage;
                                                                                                                    View view14 = view2 = dd2_2.a(n3, view);
                                                                                                                    view14 = (ImageView)view2;
                                                                                                                    if (view14 != null && (view2 = dd2_2.a(n3 = R$id.verify_email_layout, view)) != null) {
                                                                                                                        LayoutVerifyEmailBinding layoutVerifyEmailBinding2 = LayoutVerifyEmailBinding.bind(view2);
                                                                                                                        n3 = R$id.verify_email_layout_ucp;
                                                                                                                        view2 = dd2_2.a(n3, view);
                                                                                                                        if (view2 != null) {
                                                                                                                            LayoutVerifyEmailBinding layoutVerifyEmailBinding3 = LayoutVerifyEmailBinding.bind(view2);
                                                                                                                            n3 = R$id.version_layout;
                                                                                                                            View view15 = view2 = dd2_2.a(n3, view);
                                                                                                                            view15 = (LinearLayout)view2;
                                                                                                                            if (view15 != null && (view2 = dd2_2.a(n3 = R$id.wallet_info, view)) != null) {
                                                                                                                                LayoutRowWalletAccountBinding layoutRowWalletAccountBinding = LayoutRowWalletAccountBinding.bind(view2);
                                                                                                                                View view16 = view;
                                                                                                                                view16 = (FrameLayout)view;
                                                                                                                                NewFragmentMyAccountBinding newFragmentMyAccountBinding = new NewFragmentMyAccountBinding((FrameLayout)view16, rowMyAccountCenterBinding, (ImageView)view3, itemCmsBannerLayoutBinding, (FrameLayout)view4, (AjioButton)object2, (AjioTextView)object3, layoutVerifyEmailBinding, (LinearLayout)view5, (LinearLayout)view6, (AjioTextView)object4, (LinearLayout)view7, (NestedScrollView)object5, (InAppBottomUpdatesView)((Object)object6), (LinearLayout)view8, (FrameLayout)view9, (AjioTextView)object7, (AjioNonScrollableListView)((Object)object8), (AjioNonScrollableListView)((Object)object9), (AjioNonScrollableListView)((Object)object10), (RelativeLayout)view10, (LinearLayout)view11, refereeWidgetLayoutBinding, (ImageView)view12, (RelativeLayout)view13, (AjioButton)object11, (AjioTextView)object12, (AjioTextView)object13, (AjioTextView)object14, myAccountTitleViewJcpBinding, (AjioTextView)object15, (AjioTextView)object16, (ImageView)view14, layoutVerifyEmailBinding2, layoutVerifyEmailBinding3, (LinearLayout)view15, layoutRowWalletAccountBinding);
                                                                                                                                return newFragmentMyAccountBinding;
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
            }
        }
        object = view.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static NewFragmentMyAccountBinding inflate(LayoutInflater layoutInflater) {
        return NewFragmentMyAccountBinding.inflate(layoutInflater, null, false);
    }

    public static NewFragmentMyAccountBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.new_fragment_my_account;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return NewFragmentMyAccountBinding.bind((View)layoutInflater);
    }

    public FrameLayout getRoot() {
        return this.rootView;
    }
}

