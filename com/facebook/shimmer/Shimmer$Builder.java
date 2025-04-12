/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.TypedArray
 *  android.util.AttributeSet
 */
package com.facebook.shimmer;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.facebook.shimmer.R$styleable;
import com.facebook.shimmer.Shimmer;

public abstract class Shimmer$Builder {
    final Shimmer mShimmer;

    public Shimmer$Builder() {
        Shimmer shimmer;
        this.mShimmer = shimmer = new Shimmer();
    }

    private static float clamp(float f5, float f6, float f7) {
        f5 = Math.max(f5, f7);
        return Math.min(f6, f5);
    }

    public Shimmer build() {
        this.mShimmer.updateColors();
        this.mShimmer.updatePositions();
        return this.mShimmer;
    }

    public Shimmer$Builder consumeAttributes(Context context, AttributeSet attributeSet) {
        int[] nArray = R$styleable.ShimmerFrameLayout;
        context = context.obtainStyledAttributes(attributeSet, nArray, 0, 0);
        return this.consumeAttributes((TypedArray)context);
    }

    public Shimmer$Builder consumeAttributes(TypedArray typedArray) {
        int n3;
        Shimmer shimmer;
        long l2;
        int n4;
        long l3;
        float f5;
        float f6;
        int n7;
        Shimmer shimmer2;
        int n8 = R$styleable.ShimmerFrameLayout_shimmer_clip_to_children;
        if ((n8 = (int)(typedArray.hasValue(n8) ? 1 : 0)) != 0) {
            n8 = R$styleable.ShimmerFrameLayout_shimmer_clip_to_children;
            shimmer2 = this.mShimmer;
            n7 = shimmer2.clipToChildren;
            n8 = (int)(typedArray.getBoolean(n8, n7 != 0) ? 1 : 0);
            this.setClipToChildren(n8 != 0);
        }
        n8 = R$styleable.ShimmerFrameLayout_shimmer_auto_start;
        if ((n8 = (int)(typedArray.hasValue(n8) ? 1 : 0)) != 0) {
            n8 = R$styleable.ShimmerFrameLayout_shimmer_auto_start;
            shimmer2 = this.mShimmer;
            n7 = shimmer2.autoStart;
            n8 = (int)(typedArray.getBoolean(n8, n7 != 0) ? 1 : 0);
            this.setAutoStart(n8 != 0);
        }
        n8 = R$styleable.ShimmerFrameLayout_shimmer_base_alpha;
        if ((n8 = (int)(typedArray.hasValue(n8) ? 1 : 0)) != 0) {
            n8 = R$styleable.ShimmerFrameLayout_shimmer_base_alpha;
            n7 = 1050253722;
            f6 = 0.3f;
            f5 = typedArray.getFloat(n8, f6);
            this.setBaseAlpha(f5);
        }
        n8 = R$styleable.ShimmerFrameLayout_shimmer_highlight_alpha;
        if ((n8 = (int)(typedArray.hasValue(n8) ? 1 : 0)) != 0) {
            n8 = R$styleable.ShimmerFrameLayout_shimmer_highlight_alpha;
            n7 = 1065353216;
            f6 = 1.0f;
            f5 = typedArray.getFloat(n8, f6);
            this.setHighlightAlpha(f5);
        }
        n8 = R$styleable.ShimmerFrameLayout_shimmer_duration;
        if ((n8 = (int)(typedArray.hasValue(n8) ? 1 : 0)) != 0) {
            n8 = R$styleable.ShimmerFrameLayout_shimmer_duration;
            shimmer2 = this.mShimmer;
            l3 = shimmer2.animationDuration;
            n4 = (int)l3;
            n8 = typedArray.getInt(n8, n4);
            l2 = n8;
            this.setDuration(l2);
        }
        n8 = R$styleable.ShimmerFrameLayout_shimmer_repeat_count;
        if ((n8 = (int)(typedArray.hasValue(n8) ? 1 : 0)) != 0) {
            n8 = R$styleable.ShimmerFrameLayout_shimmer_repeat_count;
            shimmer2 = this.mShimmer;
            n7 = shimmer2.repeatCount;
            n8 = typedArray.getInt(n8, n7);
            this.setRepeatCount(n8);
        }
        n8 = R$styleable.ShimmerFrameLayout_shimmer_repeat_delay;
        if ((n8 = (int)(typedArray.hasValue(n8) ? 1 : 0)) != 0) {
            n8 = R$styleable.ShimmerFrameLayout_shimmer_repeat_delay;
            shimmer2 = this.mShimmer;
            l3 = shimmer2.repeatDelay;
            n4 = (int)l3;
            n8 = typedArray.getInt(n8, n4);
            l2 = n8;
            this.setRepeatDelay(l2);
        }
        n8 = R$styleable.ShimmerFrameLayout_shimmer_repeat_mode;
        if ((n8 = (int)(typedArray.hasValue(n8) ? 1 : 0)) != 0) {
            n8 = R$styleable.ShimmerFrameLayout_shimmer_repeat_mode;
            shimmer2 = this.mShimmer;
            n7 = shimmer2.repeatMode;
            n8 = typedArray.getInt(n8, n7);
            this.setRepeatMode(n8);
        }
        n8 = R$styleable.ShimmerFrameLayout_shimmer_direction;
        n8 = (int)(typedArray.hasValue(n8) ? 1 : 0);
        n7 = 0;
        f6 = 0.0f;
        shimmer2 = null;
        n4 = 1;
        if (n8 != 0) {
            n8 = R$styleable.ShimmerFrameLayout_shimmer_direction;
            shimmer = this.mShimmer;
            n3 = shimmer.direction;
            if ((n8 = typedArray.getInt(n8, n3)) != n4) {
                n3 = 2;
                if (n8 != n3) {
                    n3 = 3;
                    if (n8 != n3) {
                        this.setDirection(0);
                    } else {
                        this.setDirection(n3);
                    }
                } else {
                    this.setDirection(n3);
                }
            } else {
                this.setDirection(n4);
            }
        }
        n8 = R$styleable.ShimmerFrameLayout_shimmer_shape;
        if ((n8 = (int)(typedArray.hasValue(n8) ? 1 : 0)) != 0) {
            n8 = R$styleable.ShimmerFrameLayout_shimmer_shape;
            shimmer = this.mShimmer;
            n3 = shimmer.shape;
            if ((n8 = typedArray.getInt(n8, n3)) != n4) {
                this.setShape(0);
            } else {
                this.setShape(n4);
            }
        }
        n8 = R$styleable.ShimmerFrameLayout_shimmer_dropoff;
        if ((n8 = (int)(typedArray.hasValue(n8) ? 1 : 0)) != 0) {
            n8 = R$styleable.ShimmerFrameLayout_shimmer_dropoff;
            shimmer2 = this.mShimmer;
            f6 = shimmer2.dropoff;
            f5 = typedArray.getFloat(n8, f6);
            this.setDropoff(f5);
        }
        n8 = R$styleable.ShimmerFrameLayout_shimmer_fixed_width;
        if ((n8 = (int)(typedArray.hasValue(n8) ? 1 : 0)) != 0) {
            n8 = R$styleable.ShimmerFrameLayout_shimmer_fixed_width;
            shimmer2 = this.mShimmer;
            n7 = shimmer2.fixedWidth;
            n8 = typedArray.getDimensionPixelSize(n8, n7);
            this.setFixedWidth(n8);
        }
        n8 = R$styleable.ShimmerFrameLayout_shimmer_fixed_height;
        if ((n8 = (int)(typedArray.hasValue(n8) ? 1 : 0)) != 0) {
            n8 = R$styleable.ShimmerFrameLayout_shimmer_fixed_height;
            shimmer2 = this.mShimmer;
            n7 = shimmer2.fixedHeight;
            n8 = typedArray.getDimensionPixelSize(n8, n7);
            this.setFixedHeight(n8);
        }
        n8 = R$styleable.ShimmerFrameLayout_shimmer_intensity;
        if ((n8 = (int)(typedArray.hasValue(n8) ? 1 : 0)) != 0) {
            n8 = R$styleable.ShimmerFrameLayout_shimmer_intensity;
            shimmer2 = this.mShimmer;
            f6 = shimmer2.intensity;
            f5 = typedArray.getFloat(n8, f6);
            this.setIntensity(f5);
        }
        n8 = R$styleable.ShimmerFrameLayout_shimmer_width_ratio;
        if ((n8 = (int)(typedArray.hasValue(n8) ? 1 : 0)) != 0) {
            n8 = R$styleable.ShimmerFrameLayout_shimmer_width_ratio;
            shimmer2 = this.mShimmer;
            f6 = shimmer2.widthRatio;
            f5 = typedArray.getFloat(n8, f6);
            this.setWidthRatio(f5);
        }
        n8 = R$styleable.ShimmerFrameLayout_shimmer_height_ratio;
        if ((n8 = (int)(typedArray.hasValue(n8) ? 1 : 0)) != 0) {
            n8 = R$styleable.ShimmerFrameLayout_shimmer_height_ratio;
            shimmer2 = this.mShimmer;
            f6 = shimmer2.heightRatio;
            f5 = typedArray.getFloat(n8, f6);
            this.setHeightRatio(f5);
        }
        n8 = R$styleable.ShimmerFrameLayout_shimmer_tilt;
        if ((n8 = (int)(typedArray.hasValue(n8) ? 1 : 0)) != 0) {
            n8 = R$styleable.ShimmerFrameLayout_shimmer_tilt;
            shimmer2 = this.mShimmer;
            f6 = shimmer2.tilt;
            float f7 = typedArray.getFloat(n8, f6);
            this.setTilt(f7);
        }
        return this.getThis();
    }

    public Shimmer$Builder copyFrom(Shimmer shimmer) {
        int n3;
        int n4;
        int n7 = shimmer.direction;
        this.setDirection(n7);
        n7 = shimmer.shape;
        this.setShape(n7);
        n7 = shimmer.fixedWidth;
        this.setFixedWidth(n7);
        n7 = shimmer.fixedHeight;
        this.setFixedHeight(n7);
        float f5 = shimmer.widthRatio;
        this.setWidthRatio(f5);
        f5 = shimmer.heightRatio;
        this.setHeightRatio(f5);
        f5 = shimmer.intensity;
        this.setIntensity(f5);
        f5 = shimmer.dropoff;
        this.setDropoff(f5);
        f5 = shimmer.tilt;
        this.setTilt(f5);
        n7 = (int)(shimmer.clipToChildren ? 1 : 0);
        this.setClipToChildren(n7 != 0);
        n7 = shimmer.autoStart;
        this.setAutoStart(n7 != 0);
        n7 = shimmer.repeatCount;
        this.setRepeatCount(n7);
        n7 = shimmer.repeatMode;
        this.setRepeatMode(n7);
        long l2 = shimmer.repeatDelay;
        this.setRepeatDelay(l2);
        l2 = shimmer.animationDuration;
        this.setDuration(l2);
        Shimmer shimmer2 = this.mShimmer;
        shimmer2.baseColor = n4 = shimmer.baseColor;
        shimmer2.highlightColor = n3 = shimmer.highlightColor;
        return this.getThis();
    }

    public abstract Shimmer$Builder getThis();

    public Shimmer$Builder setAutoStart(boolean bl2) {
        this.mShimmer.autoStart = bl2;
        return this.getThis();
    }

    public Shimmer$Builder setBaseAlpha(float f5) {
        int n3 = (int)(Shimmer$Builder.clamp(0.0f, 1.0f, f5) * 255.0f);
        Shimmer shimmer = this.mShimmer;
        n3 <<= 24;
        int n4 = shimmer.baseColor & 0xFFFFFF;
        shimmer.baseColor = n3 |= n4;
        return this.getThis();
    }

    public Shimmer$Builder setClipToChildren(boolean bl2) {
        this.mShimmer.clipToChildren = bl2;
        return this.getThis();
    }

    public Shimmer$Builder setDirection(int n3) {
        this.mShimmer.direction = n3;
        return this.getThis();
    }

    public Shimmer$Builder setDropoff(float f5) {
        IllegalArgumentException illegalArgumentException = null;
        float f6 = f5 - 0.0f;
        Object object = f6 == 0.0f ? 0 : (f6 < 0.0f ? -1 : 1);
        if (object >= 0) {
            this.mShimmer.dropoff = f5;
            return this.getThis();
        }
        StringBuilder stringBuilder = new StringBuilder("Given invalid dropoff value: ");
        stringBuilder.append(f5);
        String string2 = stringBuilder.toString();
        illegalArgumentException = new IllegalArgumentException(string2);
        throw illegalArgumentException;
    }

    public Shimmer$Builder setDuration(long l2) {
        long l3 = 0L;
        long l4 = l2 - l3;
        Object object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        if (object >= 0) {
            this.mShimmer.animationDuration = l2;
            return this.getThis();
        }
        String string2 = Wm2.a(l2, "Given a negative duration: ");
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException(string2);
        throw illegalArgumentException;
    }

    public Shimmer$Builder setFixedHeight(int n3) {
        if (n3 >= 0) {
            this.mShimmer.fixedHeight = n3;
            return this.getThis();
        }
        String string2 = hj0_0.a(n3, "Given invalid height: ");
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException(string2);
        throw illegalArgumentException;
    }

    public Shimmer$Builder setFixedWidth(int n3) {
        if (n3 >= 0) {
            this.mShimmer.fixedWidth = n3;
            return this.getThis();
        }
        String string2 = hj0_0.a(n3, "Given invalid width: ");
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException(string2);
        throw illegalArgumentException;
    }

    public Shimmer$Builder setHeightRatio(float f5) {
        IllegalArgumentException illegalArgumentException = null;
        float f6 = f5 - 0.0f;
        Object object = f6 == 0.0f ? 0 : (f6 < 0.0f ? -1 : 1);
        if (object >= 0) {
            this.mShimmer.heightRatio = f5;
            return this.getThis();
        }
        StringBuilder stringBuilder = new StringBuilder("Given invalid height ratio: ");
        stringBuilder.append(f5);
        String string2 = stringBuilder.toString();
        illegalArgumentException = new IllegalArgumentException(string2);
        throw illegalArgumentException;
    }

    public Shimmer$Builder setHighlightAlpha(float f5) {
        int n3 = (int)(Shimmer$Builder.clamp(0.0f, 1.0f, f5) * 255.0f);
        Shimmer shimmer = this.mShimmer;
        n3 <<= 24;
        int n4 = shimmer.highlightColor & 0xFFFFFF;
        shimmer.highlightColor = n3 |= n4;
        return this.getThis();
    }

    public Shimmer$Builder setIntensity(float f5) {
        IllegalArgumentException illegalArgumentException = null;
        float f6 = f5 - 0.0f;
        Object object = f6 == 0.0f ? 0 : (f6 < 0.0f ? -1 : 1);
        if (object >= 0) {
            this.mShimmer.intensity = f5;
            return this.getThis();
        }
        StringBuilder stringBuilder = new StringBuilder("Given invalid intensity value: ");
        stringBuilder.append(f5);
        String string2 = stringBuilder.toString();
        illegalArgumentException = new IllegalArgumentException(string2);
        throw illegalArgumentException;
    }

    public Shimmer$Builder setRepeatCount(int n3) {
        this.mShimmer.repeatCount = n3;
        return this.getThis();
    }

    public Shimmer$Builder setRepeatDelay(long l2) {
        long l3 = 0L;
        long l4 = l2 - l3;
        Object object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        if (object >= 0) {
            this.mShimmer.repeatDelay = l2;
            return this.getThis();
        }
        String string2 = Wm2.a(l2, "Given a negative repeat delay: ");
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException(string2);
        throw illegalArgumentException;
    }

    public Shimmer$Builder setRepeatMode(int n3) {
        this.mShimmer.repeatMode = n3;
        return this.getThis();
    }

    public Shimmer$Builder setShape(int n3) {
        this.mShimmer.shape = n3;
        return this.getThis();
    }

    public Shimmer$Builder setTilt(float f5) {
        this.mShimmer.tilt = f5;
        return this.getThis();
    }

    public Shimmer$Builder setWidthRatio(float f5) {
        IllegalArgumentException illegalArgumentException = null;
        float f6 = f5 - 0.0f;
        Object object = f6 == 0.0f ? 0 : (f6 < 0.0f ? -1 : 1);
        if (object >= 0) {
            this.mShimmer.widthRatio = f5;
            return this.getThis();
        }
        StringBuilder stringBuilder = new StringBuilder("Given invalid width ratio: ");
        stringBuilder.append(f5);
        String string2 = stringBuilder.toString();
        illegalArgumentException = new IllegalArgumentException(string2);
        throw illegalArgumentException;
    }
}

