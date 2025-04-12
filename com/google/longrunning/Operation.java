/*
 * Decompiled with CFR 0.152.
 */
package com.google.longrunning;

import com.google.longrunning.Operation$1;
import com.google.longrunning.Operation$Builder;
import com.google.longrunning.Operation$ResultCase;
import com.google.longrunning.OperationOrBuilder;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.Any;
import com.google.protobuf.Any$Builder;
import com.google.protobuf.AnyOrBuilder;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.google.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser;
import com.google.protobuf.GeneratedMessageLite$MethodToInvoke;
import com.google.protobuf.Parser;
import com.google.rpc.Status;
import com.google.rpc.Status$Builder;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class Operation
extends GeneratedMessageLite
implements OperationOrBuilder {
    private static final Operation DEFAULT_INSTANCE;
    public static final int DONE_FIELD_NUMBER = 3;
    public static final int ERROR_FIELD_NUMBER = 4;
    public static final int METADATA_FIELD_NUMBER = 2;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile Parser PARSER;
    public static final int RESPONSE_FIELD_NUMBER = 5;
    private boolean done_;
    private Any metadata_;
    private String name_ = "";
    private int resultCase_ = 0;
    private Object result_;

    static {
        Operation operation;
        DEFAULT_INSTANCE = operation = new Operation();
        GeneratedMessageLite.registerDefaultInstance(Operation.class, operation);
    }

    private Operation() {
    }

    public static /* synthetic */ Operation access$000() {
        return DEFAULT_INSTANCE;
    }

    public static /* synthetic */ void access$100(Operation operation) {
        operation.clearResult();
    }

    public static /* synthetic */ void access$1000(Operation operation, Status status) {
        operation.setError(status);
    }

    public static /* synthetic */ void access$1100(Operation operation, Status status) {
        operation.mergeError(status);
    }

    public static /* synthetic */ void access$1200(Operation operation) {
        operation.clearError();
    }

    public static /* synthetic */ void access$1300(Operation operation, Any any) {
        operation.setResponse(any);
    }

    public static /* synthetic */ void access$1400(Operation operation, Any any) {
        operation.mergeResponse(any);
    }

    public static /* synthetic */ void access$1500(Operation operation) {
        operation.clearResponse();
    }

    public static /* synthetic */ void access$200(Operation operation, String string2) {
        operation.setName(string2);
    }

    public static /* synthetic */ void access$300(Operation operation) {
        operation.clearName();
    }

    public static /* synthetic */ void access$400(Operation operation, ByteString byteString) {
        operation.setNameBytes(byteString);
    }

    public static /* synthetic */ void access$500(Operation operation, Any any) {
        operation.setMetadata(any);
    }

    public static /* synthetic */ void access$600(Operation operation, Any any) {
        operation.mergeMetadata(any);
    }

    public static /* synthetic */ void access$700(Operation operation) {
        operation.clearMetadata();
    }

    public static /* synthetic */ void access$800(Operation operation, boolean bl2) {
        operation.setDone(bl2);
    }

    public static /* synthetic */ void access$900(Operation operation) {
        operation.clearDone();
    }

    private void clearDone() {
        this.done_ = false;
    }

    private void clearError() {
        int n3 = this.resultCase_;
        int n4 = 4;
        if (n3 == n4) {
            this.resultCase_ = 0;
            n3 = 0;
            this.result_ = null;
        }
    }

    private void clearMetadata() {
        this.metadata_ = null;
    }

    private void clearName() {
        String string2;
        this.name_ = string2 = Operation.getDefaultInstance().getName();
    }

    private void clearResponse() {
        int n3 = this.resultCase_;
        int n4 = 5;
        if (n3 == n4) {
            this.resultCase_ = 0;
            n3 = 0;
            this.result_ = null;
        }
    }

    private void clearResult() {
        this.resultCase_ = 0;
        this.result_ = null;
    }

    public static Operation getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private void mergeError(Status generatedMessageLite) {
        Status status;
        Object object;
        generatedMessageLite.getClass();
        int n3 = this.resultCase_;
        int n4 = 4;
        if (n3 == n4 && (object = this.result_) != (status = Status.getDefaultInstance())) {
            object = Status.newBuilder((Status)this.result_);
            generatedMessageLite = ((Status$Builder)((GeneratedMessageLite$Builder)object).mergeFrom(generatedMessageLite)).buildPartial();
            this.result_ = generatedMessageLite;
        } else {
            this.result_ = generatedMessageLite;
        }
        this.resultCase_ = n4;
    }

    private void mergeMetadata(Any any) {
        Any any2;
        any.getClass();
        AnyOrBuilder anyOrBuilder = this.metadata_;
        if (anyOrBuilder != null && anyOrBuilder != (any2 = Any.getDefaultInstance())) {
            anyOrBuilder = Any.newBuilder(this.metadata_);
            this.metadata_ = any = (Any)((Any$Builder)((GeneratedMessageLite$Builder)((Object)anyOrBuilder)).mergeFrom(any)).buildPartial();
        } else {
            this.metadata_ = any;
        }
    }

    private void mergeResponse(Any generatedMessageLite) {
        Any any;
        Object object;
        generatedMessageLite.getClass();
        int n3 = this.resultCase_;
        int n4 = 5;
        if (n3 == n4 && (object = this.result_) != (any = Any.getDefaultInstance())) {
            object = Any.newBuilder((Any)this.result_);
            generatedMessageLite = ((Any$Builder)((GeneratedMessageLite$Builder)object).mergeFrom(generatedMessageLite)).buildPartial();
            this.result_ = generatedMessageLite;
        } else {
            this.result_ = generatedMessageLite;
        }
        this.resultCase_ = n4;
    }

    public static Operation$Builder newBuilder() {
        return (Operation$Builder)DEFAULT_INSTANCE.createBuilder();
    }

    public static Operation$Builder newBuilder(Operation operation) {
        return (Operation$Builder)DEFAULT_INSTANCE.createBuilder(operation);
    }

    public static Operation parseDelimitedFrom(InputStream inputStream) {
        return (Operation)GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Operation parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Operation)GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Operation parseFrom(ByteString byteString) {
        return (Operation)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteString);
    }

    public static Operation parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (Operation)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Operation parseFrom(CodedInputStream codedInputStream) {
        return (Operation)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, codedInputStream);
    }

    public static Operation parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Operation)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static Operation parseFrom(InputStream inputStream) {
        return (Operation)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, inputStream);
    }

    public static Operation parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Operation)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Operation parseFrom(ByteBuffer byteBuffer) {
        return (Operation)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteBuffer);
    }

    public static Operation parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (Operation)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Operation parseFrom(byte[] byArray) {
        return (Operation)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byArray);
    }

    public static Operation parseFrom(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (Operation)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byArray, extensionRegistryLite);
    }

    public static Parser parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setDone(boolean bl2) {
        this.done_ = bl2;
    }

    private void setError(Status status) {
        status.getClass();
        this.result_ = status;
        this.resultCase_ = 4;
    }

    private void setMetadata(Any any) {
        any.getClass();
        this.metadata_ = any;
    }

    private void setName(String string2) {
        string2.getClass();
        this.name_ = string2;
    }

    private void setNameBytes(ByteString object) {
        AbstractMessageLite.checkByteStringIsUtf8((ByteString)object);
        this.name_ = object = ((ByteString)object).toStringUtf8();
    }

    private void setResponse(Any any) {
        any.getClass();
        this.result_ = any;
        this.resultCase_ = 5;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke objectArray, Object clazz, Object object) {
        byte by2 = 1;
        object = Operation$1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke;
        Object object2 = objectArray.ordinal();
        object2 = object[object2];
        object = null;
        switch (object2) {
            default: {
                objectArray = new UnsupportedOperationException();
                throw objectArray;
            }
            case 7: {
                return null;
            }
            case 6: {
                return by2;
            }
            case 5: {
                objectArray = PARSER;
                if (objectArray != null) return objectArray;
                clazz = Operation.class;
                synchronized (clazz) {
                    try {
                        objectArray = PARSER;
                        if (objectArray != null) return objectArray;
                        object = DEFAULT_INSTANCE;
                        PARSER = objectArray = new GeneratedMessageLite$DefaultInstanceBasedParser((GeneratedMessageLite)object);
                        return objectArray;
                    }
                    catch (Throwable throwable) {}
                    throw throwable;
                }
            }
            case 4: {
                return DEFAULT_INSTANCE;
            }
            case 3: {
                objectArray = new Object[7];
                objectArray[0] = "result_";
                objectArray[by2] = "resultCase_";
                objectArray[2] = "name_";
                objectArray[3] = "metadata_";
                objectArray[4] = "done_";
                objectArray[5] = Status.class;
                objectArray[6] = Any.class;
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0001\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001\u0208\u0002\t\u0003\u0007\u0004<\u0000\u0005<\u0000", objectArray);
            }
            case 2: {
                return new Operation$Builder(null);
            }
            case 1: 
        }
        return new Operation();
    }

    public boolean getDone() {
        return this.done_;
    }

    public Status getError() {
        int n3 = this.resultCase_;
        int n4 = 4;
        if (n3 == n4) {
            return (Status)this.result_;
        }
        return Status.getDefaultInstance();
    }

    public Any getMetadata() {
        Any any = this.metadata_;
        if (any == null) {
            any = Any.getDefaultInstance();
        }
        return any;
    }

    public String getName() {
        return this.name_;
    }

    public ByteString getNameBytes() {
        return ByteString.copyFromUtf8(this.name_);
    }

    public Any getResponse() {
        int n3 = this.resultCase_;
        int n4 = 5;
        if (n3 == n4) {
            return (Any)this.result_;
        }
        return Any.getDefaultInstance();
    }

    public Operation$ResultCase getResultCase() {
        return Operation$ResultCase.forNumber(this.resultCase_);
    }

    public boolean hasError() {
        int n3 = this.resultCase_;
        int n4 = 4;
        n3 = n3 == n4 ? 1 : 0;
        return n3 != 0;
    }

    public boolean hasMetadata() {
        boolean bl2;
        Any any = this.metadata_;
        if (any != null) {
            bl2 = true;
        } else {
            bl2 = false;
            any = null;
        }
        return bl2;
    }

    public boolean hasResponse() {
        int n3 = this.resultCase_;
        int n4 = 5;
        n3 = n3 == n4 ? 1 : 0;
        return n3 != 0;
    }
}

