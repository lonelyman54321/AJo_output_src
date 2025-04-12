/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.ranges.f;

public abstract class l62 {
    public Object[] a;
    public int b;

    public final int a(Object objectArray) {
        int n3;
        if (objectArray == null) {
            objectArray = this.a;
            int n4 = this.b;
            for (n3 = 0; n3 < n4; ++n3) {
                Object object = objectArray[n3];
                if (object != null) continue;
                return n3;
            }
        } else {
            Object[] objectArray2 = this.a;
            int n7 = this.b;
            while (n3 < n7) {
                Object object = objectArray2[n3];
                boolean bl2 = objectArray.equals(object);
                if (bl2) {
                    return n3;
                }
                ++n3;
            }
        }
        return -1;
    }

    public final boolean equals(Object objectArray) {
        int n3 = objectArray instanceof l62;
        if (n3 != 0) {
            objectArray = (l62)objectArray;
            n3 = objectArray.b;
            int n4 = this.b;
            if (n3 == n4) {
                Object[] objectArray2 = this.a;
                objectArray = objectArray.a;
                IntRange intRange = f.m(0, n4);
                int n7 = intRange.a;
                n4 = intRange.b;
                if (n7 <= n4) {
                    while (true) {
                        Object object;
                        Object object2;
                        boolean bl2;
                        if (!(bl2 = Intrinsics.areEqual(object2 = objectArray2[n7], object = objectArray[n7]))) {
                            return false;
                        }
                        if (n7 == n4) break;
                        ++n7;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Object[] objectArray = this.a;
        int n3 = this.b;
        int n4 = 0;
        for (int i3 = 0; i3 < n3; ++i3) {
            int n7;
            Object object = objectArray[i3];
            if (object != null) {
                n7 = object.hashCode();
            } else {
                n7 = 0;
                object = null;
            }
            n4 += (n7 *= 31);
        }
        return n4;
    }

    public final String toString() {
        StringBuilder stringBuilder;
        Object object;
        block3: {
            object = new l62$a(this);
            String string2 = ", ";
            Intrinsics.checkNotNullParameter(string2, "separator");
            Object[] objectArray = "[";
            Intrinsics.checkNotNullParameter(objectArray, "prefix");
            String string3 = "]";
            Intrinsics.checkNotNullParameter(string3, "postfix");
            String string4 = "...";
            Intrinsics.checkNotNullParameter(string4, "truncated");
            stringBuilder = new StringBuilder();
            stringBuilder.append((CharSequence)objectArray);
            objectArray = this.a;
            int n3 = this.b;
            for (int i3 = 0; i3 < n3; ++i3) {
                Object object2 = objectArray[i3];
                int n4 = -1;
                if (i3 == n4) {
                    stringBuilder.append((CharSequence)string4);
                    break block3;
                }
                if (i3 != 0) {
                    stringBuilder.append((CharSequence)string2);
                }
                object2 = (CharSequence)object.invoke(object2);
                stringBuilder.append((CharSequence)object2);
            }
            stringBuilder.append((CharSequence)string3);
        }
        object = stringBuilder.toString();
        Intrinsics.checkNotNullExpressionValue(object, "StringBuilder().apply(builderAction).toString()");
        return object;
    }
}

