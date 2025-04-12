/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.material.color.utilities;

import com.google.android.material.color.utilities.ContrastCurve;
import com.google.android.material.color.utilities.DislikeAnalyzer;
import com.google.android.material.color.utilities.DynamicColor;
import com.google.android.material.color.utilities.DynamicScheme;
import com.google.android.material.color.utilities.Hct;
import com.google.android.material.color.utilities.TonalPalette;
import com.google.android.material.color.utilities.ToneDeltaPair;
import com.google.android.material.color.utilities.TonePolarity;
import com.google.android.material.color.utilities.Variant;
import com.google.android.material.color.utilities.ViewingConditions;
import java.util.function.Function;

public final class MaterialDynamicColors {
    public static /* synthetic */ TonalPalette A(DynamicScheme dynamicScheme) {
        return dynamicScheme.primaryPalette;
    }

    public static /* synthetic */ Double A0(MaterialDynamicColors materialDynamicColors, DynamicScheme dynamicScheme) {
        return materialDynamicColors.lambda$onPrimaryContainer$62(dynamicScheme);
    }

    public static /* synthetic */ DynamicColor A1(MaterialDynamicColors materialDynamicColors, DynamicScheme dynamicScheme) {
        return materialDynamicColors.lambda$onSecondaryFixed$125(dynamicScheme);
    }

    public static /* synthetic */ DynamicColor B(MaterialDynamicColors materialDynamicColors, DynamicScheme dynamicScheme) {
        return materialDynamicColors.lambda$onErrorContainer$102(dynamicScheme);
    }

    public static /* synthetic */ DynamicColor B0(MaterialDynamicColors materialDynamicColors, DynamicScheme dynamicScheme) {
        return materialDynamicColors.lambda$onPrimaryFixed$111(dynamicScheme);
    }

    public static /* synthetic */ TonalPalette B1(DynamicScheme dynamicScheme) {
        return dynamicScheme.neutralPalette;
    }

    public static /* synthetic */ ToneDeltaPair C(MaterialDynamicColors materialDynamicColors, DynamicScheme dynamicScheme) {
        return materialDynamicColors.lambda$secondary$69(dynamicScheme);
    }

    public static /* synthetic */ Double C0(DynamicScheme dynamicScheme) {
        return MaterialDynamicColors.lambda$inverseOnSurface$40(dynamicScheme);
    }

    public static /* synthetic */ Double C1(DynamicScheme dynamicScheme) {
        return MaterialDynamicColors.lambda$surfaceVariant$34(dynamicScheme);
    }

    public static /* synthetic */ ToneDeltaPair D(MaterialDynamicColors materialDynamicColors, DynamicScheme dynamicScheme) {
        return materialDynamicColors.lambda$error$93(dynamicScheme);
    }

    public static /* synthetic */ Double D0(DynamicScheme dynamicScheme) {
        return MaterialDynamicColors.lambda$surfaceDim$18(dynamicScheme);
    }

    public static /* synthetic */ Double D1(DynamicScheme dynamicScheme) {
        return MaterialDynamicColors.lambda$tertiary$80(dynamicScheme);
    }

    public static /* synthetic */ Double E(DynamicScheme dynamicScheme) {
        return MaterialDynamicColors.lambda$secondaryPaletteKeyColor$3(dynamicScheme);
    }

    public static /* synthetic */ Double E0(DynamicScheme dynamicScheme) {
        return MaterialDynamicColors.lambda$onSecondaryFixed$124(dynamicScheme);
    }

    public static /* synthetic */ DynamicColor E1(MaterialDynamicColors materialDynamicColors, DynamicScheme dynamicScheme) {
        return materialDynamicColors.lambda$onTertiaryFixed$139(dynamicScheme);
    }

    public static /* synthetic */ TonalPalette F(DynamicScheme dynamicScheme) {
        return dynamicScheme.primaryPalette;
    }

    public static /* synthetic */ Double F0(DynamicScheme dynamicScheme) {
        return MaterialDynamicColors.lambda$surfaceTint$51(dynamicScheme);
    }

    public static /* synthetic */ TonalPalette F1(DynamicScheme dynamicScheme) {
        return dynamicScheme.neutralVariantPalette;
    }

    public static /* synthetic */ Double G(DynamicScheme dynamicScheme) {
        return MaterialDynamicColors.lambda$outline$43(dynamicScheme);
    }

    public static /* synthetic */ TonalPalette G0(DynamicScheme dynamicScheme) {
        return dynamicScheme.tertiaryPalette;
    }

    public static /* synthetic */ Double G1(DynamicScheme dynamicScheme) {
        return MaterialDynamicColors.lambda$textSecondaryAndTertiaryInverseDisabled$159(dynamicScheme);
    }

    public static /* synthetic */ Double H(DynamicScheme dynamicScheme) {
        return MaterialDynamicColors.lambda$surfaceContainer$26(dynamicScheme);
    }

    public static /* synthetic */ DynamicColor H0(MaterialDynamicColors materialDynamicColors, DynamicScheme dynamicScheme) {
        return materialDynamicColors.lambda$onSecondaryFixedVariant$129(dynamicScheme);
    }

    public static /* synthetic */ Double H1(DynamicScheme dynamicScheme) {
        return MaterialDynamicColors.lambda$tertiaryFixedDim$135(dynamicScheme);
    }

    public static /* synthetic */ TonalPalette I(DynamicScheme dynamicScheme) {
        return dynamicScheme.neutralPalette;
    }

    public static /* synthetic */ Double I0(DynamicScheme dynamicScheme) {
        return MaterialDynamicColors.lambda$primary$53(dynamicScheme);
    }

    public static /* synthetic */ Double I1(DynamicScheme dynamicScheme) {
        return MaterialDynamicColors.lambda$onSurfaceVariant$36(dynamicScheme);
    }

    public static /* synthetic */ DynamicColor J(MaterialDynamicColors materialDynamicColors, DynamicScheme dynamicScheme) {
        return materialDynamicColors.lambda$onPrimaryFixedVariant$115(dynamicScheme);
    }

    public static /* synthetic */ TonalPalette J0(DynamicScheme dynamicScheme) {
        return dynamicScheme.secondaryPalette;
    }

    public static /* synthetic */ DynamicColor J1(MaterialDynamicColors materialDynamicColors, DynamicScheme dynamicScheme) {
        return materialDynamicColors.lambda$onError$96(dynamicScheme);
    }

    public static /* synthetic */ Double K(DynamicScheme dynamicScheme) {
        return MaterialDynamicColors.lambda$onSurface$32(dynamicScheme);
    }

    public static /* synthetic */ Double K0(DynamicScheme dynamicScheme) {
        return MaterialDynamicColors.lambda$onPrimary$56(dynamicScheme);
    }

    public static /* synthetic */ DynamicColor K1(MaterialDynamicColors materialDynamicColors, DynamicScheme dynamicScheme) {
        return materialDynamicColors.lambda$onSecondaryContainer$78(dynamicScheme);
    }

    public static /* synthetic */ Double L(DynamicScheme dynamicScheme) {
        return MaterialDynamicColors.lambda$textHintInverse$161(dynamicScheme);
    }

    public static /* synthetic */ TonalPalette L0(DynamicScheme dynamicScheme) {
        return dynamicScheme.primaryPalette;
    }

    public static /* synthetic */ DynamicColor L1(MaterialDynamicColors materialDynamicColors, DynamicScheme dynamicScheme) {
        return materialDynamicColors.lambda$inverseOnSurface$41(dynamicScheme);
    }

    public static /* synthetic */ Double M(DynamicScheme dynamicScheme) {
        return MaterialDynamicColors.lambda$surfaceBright$20(dynamicScheme);
    }

    public static /* synthetic */ TonalPalette M0(DynamicScheme dynamicScheme) {
        return dynamicScheme.tertiaryPalette;
    }

    public static /* synthetic */ Double M1(DynamicScheme dynamicScheme) {
        return MaterialDynamicColors.lambda$textSecondaryAndTertiaryInverse$155(dynamicScheme);
    }

    public static /* synthetic */ Double N(DynamicScheme dynamicScheme) {
        return MaterialDynamicColors.lambda$onSecondary$71(dynamicScheme);
    }

    public static /* synthetic */ TonalPalette N0(DynamicScheme dynamicScheme) {
        return dynamicScheme.neutralPalette;
    }

    public static /* synthetic */ TonalPalette N1(DynamicScheme dynamicScheme) {
        return dynamicScheme.secondaryPalette;
    }

    public static /* synthetic */ Double O(DynamicScheme dynamicScheme) {
        return MaterialDynamicColors.lambda$primaryPaletteKeyColor$1(dynamicScheme);
    }

    public static /* synthetic */ Double O0(DynamicScheme dynamicScheme) {
        return MaterialDynamicColors.lambda$onPrimaryFixedVariant$114(dynamicScheme);
    }

    public static /* synthetic */ TonalPalette O1(DynamicScheme dynamicScheme) {
        return dynamicScheme.secondaryPalette;
    }

    public static /* synthetic */ Double P(DynamicScheme dynamicScheme) {
        return MaterialDynamicColors.lambda$shadow$47(dynamicScheme);
    }

    public static /* synthetic */ TonalPalette P0(DynamicScheme dynamicScheme) {
        return dynamicScheme.neutralPalette;
    }

    public static /* synthetic */ TonalPalette P1(DynamicScheme dynamicScheme) {
        return dynamicScheme.tertiaryPalette;
    }

    public static /* synthetic */ DynamicColor Q(MaterialDynamicColors materialDynamicColors, DynamicScheme dynamicScheme) {
        return materialDynamicColors.lambda$onTertiaryFixed$140(dynamicScheme);
    }

    public static /* synthetic */ Double Q0(DynamicScheme dynamicScheme) {
        return MaterialDynamicColors.lambda$primaryContainer$59(dynamicScheme);
    }

    public static /* synthetic */ DynamicColor Q1(MaterialDynamicColors materialDynamicColors, DynamicScheme dynamicScheme) {
        return materialDynamicColors.lambda$onSecondaryFixed$126(dynamicScheme);
    }

    public static /* synthetic */ TonalPalette R(DynamicScheme dynamicScheme) {
        return dynamicScheme.neutralVariantPalette;
    }

    public static /* synthetic */ Double R0(DynamicScheme dynamicScheme) {
        return MaterialDynamicColors.lambda$inverseSurface$38(dynamicScheme);
    }

    public static /* synthetic */ TonalPalette R1(DynamicScheme dynamicScheme) {
        return dynamicScheme.errorPalette;
    }

    public static /* synthetic */ DynamicColor S(MaterialDynamicColors materialDynamicColors, DynamicScheme dynamicScheme) {
        return materialDynamicColors.lambda$onTertiaryFixedVariant$143(dynamicScheme);
    }

    public static /* synthetic */ Double S0(DynamicScheme dynamicScheme) {
        return MaterialDynamicColors.lambda$surfaceContainerHighest$30(dynamicScheme);
    }

    public static /* synthetic */ DynamicColor S1(MaterialDynamicColors materialDynamicColors, DynamicScheme dynamicScheme) {
        return materialDynamicColors.lambda$onBackground$14(dynamicScheme);
    }

    public static /* synthetic */ TonalPalette T(DynamicScheme dynamicScheme) {
        return dynamicScheme.secondaryPalette;
    }

    public static /* synthetic */ TonalPalette T0(DynamicScheme dynamicScheme) {
        return dynamicScheme.secondaryPalette;
    }

    public static /* synthetic */ TonalPalette T1(DynamicScheme dynamicScheme) {
        return dynamicScheme.errorPalette;
    }

    public static /* synthetic */ Double U(DynamicScheme dynamicScheme) {
        return MaterialDynamicColors.lambda$inversePrimary$65(dynamicScheme);
    }

    public static /* synthetic */ Double U0(DynamicScheme dynamicScheme) {
        return MaterialDynamicColors.lambda$scrim$49(dynamicScheme);
    }

    public static /* synthetic */ Double U1(DynamicScheme dynamicScheme) {
        return MaterialDynamicColors.lambda$onSecondaryFixedVariant$128(dynamicScheme);
    }

    public static /* synthetic */ TonalPalette V(DynamicScheme dynamicScheme) {
        return dynamicScheme.tertiaryPalette;
    }

    public static /* synthetic */ DynamicColor V0(MaterialDynamicColors materialDynamicColors, DynamicScheme dynamicScheme) {
        return materialDynamicColors.lambda$onPrimaryFixed$112(dynamicScheme);
    }

    public static /* synthetic */ TonalPalette V1(DynamicScheme dynamicScheme) {
        return dynamicScheme.neutralPalette;
    }

    public static /* synthetic */ Double W(DynamicScheme dynamicScheme) {
        return MaterialDynamicColors.lambda$controlNormal$148(dynamicScheme);
    }

    public static /* synthetic */ Double W0(DynamicScheme dynamicScheme) {
        return MaterialDynamicColors.lambda$textPrimaryInverse$153(dynamicScheme);
    }

    public static /* synthetic */ Double W1(DynamicScheme dynamicScheme) {
        return MaterialDynamicColors.lambda$primaryFixedDim$107(dynamicScheme);
    }

    public static /* synthetic */ TonalPalette X(DynamicScheme dynamicScheme) {
        return dynamicScheme.neutralVariantPalette;
    }

    public static /* synthetic */ TonalPalette X0(DynamicScheme dynamicScheme) {
        return dynamicScheme.primaryPalette;
    }

    public static /* synthetic */ ToneDeltaPair X1(MaterialDynamicColors materialDynamicColors, DynamicScheme dynamicScheme) {
        return materialDynamicColors.lambda$tertiaryFixed$133(dynamicScheme);
    }

    public static /* synthetic */ TonalPalette Y(DynamicScheme dynamicScheme) {
        return dynamicScheme.neutralPalette;
    }

    public static /* synthetic */ Double Y0(DynamicScheme dynamicScheme) {
        return MaterialDynamicColors.lambda$textPrimaryInverseDisableOnly$157(dynamicScheme);
    }

    public static /* synthetic */ TonalPalette Y1(DynamicScheme dynamicScheme) {
        return dynamicScheme.neutralPalette;
    }

    public static /* synthetic */ Double Z(DynamicScheme dynamicScheme) {
        return MaterialDynamicColors.lambda$controlHighlight$150(dynamicScheme);
    }

    public static /* synthetic */ ToneDeltaPair Z0(MaterialDynamicColors materialDynamicColors, DynamicScheme dynamicScheme) {
        return materialDynamicColors.lambda$secondaryContainer$75(dynamicScheme);
    }

    public static /* synthetic */ DynamicColor Z1(MaterialDynamicColors materialDynamicColors, DynamicScheme dynamicScheme) {
        return materialDynamicColors.lambda$onSecondary$72(dynamicScheme);
    }

    public static /* synthetic */ ToneDeltaPair a(MaterialDynamicColors materialDynamicColors, DynamicScheme dynamicScheme) {
        return materialDynamicColors.lambda$primaryFixed$105(dynamicScheme);
    }

    public static /* synthetic */ Double a0(DynamicScheme dynamicScheme) {
        return MaterialDynamicColors.lambda$surfaceContainerHigh$28(dynamicScheme);
    }

    public static /* synthetic */ Double a1(DynamicScheme dynamicScheme) {
        return MaterialDynamicColors.lambda$onTertiary$83(dynamicScheme);
    }

    public static /* synthetic */ Double a2(DynamicScheme dynamicScheme) {
        return MaterialDynamicColors.lambda$neutralPaletteKeyColor$7(dynamicScheme);
    }

    public static /* synthetic */ Double b(DynamicScheme dynamicScheme) {
        return MaterialDynamicColors.lambda$onError$95(dynamicScheme);
    }

    public static /* synthetic */ TonalPalette b0(DynamicScheme dynamicScheme) {
        return dynamicScheme.neutralPalette;
    }

    public static /* synthetic */ Double b1(DynamicScheme dynamicScheme) {
        return MaterialDynamicColors.lambda$onTertiaryFixedVariant$142(dynamicScheme);
    }

    public static /* synthetic */ TonalPalette b2(DynamicScheme dynamicScheme) {
        return dynamicScheme.secondaryPalette;
    }

    public static /* synthetic */ TonalPalette c(DynamicScheme dynamicScheme) {
        return dynamicScheme.primaryPalette;
    }

    public static /* synthetic */ TonalPalette c0(DynamicScheme dynamicScheme) {
        return dynamicScheme.primaryPalette;
    }

    public static /* synthetic */ TonalPalette c1(DynamicScheme dynamicScheme) {
        return dynamicScheme.neutralPalette;
    }

    public static /* synthetic */ Double c2(DynamicScheme dynamicScheme) {
        return MaterialDynamicColors.lambda$tertiaryPaletteKeyColor$5(dynamicScheme);
    }

    public static /* synthetic */ TonalPalette d(DynamicScheme dynamicScheme) {
        return dynamicScheme.neutralPalette;
    }

    public static /* synthetic */ TonalPalette d0(DynamicScheme dynamicScheme) {
        return dynamicScheme.primaryPalette;
    }

    public static /* synthetic */ Double d1(DynamicScheme dynamicScheme) {
        return MaterialDynamicColors.lambda$onBackground$13(dynamicScheme);
    }

    public static /* synthetic */ TonalPalette d2(DynamicScheme dynamicScheme) {
        return dynamicScheme.neutralPalette;
    }

    public static /* synthetic */ TonalPalette e(DynamicScheme dynamicScheme) {
        return dynamicScheme.neutralVariantPalette;
    }

    public static /* synthetic */ TonalPalette e0(DynamicScheme dynamicScheme) {
        return dynamicScheme.primaryPalette;
    }

    public static /* synthetic */ ToneDeltaPair e1(MaterialDynamicColors materialDynamicColors, DynamicScheme dynamicScheme) {
        return materialDynamicColors.lambda$secondaryFixed$119(dynamicScheme);
    }

    public static /* synthetic */ TonalPalette e2(DynamicScheme dynamicScheme) {
        return dynamicScheme.neutralPalette;
    }

    public static /* synthetic */ ToneDeltaPair f(MaterialDynamicColors materialDynamicColors, DynamicScheme dynamicScheme) {
        return materialDynamicColors.lambda$primaryFixedDim$108(dynamicScheme);
    }

    public static /* synthetic */ DynamicColor f0(MaterialDynamicColors materialDynamicColors, DynamicScheme dynamicScheme) {
        return materialDynamicColors.lambda$onPrimary$57(dynamicScheme);
    }

    public static /* synthetic */ DynamicColor f1(MaterialDynamicColors materialDynamicColors, DynamicScheme dynamicScheme) {
        return materialDynamicColors.lambda$onPrimaryContainer$63(dynamicScheme);
    }

    public static /* synthetic */ Double f2(DynamicScheme dynamicScheme) {
        return MaterialDynamicColors.lambda$surfaceContainerLow$24(dynamicScheme);
    }

    public static double findDesiredChromaByTone(double d2, double d5, double d7, boolean bl2) {
        double d9;
        block5: {
            Hct hct = Hct.from(d2, d5, d7);
            double d12 = hct.getChroma();
            double d13 = d12 - d5;
            Object object = d13 == 0.0 ? 0 : (d13 < 0.0 ? -1 : 1);
            if (object < 0) {
                double d14;
                double d15;
                double d16;
                d12 = hct.getChroma();
                Hct hct2 = hct;
                double d17 = d12;
                double d18 = d7;
                while ((d16 = (d15 = (d14 = hct2.getChroma()) - d5) == 0.0 ? 0 : (d15 < 0.0 ? -1 : 1)) < 0) {
                    double d19;
                    double d20;
                    Object object2;
                    d14 = bl2 ? -1.0 : 1.0;
                    d9 = d18 + d14;
                    d18 = d2;
                    d14 = d5;
                    hct = Hct.from(d2, d5, d9);
                    d12 = hct.getChroma();
                    object = d17 == d12 ? 0 : (d17 > d12 ? 1 : -1);
                    if (object <= 0 && (object2 = (d20 = (d12 = Math.abs(hct.getChroma() - d5)) - (d19 = 0.4)) == 0.0 ? 0 : (d20 < 0.0 ? -1 : 1)) >= 0) {
                        d12 = Math.abs(hct.getChroma() - d5);
                        double d22 = d12 - (d19 = Math.abs(hct2.getChroma() - d5));
                        object2 = d22 == 0.0 ? 0 : (d22 < 0.0 ? -1 : 1);
                        if (object2 < 0) {
                            hct2 = hct;
                        }
                        d18 = hct.getChroma();
                        d17 = Math.max(d17, d18);
                        d18 = d9;
                        continue;
                    }
                    break block5;
                }
                d9 = d18;
            } else {
                d9 = d7;
            }
        }
        return d9;
    }

    public static /* synthetic */ Double g(DynamicScheme dynamicScheme) {
        return MaterialDynamicColors.lambda$outlineVariant$45(dynamicScheme);
    }

    public static /* synthetic */ TonalPalette g0(DynamicScheme dynamicScheme) {
        return dynamicScheme.neutralPalette;
    }

    public static /* synthetic */ Double g1(MaterialDynamicColors materialDynamicColors, DynamicScheme dynamicScheme) {
        return materialDynamicColors.lambda$onTertiaryContainer$89(dynamicScheme);
    }

    public static /* synthetic */ DynamicColor h(MaterialDynamicColors materialDynamicColors, DynamicScheme dynamicScheme) {
        return materialDynamicColors.lambda$onTertiary$84(dynamicScheme);
    }

    public static /* synthetic */ TonalPalette h0(DynamicScheme dynamicScheme) {
        return dynamicScheme.primaryPalette;
    }

    public static /* synthetic */ Double h1(DynamicScheme dynamicScheme) {
        return MaterialDynamicColors.lambda$tertiaryContainer$86(dynamicScheme);
    }

    public static /* synthetic */ TonalPalette i(DynamicScheme dynamicScheme) {
        return dynamicScheme.secondaryPalette;
    }

    public static /* synthetic */ DynamicColor i0(MaterialDynamicColors materialDynamicColors, DynamicScheme dynamicScheme) {
        return materialDynamicColors.lambda$onTertiaryContainer$90(dynamicScheme);
    }

    public static /* synthetic */ TonalPalette i1(DynamicScheme dynamicScheme) {
        return dynamicScheme.errorPalette;
    }

    private static boolean isFidelity(DynamicScheme object) {
        boolean bl2;
        object = object.variant;
        Variant variant = Variant.FIDELITY;
        if (object != variant && object != (variant = Variant.CONTENT)) {
            bl2 = false;
            object = null;
        } else {
            bl2 = true;
        }
        return bl2;
    }

    private static boolean isMonochrome(DynamicScheme object) {
        boolean bl2;
        object = object.variant;
        Variant variant = Variant.MONOCHROME;
        if (object == variant) {
            bl2 = true;
        } else {
            bl2 = false;
            object = null;
        }
        return bl2;
    }

    public static /* synthetic */ Double j(DynamicScheme dynamicScheme) {
        return MaterialDynamicColors.lambda$onTertiaryFixed$138(dynamicScheme);
    }

    public static /* synthetic */ TonalPalette j0(DynamicScheme dynamicScheme) {
        return dynamicScheme.tertiaryPalette;
    }

    public static /* synthetic */ Double j1(DynamicScheme dynamicScheme) {
        return MaterialDynamicColors.lambda$tertiaryFixed$132(dynamicScheme);
    }

    public static /* synthetic */ Double k(DynamicScheme dynamicScheme) {
        return MaterialDynamicColors.lambda$secondaryContainer$74(dynamicScheme);
    }

    public static /* synthetic */ Double k0(DynamicScheme dynamicScheme) {
        return MaterialDynamicColors.lambda$controlActivated$146(dynamicScheme);
    }

    public static /* synthetic */ TonalPalette k1(DynamicScheme dynamicScheme) {
        return dynamicScheme.neutralVariantPalette;
    }

    public static /* synthetic */ TonalPalette l(DynamicScheme dynamicScheme) {
        return dynamicScheme.secondaryPalette;
    }

    public static /* synthetic */ TonalPalette l0(DynamicScheme dynamicScheme) {
        return dynamicScheme.neutralPalette;
    }

    public static /* synthetic */ Double l1(DynamicScheme dynamicScheme) {
        return MaterialDynamicColors.lambda$errorContainer$98(dynamicScheme);
    }

    private static /* synthetic */ Double lambda$background$11(DynamicScheme dynamicScheme) {
        boolean bl2 = dynamicScheme.isDark;
        double d2 = bl2 ? 6.0 : 98.0;
        return d2;
    }

    private static /* synthetic */ Double lambda$controlActivated$146(DynamicScheme dynamicScheme) {
        boolean bl2 = dynamicScheme.isDark;
        double d2 = bl2 ? 30.0 : 90.0;
        return d2;
    }

    private static /* synthetic */ Double lambda$controlHighlight$150(DynamicScheme dynamicScheme) {
        boolean bl2 = dynamicScheme.isDark;
        double d2 = bl2 ? 100.0 : 0.0;
        return d2;
    }

    private static /* synthetic */ Double lambda$controlHighlight$151(DynamicScheme dynamicScheme) {
        boolean bl2 = dynamicScheme.isDark;
        double d2 = bl2 ? 0.2 : 0.12;
        return d2;
    }

    private static /* synthetic */ Double lambda$controlNormal$148(DynamicScheme dynamicScheme) {
        boolean bl2 = dynamicScheme.isDark;
        double d2 = bl2 ? 80.0 : 30.0;
        return d2;
    }

    private static /* synthetic */ Double lambda$error$92(DynamicScheme dynamicScheme) {
        boolean bl2 = dynamicScheme.isDark;
        double d2 = bl2 ? 80.0 : 40.0;
        return d2;
    }

    private /* synthetic */ ToneDeltaPair lambda$error$93(DynamicScheme object) {
        DynamicColor dynamicColor = this.errorContainer();
        DynamicColor dynamicColor2 = this.error();
        TonePolarity tonePolarity = TonePolarity.NEARER;
        object = new ToneDeltaPair(dynamicColor, dynamicColor2, 15.0, tonePolarity, false);
        return object;
    }

    private static /* synthetic */ Double lambda$errorContainer$98(DynamicScheme dynamicScheme) {
        boolean bl2 = dynamicScheme.isDark;
        double d2 = bl2 ? 30.0 : 90.0;
        return d2;
    }

    private /* synthetic */ ToneDeltaPair lambda$errorContainer$99(DynamicScheme object) {
        DynamicColor dynamicColor = this.errorContainer();
        DynamicColor dynamicColor2 = this.error();
        TonePolarity tonePolarity = TonePolarity.NEARER;
        object = new ToneDeltaPair(dynamicColor, dynamicColor2, 15.0, tonePolarity, false);
        return object;
    }

    private static /* synthetic */ Double lambda$inverseOnSurface$40(DynamicScheme dynamicScheme) {
        boolean bl2 = dynamicScheme.isDark;
        double d2 = bl2 ? 20.0 : 95.0;
        return d2;
    }

    private /* synthetic */ DynamicColor lambda$inverseOnSurface$41(DynamicScheme dynamicScheme) {
        return this.inverseSurface();
    }

    private static /* synthetic */ Double lambda$inversePrimary$65(DynamicScheme dynamicScheme) {
        boolean bl2 = dynamicScheme.isDark;
        double d2 = bl2 ? 40.0 : 80.0;
        return d2;
    }

    private /* synthetic */ DynamicColor lambda$inversePrimary$66(DynamicScheme dynamicScheme) {
        return this.inverseSurface();
    }

    private static /* synthetic */ Double lambda$inverseSurface$38(DynamicScheme dynamicScheme) {
        boolean bl2 = dynamicScheme.isDark;
        double d2 = bl2 ? 90.0 : 20.0;
        return d2;
    }

    private static /* synthetic */ Double lambda$neutralPaletteKeyColor$7(DynamicScheme dynamicScheme) {
        return dynamicScheme.neutralPalette.getKeyColor().getTone();
    }

    private static /* synthetic */ Double lambda$neutralVariantPaletteKeyColor$9(DynamicScheme dynamicScheme) {
        return dynamicScheme.neutralVariantPalette.getKeyColor().getTone();
    }

    private static /* synthetic */ Double lambda$onBackground$13(DynamicScheme dynamicScheme) {
        boolean bl2 = dynamicScheme.isDark;
        double d2 = bl2 ? 90.0 : 10.0;
        return d2;
    }

    private /* synthetic */ DynamicColor lambda$onBackground$14(DynamicScheme dynamicScheme) {
        return this.background();
    }

    private static /* synthetic */ Double lambda$onError$95(DynamicScheme dynamicScheme) {
        boolean bl2 = dynamicScheme.isDark;
        double d2 = bl2 ? 20.0 : 100.0;
        return d2;
    }

    private /* synthetic */ DynamicColor lambda$onError$96(DynamicScheme dynamicScheme) {
        return this.error();
    }

    private static /* synthetic */ Double lambda$onErrorContainer$101(DynamicScheme dynamicScheme) {
        boolean bl2 = dynamicScheme.isDark;
        double d2 = bl2 ? 90.0 : 10.0;
        return d2;
    }

    private /* synthetic */ DynamicColor lambda$onErrorContainer$102(DynamicScheme dynamicScheme) {
        return this.errorContainer();
    }

    private static /* synthetic */ Double lambda$onPrimary$56(DynamicScheme dynamicScheme) {
        boolean bl2 = MaterialDynamicColors.isMonochrome(dynamicScheme);
        if (bl2) {
            boolean bl3 = dynamicScheme.isDark;
            double d2 = bl3 ? 10.0 : 90.0;
            return d2;
        }
        boolean bl4 = dynamicScheme.isDark;
        double d5 = bl4 ? 20.0 : 100.0;
        return d5;
    }

    private /* synthetic */ DynamicColor lambda$onPrimary$57(DynamicScheme dynamicScheme) {
        return this.primary();
    }

    private /* synthetic */ Double lambda$onPrimaryContainer$62(DynamicScheme dynamicScheme) {
        boolean bl2 = MaterialDynamicColors.isFidelity(dynamicScheme);
        if (bl2) {
            Function function = this.primaryContainer().tone;
            return DynamicColor.foregroundTone((Double)fw0_0.a(dynamicScheme, function), 4.5);
        }
        bl2 = MaterialDynamicColors.isMonochrome(dynamicScheme);
        if (bl2) {
            boolean bl3 = dynamicScheme.isDark;
            double d2 = bl3 ? 0.0 : 100.0;
            return d2;
        }
        boolean bl4 = dynamicScheme.isDark;
        double d5 = bl4 ? 90.0 : 10.0;
        return d5;
    }

    private /* synthetic */ DynamicColor lambda$onPrimaryContainer$63(DynamicScheme dynamicScheme) {
        return this.primaryContainer();
    }

    private static /* synthetic */ Double lambda$onPrimaryFixed$110(DynamicScheme dynamicScheme) {
        boolean bl2 = MaterialDynamicColors.isMonochrome(dynamicScheme);
        double d2 = bl2 ? 100.0 : 10.0;
        return d2;
    }

    private /* synthetic */ DynamicColor lambda$onPrimaryFixed$111(DynamicScheme dynamicScheme) {
        return this.primaryFixedDim();
    }

    private /* synthetic */ DynamicColor lambda$onPrimaryFixed$112(DynamicScheme dynamicScheme) {
        return this.primaryFixed();
    }

    private static /* synthetic */ Double lambda$onPrimaryFixedVariant$114(DynamicScheme dynamicScheme) {
        boolean bl2 = MaterialDynamicColors.isMonochrome(dynamicScheme);
        double d2 = bl2 ? 90.0 : 30.0;
        return d2;
    }

    private /* synthetic */ DynamicColor lambda$onPrimaryFixedVariant$115(DynamicScheme dynamicScheme) {
        return this.primaryFixedDim();
    }

    private /* synthetic */ DynamicColor lambda$onPrimaryFixedVariant$116(DynamicScheme dynamicScheme) {
        return this.primaryFixed();
    }

    private static /* synthetic */ Double lambda$onSecondary$71(DynamicScheme dynamicScheme) {
        boolean bl2 = MaterialDynamicColors.isMonochrome(dynamicScheme);
        double d2 = 100.0;
        if (bl2) {
            boolean bl3 = dynamicScheme.isDark;
            if (bl3) {
                d2 = 10.0;
            }
            return d2;
        }
        boolean bl4 = dynamicScheme.isDark;
        if (bl4) {
            d2 = 20.0;
        }
        return d2;
    }

    private /* synthetic */ DynamicColor lambda$onSecondary$72(DynamicScheme dynamicScheme) {
        return this.secondary();
    }

    private /* synthetic */ Double lambda$onSecondaryContainer$77(DynamicScheme dynamicScheme) {
        boolean bl2 = MaterialDynamicColors.isFidelity(dynamicScheme);
        if (!bl2) {
            boolean bl3 = dynamicScheme.isDark;
            double d2 = bl3 ? 90.0 : 10.0;
            return d2;
        }
        Function function = this.secondaryContainer().tone;
        return DynamicColor.foregroundTone((Double)fw0_0.a(dynamicScheme, function), 4.5);
    }

    private /* synthetic */ DynamicColor lambda$onSecondaryContainer$78(DynamicScheme dynamicScheme) {
        return this.secondaryContainer();
    }

    private static /* synthetic */ Double lambda$onSecondaryFixed$124(DynamicScheme dynamicScheme) {
        return 10.0;
    }

    private /* synthetic */ DynamicColor lambda$onSecondaryFixed$125(DynamicScheme dynamicScheme) {
        return this.secondaryFixedDim();
    }

    private /* synthetic */ DynamicColor lambda$onSecondaryFixed$126(DynamicScheme dynamicScheme) {
        return this.secondaryFixed();
    }

    private static /* synthetic */ Double lambda$onSecondaryFixedVariant$128(DynamicScheme dynamicScheme) {
        boolean bl2 = MaterialDynamicColors.isMonochrome(dynamicScheme);
        double d2 = bl2 ? 25.0 : 30.0;
        return d2;
    }

    private /* synthetic */ DynamicColor lambda$onSecondaryFixedVariant$129(DynamicScheme dynamicScheme) {
        return this.secondaryFixedDim();
    }

    private /* synthetic */ DynamicColor lambda$onSecondaryFixedVariant$130(DynamicScheme dynamicScheme) {
        return this.secondaryFixed();
    }

    private static /* synthetic */ Double lambda$onSurface$32(DynamicScheme dynamicScheme) {
        boolean bl2 = dynamicScheme.isDark;
        double d2 = bl2 ? 90.0 : 10.0;
        return d2;
    }

    private static /* synthetic */ Double lambda$onSurfaceVariant$36(DynamicScheme dynamicScheme) {
        boolean bl2 = dynamicScheme.isDark;
        double d2 = bl2 ? 80.0 : 30.0;
        return d2;
    }

    private static /* synthetic */ Double lambda$onTertiary$83(DynamicScheme dynamicScheme) {
        boolean bl2 = MaterialDynamicColors.isMonochrome(dynamicScheme);
        if (bl2) {
            boolean bl3 = dynamicScheme.isDark;
            double d2 = bl3 ? 10.0 : 90.0;
            return d2;
        }
        boolean bl4 = dynamicScheme.isDark;
        double d5 = bl4 ? 20.0 : 100.0;
        return d5;
    }

    private /* synthetic */ DynamicColor lambda$onTertiary$84(DynamicScheme dynamicScheme) {
        return this.tertiary();
    }

    private /* synthetic */ Double lambda$onTertiaryContainer$89(DynamicScheme dynamicScheme) {
        boolean bl2 = MaterialDynamicColors.isMonochrome(dynamicScheme);
        if (bl2) {
            boolean bl3 = dynamicScheme.isDark;
            double d2 = bl3 ? 0.0 : 100.0;
            return d2;
        }
        bl2 = MaterialDynamicColors.isFidelity(dynamicScheme);
        if (!bl2) {
            boolean bl4 = dynamicScheme.isDark;
            double d5 = bl4 ? 90.0 : 10.0;
            return d5;
        }
        Function function = this.tertiaryContainer().tone;
        return DynamicColor.foregroundTone((Double)fw0_0.a(dynamicScheme, function), 4.5);
    }

    private /* synthetic */ DynamicColor lambda$onTertiaryContainer$90(DynamicScheme dynamicScheme) {
        return this.tertiaryContainer();
    }

    private static /* synthetic */ Double lambda$onTertiaryFixed$138(DynamicScheme dynamicScheme) {
        boolean bl2 = MaterialDynamicColors.isMonochrome(dynamicScheme);
        double d2 = bl2 ? 100.0 : 10.0;
        return d2;
    }

    private /* synthetic */ DynamicColor lambda$onTertiaryFixed$139(DynamicScheme dynamicScheme) {
        return this.tertiaryFixedDim();
    }

    private /* synthetic */ DynamicColor lambda$onTertiaryFixed$140(DynamicScheme dynamicScheme) {
        return this.tertiaryFixed();
    }

    private static /* synthetic */ Double lambda$onTertiaryFixedVariant$142(DynamicScheme dynamicScheme) {
        boolean bl2 = MaterialDynamicColors.isMonochrome(dynamicScheme);
        double d2 = bl2 ? 90.0 : 30.0;
        return d2;
    }

    private /* synthetic */ DynamicColor lambda$onTertiaryFixedVariant$143(DynamicScheme dynamicScheme) {
        return this.tertiaryFixedDim();
    }

    private /* synthetic */ DynamicColor lambda$onTertiaryFixedVariant$144(DynamicScheme dynamicScheme) {
        return this.tertiaryFixed();
    }

    private static /* synthetic */ Double lambda$outline$43(DynamicScheme dynamicScheme) {
        boolean bl2 = dynamicScheme.isDark;
        double d2 = bl2 ? 60.0 : 50.0;
        return d2;
    }

    private static /* synthetic */ Double lambda$outlineVariant$45(DynamicScheme dynamicScheme) {
        boolean bl2 = dynamicScheme.isDark;
        double d2 = bl2 ? 30.0 : 80.0;
        return d2;
    }

    private static /* synthetic */ Double lambda$primary$53(DynamicScheme dynamicScheme) {
        boolean bl2 = MaterialDynamicColors.isMonochrome(dynamicScheme);
        if (bl2) {
            boolean bl3 = dynamicScheme.isDark;
            double d2 = bl3 ? 100.0 : 0.0;
            return d2;
        }
        boolean bl4 = dynamicScheme.isDark;
        double d5 = bl4 ? 80.0 : 40.0;
        return d5;
    }

    private /* synthetic */ ToneDeltaPair lambda$primary$54(DynamicScheme object) {
        DynamicColor dynamicColor = this.primaryContainer();
        DynamicColor dynamicColor2 = this.primary();
        TonePolarity tonePolarity = TonePolarity.NEARER;
        object = new ToneDeltaPair(dynamicColor, dynamicColor2, 15.0, tonePolarity, false);
        return object;
    }

    private static /* synthetic */ Double lambda$primaryContainer$59(DynamicScheme dynamicScheme) {
        boolean bl2 = MaterialDynamicColors.isFidelity(dynamicScheme);
        if (bl2) {
            return MaterialDynamicColors.performAlbers(dynamicScheme.sourceColorHct, dynamicScheme);
        }
        bl2 = MaterialDynamicColors.isMonochrome(dynamicScheme);
        if (bl2) {
            boolean bl3 = dynamicScheme.isDark;
            double d2 = bl3 ? 85.0 : 25.0;
            return d2;
        }
        boolean bl4 = dynamicScheme.isDark;
        double d5 = bl4 ? 30.0 : 90.0;
        return d5;
    }

    private /* synthetic */ ToneDeltaPair lambda$primaryContainer$60(DynamicScheme object) {
        DynamicColor dynamicColor = this.primaryContainer();
        DynamicColor dynamicColor2 = this.primary();
        TonePolarity tonePolarity = TonePolarity.NEARER;
        object = new ToneDeltaPair(dynamicColor, dynamicColor2, 15.0, tonePolarity, false);
        return object;
    }

    private static /* synthetic */ Double lambda$primaryFixed$104(DynamicScheme dynamicScheme) {
        boolean bl2 = MaterialDynamicColors.isMonochrome(dynamicScheme);
        double d2 = bl2 ? 40.0 : 90.0;
        return d2;
    }

    private /* synthetic */ ToneDeltaPair lambda$primaryFixed$105(DynamicScheme object) {
        DynamicColor dynamicColor = this.primaryFixed();
        DynamicColor dynamicColor2 = this.primaryFixedDim();
        TonePolarity tonePolarity = TonePolarity.LIGHTER;
        object = new ToneDeltaPair(dynamicColor, dynamicColor2, 10.0, tonePolarity, true);
        return object;
    }

    private static /* synthetic */ Double lambda$primaryFixedDim$107(DynamicScheme dynamicScheme) {
        boolean bl2 = MaterialDynamicColors.isMonochrome(dynamicScheme);
        double d2 = bl2 ? 30.0 : 80.0;
        return d2;
    }

    private /* synthetic */ ToneDeltaPair lambda$primaryFixedDim$108(DynamicScheme object) {
        DynamicColor dynamicColor = this.primaryFixed();
        DynamicColor dynamicColor2 = this.primaryFixedDim();
        TonePolarity tonePolarity = TonePolarity.LIGHTER;
        object = new ToneDeltaPair(dynamicColor, dynamicColor2, 10.0, tonePolarity, true);
        return object;
    }

    private static /* synthetic */ Double lambda$primaryPaletteKeyColor$1(DynamicScheme dynamicScheme) {
        return dynamicScheme.primaryPalette.getKeyColor().getTone();
    }

    private static /* synthetic */ Double lambda$scrim$49(DynamicScheme dynamicScheme) {
        return 0.0;
    }

    private static /* synthetic */ Double lambda$secondary$68(DynamicScheme dynamicScheme) {
        boolean bl2 = dynamicScheme.isDark;
        double d2 = bl2 ? 80.0 : 40.0;
        return d2;
    }

    private /* synthetic */ ToneDeltaPair lambda$secondary$69(DynamicScheme object) {
        DynamicColor dynamicColor = this.secondaryContainer();
        DynamicColor dynamicColor2 = this.secondary();
        TonePolarity tonePolarity = TonePolarity.NEARER;
        object = new ToneDeltaPair(dynamicColor, dynamicColor2, 15.0, tonePolarity, false);
        return object;
    }

    private static /* synthetic */ Double lambda$secondaryContainer$74(DynamicScheme dynamicScheme) {
        double d2;
        boolean bl2 = dynamicScheme.isDark;
        double d5 = 30.0;
        double d7 = bl2 ? d5 : (d2 = 90.0);
        bl2 = MaterialDynamicColors.isMonochrome(dynamicScheme);
        if (bl2) {
            boolean bl3 = dynamicScheme.isDark;
            if (!bl3) {
                d5 = 85.0;
            }
            return d5;
        }
        bl2 = MaterialDynamicColors.isFidelity(dynamicScheme);
        if (!bl2) {
            return d7;
        }
        double d9 = dynamicScheme.secondaryPalette.getHue();
        double d12 = dynamicScheme.secondaryPalette.getChroma();
        boolean bl4 = dynamicScheme.isDark ^ true;
        double d13 = MaterialDynamicColors.findDesiredChromaByTone(d9, d12, d7, bl4);
        return MaterialDynamicColors.performAlbers(dynamicScheme.secondaryPalette.getHct(d13), dynamicScheme);
    }

    private /* synthetic */ ToneDeltaPair lambda$secondaryContainer$75(DynamicScheme object) {
        DynamicColor dynamicColor = this.secondaryContainer();
        DynamicColor dynamicColor2 = this.secondary();
        TonePolarity tonePolarity = TonePolarity.NEARER;
        object = new ToneDeltaPair(dynamicColor, dynamicColor2, 15.0, tonePolarity, false);
        return object;
    }

    private static /* synthetic */ Double lambda$secondaryFixed$118(DynamicScheme dynamicScheme) {
        boolean bl2 = MaterialDynamicColors.isMonochrome(dynamicScheme);
        double d2 = bl2 ? 80.0 : 90.0;
        return d2;
    }

    private /* synthetic */ ToneDeltaPair lambda$secondaryFixed$119(DynamicScheme object) {
        DynamicColor dynamicColor = this.secondaryFixed();
        DynamicColor dynamicColor2 = this.secondaryFixedDim();
        TonePolarity tonePolarity = TonePolarity.LIGHTER;
        object = new ToneDeltaPair(dynamicColor, dynamicColor2, 10.0, tonePolarity, true);
        return object;
    }

    private static /* synthetic */ Double lambda$secondaryFixedDim$121(DynamicScheme dynamicScheme) {
        boolean bl2 = MaterialDynamicColors.isMonochrome(dynamicScheme);
        double d2 = bl2 ? 70.0 : 80.0;
        return d2;
    }

    private /* synthetic */ ToneDeltaPair lambda$secondaryFixedDim$122(DynamicScheme object) {
        DynamicColor dynamicColor = this.secondaryFixed();
        DynamicColor dynamicColor2 = this.secondaryFixedDim();
        TonePolarity tonePolarity = TonePolarity.LIGHTER;
        object = new ToneDeltaPair(dynamicColor, dynamicColor2, 10.0, tonePolarity, true);
        return object;
    }

    private static /* synthetic */ Double lambda$secondaryPaletteKeyColor$3(DynamicScheme dynamicScheme) {
        return dynamicScheme.secondaryPalette.getKeyColor().getTone();
    }

    private static /* synthetic */ Double lambda$shadow$47(DynamicScheme dynamicScheme) {
        return 0.0;
    }

    private static /* synthetic */ Double lambda$surface$16(DynamicScheme dynamicScheme) {
        boolean bl2 = dynamicScheme.isDark;
        double d2 = bl2 ? 6.0 : 98.0;
        return d2;
    }

    private static /* synthetic */ Double lambda$surfaceBright$20(DynamicScheme dynamicScheme) {
        boolean bl2 = dynamicScheme.isDark;
        double d2 = bl2 ? 24.0 : 98.0;
        return d2;
    }

    private static /* synthetic */ Double lambda$surfaceContainer$26(DynamicScheme dynamicScheme) {
        boolean bl2 = dynamicScheme.isDark;
        double d2 = bl2 ? 12.0 : 94.0;
        return d2;
    }

    private static /* synthetic */ Double lambda$surfaceContainerHigh$28(DynamicScheme dynamicScheme) {
        boolean bl2 = dynamicScheme.isDark;
        double d2 = bl2 ? 17.0 : 92.0;
        return d2;
    }

    private static /* synthetic */ Double lambda$surfaceContainerHighest$30(DynamicScheme dynamicScheme) {
        boolean bl2 = dynamicScheme.isDark;
        double d2 = bl2 ? 22.0 : 90.0;
        return d2;
    }

    private static /* synthetic */ Double lambda$surfaceContainerLow$24(DynamicScheme dynamicScheme) {
        boolean bl2 = dynamicScheme.isDark;
        double d2 = bl2 ? 10.0 : 96.0;
        return d2;
    }

    private static /* synthetic */ Double lambda$surfaceContainerLowest$22(DynamicScheme dynamicScheme) {
        boolean bl2 = dynamicScheme.isDark;
        double d2 = bl2 ? 4.0 : 100.0;
        return d2;
    }

    private static /* synthetic */ Double lambda$surfaceDim$18(DynamicScheme dynamicScheme) {
        boolean bl2 = dynamicScheme.isDark;
        double d2 = bl2 ? 6.0 : 87.0;
        return d2;
    }

    private static /* synthetic */ Double lambda$surfaceTint$51(DynamicScheme dynamicScheme) {
        boolean bl2 = dynamicScheme.isDark;
        double d2 = bl2 ? 80.0 : 40.0;
        return d2;
    }

    private static /* synthetic */ Double lambda$surfaceVariant$34(DynamicScheme dynamicScheme) {
        boolean bl2 = dynamicScheme.isDark;
        double d2 = bl2 ? 30.0 : 90.0;
        return d2;
    }

    private static /* synthetic */ Double lambda$tertiary$80(DynamicScheme dynamicScheme) {
        boolean bl2 = MaterialDynamicColors.isMonochrome(dynamicScheme);
        if (bl2) {
            boolean bl3 = dynamicScheme.isDark;
            double d2 = bl3 ? 90.0 : 25.0;
            return d2;
        }
        boolean bl4 = dynamicScheme.isDark;
        double d5 = bl4 ? 80.0 : 40.0;
        return d5;
    }

    private /* synthetic */ ToneDeltaPair lambda$tertiary$81(DynamicScheme object) {
        DynamicColor dynamicColor = this.tertiaryContainer();
        DynamicColor dynamicColor2 = this.tertiary();
        TonePolarity tonePolarity = TonePolarity.NEARER;
        object = new ToneDeltaPair(dynamicColor, dynamicColor2, 15.0, tonePolarity, false);
        return object;
    }

    private static /* synthetic */ Double lambda$tertiaryContainer$86(DynamicScheme dynamicScheme) {
        boolean bl2 = MaterialDynamicColors.isMonochrome(dynamicScheme);
        if (bl2) {
            boolean bl3 = dynamicScheme.isDark;
            double d2 = bl3 ? 60.0 : 49.0;
            return d2;
        }
        bl2 = MaterialDynamicColors.isFidelity(dynamicScheme);
        if (!bl2) {
            boolean bl4 = dynamicScheme.isDark;
            double d5 = bl4 ? 30.0 : 90.0;
            return d5;
        }
        TonalPalette tonalPalette = dynamicScheme.tertiaryPalette;
        double d7 = dynamicScheme.sourceColorHct.getTone();
        double d9 = MaterialDynamicColors.performAlbers(tonalPalette.getHct(d7), dynamicScheme);
        return DislikeAnalyzer.fixIfDisliked(dynamicScheme.tertiaryPalette.getHct(d9)).getTone();
    }

    private /* synthetic */ ToneDeltaPair lambda$tertiaryContainer$87(DynamicScheme object) {
        DynamicColor dynamicColor = this.tertiaryContainer();
        DynamicColor dynamicColor2 = this.tertiary();
        TonePolarity tonePolarity = TonePolarity.NEARER;
        object = new ToneDeltaPair(dynamicColor, dynamicColor2, 15.0, tonePolarity, false);
        return object;
    }

    private static /* synthetic */ Double lambda$tertiaryFixed$132(DynamicScheme dynamicScheme) {
        boolean bl2 = MaterialDynamicColors.isMonochrome(dynamicScheme);
        double d2 = bl2 ? 40.0 : 90.0;
        return d2;
    }

    private /* synthetic */ ToneDeltaPair lambda$tertiaryFixed$133(DynamicScheme object) {
        DynamicColor dynamicColor = this.tertiaryFixed();
        DynamicColor dynamicColor2 = this.tertiaryFixedDim();
        TonePolarity tonePolarity = TonePolarity.LIGHTER;
        object = new ToneDeltaPair(dynamicColor, dynamicColor2, 10.0, tonePolarity, true);
        return object;
    }

    private static /* synthetic */ Double lambda$tertiaryFixedDim$135(DynamicScheme dynamicScheme) {
        boolean bl2 = MaterialDynamicColors.isMonochrome(dynamicScheme);
        double d2 = bl2 ? 30.0 : 80.0;
        return d2;
    }

    private /* synthetic */ ToneDeltaPair lambda$tertiaryFixedDim$136(DynamicScheme object) {
        DynamicColor dynamicColor = this.tertiaryFixed();
        DynamicColor dynamicColor2 = this.tertiaryFixedDim();
        TonePolarity tonePolarity = TonePolarity.LIGHTER;
        object = new ToneDeltaPair(dynamicColor, dynamicColor2, 10.0, tonePolarity, true);
        return object;
    }

    private static /* synthetic */ Double lambda$tertiaryPaletteKeyColor$5(DynamicScheme dynamicScheme) {
        return dynamicScheme.tertiaryPalette.getKeyColor().getTone();
    }

    private static /* synthetic */ Double lambda$textHintInverse$161(DynamicScheme dynamicScheme) {
        boolean bl2 = dynamicScheme.isDark;
        double d2 = bl2 ? 10.0 : 90.0;
        return d2;
    }

    private static /* synthetic */ Double lambda$textPrimaryInverse$153(DynamicScheme dynamicScheme) {
        boolean bl2 = dynamicScheme.isDark;
        double d2 = bl2 ? 10.0 : 90.0;
        return d2;
    }

    private static /* synthetic */ Double lambda$textPrimaryInverseDisableOnly$157(DynamicScheme dynamicScheme) {
        boolean bl2 = dynamicScheme.isDark;
        double d2 = bl2 ? 10.0 : 90.0;
        return d2;
    }

    private static /* synthetic */ Double lambda$textSecondaryAndTertiaryInverse$155(DynamicScheme dynamicScheme) {
        boolean bl2 = dynamicScheme.isDark;
        double d2 = bl2 ? 30.0 : 80.0;
        return d2;
    }

    private static /* synthetic */ Double lambda$textSecondaryAndTertiaryInverseDisabled$159(DynamicScheme dynamicScheme) {
        boolean bl2 = dynamicScheme.isDark;
        double d2 = bl2 ? 10.0 : 90.0;
        return d2;
    }

    public static /* synthetic */ Double m(MaterialDynamicColors materialDynamicColors, DynamicScheme dynamicScheme) {
        return materialDynamicColors.lambda$onSecondaryContainer$77(dynamicScheme);
    }

    public static /* synthetic */ Double m0(DynamicScheme dynamicScheme) {
        return MaterialDynamicColors.lambda$controlHighlight$151(dynamicScheme);
    }

    public static /* synthetic */ ToneDeltaPair m1(MaterialDynamicColors materialDynamicColors, DynamicScheme dynamicScheme) {
        return materialDynamicColors.lambda$primary$54(dynamicScheme);
    }

    public static /* synthetic */ Double n(DynamicScheme dynamicScheme) {
        return MaterialDynamicColors.lambda$secondary$68(dynamicScheme);
    }

    public static /* synthetic */ TonalPalette n0(DynamicScheme dynamicScheme) {
        return dynamicScheme.neutralPalette;
    }

    public static /* synthetic */ TonalPalette n1(DynamicScheme dynamicScheme) {
        return dynamicScheme.neutralPalette;
    }

    public static /* synthetic */ DynamicColor o(MaterialDynamicColors materialDynamicColors, DynamicScheme dynamicScheme) {
        return materialDynamicColors.lambda$onTertiaryFixedVariant$144(dynamicScheme);
    }

    public static /* synthetic */ ToneDeltaPair o0(MaterialDynamicColors materialDynamicColors, DynamicScheme dynamicScheme) {
        return materialDynamicColors.lambda$errorContainer$99(dynamicScheme);
    }

    public static /* synthetic */ TonalPalette o1(DynamicScheme dynamicScheme) {
        return dynamicScheme.errorPalette;
    }

    public static /* synthetic */ TonalPalette p(DynamicScheme dynamicScheme) {
        return dynamicScheme.primaryPalette;
    }

    public static /* synthetic */ Double p0(DynamicScheme dynamicScheme) {
        return MaterialDynamicColors.lambda$primaryFixed$104(dynamicScheme);
    }

    public static /* synthetic */ Double p1(DynamicScheme dynamicScheme) {
        return MaterialDynamicColors.lambda$secondaryFixed$118(dynamicScheme);
    }

    public static double performAlbers(Hct hct, DynamicScheme object) {
        object = MaterialDynamicColors.viewingConditionsForAlbers((DynamicScheme)object);
        object = hct.inViewingConditions((ViewingConditions)object);
        double d2 = hct.getTone();
        boolean bl2 = DynamicColor.tonePrefersLightForeground(d2);
        if (bl2 && !(bl2 = DynamicColor.toneAllowsLightForeground(d2 = ((Hct)object).getTone()))) {
            return DynamicColor.enableLightForeground(hct.getTone());
        }
        return DynamicColor.enableLightForeground(((Hct)object).getTone());
    }

    public static /* synthetic */ Double q(DynamicScheme dynamicScheme) {
        return MaterialDynamicColors.lambda$onErrorContainer$101(dynamicScheme);
    }

    public static /* synthetic */ TonalPalette q0(DynamicScheme dynamicScheme) {
        return dynamicScheme.tertiaryPalette;
    }

    public static /* synthetic */ DynamicColor q1(MaterialDynamicColors materialDynamicColors, DynamicScheme dynamicScheme) {
        return materialDynamicColors.lambda$onPrimaryFixedVariant$116(dynamicScheme);
    }

    public static /* synthetic */ TonalPalette r(DynamicScheme dynamicScheme) {
        return dynamicScheme.tertiaryPalette;
    }

    public static /* synthetic */ TonalPalette r0(DynamicScheme dynamicScheme) {
        return dynamicScheme.secondaryPalette;
    }

    public static /* synthetic */ TonalPalette r1(DynamicScheme dynamicScheme) {
        return dynamicScheme.primaryPalette;
    }

    public static /* synthetic */ Double s(DynamicScheme dynamicScheme) {
        return MaterialDynamicColors.lambda$surfaceContainerLowest$22(dynamicScheme);
    }

    public static /* synthetic */ ToneDeltaPair s0(MaterialDynamicColors materialDynamicColors, DynamicScheme dynamicScheme) {
        return materialDynamicColors.lambda$secondaryFixedDim$122(dynamicScheme);
    }

    public static /* synthetic */ TonalPalette s1(DynamicScheme dynamicScheme) {
        return dynamicScheme.tertiaryPalette;
    }

    public static /* synthetic */ Double t(DynamicScheme dynamicScheme) {
        return MaterialDynamicColors.lambda$background$11(dynamicScheme);
    }

    public static /* synthetic */ Double t0(DynamicScheme dynamicScheme) {
        return MaterialDynamicColors.lambda$neutralVariantPaletteKeyColor$9(dynamicScheme);
    }

    public static /* synthetic */ Double t1(DynamicScheme dynamicScheme) {
        return MaterialDynamicColors.lambda$onPrimaryFixed$110(dynamicScheme);
    }

    public static /* synthetic */ ToneDeltaPair u(MaterialDynamicColors materialDynamicColors, DynamicScheme dynamicScheme) {
        return materialDynamicColors.lambda$primaryContainer$60(dynamicScheme);
    }

    public static /* synthetic */ TonalPalette u0(DynamicScheme dynamicScheme) {
        return dynamicScheme.primaryPalette;
    }

    public static /* synthetic */ TonalPalette u1(DynamicScheme dynamicScheme) {
        return dynamicScheme.neutralPalette;
    }

    public static /* synthetic */ TonalPalette v(DynamicScheme dynamicScheme) {
        return dynamicScheme.neutralPalette;
    }

    public static /* synthetic */ TonalPalette v0(DynamicScheme dynamicScheme) {
        return dynamicScheme.neutralPalette;
    }

    public static /* synthetic */ ToneDeltaPair v1(MaterialDynamicColors materialDynamicColors, DynamicScheme dynamicScheme) {
        return materialDynamicColors.lambda$tertiaryFixedDim$136(dynamicScheme);
    }

    private static ViewingConditions viewingConditionsForAlbers(DynamicScheme dynamicScheme) {
        boolean bl2 = dynamicScheme.isDark;
        double d2 = bl2 ? 30.0 : 80.0;
        return ViewingConditions.defaultWithBackgroundLstar(d2);
    }

    public static /* synthetic */ TonalPalette w(DynamicScheme dynamicScheme) {
        return dynamicScheme.neutralVariantPalette;
    }

    public static /* synthetic */ TonalPalette w0(DynamicScheme dynamicScheme) {
        return dynamicScheme.tertiaryPalette;
    }

    public static /* synthetic */ Double w1(DynamicScheme dynamicScheme) {
        return MaterialDynamicColors.lambda$secondaryFixedDim$121(dynamicScheme);
    }

    public static /* synthetic */ DynamicColor x(MaterialDynamicColors materialDynamicColors, DynamicScheme dynamicScheme) {
        return materialDynamicColors.lambda$inversePrimary$66(dynamicScheme);
    }

    public static /* synthetic */ Double x0(DynamicScheme dynamicScheme) {
        return MaterialDynamicColors.lambda$surface$16(dynamicScheme);
    }

    public static /* synthetic */ TonalPalette x1(DynamicScheme dynamicScheme) {
        return dynamicScheme.neutralPalette;
    }

    public static /* synthetic */ DynamicColor y(MaterialDynamicColors materialDynamicColors, DynamicScheme dynamicScheme) {
        return materialDynamicColors.lambda$onSecondaryFixedVariant$130(dynamicScheme);
    }

    public static /* synthetic */ ToneDeltaPair y0(MaterialDynamicColors materialDynamicColors, DynamicScheme dynamicScheme) {
        return materialDynamicColors.lambda$tertiaryContainer$87(dynamicScheme);
    }

    public static /* synthetic */ TonalPalette y1(DynamicScheme dynamicScheme) {
        return dynamicScheme.neutralPalette;
    }

    public static /* synthetic */ TonalPalette z(DynamicScheme dynamicScheme) {
        return dynamicScheme.neutralVariantPalette;
    }

    public static /* synthetic */ Double z0(DynamicScheme dynamicScheme) {
        return MaterialDynamicColors.lambda$error$92(dynamicScheme);
    }

    public static /* synthetic */ ToneDeltaPair z1(MaterialDynamicColors materialDynamicColors, DynamicScheme dynamicScheme) {
        return materialDynamicColors.lambda$tertiary$81(dynamicScheme);
    }

    public DynamicColor background() {
        tj1_2 tj1_22 = new Object();
        uj1_2 uj1_22 = new Object();
        DynamicColor dynamicColor = new DynamicColor("background", tj1_22, uj1_22, true, null, null, null, null);
        return dynamicColor;
    }

    public DynamicColor controlActivated() {
        pi1_0 pi1_02 = new Object();
        qi1_0 qi1_02 = new Object();
        return DynamicColor.fromPalette("control_activated", pi1_02, qi1_02);
    }

    public DynamicColor controlHighlight() {
        mj1_1 mj1_12 = new Object();
        nj1_1 nj1_12 = new Object();
        oj1_1 oj1_12 = new Object();
        DynamicColor dynamicColor = new DynamicColor("control_highlight", mj1_12, nj1_12, false, null, null, null, null, oj1_12);
        return dynamicColor;
    }

    public DynamicColor controlNormal() {
        ai1_0 ai1_02 = new Object();
        li1_1 li1_12 = new Object();
        return DynamicColor.fromPalette("control_normal", ai1_02, li1_12);
    }

    public DynamicColor error() {
        di1_2 di1_22 = new Object();
        fi1_2 fi1_22 = new Object();
        ck1_0 ck1_02 = new ck1_0(this);
        ContrastCurve contrastCurve = new ContrastCurve(3.0, 4.5, 7.0, 11.0);
        gi1_2 gi1_22 = new gi1_2(this);
        DynamicColor dynamicColor = new DynamicColor("error", di1_22, fi1_22, true, ck1_02, null, contrastCurve, gi1_22);
        return dynamicColor;
    }

    public DynamicColor errorContainer() {
        vi1_1 vi1_12 = new Object();
        wi1_1 wi1_12 = new Object();
        ck1_0 ck1_02 = new ck1_0(this);
        ContrastCurve contrastCurve = new ContrastCurve(1.0, 1.0, 3.0, 7.0);
        xi1_1 xi1_12 = new xi1_1(this);
        DynamicColor dynamicColor = new DynamicColor("error_container", vi1_12, wi1_12, true, ck1_02, null, contrastCurve, xi1_12);
        return dynamicColor;
    }

    public DynamicColor highestSurface(DynamicScheme object) {
        boolean bl2 = ((DynamicScheme)object).isDark;
        object = bl2 ? this.surfaceBright() : this.surfaceDim();
        return object;
    }

    public DynamicColor inverseOnSurface() {
        ph1_1 ph1_12 = new Object();
        qh1_1 qh1_12 = new Object();
        rh1_1 rh1_12 = new rh1_1(this);
        ContrastCurve contrastCurve = new ContrastCurve(4.5, 7.0, 11.0, 21.0);
        DynamicColor dynamicColor = new DynamicColor("inverse_on_surface", ph1_12, qh1_12, false, rh1_12, null, contrastCurve, null);
        return dynamicColor;
    }

    public DynamicColor inversePrimary() {
        ij1_0 ij1_02 = new Object();
        jj1_0 jj1_02 = new Object();
        kj1_0 kj1_02 = new kj1_0(this);
        ContrastCurve contrastCurve = new ContrastCurve(3.0, 4.5, 7.0, 11.0);
        DynamicColor dynamicColor = new DynamicColor("inverse_primary", ij1_02, jj1_02, false, kj1_02, null, contrastCurve, null);
        return dynamicColor;
    }

    public DynamicColor inverseSurface() {
        ni1_2 ni1_22 = new Object();
        oi1_2 oi1_22 = new Object();
        DynamicColor dynamicColor = new DynamicColor("inverse_surface", ni1_22, oi1_22, false, null, null, null, null);
        return dynamicColor;
    }

    public DynamicColor neutralPaletteKeyColor() {
        ih1_1 ih1_12 = new Object();
        th1_0 th1_02 = new Object();
        return DynamicColor.fromPalette("neutral_palette_key_color", ih1_12, th1_02);
    }

    public DynamicColor neutralVariantPaletteKeyColor() {
        kk1_1 kk1_12 = new Object();
        lk1_1 lk1_12 = new Object();
        return DynamicColor.fromPalette("neutral_variant_palette_key_color", kk1_12, lk1_12);
    }

    public DynamicColor onBackground() {
        xj1_1 xj1_12 = new Object();
        yj1_1 yj1_12 = new Object();
        zj1_1 zj1_12 = new zj1_1(this);
        ContrastCurve contrastCurve = new ContrastCurve(3.0, 3.0, 4.5, 7.0);
        DynamicColor dynamicColor = new DynamicColor("on_background", xj1_12, yj1_12, false, zj1_12, null, contrastCurve, null);
        return dynamicColor;
    }

    public DynamicColor onError() {
        wj1_0 wj1_02 = new Object();
        xj1_0 xj1_02 = new Object();
        yj1_0 yj1_02 = new yj1_0(this);
        ContrastCurve contrastCurve = new ContrastCurve(4.5, 7.0, 11.0, 21.0);
        DynamicColor dynamicColor = new DynamicColor("on_error", wj1_02, xj1_02, false, yj1_02, null, contrastCurve, null);
        return dynamicColor;
    }

    public DynamicColor onErrorContainer() {
        qi1_1 qi1_12 = new Object();
        ri1_1 ri1_12 = new Object();
        si1_1 si1_12 = new si1_1(this);
        ContrastCurve contrastCurve = new ContrastCurve(4.5, 7.0, 11.0, 21.0);
        DynamicColor dynamicColor = new DynamicColor("on_error_container", qi1_12, ri1_12, false, si1_12, null, contrastCurve, null);
        return dynamicColor;
    }

    public DynamicColor onPrimary() {
        fj1_0 fj1_02 = new fj1_0(0);
        gj1_0 gj1_02 = new Object();
        hj1_0 hj1_02 = new hj1_0(this);
        ContrastCurve contrastCurve = new ContrastCurve(4.5, 7.0, 11.0, 21.0);
        DynamicColor dynamicColor = new DynamicColor("on_primary", fj1_02, gj1_02, false, hj1_02, null, contrastCurve, null);
        return dynamicColor;
    }

    public DynamicColor onPrimaryContainer() {
        bk1_0 bk1_02 = new Object();
        ck1_1 ck1_12 = new ck1_1(this);
        dk1_1 dk1_12 = new dk1_1(this);
        ContrastCurve contrastCurve = new ContrastCurve(4.5, 7.0, 11.0, 21.0);
        DynamicColor dynamicColor = new DynamicColor("on_primary_container", bk1_02, ck1_12, false, dk1_12, null, contrastCurve, null);
        return dynamicColor;
    }

    public DynamicColor onPrimaryFixed() {
        zh1_0 zh1_02 = new Object();
        ai1_1 ai1_12 = new Object();
        bi1_1 bi1_12 = new bi1_1(this);
        ci1_1 ci1_12 = new ci1_1(this);
        ContrastCurve contrastCurve = new ContrastCurve(4.5, 7.0, 11.0, 21.0);
        DynamicColor dynamicColor = new DynamicColor("on_primary_fixed", zh1_02, ai1_12, false, bi1_12, ci1_12, contrastCurve, null);
        return dynamicColor;
    }

    public DynamicColor onPrimaryFixedVariant() {
        pj1_0 pj1_02 = new Object();
        qj1_0 qj1_02 = new Object();
        hw0_1 hw0_12 = new hw0_1(this, 1);
        rj1_0 rj1_02 = new rj1_0(this);
        ContrastCurve contrastCurve = new ContrastCurve(3.0, 4.5, 7.0, 11.0);
        DynamicColor dynamicColor = new DynamicColor("on_primary_fixed_variant", pj1_02, qj1_02, false, hw0_12, rj1_02, contrastCurve, null);
        return dynamicColor;
    }

    public DynamicColor onSecondary() {
        yh1_1 yh1_12 = new Object();
        zh1_1 zh1_12 = new Object();
        ah1_1 ah1_12 = new ah1_1(this);
        ContrastCurve contrastCurve = new ContrastCurve(4.5, 7.0, 11.0, 21.0);
        DynamicColor dynamicColor = new DynamicColor("on_secondary", yh1_12, zh1_12, false, ah1_12, null, contrastCurve, null);
        return dynamicColor;
    }

    public DynamicColor onSecondaryContainer() {
        wh1_1 wh1_12 = new Object();
        xh1_1 xh1_12 = new xh1_1(this);
        yh1_0 yh1_02 = new yh1_0(this);
        ContrastCurve contrastCurve = new ContrastCurve(4.5, 7.0, 11.0, 21.0);
        DynamicColor dynamicColor = new DynamicColor("on_secondary_container", wh1_12, xh1_12, false, yh1_02, null, contrastCurve, null);
        return dynamicColor;
    }

    public DynamicColor onSecondaryFixed() {
        lh1_1 lh1_12 = new Object();
        mh1_0 mh1_02 = new Object();
        nh1_0 nh1_02 = new nh1_0(this);
        oh1_0 oh1_02 = new oh1_0(this);
        ContrastCurve contrastCurve = new ContrastCurve(4.5, 7.0, 11.0, 21.0);
        DynamicColor dynamicColor = new DynamicColor("on_secondary_fixed", lh1_12, mh1_02, false, nh1_02, oh1_02, contrastCurve, null);
        return dynamicColor;
    }

    public DynamicColor onSecondaryFixedVariant() {
        hi1_1 hi1_12 = new Object();
        ii1_1 ii1_12 = new Object();
        ji1_0 ji1_02 = new ji1_0(this);
        ki1_0 ki1_02 = new ki1_0(this);
        ContrastCurve contrastCurve = new ContrastCurve(3.0, 4.5, 7.0, 11.0);
        DynamicColor dynamicColor = new DynamicColor("on_secondary_fixed_variant", hi1_12, ii1_12, false, ji1_02, ki1_02, contrastCurve, null);
        return dynamicColor;
    }

    public DynamicColor onSurface() {
        gk1_1 gk1_12 = new Object();
        rk1_1 rk1_12 = new Object();
        ck1_0 ck1_02 = new ck1_0(this);
        ContrastCurve contrastCurve = new ContrastCurve(4.5, 7.0, 11.0, 21.0);
        DynamicColor dynamicColor = new DynamicColor("on_surface", gk1_12, rk1_12, false, ck1_02, null, contrastCurve, null);
        return dynamicColor;
    }

    public DynamicColor onSurfaceVariant() {
        li1_2 li1_22 = new Object();
        mi1_1 mi1_12 = new Object();
        ck1_0 ck1_02 = new ck1_0(this);
        ContrastCurve contrastCurve = new ContrastCurve(3.0, 4.5, 7.0, 11.0);
        DynamicColor dynamicColor = new DynamicColor("on_surface_variant", li1_22, mi1_12, false, ck1_02, null, contrastCurve, null);
        return dynamicColor;
    }

    public DynamicColor onTertiary() {
        aj1_0 aj1_02 = new Object();
        lj1_0 lj1_02 = new Object();
        vj1_1 vj1_12 = new vj1_1(this);
        ContrastCurve contrastCurve = new ContrastCurve(4.5, 7.0, 11.0, 21.0);
        DynamicColor dynamicColor = new DynamicColor("on_tertiary", aj1_02, lj1_02, false, vj1_12, null, contrastCurve, null);
        return dynamicColor;
    }

    public DynamicColor onTertiaryContainer() {
        sh1_1 sh1_12 = new Object();
        uh1_1 uh1_12 = new uh1_1(this);
        vh1_0 vh1_02 = new vh1_0(this);
        ContrastCurve contrastCurve = new ContrastCurve(4.5, 7.0, 11.0, 21.0);
        DynamicColor dynamicColor = new DynamicColor("on_tertiary_container", sh1_12, uh1_12, false, vh1_02, null, contrastCurve, null);
        return dynamicColor;
    }

    public DynamicColor onTertiaryFixed() {
        gj1_1 gj1_12 = new Object();
        hj1_1 hj1_12 = new Object();
        ij1_1 ij1_12 = new ij1_1(this);
        jj1_1 jj1_12 = new jj1_1(this);
        ContrastCurve contrastCurve = new ContrastCurve(4.5, 7.0, 11.0, 21.0);
        DynamicColor dynamicColor = new DynamicColor("on_tertiary_fixed", gj1_12, hj1_12, false, ij1_12, jj1_12, contrastCurve, null);
        return dynamicColor;
    }

    public DynamicColor onTertiaryFixedVariant() {
        UI1 uI1 = new Object();
        vi1_0 vi1_02 = new Object();
        wi1_0 wi1_02 = new wi1_0(this);
        xi1_0 xi1_02 = new xi1_0(this);
        ContrastCurve contrastCurve = new ContrastCurve(3.0, 4.5, 7.0, 11.0);
        DynamicColor dynamicColor = new DynamicColor("on_tertiary_fixed_variant", uI1, vi1_02, false, wi1_02, xi1_02, contrastCurve, null);
        return dynamicColor;
    }

    public DynamicColor outline() {
        gh1_0 gh1_02 = new Object();
        hh1_0 hh1_02 = new Object();
        ck1_0 ck1_02 = new ck1_0(this);
        ContrastCurve contrastCurve = new ContrastCurve(1.5, 3.0, 4.5, 7.0);
        DynamicColor dynamicColor = new DynamicColor("outline", gh1_02, hh1_02, false, ck1_02, null, contrastCurve, null);
        return dynamicColor;
    }

    public DynamicColor outlineVariant() {
        bj1_0 bj1_02 = new Object();
        cj1_0 cj1_02 = new Object();
        ck1_0 ck1_02 = new ck1_0(this);
        ContrastCurve contrastCurve = new ContrastCurve(1.0, 1.0, 3.0, 7.0);
        DynamicColor dynamicColor = new DynamicColor("outline_variant", bj1_02, cj1_02, false, ck1_02, null, contrastCurve, null);
        return dynamicColor;
    }

    public DynamicColor primary() {
        CI1 cI1 = new Object();
        di1_1 di1_12 = new Object();
        ck1_0 ck1_02 = new ck1_0(this);
        ContrastCurve contrastCurve = new ContrastCurve(3.0, 4.5, 7.0, 11.0);
        ei1_1 ei1_12 = new ei1_1(this);
        DynamicColor dynamicColor = new DynamicColor("primary", cI1, di1_12, true, ck1_02, null, contrastCurve, ei1_12);
        return dynamicColor;
    }

    public DynamicColor primaryContainer() {
        qj1_1 qj1_12 = new Object();
        rj1_1 rj1_12 = new Object();
        ck1_0 ck1_02 = new ck1_0(this);
        ContrastCurve contrastCurve = new ContrastCurve(1.0, 1.0, 3.0, 7.0);
        sj1_1 sj1_12 = new sj1_1(this);
        DynamicColor dynamicColor = new DynamicColor("primary_container", qj1_12, rj1_12, true, ck1_02, null, contrastCurve, sj1_12);
        return dynamicColor;
    }

    public DynamicColor primaryFixed() {
        tk1_2 tk1_22 = new Object();
        uK1 uK12 = new Object();
        ck1_0 ck1_02 = new ck1_0(this);
        ContrastCurve contrastCurve = new ContrastCurve(1.0, 1.0, 3.0, 7.0);
        vK1 vK12 = new vK1(this);
        DynamicColor dynamicColor = new DynamicColor("primary_fixed", tk1_22, uK12, true, ck1_02, null, contrastCurve, vK12);
        return dynamicColor;
    }

    public DynamicColor primaryFixedDim() {
        wk1_1 wk1_12 = new Object();
        xk1_1 xk1_12 = new Object();
        ck1_0 ck1_02 = new ck1_0(this);
        ContrastCurve contrastCurve = new ContrastCurve(1.0, 1.0, 3.0, 7.0);
        yk1_1 yk1_12 = new yk1_1(this);
        DynamicColor dynamicColor = new DynamicColor("primary_fixed_dim", wk1_12, xk1_12, true, ck1_02, null, contrastCurve, yk1_12);
        return dynamicColor;
    }

    public DynamicColor primaryPaletteKeyColor() {
        ri1_0 ri1_02 = new Object();
        si1_0 si1_02 = new Object();
        return DynamicColor.fromPalette("primary_palette_key_color", ri1_02, si1_02);
    }

    public DynamicColor scrim() {
        fi1_1 fi1_12 = new Object();
        gi1_1 gi1_12 = new Object();
        DynamicColor dynamicColor = new DynamicColor("scrim", fi1_12, gi1_12, false, null, null, null, null);
        return dynamicColor;
    }

    public DynamicColor secondary() {
        bh1_2 bh1_22 = new Object();
        ch1_1 ch1_12 = new Object();
        ck1_0 ck1_02 = new ck1_0(this);
        ContrastCurve contrastCurve = new ContrastCurve(3.0, 4.5, 7.0, 11.0);
        DH1 dH1 = new DH1(this);
        DynamicColor dynamicColor = new DynamicColor("secondary", bh1_22, ch1_12, true, ck1_02, null, contrastCurve, dH1);
        return dynamicColor;
    }

    public DynamicColor secondaryContainer() {
        cj1_1 cj1_12 = new Object();
        dj1_1 dj1_12 = new Object();
        ck1_0 ck1_02 = new ck1_0(this);
        ContrastCurve contrastCurve = new ContrastCurve(1.0, 1.0, 3.0, 7.0);
        fj1_1 fj1_12 = new fj1_1(this);
        DynamicColor dynamicColor = new DynamicColor("secondary_container", cj1_12, dj1_12, true, ck1_02, null, contrastCurve, fj1_12);
        return dynamicColor;
    }

    public DynamicColor secondaryFixed() {
        mj1_0 mj1_02 = new Object();
        nj1_0 nj1_02 = new Object();
        ck1_0 ck1_02 = new ck1_0(this);
        ContrastCurve contrastCurve = new ContrastCurve(1.0, 1.0, 3.0, 7.0);
        oj1_0 oj1_02 = new oj1_0(this);
        DynamicColor dynamicColor = new DynamicColor("secondary_fixed", mj1_02, nj1_02, true, ck1_02, null, contrastCurve, oj1_02);
        return dynamicColor;
    }

    public DynamicColor secondaryFixedDim() {
        ek1_1 ek1_12 = new Object();
        fk1_0 fk1_02 = new Object();
        ck1_0 ck1_02 = new ck1_0(this);
        ContrastCurve contrastCurve = new ContrastCurve(1.0, 1.0, 3.0, 7.0);
        hk1_1 hk1_12 = new hk1_1(this);
        DynamicColor dynamicColor = new DynamicColor("secondary_fixed_dim", ek1_12, fk1_02, true, ck1_02, null, contrastCurve, hk1_12);
        return dynamicColor;
    }

    public DynamicColor secondaryPaletteKeyColor() {
        yi1_0 yi1_02 = new Object();
        zi1_1 zi1_12 = new Object();
        return DynamicColor.fromPalette("secondary_palette_key_color", yi1_02, zi1_12);
    }

    public DynamicColor shadow() {
        ok1_0 ok1_02 = new Object();
        pk1_1 pk1_12 = new Object();
        DynamicColor dynamicColor = new DynamicColor("shadow", ok1_02, pk1_12, false, null, null, null, null);
        return dynamicColor;
    }

    public DynamicColor surface() {
        xh1_2 xh1_22 = new Object();
        ti1_0 ti1_02 = new Object();
        DynamicColor dynamicColor = new DynamicColor("surface", xh1_22, ti1_02, true, null, null, null, null);
        return dynamicColor;
    }

    public DynamicColor surfaceBright() {
        dj1_0 dj1_02 = new Object();
        ej1_0 ej1_02 = new Object();
        DynamicColor dynamicColor = new DynamicColor("surface_bright", dj1_02, ej1_02, true, null, null, null, null);
        return dynamicColor;
    }

    public DynamicColor surfaceContainer() {
        ji1_1 ji1_12 = new Object();
        ki1_1 ki1_12 = new Object();
        DynamicColor dynamicColor = new DynamicColor("surface_container", ji1_12, ki1_12, true, null, null, null, null);
        return dynamicColor;
    }

    public DynamicColor surfaceContainerHigh() {
        vj1_2 vj1_22 = new Object();
        wj1_1 wj1_12 = new Object();
        DynamicColor dynamicColor = new DynamicColor("surface_container_high", vj1_22, wj1_12, true, null, null, null, null);
        return dynamicColor;
    }

    public DynamicColor surfaceContainerHighest() {
        qk1_1 qk1_12 = new Object();
        sk1_1 sk1_12 = new Object();
        DynamicColor dynamicColor = new DynamicColor("surface_container_highest", qk1_12, sk1_12, true, null, null, null, null);
        return dynamicColor;
    }

    public DynamicColor surfaceContainerLow() {
        aj1_1 aj1_12 = new Object();
        bj1_1 bj1_12 = new Object();
        DynamicColor dynamicColor = new DynamicColor("surface_container_low", aj1_12, bj1_12, true, null, null, null, null);
        return dynamicColor;
    }

    public DynamicColor surfaceContainerLowest() {
        eh1_0 eh1_02 = new Object();
        fh1_0 fh1_02 = new Object();
        DynamicColor dynamicColor = new DynamicColor("surface_container_lowest", eh1_02, fh1_02, true, null, null, null, null);
        return dynamicColor;
    }

    public DynamicColor surfaceDim() {
        ei1_2 ei1_22 = new Object();
        pi1_1 pi1_12 = new Object();
        DynamicColor dynamicColor = new DynamicColor("surface_dim", ei1_22, pi1_12, true, null, null, null, null);
        return dynamicColor;
    }

    public DynamicColor surfaceTint() {
        jh1_1 jh1_12 = new Object();
        kh1_1 kh1_12 = new Object();
        DynamicColor dynamicColor = new DynamicColor("surface_tint", jh1_12, kh1_12, true, null, null, null, null);
        return dynamicColor;
    }

    public DynamicColor surfaceVariant() {
        ik1_1 ik1_12 = new Object();
        jk1_1 jk1_12 = new Object();
        DynamicColor dynamicColor = new DynamicColor("surface_variant", ik1_12, jk1_12, true, null, null, null, null);
        return dynamicColor;
    }

    public DynamicColor tertiary() {
        mi1_0 mi1_02 = new Object();
        ni1_1 ni1_12 = new Object();
        ck1_0 ck1_02 = new ck1_0(this);
        ContrastCurve contrastCurve = new ContrastCurve(3.0, 4.5, 7.0, 11.0);
        oi1_1 oi1_12 = new oi1_1(this);
        DynamicColor dynamicColor = new DynamicColor("tertiary", mi1_02, ni1_12, true, ck1_02, null, contrastCurve, oi1_12);
        return dynamicColor;
    }

    public DynamicColor tertiaryContainer() {
        zk1_0 zk1_02 = new Object();
        AK1 aK1 = new Object();
        ck1_0 ck1_02 = new ck1_0(this);
        ContrastCurve contrastCurve = new ContrastCurve(1.0, 1.0, 3.0, 7.0);
        BK1 bK1 = new BK1(this);
        DynamicColor dynamicColor = new DynamicColor("tertiary_container", zk1_02, aK1, true, ck1_02, null, contrastCurve, bK1);
        return dynamicColor;
    }

    public DynamicColor tertiaryFixed() {
        yi1_1 yi1_12 = new Object();
        zi1_2 zi1_22 = new Object();
        ck1_0 ck1_02 = new ck1_0(this);
        ContrastCurve contrastCurve = new ContrastCurve(1.0, 1.0, 3.0, 7.0);
        BI1 bI1 = new BI1(this);
        DynamicColor dynamicColor = new DynamicColor("tertiary_fixed", yi1_12, zi1_22, true, ck1_02, null, contrastCurve, bI1);
        return dynamicColor;
    }

    public DynamicColor tertiaryFixedDim() {
        sj1_0 sj1_02 = new Object();
        tj1_1 tj1_12 = new Object();
        ck1_0 ck1_02 = new ck1_0(this);
        ContrastCurve contrastCurve = new ContrastCurve(1.0, 1.0, 3.0, 7.0);
        uj1_1 uj1_12 = new uj1_1(this);
        DynamicColor dynamicColor = new DynamicColor("tertiary_fixed_dim", sj1_02, tj1_12, true, ck1_02, null, contrastCurve, uj1_12);
        return dynamicColor;
    }

    public DynamicColor tertiaryPaletteKeyColor() {
        kj1_1 kj1_12 = new Object();
        lj1_1 lj1_12 = new Object();
        return DynamicColor.fromPalette("tertiary_palette_key_color", kj1_12, lj1_12);
    }

    public DynamicColor textHintInverse() {
        mK1 mK12 = new Object();
        nK1 nK12 = new Object();
        return DynamicColor.fromPalette("text_hint_inverse", mK12, nK12);
    }

    public DynamicColor textPrimaryInverse() {
        hi1_2 hi1_22 = new Object();
        ii1_2 ii1_22 = new Object();
        return DynamicColor.fromPalette("text_primary_inverse", hi1_22, ii1_22);
    }

    public DynamicColor textPrimaryInverseDisableOnly() {
        zj1_0 zj1_02 = new Object();
        ak1_0 ak1_02 = new Object();
        return DynamicColor.fromPalette("text_primary_inverse_disable_only", zj1_02, ak1_02);
    }

    public DynamicColor textSecondaryAndTertiaryInverse() {
        ti1_1 ti1_12 = new Object();
        ui1_0 ui1_02 = new Object();
        return DynamicColor.fromPalette("text_secondary_and_tertiary_inverse", ti1_12, ui1_02);
    }

    public DynamicColor textSecondaryAndTertiaryInverseDisabled() {
        ej1_1 ej1_12 = new Object();
        pj1_1 pj1_12 = new Object();
        return DynamicColor.fromPalette("text_secondary_and_tertiary_inverse_disabled", ej1_12, pj1_12);
    }
}

