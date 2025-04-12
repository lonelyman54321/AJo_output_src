/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 */
package androidx.navigation;

import android.os.Bundle;
import androidx.navigation.d;
import androidx.navigation.i;
import androidx.navigation.i$b;
import androidx.navigation.j;
import androidx.navigation.k;
import androidx.navigation.n;
import androidx.navigation.p;
import androidx.navigation.p$a;
import androidx.navigation.q;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.collections.a;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;

public class l
extends p {
    public final q c;

    public l(q q2) {
        Intrinsics.checkNotNullParameter(q2, "navigatorProvider");
        this.c = q2;
    }

    public final void d(List object, n object2, p$a p$a) {
        int n3;
        Object object3 = "entries";
        Intrinsics.checkNotNullParameter(object, (String)object3);
        object = object.iterator();
        while ((n3 = object.hasNext()) != 0) {
            object3 = (d)object.next();
            Object object4 = ((d)object3).b;
            Intrinsics.checkNotNull(object4, "null cannot be cast to non-null type androidx.navigation.NavGraph");
            object4 = (j)object4;
            Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
            ref$ObjectRef.element = object3 = ((d)object3).a();
            n3 = ((j)object4).l;
            Object object5 = ((j)object4).n;
            if (n3 == 0 && object5 == null) {
                object2 = "no start destination defined via app:startDestination for ";
                object = new StringBuilder((String)object2);
                int n4 = ((i)object4).g;
                object2 = n4 != 0 ? String.valueOf(n4) : "the root navigation";
                ((StringBuilder)object).append((String)object2);
                object = ((StringBuilder)object).toString();
                object = object.toString();
                object2 = new IllegalStateException((String)object);
                throw object2;
            }
            if (object5 != null) {
                n3 = 0;
                object3 = ((j)object4).e((String)object5, false);
            } else {
                ca3 ca32 = ((j)object4).k;
                object3 = (i)ca32.f(n3);
            }
            if (object3 == null) {
                object = ((j)object4).m;
                if (object == null) {
                    object = ((j)object4).n;
                    if (object == null) {
                        int n7 = ((j)object4).l;
                        object = String.valueOf(n7);
                    }
                    ((j)object4).m = object;
                }
                object = ((j)object4).m;
                Intrinsics.checkNotNull(object);
                object = cP.a("navigation destination ", (String)object, " is not a direct child of this NavGraph");
                object2 = new IllegalArgumentException((String)object);
                throw object2;
            }
            if (object5 != null) {
                boolean bl2;
                object4 = ((i)object3).h;
                boolean bl3 = Intrinsics.areEqual(object5, object4);
                if (!bl3) {
                    object4 = ((i)object3).d((String)object5);
                    if (object4 != null) {
                        object4 = ((i$b)object4).b;
                    } else {
                        bl3 = false;
                        object4 = null;
                    }
                    if (object4 != null && !(bl2 = object4.isEmpty())) {
                        object5 = new Bundle();
                        object5.putAll((Bundle)object4);
                        object4 = (Bundle)ref$ObjectRef.element;
                        if (object4 != null) {
                            object5.putAll((Bundle)object4);
                        }
                        ref$ObjectRef.element = object5;
                    }
                }
                if (bl2 = (object5 = fh1_2.o((Map)(object4 = ((i)object3).f))).isEmpty() ^ true) {
                    object4 = fh1_2.o((Map)object4);
                    object5 = new k(ref$ObjectRef);
                    bl2 = ((ArrayList)(object4 = RS1.a((Map)object4, (Function1)object5))).isEmpty();
                    if (!bl2) {
                        object = new StringBuilder("Cannot navigate to startDestination ");
                        ((StringBuilder)object).append(object3);
                        ((StringBuilder)object).append(". Missing required arguments [");
                        ((StringBuilder)object).append(object4);
                        ((StringBuilder)object).append(']');
                        object = ((StringBuilder)object).toString();
                        object = object.toString();
                        object2 = new IllegalArgumentException((String)object);
                        throw object2;
                    }
                }
            }
            object4 = this.c;
            object5 = ((i)object3).a;
            object4 = ((q)object4).b((String)object5);
            object5 = this.b();
            ref$ObjectRef = (Bundle)ref$ObjectRef.element;
            ref$ObjectRef = ((i)object3).a((Bundle)ref$ObjectRef);
            object3 = kotlin.collections.a.b(((kU1)object5).a((i)object3, (Bundle)ref$ObjectRef));
            ((p)object4).d((List)object3, (n)object2, p$a);
        }
    }

    public j g() {
        j j3 = new j(this);
        return j3;
    }
}

