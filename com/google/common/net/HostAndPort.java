/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.net;

import com.google.common.base.CharMatcher;
import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import com.google.common.base.Strings;
import java.io.Serializable;

public final class HostAndPort
implements Serializable {
    private static final int NO_PORT = 255;
    private static final long serialVersionUID;
    private final boolean hasBracketlessColons;
    private final String host;
    private final int port;

    private HostAndPort(String string2, int n3, boolean bl2) {
        this.host = string2;
        this.port = n3;
        this.hasBracketlessColons = bl2;
    }

    public static HostAndPort fromHost(String string2) {
        HostAndPort hostAndPort = HostAndPort.fromString(string2);
        Preconditions.checkArgument(hostAndPort.hasPort() ^ true, "Host has a port: %s", (Object)string2);
        return hostAndPort;
    }

    public static HostAndPort fromParts(String object, int n3) {
        Preconditions.checkArgument(HostAndPort.isValidPort(n3), "Port out of range: %s", n3);
        HostAndPort hostAndPort = HostAndPort.fromString((String)object);
        Preconditions.checkArgument(hostAndPort.hasPort() ^ true, "Host has a port: %s", object);
        String string2 = hostAndPort.host;
        boolean bl2 = hostAndPort.hasBracketlessColons;
        object = new HostAndPort(string2, n3, bl2);
        return object;
    }

    /*
     * Unable to fully structure code
     */
    public static HostAndPort fromString(String var0) {
        Preconditions.checkNotNull(var0);
        var1_1 = "[";
        var2_2 = var0.startsWith((String)var1_1);
        var3_3 = -1;
        var4_4 = true;
        if (var2_2 != 0) {
            var1_1 = HostAndPort.getHostAndPortFromBracketedHost((String)var0);
            var5_5 = var1_1[0];
            var1_1 = var1_1[var4_4];
lbl11:
            // 2 sources

            while (true) {
                var6_8 = var5_5;
                var7_7 = 0;
                var5_5 = null;
                break;
            }
        } else {
            var2_2 = 58;
            var7_7 = var0.indexOf(var2_2);
            if (var7_7 >= 0 && (var2_2 = var0.indexOf(var2_2, var8_9 = var7_7 + 1)) == var3_3) {
                var5_5 = var0.substring(0, var7_7);
                var1_1 = var0.substring(var8_9);
                ** continue;
            }
            if (var7_7 >= 0) {
                var2_2 = 1;
            } else {
                var2_2 = 0;
                var1_1 = null;
            }
            var5_6 = null;
            var6_8 = var0;
            var7_7 = var2_2;
            var2_2 = 0;
            var1_1 = null;
        }
        var9_10 = Strings.isNullOrEmpty((String)var1_1);
        if (!var9_10) {
            var10_11 = "+";
            var3_3 = (int)var1_1.startsWith((String)var10_11);
            if (var3_3 != 0 || (var3_3 = (var10_11 = CharMatcher.ascii()).matchesAllOf((CharSequence)var1_1)) == 0) {
                var4_4 = false;
                var11_12 = null;
            }
            var10_11 = "Unparseable port number: %s";
            Preconditions.checkArgument(var4_4, (String)var10_11, var0);
            try {
                var3_3 = Integer.parseInt((String)var1_1);
            }
            catch (NumberFormatException v0) {
                var0 = "Unparseable port number: ".concat((String)var0);
                var1_1 = new IllegalArgumentException((String)var0);
                throw var1_1;
            }
            var2_2 = (int)HostAndPort.isValidPort(var3_3);
            var11_12 = "Port number out of range: %s";
            Preconditions.checkArgument((boolean)var2_2, var11_12, var0);
        }
        var0 = new HostAndPort(var6_8, var3_3, (boolean)var7_7);
        return var0;
    }

    private static String[] getHostAndPortFromBracketedHost(String string2) {
        String string3;
        int n3 = 0;
        int n4 = string2.charAt(0);
        int n7 = 91;
        int n8 = 1;
        if (n4 == n7) {
            n4 = 1;
        } else {
            n4 = 0;
            string3 = null;
        }
        String string4 = "Bracketed host-port string must start with a bracket: %s";
        Preconditions.checkArgument(n4 != 0, string4, (Object)string2);
        n4 = 58;
        n7 = string2.indexOf(n4);
        int n10 = string2.lastIndexOf(93);
        int n14 = -1;
        if (n7 > n14 && n10 > n7) {
            n7 = 1;
        } else {
            n7 = 0;
            string4 = null;
        }
        String string5 = "Invalid bracketed host/port: %s";
        Preconditions.checkArgument(n7 != 0, string5, (Object)string2);
        string4 = string2.substring(n8, n10);
        n14 = n10 + 1;
        int n15 = string2.length();
        if (n14 == n15) {
            return new String[]{string4, ""};
        }
        if ((n14 = (int)string2.charAt(n14)) == n4) {
            n3 = 1;
        }
        string3 = "Only a colon may follow a close bracket: %s";
        Preconditions.checkArgument(n3 != 0, string3, (Object)string2);
        for (n3 = n10 += 2; n3 < (n4 = string2.length()); ++n3) {
            n4 = (int)(Character.isDigit(string2.charAt(n3)) ? 1 : 0);
            String string6 = "Port must be numeric: %s";
            Preconditions.checkArgument(n4 != 0, string6, (Object)string2);
        }
        string2 = string2.substring(n10);
        return new String[]{string4, string2};
    }

    private static boolean isValidPort(int n3) {
        char c2;
        n3 = n3 >= 0 && n3 <= (c2 = (char)-1) ? 1 : 0;
        return n3 != 0;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        int n3 = object instanceof HostAndPort;
        if (n3 != 0) {
            int n4;
            object = (HostAndPort)object;
            String string2 = this.host;
            String string3 = ((HostAndPort)object).host;
            n3 = Objects.equal(string2, string3);
            if (n3 == 0 || (n3 = this.port) != (n4 = ((HostAndPort)object).port)) {
                bl2 = false;
            }
            return bl2;
        }
        return false;
    }

    public String getHost() {
        return this.host;
    }

    public int getPort() {
        Preconditions.checkState(this.hasPort());
        return this.port;
    }

    public int getPortOrDefault(int n3) {
        boolean bl2 = this.hasPort();
        if (bl2) {
            n3 = this.port;
        }
        return n3;
    }

    public boolean hasPort() {
        int n3 = this.port;
        n3 = n3 >= 0 ? 1 : 0;
        return n3 != 0;
    }

    public int hashCode() {
        String string2 = this.host;
        Integer n3 = this.port;
        Object[] objectArray = new Object[]{string2, n3};
        return Objects.hashCode(objectArray);
    }

    public HostAndPort requireBracketsForIPv6() {
        boolean bl2 = this.hasBracketlessColons ^ true;
        String string2 = this.host;
        Preconditions.checkArgument(bl2, "Possible bracketless IPv6 literal: %s", (Object)string2);
        return this;
    }

    public String toString() {
        int n3 = this.host.length() + 8;
        StringBuilder stringBuilder = new StringBuilder(n3);
        String string2 = this.host;
        char c2 = ':';
        n3 = string2.indexOf(c2);
        if (n3 >= 0) {
            stringBuilder.append('[');
            string2 = this.host;
            stringBuilder.append(string2);
            n3 = 93;
            stringBuilder.append((char)n3);
        } else {
            string2 = this.host;
            stringBuilder.append(string2);
        }
        n3 = (int)(this.hasPort() ? 1 : 0);
        if (n3 != 0) {
            stringBuilder.append(c2);
            n3 = this.port;
            stringBuilder.append(n3);
        }
        return stringBuilder.toString();
    }

    public HostAndPort withDefaultPort(int n3) {
        Preconditions.checkArgument(HostAndPort.isValidPort(n3));
        boolean bl2 = this.hasPort();
        if (bl2) {
            return this;
        }
        String string2 = this.host;
        boolean bl3 = this.hasBracketlessColons;
        HostAndPort hostAndPort = new HostAndPort(string2, n3, bl3);
        return hostAndPort;
    }
}

