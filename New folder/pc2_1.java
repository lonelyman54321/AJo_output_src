/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from Pc2
 */
public final class pc2_1
extends Lambda
implements Function1 {
    public final /* synthetic */ Function1 c;
    public final /* synthetic */ List d;

    public pc2_1(Function1 function1, ArrayList arrayList) {
        this.c = function1;
        this.d = arrayList;
        super(1);
    }

    public final Object invoke(Object object) {
        int n3 = ((Number)object).intValue();
        object = this.d.get(n3);
        return this.c.invoke(object);
    }
}

