/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.play.core.assetpacks;

import com.google.android.play.core.assetpacks.internal.ar;
import com.google.android.play.core.assetpacks.internal.as;
import com.google.android.play.core.assetpacks.o;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

public final class r
implements as {
    public final /* synthetic */ Object a() {
        Object object = new o();
        object = Executors.newSingleThreadExecutor((ThreadFactory)object);
        ar.a(object);
        return object;
    }
}

