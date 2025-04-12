/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Build
 */
package com.affise.attribution.usecase;

import android.os.Build;
import com.affise.attribution.usecase.DeviceUseCase;
import java.io.BufferedReader;
import java.io.File;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.b;

public final class DeviceUseCaseImpl
implements DeviceUseCase {
    private Boolean emulator;
    private Boolean rooted;

    /*
     * Unable to fully structure code
     */
    private final boolean checkEmulator() {
        var1_1 = 3;
        var2_2 = 4;
        var3_3 = 1;
        var4_4 = "google_sdk";
        var5_5 = new String[]{var4_4, "droid4x", "Emulator", "Android SDK built for x86"};
        var7_7 = null;
        for (var6_6 = 0; var6_6 < var2_2; var6_6 += var3_3) {
            var8_8 = var5_5[var6_6];
            var9_9 = Build.MODEL;
            var10_10 = "MODEL";
            Intrinsics.checkNotNullExpressionValue(var9_9, var10_10);
            var11_11 = StringsKt.F((CharSequence)var9_9, (CharSequence)var8_8, (boolean)var3_3);
            if (!var11_11) continue;
            return (boolean)var3_3;
        }
        var8_8 = "nox";
        var5_5 = new String[]{"goldfish", "vbox86", var8_8};
        var7_7 = null;
        for (var6_6 = 0; var6_6 < var1_1; var6_6 += var3_3) {
            var9_9 = var5_5[var6_6];
            var10_10 = Build.HARDWARE;
            var12_12 = "HARDWARE";
            Intrinsics.checkNotNullExpressionValue(var10_10, var12_12);
            var13_13 = StringsKt.F(var10_10, (CharSequence)var9_9, (boolean)var3_3);
            if (!var13_13) continue;
            return (boolean)var3_3;
        }
        var7_7 = "sdk";
        var9_9 = "sdk_x86";
        var5_5 = new String[]{var7_7, var4_4, var9_9, "vbox86p", var8_8};
        var4_4 = null;
        for (var14_14 = 0; var14_14 < (var6_6 = 5); var14_14 += var3_3) {
            var7_7 = var5_5[var14_14];
            var9_9 = Build.PRODUCT;
            var10_10 = "PRODUCT";
            Intrinsics.checkNotNullExpressionValue(var9_9, var10_10);
            var6_6 = (int)StringsKt.F((CharSequence)var9_9, (CharSequence)var7_7, (boolean)var3_3);
            if (var6_6 == 0) continue;
            return (boolean)var3_3;
        }
        var5_5 = Build.MANUFACTURER;
        Intrinsics.checkNotNullExpressionValue(var5_5, "MANUFACTURER");
        var15_15 = StringsKt.F((CharSequence)var5_5, "Genymotion", (boolean)var3_3);
        var5_5 = (boolean)var15_15;
        var4_4 = Build.FINGERPRINT;
        Intrinsics.checkNotNullExpressionValue(var4_4, "FINGERPRINT");
        var7_7 = "generic";
        var14_14 = (int)b.s((String)var4_4, (String)var7_7, false);
        var4_4 = (boolean)var14_14;
        var9_9 = Build.BOARD;
        Intrinsics.checkNotNullExpressionValue(var9_9, "BOARD");
        var11_11 = StringsKt.F((CharSequence)var9_9, (CharSequence)var8_8, (boolean)var3_3);
        var8_8 = var11_11;
        var9_9 = Build.BRAND;
        var10_10 = "BRAND";
        Intrinsics.checkNotNullExpressionValue(var9_9, var10_10);
        var13_13 = b.s((String)var9_9, (String)var7_7, false);
        if (!var13_13) ** GOTO lbl-1000
        var9_9 = Build.DEVICE;
        var10_10 = "DEVICE";
        Intrinsics.checkNotNullExpressionValue(var9_9, var10_10);
        var6_6 = (int)b.s((String)var9_9, (String)var7_7, false);
        if (var6_6 != 0) {
            var6_6 = 1;
        } else lbl-1000:
        // 2 sources

        {
            var6_6 = 0;
            var7_7 = null;
        }
        var7_7 = (boolean)var6_6;
        var9_9 = new Boolean[var2_2];
        var9_9[0] = var5_5;
        var9_9[var3_3] = var4_4;
        var15_15 = 2;
        var9_9[var15_15] = var8_8;
        var9_9[var1_1] = var7_7;
        for (var1_1 = 0; var1_1 < var2_2; var1_1 += var3_3) {
            var5_5 = var9_9[var1_1];
            var15_15 = (int)var5_5.booleanValue();
            if (var15_15 == 0) continue;
            return (boolean)var3_3;
        }
        return false;
    }

    private final boolean checkRootByFile() {
        int n3;
        String string2 = "/data/local/su";
        String string3 = "/su/bin/su";
        String string4 = "/system/xbin/su";
        Object object = "/data/local/xbin/su";
        String string5 = "/data/local/bin/su";
        String string6 = "/system/sd/xbin/su";
        String string7 = "/system/bin/failsafe/su";
        String[] stringArray = new String[]{"/system/app/Superuser.apk", "/sbin/su", "/system/bin/su", string4, object, string5, string6, string7, string2, string3};
        for (int i3 = 0; i3 < (n3 = 10); ++i3) {
            string4 = stringArray[i3];
            object = new File(string4);
            n3 = (int)(((File)object).exists() ? 1 : 0);
            if (n3 == 0) continue;
            return true;
        }
        return false;
    }

    private final boolean checkRootBySu() {
        Object object;
        Object object2;
        Object object3;
        boolean bl2 = false;
        Process process = null;
        try {
            object3 = Runtime.getRuntime();
            object2 = "/system/xbin/which";
            object = "su";
        }
        catch (Throwable throwable) {
            if (process != null) {
                process.destroy();
            }
            return false;
        }
        object2 = new String[]{object2, object};
        process = ((Runtime)object3).exec((String[])object2);
        object = process.getInputStream();
        object2 = new InputStreamReader((InputStream)object);
        object3 = new BufferedReader((Reader)object2);
        object3 = ((BufferedReader)object3).readLine();
        if (object3 != null) {
            bl2 = true;
        }
        process.destroy();
        return bl2;
    }

    private final boolean checkRootByTag() {
        boolean bl2;
        String string2 = Build.TAGS;
        if (string2 != null) {
            String string3 = "test-keys";
            boolean bl3 = true;
            bl2 = StringsKt.F(string2, string3, bl3);
        } else {
            bl2 = false;
            string2 = null;
        }
        return bl2;
    }

    private final void ifTrue(Object[] objectArray, Function1 function1, Function0 function0) {
        for (Object object : objectArray) {
            boolean bl2 = (Boolean)(object = (Boolean)function1.invoke(object));
            if (!bl2) continue;
            function0.invoke();
            return;
        }
    }

    public boolean isEmulator() {
        Boolean bl2;
        Boolean bl3 = this.emulator;
        if (bl3 != null) {
            return bl3;
        }
        boolean bl4 = this.checkEmulator();
        this.emulator = bl2 = Boolean.valueOf(bl4);
        return bl4;
    }

    public boolean isRooted() {
        Boolean bl2;
        Boolean bl3 = this.rooted;
        if (bl3 != null) {
            return bl3;
        }
        boolean bl4 = this.checkRootByTag();
        if (!(bl4 || (bl4 = this.checkRootByFile()) || (bl4 = this.checkRootBySu()))) {
            bl4 = false;
            bl3 = null;
        } else {
            bl4 = true;
        }
        this.rooted = bl2 = Boolean.valueOf(bl4);
        return bl4;
    }
}

