/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Unit;

public final class TT0$a
implements fs0_2 {
    public final /* synthetic */ List a;
    public final /* synthetic */ tr1_0 b;

    public TT0$a(ArrayList arrayList, tr1_0 tr1_02) {
        this.a = arrayList;
        this.b = tr1_02;
    }

    public final Object emit(Object object, f80_0 f80_02) {
        object = (kj1)object;
        boolean bl2 = object instanceof rt0_0;
        List list = this.a;
        if (bl2) {
            list.add(object);
        } else {
            bl2 = object instanceof ST0;
            if (bl2) {
                object = ((ST0)object).a;
                list.remove(object);
            }
        }
        object = ((Collection)list).isEmpty() ^ true;
        this.b.setValue(object);
        return Unit.a;
    }
}

