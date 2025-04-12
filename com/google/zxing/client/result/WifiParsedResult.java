/*
 * Decompiled with CFR 0.152.
 */
package com.google.zxing.client.result;

import com.google.zxing.client.result.ParsedResult;
import com.google.zxing.client.result.ParsedResultType;

public final class WifiParsedResult
extends ParsedResult {
    private final String anonymousIdentity;
    private final String eapMethod;
    private final boolean hidden;
    private final String identity;
    private final String networkEncryption;
    private final String password;
    private final String phase2Method;
    private final String ssid;

    public WifiParsedResult(String string2, String string3, String string4) {
        this(string2, string3, string4, false);
    }

    public WifiParsedResult(String string2, String string3, String string4, boolean bl2) {
        this(string2, string3, string4, bl2, null, null, null, null);
    }

    public WifiParsedResult(String string2, String string3, String string4, boolean bl2, String string5, String string6, String string7, String string8) {
        ParsedResultType parsedResultType = ParsedResultType.WIFI;
        super(parsedResultType);
        this.ssid = string3;
        this.networkEncryption = string2;
        this.password = string4;
        this.hidden = bl2;
        this.identity = string5;
        this.anonymousIdentity = string6;
        this.eapMethod = string7;
        this.phase2Method = string8;
    }

    public String getAnonymousIdentity() {
        return this.anonymousIdentity;
    }

    public String getDisplayResult() {
        StringBuilder stringBuilder = new StringBuilder(80);
        ParsedResult.maybeAppend(this.ssid, stringBuilder);
        ParsedResult.maybeAppend(this.networkEncryption, stringBuilder);
        ParsedResult.maybeAppend(this.password, stringBuilder);
        ParsedResult.maybeAppend(Boolean.toString(this.hidden), stringBuilder);
        return stringBuilder.toString();
    }

    public String getEapMethod() {
        return this.eapMethod;
    }

    public String getIdentity() {
        return this.identity;
    }

    public String getNetworkEncryption() {
        return this.networkEncryption;
    }

    public String getPassword() {
        return this.password;
    }

    public String getPhase2Method() {
        return this.phase2Method;
    }

    public String getSsid() {
        return this.ssid;
    }

    public boolean isHidden() {
        return this.hidden;
    }
}

