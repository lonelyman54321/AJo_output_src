/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.ImageView
 */
package com.jio.jioads.videomodule.utility;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

public final class a {
    public final String a;
    public final ImageView b;
    public final boolean c;
    public final ViewGroup d;

    public a(String string2, View view, boolean bl2) {
        this.a = string2;
        if (bl2) {
            view = (ViewGroup)view;
            this.d = view;
        } else {
            view = (ImageView)view;
            this.b = view;
        }
        this.c = bl2;
    }
}

