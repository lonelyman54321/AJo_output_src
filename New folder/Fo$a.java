/*
 * Decompiled with CFR 0.152.
 */
import com.facebook.FacebookSdk;

public final class Fo$a {
    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Fo a() {
        boolean bl2;
        Fo fo;
        boolean bl3;
        boolean bl4;
        Object object;
        block13: {
            object = Fo.class;
            bl4 = td0.b(object);
            bl3 = false;
            fo = null;
            if (!bl4) {
                try {
                    object = Fo.c;
                    break block13;
                }
                catch (Throwable throwable) {
                    td0.a(object, throwable);
                }
            }
            bl2 = false;
            object = null;
        }
        if (object != null) return object;
        synchronized (this) {
            Throwable throwable2222;
            block16: {
                block15: {
                    block14: {
                        bl2 = FacebookSdk.isInitialized();
                        if (bl2) break block14;
                        {
                            catch (Throwable throwable2222) {}
                        }
                        return null;
                    }
                    object = Fo.class;
                    bl4 = td0.b(object);
                    if (!bl4) {
                        try {
                            fo = Fo.c;
                        }
                        catch (Throwable throwable3) {
                            td0.a(object, throwable3);
                        }
                    }
                    if (fo != null) return fo;
                    object = new Fo();
                    Class<Fo> clazz = Fo.class;
                    bl3 = td0.b(clazz);
                    if (bl3) break block15;
                    try {
                        Fo.c = object;
                        break block15;
                    }
                    catch (Throwable throwable4) {
                        td0.a(clazz, throwable4);
                    }
                    break block16;
                }
                return object;
            }
            throw throwable2222;
        }
    }
}

