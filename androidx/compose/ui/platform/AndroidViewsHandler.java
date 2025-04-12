/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.Canvas
 *  android.view.MotionEvent
 *  android.view.View
 *  android.view.View$MeasureSpec
 *  android.view.ViewGroup
 */
package androidx.compose.ui.platform;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.viewinterop.AndroidViewHolder;
import java.util.HashMap;
import java.util.Iterator;

public final class AndroidViewsHandler
extends ViewGroup {
    public final HashMap a;
    public final HashMap b;

    public AndroidViewsHandler(Context object) {
        super(object);
        this.setClipChildren(false);
        super();
        this.a = object;
        super();
        this.b = object;
    }

    public final void dispatchDraw(Canvas canvas) {
    }

    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    public final HashMap getHolderToLayoutNode() {
        return this.a;
    }

    public final HashMap getLayoutNodeToHolder() {
        return this.b;
    }

    public final void onDescendantInvalidated(View view, View view2) {
    }

    public final void onLayout(boolean bl2, int n3, int n4, int n7, int n8) {
        Iterator iterator = ((Iterable)this.a.keySet()).iterator();
        while ((n3 = (int)(iterator.hasNext() ? 1 : 0)) != 0) {
            AndroidViewHolder androidViewHolder = (AndroidViewHolder)iterator.next();
            n4 = androidViewHolder.getLeft();
            n7 = androidViewHolder.getTop();
            n8 = androidViewHolder.getRight();
            int n10 = androidViewHolder.getBottom();
            androidViewHolder.layout(n4, n7, n8, n10);
        }
    }

    public final void onMeasure(int n3, int n4) {
        int n7 = View.MeasureSpec.getMode((int)n3);
        int n8 = 0;
        int n10 = 1;
        int n14 = 0x40000000;
        if ((n7 = n7 == n14 ? 1 : 0) != 0) {
            n7 = View.MeasureSpec.getMode((int)n4);
            if (n7 == n14) {
                n8 = 1;
            }
            if (n8 != 0) {
                n3 = View.MeasureSpec.getSize((int)n3);
                n4 = View.MeasureSpec.getSize((int)n4);
                this.setMeasuredDimension(n3, n4);
                Iterator iterator = ((Iterable)this.a.keySet()).iterator();
                while ((n4 = (int)(iterator.hasNext() ? 1 : 0)) != 0) {
                    AndroidViewHolder androidViewHolder = (AndroidViewHolder)iterator.next();
                    n7 = androidViewHolder.r;
                    n8 = -1 << -1;
                    if (n7 == n8 || (n10 = androidViewHolder.s) == n8) continue;
                    androidViewHolder.measure(n7, n10);
                }
                return;
            }
            bh1_1.b("heightMeasureSpec should be EXACTLY");
            throw null;
        }
        bh1_1.b("widthMeasureSpec should be EXACTLY");
        throw null;
    }

    public final void requestLayout() {
        this.cleanupLayoutState((View)this);
        int n3 = this.getChildCount();
        for (int i3 = 0; i3 < n3; ++i3) {
            View view = this.getChildAt(i3);
            xp1_0 xp1_02 = (xp1_0)this.a.get(view);
            int n4 = view.isLayoutRequested();
            if (n4 == 0 || xp1_02 == null) continue;
            n4 = 7;
            xp1_0.Z(xp1_02, false, n4);
        }
    }

    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}

