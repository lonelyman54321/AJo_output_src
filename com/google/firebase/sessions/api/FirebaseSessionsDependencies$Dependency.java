/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.sessions.api;

import com.google.firebase.sessions.api.SessionSubscriber;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

final class FirebaseSessionsDependencies$Dependency {
    private final hs1_2 mutex;
    private SessionSubscriber subscriber;

    public FirebaseSessionsDependencies$Dependency(hs1_2 hs1_22, SessionSubscriber sessionSubscriber) {
        Intrinsics.checkNotNullParameter(hs1_22, "mutex");
        this.mutex = hs1_22;
        this.subscriber = sessionSubscriber;
    }

    public /* synthetic */ FirebaseSessionsDependencies$Dependency(hs1_2 hs1_22, SessionSubscriber sessionSubscriber, int n3, DefaultConstructorMarker defaultConstructorMarker) {
        if ((n3 &= 2) != 0) {
            sessionSubscriber = null;
        }
        this(hs1_22, sessionSubscriber);
    }

    public static /* synthetic */ FirebaseSessionsDependencies$Dependency copy$default(FirebaseSessionsDependencies$Dependency firebaseSessionsDependencies$Dependency, hs1_2 hs1_22, SessionSubscriber sessionSubscriber, int n3, Object object) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            hs1_22 = firebaseSessionsDependencies$Dependency.mutex;
        }
        if ((n3 &= 2) != 0) {
            sessionSubscriber = firebaseSessionsDependencies$Dependency.subscriber;
        }
        return firebaseSessionsDependencies$Dependency.copy(hs1_22, sessionSubscriber);
    }

    public final hs1_2 component1() {
        return this.mutex;
    }

    public final SessionSubscriber component2() {
        return this.subscriber;
    }

    public final FirebaseSessionsDependencies$Dependency copy(hs1_2 hs1_22, SessionSubscriber sessionSubscriber) {
        Intrinsics.checkNotNullParameter(hs1_22, "mutex");
        FirebaseSessionsDependencies$Dependency firebaseSessionsDependencies$Dependency = new FirebaseSessionsDependencies$Dependency(hs1_22, sessionSubscriber);
        return firebaseSessionsDependencies$Dependency;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof FirebaseSessionsDependencies$Dependency;
        if (!bl3) {
            return false;
        }
        object = (FirebaseSessionsDependencies$Dependency)object;
        Object object2 = this.mutex;
        hs1_2 hs1_22 = ((FirebaseSessionsDependencies$Dependency)object).mutex;
        bl3 = Intrinsics.areEqual(object2, hs1_22);
        if (!bl3) {
            return false;
        }
        object2 = this.subscriber;
        object = ((FirebaseSessionsDependencies$Dependency)object).subscriber;
        boolean bl4 = Intrinsics.areEqual(object2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final hs1_2 getMutex() {
        return this.mutex;
    }

    public final SessionSubscriber getSubscriber() {
        return this.subscriber;
    }

    public int hashCode() {
        int n3;
        hs1_2 hs1_22 = this.mutex;
        int n4 = hs1_22.hashCode() * 31;
        SessionSubscriber sessionSubscriber = this.subscriber;
        if (sessionSubscriber == null) {
            n3 = 0;
            sessionSubscriber = null;
        } else {
            n3 = sessionSubscriber.hashCode();
        }
        return n4 + n3;
    }

    public final void setSubscriber(SessionSubscriber sessionSubscriber) {
        this.subscriber = sessionSubscriber;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("Dependency(mutex=");
        Object object = this.mutex;
        stringBuilder.append(object);
        stringBuilder.append(", subscriber=");
        object = this.subscriber;
        stringBuilder.append(object);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}

