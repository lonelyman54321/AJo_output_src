/*
 * Decompiled with CFR 0.152.
 */
import com.google.common.util.concurrent.ClosingFuture;
import com.jpl.crasdk.CraActivity;
import java.io.Closeable;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from FW
 */
public final class fw_0
implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ fw_0(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final void run() {
        Object object = this.b;
        int n3 = this.a;
        switch (n3) {
            default: {
                n3 = CraActivity.k0;
                String string2 = "this$0";
                object = (CraActivity)object;
                Intrinsics.checkNotNullParameter(object, string2);
                object = ((CraActivity)object).Y;
                if (object != null) {
                    string2 = "handleBackKey();";
                    object.evaluateJavascript(string2, null);
                }
                return;
            }
            case 0: 
        }
        ClosingFuture.a((Closeable)object);
    }
}

