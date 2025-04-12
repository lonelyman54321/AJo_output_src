/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.Resources
 *  android.graphics.Rect
 *  android.graphics.drawable.Drawable
 *  android.os.Build$VERSION
 *  android.util.SparseArray
 *  android.view.View
 *  android.view.View$AccessibilityDelegate
 *  android.widget.FrameLayout
 */
package com.google.android.material.badge;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.SparseArray;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.ViewCompat;
import androidx.core.view.a;
import com.google.android.material.R$dimen;
import com.google.android.material.badge.BadgeDrawable;
import com.google.android.material.badge.BadgeState$State;
import com.google.android.material.badge.BadgeUtils$1;
import com.google.android.material.badge.BadgeUtils$2;
import com.google.android.material.badge.BadgeUtils$3;
import com.google.android.material.badge.BadgeUtils$4;
import com.google.android.material.internal.ParcelableSparseArray;
import com.google.android.material.internal.ToolbarUtils;

public class BadgeUtils {
    private static final String LOG_TAG = "BadgeUtils";
    public static final boolean USE_COMPAT_PARENT = false;

    private BadgeUtils() {
    }

    public static /* synthetic */ void access$000(BadgeDrawable badgeDrawable, View view) {
        BadgeUtils.attachBadgeContentDescription(badgeDrawable, view);
    }

    private static void attachBadgeContentDescription(BadgeDrawable badgeDrawable, View view) {
        a a2;
        int n3 = Build.VERSION.SDK_INT;
        int n4 = 29;
        if (n3 >= n4 && (a2 = ViewCompat.d(view)) != null) {
            View.AccessibilityDelegate accessibilityDelegate = uf_0.c(view);
            a2 = new BadgeUtils$2(accessibilityDelegate, badgeDrawable);
            ViewCompat.s(view, a2);
        } else {
            a2 = new BadgeUtils$3(badgeDrawable);
            ViewCompat.s(view, a2);
        }
    }

    public static void attachBadgeDrawable(BadgeDrawable badgeDrawable, View view) {
        BadgeUtils.attachBadgeDrawable(badgeDrawable, view, null);
    }

    public static void attachBadgeDrawable(BadgeDrawable object, View view, FrameLayout frameLayout) {
        block4: {
            block3: {
                block2: {
                    BadgeUtils.setBadgeDrawableBounds((BadgeDrawable)object, view, frameLayout);
                    frameLayout = ((BadgeDrawable)object).getCustomBadgeParent();
                    if (frameLayout == null) break block2;
                    view = ((BadgeDrawable)object).getCustomBadgeParent();
                    view.setForeground((Drawable)object);
                    break block3;
                }
                boolean bl2 = USE_COMPAT_PARENT;
                if (bl2) break block4;
                view = view.getOverlay();
                view.add((Drawable)object);
            }
            return;
        }
        object = new IllegalArgumentException("Trying to reference null customBadgeParent");
        throw object;
    }

    public static void attachBadgeDrawable(BadgeDrawable badgeDrawable, Toolbar toolbar, int n3) {
        BadgeUtils.attachBadgeDrawable(badgeDrawable, toolbar, n3, null);
    }

    public static void attachBadgeDrawable(BadgeDrawable badgeDrawable, Toolbar toolbar, int n3, FrameLayout frameLayout) {
        BadgeUtils$1 badgeUtils$1 = new BadgeUtils$1(toolbar, n3, badgeDrawable, frameLayout);
        toolbar.post(badgeUtils$1);
    }

    public static SparseArray createBadgeDrawablesFromSavedStates(Context context, ParcelableSparseArray parcelableSparseArray) {
        int n3;
        int n4 = parcelableSparseArray.size();
        SparseArray sparseArray = new SparseArray(n4);
        for (n4 = 0; n4 < (n3 = parcelableSparseArray.size()); ++n4) {
            n3 = parcelableSparseArray.keyAt(n4);
            Object object = (BadgeState$State)parcelableSparseArray.valueAt(n4);
            object = object != null ? BadgeDrawable.createFromSavedState(context, (BadgeState$State)object) : null;
            sparseArray.put(n3, object);
        }
        return sparseArray;
    }

    public static ParcelableSparseArray createParcelableBadgeStates(SparseArray sparseArray) {
        int n3;
        ParcelableSparseArray parcelableSparseArray = new ParcelableSparseArray();
        for (int i3 = 0; i3 < (n3 = sparseArray.size()); ++i3) {
            n3 = sparseArray.keyAt(i3);
            Object object = (BadgeDrawable)sparseArray.valueAt(i3);
            object = object != null ? ((BadgeDrawable)object).getSavedState() : null;
            parcelableSparseArray.put(n3, object);
        }
        return parcelableSparseArray;
    }

    private static void detachBadgeContentDescription(View view) {
        Object object;
        int n3 = Build.VERSION.SDK_INT;
        int n4 = 29;
        if (n3 >= n4 && (object = ViewCompat.d(view)) != null) {
            View.AccessibilityDelegate accessibilityDelegate = uf_0.c(view);
            object = new BadgeUtils$4(accessibilityDelegate);
            ViewCompat.s(view, (a)object);
        } else {
            n3 = 0;
            object = null;
            ViewCompat.s(view, null);
        }
    }

    public static void detachBadgeDrawable(BadgeDrawable badgeDrawable, View view) {
        FrameLayout frameLayout;
        if (badgeDrawable == null) {
            return;
        }
        boolean bl2 = USE_COMPAT_PARENT;
        if (!bl2 && (frameLayout = badgeDrawable.getCustomBadgeParent()) == null) {
            view = view.getOverlay();
            view.remove((Drawable)badgeDrawable);
        } else {
            badgeDrawable = badgeDrawable.getCustomBadgeParent();
            view = null;
            badgeDrawable.setForeground(null);
        }
    }

    public static void detachBadgeDrawable(BadgeDrawable badgeDrawable, Toolbar object, int n3) {
        if (badgeDrawable == null) {
            return;
        }
        if ((object = ToolbarUtils.getActionMenuItemView((Toolbar)object, n3)) != null) {
            BadgeUtils.removeToolbarOffset(badgeDrawable);
            BadgeUtils.detachBadgeDrawable(badgeDrawable, (View)object);
            BadgeUtils.detachBadgeContentDescription((View)object);
        }
    }

    public static void removeToolbarOffset(BadgeDrawable badgeDrawable) {
        badgeDrawable.setAdditionalHorizontalOffset(0);
        badgeDrawable.setAdditionalVerticalOffset(0);
    }

    public static void setBadgeDrawableBounds(BadgeDrawable badgeDrawable, View view, FrameLayout frameLayout) {
        Rect rect = new Rect();
        view.getDrawingRect(rect);
        badgeDrawable.setBounds(rect);
        badgeDrawable.updateBadgeCoordinates(view, frameLayout);
    }

    public static void setToolbarOffset(BadgeDrawable badgeDrawable, Resources resources) {
        int n3 = R$dimen.mtrl_badge_toolbar_action_menu_item_horizontal_offset;
        n3 = resources.getDimensionPixelOffset(n3);
        badgeDrawable.setAdditionalHorizontalOffset(n3);
        n3 = R$dimen.mtrl_badge_toolbar_action_menu_item_vertical_offset;
        int n4 = resources.getDimensionPixelOffset(n3);
        badgeDrawable.setAdditionalVerticalOffset(n4);
    }

    public static void updateBadgeBounds(Rect rect, float f5, float f6, float f7, float f8) {
        int n3 = (int)(f5 - f7);
        int n4 = (int)(f6 - f8);
        int n7 = (int)(f5 + f7);
        int n8 = (int)(f6 + f8);
        rect.set(n3, n4, n7, n8);
    }
}

