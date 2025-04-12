/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.crashlytics.internal;

import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.metadata.RolloutAssignment;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.google.firebase.remoteconfig.interop.rollouts.RolloutsState;
import com.google.firebase.remoteconfig.interop.rollouts.RolloutsStateSubscriber;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

public final class CrashlyticsRemoteConfigListener
implements RolloutsStateSubscriber {
    private final UserMetadata userMetadata;

    public CrashlyticsRemoteConfigListener(UserMetadata userMetadata) {
        Intrinsics.checkNotNullParameter(userMetadata, "userMetadata");
        this.userMetadata = userMetadata;
    }

    public void onRolloutsStateChanged(RolloutsState iterator) {
        Intrinsics.checkNotNullParameter(iterator, "rolloutsState");
        UserMetadata userMetadata = this.userMetadata;
        iterator = ((RolloutsState)((Object)iterator)).getRolloutAssignments();
        Intrinsics.checkNotNullExpressionValue(iterator, "rolloutsState.rolloutAssignments");
        iterator = (Iterable)((Object)iterator);
        int n3 = yx_2.o((Iterable)((Object)iterator), 10);
        ArrayList<Object> arrayList = new ArrayList<Object>(n3);
        iterator = iterator.iterator();
        while ((n3 = (int)(iterator.hasNext() ? 1 : 0)) != 0) {
            Object object = (com.google.firebase.remoteconfig.interop.rollouts.RolloutAssignment)iterator.next();
            String string2 = ((com.google.firebase.remoteconfig.interop.rollouts.RolloutAssignment)object).getRolloutId();
            String string3 = ((com.google.firebase.remoteconfig.interop.rollouts.RolloutAssignment)object).getParameterKey();
            String string4 = ((com.google.firebase.remoteconfig.interop.rollouts.RolloutAssignment)object).getParameterValue();
            String string5 = ((com.google.firebase.remoteconfig.interop.rollouts.RolloutAssignment)object).getVariantId();
            long l2 = ((com.google.firebase.remoteconfig.interop.rollouts.RolloutAssignment)object).getTemplateVersion();
            object = RolloutAssignment.create(string2, string3, string4, string5, l2);
            arrayList.add(object);
        }
        userMetadata.updateRolloutsState(arrayList);
        Logger.getLogger().d("Updated Crashlytics Rollout State");
    }
}

