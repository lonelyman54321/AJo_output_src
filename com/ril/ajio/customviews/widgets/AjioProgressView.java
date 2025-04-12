/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.drawable.Animatable
 *  android.util.AttributeSet
 *  android.view.MotionEvent
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.FrameLayout
 *  android.widget.ImageView
 */
package com.ril.ajio.customviews.widgets;

import android.content.Context;
import android.graphics.drawable.Animatable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioTextView;

public class AjioProgressView
extends FrameLayout {
    private ImageView imageView;
    private AjioTextView progressCustomMessage;
    private int ref = 0;

    public AjioProgressView(Context context) {
        super(context);
        this.initLayout(context);
    }

    public AjioProgressView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.initLayout(context);
    }

    public AjioProgressView(Context context, AttributeSet attributeSet, int n3) {
        super(context, attributeSet, n3);
        this.initLayout(context);
    }

    private void dismissDialog() {
        boolean bl2;
        int n3 = 8;
        this.setVisibility(n3);
        ImageView imageView = this.imageView;
        if (imageView != null && (bl2 = (imageView = imageView.getDrawable()) instanceof Animatable)) {
            imageView = (Animatable)imageView;
            imageView.stop();
        }
    }

    private void initLayout(Context object) {
        ImageView imageView;
        int n3 = R$layout.progress_view_layout;
        object = View.inflate((Context)object, (int)n3, (ViewGroup)this);
        n3 = R$id.ajio_progress_imv;
        this.imageView = imageView = (ImageView)object.findViewById(n3);
        n3 = R$id.ajio_progress_tv;
        object = (AjioTextView)object.findViewById(n3);
        this.progressCustomMessage = object;
        object = new da$a();
        n3 = 1;
        ((da$a)object).k = n3;
        ImageView imageView2 = this.imageView;
        ((da$a)object).n = "https://assets.ajio.com/cms/AJIO/MOBILE/progress_bar_yellow_logo.gif";
        ((da$a)object).u = imageView2;
        ((da$a)object).v = n3;
        ((da$a)object).a();
        this.setVisibility(8);
    }

    public void dismiss() {
        int n3 = this.ref;
        if (n3 == 0) {
            this.dismissDialog();
            return;
        }
        this.ref = n3 += -1;
        if (n3 == 0) {
            this.dismissDialog();
        }
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    public void forceDismiss() {
        this.ref = 0;
        this.dismissDialog();
    }

    public int getRef() {
        return this.ref;
    }

    public void hideMessage() {
        this.progressCustomMessage.setVisibility(8);
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        motionEvent = this.getParent();
        boolean bl2 = true;
        motionEvent.requestDisallowInterceptTouchEvent(bl2);
        return bl2;
    }

    public void setMessage(int n3) {
        this.progressCustomMessage.setText(n3);
        this.progressCustomMessage.setVisibility(0);
    }

    public void show() {
        int n3;
        this.setVisibility(0);
        this.ref = n3 = this.ref + 1;
    }

    public void showMessage() {
        this.progressCustomMessage.setVisibility(8);
    }
}

