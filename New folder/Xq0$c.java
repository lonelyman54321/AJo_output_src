/*
 * Decompiled with CFR 0.152.
 */
import java.io.File;

public final class Xq0$c {
    public final Xq0$d a;
    public final boolean[] b;
    public boolean c;
    public final /* synthetic */ Xq0 d;

    public Xq0$c(Xq0 object, Xq0$d xq0$d) {
        this.d = object;
        this.a = xq0$d;
        boolean bl2 = xq0$d.e;
        if (bl2) {
            boolean bl3 = false;
            object = null;
        } else {
            int n3 = ((Xq0)object).g;
            object = new boolean[n3];
        }
        this.b = (boolean[])object;
    }

    public final void a() {
        Xq0.a(this.d, this, false);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final File b() {
        Xq0 xq0 = this.d;
        synchronized (xq0) {
            Throwable throwable2;
            block6: {
                Object object;
                block5: {
                    Object object2;
                    try {
                        object = this.a;
                        object2 = object.f;
                        if (object2 != this) break block5;
                    }
                    catch (Throwable throwable2) {
                        break block6;
                    }
                    boolean bl2 = object.e;
                    if (!bl2) {
                        object2 = this.b;
                        boolean bl3 = true;
                        object2[0] = bl3;
                    }
                    object = object.d;
                    object = object[0];
                    object2 = this.d;
                    object2 = ((Xq0)object2).a;
                    ((File)object2).mkdirs();
                    return object;
                }
                object = new IllegalStateException();
                throw object;
            }
            throw throwable2;
        }
    }
}

