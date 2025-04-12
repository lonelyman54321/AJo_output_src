/*
 * Decompiled with CFR 0.152.
 */
import androidx.concurrent.futures.AbstractResolvableFuture;

public final class eK {
    public static eK$d a(eK$c object) {
        eK$d eK$d;
        block3: {
            Class<?> clazz;
            Object object2 = new eK$a();
            ((eK$a)object2).b = eK$d = new eK$d((eK$a)object2);
            ((eK$a)object2).a = clazz = object.getClass();
            object = object.a((eK$a)object2);
            if (object == null) break block3;
            try {
                ((eK$a)object2).a = object;
            }
            catch (Exception exception) {
                object2 = eK$d.b;
                ((AbstractResolvableFuture)object2).setException(exception);
            }
        }
        return eK$d;
    }
}

