/*
 * Decompiled with CFR 0.152.
 */
package androidx.activity;

import androidx.activity.ComponentActivity;
import androidx.activity.ComponentActivity$e;
import androidx.activity.b;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class ComponentActivity$h
extends Lambda
implements Function0 {
    public final /* synthetic */ ComponentActivity c;

    public ComponentActivity$h(ComponentActivity componentActivity) {
        this.c = componentActivity;
        super(0);
    }

    public final Object invoke() {
        ComponentActivity componentActivity = this.c;
        ComponentActivity$e componentActivity$e = ComponentActivity.access$getReportFullyDrawnExecutor$p(componentActivity);
        b b2 = new b(componentActivity);
        qX0 qX02 = new qX0(componentActivity$e, b2);
        return qX02;
    }
}

