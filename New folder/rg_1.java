/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Objects;

/*
 * Renamed from RG
 */
public final class rg_1
extends pg_0 {
    static {
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("ConstraintSets");
        arrayList.add("Variables");
        arrayList.add("Generate");
        arrayList.add("Transitions");
        arrayList.add("KeyFrames");
        arrayList.add("KeyAttributes");
        arrayList.add("KeyPositions");
        arrayList.add("KeyCycles");
    }

    public final QG B() {
        ArrayList arrayList = this.e;
        int n3 = arrayList.size();
        if (n3 > 0) {
            return (QG)this.e.get(0);
        }
        return null;
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        boolean bl2 = object instanceof rg_1;
        if (bl2) {
            Object object2 = object;
            object2 = (rg_1)object;
            String string2 = this.e();
            bl2 = Objects.equals(string2, object2 = ((QG)object2).e());
            if (!bl2) {
                return false;
            }
        }
        return super.equals(object);
    }
}

