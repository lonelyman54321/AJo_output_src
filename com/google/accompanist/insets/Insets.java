/*
 * Decompiled with CFR 0.152.
 */
package com.google.accompanist.insets;

import com.google.accompanist.insets.Insets$Companion;

public interface Insets {
    public static final Insets$Companion Companion = Insets$Companion.$$INSTANCE;

    public Insets copy(int var1, int var2, int var3, int var4);

    public int getBottom();

    public int getLeft();

    public int getRight();

    public int getTop();

    public Insets minus(Insets var1);

    public Insets plus(Insets var1);
}

