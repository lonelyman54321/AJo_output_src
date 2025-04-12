/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Application
 *  android.content.Context
 *  android.os.Bundle
 */
package androidx.navigation;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import androidx.lifecycle.b_0;
import androidx.navigation.d;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class d$d
extends Lambda
implements Function0 {
    public final /* synthetic */ d c;

    public d$d(d d2) {
        this.c = d2;
        super(0);
    }

    public final Object invoke() {
        d d2 = this.c;
        Object object = d2.a;
        Context context = null;
        boolean bl2 = (object = object != null ? object.getApplicationContext() : null) instanceof Application;
        if (bl2) {
            context = object;
            context = (Application)object;
        }
        object = d2.a();
        b_0 b_02 = new b_0((Application)context, d2, (Bundle)object);
        return b_02;
    }
}

