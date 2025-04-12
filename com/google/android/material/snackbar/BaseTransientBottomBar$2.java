/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.ViewGroup$MarginLayoutParams
 */
package com.google.android.material.snackbar;

import android.view.ViewGroup;
import com.google.android.material.internal.WindowUtils;
import com.google.android.material.snackbar.BaseTransientBottomBar;

class BaseTransientBottomBar$2
implements Runnable {
    final /* synthetic */ BaseTransientBottomBar this$0;

    public BaseTransientBottomBar$2(BaseTransientBottomBar baseTransientBottomBar) {
        this.this$0 = baseTransientBottomBar;
    }

    public void run() {
        Object object = this.this$0;
        Object object2 = object.view;
        if (object2 != null && (object = BaseTransientBottomBar.access$000(object)) != null) {
            object = WindowUtils.getCurrentWindowBounds(BaseTransientBottomBar.access$000(this.this$0));
            int n3 = object.height();
            int n4 = BaseTransientBottomBar.access$100(this.this$0);
            n3 -= n4;
            float f5 = this.this$0.view.getTranslationY();
            n4 = (int)f5;
            object2 = this.this$0;
            if ((n3 += n4) >= (n4 = BaseTransientBottomBar.access$200((BaseTransientBottomBar)object2))) {
                object = this.this$0;
                n4 = BaseTransientBottomBar.access$200(object);
                BaseTransientBottomBar.access$302(object, n4);
                return;
            }
            object2 = this.this$0.view.getLayoutParams();
            int n7 = object2 instanceof ViewGroup.MarginLayoutParams;
            if (n7 == 0) {
                BaseTransientBottomBar.access$400();
                return;
            }
            BaseTransientBottomBar baseTransientBottomBar = this.this$0;
            int n8 = BaseTransientBottomBar.access$200(baseTransientBottomBar);
            BaseTransientBottomBar.access$302(baseTransientBottomBar, n8);
            object2 = (ViewGroup.MarginLayoutParams)object2;
            n7 = ((ViewGroup.MarginLayoutParams)object2).bottomMargin;
            BaseTransientBottomBar baseTransientBottomBar2 = this.this$0;
            ((ViewGroup.MarginLayoutParams)object2).bottomMargin = n8 = BaseTransientBottomBar.access$200(baseTransientBottomBar2) - n3 + n7;
            object = this.this$0.view;
            object.requestLayout();
        }
    }
}

