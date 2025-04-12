/*
 * Decompiled with CFR 0.152.
 */
package com.google.zxing.client.result;

import com.google.zxing.client.result.ParsedResult;
import com.google.zxing.client.result.ParsedResultType;

public final class AddressBookParsedResult
extends ParsedResult {
    private final String[] addressTypes;
    private final String[] addresses;
    private final String birthday;
    private final String[] emailTypes;
    private final String[] emails;
    private final String[] geo;
    private final String instantMessenger;
    private final String[] names;
    private final String[] nicknames;
    private final String note;
    private final String org;
    private final String[] phoneNumbers;
    private final String[] phoneTypes;
    private final String pronunciation;
    private final String title;
    private final String[] urls;

    public AddressBookParsedResult(String[] stringArray, String[] stringArray2, String string2, String[] stringArray3, String[] stringArray4, String[] stringArray5, String[] stringArray6, String string3, String string4, String[] stringArray7, String[] stringArray8, String string5, String string6, String string7, String[] stringArray9, String[] stringArray10) {
        int n3;
        int n4;
        AddressBookParsedResult addressBookParsedResult = this;
        Object object = stringArray3;
        String[] stringArray11 = stringArray4;
        String[] stringArray12 = stringArray5;
        String[] stringArray13 = stringArray6;
        String[] stringArray14 = stringArray7;
        String[] stringArray15 = stringArray8;
        Object object2 = ParsedResultType.ADDRESSBOOK;
        super((ParsedResultType)((Object)object2));
        if (stringArray3 != null && stringArray4 != null && (n4 = stringArray3.length) != (n3 = stringArray4.length)) {
            super("Phone numbers and types lengths differ");
            throw object;
        }
        if (stringArray12 != null && stringArray13 != null && (n4 = stringArray12.length) != (n3 = stringArray13.length)) {
            super("Emails and types lengths differ");
            throw object;
        }
        if (stringArray14 != null && stringArray15 != null && (n4 = stringArray14.length) != (n3 = stringArray15.length)) {
            super("Addresses and types lengths differ");
            throw object;
        }
        object2 = stringArray;
        addressBookParsedResult.names = stringArray;
        object2 = stringArray2;
        addressBookParsedResult.nicknames = stringArray2;
        object2 = string2;
        addressBookParsedResult.pronunciation = string2;
        addressBookParsedResult.phoneNumbers = object;
        addressBookParsedResult.phoneTypes = stringArray11;
        addressBookParsedResult.emails = stringArray12;
        addressBookParsedResult.emailTypes = stringArray13;
        object = string3;
        addressBookParsedResult.instantMessenger = string3;
        object = string4;
        addressBookParsedResult.note = string4;
        addressBookParsedResult.addresses = stringArray14;
        addressBookParsedResult.addressTypes = stringArray15;
        object = string5;
        addressBookParsedResult.org = string5;
        object = string6;
        addressBookParsedResult.birthday = string6;
        object = string7;
        addressBookParsedResult.title = string7;
        object = stringArray9;
        addressBookParsedResult.urls = stringArray9;
        object = stringArray10;
        addressBookParsedResult.geo = stringArray10;
    }

    public AddressBookParsedResult(String[] stringArray, String[] stringArray2, String[] stringArray3, String[] stringArray4, String[] stringArray5, String[] stringArray6, String[] stringArray7) {
        this(stringArray, null, null, stringArray2, stringArray3, stringArray4, stringArray5, null, null, stringArray6, stringArray7, null, null, null, null, null);
    }

    public String[] getAddressTypes() {
        return this.addressTypes;
    }

    public String[] getAddresses() {
        return this.addresses;
    }

    public String getBirthday() {
        return this.birthday;
    }

    public String getDisplayResult() {
        StringBuilder stringBuilder = new StringBuilder(100);
        ParsedResult.maybeAppend(this.names, stringBuilder);
        ParsedResult.maybeAppend(this.nicknames, stringBuilder);
        ParsedResult.maybeAppend(this.pronunciation, stringBuilder);
        ParsedResult.maybeAppend(this.title, stringBuilder);
        ParsedResult.maybeAppend(this.org, stringBuilder);
        ParsedResult.maybeAppend(this.addresses, stringBuilder);
        ParsedResult.maybeAppend(this.phoneNumbers, stringBuilder);
        ParsedResult.maybeAppend(this.emails, stringBuilder);
        ParsedResult.maybeAppend(this.instantMessenger, stringBuilder);
        ParsedResult.maybeAppend(this.urls, stringBuilder);
        ParsedResult.maybeAppend(this.birthday, stringBuilder);
        ParsedResult.maybeAppend(this.geo, stringBuilder);
        ParsedResult.maybeAppend(this.note, stringBuilder);
        return stringBuilder.toString();
    }

    public String[] getEmailTypes() {
        return this.emailTypes;
    }

    public String[] getEmails() {
        return this.emails;
    }

    public String[] getGeo() {
        return this.geo;
    }

    public String getInstantMessenger() {
        return this.instantMessenger;
    }

    public String[] getNames() {
        return this.names;
    }

    public String[] getNicknames() {
        return this.nicknames;
    }

    public String getNote() {
        return this.note;
    }

    public String getOrg() {
        return this.org;
    }

    public String[] getPhoneNumbers() {
        return this.phoneNumbers;
    }

    public String[] getPhoneTypes() {
        return this.phoneTypes;
    }

    public String getPronunciation() {
        return this.pronunciation;
    }

    public String getTitle() {
        return this.title;
    }

    public String[] getURLs() {
        return this.urls;
    }
}

