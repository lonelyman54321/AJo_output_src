/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/*
 * Renamed from hH0
 */
public final class hh0_1
implements Function2 {
    public final /* synthetic */ int a;

    public /* synthetic */ hh0_1(int n3) {
        this.a = n3;
    }

    public final Object invoke(Object object, Object object2) {
        object = (String)object;
        object2 = (Integer)object2;
        int n3 = (Integer)object2;
        Object object3 = sq0_1.a;
        object3 = "";
        Object object4 = object == null ? object3 : object;
        String string2 = kp1_0.c("fleek_insert_banner_themebased_", (String)object);
        if (object == null) {
            object = object3;
        }
        object3 = new StringBuilder();
        int n4 = this.a;
        object2 = Xd0.a("|", n4, n3, (StringBuilder)object3);
        sq0_1.h((String)object4, string2, (String)object, (String)object2);
        return Unit.a;
    }
}

