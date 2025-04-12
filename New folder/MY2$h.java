/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class MY2$h
extends Lambda
implements Function2 {
    public static final MY2$h c;

    static {
        MY2$h mY2$h;
        c = mY2$h = new Lambda(2);
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

