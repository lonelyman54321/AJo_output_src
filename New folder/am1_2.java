/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.g;
import kotlinx.serialization.descriptors.SerialDescriptor;

/*
 * Renamed from am1
 */
public final class am1_2
extends i0_0 {
    public final q0_0 a;
    public final i0_0 b;

    public am1_2(q0_0 object, ml1_2 ml1_22) {
        Intrinsics.checkNotNullParameter(object, "lexer");
        Intrinsics.checkNotNullParameter(ml1_22, "json");
        this.a = object;
        this.b = object = ml1_22.b;
    }

    public final byte D() {
        q0_0 q0_02 = this.a;
        String string2 = q0_02.l();
        try {
            return g.a(string2);
        }
        catch (IllegalArgumentException illegalArgumentException) {
            string2 = oj_0.b('\'', "Failed to parse type 'UByte' for input '", string2);
            q0_0.r(q0_02, string2, 0, null, 6);
            throw null;
        }
    }

    public final i0_0 a() {
        return this.b;
    }

    public final int i() {
        q0_0 q0_02 = this.a;
        String string2 = q0_02.l();
        try {
            return g.b(string2);
        }
        catch (IllegalArgumentException illegalArgumentException) {
            string2 = oj_0.b('\'', "Failed to parse type 'UInt' for input '", string2);
            q0_0.r(q0_02, string2, 0, null, 6);
            throw null;
        }
    }

    public final long k() {
        q0_0 q0_02 = this.a;
        String string2 = q0_02.l();
        try {
            return g.d(string2);
        }
        catch (IllegalArgumentException illegalArgumentException) {
            string2 = oj_0.b('\'', "Failed to parse type 'ULong' for input '", string2);
            q0_0.r(q0_02, string2, 0, null, 6);
            throw null;
        }
    }

    public final int m(SerialDescriptor object) {
        Intrinsics.checkNotNullParameter(object, "descriptor");
        String string2 = "unsupported".toString();
        object = new IllegalStateException(string2);
        throw object;
    }

    public final short p() {
        q0_0 q0_02 = this.a;
        String string2 = q0_02.l();
        try {
            return g.f(string2);
        }
        catch (IllegalArgumentException illegalArgumentException) {
            string2 = oj_0.b('\'', "Failed to parse type 'UShort' for input '", string2);
            q0_0.r(q0_02, string2, 0, null, 6);
            throw null;
        }
    }
}

