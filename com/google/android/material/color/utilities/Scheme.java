/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.material.color.utilities;

import com.google.android.material.color.utilities.CorePalette;
import com.google.android.material.color.utilities.TonalPalette;

public class Scheme {
    private int background;
    private int error;
    private int errorContainer;
    private int inverseOnSurface;
    private int inversePrimary;
    private int inverseSurface;
    private int onBackground;
    private int onError;
    private int onErrorContainer;
    private int onPrimary;
    private int onPrimaryContainer;
    private int onSecondary;
    private int onSecondaryContainer;
    private int onSurface;
    private int onSurfaceVariant;
    private int onTertiary;
    private int onTertiaryContainer;
    private int outline;
    private int outlineVariant;
    private int primary;
    private int primaryContainer;
    private int scrim;
    private int secondary;
    private int secondaryContainer;
    private int shadow;
    private int surface;
    private int surfaceVariant;
    private int tertiary;
    private int tertiaryContainer;

    public Scheme() {
    }

    public Scheme(int n3, int n4, int n7, int n8, int n10, int n14, int n15, int n16, int n17, int n18, int n19, int n20, int n21, int n22, int n24, int n25, int n26, int n27, int n28, int n29, int n30, int n32, int n34, int n35, int n36, int n37, int n38, int n39, int n41) {
        this.primary = n3;
        this.onPrimary = n4;
        this.primaryContainer = n7;
        this.onPrimaryContainer = n8;
        this.secondary = n10;
        this.onSecondary = n14;
        this.secondaryContainer = n15;
        this.onSecondaryContainer = n16;
        this.tertiary = n17;
        this.onTertiary = n18;
        this.tertiaryContainer = n19;
        this.onTertiaryContainer = n20;
        this.error = n21;
        this.onError = n22;
        this.errorContainer = n24;
        this.onErrorContainer = n25;
        this.background = n26;
        this.onBackground = n27;
        this.surface = n28;
        this.onSurface = n29;
        this.surfaceVariant = n30;
        this.onSurfaceVariant = n32;
        this.outline = n34;
        this.outlineVariant = n35;
        this.shadow = n36;
        this.scrim = n37;
        this.inverseSurface = n38;
        this.inverseOnSurface = n39;
        this.inversePrimary = n41;
    }

    public static Scheme dark(int n3) {
        return Scheme.darkFromCorePalette(CorePalette.of(n3));
    }

    public static Scheme darkContent(int n3) {
        return Scheme.darkFromCorePalette(CorePalette.contentOf(n3));
    }

    private static Scheme darkFromCorePalette(CorePalette corePalette) {
        Scheme scheme = new Scheme();
        TonalPalette tonalPalette = corePalette.a1;
        int n3 = 80;
        int n4 = tonalPalette.tone(n3);
        scheme = scheme.withPrimary(n4);
        tonalPalette = corePalette.a1;
        int n7 = 20;
        n4 = tonalPalette.tone(n7);
        scheme = scheme.withOnPrimary(n4);
        tonalPalette = corePalette.a1;
        int n8 = 30;
        n4 = tonalPalette.tone(n8);
        scheme = scheme.withPrimaryContainer(n4);
        tonalPalette = corePalette.a1;
        int n10 = 90;
        n4 = tonalPalette.tone(n10);
        scheme = scheme.withOnPrimaryContainer(n4);
        n4 = corePalette.a2.tone(n3);
        scheme = scheme.withSecondary(n4);
        n4 = corePalette.a2.tone(n7);
        scheme = scheme.withOnSecondary(n4);
        n4 = corePalette.a2.tone(n8);
        scheme = scheme.withSecondaryContainer(n4);
        n4 = corePalette.a2.tone(n10);
        scheme = scheme.withOnSecondaryContainer(n4);
        n4 = corePalette.a3.tone(n3);
        scheme = scheme.withTertiary(n4);
        n4 = corePalette.a3.tone(n7);
        scheme = scheme.withOnTertiary(n4);
        n4 = corePalette.a3.tone(n8);
        scheme = scheme.withTertiaryContainer(n4);
        n4 = corePalette.a3.tone(n10);
        scheme = scheme.withOnTertiaryContainer(n4);
        n4 = corePalette.error.tone(n3);
        scheme = scheme.withError(n4);
        n4 = corePalette.error.tone(n7);
        scheme = scheme.withOnError(n4);
        n4 = corePalette.error.tone(n8);
        scheme = scheme.withErrorContainer(n4);
        n4 = corePalette.error.tone(n3);
        scheme = scheme.withOnErrorContainer(n4);
        tonalPalette = corePalette.n1;
        int n14 = 10;
        n4 = tonalPalette.tone(n14);
        scheme = scheme.withBackground(n4);
        n4 = corePalette.n1.tone(n10);
        scheme = scheme.withOnBackground(n4);
        n4 = corePalette.n1.tone(n14);
        scheme = scheme.withSurface(n4);
        n4 = corePalette.n1.tone(n10);
        scheme = scheme.withOnSurface(n4);
        n4 = corePalette.n2.tone(n8);
        scheme = scheme.withSurfaceVariant(n4);
        n4 = corePalette.n2.tone(n3);
        scheme = scheme.withOnSurfaceVariant(n4);
        n4 = corePalette.n2.tone(60);
        scheme = scheme.withOutline(n4);
        n4 = corePalette.n2.tone(n8);
        scheme = scheme.withOutlineVariant(n4);
        n4 = corePalette.n1.tone(0);
        scheme = scheme.withShadow(n4);
        n4 = corePalette.n1.tone(0);
        scheme = scheme.withScrim(n4);
        n4 = corePalette.n1.tone(n10);
        scheme = scheme.withInverseSurface(n4);
        n4 = corePalette.n1.tone(n7);
        scheme = scheme.withInverseOnSurface(n4);
        int n15 = corePalette.a1.tone(40);
        return scheme.withInversePrimary(n15);
    }

    public static Scheme light(int n3) {
        return Scheme.lightFromCorePalette(CorePalette.of(n3));
    }

    public static Scheme lightContent(int n3) {
        return Scheme.lightFromCorePalette(CorePalette.contentOf(n3));
    }

    private static Scheme lightFromCorePalette(CorePalette corePalette) {
        Scheme scheme = new Scheme();
        TonalPalette tonalPalette = corePalette.a1;
        int n3 = 40;
        int n4 = tonalPalette.tone(n3);
        scheme = scheme.withPrimary(n4);
        tonalPalette = corePalette.a1;
        int n7 = 100;
        n4 = tonalPalette.tone(n7);
        scheme = scheme.withOnPrimary(n4);
        tonalPalette = corePalette.a1;
        int n8 = 90;
        n4 = tonalPalette.tone(n8);
        scheme = scheme.withPrimaryContainer(n4);
        tonalPalette = corePalette.a1;
        int n10 = 10;
        n4 = tonalPalette.tone(n10);
        scheme = scheme.withOnPrimaryContainer(n4);
        n4 = corePalette.a2.tone(n3);
        scheme = scheme.withSecondary(n4);
        n4 = corePalette.a2.tone(n7);
        scheme = scheme.withOnSecondary(n4);
        n4 = corePalette.a2.tone(n8);
        scheme = scheme.withSecondaryContainer(n4);
        n4 = corePalette.a2.tone(n10);
        scheme = scheme.withOnSecondaryContainer(n4);
        n4 = corePalette.a3.tone(n3);
        scheme = scheme.withTertiary(n4);
        n4 = corePalette.a3.tone(n7);
        scheme = scheme.withOnTertiary(n4);
        n4 = corePalette.a3.tone(n8);
        scheme = scheme.withTertiaryContainer(n4);
        n4 = corePalette.a3.tone(n10);
        scheme = scheme.withOnTertiaryContainer(n4);
        n4 = corePalette.error.tone(n3);
        scheme = scheme.withError(n4);
        n4 = corePalette.error.tone(n7);
        scheme = scheme.withOnError(n4);
        n4 = corePalette.error.tone(n8);
        scheme = scheme.withErrorContainer(n4);
        n4 = corePalette.error.tone(n10);
        scheme = scheme.withOnErrorContainer(n4);
        tonalPalette = corePalette.n1;
        n3 = 99;
        n4 = tonalPalette.tone(n3);
        scheme = scheme.withBackground(n4);
        n4 = corePalette.n1.tone(n10);
        scheme = scheme.withOnBackground(n4);
        n4 = corePalette.n1.tone(n3);
        scheme = scheme.withSurface(n4);
        n4 = corePalette.n1.tone(n10);
        scheme = scheme.withOnSurface(n4);
        n4 = corePalette.n2.tone(n8);
        scheme = scheme.withSurfaceVariant(n4);
        n4 = corePalette.n2.tone(30);
        scheme = scheme.withOnSurfaceVariant(n4);
        n4 = corePalette.n2.tone(50);
        scheme = scheme.withOutline(n4);
        tonalPalette = corePalette.n2;
        n3 = 80;
        n4 = tonalPalette.tone(n3);
        scheme = scheme.withOutlineVariant(n4);
        n4 = corePalette.n1.tone(0);
        scheme = scheme.withShadow(n4);
        n4 = corePalette.n1.tone(0);
        scheme = scheme.withScrim(n4);
        n4 = corePalette.n1.tone(20);
        scheme = scheme.withInverseSurface(n4);
        n4 = corePalette.n1.tone(95);
        scheme = scheme.withInverseOnSurface(n4);
        int n14 = corePalette.a1.tone(n3);
        return scheme.withInversePrimary(n14);
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        int n3 = object instanceof Scheme;
        if (n3 == 0) {
            return false;
        }
        n3 = super.equals(object);
        if (n3 == 0) {
            return false;
        }
        object = (Scheme)object;
        n3 = this.primary;
        int n4 = ((Scheme)object).primary;
        if (n3 != n4) {
            return false;
        }
        n3 = this.onPrimary;
        n4 = ((Scheme)object).onPrimary;
        if (n3 != n4) {
            return false;
        }
        n3 = this.primaryContainer;
        n4 = ((Scheme)object).primaryContainer;
        if (n3 != n4) {
            return false;
        }
        n3 = this.onPrimaryContainer;
        n4 = ((Scheme)object).onPrimaryContainer;
        if (n3 != n4) {
            return false;
        }
        n3 = this.secondary;
        n4 = ((Scheme)object).secondary;
        if (n3 != n4) {
            return false;
        }
        n3 = this.onSecondary;
        n4 = ((Scheme)object).onSecondary;
        if (n3 != n4) {
            return false;
        }
        n3 = this.secondaryContainer;
        n4 = ((Scheme)object).secondaryContainer;
        if (n3 != n4) {
            return false;
        }
        n3 = this.onSecondaryContainer;
        n4 = ((Scheme)object).onSecondaryContainer;
        if (n3 != n4) {
            return false;
        }
        n3 = this.tertiary;
        n4 = ((Scheme)object).tertiary;
        if (n3 != n4) {
            return false;
        }
        n3 = this.onTertiary;
        n4 = ((Scheme)object).onTertiary;
        if (n3 != n4) {
            return false;
        }
        n3 = this.tertiaryContainer;
        n4 = ((Scheme)object).tertiaryContainer;
        if (n3 != n4) {
            return false;
        }
        n3 = this.onTertiaryContainer;
        n4 = ((Scheme)object).onTertiaryContainer;
        if (n3 != n4) {
            return false;
        }
        n3 = this.error;
        n4 = ((Scheme)object).error;
        if (n3 != n4) {
            return false;
        }
        n3 = this.onError;
        n4 = ((Scheme)object).onError;
        if (n3 != n4) {
            return false;
        }
        n3 = this.errorContainer;
        n4 = ((Scheme)object).errorContainer;
        if (n3 != n4) {
            return false;
        }
        n3 = this.onErrorContainer;
        n4 = ((Scheme)object).onErrorContainer;
        if (n3 != n4) {
            return false;
        }
        n3 = this.background;
        n4 = ((Scheme)object).background;
        if (n3 != n4) {
            return false;
        }
        n3 = this.onBackground;
        n4 = ((Scheme)object).onBackground;
        if (n3 != n4) {
            return false;
        }
        n3 = this.surface;
        n4 = ((Scheme)object).surface;
        if (n3 != n4) {
            return false;
        }
        n3 = this.onSurface;
        n4 = ((Scheme)object).onSurface;
        if (n3 != n4) {
            return false;
        }
        n3 = this.surfaceVariant;
        n4 = ((Scheme)object).surfaceVariant;
        if (n3 != n4) {
            return false;
        }
        n3 = this.onSurfaceVariant;
        n4 = ((Scheme)object).onSurfaceVariant;
        if (n3 != n4) {
            return false;
        }
        n3 = this.outline;
        n4 = ((Scheme)object).outline;
        if (n3 != n4) {
            return false;
        }
        n3 = this.outlineVariant;
        n4 = ((Scheme)object).outlineVariant;
        if (n3 != n4) {
            return false;
        }
        n3 = this.shadow;
        n4 = ((Scheme)object).shadow;
        if (n3 != n4) {
            return false;
        }
        n3 = this.scrim;
        n4 = ((Scheme)object).scrim;
        if (n3 != n4) {
            return false;
        }
        n3 = this.inverseSurface;
        n4 = ((Scheme)object).inverseSurface;
        if (n3 != n4) {
            return false;
        }
        n3 = this.inverseOnSurface;
        n4 = ((Scheme)object).inverseOnSurface;
        if (n3 != n4) {
            return false;
        }
        n3 = this.inversePrimary;
        int n7 = ((Scheme)object).inversePrimary;
        if (n3 != n7) {
            return false;
        }
        return bl2;
    }

    public int getBackground() {
        return this.background;
    }

    public int getError() {
        return this.error;
    }

    public int getErrorContainer() {
        return this.errorContainer;
    }

    public int getInverseOnSurface() {
        return this.inverseOnSurface;
    }

    public int getInversePrimary() {
        return this.inversePrimary;
    }

    public int getInverseSurface() {
        return this.inverseSurface;
    }

    public int getOnBackground() {
        return this.onBackground;
    }

    public int getOnError() {
        return this.onError;
    }

    public int getOnErrorContainer() {
        return this.onErrorContainer;
    }

    public int getOnPrimary() {
        return this.onPrimary;
    }

    public int getOnPrimaryContainer() {
        return this.onPrimaryContainer;
    }

    public int getOnSecondary() {
        return this.onSecondary;
    }

    public int getOnSecondaryContainer() {
        return this.onSecondaryContainer;
    }

    public int getOnSurface() {
        return this.onSurface;
    }

    public int getOnSurfaceVariant() {
        return this.onSurfaceVariant;
    }

    public int getOnTertiary() {
        return this.onTertiary;
    }

    public int getOnTertiaryContainer() {
        return this.onTertiaryContainer;
    }

    public int getOutline() {
        return this.outline;
    }

    public int getOutlineVariant() {
        return this.outlineVariant;
    }

    public int getPrimary() {
        return this.primary;
    }

    public int getPrimaryContainer() {
        return this.primaryContainer;
    }

    public int getScrim() {
        return this.scrim;
    }

    public int getSecondary() {
        return this.secondary;
    }

    public int getSecondaryContainer() {
        return this.secondaryContainer;
    }

    public int getShadow() {
        return this.shadow;
    }

    public int getSurface() {
        return this.surface;
    }

    public int getSurfaceVariant() {
        return this.surfaceVariant;
    }

    public int getTertiary() {
        return this.tertiary;
    }

    public int getTertiaryContainer() {
        return this.tertiaryContainer;
    }

    public int hashCode() {
        int n3 = super.hashCode() * 31;
        int n4 = this.primary;
        n3 = (n3 + n4) * 31;
        n4 = this.onPrimary;
        n3 = (n3 + n4) * 31;
        n4 = this.primaryContainer;
        n3 = (n3 + n4) * 31;
        n4 = this.onPrimaryContainer;
        n3 = (n3 + n4) * 31;
        n4 = this.secondary;
        n3 = (n3 + n4) * 31;
        n4 = this.onSecondary;
        n3 = (n3 + n4) * 31;
        n4 = this.secondaryContainer;
        n3 = (n3 + n4) * 31;
        n4 = this.onSecondaryContainer;
        n3 = (n3 + n4) * 31;
        n4 = this.tertiary;
        n3 = (n3 + n4) * 31;
        n4 = this.onTertiary;
        n3 = (n3 + n4) * 31;
        n4 = this.tertiaryContainer;
        n3 = (n3 + n4) * 31;
        n4 = this.onTertiaryContainer;
        n3 = (n3 + n4) * 31;
        n4 = this.error;
        n3 = (n3 + n4) * 31;
        n4 = this.onError;
        n3 = (n3 + n4) * 31;
        n4 = this.errorContainer;
        n3 = (n3 + n4) * 31;
        n4 = this.onErrorContainer;
        n3 = (n3 + n4) * 31;
        n4 = this.background;
        n3 = (n3 + n4) * 31;
        n4 = this.onBackground;
        n3 = (n3 + n4) * 31;
        n4 = this.surface;
        n3 = (n3 + n4) * 31;
        n4 = this.onSurface;
        n3 = (n3 + n4) * 31;
        n4 = this.surfaceVariant;
        n3 = (n3 + n4) * 31;
        n4 = this.onSurfaceVariant;
        n3 = (n3 + n4) * 31;
        n4 = this.outline;
        n3 = (n3 + n4) * 31;
        n4 = this.outlineVariant;
        n3 = (n3 + n4) * 31;
        n4 = this.shadow;
        n3 = (n3 + n4) * 31;
        n4 = this.scrim;
        n3 = (n3 + n4) * 31;
        n4 = this.inverseSurface;
        n3 = (n3 + n4) * 31;
        n4 = this.inverseOnSurface;
        n3 = (n3 + n4) * 31;
        n4 = this.inversePrimary;
        return n3 + n4;
    }

    public void setBackground(int n3) {
        this.background = n3;
    }

    public void setError(int n3) {
        this.error = n3;
    }

    public void setErrorContainer(int n3) {
        this.errorContainer = n3;
    }

    public void setInverseOnSurface(int n3) {
        this.inverseOnSurface = n3;
    }

    public void setInversePrimary(int n3) {
        this.inversePrimary = n3;
    }

    public void setInverseSurface(int n3) {
        this.inverseSurface = n3;
    }

    public void setOnBackground(int n3) {
        this.onBackground = n3;
    }

    public void setOnError(int n3) {
        this.onError = n3;
    }

    public void setOnErrorContainer(int n3) {
        this.onErrorContainer = n3;
    }

    public void setOnPrimary(int n3) {
        this.onPrimary = n3;
    }

    public void setOnPrimaryContainer(int n3) {
        this.onPrimaryContainer = n3;
    }

    public void setOnSecondary(int n3) {
        this.onSecondary = n3;
    }

    public void setOnSecondaryContainer(int n3) {
        this.onSecondaryContainer = n3;
    }

    public void setOnSurface(int n3) {
        this.onSurface = n3;
    }

    public void setOnSurfaceVariant(int n3) {
        this.onSurfaceVariant = n3;
    }

    public void setOnTertiary(int n3) {
        this.onTertiary = n3;
    }

    public void setOnTertiaryContainer(int n3) {
        this.onTertiaryContainer = n3;
    }

    public void setOutline(int n3) {
        this.outline = n3;
    }

    public void setOutlineVariant(int n3) {
        this.outlineVariant = n3;
    }

    public void setPrimary(int n3) {
        this.primary = n3;
    }

    public void setPrimaryContainer(int n3) {
        this.primaryContainer = n3;
    }

    public void setScrim(int n3) {
        this.scrim = n3;
    }

    public void setSecondary(int n3) {
        this.secondary = n3;
    }

    public void setSecondaryContainer(int n3) {
        this.secondaryContainer = n3;
    }

    public void setShadow(int n3) {
        this.shadow = n3;
    }

    public void setSurface(int n3) {
        this.surface = n3;
    }

    public void setSurfaceVariant(int n3) {
        this.surfaceVariant = n3;
    }

    public void setTertiary(int n3) {
        this.tertiary = n3;
    }

    public void setTertiaryContainer(int n3) {
        this.tertiaryContainer = n3;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("Scheme{primary=");
        int n3 = this.primary;
        stringBuilder.append(n3);
        stringBuilder.append(", onPrimary=");
        n3 = this.onPrimary;
        stringBuilder.append(n3);
        stringBuilder.append(", primaryContainer=");
        n3 = this.primaryContainer;
        stringBuilder.append(n3);
        stringBuilder.append(", onPrimaryContainer=");
        n3 = this.onPrimaryContainer;
        stringBuilder.append(n3);
        stringBuilder.append(", secondary=");
        n3 = this.secondary;
        stringBuilder.append(n3);
        stringBuilder.append(", onSecondary=");
        n3 = this.onSecondary;
        stringBuilder.append(n3);
        stringBuilder.append(", secondaryContainer=");
        n3 = this.secondaryContainer;
        stringBuilder.append(n3);
        stringBuilder.append(", onSecondaryContainer=");
        n3 = this.onSecondaryContainer;
        stringBuilder.append(n3);
        stringBuilder.append(", tertiary=");
        n3 = this.tertiary;
        stringBuilder.append(n3);
        stringBuilder.append(", onTertiary=");
        n3 = this.onTertiary;
        stringBuilder.append(n3);
        stringBuilder.append(", tertiaryContainer=");
        n3 = this.tertiaryContainer;
        stringBuilder.append(n3);
        stringBuilder.append(", onTertiaryContainer=");
        n3 = this.onTertiaryContainer;
        stringBuilder.append(n3);
        stringBuilder.append(", error=");
        n3 = this.error;
        stringBuilder.append(n3);
        stringBuilder.append(", onError=");
        n3 = this.onError;
        stringBuilder.append(n3);
        stringBuilder.append(", errorContainer=");
        n3 = this.errorContainer;
        stringBuilder.append(n3);
        stringBuilder.append(", onErrorContainer=");
        n3 = this.onErrorContainer;
        stringBuilder.append(n3);
        stringBuilder.append(", background=");
        n3 = this.background;
        stringBuilder.append(n3);
        stringBuilder.append(", onBackground=");
        n3 = this.onBackground;
        stringBuilder.append(n3);
        stringBuilder.append(", surface=");
        n3 = this.surface;
        stringBuilder.append(n3);
        stringBuilder.append(", onSurface=");
        n3 = this.onSurface;
        stringBuilder.append(n3);
        stringBuilder.append(", surfaceVariant=");
        n3 = this.surfaceVariant;
        stringBuilder.append(n3);
        stringBuilder.append(", onSurfaceVariant=");
        n3 = this.onSurfaceVariant;
        stringBuilder.append(n3);
        stringBuilder.append(", outline=");
        n3 = this.outline;
        stringBuilder.append(n3);
        stringBuilder.append(", outlineVariant=");
        n3 = this.outlineVariant;
        stringBuilder.append(n3);
        stringBuilder.append(", shadow=");
        n3 = this.shadow;
        stringBuilder.append(n3);
        stringBuilder.append(", scrim=");
        n3 = this.scrim;
        stringBuilder.append(n3);
        stringBuilder.append(", inverseSurface=");
        n3 = this.inverseSurface;
        stringBuilder.append(n3);
        stringBuilder.append(", inverseOnSurface=");
        n3 = this.inverseOnSurface;
        stringBuilder.append(n3);
        stringBuilder.append(", inversePrimary=");
        n3 = this.inversePrimary;
        return tu.a(stringBuilder, n3, '}');
    }

    public Scheme withBackground(int n3) {
        this.background = n3;
        return this;
    }

    public Scheme withError(int n3) {
        this.error = n3;
        return this;
    }

    public Scheme withErrorContainer(int n3) {
        this.errorContainer = n3;
        return this;
    }

    public Scheme withInverseOnSurface(int n3) {
        this.inverseOnSurface = n3;
        return this;
    }

    public Scheme withInversePrimary(int n3) {
        this.inversePrimary = n3;
        return this;
    }

    public Scheme withInverseSurface(int n3) {
        this.inverseSurface = n3;
        return this;
    }

    public Scheme withOnBackground(int n3) {
        this.onBackground = n3;
        return this;
    }

    public Scheme withOnError(int n3) {
        this.onError = n3;
        return this;
    }

    public Scheme withOnErrorContainer(int n3) {
        this.onErrorContainer = n3;
        return this;
    }

    public Scheme withOnPrimary(int n3) {
        this.onPrimary = n3;
        return this;
    }

    public Scheme withOnPrimaryContainer(int n3) {
        this.onPrimaryContainer = n3;
        return this;
    }

    public Scheme withOnSecondary(int n3) {
        this.onSecondary = n3;
        return this;
    }

    public Scheme withOnSecondaryContainer(int n3) {
        this.onSecondaryContainer = n3;
        return this;
    }

    public Scheme withOnSurface(int n3) {
        this.onSurface = n3;
        return this;
    }

    public Scheme withOnSurfaceVariant(int n3) {
        this.onSurfaceVariant = n3;
        return this;
    }

    public Scheme withOnTertiary(int n3) {
        this.onTertiary = n3;
        return this;
    }

    public Scheme withOnTertiaryContainer(int n3) {
        this.onTertiaryContainer = n3;
        return this;
    }

    public Scheme withOutline(int n3) {
        this.outline = n3;
        return this;
    }

    public Scheme withOutlineVariant(int n3) {
        this.outlineVariant = n3;
        return this;
    }

    public Scheme withPrimary(int n3) {
        this.primary = n3;
        return this;
    }

    public Scheme withPrimaryContainer(int n3) {
        this.primaryContainer = n3;
        return this;
    }

    public Scheme withScrim(int n3) {
        this.scrim = n3;
        return this;
    }

    public Scheme withSecondary(int n3) {
        this.secondary = n3;
        return this;
    }

    public Scheme withSecondaryContainer(int n3) {
        this.secondaryContainer = n3;
        return this;
    }

    public Scheme withShadow(int n3) {
        this.shadow = n3;
        return this;
    }

    public Scheme withSurface(int n3) {
        this.surface = n3;
        return this;
    }

    public Scheme withSurfaceVariant(int n3) {
        this.surfaceVariant = n3;
        return this;
    }

    public Scheme withTertiary(int n3) {
        this.tertiary = n3;
        return this;
    }

    public Scheme withTertiaryContainer(int n3) {
        this.tertiaryContainer = n3;
        return this;
    }
}

