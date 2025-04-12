/*
 * Decompiled with CFR 0.152.
 */
import java.util.Iterator;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.ArrayIteratorKt;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from Up
 */
public final class up_2
extends Lambda
implements Function0 {
    public final /* synthetic */ Object[] c;

    public up_2(Object[] objectArray) {
        this.c = objectArray;
        super(0);
    }

    public final Iterator b() {
        return ArrayIteratorKt.iterator(this.c);
    }
}

