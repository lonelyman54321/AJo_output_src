/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.ondemand.customercare.view.viewholder;

import com.ril.ajio.ondemand.customercare.view.viewholder.AttachItemClickListener;
import com.ril.ajio.ondemand.customercare.view.viewholder.CCAttachmentMultiFilesViewHolder;
import com.ril.ajio.services.data.CustomerCare.CCComplaintAttachInfoNew;
import com.ril.ajio.services.data.CustomerCare.CCItemMultiFileAttachModel;
import com.ril.ajio.services.data.CustomerCare.ImageData;
import java.util.List;
import kotlin.collections.CollectionsKt;

public final class CCAttachmentMultiFilesViewHolder$attachItemClickListener$1
implements AttachItemClickListener {
    final /* synthetic */ CCAttachmentMultiFilesViewHolder this$0;

    public CCAttachmentMultiFilesViewHolder$attachItemClickListener$1(CCAttachmentMultiFilesViewHolder cCAttachmentMultiFilesViewHolder) {
        this.this$0 = cCAttachmentMultiFilesViewHolder;
    }

    public void onAttachFile(int n3) {
        int n4;
        Object object = this.this$0.getAttachInfoModel();
        int n7 = 0;
        String string2 = null;
        if (object != null && (object = ((CCItemMultiFileAttachModel)object).getAttacheInfo()) != null && (object = ((CCComplaintAttachInfoNew)object).getImageData()) != null && (object = (ImageData)CollectionsKt.N(n3, (List)object)) != null) {
            object = ((ImageData)object).getFileName();
        } else {
            n4 = 0;
            object = null;
        }
        if (object != null && (n4 = object.length()) != 0) {
            object = this.this$0.getAttachInfoModel();
            if (object != null && (object = ((CCItemMultiFileAttachModel)object).getAttacheInfo()) != null && (object = ((CCComplaintAttachInfoNew)object).getImageData()) != null && (object = (ImageData)CollectionsKt.N(n3, (List)object)) != null) {
                string2 = ((ImageData)object).getContentType();
            }
            if ((n4 = (int)(((String)(object = "application/pdf")).equalsIgnoreCase(string2) ? 1 : 0)) == 0 && (object = this.this$0.getMOnCCClickListener()) != null) {
                Integer n8 = n3;
                n7 = 29;
                object.onViewItemClick(n8, n7);
            }
        } else {
            object = this.this$0.getMOnCCClickListener();
            if (object != null) {
                Integer n10 = n3;
                n7 = 28;
                object.onViewItemClick(n10, n7);
            }
        }
    }

    public void onDeleteFile(int n3) {
        i82_0 i82_02 = this.this$0.getMOnCCClickListener();
        if (i82_02 != null) {
            Integer n4 = n3;
            int n7 = 31;
            i82_02.onViewItemClick(n4, n7);
        }
    }
}

