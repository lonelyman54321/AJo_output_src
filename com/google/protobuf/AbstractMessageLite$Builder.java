/*
 * Decompiled with CFR 0.152.
 */
package com.google.protobuf;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.AbstractMessageLite$Builder$LimitedInputStream;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.LazyStringList;
import com.google.protobuf.MessageLite;
import com.google.protobuf.MessageLite$Builder;
import com.google.protobuf.PrimitiveNonBoxingCollection;
import com.google.protobuf.UninitializedMessageException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public abstract class AbstractMessageLite$Builder
implements MessageLite$Builder {
    public static void addAll(Iterable iterable, Collection collection) {
        collection = (List)collection;
        AbstractMessageLite$Builder.addAll(iterable, (List)collection);
    }

    public static void addAll(Iterable object, List object2) {
        Internal.checkNotNull(object);
        boolean bl2 = object instanceof LazyStringList;
        if (bl2) {
            int n3;
            object = ((LazyStringList)object).getUnderlyingElements();
            List list = object2;
            list = (LazyStringList)object2;
            int n4 = object2.size();
            object = object.iterator();
            while ((n3 = object.hasNext()) != 0) {
                Object object3 = object.next();
                if (object3 == null) {
                    object = new StringBuilder("Element at index ");
                    n3 = list.size() - n4;
                    ((StringBuilder)object).append(n3);
                    object3 = " is null.";
                    ((StringBuilder)object).append((String)object3);
                    object = ((StringBuilder)object).toString();
                    for (n3 = list.size() + -1; n3 >= n4; n3 += -1) {
                        list.remove(n3);
                    }
                    object2 = new NullPointerException((String)object);
                    throw object2;
                }
                boolean bl3 = object3 instanceof ByteString;
                if (bl3) {
                    object3 = (ByteString)object3;
                    list.add((ByteString)object3);
                    continue;
                }
                object3 = (String)object3;
                list.add(object3);
            }
        } else {
            bl2 = object instanceof PrimitiveNonBoxingCollection;
            if (bl2) {
                object = (Collection)object;
                object2.addAll(object);
            } else {
                AbstractMessageLite$Builder.addAllCheckingNulls((Iterable)object, (List)object2);
            }
        }
    }

    private static void addAllCheckingNulls(Iterable object, List object2) {
        int n3;
        int n4 = object2 instanceof ArrayList;
        if (n4 != 0 && (n4 = object instanceof Collection) != 0) {
            List list = object2;
            list = (ArrayList)object2;
            n3 = object2.size();
            Object object3 = object;
            object3 = (Collection)object;
            int n7 = object3.size() + n3;
            ((ArrayList)list).ensureCapacity(n7);
        }
        n4 = object2.size();
        object = object.iterator();
        while ((n3 = object.hasNext()) != 0) {
            Object object4 = object.next();
            if (object4 == null) {
                object = new StringBuilder("Element at index ");
                n3 = object2.size() - n4;
                ((StringBuilder)object).append(n3);
                object4 = " is null.";
                ((StringBuilder)object).append((String)object4);
                object = ((StringBuilder)object).toString();
                for (n3 = object2.size() + -1; n3 >= n4; n3 += -1) {
                    object2.remove(n3);
                }
                object2 = new NullPointerException((String)object);
                throw object2;
            }
            object2.add(object4);
        }
    }

    private String getReadingExceptionMessage(String string2) {
        StringBuilder stringBuilder = new StringBuilder("Reading ");
        String string3 = this.getClass().getName();
        stringBuilder.append(string3);
        stringBuilder.append(" from a ");
        stringBuilder.append(string2);
        stringBuilder.append(" threw an IOException (should never happen).");
        return stringBuilder.toString();
    }

    public static UninitializedMessageException newUninitializedMessageException(MessageLite messageLite) {
        UninitializedMessageException uninitializedMessageException = new UninitializedMessageException(messageLite);
        return uninitializedMessageException;
    }

    public abstract AbstractMessageLite$Builder clone();

    public abstract AbstractMessageLite$Builder internalMergeFrom(AbstractMessageLite var1);

    public boolean mergeDelimitedFrom(InputStream inputStream) {
        ExtensionRegistryLite extensionRegistryLite = ExtensionRegistryLite.getEmptyRegistry();
        return this.mergeDelimitedFrom(inputStream, extensionRegistryLite);
    }

    public boolean mergeDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        int n3;
        int n4 = inputStream.read();
        if (n4 == (n3 = -1)) {
            return false;
        }
        n4 = CodedInputStream.readRawVarint32(n4, inputStream);
        AbstractMessageLite$Builder$LimitedInputStream abstractMessageLite$Builder$LimitedInputStream = new AbstractMessageLite$Builder$LimitedInputStream(inputStream, n4);
        this.mergeFrom(abstractMessageLite$Builder$LimitedInputStream, extensionRegistryLite);
        return true;
    }

    public AbstractMessageLite$Builder mergeFrom(ByteString object) {
        InvalidProtocolBufferException invalidProtocolBufferException2;
        block6: {
            object = ((ByteString)object).newCodedInput();
            this.mergeFrom((CodedInputStream)object);
            RuntimeException runtimeException = null;
            try {
                ((CodedInputStream)object).checkLastTagWas(0);
                return this;
            }
            catch (IOException iOException) {
            }
            catch (InvalidProtocolBufferException invalidProtocolBufferException2) {
                break block6;
            }
            String string2 = this.getReadingExceptionMessage("ByteString");
            runtimeException = new RuntimeException(string2, iOException);
            throw runtimeException;
        }
        throw invalidProtocolBufferException2;
    }

    public AbstractMessageLite$Builder mergeFrom(ByteString object, ExtensionRegistryLite object2) {
        InvalidProtocolBufferException invalidProtocolBufferException2;
        block6: {
            object = ((ByteString)object).newCodedInput();
            this.mergeFrom((CodedInputStream)object, (ExtensionRegistryLite)object2);
            object2 = null;
            try {
                ((CodedInputStream)object).checkLastTagWas(0);
                return this;
            }
            catch (IOException iOException) {
            }
            catch (InvalidProtocolBufferException invalidProtocolBufferException2) {
                break block6;
            }
            String string2 = this.getReadingExceptionMessage("ByteString");
            object2 = new RuntimeException(string2, iOException);
            throw object2;
        }
        throw invalidProtocolBufferException2;
    }

    public AbstractMessageLite$Builder mergeFrom(CodedInputStream codedInputStream) {
        ExtensionRegistryLite extensionRegistryLite = ExtensionRegistryLite.getEmptyRegistry();
        return this.mergeFrom(codedInputStream, extensionRegistryLite);
    }

    public abstract AbstractMessageLite$Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2);

    public AbstractMessageLite$Builder mergeFrom(MessageLite object) {
        Class<?> clazz = this.getDefaultInstanceForType().getClass();
        boolean bl2 = clazz.isInstance(object);
        if (bl2) {
            object = (AbstractMessageLite)object;
            return this.internalMergeFrom((AbstractMessageLite)object);
        }
        object = new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
        throw object;
    }

    public AbstractMessageLite$Builder mergeFrom(InputStream object) {
        object = CodedInputStream.newInstance((InputStream)object);
        this.mergeFrom((CodedInputStream)object);
        ((CodedInputStream)object).checkLastTagWas(0);
        return this;
    }

    public AbstractMessageLite$Builder mergeFrom(InputStream object, ExtensionRegistryLite extensionRegistryLite) {
        object = CodedInputStream.newInstance((InputStream)object);
        this.mergeFrom((CodedInputStream)object, extensionRegistryLite);
        ((CodedInputStream)object).checkLastTagWas(0);
        return this;
    }

    public AbstractMessageLite$Builder mergeFrom(byte[] byArray) {
        int n3 = byArray.length;
        return this.mergeFrom(byArray, 0, n3);
    }

    public AbstractMessageLite$Builder mergeFrom(byte[] object, int n3, int n4) {
        InvalidProtocolBufferException invalidProtocolBufferException2;
        block6: {
            object = CodedInputStream.newInstance((byte[])object, n3, n4);
            this.mergeFrom((CodedInputStream)object);
            n3 = 0;
            RuntimeException runtimeException = null;
            try {
                ((CodedInputStream)object).checkLastTagWas(0);
                return this;
            }
            catch (IOException iOException) {
            }
            catch (InvalidProtocolBufferException invalidProtocolBufferException2) {
                break block6;
            }
            String string2 = this.getReadingExceptionMessage("byte array");
            runtimeException = new RuntimeException(string2, iOException);
            throw runtimeException;
        }
        throw invalidProtocolBufferException2;
    }

    public AbstractMessageLite$Builder mergeFrom(byte[] object, int n3, int n4, ExtensionRegistryLite extensionRegistryLite) {
        InvalidProtocolBufferException invalidProtocolBufferException2;
        block6: {
            object = CodedInputStream.newInstance((byte[])object, n3, n4);
            this.mergeFrom((CodedInputStream)object, extensionRegistryLite);
            n3 = 0;
            RuntimeException runtimeException = null;
            try {
                ((CodedInputStream)object).checkLastTagWas(0);
                return this;
            }
            catch (IOException iOException) {
            }
            catch (InvalidProtocolBufferException invalidProtocolBufferException2) {
                break block6;
            }
            String string2 = this.getReadingExceptionMessage("byte array");
            runtimeException = new RuntimeException(string2, iOException);
            throw runtimeException;
        }
        throw invalidProtocolBufferException2;
    }

    public AbstractMessageLite$Builder mergeFrom(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        int n3 = byArray.length;
        return this.mergeFrom(byArray, 0, n3, extensionRegistryLite);
    }
}

