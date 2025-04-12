/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.ComponentName
 *  android.content.ContentValues
 *  android.net.Uri
 */
package me.leolin.shortcutbadger.impl;

import android.content.ComponentName;
import android.content.ContentValues;
import android.net.Uri;
import com.ril.ajio.AJIOApplication;
import java.util.Arrays;
import java.util.List;

public class NovaHomeBadger
implements mu_1 {
    public final void a(AJIOApplication aJIOApplication, ComponentName object, int n3) {
        ContentValues contentValues = new ContentValues();
        StringBuilder stringBuilder = new StringBuilder();
        String string2 = object.getPackageName();
        stringBuilder.append(string2);
        stringBuilder.append("/");
        object = object.getClassName();
        stringBuilder.append((String)object);
        object = stringBuilder.toString();
        contentValues.put("tag", (String)object);
        object = n3;
        contentValues.put("count", (Integer)object);
        aJIOApplication = aJIOApplication.getContentResolver();
        object = Uri.parse((String)"content://com.teslacoilsw.notifier/unread_count");
        aJIOApplication.insert((Uri)object, contentValues);
    }

    public final List b() {
        return Arrays.asList("com.teslacoilsw.launcher");
    }
}

