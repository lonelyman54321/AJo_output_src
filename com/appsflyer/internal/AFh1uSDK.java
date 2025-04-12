/*
 * Decompiled with CFR 0.152.
 */
package com.appsflyer.internal;

import com.appsflyer.internal.AFh1uSDK$Companion;
import com.appsflyer.internal.AFh1vSDK;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.b;

public abstract class AFh1uSDK {
    public static long AFAdRevenueData;
    public static final AFh1uSDK$Companion Companion;
    private final boolean shouldExtendMsg;

    static {
        AFh1uSDK$Companion aFh1uSDK$Companion;
        Companion = aFh1uSDK$Companion = new AFh1uSDK$Companion(null);
        AFAdRevenueData = System.currentTimeMillis();
    }

    public static final /* synthetic */ long access$getSTART_TIME$cp() {
        return AFAdRevenueData;
    }

    public static /* synthetic */ void d$default(AFh1uSDK object, AFh1vSDK aFh1vSDK, String string2, boolean bl2, int n3, Object object2) {
        if (object2 == null) {
            if ((n3 &= 4) != 0) {
                bl2 = true;
            }
            ((AFh1uSDK)object).d(aFh1vSDK, string2, bl2);
            return;
        }
        object = new UnsupportedOperationException();
        throw object;
    }

    public static /* synthetic */ void e$default(AFh1uSDK aFh1uSDK, AFh1vSDK aFh1vSDK, String string2, Throwable throwable, boolean bl2, boolean bl3, boolean bl4, boolean bl5, int n3, Object object) {
        if (object == null) {
            int n4 = n3 & 8;
            boolean bl6 = n4 != 0 ? true : bl2;
            n4 = n3 & 0x10;
            boolean bl7 = n4 != 0 ? true : bl3;
            n4 = n3 & 0x20;
            boolean bl8 = n4 != 0 ? true : bl4;
            n4 = n3 & 0x40;
            boolean bl9 = n4 != 0 ? true : bl5;
            aFh1uSDK.e(aFh1vSDK, string2, throwable, bl6, bl7, bl8, bl9);
            return;
        }
        UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException();
        throw unsupportedOperationException;
    }

    public static /* synthetic */ void i$default(AFh1uSDK object, AFh1vSDK aFh1vSDK, String string2, boolean bl2, int n3, Object object2) {
        if (object2 == null) {
            if ((n3 &= 4) != 0) {
                bl2 = true;
            }
            ((AFh1uSDK)object).i(aFh1vSDK, string2, bl2);
            return;
        }
        object = new UnsupportedOperationException();
        throw object;
    }

    public static /* synthetic */ void v$default(AFh1uSDK object, AFh1vSDK aFh1vSDK, String string2, boolean bl2, int n3, Object object2) {
        if (object2 == null) {
            if ((n3 &= 4) != 0) {
                bl2 = true;
            }
            ((AFh1uSDK)object).v(aFh1vSDK, string2, bl2);
            return;
        }
        object = new UnsupportedOperationException();
        throw object;
    }

    public static /* synthetic */ void w$default(AFh1uSDK object, AFh1vSDK aFh1vSDK, String string2, boolean bl2, int n3, Object object2) {
        if (object2 == null) {
            if ((n3 &= 4) != 0) {
                bl2 = true;
            }
            ((AFh1uSDK)object).w(aFh1vSDK, string2, bl2);
            return;
        }
        object = new UnsupportedOperationException();
        throw object;
    }

    public final void d(AFh1vSDK aFh1vSDK, String string2) {
        String string3 = "";
        Intrinsics.checkNotNullParameter((Object)aFh1vSDK, string3);
        Intrinsics.checkNotNullParameter(string2, string3);
        AFh1uSDK.d$default(this, aFh1vSDK, string2, false, 4, null);
    }

    public void d(AFh1vSDK aFh1vSDK, String string2, boolean bl2) {
        String string3 = "";
        Intrinsics.checkNotNullParameter((Object)aFh1vSDK, string3);
        Intrinsics.checkNotNullParameter(string2, string3);
    }

    public final void e(AFh1vSDK aFh1vSDK, String string2, Throwable throwable) {
        String string3 = "";
        Intrinsics.checkNotNullParameter((Object)aFh1vSDK, string3);
        Intrinsics.checkNotNullParameter(string2, string3);
        Intrinsics.checkNotNullParameter(throwable, string3);
        AFh1uSDK.e$default(this, aFh1vSDK, string2, throwable, false, false, false, false, 120, null);
    }

    public final void e(AFh1vSDK aFh1vSDK, String string2, Throwable throwable, boolean bl2) {
        String string3 = "";
        Intrinsics.checkNotNullParameter((Object)aFh1vSDK, string3);
        Intrinsics.checkNotNullParameter(string2, string3);
        Intrinsics.checkNotNullParameter(throwable, string3);
        AFh1uSDK.e$default(this, aFh1vSDK, string2, throwable, bl2, false, false, false, 112, null);
    }

    public final void e(AFh1vSDK aFh1vSDK, String string2, Throwable throwable, boolean bl2, boolean bl3) {
        String string3 = "";
        Intrinsics.checkNotNullParameter((Object)aFh1vSDK, string3);
        Intrinsics.checkNotNullParameter(string2, string3);
        Intrinsics.checkNotNullParameter(throwable, string3);
        AFh1uSDK.e$default(this, aFh1vSDK, string2, throwable, bl2, bl3, false, false, 96, null);
    }

    public final void e(AFh1vSDK aFh1vSDK, String string2, Throwable throwable, boolean bl2, boolean bl3, boolean bl4) {
        String string3 = "";
        Intrinsics.checkNotNullParameter((Object)aFh1vSDK, string3);
        Intrinsics.checkNotNullParameter(string2, string3);
        Intrinsics.checkNotNullParameter(throwable, string3);
        AFh1uSDK.e$default(this, aFh1vSDK, string2, throwable, bl2, bl3, bl4, false, 64, null);
    }

    public void e(AFh1vSDK aFh1vSDK, String string2, Throwable throwable, boolean bl2, boolean bl3, boolean bl4, boolean bl5) {
        String string3 = "";
        Intrinsics.checkNotNullParameter((Object)aFh1vSDK, string3);
        Intrinsics.checkNotNullParameter(string2, string3);
        Intrinsics.checkNotNullParameter(throwable, string3);
    }

    public void force(AFh1vSDK aFh1vSDK, String string2) {
        String string3 = "";
        Intrinsics.checkNotNullParameter((Object)aFh1vSDK, string3);
        Intrinsics.checkNotNullParameter(string2, string3);
    }

    public final String getRevenue(String string2, AFh1vSDK object) {
        boolean bl2;
        String string3 = "";
        Intrinsics.checkNotNullParameter(object, string3);
        if (string2 == null || (bl2 = b.k(string2))) {
            string2 = "null";
        }
        string2 = this.withTag$SDK_prodRelease(string2, (AFh1vSDK)((Object)object));
        boolean bl3 = this.getShouldExtendMsg();
        if (bl3) {
            long l2 = System.currentTimeMillis();
            long l3 = AFAdRevenueData;
            object = Thread.currentThread().getName();
            String string4 = "(";
            StringBuilder stringBuilder = new StringBuilder(string4);
            stringBuilder.append(l2 -= l3);
            string3 = ") [";
            stringBuilder.append(string3);
            stringBuilder.append((String)object);
            object = "] ";
            string2 = h30_0.a(stringBuilder, (String)object, string2);
        }
        return string2;
    }

    public boolean getShouldExtendMsg() {
        return this.shouldExtendMsg;
    }

    public final void i(AFh1vSDK aFh1vSDK, String string2) {
        String string3 = "";
        Intrinsics.checkNotNullParameter((Object)aFh1vSDK, string3);
        Intrinsics.checkNotNullParameter(string2, string3);
        AFh1uSDK.i$default(this, aFh1vSDK, string2, false, 4, null);
    }

    public void i(AFh1vSDK aFh1vSDK, String string2, boolean bl2) {
        String string3 = "";
        Intrinsics.checkNotNullParameter((Object)aFh1vSDK, string3);
        Intrinsics.checkNotNullParameter(string2, string3);
    }

    public final void v(AFh1vSDK aFh1vSDK, String string2) {
        String string3 = "";
        Intrinsics.checkNotNullParameter((Object)aFh1vSDK, string3);
        Intrinsics.checkNotNullParameter(string2, string3);
        AFh1uSDK.v$default(this, aFh1vSDK, string2, false, 4, null);
    }

    public void v(AFh1vSDK aFh1vSDK, String string2, boolean bl2) {
        String string3 = "";
        Intrinsics.checkNotNullParameter((Object)aFh1vSDK, string3);
        Intrinsics.checkNotNullParameter(string2, string3);
    }

    public final void w(AFh1vSDK aFh1vSDK, String string2) {
        String string3 = "";
        Intrinsics.checkNotNullParameter((Object)aFh1vSDK, string3);
        Intrinsics.checkNotNullParameter(string2, string3);
        AFh1uSDK.w$default(this, aFh1vSDK, string2, false, 4, null);
    }

    public void w(AFh1vSDK aFh1vSDK, String string2, boolean bl2) {
        String string3 = "";
        Intrinsics.checkNotNullParameter((Object)aFh1vSDK, string3);
        Intrinsics.checkNotNullParameter(string2, string3);
    }

    public final String withTag$SDK_prodRelease(String string2, AFh1vSDK object) {
        String string3 = "";
        Intrinsics.checkNotNullParameter(string2, string3);
        Intrinsics.checkNotNullParameter(object, string3);
        object = object.AFAdRevenueData;
        return UX.c("[", (String)object, "] ", string2);
    }
}

