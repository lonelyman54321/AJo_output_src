/*
 * Decompiled with CFR 0.152.
 */
package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.InvalidProtocolBufferException$InvalidWireTypeException;
import java.io.IOException;

public class InvalidProtocolBufferException
extends IOException {
    private static final long serialVersionUID = -1616151763072450476L;

    public static InvalidProtocolBufferException a() {
        InvalidProtocolBufferException invalidProtocolBufferException = new IOException("Protocol message had invalid UTF-8.");
        return invalidProtocolBufferException;
    }

    public static InvalidProtocolBufferException$InvalidWireTypeException b() {
        InvalidProtocolBufferException$InvalidWireTypeException invalidProtocolBufferException$InvalidWireTypeException = new IOException("Protocol message tag had invalid wire type.");
        return invalidProtocolBufferException$InvalidWireTypeException;
    }

    public static InvalidProtocolBufferException c() {
        InvalidProtocolBufferException invalidProtocolBufferException = new IOException("CodedInputStream encountered a malformed varint.");
        return invalidProtocolBufferException;
    }

    public static InvalidProtocolBufferException d() {
        InvalidProtocolBufferException invalidProtocolBufferException = new IOException("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        return invalidProtocolBufferException;
    }

    public static InvalidProtocolBufferException e() {
        InvalidProtocolBufferException invalidProtocolBufferException = new IOException("Failed to parse the message.");
        return invalidProtocolBufferException;
    }

    public static InvalidProtocolBufferException f() {
        InvalidProtocolBufferException invalidProtocolBufferException = new IOException("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        return invalidProtocolBufferException;
    }
}

