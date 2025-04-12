/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.ril.ajio.data.repo;

import android.content.Context;
import com.ril.ajio.data.repo.LoginRepository;
import javax.inject.Provider;

public final class LoginRepository_Factory
implements nb2_2 {
    private final nb2_2 contextProvider;

    public LoginRepository_Factory(nb2_2 nb2_22) {
        this.contextProvider = nb2_22;
    }

    public static LoginRepository_Factory create(nb2_2 nb2_22) {
        LoginRepository_Factory loginRepository_Factory = new LoginRepository_Factory(nb2_22);
        return loginRepository_Factory;
    }

    public static LoginRepository_Factory create(Provider provider) {
        provider = ob2_2.a(provider);
        LoginRepository_Factory loginRepository_Factory = new LoginRepository_Factory((nb2_2)provider);
        return loginRepository_Factory;
    }

    public static LoginRepository newInstance(Context context) {
        LoginRepository loginRepository = new LoginRepository(context);
        return loginRepository;
    }

    public LoginRepository get() {
        return LoginRepository_Factory.newInstance((Context)this.contextProvider.get());
    }
}

