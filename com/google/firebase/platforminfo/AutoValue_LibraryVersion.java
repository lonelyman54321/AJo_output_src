/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.platforminfo;

import com.google.firebase.platforminfo.LibraryVersion;

final class AutoValue_LibraryVersion
extends LibraryVersion {
    private final String libraryName;
    private final String version;

    public AutoValue_LibraryVersion(String object, String string2) {
        if (object != null) {
            this.libraryName = object;
            if (string2 != null) {
                this.version = string2;
                return;
            }
            object = new NullPointerException("Null version");
            throw object;
        }
        object = new NullPointerException("Null libraryName");
        throw object;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (object == this) {
            return bl2;
        }
        boolean bl3 = object instanceof LibraryVersion;
        if (bl3) {
            boolean bl4;
            String string2 = this.libraryName;
            String string3 = ((LibraryVersion)(object = (LibraryVersion)object)).getLibraryName();
            bl3 = string2.equals(string3);
            if (!bl3 || !(bl4 = (string2 = this.version).equals(object = ((LibraryVersion)object).getVersion()))) {
                bl2 = false;
            }
            return bl2;
        }
        return false;
    }

    public String getLibraryName() {
        return this.libraryName;
    }

    public String getVersion() {
        return this.version;
    }

    public int hashCode() {
        int n3 = this.libraryName.hashCode();
        int n4 = 1000003;
        n3 = (n3 ^ n4) * n4;
        n4 = this.version.hashCode();
        return n3 ^ n4;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("LibraryVersion{libraryName=");
        String string2 = this.libraryName;
        stringBuilder.append(string2);
        stringBuilder.append(", version=");
        string2 = this.version;
        return h30_0.a(stringBuilder, string2, "}");
    }
}

