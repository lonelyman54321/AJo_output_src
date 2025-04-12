/*
 * Decompiled with CFR 0.152.
 */
import androidx.navigation.d;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class ZT1
extends Lambda
implements Function0 {
    public final /* synthetic */ ib3_0 c;

    public ZT1(tr1_0 tr1_02) {
        this.c = tr1_02;
        super(0);
    }

    public final Object invoke() {
        boolean bl2;
        Object object = (List)this.c.getValue();
        ArrayList arrayList = new ArrayList();
        object = object.iterator();
        while (bl2 = object.hasNext()) {
            Object e2;
            Object object2 = e2 = object.next();
            object2 = ((d)e2).b.a;
            String string2 = "composable";
            boolean bl3 = Intrinsics.areEqual(object2, string2);
            if (!bl3) continue;
            arrayList.add(e2);
        }
        return arrayList;
    }
}

