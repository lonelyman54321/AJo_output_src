/*
 * Decompiled with CFR 0.152.
 */
import java.io.Externalizable;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from fm0
 */
public final class fm0_2
implements Externalizable {
    private static final long serialVersionUID;
    public un1_2 a;
    public Object b;

    public fm0_2() {
        this(null, null);
    }

    public fm0_2(un1_2 un1_22, Object object) {
        this.a = un1_22;
        this.b = object;
    }

    private final Object readResolve() {
        Object object = this.b;
        Intrinsics.checkNotNull(object);
        return object;
    }

    public final void readExternal(ObjectInput object) {
        Intrinsics.checkNotNullParameter(object, "in");
        Object object2 = object.readObject();
        Intrinsics.checkNotNull(object2, "null cannot be cast to non-null type io.ktor.utils.io.JvmSerializer<T of io.ktor.utils.io.DefaultJvmSerializerReplacement>");
        this.a = object2 = (un1_2)object2;
        Intrinsics.checkNotNull(object2);
        object = object.readObject();
        Intrinsics.checkNotNull(object, "null cannot be cast to non-null type kotlin.ByteArray");
        object = (byte[])object;
        this.b = object = object2.H((byte[])object);
    }

    public final void writeExternal(ObjectOutput objectOutput) {
        Intrinsics.checkNotNullParameter(objectOutput, "out");
        Object object = this.a;
        objectOutput.writeObject(object);
        object = this.a;
        Intrinsics.checkNotNull(object);
        Object object2 = this.b;
        Intrinsics.checkNotNull(object2);
        object = object.z(object2);
        objectOutput.writeObject(object);
    }
}

