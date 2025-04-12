/*
 * Decompiled with CFR 0.152.
 */
package androidx.activity;

import androidx.activity.ComponentActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class b
extends Lambda
implements Function0 {
    public final /* synthetic */ ComponentActivity c;

    public b(ComponentActivity componentActivity) {
        this.c = componentActivity;
        super(0);
    }

    public final Object invoke() {
        this.c.reportFullyDrawn();
        return Unit.a;
    }
}

