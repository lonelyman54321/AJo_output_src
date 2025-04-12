/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.util.AttributeSet
 */
package com.ril.ajio.customviews.widgets;

import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import com.ril.ajio.customviews.widgets.AjioEllipsisTextView$EllipsisListener;
import kotlin.jvm.internal.Intrinsics;

public final class AjioEllipsisTextView
extends AppCompatTextView {
    public static final int $stable = 8;
    private boolean ellipses;
    private AjioEllipsisTextView$EllipsisListener ellipsesListener;

    public AjioEllipsisTextView(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super(context);
    }

    public AjioEllipsisTextView(Context context, AttributeSet attributeSet) {
        Intrinsics.checkNotNullParameter(context, "context");
        super(context, attributeSet);
    }

    public AjioEllipsisTextView(Context context, AttributeSet attributeSet, int n3) {
        Intrinsics.checkNotNullParameter(context, "context");
        super(context, attributeSet, n3);
    }

    public final boolean hadEllipses() {
        return this.ellipses;
    }

    public void layout(int n3, int n4, int n7, int n8) {
        super.layout(n3, n4, n7, n8);
        n3 = 0;
        this.ellipses = false;
        Object object = this.getLayout();
        if (object != null && (n4 = object.getLineCount()) > 0 && (n3 = object.getEllipsisCount(n4 -= (n7 = 1))) > 0) {
            this.ellipses = n7;
        }
        if ((object = this.ellipsesListener) != null) {
            n4 = (int)(this.ellipses ? 1 : 0);
            object.ellipsisStateChanged(n4 != 0);
        }
    }

    public final void setEllipsesListener(AjioEllipsisTextView$EllipsisListener ajioEllipsisTextView$EllipsisListener) {
        Intrinsics.checkNotNullParameter(ajioEllipsisTextView$EllipsisListener, "listener");
        this.ellipsesListener = ajioEllipsisTextView$EllipsisListener;
    }
}

