/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.payment.juspay.JuspayActivity;
import kotlin.jvm.internal.Intrinsics;

public final class o71
implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ o71(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final void run() {
        Object object = this.b;
        Object object2 = "this$0";
        int n3 = this.a;
        switch (n3) {
            default: {
                object = (JuspayActivity)object;
                Intrinsics.checkNotNullParameter(object, (String)object2);
                ((JuspayActivity)object).s2();
                return;
            }
            case 0: 
        }
        object = (p71_0)object;
        Intrinsics.checkNotNullParameter(object, (String)object2);
        object.getClass();
        object2 = new hn0_0(object, 1);
        ((p71_0)object).k.post((Runnable)object2);
    }
}

