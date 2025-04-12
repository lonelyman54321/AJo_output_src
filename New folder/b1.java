/*
 * Decompiled with CFR 0.152.
 */
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

public abstract class b1
extends g1_0 {
    public final boolean contains(Object object) {
        Object object2;
        boolean bl2 = object instanceof Map.Entry;
        boolean bl3 = false;
        if (!bl2) {
            return false;
        }
        bl2 = (object = (Map.Entry)object) instanceof Object;
        if (bl2) {
            object2 = object;
        } else {
            bl2 = false;
            object2 = null;
        }
        bl2 = object2 instanceof Map.Entry;
        if (bl2) {
            object2 = this;
            object2 = (wq2_0)this;
            Object object3 = ((Map.Entry)object).getKey();
            object2 = ((wq2_0)object2).a;
            if ((object3 = ((Uq2)object2).get(object3)) != null) {
                object = ((Map.Entry)object).getValue();
                bl3 = Intrinsics.areEqual(object3, object);
            } else {
                boolean bl4;
                object3 = ((Map.Entry)object).getValue();
                if (object3 == null && (bl4 = ((Uq2)object2).containsKey(object = ((Map.Entry)object).getKey()))) {
                    bl3 = true;
                }
            }
        }
        return bl3;
    }

    public final boolean remove(Object object) {
        Object object2;
        boolean bl2 = object instanceof Map.Entry;
        boolean bl3 = false;
        Object var4_4 = null;
        if (!bl2) {
            return false;
        }
        bl2 = (object = (Map.Entry)object) instanceof Object;
        if (bl2) {
            object2 = object;
        } else {
            bl2 = false;
            object2 = null;
        }
        bl2 = object2 instanceof Map.Entry;
        if (bl2) {
            object2 = this;
            object2 = (wq2_0)this;
            var4_4 = ((Map.Entry)object).getKey();
            object = ((Map.Entry)object).getValue();
            object2 = ((wq2_0)object2).a;
            bl3 = ((Uq2)object2).remove(var4_4, object);
        }
        return bl3;
    }
}

