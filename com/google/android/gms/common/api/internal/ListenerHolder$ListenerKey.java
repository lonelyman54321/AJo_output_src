/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.common.api.internal;

public final class ListenerHolder$ListenerKey {
    private final Object zaa;
    private final String zab;

    public ListenerHolder$ListenerKey(Object object, String string2) {
        this.zaa = object;
        this.zab = string2;
    }

    public boolean equals(Object object) {
        boolean bl2;
        boolean bl3 = true;
        if (this == object) {
            return bl3;
        }
        boolean bl4 = object instanceof ListenerHolder$ListenerKey;
        if (!bl4) {
            return false;
        }
        object = (ListenerHolder$ListenerKey)object;
        Object object2 = this.zaa;
        Object object3 = ((ListenerHolder$ListenerKey)object).zaa;
        if (object2 == object3 && (bl2 = ((String)(object2 = this.zab)).equals(object = ((ListenerHolder$ListenerKey)object).zab))) {
            return bl3;
        }
        return false;
    }

    public int hashCode() {
        int n3 = System.identityHashCode(this.zaa) * 31;
        return this.zab.hashCode() + n3;
    }

    public String toIdString() {
        int n3 = System.identityHashCode(this.zaa);
        StringBuilder stringBuilder = new StringBuilder();
        String string2 = this.zab;
        stringBuilder.append(string2);
        stringBuilder.append("@");
        stringBuilder.append(n3);
        return stringBuilder.toString();
    }
}

