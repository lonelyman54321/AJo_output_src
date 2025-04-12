/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
package androidx.compose.foundation.lazy.layout;

import android.view.View;
import androidx.compose.foundation.lazy.layout.AndroidPrefetchScheduler;
import androidx.compose.foundation.lazy.layout.TraversablePrefetchStateModifierElement;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class e
extends Lambda
implements gx0_2 {
    public final /* synthetic */ xs1 c;
    public final /* synthetic */ LP1 d;
    public final /* synthetic */ Function2 e;
    public final /* synthetic */ ib3_0 f;

    public e(xs1 xs12, LP1 lP1, Function2 function2, tr1_0 tr1_02) {
        this.c = xs12;
        this.d = lP1;
        this.e = function2;
        this.f = tr1_02;
        super(3);
    }

    /*
     * Enabled aggressive block sorting
     */
    public final Object invoke(Object object, Object object2, Object object3) {
        boolean bl2;
        Object[] objectArray;
        Object object4;
        int n3;
        Object object5;
        Object object6;
        object = (bs2_1)object;
        object2 = (b30_0)object2;
        ((Number)object3).intValue();
        object3 = object2.v();
        b30$a$a b30$a$a = b30$a.a;
        if (object3 == b30$a$a) {
            object6 = (tr1_0)this.f;
            object5 = new bs1_2((tr1_0)object6);
            object3 = new Tr1((bs2_1)object, (bs1_2)object5);
            object2.o(object3);
        }
        object3 = (Tr1)object3;
        object = object2.v();
        if (object == b30$a$a) {
            object5 = new xr1_0((Tr1)object3);
            object = new wf3((yf3_1)object5);
            object2.o(object);
        }
        object = (wf3)object;
        object5 = this.c;
        if (object5 != null) {
            int n4;
            n3 = 205264983;
            object2.K(n3);
            object6 = ((xs1)object5).a;
            if (object6 == null) {
                n3 = 6622915;
                object2.K(n3);
                object6 = zy2.a;
                if (object6 != null) {
                    n4 = 1213893039;
                    object2.K(n4);
                    object2.E();
                } else {
                    n3 = 1213931944;
                    object2.K(n3);
                    object6 = AndroidCompositionLocals_androidKt.f;
                    object6 = (View)object2.j((H30)object6);
                    n4 = (int)(object2.J(object6) ? 1 : 0);
                    object4 = object2.v();
                    if (n4 != 0 || object4 == b30$a$a) {
                        object4 = new AndroidPrefetchScheduler((View)object6);
                        object2.o(object4);
                    }
                    object4 = (AndroidPrefetchScheduler)object4;
                    object2.E();
                    object6 = object4;
                }
            } else {
                n4 = 6621830;
                object2.K(n4);
            }
            object2.E();
            n4 = 4;
            objectArray = new Object[n4];
            objectArray[0] = object5;
            objectArray[1] = object3;
            objectArray[2] = object;
            objectArray[3] = object6;
            bl2 = object2.J(object5);
            boolean bl3 = object2.x(object3);
            bl2 |= bl3;
            bl3 = object2.x(object);
            bl2 |= bl3;
            bl3 = object2.x(object6);
            Object object7 = object2.v();
            if ((bl2 |= bl3) || object7 == b30$a$a) {
                object7 = new zr1_2((xs1)object5, (Tr1)object3, (wf3)object, (yy2_0)object6);
                object2.o(object7);
            }
            object7 = (Function1)object7;
            ly0_0.c(objectArray, (Function1)object7, (b30_0)object2);
            object2.E();
        } else {
            n3 = 205858881;
            object2.K(n3);
            object2.E();
        }
        n3 = ys1.b;
        object6 = this.d;
        if (object5 != null && (object5 = object6.then((LP1)(objectArray = new TraversablePrefetchStateModifierElement((xs1)object5)))) != null) {
            object6 = object5;
        }
        boolean bl4 = object2.J(object3);
        objectArray = this.e;
        bl2 = object2.J(objectArray);
        object4 = object2.v();
        if ((bl4 |= bl2) || object4 == b30$a$a) {
            object4 = new as1_1(object3, (Function2)objectArray, 0);
            object2.o(object4);
        }
        object4 = (Function2)object4;
        tf3.b((wf3)object, (LP1)object6, (Function2)object4, (b30_0)object2, 8);
        return Unit.a;
    }
}

