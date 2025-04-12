/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.net;

import com.google.common.base.MoreObjects;
import com.google.common.base.Preconditions;
import com.google.common.net.InetAddresses;
import java.net.Inet4Address;

public final class InetAddresses$TeredoInfo {
    private final Inet4Address client;
    private final int flags;
    private final int port;
    private final Inet4Address server;

    public InetAddresses$TeredoInfo(Inet4Address inet4Address, Inet4Address inet4Address2, int n3, int n4) {
        boolean bl2 = false;
        Inet4Address inet4Address3 = null;
        char c2 = (char)-1;
        boolean bl3 = n3 >= 0 && n3 <= c2;
        String string2 = "port '%s' is out of range (0 <= port <= 0xffff)";
        Preconditions.checkArgument(bl3, string2, n3);
        if (n4 >= 0 && n4 <= c2) {
            bl2 = true;
        }
        Preconditions.checkArgument(bl2, "flags '%s' is out of range (0 <= flags <= 0xffff)", n4);
        inet4Address3 = InetAddresses.access$000();
        this.server = inet4Address = (Inet4Address)MoreObjects.firstNonNull(inet4Address, inet4Address3);
        inet4Address = InetAddresses.access$000();
        this.client = inet4Address = (Inet4Address)MoreObjects.firstNonNull(inet4Address2, inet4Address);
        this.port = n3;
        this.flags = n4;
    }

    public Inet4Address getClient() {
        return this.client;
    }

    public int getFlags() {
        return this.flags;
    }

    public int getPort() {
        return this.port;
    }

    public Inet4Address getServer() {
        return this.server;
    }
}

