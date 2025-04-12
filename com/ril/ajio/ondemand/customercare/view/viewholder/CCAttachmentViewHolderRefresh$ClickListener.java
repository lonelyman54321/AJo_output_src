/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 */
package com.ril.ajio.ondemand.customercare.view.viewholder;

import android.view.View;
import com.ril.ajio.R$drawable;
import com.ril.ajio.R$id;
import com.ril.ajio.ondemand.customercare.view.viewholder.CCAttachmentViewHolderRefresh;
import kotlin.jvm.internal.Intrinsics;

public final class CCAttachmentViewHolderRefresh$ClickListener
implements View.OnClickListener {
    private final int attachmentClickType;
    final /* synthetic */ CCAttachmentViewHolderRefresh this$0;

    public CCAttachmentViewHolderRefresh$ClickListener(CCAttachmentViewHolderRefresh cCAttachmentViewHolderRefresh, int n3) {
        this.this$0 = cCAttachmentViewHolderRefresh;
        this.attachmentClickType = n3;
    }

    public void onClick(View object) {
        int n3;
        Intrinsics.checkNotNullParameter(object, "v");
        Object object2 = this.this$0.getMOnCCClickListener();
        if (object2 == null) {
            return;
        }
        int n4 = object.getId();
        if (n4 != (n3 = R$id.row_cc_attach_parent) && n4 != (n3 = R$id.cc_attach_txt)) {
            n3 = R$id.cc_attach_delete;
            if (n4 == n3) {
                object2 = this.this$0;
                n3 = 0;
                CCAttachmentViewHolderRefresh.access$handleDeleteBtn((CCAttachmentViewHolderRefresh)object2, false);
                CCAttachmentViewHolderRefresh.access$getAttachment$p(this.this$0).setVisibility(8);
                CCAttachmentViewHolderRefresh.access$getAttachmentSample$p(this.this$0).setVisibility(0);
                object2 = CCAttachmentViewHolderRefresh.access$getAttachmentSample$p(this.this$0);
                int n7 = R$drawable.ic_attachment_icon;
                Object object3 = hv3_0.r(n7);
                object2.setImageDrawable(object3);
                CCAttachmentViewHolderRefresh.access$setAttachmentText(this.this$0, false, "");
                object2 = CCAttachmentViewHolderRefresh.access$getAttachmentParent$p(this.this$0);
                object3 = this.this$0;
                int n8 = 16;
                CCAttachmentViewHolderRefresh$ClickListener cCAttachmentViewHolderRefresh$ClickListener = new CCAttachmentViewHolderRefresh$ClickListener((CCAttachmentViewHolderRefresh)object3, n8);
                object2.setOnClickListener((View.OnClickListener)cCAttachmentViewHolderRefresh$ClickListener);
                object2 = this.this$0.getMOnCCClickListener();
                if (object2 != null) {
                    object = object.getTag();
                    n3 = 19;
                    object2.onViewItemClick(object, n3);
                }
                object = this.this$0;
                CCAttachmentViewHolderRefresh.access$checkSubmitBtn((CCAttachmentViewHolderRefresh)object);
            } else {
                n3 = R$id.row_cc_submit_btn;
                if (n4 == n3) {
                    object2 = this.this$0.getMOnCCClickListener();
                    Intrinsics.checkNotNull(object2);
                    object = object.getTag();
                    n3 = 23;
                    object2.onViewItemClick(object, n3);
                }
            }
        } else {
            n4 = this.attachmentClickType;
            n3 = 18;
            if (n4 != n3) {
                object2 = this.this$0.getMOnCCClickListener();
                Intrinsics.checkNotNull(object2);
                object = object.getTag();
                n3 = this.attachmentClickType;
                object2.onViewItemClick(object, n3);
            }
        }
    }
}

