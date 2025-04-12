/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.perf.v1;

import com.google.firebase.perf.v1.PerfSession;
import com.google.firebase.perf.v1.PerfSessionOrBuilder;
import com.google.firebase.perf.v1.TraceMetric$1;
import com.google.firebase.perf.v1.TraceMetric$Builder;
import com.google.firebase.perf.v1.TraceMetric$CountersDefaultEntryHolder;
import com.google.firebase.perf.v1.TraceMetric$CustomAttributesDefaultEntryHolder;
import com.google.firebase.perf.v1.TraceMetricOrBuilder;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser;
import com.google.protobuf.GeneratedMessageLite$MethodToInvoke;
import com.google.protobuf.Internal$ProtobufList;
import com.google.protobuf.MapFieldLite;
import com.google.protobuf.Parser;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.AbstractMap;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public final class TraceMetric
extends GeneratedMessageLite
implements TraceMetricOrBuilder {
    public static final int CLIENT_START_TIME_US_FIELD_NUMBER = 4;
    public static final int COUNTERS_FIELD_NUMBER = 6;
    public static final int CUSTOM_ATTRIBUTES_FIELD_NUMBER = 8;
    private static final TraceMetric DEFAULT_INSTANCE;
    public static final int DURATION_US_FIELD_NUMBER = 5;
    public static final int IS_AUTO_FIELD_NUMBER = 2;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile Parser PARSER;
    public static final int PERF_SESSIONS_FIELD_NUMBER = 9;
    public static final int SUBTRACES_FIELD_NUMBER = 7;
    private int bitField0_;
    private long clientStartTimeUs_;
    private MapFieldLite counters_;
    private MapFieldLite customAttributes_;
    private long durationUs_;
    private boolean isAuto_;
    private String name_;
    private Internal$ProtobufList perfSessions_;
    private Internal$ProtobufList subtraces_;

    static {
        TraceMetric traceMetric;
        DEFAULT_INSTANCE = traceMetric = new TraceMetric();
        GeneratedMessageLite.registerDefaultInstance(TraceMetric.class, traceMetric);
    }

    private TraceMetric() {
        Object object = MapFieldLite.emptyMapField();
        this.counters_ = object;
        object = MapFieldLite.emptyMapField();
        this.customAttributes_ = object;
        this.name_ = "";
        this.subtraces_ = object = GeneratedMessageLite.emptyProtobufList();
        this.perfSessions_ = object = GeneratedMessageLite.emptyProtobufList();
    }

    public static /* synthetic */ TraceMetric access$000() {
        return DEFAULT_INSTANCE;
    }

    public static /* synthetic */ void access$100(TraceMetric traceMetric, String string2) {
        traceMetric.setName(string2);
    }

    public static /* synthetic */ Map access$1000(TraceMetric traceMetric) {
        return traceMetric.getMutableCountersMap();
    }

    public static /* synthetic */ void access$1100(TraceMetric traceMetric, int n3, TraceMetric traceMetric2) {
        traceMetric.setSubtraces(n3, traceMetric2);
    }

    public static /* synthetic */ void access$1200(TraceMetric traceMetric, TraceMetric traceMetric2) {
        traceMetric.addSubtraces(traceMetric2);
    }

    public static /* synthetic */ void access$1300(TraceMetric traceMetric, int n3, TraceMetric traceMetric2) {
        traceMetric.addSubtraces(n3, traceMetric2);
    }

    public static /* synthetic */ void access$1400(TraceMetric traceMetric, Iterable iterable) {
        traceMetric.addAllSubtraces(iterable);
    }

    public static /* synthetic */ void access$1500(TraceMetric traceMetric) {
        traceMetric.clearSubtraces();
    }

    public static /* synthetic */ void access$1600(TraceMetric traceMetric, int n3) {
        traceMetric.removeSubtraces(n3);
    }

    public static /* synthetic */ Map access$1700(TraceMetric traceMetric) {
        return traceMetric.getMutableCustomAttributesMap();
    }

    public static /* synthetic */ void access$1800(TraceMetric traceMetric, int n3, PerfSession perfSession) {
        traceMetric.setPerfSessions(n3, perfSession);
    }

    public static /* synthetic */ void access$1900(TraceMetric traceMetric, PerfSession perfSession) {
        traceMetric.addPerfSessions(perfSession);
    }

    public static /* synthetic */ void access$200(TraceMetric traceMetric) {
        traceMetric.clearName();
    }

    public static /* synthetic */ void access$2000(TraceMetric traceMetric, int n3, PerfSession perfSession) {
        traceMetric.addPerfSessions(n3, perfSession);
    }

    public static /* synthetic */ void access$2100(TraceMetric traceMetric, Iterable iterable) {
        traceMetric.addAllPerfSessions(iterable);
    }

    public static /* synthetic */ void access$2200(TraceMetric traceMetric) {
        traceMetric.clearPerfSessions();
    }

    public static /* synthetic */ void access$2300(TraceMetric traceMetric, int n3) {
        traceMetric.removePerfSessions(n3);
    }

    public static /* synthetic */ void access$300(TraceMetric traceMetric, ByteString byteString) {
        traceMetric.setNameBytes(byteString);
    }

    public static /* synthetic */ void access$400(TraceMetric traceMetric, boolean bl2) {
        traceMetric.setIsAuto(bl2);
    }

    public static /* synthetic */ void access$500(TraceMetric traceMetric) {
        traceMetric.clearIsAuto();
    }

    public static /* synthetic */ void access$600(TraceMetric traceMetric, long l2) {
        traceMetric.setClientStartTimeUs(l2);
    }

    public static /* synthetic */ void access$700(TraceMetric traceMetric) {
        traceMetric.clearClientStartTimeUs();
    }

    public static /* synthetic */ void access$800(TraceMetric traceMetric, long l2) {
        traceMetric.setDurationUs(l2);
    }

    public static /* synthetic */ void access$900(TraceMetric traceMetric) {
        traceMetric.clearDurationUs();
    }

    private void addAllPerfSessions(Iterable iterable) {
        this.ensurePerfSessionsIsMutable();
        Internal$ProtobufList internal$ProtobufList = this.perfSessions_;
        AbstractMessageLite.addAll(iterable, internal$ProtobufList);
    }

    private void addAllSubtraces(Iterable iterable) {
        this.ensureSubtracesIsMutable();
        Internal$ProtobufList internal$ProtobufList = this.subtraces_;
        AbstractMessageLite.addAll(iterable, internal$ProtobufList);
    }

    private void addPerfSessions(int n3, PerfSession perfSession) {
        perfSession.getClass();
        this.ensurePerfSessionsIsMutable();
        this.perfSessions_.add(n3, perfSession);
    }

    private void addPerfSessions(PerfSession perfSession) {
        perfSession.getClass();
        this.ensurePerfSessionsIsMutable();
        this.perfSessions_.add(perfSession);
    }

    private void addSubtraces(int n3, TraceMetric traceMetric) {
        traceMetric.getClass();
        this.ensureSubtracesIsMutable();
        this.subtraces_.add(n3, traceMetric);
    }

    private void addSubtraces(TraceMetric traceMetric) {
        traceMetric.getClass();
        this.ensureSubtracesIsMutable();
        this.subtraces_.add(traceMetric);
    }

    private void clearClientStartTimeUs() {
        int n3;
        this.bitField0_ = n3 = this.bitField0_ & 0xFFFFFFFB;
        this.clientStartTimeUs_ = 0L;
    }

    private void clearDurationUs() {
        int n3;
        this.bitField0_ = n3 = this.bitField0_ & 0xFFFFFFF7;
        this.durationUs_ = 0L;
    }

    private void clearIsAuto() {
        int n3;
        this.bitField0_ = n3 = this.bitField0_ & 0xFFFFFFFD;
        this.isAuto_ = false;
    }

    private void clearName() {
        String string2;
        int n3;
        this.bitField0_ = n3 = this.bitField0_ & 0xFFFFFFFE;
        this.name_ = string2 = TraceMetric.getDefaultInstance().getName();
    }

    private void clearPerfSessions() {
        Internal$ProtobufList internal$ProtobufList;
        this.perfSessions_ = internal$ProtobufList = GeneratedMessageLite.emptyProtobufList();
    }

    private void clearSubtraces() {
        Internal$ProtobufList internal$ProtobufList;
        this.subtraces_ = internal$ProtobufList = GeneratedMessageLite.emptyProtobufList();
    }

    private void ensurePerfSessionsIsMutable() {
        Internal$ProtobufList internal$ProtobufList = this.perfSessions_;
        boolean bl2 = internal$ProtobufList.isModifiable();
        if (!bl2) {
            this.perfSessions_ = internal$ProtobufList = GeneratedMessageLite.mutableCopy(internal$ProtobufList);
        }
    }

    private void ensureSubtracesIsMutable() {
        Internal$ProtobufList internal$ProtobufList = this.subtraces_;
        boolean bl2 = internal$ProtobufList.isModifiable();
        if (!bl2) {
            this.subtraces_ = internal$ProtobufList = GeneratedMessageLite.mutableCopy(internal$ProtobufList);
        }
    }

    public static TraceMetric getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private Map getMutableCountersMap() {
        return this.internalGetMutableCounters();
    }

    private Map getMutableCustomAttributesMap() {
        return this.internalGetMutableCustomAttributes();
    }

    private MapFieldLite internalGetCounters() {
        return this.counters_;
    }

    private MapFieldLite internalGetCustomAttributes() {
        return this.customAttributes_;
    }

    private MapFieldLite internalGetMutableCounters() {
        MapFieldLite mapFieldLite = this.counters_;
        boolean bl2 = mapFieldLite.isMutable();
        if (!bl2) {
            this.counters_ = mapFieldLite = this.counters_.mutableCopy();
        }
        return this.counters_;
    }

    private MapFieldLite internalGetMutableCustomAttributes() {
        MapFieldLite mapFieldLite = this.customAttributes_;
        boolean bl2 = mapFieldLite.isMutable();
        if (!bl2) {
            this.customAttributes_ = mapFieldLite = this.customAttributes_.mutableCopy();
        }
        return this.customAttributes_;
    }

    public static TraceMetric$Builder newBuilder() {
        return (TraceMetric$Builder)DEFAULT_INSTANCE.createBuilder();
    }

    public static TraceMetric$Builder newBuilder(TraceMetric traceMetric) {
        return (TraceMetric$Builder)DEFAULT_INSTANCE.createBuilder(traceMetric);
    }

    public static TraceMetric parseDelimitedFrom(InputStream inputStream) {
        return (TraceMetric)GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static TraceMetric parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (TraceMetric)GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static TraceMetric parseFrom(ByteString byteString) {
        return (TraceMetric)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteString);
    }

    public static TraceMetric parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (TraceMetric)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static TraceMetric parseFrom(CodedInputStream codedInputStream) {
        return (TraceMetric)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, codedInputStream);
    }

    public static TraceMetric parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (TraceMetric)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static TraceMetric parseFrom(InputStream inputStream) {
        return (TraceMetric)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, inputStream);
    }

    public static TraceMetric parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (TraceMetric)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static TraceMetric parseFrom(ByteBuffer byteBuffer) {
        return (TraceMetric)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteBuffer);
    }

    public static TraceMetric parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (TraceMetric)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static TraceMetric parseFrom(byte[] byArray) {
        return (TraceMetric)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byArray);
    }

    public static TraceMetric parseFrom(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (TraceMetric)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byArray, extensionRegistryLite);
    }

    public static Parser parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void removePerfSessions(int n3) {
        this.ensurePerfSessionsIsMutable();
        this.perfSessions_.remove(n3);
    }

    private void removeSubtraces(int n3) {
        this.ensureSubtracesIsMutable();
        this.subtraces_.remove(n3);
    }

    private void setClientStartTimeUs(long l2) {
        int n3;
        this.bitField0_ = n3 = this.bitField0_ | 4;
        this.clientStartTimeUs_ = l2;
    }

    private void setDurationUs(long l2) {
        int n3;
        this.bitField0_ = n3 = this.bitField0_ | 8;
        this.durationUs_ = l2;
    }

    private void setIsAuto(boolean bl2) {
        int n3;
        this.bitField0_ = n3 = this.bitField0_ | 2;
        this.isAuto_ = bl2;
    }

    private void setName(String string2) {
        int n3;
        string2.getClass();
        this.bitField0_ = n3 = this.bitField0_ | 1;
        this.name_ = string2;
    }

    private void setNameBytes(ByteString object) {
        int n3;
        this.name_ = object = ((ByteString)object).toStringUtf8();
        this.bitField0_ = n3 = this.bitField0_ | 1;
    }

    private void setPerfSessions(int n3, PerfSession perfSession) {
        perfSession.getClass();
        this.ensurePerfSessionsIsMutable();
        this.perfSessions_.set(n3, perfSession);
    }

    private void setSubtraces(int n3, TraceMetric traceMetric) {
        traceMetric.getClass();
        this.ensureSubtracesIsMutable();
        this.subtraces_.set(n3, traceMetric);
    }

    public boolean containsCounters(String string2) {
        string2.getClass();
        return ((AbstractMap)this.internalGetCounters()).containsKey(string2);
    }

    public boolean containsCustomAttributes(String string2) {
        string2.getClass();
        return ((AbstractMap)this.internalGetCustomAttributes()).containsKey(string2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke objectArray, Object object, Object object2) {
        byte by2 = 1;
        object2 = TraceMetric$1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke;
        Object object3 = objectArray.ordinal();
        object3 = object2[object3];
        object2 = null;
        switch (object3) {
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
                object = TraceMetric.class;
                synchronized (object) {
                    try {
                        objectArray = PARSER;
                        if (objectArray != null) return objectArray;
                        object2 = DEFAULT_INSTANCE;
                        PARSER = objectArray = new GeneratedMessageLite$DefaultInstanceBasedParser((GeneratedMessageLite)object2);
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
                objectArray = new Object[13];
                objectArray[0] = "bitField0_";
                objectArray[by2] = "name_";
                objectArray[2] = "isAuto_";
                objectArray[3] = "clientStartTimeUs_";
                objectArray[4] = "durationUs_";
                objectArray[5] = "counters_";
                objectArray[6] = object = TraceMetric$CountersDefaultEntryHolder.defaultEntry;
                objectArray[7] = "subtraces_";
                objectArray[8] = TraceMetric.class;
                objectArray[9] = "customAttributes_";
                objectArray[10] = object = TraceMetric$CustomAttributesDefaultEntryHolder.defaultEntry;
                objectArray[11] = "perfSessions_";
                objectArray[12] = PerfSession.class;
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\b\u0000\u0001\u0001\t\b\u0002\u0002\u0000\u0001\u1008\u0000\u0002\u1007\u0001\u0004\u1002\u0002\u0005\u1002\u0003\u00062\u0007\u001b\b2\t\u001b", objectArray);
            }
            case 2: {
                return new TraceMetric$Builder(null);
            }
            case 1: 
        }
        return new TraceMetric();
    }

    public long getClientStartTimeUs() {
        return this.clientStartTimeUs_;
    }

    public Map getCounters() {
        return this.getCountersMap();
    }

    public int getCountersCount() {
        return ((AbstractMap)this.internalGetCounters()).size();
    }

    public Map getCountersMap() {
        return Collections.unmodifiableMap(this.internalGetCounters());
    }

    public long getCountersOrDefault(String object, long l2) {
        object.getClass();
        MapFieldLite mapFieldLite = this.internalGetCounters();
        boolean bl2 = mapFieldLite.containsKey(object);
        if (bl2) {
            object = (Long)mapFieldLite.get(object);
            l2 = (Long)object;
        }
        return l2;
    }

    public long getCountersOrThrow(String object) {
        object.getClass();
        MapFieldLite mapFieldLite = this.internalGetCounters();
        boolean bl2 = mapFieldLite.containsKey(object);
        if (bl2) {
            return (Long)mapFieldLite.get(object);
        }
        object = new IllegalArgumentException();
        throw object;
    }

    public Map getCustomAttributes() {
        return this.getCustomAttributesMap();
    }

    public int getCustomAttributesCount() {
        return ((AbstractMap)this.internalGetCustomAttributes()).size();
    }

    public Map getCustomAttributesMap() {
        return Collections.unmodifiableMap(this.internalGetCustomAttributes());
    }

    public String getCustomAttributesOrDefault(String string2, String string3) {
        string2.getClass();
        MapFieldLite mapFieldLite = this.internalGetCustomAttributes();
        boolean bl2 = mapFieldLite.containsKey(string2);
        if (bl2) {
            string3 = string2 = mapFieldLite.get(string2);
            string3 = string2;
        }
        return string3;
    }

    public String getCustomAttributesOrThrow(String object) {
        object.getClass();
        MapFieldLite mapFieldLite = this.internalGetCustomAttributes();
        boolean bl2 = mapFieldLite.containsKey(object);
        if (bl2) {
            return (String)mapFieldLite.get(object);
        }
        object = new IllegalArgumentException();
        throw object;
    }

    public long getDurationUs() {
        return this.durationUs_;
    }

    public boolean getIsAuto() {
        return this.isAuto_;
    }

    public String getName() {
        return this.name_;
    }

    public ByteString getNameBytes() {
        return ByteString.copyFromUtf8(this.name_);
    }

    public PerfSession getPerfSessions(int n3) {
        return (PerfSession)this.perfSessions_.get(n3);
    }

    public int getPerfSessionsCount() {
        return this.perfSessions_.size();
    }

    public List getPerfSessionsList() {
        return this.perfSessions_;
    }

    public PerfSessionOrBuilder getPerfSessionsOrBuilder(int n3) {
        return (PerfSessionOrBuilder)this.perfSessions_.get(n3);
    }

    public List getPerfSessionsOrBuilderList() {
        return this.perfSessions_;
    }

    public TraceMetric getSubtraces(int n3) {
        return (TraceMetric)this.subtraces_.get(n3);
    }

    public int getSubtracesCount() {
        return this.subtraces_.size();
    }

    public List getSubtracesList() {
        return this.subtraces_;
    }

    public TraceMetricOrBuilder getSubtracesOrBuilder(int n3) {
        return (TraceMetricOrBuilder)this.subtraces_.get(n3);
    }

    public List getSubtracesOrBuilderList() {
        return this.subtraces_;
    }

    public boolean hasClientStartTimeUs() {
        int n3 = this.bitField0_ & 4;
        n3 = n3 != 0 ? 1 : 0;
        return n3 != 0;
    }

    public boolean hasDurationUs() {
        int n3 = this.bitField0_ & 8;
        n3 = n3 != 0 ? 1 : 0;
        return n3 != 0;
    }

    public boolean hasIsAuto() {
        int n3 = this.bitField0_ & 2;
        n3 = n3 != 0 ? 1 : 0;
        return n3 != 0;
    }

    public boolean hasName() {
        int n3 = this.bitField0_;
        int n4 = 1;
        if ((n3 &= n4) == 0) {
            n4 = 0;
        }
        return n4 != 0;
    }
}

