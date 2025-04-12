/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.Canvas
 *  android.graphics.drawable.Drawable
 *  android.util.AttributeSet
 *  android.view.View
 *  android.widget.SeekBar
 */
package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.SeekBar;
import androidx.appcompat.R$attr;

public class AppCompatSeekBar
extends SeekBar {
    public final yn a;

    public AppCompatSeekBar(Context context) {
        this(context, null);
    }

    public AppCompatSeekBar(Context context, AttributeSet attributeSet) {
        int n3 = R$attr.seekBarStyle;
        this(context, attributeSet, n3);
    }

    public AppCompatSeekBar(Context object, AttributeSet attributeSet, int n3) {
        super((Context)object, attributeSet, n3);
        Um3.a(this.getContext(), (View)this);
        super(this);
        this.a = object;
        ((yn)object).a(attributeSet, n3);
    }

    public final void drawableStateChanged() {
        int[] nArray;
        boolean bl2;
        super.drawableStateChanged();
        yn yn3 = this.a;
        Drawable drawable2 = yn3.e;
        if (drawable2 != null && (bl2 = drawable2.isStateful()) && (bl2 = drawable2.setState(nArray = (yn3 = yn3.d).getDrawableState()))) {
            yn3.invalidateDrawable(drawable2);
        }
    }

    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable2 = this.a.e;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void onDraw(Canvas canvas) {
        synchronized (this) {
            super.onDraw(canvas);
            yn yn3 = this.a;
            yn3.d(canvas);
            return;
        }
    }
}

