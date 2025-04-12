/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.platforminfo;

public final class KotlinDetector {
    private KotlinDetector() {
    }

    public static String detectVersion() {
        mo1_2 mo1_22;
        try {
            mo1_22 = mo1_2.f;
        }
        catch (NoClassDefFoundError noClassDefFoundError) {
            return null;
        }
        return mo1_22.toString();
    }
}

