/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.messaging.reporting;

import com.google.firebase.messaging.reporting.MessagingClientEvent$Builder;
import com.google.firebase.messaging.reporting.MessagingClientEvent$Event;
import com.google.firebase.messaging.reporting.MessagingClientEvent$MessageType;
import com.google.firebase.messaging.reporting.MessagingClientEvent$SDKPlatform;

public final class MessagingClientEvent {
    private static final MessagingClientEvent DEFAULT_INSTANCE;
    private final String analytics_label_;
    private final long bulk_id_;
    private final long campaign_id_;
    private final String collapse_key_;
    private final String composer_label_;
    private final MessagingClientEvent$Event event_;
    private final String instance_id_;
    private final String message_id_;
    private final MessagingClientEvent$MessageType message_type_;
    private final String package_name_;
    private final int priority_;
    private final long project_number_;
    private final MessagingClientEvent$SDKPlatform sdk_platform_;
    private final String topic_;
    private final int ttl_;

    static {
        MessagingClientEvent$Builder messagingClientEvent$Builder = new MessagingClientEvent$Builder();
        DEFAULT_INSTANCE = messagingClientEvent$Builder.build();
    }

    public MessagingClientEvent(long l2, String string2, String string3, MessagingClientEvent$MessageType messagingClientEvent$MessageType, MessagingClientEvent$SDKPlatform messagingClientEvent$SDKPlatform, String string4, String string5, int n3, int n4, String string6, long l3, MessagingClientEvent$Event messagingClientEvent$Event, String string7, long l4, String string8) {
        this.project_number_ = l2;
        this.message_id_ = string2;
        this.instance_id_ = string3;
        this.message_type_ = messagingClientEvent$MessageType;
        this.sdk_platform_ = messagingClientEvent$SDKPlatform;
        this.package_name_ = string4;
        this.collapse_key_ = string5;
        this.priority_ = n3;
        this.ttl_ = n4;
        this.topic_ = string6;
        this.bulk_id_ = l3;
        this.event_ = messagingClientEvent$Event;
        this.analytics_label_ = string7;
        this.campaign_id_ = l4;
        this.composer_label_ = string8;
    }

    public static MessagingClientEvent getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static MessagingClientEvent$Builder newBuilder() {
        MessagingClientEvent$Builder messagingClientEvent$Builder = new MessagingClientEvent$Builder();
        return messagingClientEvent$Builder;
    }

    public String getAnalyticsLabel() {
        return this.analytics_label_;
    }

    public long getBulkId() {
        return this.bulk_id_;
    }

    public long getCampaignId() {
        return this.campaign_id_;
    }

    public String getCollapseKey() {
        return this.collapse_key_;
    }

    public String getComposerLabel() {
        return this.composer_label_;
    }

    public MessagingClientEvent$Event getEvent() {
        return this.event_;
    }

    public String getInstanceId() {
        return this.instance_id_;
    }

    public String getMessageId() {
        return this.message_id_;
    }

    public MessagingClientEvent$MessageType getMessageType() {
        return this.message_type_;
    }

    public String getPackageName() {
        return this.package_name_;
    }

    public int getPriority() {
        return this.priority_;
    }

    public long getProjectNumber() {
        return this.project_number_;
    }

    public MessagingClientEvent$SDKPlatform getSdkPlatform() {
        return this.sdk_platform_;
    }

    public String getTopic() {
        return this.topic_;
    }

    public int getTtl() {
        return this.ttl_;
    }
}

