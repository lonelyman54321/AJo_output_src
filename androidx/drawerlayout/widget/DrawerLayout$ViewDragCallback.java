/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
package androidx.drawerlayout.widget;

import android.view.View;
import androidx.customview.widget.ViewDragHelper;
import androidx.customview.widget.ViewDragHelper$b;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.drawerlayout.widget.DrawerLayout$LayoutParams;

public final class DrawerLayout$ViewDragCallback
extends ViewDragHelper$b {
    public final int a;
    public ViewDragHelper b;
    public final Runnable c;
    public final /* synthetic */ DrawerLayout d;

    public DrawerLayout$ViewDragCallback(DrawerLayout object, int n3) {
        this.d = object;
        super(this);
        this.c = object;
        this.a = n3;
    }

    public final int clampViewPositionHorizontal(View view, int n3, int n4) {
        DrawerLayout drawerLayout = this.d;
        n4 = (int)(drawerLayout.checkDrawerViewAbsoluteGravity(view, 3) ? 1 : 0);
        if (n4 != 0) {
            int n7 = -view.getWidth();
            n3 = Math.min(n3, 0);
            return Math.max(n7, n3);
        }
        n4 = drawerLayout.getWidth();
        int n8 = view.getWidth();
        n8 = n4 - n8;
        n3 = Math.min(n3, n4);
        return Math.max(n8, n3);
    }

    public final int clampViewPositionVertical(View view, int n3, int n4) {
        return view.getTop();
    }

    public final int getViewHorizontalDragRange(View view) {
        int n3;
        DrawerLayout drawerLayout = this.d;
        boolean bl2 = drawerLayout.isDrawerView(view);
        if (bl2) {
            n3 = view.getWidth();
        } else {
            n3 = 0;
            view = null;
        }
        return n3;
    }

    public final void onEdgeDragStarted(int n3, int n4) {
        View view;
        int n7 = 1;
        DrawerLayout drawerLayout = this.d;
        if ((n3 &= n7) == n7) {
            n3 = 3;
            view = drawerLayout.findDrawerWithGravity(n3);
        } else {
            n3 = 5;
            view = drawerLayout.findDrawerWithGravity(n3);
        }
        if (view != null && (n7 = drawerLayout.getDrawerLockMode(view)) == 0) {
            ViewDragHelper viewDragHelper = this.b;
            viewDragHelper.c(n4, view);
        }
    }

    public final boolean onEdgeLock(int n3) {
        return false;
    }

    public final void onEdgeTouched(int n3, int n4) {
        Runnable runnable2 = this.c;
        this.d.postDelayed(runnable2, 160L);
    }

    public final void onViewCaptured(View object, int n3) {
        object = (DrawerLayout$LayoutParams)object.getLayoutParams();
        View view = null;
        ((DrawerLayout$LayoutParams)((Object)object)).c = false;
        int n4 = this.a;
        n3 = 3;
        if (n4 == n3) {
            n3 = 5;
        }
        if ((view = ((DrawerLayout)((Object)(object = this.d))).findDrawerWithGravity(n3)) != null) {
            ((DrawerLayout)((Object)object)).closeDrawer(view);
        }
    }

    public final void onViewDragStateChanged(int n3) {
        View view = this.b.t;
        this.d.updateDrawerState(n3, view);
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void onViewPositionChanged(View view, int n3, int n4, int n7, int n8) {
        float f5;
        n4 = view.getWidth();
        DrawerLayout drawerLayout = this.d;
        n7 = (int)(drawerLayout.checkDrawerViewAbsoluteGravity(view, 3) ? 1 : 0);
        if (n7 != 0) {
            f5 = n3 += n4;
        } else {
            n7 = drawerLayout.getWidth() - n3;
            f5 = n7;
        }
        float f6 = n4;
        drawerLayout.setDrawerViewOffset(view, f5 /= f6);
        n4 = 0;
        f6 = 0.0f;
        float f7 = f5 - 0.0f;
        n3 = (int)(f7 == 0.0f ? 0 : (f7 > 0.0f ? 1 : -1));
        if (n3 == 0) {
            n3 = 4;
            f5 = 5.6E-45f;
        } else {
            n3 = 0;
            f5 = 0.0f;
        }
        view.setVisibility(n3);
        drawerLayout.invalidate();
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public final void onViewReleased(View view, float f5, float f6) {
        void var9_16;
        DrawerLayout drawerLayout = this.d;
        float f7 = drawerLayout.getDrawerViewOffset(view);
        int n3 = view.getWidth();
        int n4 = drawerLayout.checkDrawerViewAbsoluteGravity(view, 3);
        float f8 = 0.5f;
        if (n4 != 0) {
            float f11;
            float f12 = f5 - 0.0f;
            Object object = f12 == 0.0f ? 0 : (f12 > 0.0f ? 1 : -1);
            if (object <= 0 && (object != false || (f11 = f7 == f8 ? 0 : (f7 > f8 ? 1 : -1)) <= 0)) {
                int n7 = -n3;
            } else {
                boolean bl2 = false;
                f5 = 0.0f;
            }
        } else {
            float f14;
            float f15;
            float f16;
            n4 = drawerLayout.getWidth();
            float f17 = f5 - 0.0f;
            Object object = f17 == 0.0f ? 0 : (f17 < 0.0f ? -1 : 1);
            if (object < 0 || (f16 = (f15 = f5 - 0.0f) == 0.0f ? 0 : (f15 > 0.0f ? 1 : -1)) == false && (f14 = f7 == f8 ? 0 : (f7 > f8 ? 1 : -1)) > 0) {
                n4 -= n3;
            }
            int n8 = n4;
        }
        ViewDragHelper viewDragHelper = this.b;
        int n10 = view.getTop();
        viewDragHelper.s((int)var9_16, n10);
        drawerLayout.invalidate();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final boolean tryCaptureView(View view, int n3) {
        DrawerLayout drawerLayout = this.d;
        int n4 = drawerLayout.isDrawerView(view);
        if (n4 == 0) return 0 != 0;
        n4 = this.a;
        if ((n4 = (int)(drawerLayout.checkDrawerViewAbsoluteGravity(view, n4) ? 1 : 0)) == 0) return 0 != 0;
        int n7 = drawerLayout.getDrawerLockMode(view);
        if (n7 != 0) return 0 != 0;
        return 1 != 0;
    }
}

