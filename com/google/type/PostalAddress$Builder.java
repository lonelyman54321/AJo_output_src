/*
 * Decompiled with CFR 0.152.
 */
package com.google.type;

import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.google.type.PostalAddress;
import com.google.type.PostalAddress$1;
import com.google.type.PostalAddressOrBuilder;
import java.util.Collections;
import java.util.List;

public final class PostalAddress$Builder
extends GeneratedMessageLite$Builder
implements PostalAddressOrBuilder {
    private PostalAddress$Builder() {
        PostalAddress postalAddress = PostalAddress.access$000();
        super(postalAddress);
    }

    public /* synthetic */ PostalAddress$Builder(PostalAddress$1 postalAddress$1) {
        this();
    }

    public PostalAddress$Builder addAddressLines(String string2) {
        this.copyOnWrite();
        PostalAddress.access$2500((PostalAddress)this.instance, string2);
        return this;
    }

    public PostalAddress$Builder addAddressLinesBytes(ByteString byteString) {
        this.copyOnWrite();
        PostalAddress.access$2800((PostalAddress)this.instance, byteString);
        return this;
    }

    public PostalAddress$Builder addAllAddressLines(Iterable iterable) {
        this.copyOnWrite();
        PostalAddress.access$2600((PostalAddress)this.instance, iterable);
        return this;
    }

    public PostalAddress$Builder addAllRecipients(Iterable iterable) {
        this.copyOnWrite();
        PostalAddress.access$3100((PostalAddress)this.instance, iterable);
        return this;
    }

    public PostalAddress$Builder addRecipients(String string2) {
        this.copyOnWrite();
        PostalAddress.access$3000((PostalAddress)this.instance, string2);
        return this;
    }

    public PostalAddress$Builder addRecipientsBytes(ByteString byteString) {
        this.copyOnWrite();
        PostalAddress.access$3300((PostalAddress)this.instance, byteString);
        return this;
    }

    public PostalAddress$Builder clearAddressLines() {
        this.copyOnWrite();
        PostalAddress.access$2700((PostalAddress)this.instance);
        return this;
    }

    public PostalAddress$Builder clearAdministrativeArea() {
        this.copyOnWrite();
        PostalAddress.access$1600((PostalAddress)this.instance);
        return this;
    }

    public PostalAddress$Builder clearLanguageCode() {
        this.copyOnWrite();
        PostalAddress.access$700((PostalAddress)this.instance);
        return this;
    }

    public PostalAddress$Builder clearLocality() {
        this.copyOnWrite();
        PostalAddress.access$1900((PostalAddress)this.instance);
        return this;
    }

    public PostalAddress$Builder clearOrganization() {
        this.copyOnWrite();
        PostalAddress.access$3500((PostalAddress)this.instance);
        return this;
    }

    public PostalAddress$Builder clearPostalCode() {
        this.copyOnWrite();
        PostalAddress.access$1000((PostalAddress)this.instance);
        return this;
    }

    public PostalAddress$Builder clearRecipients() {
        this.copyOnWrite();
        PostalAddress.access$3200((PostalAddress)this.instance);
        return this;
    }

    public PostalAddress$Builder clearRegionCode() {
        this.copyOnWrite();
        PostalAddress.access$400((PostalAddress)this.instance);
        return this;
    }

    public PostalAddress$Builder clearRevision() {
        this.copyOnWrite();
        PostalAddress.access$200((PostalAddress)this.instance);
        return this;
    }

    public PostalAddress$Builder clearSortingCode() {
        this.copyOnWrite();
        PostalAddress.access$1300((PostalAddress)this.instance);
        return this;
    }

    public PostalAddress$Builder clearSublocality() {
        this.copyOnWrite();
        PostalAddress.access$2200((PostalAddress)this.instance);
        return this;
    }

    public String getAddressLines(int n3) {
        return ((PostalAddress)this.instance).getAddressLines(n3);
    }

    public ByteString getAddressLinesBytes(int n3) {
        return ((PostalAddress)this.instance).getAddressLinesBytes(n3);
    }

    public int getAddressLinesCount() {
        return ((PostalAddress)this.instance).getAddressLinesCount();
    }

    public List getAddressLinesList() {
        return Collections.unmodifiableList(((PostalAddress)this.instance).getAddressLinesList());
    }

    public String getAdministrativeArea() {
        return ((PostalAddress)this.instance).getAdministrativeArea();
    }

    public ByteString getAdministrativeAreaBytes() {
        return ((PostalAddress)this.instance).getAdministrativeAreaBytes();
    }

    public String getLanguageCode() {
        return ((PostalAddress)this.instance).getLanguageCode();
    }

    public ByteString getLanguageCodeBytes() {
        return ((PostalAddress)this.instance).getLanguageCodeBytes();
    }

    public String getLocality() {
        return ((PostalAddress)this.instance).getLocality();
    }

    public ByteString getLocalityBytes() {
        return ((PostalAddress)this.instance).getLocalityBytes();
    }

    public String getOrganization() {
        return ((PostalAddress)this.instance).getOrganization();
    }

    public ByteString getOrganizationBytes() {
        return ((PostalAddress)this.instance).getOrganizationBytes();
    }

    public String getPostalCode() {
        return ((PostalAddress)this.instance).getPostalCode();
    }

    public ByteString getPostalCodeBytes() {
        return ((PostalAddress)this.instance).getPostalCodeBytes();
    }

    public String getRecipients(int n3) {
        return ((PostalAddress)this.instance).getRecipients(n3);
    }

    public ByteString getRecipientsBytes(int n3) {
        return ((PostalAddress)this.instance).getRecipientsBytes(n3);
    }

    public int getRecipientsCount() {
        return ((PostalAddress)this.instance).getRecipientsCount();
    }

    public List getRecipientsList() {
        return Collections.unmodifiableList(((PostalAddress)this.instance).getRecipientsList());
    }

    public String getRegionCode() {
        return ((PostalAddress)this.instance).getRegionCode();
    }

    public ByteString getRegionCodeBytes() {
        return ((PostalAddress)this.instance).getRegionCodeBytes();
    }

    public int getRevision() {
        return ((PostalAddress)this.instance).getRevision();
    }

    public String getSortingCode() {
        return ((PostalAddress)this.instance).getSortingCode();
    }

    public ByteString getSortingCodeBytes() {
        return ((PostalAddress)this.instance).getSortingCodeBytes();
    }

    public String getSublocality() {
        return ((PostalAddress)this.instance).getSublocality();
    }

    public ByteString getSublocalityBytes() {
        return ((PostalAddress)this.instance).getSublocalityBytes();
    }

    public PostalAddress$Builder setAddressLines(int n3, String string2) {
        this.copyOnWrite();
        PostalAddress.access$2400((PostalAddress)this.instance, n3, string2);
        return this;
    }

    public PostalAddress$Builder setAdministrativeArea(String string2) {
        this.copyOnWrite();
        PostalAddress.access$1500((PostalAddress)this.instance, string2);
        return this;
    }

    public PostalAddress$Builder setAdministrativeAreaBytes(ByteString byteString) {
        this.copyOnWrite();
        PostalAddress.access$1700((PostalAddress)this.instance, byteString);
        return this;
    }

    public PostalAddress$Builder setLanguageCode(String string2) {
        this.copyOnWrite();
        PostalAddress.access$600((PostalAddress)this.instance, string2);
        return this;
    }

    public PostalAddress$Builder setLanguageCodeBytes(ByteString byteString) {
        this.copyOnWrite();
        PostalAddress.access$800((PostalAddress)this.instance, byteString);
        return this;
    }

    public PostalAddress$Builder setLocality(String string2) {
        this.copyOnWrite();
        PostalAddress.access$1800((PostalAddress)this.instance, string2);
        return this;
    }

    public PostalAddress$Builder setLocalityBytes(ByteString byteString) {
        this.copyOnWrite();
        PostalAddress.access$2000((PostalAddress)this.instance, byteString);
        return this;
    }

    public PostalAddress$Builder setOrganization(String string2) {
        this.copyOnWrite();
        PostalAddress.access$3400((PostalAddress)this.instance, string2);
        return this;
    }

    public PostalAddress$Builder setOrganizationBytes(ByteString byteString) {
        this.copyOnWrite();
        PostalAddress.access$3600((PostalAddress)this.instance, byteString);
        return this;
    }

    public PostalAddress$Builder setPostalCode(String string2) {
        this.copyOnWrite();
        PostalAddress.access$900((PostalAddress)this.instance, string2);
        return this;
    }

    public PostalAddress$Builder setPostalCodeBytes(ByteString byteString) {
        this.copyOnWrite();
        PostalAddress.access$1100((PostalAddress)this.instance, byteString);
        return this;
    }

    public PostalAddress$Builder setRecipients(int n3, String string2) {
        this.copyOnWrite();
        PostalAddress.access$2900((PostalAddress)this.instance, n3, string2);
        return this;
    }

    public PostalAddress$Builder setRegionCode(String string2) {
        this.copyOnWrite();
        PostalAddress.access$300((PostalAddress)this.instance, string2);
        return this;
    }

    public PostalAddress$Builder setRegionCodeBytes(ByteString byteString) {
        this.copyOnWrite();
        PostalAddress.access$500((PostalAddress)this.instance, byteString);
        return this;
    }

    public PostalAddress$Builder setRevision(int n3) {
        this.copyOnWrite();
        PostalAddress.access$100((PostalAddress)this.instance, n3);
        return this;
    }

    public PostalAddress$Builder setSortingCode(String string2) {
        this.copyOnWrite();
        PostalAddress.access$1200((PostalAddress)this.instance, string2);
        return this;
    }

    public PostalAddress$Builder setSortingCodeBytes(ByteString byteString) {
        this.copyOnWrite();
        PostalAddress.access$1400((PostalAddress)this.instance, byteString);
        return this;
    }

    public PostalAddress$Builder setSublocality(String string2) {
        this.copyOnWrite();
        PostalAddress.access$2100((PostalAddress)this.instance, string2);
        return this;
    }

    public PostalAddress$Builder setSublocalityBytes(ByteString byteString) {
        this.copyOnWrite();
        PostalAddress.access$2300((PostalAddress)this.instance, byteString);
        return this;
    }
}

