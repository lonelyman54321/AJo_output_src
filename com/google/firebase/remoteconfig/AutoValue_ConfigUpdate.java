/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.remoteconfig;

import com.google.firebase.remoteconfig.ConfigUpdate;
import java.util.Set;

final class AutoValue_ConfigUpdate
extends ConfigUpdate {
    private final Set updatedKeys;

    public AutoValue_ConfigUpdate(Set object) {
        if (object != null) {
            this.updatedKeys = object;
            return;
        }
        object = new NullPointerException("Null updatedKeys");
        throw object;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        boolean bl2 = object instanceof ConfigUpdate;
        if (bl2) {
            object = (ConfigUpdate)object;
            Set set = this.updatedKeys;
            object = ((ConfigUpdate)object).getUpdatedKeys();
            return set.equals(object);
        }
        return false;
    }

    public Set getUpdatedKeys() {
        return this.updatedKeys;
    }

    public int hashCode() {
        return this.updatedKeys.hashCode() ^ 0xF4243;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("ConfigUpdate{updatedKeys=");
        Set set = this.updatedKeys;
        stringBuilder.append(set);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}

