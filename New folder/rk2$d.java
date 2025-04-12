/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

public final class rk2$d
extends rk2_0 {
    public final List a;
    public final Qv1 b;
    public final Qv1 c;

    public rk2$d(List list) {
        Intrinsics.checkNotNullParameter(list, "data");
        this.a = list;
        this.b = null;
        this.c = null;
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof rk2$d;
        if (!bl3) {
            return false;
        }
        object = (rk2$d)object;
        Object object2 = this.a;
        Object object3 = ((rk2$d)object).a;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object3 = this.b;
        object2 = ((rk2$d)object).b;
        bl3 = Intrinsics.areEqual(object3, object2);
        if (!bl3) {
            return false;
        }
        object3 = this.c;
        object = ((rk2$d)object).c;
        boolean bl4 = Intrinsics.areEqual(object3, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final int hashCode() {
        int n3;
        List list = this.a;
        int n4 = ((Object)list).hashCode() * 31;
        int n7 = 0;
        Qv1 qv1 = this.b;
        if (qv1 == null) {
            n3 = 0;
            qv1 = null;
        } else {
            n3 = qv1.hashCode();
        }
        n4 = (n4 + n3) * 31;
        qv1 = this.c;
        if (qv1 != null) {
            n7 = qv1.hashCode();
        }
        return n4 + n7;
    }

    public final String toString() {
        CharSequence charSequence = new StringBuilder("PageEvent.StaticList with ");
        Object object = this.a;
        int n3 = object.size();
        charSequence.append(n3);
        charSequence.append(" items (\n                    |   first item: ");
        Object object2 = CollectionsKt.firstOrNull((List)object);
        charSequence.append(object2);
        object2 = "\n                    |   last item: ";
        charSequence.append((String)object2);
        object = CollectionsKt.T((List)object);
        charSequence.append(object);
        charSequence.append("\n                    |   sourceLoadStates: ");
        object = this.b;
        charSequence.append(object);
        charSequence.append("\n                    ");
        charSequence = charSequence.toString();
        object = this.c;
        if (object != null) {
            object2 = new StringBuilder();
            ((StringBuilder)object2).append((String)charSequence);
            ((StringBuilder)object2).append("|   mediatorLoadStates: ");
            ((StringBuilder)object2).append(object);
            char c2 = '\n';
            ((StringBuilder)object2).append(c2);
            charSequence = ((StringBuilder)object2).toString();
        }
        object = new StringBuilder();
        ((StringBuilder)object).append((String)charSequence);
        ((StringBuilder)object).append("|)");
        return ee3_2.c(((StringBuilder)object).toString());
    }
}

