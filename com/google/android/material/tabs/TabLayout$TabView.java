/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.ColorStateList
 *  android.graphics.Canvas
 *  android.graphics.PorterDuff$Mode
 *  android.graphics.drawable.Drawable
 *  android.graphics.drawable.GradientDrawable
 *  android.graphics.drawable.RippleDrawable
 *  android.os.Build$VERSION
 *  android.text.Layout
 *  android.text.TextUtils
 *  android.view.LayoutInflater
 *  android.view.PointerIcon
 *  android.view.View
 *  android.view.View$MeasureSpec
 *  android.view.View$OnLayoutChangeListener
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 *  android.view.ViewGroup$MarginLayoutParams
 *  android.view.ViewParent
 *  android.view.accessibility.AccessibilityNodeInfo
 *  android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction
 *  android.view.accessibility.AccessibilityNodeInfo$CollectionItemInfo
 *  android.widget.FrameLayout
 *  android.widget.FrameLayout$LayoutParams
 *  android.widget.ImageView
 *  android.widget.LinearLayout
 *  android.widget.TextView
 */
package com.google.android.material.tabs;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.text.Layout;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.view.ViewCompat;
import com.google.android.material.R$layout;
import com.google.android.material.R$string;
import com.google.android.material.badge.BadgeDrawable;
import com.google.android.material.badge.BadgeUtils;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.ripple.RippleUtils;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayout$Tab;
import com.google.android.material.tabs.TabLayout$TabView$1;

public final class TabLayout$TabView
extends LinearLayout {
    private View badgeAnchorView;
    private BadgeDrawable badgeDrawable;
    private Drawable baseBackgroundDrawable;
    private ImageView customIconView;
    private TextView customTextView;
    private View customView;
    private int defaultMaxLines;
    private ImageView iconView;
    private TabLayout$Tab tab;
    private TextView textView;
    final /* synthetic */ TabLayout this$0;

    public TabLayout$TabView(TabLayout tabLayout, Context object) {
        this.this$0 = tabLayout;
        super((Context)object);
        this.defaultMaxLines = 2;
        this.updateBackgroundDrawable((Context)object);
        int n3 = tabLayout.tabPaddingStart;
        int n4 = tabLayout.tabPaddingTop;
        int n7 = tabLayout.tabPaddingEnd;
        int n8 = tabLayout.tabPaddingBottom;
        this.setPaddingRelative(n3, n4, n7, n8);
        this.setGravity(17);
        int n10 = tabLayout.inlineLabel;
        n3 = 1;
        int n14 = n10 ^ n3;
        this.setOrientation(n14);
        this.setClickable(n3 != 0);
        tabLayout = this.getContext();
        n3 = Build.VERSION.SDK_INT;
        n4 = 24;
        if (n3 >= n4) {
            tabLayout = Vv2$a.a((Context)tabLayout);
            object = new Vv2((PointerIcon)tabLayout);
        } else {
            boolean bl2 = false;
            tabLayout = null;
            object = new Vv2(null);
        }
        ViewCompat.v((View)this, (Vv2)object);
    }

    public static /* synthetic */ BadgeDrawable access$1000(TabLayout$TabView tabLayout$TabView) {
        return tabLayout$TabView.getBadge();
    }

    public static /* synthetic */ void access$1400(TabLayout$TabView tabLayout$TabView, View view) {
        tabLayout$TabView.tryUpdateBadgeDrawableBounds(view);
    }

    public static /* synthetic */ void access$200(TabLayout$TabView tabLayout$TabView, Context context) {
        tabLayout$TabView.updateBackgroundDrawable(context);
    }

    public static /* synthetic */ void access$500(TabLayout$TabView tabLayout$TabView, Canvas canvas) {
        tabLayout$TabView.drawBackground(canvas);
    }

    public static /* synthetic */ boolean access$600(TabLayout$TabView tabLayout$TabView) {
        return tabLayout$TabView.hasBadgeDrawable();
    }

    public static /* synthetic */ BadgeDrawable access$700(TabLayout$TabView tabLayout$TabView) {
        return tabLayout$TabView.badgeDrawable;
    }

    public static /* synthetic */ BadgeDrawable access$800(TabLayout$TabView tabLayout$TabView) {
        return tabLayout$TabView.getOrCreateBadge();
    }

    public static /* synthetic */ void access$900(TabLayout$TabView tabLayout$TabView) {
        tabLayout$TabView.removeBadge();
    }

    private void addOnLayoutChangeListener(View view) {
        if (view == null) {
            return;
        }
        TabLayout$TabView$1 tabLayout$TabView$1 = new TabLayout$TabView$1(this, view);
        view.addOnLayoutChangeListener((View.OnLayoutChangeListener)tabLayout$TabView$1);
    }

    private float approximateLineWidth(Layout layout2, int n3, float f5) {
        float f6 = layout2.getLineWidth(n3);
        float f7 = layout2.getPaint().getTextSize();
        return f5 / f7 * f6;
    }

    private void clipViewToPaddingForBadge(boolean bl2) {
        this.setClipChildren(bl2);
        this.setClipToPadding(bl2);
        ViewGroup viewGroup = (ViewGroup)this.getParent();
        if (viewGroup != null) {
            viewGroup.setClipChildren(bl2);
            viewGroup.setClipToPadding(bl2);
        }
    }

    private FrameLayout createPreApi18BadgeAnchorRoot() {
        Context context = this.getContext();
        FrameLayout frameLayout = new FrameLayout(context);
        int n3 = -2;
        context = new FrameLayout.LayoutParams(n3, n3);
        frameLayout.setLayoutParams((ViewGroup.LayoutParams)context);
        return frameLayout;
    }

    private void drawBackground(Canvas canvas) {
        Drawable drawable2 = this.baseBackgroundDrawable;
        if (drawable2 != null) {
            int n3 = this.getLeft();
            int n4 = this.getTop();
            int n7 = this.getRight();
            int n8 = this.getBottom();
            drawable2.setBounds(n3, n4, n7, n8);
            drawable2 = this.baseBackgroundDrawable;
            drawable2.draw(canvas);
        }
    }

    private BadgeDrawable getBadge() {
        return this.badgeDrawable;
    }

    private FrameLayout getCustomParentForBadge(View view) {
        ImageView imageView = this.iconView;
        View view2 = null;
        if (view != imageView && view != (imageView = this.textView)) {
            return null;
        }
        boolean bl2 = BadgeUtils.USE_COMPAT_PARENT;
        if (bl2) {
            view2 = view = view.getParent();
            view2 = (FrameLayout)view;
        }
        return view2;
    }

    private BadgeDrawable getOrCreateBadge() {
        Object object = this.badgeDrawable;
        if (object == null) {
            object = BadgeDrawable.create(this.getContext());
            this.badgeDrawable = object;
        }
        this.tryUpdateBadgeAnchor();
        object = this.badgeDrawable;
        if (object != null) {
            return object;
        }
        object = new IllegalStateException("Unable to create badge");
        throw object;
    }

    private boolean hasBadgeDrawable() {
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

    private void inflateAndAddDefaultIconView() {
        TabLayout$TabView tabLayout$TabView;
        boolean bl2 = BadgeUtils.USE_COMPAT_PARENT;
        if (bl2) {
            tabLayout$TabView = this.createPreApi18BadgeAnchorRoot();
            this.addView((View)tabLayout$TabView, 0);
        } else {
            tabLayout$TabView = this;
        }
        LayoutInflater layoutInflater = LayoutInflater.from((Context)this.getContext());
        int n3 = R$layout.design_layout_tab_icon;
        layoutInflater = (ImageView)layoutInflater.inflate(n3, (ViewGroup)tabLayout$TabView, false);
        this.iconView = layoutInflater;
        tabLayout$TabView.addView((View)layoutInflater, 0);
    }

    private void inflateAndAddDefaultTextView() {
        TabLayout$TabView tabLayout$TabView;
        boolean bl2 = BadgeUtils.USE_COMPAT_PARENT;
        if (bl2) {
            tabLayout$TabView = this.createPreApi18BadgeAnchorRoot();
            this.addView((View)tabLayout$TabView);
        } else {
            tabLayout$TabView = this;
        }
        LayoutInflater layoutInflater = LayoutInflater.from((Context)this.getContext());
        int n3 = R$layout.design_layout_tab_text;
        layoutInflater = (TextView)layoutInflater.inflate(n3, (ViewGroup)tabLayout$TabView, false);
        this.textView = layoutInflater;
        tabLayout$TabView.addView((View)layoutInflater);
    }

    private void removeBadge() {
        View view = this.badgeAnchorView;
        if (view != null) {
            this.tryRemoveBadgeFromAnchor();
        }
        this.badgeDrawable = null;
    }

    private void tryAttachBadgeToAnchor(View view) {
        boolean bl2 = this.hasBadgeDrawable();
        if (!bl2) {
            return;
        }
        if (view != null) {
            bl2 = false;
            this.clipViewToPaddingForBadge(false);
            BadgeDrawable badgeDrawable = this.badgeDrawable;
            FrameLayout frameLayout = this.getCustomParentForBadge(view);
            BadgeUtils.attachBadgeDrawable(badgeDrawable, view, frameLayout);
            this.badgeAnchorView = view;
        }
    }

    private void tryRemoveBadgeFromAnchor() {
        boolean bl2 = this.hasBadgeDrawable();
        if (!bl2) {
            return;
        }
        bl2 = true;
        this.clipViewToPaddingForBadge(bl2);
        View view = this.badgeAnchorView;
        if (view != null) {
            BadgeDrawable badgeDrawable = this.badgeDrawable;
            BadgeUtils.detachBadgeDrawable(badgeDrawable, view);
            bl2 = false;
            view = null;
            this.badgeAnchorView = null;
        }
    }

    private void tryUpdateBadgeAnchor() {
        int n3 = this.hasBadgeDrawable();
        if (n3 == 0) {
            return;
        }
        Object object = this.customView;
        if (object != null) {
            this.tryRemoveBadgeFromAnchor();
        } else {
            object = this.iconView;
            if (object != null && (object = this.tab) != null && (object = ((TabLayout$Tab)object).getIcon()) != null) {
                object = this.badgeAnchorView;
                ImageView imageView = this.iconView;
                if (object != imageView) {
                    this.tryRemoveBadgeFromAnchor();
                    object = this.iconView;
                    this.tryAttachBadgeToAnchor((View)object);
                } else {
                    this.tryUpdateBadgeDrawableBounds((View)imageView);
                }
            } else {
                int n4;
                object = this.textView;
                if (object != null && (object = this.tab) != null && (n3 = ((TabLayout$Tab)object).getTabLabelVisibility()) == (n4 = 1)) {
                    object = this.badgeAnchorView;
                    TextView textView = this.textView;
                    if (object != textView) {
                        this.tryRemoveBadgeFromAnchor();
                        object = this.textView;
                        this.tryAttachBadgeToAnchor((View)object);
                    } else {
                        this.tryUpdateBadgeDrawableBounds((View)textView);
                    }
                } else {
                    this.tryRemoveBadgeFromAnchor();
                }
            }
        }
    }

    private void tryUpdateBadgeDrawableBounds(View view) {
        Object object;
        boolean bl2 = this.hasBadgeDrawable();
        if (bl2 && view == (object = this.badgeAnchorView)) {
            object = this.badgeDrawable;
            FrameLayout frameLayout = this.getCustomParentForBadge(view);
            BadgeUtils.setBadgeDrawableBounds((BadgeDrawable)object, view, frameLayout);
        }
    }

    private void updateBackgroundDrawable(Context context) {
        boolean bl2;
        Object object = this.this$0;
        int n3 = object.tabBackgroundResId;
        Object object2 = null;
        if (n3 != 0) {
            context = xn.a(context, n3);
            this.baseBackgroundDrawable = context;
            if (context != null && (bl2 = context.isStateful())) {
                context = this.baseBackgroundDrawable;
                object = this.getDrawableState();
                context.setState((int[])object);
            }
        } else {
            this.baseBackgroundDrawable = null;
        }
        context = new GradientDrawable();
        n3 = 0;
        context.setColor(0);
        object = this.this$0.tabRippleColorStateList;
        if (object != null) {
            object = new GradientDrawable();
            object.setCornerRadius(1.0E-5f);
            int n4 = -1;
            object.setColor(n4);
            ColorStateList colorStateList = RippleUtils.convertToRippleDrawableColor(this.this$0.tabRippleColorStateList);
            TabLayout tabLayout = this.this$0;
            boolean bl3 = tabLayout.unboundedRipple;
            if (bl3) {
                bl2 = false;
                context = null;
            }
            if (!bl3) {
                object2 = object;
            }
            RippleDrawable rippleDrawable = new RippleDrawable(colorStateList, (Drawable)context, (Drawable)object2);
            context = rippleDrawable;
        }
        object = ViewCompat.a;
        this.setBackground((Drawable)context);
        this.this$0.invalidate();
    }

    private void updateTextAndIcon(TextView object, ImageView imageView, boolean n3) {
        int n4;
        int n7;
        Object object2;
        boolean bl2;
        TabLayout$Tab tabLayout$Tab = this.tab;
        CharSequence charSequence = null;
        if (tabLayout$Tab != null && (tabLayout$Tab = tabLayout$Tab.getIcon()) != null) {
            tabLayout$Tab = ut0_0.h(this.tab.getIcon()).mutate();
        } else {
            bl2 = false;
            tabLayout$Tab = null;
        }
        if (tabLayout$Tab != null) {
            object2 = this.this$0.tabIconTint;
            tabLayout$Tab.setTintList((ColorStateList)object2);
            object2 = this.this$0.tabIconTintMode;
            if (object2 != null) {
                tabLayout$Tab.setTintMode((PorterDuff.Mode)object2);
            }
        }
        object2 = (object2 = this.tab) != null ? ((TabLayout$Tab)object2).getText() : null;
        int n8 = 8;
        if (imageView != null) {
            if (tabLayout$Tab != null) {
                imageView.setImageDrawable((Drawable)tabLayout$Tab);
                imageView.setVisibility(0);
                this.setVisibility(0);
            } else {
                imageView.setVisibility(n8);
                imageView.setImageDrawable(null);
            }
        }
        bl2 = TextUtils.isEmpty((CharSequence)object2);
        int n10 = 1;
        bl2 ^= n10;
        if (object != null) {
            Object object3;
            int n14;
            if (!bl2 || (n14 = TabLayout$Tab.access$1500((TabLayout$Tab)(object3 = this.tab))) != n10) {
                n10 = 0;
            }
            if (bl2) {
                object3 = object2;
            } else {
                n14 = 0;
                object3 = null;
            }
            object.setText((CharSequence)object3);
            if (n10 != 0) {
                n14 = 0;
                object3 = null;
            } else {
                n14 = 8;
            }
            object.setVisibility(n14);
            if (bl2) {
                this.setVisibility(0);
            }
        } else {
            n10 = 0;
        }
        if (n3 != 0 && imageView != null) {
            object = (ViewGroup.MarginLayoutParams)imageView.getLayoutParams();
            if (n10 != 0 && (n3 = imageView.getVisibility()) == 0) {
                Context context = this.getContext();
                float f5 = ViewUtils.dpToPx(context, n8);
                n3 = (int)f5;
            } else {
                n3 = 0;
                float f6 = 0.0f;
                Object var12_13 = null;
            }
            TabLayout tabLayout = this.this$0;
            n8 = (int)(tabLayout.inlineLabel ? 1 : 0);
            if (n8 != 0) {
                n8 = object.getMarginEnd();
                if (n3 != n8) {
                    object.setMarginEnd(n3);
                    object.bottomMargin = 0;
                    imageView.setLayoutParams((ViewGroup.LayoutParams)object);
                    imageView.requestLayout();
                }
            } else {
                n8 = object.bottomMargin;
                if (n3 != n8) {
                    object.bottomMargin = n3;
                    object.setMarginEnd(0);
                    imageView.setLayoutParams((ViewGroup.LayoutParams)object);
                    imageView.requestLayout();
                }
            }
        }
        if ((object = this.tab) != null) {
            charSequence = TabLayout$Tab.access$300((TabLayout$Tab)object);
        }
        if ((n7 = Build.VERSION.SDK_INT) > (n4 = 23)) {
            if (!bl2) {
                object2 = charSequence;
            }
            vo3_0.a((View)this, (CharSequence)object2);
        }
    }

    public void drawableStateChanged() {
        boolean bl2;
        boolean bl3;
        super.drawableStateChanged();
        Object object = this.getDrawableState();
        Drawable drawable2 = this.baseBackgroundDrawable;
        if (drawable2 != null && (bl3 = drawable2.isStateful())) {
            drawable2 = this.baseBackgroundDrawable;
            bl2 = drawable2.setState(object);
        } else {
            bl2 = false;
            object = null;
        }
        if (bl2) {
            this.invalidate();
            object = (Object)this.this$0;
            object.invalidate();
        }
    }

    public int getContentHeight() {
        TextView textView = this.textView;
        ImageView imageView = this.iconView;
        View view = this.customView;
        int n3 = 3;
        View[] viewArray = new View[n3];
        viewArray[0] = textView;
        int n4 = 1;
        viewArray[n4] = imageView;
        viewArray[2] = view;
        int n7 = 0;
        imageView = null;
        int n8 = 0;
        view = null;
        int n10 = 0;
        for (int i3 = 0; i3 < n3; i3 += n4) {
            int n14;
            View view2 = viewArray[i3];
            if (view2 == null || (n14 = view2.getVisibility()) != 0) continue;
            if (n10 != 0) {
                n14 = view2.getTop();
                n8 = Math.min(n8, n14);
            } else {
                n8 = view2.getTop();
            }
            if (n10 != 0) {
                n10 = view2.getBottom();
                n7 = Math.max(n7, n10);
            } else {
                n7 = view2.getBottom();
            }
            n10 = 1;
        }
        return n7 - n8;
    }

    public int getContentWidth() {
        TextView textView = this.textView;
        ImageView imageView = this.iconView;
        View view = this.customView;
        int n3 = 3;
        View[] viewArray = new View[n3];
        viewArray[0] = textView;
        int n4 = 1;
        viewArray[n4] = imageView;
        viewArray[2] = view;
        int n7 = 0;
        imageView = null;
        int n8 = 0;
        view = null;
        int n10 = 0;
        for (int i3 = 0; i3 < n3; i3 += n4) {
            int n14;
            View view2 = viewArray[i3];
            if (view2 == null || (n14 = view2.getVisibility()) != 0) continue;
            if (n10 != 0) {
                n14 = view2.getLeft();
                n8 = Math.min(n8, n14);
            } else {
                n8 = view2.getLeft();
            }
            if (n10 != 0) {
                n10 = view2.getRight();
                n7 = Math.max(n7, n10);
            } else {
                n7 = view2.getRight();
            }
            n10 = 1;
        }
        return n7 - n8;
    }

    public TabLayout$Tab getTab() {
        return this.tab;
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        boolean bl2;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        Object object = this.badgeDrawable;
        if (object != null && (bl2 = object.isVisible())) {
            object = this.badgeDrawable.getContentDescription();
            accessibilityNodeInfo.setContentDescription((CharSequence)object);
        }
        int n3 = this.tab.getPosition();
        boolean bl3 = this.isSelected();
        int n4 = 0;
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

    public void onMeasure(int n3, int n4) {
        block7: {
            Object object;
            float f5;
            TabLayout tabLayout;
            int n7;
            block8: {
                int n8 = View.MeasureSpec.getSize((int)n3);
                n7 = View.MeasureSpec.getMode((int)n3);
                tabLayout = this.this$0;
                int n10 = tabLayout.getTabMaxWidth();
                if (n10 > 0 && (n7 == 0 || n8 > n10)) {
                    TabLayout tabLayout2 = this.this$0;
                    n3 = tabLayout2.tabMaxWidth;
                    n8 = -1 << -1;
                    f5 = -0.0f;
                    n3 = View.MeasureSpec.makeMeasureSpec((int)n3, (int)n8);
                }
                super.onMeasure(n3, n4);
                object = this.textView;
                if (object == null) break block7;
                object = this.this$0;
                f5 = object.tabTextSize;
                n7 = this.defaultMaxLines;
                tabLayout = this.iconView;
                int n14 = 1;
                float f6 = Float.MIN_VALUE;
                if (tabLayout != null && (n10 = tabLayout.getVisibility()) == 0) {
                    n7 = 1;
                } else {
                    tabLayout = this.textView;
                    if (tabLayout != null && (n10 = tabLayout.getLineCount()) > n14) {
                        object = this.this$0;
                        f5 = object.tabTextMultiLineSize;
                    }
                }
                tabLayout = this.textView;
                float f7 = tabLayout.getTextSize();
                TextView textView = this.textView;
                int n15 = textView.getLineCount();
                Object object2 = this.textView;
                int n16 = object2.getMaxLines();
                n10 = (int)(f5 == f7 ? 0 : (f5 > f7 ? 1 : -1));
                if (n10 == 0 && (n16 < 0 || n7 == n16)) break block7;
                object2 = this.this$0;
                n16 = object2.mode;
                if (n16 != n14 || n10 <= 0 || n15 != n14) break block8;
                tabLayout = this.textView.getLayout();
                if (tabLayout == null) break block7;
                f7 = this.approximateLineWidth((Layout)tabLayout, 0, f5);
                n14 = this.getMeasuredWidth();
                n15 = this.getPaddingLeft();
                n14 -= n15;
                n15 = this.getPaddingRight();
                f6 = n14 -= n15;
                float f8 = f7 - f6;
                n10 = (int)(f8 == 0.0f ? 0 : (f8 > 0.0f ? 1 : -1));
                if (n10 > 0) break block7;
            }
            tabLayout = this.textView;
            tabLayout.setTextSize(0, f5);
            object = this.textView;
            object.setMaxLines(n7);
            super.onMeasure(n3, n4);
        }
    }

    public boolean performClick() {
        boolean bl2 = super.performClick();
        TabLayout$Tab tabLayout$Tab = this.tab;
        if (tabLayout$Tab != null) {
            TabLayout$Tab tabLayout$Tab2;
            if (!bl2) {
                bl2 = false;
                tabLayout$Tab2 = null;
                this.playSoundEffect(0);
            }
            tabLayout$Tab2 = this.tab;
            tabLayout$Tab2.select();
            bl2 = true;
        }
        return bl2;
    }

    public void reset() {
        this.setTab(null);
        this.setSelected(false);
    }

    public void setSelected(boolean bl2) {
        this.isSelected();
        super.setSelected(bl2);
        TextView textView = this.textView;
        if (textView != null) {
            textView.setSelected(bl2);
        }
        if ((textView = this.iconView) != null) {
            textView.setSelected(bl2);
        }
        if ((textView = this.customView) != null) {
            textView.setSelected(bl2);
        }
    }

    public void setTab(TabLayout$Tab tabLayout$Tab) {
        TabLayout$Tab tabLayout$Tab2 = this.tab;
        if (tabLayout$Tab != tabLayout$Tab2) {
            this.tab = tabLayout$Tab;
            this.update();
        }
    }

    public final void update() {
        boolean bl2;
        this.updateTab();
        TabLayout$Tab tabLayout$Tab = this.tab;
        if (tabLayout$Tab != null && (bl2 = tabLayout$Tab.isSelected())) {
            bl2 = true;
        } else {
            bl2 = false;
            tabLayout$Tab = null;
        }
        this.setSelected(bl2);
    }

    public final void updateOrientation() {
        ImageView imageView;
        int n3 = this.this$0.inlineLabel;
        int n4 = 1;
        int n7 = n3 ^ n4;
        this.setOrientation(n7);
        TextView textView = this.customTextView;
        if (textView == null && (imageView = this.customIconView) == null) {
            textView = this.textView;
            imageView = this.iconView;
            this.updateTextAndIcon(textView, imageView, n4 != 0);
        } else {
            ImageView imageView2 = this.customIconView;
            imageView = null;
            this.updateTextAndIcon(textView, imageView2, false);
        }
    }

    public final void updateTab() {
        ViewParent viewParent;
        int n3;
        Object object;
        Object object2 = this.tab;
        int n4 = 0;
        Object object3 = null;
        if (object2 != null) {
            object = ((TabLayout$Tab)object2).getCustomView();
        } else {
            n3 = 0;
            object = null;
        }
        if (object != null) {
            viewParent = object.getParent();
            if (viewParent != this) {
                if (viewParent != null) {
                    viewParent = (ViewGroup)viewParent;
                    viewParent.removeView(object);
                }
                if ((viewParent = this.customView) != null && (viewParent = viewParent.getParent()) != null) {
                    viewParent = (ViewGroup)viewParent;
                    View view = this.customView;
                    viewParent.removeView(view);
                }
                this.addView((View)object);
            }
            this.customView = object;
            viewParent = this.textView;
            int n7 = 8;
            if (viewParent != null) {
                viewParent.setVisibility(n7);
            }
            if ((viewParent = this.iconView) != null) {
                viewParent.setVisibility(n7);
                viewParent = this.iconView;
                viewParent.setImageDrawable(null);
            }
            n4 = 16908308;
            object3 = (TextView)object.findViewById(n4);
            this.customTextView = object3;
            if (object3 != null) {
                this.defaultMaxLines = n4 = object3.getMaxLines();
            }
            n4 = 16908294;
            object3 = (ImageView)object.findViewById(n4);
            this.customIconView = object3;
        } else {
            object = this.customView;
            if (object != null) {
                this.removeView((View)object);
                this.customView = null;
            }
            this.customTextView = null;
            this.customIconView = null;
        }
        object3 = this.customView;
        if (object3 == null) {
            object3 = this.iconView;
            if (object3 == null) {
                this.inflateAndAddDefaultIconView();
            }
            if ((object3 = this.textView) == null) {
                this.inflateAndAddDefaultTextView();
                object3 = this.textView;
                this.defaultMaxLines = n4 = object3.getMaxLines();
            }
            object3 = this.textView;
            object = this.this$0;
            n3 = TabLayout.access$1100((TabLayout)((Object)object));
            Hm3.f((TextView)object3, n3);
            n4 = (int)(this.isSelected() ? 1 : 0);
            if (n4 != 0 && (n4 = TabLayout.access$1200((TabLayout)((Object)(object3 = this.this$0)))) != (n3 = -1)) {
                object3 = this.textView;
                object = this.this$0;
                n3 = TabLayout.access$1200((TabLayout)((Object)object));
                Hm3.f((TextView)object3, n3);
            } else {
                object3 = this.textView;
                object = this.this$0;
                n3 = TabLayout.access$1300((TabLayout)((Object)object));
                Hm3.f((TextView)object3, n3);
            }
            object3 = this.this$0.tabTextColors;
            if (object3 != null) {
                object = this.textView;
                object.setTextColor((ColorStateList)object3);
            }
            object3 = this.textView;
            object = this.iconView;
            boolean bl2 = true;
            this.updateTextAndIcon((TextView)object3, (ImageView)object, bl2);
            this.tryUpdateBadgeAnchor();
            object3 = this.iconView;
            this.addOnLayoutChangeListener((View)object3);
            object3 = this.textView;
            this.addOnLayoutChangeListener((View)object3);
        } else {
            object3 = this.customTextView;
            if (object3 != null || (object = this.customIconView) != null) {
                object = this.customIconView;
                boolean bl3 = false;
                viewParent = null;
                this.updateTextAndIcon((TextView)object3, (ImageView)object, false);
            }
        }
        if (object2 != null && (n4 = (int)(TextUtils.isEmpty((CharSequence)(object3 = TabLayout$Tab.access$300((TabLayout$Tab)object2))) ? 1 : 0)) == 0) {
            object2 = TabLayout$Tab.access$300((TabLayout$Tab)object2);
            this.setContentDescription((CharSequence)object2);
        }
    }
}

