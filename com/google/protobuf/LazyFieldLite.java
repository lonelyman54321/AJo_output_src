/*
 * Decompiled with CFR 0.152.
 */
package com.google.protobuf;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLite;
import com.google.protobuf.MessageLite$Builder;
import com.google.protobuf.Writer;

public class LazyFieldLite {
    private static final ExtensionRegistryLite EMPTY_REGISTRY = ExtensionRegistryLite.getEmptyRegistry();
    private ByteString delayedBytes;
    private ExtensionRegistryLite extensionRegistry;
    private volatile ByteString memoizedBytes;
    protected volatile MessageLite value;

    public LazyFieldLite() {
    }

    public LazyFieldLite(ExtensionRegistryLite extensionRegistryLite, ByteString byteString) {
        LazyFieldLite.checkArguments(extensionRegistryLite, byteString);
        this.extensionRegistry = extensionRegistryLite;
        this.delayedBytes = byteString;
    }

    private static void checkArguments(ExtensionRegistryLite object, ByteString byteString) {
        if (object != null) {
            if (byteString != null) {
                return;
            }
            object = new NullPointerException("found null ByteString");
            throw object;
        }
        object = new NullPointerException("found null ExtensionRegistry");
        throw object;
    }

    public static LazyFieldLite fromValue(MessageLite messageLite) {
        LazyFieldLite lazyFieldLite = new LazyFieldLite();
        lazyFieldLite.setValue(messageLite);
        return lazyFieldLite;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static MessageLite mergeValueAndBytes(MessageLite messageLite, ByteString object, ExtensionRegistryLite extensionRegistryLite) {
        MessageLite$Builder messageLite$Builder;
        try {
            messageLite$Builder = messageLite.toBuilder();
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            return messageLite;
        }
        object = messageLite$Builder.mergeFrom((ByteString)object, extensionRegistryLite);
        return object.build();
    }

    public void clear() {
        this.delayedBytes = null;
        this.value = null;
        this.memoizedBytes = null;
    }

    public boolean containsDefaultInstance() {
        boolean bl2;
        Object object = this.memoizedBytes;
        ByteString byteString = ByteString.EMPTY;
        if (object != byteString && ((object = this.value) != null || (object = this.delayedBytes) != null && object != byteString)) {
            bl2 = false;
            object = null;
        } else {
            bl2 = true;
        }
        return bl2;
    }

    /*
     * Exception decompiling
     */
    public void ensureInitialized(MessageLite var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 2[TRYBLOCK] [3, 2 : 28->32)] java.lang.Throwable
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op02WithProcessedDataAndRefs.insertExceptionBlocks(Op02WithProcessedDataAndRefs.java:2283)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:415)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        boolean bl2 = object instanceof LazyFieldLite;
        if (!bl2) {
            return false;
        }
        object = (LazyFieldLite)object;
        Object object2 = this.value;
        MessageLite messageLite = ((LazyFieldLite)object).value;
        if (object2 == null && messageLite == null) {
            object2 = this.toByteString();
            object = ((LazyFieldLite)object).toByteString();
            return ((ByteString)object2).equals(object);
        }
        if (object2 != null && messageLite != null) {
            return object2.equals(messageLite);
        }
        if (object2 != null) {
            messageLite = object2.getDefaultInstanceForType();
            object = ((LazyFieldLite)object).getValue(messageLite);
            return object2.equals(object);
        }
        object = messageLite.getDefaultInstanceForType();
        return this.getValue((MessageLite)object).equals(messageLite);
    }

    public int getSerializedSize() {
        Object object = this.memoizedBytes;
        if (object != null) {
            return this.memoizedBytes.size();
        }
        object = this.delayedBytes;
        if (object != null) {
            return ((ByteString)object).size();
        }
        object = this.value;
        if (object != null) {
            return this.value.getSerializedSize();
        }
        return 0;
    }

    public MessageLite getValue(MessageLite messageLite) {
        this.ensureInitialized(messageLite);
        return this.value;
    }

    public int hashCode() {
        return 1;
    }

    public void merge(LazyFieldLite object) {
        Object object2;
        boolean bl2 = ((LazyFieldLite)object).containsDefaultInstance();
        if (bl2) {
            return;
        }
        bl2 = this.containsDefaultInstance();
        if (bl2) {
            this.set((LazyFieldLite)object);
            return;
        }
        Object object3 = this.extensionRegistry;
        if (object3 == null) {
            this.extensionRegistry = object3 = ((LazyFieldLite)object).extensionRegistry;
        }
        if ((object3 = this.delayedBytes) != null && (object2 = ((LazyFieldLite)object).delayedBytes) != null) {
            this.delayedBytes = object = ((ByteString)object3).concat((ByteString)object2);
            return;
        }
        object3 = this.value;
        if (object3 == null && (object3 = ((LazyFieldLite)object).value) != null) {
            object = ((LazyFieldLite)object).value;
            object3 = this.delayedBytes;
            object2 = this.extensionRegistry;
            object = LazyFieldLite.mergeValueAndBytes((MessageLite)object, (ByteString)object3, (ExtensionRegistryLite)object2);
            this.setValue((MessageLite)object);
            return;
        }
        object3 = this.value;
        if (object3 != null && (object3 = ((LazyFieldLite)object).value) == null) {
            object3 = this.value;
            object2 = ((LazyFieldLite)object).delayedBytes;
            object = ((LazyFieldLite)object).extensionRegistry;
            object = LazyFieldLite.mergeValueAndBytes((MessageLite)object3, (ByteString)object2, (ExtensionRegistryLite)object);
            this.setValue((MessageLite)object);
            return;
        }
        object3 = this.value.toBuilder();
        object = ((LazyFieldLite)object).value;
        object = object3.mergeFrom((MessageLite)object).build();
        this.setValue((MessageLite)object);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public void mergeFrom(CodedInputStream object, ExtensionRegistryLite extensionRegistryLite) {
        boolean bl2 = this.containsDefaultInstance();
        if (bl2) {
            object = ((CodedInputStream)object).readBytes();
            this.setByteString((ByteString)object, extensionRegistryLite);
            return;
        }
        Object object2 = this.extensionRegistry;
        if (object2 == null) {
            this.extensionRegistry = extensionRegistryLite;
        }
        if ((object2 = this.delayedBytes) != null) {
            object = ((CodedInputStream)object).readBytes();
            object = ((ByteString)object2).concat((ByteString)object);
            extensionRegistryLite = this.extensionRegistry;
            this.setByteString((ByteString)object, extensionRegistryLite);
            return;
        }
        try {
            object2 = this.value;
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            return;
        }
        object2 = object2.toBuilder();
        object = object2.mergeFrom((CodedInputStream)object, extensionRegistryLite);
        object = object.build();
        this.setValue((MessageLite)object);
    }

    public void set(LazyFieldLite object) {
        Object object2 = ((LazyFieldLite)object).delayedBytes;
        this.delayedBytes = object2;
        this.value = object2 = ((LazyFieldLite)object).value;
        this.memoizedBytes = object2 = ((LazyFieldLite)object).memoizedBytes;
        object = ((LazyFieldLite)object).extensionRegistry;
        if (object != null) {
            this.extensionRegistry = object;
        }
    }

    public void setByteString(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        LazyFieldLite.checkArguments(extensionRegistryLite, byteString);
        this.delayedBytes = byteString;
        this.extensionRegistry = extensionRegistryLite;
        this.value = null;
        this.memoizedBytes = null;
    }

    public MessageLite setValue(MessageLite messageLite) {
        MessageLite messageLite2 = this.value;
        this.delayedBytes = null;
        this.memoizedBytes = null;
        this.value = messageLite;
        return messageLite2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public ByteString toByteString() {
        Object object = this.memoizedBytes;
        if (object != null) {
            return this.memoizedBytes;
        }
        object = this.delayedBytes;
        if (object != null) {
            return object;
        }
        synchronized (this) {
            Throwable throwable2;
            block8: {
                try {
                    object = this.memoizedBytes;
                    if (object != null) {
                        return this.memoizedBytes;
                    }
                }
                catch (Throwable throwable2) {
                    break block8;
                }
                object = this.value;
                if (object == null) {
                    this.memoizedBytes = object = ByteString.EMPTY;
                    return this.memoizedBytes;
                } else {
                    object = this.value;
                    this.memoizedBytes = object = object.toByteString();
                }
                return this.memoizedBytes;
            }
            throw throwable2;
        }
    }

    public void writeTo(Writer writer, int n3) {
        Object object = this.memoizedBytes;
        if (object != null) {
            object = this.memoizedBytes;
            writer.writeBytes(n3, (ByteString)object);
        } else {
            object = this.delayedBytes;
            if (object != null) {
                writer.writeBytes(n3, (ByteString)object);
            } else {
                object = this.value;
                if (object != null) {
                    object = this.value;
                    writer.writeMessage(n3, object);
                } else {
                    object = ByteString.EMPTY;
                    writer.writeBytes(n3, (ByteString)object);
                }
            }
        }
    }
}

