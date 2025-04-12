/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.Rect
 *  android.graphics.Typeface
 *  android.graphics.drawable.Drawable
 *  android.view.View
 *  android.widget.Toolbar
 */
package com.getkeepsafe.taptargetview;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.Toolbar;
import com.getkeepsafe.taptargetview.ToolbarTapTarget;
import com.getkeepsafe.taptargetview.UiUtil;
import com.getkeepsafe.taptargetview.ViewTapTarget;

public class TapTarget {
    Rect bounds;
    boolean cancelable;
    final CharSequence description;
    float descriptionTextAlpha;
    private Integer descriptionTextColor;
    private int descriptionTextColorRes;
    private int descriptionTextDimen;
    private int descriptionTextSize;
    Typeface descriptionTypeface;
    private Integer dimColor;
    private int dimColorRes;
    boolean drawBehindNavigationBar;
    boolean drawBehindStatusBar;
    boolean drawShadow;
    boolean forceCenteredTarget;
    Drawable icon;
    int id;
    float outerCircleAlpha = 0.96f;
    private Integer outerCircleColor;
    private int outerCircleColorRes;
    private Integer targetCircleColor;
    private int targetCircleColorRes;
    int targetRadius = 44;
    boolean tintTarget;
    final CharSequence title;
    private Integer titleTextColor;
    private int titleTextColorRes;
    private int titleTextDimen;
    private int titleTextSize;
    Typeface titleTypeface;
    boolean transparentTarget;

    public TapTarget(Rect object, CharSequence charSequence, CharSequence charSequence2) {
        this(charSequence, charSequence2);
        if (object != null) {
            this.bounds = object;
            return;
        }
        super("Cannot pass null bounds or title");
        throw object;
    }

    public TapTarget(CharSequence object, CharSequence charSequence) {
        float f5;
        boolean bl2;
        int n3;
        this.outerCircleColorRes = n3 = -1;
        this.targetCircleColorRes = n3;
        this.dimColorRes = n3;
        this.titleTextColorRes = n3;
        this.descriptionTextColorRes = n3;
        this.outerCircleColor = null;
        this.targetCircleColor = null;
        this.dimColor = null;
        this.titleTextColor = null;
        this.descriptionTextColor = null;
        this.titleTextDimen = n3;
        this.descriptionTextDimen = n3;
        this.titleTextSize = 20;
        this.descriptionTextSize = 18;
        this.id = n3;
        n3 = 0;
        this.drawShadow = false;
        this.cancelable = bl2 = true;
        this.tintTarget = bl2;
        this.transparentTarget = false;
        this.descriptionTextAlpha = f5 = 0.54f;
        this.drawBehindStatusBar = bl2;
        this.drawBehindNavigationBar = bl2;
        this.forceCenteredTarget = false;
        if (object != null) {
            this.title = object;
            this.description = charSequence;
            return;
        }
        object = new IllegalArgumentException("Cannot pass null title");
        throw object;
    }

    private Integer colorResOrInt(Context context, Integer n3, int n4) {
        int n7 = -1;
        if (n4 != n7) {
            return t70.getColor(context, n4);
        }
        return n3;
    }

    private int dimenOrSize(Context context, int n3, int n4) {
        int n7 = -1;
        if (n4 != n7) {
            return context.getResources().getDimensionPixelSize(n4);
        }
        return UiUtil.sp(context, n3);
    }

    public static TapTarget forBounds(Rect rect, CharSequence charSequence) {
        return TapTarget.forBounds(rect, charSequence, null);
    }

    public static TapTarget forBounds(Rect rect, CharSequence charSequence, CharSequence charSequence2) {
        TapTarget tapTarget = new TapTarget(rect, charSequence, charSequence2);
        return tapTarget;
    }

    public static TapTarget forToolbarMenuItem(Toolbar toolbar, int n3, CharSequence charSequence) {
        return TapTarget.forToolbarMenuItem(toolbar, n3, charSequence, null);
    }

    public static TapTarget forToolbarMenuItem(Toolbar toolbar, int n3, CharSequence charSequence, CharSequence charSequence2) {
        ToolbarTapTarget toolbarTapTarget = new ToolbarTapTarget(toolbar, n3, charSequence, charSequence2);
        return toolbarTapTarget;
    }

    public static TapTarget forToolbarMenuItem(androidx.appcompat.widget.Toolbar toolbar, int n3, CharSequence charSequence) {
        return TapTarget.forToolbarMenuItem(toolbar, n3, charSequence, null);
    }

    public static TapTarget forToolbarMenuItem(androidx.appcompat.widget.Toolbar toolbar, int n3, CharSequence charSequence, CharSequence charSequence2) {
        ToolbarTapTarget toolbarTapTarget = new ToolbarTapTarget(toolbar, n3, charSequence, charSequence2);
        return toolbarTapTarget;
    }

    public static TapTarget forToolbarNavigationIcon(Toolbar toolbar, CharSequence charSequence) {
        return TapTarget.forToolbarNavigationIcon(toolbar, charSequence, null);
    }

    public static TapTarget forToolbarNavigationIcon(Toolbar toolbar, CharSequence charSequence, CharSequence charSequence2) {
        ToolbarTapTarget toolbarTapTarget = new ToolbarTapTarget(toolbar, true, charSequence, charSequence2);
        return toolbarTapTarget;
    }

    public static TapTarget forToolbarNavigationIcon(androidx.appcompat.widget.Toolbar toolbar, CharSequence charSequence) {
        return TapTarget.forToolbarNavigationIcon(toolbar, charSequence, null);
    }

    public static TapTarget forToolbarNavigationIcon(androidx.appcompat.widget.Toolbar toolbar, CharSequence charSequence, CharSequence charSequence2) {
        ToolbarTapTarget toolbarTapTarget = new ToolbarTapTarget(toolbar, true, charSequence, charSequence2);
        return toolbarTapTarget;
    }

    public static TapTarget forToolbarOverflow(Toolbar toolbar, CharSequence charSequence) {
        return TapTarget.forToolbarOverflow(toolbar, charSequence, null);
    }

    public static TapTarget forToolbarOverflow(Toolbar toolbar, CharSequence charSequence, CharSequence charSequence2) {
        ToolbarTapTarget toolbarTapTarget = new ToolbarTapTarget(toolbar, false, charSequence, charSequence2);
        return toolbarTapTarget;
    }

    public static TapTarget forToolbarOverflow(androidx.appcompat.widget.Toolbar toolbar, CharSequence charSequence) {
        return TapTarget.forToolbarOverflow(toolbar, charSequence, null);
    }

    public static TapTarget forToolbarOverflow(androidx.appcompat.widget.Toolbar toolbar, CharSequence charSequence, CharSequence charSequence2) {
        ToolbarTapTarget toolbarTapTarget = new ToolbarTapTarget(toolbar, false, charSequence, charSequence2);
        return toolbarTapTarget;
    }

    public static TapTarget forView(View view, CharSequence charSequence) {
        return TapTarget.forView(view, charSequence, null);
    }

    public static TapTarget forView(View view, CharSequence charSequence, CharSequence charSequence2) {
        ViewTapTarget viewTapTarget = new ViewTapTarget(view, charSequence, charSequence2);
        return viewTapTarget;
    }

    public Rect bounds() {
        Object object = this.bounds;
        if (object != null) {
            return object;
        }
        object = new IllegalStateException("Requesting bounds that are not set! Make sure your target is ready");
        throw object;
    }

    public TapTarget cancelable(boolean bl2) {
        this.cancelable = bl2;
        return this;
    }

    public TapTarget descriptionTextAlpha(float f5) {
        float f6;
        float f7 = 0.0f;
        IllegalArgumentException illegalArgumentException = null;
        float f8 = f5 - 0.0f;
        Object object = f8 == 0.0f ? 0 : (f8 < 0.0f ? -1 : 1);
        if (object >= 0 && (object = (f6 = f5 - (f7 = 1.0f)) == 0.0f ? 0 : (f6 > 0.0f ? 1 : -1)) <= 0) {
            this.descriptionTextAlpha = f5;
            return this;
        }
        StringBuilder stringBuilder = new StringBuilder("Given an invalid alpha value: ");
        stringBuilder.append(f5);
        String string2 = stringBuilder.toString();
        illegalArgumentException = new IllegalArgumentException(string2);
        throw illegalArgumentException;
    }

    public TapTarget descriptionTextColor(int n3) {
        this.descriptionTextColorRes = n3;
        return this;
    }

    public TapTarget descriptionTextColorInt(int n3) {
        Integer n4;
        this.descriptionTextColor = n4 = Integer.valueOf(n3);
        return this;
    }

    public Integer descriptionTextColorInt(Context context) {
        Integer n3 = this.descriptionTextColor;
        int n4 = this.descriptionTextColorRes;
        return this.colorResOrInt(context, n3, n4);
    }

    public TapTarget descriptionTextDimen(int n3) {
        this.descriptionTextDimen = n3;
        return this;
    }

    public TapTarget descriptionTextSize(int n3) {
        if (n3 >= 0) {
            this.descriptionTextSize = n3;
            return this;
        }
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Given negative text size");
        throw illegalArgumentException;
    }

    public int descriptionTextSizePx(Context context) {
        int n3 = this.descriptionTextSize;
        int n4 = this.descriptionTextDimen;
        return this.dimenOrSize(context, n3, n4);
    }

    public TapTarget descriptionTypeface(Typeface object) {
        if (object != null) {
            this.descriptionTypeface = object;
            return this;
        }
        object = new IllegalArgumentException("Cannot use a null typeface");
        throw object;
    }

    public TapTarget dimColor(int n3) {
        this.dimColorRes = n3;
        return this;
    }

    public TapTarget dimColorInt(int n3) {
        Integer n4;
        this.dimColor = n4 = Integer.valueOf(n3);
        return this;
    }

    public Integer dimColorInt(Context context) {
        Integer n3 = this.dimColor;
        int n4 = this.dimColorRes;
        return this.colorResOrInt(context, n3, n4);
    }

    public TapTarget drawShadow(boolean bl2) {
        this.drawShadow = bl2;
        return this;
    }

    public TapTarget icon(Drawable drawable2) {
        return this.icon(drawable2, false);
    }

    public TapTarget icon(Drawable object, boolean bl2) {
        if (object != null) {
            this.icon = object;
            if (!bl2) {
                Drawable drawable2 = this.icon;
                int n3 = drawable2.getIntrinsicWidth();
                Drawable drawable3 = this.icon;
                int n4 = drawable3.getIntrinsicHeight();
                Rect rect = new Rect(0, 0, n3, n4);
                object.setBounds(rect);
            }
            return this;
        }
        object = new IllegalArgumentException("Cannot use null drawable");
        throw object;
    }

    public int id() {
        return this.id;
    }

    public TapTarget id(int n3) {
        this.id = n3;
        return this;
    }

    public void onReady(Runnable runnable2) {
        runnable2.run();
    }

    public TapTarget outerCircleAlpha(float f5) {
        float f6;
        float f7 = 0.0f;
        IllegalArgumentException illegalArgumentException = null;
        float f8 = f5 - 0.0f;
        Object object = f8 == 0.0f ? 0 : (f8 < 0.0f ? -1 : 1);
        if (object >= 0 && (object = (f6 = f5 - (f7 = 1.0f)) == 0.0f ? 0 : (f6 > 0.0f ? 1 : -1)) <= 0) {
            this.outerCircleAlpha = f5;
            return this;
        }
        StringBuilder stringBuilder = new StringBuilder("Given an invalid alpha value: ");
        stringBuilder.append(f5);
        String string2 = stringBuilder.toString();
        illegalArgumentException = new IllegalArgumentException(string2);
        throw illegalArgumentException;
    }

    public TapTarget outerCircleColor(int n3) {
        this.outerCircleColorRes = n3;
        return this;
    }

    public TapTarget outerCircleColorInt(int n3) {
        Integer n4;
        this.outerCircleColor = n4 = Integer.valueOf(n3);
        return this;
    }

    public Integer outerCircleColorInt(Context context) {
        Integer n3 = this.outerCircleColor;
        int n4 = this.outerCircleColorRes;
        return this.colorResOrInt(context, n3, n4);
    }

    public TapTarget setDrawBehindNavigationBar(boolean bl2) {
        this.drawBehindNavigationBar = bl2;
        return this;
    }

    public TapTarget setDrawBehindStatusBar(boolean bl2) {
        this.drawBehindStatusBar = bl2;
        return this;
    }

    public TapTarget setForceCenteredTarget(boolean bl2) {
        this.forceCenteredTarget = bl2;
        return this;
    }

    public TapTarget targetCircleColor(int n3) {
        this.targetCircleColorRes = n3;
        return this;
    }

    public TapTarget targetCircleColorInt(int n3) {
        Integer n4;
        this.targetCircleColor = n4 = Integer.valueOf(n3);
        return this;
    }

    public Integer targetCircleColorInt(Context context) {
        Integer n3 = this.targetCircleColor;
        int n4 = this.targetCircleColorRes;
        return this.colorResOrInt(context, n3, n4);
    }

    public TapTarget targetRadius(int n3) {
        this.targetRadius = n3;
        return this;
    }

    public TapTarget textColor(int n3) {
        this.titleTextColorRes = n3;
        this.descriptionTextColorRes = n3;
        return this;
    }

    public TapTarget textColorInt(int n3) {
        Integer n4;
        Integer n7;
        this.titleTextColor = n7 = Integer.valueOf(n3);
        this.descriptionTextColor = n4 = Integer.valueOf(n3);
        return this;
    }

    public TapTarget textTypeface(Typeface object) {
        if (object != null) {
            this.titleTypeface = object;
            this.descriptionTypeface = object;
            return this;
        }
        object = new IllegalArgumentException("Cannot use a null typeface");
        throw object;
    }

    public TapTarget tintTarget(boolean bl2) {
        this.tintTarget = bl2;
        return this;
    }

    public TapTarget titleTextColor(int n3) {
        this.titleTextColorRes = n3;
        return this;
    }

    public TapTarget titleTextColorInt(int n3) {
        Integer n4;
        this.titleTextColor = n4 = Integer.valueOf(n3);
        return this;
    }

    public Integer titleTextColorInt(Context context) {
        Integer n3 = this.titleTextColor;
        int n4 = this.titleTextColorRes;
        return this.colorResOrInt(context, n3, n4);
    }

    public TapTarget titleTextDimen(int n3) {
        this.titleTextDimen = n3;
        return this;
    }

    public TapTarget titleTextSize(int n3) {
        if (n3 >= 0) {
            this.titleTextSize = n3;
            return this;
        }
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Given negative text size");
        throw illegalArgumentException;
    }

    public int titleTextSizePx(Context context) {
        int n3 = this.titleTextSize;
        int n4 = this.titleTextDimen;
        return this.dimenOrSize(context, n3, n4);
    }

    public TapTarget titleTypeface(Typeface object) {
        if (object != null) {
            this.titleTypeface = object;
            return this;
        }
        object = new IllegalArgumentException("Cannot use a null typeface");
        throw object;
    }

    public TapTarget transparentTarget(boolean bl2) {
        this.transparentTarget = bl2;
        return this;
    }
}

