/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.sessions.settings;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

final class RemoteSettings$updateSettings$2$2
extends qg3_2
implements Function2 {
    /* synthetic */ Object L$0;
    int label;

    public RemoteSettings$updateSettings$2$2(f80_0 f80_02) {
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        RemoteSettings$updateSettings$2$2 remoteSettings$updateSettings$2$2 = new RemoteSettings$updateSettings$2$2(f80_02);
        remoteSettings$updateSettings$2$2.L$0 = object;
        return remoteSettings$updateSettings$2$2;
    }

    public final Object invoke(String object, f80_0 object2) {
        object = (RemoteSettings$updateSettings$2$2)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((RemoteSettings$updateSettings$2$2)object).invokeSuspend(object2);
    }

    public final Object invokeSuspend(Object object) {
        int n3 = this.label;
        if (n3 == 0) {
            vl2_2.b(object);
            object = (String)this.L$0;
            return Unit.a;
        }
        object = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        throw object;
    }
}

