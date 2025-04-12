/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.drawable.Drawable
 *  android.text.TextUtils
 *  android.view.View
 *  android.widget.TextView
 */
package com.ril.ajio.ondemand.customercare.view.viewholder;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.ril.ajio.R$drawable;
import com.ril.ajio.R$id;
import com.ril.ajio.ondemand.customercare.view.common.UiCCComponent;
import com.ril.ajio.services.data.CustomerCare.CCTicketCreated;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

public final class CCItemHelpAlertViewHolderRefresh
extends uv_2 {
    private final TextView contentTv;
    private final View row;
    private final TextView subTitleTv;
    private final TextView titleTv;

    public CCItemHelpAlertViewHolderRefresh(View view, i82_0 i82_02) {
        Intrinsics.checkNotNullParameter(view, "itemView");
        super(view, i82_02);
        int n3 = R$id.alert_tv_title;
        i82_02 = view.findViewById(n3);
        String string2 = "findViewById(...)";
        Intrinsics.checkNotNullExpressionValue(i82_02, string2);
        i82_02 = (TextView)i82_02;
        this.titleTv = i82_02;
        n3 = R$id.alert_tv_subtitle;
        i82_02 = view.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(i82_02, string2);
        i82_02 = (TextView)i82_02;
        this.subTitleTv = i82_02;
        n3 = R$id.alert_tv_content;
        i82_02 = view.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(i82_02, string2);
        i82_02 = (TextView)i82_02;
        this.contentTv = i82_02;
        n3 = R$id.row_ccitemhelp_alert;
        view = view.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(view, string2);
        this.row = view;
    }

    private final void setBoldSpan(String string2, String string3, TextView textView) {
        textView.setText((CharSequence)string2);
    }

    public void setData(Object object, int n3) {
        Object object2;
        n3 = object instanceof UiCCComponent;
        if (n3 != 0 && (object2 = ((UiCCComponent)(object = (UiCCComponent)object)).getQAItem()) != null && (n3 = (object2 = ((UiCCComponent)object).getQAItem()) instanceof CCTicketCreated) != 0) {
            object = ((UiCCComponent)object).getQAItem();
            object2 = "null cannot be cast to non-null type com.ril.ajio.services.data.CustomerCare.CCTicketCreated";
            Intrinsics.checkNotNull(object, (String)object2);
            object = (CCTicketCreated)object;
            n3 = (int)(((CCTicketCreated)object).isDuplicateTickets() ? 1 : 0);
            String string2 = "format(...)";
            String string3 = "";
            if (n3 != 0) {
                object2 = this.row;
                int n4 = R$drawable.rounded_bg_red_refresh;
                Object object3 = hv3_0.r(n4);
                object2.setBackground((Drawable)object3);
                object2 = StringCompanionObject.INSTANCE;
                object2 = ((CCTicketCreated)object).getDate();
                n3 = (int)(TextUtils.isEmpty((CharSequence)object2) ? 1 : 0);
                object2 = n3 != 0 ? string3 : ((CCTicketCreated)object).getDate();
                object3 = new StringBuilder("Hi, you have already raised this issue with us. Our team is already working on this problem and will get back to you by ");
                ((StringBuilder)object3).append((String)object2);
                object2 = ((StringBuilder)object3).toString();
                object3 = Arrays.copyOf(new Object[0], 0);
                object2 = String.format((String)object2, (Object[])object3);
                Intrinsics.checkNotNullExpressionValue(object2, string2);
                object3 = this.titleTv;
                String string4 = "Hi, you have already raised this issue with us. Our team is already working on this problem and will get back to you by";
                this.setBoldSpan((String)object2, string4, (TextView)object3);
                object2 = this.subTitleTv;
                object3 = "Thanks for your patience.";
                object2.setText((CharSequence)object3);
                object2 = ((CCTicketCreated)object).getTicketId();
                n3 = (int)(TextUtils.isEmpty((CharSequence)object2) ? 1 : 0);
                if (n3 == 0) {
                    string3 = ((CCTicketCreated)object).getTicketId();
                }
                object = new StringBuilder("Ticket ID: ");
                ((StringBuilder)object).append(string3);
                object = ((StringBuilder)object).toString();
                object2 = Arrays.copyOf(new Object[0], 0);
                object = String.format((String)object, (Object[])object2);
                Intrinsics.checkNotNullExpressionValue(object, string2);
                object2 = this.contentTv;
                string2 = "Ticket ID:";
                this.setBoldSpan((String)object, string2, (TextView)object2);
            } else {
                object2 = this.row;
                int n7 = R$drawable.cc_rounded_full_bg_yellow_refresh;
                Object object4 = hv3_0.r(n7);
                object2.setBackground((Drawable)object4);
                object2 = this.titleTv;
                object4 = "Your ticket has been created successfully!";
                object2.setText((CharSequence)object4);
                object2 = StringCompanionObject.INSTANCE;
                object2 = ((CCTicketCreated)object).getTicketId();
                n3 = (int)(TextUtils.isEmpty((CharSequence)object2) ? 1 : 0);
                object2 = n3 != 0 ? string3 : ((CCTicketCreated)object).getTicketId();
                object4 = new StringBuilder("TICKET ID: ");
                ((StringBuilder)object4).append((String)object2);
                object2 = ((StringBuilder)object4).toString();
                object4 = Arrays.copyOf(new Object[0], 0);
                object2 = String.format((String)object2, (Object[])object4);
                Intrinsics.checkNotNullExpressionValue(object2, string2);
                object4 = this.subTitleTv;
                String string5 = "TICKET ID:";
                this.setBoldSpan((String)object2, string5, (TextView)object4);
                object2 = ((CCTicketCreated)object).getDate();
                n3 = (int)(TextUtils.isEmpty((CharSequence)object2) ? 1 : 0);
                if (n3 == 0) {
                    string3 = ((CCTicketCreated)object).getDate();
                }
                object = new StringBuilder("We will update you via Email or SMS by ");
                ((StringBuilder)object).append(string3);
                object = ((StringBuilder)object).toString();
                object2 = Arrays.copyOf(new Object[0], 0);
                object = String.format((String)object, (Object[])object2);
                Intrinsics.checkNotNullExpressionValue(object, string2);
                object2 = this.contentTv;
                string2 = "We will update you via Email or SMS by";
                this.setBoldSpan((String)object, string2, (TextView)object2);
            }
        }
    }
}

