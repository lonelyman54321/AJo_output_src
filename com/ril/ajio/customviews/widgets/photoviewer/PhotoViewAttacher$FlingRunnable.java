/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.Matrix
 *  android.graphics.RectF
 *  android.view.View
 */
package com.ril.ajio.customviews.widgets.photoviewer;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.view.View;
import com.ril.ajio.customviews.widgets.photoviewer.Compat;
import com.ril.ajio.customviews.widgets.photoviewer.PhotoViewAttacher;
import com.ril.ajio.customviews.widgets.photoviewer.log.LogManager;
import com.ril.ajio.customviews.widgets.photoviewer.log.Logger;
import com.ril.ajio.customviews.widgets.photoviewer.scrollerproxy.ScrollerProxy;

class PhotoViewAttacher$FlingRunnable
implements Runnable {
    private int mCurrentX;
    private int mCurrentY;
    private final ScrollerProxy mScroller;
    final /* synthetic */ PhotoViewAttacher this$0;

    public PhotoViewAttacher$FlingRunnable(PhotoViewAttacher object, Context context) {
        this.this$0 = object;
        this.mScroller = object = ScrollerProxy.getScroller(context);
    }

    public void cancelFling() {
        boolean bl2 = PhotoViewAttacher.f();
        if (bl2) {
            Logger logger = LogManager.getLogger();
            String string2 = "PhotoViewAttacher";
            String string3 = "Cancel Fling";
            logger.d(string2, string3);
        }
        this.mScroller.forceFinished(true);
    }

    public void fling(int n3, int n4, int n7, int n8) {
        Object object;
        int n10;
        int n14;
        int n15;
        int n16;
        int n17;
        PhotoViewAttacher$FlingRunnable photoViewAttacher$FlingRunnable = this;
        Object object2 = this.this$0.getDisplayRect();
        if (object2 == null) {
            return;
        }
        int n18 = Math.round(-((RectF)object2).left);
        int n19 = n3;
        float f5 = n3;
        float f6 = object2.width();
        String string2 = null;
        Object object3 = f5 == f6 ? 0 : (f5 < f6 ? -1 : 1);
        if (object3 < 0) {
            f6 = object2.width() - f5;
            n17 = n19 = Math.round(f6);
            n16 = 0;
        } else {
            n16 = n18;
            n17 = n18;
        }
        f5 = -((RectF)object2).top;
        n19 = Math.round(f5);
        object3 = n4;
        f6 = n4;
        float f7 = object2.height();
        float f8 = f6 == f7 ? 0 : (f6 < f7 ? -1 : 1);
        if (f8 < 0) {
            float f11 = object2.height() - f6;
            n14 = n15 = Math.round(f11);
            n10 = 0;
        } else {
            n10 = n19;
            n14 = n19;
        }
        photoViewAttacher$FlingRunnable.mCurrentX = n18;
        photoViewAttacher$FlingRunnable.mCurrentY = n19;
        n15 = (int)(PhotoViewAttacher.f() ? 1 : 0);
        if (n15 != 0) {
            object2 = LogManager.getLogger();
            String string3 = " MaxX:";
            object = fQ2.a("fling. StartX:", " StartY:", string3, n18, n19);
            object = Xd0.a(" MaxY:", n17, n14, (StringBuilder)object);
            string2 = "PhotoViewAttacher";
            object2.d(string2, (String)object);
        }
        if (n18 != n17 || n19 != n14) {
            object = photoViewAttacher$FlingRunnable.mScroller;
            f8 = n7;
            ((ScrollerProxy)object).fling(n18, n19, n7, n8, n16, n17, n10, n14, 0, 0);
        }
    }

    public void run() {
        ScrollerProxy scrollerProxy;
        int n3;
        ScrollerProxy scrollerProxy2 = this.mScroller;
        boolean bl2 = scrollerProxy2.isFinished();
        if (bl2) {
            return;
        }
        scrollerProxy2 = this.this$0.getImageView();
        if (scrollerProxy2 != null && (n3 = (scrollerProxy = this.mScroller).computeScrollOffset()) != 0) {
            int n4;
            CharSequence charSequence;
            Object object;
            scrollerProxy = this.mScroller;
            n3 = scrollerProxy.getCurrX();
            ScrollerProxy scrollerProxy3 = this.mScroller;
            int n7 = scrollerProxy3.getCurrY();
            boolean bl3 = PhotoViewAttacher.f();
            if (bl3) {
                object = LogManager.getLogger();
                charSequence = new StringBuilder("fling run(). CurrentX:");
                n4 = this.mCurrentX;
                charSequence.append(n4);
                charSequence.append(" CurrentY:");
                n4 = this.mCurrentY;
                String string2 = " NewX:";
                String string3 = " NewY:";
                m10.a(charSequence, n4, string2, n3, string3);
                charSequence.append(n7);
                charSequence = charSequence.toString();
                String string4 = "PhotoViewAttacher";
                object.d(string4, (String)charSequence);
            }
            object = PhotoViewAttacher.c(this.this$0);
            int n8 = this.mCurrentX - n3;
            float f5 = n8;
            n4 = this.mCurrentY - n7;
            float f6 = n4;
            object.postTranslate(f5, f6);
            object = this.this$0;
            charSequence = PhotoViewAttacher.d((PhotoViewAttacher)object);
            PhotoViewAttacher.e((PhotoViewAttacher)object, (Matrix)charSequence);
            this.mCurrentX = n3;
            this.mCurrentY = n7;
            Compat.postOnAnimation((View)scrollerProxy2, this);
        }
    }
}

