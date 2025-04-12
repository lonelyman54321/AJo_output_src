/*
 * Decompiled with CFR 0.152.
 */
package com.google.api;

import com.google.api.DocumentationRule;
import com.google.api.Page;
import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;

public interface DocumentationOrBuilder
extends MessageLiteOrBuilder {
    public String getDocumentationRootUrl();

    public ByteString getDocumentationRootUrlBytes();

    public String getOverview();

    public ByteString getOverviewBytes();

    public Page getPages(int var1);

    public int getPagesCount();

    public List getPagesList();

    public DocumentationRule getRules(int var1);

    public int getRulesCount();

    public List getRulesList();

    public String getSummary();

    public ByteString getSummaryBytes();
}

