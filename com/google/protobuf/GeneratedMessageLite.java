/*
 * Decompiled with CFR 0.152.
 */
package com.google.protobuf;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.AbstractMessageLite$Builder$LimitedInputStream;
import com.google.protobuf.ArrayDecoders$Registers;
import com.google.protobuf.BooleanArrayList;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.CodedInputStreamReader;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.CodedOutputStreamWriter;
import com.google.protobuf.DoubleArrayList;
import com.google.protobuf.ExtensionLite;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.FloatArrayList;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.google.protobuf.GeneratedMessageLite$ExtensionDescriptor;
import com.google.protobuf.GeneratedMessageLite$GeneratedExtension;
import com.google.protobuf.GeneratedMessageLite$MethodToInvoke;
import com.google.protobuf.IntArrayList;
import com.google.protobuf.Internal$BooleanList;
import com.google.protobuf.Internal$DoubleList;
import com.google.protobuf.Internal$EnumLiteMap;
import com.google.protobuf.Internal$FloatList;
import com.google.protobuf.Internal$IntList;
import com.google.protobuf.Internal$LongList;
import com.google.protobuf.Internal$ProtobufList;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.LongArrayList;
import com.google.protobuf.MessageLite;
import com.google.protobuf.MessageLiteToString;
import com.google.protobuf.Parser;
import com.google.protobuf.Protobuf;
import com.google.protobuf.ProtobufArrayList;
import com.google.protobuf.RawMessageInfo;
import com.google.protobuf.Reader;
import com.google.protobuf.Schema;
import com.google.protobuf.UninitializedMessageException;
import com.google.protobuf.UnknownFieldSetLite;
import com.google.protobuf.UnsafeUtil;
import com.google.protobuf.WireFormat;
import com.google.protobuf.WireFormat$FieldType;
import com.google.protobuf.Writer;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public abstract class GeneratedMessageLite
extends AbstractMessageLite {
    private static final int MEMOIZED_SERIALIZED_SIZE_MASK = Integer.MAX_VALUE;
    private static final int MUTABLE_FLAG_MASK = Integer.MIN_VALUE;
    static final int UNINITIALIZED_HASH_CODE = 0;
    static final int UNINITIALIZED_SERIALIZED_SIZE = Integer.MAX_VALUE;
    private static Map defaultInstanceMap;
    private int memoizedSerializedSize = -1;
    protected UnknownFieldSetLite unknownFields;

    static {
        ConcurrentHashMap concurrentHashMap;
        defaultInstanceMap = concurrentHashMap = new ConcurrentHashMap();
    }

    public GeneratedMessageLite() {
        UnknownFieldSetLite unknownFieldSetLite;
        this.unknownFields = unknownFieldSetLite = UnknownFieldSetLite.getDefaultInstance();
    }

    public static /* synthetic */ GeneratedMessageLite$GeneratedExtension access$000(ExtensionLite extensionLite) {
        return GeneratedMessageLite.checkIsLite(extensionLite);
    }

    public static /* synthetic */ GeneratedMessageLite access$200(GeneratedMessageLite generatedMessageLite, byte[] byArray, int n3, int n4, ExtensionRegistryLite extensionRegistryLite) {
        return GeneratedMessageLite.parsePartialFrom(generatedMessageLite, byArray, n3, n4, extensionRegistryLite);
    }

    private static GeneratedMessageLite$GeneratedExtension checkIsLite(ExtensionLite object) {
        boolean bl2 = ((ExtensionLite)object).isLite();
        if (bl2) {
            return (GeneratedMessageLite$GeneratedExtension)object;
        }
        object = new IllegalArgumentException("Expected a lite extension.");
        throw object;
    }

    private static GeneratedMessageLite checkMessageInitialized(GeneratedMessageLite generatedMessageLite) {
        boolean bl2;
        if (generatedMessageLite != null && !(bl2 = generatedMessageLite.isInitialized())) {
            throw generatedMessageLite.newUninitializedMessageException().asInvalidProtocolBufferException().setUnfinishedMessage(generatedMessageLite);
        }
        return generatedMessageLite;
    }

    private int computeSerializedSize(Schema schema) {
        if (schema == null) {
            return Protobuf.getInstance().schemaFor(this).getSerializedSize(this);
        }
        return schema.getSerializedSize(this);
    }

    public static Internal$BooleanList emptyBooleanList() {
        return BooleanArrayList.emptyList();
    }

    public static Internal$DoubleList emptyDoubleList() {
        return DoubleArrayList.emptyList();
    }

    public static Internal$FloatList emptyFloatList() {
        return FloatArrayList.emptyList();
    }

    public static Internal$IntList emptyIntList() {
        return IntArrayList.emptyList();
    }

    public static Internal$LongList emptyLongList() {
        return LongArrayList.emptyList();
    }

    public static Internal$ProtobufList emptyProtobufList() {
        return ProtobufArrayList.emptyList();
    }

    private void ensureUnknownFieldsInitialized() {
        UnknownFieldSetLite unknownFieldSetLite = this.unknownFields;
        UnknownFieldSetLite unknownFieldSetLite2 = UnknownFieldSetLite.getDefaultInstance();
        if (unknownFieldSetLite == unknownFieldSetLite2) {
            this.unknownFields = unknownFieldSetLite = UnknownFieldSetLite.newInstance();
        }
    }

    public static GeneratedMessageLite getDefaultInstance(Class serializable) {
        Object object;
        Object object2 = (GeneratedMessageLite)defaultInstanceMap.get(serializable);
        if (object2 == null) {
            try {
                object2 = serializable.getName();
            }
            catch (ClassNotFoundException classNotFoundException) {
                object2 = new IllegalStateException("Class initialization cannot fail.", classNotFoundException);
                throw object2;
            }
            object = serializable.getClassLoader();
            boolean bl2 = true;
            Class.forName((String)object2, bl2, (ClassLoader)object);
            object2 = (GeneratedMessageLite)defaultInstanceMap.get(serializable);
        }
        if (object2 == null) {
            object2 = ((GeneratedMessageLite)UnsafeUtil.allocateInstance(serializable)).getDefaultInstanceForType();
            if (object2 != null) {
                object = defaultInstanceMap;
                object.put(serializable, object2);
            } else {
                serializable = new IllegalStateException();
                throw serializable;
            }
        }
        return object2;
    }

    public static Method getMethodOrDie(Class object, String string2, Class ... classArray) {
        try {
            return ((Class)object).getMethod(string2, classArray);
        }
        catch (NoSuchMethodException noSuchMethodException) {
            StringBuilder stringBuilder = new StringBuilder("Generated message class \"");
            object = ((Class)object).getName();
            stringBuilder.append((String)object);
            stringBuilder.append("\" missing method \"");
            stringBuilder.append(string2);
            stringBuilder.append("\".");
            object = stringBuilder.toString();
            RuntimeException runtimeException = new RuntimeException((String)object, noSuchMethodException);
            throw runtimeException;
        }
    }

    public static Object invokeOrDie(Method object, Object object2, Object ... objectArray) {
        try {
            return ((Method)object).invoke(object2, objectArray);
        }
        catch (InvocationTargetException invocationTargetException) {
            object = invocationTargetException.getCause();
            boolean bl2 = object instanceof RuntimeException;
            if (!bl2) {
                bl2 = object instanceof Error;
                if (bl2) {
                    throw (Error)object;
                }
                object2 = new RuntimeException("Unexpected exception thrown by generated accessor method.", (Throwable)object);
                throw object2;
            }
            throw (RuntimeException)object;
        }
        catch (IllegalAccessException illegalAccessException) {
            object2 = new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", illegalAccessException);
            throw object2;
        }
    }

    public static final boolean isInitialized(GeneratedMessageLite generatedMessageLite, boolean bl2) {
        byte by2;
        Object object = GeneratedMessageLite$MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED;
        byte by4 = (Byte)(object = (Byte)generatedMessageLite.dynamicMethod((GeneratedMessageLite$MethodToInvoke)((Object)object)));
        if (by4 == (by2 = 1)) {
            return by2 != 0;
        }
        if (!by4) {
            return false;
        }
        object = Protobuf.getInstance().schemaFor(generatedMessageLite);
        by4 = object.isInitialized(generatedMessageLite);
        if (bl2) {
            GeneratedMessageLite generatedMessageLite2;
            GeneratedMessageLite$MethodToInvoke generatedMessageLite$MethodToInvoke = GeneratedMessageLite$MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED;
            if (by4) {
                generatedMessageLite2 = generatedMessageLite;
            } else {
                by2 = 0;
                generatedMessageLite2 = null;
            }
            generatedMessageLite.dynamicMethod(generatedMessageLite$MethodToInvoke, generatedMessageLite2);
        }
        return by4 != 0;
    }

    public static Internal$BooleanList mutableCopy(Internal$BooleanList internal$BooleanList) {
        int n3 = internal$BooleanList.size();
        n3 = n3 == 0 ? 10 : (n3 *= 2);
        return internal$BooleanList.mutableCopyWithCapacity(n3);
    }

    public static Internal$DoubleList mutableCopy(Internal$DoubleList internal$DoubleList) {
        int n3 = internal$DoubleList.size();
        n3 = n3 == 0 ? 10 : (n3 *= 2);
        return internal$DoubleList.mutableCopyWithCapacity(n3);
    }

    public static Internal$FloatList mutableCopy(Internal$FloatList internal$FloatList) {
        int n3 = internal$FloatList.size();
        n3 = n3 == 0 ? 10 : (n3 *= 2);
        return internal$FloatList.mutableCopyWithCapacity(n3);
    }

    public static Internal$IntList mutableCopy(Internal$IntList internal$IntList) {
        int n3 = internal$IntList.size();
        n3 = n3 == 0 ? 10 : (n3 *= 2);
        return internal$IntList.mutableCopyWithCapacity(n3);
    }

    public static Internal$LongList mutableCopy(Internal$LongList internal$LongList) {
        int n3 = internal$LongList.size();
        n3 = n3 == 0 ? 10 : (n3 *= 2);
        return internal$LongList.mutableCopyWithCapacity(n3);
    }

    public static Internal$ProtobufList mutableCopy(Internal$ProtobufList internal$ProtobufList) {
        int n3 = internal$ProtobufList.size();
        n3 = n3 == 0 ? 10 : (n3 *= 2);
        return internal$ProtobufList.mutableCopyWithCapacity(n3);
    }

    public static Object newMessageInfo(MessageLite messageLite, String string2, Object[] objectArray) {
        RawMessageInfo rawMessageInfo = new RawMessageInfo(messageLite, string2, objectArray);
        return rawMessageInfo;
    }

    public static GeneratedMessageLite$GeneratedExtension newRepeatedGeneratedExtension(MessageLite messageLite, MessageLite messageLite2, Internal$EnumLiteMap internal$EnumLiteMap, int n3, WireFormat$FieldType wireFormat$FieldType, boolean bl2, Class clazz) {
        List list = Collections.emptyList();
        GeneratedMessageLite$ExtensionDescriptor generatedMessageLite$ExtensionDescriptor = new GeneratedMessageLite$ExtensionDescriptor(internal$EnumLiteMap, n3, wireFormat$FieldType, true, bl2);
        GeneratedMessageLite$GeneratedExtension generatedMessageLite$GeneratedExtension = new GeneratedMessageLite$GeneratedExtension(messageLite, list, messageLite2, generatedMessageLite$ExtensionDescriptor, clazz);
        return generatedMessageLite$GeneratedExtension;
    }

    public static GeneratedMessageLite$GeneratedExtension newSingularGeneratedExtension(MessageLite messageLite, Object object, MessageLite messageLite2, Internal$EnumLiteMap internal$EnumLiteMap, int n3, WireFormat$FieldType wireFormat$FieldType, Class clazz) {
        GeneratedMessageLite$ExtensionDescriptor generatedMessageLite$ExtensionDescriptor = new GeneratedMessageLite$ExtensionDescriptor(internal$EnumLiteMap, n3, wireFormat$FieldType, false, false);
        GeneratedMessageLite$GeneratedExtension generatedMessageLite$GeneratedExtension = new GeneratedMessageLite$GeneratedExtension(messageLite, object, messageLite2, generatedMessageLite$ExtensionDescriptor, clazz);
        return generatedMessageLite$GeneratedExtension;
    }

    public static GeneratedMessageLite parseDelimitedFrom(GeneratedMessageLite generatedMessageLite, InputStream inputStream) {
        ExtensionRegistryLite extensionRegistryLite = ExtensionRegistryLite.getEmptyRegistry();
        return GeneratedMessageLite.checkMessageInitialized(GeneratedMessageLite.parsePartialDelimitedFrom(generatedMessageLite, inputStream, extensionRegistryLite));
    }

    public static GeneratedMessageLite parseDelimitedFrom(GeneratedMessageLite generatedMessageLite, InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return GeneratedMessageLite.checkMessageInitialized(GeneratedMessageLite.parsePartialDelimitedFrom(generatedMessageLite, inputStream, extensionRegistryLite));
    }

    public static GeneratedMessageLite parseFrom(GeneratedMessageLite generatedMessageLite, ByteString byteString) {
        ExtensionRegistryLite extensionRegistryLite = ExtensionRegistryLite.getEmptyRegistry();
        return GeneratedMessageLite.checkMessageInitialized(GeneratedMessageLite.parseFrom(generatedMessageLite, byteString, extensionRegistryLite));
    }

    public static GeneratedMessageLite parseFrom(GeneratedMessageLite generatedMessageLite, ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return GeneratedMessageLite.checkMessageInitialized(GeneratedMessageLite.parsePartialFrom(generatedMessageLite, byteString, extensionRegistryLite));
    }

    public static GeneratedMessageLite parseFrom(GeneratedMessageLite generatedMessageLite, CodedInputStream codedInputStream) {
        ExtensionRegistryLite extensionRegistryLite = ExtensionRegistryLite.getEmptyRegistry();
        return GeneratedMessageLite.parseFrom(generatedMessageLite, codedInputStream, extensionRegistryLite);
    }

    public static GeneratedMessageLite parseFrom(GeneratedMessageLite generatedMessageLite, CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return GeneratedMessageLite.checkMessageInitialized(GeneratedMessageLite.parsePartialFrom(generatedMessageLite, codedInputStream, extensionRegistryLite));
    }

    public static GeneratedMessageLite parseFrom(GeneratedMessageLite generatedMessageLite, InputStream object) {
        object = CodedInputStream.newInstance((InputStream)object);
        ExtensionRegistryLite extensionRegistryLite = ExtensionRegistryLite.getEmptyRegistry();
        return GeneratedMessageLite.checkMessageInitialized(GeneratedMessageLite.parsePartialFrom(generatedMessageLite, (CodedInputStream)object, extensionRegistryLite));
    }

    public static GeneratedMessageLite parseFrom(GeneratedMessageLite generatedMessageLite, InputStream object, ExtensionRegistryLite extensionRegistryLite) {
        object = CodedInputStream.newInstance((InputStream)object);
        return GeneratedMessageLite.checkMessageInitialized(GeneratedMessageLite.parsePartialFrom(generatedMessageLite, (CodedInputStream)object, extensionRegistryLite));
    }

    public static GeneratedMessageLite parseFrom(GeneratedMessageLite generatedMessageLite, ByteBuffer byteBuffer) {
        ExtensionRegistryLite extensionRegistryLite = ExtensionRegistryLite.getEmptyRegistry();
        return GeneratedMessageLite.parseFrom(generatedMessageLite, byteBuffer, extensionRegistryLite);
    }

    public static GeneratedMessageLite parseFrom(GeneratedMessageLite generatedMessageLite, ByteBuffer object, ExtensionRegistryLite extensionRegistryLite) {
        object = CodedInputStream.newInstance((ByteBuffer)object);
        return GeneratedMessageLite.checkMessageInitialized(GeneratedMessageLite.parseFrom(generatedMessageLite, (CodedInputStream)object, extensionRegistryLite));
    }

    public static GeneratedMessageLite parseFrom(GeneratedMessageLite generatedMessageLite, byte[] byArray) {
        int n3 = byArray.length;
        ExtensionRegistryLite extensionRegistryLite = ExtensionRegistryLite.getEmptyRegistry();
        return GeneratedMessageLite.checkMessageInitialized(GeneratedMessageLite.parsePartialFrom(generatedMessageLite, byArray, 0, n3, extensionRegistryLite));
    }

    public static GeneratedMessageLite parseFrom(GeneratedMessageLite generatedMessageLite, byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        int n3 = byArray.length;
        return GeneratedMessageLite.checkMessageInitialized(GeneratedMessageLite.parsePartialFrom(generatedMessageLite, byArray, 0, n3, extensionRegistryLite));
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static GeneratedMessageLite parsePartialDelimitedFrom(GeneratedMessageLite generatedMessageLite, InputStream object, ExtensionRegistryLite extensionRegistryLite) {
        Object object2;
        InvalidProtocolBufferException invalidProtocolBufferException3222;
        block8: {
            IOException iOException2222;
            block7: {
                AbstractMessageLite$Builder$LimitedInputStream abstractMessageLite$Builder$LimitedInputStream;
                try {
                    int n3 = ((InputStream)object).read();
                    int n4 = -1;
                    if (n3 == n4) {
                        return null;
                    }
                    n3 = CodedInputStream.readRawVarint32(n3, (InputStream)object);
                    abstractMessageLite$Builder$LimitedInputStream = new AbstractMessageLite$Builder$LimitedInputStream((InputStream)object, n3);
                }
                catch (IOException iOException2222) {
                    break block7;
                }
                catch (InvalidProtocolBufferException invalidProtocolBufferException3222) {
                    break block8;
                }
                object = CodedInputStream.newInstance(abstractMessageLite$Builder$LimitedInputStream);
                generatedMessageLite = GeneratedMessageLite.parsePartialFrom(generatedMessageLite, (CodedInputStream)object, extensionRegistryLite);
                extensionRegistryLite = null;
                try {
                    ((CodedInputStream)object).checkLastTagWas(0);
                    return generatedMessageLite;
                }
                catch (InvalidProtocolBufferException invalidProtocolBufferException) {
                    throw invalidProtocolBufferException.setUnfinishedMessage(generatedMessageLite);
                }
            }
            object = new InvalidProtocolBufferException(iOException2222);
            throw object;
        }
        boolean bl2 = invalidProtocolBufferException3222.getThrownFromInputStream();
        if (bl2) {
            object2 = object = new InvalidProtocolBufferException(invalidProtocolBufferException3222);
        }
        throw object2;
    }

    private static GeneratedMessageLite parsePartialFrom(GeneratedMessageLite generatedMessageLite, ByteString object, ExtensionRegistryLite extensionRegistryLite) {
        object = ((ByteString)object).newCodedInput();
        generatedMessageLite = GeneratedMessageLite.parsePartialFrom(generatedMessageLite, (CodedInputStream)object, extensionRegistryLite);
        extensionRegistryLite = null;
        try {
            ((CodedInputStream)object).checkLastTagWas(0);
            return generatedMessageLite;
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            throw invalidProtocolBufferException.setUnfinishedMessage(generatedMessageLite);
        }
    }

    public static GeneratedMessageLite parsePartialFrom(GeneratedMessageLite generatedMessageLite, CodedInputStream codedInputStream) {
        ExtensionRegistryLite extensionRegistryLite = ExtensionRegistryLite.getEmptyRegistry();
        return GeneratedMessageLite.parsePartialFrom(generatedMessageLite, codedInputStream, extensionRegistryLite);
    }

    public static GeneratedMessageLite parsePartialFrom(GeneratedMessageLite generatedMessageLite, CodedInputStream object, ExtensionRegistryLite object2) {
        Object object3;
        InvalidProtocolBufferException invalidProtocolBufferException2;
        block15: {
            UninitializedMessageException uninitializedMessageException2;
            block14: {
                IOException iOException2;
                block13: {
                    generatedMessageLite = generatedMessageLite.newMutableInstance();
                    Object object4 = Protobuf.getInstance();
                    object4 = ((Protobuf)object4).schemaFor(generatedMessageLite);
                    object = CodedInputStreamReader.forCodedInput((CodedInputStream)object);
                    object4.mergeFrom(generatedMessageLite, (Reader)object, (ExtensionRegistryLite)object2);
                    try {
                        object4.makeImmutable(generatedMessageLite);
                        return generatedMessageLite;
                    }
                    catch (RuntimeException runtimeException) {
                    }
                    catch (IOException iOException2) {
                        break block13;
                    }
                    catch (UninitializedMessageException uninitializedMessageException2) {
                        break block14;
                    }
                    catch (InvalidProtocolBufferException invalidProtocolBufferException2) {
                        break block15;
                    }
                    object = runtimeException.getCause();
                    boolean bl2 = object instanceof InvalidProtocolBufferException;
                    if (bl2) {
                        throw (InvalidProtocolBufferException)runtimeException.getCause();
                    }
                    throw runtimeException;
                }
                object2 = iOException2.getCause();
                boolean bl3 = object2 instanceof InvalidProtocolBufferException;
                if (bl3) {
                    throw (InvalidProtocolBufferException)iOException2.getCause();
                }
                object2 = new InvalidProtocolBufferException(iOException2);
                throw ((InvalidProtocolBufferException)object2).setUnfinishedMessage(generatedMessageLite);
            }
            throw uninitializedMessageException2.asInvalidProtocolBufferException().setUnfinishedMessage(generatedMessageLite);
        }
        boolean bl4 = invalidProtocolBufferException2.getThrownFromInputStream();
        if (bl4) {
            object3 = object2 = new InvalidProtocolBufferException(invalidProtocolBufferException2);
        }
        throw ((InvalidProtocolBufferException)object3).setUnfinishedMessage(generatedMessageLite);
    }

    private static GeneratedMessageLite parsePartialFrom(GeneratedMessageLite generatedMessageLite, byte[] byArray, int n3, int n4, ExtensionRegistryLite extensionRegistryLite) {
        InvalidProtocolBufferException invalidProtocolBufferException;
        InvalidProtocolBufferException invalidProtocolBufferException22;
        block14: {
            UninitializedMessageException uninitializedMessageException2;
            block13: {
                generatedMessageLite = generatedMessageLite.newMutableInstance();
                Object object = Protobuf.getInstance();
                Schema schema = ((Protobuf)object).schemaFor(generatedMessageLite);
                int n7 = n3 + n4;
                ArrayDecoders$Registers arrayDecoders$Registers = new ArrayDecoders$Registers(extensionRegistryLite);
                object = schema;
                schema.mergeFrom(generatedMessageLite, byArray, n3, n7, arrayDecoders$Registers);
                try {
                    schema.makeImmutable(generatedMessageLite);
                    return generatedMessageLite;
                }
                catch (IOException iOException) {
                }
                catch (UninitializedMessageException uninitializedMessageException2) {
                    break block13;
                }
                catch (InvalidProtocolBufferException invalidProtocolBufferException22) {
                    break block14;
                }
                catch (IndexOutOfBoundsException indexOutOfBoundsException) {
                    throw InvalidProtocolBufferException.truncatedMessage().setUnfinishedMessage(generatedMessageLite);
                }
                Throwable throwable = iOException.getCause();
                n3 = throwable instanceof InvalidProtocolBufferException;
                if (n3 != 0) {
                    throw (InvalidProtocolBufferException)iOException.getCause();
                }
                throwable = new InvalidProtocolBufferException(iOException);
                throw ((InvalidProtocolBufferException)throwable).setUnfinishedMessage(generatedMessageLite);
            }
            throw uninitializedMessageException2.asInvalidProtocolBufferException().setUnfinishedMessage(generatedMessageLite);
        }
        n3 = (int)(invalidProtocolBufferException22.getThrownFromInputStream() ? 1 : 0);
        if (n3 != 0) {
            InvalidProtocolBufferException invalidProtocolBufferException3;
            invalidProtocolBufferException = invalidProtocolBufferException3 = new InvalidProtocolBufferException(invalidProtocolBufferException22);
        }
        throw invalidProtocolBufferException.setUnfinishedMessage(generatedMessageLite);
    }

    public static void registerDefaultInstance(Class clazz, GeneratedMessageLite generatedMessageLite) {
        generatedMessageLite.markImmutable();
        defaultInstanceMap.put(clazz, generatedMessageLite);
    }

    public Object buildMessageInfo() {
        GeneratedMessageLite$MethodToInvoke generatedMessageLite$MethodToInvoke = GeneratedMessageLite$MethodToInvoke.BUILD_MESSAGE_INFO;
        return this.dynamicMethod(generatedMessageLite$MethodToInvoke);
    }

    public void clearMemoizedHashCode() {
        this.memoizedHashCode = 0;
    }

    public void clearMemoizedSerializedSize() {
        this.setMemoizedSerializedSize(-1 >>> 1);
    }

    public int computeHashCode() {
        return Protobuf.getInstance().schemaFor(this).hashCode(this);
    }

    public final GeneratedMessageLite$Builder createBuilder() {
        GeneratedMessageLite$MethodToInvoke generatedMessageLite$MethodToInvoke = GeneratedMessageLite$MethodToInvoke.NEW_BUILDER;
        return (GeneratedMessageLite$Builder)this.dynamicMethod(generatedMessageLite$MethodToInvoke);
    }

    public final GeneratedMessageLite$Builder createBuilder(GeneratedMessageLite generatedMessageLite) {
        return this.createBuilder().mergeFrom(generatedMessageLite);
    }

    public Object dynamicMethod(GeneratedMessageLite$MethodToInvoke generatedMessageLite$MethodToInvoke) {
        return this.dynamicMethod(generatedMessageLite$MethodToInvoke, null, null);
    }

    public Object dynamicMethod(GeneratedMessageLite$MethodToInvoke generatedMessageLite$MethodToInvoke, Object object) {
        return this.dynamicMethod(generatedMessageLite$MethodToInvoke, object, null);
    }

    public abstract Object dynamicMethod(GeneratedMessageLite$MethodToInvoke var1, Object var2, Object var3);

    public boolean equals(Object object) {
        Class<?> clazz;
        if (this == object) {
            return true;
        }
        Schema schema = null;
        if (object == null) {
            return false;
        }
        Class<?> clazz2 = this.getClass();
        if (clazz2 != (clazz = object.getClass())) {
            return false;
        }
        schema = Protobuf.getInstance().schemaFor(this);
        object = (GeneratedMessageLite)object;
        return schema.equals(this, object);
    }

    public final GeneratedMessageLite getDefaultInstanceForType() {
        GeneratedMessageLite$MethodToInvoke generatedMessageLite$MethodToInvoke = GeneratedMessageLite$MethodToInvoke.GET_DEFAULT_INSTANCE;
        return (GeneratedMessageLite)this.dynamicMethod(generatedMessageLite$MethodToInvoke);
    }

    public int getMemoizedHashCode() {
        return this.memoizedHashCode;
    }

    public int getMemoizedSerializedSize() {
        return this.memoizedSerializedSize & -1 >>> 1;
    }

    public final Parser getParserForType() {
        GeneratedMessageLite$MethodToInvoke generatedMessageLite$MethodToInvoke = GeneratedMessageLite$MethodToInvoke.GET_PARSER;
        return (Parser)this.dynamicMethod(generatedMessageLite$MethodToInvoke);
    }

    public int getSerializedSize() {
        return this.getSerializedSize(null);
    }

    public int getSerializedSize(Schema object) {
        int n3;
        int n4 = this.isMutable();
        if (n4 != 0) {
            int n7 = this.computeSerializedSize((Schema)object);
            if (n7 >= 0) {
                return n7;
            }
            object = hj0_0.a(n7, "serialized size must be non-negative, was ");
            IllegalStateException illegalStateException = new IllegalStateException((String)object);
            throw illegalStateException;
        }
        n4 = this.getMemoizedSerializedSize();
        if (n4 != (n3 = -1 >>> 1)) {
            return this.getMemoizedSerializedSize();
        }
        int n8 = this.computeSerializedSize((Schema)object);
        this.setMemoizedSerializedSize(n8);
        return n8;
    }

    public int hashCode() {
        int n3 = this.isMutable();
        if (n3 != 0) {
            return this.computeHashCode();
        }
        n3 = this.hashCodeIsNotMemoized();
        if (n3 != 0) {
            n3 = this.computeHashCode();
            this.setMemoizedHashCode(n3);
        }
        return this.getMemoizedHashCode();
    }

    public boolean hashCodeIsNotMemoized() {
        int n3 = this.getMemoizedHashCode();
        n3 = n3 == 0 ? 1 : 0;
        return n3 != 0;
    }

    public final boolean isInitialized() {
        return GeneratedMessageLite.isInitialized(this, true);
    }

    /*
     * WARNING - void declaration
     */
    public boolean isMutable() {
        void var1_5;
        int bl2 = this.memoizedSerializedSize;
        int n3 = -1 << -1;
        int n4 = bl2 & n3;
        if (n4 != 0) {
            boolean bl3 = true;
        } else {
            boolean bl4 = false;
        }
        return (boolean)var1_5;
    }

    public void makeImmutable() {
        Protobuf.getInstance().schemaFor(this).makeImmutable(this);
        this.markImmutable();
    }

    public void markImmutable() {
        int n3;
        this.memoizedSerializedSize = n3 = this.memoizedSerializedSize & -1 >>> 1;
    }

    public void mergeLengthDelimitedField(int n3, ByteString byteString) {
        this.ensureUnknownFieldsInitialized();
        this.unknownFields.mergeLengthDelimitedField(n3, byteString);
    }

    public final void mergeUnknownFields(UnknownFieldSetLite unknownFieldSetLite) {
        this.unknownFields = unknownFieldSetLite = UnknownFieldSetLite.mutableCopyOf(this.unknownFields, unknownFieldSetLite);
    }

    public void mergeVarintField(int n3, int n4) {
        this.ensureUnknownFieldsInitialized();
        this.unknownFields.mergeVarintField(n3, n4);
    }

    public final GeneratedMessageLite$Builder newBuilderForType() {
        GeneratedMessageLite$MethodToInvoke generatedMessageLite$MethodToInvoke = GeneratedMessageLite$MethodToInvoke.NEW_BUILDER;
        return (GeneratedMessageLite$Builder)this.dynamicMethod(generatedMessageLite$MethodToInvoke);
    }

    public GeneratedMessageLite newMutableInstance() {
        GeneratedMessageLite$MethodToInvoke generatedMessageLite$MethodToInvoke = GeneratedMessageLite$MethodToInvoke.NEW_MUTABLE_INSTANCE;
        return (GeneratedMessageLite)this.dynamicMethod(generatedMessageLite$MethodToInvoke);
    }

    public boolean parseUnknownField(int n3, CodedInputStream codedInputStream) {
        int n4;
        int n7 = WireFormat.getTagWireType(n3);
        if (n7 == (n4 = 4)) {
            return false;
        }
        this.ensureUnknownFieldsInitialized();
        return this.unknownFields.mergeFieldFrom(n3, codedInputStream);
    }

    public void setMemoizedHashCode(int n3) {
        this.memoizedHashCode = n3;
    }

    public void setMemoizedSerializedSize(int n3) {
        if (n3 >= 0) {
            int n4 = this.memoizedSerializedSize & -1 << -1;
            this.memoizedSerializedSize = n3 = n3 & -1 >>> 1 | n4;
            return;
        }
        String string2 = hj0_0.a(n3, "serialized size must be non-negative, was ");
        IllegalStateException illegalStateException = new IllegalStateException(string2);
        throw illegalStateException;
    }

    public final GeneratedMessageLite$Builder toBuilder() {
        GeneratedMessageLite$MethodToInvoke generatedMessageLite$MethodToInvoke = GeneratedMessageLite$MethodToInvoke.NEW_BUILDER;
        return ((GeneratedMessageLite$Builder)this.dynamicMethod(generatedMessageLite$MethodToInvoke)).mergeFrom(this);
    }

    public String toString() {
        String string2 = super.toString();
        return MessageLiteToString.toString(this, string2);
    }

    public void writeTo(CodedOutputStream object) {
        Schema schema = Protobuf.getInstance().schemaFor(this);
        object = CodedOutputStreamWriter.forCodedOutput((CodedOutputStream)object);
        schema.writeTo(this, (Writer)object);
    }
}

