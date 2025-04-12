/*
 * Decompiled with CFR 0.152.
 */
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;

/*
 * Renamed from Iv2
 */
public final class iv2_2 {
    public static final int a(int[] nArray, int n3) {
        int n4 = nArray.length + -1;
        int n7 = 0;
        while (n7 <= n4) {
            int n8 = n7 + n4 >>> 1;
            int n10 = nArray[n8];
            if (n3 > n10) {
                n7 = n8 + 1;
                continue;
            }
            if (n3 < n10) {
                n4 = n8 + -1;
                continue;
            }
            return n8;
        }
        return -(n7 + 1);
    }

    public static final int b(SerialDescriptor object, SerialDescriptor[] object2) {
        int n3;
        String string2 = "<this>";
        Intrinsics.checkNotNullParameter(object, string2);
        Intrinsics.checkNotNullParameter(object2, "typeParams");
        String string3 = object.h();
        int n4 = string3.hashCode() * 31;
        int n7 = Arrays.hashCode((Object[])object2);
        n4 += n7;
        Intrinsics.checkNotNullParameter(object, string2);
        object2 = new qz2_1((SerialDescriptor)object);
        int n8 = 1;
        int n10 = 1;
        while (true) {
            boolean bl2 = object2.hasNext();
            int n14 = 0;
            if (!bl2) break;
            Object object3 = object2.next();
            n10 *= 31;
            if ((object3 = ((SerialDescriptor)object3).h()) != null) {
                n14 = object3.hashCode();
            }
            n10 += n14;
        }
        object2 = new qz2_1((SerialDescriptor)object);
        while ((n3 = object2.hasNext()) != 0) {
            object = object2.next();
            n8 *= 31;
            if ((object = object.getKind()) != null) {
                n3 = ((xz2_1)object).hashCode();
            } else {
                n3 = 0;
                object = null;
            }
            n8 += n3;
        }
        return (n4 * 31 + n10) * 31 + n8;
    }

    public static final void c(String string2) {
        Intrinsics.checkNotNullParameter(string2, "message");
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException(string2);
        throw illegalArgumentException;
    }
}

