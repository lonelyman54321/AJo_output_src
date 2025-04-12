/*
 * Decompiled with CFR 0.152.
 */
package com.google.accompanist.insets;

import com.google.accompanist.insets.Insets;
import com.google.accompanist.insets.WindowInsets$Type$Companion;

public interface WindowInsets$Type
extends Insets {
    public static final WindowInsets$Type$Companion Companion = WindowInsets$Type$Companion.$$INSTANCE;

    public Insets getAnimatedInsets();

    public float getAnimationFraction();

    public boolean getAnimationInProgress();

    public int getBottom();

    public Insets getLayoutInsets();

    public int getLeft();

    public int getRight();

    public int getTop();

    public boolean isVisible();
}

