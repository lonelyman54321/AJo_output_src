/*
 * Decompiled with CFR 0.152.
 */
import androidx.work.WorkerParameters$a;
import com.jio.jioads.instreamads.vastparser.n;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from jI3
 */
public final class ji3_1
implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ ji3_1(Object object, int n3, Object object2, Object object3) {
        this.a = n3;
        this.b = object;
        this.c = object2;
        this.d = object3;
    }

    public final void run() {
        int n3 = this.a;
        switch (n3) {
            default: {
                n n4 = (n)this.b;
                Intrinsics.checkNotNullParameter(n4, "this$0");
                Intrinsics.checkNotNullParameter((String)this.d, "$ccb");
                String string2 = (String)this.c;
                n4.s(string2);
                return;
            }
            case 0: 
        }
        kz2_0 kz2_02 = ((ki3_2)this.b).a;
        xb3_0 xb3_02 = (xb3_0)this.c;
        WorkerParameters$a workerParameters$a = (WorkerParameters$a)this.d;
        kz2_02.h(xb3_02, workerParameters$a);
    }
}

