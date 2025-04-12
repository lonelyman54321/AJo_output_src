/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.CancellationSignal
 *  android.view.WindowInsetsAnimationControlListener
 *  android.view.WindowInsetsController
 *  android.view.animation.Interpolator
 *  android.view.animation.LinearInterpolator
 */
import android.os.CancellationSignal;
import android.view.WindowInsetsAnimationControlListener;
import android.view.WindowInsetsController;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;

public final class p53 {
    public static /* bridge */ /* synthetic */ void a(WindowInsetsController windowInsetsController, int n3, LinearInterpolator linearInterpolator, CancellationSignal cancellationSignal, WindowInsetsAnimationControlListener windowInsetsAnimationControlListener) {
        windowInsetsController.controlWindowInsetsAnimation(n3, (long)-1, (Interpolator)linearInterpolator, cancellationSignal, windowInsetsAnimationControlListener);
    }
}

