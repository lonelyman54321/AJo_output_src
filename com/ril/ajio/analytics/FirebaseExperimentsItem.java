/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.analytics;

import com.ril.ajio.analytics.Params;
import kotlin.jvm.internal.Intrinsics;

public final class FirebaseExperimentsItem {
    public static final int $stable;
    private final String experiment_name;
    private final Params params;

    public FirebaseExperimentsItem(String string2, Params params) {
        Intrinsics.checkNotNullParameter(string2, "experiment_name");
        Intrinsics.checkNotNullParameter(params, "params");
        this.experiment_name = string2;
        this.params = params;
    }

    public static /* synthetic */ FirebaseExperimentsItem copy$default(FirebaseExperimentsItem firebaseExperimentsItem, String string2, Params params, int n3, Object object) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            string2 = firebaseExperimentsItem.experiment_name;
        }
        if ((n3 &= 2) != 0) {
            params = firebaseExperimentsItem.params;
        }
        return firebaseExperimentsItem.copy(string2, params);
    }

    public final String component1() {
        return this.experiment_name;
    }

    public final Params component2() {
        return this.params;
    }

    public final FirebaseExperimentsItem copy(String string2, Params params) {
        Intrinsics.checkNotNullParameter(string2, "experiment_name");
        Intrinsics.checkNotNullParameter(params, "params");
        FirebaseExperimentsItem firebaseExperimentsItem = new FirebaseExperimentsItem(string2, params);
        return firebaseExperimentsItem;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof FirebaseExperimentsItem;
        if (!bl3) {
            return false;
        }
        object = (FirebaseExperimentsItem)object;
        Object object2 = this.experiment_name;
        String string2 = ((FirebaseExperimentsItem)object).experiment_name;
        bl3 = Intrinsics.areEqual(object2, string2);
        if (!bl3) {
            return false;
        }
        object2 = this.params;
        object = ((FirebaseExperimentsItem)object).params;
        boolean bl4 = Intrinsics.areEqual(object2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final String getExperiment_name() {
        return this.experiment_name;
    }

    public final Params getParams() {
        return this.params;
    }

    public int hashCode() {
        int n3 = this.experiment_name.hashCode() * 31;
        return this.params.hashCode() + n3;
    }

    public String toString() {
        String string2 = this.experiment_name;
        Params params = this.params;
        StringBuilder stringBuilder = new StringBuilder("FirebaseExperimentsItem(experiment_name=");
        stringBuilder.append(string2);
        stringBuilder.append(", params=");
        stringBuilder.append(params);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

