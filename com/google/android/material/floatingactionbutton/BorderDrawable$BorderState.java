/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.drawable.Drawable
 *  android.graphics.drawable.Drawable$ConstantState
 */
package com.google.android.material.floatingactionbutton;

import android.graphics.drawable.Drawable;
import com.google.android.material.floatingactionbutton.BorderDrawable;
import com.google.android.material.floatingactionbutton.BorderDrawable$1;

class BorderDrawable$BorderState
extends Drawable.ConstantState {
    final /* synthetic */ BorderDrawable this$0;

    private BorderDrawable$BorderState(BorderDrawable borderDrawable) {
        this.this$0 = borderDrawable;
    }

    public /* synthetic */ BorderDrawable$BorderState(BorderDrawable borderDrawable, BorderDrawable$1 borderDrawable$1) {
        this(borderDrawable);
    }

    public int getChangingConfigurations() {
        return 0;
    }

    public Drawable newDrawable() {
        return this.this$0;
    }
}

