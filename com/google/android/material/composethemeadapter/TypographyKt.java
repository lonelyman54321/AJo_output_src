/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.material.composethemeadapter;

import kotlin.jvm.internal.Intrinsics;

public final class TypographyKt {
    private static final xm3 emptyTextStyle;

    static {
        xm3 xm32;
        emptyTextStyle = xm32 = new xm3(0L, 0L, null, null, null, null, 0L, null, 0L, 262143);
    }

    public static final At3 merge(At3 at3, xm3 xm32, xm3 xm33, xm3 xm34, xm3 xm35, xm3 xm36, xm3 xm37, xm3 xm38, xm3 xm39, xm3 xm310, xm3 xm311, xm3 xm312, xm3 xm313, xm3 xm314) {
        At3 at32;
        Intrinsics.checkNotNullParameter(at3, "<this>");
        Intrinsics.checkNotNullParameter(xm32, "h1");
        Intrinsics.checkNotNullParameter(xm33, "h2");
        Intrinsics.checkNotNullParameter(xm34, "h3");
        Intrinsics.checkNotNullParameter(xm35, "h4");
        Intrinsics.checkNotNullParameter(xm36, "h5");
        Intrinsics.checkNotNullParameter(xm37, "h6");
        Intrinsics.checkNotNullParameter(xm38, "subtitle1");
        Intrinsics.checkNotNullParameter(xm39, "subtitle2");
        Intrinsics.checkNotNullParameter(xm310, "body1");
        Intrinsics.checkNotNullParameter(xm311, "body2");
        Intrinsics.checkNotNullParameter(xm312, "button");
        Intrinsics.checkNotNullParameter(xm313, "caption");
        Intrinsics.checkNotNullParameter(xm314, "overline");
        xm32 = at3.a.d(xm32);
        xm33 = at3.b.d(xm33);
        xm34 = at3.c.d(xm34);
        xm35 = at3.d.d(xm35);
        xm36 = at3.e.d(xm36);
        xm37 = at3.f.d(xm37);
        xm38 = at3.g.d(xm38);
        xm39 = at3.h.d(xm39);
        xm310 = at3.i.d(xm310);
        xm311 = at3.j.d(xm311);
        xm312 = at3.k.d(xm312);
        xm313 = at3.l.d(xm313);
        xm314 = at3.m.d(xm314);
        at3 = at32;
        at32 = new At3(xm32, xm33, xm34, xm35, xm36, xm37, xm38, xm39, xm310, xm311, xm312, xm313, xm314);
        return at32;
    }

    public static /* synthetic */ At3 merge$default(At3 at3, xm3 xm32, xm3 xm33, xm3 xm34, xm3 xm35, xm3 xm36, xm3 xm37, xm3 xm38, xm3 xm39, xm3 xm310, xm3 xm311, xm3 xm312, xm3 xm313, xm3 xm314, int n3, Object object) {
        int n4 = n3;
        int n7 = n3 & 1;
        xm3 xm315 = n7 != 0 ? emptyTextStyle : xm32;
        int n8 = n4 & 2;
        xm3 xm316 = n8 != 0 ? emptyTextStyle : xm33;
        int n10 = n4 & 4;
        xm3 xm317 = n10 != 0 ? emptyTextStyle : xm34;
        int n14 = n4 & 8;
        xm3 xm318 = n14 != 0 ? emptyTextStyle : xm35;
        int n15 = n4 & 0x10;
        xm3 xm319 = n15 != 0 ? emptyTextStyle : xm36;
        int n16 = n4 & 0x20;
        xm3 xm320 = n16 != 0 ? emptyTextStyle : xm37;
        int n17 = n4 & 0x40;
        xm3 xm321 = n17 != 0 ? emptyTextStyle : xm38;
        int n18 = n4 & 0x80;
        xm3 xm322 = n18 != 0 ? emptyTextStyle : xm39;
        int n19 = n4 & 0x100;
        xm3 xm323 = n19 != 0 ? emptyTextStyle : xm310;
        int n20 = n4 & 0x200;
        xm3 xm324 = n20 != 0 ? emptyTextStyle : xm311;
        int n21 = n4 & 0x400;
        xm3 xm325 = n21 != 0 ? emptyTextStyle : xm312;
        int n22 = n4 & 0x800;
        xm3 xm326 = n22 != 0 ? emptyTextStyle : xm313;
        xm3 xm327 = (n4 &= 0x1000) != 0 ? emptyTextStyle : xm314;
        xm32 = xm315;
        xm33 = xm316;
        xm34 = xm317;
        xm35 = xm318;
        xm36 = xm319;
        xm37 = xm320;
        xm38 = xm321;
        xm39 = xm322;
        xm310 = xm323;
        xm311 = xm324;
        xm312 = xm325;
        xm313 = xm326;
        xm314 = xm327;
        return TypographyKt.merge(at3, xm315, xm316, xm317, xm318, xm319, xm320, xm321, xm322, xm323, xm324, xm325, xm326, xm327);
    }
}

