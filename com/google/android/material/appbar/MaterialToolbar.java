/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.ColorStateList
 *  android.graphics.drawable.Drawable
 *  android.util.AttributeSet
 *  android.util.Pair
 *  android.view.Menu
 *  android.view.View
 *  android.view.View$MeasureSpec
 *  android.widget.ImageView
 *  android.widget.ImageView$ScaleType
 *  android.widget.TextView
 */
package com.google.android.material.appbar;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.Menu;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.view.menu.d;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.ViewCompat;
import androidx.core.view.ViewCompat$c;
import com.google.android.material.R$attr;
import com.google.android.material.R$style;
import com.google.android.material.R$styleable;
import com.google.android.material.drawable.DrawableUtils;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.internal.ToolbarUtils;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.MaterialShapeUtils;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;

public class MaterialToolbar
extends Toolbar {
    private static final int DEF_STYLE_RES = R$style.Widget_MaterialComponents_Toolbar;
    private static final ImageView.ScaleType[] LOGO_SCALE_TYPE_ARRAY;
    private Boolean logoAdjustViewBounds;
    private ImageView.ScaleType logoScaleType;
    private Integer navigationIconTint;
    private boolean subtitleCentered;
    private boolean titleCentered;

    static {
        ImageView.ScaleType scaleType = ImageView.ScaleType.MATRIX;
        scaleType = ImageView.ScaleType.FIT_XY;
        scaleType = ImageView.ScaleType.FIT_START;
        scaleType = ImageView.ScaleType.FIT_CENTER;
        scaleType = ImageView.ScaleType.FIT_END;
        scaleType = ImageView.ScaleType.CENTER;
        scaleType = ImageView.ScaleType.CENTER_CROP;
        scaleType = ImageView.ScaleType.CENTER_INSIDE;
        ImageView.ScaleType[] scaleTypeArray = new ImageView.ScaleType[]{scaleType, scaleType, scaleType, scaleType, scaleType, scaleType, scaleType, scaleType};
        LOGO_SCALE_TYPE_ARRAY = scaleTypeArray;
    }

    public MaterialToolbar(Context context) {
        this(context, null);
    }

    public MaterialToolbar(Context context, AttributeSet attributeSet) {
        int n3 = R$attr.toolbarStyle;
        this(context, attributeSet, n3);
    }

    public MaterialToolbar(Context scaleTypeArray, AttributeSet attributeSet, int n3) {
        Object object;
        int n4;
        int n7 = DEF_STYLE_RES;
        scaleTypeArray = MaterialThemeOverlay.wrap((Context)scaleTypeArray, attributeSet, n3, n7);
        super((Context)scaleTypeArray, attributeSet, n3);
        scaleTypeArray = this.getContext();
        int[] nArray = R$styleable.MaterialToolbar;
        int[] nArray2 = new int[]{};
        ImageView.ScaleType[] scaleTypeArray2 = scaleTypeArray;
        attributeSet = ThemeEnforcement.obtainStyledAttributes((Context)scaleTypeArray, attributeSet, nArray, n3, n7, nArray2);
        n3 = R$styleable.MaterialToolbar_navigationIconTint;
        n3 = (int)(attributeSet.hasValue(n3) ? 1 : 0);
        int n8 = -1;
        if (n3 != 0) {
            n3 = R$styleable.MaterialToolbar_navigationIconTint;
            n3 = attributeSet.getColor(n3, n8);
            this.setNavigationIconTint(n3);
        }
        n3 = R$styleable.MaterialToolbar_titleCentered;
        n3 = (int)(attributeSet.getBoolean(n3, false) ? 1 : 0);
        this.titleCentered = n3;
        n3 = R$styleable.MaterialToolbar_subtitleCentered;
        n3 = (int)(attributeSet.getBoolean(n3, false) ? 1 : 0);
        this.subtitleCentered = n3;
        n3 = R$styleable.MaterialToolbar_logoScaleType;
        if ((n3 = attributeSet.getInt(n3, n8)) >= 0 && n3 < (n4 = (scaleTypeArray2 = LOGO_SCALE_TYPE_ARRAY).length)) {
            this.logoScaleType = object = scaleTypeArray2[n3];
        }
        n3 = R$styleable.MaterialToolbar_logoAdjustViewBounds;
        if ((n3 = (int)(attributeSet.hasValue(n3) ? 1 : 0)) != 0) {
            n3 = R$styleable.MaterialToolbar_logoAdjustViewBounds;
            n3 = (int)(attributeSet.getBoolean(n3, false) ? 1 : 0);
            object = n3 != 0;
            this.logoAdjustViewBounds = object;
        }
        attributeSet.recycle();
        this.initBackground((Context)scaleTypeArray);
    }

    private Pair calculateTitleBoundLimits(TextView textView, TextView object) {
        int n3;
        int n4 = this.getMeasuredWidth();
        int n7 = n4 / 2;
        int n8 = this.getPaddingLeft();
        int n10 = this.getPaddingRight();
        n4 -= n10;
        for (n10 = 0; n10 < (n3 = this.getChildCount()); ++n10) {
            int n14;
            View view = this.getChildAt(n10);
            int n15 = view.getVisibility();
            if (n15 == (n14 = 8) || view == textView || view == object) continue;
            n15 = view.getRight();
            if (n15 < n7 && (n15 = view.getRight()) > n8) {
                n8 = view.getRight();
            }
            if ((n15 = view.getLeft()) <= n7 || (n15 = view.getLeft()) >= n4) continue;
            n4 = view.getLeft();
        }
        object = n8;
        Integer n16 = n4;
        textView = new Pair(object, (Object)n16);
        return textView;
    }

    private void initBackground(Context object) {
        Drawable drawable2 = this.getBackground();
        drawable2 = drawable2 == null ? ColorStateList.valueOf((int)0) : DrawableUtils.getColorStateListOrNull(drawable2);
        if (drawable2 != null) {
            MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable();
            materialShapeDrawable.setFillColor((ColorStateList)drawable2);
            materialShapeDrawable.initializeElevationOverlay((Context)object);
            object = ViewCompat.a;
            float f5 = ViewCompat$c.e((View)this);
            materialShapeDrawable.setElevation(f5);
            this.setBackground(materialShapeDrawable);
        }
    }

    private void layoutTitleCenteredHorizontally(View view, Pair object) {
        int n3 = this.getMeasuredWidth();
        int n4 = view.getMeasuredWidth();
        n3 /= 2;
        int n7 = n4 / 2;
        n4 += (n3 -= n7);
        Integer n8 = (Integer)((Pair)object).first;
        n7 = Math.max(n8 - n3, 0);
        object = (Integer)((Pair)object).second;
        int n10 = (Integer)object;
        n10 = Math.max(n4 - n10, 0);
        if ((n10 = Math.max(n7, n10)) > 0) {
            n3 += n10;
            n4 -= n10;
            n10 = View.MeasureSpec.makeMeasureSpec((int)(n4 - n3), (int)0x40000000);
            n7 = view.getMeasuredHeightAndState();
            view.measure(n10, n7);
        }
        n10 = view.getTop();
        n7 = view.getBottom();
        view.layout(n3, n10, n4, n7);
    }

    private void maybeCenterTitleViews() {
        boolean bl2 = this.titleCentered;
        if (!bl2 && !(bl2 = this.subtitleCentered)) {
            return;
        }
        TextView textView = ToolbarUtils.getTitleTextView(this);
        TextView textView2 = ToolbarUtils.getSubtitleTextView(this);
        if (textView == null && textView2 == null) {
            return;
        }
        Pair pair = this.calculateTitleBoundLimits(textView, textView2);
        boolean bl3 = this.titleCentered;
        if (bl3 && textView != null) {
            this.layoutTitleCenteredHorizontally((View)textView, pair);
        }
        if ((bl2 = this.subtitleCentered) && textView2 != null) {
            this.layoutTitleCenteredHorizontally((View)textView2, pair);
        }
    }

    private Drawable maybeTintNavigationIcon(Drawable drawable2) {
        Integer n3;
        if (drawable2 != null && (n3 = this.navigationIconTint) != null) {
            drawable2 = ut0_0.h(drawable2.mutate());
            n3 = this.navigationIconTint;
            int n4 = n3;
            drawable2.setTint(n4);
        }
        return drawable2;
    }

    private void updateLogoImageView() {
        ImageView imageView = ToolbarUtils.getLogoImageView(this);
        if (imageView != null) {
            Boolean bl2 = this.logoAdjustViewBounds;
            if (bl2 != null) {
                boolean bl3 = bl2;
                imageView.setAdjustViewBounds(bl3);
            }
            if ((bl2 = this.logoScaleType) != null) {
                imageView.setScaleType((ImageView.ScaleType)bl2);
            }
        }
    }

    public void clearNavigationIconTint() {
        this.navigationIconTint = null;
        Drawable drawable2 = this.getNavigationIcon();
        if (drawable2 != null) {
            Drawable drawable3 = ut0_0.h(drawable2.mutate());
            drawable3.setTintList(null);
            this.setNavigationIcon(drawable2);
        }
    }

    public ImageView.ScaleType getLogoScaleType() {
        return this.logoScaleType;
    }

    public Integer getNavigationIconTint() {
        return this.navigationIconTint;
    }

    public void inflateMenu(int n3) {
        Menu menu2 = this.getMenu();
        boolean bl2 = menu2 instanceof d;
        if (bl2) {
            Menu menu3 = menu2;
            menu3 = (d)menu2;
            menu3.stopDispatchingItemsChanged();
        }
        super.inflateMenu(n3);
        if (bl2) {
            menu2 = (d)menu2;
            menu2.startDispatchingItemsChanged();
        }
    }

    public boolean isLogoAdjustViewBounds() {
        boolean bl2;
        Boolean bl3 = this.logoAdjustViewBounds;
        if (bl3 != null && (bl2 = bl3.booleanValue())) {
            bl2 = true;
        } else {
            bl2 = false;
            bl3 = null;
        }
        return bl2;
    }

    public boolean isSubtitleCentered() {
        return this.subtitleCentered;
    }

    public boolean isTitleCentered() {
        return this.titleCentered;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        MaterialShapeUtils.setParentAbsoluteElevation((View)this);
    }

    public void onLayout(boolean bl2, int n3, int n4, int n7, int n8) {
        super.onLayout(bl2, n3, n4, n7, n8);
        this.maybeCenterTitleViews();
        this.updateLogoImageView();
    }

    public void setElevation(float f5) {
        super.setElevation(f5);
        MaterialShapeUtils.setElevation((View)this, f5);
    }

    public void setLogoAdjustViewBounds(boolean bl2) {
        boolean bl3;
        Boolean bl4 = this.logoAdjustViewBounds;
        if (bl4 == null || (bl3 = bl4.booleanValue()) != bl2) {
            Boolean bl5;
            this.logoAdjustViewBounds = bl5 = Boolean.valueOf(bl2);
            this.requestLayout();
        }
    }

    public void setLogoScaleType(ImageView.ScaleType scaleType) {
        ImageView.ScaleType scaleType2 = this.logoScaleType;
        if (scaleType2 != scaleType) {
            this.logoScaleType = scaleType;
            this.requestLayout();
        }
    }

    public void setNavigationIcon(Drawable drawable2) {
        drawable2 = this.maybeTintNavigationIcon(drawable2);
        super.setNavigationIcon(drawable2);
    }

    public void setNavigationIconTint(int n3) {
        Integer n4;
        this.navigationIconTint = n4 = Integer.valueOf(n3);
        n4 = this.getNavigationIcon();
        if (n4 != null) {
            this.setNavigationIcon((Drawable)n4);
        }
    }

    public void setSubtitleCentered(boolean bl2) {
        boolean bl3 = this.subtitleCentered;
        if (bl3 != bl2) {
            this.subtitleCentered = bl2;
            this.requestLayout();
        }
    }

    public void setTitleCentered(boolean bl2) {
        boolean bl3 = this.titleCentered;
        if (bl3 != bl2) {
            this.titleCentered = bl2;
            this.requestLayout();
        }
    }
}

