/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.data.model;

import kotlin.jvm.internal.Intrinsics;

public final class ClosetComponentTimeTrack {
    public static final int $stable = 8;
    private int count;
    private String ddMmYyyy;

    public ClosetComponentTimeTrack(String string2, int n3) {
        Intrinsics.checkNotNullParameter(string2, "ddMmYyyy");
        this.ddMmYyyy = string2;
        this.count = n3;
    }

    public static /* synthetic */ ClosetComponentTimeTrack copy$default(ClosetComponentTimeTrack closetComponentTimeTrack, String string2, int n3, int n4, Object object) {
        int n7 = n4 & 1;
        if (n7 != 0) {
            string2 = closetComponentTimeTrack.ddMmYyyy;
        }
        if ((n4 &= 2) != 0) {
            n3 = closetComponentTimeTrack.count;
        }
        return closetComponentTimeTrack.copy(string2, n3);
    }

    public final String component1() {
        return this.ddMmYyyy;
    }

    public final int component2() {
        return this.count;
    }

    public final ClosetComponentTimeTrack copy(String string2, int n3) {
        Intrinsics.checkNotNullParameter(string2, "ddMmYyyy");
        ClosetComponentTimeTrack closetComponentTimeTrack = new ClosetComponentTimeTrack(string2, n3);
        return closetComponentTimeTrack;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        int n3 = object instanceof ClosetComponentTimeTrack;
        if (n3 == 0) {
            return false;
        }
        object = (ClosetComponentTimeTrack)object;
        String string2 = this.ddMmYyyy;
        String string3 = ((ClosetComponentTimeTrack)object).ddMmYyyy;
        n3 = Intrinsics.areEqual(string2, string3);
        if (n3 == 0) {
            return false;
        }
        n3 = this.count;
        int n4 = ((ClosetComponentTimeTrack)object).count;
        if (n3 != n4) {
            return false;
        }
        return bl2;
    }

    public final int getCount() {
        return this.count;
    }

    public final String getDdMmYyyy() {
        return this.ddMmYyyy;
    }

    public int hashCode() {
        int n3 = this.ddMmYyyy.hashCode() * 31;
        int n4 = this.count;
        return n3 + n4;
    }

    public final void setCount(int n3) {
        this.count = n3;
    }

    public final void setDdMmYyyy(String string2) {
        Intrinsics.checkNotNullParameter(string2, "<set-?>");
        this.ddMmYyyy = string2;
    }

    public String toString() {
        String string2 = this.ddMmYyyy;
        int n3 = this.count;
        StringBuilder stringBuilder = new StringBuilder("ClosetComponentTimeTrack(ddMmYyyy=");
        stringBuilder.append(string2);
        stringBuilder.append(", count=");
        stringBuilder.append(n3);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

