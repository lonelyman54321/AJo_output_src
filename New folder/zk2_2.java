/*
 * Decompiled with CFR 0.152.
 */
import androidx.recyclerview.widget.k$b;
import com.ril.ajio.services.data.fleek.feedModel.Subcomponent;
import java.util.List;
import kotlin.collections.a;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Zk2
 */
public final class zk2_2
extends k$b {
    public final List a;
    public final List b;

    public zk2_2(List list, List list2) {
        Intrinsics.checkNotNullParameter(list, "oldList");
        Intrinsics.checkNotNullParameter(list2, "newList");
        this.a = list;
        this.b = list2;
    }

    public final boolean a(int n3, int n4) {
        Object object = (Subcomponent)this.a.get(n3);
        List list = null;
        if (object != null) {
            object = ((Subcomponent)object).getResources();
        } else {
            n3 = 0;
            object = null;
        }
        List list2 = this.b;
        Subcomponent subcomponent = (Subcomponent)list2.get(n4);
        if (subcomponent != null) {
            list = subcomponent.getResources();
        }
        return Intrinsics.areEqual(object, list);
    }

    public final boolean b(int n3, int n4) {
        Object object = (Subcomponent)this.a.get(n3);
        Long l2 = null;
        if (object != null) {
            long l3 = ((Subcomponent)object).getIdUnique();
            object = l3;
        } else {
            n3 = 0;
            object = null;
        }
        List list = this.b;
        Subcomponent subcomponent = (Subcomponent)list.get(n4);
        if (subcomponent != null) {
            long l4 = subcomponent.getIdUnique();
            l2 = l4;
        }
        return Intrinsics.areEqual(object, l2);
    }

    public final Object c(int n3, int n4) {
        return kotlin.collections.a.b((Object)Zk2$a.VALUE);
    }

    public final int d() {
        return this.b.size();
    }

    public final int e() {
        return this.a.size();
    }
}

