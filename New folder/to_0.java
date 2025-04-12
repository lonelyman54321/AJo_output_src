/*
 * Decompiled with CFR 0.152.
 */
import com.google.firebase.perf.metrics.AppStartTrace;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from To
 */
public final class to_0
implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ to_0(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final void run() {
        int n3 = this.a;
        switch (n3) {
            default: {
                tr1_0 tr1_02 = (tr1_0)this.b;
                Intrinsics.checkNotNullParameter(tr1_02, "$openDialog");
                Boolean bl2 = (Boolean)tr1_02.getValue();
                n3 = (int)(bl2.booleanValue() ? 1 : 0);
                if (n3 != 0) {
                    bl2 = Boolean.FALSE;
                    tr1_02.setValue(bl2);
                }
                return;
            }
            case 0: 
        }
        AppStartTrace.e((AppStartTrace)this.b);
    }
}

