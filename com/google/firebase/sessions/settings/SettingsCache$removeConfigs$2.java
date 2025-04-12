/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.sessions.settings;

import com.google.firebase.sessions.settings.SettingsCache;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

final class SettingsCache$removeConfigs$2
extends qg3_2
implements Function2 {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ SettingsCache this$0;

    public SettingsCache$removeConfigs$2(SettingsCache settingsCache2, f80_0 f80_02) {
        this.this$0 = settingsCache2;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        SettingsCache settingsCache2 = this.this$0;
        SettingsCache$removeConfigs$2 settingsCache$removeConfigs$2 = new SettingsCache$removeConfigs$2(settingsCache2, f80_02);
        settingsCache$removeConfigs$2.L$0 = object;
        return settingsCache$removeConfigs$2;
    }

    public final Object invoke(kr1_1 object, f80_0 object2) {
        object = (SettingsCache$removeConfigs$2)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((SettingsCache$removeConfigs$2)object).invokeSuspend(object2);
    }

    public final Object invokeSuspend(Object object) {
        int n3 = this.label;
        if (n3 == 0) {
            vl2_2.b(object);
            object = (kr1_1)this.L$0;
            ((kr1_1)object).c();
            ((kr1_1)object).a.clear();
            SettingsCache.access$updateSessionConfigs(this.this$0, (my2_0)object);
            return Unit.a;
        }
        object = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        throw object;
    }
}

