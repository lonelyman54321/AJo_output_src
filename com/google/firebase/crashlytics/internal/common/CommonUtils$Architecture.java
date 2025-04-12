/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Build
 *  android.text.TextUtils
 */
package com.google.firebase.crashlytics.internal.common;

import android.os.Build;
import android.text.TextUtils;
import com.google.firebase.crashlytics.internal.Logger;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

final class CommonUtils$Architecture
extends Enum {
    private static final /* synthetic */ CommonUtils$Architecture[] $VALUES;
    public static final /* enum */ CommonUtils$Architecture ARM64;
    public static final /* enum */ CommonUtils$Architecture ARMV6;
    public static final /* enum */ CommonUtils$Architecture ARMV7;
    public static final /* enum */ CommonUtils$Architecture ARMV7S;
    public static final /* enum */ CommonUtils$Architecture ARM_UNKNOWN;
    public static final /* enum */ CommonUtils$Architecture PPC;
    public static final /* enum */ CommonUtils$Architecture PPC64;
    public static final /* enum */ CommonUtils$Architecture UNKNOWN;
    public static final /* enum */ CommonUtils$Architecture X86_32;
    public static final /* enum */ CommonUtils$Architecture X86_64;
    private static final Map matcher;

    private static /* synthetic */ CommonUtils$Architecture[] $values() {
        CommonUtils$Architecture commonUtils$Architecture = X86_32;
        commonUtils$Architecture = X86_64;
        commonUtils$Architecture = ARM_UNKNOWN;
        commonUtils$Architecture = PPC;
        commonUtils$Architecture = PPC64;
        commonUtils$Architecture = ARMV6;
        commonUtils$Architecture = ARMV7;
        commonUtils$Architecture = UNKNOWN;
        commonUtils$Architecture = ARMV7S;
        commonUtils$Architecture = ARM64;
        CommonUtils$Architecture[] commonUtils$ArchitectureArray = new CommonUtils$Architecture[]{commonUtils$Architecture, commonUtils$Architecture, commonUtils$Architecture, commonUtils$Architecture, commonUtils$Architecture, commonUtils$Architecture, commonUtils$Architecture, commonUtils$Architecture, commonUtils$Architecture, commonUtils$Architecture};
        return commonUtils$ArchitectureArray;
    }

    static {
        HashMap<String, CommonUtils$Architecture> hashMap;
        CommonUtils$Architecture commonUtils$Architecture;
        CommonUtils$Architecture commonUtils$Architecture2;
        CommonUtils$Architecture commonUtils$Architecture3;
        CommonUtils$Architecture commonUtils$Architecture4;
        X86_32 = commonUtils$Architecture4 = new CommonUtils$Architecture("X86_32", 0);
        X86_64 = commonUtils$Architecture3 = new CommonUtils$Architecture("X86_64", 1);
        ARM_UNKNOWN = commonUtils$Architecture3 = new CommonUtils$Architecture("ARM_UNKNOWN", 2);
        PPC = commonUtils$Architecture3 = new CommonUtils$Architecture("PPC", 3);
        int n3 = 4;
        PPC64 = commonUtils$Architecture3 = new CommonUtils$Architecture("PPC64", n3);
        ARMV6 = commonUtils$Architecture3 = new CommonUtils$Architecture("ARMV6", 5);
        ARMV7 = commonUtils$Architecture2 = new CommonUtils$Architecture("ARMV7", 6);
        UNKNOWN = commonUtils$Architecture = new CommonUtils$Architecture("UNKNOWN", 7);
        ARMV7S = commonUtils$Architecture = new CommonUtils$Architecture("ARMV7S", 8);
        ARM64 = commonUtils$Architecture = new CommonUtils$Architecture("ARM64", 9);
        $VALUES = CommonUtils$Architecture.$values();
        matcher = hashMap = new HashMap<String, CommonUtils$Architecture>(n3);
        hashMap.put("armeabi-v7a", commonUtils$Architecture2);
        hashMap.put("armeabi", commonUtils$Architecture3);
        hashMap.put("arm64-v8a", commonUtils$Architecture);
        hashMap.put("x86", commonUtils$Architecture4);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private CommonUtils$Architecture() {
        void var2_-1;
        void var1_-1;
    }

    public static CommonUtils$Architecture getValue() {
        Object object = Build.CPU_ABI;
        boolean bl2 = TextUtils.isEmpty((CharSequence)object);
        if (bl2) {
            Logger.getLogger().v("Architecture#getValue()::Build.CPU_ABI returned null or empty");
            return UNKNOWN;
        }
        Object object2 = Locale.US;
        object = object.toLowerCase((Locale)object2);
        object2 = matcher;
        if ((object = (CommonUtils$Architecture)((Object)object2.get(object))) == null) {
            object = UNKNOWN;
        }
        return object;
    }

    public static CommonUtils$Architecture valueOf(String string2) {
        return Enum.valueOf(CommonUtils$Architecture.class, string2);
    }

    public static CommonUtils$Architecture[] values() {
        return (CommonUtils$Architecture[])$VALUES.clone();
    }
}

