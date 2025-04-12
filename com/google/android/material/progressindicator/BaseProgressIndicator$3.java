/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.drawable.Drawable
 */
package com.google.android.material.progressindicator;

import android.graphics.drawable.Drawable;
import com.google.android.material.progressindicator.BaseProgressIndicator;

class BaseProgressIndicator$3
extends Mj {
    final /* synthetic */ BaseProgressIndicator this$0;

    public BaseProgressIndicator$3(BaseProgressIndicator baseProgressIndicator) {
        this.this$0 = baseProgressIndicator;
    }

    public void onAnimationEnd(Drawable object) {
        this.this$0.setIndeterminate(false);
        object = this.this$0;
        int n3 = BaseProgressIndicator.access$300((BaseProgressIndicator)((Object)object));
        boolean bl2 = BaseProgressIndicator.access$400(this.this$0);
        ((BaseProgressIndicator)((Object)object)).setProgressCompat(n3, bl2);
    }
}

