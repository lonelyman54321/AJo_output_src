/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Intent
 *  android.os.Handler
 *  android.os.Looper
 *  android.view.animation.Animation
 *  android.view.animation.TranslateAnimation
 *  android.widget.LinearLayout
 *  android.widget.TextView
 */
package com.ril.ajio.myaccount.order;

import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.ajio.ril.core.network.model.DataError$ErrorMessage;
import com.ril.ajio.R$id;
import com.ril.ajio.R$integer;
import com.ril.ajio.R$string;
import com.ril.ajio.customviews.widgets.AjioTextView;
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.myaccount.order.MarkDeliveredActivity;
import com.ril.ajio.myaccount.order.MarkDeliveredActivity$1;
import com.ril.ajio.myaccount.order.MarkDeliveredActivity$2;
import com.ril.ajio.services.data.returnexchange.InvoiceCheckData;
import java.io.Serializable;

public final class a
implements F62 {
    public final /* synthetic */ MarkDeliveredActivity a;

    public /* synthetic */ a(MarkDeliveredActivity markDeliveredActivity) {
        this.a = markDeliveredActivity;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void onChanged(Object object) {
        int n3 = 1;
        Object object2 = null;
        object = (DataCallback)object;
        MarkDeliveredActivity markDeliveredActivity = this.a;
        markDeliveredActivity.getClass();
        Object object3 = cp_1.Companion;
        int n4 = nn_2.b((cp$a)object3, (DataCallback)object);
        if (n4 == 0) return;
        markDeliveredActivity.x0.dismiss();
        object3 = ((DataCallback)object).getData();
        if (object3 != null) {
            object3 = ((InvoiceCheckData)(object = (InvoiceCheckData)((DataCallback)object).getData())).getErrors();
            if (object3 != null && (n4 = ((String)(object3 = ((InvoiceCheckData)object).getErrors())).isEmpty()) == 0) {
                markDeliveredActivity.y0.setVisibility(0);
                AjioTextView ajioTextView = markDeliveredActivity.y0;
                object = ((InvoiceCheckData)object).getErrors().trim();
                ajioTextView.setText((CharSequence)object);
                return;
            }
            object = markDeliveredActivity.y0;
            float f5 = 1.1E-44f;
            object.setVisibility(8);
            int n7 = R$string.invoice_validated_message;
            object = markDeliveredActivity.getString(n7);
            n4 = R$string.acc_alert_message;
            object3 = hv3_0.K(n4);
            Object[] objectArray = new Object[n3];
            objectArray[0] = object;
            String string2 = String.format((String)object3, objectArray);
            mq0_2.b((String)object, string2);
            object = new Intent();
            object2 = markDeliveredActivity.A0;
            object.putExtra("product_code", (String)object2);
            object2 = markDeliveredActivity.D0;
            object.putExtra("CONSIGNMENT_DATA", (Serializable)object2);
            object2 = markDeliveredActivity.B0;
            object.putExtra("consignment_code", (String)object2);
            String string3 = "SELECTED_SHIPMENT";
            object2 = markDeliveredActivity.C0;
            object.putExtra(string3, (String)object2);
            n3 = -1;
            markDeliveredActivity.setResult(n3, (Intent)object);
            markDeliveredActivity.finish();
            return;
        }
        object3 = ((DataCallback)object).getError();
        if (object3 == null) return;
        object = ((DataError$ErrorMessage)((DataCallback)object).getError().getErrors().get(0)).getMessage();
        object3 = hv3_0.K(R$string.acc_error_message);
        Object[] objectArray = new Object[n3];
        objectArray[0] = object;
        String string4 = String.format((String)object3, objectArray);
        n4 = (int)(markDeliveredActivity.isFinishing() ? 1 : 0);
        if (n4 != 0) {
            return;
        }
        n4 = R$id.notification;
        object3 = (LinearLayout)markDeliveredActivity.findViewById(n4);
        markDeliveredActivity.z0 = object3;
        n4 = R$id.notification_text;
        object3 = (TextView)markDeliveredActivity.findViewById(n4);
        cp_1 cp_12 = cp$a.e();
        cp_12.getClass();
        int n8 = cp_1.f();
        n8 = n8 != 0 ? hv3_0.w(R$integer.notification_anim_delay_accesibility) : hv3_0.w(R$integer.notification_anim_delay);
        long l2 = n8;
        cp_1 cp_13 = cp$a.e();
        cp_13.getClass();
        int n10 = cp_1.f();
        n10 = n10 != 0 ? hv3_0.w(R$integer.notification_anim_post_release_delay_accesibility) : hv3_0.w(R$integer.notification_anim_post_release_delay);
        long l3 = n10;
        if (object != null) {
            object3.setText((CharSequence)object);
        } else {
            int n14 = R$string.pdp_details_not_available;
            object = hv3_0.K(n14);
            object3.setText((CharSequence)object);
        }
        n4 = -1027080192;
        float f6 = -100.0f;
        object = new TranslateAnimation(0.0f, 0.0f, f6, 0.0f);
        object.setDuration(l2);
        markDeliveredActivity.z0.setVisibility(0);
        object3 = Looper.getMainLooper();
        object2 = new Handler((Looper)object3);
        object3 = new MarkDeliveredActivity$1(markDeliveredActivity, string4);
        long l4 = 100;
        object2.postDelayed((Runnable)object3, l4);
        LinearLayout linearLayout = markDeliveredActivity.z0;
        object2 = new MarkDeliveredActivity$2(markDeliveredActivity, l2);
        linearLayout.postDelayed((Runnable)object2, l3);
        LinearLayout linearLayout2 = markDeliveredActivity.z0;
        linearLayout2.startAnimation((Animation)object);
    }
}

