/*
 * Decompiled with CFR 0.152.
 */
import java.io.Externalizable;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.Collection;
import java.util.Iterator;
import kotlin.collections.a;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from c03
 */
public final class c03_0
implements Externalizable {
    public static final c03$a c;
    private static final long serialVersionUID;
    public Collection a;
    public final int b;

    static {
        c03$a c03$a;
        c = c03$a = new c03$a(null);
    }

    public c03_0() {
        mz0_2 mz0_22 = mz0_2.a;
        this(0, mz0_22);
    }

    public c03_0(int n3, Collection collection) {
        Intrinsics.checkNotNullParameter(collection, "collection");
        this.a = collection;
        this.b = n3;
    }

    private final Object readResolve() {
        return this.a;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void readExternal(ObjectInput object) {
        CharSequence charSequence = "input";
        Intrinsics.checkNotNullParameter(object, (String)charSequence);
        int n3 = object.readByte();
        int n4 = n3 & 1;
        int n7 = n3 & 0xFFFFFFFE;
        char c2 = '.';
        if (n7 != 0) {
            StringBuilder stringBuilder = new StringBuilder("Unsupported flags value: ");
            stringBuilder.append(n3);
            stringBuilder.append(c2);
            charSequence = stringBuilder.toString();
            object = new InvalidObjectException((String)charSequence);
            throw object;
        }
        n3 = object.readInt();
        if (n3 < 0) {
            StringBuilder stringBuilder = new StringBuilder("Illegal size value: ");
            stringBuilder.append(n3);
            stringBuilder.append(c2);
            charSequence = stringBuilder.toString();
            object = new InvalidObjectException((String)charSequence);
            throw object;
        }
        if (n4 != 0) {
            int n8 = 1;
            if (n4 != n8) {
                charSequence = new StringBuilder("Unsupported collection type tag: ");
                ((StringBuilder)charSequence).append(n4);
                ((StringBuilder)charSequence).append(c2);
                charSequence = ((StringBuilder)charSequence).toString();
                object = new InvalidObjectException((String)charSequence);
                throw object;
            }
            Object object2 = new ng1_2(n3);
            k03_0 k03_02 = new k03_0((ng1_2)object2);
            for (n7 = 0; n7 < n3; ++n7) {
                object2 = object.readObject();
                k03_02.add(object2);
            }
            object = O03.a(k03_02);
        } else {
            vu1_2 vu1_22 = new vu1_2(n3);
            while (n7 < n3) {
                Object object3 = object.readObject();
                vu1_22.add(object3);
                ++n7;
            }
            object = kotlin.collections.a.a(vu1_22);
        }
        this.a = object;
    }

    public final void writeExternal(ObjectOutput objectOutput) {
        boolean bl2;
        Intrinsics.checkNotNullParameter(objectOutput, "output");
        int n3 = this.b;
        objectOutput.writeByte(n3);
        n3 = this.a.size();
        objectOutput.writeInt(n3);
        Iterator iterator = this.a.iterator();
        while (bl2 = iterator.hasNext()) {
            Object e2 = iterator.next();
            objectOutput.writeObject(e2);
        }
    }
}

