/*
 * Decompiled with CFR 0.152.
 */
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.a;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoder;

/*
 * Renamed from ZP2
 */
public final class zp2_0
extends k0_0 {
    public final KSerializer a;
    public final Map b;
    public final yz2_2 c;
    public final LinkedHashMap d;
    public int e;

    public zp2_0(KSerializer linkedHashMap, LinkedHashMap linkedHashMap2) {
        Intrinsics.checkNotNullParameter(linkedHashMap, "serializer");
        Intrinsics.checkNotNullParameter(linkedHashMap2, "typeMap");
        this.a = linkedHashMap;
        this.b = linkedHashMap2;
        linkedHashMap = p03.a;
        this.c = linkedHashMap;
        this.d = linkedHashMap = new LinkedHashMap();
        this.e = -1;
    }

    public final void B(b03_0 b03_02, Object object) {
        Intrinsics.checkNotNullParameter(b03_02, "serializer");
        this.Z(object);
    }

    public final void R(SerialDescriptor serialDescriptor, int n3) {
        Intrinsics.checkNotNullParameter(serialDescriptor, "descriptor");
        this.e = n3;
    }

    public final void S(Object object) {
        Intrinsics.checkNotNullParameter(object, "value");
        this.Z(object);
    }

    public final void Z(Object object) {
        Object object2 = this.a.getDescriptor();
        int n3 = this.e;
        cU1 cU12 = (cU1)this.b.get(object2 = object2.e(n3));
        if (cU12 != null) {
            boolean bl2 = cU12 instanceof vx_1;
            if (bl2) {
                cU12 = (vx_1)cU12;
                object = ((vx_1)cU12).i(object);
            } else {
                object = kotlin.collections.a.b(cU12.f(object));
            }
            this.d.put(object2, object);
            return;
        }
        object = cP.a("Cannot find NavType for argument ", (String)object2, ". Please provide NavType through typeMap.");
        object = object.toString();
        object2 = new IllegalStateException((String)object);
        throw object2;
    }

    public final i0_0 a() {
        return this.c;
    }

    public final Encoder o(SerialDescriptor serialDescriptor) {
        int n3;
        String string2 = "descriptor";
        Intrinsics.checkNotNullParameter(serialDescriptor, string2);
        Intrinsics.checkNotNullParameter(serialDescriptor, "<this>");
        xz2_1 xz2_12 = serialDescriptor.getKind();
        Ye3$a ye3$a = Ye3$a.a;
        int n4 = Intrinsics.areEqual(xz2_12, ye3$a);
        if (n4 != 0 && (n4 = serialDescriptor.isInline()) != 0 && (n4 = serialDescriptor.d()) == (n3 = 1)) {
            n4 = 0;
            xz2_12 = null;
            this.e = 0;
        }
        Intrinsics.checkNotNullParameter(serialDescriptor, string2);
        return this;
    }

    public final void u() {
        this.Z(null);
    }
}

