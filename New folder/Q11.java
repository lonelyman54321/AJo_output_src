/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

public final class Q11 {
    public ArrayList a;

    public final boolean a(Ae ae2) {
        ArrayList arrayList = this.a;
        boolean bl2 = false;
        if (arrayList != null) {
            int n3 = arrayList.size();
            for (int i3 = 0; i3 < n3; ++i3) {
                boolean bl3;
                Object object = arrayList.get(i3);
                boolean bl4 = Intrinsics.areEqual(object, ae2);
                if (!(bl4 || (bl4 = object instanceof Q11) && (bl3 = ((Q11)(object = (Q11)object)).a(ae2)))) {
                    continue;
                }
                bl2 = true;
                break;
            }
        }
        return bl2;
    }

    public final Q11 b() {
        Q11 q11;
        Object object = this.a;
        Q11 q112 = null;
        if (object != null) {
            for (int i3 = ((ArrayList)object).size() + -1; i3 >= 0; i3 += -1) {
                q11 = (Q11)((ArrayList)object).get(i3);
                boolean bl2 = q11 instanceof Q11;
                if (!bl2) continue;
                object = q11;
                object = q11;
                object.getClass();
                break;
            }
        } else {
            q11 = null;
        }
        boolean bl3 = q11 instanceof Q11;
        if (bl3) {
            q112 = q11;
            q112 = q11;
        }
        if (q112 == null || (object = q112.b()) == null) {
            object = this;
        }
        return object;
    }

    public final boolean c(Ae ae2) {
        ArrayList arrayList = this.a;
        int n3 = 1;
        if (arrayList != null) {
            for (int i3 = arrayList.size() - n3; i3 >= 0; i3 += -1) {
                boolean bl2;
                Object object = arrayList.get(i3);
                boolean bl3 = object instanceof Ae;
                if (bl3) {
                    bl2 = Intrinsics.areEqual(object, ae2);
                    if (!bl2) continue;
                    arrayList.remove(i3);
                    continue;
                }
                bl3 = object instanceof Q11;
                if (!bl3 || (bl2 = ((Q11)(object = (Q11)object)).c(ae2))) continue;
                arrayList.remove(i3);
            }
            boolean bl4 = arrayList.isEmpty();
            if (bl4) {
                this.a = null;
                return false;
            }
        }
        return n3 != 0;
    }
}

