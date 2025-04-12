/*
 * Decompiled with CFR 0.152.
 */
import com.google.common.base.Supplier;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/*
 * Renamed from Ut2
 */
public final class ut2_0
implements Supplier {
    public final Object get() {
        IllegalStateException illegalStateException;
        Object object = "androidx.media3.effect.DefaultVideoFrameProcessor$Factory$Builder";
        try {
            object = Class.forName((String)object);
            illegalStateException = null;
        }
        catch (Exception exception) {
            illegalStateException = new IllegalStateException(exception);
            throw illegalStateException;
        }
        Constructor constructor = ((Class)object).getConstructor(null);
        constructor = constructor.newInstance(null);
        String string2 = "build";
        object = ((Class)object).getMethod(string2, null);
        object = ((Method)object).invoke(constructor, null);
        object.getClass();
        return (MB3$a)object;
    }
}

