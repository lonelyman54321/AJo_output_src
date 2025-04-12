/*
 * Decompiled with CFR 0.152.
 */
package com.google.type;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser;
import com.google.protobuf.GeneratedMessageLite$MethodToInvoke;
import com.google.protobuf.Internal$ProtobufList;
import com.google.protobuf.Parser;
import com.google.type.PostalAddress$1;
import com.google.type.PostalAddress$Builder;
import com.google.type.PostalAddressOrBuilder;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

public final class PostalAddress
extends GeneratedMessageLite
implements PostalAddressOrBuilder {
    public static final int ADDRESS_LINES_FIELD_NUMBER = 9;
    public static final int ADMINISTRATIVE_AREA_FIELD_NUMBER = 6;
    private static final PostalAddress DEFAULT_INSTANCE;
    public static final int LANGUAGE_CODE_FIELD_NUMBER = 3;
    public static final int LOCALITY_FIELD_NUMBER = 7;
    public static final int ORGANIZATION_FIELD_NUMBER = 11;
    private static volatile Parser PARSER;
    public static final int POSTAL_CODE_FIELD_NUMBER = 4;
    public static final int RECIPIENTS_FIELD_NUMBER = 10;
    public static final int REGION_CODE_FIELD_NUMBER = 2;
    public static final int REVISION_FIELD_NUMBER = 1;
    public static final int SORTING_CODE_FIELD_NUMBER = 5;
    public static final int SUBLOCALITY_FIELD_NUMBER = 8;
    private Internal$ProtobufList addressLines_;
    private String administrativeArea_;
    private String languageCode_;
    private String locality_;
    private String organization_;
    private String postalCode_;
    private Internal$ProtobufList recipients_;
    private String regionCode_;
    private int revision_;
    private String sortingCode_;
    private String sublocality_;

    static {
        PostalAddress postalAddress;
        DEFAULT_INSTANCE = postalAddress = new PostalAddress();
        GeneratedMessageLite.registerDefaultInstance(PostalAddress.class, postalAddress);
    }

    private PostalAddress() {
        Internal$ProtobufList internal$ProtobufList;
        String string2;
        this.regionCode_ = string2 = "";
        this.languageCode_ = string2;
        this.postalCode_ = string2;
        this.sortingCode_ = string2;
        this.administrativeArea_ = string2;
        this.locality_ = string2;
        this.sublocality_ = string2;
        this.addressLines_ = internal$ProtobufList = GeneratedMessageLite.emptyProtobufList();
        this.recipients_ = internal$ProtobufList = GeneratedMessageLite.emptyProtobufList();
        this.organization_ = string2;
    }

    public static /* synthetic */ PostalAddress access$000() {
        return DEFAULT_INSTANCE;
    }

    public static /* synthetic */ void access$100(PostalAddress postalAddress, int n3) {
        postalAddress.setRevision(n3);
    }

    public static /* synthetic */ void access$1000(PostalAddress postalAddress) {
        postalAddress.clearPostalCode();
    }

    public static /* synthetic */ void access$1100(PostalAddress postalAddress, ByteString byteString) {
        postalAddress.setPostalCodeBytes(byteString);
    }

    public static /* synthetic */ void access$1200(PostalAddress postalAddress, String string2) {
        postalAddress.setSortingCode(string2);
    }

    public static /* synthetic */ void access$1300(PostalAddress postalAddress) {
        postalAddress.clearSortingCode();
    }

    public static /* synthetic */ void access$1400(PostalAddress postalAddress, ByteString byteString) {
        postalAddress.setSortingCodeBytes(byteString);
    }

    public static /* synthetic */ void access$1500(PostalAddress postalAddress, String string2) {
        postalAddress.setAdministrativeArea(string2);
    }

    public static /* synthetic */ void access$1600(PostalAddress postalAddress) {
        postalAddress.clearAdministrativeArea();
    }

    public static /* synthetic */ void access$1700(PostalAddress postalAddress, ByteString byteString) {
        postalAddress.setAdministrativeAreaBytes(byteString);
    }

    public static /* synthetic */ void access$1800(PostalAddress postalAddress, String string2) {
        postalAddress.setLocality(string2);
    }

    public static /* synthetic */ void access$1900(PostalAddress postalAddress) {
        postalAddress.clearLocality();
    }

    public static /* synthetic */ void access$200(PostalAddress postalAddress) {
        postalAddress.clearRevision();
    }

    public static /* synthetic */ void access$2000(PostalAddress postalAddress, ByteString byteString) {
        postalAddress.setLocalityBytes(byteString);
    }

    public static /* synthetic */ void access$2100(PostalAddress postalAddress, String string2) {
        postalAddress.setSublocality(string2);
    }

    public static /* synthetic */ void access$2200(PostalAddress postalAddress) {
        postalAddress.clearSublocality();
    }

    public static /* synthetic */ void access$2300(PostalAddress postalAddress, ByteString byteString) {
        postalAddress.setSublocalityBytes(byteString);
    }

    public static /* synthetic */ void access$2400(PostalAddress postalAddress, int n3, String string2) {
        postalAddress.setAddressLines(n3, string2);
    }

    public static /* synthetic */ void access$2500(PostalAddress postalAddress, String string2) {
        postalAddress.addAddressLines(string2);
    }

    public static /* synthetic */ void access$2600(PostalAddress postalAddress, Iterable iterable) {
        postalAddress.addAllAddressLines(iterable);
    }

    public static /* synthetic */ void access$2700(PostalAddress postalAddress) {
        postalAddress.clearAddressLines();
    }

    public static /* synthetic */ void access$2800(PostalAddress postalAddress, ByteString byteString) {
        postalAddress.addAddressLinesBytes(byteString);
    }

    public static /* synthetic */ void access$2900(PostalAddress postalAddress, int n3, String string2) {
        postalAddress.setRecipients(n3, string2);
    }

    public static /* synthetic */ void access$300(PostalAddress postalAddress, String string2) {
        postalAddress.setRegionCode(string2);
    }

    public static /* synthetic */ void access$3000(PostalAddress postalAddress, String string2) {
        postalAddress.addRecipients(string2);
    }

    public static /* synthetic */ void access$3100(PostalAddress postalAddress, Iterable iterable) {
        postalAddress.addAllRecipients(iterable);
    }

    public static /* synthetic */ void access$3200(PostalAddress postalAddress) {
        postalAddress.clearRecipients();
    }

    public static /* synthetic */ void access$3300(PostalAddress postalAddress, ByteString byteString) {
        postalAddress.addRecipientsBytes(byteString);
    }

    public static /* synthetic */ void access$3400(PostalAddress postalAddress, String string2) {
        postalAddress.setOrganization(string2);
    }

    public static /* synthetic */ void access$3500(PostalAddress postalAddress) {
        postalAddress.clearOrganization();
    }

    public static /* synthetic */ void access$3600(PostalAddress postalAddress, ByteString byteString) {
        postalAddress.setOrganizationBytes(byteString);
    }

    public static /* synthetic */ void access$400(PostalAddress postalAddress) {
        postalAddress.clearRegionCode();
    }

    public static /* synthetic */ void access$500(PostalAddress postalAddress, ByteString byteString) {
        postalAddress.setRegionCodeBytes(byteString);
    }

    public static /* synthetic */ void access$600(PostalAddress postalAddress, String string2) {
        postalAddress.setLanguageCode(string2);
    }

    public static /* synthetic */ void access$700(PostalAddress postalAddress) {
        postalAddress.clearLanguageCode();
    }

    public static /* synthetic */ void access$800(PostalAddress postalAddress, ByteString byteString) {
        postalAddress.setLanguageCodeBytes(byteString);
    }

    public static /* synthetic */ void access$900(PostalAddress postalAddress, String string2) {
        postalAddress.setPostalCode(string2);
    }

    private void addAddressLines(String string2) {
        string2.getClass();
        this.ensureAddressLinesIsMutable();
        this.addressLines_.add(string2);
    }

    private void addAddressLinesBytes(ByteString object) {
        AbstractMessageLite.checkByteStringIsUtf8((ByteString)object);
        this.ensureAddressLinesIsMutable();
        Internal$ProtobufList internal$ProtobufList = this.addressLines_;
        object = ((ByteString)object).toStringUtf8();
        internal$ProtobufList.add(object);
    }

    private void addAllAddressLines(Iterable iterable) {
        this.ensureAddressLinesIsMutable();
        Internal$ProtobufList internal$ProtobufList = this.addressLines_;
        AbstractMessageLite.addAll(iterable, internal$ProtobufList);
    }

    private void addAllRecipients(Iterable iterable) {
        this.ensureRecipientsIsMutable();
        Internal$ProtobufList internal$ProtobufList = this.recipients_;
        AbstractMessageLite.addAll(iterable, internal$ProtobufList);
    }

    private void addRecipients(String string2) {
        string2.getClass();
        this.ensureRecipientsIsMutable();
        this.recipients_.add(string2);
    }

    private void addRecipientsBytes(ByteString object) {
        AbstractMessageLite.checkByteStringIsUtf8((ByteString)object);
        this.ensureRecipientsIsMutable();
        Internal$ProtobufList internal$ProtobufList = this.recipients_;
        object = ((ByteString)object).toStringUtf8();
        internal$ProtobufList.add(object);
    }

    private void clearAddressLines() {
        Internal$ProtobufList internal$ProtobufList;
        this.addressLines_ = internal$ProtobufList = GeneratedMessageLite.emptyProtobufList();
    }

    private void clearAdministrativeArea() {
        String string2;
        this.administrativeArea_ = string2 = PostalAddress.getDefaultInstance().getAdministrativeArea();
    }

    private void clearLanguageCode() {
        String string2;
        this.languageCode_ = string2 = PostalAddress.getDefaultInstance().getLanguageCode();
    }

    private void clearLocality() {
        String string2;
        this.locality_ = string2 = PostalAddress.getDefaultInstance().getLocality();
    }

    private void clearOrganization() {
        String string2;
        this.organization_ = string2 = PostalAddress.getDefaultInstance().getOrganization();
    }

    private void clearPostalCode() {
        String string2;
        this.postalCode_ = string2 = PostalAddress.getDefaultInstance().getPostalCode();
    }

    private void clearRecipients() {
        Internal$ProtobufList internal$ProtobufList;
        this.recipients_ = internal$ProtobufList = GeneratedMessageLite.emptyProtobufList();
    }

    private void clearRegionCode() {
        String string2;
        this.regionCode_ = string2 = PostalAddress.getDefaultInstance().getRegionCode();
    }

    private void clearRevision() {
        this.revision_ = 0;
    }

    private void clearSortingCode() {
        String string2;
        this.sortingCode_ = string2 = PostalAddress.getDefaultInstance().getSortingCode();
    }

    private void clearSublocality() {
        String string2;
        this.sublocality_ = string2 = PostalAddress.getDefaultInstance().getSublocality();
    }

    private void ensureAddressLinesIsMutable() {
        Internal$ProtobufList internal$ProtobufList = this.addressLines_;
        boolean bl2 = internal$ProtobufList.isModifiable();
        if (!bl2) {
            this.addressLines_ = internal$ProtobufList = GeneratedMessageLite.mutableCopy(internal$ProtobufList);
        }
    }

    private void ensureRecipientsIsMutable() {
        Internal$ProtobufList internal$ProtobufList = this.recipients_;
        boolean bl2 = internal$ProtobufList.isModifiable();
        if (!bl2) {
            this.recipients_ = internal$ProtobufList = GeneratedMessageLite.mutableCopy(internal$ProtobufList);
        }
    }

    public static PostalAddress getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static PostalAddress$Builder newBuilder() {
        return (PostalAddress$Builder)DEFAULT_INSTANCE.createBuilder();
    }

    public static PostalAddress$Builder newBuilder(PostalAddress postalAddress) {
        return (PostalAddress$Builder)DEFAULT_INSTANCE.createBuilder(postalAddress);
    }

    public static PostalAddress parseDelimitedFrom(InputStream inputStream) {
        return (PostalAddress)GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static PostalAddress parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (PostalAddress)GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static PostalAddress parseFrom(ByteString byteString) {
        return (PostalAddress)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteString);
    }

    public static PostalAddress parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (PostalAddress)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static PostalAddress parseFrom(CodedInputStream codedInputStream) {
        return (PostalAddress)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, codedInputStream);
    }

    public static PostalAddress parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (PostalAddress)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static PostalAddress parseFrom(InputStream inputStream) {
        return (PostalAddress)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, inputStream);
    }

    public static PostalAddress parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (PostalAddress)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static PostalAddress parseFrom(ByteBuffer byteBuffer) {
        return (PostalAddress)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteBuffer);
    }

    public static PostalAddress parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (PostalAddress)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static PostalAddress parseFrom(byte[] byArray) {
        return (PostalAddress)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byArray);
    }

    public static PostalAddress parseFrom(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (PostalAddress)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byArray, extensionRegistryLite);
    }

    public static Parser parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setAddressLines(int n3, String string2) {
        string2.getClass();
        this.ensureAddressLinesIsMutable();
        this.addressLines_.set(n3, string2);
    }

    private void setAdministrativeArea(String string2) {
        string2.getClass();
        this.administrativeArea_ = string2;
    }

    private void setAdministrativeAreaBytes(ByteString object) {
        AbstractMessageLite.checkByteStringIsUtf8((ByteString)object);
        this.administrativeArea_ = object = ((ByteString)object).toStringUtf8();
    }

    private void setLanguageCode(String string2) {
        string2.getClass();
        this.languageCode_ = string2;
    }

    private void setLanguageCodeBytes(ByteString object) {
        AbstractMessageLite.checkByteStringIsUtf8((ByteString)object);
        this.languageCode_ = object = ((ByteString)object).toStringUtf8();
    }

    private void setLocality(String string2) {
        string2.getClass();
        this.locality_ = string2;
    }

    private void setLocalityBytes(ByteString object) {
        AbstractMessageLite.checkByteStringIsUtf8((ByteString)object);
        this.locality_ = object = ((ByteString)object).toStringUtf8();
    }

    private void setOrganization(String string2) {
        string2.getClass();
        this.organization_ = string2;
    }

    private void setOrganizationBytes(ByteString object) {
        AbstractMessageLite.checkByteStringIsUtf8((ByteString)object);
        this.organization_ = object = ((ByteString)object).toStringUtf8();
    }

    private void setPostalCode(String string2) {
        string2.getClass();
        this.postalCode_ = string2;
    }

    private void setPostalCodeBytes(ByteString object) {
        AbstractMessageLite.checkByteStringIsUtf8((ByteString)object);
        this.postalCode_ = object = ((ByteString)object).toStringUtf8();
    }

    private void setRecipients(int n3, String string2) {
        string2.getClass();
        this.ensureRecipientsIsMutable();
        this.recipients_.set(n3, string2);
    }

    private void setRegionCode(String string2) {
        string2.getClass();
        this.regionCode_ = string2;
    }

    private void setRegionCodeBytes(ByteString object) {
        AbstractMessageLite.checkByteStringIsUtf8((ByteString)object);
        this.regionCode_ = object = ((ByteString)object).toStringUtf8();
    }

    private void setRevision(int n3) {
        this.revision_ = n3;
    }

    private void setSortingCode(String string2) {
        string2.getClass();
        this.sortingCode_ = string2;
    }

    private void setSortingCodeBytes(ByteString object) {
        AbstractMessageLite.checkByteStringIsUtf8((ByteString)object);
        this.sortingCode_ = object = ((ByteString)object).toStringUtf8();
    }

    private void setSublocality(String string2) {
        string2.getClass();
        this.sublocality_ = string2;
    }

    private void setSublocalityBytes(ByteString object) {
        AbstractMessageLite.checkByteStringIsUtf8((ByteString)object);
        this.sublocality_ = object = ((ByteString)object).toStringUtf8();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke objectArray, Object clazz, Object object) {
        byte by2 = 1;
        object = PostalAddress$1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke;
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
                clazz = PostalAddress.class;
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
                objectArray = new Object[11];
                objectArray[0] = "revision_";
                objectArray[by2] = "regionCode_";
                objectArray[2] = "languageCode_";
                objectArray[3] = "postalCode_";
                objectArray[4] = "sortingCode_";
                objectArray[5] = "administrativeArea_";
                objectArray[6] = "locality_";
                objectArray[7] = "sublocality_";
                objectArray[8] = "addressLines_";
                objectArray[9] = "recipients_";
                objectArray[10] = "organization_";
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u000b\u0000\u0000\u0001\u000b\u000b\u0000\u0002\u0000\u0001\u0004\u0002\u0208\u0003\u0208\u0004\u0208\u0005\u0208\u0006\u0208\u0007\u0208\b\u0208\t\u021a\n\u021a\u000b\u0208", objectArray);
            }
            case 2: {
                return new PostalAddress$Builder(null);
            }
            case 1: 
        }
        return new PostalAddress();
    }

    public String getAddressLines(int n3) {
        return (String)this.addressLines_.get(n3);
    }

    public ByteString getAddressLinesBytes(int n3) {
        return ByteString.copyFromUtf8((String)this.addressLines_.get(n3));
    }

    public int getAddressLinesCount() {
        return this.addressLines_.size();
    }

    public List getAddressLinesList() {
        return this.addressLines_;
    }

    public String getAdministrativeArea() {
        return this.administrativeArea_;
    }

    public ByteString getAdministrativeAreaBytes() {
        return ByteString.copyFromUtf8(this.administrativeArea_);
    }

    public String getLanguageCode() {
        return this.languageCode_;
    }

    public ByteString getLanguageCodeBytes() {
        return ByteString.copyFromUtf8(this.languageCode_);
    }

    public String getLocality() {
        return this.locality_;
    }

    public ByteString getLocalityBytes() {
        return ByteString.copyFromUtf8(this.locality_);
    }

    public String getOrganization() {
        return this.organization_;
    }

    public ByteString getOrganizationBytes() {
        return ByteString.copyFromUtf8(this.organization_);
    }

    public String getPostalCode() {
        return this.postalCode_;
    }

    public ByteString getPostalCodeBytes() {
        return ByteString.copyFromUtf8(this.postalCode_);
    }

    public String getRecipients(int n3) {
        return (String)this.recipients_.get(n3);
    }

    public ByteString getRecipientsBytes(int n3) {
        return ByteString.copyFromUtf8((String)this.recipients_.get(n3));
    }

    public int getRecipientsCount() {
        return this.recipients_.size();
    }

    public List getRecipientsList() {
        return this.recipients_;
    }

    public String getRegionCode() {
        return this.regionCode_;
    }

    public ByteString getRegionCodeBytes() {
        return ByteString.copyFromUtf8(this.regionCode_);
    }

    public int getRevision() {
        return this.revision_;
    }

    public String getSortingCode() {
        return this.sortingCode_;
    }

    public ByteString getSortingCodeBytes() {
        return ByteString.copyFromUtf8(this.sortingCode_);
    }

    public String getSublocality() {
        return this.sublocality_;
    }

    public ByteString getSublocalityBytes() {
        return ByteString.copyFromUtf8(this.sublocality_);
    }
}

