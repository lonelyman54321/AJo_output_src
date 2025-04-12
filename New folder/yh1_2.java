/*
 * Decompiled with CFR 0.152.
 */
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;

/*
 * Renamed from yh1
 */
public final class yh1_2
extends hv2_2 {
    public final boolean l;

    public yh1_2(String string2, zh1_2 zh1_22) {
        Intrinsics.checkNotNullParameter(string2, "name");
        Intrinsics.checkNotNullParameter(zh1_22, "generatedSerializer");
        int n3 = 1;
        super(string2, zh1_22, n3);
        this.l = n3;
    }

    /*
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public final boolean equals(Object objectArray) {
        boolean bl2 = true;
        if (this == objectArray) {
            return bl2;
        }
        boolean bl3 = objectArray instanceof yh1_2;
        if (!bl3) return false;
        Object[] objectArray2 = objectArray;
        Object object = this.a;
        SerialDescriptor serialDescriptor = (SerialDescriptor)objectArray;
        Object[] objectArray3 = serialDescriptor.h();
        int n3 = Intrinsics.areEqual(object, objectArray3);
        if (n3 == 0) return false;
        objectArray = (yh1_2)objectArray;
        n3 = objectArray.l;
        if (n3 == 0) return false;
        objectArray3 = (SerialDescriptor[])this.j.getValue();
        int n4 = Arrays.equals(objectArray3, objectArray = (SerialDescriptor[])objectArray.j.getValue());
        if (n4 == 0) return false;
        n3 = this.c;
        n4 = serialDescriptor.d();
        if (n3 != n4) return false;
        n4 = 0;
        objectArray = null;
        while (n4 < n3) {
            Object object2;
            object = this.g(n4).h();
            boolean bl4 = Intrinsics.areEqual(object, object2 = serialDescriptor.g(n4).h());
            if (!bl4 || !(bl4 = Intrinsics.areEqual(object = this.g(n4).getKind(), object2 = serialDescriptor.g(n4).getKind()))) {
                return false;
            }
            ++n4;
        }
        return bl2;
    }

    public final int hashCode() {
        return super.hashCode() * 31;
    }

    public final boolean isInline() {
        return this.l;
    }
}

