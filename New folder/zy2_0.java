/*
 * Decompiled with CFR 0.152.
 */
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;

/*
 * Renamed from zY2
 */
public final class zy2_0
implements UY2,
Iterable,
KMappedMarker {
    public final LinkedHashMap a;
    public boolean b;
    public boolean c;

    public zy2_0() {
        LinkedHashMap linkedHashMap;
        this.a = linkedHashMap = new LinkedHashMap();
    }

    public final void a(TY2 tY2, Object object) {
        boolean bl2 = object instanceof H1;
        LinkedHashMap linkedHashMap = this.a;
        if (bl2 && (bl2 = linkedHashMap.containsKey(tY2))) {
            Object object2 = linkedHashMap.get(tY2);
            Intrinsics.checkNotNull(object2, "null cannot be cast to non-null type androidx.compose.ui.semantics.AccessibilityAction<*>");
            object2 = (H1)object2;
            object = (H1)object;
            String string2 = ((H1)object).a;
            if (string2 == null) {
                string2 = ((H1)object2).a;
            }
            if ((object = ((H1)object).b) == null) {
                object = ((H1)object2).b;
            }
            H1 h1 = new H1(string2, (fx0_2)object);
            linkedHashMap.put(tY2, h1);
        } else {
            linkedHashMap.put(tY2, object);
        }
    }

    public final Object c(TY2 object) {
        Object object2 = this.a.get(object);
        if (object2 != null) {
            return object2;
        }
        StringBuilder stringBuilder = new StringBuilder("Key not present: ");
        stringBuilder.append(object);
        stringBuilder.append(" - consider getOrElse or getOrNull");
        object = stringBuilder.toString();
        object2 = new Object((String)object);
        throw object2;
    }

    public final Object d(TY2 object, Function0 function0) {
        LinkedHashMap linkedHashMap = this.a;
        if ((object = linkedHashMap.get(object)) == null) {
            object = function0.invoke();
        }
        return object;
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof zy2_0;
        if (!bl3) {
            return false;
        }
        LinkedHashMap linkedHashMap = this.a;
        object = (zy2_0)object;
        LinkedHashMap linkedHashMap2 = ((zy2_0)object).a;
        bl3 = Intrinsics.areEqual(linkedHashMap, linkedHashMap2);
        if (!bl3) {
            return false;
        }
        bl3 = this.b;
        boolean bl4 = ((zy2_0)object).b;
        if (bl3 != bl4) {
            return false;
        }
        bl3 = this.c;
        boolean bl5 = ((zy2_0)object).c;
        if (bl3 != bl5) {
            return false;
        }
        return bl2;
    }

    public final int hashCode() {
        LinkedHashMap linkedHashMap = this.a;
        int n3 = ((Object)linkedHashMap).hashCode() * 31;
        int n4 = this.b;
        int n7 = 1237;
        n4 = n4 != 0 ? 1231 : 1237;
        n3 = (n3 + n4) * 31;
        n4 = (int)(this.c ? 1 : 0);
        if (n4 != 0) {
            n7 = 1231;
        }
        return n3 + n7;
    }

    public final Iterator iterator() {
        return this.a.entrySet().iterator();
    }

    public final String toString() {
        boolean bl2;
        CharSequence charSequence;
        StringBuilder stringBuilder = new StringBuilder();
        boolean bl3 = this.b;
        String string2 = ", ";
        if (bl3) {
            stringBuilder.append("mergeDescendants=true");
            charSequence = string2;
        } else {
            charSequence = "";
        }
        boolean bl4 = this.c;
        if (bl4) {
            stringBuilder.append((String)charSequence);
            stringBuilder.append("isClearingSemantics=true");
            charSequence = string2;
        }
        Iterator iterator = this.a.entrySet().iterator();
        while (bl2 = iterator.hasNext()) {
            Map.Entry entry = iterator.next();
            TY2 tY2 = (TY2)entry.getKey();
            entry = entry.getValue();
            stringBuilder.append((String)charSequence);
            charSequence = tY2.a;
            stringBuilder.append((String)charSequence);
            stringBuilder.append(" : ");
            stringBuilder.append(entry);
            charSequence = string2;
        }
        charSequence = new StringBuilder();
        string2 = h03_0.d(this);
        ((StringBuilder)charSequence).append(string2);
        ((StringBuilder)charSequence).append("{ ");
        ((StringBuilder)charSequence).append((Object)stringBuilder);
        ((StringBuilder)charSequence).append(" }");
        return ((StringBuilder)charSequence).toString();
    }
}

