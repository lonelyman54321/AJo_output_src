/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
package com.google.android.material.snackbar;

import android.view.View;
import androidx.core.view.f;
import com.google.android.material.snackbar.BaseTransientBottomBar;

class BaseTransientBottomBar$3
implements T72 {
    final /* synthetic */ BaseTransientBottomBar this$0;

    public BaseTransientBottomBar$3(BaseTransientBottomBar baseTransientBottomBar) {
        this.this$0 = baseTransientBottomBar;
    }

    public f onApplyWindowInsets(View object, f f5) {
        object = this.this$0;
        int n3 = f5.a();
        BaseTransientBottomBar.access$602((BaseTransientBottomBar)object, n3);
        object = this.this$0;
        n3 = f5.b();
        BaseTransientBottomBar.access$702((BaseTransientBottomBar)object, n3);
        object = this.this$0;
        n3 = f5.c();
        BaseTransientBottomBar.access$802((BaseTransientBottomBar)object, n3);
        BaseTransientBottomBar.access$900(this.this$0);
        return f5;
    }
}

