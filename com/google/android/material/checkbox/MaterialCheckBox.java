/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.Animator$AnimatorListener
 *  android.content.Context
 *  android.content.res.ColorStateList
 *  android.content.res.Resources
 *  android.content.res.Resources$Theme
 *  android.content.res.TypedArray
 *  android.graphics.Canvas
 *  android.graphics.PorterDuff$Mode
 *  android.graphics.drawable.Animatable2$AnimationCallback
 *  android.graphics.drawable.AnimatedStateListDrawable
 *  android.graphics.drawable.AnimatedVectorDrawable
 *  android.graphics.drawable.Drawable
 *  android.graphics.drawable.Drawable$Callback
 *  android.graphics.drawable.Drawable$ConstantState
 *  android.os.Build$VERSION
 *  android.os.Parcelable
 *  android.text.TextUtils
 *  android.util.AttributeSet
 *  android.util.Xml
 *  android.view.View
 *  android.view.accessibility.AccessibilityNodeInfo
 *  android.view.autofill.AutofillManager
 *  android.widget.CompoundButton
 *  android.widget.CompoundButton$OnCheckedChangeListener
 *  org.xmlpull.v1.XmlPullParser
 *  org.xmlpull.v1.XmlPullParserException
 */
package com.google.android.material.checkbox;

import android.animation.Animator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Animatable2;
import android.graphics.drawable.AnimatedStateListDrawable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Xml;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.autofill.AutofillManager;
import android.widget.CompoundButton;
import androidx.appcompat.widget.AppCompatCheckBox;
import com.google.android.material.R$attr;
import com.google.android.material.R$drawable;
import com.google.android.material.R$id;
import com.google.android.material.R$string;
import com.google.android.material.R$style;
import com.google.android.material.R$styleable;
import com.google.android.material.checkbox.MaterialCheckBox$OnCheckedStateChangedListener;
import com.google.android.material.checkbox.MaterialCheckBox$OnErrorChangedListener;
import com.google.android.material.checkbox.MaterialCheckBox$SavedState;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.drawable.DrawableUtils;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;
import java.io.IOException;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public class MaterialCheckBox
extends AppCompatCheckBox {
    private static final int[][] CHECKBOX_STATES;
    private static final int DEF_STYLE_RES = 0;
    private static final int[] ERROR_STATE_SET;
    private static final int FRAMEWORK_BUTTON_DRAWABLE_RES_ID = 0;
    private static final int[] INDETERMINATE_STATE_SET;
    public static final int STATE_CHECKED = 1;
    public static final int STATE_INDETERMINATE = 2;
    public static final int STATE_UNCHECKED;
    private boolean broadcasting;
    private Drawable buttonDrawable;
    private Drawable buttonIconDrawable;
    ColorStateList buttonIconTintList;
    private PorterDuff.Mode buttonIconTintMode;
    ColorStateList buttonTintList;
    private boolean centerIfNoTextEnabled;
    private int checkedState;
    private int[] currentStateChecked;
    private CharSequence customStateDescription;
    private CharSequence errorAccessibilityLabel;
    private boolean errorShown;
    private ColorStateList materialThemeColorsTintList;
    private CompoundButton.OnCheckedChangeListener onCheckedChangeListener;
    private final LinkedHashSet onCheckedStateChangedListeners;
    private final LinkedHashSet onErrorChangedListeners;
    private final tk_0 transitionToUnchecked;
    private final Mj transitionToUncheckedCallback;
    private boolean useMaterialThemeColors;
    private boolean usingMaterialButtonDrawable;

    static {
        DEF_STYLE_RES = R$style.Widget_MaterialComponents_CompoundButton_CheckBox;
        int n3 = R$attr.state_indeterminate;
        INDETERMINATE_STATE_SET = new int[]{n3};
        n3 = R$attr.state_error;
        ERROR_STATE_SET = new int[]{n3};
        int n4 = 16842910;
        int[] nArray = new int[]{n4, n3};
        int[][] nArrayArray = new int[5][];
        nArrayArray[0] = nArray;
        n3 = 0x10100A0;
        int[] nArray2 = new int[]{n4, n3};
        nArrayArray[1] = nArray2;
        int n7 = -16842912;
        int[] nArray3 = new int[]{n4, n7};
        nArrayArray[2] = nArray3;
        n4 = -16842910;
        nArray = new int[]{n4, n3};
        nArrayArray[3] = nArray;
        nArray = new int[]{n4, n7};
        nArrayArray[4] = nArray;
        CHECKBOX_STATES = nArrayArray;
        FRAMEWORK_BUTTON_DRAWABLE_RES_ID = Resources.getSystem().getIdentifier("btn_check_material_anim", "drawable", "android");
    }

    public MaterialCheckBox(Context context) {
        this(context, null);
    }

    public MaterialCheckBox(Context context, AttributeSet attributeSet) {
        int n3 = R$attr.checkboxStyle;
        this(context, attributeSet, n3);
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public MaterialCheckBox(Context object, AttributeSet object2, int n3) {
        Drawable drawable2;
        tk_0 tk_02;
        Object object3;
        ThreadLocal threadLocal;
        tk_0 tk_03;
        boolean bl2;
        int n4;
        block8: {
            boolean bl3;
            block9: {
                boolean bl4;
                block10: {
                    n4 = DEF_STYLE_RES;
                    object = MaterialThemeOverlay.wrap(object, (AttributeSet)object2, n3, n4);
                    super((Context)object, (AttributeSet)object2, n3);
                    super();
                    this.onErrorChangedListeners = object;
                    super();
                    this.onCheckedStateChangedListeners = object;
                    object = this.getContext();
                    n4 = R$drawable.mtrl_checkbox_button_checked_unchecked;
                    bl3 = Build.VERSION.SDK_INT;
                    bl4 = 24 != 0;
                    bl2 = true;
                    if (bl3 < bl4) break block10;
                    tk_03 = new tk_0((Context)object);
                    Resources resources = object.getResources();
                    object = object.getTheme();
                    threadLocal = WK2.a;
                    object = resources.getDrawable(n4, (Resources.Theme)object);
                    tk_03.a = object;
                    object3 = tk_03.f;
                    object.setCallback((Drawable.Callback)object3);
                    object3 = tk_03.a.getConstantState();
                    super((Drawable.ConstantState)object3);
                    break block8;
                }
                bl3 = tk_0.g;
                tk_03 = object.getResources();
                try {
                    boolean bl5;
                    object3 = tk_03.getXml(n4);
                    tk_03 = Xml.asAttributeSet((XmlPullParser)object3);
                    while ((bl4 = object3.next()) != (bl5 = 2 != 0) && bl4 != bl2) {
                    }
                    if (bl4 == bl5) {
                        Resources resources = object.getResources();
                        threadLocal = object.getTheme();
                        tk_02 = new tk_0((Context)object);
                        tk_02.inflate(resources, (XmlPullParser)object3, (AttributeSet)tk_03, (Resources.Theme)threadLocal);
                        tk_03 = tk_02;
                        break block8;
                    }
                }
                catch (IOException | XmlPullParserException throwable) {
                    break block9;
                }
                {
                    object3 = "No start tag found";
                    super((String)object3);
                    throw object;
                }
            }
            bl3 = false;
            tk_03 = null;
        }
        this.transitionToUnchecked = tk_03;
        super(this);
        this.transitionToUncheckedCallback = object;
        object = this.getContext();
        object3 = R30.a((CompoundButton)this);
        this.buttonDrawable = object3;
        object3 = this.getSuperButtonTintList();
        this.buttonTintList = object3;
        this.setSupportButtonTintList(null);
        int[] nArray = R$styleable.MaterialCheckBox;
        int n7 = DEF_STYLE_RES;
        n4 = 0;
        object3 = null;
        int[] nArray2 = new int[]{};
        threadLocal = object;
        tk_02 = object2;
        object2 = ThemeEnforcement.obtainTintedStyledAttributes(object, (AttributeSet)object2, nArray, n3, n7, nArray2);
        n3 = R$styleable.MaterialCheckBox_buttonIcon;
        this.buttonIconDrawable = drawable2 = ((Tn3)object2).b(n3);
        drawable2 = this.buttonDrawable;
        if (drawable2 != null && (n3 = (int)(ThemeEnforcement.isMaterial3Theme(object) ? 1 : 0)) != 0 && (n3 = (int)(this.isButtonDrawableLegacy((Tn3)object2) ? 1 : 0)) != 0) {
            super.setButtonDrawable(null);
            n3 = R$drawable.mtrl_checkbox_button;
            this.buttonDrawable = drawable2 = xn.a(object, n3);
            this.usingMaterialButtonDrawable = bl2;
            drawable2 = this.buttonIconDrawable;
            if (drawable2 == null) {
                n3 = R$drawable.mtrl_checkbox_button_icon;
                this.buttonIconDrawable = drawable2 = xn.a(object, n3);
            }
        }
        n3 = R$styleable.MaterialCheckBox_buttonIconTint;
        object = MaterialResources.getColorStateList(object, (Tn3)object2, n3);
        this.buttonIconTintList = object;
        int n8 = R$styleable.MaterialCheckBox_buttonIconTintMode;
        n3 = -1;
        tk_03 = ((Tn3)object2).b;
        n8 = tk_03.getInt(n8, n3);
        drawable2 = PorterDuff.Mode.SRC_IN;
        object = ViewUtils.parseTintMode(n8, (PorterDuff.Mode)drawable2);
        this.buttonIconTintMode = object;
        n8 = R$styleable.MaterialCheckBox_useMaterialThemeColors;
        n8 = (int)(tk_03.getBoolean(n8, false) ? 1 : 0);
        this.useMaterialThemeColors = n8;
        n8 = R$styleable.MaterialCheckBox_centerIfNoTextEnabled;
        n8 = (int)(tk_03.getBoolean(n8, bl2) ? 1 : 0);
        this.centerIfNoTextEnabled = n8;
        n8 = R$styleable.MaterialCheckBox_errorShown;
        n8 = (int)(tk_03.getBoolean(n8, false) ? 1 : 0);
        this.errorShown = n8;
        n8 = R$styleable.MaterialCheckBox_errorAccessibilityLabel;
        object = tk_03.getText(n8);
        this.errorAccessibilityLabel = object;
        n8 = R$styleable.MaterialCheckBox_checkedState;
        if ((n8 = (int)(tk_03.hasValue(n8) ? 1 : 0)) != 0) {
            n8 = R$styleable.MaterialCheckBox_checkedState;
            n8 = tk_03.getInt(n8, 0);
            this.setCheckedState(n8);
        }
        ((Tn3)object2).g();
        this.refreshButtonDrawable();
    }

    public static /* synthetic */ int[] access$000(MaterialCheckBox materialCheckBox) {
        return materialCheckBox.currentStateChecked;
    }

    private String getButtonStateDescription() {
        int n3 = this.checkedState;
        int n4 = 1;
        if (n3 == n4) {
            Resources resources = this.getResources();
            n4 = R$string.mtrl_checkbox_state_description_checked;
            return resources.getString(n4);
        }
        if (n3 == 0) {
            Resources resources = this.getResources();
            n4 = R$string.mtrl_checkbox_state_description_unchecked;
            return resources.getString(n4);
        }
        Resources resources = this.getResources();
        n4 = R$string.mtrl_checkbox_state_description_indeterminate;
        return resources.getString(n4);
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        Object object = this.materialThemeColorsTintList;
        if (object == null) {
            ColorStateList colorStateList;
            int n3;
            object = CHECKBOX_STATES;
            int n4 = ((ColorStateList)object).length;
            int[] nArray = new int[n4];
            int n7 = R$attr.colorControlActivated;
            n7 = MaterialColors.getColor((View)this, n7);
            int n8 = R$attr.colorError;
            n8 = MaterialColors.getColor((View)this, n8);
            int n10 = R$attr.colorSurface;
            n10 = MaterialColors.getColor((View)this, n10);
            int n14 = R$attr.colorOnSurface;
            n14 = MaterialColors.getColor((View)this, n14);
            float f5 = 1.0f;
            nArray[0] = n8 = MaterialColors.layer(n10, n8, f5);
            nArray[1] = n7 = MaterialColors.layer(n10, n7, f5);
            nArray[2] = n7 = MaterialColors.layer(n10, n14, 0.54f);
            float f6 = 0.38f;
            nArray[3] = n3 = MaterialColors.layer(n10, n14, f6);
            n7 = 4;
            nArray[n7] = n8 = MaterialColors.layer(n10, n14, f6);
            this.materialThemeColorsTintList = colorStateList = new ColorStateList((int[][])object, nArray);
        }
        return this.materialThemeColorsTintList;
    }

    private ColorStateList getSuperButtonTintList() {
        ColorStateList colorStateList = this.buttonTintList;
        if (colorStateList != null) {
            return colorStateList;
        }
        colorStateList = super.getButtonTintList();
        if (colorStateList != null) {
            return super.getButtonTintList();
        }
        return this.getSupportButtonTintList();
    }

    private boolean isButtonDrawableLegacy(Tn3 tn3) {
        int n3 = R$styleable.MaterialCheckBox_android_button;
        TypedArray typedArray = tn3.b;
        boolean bl2 = false;
        n3 = typedArray.getResourceId(n3, 0);
        int n4 = R$styleable.MaterialCheckBox_buttonCompat;
        tn3 = tn3.b;
        int n7 = tn3.getResourceId(n4, 0);
        n4 = FRAMEWORK_BUTTON_DRAWABLE_RES_ID;
        if (n3 == n4 && n7 == 0) {
            bl2 = true;
        }
        return bl2;
    }

    private /* synthetic */ void lambda$new$0() {
        this.buttonIconDrawable.jumpToCurrentState();
    }

    private void refreshButtonDrawable() {
        Drawable drawable2 = this.buttonDrawable;
        ColorStateList colorStateList = this.buttonTintList;
        PorterDuff.Mode mode = this.getButtonTintMode();
        this.buttonDrawable = drawable2 = DrawableUtils.createTintableMutatedDrawableIfNeeded(drawable2, colorStateList, mode);
        drawable2 = this.buttonIconDrawable;
        colorStateList = this.buttonIconTintList;
        mode = this.buttonIconTintMode;
        this.buttonIconDrawable = drawable2 = DrawableUtils.createTintableMutatedDrawableIfNeeded(drawable2, colorStateList, mode);
        this.setUpDefaultButtonDrawableAnimationIfNeeded();
        this.updateButtonTints();
        drawable2 = this.buttonDrawable;
        colorStateList = this.buttonIconDrawable;
        drawable2 = DrawableUtils.compositeTwoLayeredDrawable(drawable2, (Drawable)colorStateList);
        super.setButtonDrawable(drawable2);
        this.refreshDrawableState();
    }

    private void setDefaultStateDescription() {
        CharSequence charSequence;
        int n3 = Build.VERSION.SDK_INT;
        int n4 = 30;
        if (n3 >= n4 && (charSequence = this.customStateDescription) == null) {
            charSequence = this.getButtonStateDescription();
            super.setStateDescription(charSequence);
        }
    }

    private void setUpDefaultButtonDrawableAnimationIfNeeded() {
        int n3;
        int n4;
        Object object;
        Object object2;
        int n7 = this.usingMaterialButtonDrawable;
        if (n7 == 0) {
            return;
        }
        Object object3 = this.transitionToUnchecked;
        if (object3 != null) {
            object2 = this.transitionToUncheckedCallback;
            Object object4 = object3.a;
            if (object4 != null) {
                object4 = (AnimatedVectorDrawable)object4;
                object = ((Mj)object2).getPlatformCallback();
                Sk.a((AnimatedVectorDrawable)object4, object);
            }
            if ((object4 = object3.e) != null && object2 != null) {
                ((ArrayList)object4).remove(object2);
                object2 = object3.e;
                n4 = ((ArrayList)object2).size();
                if (n4 == 0 && (object2 = object3.d) != null) {
                    object4 = object3.b.b;
                    object4.removeListener((Animator.AnimatorListener)object2);
                    n4 = 0;
                    object2 = null;
                    object3.d = null;
                }
            }
            object3 = this.transitionToUnchecked;
            object2 = this.transitionToUncheckedCallback;
            object4 = object3.a;
            if (object4 != null) {
                object4 = (AnimatedVectorDrawable)object4;
                object3 = ((Mj)object2).getPlatformCallback();
                Rk.a((AnimatedVectorDrawable)object4, (Animatable2.AnimationCallback)object3);
            } else if (object2 != null) {
                object4 = object3.e;
                if (object4 == null) {
                    object3.e = object4 = new ArrayList();
                }
                if ((n3 = (int)(((ArrayList)(object4 = object3.e)).contains(object2) ? 1 : 0)) == 0) {
                    object4 = object3.e;
                    ((ArrayList)object4).add(object2);
                    object2 = object3.d;
                    if (object2 == null) {
                        object2 = new uk_0((tk_0)object3);
                        object3.d = object2;
                    }
                    object2 = object3.b.b;
                    object3 = object3.d;
                    object2.addListener((Animator.AnimatorListener)object3);
                }
            }
        }
        if ((n7 = Build.VERSION.SDK_INT) >= (n4 = 24) && (n4 = (object3 = this.buttonDrawable) instanceof AnimatedStateListDrawable) != 0 && (object2 = this.transitionToUnchecked) != null) {
            object3 = (AnimatedStateListDrawable)object3;
            n3 = R$id.checked;
            int n8 = R$id.unchecked;
            object3.addTransition(n3, n8, (Drawable)object2, false);
            object3 = (AnimatedStateListDrawable)this.buttonDrawable;
            n4 = R$id.indeterminate;
            n3 = R$id.unchecked;
            object = this.transitionToUnchecked;
            object3.addTransition(n4, n3, (Drawable)object, false);
        }
    }

    private void updateButtonTints() {
        ColorStateList colorStateList;
        Drawable drawable2 = this.buttonDrawable;
        if (drawable2 != null && (colorStateList = this.buttonTintList) != null) {
            drawable2.setTintList(colorStateList);
        }
        if ((drawable2 = this.buttonIconDrawable) != null && (colorStateList = this.buttonIconTintList) != null) {
            drawable2.setTintList(colorStateList);
        }
    }

    private void updateIconTintIfNeeded() {
    }

    public void addOnCheckedStateChangedListener(MaterialCheckBox$OnCheckedStateChangedListener materialCheckBox$OnCheckedStateChangedListener) {
        ((AbstractCollection)this.onCheckedStateChangedListeners).add(materialCheckBox$OnCheckedStateChangedListener);
    }

    public void addOnErrorChangedListener(MaterialCheckBox$OnErrorChangedListener materialCheckBox$OnErrorChangedListener) {
        ((AbstractCollection)this.onErrorChangedListeners).add(materialCheckBox$OnErrorChangedListener);
    }

    public void clearOnCheckedStateChangedListeners() {
        ((AbstractCollection)this.onCheckedStateChangedListeners).clear();
    }

    public void clearOnErrorChangedListeners() {
        ((AbstractCollection)this.onErrorChangedListeners).clear();
    }

    public Drawable getButtonDrawable() {
        return this.buttonDrawable;
    }

    public Drawable getButtonIconDrawable() {
        return this.buttonIconDrawable;
    }

    public ColorStateList getButtonIconTintList() {
        return this.buttonIconTintList;
    }

    public PorterDuff.Mode getButtonIconTintMode() {
        return this.buttonIconTintMode;
    }

    public ColorStateList getButtonTintList() {
        return this.buttonTintList;
    }

    public int getCheckedState() {
        return this.checkedState;
    }

    public CharSequence getErrorAccessibilityLabel() {
        return this.errorAccessibilityLabel;
    }

    public boolean isCenterIfNoTextEnabled() {
        return this.centerIfNoTextEnabled;
    }

    public boolean isChecked() {
        int n3 = this.checkedState;
        int n4 = 1;
        if (n3 != n4) {
            n4 = 0;
        }
        return n4 != 0;
    }

    public boolean isErrorShown() {
        return this.errorShown;
    }

    public boolean isUseMaterialThemeColors() {
        return this.useMaterialThemeColors;
    }

    public void onAttachedToWindow() {
        ColorStateList colorStateList;
        super.onAttachedToWindow();
        boolean bl2 = this.useMaterialThemeColors;
        if (bl2 && (colorStateList = this.buttonTintList) == null && (colorStateList = this.buttonIconTintList) == null) {
            bl2 = true;
            this.setUseMaterialThemeColors(bl2);
        }
    }

    public int[] onCreateDrawableState(int n3) {
        int[] nArray;
        int n4 = 2;
        int[] nArray2 = super.onCreateDrawableState(n3 += n4);
        int n7 = this.getCheckedState();
        if (n7 == n4) {
            nArray = INDETERMINATE_STATE_SET;
            View.mergeDrawableStates((int[])nArray2, (int[])nArray);
        }
        if ((n4 = (int)(this.isErrorShown() ? 1 : 0)) != 0) {
            nArray = ERROR_STATE_SET;
            View.mergeDrawableStates((int[])nArray2, (int[])nArray);
        }
        nArray = DrawableUtils.getCheckedState(nArray2);
        this.currentStateChecked = nArray;
        this.updateIconTintIfNeeded();
        return nArray2;
    }

    public void onDraw(Canvas canvas) {
        CharSequence charSequence;
        boolean bl2 = this.centerIfNoTextEnabled;
        if (bl2 && (bl2 = TextUtils.isEmpty((CharSequence)(charSequence = this.getText()))) && (charSequence = R30.a((CompoundButton)this)) != null) {
            int n3 = ViewUtils.isLayoutRtl((View)this);
            n3 = n3 != 0 ? -1 : 1;
            int n4 = this.getWidth();
            int n7 = charSequence.getIntrinsicWidth();
            n4 = (n4 - n7) / 2 * n3;
            n3 = canvas.save();
            float f5 = n4;
            int n8 = 0;
            canvas.translate(f5, 0.0f);
            super.onDraw(canvas);
            canvas.restoreToCount(n3);
            canvas = this.getBackground();
            if (canvas != null) {
                canvas = charSequence.getBounds();
                charSequence = this.getBackground();
                n3 = canvas.left + n4;
                n7 = canvas.top;
                n8 = canvas.right + n4;
                int n10 = canvas.bottom;
                charSequence.setHotspotBounds(n3, n7, n8, n10);
            }
            return;
        }
        super.onDraw(canvas);
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (accessibilityNodeInfo == null) {
            return;
        }
        boolean bl2 = this.isErrorShown();
        if (bl2) {
            CharSequence charSequence = new StringBuilder();
            CharSequence charSequence2 = accessibilityNodeInfo.getText();
            charSequence.append(charSequence2);
            charSequence.append(", ");
            charSequence2 = this.errorAccessibilityLabel;
            charSequence.append(charSequence2);
            charSequence = charSequence.toString();
            accessibilityNodeInfo.setText(charSequence);
        }
    }

    public void onRestoreInstanceState(Parcelable object) {
        boolean bl2 = object instanceof MaterialCheckBox$SavedState;
        if (!bl2) {
            super.onRestoreInstanceState(object);
            return;
        }
        object = (MaterialCheckBox$SavedState)((Object)object);
        Parcelable parcelable = object.getSuperState();
        super.onRestoreInstanceState(parcelable);
        int n3 = object.checkedState;
        this.setCheckedState(n3);
    }

    public Parcelable onSaveInstanceState() {
        int n3;
        Parcelable parcelable = super.onSaveInstanceState();
        MaterialCheckBox$SavedState materialCheckBox$SavedState = new MaterialCheckBox$SavedState(parcelable);
        materialCheckBox$SavedState.checkedState = n3 = this.getCheckedState();
        return materialCheckBox$SavedState;
    }

    public void removeOnCheckedStateChangedListener(MaterialCheckBox$OnCheckedStateChangedListener materialCheckBox$OnCheckedStateChangedListener) {
        ((AbstractCollection)this.onCheckedStateChangedListeners).remove(materialCheckBox$OnCheckedStateChangedListener);
    }

    public void removeOnErrorChangedListener(MaterialCheckBox$OnErrorChangedListener materialCheckBox$OnErrorChangedListener) {
        ((AbstractCollection)this.onErrorChangedListeners).remove(materialCheckBox$OnErrorChangedListener);
    }

    public void setButtonDrawable(int n3) {
        Drawable drawable2 = xn.a(this.getContext(), n3);
        this.setButtonDrawable(drawable2);
    }

    public void setButtonDrawable(Drawable drawable2) {
        this.buttonDrawable = drawable2;
        this.usingMaterialButtonDrawable = false;
        this.refreshButtonDrawable();
    }

    public void setButtonIconDrawable(Drawable drawable2) {
        this.buttonIconDrawable = drawable2;
        this.refreshButtonDrawable();
    }

    public void setButtonIconDrawableResource(int n3) {
        Drawable drawable2 = xn.a(this.getContext(), n3);
        this.setButtonIconDrawable(drawable2);
    }

    public void setButtonIconTintList(ColorStateList colorStateList) {
        ColorStateList colorStateList2 = this.buttonIconTintList;
        if (colorStateList2 == colorStateList) {
            return;
        }
        this.buttonIconTintList = colorStateList;
        this.refreshButtonDrawable();
    }

    public void setButtonIconTintMode(PorterDuff.Mode mode) {
        PorterDuff.Mode mode2 = this.buttonIconTintMode;
        if (mode2 == mode) {
            return;
        }
        this.buttonIconTintMode = mode;
        this.refreshButtonDrawable();
    }

    public void setButtonTintList(ColorStateList colorStateList) {
        ColorStateList colorStateList2 = this.buttonTintList;
        if (colorStateList2 == colorStateList) {
            return;
        }
        this.buttonTintList = colorStateList;
        this.refreshButtonDrawable();
    }

    public void setButtonTintMode(PorterDuff.Mode mode) {
        this.setSupportButtonTintMode(mode);
        this.refreshButtonDrawable();
    }

    public void setCenterIfNoTextEnabled(boolean bl2) {
        this.centerIfNoTextEnabled = bl2;
    }

    public void setChecked(boolean bl2) {
        this.setCheckedState((int)(bl2 ? 1 : 0));
    }

    public void setCheckedState(int n3) {
        int n4 = this.checkedState;
        if (n4 != n3) {
            Object object;
            Object object2;
            this.checkedState = n3;
            n4 = 0;
            int n7 = 1;
            if (n3 == n7) {
                n3 = 1;
            } else {
                n3 = 0;
                object2 = null;
            }
            super.setChecked(n3 != 0);
            this.refreshDrawableState();
            this.setDefaultStateDescription();
            n3 = (int)(this.broadcasting ? 1 : 0);
            if (n3 != 0) {
                return;
            }
            this.broadcasting = n7;
            object2 = this.onCheckedStateChangedListeners;
            if (object2 != null) {
                object2 = ((AbstractCollection)object2).iterator();
                while (n7 = (int)(object2.hasNext() ? 1 : 0)) {
                    object = (MaterialCheckBox$OnCheckedStateChangedListener)object2.next();
                    int n8 = this.checkedState;
                    object.onCheckedStateChangedListener(this, n8);
                }
            }
            if ((n3 = this.checkedState) != (n7 = 2) && (object2 = this.onCheckedChangeListener) != null) {
                n7 = (int)(this.isChecked() ? 1 : 0);
                object2.onCheckedChanged((CompoundButton)this, n7 != 0);
            }
            if ((n3 = Build.VERSION.SDK_INT) >= (n7 = 26)) {
                object2 = this.getContext();
                object = af_0.a();
                if ((object2 = cf_0.a(bf_0.a((Context)object2, (Class)object))) != null) {
                    vh1_1.a((AutofillManager)object2, (View)this);
                }
            }
            this.broadcasting = false;
        }
    }

    public void setEnabled(boolean bl2) {
        super.setEnabled(bl2);
        this.updateIconTintIfNeeded();
    }

    public void setErrorAccessibilityLabel(CharSequence charSequence) {
        this.errorAccessibilityLabel = charSequence;
    }

    public void setErrorAccessibilityLabelResource(int n3) {
        CharSequence charSequence;
        if (n3 != 0) {
            Resources resources = this.getResources();
            charSequence = resources.getText(n3);
        } else {
            n3 = 0;
            charSequence = null;
        }
        this.setErrorAccessibilityLabel(charSequence);
    }

    public void setErrorShown(boolean bl2) {
        boolean bl3 = this.errorShown;
        if (bl3 == bl2) {
            return;
        }
        this.errorShown = bl2;
        this.refreshDrawableState();
        Iterator iterator = ((AbstractCollection)this.onErrorChangedListeners).iterator();
        while (bl3 = iterator.hasNext()) {
            MaterialCheckBox$OnErrorChangedListener materialCheckBox$OnErrorChangedListener = (MaterialCheckBox$OnErrorChangedListener)iterator.next();
            boolean bl4 = this.errorShown;
            materialCheckBox$OnErrorChangedListener.onErrorChanged(this, bl4);
        }
    }

    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.onCheckedChangeListener = onCheckedChangeListener;
    }

    public void setStateDescription(CharSequence charSequence) {
        this.customStateDescription = charSequence;
        if (charSequence == null) {
            this.setDefaultStateDescription();
        } else {
            super.setStateDescription(charSequence);
        }
    }

    public void setUseMaterialThemeColors(boolean bl2) {
        this.useMaterialThemeColors = bl2;
        if (bl2) {
            ColorStateList colorStateList = this.getMaterialThemeColorsTintList();
            this.setButtonTintList(colorStateList);
        } else {
            bl2 = false;
            Object var2_3 = null;
            this.setButtonTintList(null);
        }
    }

    public void toggle() {
        boolean bl2 = this.isChecked() ^ true;
        this.setChecked(bl2);
    }
}

