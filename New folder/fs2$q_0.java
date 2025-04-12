/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from FS2$q
 */
public final class fs2$q_0
extends Lambda
implements Function2 {
    public static final fs2$q_0 c;

    static {
        fs2$q_0 fs2$q_0;
        c = fs2$q_0 = new Lambda(2);
    }

    public final Object invoke(Object object, Object object2) {
        object = (ES2)object;
        object2 = ((iw1)object2).a;
        int n3 = object2.size();
        ArrayList<Object> arrayList = new ArrayList<Object>(n3);
        n3 = object2.size();
        for (int i3 = 0; i3 < n3; ++i3) {
            Object object3 = (hw1)object2.get(i3);
            ds2_0 ds2_02 = FS2.u;
            object3 = FS2.a(object3, ds2_02, (ES2)object);
            arrayList.add(object3);
        }
        return arrayList;
    }
}

