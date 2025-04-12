/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 *  android.view.View
 *  android.widget.TextView
 */
package com.ril.ajio.ondemand.customercare.view.viewholder;

import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.ril.ajio.R$id;
import com.ril.ajio.ondemand.customercare.view.common.UiCCComponent;
import com.ril.ajio.services.data.CustomerCare.CCItemDetailsQAModel$CCItemQALists;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;

public final class CCItemHelpHeaderViewHolderRefresh
extends uv_2 {
    private final TextView subTitleTv;
    private final TextView titleTv;

    public CCItemHelpHeaderViewHolderRefresh(View view, i82_0 i82_02) {
        Intrinsics.checkNotNullParameter(view, "itemView");
        super(view, i82_02);
        int n3 = R$id.row_ccitemhelp_header_tv_title;
        i82_02 = view.findViewById(n3);
        String string2 = "findViewById(...)";
        Intrinsics.checkNotNullExpressionValue(i82_02, string2);
        i82_02 = (TextView)i82_02;
        this.titleTv = i82_02;
        n3 = R$id.row_ccitemhelp_header_tv_subtitle;
        view = view.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(view, string2);
        view = (TextView)view;
        this.subTitleTv = view;
    }

    public void setData(Object object, int n3) {
        Object object2;
        n3 = object instanceof UiCCComponent;
        if (n3 != 0 && (n3 = (object2 = ((UiCCComponent)(object = (UiCCComponent)object)).getQAItem()) instanceof CCItemDetailsQAModel$CCItemQALists) != 0) {
            object = ((UiCCComponent)object).getQAItem();
            Intrinsics.checkNotNull(object, "null cannot be cast to non-null type com.ril.ajio.services.data.CustomerCare.CCItemDetailsQAModel.CCItemQALists");
            object = (CCItemDetailsQAModel$CCItemQALists)object;
            object2 = ((CCItemDetailsQAModel$CCItemQALists)object).getQuestion();
            object = ((CCItemDetailsQAModel$CCItemQALists)object).getAnswer();
            Object object3 = this.titleTv;
            boolean bl2 = TextUtils.isEmpty((CharSequence)object2);
            String string2 = "\\\n";
            String string3 = "\\\\n";
            String string4 = "";
            if (bl2) {
                object2 = string4;
            } else {
                Intrinsics.checkNotNull(object2);
                Regex regex = new Regex(string3);
                object2 = regex.replace((CharSequence)object2, string2);
            }
            object3.setText((CharSequence)object2);
            object2 = this.subTitleTv;
            boolean bl3 = TextUtils.isEmpty((CharSequence)object);
            if (!bl3) {
                Intrinsics.checkNotNull(object);
                object3 = new Regex(string3);
                string4 = ((Regex)object3).replace((CharSequence)object, string2);
            }
            object2.setText((CharSequence)string4);
        }
    }
}

