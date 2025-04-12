/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.Animator
 *  android.animation.Animator$AnimatorListener
 */
import android.animation.Animator;

public final class PU
implements Animator.AnimatorListener {
    public final /* synthetic */ QU$a a;
    public final /* synthetic */ QU b;

    public PU(QU qU, QU$a qU$a) {
        this.b = qU;
        this.a = qU$a;
    }

    public final void onAnimationCancel(Animator animator2) {
    }

    public final void onAnimationEnd(Animator animator2) {
    }

    public final void onAnimationRepeat(Animator animator2) {
        float f5;
        QU qU = this.b;
        float f6 = 1.0f;
        QU$a qU$a = this.a;
        int n3 = 1;
        qU.a(f6, qU$a, n3 != 0);
        qU$a.k = f5 = qU$a.e;
        qU$a.l = f5 = qU$a.f;
        qU$a.m = f5 = qU$a.g;
        int n4 = qU$a.j + n3;
        int[] nArray = qU$a.i;
        n3 = nArray.length;
        qU$a.a(n4 %= n3);
        n3 = qU.f ? 1 : 0;
        if (n3 != 0) {
            f6 = 0.0f;
            qU.f = false;
            animator2.cancel();
            long l2 = 1332L;
            animator2.setDuration(l2);
            animator2.start();
            boolean bl2 = qU$a.n;
            if (bl2) {
                qU$a.n = false;
            }
        } else {
            float f7;
            qU.e = f7 = qU.e + f6;
        }
    }

    public final void onAnimationStart(Animator animator2) {
        this.b.e = 0.0f;
    }
}

