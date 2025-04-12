/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.messaging.reporting;

import com.google.firebase.messaging.reporting.MessagingClientEvent;
import com.google.firebase.messaging.reporting.MessagingClientEvent$Event;
import com.google.firebase.messaging.reporting.MessagingClientEvent$MessageType;
import com.google.firebase.messaging.reporting.MessagingClientEvent$SDKPlatform;

public final class MessagingClientEvent$Builder {
    private String analytics_label_;
    private long bulk_id_;
    private long campaign_id_;
    private String collapse_key_;
    private String composer_label_;
    private MessagingClientEvent$Event event_;
    private String instance_id_;
    private String message_id_;
    private MessagingClientEvent$MessageType message_type_;
    private String package_name_;
    private int priority_;
    private long project_number_;
    private MessagingClientEvent$SDKPlatform sdk_platform_;
    private String topic_;
    private int ttl_;

    public MessagingClientEvent$Builder() {
        Enum enum_;
        String string2;
        long l2;
        this.project_number_ = l2 = 0L;
        this.message_id_ = string2 = "";
        this.instance_id_ = string2;
        this.message_type_ = enum_ = MessagingClientEvent$MessageType.UNKNOWN;
        enum_ = MessagingClientEvent$SDKPlatform.UNKNOWN_OS;
        this.sdk_platform_ = enum_;
        this.package_name_ = string2;
        this.collapse_key_ = string2;
        this.priority_ = 0;
        this.ttl_ = 0;
        this.topic_ = string2;
        this.bulk_id_ = l2;
        enum_ = MessagingClientEvent$Event.UNKNOWN_EVENT;
        this.event_ = enum_;
        this.analytics_label_ = string2;
        this.campaign_id_ = l2;
        this.composer_label_ = string2;
    }

    public MessagingClientEvent build() {
        long l2 = this.project_number_;
        String string2 = this.message_id_;
        String string3 = this.instance_id_;
        MessagingClientEvent$MessageType messagingClientEvent$MessageType = this.message_type_;
        MessagingClientEvent$SDKPlatform messagingClientEvent$SDKPlatform = this.sdk_platform_;
        String string4 = this.package_name_;
        String string5 = this.collapse_key_;
        int n3 = this.priority_;
        int n4 = this.ttl_;
        String string6 = this.topic_;
        long l3 = this.bulk_id_;
        MessagingClientEvent$Event messagingClientEvent$Event = this.event_;
        String string7 = this.analytics_label_;
        long l4 = this.campaign_id_;
        String string8 = this.composer_label_;
        MessagingClientEvent messagingClientEvent = new MessagingClientEvent(l2, string2, string3, messagingClientEvent$MessageType, messagingClientEvent$SDKPlatform, string4, string5, n3, n4, string6, l3, messagingClientEvent$Event, string7, l4, string8);
        return messagingClientEvent;
    }

    public MessagingClientEvent$Builder setAnalyticsLabel(String string2) {
        this.analytics_label_ = string2;
        return this;
    }

    public MessagingClientEvent$Builder setBulkId(long l2) {
        this.bulk_id_ = l2;
        return this;
    }

    public MessagingClientEvent$Builder setCampaignId(long l2) {
        this.campaign_id_ = l2;
        return this;
    }

    public MessagingClientEvent$Builder setCollapseKey(String string2) {
        this.collapse_key_ = string2;
        return this;
    }

    public MessagingClientEvent$Builder setComposerLabel(String string2) {
        this.composer_label_ = string2;
        return this;
    }

    public MessagingClientEvent$Builder setEvent(MessagingClientEvent$Event messagingClientEvent$Event) {
        this.event_ = messagingClientEvent$Event;
        return this;
    }

    public MessagingClientEvent$Builder setInstanceId(String string2) {
        this.instance_id_ = string2;
        return this;
    }

    public MessagingClientEvent$Builder setMessageId(String string2) {
        this.message_id_ = string2;
        return this;
    }

    public MessagingClientEvent$Builder setMessageType(MessagingClientEvent$MessageType messagingClientEvent$MessageType) {
        this.message_type_ = messagingClientEvent$MessageType;
        return this;
    }

    public MessagingClientEvent$Builder setPackageName(String string2) {
        this.package_name_ = string2;
        return this;
    }

    public MessagingClientEvent$Builder setPriority(int n3) {
        this.priority_ = n3;
        return this;
    }

    public MessagingClientEvent$Builder setProjectNumber(long l2) {
        this.project_number_ = l2;
        return this;
    }

    public MessagingClientEvent$Builder setSdkPlatform(MessagingClientEvent$SDKPlatform messagingClientEvent$SDKPlatform) {
        this.sdk_platform_ = messagingClientEvent$SDKPlatform;
        return this;
    }

    public MessagingClientEvent$Builder setTopic(String string2) {
        this.topic_ = string2;
        return this;
    }

    public MessagingClientEvent$Builder setTtl(int n3) {
        this.ttl_ = n3;
        return this;
    }
}

