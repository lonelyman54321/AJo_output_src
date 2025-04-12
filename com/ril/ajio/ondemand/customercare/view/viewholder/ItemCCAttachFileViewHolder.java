/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Bitmap
 *  android.net.Uri
 *  android.text.TextUtils
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.widget.ImageView
 *  android.widget.TextView
 */
package com.ril.ajio.ondemand.customercare.view.viewholder;

import android.graphics.Bitmap;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView$B;
import com.ril.ajio.R$drawable;
import com.ril.ajio.R$id;
import com.ril.ajio.R$string;
import com.ril.ajio.ondemand.customercare.view.viewholder.AttachItemClickListener;
import com.ril.ajio.services.data.CustomerCare.ImageData;
import kotlin.jvm.internal.Intrinsics;

public final class ItemCCAttachFileViewHolder
extends RecyclerView$B {
    private final AttachItemClickListener attachItemClickListener;
    private final CardView cardAttachment;
    private final ImageView ivAttachmentFile;
    private final ImageView ivAttachmentImage;
    private final ConstraintLayout layoutIemAttachment;
    private final TextView tvAttachCta;
    private final TextView tvAttachmentLabel;
    private final TextView tvAttachmentName;
    private final TextView tvAttachmentPlaceholder;
    private final TextView tvDeleteCta;

    public ItemCCAttachFileViewHolder(View view, AttachItemClickListener object) {
        Intrinsics.checkNotNullParameter(view, "itemView");
        Intrinsics.checkNotNullParameter(object, "attachItemClickListener");
        super(view);
        this.attachItemClickListener = object;
        int n3 = R$id.layout_item_attachment;
        object = view.findViewById(n3);
        Object object2 = "findViewById(...)";
        Intrinsics.checkNotNullExpressionValue(object, (String)object2);
        object = (ConstraintLayout)((Object)object);
        this.layoutIemAttachment = object;
        int n4 = R$id.iv_attachment_file;
        Object object3 = view.findViewById(n4);
        Intrinsics.checkNotNullExpressionValue(object3, (String)object2);
        object3 = (ImageView)object3;
        this.ivAttachmentFile = object3;
        n4 = R$id.card_attachment;
        object3 = view.findViewById(n4);
        Intrinsics.checkNotNullExpressionValue(object3, (String)object2);
        object3 = (CardView)((Object)object3);
        this.cardAttachment = object3;
        n4 = R$id.iv_attachment_image;
        object3 = view.findViewById(n4);
        Intrinsics.checkNotNullExpressionValue(object3, (String)object2);
        object3 = (ImageView)object3;
        this.ivAttachmentImage = object3;
        n4 = R$id.tv_attachment_placeholder;
        object3 = view.findViewById(n4);
        Intrinsics.checkNotNullExpressionValue(object3, (String)object2);
        object3 = (TextView)object3;
        this.tvAttachmentPlaceholder = object3;
        n4 = R$id.tv_attachment_label;
        object3 = view.findViewById(n4);
        Intrinsics.checkNotNullExpressionValue(object3, (String)object2);
        object3 = (TextView)object3;
        this.tvAttachmentLabel = object3;
        n4 = R$id.tv_attachment_name;
        object3 = view.findViewById(n4);
        Intrinsics.checkNotNullExpressionValue(object3, (String)object2);
        object3 = (TextView)object3;
        this.tvAttachmentName = object3;
        n4 = R$id.tv_attach_cta;
        object3 = view.findViewById(n4);
        Intrinsics.checkNotNullExpressionValue(object3, (String)object2);
        object3 = (TextView)object3;
        this.tvAttachCta = object3;
        int n7 = R$id.tv_delete_cta;
        view = view.findViewById(n7);
        Intrinsics.checkNotNullExpressionValue(view, (String)object2);
        view = (TextView)view;
        this.tvDeleteCta = view;
        object2 = new pk1_2(this);
        object.setOnClickListener((View.OnClickListener)object2);
        super(this);
        object3.setOnClickListener((View.OnClickListener)object);
        super(this);
        view.setOnClickListener((View.OnClickListener)object);
    }

    private static final void _init_$lambda$0(ItemCCAttachFileViewHolder itemCCAttachFileViewHolder, View object) {
        Intrinsics.checkNotNullParameter(itemCCAttachFileViewHolder, "this$0");
        object = itemCCAttachFileViewHolder.attachItemClickListener;
        int n3 = itemCCAttachFileViewHolder.getLayoutPosition();
        object.onAttachFile(n3);
    }

    private static final void _init_$lambda$1(ItemCCAttachFileViewHolder itemCCAttachFileViewHolder, View object) {
        Intrinsics.checkNotNullParameter(itemCCAttachFileViewHolder, "this$0");
        object = itemCCAttachFileViewHolder.attachItemClickListener;
        int n3 = itemCCAttachFileViewHolder.getLayoutPosition();
        object.onAttachFile(n3);
    }

    private static final void _init_$lambda$2(ItemCCAttachFileViewHolder itemCCAttachFileViewHolder, View object) {
        Intrinsics.checkNotNullParameter(itemCCAttachFileViewHolder, "this$0");
        object = itemCCAttachFileViewHolder.attachItemClickListener;
        int n3 = itemCCAttachFileViewHolder.getLayoutPosition();
        object.onDeleteFile(n3);
    }

    private final void handleDeleteBtn(boolean bl2) {
        int n3 = 8;
        if (bl2) {
            this.tvAttachCta.setVisibility(n3);
            TextView textView = this.tvDeleteCta;
            textView.setVisibility(0);
        } else {
            this.tvAttachCta.setVisibility(0);
            TextView textView = this.tvDeleteCta;
            textView.setVisibility(n3);
        }
    }

    private final void setAttachmentText(boolean bl2, String string2, boolean bl3) {
        TextView textView;
        int n3 = 8;
        if (bl2) {
            this.tvAttachmentPlaceholder.setVisibility(n3);
            this.tvAttachmentLabel.setVisibility(0);
            this.tvAttachmentName.setVisibility(0);
            textView = this.tvAttachmentName;
            textView.setText((CharSequence)string2);
        } else {
            this.tvAttachmentPlaceholder.setVisibility(0);
            this.tvAttachmentLabel.setVisibility(n3);
            textView = this.tvAttachmentName;
            textView.setVisibility(n3);
        }
        if (bl3) {
            textView = this.tvAttachmentPlaceholder;
            int n4 = R$string.cc_attachment_mandatory;
            string2 = hv3_0.K(n4);
            textView.setText((CharSequence)string2);
        } else {
            textView = this.tvAttachmentPlaceholder;
            int n7 = R$string.attachment;
            string2 = hv3_0.K(n7);
            textView.setText((CharSequence)string2);
        }
    }

    private final void setImageContainer() {
        this.cardAttachment.setVisibility(0);
        this.ivAttachmentFile.setVisibility(8);
    }

    public static /* synthetic */ void w(ItemCCAttachFileViewHolder itemCCAttachFileViewHolder, View view) {
        ItemCCAttachFileViewHolder._init_$lambda$1(itemCCAttachFileViewHolder, view);
    }

    public static /* synthetic */ void x(ItemCCAttachFileViewHolder itemCCAttachFileViewHolder, View view) {
        ItemCCAttachFileViewHolder._init_$lambda$2(itemCCAttachFileViewHolder, view);
    }

    public static /* synthetic */ void y(ItemCCAttachFileViewHolder itemCCAttachFileViewHolder, View view) {
        ItemCCAttachFileViewHolder._init_$lambda$0(itemCCAttachFileViewHolder, view);
    }

    public final void setData(ImageData object, int n3, boolean bl2) {
        Intrinsics.checkNotNullParameter(object, "imageData");
        Object object2 = this.cardAttachment;
        int n4 = 8;
        object2.setVisibility(n4);
        this.ivAttachmentFile.setVisibility(0);
        this.handleDeleteBtn(false);
        object2 = ((ImageData)object).getContentType();
        String string2 = "application/pdf";
        n3 = (int)(string2.equalsIgnoreCase((String)object2) ? 1 : 0);
        boolean bl3 = true;
        if (n3 != 0) {
            this.handleDeleteBtn(bl3);
            object2 = this.ivAttachmentFile;
            n4 = R$drawable.ic_attachment_pdf;
            object2.setImageResource(n4);
        } else {
            object2 = ((ImageData)object).getFilePath();
            n3 = (int)(TextUtils.isEmpty((CharSequence)object2) ? 1 : 0);
            if (n3 == 0 || (object2 = ((ImageData)object).getFileUri()) != null) {
                this.handleDeleteBtn(bl3);
                object2 = ((ImageData)object).getFilePath();
                n3 = (int)(TextUtils.isEmpty((CharSequence)object2) ? 1 : 0);
                if (n3 == 0) {
                    object2 = this.ivAttachmentImage;
                    String string3 = ((ImageData)object).getFilePath();
                    Bitmap bitmap = ty2_2.d(n4, string3);
                    object2.setImageBitmap(bitmap);
                    this.setImageContainer();
                } else {
                    object2 = this.ivAttachmentImage;
                    Uri uri = ((ImageData)object).getFileUri();
                    object2.setImageURI(uri);
                    this.setImageContainer();
                }
            }
        }
        object2 = ((ImageData)object).getFileName();
        n3 = (int)(TextUtils.isEmpty((CharSequence)object2) ? 1 : 0);
        if (n3 == 0) {
            object = ((ImageData)object).getFileName();
            this.setAttachmentText(bl3, (String)object, bl2);
        } else {
            object = "";
            this.setAttachmentText(false, (String)object, bl2);
        }
    }
}

