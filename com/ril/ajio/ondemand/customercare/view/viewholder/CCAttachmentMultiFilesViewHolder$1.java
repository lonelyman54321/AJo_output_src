/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.Editable
 *  android.text.TextWatcher
 */
package com.ril.ajio.ondemand.customercare.view.viewholder;

import android.text.Editable;
import android.text.TextWatcher;
import com.ril.ajio.ondemand.customercare.view.viewholder.CCAttachmentMultiFilesViewHolder;
import com.ril.ajio.services.data.CustomerCare.CCComplaintAttachInfoNew;
import com.ril.ajio.services.data.CustomerCare.CCItemMultiFileAttachModel;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.b;

public final class CCAttachmentMultiFilesViewHolder$1
implements TextWatcher {
    final /* synthetic */ CCAttachmentMultiFilesViewHolder this$0;

    public CCAttachmentMultiFilesViewHolder$1(CCAttachmentMultiFilesViewHolder cCAttachmentMultiFilesViewHolder) {
        this.this$0 = cCAttachmentMultiFilesViewHolder;
    }

    public void afterTextChanged(Editable editable) {
        Intrinsics.checkNotNullParameter(editable, "s");
    }

    public void beforeTextChanged(CharSequence charSequence, int n3, int n4, int n7) {
        Intrinsics.checkNotNullParameter(charSequence, "s");
    }

    public void onTextChanged(CharSequence charSequence, int n3, int n4, int n7) {
        Intrinsics.checkNotNullParameter(charSequence, "s");
        Object object = CCAttachmentMultiFilesViewHolder.access$getCcAttachmentListener$p(this.this$0);
        if (object != null) {
            String string2 = ((Object)charSequence).toString();
            object.onTextChange(string2);
        }
        if ((object = this.this$0.getAttachInfoModel()) != null && (object = ((CCItemMultiFileAttachModel)object).getAttacheInfo()) != null) {
            n4 = b.k(charSequence = ((Object)charSequence).toString()) ^ 1;
            if (n4 == 0) {
                charSequence = null;
            }
            ((CCComplaintAttachInfoNew)object).setComments((String)charSequence);
        }
        CCAttachmentMultiFilesViewHolder.access$validateCommentErrors(this.this$0);
        CCAttachmentMultiFilesViewHolder.access$checkSubmitBtn(this.this$0);
    }
}

