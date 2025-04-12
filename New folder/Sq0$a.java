/*
 * Decompiled with CFR 0.152.
 */
import java.io.Closeable;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

public final class Sq0$a {
    public final Sq0$b a;
    public boolean b;
    public final boolean[] c;
    public final /* synthetic */ Sq0 d;

    public Sq0$a(Sq0 object, Sq0$b sq0$b) {
        this.d = object;
        this.a = sq0$b;
        object.getClass();
        object = new boolean[2];
        this.c = (boolean[])object;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void a(boolean bl2) {
        Sq0 sq0 = this.d;
        synchronized (sq0) {
            Throwable throwable2;
            block7: {
                block6: {
                    boolean bl3;
                    boolean bl4;
                    try {
                        bl4 = this.b;
                        bl3 = true;
                        if (!(bl4 ^= bl3)) break block6;
                    }
                    catch (Throwable throwable2) {
                        break block7;
                    }
                    Object object = this.a;
                    object = ((Sq0$b)object).g;
                    bl4 = Intrinsics.areEqual(object, this);
                    if (bl4) {
                        Sq0.a(sq0, this, bl2);
                    }
                    this.b = bl3;
                    Unit unit = Unit.a;
                    return;
                }
                String string2 = "editor is closed";
                {
                    string2 = string2.toString();
                    IllegalStateException illegalStateException = new IllegalStateException(string2);
                    throw illegalStateException;
                }
            }
            throw throwable2;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final hn2_2 b(int n3) {
        Sq0 sq0 = this.d;
        synchronized (sq0) {
            Throwable throwable2;
            block6: {
                block5: {
                    boolean bl2;
                    try {
                        boolean bl3 = this.b;
                        bl2 = true;
                        if (!(bl3 ^= bl2)) break block5;
                    }
                    catch (Throwable throwable2) {
                        break block6;
                    }
                    {
                        Object object = this.c;
                        object[n3] = bl2;
                        object = this.a;
                        object = ((Sq0$b)object).d;
                        Object object2 = ((ArrayList)object).get(n3);
                        object = sq0.p;
                        Object object3 = object2;
                        object3 = (hn2_2)object2;
                        boolean bl4 = ((hm0_2)object).f((hn2_2)object3);
                        if (bl4) return (hn2_2)object2;
                        String string2 = "file";
                        Intrinsics.checkNotNullParameter(object3, string2);
                        object = ((vq0_0)object).k((hn2_2)object3);
                        m.a((Closeable)object);
                        return (hn2_2)object2;
                    }
                }
                String string3 = "editor is closed";
                {
                    string3 = string3.toString();
                    IllegalStateException illegalStateException = new IllegalStateException(string3);
                    throw illegalStateException;
                }
            }
            throw throwable2;
        }
    }
}

