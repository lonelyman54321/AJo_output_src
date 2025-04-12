/*
 * Decompiled with CFR 0.152.
 */
package androidx.navigation;

import androidx.navigation.e;
import androidx.navigation.i;
import androidx.navigation.i$a;
import androidx.navigation.j;
import androidx.navigation.n$a;
import androidx.navigation.o;
import java.util.NoSuchElementException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class g
extends Lambda
implements Function1 {
    public final /* synthetic */ i c;
    public final /* synthetic */ e d;

    public g(i i3, e e2) {
        this.c = i3;
        this.d = e2;
        super(1);
    }

    public final Object invoke(Object object) {
        block7: {
            int n3;
            object = (o)object;
            Intrinsics.checkNotNullParameter(object, "$this$navOptions");
            object.getClass();
            Object object2 = ct1_0.c;
            Intrinsics.checkNotNullParameter(object2, "animBuilder");
            Object object3 = new Ij();
            ((ct1_0)object2).invoke(object3);
            int n4 = ((Ij)object3).a;
            Object object4 = ((o)object).a;
            ((n$a)object4).g = n4;
            ((n$a)object4).h = n4 = ((Ij)object3).b;
            ((n$a)object4).i = n4 = ((Ij)object3).c;
            ((n$a)object4).j = n3 = ((Ij)object3).d;
            object3 = this.c;
            n4 = object3 instanceof j;
            if (n4 != 0) {
                boolean bl2;
                block6: {
                    n4 = i.j;
                    object3 = i$a.b((i)object3).iterator();
                    do {
                        n4 = (int)(object3.hasNext() ? 1 : 0);
                        object4 = this.d;
                        if (n4 == 0) break block6;
                        object2 = (i)object3.next();
                        if ((object4 = ((e)object4).h()) != null) {
                            object4 = ((i)object4).b;
                            continue;
                        }
                        bl2 = false;
                        object4 = null;
                    } while ((n4 = (int)(Intrinsics.areEqual(object2, object4) ? 1 : 0)) == 0);
                    break block7;
                }
                n3 = j.o;
                object3 = ((e)object4).i();
                object2 = "<this>";
                Intrinsics.checkNotNullParameter(object3, (String)object2);
                Intrinsics.checkNotNullParameter(object3, (String)object2);
                object4 = vt1_1.c;
                object3 = ez2_1.d((Function1)object4, object3);
                Intrinsics.checkNotNullParameter(object3, (String)object2);
                object3 = object3.iterator();
                n4 = (int)(object3.hasNext() ? 1 : 0);
                if (n4 != 0) {
                    object2 = object3.next();
                    while (bl2 = object3.hasNext()) {
                        object2 = object3.next();
                    }
                    n3 = ((i)object2).g;
                    object2 = "popUpToBuilder";
                    object4 = dt1_2.c;
                    Intrinsics.checkNotNullParameter(object4, (String)object2);
                    ((o)object).d = n3;
                    ((o)object).f = false;
                    object3 = new Dw2();
                    ((dt1_2)object4).invoke(object3);
                    n4 = (int)(((Dw2)object3).a ? 1 : 0);
                    ((o)object).f = n4;
                    n3 = (int)(((Dw2)object3).b ? 1 : 0);
                    ((o)object).g = n3;
                } else {
                    object = new NoSuchElementException("Sequence is empty.");
                    throw object;
                }
            }
        }
        return Unit.a;
    }
}

