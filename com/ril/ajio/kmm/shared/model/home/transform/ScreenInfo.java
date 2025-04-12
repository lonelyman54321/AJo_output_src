/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.kmm.shared.model.home.transform;

public final class ScreenInfo {
    private final int height;
    private final int width;

    public ScreenInfo(int n3, int n4) {
        this.width = n3;
        this.height = n4;
    }

    public static /* synthetic */ ScreenInfo copy$default(ScreenInfo screenInfo, int n3, int n4, int n7, Object object) {
        int n8 = n7 & 1;
        if (n8 != 0) {
            n3 = screenInfo.width;
        }
        if ((n7 &= 2) != 0) {
            n4 = screenInfo.height;
        }
        return screenInfo.copy(n3, n4);
    }

    public final int component1() {
        return this.width;
    }

    public final int component2() {
        return this.height;
    }

    public final ScreenInfo copy(int n3, int n4) {
        ScreenInfo screenInfo = new ScreenInfo(n3, n4);
        return screenInfo;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        int n3 = object instanceof ScreenInfo;
        if (n3 == 0) {
            return false;
        }
        object = (ScreenInfo)object;
        n3 = this.width;
        int n4 = ((ScreenInfo)object).width;
        if (n3 != n4) {
            return false;
        }
        n3 = this.height;
        int n7 = ((ScreenInfo)object).height;
        if (n3 != n7) {
            return false;
        }
        return bl2;
    }

    public final int getHeight() {
        return this.height;
    }

    public final int getWidth() {
        return this.width;
    }

    public int hashCode() {
        int n3 = this.width * 31;
        int n4 = this.height;
        return n3 + n4;
    }

    public String toString() {
        int n3 = this.width;
        int n4 = this.height;
        return z41.a("ScreenInfo(width=", ", height=", ")", n3, n4);
    }
}

