/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.sessions.settings;

import com.google.firebase.sessions.settings.SettingsCache;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

final class SettingsCache$updateConfigValue$2
extends qg3_2
implements Function2 {
    final /* synthetic */ my2$a $key;
    final /* synthetic */ Object $value;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ SettingsCache this$0;

    public SettingsCache$updateConfigValue$2(Object object, my2$a my2$a, SettingsCache settingsCache2, f80_0 f80_02) {
        this.$value = object;
        this.$key = my2$a;
        this.this$0 = settingsCache2;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        Object object2 = this.$value;
        my2$a my2$a = this.$key;
        SettingsCache settingsCache2 = this.this$0;
        SettingsCache$updateConfigValue$2 settingsCache$updateConfigValue$2 = new SettingsCache$updateConfigValue$2(object2, my2$a, settingsCache2, f80_02);
        settingsCache$updateConfigValue$2.L$0 = object;
        return settingsCache$updateConfigValue$2;
    }

    public final Object invoke(kr1_1 object, f80_0 object2) {
        object = (SettingsCache$updateConfigValue$2)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((SettingsCache$updateConfigValue$2)object).invokeSuspend(object2);
    }

    public final Object invokeSuspend(Object object) {
        Object object2 = j90_0.COROUTINE_SUSPENDED;
        int n3 = this.label;
        if (n3 == 0) {
            vl2_2.b(object);
            object = (kr1_1)this.L$0;
            object2 = this.$value;
            Object object3 = "key";
            if (object2 != null) {
                my2$a my2$a = this.$key;
                object.getClass();
                Intrinsics.checkNotNullParameter(my2$a, (String)object3);
                ((kr1_1)object).d(my2$a, object2);
            } else {
                object2 = this.$key;
                object.getClass();
                Intrinsics.checkNotNullParameter(object2, (String)object3);
                ((kr1_1)object).c();
                object3 = ((kr1_1)object).a;
                object3.remove(object2);
            }
            SettingsCache.access$updateSessionConfigs(this.this$0, (my2_0)object);
            return Unit.a;
        }
        object = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        throw object;
    }
}

