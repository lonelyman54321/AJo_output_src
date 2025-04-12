/*
 * Decompiled with CFR 0.152.
 */
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/*
 * Renamed from ZB1
 */
public final class zb1_0
implements EC1 {
    public final /* synthetic */ String a;
    public final /* synthetic */ AtomicBoolean b;

    public /* synthetic */ zb1_0(String string2, AtomicBoolean atomicBoolean) {
        this.a = string2;
        this.b = atomicBoolean;
    }

    public final void onResult(Object object) {
        object = (QB1)object;
        object = cc1_0.a;
        Object object2 = this.a;
        ((HashMap)object).remove(object2);
        object2 = this.b;
        boolean bl2 = true;
        ((AtomicBoolean)object2).set(bl2);
        int n3 = ((HashMap)object).size();
        if (n3 == 0) {
            cc1_0.l(bl2);
        }
    }
}

