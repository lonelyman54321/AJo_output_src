/*
 * Decompiled with CFR 0.152.
 */
import androidx.lifecycle.i$a;
import androidx.lifecycle.i$b;
import androidx.lifecycle.n;
import androidx.navigation.d;
import androidx.navigation.e;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from VS1
 */
public final class vs1_0
implements n {
    public final /* synthetic */ e a;

    public /* synthetic */ vs1_0(e e2) {
        this.a = e2;
    }

    public final void k(mu1_1 object, i$a i$a) {
        Object object2 = this.a;
        Intrinsics.checkNotNullParameter(object2, "this$0");
        Intrinsics.checkNotNullParameter(object, "<anonymous parameter 0>");
        object = "event";
        Intrinsics.checkNotNullParameter((Object)i$a, (String)object);
        Object object3 = i$a.getTargetState();
        ((e)object2).r = object3;
        object3 = ((e)object2).c;
        if (object3 != null) {
            boolean bl2;
            object2 = CollectionsKt.m0(((e)object2).g).iterator();
            while (bl2 = object2.hasNext()) {
                i$b i$b;
                object3 = (d)object2.next();
                object3.getClass();
                Intrinsics.checkNotNullParameter((Object)i$a, (String)object);
                ((d)object3).d = i$b = i$a.getTargetState();
                ((d)object3).d();
            }
        }
    }
}

