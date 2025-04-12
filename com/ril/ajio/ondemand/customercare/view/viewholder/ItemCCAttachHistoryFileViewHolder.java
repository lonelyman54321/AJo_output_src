/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.widget.ImageView
 */
package com.ril.ajio.ondemand.customercare.view.viewholder;

import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView$B;
import com.ril.ajio.databinding.ItemCcAttachmentHistoryFileBinding;
import com.ril.ajio.services.data.CustomerCare.ImageDetails;
import kotlin.jvm.internal.Intrinsics;

public final class ItemCCAttachHistoryFileViewHolder
extends RecyclerView$B {
    private final ItemCcAttachmentHistoryFileBinding binding;

    public ItemCCAttachHistoryFileViewHolder(ItemCcAttachmentHistoryFileBinding itemCcAttachmentHistoryFileBinding) {
        Intrinsics.checkNotNullParameter(itemCcAttachmentHistoryFileBinding, "binding");
        ConstraintLayout constraintLayout = itemCcAttachmentHistoryFileBinding.getRoot();
        super((View)constraintLayout);
        this.binding = itemCcAttachmentHistoryFileBinding;
    }

    public final void setData(ImageDetails object) {
        Intrinsics.checkNotNullParameter(object, "imageDetails");
        da$a da$a = new da$a();
        String string2 = ((ImageDetails)object).getImageUrl();
        ImageView imageView = this.binding.ivAttachment;
        da$a.n = string2;
        da$a.u = imageView;
        da$a.a();
        da$a = this.binding.tvFileName;
        object = ((ImageDetails)object).getImageName();
        da$a.setText((CharSequence)object);
    }
}

