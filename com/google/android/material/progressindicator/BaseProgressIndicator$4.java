/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.drawable.Drawable
 */
package com.google.android.material.progressindicator;

import android.graphics.drawable.Drawable;
import com.google.android.material.progressindicator.BaseProgressIndicator;

class BaseProgressIndicator$4
extends Mj {
    final /* synthetic */ BaseProgressIndicator this$0;

    public BaseProgressIndicator$4(BaseProgressIndicator baseProgressIndicator) {
        this.this$0 = baseProgressIndicator;
    }

    public void onAnimationEnd(Drawable object) {
        super.onAnimationEnd((Drawable)object);
        object = this.this$0;
        boolean bl2 = BaseProgressIndicator.access$500((BaseProgressIndicator)((Object)object));
        if (!bl2) {
            object = this.this$0;
            int n3 = BaseProgressIndicator.access$600((BaseProgressIndicator)((Object)object));
            object.setVisibility(n3);
        }
    }
}

