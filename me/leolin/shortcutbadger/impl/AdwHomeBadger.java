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

public class AdwHomeBadger
implements mu_1 {
    public final void a(AJIOApplication aJIOApplication, ComponentName object, int n3) {
        Intent intent = new Intent("org.adw.launcher.counter.SEND");
        String string2 = object.getPackageName();
        intent.putExtra("PNAME", string2);
        object = object.getClassName();
        intent.putExtra("CNAME", (String)object);
        intent.putExtra("COUNT", n3);
        xd_2.a(aJIOApplication, intent);
    }

    public final List b() {
        return Arrays.asList("org.adw.launcher", "org.adwfreak.launcher");
    }
}

