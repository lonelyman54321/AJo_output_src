/*
 * Decompiled with CFR 0.152.
 */
package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.i_0;
import androidx.datastore.preferences.protobuf.u$a;
import java.util.List;
import java.util.Map;

public interface D {
    public void a(List var1, st2_0 var2, i_0 var3);

    public void b(List var1, st2_0 var2, i_0 var3);

    public Object c(st2_0 var1, i_0 var2);

    public void d(Map var1, u.a var2, i_0 var3);

    public Object e(st2_0 var1, i_0 var2);

    public int getFieldNumber();

    public int getTag();

    public boolean readBool();

    public void readBoolList(List var1);

    public DF readBytes();

    public void readBytesList(List var1);

    public double readDouble();

    public void readDoubleList(List var1);

    public int readEnum();

    public void readEnumList(List var1);

    public int readFixed32();

    public void readFixed32List(List var1);

    public long readFixed64();

    public void readFixed64List(List var1);

    public float readFloat();

    public void readFloatList(List var1);

    public int readInt32();

    public void readInt32List(List var1);

    public long readInt64();

    public void readInt64List(List var1);

    public int readSFixed32();

    public void readSFixed32List(List var1);

    public long readSFixed64();

    public void readSFixed64List(List var1);

    public int readSInt32();

    public void readSInt32List(List var1);

    public long readSInt64();

    public void readSInt64List(List var1);

    public String readString();

    public void readStringList(List var1);

    public void readStringListRequireUtf8(List var1);

    public String readStringRequireUtf8();

    public int readUInt32();

    public void readUInt32List(List var1);

    public long readUInt64();

    public void readUInt64List(List var1);

    public boolean skipField();
}

