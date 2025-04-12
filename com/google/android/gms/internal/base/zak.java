/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Canvas
 *  android.graphics.ColorFilter
 *  android.graphics.Rect
 *  android.graphics.drawable.Drawable
 *  android.graphics.drawable.Drawable$Callback
 *  android.graphics.drawable.Drawable$ConstantState
 *  android.os.SystemClock
 */
package com.google.android.gms.internal.base;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import com.google.android.gms.internal.base.zai;
import com.google.android.gms.internal.base.zaj;

public final class zak
extends Drawable
implements Drawable.Callback {
    private int zaa;
    private long zab;
    private int zac;
    private int zad;
    private int zae;
    private int zaf;
    private boolean zag;
    private boolean zah;
    private zaj zai;
    private Drawable zaj;
    private Drawable zak;
    private boolean zal;
    private boolean zam;
    private boolean zan;
    private int zao;

    public zak(Drawable object, Drawable drawable2) {
        int n3;
        int n4;
        int n7 = 0;
        zaj zaj2 = null;
        this(null);
        if (object == null) {
            object = com.google.android.gms.internal.base.zai.zaa();
        }
        this.zaj = object;
        object.setCallback((Drawable.Callback)this);
        zaj2 = this.zai;
        int n8 = zaj2.zab;
        zaj2.zab = n4 = object.getChangingConfigurations() | n8;
        if (drawable2 == null) {
            drawable2 = com.google.android.gms.internal.base.zai.zaa();
        }
        this.zak = drawable2;
        drawable2.setCallback((Drawable.Callback)this);
        object = this.zai;
        n7 = object.zab;
        object.zab = n3 = drawable2.getChangingConfigurations() | n7;
    }

    public zak(zaj zaj2) {
        zaj zaj3;
        this.zaa = 0;
        this.zad = 255;
        this.zaf = 0;
        this.zag = true;
        this.zai = zaj3 = new zaj(zaj2);
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public final void draw(Canvas canvas) {
        Drawable drawable2;
        Drawable drawable3;
        int n3;
        int n4;
        int n7;
        block10: {
            block12: {
                block13: {
                    block11: {
                        void var7_13;
                        block9: {
                            long l2;
                            block5: {
                                void var7_11;
                                float f5;
                                float f6;
                                block8: {
                                    float f7;
                                    block7: {
                                        block6: {
                                            long l3;
                                            long l4;
                                            long l7;
                                            long l8;
                                            n7 = this.zaa;
                                            n4 = 2;
                                            f6 = 2.8E-45f;
                                            n3 = 0;
                                            int n8 = 1;
                                            if (n7 == n8) break block5;
                                            if (n7 != n4 || (l8 = (l7 = (l4 = this.zab) - (l3 = 0L)) == 0L ? 0 : (l7 < 0L ? -1 : 1)) < 0) break block6;
                                            l4 = SystemClock.uptimeMillis();
                                            l3 = this.zab;
                                            f7 = this.zae;
                                            f5 = (float)(l4 -= l3) / f7;
                                            n4 = 1065353216;
                                            f6 = 1.0f;
                                            float f8 = f5 - f6;
                                            Object object = f8 == 0.0f ? 0 : (f8 > 0.0f ? 1 : -1);
                                            if (object < 0) break block7;
                                            boolean bl2 = true;
                                            f7 = Float.MIN_VALUE;
                                            break block8;
                                        }
                                        boolean bl3 = true;
                                        float f11 = Float.MIN_VALUE;
                                        break block9;
                                    }
                                    boolean bl4 = false;
                                    f7 = 0.0f;
                                }
                                if (var7_11 != false) {
                                    this.zaa = 0;
                                }
                                f5 = Math.min(f5, f6);
                                n4 = this.zac;
                                f6 = (float)n4 * f5;
                                f5 = 0.0f;
                                this.zaf = n7 = (int)(f6 += 0.0f);
                                break block9;
                            }
                            this.zab = l2 = SystemClock.uptimeMillis();
                            this.zaa = n4;
                            boolean bl5 = false;
                            float f12 = 0.0f;
                        }
                        n7 = this.zaf;
                        n4 = (int)(this.zag ? 1 : 0);
                        drawable3 = this.zaj;
                        drawable2 = this.zak;
                        if (var7_13 == false) break block10;
                        if (n4 == 0) break block11;
                        if (n7 != 0) break block12;
                        break block13;
                    }
                    n3 = n7;
                }
                drawable3.draw(canvas);
                n7 = n3;
            }
            if (n7 == (n4 = this.zad)) {
                drawable2.setAlpha(n4);
                drawable2.draw(canvas);
            }
            return;
        }
        if (n4 != 0) {
            n4 = this.zad - n7;
            drawable3.setAlpha(n4);
            n3 = 1;
        }
        drawable3.draw(canvas);
        if (n3 != 0) {
            n4 = this.zad;
            drawable3.setAlpha(n4);
        }
        if (n7 > 0) {
            drawable2.setAlpha(n7);
            drawable2.draw(canvas);
            int n10 = this.zad;
            drawable2.setAlpha(n10);
        }
        this.invalidateSelf();
    }

    public final int getChangingConfigurations() {
        int n3 = super.getChangingConfigurations();
        zaj zaj2 = this.zai;
        int n4 = zaj2.zaa;
        int n7 = zaj2.zab;
        return (n3 |= n4) | n7;
    }

    public final Drawable.ConstantState getConstantState() {
        boolean bl2 = this.zac();
        if (bl2) {
            int n3;
            zaj zaj2 = this.zai;
            zaj2.zaa = n3 = this.getChangingConfigurations();
            return this.zai;
        }
        return null;
    }

    public final int getIntrinsicHeight() {
        int n3 = this.zaj.getIntrinsicHeight();
        int n4 = this.zak.getIntrinsicHeight();
        return Math.max(n3, n4);
    }

    public final int getIntrinsicWidth() {
        int n3 = this.zaj.getIntrinsicWidth();
        int n4 = this.zak.getIntrinsicWidth();
        return Math.max(n3, n4);
    }

    public final int getOpacity() {
        int n3 = this.zan;
        if (n3 == 0) {
            Drawable drawable2 = this.zaj;
            n3 = drawable2.getOpacity();
            Drawable drawable3 = this.zak;
            int n4 = drawable3.getOpacity();
            this.zao = n3 = Drawable.resolveOpacity((int)n3, (int)n4);
            n3 = 1;
            this.zan = n3;
        }
        return this.zao;
    }

    public final void invalidateDrawable(Drawable drawable2) {
        drawable2 = this.getCallback();
        if (drawable2 != null) {
            drawable2.invalidateDrawable((Drawable)this);
        }
    }

    public final Drawable mutate() {
        Object object;
        boolean bl2 = this.zah;
        if (!bl2 && (object = super.mutate()) == this) {
            bl2 = this.zac();
            if (bl2) {
                this.zaj.mutate();
                object = this.zak;
                object.mutate();
                this.zah = bl2 = true;
            } else {
                object = new IllegalStateException("One or more children of this LayerDrawable does not have constant state; this drawable cannot be mutated.");
                throw object;
            }
        }
        return this;
    }

    public final void onBoundsChange(Rect rect) {
        this.zaj.setBounds(rect);
        this.zak.setBounds(rect);
    }

    public final void scheduleDrawable(Drawable drawable2, Runnable runnable2, long l2) {
        drawable2 = this.getCallback();
        if (drawable2 != null) {
            drawable2.scheduleDrawable((Drawable)this, runnable2, l2);
        }
    }

    public final void setAlpha(int n3) {
        int n4 = this.zaf;
        int n7 = this.zad;
        if (n4 == n7) {
            this.zaf = n3;
        }
        this.zad = n3;
        this.invalidateSelf();
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.zaj.setColorFilter(colorFilter);
        this.zak.setColorFilter(colorFilter);
    }

    public final void unscheduleDrawable(Drawable drawable2, Runnable runnable2) {
        drawable2 = this.getCallback();
        if (drawable2 != null) {
            drawable2.unscheduleDrawable((Drawable)this, runnable2);
        }
    }

    public final Drawable zaa() {
        return this.zak;
    }

    public final void zab(int n3) {
        this.zac = n3 = this.zad;
        this.zaf = 0;
        this.zae = 250;
        this.zaa = 1;
        this.invalidateSelf();
    }

    public final boolean zac() {
        boolean bl2 = this.zal;
        if (!bl2) {
            Drawable.ConstantState constantState = this.zaj.getConstantState();
            boolean bl3 = false;
            boolean bl4 = true;
            if (constantState != null && (constantState = this.zak.getConstantState()) != null) {
                bl3 = true;
            }
            this.zam = bl3;
            this.zal = bl4;
        }
        return this.zam;
    }
}

