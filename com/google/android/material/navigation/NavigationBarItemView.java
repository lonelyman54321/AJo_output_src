/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.TimeInterpolator
 *  android.animation.ValueAnimator
 *  android.animation.ValueAnimator$AnimatorUpdateListener
 *  android.content.Context
 *  android.content.res.ColorStateList
 *  android.content.res.Resources
 *  android.graphics.Typeface
 *  android.graphics.drawable.Drawable
 *  android.graphics.drawable.Drawable$ConstantState
 *  android.graphics.drawable.RippleDrawable
 *  android.os.Build$VERSION
 *  android.text.TextUtils
 *  android.view.LayoutInflater
 *  android.view.MotionEvent
 *  android.view.PointerIcon
 *  android.view.View
 *  android.view.View$OnLayoutChangeListener
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 *  android.view.accessibility.AccessibilityNodeInfo
 *  android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction
 *  android.view.accessibility.AccessibilityNodeInfo$CollectionItemInfo
 *  android.widget.FrameLayout
 *  android.widget.FrameLayout$LayoutParams
 *  android.widget.ImageView
 *  android.widget.TextView
 */
package com.google.android.material.navigation;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.view.menu.f;
import androidx.appcompat.view.menu.i$a;
import androidx.core.view.ViewCompat;
import com.google.android.material.R$attr;
import com.google.android.material.R$dimen;
import com.google.android.material.R$drawable;
import com.google.android.material.R$id;
import com.google.android.material.R$integer;
import com.google.android.material.R$string;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.badge.BadgeDrawable;
import com.google.android.material.badge.BadgeUtils;
import com.google.android.material.motion.MotionUtils;
import com.google.android.material.navigation.NavigationBarItemView$2;
import com.google.android.material.navigation.NavigationBarItemView$3;
import com.google.android.material.navigation.NavigationBarItemView$ActiveIndicatorTransform;
import com.google.android.material.navigation.NavigationBarItemView$ActiveIndicatorUnlabeledTransform;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.ripple.RippleUtils;
import java.util.WeakHashMap;

public abstract class NavigationBarItemView
extends FrameLayout
implements i$a {
    private static final NavigationBarItemView$ActiveIndicatorTransform ACTIVE_INDICATOR_LABELED_TRANSFORM;
    private static final NavigationBarItemView$ActiveIndicatorTransform ACTIVE_INDICATOR_UNLABELED_TRANSFORM;
    private static final int[] CHECKED_STATE_SET;
    private static final int INVALID_ITEM_POSITION = 255;
    private ValueAnimator activeIndicatorAnimator;
    private int activeIndicatorDesiredHeight;
    private int activeIndicatorDesiredWidth;
    private boolean activeIndicatorEnabled;
    private int activeIndicatorLabelPadding;
    private int activeIndicatorMarginHorizontal;
    private float activeIndicatorProgress;
    private boolean activeIndicatorResizeable;
    private NavigationBarItemView$ActiveIndicatorTransform activeIndicatorTransform;
    private final View activeIndicatorView;
    private int activeTextAppearance = 0;
    private BadgeDrawable badgeDrawable;
    private final ImageView icon;
    private final FrameLayout iconContainer;
    private ColorStateList iconTint;
    private boolean initialized = false;
    private boolean isShifting;
    Drawable itemBackground;
    private f itemData;
    private int itemPaddingBottom;
    private int itemPaddingTop;
    private int itemPosition = -1;
    private ColorStateList itemRippleColor;
    private final ViewGroup labelGroup;
    private int labelVisibilityMode;
    private final TextView largeLabel;
    private Drawable originalIconDrawable;
    private float scaleDownFactor;
    private float scaleUpFactor;
    private float shiftAmount;
    private final TextView smallLabel;
    private Drawable wrappedIconDrawable;

    static {
        NavigationBarItemView$ActiveIndicatorTransform navigationBarItemView$ActiveIndicatorTransform;
        CHECKED_STATE_SET = new int[]{0x10100A0};
        ACTIVE_INDICATOR_LABELED_TRANSFORM = navigationBarItemView$ActiveIndicatorTransform = new NavigationBarItemView$ActiveIndicatorTransform(null);
        ACTIVE_INDICATOR_UNLABELED_TRANSFORM = navigationBarItemView$ActiveIndicatorTransform = new NavigationBarItemView$ActiveIndicatorUnlabeledTransform(null);
    }

    public NavigationBarItemView(Context context) {
        super(context);
        TextView textView;
        TextView textView2;
        Object object;
        NavigationBarItemView$ActiveIndicatorTransform navigationBarItemView$ActiveIndicatorTransform;
        this.activeIndicatorTransform = navigationBarItemView$ActiveIndicatorTransform = ACTIVE_INDICATOR_LABELED_TRANSFORM;
        navigationBarItemView$ActiveIndicatorTransform = null;
        this.activeIndicatorProgress = 0.0f;
        this.activeIndicatorEnabled = false;
        this.activeIndicatorDesiredWidth = 0;
        this.activeIndicatorDesiredHeight = 0;
        this.activeIndicatorResizeable = false;
        this.activeIndicatorMarginHorizontal = 0;
        context = LayoutInflater.from((Context)context);
        int n3 = this.getItemLayoutResId();
        boolean bl2 = true;
        context.inflate(n3, (ViewGroup)this, bl2);
        int n4 = R$id.navigation_bar_item_icon_container;
        context = (FrameLayout)this.findViewById(n4);
        this.iconContainer = context;
        n4 = R$id.navigation_bar_item_active_indicator_view;
        context = this.findViewById(n4);
        this.activeIndicatorView = context;
        n4 = R$id.navigation_bar_item_icon_view;
        context = (ImageView)this.findViewById(n4);
        this.icon = context;
        n3 = R$id.navigation_bar_item_labels_group;
        this.labelGroup = object = (ViewGroup)this.findViewById(n3);
        int n7 = R$id.navigation_bar_item_small_label_view;
        this.smallLabel = textView2 = (TextView)this.findViewById(n7);
        int n8 = R$id.navigation_bar_item_large_label_view;
        this.largeLabel = textView = (TextView)this.findViewById(n8);
        int n10 = this.getItemBackgroundResId();
        this.setBackgroundResource(n10);
        Resources resources = this.getResources();
        int n14 = this.getItemDefaultMarginResId();
        this.itemPaddingTop = n10 = resources.getDimensionPixelSize(n14);
        this.itemPaddingBottom = n3 = object.getPaddingBottom();
        object = this.getResources();
        n10 = R$dimen.m3_navigation_item_active_indicator_label_padding;
        this.activeIndicatorLabelPadding = n3 = object.getDimensionPixelSize(n10);
        object = ViewCompat.a;
        n3 = 2;
        textView2.setImportantForAccessibility(n3);
        textView.setImportantForAccessibility(n3);
        this.setFocusable(bl2);
        float f5 = textView2.getTextSize();
        float f6 = textView.getTextSize();
        this.calculateTextScaleFactors(f5, f6);
        if (context != null) {
            super(this);
            context.addOnLayoutChangeListener((View.OnLayoutChangeListener)object);
        }
    }

    public static /* synthetic */ ImageView access$200(NavigationBarItemView navigationBarItemView) {
        return navigationBarItemView.icon;
    }

    public static /* synthetic */ void access$300(NavigationBarItemView navigationBarItemView, View view) {
        navigationBarItemView.tryUpdateBadgeBounds(view);
    }

    public static /* synthetic */ void access$400(NavigationBarItemView navigationBarItemView, int n3) {
        navigationBarItemView.updateActiveIndicatorLayoutParams(n3);
    }

    public static /* synthetic */ void access$500(NavigationBarItemView navigationBarItemView, float f5, float f6) {
        navigationBarItemView.setActiveIndicatorProgress(f5, f6);
    }

    private void calculateTextScaleFactors(float f5, float f6) {
        float f7;
        float f8;
        this.shiftAmount = f8 = f5 - f6;
        f8 = 1.0f;
        this.scaleUpFactor = f7 = f6 * f8 / f5;
        this.scaleDownFactor = f5 = f5 * f8 / f6;
    }

    private static Drawable createItemBackgroundCompat(ColorStateList colorStateList) {
        colorStateList = RippleUtils.convertToRippleDrawableColor(colorStateList);
        RippleDrawable rippleDrawable = new RippleDrawable(colorStateList, null, null);
        return rippleDrawable;
    }

    private FrameLayout getCustomParentForBadge(View view) {
        boolean bl2;
        ImageView imageView = this.icon;
        View view2 = null;
        if (view == imageView && (bl2 = BadgeUtils.USE_COMPAT_PARENT)) {
            view2 = view = imageView.getParent();
            view2 = (FrameLayout)view;
        }
        return view2;
    }

    private View getIconOrContainer() {
        FrameLayout frameLayout = this.iconContainer;
        if (frameLayout == null) {
            frameLayout = this.icon;
        }
        return frameLayout;
    }

    private int getItemVisiblePosition() {
        ViewGroup viewGroup = (ViewGroup)this.getParent();
        int n3 = viewGroup.indexOfChild((View)this);
        int n4 = 0;
        for (int i3 = 0; i3 < n3; ++i3) {
            int n7;
            View view = viewGroup.getChildAt(i3);
            boolean bl2 = view instanceof NavigationBarItemView;
            if (!bl2 || (n7 = view.getVisibility()) != 0) continue;
            ++n4;
        }
        return n4;
    }

    private int getSuggestedIconHeight() {
        int n3 = ((FrameLayout.LayoutParams)this.getIconOrContainer().getLayoutParams()).topMargin;
        return this.getIconOrContainer().getMeasuredHeight() + n3;
    }

    private int getSuggestedIconWidth() {
        int n3;
        BadgeDrawable badgeDrawable;
        int n4;
        BadgeDrawable badgeDrawable2 = this.badgeDrawable;
        if (badgeDrawable2 == null) {
            n4 = 0;
            badgeDrawable2 = null;
        } else {
            n4 = badgeDrawable2.getMinimumWidth();
            badgeDrawable = this.badgeDrawable;
            n3 = badgeDrawable.getHorizontalOffset();
            n4 -= n3;
        }
        badgeDrawable = (FrameLayout.LayoutParams)this.getIconOrContainer().getLayoutParams();
        int n7 = ((FrameLayout.LayoutParams)badgeDrawable).leftMargin;
        n7 = Math.max(n4, n7);
        int n8 = this.icon.getMeasuredWidth() + n7;
        n3 = ((FrameLayout.LayoutParams)badgeDrawable).rightMargin;
        return Math.max(n4, n3) + n8;
    }

    private boolean hasBadge() {
        boolean bl2;
        BadgeDrawable badgeDrawable = this.badgeDrawable;
        if (badgeDrawable != null) {
            bl2 = true;
        } else {
            bl2 = false;
            badgeDrawable = null;
        }
        return bl2;
    }

    private boolean isActiveIndicatorResizeableAndUnlabeled() {
        int n3;
        int n4 = this.activeIndicatorResizeable;
        n4 = n4 != 0 && (n4 = this.labelVisibilityMode) == (n3 = 2) ? 1 : 0;
        return n4 != 0;
    }

    private void maybeAnimateActiveIndicatorToProgress(float f5) {
        boolean bl2 = this.activeIndicatorEnabled;
        if (bl2 && (bl2 = this.initialized)) {
            WeakHashMap weakHashMap = ViewCompat.a;
            bl2 = this.isAttachedToWindow();
            if (bl2) {
                float f6;
                weakHashMap = this.activeIndicatorAnimator;
                if (weakHashMap != null) {
                    weakHashMap.cancel();
                    bl2 = false;
                    f6 = 0.0f;
                    weakHashMap = null;
                    this.activeIndicatorAnimator = null;
                }
                f6 = this.activeIndicatorProgress;
                Object object = new float[]{f6, f5};
                weakHashMap = ValueAnimator.ofFloat((float[])object);
                this.activeIndicatorAnimator = weakHashMap;
                object = new NavigationBarItemView$3;
                object(this, f5);
                weakHashMap.addUpdateListener((ValueAnimator.AnimatorUpdateListener)object);
                ValueAnimator valueAnimator = this.activeIndicatorAnimator;
                weakHashMap = this.getContext();
                int n3 = R$attr.motionEasingEmphasizedInterpolator;
                TimeInterpolator timeInterpolator = AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR;
                weakHashMap = MotionUtils.resolveThemeInterpolator((Context)weakHashMap, n3, timeInterpolator);
                valueAnimator.setInterpolator((TimeInterpolator)weakHashMap);
                valueAnimator = this.activeIndicatorAnimator;
                weakHashMap = this.getContext();
                n3 = R$attr.motionDurationLong2;
                timeInterpolator = this.getResources();
                int n4 = R$integer.material_motion_duration_long_1;
                int n7 = timeInterpolator.getInteger(n4);
                long l2 = MotionUtils.resolveThemeDuration((Context)weakHashMap, n3, n7);
                valueAnimator.setDuration(l2);
                this.activeIndicatorAnimator.start();
                return;
            }
        }
        this.setActiveIndicatorProgress(f5, f5);
    }

    private void refreshChecked() {
        f f5 = this.itemData;
        if (f5 != null) {
            boolean bl2 = f5.isChecked();
            this.setChecked(bl2);
        }
    }

    private void refreshItemBackground() {
        Drawable drawable2 = this.itemBackground;
        Object object = this.itemRippleColor;
        RippleDrawable rippleDrawable = null;
        boolean bl2 = true;
        if (object != null) {
            Drawable drawable3;
            object = this.getActiveIndicatorDrawable();
            boolean bl3 = this.activeIndicatorEnabled;
            if (bl3 && (drawable3 = this.getActiveIndicatorDrawable()) != null && (drawable3 = this.iconContainer) != null && object != null) {
                RippleDrawable rippleDrawable2;
                drawable3 = RippleUtils.sanitizeRippleDrawableColor(this.itemRippleColor);
                rippleDrawable = rippleDrawable2 = new RippleDrawable((ColorStateList)drawable3, null, (Drawable)object);
                bl2 = false;
                rippleDrawable2 = null;
            } else if (drawable2 == null) {
                drawable2 = NavigationBarItemView.createItemBackgroundCompat(this.itemRippleColor);
            }
        }
        if ((object = this.iconContainer) != null) {
            object.setPadding(0, 0, 0, 0);
            object = this.iconContainer;
            object.setForeground(rippleDrawable);
        }
        object = ViewCompat.a;
        this.setBackground(drawable2);
        int n3 = Build.VERSION.SDK_INT;
        int n4 = 26;
        if (n3 >= n4) {
            gu1_1.a(this, bl2);
        }
    }

    private void setActiveIndicatorProgress(float f5, float f6) {
        View view = this.activeIndicatorView;
        if (view != null) {
            NavigationBarItemView$ActiveIndicatorTransform navigationBarItemView$ActiveIndicatorTransform = this.activeIndicatorTransform;
            navigationBarItemView$ActiveIndicatorTransform.updateForProgress(f5, f6, view);
        }
        this.activeIndicatorProgress = f5;
    }

    private static void setTextAppearanceWithoutFontScaling(TextView textView, int n3) {
        Hm3.f(textView, n3);
        Context context = textView.getContext();
        n3 = MaterialResources.getUnscaledTextSize(context, n3, 0);
        if (n3 != 0) {
            float f5 = n3;
            textView.setTextSize(0, f5);
        }
    }

    private static void setViewScaleValues(View view, float f5, float f6, int n3) {
        view.setScaleX(f5);
        view.setScaleY(f6);
        view.setVisibility(n3);
    }

    private static void setViewTopMarginAndGravity(View view, int n3, int n4) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams)view.getLayoutParams();
        layoutParams.topMargin = n3;
        layoutParams.bottomMargin = n3;
        layoutParams.gravity = n4;
        view.setLayoutParams((ViewGroup.LayoutParams)layoutParams);
    }

    private void tryAttachBadgeToAnchor(View view) {
        boolean bl2 = this.hasBadge();
        if (!bl2) {
            return;
        }
        if (view != null) {
            bl2 = false;
            this.setClipChildren(false);
            this.setClipToPadding(false);
            BadgeDrawable badgeDrawable = this.badgeDrawable;
            FrameLayout frameLayout = this.getCustomParentForBadge(view);
            BadgeUtils.attachBadgeDrawable(badgeDrawable, view, frameLayout);
        }
    }

    private void tryRemoveBadgeFromAnchor(View view) {
        boolean bl2 = this.hasBadge();
        if (!bl2) {
            return;
        }
        if (view != null) {
            bl2 = true;
            this.setClipChildren(bl2);
            this.setClipToPadding(bl2);
            BadgeDrawable badgeDrawable = this.badgeDrawable;
            BadgeUtils.detachBadgeDrawable(badgeDrawable, view);
        }
        this.badgeDrawable = null;
    }

    private void tryUpdateBadgeBounds(View view) {
        boolean bl2 = this.hasBadge();
        if (!bl2) {
            return;
        }
        BadgeDrawable badgeDrawable = this.badgeDrawable;
        FrameLayout frameLayout = this.getCustomParentForBadge(view);
        BadgeUtils.setBadgeDrawableBounds(badgeDrawable, view, frameLayout);
    }

    private void updateActiveIndicatorLayoutParams(int n3) {
        View view = this.activeIndicatorView;
        if (view != null && n3 > 0) {
            int n4 = this.activeIndicatorDesiredWidth;
            int n7 = this.activeIndicatorMarginHorizontal * 2;
            n3 -= n7;
            n3 = Math.min(n4, n3);
            view = (FrameLayout.LayoutParams)this.activeIndicatorView.getLayoutParams();
            n7 = (int)(this.isActiveIndicatorResizeableAndUnlabeled() ? 1 : 0);
            n7 = n7 != 0 ? n3 : this.activeIndicatorDesiredHeight;
            view.height = n7;
            view.width = n3;
            View view2 = this.activeIndicatorView;
            view2.setLayoutParams((ViewGroup.LayoutParams)view);
        }
    }

    private void updateActiveIndicatorTransform() {
        NavigationBarItemView$ActiveIndicatorTransform navigationBarItemView$ActiveIndicatorTransform;
        NavigationBarItemView$ActiveIndicatorTransform navigationBarItemView$ActiveIndicatorTransform2;
        boolean bl2 = this.isActiveIndicatorResizeableAndUnlabeled();
        this.activeIndicatorTransform = bl2 ? (navigationBarItemView$ActiveIndicatorTransform2 = ACTIVE_INDICATOR_UNLABELED_TRANSFORM) : (navigationBarItemView$ActiveIndicatorTransform = ACTIVE_INDICATOR_LABELED_TRANSFORM);
    }

    private static void updateViewPaddingBottom(View view, int n3) {
        int n4 = view.getPaddingLeft();
        int n7 = view.getPaddingTop();
        int n8 = view.getPaddingRight();
        view.setPadding(n4, n7, n8, n3);
    }

    public void clear() {
        this.removeBadge();
        this.itemData = null;
        this.activeIndicatorProgress = 0.0f;
        this.initialized = false;
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean bl2;
        FrameLayout frameLayout = this.iconContainer;
        if (frameLayout != null && (bl2 = this.activeIndicatorEnabled)) {
            frameLayout.dispatchTouchEvent(motionEvent);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public Drawable getActiveIndicatorDrawable() {
        View view = this.activeIndicatorView;
        if (view == null) {
            return null;
        }
        return view.getBackground();
    }

    public BadgeDrawable getBadge() {
        return this.badgeDrawable;
    }

    public int getItemBackgroundResId() {
        return R$drawable.mtrl_navigation_bar_item_background;
    }

    public f getItemData() {
        return this.itemData;
    }

    public int getItemDefaultMarginResId() {
        return R$dimen.mtrl_navigation_bar_item_default_margin;
    }

    public abstract int getItemLayoutResId();

    public int getItemPosition() {
        return this.itemPosition;
    }

    public int getSuggestedMinimumHeight() {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams)this.labelGroup.getLayoutParams();
        int n3 = this.getSuggestedIconHeight();
        ViewGroup viewGroup = this.labelGroup;
        int n4 = viewGroup.getVisibility();
        if (n4 == 0) {
            n4 = this.activeIndicatorLabelPadding;
        } else {
            n4 = 0;
            viewGroup = null;
        }
        n3 += n4;
        n4 = layoutParams.topMargin;
        n3 += n4;
        n4 = this.labelGroup.getMeasuredHeight() + n3;
        int n7 = layoutParams.bottomMargin;
        return n4 + n7;
    }

    public int getSuggestedMinimumWidth() {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams)this.labelGroup.getLayoutParams();
        int n3 = layoutParams.leftMargin;
        int n4 = this.labelGroup.getMeasuredWidth() + n3;
        int n7 = layoutParams.rightMargin;
        return Math.max(this.getSuggestedIconWidth(), n4 += n7);
    }

    public void initialize(f f5, int n3) {
        int n4;
        this.itemData = f5;
        n3 = (int)(f5.isCheckable() ? 1 : 0);
        this.setCheckable(n3 != 0);
        n3 = (int)(f5.isChecked() ? 1 : 0);
        this.setChecked(n3 != 0);
        n3 = (int)(f5.isEnabled() ? 1 : 0);
        this.setEnabled(n3 != 0);
        Object object = f5.getIcon();
        this.setIcon((Drawable)object);
        object = f5.e;
        this.setTitle((CharSequence)object);
        n3 = f5.a;
        this.setId(n3);
        object = f5.q;
        n3 = (int)(TextUtils.isEmpty((CharSequence)object) ? 1 : 0);
        if (n3 == 0) {
            object = f5.q;
            this.setContentDescription((CharSequence)object);
        }
        object = (n3 = (int)(TextUtils.isEmpty((CharSequence)(object = f5.r)) ? 1 : 0)) == 0 ? f5.r : f5.e;
        int n7 = Build.VERSION.SDK_INT;
        int n8 = 23;
        if (n7 > n8) {
            vo3_0.a((View)this, (CharSequence)object);
        }
        if ((n4 = f5.isVisible()) != 0) {
            n4 = 0;
            f5 = null;
        } else {
            n4 = 8;
        }
        this.setVisibility(n4);
        this.initialized = true;
    }

    public int[] onCreateDrawableState(int n3) {
        boolean bl2;
        int[] nArray = super.onCreateDrawableState(++n3);
        Object object = this.itemData;
        if (object != null && (bl2 = ((f)object).isCheckable()) && (bl2 = ((f)(object = this.itemData)).isChecked())) {
            object = CHECKED_STATE_SET;
            View.mergeDrawableStates((int[])nArray, (int[])object);
        }
        return nArray;
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        CharSequence charSequence;
        boolean bl2;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        Object object = this.badgeDrawable;
        if (object != null && (bl2 = object.isVisible())) {
            object = this.itemData;
            charSequence = ((f)object).e;
            object = ((f)object).q;
            bl2 = TextUtils.isEmpty((CharSequence)object);
            if (!bl2) {
                object = this.itemData;
                charSequence = ((f)object).q;
            }
            object = new StringBuilder();
            ((StringBuilder)object).append((Object)charSequence);
            ((StringBuilder)object).append(", ");
            charSequence = this.badgeDrawable.getContentDescription();
            ((StringBuilder)object).append((Object)charSequence);
            object = ((StringBuilder)object).toString();
            accessibilityNodeInfo.setContentDescription((CharSequence)object);
        }
        int n3 = this.getItemVisiblePosition();
        boolean bl3 = this.isSelected();
        int n4 = 0;
        charSequence = null;
        int n7 = 1;
        int n8 = 1;
        object = (AccessibilityNodeInfo.CollectionItemInfo)C2$f.a((int)0, (int)n7, (int)n3, (int)n8, (boolean)false, (boolean)bl3).a;
        accessibilityNodeInfo.setCollectionItemInfo((AccessibilityNodeInfo.CollectionItemInfo)object);
        bl2 = this.isSelected();
        if (bl2) {
            bl2 = false;
            accessibilityNodeInfo.setClickable(false);
            object = (AccessibilityNodeInfo.AccessibilityAction)C2$a.g.a;
            accessibilityNodeInfo.removeAction((AccessibilityNodeInfo.AccessibilityAction)object);
        }
        object = this.getResources();
        n4 = R$string.item_view_role_description;
        object = object.getString(n4);
        accessibilityNodeInfo.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", (CharSequence)object);
    }

    public void onSizeChanged(int n3, int n4, int n7, int n8) {
        super.onSizeChanged(n3, n4, n7, n8);
        NavigationBarItemView$2 navigationBarItemView$2 = new NavigationBarItemView$2(this, n3);
        this.post(navigationBarItemView$2);
    }

    public boolean prefersCondensedTitle() {
        return false;
    }

    public void removeBadge() {
        ImageView imageView = this.icon;
        this.tryRemoveBadgeFromAnchor((View)imageView);
    }

    public void setActiveIndicatorDrawable(Drawable drawable2) {
        View view = this.activeIndicatorView;
        if (view == null) {
            return;
        }
        view.setBackgroundDrawable(drawable2);
        this.refreshItemBackground();
    }

    public void setActiveIndicatorEnabled(boolean n3) {
        this.activeIndicatorEnabled = n3;
        this.refreshItemBackground();
        View view = this.activeIndicatorView;
        if (view != null) {
            n3 = n3 != 0 ? 0 : 8;
            view.setVisibility(n3);
            this.requestLayout();
        }
    }

    public void setActiveIndicatorHeight(int n3) {
        this.activeIndicatorDesiredHeight = n3;
        n3 = this.getWidth();
        this.updateActiveIndicatorLayoutParams(n3);
    }

    public void setActiveIndicatorLabelPadding(int n3) {
        int n4 = this.activeIndicatorLabelPadding;
        if (n4 != n3) {
            this.activeIndicatorLabelPadding = n3;
            this.refreshChecked();
        }
    }

    public void setActiveIndicatorMarginHorizontal(int n3) {
        this.activeIndicatorMarginHorizontal = n3;
        n3 = this.getWidth();
        this.updateActiveIndicatorLayoutParams(n3);
    }

    public void setActiveIndicatorResizeable(boolean bl2) {
        this.activeIndicatorResizeable = bl2;
    }

    public void setActiveIndicatorWidth(int n3) {
        this.activeIndicatorDesiredWidth = n3;
        n3 = this.getWidth();
        this.updateActiveIndicatorLayoutParams(n3);
    }

    public void setBadge(BadgeDrawable badgeDrawable) {
        BadgeDrawable badgeDrawable2 = this.badgeDrawable;
        if (badgeDrawable2 == badgeDrawable) {
            return;
        }
        boolean bl2 = this.hasBadge();
        if (bl2 && (badgeDrawable2 = this.icon) != null) {
            this.tryRemoveBadgeFromAnchor((View)badgeDrawable2);
        }
        this.badgeDrawable = badgeDrawable;
        badgeDrawable = this.icon;
        if (badgeDrawable != null) {
            this.tryAttachBadgeToAnchor((View)badgeDrawable);
        }
    }

    public void setCheckable(boolean bl2) {
        this.refreshDrawableState();
    }

    public void setChecked(boolean bl2) {
        ViewGroup viewGroup;
        TextView textView = this.largeLabel;
        int n3 = textView.getWidth();
        int n4 = 2;
        float f5 = 2.8E-45f;
        float f6 = n3 / n4;
        textView.setPivotX(f6);
        textView = this.largeLabel;
        f6 = textView.getBaseline();
        textView.setPivotY(f6);
        textView = this.smallLabel;
        f6 = textView.getWidth() / n4;
        textView.setPivotX(f6);
        textView = this.smallLabel;
        n3 = textView.getBaseline();
        f6 = n3;
        textView.setPivotY(f6);
        float f7 = 1.0f;
        if (bl2) {
            n3 = 1065353216;
            f6 = 1.0f;
        } else {
            n3 = 0;
            f6 = 0.0f;
            viewGroup = null;
        }
        this.maybeAnimateActiveIndicatorToProgress(f6);
        n3 = this.labelVisibilityMode;
        int n7 = -1;
        float f8 = 0.0f / 0.0f;
        int n8 = 17;
        int n10 = 49;
        int n14 = 4;
        if (n3 != n7) {
            if (n3 != 0) {
                n7 = 1;
                f8 = Float.MIN_VALUE;
                if (n3 != n7) {
                    if (n3 == n4) {
                        textView = this.getIconOrContainer();
                        n3 = this.itemPaddingTop;
                        NavigationBarItemView.setViewTopMarginAndGravity((View)textView, n3, n8);
                        textView = this.largeLabel;
                        n3 = 8;
                        f6 = 1.1E-44f;
                        textView.setVisibility(n3);
                        textView = this.smallLabel;
                        textView.setVisibility(n3);
                    }
                } else {
                    viewGroup = this.labelGroup;
                    n4 = this.itemPaddingBottom;
                    NavigationBarItemView.updateViewPaddingBottom((View)viewGroup, n4);
                    if (bl2) {
                        viewGroup = this.getIconOrContainer();
                        f5 = this.itemPaddingTop;
                        f8 = this.shiftAmount;
                        n4 = (int)(f5 += f8);
                        NavigationBarItemView.setViewTopMarginAndGravity((View)viewGroup, n4, n10);
                        viewGroup = this.largeLabel;
                        NavigationBarItemView.setViewScaleValues((View)viewGroup, f7, f7, 0);
                        textView = this.smallLabel;
                        f6 = this.scaleUpFactor;
                        NavigationBarItemView.setViewScaleValues((View)textView, f6, f6, n14);
                    } else {
                        viewGroup = this.getIconOrContainer();
                        n4 = this.itemPaddingTop;
                        NavigationBarItemView.setViewTopMarginAndGravity((View)viewGroup, n4, n10);
                        viewGroup = this.largeLabel;
                        f5 = this.scaleDownFactor;
                        NavigationBarItemView.setViewScaleValues((View)viewGroup, f5, f5, n14);
                        viewGroup = this.smallLabel;
                        NavigationBarItemView.setViewScaleValues((View)viewGroup, f7, f7, 0);
                    }
                }
            } else {
                if (bl2) {
                    textView = this.getIconOrContainer();
                    n3 = this.itemPaddingTop;
                    NavigationBarItemView.setViewTopMarginAndGravity((View)textView, n3, n10);
                    textView = this.labelGroup;
                    n3 = this.itemPaddingBottom;
                    NavigationBarItemView.updateViewPaddingBottom((View)textView, n3);
                    textView = this.largeLabel;
                    textView.setVisibility(0);
                } else {
                    textView = this.getIconOrContainer();
                    n3 = this.itemPaddingTop;
                    NavigationBarItemView.setViewTopMarginAndGravity((View)textView, n3, n8);
                    NavigationBarItemView.updateViewPaddingBottom((View)this.labelGroup, 0);
                    textView = this.largeLabel;
                    textView.setVisibility(n14);
                }
                textView = this.smallLabel;
                textView.setVisibility(n14);
            }
        } else {
            n3 = (int)(this.isShifting ? 1 : 0);
            if (n3 != 0) {
                if (bl2) {
                    textView = this.getIconOrContainer();
                    n3 = this.itemPaddingTop;
                    NavigationBarItemView.setViewTopMarginAndGravity((View)textView, n3, n10);
                    textView = this.labelGroup;
                    n3 = this.itemPaddingBottom;
                    NavigationBarItemView.updateViewPaddingBottom((View)textView, n3);
                    textView = this.largeLabel;
                    textView.setVisibility(0);
                } else {
                    textView = this.getIconOrContainer();
                    n3 = this.itemPaddingTop;
                    NavigationBarItemView.setViewTopMarginAndGravity((View)textView, n3, n8);
                    NavigationBarItemView.updateViewPaddingBottom((View)this.labelGroup, 0);
                    textView = this.largeLabel;
                    textView.setVisibility(n14);
                }
                textView = this.smallLabel;
                textView.setVisibility(n14);
            } else {
                viewGroup = this.labelGroup;
                n4 = this.itemPaddingBottom;
                NavigationBarItemView.updateViewPaddingBottom((View)viewGroup, n4);
                if (bl2) {
                    viewGroup = this.getIconOrContainer();
                    f5 = this.itemPaddingTop;
                    f8 = this.shiftAmount;
                    n4 = (int)(f5 += f8);
                    NavigationBarItemView.setViewTopMarginAndGravity((View)viewGroup, n4, n10);
                    viewGroup = this.largeLabel;
                    NavigationBarItemView.setViewScaleValues((View)viewGroup, f7, f7, 0);
                    textView = this.smallLabel;
                    f6 = this.scaleUpFactor;
                    NavigationBarItemView.setViewScaleValues((View)textView, f6, f6, n14);
                } else {
                    viewGroup = this.getIconOrContainer();
                    n4 = this.itemPaddingTop;
                    NavigationBarItemView.setViewTopMarginAndGravity((View)viewGroup, n4, n10);
                    viewGroup = this.largeLabel;
                    f5 = this.scaleDownFactor;
                    NavigationBarItemView.setViewScaleValues((View)viewGroup, f5, f5, n14);
                    viewGroup = this.smallLabel;
                    NavigationBarItemView.setViewScaleValues((View)viewGroup, f7, f7, 0);
                }
            }
        }
        this.refreshDrawableState();
        this.setSelected(bl2);
    }

    public void setEnabled(boolean bl2) {
        super.setEnabled(bl2);
        this.smallLabel.setEnabled(bl2);
        this.largeLabel.setEnabled(bl2);
        this.icon.setEnabled(bl2);
        Vv2 vv2 = null;
        if (bl2) {
            Object object = this.getContext();
            int n3 = Build.VERSION.SDK_INT;
            int n4 = 24;
            if (n3 >= n4) {
                object = Vv2$a.a(object);
                vv2 = new Vv2((PointerIcon)object);
            } else {
                object = new Vv2(null);
                vv2 = object;
            }
            ViewCompat.v((View)this, vv2);
        } else {
            ViewCompat.v((View)this, null);
        }
    }

    public void setIcon(Drawable drawable2) {
        Drawable drawable3 = this.originalIconDrawable;
        if (drawable2 == drawable3) {
            return;
        }
        this.originalIconDrawable = drawable2;
        if (drawable2 != null) {
            drawable3 = drawable2.getConstantState();
            if (drawable3 != null) {
                drawable2 = drawable3.newDrawable();
            }
            this.wrappedIconDrawable = drawable2 = ut0_0.h(drawable2).mutate();
            drawable3 = this.iconTint;
            if (drawable3 != null) {
                drawable2.setTintList((ColorStateList)drawable3);
            }
        }
        this.icon.setImageDrawable(drawable2);
    }

    public void setIconSize(int n3) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams)this.icon.getLayoutParams();
        layoutParams.width = n3;
        layoutParams.height = n3;
        this.icon.setLayoutParams((ViewGroup.LayoutParams)layoutParams);
    }

    public void setIconTintList(ColorStateList colorStateList) {
        this.iconTint = colorStateList;
        f f5 = this.itemData;
        if (f5 != null && (f5 = this.wrappedIconDrawable) != null) {
            f5.setTintList(colorStateList);
            colorStateList = this.wrappedIconDrawable;
            colorStateList.invalidateSelf();
        }
    }

    public void setItemBackground(int n3) {
        Drawable drawable2;
        if (n3 == 0) {
            n3 = 0;
            drawable2 = null;
        } else {
            Context context = this.getContext();
            drawable2 = t70.getDrawable(context, n3);
        }
        this.setItemBackground(drawable2);
    }

    public void setItemBackground(Drawable drawable2) {
        Drawable.ConstantState constantState;
        if (drawable2 != null && (constantState = drawable2.getConstantState()) != null) {
            drawable2 = drawable2.getConstantState().newDrawable().mutate();
        }
        this.itemBackground = drawable2;
        this.refreshItemBackground();
    }

    public void setItemPaddingBottom(int n3) {
        int n4 = this.itemPaddingBottom;
        if (n4 != n3) {
            this.itemPaddingBottom = n3;
            this.refreshChecked();
        }
    }

    public void setItemPaddingTop(int n3) {
        int n4 = this.itemPaddingTop;
        if (n4 != n3) {
            this.itemPaddingTop = n3;
            this.refreshChecked();
        }
    }

    public void setItemPosition(int n3) {
        this.itemPosition = n3;
    }

    public void setItemRippleColor(ColorStateList colorStateList) {
        this.itemRippleColor = colorStateList;
        this.refreshItemBackground();
    }

    public void setLabelVisibilityMode(int n3) {
        int n4 = this.labelVisibilityMode;
        if (n4 != n3) {
            this.labelVisibilityMode = n3;
            this.updateActiveIndicatorTransform();
            n3 = this.getWidth();
            this.updateActiveIndicatorLayoutParams(n3);
            this.refreshChecked();
        }
    }

    public void setShifting(boolean bl2) {
        boolean bl3 = this.isShifting;
        if (bl3 != bl2) {
            this.isShifting = bl2;
            this.refreshChecked();
        }
    }

    public void setShortcut(boolean bl2, char c2) {
    }

    public void setTextAppearanceActive(int n3) {
        this.activeTextAppearance = n3;
        NavigationBarItemView.setTextAppearanceWithoutFontScaling(this.largeLabel, n3);
        float f5 = this.smallLabel.getTextSize();
        float f6 = this.largeLabel.getTextSize();
        this.calculateTextScaleFactors(f5, f6);
    }

    public void setTextAppearanceActiveBoldEnabled(boolean bl2) {
        int n3 = this.activeTextAppearance;
        this.setTextAppearanceActive(n3);
        TextView textView = this.largeLabel;
        Typeface typeface = textView.getTypeface();
        textView.setTypeface(typeface, (int)(bl2 ? 1 : 0));
    }

    public void setTextAppearanceInactive(int n3) {
        NavigationBarItemView.setTextAppearanceWithoutFontScaling(this.smallLabel, n3);
        float f5 = this.smallLabel.getTextSize();
        float f6 = this.largeLabel.getTextSize();
        this.calculateTextScaleFactors(f5, f6);
    }

    public void setTextColor(ColorStateList colorStateList) {
        if (colorStateList != null) {
            this.smallLabel.setTextColor(colorStateList);
            TextView textView = this.largeLabel;
            textView.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
        int n3;
        int n4;
        this.smallLabel.setText(charSequence);
        this.largeLabel.setText(charSequence);
        Object object = this.itemData;
        if (object == null || (n4 = TextUtils.isEmpty((CharSequence)(object = ((f)object).q))) != 0) {
            this.setContentDescription(charSequence);
        }
        if ((object = this.itemData) != null && (n4 = (int)(TextUtils.isEmpty((CharSequence)(object = ((f)object).r)) ? 1 : 0)) == 0) {
            charSequence = this.itemData.r;
        }
        if ((n4 = Build.VERSION.SDK_INT) > (n3 = 23)) {
            vo3_0.a((View)this, charSequence);
        }
    }

    public boolean showsIcon() {
        return true;
    }
}

