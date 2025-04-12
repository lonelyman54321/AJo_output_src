/*
 * Decompiled with CFR 0.152.
 */
import androidx.datastore.preferences.protobuf.p;
import java.lang.reflect.Method;

public final class JG1 {
    public static final JG1$a b;
    public final uO1 a;

    static {
        JG1$a jG1$a;
        b = jG1$a = new Object();
    }

    public JG1() {
        JG1$b jG1$b;
        Object object = "androidx.datastore.preferences.protobuf.DescriptorMessageInfoFactory";
        object = Class.forName((String)object);
        uO1[] uO1Array = "getInstance";
        bz0_0 bz0_02 = null;
        object = ((Class)object).getDeclaredMethod((String)uO1Array, null);
        object = ((Method)object).invoke(null, null);
        try {
            object = (uO1)object;
        }
        catch (Exception exception) {
            object = b;
        }
        uO1Array = new uO1[2];
        bz0_02 = bz0_0.a;
        uO1Array[0] = bz0_02;
        uO1Array[1] = object;
        jG1$b.a = uO1Array;
        object = p.a;
        this.a = jG1$b;
    }
}

