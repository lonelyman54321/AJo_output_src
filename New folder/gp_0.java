/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from gP
 */
public final class gp_0
implements Runnable {
    public final /* synthetic */ iP a;

    public /* synthetic */ gp_0(iP iP2) {
        this.a = iP2;
    }

    public final void run() {
        Object object = this.a;
        Object object2 = "this$0";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        object = object.b;
        if (object != null) {
            Intrinsics.checkNotNullParameter(object, "<this>");
            object2 = cp_1.Companion;
            int n3 = km_1.b((cp$a)object2);
            if (n3 != 0) {
                n3 = 64;
                object.performAccessibilityAction(n3, null);
            }
        }
    }
}

