/*
 * Decompiled with CFR 0.152.
 */
package com.google.gson.internal;

import com.google.gson.ReflectionAccessFilter;
import com.google.gson.ReflectionAccessFilter$FilterResult;
import com.google.gson.internal.ReflectionAccessFilterHelper$AccessChecker;
import java.lang.reflect.AccessibleObject;
import java.util.List;

public class ReflectionAccessFilterHelper {
    private ReflectionAccessFilterHelper() {
    }

    public static boolean canAccess(AccessibleObject accessibleObject, Object object) {
        return ReflectionAccessFilterHelper$AccessChecker.INSTANCE.canAccess(accessibleObject, object);
    }

    public static ReflectionAccessFilter$FilterResult getFilterResult(List object, Class clazz) {
        boolean bl2;
        object = object.iterator();
        while (bl2 = object.hasNext()) {
            ReflectionAccessFilter$FilterResult reflectionAccessFilter$FilterResult;
            ReflectionAccessFilter$FilterResult reflectionAccessFilter$FilterResult2 = ((ReflectionAccessFilter)object.next()).check(clazz);
            if (reflectionAccessFilter$FilterResult2 == (reflectionAccessFilter$FilterResult = ReflectionAccessFilter$FilterResult.INDECISIVE)) continue;
            return reflectionAccessFilter$FilterResult2;
        }
        return ReflectionAccessFilter$FilterResult.ALLOW;
    }

    public static boolean isAndroidType(Class clazz) {
        return ReflectionAccessFilterHelper.isAndroidType(clazz.getName());
    }

    private static boolean isAndroidType(String string2) {
        boolean bl2;
        String string3 = "android.";
        boolean bl3 = string2.startsWith(string3);
        if (!(bl3 || (bl3 = string2.startsWith(string3 = "androidx.")) || (bl2 = ReflectionAccessFilterHelper.isJavaType(string2)))) {
            bl2 = false;
            string2 = null;
        } else {
            bl2 = true;
        }
        return bl2;
    }

    public static boolean isAnyPlatformType(Class object) {
        boolean bl2;
        String string2;
        boolean bl3 = ReflectionAccessFilterHelper.isAndroidType((String)(object = ((Class)object).getName()));
        if (!(bl3 || (bl3 = ((String)object).startsWith(string2 = "kotlin.")) || (bl3 = ((String)object).startsWith(string2 = "kotlinx.")) || (bl2 = ((String)object).startsWith(string2 = "scala.")))) {
            bl2 = false;
            object = null;
        } else {
            bl2 = true;
        }
        return bl2;
    }

    public static boolean isJavaType(Class clazz) {
        return ReflectionAccessFilterHelper.isJavaType(clazz.getName());
    }

    private static boolean isJavaType(String string2) {
        boolean bl2;
        String string3 = "java.";
        boolean bl3 = string2.startsWith(string3);
        if (!bl3 && !(bl2 = string2.startsWith(string3 = "javax."))) {
            bl2 = false;
            string2 = null;
        } else {
            bl2 = true;
        }
        return bl2;
    }
}

