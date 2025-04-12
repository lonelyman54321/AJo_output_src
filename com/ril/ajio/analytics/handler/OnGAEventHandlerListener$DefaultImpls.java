/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.analytics.handler;

import com.ril.ajio.analytics.handler.OnGAEventHandlerListener;
import java.util.HashMap;
import java.util.List;

public final class OnGAEventHandlerListener$DefaultImpls {
    public static /* synthetic */ void pushEEBannerImpression$default(OnGAEventHandlerListener onGAEventHandlerListener, String string2, HashMap hashMap, String string3, String string4, String string5, String string6, String string7, boolean bl2, boolean bl3, String string8, int n3, Object object) {
        int n4 = n3;
        if (object == null) {
            String string9;
            String string10;
            int n7 = n3 & 0x40;
            String string11 = n7 != 0 ? (string10 = "") : string7;
            n7 = n4 & 0x80;
            boolean bl4 = n7 != 0 ? false : bl2;
            n7 = n4 & 0x100;
            boolean bl5 = n7 != 0 ? false : bl3;
            if ((n4 &= 0x200) != 0) {
                n4 = 0;
                Object var19_19 = null;
                string9 = null;
            } else {
                string9 = string8;
            }
            onGAEventHandlerListener.pushEEBannerImpression(string2, hashMap, string3, string4, string5, string6, string11, bl4, bl5, string9);
            return;
        }
        UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: pushEEBannerImpression");
        throw unsupportedOperationException;
    }

    public static /* synthetic */ void pushEEProductImpression$default(OnGAEventHandlerListener onGAEventHandlerListener, List list, String string2, String string3, String string4, String string5, boolean bl2, String string6, String string7, String string8, String string9, String string10, String string11, String string12, String string13, String string14, int n3, Object object) {
        int n4 = n3;
        if (object == null) {
            boolean bl3;
            int n7 = n3 & 8;
            String string15 = "";
            String string16 = n7 != 0 ? string15 : string4;
            n7 = n4 & 0x20;
            if (n7 != 0) {
                n7 = 0;
                bl3 = false;
            } else {
                bl3 = bl2;
            }
            n7 = n4 & 0x200;
            String string17 = n7 != 0 ? string15 : string9;
            n7 = n4 & 0x400;
            String string18 = n7 != 0 ? string15 : string10;
            n7 = n4 & 0x800;
            String string19 = n7 != 0 ? string15 : string11;
            n7 = n4 & 0x1000;
            string15 = null;
            String string20 = n7 != 0 ? null : string12;
            n7 = n4 & 0x2000;
            String string21 = n7 != 0 ? null : string13;
            String string22 = (n4 &= 0x4000) != 0 ? null : string14;
            onGAEventHandlerListener.pushEEProductImpression(list, string2, string3, string16, string5, bl3, string6, string7, string8, string17, string18, string19, string20, string21, string22);
            return;
        }
        UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: pushEEProductImpression");
        throw unsupportedOperationException;
    }
}

