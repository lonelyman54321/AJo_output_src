/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from MY2$a
 */
public final class my2$a_0
extends Lambda
implements Function2 {
    public static final my2$a_0 c;

    static {
        my2$a_0 my2$a_0;
        c = my2$a_0 = new Lambda(2);
    }

    public final Object invoke(Object object, Object object2) {
        object = (List)object;
        object2 = (List)object2;
        if (object != null) {
            object = CollectionsKt.m0((Collection)object);
            object2 = (Collection)object2;
            ((ArrayList)object).addAll(object2);
            object2 = object;
        }
        return object2;
    }
}

