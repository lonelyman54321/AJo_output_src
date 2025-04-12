/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Dialog
 *  android.content.Context
 *  android.content.DialogInterface$OnShowListener
 *  android.os.Build$VERSION
 *  android.os.Bundle
 *  android.os.Handler
 *  android.os.Looper
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.widget.CompoundButton$OnCheckedChangeListener
 *  android.widget.ImageView
 *  android.widget.LinearLayout
 *  android.widget.RadioButton
 *  android.widget.RadioGroup
 */
package com.ril.ajio.myaccount.order.fragment;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.myaccount.order.fragment.a$a;
import com.ril.ajio.services.data.Order.orderhistory.DateRangeItem;
import java.util.ArrayList;
import kotlin.collections.IndexedValue;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.b;

public final class a
extends k51_0 {
    public static final a$a Companion;
    public ArrayList f;
    public String g;
    public RadioGroup h;
    public final gi0_2 i;

    static {
        a$a a$a;
        Companion = a$a = new Object();
    }

    public a() {
        gi0_2 gi0_22;
        this.i = gi0_22 = new gi0_2(this);
    }

    public final void onCreate(Bundle object) {
        super.onCreate((Bundle)object);
        object = this.getArguments();
        if (object != null) {
            int n3 = Build.VERSION.SDK_INT;
            int n4 = 33;
            Object object2 = n3 >= n4 ? ci0_1.a(object) : object.getParcelableArrayList("dateRange");
            this.f = object2;
            object2 = "currentDateRange";
            object = object.getString((String)object2);
            this.g = object;
        }
    }

    public final Dialog onCreateDialog(Bundle object) {
        object = super.onCreateDialog((Bundle)object);
        Intrinsics.checkNotNull(object, "null cannot be cast to non-null type com.google.android.material.bottomsheet.BottomSheetDialog");
        object = (BottomSheetDialog)object;
        fi0_2 fi0_22 = new fi0_2((BottomSheetDialog)object);
        object.setOnShowListener((DialogInterface.OnShowListener)fi0_22);
        return object;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "inflater");
        int n3 = R$layout.fragment_date_range_bottom_sheet;
        return layoutInflater.inflate(n3, viewGroup, false);
    }

    public final void onViewCreated(View view, Bundle object) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, (Bundle)object);
        int n3 = R$id.fdrbsRGOption;
        object = (RadioGroup)view.findViewById(n3);
        this.h = object;
        n3 = R$id.fdrbsLayoutContent;
        object = view.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(object, "findViewById(...)");
        object = (LinearLayout)object;
        Object object2 = Looper.getMainLooper();
        Handler handler = new Handler(object2);
        object2 = new di0_0((LinearLayout)object);
        long l2 = 100;
        handler.postDelayed((Runnable)object2, l2);
        object = this.f;
        if (object != null) {
            boolean bl2;
            object = ((ArrayList)object).iterator();
            Intrinsics.checkNotNullExpressionValue(object, "iterator(...)");
            Intrinsics.checkNotNullParameter(object, "<this>");
            Intrinsics.checkNotNullParameter(object, "iterator");
            handler = LayoutInflater.from((Context)view.getContext());
            object2 = this.h;
            String string2 = "layoutContent";
            if (object2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string2);
                object2 = null;
            }
            object2.removeAllViews();
            object2 = null;
            int n4 = 0;
            String string3 = null;
            while (bl2 = object.hasNext()) {
                int n7 = n4 + 1;
                if (n4 >= 0) {
                    Object object3 = object.next();
                    Object object4 = new IndexedValue(n4, object3);
                    string3 = "<get-value>(...)";
                    object3 = ((IndexedValue)object4).b;
                    Intrinsics.checkNotNullExpressionValue(object3, string3);
                    object3 = (DateRangeItem)object3;
                    n4 = R$layout.layout_date_range_option;
                    Object object5 = this.h;
                    if (object5 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(string2);
                        object5 = null;
                    }
                    string3 = handler.inflate(n4, (ViewGroup)object5, false);
                    Intrinsics.checkNotNull(string3, "null cannot be cast to non-null type android.widget.RadioButton");
                    object5 = string3;
                    object5 = (RadioButton)string3;
                    bl2 = ((IndexedValue)object4).a;
                    object5.setId((int)(bl2 ? 1 : 0));
                    object4 = ((DateRangeItem)object3).getKey();
                    object5.setTag(object4);
                    object4 = ((DateRangeItem)object3).getValue();
                    object5.setText((CharSequence)object4);
                    object4 = this.g;
                    if (object4 != null && (bl2 = (boolean)kotlin.text.b.i((String)object4, (String)(object3 = ((DateRangeItem)object3).getKey()), false))) {
                        bl2 = true;
                        object5.setChecked(bl2);
                        object5.setEnabled(false);
                    } else {
                        object5.setChecked(false);
                        object4 = this.i;
                        object5.setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener)object4);
                    }
                    object4 = this.h;
                    if (object4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(string2);
                        bl2 = false;
                        object4 = null;
                    }
                    object4.addView((View)string3);
                    n4 = n7;
                    continue;
                }
                xx_2.n();
                throw null;
            }
        }
        n3 = R$id.fdrbsIvClose;
        view = (ImageView)view.findViewById(n3);
        object = new ei0_1(this);
        view.setOnClickListener((View.OnClickListener)object);
    }
}

