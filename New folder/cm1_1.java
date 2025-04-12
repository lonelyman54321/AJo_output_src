/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;

/*
 * Renamed from Cm1
 */
public final class cm1_1 {
    public Object[] a;
    public int[] b;
    public int c;

    public final String a() {
        String string2 = "$";
        StringBuilder stringBuilder = new StringBuilder(string2);
        int n3 = this.c + 1;
        for (int i3 = 0; i3 < n3; ++i3) {
            Object object;
            Object object2 = this.a[i3];
            Object object3 = object2 instanceof SerialDescriptor;
            if (object3 != 0) {
                Object object4;
                object = (object2 = (SerialDescriptor)object2).getKind();
                object3 = Intrinsics.areEqual(object, object4 = Ye3$b.a);
                if (object3 != 0) {
                    object2 = this.b;
                    Object object5 = object2[i3];
                    object3 = -1;
                    if (object5 == object3) continue;
                    stringBuilder.append("[");
                    object5 = this.b[i3];
                    stringBuilder.append((int)object5);
                    object2 = "]";
                    stringBuilder.append((String)object2);
                    continue;
                }
                object = this.b;
                object3 = object[i3];
                if (object3 < 0) continue;
                object4 = ".";
                stringBuilder.append((String)object4);
                object2 = object2.e((int)object3);
                stringBuilder.append((String)object2);
                continue;
            }
            object = Cm1$a.a;
            if (object2 == object) continue;
            object = "['";
            stringBuilder.append((String)object);
            stringBuilder.append(object2);
            object2 = "']";
            stringBuilder.append((String)object2);
        }
        return stringBuilder.toString();
    }

    public final String toString() {
        return this.a();
    }
}

