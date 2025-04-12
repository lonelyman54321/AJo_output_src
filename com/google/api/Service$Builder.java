/*
 * Decompiled with CFR 0.152.
 */
package com.google.api;

import com.google.api.Authentication;
import com.google.api.Authentication$Builder;
import com.google.api.Backend;
import com.google.api.Backend$Builder;
import com.google.api.Billing;
import com.google.api.Billing$Builder;
import com.google.api.Context;
import com.google.api.Context$Builder;
import com.google.api.Control;
import com.google.api.Control$Builder;
import com.google.api.Documentation;
import com.google.api.Documentation$Builder;
import com.google.api.Endpoint;
import com.google.api.Endpoint$Builder;
import com.google.api.Http;
import com.google.api.Http$Builder;
import com.google.api.LogDescriptor;
import com.google.api.LogDescriptor$Builder;
import com.google.api.Logging;
import com.google.api.Logging$Builder;
import com.google.api.MetricDescriptor;
import com.google.api.MetricDescriptor$Builder;
import com.google.api.MonitoredResourceDescriptor;
import com.google.api.MonitoredResourceDescriptor$Builder;
import com.google.api.Monitoring;
import com.google.api.Monitoring$Builder;
import com.google.api.Quota;
import com.google.api.Quota$Builder;
import com.google.api.Service;
import com.google.api.Service$1;
import com.google.api.ServiceOrBuilder;
import com.google.api.SourceInfo;
import com.google.api.SourceInfo$Builder;
import com.google.api.SystemParameters;
import com.google.api.SystemParameters$Builder;
import com.google.api.Usage;
import com.google.api.Usage$Builder;
import com.google.protobuf.Api;
import com.google.protobuf.Api$Builder;
import com.google.protobuf.ByteString;
import com.google.protobuf.Enum;
import com.google.protobuf.Enum$Builder;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.google.protobuf.Type;
import com.google.protobuf.Type$Builder;
import com.google.protobuf.UInt32Value;
import com.google.protobuf.UInt32Value$Builder;
import java.util.Collections;
import java.util.List;

public final class Service$Builder
extends GeneratedMessageLite$Builder
implements ServiceOrBuilder {
    private Service$Builder() {
        Service service = Service.access$000();
        super(service);
    }

    public /* synthetic */ Service$Builder(Service$1 service$1) {
        this();
    }

    public Service$Builder addAllApis(Iterable iterable) {
        this.copyOnWrite();
        Service.access$1900((Service)this.instance, iterable);
        return this;
    }

    public Service$Builder addAllEndpoints(Iterable iterable) {
        this.copyOnWrite();
        Service.access$5800((Service)this.instance, iterable);
        return this;
    }

    public Service$Builder addAllEnums(Iterable iterable) {
        this.copyOnWrite();
        Service.access$3100((Service)this.instance, iterable);
        return this;
    }

    public Service$Builder addAllLogs(Iterable iterable) {
        this.copyOnWrite();
        Service.access$6700((Service)this.instance, iterable);
        return this;
    }

    public Service$Builder addAllMetrics(Iterable iterable) {
        this.copyOnWrite();
        Service.access$7300((Service)this.instance, iterable);
        return this;
    }

    public Service$Builder addAllMonitoredResources(Iterable iterable) {
        this.copyOnWrite();
        Service.access$7900((Service)this.instance, iterable);
        return this;
    }

    public Service$Builder addAllTypes(Iterable iterable) {
        this.copyOnWrite();
        Service.access$2500((Service)this.instance, iterable);
        return this;
    }

    public Service$Builder addApis(int n3, Api$Builder apiOrBuilder) {
        this.copyOnWrite();
        Service service = (Service)this.instance;
        apiOrBuilder = (Api)apiOrBuilder.build();
        Service.access$1800(service, n3, (Api)apiOrBuilder);
        return this;
    }

    public Service$Builder addApis(int n3, Api api) {
        this.copyOnWrite();
        Service.access$1800((Service)this.instance, n3, api);
        return this;
    }

    public Service$Builder addApis(Api$Builder apiOrBuilder) {
        this.copyOnWrite();
        Service service = (Service)this.instance;
        apiOrBuilder = (Api)apiOrBuilder.build();
        Service.access$1700(service, (Api)apiOrBuilder);
        return this;
    }

    public Service$Builder addApis(Api api) {
        this.copyOnWrite();
        Service.access$1700((Service)this.instance, api);
        return this;
    }

    public Service$Builder addEndpoints(int n3, Endpoint$Builder endpointOrBuilder) {
        this.copyOnWrite();
        Service service = (Service)this.instance;
        endpointOrBuilder = (Endpoint)endpointOrBuilder.build();
        Service.access$5700(service, n3, (Endpoint)endpointOrBuilder);
        return this;
    }

    public Service$Builder addEndpoints(int n3, Endpoint endpoint) {
        this.copyOnWrite();
        Service.access$5700((Service)this.instance, n3, endpoint);
        return this;
    }

    public Service$Builder addEndpoints(Endpoint$Builder endpointOrBuilder) {
        this.copyOnWrite();
        Service service = (Service)this.instance;
        endpointOrBuilder = (Endpoint)endpointOrBuilder.build();
        Service.access$5600(service, (Endpoint)endpointOrBuilder);
        return this;
    }

    public Service$Builder addEndpoints(Endpoint endpoint) {
        this.copyOnWrite();
        Service.access$5600((Service)this.instance, endpoint);
        return this;
    }

    public Service$Builder addEnums(int n3, Enum$Builder enumOrBuilder) {
        this.copyOnWrite();
        Service service = (Service)this.instance;
        enumOrBuilder = (Enum)enumOrBuilder.build();
        Service.access$3000(service, n3, (Enum)enumOrBuilder);
        return this;
    }

    public Service$Builder addEnums(int n3, Enum enum_) {
        this.copyOnWrite();
        Service.access$3000((Service)this.instance, n3, enum_);
        return this;
    }

    public Service$Builder addEnums(Enum$Builder enumOrBuilder) {
        this.copyOnWrite();
        Service service = (Service)this.instance;
        enumOrBuilder = (Enum)enumOrBuilder.build();
        Service.access$2900(service, (Enum)enumOrBuilder);
        return this;
    }

    public Service$Builder addEnums(Enum enum_) {
        this.copyOnWrite();
        Service.access$2900((Service)this.instance, enum_);
        return this;
    }

    public Service$Builder addLogs(int n3, LogDescriptor$Builder logDescriptorOrBuilder) {
        this.copyOnWrite();
        Service service = (Service)this.instance;
        logDescriptorOrBuilder = (LogDescriptor)logDescriptorOrBuilder.build();
        Service.access$6600(service, n3, (LogDescriptor)logDescriptorOrBuilder);
        return this;
    }

    public Service$Builder addLogs(int n3, LogDescriptor logDescriptor) {
        this.copyOnWrite();
        Service.access$6600((Service)this.instance, n3, logDescriptor);
        return this;
    }

    public Service$Builder addLogs(LogDescriptor$Builder logDescriptorOrBuilder) {
        this.copyOnWrite();
        Service service = (Service)this.instance;
        logDescriptorOrBuilder = (LogDescriptor)logDescriptorOrBuilder.build();
        Service.access$6500(service, (LogDescriptor)logDescriptorOrBuilder);
        return this;
    }

    public Service$Builder addLogs(LogDescriptor logDescriptor) {
        this.copyOnWrite();
        Service.access$6500((Service)this.instance, logDescriptor);
        return this;
    }

    public Service$Builder addMetrics(int n3, MetricDescriptor$Builder metricDescriptorOrBuilder) {
        this.copyOnWrite();
        Service service = (Service)this.instance;
        metricDescriptorOrBuilder = (MetricDescriptor)metricDescriptorOrBuilder.build();
        Service.access$7200(service, n3, (MetricDescriptor)metricDescriptorOrBuilder);
        return this;
    }

    public Service$Builder addMetrics(int n3, MetricDescriptor metricDescriptor) {
        this.copyOnWrite();
        Service.access$7200((Service)this.instance, n3, metricDescriptor);
        return this;
    }

    public Service$Builder addMetrics(MetricDescriptor$Builder metricDescriptorOrBuilder) {
        this.copyOnWrite();
        Service service = (Service)this.instance;
        metricDescriptorOrBuilder = (MetricDescriptor)metricDescriptorOrBuilder.build();
        Service.access$7100(service, (MetricDescriptor)metricDescriptorOrBuilder);
        return this;
    }

    public Service$Builder addMetrics(MetricDescriptor metricDescriptor) {
        this.copyOnWrite();
        Service.access$7100((Service)this.instance, metricDescriptor);
        return this;
    }

    public Service$Builder addMonitoredResources(int n3, MonitoredResourceDescriptor$Builder monitoredResourceDescriptorOrBuilder) {
        this.copyOnWrite();
        Service service = (Service)this.instance;
        monitoredResourceDescriptorOrBuilder = (MonitoredResourceDescriptor)monitoredResourceDescriptorOrBuilder.build();
        Service.access$7800(service, n3, (MonitoredResourceDescriptor)monitoredResourceDescriptorOrBuilder);
        return this;
    }

    public Service$Builder addMonitoredResources(int n3, MonitoredResourceDescriptor monitoredResourceDescriptor) {
        this.copyOnWrite();
        Service.access$7800((Service)this.instance, n3, monitoredResourceDescriptor);
        return this;
    }

    public Service$Builder addMonitoredResources(MonitoredResourceDescriptor$Builder monitoredResourceDescriptorOrBuilder) {
        this.copyOnWrite();
        Service service = (Service)this.instance;
        monitoredResourceDescriptorOrBuilder = (MonitoredResourceDescriptor)monitoredResourceDescriptorOrBuilder.build();
        Service.access$7700(service, (MonitoredResourceDescriptor)monitoredResourceDescriptorOrBuilder);
        return this;
    }

    public Service$Builder addMonitoredResources(MonitoredResourceDescriptor monitoredResourceDescriptor) {
        this.copyOnWrite();
        Service.access$7700((Service)this.instance, monitoredResourceDescriptor);
        return this;
    }

    public Service$Builder addTypes(int n3, Type$Builder typeOrBuilder) {
        this.copyOnWrite();
        Service service = (Service)this.instance;
        typeOrBuilder = (Type)typeOrBuilder.build();
        Service.access$2400(service, n3, (Type)typeOrBuilder);
        return this;
    }

    public Service$Builder addTypes(int n3, Type type2) {
        this.copyOnWrite();
        Service.access$2400((Service)this.instance, n3, type2);
        return this;
    }

    public Service$Builder addTypes(Type$Builder typeOrBuilder) {
        this.copyOnWrite();
        Service service = (Service)this.instance;
        typeOrBuilder = (Type)typeOrBuilder.build();
        Service.access$2300(service, (Type)typeOrBuilder);
        return this;
    }

    public Service$Builder addTypes(Type type2) {
        this.copyOnWrite();
        Service.access$2300((Service)this.instance, type2);
        return this;
    }

    public Service$Builder clearApis() {
        this.copyOnWrite();
        Service.access$2000((Service)this.instance);
        return this;
    }

    public Service$Builder clearAuthentication() {
        this.copyOnWrite();
        Service.access$4800((Service)this.instance);
        return this;
    }

    public Service$Builder clearBackend() {
        this.copyOnWrite();
        Service.access$3900((Service)this.instance);
        return this;
    }

    public Service$Builder clearBilling() {
        this.copyOnWrite();
        Service.access$8400((Service)this.instance);
        return this;
    }

    public Service$Builder clearConfigVersion() {
        this.copyOnWrite();
        Service.access$300((Service)this.instance);
        return this;
    }

    public Service$Builder clearContext() {
        this.copyOnWrite();
        Service.access$5100((Service)this.instance);
        return this;
    }

    public Service$Builder clearControl() {
        this.copyOnWrite();
        Service.access$6300((Service)this.instance);
        return this;
    }

    public Service$Builder clearDocumentation() {
        this.copyOnWrite();
        Service.access$3600((Service)this.instance);
        return this;
    }

    public Service$Builder clearEndpoints() {
        this.copyOnWrite();
        Service.access$5900((Service)this.instance);
        return this;
    }

    public Service$Builder clearEnums() {
        this.copyOnWrite();
        Service.access$3200((Service)this.instance);
        return this;
    }

    public Service$Builder clearHttp() {
        this.copyOnWrite();
        Service.access$4200((Service)this.instance);
        return this;
    }

    public Service$Builder clearId() {
        this.copyOnWrite();
        Service.access$800((Service)this.instance);
        return this;
    }

    public Service$Builder clearLogging() {
        this.copyOnWrite();
        Service.access$8700((Service)this.instance);
        return this;
    }

    public Service$Builder clearLogs() {
        this.copyOnWrite();
        Service.access$6800((Service)this.instance);
        return this;
    }

    public Service$Builder clearMetrics() {
        this.copyOnWrite();
        Service.access$7400((Service)this.instance);
        return this;
    }

    public Service$Builder clearMonitoredResources() {
        this.copyOnWrite();
        Service.access$8000((Service)this.instance);
        return this;
    }

    public Service$Builder clearMonitoring() {
        this.copyOnWrite();
        Service.access$9000((Service)this.instance);
        return this;
    }

    public Service$Builder clearName() {
        this.copyOnWrite();
        Service.access$500((Service)this.instance);
        return this;
    }

    public Service$Builder clearProducerProjectId() {
        this.copyOnWrite();
        Service.access$1400((Service)this.instance);
        return this;
    }

    public Service$Builder clearQuota() {
        this.copyOnWrite();
        Service.access$4500((Service)this.instance);
        return this;
    }

    public Service$Builder clearSourceInfo() {
        this.copyOnWrite();
        Service.access$9600((Service)this.instance);
        return this;
    }

    public Service$Builder clearSystemParameters() {
        this.copyOnWrite();
        Service.access$9300((Service)this.instance);
        return this;
    }

    public Service$Builder clearTitle() {
        this.copyOnWrite();
        Service.access$1100((Service)this.instance);
        return this;
    }

    public Service$Builder clearTypes() {
        this.copyOnWrite();
        Service.access$2600((Service)this.instance);
        return this;
    }

    public Service$Builder clearUsage() {
        this.copyOnWrite();
        Service.access$5400((Service)this.instance);
        return this;
    }

    public Api getApis(int n3) {
        return ((Service)this.instance).getApis(n3);
    }

    public int getApisCount() {
        return ((Service)this.instance).getApisCount();
    }

    public List getApisList() {
        return Collections.unmodifiableList(((Service)this.instance).getApisList());
    }

    public Authentication getAuthentication() {
        return ((Service)this.instance).getAuthentication();
    }

    public Backend getBackend() {
        return ((Service)this.instance).getBackend();
    }

    public Billing getBilling() {
        return ((Service)this.instance).getBilling();
    }

    public UInt32Value getConfigVersion() {
        return ((Service)this.instance).getConfigVersion();
    }

    public Context getContext() {
        return ((Service)this.instance).getContext();
    }

    public Control getControl() {
        return ((Service)this.instance).getControl();
    }

    public Documentation getDocumentation() {
        return ((Service)this.instance).getDocumentation();
    }

    public Endpoint getEndpoints(int n3) {
        return ((Service)this.instance).getEndpoints(n3);
    }

    public int getEndpointsCount() {
        return ((Service)this.instance).getEndpointsCount();
    }

    public List getEndpointsList() {
        return Collections.unmodifiableList(((Service)this.instance).getEndpointsList());
    }

    public Enum getEnums(int n3) {
        return ((Service)this.instance).getEnums(n3);
    }

    public int getEnumsCount() {
        return ((Service)this.instance).getEnumsCount();
    }

    public List getEnumsList() {
        return Collections.unmodifiableList(((Service)this.instance).getEnumsList());
    }

    public Http getHttp() {
        return ((Service)this.instance).getHttp();
    }

    public String getId() {
        return ((Service)this.instance).getId();
    }

    public ByteString getIdBytes() {
        return ((Service)this.instance).getIdBytes();
    }

    public Logging getLogging() {
        return ((Service)this.instance).getLogging();
    }

    public LogDescriptor getLogs(int n3) {
        return ((Service)this.instance).getLogs(n3);
    }

    public int getLogsCount() {
        return ((Service)this.instance).getLogsCount();
    }

    public List getLogsList() {
        return Collections.unmodifiableList(((Service)this.instance).getLogsList());
    }

    public MetricDescriptor getMetrics(int n3) {
        return ((Service)this.instance).getMetrics(n3);
    }

    public int getMetricsCount() {
        return ((Service)this.instance).getMetricsCount();
    }

    public List getMetricsList() {
        return Collections.unmodifiableList(((Service)this.instance).getMetricsList());
    }

    public MonitoredResourceDescriptor getMonitoredResources(int n3) {
        return ((Service)this.instance).getMonitoredResources(n3);
    }

    public int getMonitoredResourcesCount() {
        return ((Service)this.instance).getMonitoredResourcesCount();
    }

    public List getMonitoredResourcesList() {
        return Collections.unmodifiableList(((Service)this.instance).getMonitoredResourcesList());
    }

    public Monitoring getMonitoring() {
        return ((Service)this.instance).getMonitoring();
    }

    public String getName() {
        return ((Service)this.instance).getName();
    }

    public ByteString getNameBytes() {
        return ((Service)this.instance).getNameBytes();
    }

    public String getProducerProjectId() {
        return ((Service)this.instance).getProducerProjectId();
    }

    public ByteString getProducerProjectIdBytes() {
        return ((Service)this.instance).getProducerProjectIdBytes();
    }

    public Quota getQuota() {
        return ((Service)this.instance).getQuota();
    }

    public SourceInfo getSourceInfo() {
        return ((Service)this.instance).getSourceInfo();
    }

    public SystemParameters getSystemParameters() {
        return ((Service)this.instance).getSystemParameters();
    }

    public String getTitle() {
        return ((Service)this.instance).getTitle();
    }

    public ByteString getTitleBytes() {
        return ((Service)this.instance).getTitleBytes();
    }

    public Type getTypes(int n3) {
        return ((Service)this.instance).getTypes(n3);
    }

    public int getTypesCount() {
        return ((Service)this.instance).getTypesCount();
    }

    public List getTypesList() {
        return Collections.unmodifiableList(((Service)this.instance).getTypesList());
    }

    public Usage getUsage() {
        return ((Service)this.instance).getUsage();
    }

    public boolean hasAuthentication() {
        return ((Service)this.instance).hasAuthentication();
    }

    public boolean hasBackend() {
        return ((Service)this.instance).hasBackend();
    }

    public boolean hasBilling() {
        return ((Service)this.instance).hasBilling();
    }

    public boolean hasConfigVersion() {
        return ((Service)this.instance).hasConfigVersion();
    }

    public boolean hasContext() {
        return ((Service)this.instance).hasContext();
    }

    public boolean hasControl() {
        return ((Service)this.instance).hasControl();
    }

    public boolean hasDocumentation() {
        return ((Service)this.instance).hasDocumentation();
    }

    public boolean hasHttp() {
        return ((Service)this.instance).hasHttp();
    }

    public boolean hasLogging() {
        return ((Service)this.instance).hasLogging();
    }

    public boolean hasMonitoring() {
        return ((Service)this.instance).hasMonitoring();
    }

    public boolean hasQuota() {
        return ((Service)this.instance).hasQuota();
    }

    public boolean hasSourceInfo() {
        return ((Service)this.instance).hasSourceInfo();
    }

    public boolean hasSystemParameters() {
        return ((Service)this.instance).hasSystemParameters();
    }

    public boolean hasUsage() {
        return ((Service)this.instance).hasUsage();
    }

    public Service$Builder mergeAuthentication(Authentication authentication) {
        this.copyOnWrite();
        Service.access$4700((Service)this.instance, authentication);
        return this;
    }

    public Service$Builder mergeBackend(Backend backend) {
        this.copyOnWrite();
        Service.access$3800((Service)this.instance, backend);
        return this;
    }

    public Service$Builder mergeBilling(Billing billing) {
        this.copyOnWrite();
        Service.access$8300((Service)this.instance, billing);
        return this;
    }

    public Service$Builder mergeConfigVersion(UInt32Value uInt32Value) {
        this.copyOnWrite();
        Service.access$200((Service)this.instance, uInt32Value);
        return this;
    }

    public Service$Builder mergeContext(Context context) {
        this.copyOnWrite();
        Service.access$5000((Service)this.instance, context);
        return this;
    }

    public Service$Builder mergeControl(Control control) {
        this.copyOnWrite();
        Service.access$6200((Service)this.instance, control);
        return this;
    }

    public Service$Builder mergeDocumentation(Documentation documentation) {
        this.copyOnWrite();
        Service.access$3500((Service)this.instance, documentation);
        return this;
    }

    public Service$Builder mergeHttp(Http http) {
        this.copyOnWrite();
        Service.access$4100((Service)this.instance, http);
        return this;
    }

    public Service$Builder mergeLogging(Logging logging) {
        this.copyOnWrite();
        Service.access$8600((Service)this.instance, logging);
        return this;
    }

    public Service$Builder mergeMonitoring(Monitoring monitoring) {
        this.copyOnWrite();
        Service.access$8900((Service)this.instance, monitoring);
        return this;
    }

    public Service$Builder mergeQuota(Quota quota) {
        this.copyOnWrite();
        Service.access$4400((Service)this.instance, quota);
        return this;
    }

    public Service$Builder mergeSourceInfo(SourceInfo sourceInfo) {
        this.copyOnWrite();
        Service.access$9500((Service)this.instance, sourceInfo);
        return this;
    }

    public Service$Builder mergeSystemParameters(SystemParameters systemParameters) {
        this.copyOnWrite();
        Service.access$9200((Service)this.instance, systemParameters);
        return this;
    }

    public Service$Builder mergeUsage(Usage usage) {
        this.copyOnWrite();
        Service.access$5300((Service)this.instance, usage);
        return this;
    }

    public Service$Builder removeApis(int n3) {
        this.copyOnWrite();
        Service.access$2100((Service)this.instance, n3);
        return this;
    }

    public Service$Builder removeEndpoints(int n3) {
        this.copyOnWrite();
        Service.access$6000((Service)this.instance, n3);
        return this;
    }

    public Service$Builder removeEnums(int n3) {
        this.copyOnWrite();
        Service.access$3300((Service)this.instance, n3);
        return this;
    }

    public Service$Builder removeLogs(int n3) {
        this.copyOnWrite();
        Service.access$6900((Service)this.instance, n3);
        return this;
    }

    public Service$Builder removeMetrics(int n3) {
        this.copyOnWrite();
        Service.access$7500((Service)this.instance, n3);
        return this;
    }

    public Service$Builder removeMonitoredResources(int n3) {
        this.copyOnWrite();
        Service.access$8100((Service)this.instance, n3);
        return this;
    }

    public Service$Builder removeTypes(int n3) {
        this.copyOnWrite();
        Service.access$2700((Service)this.instance, n3);
        return this;
    }

    public Service$Builder setApis(int n3, Api$Builder apiOrBuilder) {
        this.copyOnWrite();
        Service service = (Service)this.instance;
        apiOrBuilder = (Api)apiOrBuilder.build();
        Service.access$1600(service, n3, (Api)apiOrBuilder);
        return this;
    }

    public Service$Builder setApis(int n3, Api api) {
        this.copyOnWrite();
        Service.access$1600((Service)this.instance, n3, api);
        return this;
    }

    public Service$Builder setAuthentication(Authentication$Builder authenticationOrBuilder) {
        this.copyOnWrite();
        Service service = (Service)this.instance;
        authenticationOrBuilder = (Authentication)authenticationOrBuilder.build();
        Service.access$4600(service, (Authentication)authenticationOrBuilder);
        return this;
    }

    public Service$Builder setAuthentication(Authentication authentication) {
        this.copyOnWrite();
        Service.access$4600((Service)this.instance, authentication);
        return this;
    }

    public Service$Builder setBackend(Backend$Builder backendOrBuilder) {
        this.copyOnWrite();
        Service service = (Service)this.instance;
        backendOrBuilder = (Backend)backendOrBuilder.build();
        Service.access$3700(service, (Backend)backendOrBuilder);
        return this;
    }

    public Service$Builder setBackend(Backend backend) {
        this.copyOnWrite();
        Service.access$3700((Service)this.instance, backend);
        return this;
    }

    public Service$Builder setBilling(Billing$Builder billingOrBuilder) {
        this.copyOnWrite();
        Service service = (Service)this.instance;
        billingOrBuilder = (Billing)billingOrBuilder.build();
        Service.access$8200(service, (Billing)billingOrBuilder);
        return this;
    }

    public Service$Builder setBilling(Billing billing) {
        this.copyOnWrite();
        Service.access$8200((Service)this.instance, billing);
        return this;
    }

    public Service$Builder setConfigVersion(UInt32Value$Builder uInt32ValueOrBuilder) {
        this.copyOnWrite();
        Service service = (Service)this.instance;
        uInt32ValueOrBuilder = (UInt32Value)uInt32ValueOrBuilder.build();
        Service.access$100(service, (UInt32Value)uInt32ValueOrBuilder);
        return this;
    }

    public Service$Builder setConfigVersion(UInt32Value uInt32Value) {
        this.copyOnWrite();
        Service.access$100((Service)this.instance, uInt32Value);
        return this;
    }

    public Service$Builder setContext(Context$Builder contextOrBuilder) {
        this.copyOnWrite();
        Service service = (Service)this.instance;
        contextOrBuilder = (Context)contextOrBuilder.build();
        Service.access$4900(service, (Context)contextOrBuilder);
        return this;
    }

    public Service$Builder setContext(Context context) {
        this.copyOnWrite();
        Service.access$4900((Service)this.instance, context);
        return this;
    }

    public Service$Builder setControl(Control$Builder controlOrBuilder) {
        this.copyOnWrite();
        Service service = (Service)this.instance;
        controlOrBuilder = (Control)controlOrBuilder.build();
        Service.access$6100(service, (Control)controlOrBuilder);
        return this;
    }

    public Service$Builder setControl(Control control) {
        this.copyOnWrite();
        Service.access$6100((Service)this.instance, control);
        return this;
    }

    public Service$Builder setDocumentation(Documentation$Builder documentationOrBuilder) {
        this.copyOnWrite();
        Service service = (Service)this.instance;
        documentationOrBuilder = (Documentation)documentationOrBuilder.build();
        Service.access$3400(service, (Documentation)documentationOrBuilder);
        return this;
    }

    public Service$Builder setDocumentation(Documentation documentation) {
        this.copyOnWrite();
        Service.access$3400((Service)this.instance, documentation);
        return this;
    }

    public Service$Builder setEndpoints(int n3, Endpoint$Builder endpointOrBuilder) {
        this.copyOnWrite();
        Service service = (Service)this.instance;
        endpointOrBuilder = (Endpoint)endpointOrBuilder.build();
        Service.access$5500(service, n3, (Endpoint)endpointOrBuilder);
        return this;
    }

    public Service$Builder setEndpoints(int n3, Endpoint endpoint) {
        this.copyOnWrite();
        Service.access$5500((Service)this.instance, n3, endpoint);
        return this;
    }

    public Service$Builder setEnums(int n3, Enum$Builder enumOrBuilder) {
        this.copyOnWrite();
        Service service = (Service)this.instance;
        enumOrBuilder = (Enum)enumOrBuilder.build();
        Service.access$2800(service, n3, (Enum)enumOrBuilder);
        return this;
    }

    public Service$Builder setEnums(int n3, Enum enum_) {
        this.copyOnWrite();
        Service.access$2800((Service)this.instance, n3, enum_);
        return this;
    }

    public Service$Builder setHttp(Http$Builder httpOrBuilder) {
        this.copyOnWrite();
        Service service = (Service)this.instance;
        httpOrBuilder = (Http)httpOrBuilder.build();
        Service.access$4000(service, (Http)httpOrBuilder);
        return this;
    }

    public Service$Builder setHttp(Http http) {
        this.copyOnWrite();
        Service.access$4000((Service)this.instance, http);
        return this;
    }

    public Service$Builder setId(String string2) {
        this.copyOnWrite();
        Service.access$700((Service)this.instance, string2);
        return this;
    }

    public Service$Builder setIdBytes(ByteString byteString) {
        this.copyOnWrite();
        Service.access$900((Service)this.instance, byteString);
        return this;
    }

    public Service$Builder setLogging(Logging$Builder loggingOrBuilder) {
        this.copyOnWrite();
        Service service = (Service)this.instance;
        loggingOrBuilder = (Logging)loggingOrBuilder.build();
        Service.access$8500(service, (Logging)loggingOrBuilder);
        return this;
    }

    public Service$Builder setLogging(Logging logging) {
        this.copyOnWrite();
        Service.access$8500((Service)this.instance, logging);
        return this;
    }

    public Service$Builder setLogs(int n3, LogDescriptor$Builder logDescriptorOrBuilder) {
        this.copyOnWrite();
        Service service = (Service)this.instance;
        logDescriptorOrBuilder = (LogDescriptor)logDescriptorOrBuilder.build();
        Service.access$6400(service, n3, (LogDescriptor)logDescriptorOrBuilder);
        return this;
    }

    public Service$Builder setLogs(int n3, LogDescriptor logDescriptor) {
        this.copyOnWrite();
        Service.access$6400((Service)this.instance, n3, logDescriptor);
        return this;
    }

    public Service$Builder setMetrics(int n3, MetricDescriptor$Builder metricDescriptorOrBuilder) {
        this.copyOnWrite();
        Service service = (Service)this.instance;
        metricDescriptorOrBuilder = (MetricDescriptor)metricDescriptorOrBuilder.build();
        Service.access$7000(service, n3, (MetricDescriptor)metricDescriptorOrBuilder);
        return this;
    }

    public Service$Builder setMetrics(int n3, MetricDescriptor metricDescriptor) {
        this.copyOnWrite();
        Service.access$7000((Service)this.instance, n3, metricDescriptor);
        return this;
    }

    public Service$Builder setMonitoredResources(int n3, MonitoredResourceDescriptor$Builder monitoredResourceDescriptorOrBuilder) {
        this.copyOnWrite();
        Service service = (Service)this.instance;
        monitoredResourceDescriptorOrBuilder = (MonitoredResourceDescriptor)monitoredResourceDescriptorOrBuilder.build();
        Service.access$7600(service, n3, (MonitoredResourceDescriptor)monitoredResourceDescriptorOrBuilder);
        return this;
    }

    public Service$Builder setMonitoredResources(int n3, MonitoredResourceDescriptor monitoredResourceDescriptor) {
        this.copyOnWrite();
        Service.access$7600((Service)this.instance, n3, monitoredResourceDescriptor);
        return this;
    }

    public Service$Builder setMonitoring(Monitoring$Builder monitoringOrBuilder) {
        this.copyOnWrite();
        Service service = (Service)this.instance;
        monitoringOrBuilder = (Monitoring)monitoringOrBuilder.build();
        Service.access$8800(service, (Monitoring)monitoringOrBuilder);
        return this;
    }

    public Service$Builder setMonitoring(Monitoring monitoring) {
        this.copyOnWrite();
        Service.access$8800((Service)this.instance, monitoring);
        return this;
    }

    public Service$Builder setName(String string2) {
        this.copyOnWrite();
        Service.access$400((Service)this.instance, string2);
        return this;
    }

    public Service$Builder setNameBytes(ByteString byteString) {
        this.copyOnWrite();
        Service.access$600((Service)this.instance, byteString);
        return this;
    }

    public Service$Builder setProducerProjectId(String string2) {
        this.copyOnWrite();
        Service.access$1300((Service)this.instance, string2);
        return this;
    }

    public Service$Builder setProducerProjectIdBytes(ByteString byteString) {
        this.copyOnWrite();
        Service.access$1500((Service)this.instance, byteString);
        return this;
    }

    public Service$Builder setQuota(Quota$Builder quotaOrBuilder) {
        this.copyOnWrite();
        Service service = (Service)this.instance;
        quotaOrBuilder = (Quota)quotaOrBuilder.build();
        Service.access$4300(service, (Quota)quotaOrBuilder);
        return this;
    }

    public Service$Builder setQuota(Quota quota) {
        this.copyOnWrite();
        Service.access$4300((Service)this.instance, quota);
        return this;
    }

    public Service$Builder setSourceInfo(SourceInfo$Builder sourceInfoOrBuilder) {
        this.copyOnWrite();
        Service service = (Service)this.instance;
        sourceInfoOrBuilder = (SourceInfo)sourceInfoOrBuilder.build();
        Service.access$9400(service, (SourceInfo)sourceInfoOrBuilder);
        return this;
    }

    public Service$Builder setSourceInfo(SourceInfo sourceInfo) {
        this.copyOnWrite();
        Service.access$9400((Service)this.instance, sourceInfo);
        return this;
    }

    public Service$Builder setSystemParameters(SystemParameters$Builder systemParametersOrBuilder) {
        this.copyOnWrite();
        Service service = (Service)this.instance;
        systemParametersOrBuilder = (SystemParameters)systemParametersOrBuilder.build();
        Service.access$9100(service, (SystemParameters)systemParametersOrBuilder);
        return this;
    }

    public Service$Builder setSystemParameters(SystemParameters systemParameters) {
        this.copyOnWrite();
        Service.access$9100((Service)this.instance, systemParameters);
        return this;
    }

    public Service$Builder setTitle(String string2) {
        this.copyOnWrite();
        Service.access$1000((Service)this.instance, string2);
        return this;
    }

    public Service$Builder setTitleBytes(ByteString byteString) {
        this.copyOnWrite();
        Service.access$1200((Service)this.instance, byteString);
        return this;
    }

    public Service$Builder setTypes(int n3, Type$Builder typeOrBuilder) {
        this.copyOnWrite();
        Service service = (Service)this.instance;
        typeOrBuilder = (Type)typeOrBuilder.build();
        Service.access$2200(service, n3, (Type)typeOrBuilder);
        return this;
    }

    public Service$Builder setTypes(int n3, Type type2) {
        this.copyOnWrite();
        Service.access$2200((Service)this.instance, n3, type2);
        return this;
    }

    public Service$Builder setUsage(Usage$Builder usageOrBuilder) {
        this.copyOnWrite();
        Service service = (Service)this.instance;
        usageOrBuilder = (Usage)usageOrBuilder.build();
        Service.access$5200(service, (Usage)usageOrBuilder);
        return this;
    }

    public Service$Builder setUsage(Usage usage) {
        this.copyOnWrite();
        Service.access$5200((Service)this.instance, usage);
        return this;
    }
}

