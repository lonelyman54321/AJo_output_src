/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Looper
 *  android.view.View
 *  android.view.View$OnAttachStateChangeListener
 */
import android.os.Looper;
import android.view.View;
import androidx.compose.ui.platform.AndroidUiDispatcher;
import androidx.lifecycle.i;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.CoroutineContext$a;
import kotlin.coroutines.d;
import kotlin.coroutines.f;
import kotlin.jvm.internal.Ref$ObjectRef;

/*
 * Renamed from lH3
 */
public final class lh3_1
implements mh3_0 {
    public final FF2 a(View object) {
        Object object2;
        block14: {
            wn2 wn22;
            Object object3;
            Object object4;
            block13: {
                block12: {
                    object2 = uh3_0.a;
                    object2 = f.a;
                    object4 = d.n0;
                    ((f)object2).get((CoroutineContext$a)object4);
                    object4 = AndroidUiDispatcher.l;
                    object4 = Looper.myLooper();
                    object3 = Looper.getMainLooper();
                    if (object4 != object3) break block12;
                    object4 = (CoroutineContext)AndroidUiDispatcher.l.getValue();
                    break block13;
                }
                object4 = (CoroutineContext)AndroidUiDispatcher.m.get();
                if (object4 == null) break block14;
            }
            object4 = object4.plus((CoroutineContext)object2);
            object3 = YP1$a.a;
            object3 = (yp1_2)object4.get((CoroutineContext$a)object3);
            if (object3 != null) {
                wn2 wn23 = new wn2((yp1_2)object3);
                object3 = wn23.b;
                Object object5 = object3.a;
                synchronized (object5) {
                    object3.d = false;
                    object3 = Unit.a;
                    wn22 = wn23;
                }
            } else {
                wn22 = null;
            }
            {
                Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                object3 = gq1$a_0.a;
                object3 = (gq1_0)object4.get((CoroutineContext$a)object3);
                if (object3 == null) {
                    object3 = new hq1_0();
                    ref$ObjectRef.element = object3;
                }
                if (wn22 != null) {
                    object2 = wn22;
                }
                object2 = object4.plus((CoroutineContext)object2).plus((CoroutineContext)object3);
                object4 = new FF2((CoroutineContext)object2);
                ((FF2)object4).E();
                c80 c802 = kotlinx.coroutines.d.a((CoroutineContext)object2);
                object2 = VD3.a(object);
                object2 = object2 != null ? object2.getLifecycle() : null;
                if (object2 != null) {
                    object3 = new qH3((View)object, (FF2)object4);
                    object.addOnAttachStateChangeListener((View.OnAttachStateChangeListener)object3);
                    object3 = new rh3_1(c802, wn22, (FF2)object4, ref$ObjectRef, (View)object);
                    ((i)object2).a((lu1)object3);
                    return object4;
                }
                object2 = new StringBuilder("ViewTreeLifecycleOwner not found from ");
                ((StringBuilder)object2).append(object);
                bh1_1.d(((StringBuilder)object2).toString());
                throw null;
            }
        }
        object2 = "no AndroidUiDispatcher for this thread".toString();
        object = new IllegalStateException((String)object2);
        throw object;
    }
}

