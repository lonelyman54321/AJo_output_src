/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.ril.ajio;

import android.content.Context;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

public final class a
extends qg3_2
implements Function2 {
    public final /* synthetic */ String a;

    public a(String string2, f80_0 f80_02) {
        this.a = string2;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        String string2 = this.a;
        object = new a(string2, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (a)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((a)object).invokeSuspend(object2);
    }

    public final Object invokeSuspend(Object object) {
        Object object2 = j90_0.COROUTINE_SUSPENDED;
        vl2_2.b(object);
        AJIOApplication.Companion.getClass();
        object2 = AJIOApplication$a.a();
        object = new pe1$a_0((Context)object2);
        object2 = this.a;
        ((pe1$a_0)object).c = object2;
        object = ((pe1$a_0)object).a();
        ((ce1_0)az3_0.a.getValue()).b((pe1_0)object);
        return Unit.a;
    }
}

