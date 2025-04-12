/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Intent
 *  android.os.Bundle
 *  android.text.TextWatcher
 *  android.view.MenuItem
 *  android.view.View$OnClickListener
 *  android.widget.LinearLayout
 *  android.widget.RelativeLayout
 */
package com.ril.ajio.myaccount.order;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextWatcher;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.widget.Toolbar;
import androidx.lifecycle.E$b;
import androidx.lifecycle.LiveData;
import com.ril.ajio.R$color;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.R$string;
import com.ril.ajio.customviews.widgets.AjioButton;
import com.ril.ajio.customviews.widgets.AjioCustomToolbar;
import com.ril.ajio.customviews.widgets.AjioEditText;
import com.ril.ajio.customviews.widgets.AjioProgressView;
import com.ril.ajio.customviews.widgets.AjioTextView;
import com.ril.ajio.myaccount.order.MarkDeliveredActivity$a;
import com.ril.ajio.myaccount.order.MarkDeliveredActivity$b;
import com.ril.ajio.myaccount.order.a;
import com.ril.ajio.services.data.Order.Consignment;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

public class MarkDeliveredActivity
extends s51_0 {
    public static final /* synthetic */ int F0;
    public String A0;
    public String B0;
    public String C0;
    public Consignment D0;
    public db2_1 E0;
    public AjioEditText p0;
    public AjioEditText q0;
    public AjioEditText r0;
    public String s0;
    public String t0;
    public String u0;
    public String v0;
    public AjioButton w0;
    public AjioProgressView x0;
    public AjioTextView y0;
    public LinearLayout z0;

    public final void onBackPressed() {
        super.onBackPressed();
        this.finish();
    }

    public final void onCreate(Bundle object) {
        super.onCreate((Bundle)object);
        int n3 = R$layout.activity_mark_delivered;
        this.setContentView(n3);
        object = "owner";
        Intrinsics.checkNotNullParameter(this, (String)object);
        Object object2 = this.getViewModelStore();
        Intrinsics.checkNotNullParameter(this, (String)object);
        Object object3 = this.getDefaultViewModelProviderFactory();
        Intrinsics.checkNotNullParameter(this, (String)object);
        object = this.getDefaultViewModelCreationExtras();
        Intrinsics.checkNotNullParameter(object2, "store");
        Intrinsics.checkNotNullParameter(object3, "factory");
        object = li_2.a((Wd0)object, "defaultCreationExtras", (rd3_0)object2, (E$b)object3, (Wd0)object);
        object2 = db2_1.class;
        object3 = "modelClass";
        Intrinsics.checkNotNullParameter(object2, (String)object3);
        String string2 = "<this>";
        Intrinsics.checkNotNullParameter(object2, string2);
        object2 = Reflection.getOrCreateKotlinClass((Class)object2);
        Intrinsics.checkNotNullParameter(object2, (String)object3);
        Intrinsics.checkNotNullParameter(object2, (String)object3);
        Intrinsics.checkNotNullParameter(object2, string2);
        object3 = object2.getQualifiedName();
        if (object3 != null) {
            int n4;
            string2 = "androidx.lifecycle.ViewModelProvider.DefaultKey:";
            object3 = string2.concat((String)object3);
            this.E0 = object = (db2_1)((pD3)object).a((yn1_2)object2, (String)object3);
            object = this.getIntent();
            n3 = (int)(object.hasExtra((String)(object2 = "CONSIGNMENT_DATA")) ? 1 : 0);
            if (n3 != 0) {
                object = this.getIntent();
                object3 = Consignment.class;
                this.D0 = object = (Consignment)cp_1.N((Intent)object, (String)object2, object3);
            }
            if ((n3 = (int)((object = this.getIntent()).hasExtra((String)(object2 = "product_code")) ? 1 : 0)) != 0) {
                this.A0 = object = this.getIntent().getStringExtra((String)object2);
            }
            if ((n3 = (int)((object = this.getIntent()).hasExtra((String)(object2 = "consignment_code")) ? 1 : 0)) != 0) {
                this.B0 = object = this.getIntent().getStringExtra((String)object2);
            }
            if ((n3 = (int)((object = this.getIntent()).hasExtra((String)(object2 = "SELECTED_SHIPMENT")) ? 1 : 0)) != 0) {
                this.C0 = object = this.getIntent().getStringExtra((String)object2);
            }
            object = this.E0.h;
            object2 = new a(this);
            ((LiveData)object).e(this, (F62)object2);
            n3 = R$id.toolbar;
            object = (AjioCustomToolbar)this.findViewById(n3);
            this.setSupportActionBar((Toolbar)object);
            object = this.getSupportActionBar();
            if (object != null) {
                this.getSupportActionBar().n(true);
                object = this.getSupportActionBar();
                n4 = R$string.title_activity_mark_delivered;
                object2 = hv3_0.K(n4);
                ((ActionBar)object).x((String)object2);
            }
            n3 = R$id.mark_delivered_progress_bar;
            object = (AjioProgressView)this.findViewById(n3);
            this.x0 = object;
            n3 = R$id.tv_invoice_error_message;
            this.y0 = object = (AjioTextView)this.findViewById(n3);
            n3 = R$id.btn_markdelivered_proceed_to_exchange;
            this.w0 = object = (AjioButton)this.findViewById(n3);
            n3 = R$id.where_to_find_invoicenumber_layout;
            object = (RelativeLayout)this.findViewById(n3);
            n4 = R$id.et_invoice_number1;
            object2 = (AjioEditText)this.findViewById(n4);
            int n7 = R$id.et_invoice_number2;
            this.p0 = object3 = (AjioEditText)this.findViewById(n7);
            n7 = R$id.et_invoice_number3;
            this.q0 = object3 = (AjioEditText)this.findViewById(n7);
            n7 = R$id.et_invoice_number4;
            this.r0 = object3 = (AjioEditText)this.findViewById(n7);
            n7 = hv3_0.m(R$color.color_b19975);
            object2.setTextColor(n7);
            object3 = new MarkDeliveredActivity$a(this, (AjioEditText)object2);
            object2.addTextChangedListener((TextWatcher)object3);
            object2 = this.p0;
            n7 = hv3_0.m(R$color.color_b19975);
            object2.setTextColor(n7);
            object2 = this.p0;
            object3 = new MarkDeliveredActivity$a(this, (AjioEditText)object2);
            object2.addTextChangedListener((TextWatcher)object3);
            object2 = this.q0;
            n7 = hv3_0.m(R$color.color_b19975);
            object2.setTextColor(n7);
            object2 = this.q0;
            object3 = new MarkDeliveredActivity$a(this, (AjioEditText)object2);
            object2.addTextChangedListener((TextWatcher)object3);
            object2 = this.r0;
            n7 = hv3_0.m(R$color.color_b19975);
            object2.setTextColor(n7);
            object2 = this.r0;
            object3 = new MarkDeliveredActivity$a(this, (AjioEditText)object2);
            object2.addTextChangedListener((TextWatcher)object3);
            object2 = new gh1_1(this);
            object.setOnClickListener((View.OnClickListener)object2);
            object = this.w0;
            object2 = new MarkDeliveredActivity$b(this);
            object.setOnClickListener((View.OnClickListener)object2);
            return;
        }
        object2 = "Local and anonymous classes can not be ViewModels".toString();
        object = new IllegalArgumentException((String)object2);
        throw object;
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        int n3;
        int n4 = menuItem.getItemId();
        if (n4 == (n3 = 16908332)) {
            this.finish();
        }
        return super.onOptionsItemSelected(menuItem);
    }
}

