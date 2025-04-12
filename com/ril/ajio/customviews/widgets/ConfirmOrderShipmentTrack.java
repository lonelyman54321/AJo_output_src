/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.text.SpannableString
 *  android.text.TextUtils
 *  android.text.style.StrikethroughSpan
 *  android.util.AttributeSet
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.TextView
 */
package com.ril.ajio.customviews.widgets;

import android.content.Context;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.StrikethroughSpan;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.R$string;
import kotlin.jvm.internal.Intrinsics;

public final class ConfirmOrderShipmentTrack
extends ConstraintLayout {
    public static final int $stable = 8;
    private View trackArriving;
    private View trackConfirm;
    private View trackShipped;
    private TextView tvArriving;
    private TextView tvConfirm;
    private TextView tvShipped;
    private View vTrackGreenLine;

    public ConfirmOrderShipmentTrack(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super(context);
        this.init(context);
    }

    public ConfirmOrderShipmentTrack(Context context, AttributeSet attributeSet) {
        Intrinsics.checkNotNullParameter(context, "context");
        super(context, attributeSet);
        this.init(context);
    }

    public ConfirmOrderShipmentTrack(Context context, AttributeSet attributeSet, int n3) {
        Intrinsics.checkNotNullParameter(context, "context");
        super(context, attributeSet, n3);
        this.init(context);
    }

    public ConfirmOrderShipmentTrack(Context context, AttributeSet attributeSet, int n3, int n4) {
        Intrinsics.checkNotNullParameter(context, "context");
        super(context, attributeSet, n3);
        this.init(context);
    }

    private final SpannableString getDateSpannable(String string2, String string3, boolean bl2) {
        String string4 = "\n";
        string3 = n1.a(string2, string4, string3);
        SpannableString spannableString = new SpannableString((CharSequence)string3);
        if (bl2) {
            string3 = new StrikethroughSpan();
            int n3 = string2.length();
            int n4 = spannableString.length();
            int n7 = 33;
            spannableString.setSpan((Object)string3, n3, n4, n7);
        }
        return spannableString;
    }

    private final void init(Context object) {
        View view;
        object = LayoutInflater.from((Context)object);
        int n3 = R$layout.layout_confirm_track_shipment;
        object = object.inflate(n3, (ViewGroup)this, true);
        Intrinsics.checkNotNull(object, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout");
        object = (ConstraintLayout)((Object)object);
        n3 = R$id.lts_v_green_line;
        this.vTrackGreenLine = view = object.findViewById(n3);
        n3 = R$id.track_confirmed;
        this.trackConfirm = view = object.findViewById(n3);
        n3 = R$id.tv_confirmed;
        view = (TextView)object.findViewById(n3);
        this.tvConfirm = view;
        n3 = R$id.track_shipped;
        this.trackShipped = view = object.findViewById(n3);
        n3 = R$id.tv_shipped;
        view = (TextView)object.findViewById(n3);
        this.tvShipped = view;
        n3 = R$id.track_arriving;
        this.trackArriving = view = object.findViewById(n3);
        n3 = R$id.tv_arriving;
        object = (TextView)object.findViewById(n3);
        this.tvArriving = object;
    }

    public final void setShipmentTracking(Long object, Long object2, String string2, String string3, String string4) {
        int n3;
        long l2;
        long l3;
        StringBuilder stringBuilder;
        int n4;
        boolean bl2 = TextUtils.isEmpty((CharSequence)string2);
        String string5 = "tvConfirm";
        String string6 = null;
        if (bl2) {
            string2 = this.tvConfirm;
            if (string2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string5);
                string2 = null;
            }
            int n7 = R$string.confirmed;
            string3 = hv3_0.K(n7);
            string2.setText((CharSequence)string3);
        } else {
            string3 = this.tvConfirm;
            if (string3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string5);
                boolean bl3 = false;
                string3 = null;
            }
            n4 = R$string.confirmed;
            string5 = hv3_0.K(n4);
            if (string2 == null) {
                string2 = "";
            }
            string2 = k7.m(string2);
            stringBuilder = new StringBuilder();
            stringBuilder.append(string5);
            string5 = "\n";
            stringBuilder.append(string5);
            stringBuilder.append(string2);
            string2 = stringBuilder.toString();
            string3.setText((CharSequence)string2);
        }
        string2 = "dd MMM";
        boolean bl4 = false;
        string3 = null;
        n4 = 1;
        if (object != null) {
            int n8;
            l3 = (Long)object;
            long l4 = l3 - (l2 = System.currentTimeMillis());
            Object object3 = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
            if (object3 < 0) {
                n8 = 1;
            } else {
                n8 = 0;
                stringBuilder = null;
            }
            int n10 = R$string.shipped;
            String string7 = hv3_0.K(n10);
            l2 = (Long)object;
            object = k7.f(l2, string2);
            TextView textView = this.tvShipped;
            String string8 = "tvShipped";
            if (textView == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string8);
                textView = null;
            }
            object = this.getDateSpannable(string7, (String)object, n8 != 0);
            textView.setText((CharSequence)object);
            object = this.tvShipped;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string8);
                n3 = 0;
                object = null;
            }
            n8 = 8;
            object.setVisibility(n8);
        }
        if (string4 != null && (n3 = (int)(string4.equalsIgnoreCase((String)(object = "store-pickup")) ? 1 : 0)) != 0) {
            n3 = R$string.store_pickup;
            object = hv3_0.K(n3);
        } else {
            n3 = R$string.arriving;
            object = hv3_0.K(n3);
        }
        if (object2 != null) {
            boolean bl5;
            l3 = (Long)object2;
            long l7 = l3 - (l2 = System.currentTimeMillis());
            Object object4 = l7 == 0L ? 0 : (l7 < 0L ? -1 : 1);
            if (object4 < 0) {
                bl5 = true;
            }
            l3 = (Long)object2;
            object2 = k7.f(l3, string2);
            string2 = this.tvArriving;
            if (string2 == null) {
                string2 = "tvArriving";
                Intrinsics.throwUninitializedPropertyAccessException(string2);
            } else {
                string6 = string2;
            }
            object = this.getDateSpannable((String)object, (String)object2, bl5);
            string6.setText((CharSequence)object);
        }
    }
}

