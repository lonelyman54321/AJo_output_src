/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.b;

public final class ZT
implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ZT(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final void run() {
        int n3 = this.a;
        switch (n3) {
            default: {
                pg2_2 pg2_22 = (pg2_2)this.b;
                Intrinsics.checkNotNullParameter(pg2_22, "this$0");
                pg2_22.a.setVisibility(8);
                return;
            }
            case 0: 
        }
        Object object = (du_1)this.b;
        Intrinsics.checkNotNullParameter(object, "this$0");
        Object object2 = ((du_1)object).g;
        if (object2 != null && (n3 = (int)(kotlin.text.b.k((CharSequence)object2) ? 1 : 0)) == 0) {
            hv3_0.S(((du_1)object).b);
            object2 = ((du_1)object).a;
            if (object2 != null) {
                object = ((du_1)object).g;
                Intrinsics.checkNotNull(object);
                ((yt_0)object2).g((String)object);
            }
        }
    }
}

