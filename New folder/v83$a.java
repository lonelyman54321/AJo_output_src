/*
 * Decompiled with CFR 0.152.
 */
import java.util.Collection;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

public final class v83$a {
    public static v83_0 a() {
        return (v83_0)A83.b.a();
    }

    /*
     * Enabled aggressive block sorting
     */
    public static v83_0 b(v83_0 v83_02) {
        long l2;
        long l3;
        v83_0 v83_03;
        boolean bl2 = v83_02 instanceof qr3_0;
        if (bl2) {
            v83_03 = v83_02;
            v83_03 = (qr3_0)v83_02;
            l3 = ((qr3_0)v83_03).t;
            l2 = zn0_2.a();
            long l4 = l3 - l2;
            Object object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
            if (object == false) {
                ((qr3_0)v83_03).r = null;
                return v83_02;
            }
        }
        if (bl2 = v83_02 instanceof rr3_0) {
            v83_03 = v83_02;
            v83_03 = (rr3_0)v83_02;
            l3 = ((rr3_0)v83_03).i;
            l2 = zn0_2.a();
            long l7 = l3 - l2;
            Object object = l7 == 0L ? 0 : (l7 < 0L ? -1 : 1);
            if (object == false) {
                ((rr3_0)v83_03).h = null;
                return v83_02;
            }
        }
        bl2 = false;
        v83_03 = null;
        v83_02 = A83.h(v83_02, null, false);
        v83_02.j();
        return v83_02;
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static Object c(Function0 object, Function1 object2) {
        v83_0 v83_02;
        if (object2 == null) {
            return object.invoke();
        }
        v83_0 v83_03 = (v83_0)A83.b.a();
        boolean bl2 = v83_03 instanceof qr3_0;
        if (bl2) {
            v83_02 = v83_03;
            v83_02 = (qr3_0)v83_03;
            long l2 = ((qr3_0)v83_02).t;
            long l3 = zn0_2.a();
            long l4 = l2 - l3;
            Object object3 = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
            if (object3 == false) {
                Function1 function1 = ((qr3_0)v83_02).r;
                Function1 function12 = ((qr3_0)v83_02).s;
                v83_0 v83_04 = v83_03;
                try {
                    v83_04 = (qr3_0)v83_03;
                    boolean bl3 = true;
                    ((qr3_0)v83_04).r = object2 = A83.l((Function1)object2, function1, bl3);
                    v83_03 = (qr3_0)v83_03;
                    ((qr3_0)v83_03).s = object2 = A83.b(null, function12);
                    object = object.invoke();
                    return object;
                }
                finally {
                    ((qr3_0)v83_02).r = function1;
                    ((qr3_0)v83_02).s = function12;
                }
            }
        }
        if (v83_03 != null && !(bl2 = v83_03 instanceof RR1)) {
            if (object2 == null) {
                return object.invoke();
            }
            object2 = v83_03.t((Function1)object2);
        } else {
            boolean bl4 = v83_03 instanceof RR1;
            v83_03 = bl4 ? (RR1)v83_03 : null;
            v83_0 v83_05 = v83_03;
            boolean bl5 = true;
            v83_0 v83_06 = v83_02;
            Object object4 = object2;
            v83_02 = new qr3_0((RR1)v83_03, (Function1)object2, null, bl5, false);
            object2 = v83_02;
        }
        v83_03 = ((v83_0)object2).j();
        {
            catch (Throwable throwable) {
                throw throwable;
            }
        }
        try {
            object = object.invoke();
        }
        catch (Throwable throwable) {
            v83_0.p(v83_03);
            throw throwable;
        }
        try {
            v83_0.p(v83_03);
            return object;
        }
        finally {
            ((v83_0)object2).c();
        }
    }

    public static oq_2 d(KF2$b kF2$b) {
        A83.f(A83.a);
        Object object = A83.c;
        synchronized (object) {
            Object object2 = A83.h;
            object2 = (Collection)object2;
            object2 = CollectionsKt.X((Collection)object2, kF2$b);
            A83.h = object2;
            object2 = Unit.a;
            object = new oq_2(kF2$b);
            return object;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public static void e(v83_0 object, v83_0 object2, Function1 object3) {
        if (object != object2) {
            object2.getClass();
            v83_0.p((v83_0)object);
            ((v83_0)object2).c();
            return;
        }
        boolean bl2 = object instanceof qr3_0;
        if (bl2) {
            object = (qr3_0)object;
            ((qr3_0)object).r = object3;
            return;
        }
        bl2 = object instanceof rr3_0;
        if (bl2) {
            object = (rr3_0)object;
            ((rr3_0)object).h = object3;
            return;
        }
        object3 = new StringBuilder("Non-transparent snapshot was reused: ");
        ((StringBuilder)object3).append(object);
        object = ((StringBuilder)object3).toString().toString();
        object2 = new IllegalStateException((String)object);
        throw object2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public static void f() {
        boolean bl2;
        boolean bl3;
        Object object = A83.c;
        // MONITORENTER : object
        Object object2 = A83.j;
        object2 = ((AtomicReference)object2).get();
        object2 = (f01_0)object2;
        object2 = ((RR1)object2).h;
        boolean bl4 = false;
        if (object2 != null && (bl3 = ((ft2_0)object2).c()) == (bl2 = true)) {
            bl4 = true;
        }
        if (!bl4) return;
        A83.a();
    }
}

