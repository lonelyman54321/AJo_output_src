/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.sessions.settings;

import com.google.firebase.sessions.settings.SettingsCache;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

final class SettingsCache$1
extends qg3_2
implements Function2 {
    Object L$0;
    int label;
    final /* synthetic */ SettingsCache this$0;

    public SettingsCache$1(SettingsCache settingsCache2, f80_0 f80_02) {
        this.this$0 = settingsCache2;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        SettingsCache settingsCache2 = this.this$0;
        object = new SettingsCache$1(settingsCache2, f80_02);
        return object;
    }

    public final Object invoke(i90_0 object, f80_0 object2) {
        object = (SettingsCache$1)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((SettingsCache$1)object).invokeSuspend(object2);
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public final Object invokeSuspend(Object object) {
        void var2_5;
        Object object2;
        j90_0 j90_02 = j90_0.COROUTINE_SUSPENDED;
        boolean bl2 = this.label;
        boolean bl3 = true;
        if (bl2) {
            if (bl2 != bl3) {
                object = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                throw object;
            }
            SettingsCache settingsCache2 = (SettingsCache)this.L$0;
            vl2_2.b(object);
        } else {
            vl2_2.b(object);
            object = this.this$0;
            object2 = SettingsCache.access$getDataStore$p((SettingsCache)object).getData();
            this.L$0 = object;
            this.label = bl3;
            object2 = ms0_1.j((es0_2)object2, this);
            if (object2 == j90_02) {
                return j90_02;
            }
            Object object3 = object;
            object = object2;
        }
        object = (my2_0)object;
        object = fh1_2.q(((my2_0)object).a());
        object2 = new kr1_1((Map)object, bl3);
        SettingsCache.access$updateSessionConfigs((SettingsCache)var2_5, (my2_0)object2);
        return Unit.a;
    }
}

