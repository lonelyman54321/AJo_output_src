/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import kotlin.jvm.functions.Function2;

/*
 * Renamed from lq1
 */
public final class lq1_2
extends Xp1$e {
    public final /* synthetic */ jq1_2 b;
    public final /* synthetic */ Function2 c;

    public lq1_2(jq1_2 jq1_22, Function2 function2, String string2) {
        this.b = jq1_22;
        this.c = function2;
        super(string2);
    }

    public final bl1_0 c(dl1_1 object, List object2, long l2) {
        Object object3;
        object2 = this.b;
        Object object4 = ((jq1_2)object2).h;
        ((jq1$c)object4).a = object3 = object.getLayoutDirection();
        float f5 = object.getDensity();
        object3 = ((jq1_2)object2).h;
        ((jq1$c)object3).b = f5;
        ((jq1$c)object3).c = f5 = object.H0();
        boolean bl2 = object.W();
        object4 = this.c;
        if (!bl2 && (object = ((jq1_2)object2).a.c) != null) {
            ((jq1_2)object2).e = 0;
            object = new c60(l2);
            jq1$b jq1$b = ((jq1_2)object2).i;
            object = (bl1_0)object4.invoke(jq1$b, object);
            int n3 = ((jq1_2)object2).e;
            lq1$a_0 lq1$a_0 = new lq1$a_0((bl1_0)object, (jq1_2)object2, n3, (bl1_0)object);
            return lq1$a_0;
        }
        ((jq1_2)object2).d = 0;
        object = new c60(l2);
        object = (bl1_0)object4.invoke(object3, object);
        int n4 = ((jq1_2)object2).d;
        lq1$b lq1$b = new lq1$b((bl1_0)object, (jq1_2)object2, n4, (bl1_0)object);
        return lq1$b;
    }
}

