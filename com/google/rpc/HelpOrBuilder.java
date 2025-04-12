/*
 * Decompiled with CFR 0.152.
 */
package com.google.rpc;

import com.google.protobuf.MessageLiteOrBuilder;
import com.google.rpc.Help$Link;
import java.util.List;

public interface HelpOrBuilder
extends MessageLiteOrBuilder {
    public Help.Link getLinks(int var1);

    public int getLinksCount();

    public List getLinksList();
}

