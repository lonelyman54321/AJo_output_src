/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Parcelable
 *  android.view.MenuItem
 *  android.view.View
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 *  android.widget.ImageButton
 */
package androidx.appcompat.widget;

import android.content.Context;
import android.os.Parcelable;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import androidx.appcompat.view.menu.d;
import androidx.appcompat.view.menu.f;
import androidx.appcompat.view.menu.h;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.widget.Toolbar;

public final class Toolbar$e
implements h {
    public d a;
    public f b;
    public final /* synthetic */ Toolbar c;

    public Toolbar$e(Toolbar toolbar) {
        this.c = toolbar;
    }

    public final boolean collapseItemActionView(d object, f f5) {
        object = this.c;
        Object object2 = ((Toolbar)object).mExpandedActionView;
        boolean bl2 = object2 instanceof lx_0;
        if (bl2) {
            object2 = (lx_0)object2;
            object2.c();
        }
        object2 = ((Toolbar)object).mExpandedActionView;
        object.removeView((View)object2);
        object2 = ((Toolbar)object).mCollapseButtonView;
        object.removeView((View)object2);
        ((Toolbar)object).mExpandedActionView = null;
        ((Toolbar)object).addChildrenForExpandedActionView();
        this.b = null;
        object.requestLayout();
        f5.C = false;
        f5.n.onItemsChanged(false);
        ((Toolbar)object).updateBackInvokedCallbackState();
        return true;
    }

    public final boolean expandItemActionView(d object, f object2) {
        boolean bl2;
        ImageButton imageButton;
        int n3;
        object = this.c;
        ((Toolbar)object).ensureCollapseButtonView();
        Object object3 = ((Toolbar)object).mCollapseButtonView.getParent();
        if (object3 != object) {
            n3 = object3 instanceof ViewGroup;
            if (n3 != 0) {
                object3 = (ViewGroup)object3;
                imageButton = ((Toolbar)object).mCollapseButtonView;
                object3.removeView((View)imageButton);
            }
            object3 = ((Toolbar)object).mCollapseButtonView;
            object.addView((View)object3);
        }
        object3 = ((f)object2).getActionView();
        ((Toolbar)object).mExpandedActionView = object3;
        this.b = object2;
        if ((object3 = object3.getParent()) != object) {
            n3 = object3 instanceof ViewGroup;
            if (n3 != 0) {
                object3 = (ViewGroup)object3;
                imageButton = ((Toolbar)object).mExpandedActionView;
                object3.removeView((View)imageButton);
            }
            object3 = ((Toolbar)object).generateDefaultLayoutParams();
            n3 = ((Toolbar)object).mButtonGravity & 0x70;
            int n4 = 0x800003;
            object3.a = n3 |= n4;
            object3.b = n3 = 2;
            imageButton = ((Toolbar)object).mExpandedActionView;
            imageButton.setLayoutParams((ViewGroup.LayoutParams)object3);
            object3 = ((Toolbar)object).mExpandedActionView;
            object.addView((View)object3);
        }
        ((Toolbar)object).removeChildrenForExpandedActionView();
        object.requestLayout();
        ((f)object2).C = bl2 = true;
        object2 = ((f)object2).n;
        imageButton = null;
        ((d)object2).onItemsChanged(false);
        object2 = ((Toolbar)object).mExpandedActionView;
        n3 = object2 instanceof lx_0;
        if (n3 != 0) {
            object2 = (lx_0)object2;
            object2.a();
        }
        ((Toolbar)object).updateBackInvokedCallbackState();
        return bl2;
    }

    public final boolean flagActionItems() {
        return false;
    }

    public final int getId() {
        return 0;
    }

    public final void initForMenu(Context object, d d2) {
        f f5;
        object = this.a;
        if (object != null && (f5 = this.b) != null) {
            ((d)object).collapseItemActionView(f5);
        }
        this.a = d2;
    }

    public final void onCloseMenu(d d2, boolean bl2) {
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
    }

    public final Parcelable onSaveInstanceState() {
        return null;
    }

    public final boolean onSubMenuSelected(j j3) {
        return false;
    }

    public final void updateMenuView(boolean n3) {
        Object object = this.b;
        if (object != null) {
            f f5;
            object = this.a;
            if (object != null) {
                n3 = ((d)object).size();
                f5 = null;
                for (int i3 = 0; i3 < n3; ++i3) {
                    f f6;
                    MenuItem menuItem = this.a.getItem(i3);
                    if (menuItem != (f6 = this.b)) {
                        continue;
                    }
                    break;
                }
            } else {
                object = this.a;
                f5 = this.b;
                this.collapseItemActionView((d)object, f5);
            }
        }
    }
}

