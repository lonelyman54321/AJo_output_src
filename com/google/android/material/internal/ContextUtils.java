/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.content.ContextWrapper
 */
package com.google.android.material.internal;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;

public class ContextUtils {
    public static Activity getActivity(Context context) {
        boolean bl2;
        while (bl2 = context instanceof ContextWrapper) {
            bl2 = context instanceof Activity;
            if (bl2) {
                return (Activity)context;
            }
            context = ((ContextWrapper)context).getBaseContext();
        }
        return null;
    }
}

