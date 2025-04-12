/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.ImageButton
 *  android.widget.ImageView
 *  android.widget.Toolbar
 */
package com.getkeepsafe.taptargetview;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toolbar;
import com.getkeepsafe.taptargetview.ReflectUtil;
import com.getkeepsafe.taptargetview.ToolbarTapTarget$StandardToolbarProxy;
import com.getkeepsafe.taptargetview.ToolbarTapTarget$SupportToolbarProxy;
import com.getkeepsafe.taptargetview.ToolbarTapTarget$ToolbarProxy;
import com.getkeepsafe.taptargetview.ViewTapTarget;
import java.util.ArrayList;
import java.util.Stack;

class ToolbarTapTarget
extends ViewTapTarget {
    public ToolbarTapTarget(Toolbar toolbar, int n3, CharSequence charSequence, CharSequence charSequence2) {
        toolbar = toolbar.findViewById(n3);
        super((View)toolbar, charSequence, charSequence2);
    }

    public ToolbarTapTarget(Toolbar toolbar, boolean bl2, CharSequence charSequence, CharSequence charSequence2) {
        toolbar = bl2 ? ToolbarTapTarget.findNavView(toolbar) : ToolbarTapTarget.findOverflowView(toolbar);
        super((View)toolbar, charSequence, charSequence2);
    }

    public ToolbarTapTarget(androidx.appcompat.widget.Toolbar toolbar, int n3, CharSequence charSequence, CharSequence charSequence2) {
        toolbar = toolbar.findViewById(n3);
        super((View)toolbar, charSequence, charSequence2);
    }

    public ToolbarTapTarget(androidx.appcompat.widget.Toolbar toolbar, boolean bl2, CharSequence charSequence, CharSequence charSequence2) {
        toolbar = bl2 ? ToolbarTapTarget.findNavView(toolbar) : ToolbarTapTarget.findOverflowView(toolbar);
        super((View)toolbar, charSequence, charSequence2);
    }

    private static View findNavView(Object object) {
        int n3;
        object = ToolbarTapTarget.proxyOf(object);
        CharSequence charSequence = object.getNavigationContentDescription();
        int n4 = TextUtils.isEmpty((CharSequence)charSequence);
        int n7 = 1;
        if ((n4 ^= n7) == 0) {
            charSequence = "taptarget-findme";
        }
        object.setNavigationContentDescription(charSequence);
        View view = new ArrayList(n7);
        n7 = 2;
        object.findViewsWithText((ArrayList)view, charSequence, n7);
        if (n4 == 0) {
            n3 = 0;
            charSequence = null;
            object.setNavigationContentDescription(null);
        }
        n3 = view.size();
        if (n3 > 0) {
            return (View)view.get(0);
        }
        charSequence = object.getNavigationIcon();
        if (charSequence != null) {
            n7 = object.getChildCount();
            for (n4 = 0; n4 < n7; ++n4) {
                view = object.getChildAt(n4);
                boolean bl2 = view instanceof ImageButton;
                if (!bl2) continue;
                View view2 = view;
                view2 = ((ImageButton)view).getDrawable();
                if (view2 != charSequence) continue;
                return view;
            }
            object = new IllegalStateException("Could not find navigation view for Toolbar!");
            throw object;
        }
        object = new IllegalStateException("Toolbar does not have a navigation view set!");
        throw object;
    }

    private static View findOverflowView(Object object) {
        NoSuchFieldException noSuchFieldException2;
        Object object2;
        block12: {
            object2 = (object = ToolbarTapTarget.proxyOf(object)).getOverflowIcon();
            if (object2 != null) {
                boolean bl2;
                Stack<Object> stack = new Stack<Object>();
                ViewGroup viewGroup = (ViewGroup)object.internalToolbar();
                stack.push(viewGroup);
                while (!(bl2 = stack.empty())) {
                    viewGroup = (ViewGroup)stack.pop();
                    int n3 = viewGroup.getChildCount();
                    for (int i3 = 0; i3 < n3; ++i3) {
                        View view = viewGroup.getChildAt(i3);
                        boolean bl3 = view instanceof ViewGroup;
                        if (bl3) {
                            view = (ViewGroup)view;
                            stack.push(view);
                            continue;
                        }
                        bl3 = view instanceof ImageView;
                        if (!bl3) continue;
                        View view2 = view;
                        view2 = ((ImageView)view).getDrawable();
                        if (view2 != object2) continue;
                        return view;
                    }
                }
            }
            object = object.internalToolbar();
            object2 = "mMenuView";
            object = ReflectUtil.getPrivateField(object, (String)object2);
            object2 = "mPresenter";
            object = ReflectUtil.getPrivateField(object, (String)object2);
            object2 = "mOverflowButton";
            object = ReflectUtil.getPrivateField(object, (String)object2);
            try {
                return (View)object;
            }
            catch (IllegalAccessException illegalAccessException) {
            }
            catch (NoSuchFieldException noSuchFieldException2) {
                break block12;
            }
            object2 = new IllegalStateException("Unable to access overflow view for Toolbar!", illegalAccessException);
            throw object2;
        }
        object2 = new IllegalStateException("Could not find overflow view for Toolbar!", noSuchFieldException2);
        throw object2;
    }

    private static ToolbarTapTarget$ToolbarProxy proxyOf(Object object) {
        if (object != null) {
            boolean bl2 = object instanceof androidx.appcompat.widget.Toolbar;
            if (bl2) {
                object = (androidx.appcompat.widget.Toolbar)object;
                ToolbarTapTarget$SupportToolbarProxy toolbarTapTarget$SupportToolbarProxy = new ToolbarTapTarget$SupportToolbarProxy((androidx.appcompat.widget.Toolbar)object);
                return toolbarTapTarget$SupportToolbarProxy;
            }
            bl2 = object instanceof Toolbar;
            if (bl2) {
                object = (Toolbar)object;
                ToolbarTapTarget$StandardToolbarProxy toolbarTapTarget$StandardToolbarProxy = new ToolbarTapTarget$StandardToolbarProxy((Toolbar)object);
                return toolbarTapTarget$StandardToolbarProxy;
            }
            object = new IllegalStateException("Couldn't provide proper toolbar proxy instance");
            throw object;
        }
        object = new IllegalArgumentException("Given null instance");
        throw object;
    }
}

