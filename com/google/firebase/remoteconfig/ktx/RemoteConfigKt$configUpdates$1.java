/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.remoteconfig.ktx;

import com.google.firebase.remoteconfig.ConfigUpdateListener;
import com.google.firebase.remoteconfig.ConfigUpdateListenerRegistration;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.google.firebase.remoteconfig.ktx.RemoteConfigKt$configUpdates$1$1;
import com.google.firebase.remoteconfig.ktx.RemoteConfigKt$configUpdates$1$registration$1;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

final class RemoteConfigKt$configUpdates$1
extends qg3_2
implements Function2 {
    final /* synthetic */ FirebaseRemoteConfig $this_configUpdates;
    private /* synthetic */ Object L$0;
    int label;

    public RemoteConfigKt$configUpdates$1(FirebaseRemoteConfig firebaseRemoteConfig, f80_0 f80_02) {
        this.$this_configUpdates = firebaseRemoteConfig;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        FirebaseRemoteConfig firebaseRemoteConfig = this.$this_configUpdates;
        RemoteConfigKt$configUpdates$1 remoteConfigKt$configUpdates$1 = new RemoteConfigKt$configUpdates$1(firebaseRemoteConfig, f80_02);
        remoteConfigKt$configUpdates$1.L$0 = object;
        return remoteConfigKt$configUpdates$1;
    }

    public final Object invoke(pz2_2 object, f80_0 object2) {
        object = (RemoteConfigKt$configUpdates$1)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((RemoteConfigKt$configUpdates$1)object).invokeSuspend(object2);
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
            object = (pz2_2)this.L$0;
            Object object2 = this.$this_configUpdates;
            Object object3 = new RemoteConfigKt$configUpdates$1$registration$1((FirebaseRemoteConfig)object2, (pz2_2)object);
            object2 = ((FirebaseRemoteConfig)object2).addOnConfigUpdateListener((ConfigUpdateListener)object3);
            Intrinsics.checkNotNullExpressionValue(object2, "FirebaseRemoteConfig.con\u2026      }\n        }\n      )");
            object3 = new RemoteConfigKt$configUpdates$1$1((ConfigUpdateListenerRegistration)object2);
            this.label = n4;
            object = lz2_1.a((pz2_2)object, (Function0)object3, this);
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

