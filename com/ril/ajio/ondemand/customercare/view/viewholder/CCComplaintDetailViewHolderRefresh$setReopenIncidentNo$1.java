/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextPaint
 *  android.text.TextUtils
 *  android.text.style.ClickableSpan
 *  android.view.View
 */
package com.ril.ajio.ondemand.customercare.view.viewholder;

import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.view.View;
import com.ril.ajio.R$color;
import com.ril.ajio.ondemand.customercare.view.viewholder.CCComplaintDetailViewHolderRefresh;
import kotlin.jvm.internal.Intrinsics;

public final class CCComplaintDetailViewHolderRefresh$setReopenIncidentNo$1
extends ClickableSpan {
    final /* synthetic */ String $incidentNo;
    final /* synthetic */ CCComplaintDetailViewHolderRefresh this$0;

    public CCComplaintDetailViewHolderRefresh$setReopenIncidentNo$1(CCComplaintDetailViewHolderRefresh cCComplaintDetailViewHolderRefresh, String string2) {
        this.this$0 = cCComplaintDetailViewHolderRefresh;
        this.$incidentNo = string2;
    }

    public void onClick(View object) {
        boolean bl2;
        String string2 = "textView";
        Intrinsics.checkNotNullParameter(object, string2);
        object = this.this$0.getMOnCCClickListener();
        if (object != null && !(bl2 = TextUtils.isEmpty((CharSequence)(object = this.$incidentNo)))) {
            object = this.this$0.getMOnCCClickListener();
            Intrinsics.checkNotNull(object);
            string2 = this.$incidentNo;
            int n3 = 25;
            object.onViewItemClick(string2, n3);
        }
    }

    public void updateDrawState(TextPaint textPaint) {
        Intrinsics.checkNotNullParameter(textPaint, "ds");
        super.updateDrawState(textPaint);
        int n3 = hv3_0.m(R$color.accent_color_14);
        textPaint.setColor(n3);
        textPaint.setUnderlineText(false);
    }
}

