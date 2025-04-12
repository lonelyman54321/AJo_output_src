/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.ComponentName
 *  android.content.Intent
 */
package me.leolin.shortcutbadger.impl;

import android.content.ComponentName;
import android.content.Intent;
import com.ril.ajio.AJIOApplication;
import java.util.Arrays;
import java.util.List;

public class ApexHomeBadger
implements mu_1 {
    public final void a(AJIOApplication aJIOApplication, ComponentName object, int n3) {
        Intent intent = new Intent("com.anddoes.launcher.COUNTER_CHANGED");
        String string2 = object.getPackageName();
        intent.putExtra("package", string2);
        intent.putExtra("count", n3);
        object = object.getClassName();
        intent.putExtra("class", (String)object);
        xd_2.a(aJIOApplication, intent);
    }

    public final List b() {
        return Arrays.asList("com.anddoes.launcher");
    }
}

