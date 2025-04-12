/*
 * Decompiled with CFR 0.152.
 */
package com.google.api;

import com.google.api.Documentation$1;
import com.google.api.Documentation$Builder;
import com.google.api.DocumentationOrBuilder;
import com.google.api.DocumentationRule;
import com.google.api.DocumentationRuleOrBuilder;
import com.google.api.Page;
import com.google.api.PageOrBuilder;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser;
import com.google.protobuf.GeneratedMessageLite$MethodToInvoke;
import com.google.protobuf.Internal$ProtobufList;
import com.google.protobuf.Parser;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

public final class Documentation
extends GeneratedMessageLite
implements DocumentationOrBuilder {
    private static final Documentation DEFAULT_INSTANCE;
    public static final int DOCUMENTATION_ROOT_URL_FIELD_NUMBER = 4;
    public static final int OVERVIEW_FIELD_NUMBER = 2;
    public static final int PAGES_FIELD_NUMBER = 5;
    private static volatile Parser PARSER;
    public static final int RULES_FIELD_NUMBER = 3;
    public static final int SUMMARY_FIELD_NUMBER = 1;
    private String documentationRootUrl_;
    private String overview_;
    private Internal$ProtobufList pages_;
    private Internal$ProtobufList rules_;
    private String summary_;

    static {
        Documentation documentation;
        DEFAULT_INSTANCE = documentation = new Documentation();
        GeneratedMessageLite.registerDefaultInstance(Documentation.class, documentation);
    }

    private Documentation() {
        Internal$ProtobufList internal$ProtobufList;
        String string2;
        this.summary_ = string2 = "";
        this.pages_ = internal$ProtobufList = GeneratedMessageLite.emptyProtobufList();
        this.rules_ = internal$ProtobufList = GeneratedMessageLite.emptyProtobufList();
        this.documentationRootUrl_ = string2;
        this.overview_ = string2;
    }

    public static /* synthetic */ Documentation access$000() {
        return DEFAULT_INSTANCE;
    }

    public static /* synthetic */ void access$100(Documentation documentation, String string2) {
        documentation.setSummary(string2);
    }

    public static /* synthetic */ void access$1000(Documentation documentation, int n3, DocumentationRule documentationRule) {
        documentation.setRules(n3, documentationRule);
    }

    public static /* synthetic */ void access$1100(Documentation documentation, DocumentationRule documentationRule) {
        documentation.addRules(documentationRule);
    }

    public static /* synthetic */ void access$1200(Documentation documentation, int n3, DocumentationRule documentationRule) {
        documentation.addRules(n3, documentationRule);
    }

    public static /* synthetic */ void access$1300(Documentation documentation, Iterable iterable) {
        documentation.addAllRules(iterable);
    }

    public static /* synthetic */ void access$1400(Documentation documentation) {
        documentation.clearRules();
    }

    public static /* synthetic */ void access$1500(Documentation documentation, int n3) {
        documentation.removeRules(n3);
    }

    public static /* synthetic */ void access$1600(Documentation documentation, String string2) {
        documentation.setDocumentationRootUrl(string2);
    }

    public static /* synthetic */ void access$1700(Documentation documentation) {
        documentation.clearDocumentationRootUrl();
    }

    public static /* synthetic */ void access$1800(Documentation documentation, ByteString byteString) {
        documentation.setDocumentationRootUrlBytes(byteString);
    }

    public static /* synthetic */ void access$1900(Documentation documentation, String string2) {
        documentation.setOverview(string2);
    }

    public static /* synthetic */ void access$200(Documentation documentation) {
        documentation.clearSummary();
    }

    public static /* synthetic */ void access$2000(Documentation documentation) {
        documentation.clearOverview();
    }

    public static /* synthetic */ void access$2100(Documentation documentation, ByteString byteString) {
        documentation.setOverviewBytes(byteString);
    }

    public static /* synthetic */ void access$300(Documentation documentation, ByteString byteString) {
        documentation.setSummaryBytes(byteString);
    }

    public static /* synthetic */ void access$400(Documentation documentation, int n3, Page page) {
        documentation.setPages(n3, page);
    }

    public static /* synthetic */ void access$500(Documentation documentation, Page page) {
        documentation.addPages(page);
    }

    public static /* synthetic */ void access$600(Documentation documentation, int n3, Page page) {
        documentation.addPages(n3, page);
    }

    public static /* synthetic */ void access$700(Documentation documentation, Iterable iterable) {
        documentation.addAllPages(iterable);
    }

    public static /* synthetic */ void access$800(Documentation documentation) {
        documentation.clearPages();
    }

    public static /* synthetic */ void access$900(Documentation documentation, int n3) {
        documentation.removePages(n3);
    }

    private void addAllPages(Iterable iterable) {
        this.ensurePagesIsMutable();
        Internal$ProtobufList internal$ProtobufList = this.pages_;
        AbstractMessageLite.addAll(iterable, internal$ProtobufList);
    }

    private void addAllRules(Iterable iterable) {
        this.ensureRulesIsMutable();
        Internal$ProtobufList internal$ProtobufList = this.rules_;
        AbstractMessageLite.addAll(iterable, internal$ProtobufList);
    }

    private void addPages(int n3, Page page) {
        page.getClass();
        this.ensurePagesIsMutable();
        this.pages_.add(n3, page);
    }

    private void addPages(Page page) {
        page.getClass();
        this.ensurePagesIsMutable();
        this.pages_.add(page);
    }

    private void addRules(int n3, DocumentationRule documentationRule) {
        documentationRule.getClass();
        this.ensureRulesIsMutable();
        this.rules_.add(n3, documentationRule);
    }

    private void addRules(DocumentationRule documentationRule) {
        documentationRule.getClass();
        this.ensureRulesIsMutable();
        this.rules_.add(documentationRule);
    }

    private void clearDocumentationRootUrl() {
        String string2;
        this.documentationRootUrl_ = string2 = Documentation.getDefaultInstance().getDocumentationRootUrl();
    }

    private void clearOverview() {
        String string2;
        this.overview_ = string2 = Documentation.getDefaultInstance().getOverview();
    }

    private void clearPages() {
        Internal$ProtobufList internal$ProtobufList;
        this.pages_ = internal$ProtobufList = GeneratedMessageLite.emptyProtobufList();
    }

    private void clearRules() {
        Internal$ProtobufList internal$ProtobufList;
        this.rules_ = internal$ProtobufList = GeneratedMessageLite.emptyProtobufList();
    }

    private void clearSummary() {
        String string2;
        this.summary_ = string2 = Documentation.getDefaultInstance().getSummary();
    }

    private void ensurePagesIsMutable() {
        Internal$ProtobufList internal$ProtobufList = this.pages_;
        boolean bl2 = internal$ProtobufList.isModifiable();
        if (!bl2) {
            this.pages_ = internal$ProtobufList = GeneratedMessageLite.mutableCopy(internal$ProtobufList);
        }
    }

    private void ensureRulesIsMutable() {
        Internal$ProtobufList internal$ProtobufList = this.rules_;
        boolean bl2 = internal$ProtobufList.isModifiable();
        if (!bl2) {
            this.rules_ = internal$ProtobufList = GeneratedMessageLite.mutableCopy(internal$ProtobufList);
        }
    }

    public static Documentation getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Documentation$Builder newBuilder() {
        return (Documentation$Builder)DEFAULT_INSTANCE.createBuilder();
    }

    public static Documentation$Builder newBuilder(Documentation documentation) {
        return (Documentation$Builder)DEFAULT_INSTANCE.createBuilder(documentation);
    }

    public static Documentation parseDelimitedFrom(InputStream inputStream) {
        return (Documentation)GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Documentation parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Documentation)GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Documentation parseFrom(ByteString byteString) {
        return (Documentation)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteString);
    }

    public static Documentation parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (Documentation)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Documentation parseFrom(CodedInputStream codedInputStream) {
        return (Documentation)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, codedInputStream);
    }

    public static Documentation parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Documentation)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static Documentation parseFrom(InputStream inputStream) {
        return (Documentation)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, inputStream);
    }

    public static Documentation parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Documentation)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Documentation parseFrom(ByteBuffer byteBuffer) {
        return (Documentation)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteBuffer);
    }

    public static Documentation parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (Documentation)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Documentation parseFrom(byte[] byArray) {
        return (Documentation)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byArray);
    }

    public static Documentation parseFrom(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (Documentation)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byArray, extensionRegistryLite);
    }

    public static Parser parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void removePages(int n3) {
        this.ensurePagesIsMutable();
        this.pages_.remove(n3);
    }

    private void removeRules(int n3) {
        this.ensureRulesIsMutable();
        this.rules_.remove(n3);
    }

    private void setDocumentationRootUrl(String string2) {
        string2.getClass();
        this.documentationRootUrl_ = string2;
    }

    private void setDocumentationRootUrlBytes(ByteString object) {
        AbstractMessageLite.checkByteStringIsUtf8((ByteString)object);
        this.documentationRootUrl_ = object = ((ByteString)object).toStringUtf8();
    }

    private void setOverview(String string2) {
        string2.getClass();
        this.overview_ = string2;
    }

    private void setOverviewBytes(ByteString object) {
        AbstractMessageLite.checkByteStringIsUtf8((ByteString)object);
        this.overview_ = object = ((ByteString)object).toStringUtf8();
    }

    private void setPages(int n3, Page page) {
        page.getClass();
        this.ensurePagesIsMutable();
        this.pages_.set(n3, page);
    }

    private void setRules(int n3, DocumentationRule documentationRule) {
        documentationRule.getClass();
        this.ensureRulesIsMutable();
        this.rules_.set(n3, documentationRule);
    }

    private void setSummary(String string2) {
        string2.getClass();
        this.summary_ = string2;
    }

    private void setSummaryBytes(ByteString object) {
        AbstractMessageLite.checkByteStringIsUtf8((ByteString)object);
        this.summary_ = object = ((ByteString)object).toStringUtf8();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke objectArray, Object clazz, Object object) {
        byte by2 = 1;
        object = Documentation$1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke;
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
                clazz = Documentation.class;
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
                objectArray = new Object[7];
                objectArray[0] = "summary_";
                objectArray[by2] = "overview_";
                objectArray[2] = "rules_";
                objectArray[3] = DocumentationRule.class;
                objectArray[4] = "documentationRootUrl_";
                objectArray[5] = "pages_";
                objectArray[6] = Page.class;
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0002\u0000\u0001\u0208\u0002\u0208\u0003\u001b\u0004\u0208\u0005\u001b", objectArray);
            }
            case 2: {
                return new Documentation$Builder(null);
            }
            case 1: 
        }
        return new Documentation();
    }

    public String getDocumentationRootUrl() {
        return this.documentationRootUrl_;
    }

    public ByteString getDocumentationRootUrlBytes() {
        return ByteString.copyFromUtf8(this.documentationRootUrl_);
    }

    public String getOverview() {
        return this.overview_;
    }

    public ByteString getOverviewBytes() {
        return ByteString.copyFromUtf8(this.overview_);
    }

    public Page getPages(int n3) {
        return (Page)this.pages_.get(n3);
    }

    public int getPagesCount() {
        return this.pages_.size();
    }

    public List getPagesList() {
        return this.pages_;
    }

    public PageOrBuilder getPagesOrBuilder(int n3) {
        return (PageOrBuilder)this.pages_.get(n3);
    }

    public List getPagesOrBuilderList() {
        return this.pages_;
    }

    public DocumentationRule getRules(int n3) {
        return (DocumentationRule)this.rules_.get(n3);
    }

    public int getRulesCount() {
        return this.rules_.size();
    }

    public List getRulesList() {
        return this.rules_;
    }

    public DocumentationRuleOrBuilder getRulesOrBuilder(int n3) {
        return (DocumentationRuleOrBuilder)this.rules_.get(n3);
    }

    public List getRulesOrBuilderList() {
        return this.rules_;
    }

    public String getSummary() {
        return this.summary_;
    }

    public ByteString getSummaryBytes() {
        return ByteString.copyFromUtf8(this.summary_);
    }
}

