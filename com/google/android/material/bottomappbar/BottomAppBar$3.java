/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
package com.google.android.material.bottomappbar;

import android.view.View;
import androidx.core.view.f;
import com.google.android.material.bottomappbar.BottomAppBar;
import com.google.android.material.internal.ViewUtils$OnApplyWindowInsetsListener;
import com.google.android.material.internal.ViewUtils$RelativePadding;

class BottomAppBar$3
implements ViewUtils$OnApplyWindowInsetsListener {
    final /* synthetic */ BottomAppBar this$0;

    public BottomAppBar$3(BottomAppBar bottomAppBar) {
        this.this$0 = bottomAppBar;
    }

    public f onApplyWindowInsets(View object, f f5, ViewUtils$RelativePadding viewUtils$RelativePadding) {
        int n3;
        BottomAppBar bottomAppBar;
        int n4;
        int n7;
        object = this.this$0;
        int n8 = BottomAppBar.access$700((BottomAppBar)object);
        if (n8 != 0) {
            object = this.this$0;
            n7 = f5.a();
            BottomAppBar.access$802((BottomAppBar)object, n7);
        }
        object = this.this$0;
        n8 = BottomAppBar.access$900((BottomAppBar)object);
        n7 = 1;
        int n10 = 0;
        BottomAppBar bottomAppBar2 = null;
        if (n8 != 0) {
            object = this.this$0;
            n8 = BottomAppBar.access$1000((BottomAppBar)object);
            if (n8 != (n4 = f5.b())) {
                n8 = 1;
            } else {
                n8 = 0;
                object = null;
            }
            bottomAppBar = this.this$0;
            n3 = f5.b();
            BottomAppBar.access$1002(bottomAppBar, n3);
        } else {
            n8 = 0;
            object = null;
        }
        bottomAppBar = this.this$0;
        n4 = (int)(BottomAppBar.access$1100(bottomAppBar) ? 1 : 0);
        if (n4 != 0) {
            bottomAppBar = this.this$0;
            n4 = BottomAppBar.access$1200(bottomAppBar);
            if (n4 == (n3 = f5.c())) {
                n7 = 0;
            }
            bottomAppBar2 = this.this$0;
            n4 = f5.c();
            BottomAppBar.access$1202(bottomAppBar2, n4);
            n10 = n7;
        }
        if (n8 != 0 || n10 != 0) {
            BottomAppBar.access$1300(this.this$0);
            BottomAppBar.access$1400(this.this$0);
            object = this.this$0;
            BottomAppBar.access$1500((BottomAppBar)object);
        }
        return f5;
    }
}

