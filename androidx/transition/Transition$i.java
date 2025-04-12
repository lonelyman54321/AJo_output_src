/*
 * Decompiled with CFR 0.152.
 */
package androidx.transition;

import androidx.transition.Transition;

public interface Transition$i {
    public void onTransitionCancel(Transition var1);

    public void onTransitionEnd(Transition var1);

    public void onTransitionEnd(Transition var1, boolean var2);

    public void onTransitionPause(Transition var1);

    public void onTransitionResume(Transition var1);

    public void onTransitionStart(Transition var1);

    public void onTransitionStart(Transition var1, boolean var2);
}

