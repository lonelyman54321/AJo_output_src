/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.material.color;

import com.google.android.material.R$color;
import com.google.android.material.color.utilities.DynamicColor;
import com.google.android.material.color.utilities.DynamicScheme;
import com.google.android.material.color.utilities.MaterialDynamicColors;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public final class MaterialColorUtilitiesHelper {
    private static final Map colorResourceIdToColorValue;
    private static final MaterialDynamicColors dynamicColors;

    static {
        Object object = new MaterialDynamicColors();
        dynamicColors = object;
        HashMap<Integer, Object> hashMap = new HashMap<Integer, Object>();
        Integer n3 = R$color.material_personalized_color_primary;
        DynamicColor dynamicColor = ((MaterialDynamicColors)object).primary();
        hashMap.put(n3, dynamicColor);
        n3 = R$color.material_personalized_color_on_primary;
        dynamicColor = ((MaterialDynamicColors)object).onPrimary();
        hashMap.put(n3, dynamicColor);
        n3 = R$color.material_personalized_color_primary_inverse;
        dynamicColor = ((MaterialDynamicColors)object).inversePrimary();
        hashMap.put(n3, dynamicColor);
        n3 = R$color.material_personalized_color_primary_container;
        dynamicColor = ((MaterialDynamicColors)object).primaryContainer();
        hashMap.put(n3, dynamicColor);
        n3 = R$color.material_personalized_color_on_primary_container;
        dynamicColor = ((MaterialDynamicColors)object).onPrimaryContainer();
        hashMap.put(n3, dynamicColor);
        n3 = R$color.material_personalized_color_secondary;
        dynamicColor = ((MaterialDynamicColors)object).secondary();
        hashMap.put(n3, dynamicColor);
        n3 = R$color.material_personalized_color_on_secondary;
        dynamicColor = ((MaterialDynamicColors)object).onSecondary();
        hashMap.put(n3, dynamicColor);
        n3 = R$color.material_personalized_color_secondary_container;
        dynamicColor = ((MaterialDynamicColors)object).secondaryContainer();
        hashMap.put(n3, dynamicColor);
        n3 = R$color.material_personalized_color_on_secondary_container;
        dynamicColor = ((MaterialDynamicColors)object).onSecondaryContainer();
        hashMap.put(n3, dynamicColor);
        n3 = R$color.material_personalized_color_tertiary;
        dynamicColor = ((MaterialDynamicColors)object).tertiary();
        hashMap.put(n3, dynamicColor);
        n3 = R$color.material_personalized_color_on_tertiary;
        dynamicColor = ((MaterialDynamicColors)object).onTertiary();
        hashMap.put(n3, dynamicColor);
        n3 = R$color.material_personalized_color_tertiary_container;
        dynamicColor = ((MaterialDynamicColors)object).tertiaryContainer();
        hashMap.put(n3, dynamicColor);
        n3 = R$color.material_personalized_color_on_tertiary_container;
        dynamicColor = ((MaterialDynamicColors)object).onTertiaryContainer();
        hashMap.put(n3, dynamicColor);
        n3 = R$color.material_personalized_color_background;
        dynamicColor = ((MaterialDynamicColors)object).background();
        hashMap.put(n3, dynamicColor);
        n3 = R$color.material_personalized_color_on_background;
        dynamicColor = ((MaterialDynamicColors)object).onBackground();
        hashMap.put(n3, dynamicColor);
        n3 = R$color.material_personalized_color_surface;
        dynamicColor = ((MaterialDynamicColors)object).surface();
        hashMap.put(n3, dynamicColor);
        n3 = R$color.material_personalized_color_on_surface;
        dynamicColor = ((MaterialDynamicColors)object).onSurface();
        hashMap.put(n3, dynamicColor);
        n3 = R$color.material_personalized_color_surface_variant;
        dynamicColor = ((MaterialDynamicColors)object).surfaceVariant();
        hashMap.put(n3, dynamicColor);
        n3 = R$color.material_personalized_color_on_surface_variant;
        dynamicColor = ((MaterialDynamicColors)object).onSurfaceVariant();
        hashMap.put(n3, dynamicColor);
        n3 = R$color.material_personalized_color_surface_inverse;
        dynamicColor = ((MaterialDynamicColors)object).inverseSurface();
        hashMap.put(n3, dynamicColor);
        n3 = R$color.material_personalized_color_on_surface_inverse;
        dynamicColor = ((MaterialDynamicColors)object).inverseOnSurface();
        hashMap.put(n3, dynamicColor);
        n3 = R$color.material_personalized_color_surface_bright;
        dynamicColor = ((MaterialDynamicColors)object).surfaceBright();
        hashMap.put(n3, dynamicColor);
        n3 = R$color.material_personalized_color_surface_dim;
        dynamicColor = ((MaterialDynamicColors)object).surfaceDim();
        hashMap.put(n3, dynamicColor);
        n3 = R$color.material_personalized_color_surface_container;
        dynamicColor = ((MaterialDynamicColors)object).surfaceContainer();
        hashMap.put(n3, dynamicColor);
        n3 = R$color.material_personalized_color_surface_container_low;
        dynamicColor = ((MaterialDynamicColors)object).surfaceContainerLow();
        hashMap.put(n3, dynamicColor);
        n3 = R$color.material_personalized_color_surface_container_high;
        dynamicColor = ((MaterialDynamicColors)object).surfaceContainerHigh();
        hashMap.put(n3, dynamicColor);
        n3 = R$color.material_personalized_color_surface_container_lowest;
        dynamicColor = ((MaterialDynamicColors)object).surfaceContainerLowest();
        hashMap.put(n3, dynamicColor);
        n3 = R$color.material_personalized_color_surface_container_highest;
        dynamicColor = ((MaterialDynamicColors)object).surfaceContainerHighest();
        hashMap.put(n3, dynamicColor);
        n3 = R$color.material_personalized_color_outline;
        dynamicColor = ((MaterialDynamicColors)object).outline();
        hashMap.put(n3, dynamicColor);
        n3 = R$color.material_personalized_color_outline_variant;
        dynamicColor = ((MaterialDynamicColors)object).outlineVariant();
        hashMap.put(n3, dynamicColor);
        n3 = R$color.material_personalized_color_error;
        dynamicColor = ((MaterialDynamicColors)object).error();
        hashMap.put(n3, dynamicColor);
        n3 = R$color.material_personalized_color_on_error;
        dynamicColor = ((MaterialDynamicColors)object).onError();
        hashMap.put(n3, dynamicColor);
        n3 = R$color.material_personalized_color_error_container;
        dynamicColor = ((MaterialDynamicColors)object).errorContainer();
        hashMap.put(n3, dynamicColor);
        n3 = R$color.material_personalized_color_on_error_container;
        dynamicColor = ((MaterialDynamicColors)object).onErrorContainer();
        hashMap.put(n3, dynamicColor);
        n3 = R$color.material_personalized_color_control_activated;
        dynamicColor = ((MaterialDynamicColors)object).controlActivated();
        hashMap.put(n3, dynamicColor);
        n3 = R$color.material_personalized_color_control_normal;
        dynamicColor = ((MaterialDynamicColors)object).controlNormal();
        hashMap.put(n3, dynamicColor);
        n3 = R$color.material_personalized_color_control_highlight;
        dynamicColor = ((MaterialDynamicColors)object).controlHighlight();
        hashMap.put(n3, dynamicColor);
        n3 = R$color.material_personalized_color_text_primary_inverse;
        dynamicColor = ((MaterialDynamicColors)object).textPrimaryInverse();
        hashMap.put(n3, dynamicColor);
        n3 = R$color.material_personalized_color_text_secondary_and_tertiary_inverse;
        dynamicColor = ((MaterialDynamicColors)object).textSecondaryAndTertiaryInverse();
        hashMap.put(n3, dynamicColor);
        n3 = R$color.material_personalized_color_text_secondary_and_tertiary_inverse_disabled;
        dynamicColor = ((MaterialDynamicColors)object).textSecondaryAndTertiaryInverseDisabled();
        hashMap.put(n3, dynamicColor);
        n3 = R$color.material_personalized_color_text_primary_inverse_disable_only;
        dynamicColor = ((MaterialDynamicColors)object).textPrimaryInverseDisableOnly();
        hashMap.put(n3, dynamicColor);
        n3 = R$color.material_personalized_color_text_hint_foreground_inverse;
        object = ((MaterialDynamicColors)object).textHintInverse();
        hashMap.put(n3, object);
        colorResourceIdToColorValue = Collections.unmodifiableMap(hashMap);
    }

    private MaterialColorUtilitiesHelper() {
    }

    public static Map createColorResourcesIdsToColorValues(DynamicScheme dynamicScheme) {
        int n3;
        HashMap<Integer, Object> hashMap = new HashMap<Integer, Object>();
        Iterator iterator = colorResourceIdToColorValue.entrySet().iterator();
        while ((n3 = iterator.hasNext()) != 0) {
            Object object = iterator.next();
            Integer n4 = (Integer)object.getKey();
            n3 = ((DynamicColor)object.getValue()).getArgb(dynamicScheme);
            object = n3;
            hashMap.put(n4, object);
        }
        return Collections.unmodifiableMap(hashMap);
    }
}

