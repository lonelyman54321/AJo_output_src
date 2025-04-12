/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.view.View
 *  android.widget.LinearLayout
 *  android.widget.TextView
 */
package com.ril.ajio.ondemand.customercare.view.viewholder;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$f;
import androidx.recyclerview.widget.RecyclerView$n;
import androidx.recyclerview.widget.RecyclerView$o;
import com.ril.ajio.R$id;
import com.ril.ajio.ondemand.customercare.view.adapter.CCAttachmentHistoryItemAdapter;
import com.ril.ajio.ondemand.customercare.view.common.UiCCComponent;
import com.ril.ajio.ondemand.customercare.view.viewholder.CCAttachmentHistoryViewHolder$1;
import com.ril.ajio.services.data.CustomerCare.ActionData;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

public final class CCAttachmentHistoryViewHolder
extends uv_2 {
    private final LinearLayout attachParent;
    private final CCAttachmentHistoryItemAdapter attachmentAdapter;
    private final RecyclerView rvAttachments;
    private final TextView tvAttachmentLabel;
    private final TextView tvComments;
    private final TextView tvCommentsLabel;

    public CCAttachmentHistoryViewHolder(View view, i82_0 object) {
        Intrinsics.checkNotNullParameter(view, "view");
        super(view, (i82_0)object);
        object = this.itemView;
        int n3 = R$id.attachParent;
        object = object.findViewById(n3);
        Object object2 = "findViewById(...)";
        Intrinsics.checkNotNullExpressionValue(object, (String)object2);
        object = (LinearLayout)object;
        this.attachParent = object;
        object = this.itemView;
        int n4 = R$id.tv_attachment_label;
        object = object.findViewById(n4);
        Intrinsics.checkNotNullExpressionValue(object, (String)object2);
        object = (TextView)object;
        this.tvAttachmentLabel = object;
        object = this.itemView;
        n4 = R$id.tv_comments_label;
        object = object.findViewById(n4);
        Intrinsics.checkNotNullExpressionValue(object, (String)object2);
        object = (TextView)object;
        this.tvCommentsLabel = object;
        object = this.itemView;
        n4 = R$id.tv_comments;
        object = object.findViewById(n4);
        Intrinsics.checkNotNullExpressionValue(object, (String)object2);
        object = (TextView)object;
        this.tvComments = object;
        object = this.itemView;
        n4 = R$id.rv_attachments;
        object = object.findViewById(n4);
        Intrinsics.checkNotNullExpressionValue(object, (String)object2);
        this.rvAttachments = object = (RecyclerView)object;
        this.attachmentAdapter = object2 = new CCAttachmentHistoryItemAdapter();
        view = view.getContext();
        Object object3 = new LinearLayoutManager((Context)view, 1, false);
        ((RecyclerView)object).setLayoutManager((RecyclerView$o)object3);
        int n7 = mz3_0.d(8);
        object3 = new CCAttachmentHistoryViewHolder$1(n7);
        ((RecyclerView)object).addItemDecoration((RecyclerView$n)object3);
        ((RecyclerView)object).setAdapter((RecyclerView$f)object2);
    }

    public void setData(Object object, int n3) {
        n3 = object instanceof UiCCComponent;
        if (n3 != 0) {
            Object object2 = ((UiCCComponent)(object = (UiCCComponent)object)).getQAItem();
            n3 = object2 instanceof ActionData;
            if (n3 != 0) {
                ai0_2.B((View)this.attachParent);
                object = ((UiCCComponent)object).getQAItem();
                Intrinsics.checkNotNull(object, "null cannot be cast to non-null type com.ril.ajio.services.data.CustomerCare.ActionData");
                object = (ActionData)object;
                object2 = ((ActionData)object).getImageDetails();
                if (object2 != null && (n3 = (int)(object2.isEmpty() ? 1 : 0)) == 0) {
                    ai0_2.B((View)this.rvAttachments);
                    ai0_2.B((View)this.tvAttachmentLabel);
                    object2 = ((ActionData)object).getImageDetails();
                    if (object2 != null) {
                        CCAttachmentHistoryItemAdapter cCAttachmentHistoryItemAdapter = this.attachmentAdapter;
                        cCAttachmentHistoryItemAdapter.setData((List)object2);
                    }
                } else {
                    ai0_2.i((View)this.tvAttachmentLabel);
                    object2 = this.rvAttachments;
                    ai0_2.i((View)object2);
                }
                if ((object2 = ((ActionData)object).getCommentMessage()) != null && (n3 = object2.length()) != 0) {
                    ai0_2.B((View)this.tvCommentsLabel);
                    ai0_2.B((View)this.tvComments);
                    object2 = this.tvComments;
                    object = ((ActionData)object).getCommentMessage();
                    object2.setText((CharSequence)object);
                } else {
                    ai0_2.i((View)this.tvCommentsLabel);
                    object = this.tvComments;
                    ai0_2.i((View)object);
                }
            } else {
                object = this.attachParent;
                ai0_2.i((View)object);
            }
        }
    }
}

