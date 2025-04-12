/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Canvas
 *  android.graphics.Rect
 *  android.view.GestureDetector
 *  android.view.MotionEvent
 *  android.view.VelocityTracker
 *  android.view.View
 */
package androidx.recyclerview.widget;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import androidx.recyclerview.widget.ItemTouchHelper$1;
import androidx.recyclerview.widget.ItemTouchHelper$a;
import androidx.recyclerview.widget.ItemTouchHelper$b;
import androidx.recyclerview.widget.ItemTouchHelper$c;
import androidx.recyclerview.widget.ItemTouchHelper$d;
import androidx.recyclerview.widget.ItemTouchHelper$e;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$B;
import androidx.recyclerview.widget.RecyclerView$n;
import androidx.recyclerview.widget.RecyclerView$o;
import androidx.recyclerview.widget.RecyclerView$p;
import androidx.recyclerview.widget.RecyclerView$y;
import java.util.ArrayList;
import java.util.List;

public final class ItemTouchHelper
extends RecyclerView$n
implements RecyclerView$p {
    public Rect A;
    public long B;
    public final ArrayList a;
    public final float[] b;
    public RecyclerView$B c;
    public float d;
    public float e;
    public float f;
    public float g;
    public float h;
    public float i;
    public float j;
    public float k;
    public int l;
    public final ItemTouchHelper$c m;
    public int n;
    public int o;
    public final ArrayList p;
    public int q;
    public RecyclerView r;
    public final Runnable s;
    public VelocityTracker t;
    public ArrayList u;
    public ArrayList v;
    public View w;
    public GestureDetector x;
    public ItemTouchHelper$d y;
    public final ItemTouchHelper$a z;

    public ItemTouchHelper(q52_0 q52_02) {
        Object object = new ArrayList();
        this.a = object;
        object = new float[2];
        this.b = (float[])object;
        this.c = null;
        this.l = -1;
        this.n = 0;
        Object object2 = new ArrayList();
        this.p = object2;
        this.s = object2 = new ItemTouchHelper$1(this);
        this.w = null;
        this.z = object = new ItemTouchHelper$a(this);
        this.m = q52_02;
    }

    public static boolean l(View view, float f5, float f6, float f7, float f8) {
        float f11;
        float f12;
        int n3;
        float f14;
        float f15;
        float f16;
        Object object = f5 == f7 ? 0 : (f5 > f7 ? 1 : -1);
        if (object >= 0 && (f16 = (f15 = f5 - (f7 += (f14 = (float)(object = (Object)view.getWidth())))) == 0.0f ? 0 : (f15 < 0.0f ? -1 : 1)) <= 0 && (f16 = f6 == f8 ? 0 : (f6 > f8 ? 1 : -1)) >= 0 && (n3 = (f12 = f6 - (f8 += (f11 = (float)view.getHeight()))) == 0.0f ? 0 : (f12 < 0.0f ? -1 : 1)) <= 0) {
            n3 = 1;
            f11 = Float.MIN_VALUE;
        } else {
            n3 = 0;
            f11 = 0.0f;
            view = null;
        }
        return n3 != 0;
    }

    public final void b(View object) {
        this.n((View)object);
        Object object2 = this.r;
        object = ((RecyclerView)object2).getChildViewHolder((View)object);
        if (object == null) {
            return;
        }
        object2 = this.c;
        Object object3 = null;
        if (object2 != null && object == object2) {
            object = null;
            this.o(null, 0);
        } else {
            this.i((RecyclerView$B)object, false);
            object2 = this.a;
            object3 = object.itemView;
            boolean bl2 = ((ArrayList)object2).remove(object3);
            if (bl2) {
                object2 = this.m;
                object3 = this.r;
                ((ItemTouchHelper$c)object2).clearView((RecyclerView)object3, (RecyclerView$B)object);
            }
        }
    }

    public final void d(View view) {
    }

    public final int f(RecyclerView$B recyclerView$B, int n3) {
        int n4 = n3 & 0xC;
        if (n4 != 0) {
            float f5;
            float f6;
            float f7;
            int n7;
            int n8;
            float f8 = this.h;
            int n10 = 4;
            float f11 = 5.6E-45f;
            int n14 = 8;
            float f12 = 1.1E-44f;
            int n15 = 0;
            float f14 = 0.0f;
            float f15 = f8 - 0.0f;
            n4 = (int)(f15 == 0.0f ? 0 : (f15 > 0.0f ? 1 : -1));
            if (n4 > 0) {
                n4 = 8;
                f8 = 1.1E-44f;
            } else {
                n4 = 4;
                f8 = 5.6E-45f;
            }
            VelocityTracker velocityTracker = this.t;
            ItemTouchHelper$c itemTouchHelper$c = this.m;
            if (velocityTracker != null && (n8 = this.l) > (n7 = -1)) {
                float f16 = this.g;
                f16 = itemTouchHelper$c.getSwipeVelocityThreshold(f16);
                velocityTracker.computeCurrentVelocity(1000, f16);
                velocityTracker = this.t;
                n8 = this.l;
                float f17 = velocityTracker.getXVelocity(n8);
                VelocityTracker velocityTracker2 = this.t;
                n7 = this.l;
                f16 = velocityTracker2.getYVelocity(n7);
                float f18 = f17 - 0.0f;
                n15 = f18 == 0.0f ? 0 : (f18 > 0.0f ? 1 : -1);
                if (n15 > 0) {
                    n10 = 8;
                    f11 = 1.1E-44f;
                }
                f12 = Math.abs(f17);
                n15 = n10 & n3;
                if (n15 != 0 && n4 == n10) {
                    float f19;
                    f14 = this.f;
                    float f20 = f12 - (f14 = itemTouchHelper$c.getSwipeEscapeVelocity(f14));
                    n15 = (int)(f20 == 0.0f ? 0 : (f20 > 0.0f ? 1 : -1));
                    if (n15 >= 0 && (n14 = (int)((f19 = f12 - (f14 = Math.abs(f16))) == 0.0f ? 0 : (f19 > 0.0f ? 1 : -1))) > 0) {
                        return n10;
                    }
                }
            }
            RecyclerView recyclerView = this.r;
            n10 = recyclerView.getWidth();
            f11 = n10;
            float f22 = itemTouchHelper$c.getSwipeThreshold(recyclerView$B) * f11;
            if ((n3 &= n4) != 0 && (f7 = (f6 = (f5 = Math.abs(this.h)) - f22) == 0.0f ? 0 : (f6 > 0.0f ? 1 : -1)) > 0) {
                return n4;
            }
        }
        return 0;
    }

    public final void g(int n3, int n4, MotionEvent motionEvent) {
        ItemTouchHelper$c itemTouchHelper$c;
        int n7;
        int n8;
        RecyclerView$B recyclerView$B = this.c;
        if (recyclerView$B == null && n3 == (n8 = 2) && (n3 = this.n) != n8 && (n7 = (itemTouchHelper$c = this.m).isItemViewSwipeEnabled()) != 0) {
            Object object;
            int n10;
            float f5;
            float f6;
            int n14;
            Object object2 = this.r;
            n7 = ((RecyclerView)object2).getScrollState();
            if (n7 == (n14 = 1)) {
                return;
            }
            object2 = this.r.getLayoutManager();
            int n15 = this.l;
            int n16 = -1;
            float f7 = 0.0f / 0.0f;
            RecyclerView$B recyclerView$B2 = null;
            if (n15 != n16) {
                n15 = motionEvent.findPointerIndex(n15);
                f7 = motionEvent.getX(n15);
                f6 = this.d;
                f7 -= f6;
                f5 = motionEvent.getY(n15);
                f6 = this.e;
                f5 -= f6;
                f7 = Math.abs(f7);
                f5 = Math.abs(f5);
                n10 = this.q;
                f6 = n10;
                float f8 = f7 - f6;
                object = f8 == 0.0f ? 0 : (f8 < 0.0f ? -1 : 1);
                if (!(object < 0 && (n10 = (int)(f5 == f6 ? 0 : (f5 < f6 ? -1 : 1))) < 0 || (n10 = (int)(f7 == f5 ? 0 : (f7 > f5 ? 1 : -1))) > 0 && (n10 = (int)(((RecyclerView$o)object2).canScrollHorizontally() ? 1 : 0)) != 0 || (n15 = (int)(f5 == f7 ? 0 : (f5 > f7 ? 1 : -1))) > 0 && (n7 = (int)(((RecyclerView$o)object2).canScrollVertically() ? 1 : 0)) != 0 || (object2 = this.j(motionEvent)) == null)) {
                    RecyclerView recyclerView = this.r;
                    recyclerView$B2 = recyclerView.getChildViewHolder((View)object2);
                }
            }
            if (recyclerView$B2 == null) {
                return;
            }
            object2 = this.r;
            n3 = itemTouchHelper$c.getAbsoluteMovementFlags((RecyclerView)object2, recyclerView$B2);
            n7 = 65280;
            float f11 = 9.1477E-41f;
            if ((n3 = (n3 & n7) >> 8) == 0) {
                return;
            }
            f11 = motionEvent.getX(n4);
            float f12 = motionEvent.getY(n4);
            f5 = this.d;
            f11 -= f5;
            f5 = this.e;
            f12 -= f5;
            f5 = Math.abs(f11);
            f7 = Math.abs(f12);
            n10 = this.q;
            f6 = n10;
            float f14 = f5 - f6;
            object = f14 == 0.0f ? 0 : (f14 < 0.0f ? -1 : 1);
            if (object < 0 && (n10 = (int)(f7 == f6 ? 0 : (f7 < f6 ? -1 : 1))) < 0) {
                return;
            }
            n10 = 0;
            f6 = 0.0f;
            n15 = (int)(f5 == f7 ? 0 : (f5 > f7 ? 1 : -1));
            if (n15 > 0) {
                float f15 = f11 - 0.0f;
                n4 = (int)(f15 == 0.0f ? 0 : (f15 < 0.0f ? -1 : 1));
                if (n4 < 0 && (n4 = n3 & 4) == 0) {
                    return;
                }
                float f16 = f11 - 0.0f;
                n4 = (int)(f16 == 0.0f ? 0 : (f16 > 0.0f ? 1 : -1));
                if (n4 > 0 && (n3 &= 8) == 0) {
                    return;
                }
            } else {
                float f17 = f12 - 0.0f;
                n7 = (int)(f17 == 0.0f ? 0 : (f17 < 0.0f ? -1 : 1));
                if (n7 < 0 && (n7 = n3 & 1) == 0) {
                    return;
                }
                float f18 = f12 - 0.0f;
                n4 = (int)(f18 == 0.0f ? 0 : (f18 > 0.0f ? 1 : -1));
                if (n4 > 0 && (n3 &= n8) == 0) {
                    return;
                }
            }
            this.i = 0.0f;
            this.h = 0.0f;
            itemTouchHelper$c = null;
            this.l = n3 = motionEvent.getPointerId(0);
            this.o(recyclerView$B2, n14);
        }
    }

    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView$y recyclerView$y) {
        rect.setEmpty();
    }

    public final int h(RecyclerView$B recyclerView$B, int n3) {
        int n4 = n3 & 3;
        if (n4 != 0) {
            float f5;
            float f6;
            float f7;
            int n7;
            int n8;
            float f8 = this.i;
            int n10 = 1;
            float f11 = Float.MIN_VALUE;
            int n14 = 2;
            float f12 = 2.8E-45f;
            int n15 = 0;
            float f14 = 0.0f;
            float f15 = f8 - 0.0f;
            n4 = (int)(f15 == 0.0f ? 0 : (f15 > 0.0f ? 1 : -1));
            if (n4 > 0) {
                n4 = 2;
                f8 = 2.8E-45f;
            } else {
                n4 = 1;
                f8 = Float.MIN_VALUE;
            }
            VelocityTracker velocityTracker = this.t;
            ItemTouchHelper$c itemTouchHelper$c = this.m;
            if (velocityTracker != null && (n8 = this.l) > (n7 = -1)) {
                float f16 = this.g;
                f16 = itemTouchHelper$c.getSwipeVelocityThreshold(f16);
                velocityTracker.computeCurrentVelocity(1000, f16);
                velocityTracker = this.t;
                n8 = this.l;
                float f17 = velocityTracker.getXVelocity(n8);
                VelocityTracker velocityTracker2 = this.t;
                n7 = this.l;
                f16 = velocityTracker2.getYVelocity(n7);
                float f18 = f16 - 0.0f;
                n15 = f18 == 0.0f ? 0 : (f18 > 0.0f ? 1 : -1);
                if (n15 > 0) {
                    n10 = 2;
                    f11 = 2.8E-45f;
                }
                f12 = Math.abs(f16);
                n15 = n10 & n3;
                if (n15 != 0 && n10 == n4) {
                    float f19;
                    f14 = this.f;
                    float f20 = f12 - (f14 = itemTouchHelper$c.getSwipeEscapeVelocity(f14));
                    n15 = (int)(f20 == 0.0f ? 0 : (f20 > 0.0f ? 1 : -1));
                    if (n15 >= 0 && (n14 = (int)((f19 = f12 - (f14 = Math.abs(f17))) == 0.0f ? 0 : (f19 > 0.0f ? 1 : -1))) > 0) {
                        return n10;
                    }
                }
            }
            RecyclerView recyclerView = this.r;
            n10 = recyclerView.getHeight();
            f11 = n10;
            float f22 = itemTouchHelper$c.getSwipeThreshold(recyclerView$B) * f11;
            if ((n3 &= n4) != 0 && (f7 = (f6 = (f5 = Math.abs(this.i)) - f22) == 0.0f ? 0 : (f6 > 0.0f ? 1 : -1)) > 0) {
                return n4;
            }
        }
        return 0;
    }

    public final void i(RecyclerView$B recyclerView$B, boolean bl2) {
        ArrayList arrayList = this.p;
        for (int i3 = arrayList.size() + -1; i3 >= 0; i3 += -1) {
            boolean bl3;
            ItemTouchHelper$e itemTouchHelper$e = (ItemTouchHelper$e)arrayList.get(i3);
            RecyclerView$B recyclerView$B2 = itemTouchHelper$e.e;
            if (recyclerView$B2 != recyclerView$B) continue;
            itemTouchHelper$e.k = bl3 = itemTouchHelper$e.k | bl2;
            bl3 = itemTouchHelper$e.l;
            if (!bl3) {
                recyclerView$B = itemTouchHelper$e.g;
                recyclerView$B.cancel();
            }
            arrayList.remove(i3);
            return;
        }
    }

    public final View j(MotionEvent motionEvent) {
        int n3;
        float f5;
        float f6 = motionEvent.getX();
        float f7 = motionEvent.getY();
        Object object = this.c;
        if (object != null) {
            object = ((RecyclerView$B)object).itemView;
            float f8 = this.j;
            f5 = this.h;
            f8 += f5;
            f5 = this.k;
            float f11 = this.i;
            n3 = (int)(ItemTouchHelper.l((View)object, f6, f7, f8, f5 += f11) ? 1 : 0);
            if (n3 != 0) {
                return object;
            }
        }
        object = this.p;
        for (n3 = ((ArrayList)object).size() + -1; n3 >= 0; n3 += -1) {
            ItemTouchHelper$e itemTouchHelper$e = (ItemTouchHelper$e)((ArrayList)object).get(n3);
            View view = itemTouchHelper$e.e.itemView;
            float f12 = itemTouchHelper$e.i;
            f5 = itemTouchHelper$e.j;
            boolean bl2 = ItemTouchHelper.l(view, f6, f7, f12, f5);
            if (!bl2) continue;
            return view;
        }
        return this.r.findChildViewUnder(f6, f7);
    }

    public final void k(float[] fArray) {
        View view;
        int n3;
        View view2;
        float f5;
        float f6;
        int n4 = this.o & 0xC;
        int n7 = 0;
        if (n4 != 0) {
            f6 = this.j;
            f5 = this.h;
            f6 += f5;
            view2 = this.c.itemView;
            n3 = view2.getLeft();
            f5 = n3;
            fArray[0] = f6 -= f5;
        } else {
            view = this.c.itemView;
            fArray[0] = f6 = view.getTranslationX();
        }
        n4 = this.o & 3;
        n7 = 1;
        if (n4 != 0) {
            f6 = this.k;
            f5 = this.i;
            f6 += f5;
            view2 = this.c.itemView;
            n3 = view2.getTop();
            f5 = n3;
            fArray[n7] = f6 -= f5;
        } else {
            view = this.c.itemView;
            fArray[n7] = f6 = view.getTranslationY();
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void m(RecyclerView$B recyclerView$B) {
        Object object;
        ArrayList arrayList;
        int n3;
        Object object2;
        int n4;
        ItemTouchHelper itemTouchHelper = this;
        RecyclerView$B recyclerView$B2 = recyclerView$B;
        Object object3 = this.r;
        int n7 = object3.isLayoutRequested();
        if (n7 != 0) {
            return;
        }
        n7 = this.n;
        int n8 = 2;
        if (n7 != n8) {
            return;
        }
        object3 = this.m;
        float f5 = ((ItemTouchHelper$c)object3).getMoveThreshold(recyclerView$B);
        float f6 = this.j;
        float f7 = this.h;
        int n10 = (int)(f6 + f7);
        f6 = this.k;
        f7 = this.i;
        int n14 = (int)(f6 + f7);
        Object object4 = recyclerView$B.itemView;
        int n15 = object4.getTop();
        f6 = Math.abs(n14 - n15);
        float f8 = f6 - (f7 = (float)(n4 = (object2 = recyclerView$B.itemView).getHeight()) * f5);
        if ((n15 = (int)(f8 == 0.0f ? 0 : (f8 < 0.0f ? -1 : 1))) < 0) {
            object4 = recyclerView$B.itemView;
            n15 = object4.getLeft();
            f6 = n15 = Math.abs(n10 - n15);
            float f11 = f6 - (f7 = (float)(n4 = (object2 = recyclerView$B.itemView).getWidth()) * f5);
            n3 = (int)(f11 == 0.0f ? 0 : (f11 < 0.0f ? -1 : 1));
            if (n3 < 0) {
                return;
            }
        }
        if ((arrayList = itemTouchHelper.u) == null) {
            arrayList = new ArrayList();
            itemTouchHelper.u = arrayList;
            itemTouchHelper.v = arrayList = new ArrayList();
        } else {
            arrayList.clear();
            arrayList = itemTouchHelper.v;
            arrayList.clear();
        }
        n3 = ((ItemTouchHelper$c)object3).getBoundingBoxMargin();
        f6 = itemTouchHelper.j;
        f7 = itemTouchHelper.h;
        n15 = Math.round(f6 += f7) - n3;
        f7 = itemTouchHelper.k;
        float f12 = itemTouchHelper.i;
        n4 = Math.round(f7 += f12) - n3;
        View view = recyclerView$B2.itemView;
        int n16 = view.getWidth() + n15;
        View view2 = recyclerView$B2.itemView;
        int n17 = view2.getHeight() + n4 + n3;
        n3 = (n15 + (n16 += (n3 *= 2))) / n8;
        int n18 = (n4 + n17) / n8;
        RecyclerView$o recyclerView$o = itemTouchHelper.r.getLayoutManager();
        int n19 = recyclerView$o.getChildCount();
        for (int i3 = 0; i3 < n19; ++i3) {
            int n20;
            int n21;
            int n22;
            View view3 = recyclerView$o.getChildAt(i3);
            if (view3 == (object = recyclerView$B2.itemView) || (n8 = view3.getBottom()) < n4 || (n8 = view3.getTop()) > n17 || (n8 = view3.getRight()) < n15 || (n8 = view3.getLeft()) > n16) {
                n22 = n3;
                n21 = n15;
                n20 = n4;
            } else {
                object = itemTouchHelper.r.getChildViewHolder(view3);
                n21 = n15;
                object4 = itemTouchHelper.r;
                n20 = n4;
                object2 = itemTouchHelper.c;
                n15 = (int)(((ItemTouchHelper$c)object3).canDropOver((RecyclerView)object4, (RecyclerView$B)object2, (RecyclerView$B)object) ? 1 : 0);
                if (n15 != 0) {
                    n15 = view3.getLeft();
                    n4 = view3.getRight() + n15;
                    n15 = 2;
                    n4 /= n15;
                    n4 = Math.abs(n3 - n4);
                    int n24 = view3.getTop();
                    int n25 = (view3.getBottom() + n24) / n15;
                    n25 = Math.abs(n18 - n25);
                    n4 *= n4;
                    n25 = n25 * n25 + n4;
                    object2 = itemTouchHelper.u;
                    n4 = ((ArrayList)object2).size();
                    n22 = n3;
                    n3 = 0;
                    f5 = 0.0f;
                    arrayList = null;
                    f6 = 0.0f;
                    object4 = null;
                    for (n15 = 0; n15 < n4; ++n3, ++n15) {
                        int n26 = n4;
                        object2 = (Integer)itemTouchHelper.v.get(n15);
                        n4 = (Integer)object2;
                        if (n25 <= n4) break;
                        n4 = n26;
                    }
                    itemTouchHelper.u.add(n3, object);
                    object = itemTouchHelper.v;
                    object4 = n25;
                    ((ArrayList)object).add(n3, object4);
                } else {
                    n22 = n3;
                }
            }
            n15 = n21;
            n4 = n20;
            n3 = n22;
            n8 = 2;
        }
        object = itemTouchHelper.u;
        n3 = ((ArrayList)object).size();
        if (n3 == 0) {
            return;
        }
        object4 = ((ItemTouchHelper$c)object3).chooseDropTarget(recyclerView$B2, (List)object, n10, n14);
        if (object4 == null) {
            itemTouchHelper.u.clear();
            itemTouchHelper.v.clear();
            return;
        }
        n4 = ((RecyclerView$B)object4).getAbsoluteAdapterPosition();
        n3 = recyclerView$B.getAbsoluteAdapterPosition();
        object = itemTouchHelper.r;
        n7 = (int)(((ItemTouchHelper$c)object3).onMove((RecyclerView)object, recyclerView$B2, (RecyclerView$B)object4) ? 1 : 0);
        if (n7 != 0) {
            object3 = itemTouchHelper.m;
            object = itemTouchHelper.r;
            recyclerView$B2 = recyclerView$B;
            ((ItemTouchHelper$c)object3).onMoved((RecyclerView)object, recyclerView$B, n3, (RecyclerView$B)object4, n4, n10, n14);
        }
    }

    public final void n(View view) {
        View view2 = this.w;
        if (view == view2) {
            view = null;
            this.w = null;
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final void o(RecyclerView$B var1_1, int var2_2) {
        block29: {
            block22: {
                block28: {
                    block23: {
                        block25: {
                            block21: {
                                block26: {
                                    block27: {
                                        block24: {
                                            var3_3 = this;
                                            var4_4 = var1_1;
                                            var5_5 = var2_2;
                                            var6_6 = this.c;
                                            if (var1_1 == var6_6 && var2_2 == (var7_7 = this.n)) {
                                                return;
                                            }
                                            var3_3.B = var8_8 = -9223372036854775808L;
                                            var10_9 = var3_3.n;
                                            var11_10 = 1;
                                            var3_3.i(var4_4, (boolean)var11_10);
                                            var3_3.n = var5_5;
                                            var12_11 = 2;
                                            if (var5_5 == var12_11) {
                                                if (var4_4 != null) {
                                                    var6_6 = var4_4.itemView;
                                                    var3_3.w = var6_6;
                                                } else {
                                                    var6_6 = new IllegalArgumentException("Must pass a ViewHolder when dragging");
                                                    throw var6_6;
                                                }
                                            }
                                            var7_7 = var5_5 * 8;
                                            var13_12 = 8;
                                            var7_7 += var13_12;
                                            var7_7 = var11_10 << var7_7;
                                            var14_13 = var7_7 + -1;
                                            var15_14 = var3_3.c;
                                            var16_15 = var3_3.m;
                                            var17_16 = false;
                                            if (var15_14 == null) break block22;
                                            var6_6 = var15_14.itemView.getParent();
                                            if (var6_6 == null) break block23;
                                            if (var10_9 != var12_11) break block24;
                                            var18_17 = 0;
                                            break block25;
                                        }
                                        var7_7 = var3_3.n;
                                        if (var7_7 == var12_11) lbl-1000:
                                        // 4 sources

                                        {
                                            while (true) {
                                                var19_18 = 0;
                                                var20_19 = 0.0f;
                                                var21_23 = null;
                                                break block21;
                                                break;
                                            }
                                        }
                                        var6_6 = var3_3.r;
                                        var7_7 = var16_15.getMovementFlags((RecyclerView)var6_6, var15_14);
                                        var22_20 /* !! */  = var3_3.r;
                                        var23_21 = var22_20 /* !! */ .getLayoutDirection();
                                        var23_21 = var16_15.convertToAbsoluteDirection(var7_7, var23_21);
                                        var19_18 = 65280;
                                        var20_19 = 9.1477E-41f;
                                        if ((var23_21 = (var23_21 & var19_18) >> var13_12) == 0) ** GOTO lbl-1000
                                        var7_7 = (var7_7 & var19_18) >> var13_12;
                                        var20_19 = Math.abs(var3_3.h);
                                        cfr_temp_0 = var20_19 - (var24_22 = Math.abs(var3_3.i));
                                        var19_18 = (int)(cfr_temp_0 == 0.0f ? 0 : (cfr_temp_0 > 0.0f ? 1 : -1));
                                        if (var19_18 <= 0) break block26;
                                        var19_18 = var3_3.f(var15_14, var23_21);
                                        if (var19_18 <= 0) break block27;
                                        if ((var7_7 &= var19_18) == 0) {
                                            var6_6 = var3_3.r;
                                            var7_7 = var6_6.getLayoutDirection();
                                            var19_18 = ItemTouchHelper$c.convertToRelativeDirection(var19_18, var7_7);
                                        }
                                        break block21;
                                    }
                                    var19_18 = var3_3.h(var15_14, var23_21);
                                    if (var19_18 <= 0) ** GOTO lbl-1000
                                    break block21;
                                }
                                var19_18 = var3_3.h(var15_14, var23_21);
                                if (var19_18 <= 0) {
                                    var19_18 = var3_3.f(var15_14, var23_21);
                                    if (var19_18 > 0) ** break;
                                    ** continue;
                                    if ((var7_7 &= var19_18) == 0) {
                                        var6_6 = var3_3.r;
                                        var7_7 = var6_6.getLayoutDirection();
                                        var19_18 = ItemTouchHelper$c.convertToRelativeDirection(var19_18, var7_7);
                                    }
                                }
                            }
                            var18_17 = var19_18;
                        }
                        var6_6 = var3_3.t;
                        if (var6_6 != null) {
                            var6_6.recycle();
                            var3_3.t = null;
                        }
                        var7_7 = 4;
                        var25_24 = 5.6E-45f;
                        var23_21 = 0;
                        var26_25 = 0.0f;
                        var22_20 /* !! */  = null;
                        if (var18_17 == var11_10 || var18_17 == var12_11) ** GOTO lbl106
                        if (var18_17 == var7_7 || var18_17 == var13_12) ** GOTO lbl-1000
                        var19_18 = 16;
                        var20_19 = 2.2E-44f;
                        if (var18_17 == var19_18) ** GOTO lbl-1000
                        var19_18 = 32;
                        var20_19 = 4.5E-44f;
                        if (var18_17 != var19_18) {
                            var27_26 = 0.0f;
lbl97:
                            // 2 sources

                            while (true) {
                                var28_29 = 0.0f;
                                break;
                            }
                        } else lbl-1000:
                        // 3 sources

                        {
                            var20_19 = Math.signum(var3_3.h);
                            var29_27 = var3_3.r;
                            var30_28 = var29_27.getWidth();
                            var24_22 = var30_28;
                            var27_26 = var20_19 *= var24_22;
                            ** continue;
lbl106:
                            // 1 sources

                            var20_19 = Math.signum(var3_3.i);
                            var29_27 = var3_3.r;
                            var30_28 = var29_27.getHeight();
                            var24_22 = var30_28;
                            var28_29 = var20_19 *= var24_22;
                            var27_26 = 0.0f;
                        }
                        if (var10_9 == var12_11) {
                            var19_18 = 8;
                            var20_19 = 1.1E-44f;
                        } else if (var18_17 > 0) {
                            var19_18 = 2;
                            var20_19 = 2.8E-45f;
                        } else {
                            var19_18 = 4;
                            var20_19 = 5.6E-45f;
                        }
                        var6_6 = var3_3.b;
                        var3_3.k((float[])var6_6);
                        var31_30 = var6_6[0];
                        var32_31 = var6_6[var11_10];
                        var6_6 = var29_27;
                        var22_20 /* !! */  = this;
                        var21_23 = var15_14;
                        var30_28 = var19_18;
                        var24_22 = var20_19;
                        var12_11 = 0;
                        var33_32 = var16_15;
                        var29_27 = new ItemTouchHelper$b(this, var15_14, var19_18, var10_9, (float)var31_30, (float)var32_31, var27_26, var28_29, var18_17, var15_14);
                        var6_6 = var3_3.r;
                        var26_25 = var27_26 - var31_30;
                        var20_19 = var28_29 - var32_31;
                        var13_12 = var19_18;
                        var8_8 = var16_15.getAnimationDuration((RecyclerView)var6_6, var19_18, var26_25, var20_19);
                        var21_23 = var29_27.g;
                        var21_23.setDuration(var8_8);
                        var3_3.p.add(var29_27);
                        var6_6 = var15_14;
                        var23_21 = 0;
                        var26_25 = 0.0f;
                        var22_20 /* !! */  = null;
                        var15_14.setIsRecyclable(false);
                        var21_23.start();
                        var7_7 = 0;
                        var25_24 = 0.0f;
                        var6_6 = null;
                        var17_16 = true;
                        break block28;
                    }
                    var33_32 = var16_15;
                    var6_6 = var15_14;
                    var22_20 /* !! */  = var15_14.itemView;
                    var3_3.n(var22_20 /* !! */ );
                    var22_20 /* !! */  = var3_3.r;
                    var16_15.clearView((RecyclerView)var22_20 /* !! */ , var15_14);
                    var7_7 = 0;
                    var25_24 = 0.0f;
                    var6_6 = null;
                    var17_16 = false;
                }
                var3_3.c = null;
                break block29;
            }
            var33_32 = var16_15;
            var17_16 = false;
        }
        if (var4_4 == null) ** GOTO lbl-1000
        var6_6 = var3_3.r;
        var7_7 = var33_32.getAbsoluteMovementFlags((RecyclerView)var6_6, var4_4) & var14_13;
        var23_21 = var3_3.n * 8;
        var3_3.o = var7_7 >>= var23_21;
        var3_3.j = var25_24 = (float)var4_4.itemView.getLeft();
        var6_6 = var4_4.itemView;
        var3_3.k = var25_24 = (float)var6_6.getTop();
        var3_3.c = var4_4;
        var7_7 = 2;
        var25_24 = 2.8E-45f;
        if (var5_5 == var7_7) {
            var6_6 = var4_4.itemView;
            var23_21 = 0;
            var26_25 = 0.0f;
            var22_20 /* !! */  = null;
            var6_6.performHapticFeedback(0);
        } else lbl-1000:
        // 2 sources

        {
            var23_21 = 0;
            var26_25 = 0.0f;
            var22_20 /* !! */  = null;
        }
        var6_6 = var3_3.r.getParent();
        if (var6_6 != null) {
            var21_23 = var3_3.c;
            var11_10 = var21_23 != null ? 1 : 0;
            var6_6.requestDisallowInterceptTouchEvent((boolean)var11_10);
        }
        if (!var17_16) {
            var6_6 = var3_3.r.getLayoutManager();
            var6_6.requestSimpleAnimationsInNextLayout();
        }
        var6_6 = var3_3.c;
        var23_21 = var3_3.n;
        var33_32.onSelectedChanged((RecyclerView$B)var6_6, var23_21);
        var3_3.r.invalidate();
    }

    public final void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView$y object) {
        Object object2;
        Object object3;
        object = this.c;
        if (object != null) {
            object = this.b;
            this.k((float[])object);
            Object object4 = object[0];
            int n3 = 1;
            Object object5 = object[n3];
            object3 = object5;
            object2 = object4;
        } else {
            float f5 = 0.0f;
            object2 = 0.0f;
            object3 = 0.0f;
        }
        RecyclerView$B recyclerView$B = this.c;
        ArrayList arrayList = this.p;
        int n4 = this.n;
        this.m.onDraw(canvas, recyclerView, recyclerView$B, arrayList, n4, (float)object2, (float)object3);
    }

    public final void onDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView$y object) {
        Object object2;
        Object object3;
        object = this.c;
        if (object != null) {
            object = this.b;
            this.k((float[])object);
            Object object4 = object[0];
            int n3 = 1;
            Object object5 = object[n3];
            object3 = object5;
            object2 = object4;
        } else {
            float f5 = 0.0f;
            object2 = 0.0f;
            object3 = 0.0f;
        }
        RecyclerView$B recyclerView$B = this.c;
        ArrayList arrayList = this.p;
        int n4 = this.n;
        this.m.onDrawOver(canvas, recyclerView, recyclerView$B, arrayList, n4, (float)object2, (float)object3);
    }

    public final void p(int n3, int n4, MotionEvent motionEvent) {
        float f5 = motionEvent.getX(n4);
        float f6 = motionEvent.getY(n4);
        float f7 = this.d;
        this.h = f5 -= f7;
        f7 = this.e;
        this.i = f6 -= f7;
        n4 = n3 & 4;
        f7 = 0.0f;
        motionEvent = null;
        if (n4 == 0) {
            this.h = f6 = Math.max(0.0f, f5);
        }
        if ((n4 = n3 & 8) == 0) {
            f6 = this.h;
            this.h = f6 = Math.min(0.0f, f6);
        }
        if ((n4 = n3 & 1) == 0) {
            f6 = this.i;
            this.i = f6 = Math.max(0.0f, f6);
        }
        if ((n3 &= 2) == 0) {
            float f8 = this.i;
            this.i = f8 = Math.min(0.0f, f8);
        }
    }
}

