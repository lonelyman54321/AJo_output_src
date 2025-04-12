/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.ImageView
 *  android.widget.LinearLayout
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;

public final class DialogAttachmentImageBinding
implements BC3 {
    public final ImageView attachmentImage;
    public final LinearLayout previewImage;
    private final LinearLayout rootView;

    private DialogAttachmentImageBinding(LinearLayout linearLayout, ImageView imageView, LinearLayout linearLayout2) {
        this.rootView = linearLayout;
        this.attachmentImage = imageView;
        this.previewImage = linearLayout2;
    }

    public static DialogAttachmentImageBinding bind(View object) {
        int n3 = R$id.attachment_image;
        ImageView imageView = (ImageView)dd2_2.a(n3, object);
        if (imageView != null) {
            object = (LinearLayout)object;
            DialogAttachmentImageBinding dialogAttachmentImageBinding = new DialogAttachmentImageBinding((LinearLayout)object, imageView, (LinearLayout)object);
            return dialogAttachmentImageBinding;
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static DialogAttachmentImageBinding inflate(LayoutInflater layoutInflater) {
        return DialogAttachmentImageBinding.inflate(layoutInflater, null, false);
    }

    public static DialogAttachmentImageBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.dialog_attachment_image;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return DialogAttachmentImageBinding.bind((View)layoutInflater);
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }
}

