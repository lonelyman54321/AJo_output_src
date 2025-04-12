/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.ril.ajio.services.network.dnsresolver;

import android.content.Context;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.List;
import kotlin.collections.a;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

public final class DnsResolver
implements tr0_2 {
    private final rq1_2 configProvider$delegate;
    private final rq1_2 hostIP$delegate;
    private final rq1_2 hostname$delegate;

    public DnsResolver(Context object) {
        Intrinsics.checkNotNullParameter(object, "context");
        ur0_2 ur0_22 = new ur0_2(object, 0);
        object = yr1_2.b(ur0_22);
        this.configProvider$delegate = object;
        super(this, 0);
        object = yr1_2.b((Function0)object);
        this.hostname$delegate = object;
        super(this, 1);
        object = yr1_2.b((Function0)object);
        this.hostIP$delegate = object;
    }

    public static /* synthetic */ String a(DnsResolver dnsResolver) {
        return DnsResolver.hostname_delegate$lambda$1(dnsResolver);
    }

    public static /* synthetic */ String b(DnsResolver dnsResolver) {
        return DnsResolver.hostIP_delegate$lambda$2(dnsResolver);
    }

    public static /* synthetic */ B40 c(Context context) {
        return DnsResolver.configProvider_delegate$lambda$0(context);
    }

    private final boolean checkHostname(String string2) {
        String string3 = this.getHostname();
        return Intrinsics.areEqual(string2, string3);
    }

    private static final B40 configProvider_delegate$lambda$0(Context context) {
        Intrinsics.checkNotNullParameter(context, "$context");
        z40_0.Companion.getClass();
        return z40$a.a((Context)context).a;
    }

    private final B40 getConfigProvider() {
        return (B40)this.configProvider$delegate.getValue();
    }

    private final String getHostIP() {
        return (String)this.hostIP$delegate.getValue();
    }

    private final String getHostname() {
        return (String)this.hostname$delegate.getValue();
    }

    private final List handleException(String object) {
        boolean bl2 = this.checkHostname((String)object);
        if (bl2) {
            return a.b(InetAddress.getByName(this.getHostIP()));
        }
        object = new UnknownHostException();
        throw object;
    }

    private static final String hostIP_delegate$lambda$2(DnsResolver dnsResolver) {
        Intrinsics.checkNotNullParameter(dnsResolver, "this$0");
        return dnsResolver.getConfigProvider().b("dns_hostip");
    }

    private static final String hostname_delegate$lambda$1(DnsResolver dnsResolver) {
        Intrinsics.checkNotNullParameter(dnsResolver, "this$0");
        return dnsResolver.getConfigProvider().b("dns_hostname");
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public List lookup(String object) {
        Object[] objectArray = "hostname";
        Intrinsics.checkNotNullParameter(object, (String)objectArray);
        try {
            Intrinsics.checkNotNullParameter(object, (String)objectArray);
            try {
                objectArray = InetAddress.getAllByName((String)object);
                String object2 = "getAllByName(hostname)";
                Intrinsics.checkNotNullExpressionValue(objectArray, object2);
                return tp_2.M(objectArray);
            }
            catch (NullPointerException nullPointerException) {
                String string2 = "Broken system behaviour for dns lookup of ";
                CharSequence charSequence = new StringBuilder(string2);
                charSequence.append((String)object);
                charSequence = charSequence.toString();
                UnknownHostException unknownHostException = new UnknownHostException((String)charSequence);
                unknownHostException.initCause(nullPointerException);
                throw unknownHostException;
            }
        }
        catch (UnknownHostException unknownHostException) {}
        return this.handleException((String)object);
    }
}

