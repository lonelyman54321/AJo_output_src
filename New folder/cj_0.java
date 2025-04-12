/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Build$VERSION
 *  android.os.Trace
 */
import android.os.Build;
import android.os.Trace;
import androidx.work.c;
import androidx.work.impl.WorkerStoppedException;
import java.lang.reflect.Method;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from cj
 */
public final class cj_0
extends Lambda
implements Function1 {
    public final /* synthetic */ int c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ cj_0(Object object, boolean bl2, Object object2, Object object3, int n3) {
        this.c = n3;
        this.e = object;
        this.d = bl2;
        this.f = object2;
        this.g = object3;
        super(1);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object invoke(Object object) {
        int n3 = 2;
        int n4 = 1;
        xL$b xL$b = null;
        int n7 = 3;
        Object object2 = this.g;
        Object object3 = this.f;
        int n8 = this.d;
        Class[] classArray = this.e;
        int n10 = this.c;
        switch (n10) {
            default: {
                int n14;
                object = (Throwable)object;
                n10 = object instanceof WorkerStoppedException;
                if (n10 != 0) {
                    object = (WorkerStoppedException)object;
                    n14 = ((WorkerStoppedException)object).a;
                    classArray = (c)classArray;
                    classArray.stop(n14);
                }
                if (n8 == 0) return Unit.a;
                if ((object3 = (String)object3) == null) return Unit.a;
                object2 = (WI3)object2;
                object = ((WI3)object2).f.m;
                object2 = ((WI3)object2).a;
                int n15 = ((EI3)object2).hashCode();
                object.getClass();
                object = "methodName";
                Intrinsics.checkNotNullParameter(object3, (String)object);
                n14 = Build.VERSION.SDK_INT;
                n8 = 29;
                if (n14 >= n8) {
                    object = gp3_0.c((String)object3);
                    hp3_0.b(n15, (String)object);
                    return Unit.a;
                }
                object = gp3_0.c((String)object3);
                object3 = "asyncTraceEnd";
                try {
                    Object object4 = gp3_0.d;
                    if (object4 == null) {
                        Class<Object> clazz;
                        object4 = Trace.class;
                        classArray = new Class[n7];
                        classArray[0] = clazz = Long.TYPE;
                        classArray[n4] = clazz = String.class;
                        classArray[n3] = clazz = Integer.TYPE;
                        gp3_0.d = object3 = ((Class)object4).getMethod((String)object3, classArray);
                    }
                    object3 = gp3_0.d;
                    long l2 = gp3_0.a;
                    object4 = l2;
                    object2 = n15;
                    Object[] objectArray = new Object[n7];
                    objectArray[0] = object4;
                    objectArray[n4] = object;
                    objectArray[n3] = object2;
                    n14 = 0;
                    object = null;
                    ((Method)object3).invoke(null, objectArray);
                    return Unit.a;
                }
                catch (Exception exception) {}
                gp3_0.a(exception);
                return Unit.a;
            }
            case 0: 
        }
        object = (E60)object;
        object.e1();
        classArray = (Function0)classArray;
        Boolean bl2 = (Boolean)classArray.invoke();
        n3 = (int)(bl2.booleanValue() ? 1 : 0);
        if (n3 == 0) {
            return Unit.a;
        }
        object2 = (TX)object2;
        object3 = (hd1_0)object3;
        if (n8 == 0) {
            object2 = (ay_1)object2;
            Jt0.e((Kt0)object, (hd1_0)object3, (ay_1)object2);
            return Unit.a;
        }
        long l3 = object.X0();
        xL$b = object.M0();
        long l4 = xL$b.l();
        Object object5 = xL$b.a();
        object5.p();
        try {
            object5 = xL$b.a;
            n10 = -1082130432;
            float f5 = -1.0f;
            float f6 = 1.0f;
            ((yl_0)object5).e(f5, f6, l3);
            object2 = (ay_1)object2;
            Jt0.e((Kt0)object, (hd1_0)object3, (ay_1)object2);
            return Unit.a;
        }
        finally {
            jz.b(xL$b, l4);
        }
    }
}

