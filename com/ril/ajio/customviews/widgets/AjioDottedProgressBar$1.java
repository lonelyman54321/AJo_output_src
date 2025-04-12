/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.customviews.widgets;

import com.ril.ajio.customviews.widgets.AjioDottedProgressBar;

class AjioDottedProgressBar$1
implements Runnable {
    final /* synthetic */ AjioDottedProgressBar this$0;

    public AjioDottedProgressBar$1(AjioDottedProgressBar ajioDottedProgressBar) {
        this.this$0 = ajioDottedProgressBar;
    }

    public void run() {
        AjioDottedProgressBar ajioDottedProgressBar = this.this$0;
        int n3 = AjioDottedProgressBar.c(ajioDottedProgressBar);
        AjioDottedProgressBar ajioDottedProgressBar2 = this.this$0;
        int n4 = AjioDottedProgressBar.e(ajioDottedProgressBar2) + n3;
        AjioDottedProgressBar.f(ajioDottedProgressBar, n4);
        ajioDottedProgressBar = this.this$0;
        int n7 = AjioDottedProgressBar.c(ajioDottedProgressBar);
        n3 = 1;
        if (n7 < 0) {
            AjioDottedProgressBar.f(this.this$0, n3);
            ajioDottedProgressBar = this.this$0;
            AjioDottedProgressBar.g(ajioDottedProgressBar, n3);
        } else {
            ajioDottedProgressBar = this.this$0;
            n7 = AjioDottedProgressBar.c(ajioDottedProgressBar);
            if (n7 > (n4 = AjioDottedProgressBar.a(ajioDottedProgressBar2 = this.this$0) - n3)) {
                ajioDottedProgressBar = this.this$0;
                n7 = AjioDottedProgressBar.a(ajioDottedProgressBar) + -2;
                if (n7 >= 0) {
                    ajioDottedProgressBar = this.this$0;
                    n3 = AjioDottedProgressBar.a(ajioDottedProgressBar) + -2;
                    AjioDottedProgressBar.f(ajioDottedProgressBar, n3);
                    ajioDottedProgressBar = this.this$0;
                    n3 = -1;
                    AjioDottedProgressBar.g(ajioDottedProgressBar, n3);
                } else {
                    ajioDottedProgressBar = this.this$0;
                    n4 = 0;
                    ajioDottedProgressBar2 = null;
                    AjioDottedProgressBar.f(ajioDottedProgressBar, 0);
                    ajioDottedProgressBar = this.this$0;
                    AjioDottedProgressBar.g(ajioDottedProgressBar, n3);
                }
            }
        }
        this.this$0.invalidate();
        ajioDottedProgressBar = AjioDottedProgressBar.b(this.this$0);
        Runnable runnable2 = AjioDottedProgressBar.d(this.this$0);
        ajioDottedProgressBar.postDelayed(runnable2, 300L);
    }
}

