/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 */
package androidx.navigation;

import android.os.Bundle;
import androidx.navigation.d;
import androidx.navigation.e;
import androidx.navigation.i;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref$BooleanRef;

public final class e$e
extends Lambda
implements Function1 {
    public final /* synthetic */ Ref$BooleanRef c;
    public final /* synthetic */ e d;
    public final /* synthetic */ i e;
    public final /* synthetic */ Bundle f;

    public e$e(Ref$BooleanRef ref$BooleanRef, e e2, i i3, Bundle bundle) {
        this.c = ref$BooleanRef;
        this.d = e2;
        this.e = i3;
        this.f = bundle;
        super(1);
    }

    public final Object invoke(Object object) {
        object = (d)object;
        Intrinsics.checkNotNullParameter(object, "it");
        this.c.element = true;
        mz0_2 mz0_22 = mz0_2.a;
        i i3 = this.e;
        Bundle bundle = this.f;
        this.d.a(i3, bundle, (d)object, mz0_22);
        return Unit.a;
    }
}

