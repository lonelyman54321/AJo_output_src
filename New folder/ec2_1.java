/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from Ec2
 */
public final class ec2_1
extends Lambda
implements Function1 {
    public final /* synthetic */ Function1 c;
    public final /* synthetic */ List d;

    public ec2_1(List list, Function1 function1) {
        this.c = function1;
        this.d = list;
        super(1);
    }

    public final Object invoke(Object object) {
        int n3 = ((Number)object).intValue();
        object = this.d.get(n3);
        return this.c.invoke(object);
    }
}

