/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import kotlin.jvm.internal.Reflection;

/*
 * Renamed from pb1
 */
public final class pb1_2 {
    public static final pb1$d c;
    public static final xq_2 d;
    public final int a;
    public final ArrayList b;

    static {
        Object object = new Object();
        c = object;
        object = pb1_2.class;
        yn1_2 yn1_22 = Reflection.getOrCreateKotlinClass((Class)object);
        try {
            object = Reflection.typeOf((Class)object);
        }
        catch (Throwable throwable) {
            object = null;
        }
        at3_0 at3_02 = new at3_0(yn1_22, (kn1_1)object);
        d = object = new xq_2("HttpSend", at3_02);
    }

    public pb1_2() {
        ArrayList arrayList;
        this.a = 20;
        this.b = arrayList = new ArrayList();
    }
}

