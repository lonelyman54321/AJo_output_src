/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.TimeInterpolator
 *  android.animation.ValueAnimator
 *  android.animation.ValueAnimator$AnimatorUpdateListener
 *  android.content.Context
 *  android.content.res.ColorStateList
 *  android.content.res.Configuration
 *  android.content.res.Resources
 *  android.content.res.TypedArray
 *  android.graphics.Canvas
 *  android.graphics.ColorFilter
 *  android.graphics.PorterDuff$Mode
 *  android.graphics.Rect
 *  android.graphics.RectF
 *  android.graphics.Typeface
 *  android.graphics.drawable.ColorDrawable
 *  android.graphics.drawable.Drawable
 *  android.graphics.drawable.LayerDrawable
 *  android.graphics.drawable.RippleDrawable
 *  android.graphics.drawable.StateListDrawable
 *  android.os.Build$VERSION
 *  android.os.Parcelable
 *  android.text.Editable
 *  android.text.TextUtils
 *  android.text.TextWatcher
 *  android.util.AttributeSet
 *  android.util.SparseArray
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.View$OnLongClickListener
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 *  android.view.ViewGroup$MarginLayoutParams
 *  android.view.ViewStructure
 *  android.view.ViewTreeObserver
 *  android.view.ViewTreeObserver$OnGlobalLayoutListener
 *  android.view.autofill.AutofillId
 *  android.widget.AutoCompleteTextView
 *  android.widget.EditText
 *  android.widget.FrameLayout
 *  android.widget.FrameLayout$LayoutParams
 *  android.widget.ImageView$ScaleType
 *  android.widget.LinearLayout
 *  android.widget.LinearLayout$LayoutParams
 *  android.widget.TextView
 */
package com.google.android.material.textfield;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.view.ViewTreeObserver;
import android.view.autofill.AutofillId;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.view.ViewCompat;
import androidx.core.view.ViewCompat$f;
import androidx.transition.Fade;
import androidx.transition.Transition;
import androidx.transition.g;
import com.google.android.material.R$attr;
import com.google.android.material.R$color;
import com.google.android.material.R$dimen;
import com.google.android.material.R$id;
import com.google.android.material.R$string;
import com.google.android.material.R$style;
import com.google.android.material.R$styleable;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.internal.CollapsingTextHelper;
import com.google.android.material.internal.DescendantOffsetUtils;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.motion.MotionUtils;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.shape.CornerSize;
import com.google.android.material.shape.CornerTreatment;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.shape.ShapeAppearanceModel$Builder;
import com.google.android.material.textfield.CutoutDrawable;
import com.google.android.material.textfield.EditTextUtils;
import com.google.android.material.textfield.EndCompoundLayout;
import com.google.android.material.textfield.IndicatorViewController;
import com.google.android.material.textfield.MaterialAutoCompleteTextView;
import com.google.android.material.textfield.StartCompoundLayout;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout$1;
import com.google.android.material.textfield.TextInputLayout$2;
import com.google.android.material.textfield.TextInputLayout$3;
import com.google.android.material.textfield.TextInputLayout$AccessibilityDelegate;
import com.google.android.material.textfield.TextInputLayout$LengthCounter;
import com.google.android.material.textfield.TextInputLayout$OnEditTextAttachedListener;
import com.google.android.material.textfield.TextInputLayout$OnEndIconChangedListener;
import com.google.android.material.textfield.TextInputLayout$SavedState;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;
import java.util.AbstractCollection;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class TextInputLayout
extends LinearLayout
implements ViewTreeObserver.OnGlobalLayoutListener {
    public static final int BOX_BACKGROUND_FILLED = 1;
    public static final int BOX_BACKGROUND_NONE = 0;
    public static final int BOX_BACKGROUND_OUTLINE = 2;
    private static final int DEFAULT_PLACEHOLDER_FADE_DURATION = 87;
    private static final int DEF_STYLE_RES = 0;
    private static final int[][] EDIT_TEXT_BACKGROUND_RIPPLE_STATE;
    public static final int END_ICON_CLEAR_TEXT = 2;
    public static final int END_ICON_CUSTOM = 255;
    public static final int END_ICON_DROPDOWN_MENU = 3;
    public static final int END_ICON_NONE = 0;
    public static final int END_ICON_PASSWORD_TOGGLE = 1;
    private static final int INVALID_MAX_LENGTH = 255;
    private static final int LABEL_SCALE_ANIMATION_DURATION = 167;
    private static final String LOG_TAG = "TextInputLayout";
    private static final int NO_WIDTH = 255;
    private static final int PLACEHOLDER_START_DELAY = 67;
    private ValueAnimator animator;
    private boolean areCornerRadiiRtl;
    private MaterialShapeDrawable boxBackground;
    private boolean boxBackgroundApplied;
    private int boxBackgroundColor;
    private int boxBackgroundMode;
    private int boxCollapsedPaddingTopPx;
    private final int boxLabelCutoutPaddingPx;
    private int boxStrokeColor;
    private int boxStrokeWidthDefaultPx;
    private int boxStrokeWidthFocusedPx;
    private int boxStrokeWidthPx;
    private MaterialShapeDrawable boxUnderlineDefault;
    private MaterialShapeDrawable boxUnderlineFocused;
    final CollapsingTextHelper collapsingTextHelper;
    boolean counterEnabled;
    private int counterMaxLength;
    private int counterOverflowTextAppearance;
    private ColorStateList counterOverflowTextColor;
    private boolean counterOverflowed;
    private int counterTextAppearance;
    private ColorStateList counterTextColor;
    private TextView counterView;
    private ColorStateList cursorColor;
    private ColorStateList cursorErrorColor;
    private int defaultFilledBackgroundColor;
    private ColorStateList defaultHintTextColor;
    private int defaultStrokeColor;
    private int disabledColor;
    private int disabledFilledBackgroundColor;
    EditText editText;
    private final LinkedHashSet editTextAttachedListeners;
    private Drawable endDummyDrawable;
    private int endDummyDrawableWidth;
    private final EndCompoundLayout endLayout;
    private boolean expandedHintEnabled;
    private StateListDrawable filledDropDownMenuBackground;
    private int focusedFilledBackgroundColor;
    private int focusedStrokeColor;
    private ColorStateList focusedTextColor;
    private boolean globalLayoutListenerAdded;
    private CharSequence hint;
    private boolean hintAnimationEnabled;
    private boolean hintEnabled;
    private boolean hintExpanded;
    private int hoveredFilledBackgroundColor;
    private int hoveredStrokeColor;
    private boolean inDrawableStateChanged;
    private final IndicatorViewController indicatorViewController;
    private final FrameLayout inputFrame;
    private boolean isProvidingHint;
    private TextInputLayout$LengthCounter lengthCounter;
    private int maxEms;
    private int maxWidth;
    private int minEms;
    private int minWidth;
    private Drawable originalEditTextEndDrawable;
    int originalEditTextMinimumHeight;
    private CharSequence originalHint;
    private MaterialShapeDrawable outlinedDropDownMenuBackground;
    private boolean placeholderEnabled;
    private Fade placeholderFadeIn;
    private Fade placeholderFadeOut;
    private CharSequence placeholderText;
    private int placeholderTextAppearance;
    private ColorStateList placeholderTextColor;
    private TextView placeholderTextView;
    private boolean restoringSavedState;
    private ShapeAppearanceModel shapeAppearanceModel;
    private Drawable startDummyDrawable;
    private int startDummyDrawableWidth;
    private final StartCompoundLayout startLayout;
    private ColorStateList strokeErrorColor;
    private final Rect tmpBoundsRect;
    private final Rect tmpRect;
    private final RectF tmpRectF;
    private Typeface typeface;

    static {
        DEF_STYLE_RES = R$style.Widget_Design_TextInputLayout;
        int[] nArray = new int[]{};
        int[][] nArrayArray = new int[2][];
        int[] nArray2 = new int[]{16842919};
        nArrayArray[0] = nArray2;
        nArrayArray[1] = nArray;
        EDIT_TEXT_BACKGROUND_RIPPLE_STATE = nArrayArray;
    }

    public TextInputLayout(Context context) {
        this(context, null);
    }

    public TextInputLayout(Context context, AttributeSet attributeSet) {
        int n3 = R$attr.textInputStyle;
        this(context, attributeSet, n3);
    }

    public TextInputLayout(Context context, AttributeSet attributeSet, int n3) {
        int n4;
        int n7;
        int n8;
        int n10;
        float f5;
        float f6;
        float f7;
        FrameLayout frameLayout;
        TextInputLayout textInputLayout = this;
        AttributeSet attributeSet2 = attributeSet;
        int n42 = n3;
        int bl2 = DEF_STYLE_RES;
        Object object = context;
        object = MaterialThemeOverlay.wrap(context, attributeSet, n3, bl2);
        super((Context)object, attributeSet, n3);
        int n14 = -1;
        this.minEms = n14;
        this.maxEms = n14;
        this.minWidth = n14;
        this.maxWidth = n14;
        super(this);
        this.indicatorViewController = object;
        super();
        this.lengthCounter = object;
        super();
        this.tmpRect = object;
        super();
        this.tmpBoundsRect = object;
        super();
        this.tmpRectF = object;
        super();
        this.editTextAttachedListeners = object;
        super((View)this);
        this.collapsingTextHelper = object;
        int n15 = 0;
        this.globalLayoutListenerAdded = false;
        Object object2 = this.getContext();
        int n16 = 1;
        this.setOrientation(n16);
        this.setWillNotDraw(false);
        this.setAddStatesFromChildren(n16 != 0);
        this.inputFrame = frameLayout = new FrameLayout(object2);
        frameLayout.setAddStatesFromChildren(n16 != 0);
        Object object3 = AnimationUtils.LINEAR_INTERPOLATOR;
        ((CollapsingTextHelper)object).setTextSizeInterpolator((TimeInterpolator)object3);
        ((CollapsingTextHelper)object).setPositionInterpolator((TimeInterpolator)object3);
        ((CollapsingTextHelper)object).setCollapsedTextGravity(0x800033);
        Object object4 = R$styleable.TextInputLayout;
        int n17 = R$styleable.TextInputLayout_counterTextAppearance;
        int n18 = R$styleable.TextInputLayout_counterOverflowTextAppearance;
        int n19 = R$styleable.TextInputLayout_errorTextAppearance;
        int n20 = R$styleable.TextInputLayout_helperTextTextAppearance;
        int n21 = R$styleable.TextInputLayout_hintTextAppearance;
        int[] nArray = new int[]{n17, n18, n19, n20, n21};
        object = object2;
        object3 = attributeSet;
        n19 = n3;
        int n22 = bl2;
        object = ThemeEnforcement.obtainTintedStyledAttributes(object2, attributeSet, object4, n3, bl2, nArray);
        super(this, (Tn3)object);
        this.startLayout = object3;
        int n24 = R$styleable.TextInputLayout_hintEnabled;
        n24 = (int)(((Tn3)object).b.getBoolean(n24, n16 != 0) ? 1 : 0);
        this.hintEnabled = n24;
        n24 = R$styleable.TextInputLayout_android_hint;
        TypedArray typedArray = ((Tn3)object).b;
        object4 = typedArray.getText(n24);
        this.setHint((CharSequence)object4);
        n24 = R$styleable.TextInputLayout_hintAnimationEnabled;
        n24 = (int)(typedArray.getBoolean(n24, n16 != 0) ? 1 : 0);
        this.hintAnimationEnabled = n24;
        n24 = R$styleable.TextInputLayout_expandedHintEnabled;
        n24 = (int)(typedArray.getBoolean(n24, n16 != 0) ? 1 : 0);
        this.expandedHintEnabled = n24;
        n24 = R$styleable.TextInputLayout_android_minEms;
        n24 = (int)(typedArray.hasValue(n24) ? 1 : 0);
        if (n24 != 0) {
            n24 = R$styleable.TextInputLayout_android_minEms;
            n24 = typedArray.getInt(n24, n14);
            this.setMinEms(n24);
        } else {
            n24 = R$styleable.TextInputLayout_android_minWidth;
            if ((n24 = (int)(typedArray.hasValue(n24) ? 1 : 0)) != 0) {
                n24 = R$styleable.TextInputLayout_android_minWidth;
                n24 = typedArray.getDimensionPixelSize(n24, n14);
                this.setMinWidth(n24);
            }
        }
        n24 = R$styleable.TextInputLayout_android_maxEms;
        n24 = (int)(typedArray.hasValue(n24) ? 1 : 0);
        if (n24 != 0) {
            n24 = R$styleable.TextInputLayout_android_maxEms;
            n24 = typedArray.getInt(n24, n14);
            textInputLayout.setMaxEms(n24);
        } else {
            n24 = R$styleable.TextInputLayout_android_maxWidth;
            if ((n24 = (int)(typedArray.hasValue(n24) ? 1 : 0)) != 0) {
                n24 = R$styleable.TextInputLayout_android_maxWidth;
                n24 = typedArray.getDimensionPixelSize(n24, n14);
                textInputLayout.setMaxWidth(n24);
            }
        }
        object4 = ShapeAppearanceModel.builder(object2, attributeSet2, n42, bl2).build();
        textInputLayout.shapeAppearanceModel = object4;
        object4 = object2.getResources();
        int n25 = R$dimen.mtrl_textinput_box_label_cutout_padding;
        textInputLayout.boxLabelCutoutPaddingPx = n24 = object4.getDimensionPixelOffset(n25);
        n24 = R$styleable.TextInputLayout_boxCollapsedPaddingTop;
        textInputLayout.boxCollapsedPaddingTopPx = n24 = typedArray.getDimensionPixelOffset(n24, 0);
        n24 = R$styleable.TextInputLayout_boxStrokeWidth;
        Object object5 = object2.getResources();
        n21 = R$dimen.mtrl_textinput_box_stroke_width_default;
        int n26 = object5.getDimensionPixelSize(n21);
        textInputLayout.boxStrokeWidthDefaultPx = n24 = typedArray.getDimensionPixelSize(n24, n26);
        n24 = R$styleable.TextInputLayout_boxStrokeWidthFocused;
        object5 = object2.getResources();
        n21 = R$dimen.mtrl_textinput_box_stroke_width_focused;
        int n27 = object5.getDimensionPixelSize(n21);
        textInputLayout.boxStrokeWidthFocusedPx = n24 = typedArray.getDimensionPixelSize(n24, n27);
        textInputLayout.boxStrokeWidthPx = n24 = textInputLayout.boxStrokeWidthDefaultPx;
        n24 = R$styleable.TextInputLayout_boxCornerRadiusTopStart;
        int n28 = -1082130432;
        float f8 = -1.0f;
        float f11 = typedArray.getDimension(n24, f8);
        n21 = R$styleable.TextInputLayout_boxCornerRadiusTopEnd;
        float f12 = typedArray.getDimension(n21, f8);
        int n29 = R$styleable.TextInputLayout_boxCornerRadiusBottomEnd;
        float f14 = typedArray.getDimension(n29, f8);
        n42 = R$styleable.TextInputLayout_boxCornerRadiusBottomStart;
        f8 = typedArray.getDimension(n42, f8);
        ShapeAppearanceModel$Builder shapeAppearanceModel$Builder = textInputLayout.shapeAppearanceModel.toBuilder();
        boolean bl3 = false;
        float f15 = f11 - 0.0f;
        float f16 = f15 == 0.0f ? 0 : (f15 > 0.0f ? 1 : -1);
        if (f16 >= 0) {
            shapeAppearanceModel$Builder.setTopLeftCornerSize(f11);
        }
        if ((n24 = (int)((f7 = f12 - 0.0f) == 0.0f ? 0 : (f7 > 0.0f ? 1 : -1))) >= 0) {
            shapeAppearanceModel$Builder.setTopRightCornerSize(f12);
        }
        if ((n24 = (int)((f6 = f14 - 0.0f) == 0.0f ? 0 : (f6 > 0.0f ? 1 : -1))) >= 0) {
            shapeAppearanceModel$Builder.setBottomRightCornerSize(f14);
        }
        if ((n24 = (int)((f5 = f8 - 0.0f) == 0.0f ? 0 : (f5 > 0.0f ? 1 : -1))) >= 0) {
            shapeAppearanceModel$Builder.setBottomLeftCornerSize(f8);
        }
        object4 = shapeAppearanceModel$Builder.build();
        textInputLayout.shapeAppearanceModel = object4;
        n24 = R$styleable.TextInputLayout_boxBackgroundColor;
        object4 = MaterialResources.getColorStateList(object2, (Tn3)object, n24);
        if (object4 != null) {
            int n30;
            textInputLayout.defaultFilledBackgroundColor = n30 = object4.getDefaultColor();
            textInputLayout.boxBackgroundColor = n30;
            boolean bl4 = object4.isStateful();
            n21 = 16843623;
            f12 = 2.3696E-38f;
            n29 = -16842910;
            f14 = -1.6947497E38f;
            if (bl4) {
                int n32;
                int n34;
                object5 = new int[]{n29};
                textInputLayout.disabledFilledBackgroundColor = n34 = object4.getColorForState((int[])object5, n14);
                f8 = 2.3693995E-38f;
                n29 = 16842910;
                f14 = 2.3694E-38f;
                object5 = new int[]{16842908, n29};
                textInputLayout.focusedFilledBackgroundColor = n32 = object4.getColorForState((int[])object5, n14);
                object5 = new int[]{n21, n29};
                textInputLayout.hoveredFilledBackgroundColor = n24 = object4.getColorForState((int[])object5, n14);
            } else {
                int n35;
                textInputLayout.focusedFilledBackgroundColor = n24 = textInputLayout.defaultFilledBackgroundColor;
                n24 = R$color.mtrl_filled_background_color;
                object4 = t70.getColorStateList(object2, n24);
                object5 = new int[]{n29};
                textInputLayout.disabledFilledBackgroundColor = n35 = object4.getColorForState((int[])object5, n14);
                object5 = new int[]{n21};
                textInputLayout.hoveredFilledBackgroundColor = n24 = object4.getColorForState((int[])object5, n14);
            }
        } else {
            textInputLayout.boxBackgroundColor = 0;
            textInputLayout.defaultFilledBackgroundColor = 0;
            textInputLayout.disabledFilledBackgroundColor = 0;
            textInputLayout.focusedFilledBackgroundColor = 0;
            textInputLayout.hoveredFilledBackgroundColor = 0;
        }
        n24 = R$styleable.TextInputLayout_android_textColorHint;
        n24 = (int)(typedArray.hasValue(n24) ? 1 : 0);
        if (n24 != 0) {
            n24 = R$styleable.TextInputLayout_android_textColorHint;
            object4 = ((Tn3)object).a(n24);
            textInputLayout.focusedTextColor = (ColorStateList)object4;
            textInputLayout.defaultHintTextColor = (ColorStateList)object4;
        }
        n24 = R$styleable.TextInputLayout_boxStrokeColor;
        object4 = MaterialResources.getColorStateList(object2, (Tn3)object, n24);
        int n36 = R$styleable.TextInputLayout_boxStrokeColor;
        textInputLayout.focusedStrokeColor = n10 = typedArray.getColor(n36, 0);
        int n37 = R$color.mtrl_textinput_default_box_stroke_color;
        textInputLayout.defaultStrokeColor = n8 = t70.getColor(object2, n37);
        int n38 = R$color.mtrl_textinput_disabled_color;
        textInputLayout.disabledColor = n7 = t70.getColor(object2, n38);
        int n39 = R$color.mtrl_textinput_hovered_box_stroke_color;
        textInputLayout.hoveredStrokeColor = n4 = t70.getColor(object2, n39);
        if (object4 != null) {
            textInputLayout.setBoxStrokeColorStateList((ColorStateList)object4);
        }
        n24 = R$styleable.TextInputLayout_boxStrokeErrorColor;
        if ((n24 = (int)(typedArray.hasValue(n24) ? 1 : 0)) != 0) {
            n24 = R$styleable.TextInputLayout_boxStrokeErrorColor;
            object4 = MaterialResources.getColorStateList(object2, (Tn3)object, n24);
            textInputLayout.setBoxStrokeErrorColor((ColorStateList)object4);
        }
        n24 = R$styleable.TextInputLayout_hintTextAppearance;
        if ((n24 = typedArray.getResourceId(n24, n14)) != n14) {
            n24 = R$styleable.TextInputLayout_hintTextAppearance;
            n24 = typedArray.getResourceId(n24, 0);
            textInputLayout.setHintTextAppearance(n24);
        }
        n24 = R$styleable.TextInputLayout_cursorColor;
        object4 = ((Tn3)object).a(n24);
        textInputLayout.cursorColor = (ColorStateList)object4;
        n24 = R$styleable.TextInputLayout_cursorErrorColor;
        object4 = ((Tn3)object).a(n24);
        textInputLayout.cursorErrorColor = (ColorStateList)object4;
        n24 = R$styleable.TextInputLayout_errorTextAppearance;
        n24 = typedArray.getResourceId(n24, 0);
        int n41 = R$styleable.TextInputLayout_errorContentDescription;
        object5 = typedArray.getText(n41);
        n21 = R$styleable.TextInputLayout_errorAccessibilityLiveRegion;
        n21 = typedArray.getInt(n21, n16);
        n29 = R$styleable.TextInputLayout_errorEnabled;
        n29 = (int)(typedArray.getBoolean(n29, false) ? 1 : 0);
        n42 = R$styleable.TextInputLayout_helperTextTextAppearance;
        n42 = typedArray.getResourceId(n42, 0);
        int n43 = R$styleable.TextInputLayout_helperTextEnabled;
        boolean bl5 = typedArray.getBoolean(n43, false);
        int n44 = R$styleable.TextInputLayout_helperText;
        object2 = typedArray.getText(n44);
        f16 = R$styleable.TextInputLayout_placeholderTextAppearance;
        f16 = typedArray.getResourceId((int)f16, 0);
        n16 = R$styleable.TextInputLayout_placeholderText;
        CharSequence charSequence = typedArray.getText(n16);
        n14 = R$styleable.TextInputLayout_counterEnabled;
        n14 = (int)(typedArray.getBoolean(n14, false) ? 1 : 0);
        n15 = R$styleable.TextInputLayout_counterMaxLength;
        attributeSet = object2;
        n15 = typedArray.getInt(n15, -1);
        textInputLayout.setCounterMaxLength(n15);
        n15 = R$styleable.TextInputLayout_counterTextAppearance;
        n44 = 0;
        object2 = null;
        textInputLayout.counterTextAppearance = n15 = typedArray.getResourceId(n15, 0);
        n15 = R$styleable.TextInputLayout_counterOverflowTextAppearance;
        textInputLayout.counterOverflowTextAppearance = n15 = typedArray.getResourceId(n15, 0);
        n15 = R$styleable.TextInputLayout_boxBackgroundMode;
        n15 = typedArray.getInt(n15, 0);
        textInputLayout.setBoxBackgroundMode(n15);
        textInputLayout.setErrorContentDescription((CharSequence)object5);
        textInputLayout.setErrorAccessibilityLiveRegion(n21);
        int n45 = textInputLayout.counterOverflowTextAppearance;
        textInputLayout.setCounterOverflowTextAppearance(n45);
        textInputLayout.setHelperTextTextAppearance(n42);
        textInputLayout.setErrorTextAppearance(n24);
        n24 = textInputLayout.counterTextAppearance;
        textInputLayout.setCounterTextAppearance(n24);
        textInputLayout.setPlaceholderText(charSequence);
        textInputLayout.setPlaceholderTextAppearance((int)f16);
        n24 = R$styleable.TextInputLayout_errorTextColor;
        n24 = (int)(typedArray.hasValue(n24) ? 1 : 0);
        if (n24 != 0) {
            n24 = R$styleable.TextInputLayout_errorTextColor;
            object4 = ((Tn3)object).a(n24);
            textInputLayout.setErrorTextColor((ColorStateList)object4);
        }
        n24 = R$styleable.TextInputLayout_helperTextTextColor;
        if ((n24 = (int)(typedArray.hasValue(n24) ? 1 : 0)) != 0) {
            n24 = R$styleable.TextInputLayout_helperTextTextColor;
            object4 = ((Tn3)object).a(n24);
            textInputLayout.setHelperTextColor((ColorStateList)object4);
        }
        n24 = R$styleable.TextInputLayout_hintTextColor;
        if ((n24 = (int)(typedArray.hasValue(n24) ? 1 : 0)) != 0) {
            n24 = R$styleable.TextInputLayout_hintTextColor;
            object4 = ((Tn3)object).a(n24);
            textInputLayout.setHintTextColor((ColorStateList)object4);
        }
        n24 = R$styleable.TextInputLayout_counterTextColor;
        if ((n24 = (int)(typedArray.hasValue(n24) ? 1 : 0)) != 0) {
            n24 = R$styleable.TextInputLayout_counterTextColor;
            object4 = ((Tn3)object).a(n24);
            textInputLayout.setCounterTextColor((ColorStateList)object4);
        }
        n24 = R$styleable.TextInputLayout_counterOverflowTextColor;
        if ((n24 = (int)(typedArray.hasValue(n24) ? 1 : 0)) != 0) {
            n24 = R$styleable.TextInputLayout_counterOverflowTextColor;
            object4 = ((Tn3)object).a(n24);
            textInputLayout.setCounterOverflowTextColor((ColorStateList)object4);
        }
        n24 = R$styleable.TextInputLayout_placeholderTextColor;
        if ((n24 = (int)(typedArray.hasValue(n24) ? 1 : 0)) != 0) {
            n24 = R$styleable.TextInputLayout_placeholderTextColor;
            object4 = ((Tn3)object).a(n24);
            textInputLayout.setPlaceholderTextColor((ColorStateList)object4);
        }
        object4 = (Object)new EndCompoundLayout;
        super(textInputLayout, (Tn3)object);
        textInputLayout.endLayout = (EndCompoundLayout)((Object)object4);
        int n46 = R$styleable.TextInputLayout_android_enabled;
        n21 = 1;
        f12 = Float.MIN_VALUE;
        n19 = (int)(typedArray.getBoolean(n46, n21 != 0) ? 1 : 0);
        ((Tn3)object).g();
        object = ViewCompat.a;
        textInputLayout.setImportantForAccessibility(2);
        n17 = Build.VERSION.SDK_INT;
        int n47 = 26;
        f8 = 3.6E-44f;
        if (n17 >= n47 && n17 >= n47) {
            n17 = 1;
            ViewCompat$f.b((View)textInputLayout, n17);
        }
        frameLayout.addView((View)object3);
        frameLayout.addView((View)object4);
        textInputLayout.addView((View)frameLayout);
        textInputLayout.setEnabled(n19 != 0);
        textInputLayout.setHelperTextEnabled(bl5);
        textInputLayout.setErrorEnabled(n29 != 0);
        textInputLayout.setCounterEnabled(n14 != 0);
        object = attributeSet;
        textInputLayout.setHelperText((CharSequence)attributeSet);
    }

    public static /* synthetic */ void a(TextInputLayout textInputLayout) {
        textInputLayout.lambda$onGlobalLayout$1();
    }

    public static /* synthetic */ boolean access$000(TextInputLayout textInputLayout) {
        return textInputLayout.restoringSavedState;
    }

    public static /* synthetic */ boolean access$100(TextInputLayout textInputLayout) {
        return textInputLayout.placeholderEnabled;
    }

    public static /* synthetic */ void access$200(TextInputLayout textInputLayout, Editable editable) {
        textInputLayout.updatePlaceholderText(editable);
    }

    public static /* synthetic */ EndCompoundLayout access$300(TextInputLayout textInputLayout) {
        return textInputLayout.endLayout;
    }

    public static /* synthetic */ StartCompoundLayout access$400(TextInputLayout textInputLayout) {
        return textInputLayout.startLayout;
    }

    public static /* synthetic */ IndicatorViewController access$500(TextInputLayout textInputLayout) {
        return textInputLayout.indicatorViewController;
    }

    private void addPlaceholderTextView() {
        TextView textView = this.placeholderTextView;
        if (textView != null) {
            this.inputFrame.addView((View)textView);
            textView = this.placeholderTextView;
            textView.setVisibility(0);
        }
    }

    private void adjustFilledEditTextPaddingForLargeFont() {
        int n3;
        int n4;
        EditText editText = this.editText;
        if (editText != null && (n4 = this.boxBackgroundMode) == (n3 = 1)) {
            editText = this.getContext();
            n4 = (int)(MaterialResources.isFontScaleAtLeast2_0((Context)editText) ? 1 : 0);
            if (n4 != 0) {
                editText = this.editText;
                n3 = editText.getPaddingStart();
                Resources resources = this.getResources();
                int n7 = R$dimen.material_filled_edittext_font_2_0_padding_top;
                int n8 = resources.getDimensionPixelSize(n7);
                EditText editText2 = this.editText;
                n7 = editText2.getPaddingEnd();
                Resources resources2 = this.getResources();
                int n10 = R$dimen.material_filled_edittext_font_2_0_padding_bottom;
                int n14 = resources2.getDimensionPixelSize(n10);
                editText.setPaddingRelative(n3, n8, n7, n14);
            } else {
                editText = this.getContext();
                n4 = (int)(MaterialResources.isFontScaleAtLeast1_3((Context)editText) ? 1 : 0);
                if (n4 != 0) {
                    editText = this.editText;
                    n3 = editText.getPaddingStart();
                    Resources resources = this.getResources();
                    int n15 = R$dimen.material_filled_edittext_font_1_3_padding_top;
                    int n16 = resources.getDimensionPixelSize(n15);
                    EditText editText3 = this.editText;
                    n15 = editText3.getPaddingEnd();
                    Resources resources3 = this.getResources();
                    int n17 = R$dimen.material_filled_edittext_font_1_3_padding_bottom;
                    int n18 = resources3.getDimensionPixelSize(n17);
                    editText.setPaddingRelative(n3, n16, n15, n18);
                }
            }
        }
    }

    private void applyBoxAttributes() {
        int n3;
        Object object;
        Object object2 = this.boxBackground;
        if (object2 == null) {
            return;
        }
        if ((object2 = ((MaterialShapeDrawable)object2).getShapeAppearanceModel()) != (object = this.shapeAppearanceModel)) {
            object2 = this.boxBackground;
            ((MaterialShapeDrawable)object2).setShapeAppearanceModel((ShapeAppearanceModel)object);
        }
        if ((n3 = this.canDrawOutlineStroke()) != 0) {
            object2 = this.boxBackground;
            int n4 = this.boxStrokeWidthPx;
            float f5 = n4;
            int n7 = this.boxStrokeColor;
            ((MaterialShapeDrawable)object2).setStroke(f5, n7);
        }
        this.boxBackgroundColor = n3 = this.calculateBoxBackgroundColor();
        object = this.boxBackground;
        object2 = ColorStateList.valueOf((int)n3);
        ((MaterialShapeDrawable)object).setFillColor((ColorStateList)object2);
        this.applyBoxUnderlineAttributes();
        this.updateEditTextBoxBackgroundIfNeeded();
    }

    private void applyBoxUnderlineAttributes() {
        MaterialShapeDrawable materialShapeDrawable = this.boxUnderlineDefault;
        if (materialShapeDrawable != null && (materialShapeDrawable = this.boxUnderlineFocused) != null) {
            boolean bl2 = this.canDrawStroke();
            if (bl2) {
                materialShapeDrawable = this.boxUnderlineDefault;
                EditText editText = this.editText;
                int n3 = editText.isFocused();
                if (n3 != 0) {
                    n3 = this.defaultStrokeColor;
                    editText = ColorStateList.valueOf((int)n3);
                } else {
                    n3 = this.boxStrokeColor;
                    editText = ColorStateList.valueOf((int)n3);
                }
                materialShapeDrawable.setFillColor((ColorStateList)editText);
                materialShapeDrawable = this.boxUnderlineFocused;
                n3 = this.boxStrokeColor;
                editText = ColorStateList.valueOf((int)n3);
                materialShapeDrawable.setFillColor((ColorStateList)editText);
            }
            this.invalidate();
        }
    }

    private void applyCutoutPadding(RectF rectF) {
        float f5 = rectF.left;
        int n3 = this.boxLabelCutoutPaddingPx;
        float f6 = n3;
        rectF.left = f5 -= f6;
        f5 = rectF.right;
        float f7 = n3;
        rectF.right = f5 += f7;
    }

    /*
     * Enabled aggressive block sorting
     */
    private void assignBoxBackgroundByMode() {
        MaterialShapeDrawable materialShapeDrawable;
        int n3 = this.boxBackgroundMode;
        Object object = null;
        if (n3 == 0) {
            this.boxBackground = null;
            this.boxUnderlineDefault = null;
            this.boxUnderlineFocused = null;
            return;
        }
        int n4 = 1;
        if (n3 == n4) {
            MaterialShapeDrawable materialShapeDrawable2;
            object = this.shapeAppearanceModel;
            this.boxBackground = materialShapeDrawable2 = new MaterialShapeDrawable((ShapeAppearanceModel)object);
            this.boxUnderlineDefault = materialShapeDrawable2 = new MaterialShapeDrawable();
            this.boxUnderlineFocused = materialShapeDrawable2 = new MaterialShapeDrawable();
            return;
        }
        n4 = 2;
        if (n3 != n4) {
            object = new StringBuilder();
            object = g30.a(this.boxBackgroundMode, " is illegal; only @BoxBackgroundMode constants are supported.", (StringBuilder)object);
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException((String)object);
            throw illegalArgumentException;
        }
        n3 = (int)(this.hintEnabled ? 1 : 0);
        if (n3 != 0 && (n3 = (materialShapeDrawable = this.boxBackground) instanceof CutoutDrawable) == 0) {
            this.boxBackground = materialShapeDrawable = CutoutDrawable.create(this.shapeAppearanceModel);
        } else {
            ShapeAppearanceModel shapeAppearanceModel = this.shapeAppearanceModel;
            this.boxBackground = materialShapeDrawable = new MaterialShapeDrawable(shapeAppearanceModel);
        }
        this.boxUnderlineDefault = null;
        this.boxUnderlineFocused = null;
    }

    public static /* synthetic */ int b(Editable editable) {
        return TextInputLayout.lambda$new$0(editable);
    }

    private int calculateBoxBackgroundColor() {
        int n3 = this.boxBackgroundColor;
        int n4 = this.boxBackgroundMode;
        int n7 = 1;
        if (n4 == n7) {
            n3 = R$attr.colorSurface;
            n3 = MaterialColors.getColor((View)this, n3, 0);
            n4 = this.boxBackgroundColor;
            n3 = MaterialColors.layer(n3, n4);
        }
        return n3;
    }

    private Rect calculateCollapsedTextBounds(Rect object) {
        EditText editText = this.editText;
        if (editText != null) {
            int n3;
            editText = this.tmpBoundsRect;
            int n4 = ViewUtils.isLayoutRtl((View)this);
            editText.bottom = n3 = object.bottom;
            n3 = this.boxBackgroundMode;
            int n7 = 1;
            if (n3 != n7) {
                n7 = 2;
                if (n3 != n7) {
                    n3 = object.left;
                    editText.left = n3 = this.getLabelLeftBoundAlignedWithPrefixAndSuffix(n3, n4 != 0);
                    editText.top = n3 = this.getPaddingTop();
                    int n8 = object.right;
                    editText.right = n8 = this.getLabelRightBoundAlignedWithPrefixAndSuffix(n8, n4 != 0);
                    return editText;
                }
                n4 = object.left;
                editText.left = n3 = this.editText.getPaddingLeft() + n4;
                n4 = object.top;
                n3 = this.calculateLabelMarginTop();
                editText.top = n4 -= n3;
                int n10 = object.right;
                n4 = this.editText.getPaddingRight();
                editText.right = n10 -= n4;
                return editText;
            }
            n3 = object.left;
            editText.left = n3 = this.getLabelLeftBoundAlignedWithPrefixAndSuffix(n3, n4 != 0);
            n3 = object.top;
            n7 = this.boxCollapsedPaddingTopPx;
            editText.top = n3 += n7;
            int n14 = object.right;
            editText.right = n14 = this.getLabelRightBoundAlignedWithPrefixAndSuffix(n14, n4 != 0);
            return editText;
        }
        object = new IllegalStateException();
        throw object;
    }

    private int calculateExpandedLabelBottom(Rect rect, Rect rect2, float f5) {
        boolean bl2 = this.isSingleLineFilledTextField();
        if (bl2) {
            return (int)((float)rect2.top + f5);
        }
        int n3 = rect.bottom;
        int n4 = this.editText.getCompoundPaddingBottom();
        return n3 - n4;
    }

    private int calculateExpandedLabelTop(Rect rect, float f5) {
        boolean bl2 = this.isSingleLineFilledTextField();
        if (bl2) {
            float f6 = rect.centerY();
            return (int)(f6 - (f5 /= 2.0f));
        }
        int n3 = rect.top;
        return this.editText.getCompoundPaddingTop() + n3;
    }

    private Rect calculateExpandedTextBounds(Rect object) {
        EditText editText = this.editText;
        if (editText != null) {
            int n3;
            int n4;
            editText = this.tmpBoundsRect;
            float f5 = this.collapsingTextHelper.getExpandedTextHeight();
            int n7 = object.left;
            editText.left = n4 = this.editText.getCompoundPaddingLeft() + n7;
            editText.top = n7 = this.calculateExpandedLabelTop((Rect)object, f5);
            n7 = object.right;
            n4 = this.editText.getCompoundPaddingRight();
            editText.right = n7 -= n4;
            editText.bottom = n3 = this.calculateExpandedLabelBottom((Rect)object, (Rect)editText, f5);
            return editText;
        }
        object = new IllegalStateException();
        throw object;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private int calculateLabelMarginTop() {
        float f5;
        int n3 = this.hintEnabled;
        float f6 = 0.0f;
        if (n3 == 0) {
            return 0;
        }
        n3 = this.boxBackgroundMode;
        if (n3 != 0) {
            int n4 = 2;
            if (n3 != n4) {
                return 0;
            }
            CollapsingTextHelper collapsingTextHelper = this.collapsingTextHelper;
            f5 = collapsingTextHelper.getCollapsedTextHeight();
            f6 = 2.0f;
            f5 /= f6;
            return (int)f5;
        }
        CollapsingTextHelper collapsingTextHelper = this.collapsingTextHelper;
        f5 = collapsingTextHelper.getCollapsedTextHeight();
        return (int)f5;
    }

    private boolean canDrawOutlineStroke() {
        int n3 = this.boxBackgroundMode;
        int n4 = 2;
        n3 = n3 == n4 && (n3 = (int)(this.canDrawStroke() ? 1 : 0)) != 0 ? 1 : 0;
        return n3 != 0;
    }

    private boolean canDrawStroke() {
        int n3 = this.boxStrokeWidthPx;
        int n4 = -1;
        n3 = n3 > n4 && (n3 = this.boxStrokeColor) != 0 ? 1 : 0;
        return n3 != 0;
    }

    private void closeCutout() {
        boolean bl2 = this.cutoutEnabled();
        if (bl2) {
            CutoutDrawable cutoutDrawable = (CutoutDrawable)this.boxBackground;
            cutoutDrawable.removeCutout();
        }
    }

    private void collapseHint(boolean bl2) {
        CollapsingTextHelper collapsingTextHelper;
        int n3;
        ValueAnimator valueAnimator = this.animator;
        if (valueAnimator != null && (n3 = (int)(valueAnimator.isRunning() ? 1 : 0)) != 0) {
            valueAnimator = this.animator;
            valueAnimator.cancel();
        }
        n3 = 1065353216;
        float f5 = 1.0f;
        if (bl2 && (bl2 = this.hintAnimationEnabled)) {
            this.animateToExpansionFraction(f5);
        } else {
            collapsingTextHelper = this.collapsingTextHelper;
            collapsingTextHelper.setExpansionFraction(f5);
        }
        bl2 = false;
        collapsingTextHelper = null;
        this.hintExpanded = false;
        n3 = (int)(this.cutoutEnabled() ? 1 : 0);
        if (n3 != 0) {
            this.openCutout();
        }
        this.updatePlaceholderText();
        this.startLayout.onHintStateChanged(false);
        this.endLayout.onHintStateChanged(false);
    }

    private Fade createPlaceholderFadeTransition() {
        Fade fade = new Fade();
        Context context = this.getContext();
        int n3 = R$attr.motionDurationShort2;
        long l2 = MotionUtils.resolveThemeDuration(context, n3, 87);
        fade.setDuration(l2);
        context = this.getContext();
        n3 = R$attr.motionEasingLinearInterpolator;
        TimeInterpolator timeInterpolator = AnimationUtils.LINEAR_INTERPOLATOR;
        context = MotionUtils.resolveThemeInterpolator(context, n3, timeInterpolator);
        fade.setInterpolator((TimeInterpolator)context);
        return fade;
    }

    private boolean cutoutEnabled() {
        Object object;
        boolean bl2 = this.hintEnabled;
        if (bl2 && !(bl2 = TextUtils.isEmpty((CharSequence)(object = this.hint))) && (bl2 = (object = this.boxBackground) instanceof CutoutDrawable)) {
            bl2 = true;
        } else {
            bl2 = false;
            object = null;
        }
        return bl2;
    }

    private void dispatchOnEditTextAttached() {
        boolean bl2;
        Iterator iterator = ((AbstractCollection)this.editTextAttachedListeners).iterator();
        while (bl2 = iterator.hasNext()) {
            TextInputLayout$OnEditTextAttachedListener textInputLayout$OnEditTextAttachedListener = (TextInputLayout$OnEditTextAttachedListener)iterator.next();
            textInputLayout$OnEditTextAttachedListener.onEditTextAttached(this);
        }
    }

    private void drawBoxUnderline(Canvas canvas) {
        MaterialShapeDrawable materialShapeDrawable = this.boxUnderlineFocused;
        if (materialShapeDrawable != null && (materialShapeDrawable = this.boxUnderlineDefault) != null) {
            materialShapeDrawable.draw(canvas);
            materialShapeDrawable = this.editText;
            boolean bl2 = materialShapeDrawable.isFocused();
            if (bl2) {
                materialShapeDrawable = this.boxUnderlineFocused.getBounds();
                Rect rect = this.boxUnderlineDefault.getBounds();
                CollapsingTextHelper collapsingTextHelper = this.collapsingTextHelper;
                float f5 = collapsingTextHelper.getExpansionFraction();
                int n3 = rect.centerX();
                int n4 = rect.left;
                ((Rect)materialShapeDrawable).left = n4 = AnimationUtils.lerp(n3, n4, f5);
                int n7 = rect.right;
                ((Rect)materialShapeDrawable).right = n7 = AnimationUtils.lerp(n3, n7, f5);
                materialShapeDrawable = this.boxUnderlineFocused;
                materialShapeDrawable.draw(canvas);
            }
        }
    }

    private void drawHint(Canvas canvas) {
        boolean bl2 = this.hintEnabled;
        if (bl2) {
            CollapsingTextHelper collapsingTextHelper = this.collapsingTextHelper;
            collapsingTextHelper.draw(canvas);
        }
    }

    private void expandHint(boolean bl2) {
        Object object;
        boolean bl3;
        ValueAnimator valueAnimator = this.animator;
        if (valueAnimator != null && (bl3 = valueAnimator.isRunning())) {
            valueAnimator = this.animator;
            valueAnimator.cancel();
        }
        bl3 = false;
        valueAnimator = null;
        if (bl2 && (bl2 = this.hintAnimationEnabled)) {
            this.animateToExpansionFraction(0.0f);
        } else {
            object = this.collapsingTextHelper;
            ((CollapsingTextHelper)object).setExpansionFraction(0.0f);
        }
        bl2 = this.cutoutEnabled();
        if (bl2 && (bl2 = ((CutoutDrawable)(object = (CutoutDrawable)this.boxBackground)).hasCutout())) {
            this.closeCutout();
        }
        this.hintExpanded = bl2 = true;
        this.hidePlaceholderText();
        this.startLayout.onHintStateChanged(bl2);
        this.endLayout.onHintStateChanged(bl2);
    }

    private MaterialShapeDrawable getDropDownMaterialShapeDrawable(boolean bl2) {
        float f5;
        ShapeAppearanceModel shapeAppearanceModel;
        float f6;
        Object object = this.getResources();
        int n3 = R$dimen.mtrl_shape_corner_size_small_component;
        int n4 = object.getDimensionPixelOffset(n3);
        float f7 = n4;
        if (bl2) {
            f6 = f7;
        } else {
            bl2 = false;
            f6 = 0.0f;
            shapeAppearanceModel = null;
        }
        Object object2 = this.editText;
        int n7 = object2 instanceof MaterialAutoCompleteTextView;
        if (n7 != 0) {
            object2 = (MaterialAutoCompleteTextView)object2;
            f5 = ((MaterialAutoCompleteTextView)object2).getPopupElevation();
        } else {
            object2 = this.getResources();
            n7 = R$dimen.m3_comp_outlined_autocomplete_menu_container_elevation;
            n3 = object2.getDimensionPixelOffset(n7);
            f5 = n3;
        }
        Resources resources = this.getResources();
        int n8 = R$dimen.mtrl_exposed_dropdown_menu_popup_vertical_padding;
        n7 = resources.getDimensionPixelOffset(n8);
        ShapeAppearanceModel$Builder shapeAppearanceModel$Builder = ShapeAppearanceModel.builder().setTopLeftCornerSize(f6);
        shapeAppearanceModel = shapeAppearanceModel$Builder.setTopRightCornerSize(f6).setBottomLeftCornerSize(f7).setBottomRightCornerSize(f7).build();
        object = this.editText;
        n8 = object instanceof MaterialAutoCompleteTextView;
        if (n8 != 0) {
            object = ((MaterialAutoCompleteTextView)object).getDropDownBackgroundTintList();
        } else {
            n4 = 0;
            f7 = 0.0f;
            object = null;
        }
        object = MaterialShapeDrawable.createWithElevationOverlay(this.getContext(), f5, (ColorStateList)object);
        ((MaterialShapeDrawable)object).setShapeAppearanceModel(shapeAppearanceModel);
        ((MaterialShapeDrawable)object).setPadding(0, n7, 0, n7);
        return object;
    }

    private Drawable getEditTextBoxBackground() {
        int n3;
        EditText editText = this.editText;
        int n4 = editText instanceof AutoCompleteTextView;
        if (n4 != 0 && (n3 = EditTextUtils.isEditable(editText)) == 0) {
            editText = this.editText;
            n4 = R$attr.colorControlHighlight;
            n3 = MaterialColors.getColor((View)editText, n4);
            n4 = this.boxBackgroundMode;
            int n7 = 2;
            if (n4 == n7) {
                Context context = this.getContext();
                MaterialShapeDrawable materialShapeDrawable = this.boxBackground;
                int[][] nArray = EDIT_TEXT_BACKGROUND_RIPPLE_STATE;
                return TextInputLayout.getOutlinedBoxBackgroundWithRipple(context, materialShapeDrawable, n3, nArray);
            }
            n7 = 1;
            if (n4 == n7) {
                MaterialShapeDrawable materialShapeDrawable = this.boxBackground;
                n7 = this.boxBackgroundColor;
                int[][] nArray = EDIT_TEXT_BACKGROUND_RIPPLE_STATE;
                return TextInputLayout.getFilledBoxBackgroundWithRipple(materialShapeDrawable, n7, n3, nArray);
            }
            return null;
        }
        return this.boxBackground;
    }

    private static Drawable getFilledBoxBackgroundWithRipple(MaterialShapeDrawable materialShapeDrawable, int n3, int n4, int[][] nArray) {
        n4 = MaterialColors.layer(n4, n3, 0.1f);
        Object object = new int[]{n4, n3};
        ColorStateList colorStateList = new ColorStateList(nArray, object);
        object = new RippleDrawable;
        object(colorStateList, (Drawable)materialShapeDrawable, (Drawable)materialShapeDrawable);
        return object;
    }

    /*
     * WARNING - void declaration
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private int getLabelLeftBoundAlignedWithPrefixAndSuffix(int n3, boolean bl2) {
        Object object;
        void var2_4;
        CharSequence charSequence;
        if (!bl2 && (charSequence = this.getPrefixText()) != null) {
            StartCompoundLayout startCompoundLayout = this.startLayout;
            int n4 = startCompoundLayout.getPrefixTextStartOffset();
            return n3 + var2_4;
        }
        if (!bl2 || (object = this.getSuffixText()) == null) return this.editText.getCompoundPaddingLeft() + n3;
        object = this.endLayout;
        int n7 = ((EndCompoundLayout)((Object)object)).getSuffixTextEndOffset();
        return n3 + var2_4;
    }

    /*
     * WARNING - void declaration
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private int getLabelRightBoundAlignedWithPrefixAndSuffix(int n3, boolean bl2) {
        Object object;
        void var2_4;
        CharSequence charSequence;
        if (!bl2 && (charSequence = this.getSuffixText()) != null) {
            EndCompoundLayout endCompoundLayout = this.endLayout;
            int n4 = endCompoundLayout.getSuffixTextEndOffset();
            return n3 - var2_4;
        }
        if (bl2 && (object = this.getPrefixText()) != null) {
            object = this.startLayout;
            int n7 = ((StartCompoundLayout)((Object)object)).getPrefixTextStartOffset();
            return n3 - var2_4;
        }
        object = this.editText;
        int n8 = object.getCompoundPaddingRight();
        return n3 - var2_4;
    }

    private Drawable getOrCreateFilledDropDownMenuBackground() {
        StateListDrawable stateListDrawable = this.filledDropDownMenuBackground;
        if (stateListDrawable == null) {
            this.filledDropDownMenuBackground = stateListDrawable = new StateListDrawable();
            Object object = new int[]{0x10100AA};
            Object object2 = this.getOrCreateOutlinedDropDownMenuBackground();
            stateListDrawable.addState(object, object2);
            stateListDrawable = this.filledDropDownMenuBackground;
            object2 = new int[0];
            object = this.getDropDownMaterialShapeDrawable(false);
            stateListDrawable.addState((int[])object2, (Drawable)object);
        }
        return this.filledDropDownMenuBackground;
    }

    private Drawable getOrCreateOutlinedDropDownMenuBackground() {
        MaterialShapeDrawable materialShapeDrawable = this.outlinedDropDownMenuBackground;
        if (materialShapeDrawable == null) {
            boolean bl2 = true;
            this.outlinedDropDownMenuBackground = materialShapeDrawable = this.getDropDownMaterialShapeDrawable(bl2);
        }
        return this.outlinedDropDownMenuBackground;
    }

    private static Drawable getOutlinedBoxBackgroundWithRipple(Context object, MaterialShapeDrawable materialShapeDrawable, int n3, int[][] object2) {
        int n4 = R$attr.colorSurface;
        int n7 = MaterialColors.getColor((Context)object, n4, LOG_TAG);
        ShapeAppearanceModel shapeAppearanceModel = materialShapeDrawable.getShapeAppearanceModel();
        MaterialShapeDrawable materialShapeDrawable2 = new MaterialShapeDrawable(shapeAppearanceModel);
        n3 = MaterialColors.layer(n3, n7, 0.1f);
        int[] nArray = new int[]{n3, 0};
        ColorStateList colorStateList = new ColorStateList(object2, nArray);
        materialShapeDrawable2.setFillColor(colorStateList);
        materialShapeDrawable2.setTint(n7);
        object = new int[]{n3, n7};
        ColorStateList colorStateList2 = new ColorStateList(object2, (int[])object);
        object2 = materialShapeDrawable.getShapeAppearanceModel();
        object = new MaterialShapeDrawable((ShapeAppearanceModel)object2);
        ((MaterialShapeDrawable)object).setTint(-1);
        object2 = new RippleDrawable;
        object2(colorStateList2, (Drawable)materialShapeDrawable2, (Drawable)object);
        object = new Drawable[]{object2, materialShapeDrawable};
        materialShapeDrawable = new LayerDrawable((Drawable[])object);
        return materialShapeDrawable;
    }

    private void hidePlaceholderText() {
        int n3;
        TextView textView = this.placeholderTextView;
        if (textView != null && (n3 = this.placeholderEnabled) != 0) {
            textView.setText(null);
            textView = this.inputFrame;
            Fade fade = this.placeholderFadeOut;
            g.a((ViewGroup)textView, fade);
            textView = this.placeholderTextView;
            n3 = 4;
            textView.setVisibility(n3);
        }
    }

    private boolean isOnError() {
        TextView textView;
        boolean bl2 = this.shouldShowError();
        if (!(bl2 || (textView = this.counterView) != null && (bl2 = this.counterOverflowed))) {
            bl2 = false;
            textView = null;
        } else {
            bl2 = true;
        }
        return bl2;
    }

    private boolean isSingleLineFilledTextField() {
        EditText editText;
        int n3 = this.boxBackgroundMode;
        int n4 = 1;
        if (n3 != n4 || (n3 = (editText = this.editText).getMinLines()) > n4) {
            n4 = 0;
        }
        return n4 != 0;
    }

    private static /* synthetic */ int lambda$new$0(Editable editable) {
        int n3;
        if (editable != null) {
            n3 = editable.length();
        } else {
            n3 = 0;
            editable = null;
        }
        return n3;
    }

    private /* synthetic */ void lambda$onGlobalLayout$1() {
        this.editText.requestLayout();
    }

    private void onApplyBoxBackgroundMode() {
        this.assignBoxBackgroundByMode();
        this.updateEditTextBoxBackgroundIfNeeded();
        this.updateTextInputBoxState();
        this.updateBoxCollapsedPaddingTop();
        this.adjustFilledEditTextPaddingForLargeFont();
        int n3 = this.boxBackgroundMode;
        if (n3 != 0) {
            this.updateInputLayoutMargins();
        }
        this.setDropDownMenuBackgroundIfNeeded();
    }

    private void openCutout() {
        float f5;
        boolean bl2 = this.cutoutEnabled();
        if (!bl2) {
            return;
        }
        RectF rectF = this.tmpRectF;
        Object object = this.collapsingTextHelper;
        int n3 = this.editText.getWidth();
        EditText editText = this.editText;
        int n4 = editText.getGravity();
        ((CollapsingTextHelper)object).getCollapsedTextActualBounds(rectF, n3, n4);
        float f6 = rectF.width();
        n3 = 0;
        float f7 = 0.0f;
        float f8 = f6 - 0.0f;
        float f11 = f8 == 0.0f ? 0 : (f8 < 0.0f ? -1 : 1);
        if (f11 > 0 && (f11 = (f5 = (f6 = rectF.height()) - 0.0f) == 0.0f ? 0 : (f5 < 0.0f ? -1 : 1)) > 0) {
            this.applyCutoutPadding(rectF);
            f11 = -this.getPaddingLeft();
            f6 = f11;
            n3 = -this.getPaddingTop();
            f7 = n3;
            float f12 = rectF.height();
            float f14 = 2.0f;
            f7 -= (f12 /= f14);
            n4 = this.boxStrokeWidthPx;
            f12 = n4;
            rectF.offset(f6, f7 += f12);
            object = (CutoutDrawable)this.boxBackground;
            ((CutoutDrawable)object).setCutout(rectF);
        }
    }

    private void recalculateCutout() {
        boolean bl2 = this.cutoutEnabled();
        if (bl2 && !(bl2 = this.hintExpanded)) {
            this.closeCutout();
            this.openCutout();
        }
    }

    private static void recursiveSetEnabled(ViewGroup viewGroup, boolean bl2) {
        int n3 = viewGroup.getChildCount();
        for (int i3 = 0; i3 < n3; ++i3) {
            View view = viewGroup.getChildAt(i3);
            view.setEnabled(bl2);
            boolean bl3 = view instanceof ViewGroup;
            if (!bl3) continue;
            view = (ViewGroup)view;
            TextInputLayout.recursiveSetEnabled((ViewGroup)view, bl2);
        }
    }

    private void removePlaceholderTextView() {
        TextView textView = this.placeholderTextView;
        if (textView != null) {
            int n3 = 8;
            textView.setVisibility(n3);
        }
    }

    private void setDropDownMenuBackgroundIfNeeded() {
        EditText editText = this.editText;
        int n3 = editText instanceof AutoCompleteTextView;
        if (n3 == 0) {
            return;
        }
        Drawable drawable2 = (editText = (AutoCompleteTextView)editText).getDropDownBackground();
        if (drawable2 == null) {
            n3 = this.boxBackgroundMode;
            int n4 = 2;
            if (n3 == n4) {
                drawable2 = this.getOrCreateOutlinedDropDownMenuBackground();
                editText.setDropDownBackgroundDrawable(drawable2);
            } else {
                n4 = 1;
                if (n3 == n4) {
                    drawable2 = this.getOrCreateFilledDropDownMenuBackground();
                    editText.setDropDownBackgroundDrawable(drawable2);
                }
            }
        }
    }

    private void setEditText(EditText object) {
        EditText editText = this.editText;
        if (editText == null) {
            int n3;
            int n4 = this.getEndIconMode();
            if (n4 != (n3 = 3)) {
                n4 = object instanceof TextInputEditText;
            }
            this.editText = object;
            n4 = this.minEms;
            n3 = -1;
            if (n4 != n3) {
                this.setMinEms(n4);
            } else {
                n4 = this.minWidth;
                this.setMinWidth(n4);
            }
            n4 = this.maxEms;
            if (n4 != n3) {
                this.setMaxEms(n4);
            } else {
                n4 = this.maxWidth;
                this.setMaxWidth(n4);
            }
            n4 = 0;
            editText = null;
            this.boxBackgroundApplied = false;
            this.onApplyBoxBackgroundMode();
            Object object2 = new TextInputLayout$AccessibilityDelegate(this);
            this.setTextInputAccessibilityDelegate((TextInputLayout$AccessibilityDelegate)object2);
            object2 = this.collapsingTextHelper;
            Object object3 = this.editText.getTypeface();
            ((CollapsingTextHelper)object2).setTypefaces((Typeface)object3);
            object2 = this.collapsingTextHelper;
            float f5 = this.editText.getTextSize();
            ((CollapsingTextHelper)object2).setExpandedTextSize(f5);
            n3 = Build.VERSION.SDK_INT;
            object3 = this.collapsingTextHelper;
            float f6 = this.editText.getLetterSpacing();
            ((CollapsingTextHelper)object3).setExpandedLetterSpacing(f6);
            int n7 = this.editText.getGravity();
            Object object4 = this.collapsingTextHelper;
            int n8 = n7 & 0xFFFFFF8F | 0x30;
            ((CollapsingTextHelper)object4).setCollapsedTextGravity(n8);
            this.collapsingTextHelper.setExpandedTextGravity(n7);
            object3 = ViewCompat.a;
            this.originalEditTextMinimumHeight = n7 = object.getMinimumHeight();
            object3 = this.editText;
            object4 = new TextInputLayout$1(this, (EditText)object);
            object3.addTextChangedListener((TextWatcher)object4);
            object3 = this.defaultHintTextColor;
            if (object3 == null) {
                object3 = this.editText.getHintTextColors();
                this.defaultHintTextColor = object3;
            }
            n7 = (int)(this.hintEnabled ? 1 : 0);
            boolean bl2 = true;
            f6 = Float.MIN_VALUE;
            if (n7 != 0) {
                object3 = this.hint;
                n7 = (int)(TextUtils.isEmpty((CharSequence)object3) ? 1 : 0);
                if (n7 != 0) {
                    this.originalHint = object3 = this.editText.getHint();
                    this.setHint((CharSequence)object3);
                    object3 = this.editText;
                    n8 = 0;
                    object3.setHint(null);
                }
                this.isProvidingHint = bl2;
            }
            n7 = 29;
            f5 = 4.1E-44f;
            if (n3 >= n7) {
                this.updateCursorColor();
            }
            if ((object2 = this.counterView) != null) {
                object2 = this.editText.getText();
                this.updateCounter((Editable)object2);
            }
            this.updateEditTextBackground();
            this.indicatorViewController.adjustIndicatorPadding();
            this.startLayout.bringToFront();
            this.endLayout.bringToFront();
            this.dispatchOnEditTextAttached();
            object2 = this.endLayout;
            ((EndCompoundLayout)((Object)object2)).updateSuffixTextViewPadding();
            n3 = (int)(this.isEnabled() ? 1 : 0);
            if (n3 == 0) {
                object.setEnabled(false);
            }
            this.updateLabelState(false, bl2);
            return;
        }
        object = new IllegalArgumentException("We already have an EditText, can only have one");
        throw object;
    }

    private void setHintInternal(CharSequence charSequence) {
        Object object = this.hint;
        boolean bl2 = TextUtils.equals((CharSequence)charSequence, (CharSequence)object);
        if (!bl2) {
            this.hint = charSequence;
            object = this.collapsingTextHelper;
            ((CollapsingTextHelper)object).setText(charSequence);
            boolean bl3 = this.hintExpanded;
            if (!bl3) {
                this.openCutout();
            }
        }
    }

    private void setPlaceholderTextEnabled(boolean bl2) {
        boolean bl3 = this.placeholderEnabled;
        if (bl3 == bl2) {
            return;
        }
        if (bl2) {
            this.addPlaceholderTextView();
        } else {
            this.removePlaceholderTextView();
            bl3 = false;
            this.placeholderTextView = null;
        }
        this.placeholderEnabled = bl2;
    }

    private boolean shouldUpdateEndDummyDrawable() {
        Object object = this.endLayout;
        boolean bl2 = object.isErrorIconVisible();
        if ((bl2 || (bl2 = (object = this.endLayout).hasEndIcon()) && (bl2 = (boolean)this.isEndIconVisible()) || (object = this.endLayout.getSuffixText()) != null) && (bl2 = (object = this.endLayout).getMeasuredWidth()) > false) {
            bl2 = true;
        } else {
            bl2 = false;
            object = null;
        }
        return bl2;
    }

    private boolean shouldUpdateStartDummyDrawable() {
        boolean bl2;
        Object object = this.getStartIconDrawable();
        if ((object != null || (object = this.getPrefixText()) != null && !(bl2 = (object = this.getPrefixTextView()).getVisibility())) && (bl2 = (object = this.startLayout).getMeasuredWidth()) > false) {
            bl2 = true;
        } else {
            bl2 = false;
            object = null;
        }
        return bl2;
    }

    private void showPlaceholderText() {
        boolean bl2;
        Object object = this.placeholderTextView;
        if (object != null && (bl2 = this.placeholderEnabled) && !(bl2 = TextUtils.isEmpty((CharSequence)(object = this.placeholderText)))) {
            object = this.placeholderTextView;
            Object object2 = this.placeholderText;
            object.setText((CharSequence)object2);
            object = this.inputFrame;
            object2 = this.placeholderFadeIn;
            g.a((ViewGroup)object, (Transition)object2);
            object = this.placeholderTextView;
            object2 = null;
            object.setVisibility(0);
            this.placeholderTextView.bringToFront();
            object = this.placeholderText;
            this.announceForAccessibility((CharSequence)object);
        }
    }

    private void updateBoxCollapsedPaddingTop() {
        int n3 = this.boxBackgroundMode;
        int n4 = 1;
        if (n3 == n4) {
            Context context = this.getContext();
            n3 = (int)(MaterialResources.isFontScaleAtLeast2_0(context) ? 1 : 0);
            if (n3 != 0) {
                context = this.getResources();
                n4 = R$dimen.material_font_2_0_box_collapsed_padding_top;
                this.boxCollapsedPaddingTopPx = n3 = context.getDimensionPixelSize(n4);
            } else {
                context = this.getContext();
                n3 = (int)(MaterialResources.isFontScaleAtLeast1_3(context) ? 1 : 0);
                if (n3 != 0) {
                    context = this.getResources();
                    n4 = R$dimen.material_font_1_3_box_collapsed_padding_top;
                    this.boxCollapsedPaddingTopPx = n3 = context.getDimensionPixelSize(n4);
                }
            }
        }
    }

    private void updateBoxUnderlineBounds(Rect rect) {
        int n3;
        int n4;
        int n7;
        MaterialShapeDrawable materialShapeDrawable = this.boxUnderlineDefault;
        if (materialShapeDrawable != null) {
            n7 = rect.bottom;
            n4 = this.boxStrokeWidthDefaultPx;
            n4 = n7 - n4;
            n3 = rect.left;
            int n8 = rect.right;
            materialShapeDrawable.setBounds(n3, n4, n8, n7);
        }
        if ((materialShapeDrawable = this.boxUnderlineFocused) != null) {
            n7 = rect.bottom;
            n4 = this.boxStrokeWidthFocusedPx;
            n4 = n7 - n4;
            n3 = rect.left;
            int n10 = rect.right;
            materialShapeDrawable.setBounds(n3, n4, n10, n7);
        }
    }

    private void updateCounter() {
        Object object = this.counterView;
        if (object != null) {
            object = this.editText;
            object = object == null ? null : object.getText();
            this.updateCounter((Editable)object);
        }
    }

    /*
     * WARNING - void declaration
     */
    private static void updateCounterContentDescription(Context object, TextView textView, int n3, int n4, boolean bl2) {
        void var4_7;
        if (bl2) {
            int n7 = R$string.character_counter_overflowed_content_description;
        } else {
            int n8 = R$string.character_counter_content_description;
        }
        Integer n10 = n3;
        Integer n14 = n4;
        Object[] objectArray = new Object[]{n10, n14};
        object = object.getString((int)var4_7, objectArray);
        textView.setContentDescription((CharSequence)object);
    }

    private void updateCounterTextAppearanceAndColor() {
        TextView textView = this.counterView;
        if (textView != null) {
            TextView textView2;
            int n3 = this.counterOverflowed;
            n3 = n3 != 0 ? this.counterOverflowTextAppearance : this.counterTextAppearance;
            this.setTextAppearanceCompatWithErrorFallback(textView, n3);
            boolean bl2 = this.counterOverflowed;
            if (!bl2 && (textView = this.counterTextColor) != null) {
                textView2 = this.counterView;
                textView2.setTextColor((ColorStateList)textView);
            }
            if ((bl2 = this.counterOverflowed) && (textView = this.counterOverflowTextColor) != null) {
                textView2 = this.counterView;
                textView2.setTextColor((ColorStateList)textView);
            }
        }
    }

    private void updateCursorColor() {
        ColorStateList colorStateList = this.cursorColor;
        if (colorStateList == null) {
            colorStateList = this.getContext();
            int n3 = R$attr.colorControlActivated;
            colorStateList = MaterialColors.getColorStateListOrNull((Context)colorStateList, n3);
        }
        EditText editText = this.editText;
        if (editText != null && (editText = z11.a(editText)) != null) {
            ColorStateList colorStateList2;
            editText = ut0_0.h(z11.a(this.editText)).mutate();
            boolean bl2 = this.isOnError();
            if (bl2 && (colorStateList2 = this.cursorErrorColor) != null) {
                colorStateList = colorStateList2;
            }
            editText.setTintList(colorStateList);
        }
    }

    private void updateEditTextBoxBackground() {
        Drawable drawable2 = this.getEditTextBoxBackground();
        EditText editText = this.editText;
        editText.setBackground(drawable2);
    }

    private boolean updateEditTextHeightBasedOnIcon() {
        Object object = this.editText;
        if (object == null) {
            return false;
        }
        object = this.endLayout;
        int n3 = object.getMeasuredHeight();
        int n4 = this.startLayout.getMeasuredHeight();
        n3 = Math.max(n3, n4);
        EditText editText = this.editText;
        n4 = editText.getMeasuredHeight();
        if (n4 < n3) {
            this.editText.setMinimumHeight(n3);
            return true;
        }
        return false;
    }

    private void updateInputLayoutMargins() {
        int n3 = this.boxBackgroundMode;
        int n4 = 1;
        if (n3 != n4) {
            int n7;
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams)this.inputFrame.getLayoutParams();
            n4 = this.calculateLabelMarginTop();
            if (n4 != (n7 = layoutParams.topMargin)) {
                layoutParams.topMargin = n4;
                layoutParams = this.inputFrame;
                layoutParams.requestLayout();
            }
        }
    }

    private void updateLabelState(boolean bl2, boolean bl3) {
        Object object;
        int n3;
        boolean bl4;
        int n4 = this.isEnabled();
        EditText editText = this.editText;
        boolean bl5 = false;
        int n7 = 1;
        if (editText != null && !(bl4 = TextUtils.isEmpty((CharSequence)(editText = editText.getText())))) {
            bl4 = true;
        } else {
            bl4 = false;
            editText = null;
        }
        Object object2 = this.editText;
        if (object2 != null && (n3 = object2.hasFocus()) != 0) {
            bl5 = true;
        }
        if ((object = this.defaultHintTextColor) != null) {
            object2 = this.collapsingTextHelper;
            ((CollapsingTextHelper)object2).setCollapsedAndExpandedTextColor((ColorStateList)object);
        }
        if (n4 == 0) {
            ColorStateList colorStateList = this.defaultHintTextColor;
            if (colorStateList != null) {
                n7 = -16842910;
                object = new int[]{n7};
                n3 = this.disabledColor;
                n4 = colorStateList.getColorForState((int[])object, n3);
            } else {
                n4 = this.disabledColor;
            }
            object = this.collapsingTextHelper;
            colorStateList = ColorStateList.valueOf((int)n4);
            ((CollapsingTextHelper)object).setCollapsedAndExpandedTextColor(colorStateList);
        } else {
            n4 = this.shouldShowError();
            if (n4 != 0) {
                CollapsingTextHelper collapsingTextHelper = this.collapsingTextHelper;
                object = this.indicatorViewController.getErrorViewTextColors();
                collapsingTextHelper.setCollapsedAndExpandedTextColor((ColorStateList)object);
            } else {
                TextView textView;
                n4 = (int)(this.counterOverflowed ? 1 : 0);
                if (n4 != 0 && (textView = this.counterView) != null) {
                    object = this.collapsingTextHelper;
                    textView = textView.getTextColors();
                    ((CollapsingTextHelper)object).setCollapsedAndExpandedTextColor((ColorStateList)textView);
                } else if (bl5 && (textView = this.focusedTextColor) != null) {
                    object = this.collapsingTextHelper;
                    ((CollapsingTextHelper)object).setCollapsedTextColor((ColorStateList)textView);
                }
            }
        }
        if (!(bl4 || (n4 = (int)(this.expandedHintEnabled ? 1 : 0)) == 0 || (n4 = (int)(this.isEnabled() ? 1 : 0)) != 0 && bl5)) {
            if (bl3 || !(bl3 = this.hintExpanded)) {
                this.expandHint(bl2);
            }
        } else if (bl3 || (bl3 = this.hintExpanded)) {
            this.collapseHint(bl2);
        }
    }

    private void updatePlaceholderMeasurementsBasedOnEditText() {
        TextView textView = this.placeholderTextView;
        if (textView != null && (textView = this.editText) != null) {
            int n3 = textView.getGravity();
            this.placeholderTextView.setGravity(n3);
            textView = this.placeholderTextView;
            EditText editText = this.editText;
            int n4 = editText.getCompoundPaddingLeft();
            EditText editText2 = this.editText;
            int n7 = editText2.getCompoundPaddingTop();
            EditText editText3 = this.editText;
            int n8 = editText3.getCompoundPaddingRight();
            EditText editText4 = this.editText;
            int n10 = editText4.getCompoundPaddingBottom();
            textView.setPadding(n4, n7, n8, n10);
        }
    }

    private void updatePlaceholderText() {
        Object object = this.editText;
        object = object == null ? null : object.getText();
        this.updatePlaceholderText((Editable)object);
    }

    private void updatePlaceholderText(Editable editable) {
        TextInputLayout$LengthCounter textInputLayout$LengthCounter = this.lengthCounter;
        int n3 = textInputLayout$LengthCounter.countLength(editable);
        if (n3 == 0 && (n3 = (int)(this.hintExpanded ? 1 : 0)) == 0) {
            this.showPlaceholderText();
        } else {
            this.hidePlaceholderText();
        }
    }

    private void updateStrokeErrorColor(boolean bl2, boolean bl3) {
        ColorStateList colorStateList = this.strokeErrorColor;
        int n3 = colorStateList.getDefaultColor();
        ColorStateList colorStateList2 = this.strokeErrorColor;
        int n4 = 16842910;
        Object object = new int[]{16843623, n4};
        int n7 = colorStateList2.getColorForState(object, n3);
        object = this.strokeErrorColor;
        int n8 = 16843518;
        int[] nArray = new int[]{n8, n4};
        int n10 = object.getColorForState(nArray, n3);
        this.boxStrokeColor = bl2 ? n10 : (bl3 ? n7 : n3);
    }

    public void addOnEditTextAttachedListener(TextInputLayout$OnEditTextAttachedListener textInputLayout$OnEditTextAttachedListener) {
        ((AbstractCollection)this.editTextAttachedListeners).add(textInputLayout$OnEditTextAttachedListener);
        EditText editText = this.editText;
        if (editText != null) {
            textInputLayout$OnEditTextAttachedListener.onEditTextAttached(this);
        }
    }

    public void addOnEndIconChangedListener(TextInputLayout$OnEndIconChangedListener textInputLayout$OnEndIconChangedListener) {
        this.endLayout.addOnEndIconChangedListener(textInputLayout$OnEndIconChangedListener);
    }

    public void addView(View view, int n3, ViewGroup.LayoutParams layoutParams) {
        int n4 = view instanceof EditText;
        if (n4 != 0) {
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams);
            layoutParams2.gravity = n4 = layoutParams2.gravity & 0xFFFFFF8F | 0x10;
            FrameLayout frameLayout = this.inputFrame;
            frameLayout.addView(view, (ViewGroup.LayoutParams)layoutParams2);
            layoutParams2 = this.inputFrame;
            layoutParams2.setLayoutParams(layoutParams);
            this.updateInputLayoutMargins();
            view = (EditText)view;
            this.setEditText((EditText)view);
        } else {
            super.addView(view, n3, layoutParams);
        }
    }

    public void animateToExpansionFraction(float f5) {
        CollapsingTextHelper collapsingTextHelper = this.collapsingTextHelper;
        float f6 = collapsingTextHelper.getExpansionFraction();
        float f7 = f6 - f5;
        Object object = f7 == 0.0f ? 0 : (f7 > 0.0f ? 1 : -1);
        if (object == false) {
            return;
        }
        collapsingTextHelper = this.animator;
        if (collapsingTextHelper == null) {
            collapsingTextHelper = new ValueAnimator();
            this.animator = collapsingTextHelper;
            Object object2 = this.getContext();
            int n3 = R$attr.motionEasingEmphasizedInterpolator;
            TimeInterpolator timeInterpolator = AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR;
            object2 = MotionUtils.resolveThemeInterpolator(object2, n3, timeInterpolator);
            collapsingTextHelper.setInterpolator((TimeInterpolator)object2);
            collapsingTextHelper = this.animator;
            object2 = this.getContext();
            n3 = R$attr.motionDurationMedium4;
            int n4 = 167;
            int n7 = MotionUtils.resolveThemeDuration(object2, n3, n4);
            long l2 = n7;
            collapsingTextHelper.setDuration(l2);
            collapsingTextHelper = this.animator;
            object2 = new TextInputLayout$3(this);
            collapsingTextHelper.addUpdateListener((ValueAnimator.AnimatorUpdateListener)object2);
        }
        collapsingTextHelper = this.animator;
        float f8 = this.collapsingTextHelper.getExpansionFraction();
        float[] fArray = new float[]{f8, f5};
        collapsingTextHelper.setFloatValues(fArray);
        this.animator.start();
    }

    public void clearOnEditTextAttachedListeners() {
        ((AbstractCollection)this.editTextAttachedListeners).clear();
    }

    public void clearOnEndIconChangedListeners() {
        this.endLayout.clearOnEndIconChangedListeners();
    }

    public boolean cutoutIsOpen() {
        CutoutDrawable cutoutDrawable;
        boolean bl2 = this.cutoutEnabled();
        if (bl2 && (bl2 = (cutoutDrawable = (CutoutDrawable)this.boxBackground).hasCutout())) {
            bl2 = true;
        } else {
            bl2 = false;
            cutoutDrawable = null;
        }
        return bl2;
    }

    public void dispatchProvideAutofillStructure(ViewStructure viewStructure, int n3) {
        block5: {
            CharSequence charSequence;
            Object object;
            block4: {
                object = this.editText;
                if (object == null) {
                    super.dispatchProvideAutofillStructure(viewStructure, n3);
                    return;
                }
                charSequence = this.originalHint;
                EditText editText = null;
                if (charSequence == null) break block4;
                boolean bl2 = this.isProvidingHint;
                this.isProvidingHint = false;
                object = object.getHint();
                editText = this.editText;
                CharSequence charSequence2 = this.originalHint;
                editText.setHint(charSequence2);
                try {
                    super.dispatchProvideAutofillStructure(viewStructure, n3);
                    viewStructure = this.editText;
                }
                catch (Throwable throwable) {
                    this.editText.setHint((CharSequence)object);
                    this.isProvidingHint = bl2;
                    throw throwable;
                }
                viewStructure.setHint((CharSequence)object);
                this.isProvidingHint = bl2;
                break block5;
            }
            object = this.getAutofillId();
            viewStructure.setAutofillId((AutofillId)object);
            this.onProvideAutofillStructure(viewStructure, n3);
            this.onProvideAutofillVirtualStructure(viewStructure, n3);
            object = this.inputFrame;
            int n4 = object.getChildCount();
            viewStructure.setChildCount(n4);
            for (int i3 = 0; i3 < (n4 = (object = this.inputFrame).getChildCount()); ++i3) {
                object = this.inputFrame.getChildAt(i3);
                charSequence = viewStructure.newChild(i3);
                object.dispatchProvideAutofillStructure((ViewStructure)charSequence, n3);
                EditText editText = this.editText;
                if (object != editText) continue;
                object = this.getHint();
                charSequence.setHint((CharSequence)object);
            }
        }
    }

    public void dispatchRestoreInstanceState(SparseArray sparseArray) {
        this.restoringSavedState = true;
        super.dispatchRestoreInstanceState(sparseArray);
        this.restoringSavedState = false;
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        this.drawHint(canvas);
        this.drawBoxUnderline(canvas);
    }

    public void drawableStateChanged() {
        boolean bl2;
        boolean bl3 = this.inDrawableStateChanged;
        if (bl3) {
            return;
        }
        this.inDrawableStateChanged = bl3 = true;
        super.drawableStateChanged();
        int[] nArray = this.getDrawableState();
        Object object = this.collapsingTextHelper;
        if (object != null) {
            bl2 = ((CollapsingTextHelper)object).setState(nArray);
        } else {
            bl2 = false;
            nArray = null;
        }
        object = this.editText;
        if (object != null) {
            object = ViewCompat.a;
            boolean bl4 = this.isLaidOut();
            if (!bl4 || !(bl4 = this.isEnabled())) {
                bl3 = false;
            }
            this.updateLabelState(bl3);
        }
        this.updateEditTextBackground();
        this.updateTextInputBoxState();
        if (bl2) {
            this.invalidate();
        }
        this.inDrawableStateChanged = false;
    }

    public int getBaseline() {
        EditText editText = this.editText;
        if (editText != null) {
            int n3 = editText.getBaseline();
            int n4 = this.getPaddingTop() + n3;
            n3 = this.calculateLabelMarginTop();
            return n4 + n3;
        }
        return super.getBaseline();
    }

    public MaterialShapeDrawable getBoxBackground() {
        int n3 = this.boxBackgroundMode;
        int n4 = 1;
        if (n3 != n4 && n3 != (n4 = 2)) {
            IllegalStateException illegalStateException = new IllegalStateException();
            throw illegalStateException;
        }
        return this.boxBackground;
    }

    public int getBoxBackgroundColor() {
        return this.boxBackgroundColor;
    }

    public int getBoxBackgroundMode() {
        return this.boxBackgroundMode;
    }

    public int getBoxCollapsedPaddingTop() {
        return this.boxCollapsedPaddingTopPx;
    }

    public float getBoxCornerRadiusBottomEnd() {
        float f5;
        boolean bl2 = ViewUtils.isLayoutRtl((View)this);
        if (bl2) {
            CornerSize cornerSize = this.shapeAppearanceModel.getBottomLeftCornerSize();
            RectF rectF = this.tmpRectF;
            f5 = cornerSize.getCornerSize(rectF);
        } else {
            CornerSize cornerSize = this.shapeAppearanceModel.getBottomRightCornerSize();
            RectF rectF = this.tmpRectF;
            f5 = cornerSize.getCornerSize(rectF);
        }
        return f5;
    }

    public float getBoxCornerRadiusBottomStart() {
        float f5;
        boolean bl2 = ViewUtils.isLayoutRtl((View)this);
        if (bl2) {
            CornerSize cornerSize = this.shapeAppearanceModel.getBottomRightCornerSize();
            RectF rectF = this.tmpRectF;
            f5 = cornerSize.getCornerSize(rectF);
        } else {
            CornerSize cornerSize = this.shapeAppearanceModel.getBottomLeftCornerSize();
            RectF rectF = this.tmpRectF;
            f5 = cornerSize.getCornerSize(rectF);
        }
        return f5;
    }

    public float getBoxCornerRadiusTopEnd() {
        float f5;
        boolean bl2 = ViewUtils.isLayoutRtl((View)this);
        if (bl2) {
            CornerSize cornerSize = this.shapeAppearanceModel.getTopLeftCornerSize();
            RectF rectF = this.tmpRectF;
            f5 = cornerSize.getCornerSize(rectF);
        } else {
            CornerSize cornerSize = this.shapeAppearanceModel.getTopRightCornerSize();
            RectF rectF = this.tmpRectF;
            f5 = cornerSize.getCornerSize(rectF);
        }
        return f5;
    }

    public float getBoxCornerRadiusTopStart() {
        float f5;
        boolean bl2 = ViewUtils.isLayoutRtl((View)this);
        if (bl2) {
            CornerSize cornerSize = this.shapeAppearanceModel.getTopRightCornerSize();
            RectF rectF = this.tmpRectF;
            f5 = cornerSize.getCornerSize(rectF);
        } else {
            CornerSize cornerSize = this.shapeAppearanceModel.getTopLeftCornerSize();
            RectF rectF = this.tmpRectF;
            f5 = cornerSize.getCornerSize(rectF);
        }
        return f5;
    }

    public int getBoxStrokeColor() {
        return this.focusedStrokeColor;
    }

    public ColorStateList getBoxStrokeErrorColor() {
        return this.strokeErrorColor;
    }

    public int getBoxStrokeWidth() {
        return this.boxStrokeWidthDefaultPx;
    }

    public int getBoxStrokeWidthFocused() {
        return this.boxStrokeWidthFocusedPx;
    }

    public int getCounterMaxLength() {
        return this.counterMaxLength;
    }

    public CharSequence getCounterOverflowDescription() {
        TextView textView;
        boolean bl2 = this.counterEnabled;
        if (bl2 && (bl2 = this.counterOverflowed) && (textView = this.counterView) != null) {
            return textView.getContentDescription();
        }
        return null;
    }

    public ColorStateList getCounterOverflowTextColor() {
        return this.counterOverflowTextColor;
    }

    public ColorStateList getCounterTextColor() {
        return this.counterTextColor;
    }

    public ColorStateList getCursorColor() {
        return this.cursorColor;
    }

    public ColorStateList getCursorErrorColor() {
        return this.cursorErrorColor;
    }

    public ColorStateList getDefaultHintTextColor() {
        return this.defaultHintTextColor;
    }

    public EditText getEditText() {
        return this.editText;
    }

    public CharSequence getEndIconContentDescription() {
        return this.endLayout.getEndIconContentDescription();
    }

    public Drawable getEndIconDrawable() {
        return this.endLayout.getEndIconDrawable();
    }

    public int getEndIconMinSize() {
        return this.endLayout.getEndIconMinSize();
    }

    public int getEndIconMode() {
        return this.endLayout.getEndIconMode();
    }

    public ImageView.ScaleType getEndIconScaleType() {
        return this.endLayout.getEndIconScaleType();
    }

    public CheckableImageButton getEndIconView() {
        return this.endLayout.getEndIconView();
    }

    public CharSequence getError() {
        Object object = this.indicatorViewController;
        boolean bl2 = ((IndicatorViewController)object).isErrorEnabled();
        if (bl2) {
            object = this.indicatorViewController.getErrorText();
        } else {
            bl2 = false;
            object = null;
        }
        return object;
    }

    public int getErrorAccessibilityLiveRegion() {
        return this.indicatorViewController.getErrorAccessibilityLiveRegion();
    }

    public CharSequence getErrorContentDescription() {
        return this.indicatorViewController.getErrorContentDescription();
    }

    public int getErrorCurrentTextColors() {
        return this.indicatorViewController.getErrorViewCurrentTextColor();
    }

    public Drawable getErrorIconDrawable() {
        return this.endLayout.getErrorIconDrawable();
    }

    public CharSequence getHelperText() {
        Object object = this.indicatorViewController;
        boolean bl2 = ((IndicatorViewController)object).isHelperTextEnabled();
        if (bl2) {
            object = this.indicatorViewController.getHelperText();
        } else {
            bl2 = false;
            object = null;
        }
        return object;
    }

    public int getHelperTextCurrentTextColor() {
        return this.indicatorViewController.getHelperTextViewCurrentTextColor();
    }

    public CharSequence getHint() {
        CharSequence charSequence;
        boolean bl2 = this.hintEnabled;
        if (bl2) {
            charSequence = this.hint;
        } else {
            bl2 = false;
            charSequence = null;
        }
        return charSequence;
    }

    public final float getHintCollapsedTextHeight() {
        return this.collapsingTextHelper.getCollapsedTextHeight();
    }

    public final int getHintCurrentCollapsedTextColor() {
        return this.collapsingTextHelper.getCurrentCollapsedTextColor();
    }

    public ColorStateList getHintTextColor() {
        return this.focusedTextColor;
    }

    public TextInputLayout$LengthCounter getLengthCounter() {
        return this.lengthCounter;
    }

    public int getMaxEms() {
        return this.maxEms;
    }

    public int getMaxWidth() {
        return this.maxWidth;
    }

    public int getMinEms() {
        return this.minEms;
    }

    public int getMinWidth() {
        return this.minWidth;
    }

    public CharSequence getPasswordVisibilityToggleContentDescription() {
        return this.endLayout.getPasswordVisibilityToggleContentDescription();
    }

    public Drawable getPasswordVisibilityToggleDrawable() {
        return this.endLayout.getPasswordVisibilityToggleDrawable();
    }

    public CharSequence getPlaceholderText() {
        CharSequence charSequence;
        boolean bl2 = this.placeholderEnabled;
        if (bl2) {
            charSequence = this.placeholderText;
        } else {
            bl2 = false;
            charSequence = null;
        }
        return charSequence;
    }

    public int getPlaceholderTextAppearance() {
        return this.placeholderTextAppearance;
    }

    public ColorStateList getPlaceholderTextColor() {
        return this.placeholderTextColor;
    }

    public CharSequence getPrefixText() {
        return this.startLayout.getPrefixText();
    }

    public ColorStateList getPrefixTextColor() {
        return this.startLayout.getPrefixTextColor();
    }

    public TextView getPrefixTextView() {
        return this.startLayout.getPrefixTextView();
    }

    public ShapeAppearanceModel getShapeAppearanceModel() {
        return this.shapeAppearanceModel;
    }

    public CharSequence getStartIconContentDescription() {
        return this.startLayout.getStartIconContentDescription();
    }

    public Drawable getStartIconDrawable() {
        return this.startLayout.getStartIconDrawable();
    }

    public int getStartIconMinSize() {
        return this.startLayout.getStartIconMinSize();
    }

    public ImageView.ScaleType getStartIconScaleType() {
        return this.startLayout.getStartIconScaleType();
    }

    public CharSequence getSuffixText() {
        return this.endLayout.getSuffixText();
    }

    public ColorStateList getSuffixTextColor() {
        return this.endLayout.getSuffixTextColor();
    }

    public TextView getSuffixTextView() {
        return this.endLayout.getSuffixTextView();
    }

    public Typeface getTypeface() {
        return this.typeface;
    }

    public boolean isCounterEnabled() {
        return this.counterEnabled;
    }

    public boolean isEndIconCheckable() {
        return this.endLayout.isEndIconCheckable();
    }

    public boolean isEndIconVisible() {
        return this.endLayout.isEndIconVisible();
    }

    public boolean isErrorEnabled() {
        return this.indicatorViewController.isErrorEnabled();
    }

    public boolean isExpandedHintEnabled() {
        return this.expandedHintEnabled;
    }

    public final boolean isHelperTextDisplayed() {
        return this.indicatorViewController.helperTextIsDisplayed();
    }

    public boolean isHelperTextEnabled() {
        return this.indicatorViewController.isHelperTextEnabled();
    }

    public boolean isHintAnimationEnabled() {
        return this.hintAnimationEnabled;
    }

    public boolean isHintEnabled() {
        return this.hintEnabled;
    }

    public final boolean isHintExpanded() {
        return this.hintExpanded;
    }

    public boolean isPasswordVisibilityToggleEnabled() {
        return this.endLayout.isPasswordVisibilityToggleEnabled();
    }

    public boolean isProvidingHint() {
        return this.isProvidingHint;
    }

    public boolean isStartIconCheckable() {
        return this.startLayout.isStartIconCheckable();
    }

    public boolean isStartIconVisible() {
        return this.startLayout.isStartIconVisible();
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.collapsingTextHelper.maybeUpdateFontWeightAdjustment(configuration);
    }

    public void onGlobalLayout() {
        this.endLayout.getViewTreeObserver().removeOnGlobalLayoutListener((ViewTreeObserver.OnGlobalLayoutListener)this);
        EditText editText = null;
        this.globalLayoutListenerAdded = false;
        boolean bl2 = this.updateEditTextHeightBasedOnIcon();
        boolean bl3 = this.updateDummyDrawables();
        if (bl2 || bl3) {
            editText = this.editText;
            wl3_0 wl3_02 = new wl3_0(this);
            editText.post((Runnable)wl3_02);
        }
    }

    /*
     * WARNING - void declaration
     */
    public void onLayout(boolean bl2, int n3, int n4, int n7, int n8) {
        void var5_9;
        int n10;
        void var3_7;
        void var2_6;
        super.onLayout(bl2, (int)var2_6, (int)var3_7, n10, (int)var5_9);
        Object object = this.editText;
        if (object != null) {
            Rect rect = this.tmpRect;
            DescendantOffsetUtils.getDescendantRect((ViewGroup)this, (View)object, rect);
            this.updateBoxUnderlineBounds(rect);
            boolean bl3 = this.hintEnabled;
            if (bl3) {
                boolean bl4;
                object = this.collapsingTextHelper;
                float f5 = this.editText.getTextSize();
                ((CollapsingTextHelper)object).setExpandedTextSize(f5);
                int n14 = this.editText.getGravity();
                CollapsingTextHelper collapsingTextHelper = this.collapsingTextHelper;
                n10 = n14 & 0xFFFFFF8F | 0x30;
                collapsingTextHelper.setCollapsedTextGravity(n10);
                this.collapsingTextHelper.setExpandedTextGravity(n14);
                object = this.collapsingTextHelper;
                collapsingTextHelper = this.calculateCollapsedTextBounds(rect);
                ((CollapsingTextHelper)object).setCollapsedBounds((Rect)collapsingTextHelper);
                object = this.collapsingTextHelper;
                rect = this.calculateExpandedTextBounds(rect);
                ((CollapsingTextHelper)object).setExpandedBounds(rect);
                object = this.collapsingTextHelper;
                ((CollapsingTextHelper)object).recalculate();
                boolean bl5 = this.cutoutEnabled();
                if (bl5 && !(bl4 = this.hintExpanded)) {
                    this.openCutout();
                }
            }
        }
    }

    public void onMeasure(int n3, int n4) {
        super.onMeasure(n3, n4);
        n3 = (int)(this.globalLayoutListenerAdded ? 1 : 0);
        if (n3 == 0) {
            ViewTreeObserver viewTreeObserver = this.endLayout.getViewTreeObserver();
            viewTreeObserver.addOnGlobalLayoutListener((ViewTreeObserver.OnGlobalLayoutListener)this);
            n3 = 1;
            this.globalLayoutListenerAdded = n3;
        }
        this.updatePlaceholderMeasurementsBasedOnEditText();
        this.endLayout.updateSuffixTextViewPadding();
    }

    public void onRestoreInstanceState(Parcelable object) {
        boolean bl2 = object instanceof TextInputLayout$SavedState;
        if (!bl2) {
            super.onRestoreInstanceState(object);
            return;
        }
        object = (TextInputLayout$SavedState)object;
        Object object2 = object.getSuperState();
        super.onRestoreInstanceState(object2);
        object2 = object.error;
        this.setError((CharSequence)object2);
        boolean bl3 = object.isEndIconChecked;
        if (bl3) {
            object = new TextInputLayout$2(this);
            this.post((Runnable)object);
        }
        this.requestLayout();
    }

    public void onRtlPropertiesChanged(int n3) {
        super.onRtlPropertiesChanged(n3);
        int n4 = 1;
        if (n3 != n4) {
            n4 = 0;
        }
        n3 = (int)(this.areCornerRadiiRtl ? 1 : 0);
        if (n4 != n3) {
            Object object = this.shapeAppearanceModel.getTopLeftCornerSize();
            Object object2 = this.tmpRectF;
            float f5 = object.getCornerSize((RectF)object2);
            object2 = this.shapeAppearanceModel.getTopRightCornerSize();
            Object object3 = this.tmpRectF;
            float f6 = object2.getCornerSize((RectF)object3);
            object3 = this.shapeAppearanceModel.getBottomLeftCornerSize();
            Object object4 = this.tmpRectF;
            float f7 = object3.getCornerSize((RectF)object4);
            object4 = this.shapeAppearanceModel.getBottomRightCornerSize();
            Object object5 = this.tmpRectF;
            float f8 = object4.getCornerSize((RectF)object5);
            object5 = this.shapeAppearanceModel.getTopLeftCorner();
            Object object6 = this.shapeAppearanceModel.getTopRightCorner();
            CornerTreatment cornerTreatment = this.shapeAppearanceModel.getBottomLeftCorner();
            CornerTreatment cornerTreatment2 = this.shapeAppearanceModel.getBottomRightCorner();
            ShapeAppearanceModel$Builder shapeAppearanceModel$Builder = ShapeAppearanceModel.builder();
            object6 = shapeAppearanceModel$Builder.setTopLeftCorner((CornerTreatment)object6);
            object5 = ((ShapeAppearanceModel$Builder)object6).setTopRightCorner((CornerTreatment)object5).setBottomLeftCorner(cornerTreatment2).setBottomRightCorner(cornerTreatment);
            object2 = ((ShapeAppearanceModel$Builder)object5).setTopLeftCornerSize(f6);
            object = ((ShapeAppearanceModel$Builder)object2).setTopRightCornerSize(f5).setBottomLeftCornerSize(f8).setBottomRightCornerSize(f7).build();
            this.areCornerRadiiRtl = n4;
            this.setShapeAppearanceModel((ShapeAppearanceModel)object);
        }
    }

    public Parcelable onSaveInstanceState() {
        Object object = super.onSaveInstanceState();
        TextInputLayout$SavedState textInputLayout$SavedState = new TextInputLayout$SavedState((Parcelable)object);
        boolean bl2 = this.shouldShowError();
        if (bl2) {
            object = this.getError();
            textInputLayout$SavedState.error = object;
        }
        textInputLayout$SavedState.isEndIconChecked = bl2 = this.endLayout.isEndIconChecked();
        return textInputLayout$SavedState;
    }

    public void passwordVisibilityToggleRequested(boolean bl2) {
        this.endLayout.togglePasswordVisibilityToggle(bl2);
    }

    public void refreshEndIconDrawableState() {
        this.endLayout.refreshEndIconDrawableState();
    }

    public void refreshErrorIconDrawableState() {
        this.endLayout.refreshErrorIconDrawableState();
    }

    public void refreshStartIconDrawableState() {
        this.startLayout.refreshStartIconDrawableState();
    }

    public void removeOnEditTextAttachedListener(TextInputLayout$OnEditTextAttachedListener textInputLayout$OnEditTextAttachedListener) {
        ((AbstractCollection)this.editTextAttachedListeners).remove(textInputLayout$OnEditTextAttachedListener);
    }

    public void removeOnEndIconChangedListener(TextInputLayout$OnEndIconChangedListener textInputLayout$OnEndIconChangedListener) {
        this.endLayout.removeOnEndIconChangedListener(textInputLayout$OnEndIconChangedListener);
    }

    public void setBoxBackgroundColor(int n3) {
        int n4 = this.boxBackgroundColor;
        if (n4 != n3) {
            this.boxBackgroundColor = n3;
            this.defaultFilledBackgroundColor = n3;
            this.focusedFilledBackgroundColor = n3;
            this.hoveredFilledBackgroundColor = n3;
            this.applyBoxAttributes();
        }
    }

    public void setBoxBackgroundColorResource(int n3) {
        n3 = t70.getColor(this.getContext(), n3);
        this.setBoxBackgroundColor(n3);
    }

    public void setBoxBackgroundColorStateList(ColorStateList colorStateList) {
        int n3;
        int n4;
        this.defaultFilledBackgroundColor = n4 = colorStateList.getDefaultColor();
        this.boxBackgroundColor = n4;
        int[] nArray = new int[]{-16842910};
        int n7 = -1;
        this.disabledFilledBackgroundColor = n4 = colorStateList.getColorForState(nArray, n7);
        int n8 = 16842910;
        nArray = new int[]{16842908, n8};
        this.focusedFilledBackgroundColor = n4 = colorStateList.getColorForState(nArray, n7);
        nArray = new int[]{16843623, n8};
        this.hoveredFilledBackgroundColor = n3 = colorStateList.getColorForState(nArray, n7);
        this.applyBoxAttributes();
    }

    public void setBoxBackgroundMode(int n3) {
        int n4 = this.boxBackgroundMode;
        if (n3 == n4) {
            return;
        }
        this.boxBackgroundMode = n3;
        EditText editText = this.editText;
        if (editText != null) {
            this.onApplyBoxBackgroundMode();
        }
    }

    public void setBoxCollapsedPaddingTop(int n3) {
        this.boxCollapsedPaddingTopPx = n3;
    }

    public void setBoxCornerFamily(int n3) {
        ShapeAppearanceModel shapeAppearanceModel;
        ShapeAppearanceModel$Builder shapeAppearanceModel$Builder = this.shapeAppearanceModel.toBuilder();
        CornerSize cornerSize = this.shapeAppearanceModel.getTopLeftCornerSize();
        shapeAppearanceModel$Builder = shapeAppearanceModel$Builder.setTopLeftCorner(n3, cornerSize);
        cornerSize = this.shapeAppearanceModel.getTopRightCornerSize();
        shapeAppearanceModel$Builder = shapeAppearanceModel$Builder.setTopRightCorner(n3, cornerSize);
        cornerSize = this.shapeAppearanceModel.getBottomLeftCornerSize();
        shapeAppearanceModel$Builder = shapeAppearanceModel$Builder.setBottomLeftCorner(n3, cornerSize);
        cornerSize = this.shapeAppearanceModel.getBottomRightCornerSize();
        this.shapeAppearanceModel = shapeAppearanceModel = shapeAppearanceModel$Builder.setBottomRightCorner(n3, cornerSize).build();
        this.applyBoxAttributes();
    }

    public void setBoxCornerRadii(float f5, float f6, float f7, float f8) {
        float f11;
        float f12;
        float f14;
        float f15;
        float f16;
        boolean bl2;
        this.areCornerRadiiRtl = bl2 = ViewUtils.isLayoutRtl((View)this);
        float f17 = bl2 ? f6 : f5;
        if (!bl2) {
            f5 = f6;
        }
        f6 = bl2 ? f8 : f7;
        if (!bl2) {
            f7 = f8;
        }
        Object object = this.boxBackground;
        if (object == null || (f16 = (f15 = (f8 = ((MaterialShapeDrawable)object).getTopLeftCornerResolvedSize()) - f17) == 0.0f ? 0 : (f15 > 0.0f ? 1 : -1)) != false || (f16 = (f14 = (f8 = ((MaterialShapeDrawable)(object = this.boxBackground)).getTopRightCornerResolvedSize()) - f5) == 0.0f ? 0 : (f14 > 0.0f ? 1 : -1)) != false || (f16 = (f12 = (f8 = ((MaterialShapeDrawable)(object = this.boxBackground)).getBottomLeftCornerResolvedSize()) - f6) == 0.0f ? 0 : (f12 > 0.0f ? 1 : -1)) != false || (f16 = (f11 = (f8 = ((MaterialShapeDrawable)(object = this.boxBackground)).getBottomRightCornerResolvedSize()) - f7) == 0.0f ? 0 : (f11 > 0.0f ? 1 : -1)) != false) {
            ShapeAppearanceModel shapeAppearanceModel;
            object = this.shapeAppearanceModel.toBuilder().setTopLeftCornerSize(f17);
            this.shapeAppearanceModel = shapeAppearanceModel = ((ShapeAppearanceModel$Builder)object).setTopRightCornerSize(f5).setBottomLeftCornerSize(f6).setBottomRightCornerSize(f7).build();
            this.applyBoxAttributes();
        }
    }

    public void setBoxCornerRadiiResources(int n3, int n4, int n7, int n8) {
        float f5 = this.getContext().getResources().getDimension(n3);
        float f6 = this.getContext().getResources().getDimension(n4);
        float f7 = this.getContext().getResources().getDimension(n8);
        float f8 = this.getContext().getResources().getDimension(n7);
        this.setBoxCornerRadii(f5, f6, f7, f8);
    }

    public void setBoxStrokeColor(int n3) {
        int n4 = this.focusedStrokeColor;
        if (n4 != n3) {
            this.focusedStrokeColor = n3;
            this.updateTextInputBoxState();
        }
    }

    public void setBoxStrokeColorStateList(ColorStateList colorStateList) {
        int n3 = colorStateList.isStateful();
        if (n3 != 0) {
            int n4;
            this.defaultStrokeColor = n3 = colorStateList.getDefaultColor();
            int[] nArray = new int[]{-16842910};
            int n7 = -1;
            this.disabledColor = n3 = colorStateList.getColorForState(nArray, n7);
            int n8 = 16842910;
            nArray = new int[]{16843623, n8};
            this.hoveredStrokeColor = n3 = colorStateList.getColorForState(nArray, n7);
            n3 = 16842908;
            nArray = new int[]{n3, n8};
            this.focusedStrokeColor = n4 = colorStateList.getColorForState(nArray, n7);
        } else {
            n3 = this.focusedStrokeColor;
            int n10 = colorStateList.getDefaultColor();
            if (n3 != n10) {
                int n14;
                this.focusedStrokeColor = n14 = colorStateList.getDefaultColor();
            }
        }
        this.updateTextInputBoxState();
    }

    public void setBoxStrokeErrorColor(ColorStateList colorStateList) {
        ColorStateList colorStateList2 = this.strokeErrorColor;
        if (colorStateList2 != colorStateList) {
            this.strokeErrorColor = colorStateList;
            this.updateTextInputBoxState();
        }
    }

    public void setBoxStrokeWidth(int n3) {
        this.boxStrokeWidthDefaultPx = n3;
        this.updateTextInputBoxState();
    }

    public void setBoxStrokeWidthFocused(int n3) {
        this.boxStrokeWidthFocusedPx = n3;
        this.updateTextInputBoxState();
    }

    public void setBoxStrokeWidthFocusedResource(int n3) {
        n3 = this.getResources().getDimensionPixelSize(n3);
        this.setBoxStrokeWidthFocused(n3);
    }

    public void setBoxStrokeWidthResource(int n3) {
        n3 = this.getResources().getDimensionPixelSize(n3);
        this.setBoxStrokeWidth(n3);
    }

    public void setCounterEnabled(boolean n3) {
        int n4 = this.counterEnabled;
        if (n4 != n3) {
            n4 = 2;
            if (n3) {
                Context context = this.getContext();
                Object object = new AppCompatTextView(context);
                this.counterView = object;
                int n7 = R$id.textinput_counter;
                object.setId(n7);
                object = this.typeface;
                if (object != null) {
                    context = this.counterView;
                    context.setTypeface((Typeface)object);
                }
                this.counterView.setMaxLines(1);
                object = this.indicatorViewController;
                context = this.counterView;
                ((IndicatorViewController)object).addIndicator((TextView)context, n4);
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams)this.counterView.getLayoutParams();
                object = this.getResources();
                n7 = R$dimen.mtrl_textinput_counter_margin_start;
                int n8 = object.getDimensionPixelOffset(n7);
                marginLayoutParams.setMarginStart(n8);
                this.updateCounterTextAppearanceAndColor();
                this.updateCounter();
            } else {
                IndicatorViewController indicatorViewController = this.indicatorViewController;
                TextView textView = this.counterView;
                indicatorViewController.removeIndicator(textView, n4);
                n4 = 0;
                Object var6_9 = null;
                this.counterView = null;
            }
            this.counterEnabled = n3;
        }
    }

    public void setCounterMaxLength(int n3) {
        int n4 = this.counterMaxLength;
        if (n4 != n3) {
            this.counterMaxLength = n3 > 0 ? n3 : (n3 = -1);
            n3 = (int)(this.counterEnabled ? 1 : 0);
            if (n3 != 0) {
                this.updateCounter();
            }
        }
    }

    public void setCounterOverflowTextAppearance(int n3) {
        int n4 = this.counterOverflowTextAppearance;
        if (n4 != n3) {
            this.counterOverflowTextAppearance = n3;
            this.updateCounterTextAppearanceAndColor();
        }
    }

    public void setCounterOverflowTextColor(ColorStateList colorStateList) {
        ColorStateList colorStateList2 = this.counterOverflowTextColor;
        if (colorStateList2 != colorStateList) {
            this.counterOverflowTextColor = colorStateList;
            this.updateCounterTextAppearanceAndColor();
        }
    }

    public void setCounterTextAppearance(int n3) {
        int n4 = this.counterTextAppearance;
        if (n4 != n3) {
            this.counterTextAppearance = n3;
            this.updateCounterTextAppearanceAndColor();
        }
    }

    public void setCounterTextColor(ColorStateList colorStateList) {
        ColorStateList colorStateList2 = this.counterTextColor;
        if (colorStateList2 != colorStateList) {
            this.counterTextColor = colorStateList;
            this.updateCounterTextAppearanceAndColor();
        }
    }

    public void setCursorColor(ColorStateList colorStateList) {
        ColorStateList colorStateList2 = this.cursorColor;
        if (colorStateList2 != colorStateList) {
            this.cursorColor = colorStateList;
            this.updateCursorColor();
        }
    }

    public void setCursorErrorColor(ColorStateList colorStateList) {
        ColorStateList colorStateList2 = this.cursorErrorColor;
        if (colorStateList2 != colorStateList) {
            this.cursorErrorColor = colorStateList;
            boolean bl2 = this.isOnError();
            if (bl2) {
                this.updateCursorColor();
            }
        }
    }

    public void setDefaultHintTextColor(ColorStateList colorStateList) {
        this.defaultHintTextColor = colorStateList;
        this.focusedTextColor = colorStateList;
        colorStateList = this.editText;
        if (colorStateList != null) {
            colorStateList = null;
            this.updateLabelState(false);
        }
    }

    public void setEnabled(boolean bl2) {
        TextInputLayout.recursiveSetEnabled((ViewGroup)this, bl2);
        super.setEnabled(bl2);
    }

    public void setEndIconActivated(boolean bl2) {
        this.endLayout.setEndIconActivated(bl2);
    }

    public void setEndIconCheckable(boolean bl2) {
        this.endLayout.setEndIconCheckable(bl2);
    }

    public void setEndIconContentDescription(int n3) {
        this.endLayout.setEndIconContentDescription(n3);
    }

    public void setEndIconContentDescription(CharSequence charSequence) {
        this.endLayout.setEndIconContentDescription(charSequence);
    }

    public void setEndIconDrawable(int n3) {
        this.endLayout.setEndIconDrawable(n3);
    }

    public void setEndIconDrawable(Drawable drawable2) {
        this.endLayout.setEndIconDrawable(drawable2);
    }

    public void setEndIconMinSize(int n3) {
        this.endLayout.setEndIconMinSize(n3);
    }

    public void setEndIconMode(int n3) {
        this.endLayout.setEndIconMode(n3);
    }

    public void setEndIconOnClickListener(View.OnClickListener onClickListener) {
        this.endLayout.setEndIconOnClickListener(onClickListener);
    }

    public void setEndIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.endLayout.setEndIconOnLongClickListener(onLongClickListener);
    }

    public void setEndIconScaleType(ImageView.ScaleType scaleType) {
        this.endLayout.setEndIconScaleType(scaleType);
    }

    public void setEndIconTintList(ColorStateList colorStateList) {
        this.endLayout.setEndIconTintList(colorStateList);
    }

    public void setEndIconTintMode(PorterDuff.Mode mode) {
        this.endLayout.setEndIconTintMode(mode);
    }

    public void setEndIconVisible(boolean bl2) {
        this.endLayout.setEndIconVisible(bl2);
    }

    public void setError(CharSequence object) {
        IndicatorViewController indicatorViewController = this.indicatorViewController;
        boolean bl2 = indicatorViewController.isErrorEnabled();
        if (!bl2) {
            bl2 = TextUtils.isEmpty((CharSequence)object);
            if (bl2) {
                return;
            }
            bl2 = true;
            this.setErrorEnabled(bl2);
        }
        if (!(bl2 = TextUtils.isEmpty((CharSequence)object))) {
            indicatorViewController = this.indicatorViewController;
            indicatorViewController.showError((CharSequence)object);
        } else {
            object = this.indicatorViewController;
            ((IndicatorViewController)object).hideError();
        }
    }

    public void setErrorAccessibilityLiveRegion(int n3) {
        this.indicatorViewController.setErrorAccessibilityLiveRegion(n3);
    }

    public void setErrorContentDescription(CharSequence charSequence) {
        this.indicatorViewController.setErrorContentDescription(charSequence);
    }

    public void setErrorEnabled(boolean bl2) {
        this.indicatorViewController.setErrorEnabled(bl2);
    }

    public void setErrorIconDrawable(int n3) {
        this.endLayout.setErrorIconDrawable(n3);
    }

    public void setErrorIconDrawable(Drawable drawable2) {
        this.endLayout.setErrorIconDrawable(drawable2);
    }

    public void setErrorIconOnClickListener(View.OnClickListener onClickListener) {
        this.endLayout.setErrorIconOnClickListener(onClickListener);
    }

    public void setErrorIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.endLayout.setErrorIconOnLongClickListener(onLongClickListener);
    }

    public void setErrorIconTintList(ColorStateList colorStateList) {
        this.endLayout.setErrorIconTintList(colorStateList);
    }

    public void setErrorIconTintMode(PorterDuff.Mode mode) {
        this.endLayout.setErrorIconTintMode(mode);
    }

    public void setErrorTextAppearance(int n3) {
        this.indicatorViewController.setErrorTextAppearance(n3);
    }

    public void setErrorTextColor(ColorStateList colorStateList) {
        this.indicatorViewController.setErrorViewTextColor(colorStateList);
    }

    public void setExpandedHintEnabled(boolean bl2) {
        boolean bl3 = this.expandedHintEnabled;
        if (bl3 != bl2) {
            this.expandedHintEnabled = bl2;
            bl2 = false;
            this.updateLabelState(false);
        }
    }

    public void setHelperText(CharSequence charSequence) {
        boolean bl2 = TextUtils.isEmpty((CharSequence)charSequence);
        if (bl2) {
            boolean bl3 = this.isHelperTextEnabled();
            if (bl3) {
                bl3 = false;
                charSequence = null;
                this.setHelperTextEnabled(false);
            }
        } else {
            bl2 = this.isHelperTextEnabled();
            if (!bl2) {
                bl2 = true;
                this.setHelperTextEnabled(bl2);
            }
            IndicatorViewController indicatorViewController = this.indicatorViewController;
            indicatorViewController.showHelper(charSequence);
        }
    }

    public void setHelperTextColor(ColorStateList colorStateList) {
        this.indicatorViewController.setHelperTextViewTextColor(colorStateList);
    }

    public void setHelperTextEnabled(boolean bl2) {
        this.indicatorViewController.setHelperTextEnabled(bl2);
    }

    public void setHelperTextTextAppearance(int n3) {
        this.indicatorViewController.setHelperTextAppearance(n3);
    }

    public void setHint(int n3) {
        CharSequence charSequence;
        if (n3 != 0) {
            Resources resources = this.getResources();
            charSequence = resources.getText(n3);
        } else {
            n3 = 0;
            charSequence = null;
        }
        this.setHint(charSequence);
    }

    public void setHint(CharSequence charSequence) {
        boolean bl2 = this.hintEnabled;
        if (bl2) {
            this.setHintInternal(charSequence);
            int n3 = 2048;
            this.sendAccessibilityEvent(n3);
        }
    }

    public void setHintAnimationEnabled(boolean bl2) {
        this.hintAnimationEnabled = bl2;
    }

    public void setHintEnabled(boolean bl2) {
        boolean bl3 = this.hintEnabled;
        if (bl2 != bl3) {
            CharSequence charSequence;
            this.hintEnabled = bl2;
            bl3 = false;
            if (!bl2) {
                this.isProvidingHint = false;
                charSequence = this.hint;
                bl2 = TextUtils.isEmpty((CharSequence)charSequence);
                if (!bl2 && (bl2 = TextUtils.isEmpty((CharSequence)(charSequence = this.editText.getHint())))) {
                    charSequence = this.editText;
                    CharSequence charSequence2 = this.hint;
                    charSequence.setHint(charSequence2);
                }
                this.setHintInternal(null);
            } else {
                charSequence = this.editText.getHint();
                boolean bl4 = TextUtils.isEmpty((CharSequence)charSequence);
                if (!bl4) {
                    CharSequence charSequence3 = this.hint;
                    bl4 = TextUtils.isEmpty((CharSequence)charSequence3);
                    if (bl4) {
                        this.setHint(charSequence);
                    }
                    charSequence = this.editText;
                    charSequence.setHint(null);
                }
                this.isProvidingHint = bl2 = true;
            }
            charSequence = this.editText;
            if (charSequence != null) {
                this.updateInputLayoutMargins();
            }
        }
    }

    public void setHintTextAppearance(int n3) {
        ColorStateList colorStateList;
        CollapsingTextHelper collapsingTextHelper = this.collapsingTextHelper;
        collapsingTextHelper.setCollapsedTextAppearance(n3);
        this.focusedTextColor = colorStateList = this.collapsingTextHelper.getCollapsedTextColor();
        colorStateList = this.editText;
        if (colorStateList != null) {
            n3 = 0;
            colorStateList = null;
            this.updateLabelState(false);
            this.updateInputLayoutMargins();
        }
    }

    public void setHintTextColor(ColorStateList colorStateList) {
        Object object = this.focusedTextColor;
        if (object != colorStateList) {
            object = this.defaultHintTextColor;
            if (object == null) {
                object = this.collapsingTextHelper;
                ((CollapsingTextHelper)object).setCollapsedTextColor(colorStateList);
            }
            this.focusedTextColor = colorStateList;
            colorStateList = this.editText;
            if (colorStateList != null) {
                colorStateList = null;
                this.updateLabelState(false);
            }
        }
    }

    public void setLengthCounter(TextInputLayout$LengthCounter textInputLayout$LengthCounter) {
        this.lengthCounter = textInputLayout$LengthCounter;
    }

    public void setMaxEms(int n3) {
        int n4;
        this.maxEms = n3;
        EditText editText = this.editText;
        if (editText != null && n3 != (n4 = -1)) {
            editText.setMaxEms(n3);
        }
    }

    public void setMaxWidth(int n3) {
        int n4;
        this.maxWidth = n3;
        EditText editText = this.editText;
        if (editText != null && n3 != (n4 = -1)) {
            editText.setMaxWidth(n3);
        }
    }

    public void setMaxWidthResource(int n3) {
        n3 = this.getContext().getResources().getDimensionPixelSize(n3);
        this.setMaxWidth(n3);
    }

    public void setMinEms(int n3) {
        int n4;
        this.minEms = n3;
        EditText editText = this.editText;
        if (editText != null && n3 != (n4 = -1)) {
            editText.setMinEms(n3);
        }
    }

    public void setMinWidth(int n3) {
        int n4;
        this.minWidth = n3;
        EditText editText = this.editText;
        if (editText != null && n3 != (n4 = -1)) {
            editText.setMinWidth(n3);
        }
    }

    public void setMinWidthResource(int n3) {
        n3 = this.getContext().getResources().getDimensionPixelSize(n3);
        this.setMinWidth(n3);
    }

    public void setPasswordVisibilityToggleContentDescription(int n3) {
        this.endLayout.setPasswordVisibilityToggleContentDescription(n3);
    }

    public void setPasswordVisibilityToggleContentDescription(CharSequence charSequence) {
        this.endLayout.setPasswordVisibilityToggleContentDescription(charSequence);
    }

    public void setPasswordVisibilityToggleDrawable(int n3) {
        this.endLayout.setPasswordVisibilityToggleDrawable(n3);
    }

    public void setPasswordVisibilityToggleDrawable(Drawable drawable2) {
        this.endLayout.setPasswordVisibilityToggleDrawable(drawable2);
    }

    public void setPasswordVisibilityToggleEnabled(boolean bl2) {
        this.endLayout.setPasswordVisibilityToggleEnabled(bl2);
    }

    public void setPasswordVisibilityToggleTintList(ColorStateList colorStateList) {
        this.endLayout.setPasswordVisibilityToggleTintList(colorStateList);
    }

    public void setPasswordVisibilityToggleTintMode(PorterDuff.Mode mode) {
        this.endLayout.setPasswordVisibilityToggleTintMode(mode);
    }

    public void setPlaceholderText(CharSequence charSequence) {
        int n3;
        Object object = this.placeholderTextView;
        if (object == null) {
            Object object2 = this.getContext();
            object = new AppCompatTextView((Context)object2);
            this.placeholderTextView = object;
            int n4 = R$id.textinput_placeholder;
            object.setId(n4);
            object = this.placeholderTextView;
            object2 = ViewCompat.a;
            n4 = 2;
            object.setImportantForAccessibility(n4);
            object = this.createPlaceholderFadeTransition();
            this.placeholderFadeIn = object;
            long l2 = 67;
            ((Transition)object).setStartDelay(l2);
            this.placeholderFadeOut = object = this.createPlaceholderFadeTransition();
            n3 = this.placeholderTextAppearance;
            this.setPlaceholderTextAppearance(n3);
            object = this.placeholderTextColor;
            this.setPlaceholderTextColor((ColorStateList)object);
        }
        if ((n3 = TextUtils.isEmpty((CharSequence)charSequence)) != 0) {
            charSequence = null;
            this.setPlaceholderTextEnabled(false);
        } else {
            n3 = this.placeholderEnabled;
            if (n3 == 0) {
                n3 = 1;
                this.setPlaceholderTextEnabled(n3 != 0);
            }
            this.placeholderText = charSequence;
        }
        this.updatePlaceholderText();
    }

    public void setPlaceholderTextAppearance(int n3) {
        this.placeholderTextAppearance = n3;
        TextView textView = this.placeholderTextView;
        if (textView != null) {
            Hm3.f(textView, n3);
        }
    }

    public void setPlaceholderTextColor(ColorStateList colorStateList) {
        ColorStateList colorStateList2 = this.placeholderTextColor;
        if (colorStateList2 != colorStateList) {
            this.placeholderTextColor = colorStateList;
            colorStateList2 = this.placeholderTextView;
            if (colorStateList2 != null && colorStateList != null) {
                colorStateList2.setTextColor(colorStateList);
            }
        }
    }

    public void setPrefixText(CharSequence charSequence) {
        this.startLayout.setPrefixText(charSequence);
    }

    public void setPrefixTextAppearance(int n3) {
        this.startLayout.setPrefixTextAppearance(n3);
    }

    public void setPrefixTextColor(ColorStateList colorStateList) {
        this.startLayout.setPrefixTextColor(colorStateList);
    }

    public void setShapeAppearanceModel(ShapeAppearanceModel shapeAppearanceModel) {
        Object object = this.boxBackground;
        if (object != null && (object = ((MaterialShapeDrawable)object).getShapeAppearanceModel()) != shapeAppearanceModel) {
            this.shapeAppearanceModel = shapeAppearanceModel;
            this.applyBoxAttributes();
        }
    }

    public void setStartIconCheckable(boolean bl2) {
        this.startLayout.setStartIconCheckable(bl2);
    }

    public void setStartIconContentDescription(int n3) {
        CharSequence charSequence;
        if (n3 != 0) {
            Resources resources = this.getResources();
            charSequence = resources.getText(n3);
        } else {
            n3 = 0;
            charSequence = null;
        }
        this.setStartIconContentDescription(charSequence);
    }

    public void setStartIconContentDescription(CharSequence charSequence) {
        this.startLayout.setStartIconContentDescription(charSequence);
    }

    public void setStartIconDrawable(int n3) {
        Drawable drawable2;
        if (n3 != 0) {
            Context context = this.getContext();
            drawable2 = xn.a(context, n3);
        } else {
            n3 = 0;
            drawable2 = null;
        }
        this.setStartIconDrawable(drawable2);
    }

    public void setStartIconDrawable(Drawable drawable2) {
        this.startLayout.setStartIconDrawable(drawable2);
    }

    public void setStartIconMinSize(int n3) {
        this.startLayout.setStartIconMinSize(n3);
    }

    public void setStartIconOnClickListener(View.OnClickListener onClickListener) {
        this.startLayout.setStartIconOnClickListener(onClickListener);
    }

    public void setStartIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.startLayout.setStartIconOnLongClickListener(onLongClickListener);
    }

    public void setStartIconScaleType(ImageView.ScaleType scaleType) {
        this.startLayout.setStartIconScaleType(scaleType);
    }

    public void setStartIconTintList(ColorStateList colorStateList) {
        this.startLayout.setStartIconTintList(colorStateList);
    }

    public void setStartIconTintMode(PorterDuff.Mode mode) {
        this.startLayout.setStartIconTintMode(mode);
    }

    public void setStartIconVisible(boolean bl2) {
        this.startLayout.setStartIconVisible(bl2);
    }

    public void setSuffixText(CharSequence charSequence) {
        this.endLayout.setSuffixText(charSequence);
    }

    public void setSuffixTextAppearance(int n3) {
        this.endLayout.setSuffixTextAppearance(n3);
    }

    public void setSuffixTextColor(ColorStateList colorStateList) {
        this.endLayout.setSuffixTextColor(colorStateList);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void setTextAppearanceCompatWithErrorFallback(TextView textView, int n3) {
        block2: {
            Context context;
            int n4;
            try {
                Hm3.f(textView, n3);
                n3 = Build.VERSION.SDK_INT;
                n4 = 23;
                if (n3 < n4) return;
                context = textView.getTextColors();
                n3 = context.getDefaultColor();
                if (n3 != (n4 = -65281)) break block2;
            }
            catch (Exception exception) {}
            n3 = R$style.TextAppearance_AppCompat_Caption;
            Hm3.f(textView, n3);
            context = this.getContext();
            n4 = R$color.design_error;
            n3 = t70.getColor(context, n4);
            textView.setTextColor(n3);
        }
    }

    public void setTextInputAccessibilityDelegate(TextInputLayout$AccessibilityDelegate textInputLayout$AccessibilityDelegate) {
        EditText editText = this.editText;
        if (editText != null) {
            ViewCompat.s((View)editText, textInputLayout$AccessibilityDelegate);
        }
    }

    public void setTypeface(Typeface typeface) {
        Typeface typeface2 = this.typeface;
        if (typeface != typeface2) {
            this.typeface = typeface;
            this.collapsingTextHelper.setTypefaces(typeface);
            this.indicatorViewController.setTypefaces(typeface);
            typeface2 = this.counterView;
            if (typeface2 != null) {
                typeface2.setTypeface(typeface);
            }
        }
    }

    public boolean shouldShowError() {
        return this.indicatorViewController.errorShouldBeShown();
    }

    public void updateCounter(Editable object) {
        int n3 = 1;
        TextInputLayout$LengthCounter textInputLayout$LengthCounter = this.lengthCounter;
        int n4 = textInputLayout$LengthCounter.countLength((Editable)object);
        int n7 = this.counterOverflowed;
        int n8 = this.counterMaxLength;
        int n10 = -1;
        String string2 = null;
        if (n8 == n10) {
            TextView textView = this.counterView;
            object = String.valueOf(n4);
            textView.setText((CharSequence)object);
            object = this.counterView;
            object.setContentDescription(null);
            this.counterOverflowed = false;
        } else {
            Object object2;
            if (n4 > n8) {
                n8 = 1;
            } else {
                n8 = 0;
                object2 = null;
            }
            this.counterOverflowed = n8;
            object2 = this.getContext();
            TextView textView = this.counterView;
            int n14 = this.counterMaxLength;
            int n15 = this.counterOverflowed;
            TextInputLayout.updateCounterContentDescription((Context)object2, textView, n4, n14, n15 != 0);
            n8 = (int)(this.counterOverflowed ? 1 : 0);
            if (n7 != n8) {
                this.updateCounterTextAppearanceAndColor();
            }
            object2 = Hx.c();
            textView = this.counterView;
            Context context = this.getContext();
            n15 = R$string.character_counter_pattern;
            object = n4;
            int n16 = this.counterMaxLength;
            Integer n17 = n16;
            int n18 = 2;
            Object[] objectArray = new Object[n18];
            objectArray[0] = object;
            objectArray[n3] = n17;
            object = context.getString(n15, objectArray);
            if (object == null) {
                object2.getClass();
            } else {
                Qj3 qj3 = ((Hx)object2).c;
                object = ((Hx)object2).d((CharSequence)object, qj3);
                string2 = object.toString();
            }
            textView.setText(string2);
        }
        object = this.editText;
        if (object != null && n7 != (n4 = (int)(this.counterOverflowed ? 1 : 0))) {
            this.updateLabelState(false);
            this.updateTextInputBoxState();
            this.updateEditTextBackground();
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public boolean updateDummyDrawables() {
        block16: {
            var1_1 = this.editText;
            var2_2 = null;
            if (var1_1 == null) {
                return false;
            }
            var3_3 = this.shouldUpdateStartDummyDrawable();
            var4_4 = 0;
            var5_5 = null;
            var6_6 = 2;
            var7_7 = 3;
            var8_8 = 1;
            var9_9 = 1.4E-45f;
            if (var3_3 == 0) break block16;
            var1_1 = this.startLayout;
            var3_3 = var1_1.getMeasuredWidth();
            var10_10 = this.editText.getPaddingLeft();
            var3_3 -= var10_10;
            var11_11 /* !! */  = this.startDummyDrawable;
            if (var11_11 /* !! */  == null || (var10_10 = this.startDummyDrawableWidth) != var3_3) {
                var11_11 /* !! */  = new ColorDrawable();
                this.startDummyDrawable = var11_11 /* !! */ ;
                this.startDummyDrawableWidth = var3_3;
                var11_11 /* !! */ .setBounds(0, 0, var3_3, var8_8);
            }
            if ((var11_11 /* !! */  = (var1_1 = this.editText.getCompoundDrawablesRelative())[0]) == (var12_12 = this.startDummyDrawable)) ** GOTO lbl-1000
            var11_11 /* !! */  = this.editText;
            var13_13 = var1_1[var8_8];
            var14_15 = var1_1[var6_6];
            var1_1 = var1_1[var7_7];
            var11_11 /* !! */ .setCompoundDrawablesRelative(var12_12, (Drawable)var13_13, (Drawable)var14_15, (Drawable)var1_1);
            ** GOTO lbl40
        }
        var1_1 = this.startDummyDrawable;
        if (var1_1 != null) {
            var1_1 = this.editText.getCompoundDrawablesRelative();
            var11_11 /* !! */  = this.editText;
            var12_12 = var1_1[var8_8];
            var13_14 = var1_1[var6_6];
            var1_1 = var1_1[var7_7];
            var11_11 /* !! */ .setCompoundDrawablesRelative(null, var12_12, var13_14, (Drawable)var1_1);
            this.startDummyDrawable = null;
lbl40:
            // 2 sources

            var3_3 = 1;
            var15_16 = 1.4E-45f;
        } else lbl-1000:
        // 2 sources

        {
            var3_3 = 0;
            var15_16 = 0.0f;
            var1_1 = null;
        }
        var10_10 = (int)this.shouldUpdateEndDummyDrawable();
        if (var10_10 != 0) {
            var5_5 = this.endLayout.getSuffixTextView();
            var4_4 = var5_5.getMeasuredWidth();
            var10_10 = this.editText.getPaddingRight();
            var4_4 -= var10_10;
            var11_11 /* !! */  = this.endLayout.getCurrentEndIconView();
            if (var11_11 /* !! */  != null) {
                var16_17 = var11_11 /* !! */ .getMeasuredWidth() + var4_4;
                var5_5 = (ViewGroup.MarginLayoutParams)var11_11 /* !! */ .getLayoutParams();
                var4_4 = var5_5.getMarginStart() + var16_17;
            }
            var11_11 /* !! */  = this.editText.getCompoundDrawablesRelative();
            var12_12 = this.endDummyDrawable;
            if (var12_12 != null && (var17_18 = this.endDummyDrawableWidth) != var4_4) {
                this.endDummyDrawableWidth = var4_4;
                var12_12.setBounds(0, 0, var4_4, var8_8);
                var1_1 = this.editText;
                var2_2 = var11_11 /* !! */ [0];
                var5_5 = var11_11 /* !! */ [var8_8];
                var18_19 = this.endDummyDrawable;
                var19_22 = var11_11 /* !! */ [var7_7];
                var1_1.setCompoundDrawablesRelative(var2_2, (Drawable)var5_5, var18_19, (Drawable)var19_22);
            } else {
                if (var12_12 == null) {
                    this.endDummyDrawable = var12_12 = new ColorDrawable();
                    this.endDummyDrawableWidth = var4_4;
                    var12_12.setBounds(0, 0, var4_4, var8_8);
                }
                if ((var5_5 = var11_11 /* !! */ [var6_6]) != (var18_20 = this.endDummyDrawable)) {
                    this.originalEditTextEndDrawable = var5_5;
                    var1_1 = this.editText;
                    var2_2 = var11_11 /* !! */ [0];
                    var5_5 = var11_11 /* !! */ [var8_8];
                    var19_23 = var11_11 /* !! */ [var7_7];
                    var1_1.setCompoundDrawablesRelative(var2_2, (Drawable)var5_5, var18_20, (Drawable)var19_23);
                } else {
                    var8_8 = var3_3;
                    var9_9 = var15_16;
                }
            }
lbl83:
            // 4 sources

            while (true) {
                var3_3 = var8_8;
                var15_16 = var9_9;
                break;
            }
        } else {
            var11_11 /* !! */  = this.endDummyDrawable;
            if (var11_11 /* !! */  != null) {
                var11_11 /* !! */  = this.editText.getCompoundDrawablesRelative();
                var18_21 = var11_11 /* !! */ [var6_6];
                if (var18_21 == (var12_12 = this.endDummyDrawable)) {
                    var1_1 = this.editText;
                    var2_2 = var11_11 /* !! */ [0];
                    var18_21 = var11_11 /* !! */ [var8_8];
                    var12_12 = this.originalEditTextEndDrawable;
                    var19_24 = var11_11 /* !! */ [var7_7];
                    var1_1.setCompoundDrawablesRelative(var2_2, var18_21, var12_12, (Drawable)var19_24);
                } else {
                    var8_8 = var3_3;
                    var9_9 = var15_16;
                }
                this.endDummyDrawable = null;
                ** continue;
            }
        }
        return (boolean)var3_3;
    }

    public void updateEditTextBackground() {
        int n3;
        EditText editText = this.editText;
        if (editText != null && (n3 = this.boxBackgroundMode) == 0) {
            if ((editText = editText.getBackground()) == null) {
                return;
            }
            Object object = uu0_0.a;
            editText = editText.mutate();
            n3 = (int)(this.shouldShowError() ? 1 : 0);
            if (n3 != 0) {
                n3 = this.getErrorCurrentTextColors();
                PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                object = qn.c(n3, mode);
                editText.setColorFilter((ColorFilter)object);
            } else {
                n3 = (int)(this.counterOverflowed ? 1 : 0);
                if (n3 != 0 && (object = (Object)this.counterView) != null) {
                    n3 = object.getCurrentTextColor();
                    PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                    object = qn.c(n3, mode);
                    editText.setColorFilter((ColorFilter)object);
                } else {
                    ut0_0.a((Drawable)editText);
                    editText = this.editText;
                    editText.refreshDrawableState();
                }
            }
        }
    }

    public void updateEditTextBoxBackgroundIfNeeded() {
        int n3;
        boolean bl2;
        MaterialShapeDrawable materialShapeDrawable;
        EditText editText = this.editText;
        if (editText != null && (materialShapeDrawable = this.boxBackground) != null && ((bl2 = this.boxBackgroundApplied) || (editText = editText.getBackground()) == null) && (n3 = this.boxBackgroundMode) != 0) {
            this.updateEditTextBoxBackground();
            n3 = 1;
            this.boxBackgroundApplied = n3;
        }
    }

    public void updateLabelState(boolean bl2) {
        this.updateLabelState(bl2, false);
    }

    public void updateTextInputBoxState() {
        int n3;
        MaterialShapeDrawable materialShapeDrawable = this.boxBackground;
        if (materialShapeDrawable != null && (n3 = this.boxBackgroundMode) != 0) {
            Object object;
            n3 = (int)(this.isFocused() ? 1 : 0);
            boolean bl2 = false;
            int n4 = 1;
            if (n3 == 0 && ((materialShapeDrawable = this.editText) == null || (n3 = (int)(materialShapeDrawable.hasFocus() ? 1 : 0)) == 0)) {
                n3 = 0;
                materialShapeDrawable = null;
            } else {
                n3 = 1;
            }
            int n7 = this.isHovered();
            if (n7 != 0 || (object = this.editText) != null && (n7 = object.isHovered()) != 0) {
                bl2 = true;
            }
            if ((n7 = this.isEnabled()) == 0) {
                this.boxStrokeColor = n7 = this.disabledColor;
            } else {
                n7 = (int)(this.shouldShowError() ? 1 : 0);
                if (n7 != 0) {
                    object = this.strokeErrorColor;
                    if (object != null) {
                        this.updateStrokeErrorColor(n3 != 0, bl2);
                    } else {
                        this.boxStrokeColor = n7 = this.getErrorCurrentTextColors();
                    }
                } else {
                    n7 = (int)(this.counterOverflowed ? 1 : 0);
                    if (n7 != 0 && (object = this.counterView) != null) {
                        ColorStateList colorStateList = this.strokeErrorColor;
                        if (colorStateList != null) {
                            this.updateStrokeErrorColor(n3 != 0, bl2);
                        } else {
                            this.boxStrokeColor = n7 = object.getCurrentTextColor();
                        }
                    } else {
                        this.boxStrokeColor = n3 != 0 ? (n7 = this.focusedStrokeColor) : (bl2 ? (n7 = this.hoveredStrokeColor) : (n7 = this.defaultStrokeColor));
                    }
                }
            }
            n7 = Build.VERSION.SDK_INT;
            int n8 = 29;
            if (n7 >= n8) {
                this.updateCursorColor();
            }
            object = this.endLayout;
            ((EndCompoundLayout)((Object)object)).onTextInputBoxStateUpdated();
            this.refreshStartIconDrawableState();
            n7 = this.boxBackgroundMode;
            n8 = 2;
            if (n7 == n8) {
                n7 = this.boxStrokeWidthPx;
                this.boxStrokeWidthPx = n3 != 0 && (n8 = (int)(this.isEnabled() ? 1 : 0)) != 0 ? (n8 = this.boxStrokeWidthFocusedPx) : (n8 = this.boxStrokeWidthDefaultPx);
                n8 = this.boxStrokeWidthPx;
                if (n8 != n7) {
                    this.recalculateCutout();
                }
            }
            if ((n7 = this.boxBackgroundMode) == n4) {
                n4 = (int)(this.isEnabled() ? 1 : 0);
                this.boxBackgroundColor = n4 == 0 ? (n3 = this.disabledFilledBackgroundColor) : (bl2 && n3 == 0 ? (n3 = this.hoveredFilledBackgroundColor) : (n3 != 0 ? (n3 = this.focusedFilledBackgroundColor) : (n3 = this.defaultFilledBackgroundColor)));
            }
            this.applyBoxAttributes();
        }
    }
}

