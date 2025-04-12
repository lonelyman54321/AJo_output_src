/*
 * Decompiled with CFR 0.152.
 */
import androidx.datastore.preferences.protobuf.D;
import androidx.datastore.preferences.protobuf.L;
import androidx.datastore.preferences.protobuf.i_0;

/*
 * Renamed from sT2
 */
public interface st2_0 {
    public void a(Object var1, D var2, i_0 var3);

    public void b(Object var1, L var2);

    public boolean equals(Object var1, Object var2);

    public int getSerializedSize(Object var1);

    public int hashCode(Object var1);

    public boolean isInitialized(Object var1);

    public void makeImmutable(Object var1);

    public void mergeFrom(Object var1, Object var2);

    public Object newInstance();
}

