/*
 * Decompiled with CFR 0.152.
 */
package com.appsflyer.internal;

import com.appsflyer.internal.AFb1rSDK;
import com.appsflyer.internal.AFd1kSDK;
import com.jio.jioads.jioreel.listeners.JioReelListener;
import com.jio.jioads.jioreel.ssai.p;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from com.appsflyer.internal.e
 */
public final class e_0
implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ e_0(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final void run() {
        int n3 = this.a;
        switch (n3) {
            default: {
                Object object = (p)this.b;
                Intrinsics.checkNotNullParameter(object, "this$0");
                JioReelListener jioReelListener = ((p)object).b;
                object = ((p)object).f;
                jioReelListener.onStreamReady((String)object);
                return;
            }
            case 0: 
        }
        AFb1rSDK.a((AFd1kSDK)this.b);
    }
}

