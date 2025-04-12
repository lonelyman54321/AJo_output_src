/*
 * Decompiled with CFR 0.152.
 */
import androidx.navigation.i;
import androidx.navigation.j;
import androidx.navigation.l;
import androidx.navigation.p;
import androidx.navigation.q;
import androidx.navigation.q$a;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

public final class wT1
extends ut1_0 {
    public final q g;
    public final String h;
    public final ArrayList i;

    public wT1(q q2, String string2, String arrayList) {
        Intrinsics.checkNotNullParameter(q2, "provider");
        Intrinsics.checkNotNullParameter(string2, "startDestination");
        q2.getClass();
        Class<l> clazz = l.class;
        Intrinsics.checkNotNullParameter(clazz, "navigatorClass");
        Object object = q$a.a(clazz);
        object = q2.b((String)object);
        super((p)object, (String)((Object)arrayList));
        this.i = arrayList = new ArrayList();
        this.g = q2;
        this.h = string2;
    }

    public final j c() {
        boolean bl2;
        Object object = (j)super.a();
        Object object2 = this.i;
        Object object3 = "nodes";
        Intrinsics.checkNotNullParameter(object2, (String)object3);
        object2 = ((ArrayList)object2).iterator();
        while (bl2 = object2.hasNext()) {
            int n3;
            object3 = (i)object2.next();
            if (object3 == null) continue;
            Object object4 = "node";
            Intrinsics.checkNotNullParameter(object3, (String)object4);
            int n4 = ((i)object3).g;
            Object object5 = ((i)object3).h;
            if (n4 == 0 && object5 == null) {
                object2 = "Destinations must have an id or route. Call setId(), setRoute(), or include an android:id or app:route in your navigation XML.".toString();
                object = new IllegalArgumentException((String)object2);
                throw object;
            }
            Object object6 = ((i)object).h;
            String string2 = "Destination ";
            if (object6 != null && (n3 = Intrinsics.areEqual(object5, object6) ^ 1) == 0) {
                object2 = new StringBuilder(string2);
                ((StringBuilder)object2).append(object3);
                ((StringBuilder)object2).append(" cannot have the same route as graph ");
                ((StringBuilder)object2).append(object);
                object = ((StringBuilder)object2).toString();
                object = object.toString();
                object2 = new IllegalArgumentException((String)object);
                throw object2;
            }
            n3 = ((i)object).g;
            if (n4 != n3) {
                object5 = ((j)object).k;
                object4 = (i)((ca3)object5).f(n4);
                if (object4 == object3) continue;
                object6 = ((i)object3).b;
                if (object6 == null) {
                    if (object4 != null) {
                        object6 = null;
                        ((i)object4).b = null;
                    }
                    ((i)object3).b = object;
                    n4 = ((i)object3).g;
                    ((ca3)object5).i(n4, object3);
                    continue;
                }
                object2 = "Destination already has a parent set. Call NavGraph.remove() to remove the previous parent.".toString();
                object = new IllegalStateException((String)object2);
                throw object;
            }
            object2 = new StringBuilder(string2);
            ((StringBuilder)object2).append(object3);
            ((StringBuilder)object2).append(" cannot have the same id as graph ");
            ((StringBuilder)object2).append(object);
            object = ((StringBuilder)object2).toString();
            object = object.toString();
            object2 = new IllegalArgumentException((String)object);
            throw object2;
        }
        object2 = this.h;
        if (object2 == null) {
            object = this.c;
            if (object != null) {
                object = new IllegalStateException("You must set a start destination route");
                throw object;
            }
            object = new IllegalStateException("You must set a start destination id");
            throw object;
        }
        Intrinsics.checkNotNull(object2);
        Intrinsics.checkNotNullParameter(object2, "startDestRoute");
        ((j)object).i((String)object2);
        return object;
    }
}

