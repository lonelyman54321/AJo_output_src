/*
 * Decompiled with CFR 0.152.
 */
import java.io.Serializable;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.FloatCompanionObject;
import kotlin.jvm.internal.IntCompanionObject;

public final class vE3 {
    public static final Map a;

    static {
        Pair[] pairArray = Float.valueOf(0.5f);
        Object object = IntCompanionObject.INSTANCE;
        object = ya3_0.b;
        Serializable serializable = Float.valueOf(1.0f);
        Pair pair = new Pair(object, serializable);
        object = ya3_0.h;
        Pair pair2 = new Pair(object, serializable);
        object = ya3_0.g;
        Pair pair3 = new Pair(object, serializable);
        object = FloatCompanionObject.INSTANCE;
        object = ya3_0.a;
        serializable = Float.valueOf(0.01f);
        Pair pair4 = new Pair(object, serializable);
        object = ya3_0.i;
        serializable = new Pair(object, pairArray);
        object = ya3_0.e;
        Pair pair5 = new Pair(object, pairArray);
        object = ya3_0.f;
        Pair pair6 = new Pair(object, pairArray);
        pairArray = ya3_0.c;
        float f5 = 0.1f;
        Serializable serializable2 = Float.valueOf(f5);
        Pair pair7 = new Pair(pairArray, serializable2);
        pairArray = ya3_0.d;
        object = Float.valueOf(f5);
        serializable2 = new Pair(pairArray, object);
        pairArray = new Pair[]{pair, pair2, pair3, pair4, serializable, pair5, pair6, pair7, serializable2};
        a = fh1_2.i(pairArray);
    }
}

