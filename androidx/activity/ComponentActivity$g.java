/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Application
 *  android.os.Bundle
 */
package androidx.activity;

import android.app.Application;
import android.os.Bundle;
import androidx.activity.ComponentActivity;
import androidx.lifecycle.b_0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class ComponentActivity$g
extends Lambda
implements Function0 {
    public final /* synthetic */ ComponentActivity c;

    public ComponentActivity$g(ComponentActivity componentActivity) {
        this.c = componentActivity;
        super(0);
    }

    public final Object invoke() {
        ComponentActivity componentActivity = this.c;
        Application application = componentActivity.getApplication();
        Object object = componentActivity.getIntent();
        object = object != null ? componentActivity.getIntent().getExtras() : null;
        b_0 b_02 = new b_0(application, componentActivity, (Bundle)object);
        return b_02;
    }
}

