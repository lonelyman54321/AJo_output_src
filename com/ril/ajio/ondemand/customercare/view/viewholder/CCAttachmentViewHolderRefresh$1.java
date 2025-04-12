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
import com.ril.ajio.ondemand.customercare.view.viewholder.CCAttachmentListener;
import com.ril.ajio.ondemand.customercare.view.viewholder.CCAttachmentViewHolderRefresh;
import kotlin.jvm.internal.Intrinsics;

public final class CCAttachmentViewHolderRefresh$1
implements TextWatcher {
    final /* synthetic */ CCAttachmentViewHolderRefresh this$0;

    public CCAttachmentViewHolderRefresh$1(CCAttachmentViewHolderRefresh cCAttachmentViewHolderRefresh) {
        this.this$0 = cCAttachmentViewHolderRefresh;
    }

    public void afterTextChanged(Editable editable) {
        Intrinsics.checkNotNullParameter(editable, "s");
    }

    public void beforeTextChanged(CharSequence charSequence, int n3, int n4, int n7) {
        Intrinsics.checkNotNullParameter(charSequence, "s");
    }

    public void onTextChanged(CharSequence charSequence, int n3, int n4, int n7) {
        Intrinsics.checkNotNullParameter(charSequence, "s");
        CCAttachmentViewHolderRefresh.access$checkSubmitBtn(this.this$0);
        CCAttachmentListener cCAttachmentListener = CCAttachmentViewHolderRefresh.access$getCcAttachmentListener$p(this.this$0);
        if (cCAttachmentListener != null) {
            charSequence = ((Object)charSequence).toString();
            cCAttachmentListener.onTextChange((String)charSequence);
        }
    }
}

