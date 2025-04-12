/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.ObjectAnimator
 *  android.content.Context
 *  android.content.res.ColorStateList
 *  android.content.res.TypedArray
 *  android.graphics.Canvas
 *  android.graphics.PorterDuff$Mode
 *  android.graphics.Rect
 *  android.graphics.Region$Op
 *  android.graphics.Typeface
 *  android.graphics.drawable.Drawable
 *  android.graphics.drawable.Drawable$Callback
 *  android.os.Build$VERSION
 *  android.os.IBinder
 *  android.text.InputFilter
 *  android.text.Layout
 *  android.text.Layout$Alignment
 *  android.text.StaticLayout
 *  android.text.TextPaint
 *  android.text.TextUtils
 *  android.text.method.TransformationMethod
 *  android.util.AttributeSet
 *  android.util.Property
 *  android.view.ActionMode$Callback
 *  android.view.MotionEvent
 *  android.view.VelocityTracker
 *  android.view.View
 *  android.view.ViewConfiguration
 *  android.view.accessibility.AccessibilityEvent
 *  android.view.accessibility.AccessibilityNodeInfo
 *  android.widget.CompoundButton
 *  android.widget.TextView
 */
package androidx.appcompat.widget;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.IBinder;
import android.text.InputFilter;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.Property;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.appcompat.R$attr;
import androidx.appcompat.R$string;
import androidx.appcompat.R$styleable;
import androidx.appcompat.widget.SwitchCompat$a;
import androidx.appcompat.widget.SwitchCompat$b;
import androidx.appcompat.widget.b;
import androidx.core.R$id;
import androidx.core.view.ViewCompat;
import androidx.core.view.ViewCompat$a;
import androidx.emoji2.text.EmojiCompat;

public class SwitchCompat
extends CompoundButton {
    private static final String ACCESSIBILITY_EVENT_CLASS_NAME = "android.widget.Switch";
    private static final int[] CHECKED_STATE_SET;
    private static final int MONOSPACE = 3;
    private static final int SANS = 1;
    private static final int SERIF = 2;
    private static final int THUMB_ANIMATION_DURATION = 250;
    private static final Property THUMB_POS;
    private static final int TOUCH_MODE_DOWN = 1;
    private static final int TOUCH_MODE_DRAGGING = 2;
    private static final int TOUCH_MODE_IDLE;
    private sn mAppCompatEmojiTextHelper;
    private SwitchCompat$b mEmojiCompatInitCallback;
    private boolean mEnforceSwitchWidth;
    private boolean mHasThumbTint;
    private boolean mHasThumbTintMode;
    private boolean mHasTrackTint;
    private boolean mHasTrackTintMode;
    private int mMinFlingVelocity;
    private Layout mOffLayout;
    private Layout mOnLayout;
    ObjectAnimator mPositionAnimator;
    private boolean mShowText;
    private boolean mSplitTrack;
    private int mSwitchBottom;
    private int mSwitchHeight;
    private int mSwitchLeft;
    private int mSwitchMinWidth;
    private int mSwitchPadding;
    private int mSwitchRight;
    private int mSwitchTop;
    private TransformationMethod mSwitchTransformationMethod;
    private int mSwitchWidth;
    private final Rect mTempRect;
    private ColorStateList mTextColors;
    private final b mTextHelper;
    private CharSequence mTextOff;
    private CharSequence mTextOffTransformed;
    private CharSequence mTextOn;
    private CharSequence mTextOnTransformed;
    private final TextPaint mTextPaint;
    private Drawable mThumbDrawable;
    float mThumbPosition;
    private int mThumbTextPadding;
    private ColorStateList mThumbTintList;
    private PorterDuff.Mode mThumbTintMode;
    private int mThumbWidth;
    private int mTouchMode;
    private int mTouchSlop;
    private float mTouchX;
    private float mTouchY;
    private Drawable mTrackDrawable;
    private ColorStateList mTrackTintList;
    private PorterDuff.Mode mTrackTintMode;
    private VelocityTracker mVelocityTracker;

    static {
        SwitchCompat$a switchCompat$a = new Property(Float.class, "thumbPos");
        THUMB_POS = switchCompat$a;
        CHECKED_STATE_SET = new int[]{0x10100A0};
    }

    public SwitchCompat(Context context) {
        this(context, null);
    }

    public SwitchCompat(Context context, AttributeSet attributeSet) {
        int n3 = R$attr.switchStyle;
        this(context, attributeSet, n3);
    }

    public SwitchCompat(Context context, AttributeSet attributeSet, int n3) {
        super(context, attributeSet, n3);
        int bl3;
        float f5;
        boolean bl2;
        VelocityTracker velocityTracker;
        int n4 = 0;
        Object object = null;
        this.mThumbTintList = null;
        this.mThumbTintMode = null;
        this.mHasThumbTint = false;
        this.mHasThumbTintMode = false;
        this.mTrackTintList = null;
        this.mTrackTintMode = null;
        this.mHasTrackTint = false;
        this.mHasTrackTintMode = false;
        this.mVelocityTracker = velocityTracker = VelocityTracker.obtain();
        this.mEnforceSwitchWidth = bl2 = true;
        Object object2 = new Rect();
        this.mTempRect = object2;
        Um3.a(this.getContext(), (View)this);
        super((int)(bl2 ? 1 : 0));
        this.mTextPaint = object2;
        ((TextPaint)object2).density = f5 = this.getResources().getDisplayMetrics().density;
        object2 = R$styleable.SwitchCompat;
        object2 = Tn3.f(context, attributeSet, (int[])object2, n3, 0);
        int[] nArray = R$styleable.SwitchCompat;
        TypedArray typedArray = ((Tn3)object2).b;
        Object object3 = this;
        Context context2 = context;
        AttributeSet attributeSet2 = attributeSet;
        ViewCompat.r((View)this, context, nArray, attributeSet, typedArray, n3, 0);
        int n7 = R$styleable.SwitchCompat_android_thumb;
        object3 = ((Tn3)object2).b(n7);
        this.mThumbDrawable = object3;
        if (object3 != null) {
            object3.setCallback((Drawable.Callback)this);
        }
        n7 = R$styleable.SwitchCompat_track;
        object3 = ((Tn3)object2).b(n7);
        this.mTrackDrawable = object3;
        if (object3 != null) {
            object3.setCallback((Drawable.Callback)this);
        }
        n7 = R$styleable.SwitchCompat_android_textOn;
        context2 = ((Tn3)object2).b;
        object3 = context2.getText(n7);
        this.setTextOnInternal((CharSequence)object3);
        n7 = R$styleable.SwitchCompat_android_textOff;
        object3 = context2.getText(n7);
        this.setTextOffInternal((CharSequence)object3);
        n7 = R$styleable.SwitchCompat_showText;
        n7 = (int)(context2.getBoolean(n7, bl2) ? 1 : 0);
        this.mShowText = n7;
        n7 = R$styleable.SwitchCompat_thumbTextPadding;
        this.mThumbTextPadding = n7 = context2.getDimensionPixelSize(n7, 0);
        n7 = R$styleable.SwitchCompat_switchMinWidth;
        this.mSwitchMinWidth = n7 = context2.getDimensionPixelSize(n7, 0);
        n7 = R$styleable.SwitchCompat_switchPadding;
        this.mSwitchPadding = n7 = context2.getDimensionPixelSize(n7, 0);
        n7 = R$styleable.SwitchCompat_splitTrack;
        n7 = (int)(context2.getBoolean(n7, false) ? 1 : 0);
        this.mSplitTrack = n7;
        n7 = R$styleable.SwitchCompat_thumbTint;
        object3 = ((Tn3)object2).a(n7);
        if (object3 != null) {
            this.mThumbTintList = object3;
            this.mHasThumbTint = bl2;
        }
        n7 = R$styleable.SwitchCompat_thumbTintMode;
        attributeSet2 = this.mThumbTintMode;
        int n8 = -1;
        object3 = uu0_0.c(n7 = context2.getInt(n7, n8), null);
        if (attributeSet2 != object3) {
            this.mThumbTintMode = object3;
            this.mHasThumbTintMode = bl2;
        }
        if ((n7 = (int)(this.mHasThumbTint ? 1 : 0)) != 0 || (n7 = (int)(this.mHasThumbTintMode ? 1 : 0)) != 0) {
            this.applyThumbTint();
        }
        if ((object3 = ((Tn3)object2).a(n7 = R$styleable.SwitchCompat_trackTint)) != null) {
            this.mTrackTintList = object3;
            this.mHasTrackTint = bl2;
        }
        n7 = R$styleable.SwitchCompat_trackTintMode;
        object3 = this.mTrackTintMode;
        object = uu0_0.c(n7 = context2.getInt(n7, n8), null);
        if (object3 != object) {
            this.mTrackTintMode = object;
            this.mHasTrackTintMode = bl2;
        }
        if ((n4 = this.mHasTrackTint) != 0 || (n4 = this.mHasTrackTintMode) != 0) {
            this.applyTrackTint();
        }
        n4 = R$styleable.SwitchCompat_switchTextAppearance;
        if ((n4 = context2.getResourceId(n4, 0)) != 0) {
            this.setSwitchTextAppearance(context, n4);
        }
        super((TextView)this);
        this.mTextHelper = object;
        ((b)object).f(attributeSet, n3);
        ((Tn3)object2).g();
        context = ViewConfiguration.get((Context)context);
        this.mTouchSlop = n4 = context.getScaledTouchSlop();
        this.mMinFlingVelocity = bl3 = context.getScaledMinimumFlingVelocity();
        this.getEmojiTextViewHelper().c(attributeSet, n3);
        this.refreshDrawableState();
        boolean bl4 = this.isChecked();
        this.setChecked(bl4);
    }

    private void animateThumbToCheckedState(boolean bl2) {
        ObjectAnimator objectAnimator;
        float f5;
        boolean bl3 = true;
        if (bl2) {
            int n3 = 1065353216;
            f5 = 1.0f;
        } else {
            boolean bl4 = false;
            f5 = 0.0f;
            objectAnimator = null;
        }
        Property property = THUMB_POS;
        float[] fArray = new float[bl3];
        fArray[0] = f5;
        this.mPositionAnimator = objectAnimator = ObjectAnimator.ofFloat((Object)((Object)this), (Property)property, (float[])fArray);
        objectAnimator.setDuration(250L);
        this.mPositionAnimator.setAutoCancel(bl3);
        this.mPositionAnimator.start();
    }

    private void applyThumbTint() {
        boolean bl2;
        Drawable drawable2 = this.mThumbDrawable;
        if (drawable2 != null && ((bl2 = this.mHasThumbTint) || (bl2 = this.mHasThumbTintMode))) {
            boolean bl3;
            Object object;
            this.mThumbDrawable = drawable2 = ut0_0.h(drawable2).mutate();
            bl2 = this.mHasThumbTint;
            if (bl2) {
                object = this.mThumbTintList;
                drawable2.setTintList(object);
            }
            if (bl3 = this.mHasThumbTintMode) {
                drawable2 = this.mThumbDrawable;
                object = this.mThumbTintMode;
                drawable2.setTintMode((PorterDuff.Mode)object);
            }
            if (bl3 = (drawable2 = this.mThumbDrawable).isStateful()) {
                drawable2 = this.mThumbDrawable;
                object = this.getDrawableState();
                drawable2.setState((int[])object);
            }
        }
    }

    private void applyTrackTint() {
        boolean bl2;
        Drawable drawable2 = this.mTrackDrawable;
        if (drawable2 != null && ((bl2 = this.mHasTrackTint) || (bl2 = this.mHasTrackTintMode))) {
            boolean bl3;
            Object object;
            this.mTrackDrawable = drawable2 = ut0_0.h(drawable2).mutate();
            bl2 = this.mHasTrackTint;
            if (bl2) {
                object = this.mTrackTintList;
                drawable2.setTintList(object);
            }
            if (bl3 = this.mHasTrackTintMode) {
                drawable2 = this.mTrackDrawable;
                object = this.mTrackTintMode;
                drawable2.setTintMode((PorterDuff.Mode)object);
            }
            if (bl3 = (drawable2 = this.mTrackDrawable).isStateful()) {
                drawable2 = this.mTrackDrawable;
                object = this.getDrawableState();
                drawable2.setState((int[])object);
            }
        }
    }

    private void cancelPositionAnimator() {
        ObjectAnimator objectAnimator = this.mPositionAnimator;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    private void cancelSuperTouch(MotionEvent motionEvent) {
        motionEvent = MotionEvent.obtain((MotionEvent)motionEvent);
        motionEvent.setAction(3);
        super.onTouchEvent(motionEvent);
        motionEvent.recycle();
    }

    private static float constrain(float f5, float f6, float f7) {
        Object object = f5 == f6 ? 0 : (f5 < f6 ? -1 : 1);
        if (object < 0) {
            f5 = f6;
        } else {
            Object object2 = f5 == f7 ? 0 : (f5 > f7 ? 1 : -1);
            if (object2 > 0) {
                f5 = f7;
            }
        }
        return f5;
    }

    private CharSequence doTransformForOnOffText(CharSequence charSequence) {
        sn sn4 = this.getEmojiTextViewHelper();
        TransformationMethod transformationMethod = this.mSwitchTransformationMethod;
        sn4 = sn4.b.a.e(transformationMethod);
        if (sn4 != null) {
            charSequence = sn4.getTransformation(charSequence, (View)this);
        }
        return charSequence;
    }

    private sn getEmojiTextViewHelper() {
        sn sn4 = this.mAppCompatEmojiTextHelper;
        if (sn4 == null) {
            this.mAppCompatEmojiTextHelper = sn4 = new sn((TextView)this);
        }
        return this.mAppCompatEmojiTextHelper;
    }

    private boolean getTargetCheckedState() {
        float f5 = this.mThumbPosition;
        float f6 = 0.5f;
        float f7 = f5 - f6;
        Object object = f7 == 0.0f ? 0 : (f7 > 0.0f ? 1 : -1);
        if (object > 0) {
            object = true;
            f5 = Float.MIN_VALUE;
        } else {
            object = false;
            f5 = 0.0f;
        }
        return (boolean)object;
    }

    private int getThumbOffset() {
        float f5;
        int n3 = dE3.a;
        n3 = this.getLayoutDirection();
        int n4 = 1;
        float f6 = Float.MIN_VALUE;
        if (n3 == n4) {
            n3 = 1065353216;
            f6 = this.mThumbPosition;
            f5 = 1.0f - f6;
        } else {
            f5 = this.mThumbPosition;
        }
        f6 = this.getThumbScrollRange();
        return (int)(f5 * f6 + 0.5f);
    }

    private int getThumbScrollRange() {
        Drawable drawable2 = this.mTrackDrawable;
        if (drawable2 != null) {
            Rect rect = this.mTempRect;
            drawable2.getPadding(rect);
            drawable2 = this.mThumbDrawable;
            drawable2 = drawable2 != null ? uu0_0.b(drawable2) : uu0_0.c;
            int n3 = this.mSwitchWidth;
            int n4 = this.mThumbWidth;
            n3 -= n4;
            n4 = rect.left;
            n3 -= n4;
            int n7 = rect.right;
            n3 -= n7;
            n7 = drawable2.left;
            int n8 = drawable2.right;
            return (n3 -= n7) - n8;
        }
        return 0;
    }

    private boolean hitThumb(float f5, float f6) {
        float f7;
        float f8;
        float f11;
        float f12;
        float f14;
        Drawable drawable2 = this.mThumbDrawable;
        boolean bl2 = false;
        if (drawable2 == null) {
            return false;
        }
        int n3 = this.getThumbOffset();
        Drawable drawable3 = this.mThumbDrawable;
        Rect rect = this.mTempRect;
        drawable3.getPadding(rect);
        int n4 = this.mSwitchTop;
        int n7 = this.mTouchSlop;
        n4 -= n7;
        int n8 = this.mSwitchLeft + n3 - n7;
        n3 = this.mThumbWidth + n8;
        Rect rect2 = this.mTempRect;
        int n10 = rect2.left;
        n3 += n10;
        int n14 = rect2.right;
        n3 = n3 + n14 + n7;
        n14 = this.mSwitchBottom + n7;
        float f15 = n8;
        n7 = (int)(f5 == f15 ? 0 : (f5 > f15 ? 1 : -1));
        if (n7 > 0 && (f14 = (f12 = f5 - (f11 = (float)n3)) == 0.0f ? 0 : (f12 < 0.0f ? -1 : 1)) < 0 && (f14 = (f8 = f6 - (f5 = (float)n4)) == 0.0f ? 0 : (f8 > 0.0f ? 1 : -1)) > 0 && (f14 = (f7 = f6 - (f5 = (float)n14)) == 0.0f ? 0 : (f7 < 0.0f ? -1 : 1)) < 0) {
            bl2 = true;
        }
        return bl2;
    }

    private Layout makeLayout(CharSequence charSequence) {
        int n3;
        TextPaint textPaint = this.mTextPaint;
        if (charSequence != null) {
            int n4;
            float f5 = Layout.getDesiredWidth((CharSequence)charSequence, (TextPaint)textPaint);
            double d2 = Math.ceil(f5);
            n3 = n4 = (int)d2;
        } else {
            boolean bl2 = false;
            float f6 = 0.0f;
            n3 = 0;
        }
        Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
        StaticLayout staticLayout = new StaticLayout(charSequence, textPaint, n3, alignment, 1.0f, 0.0f, true);
        return staticLayout;
    }

    private void setOffStateDescriptionOnRAndAbove() {
        int n3 = Build.VERSION.SDK_INT;
        int n4 = 30;
        if (n3 >= n4) {
            CharSequence charSequence = this.mTextOff;
            if (charSequence == null) {
                charSequence = this.getResources();
                int n7 = R$string.abc_capital_off;
                charSequence = charSequence.getString(n7);
            }
            Object object = ViewCompat.a;
            int n8 = R$id.tag_state_description;
            Class<CharSequence> clazz = CharSequence.class;
            int n10 = 64;
            object = new ViewCompat$a(n8, clazz, n10, n4);
            ((ViewCompat$a)object).d((View)this, charSequence);
        }
    }

    private void setOnStateDescriptionOnRAndAbove() {
        int n3 = Build.VERSION.SDK_INT;
        int n4 = 30;
        if (n3 >= n4) {
            CharSequence charSequence = this.mTextOn;
            if (charSequence == null) {
                charSequence = this.getResources();
                int n7 = R$string.abc_capital_on;
                charSequence = charSequence.getString(n7);
            }
            Object object = ViewCompat.a;
            int n8 = R$id.tag_state_description;
            Class<CharSequence> clazz = CharSequence.class;
            int n10 = 64;
            object = new ViewCompat$a(n8, clazz, n10, n4);
            ((ViewCompat$a)object).d((View)this, charSequence);
        }
    }

    private void setSwitchTypefaceByIndex(int n3, int n4) {
        Typeface typeface;
        int n7 = 1;
        if (n3 != n7) {
            n7 = 2;
            if (n3 != n7) {
                n7 = 3;
                if (n3 != n7) {
                    n3 = 0;
                    typeface = null;
                } else {
                    typeface = Typeface.MONOSPACE;
                }
            } else {
                typeface = Typeface.SERIF;
            }
        } else {
            typeface = Typeface.SANS_SERIF;
        }
        this.setSwitchTypeface(typeface, n4);
    }

    private void setTextOffInternal(CharSequence charSequence) {
        this.mTextOff = charSequence;
        this.mTextOffTransformed = charSequence = this.doTransformForOnOffText(charSequence);
        charSequence = null;
        this.mOffLayout = null;
        boolean bl2 = this.mShowText;
        if (bl2) {
            this.setupEmojiCompatLoadCallback();
        }
    }

    private void setTextOnInternal(CharSequence charSequence) {
        this.mTextOn = charSequence;
        this.mTextOnTransformed = charSequence = this.doTransformForOnOffText(charSequence);
        charSequence = null;
        this.mOnLayout = null;
        boolean bl2 = this.mShowText;
        if (bl2) {
            this.setupEmojiCompatLoadCallback();
        }
    }

    private void setupEmojiCompatLoadCallback() {
        int n3;
        int n4;
        boolean bl2;
        Object object = this.mEmojiCompatInitCallback;
        if (object == null && (bl2 = ((sn)(object = this.mAppCompatEmojiTextHelper)).b()) && (bl2 = EmojiCompat.c()) && ((n4 = ((EmojiCompat)(object = EmojiCompat.a())).b()) == (n3 = 3) || n4 == 0)) {
            SwitchCompat$b switchCompat$b;
            this.mEmojiCompatInitCallback = switchCompat$b = new SwitchCompat$b(this);
            ((EmojiCompat)object).h(switchCompat$b);
        }
    }

    private void stopDrag(MotionEvent motionEvent) {
        VelocityTracker velocityTracker;
        float f5;
        int n3;
        this.mTouchMode = 0;
        int n4 = motionEvent.getAction();
        if (n4 == (n3 = 1) && (n4 = (int)(this.isEnabled() ? 1 : 0)) != 0) {
            n4 = 1;
            f5 = Float.MIN_VALUE;
        } else {
            n4 = 0;
            f5 = 0.0f;
            velocityTracker = null;
        }
        int n7 = this.isChecked();
        if (n4 != 0) {
            this.mVelocityTracker.computeCurrentVelocity(1000);
            velocityTracker = this.mVelocityTracker;
            f5 = velocityTracker.getXVelocity();
            float f6 = Math.abs(f5);
            int n8 = this.mMinFlingVelocity;
            float f7 = n8;
            float f8 = f6 == f7 ? 0 : (f6 > f7 ? 1 : -1);
            if (f8 > 0) {
                float f11;
                float f12;
                f8 = (float)dE3.a;
                f8 = this.getLayoutDirection();
                n8 = 0;
                f7 = 0.0f;
                if (!(f8 == n3 ? (n4 = (f12 = f5 - 0.0f) == 0.0f ? 0 : (f12 < 0.0f ? -1 : 1)) < 0 : (n4 = (f11 = f5 - 0.0f) == 0.0f ? 0 : (f11 > 0.0f ? 1 : -1)) > 0)) {
                    n3 = 0;
                }
            } else {
                n3 = this.getTargetCheckedState();
            }
        } else {
            n3 = n7;
        }
        if (n3 != n7) {
            this.playSoundEffect(0);
        }
        this.setChecked(n3 != 0);
        this.cancelSuperTouch(motionEvent);
    }

    /*
     * Enabled aggressive block sorting
     */
    public void draw(Canvas canvas) {
        Drawable drawable2;
        int n3;
        int n4;
        int n7;
        int n8;
        int n10;
        Rect rect;
        block4: {
            int n14;
            int n15;
            block7: {
                block6: {
                    block5: {
                        rect = this.mTempRect;
                        n10 = this.mSwitchLeft;
                        n8 = this.mSwitchTop;
                        n7 = this.mSwitchRight;
                        n4 = this.mSwitchBottom;
                        n3 = this.getThumbOffset() + n10;
                        Drawable drawable3 = this.mThumbDrawable;
                        drawable3 = drawable3 != null ? uu0_0.b(drawable3) : uu0_0.c;
                        Drawable drawable4 = this.mTrackDrawable;
                        if (drawable4 == null) break block4;
                        drawable4.getPadding(rect);
                        n15 = rect.left;
                        n3 += n15;
                        if (drawable3 == null) break block5;
                        int n16 = drawable3.left;
                        if (n16 > n15) {
                            n10 += (n16 -= n15);
                        }
                        n15 = (n15 = drawable3.top) > (n16 = rect.top) ? n15 - n16 + n8 : n8;
                        n16 = drawable3.right;
                        int n17 = rect.right;
                        if (n16 > n17) {
                            n7 -= (n16 -= n17);
                        }
                        if ((n14 = drawable3.bottom) <= (n16 = rect.bottom)) break block6;
                        n14 -= n16;
                        n14 = n4 - n14;
                        break block7;
                    }
                    n15 = n8;
                }
                n14 = n4;
            }
            Drawable drawable5 = this.mTrackDrawable;
            drawable5.setBounds(n10, n15, n7, n14);
        }
        if ((drawable2 = this.mThumbDrawable) != null) {
            drawable2.getPadding(rect);
            n10 = rect.left;
            n10 = n3 - n10;
            n7 = this.mThumbWidth;
            n3 += n7;
            int n18 = rect.right;
            this.mThumbDrawable.setBounds(n10, n8, n3 += n18, n4);
            rect = this.getBackground();
            if (rect != null) {
                rect.setHotspotBounds(n10, n8, n3, n4);
            }
        }
        super.draw(canvas);
    }

    public void drawableHotspotChanged(float f5, float f6) {
        super.drawableHotspotChanged(f5, f6);
        Drawable drawable2 = this.mThumbDrawable;
        if (drawable2 != null) {
            drawable2.setHotspot(f5, f6);
        }
        if ((drawable2 = this.mTrackDrawable) != null) {
            drawable2.setHotspot(f5, f6);
        }
    }

    public void drawableStateChanged() {
        boolean bl2;
        boolean bl3;
        boolean bl4;
        super.drawableStateChanged();
        int[] nArray = this.getDrawableState();
        Drawable drawable2 = this.mThumbDrawable;
        if (drawable2 != null && (bl4 = drawable2.isStateful())) {
            bl3 = drawable2.setState(nArray);
        } else {
            bl3 = false;
            drawable2 = null;
        }
        Drawable drawable3 = this.mTrackDrawable;
        if (drawable3 != null && (bl2 = drawable3.isStateful())) {
            boolean bl5 = drawable3.setState(nArray);
            bl3 |= bl5;
        }
        if (bl3) {
            this.invalidate();
        }
    }

    public int getCompoundPaddingLeft() {
        int n3;
        int n4 = dE3.a;
        n4 = this.getLayoutDirection();
        if (n4 == (n3 = 1)) {
            n4 = super.getCompoundPaddingLeft();
            n3 = this.mSwitchWidth;
            n4 += n3;
            CharSequence charSequence = this.getText();
            n3 = (int)(TextUtils.isEmpty((CharSequence)charSequence) ? 1 : 0);
            if (n3 == 0) {
                n3 = this.mSwitchPadding;
                n4 += n3;
            }
            return n4;
        }
        return super.getCompoundPaddingLeft();
    }

    public int getCompoundPaddingRight() {
        int n3;
        int n4 = dE3.a;
        n4 = this.getLayoutDirection();
        if (n4 == (n3 = 1)) {
            return super.getCompoundPaddingRight();
        }
        n4 = super.getCompoundPaddingRight();
        n3 = this.mSwitchWidth;
        n4 += n3;
        CharSequence charSequence = this.getText();
        n3 = (int)(TextUtils.isEmpty((CharSequence)charSequence) ? 1 : 0);
        if (n3 == 0) {
            n3 = this.mSwitchPadding;
            n4 += n3;
        }
        return n4;
    }

    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return Hm3.g(super.getCustomSelectionActionModeCallback());
    }

    public boolean getShowText() {
        return this.mShowText;
    }

    public boolean getSplitTrack() {
        return this.mSplitTrack;
    }

    public int getSwitchMinWidth() {
        return this.mSwitchMinWidth;
    }

    public int getSwitchPadding() {
        return this.mSwitchPadding;
    }

    public CharSequence getTextOff() {
        return this.mTextOff;
    }

    public CharSequence getTextOn() {
        return this.mTextOn;
    }

    public Drawable getThumbDrawable() {
        return this.mThumbDrawable;
    }

    public final float getThumbPosition() {
        return this.mThumbPosition;
    }

    public int getThumbTextPadding() {
        return this.mThumbTextPadding;
    }

    public ColorStateList getThumbTintList() {
        return this.mThumbTintList;
    }

    public PorterDuff.Mode getThumbTintMode() {
        return this.mThumbTintMode;
    }

    public Drawable getTrackDrawable() {
        return this.mTrackDrawable;
    }

    public ColorStateList getTrackTintList() {
        return this.mTrackTintList;
    }

    public PorterDuff.Mode getTrackTintMode() {
        return this.mTrackTintMode;
    }

    public boolean isEmojiCompatEnabled() {
        return this.getEmojiTextViewHelper().b();
    }

    public void jumpDrawablesToCurrentState() {
        boolean bl2;
        super.jumpDrawablesToCurrentState();
        Drawable drawable2 = this.mThumbDrawable;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        if ((drawable2 = this.mTrackDrawable) != null) {
            drawable2.jumpToCurrentState();
        }
        if ((drawable2 = this.mPositionAnimator) != null && (bl2 = drawable2.isStarted())) {
            this.mPositionAnimator.end();
            bl2 = false;
            drawable2 = null;
            this.mPositionAnimator = null;
        }
    }

    public int[] onCreateDrawableState(int n3) {
        int[] nArray = super.onCreateDrawableState(++n3);
        boolean bl2 = this.isChecked();
        if (bl2) {
            int[] nArray2 = CHECKED_STATE_SET;
            View.mergeDrawableStates((int[])nArray, (int[])nArray2);
        }
        return nArray;
    }

    public void onDraw(Canvas canvas) {
        boolean bl2;
        ColorStateList colorStateList;
        int n3;
        Object object;
        int n4;
        super.onDraw(canvas);
        Rect rect = this.mTempRect;
        Drawable drawable2 = this.mTrackDrawable;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
        } else {
            rect.setEmpty();
        }
        int n7 = this.mSwitchTop;
        int n8 = this.mSwitchBottom;
        int n10 = rect.top;
        n7 += n10;
        n10 = rect.bottom;
        n8 -= n10;
        Drawable drawable3 = this.mThumbDrawable;
        if (drawable2 != null) {
            n4 = this.mSplitTrack;
            if (n4 != 0 && drawable3 != null) {
                object = uu0_0.b(drawable3);
                drawable3.copyBounds(rect);
                n3 = rect.left;
                int n14 = object.left;
                rect.left = n3 += n14;
                n3 = rect.right;
                n4 = object.right;
                rect.right = n3 -= n4;
                n4 = canvas.save();
                colorStateList = Region.Op.DIFFERENCE;
                canvas.clipRect(rect, (Region.Op)colorStateList);
                drawable2.draw(canvas);
                canvas.restoreToCount(n4);
            } else {
                drawable2.draw(canvas);
            }
        }
        int n15 = canvas.save();
        if (drawable3 != null) {
            drawable3.draw(canvas);
        }
        if ((drawable2 = (bl2 = this.getTargetCheckedState()) ? this.mOnLayout : this.mOffLayout) != null) {
            object = this.getDrawableState();
            colorStateList = this.mTextColors;
            if (colorStateList != null) {
                TextPaint textPaint = this.mTextPaint;
                n3 = colorStateList.getColorForState((int[])object, 0);
                textPaint.setColor(n3);
            }
            colorStateList = this.mTextPaint;
            colorStateList.drawableState = (int[])object;
            if (drawable3 != null) {
                drawable3 = drawable3.getBounds();
                n4 = drawable3.left;
                n10 = drawable3.right;
                n4 += n10;
            } else {
                n4 = this.getWidth();
            }
            n4 /= 2;
            n10 = drawable2.getWidth() / 2;
            n7 = (n7 + n8) / 2;
            n8 = drawable2.getHeight() / 2;
            float f5 = n4 -= n10;
            float f6 = n7 -= n8;
            canvas.translate(f5, f6);
            drawable2.draw(canvas);
        }
        canvas.restoreToCount(n15);
    }

    public void onEmojiCompatInitializedForSwitchText() {
        CharSequence charSequence = this.mTextOn;
        this.setTextOnInternal(charSequence);
        charSequence = this.mTextOff;
        this.setTextOffInternal(charSequence);
        this.requestLayout();
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName((CharSequence)ACCESSIBILITY_EVENT_CLASS_NAME);
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        boolean bl2;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        CharSequence charSequence = ACCESSIBILITY_EVENT_CLASS_NAME;
        accessibilityNodeInfo.setClassName(charSequence);
        char c2 = Build.VERSION.SDK_INT;
        char c3 = '\u001e';
        if (c2 < c3 && (c3 = (char)(TextUtils.isEmpty((CharSequence)(charSequence = (bl2 = this.isChecked()) ? this.mTextOn : this.mTextOff)) ? 1 : 0)) == '\u0000') {
            CharSequence charSequence2 = accessibilityNodeInfo.getText();
            boolean bl3 = TextUtils.isEmpty((CharSequence)charSequence2);
            if (bl3) {
                accessibilityNodeInfo.setText(charSequence);
            } else {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(charSequence2);
                c3 = ' ';
                stringBuilder.append(c3);
                stringBuilder.append(charSequence);
                accessibilityNodeInfo.setText((CharSequence)stringBuilder);
            }
        }
    }

    public void onLayout(boolean n3, int n4, int n7, int n8, int n10) {
        super.onLayout(n3 != 0, n4, n7, n8, n10);
        Drawable drawable2 = this.mThumbDrawable;
        n4 = 0;
        if (drawable2 != null) {
            drawable2 = this.mTempRect;
            Drawable drawable3 = this.mTrackDrawable;
            if (drawable3 != null) {
                drawable3.getPadding((Rect)drawable2);
            } else {
                drawable2.setEmpty();
            }
            drawable3 = uu0_0.b(this.mThumbDrawable);
            n8 = drawable3.left;
            n10 = drawable2.left;
            n8 -= n10;
            n8 = Math.max(0, n8);
            n7 = drawable3.right;
            n3 = drawable2.right;
            n4 = Math.max(0, n7 -= n3);
        } else {
            n8 = 0;
        }
        n3 = dE3.a;
        n3 = this.getLayoutDirection();
        n7 = 1;
        if (n3 == n7) {
            n3 = this.getPaddingLeft() + n8;
            n7 = this.mSwitchWidth + n3 - n8 - n4;
        } else {
            n3 = this.getWidth();
            n7 = this.getPaddingRight();
            n7 = n3 - n7 - n4;
            n3 = this.mSwitchWidth;
            n3 = n7 - n3 + n8 + n4;
        }
        n4 = this.getGravity() & 0x70;
        n8 = 16;
        if (n4 != n8) {
            n8 = 80;
            if (n4 != n8) {
                n4 = this.getPaddingTop();
                n8 = this.mSwitchHeight + n4;
            } else {
                n4 = this.getHeight();
                n8 = this.getPaddingBottom();
                n8 = n4 - n8;
                n4 = this.mSwitchHeight;
                n4 = n8 - n4;
            }
        } else {
            n4 = this.getPaddingTop();
            n8 = this.getHeight() + n4;
            n4 = this.getPaddingBottom();
            n8 = (n8 - n4) / 2;
            n4 = this.mSwitchHeight;
            n10 = n4 / 2;
            int n14 = n8;
            n8 = n4 += (n8 -= n10);
            n4 = n14;
        }
        this.mSwitchLeft = n3;
        this.mSwitchTop = n4;
        this.mSwitchBottom = n8;
        this.mSwitchRight = n7;
    }

    public void onMeasure(int n3, int n4) {
        int n7;
        Layout layout2;
        int n8;
        int n10;
        Object object;
        int n14 = this.mShowText;
        if (n14 != 0) {
            object = this.mOnLayout;
            if (object == null) {
                object = this.mTextOnTransformed;
                this.mOnLayout = object = this.makeLayout((CharSequence)object);
            }
            if ((object = this.mOffLayout) == null) {
                object = this.mTextOffTransformed;
                this.mOffLayout = object = this.makeLayout((CharSequence)object);
            }
        }
        object = this.mTempRect;
        Drawable drawable2 = this.mThumbDrawable;
        int n15 = 0;
        if (drawable2 != null) {
            drawable2.getPadding((Rect)object);
            drawable2 = this.mThumbDrawable;
            n10 = drawable2.getIntrinsicWidth();
            n8 = object.left;
            n10 -= n8;
            n8 = object.right;
            n10 -= n8;
            Drawable drawable3 = this.mThumbDrawable;
            n8 = drawable3.getIntrinsicHeight();
        } else {
            n10 = 0;
            drawable2 = null;
            n8 = 0;
            Object var9_10 = null;
        }
        int n16 = this.mShowText;
        if (n16 != 0) {
            layout2 = this.mOnLayout;
            n16 = layout2.getWidth();
            Layout layout3 = this.mOffLayout;
            n7 = layout3.getWidth();
            n16 = Math.max(n16, n7);
            n7 = this.mThumbTextPadding * 2 + n16;
        } else {
            n7 = 0;
            Object var12_14 = null;
        }
        this.mThumbWidth = n10 = Math.max(n7, n10);
        drawable2 = this.mTrackDrawable;
        if (drawable2 != null) {
            drawable2.getPadding((Rect)object);
            drawable2 = this.mTrackDrawable;
            n15 = drawable2.getIntrinsicHeight();
        } else {
            object.setEmpty();
        }
        n10 = object.left;
        n14 = object.right;
        layout2 = this.mThumbDrawable;
        if (layout2 != null) {
            layout2 = uu0_0.b((Drawable)layout2);
            n7 = layout2.left;
            n10 = Math.max(n10, n7);
            n16 = layout2.right;
            n14 = Math.max(n14, n16);
        }
        if ((n16 = (int)(this.mEnforceSwitchWidth ? 1 : 0)) != 0) {
            n16 = this.mSwitchMinWidth;
            n7 = this.mThumbWidth * 2 + n10 + n14;
            n14 = Math.max(n16, n7);
        } else {
            n14 = this.mSwitchMinWidth;
        }
        n10 = Math.max(n15, n8);
        this.mSwitchWidth = n14;
        this.mSwitchHeight = n10;
        super.onMeasure(n3, n4);
        n3 = this.getMeasuredHeight();
        if (n3 < n10) {
            n3 = this.getMeasuredWidthAndState();
            this.setMeasuredDimension(n3, n10);
        }
    }

    public void onPopulateAccessibilityEvent(AccessibilityEvent object) {
        super.onPopulateAccessibilityEvent((AccessibilityEvent)object);
        boolean bl2 = this.isChecked();
        CharSequence charSequence = bl2 ? this.mTextOn : this.mTextOff;
        if (charSequence != null) {
            object = object.getText();
            object.add(charSequence);
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        block15: {
            boolean bl2;
            int n3;
            block12: {
                int n4;
                int n7;
                VelocityTracker velocityTracker;
                block13: {
                    float f5;
                    float f6;
                    block17: {
                        int n8;
                        float f7;
                        block16: {
                            float f8;
                            block14: {
                                velocityTracker = this.mVelocityTracker;
                                velocityTracker.addMovement(motionEvent);
                                int bl4 = motionEvent.getActionMasked();
                                n3 = 1;
                                if (bl4 == 0) break block12;
                                n7 = 2;
                                f8 = 2.8E-45f;
                                if (bl4 == n3) break block13;
                                if (bl4 == n7) break block14;
                                int n10 = 3;
                                float f11 = 4.2E-45f;
                                if (bl4 == n10) break block13;
                                break block15;
                            }
                            int n14 = this.mTouchMode;
                            if (n14 == n3) break block16;
                            if (n14 == n7) {
                                float f12;
                                float f14;
                                float f15;
                                float f16 = motionEvent.getX();
                                int n15 = this.getThumbScrollRange();
                                f8 = this.mTouchX;
                                f8 = f16 - f8;
                                int n16 = 1065353216;
                                float f17 = 1.0f;
                                boolean bl3 = false;
                                float f18 = 0.0f;
                                if (n15 != 0) {
                                    f15 = n15;
                                    f8 /= f15;
                                } else {
                                    float f19 = f8 - 0.0f;
                                    Object object = f19 == 0.0f ? 0 : (f19 > 0.0f ? 1 : -1);
                                    if (object > 0) {
                                        int n17 = 1065353216;
                                        f8 = 1.0f;
                                    } else {
                                        int n18 = -1082130432;
                                        f15 = -1.0f;
                                        int n19 = -1082130432;
                                        f8 = -1.0f;
                                    }
                                }
                                boolean bl4 = dE3.a;
                                int n20 = this.getLayoutDirection();
                                if (n20 == n3) {
                                    f8 = -f8;
                                }
                                if ((f14 = (f12 = (f15 = SwitchCompat.constrain(this.mThumbPosition + f8, 0.0f, f17)) - (f8 = this.mThumbPosition)) == 0.0f ? 0 : (f12 > 0.0f ? 1 : -1)) != false) {
                                    this.mTouchX = f16;
                                    this.setThumbPosition(f15);
                                }
                                return n3 != 0;
                            }
                            break block15;
                        }
                        f6 = motionEvent.getX();
                        f5 = motionEvent.getY();
                        float f20 = this.mTouchX;
                        float f22 = (f20 = Math.abs(f6 - f20)) - (f7 = (float)(n8 = this.mTouchSlop));
                        Object object = f22 == 0.0f ? 0 : (f22 > 0.0f ? 1 : -1);
                        if (object > 0) break block17;
                        f20 = this.mTouchY;
                        float f23 = (f20 = Math.abs(f5 - f20)) - (f7 = (float)(n8 = this.mTouchSlop));
                        object = f23 == 0.0f ? 0 : (f23 > 0.0f ? 1 : -1);
                        if (object <= 0) break block15;
                    }
                    this.mTouchMode = n7;
                    this.getParent().requestDisallowInterceptTouchEvent(n3 != 0);
                    this.mTouchX = f6;
                    this.mTouchY = f5;
                    return n3 != 0;
                    break block15;
                }
                if ((n4 = this.mTouchMode) == n7) {
                    this.stopDrag(motionEvent);
                    super.onTouchEvent(motionEvent);
                    return n3 != 0;
                }
                boolean bl5 = false;
                float f24 = 0.0f;
                this.mTouchMode = 0;
                velocityTracker = this.mVelocityTracker;
                velocityTracker.clear();
                break block15;
            }
            float f25 = motionEvent.getX();
            float f26 = motionEvent.getY();
            boolean bl6 = this.isEnabled();
            if (bl6 && (bl2 = this.hitThumb(f25, f26))) {
                this.mTouchMode = n3;
                this.mTouchX = f25;
                this.mTouchY = f26;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setAllCaps(boolean bl2) {
        super.setAllCaps(bl2);
        this.getEmojiTextViewHelper().d(bl2);
    }

    public void setChecked(boolean bl2) {
        boolean bl3;
        super.setChecked(bl2);
        boolean bl4 = this.isChecked();
        if (bl4) {
            this.setOnStateDescriptionOnRAndAbove();
        } else {
            this.setOffStateDescriptionOnRAndAbove();
        }
        IBinder iBinder = this.getWindowToken();
        if (iBinder != null && (bl3 = this.isLaidOut())) {
            this.animateThumbToCheckedState(bl4);
        } else {
            float f5;
            this.cancelPositionAnimator();
            if (bl4) {
                int n3 = 1065353216;
                f5 = 1.0f;
            } else {
                boolean bl5 = false;
                f5 = 0.0f;
            }
            this.setThumbPosition(f5);
        }
    }

    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback2) {
        callback2 = Hm3.h(callback2, (TextView)this);
        super.setCustomSelectionActionModeCallback(callback2);
    }

    public void setEmojiCompatEnabled(boolean bl2) {
        this.getEmojiTextViewHelper().e(bl2);
        CharSequence charSequence = this.mTextOn;
        this.setTextOnInternal(charSequence);
        charSequence = this.mTextOff;
        this.setTextOffInternal(charSequence);
        this.requestLayout();
    }

    public final void setEnforceSwitchWidth(boolean bl2) {
        this.mEnforceSwitchWidth = bl2;
        this.invalidate();
    }

    public void setFilters(InputFilter[] inputFilterArray) {
        inputFilterArray = this.getEmojiTextViewHelper().a(inputFilterArray);
        super.setFilters(inputFilterArray);
    }

    public void setShowText(boolean bl2) {
        boolean bl3 = this.mShowText;
        if (bl3 != bl2) {
            this.mShowText = bl2;
            this.requestLayout();
            if (bl2) {
                this.setupEmojiCompatLoadCallback();
            }
        }
    }

    public void setSplitTrack(boolean bl2) {
        this.mSplitTrack = bl2;
        this.invalidate();
    }

    public void setSwitchMinWidth(int n3) {
        this.mSwitchMinWidth = n3;
        this.requestLayout();
    }

    public void setSwitchPadding(int n3) {
        this.mSwitchPadding = n3;
        this.requestLayout();
    }

    public void setSwitchTextAppearance(Context object, int n3) {
        float f5;
        float f6;
        float f7;
        int n4;
        Object object2 = R$styleable.TextAppearance;
        TypedArray typedArray = object.obtainStyledAttributes(n3, object2);
        int n7 = typedArray.hasValue(n4 = R$styleable.TextAppearance_android_textColor);
        if (n7 == 0 || (n7 = typedArray.getResourceId(n4, 0)) == 0 || (object = t70.getColorStateList(object, n7)) == null) {
            object = typedArray.getColorStateList(n4);
        }
        if (object != null) {
            this.mTextColors = object;
        } else {
            object = this.getTextColors();
            this.mTextColors = object;
        }
        int n8 = R$styleable.TextAppearance_android_textSize;
        n8 = typedArray.getDimensionPixelSize(n8, 0);
        if (n8 != 0 && (n4 = (int)((f7 = (f6 = (float)n8) - (f5 = (object2 = (Object)this.mTextPaint).getTextSize())) == 0.0f ? 0 : (f7 > 0.0f ? 1 : -1))) != 0) {
            object2 = this.mTextPaint;
            object2.setTextSize(f6);
            this.requestLayout();
        }
        n8 = R$styleable.TextAppearance_android_typeface;
        n4 = -1;
        f5 = 0.0f / 0.0f;
        n8 = typedArray.getInt(n8, n4);
        n7 = R$styleable.TextAppearance_android_textStyle;
        n4 = typedArray.getInt(n7, n4);
        this.setSwitchTypefaceByIndex(n8, n4);
        n8 = R$styleable.TextAppearance_textAllCaps;
        n8 = (int)(typedArray.getBoolean(n8, false) ? 1 : 0);
        if (n8 != 0) {
            object2 = this.getContext();
            object = new Object();
            object2 = object2.getResources().getConfiguration().locale;
            object.a = object2;
            this.mSwitchTransformationMethod = object;
        } else {
            n8 = 0;
            f6 = 0.0f;
            object = null;
            this.mSwitchTransformationMethod = null;
        }
        object = this.mTextOn;
        this.setTextOnInternal((CharSequence)object);
        object = this.mTextOff;
        this.setTextOffInternal((CharSequence)object);
        typedArray.recycle();
    }

    public void setSwitchTypeface(Typeface typeface) {
        boolean bl2;
        Typeface typeface2 = this.mTextPaint.getTypeface();
        if (typeface2 != null && !(bl2 = (typeface2 = this.mTextPaint.getTypeface()).equals((Object)typeface)) || (typeface2 = this.mTextPaint.getTypeface()) == null && typeface != null) {
            typeface2 = this.mTextPaint;
            typeface2.setTypeface(typeface);
            this.requestLayout();
            this.invalidate();
        }
    }

    public void setSwitchTypeface(Typeface typeface, int n3) {
        float f5 = 0.0f;
        boolean bl2 = false;
        if (n3 > 0) {
            int n4;
            typeface = typeface == null ? Typeface.defaultFromStyle((int)n3) : Typeface.create((Typeface)typeface, (int)n3);
            this.setSwitchTypeface(typeface);
            if (typeface != null) {
                n4 = typeface.getStyle();
            } else {
                n4 = 0;
                typeface = null;
            }
            n4 = ~n4 & n3;
            TextPaint textPaint = this.mTextPaint;
            int n7 = n4 & 1;
            if (n7 != 0) {
                bl2 = true;
            }
            textPaint.setFakeBoldText(bl2);
            textPaint = this.mTextPaint;
            if ((n4 &= 2) != 0) {
                f5 = -0.25f;
            }
            textPaint.setTextSkewX(f5);
        } else {
            this.mTextPaint.setFakeBoldText(false);
            TextPaint textPaint = this.mTextPaint;
            textPaint.setTextSkewX(0.0f);
            this.setSwitchTypeface(typeface);
        }
    }

    public void setTextOff(CharSequence charSequence) {
        this.setTextOffInternal(charSequence);
        this.requestLayout();
        boolean bl2 = this.isChecked();
        if (!bl2) {
            this.setOffStateDescriptionOnRAndAbove();
        }
    }

    public void setTextOn(CharSequence charSequence) {
        this.setTextOnInternal(charSequence);
        this.requestLayout();
        boolean bl2 = this.isChecked();
        if (bl2) {
            this.setOnStateDescriptionOnRAndAbove();
        }
    }

    public void setThumbDrawable(Drawable drawable2) {
        Drawable drawable3 = this.mThumbDrawable;
        if (drawable3 != null) {
            drawable3.setCallback(null);
        }
        this.mThumbDrawable = drawable2;
        if (drawable2 != null) {
            drawable2.setCallback((Drawable.Callback)this);
        }
        this.requestLayout();
    }

    public void setThumbPosition(float f5) {
        this.mThumbPosition = f5;
        this.invalidate();
    }

    public void setThumbResource(int n3) {
        Drawable drawable2 = xn.a(this.getContext(), n3);
        this.setThumbDrawable(drawable2);
    }

    public void setThumbTextPadding(int n3) {
        this.mThumbTextPadding = n3;
        this.requestLayout();
    }

    public void setThumbTintList(ColorStateList colorStateList) {
        this.mThumbTintList = colorStateList;
        this.mHasThumbTint = true;
        this.applyThumbTint();
    }

    public void setThumbTintMode(PorterDuff.Mode mode) {
        this.mThumbTintMode = mode;
        this.mHasThumbTintMode = true;
        this.applyThumbTint();
    }

    public void setTrackDrawable(Drawable drawable2) {
        Drawable drawable3 = this.mTrackDrawable;
        if (drawable3 != null) {
            drawable3.setCallback(null);
        }
        this.mTrackDrawable = drawable2;
        if (drawable2 != null) {
            drawable2.setCallback((Drawable.Callback)this);
        }
        this.requestLayout();
    }

    public void setTrackResource(int n3) {
        Drawable drawable2 = xn.a(this.getContext(), n3);
        this.setTrackDrawable(drawable2);
    }

    public void setTrackTintList(ColorStateList colorStateList) {
        this.mTrackTintList = colorStateList;
        this.mHasTrackTint = true;
        this.applyTrackTint();
    }

    public void setTrackTintMode(PorterDuff.Mode mode) {
        this.mTrackTintMode = mode;
        this.mHasTrackTintMode = true;
        this.applyTrackTint();
    }

    public void toggle() {
        boolean bl2 = this.isChecked() ^ true;
        this.setChecked(bl2);
    }

    public boolean verifyDrawable(Drawable drawable2) {
        boolean bl2;
        Drawable drawable3;
        boolean bl3 = super.verifyDrawable(drawable2);
        if (!bl3 && drawable2 != (drawable3 = this.mThumbDrawable) && drawable2 != (drawable3 = this.mTrackDrawable)) {
            bl2 = false;
            drawable2 = null;
        } else {
            bl2 = true;
        }
        return bl2;
    }
}

