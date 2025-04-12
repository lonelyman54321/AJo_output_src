/*
 * Decompiled with CFR 0.152.
 */
import com.appsflyer.AFLogger;
import com.appsflyer.internal.AFh1uSDK;
import in.juspay.hypersdk.analytics.LogSessioniserExp;

/*
 * Renamed from ix1
 */
public final class ix1_1
implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ix1_1(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final void run() {
        int n3 = this.a;
        switch (n3) {
            default: {
                AFLogger.c((AFh1uSDK[])this.b);
                return;
            }
            case 0: 
        }
        LogSessioniserExp.a((LogSessioniserExp)this.b);
    }
}

