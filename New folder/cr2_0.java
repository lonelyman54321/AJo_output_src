/*
 * Decompiled with CFR 0.152.
 */
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from cr2
 */
public final class cr2_0
extends o1_0 {
    public final Sq2 b;

    public cr2_0(Sq2 sq2) {
        this.b = sq2;
    }

    public final int a() {
        return this.b.g();
    }

    public final boolean contains(Object object) {
        boolean bl2 = object instanceof Map.Entry;
        boolean bl3 = false;
        if (!bl2) {
            return false;
        }
        bl2 = (object = (Map.Entry)object) instanceof Map.Entry;
        if (bl2) {
            Object object2 = ((Map.Entry)object).getKey();
            Sq2 sq2 = this.b;
            if ((object2 = sq2.get(object2)) != null) {
                object = ((Map.Entry)object).getValue();
                bl3 = Intrinsics.areEqual(object2, object);
            } else {
                boolean bl4;
                object2 = ((Map.Entry)object).getValue();
                if (object2 == null && (bl4 = sq2.containsKey(object = ((Map.Entry)object).getKey()))) {
                    bl3 = true;
                }
            }
        }
        return bl3;
    }

    public final Iterator iterator() {
        hs3_0 hs3_02 = this.b.d;
        int n3 = 8;
        is3_0[] is3_0Array = new is3_0[n3];
        for (int i3 = 0; i3 < n3; ++i3) {
            js3_0 js3_02 = new is3_0();
            is3_0Array[i3] = js3_02;
        }
        dr2_0 dr2_02 = new tq2_0(hs3_02, is3_0Array);
        return dr2_02;
    }
}

