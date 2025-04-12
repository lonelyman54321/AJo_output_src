/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from fv1
 */
public final class fv1_0
extends Lambda
implements Function2 {
    public final /* synthetic */ Function2 c;

    public fv1_0(Function2 function2) {
        this.c = function2;
        super(2);
    }

    public final Object invoke(Object arrayList, Object object) {
        arrayList = (ES2)((Object)arrayList);
        Function2 function2 = this.c;
        object = (List)function2.invoke(arrayList, object);
        int n3 = object.size();
        for (int i3 = 0; i3 < n3; ++i3) {
            boolean bl2;
            Object e2 = object.get(i3);
            if (e2 == null || (bl2 = arrayList.a(e2))) continue;
            object = "item can't be saved".toString();
            arrayList = new ArrayList((String)object);
            throw arrayList;
        }
        boolean bl3 = (object = (Collection)object).isEmpty() ^ true;
        if (bl3) {
            arrayList = new ArrayList(object);
        } else {
            bl3 = false;
            arrayList = null;
        }
        return arrayList;
    }
}

