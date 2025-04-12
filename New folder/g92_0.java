/*
 * Decompiled with CFR 0.152.
 */
import com.appsflyer.internal.AFj1uSDK;
import kotlin.Unit;

/*
 * Renamed from g92
 */
public final class g92_0
implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ g92_0(int n3, Object object, Object object2) {
        this.a = n3;
        this.b = object;
        this.c = object2;
    }

    public final void run() {
        int n3 = this.a;
        switch (n3) {
            default: {
                AFj1uSDK aFj1uSDK = (AFj1uSDK)this.b;
                Runnable runnable2 = (Runnable)this.c;
                AFj1uSDK.c(aFj1uSDK, runnable2);
                return;
            }
            case 0: 
        }
        Unit unit = Unit.a;
        gx2_2 gx2_22 = (gx2_2)this.b;
        i92_0 i92_02 = (i92_0)this.c;
        gx2_22.d(i92_02, unit);
    }
}

