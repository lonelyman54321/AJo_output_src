/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.Animator
 *  android.animation.Animator$AnimatorListener
 *  android.animation.ObjectAnimator
 *  android.animation.PropertyValuesHolder
 *  android.content.Context
 *  android.util.Property
 *  android.view.View
 *  android.view.ViewGroup
 */
package com.google.android.material.transition.platform;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.R$dimen;
import com.google.android.material.transition.platform.SlideDistanceProvider$1;
import com.google.android.material.transition.platform.SlideDistanceProvider$2;
import com.google.android.material.transition.platform.VisibilityAnimatorProvider;

public final class SlideDistanceProvider
implements VisibilityAnimatorProvider {
    private static final int DEFAULT_DISTANCE = 255;
    private int slideDistance = -1;
    private int slideEdge;

    public SlideDistanceProvider(int n3) {
        this.slideEdge = n3;
    }

    private static Animator createTranslationAppearAnimator(View object, View object2, int n3, int n4) {
        float f5 = object2.getTranslationX();
        float f6 = object2.getTranslationY();
        int n7 = 3;
        if (n3 != n7) {
            n7 = 5;
            if (n3 != n7) {
                n7 = 48;
                if (n3 != n7) {
                    n7 = 80;
                    if (n3 != n7) {
                        float f7;
                        int n8 = 0x800003;
                        f6 = 1.1754948E-38f;
                        if (n3 != n8) {
                            n8 = 0x800005;
                            f6 = 1.175495E-38f;
                            if (n3 == n8) {
                                float f8;
                                boolean bl2 = SlideDistanceProvider.isRtl(object);
                                if (bl2) {
                                    f8 = n4;
                                    f8 = f5 - f8;
                                } else {
                                    f8 = (float)n4 + f5;
                                }
                                return SlideDistanceProvider.createTranslationXAnimator(object2, f8, f5, f5);
                            }
                            object2 = hj0_0.a(n3, "Invalid slide direction: ");
                            object = new IllegalArgumentException((String)object2);
                            throw object;
                        }
                        boolean bl3 = SlideDistanceProvider.isRtl(object);
                        if (bl3) {
                            f7 = (float)n4 + f5;
                        } else {
                            f7 = n4;
                            f7 = f5 - f7;
                        }
                        return SlideDistanceProvider.createTranslationXAnimator(object2, f7, f5, f5);
                    }
                    float f11 = (float)n4 + f6;
                    return SlideDistanceProvider.createTranslationYAnimator(object2, f11, f6, f6);
                }
                float f12 = n4;
                f12 = f6 - f12;
                return SlideDistanceProvider.createTranslationYAnimator(object2, f12, f6, f6);
            }
            float f14 = n4;
            f14 = f5 - f14;
            return SlideDistanceProvider.createTranslationXAnimator(object2, f14, f5, f5);
        }
        float f15 = (float)n4 + f5;
        return SlideDistanceProvider.createTranslationXAnimator(object2, f15, f5, f5);
    }

    private static Animator createTranslationDisappearAnimator(View object, View object2, int n3, int n4) {
        float f5 = object2.getTranslationX();
        float f6 = object2.getTranslationY();
        int n7 = 3;
        if (n3 != n7) {
            n7 = 5;
            if (n3 != n7) {
                n7 = 48;
                if (n3 != n7) {
                    n7 = 80;
                    if (n3 != n7) {
                        float f7;
                        int n8 = 0x800003;
                        f6 = 1.1754948E-38f;
                        if (n3 != n8) {
                            n8 = 0x800005;
                            f6 = 1.175495E-38f;
                            if (n3 == n8) {
                                float f8;
                                boolean bl2 = SlideDistanceProvider.isRtl(object);
                                if (bl2) {
                                    f8 = (float)n4 + f5;
                                } else {
                                    f8 = n4;
                                    f8 = f5 - f8;
                                }
                                return SlideDistanceProvider.createTranslationXAnimator(object2, f5, f8, f5);
                            }
                            object2 = hj0_0.a(n3, "Invalid slide direction: ");
                            object = new IllegalArgumentException((String)object2);
                            throw object;
                        }
                        boolean bl3 = SlideDistanceProvider.isRtl(object);
                        if (bl3) {
                            f7 = n4;
                            f7 = f5 - f7;
                        } else {
                            f7 = (float)n4 + f5;
                        }
                        return SlideDistanceProvider.createTranslationXAnimator(object2, f5, f7, f5);
                    }
                    float f11 = n4;
                    f11 = f6 - f11;
                    return SlideDistanceProvider.createTranslationYAnimator(object2, f6, f11, f6);
                }
                float f12 = (float)n4 + f6;
                return SlideDistanceProvider.createTranslationYAnimator(object2, f6, f12, f6);
            }
            float f14 = (float)n4 + f5;
            return SlideDistanceProvider.createTranslationXAnimator(object2, f5, f14, f5);
        }
        float f15 = n4;
        f15 = f5 - f15;
        return SlideDistanceProvider.createTranslationXAnimator(object2, f5, f15, f5);
    }

    private static Animator createTranslationXAnimator(View view, float f5, float f6, float f7) {
        Property property = View.TRANSLATION_X;
        float[] fArray = new float[2];
        fArray[0] = f5;
        int n3 = 1;
        fArray[n3] = f6;
        Object object = PropertyValuesHolder.ofFloat((Property)property, (float[])fArray);
        ObjectAnimator objectAnimator = new PropertyValuesHolder[n3];
        objectAnimator[0] = object;
        objectAnimator = ObjectAnimator.ofPropertyValuesHolder((Object)view, (PropertyValuesHolder[])objectAnimator);
        object = new SlideDistanceProvider$1(view, f7);
        objectAnimator.addListener((Animator.AnimatorListener)object);
        return objectAnimator;
    }

    private static Animator createTranslationYAnimator(View view, float f5, float f6, float f7) {
        Property property = View.TRANSLATION_Y;
        float[] fArray = new float[2];
        fArray[0] = f5;
        int n3 = 1;
        fArray[n3] = f6;
        Object object = PropertyValuesHolder.ofFloat((Property)property, (float[])fArray);
        ObjectAnimator objectAnimator = new PropertyValuesHolder[n3];
        objectAnimator[0] = object;
        objectAnimator = ObjectAnimator.ofPropertyValuesHolder((Object)view, (PropertyValuesHolder[])objectAnimator);
        object = new SlideDistanceProvider$2(view, f7);
        objectAnimator.addListener((Animator.AnimatorListener)object);
        return objectAnimator;
    }

    private int getSlideDistanceOrDefault(Context context) {
        int n3 = this.slideDistance;
        int n4 = -1;
        if (n3 != n4) {
            return n3;
        }
        context = context.getResources();
        n3 = R$dimen.mtrl_transition_shared_axis_slide_distance;
        return context.getDimensionPixelSize(n3);
    }

    private static boolean isRtl(View view) {
        int n3;
        int n4 = view.getLayoutDirection();
        if (n4 != (n3 = 1)) {
            n3 = 0;
        }
        return n3 != 0;
    }

    public Animator createAppear(ViewGroup viewGroup, View view) {
        int n3 = this.slideEdge;
        Context context = view.getContext();
        int n4 = this.getSlideDistanceOrDefault(context);
        return SlideDistanceProvider.createTranslationAppearAnimator((View)viewGroup, view, n3, n4);
    }

    public Animator createDisappear(ViewGroup viewGroup, View view) {
        int n3 = this.slideEdge;
        Context context = view.getContext();
        int n4 = this.getSlideDistanceOrDefault(context);
        return SlideDistanceProvider.createTranslationDisappearAnimator((View)viewGroup, view, n3, n4);
    }

    public int getSlideDistance() {
        return this.slideDistance;
    }

    public int getSlideEdge() {
        return this.slideEdge;
    }

    public void setSlideDistance(int n3) {
        if (n3 >= 0) {
            this.slideDistance = n3;
            return;
        }
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Slide distance must be positive. If attempting to reverse the direction of the slide, use setSlideEdge(int) instead.");
        throw illegalArgumentException;
    }

    public void setSlideEdge(int n3) {
        this.slideEdge = n3;
    }
}

