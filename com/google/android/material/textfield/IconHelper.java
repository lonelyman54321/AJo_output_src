/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.ColorStateList
 *  android.graphics.PorterDuff$Mode
 *  android.graphics.drawable.Drawable
 *  android.os.Build$VERSION
 *  android.view.View$OnClickListener
 *  android.view.View$OnLongClickListener
 *  android.widget.ImageView$ScaleType
 */
package com.google.android.material.textfield;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.widget.ImageView;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.ripple.RippleUtils;
import com.google.android.material.textfield.TextInputLayout;
import java.util.Arrays;

class IconHelper {
    private IconHelper() {
    }

    public static void applyIconTint(TextInputLayout object, CheckableImageButton checkableImageButton, ColorStateList colorStateList, PorterDuff.Mode mode) {
        Drawable drawable2 = checkableImageButton.getDrawable();
        if (drawable2 != null) {
            int n3;
            drawable2 = ut0_0.h(drawable2).mutate();
            if (colorStateList != null && (n3 = colorStateList.isStateful()) != 0) {
                object = IconHelper.mergeIconState(object, checkableImageButton);
                n3 = colorStateList.getDefaultColor();
                int n4 = colorStateList.getColorForState((int[])object, n3);
                object = ColorStateList.valueOf((int)n4);
                drawable2.setTintList((ColorStateList)object);
            } else {
                drawable2.setTintList(colorStateList);
            }
            if (mode != null) {
                drawable2.setTintMode(mode);
            }
        }
        if ((object = checkableImageButton.getDrawable()) != drawable2) {
            checkableImageButton.setImageDrawable(drawable2);
        }
    }

    public static ImageView.ScaleType convertScaleType(int n3) {
        if (n3 != 0) {
            int n4 = 1;
            if (n3 != n4) {
                n4 = 2;
                if (n3 != n4) {
                    n4 = 3;
                    if (n3 != n4) {
                        n4 = 5;
                        if (n3 != n4) {
                            n4 = 6;
                            if (n3 != n4) {
                                return ImageView.ScaleType.CENTER;
                            }
                            return ImageView.ScaleType.CENTER_INSIDE;
                        }
                        return ImageView.ScaleType.CENTER_CROP;
                    }
                    return ImageView.ScaleType.FIT_END;
                }
                return ImageView.ScaleType.FIT_CENTER;
            }
            return ImageView.ScaleType.FIT_START;
        }
        return ImageView.ScaleType.FIT_XY;
    }

    private static int[] mergeIconState(TextInputLayout object, CheckableImageButton object2) {
        object = object.getDrawableState();
        object2 = object2.getDrawableState();
        int n3 = ((TextInputLayout)object).length;
        int n4 = ((TextInputLayout)object).length;
        int n7 = ((CheckableImageButton)object2).length;
        object = Arrays.copyOf((int[])object, n4 += n7);
        n7 = ((CheckableImageButton)object2).length;
        System.arraycopy(object2, 0, object, n3, n7);
        return object;
    }

    public static void refreshIconDrawableState(TextInputLayout object, CheckableImageButton checkableImageButton, ColorStateList colorStateList) {
        int n3;
        Drawable drawable2 = checkableImageButton.getDrawable();
        Drawable drawable3 = checkableImageButton.getDrawable();
        if (drawable3 != null && colorStateList != null && (n3 = colorStateList.isStateful()) != 0) {
            object = IconHelper.mergeIconState(object, checkableImageButton);
            n3 = colorStateList.getDefaultColor();
            int n4 = colorStateList.getColorForState((int[])object, n3);
            colorStateList = ut0_0.h(drawable2).mutate();
            object = ColorStateList.valueOf((int)n4);
            colorStateList.setTintList((ColorStateList)object);
            checkableImageButton.setImageDrawable((Drawable)colorStateList);
        }
    }

    public static void setCompatRippleBackgroundIfNeeded(CheckableImageButton checkableImageButton) {
        int n3 = Build.VERSION.SDK_INT;
        int n4 = 22;
        float f5 = 3.1E-44f;
        if (n3 <= n4) {
            Context context = checkableImageButton.getContext();
            Context context2 = checkableImageButton.getContext();
            int n7 = 4;
            f5 = ViewUtils.dpToPx(context2, n7);
            n4 = (int)f5;
            context = RippleUtils.createOvalRippleLollipop(context, n4);
            checkableImageButton.setBackground((Drawable)context);
        }
    }

    private static void setIconClickable(CheckableImageButton checkableImageButton, View.OnLongClickListener onLongClickListener) {
        boolean bl2;
        boolean bl3 = checkableImageButton.hasOnClickListeners();
        boolean bl4 = false;
        int n3 = 1;
        if (onLongClickListener != null) {
            bl2 = true;
        } else {
            bl2 = false;
            onLongClickListener = null;
        }
        if (bl3 || bl2) {
            bl4 = true;
        }
        checkableImageButton.setFocusable(bl4);
        checkableImageButton.setClickable(bl3);
        checkableImageButton.setPressable(bl3);
        checkableImageButton.setLongClickable(bl2);
        if (!bl4) {
            n3 = 2;
        }
        checkableImageButton.setImportantForAccessibility(n3);
    }

    public static void setIconMinSize(CheckableImageButton checkableImageButton, int n3) {
        checkableImageButton.setMinimumWidth(n3);
        checkableImageButton.setMinimumHeight(n3);
    }

    public static void setIconOnClickListener(CheckableImageButton checkableImageButton, View.OnClickListener onClickListener, View.OnLongClickListener onLongClickListener) {
        checkableImageButton.setOnClickListener(onClickListener);
        IconHelper.setIconClickable(checkableImageButton, onLongClickListener);
    }

    public static void setIconOnLongClickListener(CheckableImageButton checkableImageButton, View.OnLongClickListener onLongClickListener) {
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        IconHelper.setIconClickable(checkableImageButton, onLongClickListener);
    }

    public static void setIconScaleType(CheckableImageButton checkableImageButton, ImageView.ScaleType scaleType) {
        checkableImageButton.setScaleType(scaleType);
    }
}

