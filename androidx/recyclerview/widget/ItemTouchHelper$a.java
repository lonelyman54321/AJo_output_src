/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.MotionEvent
 *  android.view.VelocityTracker
 *  android.view.View
 */
package androidx.recyclerview.widget;

import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.ItemTouchHelper$1;
import androidx.recyclerview.widget.ItemTouchHelper$c;
import androidx.recyclerview.widget.ItemTouchHelper$e;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$B;
import androidx.recyclerview.widget.RecyclerView$r;
import java.util.ArrayList;

public final class ItemTouchHelper$a
implements RecyclerView$r {
    public final /* synthetic */ ItemTouchHelper a;

    public ItemTouchHelper$a(ItemTouchHelper itemTouchHelper) {
        this.a = itemTouchHelper;
    }

    public final void a(RecyclerView object, MotionEvent object2) {
        block10: {
            int n3;
            block7: {
                RecyclerView$B recyclerView$B;
                int n4;
                int n7;
                Object object3;
                block8: {
                    block9: {
                        object = this.a;
                        ((ItemTouchHelper)object).x.onTouchEvent((MotionEvent)object2);
                        object3 = ((ItemTouchHelper)object).t;
                        if (object3 != null) {
                            object3.addMovement((MotionEvent)object2);
                        }
                        if ((n7 = ((ItemTouchHelper)object).l) == (n3 = -1)) {
                            return;
                        }
                        n7 = object2.getActionMasked();
                        n4 = ((ItemTouchHelper)object).l;
                        if ((n4 = object2.findPointerIndex(n4)) >= 0) {
                            ((ItemTouchHelper)object).g(n7, n4, (MotionEvent)object2);
                        }
                        if ((recyclerView$B = ((ItemTouchHelper)object).c) == null) {
                            return;
                        }
                        int n8 = 0;
                        int n10 = 1;
                        if (n7 == n10) break block7;
                        int n14 = 2;
                        if (n7 == n14) break block8;
                        n4 = 3;
                        if (n7 == n4) break block9;
                        n3 = 6;
                        if (n7 == n3 && (n3 = object2.getPointerId(n7 = object2.getActionIndex())) == (n4 = ((ItemTouchHelper)object).l)) {
                            if (n7 == 0) {
                                n8 = 1;
                            }
                            ((ItemTouchHelper)object).l = n3 = object2.getPointerId(n8);
                            n3 = ((ItemTouchHelper)object).o;
                            ((ItemTouchHelper)object).p(n3, n7, (MotionEvent)object2);
                        }
                        break block10;
                    }
                    object2 = ((ItemTouchHelper)object).t;
                    if (object2 == null) break block7;
                    object2.clear();
                    break block7;
                }
                if (n4 >= 0) {
                    n7 = ((ItemTouchHelper)object).o;
                    ((ItemTouchHelper)object).p(n7, n4, (MotionEvent)object2);
                    ((ItemTouchHelper)object).m(recyclerView$B);
                    object2 = ((ItemTouchHelper)object).r;
                    object3 = ((ItemTouchHelper)object).s;
                    object2.removeCallbacks((Runnable)object3);
                    object2 = (ItemTouchHelper$1)((ItemTouchHelper)object).s;
                    ((ItemTouchHelper$1)object2).run();
                    object = ((ItemTouchHelper)object).r;
                    object.invalidate();
                }
                break block10;
            }
            object2 = null;
            ((ItemTouchHelper)object).o(null, 0);
            ((ItemTouchHelper)object).l = n3;
        }
    }

    public final boolean c(RecyclerView object, MotionEvent motionEvent) {
        object = this.a;
        Object object2 = ((ItemTouchHelper)object).x;
        object2.onTouchEvent(motionEvent);
        int n3 = motionEvent.getActionMasked();
        int n4 = 0;
        ItemTouchHelper$e itemTouchHelper$e = null;
        int n7 = 1;
        if (n3 == 0) {
            float f5;
            ((ItemTouchHelper)object).l = n3 = motionEvent.getPointerId(0);
            ((ItemTouchHelper)object).d = f5 = motionEvent.getX();
            ((ItemTouchHelper)object).e = f5 = motionEvent.getY();
            object2 = ((ItemTouchHelper)object).t;
            if (object2 != null) {
                object2.recycle();
            }
            object2 = VelocityTracker.obtain();
            ((ItemTouchHelper)object).t = object2;
            object2 = ((ItemTouchHelper)object).c;
            if (object2 == null) {
                Object object3;
                object2 = ((ItemTouchHelper)object).p;
                boolean bl2 = ((ArrayList)object2).isEmpty();
                if (!bl2) {
                    object3 = ((ItemTouchHelper)object).j(motionEvent);
                    for (int i3 = ((ArrayList)object2).size() - n7; i3 >= 0; i3 += -1) {
                        ItemTouchHelper$e itemTouchHelper$e2 = (ItemTouchHelper$e)((ArrayList)object2).get(i3);
                        View view = itemTouchHelper$e2.e.itemView;
                        if (view != object3) continue;
                        itemTouchHelper$e = itemTouchHelper$e2;
                        break;
                    }
                }
                if (itemTouchHelper$e != null) {
                    f5 = ((ItemTouchHelper)object).d;
                    float f6 = itemTouchHelper$e.i;
                    ((ItemTouchHelper)object).d = f5 -= f6;
                    f5 = ((ItemTouchHelper)object).e;
                    f6 = itemTouchHelper$e.j;
                    ((ItemTouchHelper)object).e = f5 -= f6;
                    object2 = itemTouchHelper$e.e;
                    ((ItemTouchHelper)object).i((RecyclerView$B)object2, n7 != 0);
                    object3 = ((ItemTouchHelper)object).a;
                    Object object4 = ((RecyclerView$B)object2).itemView;
                    bl2 = ((ArrayList)object3).remove(object4);
                    if (bl2) {
                        object3 = ((ItemTouchHelper)object).m;
                        object4 = ((ItemTouchHelper)object).r;
                        ((ItemTouchHelper$c)object3).clearView((RecyclerView)object4, (RecyclerView$B)object2);
                    }
                    n4 = itemTouchHelper$e.f;
                    ((ItemTouchHelper)object).o((RecyclerView$B)object2, n4);
                    n3 = ((ItemTouchHelper)object).o;
                    ((ItemTouchHelper)object).p(n3, 0, motionEvent);
                }
            }
        } else {
            int n8 = 3;
            float f7 = 4.2E-45f;
            int n10 = -1;
            if (n3 != n8 && n3 != n7) {
                n4 = ((ItemTouchHelper)object).l;
                if (n4 != n10 && (n4 = motionEvent.findPointerIndex(n4)) >= 0) {
                    ((ItemTouchHelper)object).g(n3, n4, motionEvent);
                }
            } else {
                ((ItemTouchHelper)object).l = n10;
                ((ItemTouchHelper)object).o(null, 0);
            }
        }
        if ((object2 = ((ItemTouchHelper)object).t) != null) {
            object2.addMovement(motionEvent);
        }
        if ((object = ((ItemTouchHelper)object).c) == null) {
            n7 = 0;
        }
        return n7 != 0;
    }

    public final void e(boolean bl2) {
        if (!bl2) {
            return;
        }
        this.a.o(null, 0);
    }
}

