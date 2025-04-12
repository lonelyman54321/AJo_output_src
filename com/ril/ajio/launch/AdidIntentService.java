/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Intent
 */
package com.ril.ajio.launch;

import android.content.Intent;
import androidx.core.app.JobIntentService;
import com.ril.ajio.launch.AdidIntentService$a;
import io.reactivex.internal.functions.Functions;
import kotlin.jvm.internal.Intrinsics;

public final class AdidIntentService
extends JobIntentService {
    public static final AdidIntentService$a Companion;
    public final t30_0 h;

    static {
        AdidIntentService$a adidIntentService$a;
        Companion = adidIntentService$a = new Object();
    }

    public AdidIntentService() {
        t30_0 t30_02;
        this.h = t30_02 = new t30_0();
    }

    public final void c(Intent object) {
        Intrinsics.checkNotNullParameter(object, "intent");
        object = yn3_0.a;
        Object object2 = new Object[]{};
        ((yn3$a)object).a("onHandleWork", object2);
        object = new a4_0();
        object = ((a4_0)object).a();
        object2 = new j5_0(0);
        Object object3 = new k5(object2, 0);
        object2 = new s53_0((q63_0)object, (bx0_2)object3);
        object = new l5(0);
        object3 = new u53_0((q63_0)object2, (bx0_2)object);
        object = Functions.c;
        object2 = Functions.d;
        object = ((g53_0)object3).f((o60_0)object, (o60_0)object2);
        this.h.b((yr0_2)object);
    }

    public final void d() {
        yn3$a yn3$a = yn3_0.a;
        Object[] objectArray = new Object[]{};
        yn3$a.a("onStopCurrentWork", objectArray);
    }

    public final void onDestroy() {
        super.onDestroy();
        this.h.d();
    }
}

