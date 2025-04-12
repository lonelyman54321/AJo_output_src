/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.play.core.assetpacks;

import com.google.android.play.core.assetpacks.AssetPackLocation;

final class br
extends AssetPackLocation {
    private final int b;
    private final String c;
    private final String d;

    public br(int n3, String string2, String string3) {
        this.b = n3;
        this.c = string2;
        this.d = string3;
    }

    public final String assetsPath() {
        return this.d;
    }

    public final boolean equals(Object object) {
        block4: {
            boolean bl2;
            block6: {
                String string2;
                block5: {
                    String string3;
                    int n3;
                    bl2 = true;
                    if (object == this) {
                        return bl2;
                    }
                    int n4 = object instanceof AssetPackLocation;
                    if (n4 == 0 || (n4 = this.b) != (n3 = ((AssetPackLocation)(object = (AssetPackLocation)object)).packStorageMethod()) || !((string2 = this.c) == null ? (string2 = ((AssetPackLocation)object).path()) == null : (n4 = (int)(string2.equals(string3 = ((AssetPackLocation)object).path()) ? 1 : 0)) != 0)) break block4;
                    string2 = this.d;
                    if (string2 != null) break block5;
                    if ((object = ((AssetPackLocation)object).assetsPath()) != null) break block4;
                    break block6;
                }
                boolean bl3 = string2.equals(object = ((AssetPackLocation)object).assetsPath());
                if (!bl3) break block4;
            }
            return bl2;
        }
        return false;
    }

    public final int hashCode() {
        int n3;
        String string2 = this.c;
        int n4 = 0;
        if (string2 == null) {
            n3 = 0;
            string2 = null;
        } else {
            n3 = string2.hashCode();
        }
        int n7 = this.b;
        String string3 = this.d;
        if (string3 != null) {
            n4 = string3.hashCode();
        }
        int n8 = 1000003;
        n7 = (n7 ^ n8) * n8;
        return (n3 ^ n7) * n8 ^ n4;
    }

    public final int packStorageMethod() {
        return this.b;
    }

    public final String path() {
        return this.c;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("AssetPackLocation{packStorageMethod=");
        int n3 = this.b;
        stringBuilder.append(n3);
        stringBuilder.append(", path=");
        String string2 = this.c;
        stringBuilder.append(string2);
        stringBuilder.append(", assetsPath=");
        string2 = this.d;
        return h30_0.a(stringBuilder, string2, "}");
    }
}

