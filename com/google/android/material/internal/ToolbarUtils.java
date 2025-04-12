/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.drawable.Drawable
 *  android.graphics.drawable.Drawable$ConstantState
 *  android.text.TextUtils
 *  android.view.View
 *  android.widget.ImageButton
 *  android.widget.ImageView
 *  android.widget.TextView
 */
package com.google.android.material.internal;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.view.menu.f;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import com.google.android.material.internal.ToolbarUtils$1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ToolbarUtils {
    private static final Comparator VIEW_TOP_COMPARATOR;

    static {
        ToolbarUtils$1 toolbarUtils$1 = new ToolbarUtils$1();
        VIEW_TOP_COMPARATOR = toolbarUtils$1;
    }

    private ToolbarUtils() {
    }

    public static ActionMenuItemView getActionMenuItemView(Toolbar viewGroup, int n3) {
        if ((viewGroup = ToolbarUtils.getActionMenuView(viewGroup)) != null) {
            int n4;
            for (int i3 = 0; i3 < (n4 = viewGroup.getChildCount()); ++i3) {
                Object object = viewGroup.getChildAt(i3);
                int n7 = object instanceof ActionMenuItemView;
                if (n7 == 0) continue;
                object = (ActionMenuItemView)object;
                f f5 = ((ActionMenuItemView)object).getItemData();
                n7 = f5.a;
                if (n7 != n3) continue;
                return object;
            }
        }
        return null;
    }

    public static ActionMenuView getActionMenuView(Toolbar toolbar) {
        int n3;
        for (int i3 = 0; i3 < (n3 = toolbar.getChildCount()); ++i3) {
            View view = toolbar.getChildAt(i3);
            boolean bl2 = view instanceof ActionMenuView;
            if (!bl2) continue;
            return (ActionMenuView)view;
        }
        return null;
    }

    private static ImageView getImageView(Toolbar toolbar, Drawable drawable2) {
        int n3;
        if (drawable2 == null) {
            return null;
        }
        for (int i3 = 0; i3 < (n3 = toolbar.getChildCount()); ++i3) {
            Drawable.ConstantState constantState;
            Drawable drawable3;
            View view = toolbar.getChildAt(i3);
            boolean bl2 = view instanceof ImageView;
            if (!bl2 || (drawable3 = (view = (ImageView)view).getDrawable()) == null || (constantState = drawable3.getConstantState()) == null || !(bl2 = (drawable3 = drawable3.getConstantState()).equals(constantState = drawable2.getConstantState()))) continue;
            return view;
        }
        return null;
    }

    public static ImageView getLogoImageView(Toolbar toolbar) {
        Drawable drawable2 = toolbar.getLogo();
        return ToolbarUtils.getImageView(toolbar, drawable2);
    }

    public static ImageButton getNavigationIconButton(Toolbar toolbar) {
        int n3;
        Drawable drawable2 = toolbar.getNavigationIcon();
        if (drawable2 == null) {
            return null;
        }
        for (int i3 = 0; i3 < (n3 = toolbar.getChildCount()); ++i3) {
            Drawable drawable3;
            View view = toolbar.getChildAt(i3);
            boolean bl2 = view instanceof ImageButton;
            if (!bl2 || (drawable3 = (view = (ImageButton)view).getDrawable()) != drawable2) continue;
            return view;
        }
        return null;
    }

    public static View getSecondaryActionMenuItemView(Toolbar viewGroup) {
        int n3;
        int n4;
        if ((viewGroup = ToolbarUtils.getActionMenuView(viewGroup)) != null && (n4 = viewGroup.getChildCount()) > (n3 = 1)) {
            return viewGroup.getChildAt(0);
        }
        return null;
    }

    public static TextView getSubtitleTextView(Toolbar object) {
        Object object2 = ((Toolbar)object).getSubtitle();
        boolean bl2 = (object = ToolbarUtils.getTextViewsWithText((Toolbar)object, (CharSequence)object2)).isEmpty();
        if (bl2) {
            object = null;
        } else {
            object2 = VIEW_TOP_COMPARATOR;
            object = (TextView)Collections.max(object, object2);
        }
        return object;
    }

    private static List getTextViewsWithText(Toolbar toolbar, CharSequence charSequence) {
        int n3;
        ArrayList<View> arrayList = new ArrayList<View>();
        for (int i3 = 0; i3 < (n3 = toolbar.getChildCount()); ++i3) {
            CharSequence charSequence2;
            View view = toolbar.getChildAt(i3);
            boolean bl2 = view instanceof TextView;
            if (!bl2 || !(bl2 = TextUtils.equals((CharSequence)(charSequence2 = (view = (TextView)view).getText()), (CharSequence)charSequence))) continue;
            arrayList.add(view);
        }
        return arrayList;
    }

    public static TextView getTitleTextView(Toolbar object) {
        Object object2 = ((Toolbar)object).getTitle();
        boolean bl2 = (object = ToolbarUtils.getTextViewsWithText((Toolbar)object, (CharSequence)object2)).isEmpty();
        if (bl2) {
            object = null;
        } else {
            object2 = VIEW_TOP_COMPARATOR;
            object = (TextView)Collections.min(object, object2);
        }
        return object;
    }
}

