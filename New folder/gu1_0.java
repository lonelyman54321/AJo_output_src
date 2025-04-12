/*
 * Decompiled with CFR 0.152.
 */
import androidx.lifecycle.i$a;
import androidx.lifecycle.i$b;
import androidx.lifecycle.j;
import androidx.lifecycle.n;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.i;

/*
 * Renamed from gu1
 */
public final class gu1_0
implements n {
    public final /* synthetic */ j a;
    public final /* synthetic */ i b;

    public /* synthetic */ gu1_0(j j3, i i3) {
        this.a = j3;
        this.b = i3;
    }

    public final void k(mu1_1 object, i$a object2) {
        block5: {
            block3: {
                int n3;
                int n4;
                Object object3;
                block4: {
                    block2: {
                        object3 = this.a;
                        Intrinsics.checkNotNullParameter(object3, "this$0");
                        i i3 = this.b;
                        Intrinsics.checkNotNullParameter(i3, "$parentJob");
                        Intrinsics.checkNotNullParameter(object, "source");
                        Intrinsics.checkNotNullParameter(object2, "<anonymous parameter 1>");
                        object2 = object.getLifecycle().b();
                        i$b i$b = i$b.DESTROYED;
                        if (object2 != i$b) break block2;
                        boolean bl2 = false;
                        object = null;
                        i3.d(null);
                        ((j)object3).a();
                        break block3;
                    }
                    object = object.getLifecycle().b();
                    object2 = ((j)object3).b;
                    n4 = ((Enum)object).compareTo(object2);
                    n3 = 1;
                    object3 = ((j)object3).c;
                    if (n4 >= 0) break block4;
                    ((cr0_0)object3).a = n3;
                    break block3;
                }
                n4 = (int)(((cr0_0)object3).a ? 1 : 0);
                if (n4 == 0) break block3;
                n4 = ((cr0_0)object3).b ^ n3;
                if (n4 == 0) break block5;
                n4 = 0;
                object = null;
                ((cr0_0)object3).a = false;
                ((cr0_0)object3).a();
            }
            return;
        }
        object2 = "Cannot resume a finished dispatcher".toString();
        object = new IllegalStateException((String)object2);
        throw object;
    }
}

