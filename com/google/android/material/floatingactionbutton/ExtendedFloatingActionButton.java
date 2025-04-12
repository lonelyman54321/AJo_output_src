/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.Animator$AnimatorListener
 *  android.content.Context
 *  android.content.res.ColorStateList
 *  android.content.res.TypedArray
 *  android.text.TextUtils
 *  android.util.AttributeSet
 *  android.util.Property
 *  android.view.ViewGroup$LayoutParams
 */
package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Property;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior;
import androidx.coordinatorlayout.widget.CoordinatorLayout$b;
import androidx.core.view.ViewCompat;
import com.google.android.material.R$attr;
import com.google.android.material.R$style;
import com.google.android.material.R$styleable;
import com.google.android.material.animation.MotionSpec;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.floatingactionbutton.AnimatorTracker;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$1;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$2;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$3;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$4;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$5;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$6;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$7;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$8;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$9;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$ChangeSizeStrategy;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$HideStrategy;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$OnChangedCallback;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$ShowStrategy;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$Size;
import com.google.android.material.floatingactionbutton.MotionStrategy;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.shape.CornerSize;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;
import java.util.Iterator;

public class ExtendedFloatingActionButton
extends MaterialButton
implements CoordinatorLayout$b {
    private static final int ANIM_STATE_HIDING = 1;
    private static final int ANIM_STATE_NONE = 0;
    private static final int ANIM_STATE_SHOWING = 2;
    private static final int DEF_STYLE_RES = 0;
    private static final int EXTEND = 3;
    private static final int EXTEND_STRATEGY_AUTO = 0;
    private static final int EXTEND_STRATEGY_MATCH_PARENT = 2;
    private static final int EXTEND_STRATEGY_WRAP_CONTENT = 1;
    static final Property HEIGHT;
    private static final int HIDE = 1;
    static final Property PADDING_END;
    static final Property PADDING_START;
    private static final int SHOW = 0;
    private static final int SHRINK = 2;
    static final Property WIDTH;
    private int animState;
    private boolean animateShowBeforeLayout;
    private final CoordinatorLayout$Behavior behavior;
    private final AnimatorTracker changeVisibilityTracker;
    private final int collapsedSize;
    private final MotionStrategy extendStrategy;
    private final int extendStrategyType;
    private int extendedPaddingEnd;
    private int extendedPaddingStart;
    private final MotionStrategy hideStrategy;
    private boolean isExtended;
    private boolean isTransforming;
    private int originalHeight;
    protected ColorStateList originalTextCsl;
    private int originalWidth;
    private final MotionStrategy showStrategy;
    private final MotionStrategy shrinkStrategy;

    static {
        Property property;
        DEF_STYLE_RES = R$style.Widget_MaterialComponents_ExtendedFloatingActionButton_Icon;
        Class<Float> clazz = Float.class;
        WIDTH = property = new ExtendedFloatingActionButton$6(clazz, "width");
        HEIGHT = property = new ExtendedFloatingActionButton$7(clazz, "height");
        PADDING_START = property = new ExtendedFloatingActionButton$8(clazz, "paddingStart");
        PADDING_END = property = new ExtendedFloatingActionButton$9(clazz, "paddingEnd");
    }

    public ExtendedFloatingActionButton(Context context) {
        this(context, null);
    }

    public ExtendedFloatingActionButton(Context context, AttributeSet attributeSet) {
        int n3 = R$attr.extendedFloatingActionButtonStyle;
        this(context, attributeSet, n3);
    }

    public ExtendedFloatingActionButton(Context context, AttributeSet attributeSet, int n3) {
        int n4;
        boolean bl2;
        int n7 = DEF_STYLE_RES;
        Object object = context;
        object = MaterialThemeOverlay.wrap(context, attributeSet, n3, n7);
        super((Context)object, attributeSet, n3);
        this.animState = 0;
        super();
        this.changeVisibilityTracker = object;
        ExtendedFloatingActionButton$ShowStrategy extendedFloatingActionButton$ShowStrategy = new ExtendedFloatingActionButton$ShowStrategy(this, (AnimatorTracker)object);
        this.showStrategy = extendedFloatingActionButton$ShowStrategy;
        ExtendedFloatingActionButton$HideStrategy extendedFloatingActionButton$HideStrategy = new ExtendedFloatingActionButton$HideStrategy(this, (AnimatorTracker)object);
        this.hideStrategy = extendedFloatingActionButton$HideStrategy;
        this.isExtended = bl2 = true;
        this.isTransforming = false;
        this.animateShowBeforeLayout = false;
        Context context2 = this.getContext();
        super(context2, attributeSet);
        this.behavior = object;
        Object object2 = R$styleable.ExtendedFloatingActionButton;
        Object object3 = new int[]{};
        object = context2;
        Object object4 = attributeSet;
        int n8 = n3;
        int n10 = n7;
        object = ThemeEnforcement.obtainStyledAttributes(context2, attributeSet, object2, n3, n7, object3);
        int n14 = R$styleable.ExtendedFloatingActionButton_showMotionSpec;
        object4 = MotionSpec.createFromAttribute(context2, (TypedArray)object, n14);
        int n15 = R$styleable.ExtendedFloatingActionButton_hideMotionSpec;
        object2 = MotionSpec.createFromAttribute(context2, (TypedArray)object, n15);
        n8 = R$styleable.ExtendedFloatingActionButton_extendMotionSpec;
        MotionSpec motionSpec = MotionSpec.createFromAttribute(context2, (TypedArray)object, n8);
        n10 = R$styleable.ExtendedFloatingActionButton_shrinkMotionSpec;
        MotionSpec motionSpec2 = MotionSpec.createFromAttribute(context2, (TypedArray)object, n10);
        int n16 = R$styleable.ExtendedFloatingActionButton_collapsedSize;
        this.collapsedSize = n16 = object.getDimensionPixelSize(n16, -1);
        n16 = R$styleable.ExtendedFloatingActionButton_extendStrategy;
        this.extendStrategyType = n16 = object.getInt(n16, (int)(bl2 ? 1 : 0));
        Object object5 = ViewCompat.a;
        this.extendedPaddingStart = n4 = this.getPaddingStart();
        this.extendedPaddingEnd = n4 = this.getPaddingEnd();
        object5 = new AnimatorTracker();
        object3 = this.getSizeFromExtendStrategyType(n16);
        ExtendedFloatingActionButton$ChangeSizeStrategy extendedFloatingActionButton$ChangeSizeStrategy = new ExtendedFloatingActionButton$ChangeSizeStrategy(this, (AnimatorTracker)object5, (ExtendedFloatingActionButton$Size)object3, bl2);
        this.extendStrategy = extendedFloatingActionButton$ChangeSizeStrategy;
        object3 = new ExtendedFloatingActionButton$ChangeSizeStrategy;
        ExtendedFloatingActionButton$1 extendedFloatingActionButton$1 = new ExtendedFloatingActionButton$1(this);
        super(this, (AnimatorTracker)object5, extendedFloatingActionButton$1, false);
        this.shrinkStrategy = object3;
        extendedFloatingActionButton$ShowStrategy.setMotionSpec((MotionSpec)object4);
        extendedFloatingActionButton$HideStrategy.setMotionSpec((MotionSpec)object2);
        extendedFloatingActionButton$ChangeSizeStrategy.setMotionSpec(motionSpec);
        object3.setMotionSpec(motionSpec2);
        object.recycle();
        object = ShapeAppearanceModel.PILL;
        object4 = attributeSet;
        object = ShapeAppearanceModel.builder(context2, attributeSet, n3, n7, (CornerSize)object).build();
        this.setShapeAppearanceModel((ShapeAppearanceModel)object);
        this.saveOriginalTextCsl();
    }

    public static /* synthetic */ int access$000(ExtendedFloatingActionButton extendedFloatingActionButton) {
        return extendedFloatingActionButton.extendedPaddingStart;
    }

    public static /* synthetic */ int access$100(ExtendedFloatingActionButton extendedFloatingActionButton) {
        return extendedFloatingActionButton.extendedPaddingEnd;
    }

    public static /* synthetic */ int access$200(ExtendedFloatingActionButton extendedFloatingActionButton) {
        return extendedFloatingActionButton.originalHeight;
    }

    public static /* synthetic */ int access$202(ExtendedFloatingActionButton extendedFloatingActionButton, int n3) {
        extendedFloatingActionButton.originalHeight = n3;
        return n3;
    }

    public static /* synthetic */ int access$300(ExtendedFloatingActionButton extendedFloatingActionButton) {
        return extendedFloatingActionButton.originalWidth;
    }

    public static /* synthetic */ int access$302(ExtendedFloatingActionButton extendedFloatingActionButton, int n3) {
        extendedFloatingActionButton.originalWidth = n3;
        return n3;
    }

    public static /* synthetic */ void access$400(ExtendedFloatingActionButton extendedFloatingActionButton, int n3, ExtendedFloatingActionButton$OnChangedCallback extendedFloatingActionButton$OnChangedCallback) {
        extendedFloatingActionButton.performMotion(n3, extendedFloatingActionButton$OnChangedCallback);
    }

    public static /* synthetic */ boolean access$500(ExtendedFloatingActionButton extendedFloatingActionButton) {
        return extendedFloatingActionButton.isExtended;
    }

    public static /* synthetic */ boolean access$502(ExtendedFloatingActionButton extendedFloatingActionButton, boolean bl2) {
        extendedFloatingActionButton.isExtended = bl2;
        return bl2;
    }

    public static /* synthetic */ boolean access$602(ExtendedFloatingActionButton extendedFloatingActionButton, boolean bl2) {
        extendedFloatingActionButton.isTransforming = bl2;
        return bl2;
    }

    public static /* synthetic */ int access$702(ExtendedFloatingActionButton extendedFloatingActionButton, int n3) {
        extendedFloatingActionButton.animState = n3;
        return n3;
    }

    public static /* synthetic */ boolean access$800(ExtendedFloatingActionButton extendedFloatingActionButton) {
        return extendedFloatingActionButton.isOrWillBeShown();
    }

    public static /* synthetic */ boolean access$900(ExtendedFloatingActionButton extendedFloatingActionButton) {
        return extendedFloatingActionButton.isOrWillBeHidden();
    }

    private ExtendedFloatingActionButton$Size getSizeFromExtendStrategyType(int n3) {
        ExtendedFloatingActionButton$2 extendedFloatingActionButton$2 = new ExtendedFloatingActionButton$2(this);
        ExtendedFloatingActionButton$3 extendedFloatingActionButton$3 = new ExtendedFloatingActionButton$3(this, extendedFloatingActionButton$2);
        ExtendedFloatingActionButton$4 extendedFloatingActionButton$4 = new ExtendedFloatingActionButton$4(this, extendedFloatingActionButton$3, extendedFloatingActionButton$2);
        int n4 = 1;
        if (n3 != n4) {
            int n7 = 2;
            if (n3 != n7) {
                return extendedFloatingActionButton$4;
            }
            return extendedFloatingActionButton$3;
        }
        return extendedFloatingActionButton$2;
    }

    private boolean isOrWillBeHidden() {
        int n3 = this.getVisibility();
        boolean bl2 = false;
        int n4 = 1;
        if (n3 == 0) {
            n3 = this.animState;
            if (n3 == n4) {
                bl2 = true;
            }
            return bl2;
        }
        n3 = this.animState;
        int n7 = 2;
        if (n3 != n7) {
            bl2 = true;
        }
        return bl2;
    }

    private boolean isOrWillBeShown() {
        int n3 = this.getVisibility();
        boolean bl2 = false;
        int n4 = 1;
        if (n3 != 0) {
            n3 = this.animState;
            int n7 = 2;
            if (n3 == n7) {
                bl2 = true;
            }
            return bl2;
        }
        n3 = this.animState;
        if (n3 != n4) {
            bl2 = true;
        }
        return bl2;
    }

    /*
     * Enabled aggressive block sorting
     */
    private void performMotion(int n3, ExtendedFloatingActionButton$OnChangedCallback iterator) {
        ViewGroup.LayoutParams layoutParams;
        MotionStrategy motionStrategy;
        int n4;
        block12: {
            block13: {
                n4 = 2;
                if (n3 == 0) break block13;
                int n7 = 1;
                if (n3 != n7) {
                    if (n3 != n4) {
                        n7 = 3;
                        if (n3 != n7) {
                            String string2 = hj0_0.a(n3, "Unknown strategy type: ");
                            iterator = new Iterator(string2);
                            throw iterator;
                        }
                        motionStrategy = this.extendStrategy;
                        break block12;
                    } else {
                        motionStrategy = this.shrinkStrategy;
                    }
                    break block12;
                } else {
                    motionStrategy = this.hideStrategy;
                }
                break block12;
            }
            motionStrategy = this.showStrategy;
        }
        boolean bl2 = motionStrategy.shouldCancel();
        if (bl2) {
            return;
        }
        bl2 = this.shouldAnimateVisibilityChange();
        if (!bl2) {
            motionStrategy.performNow();
            motionStrategy.onChange((ExtendedFloatingActionButton$OnChangedCallback)((Object)iterator));
            return;
        }
        if (n3 == n4) {
            layoutParams = this.getLayoutParams();
            if (layoutParams != null) {
                this.originalWidth = n4 = layoutParams.width;
                this.originalHeight = n3 = layoutParams.height;
            } else {
                this.originalWidth = n3 = this.getWidth();
                this.originalHeight = n3 = this.getHeight();
            }
        }
        n3 = 0;
        this.measure(0, 0);
        layoutParams = motionStrategy.createAnimator();
        ExtendedFloatingActionButton$5 extendedFloatingActionButton$5 = new ExtendedFloatingActionButton$5(this, motionStrategy, (ExtendedFloatingActionButton$OnChangedCallback)((Object)iterator));
        layoutParams.addListener((Animator.AnimatorListener)extendedFloatingActionButton$5);
        iterator = motionStrategy.getListeners().iterator();
        while (true) {
            if ((n4 = (int)(iterator.hasNext() ? 1 : 0)) == 0) {
                layoutParams.start();
                return;
            }
            extendedFloatingActionButton$5 = (Animator.AnimatorListener)iterator.next();
            layoutParams.addListener((Animator.AnimatorListener)extendedFloatingActionButton$5);
        }
    }

    private void saveOriginalTextCsl() {
        ColorStateList colorStateList;
        this.originalTextCsl = colorStateList = this.getTextColors();
    }

    private boolean shouldAnimateVisibilityChange() {
        boolean bl2 = this.isLaidOut();
        bl2 = (bl2 || !(bl2 = this.isOrWillBeShown()) && (bl2 = this.animateShowBeforeLayout)) && !(bl2 = this.isInEditMode());
        return bl2;
    }

    public void addOnExtendAnimationListener(Animator.AnimatorListener animatorListener) {
        this.extendStrategy.addAnimationListener(animatorListener);
    }

    public void addOnHideAnimationListener(Animator.AnimatorListener animatorListener) {
        this.hideStrategy.addAnimationListener(animatorListener);
    }

    public void addOnShowAnimationListener(Animator.AnimatorListener animatorListener) {
        this.showStrategy.addAnimationListener(animatorListener);
    }

    public void addOnShrinkAnimationListener(Animator.AnimatorListener animatorListener) {
        this.shrinkStrategy.addAnimationListener(animatorListener);
    }

    public void extend() {
        this.performMotion(3, null);
    }

    public void extend(ExtendedFloatingActionButton$OnChangedCallback extendedFloatingActionButton$OnChangedCallback) {
        this.performMotion(3, extendedFloatingActionButton$OnChangedCallback);
    }

    public CoordinatorLayout$Behavior getBehavior() {
        return this.behavior;
    }

    public int getCollapsedPadding() {
        int n3 = this.getCollapsedSize();
        int n4 = this.getIconSize();
        return (n3 - n4) / 2;
    }

    public int getCollapsedSize() {
        int n3 = this.collapsedSize;
        if (n3 < 0) {
            n3 = this.getPaddingStart();
            int n4 = this.getPaddingEnd();
            n3 = Math.min(n3, n4) * 2;
            n4 = this.getIconSize();
            n3 += n4;
        }
        return n3;
    }

    public MotionSpec getExtendMotionSpec() {
        return this.extendStrategy.getMotionSpec();
    }

    public MotionSpec getHideMotionSpec() {
        return this.hideStrategy.getMotionSpec();
    }

    public MotionSpec getShowMotionSpec() {
        return this.showStrategy.getMotionSpec();
    }

    public MotionSpec getShrinkMotionSpec() {
        return this.shrinkStrategy.getMotionSpec();
    }

    public void hide() {
        this.performMotion(1, null);
    }

    public void hide(ExtendedFloatingActionButton$OnChangedCallback extendedFloatingActionButton$OnChangedCallback) {
        this.performMotion(1, extendedFloatingActionButton$OnChangedCallback);
    }

    public final boolean isExtended() {
        return this.isExtended;
    }

    public void onAttachedToWindow() {
        Object object;
        super.onAttachedToWindow();
        boolean bl2 = this.isExtended;
        if (bl2 && (bl2 = TextUtils.isEmpty((CharSequence)(object = this.getText()))) && (object = this.getIcon()) != null) {
            bl2 = false;
            this.isExtended = false;
            object = this.shrinkStrategy;
            object.performNow();
        }
    }

    public void removeOnExtendAnimationListener(Animator.AnimatorListener animatorListener) {
        this.extendStrategy.removeAnimationListener(animatorListener);
    }

    public void removeOnHideAnimationListener(Animator.AnimatorListener animatorListener) {
        this.hideStrategy.removeAnimationListener(animatorListener);
    }

    public void removeOnShowAnimationListener(Animator.AnimatorListener animatorListener) {
        this.showStrategy.removeAnimationListener(animatorListener);
    }

    public void removeOnShrinkAnimationListener(Animator.AnimatorListener animatorListener) {
        this.shrinkStrategy.removeAnimationListener(animatorListener);
    }

    public void setAnimateShowBeforeLayout(boolean bl2) {
        this.animateShowBeforeLayout = bl2;
    }

    public void setExtendMotionSpec(MotionSpec motionSpec) {
        this.extendStrategy.setMotionSpec(motionSpec);
    }

    public void setExtendMotionSpecResource(int n3) {
        MotionSpec motionSpec = MotionSpec.createFromResource(this.getContext(), n3);
        this.setExtendMotionSpec(motionSpec);
    }

    public void setExtended(boolean bl2) {
        boolean bl3 = this.isExtended;
        if (bl3 == bl2) {
            return;
        }
        MotionStrategy motionStrategy = bl2 ? this.extendStrategy : this.shrinkStrategy;
        bl3 = motionStrategy.shouldCancel();
        if (bl3) {
            return;
        }
        motionStrategy.performNow();
    }

    public void setHideMotionSpec(MotionSpec motionSpec) {
        this.hideStrategy.setMotionSpec(motionSpec);
    }

    public void setHideMotionSpecResource(int n3) {
        MotionSpec motionSpec = MotionSpec.createFromResource(this.getContext(), n3);
        this.setHideMotionSpec(motionSpec);
    }

    public void setPadding(int n3, int n4, int n7, int n8) {
        super.setPadding(n3, n4, n7, n8);
        n3 = (int)(this.isExtended ? 1 : 0);
        if (n3 != 0 && (n3 = (int)(this.isTransforming ? 1 : 0)) == 0) {
            this.extendedPaddingStart = n3 = this.getPaddingStart();
            this.extendedPaddingEnd = n3 = this.getPaddingEnd();
        }
    }

    public void setPaddingRelative(int n3, int n4, int n7, int n8) {
        super.setPaddingRelative(n3, n4, n7, n8);
        n4 = (int)(this.isExtended ? 1 : 0);
        if (n4 != 0 && (n4 = (int)(this.isTransforming ? 1 : 0)) == 0) {
            this.extendedPaddingStart = n3;
            this.extendedPaddingEnd = n7;
        }
    }

    public void setShowMotionSpec(MotionSpec motionSpec) {
        this.showStrategy.setMotionSpec(motionSpec);
    }

    public void setShowMotionSpecResource(int n3) {
        MotionSpec motionSpec = MotionSpec.createFromResource(this.getContext(), n3);
        this.setShowMotionSpec(motionSpec);
    }

    public void setShrinkMotionSpec(MotionSpec motionSpec) {
        this.shrinkStrategy.setMotionSpec(motionSpec);
    }

    public void setShrinkMotionSpecResource(int n3) {
        MotionSpec motionSpec = MotionSpec.createFromResource(this.getContext(), n3);
        this.setShrinkMotionSpec(motionSpec);
    }

    public void setTextColor(int n3) {
        super.setTextColor(n3);
        this.saveOriginalTextCsl();
    }

    public void setTextColor(ColorStateList colorStateList) {
        super.setTextColor(colorStateList);
        this.saveOriginalTextCsl();
    }

    public void show() {
        this.performMotion(0, null);
    }

    public void show(ExtendedFloatingActionButton$OnChangedCallback extendedFloatingActionButton$OnChangedCallback) {
        this.performMotion(0, extendedFloatingActionButton$OnChangedCallback);
    }

    public void shrink() {
        this.performMotion(2, null);
    }

    public void shrink(ExtendedFloatingActionButton$OnChangedCallback extendedFloatingActionButton$OnChangedCallback) {
        this.performMotion(2, extendedFloatingActionButton$OnChangedCallback);
    }

    public void silentlyUpdateTextColor(ColorStateList colorStateList) {
        super.setTextColor(colorStateList);
    }
}

