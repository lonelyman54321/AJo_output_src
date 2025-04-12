/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.net;

import com.google.common.base.Preconditions;
import com.google.common.net.HostAndPort;
import com.google.common.net.InetAddresses;
import com.google.common.net.InternetDomainName;
import java.net.InetAddress;
import java.text.ParseException;

public final class HostSpecifier {
    private final String canonicalForm;

    private HostSpecifier(String string2) {
        this.canonicalForm = string2;
    }

    public static HostSpecifier from(String string2) {
        try {
            return HostSpecifier.fromValid(string2);
        }
        catch (IllegalArgumentException illegalArgumentException) {
            string2 = kp1_0.c("Invalid host specifier: ", string2);
            ParseException parseException = new ParseException(string2, 0);
            parseException.initCause(illegalArgumentException);
            throw parseException;
        }
    }

    public static HostSpecifier fromValid(String object) {
        Object object2;
        object = HostAndPort.fromString((String)object);
        boolean bl2 = ((HostAndPort)object).hasPort() ^ true;
        Preconditions.checkArgument(bl2);
        object = ((HostAndPort)object).getHost();
        try {
            object2 = InetAddresses.forString((String)object);
        }
        catch (IllegalArgumentException illegalArgumentException) {
            bl2 = false;
            object2 = null;
        }
        if (object2 != null) {
            object2 = InetAddresses.toUriString((InetAddress)object2);
            object = new HostSpecifier((String)object2);
            return object;
        }
        object2 = InternetDomainName.from((String)object);
        boolean bl3 = ((InternetDomainName)object2).hasPublicSuffix();
        if (bl3) {
            object2 = ((InternetDomainName)object2).toString();
            object = new HostSpecifier((String)object2);
            return object;
        }
        object = kp1_0.c("Domain name does not have a recognized public suffix: ", (String)object);
        object2 = new IllegalArgumentException((String)object);
        throw object2;
    }

    public static boolean isValid(String string2) {
        try {
            HostSpecifier.fromValid(string2);
            return true;
        }
        catch (IllegalArgumentException illegalArgumentException) {
            return false;
        }
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        boolean bl2 = object instanceof HostSpecifier;
        if (bl2) {
            object = (HostSpecifier)object;
            String string2 = this.canonicalForm;
            object = ((HostSpecifier)object).canonicalForm;
            return string2.equals(object);
        }
        return false;
    }

    public int hashCode() {
        return this.canonicalForm.hashCode();
    }

    public String toString() {
        return this.canonicalForm;
    }
}

