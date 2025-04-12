/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.messaging;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.FieldDescriptor$Builder;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import com.google.firebase.messaging.reporting.MessagingClientEvent;

final class AutoProtoEncoderDoNotUseEncoder$MessagingClientEventEncoder
implements ObjectEncoder {
    private static final FieldDescriptor ANALYTICSLABEL_DESCRIPTOR;
    private static final FieldDescriptor BULKID_DESCRIPTOR;
    private static final FieldDescriptor CAMPAIGNID_DESCRIPTOR;
    private static final FieldDescriptor COLLAPSEKEY_DESCRIPTOR;
    private static final FieldDescriptor COMPOSERLABEL_DESCRIPTOR;
    private static final FieldDescriptor EVENT_DESCRIPTOR;
    static final AutoProtoEncoderDoNotUseEncoder$MessagingClientEventEncoder INSTANCE;
    private static final FieldDescriptor INSTANCEID_DESCRIPTOR;
    private static final FieldDescriptor MESSAGEID_DESCRIPTOR;
    private static final FieldDescriptor MESSAGETYPE_DESCRIPTOR;
    private static final FieldDescriptor PACKAGENAME_DESCRIPTOR;
    private static final FieldDescriptor PRIORITY_DESCRIPTOR;
    private static final FieldDescriptor PROJECTNUMBER_DESCRIPTOR;
    private static final FieldDescriptor SDKPLATFORM_DESCRIPTOR;
    private static final FieldDescriptor TOPIC_DESCRIPTOR;
    private static final FieldDescriptor TTL_DESCRIPTOR;

    static {
        Object object = new AutoProtoEncoderDoNotUseEncoder$MessagingClientEventEncoder();
        INSTANCE = object;
        object = FieldDescriptor.builder("projectNumber");
        PROJECTNUMBER_DESCRIPTOR = E1.b(1, (FieldDescriptor$Builder)object);
        object = FieldDescriptor.builder("messageId");
        MESSAGEID_DESCRIPTOR = E1.b(2, (FieldDescriptor$Builder)object);
        object = FieldDescriptor.builder("instanceId");
        INSTANCEID_DESCRIPTOR = E1.b(3, (FieldDescriptor$Builder)object);
        object = FieldDescriptor.builder("messageType");
        MESSAGETYPE_DESCRIPTOR = E1.b(4, (FieldDescriptor$Builder)object);
        object = FieldDescriptor.builder("sdkPlatform");
        SDKPLATFORM_DESCRIPTOR = E1.b(5, (FieldDescriptor$Builder)object);
        object = FieldDescriptor.builder("packageName");
        PACKAGENAME_DESCRIPTOR = E1.b(6, (FieldDescriptor$Builder)object);
        object = FieldDescriptor.builder("collapseKey");
        COLLAPSEKEY_DESCRIPTOR = E1.b(7, (FieldDescriptor$Builder)object);
        object = FieldDescriptor.builder("priority");
        PRIORITY_DESCRIPTOR = E1.b(8, (FieldDescriptor$Builder)object);
        object = FieldDescriptor.builder("ttl");
        TTL_DESCRIPTOR = E1.b(9, (FieldDescriptor$Builder)object);
        object = FieldDescriptor.builder("topic");
        TOPIC_DESCRIPTOR = E1.b(10, (FieldDescriptor$Builder)object);
        object = FieldDescriptor.builder("bulkId");
        BULKID_DESCRIPTOR = E1.b(11, (FieldDescriptor$Builder)object);
        object = FieldDescriptor.builder("event");
        EVENT_DESCRIPTOR = E1.b(12, (FieldDescriptor$Builder)object);
        object = FieldDescriptor.builder("analyticsLabel");
        ANALYTICSLABEL_DESCRIPTOR = E1.b(13, (FieldDescriptor$Builder)object);
        object = FieldDescriptor.builder("campaignId");
        CAMPAIGNID_DESCRIPTOR = E1.b(14, (FieldDescriptor$Builder)object);
        object = FieldDescriptor.builder("composerLabel");
        COMPOSERLABEL_DESCRIPTOR = E1.b(15, (FieldDescriptor$Builder)object);
    }

    private AutoProtoEncoderDoNotUseEncoder$MessagingClientEventEncoder() {
    }

    public void encode(MessagingClientEvent object, ObjectEncoderContext objectEncoderContext) {
        FieldDescriptor fieldDescriptor = PROJECTNUMBER_DESCRIPTOR;
        long l2 = ((MessagingClientEvent)object).getProjectNumber();
        objectEncoderContext.add(fieldDescriptor, l2);
        fieldDescriptor = MESSAGEID_DESCRIPTOR;
        Object object2 = ((MessagingClientEvent)object).getMessageId();
        objectEncoderContext.add(fieldDescriptor, object2);
        fieldDescriptor = INSTANCEID_DESCRIPTOR;
        object2 = ((MessagingClientEvent)object).getInstanceId();
        objectEncoderContext.add(fieldDescriptor, object2);
        fieldDescriptor = MESSAGETYPE_DESCRIPTOR;
        object2 = ((MessagingClientEvent)object).getMessageType();
        objectEncoderContext.add(fieldDescriptor, object2);
        fieldDescriptor = SDKPLATFORM_DESCRIPTOR;
        object2 = ((MessagingClientEvent)object).getSdkPlatform();
        objectEncoderContext.add(fieldDescriptor, object2);
        fieldDescriptor = PACKAGENAME_DESCRIPTOR;
        object2 = ((MessagingClientEvent)object).getPackageName();
        objectEncoderContext.add(fieldDescriptor, object2);
        fieldDescriptor = COLLAPSEKEY_DESCRIPTOR;
        object2 = ((MessagingClientEvent)object).getCollapseKey();
        objectEncoderContext.add(fieldDescriptor, object2);
        fieldDescriptor = PRIORITY_DESCRIPTOR;
        int n3 = ((MessagingClientEvent)object).getPriority();
        objectEncoderContext.add(fieldDescriptor, n3);
        fieldDescriptor = TTL_DESCRIPTOR;
        n3 = ((MessagingClientEvent)object).getTtl();
        objectEncoderContext.add(fieldDescriptor, n3);
        fieldDescriptor = TOPIC_DESCRIPTOR;
        object2 = ((MessagingClientEvent)object).getTopic();
        objectEncoderContext.add(fieldDescriptor, object2);
        fieldDescriptor = BULKID_DESCRIPTOR;
        l2 = ((MessagingClientEvent)object).getBulkId();
        objectEncoderContext.add(fieldDescriptor, l2);
        fieldDescriptor = EVENT_DESCRIPTOR;
        object2 = ((MessagingClientEvent)object).getEvent();
        objectEncoderContext.add(fieldDescriptor, object2);
        fieldDescriptor = ANALYTICSLABEL_DESCRIPTOR;
        object2 = ((MessagingClientEvent)object).getAnalyticsLabel();
        objectEncoderContext.add(fieldDescriptor, object2);
        fieldDescriptor = CAMPAIGNID_DESCRIPTOR;
        l2 = ((MessagingClientEvent)object).getCampaignId();
        objectEncoderContext.add(fieldDescriptor, l2);
        fieldDescriptor = COMPOSERLABEL_DESCRIPTOR;
        object = ((MessagingClientEvent)object).getComposerLabel();
        objectEncoderContext.add(fieldDescriptor, object);
    }
}

