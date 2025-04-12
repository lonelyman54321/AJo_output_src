/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.ril.ajio.data.repo;

import android.content.Context;
import com.ril.ajio.data.repo.RtbRepo;
import javax.inject.Provider;

public final class RtbRepo_Factory
implements nb2_2 {
    private final nb2_2 contextProvider;

    public RtbRepo_Factory(nb2_2 nb2_22) {
        this.contextProvider = nb2_22;
    }

    public static RtbRepo_Factory create(nb2_2 nb2_22) {
        RtbRepo_Factory rtbRepo_Factory = new RtbRepo_Factory(nb2_22);
        return rtbRepo_Factory;
    }

    public static RtbRepo_Factory create(Provider provider) {
        provider = ob2_2.a(provider);
        RtbRepo_Factory rtbRepo_Factory = new RtbRepo_Factory((nb2_2)provider);
        return rtbRepo_Factory;
    }

    public static RtbRepo newInstance(Context context) {
        RtbRepo rtbRepo = new RtbRepo(context);
        return rtbRepo;
    }

    public RtbRepo get() {
        return RtbRepo_Factory.newInstance((Context)this.contextProvider.get());
    }
}

