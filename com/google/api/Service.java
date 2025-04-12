/*
 * Decompiled with CFR 0.152.
 */
package com.google.api;

import com.google.api.Authentication;
import com.google.api.Authentication$Builder;
import com.google.api.AuthenticationOrBuilder;
import com.google.api.Backend;
import com.google.api.Backend$Builder;
import com.google.api.BackendOrBuilder;
import com.google.api.Billing;
import com.google.api.Billing$Builder;
import com.google.api.BillingOrBuilder;
import com.google.api.Context;
import com.google.api.Context$Builder;
import com.google.api.ContextOrBuilder;
import com.google.api.Control;
import com.google.api.Control$Builder;
import com.google.api.ControlOrBuilder;
import com.google.api.Documentation;
import com.google.api.Documentation$Builder;
import com.google.api.DocumentationOrBuilder;
import com.google.api.Endpoint;
import com.google.api.EndpointOrBuilder;
import com.google.api.Http;
import com.google.api.Http$Builder;
import com.google.api.HttpOrBuilder;
import com.google.api.LogDescriptor;
import com.google.api.LogDescriptorOrBuilder;
import com.google.api.Logging;
import com.google.api.Logging$Builder;
import com.google.api.LoggingOrBuilder;
import com.google.api.MetricDescriptor;
import com.google.api.MetricDescriptorOrBuilder;
import com.google.api.MonitoredResourceDescriptor;
import com.google.api.MonitoredResourceDescriptorOrBuilder;
import com.google.api.Monitoring;
import com.google.api.Monitoring$Builder;
import com.google.api.MonitoringOrBuilder;
import com.google.api.Quota;
import com.google.api.Quota$Builder;
import com.google.api.QuotaOrBuilder;
import com.google.api.Service$1;
import com.google.api.Service$Builder;
import com.google.api.ServiceOrBuilder;
import com.google.api.SourceInfo;
import com.google.api.SourceInfo$Builder;
import com.google.api.SourceInfoOrBuilder;
import com.google.api.SystemParameters;
import com.google.api.SystemParameters$Builder;
import com.google.api.SystemParametersOrBuilder;
import com.google.api.Usage;
import com.google.api.Usage$Builder;
import com.google.api.UsageOrBuilder;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.Api;
import com.google.protobuf.ApiOrBuilder;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.Enum;
import com.google.protobuf.EnumOrBuilder;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.google.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser;
import com.google.protobuf.GeneratedMessageLite$MethodToInvoke;
import com.google.protobuf.Internal$ProtobufList;
import com.google.protobuf.Parser;
import com.google.protobuf.Type;
import com.google.protobuf.TypeOrBuilder;
import com.google.protobuf.UInt32Value;
import com.google.protobuf.UInt32Value$Builder;
import com.google.protobuf.UInt32ValueOrBuilder;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

public final class Service
extends GeneratedMessageLite
implements ServiceOrBuilder {
    public static final int APIS_FIELD_NUMBER = 3;
    public static final int AUTHENTICATION_FIELD_NUMBER = 11;
    public static final int BACKEND_FIELD_NUMBER = 8;
    public static final int BILLING_FIELD_NUMBER = 26;
    public static final int CONFIG_VERSION_FIELD_NUMBER = 20;
    public static final int CONTEXT_FIELD_NUMBER = 12;
    public static final int CONTROL_FIELD_NUMBER = 21;
    private static final Service DEFAULT_INSTANCE;
    public static final int DOCUMENTATION_FIELD_NUMBER = 6;
    public static final int ENDPOINTS_FIELD_NUMBER = 18;
    public static final int ENUMS_FIELD_NUMBER = 5;
    public static final int HTTP_FIELD_NUMBER = 9;
    public static final int ID_FIELD_NUMBER = 33;
    public static final int LOGGING_FIELD_NUMBER = 27;
    public static final int LOGS_FIELD_NUMBER = 23;
    public static final int METRICS_FIELD_NUMBER = 24;
    public static final int MONITORED_RESOURCES_FIELD_NUMBER = 25;
    public static final int MONITORING_FIELD_NUMBER = 28;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile Parser PARSER;
    public static final int PRODUCER_PROJECT_ID_FIELD_NUMBER = 22;
    public static final int QUOTA_FIELD_NUMBER = 10;
    public static final int SOURCE_INFO_FIELD_NUMBER = 37;
    public static final int SYSTEM_PARAMETERS_FIELD_NUMBER = 29;
    public static final int TITLE_FIELD_NUMBER = 2;
    public static final int TYPES_FIELD_NUMBER = 4;
    public static final int USAGE_FIELD_NUMBER = 15;
    private Internal$ProtobufList apis_;
    private Authentication authentication_;
    private Backend backend_;
    private Billing billing_;
    private UInt32Value configVersion_;
    private Context context_;
    private Control control_;
    private Documentation documentation_;
    private Internal$ProtobufList endpoints_;
    private Internal$ProtobufList enums_;
    private Http http_;
    private String id_;
    private Logging logging_;
    private Internal$ProtobufList logs_;
    private Internal$ProtobufList metrics_;
    private Internal$ProtobufList monitoredResources_;
    private Monitoring monitoring_;
    private String name_;
    private String producerProjectId_;
    private Quota quota_;
    private SourceInfo sourceInfo_;
    private SystemParameters systemParameters_;
    private String title_;
    private Internal$ProtobufList types_;
    private Usage usage_;

    static {
        Service service;
        DEFAULT_INSTANCE = service = new Service();
        GeneratedMessageLite.registerDefaultInstance(Service.class, service);
    }

    private Service() {
        Object object = "";
        this.name_ = object;
        this.id_ = object;
        this.title_ = object;
        this.producerProjectId_ = object;
        this.apis_ = object = GeneratedMessageLite.emptyProtobufList();
        this.types_ = object = GeneratedMessageLite.emptyProtobufList();
        this.enums_ = object = GeneratedMessageLite.emptyProtobufList();
        this.endpoints_ = object = GeneratedMessageLite.emptyProtobufList();
        this.logs_ = object = GeneratedMessageLite.emptyProtobufList();
        this.metrics_ = object = GeneratedMessageLite.emptyProtobufList();
        this.monitoredResources_ = object = GeneratedMessageLite.emptyProtobufList();
    }

    public static /* synthetic */ Service access$000() {
        return DEFAULT_INSTANCE;
    }

    public static /* synthetic */ void access$100(Service service, UInt32Value uInt32Value) {
        service.setConfigVersion(uInt32Value);
    }

    public static /* synthetic */ void access$1000(Service service, String string2) {
        service.setTitle(string2);
    }

    public static /* synthetic */ void access$1100(Service service) {
        service.clearTitle();
    }

    public static /* synthetic */ void access$1200(Service service, ByteString byteString) {
        service.setTitleBytes(byteString);
    }

    public static /* synthetic */ void access$1300(Service service, String string2) {
        service.setProducerProjectId(string2);
    }

    public static /* synthetic */ void access$1400(Service service) {
        service.clearProducerProjectId();
    }

    public static /* synthetic */ void access$1500(Service service, ByteString byteString) {
        service.setProducerProjectIdBytes(byteString);
    }

    public static /* synthetic */ void access$1600(Service service, int n3, Api api) {
        service.setApis(n3, api);
    }

    public static /* synthetic */ void access$1700(Service service, Api api) {
        service.addApis(api);
    }

    public static /* synthetic */ void access$1800(Service service, int n3, Api api) {
        service.addApis(n3, api);
    }

    public static /* synthetic */ void access$1900(Service service, Iterable iterable) {
        service.addAllApis(iterable);
    }

    public static /* synthetic */ void access$200(Service service, UInt32Value uInt32Value) {
        service.mergeConfigVersion(uInt32Value);
    }

    public static /* synthetic */ void access$2000(Service service) {
        service.clearApis();
    }

    public static /* synthetic */ void access$2100(Service service, int n3) {
        service.removeApis(n3);
    }

    public static /* synthetic */ void access$2200(Service service, int n3, Type type2) {
        service.setTypes(n3, type2);
    }

    public static /* synthetic */ void access$2300(Service service, Type type2) {
        service.addTypes(type2);
    }

    public static /* synthetic */ void access$2400(Service service, int n3, Type type2) {
        service.addTypes(n3, type2);
    }

    public static /* synthetic */ void access$2500(Service service, Iterable iterable) {
        service.addAllTypes(iterable);
    }

    public static /* synthetic */ void access$2600(Service service) {
        service.clearTypes();
    }

    public static /* synthetic */ void access$2700(Service service, int n3) {
        service.removeTypes(n3);
    }

    public static /* synthetic */ void access$2800(Service service, int n3, Enum enum_) {
        service.setEnums(n3, enum_);
    }

    public static /* synthetic */ void access$2900(Service service, Enum enum_) {
        service.addEnums(enum_);
    }

    public static /* synthetic */ void access$300(Service service) {
        service.clearConfigVersion();
    }

    public static /* synthetic */ void access$3000(Service service, int n3, Enum enum_) {
        service.addEnums(n3, enum_);
    }

    public static /* synthetic */ void access$3100(Service service, Iterable iterable) {
        service.addAllEnums(iterable);
    }

    public static /* synthetic */ void access$3200(Service service) {
        service.clearEnums();
    }

    public static /* synthetic */ void access$3300(Service service, int n3) {
        service.removeEnums(n3);
    }

    public static /* synthetic */ void access$3400(Service service, Documentation documentation) {
        service.setDocumentation(documentation);
    }

    public static /* synthetic */ void access$3500(Service service, Documentation documentation) {
        service.mergeDocumentation(documentation);
    }

    public static /* synthetic */ void access$3600(Service service) {
        service.clearDocumentation();
    }

    public static /* synthetic */ void access$3700(Service service, Backend backend) {
        service.setBackend(backend);
    }

    public static /* synthetic */ void access$3800(Service service, Backend backend) {
        service.mergeBackend(backend);
    }

    public static /* synthetic */ void access$3900(Service service) {
        service.clearBackend();
    }

    public static /* synthetic */ void access$400(Service service, String string2) {
        service.setName(string2);
    }

    public static /* synthetic */ void access$4000(Service service, Http http) {
        service.setHttp(http);
    }

    public static /* synthetic */ void access$4100(Service service, Http http) {
        service.mergeHttp(http);
    }

    public static /* synthetic */ void access$4200(Service service) {
        service.clearHttp();
    }

    public static /* synthetic */ void access$4300(Service service, Quota quota) {
        service.setQuota(quota);
    }

    public static /* synthetic */ void access$4400(Service service, Quota quota) {
        service.mergeQuota(quota);
    }

    public static /* synthetic */ void access$4500(Service service) {
        service.clearQuota();
    }

    public static /* synthetic */ void access$4600(Service service, Authentication authentication) {
        service.setAuthentication(authentication);
    }

    public static /* synthetic */ void access$4700(Service service, Authentication authentication) {
        service.mergeAuthentication(authentication);
    }

    public static /* synthetic */ void access$4800(Service service) {
        service.clearAuthentication();
    }

    public static /* synthetic */ void access$4900(Service service, Context context) {
        service.setContext(context);
    }

    public static /* synthetic */ void access$500(Service service) {
        service.clearName();
    }

    public static /* synthetic */ void access$5000(Service service, Context context) {
        service.mergeContext(context);
    }

    public static /* synthetic */ void access$5100(Service service) {
        service.clearContext();
    }

    public static /* synthetic */ void access$5200(Service service, Usage usage) {
        service.setUsage(usage);
    }

    public static /* synthetic */ void access$5300(Service service, Usage usage) {
        service.mergeUsage(usage);
    }

    public static /* synthetic */ void access$5400(Service service) {
        service.clearUsage();
    }

    public static /* synthetic */ void access$5500(Service service, int n3, Endpoint endpoint) {
        service.setEndpoints(n3, endpoint);
    }

    public static /* synthetic */ void access$5600(Service service, Endpoint endpoint) {
        service.addEndpoints(endpoint);
    }

    public static /* synthetic */ void access$5700(Service service, int n3, Endpoint endpoint) {
        service.addEndpoints(n3, endpoint);
    }

    public static /* synthetic */ void access$5800(Service service, Iterable iterable) {
        service.addAllEndpoints(iterable);
    }

    public static /* synthetic */ void access$5900(Service service) {
        service.clearEndpoints();
    }

    public static /* synthetic */ void access$600(Service service, ByteString byteString) {
        service.setNameBytes(byteString);
    }

    public static /* synthetic */ void access$6000(Service service, int n3) {
        service.removeEndpoints(n3);
    }

    public static /* synthetic */ void access$6100(Service service, Control control) {
        service.setControl(control);
    }

    public static /* synthetic */ void access$6200(Service service, Control control) {
        service.mergeControl(control);
    }

    public static /* synthetic */ void access$6300(Service service) {
        service.clearControl();
    }

    public static /* synthetic */ void access$6400(Service service, int n3, LogDescriptor logDescriptor) {
        service.setLogs(n3, logDescriptor);
    }

    public static /* synthetic */ void access$6500(Service service, LogDescriptor logDescriptor) {
        service.addLogs(logDescriptor);
    }

    public static /* synthetic */ void access$6600(Service service, int n3, LogDescriptor logDescriptor) {
        service.addLogs(n3, logDescriptor);
    }

    public static /* synthetic */ void access$6700(Service service, Iterable iterable) {
        service.addAllLogs(iterable);
    }

    public static /* synthetic */ void access$6800(Service service) {
        service.clearLogs();
    }

    public static /* synthetic */ void access$6900(Service service, int n3) {
        service.removeLogs(n3);
    }

    public static /* synthetic */ void access$700(Service service, String string2) {
        service.setId(string2);
    }

    public static /* synthetic */ void access$7000(Service service, int n3, MetricDescriptor metricDescriptor) {
        service.setMetrics(n3, metricDescriptor);
    }

    public static /* synthetic */ void access$7100(Service service, MetricDescriptor metricDescriptor) {
        service.addMetrics(metricDescriptor);
    }

    public static /* synthetic */ void access$7200(Service service, int n3, MetricDescriptor metricDescriptor) {
        service.addMetrics(n3, metricDescriptor);
    }

    public static /* synthetic */ void access$7300(Service service, Iterable iterable) {
        service.addAllMetrics(iterable);
    }

    public static /* synthetic */ void access$7400(Service service) {
        service.clearMetrics();
    }

    public static /* synthetic */ void access$7500(Service service, int n3) {
        service.removeMetrics(n3);
    }

    public static /* synthetic */ void access$7600(Service service, int n3, MonitoredResourceDescriptor monitoredResourceDescriptor) {
        service.setMonitoredResources(n3, monitoredResourceDescriptor);
    }

    public static /* synthetic */ void access$7700(Service service, MonitoredResourceDescriptor monitoredResourceDescriptor) {
        service.addMonitoredResources(monitoredResourceDescriptor);
    }

    public static /* synthetic */ void access$7800(Service service, int n3, MonitoredResourceDescriptor monitoredResourceDescriptor) {
        service.addMonitoredResources(n3, monitoredResourceDescriptor);
    }

    public static /* synthetic */ void access$7900(Service service, Iterable iterable) {
        service.addAllMonitoredResources(iterable);
    }

    public static /* synthetic */ void access$800(Service service) {
        service.clearId();
    }

    public static /* synthetic */ void access$8000(Service service) {
        service.clearMonitoredResources();
    }

    public static /* synthetic */ void access$8100(Service service, int n3) {
        service.removeMonitoredResources(n3);
    }

    public static /* synthetic */ void access$8200(Service service, Billing billing) {
        service.setBilling(billing);
    }

    public static /* synthetic */ void access$8300(Service service, Billing billing) {
        service.mergeBilling(billing);
    }

    public static /* synthetic */ void access$8400(Service service) {
        service.clearBilling();
    }

    public static /* synthetic */ void access$8500(Service service, Logging logging) {
        service.setLogging(logging);
    }

    public static /* synthetic */ void access$8600(Service service, Logging logging) {
        service.mergeLogging(logging);
    }

    public static /* synthetic */ void access$8700(Service service) {
        service.clearLogging();
    }

    public static /* synthetic */ void access$8800(Service service, Monitoring monitoring) {
        service.setMonitoring(monitoring);
    }

    public static /* synthetic */ void access$8900(Service service, Monitoring monitoring) {
        service.mergeMonitoring(monitoring);
    }

    public static /* synthetic */ void access$900(Service service, ByteString byteString) {
        service.setIdBytes(byteString);
    }

    public static /* synthetic */ void access$9000(Service service) {
        service.clearMonitoring();
    }

    public static /* synthetic */ void access$9100(Service service, SystemParameters systemParameters) {
        service.setSystemParameters(systemParameters);
    }

    public static /* synthetic */ void access$9200(Service service, SystemParameters systemParameters) {
        service.mergeSystemParameters(systemParameters);
    }

    public static /* synthetic */ void access$9300(Service service) {
        service.clearSystemParameters();
    }

    public static /* synthetic */ void access$9400(Service service, SourceInfo sourceInfo) {
        service.setSourceInfo(sourceInfo);
    }

    public static /* synthetic */ void access$9500(Service service, SourceInfo sourceInfo) {
        service.mergeSourceInfo(sourceInfo);
    }

    public static /* synthetic */ void access$9600(Service service) {
        service.clearSourceInfo();
    }

    private void addAllApis(Iterable iterable) {
        this.ensureApisIsMutable();
        Internal$ProtobufList internal$ProtobufList = this.apis_;
        AbstractMessageLite.addAll(iterable, internal$ProtobufList);
    }

    private void addAllEndpoints(Iterable iterable) {
        this.ensureEndpointsIsMutable();
        Internal$ProtobufList internal$ProtobufList = this.endpoints_;
        AbstractMessageLite.addAll(iterable, internal$ProtobufList);
    }

    private void addAllEnums(Iterable iterable) {
        this.ensureEnumsIsMutable();
        Internal$ProtobufList internal$ProtobufList = this.enums_;
        AbstractMessageLite.addAll(iterable, internal$ProtobufList);
    }

    private void addAllLogs(Iterable iterable) {
        this.ensureLogsIsMutable();
        Internal$ProtobufList internal$ProtobufList = this.logs_;
        AbstractMessageLite.addAll(iterable, internal$ProtobufList);
    }

    private void addAllMetrics(Iterable iterable) {
        this.ensureMetricsIsMutable();
        Internal$ProtobufList internal$ProtobufList = this.metrics_;
        AbstractMessageLite.addAll(iterable, internal$ProtobufList);
    }

    private void addAllMonitoredResources(Iterable iterable) {
        this.ensureMonitoredResourcesIsMutable();
        Internal$ProtobufList internal$ProtobufList = this.monitoredResources_;
        AbstractMessageLite.addAll(iterable, internal$ProtobufList);
    }

    private void addAllTypes(Iterable iterable) {
        this.ensureTypesIsMutable();
        Internal$ProtobufList internal$ProtobufList = this.types_;
        AbstractMessageLite.addAll(iterable, internal$ProtobufList);
    }

    private void addApis(int n3, Api api) {
        api.getClass();
        this.ensureApisIsMutable();
        this.apis_.add(n3, api);
    }

    private void addApis(Api api) {
        api.getClass();
        this.ensureApisIsMutable();
        this.apis_.add(api);
    }

    private void addEndpoints(int n3, Endpoint endpoint) {
        endpoint.getClass();
        this.ensureEndpointsIsMutable();
        this.endpoints_.add(n3, endpoint);
    }

    private void addEndpoints(Endpoint endpoint) {
        endpoint.getClass();
        this.ensureEndpointsIsMutable();
        this.endpoints_.add(endpoint);
    }

    private void addEnums(int n3, Enum enum_) {
        enum_.getClass();
        this.ensureEnumsIsMutable();
        this.enums_.add(n3, enum_);
    }

    private void addEnums(Enum enum_) {
        enum_.getClass();
        this.ensureEnumsIsMutable();
        this.enums_.add(enum_);
    }

    private void addLogs(int n3, LogDescriptor logDescriptor) {
        logDescriptor.getClass();
        this.ensureLogsIsMutable();
        this.logs_.add(n3, logDescriptor);
    }

    private void addLogs(LogDescriptor logDescriptor) {
        logDescriptor.getClass();
        this.ensureLogsIsMutable();
        this.logs_.add(logDescriptor);
    }

    private void addMetrics(int n3, MetricDescriptor metricDescriptor) {
        metricDescriptor.getClass();
        this.ensureMetricsIsMutable();
        this.metrics_.add(n3, metricDescriptor);
    }

    private void addMetrics(MetricDescriptor metricDescriptor) {
        metricDescriptor.getClass();
        this.ensureMetricsIsMutable();
        this.metrics_.add(metricDescriptor);
    }

    private void addMonitoredResources(int n3, MonitoredResourceDescriptor monitoredResourceDescriptor) {
        monitoredResourceDescriptor.getClass();
        this.ensureMonitoredResourcesIsMutable();
        this.monitoredResources_.add(n3, monitoredResourceDescriptor);
    }

    private void addMonitoredResources(MonitoredResourceDescriptor monitoredResourceDescriptor) {
        monitoredResourceDescriptor.getClass();
        this.ensureMonitoredResourcesIsMutable();
        this.monitoredResources_.add(monitoredResourceDescriptor);
    }

    private void addTypes(int n3, Type type2) {
        type2.getClass();
        this.ensureTypesIsMutable();
        this.types_.add(n3, type2);
    }

    private void addTypes(Type type2) {
        type2.getClass();
        this.ensureTypesIsMutable();
        this.types_.add(type2);
    }

    private void clearApis() {
        Internal$ProtobufList internal$ProtobufList;
        this.apis_ = internal$ProtobufList = GeneratedMessageLite.emptyProtobufList();
    }

    private void clearAuthentication() {
        this.authentication_ = null;
    }

    private void clearBackend() {
        this.backend_ = null;
    }

    private void clearBilling() {
        this.billing_ = null;
    }

    private void clearConfigVersion() {
        this.configVersion_ = null;
    }

    private void clearContext() {
        this.context_ = null;
    }

    private void clearControl() {
        this.control_ = null;
    }

    private void clearDocumentation() {
        this.documentation_ = null;
    }

    private void clearEndpoints() {
        Internal$ProtobufList internal$ProtobufList;
        this.endpoints_ = internal$ProtobufList = GeneratedMessageLite.emptyProtobufList();
    }

    private void clearEnums() {
        Internal$ProtobufList internal$ProtobufList;
        this.enums_ = internal$ProtobufList = GeneratedMessageLite.emptyProtobufList();
    }

    private void clearHttp() {
        this.http_ = null;
    }

    private void clearId() {
        String string2;
        this.id_ = string2 = Service.getDefaultInstance().getId();
    }

    private void clearLogging() {
        this.logging_ = null;
    }

    private void clearLogs() {
        Internal$ProtobufList internal$ProtobufList;
        this.logs_ = internal$ProtobufList = GeneratedMessageLite.emptyProtobufList();
    }

    private void clearMetrics() {
        Internal$ProtobufList internal$ProtobufList;
        this.metrics_ = internal$ProtobufList = GeneratedMessageLite.emptyProtobufList();
    }

    private void clearMonitoredResources() {
        Internal$ProtobufList internal$ProtobufList;
        this.monitoredResources_ = internal$ProtobufList = GeneratedMessageLite.emptyProtobufList();
    }

    private void clearMonitoring() {
        this.monitoring_ = null;
    }

    private void clearName() {
        String string2;
        this.name_ = string2 = Service.getDefaultInstance().getName();
    }

    private void clearProducerProjectId() {
        String string2;
        this.producerProjectId_ = string2 = Service.getDefaultInstance().getProducerProjectId();
    }

    private void clearQuota() {
        this.quota_ = null;
    }

    private void clearSourceInfo() {
        this.sourceInfo_ = null;
    }

    private void clearSystemParameters() {
        this.systemParameters_ = null;
    }

    private void clearTitle() {
        String string2;
        this.title_ = string2 = Service.getDefaultInstance().getTitle();
    }

    private void clearTypes() {
        Internal$ProtobufList internal$ProtobufList;
        this.types_ = internal$ProtobufList = GeneratedMessageLite.emptyProtobufList();
    }

    private void clearUsage() {
        this.usage_ = null;
    }

    private void ensureApisIsMutable() {
        Internal$ProtobufList internal$ProtobufList = this.apis_;
        boolean bl2 = internal$ProtobufList.isModifiable();
        if (!bl2) {
            this.apis_ = internal$ProtobufList = GeneratedMessageLite.mutableCopy(internal$ProtobufList);
        }
    }

    private void ensureEndpointsIsMutable() {
        Internal$ProtobufList internal$ProtobufList = this.endpoints_;
        boolean bl2 = internal$ProtobufList.isModifiable();
        if (!bl2) {
            this.endpoints_ = internal$ProtobufList = GeneratedMessageLite.mutableCopy(internal$ProtobufList);
        }
    }

    private void ensureEnumsIsMutable() {
        Internal$ProtobufList internal$ProtobufList = this.enums_;
        boolean bl2 = internal$ProtobufList.isModifiable();
        if (!bl2) {
            this.enums_ = internal$ProtobufList = GeneratedMessageLite.mutableCopy(internal$ProtobufList);
        }
    }

    private void ensureLogsIsMutable() {
        Internal$ProtobufList internal$ProtobufList = this.logs_;
        boolean bl2 = internal$ProtobufList.isModifiable();
        if (!bl2) {
            this.logs_ = internal$ProtobufList = GeneratedMessageLite.mutableCopy(internal$ProtobufList);
        }
    }

    private void ensureMetricsIsMutable() {
        Internal$ProtobufList internal$ProtobufList = this.metrics_;
        boolean bl2 = internal$ProtobufList.isModifiable();
        if (!bl2) {
            this.metrics_ = internal$ProtobufList = GeneratedMessageLite.mutableCopy(internal$ProtobufList);
        }
    }

    private void ensureMonitoredResourcesIsMutable() {
        Internal$ProtobufList internal$ProtobufList = this.monitoredResources_;
        boolean bl2 = internal$ProtobufList.isModifiable();
        if (!bl2) {
            this.monitoredResources_ = internal$ProtobufList = GeneratedMessageLite.mutableCopy(internal$ProtobufList);
        }
    }

    private void ensureTypesIsMutable() {
        Internal$ProtobufList internal$ProtobufList = this.types_;
        boolean bl2 = internal$ProtobufList.isModifiable();
        if (!bl2) {
            this.types_ = internal$ProtobufList = GeneratedMessageLite.mutableCopy(internal$ProtobufList);
        }
    }

    public static Service getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private void mergeAuthentication(Authentication authentication) {
        Authentication authentication2;
        authentication.getClass();
        AuthenticationOrBuilder authenticationOrBuilder = this.authentication_;
        if (authenticationOrBuilder != null && authenticationOrBuilder != (authentication2 = Authentication.getDefaultInstance())) {
            authenticationOrBuilder = Authentication.newBuilder(this.authentication_);
            this.authentication_ = authentication = (Authentication)((Authentication$Builder)((GeneratedMessageLite$Builder)((Object)authenticationOrBuilder)).mergeFrom(authentication)).buildPartial();
        } else {
            this.authentication_ = authentication;
        }
    }

    private void mergeBackend(Backend backend) {
        Backend backend2;
        backend.getClass();
        BackendOrBuilder backendOrBuilder = this.backend_;
        if (backendOrBuilder != null && backendOrBuilder != (backend2 = Backend.getDefaultInstance())) {
            backendOrBuilder = Backend.newBuilder(this.backend_);
            this.backend_ = backend = (Backend)((Backend$Builder)((GeneratedMessageLite$Builder)((Object)backendOrBuilder)).mergeFrom(backend)).buildPartial();
        } else {
            this.backend_ = backend;
        }
    }

    private void mergeBilling(Billing billing) {
        Billing billing2;
        billing.getClass();
        BillingOrBuilder billingOrBuilder = this.billing_;
        if (billingOrBuilder != null && billingOrBuilder != (billing2 = Billing.getDefaultInstance())) {
            billingOrBuilder = Billing.newBuilder(this.billing_);
            this.billing_ = billing = (Billing)((Billing$Builder)((GeneratedMessageLite$Builder)((Object)billingOrBuilder)).mergeFrom(billing)).buildPartial();
        } else {
            this.billing_ = billing;
        }
    }

    private void mergeConfigVersion(UInt32Value uInt32Value) {
        UInt32Value uInt32Value2;
        uInt32Value.getClass();
        UInt32ValueOrBuilder uInt32ValueOrBuilder = this.configVersion_;
        if (uInt32ValueOrBuilder != null && uInt32ValueOrBuilder != (uInt32Value2 = UInt32Value.getDefaultInstance())) {
            uInt32ValueOrBuilder = UInt32Value.newBuilder(this.configVersion_);
            this.configVersion_ = uInt32Value = (UInt32Value)((UInt32Value$Builder)((GeneratedMessageLite$Builder)((Object)uInt32ValueOrBuilder)).mergeFrom(uInt32Value)).buildPartial();
        } else {
            this.configVersion_ = uInt32Value;
        }
    }

    private void mergeContext(Context context) {
        Context context2;
        context.getClass();
        ContextOrBuilder contextOrBuilder = this.context_;
        if (contextOrBuilder != null && contextOrBuilder != (context2 = Context.getDefaultInstance())) {
            contextOrBuilder = Context.newBuilder(this.context_);
            this.context_ = context = (Context)((Context$Builder)((GeneratedMessageLite$Builder)((Object)contextOrBuilder)).mergeFrom(context)).buildPartial();
        } else {
            this.context_ = context;
        }
    }

    private void mergeControl(Control control) {
        Control control2;
        control.getClass();
        ControlOrBuilder controlOrBuilder = this.control_;
        if (controlOrBuilder != null && controlOrBuilder != (control2 = Control.getDefaultInstance())) {
            controlOrBuilder = Control.newBuilder(this.control_);
            this.control_ = control = (Control)((Control$Builder)((GeneratedMessageLite$Builder)((Object)controlOrBuilder)).mergeFrom(control)).buildPartial();
        } else {
            this.control_ = control;
        }
    }

    private void mergeDocumentation(Documentation documentation) {
        Documentation documentation2;
        documentation.getClass();
        DocumentationOrBuilder documentationOrBuilder = this.documentation_;
        if (documentationOrBuilder != null && documentationOrBuilder != (documentation2 = Documentation.getDefaultInstance())) {
            documentationOrBuilder = Documentation.newBuilder(this.documentation_);
            this.documentation_ = documentation = (Documentation)((Documentation$Builder)((GeneratedMessageLite$Builder)((Object)documentationOrBuilder)).mergeFrom(documentation)).buildPartial();
        } else {
            this.documentation_ = documentation;
        }
    }

    private void mergeHttp(Http http) {
        Http http2;
        http.getClass();
        HttpOrBuilder httpOrBuilder = this.http_;
        if (httpOrBuilder != null && httpOrBuilder != (http2 = Http.getDefaultInstance())) {
            httpOrBuilder = Http.newBuilder(this.http_);
            this.http_ = http = (Http)((Http$Builder)((GeneratedMessageLite$Builder)((Object)httpOrBuilder)).mergeFrom(http)).buildPartial();
        } else {
            this.http_ = http;
        }
    }

    private void mergeLogging(Logging logging) {
        Logging logging2;
        logging.getClass();
        LoggingOrBuilder loggingOrBuilder = this.logging_;
        if (loggingOrBuilder != null && loggingOrBuilder != (logging2 = Logging.getDefaultInstance())) {
            loggingOrBuilder = Logging.newBuilder(this.logging_);
            this.logging_ = logging = (Logging)((Logging$Builder)((GeneratedMessageLite$Builder)((Object)loggingOrBuilder)).mergeFrom(logging)).buildPartial();
        } else {
            this.logging_ = logging;
        }
    }

    private void mergeMonitoring(Monitoring monitoring) {
        Monitoring monitoring2;
        monitoring.getClass();
        MonitoringOrBuilder monitoringOrBuilder = this.monitoring_;
        if (monitoringOrBuilder != null && monitoringOrBuilder != (monitoring2 = Monitoring.getDefaultInstance())) {
            monitoringOrBuilder = Monitoring.newBuilder(this.monitoring_);
            this.monitoring_ = monitoring = (Monitoring)((Monitoring$Builder)((GeneratedMessageLite$Builder)((Object)monitoringOrBuilder)).mergeFrom(monitoring)).buildPartial();
        } else {
            this.monitoring_ = monitoring;
        }
    }

    private void mergeQuota(Quota quota) {
        Quota quota2;
        quota.getClass();
        QuotaOrBuilder quotaOrBuilder = this.quota_;
        if (quotaOrBuilder != null && quotaOrBuilder != (quota2 = Quota.getDefaultInstance())) {
            quotaOrBuilder = Quota.newBuilder(this.quota_);
            this.quota_ = quota = (Quota)((Quota$Builder)((GeneratedMessageLite$Builder)((Object)quotaOrBuilder)).mergeFrom(quota)).buildPartial();
        } else {
            this.quota_ = quota;
        }
    }

    private void mergeSourceInfo(SourceInfo sourceInfo) {
        SourceInfo sourceInfo2;
        sourceInfo.getClass();
        SourceInfoOrBuilder sourceInfoOrBuilder = this.sourceInfo_;
        if (sourceInfoOrBuilder != null && sourceInfoOrBuilder != (sourceInfo2 = SourceInfo.getDefaultInstance())) {
            sourceInfoOrBuilder = SourceInfo.newBuilder(this.sourceInfo_);
            this.sourceInfo_ = sourceInfo = (SourceInfo)((SourceInfo$Builder)((GeneratedMessageLite$Builder)((Object)sourceInfoOrBuilder)).mergeFrom(sourceInfo)).buildPartial();
        } else {
            this.sourceInfo_ = sourceInfo;
        }
    }

    private void mergeSystemParameters(SystemParameters systemParameters) {
        SystemParameters systemParameters2;
        systemParameters.getClass();
        SystemParametersOrBuilder systemParametersOrBuilder = this.systemParameters_;
        if (systemParametersOrBuilder != null && systemParametersOrBuilder != (systemParameters2 = SystemParameters.getDefaultInstance())) {
            systemParametersOrBuilder = SystemParameters.newBuilder(this.systemParameters_);
            this.systemParameters_ = systemParameters = (SystemParameters)((SystemParameters$Builder)((GeneratedMessageLite$Builder)((Object)systemParametersOrBuilder)).mergeFrom(systemParameters)).buildPartial();
        } else {
            this.systemParameters_ = systemParameters;
        }
    }

    private void mergeUsage(Usage usage) {
        Usage usage2;
        usage.getClass();
        UsageOrBuilder usageOrBuilder = this.usage_;
        if (usageOrBuilder != null && usageOrBuilder != (usage2 = Usage.getDefaultInstance())) {
            usageOrBuilder = Usage.newBuilder(this.usage_);
            this.usage_ = usage = (Usage)((Usage$Builder)((GeneratedMessageLite$Builder)((Object)usageOrBuilder)).mergeFrom(usage)).buildPartial();
        } else {
            this.usage_ = usage;
        }
    }

    public static Service$Builder newBuilder() {
        return (Service$Builder)DEFAULT_INSTANCE.createBuilder();
    }

    public static Service$Builder newBuilder(Service service) {
        return (Service$Builder)DEFAULT_INSTANCE.createBuilder(service);
    }

    public static Service parseDelimitedFrom(InputStream inputStream) {
        return (Service)GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Service parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Service)GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Service parseFrom(ByteString byteString) {
        return (Service)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteString);
    }

    public static Service parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (Service)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Service parseFrom(CodedInputStream codedInputStream) {
        return (Service)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, codedInputStream);
    }

    public static Service parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Service)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static Service parseFrom(InputStream inputStream) {
        return (Service)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, inputStream);
    }

    public static Service parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Service)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Service parseFrom(ByteBuffer byteBuffer) {
        return (Service)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteBuffer);
    }

    public static Service parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (Service)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Service parseFrom(byte[] byArray) {
        return (Service)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byArray);
    }

    public static Service parseFrom(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (Service)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byArray, extensionRegistryLite);
    }

    public static Parser parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void removeApis(int n3) {
        this.ensureApisIsMutable();
        this.apis_.remove(n3);
    }

    private void removeEndpoints(int n3) {
        this.ensureEndpointsIsMutable();
        this.endpoints_.remove(n3);
    }

    private void removeEnums(int n3) {
        this.ensureEnumsIsMutable();
        this.enums_.remove(n3);
    }

    private void removeLogs(int n3) {
        this.ensureLogsIsMutable();
        this.logs_.remove(n3);
    }

    private void removeMetrics(int n3) {
        this.ensureMetricsIsMutable();
        this.metrics_.remove(n3);
    }

    private void removeMonitoredResources(int n3) {
        this.ensureMonitoredResourcesIsMutable();
        this.monitoredResources_.remove(n3);
    }

    private void removeTypes(int n3) {
        this.ensureTypesIsMutable();
        this.types_.remove(n3);
    }

    private void setApis(int n3, Api api) {
        api.getClass();
        this.ensureApisIsMutable();
        this.apis_.set(n3, api);
    }

    private void setAuthentication(Authentication authentication) {
        authentication.getClass();
        this.authentication_ = authentication;
    }

    private void setBackend(Backend backend) {
        backend.getClass();
        this.backend_ = backend;
    }

    private void setBilling(Billing billing) {
        billing.getClass();
        this.billing_ = billing;
    }

    private void setConfigVersion(UInt32Value uInt32Value) {
        uInt32Value.getClass();
        this.configVersion_ = uInt32Value;
    }

    private void setContext(Context context) {
        context.getClass();
        this.context_ = context;
    }

    private void setControl(Control control) {
        control.getClass();
        this.control_ = control;
    }

    private void setDocumentation(Documentation documentation) {
        documentation.getClass();
        this.documentation_ = documentation;
    }

    private void setEndpoints(int n3, Endpoint endpoint) {
        endpoint.getClass();
        this.ensureEndpointsIsMutable();
        this.endpoints_.set(n3, endpoint);
    }

    private void setEnums(int n3, Enum enum_) {
        enum_.getClass();
        this.ensureEnumsIsMutable();
        this.enums_.set(n3, enum_);
    }

    private void setHttp(Http http) {
        http.getClass();
        this.http_ = http;
    }

    private void setId(String string2) {
        string2.getClass();
        this.id_ = string2;
    }

    private void setIdBytes(ByteString object) {
        AbstractMessageLite.checkByteStringIsUtf8((ByteString)object);
        this.id_ = object = ((ByteString)object).toStringUtf8();
    }

    private void setLogging(Logging logging) {
        logging.getClass();
        this.logging_ = logging;
    }

    private void setLogs(int n3, LogDescriptor logDescriptor) {
        logDescriptor.getClass();
        this.ensureLogsIsMutable();
        this.logs_.set(n3, logDescriptor);
    }

    private void setMetrics(int n3, MetricDescriptor metricDescriptor) {
        metricDescriptor.getClass();
        this.ensureMetricsIsMutable();
        this.metrics_.set(n3, metricDescriptor);
    }

    private void setMonitoredResources(int n3, MonitoredResourceDescriptor monitoredResourceDescriptor) {
        monitoredResourceDescriptor.getClass();
        this.ensureMonitoredResourcesIsMutable();
        this.monitoredResources_.set(n3, monitoredResourceDescriptor);
    }

    private void setMonitoring(Monitoring monitoring) {
        monitoring.getClass();
        this.monitoring_ = monitoring;
    }

    private void setName(String string2) {
        string2.getClass();
        this.name_ = string2;
    }

    private void setNameBytes(ByteString object) {
        AbstractMessageLite.checkByteStringIsUtf8((ByteString)object);
        this.name_ = object = ((ByteString)object).toStringUtf8();
    }

    private void setProducerProjectId(String string2) {
        string2.getClass();
        this.producerProjectId_ = string2;
    }

    private void setProducerProjectIdBytes(ByteString object) {
        AbstractMessageLite.checkByteStringIsUtf8((ByteString)object);
        this.producerProjectId_ = object = ((ByteString)object).toStringUtf8();
    }

    private void setQuota(Quota quota) {
        quota.getClass();
        this.quota_ = quota;
    }

    private void setSourceInfo(SourceInfo sourceInfo) {
        sourceInfo.getClass();
        this.sourceInfo_ = sourceInfo;
    }

    private void setSystemParameters(SystemParameters systemParameters) {
        systemParameters.getClass();
        this.systemParameters_ = systemParameters;
    }

    private void setTitle(String string2) {
        string2.getClass();
        this.title_ = string2;
    }

    private void setTitleBytes(ByteString object) {
        AbstractMessageLite.checkByteStringIsUtf8((ByteString)object);
        this.title_ = object = ((ByteString)object).toStringUtf8();
    }

    private void setTypes(int n3, Type type2) {
        type2.getClass();
        this.ensureTypesIsMutable();
        this.types_.set(n3, type2);
    }

    private void setUsage(Usage usage) {
        usage.getClass();
        this.usage_ = usage;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke objectArray, Object clazz, Object object) {
        byte by2 = 1;
        object = Service$1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke;
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
                clazz = Service.class;
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
                objectArray = new Object[32];
                objectArray[0] = "name_";
                objectArray[by2] = "title_";
                objectArray[2] = "apis_";
                objectArray[3] = Api.class;
                objectArray[4] = "types_";
                objectArray[5] = Type.class;
                objectArray[6] = "enums_";
                objectArray[7] = Enum.class;
                objectArray[8] = "documentation_";
                objectArray[9] = "backend_";
                objectArray[10] = "http_";
                objectArray[11] = "quota_";
                objectArray[12] = "authentication_";
                objectArray[13] = "context_";
                objectArray[14] = "usage_";
                objectArray[15] = "endpoints_";
                objectArray[16] = Endpoint.class;
                objectArray[17] = "configVersion_";
                objectArray[18] = "control_";
                objectArray[19] = "producerProjectId_";
                objectArray[20] = "logs_";
                objectArray[21] = LogDescriptor.class;
                objectArray[22] = "metrics_";
                objectArray[23] = MetricDescriptor.class;
                objectArray[24] = "monitoredResources_";
                objectArray[25] = MonitoredResourceDescriptor.class;
                objectArray[26] = "billing_";
                objectArray[27] = "logging_";
                objectArray[28] = "monitoring_";
                objectArray[29] = "systemParameters_";
                objectArray[30] = "id_";
                objectArray[31] = "sourceInfo_";
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0019\u0000\u0000\u0001%\u0019\u0000\u0007\u0000\u0001\u0208\u0002\u0208\u0003\u001b\u0004\u001b\u0005\u001b\u0006\t\b\t\t\t\n\t\u000b\t\f\t\u000f\t\u0012\u001b\u0014\t\u0015\t\u0016\u0208\u0017\u001b\u0018\u001b\u0019\u001b\u001a\t\u001b\t\u001c\t\u001d\t!\u0208%\t", objectArray);
            }
            case 2: {
                return new Service$Builder(null);
            }
            case 1: 
        }
        return new Service();
    }

    public Api getApis(int n3) {
        return (Api)this.apis_.get(n3);
    }

    public int getApisCount() {
        return this.apis_.size();
    }

    public List getApisList() {
        return this.apis_;
    }

    public ApiOrBuilder getApisOrBuilder(int n3) {
        return (ApiOrBuilder)this.apis_.get(n3);
    }

    public List getApisOrBuilderList() {
        return this.apis_;
    }

    public Authentication getAuthentication() {
        Authentication authentication = this.authentication_;
        if (authentication == null) {
            authentication = Authentication.getDefaultInstance();
        }
        return authentication;
    }

    public Backend getBackend() {
        Backend backend = this.backend_;
        if (backend == null) {
            backend = Backend.getDefaultInstance();
        }
        return backend;
    }

    public Billing getBilling() {
        Billing billing = this.billing_;
        if (billing == null) {
            billing = Billing.getDefaultInstance();
        }
        return billing;
    }

    public UInt32Value getConfigVersion() {
        UInt32Value uInt32Value = this.configVersion_;
        if (uInt32Value == null) {
            uInt32Value = UInt32Value.getDefaultInstance();
        }
        return uInt32Value;
    }

    public Context getContext() {
        Context context = this.context_;
        if (context == null) {
            context = Context.getDefaultInstance();
        }
        return context;
    }

    public Control getControl() {
        Control control = this.control_;
        if (control == null) {
            control = Control.getDefaultInstance();
        }
        return control;
    }

    public Documentation getDocumentation() {
        Documentation documentation = this.documentation_;
        if (documentation == null) {
            documentation = Documentation.getDefaultInstance();
        }
        return documentation;
    }

    public Endpoint getEndpoints(int n3) {
        return (Endpoint)this.endpoints_.get(n3);
    }

    public int getEndpointsCount() {
        return this.endpoints_.size();
    }

    public List getEndpointsList() {
        return this.endpoints_;
    }

    public EndpointOrBuilder getEndpointsOrBuilder(int n3) {
        return (EndpointOrBuilder)this.endpoints_.get(n3);
    }

    public List getEndpointsOrBuilderList() {
        return this.endpoints_;
    }

    public Enum getEnums(int n3) {
        return (Enum)this.enums_.get(n3);
    }

    public int getEnumsCount() {
        return this.enums_.size();
    }

    public List getEnumsList() {
        return this.enums_;
    }

    public EnumOrBuilder getEnumsOrBuilder(int n3) {
        return (EnumOrBuilder)this.enums_.get(n3);
    }

    public List getEnumsOrBuilderList() {
        return this.enums_;
    }

    public Http getHttp() {
        Http http = this.http_;
        if (http == null) {
            http = Http.getDefaultInstance();
        }
        return http;
    }

    public String getId() {
        return this.id_;
    }

    public ByteString getIdBytes() {
        return ByteString.copyFromUtf8(this.id_);
    }

    public Logging getLogging() {
        Logging logging = this.logging_;
        if (logging == null) {
            logging = Logging.getDefaultInstance();
        }
        return logging;
    }

    public LogDescriptor getLogs(int n3) {
        return (LogDescriptor)this.logs_.get(n3);
    }

    public int getLogsCount() {
        return this.logs_.size();
    }

    public List getLogsList() {
        return this.logs_;
    }

    public LogDescriptorOrBuilder getLogsOrBuilder(int n3) {
        return (LogDescriptorOrBuilder)this.logs_.get(n3);
    }

    public List getLogsOrBuilderList() {
        return this.logs_;
    }

    public MetricDescriptor getMetrics(int n3) {
        return (MetricDescriptor)this.metrics_.get(n3);
    }

    public int getMetricsCount() {
        return this.metrics_.size();
    }

    public List getMetricsList() {
        return this.metrics_;
    }

    public MetricDescriptorOrBuilder getMetricsOrBuilder(int n3) {
        return (MetricDescriptorOrBuilder)this.metrics_.get(n3);
    }

    public List getMetricsOrBuilderList() {
        return this.metrics_;
    }

    public MonitoredResourceDescriptor getMonitoredResources(int n3) {
        return (MonitoredResourceDescriptor)this.monitoredResources_.get(n3);
    }

    public int getMonitoredResourcesCount() {
        return this.monitoredResources_.size();
    }

    public List getMonitoredResourcesList() {
        return this.monitoredResources_;
    }

    public MonitoredResourceDescriptorOrBuilder getMonitoredResourcesOrBuilder(int n3) {
        return (MonitoredResourceDescriptorOrBuilder)this.monitoredResources_.get(n3);
    }

    public List getMonitoredResourcesOrBuilderList() {
        return this.monitoredResources_;
    }

    public Monitoring getMonitoring() {
        Monitoring monitoring = this.monitoring_;
        if (monitoring == null) {
            monitoring = Monitoring.getDefaultInstance();
        }
        return monitoring;
    }

    public String getName() {
        return this.name_;
    }

    public ByteString getNameBytes() {
        return ByteString.copyFromUtf8(this.name_);
    }

    public String getProducerProjectId() {
        return this.producerProjectId_;
    }

    public ByteString getProducerProjectIdBytes() {
        return ByteString.copyFromUtf8(this.producerProjectId_);
    }

    public Quota getQuota() {
        Quota quota = this.quota_;
        if (quota == null) {
            quota = Quota.getDefaultInstance();
        }
        return quota;
    }

    public SourceInfo getSourceInfo() {
        SourceInfo sourceInfo = this.sourceInfo_;
        if (sourceInfo == null) {
            sourceInfo = SourceInfo.getDefaultInstance();
        }
        return sourceInfo;
    }

    public SystemParameters getSystemParameters() {
        SystemParameters systemParameters = this.systemParameters_;
        if (systemParameters == null) {
            systemParameters = SystemParameters.getDefaultInstance();
        }
        return systemParameters;
    }

    public String getTitle() {
        return this.title_;
    }

    public ByteString getTitleBytes() {
        return ByteString.copyFromUtf8(this.title_);
    }

    public Type getTypes(int n3) {
        return (Type)this.types_.get(n3);
    }

    public int getTypesCount() {
        return this.types_.size();
    }

    public List getTypesList() {
        return this.types_;
    }

    public TypeOrBuilder getTypesOrBuilder(int n3) {
        return (TypeOrBuilder)this.types_.get(n3);
    }

    public List getTypesOrBuilderList() {
        return this.types_;
    }

    public Usage getUsage() {
        Usage usage = this.usage_;
        if (usage == null) {
            usage = Usage.getDefaultInstance();
        }
        return usage;
    }

    public boolean hasAuthentication() {
        boolean bl2;
        Authentication authentication = this.authentication_;
        if (authentication != null) {
            bl2 = true;
        } else {
            bl2 = false;
            authentication = null;
        }
        return bl2;
    }

    public boolean hasBackend() {
        boolean bl2;
        Backend backend = this.backend_;
        if (backend != null) {
            bl2 = true;
        } else {
            bl2 = false;
            backend = null;
        }
        return bl2;
    }

    public boolean hasBilling() {
        boolean bl2;
        Billing billing = this.billing_;
        if (billing != null) {
            bl2 = true;
        } else {
            bl2 = false;
            billing = null;
        }
        return bl2;
    }

    public boolean hasConfigVersion() {
        boolean bl2;
        UInt32Value uInt32Value = this.configVersion_;
        if (uInt32Value != null) {
            bl2 = true;
        } else {
            bl2 = false;
            uInt32Value = null;
        }
        return bl2;
    }

    public boolean hasContext() {
        boolean bl2;
        Context context = this.context_;
        if (context != null) {
            bl2 = true;
        } else {
            bl2 = false;
            context = null;
        }
        return bl2;
    }

    public boolean hasControl() {
        boolean bl2;
        Control control = this.control_;
        if (control != null) {
            bl2 = true;
        } else {
            bl2 = false;
            control = null;
        }
        return bl2;
    }

    public boolean hasDocumentation() {
        boolean bl2;
        Documentation documentation = this.documentation_;
        if (documentation != null) {
            bl2 = true;
        } else {
            bl2 = false;
            documentation = null;
        }
        return bl2;
    }

    public boolean hasHttp() {
        boolean bl2;
        Http http = this.http_;
        if (http != null) {
            bl2 = true;
        } else {
            bl2 = false;
            http = null;
        }
        return bl2;
    }

    public boolean hasLogging() {
        boolean bl2;
        Logging logging = this.logging_;
        if (logging != null) {
            bl2 = true;
        } else {
            bl2 = false;
            logging = null;
        }
        return bl2;
    }

    public boolean hasMonitoring() {
        boolean bl2;
        Monitoring monitoring = this.monitoring_;
        if (monitoring != null) {
            bl2 = true;
        } else {
            bl2 = false;
            monitoring = null;
        }
        return bl2;
    }

    public boolean hasQuota() {
        boolean bl2;
        Quota quota = this.quota_;
        if (quota != null) {
            bl2 = true;
        } else {
            bl2 = false;
            quota = null;
        }
        return bl2;
    }

    public boolean hasSourceInfo() {
        boolean bl2;
        SourceInfo sourceInfo = this.sourceInfo_;
        if (sourceInfo != null) {
            bl2 = true;
        } else {
            bl2 = false;
            sourceInfo = null;
        }
        return bl2;
    }

    public boolean hasSystemParameters() {
        boolean bl2;
        SystemParameters systemParameters = this.systemParameters_;
        if (systemParameters != null) {
            bl2 = true;
        } else {
            bl2 = false;
            systemParameters = null;
        }
        return bl2;
    }

    public boolean hasUsage() {
        boolean bl2;
        Usage usage = this.usage_;
        if (usage != null) {
            bl2 = true;
        } else {
            bl2 = false;
            usage = null;
        }
        return bl2;
    }
}

