/*
 * Decompiled with CFR 0.152.
 */
package com.google.accompanist.swiperefresh;

import com.google.accompanist.swiperefresh.SwipeRefreshIndicatorKt;
import com.google.accompanist.swiperefresh.SwipeRefreshState;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
final class ComposableSingletons$SwipeRefreshKt$lambda-1$1
extends Lambda
implements hx0_2 {
    public static final ComposableSingletons$SwipeRefreshKt$lambda-1$1 INSTANCE;

    static {
        ComposableSingletons$SwipeRefreshKt$lambda-1$1 composableSingletons$SwipeRefreshKt$lambda-1$1;
        INSTANCE = composableSingletons$SwipeRefreshKt$lambda-1$1 = new ComposableSingletons$SwipeRefreshKt$lambda-1$1();
    }

    public ComposableSingletons$SwipeRefreshKt$lambda-1$1() {
        super(4);
    }

    public /* synthetic */ Object invoke(Object object, Object object2, Object object3, Object object4) {
        object = (SwipeRefreshState)object;
        float f5 = ((xs0_0)object2).a;
        object3 = (b30_0)object3;
        int n3 = ((Number)object4).intValue();
        this.invoke-ziNgDLE((SwipeRefreshState)object, f5, (b30_0)object3, n3);
        return Unit.a;
    }

    public final void invoke-ziNgDLE(SwipeRefreshState swipeRefreshState, float f5, b30_0 b30_02, int n3) {
        int n4;
        b30_0 b30_03 = b30_02;
        String string2 = "s";
        Intrinsics.checkNotNullParameter(swipeRefreshState, string2);
        int n7 = n3 & 0xE;
        if (n7 == 0) {
            n7 = (int)(b30_02.J(swipeRefreshState) ? 1 : 0);
            n7 = n7 != 0 ? 4 : 2;
            n7 = n3 | n7;
        } else {
            n7 = n3;
        }
        int n8 = n3 & 0x70;
        if (n8 == 0) {
            n8 = (int)(b30_03.b(f5) ? 1 : 0);
            n8 = n8 != 0 ? 32 : 16;
            n7 |= n8;
        }
        if ((n8 = n7 & 0x2DB) == (n4 = 146) && (n8 = (int)(b30_02.h() ? 1 : 0)) != 0) {
            b30_02.D();
        } else {
            int n10 = n7 & 0x7E;
            int n14 = 4092;
            n8 = 0;
            n4 = 0;
            long l2 = 0L;
            long l3 = 0L;
            n7 = 0;
            string2 = null;
            b30_03 = b30_02;
            SwipeRefreshIndicatorKt.SwipeRefreshIndicator-_UAkqwU(swipeRefreshState, f5, null, false, false, false, l2, l3, null, 0.0f, false, 0.0f, b30_02, n10, 0, n14);
        }
    }
}

