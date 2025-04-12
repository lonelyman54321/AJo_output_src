/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.res.Resources
 *  android.graphics.Bitmap
 *  android.graphics.Bitmap$Config
 *  android.graphics.Canvas
 *  android.graphics.Rect
 *  android.graphics.drawable.BitmapDrawable
 *  android.view.View
 */
package com.getkeepsafe.taptargetview;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.view.View;
import com.getkeepsafe.taptargetview.ViewTapTarget;

class ViewTapTarget$1
implements Runnable {
    final /* synthetic */ ViewTapTarget this$0;
    final /* synthetic */ Runnable val$runnable;

    public ViewTapTarget$1(ViewTapTarget viewTapTarget, Runnable runnable2) {
        this.this$0 = viewTapTarget;
        this.val$runnable = runnable2;
    }

    public void run() {
        Rect rect;
        Object object = new int[2];
        this.this$0.view.getLocationOnScreen(object);
        ViewTapTarget viewTapTarget = this.this$0;
        int n3 = object[0];
        int n4 = 1;
        int n7 = object[n4];
        View view = this.this$0.view;
        int n8 = view.getWidth() + n3;
        int n10 = object[n4];
        View view2 = this.this$0.view;
        n4 = view2.getHeight() + n10;
        viewTapTarget.bounds = rect = new Rect(n3, n7, n8, n4);
        object = this.this$0;
        viewTapTarget = object.icon;
        if (viewTapTarget == null && (n10 = (object = (Object)object.view).getWidth()) > 0 && (n10 = (object = (Object)this.this$0.view).getHeight()) > 0) {
            n10 = this.this$0.view.getWidth();
            int n14 = this.this$0.view.getHeight();
            rect = Bitmap.Config.ARGB_8888;
            object = Bitmap.createBitmap((int)n10, (int)n14, (Bitmap.Config)rect);
            viewTapTarget = new Canvas((Bitmap)object);
            this.this$0.view.draw((Canvas)viewTapTarget);
            viewTapTarget = this.this$0;
            Resources resources = this.this$0.view.getContext().getResources();
            rect = new BitmapDrawable(resources, (Bitmap)object);
            viewTapTarget.icon = rect;
            object = this.this$0.icon;
            n14 = object.getIntrinsicWidth();
            rect = this.this$0.icon;
            int n15 = rect.getIntrinsicHeight();
            object.setBounds(0, 0, n14, n15);
        }
        this.val$runnable.run();
    }
}

