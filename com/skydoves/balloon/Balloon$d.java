/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.skydoves.balloon;

import android.content.Context;
import com.skydoves.balloon.Balloon;
import com.skydoves.balloon.e;
import com.skydoves.balloon.e$a;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class Balloon$d
extends Lambda
implements Function0 {
    public final /* synthetic */ Balloon c;

    public Balloon$d(Balloon balloon2) {
        this.c = balloon2;
        super(0);
    }

    public final Object invoke() {
        e e2;
        block8: {
            e$a e$a = e.a;
            Context context = this.c.a;
            Intrinsics.checkNotNullParameter(context, "context");
            e2 = e.b;
            if (e2 != null) break block8;
            synchronized (e$a) {
                Throwable throwable2;
                block9: {
                    block7: {
                        try {
                            e2 = e.b;
                            if (e2 != null) break block7;
                        }
                        catch (Throwable throwable2) {}
                        e.b = e2 = new Object();
                        String string2 = "com.skydoves.balloon";
                        context = context.getSharedPreferences(string2, 0);
                        string2 = "context.getSharedPrefere\u2026n\", Context.MODE_PRIVATE)";
                        Intrinsics.checkNotNullExpressionValue(context, string2);
                        break block9;
                    }
                    break block8;
                }
                throw throwable2;
            }
        }
        return e2;
    }
}

