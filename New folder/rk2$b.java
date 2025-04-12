/*
 * Decompiled with CFR 0.152.
 */
import java.util.Collection;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.a;
import kotlin.jvm.internal.Intrinsics;

public final class rk2$b
extends rk2_0 {
    public static final rk2$b g;
    public final Rv1 a;
    public final List b;
    public final int c;
    public final int d;
    public final Qv1 e;
    public final Qv1 f;

    static {
        List list = kotlin.collections.a.b(Wq3.e);
        Ov1$c ov1$c = Ov1$c.c;
        Ov1$c ov1$c2 = Ov1$c.b;
        Qv1 qv1 = new Qv1(ov1$c, ov1$c2, ov1$c2);
        g = rk2$b$a.a(list, 0, 0, qv1, null);
    }

    public rk2$b(Rv1 object, List object2, int n3, int n4, Qv1 object3, Qv1 qv1) {
        boolean bl2;
        this.a = object;
        this.b = object2;
        this.c = n3;
        this.d = n4;
        this.e = object3;
        this.f = qv1;
        object3 = Rv1.APPEND;
        if (object != object3 && n3 < 0) {
            object = hj0_0.a(n3, "Prepend insert defining placeholdersBefore must be > 0, but was ");
            object = object.toString();
            object2 = new IllegalArgumentException((String)object);
            throw object2;
        }
        Rv1 rv1 = Rv1.PREPEND;
        if (object != rv1 && n4 < 0) {
            object = hj0_0.a(n4, "Append insert defining placeholdersAfter must be > 0, but was ");
            object = object.toString();
            object2 = new IllegalArgumentException((String)object);
            throw object2;
        }
        rv1 = Rv1.REFRESH;
        if (object == rv1 && !(bl2 = (object2 = (Collection)object2).isEmpty() ^ true)) {
            object2 = "Cannot create a REFRESH Insert event with no TransformablePages as this could permanently stall pagination. Note that this check does not prevent empty LoadResults and is instead usually an indication of an internal error in Paging itself.".toString();
            object = new IllegalArgumentException((String)object2);
            throw object;
        }
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        int n3 = object instanceof rk2$b;
        if (n3 == 0) {
            return false;
        }
        object = (rk2$b)object;
        Object object2 = this.a;
        Object object3 = ((rk2$b)object).a;
        if (object2 != object3) {
            return false;
        }
        object3 = this.b;
        object2 = ((rk2$b)object).b;
        n3 = Intrinsics.areEqual(object3, object2);
        if (n3 == 0) {
            return false;
        }
        n3 = this.c;
        int n4 = ((rk2$b)object).c;
        if (n3 != n4) {
            return false;
        }
        n3 = this.d;
        n4 = ((rk2$b)object).d;
        if (n3 != n4) {
            return false;
        }
        object3 = this.e;
        object2 = ((rk2$b)object).e;
        n3 = (int)(Intrinsics.areEqual(object3, object2) ? 1 : 0);
        if (n3 == 0) {
            return false;
        }
        object3 = this.f;
        object = ((rk2$b)object).f;
        boolean bl3 = Intrinsics.areEqual(object3, object);
        if (!bl3) {
            return false;
        }
        return bl2;
    }

    public final int hashCode() {
        int n3 = ((Object)((Object)this.a)).hashCode();
        int n4 = 31;
        n3 *= 31;
        Object object = this.b;
        n3 = ne_0.a(n3, n4, (List)object);
        int n7 = this.c;
        n3 = (n3 + n7) * 31;
        n7 = this.d;
        n3 = (n3 + n7) * 31;
        object = this.e;
        n7 = (((Qv1)object).hashCode() + n3) * 31;
        Qv1 qv1 = this.f;
        if (qv1 == null) {
            n3 = 0;
            qv1 = null;
        } else {
            n3 = qv1.hashCode();
        }
        return n7 + n3;
    }

    public final String toString() {
        Object object;
        int n3;
        Object object2;
        Object object3 = object2 = this.b;
        object3 = ((Iterable)object2).iterator();
        int n4 = 0;
        Object object4 = null;
        while ((n3 = object3.hasNext()) != 0) {
            object = ((Wq3)object3.next()).b;
            n3 = object.size();
            n4 += n3;
        }
        object3 = "none";
        int n7 = this.c;
        n3 = -1;
        Object object5 = n7 != n3 ? String.valueOf(n7) : object3;
        int n8 = this.d;
        if (n8 != n3) {
            object3 = String.valueOf(n8);
        }
        object = new StringBuilder("PageEvent.Insert for ");
        Object object6 = this.a;
        ((StringBuilder)object).append(object6);
        ((StringBuilder)object).append(", with ");
        ((StringBuilder)object).append(n4);
        ((StringBuilder)object).append(" items (\n                    |   first item: ");
        object4 = (Wq3)CollectionsKt.firstOrNull((List)object2);
        n8 = 0;
        object6 = null;
        if (object4 != null && (object4 = ((Wq3)object4).b) != null) {
            object4 = CollectionsKt.firstOrNull((List)object4);
        } else {
            n4 = 0;
            object4 = null;
        }
        ((StringBuilder)object).append(object4);
        object4 = "\n                    |   last item: ";
        ((StringBuilder)object).append((String)object4);
        object2 = (Wq3)CollectionsKt.T((List)object2);
        if (object2 != null && (object2 = ((Wq3)object2).b) != null) {
            object6 = CollectionsKt.T((List)object2);
        }
        ((StringBuilder)object).append(object6);
        ((StringBuilder)object).append("\n                    |   placeholdersBefore: ");
        ((StringBuilder)object).append((String)object5);
        ((StringBuilder)object).append("\n                    |   placeholdersAfter: ");
        ((StringBuilder)object).append((String)object3);
        ((StringBuilder)object).append("\n                    |   sourceLoadStates: ");
        object2 = this.e;
        ((StringBuilder)object).append(object2);
        ((StringBuilder)object).append("\n                    ");
        object2 = ((StringBuilder)object).toString();
        object3 = this.f;
        if (object3 != null) {
            object4 = new StringBuilder();
            ((StringBuilder)object4).append((String)object2);
            ((StringBuilder)object4).append("|   mediatorLoadStates: ");
            ((StringBuilder)object4).append(object3);
            char c2 = '\n';
            ((StringBuilder)object4).append(c2);
            object2 = ((StringBuilder)object4).toString();
        }
        object3 = new StringBuilder();
        ((StringBuilder)object3).append((String)object2);
        ((StringBuilder)object3).append("|)");
        return ee3_2.c(((StringBuilder)object3).toString());
    }
}

