/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.Bitmap
 *  android.graphics.PorterDuff$Mode
 *  android.graphics.PorterDuffColorFilter
 *  android.graphics.drawable.Drawable
 *  android.graphics.drawable.Drawable$Callback
 *  android.os.Parcelable
 *  android.text.TextUtils
 *  android.util.AttributeSet
 *  android.view.View
 *  android.view.View$BaseSavedState
 */
package com.airbnb.lottie;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import com.airbnb.lottie.LottieAnimationView$SavedState;
import com.airbnb.lottie.LottieAnimationView$a;
import com.airbnb.lottie.LottieAnimationView$b;
import com.airbnb.lottie.LottieAnimationView$c;
import com.airbnb.lottie.LottieTask;
import com.airbnb.lottie.R$attr;
import com.airbnb.lottie.R$styleable;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.zip.ZipInputStream;

public class LottieAnimationView
extends AppCompatImageView {
    public static final mb1_0 n;
    public final LottieAnimationView$c a;
    public final LottieAnimationView$b b;
    public EC1 c;
    public int d;
    public final yc1_1 e;
    public String f;
    public int g;
    public boolean h;
    public boolean i;
    public boolean j;
    public final HashSet k;
    public final HashSet l;
    public LottieTask m;

    static {
        mb1_0 mb1_02;
        n = mb1_02 = new Object();
    }

    public LottieAnimationView(Context object) {
        super((Context)object);
        yc1_1 yc1_12;
        super(this);
        this.a = object;
        super(this);
        this.b = object;
        this.d = 0;
        this.e = yc1_12 = new yc1_1();
        this.h = false;
        this.i = false;
        this.j = true;
        super();
        this.k = object;
        super();
        this.l = object;
        int n3 = R$attr.lottieAnimationViewStyle;
        this.e(null, n3);
    }

    public LottieAnimationView(Context object, AttributeSet attributeSet) {
        super((Context)object, attributeSet);
        yc1_1 yc1_12;
        super(this);
        this.a = object;
        super(this);
        this.b = object;
        this.d = 0;
        this.e = yc1_12 = new yc1_1();
        this.h = false;
        this.i = false;
        this.j = true;
        super();
        this.k = object;
        super();
        this.l = object;
        int n3 = R$attr.lottieAnimationViewStyle;
        this.e(attributeSet, n3);
    }

    public LottieAnimationView(Context object, AttributeSet attributeSet, int n3) {
        super((Context)object, attributeSet, n3);
        yc1_1 yc1_12;
        super(this);
        this.a = object;
        super(this);
        this.b = object;
        this.d = 0;
        this.e = yc1_12 = new yc1_1();
        this.h = false;
        this.i = false;
        this.j = true;
        super();
        this.k = object;
        super();
        this.l = object;
        this.e(attributeSet, n3);
    }

    private void setCompositionTask(LottieTask lottieTask) {
        Drawable drawable2;
        Object object = lottieTask.d;
        Object object2 = this.e;
        if (object != null && object2 == (drawable2 = this.getDrawable()) && (object2 = object2.a) == (object = ((HC1)object).a)) {
            return;
        }
        object = this.k;
        object2 = LottieAnimationView$a.SET_ANIMATION;
        ((HashSet)object).add(object2);
        this.e.d();
        this.d();
        object = this.a;
        lottieTask.b((EC1)object);
        object = this.b;
        lottieTask.a((EC1)object);
        this.m = lottieTask;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void d() {
        LottieTask lottieTask = this.m;
        if (lottieTask == null) return;
        EC1 eC1 = this.a;
        synchronized (lottieTask) {
            LinkedHashSet linkedHashSet = lottieTask.a;
            linkedHashSet.remove(eC1);
        }
        lottieTask = this.m;
        eC1 = this.b;
        lottieTask.e(eC1);
    }

    public final void e(AttributeSet object, int n3) {
        float f5;
        int n4;
        Object object2;
        Object object3 = this.getContext();
        Object object4 = R$styleable.LottieAnimationView;
        object = object3.obtainStyledAttributes(object, (int[])object4, n3, 0);
        n3 = R$styleable.LottieAnimationView_lottie_cacheComposition;
        boolean bl2 = true;
        n3 = (int)(object.getBoolean(n3, bl2) ? 1 : 0);
        this.j = n3;
        n3 = R$styleable.LottieAnimationView_lottie_rawRes;
        n3 = (int)(object.hasValue(n3) ? 1 : 0);
        int n7 = R$styleable.LottieAnimationView_lottie_fileName;
        n7 = (int)(object.hasValue(n7) ? 1 : 0);
        int n8 = R$styleable.LottieAnimationView_lottie_url;
        n8 = (int)(object.hasValue(n8) ? 1 : 0);
        if (n3 != 0 && n7 != 0) {
            object = new IllegalArgumentException("lottie_rawRes and lottie_fileName cannot be used at the same time. Please use only one at once.");
            throw object;
        }
        if (n3 != 0) {
            n3 = R$styleable.LottieAnimationView_lottie_rawRes;
            if ((n3 = object.getResourceId(n3, 0)) != 0) {
                this.setAnimation(n3);
            }
        } else if (n7 != 0) {
            n3 = R$styleable.LottieAnimationView_lottie_fileName;
            object2 = object.getString(n3);
            if (object2 != null) {
                this.setAnimation((String)object2);
            }
        } else if (n8 != 0 && (object2 = object.getString(n3 = R$styleable.LottieAnimationView_lottie_url)) != null) {
            this.setAnimationFromUrl((String)object2);
        }
        n3 = R$styleable.LottieAnimationView_lottie_fallbackRes;
        n3 = object.getResourceId(n3, 0);
        this.setFallbackResource(n3);
        n3 = R$styleable.LottieAnimationView_lottie_autoPlay;
        n3 = (int)(object.getBoolean(n3, false) ? 1 : 0);
        if (n3 != 0) {
            this.i = bl2;
        }
        n3 = R$styleable.LottieAnimationView_lottie_loop;
        n3 = (int)(object.getBoolean(n3, false) ? 1 : 0);
        object4 = (Object)this.e;
        n8 = -1;
        if (n3 != 0) {
            object2 = ((yc1_1)((Object)object4)).b;
            object2.setRepeatCount(n8);
        }
        n3 = R$styleable.LottieAnimationView_lottie_repeatMode;
        if ((n3 = (int)(object.hasValue(n3) ? 1 : 0)) != 0) {
            n3 = R$styleable.LottieAnimationView_lottie_repeatMode;
            n3 = object.getInt(n3, (int)(bl2 ? 1 : 0));
            this.setRepeatMode(n3);
        }
        n3 = R$styleable.LottieAnimationView_lottie_repeatCount;
        if ((n3 = (int)(object.hasValue(n3) ? 1 : 0)) != 0) {
            n3 = R$styleable.LottieAnimationView_lottie_repeatCount;
            n3 = object.getInt(n3, n8);
            this.setRepeatCount(n3);
        }
        n3 = R$styleable.LottieAnimationView_lottie_speed;
        if ((n3 = (int)(object.hasValue(n3) ? 1 : 0)) != 0) {
            n3 = R$styleable.LottieAnimationView_lottie_speed;
            n4 = 1065353216;
            f5 = 1.0f;
            float f6 = object.getFloat(n3, f5);
            this.setSpeed(f6);
        }
        n3 = R$styleable.LottieAnimationView_lottie_clipToCompositionBounds;
        if ((n3 = (int)(object.hasValue(n3) ? 1 : 0)) != 0) {
            n3 = R$styleable.LottieAnimationView_lottie_clipToCompositionBounds;
            n3 = (int)(object.getBoolean(n3, bl2) ? 1 : 0);
            this.setClipToCompositionBounds(n3 != 0);
        }
        n3 = R$styleable.LottieAnimationView_lottie_clipTextToBoundingBox;
        if ((n3 = (int)(object.hasValue(n3) ? 1 : 0)) != 0) {
            n3 = R$styleable.LottieAnimationView_lottie_clipTextToBoundingBox;
            n3 = (int)(object.getBoolean(n3, false) ? 1 : 0);
            this.setClipTextToBoundingBox(n3 != 0);
        }
        n3 = R$styleable.LottieAnimationView_lottie_defaultFontFileExtension;
        if ((n3 = (int)(object.hasValue(n3) ? 1 : 0)) != 0) {
            n3 = R$styleable.LottieAnimationView_lottie_defaultFontFileExtension;
            object2 = object.getString(n3);
            this.setDefaultFontFileExtension((String)object2);
        }
        n3 = R$styleable.LottieAnimationView_lottie_imageAssetsFolder;
        object2 = object.getString(n3);
        this.setImageAssetsFolder((String)object2);
        n3 = R$styleable.LottieAnimationView_lottie_progress;
        n3 = (int)(object.hasValue(n3) ? 1 : 0);
        n4 = R$styleable.LottieAnimationView_lottie_progress;
        LottieAnimationView$a lottieAnimationView$a = null;
        f5 = object.getFloat(n4, 0.0f);
        if (n3 != 0) {
            object2 = this.k;
            lottieAnimationView$a = LottieAnimationView$a.SET_PROGRESS;
            ((HashSet)object2).add(lottieAnimationView$a);
        }
        ((yc1_1)((Object)object4)).B(f5);
        n3 = R$styleable.LottieAnimationView_lottie_enableMergePathsForKitKatAndAbove;
        n3 = (int)(object.getBoolean(n3, false) ? 1 : 0);
        AC1 aC1 = AC1.MergePathsApi19;
        ((yc1_1)((Object)object4)).h(aC1, n3 != 0);
        n3 = R$styleable.LottieAnimationView_lottie_applyOpacityToLayers;
        n3 = (int)(object.getBoolean(n3, false) ? 1 : 0);
        this.setApplyingOpacityToLayersEnabled(n3 != 0);
        n3 = R$styleable.LottieAnimationView_lottie_applyShadowToLayers;
        n3 = (int)(object.getBoolean(n3, bl2) ? 1 : 0);
        this.setApplyingShadowToLayersEnabled(n3 != 0);
        n3 = R$styleable.LottieAnimationView_lottie_colorFilter;
        n3 = (int)(object.hasValue(n3) ? 1 : 0);
        if (n3 != 0) {
            n3 = R$styleable.LottieAnimationView_lottie_colorFilter;
            n3 = object.getResourceId(n3, n8);
            object2 = t70.getColorStateList(this.getContext(), n3);
            n3 = object2.getDefaultColor();
            Object object5 = PorterDuff.Mode.SRC_ATOP;
            object3 = new PorterDuffColorFilter(n3, (PorterDuff.Mode)object5);
            object5 = new String[]{"**"};
            object2 = new ko1((String)object5);
            object5 = new LC1((e53)((Object)object3));
            object3 = GC1.F;
            ((yc1_1)((Object)object4)).a((ko1)object2, object3, (LC1)object5);
        }
        n3 = R$styleable.LottieAnimationView_lottie_renderMode;
        if ((n3 = (int)(object.hasValue(n3) ? 1 : 0)) != 0) {
            n3 = R$styleable.LottieAnimationView_lottie_renderMode;
            object3 = UI2.AUTOMATIC;
            n7 = ((Enum)object3).ordinal();
            if ((n3 = object.getInt(n3, n7)) >= (n7 = ((Object)(object4 = UI2.values())).length)) {
                n3 = ((Enum)object3).ordinal();
            }
            object3 = UI2.values();
            object2 = object3[n3];
            this.setRenderMode((UI2)((Object)object2));
        }
        n3 = R$styleable.LottieAnimationView_lottie_asyncUpdates;
        if ((n3 = (int)(object.hasValue(n3) ? 1 : 0)) != 0) {
            n3 = R$styleable.LottieAnimationView_lottie_asyncUpdates;
            object3 = Hq.AUTOMATIC;
            n7 = ((Enum)object3).ordinal();
            if ((n3 = object.getInt(n3, n7)) >= (n7 = ((Object)(object4 = UI2.values())).length)) {
                n3 = ((Enum)object3).ordinal();
            }
            object3 = Hq.values();
            object2 = object3[n3];
            this.setAsyncUpdates((Hq)((Object)object2));
        }
        n3 = R$styleable.LottieAnimationView_lottie_ignoreDisabledSystemAnimations;
        n3 = (int)(object.getBoolean(n3, false) ? 1 : 0);
        this.setIgnoreDisabledSystemAnimations(n3 != 0);
        n3 = R$styleable.LottieAnimationView_lottie_useCompositionFrameRate;
        n3 = (int)(object.hasValue(n3) ? 1 : 0);
        if (n3 != 0) {
            n3 = R$styleable.LottieAnimationView_lottie_useCompositionFrameRate;
            n3 = (int)(object.getBoolean(n3, false) ? 1 : 0);
            this.setUseCompositionFrameRate(n3 != 0);
        }
        object.recycle();
    }

    public final void f() {
        HashSet hashSet = this.k;
        LottieAnimationView$a lottieAnimationView$a = LottieAnimationView$a.PLAY_OPTION;
        hashSet.add(lottieAnimationView$a);
        this.e.m();
    }

    public Hq getAsyncUpdates() {
        Hq hq = this.e.M;
        if (hq == null) {
            hq = Yo1.a;
        }
        return hq;
    }

    public boolean getAsyncUpdatesEnabled() {
        boolean bl2;
        Hq hq = this.e.M;
        if (hq == null) {
            hq = Yo1.a;
        }
        Hq hq2 = Hq.ENABLED;
        if (hq == hq2) {
            bl2 = true;
        } else {
            bl2 = false;
            hq = null;
        }
        return bl2;
    }

    public boolean getClipTextToBoundingBox() {
        return this.e.v;
    }

    public boolean getClipToCompositionBounds() {
        return this.e.o;
    }

    public QB1 getComposition() {
        yc1_1 yc1_12;
        Object object = this.getDrawable();
        object = object == (yc1_12 = this.e) ? yc1_12.a : null;
        return object;
    }

    public long getDuration() {
        long l2;
        QB1 qB1 = this.getComposition();
        if (qB1 != null) {
            float f5 = qB1.b();
            l2 = (long)f5;
        } else {
            l2 = 0L;
        }
        return l2;
    }

    public int getFrame() {
        return (int)this.e.b.h;
    }

    public String getImageAssetsFolder() {
        return this.e.i;
    }

    public boolean getMaintainOriginalImageBounds() {
        return this.e.n;
    }

    public float getMaxFrame() {
        return this.e.b.f();
    }

    public float getMinFrame() {
        return this.e.b.g();
    }

    public Gq2 getPerformanceTracker() {
        Object object = this.e.a;
        object = object != null ? ((QB1)object).a : null;
        return object;
    }

    public float getProgress() {
        return this.e.b.e();
    }

    public UI2 getRenderMode() {
        Object object = this.e;
        boolean bl2 = object.x;
        object = bl2 ? UI2.SOFTWARE : UI2.HARDWARE;
        return object;
    }

    public int getRepeatCount() {
        return this.e.b.getRepeatCount();
    }

    public int getRepeatMode() {
        return this.e.b.getRepeatMode();
    }

    public float getSpeed() {
        return this.e.b.d;
    }

    public final void invalidate() {
        super.invalidate();
        Object object = this.getDrawable();
        boolean bl2 = object instanceof yc1_1;
        if (bl2) {
            UI2 uI2;
            object = (yc1_1)((Object)object);
            boolean bl3 = object.x;
            object = bl3 ? UI2.SOFTWARE : UI2.HARDWARE;
            if (object == (uI2 = UI2.SOFTWARE)) {
                object = this.e;
                object.invalidateSelf();
            }
        }
    }

    public final void invalidateDrawable(Drawable drawable2) {
        yc1_1 yc1_12;
        Drawable drawable3 = this.getDrawable();
        if (drawable3 == (yc1_12 = this.e)) {
            super.invalidateDrawable((Drawable)yc1_12);
        } else {
            super.invalidateDrawable(drawable2);
        }
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        boolean bl2 = this.isInEditMode();
        if (!bl2 && (bl2 = this.i)) {
            yc1_1 yc1_12 = this.e;
            yc1_12.m();
        }
    }

    public final void onRestoreInstanceState(Parcelable object) {
        Object object2;
        int n3 = object instanceof LottieAnimationView$SavedState;
        if (n3 == 0) {
            super.onRestoreInstanceState(object);
            return;
        }
        object = (LottieAnimationView$SavedState)((Object)object);
        Object object3 = object.getSuperState();
        super.onRestoreInstanceState(object3);
        object3 = object.a;
        this.f = object3;
        object3 = LottieAnimationView$a.SET_ANIMATION;
        HashSet hashSet = this.k;
        int n4 = hashSet.contains(object3);
        if (n4 == 0 && (n4 = (int)(TextUtils.isEmpty((CharSequence)(object2 = this.f)) ? 1 : 0)) == 0) {
            object2 = this.f;
            this.setAnimation((String)object2);
        }
        this.g = n4 = object.b;
        n3 = hashSet.contains(object3);
        if (n3 == 0 && (n3 = this.g) != 0) {
            this.setAnimation(n3);
        }
        if ((n3 = (int)(hashSet.contains(object3 = LottieAnimationView$a.SET_PROGRESS) ? 1 : 0)) == 0) {
            float f5 = object.c;
            object2 = this.e;
            ((yc1_1)((Object)object2)).B(f5);
        }
        if ((n3 = (int)(hashSet.contains(object3 = LottieAnimationView$a.PLAY_OPTION) ? 1 : 0)) == 0 && (n3 = (int)(object.d ? 1 : 0)) != 0) {
            this.f();
        }
        if ((n3 = (int)(hashSet.contains(object3 = LottieAnimationView$a.SET_IMAGE_ASSETS) ? 1 : 0)) == 0) {
            object3 = object.e;
            this.setImageAssetsFolder((String)object3);
        }
        if ((n3 = (int)(hashSet.contains(object3 = LottieAnimationView$a.SET_REPEAT_MODE) ? 1 : 0)) == 0) {
            n3 = object.f;
            this.setRepeatMode(n3);
        }
        if ((n3 = (int)(hashSet.contains(object3 = LottieAnimationView$a.SET_REPEAT_COUNT) ? 1 : 0)) == 0) {
            int n7 = object.g;
            this.setRepeatCount(n7);
        }
    }

    public final Parcelable onSaveInstanceState() {
        float f5;
        int n3;
        Object object = super.onSaveInstanceState();
        LottieAnimationView$SavedState lottieAnimationView$SavedState = new View.BaseSavedState(object);
        object = this.f;
        lottieAnimationView$SavedState.a = object;
        lottieAnimationView$SavedState.b = n3 = this.g;
        object = this.e;
        Object object2 = object.b;
        lottieAnimationView$SavedState.c = f5 = object2.e();
        int n4 = object.isVisible();
        if (n4 != 0) {
            object2 = object.b;
            n4 = object2.m;
        } else {
            object2 = object.f;
            yC1$b yC1$b = yC1$b.PLAY;
            if (object2 != yC1$b && object2 != (yC1$b = yC1$b.RESUME)) {
                n4 = 0;
                f5 = 0.0f;
                object2 = null;
            } else {
                n4 = 1;
                f5 = Float.MIN_VALUE;
            }
        }
        lottieAnimationView$SavedState.d = n4;
        object2 = object.i;
        lottieAnimationView$SavedState.e = object2;
        lottieAnimationView$SavedState.f = n4 = object.b.getRepeatMode();
        lottieAnimationView$SavedState.g = n3 = object.b.getRepeatCount();
        return lottieAnimationView$SavedState;
    }

    /*
     * Enabled aggressive block sorting
     */
    public void setAnimation(int n3) {
        this.g = n3;
        LottieTask lottieTask = null;
        this.f = null;
        boolean bl2 = this.isInEditMode();
        if (bl2) {
            NB1 nB1 = new NB1(this, n3);
            n3 = 1;
            lottieTask = new LottieTask(nB1, n3 != 0);
        } else {
            LottieTask lottieTask2;
            bl2 = this.j;
            if (bl2) {
                lottieTask = this.getContext();
                String string2 = cc1_0.m(n3, (Context)lottieTask);
                lottieTask2 = cc1_0.g((Context)lottieTask, n3, string2);
            } else {
                Context context = this.getContext();
                lottieTask2 = cc1_0.g(context, n3, null);
            }
            lottieTask = lottieTask2;
        }
        this.setCompositionTask(lottieTask);
    }

    public void setAnimation(InputStream object, String string2) {
        UB1 uB1 = new UB1((InputStream)object, string2);
        VB1 vB1 = new VB1((InputStream)object);
        object = cc1_0.a(string2, uB1, vB1);
        this.setCompositionTask((LottieTask)object);
    }

    /*
     * Enabled aggressive block sorting
     */
    public void setAnimation(String object) {
        this.f = object;
        Object object2 = null;
        this.g = 0;
        boolean bl2 = this.isInEditMode();
        if (bl2) {
            LB1 lB1 = new LB1(this, (String)object);
            boolean bl3 = true;
            object2 = new LottieTask(lB1, bl3);
        } else {
            bl2 = this.j;
            Object var4_5 = null;
            if (bl2) {
                object2 = this.getContext();
                Object object3 = cc1_0.a;
                object3 = kp1_0.c("asset_", (String)object);
                object2 = object2.getApplicationContext();
                YB1 yB1 = new YB1((Context)object2, (String)object, (String)object3);
                object = cc1_0.a((String)object3, yB1, null);
            } else {
                object2 = this.getContext();
                Object object4 = cc1_0.a;
                object2 = object2.getApplicationContext();
                object4 = new YB1((Context)object2, (String)object, null);
                object = cc1_0.a(null, (Callable)object4, null);
            }
            object2 = object;
        }
        this.setCompositionTask((LottieTask)object2);
    }

    public void setAnimation(ZipInputStream object, String string2) {
        WB1 wB1 = new WB1((ZipInputStream)object, string2);
        WP wP = new WP(object, 1);
        object = cc1_0.a(string2, wB1, wP);
        this.setCompositionTask((LottieTask)object);
    }

    public void setAnimationFromJson(String string2) {
        this.setAnimationFromJson(string2, null);
    }

    public void setAnimationFromJson(String object, String string2) {
        object = ((String)object).getBytes();
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream((byte[])object);
        this.setAnimation(byteArrayInputStream, string2);
    }

    public void setAnimationFromUrl(String object) {
        boolean bl2 = this.j;
        if (bl2) {
            Context context = this.getContext();
            Object object2 = cc1_0.a;
            object2 = kp1_0.c("url_", (String)object);
            SB1 sB1 = new SB1(context, (String)object, (String)object2);
            object = cc1_0.a((String)object2, sB1, null);
        } else {
            Context context = this.getContext();
            SB1 sB1 = new SB1(context, (String)object, null);
            object = cc1_0.a(null, sB1, null);
        }
        this.setCompositionTask((LottieTask)object);
    }

    public void setAnimationFromUrl(String object, String string2) {
        Context context = this.getContext();
        SB1 sB1 = new SB1(context, (String)object, string2);
        object = cc1_0.a(string2, sB1, null);
        this.setCompositionTask((LottieTask)object);
    }

    public void setApplyingOpacityToLayersEnabled(boolean bl2) {
        this.e.t = bl2;
    }

    public void setApplyingShadowToLayersEnabled(boolean bl2) {
        this.e.u = bl2;
    }

    public void setAsyncUpdates(Hq hq) {
        this.e.M = hq;
    }

    public void setCacheComposition(boolean bl2) {
        this.j = bl2;
    }

    public void setClipTextToBoundingBox(boolean bl2) {
        yc1_1 yc1_12 = this.e;
        boolean bl3 = yc1_12.v;
        if (bl2 != bl3) {
            yc1_12.v = bl2;
            yc1_12.invalidateSelf();
        }
    }

    public void setClipToCompositionBounds(boolean bl2) {
        yc1_1 yc1_12 = this.e;
        boolean bl3 = yc1_12.o;
        if (bl2 != bl3) {
            yc1_12.o = bl2;
            g30_0 g30_02 = yc1_12.p;
            if (g30_02 != null) {
                g30_02.L = bl2;
            }
            yc1_12.invalidateSelf();
        }
    }

    public void setComposition(QB1 object) {
        boolean bl2;
        Object object2 = Yo1.a;
        object2 = this.e;
        object2.setCallback((Drawable.Callback)this);
        this.h = true;
        boolean n3 = ((yc1_1)((Object)object2)).p((QB1)((Object)object));
        boolean bl3 = this.i;
        if (bl3) {
            ((yc1_1)((Object)object2)).m();
        }
        bl3 = false;
        this.h = false;
        Drawable drawable2 = this.getDrawable();
        if (drawable2 == object2 && !n3) {
            return;
        }
        if (!n3) {
            boolean bl4 = ((yc1_1)((Object)object2)).k();
            bl3 = false;
            drawable2 = null;
            this.setImageDrawable(null);
            this.setImageDrawable((Drawable)object2);
            if (bl4) {
                ((yc1_1)((Object)object2)).o();
            }
        }
        int n4 = this.getVisibility();
        this.onVisibilityChanged((View)this, n4);
        this.requestLayout();
        object = this.l.iterator();
        while (bl2 = object.hasNext()) {
            object2 = (FC1)object.next();
            object2.a();
        }
    }

    public void setDefaultFontFileExtension(String string2) {
        Object object = this.e;
        object.l = string2;
        if ((object = object.j()) != null) {
            ((OU0)object).e = string2;
        }
    }

    public void setFailureListener(EC1 eC1) {
        this.c = eC1;
    }

    public void setFallbackResource(int n3) {
        this.d = n3;
    }

    public void setFontAssetDelegate(NU0 nU0) {
        OU0 cfr_ignored_0 = this.e.j;
    }

    public void setFontMap(Map map2) {
        yc1_1 yc1_12 = this.e;
        Map map3 = yc1_12.k;
        if (map2 != map3) {
            yc1_12.k = map2;
            yc1_12.invalidateSelf();
        }
    }

    public void setFrame(int n3) {
        this.e.q(n3);
    }

    public void setIgnoreDisabledSystemAnimations(boolean bl2) {
        this.e.d = bl2;
    }

    public void setImageAssetDelegate(fd1 fd12) {
        gd1 cfr_ignored_0 = this.e.h;
    }

    public void setImageAssetsFolder(String string2) {
        this.e.i = string2;
    }

    public void setImageBitmap(Bitmap bitmap) {
        this.g = 0;
        this.f = null;
        this.d();
        super.setImageBitmap(bitmap);
    }

    public void setImageDrawable(Drawable drawable2) {
        this.g = 0;
        this.f = null;
        this.d();
        super.setImageDrawable(drawable2);
    }

    public void setImageResource(int n3) {
        this.g = 0;
        this.f = null;
        this.d();
        super.setImageResource(n3);
    }

    public void setMaintainOriginalImageBounds(boolean bl2) {
        this.e.n = bl2;
    }

    public void setMaxFrame(int n3) {
        this.e.r(n3);
    }

    public void setMaxFrame(String string2) {
        this.e.s(string2);
    }

    public void setMaxProgress(float f5) {
        this.e.t(f5);
    }

    public void setMinAndMaxFrame(int n3, int n4) {
        this.e.u(n3, n4);
    }

    public void setMinAndMaxFrame(String string2) {
        this.e.v(string2);
    }

    public void setMinAndMaxFrame(String string2, String string3, boolean bl2) {
        this.e.w(string2, string3, bl2);
    }

    public void setMinAndMaxProgress(float f5, float f6) {
        this.e.x(f5, f6);
    }

    public void setMinFrame(int n3) {
        this.e.y(n3);
    }

    public void setMinFrame(String string2) {
        this.e.z(string2);
    }

    public void setMinProgress(float f5) {
        this.e.A(f5);
    }

    public void setOutlineMasksAndMattes(boolean bl2) {
        Object object = this.e;
        boolean bl3 = ((yc1_1)((Object)object)).s;
        if (bl3 != bl2) {
            ((yc1_1)((Object)object)).s = bl2;
            object = ((yc1_1)((Object)object)).p;
            if (object != null) {
                ((g30_0)object).r(bl2);
            }
        }
    }

    public void setPerformanceTrackingEnabled(boolean bl2) {
        Object object = this.e;
        object.r = bl2;
        object = object.a;
        if (object != null) {
            object = ((QB1)object).a;
            ((Gq2)object).a = bl2;
        }
    }

    public void setProgress(float f5) {
        HashSet hashSet = this.k;
        LottieAnimationView$a lottieAnimationView$a = LottieAnimationView$a.SET_PROGRESS;
        hashSet.add(lottieAnimationView$a);
        this.e.B(f5);
    }

    public void setRenderMode(UI2 uI2) {
        yc1_1 yc1_12 = this.e;
        yc1_12.w = uI2;
        yc1_12.e();
    }

    public void setRepeatCount(int n3) {
        HashSet hashSet = this.k;
        LottieAnimationView$a lottieAnimationView$a = LottieAnimationView$a.SET_REPEAT_COUNT;
        hashSet.add(lottieAnimationView$a);
        this.e.b.setRepeatCount(n3);
    }

    public void setRepeatMode(int n3) {
        HashSet hashSet = this.k;
        LottieAnimationView$a lottieAnimationView$a = LottieAnimationView$a.SET_REPEAT_MODE;
        hashSet.add(lottieAnimationView$a);
        this.e.b.setRepeatMode(n3);
    }

    public void setSafeMode(boolean bl2) {
        this.e.e = bl2;
    }

    public void setSpeed(float f5) {
        this.e.b.d = f5;
    }

    public void setTextDelegate(Lj3 lj3) {
        ((Object)((Object)this.e)).getClass();
    }

    public void setUseCompositionFrameRate(boolean bl2) {
        this.e.b.n = bl2;
    }

    public final void unscheduleDrawable(Drawable drawable2) {
        boolean bl2;
        yc1_1 yc1_12;
        boolean bl3 = this.h;
        if (!bl3 && drawable2 == (yc1_12 = this.e) && (bl2 = yc1_12.k())) {
            bl2 = false;
            this.i = false;
            yc1_12.l();
        } else {
            bl3 = this.h;
            if (!bl3 && (bl3 = drawable2 instanceof yc1_1)) {
                yc1_12 = drawable2;
                yc1_12 = (yc1_1)drawable2;
                bl2 = yc1_12.k();
                if (bl2) {
                    yc1_12.l();
                }
            }
        }
        super.unscheduleDrawable(drawable2);
    }
}

