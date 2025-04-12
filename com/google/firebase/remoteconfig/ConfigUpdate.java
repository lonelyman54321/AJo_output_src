/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.remoteconfig;

import com.google.firebase.remoteconfig.AutoValue_ConfigUpdate;
import java.util.Set;

public abstract class ConfigUpdate {
    public static ConfigUpdate create(Set set) {
        AutoValue_ConfigUpdate autoValue_ConfigUpdate = new AutoValue_ConfigUpdate(set);
        return autoValue_ConfigUpdate;
    }

    public abstract Set getUpdatedKeys();
}

