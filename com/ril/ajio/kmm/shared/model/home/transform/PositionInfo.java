/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.kmm.shared.model.home.transform;

public final class PositionInfo {
    private int x;
    private int y;

    public PositionInfo(int n3, int n4) {
        this.x = n3;
        this.y = n4;
    }

    public static /* synthetic */ PositionInfo copy$default(PositionInfo positionInfo, int n3, int n4, int n7, Object object) {
        int n8 = n7 & 1;
        if (n8 != 0) {
            n3 = positionInfo.x;
        }
        if ((n7 &= 2) != 0) {
            n4 = positionInfo.y;
        }
        return positionInfo.copy(n3, n4);
    }

    public final int component1() {
        return this.x;
    }

    public final int component2() {
        return this.y;
    }

    public final PositionInfo copy(int n3, int n4) {
        PositionInfo positionInfo = new PositionInfo(n3, n4);
        return positionInfo;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        int n3 = object instanceof PositionInfo;
        if (n3 == 0) {
            return false;
        }
        object = (PositionInfo)object;
        n3 = this.x;
        int n4 = ((PositionInfo)object).x;
        if (n3 != n4) {
            return false;
        }
        n3 = this.y;
        int n7 = ((PositionInfo)object).y;
        if (n3 != n7) {
            return false;
        }
        return bl2;
    }

    public final int getX() {
        return this.x;
    }

    public final int getY() {
        return this.y;
    }

    public int hashCode() {
        int n3 = this.x * 31;
        int n4 = this.y;
        return n3 + n4;
    }

    public final void setX(int n3) {
        this.x = n3;
    }

    public final void setY(int n3) {
        this.y = n3;
    }

    public String toString() {
        int n3 = this.x;
        int n4 = this.y;
        return z41.a("PositionInfo(x=", ", y=", ")", n3, n4);
    }
}

