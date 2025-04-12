/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.ColorStateList
 *  android.content.res.TypedArray
 *  android.graphics.PorterDuff$Mode
 *  android.graphics.Rect
 *  android.graphics.RectF
 *  android.graphics.drawable.Drawable
 *  android.graphics.drawable.Drawable$Callback
 *  android.graphics.drawable.InsetDrawable
 *  android.graphics.drawable.RippleDrawable
 *  android.os.Build$VERSION
 *  android.text.TextPaint
 *  android.text.TextUtils
 *  android.text.TextUtils$TruncateAt
 *  android.util.AttributeSet
 *  android.util.DisplayMetrics
 *  android.util.TypedValue
 *  android.view.KeyEvent
 *  android.view.MotionEvent
 *  android.view.PointerIcon
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.accessibility.AccessibilityNodeInfo
 *  android.view.accessibility.AccessibilityNodeInfo$CollectionItemInfo
 *  android.widget.CompoundButton
 *  android.widget.CompoundButton$OnCheckedChangeListener
 *  android.widget.TextView$BufferType
 */
package com.google.android.material.chip;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.core.view.ViewCompat;
import androidx.core.view.ViewCompat$c;
import androidx.core.view.a;
import com.google.android.material.R$attr;
import com.google.android.material.R$style;
import com.google.android.material.R$styleable;
import com.google.android.material.animation.MotionSpec;
import com.google.android.material.chip.Chip$1;
import com.google.android.material.chip.Chip$2;
import com.google.android.material.chip.Chip$ChipTouchHelper;
import com.google.android.material.chip.ChipDrawable;
import com.google.android.material.chip.ChipDrawable$Delegate;
import com.google.android.material.chip.ChipGroup;
import com.google.android.material.internal.FlowLayout;
import com.google.android.material.internal.MaterialCheckable;
import com.google.android.material.internal.MaterialCheckable$OnCheckedChangeListener;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.resources.TextAppearance;
import com.google.android.material.resources.TextAppearanceFontCallback;
import com.google.android.material.ripple.RippleUtils;
import com.google.android.material.shape.MaterialShapeUtils;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.shape.Shapeable;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;

public class Chip
extends AppCompatCheckBox
implements ChipDrawable$Delegate,
Shapeable,
MaterialCheckable {
    private static final String BUTTON_ACCESSIBILITY_CLASS_NAME = "android.widget.Button";
    private static final int[] CHECKABLE_STATE_SET;
    private static final int CHIP_BODY_VIRTUAL_ID = 0;
    private static final int CLOSE_ICON_VIRTUAL_ID = 1;
    private static final int DEF_STYLE_RES = 0;
    private static final Rect EMPTY_BOUNDS;
    private static final String GENERIC_VIEW_ACCESSIBILITY_CLASS_NAME = "android.view.View";
    private static final int MIN_TOUCH_TARGET_DP = 48;
    private static final String NAMESPACE_ANDROID = "http://schemas.android.com/apk/res/android";
    private static final String RADIO_BUTTON_ACCESSIBILITY_CLASS_NAME = "android.widget.RadioButton";
    private static final int[] SELECTED_STATE;
    private static final String TAG = "Chip";
    private CharSequence accessibilityClassName;
    private ChipDrawable chipDrawable;
    private boolean closeIconFocused;
    private boolean closeIconHovered;
    private boolean closeIconPressed;
    private boolean deferredCheckedValue;
    private boolean ensureMinTouchTargetSize;
    private final TextAppearanceFontCallback fontCallback;
    private InsetDrawable insetBackgroundDrawable;
    private int lastLayoutDirection;
    private int minTouchTargetSize;
    private CompoundButton.OnCheckedChangeListener onCheckedChangeListener;
    private MaterialCheckable$OnCheckedChangeListener onCheckedChangeListenerInternal;
    private View.OnClickListener onCloseIconClickListener;
    private final Rect rect;
    private final RectF rectF;
    private RippleDrawable ripple;
    private final Chip$ChipTouchHelper touchHelper;
    private boolean touchHelperEnabled;

    static {
        Rect rect;
        DEF_STYLE_RES = R$style.Widget_MaterialComponents_Chip_Action;
        EMPTY_BOUNDS = rect = new Rect();
        SELECTED_STATE = new int[]{0x10100A1};
        CHECKABLE_STATE_SET = new int[]{16842911};
    }

    public Chip(Context context) {
        this(context, null);
    }

    public Chip(Context context, AttributeSet attributeSet) {
        int n3 = R$attr.chipStyle;
        this(context, attributeSet, n3);
    }

    public Chip(Context object, AttributeSet object2, int n3) {
        int n4;
        int n42 = DEF_STYLE_RES;
        object = MaterialThemeOverlay.wrap((Context)object, (AttributeSet)object2, n3, n42);
        super((Context)object, (AttributeSet)object2, n3);
        object = new Rect();
        this.rect = object;
        object = new RectF();
        this.rectF = object;
        this.fontCallback = object = new Chip$1(this);
        object = this.getContext();
        this.validateAttributes((AttributeSet)object2);
        ChipDrawable chipDrawable = ChipDrawable.createFromAttributes((Context)object, (AttributeSet)object2, n3, n42);
        this.initMinTouchTarget((Context)object, (AttributeSet)object2, n3);
        this.setChipDrawable(chipDrawable);
        float f5 = ViewCompat$c.e((View)this);
        chipDrawable.setElevation(f5);
        int[] nArray = R$styleable.Chip;
        int[] nArray2 = new int[]{};
        object2 = ThemeEnforcement.obtainStyledAttributes((Context)object, (AttributeSet)object2, nArray, n3, n42, nArray2);
        n3 = Build.VERSION.SDK_INT;
        int n7 = 23;
        f5 = 3.2E-44f;
        if (n3 < n7) {
            n3 = R$styleable.Chip_android_textColor;
            object = MaterialResources.getColorStateList((Context)object, (TypedArray)object2, n3);
            this.setTextColor((ColorStateList)object);
        }
        int n8 = R$styleable.Chip_shapeAppearance;
        boolean bl2 = object2.hasValue(n8);
        object2.recycle();
        this.touchHelper = object2 = new Chip$ChipTouchHelper(this, this);
        this.updateAccessibilityDelegate();
        if (!bl2) {
            this.initOutlineProvider();
        }
        boolean bl3 = this.deferredCheckedValue;
        this.setChecked(bl3);
        object = chipDrawable.getText();
        this.setText((CharSequence)object);
        object = chipDrawable.getEllipsize();
        this.setEllipsize((TextUtils.TruncateAt)object);
        this.updateTextPaintDrawState();
        object = this.chipDrawable;
        boolean bl4 = ((ChipDrawable)object).shouldDrawText();
        if (!bl4) {
            boolean bl5 = true;
            this.setLines((int)(bl5 ? 1 : 0));
            this.setHorizontallyScrolling(bl5);
        }
        this.setGravity(8388627);
        this.updatePaddingInternal();
        boolean bl6 = this.shouldEnsureMinTouchTargetSize();
        if (bl6) {
            int n10 = this.minTouchTargetSize;
            this.setMinHeight(n10);
        }
        this.lastLayoutDirection = n4 = this.getLayoutDirection();
        object = new ou_0(this);
        super.setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener)object);
    }

    public static /* synthetic */ void a(Chip chip, CompoundButton compoundButton, boolean bl2) {
        chip.lambda$new$0(compoundButton, bl2);
    }

    public static /* synthetic */ ChipDrawable access$000(Chip chip) {
        return chip.chipDrawable;
    }

    public static /* synthetic */ boolean access$100(Chip chip) {
        return chip.hasCloseIcon();
    }

    public static /* synthetic */ RectF access$200(Chip chip) {
        return chip.getCloseIconTouchBounds();
    }

    public static /* synthetic */ View.OnClickListener access$300(Chip chip) {
        return chip.onCloseIconClickListener;
    }

    public static /* synthetic */ boolean access$402(Chip chip, boolean bl2) {
        chip.closeIconFocused = bl2;
        return bl2;
    }

    public static /* synthetic */ Rect access$500(Chip chip) {
        return chip.getCloseIconTouchBoundsInt();
    }

    public static /* synthetic */ Rect access$600() {
        return EMPTY_BOUNDS;
    }

    private void applyChipDrawable(ChipDrawable chipDrawable) {
        chipDrawable.setDelegate(this);
    }

    private int[] createCloseIconDrawableState() {
        int n3;
        int n4;
        int n7;
        int n8;
        int n32 = this.isEnabled();
        int n10 = this.closeIconFocused;
        if (n10 != 0) {
            n8 = n32 + 1;
        }
        if ((n10 = this.closeIconHovered) != 0) {
            n7 = n8 + 1;
        }
        if ((n10 = this.closeIconPressed) != 0) {
            n4 = n7 + 1;
        }
        if ((n10 = this.isChecked()) != 0) {
            n3 = n4 + 1;
        }
        int[] nArray = new int[n3];
        n10 = this.isEnabled();
        int n14 = 0;
        if (n10 != 0) {
            nArray[0] = n10 = 16842910;
            n14 = 1;
        }
        if ((n10 = (int)(this.closeIconFocused ? 1 : 0)) != 0) {
            nArray[n14] = n10 = 16842908;
            ++n14;
        }
        if ((n10 = (int)(this.closeIconHovered ? 1 : 0)) != 0) {
            nArray[n14] = n10 = 16843623;
            ++n14;
        }
        if ((n10 = (int)(this.closeIconPressed ? 1 : 0)) != 0) {
            nArray[n14] = n10 = 16842919;
            ++n14;
        }
        if ((n10 = (int)(this.isChecked() ? 1 : 0)) != 0) {
            nArray[n14] = n10 = 0x10100A1;
        }
        return nArray;
    }

    private void ensureChipDrawableHasCallback() {
        InsetDrawable insetDrawable;
        Drawable drawable2 = this.getBackgroundDrawable();
        if (drawable2 == (insetDrawable = this.insetBackgroundDrawable) && (drawable2 = this.chipDrawable.getCallback()) == null) {
            drawable2 = this.chipDrawable;
            insetDrawable = this.insetBackgroundDrawable;
            drawable2.setCallback((Drawable.Callback)insetDrawable);
        }
    }

    private RectF getCloseIconTouchBounds() {
        Object object = this.rectF;
        object.setEmpty();
        boolean bl2 = this.hasCloseIcon();
        if (bl2 && (object = this.onCloseIconClickListener) != null) {
            object = this.chipDrawable;
            RectF rectF = this.rectF;
            ((ChipDrawable)object).getCloseIconTouchBounds(rectF);
        }
        return this.rectF;
    }

    private Rect getCloseIconTouchBoundsInt() {
        RectF rectF = this.getCloseIconTouchBounds();
        Rect rect = this.rect;
        int n3 = (int)rectF.left;
        int n4 = (int)rectF.top;
        int n7 = (int)rectF.right;
        int n8 = (int)rectF.bottom;
        rect.set(n3, n4, n7, n8);
        return this.rect;
    }

    private TextAppearance getTextAppearance() {
        Object object = this.chipDrawable;
        object = object != null ? ((ChipDrawable)object).getTextAppearance() : null;
        return object;
    }

    private boolean hasCloseIcon() {
        boolean bl2;
        ChipDrawable chipDrawable = this.chipDrawable;
        if (chipDrawable != null && (chipDrawable = chipDrawable.getCloseIcon()) != null) {
            bl2 = true;
        } else {
            bl2 = false;
            chipDrawable = null;
        }
        return bl2;
    }

    private void initMinTouchTarget(Context context, AttributeSet attributeSet, int n3) {
        int[] nArray = R$styleable.Chip;
        int n4 = DEF_STYLE_RES;
        int[] nArray2 = new int[]{};
        context = ThemeEnforcement.obtainStyledAttributes(context, attributeSet, nArray, n3, n4, nArray2);
        int n7 = R$styleable.Chip_ensureMinTouchTargetSize;
        n7 = (int)(context.getBoolean(n7, false) ? 1 : 0);
        this.ensureMinTouchTargetSize = n7;
        float f5 = (float)Math.ceil(ViewUtils.dpToPx(this.getContext(), 48));
        n3 = R$styleable.Chip_chipMinTouchTargetSize;
        this.minTouchTargetSize = n7 = (int)Math.ceil(context.getDimension(n3, f5));
        context.recycle();
    }

    private void initOutlineProvider() {
        Chip$2 chip$2 = new Chip$2(this);
        this.setOutlineProvider(chip$2);
    }

    private void insetChipBackgroundDrawable(int n3, int n4, int n7, int n8) {
        InsetDrawable insetDrawable;
        ChipDrawable chipDrawable = this.chipDrawable;
        this.insetBackgroundDrawable = insetDrawable = new InsetDrawable((Drawable)chipDrawable, n3, n4, n7, n8);
    }

    private /* synthetic */ void lambda$new$0(CompoundButton compoundButton, boolean bl2) {
        MaterialCheckable$OnCheckedChangeListener materialCheckable$OnCheckedChangeListener = this.onCheckedChangeListenerInternal;
        if (materialCheckable$OnCheckedChangeListener != null) {
            materialCheckable$OnCheckedChangeListener.onCheckedChanged(this, bl2);
        }
        if ((materialCheckable$OnCheckedChangeListener = this.onCheckedChangeListener) != null) {
            materialCheckable$OnCheckedChangeListener.onCheckedChanged(compoundButton, bl2);
        }
    }

    private void removeBackgroundInset() {
        InsetDrawable insetDrawable = this.insetBackgroundDrawable;
        if (insetDrawable != null) {
            this.insetBackgroundDrawable = null;
            insetDrawable = null;
            this.setMinWidth(0);
            float f5 = this.getChipMinHeight();
            int n3 = (int)f5;
            this.setMinHeight(n3);
            this.updateBackgroundDrawable();
        }
    }

    private void setCloseIconHovered(boolean bl2) {
        boolean bl3 = this.closeIconHovered;
        if (bl3 != bl2) {
            this.closeIconHovered = bl2;
            this.refreshDrawableState();
        }
    }

    private void setCloseIconPressed(boolean bl2) {
        boolean bl3 = this.closeIconPressed;
        if (bl3 != bl2) {
            this.closeIconPressed = bl2;
            this.refreshDrawableState();
        }
    }

    private void unapplyChipDrawable(ChipDrawable chipDrawable) {
        if (chipDrawable != null) {
            chipDrawable.setDelegate(null);
        }
    }

    private void updateAccessibilityDelegate() {
        Object object;
        boolean bl2 = this.hasCloseIcon();
        if (bl2 && (bl2 = this.isCloseIconVisible()) && (object = this.onCloseIconClickListener) != null) {
            object = this.touchHelper;
            ViewCompat.s((View)this, (a)object);
            this.touchHelperEnabled = bl2 = true;
        } else {
            ViewCompat.s((View)this, null);
            bl2 = false;
            object = null;
            this.touchHelperEnabled = false;
        }
    }

    private void updateBackgroundDrawable() {
        boolean bl2 = RippleUtils.USE_FRAMEWORK_RIPPLE;
        if (bl2) {
            this.updateFrameworkRippleBackground();
        } else {
            ChipDrawable chipDrawable = this.chipDrawable;
            boolean bl3 = true;
            chipDrawable.setUseCompatRipple(bl3);
            chipDrawable = this.getBackgroundDrawable();
            this.setBackground(chipDrawable);
            this.updatePaddingInternal();
            this.ensureChipDrawableHasCallback();
        }
    }

    private void updateFrameworkRippleBackground() {
        RippleDrawable rippleDrawable;
        Object object = RippleUtils.sanitizeRippleDrawableColor(this.chipDrawable.getRippleColor());
        Drawable drawable2 = this.getBackgroundDrawable();
        this.ripple = rippleDrawable = new RippleDrawable(object, drawable2, null);
        this.chipDrawable.setUseCompatRipple(false);
        rippleDrawable = this.ripple;
        object = ViewCompat.a;
        this.setBackground((Drawable)rippleDrawable);
        this.updatePaddingInternal();
    }

    private void updatePaddingInternal() {
        Object object = this.getText();
        int n3 = TextUtils.isEmpty((CharSequence)object);
        if (n3 == 0 && (object = this.chipDrawable) != null) {
            int n4;
            int n7;
            float f5 = ((ChipDrawable)object).getChipEndPadding();
            float f6 = this.chipDrawable.getTextEndPadding() + f5;
            object = this.chipDrawable;
            f5 = ((ChipDrawable)object).calculateCloseIconWidth() + f6;
            n3 = (int)f5;
            f6 = this.chipDrawable.getChipStartPadding();
            float f7 = this.chipDrawable.getTextStartPadding() + f6;
            ChipDrawable chipDrawable = this.chipDrawable;
            f6 = chipDrawable.calculateChipIconWidth() + f7;
            int n8 = (int)f6;
            InsetDrawable insetDrawable = this.insetBackgroundDrawable;
            if (insetDrawable != null) {
                insetDrawable = new Rect();
                InsetDrawable insetDrawable2 = this.insetBackgroundDrawable;
                insetDrawable2.getPadding((Rect)insetDrawable);
                n7 = insetDrawable.left;
                n8 += n7;
                n4 = insetDrawable.right;
                n3 += n4;
            }
            n4 = this.getPaddingTop();
            n7 = this.getPaddingBottom();
            this.setPaddingRelative(n8, n4, n3, n7);
        }
    }

    private void updateTextPaintDrawState() {
        TextPaint textPaint = this.getPaint();
        Object object = this.chipDrawable;
        if (object != null) {
            object = object.getState();
            textPaint.drawableState = (int[])object;
        }
        if ((object = this.getTextAppearance()) != null) {
            Context context = this.getContext();
            TextAppearanceFontCallback textAppearanceFontCallback = this.fontCallback;
            ((TextAppearance)object).updateDrawState(context, textPaint, textAppearanceFontCallback);
        }
    }

    private void validateAttributes(AttributeSet object) {
        if (object == null) {
            return;
        }
        String string2 = NAMESPACE_ANDROID;
        object.getAttributeValue(string2, "background");
        String string3 = object.getAttributeValue(string2, "drawableLeft");
        if (string3 == null) {
            string3 = object.getAttributeValue(string2, "drawableStart");
            if (string3 == null) {
                string3 = object.getAttributeValue(string2, "drawableEnd");
                String string4 = "Please set end drawable using R.attr#closeIcon.";
                if (string3 == null) {
                    string3 = object.getAttributeValue(string2, "drawableRight");
                    if (string3 == null) {
                        string3 = "singleLine";
                        int n3 = 1;
                        int n4 = object.getAttributeBooleanValue(string2, string3, n3 != 0);
                        if (n4 != 0 && (n4 = object.getAttributeIntValue(string2, string3 = "lines", n3)) == n3 && (n4 = object.getAttributeIntValue(string2, string3 = "minLines", n3)) == n3 && (n4 = object.getAttributeIntValue(string2, string3 = "maxLines", n3)) == n3) {
                            object.getAttributeIntValue(string2, "gravity", 8388627);
                            return;
                        }
                        object = new UnsupportedOperationException("Chip does not support multi-line text");
                        throw object;
                    }
                    object = new UnsupportedOperationException(string4);
                    throw object;
                }
                object = new UnsupportedOperationException(string4);
                throw object;
            }
            object = new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
            throw object;
        }
        object = new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
        throw object;
    }

    public boolean dispatchHoverEvent(MotionEvent motionEvent) {
        boolean bl2;
        boolean bl3 = this.touchHelperEnabled;
        if (!bl3) {
            return super.dispatchHoverEvent(motionEvent);
        }
        Chip$ChipTouchHelper chip$ChipTouchHelper = this.touchHelper;
        bl3 = chip$ChipTouchHelper.dispatchHoverEvent(motionEvent);
        if (!bl3 && !(bl2 = super.dispatchHoverEvent(motionEvent))) {
            bl2 = false;
            motionEvent = null;
        } else {
            bl2 = true;
        }
        return bl2;
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int n3;
        int n4 = this.touchHelperEnabled;
        if (n4 == 0) {
            return super.dispatchKeyEvent(keyEvent);
        }
        Chip$ChipTouchHelper chip$ChipTouchHelper = this.touchHelper;
        n4 = chip$ChipTouchHelper.dispatchKeyEvent(keyEvent);
        if (n4 != 0 && (n4 = (chip$ChipTouchHelper = this.touchHelper).getKeyboardFocusedVirtualViewId()) != (n3 = -1 << -1)) {
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    public void drawableStateChanged() {
        boolean bl2;
        super.drawableStateChanged();
        ChipDrawable chipDrawable = this.chipDrawable;
        if (chipDrawable != null && (bl2 = chipDrawable.isCloseIconStateful())) {
            chipDrawable = this.chipDrawable;
            int[] nArray = this.createCloseIconDrawableState();
            bl2 = chipDrawable.setCloseIconState(nArray);
        } else {
            bl2 = false;
            chipDrawable = null;
        }
        if (bl2) {
            this.invalidate();
        }
    }

    public boolean ensureAccessibleTouchTarget(int n3) {
        this.minTouchTargetSize = n3;
        int n4 = this.shouldEnsureMinTouchTargetSize();
        int n7 = 0;
        if (n4 == 0) {
            InsetDrawable insetDrawable = this.insetBackgroundDrawable;
            if (insetDrawable != null) {
                this.removeBackgroundInset();
            } else {
                this.updateBackgroundDrawable();
            }
            return false;
        }
        ChipDrawable chipDrawable = this.chipDrawable;
        n4 = chipDrawable.getIntrinsicHeight();
        n4 = n3 - n4;
        n4 = Math.max(0, n4);
        ChipDrawable chipDrawable2 = this.chipDrawable;
        int n8 = chipDrawable2.getIntrinsicWidth();
        n8 = n3 - n8;
        if ((n8 = Math.max(0, n8)) <= 0 && n4 <= 0) {
            InsetDrawable insetDrawable = this.insetBackgroundDrawable;
            if (insetDrawable != null) {
                this.removeBackgroundInset();
            } else {
                this.updateBackgroundDrawable();
            }
            return false;
        }
        if (n8 > 0) {
            n8 /= 2;
        } else {
            n8 = 0;
            chipDrawable2 = null;
        }
        if (n4 > 0) {
            n7 = n4 / 2;
        }
        chipDrawable = this.insetBackgroundDrawable;
        boolean bl2 = true;
        if (chipDrawable != null) {
            chipDrawable = new Rect();
            InsetDrawable insetDrawable = this.insetBackgroundDrawable;
            insetDrawable.getPadding((Rect)chipDrawable);
            int n10 = ((Rect)chipDrawable).top;
            if (n10 == n7 && (n10 = ((Rect)chipDrawable).bottom) == n7 && (n10 = ((Rect)chipDrawable).left) == n8 && (n4 = ((Rect)chipDrawable).right) == n8) {
                this.updateBackgroundDrawable();
                return bl2;
            }
        }
        if ((n4 = this.getMinHeight()) != n3) {
            this.setMinHeight(n3);
        }
        if ((n4 = this.getMinWidth()) != n3) {
            this.setMinWidth(n3);
        }
        this.insetChipBackgroundDrawable(n8, n7, n8, n7);
        this.updateBackgroundDrawable();
        return bl2;
    }

    public CharSequence getAccessibilityClassName() {
        Object object = this.accessibilityClassName;
        boolean bl2 = TextUtils.isEmpty((CharSequence)object);
        if (!bl2) {
            return this.accessibilityClassName;
        }
        bl2 = this.isCheckable();
        String string2 = BUTTON_ACCESSIBILITY_CLASS_NAME;
        if (bl2) {
            object = this.getParent();
            boolean bl3 = object instanceof ChipGroup;
            if (bl3 && (bl2 = ((ChipGroup)((Object)(object = (ChipGroup)((Object)object)))).isSingleSelection())) {
                return RADIO_BUTTON_ACCESSIBILITY_CLASS_NAME;
            }
            return string2;
        }
        bl2 = this.isClickable();
        if (bl2) {
            return string2;
        }
        return GENERIC_VIEW_ACCESSIBILITY_CLASS_NAME;
    }

    public Drawable getBackgroundDrawable() {
        Object object = this.insetBackgroundDrawable;
        if (object == null) {
            object = this.chipDrawable;
        }
        return object;
    }

    public Drawable getCheckedIcon() {
        ChipDrawable chipDrawable = this.chipDrawable;
        chipDrawable = chipDrawable != null ? chipDrawable.getCheckedIcon() : null;
        return chipDrawable;
    }

    public ColorStateList getCheckedIconTint() {
        ChipDrawable chipDrawable = this.chipDrawable;
        chipDrawable = chipDrawable != null ? chipDrawable.getCheckedIconTint() : null;
        return chipDrawable;
    }

    public ColorStateList getChipBackgroundColor() {
        ChipDrawable chipDrawable = this.chipDrawable;
        chipDrawable = chipDrawable != null ? chipDrawable.getChipBackgroundColor() : null;
        return chipDrawable;
    }

    public float getChipCornerRadius() {
        ChipDrawable chipDrawable = this.chipDrawable;
        float f5 = 0.0f;
        if (chipDrawable != null) {
            float f6 = chipDrawable.getChipCornerRadius();
            f5 = Math.max(0.0f, f6);
        }
        return f5;
    }

    public Drawable getChipDrawable() {
        return this.chipDrawable;
    }

    public float getChipEndPadding() {
        float f5;
        ChipDrawable chipDrawable = this.chipDrawable;
        if (chipDrawable != null) {
            f5 = chipDrawable.getChipEndPadding();
        } else {
            f5 = 0.0f;
            chipDrawable = null;
        }
        return f5;
    }

    public Drawable getChipIcon() {
        ChipDrawable chipDrawable = this.chipDrawable;
        chipDrawable = chipDrawable != null ? chipDrawable.getChipIcon() : null;
        return chipDrawable;
    }

    public float getChipIconSize() {
        float f5;
        ChipDrawable chipDrawable = this.chipDrawable;
        if (chipDrawable != null) {
            f5 = chipDrawable.getChipIconSize();
        } else {
            f5 = 0.0f;
            chipDrawable = null;
        }
        return f5;
    }

    public ColorStateList getChipIconTint() {
        ChipDrawable chipDrawable = this.chipDrawable;
        chipDrawable = chipDrawable != null ? chipDrawable.getChipIconTint() : null;
        return chipDrawable;
    }

    public float getChipMinHeight() {
        float f5;
        ChipDrawable chipDrawable = this.chipDrawable;
        if (chipDrawable != null) {
            f5 = chipDrawable.getChipMinHeight();
        } else {
            f5 = 0.0f;
            chipDrawable = null;
        }
        return f5;
    }

    public float getChipStartPadding() {
        float f5;
        ChipDrawable chipDrawable = this.chipDrawable;
        if (chipDrawable != null) {
            f5 = chipDrawable.getChipStartPadding();
        } else {
            f5 = 0.0f;
            chipDrawable = null;
        }
        return f5;
    }

    public ColorStateList getChipStrokeColor() {
        ChipDrawable chipDrawable = this.chipDrawable;
        chipDrawable = chipDrawable != null ? chipDrawable.getChipStrokeColor() : null;
        return chipDrawable;
    }

    public float getChipStrokeWidth() {
        float f5;
        ChipDrawable chipDrawable = this.chipDrawable;
        if (chipDrawable != null) {
            f5 = chipDrawable.getChipStrokeWidth();
        } else {
            f5 = 0.0f;
            chipDrawable = null;
        }
        return f5;
    }

    public CharSequence getChipText() {
        return this.getText();
    }

    public Drawable getCloseIcon() {
        ChipDrawable chipDrawable = this.chipDrawable;
        chipDrawable = chipDrawable != null ? chipDrawable.getCloseIcon() : null;
        return chipDrawable;
    }

    public CharSequence getCloseIconContentDescription() {
        Object object = this.chipDrawable;
        object = object != null ? ((ChipDrawable)object).getCloseIconContentDescription() : null;
        return object;
    }

    public float getCloseIconEndPadding() {
        float f5;
        ChipDrawable chipDrawable = this.chipDrawable;
        if (chipDrawable != null) {
            f5 = chipDrawable.getCloseIconEndPadding();
        } else {
            f5 = 0.0f;
            chipDrawable = null;
        }
        return f5;
    }

    public float getCloseIconSize() {
        float f5;
        ChipDrawable chipDrawable = this.chipDrawable;
        if (chipDrawable != null) {
            f5 = chipDrawable.getCloseIconSize();
        } else {
            f5 = 0.0f;
            chipDrawable = null;
        }
        return f5;
    }

    public float getCloseIconStartPadding() {
        float f5;
        ChipDrawable chipDrawable = this.chipDrawable;
        if (chipDrawable != null) {
            f5 = chipDrawable.getCloseIconStartPadding();
        } else {
            f5 = 0.0f;
            chipDrawable = null;
        }
        return f5;
    }

    public ColorStateList getCloseIconTint() {
        ChipDrawable chipDrawable = this.chipDrawable;
        chipDrawable = chipDrawable != null ? chipDrawable.getCloseIconTint() : null;
        return chipDrawable;
    }

    public TextUtils.TruncateAt getEllipsize() {
        ChipDrawable chipDrawable = this.chipDrawable;
        chipDrawable = chipDrawable != null ? chipDrawable.getEllipsize() : null;
        return chipDrawable;
    }

    public void getFocusedRect(Rect rect) {
        int n3;
        Chip$ChipTouchHelper chip$ChipTouchHelper;
        int n4 = this.touchHelperEnabled;
        if (n4 != 0 && ((n4 = (chip$ChipTouchHelper = this.touchHelper).getKeyboardFocusedVirtualViewId()) == (n3 = 1) || (n4 = (chip$ChipTouchHelper = this.touchHelper).getAccessibilityFocusedVirtualViewId()) == n3)) {
            chip$ChipTouchHelper = this.getCloseIconTouchBoundsInt();
            rect.set((Rect)chip$ChipTouchHelper);
        } else {
            super.getFocusedRect(rect);
        }
    }

    public MotionSpec getHideMotionSpec() {
        Object object = this.chipDrawable;
        object = object != null ? ((ChipDrawable)object).getHideMotionSpec() : null;
        return object;
    }

    public float getIconEndPadding() {
        float f5;
        ChipDrawable chipDrawable = this.chipDrawable;
        if (chipDrawable != null) {
            f5 = chipDrawable.getIconEndPadding();
        } else {
            f5 = 0.0f;
            chipDrawable = null;
        }
        return f5;
    }

    public float getIconStartPadding() {
        float f5;
        ChipDrawable chipDrawable = this.chipDrawable;
        if (chipDrawable != null) {
            f5 = chipDrawable.getIconStartPadding();
        } else {
            f5 = 0.0f;
            chipDrawable = null;
        }
        return f5;
    }

    public ColorStateList getRippleColor() {
        ChipDrawable chipDrawable = this.chipDrawable;
        chipDrawable = chipDrawable != null ? chipDrawable.getRippleColor() : null;
        return chipDrawable;
    }

    public ShapeAppearanceModel getShapeAppearanceModel() {
        return this.chipDrawable.getShapeAppearanceModel();
    }

    public MotionSpec getShowMotionSpec() {
        Object object = this.chipDrawable;
        object = object != null ? ((ChipDrawable)object).getShowMotionSpec() : null;
        return object;
    }

    public float getTextEndPadding() {
        float f5;
        ChipDrawable chipDrawable = this.chipDrawable;
        if (chipDrawable != null) {
            f5 = chipDrawable.getTextEndPadding();
        } else {
            f5 = 0.0f;
            chipDrawable = null;
        }
        return f5;
    }

    public float getTextStartPadding() {
        float f5;
        ChipDrawable chipDrawable = this.chipDrawable;
        if (chipDrawable != null) {
            f5 = chipDrawable.getTextStartPadding();
        } else {
            f5 = 0.0f;
            chipDrawable = null;
        }
        return f5;
    }

    public boolean isCheckable() {
        boolean bl2;
        ChipDrawable chipDrawable = this.chipDrawable;
        if (chipDrawable != null && (bl2 = chipDrawable.isCheckable())) {
            bl2 = true;
        } else {
            bl2 = false;
            chipDrawable = null;
        }
        return bl2;
    }

    public boolean isCheckedIconEnabled() {
        return this.isCheckedIconVisible();
    }

    public boolean isCheckedIconVisible() {
        boolean bl2;
        ChipDrawable chipDrawable = this.chipDrawable;
        if (chipDrawable != null && (bl2 = chipDrawable.isCheckedIconVisible())) {
            bl2 = true;
        } else {
            bl2 = false;
            chipDrawable = null;
        }
        return bl2;
    }

    public boolean isChipIconEnabled() {
        return this.isChipIconVisible();
    }

    public boolean isChipIconVisible() {
        boolean bl2;
        ChipDrawable chipDrawable = this.chipDrawable;
        if (chipDrawable != null && (bl2 = chipDrawable.isChipIconVisible())) {
            bl2 = true;
        } else {
            bl2 = false;
            chipDrawable = null;
        }
        return bl2;
    }

    public boolean isCloseIconEnabled() {
        return this.isCloseIconVisible();
    }

    public boolean isCloseIconVisible() {
        boolean bl2;
        ChipDrawable chipDrawable = this.chipDrawable;
        if (chipDrawable != null && (bl2 = chipDrawable.isCloseIconVisible())) {
            bl2 = true;
        } else {
            bl2 = false;
            chipDrawable = null;
        }
        return bl2;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        ChipDrawable chipDrawable = this.chipDrawable;
        MaterialShapeUtils.setParentAbsoluteElevation((View)this, chipDrawable);
    }

    public void onChipDrawableSizeChange() {
        int n3 = this.minTouchTargetSize;
        this.ensureAccessibleTouchTarget(n3);
        this.requestLayout();
        this.invalidateOutline();
    }

    public int[] onCreateDrawableState(int n3) {
        int[] nArray;
        int[] nArray2 = super.onCreateDrawableState(n3 += 2);
        boolean bl2 = this.isChecked();
        if (bl2) {
            nArray = SELECTED_STATE;
            View.mergeDrawableStates((int[])nArray2, (int[])nArray);
        }
        if (bl2 = this.isCheckable()) {
            nArray = CHECKABLE_STATE_SET;
            View.mergeDrawableStates((int[])nArray2, (int[])nArray);
        }
        return nArray2;
    }

    public void onFocusChanged(boolean bl2, int n3, Rect rect) {
        super.onFocusChanged(bl2, n3, rect);
        boolean bl3 = this.touchHelperEnabled;
        if (bl3) {
            Chip$ChipTouchHelper chip$ChipTouchHelper = this.touchHelper;
            chip$ChipTouchHelper.onFocusChanged(bl2, n3, rect);
        }
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        int bl2 = motionEvent.getActionMasked();
        int n3 = 7;
        float f5 = 9.8E-45f;
        if (bl2 != n3) {
            int n4 = 10;
            f5 = 1.4E-44f;
            if (bl2 == n4) {
                boolean bl3 = false;
                Object var5_8 = null;
                this.setCloseIconHovered(false);
            }
        } else {
            RectF rectF = this.getCloseIconTouchBounds();
            f5 = motionEvent.getX();
            float f6 = motionEvent.getY();
            boolean bl4 = rectF.contains(f5, f6);
            this.setCloseIconHovered(bl4);
        }
        return super.onHoverEvent(motionEvent);
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        Object object = this.getAccessibilityClassName();
        accessibilityNodeInfo.setClassName(object);
        boolean bl2 = this.isCheckable();
        accessibilityNodeInfo.setCheckable(bl2);
        bl2 = this.isClickable();
        accessibilityNodeInfo.setClickable(bl2);
        object = this.getParent();
        bl2 = object instanceof ChipGroup;
        if (bl2) {
            int n3;
            object = (ChipGroup)this.getParent();
            boolean n4 = ((ChipGroup)((Object)object)).isSingleLine();
            if (n4) {
                int n7;
                n3 = n7 = ((ChipGroup)((Object)object)).getIndexOfChip((View)this);
            } else {
                int n8 = -1;
                n3 = -1;
            }
            int n10 = ((FlowLayout)((Object)object)).getRowIndex((View)this);
            boolean bl3 = this.isChecked();
            int n14 = 1;
            int n15 = 1;
            object = (AccessibilityNodeInfo.CollectionItemInfo)C2$f.a((int)n10, (int)n14, (int)n3, (int)n15, (boolean)false, (boolean)bl3).a;
            accessibilityNodeInfo.setCollectionItemInfo((AccessibilityNodeInfo.CollectionItemInfo)object);
        }
    }

    public PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int n3) {
        float f5;
        float f6;
        RectF rectF = this.getCloseIconTouchBounds();
        boolean bl2 = rectF.contains(f6 = motionEvent.getX(), f5 = motionEvent.getY());
        if (bl2 && (bl2 = this.isEnabled())) {
            return PointerIcon.getSystemIcon((Context)this.getContext(), (int)1002);
        }
        return super.onResolvePointerIcon(motionEvent, n3);
    }

    public void onRtlPropertiesChanged(int n3) {
        super.onRtlPropertiesChanged(n3);
        int n4 = this.lastLayoutDirection;
        if (n4 != n3) {
            this.lastLayoutDirection = n3;
            this.updatePaddingInternal();
        }
    }

    /*
     * Unable to fully structure code
     */
    public boolean onTouchEvent(MotionEvent var1_1) {
        block7: {
            block11: {
                block8: {
                    block9: {
                        block10: {
                            var2_2 = var1_1.getActionMasked();
                            var3_3 = this.getCloseIconTouchBounds();
                            var4_4 = var1_1.getX();
                            var5_5 = var1_1.getY();
                            var6_6 = var3_3.contains(var4_4, var5_5);
                            var7_7 = 1;
                            var4_4 = 1.4E-45f;
                            var5_5 = 0.0f;
                            if (var2_2 == 0) break block8;
                            if (var2_2 == var7_7) break block9;
                            var8_8 = 2;
                            if (var2_2 == var8_8) break block10;
                            var6_6 = 3;
                            if (var2_2 == var6_6) ** GOTO lbl-1000
                            break block11;
                        }
                        var2_2 = this.closeIconPressed;
                        if (var2_2 != 0) {
                            if (var6_6 == 0) {
                                this.setCloseIconPressed(false);
                            }
lbl21:
                            // 4 sources

                            while (true) {
                                var2_2 = 1;
                                break block7;
                                break;
                            }
                        }
                        break block11;
                    }
                    var2_2 = this.closeIconPressed;
                    if (var2_2 != 0) {
                        this.performCloseIconClick();
                        var2_2 = 1;
                    } else lbl-1000:
                    // 2 sources

                    {
                        var2_2 = 0;
                    }
                    this.setCloseIconPressed(false);
                    break block7;
                }
                if (var6_6 != 0) {
                    this.setCloseIconPressed((boolean)var7_7);
                    ** continue;
                }
            }
            var2_2 = 0;
        }
        if (var2_2 == 0 && !(var9_9 = super.onTouchEvent(var1_1))) {
            var7_7 = 0;
            var4_4 = 0.0f;
        }
        return (boolean)var7_7;
    }

    public boolean performCloseIconClick() {
        boolean bl2;
        boolean bl3 = false;
        this.playSoundEffect(0);
        Object object = this.onCloseIconClickListener;
        int n3 = 1;
        if (object != null) {
            object.onClick((View)this);
            bl3 = true;
        }
        if (bl2 = this.touchHelperEnabled) {
            object = this.touchHelper;
            ((HH0)object).sendEventForVirtualView(n3, n3);
        }
        return bl3;
    }

    public void setAccessibilityClassName(CharSequence charSequence) {
        this.accessibilityClassName = charSequence;
    }

    public void setBackground(Drawable drawable2) {
        Drawable drawable3 = this.getBackgroundDrawable();
        if (drawable2 == drawable3 || drawable2 == (drawable3 = this.ripple)) {
            super.setBackground(drawable2);
        }
    }

    public void setBackgroundColor(int n3) {
    }

    public void setBackgroundDrawable(Drawable drawable2) {
        Drawable drawable3 = this.getBackgroundDrawable();
        if (drawable2 == drawable3 || drawable2 == (drawable3 = this.ripple)) {
            super.setBackgroundDrawable(drawable2);
        }
    }

    public void setBackgroundResource(int n3) {
    }

    public void setBackgroundTintList(ColorStateList colorStateList) {
    }

    public void setBackgroundTintMode(PorterDuff.Mode mode) {
    }

    public void setCheckable(boolean bl2) {
        ChipDrawable chipDrawable = this.chipDrawable;
        if (chipDrawable != null) {
            chipDrawable.setCheckable(bl2);
        }
    }

    public void setCheckableResource(int n3) {
        ChipDrawable chipDrawable = this.chipDrawable;
        if (chipDrawable != null) {
            chipDrawable.setCheckableResource(n3);
        }
    }

    public void setChecked(boolean bl2) {
        ChipDrawable chipDrawable = this.chipDrawable;
        if (chipDrawable == null) {
            this.deferredCheckedValue = bl2;
        } else {
            boolean bl3 = chipDrawable.isCheckable();
            if (bl3) {
                super.setChecked(bl2);
            }
        }
    }

    public void setCheckedIcon(Drawable drawable2) {
        ChipDrawable chipDrawable = this.chipDrawable;
        if (chipDrawable != null) {
            chipDrawable.setCheckedIcon(drawable2);
        }
    }

    public void setCheckedIconEnabled(boolean bl2) {
        this.setCheckedIconVisible(bl2);
    }

    public void setCheckedIconEnabledResource(int n3) {
        this.setCheckedIconVisible(n3);
    }

    public void setCheckedIconResource(int n3) {
        ChipDrawable chipDrawable = this.chipDrawable;
        if (chipDrawable != null) {
            chipDrawable.setCheckedIconResource(n3);
        }
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        ChipDrawable chipDrawable = this.chipDrawable;
        if (chipDrawable != null) {
            chipDrawable.setCheckedIconTint(colorStateList);
        }
    }

    public void setCheckedIconTintResource(int n3) {
        ChipDrawable chipDrawable = this.chipDrawable;
        if (chipDrawable != null) {
            chipDrawable.setCheckedIconTintResource(n3);
        }
    }

    public void setCheckedIconVisible(int n3) {
        ChipDrawable chipDrawable = this.chipDrawable;
        if (chipDrawable != null) {
            chipDrawable.setCheckedIconVisible(n3);
        }
    }

    public void setCheckedIconVisible(boolean bl2) {
        ChipDrawable chipDrawable = this.chipDrawable;
        if (chipDrawable != null) {
            chipDrawable.setCheckedIconVisible(bl2);
        }
    }

    public void setChipBackgroundColor(ColorStateList colorStateList) {
        ChipDrawable chipDrawable = this.chipDrawable;
        if (chipDrawable != null) {
            chipDrawable.setChipBackgroundColor(colorStateList);
        }
    }

    public void setChipBackgroundColorResource(int n3) {
        ChipDrawable chipDrawable = this.chipDrawable;
        if (chipDrawable != null) {
            chipDrawable.setChipBackgroundColorResource(n3);
        }
    }

    public void setChipCornerRadius(float f5) {
        ChipDrawable chipDrawable = this.chipDrawable;
        if (chipDrawable != null) {
            chipDrawable.setChipCornerRadius(f5);
        }
    }

    public void setChipCornerRadiusResource(int n3) {
        ChipDrawable chipDrawable = this.chipDrawable;
        if (chipDrawable != null) {
            chipDrawable.setChipCornerRadiusResource(n3);
        }
    }

    public void setChipDrawable(ChipDrawable chipDrawable) {
        ChipDrawable chipDrawable2 = this.chipDrawable;
        if (chipDrawable2 != chipDrawable) {
            this.unapplyChipDrawable(chipDrawable2);
            this.chipDrawable = chipDrawable;
            chipDrawable2 = null;
            chipDrawable.setShouldDrawText(false);
            chipDrawable = this.chipDrawable;
            this.applyChipDrawable(chipDrawable);
            int n3 = this.minTouchTargetSize;
            this.ensureAccessibleTouchTarget(n3);
        }
    }

    public void setChipEndPadding(float f5) {
        ChipDrawable chipDrawable = this.chipDrawable;
        if (chipDrawable != null) {
            chipDrawable.setChipEndPadding(f5);
        }
    }

    public void setChipEndPaddingResource(int n3) {
        ChipDrawable chipDrawable = this.chipDrawable;
        if (chipDrawable != null) {
            chipDrawable.setChipEndPaddingResource(n3);
        }
    }

    public void setChipIcon(Drawable drawable2) {
        ChipDrawable chipDrawable = this.chipDrawable;
        if (chipDrawable != null) {
            chipDrawable.setChipIcon(drawable2);
        }
    }

    public void setChipIconEnabled(boolean bl2) {
        this.setChipIconVisible(bl2);
    }

    public void setChipIconEnabledResource(int n3) {
        this.setChipIconVisible(n3);
    }

    public void setChipIconResource(int n3) {
        ChipDrawable chipDrawable = this.chipDrawable;
        if (chipDrawable != null) {
            chipDrawable.setChipIconResource(n3);
        }
    }

    public void setChipIconSize(float f5) {
        ChipDrawable chipDrawable = this.chipDrawable;
        if (chipDrawable != null) {
            chipDrawable.setChipIconSize(f5);
        }
    }

    public void setChipIconSizeResource(int n3) {
        ChipDrawable chipDrawable = this.chipDrawable;
        if (chipDrawable != null) {
            chipDrawable.setChipIconSizeResource(n3);
        }
    }

    public void setChipIconTint(ColorStateList colorStateList) {
        ChipDrawable chipDrawable = this.chipDrawable;
        if (chipDrawable != null) {
            chipDrawable.setChipIconTint(colorStateList);
        }
    }

    public void setChipIconTintResource(int n3) {
        ChipDrawable chipDrawable = this.chipDrawable;
        if (chipDrawable != null) {
            chipDrawable.setChipIconTintResource(n3);
        }
    }

    public void setChipIconVisible(int n3) {
        ChipDrawable chipDrawable = this.chipDrawable;
        if (chipDrawable != null) {
            chipDrawable.setChipIconVisible(n3);
        }
    }

    public void setChipIconVisible(boolean bl2) {
        ChipDrawable chipDrawable = this.chipDrawable;
        if (chipDrawable != null) {
            chipDrawable.setChipIconVisible(bl2);
        }
    }

    public void setChipMinHeight(float f5) {
        ChipDrawable chipDrawable = this.chipDrawable;
        if (chipDrawable != null) {
            chipDrawable.setChipMinHeight(f5);
        }
    }

    public void setChipMinHeightResource(int n3) {
        ChipDrawable chipDrawable = this.chipDrawable;
        if (chipDrawable != null) {
            chipDrawable.setChipMinHeightResource(n3);
        }
    }

    public void setChipStartPadding(float f5) {
        ChipDrawable chipDrawable = this.chipDrawable;
        if (chipDrawable != null) {
            chipDrawable.setChipStartPadding(f5);
        }
    }

    public void setChipStartPaddingResource(int n3) {
        ChipDrawable chipDrawable = this.chipDrawable;
        if (chipDrawable != null) {
            chipDrawable.setChipStartPaddingResource(n3);
        }
    }

    public void setChipStrokeColor(ColorStateList colorStateList) {
        ChipDrawable chipDrawable = this.chipDrawable;
        if (chipDrawable != null) {
            chipDrawable.setChipStrokeColor(colorStateList);
        }
    }

    public void setChipStrokeColorResource(int n3) {
        ChipDrawable chipDrawable = this.chipDrawable;
        if (chipDrawable != null) {
            chipDrawable.setChipStrokeColorResource(n3);
        }
    }

    public void setChipStrokeWidth(float f5) {
        ChipDrawable chipDrawable = this.chipDrawable;
        if (chipDrawable != null) {
            chipDrawable.setChipStrokeWidth(f5);
        }
    }

    public void setChipStrokeWidthResource(int n3) {
        ChipDrawable chipDrawable = this.chipDrawable;
        if (chipDrawable != null) {
            chipDrawable.setChipStrokeWidthResource(n3);
        }
    }

    public void setChipText(CharSequence charSequence) {
        this.setText(charSequence);
    }

    public void setChipTextResource(int n3) {
        String string2 = this.getResources().getString(n3);
        this.setText(string2);
    }

    public void setCloseIcon(Drawable drawable2) {
        ChipDrawable chipDrawable = this.chipDrawable;
        if (chipDrawable != null) {
            chipDrawable.setCloseIcon(drawable2);
        }
        this.updateAccessibilityDelegate();
    }

    public void setCloseIconContentDescription(CharSequence charSequence) {
        ChipDrawable chipDrawable = this.chipDrawable;
        if (chipDrawable != null) {
            chipDrawable.setCloseIconContentDescription(charSequence);
        }
    }

    public void setCloseIconEnabled(boolean bl2) {
        this.setCloseIconVisible(bl2);
    }

    public void setCloseIconEnabledResource(int n3) {
        this.setCloseIconVisible(n3);
    }

    public void setCloseIconEndPadding(float f5) {
        ChipDrawable chipDrawable = this.chipDrawable;
        if (chipDrawable != null) {
            chipDrawable.setCloseIconEndPadding(f5);
        }
    }

    public void setCloseIconEndPaddingResource(int n3) {
        ChipDrawable chipDrawable = this.chipDrawable;
        if (chipDrawable != null) {
            chipDrawable.setCloseIconEndPaddingResource(n3);
        }
    }

    public void setCloseIconResource(int n3) {
        ChipDrawable chipDrawable = this.chipDrawable;
        if (chipDrawable != null) {
            chipDrawable.setCloseIconResource(n3);
        }
        this.updateAccessibilityDelegate();
    }

    public void setCloseIconSize(float f5) {
        ChipDrawable chipDrawable = this.chipDrawable;
        if (chipDrawable != null) {
            chipDrawable.setCloseIconSize(f5);
        }
    }

    public void setCloseIconSizeResource(int n3) {
        ChipDrawable chipDrawable = this.chipDrawable;
        if (chipDrawable != null) {
            chipDrawable.setCloseIconSizeResource(n3);
        }
    }

    public void setCloseIconStartPadding(float f5) {
        ChipDrawable chipDrawable = this.chipDrawable;
        if (chipDrawable != null) {
            chipDrawable.setCloseIconStartPadding(f5);
        }
    }

    public void setCloseIconStartPaddingResource(int n3) {
        ChipDrawable chipDrawable = this.chipDrawable;
        if (chipDrawable != null) {
            chipDrawable.setCloseIconStartPaddingResource(n3);
        }
    }

    public void setCloseIconTint(ColorStateList colorStateList) {
        ChipDrawable chipDrawable = this.chipDrawable;
        if (chipDrawable != null) {
            chipDrawable.setCloseIconTint(colorStateList);
        }
    }

    public void setCloseIconTintResource(int n3) {
        ChipDrawable chipDrawable = this.chipDrawable;
        if (chipDrawable != null) {
            chipDrawable.setCloseIconTintResource(n3);
        }
    }

    public void setCloseIconVisible(int n3) {
        n3 = (int)(this.getResources().getBoolean(n3) ? 1 : 0);
        this.setCloseIconVisible(n3 != 0);
    }

    public void setCloseIconVisible(boolean bl2) {
        ChipDrawable chipDrawable = this.chipDrawable;
        if (chipDrawable != null) {
            chipDrawable.setCloseIconVisible(bl2);
        }
        this.updateAccessibilityDelegate();
    }

    public void setCompoundDrawables(Drawable object, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (object == null) {
            if (drawable3 == null) {
                super.setCompoundDrawables((Drawable)object, drawable2, drawable3, drawable4);
                return;
            }
            object = new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
            throw object;
        }
        object = new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        throw object;
    }

    public void setCompoundDrawablesRelative(Drawable object, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (object == null) {
            if (drawable3 == null) {
                super.setCompoundDrawablesRelative((Drawable)object, drawable2, drawable3, drawable4);
                return;
            }
            object = new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
            throw object;
        }
        object = new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        throw object;
    }

    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int n3, int n4, int n7, int n8) {
        if (n3 == 0) {
            if (n7 == 0) {
                super.setCompoundDrawablesRelativeWithIntrinsicBounds(n3, n4, n7, n8);
                return;
            }
            UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
            throw unsupportedOperationException;
        }
        UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        throw unsupportedOperationException;
    }

    public void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable object, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (object == null) {
            if (drawable3 == null) {
                super.setCompoundDrawablesRelativeWithIntrinsicBounds(object, drawable2, drawable3, drawable4);
                return;
            }
            object = new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
            throw object;
        }
        object = new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        throw object;
    }

    public void setCompoundDrawablesWithIntrinsicBounds(int n3, int n4, int n7, int n8) {
        if (n3 == 0) {
            if (n7 == 0) {
                super.setCompoundDrawablesWithIntrinsicBounds(n3, n4, n7, n8);
                return;
            }
            UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
            throw unsupportedOperationException;
        }
        UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        throw unsupportedOperationException;
    }

    public void setCompoundDrawablesWithIntrinsicBounds(Drawable object, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (object == null) {
            if (drawable3 == null) {
                super.setCompoundDrawablesWithIntrinsicBounds(object, drawable2, drawable3, drawable4);
                return;
            }
            object = new UnsupportedOperationException("Please set right drawable using R.attr#closeIcon.");
            throw object;
        }
        object = new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
        throw object;
    }

    public void setElevation(float f5) {
        super.setElevation(f5);
        ChipDrawable chipDrawable = this.chipDrawable;
        if (chipDrawable != null) {
            chipDrawable.setElevation(f5);
        }
    }

    public void setEllipsize(TextUtils.TruncateAt object) {
        ChipDrawable chipDrawable = this.chipDrawable;
        if (chipDrawable == null) {
            return;
        }
        chipDrawable = TextUtils.TruncateAt.MARQUEE;
        if (object != chipDrawable) {
            super.setEllipsize(object);
            chipDrawable = this.chipDrawable;
            if (chipDrawable != null) {
                chipDrawable.setEllipsize((TextUtils.TruncateAt)object);
            }
            return;
        }
        object = new UnsupportedOperationException("Text within a chip are not allowed to scroll.");
        throw object;
    }

    public void setEnsureMinTouchTargetSize(boolean bl2) {
        this.ensureMinTouchTargetSize = bl2;
        int n3 = this.minTouchTargetSize;
        this.ensureAccessibleTouchTarget(n3);
    }

    public void setGravity(int n3) {
        int n4 = 8388627;
        if (n3 == n4) {
            super.setGravity(n3);
        }
    }

    public void setHideMotionSpec(MotionSpec motionSpec) {
        ChipDrawable chipDrawable = this.chipDrawable;
        if (chipDrawable != null) {
            chipDrawable.setHideMotionSpec(motionSpec);
        }
    }

    public void setHideMotionSpecResource(int n3) {
        ChipDrawable chipDrawable = this.chipDrawable;
        if (chipDrawable != null) {
            chipDrawable.setHideMotionSpecResource(n3);
        }
    }

    public void setIconEndPadding(float f5) {
        ChipDrawable chipDrawable = this.chipDrawable;
        if (chipDrawable != null) {
            chipDrawable.setIconEndPadding(f5);
        }
    }

    public void setIconEndPaddingResource(int n3) {
        ChipDrawable chipDrawable = this.chipDrawable;
        if (chipDrawable != null) {
            chipDrawable.setIconEndPaddingResource(n3);
        }
    }

    public void setIconStartPadding(float f5) {
        ChipDrawable chipDrawable = this.chipDrawable;
        if (chipDrawable != null) {
            chipDrawable.setIconStartPadding(f5);
        }
    }

    public void setIconStartPaddingResource(int n3) {
        ChipDrawable chipDrawable = this.chipDrawable;
        if (chipDrawable != null) {
            chipDrawable.setIconStartPaddingResource(n3);
        }
    }

    public void setInternalOnCheckedChangeListener(MaterialCheckable$OnCheckedChangeListener materialCheckable$OnCheckedChangeListener) {
        this.onCheckedChangeListenerInternal = materialCheckable$OnCheckedChangeListener;
    }

    public void setLayoutDirection(int n3) {
        ChipDrawable chipDrawable = this.chipDrawable;
        if (chipDrawable == null) {
            return;
        }
        super.setLayoutDirection(n3);
    }

    public void setLines(int n3) {
        int n4 = 1;
        if (n3 <= n4) {
            super.setLines(n3);
            return;
        }
        UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException("Chip does not support multi-line text");
        throw unsupportedOperationException;
    }

    public void setMaxLines(int n3) {
        int n4 = 1;
        if (n3 <= n4) {
            super.setMaxLines(n3);
            return;
        }
        UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException("Chip does not support multi-line text");
        throw unsupportedOperationException;
    }

    public void setMaxWidth(int n3) {
        super.setMaxWidth(n3);
        ChipDrawable chipDrawable = this.chipDrawable;
        if (chipDrawable != null) {
            chipDrawable.setMaxWidth(n3);
        }
    }

    public void setMinLines(int n3) {
        int n4 = 1;
        if (n3 <= n4) {
            super.setMinLines(n3);
            return;
        }
        UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException("Chip does not support multi-line text");
        throw unsupportedOperationException;
    }

    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.onCheckedChangeListener = onCheckedChangeListener;
    }

    public void setOnCloseIconClickListener(View.OnClickListener onClickListener) {
        this.onCloseIconClickListener = onClickListener;
        this.updateAccessibilityDelegate();
    }

    public void setRippleColor(ColorStateList object) {
        boolean bl2;
        ChipDrawable chipDrawable = this.chipDrawable;
        if (chipDrawable != null) {
            chipDrawable.setRippleColor((ColorStateList)object);
        }
        if (!(bl2 = ((ChipDrawable)(object = this.chipDrawable)).getUseCompatRipple())) {
            this.updateFrameworkRippleBackground();
        }
    }

    public void setRippleColorResource(int n3) {
        ChipDrawable chipDrawable = this.chipDrawable;
        if (chipDrawable != null) {
            chipDrawable.setRippleColorResource(n3);
            ChipDrawable chipDrawable2 = this.chipDrawable;
            n3 = (int)(chipDrawable2.getUseCompatRipple() ? 1 : 0);
            if (n3 == 0) {
                this.updateFrameworkRippleBackground();
            }
        }
    }

    public void setShapeAppearanceModel(ShapeAppearanceModel shapeAppearanceModel) {
        this.chipDrawable.setShapeAppearanceModel(shapeAppearanceModel);
    }

    public void setShowMotionSpec(MotionSpec motionSpec) {
        ChipDrawable chipDrawable = this.chipDrawable;
        if (chipDrawable != null) {
            chipDrawable.setShowMotionSpec(motionSpec);
        }
    }

    public void setShowMotionSpecResource(int n3) {
        ChipDrawable chipDrawable = this.chipDrawable;
        if (chipDrawable != null) {
            chipDrawable.setShowMotionSpecResource(n3);
        }
    }

    public void setSingleLine(boolean bl2) {
        if (bl2) {
            super.setSingleLine(bl2);
            return;
        }
        UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException("Chip does not support multi-line text");
        throw unsupportedOperationException;
    }

    public void setText(CharSequence charSequence, TextView.BufferType object) {
        boolean bl2;
        Object object2 = this.chipDrawable;
        if (object2 == null) {
            return;
        }
        if (charSequence == null) {
            charSequence = "";
        }
        if (bl2 = ((ChipDrawable)object2).shouldDrawText()) {
            bl2 = false;
            object2 = null;
        } else {
            object2 = charSequence;
        }
        super.setText((CharSequence)object2, (TextView.BufferType)object);
        object = this.chipDrawable;
        if (object != null) {
            ((ChipDrawable)object).setText(charSequence);
        }
    }

    public void setTextAppearance(int n3) {
        super.setTextAppearance(n3);
        ChipDrawable chipDrawable = this.chipDrawable;
        if (chipDrawable != null) {
            chipDrawable.setTextAppearanceResource(n3);
        }
        this.updateTextPaintDrawState();
    }

    public void setTextAppearance(Context object, int n3) {
        super.setTextAppearance((Context)object, n3);
        object = this.chipDrawable;
        if (object != null) {
            ((ChipDrawable)object).setTextAppearanceResource(n3);
        }
        this.updateTextPaintDrawState();
    }

    public void setTextAppearance(TextAppearance textAppearance) {
        ChipDrawable chipDrawable = this.chipDrawable;
        if (chipDrawable != null) {
            chipDrawable.setTextAppearance(textAppearance);
        }
        this.updateTextPaintDrawState();
    }

    public void setTextAppearanceResource(int n3) {
        Context context = this.getContext();
        this.setTextAppearance(context, n3);
    }

    public void setTextEndPadding(float f5) {
        ChipDrawable chipDrawable = this.chipDrawable;
        if (chipDrawable != null) {
            chipDrawable.setTextEndPadding(f5);
        }
    }

    public void setTextEndPaddingResource(int n3) {
        ChipDrawable chipDrawable = this.chipDrawable;
        if (chipDrawable != null) {
            chipDrawable.setTextEndPaddingResource(n3);
        }
    }

    public void setTextSize(int n3, float f5) {
        super.setTextSize(n3, f5);
        ChipDrawable chipDrawable = this.chipDrawable;
        if (chipDrawable != null) {
            DisplayMetrics displayMetrics = this.getResources().getDisplayMetrics();
            float f6 = TypedValue.applyDimension((int)n3, (float)f5, (DisplayMetrics)displayMetrics);
            chipDrawable.setTextSize(f6);
        }
        this.updateTextPaintDrawState();
    }

    public void setTextStartPadding(float f5) {
        ChipDrawable chipDrawable = this.chipDrawable;
        if (chipDrawable != null) {
            chipDrawable.setTextStartPadding(f5);
        }
    }

    public void setTextStartPaddingResource(int n3) {
        ChipDrawable chipDrawable = this.chipDrawable;
        if (chipDrawable != null) {
            chipDrawable.setTextStartPaddingResource(n3);
        }
    }

    public boolean shouldEnsureMinTouchTargetSize() {
        return this.ensureMinTouchTargetSize;
    }
}

