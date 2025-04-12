/*
 * Decompiled with CFR 0.152.
 */
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

public final class RG1
implements Xs0 {
    public final Map a;

    public RG1(Map map2) {
        this.a = map2;
    }

    public final Object a(float f5, boolean bl2) {
        Object object;
        Iterator iterator = ((Iterable)this.a.entrySet()).iterator();
        boolean bl3 = iterator.hasNext();
        Object var5_5 = null;
        if (!bl3) {
            bl3 = false;
            object = null;
        } else {
            object = iterator.next();
            int n3 = iterator.hasNext();
            if (n3 != 0) {
                Object object2 = object;
                object2 = (Number)((Map.Entry)object).getValue();
                float f6 = ((Number)object2).floatValue();
                f6 = bl2 ? (f6 -= f5) : f5 - f6;
                float f7 = f6 - 0.0f;
                float f8 = f7 == 0.0f ? 0 : (f7 < 0.0f ? -1 : 1);
                if (f8 < 0) {
                    n3 = 2139095040;
                    f6 = 1.0f / 0.0f;
                }
                do {
                    Object t3 = iterator.next();
                    Object object3 = t3;
                    object3 = (Number)((Map.Entry)t3).getValue();
                    float f11 = ((Number)object3).floatValue();
                    f11 = bl2 ? (f11 -= f5) : f5 - f11;
                    float f12 = f11 - 0.0f;
                    float f14 = f12 == 0.0f ? 0 : (f12 < 0.0f ? -1 : 1);
                    if (f14 < 0) {
                        f11 = 1.0f / 0.0f;
                    }
                    if ((f14 = (float)Float.compare(f6, f11)) <= 0) continue;
                    object = t3;
                    f6 = f11;
                } while ((f8 = (float)iterator.hasNext()) != false);
            }
        }
        object = (Map.Entry)object;
        if (object != null) {
            var5_5 = object.getKey();
        }
        return var5_5;
    }

    public final Object b(float f5) {
        Object object;
        Iterator iterator = ((Iterable)this.a.entrySet()).iterator();
        boolean bl2 = iterator.hasNext();
        Object var4_4 = null;
        if (!bl2) {
            bl2 = false;
            object = null;
        } else {
            object = iterator.next();
            boolean bl3 = iterator.hasNext();
            if (bl3) {
                boolean bl4;
                Object object2 = object;
                object2 = (Number)((Map.Entry)object).getValue();
                float f6 = ((Number)object2).floatValue();
                f6 = Math.abs(f5 - f6);
                do {
                    Object t3 = iterator.next();
                    Object object3 = t3;
                    object3 = (Number)((Map.Entry)t3).getValue();
                    float f7 = ((Number)object3).floatValue();
                    int n3 = Float.compare(f6, f7 = Math.abs(f5 - f7));
                    if (n3 <= 0) continue;
                    object = t3;
                    f6 = f7;
                } while (bl4 = iterator.hasNext());
            }
        }
        object = (Map.Entry)object;
        if (object != null) {
            var4_4 = object.getKey();
        }
        return var4_4;
    }

    public final boolean c(Object object) {
        return this.a.containsKey(object);
    }

    public final float d() {
        float f5;
        Object object = this.a.values();
        Object object2 = "<this>";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        object = object.iterator();
        boolean bl2 = object.hasNext();
        if (!bl2) {
            f5 = 0.0f;
            object = null;
        } else {
            boolean bl3;
            object2 = (Number)object.next();
            float f6 = ((Number)object2).floatValue();
            while (bl3 = object.hasNext()) {
                Number number = (Number)object.next();
                float f7 = number.floatValue();
                f6 = Math.min(f6, f7);
            }
            object = Float.valueOf(f6);
        }
        f5 = object != null ? ((Float)object).floatValue() : 0.0f / 0.0f;
        return f5;
    }

    public final float e(Object object) {
        Map map2 = this.a;
        float f5 = (object = (Float)map2.get(object)) != null ? ((Float)object).floatValue() : 0.0f / 0.0f;
        return f5;
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        boolean bl2 = object instanceof RG1;
        if (!bl2) {
            return false;
        }
        object = ((RG1)object).a;
        return Intrinsics.areEqual(this.a, object);
    }

    public final float f() {
        float f5;
        Object object = this.a.values();
        Object object2 = "<this>";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        object = object.iterator();
        boolean bl2 = object.hasNext();
        if (!bl2) {
            f5 = 0.0f;
            object = null;
        } else {
            boolean bl3;
            object2 = (Number)object.next();
            float f6 = ((Number)object2).floatValue();
            while (bl3 = object.hasNext()) {
                Number number = (Number)object.next();
                float f7 = number.floatValue();
                f6 = Math.max(f6, f7);
            }
            object = Float.valueOf(f6);
        }
        f5 = object != null ? ((Float)object).floatValue() : 0.0f / 0.0f;
        return f5;
    }

    public final int hashCode() {
        return ((Object)this.a).hashCode() * 31;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("MapDraggableAnchors(");
        Map map2 = this.a;
        stringBuilder.append(map2);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}

