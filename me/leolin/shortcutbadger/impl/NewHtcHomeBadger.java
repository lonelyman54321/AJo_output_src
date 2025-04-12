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
import java.util.Collections;
import java.util.List;
import me.leolin.shortcutbadger.ShortcutBadgeException;

public class NewHtcHomeBadger
implements mu_1 {
    public final void a(AJIOApplication object, ComponentName object2, int n3) {
        boolean bl2;
        Intent intent = new Intent("com.htc.launcher.action.SET_NOTIFICATION");
        String string2 = object2.flattenToShortString();
        intent.putExtra("com.htc.launcher.extra.COMPONENT", string2);
        intent.putExtra("com.htc.launcher.extra.COUNT", n3);
        string2 = new Intent("com.htc.launcher.action.UPDATE_SHORTCUT");
        String string3 = "packagename";
        object2 = object2.getPackageName();
        string2.putExtra(string3, (String)object2);
        string2.putExtra("count", n3);
        boolean bl3 = false;
        object2 = null;
        n3 = 1;
        try {
            xd_2.a((AJIOApplication)object, intent);
            bl2 = true;
        }
        catch (ShortcutBadgeException shortcutBadgeException) {
            bl2 = false;
            intent = null;
        }
        try {
            xd_2.a((AJIOApplication)object, (Intent)string2);
            bl3 = true;
        }
        catch (ShortcutBadgeException shortcutBadgeException) {}
        if (!bl2 && !bl3) {
            object2 = new StringBuilder("unable to resolve intent: ");
            String string4 = string2.toString();
            ((StringBuilder)object2).append(string4);
            object2 = ((StringBuilder)object2).toString();
            object = new Exception((String)object2);
            throw object;
        }
    }

    public final List b() {
        return Collections.singletonList("com.htc.launcher");
    }
}

