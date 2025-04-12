/*
 * Decompiled with CFR 0.152.
 */
package com.jio.unity.plugin.android;

import com.jio.unity.plugin.android.UnityBridge;

public abstract class a {
    public static void a(String string2, String string3) {
        StringBuilder stringBuilder = new StringBuilder(string2);
        stringBuilder.append(string3);
        UnityBridge.a(stringBuilder.toString());
    }
}

