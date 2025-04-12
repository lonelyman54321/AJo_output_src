/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.Animator
 *  android.animation.Animator$AnimatorListener
 *  android.animation.Animator$AnimatorPauseListener
 *  android.animation.TimeInterpolator
 *  android.animation.ValueAnimator
 *  android.animation.ValueAnimator$AnimatorUpdateListener
 *  android.os.Build$VERSION
 */
import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.os.Build;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

public abstract class nw
extends ValueAnimator {
    public final CopyOnWriteArraySet a;
    public final CopyOnWriteArraySet b;
    public final CopyOnWriteArraySet c;

    public nw() {
        CopyOnWriteArraySet copyOnWriteArraySet;
        this.a = copyOnWriteArraySet = new CopyOnWriteArraySet();
        this.b = copyOnWriteArraySet = new CopyOnWriteArraySet();
        this.c = copyOnWriteArraySet = new CopyOnWriteArraySet();
    }

    public final void addListener(Animator.AnimatorListener animatorListener) {
        this.b.add(animatorListener);
    }

    public final void addPauseListener(Animator.AnimatorPauseListener animatorPauseListener) {
        this.c.add(animatorPauseListener);
    }

    public final void addUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.a.add(animatorUpdateListener);
    }

    public final void b(boolean bl2) {
        boolean bl3;
        Iterator iterator = this.b.iterator();
        while (bl3 = iterator.hasNext()) {
            Animator.AnimatorListener animatorListener = (Animator.AnimatorListener)iterator.next();
            int n3 = Build.VERSION.SDK_INT;
            int n4 = 26;
            if (n3 >= n4) {
                mw.a(animatorListener, (Animator)this, bl2);
                continue;
            }
            animatorListener.onAnimationEnd((Animator)this);
        }
    }

    public final void d() {
        boolean bl2;
        Iterator iterator = this.a.iterator();
        while (bl2 = iterator.hasNext()) {
            ValueAnimator.AnimatorUpdateListener animatorUpdateListener = (ValueAnimator.AnimatorUpdateListener)iterator.next();
            animatorUpdateListener.onAnimationUpdate((ValueAnimator)this);
        }
    }

    public final long getStartDelay() {
        UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException("LottieAnimator does not support getStartDelay.");
        throw unsupportedOperationException;
    }

    public final void removeAllListeners() {
        this.b.clear();
    }

    public final void removeAllUpdateListeners() {
        this.a.clear();
    }

    public final void removeListener(Animator.AnimatorListener animatorListener) {
        this.b.remove(animatorListener);
    }

    public final void removePauseListener(Animator.AnimatorPauseListener animatorPauseListener) {
        this.c.remove(animatorPauseListener);
    }

    public final void removeUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.a.remove(animatorUpdateListener);
    }

    public final ValueAnimator setDuration(long l2) {
        UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException("LottieAnimator does not support setDuration.");
        throw unsupportedOperationException;
    }

    public final void setInterpolator(TimeInterpolator object) {
        object = new UnsupportedOperationException("LottieAnimator does not support setInterpolator.");
        throw object;
    }

    public final void setStartDelay(long l2) {
        UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException("LottieAnimator does not support setStartDelay.");
        throw unsupportedOperationException;
    }
}

