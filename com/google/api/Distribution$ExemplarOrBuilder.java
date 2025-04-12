/*
 * Decompiled with CFR 0.152.
 */
package com.google.api;

import com.google.protobuf.Any;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Timestamp;
import java.util.List;

public interface Distribution$ExemplarOrBuilder
extends MessageLiteOrBuilder {
    public Any getAttachments(int var1);

    public int getAttachmentsCount();

    public List getAttachmentsList();

    public Timestamp getTimestamp();

    public double getValue();

    public boolean hasTimestamp();
}

