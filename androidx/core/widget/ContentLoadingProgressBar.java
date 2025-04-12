/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.util.AttributeSet
 *  android.widget.ProgressBar
 */
package androidx.core.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ProgressBar;

public class ContentLoadingProgressBar
extends ProgressBar {
    public static final /* synthetic */ int c;
    public final S60 a;
    public final T60 b;

    public ContentLoadingProgressBar(Context context) {
        this(context, null);
    }

    public ContentLoadingProgressBar(Context object, AttributeSet attributeSet) {
        super(object, attributeSet, 0);
        super(this);
        this.a = object;
        super(this);
        this.b = object;
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Runnable runnable2 = this.a;
        this.removeCallbacks(runnable2);
        runnable2 = this.b;
        this.removeCallbacks(runnable2);
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Runnable runnable2 = this.a;
        this.removeCallbacks(runnable2);
        runnable2 = this.b;
        this.removeCallbacks(runnable2);
    }
}

