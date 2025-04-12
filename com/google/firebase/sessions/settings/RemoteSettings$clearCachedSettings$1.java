/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.sessions.settings;

import com.google.firebase.sessions.settings.RemoteSettings;
import com.google.firebase.sessions.settings.SettingsCache;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

final class RemoteSettings$clearCachedSettings$1
extends qg3_2
implements Function2 {
    int label;
    final /* synthetic */ RemoteSettings this$0;

    public RemoteSettings$clearCachedSettings$1(RemoteSettings remoteSettings, f80_0 f80_02) {
        this.this$0 = remoteSettings;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        RemoteSettings remoteSettings = this.this$0;
        object = new RemoteSettings$clearCachedSettings$1(remoteSettings, f80_02);
        return object;
    }

    public final Object invoke(i90_0 object, f80_0 object2) {
        object = (RemoteSettings$clearCachedSettings$1)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((RemoteSettings$clearCachedSettings$1)object).invokeSuspend(object2);
    }

    /*
     * Enabled aggressive block sorting
     */
    public final Object invokeSuspend(Object object) {
        j90_0 j90_02 = j90_0.COROUTINE_SUSPENDED;
        int n3 = this.label;
        int n4 = 1;
        if (n3 == 0) {
            vl2_2.b(object);
            object = RemoteSettings.access$getSettingsCache(this.this$0);
            this.label = n4;
            object = ((SettingsCache)object).removeConfigs$com_google_firebase_firebase_sessions(this);
            if (object != j90_02) return Unit.a;
            return j90_02;
        }
        if (n3 == n4) {
            vl2_2.b(object);
            return Unit.a;
        }
        object = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        throw object;
    }
}

