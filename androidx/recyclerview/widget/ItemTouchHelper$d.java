/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.GestureDetector$SimpleOnGestureListener
 *  android.view.MotionEvent
 *  android.view.View
 */
package androidx.recyclerview.widget;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.ItemTouchHelper$c;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$B;

public final class ItemTouchHelper$d
extends GestureDetector.SimpleOnGestureListener {
    public boolean a = true;
    public final /* synthetic */ ItemTouchHelper b;

    public ItemTouchHelper$d(ItemTouchHelper itemTouchHelper) {
        this.b = itemTouchHelper;
    }

    public final boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    public final void onLongPress(MotionEvent object) {
        Object object2;
        boolean bl2 = this.a;
        if (!bl2) {
            return;
        }
        ItemTouchHelper itemTouchHelper = this.b;
        Object object3 = itemTouchHelper.j((MotionEvent)object);
        if (object3 != null && (object3 = ((RecyclerView)(object2 = itemTouchHelper.r)).getChildViewHolder((View)object3)) != null) {
            int n3;
            object2 = itemTouchHelper.m;
            RecyclerView recyclerView = itemTouchHelper.r;
            boolean n4 = ((ItemTouchHelper$c)object2).hasDragFlag(recyclerView, (RecyclerView$B)object3);
            if (!n4) {
                return;
            }
            object2 = null;
            int n7 = object.getPointerId(0);
            if (n7 == (n3 = itemTouchHelper.l)) {
                int n8 = object.findPointerIndex(n3);
                float f5 = object.getX(n8);
                float f6 = object.getY(n8);
                itemTouchHelper.d = f5;
                itemTouchHelper.e = f6;
                f6 = 0.0f;
                itemTouchHelper.i = 0.0f;
                itemTouchHelper.h = 0.0f;
                object = itemTouchHelper.m;
                boolean bl3 = ((ItemTouchHelper$c)object).isLongPressDragEnabled();
                if (bl3) {
                    int n10 = 2;
                    f6 = 2.8E-45f;
                    itemTouchHelper.o((RecyclerView$B)object3, n10);
                }
            }
        }
    }
}

