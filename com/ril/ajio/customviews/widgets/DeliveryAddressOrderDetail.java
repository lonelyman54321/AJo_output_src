/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.text.TextUtils
 *  android.util.AttributeSet
 *  android.view.LayoutInflater
 *  android.view.ViewGroup
 *  android.widget.ImageView
 *  android.widget.LinearLayout
 */
package com.ril.ajio.customviews.widgets;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioTextView;
import com.ril.ajio.services.data.Cart.CartDeliveryAddress;
import kotlin.jvm.internal.Intrinsics;

public final class DeliveryAddressOrderDetail
extends LinearLayout {
    public static final int $stable = 8;
    private ImageView imvPickFromStore;
    private AjioTextView tvAddress;
    private AjioTextView tvName;

    public DeliveryAddressOrderDetail(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super(context);
        this.init(context);
    }

    public DeliveryAddressOrderDetail(Context context, AttributeSet attributeSet) {
        Intrinsics.checkNotNullParameter(context, "context");
        super(context, attributeSet);
        this.init(context);
    }

    public DeliveryAddressOrderDetail(Context context, AttributeSet attributeSet, int n3) {
        Intrinsics.checkNotNullParameter(context, "context");
        super(context, attributeSet, n3);
        this.init(context);
    }

    public DeliveryAddressOrderDetail(Context context, AttributeSet attributeSet, int n3, int n4) {
        Intrinsics.checkNotNullParameter(context, "context");
        super(context, attributeSet, n3, n4);
        this.init(context);
    }

    private final void init(Context context) {
        AjioTextView ajioTextView;
        context = LayoutInflater.from((Context)context);
        int n3 = R$layout.layout_delivery_address_order_detail;
        context = context.inflate(n3, (ViewGroup)this, true);
        Intrinsics.checkNotNull(context, "null cannot be cast to non-null type android.widget.LinearLayout");
        context = (LinearLayout)context;
        n3 = R$id.ldaod_tv_name;
        this.tvName = ajioTextView = (AjioTextView)context.findViewById(n3);
        n3 = R$id.ldaod_tv_address;
        this.tvAddress = ajioTextView = (AjioTextView)context.findViewById(n3);
        n3 = R$id.imv_pickfromstore;
        context = (ImageView)context.findViewById(n3);
        this.imvPickFromStore = context;
    }

    public final void setData(CartDeliveryAddress object) {
        Object object2;
        int n3;
        String string2;
        Intrinsics.checkNotNullParameter(object, "deliveryAddress");
        StringBuilder stringBuilder = new StringBuilder();
        Object object3 = ((CartDeliveryAddress)object).getFirstName();
        if (object3 != null) {
            object3 = ((CartDeliveryAddress)object).getFirstName();
            string2 = "getFirstName(...)";
            Intrinsics.checkNotNullExpressionValue(object3, string2);
            n3 = ((String)object3).length();
            if (n3 != 0) {
                object3 = ((CartDeliveryAddress)object).getFirstName();
                stringBuilder.append((String)object3);
            }
        }
        object3 = ((CartDeliveryAddress)object).getLastName();
        string2 = " ";
        if (object3 != null) {
            object3 = ((CartDeliveryAddress)object).getLastName();
            object2 = "getLastName(...)";
            Intrinsics.checkNotNullExpressionValue(object3, (String)object2);
            n3 = ((String)object3).length();
            if (n3 != 0) {
                stringBuilder.append(string2);
                object3 = ((CartDeliveryAddress)object).getLastName();
                stringBuilder.append((String)object3);
            }
        }
        object3 = this.tvName;
        object2 = null;
        if (object3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tvName");
            n3 = 0;
            object3 = null;
        }
        object3.setText((CharSequence)stringBuilder);
        object3 = "store-pickup";
        String string3 = ((CartDeliveryAddress)object).getDeliveryModeValue();
        n3 = (int)(((String)object3).equals(string3) ? 1 : 0);
        string3 = null;
        CharSequence charSequence = "imvPickFromStore";
        if (n3 != 0) {
            object3 = this.imvPickFromStore;
            if (object3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)charSequence);
                n3 = 0;
                object3 = null;
            }
            object3.setVisibility(0);
        } else {
            object3 = this.imvPickFromStore;
            if (object3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)charSequence);
                n3 = 0;
                object3 = null;
            }
            int n4 = 8;
            object3.setVisibility(n4);
        }
        Intrinsics.checkNotNullParameter(stringBuilder, "<this>");
        stringBuilder.setLength(0);
        object3 = ((CartDeliveryAddress)object).getLine1();
        n3 = (int)(TextUtils.isEmpty((CharSequence)object3) ? 1 : 0);
        if (n3 == 0) {
            object3 = ((CartDeliveryAddress)object).getLine1();
            stringBuilder.append((String)object3);
        }
        object3 = ((CartDeliveryAddress)object).getLine2();
        n3 = (int)(TextUtils.isEmpty((CharSequence)object3) ? 1 : 0);
        string3 = "\n";
        if (n3 == 0) {
            stringBuilder.append(string3);
            object3 = ((CartDeliveryAddress)object).getLine2();
            stringBuilder.append((String)object3);
        }
        if ((n3 = (int)(TextUtils.isEmpty((CharSequence)(object3 = ((CartDeliveryAddress)object).getLandmark())) ? 1 : 0)) == 0) {
            stringBuilder.append(string3);
            object3 = ((CartDeliveryAddress)object).getLandmark();
            stringBuilder.append((String)object3);
        }
        stringBuilder.append(string3);
        object3 = ((CartDeliveryAddress)object).getTown();
        n3 = (int)(TextUtils.isEmpty((CharSequence)object3) ? 1 : 0);
        if (n3 == 0) {
            object3 = ((CartDeliveryAddress)object).getTown();
            stringBuilder.append((String)object3);
            stringBuilder.append(string3);
        }
        if ((n3 = (int)(TextUtils.isEmpty((CharSequence)(object3 = ((CartDeliveryAddress)object).getDistrict())) ? 1 : 0)) == 0) {
            object3 = ((CartDeliveryAddress)object).getDistrict();
            stringBuilder.append((String)object3);
            object3 = ", ";
            stringBuilder.append((String)object3);
        }
        if ((n3 = (int)(TextUtils.isEmpty((CharSequence)(object3 = ((CartDeliveryAddress)object).getState())) ? 1 : 0)) == 0) {
            object3 = ((CartDeliveryAddress)object).getState();
            stringBuilder.append((String)object3);
        }
        if ((n3 = (int)(TextUtils.isEmpty((CharSequence)(object3 = ((CartDeliveryAddress)object).getPostalCode())) ? 1 : 0)) == 0) {
            object3 = ((CartDeliveryAddress)object).getPostalCode();
            charSequence = new StringBuilder(string2);
            ((StringBuilder)charSequence).append((String)object3);
            object3 = ((StringBuilder)charSequence).toString();
            stringBuilder.append((String)object3);
        }
        if ((n3 = (int)(TextUtils.isEmpty((CharSequence)(object3 = ((CartDeliveryAddress)object).getPhone())) ? 1 : 0)) == 0) {
            stringBuilder.append(string3);
            object3 = "Mobile ";
            stringBuilder.append((String)object3);
            object = ((CartDeliveryAddress)object).getPhone();
            stringBuilder.append((String)object);
        }
        if ((object = this.tvAddress) == null) {
            object = "tvAddress";
            Intrinsics.throwUninitializedPropertyAccessException((String)object);
        } else {
            object2 = object;
        }
        object2.setText((CharSequence)stringBuilder);
    }
}

