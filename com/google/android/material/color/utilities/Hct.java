/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.material.color.utilities;

import com.google.android.material.color.utilities.Cam16;
import com.google.android.material.color.utilities.ColorUtils;
import com.google.android.material.color.utilities.HctSolver;
import com.google.android.material.color.utilities.ViewingConditions;

public final class Hct {
    private int argb;
    private double chroma;
    private double hue;
    private double tone;

    private Hct(int n3) {
        this.setInternalState(n3);
    }

    public static Hct from(double d2, double d5, double d7) {
        int n3 = HctSolver.solveToInt(d2, d5, d7);
        Hct hct = new Hct(n3);
        return hct;
    }

    public static Hct fromInt(int n3) {
        Hct hct = new Hct(n3);
        return hct;
    }

    private void setInternalState(int n3) {
        double d2;
        double d5;
        this.argb = n3;
        Cam16 cam16 = Cam16.fromInt(n3);
        this.hue = d5 = cam16.getHue();
        this.chroma = d2 = cam16.getChroma();
        this.tone = d2 = ColorUtils.lstarFromArgb(n3);
    }

    public double getChroma() {
        return this.chroma;
    }

    public double getHue() {
        return this.hue;
    }

    public double getTone() {
        return this.tone;
    }

    public Hct inViewingConditions(ViewingConditions object) {
        object = Cam16.fromInt(this.toInt()).xyzInViewingConditions((ViewingConditions)object, null);
        Object object2 = object[0];
        int n3 = 1;
        Object object3 = object[n3];
        Object object4 = object[2];
        ViewingConditions viewingConditions = ViewingConditions.DEFAULT;
        Cam16 cam16 = Cam16.fromXyzInViewingConditions((double)object2, (double)object3, (double)object4, viewingConditions);
        double d2 = cam16.getHue();
        double d5 = cam16.getChroma();
        double d7 = ColorUtils.lstarFromY((double)object[n3]);
        return Hct.from(d2, d5, d7);
    }

    public void setChroma(double d2) {
        double d5 = this.hue;
        double d7 = this.tone;
        int n3 = HctSolver.solveToInt(d5, d2, d7);
        this.setInternalState(n3);
    }

    public void setHue(double d2) {
        double d5 = this.chroma;
        double d7 = this.tone;
        int n3 = HctSolver.solveToInt(d2, d5, d7);
        this.setInternalState(n3);
    }

    public void setTone(double d2) {
        double d5 = this.hue;
        double d7 = this.chroma;
        int n3 = HctSolver.solveToInt(d5, d7, d2);
        this.setInternalState(n3);
    }

    public int toInt() {
        return this.argb;
    }
}

