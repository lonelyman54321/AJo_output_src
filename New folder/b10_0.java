/*
 * Decompiled with CFR 0.152.
 */
import androidx.activity.ComponentActivity$f;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from b10
 */
public final class b10_0
implements Runnable {
    public final /* synthetic */ ComponentActivity$f a;
    public final /* synthetic */ int b;
    public final /* synthetic */ x3$a c;

    public /* synthetic */ b10_0(ComponentActivity$f f5, int n3, x3$a a2) {
        this.a = f5;
        this.b = n3;
        this.c = a2;
    }

    public final void run() {
        Object object = this.c.a;
        Object object2 = this.a;
        Object object3 = ((K3)object2).a;
        int n3 = this.b;
        Object object4 = n3;
        if ((object3 = (String)((LinkedHashMap)object3).get(object4)) != null) {
            object4 = (K3$a)((K3)object2).e.get(object3);
            Object object5 = object4 != null ? ((K3$a)object4).a : null;
            if (object5 == null) {
                object4 = ((K3)object2).g;
                object4.remove((String)object3);
                object2 = ((K3)object2).f;
                object2.put(object3, object);
            } else {
                object4 = ((K3$a)object4).a;
                object5 = "null cannot be cast to non-null type androidx.activity.result.ActivityResultCallback<O of androidx.activity.result.ActivityResultRegistry.dispatchResult>";
                Intrinsics.checkNotNull(object4, (String)object5);
                object2 = ((K3)object2).d;
                boolean bl2 = ((ArrayList)object2).remove(object3);
                if (bl2) {
                    object4.a(object);
                }
            }
        }
    }
}

