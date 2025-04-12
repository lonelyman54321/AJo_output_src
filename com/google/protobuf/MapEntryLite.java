/*
 * Decompiled with CFR 0.152.
 */
package com.google.protobuf;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.FieldSet;
import com.google.protobuf.MapEntryLite$1;
import com.google.protobuf.MapEntryLite$Metadata;
import com.google.protobuf.MapFieldLite;
import com.google.protobuf.MessageLite;
import com.google.protobuf.MessageLite$Builder;
import com.google.protobuf.WireFormat;
import com.google.protobuf.WireFormat$FieldType;
import java.util.AbstractMap;
import java.util.Map;

public class MapEntryLite {
    private static final int KEY_FIELD_NUMBER = 1;
    private static final int VALUE_FIELD_NUMBER = 2;
    private final Object key;
    private final MapEntryLite$Metadata metadata;
    private final Object value;

    private MapEntryLite(MapEntryLite$Metadata mapEntryLite$Metadata, Object object, Object object2) {
        this.metadata = mapEntryLite$Metadata;
        this.key = object;
        this.value = object2;
    }

    private MapEntryLite(WireFormat$FieldType wireFormat$FieldType, Object object, WireFormat$FieldType wireFormat$FieldType2, Object object2) {
        MapEntryLite$Metadata mapEntryLite$Metadata;
        this.metadata = mapEntryLite$Metadata = new MapEntryLite$Metadata(wireFormat$FieldType, object, wireFormat$FieldType2, object2);
        this.key = object;
        this.value = object2;
    }

    public static int computeSerializedSize(MapEntryLite$Metadata mapEntryLite$Metadata, Object object, Object object2) {
        int n3 = FieldSet.computeElementSize(mapEntryLite$Metadata.keyType, 1, object);
        int n4 = FieldSet.computeElementSize(mapEntryLite$Metadata.valueType, 2, object2);
        return n3 + n4;
    }

    public static MapEntryLite newDefaultInstance(WireFormat$FieldType wireFormat$FieldType, Object object, WireFormat$FieldType wireFormat$FieldType2, Object object2) {
        MapEntryLite mapEntryLite = new MapEntryLite(wireFormat$FieldType, object, wireFormat$FieldType2, object2);
        return mapEntryLite;
    }

    public static Map.Entry parseEntry(CodedInputStream simpleImmutableEntry, MapEntryLite$Metadata mapEntryLite$Metadata, ExtensionRegistryLite extensionRegistryLite) {
        int n3;
        Object object = mapEntryLite$Metadata.defaultKey;
        Object object2 = mapEntryLite$Metadata.defaultValue;
        while ((n3 = ((CodedInputStream)((Object)simpleImmutableEntry)).readTag()) != 0) {
            WireFormat$FieldType wireFormat$FieldType;
            WireFormat$FieldType wireFormat$FieldType2 = mapEntryLite$Metadata.keyType;
            int n4 = wireFormat$FieldType2.getWireType();
            int n7 = 1;
            if (n3 == (n4 = WireFormat.makeTag(n7, n4))) {
                wireFormat$FieldType = mapEntryLite$Metadata.keyType;
                object = MapEntryLite.parseField(simpleImmutableEntry, extensionRegistryLite, wireFormat$FieldType, object);
                continue;
            }
            wireFormat$FieldType2 = mapEntryLite$Metadata.valueType;
            n4 = wireFormat$FieldType2.getWireType();
            n7 = 2;
            if (n3 == (n4 = WireFormat.makeTag(n7, n4))) {
                wireFormat$FieldType = mapEntryLite$Metadata.valueType;
                object2 = MapEntryLite.parseField(simpleImmutableEntry, extensionRegistryLite, wireFormat$FieldType, object2);
                continue;
            }
            if ((n3 = (int)(((CodedInputStream)((Object)simpleImmutableEntry)).skipField(n3) ? 1 : 0)) != 0) continue;
        }
        simpleImmutableEntry = new AbstractMap.SimpleImmutableEntry<Object, Object>(object, object2);
        return simpleImmutableEntry;
    }

    public static Object parseField(CodedInputStream object, ExtensionRegistryLite extensionRegistryLite, WireFormat$FieldType object2, Object object3) {
        int[] nArray = MapEntryLite$1.$SwitchMap$com$google$protobuf$WireFormat$FieldType;
        int n3 = ((Enum)object2).ordinal();
        int n4 = nArray[n3];
        if (n4 != (n3 = 1)) {
            int n7 = 2;
            if (n4 != n7) {
                n7 = 3;
                if (n4 != n7) {
                    return FieldSet.readPrimitiveField((CodedInputStream)object, (WireFormat$FieldType)((Object)object2), n3 != 0);
                }
                object = new RuntimeException("Groups are not allowed in maps.");
                throw object;
            }
            return ((CodedInputStream)object).readEnum();
        }
        object2 = ((MessageLite)object3).toBuilder();
        ((CodedInputStream)object).readMessage((MessageLite$Builder)object2, extensionRegistryLite);
        return object2.buildPartial();
    }

    public static void writeTo(CodedOutputStream codedOutputStream, MapEntryLite$Metadata object, Object object2, Object object3) {
        WireFormat$FieldType wireFormat$FieldType = object.keyType;
        FieldSet.writeElement(codedOutputStream, wireFormat$FieldType, 1, object2);
        object = object.valueType;
        FieldSet.writeElement(codedOutputStream, (WireFormat$FieldType)((Object)object), 2, object3);
    }

    public int computeMessageSize(int n3, Object object, Object object2) {
        n3 = CodedOutputStream.computeTagSize(n3);
        return CodedOutputStream.computeLengthDelimitedFieldSize(MapEntryLite.computeSerializedSize(this.metadata, object, object2)) + n3;
    }

    public Object getKey() {
        return this.key;
    }

    public MapEntryLite$Metadata getMetadata() {
        return this.metadata;
    }

    public Object getValue() {
        return this.value;
    }

    public Map.Entry parseEntry(ByteString object, ExtensionRegistryLite extensionRegistryLite) {
        object = ((ByteString)object).newCodedInput();
        MapEntryLite$Metadata mapEntryLite$Metadata = this.metadata;
        return MapEntryLite.parseEntry((CodedInputStream)object, mapEntryLite$Metadata, extensionRegistryLite);
    }

    public void parseInto(MapFieldLite mapFieldLite, CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        int n3;
        int n4 = codedInputStream.readRawVarint32();
        n4 = codedInputStream.pushLimit(n4);
        Object object = this.metadata;
        Object object2 = ((MapEntryLite$Metadata)object).defaultKey;
        object = ((MapEntryLite$Metadata)object).defaultValue;
        while ((n3 = codedInputStream.readTag()) != 0) {
            WireFormat$FieldType wireFormat$FieldType;
            WireFormat$FieldType wireFormat$FieldType2 = this.metadata.keyType;
            int n7 = wireFormat$FieldType2.getWireType();
            int n8 = 1;
            if (n3 == (n7 = WireFormat.makeTag(n8, n7))) {
                wireFormat$FieldType = this.metadata.keyType;
                object2 = MapEntryLite.parseField(codedInputStream, extensionRegistryLite, wireFormat$FieldType, object2);
                continue;
            }
            wireFormat$FieldType2 = this.metadata.valueType;
            n7 = wireFormat$FieldType2.getWireType();
            n8 = 2;
            if (n3 == (n7 = WireFormat.makeTag(n8, n7))) {
                wireFormat$FieldType = this.metadata.valueType;
                object = MapEntryLite.parseField(codedInputStream, extensionRegistryLite, wireFormat$FieldType, object);
                continue;
            }
            if ((n3 = (int)(codedInputStream.skipField(n3) ? 1 : 0)) != 0) continue;
        }
        codedInputStream.checkLastTagWas(0);
        codedInputStream.popLimit(n4);
        mapFieldLite.put(object2, object);
    }

    public void serializeTo(CodedOutputStream codedOutputStream, int n3, Object object, Object object2) {
        codedOutputStream.writeTag(n3, 2);
        n3 = MapEntryLite.computeSerializedSize(this.metadata, object, object2);
        codedOutputStream.writeUInt32NoTag(n3);
        MapEntryLite$Metadata mapEntryLite$Metadata = this.metadata;
        MapEntryLite.writeTo(codedOutputStream, mapEntryLite$Metadata, object, object2);
    }
}

