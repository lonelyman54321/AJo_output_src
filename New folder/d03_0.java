/*
 * Decompiled with CFR 0.152.
 */
import java.io.Externalizable;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from d03
 */
public final class d03_0
implements Externalizable {
    public static final d03$a b;
    private static final long serialVersionUID;
    public Map a;

    static {
        d03$a d03$a;
        b = d03$a = new d03$a(null);
    }

    public d03_0() {
        nz0_2 nz0_22 = fh1_2.f();
        this(nz0_22);
    }

    public d03_0(Map map2) {
        Intrinsics.checkNotNullParameter(map2, "map");
        this.a = map2;
    }

    private final Object readResolve() {
        return this.a;
    }

    public final void readExternal(ObjectInput object) {
        String string2 = "input";
        Intrinsics.checkNotNullParameter(object, string2);
        int n3 = object.readByte();
        if (n3 == 0) {
            n3 = object.readInt();
            if (n3 >= 0) {
                ng1_2 ng1_22 = new ng1_2(n3);
                for (int i3 = 0; i3 < n3; ++i3) {
                    Object object2 = object.readObject();
                    Object object3 = object.readObject();
                    ng1_22.put(object2, object3);
                }
                Intrinsics.checkNotNullParameter(ng1_22, "builder");
                this.a = object = ng1_22.c();
                return;
            }
            StringBuilder stringBuilder = new StringBuilder("Illegal size value: ");
            stringBuilder.append(n3);
            stringBuilder.append('.');
            string2 = stringBuilder.toString();
            object = new InvalidObjectException(string2);
            throw object;
        }
        string2 = hj0_0.a(n3, "Unsupported flags value: ");
        object = new InvalidObjectException(string2);
        throw object;
    }

    public final void writeExternal(ObjectOutput objectOutput) {
        boolean bl2;
        Intrinsics.checkNotNullParameter(objectOutput, "output");
        objectOutput.writeByte(0);
        int n3 = this.a.size();
        objectOutput.writeInt(n3);
        Iterator iterator = this.a.entrySet().iterator();
        while (bl2 = iterator.hasNext()) {
            Map.Entry entry = iterator.next();
            Object k2 = entry.getKey();
            objectOutput.writeObject(k2);
            entry = entry.getValue();
            objectOutput.writeObject(entry);
        }
    }
}

