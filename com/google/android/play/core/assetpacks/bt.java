/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.play.core.assetpacks;

import com.google.android.play.core.assetpacks.AssetPackStates;
import java.util.Map;

final class bt
extends AssetPackStates {
    private final long a;
    private final Map b;

    public bt(long l2, Map map2) {
        this.a = l2;
        this.b = map2;
    }

    public final boolean equals(Object object) {
        Map map2;
        boolean bl2;
        long l2;
        long l3;
        long l4;
        boolean bl3 = true;
        if (object == this) {
            return bl3;
        }
        boolean bl4 = object instanceof AssetPackStates;
        if (bl4 && !(bl4 = (l4 = (l3 = this.a) - (l2 = ((AssetPackStates)(object = (AssetPackStates)object)).totalBytes())) == 0L ? 0 : (l4 < 0L ? -1 : 1)) && (bl2 = ((Object)(map2 = this.b)).equals(object = ((AssetPackStates)object).packStates()))) {
            return bl3;
        }
        return false;
    }

    public final int hashCode() {
        long l2 = this.a;
        long l3 = l2 >>> 32;
        int n3 = (int)(l2 ^ l3);
        Map map2 = this.b;
        int n4 = 1000003;
        n3 = (n3 ^ n4) * n4;
        return ((Object)map2).hashCode() ^ n3;
    }

    public final Map packStates() {
        return this.b;
    }

    public final String toString() {
        String string2 = this.b.toString();
        StringBuilder stringBuilder = new StringBuilder("AssetPackStates{totalBytes=");
        long l2 = this.a;
        stringBuilder.append(l2);
        stringBuilder.append(", packStates=");
        stringBuilder.append(string2);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public final long totalBytes() {
        return this.a;
    }
}

