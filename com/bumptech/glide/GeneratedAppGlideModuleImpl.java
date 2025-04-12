/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.util.Log
 */
package com.bumptech.glide;

import android.content.Context;
import android.util.Log;
import com.bumptech.glide.GeneratedAppGlideModule;
import com.bumptech.glide.Registry;
import com.bumptech.glide.a;
import com.bumptech.glide.b;
import com.ril.ajio.utility.glide.AJioAppGlideModule;
import java.util.Collections;
import java.util.Set;

final class GeneratedAppGlideModuleImpl
extends GeneratedAppGlideModule {
    public final AJioAppGlideModule a;

    public GeneratedAppGlideModuleImpl(Context object) {
        this.a = object;
        Log.isLoggable((String)"Glide", (int)3);
    }

    public final void a(Context context, a a2, Registry registry) {
        com.bumptech.glide.integration.okhttp3.a a3 = new du1_0();
        a3.a(context, a2, registry);
        this.a.a(context, a2, registry);
    }

    public final void b(Context context, b b2) {
        this.a.b(context, b2);
    }

    public final void c() {
        this.a.getClass();
    }

    public final Set d() {
        return Collections.emptySet();
    }

    public final dK2$b e() {
        cz0_1 cz0_12 = new Object();
        return cz0_12;
    }
}

