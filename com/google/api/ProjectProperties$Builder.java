/*
 * Decompiled with CFR 0.152.
 */
package com.google.api;

import com.google.api.ProjectProperties;
import com.google.api.ProjectProperties$1;
import com.google.api.ProjectPropertiesOrBuilder;
import com.google.api.Property;
import com.google.api.Property$Builder;
import com.google.protobuf.GeneratedMessageLite$Builder;
import java.util.Collections;
import java.util.List;

public final class ProjectProperties$Builder
extends GeneratedMessageLite$Builder
implements ProjectPropertiesOrBuilder {
    private ProjectProperties$Builder() {
        ProjectProperties projectProperties = ProjectProperties.access$000();
        super(projectProperties);
    }

    public /* synthetic */ ProjectProperties$Builder(ProjectProperties$1 projectProperties$1) {
        this();
    }

    public ProjectProperties$Builder addAllProperties(Iterable iterable) {
        this.copyOnWrite();
        ProjectProperties.access$400((ProjectProperties)this.instance, iterable);
        return this;
    }

    public ProjectProperties$Builder addProperties(int n3, Property$Builder propertyOrBuilder) {
        this.copyOnWrite();
        ProjectProperties projectProperties = (ProjectProperties)this.instance;
        propertyOrBuilder = (Property)propertyOrBuilder.build();
        ProjectProperties.access$300(projectProperties, n3, (Property)propertyOrBuilder);
        return this;
    }

    public ProjectProperties$Builder addProperties(int n3, Property property) {
        this.copyOnWrite();
        ProjectProperties.access$300((ProjectProperties)this.instance, n3, property);
        return this;
    }

    public ProjectProperties$Builder addProperties(Property$Builder propertyOrBuilder) {
        this.copyOnWrite();
        ProjectProperties projectProperties = (ProjectProperties)this.instance;
        propertyOrBuilder = (Property)propertyOrBuilder.build();
        ProjectProperties.access$200(projectProperties, (Property)propertyOrBuilder);
        return this;
    }

    public ProjectProperties$Builder addProperties(Property property) {
        this.copyOnWrite();
        ProjectProperties.access$200((ProjectProperties)this.instance, property);
        return this;
    }

    public ProjectProperties$Builder clearProperties() {
        this.copyOnWrite();
        ProjectProperties.access$500((ProjectProperties)this.instance);
        return this;
    }

    public Property getProperties(int n3) {
        return ((ProjectProperties)this.instance).getProperties(n3);
    }

    public int getPropertiesCount() {
        return ((ProjectProperties)this.instance).getPropertiesCount();
    }

    public List getPropertiesList() {
        return Collections.unmodifiableList(((ProjectProperties)this.instance).getPropertiesList());
    }

    public ProjectProperties$Builder removeProperties(int n3) {
        this.copyOnWrite();
        ProjectProperties.access$600((ProjectProperties)this.instance, n3);
        return this;
    }

    public ProjectProperties$Builder setProperties(int n3, Property$Builder propertyOrBuilder) {
        this.copyOnWrite();
        ProjectProperties projectProperties = (ProjectProperties)this.instance;
        propertyOrBuilder = (Property)propertyOrBuilder.build();
        ProjectProperties.access$100(projectProperties, n3, (Property)propertyOrBuilder);
        return this;
    }

    public ProjectProperties$Builder setProperties(int n3, Property property) {
        this.copyOnWrite();
        ProjectProperties.access$100((ProjectProperties)this.instance, n3, property);
        return this;
    }
}

