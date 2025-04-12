/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Build
 */
package com.google.android.material.internal;

import android.os.Build;
import java.util.Locale;

public class ManufacturerUtils {
    private static final String LGE = "lge";
    private static final String MEIZU = "meizu";
    private static final String SAMSUNG = "samsung";

    private ManufacturerUtils() {
    }

    private static String getManufacturer() {
        String string2 = Build.MANUFACTURER;
        if (string2 != null) {
            Locale locale = Locale.ENGLISH;
            return string2.toLowerCase(locale);
        }
        return "";
    }

    public static boolean isDateInputKeyboardMissingSeparatorCharacters() {
        boolean bl2 = ManufacturerUtils.isLGEDevice();
        bl2 = bl2 || (bl2 = ManufacturerUtils.isSamsungDevice());
        return bl2;
    }

    public static boolean isLGEDevice() {
        return ManufacturerUtils.getManufacturer().equals(LGE);
    }

    public static boolean isMeizuDevice() {
        return ManufacturerUtils.getManufacturer().equals(MEIZU);
    }

    public static boolean isSamsungDevice() {
        return ManufacturerUtils.getManufacturer().equals(SAMSUNG);
    }
}

