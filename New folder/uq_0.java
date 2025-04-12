/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Trace
 */
import android.os.Trace;
import kotlin.jvm.functions.Function1;

/*
 * Renamed from uq
 */
public final class uq_0 {
    public static final uq$a a;

    static {
        uq$a uq$a;
        a = uq$a = new Object();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static final pq_0 a(Object object, ce1_0 object2, Function1 object3, Function1 function1, i70_0 i70_02, int n3, b30_0 b30_02, int n4) {
        Throwable throwable2;
        block8: {
            boolean bl2;
            Object object4;
            block7: {
                b30_02.u(1645646697);
                int n7 = n4 & 4;
                if (n7 != 0) {
                    object3 = pq_0.p;
                }
                if ((n7 = n4 & 8) != 0) {
                    function1 = null;
                }
                if ((n7 = n4 & 0x10) != 0) {
                    i70_02 = i70$a.b;
                }
                if ((n4 &= 0x20) != 0) {
                    n3 = 1;
                }
                n4 = 952940650;
                b30_02.u(n4);
                object4 = "rememberAsyncImagePainter";
                Trace.beginSection((String)object4);
                try {
                    object = Lz3.a(object, b30_02);
                    uq_0.c((pe1_0)object);
                    n4 = 1094691773;
                    b30_02.u(n4);
                    object4 = b30_02.v();
                    b30$a$a b30$a$a = b30$a.a;
                    if (object4 != b30$a$a) break block7;
                }
                catch (Throwable throwable2) {
                    break block8;
                }
                object4 = new pq_0((pe1_0)object, (ce1_0)object2);
                b30_02.o(object4);
            }
            object4 = (pq_0)object4;
            b30_02.I();
            ((pq_0)object4).h = object3;
            ((pq_0)object4).i = function1;
            ((pq_0)object4).j = i70_02;
            ((pq_0)object4).k = n3;
            object3 = ki1.a;
            object3 = b30_02.j((H30)object3);
            object3 = (Boolean)object3;
            ((pq_0)object4).l = bl2 = ((Boolean)object3).booleanValue();
            object3 = ((pq_0)object4).o;
            ((h83_0)object3).setValue(object2);
            object2 = ((pq_0)object4).n;
            ((h83_0)object2).setValue(object);
            ((pq_0)object4).onRemembered();
            b30_02.I();
            Trace.endSection();
            b30_02.I();
            return object4;
        }
        Trace.endSection();
        throw throwable2;
    }

    public static void b(String string2) {
        String string3 = cP.a("If you wish to display this ", string2, ", use androidx.compose.foundation.Image.");
        string2 = UX.c("Unsupported type: ", string2, ". ", string3);
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException(string2);
        throw illegalArgumentException;
    }

    public static final void c(pe1_0 object) {
        Object object2 = ((pe1_0)object).b;
        boolean bl2 = object2 instanceof pe1$a_0;
        if (!bl2) {
            bl2 = object2 instanceof hd1_0;
            if (!bl2) {
                bl2 = object2 instanceof Ke1;
                if (!bl2) {
                    boolean bl3 = object2 instanceof im2;
                    if (!bl3) {
                        object = ((pe1_0)object).c;
                        if (object == null) {
                            return;
                        }
                        object2 = "request.target must be null.".toString();
                        object = new IllegalArgumentException((String)object2);
                        throw object;
                    }
                    uq_0.b("Painter");
                    throw null;
                }
                uq_0.b("ImageVector");
                throw null;
            }
            uq_0.b("ImageBitmap");
            throw null;
        }
        object = new IllegalArgumentException("Unsupported type: ImageRequest.Builder. Did you forget to call ImageRequest.Builder.build()?");
        throw object;
    }
}

