/*
 * Decompiled with CFR 0.152.
 */
import androidx.datastore.preferences.protobuf.CodedOutputStream;
import androidx.datastore.preferences.protobuf.n$a;

/*
 * Renamed from wO1
 */
public interface wo1_1
extends xo1_0 {
    public void d(CodedOutputStream var1);

    public int getSerializedSize();

    public n$a newBuilderForType();

    public n$a toBuilder();

    public DF$e toByteString();
}

