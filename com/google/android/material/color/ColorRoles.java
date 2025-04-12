/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.material.color;

public final class ColorRoles {
    private final int accent;
    private final int accentContainer;
    private final int onAccent;
    private final int onAccentContainer;

    public ColorRoles(int n3, int n4, int n7, int n8) {
        this.accent = n3;
        this.onAccent = n4;
        this.accentContainer = n7;
        this.onAccentContainer = n8;
    }

    public int getAccent() {
        return this.accent;
    }

    public int getAccentContainer() {
        return this.accentContainer;
    }

    public int getOnAccent() {
        return this.onAccent;
    }

    public int getOnAccentContainer() {
        return this.onAccentContainer;
    }
}

