/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.EditText
 *  android.widget.ImageView
 *  android.widget.LinearLayout
 *  android.widget.RelativeLayout
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.AjioLoaderView;
import com.ril.ajio.customviews.widgets.AjioTextView;

public final class PesdkCodCaptchaDialogBinding
implements BC3 {
    public final EditText codDialogEtCaptcha;
    public final ImageView codDialogImvCaptcha;
    public final ImageView codDialogImvRefresh;
    public final AjioLoaderView codDialogProgressLoader;
    public final AjioTextView codDialogTvPlaceorder;
    public final AjioTextView codFrictionTv;
    public final ImageView codPopupClose;
    public final LinearLayout codPopupLayout;
    public final LinearLayout codPopupNotification;
    public final AjioTextView codPopupTvNotification;
    public final AjioTextView codTvErrorCaptch;
    private final RelativeLayout rootView;

    private PesdkCodCaptchaDialogBinding(RelativeLayout relativeLayout, EditText editText, ImageView imageView, ImageView imageView2, AjioLoaderView ajioLoaderView, AjioTextView ajioTextView, AjioTextView ajioTextView2, ImageView imageView3, LinearLayout linearLayout, LinearLayout linearLayout2, AjioTextView ajioTextView3, AjioTextView ajioTextView4) {
        this.rootView = relativeLayout;
        this.codDialogEtCaptcha = editText;
        this.codDialogImvCaptcha = imageView;
        this.codDialogImvRefresh = imageView2;
        this.codDialogProgressLoader = ajioLoaderView;
        this.codDialogTvPlaceorder = ajioTextView;
        this.codFrictionTv = ajioTextView2;
        this.codPopupClose = imageView3;
        this.codPopupLayout = linearLayout;
        this.codPopupNotification = linearLayout2;
        this.codPopupTvNotification = ajioTextView3;
        this.codTvErrorCaptch = ajioTextView4;
    }

    public static PesdkCodCaptchaDialogBinding bind(View object) {
        View view;
        int n3 = R$id.cod_dialog_et_captcha;
        View view2 = view = dd2_2.a(n3, object);
        view2 = (EditText)view;
        if (view2 != null) {
            n3 = R$id.cod_dialog_imv_captcha;
            View view3 = view = dd2_2.a(n3, object);
            view3 = (ImageView)view;
            if (view3 != null) {
                n3 = R$id.cod_dialog_imv_refresh;
                View view4 = view = dd2_2.a(n3, object);
                view4 = (ImageView)view;
                if (view4 != null) {
                    n3 = R$id.cod_dialog_progress_loader;
                    Object object2 = view = dd2_2.a(n3, object);
                    object2 = (AjioLoaderView)view;
                    if (object2 != null) {
                        n3 = R$id.cod_dialog_tv_placeorder;
                        Object object3 = view = dd2_2.a(n3, object);
                        object3 = (AjioTextView)view;
                        if (object3 != null) {
                            n3 = R$id.cod_friction_tv;
                            Object object4 = view = dd2_2.a(n3, object);
                            object4 = (AjioTextView)view;
                            if (object4 != null) {
                                n3 = R$id.cod_popup_close;
                                View view5 = view = dd2_2.a(n3, object);
                                view5 = (ImageView)view;
                                if (view5 != null) {
                                    n3 = R$id.cod_popup_layout;
                                    View view6 = view = dd2_2.a(n3, object);
                                    view6 = (LinearLayout)view;
                                    if (view6 != null) {
                                        n3 = R$id.cod_popup_notification;
                                        View view7 = view = dd2_2.a(n3, object);
                                        view7 = (LinearLayout)view;
                                        if (view7 != null) {
                                            n3 = R$id.cod_popup_tv_notification;
                                            Object object5 = view = dd2_2.a(n3, object);
                                            object5 = (AjioTextView)view;
                                            if (object5 != null) {
                                                n3 = R$id.cod_tv_error_captch;
                                                Object object6 = view = dd2_2.a(n3, object);
                                                object6 = (AjioTextView)view;
                                                if (object6 != null) {
                                                    Object object7 = object;
                                                    object7 = (RelativeLayout)object;
                                                    PesdkCodCaptchaDialogBinding pesdkCodCaptchaDialogBinding = new PesdkCodCaptchaDialogBinding((RelativeLayout)object7, (EditText)view2, (ImageView)view3, (ImageView)view4, (AjioLoaderView)((Object)object2), (AjioTextView)object3, (AjioTextView)object4, (ImageView)view5, (LinearLayout)view6, (LinearLayout)view7, (AjioTextView)object5, (AjioTextView)object6);
                                                    return pesdkCodCaptchaDialogBinding;
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
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static PesdkCodCaptchaDialogBinding inflate(LayoutInflater layoutInflater) {
        return PesdkCodCaptchaDialogBinding.inflate(layoutInflater, null, false);
    }

    public static PesdkCodCaptchaDialogBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.pesdk_cod_captcha_dialog;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return PesdkCodCaptchaDialogBinding.bind((View)layoutInflater);
    }

    public RelativeLayout getRoot() {
        return this.rootView;
    }
}

