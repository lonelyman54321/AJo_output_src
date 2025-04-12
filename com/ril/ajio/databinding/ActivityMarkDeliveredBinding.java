/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.ImageView
 *  android.widget.LinearLayout
 *  android.widget.RelativeLayout
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioButton;
import com.ril.ajio.customviews.widgets.AjioCustomToolbar;
import com.ril.ajio.customviews.widgets.AjioEditText;
import com.ril.ajio.customviews.widgets.AjioProgressView;
import com.ril.ajio.customviews.widgets.AjioTextView;

public final class ActivityMarkDeliveredBinding
implements BC3 {
    public final RelativeLayout activityReturnExchangeItemsList;
    public final AjioButton btnMarkdeliveredProceedToExchange;
    public final AjioEditText etInvoiceNumber1;
    public final AjioEditText etInvoiceNumber2;
    public final AjioEditText etInvoiceNumber3;
    public final AjioEditText etInvoiceNumber4;
    public final LinearLayout invoiceNumberEntryLayout;
    public final ImageView ivInvoice;
    public final AjioProgressView markDeliveredProgressBar;
    public final LinearLayout notification;
    public final AjioTextView notificationText;
    private final RelativeLayout rootView;
    public final AjioCustomToolbar toolbar;
    public final LinearLayout toolbarlayout;
    public final AjioTextView tvInvoiceErrorMessage;
    public final AjioTextView tvInvoiceNumberMessage;
    public final AjioTextView tvProceedReturnExchnageInfo;
    public final RelativeLayout whereToFindInvoicenumberLayout;

    private ActivityMarkDeliveredBinding(RelativeLayout relativeLayout, RelativeLayout relativeLayout2, AjioButton ajioButton, AjioEditText ajioEditText, AjioEditText ajioEditText2, AjioEditText ajioEditText3, AjioEditText ajioEditText4, LinearLayout linearLayout, ImageView imageView, AjioProgressView ajioProgressView, LinearLayout linearLayout2, AjioTextView ajioTextView, AjioCustomToolbar ajioCustomToolbar, LinearLayout linearLayout3, AjioTextView ajioTextView2, AjioTextView ajioTextView3, AjioTextView ajioTextView4, RelativeLayout relativeLayout3) {
        this.rootView = relativeLayout;
        this.activityReturnExchangeItemsList = relativeLayout2;
        this.btnMarkdeliveredProceedToExchange = ajioButton;
        this.etInvoiceNumber1 = ajioEditText;
        this.etInvoiceNumber2 = ajioEditText2;
        this.etInvoiceNumber3 = ajioEditText3;
        this.etInvoiceNumber4 = ajioEditText4;
        this.invoiceNumberEntryLayout = linearLayout;
        this.ivInvoice = imageView;
        this.markDeliveredProgressBar = ajioProgressView;
        this.notification = linearLayout2;
        this.notificationText = ajioTextView;
        this.toolbar = ajioCustomToolbar;
        this.toolbarlayout = linearLayout3;
        this.tvInvoiceErrorMessage = ajioTextView2;
        this.tvInvoiceNumberMessage = ajioTextView3;
        this.tvProceedReturnExchnageInfo = ajioTextView4;
        this.whereToFindInvoicenumberLayout = relativeLayout3;
    }

    public static ActivityMarkDeliveredBinding bind(View view) {
        RelativeLayout relativeLayout;
        AjioTextView ajioTextView;
        AjioTextView ajioTextView2;
        AjioTextView ajioTextView3;
        LinearLayout linearLayout;
        AjioCustomToolbar ajioCustomToolbar;
        AjioTextView ajioTextView4;
        LinearLayout linearLayout2;
        AjioProgressView ajioProgressView;
        ImageView imageView;
        LinearLayout linearLayout3;
        AjioEditText ajioEditText;
        AjioEditText ajioEditText2;
        AjioEditText ajioEditText3;
        AjioEditText ajioEditText4;
        Object object = view;
        View view2 = view;
        view2 = (RelativeLayout)view;
        int n3 = R$id.btn_markdelivered_proceed_to_exchange;
        AjioButton ajioButton = (AjioButton)dd2_2.a(n3, view);
        if (ajioButton != null && (ajioEditText4 = (AjioEditText)dd2_2.a(n3 = R$id.et_invoice_number1, view)) != null && (ajioEditText3 = (AjioEditText)dd2_2.a(n3 = R$id.et_invoice_number2, view)) != null && (ajioEditText2 = (AjioEditText)dd2_2.a(n3 = R$id.et_invoice_number3, view)) != null && (ajioEditText = (AjioEditText)dd2_2.a(n3 = R$id.et_invoice_number4, view)) != null && (linearLayout3 = (LinearLayout)dd2_2.a(n3 = R$id.invoice_number_entry_layout, view)) != null && (imageView = (ImageView)dd2_2.a(n3 = R$id.iv_invoice, view)) != null && (ajioProgressView = (AjioProgressView)dd2_2.a(n3 = R$id.mark_delivered_progress_bar, view)) != null && (linearLayout2 = (LinearLayout)dd2_2.a(n3 = R$id.notification, view)) != null && (ajioTextView4 = (AjioTextView)dd2_2.a(n3 = R$id.notification_text, view)) != null && (ajioCustomToolbar = (AjioCustomToolbar)dd2_2.a(n3 = R$id.toolbar, view)) != null && (linearLayout = (LinearLayout)dd2_2.a(n3 = R$id.toolbarlayout, view)) != null && (ajioTextView3 = (AjioTextView)dd2_2.a(n3 = R$id.tv_invoice_error_message, view)) != null && (ajioTextView2 = (AjioTextView)dd2_2.a(n3 = R$id.tv_invoice_number_message, view)) != null && (ajioTextView = (AjioTextView)dd2_2.a(n3 = R$id.tv_proceed_return_exchnage_info, view)) != null && (relativeLayout = (RelativeLayout)dd2_2.a(n3 = R$id.where_to_find_invoicenumber_layout, view)) != null) {
            ActivityMarkDeliveredBinding activityMarkDeliveredBinding;
            object = activityMarkDeliveredBinding;
            View view3 = view2;
            activityMarkDeliveredBinding = new ActivityMarkDeliveredBinding((RelativeLayout)view2, (RelativeLayout)view2, ajioButton, ajioEditText4, ajioEditText3, ajioEditText2, ajioEditText, linearLayout3, imageView, ajioProgressView, linearLayout2, ajioTextView4, ajioCustomToolbar, linearLayout, ajioTextView3, ajioTextView2, ajioTextView, relativeLayout);
            return activityMarkDeliveredBinding;
        }
        object = view.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static ActivityMarkDeliveredBinding inflate(LayoutInflater layoutInflater) {
        return ActivityMarkDeliveredBinding.inflate(layoutInflater, null, false);
    }

    public static ActivityMarkDeliveredBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.activity_mark_delivered;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return ActivityMarkDeliveredBinding.bind((View)layoutInflater);
    }

    public RelativeLayout getRoot() {
        return this.rootView;
    }
}

