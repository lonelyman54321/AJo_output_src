/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.net.Uri
 *  android.os.Handler
 *  android.os.Looper
 *  android.util.AttributeSet
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.widget.Button
 *  android.widget.FrameLayout
 *  android.widget.ImageView
 *  android.widget.ProgressBar
 *  android.widget.TextView
 */
package com.ril.ajio.customviews.widgets;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ril.ajio.R$color;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.R$string;
import com.ril.ajio.customviews.widgets.ImageUploadWidget$ImageUploadWidgetCTAListener;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

public final class ImageUploadWidget
extends FrameLayout
implements View.OnClickListener {
    public static final int $stable = 8;
    public Button btnUploadImage;
    private boolean isGoToHome;
    public ImageView ivCancel;
    public ImageView ivUploadError;
    public ImageView ivUploadImage;
    private ImageUploadWidget$ImageUploadWidgetCTAListener listener;
    public ProgressBar progressBar;
    public ProgressBar progressBarVerify;
    public ConstraintLayout progressbarContainer;
    public TextView tvMessage;
    public TextView tvProgress;
    public TextView tvTitle;

    public ImageUploadWidget(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super(context);
        this.initView(context);
    }

    public ImageUploadWidget(Context context, AttributeSet attributeSet) {
        Intrinsics.checkNotNullParameter(context, "context");
        super(context, attributeSet);
        this.initView(context);
    }

    public ImageUploadWidget(Context context, AttributeSet attributeSet, int n3) {
        Intrinsics.checkNotNullParameter(context, "context");
        super(context, attributeSet, n3);
        this.initView(context);
    }

    public ImageUploadWidget(Context context, AttributeSet attributeSet, int n3, int n4) {
        Intrinsics.checkNotNullParameter(context, "context");
        super(context, attributeSet, n3, n4);
        this.initView(context);
    }

    public static /* synthetic */ void a(ImageUploadWidget imageUploadWidget) {
        ImageUploadWidget.requestAccessibilityFocus$lambda$0(imageUploadWidget);
    }

    private final void initView(Context context) {
        context = LayoutInflater.from((Context)context);
        int n3 = R$layout.layout_image_upload_plp;
        context = context.inflate(n3, (ViewGroup)this, true);
        n3 = R$id.container_progress_bar;
        ConstraintLayout constraintLayout = (ConstraintLayout)context.findViewById(n3);
        this.setProgressbarContainer(constraintLayout);
        n3 = R$id.progress_bar;
        constraintLayout = (ProgressBar)context.findViewById(n3);
        this.setProgressBar((ProgressBar)constraintLayout);
        n3 = R$id.progress_bar_verify;
        constraintLayout = (ProgressBar)context.findViewById(n3);
        this.setProgressBarVerify((ProgressBar)constraintLayout);
        n3 = R$id.tv_progress;
        constraintLayout = (TextView)context.findViewById(n3);
        this.setTvProgress((TextView)constraintLayout);
        n3 = R$id.tv_title;
        constraintLayout = (TextView)context.findViewById(n3);
        this.setTvTitle((TextView)constraintLayout);
        n3 = R$id.tv_message;
        constraintLayout = (TextView)context.findViewById(n3);
        this.setTvMessage((TextView)constraintLayout);
        n3 = R$id.iv_upload_image;
        constraintLayout = (ImageView)context.findViewById(n3);
        this.setIvUploadImage((ImageView)constraintLayout);
        n3 = R$id.iv_upload_error;
        constraintLayout = (ImageView)context.findViewById(n3);
        this.setIvUploadError((ImageView)constraintLayout);
        n3 = R$id.iv_cancel;
        constraintLayout = (ImageView)context.findViewById(n3);
        this.setIvCancel((ImageView)constraintLayout);
        n3 = R$id.btn_uploaded_image_action;
        context = (Button)context.findViewById(n3);
        this.setBtnUploadImage((Button)context);
        this.setOnClickListener();
    }

    private static final void requestAccessibilityFocus$lambda$0(ImageUploadWidget imageUploadWidget) {
        Intrinsics.checkNotNullParameter((Object)imageUploadWidget, "this$0");
        ai0_2.a((View)imageUploadWidget.getTvTitle());
    }

    private final void setTitleTextColor(int n3) {
        TextView textView = this.getTvTitle();
        n3 = hv3_0.m(n3);
        textView.setTextColor(n3);
    }

    public final Button getBtnUploadImage() {
        Button button = this.btnUploadImage;
        if (button != null) {
            return button;
        }
        Intrinsics.throwUninitializedPropertyAccessException("btnUploadImage");
        return null;
    }

    public final ImageView getIvCancel() {
        ImageView imageView = this.ivCancel;
        if (imageView != null) {
            return imageView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("ivCancel");
        return null;
    }

    public final ImageView getIvUploadError() {
        ImageView imageView = this.ivUploadError;
        if (imageView != null) {
            return imageView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("ivUploadError");
        return null;
    }

    public final ImageView getIvUploadImage() {
        ImageView imageView = this.ivUploadImage;
        if (imageView != null) {
            return imageView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("ivUploadImage");
        return null;
    }

    public final ImageUploadWidget$ImageUploadWidgetCTAListener getListener() {
        return this.listener;
    }

    public final ProgressBar getProgressBar() {
        ProgressBar progressBar = this.progressBar;
        if (progressBar != null) {
            return progressBar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("progressBar");
        return null;
    }

    public final ProgressBar getProgressBarVerify() {
        ProgressBar progressBar = this.progressBarVerify;
        if (progressBar != null) {
            return progressBar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("progressBarVerify");
        return null;
    }

    public final ConstraintLayout getProgressbarContainer() {
        ConstraintLayout constraintLayout = this.progressbarContainer;
        if (constraintLayout != null) {
            return constraintLayout;
        }
        Intrinsics.throwUninitializedPropertyAccessException("progressbarContainer");
        return null;
    }

    public final TextView getTvMessage() {
        TextView textView = this.tvMessage;
        if (textView != null) {
            return textView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("tvMessage");
        return null;
    }

    public final TextView getTvProgress() {
        TextView textView = this.tvProgress;
        if (textView != null) {
            return textView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("tvProgress");
        return null;
    }

    public final TextView getTvTitle() {
        TextView textView = this.tvTitle;
        if (textView != null) {
            return textView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("tvTitle");
        return null;
    }

    public final boolean isGoToHome() {
        return this.isGoToHome;
    }

    public final void loadImage(Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "imageUri");
        this.getIvUploadImage().setImageURI(uri);
    }

    public void onClick(View object) {
        int n3;
        int n4;
        if (object != null) {
            n4 = object.getId();
            object = n4;
        } else {
            n4 = 0;
            object = null;
        }
        int n7 = R$id.btn_uploaded_image_action;
        if (object != null && (n3 = ((Integer)object).intValue()) == n7) {
            object = this.listener;
            if (object != null) {
                n7 = (int)(this.isGoToHome ? 1 : 0);
                object.onUploadAnotherImageClick(n7 != 0);
            }
        } else {
            n7 = R$id.iv_cancel;
            if (object != null && (n4 = ((Integer)object).intValue()) == n7 && (object = this.listener) != null) {
                object.onImageSearchCancelClick();
            }
        }
    }

    public final void requestAccessibilityFocus() {
        Object object = Looper.getMainLooper();
        Handler handler = new Handler(object);
        object = new ge1_1((Object)this, 0);
        handler.postDelayed((Runnable)object, 300L);
    }

    public final void setBtnUploadImage(Button button) {
        Intrinsics.checkNotNullParameter(button, "<set-?>");
        this.btnUploadImage = button;
    }

    public final void setButtonTitle(String string2) {
        Intrinsics.checkNotNullParameter(string2, "title");
        this.getBtnUploadImage().setText((CharSequence)string2);
    }

    public final void setGoToHome(boolean bl2) {
        this.isGoToHome = bl2;
    }

    public final void setImageUploadWidgetCTAListener(ImageUploadWidget$ImageUploadWidgetCTAListener imageUploadWidget$ImageUploadWidgetCTAListener) {
        Intrinsics.checkNotNullParameter(imageUploadWidget$ImageUploadWidgetCTAListener, "listener");
        this.listener = imageUploadWidget$ImageUploadWidgetCTAListener;
    }

    public final void setIvCancel(ImageView imageView) {
        Intrinsics.checkNotNullParameter(imageView, "<set-?>");
        this.ivCancel = imageView;
    }

    public final void setIvUploadError(ImageView imageView) {
        Intrinsics.checkNotNullParameter(imageView, "<set-?>");
        this.ivUploadError = imageView;
    }

    public final void setIvUploadImage(ImageView imageView) {
        Intrinsics.checkNotNullParameter(imageView, "<set-?>");
        this.ivUploadImage = imageView;
    }

    public final void setListener(ImageUploadWidget$ImageUploadWidgetCTAListener imageUploadWidget$ImageUploadWidgetCTAListener) {
        this.listener = imageUploadWidget$ImageUploadWidgetCTAListener;
    }

    public final void setMessage(String string2) {
        Intrinsics.checkNotNullParameter(string2, "message");
        this.getTvMessage().setText((CharSequence)string2);
    }

    public final void setOnClickListener() {
        this.getBtnUploadImage().setOnClickListener((View.OnClickListener)this);
        this.getIvCancel().setOnClickListener((View.OnClickListener)this);
    }

    public final void setProgress(int n3) {
        ProgressBar progressBar = this.getProgressBar();
        int n4 = progressBar.getProgress();
        if (n3 > n4) {
            progressBar = this.getTvProgress();
            CharSequence charSequence = new StringBuilder();
            charSequence.append(n3);
            String string2 = " %";
            charSequence.append(string2);
            charSequence = charSequence.toString();
            progressBar.setText(charSequence);
            progressBar = this.getProgressBar();
            progressBar.setProgress(n3);
        }
    }

    public final void setProgressBar(ProgressBar progressBar) {
        Intrinsics.checkNotNullParameter(progressBar, "<set-?>");
        this.progressBar = progressBar;
    }

    public final void setProgressBarVerify(ProgressBar progressBar) {
        Intrinsics.checkNotNullParameter(progressBar, "<set-?>");
        this.progressBarVerify = progressBar;
    }

    public final void setProgressbarContainer(ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter((Object)constraintLayout, "<set-?>");
        this.progressbarContainer = constraintLayout;
    }

    public final void setTitle(String string2) {
        Intrinsics.checkNotNullParameter(string2, "title");
        TextView textView = this.getTvTitle();
        Object object = StringCompanionObject.INSTANCE;
        object = hv3_0.K(R$string.acc_alert_popup);
        int n3 = 1;
        Object[] objectArray = new Object[n3];
        objectArray[0] = string2;
        He1.a(objectArray, n3, (String)object, "format(...)", textView);
        this.getTvTitle().setText((CharSequence)string2);
    }

    public final void setTvMessage(TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.tvMessage = textView;
    }

    public final void setTvProgress(TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.tvProgress = textView;
    }

    public final void setTvTitle(TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.tvTitle = textView;
    }

    public final void showOverSizeError() {
        this.requestAccessibilityFocus();
        Object object = this.getContext();
        int n3 = R$string.upload_failed;
        object = object.getString(n3);
        String string2 = "getString(...)";
        Intrinsics.checkNotNullExpressionValue(object, string2);
        this.setTitle((String)object);
        object = this.getContext();
        int n4 = R$string.upload_failed_message;
        object = object.getString(n4);
        Intrinsics.checkNotNullExpressionValue(object, string2);
        this.setMessage((String)object);
        object = this.getContext();
        n4 = R$string.try_again;
        object = object.getString(n4);
        Intrinsics.checkNotNullExpressionValue(object, string2);
        this.setButtonTitle((String)object);
        int n7 = R$color.color_red_f05f5f;
        this.setTitleTextColor(n7);
        this.getBtnUploadImage().setVisibility(0);
        this.getIvUploadError().setVisibility(0);
        object = this.getIvCancel();
        n4 = 8;
        object.setVisibility(n4);
        this.getProgressbarContainer().setVisibility(n4);
        this.isGoToHome = false;
    }

    public final void showTechError() {
        Object object = this.getContext();
        int n3 = R$string.image_technical_error_title;
        object = object.getString(n3);
        String string2 = "getString(...)";
        Intrinsics.checkNotNullExpressionValue(object, string2);
        this.setTitle((String)object);
        object = this.getContext();
        int n4 = R$string.image_technical_search_error_message;
        object = object.getString(n4);
        Intrinsics.checkNotNullExpressionValue(object, string2);
        this.setMessage((String)object);
        this.requestAccessibilityFocus();
        int n7 = R$color.color_red_f05f5f;
        this.setTitleTextColor(n7);
        object = this.getBtnUploadImage();
        string2 = this.getContext();
        n4 = R$string.try_again;
        string2 = string2.getString(n4);
        object.setText((CharSequence)string2);
        this.getBtnUploadImage().setVisibility(0);
        this.getIvUploadError().setVisibility(0);
        object = this.getIvCancel();
        n4 = 8;
        object.setVisibility(n4);
        this.getProgressbarContainer().setVisibility(n4);
        this.isGoToHome = false;
    }

    public final void startImageUpload() {
        Object object = this.getContext();
        int n3 = R$string.uploading_image;
        object = object.getString(n3);
        String string2 = "getString(...)";
        Intrinsics.checkNotNullExpressionValue(object, string2);
        this.setTitle((String)object);
        object = this.getContext();
        int n4 = R$string.uploading_image_message;
        object = object.getString(n4);
        Intrinsics.checkNotNullExpressionValue(object, string2);
        this.setMessage((String)object);
        int n7 = R$color.pesdk_color_5;
        this.setTitleTextColor(n7);
        object = this.getProgressBarVerify();
        n3 = 8;
        object.setVisibility(n3);
        this.getBtnUploadImage().setVisibility(n3);
        this.getIvUploadError().setVisibility(n3);
        this.getIvCancel().setVisibility(0);
        this.getProgressBar().setVisibility(0);
        this.getTvProgress().setVisibility(0);
        this.getProgressbarContainer().setVisibility(0);
        this.setProgress(0);
        this.isGoToHome = false;
    }

    public final void verifyImage() {
        this.requestAccessibilityFocus();
        Object object = this.getContext();
        int n3 = R$string.check_image;
        object = object.getString(n3);
        String string2 = "getString(...)";
        Intrinsics.checkNotNullExpressionValue(object, string2);
        this.setTitle((String)object);
        object = this.getContext();
        int n4 = R$string.check_image_message;
        object = object.getString(n4);
        Intrinsics.checkNotNullExpressionValue(object, string2);
        this.setMessage((String)object);
        int n7 = R$color.pesdk_color_5;
        this.setTitleTextColor(n7);
        this.getProgressBarVerify().setVisibility(0);
        object = this.getProgressBar();
        n4 = 8;
        object.setVisibility(n4);
        this.getTvProgress().setVisibility(n4);
        this.getBtnUploadImage().setVisibility(n4);
        this.getIvCancel().setVisibility(n4);
        this.getIvUploadError().setVisibility(n4);
        this.getTvProgress().setVisibility(n4);
        this.isGoToHome = false;
    }
}

